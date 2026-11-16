package com.springapi.beyblade.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.springapi.beyblade.models.DTO.SeriesDTO;
import com.springapi.beyblade.repositories.ISeriesRepository;

@Service 
public class SeriesService {

    private ISeriesRepository seriesRepo;

    public SeriesService(ISeriesRepository seriesRepo){
        this.seriesRepo = seriesRepo;
    }

    public List<SeriesDTO> getAllSeries(){
        return seriesRepo.findAll().stream().map(serie -> {
            SeriesDTO s = new SeriesDTO();

            s.setIdseries(serie.getIdseries());
            s.setName(serie.getName());

            return s;
        }).toList();
    }
}
