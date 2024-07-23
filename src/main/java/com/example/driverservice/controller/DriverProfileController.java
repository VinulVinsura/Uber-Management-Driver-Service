package com.example.driverservice.controller;

import com.example.driverservice.dto.AuthenticationResponse;
import com.example.driverservice.dto.DriverDto;
import com.example.driverservice.dto.LoginDetailsDto;
import com.example.driverservice.dto.SupportTicket;
import com.example.driverservice.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class DriverProfileController {
    private final DriverService driverService;


    @PostMapping("/drivers/register")
    //  Register a new driver.
    public ResponseEntity<AuthenticationResponse> registerDriver(@RequestBody DriverDto dto){
        AuthenticationResponse authenticationResponse = driverService.registerDriver(dto);
        return ResponseEntity.ok(authenticationResponse);
    }

    @PostMapping("/drivers/login")
    // Authenticate and login a driver
    public ResponseEntity<AuthenticationResponse> loginDriver(@RequestBody LoginDetailsDto loginDetailsDto){
        AuthenticationResponse response = driverService.loginDriver(loginDetailsDto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/drivers/profile/{driverId}")
    //  Retrieve the driver's profile details.
    public ResponseEntity<DriverDto> getUserDetails(@PathVariable Integer driverId){
        DriverDto driverDto = driverService.getDriverDetails(driverId);
        if (driverDto==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(driverDto);
    }

    @PostMapping("/drivers/support/ticket")

    public ResponseEntity<SupportTicket> addSupportTicket(@RequestBody SupportTicket supportTicket){
        SupportTicket ticket = driverService.addSupportTicket(supportTicket);
        return ResponseEntity.ok(ticket);

    }




}
