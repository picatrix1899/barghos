package org.barghos.nio.buffer;

import java.nio.FloatBuffer;

import java.util.Collection;
import java.util.List;

import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;
import org.barghos.validation.exception.argument.ArgumentNullException;

/**
 * Provides utilities for creating and filling nio float buffers.
 * 
 * @author picatrix1899
 */
public class FloatBufferUtils
{
	/**
	 * This class contains only static functions. Therefore it should not be instanciated.
	 */
	private FloatBufferUtils() { }
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} with the given maximum capacity.
	 * That is the maximum amount of float entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer direct(@IntMinValue(0) int capacity)
	{
		return BufferUtils.directFloatBuffer(capacity);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link FloatBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroy(@Nullable FloatBuffer buffer)
	{
		BufferUtils.destroyBuffer(buffer);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(@MinLength(1) float... values)
	{
		return directFromFloat(false, values);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param flip Specifies that the buffer should be flipped after the filling.
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(boolean flip, @MinLength(1) float... values)
	{
		if(values == null) throw new ArgumentNullException();
		
		FloatBuffer buffer = direct(values.length);
		
		buffer.put(values);
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 * @throws IllegalArgumentException If the array parameter {@code values} contains no elements.
	 * @throws NullPointerException If one of the elements in the array parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(@MinLength(1) Float... values)
	{
		return directFromFloat(false, values);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param flip Specifies that the buffer should be flipped after the filling.
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 * @throws IllegalArgumentException If the array parameter {@code values} contains no elements.
	 * @throws NullPointerException If one of the elements in the array parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(boolean flip, @MinLength(1) Float... values)
	{
		if(values == null) throw new ArgumentNullException();
		
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
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * This operation does not protect against concurrent modifications.
	 * 
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 * @throws IllegalArgumentException If the array parameter {@code values} contains no elements.
	 * @throws NullPointerException If one of the elements in the array parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(@MinLength(1) List<Float> values)
	{
		return directFromFloat(false, values);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * This operation does not protect against concurrent modifications.
	 * 
	 * @param flip Specifies that the buffer should be flipped after the filling.
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 * @throws IllegalArgumentException If the array parameter {@code values} contains no elements.
	 * @throws NullPointerException If one of the elements in the array parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(boolean flip, @MinLength(1) List<Float> values)
	{
		if(values == null) throw new ArgumentNullException();
		
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
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 * @throws IllegalArgumentException If the array parameter {@code values} contains no elements.
	 * @throws NullPointerException If one of the elements in the array parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(@MinLength(1) Collection<Float> values)
	{
		return directFromFloat(false, values);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param flip Specifies that the buffer should be flipped after the filling.
	 * @param values The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 * 
	 * @throws ArgumentNullException If the parameter {@code values} is null.
	 * @throws IllegalArgumentException If the array parameter {@code values} contains no elements.
	 * @throws NullPointerException If one of the elements in the array parameter {@code values} is null.
	 */
	public static FloatBuffer directFromFloat(boolean flip, @MinLength(1) Collection<Float> values)
	{
		if(values == null) throw new ArgumentNullException();
		
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
	
	public static FloatBuffer directFromVarying(@MinLength(1) BufferableFloatR... values)
	{
		return directFromVarying(false, values);
	}
	
	public static FloatBuffer directFromVarying(boolean flip, @MinLength(1) BufferableFloatR... values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		int valueCount = 0;
		
		for(int i = 0; i < length; i++)
		{
			valueCount += values[i].getFloatBufferDimensions();
		}
		
		if(valueCount == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(valueCount);
		
		for(int i = 0; i < length; i++)
		{
			values[i].toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromVarying(@IntMinValue(1) int valueCount, @MinLength(1) BufferableFloatR... values)
	{
		return directFromVarying(valueCount, false, values);
	}
	
	public static FloatBuffer directFromVarying(@IntMinValue(1) int valueCount, boolean flip, @MinLength(1) BufferableFloatR... values)
	{
		if(valueCount < 1) throw new IllegalArgumentException();
		if(values == null) throw new ArgumentNullException();
		
		int length = values.length;

		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(valueCount);
		
		for(int i = 0; i < length; i++)
		{
			values[i].toFloatBuffer(buffer);
		}
			
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromVarying(@MinLength(1) List<BufferableFloatR> values)
	{
		return directFromVarying(false, values);
	}

	public static FloatBuffer directFromVarying(boolean flip, @MinLength(1) List<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		int valueCount = 0;
		
		if(valueCount == 0) throw new IllegalArgumentException();
		
		for(int i = 0; i < length; i++)
		{
			valueCount += values.get(i).getFloatBufferDimensions();
		}
			
		FloatBuffer buffer = direct(valueCount);
		
		for(int i = 0; i < length; i++)
		{
			values.get(i).toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromVarying(@IntMinValue(1) int valueCount, @MinLength(1) List<BufferableFloatR> values)
	{
		return directFromVarying(valueCount, false, values);
	}
	
	public static FloatBuffer directFromVarying(@IntMinValue(1) int valueCount, boolean flip, @MinLength(1) List<BufferableFloatR> values)
	{
		if(valueCount < 1) throw new IllegalArgumentException();
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();

		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(valueCount);
		
		for(int i = 0; i < length; i++)
		{
			values.get(i).toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromVarying(@MinLength(1) Collection<BufferableFloatR> values)
	{
		return directFromVarying(false, values);
	}
	
	public static FloatBuffer directFromVarying(boolean flip, @MinLength(1) Collection<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		if(values.size() == 0) throw new IllegalArgumentException();
		
		int valueCount = 0;
		
		for(BufferableFloatR element : values)
		{
			valueCount += element.getFloatBufferDimensions();
		}
			
		if(valueCount == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(valueCount);
		
		for(BufferableFloatR element : values)
		{
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromVarying(@IntMinValue(1) int valueCount, @MinLength(1) Collection<BufferableFloatR> values)
	{
		return directFromVarying(valueCount, false, values);
	}
	
	public static FloatBuffer directFromVarying(@IntMinValue(1) int valueCount, boolean flip, @MinLength(1) Collection<BufferableFloatR> values)
	{
		if(valueCount < 1) throw new IllegalArgumentException();
		if(values == null) throw new ArgumentNullException();
		
		FloatBuffer buffer = direct(valueCount);
		
		for(BufferableFloatR element : values)
		{
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple2(@MinLength(1) BufferableFloatR... values)
	{
		return directFromTuple2(false, values);
	}
	
	public static FloatBuffer directFromTuple2(boolean flip, @MinLength(1) BufferableFloatR... values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 2);
		
		for(int i = 0; i < length; i++)
		{
			BufferableFloatR element = values[i];

			if(element.getFloatBufferDimensions() != 2) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple2(@MinLength(1) List<BufferableFloatR> values)
	{
		return directFromTuple2(false, values);
	}
	
	public static FloatBuffer directFromTuple2(boolean flip, @MinLength(1) List<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 2);
		
		for(int i = 0; i < length; i++)
		{
			BufferableFloatR element = values.get(i);

			if(element.getFloatBufferDimensions() != 2) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple2(@MinLength(1) Collection<BufferableFloatR> values)
	{
		return directFromTuple2(false, values);
	}
	
	public static FloatBuffer directFromTuple2(boolean flip, @MinLength(1) Collection<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 2);
		
		for(BufferableFloatR element : values)
		{
			if(element.getFloatBufferDimensions() != 2) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple3(@MinLength(1) BufferableFloatR... values)
	{
		return directFromTuple3(false, values);
	}
	
	public static FloatBuffer directFromTuple3(boolean flip, @MinLength(1) BufferableFloatR... values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 3);
		
		for(int i = 0; i < length; i++)
		{
			BufferableFloatR element = values[i];

			if(element.getFloatBufferDimensions() != 3) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple3(@MinLength(1) List<BufferableFloatR> values)
	{
		return directFromTuple3(false, values);
	}
	
	public static FloatBuffer directFromTuple3(boolean flip, @MinLength(1) List<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 3);
		
		for(int i = 0; i < length; i++)
		{
			BufferableFloatR element = values.get(i);

			if(element.getFloatBufferDimensions() != 3) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple3(@MinLength(1) Collection<BufferableFloatR> values)
	{
		return directFromTuple3(false, values);
	}
	
	public static FloatBuffer directFromTuple3(boolean flip, @MinLength(1) Collection<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 3);
		
		for(BufferableFloatR element : values)
		{
			if(element.getFloatBufferDimensions() != 3) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple4(@MinLength(1) BufferableFloatR... values)
	{
		return directFromTuple4(false, values);
	}
	
	public static FloatBuffer directFromTuple4(boolean flip, @MinLength(1) BufferableFloatR... values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.length;
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 4);
		
		for(int i = 0; i < length; i++)
		{
			BufferableFloatR element = values[i];
			
			if(element.getFloatBufferDimensions() != 4) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple4(@MinLength(1) List<BufferableFloatR> values)
	{
		return directFromTuple4(false, values);
	}
	
	public static FloatBuffer directFromTuple4(boolean flip, @MinLength(1) List<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 4);
		
		for(int i = 0; i < length; i++)
		{
			BufferableFloatR element = values.get(i);
			
			if(element.getFloatBufferDimensions() != 4) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer directFromTuple4(@MinLength(1) Collection<BufferableFloatR> values)
	{
		return directFromTuple4(false, values);
	}
	
	public static FloatBuffer directFromTuple4(boolean flip, @MinLength(1) Collection<BufferableFloatR> values)
	{
		if(values == null) throw new ArgumentNullException();
		
		int length = values.size();
		
		if(length == 0) throw new IllegalArgumentException();
		
		FloatBuffer buffer = direct(length * 4);
		
		for(BufferableFloatR element : values)
		{
			if(element.getFloatBufferDimensions() != 4) throw new IllegalArgumentException();
			
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, @Nullable float... values)
	{
		return putFloat(buffer, false, values);
	}
	
	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, boolean flip, @Nullable float... values)
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
	
	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, @Nullable Float... values)
	{
		return putFloat(buffer, false, values);
	}
	
	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, boolean flip, @Nullable Float... values)
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
	
	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, @Nullable List<Float> values)
	{
		return putFloat(buffer, false, values);
	}
	
	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, boolean flip, @Nullable List<Float> values)
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
	
	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, @Nullable Collection<Float> values)
	{
		return putFloat(buffer, false, values);
	}

	public static FloatBuffer putFloat(@Nullable FloatBuffer buffer, boolean flip, @Nullable Collection<Float> values)
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
	
	public static FloatBuffer put(@Nullable FloatBuffer buffer, @Nullable BufferableFloatR... values)
	{
		return put(buffer, false, values);
	}
	
	public static FloatBuffer put(@Nullable FloatBuffer buffer, boolean flip, @Nullable BufferableFloatR... values)
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
			values[i].toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer put(@Nullable FloatBuffer buffer, @Nullable List<BufferableFloatR> values)
	{
		return put(buffer, false, values);
	}
	
	public static FloatBuffer put(@Nullable FloatBuffer buffer, boolean flip, @Nullable List<BufferableFloatR> values)
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
			values.get(i).toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer put(@Nullable FloatBuffer buffer, @Nullable Collection<BufferableFloatR> values)
	{
		return put(buffer, false, values);
	}

	public static FloatBuffer put(@Nullable FloatBuffer buffer, boolean flip, @Nullable Collection<BufferableFloatR> values)
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
		
		for(BufferableFloatR element : values)
		{
			element.toFloatBuffer(buffer);
		}
		
		if(flip) buffer.flip();
		
		return buffer;
	}
}