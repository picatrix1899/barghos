package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class TupUtils2F
{
	
	public static boolean equals(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.v0() != t2.v0()) return false;
		if (t1.v1() != t2.v1()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.v0() != t2.at(0)) return false;
		if (t1.v1() != t2.at(1)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.v0() != t2[0]) return false;
		if (t1.v1() != t2[1]) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (t1.v0() != t2v0) return false;
		if (t1.v1() != t2v1) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.at(0) != t2.v0()) return false;
		if (t1.at(1) != t2.v1()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.at(0) != t2.at(0)) return false;
		if (t1.at(1) != t2.at(1)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.at(0) != t2[0]) return false;
		if (t1.at(1) != t2[1]) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (t1.at(0) != t2v0) return false;
		if (t1.at(1) != t2v1) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1[0] != t2.v0()) return false;
		if (t1[1] != t2.v1()) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1[0] != t2.at(0)) return false;
		if (t1[1] != t2.at(1)) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		if (t1v0 != t2.v0()) return false;
		if (t1v1 != t2.v1()) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (t1v0 != t2.at(0)) return false;
		if (t1v1 != t2.at(1)) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2.at(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.at(0), t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1.at(1), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.at(0), t2.at(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.at(1), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.at(0), t2[0])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.at(1), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.at(0), t2v0)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.at(1), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1[1], t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1[0], t2.at(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1[1], t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1v1, t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1v0, t2.at(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1v1, t2.at(1))) return false;

		return true;
	}
	
	public static boolean equalsEM4(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2.at(0))) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.at(0), t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1.at(1), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.at(0), t2.at(0))) return false;
		if (!MathUtils.equalsEM4(t1.at(1), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.at(0), t2[0])) return false;
		if (!MathUtils.equalsEM4(t1.at(1), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM4(t1.at(0), t2v0)) return false;
		if (!MathUtils.equalsEM4(t1.at(1), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1[1], t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1[0], t2.at(0))) return false;
		if (!MathUtils.equalsEM4(t1[1], t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM4(float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM4(t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1v1, t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM4(float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM4(t1v0, t2.at(0))) return false;
		if (!MathUtils.equalsEM4(t1v1, t2.at(1))) return false;

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.at(0))) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.at(0), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.at(1), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.at(0), t2.at(0))) return false;
		if (!MathUtils.equalsEM6(t1.at(1), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.at(0), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.at(1), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM6(t1.at(0), t2v0)) return false;
		if (!MathUtils.equalsEM6(t1.at(1), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.at(0))) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM6(float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1v1, t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM6(float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1v0, t2.at(0))) return false;
		if (!MathUtils.equalsEM6(t1v1, t2.at(1))) return false;

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2.at(0))) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.at(0), t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1.at(1), t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.at(0), t2.at(0))) return false;
		if (!MathUtils.equalsEM8(t1.at(1), t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.at(0), t2[0])) return false;
		if (!MathUtils.equalsEM8(t1.at(1), t2[1])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM8(t1.at(0), t2v0)) return false;
		if (!MathUtils.equalsEM8(t1.at(1), t2v1)) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1[1], t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1[0], t2.at(0))) return false;
		if (!MathUtils.equalsEM8(t1[1], t2.at(1))) return false;

		return true;
	}

	public static boolean equalsEM8(float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM8(t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1v1, t2.v1())) return false;

		return true;
	}

	public static boolean equalsEM8(float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM8(t1v0, t2.at(0))) return false;
		if (!MathUtils.equalsEM8(t1v1, t2.at(1))) return false;

		return true;
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2.v0();
			case 1 -> t1.v1() == t2.v1();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2.at(0);
			case 1 -> t1.v1() == t2.at(1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2[0];
			case 1 -> t1.v1() == t2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == value;
			case 1 -> t1.v1() == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2v0;
			case 1 -> t1.v1() == t2v1;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.at(0) == t2.v0();
			case 1 -> t1.at(1) == t2.v1();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.at(0) == t2.at(0);
			case 1 -> t1.at(1) == t2.at(1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.at(0) == t2[0];
			case 1 -> t1.at(1) == t2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.at(0) == value;
			case 1 -> t1.at(1) == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.at(0) == t2v0;
			case 1 -> t1.at(1) == t2v1;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2.v0();
			case 1 -> t1[1] == t2.v1();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2.at(0);
			case 1 -> t1[1] == t2.at(1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> t1v0 == t2.v0();
			case 1 -> t1v1 == t2.v1();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> t1v0 == t2.at(0);
			case 1 -> t1v1 == t2.at(1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2.at(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), value);
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.at(0), t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1.at(1), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.at(0), t2.at(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1.at(1), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.at(0), t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1.at(1), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.at(0), value);
			case 1 -> MathUtils.equalsEM(tolerance, t1.at(1), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.at(0), t2v0);
			case 1 -> MathUtils.equalsEM(tolerance, t1.at(1), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2.at(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1v1, t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1v0, t2.at(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1v1, t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2.at(0));
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), value);
			case 1 -> MathUtils.equalsEM4(t1.v1(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.at(0), t2.v0());
			case 1 -> MathUtils.equalsEM4(t1.at(1), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.at(0), t2.at(0));
			case 1 -> MathUtils.equalsEM4(t1.at(1), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.at(0), t2[0]);
			case 1 -> MathUtils.equalsEM4(t1.at(1), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.at(0), value);
			case 1 -> MathUtils.equalsEM4(t1.at(1), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.at(0), t2v0);
			case 1 -> MathUtils.equalsEM4(t1.at(1), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM4(t1[1], t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2.at(0));
			case 1 -> MathUtils.equalsEM4(t1[1], t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM4(t1v1, t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1v0, t2.at(0));
			case 1 -> MathUtils.equalsEM4(t1v1, t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2.at(0));
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), value);
			case 1 -> MathUtils.equalsEM6(t1.v1(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.at(0), t2.v0());
			case 1 -> MathUtils.equalsEM6(t1.at(1), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.at(0), t2.at(0));
			case 1 -> MathUtils.equalsEM6(t1.at(1), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.at(0), t2[0]);
			case 1 -> MathUtils.equalsEM6(t1.at(1), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.at(0), value);
			case 1 -> MathUtils.equalsEM6(t1.at(1), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.at(0), t2v0);
			case 1 -> MathUtils.equalsEM6(t1.at(1), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM6(t1[1], t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2.at(0));
			case 1 -> MathUtils.equalsEM6(t1[1], t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM6(t1v1, t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1v0, t2.at(0));
			case 1 -> MathUtils.equalsEM6(t1v1, t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2.at(0));
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), value);
			case 1 -> MathUtils.equalsEM8(t1.v1(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.at(0), t2.v0());
			case 1 -> MathUtils.equalsEM8(t1.at(1), t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.at(0), t2.at(0));
			case 1 -> MathUtils.equalsEM8(t1.at(1), t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.at(0), t2[0]);
			case 1 -> MathUtils.equalsEM8(t1.at(1), t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.at(0), value);
			case 1 -> MathUtils.equalsEM8(t1.at(1), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.at(0), t2v0);
			case 1 -> MathUtils.equalsEM8(t1.at(1), t2v1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM8(t1[1], t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2.at(0));
			case 1 -> MathUtils.equalsEM8(t1[1], t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM8(t1v1, t2.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1v0, t2.at(0));
			case 1 -> MathUtils.equalsEM8(t1v1, t2.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v0() == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v0() == t2.at(0);
	}

	public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v0() == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return t1.v0() == value;
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.at(0) == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.at(0) == t2.at(0);
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.at(0) == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return t1.at(0) == value;
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[0] == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[0] == t2.at(0);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v0(), t2.at(0));
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup2RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM(tolerance, t.v0(), value);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(0), t2.v0());
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(0), t2.at(0));
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(0), t2[0]);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(0), value);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], t2.at(0));
	}
	
	public static boolean equalsAtV0EM4(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), t2.at(0));
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup2RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM4(t.v0(), value);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.at(0), t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.at(0), t2.at(0));
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.at(0), t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.at(0), value);
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[0], t2.at(0));
	}
	
	public static boolean equalsAtV0EM6(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), t2.at(0));
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup2RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM6(t.v0(), value);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.at(0), t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.at(0), t2.at(0));
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.at(0), t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.at(0), value);
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[0], t2.at(0));
	}
	
	public static boolean equalsAtV0EM8(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), t2.at(0));
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup2RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM8(t.v0(), value);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.at(0), t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.at(0), t2.at(0));
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.at(0), t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.at(0), value);
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[0], t2.at(0));
	}
	
	public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v1() == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v1() == t2.at(1);
	}

	public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v1() == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITup2RF t, float value)
	{
		if (t == null) return false;

		return t.v1() == value;
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.at(1) == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.at(1) == t2.at(1);
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.at(1) == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return t1.at(1) == value;
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[1] == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[1] == t2.at(1);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), t2.at(1));
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), value);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(1), t2.v1());
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(1), t2.at(1));
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(1), t2[1]);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.at(1), value);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], t2.at(1));
	}
	
	public static boolean equalsAtV1EM4(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), t2.at(1));
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), value);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.at(1), t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.at(1), t2.at(1));
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.at(1), t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.at(1), value);
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[1], t2.at(1));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), t2.at(1));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), value);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.at(1), t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.at(1), t2.at(1));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.at(1), t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.at(1), value);
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[1], t2.at(1));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), t2.at(1));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), value);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.at(1), t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.at(1), t2.at(1));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.at(1), t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.at(1), value);
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[1], t2.at(1));
	}

	public static boolean isFinite(ITup2RF t)
	{
		return Float.isFinite(t.v0()) && Float.isFinite(t.v1());
	}

	public static boolean isFinite(ITupRF t)
	{
		return Float.isFinite(t.at(0)) && Float.isFinite(t.at(1));
	}

	public static boolean isFiniteAt(int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t.v0());
			case 1 -> Float.isFinite(t.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isFiniteAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t.at(0));
			case 1 -> Float.isFinite(t.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isFiniteAtV0(ITup2RF t)
	{
		return Float.isFinite(t.v0());
	}

	public static boolean isFiniteAtV0(ITupRF t)
	{
		return Float.isFinite(t.at(0));
	}

	public static boolean isFiniteAtV1(ITup2RF t)
	{
		return Float.isFinite(t.v1());
	}

	public static boolean isFiniteAtV1(ITupRF t)
	{
		return Float.isFinite(t.at(1));
	}

	public static boolean isInfinite(ITup2RF t)
	{
		return Float.isInfinite(t.v0()) && Float.isInfinite(t.v1());
	}

	public static boolean isInfinite(ITupRF t)
	{
		return Float.isInfinite(t.at(0)) && Float.isInfinite(t.at(1));
	}

	public static boolean isInfiniteAt(int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(t.v0());
			case 1 -> Float.isInfinite(t.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isInfiniteAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(t.at(0));
			case 1 -> Float.isInfinite(t.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isInfiniteAtV0(ITup2RF t)
	{
		return Float.isInfinite(t.v0());
	}

	public static boolean isInfiniteAtV0(ITupRF t)
	{
		return Float.isInfinite(t.at(0));
	}

	public static boolean isInfiniteAtV1(ITup2RF t)
	{
		return Float.isInfinite(t.v1());
	}

	public static boolean isInfiniteAtV1(ITupRF t)
	{
		return Float.isInfinite(t.at(1));
	}
	
	public static boolean isNaN(ITup2RF t)
	{
		return Float.isNaN(t.v0()) && Float.isNaN(t.v1());
	}

	public static boolean isNaN(ITupRF t)
	{
		return Float.isNaN(t.at(0)) && Float.isNaN(t.at(1));
	}

	public static boolean isNaNAt(int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> Float.isNaN(t.v0());
			case 1 -> Float.isNaN(t.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isNaNAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> Float.isNaN(t.at(0));
			case 1 -> Float.isNaN(t.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isNaNAtV0(ITup2RF t)
	{
		return Float.isNaN(t.v0());
	}

	public static boolean isNaNAtV0(ITupRF t)
	{
		return Float.isNaN(t.at(0));
	}

	public static boolean isNaNAtV1(ITup2RF t)
	{
		return Float.isNaN(t.v1());
	}

	public static boolean isNaNAtV1(ITupRF t)
	{
		return Float.isNaN(t.at(1));
	}
	
	public static boolean isZero(ITup2RF t)
	{
		return t.v0() == 0.0f && t.v1() == 0.0f;
	}

	public static boolean isZero(ITupRF t)
	{
		return t.at(0) == 0.0f && t.at(1) == 0.0f;
	}

	public static boolean isZeroEM(float tolerance, ITup2RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v0()) && MathUtils.isZeroEM(tolerance, t.v1());
	}

	public static boolean isZeroEM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.at(0)) && MathUtils.isZeroEM(tolerance, t.at(1));
	}
	
	public static boolean isZeroEM4(ITup2RF t)
	{
		return MathUtils.isZeroEM4(t.v0()) && MathUtils.isZeroEM4(t.v1());
	}

	public static boolean isZeroEM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.at(0)) && MathUtils.isZeroEM4(t.at(1));
	}

	public static boolean isZeroEM6(ITup2RF t)
	{
		return MathUtils.isZeroEM6(t.v0()) && MathUtils.isZeroEM6(t.v1());
	}

	public static boolean isZeroEM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.at(0)) && MathUtils.isZeroEM6(t.at(1));
	}
	
	public static boolean isZeroEM8(ITup2RF t)
	{
		return MathUtils.isZeroEM8(t.v0()) && MathUtils.isZeroEM8(t.v1());
	}

	public static boolean isZeroEM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.at(0)) && MathUtils.isZeroEM8(t.at(1));
	}

	public static boolean isZeroAt(int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> t.v0() == 0.0f;
			case 1 -> t.v1() == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> t.at(0) == 0.0f;
			case 1 -> t.at(1) == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM(float tolerance, int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, t.v0());
			case 1 -> MathUtils.isZeroEM(tolerance, t.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM(float tolerance, int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, t.at(0));
			case 1 -> MathUtils.isZeroEM(tolerance, t.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM4(int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(t.v0());
			case 1 -> MathUtils.isZeroEM4(t.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM4(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(t.at(0));
			case 1 -> MathUtils.isZeroEM4(t.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM6(int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(t.v0());
			case 1 -> MathUtils.isZeroEM6(t.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM6(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(t.at(0));
			case 1 -> MathUtils.isZeroEM6(t.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM8(int index, ITup2RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(t.v0());
			case 1 -> MathUtils.isZeroEM8(t.v1());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM8(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(t.at(0));
			case 1 -> MathUtils.isZeroEM8(t.at(1));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtV0(ITup2RF t)
	{
		return t.v0() == 0.0f;
	}

	public static boolean isZeroAtV0(ITupRF t)
	{
		return t.at(0) == 0.0f;
	}

	public static boolean isZeroAtV0EM(float tolerance, ITup2RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v0());
	}

	public static boolean isZeroAtV0EM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.at(0));
	}

	public static boolean isZeroAtV0EM4(ITup2RF t)
	{
		return MathUtils.isZeroEM4(t.v0());
	}

	public static boolean isZeroAtV0EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.at(0));
	}

	public static boolean isZeroAtV0EM6(ITup2RF t)
	{
		return MathUtils.isZeroEM6(t.v0());
	}

	public static boolean isZeroAtV0EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.at(0));
	}
	
	public static boolean isZeroAtV0EM8(ITup2RF t)
	{
		return MathUtils.isZeroEM8(t.v0());
	}

	public static boolean isZeroAtV0EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.at(0));
	}
	
	public static boolean isZeroAtV1(ITup2RF t)
	{
		return t.v1() == 0.0f;
	}

	public static boolean isZeroAtV1(ITupRF t)
	{
		return t.at(1) == 0.0f;
	}
	
	public static boolean isZeroAtV1EM(float tolerance, ITup2RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v1());
	}

	public static boolean isZeroAtV1EM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.at(1));
	}
	
	public static boolean isZeroAtV1EM4(ITup2RF t)
	{
		return MathUtils.isZeroEM4(t.v1());
	}

	public static boolean isZeroAtV1EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.at(1));
	}
	
	public static boolean isZeroAtV1EM6(ITup2RF t)
	{
		return MathUtils.isZeroEM6(t.v1());
	}

	public static boolean isZeroAtV1EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.at(1));
	}

	public static boolean isZeroAtV1EM8(ITup2RF t)
	{
		return MathUtils.isZeroEM8(t.v1());
	}

	public static boolean isZeroAtV1EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.at(1));
	}
}
