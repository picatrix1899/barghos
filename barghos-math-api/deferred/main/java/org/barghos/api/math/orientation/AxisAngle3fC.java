package org.barghos.api.math.orientation;
//package org.barghos.math.api.model;
//
//import static org.barghos.core.api.tuple.TupleConstants.*;
//
//import org.barghos.core.api.tuple3.Tup3fR;
//
//// MISSING_DOC
//public interface AxisAngle3fC extends AxisAngle3fR, Cloneable
//{
//	default AxisAngle3fC setArray(float... v)
//	{
//		return set(v[COMP_X], v[COMP_Y], v[COMP_Z], v[COMP_W]);
//	}
//	
//	// MISSING_DOC
//	default AxisAngle3fC set(AxisAngle3fR aa)
//	{
//		return set(aa.getAxisX(), aa.getAxisY(), aa.getAxisZ(), aa.getAngle());
//	}
//	
//	// MISSING_DOC
//	default AxisAngle3fC set(Tup3fR axis, float angle)
//	{
//		return set(axis.getX(), axis.getY(), axis.getZ(), angle);
//	}
//	
//	// MISSING_DOC
//	default AxisAngle3fC set(float[] axis, float angle)
//	{
//		return set(axis[COMP_X], axis[COMP_Y], axis[COMP_Z], angle);
//	}
//	
//	// MISSING_DOC
//	default AxisAngle3fC set(float x, float y, float z, float angle)
//	{
//		return setAxis(x, y, z).setAngle(angle);
//	}
//	
//	// MISSING_DOC
//	default AxisAngle3fC setAxis(Tup3fR axis)
//	{
//		return setAxis(axis.getX(), axis.getY(), axis.getZ());
//	}
//	
//	// MISSING_DOC
//	default AxisAngle3fC setAxis(float[] axis)
//	{
//		return setAxis(axis[COMP_X], axis[COMP_Y], axis[COMP_Z]);
//	}
//	
//	// MISSING_DOC
//	AxisAngle3fC setAxis(float x, float y, float z);
//	
//	// MISSING_DOC
//	AxisAngle3fC setAngleDeg(float angle);
//	
//	// MISSING_DOC
//	AxisAngle3fC setAngle(float angle);
//	
//	// MISSING_DOC
//	AxisAngle3fC clone();
//}
