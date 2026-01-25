package org.barghos.impl.math.vector;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

import java.lang.foreign.MemoryLayout;
import java.util.Objects;

import org.barghos.api.math.vector.floats.IVec3RF;

public class ConstVec3F implements IVec3RF
{
	public static final long BYTES = 12;
	public static final long OFFSET_X = 0;
	public static final long OFFSET_Y = 4;
	public static final long OFFSET_Z = 8;
	public static final MemoryLayout MEM_LAYOUT = MemoryLayout.sequenceLayout(3, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_8 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(3, JAVA_FLOAT), MemoryLayout.paddingLayout(4));
	public static final MemoryLayout MEM_LAYOUT_16 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(3, JAVA_FLOAT), MemoryLayout.paddingLayout(4));
	
	public final float x;
	public final float y;
	public final float z;
	
	public ConstVec3F()
	{
		this.x = 0.0f;
		this.y = 0.0f;
		this.z = 0.0f;
	}
	
	public ConstVec3F(ConstVec3F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	public ConstVec3F(Vec3F v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	public ConstVec3F(IVec3RF v)
	{
		this.x = v.x();
		this.y = v.y();
		this.z = v.z();
	}
	
	public ConstVec3F(float[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
	}
	
	public ConstVec3F(float x, float y, float z)
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
		return "constvec3f(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
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
		
		return false;
	}
	
}
