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

import org.barghos.core.api.tuple4.Tup4oR;

import org.barghos.core.tuple4.ImmutableTup4o;

/**
 * This class provides component tests for the class {@link ImmutableTup4o}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4oTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4o} generated from an existing instance of {@link Tup4oR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple3Test()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> original = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(original.getW()).thenReturn('a');
		
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(original);
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', (char)t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4o} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', (char)t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4o#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertEquals(1, (int)t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4o#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertEquals(1.0, (double)t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4o#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertEquals("a", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4o#getW()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertEquals('a', (char)t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4o#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(1, 1.0, "a", 'a');

		assertEquals(67016704, t.hashCode());
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4oR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('a');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);

		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);

		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t1 = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);

		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('b');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4o#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4o<Integer,Double,String,Character> t = new ImmutableTup4o<>(1, 1.0, "a", 'a');
		
		assertEquals("immutableTup4o(x=1, y=1.0, z=a, w=a)", t.toString());
	}
}