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
 * 																							 -- Type1Impl
 * 											 							  			        |			
 * 								  		 		 -- AbstractFactoryImpl -- Type1Interface --
 * 								 				|											|
 * 												|											 -- Type1Impl
 * 	  Provider ----  AbstractFactoryInterface --
 * 								 				|											 -- Type2Impl
 * 												|											|
 * 								  		 		 -- AbstractFactoryImpl -- Type2Interface --
 * 																							|
 * 																							 -- Type2Impl
 *  				
 *  			
 */

package shotocode.com.creational.abstractfactory;

public class FactoryProvider{
	public static AbstractFactory getFactory(String type) {
		if(type.equalsIgnoreCase("animal")) {
			return new AnimalFactory();
		}else if(type.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		
		return null;
	}

}
