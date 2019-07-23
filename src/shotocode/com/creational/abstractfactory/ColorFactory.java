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

public class ColorFactory implements AbstractFactory<Color>{

	@Override
	public Color create(String animalType) {
		
		if(animalType.equalsIgnoreCase("white")) {
			return new White();
		}else if(animalType.equalsIgnoreCase("black")) {
			return new Black();
		}
		
		return null;
		
	}

}
