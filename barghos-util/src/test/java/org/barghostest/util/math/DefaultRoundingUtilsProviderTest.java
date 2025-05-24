package org.barghostest.util.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

import org.barghos.util.math.DefaultMathUtilsProvider;
import org.barghos.util.math.MathUtilsProvider;
import org.junit.jupiter.api.Test;

public class DefaultRoundingUtilsProviderTest
{
	@Test
	void floorEvenTest()
	{
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
		MathUtilsProvider.RoundProvider p = new DefaultMathUtilsProvider.DefaultRoundProvider();
		
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
