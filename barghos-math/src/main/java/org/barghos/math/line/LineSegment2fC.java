package org.barghos.math.line;

import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup2fR;

public interface LineSegment2fC
{
	LineSegment2fC createNew();
	
	default LineSegment2fC createNew(LineSegment2fR line)
	{
		return createNew(line.p0x(), line.p0y(), line.p1x(), line.p1y());
	}
	
	default LineSegment2fC createNew(Tup2fR p0, Tup2fR p1)
	{
		return createNew(p0.v0(), p0.v1(), p1.v0(), p1.v1());
	}
	
	default LineSegment2fC createNew(Tup2fR p0, @MinLength(2) float[] p1)
	{
		return createNew(p0.v0(), p0.v1(), p1[0], p1[1]);
	}
	
	default LineSegment2fC createNew(Tup2fR p0, float p1x, float p1y)
	{
		return createNew(p0.v0(), p0.v1(), p1x, p1y);
	}
	
	default LineSegment2fC createNew(@MinLength(2) float[] p0, Tup2fR p1)
	{
		return createNew(p0[0], p0[1], p1.v0(), p1.v1());
	}
	
	default LineSegment2fC createNew(@MinLength(2) float[] p0, @MinLength(2) float[] p1)
	{
		return createNew(p0[0], p0[1], p1[0], p1[1]);
	}
	
	default LineSegment2fC createNew(@MinLength(2) float[] p0, float p1x, float p1y)
	{
		return createNew(p0[0], p0[1], p1x, p1y);
	}
	
	default LineSegment2fC createNew(float p0x, float p0y, Tup2fR p1)
	{
		return createNew(p0x, p0y, p1.v0(), p1.v1());
	}
	
	default LineSegment2fC createNew(float p0x, float p0y, @MinLength(2) float[] p1)
	{
		return createNew(p0x, p0y, p1[0], p1[1]);
	}
	
	LineSegment2fC createNew(float p0x, float p0y, float p1x, float p1y);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	LineSegment2fC copy();
	
	default LineSegment2fC setP0(Tup2fR p0)
	{
		return setP0(p0.v0(), p0.v1());
	}
	
	default LineSegment2fC setP0(@MinLength(2) float[] p0)
	{
		return setP0(p0[0], p0[1]);
	}
	
	default LineSegment2fC setP0(float x, float y)
	{
		p0x(x);
		p0y(y);
		
		return this;
	}
	
	LineSegment2fC p0x(float x);
	LineSegment2fC p0y(float y);
	
	default LineSegment2fC setP1(Tup2fR p1)
	{
		return setP1(p1.v0(), p1.v1());
	}
	
	default LineSegment2fC setP1(@MinLength(2) float[] p1)
	{
		return setP1(p1[0], p1[1]);
	}
	
	default LineSegment2fC setP1(float x, float y)
	{
		p1x(x);
		p1y(y);
		
		return this;
	}
	
	LineSegment2fC p1x(float x);
	LineSegment2fC p1y(float y);
	
	default LineSegment2fC set(LineSegment2fR line)
	{
		return set(line.p0x(), line.p0y(), line.p1x(), line.p1y());
	}
	
	default LineSegment2fC set(Tup2fR p0, Tup2fR p1)
	{
		return set(p0.v0(), p0.v1(), p1.v0(), p1.v1());
	}
	
	default LineSegment2fC set(Tup2fR p0, @MinLength(2) float[] p1)
	{
		return set(p0.v0(), p0.v1(), p1[0], p1[1]);
	}
	
	default LineSegment2fC set(Tup2fR p0, float p1x, float p1y)
	{
		return set(p0.v0(), p0.v1(), p1x, p1y);
	}
	
	default LineSegment2fC set(@MinLength(2) float[] p0, Tup2fR p1)
	{
		return set(p0[0], p0[1], p1.v0(), p1.v1());
	}
	
	default LineSegment2fC set(@MinLength(2) float[] p0, @MinLength(2) float[] p1)
	{
		return set(p0[0], p0[1], p1[0], p1[1]);
	}
	
	default LineSegment2fC set(@MinLength(2) float[] p0, float p1x, float p1y)
	{
		return set(p0[0], p0[1], p1x, p1y);
	}
	
	default LineSegment2fC set(float p0x, float p0y, Tup2fR p1)
	{
		return set(p0x, p0y, p1.v0(), p1.v1());
	}
	
	default LineSegment2fC set(float p0x, float p0y, @MinLength(2) float[] p1)
	{
		return set(p0x, p0y, p1[0], p1[1]);
	}
	
	default LineSegment2fC set(float p0x, float p0y, float p1x, float p1y)
	{
		setP0(p0x, p0y);
		setP1(p1x, p1y);
		
		return this;
	}
}
