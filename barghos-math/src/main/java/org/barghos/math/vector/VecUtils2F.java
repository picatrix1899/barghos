package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.math.MathUtils;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.TupRF;

/**
 * This class provides vector operations for two dimensions.
 */
public class VecUtils2F
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
	 * {@code res[0] = (t1.x + t2.x)}<br>
	 * {@code res[1] = (t1.y + t2.y)}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The extraction parameter containing the result array.
	 * 
	 * @return The result array from the extraction parameter with the result.
	 */
	public static float[] add(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.v0();
		res[1] = t1.v1() + t2.v1();
		
		return res;
	}
	
	public static float[] add(Tup2RF t1, TupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.getAt(0);
		res[1] = t1.v1() + t2.getAt(1);
		
		return res;
	}
	
	public static float[] add(Tup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2[0];
		res[1] = t1.v1() + t2[1];
		
		return res;
	}

	public static float[] add(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2v0;
		res[1] = t1.v1() + t2v1;
		
		return res;
	}
	
	public static float[] add(TupRF t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2.v0();
		res[1] = t1.getAt(1) + t2.v1();
		
		return res;
	}
	
	public static float[] add(TupRF t1, TupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2.getAt(0);
		res[1] = t1.getAt(1) + t2.getAt(1);
		
		return res;
	}

	public static float[] add(TupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2[0];
		res[1] = t1.getAt(1) + t2[1];
		
		return res;
	}

	public static float[] add(TupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2v0;
		res[1] = t1.getAt(1) + t2v1;
		
		return res;
	}

	public static float[] add(float[] t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2.v0();
		res[1] = t1[1] + t2.v1();
		
		return res;
	}

	public static float[] add(float[] t1, TupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2.getAt(0);
		res[1] = t1[1] + t2.getAt(1);
		
		return res;
	}

	public static float[] add(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2[0];
		res[1] = t1[1] + t2[1];
		
		return res;
	}

	public static float[] add(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2v0;
		res[1] = t1[1] + t2v1;
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2.v0();
		res[1] = t1v1 + t2.v1();
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, TupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2.getAt(0);
		res[1] = t1v1 + t2.getAt(1);
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2[0];
		res[1] = t1v1 + t2[1];
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2v0;
		res[1] = t1v1 + t2v1;
		
		return res;
	}

	/**
	 * Adds the second vector {@code (t2)} to the first vector {@code (v1)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + v2}
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
	public static <T extends Tup2WF> T add(Tup2RF t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.v0(), t1.v1() + t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T add(Tup2RF t1, TupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.getAt(0), t1.v1() + t2.getAt(1));
		
		return res;
	}

	public static <T extends Tup2WF> T add(Tup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2[0], t1.v1() + t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T add(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2v0, t1.v1() + t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T add(float[] t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.v0(), t1[1] + t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T add(float[] t1, TupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.getAt(0), t1[1] + t2.getAt(1));
		
		return res;
	}

	public static <T extends Tup2WF> T add(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2[0], t1[1] + t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T add(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] + t2v0, t1[1] + t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T add(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2.v0(), t1v1 + t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T add(float t1v0, float t1v1, TupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2.getAt(0), t1v1 + t2.getAt(1));
		
		return res;
	}
	
	public static <T extends Tup2WF> T add(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2[0], t1v1 + t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T add(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1v0 + t2v0, t1v1 + t2v1);
		
		return res;
	}
	
	/**
	 * Adds the second vector {@code (t2)} to the first vector {@code (v1)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + v2}
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
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(Tup2RF t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2.v0(), t1.v1() + t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(Tup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2[0], t1.v1() + t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(Tup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2v0, t1.v1() + t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(float[] t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2.v0(), t1[1] + t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2[0], t1[1] + t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2v0, t1[1] + t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(float t1v0, float t1v1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2.v0(), t1v1 + t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2[0], t1v1 + t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T addCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2v0, t1v1 + t2v1);
	}
	
	/**
	 * Subtracts the second vector {@code (t2)} from the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - v2}
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
	public static float[] sub(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2.v0();
		res[1] = t1.v1() - t2.v1();
		
		return res;
	}

	public static float[] sub(Tup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2[0];
		res[1] = t1.v1() - t2[1];
		
		return res;
	}

	public static float[] sub(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2v0;
		res[1] = t1.v1() - t2v1;
		
		return res;
	}

	public static float[] sub(float[] t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2.v0();
		res[1] = t1[1] - t2.v1();
		
		return res;
	}

	public static float[] sub(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2[0];
		res[1] = t1[1] - t2[1];
		
		return res;
	}

	public static float[] sub(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2v0;
		res[1] = t1[1] - t2v1;
		
		return res;
	}

	public static float[] sub(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2.v0();
		res[1] = t1v1 - t2.v1();
		
		return res;
	}

	public static float[] sub(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2[0];
		res[1] = t1v1 - t2[1];
		
		return res;
	}

	public static float[] sub(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2v0;
		res[1] = t1v1 - t2v1;
		
		return res;
	}

	public static <T extends Tup2WF> T sub(Tup2RF t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2.v0(), t1.v1() - t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T sub(Tup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2[0], t1.v1() - t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T sub(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2v0, t1.v1() - t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T sub(float[] t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2.v0(), t1[1] - t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T sub(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2[0], t1[1] - t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T sub(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] - t2v0, t1[1] - t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T sub(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2.v0(), t1v1 - t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T sub(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2[0], t1v1 - t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T sub(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1v0 - t2v0, t1v1 - t2v1);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(Tup2RF t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2.v0(), t1.v1() - t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(Tup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2[0], t1.v1() - t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(Tup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2v0, t1.v1() - t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(float[] t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2.v0(), t1[1] - t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2[0], t1[1] - t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2v0, t1[1] - t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(float t1v0, float t1v1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2.v0(), t1v1 - t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2[0], t1v1 - t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T subCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2v0, t1v1 - t2v1);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (t2)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1 * v2}
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
	public static float[] mul(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2.v0();
		res[1] = t1.v1() * t2.v1();
		
		return res;
	}

	public static float[] mul(Tup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2[0];
		res[1] = t1.v1() * t2[1];
		
		return res;
	}

	public static float[] mul(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2v0;
		res[1] = t1.v1() * t2v1;
		
		return res;
	}

	public static float[] mul(float[] t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2.v0();
		res[1] = t1[1] * t2.v1();
		
		return res;
	}

	public static float[] mul(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2[0];
		res[1] = t1[1] * t2[1];
		
		return res;
	}

	public static float[] mul(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2v0;
		res[1] = t1[1] * t2v1;
		
		return res;
	}

	public static float[] mul(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2.v0();
		res[1] = t1v1 * t2.v1();
		
		return res;
	}

	public static float[] mul(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2[0];
		res[1] = t1v1 * t2[1];
		
		return res;
	}

	public static float[] mul(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2v0;
		res[1] = t1v1 * t2v1;
		
		return res;
	}

	public static <T extends Tup2WF> T mul(Tup2RF t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2.v0(), t1.v1() * t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T mul(Tup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2[0], t1.v1() * t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T mul(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2v0, t1.v1() * t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T mul(float[] t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2.v0(), t1[1] * t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T mul(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2[0], t1[1] * t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T mul(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] * t2v0, t1[1] * t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T mul(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2.v0(), t1v1 * t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T mul(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2[0], t1v1 * t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T mul(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1v0 * t2v0, t1v1 * t2v1);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(Tup2RF t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2.v0(), t1.v1() * t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(Tup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2[0], t1.v1() * t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(Tup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2v0, t1.v1() * t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(float[] t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2.v0(), t1[1] * t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2[0], t1[1] * t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2v0, t1[1] * t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(float t1v0, float t1v1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2.v0(), t1v1 * t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2[0], t1v1 * t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T mulCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2v0, t1v1 * t2v1);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (t2)} and saves the result
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
	public static float[] div(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2.v0();
		res[1] = t1.v1() / t2.v1();
		
		return res;
	}

	public static float[] div(Tup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2[0];
		res[1] = t1.v1() / t2[1];
		
		return res;
	}

	public static float[] div(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2v0;
		res[1] = t1.v1() / t2v1;
		
		return res;
	}

	public static float[] div(float[] t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2.v0();
		res[1] = t1[1] / t2.v1();
		
		return res;
	}

	public static float[] div(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2[0];
		res[1] = t1[1] / t2[1];
		
		return res;
	}

	public static float[] div(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2v0;
		res[1] = t1[1] / t2v1;
		
		return res;
	}

	public static float[] div(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2.v0();
		res[1] = t1v1 / t2.v1();
		
		return res;
	}

	public static float[] div(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2[0];
		res[1] = t1v1 / t2[1];
		
		return res;
	}

	public static float[] div(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2v0;
		res[1] = t1v1 / t2v1;
		
		return res;
	}

	public static <T extends Tup2WF> T div(Tup2RF t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2.v0(), t1.v1() / t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T div(Tup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2[0], t1.v1() / t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T div(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2v0, t1.v1() / t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T div(float[] t1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2.v0(), t1[1] / t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T div(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2[0], t1[1] / t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T div(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] / t2v0, t1[1] / t2v1);
		
		return res;
	}

	public static <T extends Tup2WF> T div(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2.v0(), t1v1 / t2.v1());
		
		return res;
	}

	public static <T extends Tup2WF> T div(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2[0], t1v1 / t2[1]);
		
		return res;
	}

	public static <T extends Tup2WF> T div(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1v0 / t2v0, t1v1 / t2v1);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(Tup2RF t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2.v0(), t1.v1() / t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(Tup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2[0], t1.v1() / t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(Tup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2v0, t1.v1() / t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(float[] t1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2.v0(), t1[1] / t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2[0], t1[1] / t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2v0, t1[1] / t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(float t1v0, float t1v1, Tup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2.v0(), t1v1 / t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2[0], t1v1 / t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Tup2RF> T divCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2v0, t1v1 / t2v1);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (t2)}, adds the given
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
	public static float[] fma(Tup2RF t1, Tup2RF t2, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2.v0(), t2.v1(), t3.v0(), t3.v1(), res);
	}

	public static float[] fma(Tup2RF t1, Tup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2.v0(), t2.v1(), t3[0], t3[1], res);
	}

	public static float[] fma(Tup2RF t1, Tup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2.v0(), t2.v1(), t3v0, t3v1, res);
	}

	public static float[] fma(Tup2RF t1, float[] t2, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2[0], t2[1], t3.v0(), t3.v1(), res);
	}

	public static float[] fma(Tup2RF t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2[0], t2[1], t3[0], t3[1], res);
	}

	public static float[] fma(Tup2RF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2[0], t2[1], t3v0, t3v1, res);
	}

	public static float[] fma(Tup2RF t1, float t2v0, float t2v1, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2v0, t2v1, t3.v0(), t3.v1(), res);
	}

	public static float[] fma(Tup2RF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2v0, t2v1, t3[0], t3[1], res);
	}

	public static float[] fma(Tup2RF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1.v0(), t1.v1(), t2v0, t2v1, t3v0, t3v1, res);
	}

	public static float[] fma(float[] t1, Tup2RF t2, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2.v0(), t2.v1(), t3.v0(), t3.v1(), res);
	}

	public static float[] fma(float[] t1, Tup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2.v0(), t2.v1(), t3[0], t3[1], res);
	}

	public static float[] fma(float[] t1, Tup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2.v0(), t2.v1(), t3v0, t3v1, res);
	}

	public static float[] fma(float[] t1, float[] t2, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2[0], t2[1], t3.v0(), t3.v1(), res);
	}

	public static float[] fma(float[] t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2[0], t2[1], t3[0], t3[1], res);
	}

	public static float[] fma(float[] t1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2[0], t2[1], t3v0, t3v1, res);
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2v0, t2v1, t3.v0(), t3.v1(), res);
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2v0, t2v1, t3[0], t3[1], res);
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1[0], t1[1], t2v0, t2v1, t3v0, t3v1, res);
	}

	public static float[] fma(float t1v0, float t1v1, Tup2RF t2, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2.v0(), t2.v1(), t3.v0(), t3.v1(), res);
	}

	public static float[] fma(float t1v0, float t1v1, Tup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2.v0(), t2.v1(), t3[0], t3[1], res);
	}

	public static float[] fma(float t1v0, float t1v1, Tup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2.v0(), t2.v1(), t3v0, t3v1, res);
	}

	public static float[] fma(float t1v0, float t1v1, float[] t2, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2[0], t2[1], t3.v0(), t3.v1(), res);
	}

	public static float[] fma(float t1v0, float t1v1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2[0], t2[1], t3[0], t3[1], res);
	}

	public static float[] fma(float t1v0, float t1v1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2[0], t2[1], t3v0, t3v1, res);
	}

	public static float[] fma(float t1v0, float t1v1, float t2v0, float t2v1, Tup2RF t3, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2v0, t2v1, t3.v0(), t3.v1(), res);
	}

	public static float[] fma(float t1v0, float t1v1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		return fma(t1v0, t1v1, t2v0, t2v1, t3[0], t3[1], res);
	}

	public static float[] fma(float t1v0, float t1v1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3v0);
		res[1] = MathUtils.fma(t1v1, t2v1, t3v1);
		
		return res;
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, Tup2RF t2, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2.v0(), t2.v1(), t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, Tup2RF t2, float[] t3, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2.v0(), t2.v1(), t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, Tup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2.v0(), t2.v1(), t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, float[] t2, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2[0], t2[1], t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2[0], t2[1], t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2[0], t2[1], t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, float t2v0, float t2v1, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2v0, t2v1, t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2v0, t2v1, t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(Tup2RF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1.v0(), t1.v1(), t2v0, t2v1, t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, Tup2RF t2, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2.v0(), t2.v1(), t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, Tup2RF t2, float[] t3, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2.v0(), t2.v1(), t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, Tup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2.v0(), t2.v1(), t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, float[] t2, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2[0], t2[1], t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2[0], t2[1], t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2[0], t2[1], t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, float t2v0, float t2v1, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2v0, t2v1, t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2v0, t2v1, t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(float[] t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1[0], t1[1], t2v0, t2v1, t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, Tup2RF t2, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2.v0(), t2.v1(), t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, Tup2RF t2, float[] t3, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2.v0(), t2.v1(), t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, Tup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2.v0(), t2.v1(), t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, float[] t2, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2[0], t2[1], t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2[0], t2[1], t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2[0], t2[1], t3v0, t3v1, res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, float t2v0, float t2v1, Tup2RF t3, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2v0, t2v1, t3.v0(), t3.v1(), res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		return fma(t1v0, t1v1, t2v0, t2v1, t3[0], t3[1], res);
	}

	public static <T extends Tup2WF> T fma(float t1v0, float t1v1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3v0), MathUtils.fma(t1v1, t2v1, t3v1));
		
		return res;
	}
	
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
	public static float[] trunc(Tup2RF v, @ExtractionParam float[] res)
	{
		return trunc(v.v0(), v.v1(), res);
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
		return trunc(v[0], v[1], res);
	}

	/**
	 * Truncates the decimals of the components of the vector {@code (x, y)} and saves the result in
	 * the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(float x, float y, @ExtractionParam float[] res)
	{
		res[0] = (int)x;
		res[1] = (int)y;
		
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
	public static <T extends Tup2WF> T trunc(Tup2RF v, @ExtractionParam T res)
	{
		return trunc(v.v0(), v.v1(), res);
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
	public static <T extends Tup2WF> T trunc(float[] v, @ExtractionParam T res)
	{
		return trunc(v[0], v[1], res);
	}

	/**
	 * Truncates the decimals of the components of the vector {@code (x, y)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T trunc(float x, float y, @ExtractionParam T res)
	{
		res.set((int)x, (int)y);
		
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
	public static float[] abs(Tup2RF v, @ExtractionParam float[] res)
	{
		return abs(v.v0(), v.v1(), res);
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
		return abs(v[0], v[1], res);
	}

	/**
	 * Calculates the absolute value of the component values of the vector {@code (x, y)} and saves
	 * the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(float x, float y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(x);
		res[1] = MathUtils.abs(y);
		
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
	public static <T extends Tup2WF> T abs(Tup2RF v, @ExtractionParam T res)
	{
		return abs(v.v0(), v.v1(), res);
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
	public static <T extends Tup2WF> T abs(float[] v, @ExtractionParam T res)
	{
		return abs(v[0], v[1], res);
	}

	/**
	 * Calculates the absolute value of the component values of the vector {@code (x, y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T abs(float x, float y, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(x), MathUtils.abs(y));
		
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
	public static float[] sign(Tup2RF v, @ExtractionParam float[] res)
	{
		return sign(v.v0(), v.v1(), res);
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
		return sign(v[0], v[1], res);
	}

	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (x, y)} and saves the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sign(float x, float y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(x);
		res[1] = MathUtils.sign(y);
		
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
	public static <T extends Tup2WF> T sign(Tup2RF v, @ExtractionParam T res)
	{
		return sign(v.v0(), v.v1(), res);
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
	public static <T extends Tup2WF> T sign(float[] v, @ExtractionParam T res)
	{
		return sign(v[0], v[1], res);
	}

	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (x, y)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T sign(float x, float y, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(x), MathUtils.sign(y));
		
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
	public static float[] neg(Tup2RF v, @ExtractionParam float[] res)
	{
		return neg(v.v0(), v.v1(), res);
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
		return neg(v[0], v[1], res);
	}

	/**
	 * Negates the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code -(x, y)}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] neg(float x, float y, @ExtractionParam float[] res)
	{
		res[0] = -x;
		res[1] = -y;
		
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
	public static <T extends Tup2WF> T neg(Tup2RF v, @ExtractionParam T res)
	{
		return neg(v.v0(), v.v1(), res);
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
	public static <T extends Tup2WF> T neg(float[] v, @ExtractionParam T res)
	{
		return neg(v[0], v[1], res);
	}

	/**
	 * Negates the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code -(x, y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T neg(float x, float y, @ExtractionParam T res)
	{
		res.set(-x, -y);
		
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
	public static float[] rec(Tup2RF v, @ExtractionParam float[] res)
	{
		return rec(v.v0(), v.v1(), res);
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
	public static float[] rec(float[] v, @ExtractionParam float[] res)
	{
		return rec(v[0], v[1], res);
	}

	/**
	 * Inverses the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (x, y)}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rec(float x, float y, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / x;
		res[1] = 1.0f / y;
		
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
	public static <T extends Tup2WF> T rec(Tup2RF v, @ExtractionParam T res)
	{
		return rec(v.v0(), v.v1(), res);
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
	public static <T extends Tup2WF> T rec(float[] v, @ExtractionParam T res)
	{
		return rec(v[0], v[1], res);
	}

	/**
	 * Inverses the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (x, y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rec(float x, float y, @ExtractionParam T res)
	{
		res.set(1.0f / x, 1.0f / y);
		
		return res;
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The inverse length of the vector.
	 */
	public static float recLen(Tup2RF v)
	{
		return recLen(v.v0(), v.v1());
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float recLen(float[] v)
	{
		return recLen(v[0], v[1]);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float recLen(float x, float y)
	{
		return MathUtils.invSqrt(sqrLen(x, y));
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(Tup2RF v)
	{
		return len(v.v0(), v.v1());
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float tolerance, Tup2RF v)
	{
		return len(v.v0(), v.v1(), tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float[] v)
	{
		return len(v[0], v[1]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float tolerance, float[] v)
	{
		return len(v[0], v[1], tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float x, float y)
	{
		float sqareLength = sqrLen(x, y);
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float tolerance, float x, float y)
	{
		float sqareLength = sqrLen(x, y);
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y)}. It doesn't account
	 * for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|²}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float sqrLen(Tup2RF v)
	{
		return sqrLen(v.v0(), v.v1());
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (v[0], v[1])}. It doesn't
	 * account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|²}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float sqrLen(float[] v)
	{
		return sqrLen(v[0], v[1]);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y)}. It doesn't account
	 * for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|²}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float sqrLen(float x, float y)
	{
		return x * x + y * y;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(Tup2RF v, @ExtractionParam float[] res)
	{
		return nrm(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter. If
	 * the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float tolerance, Tup2RF v, @ExtractionParam float[] res)
	{
		return nrm(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float[] v, @ExtractionParam float[] res)
	{
		return nrm(v[0], v[1], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		return nrm(v[0], v[1], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float x, float y, @ExtractionParam float[] res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = recLen(x, y);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float tolerance, float x, float y, @ExtractionParam float[] res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = recLen(x, y);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
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
	public static <T extends Tup2WF> T nrm(Tup2RF v, @ExtractionParam T res)
	{
		return nrm(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float tolerance, Tup2RF v, @ExtractionParam T res)
	{
		return nrm(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
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
	public static <T extends Tup2WF> T nrm(float[] v, @ExtractionParam T res)
	{
		return nrm(v[0], v[1], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float tolerance, float[] v, @ExtractionParam T res)
	{
		return nrm(v[0], v[1], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float x, float y, @ExtractionParam T res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = recLen(x, y);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float tolerance, float x, float y, @ExtractionParam T res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = recLen(x, y);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotRad(double angle, Tup2RF v, @ExtractionParam float[] res)
	{
		return rotRad(angle, v.v0(), v.v1(), res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotRad(double angle, float[] v, @ExtractionParam float[] res)
	{
		return rotRad(angle, v[0], v[1], res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotRad(double angle, float x, float y, @ExtractionParam float[] res)
	{
		res[0] = (float)(x * MathUtils.cos(angle) - y * MathUtils.sin(angle));
		res[1] = (float)(x * MathUtils.sin(angle) + y * MathUtils.cos(angle));
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotRad(double angle, Tup2RF v, @ExtractionParam T res)
	{
		return rotRad(angle, v.v0(), v.v1(), res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotRad(double angle, float[] v, @ExtractionParam T res)
	{
		return rotRad(angle, v[0], v[1], res);
	}
	
	public static  <T extends Tup2WF> T rotRad(double angle, float x, float y, @ExtractionParam T res)
	{
		res.set((float)(x * MathUtils.cos(angle) - y * MathUtils.sin(angle)), (float)(x * MathUtils.sin(angle) + y * MathUtils.cos(angle)));
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotDeg(double angle, Tup2RF v, @ExtractionParam float[] res)
	{
		return rotDeg(angle, v.v0(), v.v1(), res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotDeg(double angle, float[] v, @ExtractionParam float[] res)
	{
		return rotDeg(angle, v[0], v[1], res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotDeg(double angle, float x, float y, @ExtractionParam float[] res)
	{
		return rotRad(angle * MathUtils.DEG_TO_RADf, x, y, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotDeg(double angle, Tup2RF v, @ExtractionParam T res)
	{
		return rotDeg(angle, v.v0(), v.v1(), res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotDeg(double angle, float[] v, @ExtractionParam T res)
	{
		return rotDeg(angle, v[0], v[1], res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotDeg(double angle, float x, float y, @ExtractionParam T res)
	{
		return rotRad(angle * MathUtils.DEG_TO_RADf, x, y, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup2RF v, Tup2RF t, @ExtractionParam float[] res)
	{
		return project(v.v0(), v.v1(), t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup2RF v, float[] t, @ExtractionParam float[] res)
	{
		return project(v.v0(), v.v1(), t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup2RF v, float tX, float tY, @ExtractionParam float[] res)
	{
		return project(v.v0(), v.v1(), tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1]) . t)}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float[] v, Tup2RF t, @ExtractionParam float[] res)
	{
		return project(v[0], v[1], t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((v[0], v[1]) . (t[0], t[1]))}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float[] v, float[] t, @ExtractionParam float[] res)
	{
		return project(v[0], v[1], t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((v[0], v[1]) . (tX, tY))}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float[] v, float tX, float tY, @ExtractionParam float[] res)
	{
		return project(v[0], v[1], tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY) . t)}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, Tup2RF t, @ExtractionParam float[] res)
	{
		return project(vX, vY, t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((vX, vY) . (t[0], t[1]))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, float[] t, @ExtractionParam float[] res)
	{
		return project(vX, vY, t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((vX, vY) . (tX, tY))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, float tX, float tY, @ExtractionParam float[] res)
	{
		float dot = dot(vX, vY, tX, tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(Tup2RF v, Tup2RF t, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(Tup2RF v, float[] t, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(Tup2RF v, float tX, float tY, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1]) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(float[] v, Tup2RF t, @ExtractionParam T res)
	{
		return project(v[0], v[1], t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((v[0], v[1]) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(float[] v, float[] t, @ExtractionParam T res)
	{
		return project(v[0], v[1], t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((v[0], v[1]) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(float[] v, float tX, float tY, @ExtractionParam T res)
	{
		return project(v[0], v[1], tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(float vX, float vY, Tup2RF t, @ExtractionParam T res)
	{
		return project(vX, vY, t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((vX, vY) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(float vX, float vY, float[] t, @ExtractionParam T res)
	{
		return project(vX, vY, t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((vX, vY) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T project(float vX, float vY, float tX, float tY, @ExtractionParam T res)
	{
		float dot = dot(vX, vY, tX, tY);
		
		res.set(tX * dot, tY * dot);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup2RF v, Tup2RF n, @ExtractionParam float[] res)
	{
		return reflect(v.v0(), v.v1(), n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup2RF v, float[] n, @ExtractionParam float[] res)
	{
		return reflect(v.v0(), v.v1(), n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup2RF v, float nX, float nY, @ExtractionParam float[] res)
	{
		return reflect(v.v0(), v.v1(), nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float[] v, Tup2RF n, @ExtractionParam float[] res)
	{
		return reflect(v[0], v[1], n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float[] v, float[] n, @ExtractionParam float[] res)
	{
		return reflect(v[0], v[1], n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float[] v, float nX, float nY, @ExtractionParam float[] res)
	{
		return reflect(v[0], v[1], nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, Tup2RF n, @ExtractionParam float[] res)
	{
		return reflect(vX, vY, n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, float[] n, @ExtractionParam float[] res)
	{
		return reflect(vX, vY, n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2 * dot(vX, vY, nX, nY);
		
		res[0] = nX * dot + vX;
		res[1] = nY * dot + vY;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(Tup2RF v, Tup2RF n, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1])} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(Tup2RF v, float[] n, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(Tup2RF v, float nX, float nY, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(float[] v, Tup2RF n, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(float[] v, float[] n, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(float[] v, float nX, float nY, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(float vX, float vY, Tup2RF n, @ExtractionParam T res)
	{
		return reflect(vX, vY, n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(float vX, float vY, float[] n, @ExtractionParam T res)
	{
		return reflect(vX, vY, n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T reflect(float vX, float vY, float nX, float nY, @ExtractionParam T res)
	{
		float dot = -2 * dot(vX, vY, nX, nY);
		
		res.set(nX * dot + vX, nY * dot + vY);
		
		return res;
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (t2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2RF t1, Tup2RF t2)
	{
		return dot(t1.v0(), t1.v1(), t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (t2[0], t2[1])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2RF t1, float[] t2)
	{
		return dot(t1.v0(), t1.v1(), t2[0], t2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (t2v0, t2v1)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param t2v0
	 *     The value of the x component of the second vector.
	 * @param t2v1
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2RF t1, float t2v0, float t2v1)
	{
		return dot(t1.v0(), t1.v1(), t2v0, t2v1);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (t1[0], t1[1])} and
	 * the second vector {@code (t2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t1[0], t1[1]) . v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float[] t1, Tup2RF t2)
	{
		return dot(t1[0], t1[1], t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (t1[0], t1[1])} and
	 * the second vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t1[0], t1[1]) . (t2[0], t2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float[] t1, float[] t2)
	{
		return dot(t1[0], t1[1], t2[0], t2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (t1[0], t1[1])} and
	 * the second vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t1[0], t1[1]) . (t2v0, t2v1)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second vector.
	 * @param t2v1
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float[] t1, float t2v0, float t2v1)
	{
		return dot(t1[0], t1[1], t2v0, t2v1);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (t1v0, t1v1)} and the
	 * second vector {@code (t2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t1v0, t1v1) . v2}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first vector.
	 * @param t1v1
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float t1v0, float t1v1, Tup2RF t2)
	{
		return dot(t1v0, t1v1, t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (t1v0, t1v1)} and the
	 * second vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t1v0, t1v1) . (t2[0], t2[1])}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first vector.
	 * @param t1v1
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float t1v0, float t1v1, float[] t2)
	{
		return dot(t1v0, t1v1, t2[0], t2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (t1v0, t1v1)} and the
	 * second vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t1v0, t1v1) . (t2v0, t2v1)}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first vector.
	 * @param t1v1
	 *     The value of the y component of the first vector.
	 * @param t2v0
	 *     The value of the x component of the second vector.
	 * @param t2v1
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		return t1v0 * t2v0 + t1v1 * t2v1;
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		return halfVecTo(t1.v0(), t1.v1(), t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2[0], t2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(Tup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		return halfVecTo(t1.v0(), t1.v1(), t2[0], t2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2v0, t2v1)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return halfVecTo(t1.v0(), t1.v1(), t2v0, t2v1, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (t1[0], t1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(float[] t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		return halfVecTo(t1[0], t1[1], t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2[0], t2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) - (t1[0], t1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		return halfVecTo(t1[0], t1[1], t2[0], t2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2v0, t2v1)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) - (t1[0], t1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return halfVecTo(t1[0], t1[1], t2v0, t2v1, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (t1v0, t1v1)) / 2}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res)
	{
		return halfVecTo(t1v0, t1v1, t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2[0], t2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) - (t1v0, t1v1)) / 2}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		return halfVecTo(t1v0, t1v1, t2[0], t2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2v0, t2v1)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) - (t1v0, t1v1)) / 2}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVecTo(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1v0) * 0.5f;
		res[1] = (t2v1 - t1v1) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(Tup2RF t1, Tup2RF t2, @ExtractionParam T res)
	{
		return halfVecTo(t1.v0(), t1.v1(), t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2[0], t2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(Tup2RF t1, float[] t2, @ExtractionParam T res)
	{
		return halfVecTo(t1.v0(), t1.v1(), t2[0], t2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2v0, t2v1)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return halfVecTo(t1.v0(), t1.v1(), t2v0, t2v1, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (t1[0], t1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(float[] t1, Tup2RF t2, @ExtractionParam T res)
	{
		return halfVecTo(t1[0], t1[1], t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2[0], t2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) - (t1[0], t1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(float[] t1, float[] t2, @ExtractionParam T res)
	{
		return halfVecTo(t1[0], t1[1], t2[0], t2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2v0, t2v1)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) - (t1[0], t1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return halfVecTo(t1[0], t1[1], t2v0, t2v1, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (t1v0, t1v1)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res)
	{
		return halfVecTo(t1v0, t1v1, t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2[0], t2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) - (t1v0, t1v1)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		return halfVecTo(t1v0, t1v1, t2[0], t2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2v0, t2v1)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) - (t1v0, t1v1)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVecTo(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (t2)} and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		return midPointTo(t1.v0(), t1.v1(), t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (t2[0], t2[1])} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(Tup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		return midPointTo(t1.v0(), t1.v1(), t2[0], t2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (t2v0, t2v1)} and saves the result
	 * in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return midPointTo(t1.v0(), t1.v1(), t2v0, t2v1, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1[0], t1[1])} and the point given by the origin vector {@code (t2)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (t1[0], t1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(float[] t1, Tup2RF t2, @ExtractionParam float[] res)
	{
		return midPointTo(t1[0], t1[1], t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1[0], t1[1])} and the point given by the origin vector {@code (t2[0], t2[1])} and
	 * saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) + (t1[0], t1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		return midPointTo(t1[0], t1[1], t2[0], t2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1[0], t1[1])} and the point given by the origin vector {@code (t2v0, t2v1)} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) + (t1[0], t1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return midPointTo(t1[0], t1[1], t2v0, t2v1, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1v0, t1v1)} and the point given by the origin vector {@code (t2)} and saves the result
	 * in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (t1v0, t1v1)) / 2}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res)
	{
		return midPointTo(t1v0, t1v1, t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1v0, t1v1)} and the point given by the origin vector {@code (t2[0], t2[1])} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) + (t1v0, t1v1)) / 2}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		return midPointTo(t1v0, t1v1, t2[0], t2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1v0, t1v1)} and the point given by the origin vector {@code (t2v0, t2v1)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) + (t1v0, t1v1)) / 2}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] midPointTo(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1v0) * 0.5f;
		res[1] = (t2v1 - t1v1) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (t2)} and saves the result in
	 * the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(Tup2RF t1, Tup2RF t2, @ExtractionParam T res)
	{
		return midPointTo(t1.v0(), t1.v1(), t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (t2[0], t2[1])} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(Tup2RF t1, float[] t2, @ExtractionParam T res)
	{
		return midPointTo(t1.v0(), t1.v1(), t2[0], t2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (t2v0, t2v1)} and saves the result
	 * in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return midPointTo(t1.v0(), t1.v1(), t2v0, t2v1, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1[0], t1[1])} and the point given by the origin vector {@code (t2)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (t1[0], t1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(float[] t1, Tup2RF t2, @ExtractionParam T res)
	{
		return midPointTo(t1[0], t1[1], t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1[0], t1[1])} and the point given by the origin vector {@code (t2[0], t2[1])} and
	 * saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) + (t1[0], t1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(float[] t1, float[] t2, @ExtractionParam T res)
	{
		return midPointTo(t1[0], t1[1], t2[0], t2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1[0], t1[1])} and the point given by the origin vector {@code (t2v0, t2v1)} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) + (t1[0], t1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return midPointTo(t1[0], t1[1], t2v0, t2v1, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1v0, t1v1)} and the point given by the origin vector {@code (t2)} and saves the result
	 * in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (t1v0, t1v1)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res)
	{
		return midPointTo(t1v0, t1v1, t2.v0(), t2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1v0, t1v1)} and the point given by the origin vector {@code (t2[0], t2[1])} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2[0], t2[1]) + (t1v0, t1v1)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		return midPointTo(t1v0, t1v1, t2[0], t2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (t1v0, t1v1)} and the point given by the origin vector {@code (t2v0, t2v1)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((t2v0, t2v1) + (t1v0, t1v1)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T midPointTo(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
		
		return res;
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(Tup2RF t1, Tup2RF t2)
	{
		return lenTo(t1.v0(), t1.v1(), t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, Tup2RF t1, Tup2RF t2)
	{
		return lenTo(t1.v0(), t1.v1(), t2.v0(), t2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(Tup2RF t1, float[] t2)
	{
		return lenTo(t1.v0(), t1.v1(), t2[0], t2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, Tup2RF t1, float[] t2)
	{
		return lenTo(t1.v0(), t1.v1(), t2[0], t2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(Tup2RF t1, float t2v0, float t2v1)
	{
		return lenTo(t1.v0(), t1.v1(), t2v0, t2v1);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, Tup2RF t1, float t2v0, float t2v1)
	{
		return lenTo(t1.v0(), t1.v1(), t2v0, t2v1, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1[0], t1[1])} to the
	 * point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float[] t1, Tup2RF t2)
	{
		return lenTo(t1[0], t1[1], t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1[0], t1[1])} to the
	 * point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, float[] t1, Tup2RF t2)
	{
		return lenTo(t1[0], t1[1], t2.v0(), t2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1[0], t1[1])} to the
	 * point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float[] t1, float[] t2)
	{
		return lenTo(t1[0], t1[1], t2[0], t2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1[0], t1[1])} to the
	 * point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, float[] t1, float[] t2)
	{
		return lenTo(t1[0], t1[1], t2[0], t2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1[0], t1[1])} to the
	 * point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float[] t1, float t2v0, float t2v1)
	{
		return lenTo(t1[0], t1[1], t2v0, t2v1);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1[0], t1[1])} to the
	 * point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, float[] t1, float t2v0, float t2v1)
	{
		return lenTo(t1[0], t1[1], t2v0, t2v1, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1v0, t1v1)} to the
	 * point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float t1v0, float t1v1, Tup2RF t2)
	{
		return lenTo(t1v0, t1v1, t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1v0, t1v1)} to the
	 * point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, float t1v0, float t1v1, Tup2RF t2)
	{
		return lenTo(t1v0, t1v1, t2.v0(), t2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1v0, t1v1)} to the
	 * point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float t1v0, float t1v1, float[] t2)
	{
		return lenTo(t1v0, t1v1, t2[0], t2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1v0, t1v1)} to the
	 * point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, float t1v0, float t1v1, float[] t2)
	{
		return lenTo(t1v0, t1v1, t2[0], t2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1v0, t1v1)} to the
	 * point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		return len(t2v0 - t1v0, t2v1 - t1v1);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (t1v0, t1v1)} to the
	 * point given by the origin vector {@code (t2v0, t2v1)}. If the values of all components are
	 * within the margin defined by {@code (-tolerance <= value <= tolerance)} around the other
	 * vectors components the result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float lenTo(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		return len(t2v0 - t1v0, t2v1 - t1v1, tolerance);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(Tup2RF t1, Tup2RF t2)
	{
		return sqrLenTo(t1.v0(), t1.v1(), t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(Tup2RF t1, float[] t2)
	{
		return sqrLenTo(t1.v0(), t1.v1(), t2[0], t2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(Tup2RF t1, float t2v0, float t2v1)
	{
		return sqrLenTo(t1.v0(), t1.v1(), t2v0, t2v1);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (t1[0], t1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(float[] t1, Tup2RF t2)
	{
		return sqrLenTo(t1[0], t1[1], t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - (t1[0], t1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(float[] t1, float[] t2)
	{
		return sqrLenTo(t1[0], t1[1], t2[0], t2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - (t1[0], t1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(float[] t1, float t2v0, float t2v1)
	{
		return sqrLenTo(t1[0], t1[1], t2v0, t2v1);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (t1v0, t1v1)|²}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(float t1v0, float t1v1, Tup2RF t2)
	{
		return sqrLenTo(t1v0, t1v1, t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2[0], t2[1]) - (t1v0, t1v1)|²}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(float t1v0, float t1v1, float[] t2)
	{
		return sqrLenTo(t1v0, t1v1, t2[0], t2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(t2v0, t2v1) - (t1v0, t1v1)|²}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrLenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		return sqrLen(t2v0 - t1v0, t2v1 - t1v1);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(Tup2RF t1, Tup2RF t2)
	{
		return recLenTo(t1.v0(), t1.v1(), t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(t2[0], t2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(Tup2RF t1, float[] t2)
	{
		return recLenTo(t1.v0(), t1.v1(), t2[0], t2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(t2v0, t2v1) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(Tup2RF t1, float t2v0, float t2v1)
	{
		return recLenTo(t1.v0(), t1.v1(), t2v0, t2v1);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(float[] t1, Tup2RF t2)
	{
		return recLenTo(t1[0], t1[1], t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(t2[0], t2[1]) - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(float[] t1, float[] t2)
	{
		return recLenTo(t1[0], t1[1], t2[0], t2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (t1[0], t1[1])}
	 * to the point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(t2v0, t2v1) - (t1[0], t1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(float[] t1, float t2v0, float t2v1)
	{
		return recLenTo(t1[0], t1[1], t2v0, t2v1);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(float t1v0, float t1v1, Tup2RF t2)
	{
		return recLenTo(t1v0, t1v1, t2.v0(), t2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2[0], t2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(t2[0], t2[1]) - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(float t1v0, float t1v1, float[] t2)
	{
		return recLenTo(t1v0, t1v1, t2[0], t2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (t1v0, t1v1)} to
	 * the point given by the origin vector {@code (t2v0, t2v1)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(t2v0, t2v1) - (t1v0, t1v1)|}
	 * 
	 * @param t1v0
	 *     The value of the x component of the first point.
	 * @param t1v1
	 *     The value of the y component of the first point.
	 * @param t2v0
	 *     The value of the x component of the second point.
	 * @param t2v1
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float recLenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		return recLen(t2v0 - t1v0, t2v1 - t1v1);
	}
}
