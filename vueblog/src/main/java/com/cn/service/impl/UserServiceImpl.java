package com.cn.service.impl;

import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import com.cn.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuhongtao
 * @since 2021-05-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
