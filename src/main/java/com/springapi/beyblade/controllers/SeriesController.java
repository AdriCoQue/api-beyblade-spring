package com.springapi.beyblade.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.beyblade.models.DTO.SeriesDTO;
import com.springapi.beyblade.services.SeriesService;

@RestController
@RequestMapping("/series")
public class SeriesController {
    private SeriesService seriesService;

    public SeriesController(SeriesService seriesService){
        this.seriesService = seriesService;
    }

    @GetMapping
    public List<SeriesDTO> getSeries(){
        return seriesService.getAllSeries();
    } 
    
}
