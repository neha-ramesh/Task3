package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.SensorGroupMappingRepository4;
import com.example.demo.model.DeviceLocationDTO;

@Service
public class SensorGroupMappingService4 {

    @Autowired
    private SensorGroupMappingRepository4 sensorGroupMappingRepository4;

    public List<DeviceLocationDTO> getDeviceLocations() {
        return sensorGroupMappingRepository4.findDeviceLocations();
    }
}
