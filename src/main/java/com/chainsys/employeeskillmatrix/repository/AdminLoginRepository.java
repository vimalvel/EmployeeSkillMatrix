package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.AdminLogin;
import com.chainsys.employeeskillmatrix.model.EmployeeDetails;

public interface AdminLoginRepository extends CrudRepository<AdminLogin,Integer>{
	AdminLogin findById(int id);
	AdminLogin save(AdminLogin login);
	void deleteById(int id);
	List<AdminLogin> findAll();
	AdminLogin findByAdminIdAndAdminEmailAndPassword(int id,String email,String password);

}
