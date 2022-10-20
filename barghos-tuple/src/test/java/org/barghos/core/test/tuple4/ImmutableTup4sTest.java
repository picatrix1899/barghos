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
import org.barghos.core.tuple4.ImmutableTup4s;
import org.barghos.tuple.api.tn.TupsR;
import org.barghos.tuple.api.tn4.Tup4sR;

/**
 * This class provides component tests for the class {@link ImmutableTup4s}.
 * 
 * @author picatrix1899
 */
class ImmutableTup4sTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4s} generated from an existing instance of {@link TupsR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		
		when(original.toArray()).thenReturn(new short[] {(short)1, (short)2, (short)3, (short)4});
		
		ImmutableTup4s t = new ImmutableTup4s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4s} generated from an existing instance of {@link Tup4sR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4sR original = mock(Tup4sR.class);
		
		when(original.getX()).thenReturn((short)1);
		when(original.getY()).thenReturn((short)2);
		when(original.getZ()).thenReturn((short)3);
		when(original.getW()).thenReturn((short)4);
		
		ImmutableTup4s t = new ImmutableTup4s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4s} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)1, t.getY());
		assertEquals((short)1, t.getZ());
		assertEquals((short)1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4s} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4s t = new ImmutableTup4s(new short[] {(short)1, (short)2, (short)3, (short)4});
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4s} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4s#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4s#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4s#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4s#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4s#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4s#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4s original = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		ImmutableTup4s t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4sR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)3);
		when(t2.getW()).thenReturn((short)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)3);
		when(t2.getW()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)2);
		when(t2.getByIndex(2)).thenReturn((short)3);
		when(t2.getByIndex(3)).thenReturn((short)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4s t1 = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)2);
		when(t2.getByIndex(2)).thenReturn((short)3);
		when(t2.getByIndex(3)).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4s#toString()} function prshorts the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4s t = new ImmutableTup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals("immutableTup4s(x=1, y=2, z=3, w=4)", t.toString());
	}
}