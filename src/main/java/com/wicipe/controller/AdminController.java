package com.wicipe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wicipe.domain.OrderDTO;
import com.wicipe.mapper.AdminMapper;

@CrossOrigin(origins = "*")
@RestController
public class AdminController {
	@Autowired
	private AdminMapper adminMapper;

	@RequestMapping(value = "/admin/order/all/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<OrderDTO> getAllOrder() throws Exception{
		
		final List<OrderDTO> orderList = adminMapper.selectAllOrder();
				
		return orderList;
	}
	
	@RequestMapping(value = "/admin/order/set/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<OrderDTO> updateOrder(@RequestParam(value="idx") int idx, @RequestParam(value="state") int state) throws Exception{
		System.out.println(idx);
		System.out.println(state);
		
		final OrderDTO orderDTO = new OrderDTO(idx, state);
		
		adminMapper.updateOrders(orderDTO);
		
		final List<OrderDTO> orderList = adminMapper.selectAllOrder();
		return orderList;
	}
	
	@RequestMapping(value = "/admin/order/delete/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<OrderDTO> deleteOrder(@RequestParam(value="idx") int idx) throws Exception{
		
		final List<OrderDTO> orderList;
		final OrderDTO orderDTO = new OrderDTO(idx, -1);
		adminMapper.deleteOrders(orderDTO);
		
		orderList = adminMapper.selectAllOrder();
				
		return orderList;
	}
}
