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
import org.barghos.core.tuple4.ImmutableTup4obj;
import org.barghos.tuple.api.t4.Tup4objR;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This class provides component tests for the class {@link ImmutableTup4obj}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4objTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4obj} generated from an existing instance of {@link TupobjR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		
		when(original.toArray()).thenReturn(new Object[] {1, 1.0, "a", 'a'});
		
		ImmutableTup4obj t = new ImmutableTup4obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4obj} generated from an existing instance of {@link Tup4objR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4objR original = mock(Tup4objR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(original.getW()).thenReturn('a');
		
		ImmutableTup4obj t = new ImmutableTup4obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4obj} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertEquals(1, t.getZ());
		assertEquals(1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4obj} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(new Object[] {1, 1.0, "a", 'a'});
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4obj} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4obj#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4obj#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertEquals(1.0, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4obj#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertEquals("a", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4obj#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertEquals('a', t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4obj#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1, 1.0, "a", 'a');

		assertEquals(67016704, t.hashCode());
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4objR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('a');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('b');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("a");
		when(t2.getByIndex(3)).thenReturn('a');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		ImmutableTup4obj t1 = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("a");
		when(t2.getByIndex(3)).thenReturn('b');
		
		assertFalse(t1.equals(t2));
	}
	
	
	/**
	 * This test ensures, that the {@link ImmutableTup4obj#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4obj t = new ImmutableTup4obj(1, 1.0, "a", 'a');
		
		assertEquals("immutableTup4obj(x=1, y=1.0, z=a, w=a)", t.toString());
	}
}