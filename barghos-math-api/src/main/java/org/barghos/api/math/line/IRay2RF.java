package org.barghos.api.math.line;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.vector.floats.IVec2WF;

public interface IRay2RF
{
	float originX();
	
	float originY();
	
	<T extends IVec2WF> T getOrigin(@ExtractionParam T res);
	
	float[] getOrigin(@ExtractionParam float[] res);
	
	float directionX();
	
	float directionY();
	
	<T extends IVec2WF> T getDirection(@ExtractionParam T res);
	
	float[] getDirection(@ExtractionParam float[] res);
	
	float[] toArray();
	
	float[] toArray(@ExtractionParam float[] res);
	
	
}
