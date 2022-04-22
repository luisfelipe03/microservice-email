package com.ms.email.services;

import com.ms.email.repositories.EmailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    public EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    
}
