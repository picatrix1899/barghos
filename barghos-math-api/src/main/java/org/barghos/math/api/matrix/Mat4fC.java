package org.barghos.math.api.matrix;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.math.api.vector.QuatR;
import org.barghos.math.api.vector.Vec3fUtil;

/**
 * This interface represents any modifiable 4 by 4 float matrix.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Mat4fC extends Mat4fR
{
	/** {@inheritDoc} */
	Mat4fC clone();
	
	/**
	 * Adopts the values for all components of the matrix from the given matrix.
	 * 
	 * @param m The matrix to adopt the values from.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC set(Mat4fR m);
	
	/**
	 * Adopts the values for all components of the matrix from the given array.
	 * The first index of the array is associated with the index of the row and the second
	 * with the index of the column (i.e. m[row][column]).
	 * 
	 * @param m The array to adopt the values from.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC setArray(float[][] m);
	
	/**
	 * Adopts the values for the components of the specified row from the given tuple t.
	 * 
	 * @param row The index of the row to set.
	 * @param t The tuple to adopt the values from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setRow(int row, Tup4fR t)
	{
		return setRow(row, t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Adopts the values for the components x, y and z of the specified row from the given tuple t and
	 * for the component w from the parameter w.
	 * 
	 * @param row The index of the row to set.
	 * @param t The tuple to adopt the values for the components x, y and z from.
	 * @param w The value for the w component.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setRow(int row, Tup3fR t, float w)
	{
		return setRow(row, t.getX(), t.getY(), t.getZ(), w);
	}
	
	/**
	 * Adopts the value for the component x of the specified row from the parameter x and
	 * for the components y, z and w from the given tuple.
	 * 
	 * @param row The index of the row to set.
	 * @param x The value for the x component.
	 * @param t The tuple to adopt the values for the components x, z and w from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setRow(int row, float x, Tup3fR t)
	{
		return setRow(row, x, t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Adopts the values for the components x and y of the specified row from the given tuple t and
	 * for the components z and w from the parameters z and w.
	 * 
	 * @param row The index of the row to set.
	 * @param t The tuple to adopt the values for the components x and y from.
	 * @param z The value for the z component.
	 * @param w The value for the w component.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setRow(int row, Tup2fR t, float z, float w)
	{
		return setRow(row, t.getX(), t.getY(), z, w);
	}
	
	/**
	 * Adopts the value for the component x and w of the specified row from the parameter x and w and
	 * for the components y, z from the given tuple.
	 * 
	 * @param row The index of the row to set.
	 * @param x The value for the x component.
	 * @param t The tuple to adopt the values for the components y, z from.
	 * @param w The value for the w component.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setRow(int row, float x, Tup2fR t, float w)
	{
		return setRow(row, x, t.getX(), t.getY(), w);
	}
	
	/**
	 * Adopts the value for the component x and y of the specified row from the parameter x and y and
	 * for the components z, w from the given tuple.
	 * 
	 * @param row The index of the row to set.
	 * @param x The value for the x component.
	 * @param y The value for the y component.
	 * @param t The tuple to adopt the values for the components z, w from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setRow(int row, float x, float y, Tup2fR t)
	{
		return setRow(row, x, y, t.getX(), t.getY());
	}
	
	/**
	 * Adopts the values for the components of the specified row from the given array.
	 * 
	 * @param row The index of the row to set.
	 * @param v The array to adopt the values from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setRow(int row, float[] v)
	{
		return setRow(row, v[COMP_X], v[COMP_Y], v[COMP_Z], v[COMP_W]);
	}
	
	/**
	 * Adopts the values for the specified row from the given parameters.
	 * 
	 * @param row The index of the row to set.
	 * @param x The value for the x component.
	 * @param y The value for the y component.
	 * @param z The value for the z component.
	 * @param w The value for the w component.

	 * @return The current matrix.
	 */
	Mat4fC setRow(int row, float x, float y, float z, float w);
	
	/**
	 * Adopts the values for the components of the specified column from the given tuple t.
	 * 
	 * @param column The index of the column to set.
	 * @param t The tuple to adopt the values from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setColumn(int column, Tup4fR t)
	{
		return setColumn(column, t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Adopts the values for the components x, y and z of the specified column from the given tuple t and
	 * for the component w from the parameter w.
	 * 
	 * @param column The index of the column to set.
	 * @param t The tuple to adopt the values for the components x, y and z from.
	 * @param w The value for the w component.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setColumn(int column, Tup3fR t, float w)
	{
		return setColumn(column, t.getX(), t.getY(), t.getZ(), w);
	}
	
	/**
	 * Adopts the value for the component x of the specified column from the parameter x and
	 * for the components y, z and w from the given tuple.
	 * 
	 * @param column The index of the column to set.
	 * @param x The value for the x component.
	 * @param t The tuple to adopt the values for the components x, z and w from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setColumn(int column, float x, Tup3fR t)
	{
		return setColumn(column, x, t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Adopts the values for the components x and y of the specified column from the given tuple t and
	 * for the components z and w from the parameters z and w.
	 * 
	 * @param column The index of the column to set.
	 * @param t The tuple to adopt the values for the components x and y from.
	 * @param z The value for the z component.
	 * @param w The value for the w component.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setColumn(int column, Tup2fR t, float z, float w)
	{
		return setColumn(column, t.getX(), t.getY(), z, w);
	}
	
	/**
	 * Adopts the value for the component x and w of the specified column from the parameter x and w and
	 * for the components y, z from the given tuple.
	 * 
	 * @param column The index of the column to set.
	 * @param x The value for the x component.
	 * @param t The tuple to adopt the values for the components y, z from.
	 * @param w The value for the w component.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setColumn(int column, float x, Tup2fR t, float w)
	{
		return setColumn(column, x, t.getX(), t.getY(), w);
	}
	
	/**
	 * Adopts the value for the component x and y of the specified column from the parameter x and y and
	 * for the components z, w from the given tuple.
	 * 
	 * @param column The index of the column to set.
	 * @param x The value for the x component.
	 * @param y The value for the y component.
	 * @param t The tuple to adopt the values for the components z, w from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setColumn(int column, float x, float y, Tup2fR t)
	{
		return setColumn(column, x, y, t.getX(), t.getY());
	}
	
	/**
	 * Adopts the values for the components of the specified column from the given array.
	 * 
	 * @param column The index of the column to set.
	 * @param v The array to adopt the values from.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC setColumn(int column, float[] v)
	{
		return setColumn(column, v[COMP_X], v[COMP_Y], v[COMP_Z], v[COMP_W]);
	}
	
	/**
	 * Adopts the values for the specified column from the given parameters.
	 * 
	 * @param column The index of the column to set.
	 * @param x The value for the x component.
	 * @param y The value for the y component.
	 * @param z The value for the z component.
	 * @param w The value for the w component.

	 * @return The current matrix.
	 */
	Mat4fC setColumn(int column, float x, float y, float z, float w);
	
	/**
	 * Sets the value of the specified cell.
	 * 
	 * @param row The row index.
	 * @param column The column index.
	 * @param value The new value.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC setCell(int row, int column, float value);
	
	/**
	 * Multiplies the current matrix with the given matrix and saves the result in the current matrix.
	 * This uses the current matrix as the left multiplicant and
	 * the given matrix as right multipliciant.
	 * As this preserves the common order of operants, it allows for easier transfer of
	 * formulas to code.
	 * 
	 * <p>
	 * Operation:
	 * 
	 * M * r
	 * 
	 * @param r The right multiplicant.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC mul(Mat4fR r);
	
	/**
	 * Multiplies the current matrix with the given matrix and saves the result in the current matrix.
	 * This uses the current matrix as the right multiplicant and
	 * the given matrix as left multipliciant.
	 * As this inverts the order of operants, it allows for easier and more natural feeling chaining of
	 * multiplications.
	 * 
	 * <p>
	 * Operation:
	 * 
	 * l * M
	 * 
	 * @param l The left multiplicant.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC revMul(Mat4fR l);
	
	/**
	 * Transposes the current matrix and saves the result in the current matrix.
	 * 
	 * <p>
	 * Operation:
	 * 
	 * M'
	 * 
	 * @return The current matrix.
	 */
	Mat4fC transpose();
	
	/**
	 * Calculates the inverse of the matrix and saves the result in the current matrix.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC invert();
	
	/**
	 * Multiplies the current matrix with the given matrix and saves the result in a new instance.
	 * This uses the current matrix as the left multiplicant and
	 * the given matrix as right multipliciant.
	 * As this preserves the common order of operants, it allows for easier transfer of
	 * formulas to code.
	 * 
	 * <p>
	 * Operation:
	 * 
	 * M * r
	 * 
	 * @param r The right multiplicant.
	 * 
	 * @return The new matrix with the result.
	 */
	default Mat4fC mulN(Mat4fR r)
	{
		return clone().mul(r);
	}
	
	/**
	 * Multiplies the current matrix with the given matrix and saves the result in a new instance.
	 * This uses the current matrix as the right multiplicant and
	 * the given matrix as left multipliciant.
	 * As this inverts the order of operants, it allows for easier and more natural feeling chaining of
	 * multiplications.
	 * 
	 * <p>
	 * Operation:
	 * 
	 * l * M
	 * 
	 * @param l The left multiplicant.
	 * 
	 * @return The new matrix with the result.
	 */
	default Mat4fC revMulN(Mat4fR r)
	{
		return clone().revMul(r);
	}
	
	/**
	 * Transposes the current matrix and saves the result in a new instance.
	 * 
	 * <p>
	 * Operation:
	 * 
	 * M'
	 * 
	 * @return The new matrix with the result.
	 */
	default Mat4fC transposeN()
	{
		return clone().transpose();
	}
	
	/**
	 * Calculates the inverse of the matrix and saves the result in a new instance.
	 * 
	 * @return The new matrix with the result.
	 */
	default Mat4fC invertN()
	{
		return clone().invert();
	}
	
	/**
	 * Initializes the matrix as identity matrix.
	 * 
	 * @return the current matrix.
	 */
	Mat4fC initIdentity();
	
	/**
	 * Initializes the matrix as zero matrix.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initZero();
	
	/**
	 * Initializes the matrix as a 3d scale matrix with the given tuple as factors.
	 * 
	 * @param t The tuple containing the factors.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initScaling3d(Tup3fR t)
	{
		return initScaling3d(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d scale matrix with the given array as factors.
	 * 
	 * @param t The array containing the factors.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initScaling3d(float[] t)
	{
		return initScaling3d(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d scale matrix with the factor.
	 * 
	 * @param factor The factor to scale by.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initScaling3d(float factor)
	{
		return initScaling3d(factor, factor, factor);
	}
	
	/**
	 * Initializes the matrix as a 3d scale matrix with the parameters x, y and z as factors.
	 * 
	 * @param x The factor to scale by for the x component.
	 * @param y The factor to scale by for the y component.
	 * @param z The factor to scale by for the z component.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initScaling3d(float x, float y, float z);
	
	/**
	 * Initializes the matrix as a 4d scale matrix with the given tuple as factors.
	 * 
	 * @param t The tuple containing the factors.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initScaling4d(Tup4fR t)
	{
		return initScaling4d(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Initializes the matrix as a 4d scale matrix with the given array as factors.
	 * 
	 * @param t The array containing the factors.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initScaling4d(float[] t)
	{
		return initScaling4d(t[COMP_X], t[COMP_Y], t[COMP_Z], t[COMP_W]);
	}
	
	/**
	 * Initializes the matrix as a 4d scale matrix with the factor.
	 * 
	 * @param factor The factor to scale by.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initScaling4d(float factor)
	{
		return initScaling4d(factor, factor, factor, factor);
	}
	
	/**
	 * Initializes the matrix as a 4d scale matrix with the parameters x, y, z and w as factors.
	 * 
	 * @param x The factor to scale by for the x component.
	 * @param y The factor to scale by for the y component.
	 * @param z The factor to scale by for the z component.
	 * @param w The factor to scale by for the w component.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initScaling4d(float x, float y, float z, float w);
	
	/**
	 * Initializes the matrix as a 3d translation matrix with the given tuple as offset.
	 * 
	 * @param t The tuple containing the offset.
	 * 
	 * @return The current Matrix.
	 */
	default Mat4fC initTranslation3d(Tup3fR t)
	{
		return initTranslation3d(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d translation matrix with the given array as offset.
	 * 
	 * @param t The array containing the offset.
	 * 
	 * @return The current Matrix.
	 */
	default Mat4fC initTranslation3d(float[] t)
	{
		return initTranslation3d(t[COMP_X], t[COMP_Y], t[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d translation matrix with the offset.
	 * 
	 * @param offset The value to offset by.
	 * 
	 * @return The current Matrix.
	 */
	default Mat4fC initTranslation3d(float offset)
	{
		return initTranslation3d(offset, offset, offset);
	}
	
	/**
	 * Initializes the matrix as a 3d translation matrix with the parameters x, y and z as offset.
	 * 
	 * @param x The offset for the x component.
	 * @param y The offset for the y component.
	 * @param z The offset for the z component.
	 * 
	 * @return The current Matrix.
	 */
	Mat4fC initTranslation3d(float x, float y, float z);
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR up, Tup3fR forward)
	{
		return initBaseChange(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR up, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from an up vector and a forward vector.
	 * 
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeRH(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from an up vector and a forward vector.
	 * 
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeLH(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector and a forward vector (f).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR up, float[] f)
	{
		return initBaseChange(up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector and a forward vector (f).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR up, float[] f, boolean rightHanded)
	{
		return initBaseChange(up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z], rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from an up vector and a forward vector (f).
	 * 
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR up, float[] f)
	{
		return initBaseChangeRH(up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from an up vector and a forward vector (f).
	 * 
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR up, float[] f)
	{
		return initBaseChangeLH(up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChange(up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR up, float fX, float fY, float fZ, boolean rightHanded)
	{
		return initBaseChange(up.getX(), up.getY(), up.getZ(), fX, fY, fZ, rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from an up vector and a forward vector (fX, fY, fZ).
	 * 
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChangeRH(up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from an up vector and a forward vector (fX, fY, fZ).
	 * 
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChangeLH(up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (u) and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] u, Tup3fR forward)
	{
		return initBaseChange(u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (u) and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] u, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from an up vector (u) and a forward vector.
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float[] u, Tup3fR forward)
	{
		return initBaseChangeRH(u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from an up vector (u) and a forward vector.
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float[] u, Tup3fR forward)
	{
		return initBaseChangeLH(u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChange(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float uX, float uY, float uZ, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector.
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChangeRH(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector.
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChangeLH(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (u) and a forward vector (f).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] u, float[] f)
	{
		return initBaseChange(u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (u) and a forward vector (f).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] u, float[] f, boolean rightHanded)
	{
		return initBaseChange(u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z], rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from an up vector (u) and a forward vector (f).
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float[] u, float[] f)
	{
		return initBaseChangeRH(u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from an up vector (u) and a forward vector (f).
	 * 
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float[] u, float[] f)
	{
		return initBaseChangeLH(u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initBaseChange(float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float uX, float uY, float uZ, float fX, float fY, float fZ, boolean rightHanded)
	{
		if(rightHanded) return initBaseChangeRH(uX, uY, uZ, fX, fY, fZ);
		return initBaseChangeLH(uX, uY, uZ, fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initBaseChangeRH(float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * 
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initBaseChangeLH(float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, Tup3fR up, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector, an up vector and a forward vector.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeRH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector, an up vector and a forward vector.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeLH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector and a forward vector (f).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, Tup3fR up, float[] f)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector and a forward vector (f).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, Tup3fR up, float[] f, boolean rightHanded)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z], rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector, an up vector and a forward vector (f).
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR right, Tup3fR up, float[] f)
	{
		return initBaseChangeRH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector, an up vector and a forward vector (f).
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR right, Tup3fR up, float[] f)
	{
		return initBaseChangeLH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, Tup3fR up, float fX, float fY, float fZ, boolean rightHanded)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ, rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector, an up vector and a forward vector (fX, fY, fZ).
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChangeRH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector, an up vector and a forward vector (fX, fY, fZ).
	 * 
	 * @param right The right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChangeLH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (u) and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float[] u, Tup3fR forward)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (u) and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float[] u, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector, an up vector (u) and a forward vector.
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR right, float[] u, Tup3fR forward)
	{
		return initBaseChangeRH(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector, an up vector (u) and a forward vector.
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR right, float[] u, Tup3fR forward)
	{
		return initBaseChangeLH(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector.
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChangeRH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector.
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChangeLH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, Tup3fR up, Tup3fR forward)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, Tup3fR up, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (r), an up vector and a forward vector.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float[] r, Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeRH(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (r), an up vector and a forward vector.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float[] r, Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeLH(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return initBaseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeRH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return initBaseChangeLH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (u) and a forward vector (f).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float[] u, float[] f)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (u) and a forward vector (f).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float[] u, float[] f, boolean rightHanded)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z], rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector, an up vector (u) and a forward vector (f).
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR right, float[] u, float[] f)
	{
		return initBaseChangeRH(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector, an up vector (u) and a forward vector (f).
	 * 
	 * @param right The right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR right, float[] u, float[] f)
	{
		return initBaseChangeLH(right.getX(), right.getY(), right.getZ(), u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ, boolean rightHanded)
	{
		return initBaseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ, rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return initBaseChangeRH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector, an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * 
	 * @param right The right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return initBaseChangeLH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector and a forward vector (f).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, Tup3fR up, float[] f)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector and a forward vector (f).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, Tup3fR up, float[] f, boolean rightHanded)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z], rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (r), an up vector and a forward vector (f).
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float[] r, Tup3fR up, float[] f)
	{
		return initBaseChangeRH(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (r), an up vector and a forward vector (f).
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param up The up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float[] r, Tup3fR up, float[] f)
	{
		return initBaseChangeLH(r[COMP_X], r[COMP_Y], r[COMP_Z], up.getX(), up.getY(), up.getZ(), f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ, boolean rightHanded)
	{
		return initBaseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ, rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector (fX, fY, fZ).
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChangeRH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector and a forward vector (fX, fY, fZ).
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param up The up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return initBaseChangeLH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, float[] u, Tup3fR forward)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, float[] u, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float[] r, float[] u, Tup3fR forward)
	{
		return initBaseChangeRH(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float[] r, float[] u, Tup3fR forward)
	{
		return initBaseChangeLH(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector.
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChange(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward, boolean rightHanded)
	{
		return initBaseChange(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChangeRH(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param forward The forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return initBaseChangeLH(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector (f).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, float[] u, float[] f)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector (f).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float[] r, float[] u, float[] f, boolean rightHanded)
	{
		return initBaseChange(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z], rightHanded);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector (f).
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeRH(float[] r, float[] u, float[] f)
	{
		return initBaseChangeRH(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (r), an up vector (u) and a forward vector (f).
	 * 
	 * @param r The array containing the components of the right vector.
	 * @param u The array containing the components of the up vector.
	 * @param f The array containing the components of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChangeLH(float[] r, float[] u, float[] f)
	{
		return initBaseChangeLH(r[COMP_X], r[COMP_Y], r[COMP_Z], u[COMP_X], u[COMP_Y], u[COMP_Z], f[COMP_X], f[COMP_Y], f[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is determined by the matrix implementation.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initBaseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initBaseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ, boolean rightHanded)
	{
		if(rightHanded) return initBaseChangeRH(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ);
		return initBaseChangeLH(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initBaseChangeRH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a right vector (rX, rY, rZ), an up vector (uX, uY, uZ) and a forward vector (fX, fY, fZ).
	 * 
	 * @param rX The value of the x component of the right vector.
	 * @param rY The value of the y component of the right vector.
	 * @param rZ The value of the z component of the right vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * @param fX The value of the x component of the forward vector.
	 * @param fY The value of the y component of the forward vector.
	 * @param fZ The value of the z component of the forward vector.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initBaseChangeLH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a 3d quaternion.
	 * The handedness of the rotation is determined by the default 3d float coord system in {@link BarghosMath#DEFAULT_COORD_SYSTEM_3f}.
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initRotation(QuatR q);
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a 3d quaternion.
	 * The handedness of the rotation is right handed if the parameter rightHanded is set to true. Otherwise it is left handed.
	 * 
	 * @param q The quaternion.
	 * @param rightHanded Specifies if true that the rotation is right handed. Otherwise it is left handed.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initRotation(QuatR q, boolean rightHanded)
	{
		if(rightHanded) return initRotationRH(q);
		return initRotationLH(q);
	}
	
	/**
	 * Initializes the matrix as a right handed 3d rotation matrix from a 3d quaternion.
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initRotationRH(QuatR q);
	
	/**
	 * Initializes the matrix as a left handed 3d rotation matrix from a 3d quaternion.
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initRotationLH(QuatR q);
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a vector axis as rotation axis and an angle in radians.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initRotation(Tup3fR axis, float angle)
	{
		return initRotation(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Mat4fC initRotation(Tup3fR axis, float angle, boolean rightHanded)
	{
		return initRotation(axis.getX(), axis.getY(), axis.getZ(), angle, rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC initRotationRH(Tup3fR axis, float angle)
	{
		return initRotationRH(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Mat4fC initRotationLH(Tup3fR axis, float angle)
	{
		return initRotationLH(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/**
	 * Initializes the matrix as a 3d rotation matrix from a vector axis (aX, aY, aZ) as rotation axis and an angle in radians.
	 * 
	 * @param aX The value of the x component of the rotation axis.
	 * @param aY The value of the y component of the rotation axis.
	 * @param aZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initRotation(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	default Mat4fC initRotation(float aX, float aY, float aZ, float angle, boolean rightHanded)
	{
		if(rightHanded) return initRotationRH(aX, aY, aZ, angle);
		return initRotationLH(aX, aY, aZ, angle);
	}
	
	// MISSING_DOC
	Mat4fC initRotationRH(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	Mat4fC initRotationLH(float aX, float aY, float aZ, float angle);
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point, a target point and an up vector.
	 * 
	 * @param origin The origin point.
	 * @param target The target point to look at.
	 * @param up The up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return initLookAt(origin.getX(),origin.getY(), origin.getZ(), target.getX(), target.getY(), target.getZ(), up.getX(), up.getY(), up.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point,
	 * a target point and an up vector (uX, uY, uZ).
	 * 
	 * @param origin The origin point.
	 * @param target The target point to look at.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(Tup3fR origin, Tup3fR target, float uX, float uY, float uZ)
	{
		return initLookAt(origin.getX(),origin.getY(), origin.getZ(), target.getX(), target.getY(), target.getZ(), uX, uY, uZ);
	}
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point,
	 * a target point (tX, tY, tZ) and an up vector.
	 * 
	 * @param origin The origin point.
	 * @param tX The value of the x component of the target vector.
	 * @param tY The value of the y component of the target vector.
	 * @param tZ The value of the z component of the target vector.
	 * @param up The up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(Tup3fR origin, float tX, float tY, float tZ, Tup3fR up)
	{
		return initLookAt(origin.getX(),origin.getY(), origin.getZ(), tX, tY, tZ, up.getX(), up.getY(), up.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point,
	 * a target point (tX, tY, tZ) and an up vector (uX, uY, uZ).
	 * 
	 * @param origin The origin point.
	 * @param tX The value of the x component of the target vector.
	 * @param tY The value of the y component of the target vector.
	 * @param tZ The value of the z component of the target vector.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(Tup3fR origin, float tX, float tY, float tZ, float uX, float uY, float uZ)
	{
		return initLookAt(origin.getX(),origin.getY(), origin.getZ(), tX, tY, tZ, uX, uY, uZ);
	}
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point (oX, oY, oZ),
	 * a target point and an up vector.
	 * 
	 * @param oX The value of the x component of the origin vector.
	 * @param oY The value of the y component of the origin vector.
	 * @param oZ The value of the z component of the origin vector.
	 * @param target The target point to look at.
	 * @param up The up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(float oX, float oY, float oZ, Tup3fR target, Tup3fR up)
	{
		return initLookAt(oX, oY, oZ, target.getX(), target.getY(), target.getZ(), up.getX(), up.getY(), up.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point (oX, oY, oZ),
	 * a target point and an up vector (uX, uY, uZ).
	 * 
	 * @param oX The value of the x component of the origin vector.
	 * @param oY The value of the y component of the origin vector.
	 * @param oZ The value of the z component of the origin vector.
	 * @param target The target point to look at.
	 * @param uX The value of the x component of the up vector.
	 * @param uY The value of the y component of the up vector.
	 * @param uZ The value of the z component of the up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(float oX, float oY, float oZ, Tup3fR target, float uX, float uY, float uZ)
	{
		return initLookAt(oX, oY, oZ, target.getX(), target.getY(), target.getZ(), uX, uY, uZ);
	}
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point (oX, oY, oZ),
	 * a target point (tX, tY, tZ) and an up vector.
	 * 
	 * @param oX The value of the x component of the origin vector.
	 * @param oY The value of the y component of the origin vector.
	 * @param oZ The value of the z component of the origin vector.
	 * @param tX The value of the x component of the target vector.
	 * @param tY The value of the y component of the target vector.
	 * @param tZ The value of the z component of the target vector.
	 * @param up The up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(float oX, float oY, float oZ, float tX, float tY, float tZ, Tup3fR up)
	{
		return initLookAt(oX, oY, oZ, tX, tY, tZ, up.getX(), up.getY(), up.getZ());
	}
	
	/**
	 * Initializes the matrix as a 3d look at rotation matrix. The look at matrix is build by an origin point, a target point and an up vector.
	 * 
	 * @param origin The origin point.
	 * @param target The target point to look at.
	 * @param up The up vector.
	 * 
	 * @return The current matrix.
	 */
	default Mat4fC initLookAt(float oX, float oY, float oZ, float tX, float tY, float tZ, float uX, float uY, float uZ)
	{
		float[] dir = new float[3];
		Vec3fUtil.sub(tX, tY, tZ, oX, oY, oZ, dir);
		Vec3fUtil.normalize(dir, dir);
		
		float[] right = new float[3];
		Vec3fUtil.cross(dir, uX, uY, uZ, right);

		return initBaseChange(right[COMP_X], right[COMP_Y], right[COMP_Z], uX, uY, uZ, dir[COMP_X], dir[COMP_Y], dir[COMP_Z]);
	}
	
	/**
	 * Initializes the matrix as a perspective projection matrix.
	 * 
	 * @param fovY The vertical field of view angle.
	 * @param aspectRatio The aspect ratio of the frustrum.
	 * @param near The near plane of the frustrum.
	 * @param far The far plane of the frustrum.
	 * 
	 * @return The current matrix.
	 */
	Mat4fC initPerspective(float fovY, float aspectRatio, float near, float far);
	
	Mat4fC initOrtho(float left, float right, float bottom, float top, float near, float far);
	
	// MISSING_DOC
	default Mat4fC scale3d(Tup3fR t)
	{
		return scale3d(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC scale3d(float factor)
	{
		return scale3d(factor, factor, factor);
	}
	
	// MISSING_DOC
	Mat4fC scale3d(float x, float y, float z);
	
	// MISSING_DOC
	default Mat4fC scale4d(Tup4fR t)
	{
		return scale4d(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	// MISSING_DOC
	default Mat4fC scale4d(float factor)
	{
		return scale4d(factor, factor, factor, factor);
	}
	
	// MISSING_DOC
	Mat4fC scale4d(float x, float y, float z, float w);
	
	// MISSING_DOC
	default Mat4fC translate3d(Tup3fR t)
	{
		return translate3d(t.getX(), t.getY(), t.getZ());
	}
	
	default Mat4fC translate3d(float value)
	{
		return translate3d(value, value, value);
	}
	
	// MISSING_DOC
	Mat4fC translate3d(float x, float y, float z);
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR up, Tup3fR forward)
	{
		return baseChange(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR up, Tup3fR forward, boolean rightHanded)
	{
		return baseChange(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(Tup3fR up, Tup3fR forward)
	{
		return baseChangeRH(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(Tup3fR up, Tup3fR forward)
	{
		return baseChangeLH(up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChange(up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR up, float fX, float fY, float fZ, boolean rightHanded)
	{
		return baseChange(up.getX(), up.getY(), up.getZ(), fX, fY, fZ, rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChangeRH(up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChangeLH(up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChange(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float uX, float uY, float uZ, Tup3fR forward, boolean rightHanded)
	{
		return baseChange(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChangeRH(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChangeLH(uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	Mat4fC baseChange(float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	// MISSING_DOC
	default Mat4fC baseChange(float uX, float uY, float uZ, float fX, float fY, float fZ, boolean rightHanded)
	{
		if(rightHanded) return baseChangeRH(uX, uY, uZ, fX, fY, fZ);
		return baseChangeLH(uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	Mat4fC baseChangeRH(float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	// MISSING_DOC
	Mat4fC baseChangeLH(float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, Tup3fR up, Tup3fR forward, boolean rightHanded)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return baseChangeRH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return baseChangeLH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, Tup3fR up, float fX, float fY, float fZ, boolean rightHanded)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ, rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChangeRH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChangeLH(right.getX(), right.getY(), right.getZ(), up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward, boolean rightHanded)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChangeRH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChangeLH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ, boolean rightHanded)
	{
		return baseChange(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ, rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return baseChangeRH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return baseChangeLH(right.getX(), right.getY(), right.getZ(), uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return baseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward, boolean rightHanded)
	{
		return baseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return baseChangeRH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return baseChangeLH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ, boolean rightHanded)
	{
		return baseChange(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ, rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChangeRH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return baseChangeLH(rX, rY, rZ, up.getX(), up.getY(), up.getZ(), fX, fY, fZ);
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChange(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward, boolean rightHanded)
	{
		return baseChange(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ(), rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeRH(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChangeRH(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC baseChangeLH(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return baseChangeLH(rX, rY, rZ, uX, uY, uZ, forward.getX(), forward.getY(), forward.getZ());
	}
	
	// MISSING_DOC
	Mat4fC baseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	// MISSING_DOC
	default Mat4fC baseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ, boolean rightHanded)
	{
		if(rightHanded) return baseChangeRH(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ);
		return baseChangeLH(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	Mat4fC baseChangeRH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	// MISSING_DOC
	Mat4fC baseChangeLH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ);
	
	// MISSING_DOC
	Mat4fC rotate(QuatR q);
	
	// MISSING_DOC
	default Mat4fC rotate(QuatR q, boolean rightHanded)
	{
		if(rightHanded) return rotateRH(q);
		return rotateLH(q);
	}
	
	// MISSING_DOC
	Mat4fC rotateRH(QuatR q);
	
	// MISSING_DOC
	Mat4fC rotateLH(QuatR q);
	
	// MISSING_DOC
	default Mat4fC rotate(Tup3fR axis, float angle)
	{
		return rotate(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Mat4fC rotate(Tup3fR axis, float angle, boolean rightHanded)
	{
		return rotate(axis.getX(), axis.getY(), axis.getZ(), angle, rightHanded);
	}
	
	// MISSING_DOC
	default Mat4fC rotateRH(Tup3fR axis, float angle)
	{
		return rotateRH(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	default Mat4fC rotateLH(Tup3fR axis, float angle)
	{
		return rotateLH(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	// MISSING_DOC
	Mat4fC rotate(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	default Mat4fC rotate(float aX, float aY, float aZ, float angle, boolean rightHanded)
	{
		if(rightHanded) return rotateRH(aX, aY, aZ, angle);
		return rotateLH(aX, aY, aZ, angle);
	}
	
	// MISSING_DOC
	Mat4fC rotateRH(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	Mat4fC rotateLH(float aX, float aY, float aZ, float angle);
	
	// MISSING_DOC
	default Mat4fC doLookAt(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return doLookAt(origin.getX(), origin.getY(), origin.getZ(), target.getX(), target.getY(), target.getZ(), up.getX(), up.getY(), up.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC doLookAt(Tup3fR origin, Tup3fR target, float uX, float uY, float uZ)
	{
		return doLookAt(origin.getX(), origin.getY(), origin.getZ(), target.getX(), target.getY(), target.getZ(), uX, uY, uZ);
	}
	
	// MISSING_DOC
	default Mat4fC doLookAt(Tup3fR origin, float tX, float tY, float tZ, Tup3fR up)
	{
		return doLookAt(origin.getX(), origin.getY(), origin.getZ(), tX, tY, tZ, up.getX(), up.getY(), up.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC doLookAt(Tup3fR origin, float tX, float tY, float tZ, float uX, float uY, float uZ)
	{
		return doLookAt(origin.getX(), origin.getY(), origin.getZ(), tX, tY, tZ, uX, uY, uZ);
	}
	
	// MISSING_DOC
	default Mat4fC doLookAt(float oX, float oY, float oZ, Tup3fR target, Tup3fR up)
	{
		return doLookAt(oX, oY, oZ, target.getX(), target.getY(), target.getZ(), up.getX(), up.getY(), up.getZ());
	}
	
	// MISSING_DOC
	default Mat4fC doLookAt(float oX, float oY, float oZ, Tup3fR target, float uX, float uY, float uZ)
	{
		return doLookAt(oX, oY, oZ, target.getX(), target.getY(), target.getZ(), uX, uY, uZ);
	}
	
	// MISSING_DOC
	default Mat4fC doLookAt(float oX, float oY, float oZ, float tX, float tY, float tZ, Tup3fR up)
	{
		return doLookAt(oX, oY, oZ, tX, tY, tZ, up.getX(), up.getY(), up.getZ());
	}
	
	// MISSING_DOC
	Mat4fC doLookAt(float oX, float oY, float oZ, float tX, float tY, float tZ, float uX, float uY, float uZ);
	
	// MISSING_DOC
	Mat4fC projectPerspective(float fovY, float aspectRatio, float near, float far);
	
	// MISSING_DOC
	Mat4fC projectOrtho(float left, float right, float bottom, float top, float near, float far);
}
