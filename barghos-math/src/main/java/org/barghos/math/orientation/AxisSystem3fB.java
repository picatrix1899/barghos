package org.barghos.math.orientation;
//package org.barghos.math.api.model;
//
//import static org.barghos.core.api.tuple.TupleConstants.*;
//
//import org.barghos.core.api.tuple3.Tup3fR;
//
//// MISSING_DOC
//public interface AxisSystem3fB extends AxisSystem3fC
//{
//	// MISSING_DOC
//	default AxisSystem3fB setArray(float... v)
//	{
//		return set(v[0], v[1], v[2], v[3], v[4], v[5], v[6], v[7], v[8]);
//	}
//	
//	// MISSING_DOC
//	AxisSystem3fB set(AxisSystem3fR system);
//	
//	// MISSING_DOC
//	default AxisSystem3fB set(Tup3fR r, Tup3fR u, Tup3fR f)
//	{
//		return set(r.getX(), r.getY(), r.getZ(), u.getX(), u.getY(), u.getZ(), f.getX(), f.getY(), f.getZ());
//	}
//
//	// MISSING_DOC
//	AxisSystem3fB set(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
//
//	// MISSING_DOC
//	default AxisSystem3fB set(Tup3fR r, Tup3fR u, float fX, float fY, float fZ)
//	{
//		return set(r.getX(), r.getY(), r.getZ(), u.getX(), u.getY(), u.getZ(), fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default AxisSystem3fB set(Tup3fR r, float uX, float uY, float uZ, Tup3fR f)
//	{
//		return set(r.getX(), r.getY(), r.getZ(), uX, uY, uZ, f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default AxisSystem3fB set(float rX, float rY, float rZ, Tup3fR u, Tup3fR f)
//	{
//		return set(rX, rY, rZ, u.getX(), u.getY(), u.getZ(), f.getX(), f.getY(), f.getZ());
//	}
//
//	// MISSING_DOC
//	default AxisSystem3fB set(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR f)
//	{
//		return set(rX, rY, rZ, uX, uY, uZ, f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default AxisSystem3fB set(float rX, float rY, float rZ, Tup3fR u, float fX, float fY, float fZ)
//	{
//		return set(rX, rY, rZ, u.getX(), u.getY(), u.getZ(), fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default AxisSystem3fB set(Tup3fR r, float uX, float uY, float uZ, float fX, float fY, float fZ)
//	{
//		return set(r.getX(), r.getY(), r.getZ(), uX, uY, uZ, fX, fY, fZ);
//	}
//
//	// MISSING_DOC
//	default AxisSystem3fB setRight(Tup3fR v)
//	{
//		return setRight(v.getX(), v.getY(), v.getZ());
//	}
//	
//	// MISSING_DOC
//	default AxisSystem3fB setRight(float[] v)
//	{
//		return setRight(v[COMP_X], v[COMP_Y], v[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	AxisSystem3fB setRight(float x, float y, float z);
//	
//	// MISSING_DOC
//	default AxisSystem3fB setUp(Tup3fR v)
//	{
//		return setUp(v.getX(), v.getY(), v.getZ());
//	}
//	
//	// MISSING_DOC
//	default AxisSystem3fB setUp(float[] v)
//	{
//		return setUp(v[COMP_X], v[COMP_Y], v[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	AxisSystem3fB setUp(float x, float y, float z);
//	
//	// MISSING_DOC
//	default AxisSystem3fB setForward(Tup3fR v)
//	{
//		return setForward(v.getX(), v.getY(), v.getZ());
//	}
//	
//	// MISSING_DOC
//	default AxisSystem3fB setForward(float[] v)
//	{
//		return setForward(v[COMP_X], v[COMP_Y], v[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	AxisSystem3fB setForward(float x, float y, float z);
//}
