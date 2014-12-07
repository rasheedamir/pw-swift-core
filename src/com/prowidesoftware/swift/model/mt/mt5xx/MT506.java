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
package com.prowidesoftware.swift.model.mt.mt5xx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.internal.*;
import com.prowidesoftware.swift.internal.SequenceStyle.Type;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;

/**
 * MT 506<br />
 * Collateral and Exposure Statement<br />
 * <em>SRU 2014</em><br /> 
 *
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 */
public class MT506 extends AbstractMT implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "506";
// begin qualifiers constants	

	/**
	* Constant for qualifier with value ACRU 
	*/
	public static final String ACRU = "ACRU";

	/**
	* Constant for qualifier with value ADDINFO 
	*/
	public static final String ADDINFO = "ADDINFO";

	/**
	* Constant for qualifier with value AEXP 
	*/
	public static final String AEXP = "AEXP";

	/**
	* Constant for qualifier with value AGRE 
	*/
	public static final String AGRE = "AGRE";

	/**
	* Constant for qualifier with value BCOL 
	*/
	public static final String BCOL = "BCOL";

	/**
	* Constant for qualifier with value CCAL 
	*/
	public static final String CCAL = "CCAL";

	/**
	* Constant for qualifier with value CCAM 
	*/
	public static final String CCAM = "CCAM";

	/**
	* Constant for qualifier with value CCOL 
	*/
	public static final String CCOL = "CCOL";

	/**
	* Constant for qualifier with value CHAI 
	*/
	public static final String CHAI = "CHAI";

	/**
	* Constant for qualifier with value CHAR 
	*/
	public static final String CHAR = "CHAR";

	/**
	* Constant for qualifier with value COLA 
	*/
	public static final String COLA = "COLA";

	/**
	* Constant for qualifier with value COLD 
	*/
	public static final String COLD = "COLD";

	/**
	* Constant for qualifier with value COLL 
	*/
	public static final String COLL = "COLL";

	/**
	* Constant for qualifier with value COLR 
	*/
	public static final String COLR = "COLR";

	/**
	* Constant for qualifier with value COMI 
	*/
	public static final String COMI = "COMI";

	/**
	* Constant for qualifier with value CONM 
	*/
	public static final String CONM = "CONM";

	/**
	* Constant for qualifier with value COPC 
	*/
	public static final String COPC = "COPC";

	/**
	* Constant for qualifier with value CORE 
	*/
	public static final String CORE = "CORE";

	/**
	* Constant for qualifier with value COVA 
	*/
	public static final String COVA = "COVA";

	/**
	* Constant for qualifier with value CPTA 
	*/
	public static final String CPTA = "CPTA";

	/**
	* Constant for qualifier with value CPTB 
	*/
	public static final String CPTB = "CPTB";

	/**
	* Constant for qualifier with value CPTR 
	*/
	public static final String CPTR = "CPTR";

	/**
	* Constant for qualifier with value CRET 
	*/
	public static final String CRET = "CRET";

	/**
	* Constant for qualifier with value DAAC 
	*/
	public static final String DAAC = "DAAC";

	/**
	* Constant for qualifier with value DEAL 
	*/
	public static final String DEAL = "DEAL";

	/**
	* Constant for qualifier with value DEPO 
	*/
	public static final String DEPO = "DEPO";

	/**
	* Constant for qualifier with value EXCH 
	*/
	public static final String EXCH = "EXCH";

	/**
	* Constant for qualifier with value EXER 
	*/
	public static final String EXER = "EXER";

	/**
	* Constant for qualifier with value EXPD 
	*/
	public static final String EXPD = "EXPD";

	/**
	* Constant for qualifier with value EXPI 
	*/
	public static final String EXPI = "EXPI";

	/**
	* Constant for qualifier with value EXPO 
	*/
	public static final String EXPO = "EXPO";

	/**
	* Constant for qualifier with value EXPP 
	*/
	public static final String EXPP = "EXPP";

	/**
	* Constant for qualifier with value GENL 
	*/
	public static final String GENL = "GENL";

	/**
	* Constant for qualifier with value GUAR 
	*/
	public static final String GUAR = "GUAR";

	/**
	* Constant for qualifier with value INDA 
	*/
	public static final String INDA = "INDA";

	/**
	* Constant for qualifier with value INIM 
	*/
	public static final String INIM = "INIM";

	/**
	* Constant for qualifier with value ISSU 
	*/
	public static final String ISSU = "ISSU";

	/**
	* Constant for qualifier with value LINK 
	*/
	public static final String LINK = "LINK";

	/**
	* Constant for qualifier with value LOCR 
	*/
	public static final String LOCR = "LOCR";

	/**
	* Constant for qualifier with value MARG 
	*/
	public static final String MARG = "MARG";

	/**
	* Constant for qualifier with value MEOR 
	*/
	public static final String MEOR = "MEOR";

	/**
	* Constant for qualifier with value MERE 
	*/
	public static final String MERE = "MERE";

	/**
	* Constant for qualifier with value MICO 
	*/
	public static final String MICO = "MICO";

	/**
	* Constant for qualifier with value MITR 
	*/
	public static final String MITR = "MITR";

	/**
	* Constant for qualifier with value MKTV 
	*/
	public static final String MKTV = "MKTV";

	/**
	* Constant for qualifier with value MRKT 
	*/
	public static final String MRKT = "MRKT";

	/**
	* Constant for qualifier with value NRAD 
	*/
	public static final String NRAD = "NRAD";

	/**
	* Constant for qualifier with value OPCA 
	*/
	public static final String OPCA = "OPCA";

	/**
	* Constant for qualifier with value OPTI 
	*/
	public static final String OPTI = "OPTI";

	/**
	* Constant for qualifier with value PACO 
	*/
	public static final String PACO = "PACO";

	/**
	* Constant for qualifier with value PEVA 
	*/
	public static final String PEVA = "PEVA";

	/**
	* Constant for qualifier with value PRCV 
	*/
	public static final String PRCV = "PRCV";

	/**
	* Constant for qualifier with value PREP 
	*/
	public static final String PREP = "PREP";

	/**
	* Constant for qualifier with value PREV 
	*/
	public static final String PREV = "PREV";

	/**
	* Constant for qualifier with value PRHA 
	*/
	public static final String PRHA = "PRHA";

	/**
	* Constant for qualifier with value PRIC 
	*/
	public static final String PRIC = "PRIC";

	/**
	* Constant for qualifier with value PTYA 
	*/
	public static final String PTYA = "PTYA";

	/**
	* Constant for qualifier with value PTYB 
	*/
	public static final String PTYB = "PTYB";

	/**
	* Constant for qualifier with value RADD 
	*/
	public static final String RADD = "RADD";

	/**
	* Constant for qualifier with value RATS 
	*/
	public static final String RATS = "RATS";

	/**
	* Constant for qualifier with value RCTR 
	*/
	public static final String RCTR = "RCTR";

	/**
	* Constant for qualifier with value RECA 
	*/
	public static final String RECA = "RECA";

	/**
	* Constant for qualifier with value RELA 
	*/
	public static final String RELA = "RELA";

	/**
	* Constant for qualifier with value REPA 
	*/
	public static final String REPA = "REPA";

	/**
	* Constant for qualifier with value REPO 
	*/
	public static final String REPO = "REPO";

	/**
	* Constant for qualifier with value REPV 
	*/
	public static final String REPV = "REPV";

	/**
	* Constant for qualifier with value ROUN 
	*/
	public static final String ROUN = "ROUN";

	/**
	* Constant for qualifier with value RSET 
	*/
	public static final String RSET = "RSET";

	/**
	* Constant for qualifier with value SCOL 
	*/
	public static final String SCOL = "SCOL";

	/**
	* Constant for qualifier with value SCTR 
	*/
	public static final String SCTR = "SCTR";

	/**
	* Constant for qualifier with value SECS 
	*/
	public static final String SECS = "SECS";

	/**
	* Constant for qualifier with value SECV 
	*/
	public static final String SECV = "SECV";

	/**
	* Constant for qualifier with value SEME 
	*/
	public static final String SEME = "SEME";

	/**
	* Constant for qualifier with value SETT 
	*/
	public static final String SETT = "SETT";

	/**
	* Constant for qualifier with value SHAI 
	*/
	public static final String SHAI = "SHAI";

	/**
	* Constant for qualifier with value STRT 
	*/
	public static final String STRT = "STRT";

	/**
	* Constant for qualifier with value SUMD 
	*/
	public static final String SUMD = "SUMD";

	/**
	* Constant for qualifier with value SUMM 
	*/
	public static final String SUMM = "SUMM";

	/**
	* Constant for qualifier with value TACR 
	*/
	public static final String TACR = "TACR";

	/**
	* Constant for qualifier with value TCHA 
	*/
	public static final String TCHA = "TCHA";

	/**
	* Constant for qualifier with value TCOP 
	*/
	public static final String TCOP = "TCOP";

	/**
	* Constant for qualifier with value TCRL 
	*/
	public static final String TCRL = "TCRL";

	/**
	* Constant for qualifier with value TERM 
	*/
	public static final String TERM = "TERM";

	/**
	* Constant for qualifier with value TEXA 
	*/
	public static final String TEXA = "TEXA";

	/**
	* Constant for qualifier with value TEXP 
	*/
	public static final String TEXP = "TEXP";

	/**
	* Constant for qualifier with value THRS 
	*/
	public static final String THRS = "THRS";

	/**
	* Constant for qualifier with value THRU 
	*/
	public static final String THRU = "THRU";

	/**
	* Constant for qualifier with value TPIN 
	*/
	public static final String TPIN = "TPIN";

	/**
	* Constant for qualifier with value TPOU 
	*/
	public static final String TPOU = "TPOU";

	/**
	* Constant for qualifier with value TRAD 
	*/
	public static final String TRAD = "TRAD";

	/**
	* Constant for qualifier with value TREA 
	*/
	public static final String TREA = "TREA";

	/**
	* Constant for qualifier with value TRRF 
	*/
	public static final String TRRF = "TRRF";

	/**
	* Constant for qualifier with value VALC 
	*/
	public static final String VALC = "VALC";

	/**
	* Constant for qualifier with value VALE 
	*/
	public static final String VALE = "VALE";
