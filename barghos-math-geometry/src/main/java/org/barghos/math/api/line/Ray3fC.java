package org.barghos.math.api.line;

import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup3fR;

public interface Ray3fC extends Ray3fR
{
	Ray3fC createNew();
	
	default Ray3fC createNew(Ray3fR ray)
	{
		return createNew(ray.originX(), ray.originY(), ray.originZ(), ray.directionX(), ray.directionY(), ray.directionZ());
	}
	
	default Ray3fC createNew(Tup3fR o, Tup3fR d)
	{
		return createNew(o.v0(), o.v1(), o.v2(), d.v0(), d.v1(), d.v2());
	}
	
	default Ray3fC createNew(Tup3fR o, @MinLength(3) float[] d)
	{
		return createNew(o.v0(), o.v1(), o.v2(), d[0], d[1], d[2]);
	}
	
	default Ray3fC createNew(Tup3fR o, float dX, float dY, float dZ)
	{
		return createNew(o.v0(), o.v1(), o.v2(), dX, dY, dZ);
	}
	
	default Ray3fC createNew(@MinLength(3) float[] o, Tup3fR d)
	{
		return createNew(o[0], o[1], o[2], d.v0(), d.v1(), d.v2());
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
		return createNew(oX, oY, oZ, d.v0(), d.v1(), d.v2());
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
		return set(o.v0(), o.v1(), o.v2(), d.v0(), d.v1(), d.v2());
	}
	
	default Ray3fC set(Tup3fR o, @MinLength(3) float[] d)
	{
		return set(o.v0(), o.v1(), o.v2(), d[0], d[1], d[2]);
	}
	
	default Ray3fC set(Tup3fR o, float dX, float dY, float dZ)
	{
		return set(o.v0(), o.v1(), o.v2(), dX, dY, dZ);
	}
	
	default Ray3fC set(@MinLength(3) float[] o, Tup3fR d)
	{
		return set(o[0], o[1], o[2], d.v0(), d.v1(), d.v2());
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
		return set(oX, oY, oZ, d.v0(), d.v1(), d.v2());
	}
	
	default Ray3fC set(float oX, float oY, float oZ, @MinLength(3) float[] d)
	{
		return set(oX, oY, oZ, d[0], d[1], d[2]);
	}
	
	Ray3fC set(float oX, float oY, float oZ, float dX, float dY, float dZ);
	
	default Ray3fC setOrigin(Tup3fR o)
	{
		return setOrigin(o.v0(), o.v1(), o.v2());
	}
	
	default Ray3fC setOrigin(@MinLength(3) float[] o)
	{
		return setOrigin(o[0], o[1], o[2]);
	}
	
	Ray3fC setOrigin(float x, float y, float z);
	
	Ray3fC originX(float x);
	Ray3fC originY(float y);
	Ray3fC originZ(float z);
	
	default Ray3fC setDirection(Tup3fR o)
	{
		return setDirection(o.v0(), o.v1(), o.v2());
	}
	
	default Ray3fC setDirection(@MinLength(3) float[] d)
	{
		return setDirection(d[0], d[1], d[2]);
	}
	
	Ray3fC setDirection(float x, float y, float z);
	
	Ray3fC directionX(float x);
	Ray3fC directionY(float y);
	Ray3fC directionZ(float z);
}
