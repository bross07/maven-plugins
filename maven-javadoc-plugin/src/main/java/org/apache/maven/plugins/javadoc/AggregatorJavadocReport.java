package org.apache.maven.plugins.javadoc;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * Generates documentation for the <code>Java code</code> in an <b>aggregator</b> project using the standard
 * <a href="http://docs.oracle.com/javase/7/docs/technotes/guides/javadoc/">Javadoc Tool</a>.
 *
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 * @version $Id: AggregatorJavadocReport.java 1749408 2016-06-20 22:54:15Z schulte $
 * @since 2.5
 */
@Mojo( name = "aggregate", aggregator = true, requiresDependencyResolution = ResolutionScope.COMPILE )
@Execute( phase = LifecyclePhase.COMPILE )
public class AggregatorJavadocReport
    extends JavadocReport
{
    @Override
    protected boolean isAggregator()
    {
        return true;
    }
}
