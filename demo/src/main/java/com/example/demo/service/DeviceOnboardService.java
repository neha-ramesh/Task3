package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.DeviceOnboardRepository;

@Service
public class DeviceOnboardService {

    private final DeviceOnboardRepository deviceOnboardRepository;

    @Autowired
    public DeviceOnboardService(DeviceOnboardRepository deviceOnboardRepository) {
        this.deviceOnboardRepository = deviceOnboardRepository;
    }

    public Long getUniqueCustomerCountByAdmin(String casdoorUsername, String parentName, String userType, String status) {
        return deviceOnboardRepository.countUniqueCustomersByAdmin(casdoorUsername, parentName, userType, status);
    }
}
