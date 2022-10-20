package org.barghos.math.api.model;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fC;
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
	<T extends Tup3fC> T getRight(@ExtractionParam T res);
	
	// MISSING_DOC
	float[] getRight(@ExtractionParam float[] res);
	
	// MISSING_DOC
	Vec3fC getLeft();
	
	// MISSING_DOC
	<T extends Tup3fC> T getLeft(@ExtractionParam T res);
	
	// MISSING_DOC
	float[] getLeft(@ExtractionParam float[] res);
	
	// MISSING_DOC
	Vec3fC getUp();
	
	// MISSING_DOC
	<T extends Tup3fC> T getUp(@ExtractionParam T res);
	
	// MISSING_DOC
	float[] getUp(@ExtractionParam float[] res);
	
	// MISSING_DOC
	Vec3fC getDown();
	
	// MISSING_DOC
	<T extends Tup3fC> T getDown(@ExtractionParam T res);
	
	// MISSING_DOC
	float[] getDown(@ExtractionParam float[] res);
	
	// MISSING_DOC
	Vec3fC getForward();
	
	// MISSING_DOC
	<T extends Tup3fC> T getForward(@ExtractionParam T res);
	
	// MISSING_DOC
	float[] getForward(@ExtractionParam float[] res);
	
	// MISSING_DOC
	Vec3fC getBack();
	
	// MISSING_DOC
	<T extends Tup3fC> T getBack(@ExtractionParam T res);
	
	// MISSING_DOC
	float[] getBack(@ExtractionParam float[] res);
}
