package org.barghos.impl.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public class MatUtils2F
{
	public static float[] setCol0(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = v0;
		res[1] = v1;
		
		return res;
	}
	
	public static float[] setCol1(float v0, float v1, @ExtractionParam float[] res)
	{
		res[2] = v0;
		res[3] = v1;
		
		return res;
	}
	
	public static float[] setRow0(float v0, float v1, @ExtractionParam float[] res)
	{
		res[0] = v0;
		res[2] = v1;

		return res;
	}
	
	public static float[] setRow1(float v0, float v1, @ExtractionParam float[] res)
	{
		res[1] = v0;
		res[3] = v1;
		
		return res;
	}
	
	public static float[] setCol(int col, float v0, float v1, @ExtractionParam float[] res)
	{
		int b = col * 2;
		
		res[b] = v0;
		res[b + 1] = v1;
		
		return res;
	}
	
	public static float[] setRow(int row, float v0, float v1, @ExtractionParam float[] res)
	{
		res[row] = v0;
		res[2 + row] = v1;
		
		return res;
	}
	
	public static float[] setCell(int col, int row, float v, @ExtractionParam float[] res)
	{
		res[col * 2 + row] = v;
		
		return res;
	}
	
	public static float det(float[] m)
	{
		float m00 = m[0];
		float m01 = m[1];
		float m10 = m[2];
		float m11 = m[3];
		
		return MathUtils.fma(m00, m11, m01 * -m10);
	}
	
	public static float det(float m00, float m01, float m10, float m11)
	{
		return MathUtils.fma(m00, m11, m01 * -m10);
	}
}
