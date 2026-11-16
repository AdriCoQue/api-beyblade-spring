package com.springapi.beyblade.models.DTO;

public class SystemsDTO {

    private Long idsystem;
    private String name;

    public Long getIdsystem(){
        return this.idsystem;
    }

    public String getName(){
        return this.name;
    }

    public void setIdsystem(Long idsystem){
        this.idsystem = idsystem;
    }

    public void setName(String name){
        this.name = name;
    }
}
