package com.bobocode.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component // todo: replace @Component with @Configuration and it will print "true" to the console
public class PrintService {

    @Autowired
    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }
}
