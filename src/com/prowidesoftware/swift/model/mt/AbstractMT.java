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
package com.prowidesoftware.swift.model.mt;

import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;

import com.prowidesoftware.swift.io.ConversionService;
import com.prowidesoftware.swift.io.IConversionService;
import com.prowidesoftware.swift.model.BIC;
import com.prowidesoftware.swift.model.LogicalTerminalAddress;
import com.prowidesoftware.swift.model.MtSwiftMessage;
import com.prowidesoftware.swift.model.SwiftBlock1;
import com.prowidesoftware.swift.model.SwiftBlock2;
import com.prowidesoftware.swift.model.SwiftBlock2Input;
import com.prowidesoftware.swift.model.SwiftBlock2Output;
import com.prowidesoftware.swift.model.SwiftBlock4;
import com.prowidesoftware.swift.model.SwiftMessage;
import com.prowidesoftware.swift.model.SwiftTagListBlock;
import com.prowidesoftware.swift.model.Tag;
import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.mx.AbstractMX;


/**
 * Base class for specific MTs.<br />
 * This class implements several high level delegate methods of SwiftMessage.
 *
 * @author www.prowidesoftware.com
 * @since 6.0
 * @see AbstractMX
 */
public abstract class AbstractMT {
	private static final transient Logger log = Logger
			.getLogger(AbstractMT.class.getName());
	private SwiftMessage m;
	
	/**
	 * @param m swift message to model as a particular MT
	 */
	public AbstractMT(SwiftMessage m) {
		this.m = m;
	}
	
	/**
	 * @param m swift message to model as a particular MT
	 */
	public AbstractMT(MtSwiftMessage m) {
		this.m = m.getModelMessage();
	}

	/**
	 * Creates a particular MT initialized with a new SwiftMessage.
	 * All blocks are initialized.
	 */
	public AbstractMT() {
		this.m = new SwiftMessage(true);
		if (getMessageType() != null) {
			this.m.getBlock2().setMessageType(getMessageType());
		}
	}
	

	/**
	 * Create an input message for the given type setting TEST BICS as sender and receiver.<br/>
	 * All mandatory header attributes are completed with default values. 
	 * 
	 * @param messageType
	 * @see #AbstractMT(int, String, String)
	 * @since 7.6
	 */
	public AbstractMT( final int messageType ) {
		this(messageType, BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates a new input message for the given type setting the given sender and receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param messageType message type to create
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.6
	 */
	public AbstractMT(final int messageType, final String sender, final String receiver) {
		this.m = new SwiftMessage(true);
		this.m.getBlock1().setSender(sender);
		final SwiftBlock2Input b2 = new SwiftBlock2Input();
        b2.setMessageType(Integer.valueOf(messageType).toString());
        b2.setInput(true);
        b2.setMessagePriority("N");
        b2.setReceiver(receiver);
        this.m.setBlock2(b2);
	}

	/**
	 * @return the swift message object modeled as this particular MT
	 */
	public SwiftMessage getSwiftMessage() {
		return m;
	}

	/**
	 * @param m swift message to model as a particular MT
	 */
	public void setSwiftMessage(SwiftMessage m) {
		this.m = m;
	}
	
	/**
	 * @return application id from block 1
	 * @see SwiftBlock1#getApplicationId()
	 */
	public String getApplicationId() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getApplicationId();
		} else {
			return null;
		}
	}

