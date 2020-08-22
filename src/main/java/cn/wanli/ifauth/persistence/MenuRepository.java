package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
