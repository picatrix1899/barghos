package org.barghos.impl.math.bounds;

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
	
	IAabb2WF scale(ITup3RF t);
	
	IAabb2WF scale(float[] v);
	
	IAabb2WF scale(float value);
	
	IAabb2WF scale(float x, float y);
	
	IAabb2WF scaleN(ITup3RF t);
	
	IAabb2WF scaleN(float[] v);
	
	IAabb2WF scaleN(float value);
	
	IAabb2WF scaleN(float x, float y);
	
	IAabb2WF merge(IAabb3RF aabb);
	
	IAabb2WF merge(float[] aabb);
	
	IAabb2WF merge(ITup3RF min, ITup3RF max);
	
	IAabb2WF merge(ITup3RF min, float[] max);
	
	IAabb2WF merge(ITup3RF min, float maxX, float maxY);
	
	IAabb2WF merge(float[] min, ITup3RF max);
	
	IAabb2WF merge(float[] min, float[] max);
	
	IAabb2WF merge(float[] min, float maxX, float maxY);
	
	IAabb2WF merge(float minX, float minY, ITup3RF max);
	
	IAabb2WF merge(float minX, float minY, float[] max);
	
	IAabb2WF merge(float minX, float minY, float maxX, float maxY);
	
	IAabb2WF mergeN(IAabb3RF aabb);
	
	IAabb2WF mergeN(float[] aabb);
	
	IAabb2WF mergeN(ITup3RF min, ITup3RF max);
	
	IAabb2WF mergeN(ITup3RF min, float[] max);
	
	IAabb2WF mergeN(ITup3RF min, float maxX, float maxY);
	
	IAabb2WF mergeN(float[] min, ITup3RF max);
	
	IAabb2WF mergeN(float[] min, float[] max);
	
	IAabb2WF mergeN(float[] min, float maxX, float maxY);
	
	IAabb2WF mergeN(float minX, float minY, ITup3RF max);
	
	IAabb2WF mergeN(float minX, float minY, float[] max);
	
	IAabb2WF mergeN(float minX, float minY, float maxX, float maxY);
	
}
