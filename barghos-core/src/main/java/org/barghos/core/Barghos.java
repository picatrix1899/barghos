/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core;

import org.barghos.core.api.pool.PoolFactory;
import org.barghos.core.pool.DequePoolFactory;

/**
 * This class contains general settings for the barghos core subproject.
 * 
 * @author picatrix1899
 *
 * @since 1.0
 */
public final class Barghos
{
	/**
	 * This build flag, if set to true, adds paramter checks to all functions within the barghos-core subproject,
	 * that have an object or object derivation as a parameter.
	 * 
	 * <p>
	 * This build flag should be used with great care, as it could lead to performance loss.
	 * 
	 * @since 1.0
	 */
	public static final boolean BUILD_FLAG__PARAMETER_CHECKS = false;
	
	
	/**
	 * This property contains the instance of the pool factory used to create all neccessary instance pools in the
	 * barghos-core library.
	 * 
	 * @since 1.0
	 */
	public static PoolFactory INSTANCE_POOL_FACTORY = DequePoolFactory.get();
	
	/**
	 * This class contains only static methods and therefore it should not be possible to create
	 * instances from it.
	 */
	private Barghos() { }
}
