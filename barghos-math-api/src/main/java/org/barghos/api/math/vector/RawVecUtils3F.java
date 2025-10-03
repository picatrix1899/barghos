package org.barghos.api.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.RawTupUtils3F;

/**
 * This class provides vector operations for two dimensions.
 */
public final class RawVecUtils3F
{
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

		float tv2 = t[2];

		if (tv2 < value)
		{
			value = tv2;
			index = 2;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF min(float tv0, float tv1, float tv2, @ExtractionParam IndexValuePairF res)
	{
		float value = tv0;
		int index = 0;

		if (tv1 < value)
		{
			value = tv1;
			index = 1;
		}

		if (tv2 < value)
		{
			value = tv2;
			index = 2;
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

		float tv2 = t[2];

		if (tv2 > value)
		{
			value = tv2;
			index = 2;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF max(float tv0, float tv1, float tv2, @ExtractionParam IndexValuePairF res)
	{
		float value = tv0;
		int index = 0;

		if (tv1 > value)
		{
			value = tv1;
			index = 1;
		}

		if (tv2 > value)
		{
			value = tv2;
			index = 2;
		}

		res.set(value, index);

		return res;
	}

	public static float[] minComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2[0]);
		res[1] = Math.min(t1[1], t2[1]);
		res[2] = Math.min(t1[2], t2[2]);

		return res;
	}

	public static float[] minComponents(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2v0);
		res[1] = Math.min(t1[1], t2v1);
		res[2] = Math.min(t1[2], t2v2);

		return res;
	}

	public static float[] minComponents(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2[0]);
		res[1] = Math.min(t1v1, t2[1]);
		res[2] = Math.min(t1v2, t2[2]);

		return res;
	}

	public static float[] minComponents(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1v0, t2v0);
		res[1] = Math.min(t1v1, t2v1);
		res[2] = Math.min(t1v2, t2v2);

