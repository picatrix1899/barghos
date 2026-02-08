package org.barghos.api.math.transform;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.quaternion.IQuatWF;
import org.barghos.api.math.vector.floats.IVec3WF;

public interface ITransform3RF
{
	float[] getPos(@ExtractionParam float[] res);
	
	<T extends IVec3WF> T getPos(@ExtractionParam T res);

	float posX();
	
	float posY();
	
	float posZ();
	
	float[] getRot(@ExtractionParam float[] res);
	
	<T extends IQuatWF> T getRot(@ExtractionParam T res);
	
	float rotX();
	
	float rotY();
	
	float rotZ();
	
	float rotW();
	
	float[] getScale(@ExtractionParam float[] res);
	
	<T extends IVec3WF> T getScale(@ExtractionParam T res);
	
	float scaleX();
	
	float scaleY();
	
	float scaleZ();
}
