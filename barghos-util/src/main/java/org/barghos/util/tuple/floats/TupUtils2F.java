package org.barghos.util.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.AllowNull;
import org.barghos.util.BarghosUtilConfiguration;
import org.barghos.util.accessor.floats.IIndexAccessorIRF;
import org.barghos.util.accessor.floats.IKeyAccessorRF;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.collection.KeyValuePairF;

public class TupUtils2F
{
	public static final ITupUtils2FProvider PROVIDER;
	
	static
	{
		PROVIDER = BarghosUtilConfiguration.tupUtils2FProvider();
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
	public static IndexValuePairF min(ITup2RF t, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.min(t, res);
	}

	public static IndexValuePairF min(ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.min(t, res);
	}
	
	public static IndexValuePairF min(float[] t, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.min(t, res);
	}

	public static IndexValuePairF min(float tv0, float tv1, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.min(tv0, tv1, res);
	}

	public static <T> IndexValuePairF min(IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		return min(accessor, obj, res);
	}
	
	public static <T,K> KeyValuePairF<K> min(K[] keys, IKeyAccessorRF<T,K> accessor, T obj, @ExtractionParam KeyValuePairF<K> res)
	{
		return min(keys, accessor, obj, res);
	}

	public static IndexValuePairF minAligned(int startIndexT, ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		return minAligned(startIndexT, t, res);
	}
	
	public static IndexValuePairF minAligned(int startIndexT, float[] t, @ExtractionParam IndexValuePairF res)
	{
		return minAligned(startIndexT, t, res);
	}
	
	public static <T> IndexValuePairF minAligned(int startIndexT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		return minAligned(startIndexT, accessor, obj, res);
	}
	
	public static IndexValuePairF minUnaligned(int[] indicesT, ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		return minUnaligned(indicesT, t, res);
	}
	
	public static IndexValuePairF minUnaligned(int[] indicesT, float[] t, @ExtractionParam IndexValuePairF res)
	{
		return minUnaligned(indicesT, t, res);
	}
	
	public static <T> IndexValuePairF minUnaligned(int[] indicesT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		return minUnaligned(indicesT, accessor, obj, res);
	}
	
	public static IndexValuePairF minUnaligned(int indexTV0, int indexTV1, ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		return minUnaligned(indexTV0, indexTV1, t, res);
	}
	
	public static IndexValuePairF minUnaligned(int indexTV0, int indexTV1, float[] t, @ExtractionParam IndexValuePairF res)
	{
		return minUnaligned(indexTV0, indexTV1, t, res);
	}
	
	public static <T> IndexValuePairF minUnaligned(int indexTV0, int indexTV1, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		return minUnaligned(indexTV0, indexTV1, accessor, obj, res);
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
	public static IndexValuePairF max(ITup2RF t, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.max(t, res);
	}

	public static IndexValuePairF max(ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.max(t, res);
	}
	
	public static IndexValuePairF max(float[] t, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.max(t, res);
	}

	public static IndexValuePairF max(float tv0, float tv1, @ExtractionParam IndexValuePairF res)
	{
		return PROVIDER.max(tv0, tv1, res);
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
	public static float[] minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static float[] minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}
	
	public static float[] minComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static float[] minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2v0, t2v1, res);
	}

