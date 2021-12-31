package com.jessin.practice.dubbo.model;

import java.io.Serializable;

/**
 * @Author: jessin
 * @Date: 2021/12/31 5:04 下午
 */
public class Result<T> implements Serializable {

    private int code;
    private String errorMsg;
    T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
