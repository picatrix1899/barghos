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

package org.barghos.core.tuple3;

import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple3.Tup3sR;

/**
 * Represents an immutable readonly 3-dimensional short tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ImmutableTup3s implements Tup3sR, FormattableToString
{
	/**
	 * The x component.
	 */
	public final short x;
	
	/**
	 * The y component.
	 */
	public final short y;
	
	/**
	 * The z component.
	 */
	public final short z;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup3s} from an existing instance of {@link TupsR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupsR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup3s(TupsR t)
	{
		this(t.getArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3s} from an existing instance of {@link Tup3sR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3sR} to adopt the values from.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3s(Tup3sR t)
	{
		this(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3s} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3s(short value)
	{
		this(value, value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3s} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3s(short x, short y, short z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3s} with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup3s(short[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
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
	public int hashCode()
	{
		if(!isHashCodeGenerated) generateHashCode();
		
		return this.hashCode;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup3sR)
		{
			Tup3sR other = (Tup3sR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			if(getZ() != other.getZ()) return false;
			
			return true;
		}
		
		if(obj instanceof TupsR)
		{
			TupsR other = (TupsR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			if(getZ() != other.getByIndex(2)) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "immutableTup3s(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	@Override
	public ImmutableTup3s clone()
	{
		return new ImmutableTup3s(this);
	}
	
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		values.put("z", getZ());
		
		return values;
	}
	
	@Override
	public ImmutableTup3s getNewInstance(short x, short y, short z)
	{
		return new ImmutableTup3s(x, y, z);
	}
	
	@Override
	public ImmutableTup3s getNewInstance(short value)
	{
		return (ImmutableTup3s)Tup3sR.super.getNewInstance(value);
	}
	
	@Override
	public ImmutableTup3s getNewInstance(Tup3sR t)
	{
		return (ImmutableTup3s)Tup3sR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup3s getNewInstance(TupsR t)
	{
		return (ImmutableTup3s)Tup3sR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup3s getNewInstanceFromArray(short... values)
	{
		return (ImmutableTup3s)Tup3sR.super.getNewInstanceFromArray(values);
	}
	
	/**
	 * This method generates the hashCode and stores it in the member for later use.
	 */
	protected void generateHashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX();
		result = prime * result + getY();
		result = prime * result + getZ();
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}