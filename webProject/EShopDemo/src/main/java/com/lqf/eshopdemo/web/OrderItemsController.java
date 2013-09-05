package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductDetail;

import com.lqf.eshopdemo.service.OrderItemsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for OrderItems entities
 * 
 */

@Controller("OrderItemsController")
public class OrderItemsController {

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * DAO injected by Spring that manages OrderItems entities
	 * 
	 */
	@Autowired
	private OrderItemsDAO orderItemsDAO;

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for OrderItems entities
	 * 
	 */
	@Autowired
	private OrderItemsService orderItemsService;

	/**
	 * Edit an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/editOrderItemsProductDetail")
	public ModelAndView editOrderItemsProductDetail(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("orderitems/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteOrderItemsOrder")
	public ModelAndView deleteOrderItemsOrder(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer related_order_id) {
		ModelAndView mav = new ModelAndView();

		OrderItems orderitems = orderItemsService.deleteOrderItemsOrder(orderitems_orderId, orderitems_productId, related_order_id);

		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("orderitems", orderitems);
		mav.setViewName("orderitems/viewOrderItems.jsp");

		return mav;
	}

	/**
	 * Select the child ProductDetail entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderItemsProductDetail")
	public ModelAndView confirmDeleteOrderItemsProductDetail(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id));
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.setViewName("orderitems/productdetail/deleteProductDetail.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping("/selectOrderItemsOrder")
	public ModelAndView selectOrderItemsOrder(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("order", order);
		mav.setViewName("orderitems/order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newOrderItemsOrder")
	public ModelAndView newOrderItemsOrder(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("orderitems/order/editOrder.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/editOrderItems")
	public ModelAndView editOrderItems(@RequestParam Integer orderIdKey, @RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", orderItemsDAO.findOrderItemsByPrimaryKey(orderIdKey, productIdKey));
		mav.setViewName("orderitems/editOrderItems.jsp");

		return mav;
	}

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editOrderItemsOrder")
	public ModelAndView editOrderItemsOrder(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("order", order);
		mav.setViewName("orderitems/order/editOrder.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orderitemsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveOrderItemsOrder")
	public ModelAndView saveOrderItemsOrder(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @ModelAttribute Order order) {
		OrderItems parent_orderitems = orderItemsService.saveOrderItemsOrder(orderitems_orderId, orderitems_productId, order);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("orderitems", parent_orderitems);
		mav.setViewName("orderitems/viewOrderItems.jsp");

		return mav;
	}

	/**
	 * Select the child Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderItemsOrder")
	public ModelAndView confirmDeleteOrderItemsOrder(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer related_order_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(related_order_id));
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.setViewName("orderitems/order/deleteOrder.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/saveOrderItemsProductDetail")
	public ModelAndView saveOrderItemsProductDetail(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @ModelAttribute ProductDetail productdetail) {
		OrderItems parent_orderitems = orderItemsService.saveOrderItemsProductDetail(orderitems_orderId, orderitems_productId, productdetail);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("orderitems", parent_orderitems);
		mav.setViewName("orderitems/viewOrderItems.jsp");

		return mav;
	}

	/**
	 * Show all ProductDetail entities by OrderItems
	 * 
	 */
	@RequestMapping("/listOrderItemsProductDetail")
	public ModelAndView listOrderItemsProductDetail(@RequestParam Integer orderIdKey, @RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", orderItemsDAO.findOrderItemsByPrimaryKey(orderIdKey, productIdKey));
		mav.setViewName("orderitems/productdetail/listProductDetail.jsp");

		return mav;
	}

	/**
	 * Show all OrderItems entities
	 * 
	 */
	@RequestMapping("/indexOrderItems")
	public ModelAndView listOrderItemss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitemss", orderItemsService.loadOrderItemss());

		mav.setViewName("orderitems/listOrderItemss.jsp");

		return mav;
	}

	/**
	 * Show all Order entities by OrderItems
	 * 
	 */
	@RequestMapping("/listOrderItemsOrder")
	public ModelAndView listOrderItemsOrder(@RequestParam Integer orderIdKey, @RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", orderItemsDAO.findOrderItemsByPrimaryKey(orderIdKey, productIdKey));
		mav.setViewName("orderitems/order/listOrder.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/saveOrderItems")
	public String saveOrderItems(@ModelAttribute OrderItems orderitems) {
		orderItemsService.saveOrderItems(orderitems);
		return "forward:/indexOrderItems";
	}

	/**
	 * Create a new OrderItems entity
	 * 
	 */
	@RequestMapping("/newOrderItems")
	public ModelAndView newOrderItems() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", new OrderItems());
		mav.addObject("newFlag", true);
		mav.setViewName("orderitems/editOrderItems.jsp");

		return mav;
	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/selectOrderItemsProductDetail")
	public ModelAndView selectOrderItemsProductDetail(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("orderitems/productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/deleteOrderItems")
	public String deleteOrderItems(@RequestParam Integer orderIdKey, @RequestParam Integer productIdKey) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderIdKey, productIdKey);
		orderItemsService.deleteOrderItems(orderitems);
		return "forward:/indexOrderItems";
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping("/newOrderItemsProductDetail")
	public ModelAndView newOrderItemsProductDetail(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("productdetail", new ProductDetail());
		mav.addObject("newFlag", true);
		mav.setViewName("orderitems/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Entry point to show all OrderItems entities
	 * 
	 */
	public String indexOrderItems() {
		return "redirect:/indexOrderItems";
	}

	/**
	 * Select an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/selectOrderItems")
	public ModelAndView selectOrderItems(@RequestParam Integer orderIdKey, @RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", orderItemsDAO.findOrderItemsByPrimaryKey(orderIdKey, productIdKey));
		mav.setViewName("orderitems/viewOrderItems.jsp");

		return mav;
	}

	/**
	 * Select the OrderItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderItems")
	public ModelAndView confirmDeleteOrderItems(@RequestParam Integer orderIdKey, @RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", orderItemsDAO.findOrderItemsByPrimaryKey(orderIdKey, productIdKey));
		mav.setViewName("orderitems/deleteOrderItems.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/deleteOrderItemsProductDetail")
	public ModelAndView deleteOrderItemsProductDetail(@RequestParam Integer orderitems_orderId, @RequestParam Integer orderitems_productId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		OrderItems orderitems = orderItemsService.deleteOrderItemsProductDetail(orderitems_orderId, orderitems_productId, related_productdetail_id);

		mav.addObject("orderitems_orderId", orderitems_orderId);
		mav.addObject("orderitems_productId", orderitems_productId);
		mav.addObject("orderitems", orderitems);
		mav.setViewName("orderitems/viewOrderItems.jsp");

		return mav;
	}
}