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

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple4.Tup4boR;

import org.barghos.core.tuple4.ImmutableTup4bo;

/**
 * This class provides component tests for the class {@link ImmutableTup3bo}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4boTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bo} generated from an existing instance of {@link TupboR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		
		when(original.getArray()).thenReturn(new boolean[] {true, false, true, false});
		
		ImmutableTup4bo t = new ImmutableTup4bo(original);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		assertEquals(true, t.getZ());
		assertEquals(false, t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bo} generated from an existing instance of {@link Tup4boR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple3Test()
	{
		Tup4boR original = mock(Tup4boR.class);
		
		when(original.getX()).thenReturn(true);
		when(original.getY()).thenReturn(false);
		when(original.getZ()).thenReturn(true);
		when(original.getW()).thenReturn(false);
		
		ImmutableTup4bo t = new ImmutableTup4bo(original);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bo} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true);
		
		assertEquals(true, t.getX());
		assertEquals(true, t.getY());
		assertEquals(true, t.getZ());
		assertEquals(true, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bo} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(new boolean[] {true, false, true, false});
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		assertEquals(true, t.getZ());
		assertEquals(false, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bo} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true, false, true, false);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		assertEquals(true, t.getZ());
		assertEquals(false, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bo#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true, false, true, false);
		
		assertEquals(true, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bo#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true, false, true, false);
		
		assertEquals(false, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bo#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true, false, true, false);
		
		assertEquals(true, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bo#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true, false, true, false);
		
		assertEquals(false, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bo#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true, false, true, false);

		assertEquals(953343, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bo#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4bo original = new ImmutableTup4bo(true, false, true, false);
		ImmutableTup4bo t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4boR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		Tup4boR t2 = mock(Tup4boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(true);
		when(t2.getW()).thenReturn(false);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3boR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		Tup4boR t2 = mock(Tup4boR.class);
		
		when(t2.getX()).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4boR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		Tup4boR t2 = mock(Tup4boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4boR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		Tup4boR t2 = mock(Tup4boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4boR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		Tup4boR t2 = mock(Tup4boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(true);
		when(t2.getW()).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(false);
		when(t2.getByIndex(2)).thenReturn(true);
		when(t2.getByIndex(3)).thenReturn(false);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(false);
		when(t2.getByIndex(2)).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		ImmutableTup4bo t1 = new ImmutableTup4bo(true, false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(false);
		when(t2.getByIndex(2)).thenReturn(true);
		when(t2.getByIndex(3)).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bo#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4bo t = new ImmutableTup4bo(true, false, true, false);
		
		assertEquals("immutableTup4bo(x=true, y=false, z=true, w=false)", t.toString());
	}
}