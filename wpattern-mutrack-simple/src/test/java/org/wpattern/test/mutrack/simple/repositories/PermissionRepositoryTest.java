package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.mutrack.simple.permission.PermissionEntity;
import org.wpattern.mutrack.simple.permission.PermissionRepository;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;

public class PermissionRepositoryTest extends AbstractTest {
	
	private static final Logger LOGGER = Logger.getLogger(PermissionRepositoryTest.class);
	
	@Autowired
	private PermissionRepository permissionRepository;
	
	@Test
	public void testFindAll(){
		List<PermissionEntity> permissions = permissionRepository.findAll();
		LOGGER.info(permissions);
	}

}
