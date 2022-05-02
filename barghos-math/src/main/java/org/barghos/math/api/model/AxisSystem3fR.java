package org.barghos.math.api.model;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.vector.Vec3fC;

// MISSING_DOC
public interface AxisSystem3fR extends TupfR
{
	@Override
	default int getDimensions()
	{
		return 9;
	}
	
	// MISSING_DOC
	Vec3fC getRight();
	
	// MISSING_DOC
	<T extends Tup3fC> T getRight(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getRight(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fC getLeft();
	
	// MISSING_DOC
	<T extends Tup3fC> T getLeft(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getLeft(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fC getUp();
	
	// MISSING_DOC
	<T extends Tup3fC> T getUp(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getUp(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fC getDown();
	
	// MISSING_DOC
	<T extends Tup3fC> T getDown(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getDown(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fC getForward();
	
	// MISSING_DOC
	<T extends Tup3fC> T getForward(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getForward(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fC getBack();
	
	// MISSING_DOC
	<T extends Tup3fC> T getBack(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getBack(@ExtractParam float[] res);
}
