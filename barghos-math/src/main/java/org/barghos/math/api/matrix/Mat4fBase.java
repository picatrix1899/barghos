package org.barghos.math.api.matrix;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple4.Tup4fR;

/**
 * This interface represents any modifiable 4 by 4 float matrix.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Mat4fBase extends Mat4fR
{
	/** {@inheritDoc} */
	Mat4fBase clone();
	
	// MISSING_DOC
	Mat4fBase set(Mat4fR m);
	
	// MISSING_DOC
	Mat4fBase setArray(float[][] m);
	
	// MISSING_DOC
	default Mat4fBase setRow(int row, Tup4fR t)
	{
		return setRow(row, t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	// MISSING_DOC
	default Mat4fBase setRow(int row, Tup3fR t, float w)
	{
		return setRow(row, t.getX(), t.getY(), t.getZ(), w);
	}
	
	// MISSING_DOC
	default Mat4fBase setRow(int row, float x, Tup3fR t)
	{
		return setRow(row, x, t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Mat4fBase setRow(int row, Tup2fR t, float z, float w)
	{
		return setRow(row, t.getX(), t.getY(), z, w);
	}
	
	// MISSING_DOC
	default Mat4fBase setRow(int row, float x, Tup2fR t, float w)
	{
		return setRow(row, x, t.getX(), t.getY(), w);
	}
	
	// MISSING_DOC
	default Mat4fBase setRow(int row, float x, float y, Tup2fR t)
	{
		return setRow(row, x, y, t.getX(), t.getY());
	}
	
	// MISSING_DOC
	default Mat4fBase setRow(int row, float[] v)
	{
		return setRow(row, v[COMP_X], v[COMP_Y], v[COMP_Z], v[COMP_W]);
	}
	
	// MISSING_DOC
	Mat4fBase setRow(int row, float x, float y, float z, float w);
	
	// MISSING_DOC
	default Mat4fBase setColumn(int column, Tup4fR t)
	{
		return setColumn(column, t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	// MISSING_DOC
	default Mat4fBase setColumn(int column, Tup3fR t, float w)
	{
		return setColumn(column, t.getX(), t.getY(), t.getZ(), w);
	}
	
	// MISSING_DOC
	default Mat4fBase setColumn(int column, float x, Tup3fR t)
	{
		return setColumn(column, x, t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Mat4fBase setColumn(int column, Tup2fR t, float z, float w)
	{
		return setColumn(column, t.getX(), t.getY(), z, w);
	}
	
	// MISSING_DOC
	default Mat4fBase setColumn(int column, float x, Tup2fR t, float w)
	{
		return setColumn(column, x, t.getX(), t.getY(), w);
	}
	
	// MISSING_DOC
	default Mat4fBase setColumn(int column, float x, float y, Tup2fR t)
	{
		return setColumn(column, x, y, t.getX(), t.getY());
	}
	
	// MISSING_DOC
	default Mat4fBase setColumn(int column, float[] v)
	{
		return setColumn(column, v[COMP_X], v[COMP_Y], v[COMP_Z], v[COMP_W]);
	}
	
	// MISSING_DOC
	Mat4fBase setColumn(int column, float x, float y, float z, float w);
	
	// MISSING_DOC
	Mat4fBase setCell(int row, int column, float value);
	
	// MISSING_DOC
	Mat4fBase mul(Mat4fR r);
	
	// MISSING_DOC
	Mat4fBase transpose();
	
	// MISSING_DOC
	Mat4fBase invert();
	
	// MISSING_DOC
	Mat4fBase mulN(Mat4fR r);
	
	// MISSING_DOC
	Mat4fBase transposeN();
	
	// MISSING_DOC
	Mat4fBase invertN();
	
	// MISSING_DOC
	default Mat4fBase initIdentity()
	{
		setRow(0, 1, 0, 0, 0);
		setRow(1, 0, 1, 0, 0);
		setRow(2, 0, 0, 1, 0);
		setRow(3, 0, 0, 0, 1);
		
		return this;
	}
	
	// MISSING_DOC
	default Mat4fBase initZero()
	{
		setRow(0, 0, 0, 0, 0);
		setRow(1, 0, 0, 0, 0);
		setRow(2, 0, 0, 0, 0);
		setRow(3, 0, 0, 0, 0);
		
		return this;
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling2d(Tup2fR t)
	{
		return initScaling2d(t.getX(), t.getY());
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling2d(float factor)
	{
		return initScaling2d(factor, factor);
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling2d(float x, float y)
	{
		setRow(0, x, 0, 0, 0);
		setRow(1, 0, y, 0, 0);
		setRow(2, 0, 0, 1, 0);
		setRow(3, 0, 0, 0, 1);
		
		return this;
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling3d(Tup3fR t)
	{
		return initScaling3d(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling3d(float factor)
	{
		return initScaling3d(factor, factor, factor);
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling3d(float x, float y, float z)
	{
		setRow(0, x, 0, 0, 0);
		setRow(1, 0, y, 0, 0);
		setRow(2, 0, 0, z, 0);
		setRow(3, 0, 0, 0, 1);
		
		return this;
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling4d(Tup4fR t)
	{
		return initScaling4d(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling4d(float factor)
	{
		return initScaling4d(factor, factor, factor, factor);
	}
	
	// MISSING_DOC
	default Mat4fBase initScaling4d(float x, float y, float z, float w)
	{
		setRow(0, x, 0, 0, 0);
		setRow(1, 0, y, 0, 0);
		setRow(2, 0, 0, z, 0);
		setRow(3, 0, 0, 0, w);
		
		return this;
	}
	
	// MISSING_DOC
	default Mat4fBase initTranslation(Tup3fR t)
	{
		return initTranslation(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Mat4fBase initTranslation(float value)
	{
		return initTranslation(value, value, value);
	}
	
	// MISSING_DOC
	default Mat4fBase initTranslation(float x, float y, float z)
	{
		setRow(0, 1, 0, 0, x);
		setRow(1, 0, 1, 0, y);
		setRow(2, 0, 0, 1, z);
		setRow(3, 0, 0, 0, 1);
		
		return this;
	}
}
