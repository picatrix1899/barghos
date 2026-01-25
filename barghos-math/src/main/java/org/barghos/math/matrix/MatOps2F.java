package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public class MatOps2F
{
	
	private MatOps2F() { }
	
	public static float[] getCol(int col, float[] m1, @ExtractionParam float[] res)
	{
		int c = col * 2;
		
		res[0] = m1[c];
		res[1] = m1[c+1];
		
		return res;
	}
	
	public static float[] getCol0(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[0];
		res[1] = m1[1];
		
		return res;
	}
	
	public static float[] getCol1(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[2];
		res[1] = m1[3];
		
		return res;
	}
	
	public static float[] getRow(int row, float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[row];
		res[1] = m1[2+row];
		
		return res;
	}
	
	public static float[] getRow0(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[0];
		res[1] = m1[2];
		
		return res;
	}
	
	public static float[] getRow1(float[] m1, @ExtractionParam float[] res)
	{
		res[0] = m1[1];
		res[1] = m1[3];
		
		return res;
	}
	
	public static float[] setCol(int col, float[] v1, @ExtractionParam float[] res)
	{
		int c = col * 2;
		
		res[c] = v1[0];
		res[c+1] = v1[1];
		
		return res;
	}
	
	public static float[] setCol(int col, float v1, @ExtractionParam float[] res)
	{
		int c = col * 2;
		
		res[c] = v1;
		res[c+1] = v1;
		
		return res;
	}
	
	public static float[] setCol(int col, float v1X, float v1Y, @ExtractionParam float[] res)
	{
		int c = col * 2;
		
		res[c] = v1X;
		res[c+1] = v1Y;
		
		return res;
	}
	
	public static float[] setCol0(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[1] = v1[1];
		
		return res;
	}
	
	public static float[] setCol0(float v1, @ExtractionParam float[] res)
	{
		res[0] = v1;
		res[1] = v1;
		
		return res;
	}
	
	public static float[] setCol0(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = v1Y;
		
		return res;
	}
	
	public static float[] setCol1(float[] v1, @ExtractionParam float[] res)
	{
		res[2] = v1[0];
		res[3] = v1[1];
		
		return res;
	}
	
	public static float[] setCol1(float v1, @ExtractionParam float[] res)
	{
		res[2] = v1;
		res[3] = v1;
		
		return res;
	}
	
	public static float[] setCol1(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[2] = v1X;
		res[3] = v1Y;
		
		return res;
	}
	
	public static float[] setRow(int row, float[] v1, @ExtractionParam float[] res)
	{
		res[row] = v1[0];
		res[2+row] = v1[1];
		
		return res;
	}
	
	public static float[] setRow(int row, float v1, @ExtractionParam float[] res)
	{
		res[row] = v1;
		res[2+row] = v1;
		
		return res;
	}
	
	public static float[] setRow(int row, float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[row] = v1X;
		res[2+row] = v1Y;
		
		return res;
	}
	
	public static float[] setRow0(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = v1[0];
		res[2] = v1[1];

		return res;
	}
	
	public static float[] setRow0(float v1, @ExtractionParam float[] res)
	{
		res[0] = v1;
		res[2] = v1;

		return res;
	}
	
	public static float[] setRow0(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[2] = v1Y;

		return res;
	}
	
	public static float[] setRow1(float[] v1, @ExtractionParam float[] res)
	{
		res[1] = v1[0];
		res[3] = v1[1];
		
		return res;
	}
	
	public static float[] setRow1(float v1, @ExtractionParam float[] res)
	{
		res[1] = v1;
		res[3] = v1;
		
		return res;
	}
	
	public static float[] setRow1(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[1] = v1X;
		res[3] = v1Y;
		
		return res;
	}
	
	public static float[] setCell(int col, int row, float v1, @ExtractionParam float[] res)
	{
		res[col*2+row] = v1;
		
		return res;
	}
	
	public static float determinant(float[] m1)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		return MathUtils.fma(m1M00, m1M11, m1M01 * -m1M10);
	}
	
	public static float determinant(float m1M00, float m1M01, float m1M10, float m1M11)
	{
		return MathUtils.fma(m1M00, m1M11, m1M01 * -m1M10);
	}
	
	public static float[] invert(float[] m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];

		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float det = determinant(m1M00, m1M01, m1M10, m1M11);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  m1M11 * invDet;
		float r01 = -m1M10 * invDet;
		
		float r10 = -m1M01 * invDet;
		float r11 =  m1M00 * invDet;

		res[0] = r00;
		res[1] = r10;
		
		res[2] = r01;
		res[3] = r11;

		return res;
	}
	
	public static float[] invert(float m1M00, float m1M01, float m1M10, float m1M11, @ExtractionParam float[] res)
	{
		float det = determinant(m1M00, m1M01, m1M10, m1M11);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float r00 =  m1M11 * invDet;
		float r01 = -m1M10 * invDet;
		
		float r10 = -m1M01 * invDet;
		float r11 =  m1M00 * invDet;

		res[0] = r00;
		res[1] = r10;
		
		res[2] = r01;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] invertAssign(float[] m1)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];

		float m1M10 = m1[2];
		float m1M11 = m1[3];

		float det = determinant(m1M00, m1M01, m1M10, m1M11);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  m1M11 * invDet;
		float r01 = -m1M10 * invDet;
		
		float r10 = -m1M01 * invDet;
		float r11 =  m1M00 * invDet;

		m1[0] = r00;
		m1[1] = r10;
		
		m1[2] = r01;
		m1[3] = r11;

		return m1;
	}
	
	public static float[] transpose(float[] m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];

		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		res[0] = m1M00;
		res[1] = m1M10;
		
		res[2] = m1M01;
		res[3] = m1M11;
		
		return res;
	}
	
	public static float[] transpose(float m1M00, float m1M01, float m1M10, float m1M11, @ExtractionParam float[] res)
	{
		res[0] = m1M00;
		res[1] = m1M10;
		
		res[2] = m1M01;
		res[3] = m1M11;
		
		return res;
	}
	
	public static float trace(float[] m1)
	{
		return m1[0] + m1[3];
	}
	
	public static float trace(float m1M00, float m1M01, float m1M10, float m1M11)
	{
		return m1M00 + m1M11;
	}
	
	public static float[] mul(float[] m1, float[] m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		
		float m2M10 = m2[2];
		float m2M11 = m2[3];
		
		float r00 = Math.fma(m1M00, m2M00, m1M01 * m2M10);
		float r01 = Math.fma(m1M00, m2M01, m1M01 * m2M11);
		
		float r10 = Math.fma(m1M10, m2M00, m1M11 * m2M10);
		float r11 = Math.fma(m1M10, m2M01, m1M11 * m2M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] mul(float[] m1, float m2M00, float m2M01, float m2M10, float m2M11, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float r00 = Math.fma(m1M00, m2M00, m1M01 * m2M10);
		float r01 = Math.fma(m1M00, m2M01, m1M01 * m2M11);
		
		float r10 = Math.fma(m1M10, m2M00, m1M11 * m2M10);
		float r11 = Math.fma(m1M10, m2M01, m1M11 * m2M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] mul(float m1M00, float m1M01, float m1M10, float m1M11, float[] m2, @ExtractionParam float[] res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		
		float m2M10 = m2[2];
		float m2M11 = m2[3];
		
		float r00 = Math.fma(m1M00, m2M00, m1M01 * m2M10);
		float r01 = Math.fma(m1M00, m2M01, m1M01 *  m2M11);
		
		float r10 = Math.fma(m1M10, m2M00, m1M11 * m2M10);
		float r11 = Math.fma(m1M10, m2M01, m1M11 * m2M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] mul(float m1M00, float m1M01, float m1M10, float m1M11, float m2M00, float m2M01, float m2M10, float m2M11, @ExtractionParam float[] res)
	{
		float r00 = Math.fma(m1M00, m2M00, m1M01 * m2M10);
		float r01 = Math.fma(m1M00, m2M01, m1M01 * m2M11);
		
		float r10 = Math.fma(m1M10, m2M00, m1M11 * m2M10);
		float r11 = Math.fma(m1M10, m2M01, m1M11 * m2M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] m1, float[] m2)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		
		float m2M10 = m2[2];
		float m2M11 = m2[3];
		
		float r00 = Math.fma(m1M00, m2M00, m1M01 * m2M10);
		float r01 = Math.fma(m1M00, m2M01, m1M01 * m2M11);
		
		float r10 = Math.fma(m1M10, m2M00, m1M11 * m2M10);
		float r11 = Math.fma(m1M10, m2M01, m1M11 * m2M11);
		
		m1[0] = r00;
		m1[1] = r01;
		
		m1[2] = r10;
		m1[3] = r11;
		
		return m1;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] m1, float m2M00, float m2M01, float m2M10, float m2M11)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float r00 = Math.fma(m1M00, m2M00, m1M01 * m2M10);
		float r01 = Math.fma(m1M00, m2M01, m1M01 * m2M11);
		
		float r10 = Math.fma(m1M10, m2M00, m1M11 * m2M10);
		float r11 = Math.fma(m1M10, m2M01, m1M11 * m2M11);
		
		m1[0] = r00;
		m1[1] = r01;
		
		m1[2] = r10;
		m1[3] = r11;
		
		return m1;
	}
	
	public static float[] revMul(float[] m1, float m2[], @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		
		float m2M10 = m2[2];
		float m2M11 = m2[3];
		
		float r00 = MathUtils.fma(m2M00, m1M00, m2M01 * m1M10);
		float r01 = MathUtils.fma(m2M00, m1M01, m2M01 * m1M11);
		
		float r10 = MathUtils.fma(m2M10, m1M00, m2M11 * m1M10);
		float r11 = MathUtils.fma(m2M10, m1M01, m2M11 * m1M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] revMul(float[] m1, float m2M00, float m2M01, float m2M10, float m2M11, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float r00 = MathUtils.fma(m2M00, m1M00, m2M01 * m1M10);
		float r01 = MathUtils.fma(m2M00, m1M01, m2M01 * m1M11);
		
		float r10 = MathUtils.fma(m2M10, m1M00, m2M11 * m1M10);
		float r11 = MathUtils.fma(m2M10, m1M01, m2M11 * m1M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] revMul(float m1M00, float m1M01, float m1M10, float m1M11, float m2[], @ExtractionParam float[] res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		
		float m2M10 = m2[2];
		float m2M11 = m2[3];
		
		float r00 = MathUtils.fma(m2M00, m1M00, m2M01 * m1M10);
		float r01 = MathUtils.fma(m2M00, m1M01, m2M01 * m1M11);
		
		float r10 = MathUtils.fma(m2M10, m1M00, m2M11 * m1M10);
		float r11 = MathUtils.fma(m2M10, m1M01, m2M11 * m1M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] revMul(float m1M00, float m1M01, float m1M10, float m1M11, float m2M00, float m2M01, float m2M10, float m2M11, @ExtractionParam float[] res)
	{	
		float r00 = MathUtils.fma(m2M00, m1M00, m2M01 * m1M10);
		float r01 = MathUtils.fma(m2M00, m1M01, m2M01 * m1M11);
		
		float r10 = MathUtils.fma(m2M10, m1M00, m2M11 * m1M10);
		float r11 = MathUtils.fma(m2M10, m1M01, m2M11 * m1M11);
		
		res[0] = r00;
		res[1] = r01;
		
		res[2] = r10;
		res[3] = r11;
		
		return res;
	}
	
	public static float[] revMulAssign(@ExtractionParam float[] m1, float m2[])
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		
		float m2M10 = m2[2];
		float m2M11 = m2[3];
		
		float r00 = MathUtils.fma(m2M00, m1M00, m2M01 * m1M10);
		float r01 = MathUtils.fma(m2M00, m1M01, m2M01 * m1M11);
		
		float r10 = MathUtils.fma(m2M10, m1M00, m2M11 * m1M10);
		float r11 = MathUtils.fma(m2M10, m1M01, m2M11 * m1M11);
		
		m1[0] = r00;
		m1[1] = r01;
		
		m1[2] = r10;
		m1[3] = r11;
		
		return m1;
	}
	
	public static float[] revMulAssign(@ExtractionParam float[] m1, float m2M00, float m2M01, float m2M10, float m2M11)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		
		float m1M10 = m1[2];
		float m1M11 = m1[3];
		
		float r00 = MathUtils.fma(m2M00, m1M00, m2M01 * m1M10);
		float r01 = MathUtils.fma(m2M00, m1M01, m2M01 * m1M11);
		
		float r10 = MathUtils.fma(m2M10, m1M00, m2M11 * m1M10);
		float r11 = MathUtils.fma(m2M10, m1M01, m2M11 * m1M11);
		
		m1[0] = r00;
		m1[1] = r01;
		
		m1[2] = r10;
		m1[3] = r11;
		
		return m1;
	}
}
