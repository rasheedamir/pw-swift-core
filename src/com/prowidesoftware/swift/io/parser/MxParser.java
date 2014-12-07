/*
 * Copyright (c) http://www.prowidesoftware.com/, 2008. All rights reserved.
 */

package com.prowidesoftware.swift.io.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.prowidesoftware.swift.model.MxNode;
import com.prowidesoftware.swift.model.mx.dic.ApplicationHeader;
import com.prowidesoftware.swift.model.mx.dic.DuplicateIndication;
import com.prowidesoftware.swift.model.mx.dic.EntityIdentification;

/**
 * @since 7.6
 */
public class MxParser {


    /**
     * @since 7.6
     */
    public MxNode parse(InputStream stream) {
        return parse(new InputSource(stream));
    }
    /**
     * @since 7.6
     */
    public MxNode parse(Reader reader) {
        return parse(new InputSource(reader));
    }
    /**
     * Non-namespace aware parse
     * @param inputSource
     */
    private MxNode parse(InputSource inputSource) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setNamespaceAware(true);
            SAXParser saxParser = spf.newSAXParser();
            final ContentHandler contentHandler = new ContentHandler();
            XMLReader xmlReader = saxParser.getXMLReader();
            xmlReader.setContentHandler(contentHandler);
            xmlReader.parse(inputSource);
            return contentHandler.getRootNode();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    * Non Namespace Aware
    * @since 7.6
     */
    private static final class ContentHandler implements org.xml.sax.ContentHandler {
        private static transient final Logger log = Logger.getLogger(ContentHandler.class.getName());

        private MxNode currentNode;
        private MxNode rootNode;

        private MxNode getRootNode() {
            return this.rootNode;
        }

        public void setDocumentLocator(Locator locator) {

        }

        public void startDocument() throws SAXException {
            this.currentNode = null;
        }

        public void endDocument() throws SAXException {

        }

        public void startPrefixMapping(String prefix, String uri) throws SAXException {

        }

        public void endPrefixMapping(String prefix) throws SAXException {

        }

        public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
            if (log.isLoggable(Level.FINE)) {
                log.fine("uri: "+uri+"\nlocalName: "+localName+"\nqName: "+qName+
                                (atts == null ? "" :
                                        "\natts("+atts.getLength()+"): ..."
                                )
                        );
            }
            MxNode node = new MxNode(currentNode, localName);
            currentNode = node;

        }

        public void endElement(String uri, String localName, String qName) throws SAXException {
            log.finer("end: " + localName);

            if (currentNode.getParent() == null) {
                rootNode = currentNode;
            }
            // shouln't overlap
            currentNode = currentNode.getParent();
        }

        public void characters(char[] ch, int start, int length) throws SAXException {
            String v = new String(ch, start, length);
            log.finer("characters: " + v);
            // TODO this may need buffering and be pushed in end element, check with big data and impl specs
            currentNode.setValue(v);
        }

        public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {

        }

        public void processingInstruction(String target, String data) throws SAXException {

        }

        public void skippedEntity(String name) throws SAXException {
            log.fine("skippedEntity: " + name);
        }
    }
    
    // Codigo para evaluacion
    private static transient final String APP_HEADER = "<ApplicationHeader>"
    		+ "</ApplicationHeader>";
    
    public static ApplicationHeader parseApplicationHeader_jaxb() throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance(ApplicationHeader.class, DuplicateIndication.class, EntityIdentification.class);
		 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		long t0 = System.currentTimeMillis();
		jaxbUnmarshaller.unmarshal(new StringReader(APP_HEADER));
		long t1 = System.currentTimeMillis();
		System.out.println("JAXB parse: "+(t1-t0)+"ms");

		return null;
    }
    public static ApplicationHeader parseApplicationHeader_sax() {
    	MxParser mxparser = new MxParser();
    	StringReader reader = new StringReader(APP_HEADER);
		MxNode tree;
		long t0 = System.currentTimeMillis();
		tree = mxparser.parse(reader);
		long t1 = System.currentTimeMillis();
		System.out.println("SAX parse: "+(t1-t0)+"ms");
		return null;
    }
    public static void main(String[] args) {
		try {
			parseApplicationHeader_sax();
			parseApplicationHeader_jaxb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
