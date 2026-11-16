package com.springapi.beyblade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapi.beyblade.models.SystemModel;

public interface ISystemRepository extends JpaRepository<SystemModel, Long>{

}
