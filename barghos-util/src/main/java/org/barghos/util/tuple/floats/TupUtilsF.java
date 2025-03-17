package org.barghos.util.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.Nullable;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.math.MathUtils;

/**
 * This class provides tuple operations for n dimensions.
 */
public class TupUtilsF
{

	/**
	 * Adds each component value of the second vector {@code v2} to the value of
	 * the same component of the first vector {@code v1} and saves the result in
	 * the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 + v2}<br>
	 * <br>
	 * {@code res[0] = (v1.v0 + v2.v0)}<br>
	 * {@code res[1] = (v1.v1 + v2.v1)}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] add(TupRF v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) + v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Adds each component value of the second vector {@code (v2[0], v2[1])} to
	 * the value of the same component of the first vector {@code v1} and saves
	 * the result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v2} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 + (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res[0] = (v1.v0 + v2[0])}<br>
	 * {@code res[1] = (v1.v1 + v2[1])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] add(TupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) + v2[i];
		}
		
		return res;
	}

	/**
	 * Adds each component value of the second vector {@code v2} to
	 * the value of the same component of the first vector
	 * {@code (v1[0], v1[1])} and saves the result in the given extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v1} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) + v2}<br>
	 * <br>
	 * {@code res[0] = (v1[0] + v2.v0)}<br>
	 * {@code res[1] = (v1[1] + v2.v1)}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] add(float[] v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] + v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Adds each component value of the second vector {@code (v2[0], v2[1])} to
	 * the value of the same component of the first vector
	 * {@code (v1[0], v1[1])} and saves the result in the given extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * The arrays {@code v1} and {@code v2} representing 2-dimensional vectors
	 * are required to have at least two entries. Only the values at the indices
	 * 0 and 1 are used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) + (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res[0] = (v1[0] + v2[0])}<br>
	 * {@code res[1] = (v1[1] + v2[1])}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] add(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] + v2[i];
		}
		
		return res;
	}
	
	/**
	 * Adds each component value of the second vector {@code v2} to the value of
	 * the same component of the first vector {@code v1} and saves the result in
	 * the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 + v2}<br>
	 * <br>
	 * {@code res.v0 = (v1.v0 + v2.v0)}<br>
	 * {@code res.v1 = (v1.v1 + v2.v1)}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T add(TupRF v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) + v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Adds each component value of the second vector {@code (v2[0], v2[1])} to
	 * the value of the same component of the first vector {@code v1} and saves
	 * the result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v2} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 + (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res.v0 = (v1.v0 + v2[0])}<br>
	 * {@code res.v1 = (v1.v1 + v2[1])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T add(TupRF v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) + v2[i]);
		}
		
		return res;
	}

	/**
	 * Adds each component value of the second vector {@code v2} to the value of
	 * the same component of the first vector {@code (v1[0], v1[1])} and saves
	 * the result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v1} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) + v2}<br>
	 * <br>
	 * {@code res.v0 = (v1[0] + v2.v0)}<br>
	 * {@code res.v1 = (v1[1] + v2.v1)}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T add(float[] v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] + v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Adds each component value of the second vector {@code (v2[0], v2[1])} to
	 * the value of the same component of the first vector
	 * {@code (v1[0], v1[1])} and saves the result in the given extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * The arrays {@code v1} and {@code v2} representing 2-dimensional vectors
	 * are required to have at least two entries. Only the values at the indices
	 * 0 and 1 are used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) + (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res.v0 = (v1[0] + v2[0])}<br>
	 * {@code res.v1 = (v1[1] + v2[1])}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T add(float[] v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] + v2[i]);
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector {@code v2} from the
	 * value of the same component of the first vector {@code v1} and saves the
	 * result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 - v2}<br>
	 * <br>
	 * {@code res[0] = (v1.v0 - v2.v0)}<br>
	 * {@code res[1] = (v1.v1 - v2.v1)}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] sub(TupRF v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) - v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector
	 * {@code (v2[0], v2[1])} from the value of the same component of the first
	 * vector {@code v1} and saves the result in the given extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * The array {@code v2} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 - (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res[0] = (v1.v0 - v2[0])}<br>
	 * {@code res[1] = (v1.v1 - v2[1])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] sub(TupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) - v2[i];
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector {@code v2} from the
	 * value of the same component of the first vector {@code (v1[0], v1[1])}
	 * and saves the result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v1} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) - v2}<br>
	 * <br>
	 * {@code res[0] = (v1[0] - v2.v0)}<br>
	 * {@code res[1] = (v1[1] - v2.v1)}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] sub(float[] v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] - v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector
	 * {@code (v2[0], v2[1])} from the value of the same component of the first
	 * vector {@code (v1[0], v1[1])} and saves the result in the given
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * The arrays {@code v1} and {@code v2} representing 2-dimensional vectors
	 * are required to have at least two entries. Only the values at the indices
	 * 0 and 1 are used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) - (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res.v0 = (v1[0] - v2[0])}<br>
	 * {@code res.v1 = (v1[1] - v2[1])}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static float[] sub(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] - v2[i];
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector {@code v2} from the
	 * value of the same component of the first vector {@code v1} and saves the
	 * result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 - v2}<br>
	 * <br>
	 * {@code res.v0 = (v1.v0 - v2.v0)}<br>
	 * {@code res.v1 = (v1.v1 - v2.v1)}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T sub(TupRF v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) - v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector
	 * {@code (v2[0], v2[1])} from the value of the same component of the first
	 * vector {@code v1} and saves the result in the given extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * The array {@code v2} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 - (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res.v0 = (v1.v0 - v2[0])}<br>
	 * {@code res.v1 = (v1.v1 - v2[1])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T sub(TupRF v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) - v2[i]);
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector {@code v2} from the
	 * value of the same component of the first vector {@code (v1[0], v1[1])}
	 * and saves the result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v1} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) - v2}<br>
	 * <br>
	 * {@code res.v0 = (v1[0] - v2.v0)}<br>
	 * {@code res.v1 = (v1[1] - v2.v1)}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T sub(float[] v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] - v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Subtracts each component value of the second vector
	 * {@code (v2[0], v2[1])} from the value of the same component of the first
	 * vector {@code (v1[0], v1[1])} and saves the result in the given
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * The arrays {@code v1} and {@code v2} representing 2-dimensional vectors
	 * are required to have at least two entries. Only the values at the indices
	 * 0 and 1 are used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) - (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res.v0 = (v1[0] - v2[0])}<br>
	 * {@code res.v1 = (v1[1] - v2[1])}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T sub(float[] v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] - v2[i]);
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector {@code v1} with the
	 * value of the same component of the second vector {@code v2} and saves the
	 * result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 * v2}<br>
	 * <br>
	 * {@code res[0] = (v1.v0 * v2.v0)}<br>
	 * {@code res[1] = (v1.v1 * v2.v1)}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] mul(TupRF v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) * v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector
	 * {@code (v1)} with the value of the same component of the second
	 * vector {@code (v2[0], v2[1])} and saves the result in the given
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v2} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 * (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res[0] = (v1.v0 * v2[0])}<br>
	 * {@code res[1] = (v1.v1 * v2[1])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] mul(TupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) * v2[i];
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector {@code (v1[0], v1)}
	 * with the value of the same component of the second vector {@code v2} and
	 * saves the result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v1} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) * v2}<br>
	 * <br>
	 * {@code res[0] = (v1[0] * v2.v0)}<br>
	 * {@code res[1] = (v1[1] * v2.v1)}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] mul(float[] v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] * v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector
	 * {@code (v1[0], v1[1])} with the value of the same component of the second
	 * vector {@code (v2[0], v2[1])} and saves the result in the given
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * The arrays {@code v1} and {@code v2} representing 2-dimensional vectors
	 * are required to have at least two entries. Only the values at the indices
	 * 0 and 1 are used.
	 * 
	 * <p>
	 * The result array of the extraction parameter is required to have at least
	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
	 * left as it is.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) * (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res[0] = (v1[0] * v2[0])}<br>
	 * {@code res[1] = (v1[1] * v2[1])}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] mul(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] * v2[i];
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector {@code v1} with the
	 * value of the same component of the second vector {@code v2} and saves the
	 * result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 * v2}<br>
	 * <br>
	 * {@code res.v0 = (v1.v0 * v2.v0)}<br>
	 * {@code res.v1 = (v1.v1 * v2.v1)}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T mul(TupRF v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) * v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector
	 * {@code (v1[0], v1[1])} with the value of the same component of the second
	 * vector {@code v2} and saves the result in the given extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * The array {@code v2} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = v1 * (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res.v0 = (v1.v0 * v2[0])}<br>
	 * {@code res.v1 = (v1.v1 * v2[1])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T mul(TupRF v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) * v2[i]);
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector {@code v1} with the
	 * value of the same component of the second vector {@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter {@code res}.
	 * 
	 * <p>
	 * The array {@code v1} representing a 2-dimensional vector is required
	 * to have at least two entries. Only the values at the indices 0 and 1 are
	 * used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) * v2}<br>
	 * <br>
	 * {@code res.v0 = (v1[0] * v2.v0)}<br>
	 * {@code res.v1 = (v1[1] * v2.v1)}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T mul(float[] v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] * v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Multiplies each component value of the first vector
	 * {@code (v1[0], v1[1])} with the value of the same component of the second
	 * vector {@code (v2[0], v2[1])} and saves the result in the given
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * The arrays {@code v1} and {@code v2} representing 2-dimensional vectors
	 * are required to have at least two entries. Only the values at the indices
	 * 0 and 1 are used.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code res = (v1[0], v1[1]) * (v2[0], v2[1])}<br>
	 * <br>
	 * {@code res.v0 = (v1[0] * v2[0])}<br>
	 * {@code res.v1 = (v1[1] * v2[1])}
	 * 
	 * @param v1 The first vector as an array.
	 * @param v2 The second vector as an array.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T mul(float[] v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] * v2[i]);
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)} and saves the result
	 * in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(TupRF v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) / v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(TupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1.getAt(i) / v2[i];
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float[] v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] / v2.getAt(i);
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = v1[i] / v2[i];
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)} and saves the result
	 * in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T div(TupRF v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) / v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T div(TupRF v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1.getAt(i) / v2[i]);
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T div(float[] v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] / v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T div(float[] v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, v1[i] / v2[i]);
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(TupRF v1, TupRF v2, TupRF v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1.getAt(i), v2.getAt(i), v3.getAt(i));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(TupRF v1, TupRF v2, float[] v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1.getAt(i), v2.getAt(i), v3[i]);
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(TupRF v1, float[] v2, TupRF v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1.getAt(i), v2[i], v3.getAt(i));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(TupRF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1.getAt(i), v2[i], v3[i]);
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float[] v1, TupRF v2, TupRF v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1[i], v2.getAt(i), v3.getAt(i));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float[] v1, TupRF v2, float[] v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1[i], v2.getAt(i), v3[i]);
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float[] v1, float[] v2, TupRF v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1[i], v2[i], v3.getAt(i));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.fma(v1[i], v2[i], v3[i]);
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T fma(TupRF v1, TupRF v2, TupRF v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1.getAt(i), v2.getAt(i), v3.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T fma(TupRF v1, TupRF v2, float[] v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1.getAt(i), v2.getAt(i), v3[i]));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T fma(TupRF v1, float[] v2, TupRF v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1.getAt(i), v2[i], v3.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T fma(TupRF v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1.getAt(i), v2[i], v3[i]));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T fma(float[] v1, TupRF v2, TupRF v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1[i], v2.getAt(i), v3.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T fma(float[] v1, TupRF v2, float[] v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1[i], v2.getAt(i), v3[i]));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T fma(float[] v1, float[] v2, TupRF v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1[i], v2[i], v3.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T fma(float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.fma(v1[i], v2[i], v3[i]));
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, v2)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] min(TupRF v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.min(v1.getAt(i), v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] min(TupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.min(v1.getAt(i), v2[i]);
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), v2)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] min(float[] v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.min(v1[i], v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] min(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.min(v1[i], v2[i]);
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T min(TupRF v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.min(v1.getAt(i), v2.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T min(TupRF v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.min(v1.getAt(i), v2[i]));
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T min(float[] v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.min(v1[i], v2.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T min(float[] v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.min(v1[i], v2[i]));
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, v2)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] max(TupRF v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.max(v1.getAt(i), v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] max(TupRF v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.max(v1.getAt(i), v2[i]);
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), v2)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] max(float[] v1, TupRF v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.max(v1[i], v2.getAt(i));
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] max(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.max(v1[i], v2[i]);
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T max(TupRF v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.max(v1.getAt(i), v2.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T max(TupRF v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.max(v1.getAt(i), v2[i]));
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T max(float[] v1, TupRF v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.max(v1[i], v2.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T max(float[] v1, float[] v2, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.max(v1[i], v2[i]));
		}
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and saves the value
	 * and the component index in the extraction parameter object. If two or more components have
	 * the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static IndexValuePairF minEntry(TupRF v, @ExtractionParam IndexValuePairF res)
	{
		float minValue = Float.MAX_VALUE;
		int minIndex = -1;
		
		for(int i = 0; i < v.size(); i++)
		{
			float value = v.getAt(i);
			
			if(value < minValue)
			{
				minValue = value;
				minIndex = i;
			}
		}
		
		res.set(minValue, minIndex);
		
		return res;
	}

	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1])} and saves
	 * the value and the component index in the extraction parameter object. If two or more
	 * components have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static IndexValuePairF minEntry(float[] v, @ExtractionParam IndexValuePairF res)
	{
		float minValue = Float.MAX_VALUE;
		int minIndex = -1;
		
		for(int i = 0; i < v.length; i++)
		{
			float value = v[i];
			
			if(value < minValue)
			{
				minValue = value;
				minIndex = i;
			}
		}
		
		res.set(minValue, minIndex);
		
		return res;
	}

	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and returns it.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(TupRF v)
	{
		float minValue = Float.MAX_VALUE;
		
		for(int i = 0; i < v.size(); i++)
		{
			float value = v.getAt(i);
			
			if(value < minValue)
			{
				minValue = value;
			}
		}
		
		return minValue;
	}

	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1])} and
	 * returns it.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(float[] v)
	{
		float minValue = Float.MAX_VALUE;
		
		for(int i = 0; i < v.length; i++)
		{
			float value = v[i];
			
			if(value < minValue)
			{
				minValue = value;
			}
		}
		
		return minValue;
	}

	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(TupRF v)
	{
		float minValue = Float.MAX_VALUE;
		int minIndex = -1;
		
		for(int i = 0; i < v.size(); i++)
		{
			float value = v.getAt(i);
			
			if(value < minValue)
			{
				minValue = value;
				minIndex = i;
			}
		}
		
		return minIndex;
	}

	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1])} and
	 * returns the index of the component. If two or more components have the same value the first
	 * index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(float[] v)
	{
		float minValue = Float.MAX_VALUE;
		int minIndex = -1;
		
		for(int i = 0; i < v.length; i++)
		{
			float value = v[i];
			
			if(value < minValue)
			{
				minValue = value;
				minIndex = i;
			}
		}
		
		return minIndex;
	}

	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and saves the value
	 * and the component index in the extraction parameter object. If two or more components have
	 * the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static IndexValuePairF maxEntry(TupRF v, @ExtractionParam IndexValuePairF res)
	{
		float maxValue = Float.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i = 0; i < v.size(); i++)
		{
			float value = v.getAt(i);
			
			if(value > maxValue)
			{
				maxValue = value;
				maxIndex = i;
			}
		}
		
		res.set(maxValue, maxIndex);
		
		return res;
	}

	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1])} and saves
	 * the value and the component index in the extraction parameter object. If two or more
	 * components have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static IndexValuePairF maxEntry(float[] v, @ExtractionParam IndexValuePairF res)
	{
		float maxValue = Float.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i = 0; i < v.length; i++)
		{
			float value = v[i];
			
			if(value > maxValue)
			{
				maxValue = value;
				maxIndex = i;
			}
		}
		
		res.set(maxValue, maxIndex);
		
		return res;
	}

	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and returns it.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(TupRF v)
	{
		float maxValue = Float.MIN_VALUE;
		
		for(int i = 0; i < v.size(); i++)
		{
			float value = v.getAt(i);
			
			if(value > maxValue)
			{
				maxValue = value;
			}
		}
		
		return maxValue;
	}

	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1])} and
	 * returns it.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(float[] v)
	{
		float maxValue = Float.MIN_VALUE;
		
		for(int i = 0; i < v.length; i++)
		{
			float value = v[i];
			
			if(value > maxValue)
			{
				maxValue = value;
			}
		}
		
		return maxValue;
	}

	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(TupRF v)
	{
		float maxValue = Float.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i = 0; i < v.size(); i++)
		{
			float value = v.getAt(i);
			
			if(value > maxValue)
			{
				maxValue = value;
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}

	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1])} and
	 * returns the index of the component. If two or more components have the same value the first
	 * index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(float[] v)
	{
		float maxValue = Float.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i = 0; i < v.length; i++)
		{
			float value = v[i];
			
			if(value > maxValue)
			{
				maxValue = value;
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}

//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
//	 * the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] ceil(TupRF v, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = MathUtils.ceil(v.getAt(i));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer and
//	 * saves the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] ceil(float[] v, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = MathUtils.ceil(v[i]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T ceil(TupRF v, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, MathUtils.ceil(v.getAt(i)));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T ceil(float[] v, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, MathUtils.ceil(v[i]));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
//	 * the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] floor(TupRF v, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = MathUtils.floor(v.getAt(i));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer and
//	 * saves the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] floor(float[] v, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = MathUtils.floor(v[i]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T floor(TupRF v, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, MathUtils.floor(v.getAt(i)));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T floor(float[] v, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, MathUtils.floor(v[i]));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the extraction
//	 * parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(TupRF v, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = MathUtils.round(v.getAt(i));
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the
//	 * extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(float[] v, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = MathUtils.round(v[i]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T round(TupRF v, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, MathUtils.round(v.getAt(i)));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T round(float[] v, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, MathUtils.round(v[i]));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the extraction
//	 * parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(TupRF v, RoundMethodF method, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = method.round(v.getAt(i));
//		}
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the
//	 * extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(float[] v, RoundMethodF method, @ExtractionParam float[] res)
//	{
//		for(int i = 0; i < res.length; i++)
//		{
//			res[i] = method.round(v[i]);
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T round(TupRF v, RoundMethodF method, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, method.round(v.getAt(i)));
//		}
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends TupWF> T round(float[] v, RoundMethodF method, @ExtractionParam T res)
//	{
//		for(int i = 0; i < res.size(); i++)
//		{
//			res.setAt(i, method.round(v[i]));
//		}
//		
//		return res;
//	}

	/**
	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
	 * the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(TupRF v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = (int)v.getAt(i);
		}
		
		return res;
	}

	/**
	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])} and saves the
	 * result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(float[] v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = (int)v[i];
		}
		
		return res;
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T trunc(TupRF v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, (int)v.getAt(i));
		}
		
		return res;
	}

	/**
	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T trunc(float[] v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, (int)v[i]);
		}
		
		return res;
	}

	/**
	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
	 * result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(TupRF v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.abs(v.getAt(i));
		}
		
		return res;
	}

	/**
	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])} and
	 * saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(float[] v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.abs(v[i]);
		}
		
		return res;
	}

	/**
	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T abs(TupRF v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.abs(v.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T abs(float[] v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.abs(v[i]));
		}
		
		return res;
	}

	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v)} and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sign(TupRF v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.sign(v.getAt(i));
		}
		
		return res;
	}

	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v[0], v[1])} and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sign(float[] v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = MathUtils.Num.sign(v[i]);
		}
		
		return res;
	}

	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at leasts two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T sign(TupRF v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.sign(v.getAt(i)));
		}
		
		return res;
	}

	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v[0], v[1])} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T sign(float[] v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, MathUtils.Num.sign(v[i]));
		}
		
		return res;
	}

	/**
	 * Negates the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code -v}
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] neg(TupRF v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = -v.getAt(i);
		}
		
		return res;
	}

	/**
	 * Negates the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation: {@code -(v[0], v[1])}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] neg(float[] v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = -v[i];
		}
		
		return res;
	}

	/**
	 * Negates the vector {@code (v)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation: {@code -v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T neg(TupRF v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, -v.getAt(i));
		}
		
		return res;
	}

	/**
	 * Negates the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation: {@code -(v[0], v[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T neg(float[] v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, -v[i]);
		}
		
		return res;
	}

	/**
	 * Inverses the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / v}
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inv(TupRF v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = 1.0f / v.getAt(i);
		}
		
		return res;
	}

	/**
	 * Inverses the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (v[0], v[1])}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inv(float[] v, @ExtractionParam float[] res)
	{
		for(int i = 0; i < res.length; i++)
		{
			res[i] = 1.0f / v[i];
		}
		
		return res;
	}

	/**
	 * Inverses the vector {@code (v)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T inv(TupRF v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, 1.0f / v.getAt(i));
		}
		
		return res;
	}

	/**
	 * Inverses the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (v[0], v[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends TupWF> T inv(float[] v, @ExtractionParam T res)
	{
		for(int i = 0; i < res.size(); i++)
		{
			res.setAt(i, 1.0f / v[i]);
		}
		
		return res;
	}

	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(n) = t.v(n)}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equals(@Nullable TupRF t1, @Nullable TupRF t2)
	{
		if(t1 == t2) return true;
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() != t2.size()) return false;
		
		for(int i = 0; i < t1.size(); i++)
		{
			if(t1.getAt(i) != t1.getAt(i)) return false;
		}

		return true;
	}

	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(n) = t[n]}
	 * 
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equals(@Nullable TupRF t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() != t2.length) return false;
		
		for(int i = 0; i < t1.size(); i++)
		{
			if(t1.getAt(i) != t2[i]) return false;
		}

		return true;
	}

	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(n) = t[n]}
	 * 
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equals(@Nullable float[] t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.length != t2.length) return false;
		
		for(int i = 0; i < t1.length; i++)
		{
			if(t1[i] != t2[i]) return false;
		}

		return true;
	}
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(TupRF)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(n) - t.v(n)) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equals(float tolerance, @Nullable TupRF t1, @Nullable TupRF t2)
	{
		if(t1 == t2) return true;
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() != t2.size()) return false;
		
		for(int i = 0; i < t1.size(); i++)
		{
			if(!MathUtils.Num.equals(tolerance, t1.getAt(i), t2.getAt(0))) return false;
		}
		
		return true;
	}

	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(float[]) equals(float...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(n) - t[n]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equals(float tolerance, @Nullable TupRF t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() != t2.length) return false;
		
		for(int i = 0; i < t1.size(); i++)
		{
			if(!MathUtils.Num.equals(tolerance, t1.getAt(i), t2[i])) return false;
		}

		return true;
	}
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(float[]) equals(float...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(n) - t[n]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equals(float tolerance, @Nullable float[] t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.length != t2.length) return false;
		
		for(int i = 0; i < t1.length; i++)
		{
			if(!MathUtils.Num.equals(tolerance, t1[i], t2[i])) return false;
		}

		return true;
	}
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = t.v(index)}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(int index, @Nullable TupRF t1, @Nullable TupRF t2)
	{
		if(t1 == t2) return true;
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() <= index) return false;
		if(t2.size() <= index) return false;
		
		return t1.getAt(index) == t2.getAt(index);
	}

	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = t[index]}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(int index, @Nullable TupRF t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() <= index) return false;
		if(t2.length <= index) return false;
		
		return t1.getAt(index) == t2[index];
	}

	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = t[index]}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(int index, @Nullable float[] t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.length <= index) return false;
		if(t2.length <= index) return false;
		
		return t1[index] == t2[index];
	}
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = value}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component value at the given index of this tuple
	 * and the given value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(int index, @Nullable TupRF t, float value)
	{
		if(t == null) return false;
		if(t.size() <= index) return false;
		
		return t.getAt(index) == value;
	}

	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = value}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component value at the given index of this tuple
	 * and the given value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(int index, @Nullable float[] t, float value)
	{
		if(t == null) return false;
		if(t.length <= index) return false;
		
		return t[index] == value;
	}
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, TupRF)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - t.v(index)) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(float tolerance, int index, @Nullable TupRF t1, @Nullable TupRF t2)
	{
		if(t1 == t2) return true;
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() <= index) return false;
		if(t2.size() <= index) return false;
		
		return MathUtils.Num.equals(tolerance, t1.getAt(index), t2.getAt(index));
	}

	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, float[]) equalsAt(int, float...)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - t[index]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(float tolerance, int index, @Nullable TupRF t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.size() <= index) return false;
		if(t2.length <= index) return false;
		
		return MathUtils.Num.equals(tolerance, t1.getAt(index), t2[index]);
	}

	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, float[]) equalsAt(int, float...)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - t[index]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(float tolerance, int index, @Nullable float[] t1, @Nullable float... t2)
	{
		if(t1 == null) return false;
		if(t2 == null) return false;
		if(t1.length <= index) return false;
		if(t2.length <= index) return false;
		
		return MathUtils.Num.equals(tolerance, t1[index], t2[index]);
	}
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, float) equalsAt(int, float)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - value) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component value at the given index of this tuple
	 * and the given value are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(float tolerance, int index, @Nullable TupRF t, float value)
	{
		if(t == null) return false;
		if(t.size() <= index) return false;
		
		return MathUtils.Num.equals(tolerance, t.getAt(index), value);
	}
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, float) equalsAt(int, float)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - value) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component value at the given index of this tuple
	 * and the given value are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	public static boolean equalsAt(float tolerance, int index, @Nullable float[] t, float value)
	{
		if(t == null) return false;
		if(t.length <= index) return false;
		
		return MathUtils.Num.equals(tolerance, t[index], value);
	}
}
