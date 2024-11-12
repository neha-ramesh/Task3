package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "penalties")
public class Penalties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "penaltyid")
    private Long penaltyId;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "description")
    private String description;
    @Column(name = "due_date")
    private LocalDate dueDate;
    @Column(name = "issue_date")
    private LocalDate issueDate;
    @Column(name = "paid_date")
    private LocalDate paidDate;
    @Column(name = "paid_status")
    private String paidStatus;
    @Column(name = "penalty_percentage")
    private Double penaltyPercentage;
    @Column(name = "previous_amount")
    private Double previousAmount;
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "fine_id")
    private Long fineId;
    @Column(name = "is_paid")
    private Boolean isPaid;

    // Getters and Setters
    public Long getPenaltyId() { return penaltyId; }
    public void setPenaltyId(Long penaltyId) { this.penaltyId = penaltyId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public LocalDate getPaidDate() { return paidDate; }
    public void setPaidDate(LocalDate paidDate) { this.paidDate = paidDate; }

    public String getPaidStatus() { return paidStatus; }
    public void setPaidStatus(String paidStatus) { this.paidStatus = paidStatus; }

    public Double getPenaltyPercentage() { return penaltyPercentage; }
    public void setPenaltyPercentage(Double penaltyPercentage) { this.penaltyPercentage = penaltyPercentage; }

    public Double getPreviousAmount() { return previousAmount; }
    public void setPreviousAmount(Double previousAmount) { this.previousAmount = previousAmount; }

    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }

    public Long getFineId() { return fineId; }
    public void setFineId(Long fineId) { this.fineId = fineId; }

    public Boolean getIsPaid() { return isPaid; }
    public void setIsPaid(Boolean isPaid) { this.isPaid = isPaid; }
}
