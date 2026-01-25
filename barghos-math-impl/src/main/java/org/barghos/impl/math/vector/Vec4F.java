package org.barghos.impl.math.vector;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

import java.lang.foreign.MemoryLayout;
import java.util.Objects;

import org.barghos.api.math.vector.floats.IVec4RF;
import org.barghos.api.math.vector.floats.IVec4WF;

public class Vec4F implements IVec4WF
{
	public static final long BYTES = 16;
	public static final long OFFSET_X = 0;
	public static final long OFFSET_Y = 4;
	public static final long OFFSET_Z = 8;
	public static final long OFFSET_W = 12;
	public static final MemoryLayout MEM_LAYOUT = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_8 = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_16 = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
	
	public float x;
	public float y;
	public float z;
	public float w;
	
	public Vec4F() { }
	
	public Vec4F(ConstVec4F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = v.w;
	}
	
	public Vec4F(Vec4F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = v.w;
	}
	
	public Vec4F(IVec4RF v)
	{
		this.x = v.x();
		this.y = v.y();
		this.z = v.z();
		this.w = v.w();
	}
	
	public Vec4F(float[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
		this.w = v[3];
	}
	
	public Vec4F(float x, float y, float z, float w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
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
	public float z()
	{
		return this.z;
	}
	
	/** {@inheritDoc} */
	@Override
	public float w()
	{
		return this.w;
	}
	
	/** {@inheritDoc} */
	@Override
	public float at(int index)
	{
		return switch(index) {
			case 0 -> this.x;
			case 1 -> this.y;
			case 2 -> this.z;
			case 3 -> this.w;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec4F x(float x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec4F y(float y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec4F z(float z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec4F w(float w)
	{
		this.w = w;
		
		return this;
	}
	
	public Vec4F set(ConstVec4F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = v.w;
		
		return this;
	}
	
	public Vec4F set(Vec4F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		this.w = v.w;
		
		return this;
	}

	
	/** {@inheritDoc} */
	@Override
	public Vec4F set(IVec4RF v)
	{
		this.x = v.x();
		this.y = v.y();
		this.z = v.z();
		this.w = v.w();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec4F set(float[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
		this.w = v[3];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec4F set(float x, float y, float z, float w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec4F at(int index, float value)
	{
		switch(index) {
			case 0 -> this.x = value;
			case 1 -> this.y = value;
			case 2 -> this.z = value;
			case 3 -> this.w = value;
			default -> throw new IndexOutOfBoundsException();
		};
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return new float[] {this.x, this.y, this.z, this.w};
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		res[0] = this.x;
		res[1] = this.y;
		res[2] = this.z;
		res[3] = this.w;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec4f(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.x, this.y, this.z, this.w);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof ConstVec4F v)
		{
			if(this.x != v.x) return false;
			if(this.y != v.y) return false;
			if(this.z != v.z) return false;
			if(this.w != v.w) return false;
			
			return true;
		}
		
		if(obj instanceof Vec4F v)
		{
			if(this.x != v.x) return false;
			if(this.y != v.y) return false;
			if(this.z != v.z) return false;
			if(this.w != v.w) return false;
			
			return true;
		}
			
		if(obj instanceof IVec4RF v)
		{
			if(this.x != v.x()) return false;
			if(this.y != v.y()) return false;
			if(this.z != v.z()) return false;
			if(this.w != v.w()) return false;
			
			return true;
		}
		
		if(obj instanceof float[] v)
		{
			if(this.x != v[0]) return false;
			if(this.y != v[1]) return false;
			if(this.z != v[2]) return false;
			if(this.w != v[3]) return false;
			
			return true;
		}
		
		return false;
	}
}
