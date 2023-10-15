package com.ashishbg.emailscheduler.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email {
    String to;
    String from;
    String subject;
    String text;

    public Email(String to, String from, String subject, String text) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.text = text;
    }

    public Email() {
    }
}
