package org.barghos.api.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.matrix.IMat4RF;

public class Mat4PointOpsI3F
{
	private Mat4PointOpsI3F() { }
	
	public static float[] transform(IVec3RF v1, IMat4RF m1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30())));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31())));
		res[2] = Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32())));

		return res;
	}
	
	public static float[] transform(IVec3RF v1, float[] m1, @ExtractionParam float[] res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		res[0] = Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12])));
		res[1] = Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13])));
		res[2] = Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14])));

		return res;
	}
	
	public static float[] transform(float[] v1, IMat4RF m1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30())));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31())));
		res[2] = Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32())));

		return res;
	}
	
	public static float[] transform(float v1X, float v1Y, float v1Z, IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30())));
		res[1] = Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31())));
		res[2] = Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32())));

		return res;
	}
	
	public static <T extends IVec3WF> T transform(IVec3RF v1, IMat4RF m1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30()))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31()))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32())))
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T transform(IVec3RF v1, float[] m1, @ExtractionParam T res)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12]))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13]))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14])))
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T transform(float[] v1, IMat4RF m1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30()))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31()))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32())))
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T transform(float[] v1, float[] m1, @ExtractionParam T res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12]))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13]))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14])))
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T transform(float v1X, float v1Y, float v1Z, IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30()))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31()))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32())))
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T transform(float v1X, float v1Y, float v1Z, float[] m1, @ExtractionParam T res)
	{
		res.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12]))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13]))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14])))
		);
		
		return res;
	}
	
	public static <T extends IVec3WF> T transformAssign(@ExtractionParam T v1, IMat4RF m1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		v1.set(
			Math.fma(m1.m00(), v1X, Math.fma(m1.m10(), v1Y, Math.fma(m1.m20(), v1Z, m1.m30()))),
			Math.fma(m1.m01(), v1X, Math.fma(m1.m11(), v1Y, Math.fma(m1.m21(), v1Z, m1.m31()))),
			Math.fma(m1.m02(), v1X, Math.fma(m1.m12(), v1Y, Math.fma(m1.m22(), v1Z, m1.m32())))
		);
		
		return v1;
	}
	
	public static <T extends IVec3WF> T transformAssign(@ExtractionParam T v1, float[] m1)
	{
		float v1X = v1.x();
		float v1Y = v1.y();
		float v1Z = v1.z();
		
		v1.set(
			Math.fma(m1[0], v1X, Math.fma(m1[4], v1Y, Math.fma(m1[8], v1Z, m1[12]))),
			Math.fma(m1[1], v1X, Math.fma(m1[5], v1Y, Math.fma(m1[9], v1Z, m1[13]))),
			Math.fma(m1[2], v1X, Math.fma(m1[6], v1Y, Math.fma(m1[10], v1Z, m1[14])))
		);
		
		return v1;
	}
	
}
