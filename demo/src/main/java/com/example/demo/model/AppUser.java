package com.example.demo.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "deleted_at")
    private Date deletedAt;
    @Column(name = "deleted_by")
    private String deletedBy;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "last_modified_at")
    private Date lastModifiedAt;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "casdoor_email")
    private String casdoorEmail;
    @Column(name = "casdoor_mobile_number")
    private String casdoorMobileNumber;
    @Column(name = "casdoor_password")
    private String casdoorPassword;
    @Column(name = "casdoor_user_unique_id")
    private String casdoorUserUniqueId;
    @Column(name = "casdoor_username")
    private String casdoorUsername;
    @Column(name = "currency")
    private String currency;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_blocked")
    private Boolean isBlocked;
    @Column(name = "organization_name")
    private String organizationName;
    @Column(name = "status")
    private String status;
    @Column(name = "timezone")
    private String timezone;
    @Column(name = "parent_name")
    private String parentName;

    // Getters and Setters
    // Add getter and setter methods for each field here

    // Example
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    public Boolean getisActive(){
        return isActive;
    }

    public void setisActive(Boolean isActive){
        this.isActive = isActive;
    }

    public Boolean getisBlocked(){
        return isBlocked;
    }

    public void setisBlocked(Boolean isActive){
        this.isBlocked = isBlocked;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

}
