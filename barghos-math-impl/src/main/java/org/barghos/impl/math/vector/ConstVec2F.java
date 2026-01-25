package org.barghos.impl.math.vector;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

import java.lang.foreign.MemoryLayout;
import java.util.Objects;

import org.barghos.api.math.vector.floats.IVec2RF;

public class ConstVec2F implements IVec2RF
{
	public static final long BYTES = 8;
	public static final long OFFSET_X = 0;
	public static final long OFFSET_Y = 4;
	public static final MemoryLayout MEM_LAYOUT = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_8 = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_16 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(2, JAVA_FLOAT), MemoryLayout.paddingLayout(8));
	
	public final float x;
	public final float y;
	
	public ConstVec2F()
	{
		this.x = 0.0f;
		this.y = 0.0f;
	}
	
	public ConstVec2F(ConstVec2F v)
	{
		this.x = v.x;
		this.y = v.y;
	}
	
	public ConstVec2F(Vec2F v)
	{
		this.x = v.x;
		this.y = v.y;
	}
	
	public ConstVec2F(IVec2RF v)
	{
		this.x = v.x();
		this.y = v.y();
	}
	
	public ConstVec2F(float[] v)
	{
		this.x = v[0];
		this.y = v[1];
	}
	
	public ConstVec2F(float x, float y)
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
		return "constvec2f(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.x, this.y);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
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
		
		return false;
	}
	
}
