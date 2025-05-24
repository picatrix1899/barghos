package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.math.MathUtils;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITupRF;
import org.barghos.util.tuple.floats.TupUtils3F;

/**
 * This class provides vector operations for two dimensions.
 */
public class VecUtils3F
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
	public static float[] add(ITup3RF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.v0();
		res[1] = t1.v1() + t2.v1();
		res[2] = t1.v2() + t2.v2();
		
		return res;
	}
	
	public static float[] add(ITup3RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.getAt(0);
		res[1] = t1.v1() + t2.getAt(1);
		res[2] = t1.v2() + t2.getAt(2);
		
		return res;
	}
	
	public static float[] add(ITup3RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2[0];
		res[1] = t1.v1() + t2[1];
		res[2] = t1.v2() + t2[2];
		
		return res;
	}

	public static float[] add(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2v0;
		res[1] = t1.v1() + t2v1;
		res[2] = t1.v2() + t2v2;
		
		return res;
	}
	
	public static float[] add(ITupRF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2.v0();
		res[1] = t1.getAt(1) + t2.v1();
		res[2] = t1.getAt(2) + t2.v2();
		
		return res;
	}
	
	public static float[] add(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2.getAt(0);
		res[1] = t1.getAt(1) + t2.getAt(1);
		res[2] = t1.getAt(2) + t2.getAt(2);
		
		return res;
	}

	public static float[] add(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2[0];
		res[1] = t1.getAt(1) + t2[1];
		res[2] = t1.getAt(2) + t2[2];
	
		return res;
	}

	public static float[] add(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) + t2v0;
		res[1] = t1.getAt(1) + t2v1;
		res[2] = t1.getAt(2) + t2v2;
		
		return res;
	}

	public static float[] add(float[] t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2.v0();
		res[1] = t1[1] + t2.v1();
		res[2] = t1[2] + t2.v2();
		
		return res;
	}

	public static float[] add(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2.getAt(0);
		res[1] = t1[1] + t2.getAt(1);
		res[2] = t1[2] + t2.getAt(2);
		
		return res;
	}

	public static float[] add(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2[0];
		res[1] = t1[1] + t2[1];
		res[2] = t1[2] + t2[2];
		
		return res;
	}

	public static float[] add(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2v0;
		res[1] = t1[1] + t2v1;
		res[2] = t1[2] + t2v2;
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2.v0();
		res[1] = t1v1 + t2.v1();
		res[2] = t1v2 + t2.v2();
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2.getAt(0);
		res[1] = t1v1 + t2.getAt(1);
		res[2] = t1v2 + t2.getAt(2);
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2[0];
		res[1] = t1v1 + t2[1];
		res[2] = t1v2 + t2[2];
		
		return res;
	}

	public static float[] add(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 + t2v0;
		res[1] = t1v1 + t2v1;
		res[2] = t1v2 + t2v2;
		
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
	public static <T extends ITup3WF> T add(ITup3RF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.v0(), t1.v1() + t2.v1(), t1.v2() + t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T add(ITup3RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.getAt(0), t1.v1() + t2.getAt(1), t1.v2() + t2.getAt(2));
		
		return res;
	}

	public static <T extends ITup3WF> T add(ITup3RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2[0], t1.v1() + t2[1], t1.v2() + t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T add(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2v0, t1.v1() + t2v1, t1.v2() + t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T add(ITupRF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2.v0(), t1.getAt(1) + t2.v1(), t1.getAt(2) + t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T add(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2.getAt(0), t1.getAt(1) + t2.getAt(1), t1.getAt(2) + t2.getAt(2));
		
		return res;
	}

	public static <T extends ITup3WF> T add(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2[0], t1.getAt(1) + t2[1], t1.getAt(2) + t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T add(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) + t2v0, t1.getAt(1) + t2v1, t1.getAt(2) + t2v2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T add(float[] t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.v0(), t1[1] + t2.v1(), t1[2] + t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T add(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.getAt(0), t1[1] + t2.getAt(1), t1[2] + t2.getAt(2));
		
		return res;
	}

	public static <T extends ITup3WF> T add(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2[0], t1[1] + t2[1], t1[2] + t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T add(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2v0, t1[1] + t2v1, t1[2] + t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T add(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2.v0(), t1v1 + t2.v1(), t1v2 + t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T add(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2.getAt(0), t1v1 + t2.getAt(1), t1v2 + t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T add(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2[0], t1v1 + t2[1], t1v2 + t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T add(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1v0 + t2v0, t1v1 + t2v1, t1v2 + t2v2);
		
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
	public static <T extends ITup3RF> T addCreateNew(ITup3RF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2.v0(), t1.v1() + t2.v1(), t1.v2() + t2.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(ITup3RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2.getAt(0), t1.v1() + t2.getAt(1), t1.v2() + t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(ITup3RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2[0], t1.v1() + t2[1], t1.v2() + t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() + t2v0, t1.v1() + t2v1, t1.v2() + t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(ITupRF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2.v0(), t1.getAt(1) + t2.v1(), t1.getAt(2) + t2.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2.getAt(0), t1.getAt(1) + t2.getAt(1), t1.getAt(2) + t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2[0], t1.getAt(1) + t2[1], t1.getAt(2) + t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) + t2v0, t1.getAt(1) + t2v1, t1.getAt(2) + t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float[] t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2.v0(), t1[1] + t2.v1(), t1[2] + t2.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2.getAt(0), t1[1] + t2.getAt(1), t1[2] + t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2[0], t1[1] + t2[1], t1[2] + t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1[0] + t2v0, t1[1] + t2v1, t1[2] + t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2.v0(), t1v1 + t2.v1(), t1v2 + t2.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2.getAt(0), t1v1 + t2.getAt(1), t1v2 + t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2[0], t1v1 + t2[1], t1v2 + t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T addCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1v0 + t2v0, t1v1 + t2v1, t1v2 + t2v2);
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
	public static float[] sub(ITup3RF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2.v0();
		res[1] = t1.v1() - t2.v1();
		res[2] = t1.v2() - t2.v2();
		
		return res;
	}

	public static float[] sub(ITup3RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2.getAt(0);
		res[1] = t1.v1() - t2.getAt(1);
		res[2] = t1.v2() - t2.getAt(2);
		
		return res;
	}
	
	public static float[] sub(ITup3RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2[0];
		res[1] = t1.v1() - t2[1];
		res[2] = t1.v2() - t2[2];
		
		return res;
	}

	public static float[] sub(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2v0;
		res[1] = t1.v1() - t2v1;
		res[2] = t1.v2() - t2v2;
		
		return res;
	}

	public static float[] sub(ITupRF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2.v0();
		res[1] = t1.getAt(1) - t2.v1();
		res[2] = t1.getAt(2) - t2.v2();
		
		return res;
	}

	public static float[] sub(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2.getAt(0);
		res[1] = t1.getAt(1) - t2.getAt(1);
		res[2] = t1.getAt(2) - t2.getAt(2);
		
		return res;
	}
	
	public static float[] sub(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2[0];
		res[1] = t1.getAt(1) - t2[1];
		res[2] = t1.getAt(2) - t2[2];
		
		return res;
	}

	public static float[] sub(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) - t2v0;
		res[1] = t1.getAt(1) - t2v1;
		res[2] = t1.getAt(2) - t2v2;
		
		return res;
	}
	
	public static float[] sub(float[] t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2.v0();
		res[1] = t1[1] - t2.v1();
		res[2] = t1[2] - t2.v2();
		
		return res;
	}

	public static float[] sub(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2.getAt(0);
		res[1] = t1[1] - t2.getAt(1);
		res[2] = t1[2] - t2.getAt(2);
		
		return res;
	}
	
	public static float[] sub(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2[0];
		res[1] = t1[1] - t2[1];
		res[2] = t1[2] - t2[2];
		
		return res;
	}

	public static float[] sub(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2v0;
		res[1] = t1[1] - t2v1;
		res[2] = t1[2] - t2v2;
		
		return res;
	}

	public static float[] sub(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2.v0();
		res[1] = t1v1 - t2.v1();
		res[2] = t1v2 - t2.v2();
		
		return res;
	}

	public static float[] sub(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2.getAt(0);
		res[1] = t1v1 - t2.getAt(1);
		res[2] = t1v2 - t2.getAt(2);
		
		return res;
	}
	
	public static float[] sub(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2[0];
		res[1] = t1v1 - t2[1];
		res[2] = t1v2 - t2[2];
		
		return res;
	}

	public static float[] sub(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 - t2v0;
		res[1] = t1v1 - t2v1;
		res[2] = t1v2 - t2v2;
		
		return res;
	}

	public static <T extends ITup3WF> T sub(ITup3RF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2.v0(), t1.v1() - t2.v1(), t1.v2() - t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T sub(ITup3RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2.getAt(0), t1.v1() - t2.getAt(1), t1.v2() - t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T sub(ITup3RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2[0], t1.v1() - t2[1], t1.v2() - t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T sub(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.v0() - t2v0, t1.v1() - t2v1, t1.v2() - t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T sub(ITupRF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2.v0(), t1.getAt(1) - t2.v1(), t1.getAt(2) - t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T sub(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2.getAt(0), t1.getAt(1) - t2.getAt(1), t1.getAt(2) - t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T sub(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2[0], t1.getAt(1) - t2[1], t1.getAt(2) - t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T sub(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) - t2v0, t1.getAt(1) - t2v1, t1.getAt(2) - t2v2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T sub(float[] t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2.v0(), t1[1] - t2.v1(), t1[2] - t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T sub(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2.getAt(0), t1[1] - t2.getAt(1), t1[2] - t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T sub(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2[0], t1[1] - t2[1], t1[2] - t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T sub(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2v0, t1[1] - t2v1, t1[2] - t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T sub(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2.v0(), t1v1 - t2.v1(), t1v2 - t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T sub(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2.getAt(0), t1v1 - t2.getAt(1), t1v2 - t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T sub(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2[0], t1v1 - t2[1], t1v2 - t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T sub(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1v0 - t2v0, t1v1 - t2v1, t1v2 - t2v2);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITup3RF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2.v0(), t1.v1() - t2.v1(), t1.v2() - t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITup3RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2.getAt(0), t1.v1() - t2.getAt(1), t1.v2() - t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITup3RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2[0], t1.v1() - t2[1], t1.v2() - t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() - t2v0, t1.v1() - t2v1, t1.v2() - t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITupRF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2.v0(), t1.getAt(1) - t2.v1(), t1.getAt(2) - t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2.getAt(0), t1.getAt(1) - t2.getAt(1), t1.getAt(2) - t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2[0], t1.getAt(1) - t2[1], t1.getAt(2) - t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) - t2v0, t1.getAt(1) - t2v1, t1.getAt(2) - t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float[] t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2.v0(), t1[1] - t2.v1(), t1[2] - t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2.getAt(0), t1[1] - t2.getAt(1), t1[2] - t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2[0], t1[1] - t2[1], t1[2] - t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1[0] - t2v0, t1[1] - t2v1, t1[2] - t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2.v0(), t1v1 - t2.v1(), t1v2 - t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2.getAt(0), t1v1 - t2.getAt(1), t1v2 - t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2[0], t1v1 - t2[1], t1v2 - t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T subCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1v0 - t2v0, t1v1 - t2v1, t1v2 - t2v2);
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
	public static float[] mul(ITup3RF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2.v0();
		res[1] = t1.v1() * t2.v1();
		res[2] = t1.v2() * t2.v2();
		
		return res;
	}

	public static float[] mul(ITup3RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2.getAt(0);
		res[1] = t1.v1() * t2.getAt(1);
		res[2] = t1.v2() * t2.getAt(2);
		
		return res;
	}
	
	public static float[] mul(ITup3RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2[0];
		res[1] = t1.v1() * t2[1];
		res[2] = t1.v2() * t2[2];
		
		return res;
	}

	public static float[] mul(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2v0;
		res[1] = t1.v1() * t2v1;
		res[2] = t1.v2() * t2v1;
		
		return res;
	}

	public static float[] mul(ITupRF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2.v0();
		res[1] = t1.getAt(1) * t2.v1();
		res[2] = t1.getAt(2) * t2.v2();
		
		return res;
	}

	public static float[] mul(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2.getAt(0);
		res[1] = t1.getAt(1)  * t2.getAt(1);
		res[2] = t1.getAt(2)  * t2.getAt(2);
		
		return res;
	}
	
	public static float[] mul(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2[0];
		res[1] = t1.getAt(1) * t2[1];
		res[2] = t1.getAt(2) * t2[2];
		
		return res;
	}

	public static float[] mul(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) * t2v0;
		res[1] = t1.getAt(1) * t2v1;
		res[2] = t1.getAt(2) * t2v2;
		
		return res;
	}

	
	public static float[] mul(float[] t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2.v0();
		res[1] = t1[1] * t2.v1();
		res[2] = t1[2] * t2.v2();
		
		return res;
	}

	public static float[] mul(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2.getAt(0);
		res[1] = t1[1] * t2.getAt(1);
		res[2] = t1[2] * t2.getAt(2);
		
		return res;
	}
	
	public static float[] mul(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2[0];
		res[1] = t1[1] * t2[1];
		res[2] = t1[2] * t2[2];
		
		return res;
	}

	public static float[] mul(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2v0;
		res[1] = t1[1] * t2v1;
		res[2] = t1[2] * t2v2;
		
		return res;
	}

	public static float[] mul(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2.v0();
		res[1] = t1v1 * t2.v1();
		res[2] = t1v2 * t2.v2();
		
		return res;
	}

	public static float[] mul(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2.getAt(0);
		res[1] = t1v1 * t2.getAt(1);
		res[2] = t1v2 * t2.getAt(2);
		
		return res;
	}
	
	public static float[] mul(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2[0];
		res[1] = t1v1 * t2[1];
		res[2] = t1v2 * t2[2];
		
		return res;
	}

	public static float[] mul(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 * t2v0;
		res[1] = t1v1 * t2v1;
		res[2] = t1v2 * t2v2;
		
		return res;
	}

	public static <T extends ITup3WF> T mul(ITup3RF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2.v0(), t1.v1() * t2.v1(), t1.v2() * t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T mul(ITup3RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2.getAt(0), t1.v1() * t2.getAt(1), t1.v2() * t2.getAt(2));
		
		return res;
	}	
	
	public static <T extends ITup3WF> T mul(ITup3RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2[0], t1.v1() * t2[1], t1.v2() * t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T mul(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.v0() * t2v0, t1.v1() * t2v1, t1.v2() * t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T mul(ITupRF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2.v0(), t1.getAt(1) * t2.v1(), t1.getAt(2) * t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T mul(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2.getAt(0), t1.getAt(1) * t2.getAt(1), t1.getAt(2) * t2.getAt(2));
		
		return res;
	}	
	
	public static <T extends ITup3WF> T mul(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2[0], t1.getAt(1) * t2[1], t1.getAt(2) * t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T mul(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) * t2v0, t1.getAt(1) * t2v1,t1.getAt(2) * t2v2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T mul(float[] t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2.v0(), t1[1] * t2.v1(), t1[2] * t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T mul(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2.getAt(0), t1[1] * t2.getAt(1), t1[2] * t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T mul(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2[0], t1[1] * t2[1], t1[2] * t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T mul(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2v0, t1[1] * t2v1, t1[2] * t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T mul(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2.v0(), t1v1 * t2.v1(), t1v2 * t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T mul(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2.getAt(0), t1v1 * t2.getAt(1), t1v2 * t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T mul(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2[0], t1v1 * t2[1], t1v2 * t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T mul(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1v0 * t2v0, t1v1 * t2v1, t1v2 * t2v2);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITup3RF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2.v0(), t1.v1() * t2.v1(), t1.v2() * t2.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITup3RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2.getAt(0), t1.v1() * t2.getAt(1), t1.v2() * t2.getAt(2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITup3RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2[0], t1.v1() * t2[1], t1.v2() * t2[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() * t2v0, t1.v1() * t2v1, t1.v2() * t2v2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITupRF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2.v0(), t1.getAt(1) * t2.v1(), t1.getAt(2) * t2.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2.getAt(0), t1.getAt(1) * t2.getAt(1), t1.getAt(2) * t2.getAt(2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2[0], t1.getAt(1) * t2[1], t1.getAt(2) * t2[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) * t2v0, t1.getAt(1) * t2v1, t1.getAt(2) * t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float[] t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2.v0(), t1[1] * t2.v1(), t1[2] * t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2.getAt(0), t1[1] * t2.getAt(1), t1[2] * t2.getAt(2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2[0], t1[1] * t2[1], t1[2] * t2[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1[0] * t2v0, t1[1] * t2v1, t1[2] * t2v2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2.v0(), t1v1 * t2.v1(), t1v2 * t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2.getAt(0), t1v1 * t2.getAt(1), t1v2 * t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2[0], t1v1 * t2[1], t1v2 * t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T mulCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1v0 * t2v0, t1v1 * t2v1, t1v2 * t2v2);
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
	public static float[] div(ITup3RF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2.v0();
		res[1] = t1.v1() / t2.v1();
		res[2] = t1.v2() / t2.v2();
		
		return res;
	}

	public static float[] div(ITup3RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2.getAt(0);
		res[1] = t1.v1() / t2.getAt(1);
		res[2] = t1.v2() / t2.getAt(2);
		
		return res;
	}
	
	public static float[] div(ITup3RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2[0];
		res[1] = t1.v1() / t2[1];
		res[2] = t1.v2() / t2[2];
		
		return res;
	}

	public static float[] div(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2v0;
		res[1] = t1.v1() / t2v1;
		res[2] = t1.v2() / t2v2;
		
		return res;
	}

	public static float[] div(ITupRF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2.v0();
		res[1] = t1.getAt(1) / t2.v1();
		res[2] = t1.getAt(2) / t2.v2();
		
		return res;
	}

	public static float[] div(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2.getAt(0);
		res[1] = t1.getAt(1) / t2.getAt(1);
		res[2] = t1.getAt(2) / t2.getAt(2);
		
		return res;
	}
	
	public static float[] div(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2[0];
		res[1] = t1.getAt(1) / t2[1];
		res[2] = t1.getAt(2) / t2[2];
		
		return res;
	}

	public static float[] div(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1.getAt(0) / t2v0;
		res[1] = t1.getAt(1) / t2v1;
		res[2] = t1.getAt(2) / t2v2;
		
		return res;
	}
	
	public static float[] div(float[] t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2.v0();
		res[1] = t1[1] / t2.v1();
		res[2] = t1[2] / t2.v2();
		
		return res;
	}

	public static float[] div(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2.getAt(0);
		res[1] = t1[1] / t2.getAt(1);
		res[2] = t1[2] / t2.getAt(2);
		
		return res;
	}
	
	public static float[] div(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2[0];
		res[1] = t1[1] / t2[1];
		res[2] = t1[2] / t2[2];
		
		return res;
	}

	public static float[] div(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2v0;
		res[1] = t1[1] / t2v1;
		res[2] = t1[2] / t2v2;
		
		return res;
	}

	public static float[] div(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2.v0();
		res[1] = t1v1 / t2.v1();
		res[2] = t1v2 / t2.v2();
		
		return res;
	}

	public static float[] div(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2.getAt(0);
		res[1] = t1v1 / t2.getAt(1);
		res[2] = t1v2 / t2.getAt(2);
		
		return res;
	}
	
	public static float[] div(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2[0];
		res[1] = t1v1 / t2[1];
		res[2] = t1v2 / t2[2];
		
		return res;
	}

	public static float[] div(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1v0 / t2v0;
		res[1] = t1v1 / t2v1;
		res[2] = t1v2 / t2v2;
		
		return res;
	}

	public static <T extends ITup3WF> T div(ITup3RF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2.v0(), t1.v1() / t2.v1(), t1.v2() / t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T div(ITup3RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2.getAt(0), t1.v1() / t2.getAt(1), t1.v2() / t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T div(ITup3RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2[0], t1.v1() / t2[1], t1.v2() / t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T div(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.v0() / t2v0, t1.v1() / t2v1, t1.v2() / t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T div(ITupRF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2.v0(), t1.getAt(1) / t2.v1(), t1.getAt(2) / t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T div(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2.getAt(0), t1.getAt(1) / t2.getAt(1), t1.getAt(2) / t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T div(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2[0], t1.getAt(1) / t2[1], t1.getAt(2) / t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T div(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1.getAt(0) / t2v0, t1.getAt(1) / t2v1, t1.getAt(2) / t2v2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T div(float[] t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2.v0(), t1[1] / t2.v1(), t1[2] / t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T div(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2.getAt(0), t1[1] / t2.getAt(1), t1[2] / t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T div(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2[0], t1[1] / t2[1], t1[2] / t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T div(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2v0, t1[1] / t2v1, t1[2] / t2v2);
		
		return res;
	}

	public static <T extends ITup3WF> T div(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2.v0(), t1v1 / t2.v1(), t1v2 / t2.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T div(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2.getAt(0), t1v1 / t2.getAt(1), t1v2 / t2.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T div(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2[0], t1v1 / t2[1], t1v2 / t2[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T div(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1v0 / t2v0, t1v1 / t2v1, t1v2 / t2v2);
		
		return res;
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITup3RF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2.v0(), t1.v1() / t2.v1(), t1.v2() / t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITup3RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2.getAt(0), t1.v1() / t2.getAt(1), t1.v2() / t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITup3RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2[0], t1.v1() / t2[1], t1.v2() / t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.v0() / t2v0, t1.v1() / t2v1, t1.v2() / t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITupRF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2.v0(), t1.getAt(1) / t2.v1(), t1.getAt(2) / t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2.getAt(0), t1.getAt(1) / t2.getAt(1), t1.getAt(2) / t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2[0], t1.getAt(1) / t2[1], t1.getAt(2) / t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1.getAt(0) / t2v0, t1.getAt(1) / t2v1, t1.getAt(2) / t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float[] t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2.v0(), t1[1] / t2.v1(), t1[2] / t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2.getAt(0), t1[1] / t2.getAt(1), t1[2] / t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2[0], t1[1] / t2[1], t1[2] / t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1[0] / t2v0, t1[1] / t2v1, t1[2] / t2v2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2.v0(), t1v1 / t2.v1(), t1v2 / t2.v2());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2.getAt(0), t1v1 / t2.getAt(1), t1v2 / t2.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2[0], t1v1 / t2[1], t1v2 / t2[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T divCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1v0 / t2v0, t1v1 / t2v1, t1v2 / t2v2);
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
	public static float[] fma(ITup3RF t1, ITup3RF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3.v1());
		res[2] = MathUtils.fma(t1.v2(), t2.v2(), t3.v2());
		
		return res;
	}

	public static float[] fma(ITup3RF t1, ITup3RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3.getAt(1));
		res[2] = MathUtils.fma(t1.v2(), t2.v2(), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITup3RF t1, ITup3RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3[1]);
		res[2] = MathUtils.fma(t1.v2(), t2.v2(), t3[2]);
		
		return res;
	}

	public static float[] fma(ITup3RF t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3v1);
		res[2] = MathUtils.fma(t1.v2(), t2.v2(), t3v2);
		
		return res;
	}

	public static float[] fma(ITup3RF t1, ITupRF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1());
		res[2] = MathUtils.fma(t1.v2(), t2.getAt(2), t3.v2());
		
		return res;
	}

	public static float[] fma(ITup3RF t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1));
		res[2] = MathUtils.fma(t1.v2(), t2.getAt(2), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITup3RF t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]);
		res[2] = MathUtils.fma(t1.v2(), t2.getAt(2), t3[2]);
		
		return res;
	}

	public static float[] fma(ITup3RF t1, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2.getAt(1), t3v1);
		res[2] = MathUtils.fma(t1.v2(), t2.getAt(2), t3v2);
		
		return res;
	}
	
	public static float[] fma(ITup3RF t1, float[] t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3.v1());
		res[2] = MathUtils.fma(t1.v2(), t2[2], t3.v2());
		
		return res;
	}

	public static float[] fma(ITup3RF t1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3.getAt(1));
		res[2] = MathUtils.fma(t1.v2(), t2[2], t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITup3RF t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3[1]);
		res[2] = MathUtils.fma(t1.v2(), t2[2], t3[2]);
		
		return res;
	}

	public static float[] fma(ITup3RF t1, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3v1);
		res[2] = MathUtils.fma(t1.v2(), t2[2], t3v2);
		
		return res;
	}

	public static float[] fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3.v1());
		res[2] = MathUtils.fma(t1.v2(), t2v2, t3.v2());
		
		return res;
	}

	public static float[] fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3.getAt(1));
		res[2] = MathUtils.fma(t1.v2(), t2v2, t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3[1]);
		res[2] = MathUtils.fma(t1.v2(), t2v2, t3[2]);
		
		return res;
	}

	public static float[] fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3v1);
		res[2] = MathUtils.fma(t1.v2(), t2v2, t3v2);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup3RF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3.v1());
		res[2] = MathUtils.fma(t1.getAt(2), t2.v2(), t3.v2());
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup3RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3.getAt(1));
		res[2] = MathUtils.fma(t1.getAt(2), t2.v2(), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, ITup3RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3[1]);
		res[2] = MathUtils.fma(t1.getAt(2), t2.v2(), t3[2]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.v0(), t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2.v1(), t3v1);
		res[2] = MathUtils.fma(t1.getAt(2), t2.v2(), t3v2);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.v1());
		res[2] = MathUtils.fma(t1.getAt(2), t2.getAt(2), t3.v2());
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.getAt(1));
		res[2] = MathUtils.fma(t1.getAt(2), t2.getAt(2), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3[1]);
		res[2] = MathUtils.fma(t1.getAt(2), t2.getAt(2), t3[2]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2.getAt(1), t3v1);
		res[2] = MathUtils.fma(t1.getAt(2), t2.getAt(2), t3v2);
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float[] t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3.v1());
		res[2] = MathUtils.fma(t1.getAt(2), t2[2], t3.v2());
		
		return res;
	}

	public static float[] fma(ITupRF t1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3.getAt(1));
		res[2] = MathUtils.fma(t1.getAt(2), t2[2], t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3[1]);
		res[2] = MathUtils.fma(t1.getAt(2), t2[2], t3[2]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2[0], t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2[1], t3v1);
		res[2] = MathUtils.fma(t1.getAt(2), t2[2], t3v2);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3.v0());
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3.v1());
		res[2] = MathUtils.fma(t1.getAt(2), t2v2, t3.v2());
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3.getAt(1));
		res[2] = MathUtils.fma(t1.getAt(2), t2v2, t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3[0]);
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3[1]);
		res[2] = MathUtils.fma(t1.getAt(2), t2v2, t3[2]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.getAt(0), t2v0, t3v0);
		res[1] = MathUtils.fma(t1.getAt(1), t2v1, t3v1);
		res[2] = MathUtils.fma(t1.getAt(2), t2v2, t3v2);
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITup3RF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.v1());
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3.v2());
		
		return res;
	}

	public static float[] fma(float[] t1, ITup3RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1));
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITup3RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3[1]);
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3[2]);
		
		return res;
	}

	public static float[] fma(float[] t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3v1);
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3v2);
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.v1());
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3.v2());
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1));
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3[1]);
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3[2]);
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1[1], t2.getAt(1), t3v1);
		res[2] = MathUtils.fma(t1[2], t2.getAt(2), t3v2);
		
		return res;
	}
	
	public static float[] fma(float[] t1, float[] t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3.v0());
		res[1] = MathUtils.fma(t1[1], t2[1], t3.v1());
		res[1] = MathUtils.fma(t1[2], t2[2], t3.v2());
		
		return res;
	}

	public static float[] fma(float[] t1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2[1], t3.getAt(1));
		res[2] = MathUtils.fma(t1[2], t2[2], t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float[] t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3[0]);
		res[1] = MathUtils.fma(t1[1], t2[1], t3[1]);
		res[2] = MathUtils.fma(t1[2], t2[2], t3[2]);
		
		return res;
	}

	public static float[] fma(float[] t1, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2[0], t3v0);
		res[1] = MathUtils.fma(t1[1], t2[1], t3v1);
		res[2] = MathUtils.fma(t1[2], t2[2], t3v2);
		
		return res;
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3.v0());
		res[1] = MathUtils.fma(t1[1], t2v1, t3.v1());
		res[2] = MathUtils.fma(t1[2], t2v2, t3.v2());
		
		return res;
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1[1], t2v1, t3.getAt(1));
		res[2] = MathUtils.fma(t1[2], t2v2, t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float[] t1, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3[0]);
		res[1] = MathUtils.fma(t1[1], t2v1, t3[1]);
		res[2] = MathUtils.fma(t1[2], t2v2, t3[2]);
		
		return res;
	}

	public static float[] fma(float[] t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2v0, t3v0);
		res[1] = MathUtils.fma(t1[1], t2v1, t3v1);
		res[2] = MathUtils.fma(t1[2], t2v2, t3v2);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3.v1());
		res[2] = MathUtils.fma(t1v2, t2.v2(), t3.v2());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3.getAt(1));
		res[2] = MathUtils.fma(t1v2, t2.v2(), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3[0]);
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3[1]);
		res[2] = MathUtils.fma(t1v2, t2.v2(), t3[2]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3v0);
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3v1);
		res[2] = MathUtils.fma(t1v2, t2.v2(), t3v2);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, ITupRF t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3.v0());
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3.v1());
		res[2] = MathUtils.fma(t1v2, t2.getAt(2), t3.v2());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3.getAt(1));
		res[2] = MathUtils.fma(t1v2, t2.getAt(2), t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float t1v2, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3[0]);
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3[1]);
		res[2] = MathUtils.fma(t1v2, t2.getAt(2), t3[2]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.getAt(0), t3v0);
		res[1] = MathUtils.fma(t1v1, t2.getAt(1), t3v1);
		res[2] = MathUtils.fma(t1v2, t2.getAt(2), t3v2);
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float t1v2, float[] t2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3.v0());
		res[1] = MathUtils.fma(t1v1, t2[1], t3.v1());
		res[2] = MathUtils.fma(t1v2, t2[2], t3.v2());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2[1], t3.getAt(1));
		res[2] = MathUtils.fma(t1v2, t2[2], t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float t1v2, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3[0]);
		res[1] = MathUtils.fma(t1v1, t2[1], t3[1]);
		res[2] = MathUtils.fma(t1v2, t2[2], t3[2]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2[0], t3v0);
		res[1] = MathUtils.fma(t1v1, t2[1], t3v1);
		res[2] = MathUtils.fma(t1v2, t2[2], t3v2);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3.v0());
		res[1] = MathUtils.fma(t1v1, t2v1, t3.v1());
		res[2] = MathUtils.fma(t1v2, t2v2, t3.v2());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3.getAt(0));
		res[1] = MathUtils.fma(t1v1, t2v1, t3.getAt(1));
		res[2] = MathUtils.fma(t1v2, t2v2, t3.getAt(2));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3[0]);
		res[1] = MathUtils.fma(t1v1, t2v1, t3[1]);
		res[2] = MathUtils.fma(t1v2, t2v2, t3[2]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2v0, t3v0);
		res[1] = MathUtils.fma(t1v1, t2v1, t3v1);
		res[2] = MathUtils.fma(t1v2, t2v2, t3v2);
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, ITup3RF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()), MathUtils.fma(t1.v2(), t2.getAt(2), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, ITup3RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1.v2(), t2.getAt(2), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITup3RF t1, ITup3RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]), MathUtils.fma(t1.v2(), t2.getAt(2), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1), MathUtils.fma(t1.v2(), t2.getAt(2), t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, ITupRF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()), MathUtils.fma(t1.v2(), t2.getAt(2), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1.v2(), t2.getAt(2), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITup3RF t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]), MathUtils.fma(t1.v2(), t2.getAt(2), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1), MathUtils.fma(t1.v2(), t2.getAt(2), t3v2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITup3RF t1, float[] t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3.v0()), MathUtils.fma(t1.v1(), t2[1], t3.v1()), MathUtils.fma(t1.v2(), t2[2], t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3.getAt(0)), MathUtils.fma(t1.v1(), t2[1], t3.getAt(1)), MathUtils.fma(t1.v2(), t2[2], t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITup3RF t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3[0]), MathUtils.fma(t1.v1(), t2[1], t3[1]), MathUtils.fma(t1.v2(), t2[2], t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3v0), MathUtils.fma(t1.v1(), t2[1], t3v1), MathUtils.fma(t1.v2(), t2[2], t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3.v0()), MathUtils.fma(t1.v1(), t2v1, t3.v1()), MathUtils.fma(t1.v2(), t2v2, t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3.getAt(0)), MathUtils.fma(t1.v1(), t2v1, t3.getAt(1)), MathUtils.fma(t1.v2(), t2v2, t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3[0]), MathUtils.fma(t1.v1(), t2v1, t3[1]), MathUtils.fma(t1.v2(), t2v2, t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITup3RF t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2v0, t3v0), MathUtils.fma(t1.v1(), t2v1, t3v1), MathUtils.fma(t1.v2(), t2v2, t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, ITup3RF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3.v0()), MathUtils.fma(t1.getAt(1), t2.v1(), t3.v1()), MathUtils.fma(t1.getAt(2), t2.v2(), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, ITup3RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.v1(), t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2.v2(), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITupRF t1, ITup3RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3[0]), MathUtils.fma(t1.getAt(1), t2.v1(), t3[1]), MathUtils.fma(t1.getAt(2), t2.v2(), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.v0(), t3v0), MathUtils.fma(t1.getAt(1), t2.v1(), t3v1), MathUtils.fma(t1.getAt(2), t2.v2(), t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, ITupRF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.v0()), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.v1()), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITupRF t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3[0]), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3[1]), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3v0), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3v1), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3v2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITupRF t1, float[] t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3.v0()), MathUtils.fma(t1.getAt(1), t2[1], t3.v1()), MathUtils.fma(t1.getAt(2), t2[2], t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2[1], t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2[2], t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITupRF t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3[0]), MathUtils.fma(t1.getAt(1), t2[1], t3[1]), MathUtils.fma(t1.getAt(2), t2[2], t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2[0], t3v0), MathUtils.fma(t1.getAt(1), t2[1], t3v1), MathUtils.fma(t1.getAt(2), t2[2], t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3.v0()), MathUtils.fma(t1.getAt(1), t2v1, t3.v1()), MathUtils.fma(t1.getAt(2), t2v2, t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2v1, t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2v2, t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(ITupRF t1, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3[0]), MathUtils.fma(t1.getAt(1), t2v1, t3[1]), MathUtils.fma(t1.getAt(2), t2v2, t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(ITupRF t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.getAt(0), t2v0, t3v0), MathUtils.fma(t1.getAt(1), t2v1, t3v1), MathUtils.fma(t1.getAt(2), t2v2, t3v2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float[] t1, ITup3RF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3.v0()), MathUtils.fma(t1[1], t2.v1(), t3.v1()), MathUtils.fma(t1[2], t2.v2(), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, ITup3RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3.getAt(0)), MathUtils.fma(t1[1], t2.v1(), t3.getAt(1)), MathUtils.fma(t1[2], t2.v2(), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float[] t1, ITup3RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3[0]), MathUtils.fma(t1[1], t2.v1(), t3[1]), MathUtils.fma(t1[2], t2.v2(), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3v0), MathUtils.fma(t1[1], t2.v1(), t3v1), MathUtils.fma(t1[2], t2.v2(), t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, ITupRF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3.v0()), MathUtils.fma(t1[1], t2.getAt(1), t3.v1()), MathUtils.fma(t1[2], t2.getAt(2), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1[2], t2.getAt(2), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float[] t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3[0]), MathUtils.fma(t1[1], t2.getAt(1), t3[1]), MathUtils.fma(t1[2], t2.getAt(2), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.getAt(0), t3v0), MathUtils.fma(t1[1], t2.getAt(1), t3v1), MathUtils.fma(t1[2], t2.getAt(2), t3v2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float[] t1, float[] t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3.v0()), MathUtils.fma(t1[1], t2[1], t3.v1()), MathUtils.fma(t1[2], t2[2], t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3.getAt(0)), MathUtils.fma(t1[1], t2[1], t3.getAt(1)), MathUtils.fma(t1[2], t2[2], t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float[] t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3[0]), MathUtils.fma(t1[1], t2[1], t3[1]), MathUtils.fma(t1[2], t2[2], t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3v0), MathUtils.fma(t1[1], t2[1], t3v1), MathUtils.fma(t1[2], t2[2], t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3.v0()), MathUtils.fma(t1[1], t2v1, t3.v1()), MathUtils.fma(t1[2], t2v2, t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3.getAt(0)), MathUtils.fma(t1[1], t2v1, t3.getAt(1)), MathUtils.fma(t1[2], t2v2, t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float[] t1, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3[0]), MathUtils.fma(t1[1], t2v1, t3[1]), MathUtils.fma(t1[2], t2v2, t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float[] t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2v0, t3v0), MathUtils.fma(t1[1], t2v1, t3v1), MathUtils.fma(t1[2], t2v2, t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3.v0()), MathUtils.fma(t1v1, t2.v1(), t3.v1()), MathUtils.fma(t1v2, t2.v2(), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3.getAt(0)), MathUtils.fma(t1v1, t2.v1(), t3.getAt(1)), MathUtils.fma(t1v2, t2.v2(), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3[0]), MathUtils.fma(t1v1, t2.v1(), t3[1]), MathUtils.fma(t1v2, t2.v2(), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITup3RF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.v0(), t3v0), MathUtils.fma(t1v1, t2.v1(), t3v1), MathUtils.fma(t1v2, t2.v2(), t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITupRF t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3.v0()), MathUtils.fma(t1v1, t2.getAt(1), t3.v1()), MathUtils.fma(t1v2, t2.getAt(2), t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1v1, t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1v2, t2.getAt(2), t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3[0]), MathUtils.fma(t1v1, t2.getAt(1), t3[1]), MathUtils.fma(t1v2, t2.getAt(2), t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, ITupRF t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.getAt(0), t3v0), MathUtils.fma(t1v1, t2.getAt(1), t3v1), MathUtils.fma(t1v2, t2.getAt(2), t3v2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float[] t2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3.v0()), MathUtils.fma(t1v1, t2[1], t3.v1()), MathUtils.fma(t1v2, t2[2], t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3.getAt(0)), MathUtils.fma(t1v1, t2[1], t3.getAt(1)), MathUtils.fma(t1v2, t2[2], t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3[0]), MathUtils.fma(t1v1, t2[1], t3[1]), MathUtils.fma(t1v2, t2[2], t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float[] t2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3v0), MathUtils.fma(t1v1, t2[1], t3v1), MathUtils.fma(t1v2, t2[2], t3v2));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, ITup3RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3.v0()), MathUtils.fma(t1v1, t2v1, t3.v1()), MathUtils.fma(t1v2, t2v2, t3.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3.getAt(0)), MathUtils.fma(t1v1, t2v1, t3.getAt(1)), MathUtils.fma(t1v2, t2v2, t3.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3[0]), MathUtils.fma(t1v1, t2v1, t3[1]), MathUtils.fma(t1v2, t2v2, t3[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T fma(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2v0, t3v0), MathUtils.fma(t1v1, t2v1, t3v1), MathUtils.fma(t1v2, t2v2, t3v2));
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITup3RF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.v0(), t3.v0()), MathUtils.fma(t1.v1(), t2.v1(), t3.v1()), MathUtils.fma(t1.v2(), t2.v2(), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITup3RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.v0(), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.v1(), t3.getAt(1)), MathUtils.fma(t1.v2(), t2.v2(), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITup3RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.v0(), t3[0]), MathUtils.fma(t1.v1(), t2.v1(), t3[1]), MathUtils.fma(t1.v2(), t2.v2(), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.v0(), t3v0), MathUtils.fma(t1.v1(), t2.v1(), t3v1), MathUtils.fma(t1.v2(), t2.v2(), t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITupRF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()), MathUtils.fma(t1.v2(), t2.getAt(2), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1.v2(), t2.getAt(2), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]), MathUtils.fma(t1.v2(), t2.getAt(2), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, ITupRF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1), MathUtils.fma(t1.v2(), t2.getAt(2), t3v2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float[] t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3.v0()), MathUtils.fma(t1.v1(), t2[1], t3.v1()), MathUtils.fma(t1.v2(), t2[2], t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3.getAt(0)), MathUtils.fma(t1.v1(), t2[1], t3.getAt(1)), MathUtils.fma(t1.v2(), t2[2], t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3[0]), MathUtils.fma(t1.v1(), t2[1], t3[1]), MathUtils.fma(t1.v2(), t2[2], t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float[] t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2[0], t3v0), MathUtils.fma(t1.v1(), t2[1], t3v1), MathUtils.fma(t1.v2(), t2[2], t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3.v0()), MathUtils.fma(t1.v1(), t2v1, t3.v1()), MathUtils.fma(t1.v2(), t2v2, t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3.getAt(0)), MathUtils.fma(t1.v1(), t2v1, t3.getAt(1)), MathUtils.fma(t1.v2(), t2v2, t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3[0]), MathUtils.fma(t1.v1(), t2v1, t3[1]), MathUtils.fma(t1.v2(), t2v2, t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.v0(), t2v0, t3v0), MathUtils.fma(t1.v1(), t2v1, t3v1), MathUtils.fma(t1.v2(), t2v2, t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITup3RF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3.v0()), MathUtils.fma(t1.getAt(1), t2.v1(), t3.v1()), MathUtils.fma(t1.getAt(2), t2.v2(), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITup3RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.v1(), t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2.v2(), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITup3RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3[0]), MathUtils.fma(t1.getAt(1), t2.v1(), t3[1]), MathUtils.fma(t1.getAt(2), t2.v2(), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.v0(), t3v0), MathUtils.fma(t1.getAt(1), t2.v1(), t3v1), MathUtils.fma(t1.getAt(2), t2.v2(), t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITupRF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.v0()), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.v1()), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3[0]), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3[1]), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, ITupRF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3v0), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3v1), MathUtils.fma(t1.getAt(2), t2.getAt(2), t3v2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float[] t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3.v0()), MathUtils.fma(t1.getAt(1), t2[1], t3.v1()), MathUtils.fma(t1.getAt(2), t2[2], t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2[1], t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2[2], t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3[0]), MathUtils.fma(t1.getAt(1), t2[1], t3[1]), MathUtils.fma(t1.getAt(2), t2[2], t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float[] t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2[0], t3v0), MathUtils.fma(t1.getAt(1), t2[1], t3v1), MathUtils.fma(t1.getAt(2), t2[2], t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3.v0()), MathUtils.fma(t1.getAt(1), t2v1, t3.v1()), MathUtils.fma(t1.getAt(2), t2v2, t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2v1, t3.getAt(1)), MathUtils.fma(t1.getAt(2), t2v2, t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3[0]), MathUtils.fma(t1.getAt(1), t2v1, t3[1]), MathUtils.fma(t1.getAt(2), t2v2, t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1.getAt(0), t2v0, t3v0), MathUtils.fma(t1.getAt(1), t2v1, t3v1), MathUtils.fma(t1.getAt(2), t2v2, t3v2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITup3RF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3.v0()), MathUtils.fma(t1[1], t2.v1(), t3.v1()), MathUtils.fma(t1[2], t2.v2(), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITup3RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3.getAt(0)), MathUtils.fma(t1[1], t2.v1(), t3.getAt(1)), MathUtils.fma(t1[2], t2.v2(), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITup3RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3[0]), MathUtils.fma(t1[1], t2.v1(), t3[1]), MathUtils.fma(t1[2], t2.v2(), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITup3RF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.v0(), t3v0), MathUtils.fma(t1[1], t2.v1(), t3v1), MathUtils.fma(t1[2], t2.v2(), t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITupRF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3.v0()), MathUtils.fma(t1[1], t2.getAt(1), t3.v1()), MathUtils.fma(t1[2], t2.getAt(2), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1[2], t2.getAt(2), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3[0]), MathUtils.fma(t1[1], t2.getAt(1), t3[1]), MathUtils.fma(t1[2], t2.getAt(2), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, ITupRF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2.getAt(0), t3v0), MathUtils.fma(t1[1], t2.getAt(1), t3v1), MathUtils.fma(t1[2], t2.getAt(2), t3v2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float[] t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3.v0()), MathUtils.fma(t1[1], t2[1], t3.v1()), MathUtils.fma(t1[2], t2[2], t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3.getAt(0)), MathUtils.fma(t1[1], t2[1], t3.getAt(1)), MathUtils.fma(t1[2], t2[2], t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3[0]), MathUtils.fma(t1[1], t2[1], t3[1]), MathUtils.fma(t1[2], t2[2], t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float[] t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2[0], t3v0), MathUtils.fma(t1[1], t2[1], t3v1), MathUtils.fma(t1[2], t2[2], t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3.v0()), MathUtils.fma(t1[1], t2v1, t3.v1()), MathUtils.fma(t1[2], t2v2, t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3.getAt(0)), MathUtils.fma(t1[1], t2v1, t3.getAt(1)), MathUtils.fma(t1[2], t2v2, t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3[0]), MathUtils.fma(t1[1], t2v1, t3[1]), MathUtils.fma(t1[2], t2v2, t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1[0], t2v0, t3v0), MathUtils.fma(t1[1], t2v1, t3v1), MathUtils.fma(t1[1], t2v2, t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3.v0()), MathUtils.fma(t1v1, t2.v1(), t3.v1()), MathUtils.fma(t1v2, t2.v2(), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3.getAt(0)), MathUtils.fma(t1v1, t2.v1(), t3.getAt(1)), MathUtils.fma(t1v2, t2.v2(), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3[0]), MathUtils.fma(t1v1, t2.v1(), t3[1]), MathUtils.fma(t1v2, t2.v2(), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.v0(), t3v0), MathUtils.fma(t1v1, t2.v1(), t3v1), MathUtils.fma(t1v2, t2.v2(), t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3.v0()), MathUtils.fma(t1v1, t2.getAt(1), t3.v1()), MathUtils.fma(t1v2, t2.getAt(2), t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1v1, t2.getAt(1), t3.getAt(1)), MathUtils.fma(t1v2, t2.getAt(2), t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3[0]), MathUtils.fma(t1v1, t2.getAt(1), t3[1]), MathUtils.fma(t1v2, t2.getAt(2), t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2.getAt(0), t3v0), MathUtils.fma(t1v1, t2.getAt(1), t3v1), MathUtils.fma(t1v2, t2.getAt(2), t3v2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3.v0()), MathUtils.fma(t1v1, t2[1], t3.v1()), MathUtils.fma(t1v2, t2[2], t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3.getAt(0)), MathUtils.fma(t1v1, t2[1], t3.getAt(1)), MathUtils.fma(t1v2, t2[2], t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3[0]), MathUtils.fma(t1v1, t2[1], t3[1]), MathUtils.fma(t1v2, t2[2], t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2[0], t3v0), MathUtils.fma(t1v1, t2[1], t3v1), MathUtils.fma(t1v2, t2[2], t3v2));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, ITup3RF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3.v0()), MathUtils.fma(t1v1, t2v1, t3.v1()), MathUtils.fma(t1v2, t2v2, t3.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, ITupRF t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3.getAt(0)), MathUtils.fma(t1v1, t2v1, t3.getAt(1)), MathUtils.fma(t1v2, t2v2, t3.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, float[] t3, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3[0]), MathUtils.fma(t1v1, t2v1, t3[1]), MathUtils.fma(t1v2, t2v2, t3[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T fmaCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, float t3v0, float t3v1, float t3v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.fma(t1v0, t2v0, t3v0), MathUtils.fma(t1v1, t2v1, t3v1), MathUtils.fma(t1v2, t2v2, t3v2));
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
	public static float[] trunc(ITup3RF v, @ExtractionParam float[] res)
	{
		res[0] = (int)v.v0();
		res[1] = (int)v.v1();
		res[2] = (int)v.v2();
		
		return res;
	}

	public static float[] trunc(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = (int)v.getAt(0);
		res[1] = (int)v.getAt(1);
		res[2] = (int)v.getAt(2);
		
		return res;
	}
	
	public static float[] trunc(float[] v, @ExtractionParam float[] res)
	{
		res[0] = (int)v[0];
		res[1] = (int)v[1];
		res[2] = (int)v[2];
		
		return res;
	}

	public static float[] trunc(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = (int)v0;
		res[1] = (int)v1;
		res[2] = (int)v2;
		
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
	public static <T extends ITup3WF> T trunc(ITup3RF v, @ExtractionParam T res)
	{
		res.set((int)v.v0(), (int)v.v1(), (int)v.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T trunc(ITupRF v, @ExtractionParam T res)
	{
		res.set((int)v.getAt(0), (int)v.getAt(1), (int)v.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T trunc(float[] v, @ExtractionParam T res)
	{
		res.set((int)v[0], (int)v[1], (int)v[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T trunc(float v0, float v1, float v2, @ExtractionParam T res)
	{
		res.set((int)v0, (int)v1, (int)v2);
		
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
	public static <T extends ITup3RF> T truncCreateNew(ITup3RF v, T prototype)
	{
		return (T) prototype.createNew((int)v.v0(), (int)v.v1(), (int)v.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T truncCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew((int)v.getAt(0), (int)v.getAt(1), (int)v.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T truncCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew((int)v[0], (int)v[1], (int)v[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T truncCreateNew(float v0, float v1, float v2, T prototype)
	{
		return (T) prototype.createNew((int)v0, (int)v1, (int)v2);
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
	public static float[] abs(ITup3RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v.v0());
		res[1] = MathUtils.abs(v.v1());
		res[2] = MathUtils.abs(v.v2());
		
		return res;
	}

	public static float[] abs(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v.getAt(0));
		res[1] = MathUtils.abs(v.getAt(1));
		res[2] = MathUtils.abs(v.getAt(2));
		
		return res;
	}
	
	public static float[] abs(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v[0]);
		res[1] = MathUtils.abs(v[1]);
		res[2] = MathUtils.abs(v[2]);
		
		return res;
	}

	public static float[] abs(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v0);
		res[1] = MathUtils.abs(v1);
		res[2] = MathUtils.abs(v2);
		
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
	public static <T extends ITup3WF> T abs(ITup3RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v.v0()), MathUtils.abs(v.v1()), MathUtils.abs(v.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T abs(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v.getAt(0)), MathUtils.abs(v.getAt(1)), MathUtils.abs(v.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T abs(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v[0]), MathUtils.abs(v[1]), MathUtils.abs(v[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T abs(float v0, float v1, float v2, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v0), MathUtils.abs(v1), MathUtils.abs(v2));
		
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
	public static <T extends ITup3RF> T absCreateNew(ITup3RF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v.v0()), MathUtils.abs(v.v1()), MathUtils.abs(v.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T absCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v.getAt(0)), MathUtils.abs(v.getAt(1)), MathUtils.abs(v.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T absCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v[0]), MathUtils.abs(v[1]), MathUtils.abs(v[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T absCreateNew(float v0, float v1, float v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.abs(v0), MathUtils.abs(v1), MathUtils.abs(v2));
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
	public static float[] sign(ITup3RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v.v0());
		res[1] = MathUtils.sign(v.v1());
		res[2] = MathUtils.sign(v.v2());
		
		return res;
	}

	public static float[] sign(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v.getAt(0));
		res[1] = MathUtils.sign(v.getAt(1));
		res[2] = MathUtils.sign(v.getAt(2));
		
		return res;
	}
	
	public static float[] sign(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v[0]);
		res[1] = MathUtils.sign(v[1]);
		res[2] = MathUtils.sign(v[2]);
		
		return res;
	}

	public static float[] sign(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sign(v0);
		res[1] = MathUtils.sign(v1);
		res[2] = MathUtils.sign(v2);
		
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
	public static <T extends ITup3WF> T sign(ITup3RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v.v0()), MathUtils.sign(v.v1()), MathUtils.sign(v.v2()));
		
		return res;
	}

	public static <T extends ITup3WF> T sign(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v.getAt(0)), MathUtils.sign(v.getAt(1)), MathUtils.sign(v.getAt(2)));
		
		return res;
	}
	
	public static <T extends ITup3WF> T sign(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v[0]), MathUtils.sign(v[1]), MathUtils.sign(v[2]));
		
		return res;
	}

	public static <T extends ITup3WF> T sign(float v0, float v1, float v2, @ExtractionParam T res)
	{
		res.set(MathUtils.sign(v0), MathUtils.sign(v1), MathUtils.sign(v2));
		
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
	public static <T extends ITup3RF> T signCreateNew(ITup3RF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v.v0()), MathUtils.sign(v.v1()), MathUtils.sign(v.v2()));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T signCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v.getAt(0)), MathUtils.sign(v.getAt(1)), MathUtils.sign(v.getAt(2)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T signCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v[0]), MathUtils.sign(v[1]), MathUtils.sign(v[2]));
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T signCreateNew(float v0, float v1, float v2, T prototype)
	{
		return (T) prototype.createNew(MathUtils.sign(v0), MathUtils.sign(v1), MathUtils.sign(v2));
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
	public static float[] neg(ITup3RF v, @ExtractionParam float[] res)
	{
		res[0] = -v.v0();
		res[1] = -v.v1();
		res[2] = -v.v2();
		
		return res;
	}

	public static float[] neg(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = -v.getAt(0);
		res[1] = -v.getAt(1);
		res[2] = -v.getAt(2);
		
		return res;
	}
	
	public static float[] neg(float[] v, @ExtractionParam float[] res)
	{
		res[0] = -v[0];
		res[1] = -v[1];
		res[2] = -v[2];
		
		return res;
	}

	public static float[] neg(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = -v0;
		res[1] = -v1;
		res[2] = -v2;
		
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
	public static <T extends ITup3WF> T neg(ITup3RF v, @ExtractionParam T res)
	{
		res.set(-v.v0(), -v.v1(), -v.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T neg(ITupRF v, @ExtractionParam T res)
	{
		res.set(-v.getAt(0), -v.getAt(1), -v.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T neg(float[] v, @ExtractionParam T res)
	{
		res.set(-v[0], -v[1], v[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T neg(float v0, float v1, float v2, @ExtractionParam T res)
	{
		res.set(-v0, -v1, -v2);
		
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
	public static <T extends ITup3RF> T negCreateNew(ITup3RF v, T prototype)
	{
		return (T) prototype.createNew(-v.v0(), -v.v1(), -v.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T negCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(-v.getAt(0), -v.getAt(1), -v.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T negCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(-v[0], -v[1], -v[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T negCreateNew(float v0, float v1, float v2, T prototype)
	{
		return (T) prototype.createNew(-v0, -v1, -v2);
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
	public static float[] rec(ITup3RF v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v.v0();
		res[1] = 1.0f / v.v1();
		res[2] = 1.0f / v.v2();
		
		return res;
	}

	public static float[] rec(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v.getAt(0);
		res[1] = 1.0f / v.getAt(1);
		res[2] = 1.0f / v.getAt(2);
		
		return res;
	}
	
	public static float[] rec(float[] v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v[0];
		res[1] = 1.0f / v[1];
		res[2] = 1.0f / v[2];
		
		return res;
	}

	public static float[] rec(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v0;
		res[1] = 1.0f / v1;
		res[2] = 1.0f / v2;
		
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
	public static <T extends ITup3WF> T rec(ITup3RF v, @ExtractionParam T res)
	{
		res.set(1.0f / v.v0(), 1.0f / v.v1(), 1.0f / v.v2());
		
		return res;
	}

	public static <T extends ITup3WF> T rec(ITupRF v, @ExtractionParam T res)
	{
		res.set(1.0f / v.getAt(0), 1.0f / v.getAt(1), 1.0f / v.getAt(2));
		
		return res;
	}
	
	public static <T extends ITup3WF> T rec(float[] v, @ExtractionParam T res)
	{
		res.set(1.0f / v[0], 1.0f / v[1], 1.0f / v[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T rec(float v0, float v1, float v2, @ExtractionParam T res)
	{
		res.set(1.0f / v0, 1.0f / v1, 1.0f / v2);
		
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
	public static <T extends ITup3RF> T recCreateNew(ITup3RF v, T prototype)
	{
		return (T) prototype.createNew(1.0f / v.v0(), 1.0f / v.v1(), 1.0f / v.v2());
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T recCreateNew(ITupRF v, T prototype)
	{
		return (T) prototype.createNew(1.0f / v.getAt(0), 1.0f / v.getAt(1), 1.0f / v.getAt(2));
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T recCreateNew(float[] v, T prototype)
	{
		return (T) prototype.createNew(1.0f / v[0], 1.0f / v[1], 1.0f / v[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T recCreateNew(float v0, float v1, float v2, T prototype)
	{
		return (T) prototype.createNew(1.0f / v0, 1.0f / v1, 1.0f / v2);
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
	public static float recLen(ITup3RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLen(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLen(float[] v)
	{
		return MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}

	public static float recLen(float v0, float v1, float v2)
	{
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
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
	public static float len(ITup3RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float len(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float[] v)
	{
		float sqareLength = v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float v0, float v1, float v2)
	{
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
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
	public static float len(float tolerance, ITup3RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float tolerance, ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float len(float tolerance, float[] v)
	{
		float sqareLength = v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float tolerance, float v0, float v1, float v2)
	{
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
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
	public static float sqrLen(ITup3RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float sqrLen(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLen(float[] v)
	{
		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}

	public static float sqrLen(float v0, float v1, float v2)
	{
		return v0 * v0 + v1 * v1 + v2 * v2;
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
	public static float[] nrm(ITup3RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();

		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		
		return res;
	}

	public static float[] nrm(ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		
		return res;
	}
	
	public static float[] nrm(float[] v, @ExtractionParam float[] res)
	{
		if (TupUtils3F.Comp.isZero(v))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res[0] = v[0] * invLength;
		res[1] = v[1] * invLength;
		res[2] = v[2] * invLength;
		
		return res;
	}

	public static float[] nrm(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		
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
	public static float[] nrm(float tolerance, ITup3RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		
		return res;
	}

	public static float[] nrm(float tolerance, ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		
		return res;
	}
	
	public static float[] nrm(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		if (TupUtils3F.Comp.isZero(tolerance, v))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res[0] = v[0] * invLength;
		res[1] = v[1] * invLength;
		res[2] = v[2] * invLength;
		
		return res;
	}

	public static float[] nrm(float tolerance, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		
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
	public static <T extends ITup3WF> T nrm(ITup3RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength);
		
		return res;
	}

	public static <T extends ITup3WF> T nrm(ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength);
		
		return res;
	}
	
	public static <T extends ITup3WF> T nrm(float[] v, @ExtractionParam T res)
	{
		if (TupUtils3F.Comp.isZero(v))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res.set(v[0] * invLength, v[1] * invLength, v[2] * invLength);
		
		return res;
	}

	public static <T extends ITup3WF> T nrm(float v0, float v1, float v2, @ExtractionParam T res)
	{
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength);
		
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
	public static <T extends ITup3WF> T nrm(float tolerance, ITup3RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength);
		
		return res;
	}
	
	public static <T extends ITup3WF> T nrm(float tolerance, ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength);
		
		return res;
	}
	
	public static <T extends ITup3WF> T nrm(float tolerance, float[] v, @ExtractionParam T res)
	{
		if (TupUtils3F.Comp.isZero(tolerance, v))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res.set(v[0] * invLength, v[1] * invLength, v[2] * invLength);
		
		return res;
	}

	public static <T extends ITup3WF> T nrm(float tolerance, float v0, float v1, float v2, @ExtractionParam T res)
	{
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength);
		
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
	public static <T extends ITup3RF> T nrmCreateNew(ITup3RF v, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength, v2 * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T nrmCreateNew(ITupRF v, T prototype)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength, v2 * invLength);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T nrmCreateNew(float[] v, T prototype)
	{
		if (TupUtils3F.Comp.isZero(v))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		return (T) prototype.createNew(v[0] * invLength, v[1] * invLength, v[2] * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T nrmCreateNew(float v0, float v1, float v2, T prototype)
	{
		if (TupUtils3F.Comp.isZero(v0, v1, v2))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength, v2 * invLength);
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
	public static <T extends ITup3RF> T nrmCreateNew(float tolerance, ITup3RF v, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength, v2 * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T nrmCreateNew(float tolerance, ITupRF v, T prototype)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		float v2 = v.getAt(2);
		
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength, v2 * invLength);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T nrmCreateNew(float tolerance, float[] v, T prototype)
	{
		if (TupUtils3F.Comp.isZero(tolerance, v))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		return (T) prototype.createNew(v[0] * invLength, v[1] * invLength, v[2] * invLength);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T nrmCreateNew(float tolerance, float v0, float v1, float v2, T prototype)
	{
		if (TupUtils3F.Comp.isZero(tolerance, v0, v1, v2))
		{
			return (T) prototype.createNew(0.0f, 0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
		
		return (T) prototype.createNew(v0 * invLength, v1 * invLength, v2 * invLength);
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
	public static float[] project(ITup3RF v, ITup3RF t, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float tV0 = t.v0();
		float tV1 = t.v1();		
		float tV2 = t.v2();		
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}

	public static float[] project(ITup3RF v, ITupRF t, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);		
		float tV2 = t.getAt(2);		
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}
	
	public static float[] project(ITup3RF v, float[] t, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		res[2] = t[2] * dot;
		
		return res;
	}

	public static float[] project(ITup3RF v, float tV0, float tV1, float tV2, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, ITup3RF t, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float tV0 = t.v0();
		float tV1 = t.v1();		
		float tV2 = t.v2();		
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, ITupRF t, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);		
		float tV2 = t.getAt(2);		
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}
	
	public static float[] project(ITupRF v, float[] t, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		res[2] = t[2] * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, float tV0, float tV1, float tV2, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}
	
	public static float[] project(float[] v, ITup3RF t, @ExtractionParam float[] res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}

	public static float[] project(float[] v, ITupRF t, @ExtractionParam float[] res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}
	
	public static float[] project(float[] v, float[] t, @ExtractionParam float[] res)
	{
		float dot = v[0] * t[0] + v[1] * t[1] + v[2] * t[2];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		res[2] = t[2] * dot;
		
		return res;
	}

	public static float[] project(float[] v, float tV0, float tV1, float tV2, @ExtractionParam float[] res)
	{
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}

	public static float[] project(float vV0, float vV1, float vV2, ITup3RF t, @ExtractionParam float[] res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}

	public static float[] project(float vV0, float vV1, float vV2, ITupRF t, @ExtractionParam float[] res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
		return res;
	}
	
	public static float[] project(float vV0, float vV1, float vV2, float[] t, @ExtractionParam float[] res)
	{
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		res[2] = t[2] * dot;
		
		return res;
	}

	public static float[] project(float vV0, float vV1, float vV2, float tV0, float tV1, float tV2, @ExtractionParam float[] res)
	{
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		res[2] = tV2 * dot;
		
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
	public static <T extends ITup3WF> T project(ITup3RF v, ITup3RF t, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}
	
	public static <T extends ITup3WF> T project(ITup3RF v, ITupRF t, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(ITup3RF v, float[] t, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		res.set(t[0] * dot, t[1] * dot, t[2] * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(ITup3RF v, float tV0, float tV1, float tV2, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(ITupRF v, ITup3RF t, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}
	
	public static <T extends ITup3WF> T project(ITupRF v, ITupRF t, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(ITupRF v, float[] t, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		res.set(t[0] * dot, t[1] * dot, t[2] * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(ITupRF v, float tV0, float tV1, float tV2, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}
	
	public static <T extends ITup3WF> T project(float[] v, ITup3RF t, @ExtractionParam T res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(float[] v, ITupRF t, @ExtractionParam T res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}
	
	public static <T extends ITup3WF> T project(float[] v, float[] t, @ExtractionParam T res)
	{
		float dot = v[0] * t[0] + v[1] * t[1] + v[2] * t[2];
		
		res.set(t[0] * dot, t[1] * dot, t[2] * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(float[] v, float tV0, float tV1, float tV2, @ExtractionParam T res)
	{
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(float vV0, float vV1, float vV2, ITup3RF t, @ExtractionParam T res)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(float vV0, float vV1, float vV2, ITupRF t, @ExtractionParam T res)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
		return res;
	}
	
	public static <T extends ITup3WF> T project(float vV0, float vV1, float vV2, float[] t, @ExtractionParam T res)
	{
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		res.set(t[0] * dot, t[1] * dot, t[2] * dot);
		
		return res;
	}

	public static <T extends ITup3WF> T project(float vV0, float vV1, float vV2, float tV0, float tV1, float tV2, @ExtractionParam T res)
	{
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		res.set(tV0 * dot, tV1 * dot, tV2 * dot);
		
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
	public static <T extends ITup3RF> T projectCreateNew(ITup3RF v, ITup3RF t, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(ITup3RF v, ITupRF t, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(ITup3RF v, float[] t, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot, t[2] * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(ITup3RF v, float tV0, float tV1, float tV2, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(ITupRF v, ITup3RF t, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(ITupRF v, ITupRF t, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(ITupRF v, float[] t, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot, t[2] * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(ITupRF v, float tV0, float tV1, float tV2, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float[] v, ITup3RF t, T prototype)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float[] v, ITupRF t, T prototype)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float[] v, float[] t, T prototype)
	{
		float dot = v[0] * t[0] + v[1] * t[1] + v[2] * t[2];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot, t[2] * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float[] v, float tV0, float tV1, float tV2, T prototype)
	{
		float dot = v[0] * tV0 + v[1] * tV1 + v[2] * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float vV0, float vV1, float vV2, ITup3RF t, T prototype)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		float tV2 = t.v2();
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float vV0, float vV1, float vV2, ITupRF t, T prototype)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		float tV2 = t.getAt(2);
		
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float vV0, float vV1, float vV2, float[] t, T prototype)
	{
		float dot = vV0 * t[0] + vV1 * t[1] + vV2 * t[2];
		
		return (T) prototype.createNew(t[0] * dot, t[1] * dot, t[2] * dot);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T projectCreateNew(float vV0, float vV1, float vV2, float tV0, float tV1, float tV2, T prototype)
	{
		float dot = vV0 * tV0 + vV1 * tV1 + vV2 * tV2;
		
		return (T) prototype.createNew(tV0 * dot, tV1 * dot, tV2 * dot);
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
	public static float[] reflect(ITup3RF v, ITup3RF n, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}

	public static float[] reflect(ITup3RF v, ITupRF n, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}
	
	public static float[] reflect(ITup3RF v, float[] n, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		res[0] = n[0] * dot + vV0;
		res[1] = n[1] * dot + vV1;
		res[2] = n[2] * dot + vV2;
		
		return res;
	}

	public static float[] reflect(ITup3RF v, float nV0, float nV1, float nV2, @ExtractionParam float[] res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}

	public static float[] reflect(ITupRF v, ITup3RF n, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}

	public static float[] reflect(ITupRF v, ITupRF n, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}
	
	public static float[] reflect(ITupRF v, float[] n, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		res[0] = n[0] * dot + vV0;
		res[1] = n[1] * dot + vV1;
		res[2] = n[2] * dot + vV2;
		
		return res;
	}

	public static float[] reflect(ITupRF v, float nV0, float nV1, float nV2, @ExtractionParam float[] res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}
	
	public static float[] reflect(float[] v, ITup3RF n, @ExtractionParam float[] res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		res[0] = nV0 * dot + v[0];
		res[1] = nV1 * dot + v[1];
		res[2] = nV2 * dot + v[2];
		
		return res;
	}

	public static float[] reflect(float[] v, ITupRF n, @ExtractionParam float[] res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		res[0] = nV0 * dot + v[0];
		res[1] = nV1 * dot + v[1];
		res[2] = nV2 * dot + v[2];
		
		return res;
	}
	
	public static float[] reflect(float[] v, float[] n, @ExtractionParam float[] res)
	{
		float dot = -2 * (v[0] * n[0] + v[1] * n[1] + v[2] * n[2]);
		
		res[0] = n[0] * dot + v[0];
		res[1] = n[1] * dot + v[1];
		res[2] = n[2] * dot + v[2];
		
		return res;
	}

	public static float[] reflect(float[] v, float nV0, float nV1, float nV2, @ExtractionParam float[] res)
	{
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		res[0] = nV0 * dot + v[0];
		res[1] = nV1 * dot + v[1];
		res[2] = nV2 * dot + v[2];
		
		return res;
	}

	public static float[] reflect(float vV0, float vV1, float vV2, ITup3RF n, @ExtractionParam float[] res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}

	public static float[] reflect(float vV0, float vV1, float vV2, ITupRF n, @ExtractionParam float[] res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
		return res;
	}
	
	public static float[] reflect(float vV0, float vV1, float vV2, float[] n, @ExtractionParam float[] res)
	{
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		res[0] = n[0] * dot + vV0;
		res[1] = n[1] * dot + vV1;
		res[2] = n[2] * dot + vV2;
		
		return res;
	}

	public static float[] reflect(float vV0, float vV1, float vV2, float nV0, float nV1, float nV2, @ExtractionParam float[] res)
	{
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		res[2] = nV2 * dot + vV2;
		
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
	public static <T extends ITup3WF> T reflect(ITup3RF v, ITup3RF n, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(ITup3RF v, ITupRF n, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T reflect(ITup3RF v, float[] n, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		res.set(n[0] * dot + vV0, n[1] * dot + vV1, n[2] * dot + vV2);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(ITup3RF v, float nV0, float nV1, float nV2, @ExtractionParam T res)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(ITupRF v, ITup3RF n, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(ITupRF v, ITupRF n, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T reflect(ITupRF v, float[] n, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		res.set(n[0] * dot + vV0, n[1] * dot + vV1, n[2] * dot + vV2);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(ITupRF v, float nV0, float nV1, float nV2, @ExtractionParam T res)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T reflect(float[] v, ITup3RF n, @ExtractionParam T res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		res.set(nV0 * dot + v[0], nV1 * dot + v[1], nV2 * dot + v[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(float[] v, ITupRF n, @ExtractionParam T res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		res.set(nV0 * dot + v[0], nV1 * dot + v[1], nV2 * dot + v[2]);
		
		return res;
	}
	
	public static <T extends ITup3WF> T reflect(float[] v, float[] n, @ExtractionParam T res)
	{
		float dot = -2 * (v[0] * n[0] + v[1] * n[1] + v[2] * n[2]);
		
		res.set(n[0] * dot + v[0], n[1] * dot + v[1], n[2] * dot + v[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(float[] v, float nV0, float nV1, float nV2, @ExtractionParam T res)
	{
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		res.set(nV0 * dot + v[0], nV1 * dot + v[1], nV2 * dot + v[2]);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(float vV0, float vV1, float vV2, ITup3RF n, @ExtractionParam T res)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(float vV0, float vV1, float vV2, ITupRF n, @ExtractionParam T res)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T reflect(float vV0, float vV1, float vV2, float[] n, @ExtractionParam T res)
	{
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		res.set(n[0] * dot + vV0, n[1] * dot + vV1, n[2] * dot + vV2);
		
		return res;
	}

	public static <T extends ITup3WF> T reflect(float vV0, float vV1, float vV2, float nV0, float nV1, float nV2, @ExtractionParam T res)
	{
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
		
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
	public static <T extends ITup3RF> T reflectCreateNew(ITup3RF v, ITup3RF n, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(ITup3RF v, ITupRF n, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(ITup3RF v, float[] n, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		return (T) prototype.createNew(n[0] * dot + vV0, n[1] * dot + vV1, n[2] * dot + vV2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(ITup3RF v, float nV0, float nV1, float nV2, T prototype)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float vV2 = v.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(ITupRF v, ITup3RF n, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(ITupRF v, ITupRF n, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(ITupRF v, float[] n, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		return (T) prototype.createNew(n[0] * dot + vV0, n[1] * dot + vV1, n[2] * dot + vV2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(ITupRF v, float nV0, float nV1, float nV2, T prototype)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float vV2 = v.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float[] v, ITup3RF n, T prototype)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		return (T) prototype.createNew(nV0 * dot + v[0], nV1 * dot + v[1], nV2 * dot + v[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float[] v, ITupRF n, T prototype)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		return (T) prototype.createNew(nV0 * dot + v[0], nV1 * dot + v[1], nV2 * dot + v[2]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float[] v, float[] n, T prototype)
	{
		float dot = -2 * (v[0] * n[0] + v[1] * n[1] + v[2] * n[2]);
		
		return (T) prototype.createNew(n[0] * dot + v[0], n[1] * dot + v[1], n[2] * dot + v[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float[] v, float nV0, float nV1, float nV2, T prototype)
	{
		float dot = -2 * (v[0] * nV0 + v[1] * nV1 + v[2] * nV2);
		
		return (T) prototype.createNew(nV0 * dot + v[0], nV1 * dot + v[1], nV2 * dot + v[2]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float vV0, float vV1, float vV2, ITup3RF n, T prototype)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		float nV2 = n.v2();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float vV0, float vV1, float vV2, ITupRF n, T prototype)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		float nV2 = n.getAt(2);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float vV0, float vV1, float vV2, float[] n, T prototype)
	{
		float dot = -2 * (vV0 * n[0] + vV1 * n[1] + vV2 * n[2]);
		
		return (T) prototype.createNew(n[0] * dot + vV0, n[1] * dot + vV1, n[2] * dot + vV2);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T reflectCreateNew(float vV0, float vV1, float vV2, float nV0, float nV1, float nV2, T prototype)
	{
		float dot = -2 * (vV0 * nV0 + vV1 * nV1 + vV2 * nV2);
		
		return (T) prototype.createNew(nV0 * dot + vV0, nV1 * dot + vV1, nV2 * dot + vV2);
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
	public static float dot(ITup3RF t1, ITup3RF t2)
	{
		return t1.v0() * t2.v0() + t1.v1() * t2.v1() + t1.v2() * t2.v2();
	}

	public static float dot(ITup3RF t1, ITupRF t2)
	{
		return t1.v0() * t2.getAt(0) + t1.v1() * t2.getAt(1) + t1.v2() * t2.getAt(2);
	}
	
	public static float dot(ITup3RF t1, float[] t2)
	{
		return t1.v0() * t2[0] + t1.v1() * t2[1] + t1.v2() * t2[2];
	}

	public static float dot(ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		return t1.v0() * t2v0 + t1.v1() * t2v1 + t1.v2() * t2v2;
	}

	public static float dot(ITupRF t1, ITup3RF t2)
	{
		return t1.getAt(0) * t2.v0() + t1.getAt(1) * t2.v1() + t1.getAt(2) * t2.v2();
	}

	public static float dot(ITupRF t1, ITupRF t2)
	{
		return t1.getAt(0) * t2.getAt(0) + t1.getAt(1) * t2.getAt(1) + t1.getAt(2) * t2.getAt(2);
	}
	
	public static float dot(ITupRF t1, float[] t2)
	{
		return t1.getAt(0) * t2[0] + t1.getAt(1) * t2[1] + t1.getAt(2) * t2[2];
	}

	public static float dot(ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		return t1.getAt(0) * t2v0 + t1.getAt(1) * t2v1 + t1.getAt(2) * t2v2;
	}
	
	public static float dot(float[] t1, ITup3RF t2)
	{
		return t1[0] * t2.v0() + t1[1] * t2.v1() + t1[2] * t2.v2();
	}

	public static float dot(float[] t1, ITupRF t2)
	{
		return t1[0] * t2.getAt(0) + t1[1] * t2.getAt(1) + t1[2] * t2.getAt(2);
	}
	
	public static float dot(float[] t1, float[] t2)
	{
		return t1[0] * t2[0] + t1[1] * t2[1] + t1[2] * t2[2];
	}

	public static float dot(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		return t1[0] * t2v0 + t1[1] * t2v1 + t1[2] * t2v2;
	}

	public static float dot(float t1v0, float t1v1, float t1v2, ITup3RF t2)
	{
		return t1v0 * t2.v0() + t1v1 * t2.v1() + t1v2 * t2.v2();
	}
	
	public static float dot(float t1v0, float t1v1, float t1v2, ITupRF t2)
	{
		return t1v0 * t2.getAt(0) + t1v1 * t2.getAt(1) + t1v2 * t2.getAt(2);
	}
	
	public static float dot(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		return t1v0 * t2[0] + t1v1 * t2[1] + t1v2 * t2[2];
	}

	public static float dot(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		return t1v0 * t2v0 + t1v1 * t2v1 + t1v2 * t2v2;
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
	public static float[] halfVecTo(ITup3RF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.v0()) * 0.5f;
		res[1] = (t2.v1() - t1.v1()) * 0.5f;
		res[2] = (t2.v2() - t1.v2()) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITup3RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1.v0()) * 0.5f;
		res[1] = (t2.getAt(1) - t1.v1()) * 0.5f;
		res[2] = (t2.getAt(2) - t1.v2()) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(ITup3RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1.v0()) * 0.5f;
		res[1] = (t2[1] - t1.v1()) * 0.5f;
		res[2] = (t2[2] - t1.v2()) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1.v0()) * 0.5f;
		res[1] = (t2v1 - t1.v1()) * 0.5f;
		res[2] = (t2v2 - t1.v2()) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.getAt(0)) * 0.5f;
		res[1] = (t2.v1() - t1.getAt(1)) * 0.5f;
		res[2] = (t2.v2() - t1.getAt(2)) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1.getAt(0)) * 0.5f;
		res[1] = (t2.getAt(1) - t1.getAt(1)) * 0.5f;
		res[2] = (t2.getAt(2) - t1.getAt(2)) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1.getAt(0)) * 0.5f;
		res[1] = (t2[1] - t1.getAt(1)) * 0.5f;
		res[2] = (t2[2] - t1.getAt(2)) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1.getAt(0)) * 0.5f;
		res[1] = (t2v1 - t1.getAt(1)) * 0.5f;
		res[2] = (t2v2 - t1.getAt(2)) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(float[] t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1[0]) * 0.5f;
		res[1] = (t2.v1() - t1[1]) * 0.5f;
		res[2] = (t2.v2() - t1[2]) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1[0]) * 0.5f;
		res[1] = (t2.getAt(1) - t1[1]) * 0.5f;
		res[2] = (t2.getAt(2) - t1[2]) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1[0]) * 0.5f;
		res[1] = (t2[1] - t1[1]) * 0.5f;
		res[2] = (t2[2] - t1[2]) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1[0]) * 0.5f;
		res[1] = (t2v1 - t1[1]) * 0.5f;
		res[2] = (t2v2 - t1[2]) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1v0) * 0.5f;
		res[1] = (t2.v1() - t1v1) * 0.5f;
		res[2] = (t2.v2() - t1v2) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1v0) * 0.5f;
		res[1] = (t2.getAt(1) - t1v1) * 0.5f;
		res[2] = (t2.getAt(2) - t1v2) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1v0) * 0.5f;
		res[1] = (t2[1] - t1v1) * 0.5f;
		res[2] = (t2[2] - t1v2) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1v0) * 0.5f;
		res[1] = (t2v1 - t1v1) * 0.5f;
		res[2] = (t2v2 - t1v2) * 0.5f;
		
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
	public static <T extends ITup3WF> T halfVecTo(ITup3RF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f, (t2.v2() - t1.v2()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(ITup3RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f, (t2.getAt(2) - t1.v2()) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T halfVecTo(ITup3RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f, (t2[2] - t1.v2()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f, (t2v2 - t1.v2()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(ITupRF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f, (t2.v2() - t1.getAt(2)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f, (t2.getAt(2) - t1.getAt(2)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T halfVecTo(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f, (t2[2] - t1.getAt(2)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f, (t2v2 - t1.getAt(2)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T halfVecTo(float[] t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f, (t2.v2() - t1[2]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f, (t2.getAt(2) - t1[2]) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T halfVecTo(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f, (t2[2] - t1[2]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f, (t2v2 - t1[2]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f, (t2.v2() - t1v2) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f, (t2.getAt(2) - t1v2) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T halfVecTo(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f, (t2[2] - t1v2) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T halfVecTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f, (t2v2 - t1v2) * 0.5f);
		
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
	public static <T extends ITup3RF> T halfVecToCreateNew(ITup3RF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f, (t2.v2() - t1.v2()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(ITup3RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f, (t2.getAt(2) - t1.v2()) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(ITup3RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f, (t2[2] - t1.v2()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f, (t2v2 - t1.v2()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(ITupRF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f, (t2.v2() - t1.getAt(2)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f, (t2.getAt(2) - t1.getAt(2)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f, (t2[2] - t1.getAt(2)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f, (t2v2 - t1.getAt(2)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float[] t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f, (t2.v2() - t1[2]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f, (t2.getAt(2) - t1[2]) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f, (t2[2] - t1[2]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f, (t2v2 - t1[2]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f, (t2.v2() - t1v2) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f, (t2.getAt(2) - t1v2) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f, (t2[2] - t1v2) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T halfVecToCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f, (t2v2 - t1v2) * 0.5f);
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
	public static float[] midPointTo(ITup3RF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.v0()) * 0.5f;
		res[1] = (t2.v1() - t1.v1()) * 0.5f;
		res[2] = (t2.v2() - t1.v2()) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(ITup3RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1.v0()) * 0.5f;
		res[1] = (t2.getAt(1) - t1.v1()) * 0.5f;
		res[2] = (t2.getAt(2) - t1.v2()) * 0.5f;
		
		return res;
	}
	
	public static float[] midPointTo(ITup3RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1.v0()) * 0.5f;
		res[1] = (t2[1] - t1.v1()) * 0.5f;
		res[2] = (t2[2] - t1.v2()) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1.v0()) * 0.5f;
		res[1] = (t2v1 - t1.v1()) * 0.5f;
		res[2] = (t2v2 - t1.v2()) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float[] t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1[0]) * 0.5f;
		res[1] = (t2.v1() - t1[1]) * 0.5f;
		res[2] = (t2.v2() - t1[2]) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1[0]) * 0.5f;
		res[1] = (t2.getAt(1) - t1[1]) * 0.5f;
		res[2] = (t2.getAt(2) - t1[2]) * 0.5f;
		
		return res;
	}
	
	public static float[] midPointTo(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1[0]) * 0.5f;
		res[1] = (t2[1] - t1[1]) * 0.5f;
		res[2] = (t2[2] - t1[2]) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1[0]) * 0.5f;
		res[1] = (t2v1 - t1[1]) * 0.5f;
		res[2] = (t2v2 - t1[2]) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1v0) * 0.5f;
		res[1] = (t2.v1() - t1v1) * 0.5f;
		res[2] = (t2.v2() - t1v2) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.getAt(0) - t1v0) * 0.5f;
		res[1] = (t2.getAt(1) - t1v1) * 0.5f;
		res[2] = (t2.getAt(2) - t1v2) * 0.5f;
		
		return res;
	}
	
	public static float[] midPointTo(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1v0) * 0.5f;
		res[1] = (t2[1] - t1v1) * 0.5f;
		res[2] = (t2[2] - t1v2) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1v0) * 0.5f;
		res[1] = (t2v1 - t1v1) * 0.5f;
		res[2] = (t2v2 - t1v2) * 0.5f;
		
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
	public static <T extends ITup3WF> T midPointTo(ITup3RF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f, (t2.v2() - t1.v2()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(ITup3RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f, (t2.getAt(2) - t1.v2()) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T midPointTo(ITup3RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f, (t2[2] - t1.v2()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f, (t2v2 - t1.v2()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(ITupRF t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f, (t2.v2() - t1.getAt(2)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f, (t2.getAt(2) - t1.getAt(2)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T midPointTo(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f, (t2[2] - t1.getAt(2)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f, (t2v2 - t1.getAt(2)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T midPointTo(float[] t1, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f, (t2.v2() - t1[2]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f, (t2.getAt(2) - t1[2]) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T midPointTo(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f, (t2[2] - t1[2]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f, (t2v2 - t1[2]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f, (t2.v2() - t1v2) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f, (t2.getAt(2) - t1v2) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup3WF> T midPointTo(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f, (t2[2] - t1v2) * 0.5f);
		
		return res;
	}

	public static <T extends ITup3WF> T midPointTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f, (t2v2 - t1v2) * 0.5f);
		
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
	public static <T extends ITup3RF> T midPointToCreateNew(ITup3RF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f, (t2.v2() - t1.v2()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(ITup3RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f, (t2.getAt(2) - t1.v2()) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(ITup3RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f, (t2[2] - t1.v2()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f, (t2v2 - t1.v2()) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(ITupRF t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f, (t2.v2() - t1.getAt(2)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f, (t2.getAt(2) - t1.getAt(2)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f, (t2[2] - t1.getAt(2)) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f, (t2v2 - t1.getAt(2)) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float[] t1, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f, (t2.v2() - t1[2]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f, (t2.getAt(2) - t1[2]) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f, (t2[2] - t1[2]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float[] t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f, (t2v2 - t1[2]) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, T prototype)
	{
		return (T) prototype.createNew((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f, (t2.v2() - t1v2) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f, (t2.getAt(2) - t1v2) * 0.5f);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, T prototype)
	{
		return (T) prototype.createNew((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f, (t2[2] - t1v2) * 0.5f);
	}

	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T midPointToCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f, (t2v2 - t1v2) * 0.5f);
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
	public static float lenTo(ITup3RF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		float v2 = t2.v2() - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup3RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float v2 = t2.getAt(2) - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup3RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float v2 = t2[2] - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float v2 = t2v2 - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float v2 = t2.v2() - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float v2 = t2.getAt(2) - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float v2 = t2[2] - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float v2 = t2v2 - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float v2 = t2.v2() - t1[2];
		float sqareLength = v0 * v0 + v1 * v1  + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float v2 = t2.getAt(2) - t1[2];
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t1v2, ITup3RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float v2 = t2.v2() - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t1v2, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float v2 = t2.getAt(2) - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
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
	public static float lenTo(float tolerance, ITup3RF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		float v2 = t2.v2() - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float lenTo(float tolerance, ITup3RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float v2 = t2.getAt(2) - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITup3RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float v2 = t2[2] - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float v2 = t2v2 - t1.v2();
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float v2 = t2.v2() - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float lenTo(float tolerance, ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float v2 = t2.getAt(2) - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float v2 = t2[2] - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float v2 = t2v2 - t1.getAt(2);
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float v2 = t2.v2() - t1[2];
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float v2 = t2.getAt(2) - t1[2];
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float t1v2, ITup3RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float v2 = t2.v2() - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float t1v2, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float v2 = t2.getAt(2) - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
		if(MathUtils.Comp.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2;
		
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
	public static float sqrLenTo(ITup3RF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		float v2 = t2.v2() - t1.v2();
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(ITup3RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float v2 = t2.getAt(2) - t1.v2();
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float sqrLenTo(ITup3RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float v2 = t2[2] - t1.v2();
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float v2 = t2v2 - t1.v2();
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(ITupRF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float v2 = t2.v2() - t1.getAt(2);
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float v2 = t2.getAt(2) - t1.getAt(2);
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float sqrLenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float v2 = t2[2] - t1.getAt(2);
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float v2 = t2v2 - t1.getAt(2);
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float sqrLenTo(float[] t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float v2 = t2.v2() - t1[2];
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float v2 = t2.getAt(2) - t1[2];
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float sqrLenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(float t1v0, float t1v1, float t1v2, ITup3RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float v2 = t2.v2() - t1v2;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(float t1v0, float t1v1, float t1v2, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float v2 = t2.getAt(2) - t1v2;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float sqrLenTo(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float sqrLenTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
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
	public static float recLenTo(ITup3RF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		float v2 = t2.v2() - t1.v2();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(ITup3RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float v2 = t2.getAt(2) - t1.v2();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLenTo(ITup3RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float v2 = t2[2] - t1.v2();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float v2 = t2v2 - t1.v2();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLenTo(ITupRF t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float v2 = t2.v2() - t1.getAt(2);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float v2 = t2.getAt(2) - t1.getAt(2);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float v2 = t2[2] - t1.getAt(2);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float v2 = t2v2 - t1.getAt(2);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLenTo(float[] t1, ITup3RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float v2 = t2.v2() - t1[2];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float v2 = t2.getAt(2) - t1[2];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(float t1v0, float t1v1, float t1v2, ITup3RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float v2 = t2.v2() - t1v2;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(float t1v0, float t1v1, float t1v2, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float v2 = t2.getAt(2) - t1v2;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float recLenTo(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float recLenTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		 
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float[] cross(ITup3RF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(ITup3RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(ITup3RF t1, float[] t2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		float r0 = t1v1 * t2[2] - t1v2 * t2[1];
		float r1 = t1v2 * t2[0] - t1v0 * t2[2];
		float r2 = t1v0 * t2[1] - t1v1 * t2[0];
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] cross(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(ITupRF t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		float r0 = t1v1 * t2[2] - t1v2 * t2[1];
		float r1 = t1v2 * t2[0] - t1v0 * t2[2];
		float r2 = t1v0 * t2[1] - t1v1 * t2[0];
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] cross(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(float[] t1, ITup3RF t2, @ExtractionParam float[] res)
	{
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		float r0 = t1[1] * t2v2 - t1[2] * t2v1;
		float r1 = t1[2] * t2v0 - t1[0] * t2v2;
		float r2 = t1[0] * t2v1 - t1[1] * t2v0;
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] cross(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		float r0 = t1[1] * t2v2 - t1[2] * t2v1;
		float r1 = t1[2] * t2v0 - t1[0] * t2v2;
		float r2 = t1[0] * t2v1 - t1[1] * t2v0;
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] cross(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		float r0 = t1[1] * t2[2] - t1[2] * t2[1];
		float r1 = t1[2] * t2[0] - t1[0] * t2[2];
		float r2 = t1[0] * t2[1] - t1[1] * t2[0];
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] cross(float t1[], float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		float r0 = t1[1] * t2v2 - t1[2] * t2v1;
		float r1 = t1[2] * t2v0 - t1[0] * t2v2;
		float r2 = t1[0] * t2v1 - t1[1] * t2v0;
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] cross(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam float[] res)
	{
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam float[] res)
	{
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static float[] cross(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		float r0 = t1v1 * t2[2] - t1v2 * t2[1];
		float r1 = t1v2 * t2[0] - t1v0 * t2[2];
		float r2 = t1v0 * t2[1] - t1v1 * t2[0];
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] cross(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = t1v1 * t2v2 - t1v2 * t2v1;
		res[1] = t1v2 * t2v0 - t1v0 * t2v2;
		res[2] = t1v0 * t2v1 - t1v1 * t2v0;
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITup3RF t1, ITup3RF t2, @ExtractionParam T res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITup3RF t1, ITupRF t2, @ExtractionParam T res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITup3RF t1, float[] t2, @ExtractionParam T res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();

		res.set(t1v1 * t2[2] - t1v2 * t2[1], t1v2 * t2[0] - t1v0 * t2[2], t1v0 * t2[1] - t1v1 * t2[0]);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITup3RF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITupRF t1, ITup3RF t2, @ExtractionParam T res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		res.set(t1v1 * t2[2] - t1v2 * t2[1], t1v2 * t2[0] - t1v0 * t2[2], t1v0 * t2[1] - t1v1 * t2[0]);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(ITupRF t1, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float[] t1, ITup3RF t2, @ExtractionParam T res)
	{
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		res.set(t1[1] * t2v2 - t1[2] * t2v1, t1[2] * t2v0 - t1[0] * t2v2, t1[0] * t2v1 - t1[1] * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		res.set(t1[1] * t2v2 - t1[2] * t2v1, t1[2] * t2v0 - t1[0] * t2v2, t1[0] * t2v1 - t1[1] * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1[1] * t2[2] - t1[2] * t2[1], t1[2] * t2[0] - t1[0] * t2[2], t1[0] * t2[1] - t1[1] * t2[0]);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float t1[], float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1[1] * t2v2 - t1[2] * t2v1, t1[2] * t2v0 - t1[0] * t2v2, t1[0] * t2v1 - t1[1] * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float t1v0, float t1v1, float t1v2, ITup3RF t2, @ExtractionParam T res)
	{
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float t1v0, float t1v1, float t1v2, ITupRF t2, @ExtractionParam T res)
	{
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam T res)
	{
		res.set(t1v1 * t2[2] - t1v2 * t2[1], t1v2 * t2[0] - t1v0 * t2[2], t1v0 * t2[1] - t1v1 * t2[0]);
		
		return res;
	}
	
	public static <T extends ITup3WF> T cross(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam T res)
	{
		res.set(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITup3RF t1, ITup3RF t2, T prototype)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITup3RF t1, ITupRF t2, T prototype)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();
		
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITup3RF t1, float[] t2, T prototype)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();

		return (T) prototype.createNew(t1v1 * t2[2] - t1v2 * t2[1], t1v2 * t2[0] - t1v0 * t2[2], t1v0 * t2[1] - t1v1 * t2[0]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITup3RF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		float t1v0 = t1.v0();
		float t1v1 = t1.v1();
		float t1v2 = t1.v2();

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITupRF t1, ITup3RF t2, T prototype)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);
		
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);

		return (T) prototype.createNew(t1v1 * t2[2] - t1v2 * t2[1], t1v2 * t2[0] - t1v0 * t2[2], t1v0 * t2[1] - t1v1 * t2[0]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(ITupRF t1, float t2v0, float t2v1, float t2v2, T prototype)
	{
		float t1v0 = t1.getAt(0);
		float t1v1 = t1.getAt(1);
		float t1v2 = t1.getAt(2);

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float[] t1, ITup3RF t2, T prototype)
	{
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		return (T) prototype.createNew(t1[1] * t2v2 - t1[2] * t2v1, t1[2] * t2v0 - t1[0] * t2v2, t1[0] * t2v1 - t1[1] * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		return (T) prototype.createNew(t1[1] * t2v2 - t1[2] * t2v1, t1[2] * t2v0 - t1[0] * t2v2, t1[0] * t2v1 - t1[1] * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1[1] * t2[2] - t1[2] * t2[1], t1[2] * t2[0] - t1[0] * t2[2], t1[0] * t2[1] - t1[1] * t2[0]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float t1[], float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1[1] * t2v2 - t1[2] * t2v1, t1[2] * t2v0 - t1[0] * t2v2, t1[0] * t2v1 - t1[1] * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float t1v0, float t1v1, float t1v2, ITup3RF t2, T prototype)
	{
		float t2v0 = t2.v0();
		float t2v1 = t2.v1();
		float t2v2 = t2.v2();

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float t1v0, float t1v1, float t1v2, ITupRF t2, T prototype)
	{
		float t2v0 = t2.getAt(0);
		float t2v1 = t2.getAt(1);
		float t2v2 = t2.getAt(2);

		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float t1v0, float t1v1, float t1v2, float[] t2, T prototype)
	{
		return (T) prototype.createNew(t1v1 * t2[2] - t1v2 * t2[1], t1v2 * t2[0] - t1v0 * t2[2], t1v0 * t2[1] - t1v1 * t2[0]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T crossCreateNew(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, T prototype)
	{
		return (T) prototype.createNew(t1v1 * t2v2 - t1v2 * t2v1, t1v2 * t2v0 - t1v0 * t2v2, t1v0 * t2v1 - t1v1 * t2v0);
	}
}
