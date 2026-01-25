package org.barghos.api.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup2WF;

public interface IAabb2RF
{
	
	<T extends ITup2WF> T getMin(@ExtractionParam T res);
	
	float[] getMin(@ExtractionParam float[] res);
	
	float minX();
	
	float minY();
	
	<T extends ITup2WF> T getMax(@ExtractionParam T res);
	
	float[] getMax(@ExtractionParam float[] res);
	
	float maxX();
	
	float maxY();
	
	float[] toArray();
	
	float[] toArray(@ExtractionParam float[] res);
	
}