		return res;
	}

	public static float[] maxComponents(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2[0]);
		res[1] = Math.max(t1[1], t2[1]);
		res[2] = Math.max(t1[2], t2[2]);

		return res;
	}

	public static float[] maxComponents(float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2v0);
		res[1] = Math.max(t1[1], t2v1);
		res[2] = Math.max(t1[2], t2v2);

		return res;
	}

	public static float[] maxComponents(float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2[0]);
		res[1] = Math.max(t1v1, t2[1]);
		res[2] = Math.max(t1v2, t2[2]);

		return res;
	}

	public static float[] maxComponents(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1v0, t2v0);
		res[1] = Math.max(t1v1, t2v1);
		res[2] = Math.max(t1v2, t2v2);

		return res;
	}

	public static float[] swizzle(float[] t, int[] indices, float[] res)
	{
		res[0] = t[indices[0]];
		res[1] = t[indices[1]];
		res[2] = t[indices[2]];

		return res;
	}

	public static float[] swizzle(float tv0, float tv1, float tv2, int[] indices, float[] res)
	{
		float v0 = switch (indices[0]) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (indices[1]) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};

		float v2 = switch (indices[2]) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;
		res[2] = v2;

		return res;
	}

	public static float[] swizzle(float[] t, int index0, int index1, int index2, float[] res)
	{
		res[0] = t[index0];
		res[1] = t[index1];
		res[2] = t[index2];

		return res;
	}

	public static float[] swizzle(float tv0, float tv1, float tv2, int index0, int index1, int index2, float[] res)
	{
		float v0 = switch (index0) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};

		float v1 = switch (index1) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};

		float v2 = switch (index2) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};

		res[0] = v0;
		res[1] = v1;
		res[2] = v2;

		return res;
	}

	public static float[] swap(float[] t, int indexA, int indexB, float[] res)
	{
		float tv0 = t[0];
		float tv1 = t[1];
		float tv2 = t[2];
		
		if(indexA == indexB)
		{
			res[0] = tv0;
			res[1] = tv1;
			res[2] = tv2;
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		float rv2 = tv2;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		case 2: rv2 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		case 2: rv2 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		
		return res;
	}

	public static float[] swap(float tv0, float tv1, float tv2, int indexA, int indexB, float[] res)
	{
		if(indexA == indexB)
		{
			res[0] = tv0;
			res[1] = tv1;
			res[2] = tv2;
			
			return res;
		}
		
		float v0 = switch(indexA) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float v1 = switch(indexB) {
		case 0 -> tv0;
		case 1 -> tv1;
		case 2 -> tv2;
		default -> throw new IndexOutOfBoundsException();
		};
		
		float rv0 = tv0;
		float rv1 = tv1;
		float rv2 = tv2;
		
		switch(indexB) {
		case 0: rv0 = v0; break;
		case 1: rv1 = v0; break;
		case 2: rv2 = v0; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
		case 0: rv0 = v1; break;
		case 1: rv1 = v1; break;
		case 2: rv2 = v1; break;
		default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		
		return res;
	}

	public static float[] swapV0V1(float[] t, float[] res)
	{
		res[0] = t[1];
		res[1] = t[0];
		res[2] = t[2];

		return res;
	}

	public static float[] swapV0V1(float tv0, float tv1, float tv2, float[] res)
	{
		res[0] = tv1;
		res[1] = tv0;
		res[2] = tv2;

		return res;
	}

	public static float[] swapV0V2(float[] t, float[] res)
	{
		res[0] = t[2];
		res[1] = t[1];
		res[2] = t[0];

		return res;
	}

	public static float[] swapV0V2(float tv0, float tv1, float tv2, float[] res)
	{
		res[0] = tv2;
		res[1] = tv1;
		res[2] = tv0;

		return res;
	}

	public static float[] swapV1V2(float[] t, float[] res)
	{
		res[0] = t[0];
		res[1] = t[2];
		res[2] = t[1];

		return res;
	}

	public static float[] swapV1V2(float tv0, float tv1, float tv2, float[] res)
	{
		res[0] = tv0;
		res[1] = tv2;
		res[2] = tv1;

		return res;
	}

	public static float[] lerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1[0], t2[0]);
		res[1] = MathUtils.lerp(alpha, t1[1], t2[1]);
		res[2] = MathUtils.lerp(alpha, t1[2], t2[2]);

		return res;
	}

	public static float[] lerp(double alpha, float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1[0], t2v0);
		res[1] = MathUtils.lerp(alpha, t1[1], t2v1);
		res[2] = MathUtils.lerp(alpha, t1[2], t2v2);

		return res;
	}

	public static float[] lerp(double alpha, float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1v0, t2[0]);
		res[1] = MathUtils.lerp(alpha, t1v1, t2[1]);
		res[2] = MathUtils.lerp(alpha, t1v2, t2[2]);

		return res;
	}

	public static float[] lerp(double alpha, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.lerp(alpha, t1v0, t2v0);
		res[1] = MathUtils.lerp(alpha, t1v1, t2v1);
		res[2] = MathUtils.lerp(alpha, t1v2, t2v2);

		return res;
	}
	
	public static float[] step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1[0], t2[0]);
		res[1] = MathUtils.step(alpha, midpoint, t1[1], t2[1]);
		res[2] = MathUtils.step(alpha, midpoint, t1[2], t2[2]);

		return res;
	}

	public static float[] step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1[0], t2v0);
		res[1] = MathUtils.step(alpha, midpoint, t1[1], t2v1);
		res[2] = MathUtils.step(alpha, midpoint, t1[2], t2v2);

		return res;
	}
	
	public static float[] step(double alpha, double midpoint, float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1v0, t2[0]);
		res[1] = MathUtils.step(alpha, midpoint, t1v1, t2[1]);
		res[2] = MathUtils.step(alpha, midpoint, t1v2, t2[2]);

		return res;
	}

	public static float[] step(double alpha, double midpoint, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.step(alpha, midpoint, t1v0, t2v0);
		res[1] = MathUtils.step(alpha, midpoint, t1v1, t2v1);
		res[2] = MathUtils.step(alpha, midpoint, t1v2, t2v2);

		return res;
	}
	
	public static float[] smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1[0], t2[0]);
		res[1] = MathUtils.smoothstep(alpha, t1[1], t2[1]);
		res[2] = MathUtils.smoothstep(alpha, t1[2], t2[2]);

		return res;
	}

	public static float[] smoothstep(double alpha, float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1[0], t2v0);
		res[1] = MathUtils.smoothstep(alpha, t1[1], t2v1);
		res[2] = MathUtils.smoothstep(alpha, t1[2], t2v2);

		return res;
	}
	
	public static float[] smoothstep(double alpha, float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1v0, t2[0]);
		res[1] = MathUtils.smoothstep(alpha, t1v1, t2[1]);
		res[2] = MathUtils.smoothstep(alpha, t1v2, t2[2]);

		return res;
	}

	public static float[] smoothstep(double alpha, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smoothstep(alpha, t1v0, t2v0);
		res[1] = MathUtils.smoothstep(alpha, t1v1, t2v1);
		res[2] = MathUtils.smoothstep(alpha, t1v2, t2v2);

		return res;
	}
	
	public static float[] smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1[0], t2[0]);
		res[1] = MathUtils.smootherstep(alpha, t1[1], t2[1]);
		res[2] = MathUtils.smootherstep(alpha, t1[2], t2[2]);

		return res;
	}

	public static float[] smootherstep(double alpha, float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1[0], t2v0);
		res[1] = MathUtils.smootherstep(alpha, t1[1], t2v1);
		res[2] = MathUtils.smootherstep(alpha, t1[2], t2v2);

		return res;
	}
	
	public static float[] smootherstep(double alpha, float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1v0, t2[0]);
		res[1] = MathUtils.smootherstep(alpha, t1v1, t2[1]);
		res[2] = MathUtils.smootherstep(alpha, t1v2, t2[2]);

		return res;
	}

	public static float[] smootherstep(double alpha, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.smootherstep(alpha, t1v0, t2v0);
		res[1] = MathUtils.smootherstep(alpha, t1v1, t2v1);
		res[2] = MathUtils.smootherstep(alpha, t1v2, t2v2);

		return res;
	}
	
	public static float[] intLerp(double alpha, float[] t, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t[0]);
		res[1] = MathUtils.intLerp(alpha, t[1]);
		res[2] = MathUtils.intLerp(alpha, t[2]);

		return res;
	}

	public static float[] intLerp(double alpha, float tv0, float tv1, float tv2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, tv0);
		res[1] = MathUtils.intLerp(alpha, tv1);
		res[2] = MathUtils.intLerp(alpha, tv2);

		return res;
	}

	public static float[] intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1[0], t2[0]);
		res[1] = MathUtils.intLerp(alpha, t1[1], t2[1]);
		res[2] = MathUtils.intLerp(alpha, t1[2], t2[2]);

		return res;
	}

	public static float[] intLerp(double alpha, float[] t1, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1[0], t2v0);
		res[1] = MathUtils.intLerp(alpha, t1[1], t2v1);
		res[2] = MathUtils.intLerp(alpha, t1[2], t2v2);

		return res;
	}
	
	public static float[] intLerp(double alpha, float t1v0, float t1v1, float t1v2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1v0, t2[0]);
		res[1] = MathUtils.intLerp(alpha, t1v1, t2[1]);
		res[2] = MathUtils.intLerp(alpha, t1v2, t2[2]);

		return res;
	}

	public static float[] intLerp(double alpha, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.intLerp(alpha, t1v0, t2v0);
		res[1] = MathUtils.intLerp(alpha, t1v1, t2v1);
		res[2] = MathUtils.intLerp(alpha, t1v2, t2v2);

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

	public static float[] signum(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signum(v[0]);
		res[1] = MathUtils.signum(v[1]);
		res[2] = MathUtils.signum(v[2]);
		
		return res;
	}

	public static float[] signum(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signum(v0);
		res[1] = MathUtils.signum(v1);
		res[2] = MathUtils.signum(v2);
		
		return res;
	}

	public static float[] signumEM(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM(tolerance, v[0]);
		res[1] = MathUtils.signumEM(tolerance, v[1]);
		res[2] = MathUtils.signumEM(tolerance, v[2]);
		
		return res;
	}

	public static float[] signumEM(float tolerance, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM(tolerance, v0);
		res[1] = MathUtils.signumEM(tolerance, v1);
		res[2] = MathUtils.signumEM(tolerance, v2);
		
		return res;
	}

	public static float[] signumEM4(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM4(v[0]);
		res[1] = MathUtils.signumEM4(v[1]);
		res[2] = MathUtils.signumEM4(v[2]);
		
		return res;
	}

	public static float[] signumEM4(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM4(v0);
		res[1] = MathUtils.signumEM4(v1);
		res[2] = MathUtils.signumEM4(v2);
		
		return res;
	}

	public static float[] signumEM6(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM6(v[0]);
		res[1] = MathUtils.signumEM6(v[1]);
		res[2] = MathUtils.signumEM6(v[2]);
		
		return res;
	}

	public static float[] signumEM6(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM6(v0);
		res[1] = MathUtils.signumEM6(v1);
		res[2] = MathUtils.signumEM6(v2);
		
		return res;
	}

	public static float[] signumEM8(float[] v, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM8(v[0]);
		res[1] = MathUtils.signumEM8(v[1]);
		res[2] = MathUtils.signumEM8(v[2]);
		
		return res;
	}

	public static float[] signumEM8(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEM8(v0);
		res[1] = MathUtils.signumEM8(v1);
		res[2] = MathUtils.signumEM8(v2);
		
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

	public static float lenRc(float[] v)
	{
		return MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}

	public static float lenRc(float v0, float v1, float v2)
	{
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float len(float[] v)
	{
		if(RawTupUtils3F.isZero(v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}

	public static float len(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenEM(float tolerance, float[] v)
	{
		if(RawTupUtils3F.isZeroEM(tolerance, v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}

	public static float lenEM(float tolerance, float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenEM4(float[] v)
	{
		if(RawTupUtils3F.isZeroEM4(v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}

	public static float lenEM4(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenEM6(float[] v)
	{
		if(RawTupUtils3F.isZeroEM6(v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}

	public static float lenEM6(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenEM8(float[] v)
	{
		if(RawTupUtils3F.isZeroEM8(v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}

	public static float lenEM8(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenSq(float[] v)
	{
		if(RawTupUtils3F.isZero(v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}

	public static float lenSq(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqEM(float tolerance, float[] v)
	{
		if(RawTupUtils3F.isZeroEM(tolerance, v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}

	public static float lenSqEM(float tolerance, float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqEM4(float[] v)
	{
		if(RawTupUtils3F.isZeroEM4(v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}

	public static float lenSqEM4(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqEM6(float[] v)
	{
		if(RawTupUtils3F.isZeroEM6(v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}

	public static float lenSqEM6(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqEM8(float[] v)
	{
		if(RawTupUtils3F.isZeroEM8(v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}

	public static float lenSqEM8(float v0, float v1, float v2)
	{
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float[] nrm(float[] v, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZero(v))
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
		if (RawTupUtils3F.isZero(v0, v1, v2))
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

	public static float[] nrmEM(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM(tolerance, v))
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

	public static float[] nrmEM(float tolerance, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2))
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
	
	public static float[] nrmEM4(float[] v, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM4(v))
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

	public static float[] nrmEM4(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM4(v0, v1, v2))
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

	public static float[] nrmEM6(float[] v, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM6(v))
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

	public static float[] nrmEM6(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM6(v0, v1, v2))
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
	
	public static float[] nrmEM8(float[] v, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM8(v))
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

	public static float[] nrmEM8(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		if (RawTupUtils3F.isZeroEM8(v0, v1, v2))
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

	public static float dot(float[] t1, float[] t2)
	{
		return t1[0] * t2[0] + t1[1] * t2[1] + t1[2] * t2[2];
	}

	public static float dot(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		return t1[0] * t2v0 + t1[1] * t2v1 + t1[2] * t2v2;
	}
	
	public static float dot(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		return t1v0 * t2[0] + t1v1 * t2[1] + t1v2 * t2[2];
	}

	public static float dot(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		return t1v0 * t2v0 + t1v1 * t2v1 + t1v2 * t2v2;
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

	public static float lenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenTo(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenToEM(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM(float tolerance, float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenToEM4(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM4(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenToEM6(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM6(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenToEM8(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM8(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenSqTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqTo(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float lenSqTo(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZero(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM(float tolerance, float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM(tolerance, v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float lenSqToEM4(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM4(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float lenSqToEM4(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM4(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM4(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM6(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM6(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float lenSqToEM6(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM6(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM6(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM8(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM8(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float lenSqToEM8(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}

	public static float lenSqToEM8(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		
		if(RawTupUtils3F.isZeroEM8(v0, v1, v2)) return 0.0f;
		
		return v0 * v0 + v1 * v1 + v2 * v2;
	}
	
	public static float lenRcTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		float v2 = t2[2] - t1[2];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenRcTo(float[] t1, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		float v2 = t2v2 - t1[2];
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}
	
	public static float lenRcTo(float t1v0, float t1v1, float t1v2, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		float v2 = t2[2] - t1v2;
		
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
	}

	public static float lenRcTo(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		float v2 = t2v2 - t1v2;
		 
		return MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2);
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
}
