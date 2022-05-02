package org.barghos.math.api.transform;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.vector.QuatfR;

public interface AxisSystemOrientation3fC extends AxisSystemOrientation3fR, Orientation3fC
{
	// MISSING_DOC
	default AxisSystemOrientation3fC rotate(Tup3fR axis, float angle)
	{
		Orientation3fC.super.rotate(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	default AxisSystemOrientation3fC rotate(float[] axis, float angle)
	{
		Orientation3fC.super.rotate(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	AxisSystemOrientation3fC rotate(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	default AxisSystemOrientation3fC rotateDeg(Tup3fR axis, float angle)
	{
		Orientation3fC.super.rotateDeg(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	default AxisSystemOrientation3fC rotateDeg(float[] axis, float angle)
	{
		Orientation3fC.super.rotateDeg(axis, angle);
		
		return this;
	}
	
	// MISSING_DOC
	AxisSystemOrientation3fC rotateDeg(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	AxisSystemOrientation3fC rotate(QuatfR q);
	
	// MISSING_DOC
	AxisSystemOrientation3fC transform(Mat4fR m);
}
