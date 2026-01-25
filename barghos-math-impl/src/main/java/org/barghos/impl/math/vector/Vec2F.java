package org.barghos.impl.math.vector;

import java.lang.foreign.MemoryLayout;

import static java.lang.foreign.ValueLayout.*;

import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.math.vector.floats.IVec2RF;
import org.barghos.api.math.vector.floats.IVec2WF;

public class Vec2F implements IVec2WF
{
	public static final long BYTES = 8;
	public static final long OFFSET_X = 0;
	public static final long OFFSET_Y = 4;
	public static final MemoryLayout MEM_LAYOUT = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_8 = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_16 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(2, JAVA_FLOAT), MemoryLayout.paddingLayout(8));
	
	public float x;
	public float y;
	
	public Vec2F() { }
	
	public Vec2F(ConstVec2F v)
	{
		this.x = v.x;
		this.y = v.y;
	}
	
	public Vec2F(Vec2F v)
	{
		this.x = v.x;
		this.y = v.y;
	}
	
	public Vec2F(IVec2RF v)
	{
		this.x = v.x();
		this.y = v.y();
	}
	
	public Vec2F(float[] v)
	{
		this.x = v[0];
		this.y = v[1];
	}
	
	public Vec2F(float value)
	{
		this.x = value;
		this.y = value;
	}
	
	public Vec2F(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	/** {@inheritDoc} */
	@Override
	public float x()
	{
		return this.x;
	}

	/** {@inheritDoc} */
	@Override
	public float y()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public float at(int index)
	{
		return switch(index) {
			case 0 -> this.x;
			case 1 -> this.y;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F x(float x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F y(float y)
	{
		this.y = y;
		
		return this;
	}

	public Vec2F set(ConstVec2F v)
	{
		this.x = v.x;
		this.y = v.y;
		
		return this;
	}
	
	public Vec2F set(Vec2F v)
	{
		this.x = v.x;
		this.y = v.y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F set(IVec2RF v)
	{
		this.x = v.x();
		this.y = v.y();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F set(float[] values)
	{
		this.x = values[0];
		this.y = values[1];
		
		return this;
	}

	public Vec2F set(float value)
	{
		this.x = value;
		this.y = value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F set(float x, float y)
	{
		this.x = x;
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F at(int index, float value)
	{
		switch(index) {
			case 0 -> this.x = value;
			case 1 -> this.y = value;
			default -> throw new IndexOutOfBoundsException();
		}
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return new float[] {this.x, this.y};
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		res[0] = this.x;
		res[1] = this.y;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec2f(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.x, this.y);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof ConstVec2F v)
		{
			if(this.x != v.x) return false;
			if(this.y != v.y) return false;
			
			return true;
		}
		
		if(obj instanceof Vec2F v)
		{
			if(this.x != v.x) return false;
			if(this.y != v.y) return false;
			
			return true;
		}
		
		if(obj instanceof IVec2RF v)
		{
			if(this.x != v.x()) return false;
			if(this.y != v.y()) return false;
			
			return true;
		}
		
		if(obj instanceof float[] v)
		{
			if(this.x != v[0]) return false;
			if(this.y != v[1]) return false;
			
			return true;
		}
		
		if(obj instanceof float[] v)
		{
			if(this.x != v[0]) return false;
			if(this.y != v[1]) return false;
			
			return true;
		}
		
		return false;
	}
}
