package org.barghos.util.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.AllowNull;
import org.barghos.util.accessor.floats.IIndexAccessorIRF;
import org.barghos.util.accessor.floats.IKeyAccessorRF;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.collection.KeyValuePairF;

public interface ITupUtils2FProvider
{
	IndexValuePairF min(ITup2RF t, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF min(ITupRF t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF min(float[] t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF min(float tv0, float tv1, @ExtractionParam IndexValuePairF res);
	
	<T> IndexValuePairF min(IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res);
	
	<T,K> KeyValuePairF<K> min(K[] keys, IKeyAccessorRF<T,K> accessor, T obj, @ExtractionParam KeyValuePairF<K> res);

	IndexValuePairF minAligned(int startIndexT, ITupRF t, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF minAligned(int startIndexT, float[] t, @ExtractionParam IndexValuePairF res);
	
	<T> IndexValuePairF minAligned(int startIndexT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF minUnaligned(int[] indicesT, ITupRF t, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF minUnaligned(int[] indicesT, float[] t, @ExtractionParam IndexValuePairF res);
	
	<T> IndexValuePairF minUnaligned(int[] indicesT, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF minUnaligned(int indexTV0, int indexTV1, ITupRF t, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF minUnaligned(int indexTV0, int indexTV1, float[] t, @ExtractionParam IndexValuePairF res);
	
	<T> IndexValuePairF minUnaligned(int indexTV0, int indexTV1, IIndexAccessorIRF<T> accessor, T obj, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF max(ITup2RF t, @ExtractionParam IndexValuePairF res);
	
	IndexValuePairF max(ITupRF t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF max(float[] t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF max(float tv0, float tv1, @ExtractionParam IndexValuePairF res);

	float[] minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res);

	float[] minComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res);

	float[] minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

	float[] minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] minComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res);

	float[] minComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res);

	float[] minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res);
	
	float[] minComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] minComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res);

	float[] minComponents(float[] t1, float[] t2, @ExtractionParam float[] res);

	float[] minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

	float[] minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res);

	float[] minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

	float[] minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res);

	<T extends ITup2WF> T minComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(ITup2RF t1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(ITupRF t1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponents(float[] t1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponents(float[] t1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(float[] t1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, ITupRF t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, float[] t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype);

	<T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, ITupRF t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, float[] t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(float[] t1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(float[] t1, ITupRF t2, T prototype);

	<T extends ITup2RF> T minComponentsCreateNew(float[] t1, float[] t2, T prototype);

	<T extends ITup2RF> T minComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype);

	<T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype);

	<T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype);

	<T extends ITup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
	
	float[] maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam float[] res);

	float[] maxComponents(ITup2RF t1, float[] t2, @ExtractionParam float[] res);

	float[] maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

	float[] maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam float[] res);

	float[] maxComponents(ITupRF t1, float[] t2, @ExtractionParam float[] res);

	float[] maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res);
	
	float[] maxComponents(float[] t1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] maxComponents(float[] t1, ITupRF t2, @ExtractionParam float[] res);

	float[] maxComponents(float[] t1, float[] t2, @ExtractionParam float[] res);

	float[] maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

