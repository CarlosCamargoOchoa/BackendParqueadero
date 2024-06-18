package com.unir.parqueadero.Persistence.Contracts;

import org.springframework.data.repository.CrudRepository;

import com.unir.parqueadero.Model.Entity.TarifaEntity;

public interface ITarifaCRUDRepository extends CrudRepository<TarifaEntity,Integer> {

}
