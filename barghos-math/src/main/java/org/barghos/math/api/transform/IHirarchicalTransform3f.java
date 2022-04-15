package org.barghos.math.api.transform;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.util.BiVectorOrientation3f;
import org.barghos.math.api.vector.Quat3f;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.vector.Vec3f;

public interface IHirarchicalTransform3f extends ITransform3f
{
	IHirarchicalTransform3f set(ITransform3f t);
	
	default IHirarchicalTransform3f setPos(Tup3fR t)
	{
		return (IHirarchicalTransform3f)ITransform3f.super.setPos(t);
	}
	
	IHirarchicalTransform3f setPos(float x, float y, float z);
	
	default ITransform3f setScale(Tup3fR t)
	{
		return (IHirarchicalTransform3f)ITransform3f.super.setScale(t);
	}
	
	default IHirarchicalTransform3f setScale(float factor)
	{
		return (IHirarchicalTransform3f)ITransform3f.super.setScale(factor);
	}
	
	IHirarchicalTransform3f setScale(float x, float y, float z);
	
	IHirarchicalTransform3f setOrientation(BiVectorOrientation3f o);
	IHirarchicalTransform3f setOrientation(Tup3fR forward, Tup3fR up);
	
	default IHirarchicalTransform3f move(Tup3fR t)
	{
		return (IHirarchicalTransform3f)ITransform3f.super.move(t);
	}
	
	IHirarchicalTransform3f move(float x, float y, float z);
	
	default IHirarchicalTransform3f rotate(Tup3fR axis, float angle)
	{
		return (IHirarchicalTransform3f)ITransform3f.super.rotate(axis, angle);
	}
	
	IHirarchicalTransform3f rotate(Quat3f q);
	
	ITransform3f getParent();
	
	Vec3f getAbsolutePos(double alpha);
	Vec3f getAbsoluteScale(double alpha);
	BiVectorOrientation3f getAbsoluteOrientation(double alpha);
	
	Mat4fC getAbsoluteTranslationMatrix(double alpha);
	Mat4fC getAbsoluteScalingMatrix(double alpha);
	Mat4fC getAbsoluteRotationMatrix(double alpha);
	
	default Mat4fC getAbsoluteTransformationMatrix(double alpha)
	{
		ITransform3f parent = getParent();
		
		Mat4fC t = getTransformationMatrix(alpha);
		
		if(parent != null) parent.getTransformationMatrix(alpha).mul(t);
		
		return t;
	}
	
	default Mat4fC getTransformationMatrix(double alpha)
	{
		return (Mat4f)getTranslationMatrix(alpha).mul(getRotationMatrix(alpha)).mul(getScalingMatrix(alpha));
	}
}
