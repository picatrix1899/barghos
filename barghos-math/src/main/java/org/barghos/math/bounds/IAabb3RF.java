package org.barghos.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;

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
	
	IAabb3RF scaleN(ITup3RF t);
	
	IAabb3RF scaleN(float[] v);
	
	IAabb3RF scaleN(float value);
	
	IAabb3RF scaleN(float x, float y, float z);
	
	IAabb3RF mergeN(IAabb3RF aabb);
	
	IAabb3RF mergeN(ITup3RF min, ITup3RF max);
	
	IAabb3RF mergeN(ITup3RF min, float[] max);
	
	IAabb3RF mergeN(ITup3RF min, float maxX, float maxY, float maxZ);
	
	IAabb3RF mergeN(float[] min, ITup3RF max);
	
	IAabb3RF mergeN(float[] min, float[] max);
	
	IAabb3RF mergeN(float[] min, float maxX, float maxY, float maxZ);
	
	IAabb3RF mergeN(float minX, float minY, float minZ, ITup3RF max);
	
	IAabb3RF mergeN(float minX, float minY, float minZ, float[] max);
	
	IAabb3RF mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	<T extends IAabb3WF> T scaleT(ITup3RF t, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleT(float[] v, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleT(float value, @ExtractionParam T res);
	
	<T extends IAabb3WF> T scaleT(float x, float y, float z, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(IAabb3RF aabb, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(ITup3RF min, ITup3RF max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(ITup3RF min, float[] max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(ITup3RF min, float maxX, float maxY, float maxZ, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float[] min, ITup3RF max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float[] min, float[] max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float[] min, float maxX, float maxY, float maxZ, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, ITup3RF max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float[] max, @ExtractionParam T res);
	
	<T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam T res);
}