	/**
	 * @return service id from block 1
	 * @see SwiftBlock1#getServiceId()
	 */
	public String getServiceId() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getServiceId();
		} else {
			return null;
		}
	}

	/**
	 * @return logical terminal from block 1
	 * @see SwiftBlock1#getLogicalTerminal()
	 */
	public String getLogicalTerminal() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getLogicalTerminal();
		} else {
			return null;
		}
	}

	/**
	 * @return session number from block 1
	 * @see SwiftBlock1#getSessionNumber()
	 */
	public String getSessionNumber() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getSessionNumber();
		} else {
			return null;
		}
	}

	/**
	 * @return sequence number from block 1
	 * @see SwiftBlock1#getSequenceNumber()
	 */
	public String getSequenceNumber() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock1() != null) {
			return m.getBlock1().getSequenceNumber();
		} else {
			return null;
		}
	}
	
	/**
	 * @return message priority from block 2
	 * @see com.prowidesoftware.swift.model.SwiftBlock2#getMessagePriority()
	 */
	public String getMessagePriority() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock2() != null) {
			return m.getBlock2().getMessagePriority();
		} else {
			return null;
		}
	}

	/**
	 * @return true if message is an input message sent to SWIFTNet, false otherwise
	 * @see com.prowidesoftware.swift.model.SwiftBlock2#isInput()
	 */
	public boolean isInput() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock2() != null) {
			return m.getBlock2().isInput();
		} else {
			return false;
		}
	}
	
	/**
	 * @return true if message is an output message received from SWIFTNet, false otherwise
	 * @see com.prowidesoftware.swift.model.SwiftBlock2#isOutput()
	 */
	public boolean isOutput() {
		if (getSwiftMessage() == null) {
			throw new IllegalStateException("SwiftMessage was not initialized");
		}
		if (m.getBlock2() != null) {
			return m.getBlock2().isOutput();
		} else {
			return false;
		}
	}
	
	/**
	 * Sets the logical terminal field of the header block.<br> 
	 * The sender addresses will be filled with proper default LT identifier and branch codes if not provided.
	 * 
	 * @since 6.4
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 */
	public void setSender(String sender) {
		if (getSwiftMessage() == null) {
			this.m = new SwiftMessage(true);
		}
		getSwiftMessage().getBlock1().setSender(sender);		
	}
	
	/**
	 * Sets the message header LT address with the parameter BIC code and default LT identifier.
	 * 
	 * @since 6.4
	 * @see SwiftBlock1#setLogicalTerminal(BIC)
	 */
	public void setSender(BIC bic) {
		if (getSwiftMessage() == null) {
			this.m = new SwiftMessage(true);
		}
		getSwiftMessage().getBlock1().setLogicalTerminal(bic);
	}
	
	/**
	 * Gets the logical terminal field of the header block.
	 *  
	 * @return the found address or null if the message or the header block are null.
	 * @since 6.4
	 */
	public String getSender() {
		if (getSwiftMessage() != null && getSwiftMessage().getBlock1() != null) {
			return getSwiftMessage().getBlock1().getLogicalTerminal();
		}
		return null;
	}

	/**
	 * Sets the logical terminal field of the application header block.<br> 
	 * The receiver addresses will be filled with proper default LT identifier and branch codes if not provided.
	 * This method is intended for input messages, for output messages a call to this methods has no effect.
	 * 
	 * @since 6.4
	 * @param receiver the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 */
	public void setReceiver(String receiver) {
		if (getSwiftMessage() == null) {
			this.m = new SwiftMessage(true);
		}
		SwiftBlock2 b2 = getSwiftMessage().getBlock2();
		if (b2.isInput()) {
			((SwiftBlock2Input)b2).setReceiver(receiver);
		}
	}
		
	/**
	 * @since 6.4
	 * @see #setReceiver(String)
	 */
	public void setReceiver(BIC bic) {
		setReceiver(bic.getBic11());
	}

	/**
	 * Gets the logical terminal field of the application header block.<br> 
	 * 
	 * @return the found BIC code of the sender or null if the message or the header block are null.
	 * @since 6.4
	 */
	public String getReceiver() {
		if (getSwiftMessage() != null && getSwiftMessage().getBlock2() != null) {
			SwiftBlock2 b2 = getSwiftMessage().getBlock2();
			if (b2.isInput()) {
				return ((SwiftBlock2Input)b2).getReceiverAddress();
			} else {
				return ((SwiftBlock2Output)b2).getMIRLogicalTerminal();			
			}
		}
		return null;
	}

	/**
	 * Adds the given field to the body block.
	 * @param f
	 */
	public void addField(Field f) {
		if (getSwiftMessage() == null) {
			this.m = new SwiftMessage();
		}
		getSwiftMessage().getBlock4().add(f);
	}
	
	/**
	 * Gets a String containing the FIN message (SWIFT MT message).
	 * 
	 * @return a string with the FIN format representation of the message
	 */
	public String FIN() {
		this.m.removeEmptyBlocks();
		IConversionService srv = new ConversionService();
		return srv.getFIN(this.m);
	}
	


	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	public abstract String getMessageType();
	

	/**
	 * @since 7.6
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<SwiftTagListBlock> getSequenceList(final String name) {
		final String methodName = "getSequence"+name+"List";
		Object o = invokeHere(methodName);
		return (List<SwiftTagListBlock>)o;
	}
	/**
	 * @since 7.6
	 * @param methodName
	 * @return
	 */
	private Object invokeHere(String methodName) {
		try {
			Method method = getClass().getMethod(methodName);
			return method.invoke(this);
		} catch (Exception e) {
			log.warning("An error occured while invoking "+methodName+" in "+this);
			return null;
		}
	}

	/**
	 * @since 7.6
	 * @param name
	 * @return
	 */
	public SwiftTagListBlock getSequence(final String name) {
		final String methodName = "getSequence"+name;
		Object o = invokeHere(methodName);
		return (SwiftTagListBlock)o;
	}

	@Override
	public String toString() {
		return "AbstractMT [m=" + m + "]";
	}
	
	/**
	 * Create a blank message for the given category setting TEST bics as sender and receiver
	 * @param messageType
	 * @return
	 * @see #create(int, String, String)
	 * @since 7.6
	 */
	public static AbstractMT create( final int messageType ) {
		return create(messageType, BIC.TEST8, BIC.TEST8);
	}
	/**
	 * Create a blank message for the given category setting the given sender and receiver BICs
	 * @param messageType
	 * @param sender
	 * @param receiver
	 * @return
	 * @since 7.6
	 */
	public static AbstractMT create( final int messageType , final String sender, final String receiver) {
		final SwiftMessage sm = new SwiftMessage(true);
		final SwiftBlock2Input b2 = new SwiftBlock2Input();
        b2.setMessageType(Integer.valueOf(messageType).toString());
        b2.setInput(true);
        // TODO revisar valores de inicializacion
        b2.setMessagePriority("N");
        b2.setDeliveryMonitoring("2");
        b2.setObsolescencePeriod("020");
        sm.setBlock2(b2);
		final AbstractMT result = sm.toMT();
		result.setSender(StringUtils.rightPad(sender, 12, 'X'));
		result.setReceiver(StringUtils.rightPad(receiver, 12, 'X'));
		return result;
	}
	
	/**
	 * Add all tags from block to the end of the block4
	 * @param block
	 * @return
	 * @since 7.6
	 */
	public AbstractMT append(final SwiftTagListBlock block) {
		Validate.notNull(block);
		if (!block.isEmpty())
			b4().addTags(block.getTags());
		return this;
	}
	/**
	 * Add all tags to the end of the block4 
	 * @param tags
	 * @return
	 * @since 7.6
	 */
	public AbstractMT append(final Tag ... tags) {
		Validate.notNull(tags);
		if (tags.length>0) {
			for (final Tag t : tags) {
				b4().addTag(t);				
			}
		}
		return this;
	}
	/**
	 * Add all the fields to the end of the block4
	 * @param fields
	 * @return
	 * @since 7.6
	 */
	public AbstractMT append(final Field ... fields) {
		Validate.notNull(fields);
		if (fields.length>0) {
			for (final Field t : fields) {
				b4().add(t);				
			}
		}
		return this;
	}
	private SwiftBlock4 b4() {
		if (this.m == null) {
			throw new IllegalStateException("SwiftMessage is null");
		} else {
			final SwiftBlock4 b4 = this.m.getBlock4();
			if (b4 == null) {
				this.m.setBlock4(new SwiftBlock4());
				return this.m.getBlock4();
			}
			return b4;
		}
	}
}