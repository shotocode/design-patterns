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

public class Usage {

	public static void main(String args[]) {
		FactoryProvider fp = new FactoryProvider();
		AbstractFactory factory = fp.getFactory("animal");
		Dog dog = (Dog) factory.create("dog");
		System.out.println(dog.makeSound());
		
		factory = fp.getFactory("color");
		White white = (White)factory.create("white");
		System.out.println(white.getColor());
		
	}
}
