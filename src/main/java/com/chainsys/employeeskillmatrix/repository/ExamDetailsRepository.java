package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.ExamDetails;


public interface ExamDetailsRepository extends CrudRepository<ExamDetails,Integer> {
	ExamDetails findById(int id);
	ExamDetails save(ExamDetails exdetails);
	void deleteById(int id);
	List<ExamDetails> findAll();

}
