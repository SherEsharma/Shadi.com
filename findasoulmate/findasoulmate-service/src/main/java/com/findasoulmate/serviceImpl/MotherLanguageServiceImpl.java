package com.findasoulmate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findasoulmate.model.MotherLanguage;
import com.findasoulmate.repository.MotherLanguageRepository;
import com.findasoulmate.service.MotherLanguageService;
@Service
public class MotherLanguageServiceImpl implements MotherLanguageService {
	
	@Autowired
	private MotherLanguageRepository languagerepo;

	public List<MotherLanguage> findAllLangauge(MotherLanguage language) {
			List<MotherLanguage> languagelist=languagerepo.findAll();
		return languagelist;
	}

}
