/********************************************************************************
 * Copyright (c) 2011-2017 Red Hat Inc. and/or its affiliates and others
 *
 * This program and the accompanying materials are made available under the 
 * terms of the Apache License, Version 2.0 which is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-License-Identifier: Apache-2.0 
 ********************************************************************************/
package org.eclipse.ceylon.compiler.java.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Applied to a default parameter value method, 
 * the string default value.
 * 
 * Within a {@link StringExprs}, the string value of the "literal" 
 * expression.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface StringValue {
    String name() default "";
    String[] value();
}
