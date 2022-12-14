package com.digipay.usermanagement.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "UMPER")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "UMPID")
    private Long permissionID;
    @Column(name = "UMPTIT")
    private String permissionTitle;
    //
    public Long getPermissionID() {
        return permissionID;
    }
    public void setPermissionID(Long permissionID) {
        this.permissionID = permissionID;
    }

    public String getPermissionTitle() {
        return permissionTitle;
    }
    public void setPermissionTitle(String permissionTitle) {
        this.permissionTitle = permissionTitle;
    }
    //
    @Override
    public String toString() {
        return "ID=" + permissionID +
                ",  Title='" + permissionTitle + "\'\n";
    }
}
