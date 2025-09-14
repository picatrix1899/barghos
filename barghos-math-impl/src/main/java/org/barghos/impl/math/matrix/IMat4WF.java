package org.barghos.impl.math.matrix;

import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup4RF;

public interface IMat4WF extends IMat4RF, ISqrMatWF
{
	/** {@inheritDoc} */
	@Override
	IMat4WF setAt(int row, int col, float value);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF setRowAt(int row, float[] values);
	
	IMat4WF setRowAt(int row, float v0, float v1, float v2, float v3);

	/** {@inheritDoc} */
	@Override
	IMat4WF setColAt(int col, float[] values);
	
	IMat4WF setColAt(int col, float v0, float v1, float v2, float v3);
	
	IMat4WF set(IMat4RF m);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF set(float[] m);

	IMat4WF set(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33);
	
	IMat4WF m00(float value);
	IMat4WF m01(float value);
	IMat4WF m02(float value);
	IMat4WF m03(float value);
	
	IMat4WF m10(float value);
	IMat4WF m11(float value);
	IMat4WF m12(float value);
	IMat4WF m13(float value);
	
	IMat4WF m20(float value);
	IMat4WF m21(float value);
	IMat4WF m22(float value);
	IMat4WF m23(float value);
	
	IMat4WF m30(float value);
	IMat4WF m31(float value);
	IMat4WF m32(float value);
	IMat4WF m33(float value);
	
	IMat4WF setRow0(ITup4RF v);
	
	IMat4WF setRow0V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setRow0V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setRow0V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setRow0V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setRow0V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setRow0V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setRow0V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setRow0V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setRow0V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setRow0V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setRow0(float[] v);
	
	IMat4WF setRow0V1V2V3V0(float[] v, float v0);
	
	IMat4WF setRow0V0V2V3V1(float[] v, float v1);
	
	IMat4WF setRow0V0V1V3V2(float[] v, float v2);
	
	IMat4WF setRow0V0V1V2V3(float[] v, float v3);
	
	IMat4WF setRow0V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setRow0V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setRow0V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setRow0V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setRow0V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setRow0V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setRow0(float v0, float v1, float v2, float v3);

	IMat4WF setRow1(ITup4RF v);
	
	IMat4WF setRow1V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setRow1V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setRow1V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setRow1V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setRow1V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setRow1V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setRow1V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setRow1V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setRow1V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setRow1V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setRow1(float[] v);
	
	IMat4WF setRow1V1V2V3V0(float[] v, float v0);
	
	IMat4WF setRow1V0V2V3V1(float[] v, float v1);
	
	IMat4WF setRow1V0V1V3V2(float[] v, float v2);
	
	IMat4WF setRow1V0V1V2V3(float[] v, float v3);
	
	IMat4WF setRow1V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setRow1V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setRow1V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setRow1V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setRow1V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setRow1V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setRow1(float v0, float v1, float v2, float v3);
	
	IMat4WF setRow2(ITup4RF v);
	
	IMat4WF setRow2V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setRow2V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setRow2V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setRow2V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setRow2V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setRow2V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setRow2V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setRow2V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setRow2V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setRow2V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setRow2(float[] v);
	
	IMat4WF setRow2V1V2V3V0(float[] v, float v0);
	
	IMat4WF setRow2V0V2V3V1(float[] v, float v1);
	
	IMat4WF setRow2V0V1V3V2(float[] v, float v2);
	
	IMat4WF setRow2V0V1V2V3(float[] v, float v3);
	
	IMat4WF setRow2V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setRow2V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setRow2V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setRow2V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setRow2V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setRow2V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setRow2(float v0, float v1, float v2, float v3);
	
	IMat4WF setRow3(ITup4RF v);
	
	IMat4WF setRow3V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setRow3V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setRow3V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setRow3V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setRow3V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setRow3V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setRow3V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setRow3V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setRow3V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setRow3V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setRow3(float[] v);
	
