package com.springapi.beyblade.models;

public class BeybladeCreateDTO {

    private String name;
    private String jpname;
    private String type;
    private String spin;
    private Long idseries;
    private Long idsystem;
    private String blader;
    private String imageURL;

    public String getName(){
        return this.name; 
    }

    public void setName(String name){
        this.name = name;
    }

    public String getJpname(){
        return this.jpname; 
    }

    public void setJpname(String jpname){
        this.jpname = jpname;
    }

    public String getType(){
        return this.type; 
    }

    public void setType(String type){
        this.type = type;
    }

    public String getSpin(){
        return this.spin; 
    }

    public void setSpin(String spin){
        this.spin = spin;
    }

    public Long getIdseries(){
        return this.idseries; 
    }

    public void setIdseries(Long idseries){
        this.idseries = idseries;
    }

    public Long getIdSystem(){
        return this.idsystem; 
    }

    public void setIdsystem(Long idsystem){
        this.idsystem = idsystem;
    }

    public String getBlader(){
        return this.blader; 
    }

    public void setBlader(String blader){
        this.blader = blader;
    }

    public String getImageURL(){
        return this.imageURL; 
    }

    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }

}
