package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public final class PointOps2F
{
	private PointOps2F() { }
	
	public static float squaredDistance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistance(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistance(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistance(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps(float tolerance, float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps(float tolerance, float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps(float tolerance, float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps4(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps4(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps4(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps6(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps6(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps6(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps8(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps8(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float squaredDistanceEps8(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.fma(vX, vX, vY * vY);
	}
	
	public static float distance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distance(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distance(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distance(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps(float tolerance, float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps(float tolerance, float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps(float tolerance, float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps4(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps4(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps4(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps6(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps6(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps6(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps8(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps8(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float distanceEps8(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return MathUtils.sqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float manhattanDistance(float[] v1, float[] v2)
	{
		return Math.abs(v2[0] - v1[0]) + Math.abs(v2[1] - v1[1]);
	}
	
	public static float manhattanDistance(float[] v1, float v2X, float v2Y)
	{
		return Math.abs(v2X - v1[0]) + Math.abs(v2Y - v1[1]);
	}
	
	public static float manhattanDistance(float v1X, float v1Y, float[] v2)
	{
		return Math.abs(v2[0] - v1X) + Math.abs(v2[1] - v1Y);
	}
	
	public static float manhattanDistance(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.abs(v2X - v1X) + Math.abs(v2Y - v1Y);
	}
	
	public static float manhattanDistanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps(float tolerance, float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps(float tolerance, float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps(float tolerance, float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps4(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps4(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps4(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps6(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps6(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps6(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps8(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps8(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float manhattanDistanceEps8(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.abs(vX) + Math.abs(vY);
	}
	
	public static float chebyshevDistance(float[] v1, float[] v2)
	{
		return Math.max(Math.abs(v2[0] - v1[0]), Math.abs(v2[1] - v1[1]));
	}
	
	public static float chebyshevDistance(float[] v1, float v2X, float v2Y)
	{
		return Math.max(Math.abs(v2X - v1[0]), Math.abs(v2Y - v1[1]));
	}
	
	public static float chebyshevDistance(float v1X, float v1Y, float[] v2)
	{
		return Math.max(Math.abs(v2[0] - v1X), Math.abs(v2[1] - v1Y));
	}
	
	public static float chebyshevDistance(float v1X, float v1Y, float v2X, float v2Y)
	{
		return Math.max(Math.abs(v2X - v1X), Math.abs(v2Y - v1Y));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps(float tolerance, float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps(tolerance, vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps4(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps4(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps4(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps4(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps4(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps6(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps6(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps6(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps6(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps6(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps8(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps8(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps8(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float chebyshevDistanceEps8(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		if(CompareVecOps2F.isZeroEps8(vX, vY)) return 0.0f;
		
		return Math.max(Math.abs(vX), Math.abs(vY));
	}
	
	public static float reciprocalSquaredDistance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalSquaredDistance(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalSquaredDistance(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalSquaredDistance(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		return 1.0f / (Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalDistance(float[] v1, float[] v2)
	{
		float vX = v2[0] - v1[0];
		float vY = v2[1] - v1[1];
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalDistance(float[] v1, float v2X, float v2Y)
	{
		float vX = v2X - v1[0];
		float vY = v2Y - v1[1];
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalDistance(float v1X, float v1Y, float[] v2)
	{
		float vX = v2[0] - v1X;
		float vY = v2[1] - v1Y;
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalDistance(float v1X, float v1Y, float v2X, float v2Y)
	{
		float vX = v2X - v1X;
		float vY = v2Y - v1Y;
		
		return MathUtils.invSqrt(Math.fma(vX, vX, vY * vY));
	}
	
	public static float reciprocalManhattanDistance(float[] v1, float[] v2)
	{
		return 1.0f / (Math.abs(v2[0] - v1[0]) + Math.abs(v2[1] - v1[1]));
	}
	
	public static float reciprocalManhattanDistance(float[] v1, float v2X, float v2Y)
	{
		return 1.0f / (Math.abs(v2X - v1[0]) + Math.abs(v2Y - v1[1]));
	}
	
	public static float reciprocalManhattanDistance(float v1X, float v1Y, float[] v2)
	{
		return 1.0f / (Math.abs(v2[0] - v1X) + Math.abs(v2[1] - v1Y));
	}
	
	public static float reciprocalManhattanDistance(float v1X, float v1Y, float v2X, float v2Y)
	{
		return 1.0f / (Math.abs(v2X - v1X) + Math.abs(v2Y - v1Y));
	}
	
	public static float reciprocalChebyshevDistance(float[] v1, float[] v2)
	{
		return 1.0f / Math.max(Math.abs(v2[0] - v1[0]), Math.abs(v2[1] - v1[1]));
	}
	
	public static float reciprocalChebyshevDistance(float[] v1, float v2X, float v2Y)
	{
		return 1.0f / Math.max(Math.abs(v2X - v1[0]), Math.abs(v2Y - v1[1]));
	}
	
	public static float reciprocalChebyshevDistance(float v1X, float v1Y, float[] v2)
	{
		return 1.0f / Math.max(Math.abs(v2[0] - v1X), Math.abs(v2[1] - v1Y));
	}
	
	public static float reciprocalChebyshevDistance(float v1X, float v1Y, float v2X, float v2Y)
	{
		return 1.0f / Math.max(Math.abs(v2X - v1X), Math.abs(v2Y - v1Y));
	}
	
	public static float[] project(float[] v1, float[] p1, float[] n, @ExtractionParam float[] res)
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
	
	public static float[] project(float[] v1, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public static float[] project(float[] v1, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public static float[] project(float[] v1, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, float[] p1, float[] n, @ExtractionParam float[] res)
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
	
	public static float[] project(float v1X, float v1Y, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public static float[] project(float v1X, float v1Y, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, p1X);
		res[1] = Math.fma(dot, nY, p1Y);
		
		return res;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float[] p1, float[] n)
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
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float[] p1, float nX, float nY)
	{
		float p1X = p1[0];
		float p1Y = p1[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		
		return v1;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float[] n)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		
		return v1;
	}
	
	public static float[] projectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float nX, float nY)
	{
		float dot = Math.fma(v1[0] - p1X, nX, (v1[1] - p1Y) * nY);
		
		v1[0] =  Math.fma(dot, nX, p1X);
		v1[1] =  Math.fma(dot, nY, p1Y);
		
		return v1;
	}
	
	public static float[] reflect(float[] v1, float[] p1, float[] n, @ExtractionParam float[] res)
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
	
	public static float[] reflect(float[] v1, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public static float[] reflect(float[] v1, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
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
	
	public static float[] reflect(float[] v1, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float[] p1, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float[] p1, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float p1X, float p1Y, float[] n, @ExtractionParam float[] res)
	{
		float nX = n[0];
		float nY = n[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public static float[] reflect(float v1X, float v1Y, float p1X, float p1Y, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		res[0] = Math.fma(dot, nX, v1X);
		res[1] = Math.fma(dot, nY, v1Y);
		
		return res;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float[] p1, float[] n)
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
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float[] p1, float nX, float nY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1[0], nX, (v1Y - p1[1]) * nY);
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		
		return v1;
	}
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float[] n)
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
	
	public static float[] reflectAssign(@ExtractionParam float[] v1, float p1X, float p1Y, float nX, float nY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float dot = -2.0f * Math.fma(v1X - p1X, nX, (v1Y - p1Y) * nY);
		
		v1[0] = Math.fma(dot, nX, v1X);
		v1[1] = Math.fma(dot, nY, v1Y);
		
		return v1;
	}
	
	public static float[] reflectX(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[1] = -v1[1];
		
		return res;
	}
	
	public static float[] reflectX(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = -v1Y;
		
		return res;
	}
	
	public static float[] reflectXAssign(@ExtractionParam float[] v1)
	{
		v1[1] = -v1[1];
		
		return v1;
	}
	
	public static float[] reflectY(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = -v1[0];
		res[1] = v1[1];
		
		return res;
	}
	
	public static float[] reflectY(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = -v1X;
		res[1] = v1Y;
		
		return res;
	}
	
	public static float[] reflectYAssign(@ExtractionParam float[] v1)
	{
		v1[0] = -v1[0];
		
		return v1;
	}
	
	public static float[] vectorTo(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1[0];
		res[1] = v2[1] - v1[1];
		
		return res;
	}
	
	public static float[] vectorTo(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1[0];
		res[1] = v2Y - v1[1];
		
		return res;
	}
	
	public static float[] vectorTo(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1X;
		res[1] = v2[1] - v1Y;
		
		return res;
	}
	
	public static float[] vectorTo(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1X;
		res[1] = v2Y - v1Y;
		
		return res;
	}
	
	public static float[] vectorToAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v2[0] - v1[0];
		v1[1] = v2[1] - v1[1];
		
		return v1;
	}
	
	public static float[] vectorToAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = v2X - v1[0];
		v1[1] = v2Y - v1[1];
		
		return v1;
	}
	
	public static float[] vectorFrom(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2[0];
		res[1] = v1[1] - v2[1];
		
		return res;
	}
	
	public static float[] vectorFrom(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2X;
		res[1] = v1[1] - v2Y;
		
		return res;
	}
	
	public static float[] vectorFrom(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2[0];
		res[1] = v1Y - v2[1];
		
		return res;
	}
	
	public static float[] vectorFrom(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2X;
		res[1] = v1Y - v2Y;
		
		return res;
	}
	
	public static float[] vectorFromAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v1[0] - v2[0];
		v1[1] = v1[1] - v2[1];
		
		return v1;
	}
	
	public static float[] vectorFromAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = v1[0] - v2X;
		v1[1] = v1[1] - v2Y;
		
		return v1;
	}
	
	public static float[] halfVectorTo(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] - v1[0]);
		res[1] = 0.5f * (v2[1] - v1[1]);
		
		return res;
	}
	
	public static float[] halfVectorTo(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X - v1[0]);
		res[1] = 0.5f * (v2Y - v1[1]);
		
		return res;
	}
	
	public static float[] halfVectorTo(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] - v1X);
		res[1] = 0.5f * (v2[1] - v1Y);
		
		return res;
	}
	
	public static float[] halfVectorTo(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X - v1X);
		res[1] = 0.5f * (v2Y - v1Y);
		
		return res;
	}
	
	public static float[] halfVectorToAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v2[0] - v1[0]);
		v1[1] = 0.5f * (v2[1] - v1[1]);
		
		return v1;
	}
	
	public static float[] halfVectorToAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = 0.5f * (v2X - v1[0]);
		v1[1] = 0.5f * (v2Y - v1[1]);
		
		return v1;
	}
	
	public static float[] halfVectorFrom(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1[0] - v2[0]);
		res[1] = 0.5f * (v1[1] - v2[1]);
		
		return res;
	}
	
	public static float[] halfVectorFrom(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1[0] - v2X);
		res[1] = 0.5f * (v1[1] - v2Y);
		
		return res;
	}
	
	public static float[] halfVectorFrom(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1X - v2[0]);
		res[1] = 0.5f * (v1Y - v2[1]);
		
		return res;
	}
	
	public static float[] halfVectorFrom(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v1X - v2X);
		res[1] = 0.5f * (v1Y - v2Y);
		
		return res;
	}
	
	public static float[] halfVectorFromAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v1[0] - v2[0]);
		v1[1] = 0.5f * (v1[1] - v2[1]);
		
		return v1;
	}
	
	public static float[] halfVectorFromAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = 0.5f * (v1[0] - v2X);
		v1[1] = 0.5f * (v1[1] - v2Y);
		
		return v1;
	}
	
	public static float[] midpoint(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] + v1[0]);
		res[1] = 0.5f * (v2[1] + v1[1]);
		
		return res;
	}
	
	public static float[] midpoint(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X + v1[0]);
		res[1] = 0.5f * (v2Y + v1[1]);
		
		return res;
	}
	
	public static float[] midpoint(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2[0] + v1X);
		res[1] = 0.5f * (v2[1] + v1Y);
		
		return res;
	}
	
	public static float[] midpoint(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = 0.5f * (v2X + v1X);
		res[1] = 0.5f * (v2Y + v1Y);
		
		return res;
	}
	
	public static float[] midpointAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = 0.5f * (v2[0] + v1[0]);
		v1[1] = 0.5f * (v2[1] + v1[1]);
		
		return v1;
	}
	
	public static float[] midpointAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = 0.5f * (v2X + v1[0]);
		v1[1] = 0.5f * (v2Y + v1[1]);
		
		return v1;
	}
	
	public static float[] directionTo(float[] v1, float[] v2, @ExtractionParam float[] res)
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
	
	public static float[] directionTo(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
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
	
	public static float[] directionTo(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
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
	
	public static float[] directionTo(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
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
	
	public static float[] directionToAssign(@ExtractionParam float[] v1, float[] v2)
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
	
	public static float[] directionToAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
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
	
	public static float[] directionFrom(float[] v1, float[] v2, @ExtractionParam float[] res)
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
	
	public static float[] directionFrom(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
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
	
	public static float[] directionFrom(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
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
	
	public static float[] directionFrom(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
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
	
	public static float[] directionFromAssign(@ExtractionParam float[] v1, float[] v2)
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
	
	public static float[] directionFromAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
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
	
	public static float[] translate(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2[0];
		res[1] = v1[1] + v2[1];
		
		return res;
	}
	
	public static float[] translate(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2X;
		res[1] = v1[1] + v2Y;
		
		return res;
	}
	
	public static float[] translate(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2[0];
		res[1] = v1Y + v2[1];
		
		return res;
	}
	
	public static float[] translate(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2X;
		res[1] = v1Y + v2Y;
		
		return res;
	}
	
	public static float[] translateAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] += v2[0];
		v1[1] += v2[1];
		
		return v1;
	}
	
	public static float[] translateAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] += v2X;
		v1[1] += v2Y;
		
		return v1;
	}
	
	public static float[] rotatePivotRad(float[] v1, float[] pivot, float angle, @ExtractionParam float[] res)
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
	
	public static float[] rotatePivotRad(float[] v1, float pivotX, float pivotY, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotRad(float v1X, float v1Y, float[] pivot, float angle, @ExtractionParam float[] res)
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
	
	public static float[] rotatePivotRad(float v1X, float v1Y, float pivotX, float pivotY, float angle, @ExtractionParam float[] res)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotRadAssign(@ExtractionParam float[] v1, float[] pivot, float angle)
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
	
	public static float[] rotatePivotRadAssign(@ExtractionParam float[] v1, float pivotX, float pivotY, float angle)
	{
		float sin = MathUtils.sin(angle);
		float cos = MathUtils.cos(angle);
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		v1[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		v1[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return v1;
	}
	
	public static float[] rotatePivotDeg(float[] v1, float[] pivot, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sin = MathUtils.sin(radAngle);
		float cos = MathUtils.cos(radAngle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotDeg(float[] v1, float pivotX, float pivotY, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sin = MathUtils.sin(radAngle);
		float cos = MathUtils.cos(radAngle);
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotDeg(float v1X, float v1Y, float[] pivot, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sin = MathUtils.sin(radAngle);
		float cos = MathUtils.cos(radAngle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotDeg(float v1X, float v1Y, float pivotX, float pivotY, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sin = MathUtils.sin(radAngle);
		float cos = MathUtils.cos(radAngle);
		
		float dX = v1X - pivotX;
		float dY = v1Y - pivotY;
		
		res[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		res[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return res;
	}
	
	public static float[] rotatePivotDegAssign(@ExtractionParam float[] v1, float[] pivot, float angle)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sin = MathUtils.sin(radAngle);
		float cos = MathUtils.cos(radAngle);
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		v1[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		v1[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return v1;
	}
	
	public static float[] rotatePivotDegAssign(@ExtractionParam float[] v1, float pivotX, float pivotY, float angle)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sin = MathUtils.sin(radAngle);
		float cos = MathUtils.cos(radAngle);
		
		float dX = v1[0] - pivotX;
		float dY = v1[1] - pivotY;
		
		v1[0] = pivotX + Math.fma(dX, cos, -dY * sin);
		v1[1] = pivotY + Math.fma(dX, sin, dY * cos);
		
		return v1;
	}
	
}
