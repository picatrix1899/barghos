package org.barghos.api.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public final class RawVecOps2F
{
	private RawVecOps2F() { }
	
	public static float squaredLength2f(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLength2f(float v1X, float v1Y)
	{
		return Math.fma(v1X, v1X, v1Y * v1Y);
	}
	
	public static float squaredLength2f(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredLength2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredLength2f(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredLength2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float length2f(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float length2f(float v1X, float v1Y)
	{
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float length2f(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float length2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float length2f(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float length2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float mahattan2f(float[] v1)
	{
		return Math.abs(v1[0]) + Math.abs(v1[1]);
	}
	
	public static float mahattan2f(float v1X, float v1Y)
	{
		return Math.abs(v1X) + Math.abs(v1Y);
	}
	
	public static float mahattan2f(float[] v1, float[] v2)
	{
		return Math.abs(v2[0] - v1[0]) + Math.abs(v2[1] - v1[1]);
	}
	
	public static float mahattan2f(float[] v1, float v2X, float v2Y)
	{
		return Math.abs(v2X - v1[0]) + Math.abs(v2Y - v1[1]);
	}
	
	public static float mahattan2f(float v1X, float v1Y, float[] v2)
	{
		return Math.abs(v2[0] - v1X) + Math.abs(v2[1] - v1Y);
	}
	
	public static float mahattan2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.abs(v2X - v1X) + Math.abs(v2Y - v1Y);
	}
	
	public static float chebyshev2f(float[] v1)
	{
		return Math.max(Math.abs(v1[0]), Math.abs(v1[1]));
	}
	
	public static float chebyshev2f(float v1X, float v1Y)
	{
		return Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float chebyshev2f(float[] v1, float[] v2)
	{
		return Math.max(Math.abs(v2[0] - v1[0]), Math.abs(v2[1] - v1[1]));
	}
	
	public static float chebyshev2f(float[] v1, float v2X, float v2Y)
	{
		return Math.max(Math.abs(v2X - v1[0]), Math.abs(v2Y - v1[1]));
	}
	
	public static float chebyshev2f(float v1X, float v1Y, float[] v2)
	{
		return Math.max(Math.abs(v2[0] - v1X), Math.abs(v2[1] - v1Y));
	}
	
	public static float chebyshev2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.max(Math.abs(v2X - v1X), Math.abs(v2Y - v1Y));
	}
	
	public static float reciprocalSquaredLength2f(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		return 1.0f / (Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalSquaredLength2f(float v1X, float v1Y)
	{
		return 1.0f / (Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalSquaredLength2f(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalSquaredLength2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalSquaredLength2f(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalSquaredLength2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalLength2f(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		return MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalLength2f(float v1X, float v1Y)
	{
		return MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));
	}
	
	public static float reciprocalLength2f(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[0] - v1[1];
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalLength2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalLength2f(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[0] - v1Y;
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalLength2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalManhattan2f(float[] v1)
	{
		return 1.0f / (Math.abs(v1[0]) + Math.abs(v1[1]));
	}
	
	public static float reciprocalManhattan2f(float v1X, float v1Y)
	{
		return 1.0f / (Math.abs(v1X) + Math.abs(v1Y));
	}
	
	public static float reciprocalManhattan2f(float[] v1, float[] v2)
	{
		return 1.0f / (Math.abs(v2[0] - v1[0]) + Math.abs(v2[1] - v1[1]));
	}
	
	public static float reciprocalManhattan2f(float[] v1, float v2X, float v2Y)
	{
		return 1.0f / (Math.abs(v2X - v1[0]) + Math.abs(v2Y - v1[1]));
	}
	
	public static float reciprocalManhattan2f(float v1X, float v1Y, float[] v2)
	{
		return 1.0f / (Math.abs(v2[0] - v1X) + Math.abs(v2[1] - v1Y));
	}
	
	public static float reciprocalManhattan2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return 1.0f / (Math.abs(v2X - v1X) + Math.abs(v2Y - v1Y));
	}
	
	public static float reciprocalChebyshev2f(float[] v1)
	{
		return 1.0f / Math.max(Math.abs(v1[0]), Math.abs(v1[1]));
	}
	
	public static float reciprocalChebyshev2f(float v1X, float v1Y)
	{
		return 1.0f / Math.max(Math.abs(v1X), Math.abs(v1Y));
	}
	
	public static float reciprocalChebyshev2f(float[] v1, float[] v2)
	{
		return 1.0f / Math.max(Math.abs(v2[0] - v1[0]), Math.abs(v2[1] - v1[1]));
	}
	
	public static float reciprocalChebyshev2f(float[] v1, float v2X, float v2Y)
	{
		return 1.0f / Math.max(Math.abs(v2X - v1[0]), Math.abs(v2Y - v1[1]));
	}
	
	public static float reciprocalChebyshev2f(float v1X, float v1Y, float[] v2)
	{
		return 1.0f / Math.max(Math.abs(v2[0] - v1X), Math.abs(v2[1] - v1Y));
	}
	
	public static float reciprocalChebyshev2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return 1.0f / Math.max(Math.abs(v2X - v1X), Math.abs(v2Y - v1Y));
	}
	
	public static float dot2f(float[] v1, float[] v2)
	{
		return Math.fma(v1[0], v2[0], v1[1] * v2[1]);
	}
	
	public static float dot2f(float[] v1, float v2X, float v2Y)
	{
		return Math.fma(v1[0], v2X, v1[1] * v2Y);
	}
	
	public static float dot2f(float v1X, float v1Y, float[] v2)
	{
		return Math.fma(v1X, v2[0], v1Y * v2[1]);
	}
	
	public static float dot2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.fma(v1X, v2X, v1Y * v2Y);
	}
	
	public static float[] project2f(float[] v, float[] t)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		
		return v;
	}
	
	public static float[] project2f(float[] v, float tX, float tY)
	{
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		
		return v;
	}
	
	public static float[] projectN2f(float[] v, float[] t)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v[0], tX, v[1] * tY);

		return new float[] {
			tX * dot,
			tY * dot
		};
	}
	
	public static float[] projectN2f(float[] v, float tX, float tY)
	{
		float dot = Math.fma(v[0], tX, v[1] * tY);

		return new float[] {
			tX * dot,
			tY * dot
		};
	}
	
	public static float[] projectN2f(float vX, float vY, float[] t)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(vX, tX, vY * tY);

		return new float[] {
			tX * dot,
			tY * dot
		};
	}
	
	public static float[] projectN2f(float vX, float vY, float tX, float tY)
	{
		float dot = Math.fma(vX, tX, vY * tY);

		return new float[] {
			tX * dot,
			tY * dot
		};
	}
	
	public static float[] projectT2f(float[] v, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] projectT2f(float[] v, float tX, float tY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v[0], tX, v[1] * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] projectT2f(float vX, float vY, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float dot = Math.fma(vX, tX, vY * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] projectT2f(float vX, float vY, float tX, float tY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(vX, tX, vY * tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	public static float[] reflect2f(float[] v, float[] n)
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
	
	public static float[] reflect2f(float[] v, float nX, float nY)
	{
		float vX = v[0];
		float vY = v[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		v[0] = Math.fma(nX, dot, vX);
		v[1] = Math.fma(nY, dot, vY);
		
		return v;
	}
	
	public static float[] reflectN2f(float[] v, float[] n)
	{
		float vX = v[0];
		float vY = v[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		return new float[] {
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY)
		};
	}
	
	public static float[] reflectN2f(float[] v, float nX, float nY)
	{
		float vX = v[0];
		float vY = v[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		return new float[] {
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY)
		};
	}
	
	public static float[] reflectN2f(float vX, float vY, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		return new float[] {
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY)
		};
	}
	
	public static float[] reflectN2f(float vX, float vY, float nX, float nY)
	{
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		return new float[] {
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY)
		};
	}
	
	public static float[] reflectT2f(float[] v, float[] n, @ExtractionParam float[] res)
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

	public static float[] reflectT2f(float[] v, float nX, float nY, @ExtractionParam float[] res)
	{
		float vX = v[0];
		float vY = v[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		
		return res;
	}
	
	public static float[] reflectT2f(float vX, float vY, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		
		return res;
	}
	
	public static float[] reflectT2f(float vX, float vY, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2 * Math.fma(vX, nX, vY * nY);
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		
		return res;
	}
	
	public static float[] normalize2f(float[] v1)
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
	
	public static float[] normalizeN2f(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));

		return new float[] {
			v1X * recLength,
			v1Y * recLength
		};
	}
	
	public static float[] normalizeN2f(float v1X, float v1Y)
	{
		if(v1X == 0.0f && v1Y == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, v1Y * v1Y));

		return new float[] {
			v1X * recLength,
			v1Y * recLength
		};
	}
	
	public static float[] normalizeT2f(float[] v1, @ExtractionParam float[] res)
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
	
	public static float[] normalizeT2f(float v1X, float v1Y, @ExtractionParam float[] res)
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
	
	public static float[] negate2f(float[] v1)
	{
		v1[0] = -v1[0];
		v1[1] = -v1[1];
		
		return v1;
	}
	
	public static float[] negateN2f(float[] v1)
	{
		return new float[] {
			-v1[0],
			-v1[1]
		};
	}
	
	public static float[] negateN2f(float v1X, float v1Y)
	{
		return new float[] {
			-v1X,
			-v1Y
		};
	}
	
	public static float[] negateT2f(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = -v1[0];
		res[1] = -v1[1];
		
		return res;
	}
	
	public static float[] negateT2f(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = -v1X;
		res[1] = -v1Y;
		
		return res;
	}
	
	public static float[] vectorTo2f(float[] v1, float[] v2)
	{
		v1[0] = v2[0] - v1[0];
		v1[1] = v2[1] - v1[1];
		
		return v1;
	}
	
	public static float[] vectorTo2f(float[] v1, float v2X, float v2Y)
	{
		v1[0] = v2X - v1[0];
		v1[1] = v2Y - v1[1];
		
		return v1;
	}
	
	public static float[] vectorToN2f(float[] v1, float[] v2)
	{
		return new float[] {
			v2[0] - v1[0],
			v2[1] - v1[1]
		};
	}
	
	public static float[] vectorToN2f(float[] v1, float v2X, float v2Y)
	{
		return new float[] {
			v2X - v1[0],
			v2Y - v1[1]
		};
	}
	
	public static float[] vectorToN2f(float v1X, float v1Y, float[] v2)
	{
		return new float[] {
			v2[0] - v1X,
			v2[1] - v1Y
		};
	}
	
	public static float[] vectorToN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return new float[] {
			v2X - v1X,
			v2Y - v1Y
		};
	}
	
	public static float[] vectorToT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1[0];
		res[1] = v2[1] - v1[1];
		
		return res;
	}
	
	public static float[] vectorToT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1[0];
		res[1] = v2Y - v1[1];
		
		return res;
	}
	
	public static float[] vectorToT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1X;
		res[1] = v2[1] - v1Y;
		
		return res;
	}
	
	public static float[] vectorToT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1X;
		res[1] = v2Y - v1Y;
		
		return res;
	}
	
	public static float[] vectorFrom2f(float[] v1, float[] v2)
	{
		v1[0] = v1[0] - v2[0];
		v1[1] = v1[1] - v2[1];
		
		return v1;
	}
	
	public static float[] vectorFrom2f(float[] v1, float v2X, float v2Y)
	{
		v1[0] = v1[0] - v2X;
		v1[1] = v1[1] - v2Y;
		
		return v1;
	}
	
	public static float[] vectorFromN2f(float[] v1, float[] v2)
	{
		return new float[] {
			v1[0] - v2[0],
			v1[1] - v2[1]
		};
	}
	
	public static float[] vectorFromN2f(float[] v1, float v2X, float v2Y)
	{
		return new float[] {
			v1[0] - v2X,
			v1[1] - v2Y
		};
	}
	
	public static float[] vectorFromN2f(float v1X, float v1Y, float[] v2)
	{
		return new float[] {
			v1X - v2[0],
			v1Y - v2[1]
		};
	}
	
	public static float[] vectorFromN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return new float[] {
			v1X - v2X,
			v1Y - v2Y
		};
	}
	
	public static float[] vectorFromT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2[0];
		res[1] = v1[1] - v2[1];
		
		return res;
	}
	
	public static float[] vectorFromT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2X;
		res[1] = v1[1] - v2Y;
		
		return res;
	}
	
	public static float[] vectorFromT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2[0];
		res[1] = v1Y - v2[1];
		
		return res;
	}
	
	public static float[] vectorFromT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2X;
		res[1] = v1Y - v2Y;
		
		return res;
	}
	
	public static float[] halfVectorTo2f(float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v2[0] - v1[0]);
		v1[1] = 0.5f * (v2[1] - v1[1]);
		
		return v1;
	}
	
	public static float[] halfVectorTo2f(float[] v1, float v2X, float v2Y)
	{
		v1[0] = 0.5f * (v2X - v1[0]);
		v1[1] = 0.5f * (v2Y - v1[1]);
		
		return v1;
	}
	
	public static float[] halfVectorToN2f(float[] v1, float[] v2)
	{
		return new float[] {
			0.5f * (v2[0] - v1[0]),
			0.5f * (v2[1] - v1[1])
		};
	}
	
	public static float[] halfVectorToN2f(float[] v1, float v2X, float v2Y)
	{
		return new float[] {
			0.5f * (v2X - v1[0]),
			0.5f * (v2Y - v1[1])
		};
	}
	
	public static float[] halfVectorToN2f(float v1X, float v1Y, float[] v2)
	{
		return new float[] {
			0.5f * (v2[0] - v1X),
			0.5f * (v2[1] - v1Y)
		};
	}
	
	public static float[] halfVectorToN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return new float[] {
			0.5f * (v2X - v1X),
			0.5f * (v2Y - v1Y)
		};
	}
	
	public static float[] halfVectorToT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] - v1[0]);
		res[1] = 0.5f * (v2[1] - v1[1]);
		
		return res;
	}
	
	public static float[] halfVectorToT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X - v1[0]);
		res[1] = 0.5f * (v2Y - v1[1]);
		
		return res;
	}
	
	public static float[] halfVectorToT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] - v1X);
		res[1] = 0.5f * (v2[1] - v1Y);
		
		return res;
	}
	
	public static float[] halfVectorToT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X - v1X);
		res[1] = 0.5f * (v2Y - v1Y);
		
		return res;
	}
	
	public static float[] halfVectorFrom2f(float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v1[0] - v2[0]);
		v1[1] = 0.5f * (v1[1] - v2[1]);
		
		return v1;
	}
	
	public static float[] halfVectorFrom2f(float[] v1, float v2X, float v2Y)
	{
		v1[0] = 0.5f * (v1[0] - v2X);
		v1[1] = 0.5f * (v1[1] - v2Y);
		
		return v1;
	}
	
	public static float[] halfVectorFromN2f(float[] v1, float[] v2)
	{
		return new float[] {
			0.5f * (v1[0] - v2[0]),
			0.5f * (v1[1] - v2[1])
		};
	}
	
	public static float[] halfVectorFromN2f(float[] v1, float v2X, float v2Y)
	{
		return new float[] {
			0.5f * (v1[0] - v2X),
			0.5f * (v1[1] - v2Y)
		};
	}
	
	public static float[] halfVectorFromN2f(float v1X, float v1Y, float[] v2)
	{
		return new float[] {
			0.5f * (v1X - v2[0]),
			0.5f * (v1Y - v2[1])
		};
	}
	
	public static float[] halfVectorFromN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return new float[] {
			0.5f * (v1X - v2X),
			0.5f * (v1Y - v2Y)
		};
	}
	
	public static float[] halfVectorFromT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1[0] - v2[0]);
		res[1] = 0.5f * (v1[1] - v2[1]);
		
		return res;
	}
	
	public static float[] halfVectorFromT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1[0] - v2X);
		res[1] = 0.5f * (v1[1] - v2Y);
		
		return res;
	}
	
	public static float[] halfVectorFromT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1X - v2[0]);
		res[1] = 0.5f * (v1Y - v2[1]);
		
		return res;
	}
	
	public static float[] halfVectorFromT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1X - v2X);
		res[1] = 0.5f * (v1Y - v2Y);
		
		return res;
	}
	
	public static float[] midpoint2f(float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v2[0] + v1[0]);
		v1[1] = 0.5f * (v2[1] + v1[1]);
		
		return v1;
	}
	
	public static float[] midpoint2f(float[] v1, float v2X, float v2Y)
	{
		v1[0] = 0.5f * (v2X + v1[0]);
		v1[1] = 0.5f * (v2Y + v1[1]);
		
		return v1;
	}
	
	public static float[] midpointN2f(float[] v1, float[] v2)
	{
		return new float[] {
			0.5f * (v2[0] + v1[0]),
			0.5f * (v2[1] + v1[1])
		};
	}
	
	public static float[] midpointN2f(float[] v1, float v2X, float v2Y)
	{
		return new float[] {
			0.5f * (v2X + v1[0]),
			0.5f * (v2Y + v1[1])
		};
	}
	
	public static float[] midpointN2f(float v1X, float v1Y, float[] v2)
	{
		return new float[] {
			0.5f * (v2[0] + v1X),
			0.5f * (v2[1] + v1Y)
		};
	}
	
	public static float[] midpointN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return new float[] {
			0.5f * (v2X + v1X),
			0.5f * (v2Y + v1Y)
		};
	}
	
	public static float[] midpointT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] + v1[0]);
		res[1] = 0.5f * (v2[1] + v1[1]);
		
		return res;
	}
	
	public static float[] midpointT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X + v1[0]);
		res[1] = 0.5f * (v2Y + v1[1]);
		
		return res;
	}
	
	public static float[] midpointT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] + v1X);
		res[1] = 0.5f * (v2[1] + v1Y);
		
		return res;
	}
	
	public static float[] midpointT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X + v1X);
		res[1] = 0.5f * (v2Y + v1Y);
		
		return res;
	}
	
	public static float[] directionTo2f(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		
		return v1;
	}
	
	public static float[] directionTo2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		
		return v1;
	}
	
	public static float[] directionToN2f(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionToN2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionToN2f(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionToN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionToT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] directionToT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] directionToT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] directionToT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] directionFrom2f(float[] v1, float[] v2)
	{
		float vX = v1[0] - v2[0];
		float vY = v1[1] - v2[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		
		return v1;
	}
	
	public static float[] directionFrom2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v1[0] - v2X;
		float vY = v1[1] - v2Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		
		return v1;
	}
	
	public static float[] directionFromN2f(float[] v1, float[] v2)
	{
		float vX = v1[0] - v2[0];
		float vY = v1[1] - v2[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionFromN2f(float[] v1, float v2X, float v2Y)
	{
		float vX = v1[0] - v2X;
		float vY = v1[1] - v2Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionFromN2f(float v1X, float v1Y, float[] v2)
	{
		float vX = v1X - v2[0];
		float vY = v1Y - v2[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionFromN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v1X - v2X;
		float vY = v1Y - v2Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			return new float[] {
				0.0f,
				0.0f
			};
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		return new float[] {
			vX * recLength,
			vY * recLength
		};
	}
	
	public static float[] directionFromT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v1[0] - v2[0];
		float vY = v1[1] - v2[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] directionFromT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		float vX = v1[0] - v2X;
		float vY = v1[1] - v2Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] directionFromT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v1X - v2[0];
		float vY = v1Y - v2[1];
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] directionFromT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		float vX = v1X - v2X;
		float vY = v1Y - v2Y;
		
		if(vX == 0.0f && vY == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		
		return res;
	}
	
	public static float[] rotateRad2f(float v1[], float angle)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(v1X, cos, -v1Y * sin);
		v1[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return v1;
	}
	
	public static float[] rotateRadN2f(float v1[], float angle)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		return new float[] {
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		};
	}
	
	public static float[] rotateRadN2f(float v1X, float v1Y, float angle)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);

		return new float[] {
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		};
	}
	
	public static float[] rotateRadT2f(float v1[], float angle, @ExtractionParam float[] res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static float[] rotateRadT2f(float v1X, float v1Y, float angle, @ExtractionParam float[] res)
	{
		float cos = MathUtils.cos(angle);
		float sin = MathUtils.sin(angle);

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static float[] rotateDeg2f(float v1[], float angle)
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
	
	public static float[] rotateDegN2f(float v1[], float angle)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);
		
		float v1X = v1[0];
		float v1Y = v1[1];

		return new float[] {
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		};
	}
	
	public static float[] rotateDegN2f(float v1X, float v1Y, float angle)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);

		return new float[] {
			Math.fma(v1X, cos, -v1Y * sin),
			Math.fma(v1X, sin, v1Y * cos)
		};
	}
	
	public static float[] rotateDegT2f(float v1[], float angle, @ExtractionParam float[] res)
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
	
	public static float[] rotateDegT2f(float v1X, float v1Y, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float cos = MathUtils.cos(radAngle);
		float sin = MathUtils.sin(radAngle);

		res[0] = Math.fma(v1X, cos, -v1Y * sin);
		res[1] = Math.fma(v1X, sin, v1Y * cos);
		
		return res;
	}
	
	public static float[] rotate90CW2f(float[] v1)
	{
		float vY = -v1[0];
		
		v1[0] = v1[1];
		v1[1] = vY;
		
		return v1;
	}
	
	public static float[] rotate90CWN2f(float[] v1)
	{
		return new float[] {
			v1[1],
			-v1[0]
		};
	}
	
	public static float[] rotate90CWN2f(float v1X, float v1Y)
	{
		return new float[] {
			v1Y,
			-v1X
		};
	}
	
	public static float[] rotate90CWT2f(float[] v1, @ExtractionParam float[] res)
	{
		float vY = -v1[0];
		
		res[0] = v1[1];
		res[1] = vY;
		
		return res;
	}
	
	public static float[] rotate90CWT2f(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		float vY = -v1X;
		
		res[0] = v1Y;
		res[1] = vY;
		
		return res;
	}
	
	public static float[] rotate90CCW2f(float[] v1)
	{
		float vY = v1[0];
		
		v1[0] = -v1[1];
		v1[1] = vY;
		
		return v1;
	}
	
	public static float[] rotate90CCWN2f(float[] v1)
	{
		return new float[] {
			-v1[1],
			v1[0]
		};
	}
	
	public static float[] rotate90CCWN2f(float v1X, float v1Y)
	{
		return new float[] {
			-v1Y,
			v1X
		};
	}
	
	public static float[] rotate90CCWInfo2f(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = -v1[1];
		res[1] = v1[0];
		
		return res;
	}
	
	public static float[] rotate90CCWInfo2f(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = -v1Y;
		res[1] = v1X;
		
		return res;
	}
	
	public static float angleBetweenRad2f(float[] v1, float[] v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad2f(float[] v1, float v2X, float v2Y)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad2f(float v1X, float v1Y, float[] v2)
	{
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenRad2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y));
	}
	
	public static float angleBetweenDeg2f(float[] v1, float[] v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg2f(float[] v1, float v2X, float v2Y)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg2f(float v1X, float v1Y, float[] v2)
	{
		float v2X = v2[0];
		float v2Y = v2[1];

		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float angleBetweenDeg2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return MathUtils.atan2(Math.fma(v1X, v2Y, -v1Y * v2X), Math.fma(v1X, v2X, v1Y * v2Y)) * MathUtils.RAD_TO_DEGf;
	}
	
	public static float determinant2f(float[] v1, float[] v2)
	{
		return Math.fma(v1[0], v2[1], -v1[1] * v2[0]);
	}
	
	public static float determinant2f(float[] v1, float v2X, float v2Y)
	{
		return Math.fma(v1[0], v2Y, -v1[1] * v2X);
	}
	
	public static float determinant2f(float v1X, float v1Y, float[] v2)
	{
		return Math.fma(v1X, v2[1], -v1Y * v2[0]);
	}
	
	public static float determinant2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.fma(v1X, v2Y, -v1Y * v2X);
	}
	
	public float area2f(float[] v1, float[] v2)
	{
		return 0.5f * Math.abs(Math.fma(v1[0], v2[1], -v1[1] * v2[0]));
	}
	
	public float area2f(float[] v1, float v2X, float v2Y)
	{
		return 0.5f * Math.abs(Math.fma(v1[0], v2Y, -v1[1] * v2X));
	}
	
	public float area2f(float v1X, float v1Y, float[] v2)
	{
		return 0.5f * Math.abs(Math.fma(v1X, v2[1], -v1Y * v2[0]));
	}
	
	public float area2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return 0.5f * Math.abs(Math.fma(v1X, v2Y, -v1Y * v2X));
	}
	
	public float parallelogramArea2f(float[] v1, float[] v2)
	{
		return Math.abs(Math.fma(v1[0], v2[1], -v1[1] * v2[0]));
	}
	
	public float parallelogramArea2f(float[] v1, float v2X, float v2Y)
	{
		return Math.abs(Math.fma(v1[0], v2Y, -v1[1] * v2X));
	}
	
	public float parallelogramArea2f(float v1X, float v1Y, float[] v2)
	{
		return Math.abs(Math.fma(v1X, v2[1], -v1Y * v2[0]));
	}
	
	public float parallelogramArea2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.abs(Math.fma(v1X, v2Y, -v1Y * v2X));
	}
	
	public float[] perpendicular2f(float[] v1)
	{
		float vY = v1[0];
		
		v1[0] = -v1[1];
		v1[1] = vY;
		
		return v1;
	}
	
	public float[] perpendicularN2f(float[] v1)
	{
		return new float[] {
			-v1[1],
			v1[0]
		};
	}
	
	public float[] perpendicularN2f(float v1X, float v1Y)
	{
		return new float[] {
			-v1Y,
			v1X
		};
	}
	
	public float[] perpendicularT2f(float[] v1, @ExtractionParam float[] res)
	{
		float vY = v1[0];
		
		res[0] = -v1[1];
		res[1] = vY;
		
		return res;
	}
	
	public float[] perpendicularT2f(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		float vY = v1X;
		
		res[0] = -v1Y;
		res[1] = vY;
		
		return res;
	}
	
	public float[] tripleProduct2f(float[] v1, float[] v2, float[] v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);
		
		v1[0] = v2[0] * dotV1V3;
		v1[1] = v2[1] * dotV1V3;
		
		return v1;
	}
	
	public float[] tripleProduct2f(float[] v1, float[] v2, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);
		
		v1[0] = v2[0] * dotV1V3;
		v1[1] = v2[1] * dotV1V3;
		
		return v1;
	}
	
	public float[] tripleProduct2f(float[] v1, float v2X, float v2Y, float[] v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);
		
		v1[0] = v2X * dotV1V3;
		v1[1] = v2Y * dotV1V3;
		
		return v1;
	}
	
	public float[] tripleProduct2f(float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);
		
		v1[0] = v2X * dotV1V3;
		v1[1] = v2Y * dotV1V3;
		
		return v1;
	}
	
	public float[] tripleProductN2f(float[] v1, float[] v2, float[] v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		return new float[] {
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		};
	}
	
	public float[] tripleProductN2f(float[] v1, float[] v2, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		return new float[] {
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		};
	}
	
	public float[] tripleProductN2f(float[] v1, float v2X, float v2Y, float[] v3)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		return new float[] {
			v2X * dotV1V3,
			v2Y * dotV1V3
		};
	}
	
	public float[] tripleProductN2f(float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		return new float[] {
			v2X * dotV1V3,
			v2Y * dotV1V3
		};
	}
	
	public float[] tripleProductN2f(float v1X, float v1Y, float[] v2, float[] v3)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);

		return new float[] {
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		};
	}
	
	public float[] tripleProductN2f(float v1X, float v1Y, float[] v2, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);

		return new float[] {
			v2[0] * dotV1V3,
			v2[1] * dotV1V3
		};
	}
	
	public float[] tripleProductN2f(float v1X, float v1Y, float v2X, float v2Y, float[] v3)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);

		return new float[] {
			v2X * dotV1V3,
			v2Y * dotV1V3
		};
	}
	
	public float[] tripleProductN2f(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);

		return new float[] {
			v2X * dotV1V3,
			v2Y * dotV1V3
		};
	}
	
	public float[] tripleProductT2f(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public float[] tripleProductT2f(float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public float[] tripleProductT2f(float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3[0], v1[1] * v3[1]);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public float[] tripleProductT2f(float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1[0], v3X, v1[1] * v3Y);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public float[] tripleProductT2f(float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public float[] tripleProductT2f(float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);

		res[0] = v2[0] * dotV1V3;
		res[1] = v2[1] * dotV1V3;
				
		return res;
	}
	
	public float[] tripleProductT2f(float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3[0], v1Y * v3[1]);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public float[] tripleProductT2f(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float dotV1V3 = Math.fma(v1X, v3X, v1Y * v3Y);

		res[0] = v2X * dotV1V3;
		res[1] = v2Y * dotV1V3;
				
		return res;
	}
	
	public float[] barycentric2f(float[] p, float[] v1, float[] v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return p;
	}
	
	public float[] barycentric2f(float[] p, float[] v1, float[] v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV));
		
		return p;
	}
	
	public float[] barycentric2f(float[] p, float[] v1, float v2X, float v2Y, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return p;
	}
	
	public float[] barycentric2f(float[] p, float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV));
		
		return p;
	}

	public float[] barycentric2f(float[] p, float v1X, float v1Y, float[] v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return p;
	}
	
	public float[] barycentric2f(float[] p, float v1X, float v1Y, float[] v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV));
		
		return p;
	}
	
	public float[] barycentric2f(float[] p, float v1X, float v1Y, float v2X, float v2Y, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return p;
	}
	
	public float[] barycentric2f(float[] p, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV));
		
		return p;
	}
	
	public float[] barycentricN2f(float[] p, float[] v1, float[] v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float[] p, float[] v1, float[] v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV))
		};
	}
	
	public float[] barycentricN2f(float[] p, float[] v1, float v2X, float v2Y, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float[] p, float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV))
		};
	}
	
	public float[] barycentricN2f(float[] p, float v1X, float v1Y, float[] v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float[] p, float v1X, float v1Y, float[] v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV))
		};
	}
	
	public float[] barycentricN2f(float[] p, float v1X, float v1Y, float v2X, float v2Y, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float[] p, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float[] v1, float[] v2, float[] v3)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float[] v1, float[] v2, float v3X, float v3Y)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float[] v1, float v2X, float v2Y, float[] v3)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float v1X, float v1Y, float[] v2, float[] v3)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float v1X, float v1Y, float[] v2, float v3X, float v3Y)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, float[] v3)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV))
		};
	}
	
	public float[] barycentricN2f(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y)
	{
		float w = 1.0f - pU - pV;

		return new float[] {
			Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV))
		};
	}
	
	public float[] barycentricT2f(float[] p, float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float[] p, float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float[] p, float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float[] p, float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float[] p, float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float[] p, float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float[] p, float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float[] p, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public float[] barycentricT2f(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public float[] shearX2f(float[] v1, float shear)
	{
		v1[0] = Math.fma(shear, v1[1], v1[0]);
		
		return v1;
	}
	
	public float[] shearXN2f(float[] v1, float shear)
	{
		float v1Y = v1[1];
		
		return new float[] {
			Math.fma(shear, v1Y, v1[0]),
			v1Y
		};
	}
	
	public float[] shearXN2f(float v1X, float v1Y, float shear)
	{
		return new float[] {
			Math.fma(shear, v1Y, v1X),
			v1Y
		};
	}
	
	public float[] shearXN2f(float[] v1, float shear, @ExtractionParam float[] res)
	{
		float v1Y = v1[1];
		
		res[0] = Math.fma(shear, v1Y, v1[0]);
		res[1] = v1Y;
		
		return res;
	}
	
	public float[] shearXN2f(float v1X, float v1Y, float shear, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(shear, v1Y, v1X);
		res[1] = v1Y;
		
		return res;
	}
	
	public float[] shearY2f(float[] v1, float shear)
	{
		v1[1] = Math.fma(shear, v1[0], v1[1]);
		
		return v1;
	}
	
	public float[] shearYN2f(float[] v1, float shear)
	{
		float v1X = v1[0];
		
		return new float[] {
			v1X,
			Math.fma(shear, v1X, v1[1])
		};
	}
	
	public float[] shearYN2f(float v1X, float v1Y, float shear)
	{
		return new float[] {
			v1X,
			Math.fma(shear, v1X, v1Y)
		};
	}
	
	public float[] shearYT2f(float[] v1, float shear, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		
		res[0] = v1X;
		res[1] = Math.fma(shear, v1X, v1[1]);
		
		return res;
	}
	
	public float[] shearYT2f(float v1X, float v1Y, float shear, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = Math.fma(shear, v1X, v1Y);
		
		return res;
	}
	
	public float[] shear2f(float[] v1, float[] shear)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(shear[0], v1Y, v1X);
		v1[1] = Math.fma(shear[1], v1X, v1Y);
		
		return v1;
	}
	
	public float[] shear2f(float[] v1, float shearX, float shearY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		v1[0] = Math.fma(shearX, v1Y, v1X);
		v1[1] = Math.fma(shearY, v1X, v1Y);
		
		return v1;
	}
	
	public float[] shearN2f(float[] v1, float[] shear)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		return new float[] {
			Math.fma(shear[0], v1Y, v1X),
			Math.fma(shear[1], v1X, v1Y)
		};
	}
	
	public float[] shearN2f(float[] v1, float shearX, float shearY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		return new float[] {
			Math.fma(shearX, v1Y, v1X),
			Math.fma(shearY, v1X, v1Y)
		};
	}
	
	public float[] shearN2f(float v1X, float v1Y, float[] shear)
	{
		return new float[] {
			Math.fma(shear[0], v1Y, v1X),
			Math.fma(shear[1], v1X, v1Y)
		};
	}
	
	public float[] shearN2f(float v1X, float v1Y, float shearX, float shearY)
	{
		return new float[] {
			Math.fma(shearX, v1Y, v1X),
			Math.fma(shearY, v1X, v1Y)
		};
	}
	
	public float[] shearT2f(float[] v1, float[] shear, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = Math.fma(shear[0], v1Y, v1X);
		res[1] = Math.fma(shear[1], v1X, v1Y);
		
		return res;
	}
	
	public float[] shearT2f(float[] v1, float shearX, float shearY, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = Math.fma(shearX, v1Y, v1X);
		res[1] = Math.fma(shearY, v1X, v1Y);
		
		return res;
	}
	
	public float[] shearT2f(float v1X, float v1Y, float[] shear, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(shear[0], v1Y, v1X);
		res[1] = Math.fma(shear[1], v1X, v1Y);
		
		return res;
	}
	
	public float[] shearT2f(float v1X, float v1Y, float shearX, float shearY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(shearX, v1Y, v1X);
		res[1] = Math.fma(shearY, v1X, v1Y);
		
		return res;
	}
	
	public float[] translate2f(float[] v1, float[] v2)
	{
		v1[0] += v2[0];
		v1[1] += v2[1];
		
		return v1;
	}
	
	public float[] translate2f(float[] v1, float v2X, float v2Y)
	{
		v1[0] += v2X;
		v1[1] += v2Y;
		
		return v1;
	}
	
	public float[] translateN2f(float[] v1, float[] v2)
	{
		return new float[] {
			v1[0] + v2[0],
			v1[1] + v2[1]
		};
	}
	
	public float[] translateN2f(float[] v1, float v2X, float v2Y)
	{
		return new float[] {
			v1[0] + v2X,
			v1[1] + v2Y
		};
	}
	
	public float[] translateN2f(float v1X, float v1Y, float[] v2)
	{
		return new float[] {
			v1X + v2[0],
			v1Y + v2[1]
		};
	}
	
	public float[] translateN2f(float v1X, float v1Y, float v2X, float v2Y)
	{
		return new float[] {
			v1X + v2X,
			v1Y + v2Y
		};
	}
	
	public float[] translateT2f(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2[0];
		res[1] = v1[1] + v2[1];
		
		return res;
	}
	
	public float[] translateT2f(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2X;
		res[1] = v1[1] + v2Y;
		
		return res;
	}
	
	public float[] translateT2f(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2[0];
		res[1] = v1Y + v2[1];
		
		return res;
	}
	
	public float[] translateT2f(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2X;
		res[1] = v1Y + v2Y;
		
		return res;
	}
	
	public float[] scale2f(float[] v1, float[] scale)
	{
		v1[0] *= scale[0];
		v1[1] *= scale[1];
		
		return v1;
	}
	
	public float[] scale2f(float[] v1, float scaleX, float scaleY)
	{
		v1[0] *= scaleX;
		v1[1] *= scaleY;
		
		return v1;
	}
	
	public float[] scaleN2f(float[] v1, float[] scale)
	{
		return new float[] {
				v1[0] * scale[0],
				v1[1] * scale[1]
		};
	}
	
	public float[] scaleN2f(float[] v1, float scaleX, float scaleY)
	{
		return new float[] {
				v1[0] * scaleX,
				v1[1] * scaleY
		};
	}
	
	public float[] scaleN2f(float v1X, float v1Y, float[] scale)
	{
		return new float[] {
				v1X * scale[0],
				v1Y * scale[1]
		};
	}
	
	public float[] scaleN2f(float v1X, float v1Y, float scaleX, float scaleY)
	{
		return new float[] {
				v1X * scaleX,
				v1Y * scaleY
		};
	}
	
	public float[] scaleT2f(float[] v1, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scale[0];
		res[1] = v1[1] * scale[1];
		
		return res;
	}
	
	public float[] scaleT2f(float[] v1, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scaleX;
		res[1] = v1[1] * scaleY;
		
		return res;
	}
	
	public float[] scaleT2f(float v1X, float v1Y, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1X * scale[0];
		res[1] = v1Y * scale[1];
		
		return res;
	}
	
	public float[] scaleT2f(float v1X, float v1Y, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		res[0] = v1X * scaleX;
		res[1] = v1Y * scaleY;
		
		return res;
	}
	
	public float[] scalePivot2f(float[] v1, float[] pivot, float[] scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return v1;
	}

	public float[] scalePivot2f(float[] v1, float[] pivot, float scaleX, float scaleY)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return v1;
	}
	
	public float[] scalePivot2f(float[] v1, float pivotX, float pivotY, float[] scale)
	{
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		
		return v1;
	}
	
	public float[] scalePivot2f(float[] v1, float pivotX, float pivotY, float scaleX, float scaleY)
	{
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		
		return v1;
	}
	
	public float[] scalePivotN2f(float[] v1, float[] pivot, float[] scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		return new float[] {
			Math.fma(v1[0] - pivotX, scale[0], pivotX),
			Math.fma(v1[1] - pivotY, scale[1], pivotY)
		};
	}
	
	public float[] scalePivotN2f(float[] v1, float[] pivot, float scaleX, float scaleY)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		return new float[] {
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY)
		};
	}
	
	public float[] scalePivotN2f(float[] v1, float pivotX, float pivotY, float[] scale)
	{
		return new float[] {
			Math.fma(v1[0] - pivotX, scale[0], pivotX),
			Math.fma(v1[1] - pivotY, scale[1], pivotY)
		};
	}
	
	public float[] scalePivotN2f(float[] v1, float pivotX, float pivotY, float scaleX, float scaleY)
	{
		return new float[] {
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY)
		};
	}
	
	public float[] scalePivotN2f(float v1X, float v1Y, float[] pivot, float[] scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		return new float[] {
			Math.fma(v1X - pivotX, scale[0], pivotX),
			Math.fma(v1Y - pivotY, scale[1], pivotY)
		};
	}
	
	public float[] scalePivotN2f(float v1X, float v1Y, float[] pivot, float scaleX, float scaleY)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		return new float[] {
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY)
		};
	}
	
	public float[] scalePivotN2f(float v1X, float v1Y, float pivotX, float pivotY, float[] scale)
	{
		return new float[] {
			Math.fma(v1X - pivotX, scale[0], pivotX),
			Math.fma(v1Y - pivotY, scale[1], pivotY)
		};
	}
	
	public float[] scalePivotN2f(float v1X, float v1Y, float pivotX, float pivotY, float scaleX, float scaleY)
	{
		return new float[] {
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY)
		};
	}
	
	public float[] rotatePivotRad2f(float[] v1, float[] pivot, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		v1[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		v1[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return v1;
	}
	
	public float[] rotatePivotRad2f(float[] v1, float pivotX, float pivotY, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		v1[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		v1[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return v1;
	}
	
	public float[] rotatePivotRadN2f(float[] v1, float[] pivot, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		return new float[] {
			pivotX + Math.fma(dX, cos, -dY * sin),
			pivotY + Math.fma(dX, sin, dY * cos)
		};
	}
	
	public float[] rotatePivotRadN2f(float[] v1, float pivotX, float pivotY, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		return new float[] {
			pivotX + Math.fma(dX, cos, -dY * sin),
			pivotY + Math.fma(dX, sin, dY * cos)
		};
	}
	
	public float[] rotatePivotRadN2f(float v1X, float v1Y, float[] pivot, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		return new float[] {
			pivotX + Math.fma(dX, cos, -dY * sin),
			pivotY + Math.fma(dX, sin, dY * cos)
		};
	}
	
	public float[] rotatePivotRadN2f(float v1X, float v1Y, float pivotX, float pivotY, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		return new float[] {
			pivotX + Math.fma(dX, cos, -dY * sin),
			pivotY + Math.fma(dX, sin, dY * cos)
		};
	}
	
	public float[] rotatePivotRadT2f(float[] v1, float[] pivot, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public float[] rotatePivotRadT2f(float[] v1, float pivotX, float pivotY, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public float[] rotatePivotRadT2f(float v1X, float v1Y, float[] pivot, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public float[] rotatePivotRadT2f(float v1X, float v1Y, float pivotX, float pivotY, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public float[] reflectPoint2f(float[] v1, float[] p1, float[] n)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		
		return v1;
	}
	
	public float[] reflectPoint2f(float[] v1, float[] p1, float nX, float nY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		
		return v1;
	}
	
	public float[] reflectPoint2f(float[] v1, float p1X, float p1Y, float[] n)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		
		return v1;
	}
	
	public float[] reflectPoint2f(float[] v1, float p1X, float p1Y, float nX, float nY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		
		return v1;
	}
	
	public float[] reflectPointN2f(float[] v1, float[] p1, float[] n)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointN2f(float[] v1, float[] p1, float nX, float nY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointN2f(float[] v1, float p1X, float p1Y, float[] n)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointN2f(float[] v1, float p1X, float p1Y, float nX, float nY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointN2f(float v1X, float v1Y, float[] p1, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointN2f(float v1X, float v1Y, float[] p1, float nX, float nY)
	{
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointN2f(float v1X, float v1Y, float p1X, float p1Y, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointN2f(float v1X, float v1Y, float p1X, float p1Y, float nX, float nY)
	{
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, v1X),
			Math.fma(dot, nY, v1Y)
		};
	}
	
	public float[] reflectPointT2f(float[] v1, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointT2f(float[] v1, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointT2f(float[] v1, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointT2f(float[] v1, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointT2f(float v1X, float v1Y, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointT2f(float v1X, float v1Y, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointT2f(float v1X, float v1Y, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointT2f(float v1X, float v1Y, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public float[] reflectPointX2f(float[] v1)
	{
		v1[1] = -v1[1];
		
		return v1;
	}
	
	public float[] reflectPointXN2f(float[] v1)
	{
		return new float[] {
			v1[0],
			-v1[1]
		};
	}
	
	public float[] reflectPointXN2f(float v1X, float v1Y)
	{
		return new float[] {
			v1X,
			-v1Y
		};
	}
	
	public float[] reflectPointXT2f(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[1] = -v1[1];
		
		return res;
	}
	
	public float[] reflectPointXT2f(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = -v1Y;
		
		return res;
	}
	
	public float[] reflectPointY2f(float[] v1)
	{
		v1[0] = -v1[0];
		
		return v1;
	}
	
	public float[] reflectPointYN2f(float[] v1)
	{
		return new float[] {
			-v1[0],
			v1[1]
		};
	}
	
	public float[] reflectPointYN2f(float v1X, float v1Y)
	{
		return new float[] {
			-v1X,
			v1Y
		};
	}
	
	public float[] reflectPointYT2f(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = -v1[0];
		res[1] = v1[1];
		
		return res;
	}
	
	public float[] reflectPointYT2f(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = -v1X;
		res[1] = v1Y;
		
		return res;
	}
	
	public float[] projectPoint2f(float[] v1, float[] p1, float[] n)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		
		return v1;
	}
	
	public float[] projectPoint2f(float[] v1, float[] p1, float nX, float nY)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		
		return v1;
	}
	
	public float[] projectPoint2f(float[] v1, float p1X, float p1Y, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		
		return v1;
	}
	
	public float[] projectPoint2f(float[] v1, float p1X, float p1Y, float nX, float nY)
	{
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		
		return v1;
	}
	
	public float[] projectPointN2f(float[] v1, float[] p1, float[] n)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointN2f(float[] v1, float[] p1, float nX, float nY)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointN2f(float[] v1, float p1X, float p1Y, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointN2f(float[] v1, float p1X, float p1Y, float nX, float nY)
	{
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointN2f(float v1X, float v1Y, float[] p1, float[] n)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointN2f(float v1X, float v1Y, float[] p1, float nX, float nY)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointN2f(float v1X, float v1Y, float p1X, float p1Y, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointN2f(float v1X, float v1Y, float p1X, float p1Y, float nX, float nY)
	{
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		return new float[] {
			Math.fma(dot, nX, p1X),
			Math.fma(dot, nY, p1Y)
		};
	}
	
	public float[] projectPointT2f(float[] v1, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public float[] projectPointT2f(float[] v1, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public float[] projectPointT2f(float[] v1, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public float[] projectPointT2f(float[] v1, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public float[] projectPointT2f(float v1X, float v1Y, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public float[] projectPointT2f(float v1X, float v1Y, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public float[] projectPointT2f(float v1X, float v1Y, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public float[] projectPointT2f(float v1X, float v1Y, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
}
