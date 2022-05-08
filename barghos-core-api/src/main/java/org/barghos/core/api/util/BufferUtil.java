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

package org.barghos.core.api.util;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.List;

import org.barghos.core.api.tuple2.Tup2bR;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2iR;
import org.barghos.core.api.tuple2.Tup2lR;
import org.barghos.core.api.tuple2.Tup2sR;
import org.barghos.core.api.tuple3.Tup3bR;
import org.barghos.core.api.tuple3.Tup3dR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple3.Tup3iR;
import org.barghos.core.api.tuple3.Tup3lR;
import org.barghos.core.api.tuple3.Tup3sR;
import org.barghos.core.api.tuple4.Tup4bR;
import org.barghos.core.api.tuple4.Tup4dR;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.core.api.tuple4.Tup4iR;
import org.barghos.core.api.tuple4.Tup4lR;
import org.barghos.core.api.tuple4.Tup4sR;

/**
 * Provides functions for creating and filling nio buffers more easiely.
 * 
 * @author picatrix1899
 */
public class BufferUtil
{	
	/**
	 * Contains the factory that should be used for creating and destroying buffers.
	 */
	public static NioBufferFactory BUFFER_FACTORY = new JavaNioBufferFactory();
	
	/**
	 * This class contains only static functions. Therefore it should not be instanciated.
	 */
	private BufferUtil() { }
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} with the given maximum capacity.
	 * That is the maximum amount of byte entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createByteBuffer(int capacity)
	{
		return BUFFER_FACTORY.createByteBuffer(capacity);
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} with the given maximum capacity.
	 * That is the maximum amount of short entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createShortBuffer(int capacity)
	{
		return BUFFER_FACTORY.createShortBuffer(capacity);
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} with the given maximum capacity.
	 * That is the maximum amount of int entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createIntBuffer(int capacity)
	{
		return BUFFER_FACTORY.createIntBuffer(capacity);
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} with the given maximum capacity.
	 * That is the maximum amount of long entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createLongBuffer(int capacity)
	{
		return BUFFER_FACTORY.createLongBuffer(capacity);
	}	
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} with the given maximum capacity.
	 * That is the maximum amount of float entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFloatBuffer(int capacity)
	{
		return BUFFER_FACTORY.createFloatBuffer(capacity);
	}		
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} with the given maximum capacity.
	 * That is the maximum amount of double entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createDoubleBuffer(int capacity)
	{
		return BUFFER_FACTORY.createDoubleBuffer(capacity);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link ByteBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(ByteBuffer buffer)
	{
		BUFFER_FACTORY.destroyBuffer(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link ShortBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(ShortBuffer buffer)
	{
		BUFFER_FACTORY.destroyBuffer(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link IntBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(IntBuffer buffer)
	{
		BUFFER_FACTORY.destroyBuffer(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link LongBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(LongBuffer buffer)
	{
		BUFFER_FACTORY.destroyBuffer(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link FloatBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(FloatBuffer buffer)
	{
		BUFFER_FACTORY.destroyBuffer(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link DoubleBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(DoubleBuffer buffer)
	{
		BUFFER_FACTORY.destroyBuffer(buffer);
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromByte(byte... v)
	{
		return BUFFER_FACTORY.createByteBuffer(v.length).put(v);
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromByte(List<Byte> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromShort(short... v)
	{
		return BUFFER_FACTORY.createShortBuffer(v.length).put(v);
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromShort(List<Short> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromInt(int... v)
	{
		return BUFFER_FACTORY.createIntBuffer(v.length).put(v);
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromInt(List<Integer> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromLong(long... v)
	{
		return BUFFER_FACTORY.createLongBuffer(v.length).put(v);
	}	
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromLong(List<Long> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length);

		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromFloat(float... v)
	{
		return BUFFER_FACTORY.createFloatBuffer(v.length).put(v);
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromFloat(List<Float> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromDouble(double... v)
	{
		return BUFFER_FACTORY.createDoubleBuffer(v.length).put(v);
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromDouble(List<Double> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromTuple2b(Tup2bR... v)
	{
		int length = v.length;
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromTuple2b(List<Tup2bR> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromTuple3b(Tup3bR... v)
	{
		int length = v.length;
		
		ByteBuffer buffer = createByteBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromTuple3b(List<Tup3bR> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromTuple4b(Tup4bR... v)
	{
		int length = v.length;
		
		ByteBuffer buffer = createByteBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromTuple4b(List<Tup4bR> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromTuple2s(Tup2sR... v)
	{
		int length = v.length;
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromTuple2s(List<Tup2sR> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromTuple3s(Tup3sR... v)
	{
		int length = v.length;
		
		ShortBuffer buffer = createShortBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromTuple3s(List<Tup3sR> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromTuple4s(Tup4sR... v)
	{
		int length = v.length;
		
		ShortBuffer buffer = createShortBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromTuple4s(List<Tup4sR> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromTuple2i(Tup2iR... v)
	{
		int length = v.length;
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromTuple2i(List<Tup2iR> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromTuple3i(Tup3iR... v)
	{
		int length = v.length;
		
		IntBuffer buffer = createIntBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromTuple3i(List<Tup3iR> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromTuple4i(Tup4iR... v)
	{
		int length = v.length;
		
		IntBuffer buffer = createIntBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromTuple4i(List<Tup4iR> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromTuple2l(Tup2lR... v)
	{
		int length = v.length;
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromTuple2l(List<Tup2lR> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromTuple3l(Tup3lR... v)
	{
		int length = v.length;
		
		LongBuffer buffer = createLongBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromTuple3l(List<Tup3lR> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromTuple4l(Tup4lR... v)
	{
		int length = v.length;
		
		LongBuffer buffer = createLongBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromTuple4l(List<Tup4lR> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}

	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromTuple2f(Tup2fR... v)
	{
		int length = v.length;
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromTuple2f(List<Tup2fR> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromTuple3f(Tup3fR... v)
	{
		int length = v.length;
		
		FloatBuffer buffer = createFloatBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromTuple3f(List<Tup3fR> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromTuple4f(Tup4fR... v)
	{
		int length = v.length;
		
		FloatBuffer buffer = createFloatBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromTuple4f(List<Tup4fR> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromTuple2d(Tup2dR... v)
	{
		int length = v.length;
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromTuple2d(List<Tup2dR> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromTuple3d(Tup3dR... v)
	{
		int length = v.length;
		
		DoubleBuffer buffer = createDoubleBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromTuple3d(List<Tup3dR> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromTuple4d(Tup4dR... v)
	{
		int length = v.length;
		
		DoubleBuffer buffer = createDoubleBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromTuple4d(List<Tup4dR> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}

	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipByte(byte... v)
	{
		return BUFFER_FACTORY.createByteBuffer(v.length).put(v).flip();
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipByte(List<Byte> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipShort(short... v)
	{
		return BUFFER_FACTORY.createShortBuffer(v.length).put(v).flip();
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipShort(List<Short> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipInt(int... v)
	{
		return BUFFER_FACTORY.createIntBuffer(v.length).put(v).flip();
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipInt(List<Integer> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipLong(long... v)
	{
		return BUFFER_FACTORY.createLongBuffer(v.length).put(v).flip();
	}	
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipLong(List<Long> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length);

		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipFloat(float... v)
	{
		return BUFFER_FACTORY.createFloatBuffer(v.length).put(v).flip();
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipFloat(List<Float> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipDouble(double... v)
	{
		return BUFFER_FACTORY.createDoubleBuffer(v.length).put(v).flip();
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipDouble(List<Double> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length);
		
		for(int i = 0; i < length; i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipTuple2b(Tup2bR... v)
	{
		int length = v.length;
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipTuple2b(List<Tup2bR> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipTuple3b(Tup3bR... v)
	{
		int length = v.length;
		
		ByteBuffer buffer = createByteBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipTuple3b(List<Tup3bR> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipTuple4b(Tup4bR... v)
	{
		int length = v.length;
		
		ByteBuffer buffer = createByteBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ByteBuffer} from the given elements and flips it around.
	 * The capacity of byte tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer createFromAndFlipTuple4b(List<Tup4bR> v)
	{
		int length = v.size();
		
		ByteBuffer buffer = BUFFER_FACTORY.createByteBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipTuple2s(Tup2sR... v)
	{
		int length = v.length;
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipTuple2s(List<Tup2sR> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipTuple3s(Tup3sR... v)
	{
		int length = v.length;
		
		ShortBuffer buffer = createShortBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipTuple3s(List<Tup3sR> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipTuple4s(Tup4sR... v)
	{
		int length = v.length;
		
		ShortBuffer buffer = createShortBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} from the given elements and flips it around.
	 * The capacity of short tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer createFromAndFlipTuple4s(List<Tup4sR> v)
	{
		int length = v.size();
		
		ShortBuffer buffer = BUFFER_FACTORY.createShortBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipTuple2i(Tup2iR... v)
	{
		int length = v.length;
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipTuple2i(List<Tup2iR> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipTuple3i(Tup3iR... v)
	{
		int length = v.length;
		
		IntBuffer buffer = createIntBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipTuple3i(List<Tup3iR> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipTuple4i(Tup4iR... v)
	{
		int length = v.length;
		
		IntBuffer buffer = createIntBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} from the given elements and flips it around.
	 * The capacity of int tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer createFromAndFlipTuple4i(List<Tup4iR> v)
	{
		int length = v.size();
		
		IntBuffer buffer = BUFFER_FACTORY.createIntBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipTuple2l(Tup2lR... v)
	{
		int length = v.length;
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipTuple2l(List<Tup2lR> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipTuple3l(Tup3lR... v)
	{
		int length = v.length;
		
		LongBuffer buffer = createLongBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipTuple3l(List<Tup3lR> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipTuple4l(Tup4lR... v)
	{
		int length = v.length;
		
		LongBuffer buffer = createLongBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} from the given elements and flips it around.
	 * The capacity of long tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer createFromAndFlipTuple4l(List<Tup4lR> v)
	{
		int length = v.size();
		
		LongBuffer buffer = BUFFER_FACTORY.createLongBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}

	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipTuple2f(Tup2fR... v)
	{
		int length = v.length;
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipTuple2f(List<Tup2fR> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipTuple3f(Tup3fR... v)
	{
		int length = v.length;
		
		FloatBuffer buffer = createFloatBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipTuple3f(List<Tup3fR> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipTuple4f(Tup4fR... v)
	{
		int length = v.length;
		
		FloatBuffer buffer = createFloatBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} from the given elements and flips it around.
	 * The capacity of float tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer createFromAndFlipTuple4f(List<Tup4fR> v)
	{
		int length = v.size();
		
		FloatBuffer buffer = BUFFER_FACTORY.createFloatBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipTuple2d(Tup2dR... v)
	{
		int length = v.length;
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipTuple2d(List<Tup2dR> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 2);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipTuple3d(Tup3dR... v)
	{
		int length = v.length;
		
		DoubleBuffer buffer = createDoubleBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipTuple3d(List<Tup3dR> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 3);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipTuple4d(Tup4dR... v)
	{
		int length = v.length;
		
		DoubleBuffer buffer = createDoubleBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} from the given elements and flips it around.
	 * The capacity of double tuple entries is here the amount of given elements.
	 * 
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer createFromAndFlipTuple4d(List<Tup4dR> v)
	{
		int length = v.size();
		
		DoubleBuffer buffer = BUFFER_FACTORY.createDoubleBuffer(length * 4);
		
		for(int i = 0; i < length; i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putByte(ByteBuffer buffer, byte... v)
	{
		return buffer.put(v);
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putByte(ByteBuffer buffer, List<Byte> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putShort(ShortBuffer buffer, short... v)
	{
		return buffer.put(v);
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putShort(ShortBuffer buffer, List<Short> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putInt(IntBuffer buffer, int... v)
	{
		return buffer.put(v);
	}	
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putInt(IntBuffer buffer, List<Integer> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putLong(LongBuffer buffer, long... v)
	{
		return buffer.put(v);
	}	
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putLong(LongBuffer buffer, List<Long> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putFloat(FloatBuffer buffer, float... v)
	{
		return buffer.put(v);
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putFloat(FloatBuffer buffer, List<Float> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putDouble(DoubleBuffer buffer, double... v)
	{
		return buffer.put(v);
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putDouble(DoubleBuffer buffer, List<Double> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putTuple2b(ByteBuffer buffer, Tup2bR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putTuple2b(ByteBuffer buffer, List<Tup2bR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putTuple3b(ByteBuffer buffer, Tup3bR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putTuple3b(ByteBuffer buffer, List<Tup3bR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putTuple4b(ByteBuffer buffer, Tup4bR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putTuple4b(ByteBuffer buffer, List<Tup4bR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putTuple2s(ShortBuffer buffer, Tup2sR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putTuple2s(ShortBuffer buffer, List<Tup2sR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putTuple3s(ShortBuffer buffer, Tup3sR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putTuple3s(ShortBuffer buffer, List<Tup3sR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putTuple4s(ShortBuffer buffer, Tup4sR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putTuple4s(ShortBuffer buffer, List<Tup4sR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putTuple2i(IntBuffer buffer, Tup2iR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putTuple2i(IntBuffer buffer, List<Tup2iR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putTuple3i(IntBuffer buffer, Tup3iR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putTuple3i(IntBuffer buffer, List<Tup3iR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putTuple4i(IntBuffer buffer, Tup4iR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putTuple4i(IntBuffer buffer, List<Tup4iR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putTuple2l(LongBuffer buffer, Tup2lR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putTuple2l(LongBuffer buffer, List<Tup2lR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putTuple3l(LongBuffer buffer, Tup3lR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putTuple3l(LongBuffer buffer, List<Tup3lR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putTuple4l(LongBuffer buffer, Tup4lR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putTuple4l(LongBuffer buffer, List<Tup4lR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putTuple2f(FloatBuffer buffer, Tup2fR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putTuple2f(FloatBuffer buffer, List<Tup2fR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putTuple3f(FloatBuffer buffer, Tup3fR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putTuple3f(FloatBuffer buffer, List<Tup3fR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putTuple4f(FloatBuffer buffer, Tup4fR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putTuple4f(FloatBuffer buffer, List<Tup4fR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putTuple2d(DoubleBuffer buffer, Tup2dR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putTuple2d(DoubleBuffer buffer, List<Tup2dR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putTuple3d(DoubleBuffer buffer, Tup3dR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putTuple3d(DoubleBuffer buffer, List<Tup3dR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putTuple4d(DoubleBuffer buffer, Tup4dR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putTuple4d(DoubleBuffer buffer, List<Tup4dR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipByte(ByteBuffer buffer, byte... v)
	{
		return buffer.put(v).flip();
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipByte(ByteBuffer buffer, List<Byte> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipShort(ShortBuffer buffer, short... v)
	{
		return buffer.put(v).flip();
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipShort(ShortBuffer buffer, List<Short> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipInt(IntBuffer buffer, int... v)
	{
		return buffer.put(v).flip();
	}	
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipInt(IntBuffer buffer, List<Integer> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipLong(LongBuffer buffer, long... v)
	{
		return buffer.put(v).flip();
	}	
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipLong(LongBuffer buffer, List<Long> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipFloat(FloatBuffer buffer, float... v)
	{
		return buffer.put(v).flip();
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipFloat(FloatBuffer buffer, List<Float> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipDouble(DoubleBuffer buffer, double... v)
	{
		return buffer.put(v).flip();
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipDouble(DoubleBuffer buffer, List<Double> v)
	{
		for(int i = 0; i < v.size(); i++)
			buffer.put(v.get(i));
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipTuple2b(ByteBuffer buffer, Tup2bR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipTuple2b(ByteBuffer buffer, List<Tup2bR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipTuple3b(ByteBuffer buffer, Tup3bR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipTuple3b(ByteBuffer buffer, List<Tup3bR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipTuple4b(ByteBuffer buffer, Tup4bR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ByteBuffer putAndFlipTuple4b(ByteBuffer buffer, List<Tup4bR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipTuple2s(ShortBuffer buffer, Tup2sR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipTuple2s(ShortBuffer buffer, List<Tup2sR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipTuple3s(ShortBuffer buffer, Tup3sR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipTuple3s(ShortBuffer buffer, List<Tup3sR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipTuple4s(ShortBuffer buffer, Tup4sR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static ShortBuffer putAndFlipTuple4s(ShortBuffer buffer, List<Tup4sR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipTuple2i(IntBuffer buffer, Tup2iR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipTuple2i(IntBuffer buffer, List<Tup2iR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipTuple3i(IntBuffer buffer, Tup3iR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipTuple3i(IntBuffer buffer, List<Tup3iR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipTuple4i(IntBuffer buffer, Tup4iR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static IntBuffer putAndFlipTuple4i(IntBuffer buffer, List<Tup4iR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipTuple2l(LongBuffer buffer, Tup2lR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipTuple2l(LongBuffer buffer, List<Tup2lR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipTuple3l(LongBuffer buffer, Tup3lR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipTuple3l(LongBuffer buffer, List<Tup3lR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipTuple4l(LongBuffer buffer, Tup4lR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static LongBuffer putAndFlipTuple4l(LongBuffer buffer, List<Tup4lR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipTuple2f(FloatBuffer buffer, Tup2fR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipTuple2f(FloatBuffer buffer, List<Tup2fR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipTuple3f(FloatBuffer buffer, Tup3fR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipTuple3f(FloatBuffer buffer, List<Tup3fR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipTuple4f(FloatBuffer buffer, Tup4fR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static FloatBuffer putAndFlipTuple4f(FloatBuffer buffer, List<Tup4fR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipTuple2d(DoubleBuffer buffer, Tup2dR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipTuple2d(DoubleBuffer buffer, List<Tup2dR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipTuple3d(DoubleBuffer buffer, Tup3dR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipTuple3d(DoubleBuffer buffer, List<Tup3dR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipTuple4d(DoubleBuffer buffer, Tup4dR... v)
	{
		for(int i = 0; i < v.length; i++)
			v[i].toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
	
	/**
	 * Puts the given elements into the given buffer and flips it around.
	 * 
	 * @param buffer The buffer to put the elements into.
	 * @param v The elements that should be put into the buffer.
	 * 
	 * @return The buffer.
	 */
	public static DoubleBuffer putAndFlipTuple4d(DoubleBuffer buffer, List<Tup4dR> v)
	{
		for(int i = 0; i < v.size(); i++)
			v.get(i).toBuffer(buffer);
		
		buffer.flip();
		
		return buffer;
	}
}