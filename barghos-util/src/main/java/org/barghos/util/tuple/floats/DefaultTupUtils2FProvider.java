package org.barghos.util.tuple.floats;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.AllowNull;
import org.barghos.util.accessor.floats.IIndexAccessorIRF;
import org.barghos.util.accessor.floats.IKeyAccessorRF;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.collection.KeyValuePairF;
import org.barghos.util.math.MathUtils;

public class DefaultTupUtils2FProvider implements ITupUtils2FProvider
{
	@Override
	public IndexValuePairF min(ITup2RF t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF min(ITupRF t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF min(float[] t, @ExtractionParam IndexValuePairF res)
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

	@Override
	public IndexValuePairF min(float tv0, float tv1, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public <T> IndexValuePairF min(IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public <T,K> KeyValuePairF<K> min(K[] keys, IKeyAccessorRF<T,K> accessor, T obj, @ExtractionParam KeyValuePairF<K> res)
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
	
	@Override
	public IndexValuePairF minAligned(int startIndexT, ITupRF t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF minAligned(int startIndexT, float[] t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public <T> IndexValuePairF minAligned(int startIndexT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF minUnaligned(int[] indicesT, ITupRF t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF minUnaligned(int[] indicesT, float[] t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public <T> IndexValuePairF minUnaligned(int[] indicesT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF minUnaligned(int indexTV0, int indexTV1, ITupRF t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF minUnaligned(int indexTV0, int indexTV1, float[] t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public <T> IndexValuePairF minUnaligned(int indexTV0, int indexTV1, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF max(ITup2RF t, @ExtractionParam IndexValuePairF res)
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

	@Override
	public IndexValuePairF max(ITupRF t, @ExtractionParam IndexValuePairF res)
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
	
	@Override
	public IndexValuePairF max(float[] t, @ExtractionParam IndexValuePairF res)
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

	@Override
	public IndexValuePairF max(float tv0, float tv1, @ExtractionParam IndexValuePairF res)
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

	@Override
	public float[] minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2.v0());
		res[1] = Math.min(t1.v1(), t2.v1());
		
		return res;
	}

	@Override
	public float[] minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2.getAt(0));
		res[1] = Math.min(t1.v1(), t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] minComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2[0]);
		res[1] = Math.min(t1.v1(), t2[1]);
		
		return res;
	}

	@Override
	public float[] minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.v0(), t2v0);
		res[1] = Math.min(t1.v1(), t2v1);
		
		return res;
	}

	@Override
	public float[] minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2.v0());
		res[1] = Math.min(t1.getAt(1), t2.v1());
		
		return res;
	}

	@Override
	public float[] minComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2.getAt(0));
		res[1] = Math.min(t1.getAt(1), t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] minComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2[0]);
		res[1] = Math.min(t1.getAt(1), t2[1]);
		
		return res;
	}

	@Override
	public float[] minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1.getAt(0), t2v0);
		res[1] = Math.min(t1.getAt(1), t2v1);
		
