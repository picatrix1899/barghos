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

package org.barghos.core.test.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple4.Tup4bR;

import org.barghos.core.tuple4.Tup4b;

/**
 * This class provides component tests for the class {@link Tup4b}.
 */
class Tup4bTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4b#Tup4b()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4b t = new Tup4b();
		
		assertEquals((byte)0, t.x);
		assertEquals((byte)0, t.y);
		assertEquals((byte)0, t.z);
		assertEquals((byte)0, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4b} generated from an existing instance of {@link TupbR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		
		when(original.toArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		Tup4b t = new Tup4b(original);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		assertEquals((byte)4, t.getW());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4b} generated from an existing instance of {@link Tup4bR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4bR original = mock(Tup4bR.class);
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		when(original.getZ()).thenReturn((byte)3);
		when(original.getW()).thenReturn((byte)4);
		
		Tup4b t = new Tup4b(original);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		assertEquals((byte)4, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4b} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4b t = new Tup4b((byte)1);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)1, t.getY());
		assertEquals((byte)1, t.getZ());
		assertEquals((byte)1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4b} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4b t = new Tup4b(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		assertEquals((byte)4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4b} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		assertEquals((byte)4, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setX(byte)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setX((byte)1));
		assertEquals((byte)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setY(byte)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setY((byte)2));
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setZ(byte)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setZ((byte)3));
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setW(byte)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setWTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setW((byte)4));
		assertEquals((byte)4, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4b#set(org.barghos.core.api.tuple3.Tup4bR) Tup4b.set(Tup4bR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4b t = mock(Tup4b.class);
		
		Tup4bR t2 = mock(Tup4bR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		when(t2.getW()).thenReturn((byte)4);
		
		when(t.set((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#set(byte)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4b t = mock(Tup4b.class);

		when(t.set((byte)1)).thenCallRealMethod();

		when(t.set((byte)1, (byte)1, (byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#set(byte, byte, byte, byte)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4b t = mock(Tup4b.class);

		when(t.set((byte)1, (byte)2, (byte)3, (byte)4)).thenCallRealMethod();

		when(t.setX((byte)1)).thenReturn(t);
		when(t.setY((byte)2)).thenReturn(t);
		when(t.setZ((byte)3)).thenReturn(t);
		when(t.setW((byte)4)).thenReturn(t);
		
		assertSame(t, t.set((byte)1, (byte)2, (byte)3, (byte)4));

		verify(t).set((byte)1, (byte)2, (byte)3, (byte)4);
		
		verify(t).setX((byte)1);
		verify(t).setY((byte)2);
		verify(t).setZ((byte)3);
		verify(t).setW((byte)4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getwTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4b original = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		Tup4b t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4bR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		when(t2.getW()).thenReturn((byte)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		when(t2.getW()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)3);
		when(t2.getByIndex(3)).thenReturn((byte)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4b t1 = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)3);
		when(t2.getByIndex(3)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#toString()} function prbytes the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals("tup4b(x=1, y=2, z=3, w=4)", t.toString());
	}
}