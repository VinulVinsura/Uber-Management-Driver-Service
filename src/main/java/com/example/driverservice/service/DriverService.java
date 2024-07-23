package com.example.driverservice.service;

import com.example.driverservice.dto.AuthenticationResponse;
import com.example.driverservice.dto.DriverDto;
import com.example.driverservice.dto.LoginDetailsDto;

public interface DriverService {

    AuthenticationResponse registerDriver(DriverDto dto);
    AuthenticationResponse loginDriver(LoginDetailsDto loginDetailsDto);
    DriverDto getDriverDetails(Integer driverId);
}

