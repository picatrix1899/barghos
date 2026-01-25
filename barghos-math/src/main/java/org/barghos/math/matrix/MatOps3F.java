package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

//Row-Major
//00 01 02
//10 11 12
//20 21 22

//Column-Major
//00 10 20
//01 11 21
//02 12 22

//Column-Major Indices
//00 03 06
//01 04 07
//02 05 08

public class MatOps3F
{
	
	private MatOps3F() { }
	
	public static float[] getCol(int col, float[] m1, @ExtractionParam float[] res)
	{
		int c = col * 3;
		
		res[0] = m1[c];
		res[1] = m1[c+1];
		res[2] = m1[c+2];
		
		return res;
	}
	
	public static float[] getCol0(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[0];
		res[1] = m1[1];
		res[2] = m1[2];
		
		return res;
	}
	
	public static float[] getCol1(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[3];
		res[1] = m1[4];
		res[2] = m1[5];
		
		return res;
	}
	
	public static float[] getCol2(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[6];
		res[1] = m1[7];
		res[2] = m1[8];
		
		return res;
	}
	
	public static float[] getRow(int row, float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[row];
		res[1] = m1[3+row];
		res[2] = m1[6+row];
		
		return res;
	}
	
	public static float[] getRow0(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[0];
		res[1] = m1[3];
		res[2] = m1[6];
		
		return res;
	}
	
	public static float[] getRow1(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[1];
		res[1] = m1[4];
		res[2] = m1[7];
		
		return res;
	}
	
	public static float[] getRow2(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[2];
		res[1] = m1[5];
		res[2] = m1[8];
		
		return res;
	}
	
	public static float[] setCol(int col, float[] v1, @ExtractionParam float[] res)
	{
		int c = col * 3;
		
		res[c] = v1[0];
		res[c+1] = v1[1];
		res[c+2] = v1[2];
		
		return res;
	}
	
	public static float[] setCol(int col, float v1, @ExtractionParam float[] res)
	{
		int c = col * 3;
		
		res[c] = v1;
		res[c+1] = v1;
		res[c+2] = v1;
		
		return res;
	}
	
	public static float[] setCol(int col, float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		int c = col * 3;
		
		res[c] = v1X;
		res[c+1] = v1Y;
		res[c+2] = v1Z;
		
		return res;
	}
	
	public static float[] setCol0(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[1] = v1[1];
		res[2] = v1[2];
		
		return res;
	}
	
	public static float[] setCol0(float v1, @ExtractionParam float[] res)
	{
		res[0] = v1;
		res[1] = v1;
		res[2] = v1;
		
		return res;
	}
	
	public static float[] setCol0(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1Z;
		
		return res;
	}
	
	public static float[] setCol1(float[] v1, @ExtractionParam float[] res)
	{
		res[3] = v1[0];
		res[4] = v1[1];
		res[5] = v1[2];
		
		return res;
	}
	
	public static float[] setCol1(float v1, @ExtractionParam float[] res)
	{
		res[3] = v1;
		res[4] = v1;
		res[5] = v1;
		
		return res;
	}
	
	public static float[] setCol1(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[3] = v1X;
		res[4] = v1Y;
		res[5] = v1Z;
		
		return res;
	}
	
	public static float[] setCol2(float[] v1, @ExtractionParam float[] res)
	{
		res[6] = v1[0];
		res[7] = v1[1];
		res[8] = v1[2];
		
		return res;
	}
	
	public static float[] setCol2(float v1, @ExtractionParam float[] res)
	{
		res[6] = v1;
		res[7] = v1;
		res[8] = v1;
		
		return res;
	}
	
	public static float[] setCol2(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[6] = v1X;
		res[7] = v1Y;
		res[8] = v1Z;
		
		return res;
	}
	
	public static float[] setRow(int row, float[] v1, @ExtractionParam float[] res)
	{
		res[row] = v1[0];
		res[3+row] = v1[1];
		res[6+row] = v1[2];
		
		return res;
	}
	
	public static float[] setRow(int row, float v1, @ExtractionParam float[] res)
	{
		res[row] = v1;
		res[3+row] = v1;
		res[6+row] = v1;
		
		return res;
	}
	
