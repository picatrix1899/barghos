package org.barghos.impl.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.function.floats.IFunc16F;
import org.barghos.api.core.function.floats.IFunc2F;
import org.barghos.api.core.function.floats.IFunc3F;
import org.barghos.api.core.function.floats.IFunc4F;
import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITup4WF;

public class Mat4F implements IMat4WF
{
	public static final IFunc16F<Mat4F> CTOR = Mat4F::new;
	
	private final float[] m = new float[SIZE];
	
	public Mat4F()
	{
		setIdentity();
	}
	
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
		return this.m[0];
	}

	@Override
	public float m01()
	{
		return this.m[1];
	}

	@Override
	public float m02()
	{
		return this.m[2];
	}

	@Override
	public float m03()
	{
		return this.m[3];
	}

	@Override
	public float m10()
	{
		return this.m[4];
	}

	@Override
	public float m11()
	{
		return this.m[5];
	}

	@Override
	public float m12()
	{
		return this.m[6];
	}

	@Override
	public float m13()
	{
		return this.m[7];
	}

	@Override
	public float m20()
	{
		return this.m[8];
	}

	@Override
	public float m21()
	{
		return this.m[9];
	}

	@Override
	public float m22()
	{
		return this.m[10];
	}

	@Override
	public float m23()
	{
		return this.m[11];
	}

	@Override
	public float m30()
	{
		return this.m[12];
	}

	@Override
	public float m31()
	{
		return this.m[13];
	}

	@Override
	public float m32()
	{
		return this.m[14];
	}

	@Override
	public float m33()
	{
		return this.m[15];
	}

	@Override
	public float[] getRow0()
	{
		return new float[] {this.m[0], this.m[4], this.m[8], this.m[12]};
	}

	@Override
	public float[] getRow0(float[] res)
	{
		res[0] = this.m[0];
		res[1] = this.m[4];
		res[2] = this.m[8];
		res[3] = this.m[12];
		
		return res;
	}

	@Override
	public float[] getRow1()
	{
		return new float[] {this.m[1], this.m[5], this.m[9], this.m[13]};
	}

	@Override
	public float[] getRow1(float[] res)
	{
		res[0] = this.m[1];
		res[1] = this.m[5];
		res[2] = this.m[9];
		res[3] = this.m[13];
		
		return res;
	}

	@Override
	public float[] getRow2()
	{
		return new float[] {this.m[2], this.m[6], this.m[10], this.m[14]};
	}

	@Override
	public float[] getRow2(float[] res)
	{
		res[0] = this.m[2];
		res[1] = this.m[6];
		res[2] = this.m[10];
		res[3] = this.m[14];
		
		return res;
	}

	@Override
	public float[] getRow3()
	{
		return new float[] {this.m[3], this.m[7], this.m[11], this.m[15]};
	}

	@Override
	public float[] getRow3(float[] res)
	{
		res[0] = this.m[3];
		res[1] = this.m[7];
		res[2] = this.m[11];
		res[3] = this.m[15];
		
		return res;
	}

	@Override
	public float[] getCol0()
	{
		return new float[] {this.m[0], this.m[1], this.m[2], this.m[3]};
	}

	@Override
	public float[] getCol0(float[] res)
	{
		System.arraycopy(this.m, 0, res, 0, 4);
		
		return res;
	}

	@Override
	public float[] getCol1()
	{
		return new float[] {this.m[4], this.m[5], this.m[6], this.m[7]};
	}

	@Override
	public float[] getCol1(float[] res)
	{
		System.arraycopy(this.m, 4, res, 0, 4);
		
		return res;
	}

	@Override
	public float[] getCol2()
	{
		return new float[] {this.m[8], this.m[9], this.m[10], this.m[11]};
	}

	@Override
	public float[] getCol2(float[] res)
	{
		System.arraycopy(this.m, 8, res, 0, 4);
		
		return res;
	}

	@Override
	public float[] getCol3()
	{
		return new float[] {this.m[12], this.m[13], this.m[14], this.m[15]};
	}

	@Override
	public float[] getCol3(float[] res)
	{
		System.arraycopy(this.m, 12, res, 0, 4);
		
		return res;
	}

	@Override
	public float[] getRowAt(int row)
	{
		return new float[] {this.m[row], this.m[4 + row], this.m[8 + row], this.m[12 + row]};
	}

	@Override
	public float[] getRowAt(int row, float[] res)
	{
		res[0] = this.m[row];
		res[1] = this.m[4 + row];
		res[2] = this.m[8 + row];
		res[3] = this.m[12 + row];
		
		return res;
	}

	@Override
	public float[] getColAt(int col)
	{
		int base = col * 4;
		
		return new float[] {this.m[base], this.m[base + 1], this.m[base + 2], this.m[base + 3]};
	}

	@Override
	public float[] getColAt(int col, float[] res)
	{
		int base = col * 4;
		
		res[0] = this.m[base];
		res[1] = this.m[base + 1];
		res[2] = this.m[base + 2];
		res[3] = this.m[base + 3];
		
		return res;
	}
	
	@Override
	public float getAt(int row, int col)
	{
		return this.m[col * 4 + row];
	}
	
	@Override
	public Mat4F m00(float value)
	{
		this.m[0] = value;
		
		return this;
	}

	@Override
	public Mat4F m01(float value)
	{
		this.m[1] = value;
		
		return this;
	}

	@Override
	public Mat4F m02(float value)
	{
		this.m[2] = value;
		
		return this;
	}

	@Override
	public Mat4F m03(float value)
	{
		this.m[3] = value;
		
		return this;
	}

	@Override
	public Mat4F m10(float value)
	{
		this.m[4] = value;
		
		return this;
	}

	@Override
	public Mat4F m11(float value)
	{
		this.m[5] = value;
		
		return this;
	}

	@Override
	public Mat4F m12(float value)
	{
		this.m[6] = value;
		
		return this;
	}

	@Override
	public Mat4F m13(float value)
	{
		this.m[7] = value;
		
		return this;
	}

	@Override
	public Mat4F m20(float value)
	{
		this.m[8] = value;
		
		return this;
	}

	@Override
	public Mat4F m21(float value)
	{
		this.m[9] = value;
		
		return this;
	}

	@Override
	public Mat4F m22(float value)
	{
		this.m[10] = value;
		
		return this;
	}

	@Override
	public Mat4F m23(float value)
	{
		this.m[11] = value;
		
		return this;
	}

	@Override
	public Mat4F m30(float value)
	{
		this.m[12] = value;
		
		return this;
	}

	@Override
	public Mat4F m31(float value)
	{
		this.m[13] = value;
		
		return this;
	}

	@Override
	public Mat4F m32(float value)
	{
		this.m[14] = value;
		
		return this;
	}

	@Override
	public Mat4F m33(float value)
	{
		this.m[14] = value;
		
		return this;
	}
	
	@Override
	public Mat4F setRow0(ITup4RF v)
	{
		this.m[0] = v.v0();
		this.m[4] = v.v1();
		this.m[8] = v.v2();
		this.m[12] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setRow0V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[0] = v0;
		this.m[4] = v.v0();
		this.m[8] = v.v1();
		this.m[12] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[0] = v.v0();
		this.m[4] = v1;
		this.m[8] = v.v1();
		this.m[12] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[0] = v.v0();
		this.m[4] = v.v1();
		this.m[8] = v2;
		this.m[12] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[0] = v.v0();
		this.m[4] = v.v1();
		this.m[8] = v.v2();
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[0] = v0;
		this.m[4] = v1;
		this.m[8] = v.v0();
		this.m[12] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow0V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[0] = v0;
		this.m[4] = v.v0();
		this.m[8] = v2;
		this.m[12] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow0V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[0] = v0;
		this.m[4] = v.v0();
		this.m[8] = v.v1();
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[0] = v.v0();
		this.m[4] = v1;
		this.m[8] = v2;
		this.m[12] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[0] = v.v0();
		this.m[4] = v1;
		this.m[8] = v.v1();
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[0] = v.v0();
		this.m[4] = v.v1();
		this.m[8] = v2;
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0(float[] v)
	{
		this.m[0] = v[0];
		this.m[4] = v[1];
		this.m[8] = v[2];
		this.m[12] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setRow0V1V2V3V0(float[] v, float v0)
	{
		this.m[0] = v0;
		this.m[4] = v[0];
		this.m[8] = v[1];
		this.m[12] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V2V3V1(float[] v, float v1)
	{
		this.m[0] = v[0];
		this.m[4] = v1;
		this.m[8] = v[1];
		this.m[12] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V1V3V2(float[] v, float v2)
	{
		this.m[0] = v[0];
		this.m[4] = v[1];
		this.m[8] = v2;
		this.m[12] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V1V2V3(float[] v, float v3)
	{
		this.m[0] = v[0];
		this.m[4] = v[1];
		this.m[8] = v[2];
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[0] = v0;
		this.m[4] = v1;
		this.m[8] = v[0];
		this.m[12] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow0V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[0] = v0;
		this.m[4] = v[0];
		this.m[8] = v2;
		this.m[12] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow0V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[0] = v0;
		this.m[4] = v[0];
		this.m[8] = v[1];
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[0] = v[0];
		this.m[4] = v1;
		this.m[8] = v2;
		this.m[12] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[0] = v[0];
		this.m[4] = v1;
		this.m[8] = v[1];
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[0] = v[0];
		this.m[4] = v[1];
		this.m[8] = v2;
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow0(float v0, float v1, float v2, float v3)
	{
		this.m[0] = v0;
		this.m[4] = v1;
		this.m[8] = v2;
		this.m[12] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1(ITup4RF v)
	{
		this.m[1] = v.v0();
		this.m[5] = v.v1();
		this.m[9] = v.v2();
		this.m[13] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setRow1V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[1] = v0;
		this.m[5] = v.v0();
		this.m[9] = v.v1();
		this.m[13] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[1] = v.v0();
		this.m[5] = v1;
		this.m[9] = v.v1();
		this.m[13] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[1] = v.v0();
		this.m[5] = v.v1();
		this.m[9] = v2;
		this.m[13] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[1] = v.v0();
		this.m[5] = v.v1();
		this.m[9] = v.v2();
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[1] = v0;
		this.m[5] = v1;
		this.m[9] = v.v0();
		this.m[13] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow1V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[1] = v0;
		this.m[5] = v.v0();
		this.m[9] = v2;
		this.m[13] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow1V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[1] = v0;
		this.m[5] = v.v0();
		this.m[9] = v.v1();
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[1] = v.v0();
		this.m[5] = v1;
		this.m[9] = v2;
		this.m[13] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[1] = v.v0();
		this.m[5] = v1;
		this.m[9] = v.v1();
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[1] = v.v0();
		this.m[5] = v.v1();
		this.m[9] = v2;
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1(float[] v)
	{
		this.m[1] = v[0];
		this.m[5] = v[1];
		this.m[9] = v[2];
		this.m[13] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setRow1V1V2V3V0(float[] v, float v0)
	{
		this.m[1] = v0;
		this.m[5] = v[0];
		this.m[9] = v[1];
		this.m[13] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V2V3V1(float[] v, float v1)
	{
		this.m[1] = v[0];
		this.m[5] = v1;
		this.m[9] = v[1];
		this.m[13] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V1V3V2(float[] v, float v2)
	{
		this.m[1] = v[0];
		this.m[5] = v[1];
		this.m[9] = v2;
		this.m[13] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V1V2V3(float[] v, float v3)
	{
		this.m[1] = v[0];
		this.m[5] = v[1];
		this.m[9] = v[2];
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[1] = v0;
		this.m[5] = v1;
		this.m[9] = v[0];
		this.m[13] = v[31];
		
		return this;
	}

	@Override
	public Mat4F setRow1V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[1] = v0;
		this.m[5] = v[0];
		this.m[9] = v2;
		this.m[13] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow1V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[1] = v0;
		this.m[5] = v[0];
		this.m[9] = v[1];
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[1] = v[0];
		this.m[5] = v1;
		this.m[9] = v2;
		this.m[13] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[1] = v[0];
		this.m[5] = v1;
		this.m[9] = v[1];
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[1] = v[0];
		this.m[5] = v[1];
		this.m[9] = v2;
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow1(float v0, float v1, float v2, float v3)
	{
		this.m[1] = v0;
		this.m[5] = v1;
		this.m[9] = v2;
		this.m[13] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2(ITup4RF v)
	{
		this.m[2] = v.v0();
		this.m[6] = v.v1();
		this.m[10] = v.v2();
		this.m[14] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setRow2V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[2] = v0;
		this.m[6] = v.v0();
		this.m[10] = v.v1();
		this.m[14] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[2] = v.v0();
		this.m[6] = v1;
		this.m[10] = v.v1();
		this.m[14] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[2] = v.v0();
		this.m[6] = v.v1();
		this.m[10] = v2;
		this.m[14] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[2] = v.v0();
		this.m[6] = v.v1();
		this.m[10] = v.v2();
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[2] = v0;
		this.m[6] = v1;
		this.m[10] = v.v0();
		this.m[14] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow2V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[2] = v0;
		this.m[6] = v.v0();
		this.m[10] = v2;
		this.m[14] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow2V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[2] = v0;
		this.m[6] = v.v0();
		this.m[10] = v.v1();
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[2] = v.v0();
		this.m[6] = v1;
		this.m[10] = v2;
		this.m[14] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[2] = v.v0();
		this.m[6] = v1;
		this.m[10] = v.v1();
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[2] = v.v0();
		this.m[6] = v.v1();
		this.m[10] = v2;
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2(float[] v)
	{
		this.m[2] = v[0];
		this.m[6] = v[1];
		this.m[10] = v[2];
		this.m[14] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setRow2V1V2V3V0(float[] v, float v0)
	{
		this.m[2] = v0;
		this.m[6] = v[0];
		this.m[10] = v[1];
		this.m[14] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V2V3V1(float[] v, float v1)
	{
		this.m[2] = v[0];
		this.m[6] = v1;
		this.m[10] = v[1];
		this.m[14] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V1V3V2(float[] v, float v2)
	{
		this.m[2] = v[0];
		this.m[6] = v[1];
		this.m[10] = v2;
		this.m[14] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V1V2V3(float[] v, float v3)
	{
		this.m[2] = v[0];
		this.m[6] = v[1];
		this.m[10] = v[2];
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[2] = v0;
		this.m[6] = v1;
		this.m[10] = v[0];
		this.m[14] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow2V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[2] = v0;
		this.m[6] = v[0];
		this.m[10] = v2;
		this.m[14] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow2V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[2] = v0;
		this.m[6] = v[0];
		this.m[10] = v[1];
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[2] = v[0];
		this.m[6] = v1;
		this.m[10] = v2;
		this.m[14] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[2] = v[0];
		this.m[6] = v1;
		this.m[10] = v[1];
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[2] = v[0];
		this.m[6] = v[1];
		this.m[10] = v2;
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow2(float v0, float v1, float v2, float v3)
	{
		this.m[2] = v0;
		this.m[6] = v1;
		this.m[10] = v2;
		this.m[14] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3(ITup4RF v)
	{
		this.m[3] = v.v0();
		this.m[7] = v.v1();
		this.m[11] = v.v2();
		this.m[15] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setRow3V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[3] = v0;
		this.m[7] = v.v0();
		this.m[11] = v.v1();
		this.m[15] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[3] = v.v0();
		this.m[7] = v1;
		this.m[11] = v.v1();
		this.m[15] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[3] = v.v0();
		this.m[7] = v.v1();
		this.m[11] = v2;
		this.m[15] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[3] = v.v0();
		this.m[7] = v.v1();
		this.m[11] = v.v2();
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[3] = v0;
		this.m[7] = v1;
		this.m[11] = v.v0();
		this.m[15] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow3V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[3] = v0;
		this.m[7] = v.v0();
		this.m[11] = v2;
		this.m[15] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow3V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[3] = v0;
		this.m[7] = v.v0();
		this.m[11] = v.v1();
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[3] = v.v0();
		this.m[7] = v1;
		this.m[11] = v2;
		this.m[15] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[3] = v.v0();
		this.m[7] = v1;
		this.m[11] = v.v1();
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[3] = v.v0();
		this.m[7] = v.v1();
		this.m[11] = v2;
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3(float[] v)
	{
		this.m[3] = v[0];
		this.m[7] = v[1];
		this.m[11] = v[2];
		this.m[15] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setRow3V1V2V3V0(float[] v, float v0)
	{
		this.m[3] = v0;
		this.m[7] = v[0];
		this.m[11] = v[1];
		this.m[15] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V2V3V1(float[] v, float v1)
	{
		this.m[3] = v[0];
		this.m[7] = v1;
		this.m[11] = v[1];
		this.m[15] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V1V3V2(float[] v, float v2)
	{
		this.m[3] = v[0];
		this.m[7] = v[1];
		this.m[11] = v2;
		this.m[15] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V1V2V3(float[] v, float v3)
	{
		this.m[3] = v[0];
		this.m[7] = v[1];
		this.m[11] = v[2];
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[3] = v0;
		this.m[7] = v1;
		this.m[11] = v[0];
		this.m[15] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow3V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[3] = v0;
		this.m[7] = v[0];
		this.m[11] = v2;
		this.m[15] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow3V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[3] = v0;
		this.m[7] = v[0];
		this.m[11] = v[1];
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[3] = v[0];
		this.m[7] = v1;
		this.m[11] = v2;
		this.m[15] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[3] = v[0];
		this.m[7] = v1;
		this.m[11] = v[1];
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[3] = v[0];
		this.m[7] = v[1];
		this.m[11] = v2;
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setRow3(float v0, float v1, float v2, float v3)
	{
		this.m[3] = v0;
		this.m[7] = v1;
		this.m[11] = v2;
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0(ITup4RF v)
	{
		this.m[0] = v.v0();
		this.m[1] = v.v1();
		this.m[2] = v.v2();
		this.m[3] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setCol0V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[0] = v0;
		this.m[1] = v.v0();
		this.m[2] = v.v1();
		this.m[3] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[0] = v.v0();
		this.m[1] = v1;
		this.m[2] = v.v1();
		this.m[3] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[0] = v.v0();
		this.m[1] = v.v1();
		this.m[2] = v2;
		this.m[3] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[0] = v.v0();
		this.m[1] = v.v1();
		this.m[2] = v.v2();
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[0] = v0;
		this.m[1] = v1;
		this.m[2] = v.v0();
		this.m[3] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol0V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[0] = v0;
		this.m[1] = v.v0();
		this.m[2] = v2;
		this.m[3] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol0V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[0] = v0;
		this.m[1] = v.v0();
		this.m[2] = v.v1();
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[0] = v.v0();
		this.m[1] = v1;
		this.m[2] = v2;
		this.m[3] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[0] = v.v0();
		this.m[1] = v1;
		this.m[2] = v.v1();
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[0] = v.v0();
		this.m[1] = v.v1();
		this.m[2] = v2;
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0(float[] v)
	{
		this.m[0] = v[0];
		this.m[1] = v[1];
		this.m[2] = v[2];
		this.m[3] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setCol0V1V2V3V0(float[] v, float v0)
	{
		this.m[0] = v0;
		this.m[1] = v[0];
		this.m[2] = v[1];
		this.m[3] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V2V3V1(float[] v, float v1)
	{
		this.m[0] = v[0];
		this.m[1] = v1;
		this.m[2] = v[1];
		this.m[3] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V1V3V2(float[] v, float v2)
	{
		this.m[0] = v[0];
		this.m[1] = v[1];
		this.m[2] = v2;
		this.m[3] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V1V2V3(float[] v, float v3)
	{
		this.m[0] = v[0];
		this.m[1] = v[1];
		this.m[2] = v[2];
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[0] = v0;
		this.m[1] = v1;
		this.m[2] = v[0];
		this.m[3] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol0V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[0] = v0;
		this.m[1] = v[0];
		this.m[2] = v2;
		this.m[3] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol0V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[0] = v0;
		this.m[1] = v[0];
		this.m[2] = v[1];
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[0] = v[0];
		this.m[1] = v1;
		this.m[2] = v2;
		this.m[3] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[0] = v[0];
		this.m[1] = v1;
		this.m[2] = v[1];
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[0] = v[0];
		this.m[1] = v[1];
		this.m[2] = v2;
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol0(float v0, float v1, float v2, float v3)
	{
		this.m[0] = v0;
		this.m[1] = v1;
		this.m[2] = v2;
		this.m[3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1(ITup4RF v)
	{
		this.m[4] = v.v0();
		this.m[5] = v.v1();
		this.m[6] = v.v2();
		this.m[7] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setCol1V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[4] = v0;
		this.m[5] = v.v0();
		this.m[6] = v.v1();
		this.m[7] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[4] = v.v0();
		this.m[5] = v1;
		this.m[6] = v.v1();
		this.m[7] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[4] = v.v0();
		this.m[5] = v.v1();
		this.m[6] = v2;
		this.m[7] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[4] = v.v0();
		this.m[5] = v.v1();
		this.m[6] = v.v2();
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[4] = v0;
		this.m[5] = v1;
		this.m[6] = v.v0();
		this.m[7] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol1V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[4] = v0;
		this.m[5] = v.v0();
		this.m[6] = v2;
		this.m[7] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol1V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[4] = v0;
		this.m[5] = v.v0();
		this.m[6] = v.v1();
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[4] = v.v0();
		this.m[5] = v1;
		this.m[6] = v2;
		this.m[7] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[4] = v.v0();
		this.m[5] = v1;
		this.m[6] = v.v1();
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[4] = v.v0();
		this.m[5] = v.v1();
		this.m[6] = v2;
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1(float[] v)
	{
		this.m[4] = v[0];
		this.m[5] = v[1];
		this.m[6] = v[2];
		this.m[7] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setCol1V1V2V3V0(float[] v, float v0)
	{
		this.m[4] = v0;
		this.m[5] = v[0];
		this.m[6] = v[1];
		this.m[7] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V2V3V1(float[] v, float v1)
	{
		this.m[4] = v[0];
		this.m[5] = v1;
		this.m[6] = v[1];
		this.m[7] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V1V3V2(float[] v, float v2)
	{
		this.m[4] = v[0];
		this.m[5] = v[1];
		this.m[6] = v2;
		this.m[7] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V1V2V3(float[] v, float v3)
	{
		this.m[4] = v[0];
		this.m[5] = v[1];
		this.m[6] = v[2];
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[4] = v0;
		this.m[5] = v1;
		this.m[6] = v[0];
		this.m[7] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol1V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[4] = v0;
		this.m[5] = v[0];
		this.m[6] = v2;
		this.m[7] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol1V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[4] = v0;
		this.m[5] = v[0];
		this.m[6] = v[1];
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[4] = v[0];
		this.m[5] = v1;
		this.m[6] = v2;
		this.m[7] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[4] = v[0];
		this.m[5] = v1;
		this.m[6] = v[1];
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[4] = v[0];
		this.m[5] = v[1];
		this.m[6] = v2;
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol1(float v0, float v1, float v2, float v3)
	{
		this.m[4] = v0;
		this.m[5] = v1;
		this.m[6] = v2;
		this.m[7] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2(ITup4RF v)
	{
		this.m[8] = v.v0();
		this.m[9] = v.v1();
		this.m[10] = v.v2();
		this.m[11] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setCol2V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[8] = v0;
		this.m[9] = v.v0();
		this.m[10] = v.v1();
		this.m[11] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[8] = v.v0();
		this.m[9] = v1;
		this.m[10] = v.v1();
		this.m[11] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[8] = v.v0();
		this.m[9] = v.v1();
		this.m[10] = v2;
		this.m[11] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[8] = v.v0();
		this.m[9] = v.v1();
		this.m[10] = v.v2();
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[8] = v0;
		this.m[9] = v1;
		this.m[10] = v.v0();
		this.m[11] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol2V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[8] = v0;
		this.m[9] = v.v0();
		this.m[10] = v2;
		this.m[11] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol2V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[8] = v0;
		this.m[9] = v.v0();
		this.m[10] = v.v1();
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[8] = v.v0();
		this.m[9] = v1;
		this.m[10] = v2;
		this.m[11] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[8] = v.v0();
		this.m[9] = v1;
		this.m[10] = v.v1();
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[8] = v.v0();
		this.m[9] = v.v1();
		this.m[10] = v2;
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2(float[] v)
	{
		this.m[8] = v[0];
		this.m[9] = v[1];
		this.m[10] = v[2];
		this.m[11] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setCol2V1V2V3V0(float[] v, float v0)
	{
		this.m[8] = v0;
		this.m[9] = v[0];
		this.m[10] = v[1];
		this.m[11] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V2V3V1(float[] v, float v1)
	{
		this.m[8] = v[0];
		this.m[9] = v1;
		this.m[10] = v[1];
		this.m[11] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V1V3V2(float[] v, float v2)
	{
		this.m[8] = v[0];
		this.m[9] = v[1];
		this.m[10] = v2;
		this.m[11] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V1V2V3(float[] v, float v3)
	{
		this.m[8] = v[0];
		this.m[9] = v[1];
		this.m[10] = v[2];
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[8] = v0;
		this.m[9] = v1;
		this.m[10] = v[0];
		this.m[11] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol2V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[8] = v0;
		this.m[9] = v[0];
		this.m[10] = v2;
		this.m[11] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol2V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[8] = v0;
		this.m[9] = v[0];
		this.m[10] = v[1];
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[8] = v[0];
		this.m[9] = v1;
		this.m[10] = v2;
		this.m[11] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[8] = v[0];
		this.m[9] = v1;
		this.m[10] = v[1];
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[8] = v[0];
		this.m[9] = v[1];
		this.m[10] = v2;
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol2(float v0, float v1, float v2, float v3)
	{
		this.m[8] = v0;
		this.m[9] = v1;
		this.m[10] = v2;
		this.m[11] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3(ITup4RF v)
	{
		this.m[12] = v.v0();
		this.m[13] = v.v1();
		this.m[14] = v.v2();
		this.m[15] = v.v3();
		
		return this;
	}

	@Override
	public Mat4F setCol3V1V2V3V0(ITup3RF v, float v0)
	{
		this.m[12] = v0;
		this.m[13] = v.v0();
		this.m[14] = v.v1();
		this.m[15] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V2V3V1(ITup3RF v, float v1)
	{
		this.m[12] = v.v0();
		this.m[13] = v1;
		this.m[14] = v.v1();
		this.m[15] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V1V3V2(ITup3RF v, float v2)
	{
		this.m[12] = v.v0();
		this.m[13] = v.v1();
		this.m[14] = v2;
		this.m[15] = v.v2();
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V1V2V3(ITup3RF v, float v3)
	{
		this.m[12] = v.v0();
		this.m[13] = v.v1();
		this.m[14] = v.v2();
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3V2V3V0V1(ITup2RF v, float v0, float v1)
	{
		this.m[12] = v0;
		this.m[13] = v1;
		this.m[14] = v.v0();
		this.m[15] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol3V1V3V0V2(ITup2RF v, float v0, float v2)
	{
		this.m[12] = v0;
		this.m[13] = v.v0();
		this.m[14] = v2;
		this.m[15] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol3V1V2V0V3(ITup2RF v, float v0, float v3)
	{
		this.m[12] = v0;
		this.m[13] = v.v0();
		this.m[14] = v.v1();
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V3V1V2(ITup2RF v, float v1, float v2)
	{
		this.m[12] = v.v0();
		this.m[13] = v1;
		this.m[14] = v2;
		this.m[15] = v.v1();
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V2V1V3(ITup2RF v, float v1, float v3)
	{
		this.m[12] = v.v0();
		this.m[13] = v1;
		this.m[14] = v.v1();
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V1V2V3(ITup2RF v, float v2, float v3)
	{
		this.m[12] = v.v0();
		this.m[13] = v.v1();
		this.m[14] = v2;
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3(float[] v)
	{
		this.m[12] = v[0];
		this.m[13] = v[1];
		this.m[14] = v[2];
		this.m[15] = v[3];
		
		return this;
	}

	@Override
	public Mat4F setCol3V1V2V3V0(float[] v, float v0)
	{
		this.m[12] = v0;
		this.m[13] = v[0];
		this.m[14] = v[1];
		this.m[15] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V2V3V1(float[] v, float v1)
	{
		this.m[12] = v[0];
		this.m[13] = v1;
		this.m[14] = v[1];
		this.m[15] = v[2];
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V1V3V2(float[] v, float v2)
	{
		this.m[12] = v[0];
		this.m[13] = v[1];
		this.m[14] = v2;
		this.m[15] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V1V2V3(float[] v, float v3)
	{
		this.m[12] = v[0];
		this.m[13] = v[1];
		this.m[14] = v[2];
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3V2V3V0V1(float[] v, float v0, float v1)
	{
		this.m[12] = v0;
		this.m[13] = v1;
		this.m[14] = v[0];
		this.m[15] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol3V1V3V0V2(float[] v, float v0, float v2)
	{
		this.m[12] = v0;
		this.m[13] = v[0];
		this.m[14] = v2;
		this.m[15] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol3V1V2V0V3(float[] v, float v0, float v3)
	{
		this.m[12] = v0;
		this.m[13] = v[0];
		this.m[14] = v[1];
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V3V1V2(float[] v, float v1, float v2)
	{
		this.m[12] = v[0];
		this.m[13] = v1;
		this.m[14] = v2;
		this.m[15] = v[1];
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V2V1V3(float[] v, float v1, float v3)
	{
		this.m[12] = v[0];
		this.m[13] = v1;
		this.m[14] = v[1];
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3V0V1V2V3(float[] v, float v2, float v3)
	{
		this.m[12] = v[0];
		this.m[13] = v[1];
		this.m[14] = v2;
		this.m[15] = v3;
		
		return this;
	}

	@Override
	public Mat4F setCol3(float v0, float v1, float v2, float v3)
	{
		this.m[12] = v0;
		this.m[13] = v1;
		this.m[14] = v2;
		this.m[15] = v3;
		
		return this;
	}
	
	@Override
	public Mat4F setRowAt(int row, float[] values)
	{
		this.m[row] = values[0];
		this.m[4 + row] = values[1];
		this.m[8 + row] = values[2];
		this.m[12 + row] = values[3];
		
		return this;
	}

	@Override
	public Mat4F setRowAt(int row, float v0, float v1, float v2, float v3)
	{
		this.m[row] = v0;
		this.m[4 + row] = v1;
		this.m[8 + row] = v2;
		this.m[12 + row] = v3;
		
		return this;
	}

	@Override
	public Mat4F setColAt(int col, float[] values)
	{
		int base = col * 4;
		
		this.m[base] = values[0];
		this.m[base + 1] = values[1];
		this.m[base + 2] = values[2];
		this.m[base + 3] = values[3];
		
		return this;
	}

	@Override
	public Mat4F setColAt(int col, float v0, float v1, float v2, float v3)
	{
		int base = col * 4;
		
		this.m[base] = v0;
		this.m[base + 1] = v1;
		this.m[base + 2] = v2;
		this.m[base + 3] = v3;
		
		return this;
	}

	@Override
	public Mat4F setAt(int row, int col, float value)
	{
		this.m[col * 4 + row] = value;
		
		return this;
	}
	
	@Override
	public Mat4F set(IMat4RF m)
	{
		m.toArray(this.m);
		
		return this;
	}

	@Override
	public Mat4F set(float[] m)
	{
		System.arraycopy(m, 0, this.m, 0, 16);
		
		return this;
	}

	@Override
	public Mat4F set(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)
	{
		this.m[0] = m00;
		this.m[1] = m01;
		this.m[2] = m02;
		this.m[3] = m03;

		this.m[4] = m10;
		this.m[5] = m11;
		this.m[6] = m12;
		this.m[7] = m13;
		
		this.m[8] = m20;
		this.m[9] = m21;
		this.m[10] = m22;
		this.m[11] = m23;
		
		this.m[12] = m30;
		this.m[13] = m31;
		this.m[14] = m32;
		this.m[15] = m33;
		
		return this;
	}
	
	@Override
	public float[] toArray()
	{
		float[] res = new float[16];
		
		System.arraycopy(this.m, 0, res, 0, 16);
		
		return res;
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.m, 0, res, 0, 16);
		
		return res;
	}

	@Override
	public float[] toArrayRowMajor()
	{
		float[] res = new float[16];

		MatUtils4F.transpose(this.m, res);
		
		return res;
	}

	@Override
	public float[] toArrayRowMajor(float[] res)
	{
		MatUtils4F.transpose(this.m, res);
		
		return res;
	}

	@Override
	public float[] toArrayColumnMajor()
	{
		float[] res = new float[16];
		
		System.arraycopy(this.m, 0, res, 0, 16);
		
		return res;
	}

	@Override
	public float[] toArrayColumnMajor(float[] res)
	{
		System.arraycopy(this.m, 0, res, 0, 16);
		
		return res;
	}
	
	@Override
	public float trace()
	{
		return MatUtils4F.trace(this.m);
	}

	@Override
	public float det()
	{
		return MatUtils4F.det(this.m);
	}

	@Override
	public Mat4F invert()
	{
		MatUtils4F.invert(this.m, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F invertN()
	{
		return MatUtils4F.invertFunc(this.m, CTOR);
	}

	@Override
	public Mat4F transpose()
	{
		MatUtils4F.transpose(this.m, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F transposeN()
	{
		return MatUtils4F.transposeFunc(this.m, CTOR);
	}

	@Override
	public Mat4F mul(IMat4RF m)
	{
		MatUtils4F.mul(m, this.m, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F mulN(IMat4RF m)
	{
		return MatUtils4F.mulFunc(m, this.m, CTOR);
	}

	@Override
	public Mat4F revMul(IMat4RF m)
	{
		MatUtils4F.mul(this.m, m, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F revMulN(IMat4RF m)
	{
		return MatUtils4F.mulFunc(this.m, m, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return	"mat4f(" + 
				m[0] + ", " + m[4] + ", " + m[8] + ", " + m[12] + "\n" +
				m[1] + ", " + m[5] + ", " + m[9] + ", " + m[13] + "\n" +
				m[2] + ", " + m[6] + ", " + m[10] + ", " + m[14] + "\n" +
				m[3] + ", " + m[7] + ", " + m[11] + ", " + m[15] + ")";
	}
	
	public float[] transform2T(boolean isPoint, ITup2RF v, @ExtractionParam float[] res)
	{
		MatUtils4F.transform2(isPoint, v, this.m, res);
		
		return res;
	}
	
	public float[] transform2T(boolean isPoint, float[] v, @ExtractionParam float[] res)
	{
		MatUtils4F.transform2(isPoint, v, this.m, res);
		
		return res;
	}
	
	public float[] transform2T(boolean isPoint, float v0, float v1, @ExtractionParam float[] res)
	{
		MatUtils4F.transform2(isPoint, v0, v1, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transform2T(boolean isPoint, ITup2RF v, @ExtractionParam T res)
	{
		MatUtils4F.transform2(isPoint, v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transform2T(boolean isPoint, float[] v, @ExtractionParam T res)
	{
		MatUtils4F.transform2(isPoint, v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transform2T(boolean isPoint, float v0, float v1, @ExtractionParam T res)
	{
		MatUtils4F.transform2(isPoint, v0, v1, this.m, res);
		
		return res;
	}
	
	public <T> T transform2Func(boolean isPoint, ITup2RF v, IFunc2F<T> func)
	{
		return MatUtils4F.transform2Func(isPoint, v, this.m, func);
	}
	
	public <T> T transform2Func(boolean isPoint, float[] v, IFunc2F<T> func)
	{
		return MatUtils4F.transform2Func(isPoint, v, this.m, func);
	}
	
	public <T> T transform2Func(boolean isPoint, float v0, float v1, IFunc2F<T> func)
	{
		return MatUtils4F.transform2Func(isPoint, v0, v1, this.m, func);
	}
	
	public float[] transformPoint2T(ITup2RF v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformPoint2(v, this.m, res);
		
		return res;
	}
	
	public float[] transformPoint2T(float[] v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformPoint2(v, this.m, res);
		
		return res;
	}
	
	public float[] transformPoint2T(float v0, float v1, @ExtractionParam float[] res)
	{
		MatUtils4F.transformPoint2(v0, v1, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transformPoint2T(ITup2RF v, @ExtractionParam T res)
	{
		MatUtils4F.transformPoint2(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transformPoint2T(float[] v, @ExtractionParam T res)
	{
		MatUtils4F.transformPoint2(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transformPoint2T(float v0, float v1, @ExtractionParam T res)
	{
		MatUtils4F.transformPoint2(v0, v1, this.m, res);
		
		return res;
	}
	
	public <T> T transformPoint2Func(ITup2RF v, IFunc2F<T> func)
	{
		return MatUtils4F.transformPoint2Func(v, this.m, func);
	}
	
	public <T> T transformPoint2Func(float[] v, IFunc2F<T> func)
	{
		return MatUtils4F.transformPoint2Func(v, this.m, func);
	}
	
	public <T> T transformPoint2Func(float v0, float v1, IFunc2F<T> func)
	{
		return MatUtils4F.transformPoint2Func(v0, v1, this.m, func);
	}
	
	public float[] transformVec2T(ITup2RF v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformVec2(v, this.m, res);
		
		return res;
	}
	
	public float[] transformVec2T(float[] v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformVec2(v, this.m, res);
		
		return res;
	}
	
	public float[] transformVec2T(float v0, float v1, @ExtractionParam float[] res)
	{
		MatUtils4F.transformVec2(v0, v1, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transformVec2T(ITup2RF v, @ExtractionParam T res)
	{
		MatUtils4F.transformVec2(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transformVec2T(float[] v, @ExtractionParam T res)
	{
		MatUtils4F.transformVec2(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup2WF> T transformVec2T(float v0, float v1, @ExtractionParam T res)
	{
		MatUtils4F.transformVec2(v0, v1, this.m, res);
		
		return res;
	}
	
	public <T> T transformVec2Func(ITup2RF v, IFunc2F<T> func)
	{
		return MatUtils4F.transformVec2Func(v, this.m, func);
	}
	
	public <T> T transformVec2Func(float[] v, IFunc2F<T> func)
	{
		return MatUtils4F.transformVec2Func(v, this.m, func);
	}
	
	public <T> T transformVec2Func(float v0, float v1, IFunc2F<T> func)
	{
		return MatUtils4F.transformVec2Func(v0, v1, this.m, func);
	}
	
	public float[] transform3T(boolean isPoint, ITup3RF v, @ExtractionParam float[] res)
	{
		MatUtils4F.transform3(isPoint, v, this.m, res);
		
		return res;
	}
	
	public float[] transform3T(boolean isPoint, float[] v, @ExtractionParam float[] res)
	{
		MatUtils4F.transform3(isPoint, v, this.m, res);
		
		return res;
	}
	
	public float[] transform3T(boolean isPoint, float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		MatUtils4F.transform3(isPoint, v0, v1, v2, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transform3T(boolean isPoint, ITup3RF v, @ExtractionParam T res)
	{
		MatUtils4F.transform3(isPoint, v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transform3T(boolean isPoint, float[] v, @ExtractionParam T res)
	{
		MatUtils4F.transform3(isPoint, v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transform3T(boolean isPoint, float v0, float v1, float v2, @ExtractionParam T res)
	{
		MatUtils4F.transform3(isPoint, v0, v1, v2, this.m, res);
		
		return res;
	}
	
	public <T> T transform3Func(boolean isPoint, ITup3RF v, IFunc3F<T> func)
	{
		return MatUtils4F.transform3Func(isPoint, v, this.m, func);
	}
	
	public <T> T transform3Func(boolean isPoint, float[] v, IFunc3F<T> func)
	{
		return MatUtils4F.transform3Func(isPoint, v, this.m, func);
	}
	
	public <T> T transform3Func(boolean isPoint, float v0, float v1, float v2, IFunc3F<T> func)
	{
		return MatUtils4F.transform3Func(isPoint, v0, v1, v2, this.m, func);
	}
	
	public float[] transformPoint3T(ITup3RF v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformPoint3(v, this.m, res);
		
		return res;
	}
	
	public float[] transformPoint3T(float[] v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformPoint3(v, this.m, res);
		
		return res;
	}
	
	public float[] transformPoint3T(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		MatUtils4F.transformPoint3(v0, v1, v2, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transformPoint3T(ITup3RF v, @ExtractionParam T res)
	{
		MatUtils4F.transformPoint3(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transformPoint3T(float[] v, @ExtractionParam T res)
	{
		MatUtils4F.transformPoint3(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transformPoint3T(float v0, float v1, float v2, @ExtractionParam T res)
	{
		MatUtils4F.transformPoint3(v0, v1, v2, this.m, res);
		
		return res;
	}
	
	public <T> T transformPoint3Func(ITup3RF v, IFunc3F<T> func)
	{
		return MatUtils4F.transformPoint3Func(v, this.m, func);
	}
	
	public <T> T transformPoint3Func(float[] v, IFunc3F<T> func)
	{
		return MatUtils4F.transformPoint3Func(v, this.m, func);
	}
	
	public <T> T transformPoint3Func(float v0, float v1, float v2, IFunc3F<T> func)
	{
		return MatUtils4F.transformPoint3Func(v0, v1, v2, this.m, func);
	}
	
	public float[] transformVec3T(ITup3RF v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformVec3(v, this.m, res);
		
		return res;
	}
	
	public float[] transformVec3T(float[] v, @ExtractionParam float[] res)
	{
		MatUtils4F.transformVec3(v, this.m, res);
		
		return res;
	}
	
	public float[] transformVec3T(float v0, float v1, float v2, @ExtractionParam float[] res)
	{
		MatUtils4F.transformVec3(v0, v1, v2, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transformVec3T(ITup3RF v, @ExtractionParam T res)
	{
		MatUtils4F.transformVec3(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transformVec3T(float[] v, @ExtractionParam T res)
	{
		MatUtils4F.transformVec3(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup3WF> T transformVec3T(float v0, float v1, float v2, @ExtractionParam T res)
	{
		MatUtils4F.transformVec3(v0, v1, v2, this.m, res);
		
		return res;
	}
	
	public <T> T transformVec3Func(ITup3RF v, IFunc3F<T> func)
	{
		return MatUtils4F.transformVec3Func(v, this.m, func);
	}
	
	public <T> T transformVec3Func(float[] v, IFunc3F<T> func)
	{
		return MatUtils4F.transformVec3Func(v, this.m, func);
	}
	
	public <T> T transformVec3Func(float v0, float v1, float v2, IFunc3F<T> func)
	{
		return MatUtils4F.transformVec3Func(v0, v1, v2, this.m, func);
	}
	
	public float[] transform4T(ITup4RF v, @ExtractionParam float[] res)
	{
		MatUtils4F.transform4(v, this.m, res);
		
		return res;
	}
	
	public float[] transform4T(float[] v, @ExtractionParam float[] res)
	{
		MatUtils4F.transform4(v, this.m, res);
		
		return res;
	}
	
	public float[] transform4T(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		MatUtils4F.transform4(v0, v1, v2, v3, this.m, res);
		
		return res;
	}
	
	public <T extends ITup4WF> T transform4T(ITup4RF v, @ExtractionParam T res)
	{
		MatUtils4F.transform4(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup4WF> T transform4T(float[] v, @ExtractionParam T res)
	{
		MatUtils4F.transform4(v, this.m, res);
		
		return res;
	}
	
	public <T extends ITup4WF> T transform4T(float v0, float v1, float v2, float v3, @ExtractionParam T res)
	{
		MatUtils4F.transform4(v0, v1, v2, v3, this.m, res);
		
		return res;
	}
	
	public <T> T transform4Func(ITup4RF v, IFunc4F<T> func)
	{
		return MatUtils4F.transform4Func(v, this.m, func);
	}
	
	public <T> T transform4Func(float[] v, IFunc4F<T> func)
	{
		return MatUtils4F.transform4Func(v, this.m, func);
	}
	
	public <T> T transform4Func(float v0, float v1, float v2, float v3, IFunc4F<T> func)
	{
		return MatUtils4F.transform4Func(v0, v1, v2, v3, this.m, func);
	}
	
	@Override
	public Mat4F setZero()
	{
		MatUtils4F.setZero(this.m);
		
		return this;
	}

	@Override
	public Mat4F setIdentity()
	{
		MatUtils4F.setIdentity(this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setTranslation2(ITup2RF v)
	{
		MatUtils4F.setTranslation2(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setTranslation2(float[] v)
	{
		MatUtils4F.setTranslation2(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setTranslation2(float v0, float v1)
	{
		MatUtils4F.setTranslation2(v0, v1, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setTranslation3(ITup3RF v)
	{
		MatUtils4F.setTranslation3(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setTranslation3(float[] v)
	{
		MatUtils4F.setTranslation3(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setTranslation3(float v0, float v1, float v2)
	{
		MatUtils4F.setTranslation3(v0, v1, v2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling2(ITup2RF v)
	{
		MatUtils4F.setScaling2(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling2(float[] v)
	{
		MatUtils4F.setScaling2(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling2(float v0, float v1)
	{
		MatUtils4F.setScaling2(v0, v1, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling3(ITup3RF v)
	{
		MatUtils4F.setScaling3(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling3(float[] v)
	{
		MatUtils4F.setScaling3(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling3(float v0, float v1, float v2)
	{
		MatUtils4F.setScaling3(v0, v1, v2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling4(ITup4RF v)
	{
		MatUtils4F.setScaling4(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling4(float[] v)
	{
		MatUtils4F.setScaling4(v, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setScaling4(float v0, float v1, float v2, float v3)
	{
		MatUtils4F.setScaling4(v0, v1, v2, v3, this.m);
		
		return this;
	}

	@Override
	public Mat4F setBaseChanging(ITup3RF u, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, ITup3RF v, float[] w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, float[] v, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, float[] v, float[] w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.setBaseChanging(u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(ITup3RF u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(u, vV0, vV1, vV2, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, ITup3RF v, float[] w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, float[] v, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, float[] v, float[] w)
	{
		MatUtils4F.setBaseChanging(u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.setBaseChanging(u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float[] u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(u, vV0, vV1, vV2, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, ITup3RF v, float[] w)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, float[] v, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, float[] v, float[] w)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setBaseChanging(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2)
	{
		MatUtils4F.setBaseChanging(uV0, uV1, uV2, vV0, vV1, vV2, wV0, wV1, wV2, this.m);
		
		return this;
	}

	@Override
	public Mat4F setRotationByQuat(ITup4RF q)
	{
		MatUtils4F.setRotationByQuat(q, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F setRotationRad(float aV0, float aV1, float aV2, float angle)
	{
		MatUtils4F.setRotationRad(aV0, aV1, aV2, angle, this.m);
		
		return this;
	}

	@Override
	public Mat4F setRotationDeg(float aV0, float aV1, float aV2, float angle)
	{
		MatUtils4F.setRotationDeg(aV0, aV1, aV2, angle, this.m);
		
		return this;
	}

	@Override
	public Mat4F setPerspective(float fovY, float aspectRatio, float near, float far)
	{
		MatUtils4F.setPerspective(fovY, aspectRatio, near, far, this.m);
		
		return this;
	}

	@Override
	public Mat4F setOrtho(float left, float right, float bottom, float top, float near, float far)
	{
		MatUtils4F.setOrtho(left, right, bottom, top, near, far, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F translate2(ITup2RF v)
	{
		MatUtils4F.translate2(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F translate2(float[] v)
	{
		MatUtils4F.translate2(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F translate2(float v0, float v1)
	{
		MatUtils4F.translate2(this.m, v0, v1, this.m);
		
		return this;
	}

	@Override
	public Mat4F translate2N(ITup2RF v)
	{
		return MatUtils4F.translate2Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F translate2N(float[] v)
	{
		return MatUtils4F.translate2Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F translate2N(float v0, float v1)
	{
		return MatUtils4F.translate2Func(this.m, v0, v1, CTOR);
	}

	@Override
	public Mat4F translate3(ITup3RF v)
	{
		MatUtils4F.translate3(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F translate3(float[] v)
	{
		MatUtils4F.translate3(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F translate3(float v0, float v1, float v2)
	{
		MatUtils4F.translate3(this.m, v0, v1, v2, this.m);
		
		return this;
	}

	@Override
	public Mat4F translate3N(ITup3RF v)
	{
		return MatUtils4F.translate3Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F translate3N(float[] v)
	{
		return MatUtils4F.translate3Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F translate3N(float v0, float v1, float v2)
	{
		return MatUtils4F.translate3Func(this.m, v0, v1, v2, CTOR);
	}

	@Override
	public Mat4F scale2(ITup2RF v)
	{
		MatUtils4F.scale2(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale2(float[] v)
	{
		MatUtils4F.scale2(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale2(float v0, float v1)
	{
		MatUtils4F.scale2(this.m, v0, v1, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale2N(ITup2RF v)
	{
		return MatUtils4F.scale2Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F scale2N(float[] v)
	{
		return MatUtils4F.scale2Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F scale2N(float v0, float v1)
	{
		return MatUtils4F.scale2Func(this.m, v0, v1, CTOR);
	}

	@Override
	public Mat4F scale3(ITup3RF v)
	{
		MatUtils4F.scale3(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale3(float[] v)
	{
		MatUtils4F.scale3(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale3(float v0, float v1, float v2)
	{
		MatUtils4F.scale3(this.m, v0, v1, v2, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale3N(ITup3RF v)
	{
		return MatUtils4F.scale3Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F scale3N(float[] v)
	{
		return MatUtils4F.scale3Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F scale3N(float v0, float v1, float v2)
	{
		return MatUtils4F.scale3Func(this.m, v0, v1, v2, CTOR);
	}

	@Override
	public Mat4F scale4(ITup4RF v)
	{
		MatUtils4F.scale4(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale4(float[] v)
	{
		MatUtils4F.scale4(this.m, v, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale4(float v0, float v1, float v2, float v3)
	{
		MatUtils4F.scale4(this.m, v0, v1, v2, v3, this.m);
		
		return this;
	}

	@Override
	public Mat4F scale4N(ITup4RF v)
	{
		return MatUtils4F.scale4Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F scale4N(float[] v)
	{
		return MatUtils4F.scale4Func(this.m, v, CTOR);
	}

	@Override
	public Mat4F scale4N(float v0, float v1, float v2, float v3)
	{
		return MatUtils4F.scale4Func(this.m, v0, v1, v2, v3, CTOR);
	}

	@Override
	public Mat4F baseChange(ITup3RF u, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, ITup3RF v, float[] w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, float[] v, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, float[] v, float[] w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.baseChange(this.m, u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(ITup3RF u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, u, vV0, vV1, vV2, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, ITup3RF v, float[] w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, float[] v, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, float[] v, float[] w)
	{
		MatUtils4F.baseChange(this.m, u, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, u, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.baseChange(this.m, u, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float[] u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, u, vV0, vV1, vV2, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, ITup3RF v, float[] w)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, float[] v, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, float[] v, float[] w)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, v, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, v, wV0, wV1, wV2, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.baseChange(this.m, uV0, uV1, uV2, vV0, vV1, vV2, w, this.m);
		
		return this;
	}
	
	@Override
	public Mat4F baseChange(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2)
	{
		MatUtils4F.baseChange(this.m, rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, this.m);
		
		return this;
	}

	@Override
	public Mat4F baseChangeN(ITup3RF u, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, ITup3RF v, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, float[] v, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, float[] v, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, vV0, vV1, vV2, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, vV0, vV1, vV2, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(ITup3RF u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, u, vV0, vV1, vV2, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, ITup3RF v, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, float[] v, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, float[] v, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, u, v, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, vV0, vV1, vV2, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, u, vV0, vV1, vV2, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float[] u, float vV0, float vV1, float vV2, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, u, vV0, vV1, vV2, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, ITup3RF v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, v, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, float[] v, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, float[] v, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, v, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, float[] v, float wV0, float wV1, float wV2)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, v, wV0, wV1, wV2, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, ITup3RF w)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, vV0, vV1, vV2, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float uV0, float uV1, float uV2, float vV0, float vV1, float vV2, float[] w)
	{
		MatUtils4F.baseChangeFunc(this.m, uV0, uV1, uV2, vV0, vV1, vV2, w, CTOR);
		
		return this;
	}
	
	@Override
	public Mat4F baseChangeN(float rv0, float rv1, float rv2, float uv0, float uv1, float uv2, float fv0, float fv1, float fv2)
	{
		return MatUtils4F.baseChangeFunc(this.m, rv0, rv1, rv2, uv0, uv1, uv2, fv0, fv1, fv2, CTOR);
	}

	@Override
	public Mat4F rotateRad(float av0, float av1, float av2, float angle)
	{
		MatUtils4F.rotateRad(this.m, av0, av1, av2, angle, this.m);
		
		return this;
	}

	@Override
	public Mat4F rotateRadN(float av0, float av1, float av2, float angle)
	{
		return MatUtils4F.rotateRadFunc(this.m, av0, av1, av2, angle, CTOR);
	}

	@Override
	public Mat4F rotateDeg(float av0, float av1, float av2, float angle)
	{
		MatUtils4F.rotateDeg(this.m, av0, av1, av2, angle, this.m);
		
		return this;
	}

	@Override
	public Mat4F rotateDegN(float av0, float av1, float av2, float angle)
	{
		return MatUtils4F.rotateDegFunc(this.m, av0, av1, av2, angle, CTOR);
	}
	
	public static Mat4F zero()
	{
		return new Mat4F().setZero();
	}
	
	public static Mat4F identity()
	{
		return new Mat4F().setIdentity();
	}
	
	public static Mat4F translation2(ITup2RF t)
	{
		return new Mat4F().setTranslation2(t);
	}
	
	public static Mat4F translation2(float[] t)
	{
		return new Mat4F().setTranslation2(t);
	}
	
	public static Mat4F translation2(float v0, float v1)
	{
		return new Mat4F().setTranslation2(v0, v1);
	}
	
	public static Mat4F translation3(ITup3RF t)
	{
		return new Mat4F().setTranslation3(t);
	}
	
	public static Mat4F translation3(float[] t)
	{
		return new Mat4F().setTranslation3(t);
	}
	
	public static Mat4F translation3(float v0, float v1, float v2)
	{
		return new Mat4F().setTranslation3(v0, v1, v2);
	}
	
	public static Mat4F scaling2(ITup2RF t)
	{
		return new Mat4F().setScaling2(t);
	}
	
	public static Mat4F scaling2(float[] t)
	{
		return new Mat4F().setScaling2(t);
	}
	
	public static Mat4F scaling2(float v0, float v1)
	{
		return new Mat4F().setScaling2(v0, v1);
	}
	
	public static Mat4F scaling3(ITup3RF t)
	{
		return new Mat4F().setScaling3(t);
	}
	
	public static Mat4F scaling3(float[] t)
	{
		return new Mat4F().setScaling3(t);
	}
	
	public static Mat4F scaling3(float v0, float v1, float v2)
	{
		return new Mat4F().setScaling3(v0, v1, v2);
	}
	
	public static Mat4F scaling4(ITup4RF t)
	{
		return new Mat4F().setScaling4(t);
	}
	
	public static Mat4F scaling4(float[] t)
	{
		return new Mat4F().setScaling4(t);
	}
	
	public static Mat4F scaling4(float v0, float v1, float v2, float v3)
	{
		return new Mat4F().setScaling4(v0, v1, v2, v3);
	}
}
