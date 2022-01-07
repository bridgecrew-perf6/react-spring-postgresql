package com.teameleven.reactspringpostgresql.service;

import com.teameleven.reactspringpostgresql.dto.email.EmailDto;

public interface EmailService {
    void sendEmail(EmailDto emailDto);
}
