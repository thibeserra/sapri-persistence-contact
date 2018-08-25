package br.com.sapri.contact.controller;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sapri.commons.DateUtils;
import br.com.sapri.contact.model.Uf;
import br.com.sapri.contact.service.UfService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/uf")
public class UfController {

	@Autowired
	private UfService ufUservice;
	
	@GetMapping
	@ApiOperation("return list of uf")
	public List<Uf> findAll() {
		System.out.println("findAll: " + DateUtils.dateToString("dd/MM/yyyy", new GregorianCalendar().getTime()));
		try {
			return this.ufUservice.findAll();
		} catch(Exception e) {
			System.out.println("Erro ao listar Ufs: " + e.getMessage());
		}
		return null;
	}
	
}
