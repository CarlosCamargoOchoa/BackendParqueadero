package com.unir.parqueadero.Persistence.Contracts;

import org.springframework.data.repository.CrudRepository;

import com.unir.parqueadero.Model.Entity.ControlEntity;

public interface IControlCRUDRepository extends CrudRepository<ControlEntity,Integer> {

}
