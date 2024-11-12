package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.WarningReport;
import com.example.demo.model.WarningViolationCountDTO;

@Repository
public interface WarningReportRepository extends JpaRepository<WarningReport, Long> {

    @Query("SELECT COUNT(w) FROM WarningReport w WHERE w.customerAdminName = :customerAdminName")
    Long countWarningsByCustomerAdminName(String customerAdminName);
}