		return res;
	}
	
	@Override
	public float[] minComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2.v0());
		res[1] = Math.min(t1[1], t2.v1());
		
		return res;
	}

	@Override
	public float[] minComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2.getAt(0));
		res[1] = Math.min(t1[1], t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] minComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2[0]);
		res[1] = Math.min(t1[1], t2[1]);
		
		return res;
	}

	@Override
	public float[] minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2v0);
		res[1] = Math.min(t1[1], t2v1);
		
		return res;
	}

	@Override
	public float[] minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2.v0());
		res[1] = Math.min(t1v1, t2.v1());
		
		return res;
	}

	@Override
	public float[] minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2.getAt(0));
		res[1] = Math.min(t1v1, t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2[0]);
		res[1] = Math.min(t1v1, t2[1]);
		
		return res;
	}

	@Override
	public float[] minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2v0);
		res[1] = Math.min(t1v1, t2v1);
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2.v0()), Math.min(t1.v1(), t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2.getAt(0)), Math.min(t1.v1(), t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T minComponents(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2[0]), Math.min(t1.v1(), t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1.v0(), t2v0), Math.min(t1.v1(), t2v1));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2.v0()), Math.min(t1.getAt(1), t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2.getAt(0)), Math.min(t1.getAt(1), t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T minComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2[0]), Math.min(t1.getAt(1), t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1.getAt(0), t2v0), Math.min(t1.getAt(1), t2v1));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T minComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2.v0()), Math.min(t1[1], t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2.getAt(0)), Math.min(t1[1], t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T minComponents(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2[0]), Math.min(t1[1], t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1[0], t2v0), Math.min(t1[1], t2v1));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2.v0()), Math.min(t1v1, t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2.getAt(0)), Math.min(t1v1, t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2[0]), Math.min(t1v1, t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.min(t1v0, t2v0), Math.min(t1v1, t2v1));
		
		return res;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.v0(), t2.v0()), Math.min(t1.v1(), t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.v0(), t2.getAt(0)), Math.min(t1.v1(), t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.v0(), t2[0]), Math.min(t1.v1(), t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.v0(), t2v0), Math.min(t1.v1(), t2v1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.getAt(0), t2.v0()), Math.min(t1.getAt(1), t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.getAt(0), t2.getAt(0)), Math.min(t1.getAt(1), t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.getAt(0), t2[0]), Math.min(t1.getAt(1), t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1.getAt(0), t2v0), Math.min(t1.getAt(1), t2v1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1[0], t2.v0()), Math.min(t1[1], t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1[0], t2.getAt(0)), Math.min(t1[1], t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1[0], t2[0]), Math.min(t1[1], t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1[0], t2v0), Math.min(t1[1], t2v1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1v0, t2.v0()), Math.min(t1v1, t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1v0, t2.getAt(0)), Math.min(t1v1, t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1v0, t2[0]), Math.min(t1v1, t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.min(t1v0, t2v0), Math.min(t1v1, t2v1));
	}
	
	@Override
	public float[] maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2.v0());
		res[1] = Math.max(t1.v1(), t2.v1());
		
		return res;
	}

	@Override
	public float[] maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2.getAt(0));
		res[1] = Math.max(t1.v1(), t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] maxComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2[0]);
		res[1] = Math.max(t1.v1(), t2[1]);
		
		return res;
	}

	@Override
	public float[] maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.v0(), t2v0);
		res[1] = Math.max(t1.v1(), t2v1);
		
		return res;
	}

	@Override
	public float[] maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2.v0());
		res[1] = Math.max(t1.getAt(1), t2.v1());
		
		return res;
	}

	@Override
	public float[] maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2.getAt(0));
		res[1] = Math.max(t1.getAt(1), t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] maxComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2[0]);
		res[1] = Math.max(t1.getAt(1), t2[1]);
		
		return res;
	}

	@Override
	public float[] maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1.getAt(0), t2v0);
		res[1] = Math.max(t1.getAt(1), t2v1);
		
		return res;
	}
	
	@Override
	public float[] maxComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2.v0());
		res[1] = Math.max(t1[1], t2.v1());
		
		return res;
	}

	@Override
	public float[] maxComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2.getAt(0));
		res[1] = Math.max(t1[1], t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] maxComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2[0]);
		res[1] = Math.max(t1[1], t2[1]);
		
		return res;
	}

	@Override
	public float[] maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2v0);
		res[1] = Math.max(t1[1], t2v1);
		
		return res;
	}

	@Override
	public float[] maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2.v0());
		res[1] = Math.max(t1v1, t2.v1());
		
		return res;
	}

	@Override
	public float[] maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2.getAt(0));
		res[1] = Math.max(t1v1, t2.getAt(1));
		
		return res;
	}
	
	@Override
	public float[] maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2[0]);
		res[1] = Math.max(t1v1, t2[1]);
		
		return res;
	}

	@Override
	public float[] maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2v0);
		res[1] = Math.max(t1v1, t2v1);
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2.v0()), Math.max(t1.v1(), t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2.getAt(0)), Math.max(t1.v1(), t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T maxComponents(ITup2RF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2[0]), Math.max(t1.v1(), t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1.v0(), t2v0), Math.max(t1.v1(), t2v1));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2.v0()), Math.max(t1.getAt(1), t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2.getAt(0)), Math.max(t1.getAt(1), t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T maxComponents(ITupRF t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2[0]), Math.max(t1.getAt(1), t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1.getAt(0), t2v0), Math.max(t1.getAt(1), t2v1));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T maxComponents(float[] t1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2.v0()), Math.max(t1[1], t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(float[] t1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2.getAt(0)), Math.max(t1[1], t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T maxComponents(float[] t1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2[0]), Math.max(t1[1], t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1[0], t2v0), Math.max(t1[1], t2v1));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2.v0()), Math.max(t1v1, t2.v1()));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2.getAt(0)), Math.max(t1v1, t2.getAt(1)));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2[0]), Math.max(t1v1, t2[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
	{
		res.set(Math.max(t1v0, t2v0), Math.max(t1v1, t2v1));
		
		return res;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.v0(), t2.v0()), Math.max(t1.v1(), t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.v0(), t2.getAt(0)), Math.max(t1.v1(), t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.v0(), t2[0]), Math.max(t1.v1(), t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.v0(), t2v0), Math.max(t1.v1(), t2v1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.getAt(0), t2.v0()), Math.max(t1.getAt(1), t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.getAt(0), t2.getAt(0)), Math.max(t1.getAt(1), t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.getAt(0), t2[0]), Math.max(t1.getAt(1), t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1.getAt(0), t2v0), Math.max(t1.getAt(1), t2v1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1[0], t2.v0()), Math.max(t1[1], t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1[0], t2.getAt(0)), Math.max(t1[1], t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1[0], t2[0]), Math.max(t1[1], t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1[0], t2v0), Math.max(t1[1], t2v1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1v0, t2.v0()), Math.max(t1v1, t2.v1()));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1v0, t2.getAt(0)), Math.max(t1v1, t2.getAt(1)));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1v0, t2[0]), Math.max(t1v1, t2[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
	{
		return (T) prototype.createNew(Math.max(t1v0, t2v0), Math.max(t1v1, t2v1));
	}
	
	@Override
	public float[] arrange(ITup2RF t, int[] indices, float[] res)
	{
		res[0] = t.getAt(indices[0]);
		res[1] = t.getAt(indices[1]);
		
		return res;
	}

	@Override
	public float[] arrange(ITupRF t, int[] indices, float[] res)
	{
		res[0] = t.getAt(indices[0]);
		res[1] = t.getAt(indices[1]);
		
		return res;
	}
	
	@Override
	public float[] arrange(float[] t, int[] indices, float[] res)
	{
		res[0] = t[indices[0]];
		res[1] = t[indices[1]];
		
		return res;
	}

	@Override
	public float[] arrange(float tv0, float tv1, int[] indices, float[] res)
	{
		float v0 = switch(indices[0]) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
			
		float v1 = switch(indices[1]) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res[0] = v0;
		res[1] = v1;
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T arrange(ITup2RF t, int[] indices, T res)
	{
		res.set(t.getAt(indices[0]), t.getAt(indices[1]));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T arrange(ITupRF t, int[] indices, T res)
	{
		res.set(t.getAt(indices[0]), t.getAt(indices[1]));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T arrange(float[] t, int[] indices, T res)
	{
		res.set(t[indices[0]], t[indices[1]]);
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T arrange(float tv0, float tv1, int[] indices, T res)
	{
		float v0 = switch(indices[0]) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indices[1]) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(v0, v1);
		
		return res;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(ITup2RF t, int[] indices, T prototype)
	{
		return (T) prototype.createNew(t.getAt(indices[0]), t.getAt(indices[1]));
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(ITupRF t, int[] indices, T prototype)
	{
		return (T) prototype.createNew(t.getAt(indices[0]), t.getAt(indices[1]));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(float[] t, int[] indices, T prototype)
	{
		return (T) prototype.createNew(t[indices[0]], t[indices[1]]);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(float tv0, float tv1, int[] indices, T prototype)
	{
		float v0 = switch(indices[0]) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indices[1]) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		return (T) prototype.createNew(v0, v1);
	}
	
	@Override
	public float[] arrange(ITup2RF t, int index0, int index1, float[] res)
	{
		res[0] = t.getAt(index0);
		res[1] = t.getAt(index1);
		
		return res;
	}
	
	@Override
	public float[] arrange(ITupRF t, int index0, int index1, float[] res)
	{
		res[0] = t.getAt(index0);
		res[1] = t.getAt(index1);
		
		return res;
	}
	
	@Override
	public float[] arrange(float[] t, int index0, int index1, float[] res)
	{
		res[0] = t[index0];
		res[1] = t[index1];
		
		return res;
	}
	
	@Override
	public float[] arrange(float tv0, float tv1, int index0, int index1, float[] res)
	{
		float v0 = switch(index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(index1) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res[0] = v0;
		res[1] = v1;
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T arrange(ITup2RF t, int index0, int index1, T res)
	{
		res.set(t.getAt(index0), t.getAt(index1));
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T arrange(ITupRF t, int index0, int index1, T res)
	{
		res.set(t.getAt(index0), t.getAt(index1));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T arrange(float[] t, int index0, int index1, T res)
	{
		res.set(t[index0], t[index1]);
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T arrange(float tv0, float tv1, int index0, int index1, T res)
	{
		float v0 = switch(index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(index1) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res.set(v0, v1);
		
		return res;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(ITup2RF t, int index0, int index1, T prototype)
	{
		return (T) prototype.createNew(t.getAt(index0), t.getAt(index1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(ITupRF t, int index0, int index1, T prototype)
	{
		return (T) prototype.createNew(t.getAt(index0), t.getAt(index1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(float[] t, int index0, int index1, T prototype)
	{
		return (T) prototype.createNew(t[index0], t[index1]);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T arrangeCreateNew(float tv0, float tv1, int index0, int index1, T prototype)
	{
		float v0 = switch(index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(index1) {
			case 0 -> tv0;
			case 1 -> tv1;
			default -> throw new IndexOutOfBoundsException();
		};
		
		return (T) prototype.createNew(v0, v1);
	}
	
	@Override
	public float[] swizzle(ITup2RF t, int indexA, int indexB, float[] res)
	{
		t.toArray(res);
		
		float v = res[indexA];
		res[indexA] = res[indexB];
		res[indexB] = v; 

		return res;
	}
	
	@Override
	public float[] swizzle(ITupRF t, int indexA, int indexB, float[] res)
	{
		t.toArray(res);
		
		float v = res[indexA];
		res[indexA] = res[indexB];
		res[indexB] = v; 

		return res;
	}
	
	@Override
	public float[] swizzle(float[] t, int indexA, int indexB, float[] res)
	{
		System.arraycopy(res, 0, res, 0, res.length);
		
		float v = res[indexA];
		res[indexA] = res[indexB];
		res[indexB] = v; 

		return res;
	}
	
	@Override
	public float[] swizzle(float tv0, float tv1, int indexA, int indexB, float[] res)
	{
		res[0] = tv0;
		res[1] = tv1;
		
		float v = res[indexA];
		res[indexA] = res[indexB];
		res[indexB] = v; 

		return res;
	}
	
	@Override
	public <T extends ITup2WF> T swizzle(ITup2RF t, int indexA, int indexB, T res)
	{
		float[] ar = t.toArray();
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		res.set(ar);
		
		return res;
	}

	@Override
	public <T extends ITup2WF> T swizzle(ITupRF t, int indexA, int indexB, T res)
	{
		float[] ar = t.toArray();
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		res.set(ar);
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T swizzle(float[] t, int indexA, int indexB, T res)
	{
		float[] ar = Arrays.copyOf(t, t.length);
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		res.set(ar);
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T swizzle(float tv0, float tv1, int indexA, int indexB, T res)
	{
		float[] ar = new float[] {tv0, tv1};
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		res.set(ar);
		
		return res;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleCreateNew(ITup2RF t, int indexA, int indexB, T prototype)
	{
		float[] ar = t.toArray();
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		return (T) prototype.createNew(ar);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleCreateNew(ITupRF t, int indexA, int indexB, T prototype)
	{
		float[] ar = t.toArray();
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		return (T) prototype.createNew(ar);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleCreateNew(float[] t, int indexA, int indexB, T prototype)
	{
		float[] ar = Arrays.copyOf(t, t.length);
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		return (T) prototype.createNew(ar);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleCreateNew(float tv0, float tv1, int indexA, int indexB, T prototype)
	{
		float[] ar = new float[] {tv0, tv1};
		
		float v = ar[indexA];
		ar[indexA] = ar[indexB];
		ar[indexB] = v; 
		
		return (T) prototype.createNew(ar);
	}
	
	@Override
	public float[] swizzleV0V1(ITup2RF t, float[] res)
	{
		res[0] = t.v1();
		res[1] = t.v0();
		
		return res;
	}
	
	@Override
	public float[] swizzleV0V1(ITupRF t, float[] res)
	{
		res[0] = t.getAt(1);
		res[1] = t.getAt(0);
		
		return res;
	}
	
	@Override
	public float[] swizzleV0V1(float[] t, float[] res)
	{
		res[0] = t[1];
		res[1] = t[0];
		
		return res;
	}
	
	@Override
	public float[] swizzleV0V1(float tv0, float tv1, float[] res)
	{
		res[0] = tv1;
		res[1] = tv0;
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T swizzleV0V1(ITup2RF t, T res)
	{
		res.set(t.v1(), t.v0());
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T swizzleV0V1(ITupRF t, T res)
	{
		res.set(t.getAt(0), t.getAt(1));
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T swizzleV0V1(float[] t, T res)
	{
		res.set(t[1], t[0]);
		
		return res;
	}
	
	@Override
	public <T extends ITup2WF> T swizzleV0V1(float tv0, float tv1, T res)
	{
		res.set(tv1, tv0);
		
		return res;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleV0V1CreateNew(ITup2RF t, T prototype)
	{
		return (T) prototype.createNew(t.v1(), t.v0());
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleV0V1CreateNew(ITupRF t, T prototype)
	{
		return (T) prototype.createNew(t.getAt(0), t.getAt(1));
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleV0V1CreateNew(float[] t, T prototype)
	{
		return (T) prototype.createNew(t[1], t[0]);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ITup2RF> T swizzleV0V1CreateNew(float tv0, float tv1, T prototype)
	{
		return (T) prototype.createNew(tv1, tv0);
	}
	
	public static class DefaultCompareProvider implements ITupUtils2FProvider.CompareProvider
	{
		@Override
		public boolean equals(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			if(t1.v0() != t2.v0()) return false;
			if(t1.v1() != t2.v1()) return false;
			
			return true;
		}

		@Override
		public boolean equals(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			if(t1.v0() != t2.getAt(0)) return false;
			if(t1.v1() != t2.getAt(1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			if(t1.v0() != t2[0]) return false;
			if(t1.v1() != t2[1]) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			
			if(t1.v0() != t2v0) return false;
			if(t1.v1() != t2v1) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			if(t1.getAt(0) != t2.v0()) return false;
			if(t1.getAt(1) != t2.v1()) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			if(t1.getAt(0) != t2.getAt(0)) return false;
			if(t1.getAt(1) != t2.getAt(1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			if(t1.getAt(0) != t2[0]) return false;
			if(t1.getAt(1) != t2[1]) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			if(t1.getAt(0) != t2v0) return false;
			if(t1.getAt(1) != t2v1) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			if(t1[0] != t2.v0()) return false;
			if(t1[1] != t2.v1()) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			if(t1[0] != t2.getAt(0)) return false;
			if(t1[1] != t2.getAt(1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			if(t1[0] != t2[0]) return false;
			if(t1[1] != t2[1]) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(@AllowNull float[] t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			if(t1[0] != t2v0) return false;
			if(t1[1] != t2v1) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			if(t2 == null) return false;
			
			if(t1v0 != t2.v0()) return false;
			if(t1v1 != t2.v1()) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			if(t1v0 != t2.getAt(0)) return false;
			if(t1v1 != t2.getAt(1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float t1v0, float t1v1, @AllowNull float[] t2)
		{
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			if(t1v0 != t2[0]) return false;
			if(t1v1 != t2[1]) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float t1v0, float t1v1, float t2v0, float t2v1)
		{
			if(t1v0 != t2v0) return false;
			if(t1v1 != t2v1) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.v0(), t2.v0())) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.v1(), t2.v1())) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.v0(), t2.getAt(0))) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.v1(), t2.getAt(1))) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.v0(), t2[0])) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.v1(), t2[1])) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.v0(), t2v0)) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.v1(), t2v1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(0), t2.v0())) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(1), t2.v1())) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(0), t2.getAt(0))) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(1), t2.getAt(1))) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(0), t2[0])) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(1), t2[1])) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(0), t2v0)) return false;
			if(!MathUtils.Comp.equals(tolerance, t1.getAt(1), t2v1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1[0], t2.v0())) return false;
			if(!MathUtils.Comp.equals(tolerance, t1[1], t2.v1())) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1[0], t2.getAt(0))) return false;
			if(!MathUtils.Comp.equals(tolerance, t1[1], t2.getAt(1))) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1[0], t2[0])) return false;
			if(!MathUtils.Comp.equals(tolerance, t1[1], t2[1])) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, @AllowNull float[] t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1[0], t2v0)) return false;
			if(!MathUtils.Comp.equals(tolerance, t1[1], t2v1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			if(t2 == null) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1v0, t2.v0())) return false;
			if(!MathUtils.Comp.equals(tolerance, t1v1, t2.v1())) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1v0, t2.getAt(0))) return false;
			if(!MathUtils.Comp.equals(tolerance, t1v1, t2.getAt(1))) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull float[] t2)
		{
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			if(!MathUtils.Comp.equals(tolerance, t1v0, t2[0])) return false;
			if(!MathUtils.Comp.equals(tolerance, t1v1, t2[1])) return false;
			
			return true;
		}
		
		@Override
		public boolean equals(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
		{
			if(!MathUtils.Comp.equals(tolerance, t1v0, t2v0)) return false;
			if(!MathUtils.Comp.equals(tolerance, t1v1, t2v1)) return false;
			
			return true;
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			switch(index)
			{
				case 0: return t1.v0() == t2.v0();
				case 1: return t1.v1() == t2.v1();
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return t1.v0() == t2.getAt(0);
				case 1: return t1.v1() == t2.getAt(1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return t1.v0() == t2[0];
				case 1: return t1.v1() == t2[1];
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITup2RF t1, float value)
		{
			if(t1 == null) return false;
			
			switch(index)
			{
				case 0: return t1.v0() == value;
				case 1: return t1.v1() == value;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			
			switch(index)
			{
				case 0: return t1.v0() == t2v0;
				case 1: return t1.v1() == t2v1;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			switch(index)
			{
				case 0: return t1.getAt(0) == t2.v0();
				case 1: return t1.getAt(1) == t2.v1();
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return t1.getAt(0) == t2.getAt(0);
				case 1: return t1.getAt(1) == t2.getAt(1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return t1.getAt(0) == t2[0];
				case 1: return t1.getAt(1) == t2[1];
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			switch(index)
			{
				case 0: return t1.getAt(0) == value;
				case 1: return t1.getAt(1) == value;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			switch(index)
			{
				case 0: return t1.getAt(0) == t2v0;
				case 1: return t1.getAt(1) == t2v1;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			switch(index)
			{
				case 0: return t1[0] == t2.v0();
				case 1: return t1[1] == t2.v1();
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return t1[0] == t2.getAt(0);
				case 1: return t1[1] == t2.getAt(1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return t1[0] == t2[0];
				case 1: return t1[1] == t2[1];
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull float[] t1, float value)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			switch(index)
			{
				case 0: return t1[0] == value;
				case 1: return t1[1] == value;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, @AllowNull float[] t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			switch(index)
			{
				case 0: return t1[0] == t2v0;
				case 1: return t1[1] == t2v1;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			if(t2 == null) return false;
			
			switch(index)
			{
				case 0: return t1v0 == t2.v0();
				case 1: return t1v1 == t2.v1();
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return t1v0 == t2.getAt(0);
				case 1: return t1v1 == t2.getAt(1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull float[] t2)
		{
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return t1v0 == t2[0];
				case 1: return t1v1 == t2[1];
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, float t1v0, float t1v1, float value)
		{
			switch(index)
			{
				case 0: return t1v0 == value;
				case 1: return t1v1 == value;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(int index, float t1v0, float t1v1, float t2v0, float t2v1)
		{
			switch(index)
			{
				case 0: return t1v0 == t2v0;
				case 1: return t1v1 == t2v1;
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.v0(), t2.v0());
				case 1: return MathUtils.Comp.equals(tolerance, t1.v1(), t2.v1());
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.v0(), t2.getAt(0));
				case 1: return MathUtils.Comp.equals(tolerance, t1.v1(), t2.getAt(1));
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.v0(), t2[0]);
				case 1: return MathUtils.Comp.equals(tolerance, t1.v1(), t2[1]);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float value)
		{
			if(t1 == null) return false;

			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.v0(), value);
				case 1: return MathUtils.Comp.equals(tolerance, t1.v1(), value);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;

			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.v0(), t2v0);
				case 1: return MathUtils.Comp.equals(tolerance, t1.v1(), t2v1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.getAt(0), t2.v0());
				case 1: return MathUtils.Comp.equals(tolerance, t1.getAt(1), t2.v1());
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.getAt(0), t2.getAt(0));
				case 1: return MathUtils.Comp.equals(tolerance, t1.getAt(1), t2.getAt(1));
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.getAt(0), t2[0]);
				case 1: return MathUtils.Comp.equals(tolerance, t1.getAt(1), t2[1]);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float value)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.getAt(0), value);
				case 1: return MathUtils.Comp.equals(tolerance, t1.getAt(1), value);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1.getAt(0), t2v0);
				case 1: return MathUtils.Comp.equals(tolerance, t1.getAt(1), t2v1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1[0], t2.v0());
				case 1: return MathUtils.Comp.equals(tolerance, t1[1], t2.v1());
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1[0], t2.getAt(0));
				case 1: return MathUtils.Comp.equals(tolerance, t1[1], t2.getAt(1));
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1[0], t2[0]);
				case 1: return MathUtils.Comp.equals(tolerance, t1[1], t2[1]);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float value)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1[0], value);
				case 1: return MathUtils.Comp.equals(tolerance, t1[1], value);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float t2v0, float t2v1)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1[0], t2v0);
				case 1: return MathUtils.Comp.equals(tolerance, t1[1], t2v1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
		{
			if(t2 == null) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1v0, t2.v0());
				case 1: return MathUtils.Comp.equals(tolerance, t1v1, t2.v1());
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
		{
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1v0, t2.getAt(0));
				case 1: return MathUtils.Comp.equals(tolerance, t1v1, t2.getAt(1));
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull float[] t2)
		{
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1v0, t2[0]);
				case 1: return MathUtils.Comp.equals(tolerance, t1v1, t2[1]);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float value)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1v0, value);
				case 1: return MathUtils.Comp.equals(tolerance, t1v1, value);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t2v0, float t2v1)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.equals(tolerance, t1v0, t2v0);
				case 1: return MathUtils.Comp.equals(tolerance, t1v1, t2v1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			return t1.v0() == t2.v0();
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			return t1.v0() == t2.getAt(0);
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			return t1.v0() == t2[0];
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITup2RF t1, float value)
		{
			if(t1 == null) return false;
			
			return t1.v0() == value;
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			return t1.getAt(0) == t2.v0();
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			return t1.getAt(0) == t2.getAt(0);
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			return t1.getAt(0) == t2[0];
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull ITupRF t1, float value)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			return t1.getAt(0) == value;
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			return t1[0] == t2.v0();
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			return t1[0] == t2.getAt(0);
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			return t1[0] == t2[0];
		}
		
		@Override
		public boolean equalsAtV0(@AllowNull float[] t1, float value)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			return t1[0] == value;
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			return t1.v1() == t2.v1();
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			return t1.v1() == t2.getAt(1);
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			return t1.v1() == t2[1];
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITup2RF t, float value)
		{
			if(t == null) return false;
			
			return t.v1() == value;
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			return t1.getAt(1) == t2.v1();
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			return t1.getAt(1) == t2.getAt(1);
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			return t1.getAt(1) == t2[1];
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull ITupRF t1, float value)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			return t1.getAt(1) == value;
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			return t1[1] == t2.v1();
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			return t1[1] == t2.getAt(1);
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			return t1[1] == t2[1];
		}
		
		@Override
		public boolean equalsAtV1(@AllowNull float[] t1, float value)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			return t1[1] == value;
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.v0(), t2.v0());
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.v0(), t2.getAt(0));
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.v0(), t2[0]);
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t, float value)
		{
			if(t == null) return false;
			
			return MathUtils.Comp.equals(tolerance, t.v0(), value);
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(0), t2.v0());
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(0), t2.getAt(0));
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(0), t2[0]);
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, float value)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(0), value);
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[0], t2.v0());
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[0], t2.getAt(0));
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[0], t2[0]);
		}
		
		@Override
		public boolean equalsAtV0(float tolerance, @AllowNull float[] t1, float value)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[0], value);
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.v1(), t2.v1());
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.v1(), t2.getAt(1));
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t2.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.v1(), t2[1]);
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, float value)
		{
			if(t1 == null) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.v1(), value);
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(1), t2.v1());
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(1), t2.getAt(1));
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.size() != 2) return false;
			if(t2.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(1), t2[1]);
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, float value)
		{
			if(t1 == null) return false;
			if(t1.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1.getAt(1), value);
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[1], t2.v1());
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
		{
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.size() != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[1], t2.getAt(1));
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
		{
			if(t1 == t2) return true;
			if(t1 == null && t2 == null) return true;
			if(t1 == null) return false;
			if(t2 == null) return false;
			if(t1.length != 2) return false;
			if(t2.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[1], t2[1]);
		}
		
		@Override
		public boolean equalsAtV1(float tolerance, @AllowNull float[] t1, float value)
		{
			if(t1 == null) return false;
			if(t1.length != 2) return false;
			
			return MathUtils.Comp.equals(tolerance, t1[1], value);
		}
		
		@Override
		public boolean isFinite(ITup2RF t)
		{
			return Float.isFinite(t.v0()) && Float.isFinite(t.v1());
		}
		
		@Override
		public boolean isFinite(ITupRF t)
		{
			return Float.isFinite(t.getAt(0)) && Float.isFinite(t.getAt(1));
		}
		
		@Override
		public boolean isFinite(float[] t)
		{
			return Float.isFinite(t[0]) && Float.isFinite(t[1]);
		}
		
		@Override
		public boolean isFinite(float tv0, float tv1)
		{
			return Float.isFinite(tv0) && Float.isFinite(tv1);
		}
		
		@Override
		public boolean isFiniteAt(int index, ITup2RF t)
		{
			switch(index)
			{
				case 0: return Float.isFinite(t.v0());
				case 1: return Float.isFinite(t.v1());
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isFiniteAt(int index, ITupRF t)
		{
			switch(index)
			{
				case 0: return Float.isFinite(t.getAt(0));
				case 1: return Float.isFinite(t.getAt(1));
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isFiniteAt(int index, float[] t)
		{
			switch(index)
			{
				case 0: return Float.isFinite(t[0]);
				case 1: return Float.isFinite(t[1]);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isFiniteAt(int index, float tv0, float tv1)
		{
			switch(index)
			{
				case 0: return Float.isFinite(tv0);
				case 1: return Float.isFinite(tv1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isFiniteAtV0(ITup2RF t)
		{
			return Float.isFinite(t.v0());
		}
		
		@Override
		public boolean isFiniteAtV0(ITupRF t)
		{
			return Float.isFinite(t.getAt(0));
		}
		
		@Override
		public boolean isFiniteAtV0(float[] t)
		{
			return Float.isFinite(t[0]);
		}
		
		@Override
		public boolean isFiniteAtV1(ITup2RF t)
		{
			return Float.isFinite(t.v1());
		}
		
		@Override
		public boolean isFiniteAtV1(ITupRF t)
		{
			return Float.isFinite(t.getAt(1));
		}
		
		@Override
		public boolean isFiniteAtV1(float[] t)
		{
			return Float.isFinite(t[1]);
		}
		
		@Override
		public boolean isZero(ITup2RF t)
		{
			return	MathUtils.Comp.isZero(t.v0()) &&
					MathUtils.Comp.isZero(t.v1());
		}
		
		@Override
		public boolean isZero(ITupRF t)
		{
			return	MathUtils.Comp.isZero(t.getAt(0)) &&
					MathUtils.Comp.isZero(t.getAt(1));
		}
		
		@Override
		public boolean isZero(float[] t)
		{
			return	MathUtils.Comp.isZero(t[0]) &&
					MathUtils.Comp.isZero(t[1]);
		}
		
		@Override
		public boolean isZero(float tv0, float tv1)
		{
			return	MathUtils.Comp.isZero(tv0) &&
					MathUtils.Comp.isZero(tv1);
		}
		
		@Override
		public boolean isZero(float tolerance, ITup2RF t)
		{
			return	MathUtils.Comp.isZero(tolerance, t.v0()) &&
					MathUtils.Comp.isZero(tolerance, t.v1());
		}
		
		@Override
		public boolean isZero(float tolerance, ITupRF t)
		{
			return	MathUtils.Comp.isZero(tolerance, t.getAt(0)) &&
					MathUtils.Comp.isZero(tolerance, t.getAt(1));
		}
		
		@Override
		public boolean isZero(float tolerance, float[] t)
		{
			return	MathUtils.Comp.isZero(tolerance, t[0]) &&
					MathUtils.Comp.isZero(tolerance, t[1]);
		}
		
		@Override
		public boolean isZero(float tolerance, float tv0, float tv1)
		{
			return	MathUtils.Comp.isZero(tolerance, tv0) &&
					MathUtils.Comp.isZero(tolerance, tv1);
		}
		
		@Override
		public boolean isZeroAt(int index, ITup2RF t)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(t.v0());
				case 1: return MathUtils.Comp.isZero(t.v1());
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAt(int index, ITupRF t)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(t.getAt(0));
				case 1: return MathUtils.Comp.isZero(t.getAt(1));
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAt(int index, float[] t)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(t[0]);
				case 1: return MathUtils.Comp.isZero(t[1]);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAt(int index, float tv0, float tv1)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(tv0);
				case 1: return MathUtils.Comp.isZero(tv1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAt(float tolerance, int index, ITup2RF t)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(tolerance, t.v0());
				case 1: return MathUtils.Comp.isZero(tolerance, t.v1());
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAt(float tolerance, int index, ITupRF t)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(tolerance, t.getAt(0));
				case 1: return MathUtils.Comp.isZero(tolerance, t.getAt(1));
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAt(float tolerance, int index, float[] t)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(tolerance, t[0]);
				case 1: return MathUtils.Comp.isZero(tolerance, t[1]);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAt(float tolerance, int index, float tv0, float tv1)
		{
			switch(index)
			{
				case 0: return MathUtils.Comp.isZero(tolerance, tv0);
				case 1: return MathUtils.Comp.isZero(tolerance, tv1);
				default: throw new IndexOutOfBoundsException();
			}
		}
		
		@Override
		public boolean isZeroAtV0(ITup2RF t)
		{
			return MathUtils.Comp.isZero(t.v0());
		}
		
		@Override
		public boolean isZeroAtV0(ITupRF t)
		{
			return MathUtils.Comp.isZero(t.getAt(0));
		}
		
		@Override
		public boolean isZeroAtV0(float[] t)
		{
			return MathUtils.Comp.isZero(t[0]);
		}
		
		@Override
		public boolean isZeroAtV1(ITup2RF t)
		{
			return MathUtils.Comp.isZero(t.v1());
		}
		
		@Override
		public boolean isZeroAtV1(ITupRF t)
		{
			return MathUtils.Comp.isZero(t.getAt(1));
		}
		
		@Override
		public boolean isZeroAtV1(float[] t)
		{
			return MathUtils.Comp.isZero(t[1]);
		}
		
		@Override
		public boolean isZeroAtV0(float tolerance, ITup2RF t)
		{
			return MathUtils.Comp.isZero(tolerance, t.v0());
		}
		
		@Override
		public boolean isZeroAtV0(float tolerance, ITupRF t)
		{
			return MathUtils.Comp.isZero(tolerance, t.getAt(0));
		}
		
		@Override
		public boolean isZeroAtV0(float tolerance, float[] t)
		{
			return MathUtils.Comp.isZero(tolerance, t[0]);
		}
		
		@Override
		public boolean isZeroAtV1(float tolerance, ITup2RF t)
		{
			return MathUtils.Comp.isZero(tolerance, t.v1());
		}
		
		@Override
		public boolean isZeroAtV1(float tolerance, ITupRF t)
		{
			return MathUtils.Comp.isZero(tolerance, t.getAt(1));
		}
		
		@Override
		public boolean isZeroAtV1(float tolerance, float[] t)
		{
			return MathUtils.Comp.isZero(tolerance, t[1]);
		}
	}
	
	public static class DefaultLerpProvider implements ITupUtils2FProvider.LerpProvider
	{
		@Override
		public float[] lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.v0(), t2.v0());
			res[1] = MathUtils.Lerp.lerp(alpha, t1.v1(), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.v0(), t2.getAt(0));
			res[1] = MathUtils.Lerp.lerp(alpha, t1.v1(), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.v0(), t2[0]);
			res[1] = MathUtils.Lerp.lerp(alpha, t1.v1(), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.v0(), t2v0);
			res[1] = MathUtils.Lerp.lerp(alpha, t1.v1(), t2v1);
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2.v0());
			res[1] = MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2.getAt(0));
			res[1] = MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2[0]);
			res[1] = MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2v0);
			res[1] = MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2v1);
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1[0], t2.v0());
			res[1] = MathUtils.Lerp.lerp(alpha, t1[1], t2.v1());
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1[0], t2.getAt(0));
			res[1] = MathUtils.Lerp.lerp(alpha, t1[1], t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1[0], t2[0]);
			res[1] = MathUtils.Lerp.lerp(alpha, t1[1], t2[1]);
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1[0], t2v0);
			res[1] = MathUtils.Lerp.lerp(alpha, t1[1], t2v1);
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1v0, t2.v0());
			res[1] = MathUtils.Lerp.lerp(alpha, t1v1, t2.v1());
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1v0, t2.getAt(0));
			res[1] = MathUtils.Lerp.lerp(alpha, t1v1, t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1v0, t2[0]);
			res[1] = MathUtils.Lerp.lerp(alpha, t1v1, t2[1]);
			
			return res;
		}
		
		@Override
		public float[] lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.lerp(alpha, t1v0, t2v0);
			res[1] = MathUtils.Lerp.lerp(alpha, t1v1, t2v1);
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.lerp(alpha, t1.v1(), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1.v1(), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.v0(), t2[0]), MathUtils.Lerp.lerp(alpha, t1.v1(), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.v0(), t2v0), MathUtils.Lerp.lerp(alpha, t1.v1(), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1[0], t2.v0()), MathUtils.Lerp.lerp(alpha, t1[1], t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1[1], t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1[0], t2[0]), MathUtils.Lerp.lerp(alpha, t1[1], t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1[0], t2v0), MathUtils.Lerp.lerp(alpha, t1[1], t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1v0, t2.v0()), MathUtils.Lerp.lerp(alpha, t1v1, t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1v1, t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1v0, t2[0]), MathUtils.Lerp.lerp(alpha, t1v1, t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.lerp(alpha, t1v0, t2v0), MathUtils.Lerp.lerp(alpha, t1v1, t2v1));
			
			return res;
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.lerp(alpha, t1.v1(), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1.v1(), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.v0(), t2[0]), MathUtils.Lerp.lerp(alpha, t1.v1(), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.v0(), t2v0), MathUtils.Lerp.lerp(alpha, t1.v1(), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.lerp(alpha, t1.getAt(1), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1[0], t2.v0()), MathUtils.Lerp.lerp(alpha, t1[1], t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1[1], t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1[0], t2[0]), MathUtils.Lerp.lerp(alpha, t1[1], t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1[0], t2v0), MathUtils.Lerp.lerp(alpha, t1[1], t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1v0, t2.v0()), MathUtils.Lerp.lerp(alpha, t1v1, t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.lerp(alpha, t1v1, t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1v0, t2[0]), MathUtils.Lerp.lerp(alpha, t1v1, t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.lerp(alpha, t1v0, t2v0), MathUtils.Lerp.lerp(alpha, t1v1, t2v1));
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2.v0());
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2.getAt(0));
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2[0]);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2v0);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2v1);
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2.v0());
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2.getAt(0));
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2[0]);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2v0);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2v1);
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1[0], t2.v0());
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1[1], t2.v1());
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1[0], t2.getAt(0));
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1[1], t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1[0], t2[0]);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1[1], t2[1]);
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1[0], t2v0);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1[1], t2v1);
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1v0, t2.v0());
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1v1, t2.v1());
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1v0, t2.getAt(0));
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1v1, t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1v0, t2[0]);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1v1, t2[1]);
			
			return res;
		}
		
		@Override
		public float[] step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.step(alpha, midpoint, t1v0, t2v0);
			res[1] = MathUtils.Lerp.step(alpha, midpoint, t1v1, t2v1);
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2v0), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2v0), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2v0), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2v0), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2v1));
			
			return res;
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.v0(), t2v0), MathUtils.Lerp.step(alpha, midpoint, t1.v1(), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1.getAt(0), t2v0), MathUtils.Lerp.step(alpha, midpoint, t1.getAt(1), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1[0], t2v0), MathUtils.Lerp.step(alpha, midpoint, t1[1], t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2.v0()), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2.getAt(0)), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2[0]), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.step(alpha, midpoint, t1v0, t2v0), MathUtils.Lerp.step(alpha, midpoint, t1v1, t2v1));
		}
		
		@Override
		public float[] smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2.v0());
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2.getAt(0));
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2[0]);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2v0);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2v1);
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2.v0());
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2.getAt(0));
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2[0]);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2v0);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2v1);
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1[0], t2.v0());
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1[1], t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1[0], t2.getAt(0));
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1[1], t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1[0], t2[0]);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1[1], t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1[0], t2v0);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1[1], t2v1);
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1v0, t2.v0());
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1v1, t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1v0, t2.getAt(0));
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1v1, t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1v0, t2[0]);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1v1, t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smoothstep(alpha, t1v0, t2v0);
			res[1] = MathUtils.Lerp.smoothstep(alpha, t1v1, t2v1);
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2[0]), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2v0), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1[0], t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1[1], t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1[1], t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1[0], t2[0]), MathUtils.Lerp.smoothstep(alpha, t1[1], t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1[0], t2v0), MathUtils.Lerp.smoothstep(alpha, t1[1], t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1v0, t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1v1, t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1v1, t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1v0, t2[0]), MathUtils.Lerp.smoothstep(alpha, t1v1, t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smoothstep(alpha, t1v0, t2v0), MathUtils.Lerp.smoothstep(alpha, t1v1, t2v1));
			
			return res;
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2[0]), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.v0(), t2v0), MathUtils.Lerp.smoothstep(alpha, t1.v1(), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.smoothstep(alpha, t1.getAt(1), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1[0], t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1[1], t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1[1], t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1[0], t2[0]), MathUtils.Lerp.smoothstep(alpha, t1[1], t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1[0], t2v0), MathUtils.Lerp.smoothstep(alpha, t1[1], t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1v0, t2.v0()), MathUtils.Lerp.smoothstep(alpha, t1v1, t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.smoothstep(alpha, t1v1, t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1v0, t2[0]), MathUtils.Lerp.smoothstep(alpha, t1v1, t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smoothstep(alpha, t1v0, t2v0), MathUtils.Lerp.smoothstep(alpha, t1v1, t2v1));
		}
		
		@Override
		public float[] smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2.v0());
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2.getAt(0));
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2[0]);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2v0);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2v1);
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2.v0());
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2.getAt(0));
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2[0]);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2v0);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2v1);
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1[0], t2.v0());
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1[1], t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1[0], t2.getAt(0));
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1[1], t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1[0], t2[0]);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1[1], t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1[0], t2v0);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1[1], t2v1);
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1v0, t2.v0());
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1v1, t2.v1());
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1v0, t2.getAt(0));
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1v1, t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1v0, t2[0]);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1v1, t2[1]);
			
			return res;
		}
		
		@Override
		public float[] smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.smootherstep(alpha, t1v0, t2v0);
			res[1] = MathUtils.Lerp.smootherstep(alpha, t1v1, t2v1);
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2[0]), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2v0), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1[0], t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1[1], t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1[1], t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1[0], t2[0]), MathUtils.Lerp.smootherstep(alpha, t1[1], t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1[0], t2v0), MathUtils.Lerp.smootherstep(alpha, t1[1], t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1v0, t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1v1, t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1v1, t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1v0, t2[0]), MathUtils.Lerp.smootherstep(alpha, t1v1, t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.smootherstep(alpha, t1v0, t2v0), MathUtils.Lerp.smootherstep(alpha, t1v1, t2v1));
			
			return res;
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2[0]), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.v0(), t2v0), MathUtils.Lerp.smootherstep(alpha, t1.v1(), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.smootherstep(alpha, t1.getAt(1), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1[0], t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1[1], t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1[1], t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1[0], t2[0]), MathUtils.Lerp.smootherstep(alpha, t1[1], t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1[0], t2v0), MathUtils.Lerp.smootherstep(alpha, t1[1], t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1v0, t2.v0()), MathUtils.Lerp.smootherstep(alpha, t1v1, t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.smootherstep(alpha, t1v1, t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1v0, t2[0]), MathUtils.Lerp.smootherstep(alpha, t1v1, t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.smootherstep(alpha, t1v0, t2v0), MathUtils.Lerp.smootherstep(alpha, t1v1, t2v1));
		}
		
		@Override
		public float[] intLerp(double alpha, ITup2RF t, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t.v0());
			res[1] = MathUtils.Lerp.intLerp(alpha, t.v1());
			
			return res;
		}

		@Override
		public float[] intLerp(double alpha, ITupRF t, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t.getAt(0));
			res[1] = MathUtils.Lerp.intLerp(alpha, t.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float[] t, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t[0]);
			res[1] = MathUtils.Lerp.intLerp(alpha, t[1]);
			
			return res;
		}

		@Override
		public float[] intLerp(double alpha, float tv0, float tv1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, tv0);
			res[1] = MathUtils.Lerp.intLerp(alpha, tv1);
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t.v0()), MathUtils.Lerp.intLerp(alpha, t.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t.getAt(0)), MathUtils.Lerp.intLerp(alpha, t.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float[] t, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t[0]), MathUtils.Lerp.intLerp(alpha, t[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float tv0, float tv1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, tv0), MathUtils.Lerp.intLerp(alpha, tv1));
			
			return res;
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t.v0()), MathUtils.Lerp.intLerp(alpha, t.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t.getAt(0)), MathUtils.Lerp.intLerp(alpha, t.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t[0]), MathUtils.Lerp.intLerp(alpha, t[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float tv0, float tv1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, tv0), MathUtils.Lerp.intLerp(alpha, tv1));
		}
		
		@Override
		public float[] intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.v0(), t2.v0());
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.v1(), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.v0(), t2.getAt(0));
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.v1(), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.v0(), t2[0]);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.v1(), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.v0(), t2v0);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.v1(), t2v1);
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2.v0());
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2.v1());
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2.getAt(0));
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2[0]);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2[1]);
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2v0);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2v1);
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1[0], t2.v0());
			res[1] = MathUtils.Lerp.intLerp(alpha, t1[1], t2.v1());
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1[0], t2.getAt(0));
			res[1] = MathUtils.Lerp.intLerp(alpha, t1[1], t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float[] t1, float[] t2,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1[0], t2[0]);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1[1], t2[1]);
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float[] t1, float t2v0, float t2v1,  @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1[0], t2v0);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1[1], t2v1);
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1v0, t2.v0());
			res[1] = MathUtils.Lerp.intLerp(alpha, t1v1, t2.v1());
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1v0, t2.getAt(0));
			res[1] = MathUtils.Lerp.intLerp(alpha, t1v1, t2.getAt(1));
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1v0, t2[0]);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1v1, t2[1]);
			
			return res;
		}
		
		@Override
		public float[] intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res)
		{
			res[0] = MathUtils.Lerp.intLerp(alpha, t1v0, t2v0);
			res[1] = MathUtils.Lerp.intLerp(alpha, t1v1, t2v1);
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2[0]), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2v0), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1[0], t2.v0()), MathUtils.Lerp.intLerp(alpha, t1[1], t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1[1], t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1[0], t2[0]), MathUtils.Lerp.intLerp(alpha, t1[1], t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1[0], t2v0), MathUtils.Lerp.intLerp(alpha, t1[1], t2v1));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1v0, t2.v0()), MathUtils.Lerp.intLerp(alpha, t1v1, t2.v1()));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1v1, t2.getAt(1)));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1v0, t2[0]), MathUtils.Lerp.intLerp(alpha, t1v1, t2[1]));
			
			return res;
		}
		
		@Override
		public <T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res)
		{
			res.set(MathUtils.Lerp.intLerp(alpha, t1v0, t2v0), MathUtils.Lerp.intLerp(alpha, t1v1, t2v1));
			
			return res;
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2.v0()), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2[0]), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.v0(), t2v0), MathUtils.Lerp.intLerp(alpha, t1.v1(), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2.v0()), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2[0]), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1.getAt(0), t2v0), MathUtils.Lerp.intLerp(alpha, t1.getAt(1), t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1[0], t2.v0()), MathUtils.Lerp.intLerp(alpha, t1[1], t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1[0], t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1[1], t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1[0], t2[0]), MathUtils.Lerp.intLerp(alpha, t1[1], t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1[0], t2v0), MathUtils.Lerp.intLerp(alpha, t1[1], t2v1));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1v0, t2.v0()), MathUtils.Lerp.intLerp(alpha, t1v1, t2.v1()));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1v0, t2.getAt(0)), MathUtils.Lerp.intLerp(alpha, t1v1, t2.getAt(1)));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1v0, t2[0]), MathUtils.Lerp.intLerp(alpha, t1v1, t2[1]));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		public <T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype)
		{
			return (T) prototype.createNew(MathUtils.Lerp.intLerp(alpha, t1v0, t2v0), MathUtils.Lerp.intLerp(alpha, t1v1, t2v1));
		}
	}
}
