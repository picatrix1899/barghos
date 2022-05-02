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

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.vector.QuatfC;
import org.barghos.math.api.vector.QuatfR;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.util.Maths;

/** A 3-Dimensional Quaternion */
public class Quatf implements QuatfC
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
	public Quatf()
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
	public Quatf(float x, float y, float z, float w)
	{
		set(x, y, z, w);
	}
	
	/**
	 * This contructor sets the components to the values of q.
	 * @param q A Quaternion that the components are set to.
	 */
	public Quatf(QuatfR q)
	{
		set(q);
	}
	
	/** {@inheritDoc}} */
	@Override
	public float getX() { return this.x; }
	
	/** {@inheritDoc}} */
	@Override
	public float getY() { return this.y; }
	
	/** {@inheritDoc}} */
	@Override
	public float getZ() { return this.z; }
	
	/** {@inheritDoc}} */
	@Override
	public float getW() { return this.w; }

	
	public QuatfC set(Mat4fR rot) 
	{
		
		//From Ken Shoemake's "Quaternion Calculus and Fast Animation" article
//		float[][] m = rot.toArray();
//		
//		double trace = m[0][0] + m[1][1] + m[2][2];
//
//		if(trace > 0)
//		{
//			float s = 0.5f / (float)Maths.sqrt(trace + 1.0);
//			this.w = 0.25f / s;
//			
//			this.x = (m[1][2] - m[2][1]) * s;
//			this.y = (m[2][0] - m[0][2]) * s;
//			this.z = (m[0][1] - m[1][0]) * s;
//		}
//		else
//		{
//			if(m[0][0] > m[1][1] && m[0][0] > m[2][2])
//			{
//				float s = 2.0f * (float)Maths.sqrt(1.0 + m[0][0] - m[1][1] - m[2][2]);
//				this.w = (m[1][2] - m[2][1]) / s;
//				this.x = 0.25f * s;
//				this.y = (m[1][0] + m[0][1]) / s;
//				this.z = (m[2][0] + m[0][2]) / s;
//			}
//			else if(m[1][1] > m[2][2])
//			{
//				float s = 2.0f * (float)Maths.sqrt(1.0 + m[1][1] - m[0][0] - m[2][2]);
//				this.w = (m[2][0] - m[0][2]) / s;
//				this.x = (m[1][0] + m[0][1]) / s;
//				this.y = 0.25f * s;
//				this.z = (m[2][1] + m[1][2]) / s;
//			}
//			else
//			{
//				float s = 2.0f * (float)Maths.sqrt(1.0 + m[2][2] - m[0][0] - m[1][1]);
//				this.w = (m[0][1] - m[1][0] ) / s;
//				this.x = (m[2][0] + m[0][2] ) / s;
//				this.y = (m[1][2] + m[2][1] ) / s;
//				this.z = 0.25f * s;
//			}
//		}

		
		
		normal(this);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public QuatfC setX(float x) { this.x = x; return this; }
	
	/** {@inheritDoc}} */
	@Override
	public QuatfC setY(float y) { this.y = y; return this; }
	
	/** {@inheritDoc}} */
	@Override
	public QuatfC setZ(float z) { this.z = z; return this; }

	/** {@inheritDoc}} */
	@Override
	public QuatfC setW(float w) { this.w = w; return this; }
	
	/** {@inheritDoc}} */
	@Override
	public <T extends QuatfC> T mul(QuatfR q, T res)
	{
		float w_ = this.w * q.getW() - this.x * q.getX() - this.y * q.getY() - this.z * q.getZ(); // w * w' - v * v'
		float x_ = this.w * q.getX() + q.getW() * this.x + this.y * q.getZ() - this.z * q.getY(); // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.w * q.getY() + q.getW() * this.y + this.z * q.getX() - this.x * q.getZ(); // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.w * q.getZ() + q.getW() * this.z + this.x * q.getY() - this.y * q.getX(); // s * v'.z + s' * v.z + (V x V').z

		res.set(x_, y_, z_, w_).normal();

		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends QuatfC> T mulVector(float x, float y, float z, T res)
	{
		float w_ = -this.x * x - this.y * y - this.z * z; // - v * v'
		float x_ =  this.w * x + this.y * z - this.z * y; // s * v'.x ...
		float y_ =  this.w * y + this.z * x - this.x * z; // s * v'.y ...
		float z_ =  this.w * z + this.x * y - this.y * x; // s * v*.z ...

		res.set(x_, y_, z_, w_).normal();

		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public <T extends Tup3fC> T transform(float x, float y, float z, @ExtractParam T res)
	{
		QuatfC r = mulVectorN(x, y, z);
		
		r.mul(conjugateN());
		
		res.set(r.getX(), r.getY(), r.getZ());

		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public float[] transform(float x, float y, float z, @ExtractParam float[] res)
	{
		QuatfC r = mulVectorN(x, y, z);
		
		r.mul(conjugateN());
		
		res[COMP_X] = r.getX();
		res[COMP_Y] = r.getY();
		res[COMP_Z] = r.getZ();

		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "quat3f("  + this.x + ", " + this.y + ", " + this.z + ", " + this.w + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Quatf clone()
	{
		return new Quatf(this);
	}

	/** {@inheritDoc}} */
	@Override
	public QuatfC setByAxisAngle(float ax, float ay, float az, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = (float)Math.sin(halfAngle);
		float cosHalfAngle = (float)Math.cos(halfAngle);
		
		float rX = ax * sinHalfAngle;
		float rY = ay * sinHalfAngle;
		float rZ = az * sinHalfAngle;
		float rW = cosHalfAngle;
		
		return set(rX, rY, rZ, rW);
	}
}
