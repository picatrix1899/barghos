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

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple4.Tup4cR;

import org.barghos.core.tuple4.ImmutableTup4c;

/**
 * This class provides component tests for the class {@link ImmutableTup4c}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4cTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4c} generated from an existing instance of {@link TupcR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b', 'c', 'd'});
		
		ImmutableTup4c t = new ImmutableTup4c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4c} generated from an existing instance of {@link Tup4cR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4cR original = mock(Tup4cR.class);
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		when(original.getZ()).thenReturn('c');
		when(original.getW()).thenReturn('d');
		
		ImmutableTup4c t = new ImmutableTup4c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4c} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a');
		
		assertEquals('a', t.getX());
		assertEquals('a', t.getY());
		assertEquals('a', t.getZ());
		assertEquals('a', t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4c} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4c t = new ImmutableTup4c(new char[] {'a', 'b', 'c', 'd'});
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4c} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4c#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4c#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4c#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertEquals('c', t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4c#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertEquals('d', t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4c#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a', 'b', 'c', 'd');

		assertEquals(3910595, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4c#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4c original = new ImmutableTup4c('a', 'b', 'c', 'd');
		ImmutableTup4c t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4cR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t2.getW()).thenReturn('d');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t2.getW()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('c');
		when(t2.getByIndex(3)).thenReturn('d');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the zw component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		ImmutableTup4c t1 = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('c');
		when(t2.getByIndex(3)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4c#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4c t = new ImmutableTup4c('a', 'b', 'c', 'd');
		
		assertEquals("immutableTup4c(x=a, y=b, z=c, w=d)", t.toString());
	}
}