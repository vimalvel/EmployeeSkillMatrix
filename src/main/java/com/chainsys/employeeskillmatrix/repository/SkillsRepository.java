package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.Skills;

public interface SkillsRepository extends CrudRepository<Skills,Integer> {
	Skills findById(int id);
	Skills save(Skills sk);
	void deleteById(int id);
	List<Skills> findAll();
	List<Skills> findByTestId(int id);
}
