package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class TupUtils4F
{
	
	public static boolean equals(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		

		if (t1.v0() != t2.v0()) return false;
		if (t1.v1() != t2.v1()) return false;
		if (t1.v2() != t2.v2()) return false;
		if (t1.v3() != t2.v3()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.v0() != t2.getAt(0)) return false;
		if (t1.v1() != t2.getAt(1)) return false;
		if (t1.v2() != t2.getAt(2)) return false;
		if (t1.v3() != t2.getAt(3)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.v0() != t2[0]) return false;
		if (t1.v1() != t2[1]) return false;
		if (t1.v2() != t2[2]) return false;
		if (t1.v3() != t2[3]) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (t1.v0() != t2v0) return false;
		if (t1.v1() != t2v1) return false;
		if (t1.v2() != t2v1) return false;
		if (t1.v3() != t2v3) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.getAt(0) != t2.v0()) return false;
		if (t1.getAt(1) != t2.v1()) return false;
		if (t1.getAt(2) != t2.v2()) return false;
		if (t1.getAt(3) != t2.v3()) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.getAt(0) != t2.getAt(0)) return false;
		if (t1.getAt(1) != t2.getAt(1)) return false;
		if (t1.getAt(2) != t2.getAt(2)) return false;
		if (t1.getAt(3) != t2.getAt(3)) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1.getAt(0) != t2[0]) return false;
		if (t1.getAt(1) != t2[1]) return false;
		if (t1.getAt(2) != t2[2]) return false;
		if (t1.getAt(3) != t2[3]) return false;

		return true;
	}

	public static boolean equals(@AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (t1.getAt(0) != t2v0) return false;
		if (t1.getAt(1) != t2v1) return false;
		if (t1.getAt(2) != t2v2) return false;
		if (t1.getAt(3) != t2v3) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1[0] != t2.v0()) return false;
		if (t1[1] != t2.v1()) return false;
		if (t1[2] != t2.v2()) return false;
		if (t1[3] != t2.v3()) return false;

		return true;
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (t1[0] != t2.getAt(0)) return false;
		if (t1[1] != t2.getAt(1)) return false;
		if (t1[2] != t2.getAt(2)) return false;
		if (t1[3] != t2.getAt(3)) return false;

		return true;
	}
	
	public static boolean equals(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		if (t1v0 != t2.v0()) return false;
		if (t1v1 != t2.v1()) return false;
		if (t1v2 != t2.v2()) return false;
		if (t1v3 != t2.v3()) return false;

		return true;
	}

	public static boolean equals(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (t1v0 != t2.getAt(0)) return false;
		if (t1v1 != t2.getAt(1)) return false;
		if (t1v2 != t2.getAt(2)) return false;
		if (t1v3 != t2.getAt(3)) return false;

		return true;
	}
	
	public static boolean equalsEM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2.v1())) return false;
		if (!MathUtils.equalsEM(tolerance, t2.v2(), t2.v2())) return false;
		if (!MathUtils.equalsEM(tolerance, t2.v3(), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v2(), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v3(), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2[1])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v2(), t2[2])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v3(), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v1(), t2v1)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v2(), t2v2)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.v3(), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(2), t2.v2())) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(3), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(2), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(3), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(2), t2[2])) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(3), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1.getAt(0), t2v0)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(1), t2v1)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(2), t2v2)) return false;
		if (!MathUtils.equalsEM(tolerance, t1.getAt(3), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1[1], t2.v1())) return false;
		if (!MathUtils.equalsEM(tolerance, t1[2], t2.v2())) return false;
		if (!MathUtils.equalsEM(tolerance, t1[3], t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equalsEM(tolerance, t1[2], t2.getAt(2))) return false;
		if (!MathUtils.equalsEM(tolerance, t1[3], t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsEM(float tolerance, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM(tolerance, t1v1, t2.v1())) return false;
		if (!MathUtils.equalsEM(tolerance, t1v2, t2.v2())) return false;
		if (!MathUtils.equalsEM(tolerance, t1v3, t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM(tolerance, t1v0, t2.getAt(0))) return false;
		if (!MathUtils.equalsEM(tolerance, t1v1, t2.getAt(1))) return false;
		if (!MathUtils.equalsEM(tolerance, t1v2, t2.getAt(2))) return false;
		if (!MathUtils.equalsEM(tolerance, t1v3, t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsEM4(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2.v1())) return false;
		if (!MathUtils.equalsEM4(t2.v2(), t2.v2())) return false;
		if (!MathUtils.equalsEM4(t2.v3(), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1.v2(), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM4(t1.v3(), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2[1])) return false;
		if (!MathUtils.equalsEM4(t1.v2(), t2[2])) return false;
		if (!MathUtils.equalsEM4(t1.v3(), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM4(t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM4(t1.v1(), t2v1)) return false;
		if (!MathUtils.equalsEM4(t1.v2(), t2v2)) return false;
		if (!MathUtils.equalsEM4(t1.v3(), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2.v2())) return false;
		if (!MathUtils.equalsEM4(t1.getAt(3), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM4(t1.getAt(3), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2[2])) return false;
		if (!MathUtils.equalsEM4(t1.getAt(3), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM4(t1.getAt(0), t2v0)) return false;
		if (!MathUtils.equalsEM4(t1.getAt(1), t2v1)) return false;
		if (!MathUtils.equalsEM4(t1.getAt(2), t2v2)) return false;
		if (!MathUtils.equalsEM4(t1.getAt(3), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1[1], t2.v1())) return false;
		if (!MathUtils.equalsEM4(t1[2], t2.v2())) return false;
		if (!MathUtils.equalsEM4(t1[3], t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM4(t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1[2], t2.getAt(2))) return false;
		if (!MathUtils.equalsEM4(t1[3], t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsEM4(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM4(t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM4(t1v1, t2.v1())) return false;
		if (!MathUtils.equalsEM4(t1v2, t2.v2())) return false;
		if (!MathUtils.equalsEM4(t1v3, t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM4(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM4(t1v0, t2.getAt(0))) return false;
		if (!MathUtils.equalsEM4(t1v1, t2.getAt(1))) return false;
		if (!MathUtils.equalsEM4(t1v2, t2.getAt(2))) return false;
		if (!MathUtils.equalsEM4(t1v3, t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.v1())) return false;
		if (!MathUtils.equalsEM6(t2.v2(), t2.v2())) return false;
		if (!MathUtils.equalsEM6(t2.v3(), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM6(t1.v3(), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2[1])) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2[2])) return false;
		if (!MathUtils.equalsEM6(t1.v3(), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM6(t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM6(t1.v1(), t2v1)) return false;
		if (!MathUtils.equalsEM6(t1.v2(), t2v2)) return false;
		if (!MathUtils.equalsEM6(t1.v3(), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2.v2())) return false;
		if (!MathUtils.equalsEM6(t1.getAt(3), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM6(t1.getAt(3), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2[2])) return false;
		if (!MathUtils.equalsEM6(t1.getAt(3), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM6(t1.getAt(0), t2v0)) return false;
		if (!MathUtils.equalsEM6(t1.getAt(1), t2v1)) return false;
		if (!MathUtils.equalsEM6(t1.getAt(2), t2v2)) return false;
		if (!MathUtils.equalsEM6(t1.getAt(3), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1[2], t2.v2())) return false;
		if (!MathUtils.equalsEM6(t1[3], t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM6(t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1[2], t2.getAt(2))) return false;
		if (!MathUtils.equalsEM6(t1[3], t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsEM6(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM6(t1v1, t2.v1())) return false;
		if (!MathUtils.equalsEM6(t1v2, t2.v2())) return false;
		if (!MathUtils.equalsEM6(t1v3, t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM6(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM6(t1v0, t2.getAt(0))) return false;
		if (!MathUtils.equalsEM6(t1v1, t2.getAt(1))) return false;
		if (!MathUtils.equalsEM6(t1v2, t2.getAt(2))) return false;
		if (!MathUtils.equalsEM6(t1v3, t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2.v1())) return false;
		if (!MathUtils.equalsEM8(t2.v2(), t2.v2())) return false;
		if (!MathUtils.equalsEM8(t2.v3(), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM8(t1.v2(), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM8(t1.v3(), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2[0])) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2[1])) return false;
		if (!MathUtils.equalsEM8(t1.v2(), t2[2])) return false;
		if (!MathUtils.equalsEM8(t1.v3(), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM8(t1.v0(), t2v0)) return false;
		if (!MathUtils.equalsEM8(t1.v1(), t2v1)) return false;
		if (!MathUtils.equalsEM8(t1.v2(), t2v2)) return false;
		if (!MathUtils.equalsEM8(t1.v3(), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.getAt(0), t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1.getAt(1), t2.v1())) return false;
		if (!MathUtils.equalsEM8(t1.getAt(2), t2.v2())) return false;
		if (!MathUtils.equalsEM8(t1.getAt(3), t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.getAt(0), t2.getAt(0))) return false;
		if (!MathUtils.equalsEM8(t1.getAt(1), t2.getAt(1))) return false;
		if (!MathUtils.equalsEM8(t1.getAt(2), t2.getAt(2))) return false;
		if (!MathUtils.equalsEM8(t1.getAt(3), t2.getAt(3))) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1.getAt(0), t2[0])) return false;
		if (!MathUtils.equalsEM8(t1.getAt(1), t2[1])) return false;
		if (!MathUtils.equalsEM8(t1.getAt(2), t2[2])) return false;
		if (!MathUtils.equalsEM8(t1.getAt(3), t2[3])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		if (!MathUtils.equalsEM8(t1.getAt(0), t2v0)) return false;
		if (!MathUtils.equalsEM8(t1.getAt(1), t2v1)) return false;
		if (!MathUtils.equalsEM8(t1.getAt(2), t2v2)) return false;
		if (!MathUtils.equalsEM8(t1.getAt(3), t2v3)) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1[0], t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1[1], t2.v1())) return false;
		if (!MathUtils.equalsEM8(t1[2], t2.v2())) return false;
		if (!MathUtils.equalsEM8(t1[3], t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		if (!MathUtils.equalsEM8(t1[0], t2.getAt(0))) return false;
		if (!MathUtils.equalsEM8(t1[1], t2.getAt(1))) return false;
		if (!MathUtils.equalsEM8(t1[2], t2.getAt(2))) return false;
		if (!MathUtils.equalsEM8(t1[3], t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsEM8(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM8(t1v0, t2.v0())) return false;
		if (!MathUtils.equalsEM8(t1v1, t2.v1())) return false;
		if (!MathUtils.equalsEM8(t1v2, t2.v2())) return false;
		if (!MathUtils.equalsEM8(t1v3, t2.v3())) return false;

		return true;
	}

	public static boolean equalsEM8(float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		if (!MathUtils.equalsEM8(t1v0, t2.getAt(0))) return false;
		if (!MathUtils.equalsEM8(t1v1, t2.getAt(1))) return false;
		if (!MathUtils.equalsEM8(t1v2, t2.getAt(2))) return false;
		if (!MathUtils.equalsEM8(t1v3, t2.getAt(3))) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2.v0();
			case 1 -> t1.v1() == t2.v1();
			case 2 -> t1.v2() == t2.v2();
			case 3 -> t1.v3() == t2.v3();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2.getAt(0);
			case 1 -> t1.v1() == t2.getAt(1);
			case 2 -> t1.v2() == t2.getAt(2);
			case 3 -> t1.v3() == t2.getAt(3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2[0];
			case 1 -> t1.v1() == t2[1];
			case 2 -> t1.v2() == t2[2];
			case 3 -> t1.v3() == t2[3];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == value;
			case 1 -> t1.v1() == value;
			case 2 -> t1.v2() == value;
			case 3 -> t1.v3() == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.v0() == t2v0;
			case 1 -> t1.v1() == t2v1;
			case 2 -> t1.v2() == t2v2;
			case 3 -> t1.v3() == t2v3;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2.v0();
			case 1 -> t1.getAt(1) == t2.v1();
			case 2 -> t1.getAt(2) == t2.v2();
			case 3 -> t1.getAt(3) == t2.v3();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2.getAt(0);
			case 1 -> t1.getAt(1) == t2.getAt(1);
			case 2 -> t1.getAt(2) == t2.getAt(2);
			case 3 -> t1.getAt(3) == t2.getAt(3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2[0];
			case 1 -> t1.getAt(1) == t2[1];
			case 2 -> t1.getAt(2) == t2[2];
			case 3 -> t1.getAt(3) == t2[3];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == value;
			case 1 -> t1.getAt(1) == value;
			case 2 -> t1.getAt(2) == value;
			case 3 -> t1.getAt(3) == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> t1.getAt(0) == t2v0;
			case 1 -> t1.getAt(1) == t2v1;
			case 2 -> t1.getAt(2) == t2v2;
			case 3 -> t1.getAt(3) == t2v3;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2.v0();
			case 1 -> t1[1] == t2.v1();
			case 2 -> t1[2] == t2.v2();
			case 3 -> t1[3] == t2.v3();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2.getAt(0);
			case 1 -> t1[1] == t2.getAt(1);
			case 2 -> t1[2] == t2.getAt(2);
			case 3 -> t1[3] == t2.getAt(3);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> t1v0 == t2.v0();
			case 1 -> t1v1 == t2.v1();
			case 2 -> t1v2 == t2.v2();
			case 3 -> t1v3 == t2.v3();
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> t1v0 == t2.getAt(0);
			case 1 -> t1v1 == t2.getAt(1);
			case 2 -> t1v2 == t2.getAt(2);
			case 3 -> t1v3 == t2.getAt(3);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2.v1());
			case 2 -> MathUtils.equalsEM(tolerance, t1.v2(), t2.v2());
			case 3 -> MathUtils.equalsEM(tolerance, t1.v3(), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equalsEM(tolerance, t1.v2(), t2.getAt(2));
			case 3 -> MathUtils.equalsEM(tolerance, t1.v3(), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2[1]);
			case 2 -> MathUtils.equalsEM(tolerance, t1.v2(), t2[2]);
			case 3 -> MathUtils.equalsEM(tolerance, t1.v3(), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), value);
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), value);
			case 2 -> MathUtils.equalsEM(tolerance, t1.v2(), value);
			case 3 -> MathUtils.equalsEM(tolerance, t1.v3(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM(tolerance, t1.v1(), t2v1);
			case 2 -> MathUtils.equalsEM(tolerance, t1.v2(), t2v2);
			case 3 -> MathUtils.equalsEM(tolerance, t1.v2(), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equalsEM(tolerance, t1.getAt(2), t2.v2());
			case 3 -> MathUtils.equalsEM(tolerance, t1.getAt(3), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equalsEM(tolerance, t1.getAt(2), t2.getAt(2));
			case 3 -> MathUtils.equalsEM(tolerance, t1.getAt(3), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equalsEM(tolerance, t1.getAt(2), t2[2]);
			case 3 -> MathUtils.equalsEM(tolerance, t1.getAt(3), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.getAt(0), value);
			case 1 -> MathUtils.equalsEM(tolerance, t1.getAt(1), value);
			case 2 -> MathUtils.equalsEM(tolerance, t1.getAt(2), value);
			case 3 -> MathUtils.equalsEM(tolerance, t1.getAt(3), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2,float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1.getAt(0), t2v0);
			case 1 -> MathUtils.equalsEM(tolerance, t1.getAt(1), t2v1);
			case 2 -> MathUtils.equalsEM(tolerance, t1.getAt(2), t2v2);
			case 3 -> MathUtils.equalsEM(tolerance, t1.getAt(3), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2.v1());
			case 2 -> MathUtils.equalsEM(tolerance, t1[2], t2.v2());
			case 3 -> MathUtils.equalsEM(tolerance, t1[3], t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2.getAt(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2.getAt(1));
			case 2 -> MathUtils.equalsEM(tolerance, t1[2], t2.getAt(2));
			case 3 -> MathUtils.equalsEM(tolerance, t1[3], t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM(float tolerance, int index, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM(tolerance, t1v1, t2.v1());
			case 2 -> MathUtils.equalsEM(tolerance, t1v2, t2.v2());
			case 3 -> MathUtils.equalsEM(tolerance, t1v3, t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, float t1v0, float t1v1,  float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1v0, t2.getAt(0));
			case 1 -> MathUtils.equalsEM(tolerance, t1v1, t2.getAt(1));
			case 2 -> MathUtils.equalsEM(tolerance, t1v2, t2.getAt(2));
			case 3 -> MathUtils.equalsEM(tolerance, t1v3, t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2.v1());
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2.v2());
			case 3 -> MathUtils.equalsEM4(t1.v3(), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2.getAt(2));
			case 3 -> MathUtils.equalsEM4(t1.v3(), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2[1]);
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2[2]);
			case 3 -> MathUtils.equalsEM4(t1.v3(), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), value);
			case 1 -> MathUtils.equalsEM4(t1.v1(), value);
			case 2 -> MathUtils.equalsEM4(t1.v2(), value);
			case 3 -> MathUtils.equalsEM4(t1.v3(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM4(t1.v1(), t2v1);
			case 2 -> MathUtils.equalsEM4(t1.v2(), t2v2);
			case 3 -> MathUtils.equalsEM4(t1.v2(), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2.v2());
			case 3 -> MathUtils.equalsEM4(t1.getAt(3), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2.getAt(2));
			case 3 -> MathUtils.equalsEM4(t1.getAt(3), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2[2]);
			case 3 -> MathUtils.equalsEM4(t1.getAt(3), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), value);
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), value);
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), value);
			case 3 -> MathUtils.equalsEM4(t1.getAt(3), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2,float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1.getAt(0), t2v0);
			case 1 -> MathUtils.equalsEM4(t1.getAt(1), t2v1);
			case 2 -> MathUtils.equalsEM4(t1.getAt(2), t2v2);
			case 3 -> MathUtils.equalsEM4(t1.getAt(3), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM4(t1[1], t2.v1());
			case 2 -> MathUtils.equalsEM4(t1[2], t2.v2());
			case 3 -> MathUtils.equalsEM4(t1[3], t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1[2], t2.getAt(2));
			case 3 -> MathUtils.equalsEM4(t1[3], t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM4(int index, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM4(t1v1, t2.v1());
			case 2 -> MathUtils.equalsEM4(t1v2, t2.v2());
			case 3 -> MathUtils.equalsEM4(t1v3, t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1v0, float t1v1,  float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1v0, t2.getAt(0));
			case 1 -> MathUtils.equalsEM4(t1v1, t2.getAt(1));
			case 2 -> MathUtils.equalsEM4(t1v2, t2.getAt(2));
			case 3 -> MathUtils.equalsEM4(t1v3, t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2.v1());
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2.v2());
			case 3 -> MathUtils.equalsEM6(t1.v3(), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2.getAt(2));
			case 3 -> MathUtils.equalsEM6(t1.v3(), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2[1]);
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2[2]);
			case 3 -> MathUtils.equalsEM6(t1.v3(), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), value);
			case 1 -> MathUtils.equalsEM6(t1.v1(), value);
			case 2 -> MathUtils.equalsEM6(t1.v2(), value);
			case 3 -> MathUtils.equalsEM6(t1.v3(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM6(t1.v1(), t2v1);
			case 2 -> MathUtils.equalsEM6(t1.v2(), t2v2);
			case 3 -> MathUtils.equalsEM6(t1.v2(), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2.v2());
			case 3 -> MathUtils.equalsEM6(t1.getAt(3), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2.getAt(2));
			case 3 -> MathUtils.equalsEM6(t1.getAt(3), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2[2]);
			case 3 -> MathUtils.equalsEM6(t1.getAt(3), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), value);
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), value);
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), value);
			case 3 -> MathUtils.equalsEM6(t1.getAt(3), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2,float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1.getAt(0), t2v0);
			case 1 -> MathUtils.equalsEM6(t1.getAt(1), t2v1);
			case 2 -> MathUtils.equalsEM6(t1.getAt(2), t2v2);
			case 3 -> MathUtils.equalsEM6(t1.getAt(3), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM6(t1[1], t2.v1());
			case 2 -> MathUtils.equalsEM6(t1[2], t2.v2());
			case 3 -> MathUtils.equalsEM6(t1[3], t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1[2], t2.getAt(2));
			case 3 -> MathUtils.equalsEM6(t1[3], t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM6(int index, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM6(t1v1, t2.v1());
			case 2 -> MathUtils.equalsEM6(t1v2, t2.v2());
			case 3 -> MathUtils.equalsEM6(t1v3, t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1v0, float t1v1,  float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1v0, t2.getAt(0));
			case 1 -> MathUtils.equalsEM6(t1v1, t2.getAt(1));
			case 2 -> MathUtils.equalsEM6(t1v2, t2.getAt(2));
			case 3 -> MathUtils.equalsEM6(t1v3, t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2.v0());
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2.v1());
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2.v2());
			case 3 -> MathUtils.equalsEM8(t1.v3(), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2.getAt(2));
			case 3 -> MathUtils.equalsEM8(t1.v3(), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2[0]);
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2[1]);
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2[2]);
			case 3 -> MathUtils.equalsEM8(t1.v3(), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), value);
			case 1 -> MathUtils.equalsEM8(t1.v1(), value);
			case 2 -> MathUtils.equalsEM8(t1.v2(), value);
			case 3 -> MathUtils.equalsEM8(t1.v3(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITup4RF t1, float t2v0, float t2v1, float t2v2, float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.v0(), t2v0);
			case 1 -> MathUtils.equalsEM8(t1.v1(), t2v1);
			case 2 -> MathUtils.equalsEM8(t1.v2(), t2v2);
			case 3 -> MathUtils.equalsEM8(t1.v2(), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2.v2());
			case 3 -> MathUtils.equalsEM8(t1.getAt(3), t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2.getAt(2));
			case 3 -> MathUtils.equalsEM8(t1.getAt(3), t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2[2]);
			case 3 -> MathUtils.equalsEM8(t1.getAt(3), t2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), value);
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), value);
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), value);
			case 3 -> MathUtils.equalsEM8(t1.getAt(3), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, float t2v0, float t2v1, float t2v2,float t2v3)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1.getAt(0), t2v0);
			case 1 -> MathUtils.equalsEM8(t1.getAt(1), t2v1);
			case 2 -> MathUtils.equalsEM8(t1.getAt(2), t2v2);
			case 3 -> MathUtils.equalsEM8(t1.getAt(3), t2v3);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2.v0());
			case 1 -> MathUtils.equalsEM8(t1[1], t2.v1());
			case 2 -> MathUtils.equalsEM8(t1[2], t2.v2());
			case 3 -> MathUtils.equalsEM8(t1[3], t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1[2], t2.getAt(2));
			case 3 -> MathUtils.equalsEM8(t1[3], t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM8(int index, float t1v0, float t1v1, float t1v2, float t1v3, @AllowNull ITup4RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1v0, t2.v0());
			case 1 -> MathUtils.equalsEM8(t1v1, t2.v1());
			case 2 -> MathUtils.equalsEM8(t1v2, t2.v2());
			case 3 -> MathUtils.equalsEM8(t1v3, t2.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1v0, float t1v1,  float t1v2, float t1v3, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1v0, t2.getAt(0));
			case 1 -> MathUtils.equalsEM8(t1v1, t2.getAt(1));
			case 2 -> MathUtils.equalsEM8(t1v2, t2.getAt(2));
			case 3 -> MathUtils.equalsEM8(t1v3, t2.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtV0(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v0() == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v0() == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v0() == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return t1.v0() == value;
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(0) == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(0) == t2.getAt(0);
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(0) == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return t1.getAt(0) == value;
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[0] == t2.v0();
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[0] == t2.getAt(0);
	}
	
	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITup4RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM(tolerance, t.v0(), value);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(0), value);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], t2.getAt(0));
	}
	
	public static boolean equalsAtV0EM4(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITup4RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM4(t.v0(), value);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(0), value);
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[0], t2.getAt(0));
	}
	
	public static boolean equalsAtV0EM6(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITup4RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM6(t.v0(), value);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(0), value);
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[0], t2.getAt(0));
	}
	
	public static boolean equalsAtV0EM8(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITup4RF t, float value)
	{
		if (t == null) return false;

		return MathUtils.equalsEM8(t.v0(), value);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(0), value);
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[0], t2.v0());
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[0], t2.getAt(0));
	}
	
	public static boolean equalsAtV1(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v1() == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v1() == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v1() == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITup4RF t, float value)
	{
		if (t == null) return false;

		return t.v1() == value;
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(1) == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(1) == t2.getAt(1);
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(1) == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return t1.getAt(1) == value;
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[1] == t2.v1();
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[1] == t2.getAt(1);
	}
	
	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v1(), value);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(1), value);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], t2.getAt(1));
	}
	
	public static boolean equalsAtV1EM4(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.v1(), value);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(1), value);
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[1], t2.getAt(1));
	}
	
	public static boolean equalsAtV1EM6(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.v1(), value);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(1), value);
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[1], t2.getAt(1));
	}
	
	public static boolean equalsAtV1EM8(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.v1(), value);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(1), value);
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[1], t2.v1());
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[1], t2.getAt(1));
	}
	
	public static boolean equalsAtV2(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v2() == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v2() == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v2() == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull ITup4RF t, float value)
	{
		if (t == null) return false;

		return t.v2() == value;
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(2) == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(2) == t2.getAt(2);
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(2) == t2[2];
	}

	public static boolean equalsAtV2(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return t1.getAt(2) == value;
	}

	public static boolean equalsAtV2(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[2] == t2.v2();
	}

	public static boolean equalsAtV2(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[2] == t2.getAt(2);
	}
	
	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v2(), value);
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(2), value);
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[2], t2.v2());
	}

	public static boolean equalsAtV2EM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[2], t2.getAt(2));
	}
	
	public static boolean equalsAtV2EM4(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2EM4(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2EM4(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2EM4(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.v2(), value);
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(2), value);
	}

	public static boolean equalsAtV2EM4(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[2], t2.v2());
	}

	public static boolean equalsAtV2EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[2], t2.getAt(2));
	}
	
	public static boolean equalsAtV2EM6(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2EM6(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2EM6(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2EM6(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.v2(), value);
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(2), value);
	}

	public static boolean equalsAtV2EM6(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[2], t2.v2());
	}

	public static boolean equalsAtV2EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[2], t2.getAt(2));
	}
	
	public static boolean equalsAtV2EM8(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2EM8(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2EM8(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2EM8(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.v2(), value);
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(2), value);
	}

	public static boolean equalsAtV2EM8(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[2], t2.v2());
	}

	public static boolean equalsAtV2EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[2], t2.getAt(2));
	}
	
	public static boolean equalsAtV3(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v3() == t2.v3();
	}

	public static boolean equalsAtV3(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v3() == t2.getAt(3);
	}

	public static boolean equalsAtV3(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.v3() == t2[3];
	}

	public static boolean equalsAtV3(@AllowNull ITup4RF t, float value)
	{
		if (t == null) return false;

		return t.v3() == value;
	}

	public static boolean equalsAtV3(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(3) == t2.v3();
	}

	public static boolean equalsAtV3(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(3) == t2.getAt(3);
	}

	public static boolean equalsAtV3(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1.getAt(3) == t2[3];
	}

	public static boolean equalsAtV3(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return t1.getAt(3) == value;
	}

	public static boolean equalsAtV3(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[3] == t2.v3();
	}

	public static boolean equalsAtV3(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return t1[3] == t2.getAt(3);
	}
	
	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v3(), t2.v3());
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v3(), t2.getAt(3));
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v3(), t2[3]);
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.v3(), value);
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(3), t2.v3());
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(3), t2.getAt(3));
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(3), t2[3]);
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1.getAt(3), value);
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[3], t2.v3());
	}

	public static boolean equalsAtV3EM(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[3], t2.getAt(3));
	}
	
	public static boolean equalsAtV3EM4(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v3(), t2.v3());
	}

	public static boolean equalsAtV3EM4(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v3(), t2.getAt(3));
	}

	public static boolean equalsAtV3EM4(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.v3(), t2[3]);
	}

	public static boolean equalsAtV3EM4(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.v3(), value);
	}

	public static boolean equalsAtV3EM4(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(3), t2.v3());
	}

	public static boolean equalsAtV3EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(3), t2.getAt(3));
	}

	public static boolean equalsAtV3EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(3), t2[3]);
	}

	public static boolean equalsAtV3EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(3), value);
	}

	public static boolean equalsAtV3EM4(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[3], t2.v3());
	}

	public static boolean equalsAtV3EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[3], t2.getAt(3));
	}
	
	public static boolean equalsAtV3EM6(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v3(), t2.v3());
	}

	public static boolean equalsAtV3EM6(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v3(), t2.getAt(3));
	}

	public static boolean equalsAtV3EM6(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.v3(), t2[3]);
	}

	public static boolean equalsAtV3EM6(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.v3(), value);
	}

	public static boolean equalsAtV3EM6(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(3), t2.v3());
	}

	public static boolean equalsAtV3EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(3), t2.getAt(3));
	}

	public static boolean equalsAtV3EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(3), t2[3]);
	}

	public static boolean equalsAtV3EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(3), value);
	}

	public static boolean equalsAtV3EM6(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[3], t2.v3());
	}

	public static boolean equalsAtV3EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[3], t2.getAt(3));
	}
	
	public static boolean equalsAtV3EM8(@AllowNull ITup4RF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v3(), t2.v3());
	}

	public static boolean equalsAtV3EM8(@AllowNull ITup4RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v3(), t2.getAt(3));
	}

	public static boolean equalsAtV3EM8(@AllowNull ITup4RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.v3(), t2[3]);
	}

	public static boolean equalsAtV3EM8(@AllowNull ITup4RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.v3(), value);
	}

	public static boolean equalsAtV3EM8(@AllowNull ITupRF t1, @AllowNull ITup4RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(3), t2.v3());
	}

	public static boolean equalsAtV3EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(3), t2.getAt(3));
	}

	public static boolean equalsAtV3EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(3), t2[3]);
	}

	public static boolean equalsAtV3EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(3), value);
	}

	public static boolean equalsAtV3EM8(@AllowNull float[] t1, @AllowNull ITup4RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[3], t2.v3());
	}

	public static boolean equalsAtV3EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[3], t2.getAt(3));
	}
	
	public static boolean isFinite(ITup4RF t)
	{
		return Float.isFinite(t.v0()) && Float.isFinite(t.v1()) && Float.isFinite(t.v2()) && Float.isFinite(t.v3());
	}

	public static boolean isFinite(ITupRF t)
	{
		return Float.isFinite(t.getAt(0)) && Float.isFinite(t.getAt(1)) && Float.isFinite(t.getAt(2)) && Float.isFinite(t.getAt(3));
	}
	
	public static boolean isFiniteAt(int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t.v0());
			case 1 -> Float.isFinite(t.v1());
			case 2 -> Float.isFinite(t.v2());
			case 3 -> Float.isFinite(t.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isFiniteAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t.getAt(0));
			case 1 -> Float.isFinite(t.getAt(1));
			case 2 -> Float.isFinite(t.getAt(2));
			case 3 -> Float.isFinite(t.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFiniteAtV0(ITup4RF t)
	{
		return Float.isFinite(t.v0());
	}

	public static boolean isFiniteAtV0(ITupRF t)
	{
		return Float.isFinite(t.getAt(0));
	}
	
	public static boolean isFiniteAtV1(ITup4RF t)
	{
		return Float.isFinite(t.v1());
	}

	public static boolean isFiniteAtV1(ITupRF t)
	{
		return Float.isFinite(t.getAt(1));
	}
	
	public static boolean isFiniteAtV2(ITup4RF t)
	{
		return Float.isFinite(t.v2());
	}

	public static boolean isFiniteAtV2(ITupRF t)
	{
		return Float.isFinite(t.getAt(2));
	}
	
	public static boolean isFiniteAtV3(ITup4RF t)
	{
		return Float.isFinite(t.v3());
	}

	public static boolean isFiniteAtV3(ITupRF t)
	{
		return Float.isFinite(t.getAt(3));
	}
	
	public static boolean isInfinite(ITup4RF t)
	{
		return Float.isInfinite(t.v0()) && Float.isInfinite(t.v1()) && Float.isInfinite(t.v2()) && Float.isInfinite(t.v3());
	}

	public static boolean isInfinite(ITupRF t)
	{
		return Float.isInfinite(t.getAt(0)) && Float.isInfinite(t.getAt(1)) && Float.isInfinite(t.getAt(2)) && Float.isInfinite(t.getAt(3));
	}
	
	public static boolean isInfiniteAt(int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(t.v0());
			case 1 -> Float.isInfinite(t.v1());
			case 2 -> Float.isInfinite(t.v2());
			case 3 -> Float.isInfinite(t.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isInfiniteAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(t.getAt(0));
			case 1 -> Float.isInfinite(t.getAt(1));
			case 2 -> Float.isInfinite(t.getAt(2));
			case 3 -> Float.isInfinite(t.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isInfiniteAtV0(ITup4RF t)
	{
		return Float.isInfinite(t.v0());
	}

	public static boolean isInfiniteAtV0(ITupRF t)
	{
		return Float.isInfinite(t.getAt(0));
	}
	
	public static boolean isInfiniteAtV1(ITup4RF t)
	{
		return Float.isInfinite(t.v1());
	}

	public static boolean isInfiniteAtV1(ITupRF t)
	{
		return Float.isInfinite(t.getAt(1));
	}
	
	public static boolean isInfiniteAtV2(ITup4RF t)
	{
		return Float.isInfinite(t.v2());
	}

	public static boolean isInfiniteAtV2(ITupRF t)
	{
		return Float.isInfinite(t.getAt(2));
	}
	
	public static boolean isInfiniteAtV3(ITup4RF t)
	{
		return Float.isInfinite(t.v3());
	}

	public static boolean isInfiniteAtV3(ITupRF t)
	{
		return Float.isInfinite(t.getAt(3));
	}
	
	public static boolean isNaN(ITup4RF t)
	{
		return Float.isNaN(t.v0()) && Float.isNaN(t.v1()) && Float.isNaN(t.v2()) && Float.isNaN(t.v3());
	}

	public static boolean isNaN(ITupRF t)
	{
		return Float.isNaN(t.getAt(0)) && Float.isNaN(t.getAt(1)) && Float.isNaN(t.getAt(2)) && Float.isNaN(t.getAt(3));
	}
	
	public static boolean isNaNAt(int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> Float.isNaN(t.v0());
			case 1 -> Float.isNaN(t.v1());
			case 2 -> Float.isNaN(t.v2());
			case 3 -> Float.isNaN(t.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isNaNAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> Float.isNaN(t.getAt(0));
			case 1 -> Float.isNaN(t.getAt(1));
			case 2 -> Float.isNaN(t.getAt(2));
			case 3 -> Float.isNaN(t.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaNAtV0(ITup4RF t)
	{
		return Float.isNaN(t.v0());
	}

	public static boolean isNaNAtV0(ITupRF t)
	{
		return Float.isNaN(t.getAt(0));
	}
	
	public static boolean isNaNAtV1(ITup4RF t)
	{
		return Float.isNaN(t.v1());
	}

	public static boolean isNaNAtV1(ITupRF t)
	{
		return Float.isNaN(t.getAt(1));
	}
	
	public static boolean isNaNAtV2(ITup4RF t)
	{
		return Float.isNaN(t.v2());
	}

	public static boolean isNaNAtV2(ITupRF t)
	{
		return Float.isNaN(t.getAt(2));
	}
	
	public static boolean isNaNAtV3(ITup4RF t)
	{
		return Float.isNaN(t.v3());
	}

	public static boolean isNaNAtV3(ITupRF t)
	{
		return Float.isNaN(t.getAt(3));
	}
	
	public static boolean isZero(ITup4RF t)
	{
		return t.v0() == 0.0f && t.v1() == 0.0f && t.v2() == 0.0f && t.v3() == 0.0f;
	}

	public static boolean isZero(ITupRF t)
	{
		return t.getAt(0) == 0.0f && t.getAt(1) == 0.0f && t.getAt(2) == 0.0f && t.getAt(3) == 0.0f;
	}
	
	public static boolean isZeroEM(float tolerance, ITup4RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v0()) && MathUtils.isZeroEM(tolerance, t.v1()) && MathUtils.isZeroEM(tolerance, t.v2());
	}

	public static boolean isZeroEM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.getAt(0)) && MathUtils.isZeroEM(tolerance, t.getAt(1)) && MathUtils.isZeroEM(tolerance, t.getAt(2)) && MathUtils.isZeroEM(tolerance, t.getAt(3));
	}
	
	public static boolean isZeroEM4(ITup4RF t)
	{
		return MathUtils.isZeroEM4(t.v0()) && MathUtils.isZeroEM4(t.v1()) && MathUtils.isZeroEM4(t.v2()) && MathUtils.isZeroEM4(t.v3());
	}

	public static boolean isZeroEM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(0)) && MathUtils.isZeroEM4(t.getAt(1)) && MathUtils.isZeroEM4(t.getAt(2)) && MathUtils.isZeroEM4(t.getAt(3));
	}
	
	public static boolean isZeroEM6(ITup4RF t)
	{
		return MathUtils.isZeroEM6(t.v0()) && MathUtils.isZeroEM6(t.v1()) && MathUtils.isZeroEM6(t.v2()) && MathUtils.isZeroEM6(t.v3());
	}

	public static boolean isZeroEM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(0)) && MathUtils.isZeroEM6(t.getAt(1)) && MathUtils.isZeroEM6(t.getAt(2)) && MathUtils.isZeroEM6(t.getAt(3));
	}
	
	public static boolean isZeroEM8(ITup4RF t)
	{
		return MathUtils.isZeroEM8(t.v0()) && MathUtils.isZeroEM8(t.v1()) && MathUtils.isZeroEM8(t.v2()) && MathUtils.isZeroEM8(t.v3());
	}

	public static boolean isZeroEM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(0)) && MathUtils.isZeroEM8(t.getAt(1)) && MathUtils.isZeroEM8(t.getAt(2)) && MathUtils.isZeroEM8(t.getAt(3));
	}
	
	public static boolean isZeroAt(int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> t.v0() == 0.0f;
			case 1 -> t.v1() == 0.0f;
			case 2 -> t.v2() == 0.0f;
			case 3 -> t.v3() == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> t.getAt(0) == 0.0f;
			case 1 -> t.getAt(1) == 0.0f;
			case 2 -> t.getAt(2) == 0.0f;
			case 3 -> t.getAt(3) == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM(float tolerance, int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, t.v0());
			case 1 -> MathUtils.isZeroEM(tolerance, t.v1());
			case 2 -> MathUtils.isZeroEM(tolerance, t.v2());
			case 3 -> MathUtils.isZeroEM(tolerance, t.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM(float tolerance, int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, t.getAt(0));
			case 1 -> MathUtils.isZeroEM(tolerance, t.getAt(1));
			case 2 -> MathUtils.isZeroEM(tolerance, t.getAt(2));
			case 3 -> MathUtils.isZeroEM(tolerance, t.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM4(int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(t.v0());
			case 1 -> MathUtils.isZeroEM4(t.v1());
			case 2 -> MathUtils.isZeroEM4(t.v2());
			case 3 -> MathUtils.isZeroEM4(t.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM4(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(t.getAt(0));
			case 1 -> MathUtils.isZeroEM4(t.getAt(1));
			case 2 -> MathUtils.isZeroEM4(t.getAt(2));
			case 3 -> MathUtils.isZeroEM4(t.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM6(int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(t.v0());
			case 1 -> MathUtils.isZeroEM6(t.v1());
			case 2 -> MathUtils.isZeroEM6(t.v2());
			case 3 -> MathUtils.isZeroEM6(t.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM6(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(t.getAt(0));
			case 1 -> MathUtils.isZeroEM6(t.getAt(1));
			case 2 -> MathUtils.isZeroEM6(t.getAt(2));
			case 3 -> MathUtils.isZeroEM6(t.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM8(int index, ITup4RF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(t.v0());
			case 1 -> MathUtils.isZeroEM8(t.v1());
			case 2 -> MathUtils.isZeroEM8(t.v2());
			case 3 -> MathUtils.isZeroEM8(t.v3());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM8(int index, ITupRF t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(t.getAt(0));
			case 1 -> MathUtils.isZeroEM8(t.getAt(1));
			case 2 -> MathUtils.isZeroEM8(t.getAt(2));
			case 3 -> MathUtils.isZeroEM8(t.getAt(3));
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtV0(ITup4RF t)
	{
		return t.v0() == 0.0f;
	}

	public static boolean isZeroAtV0(ITupRF t)
	{
		return t.getAt(0) == 0.0f;
	}
	
	public static boolean isZeroAtV0EM(float tolerance, ITup4RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v0());
	}

	public static boolean isZeroAtV0EM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.getAt(0));
	}
	
	public static boolean isZeroAtV0EM4(ITup4RF t)
	{
		return MathUtils.isZeroEM4(t.v0());
	}

	public static boolean isZeroAtV0EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(0));
	}
	
	public static boolean isZeroAtV0EM6(ITup4RF t)
	{
		return MathUtils.isZeroEM6(t.v0());
	}

	public static boolean isZeroAtV0EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(0));
	}
	
	public static boolean isZeroAtV0EM8(ITup4RF t)
	{
		return MathUtils.isZeroEM8(t.v0());
	}

	public static boolean isZeroAtV0EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(0));
	}
	
	public static boolean isZeroAtV1(ITup4RF t)
	{
		return t.v1() == 0.0f;
	}

	public static boolean isZeroAtV1(ITupRF t)
	{
		return t.getAt(1) == 0.0f;
	}
	
	public static boolean isZeroAtV1EM(float tolerance, ITup4RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v1());
	}

	public static boolean isZeroAtV1EM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.getAt(1));
	}
	
	public static boolean isZeroAtV1EM4(ITup4RF t)
	{
		return MathUtils.isZeroEM4(t.v1());
	}

	public static boolean isZeroAtV1EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(1));
	}
	
	public static boolean isZeroAtV1EM6(ITup4RF t)
	{
		return MathUtils.isZeroEM6(t.v1());
	}

	public static boolean isZeroAtV1EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(1));
	}
	
	public static boolean isZeroAtV1EM8(ITup4RF t)
	{
		return MathUtils.isZeroEM8(t.v1());
	}

	public static boolean isZeroAtV1EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(1));
	}
	
	public static boolean isZeroAtV2(ITup4RF t)
	{
		return t.v2() == 0.0f;
	}

	public static boolean isZeroAtV2(ITupRF t)
	{
		return t.getAt(2) == 0.0f;
	}
	
	public static boolean isZeroAtV2EM(float tolerance, ITup4RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v2());
	}

	public static boolean isZeroAtV2EM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.getAt(2));
	}
	
	public static boolean isZeroAtV2EM4(ITup4RF t)
	{
		return MathUtils.isZeroEM4(t.v2());
	}

	public static boolean isZeroAtV2EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(2));
	}
	
	public static boolean isZeroAtV2EM6(ITup4RF t)
	{
		return MathUtils.isZeroEM6(t.v2());
	}

	public static boolean isZeroAtV2EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(2));
	}
	
	public static boolean isZeroAtV2EM8(ITup4RF t)
	{
		return MathUtils.isZeroEM8(t.v2());
	}

	public static boolean isZeroAtV2EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(2));
	}
	
	public static boolean isZeroAtV3(ITup4RF t)
	{
		return t.v3() == 0.0f;
	}

	public static boolean isZeroAtV3(ITupRF t)
	{
		return t.getAt(3) == 0.0f;
	}
	
	public static boolean isZeroAtV3EM(float tolerance, ITup4RF t)
	{
		return MathUtils.isZeroEM(tolerance, t.v3());
	}

	public static boolean isZeroAtV3EM(float tolerance, ITupRF t)
	{
		return MathUtils.isZeroEM(tolerance, t.getAt(3));
	}
	
	public static boolean isZeroAtV3EM4(ITup4RF t)
	{
		return MathUtils.isZeroEM4(t.v3());
	}

	public static boolean isZeroAtV3EM4(ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(3));
	}
	
	public static boolean isZeroAtV3EM6(ITup4RF t)
	{
		return MathUtils.isZeroEM6(t.v3());
	}

	public static boolean isZeroAtV3EM6(ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(3));
	}
	
	public static boolean isZeroAtV3EM8(ITup4RF t)
	{
		return MathUtils.isZeroEM8(t.v3());
	}

	public static boolean isZeroAtV3EM8(ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(3));
	}
	
}
