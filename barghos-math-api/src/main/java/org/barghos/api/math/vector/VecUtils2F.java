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
import static org.barghos.api.core.tuple.floats.CompareOps2F.*;

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
		float value = t.at(0);
		int index = 0;

		float tv1 = t.at(1);

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
		float value = t.at(startIndexT);
		int index = startIndexT;

		float tv1 = t.at(startIndexT + 1);

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
		float value = t.at(indicesT[0]);
		int index = indicesT[0];

		float tv1 = t.at(indicesT[1]);

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
		float value = t.at(indexTV0);
		int index = indexTV0;

		float tv1 = t.at(indexTV1);

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
		float value = t.at(0);
		int index = 0;

		float tv1 = t.at(1);

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
		res[0] = Math.min(t1.v0(), t2.at(0));
		res[1] = Math.min(t1.v1(), t2.at(1));

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
		res[0] = Math.min(t1.at(0), t2.v0());
		res[1] = Math.min(t1.at(1), t2.v1());

		return res;
	}

	public static float[] minComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.at(0), t2.at(0));
		res[1] = Math.min(t1.at(1), t2.at(1));

		return res;
	}

	public static float[] minComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.at(0), t2[0]);
		res[1] = Math.min(t1.at(1), t2[1]);

		return res;
	}

	public static float[] minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.at(0), t2v0);
		res[1] = Math.min(t1.at(1), t2v1);

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
		res[0] = Math.min(t1[0], t2.at(0));
		res[1] = Math.min(t1[1], t2.at(1));

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
		res[0] = Math.min(t1v0, t2.at(0));
		res[1] = Math.min(t1v1, t2.at(1));

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
		res.set(Math.min(t1.v0(), t2.at(0)), Math.min(t1.v1(), t2.at(1)));

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
		res.set(Math.min(t1.at(0), t2.v0()), Math.min(t1.at(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.at(0), t2.at(0)), Math.min(t1.at(1), t2.at(1)));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.at(0), t2[0]), Math.min(t1.at(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1.at(0), t2v0), Math.min(t1.at(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2.v0()), Math.min(t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T minComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2.at(0)), Math.min(t1[1], t2.at(1)));

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
		res.set(Math.min(t1v0, t2.at(0)), Math.min(t1v1, t2.at(1)));

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
		return func.apply(Math.min(t1.v0(), t2.at(0)), Math.min(t1.v1(), t2.at(1)));
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
		return func.apply(Math.min(t1.at(0), t2.v0()), Math.min(t1.at(1), t2.v1()));
	}

	public static <T> T minComponentsFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.at(0), t2.at(0)), Math.min(t1.at(1), t2.at(1)));
	}

	public static <T> T minComponentsFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.at(0), t2[0]), Math.min(t1.at(1), t2[1]));
	}

	public static <T> T minComponentsFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1.at(0), t2v0), Math.min(t1.at(1), t2v1));
	}

	public static <T> T minComponentsFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1[0], t2.v0()), Math.min(t1[1], t2.v1()));
	}

	public static <T> T minComponentsFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.min(t1[0], t2.at(0)), Math.min(t1[1], t2.at(1)));
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
		return func.apply(Math.min(t1v0, t2.at(0)), Math.min(t1v1, t2.at(1)));
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
		res[0] = Math.max(t1.v0(), t2.at(0));
		res[1] = Math.max(t1.v1(), t2.at(1));

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
		res[0] = Math.max(t1.at(0), t2.v0());
		res[1] = Math.max(t1.at(1), t2.v1());

		return res;
	}

	public static float[] maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.at(0), t2.at(0));
		res[1] = Math.max(t1.at(1), t2.at(1));

		return res;
	}

	public static float[] maxComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.at(0), t2[0]);
		res[1] = Math.max(t1.at(1), t2[1]);

		return res;
	}

	public static float[] maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.at(0), t2v0);
		res[1] = Math.max(t1.at(1), t2v1);

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
		res[0] = Math.max(t1[0], t2.at(0));
		res[1] = Math.max(t1[1], t2.at(1));

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
		res[0] = Math.max(t1v0, t2.at(0));
		res[1] = Math.max(t1v1, t2.at(1));

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
		res.set(Math.max(t1.v0(), t2.at(0)), Math.max(t1.v1(), t2.at(1)));

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
		res.set(Math.max(t1.at(0), t2.v0()), Math.max(t1.at(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.at(0), t2.at(0)), Math.max(t1.at(1), t2.at(1)));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.at(0), t2[0]), Math.max(t1.at(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1.at(0), t2v0), Math.max(t1.at(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2.v0()), Math.max(t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T maxComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2.at(0)), Math.max(t1[1], t2.at(1)));

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
		res.set(Math.max(t1v0, t2.at(0)), Math.max(t1v1, t2.at(1)));

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
		return func.apply(Math.max(t1.v0(), t2.at(0)), Math.max(t1.v1(), t2.at(1)));
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
		return func.apply(Math.max(t1.at(0), t2.v0()), Math.max(t1.at(1), t2.v1()));
	}

	public static <T> T maxComponentsFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.at(0), t2.at(0)), Math.max(t1.at(1), t2.at(1)));
	}

	public static <T> T maxComponentsFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.at(0), t2[0]), Math.max(t1.at(1), t2[1]));
	}

	public static <T> T maxComponentsFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1.at(0), t2v0), Math.max(t1.at(1), t2v1));
	}

	public static <T> T maxComponentsFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1[0], t2.v0()), Math.max(t1[1], t2.v1()));
	}

	public static <T> T maxComponentsFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(Math.max(t1[0], t2.at(0)), Math.max(t1[1], t2.at(1)));
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
		return func.apply(Math.max(t1v0, t2.at(0)), Math.max(t1v1, t2.at(1)));
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		float tv0 = t.at(0);
		float tv1 = t.at(1);
		
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
		res.set(t.at(0), t.at(1));

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
		return func.apply(t.at(0), t.at(1));
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
		res[0] = MathUtils.lerp(alpha, t1.v0(), t2.at(0));
		res[1] = MathUtils.lerp(alpha, t1.v1(), t2.at(1));

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
		res[0] = MathUtils.lerp(alpha, t1.at(0), t2.v0());
		res[1] = MathUtils.lerp(alpha, t1.at(1), t2.v1());

		return res;
	}

	public static float[] lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.at(0), t2.at(0));
		res[1] = MathUtils.lerp(alpha, t1.at(1), t2.at(1));

		return res;
	}

	public static float[] lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.at(0), t2[0]);
		res[1] = MathUtils.lerp(alpha, t1.at(1), t2[1]);

		return res;
	}

	public static float[] lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1.at(0), t2v0);
		res[1] = MathUtils.lerp(alpha, t1.at(1), t2v1);

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
		res[0] = MathUtils.lerp(alpha, t1[0], t2.at(0));
		res[1] = MathUtils.lerp(alpha, t1[1], t2.at(1));

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
		res[0] = MathUtils.lerp(alpha, t1v0, t2.at(0));
		res[1] = MathUtils.lerp(alpha, t1v1, t2.at(1));

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
		res.set(MathUtils.lerp(alpha, t1.v0(), t2.at(0)), MathUtils.lerp(alpha, t1.v1(), t2.at(1)));

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
		res.set(MathUtils.lerp(alpha, t1.at(0), t2.v0()), MathUtils.lerp(alpha, t1.at(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.at(0), t2.at(0)), MathUtils.lerp(alpha, t1.at(1), t2.at(1)));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.at(0), t2[0]), MathUtils.lerp(alpha, t1.at(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1.at(0), t2v0), MathUtils.lerp(alpha, t1.at(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1[0], t2.v0()), MathUtils.lerp(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.lerp(alpha, t1[0], t2.at(0)), MathUtils.lerp(alpha, t1[1], t2.at(1)));

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
		res.set(MathUtils.lerp(alpha, t1v0, t2.at(0)), MathUtils.lerp(alpha, t1v1, t2.at(1)));

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
		return func.apply(MathUtils.lerp(alpha, t1.v0(), t2.at(0)), MathUtils.lerp(alpha, t1.v1(), t2.at(1)));
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
		return func.apply(MathUtils.lerp(alpha, t1.at(0), t2.v0()), MathUtils.lerp(alpha, t1.at(1), t2.v1()));
	}
	
	public static <T> T lerpFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.at(0), t2.at(0)), MathUtils.lerp(alpha, t1.at(1), t2.at(1)));
	}
	
	public static <T> T lerpFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.at(0), t2[0]), MathUtils.lerp(alpha, t1.at(1), t2[1]));
	}
	
	public static <T> T lerpFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1.at(0), t2v0), MathUtils.lerp(alpha, t1.at(1), t2v1));
	}
	
	public static <T> T lerpFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1[0], t2.v0()), MathUtils.lerp(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T lerpFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.lerp(alpha, t1[0], t2.at(0)), MathUtils.lerp(alpha, t1[1], t2.at(1)));
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
		return func.apply(MathUtils.lerp(alpha, t1v0, t2.at(0)), MathUtils.lerp(alpha, t1v1, t2.at(1)));
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
		res[0] = MathUtils.step(alpha, midpoint, t1.v0(), t2.at(0));
		res[1] = MathUtils.step(alpha, midpoint, t1.v1(), t2.at(1));

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
		res[0] = MathUtils.step(alpha, midpoint, t1.at(0), t2.v0());
		res[1] = MathUtils.step(alpha, midpoint, t1.at(1), t2.v1());

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.at(0), t2.at(0));
		res[1] = MathUtils.step(alpha, midpoint, t1.at(1), t2.at(1));

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.at(0), t2[0]);
		res[1] = MathUtils.step(alpha, midpoint, t1.at(1), t2[1]);

		return res;
	}

	public static float[] step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1.at(0), t2v0);
		res[1] = MathUtils.step(alpha, midpoint, t1.at(1), t2v1);

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
		res[0] = MathUtils.step(alpha, midpoint, t1[0], t2.at(0));
		res[1] = MathUtils.step(alpha, midpoint, t1[1], t2.at(1));

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
		res[0] = MathUtils.step(alpha, midpoint, t1v0, t2.at(0));
		res[1] = MathUtils.step(alpha, midpoint, t1v1, t2.at(1));

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
		res.set(MathUtils.step(alpha, midpoint, t1.v0(), t2.at(0)), MathUtils.step(alpha, midpoint, t1.v1(), t2.at(1)));

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
		res.set(MathUtils.step(alpha, midpoint, t1.at(0), t2.v0()), MathUtils.step(alpha, midpoint, t1.at(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.at(0), t2.at(0)), MathUtils.step(alpha, midpoint, t1.at(1), t2.at(1)));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.at(0), t2[0]), MathUtils.step(alpha, midpoint, t1.at(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1.at(0), t2v0), MathUtils.step(alpha, midpoint, t1.at(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1[0], t2.v0()), MathUtils.step(alpha, midpoint, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.step(alpha, midpoint, t1[0], t2.at(0)), MathUtils.step(alpha, midpoint, t1[1], t2.at(1)));

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
		res.set(MathUtils.step(alpha, midpoint, t1v0, t2.at(0)), MathUtils.step(alpha, midpoint, t1v1, t2.at(1)));

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
		return func.apply(MathUtils.step(alpha, midpoint, t1.v0(), t2.at(0)), MathUtils.step(alpha, midpoint, t1.v1(), t2.at(1)));
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
		return func.apply(MathUtils.step(alpha, midpoint, t1.at(0), t2.v0()), MathUtils.step(alpha, midpoint, t1.at(1), t2.v1()));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.at(0), t2.at(0)), MathUtils.step(alpha, midpoint, t1.at(1), t2.at(1)));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.at(0), t2[0]), MathUtils.step(alpha, midpoint, t1.at(1), t2[1]));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1.at(0), t2v0), MathUtils.step(alpha, midpoint, t1.at(1), t2v1));
	}
	
	public static<T> T stepFunc(double alpha, double midpoint, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1[0], t2.v0()), MathUtils.step(alpha, midpoint, t1[1], t2.v1()));
	}
	
	public static <T> T stepFunc(double alpha, double midpoint, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.step(alpha, midpoint, t1[0], t2.at(0)), MathUtils.step(alpha, midpoint, t1[1], t2.at(1)));
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
		return func.apply(MathUtils.step(alpha, midpoint, t1v0, t2.at(0)), MathUtils.step(alpha, midpoint, t1v1, t2.at(1)));
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
		res[0] = MathUtils.smoothstep(alpha, t1.v0(), t2.at(0));
		res[1] = MathUtils.smoothstep(alpha, t1.v1(), t2.at(1));

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
		res[0] = MathUtils.smoothstep(alpha, t1.at(0), t2.v0());
		res[1] = MathUtils.smoothstep(alpha, t1.at(1), t2.v1());

		return res;
	}

	public static float[] smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.at(0), t2.at(0));
		res[1] = MathUtils.smoothstep(alpha, t1.at(1), t2.at(1));

		return res;
	}

	public static float[] smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.at(0), t2[0]);
		res[1] = MathUtils.smoothstep(alpha, t1.at(1), t2[1]);

		return res;
	}

	public static float[] smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1.at(0), t2v0);
		res[1] = MathUtils.smoothstep(alpha, t1.at(1), t2v1);

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
		res[0] = MathUtils.smoothstep(alpha, t1[0], t2.at(0));
		res[1] = MathUtils.smoothstep(alpha, t1[1], t2.at(1));

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
		res[0] = MathUtils.smoothstep(alpha, t1v0, t2.at(0));
		res[1] = MathUtils.smoothstep(alpha, t1v1, t2.at(1));

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
		res.set(MathUtils.smoothstep(alpha, t1.v0(), t2.at(0)), MathUtils.smoothstep(alpha, t1.v1(), t2.at(1)));

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
		res.set(MathUtils.smoothstep(alpha, t1.at(0), t2.v0()), MathUtils.smoothstep(alpha, t1.at(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.at(0), t2.at(0)), MathUtils.smoothstep(alpha, t1.at(1), t2.at(1)));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.at(0), t2[0]), MathUtils.smoothstep(alpha, t1.at(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1.at(0), t2v0), MathUtils.smoothstep(alpha, t1.at(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1[0], t2.v0()), MathUtils.smoothstep(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smoothstep(alpha, t1[0], t2.at(0)), MathUtils.smoothstep(alpha, t1[1], t2.at(1)));

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
		res.set(MathUtils.smoothstep(alpha, t1v0, t2.at(0)), MathUtils.smoothstep(alpha, t1v1, t2.at(1)));

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
		return func.apply(MathUtils.smoothstep(alpha, t1.v0(), t2.at(0)), MathUtils.smoothstep(alpha, t1.v1(), t2.at(1)));
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
		return func.apply(MathUtils.smoothstep(alpha, t1.at(0), t2.v0()), MathUtils.smoothstep(alpha, t1.at(1), t2.v1()));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.at(0), t2.at(0)), MathUtils.smoothstep(alpha, t1.at(1), t2.at(1)));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.at(0), t2[0]), MathUtils.smoothstep(alpha, t1.at(1), t2[1]));
	}
	
	public static <T> T smoothstepFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1.at(0), t2v0), MathUtils.smoothstep(alpha, t1.at(1), t2v1));
	}
	
	public static <T> T smoothstepFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1[0], t2.v0()), MathUtils.smoothstep(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T smoothstepFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smoothstep(alpha, t1[0], t2.at(0)), MathUtils.smoothstep(alpha, t1[1], t2.at(1)));
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
		return func.apply(MathUtils.smoothstep(alpha, t1v0, t2.at(0)), MathUtils.smoothstep(alpha, t1v1, t2.at(1)));
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
		res[0] = MathUtils.smootherstep(alpha, t1.v0(), t2.at(0));
		res[1] = MathUtils.smootherstep(alpha, t1.v1(), t2.at(1));

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
		res[0] = MathUtils.smootherstep(alpha, t1.at(0), t2.v0());
		res[1] = MathUtils.smootherstep(alpha, t1.at(1), t2.v1());

		return res;
	}

	public static float[] smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.at(0), t2.at(0));
		res[1] = MathUtils.smootherstep(alpha, t1.at(1), t2.at(1));

		return res;
	}

	public static float[] smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.at(0), t2[0]);
		res[1] = MathUtils.smootherstep(alpha, t1.at(1), t2[1]);

		return res;
	}

	public static float[] smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1.at(0), t2v0);
		res[1] = MathUtils.smootherstep(alpha, t1.at(1), t2v1);

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
		res[0] = MathUtils.smootherstep(alpha, t1[0], t2.at(0));
		res[1] = MathUtils.smootherstep(alpha, t1[1], t2.at(1));

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
		res[0] = MathUtils.smootherstep(alpha, t1v0, t2.at(0));
		res[1] = MathUtils.smootherstep(alpha, t1v1, t2.at(1));

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
		res.set(MathUtils.smootherstep(alpha, t1.v0(), t2.at(0)), MathUtils.smootherstep(alpha, t1.v1(), t2.at(1)));

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
		res.set(MathUtils.smootherstep(alpha, t1.at(0), t2.v0()), MathUtils.smootherstep(alpha, t1.at(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.at(0), t2.at(0)), MathUtils.smootherstep(alpha, t1.at(1), t2.at(1)));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.at(0), t2[0]), MathUtils.smootherstep(alpha, t1.at(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1.at(0), t2v0), MathUtils.smootherstep(alpha, t1.at(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1[0], t2.v0()), MathUtils.smootherstep(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.smootherstep(alpha, t1[0], t2.at(0)), MathUtils.smootherstep(alpha, t1[1], t2.at(1)));

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
		res.set(MathUtils.smootherstep(alpha, t1v0, t2.at(0)), MathUtils.smootherstep(alpha, t1v1, t2.at(1)));

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
		return func.apply(MathUtils.smootherstep(alpha, t1.v0(), t2.at(0)), MathUtils.smootherstep(alpha, t1.v1(), t2.at(1)));
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
		return func.apply(MathUtils.smootherstep(alpha, t1.at(0), t2.v0()), MathUtils.smootherstep(alpha, t1.at(1), t2.v1()));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.at(0), t2.at(0)), MathUtils.smootherstep(alpha, t1.at(1), t2.at(1)));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.at(0), t2[0]), MathUtils.smootherstep(alpha, t1.at(1), t2[1]));
	}
	
	public static <T> T smootherstepFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1.at(0), t2v0), MathUtils.smootherstep(alpha, t1.at(1), t2v1));
	}
	
	public static <T> T smootherstepFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1[0], t2.v0()), MathUtils.smootherstep(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T smootherstepFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.smootherstep(alpha, t1[0], t2.at(0)), MathUtils.smootherstep(alpha, t1[1], t2.at(1)));
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
		return func.apply(MathUtils.smootherstep(alpha, t1v0, t2.at(0)), MathUtils.smootherstep(alpha, t1v1, t2.at(1)));
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
		res[0] = MathUtils.intLerp(alpha, t.at(0));
		res[1] = MathUtils.intLerp(alpha, t.at(1));

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
		res.set(MathUtils.intLerp(alpha, t.at(0)), MathUtils.intLerp(alpha, t.at(1)));

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
		return func.apply(MathUtils.intLerp(alpha, t.at(0)), MathUtils.intLerp(alpha, t.at(1)));
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
		res[0] = MathUtils.intLerp(alpha, t1.v0(), t2.at(0));
		res[1] = MathUtils.intLerp(alpha, t1.v1(), t2.at(1));

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
		res[0] = MathUtils.intLerp(alpha, t1.at(0), t2.v0());
		res[1] = MathUtils.intLerp(alpha, t1.at(1), t2.v1());

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.at(0), t2.at(0));
		res[1] = MathUtils.intLerp(alpha, t1.at(1), t2.at(1));

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.at(0), t2[0]);
		res[1] = MathUtils.intLerp(alpha, t1.at(1), t2[1]);

		return res;
	}

	public static float[] intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1.at(0), t2v0);
		res[1] = MathUtils.intLerp(alpha, t1.at(1), t2v1);

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
		res[0] = MathUtils.intLerp(alpha, t1[0], t2.at(0));
		res[1] = MathUtils.intLerp(alpha, t1[1], t2.at(1));

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
		res[0] = MathUtils.intLerp(alpha, t1v0, t2.at(0));
		res[1] = MathUtils.intLerp(alpha, t1v1, t2.at(1));

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
		res.set(MathUtils.intLerp(alpha, t1.v0(), t2.at(0)), MathUtils.intLerp(alpha, t1.v1(), t2.at(1)));

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
		res.set(MathUtils.intLerp(alpha, t1.at(0), t2.v0()), MathUtils.intLerp(alpha, t1.at(1), t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.at(0), t2.at(0)), MathUtils.intLerp(alpha, t1.at(1), t2.at(1)));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.at(0), t2[0]), MathUtils.intLerp(alpha, t1.at(1), t2[1]));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1.at(0), t2v0), MathUtils.intLerp(alpha, t1.at(1), t2v1));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1[0], t2.v0()), MathUtils.intLerp(alpha, t1[1], t2.v1()));

		return res;
	}

	public static <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(MathUtils.intLerp(alpha, t1[0], t2.at(0)), MathUtils.intLerp(alpha, t1[1], t2.at(1)));

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
		res.set(MathUtils.intLerp(alpha, t1v0, t2.at(0)), MathUtils.intLerp(alpha, t1v1, t2.at(1)));

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
		return func.apply(MathUtils.intLerp(alpha, t1.v0(), t2.at(0)), MathUtils.intLerp(alpha, t1.v1(), t2.at(1)));
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
		return func.apply(MathUtils.intLerp(alpha, t1.at(0), t2.v0()), MathUtils.intLerp(alpha, t1.at(1), t2.v1()));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.at(0), t2.at(0)), MathUtils.intLerp(alpha, t1.at(1), t2.at(1)));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.at(0), t2[0]), MathUtils.intLerp(alpha, t1.at(1), t2[1]));
	}
	
	public static <T> T intLerpFunc(double alpha, ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1.at(0), t2v0), MathUtils.intLerp(alpha, t1.at(1), t2v1));
	}
	
	public static <T> T intLerpFunc(double alpha, float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1[0], t2.v0()), MathUtils.intLerp(alpha, t1[1], t2.v1()));
	}
	
	public static <T> T intLerpFunc(double alpha, float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1[0], t2.at(0)), MathUtils.intLerp(alpha, t1[1], t2.at(1)));
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
		return func.apply(MathUtils.intLerp(alpha, t1v0, t2.at(0)), MathUtils.intLerp(alpha, t1v1, t2.at(1)));
	}
	
	public static <T> T intLerpFunc(double alpha, float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1v0, t2[0]), MathUtils.intLerp(alpha, t1v1, t2[1]));
	}
	
	public static <T> T intLerpFunc(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.intLerp(alpha, t1v0, t2v0), MathUtils.intLerp(alpha, t1v1, t2v1));
	}

	public static float[] add(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.v0();
		res[1] = t1.v1() + t2.v1();
		
		return res;
	}
	
	public static float[] add(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() + t2.at(0);
		res[1] = t1.v1() + t2.at(1);
		
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
		res[0] = t1.at(0) + t2.v0();
		res[1] = t1.at(1) + t2.v1();
		
		return res;
	}
	
	public static float[] add(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) + t2.at(0);
		res[1] = t1.at(1) + t2.at(1);
		
		return res;
	}

	public static float[] add(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) + t2[0];
		res[1] = t1.at(1) + t2[1];
		
		return res;
	}

	public static float[] add(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) + t2v0;
		res[1] = t1.at(1) + t2v1;
		
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
		res[0] = t1[0] + t2.at(0);
		res[1] = t1[1] + t2.at(1);
		
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
		res[0] = t1v0 + t2.at(0);
		res[1] = t1v1 + t2.at(1);
		
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

	public static <T extends ITup2WF> T add(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.v0(), t1.v1() + t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.v0() + t2.at(0), t1.v1() + t2.at(1));
		
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
		res.set(t1.at(0) + t2.v0(), t1.at(1) + t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) + t2.at(0), t1.at(1) + t2.at(1));
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) + t2[0], t1.at(1) + t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T add(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.at(0) + t2v0, t1.at(1) + t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T add(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.v0(), t1[1] + t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T add(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] + t2.at(0), t1[1] + t2.at(1));
		
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
		res.set(t1v0 + t2.at(0), t1v1 + t2.at(1));
		
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

	public static <T> T addFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() + t2.v0(), t1.v1() + t2.v1());
	}
	
	public static <T> T addFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.v0() + t2.at(0), t1.v1() + t2.at(1));
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
		return func.apply(t1.at(0) + t2.v0(), t1.at(1) + t2.v1());
	}

	public static <T> T addFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) + t2.at(0), t1.at(1) + t2.at(1));
	}
	
	public static <T> T addFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) + t2[0], t1.at(1) + t2[1]);
	}
	
	public static <T> T addFunc(ITupRF t1, float t2v0, float t2v1,IFunc2F<T> func)
	{
		return func.apply(t1.at(0) + t2v0, t1.at(1) + t2v1);
	}
	
	public static <T> T addFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] + t2.v0(), t1[1] + t2.v1());
	}

	public static <T> T addFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] + t2.at(0), t1[1] + t2.at(1));
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
		return func.apply(t1v0 + t2.at(0), t1v1 + t2.at(1));
	}
	
	public static <T> T addFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 + t2[0], t1v1 + t2[1]);
	}
	
	public static <T> T addFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 + t2v0, t1v1 + t2v1);
	}

	public static float[] sub(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2.v0();
		res[1] = t1.v1() - t2.v1();
		
		return res;
	}

	public static float[] sub(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() - t2.at(0);
		res[1] = t1.v1() - t2.at(1);
		
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
		res[0] = t1.at(0) - t2.v0();
		res[1] = t1.at(1) - t2.v1();
		
		return res;
	}

	public static float[] sub(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) - t2.at(0);
		res[1] = t1.at(1) - t2.at(1);
		
		return res;
	}
	
	public static float[] sub(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) - t2[0];
		res[1] = t1.at(1) - t2[1];
		
		return res;
	}

	public static float[] sub(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) - t2v0;
		res[1] = t1.at(1) - t2v1;
		
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
		res[0] = t1[0] - t2.at(0);
		res[1] = t1[1] - t2.at(1);
		
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
		res[0] = t1v0 - t2.at(0);
		res[1] = t1v1 - t2.at(1);
		
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
		res.set(t1.v0() - t2.at(0), t1.v1() - t2.at(1));
		
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
		res.set(t1.at(0) - t2.v0(), t1.at(1) - t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T sub(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) - t2.at(0), t1.at(1) - t2.at(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T sub(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) - t2[0], t1.at(1) - t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T sub(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.at(0) - t2v0, t1.at(1) - t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T sub(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2.v0(), t1[1] - t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T sub(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] - t2.at(0), t1[1] - t2.at(1));
		
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
		res.set(t1v0 - t2.at(0), t1v1 - t2.at(1));
		
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
		return func.apply(t1.v0() - t2.at(0), t1.v1() - t2.at(1));
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
		return func.apply(t1.at(0) - t2.v0(), t1.at(1) - t2.v1());
	}
	
	public static <T> T subFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) - t2.at(0), t1.at(1) - t2.at(1));
	}
	
	public static <T> T subFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) - t2[0], t1.at(1) - t2[1]);
	}
	
	public static <T> T subFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) - t2v0, t1.at(1) - t2v1);
	}
	
	public static <T> T subFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] - t2.v0(), t1[1] - t2.v1());
	}
	
	public static <T> T subFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] - t2.at(0), t1[1] - t2.at(1));
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
		return func.apply(t1v0 - t2.at(0), t1v1 - t2.at(1));
	}
	
	public static <T> T subFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 - t2[0], t1v1 - t2[1]);
	}
	
	public static <T> T subFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 - t2v0, t1v1 - t2v1);
	}

	public static float[] mul(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2.v0();
		res[1] = t1.v1() * t2.v1();
		
		return res;
	}

	public static float[] mul(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() * t2.at(0);
		res[1] = t1.v1() * t2.at(1);
		
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
		res[0] = t1.at(0) * t2.v0();
		res[1] = t1.at(1) * t2.v1();
		
		return res;
	}

	public static float[] mul(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) * t2.at(0);
		res[1] = t1.at(1)  * t2.at(1);
		
		return res;
	}
	
	public static float[] mul(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) * t2[0];
		res[1] = t1.at(1) * t2[1];
		
		return res;
	}

	public static float[] mul(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) * t2v0;
		res[1] = t1.at(1) * t2v1;
		
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
		res[0] = t1[0] * t2.at(0);
		res[1] = t1[1] * t2.at(1);
		
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
		res[0] = t1v0 * t2.at(0);
		res[1] = t1v1 * t2.at(1);
		
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
		res.set(t1.v0() * t2.at(0), t1.v1() * t2.at(1));
		
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
		res.set(t1.at(0) * t2.v0(), t1.at(1) * t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T mul(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) * t2.at(0), t1.at(1) * t2.at(1));
		
		return res;
	}	
	
	public static <T extends ITup2WF> T mul(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) * t2[0], t1.at(1) * t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T mul(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.at(0) * t2v0, t1.at(1) * t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T mul(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2.v0(), t1[1] * t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T mul(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] * t2.at(0), t1[1] * t2.at(1));
		
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
		res.set(t1v0 * t2.at(0), t1v1 * t2.at(1));
		
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
		return func.apply(t1.v0() * t2.at(0), t1.v1() * t2.at(1));
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
		return func.apply(t1.at(0) * t2.v0(), t1.at(1) * t2.v1());
	}
	
	public static <T> T mulFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) * t2.at(0), t1.at(1) * t2.at(1));
	}
	
	public static <T> T mulFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) * t2[0], t1.at(1) * t2[1]);
	}
	
	public static <T> T mulFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) * t2v0, t1.at(1) * t2v1);
	}
	
	public static <T> T mulFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] * t2.v0(), t1[1] * t2.v1());
	}
	
	public static <T> T mulFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] * t2.at(0), t1[1] * t2.at(1));
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
		return func.apply(t1v0 * t2.at(0), t1v1 * t2.at(1));
	}
	
	public static <T> T mulFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 * t2[0], t1v1 * t2[1]);
	}
	
	public static <T> T mulFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 * t2v0, t1v1 * t2v1);
	}

	public static float[] div(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2.v0();
		res[1] = t1.v1() / t2.v1();
		
		return res;
	}

	public static float[] div(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.v0() / t2.at(0);
		res[1] = t1.v1() / t2.at(1);
		
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
		res[0] = t1.at(0) / t2.v0();
		res[1] = t1.at(1) / t2.v1();
		
		return res;
	}

	public static float[] div(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) / t2.at(0);
		res[1] = t1.at(1) / t2.at(1);
		
		return res;
	}
	
	public static float[] div(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) / t2[0];
		res[1] = t1.at(1) / t2[1];
		
		return res;
	}

	public static float[] div(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = t1.at(0) / t2v0;
		res[1] = t1.at(1) / t2v1;
		
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
		res[0] = t1[0] / t2.at(0);
		res[1] = t1[1] / t2.at(1);
		
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
		res[0] = t1v0 / t2.at(0);
		res[1] = t1v1 / t2.at(1);
		
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
		res.set(t1.v0() / t2.at(0), t1.v1() / t2.at(1));
		
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
		res.set(t1.at(0) / t2.v0(), t1.at(1) / t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T div(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) / t2.at(0), t1.at(1) / t2.at(1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T div(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(t1.at(0) / t2[0], t1.at(1) / t2[1]);
		
		return res;
	}

	public static <T extends ITup2WF> T div(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(t1.at(0) / t2v0, t1.at(1) / t2v1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T div(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2.v0(), t1[1] / t2.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T div(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(t1[0] / t2.at(0), t1[1] / t2.at(1));
		
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
		res.set(t1v0 / t2.at(0), t1v1 / t2.at(1));
		
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
		return func.apply(t1.v0() / t2.at(0), t1.v1() / t2.at(1));
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
		return func.apply(t1.at(0) / t2.v0(), t1.at(1) / t2.v1());
	}
	
	public static <T> T divFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) / t2.at(0), t1.at(1) / t2.at(1));
	}
	
	public static <T> T divFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) / t2[0], t1.at(1) / t2[1]);
	}
	
	public static <T> T divFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1.at(0) / t2v0, t1.at(1) / t2v1);
	}
	
	public static <T> T divFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] / t2.v0(), t1[1] / t2.v1());
	}
	
	public static <T> T divFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply(t1[0] / t2.at(0), t1[1] / t2.at(1));
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
		return func.apply(t1v0 / t2.at(0), t1v1 / t2.at(1));
	}
	
	public static <T> T divFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply(t1v0 / t2[0], t1v1 / t2[1]);
	}
	
	public static <T> T divFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply(t1v0 / t2v0, t1v1 / t2v1);
	}

	public static float[] fma(ITup2RF t1, ITup2RF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3.v1());
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITup2RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.v0(), t3.at(0));
		res[1] = MathUtils.fma(t1.v1(), t2.v1(), t3.at(1));
		
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
		res[0] = MathUtils.fma(t1.v0(), t2.at(0), t3.v0());
		res[1] = MathUtils.fma(t1.v1(), t2.at(1), t3.v1());
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.at(0), t3.at(0));
		res[1] = MathUtils.fma(t1.v1(), t2.at(1), t3.at(1));
		
		return res;
	}
	
	public static float[] fma(ITup2RF t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.at(0), t3[0]);
		res[1] = MathUtils.fma(t1.v1(), t2.at(1), t3[1]);
		
		return res;
	}

	public static float[] fma(ITup2RF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.v0(), t2.at(0), t3v0);
		res[1] = MathUtils.fma(t1.v1(), t2.at(1), t3v1);
		
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
		res[0] = MathUtils.fma(t1.v0(), t2[0], t3.at(0));
		res[1] = MathUtils.fma(t1.v1(), t2[1], t3.at(1));
		
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
		res[0] = MathUtils.fma(t1.v0(), t2v0, t3.at(0));
		res[1] = MathUtils.fma(t1.v1(), t2v1, t3.at(1));
		
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
		res[0] = MathUtils.fma(t1.at(0), t2.v0(), t3.v0());
		res[1] = MathUtils.fma(t1.at(1), t2.v1(), t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup2RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2.v0(), t3.at(0));
		res[1] = MathUtils.fma(t1.at(1), t2.v1(), t3.at(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, ITup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2.v0(), t3[0]);
		res[1] = MathUtils.fma(t1.at(1), t2.v1(), t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2.v0(), t3v0);
		res[1] = MathUtils.fma(t1.at(1), t2.v1(), t3v1);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2.at(0), t3.v0());
		res[1] = MathUtils.fma(t1.at(1), t2.at(1), t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2.at(0), t3.at(0));
		res[1] = MathUtils.fma(t1.at(1), t2.at(1), t3.at(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2.at(0), t3[0]);
		res[1] = MathUtils.fma(t1.at(1), t2.at(1), t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2.at(0), t3v0);
		res[1] = MathUtils.fma(t1.at(1), t2.at(1), t3v1);
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float[] t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2[0], t3.v0());
		res[1] = MathUtils.fma(t1.at(1), t2[1], t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, float[] t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2[0], t3.at(0));
		res[1] = MathUtils.fma(t1.at(1), t2[1], t3.at(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2[0], t3[0]);
		res[1] = MathUtils.fma(t1.at(1), t2[1], t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2[0], t3v0);
		res[1] = MathUtils.fma(t1.at(1), t2[1], t3v1);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2v0, t3.v0());
		res[1] = MathUtils.fma(t1.at(1), t2v1, t3.v1());
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2v0, t3.at(0));
		res[1] = MathUtils.fma(t1.at(1), t2v1, t3.at(1));
		
		return res;
	}
	
	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2v0, t3[0]);
		res[1] = MathUtils.fma(t1.at(1), t2v1, t3[1]);
		
		return res;
	}

	public static float[] fma(ITupRF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1.at(0), t2v0, t3v0);
		res[1] = MathUtils.fma(t1.at(1), t2v1, t3v1);
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITup2RF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3.v0());
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3.v1());
		
		return res;
	}

	public static float[] fma(float[] t1, ITup2RF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3.at(0));
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3.at(1));
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITup2RF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3[0]);
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3[1]);
		
		return res;
	}

	public static float[] fma(float[] t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3v0);
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3v1);
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, ITup2RF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3.v0());
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3.v1());
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3.at(0));
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3.at(1));
		
		return res;
	}
	
	public static float[] fma(float[] t1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3[0]);
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3[2]);
		
		return res;
	}

	public static float[] fma(float[] t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1[0], t2.at(0), t3v0);
		res[1] = MathUtils.fma(t1[1], t2.at(1), t3v1);
		
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
		res[0] = MathUtils.fma(t1[0], t2[0], t3.at(0));
		res[1] = MathUtils.fma(t1[1], t2[1], t3.at(1));
		
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
		res[0] = MathUtils.fma(t1[0], t2v0, t3.at(0));
		res[1] = MathUtils.fma(t1[1], t2v1, t3.at(1));
		
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
		res[0] = MathUtils.fma(t1v0, t2.v0(), t3.at(0));
		res[1] = MathUtils.fma(t1v1, t2.v1(), t3.at(1));
		
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
		res[0] = MathUtils.fma(t1v0, t2.at(0), t3.v0());
		res[1] = MathUtils.fma(t1v1, t2.at(1), t3.v1());
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITupRF t2, ITupRF t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.at(0), t3.at(0));
		res[1] = MathUtils.fma(t1v1, t2.at(1), t3.at(1));
		
		return res;
	}
	
	public static float[] fma(float t1v0, float t1v1, ITupRF t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.at(0), t3[0]);
		res[1] = MathUtils.fma(t1v1, t2.at(1), t3[1]);
		
		return res;
	}

	public static float[] fma(float t1v0, float t1v1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.fma(t1v0, t2.at(0), t3v0);
		res[1] = MathUtils.fma(t1v1, t2.at(1), t3v1);
		
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
		res[0] = MathUtils.fma(t1v0, t2[0], t3.at(0));
		res[1] = MathUtils.fma(t1v1, t2[1], t3.at(1));
		
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
		res[0] = MathUtils.fma(t1v0, t2v0, t3.at(0));
		res[1] = MathUtils.fma(t1v1, t2v1, t3.at(1));
		
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
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3.v0()), MathUtils.fma(t1.v1(), t2.at(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITup2RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3.at(0)), MathUtils.fma(t1.v1(), t2.at(1), t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, ITup2RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3[0]), MathUtils.fma(t1.v1(), t2.at(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3v0), MathUtils.fma(t1.v1(), t2.at(1), t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3.v0()), MathUtils.fma(t1.v1(), t2.at(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3.at(0)), MathUtils.fma(t1.v1(), t2.at(1), t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3[0]), MathUtils.fma(t1.v1(), t2.at(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2.at(0), t3v0), MathUtils.fma(t1.v1(), t2.at(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITup2RF t1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3.v0()), MathUtils.fma(t1.v1(), t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITup2RF t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.v0(), t2[0], t3.at(0)), MathUtils.fma(t1.v1(), t2[1], t3.at(1)));
		
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
		res.set(MathUtils.fma(t1.v0(), t2v0, t3.at(0)), MathUtils.fma(t1.v1(), t2v1, t3.at(1)));
		
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
		res.set(MathUtils.fma(t1.at(0), t2.v0(), t3.v0()), MathUtils.fma(t1.at(1), t2.v1(), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITup2RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2.v0(), t3.at(0)), MathUtils.fma(t1.at(1), t2.v1(), t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, ITup2RF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2.v0(), t3[0]), MathUtils.fma(t1.at(1), t2.v1(), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITup2RF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2.v0(), t3v0), MathUtils.fma(t1.at(1), t2.v1(), t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2.at(0), t3.v0()), MathUtils.fma(t1.at(1), t2.at(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2.at(0), t3.at(0)), MathUtils.fma(t1.at(1), t2.at(1), t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2.at(0), t3[0]), MathUtils.fma(t1.at(1), t2.at(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2.at(0), t3v0), MathUtils.fma(t1.at(1), t2.at(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2[0], t3.v0()), MathUtils.fma(t1.at(1), t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2[0], t3.at(0)), MathUtils.fma(t1.at(1), t2[1], t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2[0], t3[0]), MathUtils.fma(t1.at(1), t2[1], t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float[] t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2[0], t3v0), MathUtils.fma(t1.at(1), t2[1], t3v1));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2v0, t3.v0()), MathUtils.fma(t1.at(1), t2v1, t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2v0, t3.at(0)), MathUtils.fma(t1.at(1), t2v1, t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2v0, t3[0]), MathUtils.fma(t1.at(1), t2v1, t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(ITupRF t1, float t2v0, float t2v1, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1.at(0), t2v0, t3v0), MathUtils.fma(t1.at(1), t2v1, t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, ITup2RF t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3.v0()), MathUtils.fma(t1[1], t2.v1(), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITup2RF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.v0(), t3.at(0)), MathUtils.fma(t1[1], t2.v1(), t3.at(1)));
		
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
		res.set(MathUtils.fma(t1[0], t2.at(0), t3.v0()), MathUtils.fma(t1[1], t2.at(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.at(0), t3.at(0)), MathUtils.fma(t1[1], t2.at(1), t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.at(0), t3[0]), MathUtils.fma(t1[1], t2.at(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2.at(0), t3v0), MathUtils.fma(t1[1], t2.at(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float[] t1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3.v0()), MathUtils.fma(t1[1], t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float[] t1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1[0], t2[0], t3.at(0)), MathUtils.fma(t1[1], t2[1], t3.at(1)));
		
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
		res.set(MathUtils.fma(t1[0], t2v0, t3.at(0)), MathUtils.fma(t1[1], t2v1, t3.at(1)));
		
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
		res.set(MathUtils.fma(t1v0, t2.v0(), t3.at(0)), MathUtils.fma(t1v1, t2.v1(), t3.at(1)));
		
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
		res.set(MathUtils.fma(t1v0, t2.at(0), t3.v0()), MathUtils.fma(t1v1, t2.at(1), t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITupRF t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.at(0), t3.at(0)), MathUtils.fma(t1v1, t2.at(1), t3.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITupRF t2, float[] t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.at(0), t3[0]), MathUtils.fma(t1v1, t2.at(1), t3[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, ITupRF t2, float t3v0, float t3v1, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2.at(0), t3v0), MathUtils.fma(t1v1, t2.at(1), t3v1));
		
		return res;
	}
	
	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float[] t2, ITup2RF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3.v0()), MathUtils.fma(t1v1, t2[1], t3.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T fma(float t1v0, float t1v1, float[] t2, ITupRF t3, @ExtractionParam T res)
	{
		res.set(MathUtils.fma(t1v0, t2[0], t3.at(0)), MathUtils.fma(t1v1, t2[1], t3.at(1)));
		
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
		res.set(MathUtils.fma(t1v0, t2v0, t3.at(0)), MathUtils.fma(t1v1, t2v1, t3.at(1)));
		
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
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3.v0()), MathUtils.fma(t1.v1(), t2.at(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITup2RF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3.at(0)), MathUtils.fma(t1.v1(), t2.at(1), t3.at(1)));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITup2RF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3[0]), MathUtils.fma(t1.v1(), t2.at(1), t3[1]));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITup2RF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3v0), MathUtils.fma(t1.v1(), t2.at(1), t3v1));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3.v0()), MathUtils.fma(t1.v1(), t2.at(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3.at(0)), MathUtils.fma(t1.v1(), t2.at(1), t3.at(1)));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3[0]), MathUtils.fma(t1.v1(), t2.at(1), t3[1]));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2.at(0), t3v0), MathUtils.fma(t1.v1(), t2.at(1), t3v1));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2[0], t3.v0()), MathUtils.fma(t1.v1(), t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(ITup2RF t1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.v0(), t2[0], t3.at(0)), MathUtils.fma(t1.v1(), t2[1], t3.at(1)));
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
		return func.apply(MathUtils.fma(t1.v0(), t2v0, t3.at(0)), MathUtils.fma(t1.v1(), t2v1, t3.at(1)));
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
		return func.apply(MathUtils.fma(t1.at(0), t2.v0(), t3.v0()), MathUtils.fma(t1.at(1), t2.v1(), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITup2RF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2.v0(), t3.at(0)), MathUtils.fma(t1.at(1), t2.v1(), t3.at(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITup2RF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2.v0(), t3[0]), MathUtils.fma(t1.at(1), t2.v1(), t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITup2RF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2.v0(), t3v0), MathUtils.fma(t1.at(1), t2.v1(), t3v1));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2.at(0), t3.v0()), MathUtils.fma(t1.at(1), t2.at(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2.at(0), t3.at(0)), MathUtils.fma(t1.at(1), t2.at(1), t3.at(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2.at(0), t3[0]), MathUtils.fma(t1.at(1), t2.at(1), t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2.at(0), t3v0), MathUtils.fma(t1.at(1), t2.at(1), t3v1));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2[0], t3.v0()), MathUtils.fma(t1.at(1), t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2[0], t3.at(0)), MathUtils.fma(t1.at(1), t2[1], t3.at(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2[0], t3[0]), MathUtils.fma(t1.at(1), t2[1], t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float[] t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2[0], t3v0), MathUtils.fma(t1.at(1), t2[1], t3v1));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2v0, t3.v0()), MathUtils.fma(t1.at(1), t2v1, t3.v1()));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2v0, t3.at(0)), MathUtils.fma(t1.at(1), t2v1, t3.at(1)));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2v0, t3[0]), MathUtils.fma(t1.at(1), t2v1, t3[1]));
	}
	
	public static <T> T fmaFunc(ITupRF t1, float t2v0, float t2v1, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1.at(0), t2v0, t3v0), MathUtils.fma(t1.at(1), t2v1, t3v1));
	}
	
	public static <T> T fmaFunc(float[] t1, ITup2RF t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.v0(), t3.v0()), MathUtils.fma(t1[1], t2.v1(), t3.v1()));
	}
	
	public static <T> T fmaFunc(float[] t1, ITup2RF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.v0(), t3.at(0)), MathUtils.fma(t1[1], t2.v1(), t3.at(1)));
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
		return func.apply(MathUtils.fma(t1[0], t2.at(0), t3.v0()), MathUtils.fma(t1[1], t2.at(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(float[] t1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.at(0), t3.at(0)), MathUtils.fma(t1[1], t2.at(1), t3.at(1)));
	}
	
	public static <T> T fmaFunc(float[] t1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.at(0), t3[0]), MathUtils.fma(t1[1], t2.at(1), t3[1]));
	}
	
	public static <T> T fmaFunc(float[] t1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2.at(0), t3v0), MathUtils.fma(t1[1], t2.at(1), t3v1));
	}
	
	public static <T> T fmaFunc(float[] t1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2[0], t3.v0()), MathUtils.fma(t1[1], t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(float[] t1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1[0], t2[0], t3.at(0)), MathUtils.fma(t1[1], t2[1], t3.at(1)));
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
		return func.apply(MathUtils.fma(t1[0], t2v0, t3.at(0)), MathUtils.fma(t1[1], t2v1, t3.at(1)));
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
		return func.apply(MathUtils.fma(t1v0, t2.v0(), t3.at(0)), MathUtils.fma(t1v1, t2.v1(), t3.at(1)));
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
		return func.apply(MathUtils.fma(t1v0, t2.at(0), t3.v0()), MathUtils.fma(t1v1, t2.at(1), t3.v1()));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITupRF t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.at(0), t3.at(0)), MathUtils.fma(t1v1, t2.at(1), t3.at(1)));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITupRF t2, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.at(0), t3[0]), MathUtils.fma(t1v1, t2.at(1), t3[1]));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, ITupRF t2, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2.at(0), t3v0), MathUtils.fma(t1v1, t2.at(1), t3v1));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float[] t2, ITup2RF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2[0], t3.v0()), MathUtils.fma(t1v1, t2[1], t3.v1()));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float[] t2, ITupRF t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2[0], t3.at(0)), MathUtils.fma(t1v1, t2[1], t3.at(1)));
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
		return func.apply(MathUtils.fma(t1v0, t2v0, t3.at(0)), MathUtils.fma(t1v1, t2v1, t3.at(1)));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float t2v0, float t2v1, float[] t3, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2v0, t3[0]), MathUtils.fma(t1v1, t2v1, t3[1]));
	}
	
	public static <T> T fmaFunc(float t1v0, float t1v1, float t2v0, float t2v1, float t3v0, float t3v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.fma(t1v0, t2v0, t3v0), MathUtils.fma(t1v1, t2v1, t3v1));
	}

	public static float[] trunc(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = (int)v.v0();
		res[1] = (int)v.v1();
		
		return res;
	}

	public static float[] trunc(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = (int)v.at(0);
		res[1] = (int)v.at(1);
		
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

	public static <T extends ITup2WF> T trunc(ITup2RF v, @ExtractionParam T res)
	{
		res.set((int)v.v0(), (int)v.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T trunc(ITupRF v, @ExtractionParam T res)
	{
		res.set((int)v.at(0), (int)v.at(1));
		
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

	public static <T> T truncFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply((int)v.v0(), (int)v.v1());
	}
	
	public static <T> T truncFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply((int)v.at(0), (int)v.at(1));
	}
	
	public static <T> T truncFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply((int)v[0], (int)v[1]);
	}
	
	public static <T> T truncFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply((int)v0, (int)v1);
	}

	public static float[] abs(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v.v0());
		res[1] = MathUtils.abs(v.v1());
		
		return res;
	}

	public static float[] abs(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.abs(v.at(0));
		res[1] = MathUtils.abs(v.at(1));
		
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

	public static <T extends ITup2WF> T abs(ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v.v0()), MathUtils.abs(v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T abs(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.abs(v.at(0)), MathUtils.abs(v.at(1)));
		
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

	public static <T> T absFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v.v0()), MathUtils.abs(v.v1()));
	}
	
	public static <T> T absFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v.at(0)), MathUtils.abs(v.at(1)));
	}
	
	public static <T> T absFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v[0]), MathUtils.abs(v[1]));
	}
	
	public static <T> T absFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.abs(v0), MathUtils.abs(v1));
	}

	public static float[] signum(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signum(v.v0());
		res[1] = MathUtils.signum(v.v1());
		
		return res;
	}

	public static float[] signum(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signum(v.at(0));
		res[1] = MathUtils.signum(v.at(1));
		
		return res;
	}
	
	public static float[] signum(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signum(v[0]);
		res[1] = MathUtils.signum(v[1]);
		
		return res;
	}

	public static float[] signum(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signum(v0);
		res[1] = MathUtils.signum(v1);
		
		return res;
	}

	public static <T extends ITup2WF> T signum(ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signum(v.v0()), MathUtils.signum(v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T signum(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signum(v.at(0)), MathUtils.signum(v.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T signum(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.signum(v[0]), MathUtils.signum(v[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T signum(float v0, float v1, @ExtractionParam T res)
	{
		res.set(MathUtils.signum(v0), MathUtils.signum(v1));
		
		return res;
	}

	public static <T> T signumFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signum(v.v0()), MathUtils.signum(v.v1()));
	}
	
	public static <T> T signumFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signum(v.at(0)), MathUtils.signum(v.at(1)));
	}
	
	public static <T> T signumFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signum(v[0]), MathUtils.signum(v[1]));
	}
	
	public static <T> T signumFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signum(v0), MathUtils.signum(v1));
	}

	public static float[] signumEM(float tolerance, ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM(tolerance, v.v0());
		res[1] = MathUtils.signumEM(tolerance, v.v1());
		
		return res;
	}

	public static float[] signumEM(float tolerance, ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM(tolerance, v.at(0));
		res[1] = MathUtils.signumEM(tolerance, v.at(1));
		
		return res;
	}
	
	public static float[] signumEM(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM(tolerance, v[0]);
		res[1] = MathUtils.signumEM(tolerance, v[1]);
		
		return res;
	}

	public static float[] signumEM(float tolerance, float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM(tolerance, v0);
		res[1] = MathUtils.signumEM(tolerance, v1);
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM(float tolerance, ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM(tolerance, v.v0()), MathUtils.signumEM(tolerance, v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM(float tolerance, ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM(tolerance, v.at(0)), MathUtils.signumEM(tolerance, v.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T signumEM(float tolerance, float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM(tolerance, v[0]), MathUtils.signumEM(tolerance, v[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM(float tolerance, float v0, float v1, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM(tolerance, v0), MathUtils.signumEM(tolerance, v1));
		
		return res;
	}

	public static <T> T signumFuncEM(float tolerance, ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM(tolerance, v.v0()), MathUtils.signumEM(tolerance, v.v1()));
	}
	
	public static <T> T signumFuncEM(float tolerance, ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM(tolerance, v.at(0)), MathUtils.signumEM(tolerance, v.at(1)));
	}
	
	public static <T> T signumFuncEM(float tolerance, float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM(tolerance, v[0]), MathUtils.signumEM(tolerance, v[1]));
	}
	
	public static <T> T signumFuncEM(float tolerance, float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM(tolerance, v0), MathUtils.signumEM(tolerance, v1));
	}

	public static float[] signumEM4(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM4(v.v0());
		res[1] = MathUtils.signumEM4(v.v1());
		
		return res;
	}

	public static float[] signumEM4(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM4(v.at(0));
		res[1] = MathUtils.signumEM4(v.at(1));
		
		return res;
	}
	
	public static float[] signumEM4(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM4(v[0]);
		res[1] = MathUtils.signumEM4(v[1]);
		
		return res;
	}

	public static float[] signumEM4(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM4(v0);
		res[1] = MathUtils.signumEM4(v1);
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM4(ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM4(v.v0()), MathUtils.signumEM4(v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM4(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM4(v.at(0)), MathUtils.signumEM4(v.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T signumEM4(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM4(v[0]), MathUtils.signumEM4(v[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM4(float v0, float v1, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM4(v0), MathUtils.signumEM4(v1));
		
		return res;
	}

	public static <T> T signumFuncEM4(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM4(v.v0()), MathUtils.signumEM4(v.v1()));
	}
	
	public static <T> T signumFuncEM4(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM4(v.at(0)), MathUtils.signumEM4(v.at(1)));
	}
	
	public static <T> T signumFuncEM4(float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM4(v[0]), MathUtils.signumEM4(v[1]));
	}
	
	public static <T> T signumFuncEM4(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM4(v0), MathUtils.signumEM4(v1));
	}

	public static float[] signumEM6(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM6(v.v0());
		res[1] = MathUtils.signumEM6(v.v1());
		
		return res;
	}

	public static float[] signumEM6(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM6(v.at(0));
		res[1] = MathUtils.signumEM6(v.at(1));
		
		return res;
	}
	
	public static float[] signumEM6(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM6(v[0]);
		res[1] = MathUtils.signumEM6(v[1]);
		
		return res;
	}

	public static float[] signumEM6(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM6(v0);
		res[1] = MathUtils.signumEM6(v1);
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM6(ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM6(v.v0()), MathUtils.signumEM6(v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM6(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM6(v.at(0)), MathUtils.signumEM6(v.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T signumEM6(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM6(v[0]), MathUtils.signumEM6(v[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM6(float v0, float v1, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM6(v0), MathUtils.signumEM6(v1));
		
		return res;
	}

	public static <T> T signumFuncEM6(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM6(v.v0()), MathUtils.signumEM6(v.v1()));
	}
	
	public static <T> T signumFuncEM6(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM6(v.at(0)), MathUtils.signumEM6(v.at(1)));
	}
	
	public static <T> T signumFuncEM6(float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM6(v[0]), MathUtils.signumEM6(v[1]));
	}
	
	public static <T> T signumFuncEM6(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM6(v0), MathUtils.signumEM6(v1));
	}

	public static float[] signumEM8(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM8(v.v0());
		res[1] = MathUtils.signumEM8(v.v1());
		
		return res;
	}

	public static float[] signumEM8(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM8(v.at(0));
		res[1] = MathUtils.signumEM8(v.at(1));
		
		return res;
	}
	
	public static float[] signumEM8(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM8(v[0]);
		res[1] = MathUtils.signumEM8(v[1]);
		
		return res;
	}

	public static float[] signumEM8(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM8(v0);
		res[1] = MathUtils.signumEM8(v1);
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM8(ITup2RF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM8(v.v0()), MathUtils.signumEM8(v.v1()));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM8(ITupRF v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM8(v.at(0)), MathUtils.signumEM8(v.at(1)));
		
		return res;
	}
	
	public static <T extends ITup2WF> T signumEM8(float[] v, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM8(v[0]), MathUtils.signumEM8(v[1]));
		
		return res;
	}

	public static <T extends ITup2WF> T signumEM8(float v0, float v1, @ExtractionParam T res)
	{
		res.set(MathUtils.signumEM8(v0), MathUtils.signumEM8(v1));
		
		return res;
	}

	public static <T> T signumFuncEM8(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM8(v.v0()), MathUtils.signumEM8(v.v1()));
	}
	
	public static <T> T signumFuncEM8(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM8(v.at(0)), MathUtils.signumEM8(v.at(1)));
	}
	
	public static <T> T signumFuncEM8(float[] v, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM8(v[0]), MathUtils.signumEM8(v[1]));
	}
	
	public static <T> T signumFuncEM8(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(MathUtils.signumEM8(v0), MathUtils.signumEM8(v1));
	}

	public static float[] neg(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = -v.v0();
		res[1] = -v.v1();
		
		return res;
	}

	public static float[] neg(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = -v.at(0);
		res[1] = -v.at(1);
		
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

	public static <T extends ITup2WF> T neg(ITup2RF v, @ExtractionParam T res)
	{
		res.set(-v.v0(), -v.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T neg(ITupRF v, @ExtractionParam T res)
	{
		res.set(-v.at(0), -v.at(1));
		
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

	public static <T> T negFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(-v.v0(), -v.v1());
	}
	
	public static <T> T negFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(-v.at(0), -v.at(1));
	}
	
	public static <T> T negFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(-v[0], -v[1]);
	}
	
	public static <T> T negFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(-v0, -v1);
	}

	public static float[] rec(ITup2RF v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v.v0();
		res[1] = 1.0f / v.v1();
		
		return res;
	}

	public static float[] rec(ITupRF v, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v.at(0);
		res[1] = 1.0f / v.at(1);
		
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

	public static <T extends ITup2WF> T rec(ITup2RF v, @ExtractionParam T res)
	{
		res.set(1.0f / v.v0(), 1.0f / v.v1());
		
		return res;
	}

	public static <T extends ITup2WF> T rec(ITupRF v, @ExtractionParam T res)
	{
		res.set(1.0f / v.at(0), 1.0f / v.at(1));
		
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

	public static <T> T recFunc(ITup2RF v, IFunc2F<T> func)
	{
		return func.apply(1.0f / v.v0(), 1.0f / v.v1());
	}
	
	public static <T> T recFunc(ITupRF v, IFunc2F<T> func)
	{
		return func.apply(1.0f / v.at(0), 1.0f / v.at(1));
	}
	
	public static <T> T recFunc(float[] v, IFunc2F<T> func)
	{
		return func.apply(1.0f / v[0], 1.0f / v[1]);
	}
	
	public static <T> T recFunc(float v0, float v1, IFunc2F<T> func)
	{
		return func.apply(1.0f / v0, 1.0f / v1);
	}

	public static float lenRc(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRc(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
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

	public static float len(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float len(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float len(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float len(float v0, float v1)
	{
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM(float tolerance, ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM(float tolerance, ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM(float tolerance, float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM(float tolerance, float v0, float v1)
	{
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM4(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM4(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM4(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM4(float v0, float v1)
	{
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM6(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM6(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM6(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM6(float v0, float v1)
	{
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM8(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM8(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM8(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenEM8(float v0, float v1)
	{
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenSq(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSq(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSq(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSq(float v0, float v1)
	{
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM(float tolerance, ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM(float tolerance, ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM(float tolerance, float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM(float tolerance, float v0, float v1)
	{
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM4(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM4(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM4(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM4(float v0, float v1)
	{
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM6(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM6(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM6(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM6(float v0, float v1)
	{
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM8(ITup2RF v)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM8(ITupRF v)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM8(float[] v)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqEM8(float v0, float v1)
	{
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float[] nrm(ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();

		if (tup_isZero_2f(v0, v1))
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
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZero_2f(v0, v1))
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
		if (tup_isZero_2f(v))
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
		if (tup_isZero_2f(v0, v1))
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

	public static <T extends ITup2WF> T nrm(ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZero_2f(v0, v1))
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
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZero_2f(v0, v1))
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
		if (tup_isZero_2f(v))
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
		if (tup_isZero_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T> T nrmFunc(ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZero_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFunc(ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZero_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFunc(float[] v, IFunc2F<T> func)
	{
		if (tup_isZero_2f(v))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return func.apply(v[0] * invLength, v[1] * invLength);
	}
	
	public static <T> T nrmFunc(float v0, float v1, IFunc2F<T> func)
	{
		if (tup_isZero_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}

	public static float[] nrmEM(float tolerance, ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();

		if (tup_isZeroEM_2f(tolerance, v0, v1))
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

	public static float[] nrmEM(float tolerance, ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM_2f(tolerance, v0, v1))
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
	
	public static float[] nrmEM(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM_2f(tolerance, v))
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

	public static float[] nrmEM(float tolerance, float v0, float v1, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM_2f(tolerance, v0, v1))
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

	public static <T extends ITup2WF> T nrmEM(float tolerance, ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM_2f(tolerance, v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM(float tolerance, ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM_2f(tolerance, v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}
	
	public static <T extends ITup2WF> T nrmEM(float tolerance, float[] v, @ExtractionParam T res)
	{
		if (tup_isZeroEM_2f(tolerance, v))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res.set(v[0] * invLength, v[1] * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM(float tolerance, float v0, float v1, @ExtractionParam T res)
	{
		if (tup_isZeroEM_2f(tolerance, v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T> T nrmFuncEM(float tolerance, ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM_2f(tolerance, v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM(float tolerance, ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM_2f(tolerance, v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM(float tolerance, float[] v, IFunc2F<T> func)
	{
		if (tup_isZeroEM_2f(tolerance, v))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return func.apply(v[0] * invLength, v[1] * invLength);
	}
	
	public static <T> T nrmFuncEM(float tolerance, float v0, float v1, IFunc2F<T> func)
	{
		if (tup_isZeroEM_2f(tolerance, v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}

	public static float[] nrmEM4(ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();

		if (tup_isZeroEM4_2f(v0, v1))
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

	public static float[] nrmEM4(ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM4_2f(v0, v1))
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
	
	public static float[] nrmEM4(float[] v, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM4_2f(v))
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

	public static float[] nrmEM4(float v0, float v1, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM4_2f(v0, v1))
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

	public static <T extends ITup2WF> T nrmEM4(ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM4_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM4(ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM4_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}
	
	public static <T extends ITup2WF> T nrmEM4(float[] v, @ExtractionParam T res)
	{
		if (tup_isZeroEM4_2f(v))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res.set(v[0] * invLength, v[1] * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM4(float v0, float v1, @ExtractionParam T res)
	{
		if (tup_isZeroEM4_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T> T nrmFuncEM4(ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM4_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM4(ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM4_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM4(float[] v, IFunc2F<T> func)
	{
		if (tup_isZeroEM4_2f(v))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return func.apply(v[0] * invLength, v[1] * invLength);
	}
	
	public static <T> T nrmFuncEM4(float v0, float v1, IFunc2F<T> func)
	{
		if (tup_isZeroEM4_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}

	public static float[] nrmEM6(ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();

		if (tup_isZeroEM6_2f(v0, v1))
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

	public static float[] nrmEM6(ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM6_2f(v0, v1))
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
	
	public static float[] nrmEM6(float[] v, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM6_2f(v))
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

	public static float[] nrmEM6(float v0, float v1, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM6_2f(v0, v1))
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

	public static <T extends ITup2WF> T nrmEM6(ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM6_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM6(ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM6_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}
	
	public static <T extends ITup2WF> T nrmEM6(float[] v, @ExtractionParam T res)
	{
		if (tup_isZeroEM6_2f(v))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res.set(v[0] * invLength, v[1] * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM6(float v0, float v1, @ExtractionParam T res)
	{
		if (tup_isZeroEM6_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T> T nrmFuncEM6(ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM6_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM6(ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM6_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM6(float[] v, IFunc2F<T> func)
	{
		if (tup_isZeroEM6_2f(v))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return func.apply(v[0] * invLength, v[1] * invLength);
	}
	
	public static <T> T nrmFuncEM6(float v0, float v1, IFunc2F<T> func)
	{
		if (tup_isZeroEM6_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}

	public static float[] nrmEM8(ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();

		if (tup_isZeroEM8_2f(v0, v1))
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

	public static float[] nrmEM8(ITupRF v, @ExtractionParam float[] res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM8_2f(v0, v1))
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
	
	public static float[] nrmEM8(float[] v, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM8_2f(v))
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

	public static float[] nrmEM8(float v0, float v1, @ExtractionParam float[] res)
	{
		if (tup_isZeroEM8_2f(v0, v1))
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

	public static <T extends ITup2WF> T nrmEM8(ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM8_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM8(ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM8_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}
	
	public static <T extends ITup2WF> T nrmEM8(float[] v, @ExtractionParam T res)
	{
		if (tup_isZeroEM8_2f(v))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		res.set(v[0] * invLength, v[1] * invLength);
		
		return res;
	}

	public static <T extends ITup2WF> T nrmEM8(float v0, float v1, @ExtractionParam T res)
	{
		if (tup_isZeroEM8_2f(v0, v1))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		res.set(v0 * invLength, v1 * invLength);
		
		return res;
	}

	public static <T> T nrmFuncEM8(ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		if (tup_isZeroEM8_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM8(ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
		if (tup_isZeroEM8_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}
	
	public static <T> T nrmFuncEM8(float[] v, IFunc2F<T> func)
	{
		if (tup_isZeroEM8_2f(v))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
		
		return func.apply(v[0] * invLength, v[1] * invLength);
	}
	
	public static <T> T nrmFuncEM8(float v0, float v1, IFunc2F<T> func)
	{
		if (tup_isZeroEM8_2f(v0, v1))
		{
			return func.apply(0.0f, 0.0f);
		}
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1);
		
		return func.apply(v0 * invLength, v1 * invLength);
	}

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
		float v0 = v.at(0);
		float v1 = v.at(1);
		
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

	public static <T extends ITup2WF> T rotRad(double angle, ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		res.set((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
		
		return res;
	}

	public static <T extends ITup2WF> T rotRad(double angle, ITupRF v, @ExtractionParam T res)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
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

	public static <T> T rotRadFunc(double angle, ITup2RF v, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return func.apply((float)(v0 * MathUtils.cos(angle) - v1 * MathUtils.sin(angle)), (float)(v0 * MathUtils.sin(angle) + v1 * MathUtils.cos(angle)));
	}
	
	public static <T> T rotRadFunc(double angle, ITupRF v, IFunc2F<T> func)
	{
		float v0 = v.at(0);
		float v1 = v.at(1);
		
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
		float v0 = v.at(0);
		float v1 = v.at(1);
		
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
		float v0 = v.at(0);
		float v1 = v.at(1);
		
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
		float v0 = v.at(0);
		float v1 = v.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);		
		
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
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float tV0 = t.v0();
		float tV1 = t.v1();		
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, ITupRF t, @ExtractionParam float[] res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float tV0 = t.at(0);
		float tV1 = t.at(1);		
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res[0] = tV0 * dot;
		res[1] = tV1 * dot;
		
		return res;
	}
	
	public static float[] project(ITupRF v, float[] t, @ExtractionParam float[] res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		
		return res;
	}

	public static float[] project(ITupRF v, float tV0, float tV1, @ExtractionParam float[] res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}
	
	public static <T extends ITup2WF> T project(ITupRF v, ITupRF t, @ExtractionParam T res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		res.set(tV0 * dot, tV1 * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(ITupRF v, float[] t, @ExtractionParam T res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		res.set(t[0] * dot, t[1] * dot);
		
		return res;
	}

	public static <T extends ITup2WF> T project(ITupRF v, float tV0, float tV1, @ExtractionParam T res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float tV0 = t.v0();
		float tV1 = t.v1();
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(ITupRF v, ITupRF t, IFunc2F<T> func)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
		float dot = vV0 * tV0 + vV1 * tV1;
		
		return func.apply(tV0 * dot, tV1 * dot);
	}
	
	public static <T> T projectFunc(ITupRF v, float[] t, IFunc2F<T> func)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
		float dot = vV0 * t[0] + vV1 * t[1];
		
		return func.apply(t[0] * dot, t[1] * dot);
	}
	
	public static <T> T projectFunc(ITupRF v, float tV0, float tV1, IFunc2F<T> func)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float tV0 = t.at(0);
		float tV1 = t.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}

	public static float[] reflect(ITupRF v, ITupRF n, @ExtractionParam float[] res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res[0] = nV0 * dot + vV0;
		res[1] = nV1 * dot + vV1;
		
		return res;
	}
	
	public static float[] reflect(ITupRF v, float[] n, @ExtractionParam float[] res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res[0] = n[0] * dot + vV0;
		res[1] = n[1] * dot + vV1;
		
		return res;
	}

	public static float[] reflect(ITupRF v, float nV0, float nV1, @ExtractionParam float[] res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(ITupRF v, ITupRF n, @ExtractionParam T res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		res.set(nV0 * dot + vV0, nV1 * dot + vV1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T reflect(ITupRF v, float[] n, @ExtractionParam T res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		res.set(n[0] * dot + vV0, n[1] * dot + vV1);
		
		return res;
	}

	public static <T extends ITup2WF> T reflect(ITupRF v, float nV0, float nV1, @ExtractionParam T res)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float nV0 = n.v0();
		float nV1 = n.v1();
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITupRF v, ITupRF n, IFunc2F<T> func)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
		float dot = -2 * (vV0 * nV0 + vV1 * nV1);
		
		return func.apply(nV0 * dot + vV0, nV1 * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITupRF v, float[] n, IFunc2F<T> func)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
		float dot = -2 * (vV0 * n[0] + vV1 * n[1]);
		
		return func.apply(n[0] * dot + vV0, n[1] * dot + vV1);
	}
	
	public static <T> T reflectFunc(ITupRF v, float nV0, float nV1, IFunc2F<T> func)
	{
		float vV0 = v.at(0);
		float vV1 = v.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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
		float nV0 = n.at(0);
		float nV1 = n.at(1);
		
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

	public static float dot(ITup2RF t1, ITup2RF t2)
	{
		return t1.v0() * t2.v0() + t1.v1() * t2.v1();
	}

	public static float dot(ITup2RF t1, ITupRF t2)
	{
		return t1.v0() * t2.at(0) + t1.v1() * t2.at(1);
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
		return t1.at(0) * t2.v0() + t1.at(1) * t2.v1();
	}

	public static float dot(ITupRF t1, ITupRF t2)
	{
		return t1.at(0) * t2.at(0) + t1.at(1) * t2.at(1);
	}
	
	public static float dot(ITupRF t1, float[] t2)
	{
		return t1.at(0) * t2[0] + t1.at(1) * t2[1];
	}

	public static float dot(ITupRF t1, float t2v0, float t2v1)
	{
		return t1.at(0) * t2v0 + t1.at(1) * t2v1;
	}
	
	public static float dot(float[] t1, ITup2RF t2)
	{
		return t1[0] * t2.v0() + t1[1] * t2.v1();
	}

	public static float dot(float[] t1, ITupRF t2)
	{
		return t1[0] * t2.at(0) + t1[1] * t2.at(1);
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
		return t1v0 * t2.at(0) + t1v1 * t2.at(1);
	}
	
	public static float dot(float t1v0, float t1v1, float[] t2)
	{
		return t1v0 * t2[0] + t1v1 * t2[1];
	}

	public static float dot(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		return t1v0 * t2v0 + t1v1 * t2v1;
	}

	public static float[] halfVecTo(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.v0()) * 0.5f;
		res[1] = (t2.v1() - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.at(0) - t1.v0()) * 0.5f;
		res[1] = (t2.at(1) - t1.v1()) * 0.5f;
		
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
		res[0] = (t2.v0() - t1.at(0)) * 0.5f;
		res[1] = (t2.v1() - t1.at(1)) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.at(0) - t1.at(0)) * 0.5f;
		res[1] = (t2.at(1) - t1.at(1)) * 0.5f;
		
		return res;
	}
	
	public static float[] halfVecTo(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = (t2[0] - t1.at(0)) * 0.5f;
		res[1] = (t2[1] - t1.at(1)) * 0.5f;
		
		return res;
	}

	public static float[] halfVecTo(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = (t2v0 - t1.at(0)) * 0.5f;
		res[1] = (t2v1 - t1.at(1)) * 0.5f;
		
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
		res[0] = (t2.at(0) - t1[0]) * 0.5f;
		res[1] = (t2.at(1) - t1[1]) * 0.5f;
		
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
		res[0] = (t2.at(0) - t1v0) * 0.5f;
		res[1] = (t2.at(1) - t1v1) * 0.5f;
		
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

	public static <T extends ITup2WF> T halfVecTo(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.at(0) - t1.v0()) * 0.5f, (t2.at(1) - t1.v1()) * 0.5f);
		
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
		res.set((t2.v0() - t1.at(0)) * 0.5f, (t2.v1() - t1.at(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.at(0) - t1.at(0)) * 0.5f, (t2.at(1) - t1.at(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T halfVecTo(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.at(0)) * 0.5f, (t2[1] - t1.at(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.at(0)) * 0.5f, (t2v1 - t1.at(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T halfVecTo(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T halfVecTo(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.at(0) - t1[0]) * 0.5f, (t2.at(1) - t1[1]) * 0.5f);
		
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
		res.set((t2.at(0) - t1v0) * 0.5f, (t2.at(1) - t1v1) * 0.5f);
		
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

	public static <T> T halfVecToFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.at(0) - t1.v0()) * 0.5f, (t2.at(1) - t1.v1()) * 0.5f);
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
		return func.apply((t2.v0() - t1.at(0)) * 0.5f, (t2.v1() - t1.at(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.at(0) - t1.at(0)) * 0.5f, (t2.at(1) - t1.at(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1.at(0)) * 0.5f, (t2[1] - t1.at(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1.at(0)) * 0.5f, (t2v1 - t1.at(1)) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.at(0) - t1[0]) * 0.5f, (t2.at(1) - t1[1]) * 0.5f);
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
		return func.apply((t2.at(0) - t1v0) * 0.5f, (t2.at(1) - t1v1) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
	}
	
	public static <T> T halfVecToFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
	}

	public static float[] midPointTo(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.v0() - t1.v0()) * 0.5f;
		res[1] = (t2.v1() - t1.v1()) * 0.5f;
		
		return res;
	}

	public static float[] midPointTo(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = (t2.at(0) - t1.v0()) * 0.5f;
		res[1] = (t2.at(1) - t1.v1()) * 0.5f;
		
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
		res[0] = (t2.at(0) - t1[0]) * 0.5f;
		res[1] = (t2.at(1) - t1[1]) * 0.5f;
		
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
		res[0] = (t2.at(0) - t1v0) * 0.5f;
		res[1] = (t2.at(1) - t1v1) * 0.5f;
		
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

	public static <T extends ITup2WF> T midPointTo(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.at(0) - t1.v0()) * 0.5f, (t2.at(1) - t1.v1()) * 0.5f);
		
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
		res.set((t2.v0() - t1.at(0)) * 0.5f, (t2.v1() - t1.at(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.at(0) - t1.at(0)) * 0.5f, (t2.at(1) - t1.at(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T midPointTo(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set((t2[0] - t1.at(0)) * 0.5f, (t2[1] - t1.at(1)) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set((t2v0 - t1.at(0)) * 0.5f, (t2v1 - t1.at(1)) * 0.5f);
		
		return res;
	}
	
	public static <T extends ITup2WF> T midPointTo(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
		
		return res;
	}

	public static <T extends ITup2WF> T midPointTo(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set((t2.at(0) - t1[0]) * 0.5f, (t2.at(1) - t1[1]) * 0.5f);
		
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
		res.set((t2.at(0) - t1v0) * 0.5f, (t2.at(1) - t1v1) * 0.5f);
		
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

	public static <T> T midPointToFunc(ITup2RF t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1.v0()) * 0.5f, (t2.v1() - t1.v1()) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITup2RF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.at(0) - t1.v0()) * 0.5f, (t2.at(1) - t1.v1()) * 0.5f);
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
		return func.apply((t2.v0() - t1.at(0)) * 0.5f, (t2.v1() - t1.at(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITupRF t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.at(0) - t1.at(0)) * 0.5f, (t2.at(1) - t1.at(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITupRF t1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1.at(0)) * 0.5f, (t2[1] - t1.at(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(ITupRF t1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1.at(0)) * 0.5f, (t2v1 - t1.at(1)) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float[] t1, ITup2RF t2, IFunc2F<T> func)
	{
		return func.apply((t2.v0() - t1[0]) * 0.5f, (t2.v1() - t1[1]) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float[] t1, ITupRF t2, IFunc2F<T> func)
	{
		return func.apply((t2.at(0) - t1[0]) * 0.5f, (t2.at(1) - t1[1]) * 0.5f);
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
		return func.apply((t2.at(0) - t1v0) * 0.5f, (t2.at(1) - t1v1) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float t1v0, float t1v1, float[] t2, IFunc2F<T> func)
	{
		return func.apply((t2[0] - t1v0) * 0.5f, (t2[1] - t1v1) * 0.5f);
	}
	
	public static <T> T midPointToFunc(float t1v0, float t1v1, float t2v0, float t2v1, IFunc2F<T> func)
	{
		return func.apply((t2v0 - t1v0) * 0.5f, (t2v1 - t1v1) * 0.5f);
	}

	public static float lenTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenToEM(float tolerance, ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenToEM4(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenToEM6(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenToEM8(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}

	public static float lenSqTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZero_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM(float tolerance, ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM(float tolerance, ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM(float tolerance, float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM_2f(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM4(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM4(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM4(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM4(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM4(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM4_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM6(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM6(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM6(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM6(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM6(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM6_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM8(ITup2RF t1, float[] t2)
	{
		float v0 = t2[0] - t1.v0();
		float v1 = t2[1] - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(ITup2RF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.v0();
		float v1 = t2v1 - t1.v1();
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(ITupRF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM8(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM8(float[] t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1[0];
		float v1 = t2.v1() - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(float[] t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM8(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(float t1v0, float t1v1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1v0;
		float v1 = t2.v1() - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(float t1v0, float t1v1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM8(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(tup_isZeroEM8_2f(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenRcTo(ITup2RF t1, ITup2RF t2)
	{
		float v0 = t2.v0() - t1.v0();
		float v1 = t2.v1() - t1.v1();
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(ITup2RF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.v0();
		float v1 = t2.at(1) - t1.v1();
		
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
		float v0 = t2.v0() - t1.at(0);
		float v1 = t2.v1() - t1.at(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(ITupRF t1, ITupRF t2)
	{
		float v0 = t2.at(0) - t1.at(0);
		float v1 = t2.at(1) - t1.at(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenRcTo(ITupRF t1, float[] t2)
	{
		float v0 = t2[0] - t1.at(0);
		float v1 = t2[1] - t1.at(1);
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}

	public static float lenRcTo(ITupRF t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1.at(0);
		float v1 = t2v1 - t1.at(1);
		
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
		float v0 = t2.at(0) - t1[0];
		float v1 = t2.at(1) - t1[1];
		
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
		float v0 = t2.at(0) - t1v0;
		float v1 = t2.at(1) - t1v1;
		
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
