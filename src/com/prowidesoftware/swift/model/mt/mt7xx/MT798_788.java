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
package com.prowidesoftware.swift.model.mt.mt7xx;

import java.io.Serializable;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.internal.*;
import com.prowidesoftware.swift.internal.SequenceStyle.Type;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 798_788<br />
 * Free Format Message - Corporate-to-Bank Index<br />
 * <em>SRU $dto.schemeRelease</em><br /> 
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT798_788 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "798_788";
// begin qualifiers constants	

	/**
	* Constant for qualifier with value BICC 
	*/
	public static final String BICC = "BICC";

	/**
	* Constant for qualifier with value COUR 
	*/
	public static final String COUR = "COUR";

	/**
	* Constant for qualifier with value EMAL 
	*/
	public static final String EMAL = "EMAL";

	/**
	* Constant for qualifier with value FACT 
	*/
	public static final String FACT = "FACT";

	/**
	* Constant for qualifier with value FAXT 
	*/
	public static final String FAXT = "FAXT";

	/**
	* Constant for qualifier with value MAIL 
	*/
	public static final String MAIL = "MAIL";

	/**
	* Constant for qualifier with value OTHR 
	*/
	public static final String OTHR = "OTHR";
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT798_788.class.getName());

	/**
	 * Creates an MT798_788 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT798_788 content
	 */
	public MT798_788(SwiftMessage m) {
		super(m);
		// TODO issue warning if incorrect message type or illegal argument if different
	}

	/**
	 * Creates an MT798_788 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT798_788 content
	 */
	public MT798_788(MtSwiftMessage m) {
		super(m);
		// TODO issue warning if incorrect message type or illegal argument if different
	}
	
	/**
	 * Creates and initializes a new MT798_788 input message setting TEST BICS as sender and receiver.<br />
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT798_788() {
		super(798788);
	}
	
	/**
	 * Creates and initializes a new MT798_788 input message from sender to receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param messageType message type to create
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.6
	 */
	public MT798_788(final int messageType, final String sender, final String receiver) {
		super(798788, sender, receiver);
	}
	
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "798788";
	}
	
	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT798_788 append(final SwiftTagListBlock block) {
		super.append(block);
		return this;
	}
	
	/**
	 * Add all tags to the end of the block4.
	 *
	 * @param tags to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT798_788 append(final Tag ... tags) {
		super.append(tags);
		return this;
	}
	
	/**
	 * Add all the fields to the end of the block4.
	 *
	 * @param fields to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT798_788 append(final Field ... fields) {
		super.append(fields);
		return this;
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field20 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field20 getField20() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("20");
			if (t == null) {
				log.fine("field 20 not found");
				return null;
			} else {
				return new Field20(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 12, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 12 at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field12 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field12 getField12() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("12");
			if (t == null) {
				log.fine("field 12 not found");
				return null;
			} else {
				return new Field12(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 77E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 77E at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field77E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field77E getField77E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("77E");
			if (t == null) {
				log.fine("field 77E not found");
				return null;
			} else {
				return new Field77E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 27A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 27A at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field27A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field27A getField27A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("27A");
			if (t == null) {
				log.fine("field 27A not found");
				return null;
			} else {
				return new Field27A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21A at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field21A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21A getField21A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21A");
			if (t == null) {
				log.fine("field 21A not found");
				return null;
			} else {
				return new Field21A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21R, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21R at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field21R object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21R getField21R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("21R");
			if (t == null) {
				log.fine("field 21R not found");
				return null;
			} else {
				return new Field21R(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 13E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 13E at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field13E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field13E getField13E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("13E");
			if (t == null) {
				log.fine("field 13E not found");
				return null;
			} else {
				return new Field13E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 29A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29A at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field29A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field29A getField29A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("29A");
			if (t == null) {
				log.fine("field 29A not found");
				return null;
			} else {
				return new Field29A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 72C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 72C at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field72C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field72C getField72C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("72C");
			if (t == null) {
				log.fine("field 72C not found");
				return null;
			} else {
				return new Field72C(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23X, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23X at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field23X object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23X getField23X() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23X");
			if (t == null) {
				log.fine("field 23X not found");
				return null;
			} else {
				return new Field23X(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 29S, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29S at MT798_788 is expected to be the only one.
	 * 
	 * @return a Field29S object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field29S getField29S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("29S");
			if (t == null) {
				log.fine("field 29S not found");
				return null;
			} else {
				return new Field29S(t.getValue());
			}
		}
	}
	

/*
 * sequences code
 *
 */ 





}
