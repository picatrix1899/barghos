//package org.barghos.math.line;
//
//import org.barghos.annotation.ExtractionParam;
//import org.barghos.annotation.MinLength;
//import org.barghos.core.function.FloatTriFunction;
//import org.barghos.core.tuple.Tup3fC;
//import org.barghos.core.tuple.Tup3fR;
//
//public interface Line3fR
//{
//	Line3fR createNew();
//	
//	default Line3fR createNew(Line3fR line)
//	{
//		return createNew(line.p0x(), line.p0y(), line.p0z(), line.p1x(), line.p1y(), line.p1z());
//	}
//	
//	default Line3fR createNew(Tup3fR p0, Tup3fR p1)
//	{
//		return createNew(p0.v0(), p0.v1(), p0.v2(), p1.v0(), p1.v1(), p1.v2());
//	}
//	
//	default Line3fR createNew(Tup3fR p0, @MinLength(3) float[] p1)
//	{
//		return createNew(p0.v0(), p0.v1(), p0.v2(), p1[0], p1[1], p1[2]);
//	}
//	
//	default Line3fR createNew(Tup3fR p0, float p1x, float p1y, float p1z)
//	{
//		return createNew(p0.v0(), p0.v1(), p0.v2(), p1x, p1y, p1z);
//	}
//	
//	default Line3fR createNew(@MinLength(3) float[] p0, Tup3fR p1)
//	{
//		return createNew(p0[0], p0[1], p0[2], p1.v0(), p1.v1(), p1.v2());
//	}
//	
//	default Line3fR createNew(@MinLength(3) float[] p0, @MinLength(3) float[] p1)
//	{
//		return createNew(p0[0], p0[1], p0[2], p1[0], p1[1], p1[2]);
//	}
//	
//	default Line3fR createNew(@MinLength(3) float[] p0, float p1x, float p1y, float p1z)
//	{
//		return createNew(p0[0], p0[1], p0[2], p1x, p1y, p1z);
//	}
//	
//	default Line3fR createNew(float p0x, float p0y, float p0z, Tup3fR p1)
//	{
//		return createNew(p0x, p0y, p0z, p1.v0(), p1.v1(), p1.v2());
//	}
//	
//	default Line3fR createNew(float p0x, float p0y, float p0z, @MinLength(3) float[] p1)
//	{
//		return createNew(p0x, p0y, p0z, p1[0], p1[1], p1[2]);
//	}
//	
//	Line3fR createNew(float p0x, float p0y, float p0z, float p1x, float p1y, float p1z);
//	
//	/**
//	 * Creates a new instance of the current class with the same component values.
//	 * 
//	 * @return A new instance.
//	 */
//	Line3fR copy();
//	
//	float p0x();
//	float p0y();
//	float p0z();
//	
//	<T extends Tup3fC> T getP0(@ExtractionParam T res);
//	float[] getP0(@ExtractionParam @MinLength(3) float[] res);
//	<T> T getP0Func(FloatTriFunction<T> res);
//	
//	float p1x();
//	float p1y();
//	float p1z();
//	
//	<T extends Tup3fC> T getP1(@ExtractionParam T res);
//	float[] getP1(@ExtractionParam @MinLength(3) float[] res);
//	<T> T getP1Func(FloatTriFunction<T> res);
//	
//	float vectorP0ToP1X();
//	float vectorP0ToP1Y();
//	float vectorP0ToP1Z();
//	
//	<T extends Tup3fC> T vectorP0ToP1(@ExtractionParam T res);
//	float[] vectorP0ToP1(@ExtractionParam @MinLength(3) float[] res);
//	<T> T vectorP0ToP1Func(FloatTriFunction<T> res);
//	
//	float vectorP1ToP0X();
//	float vectorP1ToP0Y();
//	float vectorP1ToP0Z();
//	
//	<T extends Tup3fC> T vectorP1ToP0(@ExtractionParam T res);
//	float[] vectorP1ToP0(@ExtractionParam @MinLength(3) float[] res);
//	<T> T vectorP1ToP0Func(FloatTriFunction<T> res);
//	
//	float directionP0ToP1X();
//	float directionP0ToP1Y();
//	float directionP0ToP1Z();
//	
//	<T extends Tup3fC> T directionP0ToP1(@ExtractionParam T res);
//	float[] directionP0ToP1(@ExtractionParam @MinLength(3) float[] res);
//	<T> T directionP0ToP1Func(FloatTriFunction<T> res);
//	
//	float directionP1ToP0X();
//	float directionP1ToP0Y();
//	float directionP1ToP0Z();
//	
//	<T extends Tup3fC> T directionP1ToP0(@ExtractionParam T res);
//	float[] directionP1ToP0(@ExtractionParam @MinLength(3) float[] res);
//	<T> T directionP1ToP0Func(FloatTriFunction<T> res);
//}
package org;


