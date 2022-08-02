package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.ExamDetails;
import com.chainsys.employeeskillmatrix.repository.ExamDetailsRepository;

@Service
public class ExamDetailsService {
	@Autowired
	private ExamDetailsRepository examDetailsRepository;
	public List<ExamDetails> getExamDetails(){
		List<ExamDetails> exlist = examDetailsRepository.findAll();
		return exlist;
	}
	public ExamDetails save(ExamDetails exdetails) {
		return examDetailsRepository.save(exdetails);
	}
	public ExamDetails findByid(int id) {
		return examDetailsRepository.findById(id);
	}
	public void deleteById(int id) {
		examDetailsRepository.deleteById(id);
	}

}
