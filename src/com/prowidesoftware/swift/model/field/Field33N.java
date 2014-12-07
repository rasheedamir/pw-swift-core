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
import java.util.Currency;
import java.util.Calendar;
import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 33N<br /><br />
 *
 * validation pattern: [N]&lt;DATE2&gt;&lt;CUR&gt;&lt;AMOUNT&gt;15<br />
 * parser pattern: [c]&lt;DATE2&gt;SN<br />
 * components pattern: SECN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Calendar</code></li> 
 * 		<li>component3: <code>Currency</code></li> 
 * 		<li>component4: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field33N extends Field implements Serializable , CurrencyContainer, DateContainer, AmountContainer {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 33N
	 */
    public static final String NAME = "33N";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_33N = "33N";
	public static final String PARSER_PATTERN ="[c]<DATE2>SN";
	public static final String COMPONENTS_PATTERN = "SECN";

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
	public Field33N() {
		super(4);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field33N(String value) {
		this();

		setComponent1(SwiftParseUtils.getAlphaPrefix(value));
		String toParse = SwiftParseUtils.getNumericSuffix(value);
		setComponent2(SwiftParseUtils.getNumericPrefix(toParse));
		String toParse2 = SwiftParseUtils.getAlphaSuffix(toParse);
		setComponent3(SwiftParseUtils.getAlphaPrefix(toParse2));
		setComponent4(SwiftParseUtils.getNumericSuffix(toParse2));
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(joinComponents());
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
	 * Get the Sign (component1).
	 * @return the Sign from component1
	 */
	public String getSign() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field33N setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Sign (component1).
	 * @param component1 the Sign to set
	 */
	public Field33N setSign(String component1) {
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
		return SwiftFormatUtils.getDate2(getComponent(2));
	}

	/**
	 * Get the Date (component2).
	 * @return the Date from component2
	 */
	public String getDate() {
		return getComponent(2);
	}
	
	/**
	 * Get the Date (component2) as Calendar
	 * @return the Date from component2 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getDateAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field33N setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2.
	 * @param component2 the Calendar with the component2 content to set
	 */
	public Field33N setComponent2(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate2(component2));
		return this;
	}
	
	/**
	 * Set the Date (component2).
	 * @param component2 the Date to set
	 */
	public Field33N setDate(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Date (component2) as Calendar
	 * @param component2 Calendar with the Date content to set
	 */
	public Field33N setDate(java.util.Calendar component2) {
		setComponent(2, SwiftFormatUtils.getDate2(component2));
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
	 * Get the component3 as Currency
	 * @return the component3 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent3AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(3));
	}

	/**
	 * Get the Currency (component3).
	 * @return the Currency from component3
	 */
	public String getCurrency() {
		return getComponent(3);
	}
	
	/**
	 * Get the Currency (component3) as Currency
	 * @return the Currency from component3 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field33N setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3.
	 * @param component3 the Currency with the component3 content to set
	 */
	public Field33N setComponent3(java.util.Currency component3) {
		setComponent(3, SwiftFormatUtils.getCurrency(component3));
		return this;
	}
	
	/**
	 * Set the Currency (component3).
	 * @param component3 the Currency to set
	 */
	public Field33N setCurrency(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Currency (component3) as Currency
	 * @param component3 Currency with the Currency content to set
	 */
	public Field33N setCurrency(java.util.Currency component3) {
		setComponent(3, SwiftFormatUtils.getCurrency(component3));
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
	 * Get the component4 as Number
	 * @return the component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent4AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Get the Amount (component4).
	 * @return the Amount from component4
	 */
	public String getAmount() {
		return getComponent(4);
	}
	
	/**
	 * Get the Amount (component4) as Number
	 * @return the Amount from component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getAmountAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field33N setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4.
	 * @param component4 the Number with the component4 content to set
	 */
	public Field33N setComponent4(java.lang.Number component4) {
		setComponent(4, SwiftFormatUtils.getNumber(component4));
		return this;
	}
	
	/**
	 * Set the Amount (component4).
	 * @param component4 the Amount to set
	 */
	public Field33N setAmount(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Amount (component4) as Number
	 * @param component4 Number with the Amount content to set
	 */
	public Field33N setAmount(java.lang.Number component4) {
		setComponent(4, SwiftFormatUtils.getNumber(component4));
		return this;
	}
    
	public List<String> currencyStrings() {
		List<String> result = new ArrayList<String>();
		result = CurrencyResolver.resolveComponentsPattern(COMPONENTS_PATTERN, components);
		return result;
	}

	public List<Currency> currencies() {
		final List<String> l = currencyStrings();
		if (l.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final ArrayList<Currency> result = new ArrayList<Currency>();
		for (String s: l) {
			result.add(Currency.getInstance(s));
		}
		return result;
	}
    
	public Currency currency() {
		return CurrencyResolver.resolveCurrency(this);
	}

	public String currencyString() {
		return CurrencyResolver.resolveCurrencyString(this);
	}

	public void initializeCurrencies(String cur) {
		CurrencyResolver.resolveSetCurrency(this, cur);
	}

	public void initializeCurrencies(Currency cur) {
		CurrencyResolver.resolveSetCurrency(this, cur);
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new java.util.ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate2(getComponent(2)));
		return result;
	}
    
	public List<BigDecimal> amounts() {
		return AmountResolver.amounts(this);
	}
	public BigDecimal amount() {
		return AmountResolver.amount(this);
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
       if (component == 1) {
           return true;
       }
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return false;
   }
   
   public String componentsPattern() {
           return COMPONENTS_PATTERN;
   }

   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	* @deprecated use constant Field33N	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @return null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field33N get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field33N) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field33N in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field33N get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field33N in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static java.util.List<Field33N> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field33N from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field33N> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field33N> result = new java.util.ArrayList<Field33N>(arr.length);
			for (final Field f : arr) {
				result.add((Field33N) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
