package cn.wanli.ifauth.service;

import cn.wanli.ifauth.domain.Role;
import cn.wanli.ifauth.vo.RoleUsersVo;

import java.util.List;

public interface RoleService {

    List<Role> list();
    
    List<RoleUsersVo> roleUsers();
}
