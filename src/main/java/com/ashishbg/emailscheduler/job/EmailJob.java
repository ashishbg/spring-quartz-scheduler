package com.ashishbg.emailscheduler.job;

import com.ashishbg.emailscheduler.model.Email;
import com.ashishbg.emailscheduler.service.EmailSenderService;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class EmailJob extends QuartzJobBean {

    @Autowired
    private EmailSenderService emailSenderService;

    @Autowired
    private MailProperties mailProperties;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getMergedJobDataMap();
        String subject = jobDataMap.getString("subject");
        String emailId = jobDataMap.getString("email");
        String body = jobDataMap.getString("body");

        Email email = new Email(emailId,"ashishbg.g@gmail.com",subject,body);
        emailSenderService.sendSimpleEmail(email);
    }
}
