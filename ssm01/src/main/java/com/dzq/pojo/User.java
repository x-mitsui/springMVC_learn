package com.dzq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/3 - 08 - 03 - 20:34
 * @Description: com.dzq.pojo
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private Integer uid;
    private String uname;
    private String password;
}
