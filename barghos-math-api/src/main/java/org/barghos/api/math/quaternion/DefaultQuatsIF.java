package org.barghos.api.math.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.vector.floats.IVec3RF;
import org.barghos.core.math.MathUtils;

public class DefaultQuatsIF
{
	private DefaultQuatsIF() { }
	
	public static float[] fromAxisAngleRad(IVec3RF a, float angle, @ExtractionParam float[] res)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a.x() * sinHalfAngle;
		float y_ = a.y() * sinHalfAngle;
		float z_ = a.z() * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res[0] = x_ * invLength;
		res[1] = y_ * invLength;
		res[2] = z_ * invLength;
		res[3] = w_ * invLength;
		
		return res;
	}
	
	public static float[] fromAxisAngleRad(float[] a, float angle, @ExtractionParam float[] res)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a[0] * sinHalfAngle;
		float y_ = a[1] * sinHalfAngle;
		float z_ = a[2] * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res[0] = x_ * invLength;
		res[1] = y_ * invLength;
		res[2] = z_ * invLength;
		res[3] = w_ * invLength;
		
		return res;
	}
	
	public static float[] fromAxisAngleRad(float ax, float ay, float az, float angle, @ExtractionParam float[] res)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = ax * sinHalfAngle;
		float y_ = ay * sinHalfAngle;
		float z_ = az * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res[0] = x_ * invLength;
		res[1] = y_ * invLength;
		res[2] = z_ * invLength;
		res[3] = w_ * invLength;
		
		return res;
	}
	
	public static <T extends IQuatWF> T fromAxisAngleRad(IVec3RF a, float angle, @ExtractionParam T res)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a.x() * sinHalfAngle;
		float y_ = a.y() * sinHalfAngle;
		float z_ = a.z() * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res.set(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T fromAxisAngleRad(float[] a, float angle, @ExtractionParam T res)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a[0] * sinHalfAngle;
		float y_ = a[1] * sinHalfAngle;
		float z_ = a[2] * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		res.set(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T fromAxisAngleRad(float ax, float ay, float az, float angle, @ExtractionParam T res)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = ax * sinHalfAngle;
		float y_ = ay * sinHalfAngle;
		float z_ = az * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);
		
		res.set(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
		
		return res;
	}
}
