package org.barghos.math.line;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.function.FloatTriFunction;
import org.barghos.core.tuple.Tup3fR;

public interface Ray3fR
{
	Ray3fR createNew();
	
	default Ray3fR createNew(Ray3fR ray)
	{
		return createNew(ray.originX(), ray.originY(), ray.originZ(), ray.directionX(), ray.directionY(), ray.directionZ());
	}
	
	default Ray3fR createNew(Tup3fR o, Tup3fR d)
	{
		return createNew(o.v0(), o.v1(), o.v2(), d.v0(), d.v1(), d.v2());
	}
	
	default Ray3fR createNew(Tup3fR o, @MinLength(3) float[] d)
	{
		return createNew(o.v0(), o.v1(), o.v2(), d[0], d[1], d[2]);
	}
	
	default Ray3fR createNew(Tup3fR o, float dX, float dY, float dZ)
	{
		return createNew(o.v0(), o.v1(), o.v2(), dX, dY, dZ);
	}
	
	default Ray3fR createNew(@MinLength(3) float[] o, Tup3fR d)
	{
		return createNew(o[0], o[1], o[2], d.v0(), d.v1(), d.v2());
	}
	
	default Ray3fR createNew(@MinLength(3) float[] o, @MinLength(3) float[] d)
	{
		return createNew(o[0], o[1], o[2], d[0], d[1], d[2]);
	}
	
	default Ray3fR createNew(@MinLength(3) float[] o, float dX, float dY, float dZ)
	{
		return createNew(o[0], o[1], o[2], dX, dY, dZ);
	}
	
	default Ray3fR createNew(float oX, float oY, float oZ, Tup3fR d)
	{
		return createNew(oX, oY, oZ, d.v0(), d.v1(), d.v2());
	}
	
	default Ray3fR createNew(float oX, float oY, float oZ, @MinLength(3) float[] d)
	{
		return createNew(oX, oY, oZ, d[0], d[1], d[2]);
	}
	
	Ray3fR createNew(float oX, float oY, float oZ, float dX, float dY, float dZ);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	Ray3fR copy();
	
	float originX();
	float originY();
	float originZ();
	
	<T extends Tup3fR> T getOrigin(@ExtractionParam T res);
	float[] getOrigin(@ExtractionParam @MinLength(3) float[] res);
	<T> T getOriginFunc(FloatTriFunction<T> res);
	
	float directionX();
	float directionY();
	float directionZ();
	
	<T extends Tup3fR> T getDirection(@ExtractionParam T res);
	float[] getDirection(@ExtractionParam @MinLength(3) float[] res);
	<T> T getDirectionFunc(FloatTriFunction<T> res);
}
