package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.mutrack.simple.packagee.PackageeEntity;
import org.wpattern.mutrack.simple.packagee.PackageeRepository;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;

public class PackageeRepositoryTest extends AbstractTest{

	private static final Logger LOGGER = Logger.getLogger(PackageeRepositoryTest.class);
	
	@Autowired
	private PackageeRepository packageeRepository;
	
	@Test
	public void testFindAll(){
		List<PackageeEntity> packages = packageeRepository.findAll();
		LOGGER.info(packages);
	}
}