	float[] maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res);
	
	float[] maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res);

	float[] maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

	float[] maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res);

	<T extends ITup2WF> T maxComponents(ITup2RF t1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponents(ITup2RF t1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(ITup2RF t1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(ITupRF t1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponents(ITupRF t1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(ITupRF t1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponents(float[] t1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponents(float[] t1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(float[] t1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponents(float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

	<T extends ITup2WF> T maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, ITupRF t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, float[] t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(ITup2RF t1, float t2v0, float t2v1, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, ITupRF t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, float[] t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(ITupRF t1, float t2v0, float t2v1, T prototype);
	
	<T extends ITup2RF> T maxComponentsCreateNew(float[] t1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T maxComponentsCreateNew(float[] t1, ITupRF t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(float[] t1, float[] t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, ITup2RF t2, T prototype);
	
	<T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, ITupRF t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype);

	<T extends ITup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype);

	float[] arrange(ITup2RF t, int[] indices, float[] res);
	
	float[] arrange(ITupRF t, int[] indices, float[] res);
	
	float[] arrange(float[] t, int[] indices, float[] res);
	
	float[] arrange(float tv0, float tv1, int[] indices, float[] res);
	
	<T extends ITup2WF> T arrange(ITup2RF t, int[] indices, T res);
	
	<T extends ITup2WF> T arrange(ITupRF t, int[] indices, T res);
	
	<T extends ITup2WF> T arrange(float[] t, int[] indices, T res);
	
	<T extends ITup2WF> T arrange(float tv0, float tv1, int[] indices, T res);

	<T extends ITup2RF> T arrangeCreateNew(ITup2RF t, int[] indices, T prototype);
	
	<T extends ITup2RF> T arrangeCreateNew(ITupRF t, int[] indices, T prototype);

	<T extends ITup2RF> T arrangeCreateNew(float[] t, int[] indices, T prototype);

	<T extends ITup2RF> T arrangeCreateNew(float tv0, float tv1, int[] indices, T prototype);
	
	float[] arrange(ITup2RF t, int index0, int index1, float[] res);
	
	float[] arrange(ITupRF t, int index0, int index1, float[] res);
	
	float[] arrange(float[] t, int index0, int index1, float[] res);
	
	float[] arrange(float tv0, float tv1, int index0, int index1, float[] res);
	
	<T extends ITup2WF> T arrange(ITup2RF t, int index0, int index1, T res);
	
	<T extends ITup2WF> T arrange(ITupRF t, int index0, int index1, T res);
	
	<T extends ITup2WF> T arrange(float[] t, int index0, int index1, T res);
	
	<T extends ITup2WF> T arrange(float tv0, float tv1, int index0, int index1, T res);

	<T extends ITup2RF> T arrangeCreateNew(ITup2RF t, int index0, int index1, T prototype);
	
	<T extends ITup2RF> T arrangeCreateNew(ITupRF t, int index0, int index1, T prototype);

	<T extends ITup2RF> T arrangeCreateNew(float[] t, int index0, int index1, T prototype);

	<T extends ITup2RF> T arrangeCreateNew(float tv0, float tv1, int index0, int index1, T prototype);

	float[] swizzle(ITup2RF t, int indexA, int indexB, float[] res);
	
	float[] swizzle(ITupRF t, int indexA, int indexB, float[] res);
	
	float[] swizzle(float[] t, int indexA, int indexB, float[] res);
	
	float[] swizzle(float tv0, float tv1, int indexA, int indexB, float[] res);
	
	<T extends ITup2WF> T swizzle(ITup2RF t, int indexA, int indexB, T res);
	
	<T extends ITup2WF> T swizzle(ITupRF t, int indexA, int indexB, T res);
	
	<T extends ITup2WF> T swizzle(float[] t, int indexA, int indexB, T res);
	
	<T extends ITup2WF> T swizzle(float tv0, float tv1, int indexA, int indexB, T res);

	<T extends ITup2RF> T swizzleCreateNew(ITup2RF t, int indexA, int indexB, T prototype);
	
	<T extends ITup2RF> T swizzleCreateNew(ITupRF t, int indexA, int indexB, T prototype);

	<T extends ITup2RF> T swizzleCreateNew(float[] t, int indexA, int indexB, T prototype);

	<T extends ITup2RF> T swizzleCreateNew(float tv0, float tv1, int indexA, int indexB, T prototype);
	
	float[] swizzleV0V1(ITup2RF t, float[] res);
	
	float[] swizzleV0V1(ITupRF t, float[] res);
	
	float[] swizzleV0V1(float[] t, float[] res);
	
	float[] swizzleV0V1(float tv0, float tv1, float[] res);
	
	<T extends ITup2WF> T swizzleV0V1(ITup2RF t, T res);
	
	<T extends ITup2WF> T swizzleV0V1(ITupRF t, T res);
	
	<T extends ITup2WF> T swizzleV0V1(float[] t, T res);
	
	<T extends ITup2WF> T swizzleV0V1(float tv0, float tv1, T res);

	<T extends ITup2RF> T swizzleV0V1CreateNew(ITup2RF t, T prototype);
	
	<T extends ITup2RF> T swizzleV0V1CreateNew(ITupRF t, T prototype);

	<T extends ITup2RF> T swizzleV0V1CreateNew(float[] t, T prototype);

	<T extends ITup2RF> T swizzleV0V1CreateNew(float tv0, float tv1, T prototype);
	
	public interface CompareProvider
	{
		boolean equals(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equals(@AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equals(@AllowNull ITup2RF t1, @AllowNull float[] t2);

		boolean equals(@AllowNull ITup2RF t1, float t2v0, float t2v1);

		boolean equals(@AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2);

		boolean equals(@AllowNull ITupRF t1, float t2v0, float t2v1);
		
		boolean equals(@AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equals(@AllowNull float[] t1, @AllowNull float[] t2);

		boolean equals(@AllowNull float[] t1, float t2v0, float t2v1);
		
		boolean equals(float t1v0, float t1v1, @AllowNull ITup2RF t2);

		boolean equals(float t1v0, float t1v1, @AllowNull ITupRF t2);

		boolean equals(float t1v0, float t1v1, @AllowNull float[] t2);

		boolean equals(float t1v0, float t1v1, float t2v0, float t2v1);

		boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2);

		boolean equals(float tolerance, @AllowNull ITup2RF t1, float t2v0, float t2v1);
		
		boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2);

		boolean equals(float tolerance, @AllowNull ITupRF t1, float t2v0, float t2v1);

		boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2);

		boolean equals(float tolerance, @AllowNull float[] t1, float t2v0, float t2v1);
		
		boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITup2RF t2);

		boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITupRF t2);

		boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull float[] t2);

		boolean equals(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1);

		boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2);

		boolean equalsAt(int index, @AllowNull ITup2RF t1, float value);
		
		boolean equalsAt(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1);
		
		boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2);

		boolean equalsAt(int index, @AllowNull ITupRF t1, float value);
		
		boolean equalsAt(int index, @AllowNull ITupRF t1, float t2v0, float t2v1);
		
		boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2);

		boolean equalsAt(int index, @AllowNull float[] t1, float value);
		
		boolean equalsAt(int index, @AllowNull float[] t1, float t2v0, float t2v1);
		
		boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2);

		boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITupRF t2);

		boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull float[] t2);

		boolean equalsAt(int index, float t1v0, float t1v1, float value);
		
		boolean equalsAt(int index, float t1v0, float t1v1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull float[] t2);
		
		boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float value);
		
		boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2);
		
		boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float value);
		
		boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2);
		
		boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float value);
		
		boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITup2RF t2);

		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITupRF t2);

		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull float[] t2);
		
		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float value);
		
		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t2v0, float t2v1);
		
		boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull float[] t2);

		boolean equalsAtV0(@AllowNull ITup2RF t1, float value);

		boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull float[] t2);

		boolean equalsAtV0(@AllowNull ITupRF t1, float value);
		
		boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equalsAtV0(@AllowNull float[] t1, @AllowNull float[] t2);

		boolean equalsAtV0(@AllowNull float[] t1, float value);
		
		boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull float[] t2);

		boolean equalsAtV1(@AllowNull ITup2RF t1, float value);

		boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull float[] t2);

		boolean equalsAtV1(@AllowNull ITupRF t1, float value);
		
		boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equalsAtV1(@AllowNull float[] t1, @AllowNull float[] t2);

		boolean equalsAtV1(@AllowNull float[] t1, float value);
		
		boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2);

		boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, float value);

		boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2);

		boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, float value);
		
		boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2);

		boolean equalsAtV0(float tolerance, @AllowNull float[] t1, float value);
		
		boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2);

		boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2);

		boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, float value);
		
		boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2);

		boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2);

		boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2);

		boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, float value);
		
		boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2);

		boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2);

		boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2);

		boolean equalsAtV1(float tolerance, @AllowNull float[] t1, float value);
		
		boolean isFinite(ITup2RF t);
		
		boolean isFinite(ITupRF t);
		
		boolean isFinite(float[] t);
		
		boolean isFinite(float tv0, float tv1);
		
		boolean isFiniteAt(int index, ITup2RF t);
		
		boolean isFiniteAt(int index, ITupRF t);
		
		boolean isFiniteAt(int index, float[] t);
		
		boolean isFiniteAt(int index, float tv0, float tv1);
		
		boolean isFiniteAtV0(ITup2RF t);
		
		boolean isFiniteAtV0(ITupRF t);
		
		boolean isFiniteAtV0(float[] t);
		
		boolean isFiniteAtV1(ITup2RF t);
		
		boolean isFiniteAtV1(ITupRF t);
		
		boolean isFiniteAtV1(float[] t);
		
		boolean isZero(ITup2RF t);
		
		boolean isZero(ITupRF t);
		
		boolean isZero(float[] t);
		
		boolean isZero(float tv0, float tv1);
		
		boolean isZero(float tolerance, ITup2RF t);
		
		boolean isZero(float tolerance, ITupRF t);
		
		boolean isZero(float tolerance, float[] t);
		
		boolean isZero(float tolerance, float tv0, float tv1);
		
		boolean isZeroAt(int index, ITup2RF t);
		
		boolean isZeroAt(int index, ITupRF t);
		
		boolean isZeroAt(int index, float[] t);
		
		boolean isZeroAt(int index, float tv0, float tv1);
		
		boolean isZeroAt(float tolerance, int index, ITup2RF t);
		
		boolean isZeroAt(float tolerance, int index, ITupRF t);
		
		boolean isZeroAt(float tolerance, int index, float[] t);
		
		boolean isZeroAt(float tolerance, int index, float tv0, float tv1);
		
		boolean isZeroAtV0(ITup2RF t);
		
		boolean isZeroAtV0(ITupRF t);
		
		boolean isZeroAtV0(float[] t);
		
		boolean isZeroAtV1(ITup2RF t);
		
		boolean isZeroAtV1(ITupRF t);
		
		boolean isZeroAtV1(float[] t);
		
		boolean isZeroAtV0(float tolerance, ITup2RF t);
		
		boolean isZeroAtV0(float tolerance, ITupRF t);
		
		boolean isZeroAtV0(float tolerance, float[] t);
		
		boolean isZeroAtV1(float tolerance, ITup2RF t);
		
		boolean isZeroAtV1(float tolerance, ITupRF t);
		
		boolean isZeroAtV1(float tolerance, float[] t);
	}
	
	public interface LerpProvider
	{
		float[] lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res);
		
		float[] lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T lerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T lerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2WF> T lerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T lerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends ITup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res);
		
		float[] step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, ITupRF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends ITup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res);
		
		float[] smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smoothstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res);
		
		float[] smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smootherstep(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype);
		

		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends ITup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] intLerp(double alpha, ITup2RF t, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, ITupRF t, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float[] t, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, float tv0, float tv1,  @ExtractionParam float[] res);

		<T extends ITup2WF> T intLerp(double alpha, ITup2RF t, @ExtractionParam T res);
		
		<T extends ITup2WF> T intLerp(double alpha, ITupRF t, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, float[] t, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, float tv0, float tv1, @ExtractionParam T res);

		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t, T prototype);

		<T extends ITup2RF> T intLerpCreateNew(double alpha, float tv0, float tv1, T prototype);
		
		float[] intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, ITup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T intLerp(double alpha, ITupRF t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, ITupRF t1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2WF> T intLerp(double alpha, float[] t1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T intLerp(double alpha, float[] t1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITup2RF t2, @ExtractionParam T res);
		
		<T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, ITupRF t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends ITup2WF> T intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, ITupRF t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, ITup2RF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, ITupRF t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends ITup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
	}
}
