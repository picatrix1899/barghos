package org.barghos.math.bounds;

import org.barghos.util.tuple.floats.ITup3RF;

public interface IAabb3WF extends IAabb3RF
{
	
	IAabb3WF set(IAabb3RF aabb);
	
	IAabb3WF set(ITup3RF min, ITup3RF max);
	
	IAabb3WF set(ITup3RF min, float[] max);
	
	IAabb3WF set(ITup3RF min, float maxX, float maxY, float maxZ);
	
	IAabb3WF set(float[] min, ITup3RF max);
	
	IAabb3WF set(float[] min,  float[] max);
	
	IAabb3WF set(float[] min, float maxX, float maxY, float maxZ);
	
	IAabb3WF set(float minX, float minY, float minZ, ITup3RF max);
	
	IAabb3WF set(float minX, float minY, float minZ, float[] max);
	
	IAabb3WF set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	IAabb3WF setMin(ITup3RF min);
	
	IAabb3WF setMin(float[] min);
	
	IAabb3WF setMin(float x, float y, float z);
	
	IAabb3WF minX(float x);
	
	IAabb3WF minY(float y);
	
	IAabb3WF minZ(float z);
	
	IAabb3WF setMax(ITup3RF max);
	
	IAabb3WF setMax(float[] max);
	
	IAabb3WF setMax(float x, float y, float z);
	
	IAabb3WF maxX(float x);
	
	IAabb3WF maxY(float y);
	
	IAabb3WF maxZ(float z);
	
	IAabb3WF scale(ITup3RF t);
	
	IAabb3WF scale(float[] v);
	
	IAabb3WF scale(float value);
	
	IAabb3WF scale(float x, float y, float z);
	
	IAabb3WF scaleN(ITup3RF t);
	
	IAabb3WF scaleN(float[] v);
	
	IAabb3WF scaleN(float value);
	
	IAabb3WF scaleN(float x, float y, float z);
	
	IAabb3WF merge(IAabb3RF aabb);
	
	IAabb3WF merge(ITup3RF min, ITup3RF max);
	
	IAabb3WF merge(ITup3RF min, float[] max);
	
	IAabb3WF merge(ITup3RF min, float maxX, float maxY, float maxZ);
	
	IAabb3WF merge(float[] min, ITup3RF max);
	
	IAabb3WF merge(float[] min, float[] max);
	
	IAabb3WF merge(float[] min, float maxX, float maxY, float maxZ);
	
	IAabb3WF merge(float minX, float minY, float minZ, ITup3RF max);
	
	IAabb3WF merge(float minX, float minY, float minZ, float[] max);
	
	IAabb3WF merge(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	IAabb3WF mergeN(IAabb3RF aabb);
	
	IAabb3WF mergeN(ITup3RF min, ITup3RF max);
	
	IAabb3WF mergeN(ITup3RF min, float[] max);
	
	IAabb3WF mergeN(ITup3RF min, float maxX, float maxY, float maxZ);
	
	IAabb3WF mergeN(float[] min, ITup3RF max);
	
	IAabb3WF mergeN(float[] min, float[] max);
	
	IAabb3WF mergeN(float[] min, float maxX, float maxY, float maxZ);
	
	IAabb3WF mergeN(float minX, float minY, float minZ, ITup3RF max);
	
	IAabb3WF mergeN(float minX, float minY, float minZ, float[] max);
	
	IAabb3WF mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
}
