package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;
import org.barghos.math.vector.floats.CompareVecOps2F;

public final class VecOpsI2F
{
	private VecOpsI2F() { }
	
	public static float squaredLength(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps(float tolerance, IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps4(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps6(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps8(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float length(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps(float tolerance, IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps4(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps6(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps8(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float manhattanLength(IVec2RF v1)
	{
		return Math.abs(v1.x()) + Math.abs(v1.y());
	}
	
	public static float manhattanLengthEps(float tolerance, IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps4(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps6(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps8(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float chebyshevLength(IVec2RF v1)
	{
		return Math.max(Math.abs(v1.x()), Math.abs(v1.y()));
	}
	
	public static float chebyshevLengthEps(float tolerance, IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps4(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps6(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps8(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float reciprocalSquaredLength(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		return 1.0f / (Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalLength(IVec2RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		return MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalManhattanLength(IVec2RF v1)
	{
		return 1.0f / (Math.abs(v1.x()) + Math.abs(v1.y()));
	}
	
	public static float reciprocalChebyshevLength(IVec2RF v1)
	{
		return 1.0f / Math.max(Math.abs(v1.x()), Math.abs(v1.y()));
	}
	
	public static float dot(IVec2RF v1, IVec2RF v2)
	{
		return Math.fma(v1.x(), v2.x(), v1.y() * v2.y());
	}
	
	public static float dot(IVec2RF v1, float[] v2)
	{
		return Math.fma(v1.x(), v2[0], v1.y() * v2[1]);
	}
	
	public static float dot(IVec2RF v1, float v2X, float v2Y)
	{
		return Math.fma(v1.x(), v2X, v1.y() * v2Y);
	}
	
	public static float dot(float[] v1, IVec2RF v2)
	{
		return Math.fma(v1[0], v2.x(), v1[1] * v2.y());
	}
	
	public static float dot(float v1X, float v1Y, IVec2RF v2)
	{
		return Math.fma(v1X, v2.x(), v1Y * v2.y());
	}
	
	public static float[] project(IVec2RF v1, IVec2RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] project(IVec2RF v1, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] project(IVec2RF v1, float tX, float tY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] project(float[] v1, IVec2RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v1[0], tX, v1[1] * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, IVec2RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v1X, tX, v1Y * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v, IVec2RF t)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		
		return v;
	}
	
	public static <T extends IVec2WF> T project(IVec2RF v1, IVec2RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);

		res.set(
			tX * dot,
			tY * dot
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T project(IVec2RF v1, float[] t, @ExtractionParam T res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);

		res.set(
			tX * dot,
			tY * dot
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T project(IVec2RF v1, float tX, float tY, @ExtractionParam T res)
	{
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);

		res.set(
			tX * dot,
			tY * dot
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T project(float[] v1, IVec2RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v1[0], tX, v1[1] * tY);

		res.set(
			tX * dot,
			tY * dot
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T project(float v1X, float v1Y, IVec2RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v1X, tX, v1Y * tY);

		res.set(
			tX * dot,
			tY * dot
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T projectAssign(T v1, IVec2RF t)
	{
		float tX = t.x();
		float tY = t.y();
		
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);

		v1.set(
			tX * dot,
			tY * dot
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T projectAssign(T v1, float[] t)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);

		v1.set(
			tX * dot,
			tY * dot
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T projectAssign(T v1, float tX, float tY)
	{
		float dot = Math.fma(v1.x(), tX, v1.y() * tY);

		v1.set(
			tX * dot,
			tY * dot
		);
		
		return v1;
	}
	
	public static float[] reflect(IVec2RF v1, IVec2RF n, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res[0] = Math.fma(nX, dot, v1X);
		res[1] = Math.fma(nY, dot, v1Y);
		
		return res;
	}
	
	public static float[] reflect(IVec2RF v1, float[] n, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res[0] = Math.fma(nX, dot, v1X);
		res[1] = Math.fma(nY, dot, v1Y);
		
		return res;
	}
	
	public static float[] reflect(IVec2RF v1, float nX, float nY, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res[0] = Math.fma(nX, dot, v1X);
		res[1] = Math.fma(nY, dot, v1Y);
		
		return res;
	}
	
	public static float[] reflect(float[] v1, IVec2RF n, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res[0] = Math.fma(nX, dot, v1X);
		res[1] = Math.fma(nY, dot, v1Y);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, IVec2RF n, @ExtractionParam float[] res)
	{
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res[0] = Math.fma(nX, dot, v1X);
		res[1] = Math.fma(nY, dot, v1Y);
		
		return res;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, IVec2RF n)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		v1[0] = Math.fma(nX, dot, v1X);
		v1[1] = Math.fma(nY, dot, v1Y);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T reflect(IVec2RF v1, IVec2RF n, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(IVec2RF v1, float[] n, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(IVec2RF v1, float nX, float nY, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(float[] v1, IVec2RF n, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(float[] v1, float[] n, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(float[] v1, float nX, float nY, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(float v1X, float v1Y, IVec2RF n, @ExtractionParam T res)
	{
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(float v1X, float v1Y, float[] n, @ExtractionParam T res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflect(float v1X, float v1Y, float nX, float nY, @ExtractionParam T res)
	{
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		res.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T reflectAssign(T v1, IVec2RF n)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float nX = n.x();
		float nY = n.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		v1.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T reflectAssign(T v1, float[] n)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		v1.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T reflectAssign(T v1, float nX, float nY)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float dot = -2 * Math.fma(v1X, nX, v1Y * nY);
		
		v1.set(
			Math.fma(nX, dot, v1X),
			Math.fma(nY, dot, v1Y)
		);
		
		return v1;
	}
	
	public static float[] normalize(IVec2RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalize(IVec2RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalize(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalize(float v1X, float v1Y, @ExtractionParam T res)
	{
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeAssign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			v1.set(0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps(float tolerance, IVec2RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps(float tolerance, IVec2RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps(float tolerance, float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps(float tolerance, float v1X, float v1Y, @ExtractionParam T res)
	{
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEpsAssign(float tolerance, @ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y))
		{
			v1.set(0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps4(IVec2RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps4(IVec2RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps4Assign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y))
		{
			v1.set(0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps6(IVec2RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps6(IVec2RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps6Assign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y))
		{
			v1.set(0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps8(IVec2RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps8(IVec2RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y))
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		res.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T normalizeEps8Assign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y))
		{
			v1.set(0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength
		);
		
		return v1;
	}
	
	public static float[] rotateRad(IVec2RF v1, float angle, @ExtractionParam float[] res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1.x();
		float v1Y = v1.y();

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotateRad(IVec2RF v1, float angle, @ExtractionParam T res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotateRad(float[] v1, float angle, @ExtractionParam T res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotateRad(float v1X, float v1Y, float angle, @ExtractionParam T res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		res.set(
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotateRadAssign(@ExtractionParam T v1, float angle)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		);
		
		return v1;
	}
	
	public static float[] rotateDeg(IVec2RF v1, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);
		
		float v1X = v1.x();
		float v1Y = v1.y();

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotateDeg(IVec2RF v1, float angle, @ExtractionParam T res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);
		
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotateDegAssign(@ExtractionParam T v1, float angle)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);
		
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		);
		
		return v1;
	}
	
	public static float[] rotate90CW(IVec2RF v1, @ExtractionParam float[] res)
	{
		float vY = -v1.x();
		
		res[0] = v1.y();
		res[1] = vY;
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotate90CW(IVec2RF v1, @ExtractionParam T res)
	{
		float vY = -v1.x();
		
		res.set(
			v1.y(),
			vY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotate90CWAssign(@ExtractionParam T v1)
	{
		float vY = -v1.x();
		
		v1.set(
			v1.y(),
			vY
		);
		
		return v1;
	}
	
	public static float[] rotate90CCW(IVec2RF v1, @ExtractionParam float[] res)
	{
		res[0] = -v1.y();
		res[1] = v1.x();
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotate90CCW(IVec2RF v1, @ExtractionParam T res)
	{
		res.set(
			-v1.y(),
			v1.x()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T rotate90CCWAssign(@ExtractionParam T v1)
	{
		v1.set(
			-v1.y(),
			v1.x()
		);
		
		return v1;
	}
	
	public static float angleBetweenRad(IVec2RF v1, IVec2RF v2)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v2X = v2.x();
		float v2Y = v2.y();

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad(IVec2RF v1, float[] v2)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad(IVec2RF v1, float v2X, float v2Y)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad(float[] v1, IVec2RF v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v2X = v2.x();
		float v2Y = v2.y();

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad(float v1X, float v1Y, IVec2RF v2)
	{
		float v2X = v2.x();
		float v2Y = v2.y();

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenDeg(IVec2RF v1, IVec2RF v2)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v2X = v2.x();
		float v2Y = v2.y();

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg(IVec2RF v1, float[] v2)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg(IVec2RF v1, float v2X, float v2Y)
	{
		float v1X = v1.x();
		float v1Y = v1.y();

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg(float[] v1, IVec2RF v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v2X = v2.x();
		float v2Y = v2.y();

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg(float v1X, float v1Y, IVec2RF v2)
	{
		float v2X = v2.x();
		float v2Y = v2.y();
		
		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float determinant(IVec2RF v1, IVec2RF v2)
	{
		return Math.fma(v1.x(), v2.y(), -v1.y() * v2.x());
	}
	
	public static float determinant(IVec2RF v1, float[] v2)
	{
		return Math.fma(v1.x(), v2[1], -v1.y() * v2[0]);
	}
	
	public static float determinant(IVec2RF v1, float v2X, float v2Y)
	{
		return Math.fma(v1.x(), v2Y, -v1.y() * v2X);
	}
	
	public static float determinant(float[] v1, IVec2RF v2)
	{
		return Math.fma(v1[0], v2.y(), -v1[1] * v2.x());
	}
	
	public static float determinant(float v1X, float v1Y, IVec2RF v2)
	{
		return Math.fma(v1X, v2.y(), -v1Y * v2.x());
	}
	
	public static float area(IVec2RF v1, IVec2RF v2)
	{
		return 0.5f * Math.abs(Math.fma(v1.x(), v2.y(), -v1.y() * v2.x()));
	}
	
	public static float area(IVec2RF v1, float[] v2)
	{
		return 0.5f * Math.abs(Math.fma(v1.x(), v2[1], -v1.y() * v2[0]));
	}
	
	public static float area(IVec2RF v1, float v2X, float v2Y)
	{
		return 0.5f * Math.abs(Math.fma(v1.x(), v2Y, -v1.y() * v2X));
	}
	
	public static float area(float[] v1, IVec2RF v2)
	{
		return 0.5f * Math.abs(Math.fma(v1[0], v2.y(), -v1[1] * v2.x()));
	}
	
	public static float area(float v1X, float v1Y, IVec2RF v2)
	{
		return 0.5f * Math.abs(Math.fma(v1X, v2.y(), -v1Y * v2.x()));
	}
	
	public static float parallelogramArea(IVec2RF v1, IVec2RF v2)
	{
		return Math.abs(Math.fma(v1.x(), v2.y(), -v1.y() * v2.x()));
	}
	
	public static float parallelogramArea(IVec2RF v1, float[] v2)
	{
		return Math.abs(Math.fma(v1.x(), v2[1], -v1.y() * v2[0]));
	}
	
	public static float parallelogramArea(IVec2RF v1, float v2X, float v2Y)
	{
		return Math.abs(Math.fma(v1.x(), v2Y, -v1.y() * v2X));
	}
	
	public static float parallelogramArea(float[] v1, IVec2RF v2)
	{
		return Math.abs(Math.fma(v1[0], v2.y(), -v1[1] * v2.x()));
	}
	
	public static float parallelogramArea(float v1X, float v1Y, IVec2RF v2)
	{
		return Math.abs(Math.fma(v1X, v2.y(), -v1Y * v2.x()));
	}
	
	public static float[] perpendicular(IVec2RF v1, @ExtractionParam float[] res)
	{
		float vY = v1.x();
		
		res[0] = -v1.y();
		res[1] = vY;
		
		return res;
	}
	
	public static <T extends IVec2WF> T perpendicular(IVec2RF v1, @ExtractionParam T res)
	{
		float vY = v1.x();
		
		res.set(
			-v1.y(),
			vY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T perpendicularAssign(@ExtractionParam T v1)
	{
		float vY = v1.x();
		
		v1.set(
			-v1.y(),
			vY
		);
		
		return v1;
	}
	
	public static float[] tripleProduct(IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3.x(), v1Y * v3.y());

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);

		res[0] = v2.x() * dotV1V3;
		res[1] = v2.y() * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3.x(), v1Y * v3.y());

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3.x(), v1Y * v3.y());

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, IVec2RF v2, IVec2RF v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());

		v1[0] = v2.x() * dotV1V3;
		v1[1] = v2.y() * dotV1V3;
				
		return v1;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, IVec2RF v2, float[] v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		v1[0] = v2.x() * dotV1V3;
		v1[1] = v2.y() * dotV1V3;
				
		return v1;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, IVec2RF v2, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		v1[0] = v2.x() * dotV1V3;
		v1[1] = v2.y() * dotV1V3;
				
		return v1;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, float[] v2, IVec2RF v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());

		v1[0] = v2[0] * dotV1V3;
		v1[1] = v2[1] * dotV1V3;
				
		return v1;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, float v2X, float v2Y, IVec2RF v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());

		v1[0] = v2X * dotV1V3;
		v1[1] = v2Y * dotV1V3;
				
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3.x(), v1[1] * v3.y());
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3.x(), v1Y * v3.y());
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);
		
		res.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3.x(), v1Y * v3.y());
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);
		
		res.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3.x(), v1Y * v3.y());
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProduct(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);
		
		res.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, IVec2RF v2, IVec2RF v3)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());
		
		v1.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, IVec2RF v2, float[] v3)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);
		
		v1.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, IVec2RF v2, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);
		
		v1.set(
			v2.x() * dotV1V3,
			v2.y() * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, float[] v2, IVec2RF v3)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());
		
		v1.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, float[] v2, float[] v3)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);
		
		v1.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, float[] v2, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);
		
		v1.set(
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, float v2X, float v2Y, IVec2RF v3)
	{
		float dotV1V3 = Math.fma(v1.x(), v3.x(), v1.y() * v3.y());
		
		v1.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, float v2X, float v2Y, float[] v3)
	{
		float dotV1V3 = Math.fma(v1.x(), v3[0], v1.y() * v3[1]);
		
		v1.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T tripleProductAssign(@ExtractionParam T v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1.x(), v3X, v1.y() * v3Y);
		
		v1.set(
			v2X * dotV1V3,
			v2Y * dotV1V3
		);
		
		return v1;
	}
	
	public static float[] shear(IVec2RF v1, IVec2RF shear, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res[0] = Math.fma(shear.x(), v1Y, v1X);
		res[1] = Math.fma(shear.y(), v1X, v1Y);
		
		return res;
	}
	
	public static float[] shear(IVec2RF v1, float[] shear, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res[0] = Math.fma(shear[0], v1Y, v1X);
		res[1] = Math.fma(shear[1], v1X, v1Y);
		
		return res;
	}
	
	public static float[] shear(IVec2RF v1, float shearX, float shearY, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res[0] = Math.fma(shearX, v1Y, v1X);
		res[1] = Math.fma(shearY, v1X, v1Y);
		
		return res;
	}
	
	public static float[] shear(float[] v1, IVec2RF shear, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = Math.fma(shear.x(), v1Y, v1X);
		res[1] = Math.fma(shear.y(), v1X, v1Y);
		
		return res;
	}
	
	public static float[] shear(float v1X, float v1Y, IVec2RF shear, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(shear.x(), v1Y, v1X);
		res[1] = Math.fma(shear.y(), v1X, v1Y);
		
		return res;
	}
	
	public static float[] shearAssign(@ExtractionParam float[] v1, IVec2RF shear)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(shear.x(), v1Y, v1X);
		v1[1] = Math.fma(shear.y(), v1X, v1Y);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T shear(IVec2RF v1, IVec2RF shear, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			Math.fma(shear.x(), v1Y, v1X),
			Math.fma(shear.y(), v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(IVec2RF v1, float[] shear, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			Math.fma(shear[0], v1Y, v1X),
			Math.fma(shear[1], v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(IVec2RF v1, float shearX, float shearY, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			Math.fma(shearX, v1Y, v1X),
			Math.fma(shearY, v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(float[] v1, IVec2RF shear, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			Math.fma(shear.x(), v1Y, v1X),
			Math.fma(shear.y(), v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(float[] v1, float[] shear, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			Math.fma(shear[0], v1Y, v1X),
			Math.fma(shear[1], v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(float[] v1, float shearX, float shearY, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			Math.fma(shearX, v1Y, v1X),
			Math.fma(shearY, v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(float v1X, float v1Y, IVec2RF shear, @ExtractionParam T res)
	{
		res.set(
			Math.fma(shear.x(), v1Y, v1X),
			Math.fma(shear.y(), v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(float v1X, float v1Y, float[] shear, @ExtractionParam T res)
	{
		res.set(
			Math.fma(shear[0], v1Y, v1X),
			Math.fma(shear[1], v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shear(float v1X, float v1Y, float shearX, float shearY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(shearX, v1Y, v1X),
			Math.fma(shearY, v1X, v1Y)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shearAssign(@ExtractionParam T v1, IVec2RF shear)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(shear.x(), v1Y, v1X),
			Math.fma(shear.y(), v1X, v1Y)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T shearAssign(@ExtractionParam T v1, float[] shear)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(shear[0], v1Y, v1X),
			Math.fma(shear[1], v1X, v1Y)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T shearAssign(@ExtractionParam T v1, float shearX, float shearY)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(shearX, v1Y, v1X),
			Math.fma(shearY, v1X, v1Y)
		);
		
		return v1;
	}
	
	public static float[] shearX(IVec2RF v1, float shear, @ExtractionParam float[] res)
	{
		float v1Y = v1.y();
		
		res[0] = Math.fma(shear, v1Y, v1.x());
		res[1] = v1Y;
		
		return res;
	}
	
	public static <T extends IVec2WF> T shearX(IVec2RF v1, float shear, @ExtractionParam T res)
	{
		float v1Y = v1.y();
		
		res.set(
			Math.fma(shear, v1Y, v1.x()),
			v1Y
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shearXAssign(@ExtractionParam T v1, float shear)
	{
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(shear, v1Y, v1.x()),
			v1Y
		);
		
		return v1;
	}
	
	public static float[] shearY(IVec2RF v1, float shear, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		
		res[0] = v1X;
		res[1] = Math.fma(shear, v1X, v1.y());
		
		return res;
	}
	
	public static <T extends IVec2WF> T shearY(IVec2RF v1, float shear, @ExtractionParam T res)
	{
		float v1X = v1.x();
		
		res.set(
			v1X,
			Math.fma(shear, v1X, v1.y())
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T shearY(@ExtractionParam T v1, float shear)
	{
		float v1X = v1.x();
		
		v1.set(
			v1X,
			Math.fma(shear, v1X, v1.y())
		);
		
		return v1;
	}
	
	public static float[] scale(IVec2RF v1, IVec2RF scale, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scale.x();
		res[1] = v1.y() * scale.y();
		
		return res;
	}
	
	public static float[] scale(IVec2RF v1, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scale[0];
		res[1] = v1.y() * scale[1];
		
		return res;
	}
	
	public static float[] scale(IVec2RF v1, float scale, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scale;
		res[1] = v1.y() * scale;
		
		return res;
	}
	
	public static float[] scale(IVec2RF v1, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scaleX;
		res[1] = v1.y() * scaleY;
		
		return res;
	}
	
	public static float[] scale(float[] v1, IVec2RF scale, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scale.x();
		res[1] = v1[1] * scale.y();
		
		return res;
	}
	
	public static float[] scale(float v1X, float v1Y, IVec2RF scale, @ExtractionParam float[] res)
	{
		res[0] = v1X * scale.x();
		res[1] = v1Y * scale.y();
		
		return res;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] v1, IVec2RF scale)
	{
		v1[0] = v1[0] * scale.x();
		v1[1] = v1[1] * scale.y();
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scale(IVec2RF v1, IVec2RF scale, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scale.x(),
			v1.y() * scale.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(IVec2RF v1, float[] scale, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scale[0],
			v1.y() * scale[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(IVec2RF v1, float scale, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scale,
			v1.y() * scale
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(IVec2RF v1, float scaleX, float scaleY, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scaleX,
			v1.y() * scaleY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float[] v1, IVec2RF scale, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scale.x(),
			v1[1] * scale.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float[] v1, float[] scale, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scale[0],
			v1[1] * scale[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float[] v1, float scale, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scale,
			v1[1] * scale
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float[] v1, float scaleX, float scaleY, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scaleX,
			v1[1] * scaleY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float v1X, float v1Y, IVec2RF scale, @ExtractionParam T res)
	{
		res.set(
			v1X * scale.x(),
			v1Y * scale.y()
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float v1X, float v1Y, float[] scale, @ExtractionParam T res)
	{
		res.set(
			v1X * scale[0],
			v1Y * scale[1]
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float v1X, float v1Y, float scale, @ExtractionParam T res)
	{
		res.set(
			v1X * scale,
			v1Y * scale
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scale(float v1X, float v1Y, float scaleX, float scaleY, @ExtractionParam T res)
	{
		res.set(
			v1X * scaleX,
			v1Y * scaleY
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scaleAssign(@ExtractionParam T v1, IVec2RF scale)
	{
		v1.set(
			v1.x() * scale.x(),
			v1.y() * scale.y()
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scaleAssign(@ExtractionParam T v1, float[] scale)
	{
		v1.set(
			v1.x() * scale[0],
			v1.y() * scale[1]
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scaleAssign(@ExtractionParam T v1, float scale)
	{
		v1.set(
			v1.x() * scale,
			v1.y() * scale
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scaleAssign(@ExtractionParam T v1, float scaleX, float scaleY)
	{
		v1.set(
			v1.x() * scaleX,
			v1.y() * scaleY
		);
		
		return v1;
	}
	
	public static float[] scalePivot(IVec2RF v1, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1.x() - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1.x() - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, IVec2RF pivot, float scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1.x() - pivotX, scale, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1.x() - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1.x() - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1.x() - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float[] pivot, float scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1.x() - pivotX, scale, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1.x() - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x() - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x() - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float pivotX, float pivotY, float scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x() - pivotX, scale, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(IVec2RF v1, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x() - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec2RF pivot, float scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1[0] - pivotX, scale, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1X - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1X - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, IVec2RF pivot, float scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1X - pivotX, scale, pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res[0] = Math.fma(v1X - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1Y - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1X - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale.y(), pivotY);
		
		return res;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec2RF pivot, IVec2RF scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		v1[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec2RF pivot, float[] scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec2RF pivot, float scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		v1[0] = Math.fma(v1[0] - pivotX, scale, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale, pivotY);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec2RF pivot, float scaleX, float scaleY)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float[] pivot, IVec2RF scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(IVec2RF v1, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1[0] - pivotX, scale.x(), pivotX),
			Math.fma(v1[1] - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1[0] - pivotX, scale[0], pivotX),
			Math.fma(v1[1] - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1[0] - pivotX, scale.x(), pivotX),
			Math.fma(v1[1] - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1[0] - pivotX, scale[0], pivotX),
			Math.fma(v1[1] - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0] - pivotX, scale.x(), pivotX),
			Math.fma(v1[1] - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0] - pivotX, scale[0], pivotX),
			Math.fma(v1[1] - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float[] v1, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1X - pivotX, scale.x(), pivotX),
			Math.fma(v1Y - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1X - pivotX, scale[0], pivotX),
			Math.fma(v1Y - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		res.set(
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1X - pivotX, scale.x(), pivotX),
			Math.fma(v1Y - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1X - pivotX, scale[0], pivotX),
			Math.fma(v1Y - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res.set(
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X - pivotX, scale.x(), pivotX),
			Math.fma(v1Y - pivotY, scale.y(), pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X - pivotX, scale[0], pivotX),
			Math.fma(v1Y - pivotY, scale[1], pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivot(float v1X, float v1Y, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY)
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, IVec2RF pivot, IVec2RF scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, IVec2RF pivot, float[] scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, IVec2RF pivot, float scaleX, float scaleY)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		v1.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, float[] pivot, IVec2RF scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, float[] pivot, float[] scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, float[] pivot, float scaleX, float scaleY)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, float pivotX, float pivotY, IVec2RF scale)
	{
		v1.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, float pivotX, float pivotY, float[] scale)
	{
		v1.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY)
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T scalePivotAssign(@ExtractionParam T v1, float pivotX, float pivotY, float scaleX, float scaleY)
	{
		v1.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY)
		);
		
		return v1;
	}
	
	public static float[] rotatePivotRad(IVec2RF v1, IVec2RF pivot, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float dX = v1.x() - pivotX;
		float dY = v1.y() - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotRad(IVec2RF v1, float[] pivot, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1.x() - pivotX;
		float dY = v1.y() - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotRad(IVec2RF v1, float pivotX, float pivotY, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1.x() - pivotX;
		float dY = v1.y() - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotRad(float[] v1, IVec2RF pivot, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotRad(float v1X, float v1Y, IVec2RF pivot, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotRadAssign(@ExtractionParam float[] v1, IVec2RF pivot, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		v1[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		v1[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return v1;
	}
	
	public static float[] clampLengthMin(IVec2RF v1, float min, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMin(IVec2RF v1, float min, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMin(float[] v1, float min, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMin(float v1X, float v1Y, float min, @ExtractionParam T res)
	{
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMinAssign(@ExtractionParam T v1, float min)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f
			);
			
			return v1;
		}
		
		v1.set(v1X, v1Y);
		
		return v1;
	}
	
	public static float[] clampLengthMax(IVec2RF v1, float max, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMax(IVec2RF v1, float max, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMax(float[] v1, float max, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMax(float v1X, float v1Y, float max, @ExtractionParam T res)
	{
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthMaxAssign(@ExtractionParam T v1, float max)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f
			);
			
			return v1;
		}
		
		v1.set(v1X, v1Y);
		
		return v1;
	}
	
	public static float[] clampLength(IVec2RF v1, float min, float max, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLength(IVec2RF v1, float min, float max, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLength(float[] v1, float min, float max, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLength(float v1X, float v1Y, float min, float max, @ExtractionParam T res)
	{
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y);
		
		return res;
	}
	
	public static <T extends IVec2WF> T clampLengthAssign(@ExtractionParam T v1, float min, float max)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, v1Y * v1Y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f
			);
			
			return v1;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f
			);
			
			return v1;
		}
		
		v1.set(v1X, v1Y);
		
		return v1;
	}
	
}
