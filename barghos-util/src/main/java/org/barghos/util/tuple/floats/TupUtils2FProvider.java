package org.barghos.util.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.Nullable;
import org.barghos.util.collection.IndexValuePairF;

public interface TupUtils2FProvider
{
	IndexValuePairF min(Tup2RF t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF min(float[] t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF min(float tv0, float tv1, @ExtractionParam IndexValuePairF res);

	IndexValuePairF max(Tup2RF t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF max(float[] t, @ExtractionParam IndexValuePairF res);

	IndexValuePairF max(float tv0, float tv1, @ExtractionParam IndexValuePairF res);

	float[] minComponents(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res);

	float[] minComponents(Tup2RF t1, float[] t2, @ExtractionParam float[] res);

	float[] minComponents(Tup2RF t1, float t2v0, float v2y, @ExtractionParam float[] res);

	float[] minComponents(float[] t1, Tup2RF t2, @ExtractionParam float[] res);

	float[] minComponents(float[] t1, float[] t2, @ExtractionParam float[] res);

	float[] minComponents(float[] t1, float t2v0, float v2y, @ExtractionParam float[] res);

	float[] minComponents(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res);

	float[] minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

	float[] minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res);

	<T extends Tup2WF> T minComponents(Tup2RF t1, Tup2RF t2, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(Tup2RF t1, float[] t2, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(float[] t1, Tup2RF t2, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(float[] t1, float[] t2, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

	<T extends Tup2WF> T minComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends Tup2RF> T minComponentsCreateNew(Tup2RF t1, Tup2RF t2, T prototype);
	
	<T extends Tup2RF> T minComponentsCreateNew(Tup2RF t1, float[] t2, T prototype);
	
	<T extends Tup2RF> T minComponentsCreateNew(Tup2RF t1, float t2v0, float t2v1, T prototype);

	<T extends Tup2RF> T minComponentsCreateNew(float[] t1, Tup2RF t2, T prototype);

	<T extends Tup2RF> T minComponentsCreateNew(float[] t1, float[] t2, T prototype);

	<T extends Tup2RF> T minComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype);

	<T extends Tup2RF> T minComponentsCreateNew(float t1v0, float t1v1, Tup2RF t2, T prototype);

	<T extends Tup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype);

	<T extends Tup2RF> T minComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
	
	float[] maxComponents(Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res);

	float[] maxComponents(Tup2RF t1, float[] t2, @ExtractionParam float[] res);

	float[] maxComponents(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

	float[] maxComponents(float[] t1, Tup2RF t2, @ExtractionParam float[] res);

	float[] maxComponents(float[] t1, float[] t2, @ExtractionParam float[] res);

	float[] maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

	float[] maxComponents(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res);

	float[] maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

	float[] maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam float[] res);

	<T extends Tup2WF> T maxComponents(Tup2RF t1, Tup2RF t2, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(Tup2RF t1, float[] t2, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(float[] t1, Tup2RF t2, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(float[] t1, float[] t2, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

	<T extends Tup2WF> T maxComponents(float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);

	<T extends Tup2RF> T maxComponentsCreateNew(Tup2RF t1, Tup2RF t2, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(Tup2RF t1, float[] t2, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(Tup2RF t1, float t2v0, float t2v1, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(float[] t1, Tup2RF t2, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(float[] t1, float[] t2, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(float[] t1, float t2v0, float t2v1, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, Tup2RF t2, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float[] t2, T prototype);

	<T extends Tup2RF> T maxComponentsCreateNew(float t1v0, float t1v1, float t2v0, float t2v1, T prototype);

	float[] arrange(Tup2RF t, int[] indices, float[] res);
	
	float[] arrange(float[] t, int[] indices, float[] res);
	
	float[] arrange(float tv0, float tv1, int[] indices, float[] res);
	
	<T extends Tup2WF> T arrange(Tup2RF t, int[] indices, T res);
	
	<T extends Tup2WF> T arrange(float[] t, int[] indices, T res);
	
	<T extends Tup2WF> T arrange(float tv0, float tv1, int[] indices, T res);

	<T extends Tup2RF> T arrangeCreateNew(Tup2RF t, int[] indices, T prototype);

	<T extends Tup2RF> T arrangeCreateNew(float[] t, int[] indices, T prototype);

	<T extends Tup2RF> T arrangeCreateNew(float tv0, float tv1, int[] indices, T prototype);
	
	float[] arrange(Tup2RF t, int index0, int index1, float[] res);
	
	float[] arrange(float[] t, int index0, int index1, float[] res);
	
	float[] arrange(float tv0, float tv1, int index0, int index1, float[] res);
	
	<T extends Tup2WF> T arrange(Tup2RF t, int index0, int index1, T res);
	
	<T extends Tup2WF> T arrange(float[] t, int index0, int index1, T res);
	
	<T extends Tup2WF> T arrange(float tv0, float tv1, int index0, int index1, T res);

	<T extends Tup2RF> T arrangeCreateNew(Tup2RF t, int index0, int index1, T prototype);

	<T extends Tup2RF> T arrangeCreateNew(float[] t, int index0, int index1, T prototype);

	<T extends Tup2RF> T arrangeCreateNew(float tv0, float tv1, int index0, int index1, T prototype);

	float[] swizzle(Tup2RF t, int indexA, int indexB, float[] res);
	
	float[] swizzle(float[] t, int indexA, int indexB, float[] res);
	
	float[] swizzle(float tv0, float tv1, int indexA, int indexB, float[] res);
	
	<T extends Tup2WF> T swizzle(Tup2RF t, int indexA, int indexB, T res);
	
	<T extends Tup2WF> T swizzle(float[] t, int indexA, int indexB, T res);
	
	<T extends Tup2WF> T swizzle(float tv0, float tv1, int indexA, int indexB, T res);

	<T extends Tup2RF> T swizzleCreateNew(Tup2RF t, int indexA, int indexB, T prototype);

	<T extends Tup2RF> T swizzleCreateNew(float[] t, int indexA, int indexB, T prototype);

	<T extends Tup2RF> T swizzleCreateNew(float tv0, float tv1, int indexA, int indexB, T prototype);
	
	float[] swizzleV0V1(Tup2RF t, float[] res);
	
	float[] swizzleV0V1(float[] t, float[] res);
	
	float[] swizzleV0V1(float tv0, float tv1, float[] res);
	
	<T extends Tup2WF> T swizzleV0V1(Tup2RF t, T res);
	
	<T extends Tup2WF> T swizzleV0V1(float[] t, T res);
	
	<T extends Tup2WF> T swizzleV0V1(float tv0, float tv1, T res);

	<T extends Tup2RF> T swizzleV0V1CreateNew(Tup2RF t, T prototype);

	<T extends Tup2RF> T swizzleV0V1CreateNew(float[] t, T prototype);

	<T extends Tup2RF> T swizzleV0V1CreateNew(float tv0, float tv1, T prototype);
	
	public interface CompareProvider
	{
		boolean equals(@Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equals(@Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equals(@Nullable Tup2RF t1, @Nullable float[] t2);

		boolean equals(@Nullable Tup2RF t1, float t2v0, float t2v1);

		boolean equals(@Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equals(@Nullable TupRF t1, @Nullable TupRF t2);

		boolean equals(@Nullable TupRF t1, @Nullable float[] t2);

		boolean equals(@Nullable TupRF t1, float t2v0, float t2v1);
		
		boolean equals(@Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equals(@Nullable float[] t1, @Nullable TupRF t2);

		boolean equals(@Nullable float[] t1, @Nullable float[] t2);

		boolean equals(@Nullable float[] t1, float t2v0, float t2v1);
		
		boolean equals(float t1v0, float t1v1, @Nullable Tup2RF t2);

		boolean equals(float t1v0, float t1v1, @Nullable TupRF t2);

		boolean equals(float t1v0, float t1v1, @Nullable float[] t2);

		boolean equals(float t1v0, float t1v1, float t2v0, float t2v1);

		boolean equals(float tolerance, @Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equals(float tolerance, @Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equals(float tolerance, @Nullable Tup2RF t1, @Nullable float[] t2);

		boolean equals(float tolerance, @Nullable Tup2RF t1, float t2v0, float t2v1);
		
		boolean equals(float tolerance, @Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equals(float tolerance, @Nullable TupRF t1, @Nullable TupRF t2);

		boolean equals(float tolerance, @Nullable TupRF t1, @Nullable float[] t2);

		boolean equals(float tolerance, @Nullable TupRF t1, float t2v0, float t2v1);

		boolean equals(float tolerance, @Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equals(float tolerance, @Nullable float[] t1, @Nullable TupRF t2);

		boolean equals(float tolerance, @Nullable float[] t1, @Nullable float[] t2);

		boolean equals(float tolerance, @Nullable float[] t1, float t2v0, float t2v1);
		
		boolean equals(float tolerance, float t1v0, float t1v1, @Nullable Tup2RF t2);

		boolean equals(float tolerance, float t1v0, float t1v1, @Nullable TupRF t2);

		boolean equals(float tolerance, float t1v0, float t1v1, @Nullable float[] t2);

		boolean equals(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1);

		boolean equalsAt(int index, @Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equalsAt(int index, @Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equalsAt(int index, @Nullable Tup2RF t1, @Nullable float[] t2);

		boolean equalsAt(int index, @Nullable Tup2RF t1, float value);
		
		boolean equalsAt(int index, @Nullable Tup2RF t1, float t2v0, float t2v1);
		
		boolean equalsAt(int index, @Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equalsAt(int index, @Nullable TupRF t1, @Nullable TupRF t2);

		boolean equalsAt(int index, @Nullable TupRF t1, @Nullable float[] t2);

		boolean equalsAt(int index, @Nullable TupRF t1, float value);
		
		boolean equalsAt(int index, @Nullable TupRF t1, float t2v0, float t2v1);
		
		boolean equalsAt(int index, @Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equalsAt(int index, @Nullable float[] t1, @Nullable TupRF t2);

		boolean equalsAt(int index, @Nullable float[] t1, @Nullable float[] t2);

		boolean equalsAt(int index, @Nullable float[] t1, float value);
		
		boolean equalsAt(int index, @Nullable float[] t1, float t2v0, float t2v1);
		
		boolean equalsAt(int index, float t1v0, float t1v1, @Nullable Tup2RF t2);

		boolean equalsAt(int index, float t1v0, float t1v1, @Nullable TupRF t2);

		boolean equalsAt(int index, float t1v0, float t1v1, @Nullable float[] t2);

		boolean equalsAt(int index, float t1v0, float t1v1, float value);
		
		boolean equalsAt(int index, float t1v0, float t1v1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, @Nullable float[] t2);
		
		boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, float value);
		
		boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, @Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equalsAt(float tolerance, int index, @Nullable TupRF t1, @Nullable TupRF t2);

		boolean equalsAt(float tolerance, int index, @Nullable TupRF t1, @Nullable float[] t2);
		
		boolean equalsAt(float tolerance, int index, @Nullable TupRF t1, float value);
		
		boolean equalsAt(float tolerance, int index, @Nullable TupRF t1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, @Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equalsAt(float tolerance, int index, @Nullable float[] t1, @Nullable TupRF t2);

		boolean equalsAt(float tolerance, int index, @Nullable float[] t1, @Nullable float[] t2);
		
		boolean equalsAt(float tolerance, int index, @Nullable float[] t1, float value);
		
		boolean equalsAt(float tolerance, int index, @Nullable float[] t1, float t2v0, float t2v1);
		
		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @Nullable Tup2RF t2);

		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @Nullable TupRF t2);

		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @Nullable float[] t2);
		
		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float value);
		
		boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t2v0, float t2v1);
		
		boolean equalsAtV0(@Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equalsAtV0(@Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equalsAtV0(@Nullable Tup2RF t1, @Nullable float[] t2);

		boolean equalsAtV0(@Nullable Tup2RF t1, float value);

		boolean equalsAtV0(@Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equalsAtV0(@Nullable TupRF t1, @Nullable TupRF t2);

		boolean equalsAtV0(@Nullable TupRF t1, @Nullable float[] t2);

		boolean equalsAtV0(@Nullable TupRF t1, float value);
		
		boolean equalsAtV0(@Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equalsAtV0(@Nullable float[] t1, @Nullable TupRF t2);

		boolean equalsAtV0(@Nullable float[] t1, @Nullable float[] t2);

		boolean equalsAtV0(@Nullable float[] t1, float value);
		
		boolean equalsAtV1(@Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equalsAtV1(@Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equalsAtV1(@Nullable Tup2RF t1, @Nullable float[] t2);

		boolean equalsAtV1(@Nullable Tup2RF t1, float value);

		boolean equalsAtV1(@Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equalsAtV1(@Nullable TupRF t1, @Nullable TupRF t2);

		boolean equalsAtV1(@Nullable TupRF t1, @Nullable float[] t2);

		boolean equalsAtV1(@Nullable TupRF t1, float value);
		
		boolean equalsAtV1(@Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equalsAtV1(@Nullable float[] t1, @Nullable TupRF t2);

		boolean equalsAtV1(@Nullable float[] t1, @Nullable float[] t2);

		boolean equalsAtV1(@Nullable float[] t1, float value);
		
		boolean equalsAtV0(float tolerance, @Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equalsAtV0(float tolerance, @Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equalsAtV0(float tolerance, @Nullable Tup2RF t1, @Nullable float[] t2);

		boolean equalsAtV0(float tolerance, @Nullable Tup2RF t1, float value);

		boolean equalsAtV0(float tolerance, @Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equalsAtV0(float tolerance, @Nullable TupRF t1, @Nullable TupRF t2);

		boolean equalsAtV0(float tolerance, @Nullable TupRF t1, @Nullable float[] t2);

		boolean equalsAtV0(float tolerance, @Nullable TupRF t1, float value);
		
		boolean equalsAtV0(float tolerance, @Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equalsAtV0(float tolerance, @Nullable float[] t1, @Nullable TupRF t2);

		boolean equalsAtV0(float tolerance, @Nullable float[] t1, @Nullable float[] t2);

		boolean equalsAtV0(float tolerance, @Nullable float[] t1, float value);
		
		boolean equalsAtV1(float tolerance, @Nullable Tup2RF t1, @Nullable Tup2RF t2);

		boolean equalsAtV1(float tolerance, @Nullable Tup2RF t1, @Nullable TupRF t2);

		boolean equalsAtV1(float tolerance, @Nullable Tup2RF t1, @Nullable float[] t2);

		boolean equalsAtV1(float tolerance, @Nullable Tup2RF t1, float value);
		
		boolean equalsAtV1(float tolerance, @Nullable TupRF t1, @Nullable Tup2RF t2);

		boolean equalsAtV1(float tolerance, @Nullable TupRF t1, @Nullable TupRF t2);

		boolean equalsAtV1(float tolerance, @Nullable TupRF t1, @Nullable float[] t2);

		boolean equalsAtV1(float tolerance, @Nullable TupRF t1, float value);
		
		boolean equalsAtV1(float tolerance, @Nullable float[] t1, @Nullable Tup2RF t2);

		boolean equalsAtV1(float tolerance, @Nullable float[] t1, @Nullable TupRF t2);

		boolean equalsAtV1(float tolerance, @Nullable float[] t1, @Nullable float[] t2);

		boolean equalsAtV1(float tolerance, @Nullable float[] t1, float value);
		
		boolean isFinite(Tup2RF t);
		
		boolean isFinite(TupRF t);
		
		boolean isFinite(float[] t);
		
		boolean isFinite(float tv0, float tv1);
		
		boolean isFiniteAt(int index, Tup2RF t);
		
		boolean isFiniteAt(int index, TupRF t);
		
		boolean isFiniteAt(int index, float[] t);
		
		boolean isFiniteAt(int index, float tv0, float tv1);
		
		boolean isFiniteAtV0(Tup2RF t);
		
		boolean isFiniteAtV0(TupRF t);
		
		boolean isFiniteAtV0(float[] t);
		
		boolean isFiniteAtV1(Tup2RF t);
		
		boolean isFiniteAtV1(TupRF t);
		
		boolean isFiniteAtV1(float[] t);
		
		boolean isZero(Tup2RF t);
		
		boolean isZero(TupRF t);
		
		boolean isZero(float[] t);
		
		boolean isZero(float tv0, float tv1);
		
		boolean isZero(float tolerance, Tup2RF t);
		
		boolean isZero(float tolerance, TupRF t);
		
		boolean isZero(float tolerance, float[] t);
		
		boolean isZero(float tolerance, float tv0, float tv1);
		
		boolean isZeroAt(int index, Tup2RF t);
		
		boolean isZeroAt(int index, TupRF t);
		
		boolean isZeroAt(int index, float[] t);
		
		boolean isZeroAt(int index, float tv0, float tv1);
		
		boolean isZeroAt(float tolerance, int index, Tup2RF t);
		
		boolean isZeroAt(float tolerance, int index, TupRF t);
		
		boolean isZeroAt(float tolerance, int index, float[] t);
		
		boolean isZeroAt(float tolerance, int index, float tv0, float tv1);
		
		boolean isZeroAtV0(Tup2RF t);
		
		boolean isZeroAtV0(TupRF t);
		
		boolean isZeroAtV0(float[] t);
		
		boolean isZeroAtV1(Tup2RF t);
		
		boolean isZeroAtV1(TupRF t);
		
		boolean isZeroAtV1(float[] t);
		
		boolean isZeroAtV0(float tolerance, Tup2RF t);
		
		boolean isZeroAtV0(float tolerance, TupRF t);
		
		boolean isZeroAtV0(float tolerance, float[] t);
		
		boolean isZeroAtV1(float tolerance, Tup2RF t);
		
		boolean isZeroAtV1(float tolerance, TupRF t);
		
		boolean isZeroAtV1(float tolerance, float[] t);
	}
	
	public interface LerpProvider
	{
		float[] lerp(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, Tup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] lerp(double alpha, float[] t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] lerp(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends Tup2WF> T lerp(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, Tup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, float[] t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T lerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, Tup2RF t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, Tup2RF t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, Tup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, float[] t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends Tup2RF> T lerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] step(double alpha, double midpoint, Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, Tup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float[] t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends Tup2WF> T step(double alpha, double midpoint, Tup2RF t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, Tup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, float[] t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T step(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, Tup2RF t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, Tup2RF t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, Tup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends Tup2RF> T stepCreateNew(double alpha, double midpoint, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] smoothstep(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, Tup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float[] t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends Tup2WF> T smoothstep(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, Tup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, float[] t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T smoothstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, Tup2RF t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, Tup2RF t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, Tup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, float[] t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends Tup2RF> T smoothstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] smootherstep(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, Tup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float[] t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends Tup2WF> T smootherstep(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, Tup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, float[] t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T smootherstep(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, Tup2RF t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, Tup2RF t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, Tup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, float[] t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends Tup2RF> T smootherstepCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
		
		float[] intLerp(double alpha, Tup2RF t, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float[] t, @ExtractionParam float[] res);
		
		float[] intLerp(double alpha, float tv0, float tv1,  @ExtractionParam float[] res);

		<T extends Tup2WF> T intLerp(double alpha, Tup2RF t, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float[] t, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float tv0, float tv1, @ExtractionParam T res);

		<T extends Tup2RF> T intLerpCreateNew(double alpha, Tup2RF t, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, float[] t, T prototype);

		<T extends Tup2RF> T intLerpCreateNew(double alpha, float tv0, float tv1, T prototype);
		
		float[] intLerp(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, Tup2RF t1, float[] t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float[] t1, Tup2RF t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam float[] res);

		float[] intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1,  @ExtractionParam float[] res);

		<T extends Tup2WF> T intLerp(double alpha, Tup2RF t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, Tup2RF t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, Tup2RF t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float[] t1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float[] t1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float[] t1, float t2v0, float t2v1, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float t1v0, float t1v1, Tup2RF t2, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float t1v0, float t1v1, float[] t2, @ExtractionParam T res);

		<T extends Tup2WF> T intLerp(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, @ExtractionParam T res);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, Tup2RF t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, Tup2RF t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, Tup2RF t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, float[] t1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, float[] t1, float[] t2, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, float[] t1, float t2v0, float t2v1, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, Tup2RF t2, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float[] t2, T prototype);
		
		<T extends Tup2RF> T intLerpCreateNew(double alpha, float t1v0, float t1v1, float t2v0, float t2v1, T prototype);
	}
}
