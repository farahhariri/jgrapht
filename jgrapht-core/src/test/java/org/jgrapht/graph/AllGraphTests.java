/* ==========================================
 * JGraphT : a free Java graph-theory library
 * ==========================================
 *
 * Project Info:  http://jgrapht.sourceforge.net/
 * Project Creator:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
 *
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
/* -----------------
 * AllGraphTests.java
 * -----------------
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * Original Author:  Barak Naveh
 * Contributor(s):   -
 *
 * $Id$
 *
 * Changes
 * -------
 * 03-Aug-2003 : Initial revision (BN);
 *
 */
package org.jgrapht.graph;

import org.junit.runner.*;
import org.junit.runners.*;

/**
 * A TestSuite for all tests in this package.
 *
 * @author Barak Naveh
 * @since Aug 3, 2003
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    AsUndirectedGraphTest.class,
    AsUnweightedGraphTest.class,
    AsWeightedGraphTest.class,
    CloneTest.class,
    DefaultDirectedGraphTest.class,
    EqualsAndHashCodeTest.class,
    GenericGraphsTest.class,
    ListenableGraphTest.class,
    SerializationTest.class,
    SimpleDirectedGraphTest.class,
    SimpleGraphPathTest.class,
    SubgraphTest.class,
    SimpleIdentityDirectedGraphTest.class
})
public final class AllGraphTests
{
}
// End AllGraphTests.java
