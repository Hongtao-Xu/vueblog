package com.cn.service.impl;

import com.cn.entity.Blog;
import com.cn.mapper.BlogMapper;
import com.cn.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
