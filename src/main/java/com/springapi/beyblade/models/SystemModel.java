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
@Table(name="systems")
public class SystemModel {
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsystem;

    @Column
    private String name;

    @OneToMany(mappedBy = "system")
    private List<BeybladeModel> beyblades;

    public Long getIdsystem(){
        return this.idsystem;
    }

    public void setIdsystem(Long idsystem){
        this.idsystem = idsystem;
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
