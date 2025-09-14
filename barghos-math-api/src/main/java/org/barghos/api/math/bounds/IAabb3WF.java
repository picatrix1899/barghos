package org.barghos.api.math.bounds;

import org.barghos.api.core.tuple.floats.ITup3RF;

public interface IAabb3WF extends IAabb3RF
{
	
	IAabb3WF set(IAabb3RF aabb);
	
	IAabb3WF set(float[] aabb);
	
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
	
	IAabb3WF scaleFromPivot(ITup3RF pivot, ITup3RF scale);
	
	IAabb3WF scaleFromPivot(ITup3RF pivot, float[] scale);
	
	IAabb3WF scaleFromPivot(ITup3RF pivot, float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromPivot(float[] pivot, ITup3RF scale);
	
	IAabb3WF scaleFromPivot(float[] pivot, float[] scale);
	
	IAabb3WF scaleFromPivot(float[] pivot, float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromPivot(float pivotX, float pivotY, float pivotZ, ITup3RF scale);
	
	IAabb3WF scaleFromPivot(float pivotX, float pivotY, float pivotZ, float[] scale);
	
	IAabb3WF scaleFromPivot(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromPivotN(ITup3RF pivot, ITup3RF scale);
	
	IAabb3WF scaleFromPivotN(ITup3RF pivot, float[] scale);
	
	IAabb3WF scaleFromPivotN(ITup3RF pivot, float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromPivotN(float[] pivot, ITup3RF scale);
	
	IAabb3WF scaleFromPivotN(float[] pivot, float[] scale);
	
	IAabb3WF scaleFromPivotN(float[] pivot, float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromPivotN(float pivotX, float pivotY, float pivotZ, ITup3RF scale);
	
	IAabb3WF scaleFromPivotN(float pivotX, float pivotY, float pivotZ, float[] scale);
	
	IAabb3WF scaleFromPivotN(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromMin(ITup3RF scale);
	
	IAabb3WF scaleFromMin(float[] scale);
	
	IAabb3WF scaleFromMin(float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromMinN(ITup3RF scale);
	
	IAabb3WF scaleFromMinN(float[] scale);
	
	IAabb3WF scaleFromMinN(float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromMax(ITup3RF scale);
	
	IAabb3WF scaleFromMax(float[] scale);
	
	IAabb3WF scaleFromMax(float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF scaleFromMaxN(ITup3RF scale);
	
	IAabb3WF scaleFromMaxN(float[] scale);
	
	IAabb3WF scaleFromMaxN(float scaleX, float scaleY, float scaleZ);
	
	IAabb3WF merge(IAabb3RF aabb);
	
	IAabb3WF merge(float[] aabb);
	
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
	
	IAabb3WF mergeN(float[] aabb);
	
	IAabb3WF mergeN(ITup3RF min, ITup3RF max);
	
	IAabb3WF mergeN(ITup3RF min, float[] max);
	
	IAabb3WF mergeN(ITup3RF min, float maxX, float maxY, float maxZ);
	
	IAabb3WF mergeN(float[] min, ITup3RF max);
	
	IAabb3WF mergeN(float[] min, float[] max);
	
	IAabb3WF mergeN(float[] min, float maxX, float maxY, float maxZ);
	
	IAabb3WF mergeN(float minX, float minY, float minZ, ITup3RF max);
	
	IAabb3WF mergeN(float minX, float minY, float minZ, float[] max);
	
	IAabb3WF mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	IAabb3WF translate(ITup3RF t);
	
	IAabb3WF translate(float[] t);
	
	IAabb3WF translate(float tX, float tY, float tZ);
	
	IAabb3WF translateN(ITup3RF t);
	
	IAabb3WF translateN(float[] t);
	
	IAabb3WF translateN(float tX, float tY, float tZ);
	
	IAabb3WF translateMin(ITup3RF t);
	
	IAabb3WF translateMin(float[] t);
	
	IAabb3WF translateMin(float tX, float tY, float tZ);
	
	IAabb3WF translateMinN(ITup3RF t);
	
	IAabb3WF translateMinN(float[] t);
	
	IAabb3WF translateMinN(float tX, float tY, float tZ);
	
	IAabb3WF translateMax(ITup3RF t);
	
	IAabb3WF translateMax(float[] t);
	
	IAabb3WF translateMax(float tX, float tY, float tZ);
	
	IAabb3WF translateMaxN(ITup3RF t);
	
	IAabb3WF translateMaxN(float[] t);
	
	IAabb3WF translateMaxN(float tX, float tY, float tZ);
	
	IAabb3WF grow(ITup3RF e);
	
	IAabb3WF grow(float[] e);
	
	IAabb3WF grow(float eX, float eY, float eZ);
	
	IAabb3WF growN(ITup3RF e);
	
	IAabb3WF growN(float[] e);
	
	IAabb3WF growN(float eX, float eY, float eZ);
	
	IAabb3WF expand(float[] e);
	
	IAabb3WF expand(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ);
	
	IAabb3WF expandN(float[] e);
	
	IAabb3WF expandN(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ);
}
