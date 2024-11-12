package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.WarningCountRepository;
import com.example.demo.model.WarningCountDTO;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WarningCountService {

    @Autowired
    private WarningCountRepository warningCountRepository;

    public List<WarningCountDTO> getWarningCountByCustomerWithinDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return warningCountRepository.findWarningCountByCustomerWithinDateRange(startDate, endDate);
    }
}
