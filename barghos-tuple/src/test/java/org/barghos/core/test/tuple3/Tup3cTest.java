///*******************************************************************************
// * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
// * 
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// * 
// * The above copyright notice and this permission notice shall be included in
// * all copies or substantial portions of the Software.
// * 
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// * SOFTWARE.
// ******************************************************************************/
//
//package org.barghos.core.test.tuple3;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.barghos.core.api.tuple3.org;
//import org.barghos.core.tuple3.Tup3c;
//import org.barghos.tuple.api.t3.Tup3cR;
//import org.barghos.tuple.api.tn.TupcR;
//
///**
// * This class provides component tests for the class {@link Tup3c}.
// */
//class Tup3cTest
//{
//	/**
//	 * This test ensures, that the default constructor {@link Tup3c#Tup3c()} sets the components to 0.
//	 */
//	@Test
//	void ctor_DefaultTest()
//	{
//		Tup3c t = new Tup3c();
//		
//		assertEquals((char)0, t.x);
//		assertEquals((char)0, t.y);
//		assertEquals((char)0, t.z);
//	}
//
//	/**
//	 * This test ensures, that an instance of {@link Tup3c} generated from an existing instance of {@link TupcR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupcR original = mock(TupcR.class);
//		
//		when(original.toArray()).thenReturn(new char[] {'a', 'b', 'c'});
//		
//		Tup3c t = new Tup3c(original);
//		
//		assertEquals('a', t.getX());
//		assertEquals('b', t.getY());
//		assertEquals('c', t.getZ());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3c} generated from an existing instance of {@link Tup3cR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple2Test()
//	{
//		Tup3cR original = mock(Tup3cR.class);
//		
//		when(original.getX()).thenReturn('a');
//		when(original.getY()).thenReturn('b');
//		when(original.getZ()).thenReturn('c');
//		
//		Tup3c t = new Tup3c(original);
//		
//		assertEquals('a', t.getX());
//		assertEquals('b', t.getY());
//		assertEquals('c', t.getZ());
//		
//		verify(original).getX();
//		verify(original).getY();
//		verify(original).getZ();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3c} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		Tup3c t = new Tup3c('a');
//		
//		assertEquals('a', t.getX());
//		assertEquals('a', t.getY());
//		assertEquals('a', t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3c} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		Tup3c t = new Tup3c(new char[] {'a', 'b', 'c'});
//		
//		assertEquals('a', t.getX());
//		assertEquals('b', t.getY());
//		assertEquals('c', t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3c} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		Tup3c t = new Tup3c('a', 'b', 'c');
//		
//		assertEquals('a', t.getX());
//		assertEquals('b', t.getY());
//		assertEquals('c', t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#setX(char)} sets the x component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setXTest()
//	{
//		Tup3c t = new Tup3c();
//		
//		assertSame(t, t.setX('a'));
//		assertEquals('a', t.x);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#setY(char)} sets the y component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setYTest()
//	{
//		Tup3c t = new Tup3c();
//		
//		assertSame(t, t.setY('b'));
//		assertEquals('b', t.y);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#setZ(char)} sets the y component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setZTest()
//	{
//		Tup3c t = new Tup3c();
//		
//		assertSame(t, t.setZ('c'));
//		assertEquals('c', t.z);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link Tup3c#set(org.barghos.core.api.tuple2.Tup3cR) Tup3c.set(Tup3cR)}
//	 * adopts the components from the input tuple and returns the current tuple.
//	 */
//	@Test
//	void set_Tuple3Test()
//	{
//		Tup3c t = mock(Tup3c.class);
//		
//		Tup3cR t2 = mock(Tup3cR.class);
//	
//		when(t.set(t2)).thenCallRealMethod();
//		
//		when(t2.getX()).thenReturn('a');
//		when(t2.getY()).thenReturn('b');
//		when(t2.getZ()).thenReturn('c');
//		
//		when(t.set('a', 'b', 'c')).thenReturn(t);
//		
//		assertSame(t, t.set(t2));
//		
//		verify(t).set(t2);
//		
//		verify(t2).getX();
//		verify(t2).getY();
//		verify(t2).getZ();
//		verify(t).set('a', 'b', 'c');
//		
//		verifyNoMoreInteractions(t, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#set(char)} sets the components
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void set_ValueTest()
//	{
//		Tup3c t = mock(Tup3c.class);
//
//		when(t.set('a')).thenCallRealMethod();
//
//		when(t.set('a', 'a', 'a')).thenReturn(t);
//		
//		assertSame(t, t.set('a'));
//		
//		verify(t).set('a');
//
//		verify(t).set('a', 'a', 'a');
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#set(char, char, char)} set the components
//	 * to the respective parameters and returns the current tuple.
//	 */
//	@Test
//	void set_ComponentsTest()
//	{
//		Tup3c t = mock(Tup3c.class);
//
//		when(t.set('a', 'b', 'c')).thenCallRealMethod();
//
//		when(t.setX('a')).thenReturn(t);
//		when(t.setY('b')).thenReturn(t);
//		when(t.setZ('c')).thenReturn(t);
//		
//		assertSame(t, t.set('a', 'b', 'c'));
//
//		verify(t).set('a', 'b', 'c');
//		
//		verify(t).setX('a');
//		verify(t).setY('b');
//		verify(t).setZ('c');
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		Tup3c t = new Tup3c('a', 'b', 'c');
//		
//		assertEquals('a', t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		Tup3c t = new Tup3c('a', 'b', 'c');
//		
//		assertEquals('b', t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#getZ()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getZTest()
//	{
//		Tup3c t = new Tup3c('a', 'b', 'c');
//		
//		assertEquals('c', t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		Tup3c t = new Tup3c('a', 'b', 'c');
//
//		assertEquals(126145, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3c#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		Tup3c original = new Tup3c('a', 'b', 'c');
//		Tup3c t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup3cR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple2Test()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		Tup3cR t2 = mock(Tup3cR.class);
//		
//		when(t2.getX()).thenReturn('a');
//		when(t2.getY()).thenReturn('b');
//		when(t2.getZ()).thenReturn('c');
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3cR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingXTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		Tup3cR t2 = mock(Tup3cR.class);
//		
//		when(t2.getX()).thenReturn('d');
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3cR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingYTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		Tup3cR t2 = mock(Tup3cR.class);
//		
//		when(t2.getX()).thenReturn('a');
//		when(t2.getY()).thenReturn('d');
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3cR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingZTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		Tup3cR t2 = mock(Tup3cR.class);
//		
//		when(t2.getX()).thenReturn('a');
//		when(t2.getY()).thenReturn('b');
//		when(t2.getZ()).thenReturn('d');
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		TupcR t2 = mock(TupcR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn('a');
//		when(t2.getByIndex(1)).thenReturn('b');
//		when(t2.getByIndex(2)).thenReturn('c');
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupcR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		TupcR t2 = mock(TupcR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		TupcR t2 = mock(TupcR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn('d');
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		TupcR t2 = mock(TupcR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn('a');
//		when(t2.getByIndex(1)).thenReturn('d');
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		Tup3c t1 = new Tup3c('a', 'b', 'c');
//		
//		TupcR t2 = mock(TupcR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn('a');
//		when(t2.getByIndex(1)).thenReturn('b');
//		when(t2.getByIndex(2)).thenReturn('d');
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3c#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		Tup3c t = new Tup3c('a', 'b', 'c');
//		
//		assertEquals("tup3c(x=a, y=b, z=c)", t.toString());
//	}
//}