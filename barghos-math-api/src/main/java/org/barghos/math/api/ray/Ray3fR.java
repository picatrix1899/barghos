package org.barghos.math.api.ray;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.api.util.function.FloatFunction3;
import org.barghos.tuple.api.t3.Tup3fR;

public interface Ray3fR
{
	Ray3fR createNew();
	
	default Ray3fR createNew(Ray3fR ray)
	{
		return createNew(ray.getOriginX(), ray.getOriginY(), ray.getOriginZ(), ray.getDirectionX(), ray.getDirectionY(), ray.getDirectionZ());
	}
	
	default Ray3fR createNew(Tup3fR o, Tup3fR d)
	{
		return createNew(o.getV0(), o.getV1(), o.getV2(), d.getV0(), d.getV1(), d.getV2());
	}
	
	default Ray3fR createNew(Tup3fR o, @MinLength(3) float[] d)
	{
		return createNew(o.getV0(), o.getV1(), o.getV2(), d[0], d[1], d[2]);
	}
	
	default Ray3fR createNew(Tup3fR o, float dX, float dY, float dZ)
	{
		return createNew(o.getV0(), o.getV1(), o.getV2(), dX, dY, dZ);
	}
	
	default Ray3fR createNew(@MinLength(3) float[] o, Tup3fR d)
	{
		return createNew(o[0], o[1], o[2], d.getV0(), d.getV1(), d.getV2());
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
		return createNew(oX, oY, oZ, d.getV0(), d.getV1(), d.getV2());
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
	
	float getOriginX();
	float getOriginY();
	float getOriginZ();
	
	<T extends Tup3fR> T getOrigin(@ExtractionParam T res);
	float[] getOrigin(@ExtractionParam @MinLength(3) float[] res);
	<T> T getOriginFunc(FloatFunction3<T> res);
	
	float getDirectionX();
	float getDirectionY();
	float getDirectionZ();
	
	<T extends Tup3fR> T getDirection(@ExtractionParam T res);
	float[] getDirection(@ExtractionParam @MinLength(3) float[] res);
	<T> T getDirectionFunc(FloatFunction3<T> res);
}
