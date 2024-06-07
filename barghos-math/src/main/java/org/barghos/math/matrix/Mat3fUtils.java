package org.barghos.math.matrix;

/**
 * This class provides utilities for working with 2x2 float matrices.
 */
public class Mat3fUtils
{
	public static float determinant(float[][] m)
	{
		return determinant(
				m[0][0], m[0][1], m[0][2],
				m[1][0], m[1][1], m[1][2],
				m[2][0], m[2][1], m[2][2]);
	}
	
	public static float determinant(
			float m0x, float m0y, float m0z,
			float m1x, float m1y, float m1z,
			float m2x, float m2y, float m2z)
	{
		return	m0x * +Mat2fUtils.determinant(m1y, m1z, m2y, m2z) +
				m0y * -Mat2fUtils.determinant(m1x, m1z, m2x, m2z) +
				m0z * +Mat2fUtils.determinant(m1x, m1y, m2x, m2y);
	}
}
