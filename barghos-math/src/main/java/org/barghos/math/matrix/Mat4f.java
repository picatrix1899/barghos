package org.barghos.math.matrix;

import java.nio.FloatBuffer;

import static org.barghos.math.api.matrix.MatrixConstants.*;
import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2fC;
import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple4.Tup4fC;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.math.BarghosMath;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.vector.QuatfR;
import org.barghos.math.api.vector.Vec3fUtil;

// MISSING_DOC
public class Mat4f implements Mat4fC
{
	// MISSING_DOC
	public float[][] m = new float[M4_ROWS][M4_COLUMNS];
	
	// MISSING_DOC
	public Mat4f()
	{
		initIdentity();
	}
	
	// MISSING_DOC
	public Mat4f(Mat4fR m)
	{
		set(m);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC set(Mat4fR mat)
	{
		mat.toArray(this.m);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC setArray(float[][] mat)
	{
		setRow(0, mat[0]);
		setRow(1, mat[1]);
		setRow(2, mat[2]);
		setRow(3, mat[3]);
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC setRow(int row, float x, float y, float z, float w)
	{
		this.m[row][0] = x;
		this.m[row][1] = y;
		this.m[row][2] = z;
		this.m[row][3] = w;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC setColumn(int column, float x, float y, float z, float w)
	{
		this.m[0][column] = x;
		this.m[1][column] = y;
		this.m[2][column] = z;
		this.m[3][column] = w;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC setCell(int row, int column, float value)
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
	public float[] getRow(int row, float[] res)
	{
		res[COMP_X] = this.m[row][COMP_X];
		res[COMP_Y] = this.m[row][COMP_Y];
		res[COMP_Z] = this.m[row][COMP_Z];
		res[COMP_W] = this.m[row][COMP_W];
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[] getColumn(int column, float[] res)
	{
		res[COMP_X] = this.m[COMP_X][column];
		res[COMP_Y] = this.m[COMP_Y][column];
		res[COMP_Z] = this.m[COMP_Z][column];
		res[COMP_W] = this.m[COMP_W][column];
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[][] toArray(float[][] res)
	{
		for(int i = 0; i < M4_ROWS; i++)
		{
			res[i][0] = this.m[i][0];
			res[i][1] = this.m[i][1];
			res[i][2] = this.m[i][2];
			res[i][3] = this.m[i][3];
		}
		
		return res;
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
	
	/** {@inheritDoc}} */
	@Override
	public float getDeterminant()
	{
		return (float) MatUtils.det4x4(	this.m[0][0], this.m[0][1], this.m[0][2], this.m[0][3],
								this.m[1][0], this.m[1][1], this.m[1][2], this.m[1][3],
								this.m[2][0], this.m[2][1], this.m[2][2], this.m[2][3],
								this.m[3][0], this.m[3][1], this.m[3][2], this.m[3][3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC invert()
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
	@Override
	public Mat4f clone()
	{
		return new Mat4f(this);
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return	"mat4f(" + 
				m[0][0] + ", " + m[0][1] + ", " + m[0][2] + ", " + m[0][3] + "\n" +
				m[1][0] + ", " + m[1][1] + ", " + m[1][2] + ", " + m[1][3] + "\n" +
				m[2][0] + ", " + m[2][1] + ", " + m[2][2] + ", " + m[2][3] + "\n" +
				m[3][0] + ", " + m[3][1] + ", " + m[3][2] + ", " + m[3][3] + ")";
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC scale3d(float x, float y, float z)
	{
		return revMul(new Mat4f().initScaling3d(x, y, z));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC scale4d(float x, float y, float z, float w)
	{
		return revMul(new Mat4f().initScaling4d(x, y, z, w));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC translate3d(float x, float y, float z)
	{
		return revMul(new Mat4f().initTranslation3d(x, y, z));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC baseChange(float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return revMul(new Mat4f().initBaseChange(uX, uY, uZ, fX, fY, fZ));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC baseChangeRH(float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return revMul(new Mat4f().initBaseChangeRH(uX, uY, uZ, fX, fY, fZ));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC baseChangeLH(float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return revMul(new Mat4f().initBaseChangeLH(uX, uY, uZ, fX, fY, fZ));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC baseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return revMul(new Mat4f().initBaseChange(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC baseChangeRH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return revMul(new Mat4f().initBaseChangeRH(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC baseChangeLH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return revMul(new Mat4f().initBaseChangeLH(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC rotate(QuatfR q)
	{
		return revMul(new Mat4f().initRotation(q));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC rotateRH(QuatfR q)
	{
		return revMul(new Mat4f().initRotationRH(q));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC rotateLH(QuatfR q)
	{
		return revMul(new Mat4f().initRotationLH(q));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC rotate(float aX, float aY, float aZ, float angle)
	{
		return revMul(new Mat4f().initRotation(aX, aY, aZ, angle));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC rotateRH(float aX, float aY, float aZ, float angle)
	{
		return revMul(new Mat4f().initRotationRH(aX, aY, aZ, angle));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC rotateLH(float aX, float aY, float aZ, float angle)
	{
		return revMul(new Mat4f().initRotationLH(aX, aY, aZ, angle));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC doLookAt(float oX, float oY, float oZ, float tX, float tY, float tZ, float uX, float uY, float uZ)
	{
		return revMul(new Mat4f().initLookAt(oX, oY, oZ, tX, tY, tZ, uX, uY, uZ));
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC projectPerspective(float fovY, float aspectRatio, float near, float far)
	{
		return revMul(new Mat4f().initPerspective(fovY, aspectRatio, near, far));
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC projectOrtho(float left, float right, float bottom, float top, float near, float far)
	{
		return revMul(new Mat4f().initOrtho(left, right, bottom, top, near, far));
	}
	
	/** {@inheritDoc}} */
	@Override
	public <T extends Tup2fC> T transform(float tX, float tY, boolean useZ, boolean useW, T res)
	{
		float x_ = this.m[0][0] * tX + this.m[0][1] * tY;
		float y_ = this.m[1][0] * tX + this.m[1][1] * tY;

		if(useZ)
		{
			x_ += this.m[0][2];
			y_ += this.m[1][2];
		}
		
		if(useW)
		{
			x_ += this.m[0][3];
			y_ += this.m[1][3];
		}
		
		res.set(x_, y_);

		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public float[] transform(float tX, float tY, boolean useZ, boolean useW, float[] res)
	{
		float x_ = this.m[0][0] * tX + this.m[0][1] * tY;
		float y_ = this.m[1][0] * tX + this.m[1][1] * tY;

		if(useZ)
		{
			x_ += this.m[0][2];
			y_ += this.m[1][2];
		}
		
		if(useW)
		{
			x_ += this.m[0][3];
			y_ += this.m[1][3];
		}
		
		res[COMP_X] = x_;
		res[COMP_Y] = y_;

		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Tup3fC> T transform(float tX, float tY, float tZ, boolean useW, T res)
	{
		float x_ = this.m[0][0] * tX + this.m[0][1] * tY + this.m[0][2] * tZ;
		float y_ = this.m[1][0] * tX + this.m[1][1] * tY + this.m[1][2] * tZ;
		float z_ = this.m[2][0] * tX + this.m[2][1] * tY + this.m[2][2] * tZ;

		if(useW)
		{
			x_ += this.m[0][3];
			y_ += this.m[1][3];
			z_ += this.m[2][3];
		}
		
		res.set(x_, y_, z_);

		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public float[] transform(float tX, float tY, float tZ, boolean useW, float[] res)
	{
		float x_ = this.m[0][0] * tX + this.m[0][1] * tY + this.m[0][2] * tZ;
		float y_ = this.m[1][0] * tX + this.m[1][1] * tY + this.m[1][2] * tZ;
		float z_ = this.m[2][0] * tX + this.m[2][1] * tY + this.m[2][2] * tZ;

		if(useW)
		{
			x_ += this.m[0][3];
			y_ += this.m[1][3];
			z_ += this.m[2][3];
		}
		
		res[COMP_X] = x_;
		res[COMP_Y] = y_;
		res[COMP_Z] = z_;

		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Tup4fC> T transform(float tX, float tY, float tZ, float tW, T res)
	{
		float x_ = this.m[0][0] * tX + this.m[0][1] * tY + this.m[0][2] * tZ + this.m[0][3] * tW;
		float y_ = this.m[1][0] * tX + this.m[1][1] * tY + this.m[1][2] * tZ + this.m[1][3] * tW;
		float z_ = this.m[2][0] * tX + this.m[2][1] * tY + this.m[2][2] * tZ + this.m[2][3] * tW;
		float w_ = this.m[3][0] * tX + this.m[3][1] * tY + this.m[3][2] * tZ + this.m[3][3] * tW;
		
		res.set(x_, y_, z_, w_);

		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[] transform(float tX, float tY, float tZ, float tW, float[] res)
	{
		float x_ = this.m[0][0] * tX + this.m[0][1] * tY + this.m[0][2] * tZ + this.m[0][3] * tW;
		float y_ = this.m[1][0] * tX + this.m[1][1] * tY + this.m[1][2] * tZ + this.m[1][3] * tW;
		float z_ = this.m[2][0] * tX + this.m[2][1] * tY + this.m[2][2] * tZ + this.m[2][3] * tW;
		float w_ = this.m[3][0] * tX + this.m[3][1] * tY + this.m[3][2] * tZ + this.m[3][3] * tW;
		
		res[COMP_X] = x_;
		res[COMP_Y] = y_;
		res[COMP_Z] = z_;
		res[COMP_W] = w_;

		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC mul(Mat4fR r)
	{
		float[][] rm = r.toArray();
		
		float[][] res = new float[M4_ROWS][M4_COLUMNS];
		
		for(int row = 0; row < M4_ROWS; row++)
		{
			res[row][0] = this.m[row][0] * rm[0][0] + this.m[row][1] * rm[1][0] + this.m[row][2] * rm[2][0] + this.m[row][3] * rm[3][0];
			res[row][1] = this.m[row][0] * rm[0][1] + this.m[row][1] * rm[1][1] + this.m[row][2] * rm[2][1] + this.m[row][3] * rm[3][1];
			res[row][2] = this.m[row][0] * rm[0][2] + this.m[row][1] * rm[1][2] + this.m[row][2] * rm[2][2] + this.m[row][3] * rm[3][2];
			res[row][3] = this.m[row][0] * rm[0][3] + this.m[row][1] * rm[1][3] + this.m[row][2] * rm[2][3] + this.m[row][3] * rm[3][3];
		}
		
		return setArray(res);
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC revMul(Mat4fR l)
	{
		float[][] lm = l.toArray();
		
		float[][] res = new float[M4_ROWS][M4_COLUMNS];
		
		for(int row = 0; row < M4_ROWS; row++)
		{
			res[row][0] = lm[row][0] * this.m[0][0] + lm[row][1] * this.m[1][0] + lm[row][2] * this.m[2][0] + lm[row][3] * this.m[3][0];
			res[row][1] = lm[row][0] * this.m[0][1] + lm[row][1] * this.m[1][1] + lm[row][2] * this.m[2][1] + lm[row][3] * this.m[3][1];
			res[row][2] = lm[row][0] * this.m[0][2] + lm[row][1] * this.m[1][2] + lm[row][2] * this.m[2][2] + lm[row][3] * this.m[3][2];
			res[row][3] = lm[row][0] * this.m[0][3] + lm[row][1] * this.m[1][3] + lm[row][2] * this.m[2][3] + lm[row][3] * this.m[3][3];
		}
		
		return setArray(res);
	}

	/** {@inheritDoc}} */
	@Override
	public Mat4fC transpose()
	{
		float[] row0 = getRow(0, new float[4]);
		float[] row1 = getRow(1, new float[4]);
		float[] row2 = getRow(2, new float[4]);
		float[] row3 = getRow(3, new float[4]);
		
		setColumn(0, row0);
		setColumn(1, row1);
		setColumn(2, row2);
		setColumn(3, row3);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initIdentity()
	{
		setRow(0, 1.0f, 0, 0, 0);
		setRow(1, 0, 1.0f, 0, 0);
		setRow(2, 0, 0, 1.0f, 0);
		setRow(3, 0, 0, 0, 1.0f);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initZero()
	{
		setRow(0, 0, 0, 0, 0);
		setRow(1, 0, 0, 0, 0);
		setRow(2, 0, 0, 0, 0);
		setRow(3, 0, 0, 0, 0);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initScaling3d(float x, float y, float z)
	{
		setRow(0, x, 0, 0, 0);
		setRow(1, 0, y, 0, 0);
		setRow(2, 0, 0, z, 0);
		setRow(3, 0, 0, 0, 1.0f);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initScaling4d(float x, float y, float z, float w)
	{
		setRow(0, x, 0, 0, 0);
		setRow(1, 0, y, 0, 0);
		setRow(2, 0, 0, z, 0);
		setRow(3, 0, 0, 0, w);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initTranslation3d(float x, float y, float z)
	{
		setRow(0, 1.0f, 0, 0, x);
		setRow(1, 0, 1.0f, 0, y);
		setRow(2, 0, 0, 1.0f, z);
		setRow(3, 0, 0, 0, 1.0f);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initBaseChange(float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return initBaseChange(uX, uY, uZ, fX, fY, fZ, BarghosMath.DEFAULT_SYSTEM_3f_IS_RIGHTHANDED);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initBaseChangeRH(float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		float[] right = new float[3];

		Vec3fUtil.cross(uX, uY, uZ, fX, fY, fZ, right);
		
		initBaseChangeRH(right[COMP_X], right[COMP_Y], right[COMP_Z], uX, uY, uZ, fX, fY, fZ);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initBaseChangeLH(float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		float[] right = new float[3];

		Vec3fUtil.cross(uX, uY, uZ, fX, fY, fZ, right);
		
		initBaseChangeLH(right[COMP_X], right[COMP_Y], right[COMP_Z], uX, uY, uZ, fX, fY, fZ);

		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initBaseChange(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return initBaseChange(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ, BarghosMath.DEFAULT_SYSTEM_3f_IS_RIGHTHANDED);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initBaseChangeRH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		setRow(0, rX, uX, fX, 0.0f);
		setRow(1, rY, uY, fY, 0.0f);
		setRow(2, rZ, uZ, fZ, 0.0f);
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initBaseChangeLH(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		setRow(0, rX, uX, fX, 0.0f);
		setRow(1, rY, uY, fY, 0.0f);
		setRow(2, rZ, uZ, fZ, 0.0f);
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);
		
		transpose();
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initRotation(QuatfR q)
	{
		return initRotation(q, BarghosMath.DEFAULT_SYSTEM_3f_IS_RIGHTHANDED);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initRotationRH(QuatfR q)
	{
		float qX = q.getX();
		float qY = q.getY();
		float qZ = q.getZ();
		float qW = q.getW();
		
		setRow(0,
				1.0f - 2.0f	* (qY * qY + qZ * qZ),
				2.0f		* (qX * qY - qZ * qW),
				2.0f		* (qX * qZ + qW * qY),
				0.0f
				);
		
		setRow(1,
				2.0f		* (qX * qY + qZ * qW),
				1.0f - 2.0f	* (qX * qX + qZ * qZ),
				2.0f		* (qY * qZ - qW * qX),
				0.0f
				);
		
		setRow(2,
				2.0f		* (qX * qZ - qW * qY),
				2.0f		* (qY * qZ + qW * qX),
				1.0f - 2.0f	* (qX * qX + qY * qY),
				0.0f
				);
		
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);

		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initRotationLH(QuatfR q)
	{
		float qX = q.getX();
		float qY = q.getY();
		float qZ = q.getZ();
		float qW = q.getW();
		
		setRow(0,
				1.0f - 2.0f	* (qY * qY + qZ * qZ),
				2.0f		* (qX * qY - qZ * qW),
				2.0f		* (qX * qZ + qW * qY),
				0.0f
				);
		
		setRow(1,
				2.0f		* (qX * qY + qZ * qW),
				1.0f - 2.0f	* (qX * qX + qZ * qZ),
				2.0f		* (qY * qZ - qW * qX),
				0.0f
				);
		
		setRow(2,
				2.0f		* (qX * qZ - qW * qY),
				2.0f		* (qY * qZ + qW * qX),
				1.0f - 2.0f	* (qX * qX + qY * qY),
				0.0f
				);
		
		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);

		transpose();
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initRotation(float aX, float aY, float aZ, float angle)
	{
		return initRotation(aX, aY, aZ, angle, BarghosMath.DEFAULT_SYSTEM_3f_IS_RIGHTHANDED);
	}
	
	public Mat4fC initRotationRH(float aX, float aY, float aZ, float angle)
	{
		float sinAngle = (float)Math.sin(angle);
		float cosAngle = (float)Math.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		setRow(0,
				cosAngle + (aX * aX) * recCosAngle,
				aX * aY * recCosAngle - aZ * sinAngle,
				aX * aZ * recCosAngle + aY * sinAngle,
				0.0f
				);
		
		setRow(1,
				aY * aX * recCosAngle + aZ * sinAngle,
				cosAngle + (aY * aY) * recCosAngle,
				aY * aZ * recCosAngle - aX * sinAngle,
				0.0f
				);

		setRow(2,
				aZ * aX * recCosAngle - aY * sinAngle,
				aZ * aY * recCosAngle + aX * sinAngle,
				cosAngle + (aZ * aZ) * recCosAngle,
				0.0f
				);

		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);
		
		return this;
	}

	public Mat4fC initRotationLH(float aX, float aY, float aZ, float angle)
	{
		float sinAngle = (float)Math.sin(angle);
		float cosAngle = (float)Math.cos(angle);
		
		float recCosAngle = 1.0f - cosAngle;
		
		setRow(0,
				cosAngle + (aX * aX) * recCosAngle,
				aX * aY * recCosAngle - aZ * sinAngle,
				aX * aZ * recCosAngle + aY * sinAngle,
				0.0f
				);
		
		setRow(1,
				aY * aX * recCosAngle + aZ * sinAngle,
				cosAngle + (aY * aY) * recCosAngle,
				aY * aZ * recCosAngle - aX * sinAngle,
				0.0f
				);

		setRow(2,
				aZ * aX * recCosAngle - aY * sinAngle,
				aZ * aY * recCosAngle + aX * sinAngle,
				cosAngle + (aZ * aZ) * recCosAngle,
				0.0f
				);

		setRow(3, 0.0f, 0.0f, 0.0f, 1.0f);
		
		transpose();
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initPerspective(float fovY, float aspectRatio, float near, float far)
	{
		float f = (float)Math.tan(0.5 * fovY);
		
		setRow(0, 1.0f / (f * aspectRatio), 0, 0, 0);
		setRow(1, 0, 1.0f / f, 0, 0);
		setRow(2, 0, 0, -((far + near) / (far - near)), -((2.0f * far * near) / (far - near)));
		setRow(3, 0, 0, -1.0f, 0);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Mat4fC initOrtho(float left, float right, float bottom, float top, float near, float far)
	{
		setRow(0, 2.0f / (right - left),				0f,									0f,								-(right + left) / (right - left));
		setRow(1, 0f,									2.0f / (top - bottom),				0f,								-(top + bottom) / (top - bottom));
		setRow(2, 0f,									0f, 								-2.0f / (far - near),			-(far + near) / (far - near));
		setRow(3, 0f,		0f,	0f, 	1.0f);
		 
		return this;
	}
	
	// MISSING_DOC
	public static Mat4fC identity()
	{
		return new Mat4f().initIdentity();
	}
	
	// MISSING_DOC
	public static Mat4fC zero()
	{
		return new Mat4f().initZero();
	}
	
	// MISSING_DOC
	public static Mat4fC scaling3d(Tup3fR t)
	{
		return scaling3d(t.getX(), t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public static Mat4fC scaling3d(float factor)
	{
		return new Mat4f().initScaling3d(factor);
	}
	
	// MISSING_DOC
	public static Mat4fC scaling3d(float x, float y, float z)
	{
		return new Mat4f().initScaling3d(x, y, z);
	}
	
	// MISSING_DOC
	public static Mat4fC scaling4d(Tup4fR t)
	{
		return scaling4d(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	// MISSING_DOC
	public static Mat4fC scaling4d(float factor)
	{
		return new Mat4f().initScaling4d(factor);
	}
	
	// MISSING_DOC
	public static Mat4fC scaling4d(float x, float y, float z, float w)
	{
		return new Mat4f().initScaling4d(x, y, z, w);
	}
	
	// MISSING_DOC
	public static Mat4fC translation3d(Tup3fR t)
	{
		return translation3d(t.getX(),t.getY(), t.getZ());
	}
	
	// MISSING_DOC
	public static Mat4fC translation3d(float x, float y, float z)
	{
		return new Mat4f().initTranslation3d(x, y, z);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(Tup3fR up, Tup3fR forward)
	{
		return new Mat4f().initBaseChange(up, forward);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(Tup3fR up, float fX, float fY, float fZ)
	{
		return new Mat4f().initBaseChange(up, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(float uX, float uY, float uZ, Tup3fR forward)
	{
		return new Mat4f().initBaseChange(uX, uY, uZ, forward);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return new Mat4f().initBaseChange(uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(Tup3fR right, Tup3fR up, Tup3fR forward)
	{
		return new Mat4f().initBaseChange(right, up, forward);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(Tup3fR right, Tup3fR up, float fX, float fY, float fZ)
	{
		return new Mat4f().initBaseChange(right, up, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(Tup3fR right, float uX, float uY, float uZ, Tup3fR forward)
	{
		return new Mat4f().initBaseChange(right, uX, uY, uZ, forward);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(Tup3fR right, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return new Mat4f().initBaseChange(right, uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(float rX, float rY, float rZ, Tup3fR up, Tup3fR forward)
	{
		return new Mat4f().initBaseChange(rX, rY, rZ, up, forward);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(float rX, float rY, float rZ, Tup3fR up, float fX, float fY, float fZ)
	{
		return new Mat4f().initBaseChange(rX, rY, rZ, up, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(float rX, float rY, float rZ, float uX, float uY, float uZ, Tup3fR forward)
	{
		return new Mat4f().initBaseChange(rX, rY, rZ, uX, uY, uZ, forward);
	}
	
	// MISSING_DOC
	public static Mat4fC baseChanging(float rX, float rY, float rZ, float uX, float uY, float uZ, float fX, float fY, float fZ)
	{
		return new Mat4f().initBaseChange(rX, rY, rZ, uX, uY, uZ, fX, fY, fZ);
	}
	
	// MISSING_DOC
	public static Mat4fC rotation(QuatfR q)
	{
		return new Mat4f().initRotation(q);
	}
	
	// MISSING_DOC
	public static Mat4fC rotation(Tup3fR axis, float angle)
	{
		return new Mat4f().initRotation(axis, angle);
	}
	
	// MISSING_DOC
	public static Mat4fC rotation(float aX, float aY, float aZ, float angle)
	{
		return new Mat4f().initRotation(aX, aY, aZ, angle);
	}
	
	// MISSING_DOC
	public static Mat4fC lookAt(Tup3fR origin, Tup3fR target, Tup3fR up)
	{
		return new Mat4f().initLookAt(origin, target, up);
	}

	// MISSING_DOC
	public static Mat4fC lookAt(Tup3fR origin, Tup3fR target, float uX, float uY, float uZ)
	{
		return new Mat4f().initLookAt(origin, target, uX, uY, uZ);
	}
	
	// MISSING_DOC
	public static Mat4fC lookAt(Tup3fR origin, float tX, float tY, float tZ, Tup3fR up)
	{
		return new Mat4f().initLookAt(origin, tX, tY, tZ, up);
	}
	
	// MISSING_DOC
	public static Mat4fC lookAt(Tup3fR origin, float tX, float tY, float tZ, float uX, float uY, float uZ)
	{
		return new Mat4f().initLookAt(origin, tX, tY, tZ, uX, uY, uZ);
	}
	
	// MISSING_DOC
	public static Mat4fC lookAt(float oX, float oY, float oZ, Tup3fR target, Tup3fR up)
	{
		return new Mat4f().initLookAt(oX, oY, oZ, target, up);
	}
	
	// MISSING_DOC
	public static Mat4fC lookAt(float oX, float oY, float oZ, Tup3fR target, float uX, float uY, float uZ)
	{
		return new Mat4f().initLookAt(oX, oY, oZ, target, uX, uY, uZ);
	}
	
	// MISSING_DOC
	public static Mat4fC lookAt(float oX, float oY, float oZ, float tX, float tY, float tZ, Tup3fR up)
	{
		return new Mat4f().initLookAt(oX, oY, oZ, tX, tY, tZ, up);
	}
	
	// MISSING_DOC
	public static Mat4fC lookAt(float oX, float oY, float oZ, float tX, float tY, float tZ, float uX, float uY, float uZ)
	{
		return new Mat4f().initLookAt(oX, oY, oZ, tX, tY, tZ, uX, uY, uZ);
	}
	
	// MISSING_DOC
	public static Mat4fC perspective(float fovY, float aspectRatio, float near, float far)
	{
		return new Mat4f().initPerspective(fovY, aspectRatio, near, far);
	}
	
	// MISSING_DOC
	public static Mat4fC ortho(float left, float right, float bottom, float top, float near, float far)
	{
		return new Mat4f().initOrtho(left, right, bottom, top, near, far);
	}

	/** {@inheritDoc} */
	@Override
	public float trace()
	{
		return this.m[0][0] + this.m[1][1] + this.m[2][2] + this.m[3][3];
	}
}
