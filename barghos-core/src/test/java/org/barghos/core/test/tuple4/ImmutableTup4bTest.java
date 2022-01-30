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

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple4.Tup4bR;

import org.barghos.core.tuple4.ImmutableTup4b;

/**
 * This class provides component tests for the class {@link ImmutableTup4b}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup4bTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4b} generated from an existing instance of {@link TupbR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		
		when(original.getArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		ImmutableTup4b t = new ImmutableTup4b(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		assertEquals(4.0, t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4b} generated from an existing instance of {@link Tup4bR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4bR original = mock(Tup4bR.class);
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		when(original.getZ()).thenReturn((byte)3);
		when(original.getW()).thenReturn((byte)4);
		
		ImmutableTup4b t = new ImmutableTup4b(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		assertEquals(4.0, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4b} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)1, t.getY());
		assertEquals((byte)1, t.getZ());
		assertEquals((byte)1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4b} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4b t = new ImmutableTup4b(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		assertEquals((byte)4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4b} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
		assertEquals((byte)4, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4b original = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		ImmutableTup4b t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4bR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		when(t2.getW()).thenReturn((byte)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		when(t2.getW()).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)3);
		when(t2.getByIndex(3)).thenReturn((byte)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		ImmutableTup4b t1 = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		when(t2.getByIndex(2)).thenReturn((byte)3);
		when(t2.getByIndex(3)).thenReturn((byte)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4b#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4b t = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals("immutableTup4b(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#getNewInstance(byte, byte, byte, byte)}
	 * returns a new instance of {@link ImmutableTup4b} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup4b original = new ImmutableTup4b((byte)1, (byte)2, (byte)3, (byte)4);
		ImmutableTup4b newInstance = original.getNewInstance((byte)3, (byte)4, (byte)5, (byte)6);
		
		assertEquals((byte)1, original.getX());
		assertEquals((byte)2, original.getY());
		assertEquals((byte)3, original.getZ());
		assertEquals((byte)4, original.getW());
		assertEquals((byte)3, newInstance.getX());
		assertEquals((byte)4, newInstance.getY());
		assertEquals((byte)5, newInstance.getZ());
		assertEquals((byte)6, newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4b#getNewInstance(byte)} calls
	 * the function {@link ImmutableTup4b#getNewInstance(byte, byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup4b newInstance = mock(ImmutableTup4b.class);
		ImmutableTup4b t = mock(ImmutableTup4b.class);
		
		when(t.getNewInstance((byte)1)).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)1, (byte)1, (byte)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((byte)1));
		
		verify(t).getNewInstance((byte)1);
		
		verify(t).getNewInstance((byte)1, (byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4b#getNewInstance(Tup4bR)}
	 * returns a new instance of {@link ImmutableTup4b} with the given values.
	 */
	@Test
	void getNewInstance_Tuple4Test()
	{
		Tup4bR original = mock(Tup4bR.class);
		ImmutableTup4b newInstance = mock(ImmutableTup4b.class);
		ImmutableTup4b t = mock(ImmutableTup4b.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		when(original.getZ()).thenReturn((byte)3);
		when(original.getW()).thenReturn((byte)4);
		when(t.getNewInstance((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t, original);
	}

	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4b#getNewInstance(TupbR)} calls
	 * the function {@link ImmutableTup4b#getNewInstance(byte, byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		ImmutableTup4b newInstance = mock(ImmutableTup4b.class);
		ImmutableTup4b t = mock(ImmutableTup4b.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		when(t.getNewInstance((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4b#getNewInstanceFromArray(byte[])} calls
	 * the function {@link ImmutableTup4b#getNewInstance(byte, byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup4b newInstance = mock(ImmutableTup4b.class);
		ImmutableTup4b t = mock(ImmutableTup4b.class);
		
		when(t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4})).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4}));
		
		verify(t).getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t);
	}
}