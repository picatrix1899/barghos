package org.barghos.api.math.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup4RF;

/**
 * This interface provides non invasive (readonly) functions and methods for
 * float quaternions.
 */
public interface IQuatRF extends ITup4RF
{
	float x();
	
	float y();
	
	float z();
	
	float w();
	
	float len();
	
	float lenSq();
	
	float lenRc();

	float dot(ITup4RF q);

	float dot(float[] q);

	float dot(float x, float y, float z, float w);

	IQuatRF conjN();

	<T extends IQuatWF> T conjT(@ExtractionParam T res);

	float[] conjT(@ExtractionParam float[] res);

	IQuatRF invN();

	float[] invT(@ExtractionParam float[] res);

	<T extends IQuatWF> T invT(@ExtractionParam T res);

	IQuatRF nrmN();

	float[] nrmT(@ExtractionParam float[] res);

	<T extends IQuatWF> T nrmT(@ExtractionParam T res);
}
