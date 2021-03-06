package com.jessin.practice.dubbo.model;

/**
 * @Author: jessin
 * @Date: 19-11-24 上午11:23
 */
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable  {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Byte sex;

    private Integer age;

    private String note;

    private Date createTime;

    private Date lastModifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", note='" + note + '\'' +
                ", createTime=" + createTime +
                ", lastModifiedTime=" + lastModifiedTime +
                '}';
    }
}