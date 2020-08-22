package cn.wanli.ifauth.controller.restful;

import cn.wanli.ifauth.domain.Role;
import cn.wanli.ifauth.service.RoleService;
import cn.wanli.ifauth.vo.RoleUsersVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Resource
    private RoleService roleService;

    @GetMapping
    public List<Role> list() {
        return roleService.list();
    }

    @GetMapping("/users")
    public List<RoleUsersVo> roleUsers() {
        return roleService.roleUsers();
    }
}
