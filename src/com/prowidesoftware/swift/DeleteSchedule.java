/* 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
*/
package com.prowidesoftware.swift;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Used to mark classes / methods or fields that are deprecated and will eventually be removed. 
 * @since 7.6
 */
@Retention(RetentionPolicy.SOURCE)
public @interface DeleteSchedule {

	/**
	 * Year by which it is scheduled to be removed.
	 * It may not be specified.
	 * This is intended for cases where replacing the code to be deleted do not have trivial replacement
	 */
	int value() default 0;
	/**
	 * Month (1-12) of the year by which it is scheduled to be removed.
	 * If not specified January
	 */
	int month() default 1;
	
	/**
	 * Optional URL with explanation or sample code 
	 */
	String url() default "";
}
