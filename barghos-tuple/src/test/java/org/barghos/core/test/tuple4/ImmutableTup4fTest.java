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
import org.barghos.core.tuple4.ImmutableTup4f;
import org.barghos.tuple.api.t4.Tup4fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This class provides component tests for the class {@link ImmutableTup4f}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4fTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4f} generated from an existing instance of {@link TupfR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		
		when(original.toArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		
		ImmutableTup4f t = new ImmutableTup4f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4f} generated from an existing instance of {@link Tup4fR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4fR original = mock(Tup4fR.class);
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		when(original.getZ()).thenReturn(3.0f);
		when(original.getW()).thenReturn(4.0f);
		
		ImmutableTup4f t = new ImmutableTup4f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4f} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(1.0f, t.getY());
		assertEquals(1.0f, t.getZ());
		assertEquals(1.0f, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4f} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4f} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4f#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(1.1f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4f#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(2.2f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4f#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(3.3f, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4f#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(4.4f, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4f#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);

		assertEquals(-657582207, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4f#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4f original = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		ImmutableTup4f t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4fR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		when(t2.getW()).thenReturn(4.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		when(t2.getW()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(3.0f);
		when(t2.getByIndex(3)).thenReturn(4.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		ImmutableTup4f t1 = new ImmutableTup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(3.0f);
		when(t2.getByIndex(3)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4f#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4f t = new ImmutableTup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals("immutableTup4f(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
	}
}