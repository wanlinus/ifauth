package cn.wanli.ifauth.domain;

import javax.persistence.*;

@Entity
@Table(name = "t_allow_ips")
public class AllowIps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String startIp;

    private Long startIpNumber;

    private String endIp;

    private Long endIpNumber;

    private String ipRangName;

    private String user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartIp() {
        return startIp;
    }

    public void setStartIp(String startIp) {
        this.startIp = startIp == null ? null : startIp.trim();
    }

    public Long getStartIpNumber() {
        return startIpNumber;
    }

    public void setStartIpNumber(Long startIpNumber) {
        this.startIpNumber = startIpNumber;
    }

    public String getEndIp() {
        return endIp;
    }

    public void setEndIp(String endIp) {
        this.endIp = endIp == null ? null : endIp.trim();
    }

    public Long getEndIpNumber() {
        return endIpNumber;
    }

    public void setEndIpNumber(Long endIpNumber) {
        this.endIpNumber = endIpNumber;
    }

    public String getIpRangName() {
        return ipRangName;
    }

    public void setIpRangName(String ipRangName) {
        this.ipRangName = ipRangName == null ? null : ipRangName.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}