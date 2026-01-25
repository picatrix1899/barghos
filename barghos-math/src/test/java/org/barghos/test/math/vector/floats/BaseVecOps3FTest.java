package org.barghos.test.math.vector.floats;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;
import java.util.function.Supplier;

import org.barghos.math.vector.floats.BaseVecOps3F;
import org.junit.jupiter.api.Test;

public class BaseVecOps3FTest
{
	private static final int ARRAY_SIZE = 3;
	
	public void testFunc(float[] expectedResult, Supplier<float[]> resSup, Function<float[], float[]> func)
	{
		float[] res;
		float[] result;
		
		result = null;
		result = func.apply(res = resSup.get());
		
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
	}
	
	public void testFunc(float[] expectedResult, Function<float[], float[]> func)
	{
		float[] res;
		float[] result;
		
		result = null;
		result = func.apply(res = new float[ARRAY_SIZE]);
		
		assertSame(res, result);
		assertArrayEquals(expectedResult, result, 1.e-8f);
	}
	
	@Test
	public void add_test()
	{
		float aX = 1, aY = 2, aZ = 3;
		float bX = 4, bY = 5, bZ = 6;

		float[] expectedResult = new float[] {aX + bX, aY + bY, aZ + bZ};
		float[] expectedResultScalar = new float[] {aX + bX, aY + bX, aZ + bX};
		
		// Componentwise Operation
		testFunc(expectedResult, (res) -> BaseVecOps3F.add(new float[] {aX, aY, aZ}, new float[] {bX, bY, bZ}, res));
		testFunc(expectedResult, (res) -> BaseVecOps3F.add(new float[] {aX, aY, aZ}, bX, bY, bZ, res));
		testFunc(expectedResult, (res) -> BaseVecOps3F.add(aX, aY, aZ, new float[] {bX, bY, bZ}, res));
		testFunc(expectedResult, (res) -> BaseVecOps3F.add(aX, aY, aZ, bX, bY, bZ, res));
		
		// Scalar Operation
		testFunc(expectedResultScalar, (res) -> BaseVecOps3F.add(new float[] {aX, aY, aZ}, bX, res));
		
		// Self-Assign Componentwise Operation
		testFunc(expectedResult, () -> new float[] {aX, aY, aZ} , (res) -> BaseVecOps3F.addAssign(res, new float[] {bX, bY, bZ}));
		testFunc(expectedResult, () -> new float[] {aX, aY, aZ} , (res) -> BaseVecOps3F.addAssign(res, bX, bY, bZ));
		
		// Self-Assign Scalar Operation
		testFunc(expectedResultScalar, () -> new float[] {aX, aY, aZ} , (res) -> BaseVecOps3F.addAssign(res, bX));
	}
	
}
