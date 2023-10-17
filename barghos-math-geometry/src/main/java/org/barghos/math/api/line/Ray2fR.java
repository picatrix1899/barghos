package org.barghos.math.api.line;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.function.FloatBiFunction;
import org.barghos.core.tuple.Tup2fR;

public interface Ray2fR
{
	Ray2fR createNew();
	
	default Ray2fR createNew(Ray2fR ray)
	{
		return createNew(ray.originX(), ray.originY(), ray.directionX(), ray.directionY());
	}
	
	default Ray2fR createNew(Tup2fR o, Tup2fR d)
	{
		return createNew(o.v0(), o.v1(), d.v0(), d.v1());
	}
	
	default Ray2fR createNew(Tup2fR o, @MinLength(2) float[] d)
	{
		return createNew(o.v0(), o.v1(), d[0], d[1]);
	}
	
	default Ray2fR createNew(Tup2fR o, float dX, float dY)
	{
		return createNew(o.v0(), o.v1(), dX, dY);
	}
	
	default Ray2fR createNew(@MinLength(2) float[] o, Tup2fR d)
	{
		return createNew(o[0], o[1], d.v0(), d.v1());
	}
	
	default Ray2fR createNew(@MinLength(2) float[] o, @MinLength(2) float[] d)
	{
		return createNew(o[0], o[1], d[0], d[1]);
	}
	
	default Ray2fR createNew(@MinLength(2) float[] o, float dX, float dY)
	{
		return createNew(o[0], o[1], dX, dY);
	}
	
	default Ray2fR createNew(float oX, float oY, Tup2fR d)
	{
		return createNew(oX, oY, d.v0(), d.v1());
	}
	
	default Ray2fR createNew(float oX, float oY, @MinLength(2) float[] d)
	{
		return createNew(oX, oY, d[0], d[1]);
	}
	
	Ray2fR createNew(float oX, float oY, float dX, float dY);
	
	float originX();
	float originY();
	
	<T extends Tup2fR> T getOrigin(@ExtractionParam T res);
	float[] getOrigin(@ExtractionParam @MinLength(2) float[] res);
	<T> T getOriginFunc(FloatBiFunction<T> res);
	
	float directionX();
	float directionY();
	
	<T extends Tup2fR> T getDirection(@ExtractionParam T res);
	float[] getDirection(@ExtractionParam @MinLength(2) float[] res);
	<T> T getDirectionFunc(FloatBiFunction<T> res);
}
