package com.wicipe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wicipe.domain.EvalueDTO;
import com.wicipe.domain.NewMenuDTO;
import com.wicipe.domain.OrderDTO;
import com.wicipe.domain.Survey1DTO;
import com.wicipe.domain.Survey2DTO;
import com.wicipe.domain.Survey3DTO;
import com.wicipe.domain.UserDTO;

@Mapper
public interface UserMapper {
	List<UserDTO> selectUsers(UserDTO userDTO) throws Exception;
	
	@Select("SELECT * FROM USERS")
	List<UserDTO> selectAllUsers();
	
	List<OrderDTO> selectOrder(String name) throws Exception;
	
	int getUserCount(String id) throws Exception;
	
	int loginUser(String id, String phone) throws Exception;
	
	void setUser(UserDTO userDTO) throws Exception;
	
	void addUser(UserDTO userDTO) throws Exception;
	
	void order(OrderDTO orderDTO) throws Exception;
	
	void evalue(EvalueDTO evalueDTO) throws Exception;
	
	void addNewMenu(NewMenuDTO newMenuOrder) throws Exception;
	
	void survey1(Survey1DTO survey1DTO) throws Exception;
	
	void survey2(Survey2DTO survey2dto) throws Exception;
	
	void survey3(Survey3DTO survey3DTO) throws Exception;
	
	void deleteOrder(int idx) throws Exception;
}
