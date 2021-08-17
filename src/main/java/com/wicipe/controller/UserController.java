package com.wicipe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wicipe.domain.EvalueDTO;
import com.wicipe.domain.NewMenuDTO;
import com.wicipe.domain.OrderDTO;
import com.wicipe.domain.Survey1DTO;
import com.wicipe.domain.Survey2DTO;
import com.wicipe.domain.Survey3DTO;
import com.wicipe.domain.UserDTO;
import com.wicipe.mapper.UserMapper;


@CrossOrigin(origins = "*")
@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping(value="/")		//
	public String main() {
		return "main";		// View의 폴더, 파일 이름을 문자열로 리턴해준다.
	}
	
	@RequestMapping(value = "/user/get/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<UserDTO> getUser(@RequestParam(value="id",defaultValue="") String id) throws Exception{		
		final UserDTO userDTO = new UserDTO(0, id, "", "");
		final List<UserDTO> userList = userMapper.selectUsers(userDTO);
				
		return userList;
	}
	
	@RequestMapping(value = "/user/login/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public int userLogin(@RequestParam(value="id",defaultValue="") String id, @RequestParam(value="phone",defaultValue="") String phone) throws Exception{		
		int userCnt = userMapper.getUserCount(id);
		System.out.println("id: " + id + " / phone: "+ phone);
		
		if (userCnt != 0) {
			int getLogin = userMapper.loginUser(id, phone);
			System.out.println(getLogin);
			if (getLogin == 0)
				return -1;
			
			return getLogin;
		}
		System.out.println(userCnt);
		return userCnt;
	}
	
	@RequestMapping(value = "/user/get/all", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<UserDTO> getAllUser() throws Exception{
		
		final List<UserDTO> userList = userMapper.selectAllUsers();
				
		return userList;
	}
	
	@RequestMapping(value = "/user/get_order/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public List<OrderDTO> getOrder(@RequestParam(value="name",defaultValue="0") String name) throws Exception{
		final List<OrderDTO> userList = userMapper.selectOrder(name);
		
		System.out.println(userList);
				
		return userList;
	}
	//TODO: user/set 구현, json parser
	@RequestMapping(value = "/user/set/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public UserDTO setUser(@RequestBody Map<String, Object> param) throws Exception{				
//		Message message;
		System.out.println(param);
		System.out.println(param.get("params"));
		
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");
		
		System.out.println(map.get("id"));
		final UserDTO userDTO = new UserDTO(null, map.get("id"), map.get("address"), map.get("phone"));

		try {
			userMapper.setUser(userDTO);
//			message = new SuccessMessage("");
			
		} catch(Exception e) {
//			message= new SuccessMessage("error");
		}
		
		return userDTO;
	}
	
	@RequestMapping(value = "/user/add/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public UserDTO addUser(@RequestBody Map<String, Object> param) throws Exception{	
		System.out.println(param);
		
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");
		
		final UserDTO userDTO = new UserDTO(null, map.get("id"), map.get("address"), map.get("phone"), map.get("data"), map.get("dogname"));		
		userMapper.addUser(userDTO);
		
		return userDTO;
	}
	
	@RequestMapping(value = "/user/order/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public OrderDTO orderUser(@RequestBody Map<String, Object> param) throws Exception{		
		System.out.println(param);
		
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");
		
		final OrderDTO orderDTO = new OrderDTO(
				0,
				map.get("user_name"), 
				map.get("recipe_name"), 
				0, map.get("price"),
				map.get("time"),
				map.get("tip"),
				map.get("time_want"),
				map.get("phone"),
				map.get("address"));
		userMapper.order(orderDTO);
				
		return orderDTO;
	}
	
	@RequestMapping(value = "/user/evalue/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public EvalueDTO evalueUser(@RequestBody Map<String, Object> param) throws Exception{		
		System.out.println(param);
		
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");
		
		final EvalueDTO evalueDTO = new EvalueDTO(
				map.get("recipe_idx"),
				map.get("user_idx"), 
				map.get("star"),
				map.get("text"));
		userMapper.evalue(evalueDTO);
				
		return evalueDTO;
	}
	
	@RequestMapping(value = "/user/newmenu/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public NewMenuDTO addNewMenu(@RequestBody Map<String, Object> param) throws Exception{
		System.out.println(param);
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");
		
		final NewMenuDTO newMenuDTO = new NewMenuDTO(
				0, 
				map.get("user_name"), 
				map.get("text"),
				map.get("new_menu"));
		userMapper.addNewMenu(newMenuDTO);
				
		return newMenuDTO;
	}
	
	@RequestMapping(value = "/user/survey1/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public Survey1DTO survey1User(@RequestBody Map<String, Object> param) throws Exception{		
		System.out.println(param);
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");

		final Survey1DTO survey1DTO = new Survey1DTO(
				map.get("username"),
				map.get("dogname"), 
				map.get("breed"),
				map.get("weight"),
				map.get("form1"),
				map.get("form2"),
				map.get("age"),
				map.get("age_survey1"),
				map.get("age_survey2"),
				map.get("isNeutral"),
				map.get("gender"),
				map.get("pregnant"),
				map.get("disease1"),
				map.get("disease2"),
				map.get("disease3"),
				map.get("disease4"),
				map.get("disease5"),
				map.get("food1"),
				map.get("food2"),
				map.get("food3"),
				map.get("food4"),
				map.get("food5"),
				map.get("food6"),
				map.get("allergy1"),
				map.get("allergy2"),
				map.get("allergy3"),
				map.get("allergy4"),
				map.get("allergy5"),
				map.get("allergy6"),
				map.get("allergy7"),
				map.get("tool1"),
				map.get("tool2"),
				map.get("tool3"),
				map.get("tool4"),
				map.get("tool5"),
				map.get("tool6")
				);
		userMapper.survey1(survey1DTO);
				
		return survey1DTO;
	}
	
	@RequestMapping(value = "/user/survey2/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public Survey2DTO survey2User(@RequestBody Map<String, Object> param) throws Exception{
		System.out.println(param);
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");
		
		final Survey2DTO survey2DTO = new Survey2DTO(map.get("username"), map.get("q1"), map.get("q2"));
		userMapper.survey2(survey2DTO);
		
		System.out.println(survey2DTO);
				
		return survey2DTO;
	}
	
	@RequestMapping(value = "/user/survey3/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public Survey3DTO survey3User(@RequestBody Map<String, Object> param) throws Exception{
		System.out.println(param);
		@SuppressWarnings("unchecked")
		HashMap<String,Object> map = (HashMap<String, Object>) param.get("params");
		
		final Survey3DTO survey3DTO = new Survey3DTO(map.get("username"), map.get("q1"), map.get("q2"), map.get("q3"));
		System.out.println(map);
		System.out.println(survey3DTO);
		userMapper.survey3(survey3DTO);
		
		System.out.println(survey3DTO);
				
		return survey3DTO;
	}
	
	@RequestMapping(value = "/user/order/delete/", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public int deleteOrder(@RequestParam(value="idx", defaultValue="0") int idx) throws Exception{		
		try {
			System.out.println(idx);
			userMapper.deleteOrder(idx);
			
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	/*
	@RequestMapping(value = "/user/survey/", method=RequestMethod.POST)
	@ResponseBody() // JSON
	public OrderDTO evalueUser(@RequestParam Map<String, Object> param) throws Exception{		
		final OrderDTO orderDTO = new OrderDTO(
				param.get("user_idx"), 
				param.get("recipe_idx"), 
				param.get("process"),
				param.get("time"),
				param.get("tip"),
				param.get("time_want"));
		userMapper.order(orderDTO);
				
		return orderDTO;
	}*/
}
