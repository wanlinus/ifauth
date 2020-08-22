package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.AllowIps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllowIpsRepository extends JpaRepository<AllowIps, Long> {
}
