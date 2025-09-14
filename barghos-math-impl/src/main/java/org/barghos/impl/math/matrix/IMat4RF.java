package org.barghos.impl.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.function.floats.IFunc2F;
import org.barghos.api.core.function.floats.IFunc3F;
import org.barghos.api.core.function.floats.IFunc4F;
import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITup4WF;

public interface IMat4RF extends ISqrMatRF
{
	public static final int ROW_SIZE = 4;
	public static final int COL_SIZE = 4;
	public static final int SIZE = ROW_SIZE * COL_SIZE;

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
	
	<T> T transform2Func(boolean isPoint, ITup2RF v, IFunc2F<T> func);
	
	<T> T transform2Func(boolean isPoint, float[] v, IFunc2F<T> func);
	
	<T> T transform2Func(boolean isPoint, float v0, float v1, IFunc2F<T> func);
	
	float[] transformPoint2T(ITup2RF v, @ExtractionParam float[] res);
	
	float[] transformPoint2T(float[] v, @ExtractionParam float[] res);
	
	float[] transformPoint2T(float v0, float v1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T transformPoint2T(ITup2RF v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformPoint2T(float[] v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformPoint2T(float v0, float v1, @ExtractionParam T res);
	
	<T> T transformPoint2Func(ITup2RF v, IFunc2F<T> func);
	
	<T> T transformPoint2Func(float[] v, IFunc2F<T> func);
	
	<T> T transformPoint2Func(float v0, float v1, IFunc2F<T> func);
	
	float[] transformVec2T(ITup2RF v, @ExtractionParam float[] res);
	
	float[] transformVec2T(float[] v, @ExtractionParam float[] res);
	
	float[] transformVec2T(float v0, float v1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T transformVec2T(ITup2RF v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformVec2T(float[] v, @ExtractionParam T res);
	
	<T extends ITup2WF> T transformVec2T(float v0, float v1, @ExtractionParam T res);
	
	<T> T transformVec2Func(ITup2RF v, IFunc2F<T> func);
	
	<T> T transformVec2Func(float[] v, IFunc2F<T> func);
	
	<T> T transformVec2Func(float v0, float v1, IFunc2F<T> func);
	
	float[] transform3T(boolean isPoint, ITup3RF v, @ExtractionParam float[] res);
	
	float[] transform3T(boolean isPoint, float[] v, @ExtractionParam float[] res);
	
	float[] transform3T(boolean isPoint, float v0, float v1, float v2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T transform3T(boolean isPoint, ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transform3T(boolean isPoint, float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transform3T(boolean isPoint, float v0, float v1, float v2, @ExtractionParam T res);
	
	<T> T transform3Func(boolean isPoint, ITup3RF v, IFunc3F<T> func);
	
	<T> T transform3Func(boolean isPoint, float[] v, IFunc3F<T> func);
	
	<T> T transform3Func(boolean isPoint, float v0, float v1, float v2, IFunc3F<T> func);
	
	float[] transformPoint3T(ITup3RF v, @ExtractionParam float[] res);
	
	float[] transformPoint3T(float[] v, @ExtractionParam float[] res);
	
	float[] transformPoint3T(float v0, float v1, float v2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T transformPoint3T(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformPoint3T(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformPoint3T(float v0, float v1, float v2, @ExtractionParam T res);
	
	<T> T transformPoint3Func(ITup3RF v, IFunc3F<T> func);
	
	<T> T transformPoint3Func(float[] v, IFunc3F<T> func);
	
	<T> T transformPoint3Func(float v0, float v1, float v2, IFunc3F<T> func);
	
	float[] transformVec3T(ITup3RF v, @ExtractionParam float[] res);
	
	float[] transformVec3T(float[] v, @ExtractionParam float[] res);
	
	float[] transformVec3T(float v0, float v1, float v2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T transformVec3T(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformVec3T(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformVec3T(float v0, float v1, float v2, @ExtractionParam T res);
	
	<T> T transformVec3Func(ITup3RF v, IFunc3F<T> func);
	
	<T> T transformVec3Func(float[] v, IFunc3F<T> func);
	
	<T> T transformVec3Func(float v0, float v1, float v2, IFunc3F<T> func);
	
	float[] transform4T(ITup4RF v, @ExtractionParam float[] res);
	
	float[] transform4T(float[] v, @ExtractionParam float[] res);
	
	float[] transform4T(float v0, float v1, float v2, float v3, @ExtractionParam float[] res);
	
	<T extends ITup4WF> T transform4T(ITup4RF v, @ExtractionParam T res);
	
	<T extends ITup4WF> T transform4T(float[] v, @ExtractionParam T res);
	
	<T extends ITup4WF> T transform4T(float v0, float v1, float v2, float v3, @ExtractionParam T res);
	
	<T> T transform4Func(ITup4RF v, IFunc4F<T> func);
	
	<T> T transform4Func(float[] v, IFunc4F<T> func);
	
	<T> T transform4Func(float v0, float v1, float v2, float v3, IFunc4F<T> func);
	
	IMat4RF translate2N(ITup2RF v);
	
	IMat4RF translate2N(float[] v);
	
	IMat4RF translate2N(float v0, float v1);
	
	IMat4RF translate3N(ITup3RF v);
	
	IMat4RF translate3N(float[] v);
	
	IMat4RF translate3N(float v0, float v1, float v2);
	
	IMat4RF scale2N(ITup2RF v);
	
	IMat4RF scale2N(float[] v);
	
	IMat4RF scale2N(float v0, float v1);
	
	IMat4RF scale3N(ITup3RF v);
	
	IMat4RF scale3N(float[] v);
	
	IMat4RF scale3N(float v0, float v1, float v2);
	
	IMat4RF scale4N(ITup4RF v);
	
	IMat4RF scale4N(float[] v);
	
	IMat4RF scale4N(float v0, float v1, float v2, float v3);
	
	IMat4RF baseChangeN(ITup3RF u, ITup3RF v, ITup3RF w);
	
	IMat4RF baseChangeN(ITup3RF u, ITup3RF v, float[] w);
	
	IMat4RF baseChangeN(ITup3RF u, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(ITup3RF u, float[] v, ITup3RF w);
	
	IMat4RF baseChangeN(ITup3RF u, float[] v, float[] w);
	
	IMat4RF baseChangeN(ITup3RF u, float[] v, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4RF baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, float[] w);
	
	IMat4RF baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(float[] u, ITup3RF v, ITup3RF w);
	
	IMat4RF baseChangeN(float[] u, ITup3RF v, float[] w);
	
	IMat4RF baseChangeN(float[] u, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(float[] u, float[] v, ITup3RF w);
	
	IMat4RF baseChangeN(float[] u, float[] v, float[] w);
	
	IMat4RF baseChangeN(float[] u, float[] v, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(float[] u, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4RF baseChangeN(float[] u, float vV0, float vV1, float vV2, float[] w);
	
	IMat4RF baseChangeN(float[] u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, ITup3RF w);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, float[] w);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, float[] v, ITup3RF w);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, float[] v, float[] w);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, float[] v, float wV0, float wV1, float wV2);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float[] w);
	
	IMat4RF baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4RF rotateRadN(float aV0, float aV1, float aV2, float angle);
	
	IMat4RF rotateDegN(float aV0, float aV1, float aV2, float angle);
}
