package org.barghos.api.math.matrix;

public interface IMat4WF extends IMat4RF
{
	IMat4WF at(int col, int row, float value);
	
	IMat4WF set(IMat4RF m);
	
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
}
