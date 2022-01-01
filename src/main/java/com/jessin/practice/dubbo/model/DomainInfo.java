package com.jessin.practice.dubbo.model;

import java.io.Serializable;

/**
 * @Author: jessin
 * @Date: 2022/1/1 1:23 下午
 */
public class DomainInfo implements Serializable {

    private String name;
    private String desc;
    private int sourceType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }
}
