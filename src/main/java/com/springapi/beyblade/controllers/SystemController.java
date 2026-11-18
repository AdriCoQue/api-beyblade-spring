package com.springapi.beyblade.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.beyblade.models.DTO.SystemsDTO;
import com.springapi.beyblade.services.SystemService;

@RestController
@CrossOrigin
@RequestMapping("/systems")
public class SystemController {
    private SystemService systemService;

    public SystemController(SystemService systemService){
        this.systemService = systemService;
    }

    @GetMapping
    public List<SystemsDTO> getSystems() {
        return systemService.getAllSystems();
    }
    
}
