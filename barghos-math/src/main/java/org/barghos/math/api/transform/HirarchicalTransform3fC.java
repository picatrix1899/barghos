package org.barghos.math.api.transform;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.vector.QuatfR;

public interface HirarchicalTransform3fC extends HirarchicalTransform3fR, Transform3fC
{
	HirarchicalTransform3fC setParent(Transform3fR parent);
	
	// MISSING_DOC
	HirarchicalTransform3fC set(HirarchicalTransform3fC t);
	
	// MISSING_DOC
	default HirarchicalTransform3fC setPos(Tup3fR t)
	{
		Transform3fC.super.setPos(t);
		
		return this;
	}
	
	// MISSING_DOC
	default HirarchicalTransform3fC setPos(float[] t)
	{
		Transform3fC.super.setPos(t);
		
		return this;
	}
	
	// MISSING_DOC
	HirarchicalTransform3fC setPos(float x, float y, float z);
	
	// MISSING_DOC
	default HirarchicalTransform3fC setScale(Tup3fR t)
	{
		Transform3fC.super.setScale(t);
		
		return this;
	}
	
	// MISSING_DOC
	default HirarchicalTransform3fC setScale(float[] t)
	{
		Transform3fC.super.setScale(t);
		
		return this;
	}
	
	// MISSING_DOC
	default HirarchicalTransform3fC setScale(float factor)
	{
		Transform3fC.super.setScale(factor);
		
		return this;
	}
	
	// MISSING_DOC
	HirarchicalTransform3fC setScale(float x, float y, float z);
	
	// MISSING_DOC
	default HirarchicalTransform3fC move(Tup3fR t)
	{
		Transform3fC.super.move(t);
		
		return this;
	}
	
	// MISSING_DOC
	default HirarchicalTransform3fC move(float[] t)
	{
		Transform3fC.super.move(t);
		
		return this;
	}
	
	// MISSING_DOC
	HirarchicalTransform3fC move(float x, float y, float z);
	
	// MISSING_DOC
	default HirarchicalTransform3fC rotate(Tup3fR axis, float angle)
	{
		Transform3fC.super.rotate(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	default HirarchicalTransform3fC rotate(float[] axis, float angle)
	{
		Transform3fC.super.rotate(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	HirarchicalTransform3fC rotate(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	default HirarchicalTransform3fC rotateDeg(Tup3fR axis, float angle)
	{
		Transform3fC.super.rotateDeg(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	default HirarchicalTransform3fC rotateDeg(float[] axis, float angle)
	{
		Transform3fC.super.rotateDeg(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	HirarchicalTransform3fC rotateDeg(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	HirarchicalTransform3fC rotate(QuatfR q);
}
