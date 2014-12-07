package com.prowidesoftware.swift;

import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;

public class MxReadCoreV1 implements MxRead {

	public AbstractMX read(String namespace, Class targetClass, String xml, Class[] classes) {
		throw new UnsupportedOperationException("For the moment this is only available in the integrator version");
	}

}
