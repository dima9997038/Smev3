package mipris.smev3.ackResponse.controller;

import mipris.smev3.ackResponse.dto.ResponseMessageDto;
import mipris.smev3.ackResponse.service.AckSendService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ackResponse")
public class AckResponseController {
    private final AckSendService ackSendService;

    public AckResponseController(AckSendService ackSendService) {
        this.ackSendService = ackSendService;
    }

    @PostMapping
    public ResponseEntity<String> processResponse(@RequestBody ResponseMessageDto request) {
        ackSendService.writeToTableSend(request);
        return ResponseEntity.ok("Request processed successfully");
    }
}
