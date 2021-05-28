package com.cn.shiro;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/*
 *@program:vueblog
 *@author: xu-hongtao
 *@Time: 2021/5/21  18:43
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}
