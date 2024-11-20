package com.pujitha.spring.spEL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inst")
@Scope("prototype")
public class Instructor {
    //    @Value("#{10+11}")
    //static method
//    @Value("#{T(java.lang.Math).abs(-99)}")
    //Object
//    @Value(("#{new Integer(183)}"))
    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    private int id;
    //    @Value("Pujitha")
//    @Value("#{'Pujitha'}")
    @Value("#{'Pujitha'.toUpperCase()}")

    private String name;

    @Value("#{2+7>5}")
    private boolean active;
    @Value(("#{topics}"))
    private List<String> topics;

    @Autowired
    private Profile profile;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }
}

