package org.barghos.api.math.line;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup3WF;

public interface IRay3RF
{
	float originX();
	
	float originY();
	
	float originZ();
	
	<T extends ITup3WF> T getOrigin(@ExtractionParam T res);
	
	float[] getOrigin(@ExtractionParam float[] res);
	
	float directionX();
	
	float directionY();
	
	float directionZ();
	
	<T extends ITup3WF> T getDirection(@ExtractionParam T res);
	
	float[] getDirection(@ExtractionParam float[] res);
	
	float[] toArray();
	
	float[] toArray(@ExtractionParam float[] res);
	
	
}
