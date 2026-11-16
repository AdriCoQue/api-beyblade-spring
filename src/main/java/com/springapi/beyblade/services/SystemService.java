package com.springapi.beyblade.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springapi.beyblade.models.DTO.SystemsDTO;
import com.springapi.beyblade.repositories.ISystemRepository;

@Service 
public class SystemService {

    private ISystemRepository systemRepo;

    public SystemService(ISystemRepository systemRepo){
        this.systemRepo = systemRepo;
    }

    public List<SystemsDTO> getAllSystems(){
        return systemRepo.findAll().stream().map(system -> {
            SystemsDTO sys = new SystemsDTO();
            sys.setIdsystem(system.getIdsystem());
            sys.setName(system.getName());
            return sys;
        }).toList();
    }

}
