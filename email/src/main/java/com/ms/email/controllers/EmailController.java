package com.ms.email.controllers;

import java.util.List;

import javax.validation.Valid;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;
import com.ms.email.services.EmailService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {
    
    @Autowired
    EmailService emailService;

    @Autowired
    EmailRepository emailRepository;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }

    @GetMapping
    public List<EmailModel> listar() {
        return emailRepository.findAll();
    }
    

}
