package org.barghos.api.math.bounds;

import org.barghos.api.core.tuple.floats.ITup3RF;

public interface IAabb2WF extends IAabb2RF
{
	
	IAabb2WF set(IAabb3RF aabb);
	
	IAabb2WF set(float[] aabb);
	
	IAabb2WF set(ITup3RF min, ITup3RF max);
	
	IAabb2WF set(ITup3RF min, float[] max);
	
	IAabb2WF set(ITup3RF min, float maxX, float maxY);
	
	IAabb2WF set(float[] min, ITup3RF max);
	
	IAabb2WF set(float[] min,  float[] max);
	
	IAabb2WF set(float[] min, float maxX, float maxY);
	
	IAabb2WF set(float minX, float minY, ITup3RF max);
	
	IAabb2WF set(float minX, float minY, float[] max);
	
	IAabb2WF set(float minX, float minY, float maxX, float maxY);
	
	IAabb2WF setMin(ITup3RF min);
	
	IAabb2WF setMin(float[] min);
	
	IAabb2WF setMin(float x, float y);
	
	IAabb2WF minX(float x);
	
	IAabb2WF minY(float y);
	
	IAabb2WF setMax(ITup3RF max);
	
	IAabb2WF setMax(float[] max);
	
	IAabb2WF setMax(float x, float y);
	
	IAabb2WF maxX(float x);
	
	IAabb2WF maxY(float y);
	
}
