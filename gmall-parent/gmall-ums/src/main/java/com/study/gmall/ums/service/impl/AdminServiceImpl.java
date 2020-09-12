package com.study.gmall.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.gmall.ums.entity.Admin;
import com.study.gmall.ums.mapper.AdminMapper;
import com.study.gmall.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    //@Autowired
    @Resource
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        // 1. 前端传过来的密码，加密成md5后跟后台数据库比较
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
        // 2. mybatisplus 构造查询条件
        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>().eq("username", username).eq("password", md5Password);
        // 3. 查询数据库
        Admin admin = adminMapper.selectOne(wrapper);
        return admin;
    }

    @Override
    public Admin getUserInfo(String userName) {
        return null;
    }
}
