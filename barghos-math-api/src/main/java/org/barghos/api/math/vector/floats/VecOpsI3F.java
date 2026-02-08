package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;
import org.barghos.math.vector.floats.CompareVecOps3F;

public final class VecOpsI3F
{
	private VecOpsI3F() { }
	
	public static float squaredLength(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(v1X == 0.0f && v1Y == 0.0f) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps(float tolerance, IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps4(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps6(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float squaredLengthEps8(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float length(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps(float tolerance, IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps4(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps6(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float lengthEps8(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float manhattanLength(IVec3RF v1)
	{
		return Math.abs(v1.x()) + Math.abs(v1.y()) + Math.abs(v1.z());
	}
	
	public static float manhattanLengthEps(float tolerance, IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps4(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps6(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float manhattanLengthEps8(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z)) return 0.0f;
		
		return Math.abs(v1X) + Math.abs(v1Y) + Math.abs(v1Z);
	}
	
	public static float chebyshevLength(IVec3RF v1)
	{
		return MathUtils.max(Math.abs(v1.x()), Math.abs(v1.y()), Math.abs(v1.z()));
	}
	
	public static float chebyshevLengthEps(float tolerance, IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps4(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps6(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float chebyshevLengthEps8(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z)) return 0.0f;
		
		return MathUtils.max(Math.abs(v1X), Math.abs(v1Y), Math.abs(v1Z));
	}
	
	public static float reciprocalSquaredLength(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		return 1.0f / Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
	}
	
	public static float reciprocalLength(IVec3RF v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		return MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
	}
	
	public static float reciprocalManhattanLength(IVec3RF v1)
	{
		return 1.0f / (Math.abs(v1.x()) + Math.abs(v1.y()) + Math.abs(v1.z()));
	}
	
	public static float reciprocalChebyshevLength(IVec3RF v1)
	{
		return 1.0f / MathUtils.max(Math.abs(v1.x()), Math.abs(v1.y()), Math.abs(v1.z()));
	}
	
	public static float dot(IVec3RF v1, IVec3RF v2)
	{
		return Math.fma(v1.x(), v2.x(), Math.fma(v1.y(), v2.y(), v1.z() * v2.z()));
	}
	
	public static float dot(IVec3RF v1, float[] v2)
	{
		return Math.fma(v1.x(), v2[0], Math.fma(v1.y(), v2[1], v1.z() * v2[2]));
	}
	
	public static float dot(IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		return Math.fma(v1.x(), v2X, Math.fma(v1.y(), v2Y, v1.z() * v2Z));
	}
	
	public static float dot(float[] v1, IVec3RF v2)
	{
		return Math.fma(v1[0], v2.x(), Math.fma(v1[1], v2.y(), v1[2] * v2.z()));
	}
	
	public static float dot(float v1X, float v1Y, float v1Z, IVec3RF v2)
	{
		return Math.fma(v1X, v2.x(), Math.fma(v1Y, v2.y(), v1Z * v2.z()));
	}
	
	public static float[] cross(IVec3RF v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] cross(IVec3RF v1, float[] v2, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static float[] cross(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] cross(float[] v1, IVec3RF v2, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] cross(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam float[] res)
	{
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res[0] = vX;
		res[1] = vY;
		res[2] = vZ;
		
		return res;
	}
	
	public static float[] crossAssign(@ExtractionParam float[] v1, IVec3RF v2)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		v1[0] = vX;
		v1[1] = vY;
		v1[2] = vZ;
		
		return v1;
	}
	
	public static <T extends IVec3WF> T cross(IVec3RF v1, IVec3RF v2, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(IVec3RF v1, float[] v2, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float v2X = v2[0];
		float v2Y = v2[1];
		float v2Z = v2[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(IVec3RF v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(float[] v1, IVec3RF v2, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(float[] v1, float[] v2, @ExtractionParam T res)
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
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(float v1X, float v1Y, float v1Z, IVec3RF v2, @ExtractionParam T res)
	{
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam T res)
	{
		float v2X = v2[0];
		float v2Y = v2[1];
		float v2Z = v2[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T cross(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam T res)
	{
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		res.set(vX, vY, vZ);
		
		return res;
	}
	
	public static <T extends IVec3WF> T crossAssign(@ExtractionParam T v1, IVec3RF v2)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float v2X = v2.x();
		float v2Y = v2.y();
		float v2Z = v2.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		v1.set(vX, vY, vZ);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T crossAssign(@ExtractionParam T v1, float[] v2)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float v2X = v2[0];
		float v2Y = v2[1];
		float v2Z = v2[2];
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		v1.set(vX, vY, vZ);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T crossAssign(@ExtractionParam T v1, float v2X, float v2Y, float v2Z)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float vX = Math.fma(v1Y, v2Z, -v1Z * v2Y);
		float vY = Math.fma(v1Z, v2X, -v1X * v2Z);
		float vZ = Math.fma(v1X, v2Y, -v1Y * v2X);
		
		v1.set(vX, vY, vZ);
		
		return v1;
	}
	
	public static float[] project(IVec3RF v, IVec3RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] project(IVec3RF v, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] project(IVec3RF v, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] project(float[] v, IVec3RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] project(float vX, float vY, float vZ, IVec3RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(vX, tX, Math.fma(vY, tY, vZ * tZ));
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v, IVec3RF t)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		v[0] = tX * dot;
		v[1] = tY * dot;
		v[2] = tZ * dot;
		
		return v;
	}
	
	public static <T extends IVec3WF> T project(IVec3RF v, IVec3RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(IVec3RF v, float[] t, @ExtractionParam T res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(IVec3RF v, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(float[] v, IVec3RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(float[] v, float[] t, @ExtractionParam T res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(float[] v, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		float dot = Math.fma(v[0], tX, Math.fma(v[1], tY, v[2] * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(float vX, float vY, float vZ, IVec3RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(vX, tX, Math.fma(vY, tY, vZ * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(float vX, float vY, float vZ, float[] t, @ExtractionParam T res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(vX, tX, Math.fma(vY, tY, vZ * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T project(float vX, float vY, float vZ, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		float dot = Math.fma(vX, tX, Math.fma(vY, tY, vZ * tZ));
		
		res.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T projectAssign(@ExtractionParam T v, IVec3RF t)
	{
		float tX = t.x();
		float tY = t.y();
		float tZ = t.z();
		
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		v.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return v;
	}
	
	public static <T extends IVec3WF> T projectAssign(@ExtractionParam T v, float[] t)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		v.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return v;
	}
	
	public static <T extends IVec3WF> T projectAssign(@ExtractionParam T v, float tX, float tY, float tZ)
	{
		float dot = Math.fma(v.x(), tX, Math.fma(v.y(), tY, v.z() * tZ));
		
		v.set(
			tX * dot,
			tY * dot,
			tZ * dot
		);
		
		return v;
	}
	
	public static float[] reflect(IVec3RF v, IVec3RF n, @ExtractionParam float[] res)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}
	
	public static float[] reflect(IVec3RF v, float[] n, @ExtractionParam float[] res)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}
	
	public static float[] reflect(IVec3RF v, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}
	
	public static float[] reflect(float[] v, IVec3RF n, @ExtractionParam float[] res)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}

	public static float[] reflect(float vX, float vY, float vZ, IVec3RF n, @ExtractionParam float[] res)
	{
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res[0] = Math.fma(nX, dot, vX);
		res[1] = Math.fma(nY, dot, vY);
		res[2] = Math.fma(nZ, dot, vZ);
		
		return res;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v, IVec3RF n)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		v[0] = Math.fma(nX, dot, vX);
		v[1] = Math.fma(nY, dot, vY);
		v[2] = Math.fma(nZ, dot, vZ);
		
		return v;
	}
	
	public static <T extends IVec3WF> T reflect(IVec3RF v, IVec3RF n, @ExtractionParam T res)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(IVec3RF v, float[] n, @ExtractionParam T res)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(IVec3RF v, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(float[] v, IVec3RF n, @ExtractionParam T res)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(float[] v, float[] n, @ExtractionParam T res)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(float[] v, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		float vX = v[0];
		float vY = v[1];
		float vZ = v[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(float vX, float vY, float vZ, IVec3RF n, @ExtractionParam T res)
	{
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(float vX, float vY, float vZ, float[] n, @ExtractionParam T res)
	{
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflect(float vX, float vY, float vZ, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		res.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T reflectAssign(@ExtractionParam T v, IVec3RF n)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		float nX = n.x();
		float nY = n.y();
		float nZ = n.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		v.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return v;
	}
	
	public static <T extends IVec3WF> T reflectAssign(@ExtractionParam T v, float[] n)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * vZ));
		
		v.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return v;
	}
	
	public static <T extends IVec3WF> T reflectAssign(@ExtractionParam T v, float nX, float nY, float nZ)
	{
		float vX = v.x();
		float vY = v.y();
		float vZ = v.z();
		
		float dot = -2 * Math.fma(vX, nX, Math.fma(vY, nY, vZ * nZ));
		
		v.set(
			Math.fma(nX, dot, vX),
			Math.fma(nY, dot, vY),
			Math.fma(nZ, dot, vZ)
		);
		
		return v;
	}
	
	public static float[] normalize(IVec3RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T normalize(IVec3RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalize(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalize(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeAssign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(v1X == 0.0f && v1Y == 0.0f && v1Z == 0.0f)
		{
			v1.set(0.0f, 0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps(float tolerance, IVec3RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T normalizeEps(float tolerance, IVec3RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps(float tolerance, float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps(float tolerance, float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEpsAssign(float tolerance, @ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps(tolerance, v1X, v1Y, v1Z))
		{
			v1.set(0.0f, 0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps4(IVec3RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T normalizeEps4(IVec3RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps4(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps4(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps4Assign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps4(v1X, v1Y, v1Z))
		{
			v1.set(0.0f, 0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps6(IVec3RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T normalizeEps6(IVec3RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps6(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps6(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps6(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps6(v1X, v1Y, v1Z))
		{
			v1.set(0.0f, 0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return v1;
	}
	
	public static float[] normalizeEps8(IVec3RF v1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T normalizeEps8(IVec3RF v1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps8(float[] v1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps8(float v1X, float v1Y, float v1Z, @ExtractionParam T res)
	{
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z))
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		res.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T normalizeEps8Assign(@ExtractionParam T v1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		if(CompareVecOps3F.isZeroEps8(v1X, v1Y, v1Z))
		{
			v1.set(0.0f, 0.0f, 0.0f);
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z)));
		
		v1.set(
			v1X * recLength,
			v1Y * recLength,
			v1Z * recLength
		);
		
		return v1;
	}
	
	public static float[] scale(IVec3RF v1, IVec3RF scale, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scale.x();
		res[1] = v1.y() * scale.y();
		res[2] = v1.z() * scale.z();
		
		return res;
	}
	
	public static float[] scale(IVec3RF v1, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scale[0];
		res[1] = v1.y() * scale[1];
		res[2] = v1.z() * scale[2];
		
		return res;
	}
	
	public static float[] scale(IVec3RF v1, float scale, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scale;
		res[1] = v1.y() * scale;
		res[2] = v1.z() * scale;
		
		return res;
	}
	
	public static float[] scale(IVec3RF v1, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		res[0] = v1.x() * scaleX;
		res[1] = v1.y() * scaleY;
		res[2] = v1.z() * scaleZ;
		
		return res;
	}
	
	public static float[] scale(float[] v1, IVec3RF scale, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * scale.x();
		res[1] = v1[1] * scale.y();
		res[2] = v1[2] * scale.z();
		
		return res;
	}
	
	public static float[] scale(float v1X, float v1Y, float v1Z, IVec3RF scale, @ExtractionParam float[] res)
	{
		res[0] = v1X * scale.x();
		res[1] = v1Y * scale.y();
		res[2] = v1Z * scale.z();
		
		return res;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] v1, IVec3RF scale)
	{
		v1[0] = v1[0] * scale.x();
		v1[1] = v1[1] * scale.y();
		v1[2] = v1[2] * scale.z();
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scale(IVec3RF v1, IVec3RF scale, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scale.x(),
			v1.y() * scale.y(),
			v1.z() * scale.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(IVec3RF v1, float[] scale, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scale[0],
			v1.y() * scale[1],
			v1.z() * scale[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(IVec3RF v1, float scale, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scale,
			v1.y() * scale,
			v1.z() * scale
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(IVec3RF v1, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		res.set(
			v1.x() * scaleX,
			v1.y() * scaleY,
			v1.z() * scaleZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(float[] v1, IVec3RF scale, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scale.x(),
			v1[1] * scale.y(),
			v1[2] * scale.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(float[] v1, float[] scale, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scale[0],
			v1[1] * scale[1],
			v1[2] * scale[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(float[] v1, float scale, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scale,
			v1[1] * scale,
			v1[2] * scale
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(float[] v1, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		res.set(
			v1[0] * scaleX,
			v1[1] * scaleY,
			v1[2] * scaleZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(float v1X, float v1Y, float v1Z, IVec3RF scale, @ExtractionParam T res)
	{
		res.set(
			v1X * scale.x(),
			v1Y * scale.y(),
			v1Z * scale.z()
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(float v1X, float v1Y, float v1Z, float[] scale, @ExtractionParam T res)
	{
		res.set(
			v1X * scale[0],
			v1Y * scale[1],
			v1Z * scale[2]
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scale(float v1X, float v1Y, float v1Z, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		res.set(
			v1X * scaleX,
			v1Y * scaleY,
			v1Z * scaleZ
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scaleAssign(@ExtractionParam T v1, IVec3RF scale)
	{
		v1.set(
			v1.x() * scale.x(),
			v1.y() * scale.y(),
			v1.z() * scale.z()
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scaleAssign(@ExtractionParam T v1, float[] scale)
	{
		v1.set(
			v1.x() * scale[0],
			v1.y() * scale[1],
			v1.z() * scale[2]
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scaleAssign(@ExtractionParam T v1, float scale)
	{
		v1.set(
			v1.x() * scale,
			v1.y() * scale,
			v1.z() * scale
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scaleAssign(@ExtractionParam T v1, float scaleX, float scaleY, float scaleZ)
	{
		v1.set(
			v1.x() * scaleX,
			v1.y() * scaleY,
			v1.z() * scaleZ
		);
		
		return v1;
	}
	
	public static float[] scalePivot(IVec3RF v1, IVec3RF pivot, IVec3RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1.x() - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, IVec3RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1.x() - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, IVec3RF pivot, float scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1.x() - pivotX, scale, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale, pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, IVec3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1.x() - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, float[] pivot, IVec3RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1.x() - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1.x() - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, float[] pivot, float scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1.x() - pivotX, scale, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale, pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1.x() - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, float pivotX, float pivotY, float pivotZ, IVec3RF scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x() - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x() - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(IVec3RF v1, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1.x() - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1.y() - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1.z() - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec3RF pivot, IVec3RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec3RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec3RF pivot, float scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1[0] - pivotX, scale, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale, pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scale, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, IVec3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float[] pivot, IVec3RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float[] v1, float pivotX, float pivotY, float pivotZ, IVec3RF scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1[2] - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, IVec3RF pivot, IVec3RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1X - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, IVec3RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1X - pivotX, scale[0], pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale[1], pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scale[2], pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, IVec3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res[0] = Math.fma(v1X - pivotX, scaleX, pivotX);
		res[1] = Math.fma(v1Y - pivotY, scaleY, pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scaleZ, pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, float[] pivot, IVec3RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res[0] = Math.fma(v1X - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivot(float v1X, float v1Y, float v1Z, float pivotX, float pivotY, float pivotZ, IVec3RF scale, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X - pivotX, scale.x(), pivotX);
		res[1] = Math.fma(v1Y - pivotY, scale.y(), pivotY);
		res[2] = Math.fma(v1Z - pivotZ, scale.z(), pivotZ);
		
		return res;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec3RF pivot, IVec3RF scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scale.z(), pivotZ);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec3RF pivot, float[] scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1[0] = Math.fma(v1[0] - pivotX, scale[0], pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale[1], pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scale[2], pivotZ);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec3RF pivot, float scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1[0] = Math.fma(v1[0] - pivotX, scale, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale, pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scale, pivotZ);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, IVec3RF pivot, float scaleX, float scaleY, float scaleZ)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1[0] = Math.fma(v1[0] - pivotX, scaleX, pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scaleY, pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scaleZ, pivotZ);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float[] pivot, IVec3RF scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		v1[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scale.z(), pivotZ);
		
		return v1;
	}
	
	public static float[] scalePivotAssign(@ExtractionParam float[] v1, float pivotX, float pivotY, float pivotZ, IVec3RF scale)
	{
		v1[0] = Math.fma(v1[0] - pivotX, scale.x(), pivotX);
		v1[1] = Math.fma(v1[1] - pivotY, scale.y(), pivotY);
		v1[2] = Math.fma(v1[2] - pivotZ, scale.z(), pivotZ);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, IVec3RF pivot, IVec3RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY),
			Math.fma(v1.z() - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, IVec3RF pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			 Math.fma(v1.x() - pivotX, scale[0], pivotX),
			 Math.fma(v1.y() - pivotY, scale[1], pivotY),
			 Math.fma(v1.z() - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, IVec3RF pivot, float scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1.x() - pivotX, scale, pivotX),
			Math.fma(v1.y() - pivotY, scale, pivotY),
			Math.fma(v1.z() - pivotZ, scale, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, IVec3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY),
			Math.fma(v1.z() - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, float[] pivot, IVec3RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY),
			Math.fma(v1.z() - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY),
			Math.fma(v1.z() - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, float[] pivot, float scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1.x() - pivotX, scale, pivotX),
			Math.fma(v1.y() - pivotY, scale, pivotY),
			Math.fma(v1.z() - pivotZ, scale, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY),
			Math.fma(v1.z() - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, float pivotX, float pivotY, float pivotZ, IVec3RF scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY),
			Math.fma(v1.z() - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY),
			Math.fma(v1.z() - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(IVec3RF v1, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY),
			Math.fma(v1.z() - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, IVec3RF pivot, IVec3RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1[0] - pivotX, scale.x(), pivotX),
			Math.fma(v1[1] - pivotY, scale.y(), pivotY),
			Math.fma(v1[2] - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, IVec3RF pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			 Math.fma(v1[0] - pivotX, scale[0], pivotX),
			 Math.fma(v1[1] - pivotY, scale[1], pivotY),
			 Math.fma(v1[2] - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, IVec3RF pivot, float scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1[0] - pivotX, scale, pivotX),
			Math.fma(v1[1] - pivotY, scale, pivotY),
			Math.fma(v1[2] - pivotZ, scale, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, IVec3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY),
			Math.fma(v1[2] - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, float[] pivot, IVec3RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1[0] - pivotX, scale.x(), pivotX),
			Math.fma(v1[1] - pivotY, scale.y(), pivotY),
			Math.fma(v1[2] - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1[0] - pivotX, scale[0], pivotX),
			Math.fma(v1[1] - pivotY, scale[1], pivotY),
			Math.fma(v1[2] - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, float[] pivot, float scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1[0] - pivotX, scale, pivotX),
			Math.fma(v1[1] - pivotY, scale, pivotY),
			Math.fma(v1[2] - pivotZ, scale, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY),
			Math.fma(v1[2] - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, float pivotX, float pivotY, float pivotZ, IVec3RF scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0] - pivotX, scale.x(), pivotX),
			Math.fma(v1[1] - pivotY, scale.y(), pivotY),
			Math.fma(v1[2] - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0] - pivotX, scale[0], pivotX),
			Math.fma(v1[1] - pivotY, scale[1], pivotY),
			Math.fma(v1[2] - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float[] v1, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1[0] - pivotX, scaleX, pivotX),
			Math.fma(v1[1] - pivotY, scaleY, pivotY),
			Math.fma(v1[2] - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, IVec3RF pivot, IVec3RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1X - pivotX, scale.x(), pivotX),
			Math.fma(v1Y - pivotY, scale.y(), pivotY),
			Math.fma(v1Z - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, IVec3RF pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			 Math.fma(v1X - pivotX, scale[0], pivotX),
			 Math.fma(v1Y - pivotY, scale[1], pivotY),
			 Math.fma(v1Z - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, IVec3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		res.set(
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY),
			Math.fma(v1Z - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, float[] pivot, IVec3RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1X - pivotX, scale.x(), pivotX),
			Math.fma(v1Y - pivotY, scale.y(), pivotY),
			Math.fma(v1Z - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1X - pivotX, scale[0], pivotX),
			Math.fma(v1Y - pivotY, scale[1], pivotY),
			Math.fma(v1Z - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		res.set(
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY),
			Math.fma(v1Z - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, float pivotX, float pivotY, float pivotZ, IVec3RF scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X - pivotX, scale.x(), pivotX),
			Math.fma(v1Y - pivotY, scale.y(), pivotY),
			Math.fma(v1Z - pivotZ, scale.z(), pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X - pivotX, scale[0], pivotX),
			Math.fma(v1Y - pivotY, scale[1], pivotY),
			Math.fma(v1Z - pivotZ, scale[2], pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivot(float v1X, float v1Y, float v1Z, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res)
	{
		res.set(
			Math.fma(v1X - pivotX, scaleX, pivotX),
			Math.fma(v1Y - pivotY, scaleY, pivotY),
			Math.fma(v1Z - pivotZ, scaleZ, pivotZ)
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, IVec3RF pivot, IVec3RF scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY),
			Math.fma(v1.z() - pivotZ, scale.z(), pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, IVec3RF pivot, float[] scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1.set(
			 Math.fma(v1.x() - pivotX, scale[0], pivotX),
			 Math.fma(v1.y() - pivotY, scale[1], pivotY),
			 Math.fma(v1.z() - pivotZ, scale[2], pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, IVec3RF pivot, float scale)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale, pivotX),
			Math.fma(v1.y() - pivotY, scale, pivotY),
			Math.fma(v1.z() - pivotZ, scale, pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, IVec3RF pivot, float scaleX, float scaleY, float scaleZ)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		float pivotZ = pivot.z();
		
		v1.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY),
			Math.fma(v1.z() - pivotZ, scaleZ, pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, float[] pivot, IVec3RF scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY),
			Math.fma(v1.z() - pivotZ, scale.z(), pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, float[] pivot, float[] scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY),
			Math.fma(v1.z() - pivotZ, scale[2], pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, float[] pivot, float scale)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		v1.set(
			Math.fma(v1.x() - pivotX, scale, pivotX),
			Math.fma(v1.y() - pivotY, scale, pivotY),
			Math.fma(v1.z() - pivotZ, scale, pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, float[] pivot, float scaleX, float scaleY, float scaleZ)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		v1.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY),
			Math.fma(v1.z() - pivotZ, scaleZ, pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, float pivotX, float pivotY, float pivotZ, IVec3RF scale)
	{
		v1.set(
			Math.fma(v1.x() - pivotX, scale.x(), pivotX),
			Math.fma(v1.y() - pivotY, scale.y(), pivotY),
			Math.fma(v1.z() - pivotZ, scale.z(), pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, float pivotX, float pivotY, float pivotZ, float[] scale)
	{
		v1.set(
			Math.fma(v1.x() - pivotX, scale[0], pivotX),
			Math.fma(v1.y() - pivotY, scale[1], pivotY),
			Math.fma(v1.z() - pivotZ, scale[2], pivotZ)
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T scalePivotAssign(@ExtractionParam T v1, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ)
	{
		v1.set(
			Math.fma(v1.x() - pivotX, scaleX, pivotX),
			Math.fma(v1.y() - pivotY, scaleY, pivotY),
			Math.fma(v1.z() - pivotZ, scaleZ, pivotZ)
		);
		
		return v1;
	}
	
	public static float[] clampLengthMin(IVec3RF v1, float min, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T clampLengthMin(IVec3RF v1, float min, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLengthMin(float[] v1, float min, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLengthMin(float v1X, float v1Y, float v1Z, float min, @ExtractionParam T res)
	{
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLengthMinAssign(@ExtractionParam T v1, float min)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float sqMin = min * min;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return v1;
		}
		
		return v1;
	}
	
	public static float[] clampLengthMax(IVec3RF v1, float max, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T clampLengthMax(IVec3RF v1, float max, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLengthMax(float[] v1, float max, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLengthMax(float v1X, float v1Y, float v1Z, float max, @ExtractionParam T res)
	{
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLengthMaxAssign(@ExtractionParam T v1, float max)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return v1;
		}
		
		return v1;
	}
	
	public static float[] clampLength(IVec3RF v1, float min, float max, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
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
	
	public static <T extends IVec3WF> T clampLength(IVec3RF v1, float min, float max, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLength(float[] v1, float min, float max, @ExtractionParam T res)
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
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLength(float v1X, float v1Y, float v1Z, float min, float max, @ExtractionParam T res)
	{
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			res.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return res;
		}
		
		res.set(v1X, v1Y, v1Z);
		
		return res;
	}
	
	public static <T extends IVec3WF> T clampLength(@ExtractionParam T v1, float min, float max)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		float sqMin = min * min;
		float sqMax = max * max;
		
		float sqLen = Math.fma(v1X, v1X, Math.fma(v1Y, v1Y, v1Z * v1Z));
		
		if(sqLen < sqMin)
		{
			float f = min * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return v1;
		}
		else if(sqLen > sqMax)
		{
			float f = max * MathUtils.invSqrt(sqLen);
			
			v1.set(
				v1X * f,
				v1Y * f,
				v1Z * f
			);
			
			return v1;
		}
		
		return v1;
	}
	
}
