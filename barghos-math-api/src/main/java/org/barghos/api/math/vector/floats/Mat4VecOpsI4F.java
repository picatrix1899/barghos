package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.matrix.IMat4RF;

public class Mat4VecOpsI4F
{
	private Mat4VecOpsI4F() { }
	
	public static float[] transform(IVec4RF v1, IMat4RF m1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		float v1W = v1.w();
		
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30() * v1W)));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31() * v1W)));
		res[2] = Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32() * v1W)));
		res[2] = Math.fma(m1.m03(), v1X, Math.fma(m1.m13(), v1Y, Math.fma(m1.m23(), v1Z, m1.m33() * v1W)));

		return res;
	}
	
	public static float[] transform(IVec4RF v1, float[] m1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		float v1W = v1.w();
		
		res[0] = Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12] * v1W)));
		res[1] = Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13] * v1W)));
		res[2] = Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14] * v1W)));
		res[2] = Math.fma(m1[3], v1X, Math.fma(m1[7], v1Y, Math.fma(m1[11], v1Z, m1[15] * v1W)));

		return res;
	}
	
	public static float[] transform(float[] v1, IMat4RF m1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30() * v1W)));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31() * v1W)));
		res[2] = Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32() * v1W)));
		res[2] = Math.fma(m1.m03(), v1X, Math.fma(m1.m13(), v1Y, Math.fma(m1.m23(), v1Z, m1.m33() * v1W)));

		return res;
	}
	
	public static float[] transform(float v1X, float v1Y, float v1Z, float v1W, IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30() * v1W)));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31() * v1W)));
		res[2] = Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32() * v1W)));
		res[2] = Math.fma(m1.m03(), v1X, Math.fma(m1.m13(), v1Y, Math.fma(m1.m23(), v1Z, m1.m33() * v1W)));

		return res;
	}
	
	public static <T extends IVec4WF> T transform(IVec4RF v1, IMat4RF m1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		float v1W = v1.w();
		
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30() * v1W))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31() * v1W))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32() * v1W))),
			Math.fma(m1.m03(), v1X, Math.fma(m1.m13(), v1Y, Math.fma(m1.m23(), v1Z, m1.m33() * v1W)))
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T transform(IVec4RF v1, float[] m1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		float v1W = v1.w();
		
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12] * v1W))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13] * v1W))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14] * v1W))),
			Math.fma(m1[3], v1X, Math.fma(m1[7], v1Y, Math.fma(m1[11], v1Z, m1[15] * v1W)))
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T transform(float[] v1, IMat4RF m1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30() * v1W))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31() * v1W))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32() * v1W))),
			Math.fma(m1.m03(), v1X, Math.fma(m1.m13(), v1Y, Math.fma(m1.m23(), v1Z, m1.m33() * v1W)))
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T transform(float[] v1, float[] m1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12] * v1W))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13] * v1W))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14] * v1W))),
			Math.fma(m1[3], v1X, Math.fma(m1[7], v1Y, Math.fma(m1[11], v1Z, m1[15] * v1W)))
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T transform(float v1X, float v1Y, float v1Z, float v1W, IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30() * v1W))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31() * v1W))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32() * v1W))),
			Math.fma(m1.m03(), v1X, Math.fma(m1.m13(), v1Y, Math.fma(m1.m23(), v1Z, m1.m33() * v1W)))
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T transform(float v1X, float v1Y, float v1Z, float v1W, float[] m1, @ExtractionParam T res)
	{
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12] * v1W))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13] * v1W))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14] * v1W))),
			Math.fma(m1[3], v1X, Math.fma(m1[7], v1Y, Math.fma(m1[11], v1Z, m1[15] * v1W)))
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T transformAssign(@ExtractionParam T v1, IMat4RF m1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		float v1W = v1.w();
		
		v1.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30() * v1W))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31() * v1W))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32() * v1W))),
			Math.fma(m1.m03(), v1X, Math.fma(m1.m13(), v1Y, Math.fma(m1.m23(), v1Z, m1.m33() * v1W)))
		);
		
		return v1;
	}
	
	public static <T extends IVec4WF> T transformAssign(@ExtractionParam T v1, float[] m1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		float v1W = v1.w();
		
		v1.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12] * v1W))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13] * v1W))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14] * v1W))),
			Math.fma(m1[3], v1X, Math.fma(m1[7], v1Y, Math.fma(m1[11], v1Z, m1[15] * v1W)))
		);
		
		return v1;
	}
	
}
