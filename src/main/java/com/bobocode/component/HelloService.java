package com.bobocode.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public void hello() {
        var message = messageService().getMessage();
        System.out.println(message);
    }

    @Bean
    public MessageService messageService() {
        return new MessageService();
    }
}
