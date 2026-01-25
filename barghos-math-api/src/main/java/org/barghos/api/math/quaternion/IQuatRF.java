package org.barghos.api.math.quaternion;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non invasive (readonly) functions and methods for
 * float quaternions.
 */
public interface IQuatRF
{
	float x();
	
	float y();
	
	float z();
	
	float w();
	
	float at(int index);
	
	float[] toArray();

	float[] toArray(@ExtractionParam float[] res);
	
}
