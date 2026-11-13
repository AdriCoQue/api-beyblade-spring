package com.springapi.beyblade.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "beyblades")
public class BeybladeModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbeyblade;

    @Column
    private String name;

    @Column 
    private String jpname;

    @Column 
    private String type;

    @Column 
    private String spin;

    @Column 
    private String blader;

    @Column 
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "idseries", nullable = false)
    private SeriesModel series;

    @ManyToOne
    @JoinColumn(name = "idsystem", nullable = false)
    private SystemModel system;

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

    public SeriesModel getSeries(){
        return this.series;
    }

    public void setSeries(SeriesModel series){
        this.series = series;
    }

    public SystemModel getSystem(){
        return this.system;
    }

    public void setSystem(SystemModel system){
        this.system = system;
    }

}
