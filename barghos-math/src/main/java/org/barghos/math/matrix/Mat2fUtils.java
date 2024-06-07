package org.barghos.math.matrix;

/**
 * This class provides utilities for working with 2x2 float matrices.
 */
public class Mat2fUtils
{
	public static float determinant(float[][] m)
	{
		return determinant(
				m[0][0], m[0][1],
				m[1][0], m[1][1]);
	}
	
	public static float determinant(
			float m0x, float m0y,
			float m1x, float m1y)
	{
		return	m0x * +m1y +
				m0y * -m1x;
	}
}
