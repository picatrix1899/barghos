package org.barghos.math.vector;

import static org.barghos.core.api.tuple.TupleConstants.COMP_X;
import static org.barghos.core.api.tuple.TupleConstants.COMP_Y;
import static org.barghos.core.api.tuple.TupleConstants.COMP_Z;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.util.function.GenericFunction2;
import org.barghos.math.BarghosMath;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.vector.Vec3fC;
import org.barghos.math.api.vector.Vec3fR;
import org.barghos.math.api.vector.Vec3fUtil;

/**
 * This class represents a 3-dimensional float vector.
 * 
 * @author picatrix1899
 */
public class Vec3f implements Vec3fC
{
	/**
	 * The x component.
	 */
	public float x;
	
	/**
	 * The y component.
	 */
	public float y;
	
	/**
	 * The z component.
	 */
	public float z;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Vec3f()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupfR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 */
	public Vec3f(TupfR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3fR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3fR} to adopt the values from.
	 */
	public Vec3f(Tup3fR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Vec3f(float value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Vec3f(float[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * @param z The initial z value of the tuple.
	 */
	public Vec3f(float x, float y, float z)
	{
		set(x, y, z);
	}
	
	/** {@inheritDoc} */
	@Override
	public float getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc} */
	@Override
	public float getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public float getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC setX(float x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC setY(float y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC setZ(float z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(getX());
		result = prime * result + Float.floatToIntBits(getY());
		result = prime * result + Float.floatToIntBits(getZ());
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Vec3fR)
		{
			Vec3fR other = (Vec3fR) obj;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof Tup3fR)
		{
			Tup3fR other = (Tup3fR) obj;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof TupfR)
		{
			TupfR other = (TupfR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getByIndex(0))) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getByIndex(1))) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getByIndex(2))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "vec3d(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3f clone()
	{
		return new Vec3f(this);
	}
	
	public Vec3fC add(float x, float y, float z)
	{
		return Vec3fUtil.add(getX(), getY(), getZ(), x, y, z, this);
	}
	
	public Vec3fC sub(float x, float y, float z)
	{
		return Vec3fUtil.sub(getX(), getY(), getZ(), x, y, z, this);
	}
	
	public Vec3fC revSub(float x, float y, float z)
	{
		return Vec3fUtil.revSub(getX(), getY(), getZ(), x, y, z, this);
	}
	
	public Vec3fC mul(float x, float y, float z)
	{
		return Vec3fUtil.mul(getX(), getY(), getZ(), x, y, z, this);
	}
	
	public Vec3fC div(float x, float y, float z)
	{
		return Vec3fUtil.div(getX(), getY(), getZ(), x, y, z, this);
	}
	
	public Vec3fC revDiv(float x, float y, float z)
	{
		return Vec3fUtil.revDiv(getX(), getY(), getZ(), x, y, z, this);
	}
	
	public Vec3fC normal()
	{
		return Vec3fUtil.normal(getX(), getY(), getZ(), this);
	}
	
	public Vec3fC normalSafe()
	{
		if(isZero()) return set(0.0f);
		
		return normal();
	}
	
	public Vec3fC normalSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return set(0.0f);
		
		return normal();
	}
	
	public Vec3fC invert()
	{
		return Vec3fUtil.invert(getX(), getY(), getZ(), this);
	}
	
	public Vec3fC inverse()
	{
		return inverse(1.0f);
	}
	
	public Vec3fC inverse(float x, float y, float z)
	{
		return Vec3fUtil.inverse(getX(), getY(), getZ(), x, y, z, this);
	}
	
	public float dot(float x, float y, float z)
	{
		return Vec3fUtil.dot(getX(), getY(), getZ(), x, y, z);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC cross(float x, float y, float z)
	{
		if(BarghosMath.DEFAULT_SYSTEM_3f_IS_RIGHTHANDED) return Vec3fUtil.cross(getX(), getY(),  getZ(), x, y, z, this);
		
		return Vec3fUtil.cross(x, y, z, getX(), getY(),  getZ(), this);
	}
	
	public Vec3fC abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()), Math.abs(getZ()));
	}
	
	public Vec3fC floor()
	{
		return set((float)Math.floor(getX()), (float)Math.floor(getY()), (float)Math.floor(getZ()));
	}
	
	public Vec3fC ceil()
	{
		return set((float)Math.ceil(getX()), (float)Math.ceil(getY()), (float)Math.ceil(getZ()));
	}
	
	public Vec3fC round()
	{
		return set(Math.round(getX()), Math.round(getY()), Math.round(getZ()));
	}
	
	public Vec3fC trunc()
	{
		return set((int)getX(), (int)getY(), (int)getZ());
	}
	
	public Vec3fC signum()
	{
		return set(Math.signum(getX()), Math.signum(getY()), Math.signum(getZ()));
	}
	
	public Vec3fC transform(Mat4fR m)
	{
		m.transform(this, false, this);
		
		return this;
	}
	
	public Vec3fC addN(float x, float y, float z)
	{
		return clone().add(x, y, z);
	}
	
	public Vec3fC subN(float x, float y, float z)
	{
		return clone().sub(x, y, z);
	}
	
	public Vec3fC revSubN(float x, float y, float z)
	{
		return clone().revSub(x, y, z);
	}
	
	public Vec3fC mulN(float x, float y, float z)
	{
		return clone().mul(x, y, z);
	}
	
	public Vec3fC divN(float x, float y, float z)
	{
		return clone().div(x, y, z);
	}
	
	public Vec3fC revDivN(float x, float y, float z)
	{
		return clone().revDiv(x, y, z);
	}
	
	public Vec3fC normalN()
	{
		return clone().normal();
	}
	
	public Vec3fC normalSafeN()
	{
		return clone().normalSafe();
	}
	
	public Vec3fC normalSafeWithMarginN(float tolerance)
	{
		return clone().normalSafeWithMargin(tolerance);
	}
	
	public Vec3fC invertN()
	{
		return clone().invert();
	}
	
	public Vec3fC inverseN()
	{
		return clone().inverse();
	}
	
	public Vec3fC inverseN(float x, float y, float z)
	{
		return clone().inverse(x, y, z);
	}
	
	public Vec3fC crossN(float x, float y, float z)
	{
		return clone().cross(x, y, z);
	}

	public Vec3fC absN()
	{
		return clone().abs();
	}
	
	public Vec3fC floorN()
	{
		return clone().floor();
	}

	public Vec3fC ceilN()
	{
		return clone().ceil();
	}
	
	public Vec3fC roundN()
	{
		return clone().round();
	}
	
	public Vec3fC truncN()
	{
		return clone().trunc();
	}
	
	public Vec3fC signumN()
	{
		return clone().signum();
	}
	
	public Vec3fC transformN(Mat4fR m)
	{
		return clone().transform(m);
	}
	
	public float reciprocalLength()
	{
		return 1.0f / length();
	}
	
	public float reciprocalLengthSafe()
	{
		if(isZero()) return 0.0f;
		
		return reciprocalLength();
	}
	
	public float reciprocalLengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return reciprocalLength();
	}
	
	public float length()
	{
		return (float)Math.sqrt(squaredLength());
	}
	
	public float lengthSafe()
	{
		if(isZero()) return 0.0f;
		
		return length();
	}
	
	public float lengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return length();
	}
	
	public float squaredLength()
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		return Math.fma(x, x, Math.fma(y, y, z * z));
	}
	
	public float squaredLengthSafe()
	{
		if(isZero()) return 0.0f;
		
		return squaredLength();
	}
	
	public float squaredLengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return squaredLength();
	}
	
	public Tup2oR<Float,Integer> min()
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z < value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return Tup2oR.of(value, index);
	}
	
	public <T extends Tup2oC<Float,Integer>> T minR(T res)
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z < value)
		{
			value = z;
			index = COMP_Y;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	public <T> T minR(GenericFunction2<Float,Integer,T> func)
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z < value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return func.apply(value, index);
	}
	
	public float minValue()
	{
		return Math.min(getX(), Math.min(getY(), getZ()));
	}
	
	public int minComponent()
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z < value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return index;
	}
	
	public Tup2oR<Float,Integer> max()
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z > value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return Tup2oR.of(value, index);
	}
	
	public <T extends Tup2oC<Float,Integer>> T maxR(T res)
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z > value)
		{
			value = z;
			index = COMP_Z;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	public <T> T maxR(GenericFunction2<Float,Integer,T> func)
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z > value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return func.apply(value, index);
	}
	
	public float maxValue()
	{
		return Math.max(getX(), Math.max(getY(), getZ()));
	}
	
	public int maxComponent()
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}

		if(z > value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return index;
	}
}