	public static float[] setRow(int row, float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[row] = v1X;
		res[3+row] = v1Y;
		res[6+row] = v1Z;
		
		return res;
	}
	
	public static float[] setRow0(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[3] = v1[1];
		res[6] = v1[2];

		return res;
	}
	
	public static float[] setRow0(float v1, @ExtractionParam float[] res)
	{
		res[0] = v1;
		res[3] = v1;
		res[6] = v1;

		return res;
	}
	
	public static float[] setRow0(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[3] = v1Y;
		res[6] = v1Z;

		return res;
	}
	
	public static float[] setRow1(float[] v1, @ExtractionParam float[] res)
	{
		res[1] = v1[0];
		res[4] = v1[1];
		res[7] = v1[2];
		
		return res;
	}
	
	public static float[] setRow1(float v1, @ExtractionParam float[] res)
	{
		res[1] = v1;
		res[4] = v1;
		res[7] = v1;
		
		return res;
	}
	
	public static float[] setRow1(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[1] = v1X;
		res[4] = v1Y;
		res[7] = v1Z;
		
		return res;
	}
	
	public static float[] setRow2(float[] v1, @ExtractionParam float[] res)
	{
		res[2] = v1[0];
		res[5] = v1[1];
		res[8] = v1[2];
		
		return res;
	}
	
	public static float[] setRow2(float v1, @ExtractionParam float[] res)
	{
		res[2] = v1;
		res[5] = v1;
		res[8] = v1;
		
		return res;
	}
	
	public static float[] setRow2(float v1X, float v1Y, float v1Z, @ExtractionParam float[] res)
	{
		res[2] = v1X;
		res[5] = v1Y;
		res[8] = v1Z;
		
		return res;
	}
	
	public static float[] setCell(int col, int row, float v, @ExtractionParam float[] res)
	{
		res[col*3+row] = v;
		
		return res;
	}
	
