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

import com.prowidesoftware.swift.DeleteSchedule;

/**
 * Helper class to process BIC related information.
 * 
 * @author www.prowidesoftware.com
 * @since 3.3
 */
public class BIC {
	/**
	 * Fake "test & training" BIC of 8 chars for testing
	 * @since 7.6
	 */
	public static transient final String TEST8 = "TESTUS00";
	/**
	 * Fake Logical terminal address for testing, 
	 * consisting of a fake "test & training" BIC of 12 chars 
	 * (including the terminal identification)
	 * 
	 * @since 7.6
	 * @see SwiftBlock1#getLogicalTerminal()
	 */
	public static transient final String TEST12 = "TESTAR00AXXX";
	
	private String invalidCause = null;
	private String bic8 = null;
	private String branch = null;
	private String subtype = null;
	
	/**
	 * Constructor with BIC code.
	 * It accepts a BIC8, BIC11 or a logical terminal address (12 characters) in which
	 * case the LT identifier at position 9 will be dropped.
	 * 
	 * @param bic the BIC code to use in this BIC
	 */
	public BIC(String bic) {
		super();
		parse(bic);
	}
	
	/**
	 * Parse the given string into the corresponding object attributes.
	 * 
	 * @param bic
	 */
	private void parse(final String bic) {
		if (bic != null) {
			if (bic.length() >= 8) {
				this.bic8 = bic.substring(0, 8).toUpperCase();
			}
			if (bic.length() == 11 || bic.length() == 12) {
				this.branch = bic.substring(bic.length()-3, bic.length()).toUpperCase();
			}
		}		
	}
	
	/**
	 * Default constructor
	 */
	public BIC() {
	}
	
	/**
	 * Get the BIC code of this BIC.
	 * This method does not guarantee that the BIC is valid. use {@link #isValid()}
	 * 
	 * @return a string with the code
	 * @deprecated use getBic8 or getBic11
	 */
	@DeleteSchedule(2016)
	public String getBic() {
		StringBuilder sb = new StringBuilder();
		if (this.bic8 != null) {
			sb.append(this.bic8);
		}
		if (this.branch != null) {
			sb.append(this.branch);
		}
		return sb.toString();
	}
		
	/**
	 * @param bic the BIC code
	 * @deprecated use a suitable constructor
	 */
	@DeleteSchedule(2016)
	public void setBic(String bic) {
		parse(bic);
	}
	
	/**
	 * Get a human readable (english) string that gives information about why the BIC was found invalid.
	 * @return a string or <code>null</code> if there's no invalid cause set
	 */
	public String getInvalidCause() {
		return invalidCause;
	}
	
	/**
	 * Validates a BIC structure.
	 * It only checks that length is 8 or 11 and that the country code is valid.
	 * This method does not validate against any BIC directory.
	 * 
	 * @return <code>true</code> if the BIC is found to be valid and <code>false</code> in other case
	 * @throws IllegalStateException if BIC is <code>null</code>
	 */
	public boolean isValid() {
		if (this.bic8==null) {
			this.invalidCause = "BIC is null";
			return false;
		}
		if ( !( this.bic8.length() == 8 && (this.branch == null || this.branch.length() == 3)) ) {
			this.invalidCause = "BIC must be 8 or 11 chars";
			return false;
		}
		final String country = this.bic8.substring(4,6);
		if (!ISOCountries.getInstance().isValidCode(country.toUpperCase())) {
			this.invalidCause = "Invalid country code: "+country;
			return false;
		}
		return true;
	}
	
	/**
	 * It returns the last three that conform the branch or null if branch is not present.
	 * 
	 * @since 7.4
	 * @return the BIC's branch part or null if not found.
	 */
	String getBranch() {
		return this.branch;
	}
	
	/**
 	 * @since 7.4
	 */
	public String getSubtype() {
		return subtype;
	}
	
	/**
 	 * @since 7.4
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	/**
	 * Returns true if the BIC is a Test & Training BIC code.
	 * In SWIFT’s FIN messaging system, a BIC with a zero 
	 * in the 8th position is a Test & Training BIC, and as 
	 * such it cannot be used in production FIN messages.
	 * 
	 * @return true if it is a T&T BIC, false if is not or if the condition cannot be determined
	 * @since 7.6
	 */
	public boolean isTestAndTraining() {
		if (this.bic8 != null && this.bic8.length() >= 8) {
			return this.bic8.charAt(7) == '0';
		}
		return false;
	}
		
	/**
	 * Returns the first 8 characters of the BIC code.
	 * 
	 * @return the bic8 or null if the BIC has less than 8 characters
	 * @since 7.6
	 */
	public String getBic8() {
		return this.bic8;
	}
	
	/**
	 * Returns the BIC code with 11 characters composed by the first 8 characters of the BIC code,
	 * plus the branch code, dropping the logical terminal identifier at position 9 if present, and
	 * also padding with a default XXX branch if necessary.
	 * 
	 * @return the bic8 or null if the BIC has less than 8 characters
	 * @since 7.6
	 */
	public String getBic11() {
		String branch = this.branch != null? this.branch : "XXX";
		if (this.bic8 != null) {
			return bic8 + branch;
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bic8 == null) ? 0 : bic8.hashCode());
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((invalidCause == null) ? 0 : invalidCause.hashCode());
		result = prime * result + ((subtype == null) ? 0 : subtype.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BIC other = (BIC) obj;
		if (bic8 == null) {
			if (other.bic8 != null)
				return false;
		} else if (!bic8.equals(other.bic8))
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (invalidCause == null) {
			if (other.invalidCause != null)
				return false;
		} else if (!invalidCause.equals(other.invalidCause))
			return false;
		if (subtype == null) {
			if (other.subtype != null)
				return false;
		} else if (!subtype.equals(other.subtype))
			return false;
		return true;
	}

}
