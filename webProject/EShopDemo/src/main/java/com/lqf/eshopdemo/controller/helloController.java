package com.lqf.eshopdemo.controller;

import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lqf.eshopdemo.dao.CatalogDAO;
import com.lqf.eshopdemo.domain.Catalog;

@Controller
public class helloController {

	@Inject
	private CatalogDAO cataDao;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello (Model model) {
		Set<Catalog> catalogs = cataDao.findAllCatalogs();
		String msg = "not finding";
		if (catalogs.size() > 0)
			msg = catalogs.iterator().next().getName();
		
		model.addAttribute("msg", msg);
		return "hello";
	}
}
