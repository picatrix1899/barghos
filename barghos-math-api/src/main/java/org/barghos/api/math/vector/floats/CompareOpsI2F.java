package org.barghos.api.math.vector.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.core.math.MathUtils;

public class CompareOpsI2F
{
	private CompareOpsI2F() { }
	
	public static boolean equals(@AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (v1.x() != v2.x()) return false;
		if (v1.y() != v2.y()) return false;

		return true;
	}
	
	public static boolean equals(@AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (v1.x() != v2[0]) return false;
		if (v1.y() != v2[1]) return false;

		return true;
	}

	public static boolean equals(@AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		if (v1.x() != v2X) return false;
		if (v1.y() != v2Y) return false;

		return true;
	}
	
	public static boolean equals(@AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (v1[0] != v2.x()) return false;
		if (v1[1] != v2.y()) return false;

		return true;
	}
	
	public static boolean equals(float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		if (v1X != v2.x()) return false;
		if (v1Y != v2.y()) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2[1])) return false;

		return true;
	}

	public static boolean equalsEps(float tolerance, @AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps(tolerance, v1.y(), v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1[1], v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps(tolerance, v1X, v2.x())) return false;
		if (!MathUtils.equalsEps(tolerance, v1Y, v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2[1])) return false;

		return true;
	}

	public static boolean equalsEps4(@AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps4(v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps4(v1.y(), v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps4(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps4(v1[1], v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps4(float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps4(v1X, v2.x())) return false;
		if (!MathUtils.equalsEps4(v1Y, v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2[1])) return false;

		return true;
	}

	public static boolean equalsEps6(@AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps6(v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps6(v1.y(), v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps6(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps6(v1[1], v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps6(float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps6(v1X, v2.x())) return false;
		if (!MathUtils.equalsEps6(v1Y, v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps8(v1.x(), v2.x())) return false;
		if (!MathUtils.equalsEps8(v1.y(), v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps8(v1.x(), v2[0])) return false;
		if (!MathUtils.equalsEps8(v1.y(), v2[1])) return false;

		return true;
	}

	public static boolean equalsEps8(@AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		if (!MathUtils.equalsEps8(v1.x(), v2X)) return false;
		if (!MathUtils.equalsEps8(v1.y(), v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		if (!MathUtils.equalsEps8(v1[0], v2.x())) return false;
		if (!MathUtils.equalsEps8(v1[1], v2.y())) return false;

		return true;
	}
	
	public static boolean equalsEps8(float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		if (!MathUtils.equalsEps8(v1X, v2.x())) return false;
		if (!MathUtils.equalsEps8(v1Y, v2.y())) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2.x();
			case 1 -> v1.y() == v2.y();
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, @AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2[0];
			case 1 -> v1.y() == v2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec2RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == value;
			case 1 -> v1.y() == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> v1.x() == v2X;
			case 1 -> v1.y() == v2Y;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == v2.x();
			case 1 -> v1[1] == v2.y();
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> v1X == v2.x();
			case 1 -> v1Y == v2.y();
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec2RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), value);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps(float tolerance, int index, @AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1.x(), v2X);
			case 1 -> MathUtils.equalsEps(tolerance, v1.y(), v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1X, v2.x());
			case 1 -> MathUtils.equalsEps(tolerance, v1Y, v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps4(v1.y(), v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps4(v1.y(), v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec2RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), value);
			case 1 -> MathUtils.equalsEps4(v1.y(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps4(int index, @AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1.x(), v2X);
			case 1 -> MathUtils.equalsEps4(v1.y(), v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps4(v1[1], v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1X, v2.x());
			case 1 -> MathUtils.equalsEps4(v1Y, v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps6(v1.y(), v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps6(v1.y(), v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec2RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), value);
			case 1 -> MathUtils.equalsEps6(v1.y(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps6(int index, @AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1.x(), v2X);
			case 1 -> MathUtils.equalsEps6(v1.y(), v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps6(v1[1], v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1X, v2.x());
			case 1 -> MathUtils.equalsEps6(v1Y, v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull IVec2RF v1, @AllowNull IVec2RF v2)
	{
		if (v1 == v2) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2.x());
			case 1 -> MathUtils.equalsEps8(v1.y(), v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull IVec2RF v1, @AllowNull float[] v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2[0]);
			case 1 -> MathUtils.equalsEps8(v1.y(), v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec2RF v1, float value)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), value);
			case 1 -> MathUtils.equalsEps8(v1.y(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, @AllowNull IVec2RF v1, float v2X, float v2Y)
	{
		if (v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1.x(), v2X);
			case 1 -> MathUtils.equalsEps8(v1.y(), v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, @AllowNull IVec2RF v2)
	{
		if (v1 == null && v2 == null) return true;
		if (v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], v2.x());
			case 1 -> MathUtils.equalsEps8(v1[1], v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEps8(int index, float v1X, float v1Y, @AllowNull IVec2RF v2)
	{
		if (v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1X, v2.x());
			case 1 -> MathUtils.equalsEps8(v1Y, v2.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFinite(IVec2RF v1)
	{
		return Float.isFinite(v1.x()) && Float.isFinite(v1.y());
	}

	public static boolean isFiniteAt(int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> Float.isFinite(v1.x());
			case 1 -> Float.isFinite(v1.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isInfinite(IVec2RF v1)
	{
		return Float.isInfinite(v1.x()) && Float.isInfinite(v1.y());
	}

	public static boolean isInfiniteAt(int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(v1.x());
			case 1 -> Float.isInfinite(v1.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaN(IVec2RF v1)
	{
		return Float.isNaN(v1.x()) && Float.isNaN(v1.y());
	}

	public static boolean isNaNAt(int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> Float.isNaN(v1.x());
			case 1 -> Float.isNaN(v1.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZero(IVec2RF v1)
	{
		return v1.x() == 0.0f && v1.y() == 0.0f;
	}

	public static boolean isZeroEps(float tolerance, IVec2RF v1)
	{
		return MathUtils.isZeroEps(tolerance, v1.x()) && MathUtils.isZeroEps(tolerance, v1.y());
	}
	
	public static boolean isZeroEps4(IVec2RF v1)
	{
		return MathUtils.isZeroEps4(v1.x()) && MathUtils.isZeroEps4(v1.y());
	}

	public static boolean isZeroEps6(IVec2RF v1)
	{
		return MathUtils.isZeroEps6(v1.x()) && MathUtils.isZeroEps6(v1.y());
	}
	
	public static boolean isZeroEps8(IVec2RF v1)
	{
		return MathUtils.isZeroEps8(v1.x()) && MathUtils.isZeroEps8(v1.y());
	}

	public static boolean isZeroAt(int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> v1.x() == 0.0f;
			case 1 -> v1.y() == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEps(float tolerance, int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps(tolerance, v1.x());
			case 1 -> MathUtils.isZeroEps(tolerance, v1.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps4(int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps4(v1.x());
			case 1 -> MathUtils.isZeroEps4(v1.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps6(int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps6(v1.x());
			case 1 -> MathUtils.isZeroEps6(v1.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps8(int index, IVec2RF v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps8(v1.x());
			case 1 -> MathUtils.isZeroEps8(v1.y());
			default -> throw new IndexOutOfBoundsException();
		};
	}
}
