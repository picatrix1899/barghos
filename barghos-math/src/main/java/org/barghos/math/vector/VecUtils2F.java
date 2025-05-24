package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.math.MathUtils;
import org.barghos.util.tuple.floats.ITup2RF;
import org.barghos.util.tuple.floats.ITup2WF;
import org.barghos.util.tuple.floats.ITupRF;
import org.barghos.util.tuple.floats.TupUtils2F;

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
	public static float[] add(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.v0();
		res[1] = t1.v1() + t2.v1();
		
		return res;
	}
	
	public static float[] add(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.getAt(0);
		res[1] = t1.v1() + t2.getAt(1);
		
		return res;
	}
	
	public static float[] add(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2[0];
		res[1] = t1.v1() + t2[1];
		
		return res;
	}

	public static float[] add(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2v0;
		res[1] = t1.v1() + t2v1;
		
		return res;
	}
	
	public static float[] add(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2.v0();
		res[1] = t1.getAt(1) + t2.v1();
		
		return res;
	}
	
	public static float[] add(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2.getAt(0);
		res[1] = t1.getAt(1) + t2.getAt(1);
		
		return res;
	}

	public static float[] add(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2[0];
		res[1] = t1.getAt(1) + t2[1];
		
		return res;
	}

	public static float[] add(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2v0;
		res[1] = t1.getAt(1) + t2v1;
		
		return res;
	}

	public static float[] add(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2.v0();
		res[1] = t1[1] + t2.v1();
		
		return res;
	}

	public static float[] add(float[] t1, ITupRF t2, @ExtractionParam float[] res)
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

	public static float[] add(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2.v0();
		res[1] = t1v1 + t2.v1();
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
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
	public static <T extends ITup2WF> T add(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.v0(), t1.v1() + t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.getAt(0), t1.v1() + t2.getAt(1));
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2[0], t1.v1() + t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2v0, t1.v1() + t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2.v0(), t1.getAt(1) + t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2.getAt(0), t1.getAt(1) + t2.getAt(1));
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2[0], t1.getAt(1) + t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2v0, t1.getAt(1) + t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T add(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.v0(), t1[1] + t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T add(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.getAt(0), t1[1] + t2.getAt(1));
		
		return res;
	}

	public static <T extends ITup2WF> T add(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2[0], t1[1] + t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T add(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] + t2v0, t1[1] + t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T add(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2.v0(), t1v1 + t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T add(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2.getAt(0), t1v1 + t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T add(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2[0], t1v1 + t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T add(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
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
	public static <T extends ITup2RF> T addCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2.v0(), t1.v1() + t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2.getAt(0), t1.v1() + t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2[0], t1.v1() + t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2v0, t1.v1() + t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2.v0(), t1.getAt(1) + t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2.getAt(0), t1.getAt(1) + t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2[0], t1.getAt(1) + t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2v0, t1.getAt(1) + t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2.v0(), t1[1] + t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2.getAt(0), t1[1] + t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2[0], t1[1] + t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2v0, t1[1] + t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2.v0(), t1v1 + t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2.getAt(0), t1v1 + t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2[0], t1v1 + t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T addCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
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
	public static float[] sub(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2.v0();
		res[1] = t1.v1() - t2.v1();
		
		return res;
	}

	public static float[] sub(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2.getAt(0);
		res[1] = t1.v1() - t2.getAt(1);
		
		return res;
	}
	
	public static float[] sub(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2[0];
		res[1] = t1.v1() - t2[1];
		
		return res;
	}

	public static float[] sub(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2v0;
		res[1] = t1.v1() - t2v1;
		
		return res;
	}

	public static float[] sub(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2.v0();
		res[1] = t1.getAt(1) - t2.v1();
		
		return res;
	}

	public static float[] sub(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2.getAt(0);
		res[1] = t1.getAt(1) - t2.getAt(1);
		
		return res;
	}
	
	public static float[] sub(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2[0];
		res[1] = t1.getAt(1) - t2[1];
		
		return res;
	}

	public static float[] sub(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2v0;
		res[1] = t1.getAt(1) - t2v1;
		
		return res;
	}
	
	public static float[] sub(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2.v0();
		res[1] = t1[1] - t2.v1();
		
		return res;
	}

	public static float[] sub(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2.getAt(0);
		res[1] = t1[1] - t2.getAt(1);
		
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

	public static float[] sub(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2.v0();
		res[1] = t1v1 - t2.v1();
		
		return res;
	}

	public static float[] sub(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2.getAt(0);
		res[1] = t1v1 - t2.getAt(1);
		
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

	public static <T extends ITup2WF> T sub(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2.v0(), t1.v1() - t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T sub(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2.getAt(0), t1.v1() - t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T sub(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2[0], t1.v1() - t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T sub(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2v0, t1.v1() - t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T sub(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2.v0(), t1.getAt(1) - t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T sub(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2.getAt(0), t1.getAt(1) - t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T sub(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2[0], t1.getAt(1) - t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T sub(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2v0, t1.getAt(1) - t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T sub(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2.v0(), t1[1] - t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T sub(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2.getAt(0), t1[1] - t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T sub(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2[0], t1[1] - t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T sub(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] - t2v0, t1[1] - t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T sub(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2.v0(), t1v1 - t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T sub(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2.getAt(0), t1v1 - t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T sub(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2[0], t1v1 - t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T sub(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1v0 - t2v0, t1v1 - t2v1);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2.v0(), t1.v1() - t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2.getAt(0), t1.v1() - t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2[0], t1.v1() - t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2v0, t1.v1() - t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2.v0(), t1.getAt(1) - t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2.getAt(0), t1.getAt(1) - t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2[0], t1.getAt(1) - t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2v0, t1.getAt(1) - t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2.v0(), t1[1] - t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2.getAt(0), t1[1] - t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2[0], t1[1] - t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2v0, t1[1] - t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2.v0(), t1v1 - t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2.getAt(0), t1v1 - t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2[0], t1v1 - t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T subCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
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
	public static float[] mul(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2.v0();
		res[1] = t1.v1() * t2.v1();
		
		return res;
	}

	public static float[] mul(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2.getAt(0);
		res[1] = t1.v1() * t2.getAt(1);
		
		return res;
	}
	
	public static float[] mul(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2[0];
		res[1] = t1.v1() * t2[1];
		
		return res;
	}

	public static float[] mul(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2v0;
		res[1] = t1.v1() * t2v1;
		
		return res;
	}

	public static float[] mul(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2.v0();
		res[1] = t1.getAt(1) * t2.v1();
		
		return res;
	}

	public static float[] mul(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2.getAt(0);
		res[1] = t1.getAt(1)  * t2.getAt(1);
		
		return res;
	}
	
	public static float[] mul(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2[0];
		res[1] = t1.getAt(1) * t2[1];
		
		return res;
	}

	public static float[] mul(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2v0;
		res[1] = t1.getAt(1) * t2v1;
		
		return res;
	}

	
	public static float[] mul(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2.v0();
		res[1] = t1[1] * t2.v1();
		
		return res;
	}

	public static float[] mul(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2.getAt(0);
		res[1] = t1[1] * t2.getAt(1);
		
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

	public static float[] mul(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2.v0();
		res[1] = t1v1 * t2.v1();
		
		return res;
	}

	public static float[] mul(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2.getAt(0);
		res[1] = t1v1 * t2.getAt(1);
		
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

	public static <T extends ITup2WF> T mul(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2.v0(), t1.v1() * t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T mul(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2.getAt(0), t1.v1() * t2.getAt(1));
		
		return res;
	}	
	
	public static <T extends ITup2WF> T mul(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2[0], t1.v1() * t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T mul(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2v0, t1.v1() * t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T mul(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2.v0(), t1.getAt(1) * t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T mul(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2.getAt(0), t1.getAt(1) * t2.getAt(1));
		
		return res;
	}	
	
	public static <T extends ITup2WF> T mul(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2[0], t1.getAt(1) * t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T mul(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2v0, t1.getAt(1) * t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T mul(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2.v0(), t1[1] * t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T mul(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2.getAt(0), t1[1] * t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T mul(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2[0], t1[1] * t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T mul(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] * t2v0, t1[1] * t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T mul(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2.v0(), t1v1 * t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T mul(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2.getAt(0), t1v1 * t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T mul(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2[0], t1v1 * t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T mul(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1v0 * t2v0, t1v1 * t2v1);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2.v0(), t1.v1() * t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2.getAt(0), t1.v1() * t2.getAt(1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2[0], t1.v1() * t2[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2v0, t1.v1() * t2v1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2.v0(), t1.getAt(1) * t2.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2.getAt(0), t1.getAt(1) * t2.getAt(1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2[0], t1.getAt(1) * t2[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2v0, t1.getAt(1) * t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2.v0(), t1[1] * t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2.getAt(0), t1[1] * t2.getAt(1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2[0], t1[1] * t2[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2v0, t1[1] * t2v1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2.v0(), t1v1 * t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2.getAt(0), t1v1 * t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2[0], t1v1 * t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T mulCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
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
	public static float[] div(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2.v0();
		res[1] = t1.v1() / t2.v1();
		
		return res;
	}

	public static float[] div(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2.getAt(0);
		res[1] = t1.v1() / t2.getAt(1);
		
		return res;
	}
	
	public static float[] div(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2[0];
		res[1] = t1.v1() / t2[1];
		
		return res;
	}

	public static float[] div(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2v0;
		res[1] = t1.v1() / t2v1;
		
		return res;
	}

	public static float[] div(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2.v0();
		res[1] = t1.getAt(1) / t2.v1();
		
		return res;
	}

	public static float[] div(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2.getAt(0);
		res[1] = t1.getAt(1) / t2.getAt(1);
		
		return res;
	}
	
	public static float[] div(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2[0];
		res[1] = t1.getAt(1) / t2[1];
		
		return res;
	}

	public static float[] div(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2v0;
		res[1] = t1.getAt(1) / t2v1;
		
		return res;
	}
	
	public static float[] div(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2.v0();
		res[1] = t1[1] / t2.v1();
		
		return res;
	}

	public static float[] div(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2.getAt(0);
		res[1] = t1[1] / t2.getAt(1);
		
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

	public static float[] div(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2.v0();
		res[1] = t1v1 / t2.v1();
		
		return res;
	}

	public static float[] div(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2.getAt(0);
		res[1] = t1v1 / t2.getAt(1);
		
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

	public static <T extends ITup2WF> T div(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2.v0(), t1.v1() / t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T div(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2.getAt(0), t1.v1() / t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T div(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2[0], t1.v1() / t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T div(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2v0, t1.v1() / t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T div(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2.v0(), t1.getAt(1) / t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T div(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2.getAt(0), t1.getAt(1) / t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T div(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2[0], t1.getAt(1) / t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T div(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2v0, t1.getAt(1) / t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T div(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2.v0(), t1[1] / t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T div(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2.getAt(0), t1[1] / t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T div(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2[0], t1[1] / t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T div(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1[0] / t2v0, t1[1] / t2v1);
		
		return res;
	}

	public static <T extends ITup2WF> T div(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2.v0(), t1v1 / t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T div(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2.getAt(0), t1v1 / t2.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T div(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2[0], t1v1 / t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T div(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1v0 / t2v0, t1v1 / t2v1);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2.v0(), t1.v1() / t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2.getAt(0), t1.v1() / t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2[0], t1.v1() / t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2v0, t1.v1() / t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2.v0(), t1.getAt(1) / t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2.getAt(0), t1.getAt(1) / t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2[0], t1.getAt(1) / t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2v0, t1.getAt(1) / t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2.v0(), t1[1] / t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2.getAt(0), t1[1] / t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2[0], t1[1] / t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2v0, t1[1] / t2v1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2.v0(), t1v1 / t2.v1());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2.getAt(0), t1v1 / t2.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2[0], t1v1 / t2[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T divCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
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
	public static float[] fma(ITup2RF t1, ITup2RF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3.v1());
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITup2RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITup2RF t1, ITup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3[1]);
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3v1);
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITupRF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1());
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITup2RF t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]);
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3v1);
		
		return res;
	}
	
	public static float[] fma(ITup2RF t1, float[] t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3.v1());
		
		return res;
	}

	public static float[] fma(ITup2RF t1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITup2RF t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3[1]);
		
		return res;
	}

	public static float[] fma(ITup2RF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3v1);
		
		return res;
	}

	public static float[] fma(ITup2RF t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3.v1());
		
		return res;
	}

	public static float[] fma(ITup2RF t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITup2RF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3[1]);
		
		return res;
	}

	public static float[] fma(ITup2RF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3v1);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup2RF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup2RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, ITup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3v1);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3v1);
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float[] t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3v1);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3v1);
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITup2RF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.v1());
		
		return res;
	}

	public static float[] fma(float[] t1, ITup2RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3[1]);
		
		return res;
	}

	public static float[] fma(float[] t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3v1);
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.v1());
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3[2]);
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3v1);
		
		return res;
	}
	
	public static float[] fma(float[] t1, float[] t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3.v0());
		res[1] = MathUtils.fma(t1[1], t2[1], t3.v1());
		
		return res;
	}

	public static float[] fma(float[] t1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2[1], t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float[] t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3[0]);
		res[1] = MathUtils.fma(t1[1], t2[1], t3[1]);
		
		return res;
	}

	public static float[] fma(float[] t1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3v0);
		res[1] = MathUtils.fma(t1[1], t2[1], t3v1);
		
		return res;
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3.v0());
		res[1] = MathUtils.fma(t1[1], t2v1, t3.v1());
		
		return res;
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2v1, t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float[] t1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3[0]);
		res[1] = MathUtils.fma(t1[1], t2v1, t3[1]);
		
		return res;
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3v0);
		res[1] = MathUtils.fma(t1[1], t2v1, t3v1);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITup2RF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3.v1());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITup2RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, ITup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3[0]);
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3[1]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3v0);
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3v1);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITupRF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3.v1());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3[1]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3v1);
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float[] t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3.v0());
		res[1] = MathUtils.fma(t1v1, t2[1], t3.v1());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2[1], t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3[0]);
		res[1] = MathUtils.fma(t1v1, t2[1], t3[1]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3v0);
		res[1] = MathUtils.fma(t1v1, t2[1], t3v1);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3.v0());
		res[1] = MathUtils.fma(t1v1, t2v1, t3.v1());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2v1, t3.getAt(1));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3[0]);
		res[1] = MathUtils.fma(t1v1, t2v1, t3[1]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3v0);
		res[1] = MathUtils.fma(t1v1, t2v1, t3v1);
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITup2RF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITup2RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, ITup2RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3.v0()), MathUtils.fma(t1.v1(), t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3.getAt(0)), MathUtils.fma(t1.v1(), t2[1], t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3[0]), MathUtils.fma(t1.v1(), t2[1], t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3v0), MathUtils.fma(t1.v1(), t2[1], t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3.v0()), MathUtils.fma(t1.v1(), t2v1, t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3.getAt(0)), MathUtils.fma(t1.v1(), t2v1, t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3[0]), MathUtils.fma(t1.v1(), t2v1, t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3v0), MathUtils.fma(t1.v1(), t2v1, t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITup2RF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3.v0()), MathUtils.fma(t1.getAt(1), t2.v1(), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITup2RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.v1(), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, ITup2RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3[0]), MathUtils.fma(t1.getAt(1), t2.v1(), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3v0), MathUtils.fma(t1.getAt(1), t2.v1(), t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.v0()), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3[0]), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3v0), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3.v0()), MathUtils.fma(t1.getAt(1), t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2[1], t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3[0]), MathUtils.fma(t1.getAt(1), t2[1], t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3v0), MathUtils.fma(t1.getAt(1), t2[1], t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3.v0()), MathUtils.fma(t1.getAt(1), t2v1, t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2v1, t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3[0]), MathUtils.fma(t1.getAt(1), t2v1, t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3v0), MathUtils.fma(t1.getAt(1), t2v1, t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, ITup2RF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3.v0()), MathUtils.fma(t1[1], t2.v1(), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITup2RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3.getAt(0)), MathUtils.fma(t1[1], t2.v1(), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, ITup2RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3[0]), MathUtils.fma(t1[1], t2.v1(), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3v0), MathUtils.fma(t1[1], t2.v1(), t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITupRF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3.v0()), MathUtils.fma(t1[1], t2.getAt(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3[0]), MathUtils.fma(t1[1], t2.getAt(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3v0), MathUtils.fma(t1[1], t2.getAt(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3.v0()), MathUtils.fma(t1[1], t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3.getAt(0)), MathUtils.fma(t1[1], t2[1], t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3[0]), MathUtils.fma(t1[1], t2[1], t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3v0), MathUtils.fma(t1[1], t2[1], t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3.v0()), MathUtils.fma(t1[1], t2v1, t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3.getAt(0)), MathUtils.fma(t1[1], t2v1, t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3[0]), MathUtils.fma(t1[1], t2v1, t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3v0), MathUtils.fma(t1[1], t2v1, t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITup2RF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3.v0()), MathUtils.fma(t1v1, t2.v1(), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITup2RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3.getAt(0)), MathUtils.fma(t1v1, t2.v1(), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITup2RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3[0]), MathUtils.fma(t1v1, t2.v1(), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3v0), MathUtils.fma(t1v1, t2.v1(), t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITupRF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3.v0()), MathUtils.fma(t1v1, t2.getAt(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1v1, t2.getAt(1), t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3[0]), MathUtils.fma(t1v1, t2.getAt(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3v0), MathUtils.fma(t1v1, t2.getAt(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3.v0()), MathUtils.fma(t1v1, t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3.getAt(0)), MathUtils.fma(t1v1, t2[1], t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3[0]), MathUtils.fma(t1v1, t2[1], t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3v0), MathUtils.fma(t1v1, t2[1], t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3.v0()), MathUtils.fma(t1v1, t2v1, t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3.getAt(0)), MathUtils.fma(t1v1, t2v1, t3.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3[0]), MathUtils.fma(t1v1, t2v1, t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3v0), MathUtils.fma(t1v1, t2v1, t3v1));
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITup2RF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITup2RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITup2RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITup2RF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITupRF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, ITupRF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float[] t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3.v0()), MathUtils.fma(t1.v1(), t2[1], t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3.getAt(0)), MathUtils.fma(t1.v1(), t2[1], t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3[0]), MathUtils.fma(t1.v1(), t2[1], t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float[] t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3v0), MathUtils.fma(t1.v1(), t2[1], t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float t2v0, float t2v1, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3.v0()), MathUtils.fma(t1.v1(), t2v1, t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float t2v0, float t2v1, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3.getAt(0)), MathUtils.fma(t1.v1(), t2v1, t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float t2v0, float t2v1, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3[0]), MathUtils.fma(t1.v1(), t2v1, t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITup2RF t1, float t2v0, float t2v1, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3v0), MathUtils.fma(t1.v1(), t2v1, t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITup2RF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3.v0()), MathUtils.fma(t1.getAt(1), t2.v1(), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITup2RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.v1(), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITup2RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3[0]), MathUtils.fma(t1.getAt(1), t2.v1(), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITup2RF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3v0), MathUtils.fma(t1.getAt(1), t2.v1(), t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITupRF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.v0()), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3[0]), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, ITupRF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3v0), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3v1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float[] t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3.v0()), MathUtils.fma(t1.getAt(1), t2[1], t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2[1], t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3[0]), MathUtils.fma(t1.getAt(1), t2[1], t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float[] t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3v0), MathUtils.fma(t1.getAt(1), t2[1], t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3.v0()), MathUtils.fma(t1.getAt(1), t2v1, t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2v1, t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3[0]), MathUtils.fma(t1.getAt(1), t2v1, t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3v0), MathUtils.fma(t1.getAt(1), t2v1, t3v1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITup2RF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3.v0()), MathUtils.fma(t1[1], t2.v1(), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITup2RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3.getAt(0)), MathUtils.fma(t1[1], t2.v1(), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITup2RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3[0]), MathUtils.fma(t1[1], t2.v1(), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITup2RF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3v0), MathUtils.fma(t1[1], t2.v1(), t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITupRF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3.v0()), MathUtils.fma(t1[1], t2.getAt(1), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3[0]), MathUtils.fma(t1[1], t2.getAt(1), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, ITupRF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3v0), MathUtils.fma(t1[1], t2.getAt(1), t3v1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float[] t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3.v0()), MathUtils.fma(t1[1], t2[1], t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3.getAt(0)), MathUtils.fma(t1[1], t2[1], t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3[0]), MathUtils.fma(t1[1], t2[1], t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float[] t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3v0), MathUtils.fma(t1[1], t2[1], t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3.v0()), MathUtils.fma(t1[1], t2v1, t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3.getAt(0)), MathUtils.fma(t1[1], t2v1, t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3[0]), MathUtils.fma(t1[1], t2v1, t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3v0), MathUtils.fma(t1[1], t2v1, t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITup2RF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3.v0()), MathUtils.fma(t1v1, t2.v1(), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITup2RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3.getAt(0)), MathUtils.fma(t1v1, t2.v1(), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITup2RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3[0]), MathUtils.fma(t1v1, t2.v1(), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITup2RF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3v0), MathUtils.fma(t1v1, t2.v1(), t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITupRF t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3.v0()), MathUtils.fma(t1v1, t2.getAt(1), t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1v1, t2.getAt(1), t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3[0]), MathUtils.fma(t1v1, t2.getAt(1), t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, ITupRF t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3v0), MathUtils.fma(t1v1, t2.getAt(1), t3v1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float[] t2, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3.v0()), MathUtils.fma(t1v1, t2[1], t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3.getAt(0)), MathUtils.fma(t1v1, t2[1], t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3[0]), MathUtils.fma(t1v1, t2[1], t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float[] t2, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3v0), MathUtils.fma(t1v1, t2[1], t3v1));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, ITup2RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3.v0()), MathUtils.fma(t1v1, t2v1, t3.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3.getAt(0)), MathUtils.fma(t1v1, t2v1, t3.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3[0]), MathUtils.fma(t1v1, t2v1, t3[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T fmaCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, float t3v0, float t3v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3v0), MathUtils.fma(t1v1, t2v1, t3v1));
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
	public static float[] trunc(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = (int)v.v0();
		res[1] = (int)v.v1();
		
		return res;
	}

	public static float[] trunc(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = (int)v.getAt(0);
		res[1] = (int)v.getAt(1);
		
		return res;
	}
	
	public static float[] trunc(float[] v, @ExtractionParam float[] res)
	{
		res[0] = (int)v[0];
		res[1] = (int)v[1];
		
		return res;
	}

	public static float[] trunc(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = (int)v0;
		res[1] = (int)v1;
		
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
	public static <T extends ITup2WF> T trunc(ITup2RF v, @ExtractionParam T res)
	{
		res.set((int)v.v0(), (int)v.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T trunc(ITupRF v, @ExtractionParam T res)
	{
		res.set((int)v.getAt(0), (int)v.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T trunc(float[] v, @ExtractionParam T res)
	{
		res.set((int)v[0], (int)v[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T trunc(float v0, float v1, @ExtractionParam T res)
	{
		res.set((int)v0, (int)v1);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T truncCreateNew(ITup2RF v, T prototype)
	{
		return (T) prototype.createNew((int)v.v0(), (int)v.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T truncCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew((int)v.getAt(0), (int)v.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T truncCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew((int)v[0], (int)v[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T truncCreateNew(float v0, float v1, T prototype)
	{
		return (T) prototype.createNew((int)v0, (int)v1);
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
	public static float[] abs(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v.v0());
		res[1] = MathUtils.abs(v.v1());
		
		return res;
	}

	public static float[] abs(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v.getAt(0));
		res[1] = MathUtils.abs(v.getAt(1));
		
		return res;
	}
	
	public static float[] abs(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v[0]);
		res[1] = MathUtils.abs(v[1]);
		
		return res;
	}

	public static float[] abs(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v0);
		res[1] = MathUtils.abs(v1);
		
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
	public static <T extends ITup2WF> T abs(ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v.v0()), MathUtils.abs(v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T abs(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v.getAt(0)), MathUtils.abs(v.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T abs(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v[0]), MathUtils.abs(v[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T abs(float v0, float v1, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v0), MathUtils.abs(v1));
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T absCreateNew(ITup2RF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v.v0()), MathUtils.abs(v.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T absCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v.getAt(0)), MathUtils.abs(v.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T absCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v[0]), MathUtils.abs(v[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T absCreateNew(float v0, float v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v0), MathUtils.abs(v1));
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
	public static float[] sign(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v.v0());
		res[1] = MathUtils.sign(v.v1());
		
		return res;
	}

	public static float[] sign(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v.getAt(0));
		res[1] = MathUtils.sign(v.getAt(1));
		
		return res;
	}
	
	public static float[] sign(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v[0]);
		res[1] = MathUtils.sign(v[1]);
		
		return res;
	}

	public static float[] sign(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v0);
		res[1] = MathUtils.sign(v1);
		
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
	public static <T extends ITup2WF> T sign(ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v.v0()), MathUtils.sign(v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T sign(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v.getAt(0)), MathUtils.sign(v.getAt(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T sign(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v[0]), MathUtils.sign(v[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T sign(float v0, float v1, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v0), MathUtils.sign(v1));
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T signCreateNew(ITup2RF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v.v0()), MathUtils.sign(v.v1()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T signCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v.getAt(0)), MathUtils.sign(v.getAt(1)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T signCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v[0]), MathUtils.sign(v[1]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T signCreateNew(float v0, float v1, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v0), MathUtils.sign(v1));
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
	public static float[] neg(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = -v.v0();
		res[1] = -v.v1();
		
		return res;
	}

	public static float[] neg(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = -v.getAt(0);
		res[1] = -v.getAt(1);
		
		return res;
	}
	
	public static float[] neg(float[] v, @ExtractionParam float[] res)
	{
		res[0] = -v[0];
		res[1] = -v[1];
		
		return res;
	}

	public static float[] neg(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = -v0;
		res[1] = -v1;
		
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
	public static <T extends ITup2WF> T neg(ITup2RF v, @ExtractionParam T res)
	{
		res.set(-v.v0(), -v.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T neg(ITupRF v, @ExtractionParam T res)
	{
		res.set(-v.getAt(0), -v.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T neg(float[] v, @ExtractionParam T res)
	{
		res.set(-v[0], -v[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T neg(float v0, float v1, @ExtractionParam T res)
	{
		res.set(-v0, -v1);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T negCreateNew(ITup2RF v, T prototype)
	{
		return (T) prototype.createNew(-v.v0(), -v.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T negCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(-v.getAt(0), -v.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T negCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(-v[0], -v[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T negCreateNew(float v0, float v1, T prototype)
	{
		return (T) prototype.createNew(-v0, -v1);
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
	public static float[] rec(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v.v0();
		res[1] = 1.0f / v.v1();
		
		return res;
	}

	public static float[] rec(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v.getAt(0);
		res[1] = 1.0f / v.getAt(1);
		
		return res;
	}
	
	public static float[] rec(float[] v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v[0];
		res[1] = 1.0f / v[1];
		
		return res;
	}

	public static float[] rec(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v0;
		res[1] = 1.0f / v1;
		
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
	public static <T extends ITup2WF> T rec(ITup2RF v, @ExtractionParam T res)
	{
		res.set(1.0f / v.v0(), 1.0f / v.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T rec(ITupRF v, @ExtractionParam T res)
	{
		res.set(1.0f / v.getAt(0), 1.0f / v.getAt(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T rec(float[] v, @ExtractionParam T res)
	{
		res.set(1.0f / v[0], 1.0f / v[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T rec(float v0, float v1, @ExtractionParam T res)
	{
		res.set(1.0f / v0, 1.0f / v1);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T recCreateNew(ITup2RF v, T prototype)
	{
		return (T) prototype.createNew(1.0f / v.v0(), 1.0f / v.v1());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T recCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(1.0f / v.getAt(0), 1.0f / v.getAt(1));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T recCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(1.0f / v[0], 1.0f / v[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T recCreateNew(float v0, float v1, T prototype)
	{
		return (T) prototype.createNew(1.0f / v0, 1.0f / v1);
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
	public static float recLen(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLen(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLen(float[] v)
	{
		return MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float recLen(float v0, float v1)
	{
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
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
	public static float len(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float len(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float[] v)
	{
		float sqareLength = v[0] * v[0] + v[1] * v[1];
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float v0, float v1)
	{
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
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
	public static float len(float tolerance, ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float tolerance, ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float len(float tolerance, float[] v)
	{
		float sqareLength = v[0] * v[0] + v[1] * v[1];
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float tolerance, float v0, float v1)
	{
		float sqareLength = v0 * v0 + v1 * v1;
		
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
	public static float sqrLen(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float sqrLen(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLen(float[] v)
	{
		return v[0] * v[0] + v[1] * v[1];
	}

	public static float sqrLen(float v0, float v1)
	{
		return v0 * v0 + v1 * v1;
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
	public static float[] nrm(ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();

		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		
		return res;
	}

	public static float[] nrm(ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		
		return res;
	}
	
	public static float[] nrm(float[] v, @ExtractionParam float[] res)
	{
		if (TupUtils2F.Comp.isZero(v))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res[0] = v[0] * invLength;
		res[1] = v[1] * invLength;
		
		return res;
	}

	public static float[] nrm(float v0, float v1, @ExtractionParam float[] res)
	{
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		
		return res;
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
	public static float[] nrm(float tolerance, ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		
		return res;
	}

	public static float[] nrm(float tolerance, ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		
		return res;
	}
	
	public static float[] nrm(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		if (TupUtils2F.Comp.isZero(tolerance, v))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res[0] = v[0] * invLength;
		res[1] = v[1] * invLength;
		
		return res;
	}

	public static float[] nrm(float tolerance, float v0, float v1, @ExtractionParam float[] res)
	{
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		
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
	public static <T extends ITup2WF> T nrm(ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrm(ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}
	
	public static <T extends ITup2WF> T nrm(float[] v, @ExtractionParam T res)
	{
		if (TupUtils2F.Comp.isZero(v))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res.set(v[0] * invLength, v[1] * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrm(float v0, float v1, @ExtractionParam T res)
	{
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
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
	public static <T extends ITup2WF> T nrm(float tolerance, ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}
	
	public static <T extends ITup2WF> T nrm(float tolerance, ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}
	
	public static <T extends ITup2WF> T nrm(float tolerance, float[] v, @ExtractionParam T res)
	{
		if (TupUtils2F.Comp.isZero(tolerance, v))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res.set(v[0] * invLength, v[1] * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrm(float tolerance, float v0, float v1, @ExtractionParam T res)
	{
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(ITup2RF v, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(ITupRF v, T prototype)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(float[] v, T prototype)
	{
		if (TupUtils2F.Comp.isZero(v))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return (T) prototype.createNew(v[0] * invLength, v[1] * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(float v0, float v1, T prototype)
	{
		if (TupUtils2F.Comp.isZero(v0, v1))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength);
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(float tolerance, ITup2RF v, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(float tolerance, ITupRF v, T prototype)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(float tolerance, float[] v, T prototype)
	{
		if (TupUtils2F.Comp.isZero(tolerance, v))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return (T) prototype.createNew(v[0] * invLength, v[1] * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T nrmCreateNew(float tolerance, float v0, float v1, T prototype)
	{
		if (TupUtils2F.Comp.isZero(tolerance, v0, v1))
		{
			return (T) prototype.createNew(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength);
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
	public static float[] rotRad(double angle, ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		res[0] = (float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle));
		res[1] = (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle));
		
		return res;
	}

	public static float[] rotRad(double angle, ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		res[0] = (float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle));
		res[1] = (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle));
		
		return res;
	}
	
	public static float[] rotRad(double angle, float[] v, @ExtractionParam float[] res)
	{
		res[0] = (float)(v[0] * MathUtils.cos(angle) - v[1] * MathUtils.sin(angle));
		res[1] = (float)(v[0] * MathUtils.sin(angle) + v[1] * MathUtils.cos(angle));
		
		return res;
	}

	public static float[] rotRad(double angle, float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = (float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle));
		res[1] = (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle));
		
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
	public static <T extends ITup2WF> T rotRad(double angle, ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		res.set((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
		
		return res;
	}

	public static <T extends ITup2WF> T rotRad(double angle, ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		res.set((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T rotRad(double angle, float[] v, @ExtractionParam T res)
	{
		res.set((float)(v[0] * MathUtils.cos(angle) - v[1] * MathUtils.sin(angle)), (float)(v[0] * MathUtils.sin(angle) + v[1] * MathUtils.cos(angle)));
		
		return res;
	}
	
	public static  <T extends ITup2WF> T rotRad(double angle, float v0, float v1, @ExtractionParam T res)
	{
		res.set((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T rotRadCreateNew(double angle, ITup2RF v, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return (T) prototype.createNew((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T rotRadCreateNew(double angle, ITupRF v, T prototype)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return (T) prototype.createNew((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T rotRadCreateNew(double angle, float[] v, T prototype)
	{
		return (T) prototype.createNew((float)(v[0] * MathUtils.cos(angle) - v[1] * MathUtils.sin(angle)), (float)(v[0] * MathUtils.sin(angle) + v[1] * MathUtils.cos(angle)));
	}
	
	@SuppressWarnings("unchecked")
	public static  <T extends ITup2RF> T rotRadCreateNew(double angle, float v0, float v1, T prototype)
	{
		return (T) prototype.createNew((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
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
	public static float[] rotDeg(double angle, ITup2RF v, @ExtractionParam float[] res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.v0();
		float v1 = v.v1();
		
		res[0] = (float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle));
		res[1] = (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle));
		
		return res;
	}

	public static float[] rotDeg(double angle, ITupRF v, @ExtractionParam float[] res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		res[0] = (float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle));
		res[1] = (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle));
		
		return res;
	}
	
	public static float[] rotDeg(double angle, float[] v, @ExtractionParam float[] res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		res[0] = (float)(v[0] * MathUtils.cos(radAngle) - v[1] * MathUtils.sin(radAngle));
		res[1] = (float)(v[0] * MathUtils.sin(radAngle) + v[1] * MathUtils.cos(radAngle));
		
		return res;
	}

	public static float[] rotDeg(double angle, float v0, float v1, @ExtractionParam float[] res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		res[0] = (float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle));
		res[1] = (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle));
		
		return res;
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
	public static <T extends ITup2WF> T rotDeg(double angle, ITup2RF v, @ExtractionParam T res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.v0();
		float v1 = v.v1();
		
		res.set((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
		
		return res;
	}

	public static <T extends ITup2WF> T rotDeg(double angle, ITupRF v, @ExtractionParam T res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		res.set((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T rotDeg(double angle, float[] v, @ExtractionParam T res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		res.set((float)(v[0] * MathUtils.cos(radAngle) - v[1] * MathUtils.sin(radAngle)), (float)(v[0] * MathUtils.sin(radAngle) + v[1] * MathUtils.cos(radAngle)));
		
		return res;
	}

	public static <T extends ITup2WF> T rotDeg(double angle, float v0, float v1, @ExtractionParam T res)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		res.set((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
		
		return res;
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T rotDegCreateNew(double angle, ITup2RF v, T prototype)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.v0();
		float v1 = v.v1();
		
		return (T) prototype.createNew((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T rotDegCreateNew(double angle, ITupRF v, T prototype)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return (T) prototype.createNew((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T rotDegCreateNew(double angle, float[] v, T prototype)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		return (T) prototype.createNew((float)(v[0] * MathUtils.cos(radAngle) - v[1] * MathUtils.sin(radAngle)), (float)(v[0] * MathUtils.sin(radAngle) + v[1] * MathUtils.cos(radAngle)));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T rotDegCreateNew(double angle, float v0, float v1, T prototype)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		return (T) prototype.createNew((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
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
	public static float[] project(ITup2RF v, ITup2RF t, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.v0();
		float tV1 = t.v1();		
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}

	public static float[] project(ITup2RF v, ITupRF t, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);		
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}
	
	public static float[] project(ITup2RF v, float[] t, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		
		return res;
	}

	public static float[] project(ITup2RF v, float tV0, float tV1, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, ITup2RF t, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.v0();
		float tV1 = t.v1();		
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, ITupRF t, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);		
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}
	
	public static float[] project(ITupRF v, float[] t, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, float tV0, float tV1, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}
	
	public static float[] project(float[] v, ITup2RF t, @ExtractionParam float[] res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}

	public static float[] project(float[] v, ITupRF t, @ExtractionParam float[] res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}
	
	public static float[] project(float[] v, float[] t, @ExtractionParam float[] res)
	{
		float dot = v[0] * t[0] + v[1] * t[1];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		
		return res;
	}

	public static float[] project(float[] v, float tV0, float tV1, @ExtractionParam float[] res)
	{
		float dot = v[0] * tV0 + v[1] * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}

	public static float[] project(float vV0, float vV1, ITup2RF t, @ExtractionParam float[] res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}

	public static float[] project(float vV0, float vV1, ITupRF t, @ExtractionParam float[] res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}
	
	public static float[] project(float vV0, float vV1, float[] t, @ExtractionParam float[] res)
	{
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		
		return res;
	}

	public static float[] project(float vV0, float vV1, float tV0, float tV1, @ExtractionParam float[] res)
	{
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
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
	public static <T extends ITup2WF> T project(ITup2RF v, ITup2RF t, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}
	
	public static <T extends ITup2WF> T project(ITup2RF v, ITupRF t, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(ITup2RF v, float[] t, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res.set(t[0] * dot, t[1] * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(ITup2RF v, float tV0, float tV1, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(ITupRF v, ITup2RF t, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}
	
	public static <T extends ITup2WF> T project(ITupRF v, ITupRF t, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(ITupRF v, float[] t, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res.set(t[0] * dot, t[1] * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(ITupRF v, float tV0, float tV1, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}
	
	public static <T extends ITup2WF> T project(float[] v, ITup2RF t, @ExtractionParam T res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(float[] v, ITupRF t, @ExtractionParam T res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}
	
	public static <T extends ITup2WF> T project(float[] v, float[] t, @ExtractionParam T res)
	{
		float dot = v[0] * t[0] + v[1] * t[1];
		
		res.set(t[0] * dot, t[1] * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(float[] v, float tV0, float tV1, @ExtractionParam T res)
	{
		float dot = v[0] * tV0 + v[1] * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(float vV0, float vV1, ITup2RF t, @ExtractionParam T res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(float vV0, float vV1, ITupRF t, @ExtractionParam T res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}
	
	public static <T extends ITup2WF> T project(float vV0, float vV1, float[] t, @ExtractionParam T res)
	{
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res.set(t[0] * dot, t[1] * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(float vV0, float vV1, float tV0, float tV1, @ExtractionParam T res)
	{
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITup2RF v, ITup2RF t, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITup2RF v, ITupRF t, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITup2RF v, float[] t, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITup2RF v, float tV0, float tV1, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITupRF v, ITup2RF t, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITupRF v, ITupRF t, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITupRF v, float[] t, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(ITupRF v, float tV0, float tV1, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float[] v, ITup2RF t, T prototype)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float[] v, ITupRF t, T prototype)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float[] v, float[] t, T prototype)
	{
		float dot = v[0] * t[0] + v[1] * t[1];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float[] v, float tV0, float tV1, T prototype)
	{
		float dot = v[0] * tV0 + v[1] * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float vV0, float vV1, ITup2RF t, T prototype)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float vV0, float vV1, ITupRF t, T prototype)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float vV0, float vV1, float[] t, T prototype)
	{
		float dot = vV0 * t[0] + vV1 * t[1];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T projectCreateNew(float vV0, float vV1, float tV0, float tV1, T prototype)
	{
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot);
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
	public static float[] reflect(ITup2RF v, ITup2RF n, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}

	public static float[] reflect(ITup2RF v, ITupRF n, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}
	
	public static float[] reflect(ITup2RF v, float[] n, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res[0] = n[0] * dot + vV0;
		res[1] = n[1] * dot + vV1;
		
		return res;
	}

	public static float[] reflect(ITup2RF v, float nV0, float nV1, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}

	public static float[] reflect(ITupRF v, ITup2RF n, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}

	public static float[] reflect(ITupRF v, ITupRF n, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}
	
	public static float[] reflect(ITupRF v, float[] n, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res[0] = n[0] * dot + vV0;
		res[1] = n[1] * dot + vV1;
		
		return res;
	}

	public static float[] reflect(ITupRF v, float nV0, float nV1, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}
	
	public static float[] reflect(float[] v, ITup2RF n, @ExtractionParam float[] res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		res[0] = nV0 * dot + v[0];
		res[1] = nV1 * dot + v[1];
		
		return res;
	}

	public static float[] reflect(float[] v, ITupRF n, @ExtractionParam float[] res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		res[0] = nV0 * dot + v[0];
		res[1] = nV1 * dot + v[1];
		
		return res;
	}
	
	public static float[] reflect(float[] v, float[] n, @ExtractionParam float[] res)
	{
		float dot = -2 * (v[0] * n[0] + v[1] * n[1]);
		
		res[0] = n[0] * dot + v[0];
		res[1] = n[1] * dot + v[1];
		
		return res;
	}

	public static float[] reflect(float[] v, float nV0, float nV1, @ExtractionParam float[] res)
	{
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		res[0] = nV0 * dot + v[0];
		res[1] = nV1 * dot + v[1];
		
		return res;
	}

	public static float[] reflect(float vV0, float vV1, ITup2RF n, @ExtractionParam float[] res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}

	public static float[] reflect(float vV0, float vV1, ITupRF n, @ExtractionParam float[] res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}
	
	public static float[] reflect(float vV0, float vV1, float[] n, @ExtractionParam float[] res)
	{
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res[0] = n[0] * dot + vV0;
		res[1] = n[1] * dot + vV1;
		
		return res;
	}

	public static float[] reflect(float vV0, float vV1, float nV0, float nV1, @ExtractionParam float[] res)
	{
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
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
	public static <T extends ITup2WF> T reflect(ITup2RF v, ITup2RF n, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(ITup2RF v, ITupRF n, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T reflect(ITup2RF v, float[] n, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res.set(n[0] * dot + vV0, n[1] * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(ITup2RF v, float nV0, float nV1, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(ITupRF v, ITup2RF n, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(ITupRF v, ITupRF n, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T reflect(ITupRF v, float[] n, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res.set(n[0] * dot + vV0, n[1] * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(ITupRF v, float nV0, float nV1, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T reflect(float[] v, ITup2RF n, @ExtractionParam T res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		res.set(nV0 * dot + v[0], nV1 * dot + v[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(float[] v, ITupRF n, @ExtractionParam T res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		res.set(nV0 * dot + v[0], nV1 * dot + v[1]);
		
		return res;
	}
	
	public static <T extends ITup2WF> T reflect(float[] v, float[] n, @ExtractionParam T res)
	{
		float dot = -2 * (v[0] * n[0] + v[1] * n[1]);
		
		res.set(n[0] * dot + v[0], n[1] * dot + v[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(float[] v, float nV0, float nV1, @ExtractionParam T res)
	{
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		res.set(nV0 * dot + v[0], nV1 * dot + v[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(float vV0, float vV1, ITup2RF n, @ExtractionParam T res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(float vV0, float vV1, ITupRF n, @ExtractionParam T res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T reflect(float vV0, float vV1, float[] n, @ExtractionParam T res)
	{
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res.set(n[0] * dot + vV0, n[1] * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(float vV0, float vV1, float nV0, float nV1, @ExtractionParam T res)
	{
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITup2RF v, ITup2RF n, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITup2RF v, ITupRF n, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITup2RF v, float[] n, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		return (T) prototype.createNew(n[0] * dot + vV0, n[1] * dot + vV1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITup2RF v, float nV0, float nV1, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITupRF v, ITup2RF n, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITupRF v, ITupRF n, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITupRF v, float[] n, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		return (T) prototype.createNew(n[0] * dot + vV0, n[1] * dot + vV1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(ITupRF v, float nV0, float nV1, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float[] v, ITup2RF n, T prototype)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		return (T) prototype.createNew(nV0 * dot + v[0], nV1 * dot + v[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float[] v, ITupRF n, T prototype)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		return (T) prototype.createNew(nV0 * dot + v[0], nV1 * dot + v[1]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float[] v, float[] n, T prototype)
	{
		float dot = -2 * (v[0] * n[0] + v[1] * n[1]);
		
		return (T) prototype.createNew(n[0] * dot + v[0], n[1] * dot + v[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float[] v, float nV0, float nV1, T prototype)
	{
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		return (T) prototype.createNew(nV0 * dot + v[0], nV1 * dot + v[1]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float vV0, float vV1, ITup2RF n, T prototype)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float vV0, float vV1, ITupRF n, T prototype)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float vV0, float vV1, float[] n, T prototype)
	{
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		return (T) prototype.createNew(n[0] * dot + vV0, n[1] * dot + vV1);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T reflectCreateNew(float vV0, float vV1, float nV0, float nV1, T prototype)
	{
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1);
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
	public static float dot(ITup2RF t1, ITup2RF t2)
	{
		return t1.v0() * t2.v0() + t1.v1() * t2.v1();
	}

	public static float dot(ITup2RF t1, ITupRF t2)
	{
		return t1.v0() * t2.getAt(0) + t1.v1() * t2.getAt(1);
	}
	
	public static float dot(ITup2RF t1, float[] t2)
	{
		return t1.v0() * t2[0] + t1.v1() * t2[1];
	}

	public static float dot(ITup2RF t1, float t2v0, float t2v1)
	{
		return t1.v0() * t2v0 + t1.v1() * t2v1;
	}

	public static float dot(ITupRF t1, ITup2RF t2)
	{
		return t1.getAt(0) * t2.v0() + t1.getAt(1) * t2.v1();
	}

	public static float dot(ITupRF t1, ITupRF t2)
	{
		return t1.getAt(0) * t2.getAt(0) + t1.getAt(1) * t2.getAt(1);
	}
	
	public static float dot(ITupRF t1, float[] t2)
	{
		return t1.getAt(0) * t2[0] + t1.getAt(1) * t2[1];
	}

	public static float dot(ITupRF t1, float t2v0, float t2v1)
	{
		return t1.getAt(0) * t2v0 + t1.getAt(1) * t2v1;
	}
	
	public static float dot(float[] t1, ITup2RF t2)
	{
		return t1[0] * t2.v0() + t1[1] * t2.v1();
	}

	public static float dot(float[] t1, ITupRF t2)
	{
		return t1[0] * t2.getAt(0) + t1[1] * t2.getAt(1);
	}
	
	public static float dot(float[] t1, float[] t2)
	{
		return t1[0] * t2[0] + t1[1] * t2[1];
	}

	public static float dot(float[] t1, float t2v0, float t2v1)
	{
		return t1[0] * t2v0 + t1[1] * t2v1;
	}

	public static float dot(float t1v0, float t1v1, ITup2RF t2)
	{
		return t1v0 * t2.v0() + t1v1 * t2.v1();
	}
	
	public static float dot(float t1v0, float t1v1, ITupRF t2)
	{
		return t1v0 * t2.getAt(0) + t1v1 * t2.getAt(1);
	}
	
	public static float dot(float t1v0, float t1v1, float[] t2)
	{
		return t1v0 * t2[0] + t1v1 * t2[1];
	}

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
	public static float[] halfVecTo(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.v0()) * 0.5f;
		res[1] = (t2.v1() - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1.v0()) * 0.5f;
		res[1] = (t2.getAt(1) - t1.v1()) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1.v0()) * 0.5f;
		res[1] = (t2[1] - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1.v0()) * 0.5f;
		res[1] = (t2v1 - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.getAt(0)) * 0.5f;
		res[1] = (t2.v1() - t1.getAt(1)) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1.getAt(0)) * 0.5f;
		res[1] = (t2.getAt(1) - t1.getAt(1)) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1.getAt(0)) * 0.5f;
		res[1] = (t2[1] - t1.getAt(1)) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1.getAt(0)) * 0.5f;
		res[1] = (t2v1 - t1.getAt(1)) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1[0]) * 0.5f;
		res[1] = (t2.v1() - t1[1]) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1[0]) * 0.5f;
		res[1] = (t2.getAt(1) - t1[1]) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1[0]) * 0.5f;
		res[1] = (t2[1] - t1[1]) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1[0]) * 0.5f;
		res[1] = (t2v1 - t1[1]) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1v0) * 0.5f;
		res[1] = (t2.v1() - t1v1) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1v0) * 0.5f;
		res[1] = (t2.getAt(1) - t1v1) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1v0) * 0.5f;
		res[1] = (t2[1] - t1v1) * 0.5f;
		
		return res;
	}

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
	public static <T extends ITup2WF> T halfVecTo(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T halfVecTo(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T halfVecTo(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T halfVecTo(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T halfVecTo(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T halfVecTo(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T halfVecToCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
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
	public static float[] midPointTo(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.v0()) * 0.5f;
		res[1] = (t2.v1() - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1.v0()) * 0.5f;
		res[1] = (t2.getAt(1) - t1.v1()) * 0.5f;
		
		return res;
	}
	
	public static float[] midPointTo(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1.v0()) * 0.5f;
		res[1] = (t2[1] - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1.v0()) * 0.5f;
		res[1] = (t2v1 - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1[0]) * 0.5f;
		res[1] = (t2.v1() - t1[1]) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1[0]) * 0.5f;
		res[1] = (t2.getAt(1) - t1[1]) * 0.5f;
		
		return res;
	}
	
	public static float[] midPointTo(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1[0]) * 0.5f;
		res[1] = (t2[1] - t1[1]) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1[0]) * 0.5f;
		res[1] = (t2v1 - t1[1]) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1v0) * 0.5f;
		res[1] = (t2.v1() - t1v1) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1v0) * 0.5f;
		res[1] = (t2.getAt(1) - t1v1) * 0.5f;
		
		return res;
	}
	
	public static float[] midPointTo(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1v0) * 0.5f;
		res[1] = (t2[1] - t1v1) * 0.5f;
		
		return res;
	}

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
	public static <T extends ITup2WF> T midPointTo(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T midPointTo(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T midPointTo(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T midPointTo(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T midPointTo(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T midPointTo(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
		
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
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T midPointToCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
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
	public static float lenTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
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
	public static float lenTo(float tolerance, ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float lenTo(float tolerance, ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float lenTo(float tolerance, ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
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
	public static float sqrLenTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float sqrLenTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float sqrLenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float sqrLenTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float sqrLenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float sqrLenTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		return v0 * v0 + v1 * v1;
	}

	public static float sqrLenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		return v0 * v0 + v1 * v1;
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
	public static float recLenTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLenTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLenTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLenTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float recLenTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float recLenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
}
