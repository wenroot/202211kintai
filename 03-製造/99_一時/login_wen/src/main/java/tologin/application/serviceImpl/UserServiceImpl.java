package tologin.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tologin.application.entity.User;
import tologin.application.mapper.UserMapper;
import tologin.application.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	  @Autowired
	  private UserMapper userMapper;
	  
	@Override
	public User selectByUserId(User user) {
	
	
		 return  userMapper.selectByUserId(user);
	}



}
