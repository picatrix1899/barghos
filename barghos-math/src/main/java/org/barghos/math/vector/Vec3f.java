package org.barghos.math.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.BarghosMath;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.model.AxisAngle3fR;
import org.barghos.math.api.vector.QuatfR;
import org.barghos.math.api.vector.Vec3fC;
import org.barghos.math.api.vector.Vec3fR;
import org.barghos.math.api.vector.Vec3fUtil;
import org.barghos.math.util.Maths;

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
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC set(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC setByIndex(int index, float value)
	{
		switch(index)
		{
			case COMP_X: this.x = value;
			case COMP_Y: this.y = value;
			case COMP_Z: this.z = value;
		}
		
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
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC add(float x, float y, float z)
	{
		return Vec3fUtil.add(getX(), getY(), getZ(), x, y, z, this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC sub(float x, float y, float z)
	{
		return Vec3fUtil.sub(getX(), getY(), getZ(), x, y, z, this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC revSub(float x, float y, float z)
	{
		return Vec3fUtil.revSub(getX(), getY(), getZ(), x, y, z, this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC mul(float x, float y, float z)
	{
		return Vec3fUtil.mul(getX(), getY(), getZ(), x, y, z, this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC div(float x, float y, float z)
	{
		return Vec3fUtil.div(getX(), getY(), getZ(), x, y, z, this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC revDiv(float x, float y, float z)
	{
		return Vec3fUtil.revDiv(getX(), getY(), getZ(), x, y, z, this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC normalUnsafe()
	{
		return Vec3fUtil.normal(getX(), getY(), getZ(), this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC normal()
	{
		if(isZero()) return set(0.0f);
		
		return normal();
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC normal(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return set(0.0f);
		
		return normal();
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC negate()
	{
		return Vec3fUtil.invert(getX(), getY(), getZ(), this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec3fC inverse()
	{
		return revSub(1.0f);
	}
	
	/** {@inheritDoc}} */
	@Override
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
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC cross(float x, float y, float z, boolean rightHanded)
	{
		if(rightHanded) return Vec3fUtil.cross(getX(), getY(),  getZ(), x, y, z, this);
		
		return Vec3fUtil.cross(x, y, z, getX(), getY(),  getZ(), this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC crossRH(float x, float y, float z)
	{
		return Vec3fUtil.cross(getX(), getY(),  getZ(), x, y, z, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC crossLH(float x, float y, float z)
	{
		return Vec3fUtil.cross(x, y, z, getX(), getY(),  getZ(), this);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()), Math.abs(getZ()));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC floor()
	{
		return set((float)Math.floor(getX()), (float)Math.floor(getY()), (float)Math.floor(getZ()));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC ceil()
	{
		return set((float)Math.ceil(getX()), (float)Math.ceil(getY()), (float)Math.ceil(getZ()));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC round()
	{
		return set(Math.round(getX()), Math.round(getY()), Math.round(getZ()));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC trunc()
	{
		return set((int)getX(), (int)getY(), (int)getZ());
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC signum()
	{
		return set(Math.signum(getX()), Math.signum(getY()), Math.signum(getZ()));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC transform(Mat4fR m)
	{
		m.transform(this, false, this);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC min(float x, float y, float z)
	{
		this.x = Math.min(this.x, x);
		this.y = Math.min(this.y, y);
		this.z = Math.min(this.z, z);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC max(float x, float y, float z)
	{
		this.x = Math.max(this.x, x);
		this.y = Math.max(this.y, y);
		this.z = Math.max(this.z, z);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC lerp(float x, float y, float z, float alpha)
	{
		float invAlpha = 1.0f - alpha;
		this.x = Math.fma(invAlpha, this.x, alpha * x);
		this.y = Math.fma(invAlpha, this.y, alpha * y);
		this.z = Math.fma(invAlpha, this.z, alpha * z);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC lerpAdd(float x, float y, float z, float alpha)
	{
		this.x = Math.fma(alpha, x, this.x);
		this.y = Math.fma(alpha, y, this.y);
		this.z = Math.fma(alpha, z, this.z);
		
		return this;
	}

	public Vec3fC rotateX(float angle)
	{
		float cosAngle = (float)Math.cos(angle);
		float sinAngle = (float)Math.sin(angle);
		
		float y = this.y;
		float z = this.z;

		this.y = Math.fma(cosAngle, y, -sinAngle * z);
		this.z = Math.fma(sinAngle, y, cosAngle * z);
		
		return this;
	}

	public Vec3fC rotateXDeg(float angle)
	{
		float ang = angle * Maths.DEG_TO_RADf;
		float cosAngle = (float)Math.cos(ang);
		float sinAngle = (float)Math.sin(ang);
		
		float y = this.y;
		float z = this.z;

		this.y = Math.fma(cosAngle, y, -sinAngle * z);
		this.z = Math.fma(sinAngle, y, cosAngle * z);
		
		return this;
	}

	public Vec3fC rotateY(float angle)
	{
		float cosAngle = (float)Math.cos(angle);
		float sinAngle = (float)Math.sin(angle);
		
		float x = this.x;
		float z = this.z;

		this.x = Math.fma(cosAngle, x, sinAngle * z);
		this.z = Math.fma(-sinAngle, x, cosAngle * z);
		
		return this;
	}

	public Vec3fC rotateYDeg(float angle)
	{
		float ang = angle * Maths.DEG_TO_RADf;
		float cosAngle = (float)Math.cos(ang);
		float sinAngle = (float)Math.sin(ang);
		
		float x = this.x;
		float z = this.z;

		this.x = Math.fma(cosAngle, x, sinAngle * z);
		this.z = Math.fma(-sinAngle, x, cosAngle * z);
		
		return this;
	}

	public Vec3fC rotateZ(float angle)
	{
		float cosAngle = (float)Math.cos(angle);
		float sinAngle = (float)Math.sin(angle);
		
		float x = this.x;
		float y = this.y;

		this.x = Math.fma(cosAngle, x, -sinAngle * y);
		this.y = Math.fma(sinAngle, x, cosAngle * y);
		
		return this;
	}

	public Vec3fC rotateZDeg(float angle)
	{
		float ang = angle * Maths.DEG_TO_RADf;
		float cosAngle = (float)Math.cos(ang);
		float sinAngle = (float)Math.sin(ang);
		
		float x = this.x;
		float y = this.y;

		this.x = Math.fma(cosAngle, x, -sinAngle * y);
		this.y = Math.fma(sinAngle, x, cosAngle * y);
		
		return this;
	}

	public Vec3fC rotate(float axisX, float axisY, float axisZ, float angle)
	{
		// Rodrigues' rotation formula
		float cosAngle = (float)Math.cos(angle);
		float sinAngle = (float)Math.sin(angle);
		float invCosAngle = 1.0f - cosAngle;
		float dot = x * axisX + y * axisY + z * axisZ;
		
		float x = this.x;
		float y = this.y;
		float z = this.z;
		
		this.x = cosAngle * x + sinAngle * (axisY * z - axisZ * y) + invCosAngle * dot * axisX;
		this.y = cosAngle * y + sinAngle * (axisZ * x - axisX * z) + invCosAngle * dot * axisY;
		this.z = cosAngle * z + sinAngle * (axisX * y - axisY * x) + invCosAngle * dot * axisZ;
		
		return this;
	}

	public Vec3fC rotateDeg(float axisX, float axisY, float axisZ, float angle)
	{
		// Rodrigues' rotation formula
		float ang = angle * Maths.DEG_TO_RADf;
		float cosAngle = (float)Math.cos(ang);
		float sinAngle = (float)Math.sin(ang);
		float invCosAngle = 1.0f - cosAngle;
		float dot = x * axisX + y * axisY + z * axisZ;
		
		float x = this.x;
		float y = this.y;
		float z = this.z;
		
		this.x = cosAngle * x + sinAngle * (axisY * z - axisZ * y) + invCosAngle * dot * axisX;
		this.y = cosAngle * y + sinAngle * (axisZ * x - axisX * z) + invCosAngle * dot * axisY;
		this.z = cosAngle * z + sinAngle * (axisX * y - axisY * x) + invCosAngle * dot * axisZ;
		
		return this;
	}

	public Vec3fC rotate(AxisAngle3fR aa)
	{
		// Rodrigues' rotation formula
		
		float angle = aa.getAngle();
		float aX = aa.getAxisX();
		float aY = aa.getAxisY();
		float aZ = aa.getAxisZ();
		float cosAngle = (float)Math.cos(angle);
		float sinAngle = (float)Math.sin(angle);
		float invCosAngle = 1.0f - cosAngle;
		float dot = x * aX + y * aY + z * aZ;
		
		float x = this.x;
		float y = this.y;
		float z = this.z;
		
		this.x = cosAngle * x + sinAngle * (aY * z - aZ * y) + invCosAngle * dot * aX;
		this.y = cosAngle * y + sinAngle * (aZ * x - aX * z) + invCosAngle * dot * aY;
		this.z = cosAngle * z + sinAngle * (aX * y - aY * x) + invCosAngle * dot * aZ;
		
		return this;
	}

	public Vec3fC rotate(QuatfR q)
	{
		q.transform(this, this);
		
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
	
	public Vec3fC normalUnsafeN()
	{
		return clone().normalUnsafe();
	}
	
	public Vec3fC normalN()
	{
		return clone().normal();
	}
	
	public Vec3fC normalN(float tolerance)
	{
		return clone().normal(tolerance);
	}
	
	public Vec3fC negateN()
	{
		return clone().negate();
	}
	
	public Vec3fC inverseN()
	{
		return clone().inverse();
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
	
	public float inverseLengthUnsafe()
	{
		return 1.0f / lengthUnsafe();
	}
	
	public float inverseLength()
	{
		if(isZero()) return 0.0f;
		
		return inverseLengthUnsafe();
	}
	
	public float inverseLength(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return inverseLengthUnsafe();
	}
	
	public float lengthUnsafe()
	{
		return (float)Math.sqrt(squaredLength());
	}
	
	public float length()
	{
		if(isZero()) return 0.0f;
		
		return lengthUnsafe();
	}
	
	public float length(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return lengthUnsafe();
	}
	
	public float squaredLengthUnsafe()
	{
		float x = getX();
		float y = getY();
		float z = getZ();
		
		return Math.fma(x, x, Math.fma(y, y, z * z));
	}
	
	public float squaredLength()
	{
		if(isZero()) return 0.0f;
		
		return squaredLengthUnsafe();
	}
	
	public float squaredLength(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return squaredLengthUnsafe();
	}
	
	public Tup2oR<Float,Integer> getMin()
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
	
	public <T extends Tup2oC<Float,Integer>> T getMin(T res)
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
	
	public float getMinValue()
	{
		return Math.min(getX(), Math.min(getY(), getZ()));
	}
	
	public int getMinComponent()
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
	
	public Tup2oR<Float,Integer> getMax()
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
	
	public <T extends Tup2oC<Float,Integer>> T getMax(T res)
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
	
	public float getMaxValue()
	{
		return Math.max(getX(), Math.max(getY(), getZ()));
	}
	
	public int getMaxComponent()
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

	public Vec3fC crossN(float x, float y, float z, boolean rightHanded)
	{
		return clone().cross(x, y, z, rightHanded);
	}

	public Vec3fC crossRHN(float x, float y, float z)
	{
		return clone().crossRH(x, y, z);
	}

	public Vec3fC crossLHN(float x, float y, float z)
	{
		return clone().crossLH(x, y, z);
	}

	public Vec3fC minN(float x, float y, float z)
	{
		return clone().min(x, y, z);
	}

	public Vec3fC maxN(float x, float y, float z)
	{
		return clone().max(x, y, z);
	}

	public Vec3fC lerpN(float x, float y, float z, float alpha)
	{
		return clone().lerp(x, y, z, alpha);
	}

	public Vec3fC lerpAddN(float x, float y, float z, float alpha)
	{
		return clone().lerpAdd(x, y, z, alpha);
	}

	public Vec3fC rotateXN(float angle)
	{
		return clone().rotateX(angle);
	}

	public Vec3fC rotateXDegN(float angle)
	{
		return clone().rotateXDeg(angle);
	}

	public Vec3fC rotateYN(float angle)
	{
		return clone().rotateY(angle);
	}

	public Vec3fC rotateYDegN(float angle)
	{
		return clone().rotateYDeg(angle);
	}

	public Vec3fC rotateZN(float angle)
	{
		return clone().rotateZ(angle);
	}

	public Vec3fC rotateZDegN(float angle)
	{
		return clone().rotateZDeg(angle);
	}

	public Vec3fC rotateN(float axisX, float axisY, float axisZ, float angle)
	{
		return clone().rotate(axisX, axisY, axisZ, angle);
	}

	public Vec3fC rotateDegN(float axisX, float axisY, float axisZ, float angle)
	{
		return clone().rotateDeg(axisX, axisY, axisZ, angle);
	}

	public Vec3fC rotateN(AxisAngle3fR aa)
	{
		return clone().rotate(aa);
	}

	public Vec3fC rotateN(QuatfR q)
	{
		return clone().rotate(q);
	}
}
