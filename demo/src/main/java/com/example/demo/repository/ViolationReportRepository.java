package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.ViolationReport;
import com.example.demo.model.WarningViolationCountDTO;

@Repository
public interface ViolationReportRepository extends JpaRepository<ViolationReport, Long> {

    @Query("SELECT COUNT(v) FROM ViolationReport v WHERE v.customerAdminName = :customerAdminName")
    Long countViolationsByCustomerAdminName(String customerAdminName);
}