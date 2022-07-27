/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core.tuple2;

import java.io.Serializable;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple2.Tup2objC;
import org.barghos.core.api.tuple2.Tup2objR;
import org.barghos.core.api.util.ExtendedCloneable;

/**
 * This class represents a 2-dimensional {@link Object} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2obj implements Tup2objC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 * This must not be null.
	 */
	public Object x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public Object y;
	
	/**
	 * Creates a new instance with all components set to null.
	 */
	public Tup2obj() { }
	
	/**
	 * Creates a new instance from an existing instance of {@link TupobjR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupobjR} to adopt the values from.
	 */
	public Tup2obj(TupobjR t)
	{
		Object[] v = t.toArray(new Object[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2objR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2objR} to adopt the values from.
	 */
	public Tup2obj(Tup2objR t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2obj(Object value)
	{
		this.x = value;
		this.y = value;
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2obj(Object[] v)
	{
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2obj(Object x, Object y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc} */
	@Override
	public Object getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc} */
	@Override
	public Object getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public Object getByIndex(int index)
	{
		switch(index)
		{
			case COMP_X: return this.x;
			case COMP_Y: return this.y;
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isValid()
	{
		return	this.x != null &&
				this.y != null;
	}
	
	/** {@inheritDoc} */
	@Override
	public Object[] toArray()
	{
		return new Object[] {this.x, this.y};
	}
	
	/** {@inheritDoc} */
	@Override
	public Object[] toArray(Object[] res)
	{
		res[COMP_X] = this.x;
		res[COMP_Y] = this.y;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setX(Object x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setY(Object y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2obj set(Tup2objR t)
	{
		this.x = t.getX();
		this.y = t.getY();
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj set(Object value)
	{
		this.x = value;
		this.y = value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj set(Object x, Object y)
	{
		this.x = x;
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj set(TupobjR t)
	{
		Object[] v = t.toArray(new Object[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setArray(Object... values)
	{
		this.x = values[COMP_X];
		this.y = values[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setByIndex(int index, Object value)
	{
		if(index < 0 || index >= 2) throw new IndexOutOfBoundsException(index);
		
		switch(index)
		{
			case COMP_X: this.x = value;
			case COMP_Y: this.y = value;
		}
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x.hashCode();
		result = prime * result + this.y.hashCode();
		return result;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2objR)
		{
			Tup2objR other = (Tup2objR) obj;
			if(!this.x.equals(other.getX())) return false;
			if(!this.y.equals(other.getY())) return false;
			
			return true;
		}
		
		if(obj instanceof TupobjR)
		{
			TupobjR other = (TupobjR) obj;
			if(2 != other.getDimensions()) return false;
			if(!this.x.equals(other.getByIndex(0))) return false;
			if(!this.y.equals(other.getByIndex(1))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "tup2obj(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj shallowClone()
	{
		return new Tup2obj(this.x, this.y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj deepClone()
	{
		Object x = this.x;
		if(x instanceof ExtendedCloneable) x =  ((ExtendedCloneable)x).deepClone();
		
		Object y = this.y;
		if(y instanceof ExtendedCloneable) y =  ((ExtendedCloneable)y).deepClone();
		
		return new Tup2obj(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj clone()
	{
		return new Tup2obj(this.x, this.y);
	}
}