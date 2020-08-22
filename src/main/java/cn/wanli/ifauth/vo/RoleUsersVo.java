package cn.wanli.ifauth.vo;

import cn.wanli.ifauth.domain.Role;
import cn.wanli.ifauth.domain.User;

import java.util.List;

public class RoleUsersVo {
    private Role role;
    private List<User> users;

    public RoleUsersVo() {
    }

    public RoleUsersVo(Role role, List<User> users) {
        this.role = role;
        this.users = users;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
