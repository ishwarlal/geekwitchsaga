package com.geekwitchsaga;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.geekwitchsaga.dto.Person;
import com.geekwitchsaga.service.IGeekService;
import com.geekwitchsaga.service.impl.GeekServiceImpl;

public class GeekServiceImplTest {

	@Test
	public void getNumberOfVillagersKilledByYearTest() {
		
		IGeekService geekService = new GeekServiceImpl();
		
		//Success
		assertEquals(geekService.getNumberOfVillagersKilledByYear(1).longValue(), 1l);
		assertEquals(geekService.getNumberOfVillagersKilledByYear(2).longValue(), 2l);
		assertEquals(geekService.getNumberOfVillagersKilledByYear(3).longValue(), 4l);
		assertEquals(geekService.getNumberOfVillagersKilledByYear(4).longValue(), 7l);
		assertEquals(geekService.getNumberOfVillagersKilledByYear(5).longValue(), 12l);
		assertEquals(geekService.getNumberOfVillagersKilledByYear(6).longValue(), 20l);
		
		//Failures
		//assertNotEquals(geekService.getNumberOfVillagersKilledByYear(7).longValue(), 443l);
	}
	
	@Test
	public void getAverageOfKillingsTest() {
		
		Person person1 = new Person(10, 12);
		Person person2 = new Person(13, 17);
		IGeekService geekService = new GeekServiceImpl();
		assertEquals(0, Double.compare(geekService.getAverageOfKillings(person1, person2), 4.5));
		
		person1 = new Person(10, 2);
		person2 = new Person(13, 17);
		assertEquals(0, Double.compare(geekService.getAverageOfKillings(person1, person2), -1));

	}

}
