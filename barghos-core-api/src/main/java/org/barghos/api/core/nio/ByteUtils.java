package org.barghos.api.core.nio;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

public class ByteUtils
{
	public static final VarHandle INT_VIEW_BIG_ENDIAN = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.BIG_ENDIAN);
	public static final VarHandle INT_VIEW_LITTLE_ENDIAN = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.LITTLE_ENDIAN);
	public static final VarHandle INT_VIEW_AUTO_ENDIAN = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.nativeOrder());
	
	public static VarHandle view(Endian endian)
	{
		return switch(endian) {
			case BIG -> INT_VIEW_BIG_ENDIAN;
			case LITTLE -> INT_VIEW_LITTLE_ENDIAN;
			case AUTO -> INT_VIEW_AUTO_ENDIAN;
		};
	}
	
	public static void setInt(int value, Endian endian, long resOffset, byte[] res)
	{
		VarHandle handle = switch(endian) {
			case BIG -> INT_VIEW_BIG_ENDIAN;
			case LITTLE -> INT_VIEW_LITTLE_ENDIAN;
			case AUTO -> INT_VIEW_AUTO_ENDIAN;
		};

		handle.set(res, resOffset, value);
	}
	
	public static void setFloat(float value, Endian endian, long resOffset, byte[] res)
	{
		VarHandle handle = switch(endian) {
			case BIG -> INT_VIEW_BIG_ENDIAN;
			case LITTLE -> INT_VIEW_LITTLE_ENDIAN;
			case AUTO -> INT_VIEW_AUTO_ENDIAN;
		};

		handle.set(res, resOffset, Float.floatToIntBits(value));
	}
	
	public static int getInt(long arrOffset, byte[] arr, Endian endian)
	{
		VarHandle handle = switch(endian) {
			case BIG -> INT_VIEW_BIG_ENDIAN;
			case LITTLE -> INT_VIEW_LITTLE_ENDIAN;
			case AUTO -> INT_VIEW_AUTO_ENDIAN;
		};

		return (int)handle.get(arr, arrOffset);
	}
	
	public static float getFloat(long arrOffset, byte[] arr, Endian endian)
	{
		VarHandle handle = switch(endian) {
			case BIG -> INT_VIEW_BIG_ENDIAN;
			case LITTLE -> INT_VIEW_LITTLE_ENDIAN;
			case AUTO -> INT_VIEW_AUTO_ENDIAN;
		};

		return Float.intBitsToFloat((int)handle.get(arr, arrOffset));
	}
}
