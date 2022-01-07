package com.teameleven.reactspringpostgresql.controller;

import com.teameleven.reactspringpostgresql.dto.email.EmailDto;
import com.teameleven.reactspringpostgresql.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping(path = "send", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> send(@RequestBody EmailDto emailDto) {
        this.emailService.sendEmail(emailDto);
        return new ResponseEntity<>("Email sent successfully.", HttpStatus.OK);
    }

}
