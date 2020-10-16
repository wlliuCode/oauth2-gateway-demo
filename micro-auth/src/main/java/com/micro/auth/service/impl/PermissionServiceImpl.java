package com.micro.auth.service.impl;


import com.micro.auth.entity.SysPermission;
import com.micro.auth.mapper.SysPermissionMapper;
import com.micro.auth.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<SysPermission> findAllPermissionWithRoles() {
        return sysPermissionMapper.findAllPermissionWithRoles();
    }
}
