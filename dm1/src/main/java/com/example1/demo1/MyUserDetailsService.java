package com.example1.demo1;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example1.demo1.models.MyUserDetails;
import com.example1.demo1.models.User;

import java.util.Optional;
@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
userrepository userRepository;
	 @Override
	    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	        Optional<User> user = userRepository.findByUserName(userName);

	        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

	        return user.map(MyUserDetails::new).get();
		
	}

}
