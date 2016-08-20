package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.mutrack.simple.user.UserEntity;
import org.wpattern.mutrack.simple.user.UserRepository;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;

public class UserRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testFindAll(){
		List<UserEntity> users = userRepository.findAll();
		
		LOGGER.info(users);
	}
}
