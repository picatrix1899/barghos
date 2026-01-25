package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;

public final class TriangleOpsI2F
{
	private TriangleOpsI2F() { }
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(IVec2RF p, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float[] v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float[] v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float[] p, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV));
		res[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float[] v1, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float[] v1, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentric(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam float[] res)
	{
		float w = 1.0f - pU - pV;

		res[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV));
		res[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return res;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, IVec2RF v2, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, IVec2RF v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, IVec2RF v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, float[] v2, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, float[] v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, float[] v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, float v2X, float v2Y, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, float v2X, float v2Y, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV));
		p[1] = Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float[] v1, IVec2RF v2, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float[] v1, IVec2RF v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float[] v1, IVec2RF v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float[] v1, float[] v2, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float[] v1, float v2X, float v2Y, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV));
		p[1] = Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float v1X, float v1Y, IVec2RF v2, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float v1X, float v1Y, IVec2RF v2, float[] v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float v1X, float v1Y, float[] v2, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV));
		
		return p;
	}
	
	public static float[] barycentricAssign(@ExtractionParam float[] p, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;

		p[0] = Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV));
		p[1] = Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV));
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(IVec2RF p, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float[] p, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float pU = p[0];
		float pV = p[1];
		
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, IVec2RF v2, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, IVec2RF v2, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, float[] v2, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentric(float pU, float pV, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam T res)
	{
		float w = 1.0f - pU - pV;
		
		res.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, IVec2RF v2, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, IVec2RF v2, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, IVec2RF v2, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, float[] v2, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, float[] v2, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, float[] v2, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, float v2X, float v2Y, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, float v2X, float v2Y, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, IVec2RF v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1.x(), w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1.y(), w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, IVec2RF v2, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, IVec2RF v2, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, IVec2RF v2, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, float[] v2, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, float[] v2, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, float[] v2, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, float v2X, float v2Y, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, float v2X, float v2Y, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1[0], w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1[1], w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, IVec2RF v2, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, IVec2RF v2, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, IVec2RF v2, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2.x(), pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2.y(), pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, float[] v2, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, float[] v2, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, float[] v2, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2[0], pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2[1], pU, v3Y * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, float v2X, float v2Y, IVec2RF v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3.x() * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3.y() * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, float v2X, float v2Y, float[] v3)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3[0] * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3[1] * pV))
		);
		
		return p;
	}
	
	public static <T extends IVec2WF> T barycentricAssign(@ExtractionParam T p, float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y)
	{
		float pU = p.x();
		float pV = p.y();
		
		float w = 1.0f - pU - pV;
		
		p.set(
			Math.fma(v1X, w, Math.fma(v2X, pU, v3X * pV)),
			Math.fma(v1Y, w, Math.fma(v2Y, pU, v3Y * pV))
		);
		
		return p;
	}
	
}
