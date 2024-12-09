package mipris.smev3.etalon.controller;

import mipris.smev3.etalon.model.*;
import mipris.smev3.etalon.service.PatternService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@RestController
@RequestMapping("api/v1/pattern")
public class PatternController {
    private final PatternService patternService;

    public PatternController(PatternService patternService) {
        this.patternService = patternService;
    }

    @GetMapping("/send")
    public void send() throws JAXBException {
        patternService.formDataToXML();

    }
}
