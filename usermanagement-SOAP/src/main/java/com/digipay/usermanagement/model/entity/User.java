package com.digipay.usermanagement.model.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "UMUSER")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "UMUID")
    private Long userID;
    @Column(name = "UMUNAM")
    private String username;
    @Column(name = "UMUNID")
    private String nationalID;
    //
    @ManyToOne
    @JoinColumn(name = "UMURID")
    private Role role;


    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    //
    public Long getUserID() {
        return userID;
    }
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNationalID() {
        return nationalID;
    }
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
    @Override
    public String toString() {
        return "userID=" + userID +
                ", username='" + username + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", role=" + role ;
    }
}
