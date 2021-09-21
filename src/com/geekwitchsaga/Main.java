package com.geekwitchsaga;

import com.geekwitchsaga.dto.Person;
import com.geekwitchsaga.service.IGeekService;
import com.geekwitchsaga.service.impl.GeekServiceImpl;

/**
 * 
 * @author Ishwar Lal
 * @since 22nd Sep 2021
 *
 */
public class Main {

	/**
	 * Start of the Program
	 * @param args (Arg 1: Age Of Death Person 1, Arg 2: Year Of Death Person 1, Arg 3: Age Of Death Person 2, Arg 4: Year Of Death Person 2) 
	 * (Example : 10 12 13 17)
	 */
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

	/**
	 * All data should be positive integer.
	 * 
	 * @param ageOfDeathPerson1
	 * @param yearOfDeathPerson1
	 * @param ageOfDeathPerson2
	 * @param yearOfDeathPerson2
	 * @return
	 */
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
