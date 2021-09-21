package com.geekwitchsaga;

import com.geekwitchsaga.dto.Person;
import com.geekwitchsaga.service.IGeekService;
import com.geekwitchsaga.service.impl.GeekServiceImpl;

public class Main {

	public static void main(String[] args){
		Integer ageOfDeathPerson1 = Integer.parseInt(args[0]);
		Integer yearOfDeathPerson1 = Integer.parseInt(args[1]);
		Integer ageOfDeathPerson2 = Integer.parseInt(args[2]);
		Integer yearOfDeathPerson2 = Integer.parseInt(args[3]);
		
		if(!validateInputData(ageOfDeathPerson1, yearOfDeathPerson1, ageOfDeathPerson2, yearOfDeathPerson2)) {
			return;
		}
		
        Person person1 = new Person(ageOfDeathPerson1, yearOfDeathPerson1);
        Person person2 = new Person(ageOfDeathPerson2, yearOfDeathPerson2);
        
        
        IGeekService geekService = new GeekServiceImpl();
        System.out.println(geekService.getAverageOfKillings(person1, person2));

    }

	private static Boolean validateInputData(Integer ageOfDeathPerson1, Integer yearOfDeathPerson1,
			Integer ageOfDeathPerson2, Integer yearOfDeathPerson2) {
		
		if(ageOfDeathPerson1<=0) {
			System.out.println("Person 1 (Age of Death) is Invalid Input!");
			return false;
		}
		if(yearOfDeathPerson1<=0) {
			System.out.println("Person 1 (Year of Death) is Invalid Input!");
			return false;
		}
		if(ageOfDeathPerson2<=0) {
			System.out.println("Person 2 (Age of Death) is Invalid Input!");
			return false;
		}
		if(yearOfDeathPerson2<=0) {
			System.out.println("Person 2 (Year of Death) is Invalid Input!");
			return false;
		}
		
		return true;
	}

}
