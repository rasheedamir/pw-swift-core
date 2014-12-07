/*
 * Copyright (c) http://www.prowidesoftware.com/, 2008. All rights reserved.
 */

package com.prowidesoftware.swift.model;

import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

// TODO needs javadoc
/**
 * A node element of tree of MX messages
 * @since 7.6
 */
public class MxNode {
    public static  transient final String PATH_SEPARATOR = "/";
    private MxNode parent;
    private List<MxNode> children;
    private String value;
    private String localName;

    public MxNode() {
        this.parent = null;
        this.children = new ArrayList<MxNode>();
        this.value = null;
    }

    public MxNode(MxNode parent, String localName) {
        this();
        this.localName = localName;
        if (parent != null) {
            bindParent(parent);
        }
    }

    private void bindParent(MxNode parent) {
        this.parent = parent;
        parent.addChild(this);
    }

    private void addChild(MxNode child) {
        this.children.add(child);
    }


    public String singlePathValue(String path) {
        final MxNode first = findFirst(path);
        if (first != null) {
            return first.getValue();
        }
        return null;
    }

    private MxNode findFirst(String path) {
        final MxNode root = getRoot();
        final String[] segments = StringUtils.split(path, PATH_SEPARATOR);
        return findFirst(0, segments, getRoot());
    }
    private static MxNode findFirst(int level, String[]segments, MxNode node) {

        if (StringUtils.equals(node.localName, segments[level])) {
            if (level+1 == segments.length) {
                return node;
            }
            if (level+1 < segments.length) {
                for (MxNode c : node.children) {
                    level++;
                    MxNode result = findFirst(level, segments, c);
                    if (result != null) {
                        return result;
                    }
                }
            }
        }
        return null;
    }

    public MxNode getRoot() {
        return _getRoot(this);
    }

    private static MxNode _getRoot(MxNode mxNode) {
        if (mxNode == null) return null;
        return mxNode.parent == null ? mxNode : _getRoot(mxNode.parent);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MxNode{" +
                "localName='" + localName + '\'' +
                '}';
    }

    public void print() {
        PrintStream w = System.out;
        try {
            _print(0, getRoot(), w);
        } catch (IOException e) {
            // TODO handle exception
            e.printStackTrace();
        }
    }

    private void _print(int level, MxNode node, PrintStream w) throws IOException {

        for (int i=0;i<level;i++) {
            w.write("   ".getBytes());
        }
        w.write((node.localName + "\n").getBytes());
        level++;
        for(MxNode child : node.children) {
            _print(level, child, w );
        }

    }

    public MxNode getParent() {
        return parent;
    }
}
