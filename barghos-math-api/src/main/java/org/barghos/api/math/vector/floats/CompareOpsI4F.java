package org.barghos.api.math.vector.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.core.math.MathUtils;

public class CompareOpsI4F
{
	private CompareOpsI4F() { }
	
	public static boolean equals(@AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		

		if (v1.x() != v2.x()) return false;
		if (v1.y() != v2.y()) return false;
		if (v1.z() != v2.z()) return false;
		if (v1.w() != v2.w()) return false;

		return true;
	}

	public static boolean equals(@AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (v1.x() != v2[0]) return false;
		if (v1.y() != v2[1]) return false;
		if (v1.z() != v2[2]) return false;
		if (v1.w() != v2[3]) return false;

		return true;
	}

	public static boolean equals(@AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		if (v1.x() != v2v0) return false;
		if (v1.y() != v2v1) return false;
		if (v1.z() != v2v1) return false;
		if (v1.w() != v2v3) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (v1[0] != v2.x()) return false;
		if (v1[1] != v2.y()) return false;
		if (v1[2] != v2.z()) return false;
		if (v1[3] != v2.w()) return false;

		return true;
	}
	
	public static boolean equals(float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		if (v1v0 != v2.x()) return false;
		if (v1v1 != v2.y()) return false;
		if (v1v2 != v2.z()) return false;
		if (v1v3 != v2.w()) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps(tolerance, v2.z(), v2.z())) return false;
		if (!MathUtils.equalsEps(tolerance, v2.w(), v2.w())) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps(tolerance, v1.z(), v2[2])) return false;
		if (!MathUtils.equalsEps(tolerance, v1.w(), v2[3])) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2v0)) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2v1)) return false;
		if (!MathUtils.equalsEps(tolerance, v1.z(), v2v2)) return false;
		if (!MathUtils.equalsEps(tolerance, v1.w(), v2v3)) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps(tolerance, v1[2], v2.z())) return false;
		if (!MathUtils.equalsEps(tolerance, v1[3], v2.w())) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1v0, v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1v1, v2.y())) return false;
		if (!MathUtils.equalsEps(tolerance, v1v2, v2.z())) return false;
		if (!MathUtils.equalsEps(tolerance, v1v3, v2.w())) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps4(v2.z(), v2.z())) return false;
		if (!MathUtils.equalsEps4(v2.w(), v2.w())) return false;

		return true;
	}

	public static boolean equalsEps4(@AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps4(v1.z(), v2[2])) return false;
		if (!MathUtils.equalsEps4(v1.w(), v2[3])) return false;

		return true;
	}

	public static boolean equalsEps4(@AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2v0)) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2v1)) return false;
		if (!MathUtils.equalsEps4(v1.z(), v2v2)) return false;
		if (!MathUtils.equalsEps4(v1.w(), v2v3)) return false;

		return true;
	}

	public static boolean equalsEps4(@AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps4(v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps4(v1[2], v2.z())) return false;
		if (!MathUtils.equalsEps4(v1[3], v2.w())) return false;

		return true;
	}
	
	public static boolean equalsEps4(float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps4(v1v0, v2.x())) return false;
		if (!MathUtils.equalsEps4(v1v1, v2.y())) return false;
		if (!MathUtils.equalsEps4(v1v2, v2.z())) return false;
		if (!MathUtils.equalsEps4(v1v3, v2.w())) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps6(v2.z(), v2.z())) return false;
		if (!MathUtils.equalsEps6(v2.w(), v2.w())) return false;

		return true;
	}

	public static boolean equalsEps6(@AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2[2])) return false;
		if (!MathUtils.equalsEps6(v1.w(), v2[3])) return false;

		return true;
	}

	public static boolean equalsEps6(@AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2v0)) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2v1)) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2v2)) return false;
		if (!MathUtils.equalsEps6(v1.w(), v2v3)) return false;

		return true;
	}

	public static boolean equalsEps6(@AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps6(v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps6(v1[2], v2.z())) return false;
		if (!MathUtils.equalsEps6(v1[3], v2.w())) return false;

		return true;
	}
	
	public static boolean equalsEps6(float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps6(v1v0, v2.x())) return false;
		if (!MathUtils.equalsEps6(v1v1, v2.y())) return false;
		if (!MathUtils.equalsEps6(v1v2, v2.z())) return false;
		if (!MathUtils.equalsEps6(v1v3, v2.w())) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps8(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps8(v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps8(v2.z(), v2.z())) return false;
		if (!MathUtils.equalsEps8(v2.w(), v2.w())) return false;

		return true;
	}

	public static boolean equalsEps8(@AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps8(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps8(v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps8(v1.z(), v2[2])) return false;
		if (!MathUtils.equalsEps8(v1.w(), v2[3])) return false;

		return true;
	}

	public static boolean equalsEps8(@AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps8(v1.x(), v2v0)) return false;
		if (!MathUtils.equalsEps8(v1.y(), v2v1)) return false;
		if (!MathUtils.equalsEps8(v1.z(), v2v2)) return false;
		if (!MathUtils.equalsEps8(v1.w(), v2v3)) return false;

		return true;
	}

	public static boolean equalsEps8(@AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps8(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps8(v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps8(v1[2], v2.z())) return false;
		if (!MathUtils.equalsEps8(v1[3], v2.w())) return false;

		return true;
	}
	
	public static boolean equalsEps8(float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps8(v1v0, v2.x())) return false;
		if (!MathUtils.equalsEps8(v1v1, v2.y())) return false;
		if (!MathUtils.equalsEps8(v1v2, v2.z())) return false;
		if (!MathUtils.equalsEps8(v1v3, v2.w())) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2.x();
			case 1 -> v1.y() == v2.y();
			case 2 -> v1.z() == v2.z();
			case 3 -> v1.w() == v2.w();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2[0];
			case 1 -> v1.y() == v2[1];
			case 2 -> v1.z() == v2[2];
			case 3 -> v1.w() == v2[3];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec4RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == value;
			case 1 -> v1.y() == value;
			case 2 -> v1.z() == value;
			case 3 -> v1.w() == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2v0;
			case 1 -> v1.y() == v2v1;
			case 2 -> v1.z() == v2v2;
			case 3 -> v1.w() == v2v3;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == v2.x();
			case 1 -> v1[1] == v2.y();
			case 2 -> v1[2] == v2.z();
			case 3 -> v1[3] == v2.w();
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> v1v0 == v2.x();
			case 1 -> v1v1 == v2.y();
			case 2 -> v1v2 == v2.z();
			case 3 -> v1v3 == v2.w();
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), v2.z());
			case 3 -> MathUtils.equalsEps(tolerance, v1.w(), v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), v2[2]);
			case 3 -> MathUtils.equalsEps(tolerance, v1.w(), v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec4RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), value);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), value);
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), value);
			case 3 -> MathUtils.equalsEps(tolerance, v1.w(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2v0);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2v1);
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), v2v2);
			case 3 -> MathUtils.equalsEps(tolerance, v1.z(), v2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], v2.y());
			case 2 -> MathUtils.equalsEps(tolerance, v1[2], v2.z());
			case 3 -> MathUtils.equalsEps(tolerance, v1[3], v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1v0, v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1v1, v2.y());
			case 2 -> MathUtils.equalsEps(tolerance, v1v2, v2.z());
			case 3 -> MathUtils.equalsEps(tolerance, v1v3, v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps4(v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps4(v1.z(), v2.z());
			case 3 -> MathUtils.equalsEps4(v1.w(), v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps4(v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps4(v1.z(), v2[2]);
			case 3 -> MathUtils.equalsEps4(v1.w(), v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec4RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), value);
			case 1 -> MathUtils.equalsEps4(v1.y(), value);
			case 2 -> MathUtils.equalsEps4(v1.z(), value);
			case 3 -> MathUtils.equalsEps4(v1.w(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2v0);
			case 1 -> MathUtils.equalsEps4(v1.y(), v2v1);
			case 2 -> MathUtils.equalsEps4(v1.z(), v2v2);
			case 3 -> MathUtils.equalsEps4(v1.z(), v2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps4(v1[1], v2.y());
			case 2 -> MathUtils.equalsEps4(v1[2], v2.z());
			case 3 -> MathUtils.equalsEps4(v1[3], v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1v0, v2.x());
			case 1 -> MathUtils.equalsEps4(v1v1, v2.y());
			case 2 -> MathUtils.equalsEps4(v1v2, v2.z());
			case 3 -> MathUtils.equalsEps4(v1v3, v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps6(v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps6(v1.z(), v2.z());
			case 3 -> MathUtils.equalsEps6(v1.w(), v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps6(v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps6(v1.z(), v2[2]);
			case 3 -> MathUtils.equalsEps6(v1.w(), v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec4RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), value);
			case 1 -> MathUtils.equalsEps6(v1.y(), value);
			case 2 -> MathUtils.equalsEps6(v1.z(), value);
			case 3 -> MathUtils.equalsEps6(v1.w(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2v0);
			case 1 -> MathUtils.equalsEps6(v1.y(), v2v1);
			case 2 -> MathUtils.equalsEps6(v1.z(), v2v2);
			case 3 -> MathUtils.equalsEps6(v1.z(), v2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps6(v1[1], v2.y());
			case 2 -> MathUtils.equalsEps6(v1[2], v2.z());
			case 3 -> MathUtils.equalsEps6(v1[3], v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1v0, v2.x());
			case 1 -> MathUtils.equalsEps6(v1v1, v2.y());
			case 2 -> MathUtils.equalsEps6(v1v2, v2.z());
			case 3 -> MathUtils.equalsEps6(v1v3, v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull IVec4RF v1, @AllowNull IVec4RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps8(v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps8(v1.z(), v2.z());
			case 3 -> MathUtils.equalsEps8(v1.w(), v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec4RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps8(v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps8(v1.z(), v2[2]);
			case 3 -> MathUtils.equalsEps8(v1.w(), v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec4RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), value);
			case 1 -> MathUtils.equalsEps8(v1.y(), value);
			case 2 -> MathUtils.equalsEps8(v1.z(), value);
			case 3 -> MathUtils.equalsEps8(v1.w(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec4RF v1, float v2v0, float v2v1, float v2v2, float v2v3)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2v0);
			case 1 -> MathUtils.equalsEps8(v1.y(), v2v1);
			case 2 -> MathUtils.equalsEps8(v1.z(), v2v2);
			case 3 -> MathUtils.equalsEps8(v1.z(), v2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, @AllowNull IVec4RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps8(v1[1], v2.y());
			case 2 -> MathUtils.equalsEps8(v1[2], v2.z());
			case 3 -> MathUtils.equalsEps8(v1[3], v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, float v1v0, float v1v1, float v1v2, float v1v3, @AllowNull IVec4RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1v0, v2.x());
			case 1 -> MathUtils.equalsEps8(v1v1, v2.y());
			case 2 -> MathUtils.equalsEps8(v1v2, v2.z());
			case 3 -> MathUtils.equalsEps8(v1v3, v2.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFinite(IVec4RF v1)
	{
		return Float.isFinite(v1.x()) && Float.isFinite(v1.y()) && Float.isFinite(v1.z()) && Float.isFinite(v1.w());
	}
	
	public static boolean isFiniteAt(int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> Float.isFinite(v1.x());
			case 1 -> Float.isFinite(v1.y());
			case 2 -> Float.isFinite(v1.z());
			case 3 -> Float.isFinite(v1.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isInfinite(IVec4RF v1)
	{
		return Float.isInfinite(v1.x()) && Float.isInfinite(v1.y()) && Float.isInfinite(v1.z()) && Float.isInfinite(v1.w());
	}
	
	public static boolean isInfiniteAt(int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(v1.x());
			case 1 -> Float.isInfinite(v1.y());
			case 2 -> Float.isInfinite(v1.z());
			case 3 -> Float.isInfinite(v1.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaN(IVec4RF v1)
	{
		return Float.isNaN(v1.x()) && Float.isNaN(v1.y()) && Float.isNaN(v1.z()) && Float.isNaN(v1.w());
	}
	
	public static boolean isNaNAt(int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> Float.isNaN(v1.x());
			case 1 -> Float.isNaN(v1.y());
			case 2 -> Float.isNaN(v1.z());
			case 3 -> Float.isNaN(v1.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZero(IVec4RF v1)
	{
		return v1.x() == 0.0f && v1.y() == 0.0f && v1.z() == 0.0f && v1.w() == 0.0f;
	}
	
	public static boolean isZeroEps(float tolerance, IVec4RF v1)
	{
		return MathUtils.isZeroEps(tolerance, v1.x()) && MathUtils.isZeroEps(tolerance, v1.y()) && MathUtils.isZeroEps(tolerance, v1.z());
	}
	
	public static boolean isZeroEps4(IVec4RF v1)
	{
		return MathUtils.isZeroEps4(v1.x()) && MathUtils.isZeroEps4(v1.y()) && MathUtils.isZeroEps4(v1.z()) && MathUtils.isZeroEps4(v1.w());
	}
	
	public static boolean isZeroEps6(IVec4RF v1)
	{
		return MathUtils.isZeroEps6(v1.x()) && MathUtils.isZeroEps6(v1.y()) && MathUtils.isZeroEps6(v1.z()) && MathUtils.isZeroEps6(v1.w());
	}

	public static boolean isZeroEps8(IVec4RF v1)
	{
		return MathUtils.isZeroEps8(v1.x()) && MathUtils.isZeroEps8(v1.y()) && MathUtils.isZeroEps8(v1.z()) && MathUtils.isZeroEps8(v1.w());
	}
	
	public static boolean isZeroAt(int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> v1.x() == 0.0f;
			case 1 -> v1.y() == 0.0f;
			case 2 -> v1.z() == 0.0f;
			case 3 -> v1.w() == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps(float tolerance, int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps(tolerance, v1.x());
			case 1 -> MathUtils.isZeroEps(tolerance, v1.y());
			case 2 -> MathUtils.isZeroEps(tolerance, v1.z());
			case 3 -> MathUtils.isZeroEps(tolerance, v1.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps4(int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps4(v1.x());
			case 1 -> MathUtils.isZeroEps4(v1.y());
			case 2 -> MathUtils.isZeroEps4(v1.z());
			case 3 -> MathUtils.isZeroEps4(v1.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps6(int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps6(v1.x());
			case 1 -> MathUtils.isZeroEps6(v1.y());
			case 2 -> MathUtils.isZeroEps6(v1.z());
			case 3 -> MathUtils.isZeroEps6(v1.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps8(int index, IVec4RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps8(v1.x());
			case 1 -> MathUtils.isZeroEps8(v1.y());
			case 2 -> MathUtils.isZeroEps8(v1.z());
			case 3 -> MathUtils.isZeroEps8(v1.w());
			default -> throw new IndexOutOfBoundsException();
		};
	}
}
