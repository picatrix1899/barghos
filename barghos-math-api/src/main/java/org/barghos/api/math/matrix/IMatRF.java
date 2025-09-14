package org.barghos.api.math.matrix;

import org.barghos.annotation.ExtractionParam;

public interface IMatRF
{
	int rowSize();

	int colSize();

	int size();

	float getAt(int row, int col);

	float[] getRowAt(int row);

	float[] getRowAt(int row, @ExtractionParam float[] res);

	float[] getColAt(int col);
	
	float[] getColAt(int col, @ExtractionParam float[] res);

	float[] toArray();

	float[] toArray(@ExtractionParam float[] res);
	
	float[] toArrayRowMajor();

	float[] toArrayRowMajor(@ExtractionParam float[] res);
	
	float[] toArrayColumnMajor();

	float[] toArrayColumnMajor(@ExtractionParam float[] res);
}
