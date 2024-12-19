package mipris.smev3.service;

import mipris.smev3.concentrator.modelFormDanaXmlToObject.QueryResult;
import mipris.smev3.telecom.model.ClientMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class RestClientService {
    @Value("${uriBase}")
    private String uriBase;
//    static final String uriBase = "http://localhost:8081/query";

    public void sendToBack(QueryResult queryResult) {

        RestClient restClient = RestClient.builder()
                .defaultHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        restClient.post()
                .uri(uriBase + "/query")
                .contentType(APPLICATION_JSON)
                .body(queryResult)
                .retrieve()
                .toBodilessEntity();


    }

    public void sendToBackTelecomRequest(ClientMessage clientMessage) {

        RestClient restClient = RestClient.builder()
                .defaultHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        restClient.post()
                .uri(uriBase+"/telecom" )
                .contentType(APPLICATION_JSON)
                .body(clientMessage)
                .retrieve()
                .toBodilessEntity();


    }


}
