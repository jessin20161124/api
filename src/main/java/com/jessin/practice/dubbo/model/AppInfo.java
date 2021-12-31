package com.jessin.practice.dubbo.model;

import java.io.Serializable;

/**
 * @Author: jessin
 * @Date: 2021/12/31 5:06 下午
 */
public class AppInfo<T> implements Serializable {
    private int appId;
    private String appName;
    private T detail;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }
}
