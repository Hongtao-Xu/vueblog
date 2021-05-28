package com.cn.controller;


import com.cn.common.lang.Result;
import com.cn.entity.User;
import com.cn.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuhongtao
 * @since 2021-05-20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("项目启动测试接口")
    //@RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1l);
        return Result.succ(200, "操作成功", user);
    }

    @ApiOperation("异常处理测试接口")
    @PostMapping("/save")//@Validated校验数据，如果数据异常则会统一抛出异常，方便异常中心统一处理。
    public Result save(@Validated @RequestBody @ApiParam("实体类参数") User user){
        return Result.succ(user);
    }

}
