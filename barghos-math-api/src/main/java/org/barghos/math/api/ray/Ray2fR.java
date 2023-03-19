package org.barghos.math.api.ray;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.api.util.function.FloatFunction2;
import org.barghos.tuple.api.t2.Tup2fR;

public interface Ray2fR
{
	Ray2fR createNew();
	
	default Ray2fR createNew(Ray2fR ray)
	{
		return createNew(ray.getOriginX(), ray.getOriginY(), ray.getDirectionX(), ray.getDirectionY());
	}
	
	default Ray2fR createNew(Tup2fR o, Tup2fR d)
	{
		return createNew(o.getV0(), o.getV1(), d.getV0(), d.getV1());
	}
	
	default Ray2fR createNew(Tup2fR o, @MinLength(2) float[] d)
	{
		return createNew(o.getV0(), o.getV1(), d[0], d[1]);
	}
	
	default Ray2fR createNew(Tup2fR o, float dX, float dY)
	{
		return createNew(o.getV0(), o.getV1(), dX, dY);
	}
	
	default Ray2fR createNew(@MinLength(2) float[] o, Tup2fR d)
	{
		return createNew(o[0], o[1], d.getV0(), d.getV1());
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
		return createNew(oX, oY, d.getV0(), d.getV1());
	}
	
	default Ray2fR createNew(float oX, float oY, @MinLength(2) float[] d)
	{
		return createNew(oX, oY, d[0], d[1]);
	}
	
	Ray2fR createNew(float oX, float oY, float dX, float dY);
	
	float getOriginX();
	float getOriginY();
	
	<T extends Tup2fR> T getOrigin(@ExtractionParam T res);
	float[] getOrigin(@ExtractionParam @MinLength(2) float[] res);
	<T> T getOriginFunc(FloatFunction2<T> res);
	
	float getDirectionX();
	float getDirectionY();
	
	<T extends Tup2fR> T getDirection(@ExtractionParam T res);
	float[] getDirection(@ExtractionParam @MinLength(2) float[] res);
	<T> T getDirectionFunc(FloatFunction2<T> res);
}
