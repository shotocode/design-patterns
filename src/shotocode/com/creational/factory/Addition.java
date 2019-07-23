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
 * @author Katsum
 */

package shotocode.com.creational.factory;

public class Addition implements Calculator{

	@Override
	public void calculate(int a, int b) {
		System.out.println("Addition is: "+(a+b));
	}

}
