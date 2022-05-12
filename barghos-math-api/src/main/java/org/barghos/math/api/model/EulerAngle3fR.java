package org.barghos.math.api.model;

import org.barghos.core.api.tuple3.Tup3fR;

// MISSING_DOC
public interface EulerAngle3fR extends Tup3fR
{
	// MISSING_DOC
	@Override
	default float getX()
	{
		return getPitch();
	}
	
	// MISSING_DOC
	@Override
	default float getZ()
	{
		return getRoll();
	}
	
	// MISSING_DOC
	@Override
	default float getY()
	{
		return getYaw();
	}
	
	// MISSING_DOC
	float getPitchDeg();
	
	// MISSING_DOC
	float getPitch();
	
	// MISSING_DOC
	float getYawDeg();
	
	// MISSING_DOC
	float getYaw();
	
	// MISSING_DOC
	float getRollDeg();
	
	// MISSING_DOC
	float getRoll();
}
