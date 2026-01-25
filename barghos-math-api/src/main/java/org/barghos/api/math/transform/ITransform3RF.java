package org.barghos.api.math.transform;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.quaternion.IQuatWF;
import org.barghos.api.math.vector.floats.IVec3WF;

public interface ITransform3RF
{
	float[] posT(@ExtractionParam float[] res);
	
	<T extends IVec3WF> T posT(@ExtractionParam T res);

	float posX();
	
	float posY();
	
	float posZ();
	
	float[] rotT(@ExtractionParam float[] res);
	
	<T extends IQuatWF> T rotT(@ExtractionParam T res);
	
	float rotX();
	
	float rotY();
	
	float rotZ();
	
	float rotW();
	
	float[] scaleT(@ExtractionParam float[] res);
	
	<T extends IVec3WF> T scaleT(@ExtractionParam T res);
	
	float scaleX();
	
	float scaleY();
	
	float scaleZ();
}
