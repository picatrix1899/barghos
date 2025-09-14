package org.barghos.api.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.accessor.floats.IIndexAccessorIRF;
import org.barghos.api.core.accessor.floats.IKeyAccessorRF;
import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.api.core.collection.KeyValuePairF;
import org.barghos.api.core.function.floats.IFunc2F;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.TupUtils2F;

/**
 * This class provides vector operations for two dimensions.
 */
public class VecUtils2F
{
	public static IndexValuePairF min(ITup2RF t, @ExtractionParam IndexValuePairF res)
	{
		float value = t.v0();
		int index = 0;

		float tv1 = t.v1();

		if (tv1 < value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF min(ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		float value = t.getAt(0);
		int index = 0;

		float tv1 = t.getAt(1);

		if (tv1 < value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF min(float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[0];
		int index = 0;

		float tv1 = t[1];

		if (tv1 < value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF min(float tv0, float tv1, @ExtractionParam IndexValuePairF res)
	{
		float value = tv0;
		int index = 0;

		if (tv1 < value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static <T> IndexValuePairF min(IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		float value = accessor.get(obj, 0);
		int index = 0;

		float tv1 = accessor.get(obj, 1);

		if (tv1 < value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static <T,K> KeyValuePairF<K> min(K[] keys, IKeyAccessorRF<T, K> accessor, T obj, @ExtractionParam KeyValuePairF<K> res)
	{
		float value = accessor.get(obj, keys[0]);
		K key = keys[0];

		float tv1 = accessor.get(obj, keys[1]);

		if (tv1 < value)
		{
			value = tv1;
			key = keys[1];
		}

		res.set(value, key);

		return res;
	}

	public static IndexValuePairF minAligned(int startIndexT, ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		float value = t.getAt(startIndexT);
		int index = startIndexT;

		float tv1 = t.getAt(startIndexT + 1);

		if (tv1 < value)
		{
			value = tv1;
			index = startIndexT + 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF minAligned(int startIndexT, float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[startIndexT];
		int index = startIndexT;

		float tv1 = t[startIndexT + 1];

		if (tv1 < value)
		{
			value = tv1;
			index = startIndexT + 1;
		}

		res.set(value, index);

		return res;
	}

	public static <T> IndexValuePairF minAligned(int startIndexT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		float tv0 = accessor.get(obj, startIndexT);

		float value = tv0;
		int index = startIndexT;

		float tv1 = accessor.get(obj, startIndexT + 1);

		if (tv1 < value)
		{
			value = tv1;
			index = startIndexT + 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF minUnaligned(int[] indicesT, ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		float value = t.getAt(indicesT[0]);
		int index = indicesT[0];

		float tv1 = t.getAt(indicesT[1]);

		if (tv1 < value)
		{
			value = tv1;
			index = indicesT[1];
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF minUnaligned(int[] indicesT, float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[indicesT[0]];
		int index = indicesT[0];

		float tv1 = t[indicesT[1]];

		if (tv1 < value)
		{
			value = tv1;
			index = indicesT[1];
		}

		res.set(value, index);

		return res;
	}

	public static <T> IndexValuePairF minUnaligned(int[] indicesT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		float tv0 = accessor.get(obj, indicesT[0]);

		float value = tv0;
		int index = indicesT[0];

		float tv1 = accessor.get(obj, indicesT[1]);

		if (tv1 < value)
		{
			value = tv1;
			index = indicesT[1];
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF minUnaligned(int indexTV0, int indexTV1, ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		float value = t.getAt(indexTV0);
		int index = indexTV0;

		float tv1 = t.getAt(indexTV1);

		if (tv1 < value)
		{
			value = tv1;
			index = indexTV1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF minUnaligned(int indexTV0, int indexTV1, float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[indexTV0];
		int index = indexTV0;

		float tv1 = t[indexTV1];

		if (tv1 < value)
		{
			value = tv1;
			index = indexTV1;
		}

		res.set(value, index);

		return res;
	}

	public static <T> IndexValuePairF minUnaligned(int indexTV0, int indexTV1, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
	{
		float tv0 = accessor.get(obj, indexTV0);

		float value = tv0;
		int index = indexTV0;

		float tv1 = accessor.get(obj, indexTV1);

		if (tv1 < value)
		{
			value = tv1;
			index = indexTV1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF max(ITup2RF t, @ExtractionParam IndexValuePairF res)
	{
		float value = t.v0();
		int index = 0;

		float tv1 = t.v1();

		if (tv1 > value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF max(ITupRF t, @ExtractionParam IndexValuePairF res)
	{
		float value = t.getAt(0);
		int index = 0;

		float tv1 = t.getAt(1);

		if (tv1 > value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF max(float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[0];
		int index = 0;

		float tv1 = t[1];

		if (tv1 > value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF max(float tv0, float tv1, @ExtractionParam IndexValuePairF res)
	{
		float value = tv0;
		int index = 0;

		if (tv1 > value)
		{
			value = tv1;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static float[] minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2.v0());
		res[1] = Math.min(t1.v1(), t2.v1());

		return res;
	}

	public static float[] minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2.getAt(0));
		res[1] = Math.min(t1.v1(), t2.getAt(1));

		return res;
	}

	public static float[] minComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2[0]);
		res[1] = Math.min(t1.v1(), t2[1]);

		return res;
	}

	public static float[] minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2v0);
		res[1] = Math.min(t1.v1(), t2v1);

		return res;
	}

	public static float[] minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2.v0());
		res[1] = Math.min(t1.getAt(1), t2.v1());

		return res;
	}

	public static float[] minComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2.getAt(0));
		res[1] = Math.min(t1.getAt(1), t2.getAt(1));

		return res;
	}

	public static float[] minComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2[0]);
		res[1] = Math.min(t1.getAt(1), t2[1]);

		return res;
	}

	public static float[] minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2v0);
		res[1] = Math.min(t1.getAt(1), t2v1);

		return res;
	}

	public static float[] minComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2.v0());
		res[1] = Math.min(t1[1], t2.v1());

		return res;
	}

	public static float[] minComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2.getAt(0));
		res[1] = Math.min(t1[1], t2.getAt(1));

		return res;
	}

	public static float[] minComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2[0]);
		res[1] = Math.min(t1[1], t2[1]);

		return res;
	}

	public static float[] minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2v0);
		res[1] = Math.min(t1[1], t2v1);

		return res;
	}

	public static float[] minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2.v0());
		res[1] = Math.min(t1v1, t2.v1());

		return res;
	}

	public static float[] minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2.getAt(0));
		res[1] = Math.min(t1v1, t2.getAt(1));

		return res;
	}

	public static float[] minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2[0]);
		res[1] = Math.min(t1v1, t2[1]);

		return res;
	}

	public static float[] minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2v0);
		res[1] = Math.min(t1v1, t2v1);

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2.v0()), Math.min(t1.v1(), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2.getAt(0)), Math.min(t1.v1(), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2[0]), Math.min(t1.v1(), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2v0), Math.min(t1.v1(), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2.v0()), Math.min(t1.getAt(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2.getAt(0)), Math.min(t1.getAt(1), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2[0]), Math.min(t1.getAt(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2v0), Math.min(t1.getAt(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2.v0()), Math.min(t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2.getAt(0)), Math.min(t1[1], t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2[0]), Math.min(t1[1], t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2v0), Math.min(t1[1], t2v1));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2.v0()), Math.min(t1v1, t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2.getAt(0)), Math.min(t1v1, t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2[0]), Math.min(t1v1, t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2v0), Math.min(t1v1, t2v1));

		return res;
	}

	public static <T> T minComponentsFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.v0(), t2.v0()), Math.min(t1.v1(), t2.v1()));
	}

	public static <T> T minComponentsFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.v0(), t2.getAt(0)), Math.min(t1.v1(), t2.getAt(1)));
	}

	public static <T> T minComponentsFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.v0(), t2[0]), Math.min(t1.v1(), t2[1]));
	}

	public static <T> T minComponentsFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.v0(), t2v0), Math.min(t1.v1(), t2v1));
	}

	public static <T> T minComponentsFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.getAt(0), t2.v0()), Math.min(t1.getAt(1), t2.v1()));
	}

	public static <T> T minComponentsFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.getAt(0), t2.getAt(0)), Math.min(t1.getAt(1), t2.getAt(1)));
	}

	public static <T> T minComponentsFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.getAt(0), t2[0]), Math.min(t1.getAt(1), t2[1]));
	}

	public static <T> T minComponentsFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.getAt(0), t2v0), Math.min(t1.getAt(1), t2v1));
	}

	public static <T> T minComponentsFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1[0], t2.v0()), Math.min(t1[1], t2.v1()));
	}

	public static <T> T minComponentsFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1[0], t2.getAt(0)), Math.min(t1[1], t2.getAt(1)));
	}

	public static <T> T minComponentsFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1[0], t2[0]), Math.min(t1[1], t2[1]));
	}

	public static <T> T minComponentsFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1[0], t2v0), Math.min(t1[1], t2v1));
	}

	public static <T> T minComponentsFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1v0, t2.v0()), Math.min(t1v1, t2.v1()));
	}

	public static <T> T minComponentsFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1v0, t2.getAt(0)), Math.min(t1v1, t2.getAt(1)));
	}

	public static <T> T minComponentsFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1v0, t2[0]), Math.min(t1v1, t2[1]));
	}

	public static <T> T minComponentsFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1v0, t2v0), Math.min(t1v1, t2v1));
	}

	public static float[] maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2.v0());
		res[1] = Math.max(t1.v1(), t2.v1());

		return res;
	}

	public static float[] maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2.getAt(0));
		res[1] = Math.max(t1.v1(), t2.getAt(1));

		return res;
	}

	public static float[] maxComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2[0]);
		res[1] = Math.max(t1.v1(), t2[1]);

		return res;
	}

	public static float[] maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2v0);
		res[1] = Math.max(t1.v1(), t2v1);

		return res;
	}

	public static float[] maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2.v0());
		res[1] = Math.max(t1.getAt(1), t2.v1());

		return res;
	}

	public static float[] maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2.getAt(0));
		res[1] = Math.max(t1.getAt(1), t2.getAt(1));

		return res;
	}

	public static float[] maxComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2[0]);
		res[1] = Math.max(t1.getAt(1), t2[1]);

		return res;
	}

	public static float[] maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2v0);
		res[1] = Math.max(t1.getAt(1), t2v1);

		return res;
	}

	public static float[] maxComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2.v0());
		res[1] = Math.max(t1[1], t2.v1());

		return res;
	}

	public static float[] maxComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2.getAt(0));
		res[1] = Math.max(t1[1], t2.getAt(1));

		return res;
	}

	public static float[] maxComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2[0]);
		res[1] = Math.max(t1[1], t2[1]);

		return res;
	}

	public static float[] maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2v0);
		res[1] = Math.max(t1[1], t2v1);

		return res;
	}

	public static float[] maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2.v0());
		res[1] = Math.max(t1v1, t2.v1());

		return res;
	}

	public static float[] maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2.getAt(0));
		res[1] = Math.max(t1v1, t2.getAt(1));

		return res;
	}

	public static float[] maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2[0]);
		res[1] = Math.max(t1v1, t2[1]);

		return res;
	}

	public static float[] maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2v0);
		res[1] = Math.max(t1v1, t2v1);

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2.v0()), Math.max(t1.v1(), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2.getAt(0)), Math.max(t1.v1(), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2[0]), Math.max(t1.v1(), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2v0), Math.max(t1.v1(), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2.v0()), Math.max(t1.getAt(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2.getAt(0)), Math.max(t1.getAt(1), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2[0]), Math.max(t1.getAt(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2v0), Math.max(t1.getAt(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2.v0()), Math.max(t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2.getAt(0)), Math.max(t1[1], t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2[0]), Math.max(t1[1], t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2v0), Math.max(t1[1], t2v1));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2.v0()), Math.max(t1v1, t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2.getAt(0)), Math.max(t1v1, t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2[0]), Math.max(t1v1, t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2v0), Math.max(t1v1, t2v1));

		return res;
	}

	public static <T> T maxComponentsFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.v0(), t2.v0()), Math.max(t1.v1(), t2.v1()));
	}

	public static <T> T maxComponentsFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.v0(), t2.getAt(0)), Math.max(t1.v1(), t2.getAt(1)));
	}

	public static <T> T maxComponentsFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.v0(), t2[0]), Math.max(t1.v1(), t2[1]));
	}

	public static <T> T maxComponentsFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.v0(), t2v0), Math.max(t1.v1(), t2v1));
	}

	public static <T> T maxComponentsFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.getAt(0), t2.v0()), Math.max(t1.getAt(1), t2.v1()));
	}

	public static <T> T maxComponentsFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.getAt(0), t2.getAt(0)), Math.max(t1.getAt(1), t2.getAt(1)));
	}

	public static <T> T maxComponentsFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.getAt(0), t2[0]), Math.max(t1.getAt(1), t2[1]));
	}

	public static <T> T maxComponentsFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.getAt(0), t2v0), Math.max(t1.getAt(1), t2v1));
	}

	public static <T> T maxComponentsFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1[0], t2.v0()), Math.max(t1[1], t2.v1()));
	}

	public static <T> T maxComponentsFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1[0], t2.getAt(0)), Math.max(t1[1], t2.getAt(1)));
	}

	public static <T> T maxComponentsFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1[0], t2[0]), Math.max(t1[1], t2[1]));
	}

	public static <T> T maxComponentsFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1[0], t2v0), Math.max(t1[1], t2v1));
	}

	public static <T> T maxComponentsFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1v0, t2.v0()), Math.max(t1v1, t2.v1()));
	}

	public static <T> T maxComponentsFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1v0, t2.getAt(0)), Math.max(t1v1, t2.getAt(1)));
	}

	public static <T> T maxComponentsFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1v0, t2[0]), Math.max(t1v1, t2[1]));
	}

	public static <T> T maxComponentsFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1v0, t2v0), Math.max(t1v1, t2v1));
	}

	public static float[] swizzle(ITup2RF t, int[] indices, @ExtractionParam float[] res)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;

		return res;
	}

	public static float[] swizzle(ITupRF t, int[] indices, @ExtractionParam float[] res)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;

		return res;
	}

	public static float[] swizzle(float[] t, int[] indices, @ExtractionParam float[] res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;

		return res;
	}

	public static float[] swizzle(float tv0, float tv1, int[] indices, @ExtractionParam float[] res)
	{
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;

		return res;
	}

	public static <T extends ITup2WF> T swizzle(ITup2RF t, int[] indices, @ExtractionParam T res)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);

		return res;
	}

	public static <T extends ITup2WF> T swizzle(ITupRF t, int[] indices, @ExtractionParam T res)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);

		return res;
	}

	public static <T extends ITup2WF> T swizzle(float[] t, int[] indices, @ExtractionParam T res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);

		return res;
	}

	public static <T extends ITup2WF> T swizzle(float tv0, float tv1, int[] indices, @ExtractionParam T res)
	{
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);

		return res;
	}

	public static <T> T swizzleFunc(ITup2RF t, int[] indices, IFunc2F<T> func)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}

	public static <T> T swizzleFunc(ITupRF t, int[] indices, IFunc2F<T> func)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}

	public static <T> T swizzleFunc(float[] t, int[] indices, IFunc2F<T> func)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}

	public static <T> T swizzleFunc(float tv0, float tv1, int[] indices, IFunc2F<T> func)
	{
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}

	public static float[] swizzle(ITup2RF t, int index0, int index1, @ExtractionParam float[] res)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;
		
		return res;
	}

	public static float[] swizzle(ITupRF t, int index0, int index1, @ExtractionParam float[] res)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;
		
		return res;
	}

	public static float[] swizzle(float[] t, int index0, int index1, @ExtractionParam float[] res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;
		
		return res;
	}

	public static float[] swizzle(float tv0, float tv1, int index0, int index1, @ExtractionParam float[] res)
	{
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;

		return res;
	}

	public static <T extends ITup2WF> T swizzle(ITup2RF t, int index0, int index1, @ExtractionParam T res)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);
		
		return res;
	}

	public static <T extends ITup2WF> T swizzle(ITupRF t, int index0, int index1, @ExtractionParam T res)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);
		
		return res;
	}

	public static <T extends ITup2WF> T swizzle(float[] t, int index0, int index1, @ExtractionParam T res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);
		
		return res;
	}

	public static <T extends ITup2WF> T swizzle(float tv0, float tv1, int index0, int index1, @ExtractionParam T res)
	{
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		res.set(v0, v1);
		
		return res;
	}
	
	public static <T> T swizzleFunc(ITup2RF t, int index0, int index1, IFunc2F<T> func)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}
	
	public static <T> T swizzleFunc(ITupRF t, int index0, int index1, IFunc2F<T> func)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}
	
	public static <T> T swizzleFunc(float[] t, int index0, int index1, IFunc2F<T> func)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}
	
	public static <T> T swizzleFunc(float tv0, float tv1, int index0, int index1, IFunc2F<T> func)
	{
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};

		return func.apply(v0, v1);
	}

	public static float[] swap(ITup2RF t, int indexA, int indexB, @ExtractionParam float[] res)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		if(indexA == indexB)
		{
			res[0] = tv0;
			res[1] = tv1;
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rv0;
		res[1] = rv1;

		return res;
	}

	public static float[] swap(ITupRF t, int indexA, int indexB, @ExtractionParam float[] res)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		if(indexA == indexB)
		{
			res[0] = tv0;
			res[1] = tv1;
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rv0;
		res[1] = rv1;

		return res;
	}

	public static float[] swap(float[] t, int indexA, int indexB, @ExtractionParam float[] res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		if(indexA == indexB)
		{
			res[0] = tv0;
			res[1] = tv1;
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rv0;
		res[1] = rv1;

		return res;
	}

	public static float[] swap(float tv0, float tv1, int indexA, int indexB, @ExtractionParam float[] res)
	{
		if(indexA == indexB)
		{
			res[0] = tv0;
			res[1] = tv1;
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rv0;
		res[1] = rv1;

		return res;
	}

	public static <T extends ITup2WF> T swap(ITup2RF t, int indexA, int indexB, @ExtractionParam T res)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		if(indexA == indexB)
		{
			res.set(tv0, tv1);
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}

		res.set(rv0, rv1);

		return res;
	}

	public static <T extends ITup2WF> T swap(ITupRF t, int indexA, int indexB, @ExtractionParam T res)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		if(indexA == indexB)
		{
			res.set(tv0, tv1);
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}

		res.set(rv0, rv1);

		return res;
	}

	public static <T extends ITup2WF> T swap(float[] t, int indexA, int indexB, @ExtractionParam T res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		if(indexA == indexB)
		{
			res.set(tv0, tv1);
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}

		res.set(rv0, rv1);

		return res;
	}

	public static <T extends ITup2WF> T swap(float tv0, float tv1, int indexA, int indexB, @ExtractionParam T res)
	{
		if(indexA == indexB)
		{
			res.set(tv0, tv1);
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		res.set(rv0, rv1);

		return res;
	}
	
	public static <T> T swapFunc(ITup2RF t, int indexA, int indexB, IFunc2F<T> func)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		if(indexA == indexB) return func.apply(tv0, tv1);
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		return func.apply(rv0, rv1);
	}

	public static <T> T swapFunc(ITupRF t, int indexA, int indexB, IFunc2F<T> func)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		if(indexA == indexB) return func.apply(tv0, tv1);
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		return func.apply(rv0, rv1);
	}

	public static <T> T swapFunc(float[] t, int indexA, int indexB, IFunc2F<T> func)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		if(indexA == indexB) return func.apply(tv0, tv1);
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		return func.apply(rv0, rv1);
	}
	
	public static <T> T swapFunc(float tv0, float tv1, int indexA, int indexB, IFunc2F<T> func)
	{
		if(indexA == indexB) return func.apply(tv0, tv1);
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		return func.apply(rv0, rv1);
	}

	public static float[] swapV0V1(ITup2RF t, @ExtractionParam float[] res)
	{
		float tv0 = t.v0();
		float tv1 = t.v1();
		
		res[0] = tv1;
		res[1] = tv0;

		return res;
	}

	public static float[] swapV0V1(ITupRF t, @ExtractionParam float[] res)
	{
		float tv0 = t.getAt(0);
		float tv1 = t.getAt(1);
		
		res[0] = tv1;
		res[1] = tv0;

		return res;
	}

	public static float[] swapV0V1(float[] t, @ExtractionParam float[] res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		
		res[0] = tv1;
		res[1] = tv0;

		return res;
	}

	public static float[] swapV0V1(float tv0, float tv1, @ExtractionParam float[] res)
	{
		res[0] = tv1;
		res[1] = tv0;

		return res;
	}

	public static <T extends ITup2WF> T swapV0V1(ITup2RF t, @ExtractionParam T res)
	{
		res.set(t.v1(), t.v0());

		return res;
	}

	public static <T extends ITup2WF> T swapV0V1(ITupRF t, @ExtractionParam T res)
	{
		res.set(t.getAt(0), t.getAt(1));

		return res;
	}

	public static <T extends ITup2WF> T swapV0V1(float[] t, @ExtractionParam T res)
	{
		res.set(t[1], t[0]);

		return res;
	}

	public static <T extends ITup2WF> T swapV0V1(float tv0, float tv1, @ExtractionParam T res)
	{
		res.set(tv1, tv0);

		return res;
	}
	
	public static <T> T swapV0V1Func(ITup2RF t, IFunc2F<T> func)
	{
		return func.apply(t.v1(), t.v0());
	}
	
	public static <T> T swapV0V1Func(ITupRF t, IFunc2F<T> func)
	{
		return func.apply(t.getAt(0), t.getAt(1));
	}
	
	public static <T> T swapV0V1Func(float[] t, IFunc2F<T> func)
	{
		return func.apply(t[1], t[0]);
	}
	
	public static <T> T swapV0V1Func(float tv0, float tv1, IFunc2F<T> func)
	{
		return func.apply(tv1, tv0);
	}
	
	public static float[] lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.v0(), t2.v0());
		res[1] = MathUtils.lerp(alpha, t1.v1(), t2.v1());

		return res;
	}

	public static float[] lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.v0(), t2.getAt(0));
		res[1] = MathUtils.lerp(alpha, t1.v1(), t2.getAt(1));

		return res;
	}

	public static float[] lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.v0(), t2[0]);
		res[1] = MathUtils.lerp(alpha, t1.v1(), t2[1]);

		return res;
	}

	public static float[] lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.v0(), t2v0);
		res[1] = MathUtils.lerp(alpha, t1.v1(), t2v1);

		return res;
	}

	public static float[] lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.getAt(0), t2.v0());
		res[1] = MathUtils.lerp(alpha, t1.getAt(1), t2.v1());

		return res;
	}

	public static float[] lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.getAt(0), t2.getAt(0));
		res[1] = MathUtils.lerp(alpha, t1.getAt(1), t2.getAt(1));

		return res;
	}

	public static float[] lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.getAt(0), t2[0]);
		res[1] = MathUtils.lerp(alpha, t1.getAt(1), t2[1]);

		return res;
	}

	public static float[] lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.getAt(0), t2v0);
		res[1] = MathUtils.lerp(alpha, t1.getAt(1), t2v1);

		return res;
	}

	public static float[] lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1[0], t2.v0());
		res[1] = MathUtils.lerp(alpha, t1[1], t2.v1());

		return res;
	}

	public static float[] lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1[0], t2.getAt(0));
		res[1] = MathUtils.lerp(alpha, t1[1], t2.getAt(1));

		return res;
	}

	public static float[] lerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1[0], t2[0]);
		res[1] = MathUtils.lerp(alpha, t1[1], t2[1]);

		return res;
	}

	public static float[] lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1[0], t2v0);
		res[1] = MathUtils.lerp(alpha, t1[1], t2v1);

		return res;
	}

	public static float[] lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1v0, t2.v0());
		res[1] = MathUtils.lerp(alpha, t1v1, t2.v1());

		return res;
	}

	public static float[] lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1v0, t2.getAt(0));
		res[1] = MathUtils.lerp(alpha, t1v1, t2.getAt(1));

		return res;
	}

	public static float[] lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1v0, t2[0]);
		res[1] = MathUtils.lerp(alpha, t1v1, t2[1]);

		return res;
	}

	public static float[] lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1v0, t2v0);
		res[1] = MathUtils.lerp(alpha, t1v1, t2v1);

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.v0(), t2.v0()), MathUtils.lerp(alpha, t1.v1(), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.lerp(alpha, t1.v1(), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.v0(), t2[0]), MathUtils.lerp(alpha, t1.v1(), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.v0(), t2v0), MathUtils.lerp(alpha, t1.v1(), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.getAt(0), t2.v0()), MathUtils.lerp(alpha, t1.getAt(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.lerp(alpha, t1.getAt(1), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.getAt(0), t2[0]), MathUtils.lerp(alpha, t1.getAt(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.getAt(0), t2v0), MathUtils.lerp(alpha, t1.getAt(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1[0], t2.v0()), MathUtils.lerp(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1[0], t2.getAt(0)), MathUtils.lerp(alpha, t1[1], t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1[0], t2[0]), MathUtils.lerp(alpha, t1[1], t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1[0], t2v0), MathUtils.lerp(alpha, t1[1], t2v1));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1v0, t2.v0()), MathUtils.lerp(alpha, t1v1, t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1v0, t2.getAt(0)), MathUtils.lerp(alpha, t1v1, t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1v0, t2[0]), MathUtils.lerp(alpha, t1v1, t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1v0, t2v0), MathUtils.lerp(alpha, t1v1, t2v1));

		return res;
	}
	
	public static <T> T lerpFunc(double alpha, ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.v0(), t2.v0()), MathUtils.lerp(alpha, t1.v1(), t2.v1()));
	}
	
	public static<T> T lerpFunc(double alpha, ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.lerp(alpha, t1.v1(), t2.getAt(1)));
	}
	
	public static <T> T lerpFunc(double alpha, ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.v0(), t2[0]), MathUtils.lerp(alpha, t1.v1(), t2[1]));
	}
	
	public static <T> T lerpFunc(double alpha, ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.v0(), t2v0), MathUtils.lerp(alpha, t1.v1(), t2v1));
	}
	
	public static<T> T lerpFunc(double alpha, ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.getAt(0), t2.v0()), MathUtils.lerp(alpha, t1.getAt(1), t2.v1()));
	}
	
	public static <T> T lerpFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.lerp(alpha, t1.getAt(1), t2.getAt(1)));
	}
	
	public static <T> T lerpFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.getAt(0), t2[0]), MathUtils.lerp(alpha, t1.getAt(1), t2[1]));
	}
	
	public static <T> T lerpFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.getAt(0), t2v0), MathUtils.lerp(alpha, t1.getAt(1), t2v1));
	}
	
	public static <T> T lerpFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1[0], t2.v0()), MathUtils.lerp(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T lerpFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1[0], t2.getAt(0)), MathUtils.lerp(alpha, t1[1], t2.getAt(1)));
	}
	
	public static <T> T lerpFunc(double alpha, float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1[0], t2[0]), MathUtils.lerp(alpha, t1[1], t2[1]));
	}
	
	public static <T> T lerpFunc(double alpha, float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1[0], t2v0), MathUtils.lerp(alpha, t1[1], t2v1));
	}
	
	public static <T> T lerpFunc(double alpha, float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1v0, t2.v0()), MathUtils.lerp(alpha, t1v1, t2.v1()));
	}
	
	public static <T> T lerpFunc(double alpha, float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1v0, t2.getAt(0)), MathUtils.lerp(alpha, t1v1, t2.getAt(1)));
	}
	
	public static <T> T lerpFunc(double alpha, float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1v0, t2[0]), MathUtils.lerp(alpha, t1v1, t2[1]));
	}
	
	public static <T> T lerpFunc(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1v0, t2v0), MathUtils.lerp(alpha, t1v1, t2v1));
	}

	public static float[] step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.v0(), t2.v0());
		res[1] = MathUtils.step(alpha, midpoint, t1.v1(), t2.v1());

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.v0(), t2.getAt(0));
		res[1] = MathUtils.step(alpha, midpoint, t1.v1(), t2.getAt(1));

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.v0(), t2[0]);
		res[1] = MathUtils.step(alpha, midpoint, t1.v1(), t2[1]);

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.v0(), t2v0);
		res[1] = MathUtils.step(alpha, midpoint, t1.v1(), t2v1);

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.getAt(0), t2.v0());
		res[1] = MathUtils.step(alpha, midpoint, t1.getAt(1), t2.v1());

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.getAt(0), t2.getAt(0));
		res[1] = MathUtils.step(alpha, midpoint, t1.getAt(1), t2.getAt(1));

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.getAt(0), t2[0]);
		res[1] = MathUtils.step(alpha, midpoint, t1.getAt(1), t2[1]);

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.getAt(0), t2v0);
		res[1] = MathUtils.step(alpha, midpoint, t1.getAt(1), t2v1);

		return res;
	}

	public static float[] step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1[0], t2.v0());
		res[1] = MathUtils.step(alpha, midpoint, t1[1], t2.v1());

		return res;
	}

	public static float[] step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1[0], t2.getAt(0));
		res[1] = MathUtils.step(alpha, midpoint, t1[1], t2.getAt(1));

		return res;
	}

	public static float[] step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1[0], t2[0]);
		res[1] = MathUtils.step(alpha, midpoint, t1[1], t2[1]);

		return res;
	}

	public static float[] step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1[0], t2v0);
		res[1] = MathUtils.step(alpha, midpoint, t1[1], t2v1);

		return res;
	}

	public static float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1v0, t2.v0());
		res[1] = MathUtils.step(alpha, midpoint, t1v1, t2.v1());

		return res;
	}

	public static float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1v0, t2.getAt(0));
		res[1] = MathUtils.step(alpha, midpoint, t1v1, t2.getAt(1));

		return res;
	}

	public static float[] step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1v0, t2[0]);
		res[1] = MathUtils.step(alpha, midpoint, t1v1, t2[1]);

		return res;
	}

	public static float[] step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1v0, t2v0);
		res[1] = MathUtils.step(alpha, midpoint, t1v1, t2v1);

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.v0(), t2.v0()), MathUtils.step(alpha, midpoint, t1.v1(), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.v0(), t2.getAt(0)), MathUtils.step(alpha, midpoint, t1.v1(), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.v0(), t2[0]), MathUtils.step(alpha, midpoint, t1.v1(), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.v0(), t2v0), MathUtils.step(alpha, midpoint, t1.v1(), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.getAt(0), t2.v0()), MathUtils.step(alpha, midpoint, t1.getAt(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.getAt(0), t2.getAt(0)), MathUtils.step(alpha, midpoint, t1.getAt(1), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.getAt(0), t2[0]), MathUtils.step(alpha, midpoint, t1.getAt(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.getAt(0), t2v0), MathUtils.step(alpha, midpoint, t1.getAt(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1[0], t2.v0()), MathUtils.step(alpha, midpoint, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1[0], t2.getAt(0)), MathUtils.step(alpha, midpoint, t1[1], t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1[0], t2[0]), MathUtils.step(alpha, midpoint, t1[1], t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1[0], t2v0), MathUtils.step(alpha, midpoint, t1[1], t2v1));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1v0, t2.v0()), MathUtils.step(alpha, midpoint, t1v1, t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1v0, t2.getAt(0)), MathUtils.step(alpha, midpoint, t1v1, t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1v0, t2[0]), MathUtils.step(alpha, midpoint, t1v1, t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1v0, t2v0), MathUtils.step(alpha, midpoint, t1v1, t2v1));

		return res;
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.v0(), t2.v0()), MathUtils.step(alpha, midpoint, t1.v1(), t2.v1()));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.v0(), t2.getAt(0)), MathUtils.step(alpha, midpoint, t1.v1(), t2.getAt(1)));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.v0(), t2[0]), MathUtils.step(alpha, midpoint, t1.v1(), t2[1]));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.v0(), t2v0), MathUtils.step(alpha, midpoint, t1.v1(), t2v1));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.getAt(0), t2.v0()), MathUtils.step(alpha, midpoint, t1.getAt(1), t2.v1()));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.getAt(0), t2.getAt(0)), MathUtils.step(alpha, midpoint, t1.getAt(1), t2.getAt(1)));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.getAt(0), t2[0]), MathUtils.step(alpha, midpoint, t1.getAt(1), t2[1]));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.getAt(0), t2v0), MathUtils.step(alpha, midpoint, t1.getAt(1), t2v1));
	}
	
	public static<T> T stepFunc(double alpha, double midpoint, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1[0], t2.v0()), MathUtils.step(alpha, midpoint, t1[1], t2.v1()));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1[0], t2.getAt(0)), MathUtils.step(alpha, midpoint, t1[1], t2.getAt(1)));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1[0], t2[0]), MathUtils.step(alpha, midpoint, t1[1], t2[1]));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1[0], t2v0), MathUtils.step(alpha, midpoint, t1[1], t2v1));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1v0, t2.v0()), MathUtils.step(alpha, midpoint, t1v1, t2.v1()));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1v0, t2.getAt(0)), MathUtils.step(alpha, midpoint, t1v1, t2.getAt(1)));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1v0, t2[0]), MathUtils.step(alpha, midpoint, t1v1, t2[1]));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1v0, t2v0), MathUtils.step(alpha, midpoint, t1v1, t2v1));
	}

	public static float[] smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.v0(), t2.v0());
		res[1] = MathUtils.smoothstep(alpha, t1.v1(), t2.v1());

		return res;
	}

	public static float[] smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.v0(), t2.getAt(0));
		res[1] = MathUtils.smoothstep(alpha, t1.v1(), t2.getAt(1));

		return res;
	}

	public static float[] smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.v0(), t2[0]);
		res[1] = MathUtils.smoothstep(alpha, t1.v1(), t2[1]);

		return res;
	}

	public static float[] smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.v0(), t2v0);
		res[1] = MathUtils.smoothstep(alpha, t1.v1(), t2v1);

		return res;
	}

	public static float[] smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.getAt(0), t2.v0());
		res[1] = MathUtils.smoothstep(alpha, t1.getAt(1), t2.v1());

		return res;
	}

	public static float[] smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.getAt(0), t2.getAt(0));
		res[1] = MathUtils.smoothstep(alpha, t1.getAt(1), t2.getAt(1));

		return res;
	}

	public static float[] smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.getAt(0), t2[0]);
		res[1] = MathUtils.smoothstep(alpha, t1.getAt(1), t2[1]);

		return res;
	}

	public static float[] smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.getAt(0), t2v0);
		res[1] = MathUtils.smoothstep(alpha, t1.getAt(1), t2v1);

		return res;
	}

	public static float[] smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1[0], t2.v0());
		res[1] = MathUtils.smoothstep(alpha, t1[1], t2.v1());

		return res;
	}

	public static float[] smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1[0], t2.getAt(0));
		res[1] = MathUtils.smoothstep(alpha, t1[1], t2.getAt(1));

		return res;
	}

	public static float[] smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1[0], t2[0]);
		res[1] = MathUtils.smoothstep(alpha, t1[1], t2[1]);

		return res;
	}

	public static float[] smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1[0], t2v0);
		res[1] = MathUtils.smoothstep(alpha, t1[1], t2v1);

		return res;
	}

	public static float[] smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1v0, t2.v0());
		res[1] = MathUtils.smoothstep(alpha, t1v1, t2.v1());

		return res;
	}

	public static float[] smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1v0, t2.getAt(0));
		res[1] = MathUtils.smoothstep(alpha, t1v1, t2.getAt(1));

		return res;
	}

	public static float[] smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1v0, t2[0]);
		res[1] = MathUtils.smoothstep(alpha, t1v1, t2[1]);

		return res;
	}

	public static float[] smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1v0, t2v0);
		res[1] = MathUtils.smoothstep(alpha, t1v1, t2v1);

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.v0(), t2.v0()), MathUtils.smoothstep(alpha, t1.v1(), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.smoothstep(alpha, t1.v1(), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.v0(), t2[0]), MathUtils.smoothstep(alpha, t1.v1(), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.v0(), t2v0), MathUtils.smoothstep(alpha, t1.v1(), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.getAt(0), t2.v0()), MathUtils.smoothstep(alpha, t1.getAt(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.smoothstep(alpha, t1.getAt(1), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.getAt(0), t2[0]), MathUtils.smoothstep(alpha, t1.getAt(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.getAt(0), t2v0), MathUtils.smoothstep(alpha, t1.getAt(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1[0], t2.v0()), MathUtils.smoothstep(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1[0], t2.getAt(0)), MathUtils.smoothstep(alpha, t1[1], t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1[0], t2[0]), MathUtils.smoothstep(alpha, t1[1], t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1[0], t2v0), MathUtils.smoothstep(alpha, t1[1], t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1v0, t2.v0()), MathUtils.smoothstep(alpha, t1v1, t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1v0, t2.getAt(0)), MathUtils.smoothstep(alpha, t1v1, t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1v0, t2[0]), MathUtils.smoothstep(alpha, t1v1, t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1v0, t2v0), MathUtils.smoothstep(alpha, t1v1, t2v1));

		return res;
	}
	
	public static <T> T smoothstepFunc(double alpha, ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.v0(), t2.v0()), MathUtils.smoothstep(alpha, t1.v1(), t2.v1()));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.smoothstep(alpha, t1.v1(), t2.getAt(1)));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.v0(), t2[0]), MathUtils.smoothstep(alpha, t1.v1(), t2[1]));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.v0(), t2v0), MathUtils.smoothstep(alpha, t1.v1(), t2v1));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.getAt(0), t2.v0()), MathUtils.smoothstep(alpha, t1.getAt(1), t2.v1()));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.smoothstep(alpha, t1.getAt(1), t2.getAt(1)));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.getAt(0), t2[0]), MathUtils.smoothstep(alpha, t1.getAt(1), t2[1]));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.getAt(0), t2v0), MathUtils.smoothstep(alpha, t1.getAt(1), t2v1));
	}
	
	public static <T> T smoothstepFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1[0], t2.v0()), MathUtils.smoothstep(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T smoothstepFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1[0], t2.getAt(0)), MathUtils.smoothstep(alpha, t1[1], t2.getAt(1)));
	}
	
	public static <T> T smoothstepFunc(double alpha, float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1[0], t2[0]), MathUtils.smoothstep(alpha, t1[1], t2[1]));
	}
	
	public static <T> T smoothstepFunc(double alpha, float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1[0], t2v0), MathUtils.smoothstep(alpha, t1[1], t2v1));
	}
	
	public static <T> T smoothstepFunc(double alpha, float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1v0, t2.v0()), MathUtils.smoothstep(alpha, t1v1, t2.v1()));
	}
	
	public static <T> T smoothstepFunc(double alpha, float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1v0, t2.getAt(0)), MathUtils.smoothstep(alpha, t1v1, t2.getAt(1)));
	}
	
	public static <T> T smoothstepFunc(double alpha, float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1v0, t2[0]), MathUtils.smoothstep(alpha, t1v1, t2[1]));
	}
	
	public static <T> T smoothstepFunc(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1v0, t2v0), MathUtils.smoothstep(alpha, t1v1, t2v1));
	}

	public static float[] smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.v0(), t2.v0());
		res[1] = MathUtils.smootherstep(alpha, t1.v1(), t2.v1());

		return res;
	}

	public static float[] smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.v0(), t2.getAt(0));
		res[1] = MathUtils.smootherstep(alpha, t1.v1(), t2.getAt(1));

		return res;
	}

	public static float[] smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.v0(), t2[0]);
		res[1] = MathUtils.smootherstep(alpha, t1.v1(), t2[1]);

		return res;
	}

	public static float[] smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.v0(), t2v0);
		res[1] = MathUtils.smootherstep(alpha, t1.v1(), t2v1);

		return res;
	}

	public static float[] smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.getAt(0), t2.v0());
		res[1] = MathUtils.smootherstep(alpha, t1.getAt(1), t2.v1());

		return res;
	}

	public static float[] smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.getAt(0), t2.getAt(0));
		res[1] = MathUtils.smootherstep(alpha, t1.getAt(1), t2.getAt(1));

		return res;
	}

	public static float[] smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.getAt(0), t2[0]);
		res[1] = MathUtils.smootherstep(alpha, t1.getAt(1), t2[1]);

		return res;
	}

	public static float[] smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.getAt(0), t2v0);
		res[1] = MathUtils.smootherstep(alpha, t1.getAt(1), t2v1);

		return res;
	}

	public static float[] smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1[0], t2.v0());
		res[1] = MathUtils.smootherstep(alpha, t1[1], t2.v1());

		return res;
	}

	public static float[] smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1[0], t2.getAt(0));
		res[1] = MathUtils.smootherstep(alpha, t1[1], t2.getAt(1));

		return res;
	}

	public static float[] smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1[0], t2[0]);
		res[1] = MathUtils.smootherstep(alpha, t1[1], t2[1]);

		return res;
	}

	public static float[] smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1[0], t2v0);
		res[1] = MathUtils.smootherstep(alpha, t1[1], t2v1);

		return res;
	}

	public static float[] smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1v0, t2.v0());
		res[1] = MathUtils.smootherstep(alpha, t1v1, t2.v1());

		return res;
	}

	public static float[] smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1v0, t2.getAt(0));
		res[1] = MathUtils.smootherstep(alpha, t1v1, t2.getAt(1));

		return res;
	}

	public static float[] smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1v0, t2[0]);
		res[1] = MathUtils.smootherstep(alpha, t1v1, t2[1]);

		return res;
	}

	public static float[] smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1v0, t2v0);
		res[1] = MathUtils.smootherstep(alpha, t1v1, t2v1);

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.v0(), t2.v0()), MathUtils.smootherstep(alpha, t1.v1(), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.smootherstep(alpha, t1.v1(), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.v0(), t2[0]), MathUtils.smootherstep(alpha, t1.v1(), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.v0(), t2v0), MathUtils.smootherstep(alpha, t1.v1(), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.getAt(0), t2.v0()), MathUtils.smootherstep(alpha, t1.getAt(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.smootherstep(alpha, t1.getAt(1), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.getAt(0), t2[0]), MathUtils.smootherstep(alpha, t1.getAt(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.getAt(0), t2v0), MathUtils.smootherstep(alpha, t1.getAt(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1[0], t2.v0()), MathUtils.smootherstep(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1[0], t2.getAt(0)), MathUtils.smootherstep(alpha, t1[1], t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1[0], t2[0]), MathUtils.smootherstep(alpha, t1[1], t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1[0], t2v0), MathUtils.smootherstep(alpha, t1[1], t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1v0, t2.v0()), MathUtils.smootherstep(alpha, t1v1, t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1v0, t2.getAt(0)), MathUtils.smootherstep(alpha, t1v1, t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1v0, t2[0]), MathUtils.smootherstep(alpha, t1v1, t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1v0, t2v0), MathUtils.smootherstep(alpha, t1v1, t2v1));

		return res;
	}
	
	public static <T> T smootherstepFunc(double alpha, ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.v0(), t2.v0()), MathUtils.smootherstep(alpha, t1.v1(), t2.v1()));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.smootherstep(alpha, t1.v1(), t2.getAt(1)));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.v0(), t2[0]), MathUtils.smootherstep(alpha, t1.v1(), t2[1]));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.v0(), t2v0), MathUtils.smootherstep(alpha, t1.v1(), t2v1));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.getAt(0), t2.v0()), MathUtils.smootherstep(alpha, t1.getAt(1), t2.v1()));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.smootherstep(alpha, t1.getAt(1), t2.getAt(1)));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.getAt(0), t2[0]), MathUtils.smootherstep(alpha, t1.getAt(1), t2[1]));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.getAt(0), t2v0), MathUtils.smootherstep(alpha, t1.getAt(1), t2v1));
	}
	
	public static <T> T smootherstepFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1[0], t2.v0()), MathUtils.smootherstep(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T smootherstepFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1[0], t2.getAt(0)), MathUtils.smootherstep(alpha, t1[1], t2.getAt(1)));
	}
	
	public static <T> T smootherstepFunc(double alpha, float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1[0], t2[0]), MathUtils.smootherstep(alpha, t1[1], t2[1]));
	}
	
	public static <T> T smootherstepFunc(double alpha, float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1[0], t2v0), MathUtils.smootherstep(alpha, t1[1], t2v1));
	}
	
	public static <T> T smootherstepFunc(double alpha, float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1v0, t2.v0()), MathUtils.smootherstep(alpha, t1v1, t2.v1()));
	}
	
	public static <T> T smootherstepFunc(double alpha, float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1v0, t2.getAt(0)), MathUtils.smootherstep(alpha, t1v1, t2.getAt(1)));
	}
	
	public static <T> T smootherstepFunc(double alpha, float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1v0, t2[0]), MathUtils.smootherstep(alpha, t1v1, t2[1]));
	}
	
	public static <T> T smootherstepFunc(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1v0, t2v0), MathUtils.smootherstep(alpha, t1v1, t2v1));
	}

	public static float[] intLerp(double alpha, ITup2RF t, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t.v0());
		res[1] = MathUtils.intLerp(alpha, t.v1());

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t.getAt(0));
		res[1] = MathUtils.intLerp(alpha, t.getAt(1));

		return res;
	}

	public static float[] intLerp(double alpha, float[] t, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t[0]);
		res[1] = MathUtils.intLerp(alpha, t[1]);

		return res;
	}

	public static float[] intLerp(double alpha, float tv0, float tv1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, tv0);
		res[1] = MathUtils.intLerp(alpha, tv1);

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITup2RF t, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t.v0()), MathUtils.intLerp(alpha, t.v1()));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t.getAt(0)), MathUtils.intLerp(alpha, t.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float[] t, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t[0]), MathUtils.intLerp(alpha, t[1]));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float tv0, float tv1, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, tv0), MathUtils.intLerp(alpha, tv1));

		return res;
	}
	
	public static <T> T intLerpFunc(double alpha, ITup2RF t, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t.v0()), MathUtils.intLerp(alpha, t.v1()));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t.getAt(0)), MathUtils.intLerp(alpha, t.getAt(1)));
	}
	
	public static <T> T intLerpFunc(double alpha, float[] t, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t[0]), MathUtils.intLerp(alpha, t[1]));
	}
	
	public static <T> T intLerpFunc(double alpha, float tv0, float tv1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, tv0), MathUtils.intLerp(alpha, tv1));
	}

	public static float[] intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.v0(), t2.v0());
		res[1] = MathUtils.intLerp(alpha, t1.v1(), t2.v1());

		return res;
	}

	public static float[] intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.v0(), t2.getAt(0));
		res[1] = MathUtils.intLerp(alpha, t1.v1(), t2.getAt(1));

		return res;
	}

	public static float[] intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.v0(), t2[0]);
		res[1] = MathUtils.intLerp(alpha, t1.v1(), t2[1]);

		return res;
	}

	public static float[] intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.v0(), t2v0);
		res[1] = MathUtils.intLerp(alpha, t1.v1(), t2v1);

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.getAt(0), t2.v0());
		res[1] = MathUtils.intLerp(alpha, t1.getAt(1), t2.v1());

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.getAt(0), t2.getAt(0));
		res[1] = MathUtils.intLerp(alpha, t1.getAt(1), t2.getAt(1));

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.getAt(0), t2[0]);
		res[1] = MathUtils.intLerp(alpha, t1.getAt(1), t2[1]);

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.getAt(0), t2v0);
		res[1] = MathUtils.intLerp(alpha, t1.getAt(1), t2v1);

		return res;
	}

	public static float[] intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1[0], t2.v0());
		res[1] = MathUtils.intLerp(alpha, t1[1], t2.v1());

		return res;
	}

	public static float[] intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1[0], t2.getAt(0));
		res[1] = MathUtils.intLerp(alpha, t1[1], t2.getAt(1));

		return res;
	}

	public static float[] intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1[0], t2[0]);
		res[1] = MathUtils.intLerp(alpha, t1[1], t2[1]);

		return res;
	}

	public static float[] intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1[0], t2v0);
		res[1] = MathUtils.intLerp(alpha, t1[1], t2v1);

		return res;
	}

	public static float[] intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1v0, t2.v0());
		res[1] = MathUtils.intLerp(alpha, t1v1, t2.v1());

		return res;
	}

	public static float[] intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1v0, t2.getAt(0));
		res[1] = MathUtils.intLerp(alpha, t1v1, t2.getAt(1));

		return res;
	}

	public static float[] intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1v0, t2[0]);
		res[1] = MathUtils.intLerp(alpha, t1v1, t2[1]);

		return res;
	}

	public static float[] intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1v0, t2v0);
		res[1] = MathUtils.intLerp(alpha, t1v1, t2v1);

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.v0(), t2.v0()), MathUtils.intLerp(alpha, t1.v1(), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.intLerp(alpha, t1.v1(), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.v0(), t2[0]), MathUtils.intLerp(alpha, t1.v1(), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.v0(), t2v0), MathUtils.intLerp(alpha, t1.v1(), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.getAt(0), t2.v0()), MathUtils.intLerp(alpha, t1.getAt(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.intLerp(alpha, t1.getAt(1), t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.getAt(0), t2[0]), MathUtils.intLerp(alpha, t1.getAt(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.getAt(0), t2v0), MathUtils.intLerp(alpha, t1.getAt(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1[0], t2.v0()), MathUtils.intLerp(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1[0], t2.getAt(0)), MathUtils.intLerp(alpha, t1[1], t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1[0], t2[0]), MathUtils.intLerp(alpha, t1[1], t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1[0], t2v0), MathUtils.intLerp(alpha, t1[1], t2v1));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1v0, t2.v0()), MathUtils.intLerp(alpha, t1v1, t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1v0, t2.getAt(0)), MathUtils.intLerp(alpha, t1v1, t2.getAt(1)));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1v0, t2[0]), MathUtils.intLerp(alpha, t1v1, t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1v0, t2v0), MathUtils.intLerp(alpha, t1v1, t2v1));

		return res;
	}
	
	public static <T> T intLerpFunc(double alpha, ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.v0(), t2.v0()), MathUtils.intLerp(alpha, t1.v1(), t2.v1()));
	}
	
	public static <T> T intLerpFunc(double alpha, ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.intLerp(alpha, t1.v1(), t2.getAt(1)));
	}
	
	public static <T> T intLerpFunc(double alpha, ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.v0(), t2[0]), MathUtils.intLerp(alpha, t1.v1(), t2[1]));
	}
	
	public static <T> T intLerpFunc(double alpha, ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.v0(), t2v0), MathUtils.intLerp(alpha, t1.v1(), t2v1));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.getAt(0), t2.v0()), MathUtils.intLerp(alpha, t1.getAt(1), t2.v1()));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.intLerp(alpha, t1.getAt(1), t2.getAt(1)));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.getAt(0), t2[0]), MathUtils.intLerp(alpha, t1.getAt(1), t2[1]));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.getAt(0), t2v0), MathUtils.intLerp(alpha, t1.getAt(1), t2v1));
	}
	
	public static <T> T intLerpFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1[0], t2.v0()), MathUtils.intLerp(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T intLerpFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1[0], t2.getAt(0)), MathUtils.intLerp(alpha, t1[1], t2.getAt(1)));
	}
	
	public static <T> T intLerpFunc(double alpha, float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1[0], t2[0]), MathUtils.intLerp(alpha, t1[1], t2[1]));
	}
	
	public static <T> T intLerpFunc(double alpha, float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1[0], t2v0), MathUtils.intLerp(alpha, t1[1], t2v1));
	}
	
	public static <T> T intLerpFunc(double alpha, float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1v0, t2.v0()), MathUtils.intLerp(alpha, t1v1, t2.v1()));
	}
	
	public static <T> T intLerpFunc(double alpha, float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1v0, t2.getAt(0)), MathUtils.intLerp(alpha, t1v1, t2.getAt(1)));
	}
	
	public static <T> T intLerpFunc(double alpha, float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1v0, t2[0]), MathUtils.intLerp(alpha, t1v1, t2[1]));
	}
	
	public static <T> T intLerpFunc(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1v0, t2v0), MathUtils.intLerp(alpha, t1v1, t2v1));
	}
	
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
	public static <T> T addFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() + t2.v0(), t1.v1() + t2.v1());
	}
	
	public static <T> T addFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() + t2.getAt(0), t1.v1() + t2.getAt(1));
	}
	
	public static <T> T addFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() + t2[0], t1.v1() + t2[1]);
	}
	
	public static <T> T addFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.v0() + t2v0, t1.v1() + t2v1);
	}
	
	public static <T> T addFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) + t2.v0(), t1.getAt(1) + t2.v1());
	}

	public static <T> T addFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) + t2.getAt(0), t1.getAt(1) + t2.getAt(1));
	}
	
	public static <T> T addFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) + t2[0], t1.getAt(1) + t2[1]);
	}
	
	public static <T> T addFunc(ITupRF t1, float t2v0, float t2v1,IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) + t2v0, t1.getAt(1) + t2v1);
	}
	
	public static <T> T addFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] + t2.v0(), t1[1] + t2.v1());
	}

	public static <T> T addFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] + t2.getAt(0), t1[1] + t2.getAt(1));
	}
	
	public static <T> T addFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] + t2[0], t1[1] + t2[1]);
	}
	
	public static <T> T addFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1[0] + t2v0, t1[1] + t2v1);
	}
	
	public static <T> T addFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 + t2.v0(), t1v1 + t2.v1());
	}

	public static <T> T addFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 + t2.getAt(0), t1v1 + t2.getAt(1));
	}
	
	public static <T> T addFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 + t2[0], t1v1 + t2[1]);
	}
	
	public static <T> T addFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 + t2v0, t1v1 + t2v1);
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
	
	public static <T> T subFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() - t2.v0(), t1.v1() - t2.v1());
	}
	
	public static <T> T subFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() - t2.getAt(0), t1.v1() - t2.getAt(1));
	}
	
	public static <T> T subFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() - t2[0], t1.v1() - t2[1]);
	}
	
	public static <T> T subFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.v0() - t2v0, t1.v1() - t2v1);
	}
	
	public static <T> T subFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) - t2.v0(), t1.getAt(1) - t2.v1());
	}
	
	public static <T> T subFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) - t2.getAt(0), t1.getAt(1) - t2.getAt(1));
	}
	
	public static <T> T subFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) - t2[0], t1.getAt(1) - t2[1]);
	}
	
	public static <T> T subFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) - t2v0, t1.getAt(1) - t2v1);
	}
	
	public static <T> T subFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] - t2.v0(), t1[1] - t2.v1());
	}
	
	public static <T> T subFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] - t2.getAt(0), t1[1] - t2.getAt(1));
	}
	
	public static <T> T subFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] - t2[0], t1[1] - t2[1]);
	}
	
	public static <T> T subFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1[0] - t2v0, t1[1] - t2v1);
	}
	
	public static <T> T subFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 - t2.v0(), t1v1 - t2.v1());
	}
	
	public static <T> T subFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 - t2.getAt(0), t1v1 - t2.getAt(1));
	}
	
	public static <T> T subFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 - t2[0], t1v1 - t2[1]);
	}
	
	public static <T> T subFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 - t2v0, t1v1 - t2v1);
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
	
	public static <T> T mulFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() * t2.v0(), t1.v1() * t2.v1());
	}
	
	public static <T> T mulFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() * t2.getAt(0), t1.v1() * t2.getAt(1));
	}
	
	public static <T> T mulFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() * t2[0], t1.v1() * t2[1]);
	}
	
	public static <T> T mulFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.v0() * t2v0, t1.v1() * t2v1);
	}
	
	public static <T> T mulFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) * t2.v0(), t1.getAt(1) * t2.v1());
	}
	
	public static <T> T mulFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) * t2.getAt(0), t1.getAt(1) * t2.getAt(1));
	}
	
	public static <T> T mulFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) * t2[0], t1.getAt(1) * t2[1]);
	}
	
	public static <T> T mulFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) * t2v0, t1.getAt(1) * t2v1);
	}
	
	public static <T> T mulFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] * t2.v0(), t1[1] * t2.v1());
	}
	
	public static <T> T mulFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] * t2.getAt(0), t1[1] * t2.getAt(1));
	}
	
	public static <T> T mulFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] * t2[0], t1[1] * t2[1]);
	}
	
	public static <T> T mulFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1[0] * t2v0, t1[1] * t2v1);
	}
	
	public static <T> T mulFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 * t2.v0(), t1v1 * t2.v1());
	}
	
	public static <T> T mulFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 * t2.getAt(0), t1v1 * t2.getAt(1));
	}
	
	public static <T> T mulFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 * t2[0], t1v1 * t2[1]);
	}
	
	public static <T> T mulFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 * t2v0, t1v1 * t2v1);
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
	
	public static <T> T divFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() / t2.v0(), t1.v1() / t2.v1());
	}
	
	public static <T> T divFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() / t2.getAt(0), t1.v1() / t2.getAt(1));
	}
	
	public static <T> T divFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() / t2[0], t1.v1() / t2[1]);
	}
	
	public static <T> T divFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.v0() / t2v0, t1.v1() / t2v1);
	}
	
	public static <T> T divFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) / t2.v0(), t1.getAt(1) / t2.v1());
	}
	
	public static <T> T divFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) / t2.getAt(0), t1.getAt(1) / t2.getAt(1));
	}
	
	public static <T> T divFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) / t2[0], t1.getAt(1) / t2[1]);
	}
	
	public static <T> T divFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.getAt(0) / t2v0, t1.getAt(1) / t2v1);
	}
	
	public static <T> T divFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] / t2.v0(), t1[1] / t2.v1());
	}
	
	public static <T> T divFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] / t2.getAt(0), t1[1] / t2.getAt(1));
	}
	
	public static <T> T divFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] / t2[0], t1[1] / t2[1]);
	}
	
	public static <T> T divFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1[0] / t2v0, t1[1] / t2v1);
	}
	
	public static <T> T divFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 / t2.v0(), t1v1 / t2.v1());
	}
	
	public static <T> T divFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 / t2.getAt(0), t1v1 / t2.getAt(1));
	}
	
	public static <T> T divFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 / t2[0], t1v1 / t2[1]);
	}
	
	public static <T> T divFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 / t2v0, t1v1 / t2v1);
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
	
	public static <T> T fmaFunc(ITup2RF t1, ITup2RF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITup2RF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITup2RF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITup2RF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3.v0()), MathUtils.fma(t1.v1(), t2.getAt(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.v1(), t2.getAt(1), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3[0]), MathUtils.fma(t1.v1(), t2.getAt(1), t3[1]));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.getAt(0), t3v0), MathUtils.fma(t1.v1(), t2.getAt(1), t3v1));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2[0], t3.v0()), MathUtils.fma(t1.v1(), t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2[0], t3.getAt(0)), MathUtils.fma(t1.v1(), t2[1], t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float[] t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2[0], t3[0]), MathUtils.fma(t1.v1(), t2[1], t3[1]));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float[] t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2[0], t3v0), MathUtils.fma(t1.v1(), t2[1], t3v1));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float t2v0, float t2v1, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2v0, t3.v0()), MathUtils.fma(t1.v1(), t2v1, t3.v1()));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float t2v0, float t2v1, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2v0, t3.getAt(0)), MathUtils.fma(t1.v1(), t2v1, t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float t2v0, float t2v1, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2v0, t3[0]), MathUtils.fma(t1.v1(), t2v1, t3[1]));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float t2v0, float t2v1, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2v0, t3v0), MathUtils.fma(t1.v1(), t2v1, t3v1));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITup2RF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.v0(), t3.v0()), MathUtils.fma(t1.getAt(1), t2.v1(), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITup2RF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.v0(), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.v1(), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITup2RF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.v0(), t3[0]), MathUtils.fma(t1.getAt(1), t2.v1(), t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITup2RF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.v0(), t3v0), MathUtils.fma(t1.getAt(1), t2.v1(), t3v1));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.v0()), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3[0]), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2.getAt(0), t3v0), MathUtils.fma(t1.getAt(1), t2.getAt(1), t3v1));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2[0], t3.v0()), MathUtils.fma(t1.getAt(1), t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2[0], t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2[1], t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2[0], t3[0]), MathUtils.fma(t1.getAt(1), t2[1], t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2[0], t3v0), MathUtils.fma(t1.getAt(1), t2[1], t3v1));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2v0, t3.v0()), MathUtils.fma(t1.getAt(1), t2v1, t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2v0, t3.getAt(0)), MathUtils.fma(t1.getAt(1), t2v1, t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2v0, t3[0]), MathUtils.fma(t1.getAt(1), t2v1, t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.getAt(0), t2v0, t3v0), MathUtils.fma(t1.getAt(1), t2v1, t3v1));
	}
	
	public static <T> T fmaFunc(float[] t1, ITup2RF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.v0(), t3.v0()), MathUtils.fma(t1[1], t2.v1(), t3.v1()));
	}
	
	public static <T> T fmaFunc(float[] t1, ITup2RF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.v0(), t3.getAt(0)), MathUtils.fma(t1[1], t2.v1(), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float[] t1, ITup2RF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.v0(), t3[0]), MathUtils.fma(t1[1], t2.v1(), t3[1]));
	}
	
	public static <T> T fmaFunc(float[] t1, ITup2RF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.v0(), t3v0), MathUtils.fma(t1[1], t2.v1(), t3v1));
	}
	
	public static <T> T fmaFunc(float[] t1, ITupRF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.getAt(0), t3.v0()), MathUtils.fma(t1[1], t2.getAt(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(float[] t1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1[1], t2.getAt(1), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float[] t1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.getAt(0), t3[0]), MathUtils.fma(t1[1], t2.getAt(1), t3[1]));
	}
	
	public static <T> T fmaFunc(float[] t1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.getAt(0), t3v0), MathUtils.fma(t1[1], t2.getAt(1), t3v1));
	}
	
	public static <T> T fmaFunc(float[] t1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2[0], t3.v0()), MathUtils.fma(t1[1], t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(float[] t1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2[0], t3.getAt(0)), MathUtils.fma(t1[1], t2[1], t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float[] t1, float[] t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2[0], t3[0]), MathUtils.fma(t1[1], t2[1], t3[1]));
	}
	
	public static <T> T fmaFunc(float[] t1, float[] t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2[0], t3v0), MathUtils.fma(t1[1], t2[1], t3v1));
	}
	
	public static <T> T fmaFunc(float[] t1, float t2v0, float t2v1, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2v0, t3.v0()), MathUtils.fma(t1[1], t2v1, t3.v1()));
	}
	
	public static <T> T fmaFunc(float[] t1, float t2v0, float t2v1, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2v0, t3.getAt(0)), MathUtils.fma(t1[1], t2v1, t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float[] t1, float t2v0, float t2v1, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2v0, t3[0]), MathUtils.fma(t1[1], t2v1, t3[1]));
	}
	
	public static <T> T fmaFunc(float[] t1, float t2v0, float t2v1, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2v0, t3v0), MathUtils.fma(t1[1], t2v1, t3v1));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITup2RF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.v0(), t3.v0()), MathUtils.fma(t1v1, t2.v1(), t3.v1()));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITup2RF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.v0(), t3.getAt(0)), MathUtils.fma(t1v1, t2.v1(), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITup2RF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.v0(), t3[0]), MathUtils.fma(t1v1, t2.v1(), t3[1]));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITup2RF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.v0(), t3v0), MathUtils.fma(t1v1, t2.v1(), t3v1));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITupRF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.getAt(0), t3.v0()), MathUtils.fma(t1v1, t2.getAt(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.getAt(0), t3.getAt(0)), MathUtils.fma(t1v1, t2.getAt(1), t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.getAt(0), t3[0]), MathUtils.fma(t1v1, t2.getAt(1), t3[1]));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.getAt(0), t3v0), MathUtils.fma(t1v1, t2.getAt(1), t3v1));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2[0], t3.v0()), MathUtils.fma(t1v1, t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2[0], t3.getAt(0)), MathUtils.fma(t1v1, t2[1], t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float[] t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2[0], t3[0]), MathUtils.fma(t1v1, t2[1], t3[1]));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float[] t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2[0], t3v0), MathUtils.fma(t1v1, t2[1], t3v1));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float t2v0, float t2v1, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2v0, t3.v0()), MathUtils.fma(t1v1, t2v1, t3.v1()));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float t2v0, float t2v1, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2v0, t3.getAt(0)), MathUtils.fma(t1v1, t2v1, t3.getAt(1)));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float t2v0, float t2v1, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2v0, t3[0]), MathUtils.fma(t1v1, t2v1, t3[1]));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float t2v0, float t2v1, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2v0, t3v0), MathUtils.fma(t1v1, t2v1, t3v1));
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
	public static <T> T truncFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply((int)v.v0(), (int)v.v1());
	}
	
	public static <T> T truncFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply((int)v.getAt(0), (int)v.getAt(1));
	}
	
	public static <T> T truncFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply((int)v[0], (int)v[1]);
	}
	
	public static <T> T truncFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply((int)v0, (int)v1);
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
	public static <T> T absFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v.v0()), MathUtils.abs(v.v1()));
	}
	
	public static <T> T absFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v.getAt(0)), MathUtils.abs(v.getAt(1)));
	}
	
	public static <T> T absFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v[0]), MathUtils.abs(v[1]));
	}
	
	public static <T> T absFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v0), MathUtils.abs(v1));
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
	public static <T> T signFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.sign(v.v0()), MathUtils.sign(v.v1()));
	}
	
	public static <T> T signFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.sign(v.getAt(0)), MathUtils.sign(v.getAt(1)));
	}
	
	public static <T> T signFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.sign(v[0]), MathUtils.sign(v[1]));
	}
	
	public static <T> T signFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.sign(v0), MathUtils.sign(v1));
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
	public static <T> T negFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(-v.v0(), -v.v1());
	}
	
	public static <T> T negFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(-v.getAt(0), -v.getAt(1));
	}
	
	public static <T> T negFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(-v[0], -v[1]);
	}
	
	public static <T> T negFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(-v0, -v1);
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
	public static <T> T recFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(1.0f / v.v0(), 1.0f / v.v1());
	}
	
	public static <T> T recFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(1.0f / v.getAt(0), 1.0f / v.getAt(1));
	}
	
	public static <T> T recFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(1.0f / v[0], 1.0f / v[1]);
	}
	
	public static <T> T recFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(1.0f / v0, 1.0f / v1);
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
	public static float lenRc(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRc(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRc(float[] v)
	{
		return MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float lenRc(float v0, float v1)
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
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float len(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float[] v)
	{
		float sqareLength = v[0] * v[0] + v[1] * v[1];
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float v0, float v1)
	{
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
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
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float tolerance, ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float len(float tolerance, float[] v)
	{
		float sqareLength = v[0] * v[0] + v[1] * v[1];
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float tolerance, float v0, float v1)
	{
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
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
	public static float lenSq(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSq(ITupRF v)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSq(float[] v)
	{
		return v[0] * v[0] + v[1] * v[1];
	}

	public static float lenSq(float v0, float v1)
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

		if (TupUtils2F.isZero(v0, v1))
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
		
		if (TupUtils2F.isZero(v0, v1))
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
		if (TupUtils2F.isZero(v))
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
		if (TupUtils2F.isZero(v0, v1))
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
		
		if (TupUtils2F.isZero(tolerance, v0, v1))
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
		
		if (TupUtils2F.isZero(tolerance, v0, v1))
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
		if (TupUtils2F.isZero(tolerance, v))
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
		if (TupUtils2F.isZero(tolerance, v0, v1))
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
		
		if (TupUtils2F.isZero(v0, v1))
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
		
		if (TupUtils2F.isZero(v0, v1))
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
		if (TupUtils2F.isZero(v))
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
		if (TupUtils2F.isZero(v0, v1))
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
		
		if (TupUtils2F.isZero(tolerance, v0, v1))
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
		
		if (TupUtils2F.isZero(tolerance, v0, v1))
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
		if (TupUtils2F.isZero(tolerance, v))
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
		if (TupUtils2F.isZero(tolerance, v0, v1))
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
	public static <T> T nrmFunc(ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (TupUtils2F.isZero(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFunc(ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.isZero(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFunc(float[] v, IFunc2F<T> func)
	{
		if (TupUtils2F.isZero(v))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return func.apply(v[0] * invLength, v[1] * invLength);
	}
	
	public static <T> T nrmFunc(float v0, float v1, IFunc2F<T> func)
	{
		if (TupUtils2F.isZero(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
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
	public static <T> T nrmFunc(float tolerance, ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (TupUtils2F.isZero(tolerance, v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFunc(float tolerance, ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		if (TupUtils2F.isZero(tolerance, v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFunc(float tolerance, float[] v, IFunc2F<T> func)
	{
		if (TupUtils2F.isZero(tolerance, v))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return func.apply(v[0] * invLength, v[1] * invLength);
	}
	
	public static <T> T nrmFunc(float tolerance, float v0, float v1, IFunc2F<T> func)
	{
		if (TupUtils2F.isZero(tolerance, v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
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
	public static <T> T rotRadFunc(double angle, ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return func.apply((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
	}
	
	public static <T> T rotRadFunc(double angle, ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return func.apply((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
	}
	
	public static <T> T rotRadFunc(double angle, float[] v, IFunc2F<T> func)
	{
		return func.apply((float)(v[0] * MathUtils.cos(angle) - v[1] * MathUtils.sin(angle)), (float)(v[0] * MathUtils.sin(angle) + v[1] * MathUtils.cos(angle)));
	}
	
	public static  <T> T rotRadFunc(double angle, float v0, float v1, IFunc2F<T> func)
	{
		return func.apply((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
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
	public static <T> T rotDegFunc(double angle, ITup2RF v, IFunc2F<T> func)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.v0();
		float v1 = v.v1();
		
		return func.apply((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
	}
	
	public static <T> T rotDegFunc(double angle, ITupRF v, IFunc2F<T> func)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		float v0 = v.getAt(0);
		float v1 = v.getAt(1);
		
		return func.apply((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
	}
	
	public static <T> T rotDegFunc(double angle, float[] v, IFunc2F<T> func)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		return func.apply((float)(v[0] * MathUtils.cos(radAngle) - v[1] * MathUtils.sin(radAngle)), (float)(v[0] * MathUtils.sin(radAngle) + v[1] * MathUtils.cos(radAngle)));
	}
	
	public static <T> T rotDegFunc(double angle, float v0, float v1, IFunc2F<T> func)
	{
		double radAngle = angle * MathUtils.DEG_TO_RAD;
		
		return func.apply((float)(v0 * MathUtils.cos(radAngle) - v1 * MathUtils.sin(radAngle)), (float)(v0 * MathUtils.sin(radAngle) + v1 * MathUtils.cos(radAngle)));
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
	public static <T> T projectFunc(ITup2RF v, ITup2RF t, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(ITup2RF v, ITupRF t, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(ITup2RF v, float[] t, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		return func.apply(t[0] * dot, t[1] * dot);
	}
	
	public static <T> T projectFunc(ITup2RF v, float tV0, float tV1, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(ITupRF v, ITup2RF t, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(ITupRF v, ITupRF t, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(ITupRF v, float[] t, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		return func.apply(t[0] * dot, t[1] * dot);
	}
	
	public static <T> T projectFunc(ITupRF v, float tV0, float tV1, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(float[] v, ITup2RF t, IFunc2F<T> func)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(float[] v, ITupRF t, IFunc2F<T> func)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = v[0] * tV0 + v[1] * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(float[] v, float[] t, IFunc2F<T> func)
	{
		float dot = v[0] * t[0] + v[1] * t[1];
		
		return func.apply(t[0] * dot, t[1] * dot);
	}
	
	public static <T> T projectFunc(float[] v, float tV0, float tV1, IFunc2F<T> func)
	{
		float dot = v[0] * tV0 + v[1] * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(float vV0, float vV1, ITup2RF t, IFunc2F<T> func)
	{
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(float vV0, float vV1, ITupRF t, IFunc2F<T> func)
	{
		float tV0 = t.getAt(0);
		float tV1 = t.getAt(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(float vV0, float vV1, float[] t, IFunc2F<T> func)
	{
		float dot = vV0 * t[0] + vV1 * t[1];
		
		return func.apply(t[0] * dot, t[1] * dot);
	}
	
	public static <T> T projectFunc(float vV0, float vV1, float tV0, float tV1, IFunc2F<T> func)
	{
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
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
	public static <T> T reflectFunc(ITup2RF v, ITup2RF n, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITup2RF v, ITupRF n, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITup2RF v, float[] n, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		return func.apply(n[0] * dot + vV0, n[1] * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITup2RF v, float nV0, float nV1, IFunc2F<T> func)
	{
		float vV0 = v.v0();
		float vV1 = v.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITupRF v, ITup2RF n, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITupRF v, ITupRF n, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITupRF v, float[] n, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		return func.apply(n[0] * dot + vV0, n[1] * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITupRF v, float nV0, float nV1, IFunc2F<T> func)
	{
		float vV0 = v.getAt(0);
		float vV1 = v.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(float[] v, ITup2RF n, IFunc2F<T> func)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		return func.apply(nV0 * dot + v[0], nV1 * dot + v[1]);
	}
	
	public static <T> T reflectFunc(float[] v, ITupRF n, IFunc2F<T> func)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		return func.apply(nV0 * dot + v[0], nV1 * dot + v[1]);
	}
	
	public static <T> T reflectFunc(float[] v, float[] n, IFunc2F<T> func)
	{
		float dot = -2 * (v[0] * n[0] + v[1] * n[1]);
		
		return func.apply(n[0] * dot + v[0], n[1] * dot + v[1]);
	}
	
	public static <T> T reflectFunc(float[] v, float nV0, float nV1, IFunc2F<T> func)
	{
		float dot = -2 * (v[0] * nV0 + v[1] * nV1);
		
		return func.apply(nV0 * dot + v[0], nV1 * dot + v[1]);
	}
	
	public static <T> T reflectFunc(float vV0, float vV1, ITup2RF n, IFunc2F<T> func)
	{
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(float vV0, float vV1, ITupRF n, IFunc2F<T> func)
	{
		float nV0 = n.getAt(0);
		float nV1 = n.getAt(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(float vV0, float vV1, float[] n, IFunc2F<T> func)
	{
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		return func.apply(n[0] * dot + vV0, n[1] * dot + vV1);
	}
	
	public static <T> T reflectFunc(float vV0, float vV1, float nV0, float nV1, IFunc2F<T> func)
	{
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
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
	public static <T> T halfVecToFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
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
	public static <T> T midPointToFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1.v0()) * 0.5f, (t2.getAt(1) - t1.v1()) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITup2RF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1.v0()) * 0.5f, (t2[1] - t1.v1()) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITup2RF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1.v0()) * 0.5f, (t2v1 - t1.v1()) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITupRF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1.getAt(0)) * 0.5f, (t2.v1() - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1.getAt(0)) * 0.5f, (t2.getAt(1) - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1.getAt(0)) * 0.5f, (t2[1] - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1.getAt(0)) * 0.5f, (t2v1 - t1.getAt(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1[0]) * 0.5f, (t2.getAt(1) - t1[1]) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float[] t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1[0]) * 0.5f, (t2[1] - t1[1]) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float[] t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1[0]) * 0.5f, (t2v1 - t1[1]) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float t1v0, float t1v1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1v0) * 0.5f, (t2.v1() - t1v1) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float t1v0, float t1v1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.getAt(0) - t1v0) * 0.5f, (t2.getAt(1) - t1v1) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
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
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
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
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float lenTo(float tolerance, ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float lenTo(float tolerance, ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	public static float lenTo(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float sqareLength = v0 * v0 + v1 * v1;
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
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
	public static float lenSqTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float t1v0, float t1v1, float t2v0, float t2v1)
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
	public static float lenRcTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.v0();
		float v1 = t2.getAt(1) - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRcTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRcTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.getAt(0);
		float v1 = t2.v1() - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1.getAt(0);
		float v1 = t2.getAt(1) - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRcTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.getAt(0);
		float v1 = t2[1] - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.getAt(0);
		float v1 = t2v1 - t1.getAt(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRcTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1[0];
		float v1 = t2.getAt(1) - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRcTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.getAt(0) - t1v0;
		float v1 = t2.getAt(1) - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRcTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
}
