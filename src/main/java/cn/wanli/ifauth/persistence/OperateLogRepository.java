package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.OperateLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperateLogRepository extends JpaRepository<OperateLog, Long> {
}
