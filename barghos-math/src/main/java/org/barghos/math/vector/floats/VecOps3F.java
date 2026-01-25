package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public final class VecOps3F
{
	private VecOps3F() { }
	
	public static float squaredLength(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLength(float v1X, float v1Y, float v1Z)
	{
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps(float tolerance, float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps4(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps6(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps8(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float length(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float length(float v1X, float v1Y, float v1Z)
	{
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps(float tolerance, float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps4(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps6(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps8(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float manhattanLength(float[] v1)
	{
		return Math.abs(v1[0]) + Math.abs(v1[1]) + Math.abs(v1[2]);
	}
	
	public static float manhattanLength(float v1X, float v1Y, float v1Z)
	{
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps(float tolerance, float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps4(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps6(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps8(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float chebyshevLength(float[] v1)
	{
		return MathUtils.max(Math.abs(v1[0]), Math.abs(v1[1]), Math.abs(v1[2]));
	}
	
	public static float chebyshevLength(float v1X, float v1Y, float v1Z)
	{
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps(float tolerance, float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps(float tolerance, float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps4(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps4(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps6(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps6(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps8(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps8(float v1X, float v1Y, float v1Z)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float reciprocalSquaredLength(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		return 1.0f / Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float reciprocalSquaredLength(float v1X, float v1Y, float v1Z)
	{
		return 1.0f / Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float reciprocalLength(float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		return MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float reciprocalLength(float v1X, float v1Y, float v1Z)
	{
		return MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float reciprocalManhattanLength(float[] v1)
	{
		return 1.0f / (Math.abs(v1[0]) + Math.abs(v1[1]) + Math.abs(v1[2]));
	}
	
	public static float reciprocalManhattanLength(float v1X, float v1Y, float v1Z)
	{
		return 1.0f / (Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z));
	}
	
	public static float reciprocalChebyshevLength(float[] v1)
	{
		return 1.0f / MathUtils.max(Math.abs(v1[0]), Math.abs(v1[1]), Math.abs(v1[2]));
	}
	
	public static float reciprocalChebyshevLength(float v1X, float v1Y, float v1Z)
	{
		return 1.0f / MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float dot(float[] v1, float[] v2)
	{
		return Math.fma(v1[0], v2[0], Math.fma(v1[1], v2[1], v1[2] * v2[2]));
	}
	
	public static float dot(float[] v1, float v2X, float v2Y, float v2Z)
	{
		return Math.fma(v1[0], v2X, Math.fma(v1[1], v2Y, v1[2]  * v2Z));
	}
	
	public static float dot(float v1X, float v1Y, float v1Z, float[] v2)
	{
		return Math.fma(v1X, v2[0], Math.fma(v1Y, v2[1], v1Z * v2[2]));
	}
	
	public static float dot(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		return Math.fma(v1X, v2X, Math.fma(v1Y, v2Y, v1Z * v2Z));
	}
	
	public static float[] cross(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float v2X = v2[0];
		float v2Y = v2[1];
		float v2Z = v2[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] cross(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] cross(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		float v2X = v2[0];
		float v2Y = v2[1];
		float v2Z = v2[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] cross(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] crossAssign(@ExtractionParam float[] v1, float[] v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float v2X = v2[0];
		float v2Y = v2[1];
		float v2Z = v2[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		v1[0] = vX;
		v1[1] = vY;
		v1[2] = vZ;
		
		return v1;
	}
	
	public static float[] crossAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		v1[0] = vX;
		v1[1] = vY;
		v1[2] = vZ;
		
		return v1;
	}
	
	public static float[] project(float[] v, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] project(float[] v, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] project(float vX, float vY, float vZ, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(vX, tX, Math.fma(vY, tY, vZ * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] project(float vX, float vY, float vZ, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float dot = Math.fma(vX, tX, Math.fma(vY, tY, vZ * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v, float[] t)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		v[2] = tZ * dot;
		
		return v;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v, float tX, float tY, float tZ)
	{
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		v[2] = tZ * dot;
		
		return v;
	}
	
	public static float[] reflect(float[] v, float[] n, @ExtractionParam float[] res)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}

	public static float[] reflect(float[] v, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}
	
	public static float[] reflect(float vX, float vY, float vZ, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}
	
	public static float[] reflect(float vX, float vY, float vZ, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v, float[] n)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		v[0] = Math.fma(nX, dot, vX);
		v[1] = Math.fma(nY, dot, vY);
		v[2] = Math.fma(nZ, dot, vZ);
		
		return v;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v, float nX, float nY, float nZ)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		v[0] = Math.fma(nX, dot, vX);
		v[1] = Math.fma(nY, dot, vY);
		v[2] = Math.fma(nZ, dot, vZ);
		
		return v;
	}
	
	public static float[] normalize(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalize(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		v1[2] = v1Z * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps(float tolerance, float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEps(float tolerance, float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEpsAssign(float tolerance, @ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		v1[2] = v1Z * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps4(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEps4(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEps4Assign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		v1[2] = v1Z * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps6(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEps6(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEps6Assign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		v1[2] = v1Z * recLength;
		
		return v1;
	}
	
	public static float[] normalizeEps8(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEps8(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z))
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));

		res[0] = v1X * recLength;
		res[1] = v1Y * recLength;
		res[2] = v1Z * recLength;
		
		return res;
	}
	
	public static float[] normalizeEps8Assign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z))
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1[0] = v1X * recLength;
		v1[1] = v1Y * recLength;
		v1[2] = v1Z * recLength;
		
		return v1;
	}
	
	public static float[] scale(float[] v1, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scale[0];
		res[1] = v1[1] * scale[1];
		res[2] = v1[2] * scale[2];
		
		return res;
	}
	
	public static float[] scale(float[] v1, float scale, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scale;
		res[1] = v1[1] * scale;
		res[2] = v1[2] * scale;
		
		return res;
	}
	
	public static float[] scale(float[] v1, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scaleX;
		res[1] = v1[1] * scaleY;
		res[2] = v1[2] * scaleZ;
		
		return res;
	}
	
	public static float[] scale(float v1X, float v1Y, float v1Z, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1X * scale[0];
		res[1] = v1Y * scale[1];
		res[2] = v1Z * scale[2];
		
		return res;
	}
	
	public static float[] scale(float v1X, float v1Y, float v1Z, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		res[0] = v1X * scaleX;
		res[1] = v1Y * scaleY;
		res[2] = v1Z * scaleZ;
		
		return res;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] v1, float[] scale)
	{
		v1[0] *= scale[0];
		v1[1] *= scale[1];
		v1[2] *= scale[2];
		
		return v1;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] v1, float scale)
	{
		v1[0] *= scale;
		v1[1] *= scale;
		v1[2] *= scale;
		
		return v1;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] v1, float scaleX, float scaleY, float scaleZ)
	{
		v1[0] *= scaleX;
		v1[1] *= scaleY;
		v1[2] *= scaleZ;
		
		return v1;
	}
	
	public static float[] scalePivot(float[] v1, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1X - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1X - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1Y - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1Y - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float[] pivot, float[] scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scale[2], pivotZ);
		
		return v1;
	}

	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float[] pivot, float scaleX, float scaleY, float scaleZ)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scaleZ, pivotZ);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float pivotX, float pivotY, float pivotZ, float[] scale)
	{
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scale[2], pivotZ);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ)
	{
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scaleZ, pivotZ);
		
		return v1;
	}
	
	public static float[] clampLengthMin(float[] v1, float min, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		res[1] = v1Z;
		
		return res;
	}
	
	public static float[] clampLengthMin(float v1X, float v1Y, float v1Z, float min, @ExtractionParam float[] res)
	{
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] clampLengthMinAssign(@ExtractionParam float[] v1, float min)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1[0] = v1X * f;
			v1[1] = v1Y * f;
			v1[2] = v1Z * f;
		}
		
		return v1;
	}
	
	public static float[] clampLengthMax(float[] v1, float max, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] clampLengthMax(float v1X, float v1Y, float v1Z, float max, @ExtractionParam float[] res)
	{
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] clampLengthMaxAssign(@ExtractionParam float[] v1, float max)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1[0] = v1X * f;
			v1[1] = v1Y * f;
			v1[2] = v1Z * f;
		}
		
		return v1;
	}
	
	public static float[] clampLength(float[] v1, float min, float max, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] clampLength(float v1X, float v1Y, float v1Z, float min, float max, @ExtractionParam float[] res)
	{
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res[0] = v1X * f;
			res[1] = v1Y * f;
			res[2] = v1Z * f;
			
			return res;
		}
		
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] clampLengthAssign(@ExtractionParam float[] v1, float min, float max)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1[0] = v1X * f;
			v1[1] = v1Y * f;
			v1[2] = v1Z * f;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1[0] = v1X * f;
			v1[1] = v1Y * f;
			v1[2] = v1Z * f;
		}
		
		return v1;
	}
	
}
