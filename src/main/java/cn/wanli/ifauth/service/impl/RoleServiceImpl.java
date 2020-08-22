package cn.wanli.ifauth.service.impl;

import cn.wanli.ifauth.domain.Role;
import cn.wanli.ifauth.domain.User;
import cn.wanli.ifauth.domain.UserRole;
import cn.wanli.ifauth.persistence.RoleRepository;
import cn.wanli.ifauth.persistence.UserRepository;
import cn.wanli.ifauth.persistence.UserRoleRepository;
import cn.wanli.ifauth.service.RoleService;
import cn.wanli.ifauth.vo.RoleUsersVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleRepository roleRepository;
    @Resource
    private UserRoleRepository userRoleRepository;
    @Resource
    private UserRepository userRepository;

    @Override
    public List<Role> list() {
        return roleRepository.findAll();
    }

    @Override
    public List<RoleUsersVo> roleUsers() {
        List<Role> allRoles = roleRepository.findAll();
        List<UserRole> allUserRole = userRoleRepository.findAll();
        List<User> allUsers = userRepository.findAll();

        Map<Long, List<UserRole>> roleIdUserRole = allUserRole.stream().collect(Collectors.groupingBy(UserRole::getRoleId));


        // 数据量不大, 直接多重循环
        return allRoles.stream().map(role -> {
            List<User> collect = userRoleRepository.findByRoleId(role.getId()).stream()
                    .map(userRole -> userRepository.findById(userRole.getUserId()).orElse(null))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            return new RoleUsersVo(role, collect);
        }).collect(Collectors.toList());
    }
}
