package com.dzq.pojo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/2 - 08 - 02 - 19:35
 * @Description: com.dzq.pojo
 * @version: 1.0
 */
public class Person implements Serializable {
    private String pname;
    private Integer page;
    private Integer gender;
    private String[] hobby;
    private String birthdate;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", page=" + page +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    public Person(String pname, Integer page, Integer gender, String[] hobby, String birthdate) {
        this.pname = pname;
        this.page = page;
        this.gender = gender;
        this.hobby = hobby;
        this.birthdate = birthdate;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
