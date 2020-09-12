package com.study.gmall.ums.service;

import com.study.gmall.ums.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
public interface AdminService extends IService<Admin> {
    Admin login(String username, String password);

    Admin getUserInfo(String userName);
}
