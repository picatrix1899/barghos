//package org.barghos.math.api.model;
//
//import org.barghos.core.api.documentation.ExtractionParam;
//import org.barghos.core.api.tuple3.Tup3fC;
//import org.barghos.core.api.tuple4.Tup4fR;
//import org.barghos.math.api.vector.Vec3fC;
//
//// MISSING_DOC
//public interface AxisAngle3fR extends Tup4fR
//{
//	// MISSING_DOC
//	@Override
//	default float getX()
//	{
//		return getAxisX();
//	}
//	
//	// MISSING_DOC
//	@Override
//	default float getY()
//	{
//		return getAxisY();
//	}
//	
//	// MISSING_DOC
//	@Override
//	default float getZ()
//	{
//		return getAxisZ();
//	}
//	
//	// MISSING_DOC
//	@Override
//	default float getW()
//	{
//		return getAngle();
//	}
//	
//	// MISSING_DOC
//	float getAngleDeg();
//	
//	// MISSING_DOC
//	float getAngle();
//	
//	// MISSING_DOC
//	Vec3fC getAxis();
//	
//	// MISSING_DOC
//	<T extends Tup3fC> T getAxis(@ExtractionParam T res);
//	
//	// MISSING_DOC
//	float[] getAxis(@ExtractionParam float[] res);
//	
//	// MISSING_DOC
//	float getAxisX();
//	
//	// MISSING_DOC
//	float getAxisY();
//	
//	// MISSING_DOC
//	float getAxisZ();
//}
