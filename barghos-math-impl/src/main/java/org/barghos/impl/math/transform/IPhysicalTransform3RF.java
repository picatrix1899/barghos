package org.barghos.impl.math.transform;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup3WF;

public interface IPhysicalTransform3RF extends ITransform3RF
{
	float[] getVel(@ExtractionParam float[] res);
	
	<T extends ITup3WF> T getVel(@ExtractionParam T res);
	
	float velX();
	
	float velY();
	
	float velZ();
	
	float[] getRotVel(@ExtractionParam float[] res);
	
	<T extends ITup3WF> T getRotVel(@ExtractionParam T res);
	
	float rotVelX();
	
	float rotVelY();
	
	float rotVelZ();
	
	float[] getScaleVel(@ExtractionParam float[] res);
	
	<T extends ITup3WF> T getScaleVel(@ExtractionParam T res);
	
	float scaleVelX();
	
	float scaleVelY();
	
	float scaleVelZ();
}
