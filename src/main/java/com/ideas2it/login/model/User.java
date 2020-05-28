package com.ideas2it.login.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ideas2it.login.common.Constants;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@Table(name = Constants.USER)
@Entity
public class User {

    @Id
    @Column(name = Constants.ID)
    private Long id;

    @Column(name = Constants.CREATED_AT, columnDefinition="TIMESTAMP", nullable = false, updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = Constants.MODIFIED_AT, columnDefinition="TIMESTAMP")
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @Column(name = Constants.CREATED_BY)
    private Long createdBy;

    @Column(name = Constants.MODIFIED_BY)
    private Long modifiedBy;

    @Column(name = Constants.NAME)
    private String name;

    @Column(name = Constants.USERNAME)
    private String userName;

    @Column(name = Constants.EMAIL)
    private String email;

    @XmlTransient
    @JsonIgnore
    @Column(name = Constants.PASSWORD)
    private String password;

    @Column(name = Constants.GENDER)
    private String gender;

    @Column(name = Constants.IS_ACTIVE)
    private boolean isActive;

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Long getId() {
        return id;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
