package org.barghos.impl.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITup3RF;

public interface IAabb2RF
{
	float minX();
	
	float minY();
	
	<T extends ITup2WF> T getMin(@ExtractionParam T res);
	
	float[] getMin(@ExtractionParam float[] res);
	
	float maxX();
	
	float maxY();
	
	<T extends ITup2WF> T getMax(@ExtractionParam T res);
	
	float[] getMax(@ExtractionParam float[] res);
	
	float sizeX();
	
	float sizeY();
	
	<T extends ITup2WF> T size(@ExtractionParam T res);
	
	float[] size(@ExtractionParam float[] res);
	
	float centerX();
	
	float centerY();
	
	<T extends ITup2WF> T center(@ExtractionParam T res);
	
	float[] center(@ExtractionParam float[] res);
	
	float[] toArray();
	
	float[] toArray(@ExtractionParam float[] res);
	
	IAabb2RF scaleN(ITup2RF t);
	
	IAabb2RF scaleN(float[] v);
	
	IAabb2RF scaleN(float value);
	
	IAabb2RF scaleN(float x, float y);
	
	<T extends IAabb2WF> T scaleT(ITup2RF t, @ExtractionParam T res);
	
	<T extends IAabb2WF> T scaleT(float[] v, @ExtractionParam T res);
	
	<T extends IAabb2WF> T scaleT(float value, @ExtractionParam T res);
	
	<T extends IAabb2WF> T scaleT(float x, float y, @ExtractionParam T res);
	
	IAabb2RF mergeN(IAabb2RF aabb);
	
	IAabb2RF mergeN(float[] aabb);
	
	IAabb2RF mergeN(ITup2RF min, ITup2RF max);
	
	IAabb2RF mergeN(ITup2RF min, float[] max);
	
	IAabb2RF mergeN(ITup2RF min, float maxX, float maxY);
	
	IAabb2RF mergeN(float[] min, ITup2RF max);
	
	IAabb2RF mergeN(float[] min, float[] max);
	
	IAabb2RF mergeN(float[] min, float maxX, float maxY);
	
	IAabb2RF mergeN(float minX, float minY, ITup2RF max);
	
	IAabb2RF mergeN(float minX, float minY, float[] max);
	
	IAabb2RF mergeN(float minX, float minY, float maxX, float maxY);
	
	<T extends IAabb2WF> T mergeT(IAabb2RF aabb, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(float[] aabb, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(ITup2RF min, ITup2RF max, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(ITup2RF min, float[] max, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(ITup2RF min, float maxX, float maxY, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(float[] min, ITup3RF max, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(float[] min, float[] max, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(float[] min, float maxX, float maxY, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(float minX, float minY, ITup2RF max, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(float minX, float minY, float[] max, @ExtractionParam T res);
	
	<T extends IAabb2WF> T mergeT(float minX, float minY, float maxX, float maxY, @ExtractionParam T res);
}
