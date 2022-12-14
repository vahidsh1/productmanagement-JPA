package com.digipay.usermanagement.model.entity;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import java.util.Set;

@Entity
@Table(name = "UMROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "UMRID")
    private Long roleID;
    @Column(name = "UMRTIT")
    private String roleTitle;
    //
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "UMPERROL", joinColumns =
            {@JoinColumn(name = "UMRID")}
            , inverseJoinColumns = {@JoinColumn(referencedColumnName = "UMPID")})
    private Set<Permission> permissions;
    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
    //
    public Long getRoleID() {
        return roleID;
    }
    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public String getRoleTitle() {
        return roleTitle;
    }
    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }
    //
    @Override
    public String toString() {
        return  "ID=" + roleID +
                ", Title='" + roleTitle + "\'\n";
    }
}
