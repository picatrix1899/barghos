package org.barghos.impl.math.transform;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITup4WF;

public interface ITransform3RF
{
	float[] getPos(@ExtractionParam float[] res);
	
	<T extends ITup3WF> T getPos(@ExtractionParam T res);

	float posX();
	
	float posY();
	
	float posZ();
	
	float[] getRot(@ExtractionParam float[] res);
	
	<T extends ITup4WF> T getRot(@ExtractionParam T res);
	
	float[] getScale(@ExtractionParam float[] res);
	
	<T extends ITup3WF> T getScale(@ExtractionParam T res);
	
	float scaleX();
	
	float scaleY();
	
	float scaleZ();
}
