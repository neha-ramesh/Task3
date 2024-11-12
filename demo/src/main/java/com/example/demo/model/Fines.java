package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "fines")
public class Fines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "fine_id")
    private Long fineId;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "description")
    private String description;
    @Column(name = "device_id")
    private Long deviceId;
    @Column(name = "due_date")
    private LocalDate dueDate;
    @Column(name = "fine_code")
    private String fineCode;
    @Column(name = "is_paid")
    private Boolean isPaid;
    @Column(name = "issue_date")
    private LocalDate issueDate;
    @Column(name = "paid_date")
    private LocalDate paidDate;
    @Column(name = "paid_status")
    private String paidStatus;
    @Column(name = "sensor_name")
    private String sensorName;
    @Column(name = "violation_code")
    private String violationCode;
    @Column(name = "violation_id")
    private Long violationId;
    @Column(name = "parent_name")
    private String parentName;

    // Getters and Setters
    public Long getFineId() { return fineId; }
    public void setFineId(Long fineId) { this.fineId = fineId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getDeviceId() { return deviceId; }
    public void setDeviceId(Long deviceId) { this.deviceId = deviceId; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String getFineCode() { return fineCode; }
    public void setFineCode(String fineCode) { this.fineCode = fineCode; }

    public Boolean getIsPaid() { return isPaid; }
    public void setIsPaid(Boolean isPaid) { this.isPaid = isPaid; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public LocalDate getPaidDate() { return paidDate; }
    public void setPaidDate(LocalDate paidDate) { this.paidDate = paidDate; }

    public String getPaidStatus() { return paidStatus; }
    public void setPaidStatus(String paidStatus) { this.paidStatus = paidStatus; }

    public String getSensorName() { return sensorName; }
    public void setSensorName(String sensorName) { this.sensorName = sensorName; }

    public String getViolationCode() { return violationCode; }
    public void setViolationCode(String violationCode) { this.violationCode = violationCode; }

    public Long getViolationId() { return violationId; }
    public void setViolationId(Long violationId) { this.violationId = violationId; }

    public String getParentName() { return parentName; }
    public void setParentName(String parentName) { this.parentName = parentName; }
}
