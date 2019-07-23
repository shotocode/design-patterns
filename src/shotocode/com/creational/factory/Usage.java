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

public class Usage {

	public static void main(String args[]) {
		MathFactory factory = new MathFactory();
		Calculator calculator = factory.getCalculator("add");
		calculator.calculate(1, 2);
		
		calculator = factory.getCalculator("multiply");
		calculator.calculate(3, 2);
		
		calculator = factory.getCalculator("division");
		calculator.calculate(6, 2);
		
		calculator = factory.getCalculator("subract");
		calculator.calculate(6, 2);
		
		
	}
}
