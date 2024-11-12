package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.service.SensorGroupMappingService4;
import com.example.demo.model.DeviceLocationDTO;

@RestController
@RequestMapping("/api/device-locations")
public class SensorGroupMappingController4 {

    @Autowired
    private SensorGroupMappingService4 sensorGroupMappingService4;

    @GetMapping
    public List<DeviceLocationDTO> getDeviceLocations() {
        return sensorGroupMappingService4.getDeviceLocations();
    }
}
