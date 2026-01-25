package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

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

public class MatOps4F
{
	
	public static float[] getColumn(int col, float[] m1, @ExtractionParam float[] res)
	{
		int c = col * 4;
		
		res[0] = m1[c];
		res[1] = m1[c+1];
		res[2] = m1[c+2];
		res[3] = m1[c+3];
		
		return res;
	}
	
	public static float[] getColumn0(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[0];
		res[1] = m1[1];
		res[2] = m1[2];
		res[3] = m1[3];
		
		return res;
	}
	
	public static float[] getColumn1(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[4];
		res[1] = m1[5];
		res[2] = m1[6];
		res[3] = m1[7];
		
		return res;
	}
	
	public static float[] getColumn2(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[8];
		res[1] = m1[9];
		res[2] = m1[10];
		res[3] = m1[11];
		
		return res;
	}
	
	public static float[] getColumn3(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[12];
		res[1] = m1[13];
		res[2] = m1[14];
		res[3] = m1[15];
		
		return res;
	}
	
	public static float[] getRow(int row, float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[row];
		res[1] = m1[4+row];
		res[2] = m1[8+row];
		res[2] = m1[12+row];
		
		return res;
	}
	
	public static float[] getRow0(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[0];
		res[1] = m1[4];
		res[2] = m1[8];
		res[3] = m1[12];
		
		return res;
	}
	
	public static float[] getRow1(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[1];
		res[1] = m1[5];
		res[2] = m1[9];
		res[3] = m1[13];
		
		return res;
	}
	
	public static float[] getRow2(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[2];
		res[1] = m1[6];
		res[2] = m1[10];
		res[3] = m1[14];
		
		return res;
	}
	
	public static float[] getRow3(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[3];
		res[1] = m1[7];
		res[2] = m1[11];
		res[3] = m1[15];
		
		return res;
	}
	
	public static float[] setColumn(int col, float[] v1, @ExtractionParam float[] res)
	{
		int c = col * 4;
		
		res[c] = v1[0];
		res[c+1] = v1[1];
		res[c+2] = v1[2];
		res[c+3] = v1[3];
		
		return res;
	}
	
	public static float[] setColumn(int col, float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		int c = col * 4;
		
		res[c] = v1X;
		res[c+1] = v1Y;
		res[c+2] = v1Z;
		res[c+3] = v1W;
		
		return res;
	}
	
	public static float[] setColumn0(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[1] = v1[1];
		res[2] = v1[2];
		res[3] = v1[3];
		
		return res;
	}
	
	public static float[] setColumn0(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		res[3] = v1W;
		
		return res;
	}
	
	public static float[] setColumn1(float[] v1, @ExtractionParam float[] res)
	{
		res[4] = v1[0];
		res[5] = v1[1];
		res[6] = v1[2];
		res[7] = v1[3];
		
		return res;
	}
	
	public static float[] setColumn1(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[4] = v1X;
		res[5] = v1Y;
		res[6] = v1Z;
		res[7] = v1W;
		
		return res;
	}
	
	public static float[] setColumn2(float[] v1, @ExtractionParam float[] res)
	{
		res[8] = v1[0];
		res[9] = v1[1];
		res[10] = v1[2];
		res[11] = v1[3];
		
		return res;
	}
	
	public static float[] setColumn2(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[8] = v1X;
		res[9] = v1Y;
		res[10] = v1Z;
		res[11] = v1W;
		
		return res;
	}
	
	public static float[] setColumn3(float[] v1, @ExtractionParam float[] res)
	{
		res[12] = v1[0];
		res[13] = v1[1];
		res[14] = v1[2];
		res[15] = v1[3];
		
		return res;
	}
	
	public static float[] setColumn3(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[12] = v1X;
		res[13] = v1Y;
		res[14] = v1Z;
		res[15] = v1W;
		
		return res;
	}
	
	public static float[] setRow(int row, float[] v1, @ExtractionParam float[] res)
	{
		res[row] = v1[0];
		res[4+row] = v1[1];
		res[8+row] = v1[2];
		res[12+row] = v1[3];
		
		return res;
	}
	
	public static float[] setRow(int row, float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[row] = v1X;
		res[4 + row] = v1Y;
		res[8 + row] = v1Z;
		res[12 + row] = v1W;
		
		return res;
	}
	
	public static float[] setRow0(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[4] = v1[1];
		res[8] = v1[2];
		res[12] = v1[3];
		
		return res;
	}
	
	public static float[] setRow0(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[4] = v1Y;
		res[8] = v1Z;
		res[12] = v1Z;
		
		return res;
	}
	
