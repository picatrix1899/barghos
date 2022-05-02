package org.barghos.math.api.transform;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.vector.QuatfR;

// MISSING_DOC
public interface Orientation3fC extends Orientation3fR, Cloneable
{
	// MISSING_DOC
	Orientation3fC set(Orientation3fR o);
	
	// MISSING_DOC
	default Orientation3fC rotate(Tup3fR axis, float angle)
	{
		return rotate(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Orientation3fC rotate(float[] axis, float angle)
	{
		return rotate(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	Orientation3fC rotate(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	default Orientation3fC rotateDeg(Tup3fR axis, float angle)
	{
		return rotateDeg(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Orientation3fC rotateDeg(float[] axis, float angle)
	{
		return rotateDeg(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	Orientation3fC rotateDeg(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	Orientation3fC rotate(QuatfR q);
	
	// MISSING_DOC
	Orientation3fC transform(Mat4fR m);
	
	Orientation3fC clone();
}
