package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.matrix.IMat4RF;

public class Mat4PointOpsI2F
{
	private Mat4PointOpsI2F() { }
	
	public static float[] transform(IVec2RF v1, IMat4RF m1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, m1.m30()));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, m1.m31()));

		return res;
	}
	
	public static float[] transform(IVec2RF v1, float[] m1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res[0] = Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, m1[12]));
		res[1] = Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, m1[13]));

		return res;
	}
	
	public static float[] transform(float[] v1, IMat4RF m1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, m1.m30()));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, m1.m31()));

		return res;
	}
	
	public static float[] transform(float v1X, float v1Y, IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, m1.m30()));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, m1.m31()));

		return res;
	}
	
	public static <T extends IVec2WF> T transform(IVec2RF v1, IMat4RF m1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, m1.m30())),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, m1.m31()))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T transform(IVec2RF v1, float[] m1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, m1[12])),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, m1[13]))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T transform(float[] v1, IMat4RF m1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, m1.m30())),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, m1.m31()))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T transform(float[] v1, float[] m1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, m1[12])),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, m1[13]))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T transform(float v1X, float v1Y, IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, m1.m30())),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, m1.m31()))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T transform(float v1X, float v1Y, float[] m1, @ExtractionParam T res)
	{
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, m1[12])),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, m1[13]))
		);
		
		return res;
	}
	
	public static <T extends IVec2WF> T transformAssign(@ExtractionParam T v1, IMat4RF m1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, m1.m30())),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, m1.m31()))
		);
		
		return v1;
	}
	
	public static <T extends IVec2WF> T transformAssign(@ExtractionParam T v1, float[] m1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		
		v1.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, m1[12])),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, m1[13]))
		);
		
		return v1;
	}
	
}
