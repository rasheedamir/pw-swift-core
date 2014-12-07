package com.prowidesoftware.swift.model.mx;


/**
 * Interface to plug in code that serializes MX message objects to XML string
 *
 * @since 7.6
 */
public interface MxWrite {
	
	/**
	 * Converts obj into a xml string
	 * 
	 * @param namespace the namespace for the target message
	 * @param obj the object containing the message to be serialized
	 * @param classes array of all classes used or referenced by message class  
	 * @return
	 * @since 7.6
	 */
	String message(String namespace, AbstractMX obj, Class[]classes);
	
}
