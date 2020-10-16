package com.micro.auth.service.impl;


import com.micro.auth.entity.SysUser;
import com.micro.auth.mapper.SysUserMapper;
import com.micro.auth.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserMapper.findByName(username);
        if (sysUser ==null) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        if (!sysUser.isEnabled()) {
            throw new DisabledException("账户已被禁用");
        } else if (!sysUser.isAccountNonLocked()) {
            throw new LockedException("账号已被锁定");
        } else if (!sysUser.isAccountNonExpired()) {
            throw new AccountExpiredException("账号已过期");
        } else if (!sysUser.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException("登录凭证已过期");
        }
        return sysUser;
    }
}
