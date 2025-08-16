package org.barghos.util.nio.buffer;

import java.nio.FloatBuffer;

import java.util.Collection;
import java.util.List;

import org.barghos.annotation.AllowNull;

public class FloatBufferUtils
{
	private FloatBufferUtils() { }
	
	public static FloatBuffer direct(int capacity)
	{
		return BufferUtils.directFloatBuffer(capacity);
	}
	
	public static void destroy(@AllowNull FloatBuffer buffer)
	{
		BufferUtils.destroyBuffer(buffer);
	}
	
	public static FloatBuffer directFromFloat(float... values)
	{
		return directFromFloat(false, values);
	}
	
	public static FloatBuffer directFromFloat(boolean flip, float... values)
	{
		FloatBuffer buffer = direct(values.length);
		
		buffer.put(values);
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromFloat(Float... values)
	{
		return directFromFloat(false, values);
	}
	
	public static FloatBuffer directFromFloat(boolean flip, Float... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length);
		
		for(int i = 0; i < length; i++)
		{
			Float element = values[i];
			
			if(element == null) throw new NullPointerException();
				
			buffer.put(element);
		}
			
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromFloat(List<Float> values)
	{
		return directFromFloat(false, values);
	}

	public static FloatBuffer directFromFloat(boolean flip, List<Float> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length);
		
		for(int i = 0; i < length; i++)
		{
			Float element = values.get(i);
			
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromFloat(Collection<Float> values)
	{
		return directFromFloat(false, values);
	}
	
	public static FloatBuffer directFromFloat(boolean flip, Collection<Float> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length);
		
		for(Float element : values)
		{
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
			
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple2(IBufferableRF... values)
	{
		return directFromTuple2(false, values);
	}
	
	public static FloatBuffer directFromTuple2(boolean flip, IBufferableRF... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 2);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRF element = values[i];

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple2(List<IBufferableRF> values)
	{
		return directFromTuple2(false, values);
	}
	
	public static FloatBuffer directFromTuple2(boolean flip, List<IBufferableRF> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 2);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRF element = values.get(i);

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple2(Collection<IBufferableRF> values)
	{
		return directFromTuple2(false, values);
	}
	
	public static FloatBuffer directFromTuple2(boolean flip, Collection<IBufferableRF> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 2);
		
		for(IBufferableRF element : values)
		{
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple3(IBufferableRF... values)
	{
		return directFromTuple3(false, values);
	}
	
	public static FloatBuffer directFromTuple3(boolean flip, IBufferableRF... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 3);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRF element = values[i];

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple3(List<IBufferableRF> values)
	{
		return directFromTuple3(false, values);
	}
	
	public static FloatBuffer directFromTuple3(boolean flip, List<IBufferableRF> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 3);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRF element = values.get(i);

			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple3(Collection<IBufferableRF> values)
	{
		return directFromTuple3(false, values);
	}
	
	public static FloatBuffer directFromTuple3(boolean flip, Collection<IBufferableRF> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 3);
		
		for(IBufferableRF element : values)
		{
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple4(IBufferableRF... values)
	{
		return directFromTuple4(false, values);
	}
	
	public static FloatBuffer directFromTuple4(boolean flip, IBufferableRF... values)
	{
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 4);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRF element = values[i];
			
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple4(List<IBufferableRF> values)
	{
		return directFromTuple4(false, values);
	}
	
	public static FloatBuffer directFromTuple4(boolean flip, List<IBufferableRF> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 4);
		
		for(int i = 0; i < length; i++)
		{
			IBufferableRF element = values.get(i);
			
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple4(Collection<IBufferableRF> values)
	{
		return directFromTuple4(false, values);
	}
	
	public static FloatBuffer directFromTuple4(boolean flip, Collection<IBufferableRF> values)
	{
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 4);
		
		for(IBufferableRF element : values)
		{
			element.writeTo(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, @AllowNull float... values)
	{
		return putFloat(buffer, false, values);
	}
	
	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, boolean flip, @AllowNull float... values)
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
	
	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, @AllowNull Float... values)
	{
		return putFloat(buffer, false, values);
	}
	
	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, boolean flip, @AllowNull Float... values)
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
			Float element = values[i];
			
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}

		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, @AllowNull List<Float> values)
	{
		return putFloat(buffer, false, values);
	}
	
	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, boolean flip, @AllowNull List<Float> values)
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
			Float element = values.get(i);
			
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, @AllowNull Collection<Float> values)
	{
		return putFloat(buffer, false, values);
	}

	public static FloatBuffer putFloat(@AllowNull FloatBuffer buffer, boolean flip, @AllowNull Collection<Float> values)
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
		
		for(Float element : values)
		{
			if(element == null) throw new NullPointerException();
			
			buffer.put(element);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
}