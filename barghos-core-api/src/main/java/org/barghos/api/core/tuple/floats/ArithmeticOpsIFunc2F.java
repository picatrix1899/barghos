package org.barghos.api.core.tuple.floats;

import org.barghos.api.core.consumer.floats.ICons2F;
import org.barghos.api.core.function.floats.IFunc2F;
import org.barghos.api.core.supplier.floats.ISuppFA;
import org.barghos.api.core.supplier.floats.ISuppF;

public class ArithmeticOpsIFunc2F
{
	private ArithmeticOpsIFunc2F() { }
	
	public static float[] tup_add_2f(float[] v1, ISuppFA v2)
	{
		return v1;
	}
	
	public static float[] tup_add_2f(float[] v1, ISuppF v2V0, ISuppF v2V1)
	{
		return v1;
	}
	
	public static <T> T tup_addT_func2f(float[] v1, float[] v2, IFunc2F<T> func)
	{
		return func.apply(0, 0);
	}
	
	public static void tup_addT_func2f(float[] v1, float[] v2, ICons2F cons)
	{
		cons.accept(0, 0);
	}
}
