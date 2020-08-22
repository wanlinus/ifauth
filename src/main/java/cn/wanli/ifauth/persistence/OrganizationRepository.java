package cn.wanli.ifauth.persistence;

import cn.wanli.ifauth.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
