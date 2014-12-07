package com.prowidesoftware.swift;

import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxWrite;

/**
 * Helper class to find implementation of interfaces
 *
 * @since 7.6
 */
public class Resolver {

	private Resolver() {}
	
	public static MxWrite mxWrite() {
		try {
			return (MxWrite) Class.forName("com.prowidesoftware.swift.model.mx.MxWriteIntegartorV1").newInstance();
		} catch (Exception ignored) {}
		return new MxWriteCoreV1();
	}

	public static MxRead mxRead() {
		try {
			return (MxRead) Class.forName("com.prowidesoftware.swift.model.mx.MxReadIntegratorV1").newInstance();
		} catch (Exception ignored) {}
		return new MxReadCoreV1();
	}
}
