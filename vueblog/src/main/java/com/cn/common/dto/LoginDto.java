package com.cn.common.dto;

/*
 *@program:LoginDto
 *@author: xu-hongtao
 *@Time: 2021/5/21  22:53
 */

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
/*数据传输对象（DTO)(Data Transfer Object)，是一种设计模式之间传输数据的软件应用系统*/
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

}
