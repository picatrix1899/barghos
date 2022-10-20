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
import org.barghos.core.tuple4.Tup4l;
import org.barghos.tuple.api.tn.TuplR;
import org.barghos.tuple.api.tn4.Tup4lR;

/**
 * This class provides component tests for the class {@link Tup4l}.
 */
class Tup4lTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4l#Tup4l()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4l t = new Tup4l();
		
		assertEquals(0l, t.x);
		assertEquals(0l, t.y);
		assertEquals(0l, t.z);
		assertEquals(0l, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4l} generated from an existing instance of {@link TuplR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		
		when(original.toArray()).thenReturn(new long[] {1l, 2l, 3l, 4l});
		
		Tup4l t = new Tup4l(original);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4l} generated from an existing instance of {@link Tup4lR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4lR original = mock(Tup4lR.class);
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		when(original.getZ()).thenReturn(3l);
		when(original.getW()).thenReturn(4l);
		
		Tup4l t = new Tup4l(original);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4l} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4l t = new Tup4l(1l);
		
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
		assertEquals(1l, t.getZ());
		assertEquals(1l, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4l} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4l t = new Tup4l(new long[] {1l, 2l, 3l, 4l});
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4l} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setX(long)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setX(1l));
		assertEquals(1l, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setY(long)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setY(2l));
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setZ(long)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setZ(3l));
		assertEquals(3l, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setW(long)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setWTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setW(4l));
		assertEquals(4l, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4l#set(org.barghos.core.api.tuple2.Tup4lR) Tup4l.set(Tup4lR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4l t = mock(Tup4l.class);
		
		Tup4lR t2 = mock(Tup4lR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t2.getW()).thenReturn(4l);
		
		when(t.set(1l, 2l, 3l, 4l)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#set(long)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4l t = mock(Tup4l.class);

		when(t.set(1l)).thenCallRealMethod();

		when(t.set(1l, 1l, 1l, 1l)).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);

		verify(t).set(1l, 1l, 1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#set(long, long, long, long)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4l t = mock(Tup4l.class);

		when(t.set(1l, 2l, 3l, 4l)).thenCallRealMethod();

		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);
		when(t.setZ(3l)).thenReturn(t);
		when(t.setW(4l)).thenReturn(t);
		
		assertSame(t, t.set(1l, 2l, 3l, 4l));

		verify(t).set(1l, 2l, 3l, 4l);
		
		verify(t).setX(1l);
		verify(t).setY(2l);
		verify(t).setZ(3l);
		verify(t).setW(4l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(1l, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(2l, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getY()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(3l, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(4l, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4l original = new Tup4l(1l, 2l, 3l, 4l);
		Tup4l t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4lR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t2.getW()).thenReturn(4l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t2.getW()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns true if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(2l);
		when(t2.getByIndex(2)).thenReturn(3l);
		when(t2.getByIndex(3)).thenReturn(4l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}

	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4l t1 = new Tup4l(1, 2, 3, 4);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(2l);
		when(t2.getByIndex(2)).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4l t1 = new Tup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(2l);
		when(t2.getByIndex(2)).thenReturn(3l);
		when(t2.getByIndex(3)).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#toString()} function prlongs the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals("tup4l(x=1, y=2, z=3, w=4)", t.toString());
	}
}