package com;

import com.model.Attr;
import com.service.Serv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
//        ApplicationContext context = SpringApplication.run(App.class, args);
//        Serv serv = context.getBean(Serv.class);
//        List<Attr> list = serv.getRepo().getProfileList();
//        System.out.println(list);
    }

}
