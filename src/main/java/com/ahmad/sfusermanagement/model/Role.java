package com.ahmad.sfusermanagement.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Role extends BaseEntity {

    private String role;

    @OneToOne(mappedBy = "role")
    private Users user;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
