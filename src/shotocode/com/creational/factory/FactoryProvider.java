/**
 * 
 * ************************************************************
 *  Copyright (c) 2019 Shotocode.com All rights reserved.
 *	
 *  This work is licensed under the terms of the MIT license.  
 *	For a copy, see <https://opensource.org/licenses/MIT>.
 * ************************************************************
 *	
 * @date Jul 22, 2019
 * @author mbavakha
 */

package shotocode.com.creational.factory;

public class FactoryProvider {

	public Calculator getCalculator(String type){
		if(type.equalsIgnoreCase("add")) {
			return new Addition();
		}else if(type.equalsIgnoreCase("multiply")) {
			return new Multiplication();
		}else if(type.equalsIgnoreCase("division")) {
			return new Division();
		}else if(type.equalsIgnoreCase("subract")) {
			return new Subtraction();
		}
		
		return null;
		
	}
}