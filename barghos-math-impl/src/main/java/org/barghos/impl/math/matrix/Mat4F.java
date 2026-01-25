package org.barghos.impl.math.matrix;

import org.barghos.api.math.matrix.IMat4RF;
import org.barghos.api.math.matrix.IMat4WF;

public class Mat4F implements IMat4WF
{
	public float m00;
	public float m01;
	public float m02;
	public float m03;
	
	public float m10;
	public float m11;
	public float m12;
	public float m13;
	
	public float m20;
	public float m21;
	public float m22;
	public float m23;
	
	public float m30;
	public float m31;
	public float m32;
	public float m33;
	
	public Mat4F() { }
	
	public Mat4F(IMat4RF m)
	{
		set(m);
	}
	
	public Mat4F(float[] m)
	{
		set(m);
	}
	
	public Mat4F(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)
	{
		set(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
	}
	
	@Override
	public float m00()
	{
		return this.m00;
	}

	@Override
	public float m01()
	{
		return this.m01;
	}

	@Override
	public float m02()
	{
		return this.m02;
	}

	@Override
	public float m03()
	{
		return this.m03;
	}

	@Override
	public float m10()
	{
		return this.m10;
	}

	@Override
	public float m11()
	{
		return this.m11;
	}

	@Override
	public float m12()
	{
		return this.m12;
	}

	@Override
	public float m13()
	{
		return this.m13;
	}

	@Override
	public float m20()
	{
		return this.m20;
	}

	@Override
	public float m21()
	{
		return this.m21;
	}

	@Override
	public float m22()
	{
		return this.m22;
	}

	@Override
	public float m23()
	{
		return this.m23;
	}

	@Override
	public float m30()
	{
		return this.m30;
	}

	@Override
	public float m31()
	{
		return this.m31;
	}

	@Override
	public float m32()
	{
		return this.m32;
	}

	@Override
	public float m33()
	{
		return this.m33;
	}
	
	@Override
	public float at(int row, int col)
	{
		if(row < 0 || row > 3) throw new IndexOutOfBoundsException();
		if(col < 0 || col > 3) throw new IndexOutOfBoundsException();
		
		int index = col * 4 + row;
		
		return switch(index) {
			case  0 -> this.m00;
			case  1 -> this.m01;
			case  2 -> this.m02;
			case  3 -> this.m03;
			
			case  4 -> this.m10;
			case  5 -> this.m11;
			case  6 -> this.m12;
			case  7 -> this.m13;
			
			case  8 -> this.m20;
			case  9 -> this.m21;
			case 10 -> this.m22;
			case 11 -> this.m23;
			
			case 12 -> this.m20;
			case 13 -> this.m21;
			case 14 -> this.m22;
			case 15 -> this.m23;
			
			default -> throw new AssertionError();
		};
	}
	
	@Override
	public Mat4F m00(float value)
	{
		this.m00 = value;
		
		return this;
	}

	@Override
	public Mat4F m01(float value)
	{
		this.m01 = value;
		
		return this;
	}

	@Override
	public Mat4F m02(float value)
	{
		this.m02 = value;
		
		return this;
	}

	@Override
	public Mat4F m03(float value)
	{
		this.m03 = value;
		
		return this;
	}

	@Override
	public Mat4F m10(float value)
	{
		this.m10 = value;
		
		return this;
	}

	@Override
	public Mat4F m11(float value)
	{
		this.m11 = value;
		
		return this;
	}

	@Override
	public Mat4F m12(float value)
	{
		this.m12 = value;
		
		return this;
	}

	@Override
	public Mat4F m13(float value)
	{
		this.m13 = value;
		
		return this;
	}

	@Override
	public Mat4F m20(float value)
	{
		this.m20 = value;
		
		return this;
	}

	@Override
	public Mat4F m21(float value)
	{
		this.m21 = value;
		
		return this;
	}

	@Override
	public Mat4F m22(float value)
	{
		this.m22 = value;
		
		return this;
	}

	@Override
	public Mat4F m23(float value)
	{
		this.m23 = value;
		
		return this;
	}

	@Override
	public Mat4F m30(float value)
	{
		this.m30 = value;
		
		return this;
	}

	@Override
	public Mat4F m31(float value)
	{
		this.m31 = value;
		
		return this;
	}

	@Override
	public Mat4F m32(float value)
	{
		this.m32 = value;
		
		return this;
	}

	@Override
	public Mat4F m33(float value)
	{
		this.m32 = value;
		
		return this;
	}

	@Override
	public Mat4F at(int row, int col, float value)
	{
		if(row < 0 || row > 3) throw new IndexOutOfBoundsException();
		if(col < 0 || col > 3) throw new IndexOutOfBoundsException();
		
		int index = col * 4 + row;
		
		switch(index) {
			case  0 -> this.m00 = value;
			case  1 -> this.m01 = value;
			case  2 -> this.m02 = value;
			case  3 -> this.m03 = value;
			
			case  4 -> this.m10 = value;
			case  5 -> this.m11 = value;
			case  6 -> this.m12 = value;
			case  7 -> this.m13 = value;
			
			case  8 -> this.m20 = value;
			case  9 -> this.m21 = value;
			case 10 -> this.m22 = value;
			case 11 -> this.m23 = value;
			
			case 12 -> this.m20 = value;
			case 13 -> this.m21 = value;
			case 14 -> this.m22 = value;
			case 15 -> this.m23 = value;
			
			default -> throw new AssertionError();
		};
		
		return this;
	}
	
	@Override
	public Mat4F set(IMat4RF m)
	{
		this.m00 = m.m00();
		this.m01 = m.m01();
		this.m02 = m.m02();
		this.m03 = m.m03();
		
		this.m10 = m.m10();
		this.m11 = m.m11();
		this.m12 = m.m12();
		this.m13 = m.m13();

		this.m20 = m.m20();
		this.m21 = m.m21();
		this.m22 = m.m22();
		this.m23 = m.m23();
		
		this.m30 = m.m30();
		this.m31 = m.m31();
		this.m32 = m.m32();
		this.m33 = m.m33();
		
		return this;
	}

	@Override
	public Mat4F set(float[] m)
	{
		this.m00 = m[ 0];
		this.m01 = m[ 1];
		this.m02 = m[ 2];
		this.m03 = m[ 3];
		
		this.m10 = m[ 4];
		this.m11 = m[ 5];
		this.m12 = m[ 6];
		this.m13 = m[ 7];

		this.m20 = m[ 8];
		this.m21 = m[ 9];
		this.m22 = m[10];
		this.m23 = m[11];
		
		this.m30 = m[12];
		this.m31 = m[13];
		this.m32 = m[14];
		this.m33 = m[15];
		
		return this;
	}

	@Override
	public Mat4F set(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)
	{
		this.m00 = m00;
		this.m01 = m01;
		this.m02 = m02;
		this.m03 = m03;

		this.m10 = m10;
		this.m11 = m11;
		this.m12 = m12;
		this.m13 = m13;
		
		this.m20 = m20;
		this.m21 = m21;
		this.m22 = m22;
		this.m23 = m23;
		
		this.m30 = m30;
		this.m31 = m31;
		this.m32 = m32;
		this.m33 = m33;
		
		return this;
	}
	
	@Override
	public float[] toArray()
	{
		return new float[] {this.m00, this.m01, this.m02, this.m03, this.m10, this.m11, this.m12, this.m13, this.m20, this.m21, this.m22, this.m23, this.m30, this.m31, this.m32, this.m33};
	}

	@Override
	public float[] toArray(float[] res)
	{
		res[ 0] = this.m00;
		res[ 1] = this.m01;
		res[ 2] = this.m02;
		res[ 3] = this.m03;

		res[ 4] = this.m10;
		res[ 5] = this.m11;
		res[ 6] = this.m12;
		res[ 7] = this.m13;

		res[ 8] = this.m20;
		res[ 9] = this.m21;
		res[10] = this.m22;
		res[11] = this.m23;

		res[12] = this.m30;
		res[13] = this.m31;
		res[14] = this.m32;
		res[15] = this.m33;
		
		return res;
	}

	@Override
	public float[] toArrayRowMajor()
	{
		return new float[] {this.m00, this.m10, this.m20, this.m30, this.m01, this.m11, this.m21, this.m31, this.m02, this.m12, this.m22, this.m32, this.m03, this.m13, this.m23, this.m33};
	}

	@Override
	public float[] toArrayRowMajor(float[] res)
	{
		res[ 0] = this.m00;
		res[ 1] = this.m10;
		res[ 2] = this.m20;
		res[ 3] = this.m30;

		res[ 4] = this.m01;
		res[ 5] = this.m11;
		res[ 6] = this.m21;
		res[ 7] = this.m31;

		res[ 8] = this.m02;
		res[ 9] = this.m12;
		res[10] = this.m22;
		res[11] = this.m32;

		res[12] = this.m03;
		res[13] = this.m13;
		res[14] = this.m23;
		res[15] = this.m33;
		
		return res;
	}

	@Override
	public float[] toArrayColumnMajor()
	{
		return new float[] {this.m00, this.m01, this.m02, this.m03, this.m10, this.m11, this.m12, this.m13, this.m20, this.m21, this.m22, this.m23, this.m30, this.m31, this.m32, this.m33};
	}

	@Override
	public float[] toArrayColumnMajor(float[] res)
	{
		res[ 0] = this.m00;
		res[ 1] = this.m01;
		res[ 2] = this.m02;
		res[ 3] = this.m03;

		res[ 4] = this.m10;
		res[ 5] = this.m11;
		res[ 6] = this.m12;
		res[ 7] = this.m13;

		res[ 8] = this.m20;
		res[ 9] = this.m21;
		res[10] = this.m22;
		res[11] = this.m23;

		res[12] = this.m30;
		res[13] = this.m31;
		res[14] = this.m32;
		res[15] = this.m33;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return	"mat4f(" + 
				this.m00 + ", " + this.m10 + ", " + this.m20 + ", " + this.m30 + "\n" +
				this.m01 + ", " + this.m11 + ", " + this.m21 + ", " + this.m31 + "\n" +
				this.m02 + ", " + this.m12 + ", " + this.m22 + ", " + this.m32 + "\n" +
				this.m03 + ", " + this.m13 + ", " + this.m23 + ", " + this.m33 + ")";
	}
	
}
