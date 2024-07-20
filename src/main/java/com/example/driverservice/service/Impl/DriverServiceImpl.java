package com.example.driverservice.service.Impl;

import com.example.driverservice.dto.DriverDto;
import com.example.driverservice.entity.Driver;
import com.example.driverservice.repository.DriverRepo;
import com.example.driverservice.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepo driverRepo;
    private final ModelMapper modelMapper;
    @Override
    public DriverDto registerDriver(DriverDto dto) {
        Driver driver = driverRepo.save(modelMapper.map(dto, Driver.class));

        return modelMapper.map(driver, DriverDto.class);
    }
}