	public static float determinant(float[] m1)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];
		
		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float dm00 =  MatOps2F.determinant(m1M11, m1M12, m1M21, m1M22);
		float dm01 = -MatOps2F.determinant(m1M10, m1M12, m1M20, m1M22);
		float dm02 =  MatOps2F.determinant(m1M10, m1M11, m1M20, m1M21);
		
		return MathUtils.fma(m1M00, dm00, MathUtils.fma(m1M01, dm01, m1M02 * dm02));
	}
	
	public static float determinant(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22)
	{
		float dm00 =  MatOps2F.determinant(m1M11, m1M12, m1M21, m1M22);
		float dm01 = -MatOps2F.determinant(m1M10, m1M12, m1M20, m1M22);
		float dm02 =  MatOps2F.determinant(m1M10, m1M11, m1M20, m1M21);
		
		return MathUtils.fma(m1M00, dm00, MathUtils.fma(m1M01, dm01, m1M02 * dm02));
	}
	
	public static float[] invert(float[] m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];

		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];
		
		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float det = determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps2F.determinant(m1M11, m1M12, m1M21, m1M22) * invDet;
		float r01 = -MatOps2F.determinant(m1M10, m1M12, m1M20, m1M22) * invDet;
		float r02 =  MatOps2F.determinant(m1M10, m1M11, m1M20, m1M21) * invDet;
		
		float r10 = -MatOps2F.determinant(m1M01, m1M02, m1M21, m1M22) * invDet;
		float r11 =  MatOps2F.determinant(m1M00, m1M02, m1M20, m1M22) * invDet;
		float r12 = -MatOps2F.determinant(m1M00, m1M01, m1M20, m1M21) * invDet;
		
		float r20 =  MatOps2F.determinant(m1M01, m1M02, m1M11, m1M12) * invDet;
		float r21 = -MatOps2F.determinant(m1M00, m1M02, m1M10, m1M12) * invDet;
		float r22 =  MatOps2F.determinant(m1M00, m1M01, m1M10, m1M11) * invDet;

		res[0] = r00;
		res[1] = r10;
		res[2] = r20;
		
		res[3] = r01;
		res[4] = r11;
		res[5] = r21;
		
		res[6] = r02;
		res[7] = r12;
		res[8] = r22;

		return res;
	}
	
	public static float[] invert(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22, @ExtractionParam float[] res)
	{
		float det = determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float r00 =  MatOps2F.determinant(m1M11, m1M12, m1M21, m1M22) * invDet;
		float r01 = -MatOps2F.determinant(m1M10, m1M12, m1M20, m1M22) * invDet;
		float r02 =  MatOps2F.determinant(m1M10, m1M11, m1M20, m1M21) * invDet;
		
		float r10 = -MatOps2F.determinant(m1M01, m1M02, m1M21, m1M22) * invDet;
		float r11 =  MatOps2F.determinant(m1M00, m1M02, m1M20, m1M22) * invDet;
		float r12 = -MatOps2F.determinant(m1M00, m1M01, m1M20, m1M21) * invDet;
		
		float r20 =  MatOps2F.determinant(m1M01, m1M02, m1M11, m1M12) * invDet;
		float r21 = -MatOps2F.determinant(m1M00, m1M02, m1M10, m1M12) * invDet;
		float r22 =  MatOps2F.determinant(m1M00, m1M01, m1M10, m1M11) * invDet;

		res[0] = r00;
		res[1] = r10;
		res[2] = r20;
		
		res[3] = r01;
		res[4] = r11;
		res[5] = r21;
		
		res[6] = r02;
		res[7] = r12;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] invertAssign(float[] m1)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];

		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];
		
		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];

		float det = determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps2F.determinant(m1M11, m1M12, m1M21, m1M22) * invDet;
		float r01 = -MatOps2F.determinant(m1M10, m1M12, m1M20, m1M22) * invDet;
		float r02 =  MatOps2F.determinant(m1M10, m1M11, m1M20, m1M21) * invDet;
		
		float r10 = -MatOps2F.determinant(m1M01, m1M02, m1M21, m1M22) * invDet;
		float r11 =  MatOps2F.determinant(m1M00, m1M02, m1M20, m1M22) * invDet;
		float r12 = -MatOps2F.determinant(m1M00, m1M01, m1M20, m1M21) * invDet;
		
		float r20 =  MatOps2F.determinant(m1M01, m1M02, m1M11, m1M12) * invDet;
		float r21 = -MatOps2F.determinant(m1M00, m1M02, m1M10, m1M12) * invDet;
		float r22 =  MatOps2F.determinant(m1M00, m1M01, m1M10, m1M11) * invDet;

		m1[0] = r00;
		m1[1] = r10;
		m1[2] = r20;
		
		m1[3] = r01;
		m1[4] = r11;
		m1[5] = r21;
		
		m1[6] = r02;
		m1[7] = r12;
		m1[8] = r22;

		return m1;
	}
	
	public static float[] transpose(float[] m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];

		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];
		
		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		res[0] = m1M00;
		res[1] = m1M10;
		res[2] = m1M20;
		
		res[3] = m1M01;
		res[4] = m1M11;
		res[5] = m1M21;
		
		res[6] = m1M02;
		res[7] = m1M12;
		res[8] = m1M22;
		
		return res;
	}
	
	public static float[] transpose(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22, @ExtractionParam float[] res)
	{
		res[0] = m1M00;
		res[1] = m1M10;
		res[2] = m1M20;
		
		res[3] = m1M01;
		res[4] = m1M11;
		res[5] = m1M21;
		
		res[6] = m1M02;
		res[7] = m1M12;
		res[8] = m1M22;
		
		return res;
	}
	
	public static float trace(float[] m1)
	{
		return m1[0] + m1[4] + m1[8];
	}
	
	public static float trace(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22)
	{
		return m1M00 + m1M11 + m1M22;
	}
	
	public static float[] mul(float[] m1, float[] m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];

		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		
		float m2M10 = m2[3];
		float m2M11 = m2[4];
		float m2M12 = m2[5];

		float m2M20 = m2[6];
		float m2M21 = m2[7];
		float m2M22 = m2[8];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, m1M02 * m2M20));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, m1M02 * m2M21));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, m1M02 * m2M22));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, m1M12 * m2M20));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, m1M12 * m2M21));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, m1M12 * m2M22));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, m1M22 * m2M20));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, m1M22 * m2M21));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, m1M22 * m2M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] mul(float[] m1, float m2M00, float m2M01, float m2M02, float m2M10, float m2M11, float m2M12, float m2M20, float m2M21, float m2M22, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];
		
		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, m1M02 * m2M20));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, m1M02 * m2M21));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, m1M02 * m2M22));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, m1M12 * m2M20));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, m1M12 * m2M21));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, m1M12 * m2M22));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, m1M22 * m2M20));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, m1M22 * m2M21));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, m1M22 * m2M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] mul(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22, float[] m2, @ExtractionParam float[] res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		
		float m2M10 = m2[3];
		float m2M11 = m2[4];
		float m2M12 = m2[5];
		
		float m2M20 = m2[6];
		float m2M21 = m2[7];
		float m2M22 = m2[8];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, m1M02 * m2M20));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, m1M02 * m2M21));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, m1M02 * m2M22));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, m1M12 * m2M20));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, m1M12 * m2M21));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, m1M12 * m2M22));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, m1M22 * m2M20));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, m1M22 * m2M21));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, m1M22 * m2M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] mul(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22, float m2M00, float m2M01, float m2M02, float m2M10, float m2M11, float m2M12, float m2M20, float m2M21, float m2M22, @ExtractionParam float[] res)
	{
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, m1M02 * m2M20));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, m1M02 * m2M21));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, m1M02 * m2M22));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, m1M12 * m2M20));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, m1M12 * m2M21));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, m1M12 * m2M22));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, m1M22 * m2M20));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, m1M22 * m2M21));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, m1M22 * m2M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] m1, float[] m2)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];

		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		
		float m2M10 = m2[3];
		float m2M11 = m2[4];
		float m2M12 = m2[5];

		float m2M20 = m2[6];
		float m2M21 = m2[7];
		float m2M22 = m2[8];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, m1M02 * m2M20));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, m1M02 * m2M21));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, m1M02 * m2M22));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, m1M12 * m2M20));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, m1M12 * m2M21));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, m1M12 * m2M22));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, m1M22 * m2M20));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, m1M22 * m2M21));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, m1M22 * m2M22));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		
		m1[3] = r10;
		m1[4] = r11;
		m1[5] = r12;
		
		m1[6] = r20;
		m1[7] = r21;
		m1[8] = r22;
		
		return m1;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] m1, float m2M00, float m2M01, float m2M02, float m2M10, float m2M11, float m2M12, float m2M20, float m2M21, float m2M22)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];

		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, m1M02 * m2M20));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, m1M02 * m2M21));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, m1M02 * m2M22));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, m1M12 * m2M20));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, m1M12 * m2M21));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, m1M12 * m2M22));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, m1M22 * m2M20));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, m1M22 * m2M21));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, m1M22 * m2M22));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		
		m1[3] = r10;
		m1[4] = r11;
		m1[5] = r12;
		
		m1[6] = r20;
		m1[7] = r21;
		m1[8] = r22;
		
		return m1;
	}
	
	public static float[] revMul(float[] m1, float m2[], @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];

		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		
		float m2M10 = m2[3];
		float m2M11 = m2[4];
		float m2M12 = m2[5];

		float m2M20 = m2[6];
		float m2M21 = m2[7];
		float m2M22 = m2[8];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, m2M02 * m1M20));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, m2M02 * m1M21));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, m2M02 * m1M22));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, m2M12 * m1M20));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, m2M12 * m1M21));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, m2M12 * m1M22));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, m2M22 * m1M20));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, m2M22 * m1M21));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, m2M22 * m1M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] revMul(float[] m1, float m2M00, float m2M01, float m2M02, float m2M10, float m2M11, float m2M12, float m2M20, float m2M21, float m2M22, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];

		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, m2M02 * m1M20));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, m2M02 * m1M21));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, m2M02 * m1M22));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, m2M12 * m1M20));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, m2M12 * m1M21));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, m2M12 * m1M22));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, m2M22 * m1M20));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, m2M22 * m1M21));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, m2M22 * m1M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] revMul(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22, float m2[], @ExtractionParam float[] res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		
		float m2M10 = m2[3];
		float m2M11 = m2[4];
		float m2M12 = m2[5];

		float m2M20 = m2[6];
		float m2M21 = m2[7];
		float m2M22 = m2[8];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, m2M02 * m1M20));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, m2M02 * m1M21));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, m2M02 * m1M22));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, m2M12 * m1M20));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, m2M12 * m1M21));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, m2M12 * m1M22));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, m2M22 * m1M20));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, m2M22 * m1M21));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, m2M22 * m1M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] revMul(float m1M00, float m1M01, float m1M02, float m1M10, float m1M11, float m1M12, float m1M20, float m1M21, float m1M22, float m2M00, float m2M01, float m2M02, float m2M10, float m2M11, float m2M12, float m2M20, float m2M21, float m2M22, @ExtractionParam float[] res)
	{	
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, m2M02 * m1M20));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, m2M02 * m1M21));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, m2M02 * m1M22));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, m2M12 * m1M20));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, m2M12 * m1M21));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, m2M12 * m1M22));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, m2M22 * m1M20));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, m2M22 * m1M21));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, m2M22 * m1M22));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		
		res[3] = r10;
		res[4] = r11;
		res[5] = r12;
		
		res[6] = r20;
		res[7] = r21;
		res[8] = r22;
		
		return res;
	}
	
	public static float[] revMulAssign(@ExtractionParam float[] m1, float m2[])
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];

		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		
		float m2M10 = m2[3];
		float m2M11 = m2[4];
		float m2M12 = m2[5];

		float m2M20 = m2[6];
		float m2M21 = m2[7];
		float m2M22 = m2[8];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, m2M02 * m1M20));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, m2M02 * m1M21));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, m2M02 * m1M22));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, m2M12 * m1M20));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, m2M12 * m1M21));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, m2M12 * m1M22));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, m2M22 * m1M20));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, m2M22 * m1M21));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, m2M22 * m1M22));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		
		m1[3] = r10;
		m1[4] = r11;
		m1[5] = r12;
		
		m1[6] = r20;
		m1[7] = r21;
		m1[8] = r22;
		
		return m1;
	}
	
	public static float[] revMulAssign(@ExtractionParam float[] m1, float m2M00, float m2M01, float m2M02, float m2M10, float m2M11, float m2M12, float m2M20, float m2M21, float m2M22)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		
		float m1M10 = m1[3];
		float m1M11 = m1[4];
		float m1M12 = m1[5];

		float m1M20 = m1[6];
		float m1M21 = m1[7];
		float m1M22 = m1[8];
		
		float r00 = MathUtils.fma(m2M00, m1M00, MathUtils.fma(m2M01, m1M10, m2M02 * m1M20));
		float r01 = MathUtils.fma(m2M00, m1M01, MathUtils.fma(m2M01, m1M11, m2M02 * m1M21));
		float r02 = MathUtils.fma(m2M00, m1M02, MathUtils.fma(m2M01, m1M12, m2M02 * m1M22));
		
		float r10 = MathUtils.fma(m2M10, m1M00, MathUtils.fma(m2M11, m1M10, m2M12 * m1M20));
		float r11 = MathUtils.fma(m2M10, m1M01, MathUtils.fma(m2M11, m1M11, m2M12 * m1M21));
		float r12 = MathUtils.fma(m2M10, m1M02, MathUtils.fma(m2M11, m1M12, m2M12 * m1M22));
		
		float r20 = MathUtils.fma(m2M20, m1M00, MathUtils.fma(m2M21, m1M10, m2M22 * m1M20));
		float r21 = MathUtils.fma(m2M20, m1M01, MathUtils.fma(m2M21, m1M11, m2M22 * m1M21));
		float r22 = MathUtils.fma(m2M20, m1M02, MathUtils.fma(m2M21, m1M12, m2M22 * m1M22));
		
		m1[0] = r00;
		m1[1] = r01;
		m1[2] = r02;
		
		m1[3] = r10;
		m1[4] = r11;
		m1[5] = r12;
		
		m1[6] = r20;
		m1[7] = r21;
		m1[8] = r22;
		
		return m1;
	}
	
}
