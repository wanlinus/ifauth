package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
