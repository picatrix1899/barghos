package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.math.MathUtils;

public class MatUtils3F
{
	public static float[] setCol0(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v0;
		res[1] = v1;
		res[2] = v2;
		
		return res;
	}
	
	public static float[] setCol1(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[3] = v0;
		res[4] = v1;
		res[5] = v2;
		
		return res;
	}
	
	public static float[] setCol2(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[6] = v0;
		res[7] = v1;
		res[8] = v2;
		
		return res;
	}
	
	public static float[] setRow0(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v0;
		res[3] = v1;
		res[6] = v2;
		
		return res;
	}
	
	public static float[] setRow1(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[1] = v0;
		res[4] = v1;
		res[7] = v2;
		
		return res;
	}
	
	public static float[] setRow2(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[2] = v0;
		res[5] = v1;
		res[8] = v2;
		
		return res;
	}
	
	public static float[] setCol(int col, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		int b = col * 3;
		
		res[b] = v0;
		res[b + 1] = v1;
		res[b + 2] = v2;
		
		return res;
	}
	
	public static float[] setRow(int row, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		res[row] = v0;
		res[3 + row] = v1;
		res[6 + row] = v2;
		
		return res;
	}
	
	public static float[] setCell(int col, int row, float v, @ExtractionParam float[] res)
	{
		res[col * 3 + row] = v;
		
		return res;
	}
	
	public static float det(float[] m)
	{
		float m00 = m[0];
		float m01 = m[1];
		float m02 = m[2];
		
		float m10 = m[3];
		float m11 = m[4];
		float m12 = m[5];
		
		float m20 = m[6];
		float m21 = m[7];
		float m22 = m[8];
		
		float dm00 =  MatUtils2F.det(m11, m12, m21, m22);
		float dm01 = -MatUtils2F.det(m10, m12, m20, m22);
		float dm02 =  MatUtils2F.det(m10, m11, m20, m21);
		
		return MathUtils.fma(m00, dm00, MathUtils.fma(m01, dm01, m02 * dm02));
	}
	
	public static float det(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22)
	{
		float dm00 =  MatUtils2F.det(m11, m12, m21, m22);
		float dm01 = -MatUtils2F.det(m10, m12, m20, m22);
		float dm02 =  MatUtils2F.det(m10, m11, m20, m21);
		
		return MathUtils.fma(m00, dm00, MathUtils.fma(m01, dm01, m02 * dm02));
	}
}
