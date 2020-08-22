package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.RoleModulePermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleModulePermissionRepository extends JpaRepository<RoleModulePermission, Long> {
}
