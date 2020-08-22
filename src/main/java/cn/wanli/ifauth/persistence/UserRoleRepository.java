package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByRoleId(Long roleId);
}
