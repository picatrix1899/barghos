package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
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

// 00 04 08 12
// 01 05 09 13
// 02 06 10 14
// 03 07 11 15

public class MatUtils4F
{
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
	
	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T invertCreateNew(IMat4RF m, T prototype)
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

		return (T) prototype.createNew(r00, r10, r20, r30, r01, r11, r21, r31, r02, r12, r22, r32, r03, r13, r23, r33);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T invertCreateNew(float[] m, T prototype)
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

		return (T) prototype.createNew(r00, r10, r20, r30, r01, r11, r21, r31, r02, r12, r22, r32, r03, r13, r23, r33);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T transposeCreateNew(IMat4RF m, T prototype)
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

		return (T) prototype.createNew(m00, m10, m20, m30, m01, m11, m21, m31, m02, m12, m22, m32, m03, m13, m23, m33);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T transposeCreateNew(float[] m, T prototype)
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
		
		return (T) prototype.createNew(m00, m10, m20, m30, m01, m11, m21, m31, m02, m12, m22, m32, m03, m13, m23, m33);
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

	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T mulCreateNew(IMat4RF a, IMat4RF b, T prototype)
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
		
		return (T) prototype.createNew(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T mulCreateNew(IMat4RF a, float[] b, T prototype)
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
		
		return (T) prototype.createNew(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T mulCreateNew(float[] a, IMat4RF b, T prototype)
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
		
		return (T) prototype.createNew(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends IMat4RF> T mulCreateNew(float[] a, float[] b, T prototype)
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

		return (T) prototype.createNew(r00, r01, r02, r03, r10, r11, r12, r13, r20, r21, r22, r23, r30, r31, r32, r33);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transform2CreateNew(boolean isPoint, ITup2RF v, IMat4RF m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transform2CreateNew(boolean isPoint, ITup2RF v, float[] m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transform2CreateNew(boolean isPoint, float[] v, IMat4RF m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transform2CreateNew(boolean isPoint, float[] v, float[] m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transform2CreateNew(boolean isPoint, float v0, float v1, IMat4RF m, T prototype)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, w * m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, w * m.m13()));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transform2CreateNew(boolean isPoint, float v0, float v1, float[] m, T prototype)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, w * m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, w * m[7]));

		return (T) prototype.createNew(r0, r1);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformPoint2CreateNew(ITup2RF v, IMat4RF m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformPoint2CreateNew(ITup2RF v, float[] m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformPoint2CreateNew(float[] v, IMat4RF m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformPoint2CreateNew(float[] v, float[] m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformPoint2CreateNew(float v0, float v1, IMat4RF m, T prototype)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m03()));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m13()));
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformPoint2CreateNew(float v0, float v1, float[] m, T prototype)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[3]));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[7]));
		
		return (T) prototype.createNew(r0, r1);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformVec2CreateNew(ITup2RF v, IMat4RF m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformVec2CreateNew(ITup2RF v, float[] m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformVec2CreateNew(float[] v, IMat4RF m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformVec2CreateNew(float[] v, float[] m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformVec2CreateNew(float v0, float v1, IMat4RF m, T prototype)
	{
		float r0 = MathUtils.fma(m.m00(), v0, m.m01() * v1);
		float r1 = MathUtils.fma(m.m10(), v0, m.m11() * v1);
		
		return (T) prototype.createNew(r0, r1);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup2RF> T transformVec2CreateNew(float v0, float v1, float[] m, T prototype)
	{
		float r0 = MathUtils.fma(m[0], v0, m[1] * v1);
		float r1 = MathUtils.fma(m[4], v0, m[5] * v1);
		
		return (T) prototype.createNew(r0, r1);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transform3CreateNew(boolean isPoint, ITup3RF v, IMat4RF m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transform3CreateNew(boolean isPoint, ITup3RF v, float[] m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transform3CreateNew(boolean isPoint, float[] v, IMat4RF m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transform3CreateNew(boolean isPoint, float[] v, float[] m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transform3CreateNew(boolean isPoint, float v0, float v1, float v2, IMat4RF m, T prototype)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, w * m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, w * m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, w * m.m23())));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transform3CreateNew(boolean isPoint, float v0, float v1, float v2, float[] m, T prototype)
	{
		float w = isPoint ? 1.0f : 0.0f;

		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, w * m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, w * m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, w * m[11])));

		return (T) prototype.createNew(r0, r1, r2);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformPoint3CreateNew(ITup3RF v, IMat4RF m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformPoint3CreateNew(ITup3RF v, float[] m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformPoint3CreateNew(float[] v, IMat4RF m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformPoint3CreateNew(float[] v, float[] m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformPoint3CreateNew(float v0, float v1, float v2, IMat4RF m, T prototype)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03())));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13())));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23())));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformPoint3CreateNew(float v0, float v1, float v2, float[] m, T prototype)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3])));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7])));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11])));
		
		return (T) prototype.createNew(r0, r1, r2);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformVec3CreateNew(ITup3RF v, IMat4RF m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformVec3CreateNew(ITup3RF v, float[] m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformVec3CreateNew(float[] v, IMat4RF m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformVec3CreateNew(float[] v, float[] m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformVec3CreateNew(float v0, float v1, float v2, IMat4RF m, T prototype)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, m.m02() * v2));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, m.m12() * v2));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, m.m22() * v2));
		
		return (T) prototype.createNew(r0, r1, r2);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup3RF> T transformVec3CreateNew(float v0, float v1, float v2, float[] m, T prototype)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, m[2] * v2));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, m[6] * v2));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, m[10] * v2));
		
		return (T) prototype.createNew(r0, r1, r2);
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
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup4RF> T transform4CreateNew(ITup4RF v, IMat4RF m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		return (T) prototype.createNew(r0, r1, r2, r3);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup4RF> T transform4CreateNew(ITup4RF v, float[] m, T prototype)
	{
		float v0 = v.v0();
		float v1 = v.v1();
		float v2 = v.v2();
		float v3 = v.v3();
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		return (T) prototype.createNew(r0, r1, r2, r3);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup4RF> T transform4CreateNew(float[] v, IMat4RF m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		return (T) prototype.createNew(r0, r1, r2, r3);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup4RF> T transform4CreateNew(float[] v, float[] m, T prototype)
	{
		float v0 = v[0];
		float v1 = v[1];
		float v2 = v[2];
		float v3 = v[3];
		
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		return (T) prototype.createNew(r0, r1, r2, r3);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup4RF> T transform4CreateNew(float v0, float v1, float v2, float v3, IMat4RF m, T prototype)
	{
		float r0 = MathUtils.fma(m.m00(), v0, MathUtils.fma(m.m01(), v1, MathUtils.fma(m.m02(), v2, m.m03() * v3)));
		float r1 = MathUtils.fma(m.m10(), v0, MathUtils.fma(m.m11(), v1, MathUtils.fma(m.m12(), v2, m.m13() * v3)));
		float r2 = MathUtils.fma(m.m20(), v0, MathUtils.fma(m.m21(), v1, MathUtils.fma(m.m22(), v2, m.m23() * v3)));
		float r3 = MathUtils.fma(m.m30(), v0, MathUtils.fma(m.m31(), v1, MathUtils.fma(m.m32(), v2, m.m33() * v3)));
		
		return (T) prototype.createNew(r0, r1, r2, r3);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends ITup4RF> T transform4CreateNew(float v0, float v1, float v2, float v3, float[] m, T prototype)
	{
		float r0 = MathUtils.fma(m[0], v0, MathUtils.fma(m[1], v1, MathUtils.fma(m[2], v2, m[3] * v3)));
		float r1 = MathUtils.fma(m[4], v0, MathUtils.fma(m[5], v1, MathUtils.fma(m[6], v2, m[7] * v3)));
		float r2 = MathUtils.fma(m[8], v0, MathUtils.fma(m[9], v1, MathUtils.fma(m[10], v2, m[11] * v3)));
		float r3 = MathUtils.fma(m[12], v0, MathUtils.fma(m[13], v1, MathUtils.fma(m[14], v2, m[15] * v3)));
		
		return (T) prototype.createNew(r0, r1, r2, r3);
	}
	
	public static float[] initZero(@ExtractionParam float[] res)
	{
		setCol0(0.0f, 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, 0.0f, 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, 0.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 0.0f, res);
		
		return res;
	}
	
	public static float[] initIdentity(@ExtractionParam float[] res)
	{
		setCol0(1.0f, 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, 1.0f, 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, 1.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initTranslation2(ITup2RF v, @ExtractionParam float[] res)
	{
		setCol0(1.0f, 0.0f, 0.0f, v.v0(), res);
		setCol1(0.0f, 1.0f, 0.0f, v.v1(), res);
		setCol2(0.0f, 0.0f, 1.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initTranslation2(float[] v, @ExtractionParam float[] res)
	{
		setCol0(1.0f, 0.0f, 0.0f, v[0], res);
		setCol1(0.0f, 1.0f, 0.0f, v[1], res);
		setCol2(0.0f, 0.0f, 1.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initTranslation2(float v0, float v1, @ExtractionParam float[] res)
	{
		setCol0(1.0f, 0.0f, 0.0f, v0, res);
		setCol1(0.0f, 1.0f, 0.0f, v1, res);
		setCol2(0.0f, 0.0f, 1.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initTranslation3(ITup3RF v, @ExtractionParam float[] res)
	{
		setCol0(1.0f, 0.0f, 0.0f, v.v0(), res);
		setCol1(0.0f, 1.0f, 0.0f, v.v1(), res);
		setCol2(0.0f, 0.0f, 1.0f, v.v2(), res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initTranslation3(float[] v, @ExtractionParam float[] res)
	{
		setCol0(1.0f, 0.0f, 0.0f, v[0], res);
		setCol1(0.0f, 1.0f, 0.0f, v[1], res);
		setCol2(0.0f, 0.0f, 1.0f, v[2], res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initTranslation3(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		setCol0(1.0f, 0.0f, 0.0f, v0, res);
		setCol1(0.0f, 1.0f, 0.0f, v1, res);
		setCol2(0.0f, 0.0f, 1.0f, v2, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initScale2(ITup2RF v, @ExtractionParam float[] res)
	{
		setCol0(v.v0(), 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v.v1(), 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, 1.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initScale2(float[] v, @ExtractionParam float[] res)
	{
		setCol0(v[0], 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v[1], 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, 1.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initScale2(float v0, float v1, @ExtractionParam float[] res)
	{
		setCol0(v0, 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v1, 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, 1.0f, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initScale3(ITup3RF v, @ExtractionParam float[] res)
	{
		setCol0(v.v0(), 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v.v1(), 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, v.v2(), 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initScale3(float[] v, @ExtractionParam float[] res)
	{
		setCol0(v[0], 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v[1], 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, v[2], 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initScale3(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		setCol0(v0, 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v1, 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, v2, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initScale4(ITup4RF v, @ExtractionParam float[] res)
	{
		setCol0(v.v0(), 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v.v1(), 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, v.v2(), 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, v.v3(), res);
		
		return res;
	}
	
	public static float[] initScale4(float[] v, @ExtractionParam float[] res)
	{
		setCol0(v[0], 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v[1], 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, v[2], 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, v[3], res);
		
		return res;
	}
	
	public static float[] initScale4(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		setCol0(v0, 0.0f, 0.0f, 0.0f, res);
		setCol1(0.0f, v1, 0.0f, 0.0f, res);
		setCol2(0.0f, 0.0f, v2, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, v3, res);
		
		return res;
	}

	public static float[] initBaseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ, @ExtractionParam float[] res)
	{
		setCol0(rX, uX, fX, 0.0f, res);
		setCol1(rY, uY, fY, 0.0f, res);
		setCol2(rZ, uZ, fZ, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}

	public static float[] initRotationRad(float aV0, float aV1, float aV2, float angle, @ExtractionParam float[] res)
	{
		float sinAngle = MathUtils.sin(angle);
		float cosAngle = MathUtils.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		setCol0(cosAngle + (aV0 * aV0) * recCosAngle, aV0 * aV1 * recCosAngle - aV2 * sinAngle, aV0 * aV2 * recCosAngle + aV1 * sinAngle, 0.0f, res);
		setCol1(aV1 * aV0 * recCosAngle + aV2 * sinAngle, cosAngle + (aV1 * aV1) * recCosAngle, aV1 * aV2 * recCosAngle - aV0 * sinAngle, 0.0f, res);
		setCol2(aV2 * aV0 * recCosAngle - aV1 * sinAngle, aV2 * aV1 * recCosAngle + aV0 * sinAngle, cosAngle + (aV2 * aV2) * recCosAngle, 0.0f, res);
		setCol3(0.0f, 0.0f, 0.0f, 1.0f, res);
		
		return res;
	}
	
	public static float[] initPerspective(float fovY, float aspectRatio, float near, float far, @ExtractionParam float[] res)
	{
		float f = MathUtils.tan(0.5f * fovY);
		
		setCol0(1.0f / (f * aspectRatio), 0, 0, 0, res);
		setCol1(0, 1.0f / f, 0, 0, res);
		setCol2(0, 0, -((far + near) / (far - near)), -((2.0f * far * near) / (far - near)), res);
		setCol3(0, 0, -1.0f, 0, res);
		
		return res;
	}
	
	public static float[] initOrtho(float left, float right, float bottom, float top, float near, float far, @ExtractionParam float[] res)
	{
		setCol0(2.0f / (right - left),				0f,									0f,								-(right + left) / (right - left), res);
		setCol1(0f,									2.0f / (top - bottom),				0f,								-(top + bottom) / (top - bottom), res);
		setCol2(0f,									0f, 								-2.0f / (far - near),			-(far + near) / (far - near), res);
		setCol3(0f,		0f,	0f, 	1.0f, res);
		 
		return res;
	}
	
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Mat4fC initRotationRH(QuatR q)
//	{
//		double qX = q.getX();
//		double qY = q.getY();
//		double qZ = q.getZ();
//		double qW = q.getW();
//		
//		setRow(0,
//				(float)(1.0 - 2.0	* (qY * qY + qZ * qZ)),
//				(float)(2.0		* (qX * qY - qZ * qW)),
//				(float)(2.0		* (qX * qZ + qW * qY)),
//				(float)0.0f
//				);
//		
//		setRow(1,
//				(float)(2.0		* (qX * qY + qZ * qW)),
//				(float)(1.0 - 2.0	* (qX * qX + qZ * qZ)),
//				(float)(2.0		* (qY * qZ - qW * qX)),
//				0.0f
//				);
//		
//		setRow(2,
//				(float)(2.0		* (qX * qZ - qW * qY)),
//				(float)(2.0		* (qY * qZ + qW * qX)),
//				(float)(1.0 - 2.0	* (qX * qX + qY * qY)),
//				0.0f
//				);
//		
//		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);
//
//		return this;
//	}

}
