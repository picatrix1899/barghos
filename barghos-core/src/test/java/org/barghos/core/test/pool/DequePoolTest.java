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

package org.barghos.core.test.pool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.pool.DequePool;
import org.barghos.core.tuple2.Tup2f;
import org.barghos.core.util.BufferUtils;

/**
 * This class provides component tests for the class {@link DequePool}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class DequePoolTest
{
	/**
	 * This test ensures, that the constructor {@link DequePool#DequePool(Class)}
	 * doesn't fail and the pool size is 0 after creation.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
	}
	
	/**
	 * This test ensures, that the constructor {@link DequePool#DequePool(Class, int)}
	 * doesn't fail and the pool contains as many instances as spezified to ensure.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEnsuredTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class, 4);
		
		assertEquals(4, pool.size());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#get()}
	 * does create a new instance and returns it if there are no stored instances in the pool.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void get_NewTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
		assertNotNull(pool.get());
		assertEquals(0, pool.size());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#get()}
	 * does not create a new instance and instead returns one of the stored instances.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void get_StoredTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		Tup2f t = new Tup2f();
		
		pool.store(t);
		
		assertSame(t, pool.get());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#get()}
	 * throws an {@link Error} if it has to create a new instance and
	 * there is no default constructor for the type of the pool.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void get_NewNoStandardContructorTest()
	{
		DequePool<BufferUtils> pool = new DequePool<>(BufferUtils.class);
		
		try
		{
			pool.get();
		}
		catch(Error e)
		{
			return;
		}
		
		fail();
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#getNew()}
	 * returns a new instance.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getNewTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
		assertNotNull(pool.getNew());
		assertEquals(0, pool.size());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#getNew()}
	 * throws an {@link Error} if there is no default constructor for the type of the pool.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getNew_NoStandardContructorTest()
	{
		DequePool<BufferUtils> pool = new DequePool<>(BufferUtils.class);
		
		try
		{
			pool.getNew();
		}
		catch(Error e)
		{
			return;
		}
		
		fail();
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#store(Object...)}
	 * stores the instances in the pool correctly and returns the correct number of
	 * added instances.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void storeTest()
	{
		Tup2f t1 = new Tup2f();
		Tup2f t2 = new Tup2f();
		Tup2f t3 = new Tup2f();
		
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
		assertEquals(3, pool.store(t1, t2, t3));
		assertEquals(3, pool.size());
		
		assertSame(t3, pool.get());
		assertSame(t2, pool.get());
		assertSame(t1, pool.get());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#store(Object...)}
	 * stores the instances in the pool correctly and returns the correct number of
	 * added instances if one of the elements given by the paramter is null.
	 * if one of the instances is null, the null value will not be stored in the pool
	 * and the result of the {@link DequePool#store(Object...)} will therefore be reduced by one.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void store_WithNullTest()
	{
		Tup2f t1 = new Tup2f();
		Tup2f t3 = new Tup2f();
		
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
		assertEquals(2, pool.store(t1, null, t3));
		assertEquals(2, pool.size());
		
		assertSame(t3, pool.get());
		assertSame(t1, pool.get());
		
		assertEquals(0, pool.size());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#store(Object...)}
	 * does not alter the instance pool if no instances are passed by the parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void store_NoInstanceTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
		assertEquals(0, pool.store());
		assertEquals(0, pool.size());
	}
	
	/**
	 * This test ensures, that the method {@link DequePool#ensure(int)}
	 * does create new instances to fill the pool to the spezified size
	 * when the pool is empty.
	 * 
	 *  @since 1.0.0.0
	 */
	@Test
	void ensure_EmptyTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
		
		pool.ensure(4);
		
		assertEquals(4, pool.size());
	}
	
	/**
	 * This test ensures, that the method {@link DequePool#ensure(int)}
	 * does create new instances to fill the pool to the spezified size
	 * when there are already instances in the pool.
	 * 
	 *  @since 1.0.0.0
	 */
	@Test
	void ensure_PrefilledTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		Tup2f t1 = new Tup2f();
		Tup2f t2 = new Tup2f();
		
		pool.store(t1, t2);
		
		assertEquals(2, pool.size());
		
		pool.ensure(4);
		
		assertEquals(4, pool.size());
		
		assertNotSame(t2, pool.get());
		assertNotSame(t2, pool.get());
		assertSame(t2, pool.get());
		assertSame(t1, pool.get());
	}
	
	/**
	 * This test ensures, that the method {@link DequePool#ensure(int)}
	 * does not do anything if the ensured size is 0.
	 * 
	 *  @since 1.0.0.0
	 */
	@Test
	void ensure_ZeroTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		Tup2f t1 = new Tup2f();
		Tup2f t2 = new Tup2f();
		
		pool.store(t1, t2);
		
		assertEquals(2, pool.size());
		
		pool.ensure(0);
		
		assertEquals(2, pool.size());
		
		assertSame(t2, pool.get());
		assertSame(t1, pool.get());
	}
	
	/**
	 * This test ensures, that the method {@link DequePool#ensure(int)}
	 * throws an {@link IllegalArgumentException} if the ensured size
	 * is negative.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ensure_NegativeTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		try
		{
			pool.ensure(-1);
		}
		catch(IllegalArgumentException e)
		{
			return;
		}
		
		fail();
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#reduce()}
	 * reduces the size of the pool to the ensured size.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void reduceTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		Tup2f t1 = new Tup2f();
		Tup2f t2 = new Tup2f();
		Tup2f t3 = new Tup2f();
		Tup2f t4 = new Tup2f();
		
		pool.store(t1, t2, t3, t4);
		
		pool.ensure(2);
		
		assertEquals(4, pool.size());
		
		pool.reduce();
		
		assertEquals(2, pool.size());
		assertSame(t2, pool.get());
		assertSame(t1, pool.get());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#reduce()}
	 * does not alter the instance pool if in the pool are less or as many instances
	 * as should be ensured.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void reduce_LessThanEnsuredTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		Tup2f t1 = new Tup2f();
		Tup2f t2 = new Tup2f();
		
		pool.ensure(4);
		
		pool.clear();
		
		pool.store(t1, t2);

		assertEquals(2, pool.size());
		
		pool.reduce();
		
		assertEquals(2, pool.size());
		assertSame(t2, pool.get());
		assertSame(t1, pool.get());
		
		pool.store(t1, t2);
		
		pool.ensure(2);
		
		assertEquals(2, pool.size());
		
		pool.reduce();
		
		assertEquals(2, pool.size());
		assertSame(t2, pool.get());
		assertSame(t1, pool.get());
	}
	
	/**
	 * This test ensures, that the method {@link DequePool#clear()}
	 * removes all instances from the pool.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void clearTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		pool.store(new Tup2f(), new Tup2f());
		
		assertEquals(2, pool.size());
		
		pool.clear();
		
		assertEquals(0, pool.size());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#size()}
	 * returns the correct amount of instances in the pool.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void sizeTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class);
		
		assertEquals(0, pool.size());
		
		pool.store(new Tup2f(), new Tup2f());
		
		assertEquals(2, pool.size());
		
		pool.get();
		
		assertEquals(1, pool.size());
	}
	
	/**
	 * This test ensures, that the function {@link DequePool#toString()}
	 * returns a string with the correct values.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		DequePool<Tup2f> pool = new DequePool<>(Tup2f.class, 2);
		
		assertEquals("dequepool(class=org.barghos.core.tuple2.Tup2f, size=2, ensuredSize=2)", pool.toString());
	}
}