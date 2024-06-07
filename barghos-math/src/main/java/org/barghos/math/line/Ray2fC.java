package org.barghos.math.line;

import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup2fR;

public interface Ray2fC extends Ray2fR
{
	Ray2fC createNew();
	
	default Ray2fC createNew(Ray2fR ray)
	{
		return createNew(ray.originX(), ray.originY(), ray.directionX(), ray.directionY());
	}
	
	default Ray2fC createNew(Tup2fR o, Tup2fR d)
	{
		return createNew(o.v0(), o.v1(), d.v0(), d.v1());
	}
	
	default Ray2fC createNew(Tup2fR o, @MinLength(2) float[] d)
	{
		return createNew(o.v0(), o.v1(), d[0], d[1]);
	}
	
	default Ray2fC createNew(Tup2fR o, float dX, float dY)
	{
		return createNew(o.v0(), o.v1(), dX, dY);
	}
	
	default Ray2fC createNew(@MinLength(2) float[] o, Tup2fR d)
	{
		return createNew(o[0], o[1], d.v0(), d.v1());
	}
	
	default Ray2fC createNew(@MinLength(2) float[] o, @MinLength(2) float[] d)
	{
		return createNew(o[0], o[1], d[0], d[1]);
	}
	
	default Ray2fC createNew(@MinLength(2) float[] o, float dX, float dY)
	{
		return createNew(o[0], o[1], dX, dY);
	}
	
	default Ray2fC createNew(float oX, float oY, Tup2fR d)
	{
		return createNew(oX, oY, d.v0(), d.v1());
	}
	
	default Ray2fC createNew(float oX, float oY, @MinLength(2) float[] d)
	{
		return createNew(oX, oY, d[0], d[1]);
	}
	
	Ray2fC createNew(float oX, float oY, float dX, float dY);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	Ray2fC copy();
	
	default Ray2fC set(Tup2fR o, Tup2fR d)
	{
		return set(o.v0(), o.v1(), d.v0(), d.v1());
	}
	
	default Ray2fC set(Tup2fR o, @MinLength(2) float[] d)
	{
		return set(o.v0(), o.v1(), d[0], d[1]);
	}
	
	default Ray2fC set(Tup2fR o, float dX, float dY)
	{
		return set(o.v0(), o.v1(), dX, dY);
	}
	
	default Ray2fC set(@MinLength(2) float[] o, Tup2fR d)
	{
		return set(o[0], o[1], d.v0(), d.v1());
	}
	
	default Ray2fC set(@MinLength(2) float[] o, @MinLength(2) float[] d)
	{
		return set(o[0], o[1], d[0], d[1]);
	}
	
	default Ray2fC set(@MinLength(2) float[] o, float dX, float dY)
	{
		return set(o[0], o[1], dX, dY);
	}
	
	default Ray2fC set(float oX, float oY, Tup2fR d)
	{
		return set(oX, oY, d.v0(), d.v1());
	}
	
	default Ray2fC set(float oX, float oY, @MinLength(2) float[] d)
	{
		return set(oX, oY, d[0], d[1]);
	}
	
	Ray2fC set(float oX, float oY, float dX, float dY);
	
	default Ray2fC setOrigin(Tup2fR o)
	{
		return setOrigin(o.v0(), o.v1());
	}
	
	default Ray2fC setOrigin(@MinLength(2) float[] o)
	{
		return setOrigin(o[0], o[1]);
	}
	
	Ray2fC setOrigin(float x, float y);
	
	Ray2fC originX(float x);
	Ray2fC originY(float y);
	
	default Ray2fC setDirection(Tup2fR o)
	{
		return setDirection(o.v0(), o.v1());
	}
	
	default Ray2fC setDirection(@MinLength(2) float[] d)
	{
		return setDirection(d[0], d[1]);
	}
	
	Ray2fC setDirection(float x, float y);
	
	Ray2fC directionX(float x);
	Ray2fC directionY(float y);
}
