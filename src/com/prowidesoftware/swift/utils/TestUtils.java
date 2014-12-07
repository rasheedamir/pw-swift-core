/*
 * Copyright (c) http://www.prowidesoftware.com/, 2013. All rights reserved.
 */
package com.prowidesoftware.swift.utils;

import java.util.ArrayList;
import java.util.List;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.Field119;
import com.prowidesoftware.swift.model.field.Field16R;
import com.prowidesoftware.swift.model.field.Field16S;
import com.prowidesoftware.swift.model.mt.mt5xx.MT507;

import org.apache.commons.lang.Validate;

/**
 * Utility methods for test cases
 *
 * @author www.prowidesoftware.com
 */
public class TestUtils {


    public static SwiftMessage createMT(int type) {
        final SwiftMessage result = new SwiftMessage(true);
        final SwiftBlock2Input b2 = new SwiftBlock2Input();
        b2.setMessageType(""+type);
        b2.setInput(true);
        b2.setMessagePriority("N");
        b2.setDeliveryMonitoring("2");
        b2.setObsolescencePeriod("020");
        b2.setReceiverAddress("12345612XXXX");
        result.setBlock2(b2);
        return result;
    }
	/**
	 * create a message of given type, initialize blocks and add in order tags param in block 4 
	 * @param i
	 * @param tags
	 * @return
	 */
	public static SwiftMessage createMT(int i, Tag ... tags ) {
        com.prowidesoftware.swift.model.SwiftMessage result = createMT(i);
		if (tags != null && tags.length>0) {
			for (Tag t:tags) {
				result.getBlock4().addTag(t);
			}
		}
		return result;
	}
    public static SwiftMessage createMT(int i, com.prowidesoftware.swift.model.SwiftTagListBlock ... blocks ) {
        SwiftMessage result = createMT(i);

        if (blocks != null && blocks.length>0) {
            for (com.prowidesoftware.swift.model.SwiftTagListBlock b:blocks) {
                result.getBlock4().getTags().addAll(b.getTags());
            }
        }
        return result;
    }

	/**
	 * Adds the given tags in the message, surrounded with sequence boundaries for given sequence name.
	 */
	public static SwiftMessage addSeq(SwiftMessage msg, String sequenceIdentifier, Tag ... tags) {
		msg.getBlock4().addTag(new Tag("16R", sequenceIdentifier));
		if (tags != null && tags.length>0) {
			for (Tag t:tags) {
				msg.getBlock4().addTag(t);
			}
		}		
		msg.getBlock4().addTag(new Tag("16S", sequenceIdentifier));
		return msg;
	}

	/**
	 * enclose tags in B4 with the given 16R/S tags.
	 * additional tags, if any, are added right after the first 16R:sequenceIdentifier
	 */
	public static SwiftMessage enclose(SwiftMessage msg, String sequenceIdentifier, Tag ... tags) {
		List<Tag> block4 = msg.getBlock4().getTags();
		block4.add(0, new Tag("16R", sequenceIdentifier));
		if (tags != null && tags.length>0) {
			for (int i=tags.length-1;i>=0;i--) {
				block4.add(1, tags[i]);
			}
		}		
		block4.add(new Tag("16S", sequenceIdentifier));
		return msg;
	}

	public static SwiftMessage createMTwithEmptyTags(int i, String ... tags) {
		SwiftMessage r = createMT(i, (Tag[])null);
		if (tags != null && tags.length>0) {
			for (String n : tags) {
				r.getBlock4().addTag(new Tag(n, "ignored"));
			}
		}
		return r;
	}

	public static void setSTP(SwiftMessage m) {
		SwiftBlock3 b3 = m.getBlock3();
		if (b3 == null) {
			m.addBlock(new SwiftBlock3());
		}
		if (b3.containsTag(Field119.NAME)) {
			b3.getTagByName(Field119.NAME).setValue("STP");
		} else {
			b3.addTag(Field119.tag("STP"));
		}
	}

	public static Tag[] newSeq(String startEnd16rs, Tag ... tags ) {
		final ArrayList<Tag> result = new ArrayList<Tag>();
		result.add(new Tag(Field16R.NAME, startEnd16rs));
		if (tags != null && tags.length>0) {
			for (Tag t:tags) {
				result.add(t);
			}
		}
		result.add(new Tag(Field16S.NAME, startEnd16rs));
		return (Tag[]) result.toArray(new Tag[result.size()]);
	}


    /**
     * Appends block to the block4 of the given message.
     * @param m the message that will be appended the block
     * @param block block to append
     * @throws  java.lang.IllegalArgumentException if m or block is null
     */
    public static void append(SwiftMessage m, SwiftTagListBlock block) {
        Validate.notNull(m, "message must not be null");
        Validate.notNull(block, "block must not be null");
        m.getBlock4().append(block);
    }
	public static void readFile(String string) {
		// TODO Auto-generated method stub
		
	}
}
