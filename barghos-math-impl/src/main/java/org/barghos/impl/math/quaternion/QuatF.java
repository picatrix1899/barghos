package org.barghos.impl.math.quaternion;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.math.quaternion.IQuatRF;
import org.barghos.api.math.quaternion.IQuatWF;

public class QuatF implements IQuatWF
{
	private final float[] q = new float[4];
	
	public QuatF()
	{
		set(0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public QuatF(IQuatRF t)
	{
		set(t);
	}
	
	public QuatF(float[] t)
	{
		set(t);
	}
	
	public QuatF(float x, float y, float z, float w)
	{
		set(x, y, z, w);
	}
	
	/** {@inheritDoc} */
	@Override
	public float x()
	{
		return this.q[0];
	}

	/** {@inheritDoc} */
	@Override
	public float y()
	{
		return this.q[1];
	}

	/** {@inheritDoc} */
	@Override
	public float z()
	{
		return this.q[2];
	}

	/** {@inheritDoc} */
	@Override
	public float w()
	{
		return this.q[3];
	}
	
	/** {@inheritDoc} */
	@Override
	public float at(int index)
	{
		return this.q[index];
	}
	
	/** {@inheritDoc} */
	@Override
	public QuatF x(float x)
	{
		this.q[0] = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF y(float y)
	{
		this.q[1] = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF z(float z)
	{
		this.q[2] = z;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF w(float w)
	{
		this.q[3] = w;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF set(IQuatRF t)
	{
		t.toArray(this.q);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF set(float[] values)
	{
		System.arraycopy(values, 0, this.q, 0, 4);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF set(float x, float y, float z, float w)
	{
		this.q[0] = x;
		this.q[1] = y;
		this.q[2] = z;
		this.q[3] = w;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF at(int index, float value)
	{
		this.q[index] = value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.q, 4);
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.q, 0, res, 0, 4);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "quatf(x=" + this.q[0] + ", y=" + this.q[1] + ", z=" + this.q[2] + "; w=" + this.q[3] + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof IQuatRF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
}
