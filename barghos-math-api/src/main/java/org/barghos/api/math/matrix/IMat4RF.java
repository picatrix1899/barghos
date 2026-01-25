package org.barghos.api.math.matrix;

import org.barghos.annotation.ExtractionParam;

public interface IMat4RF
{
	public static final int ROW_SIZE = 4;
	public static final int COL_SIZE = 4;
	public static final int SIZE = ROW_SIZE * COL_SIZE;

	default int rowSize()
	{
		return ROW_SIZE;
	}

	default int colSize()
	{
		return COL_SIZE;
	}

	default int size()
	{
		return SIZE;
	}
	
	float at(int col, int row);
	
	float m00();
	float m01();
	float m02();
	float m03();
	
	float m10();
	float m11();
	float m12();
	float m13();
	
	float m20();
	float m21();
	float m22();
	float m23();
	
	float m30();
	float m31();
	float m32();
	float m33();
	
	float[] toArray();

	float[] toArray(@ExtractionParam float[] res);
	
	float[] toArrayRowMajor();

	float[] toArrayRowMajor(@ExtractionParam float[] res);
	
	float[] toArrayColumnMajor();

	float[] toArrayColumnMajor(@ExtractionParam float[] res);
}
