package com.example.driverservice.controller;

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
    public ResponseEntity<DriverDto> registerDriver(@RequestBody DriverDto dto){
        DriverDto driverDto = driverService.registerDriver(dto);
        return ResponseEntity.ok(driverDto);
    }



}
