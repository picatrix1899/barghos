package org.barghos.impl.core.tuple.doubles;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class TupUtils3D
{
	
	public static boolean equals(@AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
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

	public static boolean equals(@AllowNull ITup3RD t1, @AllowNull ITupRD t2)
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

	public static boolean equals(@AllowNull ITup3RD t1, @AllowNull double[] t2)
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

	public static boolean equals(@AllowNull ITup3RD t1, double t2v0, double t2v1, double t2v2)
	{
		if (t1 == null) return false;

		if (t1.v0() != t2v0) return false;
		if (t1.v1() != t2v1) return false;
		if (t1.v2() != t2v2) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRD t1, @AllowNull ITup3RD t2)
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

	public static boolean equals(@AllowNull ITupRD t1, @AllowNull ITupRD t2)
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

	public static boolean equals(@AllowNull ITupRD t1, @AllowNull double[] t2)
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

	public static boolean equals(@AllowNull ITupRD t1, double t2v0, double t2v1, double t2v2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (t1.getAt(0) != t2v0) return false;
		if (t1.getAt(1) != t2v1) return false;
		if (t1.getAt(2) != t2v2) return false;

		return true;
	}

	public static boolean equals(@AllowNull double[] t1, @AllowNull ITup3RD t2)
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

	public static boolean equals(@AllowNull double[] t1, @AllowNull ITupRD t2)
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

	public static boolean equals(@AllowNull double[] t1, @AllowNull double[] t2)
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

	public static boolean equals(@AllowNull double[] t1, double t2v0, double t2v1, double t2v2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (t1[0] != t2v0) return false;
		if (t1[1] != t2v1) return false;
		if (t1[2] != t2v2) return false;

		return true;
	}

	public static boolean equals(double t1v0, double t1v1, double t1v2, @AllowNull ITup3RD t2)
	{
		if (t2 == null) return false;

		if (t1v0 != t2.v0()) return false;
		if (t1v1 != t2.v1()) return false;
		if (t1v2 != t2.v2()) return false;

		return true;
	}

	public static boolean equals(double t1v0, double t1v1, double t1v2, @AllowNull ITupRD t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (t1v0 != t2.getAt(0)) return false;
		if (t1v1 != t2.getAt(1)) return false;
		if (t1v2 != t2.getAt(2)) return false;

		return true;
	}

	public static boolean equals(double t1v0, double t1v1, double t1v2, @AllowNull double[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (t1v0 != t2[0]) return false;
		if (t1v1 != t2[1]) return false;
		if (t1v2 != t2[2]) return false;

		return true;
	}

	public static boolean equals(double t1v0, double t1v1, double t1v2, double t2v0, double t2v1, double t2v2)
	{
		if (t1v0 != t2v0) return false;
		if (t1v1 != t2v1) return false;
		if (t1v2 != t2v2) return false;

		return true;
	}

	public static boolean equals(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
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

	public static boolean equals(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITupRD t2)
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

	public static boolean equals(double tolerance, @AllowNull ITup3RD t1, @AllowNull double[] t2)
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

	public static boolean equals(double tolerance, @AllowNull ITup3RD t1, double t2v0, double t2v1, double t2v2)
	{
		if (t1 == null) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1.v2(), t2v2)) return false;

		return true;
	}

	public static boolean equals(double tolerance, @AllowNull ITupRD t1, @AllowNull ITup3RD t2)
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

	public static boolean equals(double tolerance, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
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

	public static boolean equals(double tolerance, @AllowNull ITupRD t1, @AllowNull double[] t2)
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

	public static boolean equals(double tolerance, @AllowNull ITupRD t1, double t2v0, double t2v1, double t2v2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(2), t2v2)) return false;

		return true;
	}

	public static boolean equals(double tolerance, @AllowNull double[] t1, @AllowNull ITup3RD t2)
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

	public static boolean equals(double tolerance, @AllowNull double[] t1, @AllowNull ITupRD t2)
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

	public static boolean equals(double tolerance, @AllowNull double[] t1, @AllowNull double[] t2)
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

	public static boolean equals(double tolerance, @AllowNull double[] t1, double t2v0, double t2v1, double t2v2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1[2], t2v2)) return false;

		return true;
	}

	public static boolean equals(double tolerance, double t1v0, double t1v1, double t1v2, @AllowNull ITup3RD t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2.v1())) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2.v2())) return false;

		return true;
	}

	public static boolean equals(double tolerance, double t1v0, double t1v1, double t1v2, @AllowNull ITupRD t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2.getAt(1))) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2.getAt(2))) return false;

		return true;
	}

	public static boolean equals(double tolerance, double t1v0, double t1v1, double t1v2, @AllowNull double[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1v0, t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2[1])) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2[2])) return false;

		return true;
	}

	public static boolean equals(double tolerance, double t1v0, double t1v1, double t1v2, double t2v0, double t2v1, double t2v2)
	{
		if (!MathUtils.equals(tolerance, t1v0, t2v0)) return false;
		if (!MathUtils.equals(tolerance, t1v1, t2v1)) return false;
		if (!MathUtils.equals(tolerance, t1v2, t2v2)) return false;

		return true;
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(int index, @AllowNull ITup3RD t1, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(int index, @AllowNull ITup3RD t1, @AllowNull double[] t2)
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

	public static boolean equalsAt(int index, @AllowNull ITup3RD t1, double value)
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

	public static boolean equalsAt(int index, @AllowNull ITup3RD t1, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAt(int index, @AllowNull ITupRD t1, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(int index, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(int index, @AllowNull ITupRD t1, @AllowNull double[] t2)
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

	public static boolean equalsAt(int index, @AllowNull ITupRD t1, double value)
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

	public static boolean equalsAt(int index, @AllowNull ITupRD t1, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAt(int index, @AllowNull double[] t1, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(int index, @AllowNull double[] t1, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(int index, @AllowNull double[] t1, @AllowNull double[] t2)
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

	public static boolean equalsAt(int index, @AllowNull double[] t1, double value)
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

	public static boolean equalsAt(int index, @AllowNull double[] t1, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAt(int index, double t1v0, double t1v1, double t1v2, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(int index, double t1v0, double t1v1, double t1v2, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(int index, double t1v0, double t1v1, double t1v2, @AllowNull double[] t2)
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

	public static boolean equalsAt(int index, double t1v0, double t1v1, double t1v2, double value)
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

	public static boolean equalsAt(int index, double t1v0, double t1v1, double t1v2, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITup3RD t1, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITup3RD t1, @AllowNull double[] t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITup3RD t1, double value)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITup3RD t1, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, @AllowNull double[] t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, double value)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, @AllowNull double[] t2)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, double value)
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

	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAt(double tolerance, int index, double t1v0, double t1v1, double t1v2, @AllowNull ITup3RD t2)
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

	public static boolean equalsAt(double tolerance, int index, double t1v0, double t1v1, double t1v2, @AllowNull ITupRD t2)
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

	public static boolean equalsAt(double tolerance, int index, double t1v0, double t1v1, double t1v2, @AllowNull double[] t2)
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

	public static boolean equalsAt(double tolerance, int index, double t1v0, double t1v1, double t1v2, double value)
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

	public static boolean equalsAt(double tolerance, int index, double t1v0, double t1v1, double t1v2, double t2v0, double t2v1, double t2v2)
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

	public static boolean equalsAtV0(@AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v0() == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITup3RD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return t1.v0() == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITup3RD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return t1.v0() == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITup3RD t1, double value)
	{
		if (t1 == null) return false;

		return t1.v0() == value;
	}

	public static boolean equalsAtV0(@AllowNull ITupRD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(0) == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return t1.getAt(0) == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return t1.getAt(0) == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(0) == value;
	}

	public static boolean equalsAtV0(@AllowNull double[] t1, @AllowNull ITup3RD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return t1[0] == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return t1[0] == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return t1[0] == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return t1[0] == value;
	}

	public static boolean equalsAtV1(@AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v1() == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITup3RD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return t1.v1() == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITup3RD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return t1.v1() == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITup3RD t, double value)
	{
		if (t == null) return false;

		return t.v1() == value;
	}

	public static boolean equalsAtV1(@AllowNull ITupRD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(1) == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return t1.getAt(1) == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return t1.getAt(1) == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(1) == value;
	}

	public static boolean equalsAtV1(@AllowNull double[] t1, @AllowNull ITup3RD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return t1[1] == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return t1[1] == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return t1[1] == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return t1[1] == value;
	}

	public static boolean equalsAtV2(@AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return t1.v2() == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull ITup3RD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return t1.v2() == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull ITup3RD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return t1.v2() == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull ITup3RD t, double value)
	{
		if (t == null) return false;

		return t.v2() == value;
	}

	public static boolean equalsAtV2(@AllowNull ITupRD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(2) == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return t1.getAt(2) == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return t1.getAt(2) == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return t1.getAt(2) == value;
	}

	public static boolean equalsAtV2(@AllowNull double[] t1, @AllowNull ITup3RD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return t1[2] == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return t1[2] == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return t1[2] == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return t1[2] == value;
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITup3RD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITup3RD t, double value)
	{
		if (t == null) return false;

		return MathUtils.equals(tolerance, t.v0(), value);
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITupRD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(0), value);
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull double[] t1, @AllowNull ITup3RD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[0], t2.v0());
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1[0], t2[0]);
	}

	public static boolean equalsAtV0(double tolerance, @AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[0], value);
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITup3RD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITup3RD t1, double value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.v1(), value);
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITupRD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(1), value);
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull double[] t1, @AllowNull ITup3RD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[1], t2.v1());
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1[1], t2[1]);
	}

	public static boolean equalsAtV1(double tolerance, @AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[1], value);
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals(tolerance, t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITup3RD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITup3RD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITup3RD t1, double value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.v2(), value);
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITupRD t1, @AllowNull ITup3RD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals(tolerance, t1.getAt(2), value);
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull double[] t1, @AllowNull ITup3RD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[2], t2.v2());
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals(tolerance, t1[2], t2.getAt(2));
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals(tolerance, t1[2], t2[2]);
	}

	public static boolean equalsAtV2(double tolerance, @AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals(tolerance, t1[2], value);
	}

	public static boolean isFinite(ITup3RD t)
	{
		return Double.isFinite(t.v0()) && Double.isFinite(t.v1()) && Double.isFinite(t.v2());
	}

	public static boolean isFinite(ITupRD t)
	{
		return Double.isFinite(t.getAt(0)) && Double.isFinite(t.getAt(1)) && Double.isFinite(t.getAt(2));
	}

	public static boolean isFinite(double[] t)
	{
		return Double.isFinite(t[0]) && Double.isFinite(t[1]) && Double.isFinite(t[2]);
	}

	public static boolean isFinite(double tv0, double tv1, double tv2)
	{
		return Double.isFinite(tv0) && Double.isFinite(tv1) && Double.isFinite(tv2);
	}

	public static boolean isFiniteAt(int index, ITup3RD t)
	{
		switch (index) {
		case 0:
			return Double.isFinite(t.v0());
		case 1:
			return Double.isFinite(t.v1());
		case 2:
			return Double.isFinite(t.v2());
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAt(int index, ITupRD t)
	{
		switch (index) {
		case 0:
			return Double.isFinite(t.getAt(0));
		case 1:
			return Double.isFinite(t.getAt(1));
		case 2:
			return Double.isFinite(t.getAt(2));
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAt(int index, double[] t)
	{
		switch (index) {
		case 0:
			return Double.isFinite(t[0]);
		case 1:
			return Double.isFinite(t[1]);
		case 2:
			return Double.isFinite(t[2]);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAt(int index, double tv0, double tv1, double tv2)
	{
		switch (index) {
		case 0:
			return Double.isFinite(tv0);
		case 1:
			return Double.isFinite(tv1);
		case 2:
			return Double.isFinite(tv2);
		default:
			throw new IndexOutOfBoundsException();
		}
	}

	public static boolean isFiniteAtV0(ITup3RD t)
	{
		return Double.isFinite(t.v0());
	}

	public static boolean isFiniteAtV0(ITupRD t)
	{
		return Double.isFinite(t.getAt(0));
	}

	public static boolean isFiniteAtV0(double[] t)
	{
		return Double.isFinite(t[0]);
	}

	public static boolean isFiniteAtV1(ITup3RD t)
	{
		return Double.isFinite(t.v1());
	}

	public static boolean isFiniteAtV1(ITupRD t)
	{
		return Double.isFinite(t.getAt(1));
	}

	public static boolean isFiniteAtV1(double[] t)
	{
		return Double.isFinite(t[1]);
	}

	public static boolean isFiniteAtV2(ITup3RD t)
	{
		return Double.isFinite(t.v2());
	}

	public static boolean isFiniteAtV2(ITupRD t)
	{
		return Double.isFinite(t.getAt(2));
	}

	public static boolean isFiniteAtV2(double[] t)
	{
		return Double.isFinite(t[2]);
	}

	public static boolean isZero(ITup3RD t)
	{
		return MathUtils.isZero(t.v0()) && MathUtils.isZero(t.v1()) && MathUtils.isZero(t.v2());
	}

	public static boolean isZero(ITupRD t)
	{
		return MathUtils.isZero(t.getAt(0)) && MathUtils.isZero(t.getAt(1)) && MathUtils.isZero(t.getAt(2));
	}

	public static boolean isZero(double[] t)
	{
		return MathUtils.isZero(t[0]) && MathUtils.isZero(t[1]) && MathUtils.isZero(t[2]);
	}

	public static boolean isZero(double tv0, double tv1, double tv2)
	{
		return MathUtils.isZero(tv0) && MathUtils.isZero(tv1) && MathUtils.isZero(tv2);
	}

	public static boolean isZero(double tolerance, ITup3RD t)
	{
		return MathUtils.isZero(tolerance, t.v0()) && MathUtils.isZero(tolerance, t.v1());
	}

	public static boolean isZero(double tolerance, ITupRD t)
	{
		return MathUtils.isZero(tolerance, t.getAt(0)) && MathUtils.isZero(tolerance, t.getAt(1)) && MathUtils.isZero(tolerance, t.getAt(2));
	}

	public static boolean isZero(double tolerance, double[] t)
	{
		return MathUtils.isZero(tolerance, t[0]) && MathUtils.isZero(tolerance, t[1]) && MathUtils.isZero(tolerance, t[2]);
	}

	public static boolean isZero(double tolerance, double tv0, double tv1, double tv2)
	{
		return MathUtils.isZero(tolerance, tv0) && MathUtils.isZero(tolerance, tv1) && MathUtils.isZero(tolerance, tv2);
	}

	public static boolean isZeroAt(int index, ITup3RD t)
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

	public static boolean isZeroAt(int index, ITupRD t)
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

	public static boolean isZeroAt(int index, double[] t)
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

	public static boolean isZeroAt(int index, double tv0, double tv1, double tv2)
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

	public static boolean isZeroAt(double tolerance, int index, ITup3RD t)
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

	public static boolean isZeroAt(double tolerance, int index, ITupRD t)
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

	public static boolean isZeroAt(double tolerance, int index, double[] t)
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

	public static boolean isZeroAt(double tolerance, int index, double tv0, double tv1, double tv2)
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

	public static boolean isZeroAtV0(ITup3RD t)
	{
		return MathUtils.isZero(t.v0());
	}

	public static boolean isZeroAtV0(ITupRD t)
	{
		return MathUtils.isZero(t.getAt(0));
	}

	public static boolean isZeroAtV0(double[] t)
	{
		return MathUtils.isZero(t[0]);
	}

	public static boolean isZeroAtV1(ITup3RD t)
	{
		return MathUtils.isZero(t.v1());
	}

	public static boolean isZeroAtV1(ITupRD t)
	{
		return MathUtils.isZero(t.getAt(1));
	}

	public static boolean isZeroAtV1(double[] t)
	{
		return MathUtils.isZero(t[1]);
	}

	public static boolean isZeroAtV2(ITup3RD t)
	{
		return MathUtils.isZero(t.v2());
	}

	public static boolean isZeroAtV2(ITupRD t)
	{
		return MathUtils.isZero(t.getAt(2));
	}

	public static boolean isZeroAtV2(double[] t)
	{
		return MathUtils.isZero(t[2]);
	}

	public static boolean isZeroAtV0(double tolerance, ITup3RD t)
	{
		return MathUtils.isZero(tolerance, t.v0());
	}

	public static boolean isZeroAtV0(double tolerance, ITupRD t)
	{
		return MathUtils.isZero(tolerance, t.getAt(0));
	}

	public static boolean isZeroAtV0(double tolerance, double[] t)
	{
		return MathUtils.isZero(tolerance, t[0]);
	}

	public static boolean isZeroAtV1(double tolerance, ITup3RD t)
	{
		return MathUtils.isZero(tolerance, t.v1());
	}

	public static boolean isZeroAtV1(double tolerance, ITupRD t)
	{
		return MathUtils.isZero(tolerance, t.getAt(1));
	}

	public static boolean isZeroAtV1(double tolerance, double[] t)
	{
		return MathUtils.isZero(tolerance, t[1]);
	}

	public static boolean isZeroAtV2(double tolerance, ITup3RD t)
	{
		return MathUtils.isZero(tolerance, t.v2());
	}

	public static boolean isZeroAtV2(double tolerance, ITupRD t)
	{
		return MathUtils.isZero(tolerance, t.getAt(2));
	}

	public static boolean isZeroAtV2(double tolerance, double[] t)
	{
		return MathUtils.isZero(tolerance, t[2]);
	}
}
