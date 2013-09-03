package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.Userinfo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for CustomerComment entities
 * 
 */

@Service("CustomerCommentService")
@Transactional
public class CustomerCommentServiceImpl implements CustomerCommentService {

	/**
	 * DAO injected by Spring that manages CustomerComment entities
	 * 
	 */
	@Autowired
	private CustomerCommentDAO customerCommentDAO;

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * DAO injected by Spring that manages Userinfo entities
	 * 
	 */
	@Autowired
	private UserinfoDAO userinfoDAO;

	/**
	 * Instantiates a new CustomerCommentServiceImpl.
	 *
	 */
	public CustomerCommentServiceImpl() {
	}

	/**
	 */
	@Transactional
	public CustomerComment findCustomerCommentByPrimaryKey(Integer proId, Integer userId) {
		return customerCommentDAO.findCustomerCommentByPrimaryKey(proId, userId);
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@Transactional
	public CustomerComment saveCustomerCommentUserinfo(Integer proId, Integer userId, Userinfo related_userinfo) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(proId, userId, -1, -1);
		Userinfo existinguserinfo = userinfoDAO.findUserinfoByPrimaryKey(related_userinfo.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguserinfo != null) {
			existinguserinfo.setId(related_userinfo.getId());
			existinguserinfo.setUsername(related_userinfo.getUsername());
			existinguserinfo.setPassword(related_userinfo.getPassword());
			existinguserinfo.setFirstname(related_userinfo.getFirstname());
			existinguserinfo.setSecondname(related_userinfo.getSecondname());
			existinguserinfo.setGender(related_userinfo.getGender());
			existinguserinfo.setBirthday(related_userinfo.getBirthday());
			existinguserinfo.setEmail(related_userinfo.getEmail());
			existinguserinfo.setAddress(related_userinfo.getAddress());
			existinguserinfo.setPostcode(related_userinfo.getPostcode());
			existinguserinfo.setPhone(related_userinfo.getPhone());
			related_userinfo = existinguserinfo;
		} else {
			related_userinfo = userinfoDAO.store(related_userinfo);
			userinfoDAO.flush();
		}

		customercomment.setUserinfo(related_userinfo);
		related_userinfo.getCustomerComments().add(customercomment);
		customercomment = customerCommentDAO.store(customercomment);
		customerCommentDAO.flush();

		related_userinfo = userinfoDAO.store(related_userinfo);
		userinfoDAO.flush();

		return customercomment;
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@Transactional
	public void saveCustomerComment(CustomerComment customercomment) {
		CustomerComment existingCustomerComment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment.getProId(), customercomment.getUserId());

		if (existingCustomerComment != null) {
			if (existingCustomerComment != customercomment) {
				existingCustomerComment.setProId(customercomment.getProId());
				existingCustomerComment.setUserId(customercomment.getUserId());
				existingCustomerComment.setRate(customercomment.getRate());
				existingCustomerComment.setComment(customercomment.getComment());
			}
			customercomment = customerCommentDAO.store(existingCustomerComment);
		} else {
			customercomment = customerCommentDAO.store(customercomment);
		}
		customerCommentDAO.flush();
	}

	/**
	 * Return all CustomerComment entity
	 * 
	 */
	@Transactional
	public List<CustomerComment> findAllCustomerComments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<CustomerComment>(customerCommentDAO.findAllCustomerComments(startResult, maxRows));
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public CustomerComment saveCustomerCommentProductDetail(Integer proId, Integer userId, ProductDetail related_productdetail) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(proId, userId, -1, -1);
		ProductDetail existingproductDetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproductDetail != null) {
			existingproductDetail.setId(related_productdetail.getId());
			existingproductDetail.setTitle(related_productdetail.getTitle());
			existingproductDetail.setPrice(related_productdetail.getPrice());
			existingproductDetail.setQuantity(related_productdetail.getQuantity());
			existingproductDetail.setDescription(related_productdetail.getDescription());
			related_productdetail = existingproductDetail;
		} else {
			related_productdetail = productDetailDAO.store(related_productdetail);
			productDetailDAO.flush();
		}

		customercomment.setProductDetail(related_productdetail);
		related_productdetail.getCustomerComments().add(customercomment);
		customercomment = customerCommentDAO.store(customercomment);
		customerCommentDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		return customercomment;
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@Transactional
	public void deleteCustomerComment(CustomerComment customercomment) {
		customerCommentDAO.remove(customercomment);
		customerCommentDAO.flush();
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@Transactional
	public CustomerComment deleteCustomerCommentUserinfo(Integer customercomment_proId, Integer customercomment_userId, Integer related_userinfo_id) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment_proId, customercomment_userId, -1, -1);
		Userinfo related_userinfo = userinfoDAO.findUserinfoByPrimaryKey(related_userinfo_id, -1, -1);

		customercomment.setUserinfo(null);
		related_userinfo.getCustomerComments().remove(customercomment);
		customercomment = customerCommentDAO.store(customercomment);
		customerCommentDAO.flush();

		related_userinfo = userinfoDAO.store(related_userinfo);
		userinfoDAO.flush();

		userinfoDAO.remove(related_userinfo);
		userinfoDAO.flush();

		return customercomment;
	}

	/**
	 * Load an existing CustomerComment entity
	 * 
	 */
	@Transactional
	public Set<CustomerComment> loadCustomerComments() {
		return customerCommentDAO.findAllCustomerComments();
	}

	/**
	 * Return a count of all CustomerComment entity
	 * 
	 */
	@Transactional
	public Integer countCustomerComments() {
		return ((Long) customerCommentDAO.createQuerySingleResult("select count(*) from CustomerComment o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public CustomerComment deleteCustomerCommentProductDetail(Integer customercomment_proId, Integer customercomment_userId, Integer related_productdetail_id) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment_proId, customercomment_userId, -1, -1);
		ProductDetail related_productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		customercomment.setProductDetail(null);
		related_productdetail.getCustomerComments().remove(customercomment);
		customercomment = customerCommentDAO.store(customercomment);
		customerCommentDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		productDetailDAO.remove(related_productdetail);
		productDetailDAO.flush();

		return customercomment;
	}
}
