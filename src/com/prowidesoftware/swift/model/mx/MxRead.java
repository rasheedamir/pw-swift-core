package com.prowidesoftware.swift.model.mx;

import java.io.Reader;

/**
 * Interface to plug in code that reads XML strings into MX message objects 
 * 
 * @since 7.6
 */
public interface MxRead {

	/**
	 * Read <code>xml</code> into a message object
	 * 
	 * @param namespace namespace of the message to read
	 * @param targetClass class of the message to be read
	 * @param xml the string with the message
	 * @param classes classes for the context
	 * @return
	 * @since 7.6
	 */
	AbstractMX read(String namespace, Class targetClass, String xml, Class[] classes);
	
}
