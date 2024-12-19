package mipris.smev3.service;

import mipris.smev3.concentrator.modelClientSendRequest.FormData;
import mipris.smev3.concentrator.modelClientSendRequest.patternResourse.FormDataPatternBean;
import mipris.smev3.repository.SendRepository;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.UUID;

@Service
public class PatternService {
    private  final SendRepository sendRepository;

    public PatternService(SendRepository sendRepository) {
        this.sendRepository = sendRepository;
    }

    public String formDataToXML() {
        FormDataPatternBean formDataPatternBean=new FormDataPatternBean();
        FormData formData = formDataPatternBean.returnBean();
        StringWriter writer = new StringWriter();
        JAXBContext context = null;
        Marshaller m = null;
        try {
            context = JAXBContext.newInstance(FormData.class);
            m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            m.marshal(formData, writer);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        String xml = writer.toString();
        String patternRequestToDb = createPatternRequestToDb(xml);
        System.out.println(patternRequestToDb);
        sendRepository.sendRequestToDb(patternRequestToDb);

        return writer.toString();
    }

    public String createPatternRequestToDb(String xml) {
        UUID uuidClientId = UUID.randomUUID();
        String prefix="insert into public.mnemonic_send (\n" +
                "id,\n" +
                "content,\n" +
                "uid)\n" +
                "values (\n" +
                "'%s',\n" +
                "'<typ:ClientMessage xmlns:typ=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types\">\n" +
                "  <typ:itSystem>231b01</typ:itSystem>\n" +
                "  <typ:RequestMessage>\n" +
                "    <typ:messageType>REQUEST</typ:messageType>\n" +
                "    <typ:RequestMetadata>\n" +
                "      <typ:clientId>%s</typ:clientId>\n" +
                "    </typ:RequestMetadata>\n" +
                "    <typ:RequestContent>\n" +
                "      <typ:content>\n" +
                "        <typ:MessagePrimaryContent>" ;
        String formatPrefex = String.format(prefix, uuidClientId.toString(), uuidClientId.toString());
        Long maxId = sendRepository.findMaxId();
        String formatPostfix = String.format("       </typ:MessagePrimaryContent>\n" +
                "      </typ:content>\n" +
                "    </typ:RequestContent>\n" +
                "  </typ:RequestMessage>\n" +
                "</typ:ClientMessage>',\n" +
                "%d\n" +
                ");",maxId+1 );

        return formatPrefex+xml+formatPostfix;

    }

}
