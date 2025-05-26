package org.barghos.math.matrix;

import org.barghos.util.tuple.floats.ITup2RF;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup4RF;

public interface IMat4WF extends IMat4RF, ISqrMatWF
{
	/** {@inheritDoc} */
	@Override
	IMat4WF createNew();
	
	/** {@inheritDoc} */
	@Override
	IMat4WF createNew(IMat4RF m);
	
	/** {@inheritDoc} */
	@Override
	IMat4WF createNew(float[] m);
	
	IMat4WF createNew(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33);
	
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
	IMat4WF initZero();
	
	/** {@inheritDoc} */
	@Override
	IMat4WF initIdentity();
	
	IMat4WF initTranslation3(ITup3RF v);
	
	IMat4WF initTranslation3(float[] v);
	
	IMat4WF initTranslation3(float v0, float v1, float v2);
	
	IMat4WF initScale3(ITup3RF v);
	
	IMat4WF initScale3(float[] v);
	
	IMat4WF initScale3(float v0, float v1, float v2);
	
	IMat4WF initScale4(ITup4RF v);
	
	IMat4WF initScale4(float[] v);
	
	IMat4WF initScale4(float v0, float v1, float v2, float v3);
}
