package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.function.floats.IFunc16F;
import org.barghos.util.function.floats.IFunc2F;
import org.barghos.util.function.floats.IFunc3F;
import org.barghos.util.function.floats.IFunc4F;
import org.barghos.util.math.MathUtils;
import org.barghos.util.tuple.floats.ITup2RF;
import org.barghos.util.tuple.floats.ITup2WF;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITup4RF;
import org.barghos.util.tuple.floats.ITup4WF;

// Row-Major
// 00 01 02 03
// 10 11 12 13
// 20 21 22 23
// 30 31 32 33

// Column-Major
// 00 10 20 30
// 01 11 21 31
// 02 12 22 32
// 03 13 23 33

//Column-Major Indices
// 00 04 08 12
// 01 05 09 13
// 02 06 10 14
// 03 07 11 15

public class MatUtils4F
{
	public static float[] set(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33, @ExtractionParam float[] res)
	{
		res[0] = m00;
		res[1] = m01;
		res[2] = m02;
		res[3] = m03;

		res[4] = m10;
		res[5] = m11;
		res[6] = m12;
		res[7] = m13;
		
		res[8] = m20;
		res[9] = m21;
		res[10] = m22;
		res[11] = m23;
		
		res[12] = m30;
		res[13] = m31;
		res[14] = m32;
		res[15] = m33;
		
		return res;
	}
	
	public static float[] setCol0(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[0] = v0;
		res[1] = v1;
		res[2] = v2;
		res[3] = v3;
		
		return res;
	}
	
	public static float[] setCol1(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[4] = v0;
		res[5] = v1;
		res[6] = v2;
		res[7] = v3;
		
		return res;
	}
	
	public static float[] setCol2(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[8] = v0;
		res[9] = v1;
		res[10] = v2;
		res[11] = v3;
		
		return res;
	}
	
	public static float[] setCol3(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[12] = v0;
		res[13] = v1;
		res[14] = v2;
		res[15] = v3;
		
		return res;
	}
	
	public static float[] setRow0(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[0] = v0;
		res[4] = v1;
		res[8] = v2;
		res[12] = v3;
		
		return res;
	}
	
	public static float[] setRow1(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[1] = v0;
		res[5] = v1;
		res[9] = v2;
		res[13] = v3;
		
		return res;
	}
	
	public static float[] setRow2(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[2] = v0;
		res[6] = v1;
		res[10] = v2;
		res[14] = v3;
		
		return res;
	}
	
	public static float[] setRow3(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[3] = v0;
		res[7] = v1;
		res[11] = v2;
		res[15] = v3;
		
		return res;
	}
	
	public static float[] setCol(int col, float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		int b = col * 4;
		
		res[b] = v0;
		res[b + 1] = v1;
		res[b + 2] = v2;
		res[b + 3] = v3;
		
		return res;
	}
	
	public static float[] setRow(int row, float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[row] = v0;
		res[4 + row] = v1;
		res[8 + row] = v2;
		res[12 + row] = v3;
		
		return res;
	}
	
	public static float[] setCell(int col, int row, float v, @ExtractionParam float[] res)
	{
		res[col * 4 + row] = v;
		
		return res;
	}
	
