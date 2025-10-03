package org.barghos.api.math.vector;

import org.barghos.annotation.ExtractionParam;

import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.RawTupUtils2F;

/**
 * This class provides vector operations for two dimensions.
 */
public class RawVecUtils2F
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
	
	public static IndexValuePairF minAligned(int tOffset, float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[tOffset];
		int index = tOffset;

		float tv1 = t[tOffset + 1];

		if (tv1 < value)
		{
			value = tv1;
			index = tOffset + 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF minUnaligned(int[] tIndices, float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[tIndices[0]];
		int index = tIndices[0];

		float tv1 = t[tIndices[1]];

		if (tv1 < value)
		{
			value = tv1;
			index = tIndices[1];
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF minUnaligned(int tV0Index, int tv1Index, float[] t, @ExtractionParam IndexValuePairF res)
	{
		float value = t[tV0Index];
		int index = tV0Index;

		float tv1 = t[tv1Index];

		if (tv1 < value)
		{
			value = tv1;
			index = tv1Index;
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
	
	public static float lenRc(float[] v)
	{
		return MathUtils.invSqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float lenRc(float v0, float v1)
	{
		return MathUtils.invSqrt(v0 * v0 + v1 * v1);
	}
	
	public static float len(float[] v)
	{
		if(RawTupUtils2F.isZero(v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float len(float v0, float v1)
	{
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM(float tolerance, float[] v)
	{
		if(RawTupUtils2F.isZeroEM(tolerance, v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float lenEM(float tolerance, float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM4(float[] v)
	{
		if(RawTupUtils2F.isZeroEM4(v)) return 0.0f;

		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float lenEM4(float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM6(float[] v)
	{
		if(RawTupUtils2F.isZeroEM6(v)) return 0.0f;

		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float lenEM6(float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenEM8(float[] v)
	{
		if(RawTupUtils2F.isZeroEM8(v)) return 0.0f;
		
		return MathUtils.sqrt(v[0] * v[0] + v[1] * v[1]);
	}

	public static float lenEM8(float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenSq(float[] v)
	{
		return v[0] * v[0] + v[1] * v[1];
	}

	public static float lenSq(float v0, float v1)
	{
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM(float tolerance, float[] v)
	{
		if(RawTupUtils2F.isZeroEM(tolerance, v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1];
	}

	public static float lenSqEM(float tolerance, float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM4(float[] v)
	{
		if(RawTupUtils2F.isZeroEM4(v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1];
	}

	public static float lenSqEM4(float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM6(float[] v)
	{
		if(RawTupUtils2F.isZeroEM6(v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1];
	}

	public static float lenSqEM6(float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqEM8(float[] v)
	{
		if(RawTupUtils2F.isZeroEM8(v)) return 0.0f;
		
		return v[0] * v[0] + v[1] * v[1];
	}

	public static float lenSqEM8(float v0, float v1)
	{
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float[] nrm(float[] v, @ExtractionParam float[] res)
	{
		if (RawTupUtils2F.isZero(v))
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
		if (RawTupUtils2F.isZero(v0, v1))
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
		if (RawTupUtils2F.isZeroEM(tolerance, v))
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
		if (RawTupUtils2F.isZeroEM(tolerance, v0, v1))
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
		if (RawTupUtils2F.isZeroEM4(v))
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
		if (RawTupUtils2F.isZeroEM4(v0, v1))
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
		if (RawTupUtils2F.isZeroEM6(v))
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
		if (RawTupUtils2F.isZeroEM6(v0, v1))
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
		if (RawTupUtils2F.isZeroEM8(v))
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
		if (RawTupUtils2F.isZeroEM8(v0, v1))
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
	
	public static float dot(float[] t1, float[] t2)
	{
		return t1[0] * t2[0] + t1[1] * t2[1];
	}

	public static float dot(float[] t1, float t2v0, float t2v1)
	{
		return t1[0] * t2v0 + t1[1] * t2v1;
	}
	
	public static float dot(float t1v0, float t1v1, float[] t2)
	{
		return t1v0 * t2[0] + t1v1 * t2[1];
	}

	public static float dot(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		return t1v0 * t2v0 + t1v1 * t2v1;
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
	
	public static float lenTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;

		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;

		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM4(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM6(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenToEM8(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return MathUtils.sqrt(v0 * v0 + v1 * v1);
	}
	
	public static float lenSqTo(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqTo(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqTo(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZero(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM(float tolerance, float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM(tolerance, v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM4(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM4(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM4(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM4(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM6(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM6(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM6(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM6(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM8(float[] t1, float[] t2)
	{
		float v0 = t2[0] - t1[0];
		float v1 = t2[1] - t1[1];
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(float[] t1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1[0];
		float v1 = t2v1 - t1[1];
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}
	
	public static float lenSqToEM8(float t1v0, float t1v1, float[] t2)
	{
		float v0 = t2[0] - t1v0;
		float v1 = t2[1] - t1v1;
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
	}

	public static float lenSqToEM8(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		float v0 = t2v0 - t1v0;
		float v1 = t2v1 - t1v1;
		
		if(RawTupUtils2F.isZeroEM8(v0, v1)) return 0.0f;
		
		return v0 * v0 + v1 * v1;
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
