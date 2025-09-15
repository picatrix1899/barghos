package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class RawTupUtils3F
{
	
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

	public static boolean equals(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (t1[0] != t2V0) return false;
		if (t1[1] != t2V1) return false;
		if (t1[2] != t2V2) return false;

		return true;
	}

	public static boolean equals(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (t1V0 != t2[0]) return false;
		if (t1V1 != t2[1]) return false;
		if (t1V2 != t2[2]) return false;

		return true;
	}

	public static boolean equals(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (t1V0 != t2V0) return false;
		if (t1V1 != t2V1) return false;
		if (t1V2 != t2V2) return false;

		return true;
	}
	
	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM4(t1[0], t2[0])) return false;
		if (!MathUtils.equalsEM4(t1[1], t2[1])) return false;
		if (!MathUtils.equalsEM4(t1[2], t2[2])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equalsEM4(t1[0], t2V0)) return false;
		if (!MathUtils.equalsEM4(t1[1], t2V1)) return false;
		if (!MathUtils.equalsEM4(t1[2], t2V2)) return false;

		return true;
	}
	
	public static boolean equalsEM4(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM4(t1V0, t2[0])) return false;
		if (!MathUtils.equalsEM4(t1V1, t2[1])) return false;
		if (!MathUtils.equalsEM4(t1V2, t2[2])) return false;

		return true;
	}

	public static boolean equalsEM4(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equalsEM4(t1V0, t2V0)) return false;
		if (!MathUtils.equalsEM4(t1V1, t2V1)) return false;
		if (!MathUtils.equalsEM4(t1V2, t2V2)) return false;

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM6(t1[0], t2[0])) return false;
		if (!MathUtils.equalsEM6(t1[1], t2[1])) return false;
		if (!MathUtils.equalsEM6(t1[2], t2[2])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equalsEM6(t1[0], t2V0)) return false;
		if (!MathUtils.equalsEM6(t1[1], t2V1)) return false;
		if (!MathUtils.equalsEM6(t1[2], t2V2)) return false;

		return true;
	}
	
	public static boolean equalsEM6(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM6(t1V0, t2[0])) return false;
		if (!MathUtils.equalsEM6(t1V1, t2[1])) return false;
		if (!MathUtils.equalsEM6(t1V2, t2[2])) return false;

		return true;
	}

	public static boolean equalsEM6(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equalsEM6(t1V0, t2V0)) return false;
		if (!MathUtils.equalsEM6(t1V1, t2V1)) return false;
		if (!MathUtils.equalsEM6(t1V2, t2V2)) return false;

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM8(t1[0], t2[0])) return false;
		if (!MathUtils.equalsEM8(t1[1], t2[1])) return false;
		if (!MathUtils.equalsEM8(t1[2], t2[2])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equalsEM8(t1[0], t2V0)) return false;
		if (!MathUtils.equalsEM8(t1[1], t2V1)) return false;
		if (!MathUtils.equalsEM8(t1[2], t2V2)) return false;

		return true;
	}

	public static boolean equalsEM8(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM8(t1V0, t2[0])) return false;
		if (!MathUtils.equalsEM8(t1V1, t2[1])) return false;
		if (!MathUtils.equalsEM8(t1V2, t2[2])) return false;

		return true;
	}

	public static boolean equalsEM8(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equalsEM8(t1V0, t2V0)) return false;
		if (!MathUtils.equalsEM8(t1V1, t2V1)) return false;
		if (!MathUtils.equalsEM8(t1V2, t2V2)) return false;

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

	public static boolean equals(float tolerance, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1[0], t2V0)) return false;
		if (!MathUtils.equals(tolerance, t1[1], t2V1)) return false;
		if (!MathUtils.equals(tolerance, t1[2], t2V2)) return false;

		return true;
	}
	
	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equals(tolerance, t1V0, t2[0])) return false;
		if (!MathUtils.equals(tolerance, t1V1, t2[1])) return false;
		if (!MathUtils.equals(tolerance, t1V2, t2[2])) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equals(tolerance, t1V0, t2V0)) return false;
		if (!MathUtils.equals(tolerance, t1V1, t2V1)) return false;
		if (!MathUtils.equals(tolerance, t1V2, t2V2)) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> t1[0] == t2[0];
			case 1 -> t1[1] == t2[1];
			case 2 -> t1[2] == t2[2];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> t1[0] == value;
			case 1 -> t1[1] == value;
			case 2 -> t1[2] == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> t1[0] == t2V0;
			case 1 -> t1[1] == t2V1;
			case 2 -> t1[2] == t2V2;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> t1V0 == t2[0];
			case 1 -> t1V1 == t2[1];
			case 2 -> t1V2 == t2[2];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> t1V0 == value;
			case 1 -> t1V1 == value;
			case 2 -> t1V2 == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> t1V0 == t2V0;
			case 1 -> t1V1 == t2V1;
			case 2 -> t1V2 == t2V2;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM4(t1[1], t2[1]);
			case 2 -> MathUtils.equalsEM4(t1[2], t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], value);
			case 1 -> MathUtils.equalsEM4(t1[1], value);
			case 2 -> MathUtils.equalsEM4(t1[2], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM4(t1[1], t2V1);
			case 2 -> MathUtils.equalsEM4(t1[2], t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM4(t1V1, t2[1]);
			case 2 -> MathUtils.equalsEM4(t1V2, t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, value);
			case 1 -> MathUtils.equalsEM4(t1V1, value);
			case 2 -> MathUtils.equalsEM4(t1V2, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM4(t1V1, t2V1);
			case 2 -> MathUtils.equalsEM4(t1V2, t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM6(t1[1], t2[1]);
			case 2 -> MathUtils.equalsEM6(t1[2], t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], value);
			case 1 -> MathUtils.equalsEM6(t1[1], value);
			case 2 -> MathUtils.equalsEM6(t1[2], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM6(t1[1], t2V1);
			case 2 -> MathUtils.equalsEM6(t1[2], t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM6(t1V1, t2[1]);
			case 2 -> MathUtils.equalsEM6(t1V2, t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, value);
			case 1 -> MathUtils.equalsEM6(t1V1, value);
			case 2 -> MathUtils.equalsEM6(t1V2, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM6(t1V1, t2V1);
			case 2 -> MathUtils.equalsEM6(t1V2, t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM8(t1[1], t2[1]);
			case 2 -> MathUtils.equalsEM8(t1[2], t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], value);
			case 1 -> MathUtils.equalsEM8(t1[1], value);
			case 2 -> MathUtils.equalsEM8(t1[2], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM8(t1[1], t2V1);
			case 2 -> MathUtils.equalsEM8(t1[2], t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM8(t1V1, t2[1]);
			case 2 -> MathUtils.equalsEM8(t1V2, t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, value);
			case 1 -> MathUtils.equalsEM8(t1V1, value);
			case 2 -> MathUtils.equalsEM8(t1V2, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM8(t1V1, t2V1);
			case 2 -> MathUtils.equalsEM8(t1V2, t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1[0], t2[0]);
			case 1 -> MathUtils.equals(tolerance, t1[1], t2[1]);
			case 2 -> MathUtils.equals(tolerance, t1[2], t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1[0], value);
			case 1 -> MathUtils.equals(tolerance, t1[1], value);
			case 2 -> MathUtils.equals(tolerance, t1[2], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1[0], t2V0);
			case 1 -> MathUtils.equals(tolerance, t1[1], t2V1);
			case 2 -> MathUtils.equals(tolerance, t1[2], t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(float tolerance, int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1V0, t2[0]);
			case 1 -> MathUtils.equals(tolerance, t1V1, t2[1]);
			case 2 -> MathUtils.equals(tolerance, t1V2, t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1V0, value);
			case 1 -> MathUtils.equals(tolerance, t1V1, value);
			case 2 -> MathUtils.equals(tolerance, t1V2, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1V0, t2V0);
			case 1 -> MathUtils.equals(tolerance, t1V1, t2V1);
			case 2 -> MathUtils.equals(tolerance, t1V2, t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
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
	
	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1[0], t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM4(t1[0], value);
	}
	
	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1[1], t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM4(t1[1], value);
	}
	
	public static boolean equalsAtV2EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1[2], t2[2]);
	}

	public static boolean equalsAtV2EM4(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM4(t1[2], value);
	}
	
	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1[0], t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM6(t1[0], value);
	}
	
	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1[1], t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM6(t1[1], value);
	}
	
	public static boolean equalsAtV2EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1[2], t2[2]);
	}

	public static boolean equalsAtV2EM6(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM6(t1[2], value);
	}
	
	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1[0], t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM8(t1[0], value);
	}
	
	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1[1], t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM8(t1[1], value);
	}
	
	public static boolean equalsAtV2EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1[2], t2[2]);
	}

	public static boolean equalsAtV2EM8(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM8(t1[2], value);
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
	
	public static boolean isFinite(float[] t)
	{
		return Float.isFinite(t[0]) && Float.isFinite(t[1]) && Float.isFinite(t[2]);
	}

	public static boolean isFinite(float tV0, float tV1, float tV2)
	{
		return Float.isFinite(tV0) && Float.isFinite(tV1) && Float.isFinite(tV2);
	}
	
	public static boolean isFiniteAt(int index, float[] t)
	{
		return switch (index) {
		case 0 -> Float.isFinite(t[0]);
		case 1 -> Float.isFinite(t[1]);
		case 2 -> Float.isFinite(t[2]);
		default -> throw new IndexOutOfBoundsException();
	};
	}

	public static boolean isFiniteAt(int index, float tV0, float tV1, float tV2)
	{
		return switch (index) {
			case 0 -> Float.isFinite(tV0);
			case 1 -> Float.isFinite(tV1);
			case 2 -> Float.isFinite(tV2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFiniteAtV0(float[] t)
	{
		return Float.isFinite(t[0]);
	}
	
	public static boolean isFiniteAtV1(float[] t)
	{
		return Float.isFinite(t[1]);
	}
	
	public static boolean isFiniteAtV2(float[] t)
	{
		return Float.isFinite(t[2]);
	}
	
	public static boolean isZero(float[] t)
	{
		return t[0] == 0.0f && t[1] == 0.0f && t[2] == 0.0f;
	}

	public static boolean isZero(float tV0, float tV1, float tV2)
	{
		return tV0 == 0.0f && tV1 == 0.0f && tV1 == 0.0f;
	}
	
	public static boolean isZeroEM4(float[] t)
	{
		return MathUtils.isZeroEM4(t[0]) && MathUtils.isZeroEM4(t[1]) && MathUtils.isZeroEM4(t[2]);
	}

	public static boolean isZeroEM4(float tV0, float tV1, float tV2)
	{
		return MathUtils.isZeroEM4(tV0) && MathUtils.isZeroEM4(tV1) && MathUtils.isZeroEM4(tV2);
	}
	
	public static boolean isZeroEM6(float[] t)
	{
		return MathUtils.isZeroEM6(t[0]) && MathUtils.isZeroEM6(t[1]) && MathUtils.isZeroEM6(t[2]);
	}

	public static boolean isZeroEM6(float tV0, float tV1, float tV2)
	{
		return MathUtils.isZeroEM6(tV0) && MathUtils.isZeroEM6(tV1) && MathUtils.isZeroEM6(tV2);
	}
	
	public static boolean isZeroEM8(float[] t)
	{
		return MathUtils.isZeroEM8(t[0]) && MathUtils.isZeroEM8(t[1]) && MathUtils.isZeroEM8(t[2]);
	}

	public static boolean isZeroEM8(float tV0, float tV1, float tV2)
	{
		return MathUtils.isZeroEM8(tV0) && MathUtils.isZeroEM8(tV1) && MathUtils.isZeroEM8(tV2);
	}
	
	public static boolean isZero(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[0]) && MathUtils.isZero(tolerance, t[1]) && MathUtils.isZero(tolerance, t[2]);
	}

	public static boolean isZero(float tolerance, float tV0, float tV1, float tV2)
	{
		return MathUtils.isZero(tolerance, tV0) && MathUtils.isZero(tolerance, tV1) && MathUtils.isZero(tolerance, tV2);
	}
	
	public static boolean isZeroAt(int index, float[] t)
	{
		return switch (index) {
			case 0 -> t[0] == 0.0f;
			case 1 -> t[1] == 0.0f;
			case 2 -> t[2] == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(int index, float tV0, float tV1, float tV2)
	{
		return switch (index) {
			case 0 -> tV0 == 0.0f;
			case 1 -> tV1 == 0.0f;
			case 2 -> tV2 == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM4(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(t[0]);
			case 1 -> MathUtils.isZeroEM4(t[1]);
			case 2 -> MathUtils.isZeroEM4(t[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM4(int index, float tV0, float tV1, float tV2)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(tV0);
			case 1 -> MathUtils.isZeroEM4(tV1);
			case 2 -> MathUtils.isZeroEM4(tV2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM6(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(t[0]);
			case 1 -> MathUtils.isZeroEM6(t[1]);
			case 2 -> MathUtils.isZeroEM6(t[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM6(int index, float tV0, float tV1, float tV2)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(tV0);
			case 1 -> MathUtils.isZeroEM6(tV1);
			case 2 -> MathUtils.isZeroEM6(tV2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM8(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(t[0]);
			case 1 -> MathUtils.isZeroEM8(t[1]);
			case 2 -> MathUtils.isZeroEM8(t[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM8(int index, float tV0, float tV1, float tV2)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(tV0);
			case 1 -> MathUtils.isZeroEM8(tV1);
			case 2 -> MathUtils.isZeroEM8(tV2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAt(float tolerance, int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZero(tolerance, t[0]);
			case 1 -> MathUtils.isZero(tolerance, t[1]);
			case 2 -> MathUtils.isZero(tolerance, t[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(float tolerance, int index, float tV0, float tV1, float tV2)
	{
		return switch (index) {
			case 0 -> MathUtils.isZero(tolerance, tV0);
			case 1 -> MathUtils.isZero(tolerance, tV1);
			case 2 -> MathUtils.isZero(tolerance, tV2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtV0(float[] t)
	{
		return t[0] == 0.0f;
	}
	
	public static boolean isZeroAtV1(float[] t)
	{
		return t[1] == 0.0f;
	}
	
	public static boolean isZeroAtV2(float[] t)
	{
		return t[2] == 0.0f;
	}
	
	public static boolean isZeroAtV0EM4(float[] t)
	{
		return MathUtils.isZeroEM4(t[0]);
	}
	
	public static boolean isZeroAtV1EM4(float[] t)
	{
		return MathUtils.isZeroEM4(t[1]);
	}
	
	public static boolean isZeroAtV2EM4(float[] t)
	{
		return MathUtils.isZeroEM4(t[2]);
	}
	
	public static boolean isZeroAtV0EM6(float[] t)
	{
		return MathUtils.isZeroEM6(t[0]);
	}
	
	public static boolean isZeroAtV1EM6(float[] t)
	{
		return MathUtils.isZeroEM6(t[1]);
	}
	
	public static boolean isZeroAtV2EM6(float[] t)
	{
		return MathUtils.isZeroEM6(t[2]);
	}
	
	public static boolean isZeroAtV0EM8(float[] t)
	{
		return MathUtils.isZeroEM8(t[0]);
	}
	
	public static boolean isZeroAtV1EM8(float[] t)
	{
		return MathUtils.isZeroEM8(t[1]);
	}
	
	public static boolean isZeroAtV2EM8(float[] t)
	{
		return MathUtils.isZeroEM8(t[2]);
	}
	
	public static boolean isZeroAtV0(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[0]);
	}
	
	public static boolean isZeroAtV1(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[1]);
	}
	
	public static boolean isZeroAtV2(float tolerance, float[] t)
	{
		return MathUtils.isZero(tolerance, t[2]);
	}
}
