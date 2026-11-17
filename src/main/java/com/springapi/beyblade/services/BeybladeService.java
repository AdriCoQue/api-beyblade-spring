package com.springapi.beyblade.services;

import java.util.List;
import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapi.beyblade.models.BeybladeModel;
import com.springapi.beyblade.models.SeriesModel;
import com.springapi.beyblade.models.SystemModel;
import com.springapi.beyblade.models.DTO.BeybladeCreateDTO;
import com.springapi.beyblade.models.DTO.BeybladeDTO;
import com.springapi.beyblade.repositories.IBeybladeRepository;
import com.springapi.beyblade.repositories.ISeriesRepository;
import com.springapi.beyblade.repositories.ISystemRepository;

@Service 
public class BeybladeService {
    //@Autowired
    private IBeybladeRepository beyRepo;
    private ISystemRepository systemRepo;
    private ISeriesRepository seriesRepo;

    BeybladeService(IBeybladeRepository beyRepo, ISeriesRepository seriesRepo, ISystemRepository systemRepo) {
        this.beyRepo = beyRepo;
        this.seriesRepo = seriesRepo;
        this.systemRepo = systemRepo;
    }
    public List<BeybladeDTO> getBeyblades(){
        return beyRepo.findAll().stream().map(bey -> {
            BeybladeDTO b = new BeybladeDTO();

            b.setIdbeyblade(bey.getIdbeyblade());
            b.setName(bey.getName());
            b.setJpname(bey.getJpname());
            b.setSpin(bey.getSpin());
            b.setType(bey.getType());
            b.setSeries(bey.getSeries().getName());
            b.setSystem(bey.getSystem().getName());
            b.setBlader(bey.getBlader());
            b.setImageURL(bey.getImageURL());
            return b;
        }).toList();
    }

    public Optional<BeybladeDTO> getBeybladeById(Long id){
        return beyRepo.findById(id).map(bey -> {
            BeybladeDTO b = new BeybladeDTO();

            b.setIdbeyblade(bey.getIdbeyblade());
            b.setName(bey.getName());
            b.setJpname(bey.getJpname());
            b.setSpin(bey.getSpin());
            b.setType(bey.getType());
            b.setSeries(bey.getSeries().getName());
            b.setSystem(bey.getSystem().getName());
            b.setBlader(bey.getBlader());
            b.setImageURL(bey.getImageURL());
            return b;
        });
    }

    public Boolean createBeyblade(BeybladeCreateDTO bey){
        BeybladeModel newBey = new BeybladeModel();
         SystemModel system = systemRepo.findById(bey.getIdSystem()).orElse(null);
        SeriesModel series = seriesRepo.findById(bey.getIdseries()).orElse(null);
        if(system == null || series == null){
            return false;
        }
        newBey.setName(bey.getName());
        newBey.setJpname(bey.getJpname());
        newBey.setSpin(bey.getSpin());
        newBey.setType(bey.getType());
        newBey.setBlader(bey.getBlader());
        newBey.setImageURL(bey.getImageURL());
        newBey.setSystem(system);
        newBey.setSeries(series);
        try{
            beyRepo.save(newBey); 
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public String updateBeyblade(BeybladeCreateDTO bey, Long id){
        BeybladeModel currentBey = beyRepo.findById(id).orElse(null);
        SystemModel system = systemRepo.findById(bey.getIdSystem()).orElse(null);
        SeriesModel series = seriesRepo.findById(bey.getIdseries()).orElse(null);
        if(currentBey == null){
            return "Beyblade not found";
        }
        if(system == null || series == null){
            return "The system or series specified does not exist";
        }
        currentBey.setName(bey.getName());
        currentBey.setJpname(bey.getJpname());
        currentBey.setSeries(series);
        currentBey.setSystem(system);
        currentBey.setSpin(bey.getSpin());
        currentBey.setType(bey.getType());
        currentBey.setBlader(bey.getBlader());
        currentBey.setImageURL(bey.getImageURL());
        try{
            beyRepo.save(currentBey);
            return "Beyblade successfully updated";
        } catch(Exception e){
            return "Couldn't update bey";
        }

    }

    public Boolean deleteBeyblade(Long id){
        try{
            beyRepo.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    
}