// end qualifiers constants	
	private static transient final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT506.class.getName());

	/**
	 * Creates an MT506 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT506 content
	 */
	public MT506(SwiftMessage m) {
		super(m);
		// TODO issue warning if incorrect message type or illegal argument if different
	}

	/**
	 * Creates an MT506 initialized with the parameter MtSwiftMessage
	 * @param m swift message with the MT506 content
	 */
	public MT506(MtSwiftMessage m) {
		super(m);
		// TODO issue warning if incorrect message type or illegal argument if different
	}
	
	/**
	 * Creates and initializes a new MT506 input message setting TEST BICS as sender and receiver.<br />
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT506() {
		super(506);
	}
	
	/**
	 * Creates and initializes a new MT506 input message from sender to receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param messageType message type to create
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.6
	 */
	public MT506(final int messageType, final String sender, final String receiver) {
		super(506, sender, receiver);
	}
	
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "506";
	}
	
	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT506 append(final SwiftTagListBlock block) {
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
	public MT506 append(final Tag ... tags) {
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
	public MT506 append(final Field ... fields) {
		super.append(fields);
		return this;
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23G at MT506 is expected to be the only one.
	 * 
	 * @return a Field23G object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23G getField23G() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("23G");
			if (t == null) {
				log.fine("field 23G not found");
				return null;
			} else {
				return new Field23G(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 98E at MT506 is expected to be the only one.
	 * 
	 * @return a Field98E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98E getField98E() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("98E");
			if (t == null) {
				log.fine("field 98E not found");
				return null;
			} else {
				return new Field98E(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 12B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 12B at MT506 is expected to be the only one.
	 * 
	 * @return a Field12B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field12B getField12B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("12B");
			if (t == null) {
				log.fine("field 12B not found");
				return null;
			} else {
				return new Field12B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 90A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 90A at MT506 is expected to be the only one.
	 * 
	 * @return a Field90A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field90A getField90A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("90A");
			if (t == null) {
				log.fine("field 90A not found");
				return null;
			} else {
				return new Field90A(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 90B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 90B at MT506 is expected to be the only one.
	 * 
	 * @return a Field90B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field90B getField90B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return null;
		} else {
			final Tag t = getSwiftMessage().getBlock4().getTagByName("90B");
			if (t == null) {
				log.fine("field 90B not found");
				return null;
			} else {
				return new Field90B(t.getValue());
			}
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 20C at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field20C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field20C> getField20C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("20C");
			final List<Field20C> result = new ArrayList<Field20C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field20C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16R at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16R> getField16R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("16R");
			final List<Field16R> result = new ArrayList<Field16R>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field16R(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22F at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22F> getField22F() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22F");
			final List<Field22F> result = new ArrayList<Field22F>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22F(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98A at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98A> getField98A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98A");
			final List<Field98A> result = new ArrayList<Field98A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 13B at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13B> getField13B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("13B");
			final List<Field13B> result = new ArrayList<Field13B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field13B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70C at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70C> getField70C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("70C");
			final List<Field70C> result = new ArrayList<Field70C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field70C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 16S at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16S> getField16S() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("16S");
			final List<Field16S> result = new ArrayList<Field16S>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field16S(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95P at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95P objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95P> getField95P() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95P");
			final List<Field95P> result = new ArrayList<Field95P>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95P(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95Q at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95Q objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95Q> getField95Q() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95Q");
			final List<Field95Q> result = new ArrayList<Field95Q>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95Q(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 95R at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95R> getField95R() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("95R");
			final List<Field95R> result = new ArrayList<Field95R>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field95R(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 13A at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13A> getField13A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("13A");
			final List<Field13A> result = new ArrayList<Field13A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field13A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 19B at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field19B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field19B> getField19B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("19B");
			final List<Field19B> result = new ArrayList<Field19B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field19B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98C at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98C> getField98C() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98C");
			final List<Field98C> result = new ArrayList<Field98C>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98C(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22H at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22H objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22H> getField22H() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("22H");
			final List<Field22H> result = new ArrayList<Field22H>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field22H(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 19A at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field19A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field19A> getField19A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("19A");
			final List<Field19A> result = new ArrayList<Field19A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field19A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 99A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 99A at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field99A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field99A> getField99A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("99A");
			final List<Field99A> result = new ArrayList<Field99A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field99A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92A at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92A> getField92A() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92A");
			final List<Field92A> result = new ArrayList<Field92A>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92A(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 92B at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92B> getField92B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("92B");
			final List<Field92B> result = new ArrayList<Field92B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field92B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 70D at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70D> getField70D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("70D");
			final List<Field70D> result = new ArrayList<Field70D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field70D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 25D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 25D at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field25D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field25D> getField25D() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("25D");
			final List<Field25D> result = new ArrayList<Field25D>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field25D(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35B at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35B> getField35B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("35B");
			final List<Field35B> result = new ArrayList<Field35B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field35B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 36B at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field36B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field36B> getField36B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("36B");
			final List<Field36B> result = new ArrayList<Field36B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field36B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 94B at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94B> getField94B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("94B");
			final List<Field94B> result = new ArrayList<Field94B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field94B(tags[i].getValue()));
			}
			return result;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 98B at MT506 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98B> getField98B() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (getSwiftMessage().getBlock4() == null) {
			log.info("block4 is null");
			return Collections.emptyList();
		} else {
			final Tag[] tags = getSwiftMessage().getBlock4().getTagsByName("98B");
			final List<Field98B> result = new ArrayList<Field98B>();
			for (int i=0; i<tags.length; i++) {
				result.add(new Field98B(tags[i].getValue()));
			}
			return result;
		}
	}
	

/*
 * sequences code
 *
 */ 


// BaseSequenceCodeGenerator [seq=A]
	public static class SequenceA extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>GENL</em>
		*/
		public static final String START_END_16RS = "GENL";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceA newInstance(final Tag ... tags) {
			final SequenceA result = new SequenceA();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceA newInstance() {
			final SequenceA result = new SequenceA();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceA newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA result = new SequenceA();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceA(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the single occurrence of SequenceA delimited by 16R/16S the value of SequenceA#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceA</code> is returned</em>  
	* @see SequenceA#START_END_16RS
	*/ 
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceA getSequenceA() {
		return new SequenceA(this.getSwiftMessage());
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=A1]
	public static class SequenceA1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>AGRE</em>
		*/
		public static final String START_END_16RS = "AGRE";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceA1 newInstance(final Tag ... tags) {
			final SequenceA1 result = new SequenceA1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceA1 newInstance() {
			final SequenceA1 result = new SequenceA1();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceA1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA1 result = new SequenceA1();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceA1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceA1 delimited by 16R/16S with value specified in SequenceA1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceA1#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceA1> getSequenceA1List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceA1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceA1> result = new ArrayList<SequenceA1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceA1(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=A2]
	public static class SequenceA2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>LINK</em>
		*/
		public static final String START_END_16RS = "LINK";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceA2 newInstance(final Tag ... tags) {
			final SequenceA2 result = new SequenceA2();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceA2 newInstance() {
			final SequenceA2 result = new SequenceA2();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceA2 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA2 result = new SequenceA2();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceA2(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceA2 delimited by 16R/16S with value specified in SequenceA2#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceA2#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceA2> getSequenceA2List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceA2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceA2> result = new ArrayList<SequenceA2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceA2(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=B]
	public static class SequenceB extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SUMM</em>
		*/
		public static final String START_END_16RS = "SUMM";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB newInstance(final Tag ... tags) {
			final SequenceB result = new SequenceB();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceB newInstance() {
			final SequenceB result = new SequenceB();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceB newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB result = new SequenceB();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the single occurrence of SequenceB delimited by 16R/16S the value of SequenceB#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB</code> is returned</em>  
	* @see SequenceB#START_END_16RS
	*/ 
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB getSequenceB() {
		return new SequenceB(this.getSwiftMessage());
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=B1]
	public static class SequenceB1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SUMD</em>
		*/
		public static final String START_END_16RS = "SUMD";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB1 newInstance(final Tag ... tags) {
			final SequenceB1 result = new SequenceB1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceB1 newInstance() {
			final SequenceB1 result = new SequenceB1();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceB1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB1 result = new SequenceB1();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the single occurrence of SequenceB1 delimited by 16R/16S the value of SequenceB1#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceB1</code> is returned</em>  
	* @see SequenceB1#START_END_16RS
	*/ 
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB1 getSequenceB1() {
		return new SequenceB1(this.getSwiftMessage());
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=C]
	public static class SequenceC extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>EXPD</em>
		*/
		public static final String START_END_16RS = "EXPD";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC newInstance(final Tag ... tags) {
			final SequenceC result = new SequenceC();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceC newInstance() {
			final SequenceC result = new SequenceC();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceC newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC result = new SequenceC();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceC(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceC delimited by 16R/16S with value specified in SequenceC#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceC#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC> getSequenceCList() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC> result = new ArrayList<SequenceC>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=C1]
	public static class SequenceC1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SECS</em>
		*/
		public static final String START_END_16RS = "SECS";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC1 newInstance(final Tag ... tags) {
			final SequenceC1 result = new SequenceC1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceC1 newInstance() {
			final SequenceC1 result = new SequenceC1();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceC1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC1 result = new SequenceC1();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceC1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceC1 delimited by 16R/16S with value specified in SequenceC1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceC1#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC1> getSequenceC1List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC1> result = new ArrayList<SequenceC1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC1(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=C2]
	public static class SequenceC2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>TREA</em>
		*/
		public static final String START_END_16RS = "TREA";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC2 newInstance(final Tag ... tags) {
			final SequenceC2 result = new SequenceC2();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceC2 newInstance() {
			final SequenceC2 result = new SequenceC2();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceC2 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC2 result = new SequenceC2();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceC2(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceC2 delimited by 16R/16S with value specified in SequenceC2#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceC2#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC2> getSequenceC2List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC2> result = new ArrayList<SequenceC2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC2(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=C3]
	public static class SequenceC3 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC3() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC3(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>REPV</em>
		*/
		public static final String START_END_16RS = "REPV";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC3 newInstance(final Tag ... tags) {
			final SequenceC3 result = new SequenceC3();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceC3 newInstance() {
			final SequenceC3 result = new SequenceC3();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceC3 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC3 result = new SequenceC3();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceC3(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceC3 delimited by 16R/16S with value specified in SequenceC3#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceC3#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC3> getSequenceC3List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceC3.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC3> result = new ArrayList<SequenceC3>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceC3(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=D]
	public static class SequenceD extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>COLD</em>
		*/
		public static final String START_END_16RS = "COLD";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceD newInstance(final Tag ... tags) {
			final SequenceD result = new SequenceD();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceD newInstance() {
			final SequenceD result = new SequenceD();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceD newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD result = new SequenceD();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceD(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceD delimited by 16R/16S with value specified in SequenceD#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceD#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceD> getSequenceDList() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceD.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceD> result = new ArrayList<SequenceD>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceD(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=D1]
	public static class SequenceD1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SCOL</em>
		*/
		public static final String START_END_16RS = "SCOL";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceD1 newInstance(final Tag ... tags) {
			final SequenceD1 result = new SequenceD1();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceD1 newInstance() {
			final SequenceD1 result = new SequenceD1();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceD1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD1 result = new SequenceD1();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceD1(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceD1 delimited by 16R/16S with value specified in SequenceD1#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceD1#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceD1> getSequenceD1List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceD1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceD1> result = new ArrayList<SequenceD1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceD1(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=D2]
	public static class SequenceD2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD2() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD2(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CCOL</em>
		*/
		public static final String START_END_16RS = "CCOL";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceD2 newInstance(final Tag ... tags) {
			final SequenceD2 result = new SequenceD2();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceD2 newInstance() {
			final SequenceD2 result = new SequenceD2();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceD2 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD2 result = new SequenceD2();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceD2(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceD2 delimited by 16R/16S with value specified in SequenceD2#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceD2#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceD2> getSequenceD2List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceD2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceD2> result = new ArrayList<SequenceD2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceD2(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=D3]
	public static class SequenceD3 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD3() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD3(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>BCOL</em>
		*/
		public static final String START_END_16RS = "BCOL";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceD3 newInstance(final Tag ... tags) {
			final SequenceD3 result = new SequenceD3();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceD3 newInstance() {
			final SequenceD3 result = new SequenceD3();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceD3 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD3 result = new SequenceD3();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceD3(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the list of SequenceD3 delimited by 16R/16S with value specified in SequenceD3#START_END_16RS 
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard.
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SequenceD3#START_END_16RS 
	*/
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceD3> getSequenceD3List() {
		final List<SwiftTagListBlock> blocks = getSwiftMessage().getBlock4().getSubBlocks(SequenceD3.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceD3> result = new ArrayList<SequenceD3>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				result.add(new SequenceD3(b));
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()


// BaseSequenceCodeGenerator [seq=E]
	public static class SequenceE extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceE() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceE(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ADDINFO</em>
		*/
		public static final String START_END_16RS = "ADDINFO";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		*/
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceE newInstance(final Tag ... tags) {
			final SequenceE result = new SequenceE();

			result.addTag(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.addTag(t);
				}
			}

			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.6
		*/
		public static SequenceE newInstance() {
			final SequenceE result = new SequenceE();

			result.addTag(START_TAG);
			
			result.addTag(END_TAG);

			return result;
		}

		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.6
		*/
		public static SequenceE newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceE result = new SequenceE();

			result.addTag(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			result.addTag(END_TAG);

			return result;

		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceE(final SwiftMessage m) {
			super(m.getBlock4().getSubBlock(START_END_16RS).getTags());
		}
	}
	/**
	* Get the single occurrence of SequenceE delimited by 16R/16S the value of SequenceE#START_END_16RS.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* <em>NOTE: this method never returns <code>null</code>. If the sequence is not found an empty instance
	* of <code>SequenceE</code> is returned</em>  
	* @see SequenceE#START_END_16RS
	*/ 
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceE getSequenceE() {
		return new SequenceE(this.getSwiftMessage());
	}
 	// Slice debug: com.prowidesoftware.swift.codegen.DelimitedSequenceCodeGenerator
	// Slice debug: $s.isSliceHeuristic()





}
