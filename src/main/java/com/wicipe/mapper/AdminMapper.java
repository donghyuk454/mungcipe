package com.wicipe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wicipe.domain.OrderDTO;

@Mapper
public interface AdminMapper {
	@Select("SELECT * FROM orders")
	List<OrderDTO> selectAllOrder();
	
	void updateOrder(OrderDTO orderDTO) throws Exception;
	
	@Update("UPDATE orders SET state=#{state} WHERE idx=#{idx};")
	void updateOrders(OrderDTO orderDTO) throws Exception;
	
	void deleteOrder(OrderDTO orderDTO) throws Exception;
	
	@Update("UPDATE orders SET state=-1 WHERE idx=#{idx};")
	void deleteOrders(OrderDTO orderDTO) throws Exception;
}
