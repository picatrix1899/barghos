package org.barghos.math.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.LerpUtils;
import org.barghos.core.math.MathUtils;

public class LerpQuatOpsF
{
	private LerpQuatOpsF() { }
	
	public static float[] nlerp(float alpha, float[] q1, float[] q2, @ExtractionParam float[] res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		float dot = Math.fma(q1X, q2X, Math.fma(q1Y, q2Y, Math.fma(q1Z, q2Z, q1W * q2W)));
		
		if(dot < 0.0f)
		{
			q1X = -q1X;
			q1Y = -q1Y;
			q1Z = -q1Z;
			q1W = -q1W;
		}
		
		float tX = LerpUtils.lerp(alpha, q1X, q2X);
		float tY = LerpUtils.lerp(alpha, q1Y, q2Y);
		float tZ = LerpUtils.lerp(alpha, q1Z, q2Z);
		float tW = LerpUtils.lerp(alpha, q1W, q2W);
		
		float recLen = MathUtils.invSqrt(tX * tX + tY * tY + tZ * tZ + tW * tW);
		
		res[0] = tX * recLen;
		res[1] = tY * recLen;
		res[2] = tZ * recLen;
		res[3] = tW * recLen;
		
		return res;
	}
	
	public static float[] nlerp(float alpha, float[] q1, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam float[] res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float dot = Math.fma(q1X, q2X, Math.fma(q1Y, q2Y, Math.fma(q1Z, q2Z, q1W * q2W)));
		
		if(dot < 0.0f)
		{
			q1X = -q1X;
			q1Y = -q1Y;
			q1Z = -q1Z;
			q1W = -q1W;
		}
		
		float tX = LerpUtils.lerp(alpha, q1X, q2X);
		float tY = LerpUtils.lerp(alpha, q1Y, q2Y);
		float tZ = LerpUtils.lerp(alpha, q1Z, q2Z);
		float tW = LerpUtils.lerp(alpha, q1W, q2W);
		
		float recLen = MathUtils.invSqrt(tX * tX + tY * tY + tZ * tZ + tW * tW);
		
		res[0] = tX * recLen;
		res[1] = tY * recLen;
		res[2] = tZ * recLen;
		res[3] = tW * recLen;
		
		return res;
	}
	
	public static float[] nlerp(float alpha, float q1X, float q1Y, float q1Z, float q1W, float[] q2, @ExtractionParam float[] res)
	{
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		float dot = Math.fma(q1X, q2X, Math.fma(q1Y, q2Y, Math.fma(q1Z, q2Z, q1W * q2W)));
		
		if(dot < 0.0f)
		{
			q1X = -q1X;
			q1Y = -q1Y;
			q1Z = -q1Z;
			q1W = -q1W;
		}
		
		float tX = LerpUtils.lerp(alpha, q1X, q2X);
		float tY = LerpUtils.lerp(alpha, q1Y, q2Y);
		float tZ = LerpUtils.lerp(alpha, q1Z, q2Z);
		float tW = LerpUtils.lerp(alpha, q1W, q2W);
		
		float recLen = MathUtils.invSqrt(tX * tX + tY * tY + tZ * tZ + tW * tW);
		
		res[0] = tX * recLen;
		res[1] = tY * recLen;
		res[2] = tZ * recLen;
		res[3] = tW * recLen;
		
		return res;
	}
	
	
	public static float[] nlerp(float alpha, float q1X, float q1Y, float q1Z, float q1W, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam float[] res)
	{
		float dot = Math.fma(q1X, q2X, Math.fma(q1Y, q2Y, Math.fma(q1Z, q2Z, q1W * q2W)));
		
		if(dot < 0.0f)
		{
			q2X = -q2X;
			q2Y = -q2Y;
			q2Z = -q2Z;
			q2W = -q2W;
		}
		
		float tX = LerpUtils.lerp(alpha, q1X, q2X);
		float tY = LerpUtils.lerp(alpha, q1Y, q2Y);
		float tZ = LerpUtils.lerp(alpha, q1Z, q2Z);
		float tW = LerpUtils.lerp(alpha, q1W, q2W);
		
		float recLen = MathUtils.invSqrt(tX * tX + tY * tY + tZ * tZ + tW * tW);
		
		res[0] = tX * recLen;
		res[1] = tY * recLen;
		res[2] = tZ * recLen;
		res[3] = tW * recLen;
		
		return res;
	}
	
	public static float[] slerp(float alpha, float q1X, float q1Y, float q1Z, float q1W, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam float[] res)
	{
		float dot = Math.fma(q1X, q2X, Math.fma(q1Y, q2Y, Math.fma(q1Z, q2Z, q1W * q2W)));
		
		if(dot < 0.0f)
		{
			dot = -dot;
			
			q2X = -q2X;
			q2Y = -q2Y;
			q2Z = -q2Z;
			q2W = -q2W;
		}
		
		dot = MathUtils.clamp(dot, -1.0f, 1.0f);
		
		if(dot > 0.9995f)
		{
			float tX = LerpUtils.lerp(alpha, q1X, q2X);
			float tY = LerpUtils.lerp(alpha, q1Y, q2Y);
			float tZ = LerpUtils.lerp(alpha, q1Z, q2Z);
			float tW = LerpUtils.lerp(alpha, q1W, q2W);
			
			float recLen = MathUtils.invSqrt(tX * tX + tY * tY + tZ * tZ + tW * tW);
			
			res[0] = tX * recLen;
			res[1] = tY * recLen;
			res[2] = tZ * recLen;
			res[3] = tW * recLen;
			
			return res;
		}
		
		float theta = MathUtils.acos(dot);
		float sinTheta = MathUtils.sin(theta);
		
		float w1f = MathUtils.sin((1.0f - alpha) * theta) / sinTheta;
		float w2f = MathUtils.sin(alpha * theta) / sinTheta;
		
		float tX = w1f * q1X + w2f * q2X;
		float tY = w1f * q1Y + w2f * q2Y;
		float tZ = w1f * q1Z + w2f * q2Z;
		float tW = w1f * q1W + w2f * q2W;
		
		float recLen = MathUtils.invSqrt(tX * tX + tY * tY + tZ * tZ + tW * tW);
		
		res[0] = tX * recLen;
		res[1] = tY * recLen;
		res[2] = tZ * recLen;
		res[3] = tW * recLen;
		
		return res;
	}
	
}
