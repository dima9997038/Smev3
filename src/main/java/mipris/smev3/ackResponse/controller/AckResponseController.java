package mipris.smev3.ackResponse.controller;

import mipris.smev3.ackResponse.dto.ResponseMessageDto;
import mipris.smev3.ackResponse.dto.ResponseMessagePermitResourceDto;
import mipris.smev3.ackResponse.dto.ResponseMessageTelecomDto;
import mipris.smev3.ackResponse.dto.telecom.ResponseMessageTelecom;
import mipris.smev3.ackResponse.service.AckSendService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AckResponseController {
    private final AckSendService ackSendService;

    public AckResponseController(AckSendService ackSendService) {
        this.ackSendService = ackSendService;
    }

    @PostMapping("/ackResponse")
    public ResponseEntity<String> processResponse(@RequestBody ResponseMessageDto request) {
        ackSendService.writeToTableSend(request);
        return ResponseEntity.ok("Request processed successfully");
    }
    @PostMapping("/ackResponseTelecom")
    public ResponseEntity<String> processResponseTelecom(@RequestBody ResponseMessageTelecomDto request ) {
       ackSendService.writeToTableSendTelecom(request);
        return ResponseEntity.ok("Request processed successfully");
    }
    @PostMapping("/ackPermitResource")
    public ResponseEntity<String> processResponsePermitResource(@RequestBody ResponseMessagePermitResourceDto request ) {
        ackSendService.writeToTableSendPermitResource(request);
        return ResponseEntity.ok("Request processed successfully");
    }


}
