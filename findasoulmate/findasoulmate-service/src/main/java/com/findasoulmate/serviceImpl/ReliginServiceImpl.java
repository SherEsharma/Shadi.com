package com.findasoulmate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findasoulmate.model.Religion;
import com.findasoulmate.repository.ReliginRepository;
import com.findasoulmate.service.ReliginService;


@Service
public class ReliginServiceImpl implements ReliginService {
	
	@Autowired
	public ReliginRepository religinrepo;
	
	
	public List<Religion> FatchAllReligion(Religion religion) {
			List<Religion> religionList=religinrepo.findAll();
		
		return religionList;
	}

	
}
