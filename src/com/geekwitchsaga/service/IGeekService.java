package com.geekwitchsaga.service;

import com.geekwitchsaga.dto.Person;

public interface IGeekService {
	public Long getNumberOfVillagersKilledByYear(Integer year);
	public Double getAverageOfKillings(Person person1, Person person2);
}
