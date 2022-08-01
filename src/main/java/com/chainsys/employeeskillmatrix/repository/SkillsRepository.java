package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.pojo.Skills;

public interface SkillsRepository extends CrudRepository<Skills,Integer> {
	Skills findById(int id);
	Skills save(Skills sk);
	void deleteById(int id);
	List<Skills> findAll();
}
