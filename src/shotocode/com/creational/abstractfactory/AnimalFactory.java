/**
 * 
 * ************************************************************
 *  Copyright (c) 2019 Shotocode.com All rights reserved.
 *	
 *  This work is licensed under the terms of the MIT license.  
 *	For a copy, see <https://opensource.org/licenses/MIT>.
 * ************************************************************
 *	
 * @date Jul 23, 2019
 * @author Katsum
 */

package shotocode.com.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

	@Override
	public Animal create(String animalType) {
		
		if(animalType.equalsIgnoreCase("dog")) {
			return new Dog();
		}else if(animalType.equalsIgnoreCase("cat")) {
			return new Cat();
		}
		
		return null;
	}
	

}
