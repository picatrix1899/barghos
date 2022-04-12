package org.barghos.math.matrix;

import java.nio.FloatBuffer;

import static org.barghos.math.api.matrix.MatrixConstants.*;

import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple3.Tup3fBase;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.vector.Quat3f;
import org.barghos.math.api.vector.Vec2fBase;
import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.api.vector.Vec3fBase;
import org.barghos.math.api.vector.Vec3fR;
import org.barghos.math.vector.Vec3f;

// MISSING_DOC
public class Mat4f implements Mat4fR
{
	// MISSING_DOC
	public float[][] m = new float[M4_ROWS][M4_COLUMNS];
	
	// MISSING_DOC
	public Mat4f()
	{
		initIdentity();
	}
	
	// MISSING_DOC
	public Mat4f(Mat4f m)
	{
		set(m);
	}
	
	// MISSING_DOC
	public Mat4f set(Mat4f mat)
	{
		setRow(0, mat.m[0]);
		setRow(1, mat.m[1]);
		setRow(2, mat.m[2]);
		setRow(3, mat.m[3]);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f set(float[][] mat)
	{
		setRow(0, mat[0]);
		setRow(1, mat[1]);
		setRow(2, mat[2]);
		setRow(3, mat[3]);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f setRow(int row, float value)
	{
		return setRow(row, value, value, value, value);
	}
	
	// MISSING_DOC
	public Mat4f setRow(int row, float[] values)
	{
		return setRow(row, values[0], values[1], values[2], values[3]);
	}
	
	// MISSING_DOC
	public Mat4f setRow(int row, Tup3fR t, float w)
	{
		return setRow(row, t.getX(), t.getY(), t.getZ(), w);
	}
	
	// MISSING_DOC
	public Mat4f setRow(int row, float x, Tup3fR t)
	{
		return setRow(row, x, t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public Mat4f setRow(int row, float x, float y, float z, float w)
	{
		this.m[row][0] = x;
		this.m[row][1] = y;
		this.m[row][2] = z;
		this.m[row][3] = w;
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f setColumn(int column, float value)
	{
		return setColumn(column, value, value, value, value);
	}
	
	// MISSING_DOC
	public Mat4f setColumn(int column, float[] values)
	{
		return setColumn(column, values[0], values[1], values[2], values[3]);
	}
	
	// MISSING_DOC
	public Mat4f setColumn(int column, Tup3fR t, float w)
	{
		return setColumn(column, t.getX(), t.getY(), t.getZ(), w);
	}
	
	// MISSING_DOC
	public Mat4f setColumn(int column, float x, Tup3fR t)
	{
		return setColumn(column, x, t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public Mat4f setColumn(int column, float x, float y, float z, float w)
	{
		this.m[0][column] = x;
		this.m[1][column] = y;
		this.m[2][column] = z;
		this.m[3][column] = w;
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f setCell(int row, int column, float value)
	{
		this.m[row][column] = value;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float getCell(int row, int column)
	{
		return this.m[row][column];
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[] toArrayRowMajor()
	{
		float[] out = new float[M4_CELLS];
		
		for(int row = 0; row < M4_ROWS; row++)
		{
			int rowBase = row * M4_COLUMNS;
			
			out[rowBase] = this.m[row][0];
			out[rowBase + 1] = this.m[row][1];
			out[rowBase + 2] = this.m[row][2];
			out[rowBase + 3] = this.m[row][3];
		}
		
		return out;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[] toArrayRowMajor(float[] res)
	{
		if(res.length < M4_CELLS) throw new RuntimeException();
		
		for(int row = 0; row < M4_ROWS; row++)
		{
			int rowBase = row * M4_COLUMNS;
			
			res[rowBase] = this.m[row][0];
			res[rowBase + 1] = this.m[row][1];
			res[rowBase + 2] = this.m[row][2];
			res[rowBase + 3] = this.m[row][3];
		}
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public FloatBuffer toBufferRowMajor(FloatBuffer res)
	{
		for(int row = 0; row < M4_ROWS; row++)
		{
			res.put(this.m[row][0]);
			res.put(this.m[row][1]);
			res.put(this.m[row][2]);
			res.put(this.m[row][3]);
		}
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[] toArrayColumnMajor()
	{
		float[] out = new float[M4_CELLS];
		
		for(int column = 0; column < M4_COLUMNS; column++)
		{
			int columnBase = column * M4_ROWS;
			
			out[columnBase] = this.m[0][column];
			out[columnBase + 1] = this.m[1][column];
			out[columnBase + 2] = this.m[2][column];
			out[columnBase + 3] = this.m[3][column];
		}
		
		return out;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[] toArrayColumnMajor(float[] res)
	{
		if(res.length < M4_CELLS) throw new RuntimeException();
		
		for(int column = 0; column < M4_COLUMNS; column++)
		{
			int columnBase = column * M4_ROWS;
			
			res[columnBase] = this.m[0][column];
			res[columnBase + 1] = this.m[1][column];
			res[columnBase + 2] = this.m[2][column];
			res[columnBase + 3] = this.m[3][column];
		}
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public FloatBuffer toBufferColumnMajor(FloatBuffer res)
	{
		for(int column = 0; column < M4_COLUMNS; column++)
		{
			res.put(this.m[0][column]);
			res.put(this.m[1][column]);
			res.put(this.m[2][column]);
			res.put(this.m[3][column]);
		}
		
		return res;
	}
	
	// MISSING_DOC
	public float getDeterminant()
	{
		return (float) MatUtils.det4x4(	this.m[0][0], this.m[0][1], this.m[0][2], this.m[0][3],
								this.m[1][0], this.m[1][1], this.m[1][2], this.m[1][3],
								this.m[2][0], this.m[2][1], this.m[2][2], this.m[2][3],
								this.m[3][0], this.m[3][1], this.m[3][2], this.m[3][3]);
	}
	
	// MISSING_DOC
	public Mat4f invertN()
	{
		return clone().invert();
	}
	
	// MISSING_DOC
	public Mat4f invert()
	{
		double determinant = getDeterminant();
		
		if(determinant != 0)
		{
			double determinant_inv = 1.0 / determinant;

			// first row
			double _m0x =  MatUtils.det3x3(m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
			double _m0y = -MatUtils.det3x3(m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
			double _m0z =  MatUtils.det3x3(m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
			double _m0w = -MatUtils.det3x3(m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
			// second row
			double _m1x = -MatUtils.det3x3(m[0][1], m[0][2], m[0][3], m[2][1], m[2][2], m[2][3], m[3][1], m[3][2], m[3][3]);
			double _m1y =  MatUtils.det3x3(m[0][0], m[0][2], m[0][3], m[2][0], m[2][2], m[2][3], m[3][0], m[3][2], m[3][3]);
			double _m1z = -MatUtils.det3x3(m[0][0], m[0][1], m[0][3], m[2][0], m[2][1], m[2][3], m[3][0], m[3][1], m[3][3]);
			double _m1w =  MatUtils.det3x3(m[0][0], m[0][1], m[0][2], m[2][0], m[2][1], m[2][2], m[3][0], m[3][1], m[3][2]);
			// third row
			double _m2x =  MatUtils.det3x3(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[3][1], m[3][2], m[3][3]);
			double _m2y = -MatUtils.det3x3(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[3][0], m[3][2], m[3][3]);
			double _m2z =  MatUtils.det3x3(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[3][0], m[3][1], m[3][3]);
			double _m2w = -MatUtils.det3x3(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[3][0], m[3][1], m[3][2]);
			// fourth row
			double _m3x = -MatUtils.det3x3(m[0][1], m[0][2], m[0][3], m[1][1], m[1][2], m[1][3], m[2][1], m[2][2], m[2][3]);
			double _m3y =  MatUtils.det3x3(m[0][0], m[0][2], m[0][3], m[1][0], m[1][2], m[1][3], m[2][0], m[2][2], m[2][3]);
			double _m3z = -MatUtils.det3x3(m[0][0], m[0][1], m[0][3], m[1][0], m[1][1], m[1][3], m[2][0], m[2][1], m[2][3]);
			double _m3w =  MatUtils.det3x3(m[0][0], m[0][1], m[0][2], m[1][0], m[1][1], m[1][2], m[2][0], m[2][1], m[2][2]);

			// transpose and divide by the determinant
			m[0][0] = (float)(_m0x * determinant_inv);
			m[1][1] = (float)(_m1y * determinant_inv);
			m[2][2] = (float)(_m2z * determinant_inv);
			m[3][3] = (float)(_m3w * determinant_inv);
			m[0][1] = (float)(_m1x * determinant_inv);
			m[1][0] = (float)(_m0y * determinant_inv);
			m[2][0] = (float)(_m0z * determinant_inv);
			m[0][2] = (float)(_m2x * determinant_inv);
			m[1][2] = (float)(_m2y * determinant_inv);
			m[2][1] = (float)(_m1z * determinant_inv);
			m[0][3] = (float)(_m3x * determinant_inv);
			m[3][0] = (float)(_m0w * determinant_inv);
			m[1][3] = (float)(_m3y * determinant_inv);
			m[3][1] = (float)(_m1w * determinant_inv);
			m[3][2] = (float)(_m2w * determinant_inv);
			m[2][3] = (float)(_m3z * determinant_inv);
			
			return this;
		}
		
		return null;
	}
	
	/** {@inheritDoc} */
	public Mat4f clone()
	{
		return new Mat4f(this);
	}
	
	public String toString()
	{
		return	"mat4f(" + 
				m[0][0] + ", " + m[0][1] + ", " + m[0][2] + ", " + m[0][3] + "\n" +
				m[1][0] + ", " + m[1][1] + ", " + m[1][2] + ", " + m[1][3] + "\n" +
				m[2][0] + ", " + m[2][1] + ", " + m[2][2] + ", " + m[2][3] + "\n" +
				m[3][0] + ", " + m[3][1] + ", " + m[3][2] + ", " + m[3][3] + ")";
	}
	
	// MISSING_DOC
	public Mat4f initIdentity()
	{
		setRow(0, 1, 0, 0, 0);
		setRow(1, 0, 1, 0, 0);
		setRow(2, 0, 0, 1, 0);
		setRow(3, 0, 0, 0, 1);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initZero()
	{
		setRow(0, 0, 0, 0, 0);
		setRow(1, 0, 0, 0, 0);
		setRow(2, 0, 0, 0, 0);
		setRow(3, 0, 0, 0, 0);
		
		return this;
	}

	// MISSING_DOC
	public Mat4f initScaling3d(Tup3fR t)
	{
		return initScaling3d(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public Mat4f initScaling3d(float factor)
	{
		return initScaling3d(factor, factor, factor);
	}
	
	// MISSING_DOC
	public Mat4f initScaling3d(float x, float y, float z)
	{
		setRow(0, x, 0, 0, 0);
		setRow(1, 0, y, 0, 0);
		setRow(2, 0, 0, z, 0);
		setRow(3, 0, 0, 0, 1);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initScaling4d(float factor)
	{
		return initScaling4d(factor, factor, factor, factor);
	}
	
	// MISSING_DOC
	public Mat4f initScaling4d(float x, float y, float z, float w)
	{
		setRow(0, x, 0, 0, 0);
		setRow(1, 0, y, 0, 0);
		setRow(2, 0, 0, z, 0);
		setRow(3, 0, 0, 0, w);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initTranslation(Tup3fR t)
	{
		return initTranslation(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public Mat4f initTranslation(float x, float y, float z)
	{
		setRow(0, 1, 0, 0, x);
		setRow(1, 0, 1, 0, y);
		setRow(2, 0, 0, 1, z);
		setRow(3, 0, 0, 0, 1);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initRotation(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		return initRotationLH(forward, left, up);
	}
	
	// MISSING_DOC
	public Mat4f initRotationLH(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		setRow(0, left, 0.0f);
		setRow(1, up, 0.0f);
		setRow(2, forward, 0.0f);
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initRotationRH(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		setRow(0, left, 0.0f);
		setRow(1, up, 0.0f);
		setRow(2, forward, 0.0f);
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);
		
		transpose();
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initRotation(Quat3f q)
	{
		return initRotationLH(q);
	}
	
	// MISSING_DOC
	public Mat4f initRotationLH(Quat3f q)
	{
		this.m[0][0] = 1.0f - 2.0f	* (q.getY() * q.getY() + q.getZ() * q.getZ());
		this.m[0][1] = 2.0f			* (q.getX() * q.getY() - q.getW() * q.getZ());
		this.m[0][2] = 2.0f			* (q.getX() * q.getZ() + q.getW() * q.getY());
		this.m[0][3] = 0.0f;
		
		this.m[1][0] = 2.0f			* (q.getX() * q.getY() + q.getW() * q.getZ());
		this.m[1][1] = 1.0f - 2.0f	* (q.getX() * q.getX() + q.getZ() * q.getZ());
		this.m[1][2] = 2.0f			* (q.getY() * q.getZ() - q.getW() * q.getX());
		this.m[1][3] = 0.0f;
		
		this.m[2][0] = 2.0f			* (q.getX() * q.getZ() - q.getW() * q.getY());
		this.m[2][1] = 2.0f			* (q.getY() * q.getZ() + q.getW() * q.getX());
		this.m[2][2] = 1.0f - 2.0f	* (q.getX() * q.getX() + q.getY() * q.getY());
		this.m[2][3] = 0.0f;
		
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);

		return this;
	}
	
	// MISSING_DOC
	public Mat4f initRotationRH(Quat3f q)
	{
		this.m[0][0] = 1.0f - 2.0f	* (q.getY() * q.getY() + q.getZ() * q.getZ());
		this.m[0][1] = 2.0f			* (q.getX() * q.getY() - q.getW() * q.getZ());
		this.m[0][2] = 2.0f			* (q.getX() * q.getZ() + q.getW() * q.getY());
		this.m[0][3] = 0.0f;
		
		this.m[1][0] = 2.0f			* (q.getX() * q.getY() + q.getW() * q.getZ());
		this.m[1][1] = 1.0f - 2.0f	* (q.getX() * q.getX() + q.getZ() * q.getZ());
		this.m[1][2] = 2.0f			* (q.getY() * q.getZ() - q.getW() * q.getX());
		this.m[1][3] = 0.0f;
		
		this.m[2][0] = 2.0f			* (q.getX() * q.getZ() - q.getW() * q.getY());
		this.m[2][1] = 2.0f			* (q.getY() * q.getZ() + q.getW() * q.getX());
		this.m[2][2] = 1.0f - 2.0f	* (q.getX() * q.getX() + q.getY() * q.getY());
		this.m[2][3] = 0.0f;
		
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);

		transpose();
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initRotation(Tup3fR axis, float angle)
	{
		float sinAngle = (float)Math.sin(angle);
		float cosAngle = (float)Math.cos(angle);
		
		float x = axis.getX();
		float y = axis.getY();
		float z = axis.getZ();
		
		this.m[0][0] = cosAngle + (x * x) * (1 - cosAngle);
		this.m[0][1] = x * y * (1 - cosAngle) - z * sinAngle;
		this.m[0][2] = x * z * (1 - cosAngle) + y * sinAngle;
		this.m[0][3] = 0;
		
		this.m[1][0] = y * x * (1 - cosAngle) + + z * sinAngle;
		this.m[1][1] = cosAngle + (y * y) * (1 - cosAngle);
		this.m[1][2] = y * z * (1 - cosAngle) - x * sinAngle;
		this.m[1][3] = 0;
		
		this.m[2][0] = z * x * (1 - cosAngle) - y * sinAngle;
		this.m[2][1] = z * y * (1 - cosAngle) + x * sinAngle;
		this.m[2][2] = cosAngle + (z * z) * (1 - cosAngle);
		this.m[2][3] = 0;
		
		this.m[3][0] = 0;
		this.m[3][1] = 0;
		this.m[3][2] = 0;
		this.m[3][3] = 1;
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initPerspective(float fovY, float aspectRatio, float near, float far)
	{
		float f = (float)Math.tan(0.5 * fovY);
		
		setRow(0, 1.0f / (f * aspectRatio), 0, 0, 0);
		setRow(1, 0, 1.0f / f, 0, 0);
		setRow(2, 0, 0, -((far + near) / (far - near)), -((2 * far * near) / (far - near)));
		setRow(3, 0, 0, -1, 0);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f initLookAt(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		Vec3fBase direction = new Vec3f(target).sub(origin).normal();
		Vec3fBase left = direction.crossN(up);
		
		return initRotation(direction, left, up);
	}
	
	// MISSING_DOC
	public Mat4f initLookAtLH(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		Vec3fBase direction = new Vec3f(target).sub(origin).normal();
		Vec3fBase left = direction.crossN(up);
		
		return initRotationLH(direction, left, up);
	}
	
	// MISSING_DOC
	public Mat4f initLookAtRH(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		Vec3fBase direction = new Vec3f(target).sub(origin).normal();
		Vec3fBase left = direction.crossN(up);
		
		return initRotationRH(direction, left, up);
	}
	
	// MISSING_DOC
	public Mat4f mul(Mat4f r)
	{
		return Mat4f.mul(this, r, this);
	}
	
	// MISSING_DOC
	public Mat4f mulN(Mat4f r)
	{
		return Mat4f.mul(this, r, new Mat4f());
	}
	
	// MISSING_DOC
	public Mat4f transposeN()
	{
		return clone().transpose();
	}
	
	// MISSING_DOC
	public Mat4f transpose()
	{
		float m01 = this.m[0][1];
		float m02 = this.m[0][2];
		float m03 = this.m[0][3];
		
		float m10 = this.m[1][0];
		float m12 = this.m[1][2];
		float m13 = this.m[1][3];
		
		float m20 = this.m[2][0];
		float m21 = this.m[2][1];
		float m23 = this.m[2][3];
		
		float m30 = this.m[3][0];
		float m31 = this.m[3][1];
		float m32 = this.m[3][2];
		
		setRow(0, this.m[0][0], m10, m20, m30);
		setRow(1, m01, this.m[1][1], m21, m31);
		setRow(2, m02, m12, this.m[2][2], m32);
		setRow(3, m03, m13, m23, this.m[3][3]);
		
		return this;
	}
	
	// MISSING_DOC
	public Mat4f scale3d(Tup3fR t)
	{
		return Mat4f.mul(Mat4f.scaling3d(t), this, this);
	}
	
	// MISSING_DOC
	public Mat4f scale3d(float factor)
	{
		return Mat4f.mul(Mat4f.scaling3d(factor), this, this);
	}
	
	// MISSING_DOC
	public Mat4f scale3d(float x, float y, float z)
	{
		return Mat4f.mul(Mat4f.scaling3d(x, y, z), this, this);
	}
	
	// MISSING_DOC
	public Mat4f scale4d(float factor)
	{
		return Mat4f.mul(Mat4f.scaling4d(factor), this, this);
	}
	
	// MISSING_DOC
	public Mat4f scale4d(float x, float y, float z, float w)
	{
		return Mat4f.mul(Mat4f.scaling4d(x, y, z, w), this, this);
	}
	
	// MISSING_DOC
	public Mat4f translate(Tup3fR t)
	{
		return translate(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public Mat4f translate(float x, float y, float z)
	{
		return Mat4f.mul(Mat4f.translation(x, y, z), this, this);
	}
	
	// MISSING_DOC
	public Mat4f rotate(Quat3f q)
	{
		return Mat4f.mul(Mat4f.rotation(q), this, this);
	}
	
	// MISSING_DOC
	public Mat4f rotateLH(Quat3f q)
	{
		return Mat4f.mul(Mat4f.rotationLH(q), this, this);
	}
	
	// MISSING_DOC
	public Mat4f rotateRH(Quat3f q)
	{
		return Mat4f.mul(Mat4f.rotationRH(q), this, this);
	}
	
	// MISSING_DOC
	public Mat4f rotate(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		return Mat4f.mul(Mat4f.rotation(forward, left, up), this, this);
	}
	
	// MISSING_DOC
	public Mat4f rotateLH(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		return Mat4f.mul(Mat4f.rotationLH(forward, left, up), this, this);
	}
	
	// MISSING_DOC
	public Mat4f rotateRH(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		return Mat4f.mul(Mat4f.rotationRH(forward, left, up), this, this);
	}
	
	// MISSING_DOC
	public Mat4f rotate(Tup3fR axis, float angle)
	{
		return Mat4f.mul(Mat4f.rotation(axis, angle), this, this);
	}
	
	// MISSING_DOC
	public Mat4f doLookAt(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return Mat4f.mul(Mat4f.lookAt(origin, target, up), this, this);
	}
	
	// MISSING_DOC
	public Mat4f doLookAtLH(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return Mat4f.mul(Mat4f.lookAtLH(origin, target, up), this, this);
	}
	
	// MISSING_DOC
	public Mat4f doLookAtRH(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return Mat4f.mul(Mat4f.lookAtRH(origin, target, up), this, this);
	}
	
	// MISSING_DOC
	public static Mat4f mul(Mat4f l, Mat4f r, Mat4f res)
	{
		float[][] m_ = new float[M4_ROWS][M4_COLUMNS];
		
		for(int row = 0; row < M4_ROWS; row++)
		{
			m_[row][0] = l.m[row][0] * r.m[0][0] + l.m[row][1] * r.m[1][0] + l.m[row][2] * r.m[2][0] + l.m[row][3] * r.m[3][0];
			m_[row][1] = l.m[row][0] * r.m[0][1] + l.m[row][1] * r.m[1][1] + l.m[row][2] * r.m[2][1] + l.m[row][3] * r.m[3][1];
			m_[row][2] = l.m[row][0] * r.m[0][2] + l.m[row][1] * r.m[1][2] + l.m[row][2] * r.m[2][2] + l.m[row][3] * r.m[3][2];
			m_[row][3] = l.m[row][0] * r.m[0][3] + l.m[row][1] * r.m[1][3] + l.m[row][2] * r.m[2][3] + l.m[row][3] * r.m[3][3];
		}
		
		res.set(m_);
		
		return res;
	}
	
	// MISSING_DOC
	public static Mat4f identity()
	{
		return new Mat4f().initIdentity();
	}
	
	// MISSING_DOC
	public static Mat4f zero()
	{
		return new Mat4f().initZero();
	}
	
	// MISSING_DOC
	public static Mat4f scaling3d(Tup3fR t)
	{
		return scaling3d(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public static Mat4f scaling3d(float factor)
	{
		return new Mat4f().initScaling3d(factor);
	}
	
	// MISSING_DOC
	public static Mat4f scaling3d(float x, float y, float z)
	{
		return new Mat4f().initScaling3d(x, y, z);
	}
	
	// MISSING_DOC
	public static Mat4f scaling4d(float factor)
	{
		return new Mat4f().initScaling4d(factor);
	}
	
	// MISSING_DOC
	public static Mat4f scaling4d(float x, float y, float z, float w)
	{
		return new Mat4f().initScaling4d(x, y, z, w);
	}
	
	// MISSING_DOC
	public static Mat4f translation(Tup3fR t)
	{
		return translation(t.getX(),t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public static Mat4f translation(float x, float y, float z)
	{
		return new Mat4f().initTranslation(x, y, z);
	}
	
	// MISSING_DOC
	public static Mat4f rotation(Quat3f q)
	{
		return new Mat4f().initRotation(q);
	}
	
	// MISSING_DOC
	public static Mat4f rotationLH(Quat3f q)
	{
		return new Mat4f().initRotationLH(q);
	}
	
	// MISSING_DOC
	public static Mat4f rotationRH(Quat3f q)
	{
		return new Mat4f().initRotationRH(q);
	}
	
	// MISSING_DOC
	public static Mat4f rotation(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		return new Mat4f().initRotation(forward, left, up);
	}
	
	// MISSING_DOC
	public static Mat4f rotationLH(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		return new Mat4f().initRotationLH(forward, left, up);
	}
	
	// MISSING_DOC
	public static Mat4f rotationRH(Tup3fR forward, Tup3fR left, Tup3fR up)
	{
		return new Mat4f().initRotationRH(forward, left, up);
	}
	
	// MISSING_DOC
	public static Mat4f rotation(Tup3fR axis, float angle)
	{
		return new Mat4f().initRotation(axis, angle);
	}
	
	// MISSING_DOC
	public static Mat4f perspective(float fovY, float aspectRatio, float near, float far)
	{
		return new Mat4f().initPerspective(fovY, aspectRatio, near, far);
	}
	
	// MISSING_DOC
	public static Mat4f lookAt(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return new Mat4f().initLookAt(origin, target, up);
	}
	
	// MISSING_DOC
	public static Mat4f lookAtLH(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return new Mat4f().initLookAtLH(origin, target, up);
	}
	
	// MISSING_DOC
	public static Mat4f lookAtRH(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return new Mat4f().initLookAtRH(origin, target, up);
	}

	public <T extends Tup2fBase> T transform(Tup2fR t, boolean useZ, boolean useW, T res)
	{
		float x_ = this.m[0][0] * t.getX() + this.m[0][1] * t.getY();
		float y_ = this.m[1][0] * t.getX() + this.m[1][1] * t.getY();

		if(useZ)
		{
			x_ += this.m[0][2] * 1.0f;
			y_ += this.m[1][2] * 1.0f;
		}
		
		if(useW)
		{
			x_ += this.m[0][3] * 1.0f;
			y_ += this.m[1][3] * 1.0f;
		}
		
		res.set(x_, y_);

		return res;
	}

	public <T extends Vec2fBase> T transform(Vec2fR v, boolean useZ, boolean useW, T res)
	{
		return transform((Tup2fR)v, useZ, useW, res);
	}

	public <T extends Tup3fBase> T transform(Tup3fR t, boolean useW, T res)
	{
		float x_ = this.m[0][0] * t.getX() + this.m[0][1] * t.getY() + this.m[0][2] * t.getZ();
		float y_ = this.m[1][0] * t.getX() + this.m[1][1] * t.getY() + this.m[1][2] * t.getZ();
		float z_ = this.m[2][0] * t.getX() + this.m[2][1] * t.getY() + this.m[2][2] * t.getZ();

		if(useW)
		{
			x_ += this.m[0][3] * 1.0f;
			y_ += this.m[1][3] * 1.0f;
			z_ += this.m[2][3] * 1.0f;
		}
		
		res.set(x_, y_, z_);

		return res;
	}

	public <T extends Vec3fBase> T transform(Vec3fR v, boolean useW, T res)
	{
		return transform((Tup3fR)v, useW, res);
	}
}
