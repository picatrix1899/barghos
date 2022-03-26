package org.barghos.math.api.matrix;

import java.nio.FloatBuffer;

// MISSING_DOC
public interface MatR
{
	// MISSING_DOC
	float getCell(int row, int column);
	
	// MISSING_DOC
	int getRows();
	
	// MISSING_DOC
	int getColumns();
	
	// MISSING_DOC
	int getCells();
	
	// MISSING_DOC
	float[] toArrayRowMajor();
	
	// MISSING_DOC
	float[] toArrayRowMajor(float[] res);
	
	// MISSING_DOC
	FloatBuffer toBufferRowMajor(FloatBuffer res);
	
	// MISSING_DOC
	float[] toArrayColumnMajor();
	
	// MISSING_DOC
	float[] toArrayColumnMajor(float[] res);
	
	// MISSING_DOC
	FloatBuffer toBufferColumnMajor(FloatBuffer res);
	
}
