package com.puji.spring.lifecycle.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("..Inside setting id method..");
        this.id = id;
    }

    @PostConstruct
    public void hi() {
        System.out.println("..Inside hi method--");
    }

   @PreDestroy
    public void bye() {
        System.out.println("...Inside bye method..");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

}
