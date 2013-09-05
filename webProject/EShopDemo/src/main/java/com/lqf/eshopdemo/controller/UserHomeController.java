package com.lqf.eshopdemo.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lqf.eshopdemo.dao.ProductCatalogDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;

@Controller
public class UserHomeController {
	
	@Inject
	private ProductDetailDAO pdDao;
	
	@Inject
	private ProductCatalogDAO pcDao;
	
	@RequestMapping(value = "/UserHome", method = RequestMethod.GET)
	public String getUserHome(Model model) {
		Set<ProductCatalog> bookPc = pcDao.findProductCatalogByCatalogId(1);
		Set<ProductCatalog> moviePc = pcDao.findProductCatalogByCatalogId(2);
		Set<ProductCatalog> phonePc = pcDao.findProductCatalogByCatalogId(3);
		
		Set<ProductDetail> bookList = getProductDetailByPc(bookPc);
		Set<ProductDetail> movieList = getProductDetailByPc(moviePc);
		Set<ProductDetail> phoneList = getProductDetailByPc(phonePc);
		
		model.addAttribute(bookList);
		model.addAttribute(movieList);
		model.addAttribute(phoneList);
		return "UserHome";
	}

	private Set<ProductDetail> getProductDetailByPc(Set<ProductCatalog> bookPc) {
		Set<ProductDetail> ret = new HashSet<ProductDetail>();
		Iterator<ProductCatalog> it = bookPc.iterator();
		while (it.hasNext()) {
			ProductCatalog pc = it.next();
			ret.add(pdDao.findProductDetailById(pc.getProductId()));
		}
		
		return ret;
	}
}
