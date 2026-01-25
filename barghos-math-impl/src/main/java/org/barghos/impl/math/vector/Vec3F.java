package org.barghos.impl.math.vector;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

import java.lang.foreign.MemoryLayout;
import java.util.Objects;

import org.barghos.api.math.vector.floats.IVec3RF;
import org.barghos.api.math.vector.floats.IVec3WF;

public class Vec3F implements IVec3WF
{
	public static final long BYTES = 12;
	public static final long OFFSET_X = 0;
	public static final long OFFSET_Y = 4;
	public static final long OFFSET_Z = 8;
	public static final MemoryLayout MEM_LAYOUT = MemoryLayout.sequenceLayout(3, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_8 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(3, JAVA_FLOAT), MemoryLayout.paddingLayout(4));
	public static final MemoryLayout MEM_LAYOUT_16 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(3, JAVA_FLOAT), MemoryLayout.paddingLayout(4));
	
	public float x;
	public float y;
	public float z;
	
	public Vec3F() { }
	
	public Vec3F(ConstVec3F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	public Vec3F(Vec3F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	public Vec3F(IVec3RF v)
	{
		this.x = v.x();
		this.y = v.y();
		this.z = v.z();
	}
	
	public Vec3F(float[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
	}
	
	public Vec3F(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
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
	public float at(int index)
	{
		return switch(index) {
			case 0 -> this.x;
			case 1 -> this.y;
			case 2 -> this.z;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F x(float x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F y(float y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F z(float z)
	{
		this.z = z;
		
		return this;
	}
	
	public Vec3F set(ConstVec3F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		
		return this;
	}
	
	public Vec3F set(Vec3F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
		
		return this;
	}

	
	/** {@inheritDoc} */
	@Override
	public Vec3F set(IVec3RF v)
	{
		this.x = v.x();
		this.y = v.y();
		this.z = v.z();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F set(float[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F set(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F at(int index, float value)
	{
		switch(index) {
			case 0 -> this.x = value;
			case 1 -> this.y = value;
			case 2 -> this.z = value;
			default -> throw new IndexOutOfBoundsException();
		};
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return new float[] {this.x, this.y, this.z};
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		res[0] = this.x;
		res[1] = this.y;
		res[2] = this.z;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec3f(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.x, this.y, this.z);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof ConstVec3F v)
		{
			if(this.x != v.x) return false;
			if(this.y != v.y) return false;
			if(this.z != v.z) return false;
			
			return true;
		}
		
		if(obj instanceof Vec3F v)
		{
			if(this.x != v.x) return false;
			if(this.y != v.y) return false;
			if(this.z != v.z) return false;
			
			return true;
		}
			
		if(obj instanceof IVec3RF v)
		{
			if(this.x != v.x()) return false;
			if(this.y != v.y()) return false;
			if(this.z != v.z()) return false;
			
			return true;
		}
		
		if(obj instanceof float[] v)
		{
			if(this.x != v[0]) return false;
			if(this.y != v[1]) return false;
			if(this.z != v[2]) return false;
			
			return true;
		}
		
		return false;
	}
}
