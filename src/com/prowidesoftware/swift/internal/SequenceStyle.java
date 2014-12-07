package com.prowidesoftware.swift.internal;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Mark detecting sequences strategy used.
 * <em>Internal use</em> 
 * <ol>
 * 		<li> <code>Type.GENERATED_16RS</code> </li>
 * 		<li> <code>Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL</code> </li>
 * 		<li> <code>Type.GENERATED_SLICE</code> </li>
 * </ol>
 */
@Retention(RetentionPolicy.SOURCE)
public @interface SequenceStyle {
	public enum Type { GENERATED_16RS, GENERATED_FIXED_WITH_OPTIONAL_TAIL, GENERATED_SLICE }
	
	Type value();
}
