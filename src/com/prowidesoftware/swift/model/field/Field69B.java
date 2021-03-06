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
package com.prowidesoftware.swift.model.field;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 69B<br /><br />
 *
 * validation pattern: :4!c//&lt;DATE4&gt;&lt;TIME2&gt;/&lt;DATE4&gt;&lt;TIME2&gt;<br />
 * parser pattern: :S//&lt;DATE4&gt;&lt;TIME2&gt;/&lt;DATE4&gt;&lt;TIME2&gt;<br />
 * components pattern: SDTDT<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>Calendar</code></li> 
 * 		<li>component4: <code>Calendar</code></li> 
 * 		<li>component5: <code>Calendar</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field69B extends Field implements Serializable , DateContainer, GenericField {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 69B
	 */
    public static final String NAME = "69B";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_69B = "69B";
	public static final String PARSER_PATTERN =":S//<DATE4><TIME2>/<DATE4><TIME2>";
	public static final String COMPONENTS_PATTERN = "SDTDT";

	/**
	* Create a Tag with this field name and the given value.
	* Shorthand for <code>new Tag(NAME, value)</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag tag(final String value) {
		return new Tag(NAME, value);
	}

	/**
	* Create a Tag with this field name and an empty string as value
	* Shorthand for <code>new Tag(NAME, "")</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag emptyTag() {
		return new Tag(NAME, "");
	}


	/**
	 * Default constructor
	 */
	public Field69B() {
		super(5);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field69B(String value) {
		this();

		setComponent1(SwiftParseUtils.getTokenFirst(value, ":", "//"));
		String toparse = SwiftParseUtils.getTokenSecondLast(value, "//");
		String toparse2 = SwiftParseUtils.getTokenFirst(toparse, "/");
		String toparse3 = SwiftParseUtils.getTokenSecondLast(toparse, "/");
		if (toparse2 != null) {
			if (toparse2.length() >= 8) {
				setComponent2(org.apache.commons.lang.StringUtils.substring(toparse2, 0, 8));
			}
			if (toparse2.length() > 8) {
				setComponent3(org.apache.commons.lang.StringUtils.substring(toparse2, 8));
			}
		}
	        if (toparse3 != null) {
			if (toparse3.length() >= 8) {
				setComponent4(org.apache.commons.lang.StringUtils.substring(toparse3, 0, 8));
			}
			if (toparse3.length() > 8) {
				setComponent5(org.apache.commons.lang.StringUtils.substring(toparse3, 8));
			}
		}
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(":");
		result.append(StringUtils.trimToEmpty(getComponent1()));
		result.append("//");
		result.append(StringUtils.trimToEmpty(getComponent2()));
		result.append(StringUtils.trimToEmpty(getComponent3()));
		result.append("/");
		result.append(StringUtils.trimToEmpty(getComponent4()));
		result.append(StringUtils.trimToEmpty(getComponent5()));
		return result.toString();
	}


	/**
	 * Get the component1
	 * @return the component1
	 */
	public String getComponent1() {
		return getComponent(1);
	}

	/**
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the Qualifier (component1).
	 * @return the Qualifier from component1
	 */
	public String getQualifier() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field69B setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Qualifier (component1).
	 * @param component1 the Qualifier to set
	 */
	public Field69B setQualifier(String component1) {
		setComponent(1, component1);
		return this;
	}

	/**
	 * Get the component2
	 * @return the component2
	 */
	public String getComponent2() {
		return getComponent(2);
	}

	/**
	 * Get the component2 as Calendar
	 * @return the component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent2AsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(2));
	}

	/**
	 * Get the Start Date (component2).
	 * @return the Start Date from component2
	 */
	public String getStartDate() {
		return getComponent(2);
	}
	
	/**
	 * Get the Start Date (component2) as Calendar
	 * @return the Start Date from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getStartDateAsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field69B setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field69B setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate4(component2));
		return this;
	}
	
	/**
	 * Set the Start Date (component2).
	 * @param component2 the Start Date to set
	 */
	public Field69B setStartDate(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Start Date (component2) as Calendar
	 * @param component2 Calendar with the Start Date content to set
	 */
	public Field69B setStartDate(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate4(component2));
		return this;
	}

	/**
	 * Get the component3
	 * @return the component3
	 */
	public String getComponent3() {
		return getComponent(3);
	}

	/**
	 * Get the component3 as Calendar
	 * @return the component3 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent3AsCalendar() {
		return SwiftFormatUtils.getTime2(getComponent(3));
	}

	/**
	 * Get the Start Time (component3).
	 * @return the Start Time from component3
	 */
	public String getStartTime() {
		return getComponent(3);
	}
	
	/**
	 * Get the Start Time (component3) as Calendar
	 * @return the Start Time from component3 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getStartTimeAsCalendar() {
		return SwiftFormatUtils.getTime2(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field69B setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Calendar with the component3 content to set
	 */
	public Field69B setComponent3(java.util.Calendar component3) {
		setComponent(3, SwiftFormatUtils.getTime2(component3));
		return this;
	}
	
	/**
	 * Set the Start Time (component3).
	 * @param component3 the Start Time to set
	 */
	public Field69B setStartTime(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Start Time (component3) as Calendar
	 * @param component3 Calendar with the Start Time content to set
	 */
	public Field69B setStartTime(java.util.Calendar component3) {
		setComponent(3, SwiftFormatUtils.getTime2(component3));
		return this;
	}

	/**
	 * Get the component4
	 * @return the component4
	 */
	public String getComponent4() {
		return getComponent(4);
	}

	/**
	 * Get the component4 as Calendar
	 * @return the component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent4AsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(4));
	}

	/**
	 * Get the End Date (component4).
	 * @return the End Date from component4
	 */
	public String getEndDate() {
		return getComponent(4);
	}
	
	/**
	 * Get the End Date (component4) as Calendar
	 * @return the End Date from component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getEndDateAsCalendar() {
		return SwiftFormatUtils.getDate4(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field69B setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Calendar with the component4 content to set
	 */
	public Field69B setComponent4(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getDate4(component4));
		return this;
	}
	
	/**
	 * Set the End Date (component4).
	 * @param component4 the End Date to set
	 */
	public Field69B setEndDate(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the End Date (component4) as Calendar
	 * @param component4 Calendar with the End Date content to set
	 */
	public Field69B setEndDate(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getDate4(component4));
		return this;
	}

	/**
	 * Get the component5
	 * @return the component5
	 */
	public String getComponent5() {
		return getComponent(5);
	}

	/**
	 * Get the component5 as Calendar
	 * @return the component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent5AsCalendar() {
		return SwiftFormatUtils.getTime2(getComponent(5));
	}

	/**
	 * Get the End Time (component5).
	 * @return the End Time from component5
	 */
	public String getEndTime() {
		return getComponent(5);
	}
	
	/**
	 * Get the End Time (component5) as Calendar
	 * @return the End Time from component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getEndTimeAsCalendar() {
		return SwiftFormatUtils.getTime2(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field69B setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5.
	 * @param component5 the Calendar with the component5 content to set
	 */
	public Field69B setComponent5(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime2(component5));
		return this;
	}
	
	/**
	 * Set the End Time (component5).
	 * @param component5 the End Time to set
	 */
	public Field69B setEndTime(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the End Time (component5) as Calendar
	 * @param component5 Calendar with the End Time content to set
	 */
	public Field69B setEndTime(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime2(component5));
		return this;
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new java.util.ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate4(getComponent(2)));
		result.add(SwiftFormatUtils.getTime2(getComponent(3)));
		result.add(SwiftFormatUtils.getDate4(getComponent(4)));
		result.add(SwiftFormatUtils.getTime2(getComponent(5)));
		return result;
	}

   /**
    * Given a component number it returns true if the component is optional,
    * regardless of the field being mandatory in a particular message.<br />
    * Being the field's value conformed by a composition of one or several 
    * internal component values, the field may be present in a message with
    * a proper value but with some of its internal components not set.
    *
    * @param component component number, first component of a field is referenced as 1
    * @return true if the component is optional for this field, false otherwise
    */
   @Override
   public boolean isOptional(int component) {   
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return true;
   }

   /**
    * Returns the issuer code (or Data Source Scheme or DSS).
    * The DSS is only present in some generic fields, when present, is equals to component two.
    *
    * @return DSS component value or <code>null</code> if the DSS is not set or not available for this field.
    */
   public String getDSS() {
       return null;
   }

   /**
    * Checks if the issuer code (or Data Source Scheme or DSS) is present.
    *
    * @see #getDSS()
    * @return true if DSS is present, false otherwise.
    */
   public boolean isDSSPresent() {
       return getDSS() != null;
   }
   
   /**
    * Gets the conditional qualifier.<br />
    * The conditional qualifier is the the component following the DSS of generic fields, being component 2 or 3 depending on the field structure definition.
    *
    * @return for generic fields returns the value of the conditional qualifier or <code>null</code> if not set or not applicable for this kind of field.
    */
   public String getConditionalQualifier() {
       return getComponent2();
   }
   
   public String componentsPattern() {
           return COMPONENTS_PATTERN;
   }

   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	* @deprecated use constant Field69B	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @return null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field69B get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field69B) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field69B in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field69B get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field69B in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static java.util.List<Field69B> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field69B from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field69B> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field69B> result = new java.util.ArrayList<Field69B>(arr.length);
			for (final Field f : arr) {
				result.add((Field69B) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
