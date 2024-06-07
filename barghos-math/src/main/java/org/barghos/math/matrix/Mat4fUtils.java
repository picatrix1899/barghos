package org.barghos.math.matrix;

import org.barghos.core.function.FloatBiFunction;
import org.barghos.core.function.FloatTetraFunction;
import org.barghos.core.function.Function;
import org.barghos.core.tuple.Tup2fC;
import org.barghos.core.tuple.Tup2fR;
import org.barghos.core.tuple.Tup4fC;
import org.barghos.core.tuple.Tup4fR;

/**
 * This class provides utilities for working with 2x2 float matrices.
 */
public class Mat4fUtils
{
	public static float determinant(SimpleMat4fR m)
	{
		return determinant(m.toArray());
	}
	
	public static float determinant(float[][] m)
	{
		return determinant(
				m[0][0], m[0][1], m[0][2], m[0][3],
				m[1][0], m[1][1], m[1][2], m[1][3],
				m[2][0], m[2][1], m[2][2], m[2][3],
				m[3][0], m[3][1], m[3][2], m[3][3]);
	}
	
	public static float determinant(
			float m0x, float m0y, float m0z, float m0w,
			float m1x, float m1y, float m1z, float m1w,
			float m2x, float m2y, float m2z, float m2w,
			float m3x, float m3y, float m3z, float m3w)
	{
		return	m0x * +Mat3fUtils.determinant(m1y, m1z, m1w, m2y, m2z, m2w, m3y, m3z, m3w) +
				m0y * -Mat3fUtils.determinant(m1x, m1z, m1w, m2x, m2z, m2w, m3x, m3z, m3w) +
				m0z * +Mat3fUtils.determinant(m1x, m1y, m1w, m2x, m2y, m2w, m3x, m3y, m3w) +
				m0w * -Mat3fUtils.determinant(m1x, m1y, m1z, m2x, m2y, m2z, m3x, m3y, m3z);
	}
	
	public static float[][] invert(SimpleMat4fR m, float[][] res)
	{
		return invert(m.toArray(), res);
	}
	
