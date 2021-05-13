package org.barghos.math.test.api.vec2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;

import org.barghos.core.tuple2.Tup2f;

import org.barghos.math.api.vec2.Vec2fR;

/**
 * This class provides component tests for the interface {@link Vec2fR}.
 * @author picatrix1899
 *
 */
class Vec2fRTest
{
	/**
	 * This method is called after each test in this class.
	 */
	@AfterEach
	void cleanup()
	{
		ValueRelay.clear();
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#addN(float, float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void addN_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.addN(2.0f, 4.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f + 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f + 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#addN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void addN_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.addN(2.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f + 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f + 2.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#addN(org.barghos.core.api.Tup2fR) Vec2f.addN(Tup2fR)}
	 * performs the calculation correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void addN_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		v.addN(v2);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f + 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f + 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#subN(float, float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void subN_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.subN(2.0f, 4.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f - 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f - 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#subN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void subN_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.subN(2.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f - 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f - 2.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#subN(org.barghos.core.api.Tup2fR) Vec2f.subN(Tup2fR)}
	 * performs the calculation correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void subN_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		v.subN(v2);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f - 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f - 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#mulN(float, float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void mulN_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.mulN(2.0f, 4.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f * 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f * 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#mulN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void mulN_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.mulN(2.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f * 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f * 2.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#mulN(org.barghos.core.api.Tup2fR) Vec2f.mulN(Tup2fR)}
	 * performs the calculation correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void mulN_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		v.mulN(v2);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f * 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f * 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#divN(float, float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void divN_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.divN(2.0f, 4.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f / 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f / 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#divN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void divN_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		v.divN(2.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f / 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f / 2.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#divN(org.barghos.core.api.Tup2fR) Vec2f.divN(Tup2fR)}
	 * performs the calculation correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void divN_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		v.divN(v2);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f / 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f / 4.0f, ValueRelay.get("getNewInstance_y", 0.0f));
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#addR(Tup2fW, float, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void addR_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.addR(t, 2.0f, 4.0f);

		assertSame(t, result);
		