	public static float[] setRow1(float[] v1, @ExtractionParam float[] res)
	{
		res[1] = v1[0];
		res[5] = v1[1];
		res[9] = v1[2];
		res[13] = v1[3];
		
		return res;
	}
	
	public static float[] setRow1(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[1] = v1X;
		res[5] = v1Y;
		res[9] = v1Z;
		res[13] = v1W;
		
		return res;
	}
	
	public static float[] setRow2(float[] v1, @ExtractionParam float[] res)
	{
		res[2] = v1[0];
		res[6] = v1[1];
		res[10] = v1[2];
		res[14] = v1[3];
		
		return res;
	}
	
	public static float[] setRow2(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[2] = v1X;
		res[6] = v1Y;
		res[10] = v1Z;
		res[14] = v1Z;
		
		return res;
	}
	
	public static float[] setRow3(float[] v1, @ExtractionParam float[] res)
	{
		res[3] = v1[0];
		res[7] = v1[2];
		res[11] = v1[2];
		res[15] = v1[3];
		
		return res;
	}
	
	public static float[] setRow3(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[3] = v1X;
		res[7] = v1Y;
		res[11] = v1Z;
		res[15] = v1W;
		
		return res;
	}
	
	public static float[] setCell(int col, int row, float v1, @ExtractionParam float[] res)
	{
		res[col*4+row] = v1;
		
		return res;
	}
	
