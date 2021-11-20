package com.jessin.practice.dubbo.model;

import java.io.Serializable;

/**
 * @Author: jessin
 * @Date: 19-12-1 下午5:47
 */
public class UserParam implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

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
}
