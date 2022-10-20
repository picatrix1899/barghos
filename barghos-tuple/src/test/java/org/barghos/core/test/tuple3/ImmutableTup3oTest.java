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
///*
//MIT License
//
//Copyright (c) 2020 picatrix1899 (Florian Zilkenat)
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in all
//copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//SOFTWARE.
//*/
//
//package org.barghos.core.test.tuple3;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.barghos.core.tuple3.ImmutableTup3o;
//import org.barghos.tuple.api.t3.Tup3oR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup3o}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup3oTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3o} generated from an existing instance of {@link Tup3oR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple3Test()
//	{
//		@SuppressWarnings("unchecked")
//		Tup3oR<Integer,Double,String> original = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
//		
//		when(original.getX()).thenReturn(1);
//		when(original.getY()).thenReturn(1.0);
//		when(original.getZ()).thenReturn("a");
//		
//		ImmutableTup3o<Integer,Double,String> t = new ImmutableTup3o<>(original);
//		
//		assertEquals(1, (int)t.getX());
//		assertEquals(1.0, (double)t.getY());
//		assertEquals("a", t.getZ());
//		
//		verify(original).getX();
//		verify(original).getY();
//		verify(original).getZ();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3o} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertEquals(1, (int)t.getX());
//		assertEquals(1.0, (double)t.getY());
//		assertEquals("a", t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3o#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertEquals(1, (int)t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3o#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertEquals(1.0, (double)t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3o#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertEquals("a", t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3o#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t = new ImmutableTup3o<>(1, 1.0, "a");
//
//		assertEquals(-1106216831, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t1 = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t1 = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t1 = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup3oR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple3Test()
//	{
//		ImmutableTup3o<Integer,Double,String> t1 = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		@SuppressWarnings("unchecked")
//		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(1.0);
//		when(t2.getZ()).thenReturn("a");
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3oR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingXTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t1 = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		@SuppressWarnings("unchecked")
//		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
//		
//		when(t2.getX()).thenReturn(2);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3oR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingYTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t1 = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		@SuppressWarnings("unchecked")
//		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
//
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(2.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3oR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingZTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t1 = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		@SuppressWarnings("unchecked")
//		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
//
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(1.0);
//		when(t2.getZ()).thenReturn("b");
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3o#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup3o<Integer,Double,String> t = new ImmutableTup3o<>(1, 1.0, "a");
//		
//		assertEquals("immutableTup3o(x=1, y=1.0, z=a)", t.toString());
//	}
//}