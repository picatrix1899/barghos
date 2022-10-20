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
import org.barghos.core.tuple3.ImmutableTup3bo;
import org.barghos.tuple.api.t3.Tup3boR;
import org.barghos.tuple.api.tn.TupboR;

/**
 * This class provides component tests for the class {@link ImmutableTup3bo}.
 * 
 * @author picatrix1899
 */
class ImmutableTup3boTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3bo} generated from an existing instance of {@link TupboR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		
		when(original.toArray()).thenReturn(new boolean[] {true, false, true});
		
		ImmutableTup3bo t = new ImmutableTup3bo(original);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		assertEquals(true, t.getZ());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3bo} generated from an existing instance of {@link Tup3boR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple3Test()
	{
		Tup3boR original = mock(Tup3boR.class);
		
		when(original.getX()).thenReturn(true);
		when(original.getY()).thenReturn(false);
		when(original.getZ()).thenReturn(true);
		
		ImmutableTup3bo t = new ImmutableTup3bo(original);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3bo} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(true);
		
		assertEquals(true, t.getX());
		assertEquals(true, t.getY());
		assertEquals(true, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3bo} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(new boolean[] {true, false, true});
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		assertEquals(true, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup3bo} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(true, false, true);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		assertEquals(true, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bo#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(true, false, true);
		
		assertEquals(true, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3bo#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(true, false, true);
		
		assertEquals(false, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3bo#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(true, false, true);
		
		assertEquals(true, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3bo#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(true, false, true);

		assertEquals(30753, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup3bo#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup3bo original = new ImmutableTup3bo(true, false, true);
		ImmutableTup3bo t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3boR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(true);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3boR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingXTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3boR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingYTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3boR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingZTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(false);
		when(t2.getByIndex(2)).thenReturn(true);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup3bo t1 = new ImmutableTup3bo(true, false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(false);
		when(t2.getByIndex(2)).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bo#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup3bo t = new ImmutableTup3bo(true, false, true);
		
		assertEquals("immutableTup3bo(x=true, y=false, z=true)", t.toString());
	}
}