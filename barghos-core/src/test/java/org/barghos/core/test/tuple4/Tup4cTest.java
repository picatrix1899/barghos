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

package org.barghos.core.test.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple4.Tup4cR;

import org.barghos.core.tuple4.Tup4c;

/**
 * This class provides component tests for the class {@link Tup4c}.
 * 
 * @since 1.0.0.0
 */
class Tup4cTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4c#Tup4c()} sets the components to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4c t = new Tup4c();
		
		assertEquals((char)0, t.x);
		assertEquals((char)0, t.y);
		assertEquals((char)0, t.z);
		assertEquals((char)0, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4c} generated from an existing instance of {@link TupcR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b', 'c', 'd'});
		
		Tup4c t = new Tup4c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4c} generated from an existing instance of {@link Tup4cR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4cR original = mock(Tup4cR.class);
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		when(original.getZ()).thenReturn('c');
		when(original.getW()).thenReturn('d');
		
		Tup4c t = new Tup4c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4c} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4c t = new Tup4c('a');
		
		assertEquals('a', t.getX());
		assertEquals('a', t.getY());
		assertEquals('a', t.getZ());
		assertEquals('a', t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4c} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4c t = new Tup4c(new char[] {'a', 'b', 'c', 'd'});
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4c} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
		assertEquals('d', t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setX(char)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setX('a'));
		assertEquals('a', t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setY(char)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setY('b'));
		assertEquals('b', t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setZ(char)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setZ('c'));
		assertEquals('c', t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setZ(char)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setW('d'));
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4c#set(org.barghos.core.api.tuple2.Tup4cR) Tup4c.set(Tup4cR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4c t = mock(Tup4c.class);
		
		Tup4cR t2 = mock(Tup4cR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t2.getW()).thenReturn('d');
		
		when(t.set('a', 'b', 'c', 'd')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#set(char)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup4c t = mock(Tup4c.class);

		when(t.set('a')).thenCallRealMethod();

		when(t.set('a', 'a', 'a', 'a')).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');

		verify(t).set('a', 'a', 'a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#set(char, char, char, char)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4c t = mock(Tup4c.class);

		when(t.set('a', 'b', 'c', 'd')).thenCallRealMethod();

		when(t.setX('a')).thenReturn(t);
		when(t.setY('b')).thenReturn(t);
		when(t.setZ('c')).thenReturn(t);
		when(t.setW('d')).thenReturn(t);
		
		assertSame(t, t.set('a', 'b', 'c', 'd'));

		verify(t).set('a', 'b', 'c', 'd');
		
		verify(t).setX('a');
		verify(t).setY('b');
		verify(t).setZ('c');
		verify(t).setW('d');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getZ()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('c', t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getZ()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('d', t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');

		assertEquals(3910595, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4c original = new Tup4c('a', 'b', 'c', 'd');
		Tup4c t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 's');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4cR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t2.getW()).thenReturn('d');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4cR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t2.getW()).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('c');
		when(t2.getByIndex(3)).thenReturn('d');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4c t1 = new Tup4c('a', 'b', 'c', 'd');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		when(t2.getByIndex(2)).thenReturn('c');
		when(t2.getByIndex(3)).thenReturn('e');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals("tup4c(x=a, y=b, z=c, w=d)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getNewInstance(char, char, char, char)}
	 * returns a new instance of {@link Tup4c} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4c original = new Tup4c('a', 'b', 'c', 'd');
		Tup4c newInstance = original.getNewInstance('c', 'd', 'e', 'f');
		
		assertEquals('a', original.getX());
		assertEquals('b', original.getY());
		assertEquals('c', original.getZ());
		assertEquals('d', original.getW());
		assertEquals('c', newInstance.getX());
		assertEquals('d', newInstance.getY());
		assertEquals('e', newInstance.getZ());
		assertEquals('f', newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4c#getNewInstance(char)} calls
	 * the function {@link Tup4c#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4c newInstance = mock(Tup4c.class);
		Tup4c t = mock(Tup4c.class);
		
		when(t.getNewInstance('a')).thenCallRealMethod();

		when(t.getNewInstance('a', 'a', 'a', 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance('a'));
		
		verify(t).getNewInstance('a');
		
		verify(t).getNewInstance('a', 'a', 'a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getNewInstance(Tup4cR)}
	 * returns a new instance of {@link Tup4c} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4cR original = mock(Tup4cR.class);
		Tup4c newInstance = mock(Tup4c.class);
		Tup4c t = mock(Tup4c.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		when(original.getZ()).thenReturn('c');
		when(original.getW()).thenReturn('d');
		when(t.getNewInstance('a', 'b', 'c', 'd')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4c#getNewInstance(TupcR)} calls
	 * the function {@link Tup4c#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		Tup4c newInstance = mock(Tup4c.class);
		Tup4c t = mock(Tup4c.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b', 'c', 'd'});
		when(t.getNewInstance('a', 'b', 'c', 'd')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4c#getNewInstanceFromArray(char[])} calls
	 * the function {@link Tup4c#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4c newInstance = mock(Tup4c.class);
		Tup4c t = mock(Tup4c.class);
		
		when(t.getNewInstanceFromArray(new char[] {'a', 'b', 'c', 'd'})).thenCallRealMethod();

		when(t.getNewInstance('a', 'b', 'c', 'd')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new char[] {'a', 'b', 'c', 'd'}));
		
		verify(t).getNewInstanceFromArray(new char[] {'a', 'b', 'c', 'd'});
		
		verify(t).getNewInstance('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t);
	}
}