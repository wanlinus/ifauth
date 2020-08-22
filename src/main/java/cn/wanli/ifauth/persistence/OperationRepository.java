package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
