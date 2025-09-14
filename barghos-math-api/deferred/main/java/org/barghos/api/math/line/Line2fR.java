//package org.barghos.math.line;
//
//import org.barghos.annotation.ExtractionParam;
//import org.barghos.annotation.MinLength;
//import org.barghos.core.function.FloatBiFunction;
//import org.barghos.core.tuple.Tup2fC;
//import org.barghos.core.tuple.Tup2fR;
//
///**
// * A line expanding through two points to infinity.
// */
//public interface Line2fR
//{
//	Line2fR createNew();
//	
//	default Line2fR createNew(Line2fR line)
//	{
//		return createNew(line.p0x(), line.p0y(), line.p1x(), line.p1y());
//	}
//	
//	default Line2fR createNew(Tup2fR p0, Tup2fR p1)
//	{
//		return createNew(p0.v0(), p0.v1(), p1.v0(), p1.v1());
//	}
//	
//	default Line2fR createNew(Tup2fR p0, @MinLength(2) float[] p1)
//	{
//		return createNew(p0.v0(), p0.v1(), p1[0], p1[1]);
//	}
//	
//	default Line2fR createNew(Tup2fR p0, float p1X, float p1Y)
//	{
//		return createNew(p0.v0(), p0.v1(), p1X, p1Y);
//	}
//	
//	default Line2fR createNew(@MinLength(2) float[] p0, Tup2fR p1)
//	{
//		return createNew(p0[0], p0[1], p1.v0(), p1.v1());
//	}
//	
//	default Line2fR createNew(@MinLength(2) float[] p0, @MinLength(2) float[] p1)
//	{
//		return createNew(p0[0], p0[1], p1[0], p1[1]);
//	}
//	
//	default Line2fR createNew(@MinLength(2) float[] p0, float p1X, float p1Y)
//	{
//		return createNew(p0[0], p0[1], p1X, p1Y);
//	}
//	
//	default Line2fR createNew(float p0X, float p0Y, Tup2fR p1)
//	{
//		return createNew(p0X, p0Y, p1.v0(), p1.v1());
//	}
//	
//	default Line2fR createNew(float p0X, float p0Y, @MinLength(2) float[] p1)
//	{
//		return createNew(p0X, p0Y, p1[0], p1[1]);
//	}
//	
//	Line2fR createNew(float p0X, float p0Y, float p1X, float p1Y);
//	
//	/**
//	 * Creates a new instance of the current class with the same component values.
//	 * 
//	 * @return A new instance.
//	 */
//	Line2fR copy();
//	
//	float p0x();
//	float p0y();
//	
//	<T extends Tup2fC> T getP0(@ExtractionParam T res);
//	float[] getP0(@ExtractionParam @MinLength(2) float[] res);
//	<T> T getP0Func(FloatBiFunction<T> res);
//	
//	float p1x();
//	float p1y();
//	
//	<T extends Tup2fC> T getP1(@ExtractionParam T res);
//	float[] getP1(@ExtractionParam @MinLength(2) float[] res);
//	<T> T getP1Func(FloatBiFunction<T> res);
//	
//	float vectorP0ToP1X();
//	float vectorP0ToP1Y();
//	
//	<T extends Tup2fC> T vectorP0ToP1(@ExtractionParam T res);
//	float[] vectorP0ToP1(@ExtractionParam @MinLength(2) float[] res);
//	<T> T vectorP0ToP1Func(FloatBiFunction<T> res);
//	
//	float vectorP1ToP0X();
//	float vectorP1ToP0Y();
//	
//	<T extends Tup2fC> T vectorP1ToP0(@ExtractionParam T res);
//	float[] vectorP1ToP0(@ExtractionParam @MinLength(2) float[] res);
//	<T> T vectorP1ToP0Func(FloatBiFunction<T> res);
//	
//	float directionP0ToP1X();
//	float directionP0ToP1Y();
//	
//	<T extends Tup2fC> T directionP0ToP1(@ExtractionParam T res);
//	float[] directionP0ToP1(@ExtractionParam @MinLength(2) float[] res);
//	<T> T directionP0ToP1Func(FloatBiFunction<T> res);
//	
//	float directionP1ToP0X();
//	float directionP1ToP0Y();
//	
//	<T extends Tup2fC> T directionP1ToP0(@ExtractionParam T res);
//	float[] directionP1ToP0(@ExtractionParam @MinLength(2) float[] res);
//	<T> T directionP1ToP0Func(FloatBiFunction<T> res);
//}
package org;


