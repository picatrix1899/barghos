package org.barghos.util.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.util.math.MathUtils;

public class TupUtils3F
{
	
	public static boolean equals(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		if (t1.v0() != t2.v0()) return false;
		if (t1.v1() != t2.v1()) return false;
		if (t1.v2() != t2.v2()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (t1.v0() != t2.getAt(0)) return false;
		if (t1.v1() != t2.getAt(1)) return false;
		if (t1.v2() != t2.getAt(2)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (t1.v0() != t2[0]) return false;
		if (t1.v1() != t2[1]) return false;
		if (t1.v2() != t2[2]) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;

		if (t1.v0() != t2v0) return false;
		if (t1.v1() != t2v1) return false;
		if (t1.v2() != t2v2) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		if (t1.getAt(0) != t2.v0()) return false;
		if (t1.getAt(1) != t2.v1()) return false;
		if (t1.getAt(2) != t2.v2()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		if (t1.getAt(0) != t2.getAt(0)) return false;
		if (t1.getAt(1) != t2.getAt(1)) return false;
		if (t1.getAt(2) != t2.getAt(2)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		if (t1.getAt(0) != t2[0]) return false;
		if (t1.getAt(1) != t2[1]) return false;
		if (t1.getAt(2) != t2[2]) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (t1.getAt(0) != t2v0) return false;
		if (t1.getAt(1) != t2v1) return false;
		if (t1.getAt(2) != t2v2) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		if (t1[0] != t2.v0()) return false;
		if (t1[1] != t2.v1()) return false;
		if (t1[2] != t2.v2()) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		if (t1[0] != t2.getAt(0)) return false;
		if (t1[1] != t2.getAt(1)) return false;
		if (t1[2] != t2.getAt(2)) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		if (t1[0] != t2[0]) return false;
		if (t1[1] != t2[1]) return false;
		if (t1[2] != t2[2]) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (t1[0] != t2v0) return false;
		if (t1[1] != t2v1) return false;
		if (t1[2] != t2v2) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, float t1v2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		if (t1v0 != t2.v0()) return false;
		if (t1v1 != t2.v1()) return false;
		if (t1v2 != t2.v2()) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, float t1v2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (t1v0 != t2.getAt(0)) return false;
		if (t1v1 != t2.getAt(1)) return false;
		if (t1v2 != t2.getAt(2)) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, float t1v2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (t1v0 != t2[0]) return false;
		if (t1v1 != t2[1]) return false;
		if (t1v2 != t2[2]) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		if (t1v0 != t2v0) return false;
		if (t1v1 != t2v1) return false;
		if (t1v2 != t2v2) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2.v1())) return false;
		if (!MathUtils.equals(tolerance, t2.v1(), t2.v2())) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equals(tolerance, t1.v2(), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2[1])) return false;
		if (!MathUtils.equals(tolerance, t1.v2(), t2[2])) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1.v2(), t2v2)) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(2), t2.v2())) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(2), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(2), t2[2])) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(2), t2v2)) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2.v1())) return false;
		if (!MathUtils.equals(tolerance, t1[2], t2.v2())) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equals(tolerance, t1[2], t2.getAt(2))) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2[1])) return false;
		if (!MathUtils.equals(tolerance, t1[2], t2[2])) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1[2], t2v2)) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, float t1v2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2.v1())) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2.v2())) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, float t1v2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2.getAt(1))) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2.getAt(2))) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, float t1v2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2[1])) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2[2])) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		if (!MathUtils.equals(tolerance, t1v0, t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2v2)) return false;

		return true;
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		switch (index) {
		case 0:
			return t1.v0() == t2.v0();
		case 1:
			return t1.v1() == t2.v1();
		case 2:
			return t1.v2() == t2.v2();
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return t1.v0() == t2.getAt(0);
		case 1:
			return t1.v1() == t2.getAt(1);
		case 2:
			return t1.v2() == t2.getAt(2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return t1.v0() == t2[0];
		case 1:
			return t1.v1() == t2[1];
		case 2:
			return t1.v2() == t2[2];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return t1.v0() == value;
		case 1:
			return t1.v1() == value;
		case 2:
			return t1.v2() == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return t1.v0() == t2v0;
		case 1:
			return t1.v1() == t2v1;
		case 2:
			return t1.v2() == t2v2;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2.v0();
		case 1:
			return t1.getAt(1) == t2.v1();
		case 2:
			return t1.getAt(2) == t2.v2();
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2.getAt(0);
		case 1:
			return t1.getAt(1) == t2.getAt(1);
		case 2:
			return t1.getAt(2) == t2.getAt(2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2[0];
		case 1:
			return t1.getAt(1) == t2[1];
		case 2:
			return t1.getAt(2) == t2[2];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == value;
		case 1:
			return t1.getAt(1) == value;
		case 2:
			return t1.getAt(2) == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2v0;
		case 1:
			return t1.getAt(1) == t2v1;
		case 2:
			return t1.getAt(2) == t2v2;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		switch (index) {
		case 0:
			return t1[0] == t2.v0();
		case 1:
			return t1[1] == t2.v1();
		case 2:
			return t1[2] == t2.v2();
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return t1[0] == t2.getAt(0);
		case 1:
			return t1[1] == t2.getAt(1);
		case 2:
			return t1[2] == t2.getAt(2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return t1[0] == t2[0];
		case 1:
			return t1[1] == t2[1];
		case 2:
			return t1[2] == t2[2];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		switch (index) {
		case 0:
			return t1[0] == value;
		case 1:
			return t1[1] == value;
		case 2:
			return t1[2] == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		switch (index) {
		case 0:
			return t1[0] == t2v0;
		case 1:
			return t1[1] == t2v1;
		case 2:
			return t1[2] == t2v2;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float t1v2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		switch (index) {
		case 0:
			return t1v0 == t2.v0();
		case 1:
			return t1v1 == t2.v1();
		case 2:
			return t1v2 == t2.v2();
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float t1v2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return t1v0 == t2.getAt(0);
		case 1:
			return t1v1 == t2.getAt(1);
		case 2:
			return t1v2 == t2.getAt(2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float t1v2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return t1v0 == t2[0];
		case 1:
			return t1v1 == t2[1];
		case 2:
			return t1v2 == t2[2];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float t1v2, float value)
	{
		switch (index) {
		case 0:
			return t1v0 == value;
		case 1:
			return t1v1 == value;
		case 2:
			return t1v2 == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		switch (index) {
		case 0:
			return t1v0 == t2v0;
		case 1:
			return t1v1 == t2v1;
		case 2:
			return t1v2 == t2v2;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), t2.v0());
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), t2.v1());
		case 2:
			return MathUtils.equals(tolerance, t1.v2(), t2.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
		case 2:
			return MathUtils.equals(tolerance, t1.v2(), t2.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), t2[1]);
		case 2:
			return MathUtils.equals(tolerance, t1.v2(), t2[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), value);
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), value);
		case 2:
			return MathUtils.equals(tolerance, t1.v2(), value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), t2v1);
		case 2:
			return MathUtils.equals(tolerance, t1.v2(), t2v2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2.v0());
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2.v1());
		case 2:
			return MathUtils.equals(tolerance, t1.getAt(2), t2.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1));
		case 2:
			return MathUtils.equals(tolerance, t1.getAt(2), t2.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2[1]);
		case 2:
			return MathUtils.equals(tolerance, t1.getAt(2), t2[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), value);
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), value);
		case 2:
			return MathUtils.equals(tolerance, t1.getAt(2), value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2v1);
		case 2:
			return MathUtils.equals(tolerance, t1.getAt(2), t2v2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2.v0());
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2.v1());
		case 2:
			return MathUtils.equals(tolerance, t1[2], t2.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2.getAt(1));
		case 2:
			return MathUtils.equals(tolerance, t1[2], t2.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2[1]);
		case 2:
			return MathUtils.equals(tolerance, t1[2], t2[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], value);
		case 1:
			return MathUtils.equals(tolerance, t1[1], value);
		case 2:
			return MathUtils.equals(tolerance, t1[2], value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float t2v0, float t2v1, float t2v2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2v1);
		case 2:
			return MathUtils.equals(tolerance, t1[2], t2v2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t1v2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2.v0());
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2.v1());
		case 2:
			return MathUtils.equals(tolerance, t1v2, t2.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t1v2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2.getAt(1));
		case 2:
			return MathUtils.equals(tolerance, t1v2, t2.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t1v2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2[1]);
		case 2:
			return MathUtils.equals(tolerance, t1v2, t2[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t1v2, float value)
	{
		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, value);
		case 1:
			return MathUtils.equals(tolerance, t1v1, value);
		case 2:
			return MathUtils.equals(tolerance, t1v2, value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t1v2, float t2v0, float t2v1, float t2v2)
	{
		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2v1);
		case 2:
			return MathUtils.equals(tolerance, t1v2, t2v2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAtV0(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v0() == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return t1.v0() == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return t1.v0() == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return t1.v0() == value;
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(0) == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return t1.getAt(0) == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return t1.getAt(0) == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(0) == value;
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return t1[0] == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return t1[0] == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return t1[0] == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return t1[0] == value;
	}

	public static boolean equalsAtV1(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v1() == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return t1.v1() == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return t1.v1() == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITup3RF t, float value)
	{
		if (t == null) return false;

		return t.v1() == value;
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(1) == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return t1.getAt(1) == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return t1.getAt(1) == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(1) == value;
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return t1[1] == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return t1[1] == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return t1[1] == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return t1[1] == value;
	}

	public static boolean equalsAtV2(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v2() == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return t1.v2() == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return t1.v2() == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull ITup3RF t, float value)
	{
		if (t == null) return false;

		return t.v2() == value;
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(2) == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return t1.getAt(2) == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return t1.getAt(2) == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(2) == value;
	}

	public static boolean equalsAtV2(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return t1[2] == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return t1[2] == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return t1[2] == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return t1[2] == value;
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup3RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equals(tolerance, t.v0(), value);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), value);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[0], t2.v0());
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1[0], t2[0]);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[0], value);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.v1(), value);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), value);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[1], t2.v1());
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1[1], t2[1]);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[1], value);
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.v2(), value);
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), value);
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[2], t2.v2());
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1[2], t2.getAt(2));
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1[2], t2[2]);
	}

	public static boolean equalsAtV2(float tolerance, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[2], value);
	}

	public static boolean isFinite(ITup3RF t)
	{
		return Float.isFinite(t.v0()) && Float.isFinite(t.v1()) && Float.isFinite(t.v2());
	}

	public static boolean isFinite(ITupRF t)
	{
		return Float.isFinite(t.getAt(0)) && Float.isFinite(t.getAt(1)) && Float.isFinite(t.getAt(2));
	}

	public static boolean isFinite(float[] t)
	{
		return Float.isFinite(t[0]) && Float.isFinite(t[1]) && Float.isFinite(t[2]);
	}

	public static boolean isFinite(float tv0, float tv1, float tv2)
	{
		return Float.isFinite(tv0) && Float.isFinite(tv1) && Float.isFinite(tv2);
	}

	public static boolean isFiniteAt(int index, ITup3RF t)
	{
		switch (index) {
		case 0:
			return Float.isFinite(t.v0());
		case 1:
			return Float.isFinite(t.v1());
		case 2:
			return Float.isFinite(t.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAt(int index, ITupRF t)
	{
		switch (index) {
		case 0:
			return Float.isFinite(t.getAt(0));
		case 1:
			return Float.isFinite(t.getAt(1));
		case 2:
			return Float.isFinite(t.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAt(int index, float[] t)
	{
		switch (index) {
		case 0:
			return Float.isFinite(t[0]);
		case 1:
			return Float.isFinite(t[1]);
		case 2:
			return Float.isFinite(t[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAt(int index, float tv0, float tv1, float tv2)
	{
		switch (index) {
		case 0:
			return Float.isFinite(tv0);
		case 1:
			return Float.isFinite(tv1);
		case 2:
			return Float.isFinite(tv2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAtV0(ITup3RF t)
	{
		return Float.isFinite(t.v0());
	}

	public static boolean isFiniteAtV0(ITupRF t)
	{
		return Float.isFinite(t.getAt(0));
	}

	public static boolean isFiniteAtV0(float[] t)
	{
		return Float.isFinite(t[0]);
	}

	public static boolean isFiniteAtV1(ITup3RF t)
	{
		return Float.isFinite(t.v1());
	}

	public static boolean isFiniteAtV1(ITupRF t)
	{
		return Float.isFinite(t.getAt(1));
	}

	public static boolean isFiniteAtV1(float[] t)
	{
		return Float.isFinite(t[1]);
	}

	public static boolean isFiniteAtV2(ITup3RF t)
	{
		return Float.isFinite(t.v2());
	}

	public static boolean isFiniteAtV2(ITupRF t)
	{
		return Float.isFinite(t.getAt(2));
	}

	public static boolean isFiniteAtV2(float[] t)
	{
		return Float.isFinite(t[2]);
	}

	public static boolean isZero(ITup3RF t)
	{
		return MathUtils.isZero(t.v0()) && MathUtils.isZero(t.v1()) && MathUtils.isZero(t.v2());
	}

	public static boolean isZero(ITupRF t)
	{
		return MathUtils.isZero(t.getAt(0)) && MathUtils.isZero(t.getAt(1)) && MathUtils.isZero(t.getAt(2));
	}

	public static boolean isZero(float[] t)
	{
		return MathUtils.isZero(t[0]) && MathUtils.isZero(t[1]) && MathUtils.isZero(t[2]);
	}

	public static boolean isZero(float tv0, float tv1, float tv2)
	{
		return MathUtils.isZero(tv0) && MathUtils.isZero(tv1) && MathUtils.isZero(tv2);
	}

	public static boolean isZero(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v0()) && MathUtils.isZero(tolerance, t.v1());
	}

	public static boolean isZero(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(0)) && MathUtils.isZero(tolerance, t.getAt(1)) && MathUtils.isZero(tolerance, t.getAt(2));
	}

	public static boolean isZero(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[0]) && MathUtils.isZero(tolerance, t[1]) && MathUtils.isZero(tolerance, t[2]);
	}

	public static boolean isZero(float tolerance, float tv0, float tv1, float tv2)
	{
		return MathUtils.isZero(tolerance, tv0) && MathUtils.isZero(tolerance, tv1) && MathUtils.isZero(tolerance, tv2);
	}

	public static boolean isZeroAt(int index, ITup3RF t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(t.v0());
		case 1:
			return MathUtils.isZero(t.v1());
		case 2:
			return MathUtils.isZero(t.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(int index, ITupRF t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(t.getAt(0));
		case 1:
			return MathUtils.isZero(t.getAt(1));
		case 2:
			return MathUtils.isZero(t.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(int index, float[] t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(t[0]);
		case 1:
			return MathUtils.isZero(t[1]);
		case 2:
			return MathUtils.isZero(t[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(int index, float tv0, float tv1, float tv2)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tv0);
		case 1:
			return MathUtils.isZero(tv1);
		case 2:
			return MathUtils.isZero(tv2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(float tolerance, int index, ITup3RF t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tolerance, t.v0());
		case 1:
			return MathUtils.isZero(tolerance, t.v1());
		case 2:
			return MathUtils.isZero(tolerance, t.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(float tolerance, int index, ITupRF t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tolerance, t.getAt(0));
		case 1:
			return MathUtils.isZero(tolerance, t.getAt(1));
		case 2:
			return MathUtils.isZero(tolerance, t.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(float tolerance, int index, float[] t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tolerance, t[0]);
		case 1:
			return MathUtils.isZero(tolerance, t[1]);
		case 2:
			return MathUtils.isZero(tolerance, t[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(float tolerance, int index, float tv0, float tv1, float tv2)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tolerance, tv0);
		case 1:
			return MathUtils.isZero(tolerance, tv1);
		case 2:
			return MathUtils.isZero(tolerance, tv2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAtV0(ITup3RF t)
	{
		return MathUtils.isZero(t.v0());
	}

	public static boolean isZeroAtV0(ITupRF t)
	{
		return MathUtils.isZero(t.getAt(0));
	}

	public static boolean isZeroAtV0(float[] t)
	{
		return MathUtils.isZero(t[0]);
	}

	public static boolean isZeroAtV1(ITup3RF t)
	{
		return MathUtils.isZero(t.v1());
	}

	public static boolean isZeroAtV1(ITupRF t)
	{
		return MathUtils.isZero(t.getAt(1));
	}

	public static boolean isZeroAtV1(float[] t)
	{
		return MathUtils.isZero(t[1]);
	}

	public static boolean isZeroAtV2(ITup3RF t)
	{
		return MathUtils.isZero(t.v2());
	}

	public static boolean isZeroAtV2(ITupRF t)
	{
		return MathUtils.isZero(t.getAt(2));
	}

	public static boolean isZeroAtV2(float[] t)
	{
		return MathUtils.isZero(t[2]);
	}

	public static boolean isZeroAtV0(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v0());
	}

	public static boolean isZeroAtV0(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(0));
	}

	public static boolean isZeroAtV0(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[0]);
	}

	public static boolean isZeroAtV1(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v1());
	}

	public static boolean isZeroAtV1(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(1));
	}

	public static boolean isZeroAtV1(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[1]);
	}

	public static boolean isZeroAtV2(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v2());
	}

	public static boolean isZeroAtV2(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(2));
	}

	public static boolean isZeroAtV2(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[2]);
	}
}
