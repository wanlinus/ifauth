package cn.wanli.ifauth.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_role_module_permission")
public class RoleModulePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long roleId;

    private Long moduleId;

    private Date createTime;

    private Date updateTime;

    private String menuRightTypes;

    private String operationRightTypes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMenuRightTypes() {
        return menuRightTypes;
    }

    public void setMenuRightTypes(String menuRightTypes) {
        this.menuRightTypes = menuRightTypes;
    }

    public String getOperationRightTypes() {
        return operationRightTypes;
    }

    public void setOperationRightTypes(String operationRightTypes) {
        this.operationRightTypes = operationRightTypes;
    }
}