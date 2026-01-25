package org.barghos.api.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup3WF;

public interface IAabb3RF
{
	
	<T extends ITup3WF> T getMin(@ExtractionParam T res);
	
	float[] getMin(@ExtractionParam float[] res);
	
	float minX();
	
	float minY();
	
	float minZ();
	
	<T extends ITup3WF> T getMax(@ExtractionParam T res);
	
	float[] getMax(@ExtractionParam float[] res);
	
	float maxX();
	
	float maxY();
	
	float maxZ();
	
	float[] toArray();
	
	float[] toArray(@ExtractionParam float[] res);
	
}