	public static float[] minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static float[] minComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}
	
	public static float[] minComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static float[] minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2v0, t2v1, res);
	}
	
	public static float[] minComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static float[] minComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}
	
	public static float[] minComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static float[] minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1, t2v0, t2v1, res);
	}

	public static float[] minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2, res);
	}

	public static float[] minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2, res);
	}
	
	public static float[] minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2, res);
	}

	public static float[] minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2v0, t2v1, res);
	}

	public static <T extends ITup2WF> T minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}
	
	public static <T extends ITup2WF> T minComponents(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2v0, t2v1, res);
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}
	
	public static <T extends ITup2WF> T minComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2v0, t2v1, res);
	}
	
	public static <T extends ITup2WF> T minComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}
	
	public static <T extends ITup2WF> T minComponents(float[] t1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1, t2v0, t2v1, res);
	}

	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2, res);
	}

	
	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2, res);
	}

	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.minComponents(t1v0, t1v1, t2v0, t2v1, res);
	}

	public static <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2v0, t2v1, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2v0, t2v1, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1,t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1,t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float[] t1, float[] t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1, t2v0, t2v1, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1v0, t1v1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1v0, t1v1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1v0, t1v1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.minComponentsCreateNew(t1v0, t1v1, t2v0, t2v1, prototype);
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
	public static float[] maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static float[] maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}
	
	public static float[] maxComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static float[] maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2v0, t2v1, res);
	}

	public static float[] maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static float[] maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}
	
	public static float[] maxComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static float[] maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2v0, t2v1, res);
	}
	
	public static float[] maxComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static float[] maxComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}
	
	public static float[] maxComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static float[] maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1, t2v0, t2v1, res);
	}

	public static float[] maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2, res);
	}

	public static float[] maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2, res);
	}
	
	public static float[] maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2, res);
	}

	public static float[] maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2v0, t2v1, res);
	}

	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}
	
	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2v0, t2v1, res);
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}
	
	public static <T extends ITup2WF> T maxComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2v0, t2v1, res);
	}
	
	public static <T extends ITup2WF> T maxComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}
	
	public static <T extends ITup2WF> T maxComponents(float[] t1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1, t2v0, t2v1, res);
	}

	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2, res);
	}
	
	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2, res);
	}

	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		return PROVIDER.maxComponents(t1v0, t1v1, t2v0, t2v1, res);
	}

	public static <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2v0, t2v1, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2v0, t2v1, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, float[] t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1, t2v0, t2v1, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1v0, t1v1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1v0, t1v1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1v0, t1v1, t2, prototype);
	}
	
	public static <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return PROVIDER.maxComponentsCreateNew(t1v0, t1v1, t2v0, t2v1, prototype);
	}
	
	public static float[] arrange(ITup2RF t, int[] indices, float[] res)
	{
		return PROVIDER.arrange(t, indices, res);
	}
	
	public static float[] arrange(ITupRF t, int[] indices, float[] res)
	{
		return PROVIDER.arrange(t, indices, res);
	}
	
	public static float[] arrange(float[] t, int[] indices, float[] res)
	{
		return PROVIDER.arrange(t, indices, res);
	}
	
	public static float[] arrange(float tv0, float tv1, int[] indices, float[] res)
	{
		return PROVIDER.arrange(tv0, tv1, indices, res);
	}
	
	public static <T extends ITup2WF> T arrange(ITup2RF t, int[] indices, T res)
	{
		return PROVIDER.arrange(t, indices, res);
	}
	
	public static <T extends ITup2WF> T arrange(ITupRF t, int[] indices, T res)
	{
		return PROVIDER.arrange(t, indices, res);
	}
	
	public static <T extends ITup2WF> T arrange(float[] t, int[] indices, T res)
	{
		return PROVIDER.arrange(t, indices, res);
	}
	
	public static <T extends ITup2WF> T arrange(float tv0, float tv1, int[] indices, T res)
	{
		return PROVIDER.arrange(tv0, tv1, indices, res);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(ITup2RF t, int[] indices, T prototype)
	{
		return PROVIDER.arrangeCreateNew(t, indices, prototype);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(ITupRF t, int[] indices, T prototype)
	{
		return PROVIDER.arrangeCreateNew(t, indices, prototype);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(float[] t, int[] indices, T prototype)
	{
		return PROVIDER.arrangeCreateNew(t, indices, prototype);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(float tv0, float tv1, int[] indices, T prototype)
	{
		return PROVIDER.arrangeCreateNew(tv0, tv1, indices, prototype);
	}
	
	public static <T extends ITup2WF> T arrange(ITup2RF t, int index0, int index1, T res)
	{
		return PROVIDER.arrange(t, index0, index1, res);
	}
	
	public static <T extends ITup2WF> T arrange(ITupRF t, int index0, int index1, T res)
	{
		return PROVIDER.arrange(t, index0, index1, res);
	}
	
	public static <T extends ITup2WF> T arrange(float[] t, int index0, int index1, T res)
	{
		return PROVIDER.arrange(t, index0, index1, res);
	}
	
	public static <T extends ITup2WF> T arrange(float tv0, float tv1, int index0, int index1, T res)
	{
		return PROVIDER.arrange(tv0, tv1, index0, index1, res);
	}
	
	public static float[] arrange(ITup2RF t, int index0, int index1, float[] res)
	{
		return PROVIDER.arrange(t, index0, index1, res);
	}
	
	public static float[] arrange(ITupRF t, int index0, int index1, float[] res)
	{
		return PROVIDER.arrange(t, index0, index1, res);
	}
	
	public static float[] arrange(float[] t, int index0, int index1, float[] res)
	{
		return PROVIDER.arrange(t, index0, index1, res);
	}
	
	public static float[] arrange(float tv0, float tv1, int index0, int index1, float[] res)
	{
		return PROVIDER.arrange(tv0, tv1, index0, index1, res);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(ITup2RF t, int index0, int index1, T prototype)
	{
		return PROVIDER.arrangeCreateNew(t, index0, index1, prototype);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(ITupRF t, int index0, int index1, T prototype)
	{
		return PROVIDER.arrangeCreateNew(t, index0, index1, prototype);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(float[] t, int index0, int index1, T prototype)
	{
		return PROVIDER.arrangeCreateNew(t, index0, index1, prototype);
	}
	
	public static <T extends ITup2RF> T arrangeCreateNew(float tv0, float tv1, int index0, int index1, T prototype)
	{
		return PROVIDER.arrangeCreateNew(tv0, tv1, index0, index1, prototype);
	}
	
	public static <T extends ITup2WF> T swizzle(ITup2RF t, int indexA, int indexB, T res)
	{
		return PROVIDER.swizzle(t, indexA, indexB, res);
	}
	
	public static <T extends ITup2WF> T swizzle(ITupRF t, int indexA, int indexB, T res)
	{
		return PROVIDER.swizzle(t, indexA, indexB, res);
	}
	
	public static <T extends ITup2WF> T swizzle(float[] t, int indexA, int indexB, T res)
	{
		return PROVIDER.swizzle(t, indexA, indexB, res);
	}
	
	public static <T extends ITup2WF> T swizzle(float tv0, float tv1, int indexA, int indexB, T res)
	{
		return PROVIDER.swizzle(tv0, tv1, indexA, indexB, res);
	}
	
	public static float[] swizzle(ITup2RF t, int indexA, int indexB, float[] res)
	{
		return PROVIDER.swizzle(t, indexA, indexB, res);
	}
	
	public static float[] swizzle(ITupRF t, int indexA, int indexB, float[] res)
	{
		return PROVIDER.swizzle(t, indexA, indexB, res);
	}
	
	public static float[] swizzle(float[] t, int indexA, int indexB, float[] res)
	{
		return PROVIDER.swizzle(t, indexA, indexB, res);
	}
	
	public static float[] swizzle(float tv0, float tv1, int indexA, int indexB, float[] res)
	{
		return PROVIDER.swizzle(tv0, tv1, indexA, indexB, res);
	}
	
	public static <T extends ITup2RF> T swizzleCreateNew(ITup2RF t, int indexA, int indexB, T prototype)
	{
		return PROVIDER.swizzleCreateNew(t, indexA, indexB, prototype);
	}
	
	public static <T extends ITup2RF> T swizzleCreateNew(ITupRF t, int indexA, int indexB, T prototype)
	{
		return PROVIDER.swizzleCreateNew(t, indexA, indexB, prototype);
	}
	
	public static <T extends ITup2RF> T swizzleCreateNew(float[] t, int indexA, int indexB, T prototype)
	{
		return PROVIDER.swizzleCreateNew(t, indexA, indexB, prototype);
	}
	
	public static <T extends ITup2RF> T swizzleCreateNew(float tv0, float tv1, int indexA, int indexB, T prototype)
	{
		return PROVIDER.swizzleCreateNew(tv0, tv1, indexA, indexB, prototype);
	}
	
	public static <T extends ITup2WF> T swizzleV0V1(ITup2RF t, T res)
	{
		return PROVIDER.swizzleV0V1(t, res);
	}
	
	public static <T extends ITup2WF> T swizzleV0V1(ITupRF t, T res)
	{
		return PROVIDER.swizzleV0V1(t, res);
	}
	
	public static <T extends ITup2WF> T swizzleV0V1(float[] t, T res)
	{
		return PROVIDER.swizzleV0V1(t, res);
	}
	
	public static <T extends ITup2WF> T swizzleV0V1(float tv0, float tv1, T res)
	{
		return PROVIDER.swizzleV0V1(tv0, tv1, res);
	}
	
	public static float[] swizzleV0V1(ITup2RF t, float[] res)
	{
		return PROVIDER.swizzleV0V1(t, res);
	}
	
	public static float[] swizzleV0V1(ITupRF t, float[] res)
	{
		return PROVIDER.swizzleV0V1(t, res);
	}
	
	public static float[] swizzleV0V1(float[] t, float[] res)
	{
		return PROVIDER.swizzleV0V1(t, res);
	}
	
	public static float[] swizzleV0V1(float tv0, float tv1, float[] res)
	{
		return PROVIDER.swizzleV0V1(tv0, tv1, res);
	}
	
	public static <T extends ITup2RF> T swizzleV0V1CreateNew(ITup2RF t, T prototype)
	{
		return PROVIDER.swizzleV0V1CreateNew(t, prototype);
	}
	
	public static <T extends ITup2RF> T swizzleV0V1CreateNew(ITupRF t, T prototype)
	{
		return PROVIDER.swizzleV0V1CreateNew(t, prototype);
	}
	
	public static <T extends ITup2RF> T swizzleV0V1CreateNew(float[] t, T prototype)
	{
		return PROVIDER.swizzleV0V1CreateNew(t, prototype);
	}
	
	public static <T extends ITup2RF> T swizzleV0V1CreateNew(float tv0, float tv1, T prototype)
	{
		return PROVIDER.swizzleV0V1CreateNew(tv0, tv1, prototype);
	}
	
	public static class Comp
	{
		public static final ITupUtils2FProvider.CompareProvider PROVIDER;
		
		static
		{
			PROVIDER = BarghosUtilConfiguration.compareTupUtils2FProvider();
		}
		
		/**
		 * Returns whether the component values of this tuple and the component
		 * values of the given tuple {@code (t)} are exactly equal.
		 * 
		 * <p>
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does not require this tuple and the given
		 * tuple {@code (t)} to be the same instance.
		 * 
		 * <p>
		 * <b>Formula:</b>
		 * <br>
		 * {@code v(0) = t.v0}<br>
		 * {@code v(1) = t.v1}<br>
		 * 
		 * @param t The tuple to compare with.
		 * 
		 * @return
		 * <p>
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
		 * component values of this tuple and the given tuple are equal.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equals(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(t1, t2v0, t2v1);
		}

		public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(t1, t2v0, t2v1);
		}

		public static boolean equals(@AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(t1, t2);
		}

		public static boolean equals(@AllowNull float[] t1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(t1, t2v0, t2v1);
		}
		
		public static boolean equals(float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(t1v0, t1v1, t2);
		}

		public static boolean equals(float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(t1v0, t1v1, t2);
		}

		public static boolean equals(float t1v0, float t1v1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(t1v0, t1v1, t2);
		}

		public static boolean equals(float t1v0, float t1v1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(t1v0, t1v1, t2v0, t2v1);
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
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does require this tuple and the given
		 * tuple {@code t} to be the same instance.
		 * 
		 * <p>
		 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
		 * {@link #equals(ITup2RF)}.
		 * 
		 * <p>
		 * <b>Formula:</b>
		 * <br>
		 * {@code -tolerance <= (v(0) - t.v0) <= tolerance}<br>
		 * {@code -tolerance <= (v(1) - t.v1) <= tolerance}<br>
		 * 
		 * @param tolerance
		 * The tolerance around the values, that should still count as the value.
		 * @param t The tuple to compare with.
		 * 
		 * @return
		 * <p>
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
		 * component values of this tuple and the given tuple are equal, taking into
		 * account the given tolerance.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(tolerance, t1, t2v0, t2v1);
		}
		
		public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(tolerance, t1, t2v0, t2v1);
		}
		
		public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(tolerance, t1, t2);
		}

		public static boolean equals(float tolerance, @AllowNull float[] t1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(tolerance, t1, t2v0, t2v1);
		}
		
		public static boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equals(tolerance, t1v0, t1v1, t2);
		}

		public static boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equals(tolerance, t1v0, t1v1, t2);
		}

		public static boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull float[] t2)
		{
			return PROVIDER.equals(tolerance, t1v0, t1v1, t2);
		}

		public static boolean equals(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
		{
			return PROVIDER.equals(tolerance, t1v0, t1v1, t2v0, t2v1);
		}
		
		/**
		 * Returns whether the component value at the given index of this tuple and
		 * of the given tuple {@code (t)} are exactly equal.
		 * 
		 * <p>
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does not require this tuple and the given
		 * tuple {@code (t)} to be the same instance.
		 * 
		 * <p>
		 * The valid index range is from 0 to 1.
		 * 
		 * <table>
		 * <tr><th>Index</th><th>Component</th></tr>
		 * <tr><td>0</td><td>v0</td></tr>
		 * <tr><td>1</td><td>v1</td></tr>
		 * </table>
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
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and
		 * the component value at the given index of this tuple and the given tuple
		 * are equal.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull ITup2RF t1, float value)
		{
			return PROVIDER.equalsAt(index, t1, value);
		}

		public static boolean equalsAt(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(index, t1, t2v0, t2v1);
		}
		
		public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
		{
			return PROVIDER.equalsAt(index, t1, value);
		}

		public static boolean equalsAt(int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(index, t1, t2v0, t2v1);
		}
		
		public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(index, t1, t2);
		}

		public static boolean equalsAt(int index, @AllowNull float[] t1, float value)
		{
			return PROVIDER.equalsAt(index, t1, value);
		}

		public static boolean equalsAt(int index, @AllowNull float[] t1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(index, t1, t2v0, t2v1);
		}
		
		public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(index, t1v0, t1v1, t2);
		}

		public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(index, t1v0, t1v1, t2);
		}

		public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(index, t1v0, t1v1, t2);
		}

		public static boolean equalsAt(int index, float t1v0, float t1v1, float value)
		{
			return PROVIDER.equalsAt(index, t1v0, t1v1, value);
		}

		public static boolean equalsAt(int index, float t1v0, float t1v1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(index, t1v0, t1v1, t2v0, t2v1);
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
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does require this tuple and the given
		 * tuple {@code t} to be the same instance.
		 * 
		 * <p>
		 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
		 * {@link #equalsAt(int, ITup2RF)}.
		 * 
		 * <p>
		 * The valid index range is from 0 to 1.
		 * 
		 * <table>
		 * <tr><th>Index</th><th>Component</th></tr>
		 * <tr><td>0</td><td>v0</td></tr>
		 * <tr><td>1</td><td>v1</td></tr>
		 * </table>
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
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and
		 * the component value at the given index of this tuple and the given tuple
		 * are equal, taking into account the given tolerance.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float value)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, value);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2v0, t2v1);
		}
		
		public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float value)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, value);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2v0, t2v1);
		}
		
		public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float value)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, value);
		}

		public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(tolerance, index, t1, t2v0, t2v1);
		}
		
		public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1v0, t1v1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1v0, t1v1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAt(tolerance, index, t1v0, t1v1, t2);
		}

		public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float value)
		{
			return PROVIDER.equalsAt(tolerance, index, t1v0, t1v1, value);
		}

		public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t2v0, float t2v1)
		{
			return PROVIDER.equalsAt(tolerance, index, t1v0, t1v1, t2v0, t2v1);
		}
		
		/**
		 * Returns whether the first component value of this tuple and
		 * of the given tuple {@code (t)} are exactly equal.
		 * 
		 * <p>
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does not require this tuple and the given
		 * tuple {@code (t)} to be the same instance.
		 * 
		 * <p>
		 * <b>Formula:</b>
		 * <br>
		 * {@code v(0) = t.v0}
		 * 
		 * @param t The tuple to compare with.
		 * 
		 * @return
		 * <p>
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
		 * first component value of this tuple and the given tuple are equal.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull ITup2RF t1, float value)
		{
			return PROVIDER.equalsAtV0(t1, value);
		}

		public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull ITupRF t1, float value)
		{
			return PROVIDER.equalsAtV0(t1, value);
		}
		
		public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV0(t1, t2);
		}

		public static boolean equalsAtV0(@AllowNull float[] t1, float value)
		{
			return PROVIDER.equalsAtV0(t1, value);
		}
		
		/**
		 * Returns whether the second component value of this tuple and
		 * of the given tuple {@code (t)} are exactly equal.
		 * 
		 * <p>
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does not require this tuple and the given
		 * tuple {@code (t)} to be the same instance.
		 * 
		 * <p>
		 * <b>Formula:</b>
		 * <br>
		 * {@code v(1) = t.v1}
		 * 
		 * @param t The tuple to compare with.
		 * 
		 * @return
		 * <p>
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
		 * second component value of this tuple and the given tuple are equal.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull ITup2RF t1, float value)
		{
			return PROVIDER.equalsAtV1(t1, value);
		}

		public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull ITupRF t1, float value)
		{
			return PROVIDER.equalsAtV1(t1, value);
		}
		
		public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV1(t1, t2);
		}

		public static boolean equalsAtV1(@AllowNull float[] t1, float value)
		{
			return PROVIDER.equalsAtV1(t1, value);
		}
		
		/**
		 * Returns whether the first component value of this tuple and of the given
		 * tuple {@code (t)} are approximately equal.
		 * 
		 * <p>
		 * This takes into account an inclusive margin of the given tolerance around
		 * the compared values in positive and negative direction.
		 * This margin allows for example to compensate for floating point precision
		 * errors.
		 * 
		 * <p>
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does require this tuple and the given
		 * tuple {@code t} to be the same instance.
		 * 
		 * <p>
		 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
		 * {@link #equalsAtV0(ITup2RF)}.
		 * 
		 * <p>
		 * <b>Formula:</b>
		 * <br>
		 * {@code -tolerance <= (v(0) - t.v0) <= tolerance}
		 * 
		 * @param tolerance
		 * The tolerance around the values, that should still count as the value.
		 * @param t The tuple to compare with.
		 * 
		 * @return
		 * <p>
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
		 * first component value of this tuple and the given tuple are equal, taking
		 * into account the given tolerance.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, float value)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, value);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, float value)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, value);
		}
		
		public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, t2);
		}

		public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, float value)
		{
			return PROVIDER.equalsAtV0(tolerance, t1, value);
		}
		
		/**
		 * Returns whether the second component value of this tuple and of the given
		 * tuple {@code (t)} are approximately equal.
		 * 
		 * <p>
		 * This takes into account an inclusive margin of the given tolerance around
		 * the compared values in positive and negative direction.
		 * This margin allows for example to compensate for floating point precision
		 * errors.
		 * 
		 * <p>
		 * If the given tuple {@code (t)} is null this returns false.
		 * 
		 * <p>
		 * As in most situations only the component values of the tuple are relevant
		 * when working with tuples, this does require this tuple and the given
		 * tuple {@code t} to be the same instance.
		 * 
		 * <p>
		 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
		 * {@link #equalsAtV1(ITup2RF)}.
		 * 
		 * <p>
		 * <b>Formula:</b>
		 * <br>
		 * {@code -tolerance <= (v(1) - t.v1) <= tolerance}
		 * 
		 * @param tolerance
		 * The tolerance around the values, that should still count as the value.
		 * @param t The tuple to compare with.
		 * 
		 * @return
		 * <p>
		 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
		 * second component value of this tuple and the given tuple are equal,
		 * taking into account the given tolerance.
		 * 
		 * <p>
		 * {@code false} - Otherwise.
		 */
		public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, float value)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, value);
		}
		
		public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, float value)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, value);
		}
		
		public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, t2);
		}

		public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, float value)
		{
			return PROVIDER.equalsAtV1(tolerance, t1, value);
		}
		
		public static boolean isFinite(ITup2RF t)
		{
			return PROVIDER.isFinite(t);
		}
		
		public static boolean isFinite(ITupRF t)
		{
			return PROVIDER.isFinite(t);
		}
		
		public static boolean isFinite(float[] t)
		{
			return PROVIDER.isFinite(t);
		}
		
		public static boolean isFinite(float tv0, float tv1)
		{
			return PROVIDER.isFinite(tv0, tv1);
		}
		
		public static boolean isFiniteAt(int index, ITup2RF t)
		{
			return PROVIDER.isFiniteAt(index, t);
		}
		
		public static boolean isFiniteAt(int index, ITupRF t)
		{
			return PROVIDER.isFiniteAt(index, t);
		}
		
		public static boolean isFiniteAt(int index, float[] t)
		{
			return PROVIDER.isFiniteAt(index, t);
		}
		
		public static boolean isFiniteAt(int index, float tv0, float tv1)
		{
			return PROVIDER.isFiniteAt(index, tv0, tv1);
		}
		
		public static boolean isFiniteAtV0(ITup2RF t)
		{
			return PROVIDER.isFiniteAtV0(t);
		}
		
		public static boolean isFiniteAtV0(ITupRF t)
		{
			return PROVIDER.isFiniteAtV0(t);
		}
		
		public static boolean isFiniteAtV0(float[] t)
		{
			return PROVIDER.isFiniteAtV0(t);
		}
		
		public static boolean isFiniteAtV1(ITup2RF t)
		{
			return PROVIDER.isFiniteAtV1(t);
		}
		
		public static boolean isFiniteAtV1(ITupRF t)
		{
			return PROVIDER.isFiniteAtV1(t);
		}
		
		public static boolean isFiniteAtV1(float[] t)
		{
			return PROVIDER.isFiniteAtV1(t);
		}
		
		public static boolean isZero(ITup2RF t)
		{
			return PROVIDER.isZero(t);
		}
		
		public static boolean isZero(ITupRF t)
		{
			return PROVIDER.isZero(t);
		}
		
		public static boolean isZero(float[] t)
		{
			return PROVIDER.isZero(t);
		}
		
		public static boolean isZero(float tv0, float tv1)
		{
			return PROVIDER.isZero(tv0, tv1);
		}
		
		public static boolean isZero(float tolerance, ITup2RF t)
		{
			return PROVIDER.isZero(tolerance, t);
		}
		
		public static boolean isZero(float tolerance, ITupRF t)
		{
			return PROVIDER.isZero(tolerance, t);
		}
		
		public static boolean isZero(float tolerance, float[] t)
		{
			return PROVIDER.isZero(tolerance, t);
		}
		
		public static boolean isZero(float tolerance, float tv0, float tv1)
		{
			return PROVIDER.isZero(tolerance, tv0, tv1);
		}
		
		public static boolean isZeroAt(int index, ITup2RF t)
		{
			return PROVIDER.isZeroAt(index, t);
		}
		
		public static boolean isZeroAt(int index, ITupRF t)
		{
			return PROVIDER.isZeroAt(index, t);
		}
		
		public static boolean isZeroAt(int index, float[] t)
		{
			return PROVIDER.isZeroAt(index, t);
		}
		
		public static boolean isZeroAt(int index, float tv0, float tv1)
		{
			return PROVIDER.isZeroAt(index, tv0, tv1);
		}
		
		public static boolean isZeroAt(float tolerance, int index, ITup2RF t)
		{
			return PROVIDER.isZeroAt(tolerance, index, t);
		}
		
		public static boolean isZeroAt(float tolerance, int index, ITupRF t)
		{
			return PROVIDER.isZeroAt(tolerance, index, t);
		}
		
		public static boolean isZeroAt(float tolerance, int index, float[] t)
		{
			return PROVIDER.isZeroAt(tolerance, index, t);
		}
		
		public static boolean isZeroAt(float tolerance, int index, float tv0, float tv1)
		{
			return PROVIDER.isZeroAt(tolerance, index, tv0, tv1);
		}
		
		public static boolean isZeroAtV0(ITup2RF t)
		{
			return PROVIDER.isZeroAtV0(t);
		}
		
		public static boolean isZeroAtV0(ITupRF t)
		{
			return PROVIDER.isZeroAtV0(t);
		}
		
		public static boolean isZeroAtV0(float[] t)
		{
			return PROVIDER.isZeroAtV0(t);
		}
		
		public static boolean isZeroAtV1(ITup2RF t)
		{
			return PROVIDER.isZeroAtV1(t);
		}
		
		public static boolean isZeroAtV1(ITupRF t)
		{
			return PROVIDER.isZeroAtV1(t);
		}
		
		public static boolean isZeroAtV1(float[] t)
		{
			return PROVIDER.isZeroAtV1(t);
		}
		
		public static boolean isZeroAtV0(float tolerance, ITup2RF t)
		{
			return PROVIDER.isZeroAtV0(tolerance, t);
		}
		
		public static boolean isZeroAtV0(float tolerance, ITupRF t)
		{
			return PROVIDER.isZeroAtV0(tolerance, t);
		}
		
		public static boolean isZeroAtV0(float tolerance, float[] t)
		{
			return PROVIDER.isZeroAtV0(tolerance, t);
		}
		
		public static boolean isZeroAtV1(float tolerance, ITup2RF t)
		{
			return PROVIDER.isZeroAtV1(tolerance, t);
		}
		
		public static boolean isZeroAtV1(float tolerance, ITupRF t)
		{
			return PROVIDER.isZeroAtV1(tolerance, t);
		}
		
		public static boolean isZeroAtV1(float tolerance, float[] t)
		{
			return PROVIDER.isZeroAtV1(tolerance, t);
		}
	}

	public static class Lerp
	{
		public static final ITupUtils2FProvider.LerpProvider PROVIDER;
		
		static
		{
			PROVIDER = BarghosUtilConfiguration.lerpTupUtils2FProvider();
		}
		
		/**
		 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
		 * {@code (v2)} and saves the result in the given extraction parameter. This sacrifices for
		 * reduced calculations the precision and the applicability. The interpolation happens over the
		 * interpolator value alpha in the range of 0.0 to 1.0.
		 * 
		 * <p>
		 * Operation:<br>
		 * {@code v1 + ( v2 - v1 ) * alpha}
		 * 
		 * @param v1
		 *     The first vector.
		 * @param v2
		 *     The second vector.
		 * @param alpha
		 *     The interpolator in range of 0.0 to 1.0.
		 * @param res
		 *     The extraction parameter for the result as an array with at least two entries.
		 * 
		 * @return The extraction parameter with the result.
		 */
		public float[] lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public float[] lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}
		
		public float[] lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public float[] lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2v0, t2v1, res);
		}

		public float[] lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public float[] lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}
		
		public float[] lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public float[] lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2v0, t2v1, res);
		}
		
		public float[] lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public float[] lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}
		
		public float[] lerp(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public float[] lerp(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1, t2v0, t2v1, res);
		}

		public float[] lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2, res);
		}

		public float[] lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2, res);
		}
		
		public float[] lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2, res);
		}

		public float[] lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2WF> T lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T lerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2, res);
		}
		
		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.lerp(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.lerpCreateNew(alpha, t1v0, t1v1, t2v0, t2v1, prototype);
		}
		
		public float[] step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public float[] step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}
		
		public float[] step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public float[] step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2v0, t2v1, res);
		}

		public float[] step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public float[] step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}
		
		public float[] step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public float[] step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2v0, t2v1, res);
		}
		
		public float[] step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public float[] step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}
		
		public float[] step(double alpha, double midpoint, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public float[] step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2v0, t2v1, res);
		}

		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2, res);
		}

		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2, res);
		}
		
		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2, res);
		}

		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}
		
		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2, res);
		}
		
		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.step(alpha, midpoint, t1v0, t1v1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, float[] t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, float[] t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, ITupRF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float[] t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.stepCreateNew(alpha, midpoint, t1v0, t1v1, t2v0, t2v1, prototype);
		}
		
		public float[] smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public float[] smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}
		
		public float[] smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public float[] smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2v0, t2v1, res);
		}

		public float[] smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public float[] smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}
		
		public float[] smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public float[] smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2v0, t2v1, res);
		}
		
		public float[] smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public float[] smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}
		
		public float[] smoothstep(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public float[] smoothstep(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2v0, t2v1, res);
		}

		public float[] smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2, res);
		}

		public float[] smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2, res);
		}
		
		public float[] smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2, res);
		}

		public float[] smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2, res);
		}
		
		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smoothstep(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smoothstepCreateNew(alpha, t1v0, t1v1, t2v0, t2v1, prototype);
		}
		
		public float[] smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public float[] smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}
		
		public float[] smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public float[] smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2v0, t2v1, res);
		}

		public float[] smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public float[] smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}
		
		public float[] smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public float[] smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2v0, t2v1, res);
		}
		
		public float[] smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public float[] smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		
		public float[] smootherstep(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public float[] smootherstep(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2v0, t2v1, res);
		}

		public float[] smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2, res);
		}

		public float[] smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2, res);
		}
		
		public float[] smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2, res);
		}

		public float[] smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2, res);
		}
		
		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.smootherstep(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.smootherstepCreateNew(alpha, t1v0, t1v1, t2v0, t2v1, prototype);
		}
		
		public float[] intLerp(double alpha, ITup2RF t, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t, res);
		}

		public float[] intLerp(double alpha, ITupRF t, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t, res);
		}
		
		public float[] intLerp(double alpha, float[] t, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t, res);
		}

		public float[] intLerp(double alpha, float tv0, float tv1, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, tv0, tv1, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t, res);
		}
		
		public <T extends ITup2WF> T intLerp(double alpha, float[] t, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, float tv0, float tv1, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, tv0, tv1, res);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t, prototype);
		}

		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t, prototype);
		}

		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float tv0, float tv1, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, tv0, tv1, prototype);
		}
		
		public float[] intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public float[] intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}
		
		public float[] intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public float[] intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2v0, t2v1, res);
		}

		public float[] intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public float[] intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}
		
		public float[] intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public float[] intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2v0, t2v1, res);
		}
		
		public float[] intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public float[] intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}
		
		public float[] intLerp(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public float[] intLerp(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1, t2v0, t2v1, res);
		}

		public float[] intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2, res);
		}

		public float[] intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2, res);
		}
		
		public float[] intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2, res);
		}

		public float[] intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}
		
		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1, t2v0, t2v1, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2, res);
		}
		
		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2, res);
		}

		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			return PROVIDER.intLerp(alpha, t1v0, t1v1, t2v0, t2v1, res);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1, t2v0, t2v1, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1v0, t1v1, t2, prototype);
		}
		
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return PROVIDER.intLerpCreateNew(alpha, t1v0, t1v1, t2v0, t2v1, prototype);
		}
	}
}
