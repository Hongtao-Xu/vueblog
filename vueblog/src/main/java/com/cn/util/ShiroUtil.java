package com.cn.util;

import com.cn.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/*
 *@program:ShiroUtil
 *@author: xu-hongtao
 *@Time: 2021/5/22  9:31
 */
public class ShiroUtil {
    /**
     * 获得登录用户的信息
     * @return
     */
    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
