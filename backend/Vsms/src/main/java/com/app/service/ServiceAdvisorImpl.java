package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.dao.JobCardRepo;
import com.app.dao.UserRepo;
import com.app.pojos.JobCard;
import com.app.pojos.Roles;

@Service
@Transactional
public class ServiceAdvisorImpl implements IServiceAdvisorService {

	
	@Autowired
	JobCardRepo repo;	// For accessing jobCards
	
	@Autowired
	UserRepo userRepo;  //for accessing user's table
	
	
	@Override
	public String addJob(JobCard card) {
	      card.setActive(true);
	      repo.save(card);
	      return "Job card added successfully";
		
	}

	@Override
	public List<String> fetchMechanicName() {
		return userRepo.fetchMechanicName(Roles.MECHANIC);
		
	}

	@Override
	public List<JobCard> fetchRecentJobCards() {
		return repo.fetchRecentjobCards();
		
	}

	@Override
	public long getAllJobs() {
		return repo.count();
	}
	

	

      
      
}
