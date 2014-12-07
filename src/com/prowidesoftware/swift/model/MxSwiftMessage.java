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
package com.prowidesoftware.swift.model;


import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;

import com.prowidesoftware.swift.model.mx.dic.ApplicationHeader;
import com.prowidesoftware.swift.utils.Lib;

/**
 * Object that contains both raw and model representations of an MX SWIFT message.
 * ISO 20022.<br />
 * 
 * <p>MMX messages are uniquely identify by their business process, message functionality, variant and version.<br />
 * Consider the following example: TREA.001.001.02
 * <ul>
 * <li>TREA refers to 'Treasury'</li>
 * <li>001 refers to 'NDF opening (notification)'</li>
 * <li>001 refers to the variant</li>
 * <li>02 refers to the version message format, in this case version 2 of 'NDF opening' type.</li>
 * </ul>
 * </p>
 * 
 * <p>This model object contains general information of the messages as well as its raw XML content.</p>
 * 
 * @author www.prowidesoftware.com
 * @since 7.0
 */
public class MxSwiftMessage extends AbstractSwiftMessage {
	private static final long serialVersionUID = 1L;

	/**
	 * Alphabetic code in four positions (fixed length) identifying the Business Process
	 */
	private MxBusinessProcess businessProcess;
	
	/**
	 * Alphanumeric code in three positions (fixed length) identifying the Message Functionality
	 */
	private String functionality;
	
	/**
	 * Numeric code in three positions (fixed length) identifying a particular flavour (variant) of Message Functionality
	 */
	private String variant;
	
	/**
	 * Numeric code in two positions (fixed length) identifying the version.
	 */
	private String version;

	private ApplicationHeader applicationHeader;

	public MxSwiftMessage() {
		super();
	}
	
	public MxBusinessProcess getBusinessProcess() {
		return businessProcess;
	}

	public void setBusinessProcess(MxBusinessProcess businessProcess) {
		this.businessProcess = businessProcess;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((businessProcess == null) ? 0 : businessProcess.hashCode());
		result = prime * result
				+ ((functionality == null) ? 0 : functionality.hashCode());
		result = prime * result + ((variant == null) ? 0 : variant.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MxSwiftMessage other = (MxSwiftMessage) obj;
		if (businessProcess != other.businessProcess)
			return false;
		if (functionality == null) {
			if (other.functionality != null)
				return false;
		} else if (!functionality.equals(other.functionality))
			return false;
		if (variant == null) {
			if (other.variant != null)
				return false;
		} else if (!variant.equals(other.variant))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

    /**
     * @since 7.6
     */
    @Override
    public MxSwiftMessage readFile(File file) throws IOException {
        MxSwiftMessage result = new MxSwiftMessage();
        result.setMessage(Lib.readFile(file));
        result.setFilename(file.getAbsolutePath());
        return result;
    }
	

	protected void setDataFromNamespace(String namespace) {
		Validate.notNull(namespace, "namespace can not be null");
		final String[] tokens = StringUtils.split(namespace, '.');
		if (tokens == null || tokens.length<4) {
			throw new RuntimeException("Expected at least 4 tokens in namespace '"+namespace+"'");
		}
		// always last 4 tokens
		final String bp = tokens[tokens.length-4]; 
		final String func = tokens[tokens.length-3]; 
		final String var = tokens[tokens.length-2]; 
		final String ver = tokens[tokens.length-1];
		
		final MxBusinessProcess bpEnum;
		try {
			bpEnum = MxBusinessProcess.valueOf(bp);
		} catch (Exception e) {
			throw new RuntimeException("Unknown business process '"+bp+"'");
		}
		setBusinessProcess(bpEnum);
		setFunctionality(func);
		setVariant(var);
		setVersion(ver);
	}

	public ApplicationHeader getApplicationHeader() {
		return applicationHeader;
	}

	public void setApplicationHeader(ApplicationHeader applicationHeader) {
		this.applicationHeader = applicationHeader;
	}
}
