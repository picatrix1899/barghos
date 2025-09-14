package org.barghos.impl.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;

public interface IAabb3RF
{
	float minX();
	
	float minY();
	
	float minZ();
	
	<T extends ITup3WF> T getMin(@ExtractionParam T res);
	
	float[] getMin(@ExtractionParam float[] res);
	
	float maxX();
	
	float maxY();
	
	float maxZ();
	
	<T extends ITup3WF> T getMax(@ExtractionParam T res);
	
	float[] getMax(@ExtractionParam float[] res);
	
	float sizeX();
	
	float sizeY();
	
	float sizeZ();
	
	<T extends ITup3WF> T size(@ExtractionParam T res);
	
	float[] size(@ExtractionParam float[] res);
	
	float centerX();
	
	float centerY();
	
	float centerZ();
	
	<T extends ITup3WF> T center(@ExtractionParam T res);
	
	float[] center(@ExtractionParam float[] res);
	
	float[] toArray();
	
	float[] toArray(@ExtractionParam float[] res);
	
	IAabb3RF scaleN(ITup3RF t);
	
	IAabb3RF scaleN(float[] v);
	
	IAabb3RF scaleN(float value);
	
	IAabb3RF scaleN(float x, float y, float z);
	
	<T extends IAabb3WF> T scaleT(ITup3RF t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleT(float[] v, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleT(float value, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleT(float x, float y, float z, @ExtractionParam T res);
	
	float[] scaleT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] scaleT(float[] v, @ExtractionParam float[] res);
	
	float[] scaleT(float value, @ExtractionParam float[] res);
	
	float[] scaleT(float x, float y, float z, @ExtractionParam float[] res);
	
	IAabb3RF scaleFromPivotN(ITup3RF pivot, ITup3RF scale);
	
	IAabb3RF scaleFromPivotN(ITup3RF pivot, float[] scale);
	
	IAabb3RF scaleFromPivotN(ITup3RF pivot, float scaleX, float scaleY, float scaleZ);
	
	IAabb3RF scaleFromPivotN(float[] pivot, ITup3RF scale);
	
	IAabb3RF scaleFromPivotN(float[] pivot, float[] scale);
	
	IAabb3RF scaleFromPivotN(float[] pivot, float scaleX, float scaleY, float scaleZ);
	
	IAabb3RF scaleFromPivotN(float pivotX, float pivotY, float pivotZ, ITup3RF scale);
	
	IAabb3RF scaleFromPivotN(float pivotX, float pivotY, float pivotZ, float[] scale);
	
	IAabb3RF scaleFromPivotN(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ);
	
	<T extends IAabb3WF> T scaleFromPivotT(ITup3RF pivot, ITup3RF scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(ITup3RF pivot, float[] scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(ITup3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(float[] pivot, ITup3RF scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(float[] pivot, float[] scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(float pivotX, float pivotY, float pivotZ, ITup3RF scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam T res);
	
	float[] scaleFromPivotT(ITup3RF pivot, ITup3RF scale, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(ITup3RF pivot, float[] scale, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(ITup3RF pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(float[] pivot, ITup3RF scale, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(float[] pivot, float[] scale, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(float pivotX, float pivotY, float pivotZ, ITup3RF scale, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res);
	
	float[] scaleFromPivotT(float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res);
	
	IAabb3RF scaleFromMinN(ITup3RF scale);
	
	IAabb3RF scaleFromMinN(float[] scale);
	
	IAabb3RF scaleFromMinN(float scaleX, float scaleY, float scaleZ);
	
	<T extends IAabb3WF> T scaleFromMinT(ITup3RF scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromMinT(float[] scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromMinT(float scaleX, float scaleY, float scaleZ, @ExtractionParam T res);
	
	float[] scaleFromMinT(ITup3RF scale, @ExtractionParam float[] res);
	
	float[] scaleFromMinT(float[] scale, @ExtractionParam float[] res);
	
	float[] scaleFromMinT(float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res);
	
	IAabb3RF scaleFromMaxN(ITup3RF scale);
	
	IAabb3RF scaleFromMaxN(float[] scale);
	
	IAabb3RF scaleFromMaxN(float scaleX, float scaleY, float scaleZ);
	
	<T extends IAabb3WF> T scaleFromMaxT(ITup3RF scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromMaxT(float[] scale, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleFromMaxT(float scaleX, float scaleY, float scaleZ, @ExtractionParam T res);
	
	float[] scaleFromMaxT(ITup3RF scale, @ExtractionParam float[] res);
	
	float[] scaleFromMaxT(float[] scale, @ExtractionParam float[] res);
	
	float[] scaleFromMaxT(float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res);
	
	IAabb3RF mergeN(IAabb3RF aabb);
	
	IAabb3RF mergeN(float[] aabb);
	
	IAabb3RF mergeN(ITup3RF min, ITup3RF max);
	
	IAabb3RF mergeN(ITup3RF min, float[] max);
	
	IAabb3RF mergeN(ITup3RF min, float maxX, float maxY, float maxZ);
	
	IAabb3RF mergeN(float[] min, ITup3RF max);
	
	IAabb3RF mergeN(float[] min, float[] max);
	
	IAabb3RF mergeN(float[] min, float maxX, float maxY, float maxZ);
	
	IAabb3RF mergeN(float minX, float minY, float minZ, ITup3RF max);
	
	IAabb3RF mergeN(float minX, float minY, float minZ, float[] max);
	
	IAabb3RF mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	<T extends IAabb3WF> T mergeT(IAabb3RF aabb, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float[] aabb, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(ITup3RF min, ITup3RF max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(ITup3RF min, float[] max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(ITup3RF min, float maxX, float maxY, float maxZ, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float[] min, ITup3RF max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float[] min, float[] max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float[] min, float maxX, float maxY, float maxZ, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, ITup3RF max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float[] max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam T res);
	
	float[] mergeT(IAabb3RF aabb, @ExtractionParam float[] res);
	
	float[] mergeT(float[] aabb, @ExtractionParam float[] res);
	
	float[] mergeT(ITup3RF min, ITup3RF max, @ExtractionParam float[] res);
	
	float[] mergeT(ITup3RF min, float[] max, @ExtractionParam float[] res);
	
	float[] mergeT(ITup3RF min, float maxX, float maxY, float maxZ, @ExtractionParam float[] res);
	
	float[] mergeT(float[] min, ITup3RF max, @ExtractionParam float[] res);
	
	float[] mergeT(float[] min, float[] max, @ExtractionParam float[] res);
	
	float[] mergeT(float[] min, float maxX, float maxY, float maxZ, @ExtractionParam float[] res);
	
	float[] mergeT(float minX, float minY, float minZ, ITup3RF max, @ExtractionParam float[] res);
	
	float[] mergeT(float minX, float minY, float minZ, float[] max, @ExtractionParam float[] res);
	
	float[] mergeT(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam float[] res);
	
	IAabb3RF translateN(ITup3RF t);
	
	IAabb3RF translateN(float[] t);
	
	IAabb3RF translateN(float tX, float tY, float tZ);
	
	<T extends IAabb3WF> T translateT(ITup3RF t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T translateT(float[] t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T translateT(float tX, float tY, float tZ, @ExtractionParam T res);
	
	float[] translateT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] translateT(float[] t, @ExtractionParam float[] res);
	
	float[] translateT(float tX, float tY, float tZ, @ExtractionParam float[] res);
	
	IAabb3RF translateMinN(ITup3RF t);
	
	IAabb3RF translateMinN(float[] t);
	
	IAabb3RF translateMinN(float tX, float tY, float tZ);
	
	<T extends IAabb3WF> T translateMinT(ITup3RF t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T translateMinT(float[] t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T translateMinT(float tX, float tY, float tZ, @ExtractionParam T res);
	
	float[] translateMinT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] translateMinT(float[] t, @ExtractionParam float[] res);
	
	float[] translateMinT(float tX, float tY, float tZ, @ExtractionParam float[] res);
	
	IAabb3RF translateMaxN(ITup3RF t);
	
	IAabb3RF translateMaxN(float[] t);
	
	IAabb3RF translateMaxN(float tX, float tY, float tZ);
	
	<T extends IAabb3WF> T translateMaxT(ITup3RF t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T translateMaxT(float[] t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T translateMaxT(float tX, float tY, float tZ, @ExtractionParam T res);
	
	float[] translateMaxT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] translateMaxT(float[] t, @ExtractionParam float[] res);
	
	float[] translateMaxT(float tX, float tY, float tZ, @ExtractionParam float[] res);
	
	IAabb3RF growN(ITup3RF e);
	
	IAabb3RF growN(float[] e);
	
	IAabb3RF growN(float eX, float eY, float eZ);
	
	<T extends IAabb3WF> T growT(ITup3RF e, @ExtractionParam T res);
	
	<T extends IAabb3WF> T growT(float[] e, @ExtractionParam T res);
	
	<T extends IAabb3WF> T growT(float eX, float eY, float eZ, @ExtractionParam T res);
	
	float[] growT(ITup3RF e, @ExtractionParam float[] res);
	
	float[] growT(float[] e, @ExtractionParam float[] res);
	
	float[] growT(float eX, float eY, float eZ, @ExtractionParam float[] res);
	
	IAabb3RF expandN(float[] e);
	
	IAabb3RF expandN(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ);
	
	<T extends IAabb3WF> T expandT(float[] e, @ExtractionParam T res);
	
	<T extends IAabb3WF> T expandT(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, @ExtractionParam T res);
	
	float[] expandT(float[] t, @ExtractionParam float[] res);
	
	float[] expandT(float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, @ExtractionParam float[] res);
}
