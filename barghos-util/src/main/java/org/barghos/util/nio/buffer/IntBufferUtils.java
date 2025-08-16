package org.barghos.util.nio.buffer;

import java.nio.IntBuffer;

import java.util.Collection;
import java.util.List;

import org.barghos.annotation.AllowNull;

public class IntBufferUtils
{
	private IntBufferUtils() { }
	
	public static IntBuffer direct(int capacity)
	{
		return BufferUtils.directIntBuffer(capacity);
	}
	
	public static void destroy(@AllowNull IntBuffer buffer)
	{
		BufferUtils.destroyBuffer(buffer);
	}
	
	public static IntBuffer directFromInt(int... values)
	{
		return directFromInt(false, values);
	}
	
	public static IntBuffer directFromInt(boolean flip, int... values)
	{
		IntBuffer buffer = direct(values.length);
		
		buffer.put(values);
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromInt(Integer... values)
	{
		return directFromInt(false, values);
	}
	
	public static IntBuffer directFromInt(boolean flip, Integer... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length);
		
		for(int i = 0; i < length; i++)
		{
			Integer element = values[i];
			
			if(element == null) throw new NullPointerException();
				
			buffer.put(element);
		}
			
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromInt(List<Integer> values)
	{
		return directFromInt(false, values);
	}

	public static IntBuffer directFromInt(boolean flip, List<Integer> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length);
		
		for(int i = 0; i < length; i++)
		{
			Integer element = values.get(i);
			
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromInt(Collection<Integer> values)
	{
		return directFromInt(false, values);
	}
	
	public static IntBuffer directFromInt(boolean flip, Collection<Integer> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length);
		
		for(Integer element : values)
		{
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
			
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple2(IBufferableRI... values)
	{
		return directFromTuple2(false, values);
	}
	
	public static IntBuffer directFromTuple2(boolean flip, IBufferableRI... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 2);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRI element = values[i];

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple2(List<IBufferableRI> values)
	{
		return directFromTuple2(false, values);
	}
	
	public static IntBuffer directFromTuple2(boolean flip, List<IBufferableRI> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 2);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRI element = values.get(i);

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple2(Collection<IBufferableRI> values)
	{
		return directFromTuple2(false, values);
	}
	
	public static IntBuffer directFromTuple2(boolean flip, Collection<IBufferableRI> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 2);
		
		for(IBufferableRI element : values)
		{
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple3(IBufferableRI... values)
	{
		return directFromTuple3(false, values);
	}
	
	public static IntBuffer directFromTuple3(boolean flip, IBufferableRI... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 3);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRI element = values[i];

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple3(List<IBufferableRI> values)
	{
		return directFromTuple3(false, values);
	}
	
	public static IntBuffer directFromTuple3(boolean flip, List<IBufferableRI> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 3);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRI element = values.get(i);

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple3(Collection<IBufferableRI> values)
	{
		return directFromTuple3(false, values);
	}
	
	public static IntBuffer directFromTuple3(boolean flip, Collection<IBufferableRI> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 3);
		
		for(IBufferableRI element : values)
		{
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple4(IBufferableRI... values)
	{
		return directFromTuple4(false, values);
	}
	
	public static IntBuffer directFromTuple4(boolean flip, IBufferableRI... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 4);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRI element = values[i];
			
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple4(List<IBufferableRI> values)
	{
		return directFromTuple4(false, values);
	}
	
	public static IntBuffer directFromTuple4(boolean flip, List<IBufferableRI> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 4);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRI element = values.get(i);
			
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer directFromTuple4(Collection<IBufferableRI> values)
	{
		return directFromTuple4(false, values);
	}
	
	public static IntBuffer directFromTuple4(boolean flip, Collection<IBufferableRI> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		IntBuffer buffer = direct(length * 4);
		
		for(IBufferableRI element : values)
		{
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer putInt(@AllowNull IntBuffer buffer, @AllowNull int... values)
	{
		return putInt(buffer, false, values);
	}
	
	public static IntBuffer putInt(@AllowNull IntBuffer buffer, boolean flip, @AllowNull int... values)
	{
		if(buffer == null) return null;
		
		if(values == null)
		{
			if(flip) buffer.flip();
			return buffer;
		}
		
		int length = values.length;
		
		if(length == 0)
		{
			if(flip) buffer.flip();
			
			return buffer;
		}
		
		buffer.put(values);
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer putInt(@AllowNull IntBuffer buffer, @AllowNull Integer... values)
	{
		return putInt(buffer, false, values);
	}
	
	public static IntBuffer putInt(@AllowNull IntBuffer buffer, boolean flip, @AllowNull Integer... values)
	{
		if(buffer == null) return null;
		
		if(values == null)
		{
			if(flip) buffer.flip();
			
			return buffer;
		}
		
		int length = values.length;
		
		if(length == 0)
		{
			if(flip) buffer.flip();
			
			return buffer;
		}
		
		for(int i = 0; i < length; i++)
		{
			Integer element = values[i];
			
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}

		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer putInt(@AllowNull IntBuffer buffer, @AllowNull List<Integer> values)
	{
		return putInt(buffer, false, values);
	}
	
	public static IntBuffer putInt(@AllowNull IntBuffer buffer, boolean flip, @AllowNull List<Integer> values)
	{
		if(buffer == null) return null;
		
		if(values == null)
		{
			if(flip) buffer.flip();
			
			return buffer;
		}
		
		int length = values.size();
		
		if(length == 0)
		{
			if(flip) buffer.flip();
			
			return buffer;
		}
		
		for(int i = 0; i < length; i++)
		{
			Integer element = values.get(i);
			
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer putInt(@AllowNull IntBuffer buffer, @AllowNull Collection<Integer> values)
	{
		return putInt(buffer, false, values);
	}

	public static IntBuffer putInt(@AllowNull IntBuffer buffer, boolean flip, @AllowNull Collection<Integer> values)
	{
		if(buffer == null) return null;
		
		if(values == null)
		{
			if(flip) buffer.flip();
			
			return buffer;
		}
		
		if(values.size() == 0)
		{
			if(flip) buffer.flip();
			
			return buffer;
		}
		
		for(Integer element : values)
		{
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
}