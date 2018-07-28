package br.com.sapri.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sapri.contact.model.Uf;
import br.com.sapri.contact.repository.UfRepository;

@Service
public class UfService {

	@Autowired
	private UfRepository ufRepository;
	
	public List<Uf> findAll() {
		return this.ufRepository.findAll();
	}
}
