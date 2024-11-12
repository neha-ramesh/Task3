package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.SensorGroupMappingRepository;

@Service
public class SensorGroupMappingService {

    private final SensorGroupMappingRepository sensorGroupMappingRepository;

    @Autowired
    public SensorGroupMappingService(SensorGroupMappingRepository sensorGroupMappingRepository) {
        this.sensorGroupMappingRepository = sensorGroupMappingRepository;
    }

    public Long countDevicesByCriteria(String createdBy, String username, String parentName) {
        return sensorGroupMappingRepository.countDevicesByCriteria(createdBy, username, parentName);
    }
}
