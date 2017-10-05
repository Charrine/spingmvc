package com.five6.connect.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.sql.Timestamp;

@Document(collection = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String name;
    private String password;
    private String head;
    private String sex;
    private Timestamp birthday;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public String getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
