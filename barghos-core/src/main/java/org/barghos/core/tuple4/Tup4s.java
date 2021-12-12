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

package org.barghos.core.tuple4;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple4.Tup4sR;
import org.barghos.core.api.tuple4.Tup4sRW;

/**
 * This class represents a 4-dimensional short tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Tup4s implements Tup4sRW, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public short x;
	
	/**
	 * The y component.
	 */
	public short y;
	
	/**
	 * The z component.
	 */
	public short z;
	
	/**
	 * The w component.
	 */
	public short w;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4s()
	{
		set((short)0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupsR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupsR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4s(TupsR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup4sR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4sR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4s(Tup4sR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4s(short value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * @param z The initial z value of the tuple.
	 * @param w The initial w value of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4s(short x, short y, short z, short w)
	{
		set(x, y, z, w);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4s(short[] v)
	{
		setArray(v);
	}
	
	@Override
	public short getX()
	{
		return this.x;
	}
	
	@Override
	public short getY()
	{
		return this.y;
	}
	
	@Override
	public short getZ()
	{
		return this.z;
	}
	
	@Override
	public short getW()
	{
		return this.w;
	}
	
	@Override
	public Tup4s setX(short x)
	{
		this.x = x;
		
		return this;
	}
	
	@Override
	public Tup4s setY(short y)
	{
		this.y = y;
		
		return this;
	}
	
	@Override
	public Tup4s setZ(short z)
	{
		this.z = z;
		
		return this;
	}
	
	@Override
	public Tup4s setW(short w)
	{
		this.w = w;
		
		return this;
	}
	
	@Override
	public Tup4s set(Tup4sR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	public Tup4s set(short value)
	{
		return set(value, value, value, value);
	}
	
	@Override
	public Tup4s set(short x, short y, short z, short w)
	{
		return setX(x).setY(y).setZ(z).setW(w);
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX();
		result = prime * result + getY();
		result = prime * result + getZ();
		result = prime * result + getW();
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup4sR)
		{
			Tup4sR other = (Tup4sR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			if(getZ() != other.getZ()) return false;
			if(getW() != other.getW()) return false;
			
			return true;
		}
		
		if(obj instanceof TupsR)
		{
			TupsR other = (TupsR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			if(getZ() != other.getByIndex(2)) return false;
			if(getW() != other.getByIndex(3)) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public Tup4s clone()
	{
		return new Tup4s(this);
	}
	
	@Override
	public String toString()
	{
		return "tup4s(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}
	
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		values.put("z", getZ());
		values.put("w", getW());
		
		return values;
	}
	
	@Override
	public Tup4s getNewInstance(short x, short y, short z, short w)
	{
		return new Tup4s(x, y, z, w);
	}
	
	@Override
	public Tup4s getNewInstance(short value)
	{
		return (Tup4s)Tup4sRW.super.getNewInstance(value);
	}
	
	@Override
	public Tup4s getNewInstance(Tup4sR t)
	{
		return (Tup4s)Tup4sRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup4s getNewInstance(TupsR t)
	{
		return (Tup4s)Tup4sRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup4s getNewInstanceFromArray(short... values)
	{
		return (Tup4s)Tup4sRW.super.getNewInstanceFromArray(values);
	}
	
	@Override
	public Tup4s set(TupsR t)
	{
		return (Tup4s)Tup4sRW.super.set(t);
	}
	
	@Override
	public Tup4s setArray(short... values)
	{
		return (Tup4s)Tup4sRW.super.setArray(values);
	}
	
	@Override
	public Tup4s setByIndex(int index, short value)
	{
		return (Tup4s)Tup4sRW.super.setByIndex(index, value);
	}
}