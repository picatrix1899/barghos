package org.barghos.math.api.transform;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.util.BiVectorOrientation3f;
import org.barghos.math.api.vector.Quatf;
import org.barghos.math.api.vector.QuatfR;
import org.barghos.math.vector.Vec3f;

public interface ITransform3f
{
	default void update() {}
	
	ITransform3f set(ITransform3f t);
	
	default ITransform3f setPos(Tup3fR t)
	{
		return setPos(t.getX(), t.getY(), t.getZ());
	}
	
	ITransform3f setPos(float x, float y, float z);
	
	default ITransform3f setScale(Tup3fR t)
	{
		return setScale(t.getX(), t.getY(), t.getZ());
	}
	
	default ITransform3f setScale(float factor)
	{
		return setScale(factor, factor, factor);
	}
	
	ITransform3f setScale(float x, float y, float z);
	
	ITransform3f setOrientation(BiVectorOrientation3f o);
	ITransform3f setOrientation(Tup3fR forward, Tup3fR up);
	
	default ITransform3f move(Tup3fR t)
	{
		return move(t.getX(), t.getY(), t.getZ());
	}
	
	ITransform3f move(float x, float y, float z);
	
	default ITransform3f rotate(Tup3fR axis, float angle)
	{
		return rotate(Quatf.getFromAxis(axis, angle));
	}
	
	ITransform3f rotate(QuatfR q);
	
	Vec3f getPos(double alpha);
	Vec3f getScale(double alpha);
	BiVectorOrientation3f getOrientation(double alpha);
	
	Mat4fC getTranslationMatrix(double alpha);
	Mat4fC getScalingMatrix(double alpha);
	Mat4fC getRotationMatrix(double alpha);
	
	default Mat4fC getTransformationMatrix(double alpha)
	{
		return getTranslationMatrix(alpha).revMul(getRotationMatrix(alpha)).revMul(getScalingMatrix(alpha));
	}
}
