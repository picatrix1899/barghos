package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

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

	public static boolean equals(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		if (t1.v0() != t2V0) return false;
		if (t1.v1() != t2V1) return false;
		if (t1.v2() != t2V2) return false;

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

	public static boolean equals(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (t1.getAt(0) != t2V0) return false;
		if (t1.getAt(1) != t2V1) return false;
		if (t1.getAt(2) != t2V2) return false;

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

	public static boolean equals(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		if (t1V0 != t2.v0()) return false;
		if (t1V1 != t2.v1()) return false;
		if (t1V2 != t2.v2()) return false;

		return true;
	}

	public static boolean equals(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (t1V0 != t2.getAt(0)) return false;
		if (t1V1 != t2.getAt(1)) return false;
		if (t1V2 != t2.getAt(2)) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2.v1())) return false;
		if (!MathUtils.equalsEM4(t1.v2(), t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1.v2(), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2[1])) return false;
		if (!MathUtils.equalsEM4(t1.v2(), t2[2])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2V0)) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2V1)) return false;
		if (!MathUtils.equalsEM4(t1.v2(), t2V2)) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2[2])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2V0)) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2V1)) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2V2)) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equalsEM4(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1[1], t2.v1())) return false;
		if (!MathUtils.equalsEM4(t1[2], t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM4(t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1[2], t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM4(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM4(t1V0, t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1V1, t2.v1())) return false;
		if (!MathUtils.equalsEM4(t1V2, t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM4(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM4(t1V0, t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1V1, t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1V2, t2.getAt(2))) return false;

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2[1])) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2[2])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2V0)) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2V1)) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2V2)) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2[2])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2V0)) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2V1)) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2V2)) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1[2], t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1[2], t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM6(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1V0, t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1V1, t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1V2, t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM6(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1V0, t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1V1, t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1V2, t2.getAt(2))) return false;

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2[1])) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2[2])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2V0)) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2V1)) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2V2)) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2[2])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2V0)) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2V1)) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2V2)) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1[2], t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1[2], t2.getAt(2))) return false;

		return true;
	}

	public static boolean equalsEM8(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1V0, t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1V1, t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1V2, t2.v2())) return false;

		return true;
	}

	public static boolean equalsEM8(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equalsEM6(t1V0, t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1V1, t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1V2, t2.getAt(2))) return false;

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
		if (!MathUtils.equals(tolerance, t1.v2(), t2.v2())) return false;

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

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		if (!MathUtils.equals(tolerance, t1.v0(), t2V0)) return false;
		if (!MathUtils.equals(tolerance, t1.v1(), t2V1)) return false;
		if (!MathUtils.equals(tolerance, t1.v2(), t2V2)) return false;

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

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1.getAt(0), t2V0)) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(1), t2V1)) return false;
		if (!MathUtils.equals(tolerance, t1.getAt(2), t2V2)) return false;

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

	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equals(tolerance, t1V0, t2.v0())) return false;
		if (!MathUtils.equals(tolerance, t1V1, t2.v1())) return false;
		if (!MathUtils.equals(tolerance, t1V2, t2.v2())) return false;

		return true;
	}

	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		if (!MathUtils.equals(tolerance, t1V0, t2.getAt(0))) return false;
		if (!MathUtils.equals(tolerance, t1V1, t2.getAt(1))) return false;
		if (!MathUtils.equals(tolerance, t1V2, t2.getAt(2))) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2.v0();
			case 1 -> t1.v1() == t2.v1();
			case 2 -> t1.v2() == t2.v2();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2.getAt(0);
			case 1 -> t1.v1() == t2.getAt(1);
			case 2 -> t1.v2() == t2.getAt(2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2[0];
			case 1 -> t1.v1() == t2[1];
			case 2 -> t1.v2() == t2[2];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == value;
			case 1 -> t1.v1() == value;
			case 2 -> t1.v2() == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2V0;
			case 1 -> t1.v1() == t2V1;
			case 2 -> t1.v2() == t2V2;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2.v0();
			case 1 -> t1.getAt(1) == t2.v1();
			case 2 -> t1.getAt(2) == t2.v2();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2.getAt(0);
			case 1 -> t1.getAt(1) == t2.getAt(1);
			case 2 -> t1.getAt(2) == t2.getAt(2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2[0];
			case 1 -> t1.getAt(1) == t2[1];
			case 2 -> t1.getAt(2) == t2[2];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == value;
			case 1 -> t1.getAt(1) == value;
			case 2 -> t1.getAt(2) == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2V0;
			case 1 -> t1.getAt(1) == t2V1;
			case 2 -> t1.getAt(2) == t2V2;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> t1[0] == t2.v0();
			case 1 -> t1[1] == t2.v1();
			case 2 -> t1[2] == t2.v2();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> t1[0] == t2.getAt(0);
			case 1 -> t1[1] == t2.getAt(1);
			case 2 -> t1[2] == t2.getAt(2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> t1V0 == t2.v0();
			case 1 -> t1V1 == t2.v1();
			case 2 -> t1V2 == t2.v2();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> t1V0 == t2.getAt(0);
			case 1 -> t1V1 == t2.getAt(1);
			case 2 -> t1V2 == t2.getAt(2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2.v1());
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2[1]);
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), value);
			case 1 -> MathUtils.equalsEM4(t1.v1(), value);
			case 2 -> MathUtils.equalsEM4(t1.v2(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2V0);
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2V1);
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), value);
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), value);
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2V0);
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2V1);
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM4(t1[1], t2.v1());
			case 2 -> MathUtils.equalsEM4(t1[2], t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1[2], t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2.v0());
			case 1 -> MathUtils.equalsEM4(t1V1, t2.v1());
			case 2 -> MathUtils.equalsEM4(t1V2, t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1V1, t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1V2, t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2.v1());
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2[1]);
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), value);
			case 1 -> MathUtils.equalsEM6(t1.v1(), value);
			case 2 -> MathUtils.equalsEM6(t1.v2(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2V0);
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2V1);
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), value);
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), value);
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2V0);
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2V1);
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM6(t1[1], t2.v1());
			case 2 -> MathUtils.equalsEM6(t1[2], t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1[2], t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2.v0());
			case 1 -> MathUtils.equalsEM6(t1V1, t2.v1());
			case 2 -> MathUtils.equalsEM6(t1V2, t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1V1, t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1V2, t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2.v1());
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2[1]);
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), value);
			case 1 -> MathUtils.equalsEM8(t1.v1(), value);
			case 2 -> MathUtils.equalsEM8(t1.v2(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2V0);
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2V1);
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), value);
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), value);
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2V0);
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2V1);
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM8(t1[1], t2.v1());
			case 2 -> MathUtils.equalsEM8(t1[2], t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1[2], t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2.v0());
			case 1 -> MathUtils.equalsEM8(t1V1, t2.v1());
			case 2 -> MathUtils.equalsEM8(t1V2, t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1V1, t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1V2, t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.v0(), t2.v0());
			case 1 -> MathUtils.equals(tolerance, t1.v1(), t2.v1());
			case 2 -> MathUtils.equals(tolerance, t1.v2(), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equals(tolerance, t1.v2(), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.v0(), t2[0]);
			case 1 -> MathUtils.equals(tolerance, t1.v1(), t2[1]);
			case 2 -> MathUtils.equals(tolerance, t1.v2(), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.v0(), value);
			case 1 -> MathUtils.equals(tolerance, t1.v1(), value);
			case 2 -> MathUtils.equals(tolerance, t1.v2(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.v0(), t2V0);
			case 1 -> MathUtils.equals(tolerance, t1.v1(), t2V1);
			case 2 -> MathUtils.equals(tolerance, t1.v2(), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equals(tolerance, t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equals(tolerance, t1.getAt(2), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equals(tolerance, t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equals(tolerance, t1.getAt(2), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equals(tolerance, t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equals(tolerance, t1.getAt(2), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.getAt(0), value);
			case 1 -> MathUtils.equals(tolerance, t1.getAt(1), value);
			case 2 -> MathUtils.equals(tolerance, t1.getAt(2), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1.getAt(0), t2V0);
			case 1 -> MathUtils.equals(tolerance, t1.getAt(1), t2V1);
			case 2 -> MathUtils.equals(tolerance, t1.getAt(2), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1[0], t2.v0());
			case 1 -> MathUtils.equals(tolerance, t1[1], t2.v1());
			case 2 -> MathUtils.equals(tolerance, t1[2], t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1[0], t2.getAt(0));
			case 1 -> MathUtils.equals(tolerance, t1[1], t2.getAt(1));
			case 2 -> MathUtils.equals(tolerance, t1[2], t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1V0, t2.v0());
			case 1 -> MathUtils.equals(tolerance, t1V1, t2.v1());
			case 2 -> MathUtils.equals(tolerance, t1V2, t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(float tolerance, int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals(tolerance, t1V0, t2.getAt(0));
			case 1 -> MathUtils.equals(tolerance, t1V1, t2.getAt(1));
			case 2 -> MathUtils.equals(tolerance, t1V2, t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
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

	public static boolean equalsAtV1(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return t1.v1() == value;
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

	public static boolean equalsAtV2(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return t1.v2() == value;
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

	public static boolean equalsAtV0EM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), value);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(0), value);
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM4(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), value);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(1), value);
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM4(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV2EM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM4(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2EM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2EM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2EM4(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.v2(), value);
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM4(t1.getAt(2), value);
	}

	public static boolean equalsAtV2EM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM4(t1[2], t2.v2());
	}

	public static boolean equalsAtV2EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM4(t1[2], t2.getAt(2));
	}
	
	public static boolean equalsAtV0EM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), value);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(0), value);
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM6(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), value);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(1), value);
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM6(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV2EM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM6(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2EM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2EM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2EM6(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.v2(), value);
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM6(t1.getAt(2), value);
	}

	public static boolean equalsAtV2EM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM6(t1[2], t2.v2());
	}

	public static boolean equalsAtV2EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM6(t1[2], t2.getAt(2));
	}
	
	public static boolean equalsAtV0EM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), value);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(0), value);
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM8(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), value);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(1), value);
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM8(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV2EM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equalsEM8(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2EM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2EM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2EM8(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.v2(), value);
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equalsEM8(t1.getAt(2), value);
	}

	public static boolean equalsAtV2EM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equalsEM8(t1[2], t2.v2());
	}

	public static boolean equalsAtV2EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equalsEM8(t1[2], t2.getAt(2));
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

	public static boolean equalsAtV0(float tolerance, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.v0(), value);
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
	
	public static boolean isFinite(ITup3RF t)
	{
		return Float.isFinite(t.v0()) && Float.isFinite(t.v1()) && Float.isFinite(t.v2());
	}

	public static boolean isFinite(ITupRF t)
	{
		return Float.isFinite(t.getAt(0)) && Float.isFinite(t.getAt(1)) && Float.isFinite(t.getAt(2));
	}

	public static boolean isFiniteAt(int index, ITup3RF t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t.v0());
			case 1 -> Float.isFinite(t.v1());
			case 2 -> Float.isFinite(t.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isFiniteAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t.getAt(0));
			case 1 -> Float.isFinite(t.getAt(1));
			case 2 -> Float.isFinite(t.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isFiniteAtV0(ITup3RF t)
	{
		return Float.isFinite(t.v0());
	}

	public static boolean isFiniteAtV0(ITupRF t)
	{
		return Float.isFinite(t.getAt(0));
	}

	public static boolean isFiniteAtV1(ITup3RF t)
	{
		return Float.isFinite(t.v1());
	}

	public static boolean isFiniteAtV1(ITupRF t)
	{
		return Float.isFinite(t.getAt(1));
	}

	public static boolean isFiniteAtV2(ITup3RF t)
	{
		return Float.isFinite(t.v2());
	}

	public static boolean isFiniteAtV2(ITupRF t)
	{
		return Float.isFinite(t.getAt(2));
	}

	public static boolean isZero(ITup3RF t)
	{
		return t.v0() == 0.0f && t.v1() == 0.0f && t.v2() == 0.0f;
	}

	public static boolean isZero(ITupRF t)
	{
		return t.getAt(0) == 0.0f && t.getAt(1) == 0.0f && t.getAt(2) == 0.0f;
	}

	public static boolean isZeroEM4(ITup3RF t)
	{
		return MathUtils.isZeroEM4(t.v0()) && MathUtils.isZeroEM4(t.v1()) && MathUtils.isZeroEM4(t.v2());
	}

	public static boolean isZeroEM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(0)) && MathUtils.isZeroEM4(t.getAt(1)) && MathUtils.isZeroEM4(t.getAt(2));
	}
	
	public static boolean isZeroEM6(ITup3RF t)
	{
		return MathUtils.isZeroEM6(t.v0()) && MathUtils.isZeroEM6(t.v1()) && MathUtils.isZeroEM6(t.v2());
	}

	public static boolean isZeroEM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(0)) && MathUtils.isZeroEM6(t.getAt(1)) && MathUtils.isZeroEM6(t.getAt(2));
	}
	
	public static boolean isZeroEM8(ITup3RF t)
	{
		return MathUtils.isZeroEM8(t.v0()) && MathUtils.isZeroEM8(t.v1()) && MathUtils.isZeroEM8(t.v2());
	}

	public static boolean isZeroEM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(0)) && MathUtils.isZeroEM8(t.getAt(1)) && MathUtils.isZeroEM8(t.getAt(2));
	}
	
	public static boolean isZero(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v0()) && MathUtils.isZero(tolerance, t.v1()) && MathUtils.isZero(tolerance, t.v2());
	}

	public static boolean isZero(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(0)) && MathUtils.isZero(tolerance, t.getAt(1)) && MathUtils.isZero(tolerance, t.getAt(2));
	}

	public static boolean isZeroAt(int index, ITup3RF t)
	{
		return switch(index) {
			case 0 -> t.v0() == 0.0f;
			case 1 -> t.v1() == 0.0f;
			case 2 -> t.v2() == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> t.getAt(0) == 0.0f;
			case 1 -> t.getAt(1) == 0.0f;
			case 2 -> t.getAt(2) == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(float tolerance, int index, ITup3RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZero(tolerance, t.v0());
			case 1 -> MathUtils.isZero(tolerance, t.v1());
			case 2 -> MathUtils.isZero(tolerance, t.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(float tolerance, int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZero(tolerance, t.getAt(0));
			case 1 -> MathUtils.isZero(tolerance, t.getAt(1));
			case 2 -> MathUtils.isZero(tolerance, t.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtV0(ITup3RF t)
	{
		return t.v0() == 0.0f;
	}

	public static boolean isZeroAtV0(ITupRF t)
	{
		return t.getAt(0) == 0.0f;
	}

	public static boolean isZeroAtV1(ITup3RF t)
	{
		return t.v1() == 0.0f;
	}

	public static boolean isZeroAtV1(ITupRF t)
	{
		return t.getAt(1) == 0.0f;
	}

	public static boolean isZeroAtV2(ITup3RF t)
	{
		return t.v2() == 0.0f;
	}

	public static boolean isZeroAtV2(ITupRF t)
	{
		return t.getAt(2) == 0.0f;
	}

	public static boolean isZeroAtV0EM4(ITup3RF t)
	{
		return MathUtils.isZeroEM4(t.v0());
	}

	public static boolean isZeroAtV0EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(0));
	}

	public static boolean isZeroAtV1EM4(ITup3RF t)
	{
		return MathUtils.isZeroEM4(t.v1());
	}

	public static boolean isZeroAtV1EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(1));
	}

	public static boolean isZeroAtV2EM4(ITup3RF t)
	{
		return MathUtils.isZeroEM4(t.v2());
	}

	public static boolean isZeroAtV2EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(2));
	}
	
	public static boolean isZeroAtV0EM6(ITup3RF t)
	{
		return MathUtils.isZeroEM6(t.v0());
	}

	public static boolean isZeroAtV0EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(0));
	}

	public static boolean isZeroAtV1EM6(ITup3RF t)
	{
		return MathUtils.isZeroEM6(t.v1());
	}

	public static boolean isZeroAtV1EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(1));
	}

	public static boolean isZeroAtV2EM6(ITup3RF t)
	{
		return MathUtils.isZeroEM6(t.v2());
	}

	public static boolean isZeroAtV2EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(2));
	}
	
	public static boolean isZeroAtV0EM8(ITup3RF t)
	{
		return MathUtils.isZeroEM8(t.v0());
	}

	public static boolean isZeroAtV0EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(0));
	}

	public static boolean isZeroAtV1EM8(ITup3RF t)
	{
		return MathUtils.isZeroEM8(t.v1());
	}

	public static boolean isZeroAtV1EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(1));
	}

	public static boolean isZeroAtV2EM8(ITup3RF t)
	{
		return MathUtils.isZeroEM8(t.v2());
	}

	public static boolean isZeroAtV2EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(2));
	}
	
	public static boolean isZeroAtV0(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v0());
	}

	public static boolean isZeroAtV0(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(0));
	}

	public static boolean isZeroAtV1(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v1());
	}

	public static boolean isZeroAtV1(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(1));
	}

	public static boolean isZeroAtV2(float tolerance, ITup3RF t)
	{
		return MathUtils.isZero(tolerance, t.v2());
	}

	public static boolean isZeroAtV2(float tolerance, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(2));
	}
}
