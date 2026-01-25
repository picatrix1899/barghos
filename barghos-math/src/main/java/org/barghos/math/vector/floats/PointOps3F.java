package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public final class PointOps3F
{
	private PointOps3F() { }
	
	public static float squaredDistance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps(float tolerance, float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps(float tolerance, float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps(float tolerance, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps4(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps4(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps4(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2X - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps6(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps6(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps6(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps8(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps8(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float squaredDistanceEps8(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float distance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps(float tolerance, float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps(float tolerance, float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps(float tolerance, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps4(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps4(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps4(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps6(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps6(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps6(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps8(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps8(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float distanceEps8(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float manhattanDistance(float[] v1, float[] v2)
	{

		return Math.abs(v2[0] - v1[0]) + Math.abs(v2[1] - v1[1]) + Math.abs(v2[2] - v1[2]);
	}
	
	public static float manhattanDistance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		return Math.abs(v2X - v1[0]) + Math.abs(v2Y - v1[1]) + Math.abs(v2Z - v1[2]);
	}
	
	public static float manhattanDistance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		return Math.abs(v2[0] - v1X) + Math.abs(v2[1] - v1Y) + Math.abs(v2[2] - v1Z);
	}
	
	public static float manhattanDistance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		return Math.abs(v2X - v1X) + Math.abs(v2Y - v1Y) + Math.abs(v2Z - v1Z);
	}
	
	public static float manhattanDistanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps(float tolerance, float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps(float tolerance, float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps(float tolerance, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps4(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps4(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps4(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps6(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps6(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps6(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps8(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps8(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float manhattanDistanceEps8(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY) + Math.abs(vZ);
	}
	
	public static float chebyshevDistance(float[] v1, float[] v2)
	{
		return MathUtils.max(Math.abs(v2[0] - v1[0]), Math.abs(v2[1] - v1[1]), Math.abs(v2[2] - v1[2]));
	}
	
	public static float chebyshevDistance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		return MathUtils.max(Math.abs(v2X - v1[0]), Math.abs(v2Y - v1[1]), Math.abs(v2Z - v1[2]));
	}
	
	public static float chebyshevDistance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		return MathUtils.max(Math.abs(v2[0] - v1X), Math.abs(v2[1] - v1Y), Math.abs(v2[2] - v1Z));
	}
	
	public static float chebyshevDistance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		return MathUtils.max(Math.abs(v2X - v1X), Math.abs(v2Y - v1Y), Math.abs(v2Z - v1Z));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps(tolerance, vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps4(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps4(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps4(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps4(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps6(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps6(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps6(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps6(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps8(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps8(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float chebyshevDistanceEps8(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(CompareVecOps3F.isZeroEps8(vX, vY, vZ)) return 0.0f;
		
		return MathUtils.max(Math.abs(vX), Math.abs(vY), Math.abs(vZ));
	}
	
	public static float reciprocalSquaredDistance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		return 1.0f / Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float reciprocalSquaredDistance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		return 1.0f / Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float reciprocalSquaredDistance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		return 1.0f / Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float reciprocalSquaredDistance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		return 1.0f / Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ));
	}
	
	public static float reciprocalDistance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		return MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float reciprocalDistance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		return MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float reciprocalDistance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		return MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float reciprocalDistance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		return MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
	}
	
	public static float reciprocalManhattanDistance(float[] v1, float[] v2)
	{
		return 1.0f / (Math.abs(v2[0] - v1[0]) + Math.abs(v2[1] - v1[1]) + Math.abs(v2[2] - v1[2]));
	}
	
	public static float reciprocalManhattanDistance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		return 1.0f / (Math.abs(v2X - v1[0]) + Math.abs(v2Y - v1[1]) + Math.abs(v2Z - v1[2]));
	}
	
	public static float reciprocalManhattanDistance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		return 1.0f / (Math.abs(v2[0] - v1X) + Math.abs(v2[1] - v1Y) + Math.abs(v2[2] - v1Z));
	}
	
	public static float reciprocalManhattanDistance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		return 1.0f / (Math.abs(v2X - v1X) + Math.abs(v2Y - v1Y) + Math.abs(v2Z - v1Z));
	}
	
	public static float reciprocalChebyshevDistance(float[] v1, float[] v2)
	{
		return 1.0f / MathUtils.max(Math.abs(v2[0] - v1[0]), Math.abs(v2[1] - v1[1]), Math.abs(v2[2] - v1[2]));
	}
	
	public static float reciprocalChebyshevDistance(float[] v1, float v2X, float v2Y, float v2Z)
	{
		return 1.0f / MathUtils.max(Math.abs(v2X - v1[0]), Math.abs(v2Y - v1[1]), Math.abs(v2Z - v1[2]));
	}
	
	public static float reciprocalChebyshevDistance(float v1X, float v1Y, float v1Z, float[] v2)
	{
		return 1.0f / MathUtils.max(Math.abs(v2[0] - v1X), Math.abs(v2[1] - v1Y), Math.abs(v2[2] - v1Z));
	}
	
	public static float reciprocalChebyshevDistance(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z)
	{
		return 1.0f / MathUtils.max(Math.abs(v2X - v1X), Math.abs(v2Y - v1Y), Math.abs(v2Z - v1Z));
	}
	
	public static float[] project(float[] v1, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float p1Z = p1[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] project(float[] v1, float[] p1, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float p1Z = p1[2];
		
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] project(float[] v1, float p1X, float p1Y, float p1Z, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] project(float[] v1, float p1X, float p1Y, float p1Z, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, float v1Z, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float p1Z = p1[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, float v1Z, float[] p1, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float p1Z = p1[2];
		
		float dot = Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, float v1Z, float p1X, float p1Y, float p1Z, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, float v1Z, float p1X, float p1Y, float p1Z, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		res[2] = Math.fma(dot, nZ, p1Z);
		
		return res;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float[] p1, float[] n)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float p1Z = p1[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		v1[2] =  Math.fma(dot, nZ, p1Z);
		
		return v1;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float[] p1, float nX, float nY, float nZ)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		float p1Z = p1[2];
		
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		v1[2] =  Math.fma(dot, nZ, p1Z);
		
		return v1;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float p1Z, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		v1[2] =  Math.fma(dot, nZ, p1Z);
		
		return v1;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float p1Z, float nX, float nY, float nZ)
	{
		float dot = Math.fma(v1[0] - p1X, nX, Math.fma(v1[1] - p1Y, nY, (v1[2] - p1Z) * nZ));
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		v1[2] =  Math.fma(dot, nZ, p1Z);
		
		return v1;
	}
	
	public static float[] reflect(float[] v1, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, Math.fma(v1Y - p1[1], nY, (v1Z - p1[2]) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflect(float[] v1, float[] p1, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, Math.fma(v1Y - p1[1], nY, (v1Z - p1[2]) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflect(float[] v1, float p1X, float p1Y, float p1Z, float[] n, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflect(float[] v1, float p1X, float p1Y, float p1Z, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float v1Z, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, Math.fma(v1Y - p1[1], nY, (v1Z - p1[2]) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float v1Z, float[] p1, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, Math.fma(v1Y - p1[1], nY, (v1Z - p1[2]) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float v1Z, float p1X, float p1Y, float p1Z, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float v1Z, float p1X, float p1Y, float p1Z, float nX, float nY, float nZ, @ExtractionParam float[] res)
	{
		float dot = -2.0f * Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		res[2] = Math.fma(dot, nZ, v1Z);
		
		return res;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float[] p1, float[] n)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, Math.fma(v1Y - p1[1], nY, (v1Z - p1[2]) * nZ));
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		v1[2] = Math.fma(dot, nZ, v1Z);
		
		return v1;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float[] p1, float nX, float nY, float nZ)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, Math.fma(v1Y - p1[1], nY, (v1Z - p1[2]) * nZ));
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		v1[2] = Math.fma(dot, nZ, v1Z);
		
		return v1;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float p1Z, float[] n)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float nX = n[0];
		float nY = n[1];
		float nZ = n[2];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		v1[2] = Math.fma(dot, nZ, v1Z);
		
		return v1;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float p1Z, float nX, float nY, float nZ)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, Math.fma(v1Y - p1Y, nY, (v1Z - p1Z) * nZ));
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		v1[2] = Math.fma(dot, nZ, v1Z);
		
		return v1;
	}
	
	public static float[] reflectXY(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[1] = v1[1];
		res[2] = -v1[2];
		
		return res;
	}
	
	public static float[] reflectXY(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = -v1Z;
		
		return res;
	}
	
	public static float[] reflectXYAssign(@ExtractionParam float[] v1)
	{
		v1[2] = -v1[2];
		
		return v1;
	}
	
	public static float[] reflectXZ(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[1] = -v1[1];
		res[2] = v1[2];
		
		return res;
	}
	
	public static float[] reflectXZ(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = -v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] reflectXZAssign(@ExtractionParam float[] v1)
	{
		v1[1] = -v1[1];
		
		return v1;
	}
	
	public static float[] reflectYZ(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = -v1[0];
		res[1] = v1[1];
		res[2] = v1[2];
		
		return res;
	}
	
	public static float[] reflectYZ(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[0] = -v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] reflectYZAssign(@ExtractionParam float[] v1)
	{
		v1[0] = -v1[0];
		
		return v1;
	}
	
	public static float[] vectorTo(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1[0];
		res[1] = v2[1] - v1[1];
		res[2] = v2[2] - v1[2];
		
		return res;
	}
	
	public static float[] vectorTo(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1[0];
		res[1] = v2Y - v1[1];
		res[2] = v2Z - v1[2];
		
		return res;
	}
	
	public static float[] vectorTo(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1X;
		res[1] = v2[1] - v1Y;
		res[2] = v2[2] - v1Z;
		
		return res;
	}
	
	public static float[] vectorTo(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1X;
		res[1] = v2Y - v1Y;
		res[2] = v2Z - v1Z;
		
		return res;
	}
	
	public static float[] vectorToAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v2[0] - v1[0];
		v1[1] = v2[1] - v1[1];
		v1[2] = v2[2] - v1[2];
		
		return v1;
	}
	
	public static float[] vectorToAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		v1[0] = v2X - v1[0];
		v1[1] = v2Y - v1[1];
		v1[2] = v2Z - v1[2];
		
		return v1;
	}
	
	public static float[] vectorFrom(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2[0];
		res[1] = v1[1] - v2[1];
		res[2] = v1[2] - v2[2];
		
		return res;
	}
	
	public static float[] vectorFrom(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2X;
		res[1] = v1[1] - v2Y;
		res[2] = v1[2] - v2Z;
		
		return res;
	}
	
	public static float[] vectorFrom(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2[0];
		res[1] = v1Y - v2[1];
		res[2] = v1Z - v2[2];
		
		return res;
	}
	
	public static float[] vectorFrom(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2X;
		res[1] = v1Y - v2Y;
		res[2] = v1Z - v2Z;
		
		return res;
	}
	
	public static float[] vectorFromAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v1[0] - v2[0];
		v1[1] = v1[1] - v2[1];
		v1[2] = v1[2] - v2[2];
		
		return v1;
	}
	
	public static float[] vectorFromAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		v1[0] = v1[0] - v2X;
		v1[1] = v1[1] - v2Y;
		v1[2] = v1[2] - v2Z;
		
		return v1;
	}
	
	public static float[] halfVectorTo(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] - v1[0]);
		res[1] = 0.5f * (v2[1] - v1[1]);
		res[2] = 0.5f * (v2[2] - v1[2]);
		
		return res;
	}
	
	public static float[] halfVectorTo(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X - v1[0]);
		res[1] = 0.5f * (v2Y - v1[1]);
		res[2] = 0.5f * (v2Z - v1[2]);
		
		return res;
	}
	
	public static float[] halfVectorTo(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] - v1X);
		res[1] = 0.5f * (v2[1] - v1Y);
		res[2] = 0.5f * (v2[2] - v1Z);
		
		return res;
	}
	
	public static float[] halfVectorTo(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X - v1X);
		res[1] = 0.5f * (v2Y - v1Y);
		res[2] = 0.5f * (v2Z - v1Z);
		
		return res;
	}
	
	public static float[] halfVectorToAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v2[0] - v1[0]);
		v1[1] = 0.5f * (v2[1] - v1[1]);
		v1[2] = 0.5f * (v2[2] - v1[2]);
		
		return v1;
	}
	
	public static float[] halfVectorToAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		v1[0] = 0.5f * (v2X - v1[0]);
		v1[1] = 0.5f * (v2Y - v1[1]);
		v1[2] = 0.5f * (v2Z - v1[2]);
		
		return v1;
	}
	
	public static float[] halfVectorFrom(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1[0] - v2[0]);
		res[1] = 0.5f * (v1[1] - v2[1]);
		res[2] = 0.5f * (v1[2] - v2[2]);
		
		return res;
	}
	
	public static float[] halfVectorFrom(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1[0] - v2X);
		res[1] = 0.5f * (v1[1] - v2Y);
		res[2] = 0.5f * (v1[2] - v2Z);
		
		return res;
	}
	
	public static float[] halfVectorFrom(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1X - v2[0]);
		res[1] = 0.5f * (v1Y - v2[1]);
		res[2] = 0.5f * (v1Z - v2[2]);
		
		return res;
	}
	
	public static float[] halfVectorFrom(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1X - v2X);
		res[1] = 0.5f * (v1Y - v2Y);
		res[2] = 0.5f * (v1Z - v2Z);
		
		return res;
	}
	
	public static float[] halfVectorFromAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v1[0] - v2[0]);
		v1[1] = 0.5f * (v1[1] - v2[1]);
		v1[2] = 0.5f * (v1[2] - v2[2]);
		
		return v1;
	}
	
	public static float[] halfVectorFromAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		v1[0] = 0.5f * (v1[0] - v2X);
		v1[1] = 0.5f * (v1[1] - v2Y);
		v1[2] = 0.5f * (v1[2] - v2Z);
		
		return v1;
	}
	
	public static float[] midpoint(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] + v1[0]);
		res[1] = 0.5f * (v2[1] + v1[1]);
		res[2] = 0.5f * (v2[2] + v1[2]);
		
		return res;
	}
	
	public static float[] midpoint(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X + v1[0]);
		res[1] = 0.5f * (v2Y + v1[1]);
		res[2] = 0.5f * (v2Z + v1[2]);
		
		return res;
	}
	
	public static float[] midpoint(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] + v1X);
		res[1] = 0.5f * (v2[1] + v1Y);
		res[2] = 0.5f * (v2[2] + v1Z);
		
		return res;
	}
	
	public static float[] midpoint(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X + v1X);
		res[1] = 0.5f * (v2Y + v1Y);
		res[2] = 0.5f * (v2Z + v1Z);
		
		return res;
	}
	
	public static float[] midpointAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v2[0] + v1[0]);
		v1[1] = 0.5f * (v2[1] + v1[1]);
		v1[2] = 0.5f * (v2[2] + v1[2]);
		
		return v1;
	}
	
	public static float[] midpointAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		v1[0] = 0.5f * (v2X + v1[0]);
		v1[1] = 0.5f * (v2Y + v1[1]);
		v1[2] = 0.5f * (v2Z + v1[2]);
		
		return v1;
	}
	
	public static float[] directionTo(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionTo(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionTo(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		float vZ = v2[2] - v1Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionTo(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		float vZ = v2Z - v1Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionToAssign(@ExtractionParam float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		float vZ = v2[2] - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		v1[2] = vZ * recLength;
		
		return v1;
	}
	
	public static float[] directionToAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		float vZ = v2Z - v1[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		v1[2] = vZ * recLength;
		
		return v1;
	}
	
	public static float[] directionFrom(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v1[0] - v2[0];
		float vY = v1[1] - v2[1];
		float vZ = v1[2] - v2[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionFrom(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		float vX = v1[0] - v2X;
		float vY = v1[1] - v2Y;
		float vZ = v1[2] - v2Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionFrom(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		float vX = v1X - v2[0];
		float vY = v1Y - v2[1];
		float vZ = v1Z - v2[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionFrom(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		float vX = v1X - v2X;
		float vY = v1Y - v2Y;
		float vZ = v1Z - v2Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));

		res[0] = vX * recLength;
		res[1] = vY * recLength;
		res[2] = vZ * recLength;
		
		return res;
	}
	
	public static float[] directionFromAssign(@ExtractionParam float[] v1, float[] v2)
	{
		float vX = v1[0] - v2[0];
		float vY = v1[1] - v2[1];
		float vZ = v1[2] - v2[2];
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		v1[2] = vZ * recLength;
		
		return v1;
	}
	
	public static float[] directionFromAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		float vX = v1[0] - v2X;
		float vY = v1[1] - v2Y;
		float vZ = v1[2] - v2Z;
		
		if(vX == 0.0f && vY == 0.0f && vZ == 0.0f)
		{
			v1[0] = 0.0f;
			v1[1] = 0.0f;
			v1[2] = 0.0f;
			
			return v1;
		}
		
		float recLength = MathUtils.invSqrt(Math.fma(vX, vX, Math.fma(vY, vY, vZ * vZ)));
		
		v1[0] = vX * recLength;
		v1[1] = vY * recLength;
		v1[2] = vZ * recLength;
		
		return v1;
	}
	
	public static float[] translate(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2[0];
		res[1] = v1[1] + v2[1];
		res[2] = v1[2] + v2[2];
		
		return res;
	}
	
	public static float[] translate(float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2X;
		res[1] = v1[1] + v2Y;
		res[2] = v1[2] + v2Z;
		
		return res;
	}
	
	public static float[] translate(float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2[0];
		res[1] = v1Y + v2[1];
		res[2] = v1Z + v2[2];
		
		return res;
	}
	
	public static float[] translate(float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2X;
		res[1] = v1Y + v2Y;
		res[2] = v1Z + v2Z;
		
		return res;
	}
	
	public static float[] translateAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] += v2[0];
		v1[1] += v2[1];
		v1[2] += v2[2];
		
		return v1;
	}
	
	public static float[] translateAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z)
	{
		v1[0] += v2X;
		v1[1] += v2Y;
		v1[2] += v2Z;
		
		return v1;
	}
	
}
