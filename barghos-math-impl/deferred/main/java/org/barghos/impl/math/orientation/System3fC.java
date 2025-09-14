package org.barghos.impl.math.orientation;
//package org.barghos.math.api.model;
//
//import static org.barghos.core.api.tuple.TupleConstants.*;
//
//import org.barghos.core.api.tuple3.Tup3fR;
//
//public interface System3fC extends System3fR, AxisSystem3fC
//{
//	// MISSING_DOC
//	default System3fC setArray(float... v)
//	{
//		return set(v[COMP_X], v[COMP_Y], v[COMP_Z], v[3], v[4], v[5], v[6], v[7], v[8], v[9], v[10], v[11]);
//	}
//	
//	// MISSING_DOC
//	System3fC set(System3fR system);
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, Tup3fR r, Tup3fR u, Tup3fR f)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), r.getX(), r.getY(), r.getZ(), u.getX(), u.getY(), u.getZ(), f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, Tup3fR r, Tup3fR u, float fX, float fY, float fZ)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), r.getX(), r.getY(), r.getZ(), u.getX(), u.getY(), u.getZ(), fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, Tup3fR r, float uX, float uY, float uZ, Tup3fR f)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), r.getX(), r.getY(), r.getZ(), uX, uY, uZ, f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, float rX, float rY, float rZ, Tup3fR u, Tup3fR f)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), rX, rY, rZ, u.getX(), u.getY(), u.getZ(), f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC set(float oX, float oY, float oZ, Tup3fR r, Tup3fR u, Tup3fR f)
//	{
//		return set(oX, oY, oZ, r.getX(), r.getY(), r.getZ(), u.getX(), u.getY(), u.getZ(), f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, Tup3fR r, float uX, float uY, float uZ, float fX, float fY, float fZ)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), r.getX(), r.getY(), r.getZ(), uX, uY, uZ, fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, float rX, float rY, float rZ, Tup3fR u, float fX, float fY, float fZ)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), rX, rY, rZ, u.getX(), u.getY(), u.getZ(), fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default System3fC set(float oX, float oY, float oZ, Tup3fR r, Tup3fR u, float fX, float fY, float fZ)
//	{
//		return set(oX, oY, oZ, r.getX(), r.getY(), r.getZ(), u.getX(), u.getY(), u.getZ(), fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR f)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), rX, rY, rZ, uX, uY, uZ, f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC set(float oX, float oY, float oZ, Tup3fR r, float uX, float uY, float uZ, Tup3fR f)
//	{
//		return set(oX, oY, oZ, r.getX(), r.getY(), r.getZ(), uX, uY, uZ, f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC set(float oX, float oY, float oZ, float rX, float rY, float rZ, Tup3fR u, Tup3fR f)
//	{
//		return set(oX, oY, oZ, rX, rY, rZ, u.getX(), u.getY(), u.getZ(), f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC set(Tup3fR o, float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
//	{
//		return set(o.getX(), o.getY(), o.getZ(), rX, rY, rZ, uX, uY, uZ, fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default System3fC set(float oX, float oY, float oZ, Tup3fR r, float uX, float uY, float uZ, float fX, float fY, float fZ)
//	{
//		return set(oX, oY, oZ, r.getX(), r.getY(), r.getZ(), uX, uY, uZ, fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default System3fC set(float oX, float oY, float oZ, float rX, float rY, float rZ, Tup3fR u, float fX, float fY, float fZ)
//	{
//		return set(oX, oY, oZ, rX, rY, rZ, u.getX(), u.getY(), u.getZ(), fX, fY, fZ);
//	}
//	
//	// MISSING_DOC
//	default System3fC set(float oX, float oY, float oZ, float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR f)
//	{
//		return set(oX, oY, oZ, rX, rY, rZ, uX, uY, uZ, f.getX(), f.getY(), f.getZ());
//	}
//	
//	// MISSING_DOC
//	System3fC set(float oX, float oY, float oZ, float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
//	
//	// MISSING_DOC
//	default System3fC setOrigin(Tup3fR v)
//	{
//		return setOrigin(v.getX(), v.getY(), v.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC setOrigin(float[] v)
//	{
//		return setOrigin(v[COMP_X], v[COMP_Y], v[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	System3fC setOrigin(float x, float y, float z);
//	
//	// MISSING_DOC
//	default System3fC setRight(Tup3fR v)
//	{
//		return setRight(v.getX(), v.getY(), v.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC setRight(float[] v)
//	{
//		return setRight(v[COMP_X], v[COMP_Y], v[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	System3fC setRight(float x, float y, float z);
//	
//	// MISSING_DOC
//	default System3fC setUp(Tup3fR v)
//	{
//		return setUp(v.getX(), v.getY(), v.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC setUp(float[] v)
//	{
//		return setUp(v[COMP_X], v[COMP_Y], v[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	System3fC setUp(float x, float y, float z);
//	
//	// MISSING_DOC
//	default System3fC setForward(Tup3fR v)
//	{
//		return setForward(v.getX(), v.getY(), v.getZ());
//	}
//	
//	// MISSING_DOC
//	default System3fC setForward(float[] v)
//	{
//		return setForward(v[COMP_X], v[COMP_Y], v[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	System3fC setForward(float x, float y, float z);
//}
