/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ClassifyDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassifyDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     */
    private java.util.List<DocumentClass> classes;

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * 
     * @return The classes used by the document being analyzed. These are used for multi-class trained models.
     *         Individual classes are mutually exclusive and each document is expected to have only a single class
     *         assigned to it. For example, an animal can be a dog or a cat, but not both at the same time.
     */

    public java.util.List<DocumentClass> getClasses() {
        return classes;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * 
     * @param classes
     *        The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     *        classes are mutually exclusive and each document is expected to have only a single class assigned to it.
     *        For example, an animal can be a dog or a cat, but not both at the same time.
     */

    public void setClasses(java.util.Collection<DocumentClass> classes) {
        if (classes == null) {
            this.classes = null;
            return;
        }

        this.classes = new java.util.ArrayList<DocumentClass>(classes);
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClasses(java.util.Collection)} or {@link #withClasses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param classes
     *        The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     *        classes are mutually exclusive and each document is expected to have only a single class assigned to it.
     *        For example, an animal can be a dog or a cat, but not both at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withClasses(DocumentClass... classes) {
        if (this.classes == null) {
            setClasses(new java.util.ArrayList<DocumentClass>(classes.length));
        }
        for (DocumentClass ele : classes) {
            this.classes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * 
     * @param classes
     *        The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     *        classes are mutually exclusive and each document is expected to have only a single class assigned to it.
     *        For example, an animal can be a dog or a cat, but not both at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withClasses(java.util.Collection<DocumentClass> classes) {
        setClasses(classes);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClasses() != null)
            sb.append("Classes: ").append(getClasses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifyDocumentResult == false)
            return false;
        ClassifyDocumentResult other = (ClassifyDocumentResult) obj;
        if (other.getClasses() == null ^ this.getClasses() == null)
            return false;
        if (other.getClasses() != null && other.getClasses().equals(this.getClasses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClasses() == null) ? 0 : getClasses().hashCode());
        return hashCode;
    }

    @Override
    public ClassifyDocumentResult clone() {
        try {
            return (ClassifyDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
