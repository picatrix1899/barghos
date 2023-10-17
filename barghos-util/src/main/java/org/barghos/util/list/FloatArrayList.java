package org.barghos.util.list;

import java.util.Arrays;
import java.util.Collection;

import org.barghostest.util.collection.core.iterator.FloatIterator;
import org.barghostest.util.collection.core.iterator.FloatListIterator;

public class FloatArrayList implements FloatList
{
	private static final int MAX_SIZE = Integer.MAX_VALUE - 8;
	private static final int DEFAULT_INCREMENT = 10;
	private static final float[] EMPTY_ARRAY = {};
	
	private float[] data;
	private int size;
	private int increment;
	
	public FloatArrayList()
	{
		this.data = EMPTY_ARRAY;
		this.size = 0;
		this.increment = DEFAULT_INCREMENT;
	}
	
	public FloatArrayList(int capacity)
	{
		if(capacity > MAX_SIZE) throw new IllegalArgumentException("capacity exceeds maximum size for arrays");
		
		this.data = new float[capacity];
		this.size = 0;
		this.increment = DEFAULT_INCREMENT;
	}
	
	public FloatArrayList(Collection<? extends Float> c)
	{
		Float[] in = c.toArray((s) -> new Float[s]);
		
		if(in.length == 0)
		{
			this.data = EMPTY_ARRAY;
			this.size = 0;
			this.increment = DEFAULT_INCREMENT;
			
			return;
		}
		
		this.data = new float[in.length];
		this.size = in.length;
		this.increment = DEFAULT_INCREMENT;
		
		for(int i = 0; i < in.length; i++)
		{
			this.data[i] = in[i];
		}
	}
	
	public FloatArrayList increment(int increment)
	{
		if(increment < 1) throw new IllegalArgumentException("increment cannot be less than 1, was " + increment);
		
		this.increment = increment;
		
		return this;
	}
	
	public int increment()
	{
		return this.increment;
	}
	
	public boolean addRange(Collection<? extends Float> c)
	{
		Float[] in = c.toArray((s) -> new Float[s]);
		
		if(in.length == 0) return true;
		
		if(this.size + in.length > this.data.length)
		{
			int desiredIncrementFactor = Math.floorDiv(in.length, this.increment);
			if(in.length % this.increment > 0) desiredIncrementFactor += 1;
			resize(in.length, desiredIncrementFactor * this.increment);
		}
		
		for(int i = 0; i < in.length; i++)
		{
			this.data[this.size + i] = in[i];
		}
		
		this.size += in.length;
		
		return true;
	}
	
	@Override
	public boolean addFloat(float value)
	{
		if(this.size + 1 > this.data.length)
		{
			resize(1, this.increment);
		}
		
		this.data[this.size] = value;
		this.size++;
		
		return true;
	}
	
	private void resize(int min, int desired)
	{
		// Guarantees that at least the minimum amount is available and avoid type overflow by using a inverse calculation from the max size.
		if(MAX_SIZE - min < this.data.length) throw new OutOfMemoryError("Required array length " + this.data.length + " + " + min + " is too large");
		
		// Increase as closely as possible to desired amount.
		int differenceToMax = MAX_SIZE - this.data.length;
		int increment = Math.min(desired, differenceToMax);
		
		this.data = Arrays.copyOf(this.data, this.data.length + increment);
	}
	
	public int size()
	{
		return this.size;
	}

	@Override
	public boolean isEmpty()
	{
		return this.size == 0;
	}

	@Override
	public void clear()
	{
		this.data = EMPTY_ARRAY;
		this.size = 0;
	}

	@Override
	public boolean containsFloat(float value)
	{
		for(int i = 0; i < this.size; i++)
		{
			if(this.data[i] == value) return true;
		}
		
		return false;
	}

	@Override
	public float[] toFloatArray()
	{
		return Arrays.copyOf(this.data, this.size);
	}

	@Override
	public float[] toFloatArray(float[] res)
	{
		if (res.length < this.size) return Arrays.copyOf(this.data, this.size);
		    
		System.arraycopy(this.data, 0, res, 0, this.size);
		
		return res;
	}
	@Override
	public float getFloat(int index)
	{
		return this.data[index];
	}

	@Override
	public float setFloat(int index, float value)
	{
		float old = this.data[index];
		
		this.data[index] = value;
		
		return old;
	}

	@Override
	public boolean removeFloat(float value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insertFloat(int index, float element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float removeFloatAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int indexOfFloat(float value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOfFloat(float value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FloatList subFloatList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FloatIterator floatIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FloatListIterator floatListIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FloatListIterator floatListIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Float> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Float> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
}