	public static float[][] invert(float[][] m, float[][] res)
	{
		float det = determinant(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		// first row
		float _m0x =  Mat3fUtils.determinant(m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
		float _m0y = -Mat3fUtils.determinant(m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
		float _m0z =  Mat3fUtils.determinant(m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
		float _m0w = -Mat3fUtils.determinant(m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
		// second row
		float _m1x = -Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
		float _m1y =  Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
		float _m1z = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
		float _m1w =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
		// third row
		float _m2x =  Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[3][1], m[3][2], m[3][3]);
		float _m2y = -Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[3][0], m[3][2], m[3][3]);
		float _m2z =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[3][0], m[3][1], m[3][3]);
		float _m2w = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[3][0], m[3][1], m[3][2]);
		// fourth row
		float _m3x = -Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3]);
		float _m3y =  Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3]);
		float _m3z = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3]);
		float _m3w =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2]);

		// transpose and divide by the determinant

		res[0][0] = _m0x * invDet;
		res[0][1] = _m1x * invDet;
		res[0][2] = _m2x * invDet;
		res[0][3] = _m3x * invDet;
		
		res[1][0] = _m0y * invDet;
		res[1][1] = _m1y * invDet;
		res[1][2] = _m2y * invDet;
		res[1][3] = _m3y * invDet;
		
		res[2][0] = _m0z * invDet;
		res[2][1] = _m1z * invDet;
		res[2][2] = _m2z * invDet;
		res[2][3] = _m3z * invDet;
		
		res[3][0] = _m0w * invDet;
		res[3][1] = _m1w * invDet;
		res[3][2] = _m2w * invDet;
		res[3][3] = _m3w * invDet;

		return res;
	}
	
	public static <T extends SimpleMat4fC> T invert(SimpleMat4fR m, T res)
	{
		return invert(m.toArray(), res);
	}
	
	public static <T extends SimpleMat4fC> T invert(float[][] m, T res)
	{
		float det = determinant(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		// first row
		float _m0x =  Mat3fUtils.determinant(m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
		float _m0y = -Mat3fUtils.determinant(m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
		float _m0z =  Mat3fUtils.determinant(m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
		float _m0w = -Mat3fUtils.determinant(m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
		// second row
		float _m1x = -Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
		float _m1y =  Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
		float _m1z = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
		float _m1w =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
		// third row
		float _m2x =  Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[3][1], m[3][2], m[3][3]);
		float _m2y = -Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[3][0], m[3][2], m[3][3]);
		float _m2z =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[3][0], m[3][1], m[3][3]);
		float _m2w = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[3][0], m[3][1], m[3][2]);
		// fourth row
		float _m3x = -Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3]);
		float _m3y =  Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3]);
		float _m3z = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3]);
		float _m3w =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2]);

		// transpose and divide by the determinant
		res.setRow(0, _m0x * invDet, _m1x * invDet, _m2x * invDet, _m3x * invDet);
		res.setRow(1, _m0y * invDet, _m1y * invDet, _m2y * invDet, _m3y * invDet);
		res.setRow(2, _m0z * invDet, _m1z * invDet, _m2z * invDet, _m3z * invDet);
		res.setRow(3, _m0w * invDet, _m1w * invDet, _m2w * invDet, _m3w * invDet);

		return res;
	}
	
	public static <T> T invertFunc(SimpleMat4fR m, Function<float[][],T> res)
	{
		return invertFunc(m.toArray(), res);
	}
	
	public static <T> T invertFunc(float[][] m, Function<float[][],T> res)
	{
		float det = determinant(m);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		// first row
		float _m0x =  Mat3fUtils.determinant(m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
		float _m0y = -Mat3fUtils.determinant(m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
		float _m0z =  Mat3fUtils.determinant(m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
		float _m0w = -Mat3fUtils.determinant(m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
		// second row
		float _m1x = -Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
		float _m1y =  Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
		float _m1z = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
		float _m1w =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
		// third row
		float _m2x =  Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[3][1], m[3][2], m[3][3]);
		float _m2y = -Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[3][0], m[3][2], m[3][3]);
		float _m2z =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[3][0], m[3][1], m[3][3]);
		float _m2w = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[3][0], m[3][1], m[3][2]);
		// fourth row
		float _m3x = -Mat3fUtils.determinant(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3]);
		float _m3y =  Mat3fUtils.determinant(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3]);
		float _m3z = -Mat3fUtils.determinant(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3]);
		float _m3w =  Mat3fUtils.determinant(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2]);

		// transpose and divide by the determinant
		float[][] r = new float[4][4];
		
		r[0][0] = _m0x * invDet;
		r[1][1] = _m1y * invDet;
		r[2][2] = _m2z * invDet;
		r[3][3] = _m3w * invDet;
		r[0][1] = _m1x * invDet;
		r[1][0] = _m0y * invDet;
		r[2][0] = _m0z * invDet;
		r[0][2] = _m2x * invDet;
		r[1][2] = _m2y * invDet;
		r[2][1] = _m1z * invDet;
		r[0][3] = _m3x * invDet;
		r[3][0] = _m0w * invDet;
		r[1][3] = _m3y * invDet;
		r[3][1] = _m1w * invDet;
		r[3][2] = _m2w * invDet;
		r[2][3] = _m3z * invDet;
		
		return res.apply(r);
	}
	
	public static float[][] transpose(SimpleMat4fR m, float[][] res)
	{
		return transpose(m.toArray(), res);
	}
	
	public static float[][] transpose(float[][] m, float[][] res)
	{
		float _m0x = m[0][0];
		float _m0y = m[0][1];
		float _m0z = m[0][2];
		float _m0w = m[0][3];
		
		float _m1x = m[1][0];
		float _m1y = m[1][1];
		float _m1z = m[1][2];
		float _m1w = m[1][3];
		
		float _m2x = m[2][0];
		float _m2y = m[2][1];
		float _m2z = m[2][2];
		float _m2w = m[2][3];
		
		float _m3x = m[3][0];
		float _m3y = m[3][1];
		float _m3z = m[3][2];
		float _m3w = m[3][3];
		
		res[0][0] = _m0x;
		res[0][1] = _m1x;
		res[0][2] = _m2x;
		res[0][3] = _m3x;
		
		res[1][0] = _m0y;
		res[1][1] = _m1y;
		res[1][2] = _m2y;
		res[1][3] = _m3y;
		
		res[2][0] = _m0z;
		res[2][1] = _m1z;
		res[2][2] = _m2z;
		res[2][3] = _m3z;
		
		res[3][0] = _m0w;
		res[3][1] = _m1w;
		res[3][2] = _m2w;
		res[3][3] = _m3w;
		
		return res;
	}
	
	public static <T extends SimpleMat4fC> T transpose(SimpleMat4fR m, T res)
	{
		return transpose(m.toArray(), res);
	}
	
	public static <T extends SimpleMat4fC> T transpose(float[][] m, T res)
	{
		res.setRow(0, m[0][0], m[1][0], m[2][0], m[3][0]);
		res.setRow(1, m[0][1], m[1][1], m[2][1], m[3][1]);
		res.setRow(2, m[0][2], m[1][2], m[2][2], m[3][2]);
		res.setRow(3, m[0][3], m[1][3], m[2][3], m[3][3]);
		
		return res;
	}
	
	public static <T> T transposeFunc(SimpleMat4fR m, Function<float[][],T> res)
	{
		return transposeFunc(m.toArray(), res);
	}
	
	public static <T> T transposeFunc(float[][] m, Function<float[][],T> res)
	{
		float[][] r = new float[4][4];
		
		r[0][0] = m[0][0];
		r[0][1] = m[1][0];
		r[0][2] = m[2][0];
		r[0][3] = m[3][0];
		
		r[1][0] = m[0][1];
		r[1][1] = m[1][1];
		r[1][2] = m[2][1];
		r[1][3] = m[3][1];
		
		r[2][0] = m[0][2];
		r[2][1] = m[1][2];
		r[2][2] = m[2][2];
		r[2][3] = m[3][2];
		
		r[3][0] = m[0][3];
		r[3][1] = m[1][3];
		r[3][2] = m[2][3];
		r[3][3] = m[3][3];
		
		return res.apply(r);
	}
	
	public static float trace(SimpleMat4fR m)
	{
		return trace(m.toArray());
	}
	
	public static float trace(float[][] m)
	{
		return m[0][0] + m[1][1] + m[2][2] + m[3][3];
	}
	
	public static float[][] mul(SimpleMat4fR a, SimpleMat4fR b, float[][] res)
	{
		return mul(a.toArray(), b.toArray(), res);
	}
	
	public static float[][] mul(SimpleMat4fR a, float[][] b, float[][] res)
	{
		return mul(a.toArray(), b, res);
	}
	
	public static float[][] mul(float[][] a, SimpleMat4fR b, float[][] res)
	{
		return mul(a, b.toArray(), res);
	}
	
	public static float[][] mul(float[][] a, float[][] b, float[][] res)
	{
		float[][] r = new float[4][4];
		
		for(int row = 0; row < 4; row++)
		{
			r[row][0] = a[row][0] * b[0][0] + a[row][1] * b[1][0] + a[row][2] * b[2][0] + a[row][3] * b[3][0];
			r[row][1] = a[row][0] * b[0][1] + a[row][1] * b[1][1] + a[row][2] * b[2][1] + a[row][3] * b[3][1];
			r[row][2] = a[row][0] * b[0][2] + a[row][1] * b[1][2] + a[row][2] * b[2][2] + a[row][3] * b[3][2];
			r[row][3] = a[row][0] * b[0][3] + a[row][1] * b[1][3] + a[row][2] * b[2][3] + a[row][3] * b[3][3];
		}
		
		for(int row = 0; row < 4; row++)
		{
			for(int column = 0; column < 4; column++)
			{
				res[row][column] = r[row][column];
			}
		}
		
		return res;
	}
	
	public static <T extends SimpleMat4fC> T mul(SimpleMat4fR a, SimpleMat4fR b, T res)
	{
		return mul(a.toArray(), b.toArray(), res);
	}
	
	public static <T extends SimpleMat4fC> T mul(SimpleMat4fR a, float[][] b, T res)
	{
		return mul(a.toArray(), b, res);
	}
	
	public static <T extends SimpleMat4fC> T mul(float[][] a, SimpleMat4fR b, T res)
	{
		return mul(a, b.toArray(), res);
	}
	
	public static <T extends SimpleMat4fC> T mul(float[][] a, float[][] b, T res)
	{
		float[][] r = new float[4][4];
		
		for(int row = 0; row < 4; row++)
		{
			r[row][0] = a[row][0] * b[0][0] + a[row][1] * b[1][0] + a[row][2] * b[2][0] + a[row][3] * b[3][0];
			r[row][1] = a[row][0] * b[0][1] + a[row][1] * b[1][1] + a[row][2] * b[2][1] + a[row][3] * b[3][1];
			r[row][2] = a[row][0] * b[0][2] + a[row][1] * b[1][2] + a[row][2] * b[2][2] + a[row][3] * b[3][2];
			r[row][3] = a[row][0] * b[0][3] + a[row][1] * b[1][3] + a[row][2] * b[2][3] + a[row][3] * b[3][3];
		}
		
		res.setArray(r);
		
		return res;
	}
	
	public static <T> T mulFunc(SimpleMat4fR a, SimpleMat4fR b, Function<float[][],T> res)
	{
		return mulFunc(a.toArray(), b.toArray(), res);
	}
	
	public static <T> T mulFunc(SimpleMat4fR a, float[][] b, Function<float[][],T> res)
	{
		return mulFunc(a.toArray(), b, res);
	}
	
	public static <T> T mulFunc(float[][] a, SimpleMat4fR b, Function<float[][],T> res)
	{
		return mulFunc(a, b.toArray(), res);
	}
	
	public static <T> T mulFunc(float[][] a, float[][] b, Function<float[][],T> res)
	{
		float[][] r = new float[4][4];
		
		for(int row = 0; row < 4; row++)
		{
			r[row][0] = a[row][0] * b[0][0] + a[row][1] * b[1][0] + a[row][2] * b[2][0] + a[row][3] * b[3][0];
			r[row][1] = a[row][0] * b[0][1] + a[row][1] * b[1][1] + a[row][2] * b[2][1] + a[row][3] * b[3][1];
			r[row][2] = a[row][0] * b[0][2] + a[row][1] * b[1][2] + a[row][2] * b[2][2] + a[row][3] * b[3][2];
			r[row][3] = a[row][0] * b[0][3] + a[row][1] * b[1][3] + a[row][2] * b[2][3] + a[row][3] * b[3][3];
		}
		
		return res.apply(r);
	}

	public static float[] transform2d(Tup2fR v, boolean useZ, boolean useW, SimpleMat4fR m, float[] res)
	{
		return transform2d(v.v0(), v.v1(), useZ, useW, m, res);
	}
	
	public static float[] transform2d(Tup2fR v, boolean useZ, boolean useW, float[][] m, float[] res)
	{
		return transform2d(v.v0(), v.v1(), useZ, useW, m, res);
	}
	
	public static float[] transform2d(float[] v, boolean useZ, boolean useW, SimpleMat4fR m, float[] res)
	{
		return transform2d(v[0], v[1], useZ, useW, m.toArray(), res);
	}
	
	public static float[] transform2d(float[] v, boolean useZ, boolean useW, float[][] m, float[] res)
	{
		return transform2d(v[0], v[1], useZ, useW, m, res);
	}
	
	public static float[] transform2d(float vX, float vY, boolean useZ, boolean useW, SimpleMat4fR m, float[] res)
	{
		return transform2d(vX, vY, useZ, useW, m.toArray(), res);
	}
	
	public static float[] transform2d(float vX, float vY, boolean useZ, boolean useW, float[][] m, float[] res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY;
		float y_ = m[1][0] * vX + m[1][1] * vY;

		if(useZ)
		{
			x_ += m[0][2];
			y_ += m[1][2];
		}
		
		if(useW)
		{
			x_ += m[0][3];
			y_ += m[1][3];
		}
		
		res[0] = x_;
		res[1] = y_;

		return res;
	}
	
	public static <T extends Tup2fC> T transform2d(Tup2fR v, boolean useZ, boolean useW, SimpleMat4fR m, T res)
	{
		return transform2d(v.v0(), v.v1(), useZ, useW, m.toArray(), res);
	}
	
	public static <T extends Tup2fC> T transform2d(Tup2fR v, boolean useZ, boolean useW, float[][] m, T res)
	{
		return transform2d(v.v0(), v.v1(), useZ, useW, m, res);
	}
	
	public static <T extends Tup2fC> T transform2d(float[] v, boolean useZ, boolean useW, SimpleMat4fR m, T res)
	{
		return transform2d(v[0], v[1], useZ, useW, m.toArray(), res);
	}
	
	public static <T extends Tup2fC> T transform2d(float[] v, boolean useZ, boolean useW, float[][] m, T res)
	{
		return transform2d(v[0], v[1], useZ, useW, m, res);
	}
	
	public static <T extends Tup2fC> T transform2d(float vX, float vY, boolean useZ, boolean useW, SimpleMat4fR m, T res)
	{
		return transform2d(vX, vY, useZ, useW, m.toArray(), res);
	}
	
	public static <T extends Tup2fC> T transform2d(float vX, float vY, boolean useZ, boolean useW, float[][] m, T res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY;
		float y_ = m[1][0] * vX + m[1][1] * vY;

		if(useZ)
		{
			x_ += m[0][2];
			y_ += m[1][2];
		}
		
		if(useW)
		{
			x_ += m[0][3];
			y_ += m[1][3];
		}
		
		res.set(x_, y_);

		return res;
	}

	public static <T> T transform2dFunc(Tup2fR v, boolean useZ, boolean useW, SimpleMat4fR m, FloatBiFunction<T> res)
	{
		return transform2dFunc(v.v0(), v.v1(), useZ, useW, m.toArray(), res);
	}
	
	public static <T> T transform2dFunc(Tup2fR v, boolean useZ, boolean useW, float[][] m, FloatBiFunction<T> res)
	{
		return transform2dFunc(v.v0(), v.v1(), useZ, useW, m, res);
	}
	
	public static <T> T transform2dFunc(float[] v, boolean useZ, boolean useW, SimpleMat4fR m, FloatBiFunction<T> res)
	{
		return transform2dFunc(v[0], v[1], useZ, useW, m.toArray(), res);
	}
	
	public static <T> T transform2dFunc(float[] v, boolean useZ, boolean useW, float[][] m, FloatBiFunction<T> res)
	{
		return transform2dFunc(v[0], v[1], useZ, useW, m, res);
	}
	
	public static <T> T transform2dFunc(float vX, float vY, boolean useZ, boolean useW, SimpleMat4fR m, FloatBiFunction<T> res)
	{
		return transform2dFunc(vX, vY, useZ, useW, m.toArray(), res);
	}
	
	public static <T> T transform2dFunc(float vX, float vY, boolean useZ, boolean useW, float[][] m, FloatBiFunction<T> res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY;
		float y_ = m[1][0] * vX + m[1][1] * vY;

		if(useZ)
		{
			x_ += m[0][2];
			y_ += m[1][2];
		}
		
		if(useW)
		{
			x_ += m[0][3];
			y_ += m[1][3];
		}

		return res.apply(x_, y_);
	}
	
	public static float[] transform4d(Tup4fR v, SimpleMat4fR m, float[] res)
	{
		return transform4d(v.v0(), v.v1(), v.v2(), v.v3(), m.toArray(), res);
	}

	public static float[] transform4d(Tup4fR v, float[][] m, float[] res)
	{
		return transform4d(v.v0(), v.v1(), v.v2(), v.v3(), m, res); 
	}
	
	public static float[] transform4d(float[] v, SimpleMat4fR m, float[] res)
	{
		return transform4d(v[0], v[1], v[2], v[3], m.toArray(), res);
	}

	public static float[] transform4d(float[] v, float[][] m, float[] res)
	{
		return transform4d(v[0], v[1], v[2], v[3], m, res); 
	}
	
	public static float[] transform4d(float vX, float vY, float vZ, float vW, SimpleMat4fR m, float[] res)
	{
		return transform4d(vX, vY, vZ, vW, m.toArray(), res);
	}

	public static float[] transform4d(float vX, float vY, float vZ, float vW, float[][] m, float[] res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY + m[0][2] * vZ + m[0][3] * vW;
		float y_ = m[1][0] * vX + m[1][1] * vY + m[1][2] * vZ + m[1][3] * vW;
		float z_ = m[2][0] * vX + m[2][1] * vY + m[2][2] * vZ + m[2][3] * vW;
		float w_ = m[3][0] * vX + m[3][1] * vY + m[3][2] * vZ + m[3][3] * vW;
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;
		res[3] = w_;
		
		return res;
	}
	
	public static <T extends Tup4fC> T transform4d(Tup4fR v, SimpleMat4fR m, T res)
	{
		return transform4d(v.v0(), v.v1(), v.v2(), v.v3(), m.toArray(), res);
	}

	public static <T extends Tup4fC> T transform4d(Tup4fR v, float[][] m, T res)
	{
		return transform4d(v.v0(), v.v1(), v.v2(), v.v3(), m, res); 
	}
	
	public static <T extends Tup4fC> T transform4d(float[] v, SimpleMat4fR m, T res)
	{
		return transform4d(v[0], v[1], v[2], v[3], m.toArray(), res);
	}

	public static <T extends Tup4fC> T transform4d(float[] v, float[][] m, T res)
	{
		return transform4d(v[0], v[1], v[2], v[3], m, res); 
	}
	
	public static <T extends Tup4fC> T transform4d(float vX, float vY, float vZ, float vW, SimpleMat4fR m, T res)
	{
		return transform4d(vX, vY, vZ, vW, m.toArray(), res);
	}

	public static <T extends Tup4fC> T transform4d(float vX, float vY, float vZ, float vW, float[][] m, T res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY + m[0][2] * vZ + m[0][3] * vW;
		float y_ = m[1][0] * vX + m[1][1] * vY + m[1][2] * vZ + m[1][3] * vW;
		float z_ = m[2][0] * vX + m[2][1] * vY + m[2][2] * vZ + m[2][3] * vW;
		float w_ = m[3][0] * vX + m[3][1] * vY + m[3][2] * vZ + m[3][3] * vW;
		
		res.set(x_, y_, z_, w_);

		return res;
	}
	
	public static <T> T transform4dFunc(Tup4fR v, SimpleMat4fR m, FloatTetraFunction<T> res)
	{
		return transform4dFunc(v.v0(), v.v1(), v.v2(), v.v3(), m.toArray(), res);
	}

	public static <T> T transform4dFunc(Tup4fR v, float[][] m, FloatTetraFunction<T> res)
	{
		return transform4dFunc(v.v0(), v.v1(), v.v2(), v.v3(), m, res); 
	}
	
	public static <T> T transform4dFunc(float[] v, SimpleMat4fR m, FloatTetraFunction<T> res)
	{
		return transform4dFunc(v[0], v[1], v[2], v[3], m.toArray(), res);
	}

	public static <T> T transform4dFunc(float[] v, float[][] m, FloatTetraFunction<T> res)
	{
		return transform4dFunc(v[0], v[1], v[2], v[3], m, res); 
	}
	
	public static <T> T transform4dFunc(float vX, float vY, float vZ, float vW, SimpleMat4fR m, FloatTetraFunction<T> res)
	{
		return transform4dFunc(vX, vY, vZ, vW, m.toArray(), res);
	}

	public static <T> T transform4dFunc(float vX, float vY, float vZ, float vW, float[][] m, FloatTetraFunction<T> res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY + m[0][2] * vZ + m[0][3] * vW;
		float y_ = m[1][0] * vX + m[1][1] * vY + m[1][2] * vZ + m[1][3] * vW;
		float z_ = m[2][0] * vX + m[2][1] * vY + m[2][2] * vZ + m[2][3] * vW;
		float w_ = m[3][0] * vX + m[3][1] * vY + m[3][2] * vZ + m[3][3] * vW;
		
		return res.apply(x_, y_, z_, w_);
	}
}