	public static float det(IMat4RF m)
	{
		float m00 = m.m00();
		float m01 = m.m01();
		float m02 = m.m02();
		float m03 = m.m03();

		float m10 = m.m10();
		float m11 = m.m11();
		float m12 = m.m12();
		float m13 = m.m13();
		
		float m20 = m.m20();
		float m21 = m.m21();
		float m22 = m.m22();
		float m23 = m.m23();
		
		float m30 = m.m30();
		float m31 = m.m31();
		float m32 = m.m32();
		float m33 = m.m33();
		
		float dm00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33);
		float dm01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33);
		float dm02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33);
		float dm03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32);
		
		return MathUtils.fma(m00, dm00, MathUtils.fma(m01, dm01, MathUtils.fma(m02, dm02, m03 * dm03)));
	}
	
	public static float det(float[] m)
	{
		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		float m03 = m[3];

		float m10 = m[4];
		float m11 = m[5];
		float m12 = m[6];
		float m13 = m[7];
		
		float m20 = m[8];
		float m21 = m[9];
		float m22 = m[10];
		float m23 = m[11];
		
		float m30 = m[12];
		float m31 = m[13];
		float m32 = m[14];
		float m33 = m[15];
		
		float dm00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33);
		float dm01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33);
		float dm02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33);
		float dm03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32);
		
		return MathUtils.fma(m00, dm00, MathUtils.fma(m01, dm01, MathUtils.fma(m02, dm02, m03 * dm03)));
	}
	
	public static float det(float m00, float m01, float m02, float m03,float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)
	{
		float dm00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33);
		float dm01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33);
		float dm02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33);
		float dm03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32);
		
		return MathUtils.fma(m00, dm00, MathUtils.fma(m01, dm01, MathUtils.fma(m02, dm02, m03 * dm03)));
	}
	
	public static float[] invert(IMat4RF m, @ExtractionParam float[] res)
	{
		float det = det(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float m00 = m.m00();
		float m01 = m.m01();
		float m02 = m.m02();
		float m03 = m.m03();

		float m10 = m.m10();
		float m11 = m.m11();
		float m12 = m.m12();
		float m13 = m.m13();
		
		float m20 = m.m20();
		float m21 = m.m21();
		float m22 = m.m22();
		float m23 = m.m23();
		
		float m30 = m.m30();
		float m31 = m.m31();
		float m32 = m.m32();
		float m33 = m.m33();

		float r00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33) * invDet;
		float r01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33) * invDet;
		float r02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33) * invDet;
		float r03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r10 = -MatUtils3F.det(m01, m02, m03, m21, m22, m23, m31, m32, m33) * invDet;
		float r11 =  MatUtils3F.det(m00, m02, m03, m20, m22, m23, m30, m32, m33) * invDet;
		float r12 = -MatUtils3F.det(m00, m01, m03, m20, m21, m23, m30, m31, m33) * invDet;
		float r13 =  MatUtils3F.det(m00, m01, m02, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r20 =  MatUtils3F.det(m01, m02, m03, m11, m12, m13, m31, m32, m33) * invDet;
		float r21 = -MatUtils3F.det(m00, m02, m03, m10, m12, m13, m30, m32, m33) * invDet;
		float r22 =  MatUtils3F.det(m00, m01, m03, m10, m11, m13, m30, m31, m33) * invDet;
		float r23 = -MatUtils3F.det(m00, m01, m02, m10, m11, m12, m30, m31, m32) * invDet;
		
		float r30 = -MatUtils3F.det(m01, m02, m03, m11, m12, m13, m21, m22, m23) * invDet;
		float r31 =  MatUtils3F.det(m00, m02, m03, m10, m12, m13, m20, m22, m23) * invDet;
		float r32 = -MatUtils3F.det(m00, m01, m03, m10, m11, m13, m20, m21, m23) * invDet;
		float r33 =  MatUtils3F.det(m00, m01, m02, m10, m11, m12, m20, m21, m22) * invDet;

		res[0] = r00;
		res[1] = r10;
		res[2] = r20;
		res[3] = r30;
		
		res[4] = r01;
		res[5] = r11;
		res[6] = r21;
		res[7] = r31;
		
		res[8] = r02;
		res[9] = r12;
		res[10] = r22;
		res[11] = r32;
		
		res[12] = r03;
		res[13] = r13;
		res[14] = r23;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] invert(float[] m, @ExtractionParam float[] res)
	{
		float det = det(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		float m03 = m[3];

		float m10 = m[4];
		float m11 = m[5];
		float m12 = m[6];
		float m13 = m[7];
		
		float m20 = m[8];
		float m21 = m[9];
		float m22 = m[10];
		float m23 = m[11];
		
		float m30 = m[12];
		float m31 = m[13];
		float m32 = m[14];
		float m33 = m[15];

		float r00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33) * invDet;
		float r01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33) * invDet;
		float r02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33) * invDet;
		float r03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r10 = -MatUtils3F.det(m01, m02, m03, m21, m22, m23, m31, m32, m33) * invDet;
		float r11 =  MatUtils3F.det(m00, m02, m03, m20, m22, m23, m30, m32, m33) * invDet;
		float r12 = -MatUtils3F.det(m00, m01, m03, m20, m21, m23, m30, m31, m33) * invDet;
		float r13 =  MatUtils3F.det(m00, m01, m02, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r20 =  MatUtils3F.det(m01, m02, m03, m11, m12, m13, m31, m32, m33) * invDet;
		float r21 = -MatUtils3F.det(m00, m02, m03, m10, m12, m13, m30, m32, m33) * invDet;
		float r22 =  MatUtils3F.det(m00, m01, m03, m10, m11, m13, m30, m31, m33) * invDet;
		float r23 = -MatUtils3F.det(m00, m01, m02, m10, m11, m12, m30, m31, m32) * invDet;
		
		float r30 = -MatUtils3F.det(m01, m02, m03, m11, m12, m13, m21, m22, m23) * invDet;
		float r31 =  MatUtils3F.det(m00, m02, m03, m10, m12, m13, m20, m22, m23) * invDet;
		float r32 = -MatUtils3F.det(m00, m01, m03, m10, m11, m13, m20, m21, m23) * invDet;
		float r33 =  MatUtils3F.det(m00, m01, m02, m10, m11, m12, m20, m21, m22) * invDet;

		res[0] = r00;
		res[1] = r10;
		res[2] = r20;
		res[3] = r30;
		
		res[4] = r01;
		res[5] = r11;
		res[6] = r21;
		res[7] = r31;
		
		res[8] = r02;
		res[9] = r12;
		res[10] = r22;
		res[11] = r32;
		
		res[12] = r03;
		res[13] = r13;
		res[14] = r23;
		res[15] = r33;

		return res;
	}
	
	public static <T extends IMat4WF> T invert(IMat4RF m, @ExtractionParam T res)
	{
		float det = det(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float m00 = m.m00();
		float m01 = m.m01();
		float m02 = m.m02();
		float m03 = m.m03();

		float m10 = m.m10();
		float m11 = m.m11();
		float m12 = m.m12();
		float m13 = m.m13();
		
		float m20 = m.m20();
		float m21 = m.m21();
		float m22 = m.m22();
		float m23 = m.m23();
		
		float m30 = m.m30();
		float m31 = m.m31();
		float m32 = m.m32();
		float m33 = m.m33();

		float r00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33) * invDet;
		float r01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33) * invDet;
		float r02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33) * invDet;
		float r03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r10 = -MatUtils3F.det(m01, m02, m03, m21, m22, m23, m31, m32, m33) * invDet;
		float r11 =  MatUtils3F.det(m00, m02, m03, m20, m22, m23, m30, m32, m33) * invDet;
		float r12 = -MatUtils3F.det(m00, m01, m03, m20, m21, m23, m30, m31, m33) * invDet;
		float r13 =  MatUtils3F.det(m00, m01, m02, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r20 =  MatUtils3F.det(m01, m02, m03, m11, m12, m13, m31, m32, m33) * invDet;
		float r21 = -MatUtils3F.det(m00, m02, m03, m10, m12, m13, m30, m32, m33) * invDet;
		float r22 =  MatUtils3F.det(m00, m01, m03, m10, m11, m13, m30, m31, m33) * invDet;
		float r23 = -MatUtils3F.det(m00, m01, m02, m10, m11, m12, m30, m31, m32) * invDet;
		
		float r30 = -MatUtils3F.det(m01, m02, m03, m11, m12, m13, m21, m22, m23) * invDet;
		float r31 =  MatUtils3F.det(m00, m02, m03, m10, m12, m13, m20, m22, m23) * invDet;
		float r32 = -MatUtils3F.det(m00, m01, m03, m10, m11, m13, m20, m21, m23) * invDet;
		float r33 =  MatUtils3F.det(m00, m01, m02, m10, m11, m12, m20, m21, m22) * invDet;

		res.setCol0(r00, r10, r20, r30);
		res.setCol1(r01, r11, r21, r31);
		res.setCol2(r02, r12, r22, r32);
		res.setCol3(r03, r13, r23, r33);

		return res;
	}
	
	public static <T extends IMat4WF> T invert(float[] m, @ExtractionParam T res)
	{
		float det = det(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		float m03 = m[3];

		float m10 = m[4];
		float m11 = m[5];
		float m12 = m[6];
		float m13 = m[7];
		
		float m20 = m[8];
		float m21 = m[9];
		float m22 = m[10];
		float m23 = m[11];
		
		float m30 = m[12];
		float m31 = m[13];
		float m32 = m[14];
		float m33 = m[15];

		float r00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33) * invDet;
		float r01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33) * invDet;
		float r02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33) * invDet;
		float r03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r10 = -MatUtils3F.det(m01, m02, m03, m21, m22, m23, m31, m32, m33) * invDet;
		float r11 =  MatUtils3F.det(m00, m02, m03, m20, m22, m23, m30, m32, m33) * invDet;
		float r12 = -MatUtils3F.det(m00, m01, m03, m20, m21, m23, m30, m31, m33) * invDet;
		float r13 =  MatUtils3F.det(m00, m01, m02, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r20 =  MatUtils3F.det(m01, m02, m03, m11, m12, m13, m31, m32, m33) * invDet;
		float r21 = -MatUtils3F.det(m00, m02, m03, m10, m12, m13, m30, m32, m33) * invDet;
		float r22 =  MatUtils3F.det(m00, m01, m03, m10, m11, m13, m30, m31, m33) * invDet;
		float r23 = -MatUtils3F.det(m00, m01, m02, m10, m11, m12, m30, m31, m32) * invDet;
		
		float r30 = -MatUtils3F.det(m01, m02, m03, m11, m12, m13, m21, m22, m23) * invDet;
		float r31 =  MatUtils3F.det(m00, m02, m03, m10, m12, m13, m20, m22, m23) * invDet;
		float r32 = -MatUtils3F.det(m00, m01, m03, m10, m11, m13, m20, m21, m23) * invDet;
		float r33 =  MatUtils3F.det(m00, m01, m02, m10, m11, m12, m20, m21, m22) * invDet;

		res.setCol0(r00, r10, r20, r30);
		res.setCol1(r01, r11, r21, r31);
		res.setCol2(r02, r12, r22, r32);
		res.setCol3(r03, r13, r23, r33);

		return res;
	}
	
	public static <T> T invertFunc(IMat4RF m, IFunc16F<T> func)
	{
		float det = det(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float m00 = m.m00();
		float m01 = m.m01();
		float m02 = m.m02();
		float m03 = m.m03();

		float m10 = m.m10();
		float m11 = m.m11();
		float m12 = m.m12();
		float m13 = m.m13();
		
		float m20 = m.m20();
		float m21 = m.m21();
		float m22 = m.m22();
		float m23 = m.m23();
		
		float m30 = m.m30();
		float m31 = m.m31();
		float m32 = m.m32();
		float m33 = m.m33();

		float r00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33) * invDet;
		float r01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33) * invDet;
		float r02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33) * invDet;
		float r03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r10 = -MatUtils3F.det(m01, m02, m03, m21, m22, m23, m31, m32, m33) * invDet;
		float r11 =  MatUtils3F.det(m00, m02, m03, m20, m22, m23, m30, m32, m33) * invDet;
		float r12 = -MatUtils3F.det(m00, m01, m03, m20, m21, m23, m30, m31, m33) * invDet;
		float r13 =  MatUtils3F.det(m00, m01, m02, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r20 =  MatUtils3F.det(m01, m02, m03, m11, m12, m13, m31, m32, m33) * invDet;
		float r21 = -MatUtils3F.det(m00, m02, m03, m10, m12, m13, m30, m32, m33) * invDet;
		float r22 =  MatUtils3F.det(m00, m01, m03, m10, m11, m13, m30, m31, m33) * invDet;
		float r23 = -MatUtils3F.det(m00, m01, m02, m10, m11, m12, m30, m31, m32) * invDet;
		
		float r30 = -MatUtils3F.det(m01, m02, m03, m11, m12, m13, m21, m22, m23) * invDet;
		float r31 =  MatUtils3F.det(m00, m02, m03, m10, m12, m13, m20, m22, m23) * invDet;
		float r32 = -MatUtils3F.det(m00, m01, m03, m10, m11, m13, m20, m21, m23) * invDet;
		float r33 =  MatUtils3F.det(m00, m01, m02, m10, m11, m12, m20, m21, m22) * invDet;

		return func.apply(r00, r10, r20, r30, r01, r11, r21, r31, r02, r12, r22, r32, r03, r13, r23, r33);
	}
	
	public static <T> T invertFunc(float[] m, IFunc16F<T> func)
	{
		float det = det(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		float m03 = m[3];

		float m10 = m[4];
		float m11 = m[5];
		float m12 = m[6];
		float m13 = m[7];
		
		float m20 = m[8];
		float m21 = m[9];
		float m22 = m[10];
		float m23 = m[11];
		
		float m30 = m[12];
		float m31 = m[13];
		float m32 = m[14];
		float m33 = m[15];

		float r00 =  MatUtils3F.det(m11, m12, m13, m21, m22, m23, m31, m32, m33) * invDet;
		float r01 = -MatUtils3F.det(m10, m12, m13, m20, m22, m23, m30, m32, m33) * invDet;
		float r02 =  MatUtils3F.det(m10, m11, m13, m20, m21, m23, m30, m31, m33) * invDet;
		float r03 = -MatUtils3F.det(m10, m11, m12, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r10 = -MatUtils3F.det(m01, m02, m03, m21, m22, m23, m31, m32, m33) * invDet;
		float r11 =  MatUtils3F.det(m00, m02, m03, m20, m22, m23, m30, m32, m33) * invDet;
		float r12 = -MatUtils3F.det(m00, m01, m03, m20, m21, m23, m30, m31, m33) * invDet;
		float r13 =  MatUtils3F.det(m00, m01, m02, m20, m21, m22, m30, m31, m32) * invDet;
		
		float r20 =  MatUtils3F.det(m01, m02, m03, m11, m12, m13, m31, m32, m33) * invDet;
		float r21 = -MatUtils3F.det(m00, m02, m03, m10, m12, m13, m30, m32, m33) * invDet;
		float r22 =  MatUtils3F.det(m00, m01, m03, m10, m11, m13, m30, m31, m33) * invDet;
		float r23 = -MatUtils3F.det(m00, m01, m02, m10, m11, m12, m30, m31, m32) * invDet;
		
		float r30 = -MatUtils3F.det(m01, m02, m03, m11, m12, m13, m21, m22, m23) * invDet;
		float r31 =  MatUtils3F.det(m00, m02, m03, m10, m12, m13, m20, m22, m23) * invDet;
		float r32 = -MatUtils3F.det(m00, m01, m03, m10, m11, m13, m20, m21, m23) * invDet;
		float r33 =  MatUtils3F.det(m00, m01, m02, m10, m11, m12, m20, m21, m22) * invDet;

		return func.apply(r00, r10, r20, r30, r01, r11, r21, r31, r02, r12, r22, r32, r03, r13, r23, r33);
	}
	
	public static float[] transpose(IMat4RF m, @ExtractionParam float[] res)
	{
		float m00 = m.m00();
		float m01 = m.m01();
		float m02 = m.m02();
		float m03 = m.m03();
		
		float m10 = m.m10();
		float m11 = m.m11();
		float m12 = m.m12();
		float m13 = m.m13();
		
		float m20 = m.m20();
		float m21 = m.m21();
		float m22 = m.m22();
		float m23 = m.m23();
		
		float m30 = m.m30();
		float m31 = m.m31();
		float m32 = m.m32();
		float m33 = m.m33();
		
		res[0] = m00;
		res[1] = m10;
		res[2] = m20;
		res[3] = m30;
		
		res[4] = m01;
		res[5] = m11;
		res[6] = m21;
		res[7] = m31;
		
		res[8] = m02;
		res[9] = m12;
		res[10] = m22;
		res[11] = m32;
		
		res[12] = m03;
		res[13] = m13;
		res[14] = m23;
		res[15] = m33;
		
		return res;
	}
	
	public static float[] transpose(float[] m, @ExtractionParam float[] res)
	{
		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		float m03 = m[3];
		
		float m10 = m[4];
		float m11 = m[5];
		float m12 = m[6];
		float m13 = m[7];
		
		float m20 = m[8];
		float m21 = m[9];
		float m22 = m[10];
		float m23 = m[11];
		
		float m30 = m[12];
		float m31 = m[13];
		float m32 = m[14];
		float m33 = m[15];
		
		res[0] = m00;
		res[1] = m10;
		res[2] = m20;
		res[3] = m30;
		
		res[4] = m01;
		res[5] = m11;
		res[6] = m21;
		res[7] = m31;
		
		res[8] = m02;
		res[9] = m12;
		res[10] = m22;
		res[11] = m32;
		
		res[12] = m03;
		res[13] = m13;
		res[14] = m23;
		res[15] = m33;
		
		return res;
	}
	
	public static <T extends IMat4WF> T transpose(IMat4RF m, @ExtractionParam T res)
	{
		float m00 = m.m00();
		float m01 = m.m01();
		float m02 = m.m02();
		float m03 = m.m03();
		
		float m10 = m.m10();
		float m11 = m.m11();
		float m12 = m.m12();
		float m13 = m.m13();
		
		float m20 = m.m20();
		float m21 = m.m21();
		float m22 = m.m22();
		float m23 = m.m23();
		
		float m30 = m.m30();
		float m31 = m.m31();
		float m32 = m.m32();
		float m33 = m.m33();
		
		res.setCol0(m00, m10, m20, m30);
		res.setCol1(m01, m11, m21, m31);
		res.setCol2(m02, m12, m22, m32);
		res.setCol3(m03, m13, m23, m33);
		
		return res;
	}
	
	public static <T extends IMat4WF> T transpose(float[] m, @ExtractionParam T res)
	{
		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		float m03 = m[3];
		
		float m10 = m[4];
		float m11 = m[5];
		float m12 = m[6];
		float m13 = m[7];
		
		float m20 = m[8];
		float m21 = m[9];
		float m22 = m[10];
		float m23 = m[11];
		
		float m30 = m[12];
		float m31 = m[13];
		float m32 = m[14];
		float m33 = m[15];
		
		res.setCol0(m00, m10, m20, m30);
		res.setCol1(m01, m11, m21, m31);
		res.setCol2(m02, m12, m22, m32);
		res.setCol3(m03, m13, m23, m33);
		
		return res;
	}
	
	public static <T> T transposeFunc(IMat4RF m, IFunc16F<T> func)
	{
		float m00 = m.m00();
		float m01 = m.m01();
		float m02 = m.m02();
		float m03 = m.m03();
		
		float m10 = m.m10();
		float m11 = m.m11();
		float m12 = m.m12();
		float m13 = m.m13();
		
		float m20 = m.m20();
		float m21 = m.m21();
		float m22 = m.m22();
		float m23 = m.m23();
		
		float m30 = m.m30();
		float m31 = m.m31();
		float m32 = m.m32();
		float m33 = m.m33();

		return func.apply(m00, m10, m20, m30, m01, m11, m21, m31, m02, m12, m22, m32, m03, m13, m23, m33);
	}
	
	public static <T> T transposeFunc(float[] m, IFunc16F<T> func)
	{
		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		float m03 = m[3];
		
		float m10 = m[4];
		float m11 = m[5];
		float m12 = m[6];
		float m13 = m[7];
		
		float m20 = m[8];
		float m21 = m[9];
		float m22 = m[10];
		float m23 = m[11];
		
		float m30 = m[12];
		float m31 = m[13];
		float m32 = m[14];
		float m33 = m[15];
		
		return func.apply(m00, m10, m20, m30, m01, m11, m21, m31, m02, m12, m22, m32, m03, m13, m23, m33);
	}
	
	public static float trace(IMat4RF m)
	{
		return m.m00() + m.m11() + m.m22() + m.m33();
	}
	
	public static float trace(float[] m)
	{
		return m[0] + m[5] + m[10] + m[15];
	}
	
	public static float[] mul(IMat4RF a, IMat4RF b, @ExtractionParam float[] res)
	{
		float a00 = a.m00();
		float a01 = a.m01();
		float a02 = a.m02();
		float a03 = a.m03();
		
		float a10 = a.m10();
		float a11 = a.m11();
		float a12 = a.m12();
		float a13 = a.m13();

		float a20 = a.m20();
		float a21 = a.m21();
		float a22 = a.m22();
		float a23 = a.m23();
		
		float a30 = a.m30();
		float a31 = a.m31();
		float a32 = a.m32();
		float a33 = a.m33();
		
		float b00 = b.m00();
		float b01 = b.m01();
		float b02 = b.m02();
		float b03 = b.m03();
		
		float b10 = b.m10();
		float b11 = b.m11();
		float b12 = b.m12();
		float b13 = b.m13();

		float b20 = b.m20();
		float b21 = b.m21();
		float b22 = b.m22();
		float b23 = b.m23();
		
		float b30 = b.m30();
		float b31 = b.m31();
		float b32 = b.m32();
		float b33 = b.m33();
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		setCol0(r00, r01, r02, r03, res);
		setCol1(r10, r11, r12, r13, res);
		setCol2(r20, r21, r22, r23, res);
		setCol3(r30, r31, r32, r33, res);
		
		return res;
	}
	
	public static float[] mul(IMat4RF a, float[] b, @ExtractionParam float[] res)
	{
		float a00 = a.m00();
		float a01 = a.m01();
		float a02 = a.m02();
		float a03 = a.m03();
		
		float a10 = a.m10();
		float a11 = a.m11();
		float a12 = a.m12();
		float a13 = a.m13();

		float a20 = a.m20();
		float a21 = a.m21();
		float a22 = a.m22();
		float a23 = a.m23();
		
		float a30 = a.m30();
		float a31 = a.m31();
		float a32 = a.m32();
		float a33 = a.m33();
		
		float b00 = b[0];
		float b01 = b[1];
		float b02 = b[2];
		float b03 = b[3];
		
		float b10 = b[4];
		float b11 = b[5];
		float b12 = b[6];
		float b13 = b[7];

		float b20 = b[8];
		float b21 = b[9];
		float b22 = b[10];
		float b23 = b[11];
		
		float b30 = b[12];
		float b31 = b[13];
		float b32 = b[14];
		float b33 = b[15];
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		setCol0(r00, r01, r02, r03, res);
		setCol1(r10, r11, r12, r13, res);
		setCol2(r20, r21, r22, r23, res);
		setCol3(r30, r31, r32, r33, res);
		
		return res;
	}
	
	public static float[] mul(float[] a, IMat4RF b, @ExtractionParam float[] res)
	{
		float a00 = a[0];
		float a01 = a[1];
		float a02 = a[2];
		float a03 = a[3];
		
		float a10 = a[4];
		float a11 = a[5];
		float a12 = a[6];
		float a13 = a[7];

		float a20 = a[8];
		float a21 = a[9];
		float a22 = a[10];
		float a23 = a[11];
		
		float a30 = a[12];
		float a31 = a[13];
		float a32 = a[14];
		float a33 = a[15];
		
		float b00 = b.m00();
		float b01 = b.m01();
		float b02 = b.m02();
		float b03 = b.m03();
		
		float b10 = b.m10();
		float b11 = b.m11();
		float b12 = b.m12();
		float b13 = b.m13();

		float b20 = b.m20();
		float b21 = b.m21();
		float b22 = b.m22();
		float b23 = b.m23();
		
		float b30 = b.m30();
		float b31 = b.m31();
		float b32 = b.m32();
		float b33 = b.m33();
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		setCol0(r00, r01, r02, r03, res);
		setCol1(r10, r11, r12, r13, res);
		setCol2(r20, r21, r22, r23, res);
		setCol3(r30, r31, r32, r33, res);
		
		return res;
	}
	
	public static float[] mul(float[] a, float[] b, @ExtractionParam float[] res)
	{
		float a00 = a[0];
		float a01 = a[1];
		float a02 = a[2];
		float a03 = a[3];
		
		float a10 = a[4];
		float a11 = a[5];
		float a12 = a[6];
		float a13 = a[7];

		float a20 = a[8];
		float a21 = a[9];
		float a22 = a[10];
		float a23 = a[11];
		
		float a30 = a[12];
		float a31 = a[13];
		float a32 = a[14];
		float a33 = a[15];
		
		float b00 = b[0];
		float b01 = b[1];
		float b02 = b[2];
		float b03 = b[3];
		
		float b10 = b[4];
		float b11 = b[5];
		float b12 = b[6];
		float b13 = b[7];

		float b20 = b[8];
		float b21 = b[9];
		float b22 = b[10];
		float b23 = b[11];
		
		float b30 = b[12];
		float b31 = b[13];
		float b32 = b[14];
		float b33 = b[15];
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		setCol0(r00, r01, r02, r03, res);
		setCol1(r10, r11, r12, r13, res);
		setCol2(r20, r21, r22, r23, res);
		setCol3(r30, r31, r32, r33, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(IMat4RF a, IMat4RF b, @ExtractionParam T res)
	{
		float a00 = a.m00();
		float a01 = a.m01();
		float a02 = a.m02();
		float a03 = a.m03();
		
		float a10 = a.m10();
		float a11 = a.m11();
		float a12 = a.m12();
		float a13 = a.m13();

		float a20 = a.m20();
		float a21 = a.m21();
		float a22 = a.m22();
		float a23 = a.m23();
		
		float a30 = a.m30();
		float a31 = a.m31();
		float a32 = a.m32();
		float a33 = a.m33();
		
		float b00 = b.m00();
		float b01 = b.m01();
		float b02 = b.m02();
		float b03 = b.m03();
		
		float b10 = b.m10();
		float b11 = b.m11();
		float b12 = b.m12();
		float b13 = b.m13();

		float b20 = b.m20();
		float b21 = b.m21();
		float b22 = b.m22();
		float b23 = b.m23();
		
		float b30 = b.m30();
		float b31 = b.m31();
		float b32 = b.m32();
		float b33 = b.m33();
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		res.setCol0(r00, r01, r02, r03);
		res.setCol1(r10, r11, r12, r13);
		res.setCol2(r20, r21, r22, r23);
		res.setCol3(r30, r31, r32, r33);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(IMat4RF a, float[] b, @ExtractionParam T res)
	{
		float a00 = a.m00();
		float a01 = a.m01();
		float a02 = a.m02();
		float a03 = a.m03();
		
		float a10 = a.m10();
		float a11 = a.m11();
		float a12 = a.m12();
		float a13 = a.m13();

		float a20 = a.m20();
		float a21 = a.m21();
		float a22 = a.m22();
		float a23 = a.m23();
		
		float a30 = a.m30();
		float a31 = a.m31();
		float a32 = a.m32();
		float a33 = a.m33();
		
		float b00 = b[0];
		float b01 = b[1];
		float b02 = b[2];
		float b03 = b[3];
		
		float b10 = b[4];
		float b11 = b[5];
		float b12 = b[6];
		float b13 = b[7];

		float b20 = b[8];
		float b21 = b[9];
		float b22 = b[10];
		float b23 = b[11];
		
		float b30 = b[12];
		float b31 = b[13];
		float b32 = b[14];
		float b33 = b[15];
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		res.setCol0(r00, r01, r02, r03);
		res.setCol1(r10, r11, r12, r13);
		res.setCol2(r20, r21, r22, r23);
		res.setCol3(r30, r31, r32, r33);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float[] a, IMat4RF b, @ExtractionParam T res)
	{
		float a00 = a[0];
		float a01 = a[1];
		float a02 = a[2];
		float a03 = a[3];
		
		float a10 = a[4];
		float a11 = a[5];
		float a12 = a[6];
		float a13 = a[7];

		float a20 = a[8];
		float a21 = a[9];
		float a22 = a[10];
		float a23 = a[11];
		
		float a30 = a[12];
		float a31 = a[13];
		float a32 = a[14];
		float a33 = a[15];
		
		float b00 = b.m00();
		float b01 = b.m01();
		float b02 = b.m02();
		float b03 = b.m03();
		
		float b10 = b.m10();
		float b11 = b.m11();
		float b12 = b.m12();
		float b13 = b.m13();

		float b20 = b.m20();
		float b21 = b.m21();
		float b22 = b.m22();
		float b23 = b.m23();
		
		float b30 = b.m30();
		float b31 = b.m31();
		float b32 = b.m32();
		float b33 = b.m33();
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		res.setCol0(r00, r01, r02, r03);
		res.setCol1(r10, r11, r12, r13);
		res.setCol2(r20, r21, r22, r23);
		res.setCol3(r30, r31, r32, r33);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float[] a, float[] b, @ExtractionParam T res)
	{
		float a00 = a[0];
		float a01 = a[1];
		float a02 = a[2];
		float a03 = a[3];
		
		float a10 = a[4];
		float a11 = a[5];
		float a12 = a[6];
		float a13 = a[7];

		float a20 = a[8];
		float a21 = a[9];
		float a22 = a[10];
		float a23 = a[11];
		
		float a30 = a[12];
		float a31 = a[13];
		float a32 = a[14];
		float a33 = a[15];
		
		float b00 = b[0];
		float b01 = b[1];
		float b02 = b[2];
		float b03 = b[3];
		
		float b10 = b[4];
		float b11 = b[5];
		float b12 = b[6];
		float b13 = b[7];

		float b20 = b[8];
		float b21 = b[9];
		float b22 = b[10];
		float b23 = b[11];
		
		float b30 = b[12];
		float b31 = b[13];
		float b32 = b[14];
		float b33 = b[15];
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		res.setCol0(r00, r01, r02, r03);
		res.setCol1(r10, r11, r12, r13);
		res.setCol2(r20, r21, r22, r23);
		res.setCol3(r30, r31, r32, r33);
		
		return res;
	}
	
	public static <T> T mulFunc(IMat4RF a, IMat4RF b, IFunc16F<T> func)
	{
		float a00 = a.m00();
		float a01 = a.m01();
		float a02 = a.m02();
		float a03 = a.m03();
		
		float a10 = a.m10();
		float a11 = a.m11();
		float a12 = a.m12();
		float a13 = a.m13();

		float a20 = a.m20();
		float a21 = a.m21();
		float a22 = a.m22();
		float a23 = a.m23();
		
		float a30 = a.m30();
		float a31 = a.m31();
		float a32 = a.m32();
		float a33 = a.m33();
		
		float b00 = b.m00();
		float b01 = b.m01();
		float b02 = b.m02();
		float b03 = b.m03();
		
		float b10 = b.m10();
		float b11 = b.m11();
		float b12 = b.m12();
		float b13 = b.m13();

		float b20 = b.m20();
		float b21 = b.m21();
		float b22 = b.m22();
		float b23 = b.m23();
		
		float b30 = b.m30();
		float b31 = b.m31();
		float b32 = b.m32();
		float b33 = b.m33();
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		return func.apply(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
	}
	
	public static <T> T mulFunc(IMat4RF a, float[] b, IFunc16F<T> func)
	{
		float a00 = a.m00();
		float a01 = a.m01();
		float a02 = a.m02();
		float a03 = a.m03();
		
		float a10 = a.m10();
		float a11 = a.m11();
		float a12 = a.m12();
		float a13 = a.m13();

		float a20 = a.m20();
		float a21 = a.m21();
		float a22 = a.m22();
		float a23 = a.m23();
		
		float a30 = a.m30();
		float a31 = a.m31();
		float a32 = a.m32();
		float a33 = a.m33();
		
		float b00 = b[0];
		float b01 = b[1];
		float b02 = b[2];
		float b03 = b[3];
		
		float b10 = b[4];
		float b11 = b[5];
		float b12 = b[6];
		float b13 = b[7];

		float b20 = b[8];
		float b21 = b[9];
		float b22 = b[10];
		float b23 = b[11];
		
		float b30 = b[12];
		float b31 = b[13];
		float b32 = b[14];
		float b33 = b[15];
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		return func.apply(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
	}
	
	public static <T> T mulFunc(float[] a, IMat4RF b, IFunc16F<T> func)
	{
		float a00 = a[0];
		float a01 = a[1];
		float a02 = a[2];
		float a03 = a[3];
		
		float a10 = a[4];
		float a11 = a[5];
		float a12 = a[6];
		float a13 = a[7];

		float a20 = a[8];
		float a21 = a[9];
		float a22 = a[10];
		float a23 = a[11];
		
		float a30 = a[12];
		float a31 = a[13];
		float a32 = a[14];
		float a33 = a[15];
		
		float b00 = b.m00();
		float b01 = b.m01();
		float b02 = b.m02();
		float b03 = b.m03();
		
		float b10 = b.m10();
		float b11 = b.m11();
		float b12 = b.m12();
		float b13 = b.m13();

		float b20 = b.m20();
		float b21 = b.m21();
		float b22 = b.m22();
		float b23 = b.m23();
		
		float b30 = b.m30();
		float b31 = b.m31();
		float b32 = b.m32();
		float b33 = b.m33();
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));
		
		return func.apply(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
	}
	
	public static <T> T mulFunc(float[] a, float[] b, IFunc16F<T> func)
	{
		float a00 = a[0];
		float a01 = a[1];
		float a02 = a[2];
		float a03 = a[3];
		
		float a10 = a[4];
		float a11 = a[5];
		float a12 = a[6];
		float a13 = a[7];

		float a20 = a[8];
		float a21 = a[9];
		float a22 = a[10];
		float a23 = a[11];
		
		float a30 = a[12];
		float a31 = a[13];
		float a32 = a[14];
		float a33 = a[15];
		
		float b00 = b[0];
		float b01 = b[1];
		float b02 = b[2];
		float b03 = b[3];
		
		float b10 = b[4];
		float b11 = b[5];
		float b12 = b[6];
		float b13 = b[7];

		float b20 = b[8];
		float b21 = b[9];
		float b22 = b[10];
		float b23 = b[11];
		
		float b30 = b[12];
		float b31 = b[13];
		float b32 = b[14];
		float b33 = b[15];
		
		float r00 = MathUtils.fma(a00, b00, MathUtils.fma(a01, b10, MathUtils.fma(a02, b20, a03 * b30)));
		float r01 = MathUtils.fma(a00, b01, MathUtils.fma(a01, b11, MathUtils.fma(a02, b21, a03 * b31)));
		float r02 = MathUtils.fma(a00, b02, MathUtils.fma(a01, b12, MathUtils.fma(a02, b22, a03 * b32)));
		float r03 = MathUtils.fma(a00, b03, MathUtils.fma(a02, b13, MathUtils.fma(a02, b23, a03 * b33)));
		
		float r10 = MathUtils.fma(a10, b00, MathUtils.fma(a11, b10, MathUtils.fma(a12, b20, a13 * b30)));
		float r11 = MathUtils.fma(a10, b01, MathUtils.fma(a11, b11, MathUtils.fma(a12, b21, a13 * b31)));
		float r12 = MathUtils.fma(a10, b02, MathUtils.fma(a11, b12, MathUtils.fma(a12, b22, a13 * b32)));
		float r13 = MathUtils.fma(a10, b03, MathUtils.fma(a11, b13, MathUtils.fma(a12, b23, a13 * b33)));
		
		float r20 = MathUtils.fma(a20, b00, MathUtils.fma(a21, b10, MathUtils.fma(a22, b20, a23 * b30)));
		float r21 = MathUtils.fma(a20, b01, MathUtils.fma(a21, b11, MathUtils.fma(a22, b21, a23 * b31)));
		float r22 = MathUtils.fma(a20, b02, MathUtils.fma(a21, b12, MathUtils.fma(a22, b22, a23 * b32)));
		float r23 = MathUtils.fma(a20, b03, MathUtils.fma(a21, b13, MathUtils.fma(a22, b23, a23 * b33)));
		
		float r30 = MathUtils.fma(a30, b00, MathUtils.fma(a31, b10, MathUtils.fma(a32, b20, a33 * b30)));
		float r31 = MathUtils.fma(a30, b01, MathUtils.fma(a31, b11, MathUtils.fma(a32, b21, a33 * b31)));
		float r32 = MathUtils.fma(a30, b02, MathUtils.fma(a31, b12, MathUtils.fma(a32, b22, a33 * b32)));
		float r33 = MathUtils.fma(a30, b03, MathUtils.fma(a31, b13, MathUtils.fma(a32, b23, a33 * b33)));

		return func.apply(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
	}
	
	public static float[] transform2(boolean isPoint, ITup2RF v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transform2(boolean isPoint, ITup2RF v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transform2(boolean isPoint, float[] v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transform2(boolean isPoint, float[] v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transform2(boolean isPoint, float v0, float v1, IMat4RF m, @ExtractionParam float[] res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transform2(boolean isPoint, float v0, float v1, float[] m, @ExtractionParam float[] res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static <T extends ITup2WF> T transform2(boolean isPoint, ITup2RF v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transform2(boolean isPoint, ITup2RF v, float[] m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		res.set(r0, r1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T transform2(boolean isPoint, float[] v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transform2(boolean isPoint, float[] v, float[] m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		res.set(r0, r1);
		
		return res;
	}
	
	public static <T extends ITup2WF> T transform2(boolean isPoint, float v0, float v1, IMat4RF m, @ExtractionParam T res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transform2(boolean isPoint, float v0, float v1, float[] m, @ExtractionParam T res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		res.set(r0, r1);
		
		return res;
	}
	
	public static <T> T transform2Func(boolean isPoint, ITup2RF v, IMat4RF m, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transform2Func(boolean isPoint, ITup2RF v, float[] m, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		return func.apply(r0, r1);
	}
	
	public static <T> T transform2Func(boolean isPoint, float[] v, IMat4RF m, IFunc2F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transform2Func(boolean isPoint, float[] v, float[] m, IFunc2F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		return func.apply(r0, r1);
	}
	
	public static <T> T transform2Func(boolean isPoint, float v0, float v1, IMat4RF m, IFunc2F<T> func)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transform2Func(boolean isPoint, float v0, float v1, float[] m, IFunc2F<T> func)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		return func.apply(r0, r1);
	}
	
	public static float[] transformPoint2(ITup2RF v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));

		res[0] = r0;
		res[1] = r1;
		
		return res;
	}
	
	public static float[] transformPoint2(ITup2RF v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transformPoint2(float[] v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));

		res[0] = r0;
		res[1] = r1;
		
		return res;
	}
	
	public static float[] transformPoint2(float[] v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transformPoint2(float v0, float v1, IMat4RF m, @ExtractionParam float[] res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));

		res[0] = r0;
		res[1] = r1;
		
		return res;
	}
	
	public static float[] transformPoint2(float v0, float v1, float[] m, @ExtractionParam float[] res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static <T extends ITup2WF> T transformPoint2(ITup2RF v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformPoint2(ITup2RF v, float[] m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformPoint2(float[] v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformPoint2(float[] v, float[] m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformPoint2(float v0, float v1, IMat4RF m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformPoint2(float v0, float v1, float[] m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T> T transformPoint2Func(ITup2RF v, IMat4RF m, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformPoint2Func(ITup2RF v, float[] m, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformPoint2Func(float[] v, IMat4RF m, IFunc2F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformPoint2Func(float[] v, float[] m, IFunc2F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformPoint2Func(float v0, float v1, IMat4RF m, IFunc2F<T> func)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformPoint2Func(float v0, float v1, float[] m, IFunc2F<T> func)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		return func.apply(r0, r1);
	}
	
	public static float[] transformVec2(ITup2RF v, IMat4RF m, float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11()* v1);
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transformVec2(ITup2RF v, float[] m, float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transformVec2(float[] v, IMat4RF m, float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11()* v1);
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transformVec2(float[] v, float[] m, float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transformVec2(float v0, float v1, IMat4RF m, float[] res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11()* v1);
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static float[] transformVec2(float v0, float v1, float[] m, float[] res)
	{
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		res[0] = r0;
		res[1] = r1;

		return res;
	}
	
	public static <T extends ITup2WF> T transformVec2(ITup2RF v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformVec2(ITup2RF v, float[] m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformVec2(float[] v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformVec2(float[] v, float[] m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformVec2(float v0, float v1, IMat4RF m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T extends ITup2WF> T transformVec2(float v0, float v1, float[] m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		res.set(r0, r1);

		return res;
	}
	
	public static <T> T transformVec2Func(ITup2RF v, IMat4RF m, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformVec2Func(ITup2RF v, float[] m, IFunc2F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformVec2Func(float[] v, IMat4RF m, IFunc2F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformVec2Func(float[] v, float[] m, IFunc2F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformVec2Func(float v0, float v1, IMat4RF m, IFunc2F<T> func)
	{
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		return func.apply(r0, r1);
	}
	
	public static <T> T transformVec2Func(float v0, float v1, float[] m, IFunc2F<T> func)
	{
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		return func.apply(r0, r1);
	}
	
	public static float[] transform3(boolean isPoint, ITup3RF v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transform3(boolean isPoint, ITup3RF v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transform3(boolean isPoint, float[] v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transform3(boolean isPoint, float[] v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transform3(boolean isPoint, float v0, float v1, float v2, IMat4RF m, @ExtractionParam float[] res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transform3(boolean isPoint, float v0, float v1, float v2, float[] m, @ExtractionParam float[] res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static <T extends ITup3WF> T transform3(boolean isPoint, ITup3RF v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transform3(boolean isPoint, ITup3RF v, float[] m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		res.set(r0, r1, r2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T transform3(boolean isPoint, float[] v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transform3(boolean isPoint, float[] v, float[] m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		res.set(r0, r1, r2);
		
		return res;
	}
	
	public static <T extends ITup3WF> T transform3(boolean isPoint, float v0, float v1, float v2, IMat4RF m, @ExtractionParam T res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transform3(boolean isPoint, float v0, float v1, float v2, float[] m, @ExtractionParam T res)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		res.set(r0, r1, r2);
		
		return res;
	}
	
	public static <T> T transform3Func(boolean isPoint, ITup3RF v, IMat4RF m, IFunc3F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transform3Func(boolean isPoint, ITup3RF v, float[] m, IFunc3F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transform3Func(boolean isPoint, float[] v, IMat4RF m, IFunc3F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transform3Func(boolean isPoint, float[] v, float[] m, IFunc3F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transform3Func(boolean isPoint, float v0, float v1, float v2, IMat4RF m, IFunc3F<T> func)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transform3Func(boolean isPoint, float v0, float v1, float v2, float[] m, IFunc3F<T> func)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		return func.apply(r0, r1, r2);
	}
	
	public static float[] transformPoint3(ITup3RF v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));

		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] transformPoint3(ITup3RF v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transformPoint3(float[] v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));

		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] transformPoint3(float[] v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transformPoint3(float v0, float v1, float v2, IMat4RF m, @ExtractionParam float[] res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));

		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		
		return res;
	}
	
	public static float[] transformPoint3(float v0, float v1, float v2, float[] m, @ExtractionParam float[] res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static <T extends ITup3WF> T transformPoint3(ITup3RF v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformPoint3(ITup3RF v, float[] m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformPoint3(float[] v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformPoint3(float[] v, float[] m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformPoint3(float v0, float v1, float v2, IMat4RF m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformPoint3(float v0, float v1,float v2, float[] m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T> T transformPoint3Func(ITup3RF v, IMat4RF m, IFunc3F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformPoint3Func(ITup3RF v, float[] m, IFunc3F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformPoint3Func(float[] v, IMat4RF m, IFunc3F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformPoint3Func(float[] v, float[] m, IFunc3F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformPoint3Func(float v0, float v1, float v2, IMat4RF m, IFunc3F<T> func)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformPoint3Func(float v0, float v1, float v2, float[] m, IFunc3F<T> func)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		return func.apply(r0, r1, r2);
	}
	
	public static float[] transformVec3(ITup3RF v, IMat4RF m, float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transformVec3(ITup3RF v, float[] m, float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transformVec3(float[] v, IMat4RF m, float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transformVec3(float[] v, float[] m, float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transformVec3(float v0, float v1, float v2, IMat4RF m, float[] res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static float[] transformVec3(float v0, float v1, float v2, float[] m, float[] res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;

		return res;
	}
	
	public static <T extends ITup3WF> T transformVec3(ITup3RF v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformVec3(ITup3RF v, float[] m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformVec3(float[] v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformVec3(float[] v, float[] m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformVec3(float v0, float v1, float v2, IMat4RF m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T extends ITup3WF> T transformVec3(float v0, float v1, float v2, float[] m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		res.set(r0, r1, r2);

		return res;
	}
	
	public static <T> T transformVec3Func(ITup3RF v, IMat4RF m, IFunc3F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformVec3Func(ITup3RF v, float[] m, IFunc3F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformVec3Func(float[] v, IMat4RF m, IFunc3F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformVec3Func(float[] v, float[] m, IFunc3F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformVec3Func(float v0, float v1, float v2, IMat4RF m, IFunc3F<T> func)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		return func.apply(r0, r1, r2);
	}
	
	public static <T> T transformVec3Func(float v0, float v1, float v2, float[] m, IFunc3F<T> func)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		return func.apply(r0, r1, r2);
	}
	
	public static float[] transform4(ITup4RF v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));

		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		res[3] = r3;
		
		return res;
	}
	
	public static float[] transform4(ITup4RF v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		res[3] = r3;
		
		return res;
	}
	
	public static float[] transform4(float[] v, IMat4RF m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));

		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		res[3] = r3;
		
		return res;
	}
	
	public static float[] transform4(float[] v, float[] m, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		res[3] = r3;
		
		return res;
	}
	
	public static float[] transform4(float v0, float v1, float v2, float v3, IMat4RF m, @ExtractionParam float[] res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));

		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		res[3] = r3;
		
		return res;
	}
	
	public static float[] transform4(float v0, float v1, float v2, float v3, float[] m, @ExtractionParam float[] res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		res[0] = r0;
		res[1] = r1;
		res[2] = r2;
		res[3] = r3;
		
		return res;
	}
	
	public static <T extends ITup4WF> T transform4(ITup4RF v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		res.set(r0, r1, r2, r3);

		return res;
	}
	
	public static <T extends ITup4WF> T transform4(ITup4RF v, float[] m, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		res.set(r0, r1, r2, r3);

		return res;
	}
	
	public static <T extends ITup4WF> T transform4(float[] v, IMat4RF m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		res.set(r0, r1, r2, r3);

		return res;
	}
	
	public static <T extends ITup4WF> T transform4(float[] v, float[] m, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		res.set(r0, r1, r2, r3);

		return res;
	}
	
	public static <T extends ITup4WF> T transform4(float v0, float v1, float v2, float v3, IMat4RF m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		res.set(r0, r1, r2, r3);

		return res;
	}
	
	public static <T extends ITup4WF> T transform4(float v0, float v1,float v2, float v3, float[] m, @ExtractionParam T res)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		res.set(r0, r1, r2, r3);

		return res;
	}
	
	public static <T> T transform4Func(ITup4RF v, IMat4RF m, IFunc4F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		return func.apply(r0, r1, r2, r3);
	}
	
	public static <T> T transform4Func(ITup4RF v, float[] m, IFunc4F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		return func.apply(r0, r1, r2, r3);
	}
	
	public static <T> T transform4Func(float[] v, IMat4RF m, IFunc4F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		return func.apply(r0, r1, r2, r3);
	}
	
	public static <T> T transform4Func(float[] v, float[] m, IFunc4F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		return func.apply(r0, r1, r2, r3);
	}
	
	public static <T> T transform4Func(float v0, float v1, float v2, float v3, IMat4RF m, IFunc4F<T> func)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		return func.apply(r0, r1, r2, r3);
	}
	
	public static <T> T transform4Func(float v0, float v1, float v2, float v3, float[] m, IFunc4F<T> func)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		return func.apply(r0, r1, r2, r3);
	}
	
	public static float[] setZero(@ExtractionParam float[] res)
	{
		set(
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0, res);
			
		return res;
	}
	
	public static <T extends IMat4WF> T setZero(@ExtractionParam T res)
	{
		res.set(
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0);
		
		return res;
	}
	
	public static <T> T setZeroFunc(IFunc16F<T> func)
	{
		return func.apply(
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0,
			0, 0, 0, 0);
	}
	
	public static float[] setIdentity(@ExtractionParam float[] res)
	{
		set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setIdentity(@ExtractionParam T res)
	{
		res.set(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);

		return res;
	}
	
	public static <T> T setIdentityFunc(IFunc16F<T> func)
	{
		return func.apply(
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1);
	}
	
	public static float[] setTranslation2(ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setTranslation2(float[] v, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setTranslation2(float v0, float v1, @ExtractionParam float[] res)
	{
		set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setTranslation2(ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		res.set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setTranslation2(float[] v, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		res.set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setTranslation2(float v0, float v1, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T> T setTranslation2Func(ITup2RF v, IFunc16F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return func.apply(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setTranslation2Func(float[] v, IFunc16F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		return func.apply(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setTranslation2Func(float v0, float v1, IFunc16F<T> func)
	{
		return func.apply(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static float[] setTranslation3(ITup3RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setTranslation3(float[] v, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setTranslation3(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setTranslation3(ITup3RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		res.set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setTranslation3(float[] v, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		res.set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setTranslation3(float v0, float v1, float v2, @ExtractionParam T res)
	{
		res.set(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T> T setTranslation3Func(ITup3RF v, IFunc16F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		return func.apply(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setTranslation3Func(float[] v, IFunc16F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		return func.apply(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setTranslation3Func(float v0, float v1, float v2, IFunc16F<T> func)
	{
		return func.apply(
			1.0f, 0.0f, 0.0f, v0,
			0.0f, 1.0f, 0.0f, v1,
			0.0f, 0.0f, 1.0f, v2,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static float[] setScaling2(ITup2RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setScaling2(float[] v, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setScaling2(float v0, float v1, @ExtractionParam float[] res)
	{
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling2(ITup2RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling2(float[] v, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling2(float v0, float v1, @ExtractionParam T res)
	{
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T> T setScaling2Func(ITup2RF v, IFunc16F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setScaling2Func(float[] v, IFunc16F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setScaling2Func(float v0, float v1, IFunc16F<T> func)
	{
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static float[] setScaling3(ITup3RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setScaling3(float[] v, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setScaling3(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling3(ITup3RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling3(float[] v, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling3(float v0, float v1, float v2, @ExtractionParam T res)
	{
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T> T setScaling3Func(ITup3RF v, IFunc16F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setScaling3Func(float[] v, IFunc16F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setScaling3Func(float v0, float v1, float v2, IFunc16F<T> func)
	{
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static float[] setScaling4(ITup4RF v, @ExtractionParam float[] res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3, res);
		
		return res;
	}
	
	public static float[] setScaling4(float[] v, @ExtractionParam float[] res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3, res);
		
		return res;
	}
	
	public static float[] setScaling4(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3, res);
		
		return res;
	}

	public static <T extends IMat4WF> T setScaling4(ITup4RF v, @ExtractionParam T res)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling4(float[] v, @ExtractionParam T res)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setScaling4(float v0, float v1, float v2, float v3, @ExtractionParam T res)
	{
		res.set(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3);
		
		return res;
	}
	
	public static <T> T setScaling4Func(ITup4RF v, IFunc16F<T> func)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3);
	}
	
	public static <T> T setScaling4Func(float[] v, IFunc16F<T> func)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3);
	}
	
	public static <T> T setScaling4Func(float v0, float v1, float v2, float v3, IFunc16F<T> func)
	{
		return func.apply(
			v0, 0.0f, 0.0f, 0.0f,
			0.0f, v1, 0.0f, 0.0f,
			0.0f, 0.0f, v2, 0.0f,
			0.0f, 0.0f, 0.0f, v3);
	}
	
	public static float[] setBaseChanging(ITup3RF r, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, float[] u, float[] f, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, float[] u, float[] f, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, float[] u, float[] f, @ExtractionParam float[] res)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setBaseChanging(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}

	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, float[] u, float[] f, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, float[] u, float[] f, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, float[] u, float[] f, @ExtractionParam T res)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setBaseChanging(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		res.set(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, float[] u, float[] f, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float rv0 = r.v0();
		float rv1 = r.v1();
		float rv2 = r.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, float[] u, float[] f, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float rv0 = r[0];
		float rv1 = r[1];
		float rv2 = r[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float uv0 = u.v0();
		float uv1 = u.v1();
		float uv2 = u.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, float[] u, float[] f, IFunc16F<T> func)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		float uv0 = u[0];
		float uv1 = u[1];
		float uv2 = u[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		float fv0 = f.v0();
		float fv1 = f.v1();
		float fv2 = f.v2();
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		float fv0 = f[0];
		float fv1 = f[1];
		float fv2 = f[2];
		
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setBaseChangingFunc(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return func.apply(
			rv0, uv0, fv0, 0.0f,
			rv1, uv1, fv1, 0.0f,
			rv2, uv2, fv2, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static float[] setRotationRad(ITup3RF a, float angle, @ExtractionParam float[] res)
	{
		float av0 = a.v0();
		float av1 = a.v1();
		float av2 = a.v2();
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setRotationRad(float[] a, float angle, @ExtractionParam float[] res)
	{
		float av0 = a[0];
		float av1 = a[1];
		float av2 = a[2];
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setRotationRad(float av0, float av1, float av2, float angle, @ExtractionParam float[] res)
	{
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRotationRad(ITup3RF a, float angle, @ExtractionParam T res)
	{
		float av0 = a.v0();
		float av1 = a.v1();
		float av2 = a.v2();
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		res.set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRotationRad(float[] a, float angle, @ExtractionParam T res)
	{
		float av0 = a[0];
		float av1 = a[1];
		float av2 = a[2];
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		res.set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRotationRad(float av0, float av1, float av2, float angle, @ExtractionParam T res)
	{
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		res.set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T> T setRotationRadFunc(ITup3RF a, float angle, IFunc16F<T> func)
	{
		float av0 = a.v0();
		float av1 = a.v1();
		float av2 = a.v2();
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		return func.apply(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setRotationRadFunc(float[] a, float angle, IFunc16F<T> func)
	{
		float av0 = a[0];
		float av1 = a[1];
		float av2 = a[2];
		
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		return func.apply(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setRotationRadFunc(float av0, float av1, float av2, float angle, IFunc16F<T> func)
	{
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		return func.apply(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static float[] setRotationDeg(ITup3RF a, float angle, @ExtractionParam float[] res)
	{
		float av0 = a.v0();
		float av1 = a.v1();
		float av2 = a.v2();
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setRotationDeg(float[] a, float angle, @ExtractionParam float[] res)
	{
		float av0 = a[0];
		float av1 = a[1];
		float av2 = a[2];
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] setRotationDeg(float av0, float av1, float av2, float angle, @ExtractionParam float[] res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRotationDeg(ITup3RF a, float angle, @ExtractionParam T res)
	{
		float av0 = a.v0();
		float av1 = a.v1();
		float av2 = a.v2();
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		res.set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRotationDeg(float[] a, float angle, @ExtractionParam T res)
	{
		float av0 = a[0];
		float av1 = a[1];
		float av2 = a[2];
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		res.set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRotationDeg(float av0, float av1, float av2, float angle, @ExtractionParam T res)
	{
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		res.set(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
		
		return res;
	}
	
	public static <T> T setRotationDegFunc(ITup3RF a, float angle, IFunc16F<T> func)
	{
		float av0 = a.v0();
		float av1 = a.v1();
		float av2 = a.v2();
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		return func.apply(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setRotationDegFunc(float[] a, float angle, IFunc16F<T> func)
	{
		float av0 = a[0];
		float av1 = a[1];
		float av2 = a[2];
		
		float radAngle = angle * MathUtils.DEG_TO_RADf;
		
		float sinAngle = MathUtils.sin(radAngle);
		float cosAngle = MathUtils.cos(radAngle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		return func.apply(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static <T> T setRotationDegFunc(float av0, float av1, float av2, float angle, IFunc16F<T> func)
	{
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		float av0av1recCosAngle = av0 * av1 * recCosAngle;
		float av0av2recCosAngle = av0 * av2 * recCosAngle;
		float av1av2recCosAngle = av1 * av2 * recCosAngle;
		
		return func.apply(
			cosAngle + (av0 * av0) * recCosAngle, av0av1recCosAngle + av2 * sinAngle, av0av2recCosAngle - av1 * sinAngle, 0.0f,
			av0av1recCosAngle - av2 * sinAngle, cosAngle + (av1 * av1) * recCosAngle, av1av2recCosAngle + av0 * sinAngle, 0.0f,
			av0av2recCosAngle + av1 * sinAngle, av1av2recCosAngle - av0 * sinAngle, cosAngle + (av2 * av2) * recCosAngle, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public static float[] setPerspective(float fovY, float aspectRatio, float near, float far, @ExtractionParam float[] res)
	{
		float f = MathUtils.tan(0.5f * fovY);
		
		float farMinusNear = far - near;
		
		set(
			1.0f / (f * aspectRatio), 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f / f, 0.0f, 0.0f,
			0.0f, 0.0f, -((far + near) / farMinusNear), -1.0f,
			0.0f, 0.0f, -((2.0f * far * near) / farMinusNear), 0.0f, res);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setPerspective(float fovY, float aspectRatio, float near, float far, @ExtractionParam T res)
	{
		float f = MathUtils.tan(0.5f * fovY);
		
		float farMinusNear = far - near;
		
		res.set(
			1.0f / (f * aspectRatio), 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f / f, 0.0f, 0.0f,
			0.0f, 0.0f, -((far + near) / farMinusNear), -1.0f,
			0.0f, 0.0f, -((2.0f * far * near) / farMinusNear), 0.0f);
		
		return res;
	}
	
	public static <T> T setPerspective(float fovY, float aspectRatio, float near, float far, IFunc16F<T> func)
	{
		float f = MathUtils.tan(0.5f * fovY);
		
		float farMinusNear = far - near;
		
		return func.apply(
			1.0f / (f * aspectRatio), 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f / f, 0.0f, 0.0f,
			0.0f, 0.0f, -((far + near) / farMinusNear), -1.0f,
			0.0f, 0.0f, -((2.0f * far * near) / farMinusNear), 0.0f);
	}
	
	public static float[] setOrtho(float left, float right, float bottom, float top, float near, float far, @ExtractionParam float[] res)
	{
		float rightMinusLeft = right - left;
		float topMinusBottom = top - bottom;
		float farMinusNear = far - near;
		
		set(
			2.0f / rightMinusLeft, 0f, 0f, 0f,
			0f, 2.0f / topMinusBottom, 0f, 0f,
			0f, 0f, -2.0f / farMinusNear, 0f,
			-(right + left) / rightMinusLeft, -(top + bottom) / topMinusBottom, -(far + near) / farMinusNear, 1.0f, res);
		 
		return res;
	}
	
	public static <T extends IMat4WF> T setOrtho(float left, float right, float bottom, float top, float near, float far, @ExtractionParam T res)
	{
		float rightMinusLeft = right - left;
		float topMinusBottom = top - bottom;
		float farMinusNear = far - near;
		
		res.set(
			2.0f / rightMinusLeft, 0f, 0f, 0f,
			0f, 2.0f / topMinusBottom, 0f, 0f,
			0f, 0f, -2.0f / farMinusNear, 0f,
			-(right + left) / rightMinusLeft, -(top + bottom) / topMinusBottom, -(far + near) / farMinusNear, 1.0f);
		 
		return res;
	}
	
	public static <T> T setOrtho(float left, float right, float bottom, float top, float near, float far, IFunc16F<T> func)
	{
		float rightMinusLeft = right - left;
		float topMinusBottom = top - bottom;
		float farMinusNear = far - near;
		
		return func.apply(
			2.0f / rightMinusLeft, 0f, 0f, 0f,
			0f, 2.0f / topMinusBottom, 0f, 0f,
			0f, 0f, -2.0f / farMinusNear, 0f,
			-(right + left) / rightMinusLeft, -(top + bottom) / topMinusBottom, -(far + near) / farMinusNear, 1.0f);
	}
	
	public static float[] setRotationByQuat(ITup4RF q, @ExtractionParam float[] res)
	{
		float qv0 = q.v0();
		float qv1 = q.v1();
		float qv2 = q.v2();
		float qv3 = q.v3();
		
		set(
			1.0f - 2.0f * (qv1 * qv1 + qv2 * qv2), 2.0f * (qv0 * qv1 + qv2 * qv3), 2.0f * (qv0 * qv2 - qv3 * qv1), 0.0f,
			2.0f * (qv0 * qv1 - qv2 * qv3), 1.0f - 2.0f * (qv0 * qv0 + qv2 * qv2), 2.0f * (qv1 * qv2 + qv3 * qv0), 0.0f,
			2.0f * (qv0 * qv2 + qv3 * qv1), 2.0f * (qv1 * qv2 - qv3 * qv0), 1.0f - 2.0f * (qv0 * qv0 + qv1 * qv1), 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f, res);

		return res;
	}

	public static float[] translate2(IMat4RF m, ITup2RF v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static float[] translate2(IMat4RF m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static float[] translate2(IMat4RF m, float v0, float v1, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation2(v0, v1, new float[16]), res);
	}
	
	public static float[] translate2(float[] m, ITup2RF v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static float[] translate2(float[] m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static float[] translate2(float[] m, float v0, float v1, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation2(v0, v1, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate2(IMat4RF m, ITup2RF v, @ExtractionParam T res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate2(IMat4RF m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate2(IMat4RF m, float v0, float v1, @ExtractionParam T res)
	{
		return mul(m, setTranslation2(v0, v1, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate2(float[] m, ITup2RF v, @ExtractionParam T res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate2(float[] m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setTranslation2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate2(float[] m, float v0, float v1, @ExtractionParam T res)
	{
		return mul(m, setTranslation2(v0, v1, new float[16]), res);
	}
	
	public static <T> T translate2Func(IMat4RF m, ITup2RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation2(v, new float[16]), func);
	}
	
	public static <T> T translate2Func(IMat4RF m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation2(v, new float[16]), func);
	}
	
	public static <T> T translate2Func(IMat4RF m, float v0, float v1, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation2(v0, v1, new float[16]), func);
	}
	
	public static <T> T translate2Func(float[] m, ITup2RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation2(v, new float[16]), func);
	}
	
	public static <T> T translate2Func(float[] m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation2(v, new float[16]), func);
	}
	
	public static <T> T translate2Func(float[] m, float v0, float v1, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation2(v0, v1, new float[16]), func);
	}
	
	public static float[] translate3(IMat4RF m, ITup3RF v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static float[] translate3(IMat4RF m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static float[] translate3(IMat4RF m, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation3(v0, v1, v2, new float[16]), res);
	}
	
	public static float[] translate3(float[] m, ITup3RF v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static float[] translate3(float[] m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static float[] translate3(float[] m, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		return mul(m, setTranslation3(v0, v1, v2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate3(IMat4RF m, ITup3RF v, @ExtractionParam T res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate3(IMat4RF m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate3(IMat4RF m, float v0, float v1, float v2, @ExtractionParam T res)
	{
		return mul(m, setTranslation3(v0, v1, v2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate3(float[] m, ITup3RF v, @ExtractionParam T res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate3(float[] m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setTranslation3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T translate3(float[] m, float v0, float v1, float v2, @ExtractionParam T res)
	{
		return mul(m, setTranslation3(v0, v1, v2, new float[16]), res);
	}
	
	public static <T> T translate3Func(IMat4RF m, ITup3RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation3(v, new float[16]), func);
	}
	
	public static <T> T translate3Func(IMat4RF m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation3(v, new float[16]), func);
	}
	
	public static <T> T translate3Func(IMat4RF m, float v0, float v1, float v2, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation3(v0, v1, v2, new float[16]), func);
	}
	
	public static <T> T translate3Func(float[] m, ITup3RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation3(v, new float[16]), func);
	}
	
	public static <T> T translate3Func(float[] m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation3(v, new float[16]), func);
	}
	
	public static <T> T translate3Func(float[] m, float v0, float v1, float v2, IFunc16F<T> func)
	{
		return mulFunc(m, setTranslation3(v0, v1, v2, new float[16]), func);
	}
	
	public static float[] scale2(IMat4RF m, ITup2RF v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static float[] scale2(IMat4RF m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static float[] scale2(IMat4RF m, float v0, float v1, @ExtractionParam float[] res)
	{
		return mul(m, setScaling2(v0, v1, new float[16]), res);
	}
	
	public static float[] scale2(float[] m, ITup2RF v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static float[] scale2(float[] m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static float[] scale2(float[] m, float v0, float v1, @ExtractionParam float[] res)
	{
		return mul(m, setScaling2(v0, v1, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale2(IMat4RF m, ITup2RF v, @ExtractionParam T res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale2(IMat4RF m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale2(IMat4RF m, float v0, float v1, @ExtractionParam T res)
	{
		return mul(m, setScaling2(v0, v1, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale2(float[] m, ITup2RF v, @ExtractionParam T res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale2(float[] m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setScaling2(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale2(float[] m, float v0, float v1, @ExtractionParam T res)
	{
		return mul(m, setScaling2(v0, v1, new float[16]), res);
	}
	
	public static <T> T scale2Func(IMat4RF m, ITup2RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling2(v, new float[16]), func);
	}
	
	public static <T> T scale2Func(IMat4RF m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling2(v, new float[16]), func);
	}
	
	public static <T> T scale2Func(IMat4RF m, float v0, float v1, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling2(v0, v1, new float[16]), func);
	}
	
	public static <T> T scale2Func(float[] m, ITup2RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling2(v, new float[16]), func);
	}
	
	public static <T> T scale2Func(float[] m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling2(v, new float[16]), func);
	}
	
	public static <T> T scale2Func(float[] m, float v0, float v1, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling2(v0, v1, new float[16]), func);
	}
	
	public static float[] scale3(IMat4RF m, ITup3RF v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static float[] scale3(IMat4RF m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static float[] scale3(IMat4RF m, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		return mul(m, setScaling3(v0, v1, v2, new float[16]), res);
	}
	
	public static float[] scale3(float[] m, ITup3RF v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static float[] scale3(float[] m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static float[] scale3(float[] m, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		return mul(m, setScaling3(v0, v1, v2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale3(IMat4RF m, ITup3RF v, @ExtractionParam T res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale3(IMat4RF m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale3(IMat4RF m, float v0, float v1, float v2, @ExtractionParam T res)
	{
		return mul(m, setScaling3(v0, v1, v2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale3(float[] m, ITup3RF v, @ExtractionParam T res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale3(float[] m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setScaling3(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale3(float[] m, float v0, float v1, float v2, @ExtractionParam T res)
	{
		return mul(m, setScaling3(v0, v1, v2, new float[16]), res);
	}
	
	public static <T> T scale3Func(IMat4RF m, ITup3RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling3(v, new float[16]), func);
	}
	
	public static <T> T scale3Func(IMat4RF m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling3(v, new float[16]), func);
	}
	
	public static <T> T scale3Func(IMat4RF m, float v0, float v1, float v2, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling3(v0, v1, v2, new float[16]), func);
	}
	
	public static <T> T scale3Func(float[] m, ITup3RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling3(v, new float[16]), func);
	}
	
	public static <T> T scale3Func(float[] m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling3(v, new float[16]), func);
	}
	
	public static <T> T scale3Func(float[] m, float v0, float v1, float v2, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling3(v0, v1, v2, new float[16]), func);
	}
	
	public static float[] scale4(IMat4RF m, ITup4RF v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static float[] scale4(IMat4RF m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static float[] scale4(IMat4RF m, float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		return mul(m, setScaling4(v0, v1, v2, v3, new float[16]), res);
	}
	
	public static float[] scale4(float[] m, ITup4RF v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static float[] scale4(float[] m, float[] v, @ExtractionParam float[] res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static float[] scale4(float[] m, float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		return mul(m, setScaling4(v0, v1, v2, v3, new float[16]), res);
	}

	public static <T extends IMat4WF> T scale4(IMat4RF m, ITup4RF v, @ExtractionParam T res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale4(IMat4RF m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale4(IMat4RF m, float v0, float v1, float v2, float v3, @ExtractionParam T res)
	{
		return mul(m, setScaling4(v0, v1, v2, v3, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale4(float[] m, ITup4RF v, @ExtractionParam T res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale4(float[] m, float[] v, @ExtractionParam T res)
	{
		return mul(m, setScaling4(v, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T scale4(float[] m, float v0, float v1, float v2, float v3, @ExtractionParam T res)
	{
		return mul(m, setScaling4(v0, v1, v2, v3, new float[16]), res);
	}
	
	public static <T> T scale4Func(IMat4RF m, ITup4RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling4(v, new float[16]), func);
	}
	
	public static <T> T scale4Func(IMat4RF m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling4(v, new float[16]), func);
	}
	
	public static <T> T scale4Func(IMat4RF m, float v0, float v1, float v2, float v3, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling4(v0, v1, v2, v3, new float[16]), func);
	}
	
	public static <T> T scale4Func(float[] m, ITup4RF v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling4(v, new float[16]), func);
	}
	
	public static <T> T scale4Func(float[] m, float[] v, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling4(v, new float[16]), func);
	}
	
	public static <T> T scale4Func(float[] m, float v0, float v1, float v2, float v3, IFunc16F<T> func)
	{
		return mulFunc(m, setScaling4(v0, v1, v2, v3, new float[16]), func);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, float[] u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, float[] u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, float[] u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, float[] u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, float[] u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, ITup3RF u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, float[] u, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, float[] u, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static float[] baseChange(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam float[] res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}

	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, float[] u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, float[] u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, float[] u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, float[] u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, float[] u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, ITup3RF u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, float[] u, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, float[] u, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T baseChange(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, @ExtractionParam T res)
	{
		return mul(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), res);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, float[] u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, float[] u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, float[] u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(IMat4RF m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, float[] u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, ITup3RF r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, float[] u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float[] r, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(r, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, ITup3RF u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, ITup3RF u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, ITup3RF u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, float[] u, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, float[] u, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, float[] u, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, u, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, ITup3RF f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float[] f, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, f, new float[16]), func);
	}
	
	public static <T> T baseChangeFunc(float[] m, float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2, IFunc16F<T> func)
	{
		return mulFunc(m, setBaseChanging(rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, new float[16]), func);
	}
	
	public static float[] rotateRad(IMat4RF m, float[] a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static float[] rotateRad(IMat4RF m, float av0, float av1, float av2, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationRad(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static float[] rotateRad(IMat4RF m, ITup3RF a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static float[] rotateRad(float[] m, ITup3RF a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static float[] rotateRad(float[] m, float[] a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static float[] rotateRad(float[] m, float av0, float av1, float av2, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationRad(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateRad(IMat4RF m, float[] a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateRad(IMat4RF m, float av0, float av1, float av2, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationRad(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateRad(IMat4RF m, ITup3RF a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateRad(float[] m, ITup3RF a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateRad(float[] m, float[] a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationRad(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateRad(float[] m, float av0, float av1, float av2, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationRad(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static <T> T rotateRadFunc(IMat4RF m, float[] a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationRad(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateRadFunc(IMat4RF m, float av0, float av1, float av2, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationRad(av0, av1, av2, angle, new float[16]), func);
	}
	
	public static <T> T rotateRadFunc(IMat4RF m, ITup3RF a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationRad(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateRadFunc(float[] m, ITup3RF a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationRad(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateRadFunc(float[] m, float[] a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationRad(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateRadFunc(float[] m, float av0, float av1, float av2, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationRad(av0, av1, av2, angle, new float[16]), func);
	}
	
	public static float[] rotateDeg(IMat4RF m, float[] a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static float[] rotateDeg(IMat4RF m, float av0, float av1, float av2, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationDeg(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static float[] rotateDeg(IMat4RF m, ITup3RF a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static float[] rotateDeg(float[] m, ITup3RF a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static float[] rotateDeg(float[] m, float[] a, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static float[] rotateDeg(float[] m, float av0, float av1, float av2, float angle, @ExtractionParam float[] res)
	{
		return mul(m, setRotationDeg(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateDeg(IMat4RF m, float[] a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateDeg(IMat4RF m, float av0, float av1, float av2, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationDeg(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateDeg(IMat4RF m, ITup3RF a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateDeg(float[] m, ITup3RF a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateDeg(float[] m, float[] a, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationDeg(a, angle, new float[16]), res);
	}
	
	public static <T extends IMat4WF> T rotateDeg(float[] m, float av0, float av1, float av2, float angle, @ExtractionParam T res)
	{
		return mul(m, setRotationDeg(av0, av1, av2, angle, new float[16]), res);
	}
	
	public static <T> T rotateDegFunc(IMat4RF m, float[] a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationDeg(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateDegFunc(IMat4RF m, float av0, float av1, float av2, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationDeg(av0, av1, av2, angle, new float[16]), func);
	}
	
	public static <T> T rotateDegFunc(IMat4RF m, ITup3RF a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationDeg(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateDegFunc(float[] m, ITup3RF a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationDeg(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateDegFunc(float[] m, float[] a, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationDeg(a, angle, new float[16]), func);
	}
	
	public static <T> T rotateDegFunc(float[] m, float av0, float av1, float av2, float angle, IFunc16F<T> func)
	{
		return mulFunc(m, setRotationDeg(av0, av1, av2, angle, new float[16]), func);
	}
}
