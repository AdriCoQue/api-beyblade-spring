package com.springapi.beyblade.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name="series")
public class SeriesModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idseries;

    @Column
    private String name;

    @OneToMany(mappedBy = "series")
    private List<BeybladeModel> beyblades;

    public Long getIdseries(){
        return this.idseries;
    }

    public void setIdseries(Long idseries){
        this.idseries = idseries;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<BeybladeModel> getBeyblades(){
        return this.beyblades;
    }

    public void setBeyblades(List<BeybladeModel> beyblades){
        this.beyblades = beyblades;
    }

}
