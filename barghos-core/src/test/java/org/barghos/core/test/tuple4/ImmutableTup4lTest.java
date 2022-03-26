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

/*
MIT License

Copyright (c) 2020 picatrix1899 (Florian Zilkenat)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.test.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple4.Tup4lR;

import org.barghos.core.tuple4.ImmutableTup4l;

/**
 * This class provides component tests for the class {@link ImmutableTup4l}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4lTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4l} generated from an existing instance of {@link TuplR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l, 3l, 4l});
		
		ImmutableTup4l t = new ImmutableTup4l(original);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4l} generated from an existing instance of {@link Tup4lR},
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
		
		ImmutableTup4l t = new ImmutableTup4l(original);
		
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
	 * This test ensures, that an instance of {@link ImmutableTup4l} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l);
		
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
		assertEquals(1l, t.getZ());
		assertEquals(1l, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4l} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(new long[] {1l, 2l, 3l, 4l});
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4l} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4l#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertEquals(1l, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4l#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertEquals(2l, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4l#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertEquals(3l, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4l#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertEquals(4l, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4l#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l, 2l, 3l, 4l);

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4l#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4l original = new ImmutableTup4l(1l, 2l, 3l, 4l);
		ImmutableTup4l t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4lR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t2.getW()).thenReturn(4l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4lR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t2.getW()).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns true if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(2l);
		when(t2.getByIndex(2)).thenReturn(3l);
		when(t2.getByIndex(3)).thenReturn(4l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4l t1 = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(2l);
		when(t2.getByIndex(2)).thenReturn(3l);
		when(t2.getByIndex(3)).thenReturn(5l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4l#toString()} function prlongs the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4l t = new ImmutableTup4l(1l, 2l, 3l, 4l);
		
		assertEquals("immutableTup4l(x=1, y=2, z=3, w=4)", t.toString());
	}
}