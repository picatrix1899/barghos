///*
//MIT License
//
//Copyright (c) 2019 picatrix1899
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in all
//copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//SOFTWARE.
//*/
//
//package org.barghos.math.vector;
//
//import org.barghos.math.api.vector.QuatC;
//import org.barghos.math.api.vector.QuatR;
//
///**
// * A 3-Dimensional Quaternion
// */
//public class Quatd implements QuatC
//{
//	/**
//	 * The x component.
//	 */
//	protected double x;
//	
//	/**
//	 * The y component.
//	 */
//	protected double y;
//	
//	/**
//	 * The z component.
//	 */
//	protected double z;
//
//	/**
//	 * The w component.
//	 */
//	protected double w;
//	
//	/**
//	 * The default constructor. It sets x,y and z to 0 and w to 1.
//	 * It is commonly used in pools.
//	 */
//	public Quatd()
//	{
//		set(0.0, 0.0, 0.0, 1.0);
//	}
//	
//	/**
//	 * This constructor sets the components to x, y, z and w.
//	 * 
//	 * @param x The new x component.
//	 * @param y The new y component.
//	 * @param z The new z component.
//	 * @param w The new w component.
//	 */
//	public Quatd(double x, double y, double z, double w)
//	{
//		set(x, y, z, w);
//	}
//	
//	/**
//	 * This contructor sets the components to the values of q.
//	 * @param q A Quaternion that the components are set to.
//	 */
//	public Quatd(QuatR q)
//	{		
//		set(q);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double getZ()
//	{
//		return this.z;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double getW()
//	{
//		return this.w;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public QuatC setX(double x)
//	{
//		this.x = x;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public QuatC setY(double y)
//	{
//		this.y = y;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public QuatC setZ(double z)
//	{
//		this.z = z;
//		
//		return this;
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public QuatC setW(double w)
//	{
//		this.w = w;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "quat("  + this.x + ", " + this.y + ", " + this.z + ", " + this.w + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Quatd clone()
//	{
//		return new Quatd(this);
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public QuatC rotateN(double x, double y, double z, double angle)
//	{
//		return mulN(new Quatd().setFromAxisAngle(x, y, z, angle));
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public QuatC rotateGlobalN(double x, double y, double z, double angle)
//	{
//		return revMulN(new Quatd().setFromAxisAngle(x, y, z, angle));
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public <T extends QuatC> T rotateR(double x, double y, double z, double angle, T res)
//	{
//		return mulR(new Quatd().setFromAxisAngle(x, y, z, angle), res);
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public <T extends QuatC> T rotateGlobalR(double x, double y, double z, double angle, T res)
//	{
//		return revMulR(new Quatd().setFromAxisAngle(x, y, z, angle), res);
//	}
//}
