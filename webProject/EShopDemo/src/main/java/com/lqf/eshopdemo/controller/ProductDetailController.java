package com.lqf.eshopdemo.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.domain.ProductDetail;

@Controller
public class ProductDetailController {
	
	@Inject
	private ProductDetailDAO pdd;
	
	@RequestMapping(value = "productDetail", method = RequestMethod.GET)
	public String getProductDetail(@RequestParam("id") Integer id, Model model) {
		System.out.println("===product id is : " + id);
		if (id == null) {
			model.addAttribute("errorMsg", "You have to identify a id of product!");
			return "error";
		}
		
		ProductDetail productDetail = pdd.findProductDetailById(id);
		System.out.println("===product is : " + productDetail);
		Integer picnum = productDetail.getPicnum();
		int[] picList = new int[picnum];
		for (int i = 0; i < picList.length; i++) {
			picList[i] = i;
		}
		model.addAttribute("productDetail", productDetail);
		model.addAttribute("picList", picList);
		return "productDetail";
	}
}
