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

package org.barghos.core.test.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple3.Tup3bR;

import org.barghos.core.tuple3.Tup3b;

/**
 * This class provides component tests for the class {@link Tup3b}.
 */
class Tup3bTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3b#Tup3b()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3b t = new Tup3b();
		
		assertEquals((byte)0, t.x);
		assertEquals((byte)0, t.y);
		assertEquals((byte)0, t.z);
	}

	/**
	 * This test ensures, that an instance of {@link Tup3b} generated from an existing instance of {@link TupbR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		
		when(original.getArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3});
		
		Tup3b t = new Tup3b(original);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3b} generated from an existing instance of {@link Tup3bR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup3bR original = mock(Tup3bR.class);
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		when(original.getZ()).thenReturn((byte)3);
		
		Tup3b t = new Tup3b(original);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3b} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup3b t = new Tup3b((byte)1);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)1, t.getY());
		assertEquals((byte)1, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3b} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup3b t = new Tup3b(new byte[] {(byte)1, (byte)2, (byte)3});
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3b} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#setX(byte)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.setX((byte)1));
		assertEquals((byte)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#setY(byte)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.setY((byte)2));
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#setZ(byte)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.setZ((byte)3));
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3b#set(org.barghos.core.api.tuple3.Tup3bR) Tup3b.set(Tup3bR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3b t = mock(Tup3b.class);
		
		Tup3bR t2 = mock(Tup3bR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		
		when(t.set((byte)1, (byte)2, (byte)3)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set((byte)1, (byte)2, (byte)3);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#set(byte)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3b t = mock(Tup3b.class);

		when(t.set((byte)1)).thenCallRealMethod();

		when(t.set((byte)1, (byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#set(byte, byte, byte)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup3b t = mock(Tup3b.class);

		when(t.set((byte)1, (byte)2, (byte)3)).thenCallRealMethod();

		when(t.setX((byte)1)).thenReturn(t);
		when(t.setY((byte)2)).thenReturn(t);
		when(t.setZ((byte)3)).thenReturn(t);
		
		assertSame(t, t.set((byte)1, (byte)2, (byte)3));

		verify(t).set((byte)1, (byte)2, (byte)3);
		
		verify(t).setX((byte)1);
		verify(t).setY((byte)2);
		verify(t).setZ((byte)3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);

		assertEquals(30817, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup3b original = new Tup3b((byte)1, (byte)2, (byte)3);
		Tup3b t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3bR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		Tup3bR t2 = mock(Tup3bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3bR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		Tup3bR t2 = mock(Tup3bR.class);
		
		when(t2.getX()).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3bR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		Tup3bR t2 = mock(Tup3bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3bR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		Tup3bR t2 = mock(Tup3bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)3);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)3);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup3b t1 = new Tup3b((byte)1, (byte)2, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#toString()} function prbytes the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals("tup3b(x=1, y=2, z=3)", t.toString());
	}
}