		assertEquals(10.0f + 2.0f, result.getX());
		assertEquals(100.0f + 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#addR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void addR_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.addR(t, 2.0f);

		assertSame(t, result);
		
		assertEquals(10.0f + 2.0f, result.getX());
		assertEquals(100.0f + 2.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#addR(Tup2fW, org.barghos.core.api.Tup2fR) Vec2f.addR(Tup2fW, Tup2fR)}
	 * performs the calculation correct, transfers the result to the result object and
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void addR_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.addR(t, v2);

		assertSame(t, result);
		
		assertEquals(10.0f + 2.0f, result.getX());
		assertEquals(100.0f + 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#subR(Tup2fW, float, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void subR_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.subR(t, 2.0f, 4.0f);

		assertSame(t, result);
		
		assertEquals(10.0f - 2.0f, result.getX());
		assertEquals(100.0f - 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#subR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void subR_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.subR(t, 2.0f);

		assertSame(t, result);
		
		assertEquals(10.0f - 2.0f, result.getX());
		assertEquals(100.0f - 2.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#subR(Tup2fW, org.barghos.core.api.Tup2fR) Vec2f.subR(Tup2fW, Tup2fR)}
	 * performs the calculation correct, transfers the result to the result object and
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void subR_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.subR(t, v2);

		assertSame(t, result);
		
		assertEquals(10.0f - 2.0f, result.getX());
		assertEquals(100.0f - 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#mulR(Tup2fW, float, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void mulR_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.mulR(t, 2.0f, 4.0f);

		assertSame(t, result);
		
		assertEquals(10.0f * 2.0f, result.getX());
		assertEquals(100.0f * 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#mulR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void mulR_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.mulR(t, 2.0f);

		assertSame(t, result);
		
		assertEquals(10.0f * 2.0f, result.getX());
		assertEquals(100.0f * 2.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#mulR(Tup2fW, org.barghos.core.api.Tup2fR) Vec2f.mulR(Tup2fW, Tup2fR)}
	 * performs the calculation correct, transfers the result to the result object and
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void mulR_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.mulR(t, v2);

		assertSame(t, result);
		
		assertEquals(10.0f * 2.0f, result.getX());
		assertEquals(100.0f * 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#divR(Tup2fW, float, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void divR_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.divR(t, 2.0f, 4.0f);

		assertSame(t, result);
		
		assertEquals(10.0f / 2.0f, result.getX());
		assertEquals(100.0f / 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#divR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void divR_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.divR(t, 2.0f);

		assertSame(t, result);
		
		assertEquals(10.0f / 2.0f, result.getX());
		assertEquals(100.0f / 2.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#divR(Tup2fW, org.barghos.core.api.Tup2fR) Vec2f.divR(Tup2fW, Tup2fR)}
	 * performs the calculation correct, transfers the result to the result object and
	 * correct values and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void divR_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.divR(t, v2);

		assertSame(t, result);
		
		assertEquals(10.0f / 2.0f, result.getX());
		assertEquals(100.0f / 4.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#dot(float, float)} performs the calculation
	 * correct and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void dot_ComponentsTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);

		float result = v.dot(2.0f, 4.0f);
		
		assertEquals(10.0f * 2.0f + 100.0f * 4.0f, result);
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#dot(float)} performs the calculation
	 * correct and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void dot_ValueTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);

		float result = v.dot(2.0f);
		
		assertEquals(10.0f * 2.0f + 100.0f * 2.0f, result);
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#dot(org.barghos.core.api.tuple2.Tup2fR) Vec2f.dot(Tup2fR)}
	 * performs the calculation correct and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void dot_TupleTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		Vec2fR v2 = new TestVec(2.0f, 4.0f);
		
		float result = v.dot(v2);
		
		assertEquals(10.0f * 2.0f + 100.0f * 4.0f, result);
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
		
		assertEquals(2.0f, v2.getX());
		assertEquals(4.0f, v2.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#squaredLength()} performs the calculation
	 * correct.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void squaredLengthTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);

		float result = v.squaredLength();
		
		assertEquals(10.0f * 10.0f + 100.0f * 100.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeSquaredLength()} performs the calculation
	 * correct if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeSquaredLengthTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);

		float result = v.safeSquaredLength();
		
		assertEquals(10.0f * 10.0f + 100.0f * 100.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeSquaredLength()} performs the calculation
	 * correct if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeSquaredLength_ZeroTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f);

		float result = v.safeSquaredLength();
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrSquaredLength(float)} performs the calculation
	 * correct if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrSquaredLengthTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);

		float result = v.safeTrSquaredLength(1.0f);
		
		assertEquals(10.0f * 10.0f + 100.0f * 100.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrSquaredLength(float)} performs the calculation
	 * correct if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrSquaredLength_ZeroTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return true;
			}
		};

		float result = v.safeTrSquaredLength(1.0f);
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#length()} performs the calculation
	 * correct.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void lengthTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public float squaredLength()
			{
				return 10.0f;
			}
		};

		float result = v.length();
		
		assertEquals((float)Math.sqrt(10.0f), result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeLength()} performs the calculation
	 * correct if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeLengthTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public float squaredLength()
			{
				return 10.0f;
			}
		
			public boolean isZero()
			{
				return false;
			}
		};

		float result = v.safeLength();
		
		assertEquals((float)Math.sqrt(10.0f), result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeLength()} performs the calculation
	 * correct if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeLength_ZeroTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public boolean isZero()
			{
				return true;
			}
		};
		
		float result = v.safeLength();
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrLength(float)} performs the calculation
	 * correct if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrLengthTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public float squaredLength()
			{
				return 10.0f;
			}
			
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return false;
			}
		};

		float result = v.safeTrLength(1.0f);
		
		assertEquals((float)Math.sqrt(10.0f), result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrLength(float)} performs the calculation
	 * correct if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrLength_ZeroTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return true;
			}
		};
		
		float result = v.safeTrLength(1.0f);
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#reciprocalLength()} performs the calculation
	 * correct.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void reciprocalLengthTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public float length()
			{
				return 10.0f;
			}
		};
		
		float result = v.reciprocalLength();
		
		assertEquals(1.0f / 10.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeReciprocalLength()} performs the calculation
	 * correct if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeReciprocalLengthTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public float length()
			{
				return 10.0f;
			}
			
			public boolean isZero()
			{
				return false;
			}
		};
		
		float result = v.safeReciprocalLength();
		
		assertEquals(1.0f / 10.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeReciprocalLength()} performs the calculation
	 * correct if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeReciprocalLength_ZeroTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public boolean isZero()
			{
				return true;
			}
		};
		
		float result = v.safeReciprocalLength();
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrReciprocalLength(float)} performs the calculation
	 * correct if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrReciprocalLengthTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public float length()
			{
				return 10.0f;
			}
			
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return false;
			}
		};
		
		float result = v.safeTrReciprocalLength(1.0f);
		
		assertEquals(1.0f / 10.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrReciprocalLength(float)} performs the calculation
	 * correct if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrReciprocalLength_ZeroTest()
	{
		Vec2fR v = new TestVec(0.0f, 0.0f) {
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return true;
			}
		};
		
		float result = v.safeTrReciprocalLength(1.0f);
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#normalizeN()} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void normalizeNTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public float reciprocalLength()
			{
				return 2.0f;
			}
		};

		v.normalizeN();
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f * 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f * 2.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeNormalizeN()} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeNormalizeNTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return false;
			}
			
			public float reciprocalLength()
			{
				return 2.0f;
			}
		};

		v.safeNormalizeN();
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f * 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f * 2.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeNormalizeN()} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeNormalizeN_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return true;
			}
		};

		v.safeNormalizeN();
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(0.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(0.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrNormalizeN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrNormalizeNTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public float reciprocalLength()
			{
				return 2.0f;
			}
			
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return false;
			}
		};

		v.safeTrNormalizeN(1.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(10.0f * 2.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(100.0f * 2.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrNormalizeN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrNormalizeN_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public float reciprocalLength()
			{
				return 2.0f;
			}
			
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return true;
			}
		};

		v.safeTrNormalizeN(1.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(0.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(0.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#normalizeR(Tup2fW)} performs the calculation
	 * correct, transfers the result to the result object and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void normalizeRTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public float reciprocalLength()
			{
				return 2.0f;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.normalizeR(t);

		assertSame(t, result);
		
		assertEquals(10.0f * 2.0f, result.getX());
		assertEquals(100.0f * 2.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeNormalizeR(Tup2fW)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeNormalizeRTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return false;
			}
			
			public float reciprocalLength()
			{
				return 2.0f;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeNormalizeR(t);

		assertSame(t, result);
		
		assertEquals(10.0f * 2.0f, result.getX());
		assertEquals(100.0f * 2.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeNormalizeR(Tup2fW)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeNormalizeR_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return true;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeNormalizeR(t);

		assertSame(t, result);
		
		assertEquals(0.0f, result.getX());
		assertEquals(0.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrNormalizeR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrNormalizeRTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public float reciprocalLength()
			{
				return 2.0f;
			}
			
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return false;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeTrNormalizeR(t, 1.0f);

		assertSame(t, result);
		
		assertEquals(10.0f * 2.0f, result.getX());
		assertEquals(100.0f * 2.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrNormalizeR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrNormalizeR_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public float reciprocalLength()
			{
				return 2.0f;
			}
			
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return true;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeTrNormalizeR(t, 1.0f);

		assertSame(t, result);
		
		assertEquals(0.0f, result.getX());
		assertEquals(0.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#invertN()} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void invertNTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);

		v.invertN();
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(-10.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(-100.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#invertR(Tup2fW)} performs the calculation
	 * correct, transfers the result to the result object and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void invertRTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.invertR(t);

		assertSame(t, result);
		
		assertEquals(-10.0f, result.getX());
		assertEquals(-100.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#reciprocalN()} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void reciprocalNTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);

		v.reciprocalN();
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(1.0f / 10.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(1.0f / 100.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeReciprocalN()} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeReciprocalNTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return false;
			}
		};

		v.safeReciprocalN();
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(1.0f / 10.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(1.0f / 100.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeReciprocalN()} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeReciprocalN_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return true;
			}
		};

		v.safeNormalizeN();
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(0.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(0.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrReciprocalN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrReciprocalNTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return false;
			}
		};

		v.safeTrReciprocalN(1.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(1.0f / 10.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(1.0f / 100.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrReciprocalN(float)} performs the calculation
	 * correct, calls the {@link Vec2fR#getNewInstance(float, float)} function with the correct values and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrReciprocalN_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return true;
			}
		};

		v.safeTrNormalizeN(1.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstance", false));
		
		assertEquals(0.0f, ValueRelay.get("getNewInstance_x", 0.0f));
		assertEquals(0.0f, ValueRelay.get("getNewInstance_y", 0.0f));
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#reciprocalR(Tup2fW)} performs the calculation
	 * correct, transfers the result to the result object and does not alter the original.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void reciprocalRTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f);
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.reciprocalR(t);

		assertSame(t, result);
		
		assertEquals(1.0f / 10.0f, result.getX());
		assertEquals(1.0f / 100.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeReciprocalR(Tup2fW)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeReciprocalRTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return false;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeReciprocalR(t);

		assertSame(t, result);
		
		assertEquals(1.0f / 10.0f, result.getX());
		assertEquals(1.0f / 100.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeReciprocalR(Tup2fW)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeReciprocalR_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero()
			{
				return true;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeReciprocalR(t);

		assertSame(t, result);
		
		assertEquals(0.0f, result.getX());
		assertEquals(0.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrReciprocalR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the vector has a length.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrReciprocalRTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return false;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeTrReciprocalR(t, 1.0f);

		assertSame(t, result);
		
		assertEquals(1.0f / 10.0f, result.getX());
		assertEquals(1.0f / 100.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Vec2fR#safeTrReciprocalR(Tup2fW, float)} performs the calculation
	 * correct, transfers the result to the result object and
	 * does not alter the original if the target vector is a zero length vector.
	 * 
	 * @author picatrix1899
	 */
	@Test
	void safeTrReciprocalR_ZeroTest()
	{
		Vec2fR v = new TestVec(10.0f, 100.0f) {
			public boolean isZero(float tolerance)
			{
				assertEquals(1.0f, tolerance);
				
				return true;
			}
		};
		
		Tup2f t = new Tup2f();
		
		Tup2f result = v.safeTrReciprocalR(t, 1.0f);

		assertSame(t, result);
		
		assertEquals(0.0f, result.getX());
		assertEquals(0.0f, result.getY());
		
		assertEquals(10.0f, v.getX());
		assertEquals(100.0f, v.getY());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Vec2fR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestVec implements Vec2fR
	{
		private float x;
		private float y;
		
		public TestVec(float x, float y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public float getX()
		{
			return this.x;
		}

		@Override
		public float getY()
		{
			return this.y;
		}
		
		@Override
		public TestVec getNewInstance(float x, float y)
		{
			ValueRelay.relayCall("getNewInstance");
			ValueRelay.relay("getNewInstance_x", x);
			ValueRelay.relay("getNewInstance_y", y);
			return new TestVec(x, y);
		}
	}
}