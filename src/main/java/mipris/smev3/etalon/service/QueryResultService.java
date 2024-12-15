package mipris.smev3.etalon.service;

import mipris.smev3.etalon.modelFormDanaXmlToObject.QueryResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class QueryResultService {
    @Value("${uriBase}")
    private String uriBase;
//    static final String uriBase = "http://localhost:8081/query";

    public void sendToBack(QueryResult queryResult) {

        RestClient restClient = RestClient.builder()
                .defaultHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        restClient.post()
                .uri(uriBase )
                .contentType(APPLICATION_JSON)
                .body(queryResult)
                .retrieve()
                .toBodilessEntity();


    }


}
