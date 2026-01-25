package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public final class VecOps2F
{
	private VecOps2F() { }
	
	public static float squaredLength(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLength(float v1X, float v1Y)
	{
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps(float tolerance, float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps4(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps6(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLengthEps8(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float length(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float length(float v1X, float v1Y)
	{
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps(float tolerance, float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps4(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps6(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float lengthEps8(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float manhattanLength(float[] v1)
	{
		return Math.abs(v1[0]) + Math.abs(v1[1]);
	}
	
	public static float manhattanLength(float v1X, float v1Y)
	{
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps(float tolerance, float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps4(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps6(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float manhattanLengthEps8(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float chebyshevLength(float[] v1)
	{
		return Math.max(Math.abs(v1[0]), Math.abs(v1[1]));
	}
	
	public static float chebyshevLength(float v1X, float v1Y)
	{
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps(float tolerance, float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps4(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps6(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshevLengthEps8(float v1X, float v1Y)
	{
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y)) return 0.0f;
		
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float reciprocalSquaredLength(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		return 1.0f / (Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalSquaredLength(float v1X, float v1Y)
	{
		return 1.0f / (Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalLength(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		return MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalLength(float v1X, float v1Y)
	{
		return MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalManhattanLength(float[] v1)
	{
		return 1.0f / (Math.abs(v1[0]) + Math.abs(v1[1]));
	}
	
	public static float reciprocalManhattanLength(float v1X, float v1Y)
	{
		return 1.0f / (Math.abs(v1X) + Math.abs(v1Y));
	}
	
	public static float reciprocalChebyshevLength(float[] v1)
	{
		return 1.0f / Math.max(Math.abs(v1[0]), Math.abs(v1[1]));
	}
	
	public static float reciprocalChebyshevLength(float v1X, float v1Y)
	{
		return 1.0f / Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float dot(float[] v1, float[] v2)
	{
		return Math.fma(v1[0], v2[0], v1[1] * v2[1]);
	}
	
	public static float dot(float[] v1, float v2X, float v2Y)
	{
		return Math.fma(v1[0], v2X, v1[1] * v2Y);
	}
	
	public static float dot(float v1X, float v1Y, float[] v2)
	{
		return Math.fma(v1X, v2[0], v1Y * v2[1]);
	}
	
	public static float dot(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.fma(v1X, v2X, v1Y * v2Y);
	}
	
	public static float[] project(float[] v, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] project(float[] v, float tX, float tY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] project(float vX, float vY, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(vX, tX, vY * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] project(float vX, float vY, float tX, float tY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(vX, tX, vY * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v, float[] t)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		
		return v;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v, float tX, float tY)
	{
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		
		return v;
	}
	
	public static float[] reflect(float[] v, float[] n, @ExtractionParam float[] res)
	{
		float vX = v[0];
		float vY = v[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		
		return res;
	}

	public static float[] reflect(float[] v, float nX, float nY, @ExtractionParam float[] res)
	{
		float vX = v[0];
		float vY = v[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		
		return res;
	}
	
	public static float[] reflect(float vX, float vY, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		
		return res;
	}
	
	public static float[] reflect(float vX, float vY, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		
		return res;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v, float[] n)
	{
		float vX = v[0];
		float vY = v[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		v[0] = Math.fma(nX, dot, vX);
		v[1] = Math.fma(nY, dot, vY);
		
		return v;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v, float nX, float nY)
	{
		float vX = v[0];
		float vY = v[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		v[0] = Math.fma(nX, dot, vX);
		v[1] = Math.fma(nY, dot, vY);
		
		return v;
	}
	
	public static float[] normalize(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
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
	
	public static float[] normalize(float v1X, float v1Y, @ExtractionParam float[] res)
	{
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
	
	public static float[] normalizeAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps(float tolerance, float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
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
	
	public static float[] normalizeEps(float tolerance, float v1X, float v1Y, @ExtractionParam float[] res)
	{
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
	
	public static float[] normalizeEpsAssign(float tolerance, @ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, v1X, v1Y))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps4(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
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
	
	public static float[] normalizeEps4(float v1X, float v1Y, @ExtractionParam float[] res)
	{
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
	
	public static float[] normalizeEps4Assign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps4(v1X, v1Y))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps6(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
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
	
	public static float[] normalizeEps6(float v1X, float v1Y, @ExtractionParam float[] res)
	{
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
	
	public static float[] normalizeEps6Assign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps6(v1X, v1Y))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps8(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
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
	
	public static float[] normalizeEps8(float v1X, float v1Y, @ExtractionParam float[] res)
	{
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
	
	public static float[] normalizeEps8Assign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(CompareVecOps2F.isZeroEps8(v1X, v1Y))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		
		return v1;
	}
	
	public static float[] rotateRad(float[] v1, float angle, @ExtractionParam float[] res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static float[] rotateRad(float v1X, float v1Y, float angle, @ExtractionParam float[] res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static float[] rotateRadAssign(@ExtractionParam float[] v1, float angle)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(v1X, cos, -v1Y * sin);
		v1[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return v1;
	}
	
	public static float[] rotateDeg(float[] v1, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static float[] rotateDeg(float v1X, float v1Y, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static float[] rotateDegAssign(@ExtractionParam float[] v1, float angle)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(v1X, cos, -v1Y * sin);
		v1[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return v1;
	}
	
	public static float[] rotate90CW(float[] v1, @ExtractionParam float[] res)
	{
		float vY = -v1[0];
		
		res[0] = v1[1];
		res[1] = vY;
		
		return res;
	}
	
	public static float[] rotate90CW(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		float vY = -v1X;
		
		res[0] = v1Y;
		res[1] = vY;
		
		return res;
	}
	
	public static float[] rotate90CWAssign(@ExtractionParam float[] v1)
	{
		float vY = -v1[0];
		
		v1[0] = v1[1];
		v1[1] = vY;
		
		return v1;
	}
	
	public static float[] rotate90CCW(float[] v1, @ExtractionParam float[] res)
	{
		float vY = v1[0];
		
		res[0] = -v1[1];
		res[1] = vY;
		
		return res;
	}
	
	public static float[] rotate90CCW(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = -v1Y;
		res[1] = v1X;
		
		return res;
	}
	
	public static float[] rotate90CCWAssign(@ExtractionParam float[] v1)
	{
		float vY = v1[0];
		
		v1[0] = -v1[1];
		v1[1] = vY;
		
		return v1;
	}
	
	public static float angleBetweenRad(float[] v1, float[] v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad(float[] v1, float v2X, float v2Y)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad(float v1X, float v1Y, float[] v2)
	{
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad(float v1X, float v1Y, float v2X, float v2Y)
	{
		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenDeg(float[] v1, float[] v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg(float[] v1, float v2X, float v2Y)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg(float v1X, float v1Y, float[] v2)
	{
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg(float v1X, float v1Y, float v2X, float v2Y)
	{
		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float determinant(float[] v1, float[] v2)
	{
		return Math.fma(v1[0], v2[1], -v1[1] * v2[0]);
	}
	
	public static float determinant(float[] v1, float v2X, float v2Y)
	{
		return Math.fma(v1[0], v2Y, -v1[1] * v2X);
	}
	
	public static float determinant(float v1X, float v1Y, float[] v2)
	{
		return Math.fma(v1X, v2[1], -v1Y * v2[0]);
	}
	
	public static float determinant(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.fma(v1X, v2Y, -v1Y * v2X);
	}
	
	public static float area(float[] v1, float[] v2)
	{
		return 0.5f * Math.abs(Math.fma(v1[0], v2[1], -v1[1] * v2[0]));
	}
	
	public static float area(float[] v1, float v2X, float v2Y)
	{
		return 0.5f * Math.abs(Math.fma(v1[0], v2Y, -v1[1] * v2X));
	}
	
	public static float area(float v1X, float v1Y, float[] v2)
	{
		return 0.5f * Math.abs(Math.fma(v1X, v2[1], -v1Y * v2[0]));
	}
	
	public static float area(float v1X, float v1Y, float v2X, float v2Y)
	{
		return 0.5f * Math.abs(Math.fma(v1X, v2Y, -v1Y * v2X));
	}
	
	public static float parallelogramArea(float[] v1, float[] v2)
	{
		return Math.abs(Math.fma(v1[0], v2[1], -v1[1] * v2[0]));
	}
	
	public static float parallelogramArea(float[] v1, float v2X, float v2Y)
	{
		return Math.abs(Math.fma(v1[0], v2Y, -v1[1] * v2X));
	}
	
	public static float parallelogramArea(float v1X, float v1Y, float[] v2)
	{
		return Math.abs(Math.fma(v1X, v2[1], -v1Y * v2[0]));
	}
	
	public static float parallelogramArea(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.abs(Math.fma(v1X, v2Y, -v1Y * v2X));
	}
	
	public static float[] perpendicular(float[] v1, @ExtractionParam float[] res)
	{
		float vY = v1[0];
		
		res[0] = -v1[1];
		res[1] = vY;
		
		return res;
	}
	
	public static float[] perpendicular(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		float vY = v1X;
		
		res[0] = -v1Y;
		res[1] = vY;
		
		return res;
	}
	
	public static float[] perpendicularAssign(@ExtractionParam float[] v1)
	{
		float vY = v1[0];
		
		v1[0] = -v1[1];
		v1[1] = vY;
		
		return v1;
	}
	
	public static float[] tripleProduct(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProduct(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, float[] v2, float[] v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);
		
		v1[0] = v2[0] * dotV1V3;
		v1[1] = v2[1] * dotV1V3;
		
		return v1;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, float[] v2, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);
		
		v1[0] = v2[0] * dotV1V3;
		v1[1] = v2[1] * dotV1V3;
		
		return v1;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float[] v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);
		
		v1[0] = v2X * dotV1V3;
		v1[1] = v2Y * dotV1V3;
		
		return v1;
	}
	
	public static float[] tripleProductAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);
		
		v1[0] = v2X * dotV1V3;
		v1[1] = v2Y * dotV1V3;
		
		return v1;
	}
	
	public static float[] shear(float[] v1, float[] shear, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = Math.fma(shear[0], v1Y, v1X);
		res[1] = Math.fma(shear[1], v1X, v1Y);
		
		return res;
	}
	
	public static float[] shear(float[] v1, float shearX, float shearY, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = Math.fma(shearX, v1Y, v1X);
		res[1] = Math.fma(shearY, v1X, v1Y);
		
		return res;
	}
	
	public static float[] shear(float v1X, float v1Y, float[] shear, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(shear[0], v1Y, v1X);
		res[1] = Math.fma(shear[1], v1X, v1Y);
		
		return res;
	}
	
	public static float[] shear(float v1X, float v1Y, float shearX, float shearY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(shearX, v1Y, v1X);
		res[1] = Math.fma(shearY, v1X, v1Y);
		
		return res;
	}
	
	public static float[] shearAssign(@ExtractionParam float[] v1, float[] shear)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(shear[0], v1Y, v1X);
		v1[1] = Math.fma(shear[1], v1X, v1Y);
		
		return v1;
	}
	
	public static float[] shearAssign(@ExtractionParam float[] v1, float shearX, float shearY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(shearX, v1Y, v1X);
		v1[1] = Math.fma(shearY, v1X, v1Y);
		
		return v1;
	}
	
	public static float[] shearX(float[] v1, float shear, @ExtractionParam float[] res)
	{
		float v1Y = v1[1];
		
		res[0] = Math.fma(shear, v1Y, v1[0]);
		res[1] = v1Y;
		
		return res;
	}
	
	public static float[] shearX(float v1X, float v1Y, float shear, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(shear, v1Y, v1X);
		res[1] = v1Y;
		
		return res;
	}
	
	public static float[] shearXAssign(@ExtractionParam float[] v1, float shear)
	{
		v1[0] = Math.fma(shear, v1[1], v1[0]);
		
		return v1;
	}
	
	public static float[] shearY(float[] v1, float shear, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		
		res[0] = v1X;
		res[1] = Math.fma(shear, v1X, v1[1]);
		
		return res;
	}
	
	public static float[] shearY(float v1X, float v1Y, float shear, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = Math.fma(shear, v1X, v1Y);
		
		return res;
	}
	
	public static float[] shearYAssign(@ExtractionParam float[] v1, float shear)
	{
		v1[1] = Math.fma(shear, v1[0], v1[1]);
		
		return v1;
	}
	
	public static float[] scale(float[] v1, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scale[0];
		res[1] = v1[1] * scale[1];
		
		return res;
	}
	
	public static float[] scale(float[] v1, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scaleX;
		res[1] = v1[1] * scaleY;
		
		return res;
	}
	
	public static float[] scale(float v1X, float v1Y, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1X * scale[0];
		res[1] = v1Y * scale[1];
		
		return res;
	}
	
	public static float[] scale(float v1X, float v1Y, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = v1X * scaleX;
		res[1] = v1Y * scaleY;
		
		return res;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] v1, float[] scale)
	{
		v1[0] *= scale[0];
		v1[1] *= scale[1];
		
		return v1;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] v1, float scaleX, float scaleY)
	{
		v1[0] *= scaleX;
		v1[1] *= scaleY;
		
		return v1;
	}
	
	public static float[] scalePivot(float[] v1, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1X - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		res[0] = Math.fma(v1X - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1Y - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale[1], pivotY);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1Y - pivotY, scaleY, pivotY);
		
		return res;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float[] pivot, float[] scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return v1;
	}

	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float[] pivot, float scaleX, float scaleY)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float pivotX, float pivotY, float[] scale)
	{
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float pivotX, float pivotY, float scaleX, float scaleY)
	{
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return v1;
	}
	
	public static float[] clampLengthMin(float[] v1, float min, @ExtractionParam float[] res)
	{
		float x = v1[0];
		float y = v1[1];
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(x, x, y * y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = x * f;
			res[1] = y * f;
			
			return res;
		}
		
		res[0] = x;
		res[1] = y;
		
		return res;
	}
	
	public static float[] clampLengthMin(float v1X, float v1Y, float min, @ExtractionParam float[] res)
	{
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
	
	public static float[] clampLengthMinAssign(@ExtractionParam float[] v1, float min)
	{
		float x = v1[0];
		float y = v1[1];
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(x, x, y * y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1[0] = x * f;
			v1[1] = y * f;
		}
		
		return v1;
	}
	
	public static float[] clampLengthMax(float[] v1, float max, @ExtractionParam float[] res)
	{
		float x = v1[0];
		float y = v1[1];
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(x, x, y * y);
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = x * f;
			res[1] = y * f;
			
			return res;
		}
		
		res[0] = x;
		res[1] = y;
		
		return res;
	}
	
	public static float[] clampLengthMax(float v1X, float v1Y, float max, @ExtractionParam float[] res)
	{
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
	
	public static float[] clampLengthMaxAssign(@ExtractionParam float[] v1, float max)
	{
		float x = v1[0];
		float y = v1[1];
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(x, x, y * y);
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1[0] = x * f;
			v1[1] = y * f;
		}
		
		return v1;
	}
	
	public static float[] clampLength(float[] v1, float min, float max, @ExtractionParam float[] res)
	{
		float x = v1[0];
		float y = v1[1];
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(x, x, y * y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = x * f;
			res[1] = y * f;
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = x * f;
			res[1] = y * f;
			
			return res;
		}
		
		res[0] = x;
		res[1] = y;
		
		return res;
	}
	
	public static float[] clampLength(float v1X, float v1Y, float min, float max, @ExtractionParam float[] res)
	{
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
	
	public static float[] clampLengthAssign(@ExtractionParam float[] v1, float min, float max)
	{
		float x = v1[0];
		float y = v1[1];
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(x, x, y * y);
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1[0] = x * f;
			v1[1] = y * f;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1[0] = x * f;
			v1[1] = y * f;
		}
		
		return v1;
	}
	
}
