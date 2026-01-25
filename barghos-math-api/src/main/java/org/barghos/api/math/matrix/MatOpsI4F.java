package org.barghos.api.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.vector.floats.IVec4RF;
import org.barghos.api.math.vector.floats.IVec4WF;
import org.barghos.core.math.MathUtils;
import org.barghos.math.matrix.MatOps3F;
import org.barghos.math.matrix.MatOps4F;

// Row-Major
// 00 01 02 03
// 10 11 12 13
// 20 21 22 23
// 30 31 32 33

// Column-Major
// 00 10 20 30
// 01 11 21 31
// 02 12 22 32
// 03 13 23 33

//Column-Major Indices
// 00 04 08 12
// 01 05 09 13
// 02 06 10 14
// 03 07 11 15

public class MatOpsI4F
{
	
	private MatOpsI4F() { }
	
	public static float[] getColumn(int col, IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.at(col, 0);
		res[1] = m1.at(col, 1);
		res[2] = m1.at(col, 2);
		res[3] = m1.at(col, 3);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn(int col, float[] m1, @ExtractionParam T res)
	{
		int c = col * 4;
		
		res.set(
			m1[c],
			m1[c+1],
			m1[c+2],
			m1[c+3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn(int col, IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.at(col, 0),
			m1.at(col, 1),
			m1.at(col, 2),
			m1.at(col, 3)
		);
		
		return res;
	}
	
	public static float[] getColumn0(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m00();
		res[1] = m1.m01();
		res[2] = m1.m02();
		res[3] = m1.m03();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn0(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[0],
			m1[1],
			m1[2],
			m1[3]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn0(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m00(),
			m1.m01(),
			m1.m02(),
			m1.m03()
		);
		
		return res;
	}
	
	public static float[] getColumn1(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m10();
		res[1] = m1.m11();
		res[2] = m1.m12();
		res[3] = m1.m13();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn1(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[4],
			m1[5],
			m1[6],
			m1[7]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn1(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m10(),
			m1.m11(),
			m1.m12(),
			m1.m13()
		);
		
		return res;
	}
	
	public static float[] getColumn2(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m20();
		res[1] = m1.m21();
		res[2] = m1.m22();
		res[3] = m1.m23();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn2(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[8],
			m1[9],
			m1[10],
			m1[11]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn2(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m20(),
			m1.m21(),
			m1.m22(),
			m1.m23()
		);
		
		return res;
	}
	
	public static float[] getColumn3(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m30();
		res[1] = m1.m31();
		res[2] = m1.m32();
		res[3] = m1.m33();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn3(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[12],
			m1[13],
			m1[14],
			m1[15]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getColumn3(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m30(),
			m1.m31(),
			m1.m32(),
			m1.m33()
		);
		
		return res;
	}
	
	public static float[] getRow(int row, IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.at(0, row);
		res[1] = m1.at(1, row);
		res[2] = m1.at(2, row);
		res[3] = m1.at(3, row);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow(int row, float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[row],
			m1[4+row],
			m1[8+row],
			m1[12+row]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow(int row, IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.at(0, row),
			m1.at(1, row),
			m1.at(2, row),
			m1.at(3, row)
		);
		
		return res;
	}
	
	public static float[] getRow0(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m00();
		res[1] = m1.m10();
		res[2] = m1.m20();
		res[3] = m1.m30();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow0(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[0],
			m1[4],
			m1[8],
			m1[12]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow0(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m00(),
			m1.m10(),
			m1.m20(),
			m1.m30()
		);
		
		return res;
	}
	
	public static float[] getRow1(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m01();
		res[1] = m1.m11();
		res[2] = m1.m21();
		res[3] = m1.m31();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow1(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[1],
			m1[5],
			m1[9],
			m1[13]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow1(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m01(),
			m1.m11(),
			m1.m21(),
			m1.m31()
		);
		
		return res;
	}
	
	public static float[] getRow2(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m02();
		res[1] = m1.m12();
		res[2] = m1.m22();
		res[3] = m1.m32();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow2(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[2],
			m1[6],
			m1[10],
			m1[14]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow2(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m02(),
			m1.m12(),
			m1.m22(),
			m1.m32()
		);
		
		return res;
	}
	
	public static float[] getRow3(IMat4RF m1, @ExtractionParam float[] res)
	{
		res[0] = m1.m03();
		res[1] = m1.m13();
		res[2] = m1.m23();
		res[3] = m1.m33();
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow3(float[] m1, @ExtractionParam T res)
	{
		res.set(
			m1[3],
			m1[7],
			m1[11],
			m1[15]
		);
		
		return res;
	}
	
	public static <T extends IVec4WF> T getRow3(IMat4RF m1, @ExtractionParam T res)
	{
		res.set(
			m1.m03(),
			m1.m13(),
			m1.m23(),
			m1.m33()
		);
		
		return res;
	}
	
	public static float[] setColumn(int col, IVec4RF v1, @ExtractionParam float[] res)
	{
		int c = col * 4;
		
		res[c] = v1.x();
		res[c+1] = v1.y();
		res[c+2] = v1.z();
		res[c+3] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn(int col, IVec4RF v1, @ExtractionParam T res)
	{
		res.at(col, 0, v1.x());
		res.at(col, 1, v1.y());
		res.at(col, 2, v1.z());
		res.at(col, 3, v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn(int col, float[] v1, @ExtractionParam T res)
	{
		res.at(col, 0, v1[0]);
		res.at(col, 1, v1[1]);
		res.at(col, 2, v1[2]);
		res.at(col, 3, v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn(int col, float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.at(col, 0, v1X);
		res.at(col, 1, v1Y);
		res.at(col, 2, v1Z);
		res.at(col, 3, v1W);
		
		return res;
	}
	
	public static float[] setColumn0(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = v1.x();
		res[1] = v1.y();
		res[2] = v1.z();
		res[3] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn0(IVec4RF v1, @ExtractionParam T res)
	{
		res.m00(v1.x());
		res.m01(v1.y());
		res.m02(v1.z());
		res.m03(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn0(float[] v1, @ExtractionParam T res)
	{
		res.m00(v1[0]);
		res.m01(v1[1]);
		res.m02(v1[2]);
		res.m03(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn0(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m00(v1X);
		res.m01(v1Y);
		res.m02(v1Z);
		res.m03(v1W);
		
		return res;
	}
	
	public static float[] setColumn1(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[4] = v1.x();
		res[5] = v1.y();
		res[6] = v1.z();
		res[7] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn1(IVec4RF v1, @ExtractionParam T res)
	{
		res.m10(v1.x());
		res.m11(v1.y());
		res.m12(v1.z());
		res.m13(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn1(float[] v1, @ExtractionParam T res)
	{
		res.m10(v1[0]);
		res.m11(v1[1]);
		res.m12(v1[2]);
		res.m13(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn1(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m10(v1X);
		res.m11(v1Y);
		res.m12(v1Z);
		res.m13(v1W);
		
		return res;
	}
	
	public static float[] setColumn2(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[8] = v1.x();
		res[9] = v1.y();
		res[10] = v1.z();
		res[11] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn2(IVec4RF v1, @ExtractionParam T res)
	{
		res.m20(v1.x());
		res.m21(v1.y());
		res.m22(v1.z());
		res.m23(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn2(float[] v1, @ExtractionParam T res)
	{
		res.m20(v1[0]);
		res.m21(v1[1]);
		res.m22(v1[2]);
		res.m23(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn2(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m20(v1X);
		res.m21(v1Y);
		res.m22(v1Z);
		res.m23(v1W);
		
		return res;
	}
	
	public static float[] setColumn3(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[12] = v1.x();
		res[13] = v1.y();
		res[14] = v1.z();
		res[15] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn3(IVec4RF v1, @ExtractionParam T res)
	{
		res.m30(v1.x());
		res.m31(v1.y());
		res.m32(v1.z());
		res.m33(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn3(float[] v1, @ExtractionParam T res)
	{
		res.m30(v1[0]);
		res.m31(v1[1]);
		res.m32(v1[2]);
		res.m33(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setColumn3(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m30(v1X);
		res.m31(v1Y);
		res.m32(v1Z);
		res.m33(v1W);
		
		return res;
	}
	
	public static float[] setRow(int row, IVec4RF v1, @ExtractionParam float[] res)
	{
		res[row] = v1.x();
		res[4 + row] = v1.y();
		res[8 + row] = v1.z();
		res[12 + row] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow(int row, IVec4RF v1, @ExtractionParam T res)
	{
		res.at(0, row, v1.x());
		res.at(1, row, v1.y());
		res.at(2, row, v1.z());
		res.at(3 ,row, v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow(int row, float[] v1, @ExtractionParam T res)
	{
		res.at(0, row, v1[0]);
		res.at(1, row, v1[1]);
		res.at(2, row, v1[2]);
		res.at(3, row, v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow(int row, float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.at(0, row, v1X);
		res.at(1, row, v1Y);
		res.at(2, row, v1Z);
		res.at(3, row, v1W);
		
		return res;
	}
	
	public static float[] setRow0(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[0] = v1.x();
		res[4] = v1.y();
		res[8] = v1.z();
		res[12] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow0(IVec4RF v1, @ExtractionParam T res)
	{
		res.m00(v1.x());
		res.m10(v1.y());
		res.m20(v1.z());
		res.m30(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow0(float[] v1, @ExtractionParam T res)
	{
		res.m00(v1[0]);
		res.m10(v1[1]);
		res.m20(v1[2]);
		res.m30(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow0(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m00(v1X);
		res.m10(v1Y);
		res.m20(v1Z);
		res.m30(v1W);
		
		return res;
	}
	
	public static float[] setRow1(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[1] = v1.x();
		res[5] = v1.y();
		res[9] = v1.z();
		res[13] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow1(IVec4RF v1, @ExtractionParam T res)
	{
		res.m01(v1.x());
		res.m11(v1.y());
		res.m21(v1.z());
		res.m31(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow1(float[] v1, @ExtractionParam T res)
	{
		res.m01(v1[0]);
		res.m11(v1[1]);
		res.m21(v1[2]);
		res.m31(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow1(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m01(v1X);
		res.m11(v1Y);
		res.m21(v1Z);
		res.m31(v1W);
		
		return res;
	}
	
	public static float[] setRow2(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[2] = v1.x();
		res[6] = v1.y();
		res[10] = v1.z();
		res[14] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow2(IVec4RF v1, @ExtractionParam T res)
	{
		res.m02(v1.x());
		res.m12(v1.y());
		res.m22(v1.z());
		res.m32(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow2(float[] v1, @ExtractionParam T res)
	{
		res.m02(v1[0]);
		res.m12(v1[1]);
		res.m22(v1[2]);
		res.m32(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow2(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m02(v1X);
		res.m12(v1Y);
		res.m22(v1Z);
		res.m32(v1W);
		
		return res;
	}
	
	public static float[] setRow3(IVec4RF v1, @ExtractionParam float[] res)
	{
		res[3] = v1.x();
		res[7] = v1.y();
		res[11] = v1.z();
		res[15] = v1.w();
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow3(IVec4RF v1, @ExtractionParam T res)
	{
		res.m03(v1.x());
		res.m13(v1.y());
		res.m23(v1.z());
		res.m33(v1.w());
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow3(float[] v1, @ExtractionParam T res)
	{
		res.m03(v1[0]);
		res.m13(v1[1]);
		res.m23(v1[2]);
		res.m33(v1[3]);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setRow3(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam T res)
	{
		res.m03(v1X);
		res.m13(v1Y);
		res.m23(v1Z);
		res.m33(v1W);
		
		return res;
	}
	
	public static <T extends IMat4WF> T setCell(int col, int row, float v1, @ExtractionParam T res)
	{
		res.at(col, row, v1);
		
		return res;
	}
	
	public static float determinant(IMat4RF m)
	{
		float m1M00 = m.m00();
		float m1M01 = m.m01();
		float m1M02 = m.m02();
		float m1M03 = m.m03();

		float m1M10 = m.m10();
		float m1M11 = m.m11();
		float m1M12 = m.m12();
		float m1M13 = m.m13();
		
		float m1M20 = m.m20();
		float m1M21 = m.m21();
		float m1M22 = m.m22();
		float m1M23 = m.m23();
		
		float m1M30 = m.m30();
		float m1M31 = m.m31();
		float m1M32 = m.m32();
		float m1M33 = m.m33();
		
		float dm00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33);
		float dm01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33);
		float dm02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33);
		float dm03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32);
		
		return MathUtils.fma(m1M00, dm00, MathUtils.fma(m1M01, dm01, MathUtils.fma(m1M02, dm02, m1M03 * dm03)));
	}
	
	public static float[] invert(IMat4RF m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();

		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();
		
		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float det = MatOps4F.determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

		res[0] = r00;
		res[1] = r10;
		res[2] = r20;
		res[3] = r30;
		
		res[4] = r01;
		res[5] = r11;
		res[6] = r21;
		res[7] = r31;
		
		res[8] = r02;
		res[9] = r12;
		res[10] = r22;
		res[11] = r32;
		
		res[12] = r03;
		res[13] = r13;
		res[14] = r23;
		res[15] = r33;

		return res;
	}
	
	public static <T extends IMat4WF> T invert(IMat4RF m1, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();

		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();
		
		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float det = MatOps4F.determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

		res.set(
			r00,
			r10,
			r20,
			r30,
			r01,
			r11,
			r21,
			r31,
			r02,
			r12,
			r22,
			r32,
			r03,
			r13,
			r23,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T invert(float[] m1, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];

		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];
		
		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float det = MatOps4F.determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

		res.set(
			r00,
			r10,
			r20,
			r30,
			r01,
			r11,
			r21,
			r31,
			r02,
			r12,
			r22,
			r32,
			r03,
			r13,
			r23,
			r33
		);

		return res;
	}
	
	public static <T extends IMat4WF> T invert(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, @ExtractionParam T res)
	{
		float det = MatOps4F.determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;

		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

		res.set(
			r00,
			r10,
			r20,
			r30,
			r01,
			r11,
			r21,
			r31,
			r02,
			r12,
			r22,
			r32,
			r03,
			r13,
			r23,
			r33
		);

		return res;
	}
	
	public static <T extends IMat4WF> T invertAssign(@ExtractionParam T m1)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();

		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();
		
		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float det = MatOps4F.determinant(m1M00, m1M01, m1M02, m1M03, m1M10, m1M11, m1M12, m1M13, m1M20, m1M21, m1M22, m1M23, m1M30, m1M31, m1M32, m1M33);
		 
		if(det == 0) throw new UnsupportedOperationException();
		
		float invDet = 1.0f / det;
		
		float r00 =  MatOps3F.determinant(m1M11, m1M12, m1M13, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r01 = -MatOps3F.determinant(m1M10, m1M12, m1M13, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r02 =  MatOps3F.determinant(m1M10, m1M11, m1M13, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r03 = -MatOps3F.determinant(m1M10, m1M11, m1M12, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r10 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M21, m1M22, m1M23, m1M31, m1M32, m1M33) * invDet;
		float r11 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M20, m1M22, m1M23, m1M30, m1M32, m1M33) * invDet;
		float r12 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M20, m1M21, m1M23, m1M30, m1M31, m1M33) * invDet;
		float r13 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M20, m1M21, m1M22, m1M30, m1M31, m1M32) * invDet;
		
		float r20 =  MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M31, m1M32, m1M33) * invDet;
		float r21 = -MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M30, m1M32, m1M33) * invDet;
		float r22 =  MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M30, m1M31, m1M33) * invDet;
		float r23 = -MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M30, m1M31, m1M32) * invDet;
		
		float r30 = -MatOps3F.determinant(m1M01, m1M02, m1M03, m1M11, m1M12, m1M13, m1M21, m1M22, m1M23) * invDet;
		float r31 =  MatOps3F.determinant(m1M00, m1M02, m1M03, m1M10, m1M12, m1M13, m1M20, m1M22, m1M23) * invDet;
		float r32 = -MatOps3F.determinant(m1M00, m1M01, m1M03, m1M10, m1M11, m1M13, m1M20, m1M21, m1M23) * invDet;
		float r33 =  MatOps3F.determinant(m1M00, m1M01, m1M02, m1M10, m1M11, m1M12, m1M20, m1M21, m1M22) * invDet;

		m1.set(
			r00,
			r10,
			r20,
			r30,
			r01,
			r11,
			r21,
			r31,
			r02,
			r12,
			r22,
			r32,
			r03,
			r13,
			r23,
			r33
		);
		
		return m1;
	}
	
	public static float[] transpose(IMat4RF m1, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();

		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();
		
		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		res[0] = m1M00;
		res[1] = m1M10;
		res[2] = m1M20;
		res[3] = m1M30;
		
		res[4] = m1M01;
		res[5] = m1M11;
		res[6] = m1M21;
		res[7] = m1M31;
		
		res[8] = m1M02;
		res[9] = m1M12;
		res[10] = m1M22;
		res[11] = m1M32;
		
		res[12] = m1M03;
		res[13] = m1M13;
		res[14] = m1M23;
		res[15] = m1M33;
		
		return res;
	}
	
	public static <T extends IMat4WF> T transpose(IMat4RF m1, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();

		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();
		
		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();

		res.set(
			m1M00,
			m1M10,
			m1M20,
			m1M30,
			m1M01,
			m1M11,
			m1M21,
			m1M31,
			m1M02,
			m1M12,
			m1M22,
			m1M32,
			m1M03,
			m1M13,
			m1M23,
			m1M33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T transpose(float[] m1, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];

		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];
		
		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		res.set(
			m1M00,
			m1M10,
			m1M20,
			m1M30,
			m1M01,
			m1M11,
			m1M21,
			m1M31,
			m1M02,
			m1M12,
			m1M22,
			m1M32,
			m1M03,
			m1M13,
			m1M23,
			m1M33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T transpose(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, @ExtractionParam T res)
	{
		res.set(
			m1M00,
			m1M10,
			m1M20,
			m1M30,
			m1M01,
			m1M11,
			m1M21,
			m1M31,
			m1M02,
			m1M12,
			m1M22,
			m1M32,
			m1M03,
			m1M13,
			m1M23,
			m1M33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T transposeAssign(@ExtractionParam T m1)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();

		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();
		
		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();

		m1.set(
			m1M00,
			m1M10,
			m1M20,
			m1M30,
			m1M01,
			m1M11,
			m1M21,
			m1M31,
			m1M02,
			m1M12,
			m1M22,
			m1M32,
			m1M03,
			m1M13,
			m1M23,
			m1M33
		);
		
		return m1;
	}
	
	public static float trace(IMat4RF m1)
	{
		return m1.m00() + m1.m11() + m1.m22() + m1.m33();
	}
	
	public static float[] mul(IMat4RF m1, IMat4RF m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mul(IMat4RF m1, float[] m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mul(IMat4RF m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mul(float[] m1, IMat4RF m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] mul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, IMat4RF m2, @ExtractionParam float[] res)
	{
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(IMat4RF m1, IMat4RF m2, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(IMat4RF m1, float[] m2, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(IMat4RF m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float[] m1, IMat4RF m2, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float[] m1, float[] m2, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float[] m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, IMat4RF m2, @ExtractionParam T res)
	{
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float[] m2, @ExtractionParam T res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam T res)
	{
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T mulAssign(@ExtractionParam T m1, IMat4RF m2)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		m1.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return m1;
	}
	
	public static <T extends IMat4WF> T mulAssign(@ExtractionParam T m1, float[] m2)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		m1.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return m1;
	}
	
	public static <T extends IMat4WF> T mulAssign(@ExtractionParam T m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float r00 = Math.fma(m1M00, m2M00, Math.fma(m1M01, m2M10, Math.fma(m1M02, m2M20, m1M03 * m2M30)));
		float r01 = Math.fma(m1M00, m2M01, Math.fma(m1M01, m2M11, Math.fma(m1M02, m2M21, m1M03 * m2M31)));
		float r02 = Math.fma(m1M00, m2M02, Math.fma(m1M01, m2M12, Math.fma(m1M02, m2M22, m1M03 * m2M32)));
		float r03 = Math.fma(m1M00, m2M03, Math.fma(m1M01, m2M13, Math.fma(m1M02, m2M23, m1M03 * m2M33)));
		
		float r10 = Math.fma(m1M10, m2M00, Math.fma(m1M11, m2M10, Math.fma(m1M12, m2M20, m1M13 * m2M30)));
		float r11 = Math.fma(m1M10, m2M01, Math.fma(m1M11, m2M11, Math.fma(m1M12, m2M21, m1M13 * m2M31)));
		float r12 = Math.fma(m1M10, m2M02, Math.fma(m1M11, m2M12, Math.fma(m1M12, m2M22, m1M13 * m2M32)));
		float r13 = Math.fma(m1M10, m2M03, Math.fma(m1M11, m2M13, Math.fma(m1M12, m2M23, m1M13 * m2M33)));
		
		float r20 = Math.fma(m1M20, m2M00, Math.fma(m1M21, m2M10, Math.fma(m1M22, m2M20, m1M23 * m2M30)));
		float r21 = Math.fma(m1M20, m2M01, Math.fma(m1M21, m2M11, Math.fma(m1M22, m2M21, m1M23 * m2M31)));
		float r22 = Math.fma(m1M20, m2M02, Math.fma(m1M21, m2M12, Math.fma(m1M22, m2M22, m1M23 * m2M32)));
		float r23 = Math.fma(m1M20, m2M03, Math.fma(m1M21, m2M13, Math.fma(m1M22, m2M23, m1M23 * m2M33)));
		
		float r30 = Math.fma(m1M30, m2M00, Math.fma(m1M31, m2M10, Math.fma(m1M32, m2M20, m1M33 * m2M30)));
		float r31 = Math.fma(m1M30, m2M01, Math.fma(m1M31, m2M11, Math.fma(m1M32, m2M21, m1M33 * m2M31)));
		float r32 = Math.fma(m1M30, m2M02, Math.fma(m1M31, m2M12, Math.fma(m1M32, m2M22, m1M33 * m2M32)));
		float r33 = Math.fma(m1M30, m2M03, Math.fma(m1M31, m2M13, Math.fma(m1M32, m2M23, m1M33 * m2M33)));
		
		m1.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return m1;
	}
	
	public static float[] revMul(IMat4RF m1, IMat4RF m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMul(IMat4RF m1, float[] m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMul(IMat4RF m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam float[] res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMul(float[] m1, IMat4RF m2, @ExtractionParam float[] res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static float[] revMul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, IMat4RF m2, @ExtractionParam float[] res)
	{
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res[0] = r00;
		res[1] = r01;
		res[2] = r02;
		res[3] = r03;
		
		res[4] = r10;
		res[5] = r11;
		res[6] = r12;
		res[7] = r13;
		
		res[8] = r20;
		res[9] = r21;
		res[10] = r22;
		res[11] = r23; 
		
		res[12] = r30;
		res[13] = r31;
		res[14] = r32;
		res[15] = r33;
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(IMat4RF m1, IMat4RF m2, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(IMat4RF m1, float[] m2, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(IMat4RF m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam T res)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(float[] m1, IMat4RF m2, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(float[] m1, float[] m2, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(float[] m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam T res)
	{
		float m1M00 = m1[0];
		float m1M01 = m1[1];
		float m1M02 = m1[2];
		float m1M03 = m1[3];
		
		float m1M10 = m1[4];
		float m1M11 = m1[5];
		float m1M12 = m1[6];
		float m1M13 = m1[7];

		float m1M20 = m1[8];
		float m1M21 = m1[9];
		float m1M22 = m1[10];
		float m1M23 = m1[11];
		
		float m1M30 = m1[12];
		float m1M31 = m1[13];
		float m1M32 = m1[14];
		float m1M33 = m1[15];
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, IMat4RF m2, @ExtractionParam T res)
	{
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float[] m2, @ExtractionParam T res)
	{
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMul(float m1M00, float m1M01, float m1M02, float m1M03, float m1M10, float m1M11, float m1M12, float m1M13, float m1M20, float m1M21, float m1M22, float m1M23, float m1M30, float m1M31, float m1M32, float m1M33, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33, @ExtractionParam T res)
	{
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		res.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return res;
	}
	
	public static <T extends IMat4WF> T revMulAssign(@ExtractionParam T m1, IMat4RF m2)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2.m00();
		float m2M01 = m2.m01();
		float m2M02 = m2.m02();
		float m2M03 = m2.m03();
		
		float m2M10 = m2.m10();
		float m2M11 = m2.m11();
		float m2M12 = m2.m12();
		float m2M13 = m2.m13();

		float m2M20 = m2.m20();
		float m2M21 = m2.m21();
		float m2M22 = m2.m22();
		float m2M23 = m2.m23();
		
		float m2M30 = m2.m30();
		float m2M31 = m2.m31();
		float m2M32 = m2.m32();
		float m2M33 = m2.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		m1.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return m1;
	}
	
	public static <T extends IMat4WF> T revMulAssign(@ExtractionParam T m1, float[] m2)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float m2M00 = m2[0];
		float m2M01 = m2[1];
		float m2M02 = m2[2];
		float m2M03 = m2[3];
		
		float m2M10 = m2[4];
		float m2M11 = m2[5];
		float m2M12 = m2[6];
		float m2M13 = m2[7];

		float m2M20 = m2[8];
		float m2M21 = m2[9];
		float m2M22 = m2[10];
		float m2M23 = m2[11];
		
		float m2M30 = m2[12];
		float m2M31 = m2[13];
		float m2M32 = m2[14];
		float m2M33 = m2[15];
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		m1.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return m1;
	}
	
	public static <T extends IMat4WF> T revMulAssign(@ExtractionParam T m1, float m2M00, float m2M01, float m2M02, float m2M03, float m2M10, float m2M11, float m2M12, float m2M13, float m2M20, float m2M21, float m2M22, float m2M23, float m2M30, float m2M31, float m2M32, float m2M33)
	{
		float m1M00 = m1.m00();
		float m1M01 = m1.m01();
		float m1M02 = m1.m02();
		float m1M03 = m1.m03();
		
		float m1M10 = m1.m10();
		float m1M11 = m1.m11();
		float m1M12 = m1.m12();
		float m1M13 = m1.m13();

		float m1M20 = m1.m20();
		float m1M21 = m1.m21();
		float m1M22 = m1.m22();
		float m1M23 = m1.m23();
		
		float m1M30 = m1.m30();
		float m1M31 = m1.m31();
		float m1M32 = m1.m32();
		float m1M33 = m1.m33();
		
		float r00 = Math.fma(m2M00, m1M00, Math.fma(m2M01, m1M10, Math.fma(m2M02, m1M20, m2M03 * m1M30)));
		float r01 = Math.fma(m2M00, m1M01, Math.fma(m2M01, m1M11, Math.fma(m2M02, m1M21, m2M03 * m1M31)));
		float r02 = Math.fma(m2M00, m1M02, Math.fma(m2M01, m1M12, Math.fma(m2M02, m1M22, m2M03 * m1M32)));
		float r03 = Math.fma(m2M00, m1M03, Math.fma(m2M01, m1M13, Math.fma(m2M02, m1M23, m2M03 * m1M33)));
		
		float r10 = Math.fma(m2M10, m1M00, Math.fma(m2M11, m1M10, Math.fma(m2M12, m1M20, m2M13 * m1M30)));
		float r11 = Math.fma(m2M10, m1M01, Math.fma(m2M11, m1M11, Math.fma(m2M12, m1M21, m2M13 * m1M31)));
		float r12 = Math.fma(m2M10, m1M02, Math.fma(m2M11, m1M12, Math.fma(m2M12, m1M22, m2M13 * m1M32)));
		float r13 = Math.fma(m2M10, m1M03, Math.fma(m2M11, m1M13, Math.fma(m2M12, m1M23, m2M13 * m1M33)));
		
		float r20 = Math.fma(m2M20, m1M00, Math.fma(m2M21, m1M10, Math.fma(m2M22, m1M20, m2M23 * m1M30)));
		float r21 = Math.fma(m2M20, m1M01, Math.fma(m2M21, m1M11, Math.fma(m2M22, m1M21, m2M23 * m1M31)));
		float r22 = Math.fma(m2M20, m1M02, Math.fma(m2M21, m1M12, Math.fma(m2M22, m1M22, m2M23 * m1M32)));
		float r23 = Math.fma(m2M20, m1M03, Math.fma(m2M21, m1M13, Math.fma(m2M22, m1M23, m2M23 * m1M33)));
		
		float r30 = Math.fma(m2M30, m1M00, Math.fma(m2M31, m1M10, Math.fma(m2M32, m1M20, m2M33 * m1M30)));
		float r31 = Math.fma(m2M30, m1M01, Math.fma(m2M31, m1M11, Math.fma(m2M32, m1M21, m2M33 * m1M31)));
		float r32 = Math.fma(m2M30, m1M02, Math.fma(m2M31, m1M12, Math.fma(m2M32, m1M22, m2M33 * m1M32)));
		float r33 = Math.fma(m2M30, m1M03, Math.fma(m2M31, m1M13, Math.fma(m2M32, m1M23, m2M33 * m1M33)));
		
		m1.set(
			r00,
			r01,
			r02,
			r03,
			r10,
			r11,
			r12,
			r13,
			r20,
			r21,
			r22,
			r23,
			r30,
			r31,
			r32,
			r33
		);
		
		return m1;
	}
	
}