	IMat4WF setRow3V1V2V3V0(float[] v, float v0);
	
	IMat4WF setRow3V0V2V3V1(float[] v, float v1);
	
	IMat4WF setRow3V0V1V3V2(float[] v, float v2);
	
	IMat4WF setRow3V0V1V2V3(float[] v, float v3);
	
	IMat4WF setRow3V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setRow3V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setRow3V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setRow3V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setRow3V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setRow3V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setRow3(float v0, float v1, float v2, float v3);
	
	IMat4WF setCol0(ITup4RF v);
	
	IMat4WF setCol0V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setCol0V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setCol0V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setCol0V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setCol0V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setCol0V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setCol0V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setCol0V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setCol0V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setCol0V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setCol0(float[] v);
	
	IMat4WF setCol0V1V2V3V0(float[] v, float v0);
	
	IMat4WF setCol0V0V2V3V1(float[] v, float v1);
	
	IMat4WF setCol0V0V1V3V2(float[] v, float v2);
	
	IMat4WF setCol0V0V1V2V3(float[] v, float v3);
	
	IMat4WF setCol0V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setCol0V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setCol0V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setCol0V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setCol0V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setCol0V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setCol0(float v0, float v1, float v2, float v3);

	IMat4WF setCol1(ITup4RF v);
	
	IMat4WF setCol1V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setCol1V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setCol1V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setCol1V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setCol1V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setCol1V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setCol1V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setCol1V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setCol1V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setCol1V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setCol1(float[] v);
	
	IMat4WF setCol1V1V2V3V0(float[] v, float v0);
	
	IMat4WF setCol1V0V2V3V1(float[] v, float v1);
	
	IMat4WF setCol1V0V1V3V2(float[] v, float v2);
	
	IMat4WF setCol1V0V1V2V3(float[] v, float v3);
	
	IMat4WF setCol1V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setCol1V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setCol1V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setCol1V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setCol1V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setCol1V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setCol1(float v0, float v1, float v2, float v3);
	
	IMat4WF setCol2(ITup4RF v);
	
	IMat4WF setCol2V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setCol2V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setCol2V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setCol2V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setCol2V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setCol2V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setCol2V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setCol2V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setCol2V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setCol2V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setCol2(float[] v);
	
	IMat4WF setCol2V1V2V3V0(float[] v, float v0);
	
	IMat4WF setCol2V0V2V3V1(float[] v, float v1);
	
	IMat4WF setCol2V0V1V3V2(float[] v, float v2);
	
	IMat4WF setCol2V0V1V2V3(float[] v, float v3);
	
	IMat4WF setCol2V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setCol2V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setCol2V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setCol2V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setCol2V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setCol2V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setCol2(float v0, float v1, float v2, float v3);
	
	IMat4WF setCol3(ITup4RF v);
	
	IMat4WF setCol3V1V2V3V0(ITup3RF v, float v0);
	
	IMat4WF setCol3V0V2V3V1(ITup3RF v, float v1);
	
	IMat4WF setCol3V0V1V3V2(ITup3RF v, float v2);
	
	IMat4WF setCol3V0V1V2V3(ITup3RF v, float v3);
	
	IMat4WF setCol3V2V3V0V1(ITup2RF v, float v0, float v1);
	
	IMat4WF setCol3V1V3V0V2(ITup2RF v, float v0, float v2);
	
	IMat4WF setCol3V1V2V0V3(ITup2RF v, float v0, float v3);
	
	IMat4WF setCol3V0V3V1V2(ITup2RF v, float v1, float v2);
	
	IMat4WF setCol3V0V2V1V3(ITup2RF v, float v1, float v3);
	
	IMat4WF setCol3V0V1V2V3(ITup2RF v, float v2, float v3);
	
	IMat4WF setCol3(float[] v);
	
	IMat4WF setCol3V1V2V3V0(float[] v, float v0);
	
