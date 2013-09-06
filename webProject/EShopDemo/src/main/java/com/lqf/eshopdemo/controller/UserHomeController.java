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
		
		Set<ProductDetail> bookList = getProductDetailByPc(bookPc, 4);
		Set<ProductDetail> movieList = getProductDetailByPc(moviePc, 4);
		Set<ProductDetail> phoneList = getProductDetailByPc(phonePc, 4);
		
		model.addAttribute("bookList", bookList.toArray());
		model.addAttribute("movieList", movieList.toArray());
		model.addAttribute("phoneList", phoneList.toArray());
		return "UserHome";
	}

	private Set<ProductDetail> getProductDetailByPc(Set<ProductCatalog> bookPc, int num) {
		Set<ProductDetail> ret = new HashSet<ProductDetail>();
		Iterator<ProductCatalog> it = bookPc.iterator();
		int i = 0;
		while (it.hasNext()) {
			ProductCatalog pc = it.next();
			ProductDetail pd = pdDao.findProductDetailById(pc.getProductId());
			if (pd.getTitle().length() > 40)
				pd.setTitle(pd.getTitle().substring(0, 37) + "...");
			ret.add(pd);
			if (++i >= num)
				break;
		}
		
		return ret;
	}
}
