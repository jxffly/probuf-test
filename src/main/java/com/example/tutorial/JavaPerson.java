package com.example.tutorial;

import java.io.Serializable;


/**
 * Created by jinxiaofei.
 * Time 2018/1/18 上午9:10
 * Desc 文件描述
 */
public class JavaPerson implements Serializable{
    private String name;
    private String email;
    private String id;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }
}
