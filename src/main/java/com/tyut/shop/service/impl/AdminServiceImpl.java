package com.tyut.shop.service.impl;

import com.tyut.shop.dao.AdminMapper;
import com.tyut.shop.pojo.Admin;
import com.tyut.shop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wwwglin@163.com on 2017/11/19.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    private AdminMapper adminMapper;

    @Override
    public Admin selectByName(Admin admin) {
        return adminMapper.selectByName(admin);
    }
}