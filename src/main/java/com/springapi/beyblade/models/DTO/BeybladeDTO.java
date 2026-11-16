package com.springapi.beyblade.models.DTO;

public class BeybladeDTO {

    private Long idbeyblade;
    private String name;
    private String jpname;
    private String type;
    private String spin;
    private String series;
    private String system;
    private String blader;
    private String imageURL;

    public Long getIdbeyblade(){
        return this.idbeyblade;
    }

    public void setIdbeyblade(Long idbeyblade){
        this.idbeyblade = idbeyblade;
    }

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

    public String getSeries(){
        return this.series; 
    }

    public void setSeries(String series){
        this.series = series;
    }

    public String getSystem(){
        return this.system; 
    }

    public void setSystem(String system){
        this.system = system;
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
