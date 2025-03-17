package org.barghostest.util.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

import org.barghos.util.math.DefaultRoundingUtilsProvider;

import org.junit.jupiter.api.Test;

public class DefaultRoundingUtilsProviderTest
{
	@Test
	void floorEvenTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::floorEven;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(4.0, f.apply(4.8));
		assertEquals(4.0, f.apply(4.5));
		assertEquals(4.0, f.apply(4.2));
		assertEquals(4.0, f.apply(4.0));
		assertEquals(2.0, f.apply(3.8));
		assertEquals(2.0, f.apply(3.5));
		assertEquals(2.0, f.apply(3.2));
		assertEquals(2.0, f.apply(3.0));
		assertEquals(2.0, f.apply(2.8));
		assertEquals(2.0, f.apply(2.5));
		assertEquals(2.0, f.apply(2.2));
		assertEquals(2.0, f.apply(2.0));
		assertEquals(0.0, f.apply(0.8));
		assertEquals(0.0, f.apply(0.5));
		assertEquals(0.0, f.apply(0.2));
		assertEquals(0.0, f.apply(0.0));
		assertEquals(-0.0, f.apply(-0.0));
		assertEquals(-2.0, f.apply(-0.2));
		assertEquals(-2.0, f.apply(-0.5));
		assertEquals(-2.0, f.apply(-0.8));
		assertEquals(-4.0, f.apply(-3.0));
		assertEquals(-4.0, f.apply(-3.2));
		assertEquals(-4.0, f.apply(-3.5));
		assertEquals(-4.0, f.apply(-3.8));
		assertEquals(-4.0, f.apply(-4.0));
		assertEquals(-6.0, f.apply(-4.2));
		assertEquals(-6.0, f.apply(-4.5));
		assertEquals(-6.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void floorOddTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::floorOdd;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(3.0, f.apply(4.8));
		assertEquals(3.0, f.apply(4.5));
		assertEquals(3.0, f.apply(4.2));
		assertEquals(3.0, f.apply(4.0));
		assertEquals(3.0, f.apply(3.8));
		assertEquals(3.0, f.apply(3.5));
		assertEquals(3.0, f.apply(3.2));
		assertEquals(3.0, f.apply(3.0));
		assertEquals(1.0, f.apply(2.8));
		assertEquals(1.0, f.apply(2.5));
		assertEquals(1.0, f.apply(2.2));
		assertEquals(1.0, f.apply(2.0));
		assertEquals(-1.0, f.apply(0.8));
		assertEquals(-1.0, f.apply(0.5));
		assertEquals(-1.0, f.apply(0.2));
		assertEquals(-1.0, f.apply(0.0));
		assertEquals(-1.0, f.apply(-0.0));
		assertEquals(-1.0, f.apply(-0.2));
		assertEquals(-1.0, f.apply(-0.5));
		assertEquals(-1.0, f.apply(-0.8));
		assertEquals(-3.0, f.apply(-3.0));
		assertEquals(-5.0, f.apply(-3.2));
		assertEquals(-5.0, f.apply(-3.5));
		assertEquals(-5.0, f.apply(-3.8));
		assertEquals(-5.0, f.apply(-4.0));
		assertEquals(-5.0, f.apply(-4.2));
		assertEquals(-5.0, f.apply(-4.5));
		assertEquals(-5.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void floorOddZeroTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::floorOddZero;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(3.0, f.apply(4.8));
		assertEquals(3.0, f.apply(4.5));
		assertEquals(3.0, f.apply(4.2));
		assertEquals(3.0, f.apply(4.0));
		assertEquals(3.0, f.apply(3.8));
		assertEquals(3.0, f.apply(3.5));
		assertEquals(3.0, f.apply(3.2));
		assertEquals(3.0, f.apply(3.0));
		assertEquals(1.0, f.apply(2.8));
		assertEquals(1.0, f.apply(2.5));
		assertEquals(1.0, f.apply(2.2));
		assertEquals(1.0, f.apply(2.0));
		assertEquals(-1.0, f.apply(0.8));
		assertEquals(-1.0, f.apply(0.5));
		assertEquals(-1.0, f.apply(0.2));
		assertEquals(0.0, f.apply(0.0));
		assertEquals(-0.0, f.apply(-0.0));
		assertEquals(-1.0, f.apply(-0.2));
		assertEquals(-1.0, f.apply(-0.5));
		assertEquals(-1.0, f.apply(-0.8));
		assertEquals(-3.0, f.apply(-3.0));
		assertEquals(-5.0, f.apply(-3.2));
		assertEquals(-5.0, f.apply(-3.5));
		assertEquals(-5.0, f.apply(-3.8));
		assertEquals(-5.0, f.apply(-4.0));
		assertEquals(-5.0, f.apply(-4.2));
		assertEquals(-5.0, f.apply(-4.5));
		assertEquals(-5.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void ceilEvenTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::ceilEven;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(6.0, f.apply(4.8));
		assertEquals(6.0, f.apply(4.5));
		assertEquals(6.0, f.apply(4.2));
		assertEquals(4.0, f.apply(4.0));
		assertEquals(4.0, f.apply(3.8));
		assertEquals(4.0, f.apply(3.5));
		assertEquals(4.0, f.apply(3.2));
		assertEquals(4.0, f.apply(3.0));
		assertEquals(4.0, f.apply(2.8));
		assertEquals(4.0, f.apply(2.5));
		assertEquals(4.0, f.apply(2.2));
		assertEquals(2.0, f.apply(2.0));
		assertEquals(2.0, f.apply(0.8));
		assertEquals(2.0, f.apply(0.5));
		assertEquals(2.0, f.apply(0.2));
		assertEquals(0.0, f.apply(0.0));
		assertEquals(-0.0, f.apply(-0.0));
		assertEquals(-0.0, f.apply(-0.2));
		assertEquals(-0.0, f.apply(-0.5));
		assertEquals(-0.0, f.apply(-0.8));
		assertEquals(-2.0, f.apply(-3.0));
		assertEquals(-2.0, f.apply(-3.2));
		assertEquals(-2.0, f.apply(-3.5));
		assertEquals(-2.0, f.apply(-3.8));
		assertEquals(-4.0, f.apply(-4.0));
		assertEquals(-4.0, f.apply(-4.2));
		assertEquals(-4.0, f.apply(-4.5));
		assertEquals(-4.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void ceilOddTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::ceilOdd;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(5.0, f.apply(4.8));
		assertEquals(5.0, f.apply(4.5));
		assertEquals(5.0, f.apply(4.2));
		assertEquals(5.0, f.apply(4.0));
		assertEquals(5.0, f.apply(3.8));
		assertEquals(5.0, f.apply(3.5));
		assertEquals(5.0, f.apply(3.2));
		assertEquals(3.0, f.apply(3.0));
		assertEquals(3.0, f.apply(2.8));
		assertEquals(3.0, f.apply(2.5));
		assertEquals(3.0, f.apply(2.2));
		assertEquals(3.0, f.apply(2.0));
		assertEquals(1.0, f.apply(0.8));
		assertEquals(1.0, f.apply(0.5));
		assertEquals(1.0, f.apply(0.2));
		assertEquals(1.0, f.apply(0.0));
		assertEquals(1.0, f.apply(-0.0));
		assertEquals(1.0, f.apply(-0.2));
		assertEquals(1.0, f.apply(-0.5));
		assertEquals(1.0, f.apply(-0.8));
		assertEquals(-3.0, f.apply(-3.0));
		assertEquals(-3.0, f.apply(-3.2));
		assertEquals(-3.0, f.apply(-3.5));
		assertEquals(-3.0, f.apply(-3.8));
		assertEquals(-3.0, f.apply(-4.0));
		assertEquals(-3.0, f.apply(-4.2));
		assertEquals(-3.0, f.apply(-4.5));
		assertEquals(-3.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void ceilOddZeroTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::ceilOddZero;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(5.0, f.apply(4.8));
		assertEquals(5.0, f.apply(4.5));
		assertEquals(5.0, f.apply(4.2));
		assertEquals(5.0, f.apply(4.0));
		assertEquals(5.0, f.apply(3.8));
		assertEquals(5.0, f.apply(3.5));
		assertEquals(5.0, f.apply(3.2));
		assertEquals(3.0, f.apply(3.0));
		assertEquals(3.0, f.apply(2.8));
		assertEquals(3.0, f.apply(2.5));
		assertEquals(3.0, f.apply(2.2));
		assertEquals(3.0, f.apply(2.0));
		assertEquals(1.0, f.apply(0.8));
		assertEquals(1.0, f.apply(0.5));
		assertEquals(1.0, f.apply(0.2));
		assertEquals(0.0, f.apply(0.0));
		assertEquals(-0.0, f.apply(-0.0));
		assertEquals(1.0, f.apply(-0.2));
		assertEquals(1.0, f.apply(-0.5));
		assertEquals(1.0, f.apply(-0.8));
		assertEquals(-3.0, f.apply(-3.0));
		assertEquals(-3.0, f.apply(-3.2));
		assertEquals(-3.0, f.apply(-3.5));
		assertEquals(-3.0, f.apply(-3.8));
		assertEquals(-3.0, f.apply(-4.0));
		assertEquals(-3.0, f.apply(-4.2));
		assertEquals(-3.0, f.apply(-4.5));
		assertEquals(-3.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void roundEvenTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::roundEven;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(4.0, f.apply(4.8));
		assertEquals(4.0, f.apply(4.5));
		assertEquals(4.0, f.apply(4.2));
		assertEquals(4.0, f.apply(4.0));
		assertEquals(4.0, f.apply(3.8));
		assertEquals(4.0, f.apply(3.5));
		assertEquals(4.0, f.apply(3.2));
		assertEquals(4.0, f.apply(3.0));
		assertEquals(2.0, f.apply(2.8));
		assertEquals(2.0, f.apply(2.5));
		assertEquals(2.0, f.apply(2.2));
		assertEquals(2.0, f.apply(2.0));
		assertEquals(0.0, f.apply(0.8));
		assertEquals(0.0, f.apply(0.5));
		assertEquals(0.0, f.apply(0.2));
		assertEquals(0.0, f.apply(0.0));
		assertEquals(-0.0, f.apply(-0.0));
		assertEquals(0.0, f.apply(-0.2));
		assertEquals(0.0, f.apply(-0.5));
		assertEquals(0.0, f.apply(-0.8));
		assertEquals(-2.0, f.apply(-3.0));
		assertEquals(-4.0, f.apply(-3.2));
		assertEquals(-4.0, f.apply(-3.5));
		assertEquals(-4.0, f.apply(-3.8));
		assertEquals(-4.0, f.apply(-4.0));
		assertEquals(-4.0, f.apply(-4.2));
		assertEquals(-4.0, f.apply(-4.5));
		assertEquals(-4.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void roundOddTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::roundOdd;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(5.0, f.apply(4.8));
		assertEquals(5.0, f.apply(4.5));
		assertEquals(5.0, f.apply(4.2));
		assertEquals(5.0, f.apply(4.0));
		assertEquals(3.0, f.apply(3.8));
		assertEquals(3.0, f.apply(3.5));
		assertEquals(3.0, f.apply(3.2));
		assertEquals(3.0, f.apply(3.0));
		assertEquals(3.0, f.apply(2.8));
		assertEquals(3.0, f.apply(2.5));
		assertEquals(3.0, f.apply(2.2));
		assertEquals(3.0, f.apply(2.0));
		assertEquals(1.0, f.apply(0.8));
		assertEquals(1.0, f.apply(0.5));
		assertEquals(1.0, f.apply(0.2));
		assertEquals(1.0, f.apply(0.0));
		assertEquals(1.0, f.apply(-0.0));
		assertEquals(-1.0, f.apply(-0.2));
		assertEquals(-1.0, f.apply(-0.5));
		assertEquals(-1.0, f.apply(-0.8));
		assertEquals(-3.0, f.apply(-3.0));
		assertEquals(-3.0, f.apply(-3.2));
		assertEquals(-3.0, f.apply(-3.5));
		assertEquals(-3.0, f.apply(-3.8));
		assertEquals(-3.0, f.apply(-4.0));
		assertEquals(-5.0, f.apply(-4.2));
		assertEquals(-5.0, f.apply(-4.5));
		assertEquals(-5.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
	
	@Test
	void roundOddZeroTest()
	{
		DefaultRoundingUtilsProvider p = new DefaultRoundingUtilsProvider();
		
		Function<Double,Double> f = p::roundOddZero;
		
		assertEquals(Double.POSITIVE_INFINITY, f.apply(Double.POSITIVE_INFINITY));
		assertEquals(5.0, f.apply(4.8));
		assertEquals(5.0, f.apply(4.5));
		assertEquals(5.0, f.apply(4.2));
		assertEquals(5.0, f.apply(4.0));
		assertEquals(3.0, f.apply(3.8));
		assertEquals(3.0, f.apply(3.5));
		assertEquals(3.0, f.apply(3.2));
		assertEquals(3.0, f.apply(3.0));
		assertEquals(3.0, f.apply(2.8));
		assertEquals(3.0, f.apply(2.5));
		assertEquals(3.0, f.apply(2.2));
		assertEquals(3.0, f.apply(2.0));
		assertEquals(1.0, f.apply(0.8));
		assertEquals(1.0, f.apply(0.5));
		assertEquals(1.0, f.apply(0.2));
		assertEquals(0.0, f.apply(0.0));
		assertEquals(-0.0, f.apply(-0.0));
		assertEquals(-1.0, f.apply(-0.2));
		assertEquals(-1.0, f.apply(-0.5));
		assertEquals(-1.0, f.apply(-0.8));
		assertEquals(-3.0, f.apply(-3.0));
		assertEquals(-3.0, f.apply(-3.2));
		assertEquals(-3.0, f.apply(-3.5));
		assertEquals(-3.0, f.apply(-3.8));
		assertEquals(-3.0, f.apply(-4.0));
		assertEquals(-5.0, f.apply(-4.2));
		assertEquals(-5.0, f.apply(-4.5));
		assertEquals(-5.0, f.apply(-4.8));
		assertEquals(Double.NEGATIVE_INFINITY, f.apply(Double.NEGATIVE_INFINITY));
		assertEquals(Double.NaN, f.apply(Double.NaN));
	}
}
