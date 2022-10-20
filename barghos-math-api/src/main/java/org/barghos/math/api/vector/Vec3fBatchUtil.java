//package org.barghos.math.api.vector;
//
//import org.barghos.core.api.documentation.ExtractionParam;
//import org.barghos.core.api.documentation.MinLength;
//import org.barghos.core.api.math.BarghosMath;
//
///**
// * This class provides utilities for batch operations on 3-dimensional float vectors.
// * 
// * @author picatrix1899
// */
//public class Vec3fBatchUtil
//{
//	/**
//	 * Adds the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} to the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#add(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) + (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] addBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i0] + v2[i0];
//			res[i1] = v1[i1] + v2[i1];
//			res[i2] = v1[i2] + v2[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#add(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) + (v2x, v2y, v2z)}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] addBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = v1[i] + v2x;
//			res[i+1] = v1[i+1] + v2y;
//			res[i+2] = v1[i+2] + v2z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Adds the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} to the first given vector {@code (v1x, v1y, v1z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#add(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) + (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] addBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = v1x + v2[i];
//			res[i+1] = v1y + v2[i+1];
//			res[i+2] = v1z + v2[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Subtracts the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} from the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#sub(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) - (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] subBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i0] - v2[i0];
//			res[i1] = v1[i1] - v2[i1];
//			res[i2] = v1[i2] - v2[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#sub(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) - (v2x, v2y, v2z)}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] subBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = v1[i] - v2x;
//			res[i+1] = v1[i+1] - v2y;
//			res[i+2] = v1[i+2] - v2z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Subtracts the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} from the first given vector {@code (v1x, v1y, v1z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#sub(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) - (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] subBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = v1x - v2[i];
//			res[i+1] = v1y - v2[i+1];
//			res[i+2] = v1z - v2[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Subtracts the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} from the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#revSub(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * 
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] revSubBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v2[i0] - v1[i0];
//			res[i1] = v2[i1] - v1[i1];
//			res[i2] = v2[i2] - v1[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Subtracts the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} from the second given vector {@code (v2x, v2y, v2z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#revSub(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] revSubBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = v2x - v1[i];
//			res[i+1] = v2y - v1[i+1];
//			res[i+2] = v2z - v1[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Subtracts the first given vector {@code (v1x, v1y, v1z)} from the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#revSub(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] revSubBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = v2[i] - v1x;
//			res[i+1] = v2[i+1] - v1y;
//			res[i+2] = v2[i+2] - v1z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} with the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mul(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) * (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i0] * v2[i0];
//			res[i1] = v1[i1] * v2[i1];
//			res[i2] = v1[i2] * v2[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} with the second given vector {@code (v2x, v2y, v2z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mul(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) * (v2x, v2y, v2z)}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = v2x * v1[i];
//			res[i+1] = v2y * v1[i+1];
//			res[i+2] = v2z * v1[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the first given vector {@code (v1x, v1y, v1z)} with the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mul(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = v2[i] * v1x;
//			res[i+1] = v2[i+1] * v1y;
//			res[i+2] = v2[i+2] * v1z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Divides the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} by the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#div(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) / (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] divBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i0] / v2[i0];
//			res[i1] = v1[i1] / v2[i1];
//			res[i2] = v1[i2] / v2[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Divides the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} by the second given vector {@code (v2x, v2y, v2z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#div(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) / (v2x, v2y, v2z)}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] divBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = v1[i] / v2x;
//			res[i+1] = v1[i+1] / v2y;
//			res[i+2] = v1[i+2] / v2z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Divides the first given vector {@code (v1x, v1y, v1z)} by the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#div(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) / (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] divBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = v1x / v2[i];
//			res[i+1] = v1y / v2[i+1];
//			res[i+2] = v1z / v2[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Divides the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} by the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#revDiv(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2]) / (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] revDivBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v2[i0] / v1[i0];
//			res[i1] = v2[i1] / v1[i1];
//			res[i2] = v2[i2] / v1[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Divides the second given vector {@code (v2x, v2y, v2z)} by the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#revDiv(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2x, v2y, v2z) / (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] revDivBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = v2x / v1[i];
//			res[i+1] = v2y / v1[i+1];
//			res[i+2] = v2z / v1[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Divides the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} by the first given vector {@code (v1x, v1y, v1z)}
//	 * and saves the result in the given result array.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#revDiv(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It therefore can reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2]) / (v1x, v1y, v1z)}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] revDivBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = v2[i] / v1x;
//			res[i+1] = v2[i+1] / v1y;
//			res[i+2] = v2[i+2] / v1z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} with the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])},
//	 * adds the given vector {@code (v3[i*3+0], v3[i*3+1], v3[i*3+2])} to the product result and saves the result in the given result array
//	 * at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mulAdd(float[], float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2}, {@code v3} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) * (v2[i*3+0], v2[i*3+1], v2[i*3+2]) + (v3[i*3+0], v3[i*3+1], v3[i*3+2])}
//	 *
//	 * @param v1 The first array of multiplicant vectors. Minimum legth: 3.
//	 * @param v2 The second array of multiplicant vectors. Minimum legth: 3.
//	 * @param v3 The array of addend vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulAddBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i0] * v2[i0] + v3[i0];
//			res[i1] = v1[i1] * v2[i1] + v3[i1];
//			res[i2] = v1[i2] * v2[i2] + v3[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} with the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])},
//	 * adds the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the given result array
//	 * at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mulAdd(float[], float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) * (v2[i*3+0], v2[i*3+1], v2[i*3+2]) + (v3x, v3y, v3z)}
//	 * 
//	 * @param v1 The first array of multiplicant vectors. Minimum legth: 3.
//	 * @param v2 The second array of multiplicant vectors. Minimum legth: 3.
//	 * @param v3x The value of the x component of the addend vector.
//	 * @param v3y The value of the y component of the addend vector.
//	 * @param v3z The value of the z component of the addend vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulAddBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i0] * v2[i0] + v3x;
//			res[i1] = v1[i1] * v2[i1] + v3y;
//			res[i2] = v1[i2] * v2[i2] + v3z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} with the given vector {@code (v2x, v2y, v2z)},
//	 * adds the given vector {@code (v3[i*3+0], v3[i*3+1], v3[i*3+2])} to the product result and saves the result in the given result array
//	 * at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mulAdd(float[], float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v3} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) * (v2x, v2y, v2z) + (v3[i*3+0], v3[i*3+1], v3[i*3+2])}
//	 *
//	 * @param v1 The first array of multiplicant vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second multiplicant vector.
//	 * @param v2y The value of the y component of the second multiplicant vector.
//	 * @param v2z The value of the z component of the second multiplicant vector.
//	 * @param v3 The array of addend vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulAddBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i0] * v2x + v3[i0];
//			res[i1] = v1[i1] * v2y + v3[i1];
//			res[i2] = v1[i2] * v2z + v3[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} with the given vector {@code (v2x, v2y, v2z)},
//	 * adds the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the given result array
//	 * at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mulAdd(float[], float, float, float, float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
//	 *
//	 * @param v1 The first array of multiplicant vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second multiplicant vector.
//	 * @param v2y The value of the y component of the second multiplicant vector.
//	 * @param v2z The value of the z component of the second multiplicant vector.
//	 * @param v3x The value of the x component of the addend vector.
//	 * @param v3y The value of the y component of the addend vector.
//	 * @param v3z The value of the z component of the addend vector. 
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulAddBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i=0; i < v1.length; i+=3)
//		{
//			res[i] = v1[i] * v2x + v3x;
//			res[i+1] = v1[i+1] * v2y + v3y;
//			res[i+2] = v1[i+2] * v2z + v3z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])},
//	 * adds the given vector {@code (v3[i*3+0], v3[i*3+1], v3[i*3+2])} to the product result and saves the result in the given result array
//	 * at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mulAdd(float, float, float, float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2}, {@code v3} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) * (v2[i*3+0], v2[i*3+1], v2[i*3+2]) + (v3[i*3+0], v3[i*3+1], v3[i*3+2])}
//	 *
//	 * @param v1x The value of the x component of the first multiplicant vector.
//	 * @param v1y The value of the y component of the first multiplicant vector.
//	 * @param v1z The value of the z component of the first multiplicant vector.
//	 * @param v2 The second array of multiplicant vectors. Minimum legth: 3.
//	 * @param v3 The array of addend vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulAddBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v2.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1x * v2[i0] + v3[i0];
//			res[i1] = v1y * v2[i1] + v3[i1];
//			res[i2] = v1z * v2[i2] + v3[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])},
//	 * adds the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the given result array
//	 * at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mulAdd(float[], float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) * (v2[i*3+0], v2[i*3+1], v2[i*3+2]) + (v3x, v3y, v3z)}
//	 *
//	 * @param v1x The value of the x component of the first multiplicant vector.
//	 * @param v1y The value of the y component of the first multiplicant vector.
//	 * @param v1z The value of the z component of the first multiplicant vector.
//	 * @param v2 The second array of multiplicant vectors. Minimum legth: 3.
//	 * @param v3x The value of the x component of the addend vector.
//	 * @param v3y The value of the y component of the addend vector.
//	 * @param v3z The value of the z component of the addend vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulAddBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = v1x * v2[i] + v3x;
//			res[i+1] = v1y * v2[i+1] + v3y;
//			res[i+2] = v1z * v2[i+2] + v3z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2x, v2y, v2z)},
//	 * adds the given vector {@code (v3[i*3+0], v3[i*3+1], v3[i*3+2])} to the product result and saves the result in the given result array
//	 * at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#mulAdd(float[], float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v3} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3[i*3+0], v3[i*3+1], v3[i*3+2])}
//	 *
//	 * @param v1x The value of the x component of the first multiplicant vector.
//	 * @param v1y The value of the y component of the first multiplicant vector.
//	 * @param v1z The value of the z component of the first multiplicant vector.
//	 * @param v2x The value of the x component of the second multiplicant vector.
//	 * @param v2y The value of the y component of the second multiplicant vector.
//	 * @param v2z The value of the z component of the second multiplicant vector.
//	 * @param v3 The array of addend vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] mulAddBatch(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v3.length; i+=3)
//		{
//			res[i] = v1x * v2x + v3[i];
//			res[i+1] = v1y * v2y + v3[i+1];
//			res[i+2] = v1z * v2z + v3[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the inverse (reciprocal) length (magnitude, norm) of the given vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#inverseLength(float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v} the result is a single value in the result array. That means that {@code v} has to have three times the amount of entries
//	 * than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(v[i*3+0], v[i*3+1], v[i*3+2])|}
//	 * 
//	 * @param v The array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] inverseLengthBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(1) float[] res)
//	{
//		for(int i=0, j=0; i < v.length; i+=3, j++)
//		{
//			res[j] = 1.0f / BarghosMath.sqrt(v[i] * v[i] + v[i+1] * v[i+1] + v[i+2] * v[i+2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the inverse (reciprocal) distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the two vectors are the same this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#inverseDistance(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] inverseDistanceBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2[i] - v1[i];
//			y = v2[i+1] - v1[i+1];
//			z = v2[i+2] - v1[i+2];
//			
//			res[j] = 1.0f / BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the inverse (reciprocal) distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2x, v2y, v2z)} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the two vectors are the same this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#inverseDistance(float[], float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] inverseDistanceBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2x - v1[i];
//			y = v2y - v1[i+1];
//			z = v2z - v1[i+2];
//			
//			res[j] = 1.0f / BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the inverse (reciprocal) distance between the given vector {@code (v1x, v1y, v1z)}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the two vectors are the same this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#inverseDistance(float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)|}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] inverseDistanceBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v2.length; i+=3, j++)
//		{
//			x = v2[i] - v1x;
//			y = v2[i+1] - v1y;
//			z = v2[i+2] - v1z;
//			
//			res[j] = 1.0f / BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the length (magnitude, norm) of the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#lengthUnsafe(float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v} the result is a single value in the result array. That means that {@code v} has to have three times the amount of entries
//	 * than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v[i*3+0], v[i*3+1], v[i*3+2])|}
//	 * 
//	 * @param v The array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] lengthUnsafeBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(1) float[] res)
//	{
//		for(int i = 0, j=0; i < v.length; i+=3, j++)
//		{
//			res[j] = BarghosMath.sqrt(v[i] * v[i] + v[i+1] * v[i+1] + v[i+2] * v[i+2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distanceUnsafe(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceUnsafeBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i = 0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2[i] - v1[i];
//			y = v2[i+1] - v1[i+1];
//			z = v2[i+2] - v1[i+2];
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and the given vector {@code (v2x, v2y, v2z)}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distanceUnsafe(float[], float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2x, v2x) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceUnsafeBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i = 0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2x - v1[i];
//			y = v2y - v1[i+1];
//			z = v2z - v1[i+2];
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distanceUnsafe(float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)|}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceUnsafeBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i = 0, j=0; i < v2.length; i+=3, j++)
//		{
//			x = v2[i] - v1x;
//			y = v2[i+1] - v1y;
//			z = v2[i+2] - v1z;
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the length (magnitude, norm) of the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are exactly zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#length(float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v} the result is a single value in the result array. That means that {@code v} has to have three times the amount of entries
//	 * than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v[i*3+0], v[i*3+1], v[i*3+2])|}
//	 * 
//	 * @param v The array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] lengthBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(1) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2, j=0; i0 < v.length; i0+=3, i1+=3, i2+=3, j++)
//		{
//			if(	v[i0] == 0.0f &&
//				v[i1] == 0.0f &&
//				v[i2] == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(v[i0] * v[i0] + v[i1] * v[i1] + v[i2] * v[i2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and the given vector (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distance(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2[i] - v1[i];
//			y = v2[i+1] - v1[i+1];
//			z = v2[i+2] - v1[i+2];
//			
//			if(	x == 0.0f &&
//				y == 0.0f &&
//				z == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and the given vector (v2x, v2y, v2z)}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distance(float[], float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2x - v1[i];
//			y = v2y - v1[i+1];
//			z = v2z - v1[i+2];
//			
//			if(	x == 0.0f &&
//				y == 0.0f &&
//				z == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector (v1x, v1y, v1z)} and the given vector (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distance(float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)|}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v2.length; i+=3, j++)
//		{
//			x = v2[i] - v1x;
//			y = v2[i+1] - v1y;
//			z = v2[i+2] - v1z;
//			
//			if(	x == 0.0f &&
//				y == 0.0f &&
//				z == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the length (magnitude, norm) of the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#length(float[], float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v} the result is a single value in the result array. That means that {@code v} has to have three times the amount of entries
//	 * than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v[i*3+0], v[i*3+1], v[i*3+2])|}
//	 * 
//	 * @param v The array of vectors. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] lengthBatch(@MinLength(3) float[] v, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2, j=0; i0 < v.length; i0+=3, i1+=3, i2+=3, j++)
//		{
//			if(	Math.abs(v[i0]) <= tolerance &&
//				Math.abs(v[i1]) <= tolerance &&
//				Math.abs(v[i2]) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(v[i0] * v[i0] + v[i1] * v[i1] + v[i2] * v[i2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distance(float[], float[], float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2[0] - v1[0];
//			y = v2[1] - v1[1];
//			z = v2[2] - v1[2];
//			
//			if(	Math.abs(x) <= tolerance &&
//				Math.abs(y) <= tolerance &&
//				Math.abs(z) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and the given vector {@code (v2x, v2y, v2z)}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distance(float[], float, float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2x - v1[0];
//			y = v2y - v1[1];
//			z = v2z - v1[2];
//			
//			if(	Math.abs(x) <= tolerance &&
//				Math.abs(y) <= tolerance &&
//				Math.abs(z) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#distance(float, float, float, float[], float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)|}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] distanceBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v2.length; i+=3, j++)
//		{
//			x = v2[0] - v1x;
//			y = v2[1] - v1y;
//			z = v2[2] - v1z;
//			
//			if(	Math.abs(x) <= tolerance &&
//				Math.abs(y) <= tolerance &&
//				Math.abs(z) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = BarghosMath.sqrt(x * x + y * y + z * z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared length (magnitude, norm) of the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredLengthUnsafe(float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v} the result is a single value in the result array. That means that {@code v} has to have three times the amount of entries
//	 * than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v[i*3+0], v[i*3+1], v[i*3+2])|^2}
//	 * 
//	 * @param v The array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredLengthUnsafeBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(1) float[] res)
//	{
//		for(int i=0, j=0; i < v.length; i+=3, j++)
//		{
//			res[j] = v[i] * v[i] + v[i+1] * v[i+1] + v[i+2] * v[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and
//	 * the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistanceUnsafe(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|^2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceUnsafeBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2[i] - v1[i];
//			y = v2[i+1] - v1[i+1];
//			z = v2[i+2] - v1[i+2];
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} and
//	 * the given vector {@code (v2x, v2y, v2z)} and safes the result in the result array at the index {@code i}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistanceUnsafe(float[], float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|^2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceUnsafeBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2x - v1[i];
//			y = v2y - v1[i+1];
//			z = v2z - v1[i+2];
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1x, v1y, v1z)} and
//	 * the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistanceUnsafe(float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)|^2}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceUnsafeBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v2.length; i+=3, j++)
//		{
//			x = v2[i] - v1x;
//			y = v2[i+1] - v1y;
//			z = v2[i+2] - v1z;
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared length (magnitude, norm) of the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are exactly zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredLength(float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v} the result is a single value in the result array. That means that {@code v} has to have three times the amount of entries
//	 * than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v[i*3+0], v[i*3+1], v[i*3+2])|^2}
//	 * 
//	 * @param v The array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredLengthBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(1) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2, j=0; i0 < v.length; i0+=3, i1+=3, i2+=3, j++)
//		{
//			if(	v[i0] == 0.0f &&
//				v[i1] == 0.0f &&
//				v[i2] == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = v[i0] * v[i0] + v[i1] * v[i1] + v[i2] * v[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistance(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|^2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2[i] - v1[i];
//			y = v2[i+1] - v1[i+1];
//			z = v2[i+2] - v1[i+2];
//			
//			if(	x == 0.0f &&
//				y == 0.0f &&
//				z == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2x, v2y, v2z)} and safes the result in the result array at the index {@code i}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistance(float[], float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|^2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2x - v1[i];
//			y = v2y - v1[i+1];
//			z = v2z - v1[i+2];
//			
//			if(	x == 0.0f &&
//				y == 0.0f &&
//				z == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1x, v1y, v1z)}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistance(float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)|^2}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v2.length; i+=3, j++)
//		{
//			x = v2[i] - v1x;
//			y = v2[i+1] - v1y;
//			z = v2[i+2] - v1z;
//			
//			if(	x == 0.0f &&
//				y == 0.0f &&
//				z == 0.0f)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared length (magnitude, norm) of the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and
//	 * safes the result in the result array at the index {@code i}.
//	 * If the vector is a zero-vector the result will be zero.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredLength(float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v} the result is a single value in the result array. That means that {@code v} has to have three times the amount of entries
//	 * than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v[i*3+0], v[i*3+1], v[i*3+2])|^2}
//	 * 
//	 * @param v The array of vectors. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredLengthBatch(@MinLength(3) float[] v, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2, j=0; i0 < v.length; i0+=3, i1+=3, i2+=3, j++)
//		{
//			if(	Math.abs(v[i0]) <= tolerance &&
//				Math.abs(v[i1]) <= tolerance &&
//				Math.abs(v[i2]) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = v[i0] * v[i0] + v[i1] * v[i1] + v[i2] * v[i2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistance(float[], float[], float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|^2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2[0] - v1[0];
//			y = v2[1] - v1[1];
//			z = v2[2] - v1[2];
//			
//			if(	Math.abs(x) <= tolerance &&
//				Math.abs(y) <= tolerance &&
//				Math.abs(z) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistance(float[], float, float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2])|^2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v1.length; i+=3, j++)
//		{
//			x = v2x - v1[0];
//			y = v2y - v1[1];
//			z = v2z - v1[2];
//			
//			if(	Math.abs(x) <= tolerance &&
//				Math.abs(y) <= tolerance &&
//				Math.abs(z) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the squared distance between the given vector {@code (v1x, v1y, v1z)}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#squaredDistance(float, float, float, float[], float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z)|^2}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] squaredDistanceBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float tolerance, @ExtractionParam @MinLength(1) float[] res)
//	{
//		float x, y, z;
//		for(int i=0, j=0; i < v2.length; i+=3, j++)
//		{
//			x = v2[0] - v1x;
//			y = v2[1] - v1y;
//			z = v2[2] - v1z;
//			
//			if(	Math.abs(x) <= tolerance &&
//				Math.abs(y) <= tolerance &&
//				Math.abs(z) <= tolerance)
//			{
//				res[j] = 0.0f;
//				continue;
//			}
//			
//			res[j] = x * x + y * y + z * z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the half vector from the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} to the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#halfVector(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1[i*3+0], v1[i*3+1], v1[i*3+2]) ) / 2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] halfVectorBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = (v2[i0] - v1[i0]) * 0.5f;
//			res[i1] = (v2[i1] - v1[i1]) * 0.5f;
//			res[i2] = (v2[i2] - v1[i2]) * 0.5f;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the half vector from the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])} to the given vector {@code (v2x, v2y, v2z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#halfVector(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2x, v2y, v2z) - (v1[i*3+0], v1[i*3+1], v1[i*3+2]) ) / 2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] halfVectorBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i=0; i < v1.length; i+=3)
//		{
//			res[i] = (v2x - v1[i]) * 0.5f;
//			res[i+1] = (v2y - v1[i+1]) * 0.5f;
//			res[i+2] = (v2z - v1[i+2]) * 0.5f;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the half vector from the given vector {@code (v1x, v1y, v1z)} to the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#halfVector(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2[i*3+0], v2[i*3+1], v2[i*3+2]) - (v1x, v1y, v1z) ) / 2}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] halfVectorBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i=0; i < v2.length; i+=3)
//		{
//			res[i] = (v2[i] - v1x) * 0.5f;
//			res[i+1] = (v2[i+1] - v1y) * 0.5f;
//			res[i+2] = (v2[i+2] - v1z) * 0.5f;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#halfPoint(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2[i*3+0], v2[i*3+1], v2[i*3+2]) + (v1[i*3+0], v1[i*3+1], v1[i*3+2]) ) / 2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] halfPointBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = (v2[i0] + v1[i0]) * 0.5f;
//			res[i1] = (v2[i1] + v1[i1]) * 0.5f;
//			res[i2] = (v2[i2] + v1[i2]) * 0.5f;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2x, v2y, v2z)} and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#halfPoint(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2x, v2y, v2z) + (v1[i*3+0], v1[i*3+1], v1[i*3+2]) ) / 2}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] halfPointBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i=0; i < v1.length; i+=3)
//		{
//			res[i] = (v2x + v1[i]) * 0.5f;
//			res[i+1] = (v2y + v1[i+1]) * 0.5f;
//			res[i+2] = (v2z + v1[i+2]) * 0.5f;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1x, v1y, v1z)}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#halfPoint(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2[i*3+0], v2[i*3+1], v2[i*3+2]) + (v1x, v1y, v1z) ) / 2}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] halfPointBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i=0; i < v2.length; i+=3)
//		{
//			res[i] = (v2[i] + v1x) * 0.5f;
//			res[i+1] = (v2[i+1] + v1y) * 0.5f;
//			res[i+2] = (v2[i+2] + v1z) * 0.5f;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#minVector(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min( (v1[i*3+0], v1[i*3+1], v1[i*3+2]), (v2[i*3+0], v2[i*3+1], v2[i*3+2]) )}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] minVectorBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = Math.min(v1[i0], v2[i0]);
//			res[i1] = Math.min(v1[i1], v2[i1]);
//			res[i2] = Math.min(v1[i2], v2[i2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2x, v2y, v2z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#minVector(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min( (v1[i*3+0], v1[i*3+1], v1[i*3+2]), (v2x, v2y, v2z) )}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] minVectorBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = Math.min(v1[i], v2x);
//			res[i+1] = Math.min(v1[i+1], v2y);
//			res[i+2] = Math.min(v1[i+2], v2z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1x, v1y, v1z)}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#minVector(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min( (v1x, v1y, v1z), (v2[i*3+0], v2[i*3+1], v2[i*3+2]) )}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] minVectorBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = Math.min(v1x, v2[i]);
//			res[i+1] = Math.min(v1y, v2[i+1]);
//			res[i+2] = Math.min(v1z, v2[i+2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#maxVector(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max( (v1[i*3+0], v1[i*3+1], v1[i*3+2]), (v2[i*3+0], v2[i*3+1], v2[i*3+2]) )}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] maxVectorBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = Math.max(v1[i0], v2[i0]);
//			res[i1] = Math.max(v1[i1], v2[i1]);
//			res[i2] = Math.max(v1[i2], v2[i2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the given vector {@code (v2x, v2y, v2z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#maxVector(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max( (v1[i*3+0], v1[i*3+1], v1[i*3+2]), (v2x, v2y, v2z) )}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] maxVectorBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i+=3)
//		{
//			res[i] = Math.max(v1[i], v2x);
//			res[i+1] = Math.max(v1[i+1], v2y);
//			res[i+2] = Math.max(v1[i+2], v2z);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1x, v1y, v1z)}
//	 * and the given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#maxVector(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max( (v1x, v1y, v1z), (v2[i*3+0], v2[i*3+1], v2[i*3+2]) )}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] maxVectorBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i+=3)
//		{
//			res[i] = Math.max(v1x, v2[i]);
//			res[i+1] = Math.max(v1y, v2[i+1]);
//			res[i+2] = Math.max(v1z, v2[i+2]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Normalizes the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and saves the result in the
//	 * given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * Normalization is done by dividing the vector by its length (magnitude, norm).
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this will result in a division by zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#normalizeUnsafe(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v[i*3+0], v[i*3+1], v[i*3+2]) / |(v[i*3+0], v[i*3+1], v[i*3+2])|}
//	 * 
//	 * @param v The array of the vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] normalizeUnsafeBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
//	{
//		float invLength;
//		for(int i0=0, i1=1, i2=2; i1 < v.length; i0+=3, i1+=3, i2+=3)
//		{
//			invLength = 1.0f / BarghosMath.sqrt(v[i0] * v[i0] + v[i1] * v[i1] + v[i2] * v[i2]);
//		
//			res[i0] = v[i0] * invLength;
//			res[i1] = v[i1] * invLength;
//			res[i2] = v[i2] * invLength;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Normalizes the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and saves the result in the
//	 * given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * Normalization is done by dividing the vector by its length (magnitude, norm).
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be a zero-vector.
//	 * It determines a length of zero by checking if all components are exactly zero.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#normalize(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v[i*3+0], v[i*3+1], v[i*3+2]) / |(v[i*3+0], v[i*3+1], v[i*3+2])|}
//	 * 
//	 * @param v The array of the vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] normalizeBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
//	{
//		float invLength;
//		for(int i0=0, i1=1, i2=2; i1 < v.length; i0+=3, i1+=3, i2+=3)
//		{
//			if(	v[i0] == 0.0f &&
//				v[i1] == 0.0f &&
//				v[i2] == 0.0f)
//			{
//				res[i0] = 0.0f;
//				res[i1] = 0.0f;
//				res[i2] = 0.0f;
//				
//				continue;
//			}
//			
//			invLength = 1.0f / BarghosMath.sqrt(v[i0] * v[i0] + v[i1] * v[i1] + v[i2] * v[i2]);
//		
//			res[i0] = v[i0] * invLength;
//			res[i1] = v[i1] * invLength;
//			res[i2] = v[i2] * invLength;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Normalizes the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and saves the result in the
//	 * given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * Normalization is done by dividing the vector by its length (magnitude, norm).
//	 * If the vector is a zero-vector the result will be a zero-vector.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#normalize(float[], float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v[i*3+0], v[i*3+1], v[i*3+2]) / |(v[i*3+0], v[i*3+1], v[i*3+2])|}
//	 * 
//	 * @param v The array of the vectors. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin around zero. Must be positive.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] normalizeBatch(@MinLength(3) float[] v, float tolerance, @ExtractionParam @MinLength(3) float[] res)
//	{
//		float invLength;
//		for(int i0=0, i1=1, i2=2; i1 < v.length; i0+=3, i1+=3, i2+=3)
//		{
//			if(	BarghosMath.abs(v[i0]) <= tolerance &&
//				BarghosMath.abs(v[i1]) <= tolerance &&
//				BarghosMath.abs(v[i2]) <= tolerance)
//			{
//				res[i0] = 0.0f;
//				res[i1] = 0.0f;
//				res[i2] = 0.0f;
//				
//				return res;
//			}
//			
//			invLength = 1.0f / BarghosMath.sqrt(v[i0] * v[i0] + v[i1] * v[i1] + v[i2] * v[i2]);
//		
//			res[i0] = v[i0] * invLength;
//			res[i1] = v[i1] * invLength;
//			res[i2] = v[i2] * invLength;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Negates the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and saves the result in the
//	 * given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#negate(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code -(v[i*3+0], v[i*3+1], v[i*3+2])}
//	 * 
//	 * @param v The array of the vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] negateBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i=0; i < v.length; i+=3)
//		{
//			res[i] = -v[i];
//			res[i+1] = -v[i+1];
//			res[i+2] = -v[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the inverse of the vector {@code (v[i*3+0], v[i*3+1], v[i*3+2])} and saves the result in the
//	 * given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#inverse(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code -(v[i*3+0], v[i*3+1], v[i*3+2])}
//	 * 
//	 * @param v The array of the vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] inverseBatch(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i=0; i < v.length; i+=3)
//		{
//			res[i] = 1.0f / v[i];
//			res[i+1] = 1.0f / v[i+1];
//			res[i+2] = 1.0f / v[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the dot product (scalar product) between the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#dot(float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} and {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) . (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] dotBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i++)
//		{
//			res[i] = v1[i] * v2[i] + v1[i+1] * v2[i+1] + v1[i+2] * v2[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the dot product (scalar product) between the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the second given vector {@code (v2x, v2y, v2z)} and safes the result in the result array at the index {@code i}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#dot(float[], float, float, float)}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v1} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) . (v2x, v2y, v2z)}
//	 * 
//	 * @param v1 The array of the first vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] dotBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v1.length; i++)
//		{
//			res[i] = v1[i] * v2x + v1[i+1] * v2y + v1[i+2] * v2z;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the dot product (scalar product) between the first given vector {@code (v1x, v1y, v1z)}
//	 * and the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])} and safes the result in the result array at the index {@code i}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#dot(float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} has to be equal to the amount of values in {@code res}. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * For each vector in {@code v2} the result is a single value in the result array. That means that {@code v1} and {@code v2}
//	 * have to have three times the amount of entries than the result array {@code res}.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) . (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The array of the second vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 1.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] dotBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i = 0; i < v2.length; i++)
//		{
//			res[i] = v1x * v2[i] + v1y * v2[i+1] + v1z * v2[i+2];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the cross product between the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#cross(float[], float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1}, {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) X (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] crossBatch(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i1] * v2[i2] - v1[i2] * v2[i1];
//			res[i1] = v1[i2] * v2[i0] - v1[i0] * v2[i2];
//			res[i2] = v1[i0] * v2[i1] - v1[i1] * v2[i0];
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the cross product between the first given vector {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2])}
//	 * and the second given vector {@code (v2x, v2y, v2z)}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#cross(float[], float, float, float, float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v1} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[i*3+0], v1[i*3+1], v1[i*3+2]) X (v2x, v2y, v2z)}
//	 * 
//	 * @param v1 The first array of vectors. Minimum legth: 3.
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] crossBatch(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v1.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1[i1] * v2z - v1[i2] * v2y;
//			res[i1] = v1[i2] * v2x - v1[i0] * v2z;
//			res[i2] = v1[i0] * v2y - v1[i1] * v2x;
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)}
//	 * and the second given vector {@code (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * and saves the result in the given result array at the indices {@code (i*3+0, i*3+1, i*3+2)}.
//	 * 
//	 * <p>
//	 * This is a batch-processing version of {@link Vec3fUtil#cross(float, float, float, float[], float[])}. It therefore is designed to handle more than one vector.
//	 * The amount of vectors in array {@code v2} and {code res} have to be equal. The x, y and z components of each vector are
//	 * expected to be on the indices {@code i*3+0, i*3+1 and i*3+2}. Therefore the amount of entries has to be a multiple of 3 but at least 3 entries.
//	 * 
//	 * <p>
//	 * The batch-processing allows to do masses of calculations in one single function call.
//	 * It can therefore reduce the function stack allocations and deallocations for n operations to 1 allocation and 1 deallocation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y, v1z) X (v2[i*3+0], v2[i*3+1], v2[i*3+2])}
//	 * 
//	 * @param v1x The value of the x component of the first vector.
//	 * @param v1y The value of the y component of the first vector.
//	 * @param v1z The value of the z component of the first vector.
//	 * @param v2 The second array of vectors. Minimum legth: 3.
//	 * @param res The result array. Minimum legth: 3.
//	 * 
//	 * @return The result array with the results.
//	 */
//	public static float[] crossBatch(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		for(int i0=0, i1=1, i2=2; i0 < v2.length; i0+=3, i1+=3, i2+=3)
//		{
//			res[i0] = v1y * v2[i2] - v1z * v2[i1];
//			res[i1] = v1z * v2[i0] - v1x * v2[i2];
//			res[i2] = v1x * v2[i1] - v1y * v2[i0];
//		}
//		
//		return res;
//	}
//}
