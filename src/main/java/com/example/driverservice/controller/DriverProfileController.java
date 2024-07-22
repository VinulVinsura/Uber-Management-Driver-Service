package com.example.driverservice.controller;

import com.example.driverservice.dto.AuthenticationResponse;
import com.example.driverservice.dto.DriverDto;
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
    public ResponseEntity<AuthenticationResponse> registerDriver(@RequestBody DriverDto dto){
        AuthenticationResponse authenticationResponse = driverService.registerDriver(dto);
        return ResponseEntity.ok(authenticationResponse);
    }



}
