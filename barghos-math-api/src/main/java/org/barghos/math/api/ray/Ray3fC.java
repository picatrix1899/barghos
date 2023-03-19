package org.barghos.math.api.ray;

import org.barghos.annotation.MinLength;
import org.barghos.tuple.api.t3.Tup3fR;

public interface Ray3fC extends Ray3fR
{
	Ray3fC createNew();
	
	default Ray3fC createNew(Ray3fR ray)
	{
		return createNew(ray.getOriginX(), ray.getOriginY(), ray.getOriginZ(), ray.getDirectionX(), ray.getDirectionY(), ray.getDirectionZ());
	}
	
	default Ray3fC createNew(Tup3fR o, Tup3fR d)
	{
		return createNew(o.getV0(), o.getV1(), o.getV2(), d.getV0(), d.getV1(), d.getV2());
	}
	
	default Ray3fC createNew(Tup3fR o, @MinLength(3) float[] d)
	{
		return createNew(o.getV0(), o.getV1(), o.getV2(), d[0], d[1], d[2]);
	}
	
	default Ray3fC createNew(Tup3fR o, float dX, float dY, float dZ)
	{
		return createNew(o.getV0(), o.getV1(), o.getV2(), dX, dY, dZ);
	}
	
	default Ray3fC createNew(@MinLength(3) float[] o, Tup3fR d)
	{
		return createNew(o[0], o[1], o[2], d.getV0(), d.getV1(), d.getV2());
	}
	
	default Ray3fC createNew(@MinLength(3) float[] o, @MinLength(3) float[] d)
	{
		return createNew(o[0], o[1], o[2], d[0], d[1], d[2]);
	}
	
	default Ray3fC createNew(@MinLength(3) float[] o, float dX, float dY, float dZ)
	{
		return createNew(o[0], o[1], o[2], dX, dY, dZ);
	}
	
	default Ray3fC createNew(float oX, float oY, float oZ, Tup3fR d)
	{
		return createNew(oX, oY, oZ, d.getV0(), d.getV1(), d.getV2());
	}
	
	default Ray3fC createNew(float oX, float oY, float oZ, @MinLength(3) float[] d)
	{
		return createNew(oX, oY, oZ, d[0], d[1], d[2]);
	}
	
	Ray3fC createNew(float oX, float oY, float oZ, float dX, float dY, float dZ);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	Ray3fC copy();
	
	default Ray3fC set(Tup3fR o, Tup3fR d)
	{
		return set(o.getV0(), o.getV1(), o.getV2(), d.getV0(), d.getV1(), d.getV2());
	}
	
	default Ray3fC set(Tup3fR o, @MinLength(3) float[] d)
	{
		return set(o.getV0(), o.getV1(), o.getV2(), d[0], d[1], d[2]);
	}
	
	default Ray3fC set(Tup3fR o, float dX, float dY, float dZ)
	{
		return set(o.getV0(), o.getV1(), o.getV2(), dX, dY, dZ);
	}
	
	default Ray3fC set(@MinLength(3) float[] o, Tup3fR d)
	{
		return set(o[0], o[1], o[2], d.getV0(), d.getV1(), d.getV2());
	}
	
	default Ray3fC set(@MinLength(3) float[] o, @MinLength(3) float[] d)
	{
		return set(o[0], o[1], o[2], d[0], d[1], d[2]);
	}
	
	default Ray3fC set(@MinLength(3) float[] o, float dX, float dY, float dZ)
	{
		return set(o[0], o[1], o[2], dX, dY, dZ);
	}
	
	default Ray3fC set(float oX, float oY, float oZ, Tup3fR d)
	{
		return set(oX, oY, oZ, d.getV0(), d.getV1(), d.getV2());
	}
	
	default Ray3fC set(float oX, float oY, float oZ, @MinLength(3) float[] d)
	{
		return set(oX, oY, oZ, d[0], d[1], d[2]);
	}
	
	Ray3fC set(float oX, float oY, float oZ, float dX, float dY, float dZ);
	
	default Ray3fC setOrigin(Tup3fR o)
	{
		return setOrigin(o.getV0(), o.getV1(), o.getV2());
	}
	
	default Ray3fC setOrigin(@MinLength(3) float[] o)
	{
		return setOrigin(o[0], o[1], o[2]);
	}
	
	Ray3fC setOrigin(float x, float y, float z);
	
	Ray3fC setOriginX(float x);
	Ray3fC setOriginY(float y);
	Ray3fC setOriginZ(float z);
	
	default Ray3fC setDirection(Tup3fR o)
	{
		return setDirection(o.getV0(), o.getV1(), o.getV2());
	}
	
	default Ray3fC setDirection(@MinLength(3) float[] d)
	{
		return setDirection(d[0], d[1], d[2]);
	}
	
	Ray3fC setDirection(float x, float y, float z);
	
	Ray3fC setDirectionX(float x);
	Ray3fC setDirectionY(float y);
	Ray3fC setDirectionZ(float z);
}
