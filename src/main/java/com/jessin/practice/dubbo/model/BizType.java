package com.jessin.practice.dubbo.model;

/**
 * @Author: jessin
 * @Date: 2021/12/31 5:13 下午
 */
public enum BizType {
    NATIONAL(1, "国内"), FLAGSHIP(2, "旗舰店"), INTERNATIONAL(3, "国际");
    private int code;
    private String desc;
    BizType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
