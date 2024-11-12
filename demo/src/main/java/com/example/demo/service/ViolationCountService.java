package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ViolationCountRepository;
import com.example.demo.model.ViolationCountDTO;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ViolationCountService {

    @Autowired
    private ViolationCountRepository violationCountRepository;

    public List<ViolationCountDTO> getViolationCountByCustomerWithinDateRange(
            LocalDateTime startDate, LocalDateTime endDate, String customerAdminName, String customerName) {
        return violationCountRepository.findViolationCountByCustomerWithinDateRange(startDate, endDate, customerAdminName, customerName);
    }
}
