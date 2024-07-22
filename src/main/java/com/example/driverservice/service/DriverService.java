package com.example.driverservice.service;

import com.example.driverservice.dto.AuthenticationResponse;
import com.example.driverservice.dto.DriverDto;

public interface DriverService {

    AuthenticationResponse registerDriver(DriverDto dto);
}

