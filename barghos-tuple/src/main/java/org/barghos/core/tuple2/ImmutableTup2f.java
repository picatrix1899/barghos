///*******************************************************************************
// * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
// * 
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// * 
// * The above copyright notice and this permission notice shall be included in
// * all copies or substantial portions of the Software.
// * 
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// * SOFTWARE.
// ******************************************************************************/
//
//package org.barghos.core.tuple2;
//
//import static org.barghos.tuple.api.tn.TupleConstants.*;
//
//import java.nio.FloatBuffer;
//
//import org.barghos.tuple.api.t2.Tup2fR;
//import org.barghos.tuple.api.tn.TupfR;
//
///**
// * Represents an immutable readonly 2-dimensional float tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup2f implements Tup2fR
//{
//	/**
//	 * The x component.
//	 */
//	public final float x;
//	
//	/**
//	 * The y component.
//	 */
//	public final float y;
//	
//	/**
//	 * The immutable hashCode.
//	 */
//	protected transient int hashCode;
//	
//	/**
//	 * The flag that shows that the hashCode has already been calculate.
//	 */
//	protected transient boolean isHashCodeCalculate;
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2f} from an existing instance of {@link TupfR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
//	 */
//	public ImmutableTup2f(TupfR t)
//	{
//		float[] v = t.toArray(new float[2]);
//		
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2f} from an existing instance of {@link Tup2fR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup2fR} to adopt the values from.
//	 */
//	public ImmutableTup2f(Tup2fR t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2f} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup2f(float value)
//	{
//		this.x = value;
//		this.y = value;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2f} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The x and y values as an array.
//	 */
//	public ImmutableTup2f(float[] v)
//	{
//		this.x = v[0];
//		this.y = v[1];
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2f} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 */
//	public ImmutableTup2f(float x, float y)
//	{
//		this.x = x;
//		this.y = y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public float getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public float getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public float getByIndex(int index)
//	{
//		switch(index)
//		{
//			case COMP_X: return this.x;
//			case COMP_Y: return this.y;
//		}
//		
//		throw new IndexOutOfBoundsException(index);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean isExactlyZero()
//	{
//		return	this.x == 0 &&
//				this.y == 0;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean isZero(float tolerance)
//	{
//		return	Math.abs(this.x) <= tolerance &&
//				Math.abs(this.y) <= tolerance;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean isFinite()
//	{
//		return	Float.isFinite(this.x) &&
//				Float.isFinite(this.y);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public float[] toArray()
//	{
//		return new float[] {this.x, this.y};
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public float[] toArray(float[] res)
//	{
//		res[COMP_X] = this.x;
//		res[COMP_Y] = this.y;
//		
//		return res;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public FloatBuffer toBuffer(FloatBuffer buffer)
//	{
//		buffer.put(this.x);
//		buffer.put(this.y);
//		
//		return buffer;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int hashCode()
//	{
//		if(!this.isHashCodeCalculate) calculateHashCode();
//		
//		return this.hashCode;
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(this == obj) return true;
//		if(obj == null) return false;
//		if(obj instanceof Tup2fR)
//		{
//			Tup2fR other = (Tup2fR) obj;
//			if(Float.floatToIntBits(this.x) != Float.floatToIntBits(other.getX())) return false;
//			if(Float.floatToIntBits(this.y) != Float.floatToIntBits(other.getY())) return false;
//			
//			return true;
//		}
//
//		if(obj instanceof TupfR)
//		{
//			TupfR other = (TupfR) obj;
//			if(2 != other.getDimensions()) return false;
//			if(Float.floatToIntBits(this.x) != Float.floatToIntBits(other.getByIndex(0))) return false;
//			if(Float.floatToIntBits(this.y) != Float.floatToIntBits(other.getByIndex(1))) return false;
//			
//			return true;
//		}
//		
//		return false;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "immutableTup2f(x=" + this.x + ", y=" + this.y + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup2f clone()
//	{
//		return new ImmutableTup2f(this.x, this.y);
//	}
//	
//	/**
//	 * This method calculates the hashCode and stores it in the member for later use.
//	 */
//	protected void calculateHashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + Float.floatToIntBits(this.x);
//		result = prime * result + Float.floatToIntBits(this.y);
//		
//		this.hashCode = result;
//		this.isHashCodeCalculate = true;
//	}
//}