	IMat4WF setCol3V0V2V3V1(float[] v, float v1);
	
	IMat4WF setCol3V0V1V3V2(float[] v, float v2);
	
	IMat4WF setCol3V0V1V2V3(float[] v, float v3);
	
	IMat4WF setCol3V2V3V0V1(float[] v, float v0, float v1);
	
	IMat4WF setCol3V1V3V0V2(float[] v, float v0, float v2);
	
	IMat4WF setCol3V1V2V0V3(float[] v, float v0, float v3);
	
	IMat4WF setCol3V0V3V1V2(float[] v, float v1, float v2);
	
	IMat4WF setCol3V0V2V1V3(float[] v, float v1, float v3);
	
	IMat4WF setCol3V0V1V2V3(float[] v, float v2, float v3);
	
	IMat4WF setCol3(float v0, float v1, float v2, float v3);
	
	IMat4WF invert();
	
	IMat4WF invertN();
	
	IMat4WF transpose();
	
	IMat4WF transposeN();
	
	IMat4WF mul(IMat4RF m);
	
	IMat4WF mulN(IMat4RF m);
	
	IMat4WF revMul(IMat4RF m);
	
	IMat4WF revMulN(IMat4RF m);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF setZero();
	
	/** {@inheritDoc} */
	@Override
	IMat4WF setIdentity();
	
	IMat4WF setTranslation2(ITup2RF v);
	
	IMat4WF setTranslation2(float[] v);
	
	IMat4WF setTranslation2(float v0, float v1);
	
	IMat4WF setTranslation3(ITup3RF v);
	
	IMat4WF setTranslation3(float[] v);
	
	IMat4WF setTranslation3(float v0, float v1, float v2);
	
	IMat4WF setScaling2(ITup2RF v);
	
	IMat4WF setScaling2(float[] v);
	
	IMat4WF setScaling2(float v0, float v1);
	
	IMat4WF setScaling3(ITup3RF v);
	
	IMat4WF setScaling3(float[] v);
	
	IMat4WF setScaling3(float v0, float v1, float v2);
	
	IMat4WF setScaling4(ITup4RF v);
	
	IMat4WF setScaling4(float[] v);
	
	IMat4WF setScaling4(float v0, float v1, float v2, float v3);
	
	IMat4WF setBaseChanging(ITup3RF u, ITup3RF v, ITup3RF w);
	
	IMat4WF setBaseChanging(ITup3RF u, ITup3RF v, float[] w);
	
