package com.springapi.beyblade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.springapi.beyblade.models.BeybladeModel;

//@Repository
public interface IBeybladeRepository extends JpaRepository<BeybladeModel, Long>{
    
}
