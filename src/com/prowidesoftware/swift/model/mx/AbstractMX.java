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
 * 
 */
package com.prowidesoftware.swift.model.mx;

import java.util.logging.Logger;

import com.prowidesoftware.swift.Resolver;
import com.prowidesoftware.swift.model.mt.AbstractMT;


/**
 * Base class for specific MX.<br />
 *
 * @author www.prowidesoftware.com
 * @since 7.6
 * @see AbstractMT
 */
public abstract class AbstractMX {
	private static final transient Logger log = Logger
			.getLogger(AbstractMX.class.getName());
	
	protected AbstractMX() {
		// prevent construction
	}
	
	// TODO message is MT parse
	protected static String message(String namespace, AbstractMX obj, Class[]classes) {
		return Resolver.mxWrite().message(namespace, obj, classes);
	}
	
	protected static AbstractMX read(String namespace, Class targetClass, String xml, Class[] classes) {
		return Resolver.mxRead().read(namespace, targetClass, xml, classes);
	}
	
}