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

public interface AbstractFactory<T> {
	T create(String type);

}
