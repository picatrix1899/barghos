package org.barghos.math.api.model;

import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.util.ExtractParam;
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
	<T extends Tup3fC> T getOrigin(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getOrigin(@ExtractParam float[] res);
}
