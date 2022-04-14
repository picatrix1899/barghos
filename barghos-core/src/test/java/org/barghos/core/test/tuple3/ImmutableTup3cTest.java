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

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple3.Tup3cR;

import org.barghos.core.tuple3.ImmutableTup3c;

/**
 * This class provides component tests for the class {@link ImmutableTup3c}.
 * 
 * @author picatrix1899
 */
class ImmutableTup3cTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3c} generated from an existing instance of {@link TupcR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		
		when(original.toArray()).thenReturn(new char[] {'a', 'b', 'c'});
		
		ImmutableTup3c t = new ImmutableTup3c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3c} generated from an existing instance of {@link Tup3cR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup3cR original = mock(Tup3cR.class);
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		when(original.getZ()).thenReturn('c');
		
		ImmutableTup3c t = new ImmutableTup3c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3c} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup3c t = new ImmutableTup3c('a');
		
		assertEquals('a', t.getX());
		assertEquals('a', t.getY());
		assertEquals('a', t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3c} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup3c t = new ImmutableTup3c(new char[] {'a', 'b', 'c'});
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3c} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup3c t = new ImmutableTup3c('a', 'b', 'c');
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3c#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup3c t = new ImmutableTup3c('a', 'b', 'c');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3c#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup3c t = new ImmutableTup3c('a', 'b', 'c');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3c#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup3c t = new ImmutableTup3c('a', 'b', 'c');
		
		assertEquals('c', t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3c#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup3c t = new ImmutableTup3c('a', 'b', 'c');

		assertEquals(126145, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3c#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup3c original = new ImmutableTup3c('a', 'b', 'c');
		ImmutableTup3c t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3cR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		Tup3cR t2 = mock(Tup3cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3cR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		Tup3cR t2 = mock(Tup3cR.class);
		
		when(t2.getX()).thenReturn('d');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3cR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingYTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		Tup3cR t2 = mock(Tup3cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('d');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3cR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingZTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		Tup3cR t2 = mock(Tup3cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('d');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('c');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn('d');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('d');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup3c t1 = new ImmutableTup3c('a', 'b', 'c');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('d');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3c#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup3c t = new ImmutableTup3c('a', 'b', 'c');
		
		assertEquals("immutableTup3c(x=a, y=b, z=c)", t.toString());
	}
}