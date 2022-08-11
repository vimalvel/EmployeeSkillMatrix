package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.AdminLogin;
import com.chainsys.employeeskillmatrix.repository.AdminLoginRepository;
@Service
public class AdminLoginService {
	@Autowired
	private AdminLoginRepository adminLoginRepository;
	public List<AdminLogin> getAdminLogin(){
		List<AdminLogin> adminlist = adminLoginRepository.findAll();
		return adminlist;
	}
	public AdminLogin save(AdminLogin login) {
		return adminLoginRepository.save(login);
	}

	public AdminLogin findById(int id) {
		return adminLoginRepository.findById(id);
	}

	public void deleteById(int id) {
		adminLoginRepository.deleteById(id);
	}
	public AdminLogin getAdminByIdAndPassword(int id,String password) {
		return adminLoginRepository.findByAdminIdAndPassword(id, password);
	}

}
