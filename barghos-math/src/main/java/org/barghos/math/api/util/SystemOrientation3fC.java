package org.barghos.math.api.util;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fR;

// MISSING_DOC
public interface SystemOrientation3fC extends SystemOrientation3fR
{
	// MISSING_DOC
	SystemOrientation3fC set(SystemOrientation3fR system);
	
	// MISSING_DOC
	default SystemOrientation3fC set(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return set(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(Tup3fR right, Tup3fR up, float[] forward)
	{
		return set(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward[COMP_X], forward[COMP_Y], forward[COMP_Z]);
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return set(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(Tup3fR right, float[] up, Tup3fR forward)
	{
		return set(right.getX(), right.getY(), right.getZ(), up[COMP_X], up[COMP_Y], up[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return set(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(float[] right, Tup3fR up, Tup3fR forward)
	{
		return set(right[COMP_X], right[COMP_Y], right[COMP_Z], up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return set(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(Tup3fR right, float[] up, float[] forward)
	{
		return set(right.getX(), right.getY(), right.getZ(), up[COMP_X], up[COMP_Y], up[COMP_Z], forward[COMP_X], forward[COMP_Y], forward[COMP_Z]);
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return set(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(float[] right, Tup3fR up, float[] forward)
	{
		return set(right[COMP_X], right[COMP_Y], right[COMP_Z], up.getX(), up.getY(), up.getZ(), forward[COMP_X], forward[COMP_Y], forward[COMP_Z]);
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return set(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(float[] right, float[] up, Tup3fR forward)
	{
		return set(right[COMP_X], right[COMP_Y], right[COMP_Z], up[COMP_X], up[COMP_Y], up[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return set(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC set(float[] right, float[] up, float[] forward)
	{
		return set(right[COMP_X], right[COMP_Y], right[COMP_Z], up[COMP_X], up[COMP_Y], up[COMP_Z], forward[COMP_X], forward[COMP_Y], forward[COMP_Z]);
	}
	
	// MISSING_DOC
	SystemOrientation3fC set(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	// MISSING_DOC
	default SystemOrientation3fC setRight(Tup3fR t)
	{
		return setRight(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC setRight(float[] t)
	{
		return setRight(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	// MISSING_DOC
	SystemOrientation3fC setRight(float x, float y, float z);
	
	// MISSING_DOC
	default SystemOrientation3fC setUp(Tup3fR t)
	{
		return setUp(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC setUp(float[] t)
	{
		return setUp(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	// MISSING_DOC
	SystemOrientation3fC setUp(float x, float y, float z);
	
	// MISSING_DOC
	default SystemOrientation3fC setForward(Tup3fR t)
	{
		return setForward(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default SystemOrientation3fC setForward(float[] t)
	{
		return setForward(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	// MISSING_DOC
	SystemOrientation3fC setForward(float x, float y, float z);
	
	// MISSING_DOC
	SystemOrientation3fC transform(Mat4fR m);
	
	// MISSING_DOC
	default SystemOrientation3fC transformN(Mat4fR m)
	{
		return clone().transform(m);
	}
	
	// MISSING_DOC
	SystemOrientation3fC clone();
}
