package org.barghos.test.math.vector.floats;

import static org.junit.jupiter.api.Assertions.*;

import org.barghos.math.vector.floats.BaseVecOps2F;
import org.junit.jupiter.api.Test;

public class BaseVecOps2FTest
{
	private static final int ARRAY_SIZE = 2;
	
	@Test
	public void add_test()
	{
		float aX = 1, aY = 2;
		float bX = 3, bY = 4;
		
		float[] res;
		float[] result;
		
		float[] expectedResult = new float[] {aX + bX, aY + bY};
		float[] expectedResultScalar = new float[] {aX + bX, aY + bX};
		
		// Componentwise Operation
		result = null;
		result = BaseVecOps2F.add(new float[] {aX, aY}, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.add(new float[] {aX, aY}, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.add(aX, aY, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.add(aX, aY, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		// Scalar Operation
		result = null;
		result = BaseVecOps2F.add(new float[] {aX, aY}, bX, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
		
		// Self-Assign Componentwise Operation
		result = null;
		result = BaseVecOps2F.addAssign(res = new float[] {aX, aY}, new float[] {bX, bY});
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.addAssign(res = new float[] {aX, aY}, bX, bY);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);

		// Self-Assign Scalar Operation
		result = null;
		result = BaseVecOps2F.addAssign(res = new float[] {aX, aY}, bX);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
	}
	
	@Test
	public void sub_test()
	{
		float aX = 1, aY = 2;
		float bX = 3, bY = 4;
		
		float[] res;
		float[] result;
		
		float[] expectedResult = new float[] {aX - bX, aY - bY};
		float[] expectedResultScalar = new float[] {aX - bX, aY - bX};
		
		// Componentwise Operation
		result = null;
		result = BaseVecOps2F.sub(new float[] {aX, aY}, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.sub(new float[] {aX, aY}, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.sub(aX, aY, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.sub(aX, aY, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		// Scalar Operation
		result = null;
		result = BaseVecOps2F.sub(new float[] {aX, aY}, bX, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
		
		// Self-Assign Componentwise Operation
		result = null;
		result = BaseVecOps2F.subAssign(res = new float[] {aX, aY}, new float[] {bX, bY});
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.subAssign(res = new float[] {aX, aY}, bX, bY);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);

		// Self-Assign Scalar Operation
		result = null;
		result = BaseVecOps2F.subAssign(res = new float[] {aX, aY}, bX);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
	}
	
	@Test
	public void revSub_test()
	{
		float aX = 1, aY = 2;
		float bX = 3, bY = 4;
		
		float[] res;
		float[] result;
		
		float[] expectedResult = new float[] {bX - aX, bY - aY};
		float[] expectedResultScalar = new float[] {bX - aX, bX - aY};
		
		// Componentwise Operation
		result = null;
		result = BaseVecOps2F.revSub(new float[] {aX, aY}, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revSub(new float[] {aX, aY}, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revSub(aX, aY, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revSub(aX, aY, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		// Scalar Operation
		result = null;
		result = BaseVecOps2F.revSub(new float[] {aX, aY}, bX, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
		
		// Self-Assign Componentwise Operation
		result = null;
		result = BaseVecOps2F.revSubAssign(res = new float[] {aX, aY}, new float[] {bX, bY});
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revSubAssign(res = new float[] {aX, aY}, bX, bY);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);

		// Self-Assign Scalar Operation
		result = null;
		result = BaseVecOps2F.revSubAssign(res = new float[] {aX, aY}, bX);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
	}
	
	@Test
	public void mul_test()
	{
		float aX = 1, aY = 2;
		float bX = 3, bY = 4;
		
		float[] res;
		float[] result;
		
		float[] expectedResult = new float[] {aX * bX, aY * bY};
		float[] expectedResultScalar = new float[] {aX * bX, aY * bX};
		
		// Componentwise Operation
		result = null;
		result = BaseVecOps2F.mul(new float[] {aX, aY}, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.mul(new float[] {aX, aY}, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.mul(aX, aY, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.mul(aX, aY, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		// Scalar Operation
		result = null;
		result = BaseVecOps2F.mul(new float[] {aX, aY}, bX, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
		
		// Self-Assign Componentwise Operation
		result = null;
		result = BaseVecOps2F.mulAssign(res = new float[] {aX, aY}, new float[] {bX, bY});
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.mulAssign(res = new float[] {aX, aY}, bX, bY);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);

		// Self-Assign Scalar Operation
		result = null;
		result = BaseVecOps2F.mulAssign(res = new float[] {aX, aY}, bX);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
	}
	
	@Test
	public void div_test()
	{
		float aX = 1, aY = 2;
		float bX = 3, bY = 4;
		
		float[] res;
		float[] result;
		
		float[] expectedResult = new float[] {aX / bX, aY / bY};
		float[] expectedResultScalar = new float[] {aX / bX, aY / bX};
		
		// Componentwise Operation
		result = null;
		result = BaseVecOps2F.div(new float[] {aX, aY}, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.div(new float[] {aX, aY}, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.div(aX, aY, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.div(aX, aY, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		// Scalar Operation
		result = null;
		result = BaseVecOps2F.div(new float[] {aX, aY}, bX, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
		
		// Self-Assign Componentwise Operation
		result = null;
		result = BaseVecOps2F.divAssign(res = new float[] {aX, aY}, new float[] {bX, bY});
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.divAssign(res = new float[] {aX, aY}, bX, bY);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);

		// Self-Assign Scalar Operation
		result = null;
		result = BaseVecOps2F.divAssign(res = new float[] {aX, aY}, bX);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
	}
	
	@Test
	public void revDiv_test()
	{
		float aX = 1, aY = 2;
		float bX = 3, bY = 4;
		
		float[] res;
		float[] result;
		
		float[] expectedResult = new float[] {bX / aX, bY / aY};
		float[] expectedResultScalar = new float[] {bX / aX, bX / aY};
		
		// Componentwise Operation
		result = null;
		result = BaseVecOps2F.revDiv(new float[] {aX, aY}, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revDiv(new float[] {aX, aY}, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revDiv(aX, aY, new float[] {bX, bY}, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revDiv(aX, aY, bX, bY, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		// Scalar Operation
		result = null;
		result = BaseVecOps2F.revDiv(new float[] {aX, aY}, bX, res = new float[ARRAY_SIZE]);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
		
		// Self-Assign Componentwise Operation
		result = null;
		result = BaseVecOps2F.revDivAssign(res = new float[] {aX, aY}, new float[] {bX, bY});
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
		
		result = null;
		result = BaseVecOps2F.revDivAssign(res = new float[] {aX, aY}, bX, bY);
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);

		// Self-Assign Scalar Operation
		result = null;
		result = BaseVecOps2F.revDivAssign(res = new float[] {aX, aY}, bX);
		assertSame(res, result);
		assertArrayEquals(expectedResultScalar, result, 1.e-8f);
	}
	
}
