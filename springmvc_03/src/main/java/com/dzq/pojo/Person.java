package com.dzq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/2 - 08 - 02 - 19:35
 * @Description: com.dzq.pojo
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private String pname;
    private Integer page;
    private Integer gender;
    private String[] hobby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthdate;
    private List<Pet> pets;


    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", page=" + page +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                ", birthdate='" + birthdate + '\'' +
                ", pets=" + pets +
                '}';
    }
}
