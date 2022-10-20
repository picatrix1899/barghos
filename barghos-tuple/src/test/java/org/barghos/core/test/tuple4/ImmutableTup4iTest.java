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
import org.barghos.core.tuple4.ImmutableTup4i;
import org.barghos.tuple.api.tn.TupiR;
import org.barghos.tuple.api.tn4.Tup4iR;

/**
 * This class provides component tests for the class {@link ImmutableTup4i}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4iTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4i} generated from an existing instance of {@link TupiR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		
		when(original.toArray()).thenReturn(new int[] {1, 2, 3, 4});
		
		ImmutableTup4i t = new ImmutableTup4i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4i} generated from an existing instance of {@link Tup4iR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4iR original = mock(Tup4iR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		when(original.getW()).thenReturn(4);
		
		ImmutableTup4i t = new ImmutableTup4i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4i} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertEquals(1, t.getZ());
		assertEquals(1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4i} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(new int[] {1, 2, 3, 4});
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4i} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);
		
		assertEquals(3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);
		
		assertEquals(4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4i original = new ImmutableTup4i(1, 2, 3, 4);
		ImmutableTup4i t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4iR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t2.getW()).thenReturn(4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t2.getW()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		when(t2.getByIndex(2)).thenReturn(3);
		when(t2.getByIndex(3)).thenReturn(4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4i t1 = new ImmutableTup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		when(t2.getByIndex(2)).thenReturn(3);
		when(t2.getByIndex(3)).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4i#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);
		
		assertEquals("immutableTup4i(x=1, y=2, z=3, w=4)", t.toString());
	}
}