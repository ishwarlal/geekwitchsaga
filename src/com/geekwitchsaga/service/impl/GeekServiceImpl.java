package com.geekwitchsaga.service.impl;

import com.geekwitchsaga.dto.Person;
import com.geekwitchsaga.math.Fibonacci;
import com.geekwitchsaga.service.IGeekService;

/**
 * 
 * @author Ishwar Lal
 * @since 22nd Sep 2021
 *
 */
public class GeekServiceImpl implements IGeekService {

	/**
	 * Get Number of Villagers will be killed by Witch based on Year.
	 */
	public Long getNumberOfVillagersKilledByYear(Integer year) {
		Long sum = 0l;
        for (int i = 1; i <= year; i++)
            sum += Fibonacci.getFibonacci(i);
        return sum;
	}
	
	/**
	 * Get Average Killings of Witch
	 */
	public Double getAverageOfKillings(Person person1, Person person2) {
		
		if(person1.getBornAge()<=0 || person2.getBornAge()<=0) {
			return (double)-1;
		}
		
		return (double)(getNumberOfVillagersKilledByYear(person1.getBornAge()) + getNumberOfVillagersKilledByYear(person2.getBornAge()))/2;
	}
	
}
