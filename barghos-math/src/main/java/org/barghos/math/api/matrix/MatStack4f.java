package org.barghos.math.api.matrix;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

import org.barghos.core.api.tuple2.Tup2fC;
import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.tuple4.Tup4fC;
import org.barghos.math.matrix.Mat4f;

public class MatStack4f implements Mat4fR
{
	private List<Mat4fC> stack = new ArrayList<>();
	
	private transient Mat4fC current;
	
	private transient boolean isDirty;
	
	public MatStack4f push(Mat4f m)
	{
		this.stack.add(m);
		
		markDirty();
		
		return this;
	}
	
	public MatStack4f pop()
	{
		if(stack.size() == 0) return this;
		
		stack.remove(stack.size() - 1);
	
		markDirty();
		
		return this;
	}
	
	public MatStack4f markDirty()
	{
		this.isDirty = true;
		
		return this;
	}
	
	public MatStack4f computeIfDirty()
	{
		if(!this.isDirty) return this;
		
		Mat4fC m = Mat4f.identity();
		
		for(Mat4fC mat : this.stack)
			m.mul(mat);
		
		this.current = m;
		
		this.isDirty = false;
		
		return this;
	}
	
	public Mat4fC get()
	{
		computeIfDirty();
		
		return this.current;
	}
	
	public void pushFrame(Mat4f m)
	{
		push(m);
	}

	/** {@inheritDoc}} */
	@Override
	public float getCell(int row, int column)
	{
		return get().getCell(row, column);
	}

	/** {@inheritDoc}} */
	@Override
	public float[] getRow(int row, float[] res)
	{
		return get().getRow(row, res);
	}

	/** {@inheritDoc}} */
	@Override
	public float[] getColumn(int column, float[] res)
	{
		return get().getColumn(column, res);
	}
	
	/** {@inheritDoc}} */
	@Override
	public float[] toArrayRowMajor(float[] res)
	{
		return get().toArrayRowMajor(res);
	}

	/** {@inheritDoc}} */
	@Override
	public FloatBuffer toBufferRowMajor(FloatBuffer res)
	{
		return get().toBufferRowMajor(res);
	}

	/** {@inheritDoc}} */
	@Override
	public float[] toArrayColumnMajor(float[] res)
	{
		return get().toArrayColumnMajor(res);
	}

	/** {@inheritDoc}} */
	@Override
	public FloatBuffer toBufferColumnMajor(FloatBuffer res)
	{
		return get().toBufferColumnMajor(res);
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Tup2fC> T transform(float tX, float tY, boolean useZ, boolean useW, T res)
	{
		return get().transform(tX, tY, useZ, useW, res);
	}

	/** {@inheritDoc}} */
	@Override
	public float[] transform(float tX, float tY, boolean useZ, boolean useW, float[] res)
	{
		return get().transform(tX, tY, useZ, useW, res);
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Tup3fC> T transform(float tX, float tY, float tZ, boolean useW, T res)
	{
		return get().transform(tX, tY, tZ, useW, res);
	}

	/** {@inheritDoc}} */
	@Override
	public float[] transform(float tX, float tY, float tZ, boolean useW, float[] res)
	{
		return get().transform(tX, tY, useW, useW, res);
	}
	
	public class Frame implements AutoCloseable
	{
		public void close()
		{
			pop();
		}
	}

	public float getDeterminant()
	{
		return 0;
	}

	public float[][] toArray(float[][] res)
	{
		return null;
	}

	public <T extends Tup4fC> T transform(float tX, float tY, float tZ, float tW, T res)
	{
		return null;
	}

	public float[] transform(float tX, float tY, float tZ, float tW, float[] res)
	{
		return null;
	}

	public float trace()
	{
		return 0;
	}
}
