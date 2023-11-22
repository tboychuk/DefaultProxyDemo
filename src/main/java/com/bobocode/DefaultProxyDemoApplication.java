package com.bobocode;

import com.bobocode.component.HelloService;
import com.bobocode.component.PrintService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DefaultProxyDemoApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(DefaultProxyDemoApplication.class, args);
        var helloService = context.getBean(HelloService.class);
        var printService = context.getBean(PrintService.class);
        System.out.println(helloService.messageService() == printService.getMessageService());
    }

}
