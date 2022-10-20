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

package org.barghos.core.test.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple3.org;
import org.barghos.core.tuple3.Tup3obj;
import org.barghos.tuple.api.t3.Tup3objR;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This class provides component tests for the class {@link Tup3obj}.
 */
class Tup3objTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3obj#Tup3obj()} sets the components to null.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertEquals(null, t.x);
		assertEquals(null, t.y);
		assertEquals(null, t.z);
	}

	/**
	 * This test ensures, that an instance of {@link Tup3obj} generated from an existing instance of {@link TupobjR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		
		when(original.toArray()).thenReturn(new Object[] {1, 1.0, "a"});
		
		Tup3obj t = new Tup3obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3obj} generated from an existing instance of {@link Tup3objR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup3objR original = mock(Tup3objR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		
		Tup3obj t = new Tup3obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3obj} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup3obj t = new Tup3obj(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertEquals(1, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3obj} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup3obj t = new Tup3obj(new Object[] {1, 1.0, "a"});
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3obj} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3obj t = new Tup3obj(1, 1.0, "a");
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#setX(Object)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#setY(Object)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.setY(1.0));
		assertEquals(1.0, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#setZ(Object)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.setZ("a"));
		assertEquals("a", t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3obj#set(org.barghos.core.api.tuple2.Tup3objR) Tup3obj.set(Tup3objR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup3obj t = mock(Tup3obj.class);
		
		Tup3objR t2 = mock(Tup3objR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		
		when(t.set(1, 1.0, "a")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#set(Object)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3obj t = mock(Tup3obj.class);

		when(t.set(1)).thenCallRealMethod();

		when(t.set(1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#set(Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup3obj t = mock(Tup3obj.class);

		when(t.set(1, 1.0, "a")).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a"));

		verify(t).set(1, 1.0, "a");
		
		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup3obj t = new Tup3obj(1, 1.0, "a");
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup3obj t = new Tup3obj(1, 1.0, "a");
		
		assertEquals(1.0, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup3obj t = new Tup3obj(1, 1.0, "a");
		
		assertEquals("a", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3obj t = new Tup3obj(1, 1.0, "a");

		assertEquals(-1106216831, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup3obj original = new Tup3obj(1, 1.0, "a");
		Tup3obj t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3objR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		Tup3objR t2 = mock(Tup3objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3objR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingXTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		Tup3objR t2 = mock(Tup3objR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3objR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingYTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		Tup3objR t2 = mock(Tup3objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3objR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingZTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		Tup3objR t2 = mock(Tup3objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("a");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup3obj t1 = new Tup3obj(1, 1.0, "a");
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup3obj t = new Tup3obj(1, 1.0, "a");
		
		assertEquals("tup3obj(x=1, y=1.0, z=a)", t.toString());
	}
}