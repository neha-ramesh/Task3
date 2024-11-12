package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sensor_group")
public class SensorGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "sensor_group_id")
    private Long sensorGroupId;
    @Column(name = "createdat")
    private LocalDateTime createdAt;
    @Column(name = "createdby")
    private String createdBy;
    @Column(name = "isdeleted")
    private Boolean isDeleted;
    @Column(name = "updatedat")
    private LocalDateTime updatedAt;
    @Column(name = "updatedby")
    private String updatedBy;
    @Column(name = "sensor_group_name")
    private String sensorGroupName;
    @Column(name = "sensor_type_id")
    private Long sensorTypeId;

    // Getters and Setters

    public Long getSensorGroupId() {
        return sensorGroupId;
    }

    public void setSensorGroupId(Long sensorGroupId) {
        this.sensorGroupId = sensorGroupId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getSensorGroupName() {
        return sensorGroupName;
    }

    public void setSensorGroupName(String sensorGroupName) {
        this.sensorGroupName = sensorGroupName;
    }

    public Long getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(Long sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }
}
