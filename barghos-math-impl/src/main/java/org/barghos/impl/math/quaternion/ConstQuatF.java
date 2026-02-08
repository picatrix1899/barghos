package org.barghos.impl.math.quaternion;

import java.util.Objects;

import org.barghos.api.math.quaternion.IQuatRF;

public class ConstQuatF implements IQuatRF
{
	public final float x;
	public final float y;
	public final float z;
	public final float w;
	
	public ConstQuatF(ConstQuatF q)
	{
		this.x = q.x;
		this.y = q.y;
		this.z = q.z;
		this.w = q.w;
	}
	
	public ConstQuatF(QuatF q)
	{
		this.x = q.x;
		this.y = q.y;
		this.z = q.z;
		this.w = q.w;
	}
	
	public ConstQuatF(IQuatRF q)
	{
		this.x = q.x();
		this.y = q.y();
		this.z = q.z();
		this.w = q.w();
	}
	
	public ConstQuatF(float[] q)
	{
		this.x = q[0];
		this.y = q[1];
		this.z = q[2];
		this.w = q[3];
	}
	
	public ConstQuatF(float x, float y, float z, float w)
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
		return "quatf(x=" + this.x + ", y=" + this.y + ", z=" + this.z + "; w=" + this.w + ")";
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
		
		if(obj instanceof ConstQuatF q)
		{
			if(this.x != q.x) return false;
			if(this.y != q.y) return false;
			if(this.z != q.z) return false;
			if(this.w != q.w) return false;
			
			return true;
		}
		
		if(obj instanceof QuatF q)
		{
			if(this.x != q.x) return false;
			if(this.y != q.y) return false;
			if(this.z != q.z) return false;
			if(this.w != q.w) return false;
			
			return true;
		}
			
		if(obj instanceof IQuatRF q)
		{
			if(this.x != q.x()) return false;
			if(this.y != q.y()) return false;
			if(this.z != q.z()) return false;
			if(this.w != q.w()) return false;
			
			return true;
		}
		
		if(obj instanceof float[] q)
		{
			if(this.x != q[0]) return false;
			if(this.y != q[1]) return false;
			if(this.z != q[2]) return false;
			if(this.w != q[3]) return false;
			
			return true;
		}
		
		return false;
	}
	
}
