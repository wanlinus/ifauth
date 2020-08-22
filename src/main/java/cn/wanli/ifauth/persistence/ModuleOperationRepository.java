package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.ModuleOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleOperationRepository extends JpaRepository<ModuleOperation, Long> {
}
