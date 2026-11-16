package com.springapi.beyblade.models.DTO;

public class SeriesDTO {

    private Long idseries;
    private String name;

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
}
