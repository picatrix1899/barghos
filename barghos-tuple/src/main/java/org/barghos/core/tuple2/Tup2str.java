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
//import java.io.Serializable;
//
//import org.barghos.tuple.api.t2.Tup2strC;
//import org.barghos.tuple.api.t2.Tup2strR;
//import org.barghos.tuple.api.tn.TupstrR;
//
///**
// * This class represents a 2-dimensional string tuple.
// * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
// * where the data of a vector describes the same logical structure.
// * 
// * @author picatrix1899
// */
//public class Tup2str implements Tup2strC, Serializable
//{
//	/**
//	 * The class version for serialization.
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	/**
//	 * The x component.
//	 * This must not be null.
//	 */
//	public String x;
//	
//	/**
//	 * The y component.
//	 * This must not be null.
//	 */
//	public String y;
//	
//	/**
//	 * Creates a new instance with all components set to "".
//	 */
//	public Tup2str()
//	{
//		this.x = "";
//		this.y = "";
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link TupstrR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupstrR} to adopt the values from.
//	 */
//	public Tup2str(TupstrR t)
//	{
//		String[] v = t.toArray(new String[2]);
//		
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link Tup2strR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup2strR} to adopt the values from.
//	 */
//	public Tup2str(Tup2strR t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//	}
//	
//	/**
//	 * Creates a new instance with all values set to a single value.
//	 * 
//	 * @param value The value used as the initial value for all values of the tuple.
//	 */
//	public Tup2str(String value)
//	{
//		this.x = value;
//		this.y = value;
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param v The x and y values as an array.
//	 */
//	public Tup2str(String[] v)
//	{
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param x The initial x value of the tuple.
//	 * @param y The initial y value of the tuple.
//	 */
//	public Tup2str(String x, String y)
//	{
//		this.x = x;
//		this.y = y;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public String getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public String getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public String getByIndex(int index)
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
//	/** {@inheritDoc} */
//	@Override
//	public boolean isValid()
//	{
//		return	this.x != null &&
//				this.y != null;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public String[] toArray()
//	{
//		return new String[] {this.x, this.y};
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public String[] toArray(String[] res)
//	{
//		res[COMP_X] = this.x;
//		res[COMP_Y] = this.y;
//		
//		return res;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str setX(String x)
//	{
//		this.x = x;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str setY(String y)
//	{
//		this.y = y;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str set(Tup2strR t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str set(String value)
//	{
//		this.x = value;
//		this.y = value;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str set(String x, String y)
//	{
//		this.x = x;
//		this.y = y;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str set(TupstrR t)
//	{
//		String[] v = t.toArray(new String[2]);
//		
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str setArray(String... values)
//	{
//		this.x = values[COMP_X];
//		this.y = values[COMP_Y];
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str setByIndex(int index, String value)
//	{
//		if(index < 0 || index >= 2) throw new IndexOutOfBoundsException(index);
//		
//		switch(index)
//		{
//			case COMP_X: this.x = value;
//			case COMP_Y: this.y = value;
//		}
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public int hashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + this.x.hashCode();
//		result = prime * result + this.y.hashCode();
//		return result;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(this == obj) return true;
//		if(obj == null) return false;
//		
//		if(obj instanceof Tup2strR)
//		{
//			Tup2strR other = (Tup2strR) obj;
//			if(!this.x.equals(other.getX())) return false;
//			if(!this.y.equals(other.getY())) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupstrR)
//		{
//			TupstrR other = (TupstrR) obj;
//			if(2 != other.getDimensions()) return false;
//			if(!this.x.equals(other.getByIndex(0))) return false;
//			if(!this.y.equals(other.getByIndex(1))) return false;
//			
//			return true;
//		}
//		
//		return false;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public String toString()
//	{
//		return "tup2str(x=" + this.x + ", y=" + this.y + ")";
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2strC shallowClone()
//	{
//		return new Tup2str(this.x, this.y);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2strC deepClone()
//	{
//		return new Tup2str(this.x, this.y);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Tup2str clone()
//	{
//		return new Tup2str(this.x, this.y);
//	}
//}