	public static float determinant(float[] m)
	{
		float m1M00 = m[0];
		float m1M01 = m[1];
		float m1M02 = m[2];
		float m1M03 = m[3];

		float m1M10 = m[4];
		float m1M11 = m[5];
		float m1M12 = m[6];
		float m1M13 = m[7];
		
		float m1M20 = m[8];
		float m1M21 = m[9];
		float m1M22 = m[10];
		float m1M23 = m[11];
		
		float m1M30 = m[12];
		float m1M31 = m[13];
		float m1M32 = m[14];
		float m1M33 = m[15];
		
		float dm00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33);
		float dm01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33);
		float dm02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33);
		float dm03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32);
		
		return MathUtils.fma(m1M00, dm00, MathUtils.fma(m1M01, dm01, MathUtils.fma(m1M02, dm02, m1M03 * dm03)));
	}
	
	public static float determinant(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33)
	{
		float dm00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33);
		float dm01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33);
		float dm02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33);
		float dm03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32);
		
		return MathUtils.fma(m1M00, dm00, MathUtils.fma(m1M01, dm01, MathUtils.fma(m1M02, dm02, m1M03 * dm03)));
	}
	
	public static float[] invert(float[] m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];

		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];
		
		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float det = determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

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
	
	public static float[] invert(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, @ExtractionParam float[] res)
	{
		float det = determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

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
	
	public static float[] invertAssign(@ExtractionParam float[] m1)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];

		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];
		
		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];

		float det = determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

		m1[0] = r00;
		m1[1] = r10;
		m1[2] = r20;
		m1[3] = r30;
		
		m1[4] = r01;
		m1[5] = r11;
		m1[6] = r21;
		m1[7] = r31;
		
		m1[8] = r02;
		m1[9] = r12;
		m1[10] = r22;
		m1[11] = r32;
		
		m1[12] = r03;
		m1[13] = r13;
		m1[14] = r23;
		m1[15] = r33;

		return m1;
	}
	
	public static float[] transpose(float[] m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];

		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];
		
		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		res[0] = m1M00;
		res[1] = m1M10;
		res[2] = m1M20;
		res[3] = m1M30;
		
		res[4] = m1M01;
		res[5] = m1M11;
		res[6] = m1M21;
		res[7] = m1M31;
		
		res[8] = m1M02;
		res[9] = m1M12;
		res[10] = m1M22;
		res[11] = m1M32;
		
		res[12] = m1M03;
		res[13] = m1M13;
		res[14] = m1M23;
		res[15] = m1M33;
		
		return res;
	}
	
	public static float[] transpose(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, @ExtractionParam float[] res)
	{
		res[0] = m1M00;
		res[1] = m1M10;
		res[2] = m1M20;
		res[3] = m1M30;
		
		res[4] = m1M01;
		res[5] = m1M11;
		res[6] = m1M21;
		res[7] = m1M31;
		
		res[8] = m1M02;
		res[9] = m1M12;
		res[10] = m1M22;
		res[11] = m1M32;
		
		res[12] = m1M03;
		res[13] = m1M13;
		res[14] = m1M23;
		res[15] = m1M33;
		
		return res;
	}
	
	public static float[] transposeAssign(@ExtractionParam float[] m1)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];

		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];
		
		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		m1[0] = m1M00;
		m1[1] = m1M10;
		m1[2] = m1M20;
		m1[3] = m1M30;
		
		m1[4] = m1M01;
		m1[5] = m1M11;
		m1[6] = m1M21;
		m1[7] = m1M31;
		
		m1[8] = m1M02;
		m1[9] = m1M12;
		m1[10] = m1M22;
		m1[11] = m1M32;
		
		m1[12] = m1M03;
		m1[13] = m1M13;
		m1[14] = m1M23;
		m1[15] = m1M33;
		
		return m1;
	}
	
	public static float trace(float[] m1)
	{
		return m1[0] + m1[5] + m1[10] + m1[15];
	}
	
	public static float trace(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33)
	{
		return m1M00 + m1M11 + m1M22 + m1M33;
	}
	
	public static float[] mul(float[] m1, float[] m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mul(float[] m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float[] m2, @ExtractionParam float[] res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam float[] res)
	{
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] m1, float[] m2)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		m1[3] = r03;
		
		m1[4] = r10;
		m1[5] = r11;
		m1[6] = r12;
		m1[7] = r13;
		
		m1[8] = r20;
		m1[9] = r21;
		m1[10] = r22;
		m1[11] = r23; 
		
		m1[12] = r30;
		m1[13] = r31;
		m1[14] = r32;
		m1[15] = r33;
		
		return m1;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		m1[3] = r03;
		
		m1[4] = r10;
		m1[5] = r11;
		m1[6] = r12;
		m1[7] = r13;
		
		m1[8] = r20;
		m1[9] = r21;
		m1[10] = r22;
		m1[11] = r23; 
		
		m1[12] = r30;
		m1[13] = r31;
		m1[14] = r32;
		m1[15] = r33;
		
		return m1;
	}
	
	public static float[] revMul(float[] m1, float m2[], @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, MathUtils.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, MathUtils.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, MathUtils.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = MathUtils.fma(m2M00, m1M03, MathUtils.fma(m2M01, m1M13, MathUtils.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, MathUtils.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, MathUtils.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, MathUtils.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = MathUtils.fma(m2M10, m1M03, MathUtils.fma(m2M11, m1M13, MathUtils.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, MathUtils.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, MathUtils.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, MathUtils.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = MathUtils.fma(m2M20, m1M03, MathUtils.fma(m2M21, m1M13, MathUtils.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = MathUtils.fma(m2M30, m1M00, MathUtils.fma(m2M31, m1M10, MathUtils.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = MathUtils.fma(m2M30, m1M01, MathUtils.fma(m2M31, m1M11, MathUtils.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = MathUtils.fma(m2M30, m1M02, MathUtils.fma(m2M31, m1M12, MathUtils.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = MathUtils.fma(m2M30, m1M03, MathUtils.fma(m2M31, m1M13, MathUtils.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMul(float[] m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, MathUtils.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, MathUtils.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, MathUtils.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = MathUtils.fma(m2M00, m1M03, MathUtils.fma(m2M01, m1M13, MathUtils.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, MathUtils.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, MathUtils.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, MathUtils.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = MathUtils.fma(m2M10, m1M03, MathUtils.fma(m2M11, m1M13, MathUtils.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, MathUtils.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, MathUtils.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, MathUtils.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = MathUtils.fma(m2M20, m1M03, MathUtils.fma(m2M21, m1M13, MathUtils.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = MathUtils.fma(m2M30, m1M00, MathUtils.fma(m2M31, m1M10, MathUtils.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = MathUtils.fma(m2M30, m1M01, MathUtils.fma(m2M31, m1M11, MathUtils.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = MathUtils.fma(m2M30, m1M02, MathUtils.fma(m2M31, m1M12, MathUtils.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = MathUtils.fma(m2M30, m1M03, MathUtils.fma(m2M31, m1M13, MathUtils.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float m2[], @ExtractionParam float[] res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, MathUtils.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, MathUtils.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, MathUtils.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = MathUtils.fma(m2M00, m1M03, MathUtils.fma(m2M01, m1M13, MathUtils.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, MathUtils.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, MathUtils.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, MathUtils.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = MathUtils.fma(m2M10, m1M03, MathUtils.fma(m2M11, m1M13, MathUtils.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, MathUtils.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, MathUtils.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, MathUtils.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = MathUtils.fma(m2M20, m1M03, MathUtils.fma(m2M21, m1M13, MathUtils.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = MathUtils.fma(m2M30, m1M00, MathUtils.fma(m2M31, m1M10, MathUtils.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = MathUtils.fma(m2M30, m1M01, MathUtils.fma(m2M31, m1M11, MathUtils.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = MathUtils.fma(m2M30, m1M02, MathUtils.fma(m2M31, m1M12, MathUtils.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = MathUtils.fma(m2M30, m1M03, MathUtils.fma(m2M31, m1M13, MathUtils.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam float[] res)
	{	
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, MathUtils.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, MathUtils.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, MathUtils.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = MathUtils.fma(m2M00, m1M03, MathUtils.fma(m2M01, m1M13, MathUtils.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, MathUtils.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, MathUtils.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, MathUtils.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = MathUtils.fma(m2M10, m1M03, MathUtils.fma(m2M11, m1M13, MathUtils.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, MathUtils.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, MathUtils.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, MathUtils.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = MathUtils.fma(m2M20, m1M03, MathUtils.fma(m2M21, m1M13, MathUtils.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = MathUtils.fma(m2M30, m1M00, MathUtils.fma(m2M31, m1M10, MathUtils.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = MathUtils.fma(m2M30, m1M01, MathUtils.fma(m2M31, m1M11, MathUtils.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = MathUtils.fma(m2M30, m1M02, MathUtils.fma(m2M31, m1M12, MathUtils.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = MathUtils.fma(m2M30, m1M03, MathUtils.fma(m2M31, m1M13, MathUtils.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMulAssign(@ExtractionParam float[] m1, float m2[])
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, MathUtils.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, MathUtils.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, MathUtils.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = MathUtils.fma(m2M00, m1M03, MathUtils.fma(m2M01, m1M13, MathUtils.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, MathUtils.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, MathUtils.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, MathUtils.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = MathUtils.fma(m2M10, m1M03, MathUtils.fma(m2M11, m1M13, MathUtils.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, MathUtils.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, MathUtils.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, MathUtils.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = MathUtils.fma(m2M20, m1M03, MathUtils.fma(m2M21, m1M13, MathUtils.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = MathUtils.fma(m2M30, m1M00, MathUtils.fma(m2M31, m1M10, MathUtils.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = MathUtils.fma(m2M30, m1M01, MathUtils.fma(m2M31, m1M11, MathUtils.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = MathUtils.fma(m2M30, m1M02, MathUtils.fma(m2M31, m1M12, MathUtils.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = MathUtils.fma(m2M30, m1M03, MathUtils.fma(m2M31, m1M13, MathUtils.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		m1[3] = r03;
		
		m1[4] = r10;
		m1[5] = r11;
		m1[6] = r12;
		m1[7] = r13;
		
		m1[8] = r20;
		m1[9] = r21;
		m1[10] = r22;
		m1[11] = r23; 
		
		m1[12] = r30;
		m1[13] = r31;
		m1[14] = r32;
		m1[15] = r33;
		
		return m1;
	}
	
	public static float[] revMulAssign(@ExtractionParam float[] m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, MathUtils.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, MathUtils.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, MathUtils.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = MathUtils.fma(m2M00, m1M03, MathUtils.fma(m2M01, m1M13, MathUtils.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, MathUtils.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, MathUtils.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, MathUtils.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = MathUtils.fma(m2M10, m1M03, MathUtils.fma(m2M11, m1M13, MathUtils.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, MathUtils.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, MathUtils.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, MathUtils.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = MathUtils.fma(m2M20, m1M03, MathUtils.fma(m2M21, m1M13, MathUtils.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = MathUtils.fma(m2M30, m1M00, MathUtils.fma(m2M31, m1M10, MathUtils.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = MathUtils.fma(m2M30, m1M01, MathUtils.fma(m2M31, m1M11, MathUtils.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = MathUtils.fma(m2M30, m1M02, MathUtils.fma(m2M31, m1M12, MathUtils.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = MathUtils.fma(m2M30, m1M03, MathUtils.fma(m2M31, m1M13, MathUtils.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		m1[3] = r03;
		
		m1[4] = r10;
		m1[5] = r11;
		m1[6] = r12;
		m1[7] = r13;
		
		m1[8] = r20;
		m1[9] = r21;
		m1[10] = r22;
		m1[11] = r23; 
		
		m1[12] = r30;
		m1[13] = r31;
		m1[14] = r32;
		m1[15] = r33;
		
		return m1;
	}
	
}
