package com.djcao.boot.repository;
// Generated 2019-7-4 0:46:46 by Hibernate Tools 5.2.8.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReservationUser generated by hbm2java
 */
@Entity
@Table(name="reservation_user"
    ,catalog="sneakerlover"
)
public class ReservationUser  implements java.io.Serializable {


     private Long id;
     private Date createTime;
     private Date updateTime;
     private Long userId;
     private Long groupIdOrRegisterUserId;
     private Long reservationRegistrationId;

    public ReservationUser() {
    }

    public ReservationUser(Date createTime, Date updateTime, Long userId, Long groupIdOrRegisterUserId, Long reservationRegistrationId) {
       this.createTime = createTime;
       this.updateTime = updateTime;
       this.userId = userId;
       this.groupIdOrRegisterUserId = groupIdOrRegisterUserId;
       this.reservationRegistrationId = reservationRegistrationId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time", length=19)
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_time", length=19)
    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    
    @Column(name="user_id")
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    
    @Column(name="group_id_or_register_user_id")
    public Long getGroupIdOrRegisterUserId() {
        return this.groupIdOrRegisterUserId;
    }
    
    public void setGroupIdOrRegisterUserId(Long groupIdOrRegisterUserId) {
        this.groupIdOrRegisterUserId = groupIdOrRegisterUserId;
    }

    
    @Column(name="reservation_registration_id")
    public Long getReservationRegistrationId() {
        return this.reservationRegistrationId;
    }
    
    public void setReservationRegistrationId(Long reservationRegistrationId) {
        this.reservationRegistrationId = reservationRegistrationId;
    }




}

