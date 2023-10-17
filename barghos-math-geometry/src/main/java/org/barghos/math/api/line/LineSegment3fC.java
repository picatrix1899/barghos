package org.barghos.math.api.line;

import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup3fR;

public interface LineSegment3fC
{
	LineSegment3fC createNew();
	
	default LineSegment3fC createNew(LineSegment3fR line)
	{
		return createNew(line.p0x(), line.p0y(), line.p0z(), line.p1x(), line.p1y(), line.p1z());
	}
	
	default LineSegment3fC createNew(Tup3fR p0, Tup3fR p1)
	{
		return createNew(p0.v0(), p0.v1(), p0.v2(), p1.v0(), p1.v1(), p1.v2());
	}
	
	default LineSegment3fC createNew(Tup3fR p0, @MinLength(3) float[] p1)
	{
		return createNew(p0.v0(), p0.v1(), p0.v2(), p1[0], p1[1], p1[2]);
	}
	
	default LineSegment3fC createNew(Tup3fR p0, float p1x, float p1y, float p1z)
	{
		return createNew(p0.v0(), p0.v1(), p0.v2(), p1x, p1y, p1z);
	}
	
	default LineSegment3fC createNew(@MinLength(3) float[] p0, Tup3fR p1)
	{
		return createNew(p0[0], p0[1], p0[2], p1.v0(), p1.v1(), p1.v2());
	}
	
	default LineSegment3fC createNew(@MinLength(3) float[] p0, @MinLength(3) float[] p1)
	{
		return createNew(p0[0], p0[1], p0[2], p1[0], p1[1], p1[2]);
	}
	
	default LineSegment3fC createNew(@MinLength(3) float[] p0, float p1x, float p1y, float p1z)
	{
		return createNew(p0[0], p0[1], p0[2], p1x, p1y, p1z);
	}
	
	default LineSegment3fC createNew(float p0x, float p0y, float p0z, Tup3fR p1)
	{
		return createNew(p0x, p0y, p0z, p1.v0(), p1.v1(), p1.v2());
	}
	
	default LineSegment3fC createNew(float p0x, float p0y, float p0z, @MinLength(3) float[] p1)
	{
		return createNew(p0x, p0y, p0z, p1[0], p1[1], p1[2]);
	}
	
	LineSegment3fC createNew(float p0x, float p0y, float p0z, float p1x, float p1y, float p1z);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	LineSegment3fC copy();
	
	default LineSegment3fC setP0(Tup3fR p0)
	{
		return setP0(p0.v0(), p0.v1(), p0.v2());
	}
	
	default LineSegment3fC setP0(@MinLength(3) float[] p0)
	{
		return setP0(p0[0], p0[1], p0[2]);
	}
	
	default LineSegment3fC setP0(float x, float y, float z)
	{
		p0x(x);
		p0y(y);
		p0z(z);
		
		return this;
	}
	
	LineSegment3fC p0x(float x);
	LineSegment3fC p0y(float y);
	LineSegment3fC p0z(float z);
	
	default LineSegment3fC setP1(Tup3fR p1)
	{
		return setP1(p1.v0(), p1.v1(), p1.v2());
	}
	
	default LineSegment3fC setP1(@MinLength(3) float[] p1)
	{
		return setP1(p1[0], p1[1], p1[2]);
	}
	
	default LineSegment3fC setP1(float x, float y, float z)
	{
		p1x(x);
		p1y(y);
		p1z(z);
		
		return this;
	}
	
	LineSegment3fC p1x(float x);
	LineSegment3fC p1y(float y);
	LineSegment3fC p1z(float z);
	
	default LineSegment3fC set(LineSegment3fR line)
	{
		return set(line.p0x(), line.p0y(), line.p0z(), line.p1x(), line.p1y(), line.p1z());
	}
	
	default LineSegment3fC set(Tup3fR p0, Tup3fR p1)
	{
		return set(p0.v0(), p0.v1(), p0.v2(), p1.v0(), p1.v1(), p1.v2());
	}
	
	default LineSegment3fC set(Tup3fR p0, @MinLength(3) float[] p1)
	{
		return set(p0.v0(), p0.v1(), p0.v2(), p1[0], p1[1], p1[2]);
	}
	
	default LineSegment3fC set(Tup3fR p0, float p1x, float p1y, float p1z)
	{
		return set(p0.v0(), p0.v1(), p0.v2(), p1x, p1y, p1z);
	}
	
	default LineSegment3fC set(@MinLength(3) float[] p0, Tup3fR p1)
	{
		return set(p0[0], p0[1], p0[2], p1.v0(), p1.v1(), p1.v2());
	}
	
	default LineSegment3fC set(@MinLength(3) float[] p0, @MinLength(3) float[] p1)
	{
		return set(p0[0], p0[1], p0[2], p1[0], p1[1], p1[2]);
	}
	
	default LineSegment3fC set(@MinLength(3) float[] p0, float p1x, float p1y, float p1z)
	{
		return set(p0[0], p0[1], p0[2], p1x, p1y, p1z);
	}
	
	default LineSegment3fC set(float p0x, float p0y, float p0z, Tup3fR p1)
	{
		return set(p0x, p0y, p0z, p1.v0(), p1.v1(), p1.v2());
	}
	
	default LineSegment3fC set(float p0x, float p0y, float p0z, @MinLength(3) float[] p1)
	{
		return set(p0x, p0y, p0z, p1[0], p1[1], p1[2]);
	}
	
	default LineSegment3fC set(float p0x, float p0y, float p0z, float p1x, float p1y, float p1z)
	{
		setP0(p0x, p0y, p0z);
		setP1(p1x, p1y, p1z);
		
		return this;
	}
}
