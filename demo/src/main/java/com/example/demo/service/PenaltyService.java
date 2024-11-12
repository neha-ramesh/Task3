package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PenaltyRepository;

@Service
public class PenaltyService {

    @Autowired
    private PenaltyRepository penaltyRepository;

    public Object[] getTotalAmountReceivedAndPending(String parentName) {
        return penaltyRepository.calculateTotalAmountReceivedAndPending(parentName);
    }
}
