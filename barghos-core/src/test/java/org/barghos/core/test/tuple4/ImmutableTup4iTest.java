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

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple4.Tup4iR;

import org.barghos.core.tuple4.ImmutableTup4i;

/**
 * This class provides component tests for the class {@link ImmutableTup4i}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup4iTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4i} generated from an existing instance of {@link TupiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		
		when(original.getArray()).thenReturn(new int[] {1, 2, 3, 4});
		
		ImmutableTup4i t = new ImmutableTup4i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4i} generated from an existing instance of {@link Tup4iR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
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
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4i t = new ImmutableTup4i(1, 2, 3, 4);
		
		assertEquals("immutableTup4i(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#getNewInstance(int, int, int, int)}
	 * returns a new instance of {@link ImmutableTup4i} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup4i original = new ImmutableTup4i(1, 2, 3, 4);
		ImmutableTup4i newInstance = original.getNewInstance(3, 4, 5, 6);
		
		assertEquals(1, original.getX());
		assertEquals(2, original.getY());
		assertEquals(3, original.getZ());
		assertEquals(4, original.getW());
		assertEquals(3, newInstance.getX());
		assertEquals(4, newInstance.getY());
		assertEquals(5, newInstance.getZ());
		assertEquals(6, newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4i#getNewInstance(int)} calls
	 * the function {@link ImmutableTup4i#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup4i newInstance = mock(ImmutableTup4i.class);
		ImmutableTup4i t = mock(ImmutableTup4i.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1, 1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4i#getNewInstance(Tup4iR)}
	 * returns a new instance of {@link ImmutableTup4i} with the given values.
	 */
	@Test
	void getNewInstance_Tuple3Test()
	{
		Tup4iR original = mock(Tup4iR.class);
		ImmutableTup4i newInstance = mock(ImmutableTup4i.class);
		ImmutableTup4i t = mock(ImmutableTup4i.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		when(original.getW()).thenReturn(4);
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}

	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4i#getNewInstance(TupiR)} calls
	 * the function {@link ImmutableTup4i#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		ImmutableTup4i newInstance = mock(ImmutableTup4i.class);
		ImmutableTup4i t = mock(ImmutableTup4i.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2, 3, 4});
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4i#getNewInstanceFromArray(int[])} calls
	 * the function {@link ImmutableTup4i#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup4i newInstance = mock(ImmutableTup4i.class);
		ImmutableTup4i t = mock(ImmutableTup4i.class);
		
		when(t.getNewInstanceFromArray(new int[] {1, 2, 3, 4})).thenCallRealMethod();

		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new int[] {1, 2, 3, 4}));
		
		verify(t).getNewInstanceFromArray(new int[] {1, 2, 3, 4});
		
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t);
	}
}