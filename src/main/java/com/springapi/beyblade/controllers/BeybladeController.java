package com.springapi.beyblade.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.beyblade.models.BeybladeModel;
import com.springapi.beyblade.models.DTO.BeybladeCreateDTO;
import com.springapi.beyblade.models.DTO.BeybladeDTO;
import com.springapi.beyblade.services.BeybladeService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/beyblades")
public class BeybladeController {
    
    private BeybladeService beyService;

    BeybladeController(BeybladeService beyService) {
        this.beyService = beyService;
    }

    @GetMapping
    public List<BeybladeDTO> getAllBeyblades() {
        return beyService.getBeyblades();
    }

    @GetMapping(path = "/{id}")
    public Optional<BeybladeDTO> getBeybladeById(@PathVariable Long id){
        return beyService.getBeybladeById(id);
    }

    @PostMapping
    public BeybladeModel createNeyBeyblade(@RequestBody BeybladeCreateDTO newBey) {        
        return beyService.createBeyblade(newBey);
    }

    @PutMapping(path = "/{id}")
    public BeybladeModel updateBeyblade(@PathVariable Long id, @RequestBody BeybladeModel updatedBey) {    
        return beyService.updateBeyblade(updatedBey, id);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteBeyblade(@PathVariable Long id){
        return beyService.deleteBeyblade(id);
    }
    
    
}