	IMat4WF setBaseChanging(ITup3RF u, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(ITup3RF u, float[] v, ITup3RF w);
	
	IMat4WF setBaseChanging(ITup3RF u, float[] v, float[] w);
	
	IMat4WF setBaseChanging(ITup3RF u, float[] v, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(ITup3RF u, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4WF setBaseChanging(ITup3RF u, float vV0, float vV1, float vV2, float[] w);
	
	IMat4WF setBaseChanging(ITup3RF u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(float[] u, ITup3RF v, ITup3RF w);
	
	IMat4WF setBaseChanging(float[] u, ITup3RF v, float[] w);
	
	IMat4WF setBaseChanging(float[] u, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(float[] u, float[] v, ITup3RF w);
	
	IMat4WF setBaseChanging(float[] u, float[] v, float[] w);
	
	IMat4WF setBaseChanging(float[] u, float[] v, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(float[] u, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4WF setBaseChanging(float[] u, float vV0, float vV1, float vV2, float[] w);
	
	IMat4WF setBaseChanging(float[] u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, ITup3RF v, ITup3RF w);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, ITup3RF v, float[] w);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, float[] v, ITup3RF w);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, float[] v, float[] w);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, float[] v, float wV0, float wV1, float wV2);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float[] w);
	
	IMat4WF setBaseChanging(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);

	IMat4WF setRotationByQuat(ITup4RF q);
	
	IMat4WF setRotationRad(float aV0, float aV1, float aV2, float angle);
	
	IMat4WF setRotationDeg(float aV0, float aV1, float aV2, float angle);
	
	IMat4WF setPerspective(float fovY, float aspectRatio, float near, float far);
	
	IMat4WF setOrtho(float left, float right, float bottom, float top, float near, float far);
	
	IMat4WF translate2(ITup2RF v);
	
	IMat4WF translate2(float[] v);
	
	IMat4WF translate2(float v0, float v1);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF translate2N(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF translate2N(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF translate2N(float v0, float v1);
	
	IMat4WF translate3(ITup3RF v);
	
	IMat4WF translate3(float[] v);
	
	IMat4WF translate3(float v0, float v1, float v2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF translate3N(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF translate3N(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF translate3N(float v0, float v1, float v2);
	
	IMat4WF scale2(ITup2RF v);
	
	IMat4WF scale2(float[] v);
	
	IMat4WF scale2(float v0, float v1);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale2N(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale2N(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale2N(float v0, float v1);
	
	IMat4WF scale3(ITup3RF v);
	
	IMat4WF scale3(float[] v);
	
	IMat4WF scale3(float v0, float v1, float v2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale3N(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale3N(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale3N(float v0, float v1, float v2);
	
	IMat4WF scale4(ITup4RF v);
	
	IMat4WF scale4(float[] v);
	
	IMat4WF scale4(float v0, float v1, float v2, float v3);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale4N(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale4N(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF scale4N(float v0, float v1, float v2, float v3);
	
	IMat4WF baseChange(ITup3RF u, ITup3RF v, ITup3RF w);
	
	IMat4WF baseChange(ITup3RF u, ITup3RF v, float[] w);
	
	IMat4WF baseChange(ITup3RF u, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(ITup3RF u, float[] v, ITup3RF w);
	
	IMat4WF baseChange(ITup3RF u, float[] v, float[] w);
	
	IMat4WF baseChange(ITup3RF u, float[] v, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(ITup3RF u, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4WF baseChange(ITup3RF u, float vV0, float vV1, float vV2, float[] w);
	
	IMat4WF baseChange(ITup3RF u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(float[] u, ITup3RF v, ITup3RF w);
	
	IMat4WF baseChange(float[] u, ITup3RF v, float[] w);
	
	IMat4WF baseChange(float[] u, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(float[] u, float[] v, ITup3RF w);
	
	IMat4WF baseChange(float[] u, float[] v, float[] w);
	
	IMat4WF baseChange(float[] u, float[] v, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(float[] u, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4WF baseChange(float[] u, float vV0, float vV1, float vV2, float[] w);
	
	IMat4WF baseChange(float[] u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, ITup3RF v, ITup3RF w);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, ITup3RF v, float[] w);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, ITup3RF v, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, float[] v, ITup3RF w);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, float[] v, float[] w);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, float[] v, float wV0, float wV1, float wV2);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, ITup3RF w);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float[] w);
	
	IMat4WF baseChange(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, ITup3RF v, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, ITup3RF v, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, ITup3RF v, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, float[] v, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, float[] v, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, float[] v, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, ITup3RF v, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, ITup3RF v, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, ITup3RF v, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, float[] v, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, float[] v, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, float[] v, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, float vV0, float vV1, float vV2, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, float vV0, float vV1, float vV2, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float[] u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, float[] v, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, float[] v, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, float[] v, float wV0, float wV1, float wV2);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, ITup3RF w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float[] w);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2);
	
	IMat4WF rotateRad(float aV0, float aV1, float aV2, float angle);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF rotateRadN(float aV0, float aV1, float aV2, float angle);
	
	IMat4WF rotateDeg(float aV0, float aV1, float aV2, float angle);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF rotateDegN(float aV0, float aV1, float aV2, float angle);
}
