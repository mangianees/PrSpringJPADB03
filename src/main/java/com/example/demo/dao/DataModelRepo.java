package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.data.DataModel;

public interface DataModelRepo extends CrudRepository<DataModel, Integer> {
	

}
