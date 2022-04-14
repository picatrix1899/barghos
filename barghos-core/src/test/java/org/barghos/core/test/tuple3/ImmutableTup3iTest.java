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

package org.barghos.core.test.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple3.Tup3iR;

import org.barghos.core.tuple3.ImmutableTup3i;

/**
 * This class provides component tests for the class {@link ImmutableTup3i}.
 * 
 * @author picatrix1899
 */
class ImmutableTup3iTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3i} generated from an existing instance of {@link TupiR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		
		when(original.toArray()).thenReturn(new int[] {1, 2, 3});
		
		ImmutableTup3i t = new ImmutableTup3i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3i} generated from an existing instance of {@link Tup3iR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple3Test()
	{
		Tup3iR original = mock(Tup3iR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		
		ImmutableTup3i t = new ImmutableTup3i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3i} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertEquals(1, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3i} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(new int[] {1, 2, 3});
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3i} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(1, 2, 3);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3i#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(1, 2, 3);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3i#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(1, 2, 3);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3i#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(1, 2, 3);
		
		assertEquals(3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3i#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(1, 2, 3);

		assertEquals(30817, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3i#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup3i original = new ImmutableTup3i(1, 2, 3);
		ImmutableTup3i t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3iR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		Tup3iR t2 = mock(Tup3iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3iR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		Tup3iR t2 = mock(Tup3iR.class);
		
		when(t2.getX()).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3iR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingYTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		Tup3iR t2 = mock(Tup3iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3iR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingZTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		Tup3iR t2 = mock(Tup3iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		when(t2.getByIndex(2)).thenReturn(3);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup3i t1 = new ImmutableTup3i(1, 2, 3);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		when(t2.getByIndex(2)).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3i#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup3i t = new ImmutableTup3i(1, 2, 3);
		
		assertEquals("immutableTup3i(x=1, y=2, z=3)", t.toString());
	}
}