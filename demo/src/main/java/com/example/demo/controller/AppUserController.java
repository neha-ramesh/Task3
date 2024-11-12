package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.AppUserService;

@RestController
@RequestMapping("/api/users")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/count")
    public String getCustomerCounts(@RequestParam String parentName) {
        long totalCustomers = appUserService.getTotalCustomersByParent(parentName);
        long activeCustomers = appUserService.getActiveCustomersByParent(parentName);
        long inactiveCustomers = appUserService.getInactiveCustomersByParent(parentName);

        return "Total Customers: " + totalCustomers +
               ", Active Customers: " + activeCustomers +
               ", Inactive Customers: " + inactiveCustomers;
    }
}
