package com.driver.model;

import org.hibernate.annotations.Generated;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;

import javax.persistence.*;

@Entity
@Table
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    private String username;
    private String password;

    public Admin(Integer adminId, String userName, String passWord) {
        this.adminId = adminId;
        this.username = userName;
        this.password = passWord;
    }

    public Admin(String userName, String passWord) {
        this.username = userName;
        this.password = passWord;
    }

    public Admin() {
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passWord) {
        this.password = passWord;
    }


}
