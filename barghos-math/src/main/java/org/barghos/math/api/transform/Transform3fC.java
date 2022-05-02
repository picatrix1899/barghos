package org.barghos.math.api.transform;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.vector.QuatfR;

// MISSING_DOC
public interface Transform3fC extends Transform3fR
{
	// MISSING_DOC
	Transform3fC set(Transform3fR t);
	
	// MISSING_DOC
	default Transform3fC setPos(Tup3fR t)
	{
		return setPos(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Transform3fC setPos(float[] t)
	{
		return setPos(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	// MISSING_DOC
	Transform3fC setPos(float x, float y, float z);
	
	// MISSING_DOC
	default Transform3fC setScale(Tup3fR t)
	{
		return setScale(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Transform3fC setScale(float[] t)
	{
		return setScale(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	// MISSING_DOC
	default Transform3fC setScale(float factor)
	{
		return setScale(factor, factor, factor);
	}
	
	// MISSING_DOC
	Transform3fC setScale(float x, float y, float z);
	
	// MISSING_DOC
	Transform3fC setOrientation(Orientation3fR o);
	
	// MISSING_DOC
	default Transform3fC move(Tup3fR t)
	{
		return move(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Transform3fC move(float[] t)
	{
		return move(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	// MISSING_DOC
	Transform3fC move(float x, float y, float z);
	
	// MISSING_DOC
	default Transform3fC rotate(Tup3fR axis, float angle)
	{
		return rotate(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Transform3fC rotate(float[] axis, float angle)
	{
		return rotate(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	Transform3fC rotate(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	default Transform3fC rotateDeg(Tup3fR axis, float angle)
	{
		return rotateDeg(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Transform3fC rotateDeg(float[] axis, float angle)
	{
		return rotateDeg(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
	}
	
	// MISSING_DOC
	Transform3fC rotateDeg(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	Transform3fC rotate(QuatfR q);
}
