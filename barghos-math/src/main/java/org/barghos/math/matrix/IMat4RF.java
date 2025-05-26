package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.tuple.floats.ITup2RF;
import org.barghos.util.tuple.floats.ITup2WF;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITup4RF;
import org.barghos.util.tuple.floats.ITup4WF;

public interface IMat4RF extends ISqrMatRF
{
	public static final int ROW_SIZE = 4;
	public static final int COL_SIZE = 4;
	public static final int SIZE = ROW_SIZE * COL_SIZE;
	
	IMat4RF createNew();

	IMat4RF createNew(IMat4RF m);

	IMat4RF createNew(float[] m);
	
	IMat4RF createNew(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33);

	default int rowSize()
	{
		return ROW_SIZE;
	}

	default int colSize()
	{
		return COL_SIZE;
	}

	default int size()
	{
		return SIZE;
	}
	
	float m00();
	float m01();
	float m02();
	float m03();
	
	float m10();
	float m11();
	float m12();
	float m13();
	
	float m20();
	float m21();
	float m22();
	float m23();
	
	float m30();
	float m31();
	float m32();
	float m33();
	
	float[] getRow0();

	float[] getRow0(@ExtractionParam float[] res);
	
	float[] getRow1();

	float[] getRow1(@ExtractionParam float[] res);
	
	float[] getRow2();

	float[] getRow2(@ExtractionParam float[] res);
	
	float[] getRow3();

	float[] getRow3(@ExtractionParam float[] res);
	
	float[] getCol0();
	
	float[] getCol0(@ExtractionParam float[] res);
	
	float[] getCol1();
	
	float[] getCol1(@ExtractionParam float[] res);
	
	float[] getCol2();
	
	float[] getCol2(@ExtractionParam float[] res);
	
	float[] getCol3();
	
	float[] getCol3(@ExtractionParam float[] res);

	IMat4RF invertN();
	
	IMat4RF transposeN();
	
	IMat4RF mulN(IMat4RF m);
	
	IMat4RF revMulN(IMat4RF m);
	
	float[] transform2T(boolean isPoint, ITup2RF v, @ExtractionParam float[] res);
	
	float[] transform2T(boolean isPoint, float[] v, @ExtractionParam float[] res);
	
	float[] transform2T(boolean isPoint, float v0, float v1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T transform2T(boolean isPoint, ITup2RF v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transform2T(boolean isPoint, float[] v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transform2T(boolean isPoint, float v0, float v1, @ExtractionParam T res);
	
	<T extends ITup2RF> T transform2N(boolean isPoint, ITup2RF v, @ExtractionParam T prototype);
	
	<T extends ITup2RF> T transform2N(boolean isPoint, float[] v, @ExtractionParam T prototype);
	
	<T extends ITup2RF> T transform2N(boolean isPoint, float v0, float v1, @ExtractionParam T prototype);
	
	float[] transformPoint2T(ITup2RF v, @ExtractionParam float[] res);
	
	float[] transformPoint2T(float[] v, @ExtractionParam float[] res);
	
	float[] transformPoint2T(float v0, float v1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T transformPoint2T(ITup2RF v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformPoint2T(float[] v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformPoint2T(float v0, float v1, @ExtractionParam T res);
	
	<T extends ITup2RF> T transformPoint2N(ITup2RF v, @ExtractionParam T prototype);
	
	<T extends ITup2RF> T transformPoint2N(float[] v, @ExtractionParam T prototype);
	
	<T extends ITup2RF> T transformPoint2N(float v0, float v1, @ExtractionParam T prototype);
	
	float[] transformVec2T(ITup2RF v, @ExtractionParam float[] res);
	
	float[] transformVec2T(float[] v, @ExtractionParam float[] res);
	
	float[] transformVec2T(float v0, float v1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T transformVec2T(ITup2RF v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformVec2T(float[] v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformVec2T(float v0, float v1, @ExtractionParam T res);
	
	<T extends ITup2RF> T transformVec2N(ITup2RF v, @ExtractionParam T prototype);
	
	<T extends ITup2RF> T transformVec2N(float[] v, @ExtractionParam T prototype);
	
	<T extends ITup2RF> T transformVec2N(float v0, float v1, @ExtractionParam T prototype);
	
	float[] transform3T(boolean isPoint, ITup3RF v, @ExtractionParam float[] res);
	
	float[] transform3T(boolean isPoint, float[] v, @ExtractionParam float[] res);
	
	float[] transform3T(boolean isPoint, float v0, float v1, float v2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T transform3T(boolean isPoint, ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transform3T(boolean isPoint, float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transform3T(boolean isPoint, float v0, float v1, float v2, @ExtractionParam T res);
	
	<T extends ITup3RF> T transform3N(boolean isPoint, ITup3RF v, @ExtractionParam T prototype);
	
	<T extends ITup3RF> T transform3N(boolean isPoint, float[] v, @ExtractionParam T prototype);
	
	<T extends ITup3RF> T transform3N(boolean isPoint, float v0, float v1, float v2, @ExtractionParam T prototype);
	
	float[] transformPoint3T(ITup3RF v, @ExtractionParam float[] res);
	
	float[] transformPoint3T(float[] v, @ExtractionParam float[] res);
	
	float[] transformPoint3T(float v0, float v1, float v2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T transformPoint3T(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformPoint3T(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformPoint3T(float v0, float v1, float v2, @ExtractionParam T res);
	
	<T extends ITup3RF> T transformPoint3N(ITup3RF v, @ExtractionParam T prototype);
	
	<T extends ITup3RF> T transformPoint3N(float[] v, @ExtractionParam T prototype);
	
	<T extends ITup3RF> T transformPoint3N(float v0, float v1, float v2, @ExtractionParam T prototype);
	
	float[] transformVec3T(ITup3RF v, @ExtractionParam float[] res);
	
	float[] transformVec3T(float[] v, @ExtractionParam float[] res);
	
	float[] transformVec3T(float v0, float v1, float v2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T transformVec3T(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformVec3T(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformVec3T(float v0, float v1, float v2, @ExtractionParam T res);
	
	<T extends ITup3RF> T transformVec3N(ITup3RF v, @ExtractionParam T prototype);
	
	<T extends ITup3RF> T transformVec3N(float[] v, @ExtractionParam T prototype);
	
	<T extends ITup3RF> T transformVec3N(float v0, float v1, float v2, @ExtractionParam T prototype);
	
	float[] transform4T(ITup4RF v, @ExtractionParam float[] res);
	
	float[] transform4T(float[] v, @ExtractionParam float[] res);
	
	float[] transform4T(float v0, float v1, float v2, float v3, @ExtractionParam float[] res);
	
	<T extends ITup4WF> T transform4T(ITup4RF v, @ExtractionParam T res);
	
	<T extends ITup4WF> T transform4T(float[] v, @ExtractionParam T res);
	
	<T extends ITup4WF> T transform4T(float v0, float v1, float v2, float v3, @ExtractionParam T res);
	
	<T extends ITup4RF> T transform4N(ITup4RF v, @ExtractionParam T prototype);
	
	<T extends ITup4RF> T transform4N(float[] v, @ExtractionParam T prototype);
	
	<T extends ITup4RF> T transform4N(float v0, float v1, float v2, float v3, @ExtractionParam T prototype);
}
