package com.prowidesoftware.swift;

import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxWrite;

public class MxWriteCoreV1 implements MxWrite {

	public String message(String namespace, AbstractMX obj, Class[] classes) {
		throw new UnsupportedOperationException("For the moment this is only available in the integrator version");
	}

}
