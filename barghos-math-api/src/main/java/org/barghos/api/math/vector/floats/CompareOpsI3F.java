package org.barghos.api.math.vector.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.core.math.MathUtils;

public class CompareOpsI3F
{
	private CompareOpsI3F() { }
	
	public static boolean equals(@AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (v1.x() != v2.x()) return false;
		if (v1.y() != v2.y()) return false;
		if (v1.z() != v2.z()) return false;

		return true;
	}

	public static boolean equals(@AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (v1.x() != v2[0]) return false;
		if (v1.y() != v2[1]) return false;
		if (v1.z() != v2[2]) return false;

		return true;
	}

	public static boolean equals(@AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		if (v1.x() != v2X) return false;
		if (v1.y() != v2Y) return false;
		if (v1.z() != v2Z) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (v1[0] != v2.x()) return false;
		if (v1[1] != v2.y()) return false;
		if (v1[2] != v2.z()) return false;

		return true;
	}

	public static boolean equals(float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		if (v1X != v2.x()) return false;
		if (v1Y != v2.y()) return false;
		if (v1Z != v2.z()) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps(tolerance, v1.z(), v2.z())) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps(tolerance, v1.z(), v2[2])) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2Y)) return false;
		if (!MathUtils.equalsEps(tolerance, v1.z(), v2Z)) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps(tolerance, v1[2], v2.z())) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1X, v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1Y, v2.y())) return false;
		if (!MathUtils.equalsEps(tolerance, v1Z, v2.z())) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps4(v1.z(), v2.z())) return false;

		return true;
	}

	public static boolean equalsEps4(@AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps4(v1.z(), v2[2])) return false;

		return true;
	}

	public static boolean equalsEps4(@AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2Y)) return false;
		if (!MathUtils.equalsEps4(v1.z(), v2Z)) return false;

		return true;
	}

	public static boolean equalsEps4(@AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps4(v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps4(v1[2], v2.z())) return false;

		return true;
	}

	public static boolean equalsEps4(float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps4(v1X, v2.x())) return false;
		if (!MathUtils.equalsEps4(v1Y, v2.y())) return false;
		if (!MathUtils.equalsEps4(v1Z, v2.z())) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2.z())) return false;

		return true;
	}

	public static boolean equalsEps6(@AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2[2])) return false;

		return true;
	}

	public static boolean equalsEps6(@AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2Y)) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2Z)) return false;

		return true;
	}

	public static boolean equalsEps6(@AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps6(v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps6(v1[2], v2.z())) return false;

		return true;
	}

	public static boolean equalsEps6(float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps6(v1X, v2.x())) return false;
		if (!MathUtils.equalsEps6(v1Y, v2.y())) return false;
		if (!MathUtils.equalsEps6(v1Z, v2.z())) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2.y())) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2.z())) return false;

		return true;
	}

	public static boolean equalsEps8(@AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2[1])) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2[2])) return false;

		return true;
	}

	public static boolean equalsEps8(@AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2Y)) return false;
		if (!MathUtils.equalsEps6(v1.z(), v2Z)) return false;

		return true;
	}

	public static boolean equalsEps8(@AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps6(v1[1], v2.y())) return false;
		if (!MathUtils.equalsEps6(v1[2], v2.z())) return false;

		return true;
	}

	public static boolean equalsEps8(float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps6(v1X, v2.x())) return false;
		if (!MathUtils.equalsEps6(v1Y, v2.y())) return false;
		if (!MathUtils.equalsEps6(v1Z, v2.z())) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2.x();
			case 1 -> v1.y() == v2.y();
			case 2 -> v1.z() == v2.z();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2[0];
			case 1 -> v1.y() == v2[1];
			case 2 -> v1.z() == v2[2];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec3RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == value;
			case 1 -> v1.y() == value;
			case 2 -> v1.z() == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2X;
			case 1 -> v1.y() == v2Y;
			case 2 -> v1.z() == v2Z;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == v2.x();
			case 1 -> v1[1] == v2.y();
			case 2 -> v1[2] == v2.z();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> v1X == v2.x();
			case 1 -> v1Y == v2.y();
			case 2 -> v1Z == v2.z();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), v2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec3RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), value);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), value);
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2X);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2Y);
			case 2 -> MathUtils.equalsEps(tolerance, v1.z(), v2Z);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], v2.y());
			case 2 -> MathUtils.equalsEps(tolerance, v1[2], v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1X, v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1Y, v2.y());
			case 2 -> MathUtils.equalsEps(tolerance, v1Z, v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps4(v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps4(v1.z(), v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps4(v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps4(v1.z(), v2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec3RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), value);
			case 1 -> MathUtils.equalsEps4(v1.y(), value);
			case 2 -> MathUtils.equalsEps4(v1.z(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2X);
			case 1 -> MathUtils.equalsEps4(v1.y(), v2Y);
			case 2 -> MathUtils.equalsEps4(v1.z(), v2Z);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps4(v1[1], v2.y());
			case 2 -> MathUtils.equalsEps4(v1[2], v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1X, v2.x());
			case 1 -> MathUtils.equalsEps4(v1Y, v2.y());
			case 2 -> MathUtils.equalsEps4(v1Z, v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps6(v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps6(v1.z(), v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps6(v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps6(v1.z(), v2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec3RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), value);
			case 1 -> MathUtils.equalsEps6(v1.y(), value);
			case 2 -> MathUtils.equalsEps6(v1.z(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2X);
			case 1 -> MathUtils.equalsEps6(v1.y(), v2Y);
			case 2 -> MathUtils.equalsEps6(v1.z(), v2Z);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps6(v1[1], v2.y());
			case 2 -> MathUtils.equalsEps6(v1[2], v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1X, v2.x());
			case 1 -> MathUtils.equalsEps6(v1Y, v2.y());
			case 2 -> MathUtils.equalsEps6(v1Z, v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull IVec3RF v1, @AllowNull IVec3RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps8(v1.y(), v2.y());
			case 2 -> MathUtils.equalsEps8(v1.z(), v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec3RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps8(v1.y(), v2[1]);
			case 2 -> MathUtils.equalsEps8(v1.z(), v2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec3RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), value);
			case 1 -> MathUtils.equalsEps8(v1.y(), value);
			case 2 -> MathUtils.equalsEps8(v1.z(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec3RF v1, float v2X, float v2Y, float v2Z)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2X);
			case 1 -> MathUtils.equalsEps8(v1.y(), v2Y);
			case 2 -> MathUtils.equalsEps8(v1.z(), v2Z);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, @AllowNull IVec3RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps8(v1[1], v2.y());
			case 2 -> MathUtils.equalsEps8(v1[2], v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, float v1X, float v1Y, float v1Z, @AllowNull IVec3RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1X, v2.x());
			case 1 -> MathUtils.equalsEps8(v1Y, v2.y());
			case 2 -> MathUtils.equalsEps8(v1Z, v2.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFinite(IVec3RF v1)
	{
		return Float.isFinite(v1.x()) && Float.isFinite(v1.y()) && Float.isFinite(v1.z());
	}

	public static boolean isFiniteAt(int index, IVec3RF v1)
	{
		return switch (index) {
			case 0 -> Float.isFinite(v1.x());
			case 1 -> Float.isFinite(v1.y());
			case 2 -> Float.isFinite(v1.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isInfinite(IVec3RF v1)
	{
		return Float.isInfinite(v1.x()) && Float.isInfinite(v1.y()) && Float.isInfinite(v1.z());
	}

	public static boolean isInfiniteAt(int index, IVec3RF v1)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(v1.x());
			case 1 -> Float.isInfinite(v1.y());
			case 2 -> Float.isInfinite(v1.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaN(IVec3RF v1)
	{
		return Float.isNaN(v1.x()) && Float.isNaN(v1.y()) && Float.isNaN(v1.z());
	}

	public static boolean isNaNAt(int index, IVec3RF v1)
	{
		return switch (index) {
			case 0 -> Float.isNaN(v1.x());
			case 1 -> Float.isNaN(v1.y());
			case 2 -> Float.isNaN(v1.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZero(IVec3RF v1)
	{
		return v1.x() == 0.0f && v1.y() == 0.0f && v1.z() == 0.0f;
	}

	public static boolean isZeroEps(float tolerance, IVec3RF v1)
	{
		return MathUtils.isZeroEps(tolerance, v1.x()) && MathUtils.isZeroEps(tolerance, v1.y()) && MathUtils.isZeroEps(tolerance, v1.z());
	}
	
	public static boolean isZeroEps4(IVec3RF v1)
	{
		return MathUtils.isZeroEps4(v1.x()) && MathUtils.isZeroEps4(v1.y()) && MathUtils.isZeroEps4(v1.z());
	}
	
	public static boolean isZeroEps6(IVec3RF v1)
	{
		return MathUtils.isZeroEps6(v1.x()) && MathUtils.isZeroEps6(v1.y()) && MathUtils.isZeroEps6(v1.z());
	}
	
	public static boolean isZeroEps8(IVec3RF v1)
	{
		return MathUtils.isZeroEps8(v1.x()) && MathUtils.isZeroEps8(v1.y()) && MathUtils.isZeroEps8(v1.z());
	}

	public static boolean isZeroAt(int index, IVec3RF v1)
	{
		return switch(index) {
			case 0 -> v1.x() == 0.0f;
			case 1 -> v1.y() == 0.0f;
			case 2 -> v1.z() == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEps(float tolerance, int index, IVec3RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps(tolerance, v1.x());
			case 1 -> MathUtils.isZeroEps(tolerance, v1.y());
			case 2 -> MathUtils.isZeroEps(tolerance, v1.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEps4(int index, IVec3RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps4(v1.x());
			case 1 -> MathUtils.isZeroEps4(v1.y());
			case 2 -> MathUtils.isZeroEps4(v1.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps6(int index, IVec3RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps6(v1.x());
			case 1 -> MathUtils.isZeroEps6(v1.y());
			case 2 -> MathUtils.isZeroEps6(v1.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps8(int index, IVec3RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps8(v1.x());
			case 1 -> MathUtils.isZeroEps8(v1.y());
			case 2 -> MathUtils.isZeroEps8(v1.z());
			default -> throw new IndexOutOfBoundsException();
		};
	}
}
