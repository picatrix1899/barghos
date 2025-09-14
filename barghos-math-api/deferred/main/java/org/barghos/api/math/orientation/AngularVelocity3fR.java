package org.barghos.api.math.orientation;

public interface AngularVelocity3fR
{
	float x();
	float y();
	float z();
	
	float lengthSquared();
	float length();
	float axis();
	float angle();
}
