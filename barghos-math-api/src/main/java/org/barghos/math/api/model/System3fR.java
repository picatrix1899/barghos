package org.barghos.math.api.model;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.math.api.vector.Vec3fC;

public interface System3fR extends AxisSystem3fR
{
	@Override
	default int getDimensions()
	{
		return 12;
	}
	
	// MISSING_DOC
	Vec3fC getOrigin();
	
	// MISSING_DOC
	<T extends Tup3fC> T getOrigin(@ExtractionParam T res);
	
	// MISSING_DOC
	float[] getOrigin(@ExtractionParam float[] res);
}
