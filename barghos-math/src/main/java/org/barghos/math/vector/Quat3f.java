/*
MIT License

Copyright (c) 2019 picatrix1899

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.math.vector;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.math.api.vector.Vec3fBase;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.util.Maths;

/** A 3-Dimensional Quaternion */
public class Quat3f implements Tup4fR
{
	/** The x component. */
	protected float x;
	
	/** The y component. */
	protected float y;
	
	/** The z component. */
	protected float z;

	/** The w component. */
	protected float w;
	
	/**
	 * The default constructor. It sets x,y and z to 0 and w to 1.
	 * It is commonly used in pools.
	 */
	public Quat3f()
	{
		set(0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	/**
	 * This constructor sets the components to x, y, z and w.
	 * 
	 * @param x The new x component.
	 * @param y The new y component.
	 * @param z The new z component.
	 * @param w The new w component.
	 */
	public Quat3f(float x, float y, float z, float w)
	{
		set(x, y, z, w);
	}
	
	/**
	 * This contructor sets the components to the values of q.
	 * @param q A Quaternion that the components are set to.
	 */
	public Quat3f(Quat3f q)
	{
		set(q);
	}

	public static Quat3f getFromAxis(Tup3fR axis, float angle) { return getFromAxis(axis.getX(), axis.getY(), axis.getZ(), angle, null); }
	
	public static Quat3f getFromAxis(float ax, float ay, float az, float angle) { return getFromAxis(ax, ay, az, angle, null); }
	
	public static Quat3f getFromAxis(Tup3fR axis, float angle, Quat3f res) { return getFromAxis(axis.getX(), axis.getY(), axis.getZ(), angle, res); }
	
	public static Quat3f getFromAxis(float ax, float ay, float az, float angle, Quat3f res)
	{
		if(res == null) res = new Quat3f();
		
		float halfAngle = angle * 0.5f; //* (float)Maths.DEG_TO_RAD;
		float sinHalfAngle = (float)Math.sin(halfAngle);
		float cosHalfAngle = (float)Math.cos(halfAngle);
		
		float rX = ax * sinHalfAngle;
		float rY = ay * sinHalfAngle;
		float rZ = az * sinHalfAngle;
		float rW = cosHalfAngle;
		
		return res.set(rX, rY, rZ, rW).normal();
	}
	
	public static Quat3f getFromVectors(Vec3f v1, Vec3f v2)
	{
		Vec3fBase a = v1.normalN();
		Vec3fBase b = v2.normalN();

		Vec3fBase axis = a.crossN(b).normal();
		
		float angle = 1.0f + a.dot(b);

		Quat3f out = new Quat3f(axis.getX(), axis.getY(), axis.getZ(), angle).normal();

		return out;
	}
	
	public float getX() { return this.x; }
	
	public float getY() { return this.y; }
	
	public float getZ() { return this.z; }
	
	public float getW() { return this.w; }
	
	public Quat3f rotate(Tup3fR axis, float angle)
	{
		return rotate(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	public Quat3f rotate(float ax, float ay, float az, float angle)
	{
		return getFromAxis(angle, ax, ay, az).mul(this, this);
	}
	
	public Quat3f rotate(Quat3f q)
	{
		return q.mul(this, this);
	}
	
	public Quat3f set(Quat3f q)
	{
		return set(q.getX(), q.getY(), q.getZ(), q.getW());
	}
	
	//From Ken Shoemake's "Quaternion Calculus and Fast Animation" article
	public Quat3f set(Mat4f rot) 
	{
		double trace = rot.m[0][0] + rot.m[1][1] + rot.m[2][2];

		if(trace > 0)
		{
			float s = 0.5f / (float)Maths.sqrt(trace + 1.0);
			this.w = 0.25f / s;
			
			
			this.x = (rot.m[1][2] - rot.m[2][1]) * s;
			this.y = (rot.m[2][0] - rot.m[0][2]) * s;
			this.z = (rot.m[0][1] - rot.m[1][0]) * s;
		}
		else
		{
			if(rot.m[0][0] > rot.m[1][1] && rot.m[0][0] > rot.m[2][2])
			{
				float s = 2.0f * (float)Maths.sqrt(1.0 + rot.m[0][0] - rot.m[1][1] - rot.m[2][2]);
				this.w = (rot.m[1][2] - rot.m[2][1]) / s;
				this.x = 0.25f * s;
				this.y = (rot.m[1][0] + rot.m[0][1]) / s;
				this.z = (rot.m[2][0] + rot.m[0][2]) / s;
			}
			else if(rot.m[1][1] > rot.m[2][2])
			{
				float s = 2.0f * (float)Maths.sqrt(1.0 + rot.m[1][1] - rot.m[0][0] - rot.m[2][2]);
				this.w = (rot.m[2][0] - rot.m[0][2]) / s;
				this.x = (rot.m[1][0] + rot.m[0][1]) / s;
				this.y = 0.25f * s;
				this.z = (rot.m[2][1] + rot.m[1][2]) / s;
			}
			else
			{
				float s = 2.0f * (float)Maths.sqrt(1.0 + rot.m[2][2] - rot.m[0][0] - rot.m[1][1]);
				this.w = (rot.m[0][1] - rot.m[1][0] ) / s;
				this.x = (rot.m[2][0] + rot.m[0][2] ) / s;
				this.y = (rot.m[1][2] + rot.m[2][1] ) / s;
				this.z = 0.25f * s;
			}
		}

		normal(this);
		
		return this;
	}
	
	public Quat3f set(float x, float y, float z, float w) { return setX(x).setY(y).setZ(z).setW(w); }
	
	public Quat3f setX(float x) { this.x = x; return this; }
	
	public Quat3f setY(float y) { this.y = y; return this; }
	
	public Quat3f setZ(float z) { this.z = z; return this; }

	public Quat3f setW(float w) { this.w = w; return this; }
	
	public Quat3f conjugate()
	{
		return conjugate(this);
	}
	
	public Quat3f conjugate(Quat3f res)
	{
		res.set(-this.x, -this.y, -this.z, this.w);

		return res;
	}
	
	public Quat3f inverse()
	{
		return inverse(this);
	}
	
	public Quat3f inverse(Quat3f res)
	{
		float l = reciprocalLength();
		
		res.set(-this.x * l, -this.y * l, -this.z * l, this.w * l);
		
		return res;
	}
	
	public Quat3f mul(Quat3f q)
	{
		mul(q, this);
		
		return this;
	}
	
	public Quat3f mul(Quat3f q, Quat3f res)
	{
		float w_ = this.w * q.getW() - this.x * q.getX() - this.y * q.getY() - this.z * q.getZ(); // w * w' - v * v'
		float x_ = this.w * q.getX() + q.getW() * this.x + this.y * q.getZ() - this.z * q.getY(); // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.w * q.getY() + q.getW() * this.y + this.z * q.getX() - this.x * q.getZ(); // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.w * q.getZ() + q.getW() * this.z + this.x * q.getY() - this.y * q.getX(); // s * v'.z + s' * v.z + (V x V').z

		res.set(x_, y_, z_, w_).normal();

		return res;
	}
	
	public Quat3f mul(Tup3fR v)
	{
		mul(v, this);
		
		return this;
	}
	
	public Quat3f mul(Tup3fR v, Quat3f res)
	{
		float w_ = -this.x * v.getX() - this.y * v.getY() - this.z * v.getZ(); // - v * v'
		float x_ =  this.w * v.getX() + this.y * v.getZ() - this.z * v.getY(); // s * v'.x ...
		float y_ =  this.w * v.getY() + this.z * v.getX() - this.x * v.getZ(); // s * v'.y ...
		float z_ =  this.w * v.getZ() + this.x * v.getY() - this.y * v.getX(); // s * v*.z ...

		res.set(x_, y_, z_, w_).normal();

		return res;
	}
	
	public Vec3f transform(Tup3fR v, Vec3f res)
	{
		Quat3f r = mul(v, new Quat3f());
		Quat3f c = conjugate(new Quat3f());
		
		r.mul(c, r);
		
		res.set(r.getX(), r.getY(), r.getZ());

		return res;
	}
	
	public float length() { return (float)Maths.sqrt(squaredLength()); }
	public float squaredLength() { return this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w; }
	public float reciprocalLength() { return 1.0f / length(); }
	
	public Quat3f normal()
	{
		return normal(this);
	}
	
	public Quat3f normal(Quat3f res)
	{
		float l = reciprocalLength();
		
		res.set(this.x * l, this.y * l, this.z * l, this.w * l);

		return res;
	}

	public float dot(Quat3f q)
	{
		return this.x * q.x + this.y * q.y + this.z * q.z + this.w * q.w;
	}

	public String toString()
	{
		return "quat3f("  + this.x + ", " + this.y + ", " + this.z + ", " + this.w + ")";
	}
	
	public Quat3f clone()
	{
		return new Quat3f(this);
	}
}
