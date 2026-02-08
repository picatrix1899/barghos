package org.barghos.impl.math.quaternion;

import org.barghos.core.math.MathUtils;

import org.barghos.api.math.vector.floats.IVec3RF;

public class DefaultQuatsF
{
	private DefaultQuatsF() { }
	
	public static QuatF fromAxisAngleRad(IVec3RF a, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a.x() * sinHalfAngle;
		float y_ = a.y() * sinHalfAngle;
		float z_ = a.z() * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);
		
		return new QuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static QuatF fromAxisAngleRad(float[] a, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a[0] * sinHalfAngle;
		float y_ = a[1] * sinHalfAngle;
		float z_ = a[2] * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return new QuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static QuatF fromAxisAngleRad(float ax, float ay, float az, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = ax * sinHalfAngle;
		float y_ = ay * sinHalfAngle;
		float z_ = az * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);
		
		return new QuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static ConstQuatF fromAxisAngleRad_const(IVec3RF a, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a.x() * sinHalfAngle;
		float y_ = a.y() * sinHalfAngle;
		float z_ = a.z() * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);
		
		return new ConstQuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static ConstQuatF fromAxisAngleRad_const(float[] a, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a[0] * sinHalfAngle;
		float y_ = a[1] * sinHalfAngle;
		float z_ = a[2] * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return new ConstQuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static ConstQuatF fromAxisAngleRad_const(float ax, float ay, float az, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = ax * sinHalfAngle;
		float y_ = ay * sinHalfAngle;
		float z_ = az * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);
		
		return new ConstQuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static QuatF fromAxisAngleDeg(IVec3RF a, float angle)
	{
		float halfAngle = angle * MathUtils.DEG_TO_RADf * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a.x() * sinHalfAngle;
		float y_ = a.y() * sinHalfAngle;
		float z_ = a.z() * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return new QuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static QuatF fromAxisAngleDeg(float[] a, float angle)
	{
		float halfAngle = angle * MathUtils.DEG_TO_RADf * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a[0] * sinHalfAngle;
		float y_ = a[1] * sinHalfAngle;
		float z_ = a[2] * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return new QuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static QuatF fromAxisAngleDeg(float ax, float ay, float az, float angle)
	{
		float halfAngle = angle * MathUtils.DEG_TO_RADf * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = ax * sinHalfAngle;
		float y_ = ay * sinHalfAngle;
		float z_ = az * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);
		
		return new QuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static ConstQuatF fromAxisAngleDeg_const(IVec3RF a, float angle)
	{
		float halfAngle = angle * MathUtils.DEG_TO_RADf * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a.x() * sinHalfAngle;
		float y_ = a.y() * sinHalfAngle;
		float z_ = a.z() * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return new ConstQuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static ConstQuatF fromAxisAngleDeg_const(float[] a, float angle)
	{
		float halfAngle = angle * MathUtils.DEG_TO_RADf * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = a[0] * sinHalfAngle;
		float y_ = a[1] * sinHalfAngle;
		float z_ = a[2] * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return new ConstQuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
	public static ConstQuatF fromAxisAngleDeg_const(float ax, float ay, float az, float angle)
	{
		float halfAngle = angle * MathUtils.DEG_TO_RADf * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = ax * sinHalfAngle;
		float y_ = ay * sinHalfAngle;
		float z_ = az * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);
		
		return new ConstQuatF(
			x_ * invLength,
			y_ * invLength,
			z_ * invLength,
			w_ * invLength
		);
	}
	
}
