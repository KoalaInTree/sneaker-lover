package com.djcao.boot.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2019-06-29
 */
@Entity
@Table(name = "user", schema = "boot", catalog = "")
public class UserEntity {
    private long id;
    private String openId;
    private String userName;
    private String passwd;
    private Short isVip;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "open_id", nullable = true, length = 80)
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 80)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "passwd", nullable = true, length = 255)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "is_vip", nullable = true)
    public Short getIsVip() {
        return isVip;
    }

    public void setIsVip(Short isVip) {
        this.isVip = isVip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        UserEntity that = (UserEntity)o;

        if (id != that.id) { return false; }
        if (openId != null ? !openId.equals(that.openId) : that.openId != null) { return false; }
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) { return false; }
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) { return false; }
        if (isVip != null ? !isVip.equals(that.isVip) : that.isVip != null) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(id ^ (id >>> 32));
        result = 31 * result + (openId != null ? openId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + (isVip != null ? isVip.hashCode() : 0);
        return result;
    }
}
