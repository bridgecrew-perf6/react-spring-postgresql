package com.teameleven.reactspringpostgresql.serviceimpl;

import com.teameleven.reactspringpostgresql.dto.email.EmailDto;
import com.teameleven.reactspringpostgresql.service.EmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    private final JavaMailSender javaMailSender;

    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(EmailDto emailDto) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(emailDto.getReceiverEmailAddress());
        msg.setSubject(emailDto.getSubject());
        msg.setText(emailDto.getText());
        javaMailSender.send(msg);
    }
}
