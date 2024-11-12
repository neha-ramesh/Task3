package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "device_onboard")
public class DeviceOnboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "createdat")
    private LocalDateTime createdat;
    @Column(name = "createdby")
    private String createdby;
    @Column(name = "isdeleted")
    private Boolean isdeleted;
    @Column(name = "updatedat")
    private LocalDateTime updatedat;
    @Column(name = "updatedby")
    private String updatedby;
    @Column(name = "customer_admin_name")
    private String customerAdminName;
    @Column(name = "device_id")
    private Long deviceId;
    @Column(name = "devicemake")
    private String devicemake;
    @Column(name = "devicemodel")
    private String devicemodel;
    @Column(name = "device_name")
    private String deviceName;
    @Column(name = "imeiwithdevicename")
    private String imeiWithDeviceName;
    @Column(name = "mapping_id")
    private Long mappingId;
    @Column(name = "status")
    private String status;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public LocalDateTime getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDateTime updatedat) {
        this.updatedat = updatedat;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    public String getCustomerAdminName() {
        return customerAdminName;
    }

    public void setCustomerAdminName(String customerAdminName) {
        this.customerAdminName = customerAdminName;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDevicemake() {
        return devicemake;
    }

    public void setDevicemake(String devicemake) {
        this.devicemake = devicemake;
    }

    public String getDevicemodel() {
        return devicemodel;
    }

    public void setDevicemodel(String devicemodel) {
        this.devicemodel = devicemodel;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getImeiWithDeviceName() {
        return imeiWithDeviceName;
    }

    public void setImeiWithDeviceName(String imeiWithDeviceName) {
        this.imeiWithDeviceName = imeiWithDeviceName;
    }

    public Long getMappingId() {
        return mappingId;
    }

    public void setMappingId(Long mappingId) {
        this.mappingId = mappingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
