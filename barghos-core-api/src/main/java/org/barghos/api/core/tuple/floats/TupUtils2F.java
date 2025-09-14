package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class TupUtils2F
{
	
	public static boolean equals(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		if (t1.v0() != t2.v0()) return false;
		if (t1.v1() != t2.v1()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		if (t1.v0() != t2.getAt(0)) return false;
		if (t1.v1() != t2.getAt(1)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

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
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		if (t1.getAt(0) != t2.v0()) return false;
		if (t1.getAt(1) != t2.v1()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		if (t1.getAt(0) != t2.getAt(0)) return false;
		if (t1.getAt(1) != t2.getAt(1)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		if (t1.getAt(0) != t2[0]) return false;
		if (t1.getAt(1) != t2[1]) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		if (t1.getAt(0) != t2v0) return false;
		if (t1.getAt(1) != t2v1) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		if (t1[0] != t2.v0()) return false;
		if (t1[1] != t2.v1()) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		if (t1[0] != t2.getAt(0)) return false;
		if (t1[1] != t2.getAt(1)) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		if (t1[0] != t2[0]) return false;
		if (t1[1] != t2[1]) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		if (t1[0] != t2v0) return false;
		if (t1[1] != t2v1) return false;

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
		if (t2.size() != 2) return false;

		if (t1v0 != t2.getAt(0)) return false;
		if (t1v1 != t2.getAt(1)) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		if (t1v0 != t2[0]) return false;
		if (t1v1 != t2[1]) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, float t2v0, float t2v1)
	{
		if (t1v0 != t2v0) return false;
		if (t1v1 != t2v1) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2.v1())) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2.getAt(1))) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2[1])) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2v1)) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2.v1())) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1))) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2[1])) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2v1)) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2.v1())) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2.getAt(1))) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2[1])) return false;

		return true;
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2v1)) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2.v1())) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2.getAt(1))) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2[1])) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		if (!MathUtils.equals(tolerance, t1v0, t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2v1)) return false;

		return true;
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
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
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return t1.v0() == t2.getAt(0);
		case 1:
			return t1.v1() == t2.getAt(1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return t1.v0() == t2[0];
		case 1:
			return t1.v1() == t2[1];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return t1.v0() == value;
		case 1:
			return t1.v1() == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return t1.v0() == t2v0;
		case 1:
			return t1.v1() == t2v1;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2.v0();
		case 1:
			return t1.getAt(1) == t2.v1();
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
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2.getAt(0);
		case 1:
			return t1.getAt(1) == t2.getAt(1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2[0];
		case 1:
			return t1.getAt(1) == t2[1];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == value;
		case 1:
			return t1.getAt(1) == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		switch (index) {
		case 0:
			return t1.getAt(0) == t2v0;
		case 1:
			return t1.getAt(1) == t2v1;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		switch (index) {
		case 0:
			return t1[0] == t2.v0();
		case 1:
			return t1[1] == t2.v1();
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return t1[0] == t2.getAt(0);
		case 1:
			return t1[1] == t2.getAt(1);
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
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return t1[0] == t2[0];
		case 1:
			return t1[1] == t2[1];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		switch (index) {
		case 0:
			return t1[0] == value;
		case 1:
			return t1[1] == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		switch (index) {
		case 0:
			return t1[0] == t2v0;
		case 1:
			return t1[1] == t2v1;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		switch (index) {
		case 0:
			return t1v0 == t2.v0();
		case 1:
			return t1v1 == t2.v1();
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return t1v0 == t2.getAt(0);
		case 1:
			return t1v1 == t2.getAt(1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return t1v0 == t2[0];
		case 1:
			return t1v1 == t2[1];
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float value)
	{
		switch (index) {
		case 0:
			return t1v0 == value;
		case 1:
			return t1v1 == value;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		switch (index) {
		case 0:
			return t1v0 == t2v0;
		case 1:
			return t1v1 == t2v1;
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
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
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), t2[1]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), value);
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup2RF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.v0(), t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1.v1(), t2v1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2.v0());
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2.v1());
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
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2[1]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), value);
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1.getAt(0), t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1.getAt(1), t2v1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2.v0());
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2.v1());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2.getAt(1));
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
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2[1]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], value);
		case 1:
			return MathUtils.equals(tolerance, t1[1], value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float t2v0, float t2v1)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1[0], t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1[1], t2v1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITup2RF t2)
	{
		if (t2 == null) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2.v0());
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2.v1());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2.getAt(0));
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2.getAt(1));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2[0]);
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2[1]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float value)
	{
		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, value);
		case 1:
			return MathUtils.equals(tolerance, t1v1, value);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAt(float tolerance, int index, float t1v0, float t1v1, float t2v0, float t2v1)
	{
		switch (index) {
		case 0:
			return MathUtils.equals(tolerance, t1v0, t2v0);
		case 1:
			return MathUtils.equals(tolerance, t1v1, t2v1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v0() == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		return t1.v0() == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

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
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		return t1.getAt(0) == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		return t1.getAt(0) == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		return t1.getAt(0) == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		return t1.getAt(0) == value;
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		return t1[0] == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		return t1[0] == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		return t1[0] == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		return t1[0] == value;
	}

	public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v1() == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		return t1.v1() == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

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
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		return t1.getAt(1) == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		return t1.getAt(1) == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		return t1.getAt(1) == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		return t1.getAt(1) == value;
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		return t1[1] == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		return t1[1] == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		return t1[1] == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		return t1[1] == value;
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup2RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equals(tolerance, t.v0(), value);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), value);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		return MathUtils.equals(tolerance, t1[0], t2.v0());
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		return MathUtils.equals(tolerance, t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		return MathUtils.equals(tolerance, t1[0], t2[0]);
	}

	public static boolean equalsAtV0(float tolerance, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		return MathUtils.equals(tolerance, t1[0], value);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 2) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITup2RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.v1(), value);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup2RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 2) return false;
		if (t2.length != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 2) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), value);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITup2RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;

		return MathUtils.equals(tolerance, t1[1], t2.v1());
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.size() != 2) return false;

		return MathUtils.equals(tolerance, t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 2) return false;
		if (t2.length != 2) return false;

		return MathUtils.equals(tolerance, t1[1], t2[1]);
	}

	public static boolean equalsAtV1(float tolerance, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 2) return false;

		return MathUtils.equals(tolerance, t1[1], value);
	}

	public static boolean isFinite(ITup2RF t)
	{
		return Float.isFinite(t.v0()) && Float.isFinite(t.v1());
	}

	public static boolean isFinite(ITupRF t)
	{
		return Float.isFinite(t.getAt(0)) && Float.isFinite(t.getAt(1));
	}

	public static boolean isFinite(float[] t)
	{
		return Float.isFinite(t[0]) && Float.isFinite(t[1]);
	}

	public static boolean isFinite(float tv0, float tv1)
	{
		return Float.isFinite(tv0) && Float.isFinite(tv1);
	}

	public static boolean isFiniteAt(int index, ITup2RF t)
	{
		switch (index) {
		case 0:
			return Float.isFinite(t.v0());
		case 1:
			return Float.isFinite(t.v1());
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
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAt(int index, float tv0, float tv1)
	{
		switch (index) {
		case 0:
			return Float.isFinite(tv0);
		case 1:
			return Float.isFinite(tv1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAtV0(ITup2RF t)
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

	public static boolean isFiniteAtV1(ITup2RF t)
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

	public static boolean isZero(ITup2RF t)
	{
		return MathUtils.isZero(t.v0()) && MathUtils.isZero(t.v1());
	}

	public static boolean isZero(ITupRF t)
	{
		return MathUtils.isZero(t.getAt(0)) && MathUtils.isZero(t.getAt(1));
	}

	public static boolean isZero(float[] t)
	{
		return MathUtils.isZero(t[0]) && MathUtils.isZero(t[1]);
	}

	public static boolean isZero(float tv0, float tv1)
	{
		return MathUtils.isZero(tv0) && MathUtils.isZero(tv1);
	}

	public static boolean isZero(float tolerance, ITup2RF t)
	{
		return MathUtils.isZero(tolerance, t.v0()) && MathUtils.isZero(tolerance, t.v1());
	}

	public static boolean isZero(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(0)) && MathUtils.isZero(tolerance, t.getAt(1));
	}

	public static boolean isZero(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[0]) && MathUtils.isZero(tolerance, t[1]);
	}

	public static boolean isZero(float tolerance, float tv0, float tv1)
	{
		return MathUtils.isZero(tolerance, tv0) && MathUtils.isZero(tolerance, tv1);
	}

	public static boolean isZeroAt(int index, ITup2RF t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(t.v0());
		case 1:
			return MathUtils.isZero(t.v1());
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
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(int index, float tv0, float tv1)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tv0);
		case 1:
			return MathUtils.isZero(tv1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(float tolerance, int index, ITup2RF t)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tolerance, t.v0());
		case 1:
			return MathUtils.isZero(tolerance, t.v1());
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
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAt(float tolerance, int index, float tv0, float tv1)
	{
		switch (index) {
		case 0:
			return MathUtils.isZero(tolerance, tv0);
		case 1:
			return MathUtils.isZero(tolerance, tv1);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isZeroAtV0(ITup2RF t)
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

	public static boolean isZeroAtV1(ITup2RF t)
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

	public static boolean isZeroAtV0(float tolerance, ITup2RF t)
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

	public static boolean isZeroAtV1(float tolerance, ITup2RF t)
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
}
