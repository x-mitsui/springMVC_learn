package com.dzq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/2 - 08 - 02 - 20:11
 * @Description: com.dzq.pojo
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pet implements Serializable {
    private String petName;
    private String petType;

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                '}';
    }
}
