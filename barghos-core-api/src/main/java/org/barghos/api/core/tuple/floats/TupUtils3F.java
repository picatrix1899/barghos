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

		return equals(t1.v0(), t1.v1(), t1.v2(), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals(t1.v0(), t1.v1(), t1.v2(), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals(t1.v0(), t1.v1(), t1.v2(), t2[0], t2[1], t2[2]);
	}

	public static boolean equals(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return equals(t1.v0(), t1.v1(), t1.v2(), t2V0, t2V1, t2V2);
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return equals(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return equals(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return equals(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2[0], t2[1], t2[2]);
	}

	public static boolean equals(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return equals(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2V0, t2V1, t2V2);
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return equals(t1[0], t1[1], t1[2], t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return equals(t1[0], t1[1], t1[2], t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return equals(t1[0], t1[1], t1[2], t2[0], t2[1], t2[2]);
	}

	public static boolean equals(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return equals(t1[0], t1[1], t1[2], t2V0, t2V1, t2V2);
	}

	public static boolean equals(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return equals(t1V0, t1V1, t1V2, t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals(t1V0, t1V1, t1V2, t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals(t1V0, t1V1, t1V2, t2[0], t2[1], t2[2]);
	}

	public static boolean equals(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (t1V0 != t2V0) return false;
		if (t1V1 != t2V1) return false;
		if (t1V2 != t2V2) return false;

		return true;
	}

	public static boolean equals$EM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return equals$EM4(t1.v0(), t1.v1(), t1.v2(), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals$EM4(t1.v0(), t1.v1(), t1.v2(), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals$EM4(t1.v0(), t1.v1(), t1.v2(), t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM4(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return equals$EM4(t1.v0(), t1.v1(), t1.v2(), t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return equals$EM4(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return equals$EM4(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return equals$EM4(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM4(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return equals$EM4(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return equals$EM4(t1[0], t1[1], t1[2], t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return equals$EM4(t1[0], t1[1], t1[2], t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return equals$EM4(t1[0], t1[1], t1[2], t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM4(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return equals$EM4(t1[0], t1[1], t1[2], t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM4(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return equals$EM4(t1V0, t1V1, t1V2, t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM4(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals$EM4(t1V0, t1V1, t1V2, t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM4(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals$EM4(t1V0, t1V1, t1V2, t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM4(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equals$EM4(t1V0, t2V0)) return false;
		if (!MathUtils.equals$EM4(t1V1, t2V1)) return false;
		if (!MathUtils.equals$EM4(t1V2, t2V2)) return false;

		return true;
	}
	
	public static boolean equals$EM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return equals$EM6(t1.v0(), t1.v1(), t1.v2(), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals$EM6(t1.v0(), t1.v1(), t1.v2(), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals$EM6(t1.v0(), t1.v1(), t1.v2(), t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM6(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return equals$EM6(t1.v0(), t1.v1(), t1.v2(), t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return equals$EM6(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return equals$EM6(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return equals$EM6(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM6(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return equals$EM6(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return equals$EM6(t1[0], t1[1], t1[2], t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return equals$EM6(t1[0], t1[1], t1[2], t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return equals$EM6(t1[0], t1[1], t1[2], t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM6(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return equals$EM6(t1[0], t1[1], t1[2], t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM6(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return equals$EM6(t1V0, t1V1, t1V2, t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM6(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals$EM6(t1V0, t1V1, t1V2, t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM6(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals$EM6(t1V0, t1V1, t1V2, t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM6(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equals$EM6(t1V0, t2V0)) return false;
		if (!MathUtils.equals$EM6(t1V1, t2V1)) return false;
		if (!MathUtils.equals$EM6(t1V2, t2V2)) return false;

		return true;
	}
	
	public static boolean equals$EM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return equals$EM8(t1.v0(), t1.v1(), t1.v2(), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals$EM8(t1.v0(), t1.v1(), t1.v2(), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals$EM8(t1.v0(), t1.v1(), t1.v2(), t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM8(@AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return equals$EM8(t1.v0(), t1.v1(), t1.v2(), t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return equals$EM8(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return equals$EM8(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return equals$EM8(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM8(@AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return equals$EM8(t1.getAt(0), t1.getAt(1), t1.getAt(2), t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return equals$EM8(t1[0], t1[1], t1[2], t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return equals$EM8(t1[0], t1[1], t1[2], t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return equals$EM8(t1[0], t1[1], t1[2], t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM8(@AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return equals$EM8(t1[0], t1[1], t1[2], t2V0, t2V1, t2V2);
	}

	public static boolean equals$EM8(float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return equals$EM8(t1V0, t1V1, t1V2, t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals$EM8(float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals$EM8(t1V0, t1V1, t1V2, t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals$EM8(float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals$EM8(t1V0, t1V1, t1V2, t2[0], t2[1], t2[2]);
	}

	public static boolean equals$EM8(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equals$EM8(t1V0, t2V0)) return false;
		if (!MathUtils.equals$EM8(t1V1, t2V1)) return false;
		if (!MathUtils.equals$EM8(t1V2, t2V2)) return false;

		return true;
	}
	
	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return equals(tolerance, t1.v0(), t1.v1(), t1.v2(), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals(tolerance, t1.v0(), t1.v1(), t1.v2(), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals(tolerance, t1.v0(), t1.v1(), t1.v2(), t2[0], t2[1], t2[2]);
	}

	public static boolean equals(float tolerance, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return equals(tolerance, t1.v0(), t1.v1(), t1.v2(), t2V0, t2V1, t2V2);
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return equals(tolerance, t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return equals(tolerance, t1.getAt(0), t1.getAt(1), t1.getAt(2), t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return equals(tolerance, t1.getAt(0), t1.getAt(1), t1.getAt(2), t2[0], t2[1], t2[2]);
	}

	public static boolean equals(float tolerance, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return equals(tolerance, t1.getAt(0), t1.getAt(1), t1.getAt(2), t2V0, t2V1, t2V2);
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return equals(tolerance, t1[0], t1[1], t1[2], t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return equals(tolerance, t1[0], t1[1], t1[2], t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return equals(tolerance, t1[0], t1[1], t1[2], t2[0], t2[1], t2[2]);
	}

	public static boolean equals(float tolerance, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return equals(tolerance, t1[0], t1[1], t1[2], t2V0, t2V1, t2V2);
	}

	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return equals(tolerance, t1V0, t1V1, t1V2, t2.v0(), t2.v1(), t2.v2());
	}

	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return equals(tolerance, t1V0, t1V1, t1V2, t2.getAt(0), t2.getAt(1), t2.getAt(2));
	}

	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return equals(tolerance, t1V0, t1V1, t1V2, t2[0], t2[1], t2[2]);
	}

	public static boolean equals(float tolerance, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		if (!MathUtils.equals(tolerance, t1V0, t2V0)) return false;
		if (!MathUtils.equals(tolerance, t1V1, t2V1)) return false;
		if (!MathUtils.equals(tolerance, t1V2, t2V2)) return false;

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

	public static boolean equalsAt$EM4(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.v0(), t2.v0());
			case 1 -> MathUtils.equals$EM4(t1.v1(), t2.v1());
			case 2 -> MathUtils.equals$EM4(t1.v2(), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equals$EM4(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equals$EM4(t1.v2(), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.v0(), t2[0]);
			case 1 -> MathUtils.equals$EM4(t1.v1(), t2[1]);
			case 2 -> MathUtils.equals$EM4(t1.v2(), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.v0(), value);
			case 1 -> MathUtils.equals$EM4(t1.v1(), value);
			case 2 -> MathUtils.equals$EM4(t1.v2(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.v0(), t2V0);
			case 1 -> MathUtils.equals$EM4(t1.v1(), t2V1);
			case 2 -> MathUtils.equals$EM4(t1.v2(), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equals$EM4(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equals$EM4(t1.getAt(2), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equals$EM4(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equals$EM4(t1.getAt(2), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equals$EM4(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equals$EM4(t1.getAt(2), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.getAt(0), value);
			case 1 -> MathUtils.equals$EM4(t1.getAt(1), value);
			case 2 -> MathUtils.equals$EM4(t1.getAt(2), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1.getAt(0), t2V0);
			case 1 -> MathUtils.equals$EM4(t1.getAt(1), t2V1);
			case 2 -> MathUtils.equals$EM4(t1.getAt(2), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1[0], t2.v0());
			case 1 -> MathUtils.equals$EM4(t1[1], t2.v1());
			case 2 -> MathUtils.equals$EM4(t1[2], t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equals$EM4(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equals$EM4(t1[2], t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1[0], t2[0]);
			case 1 -> MathUtils.equals$EM4(t1[1], t2[1]);
			case 2 -> MathUtils.equals$EM4(t1[2], t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1[0], value);
			case 1 -> MathUtils.equals$EM4(t1[1], value);
			case 2 -> MathUtils.equals$EM4(t1[2], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1[0], t2V0);
			case 1 -> MathUtils.equals$EM4(t1[1], t2V1);
			case 2 -> MathUtils.equals$EM4(t1[2], t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1V0, t2.v0());
			case 1 -> MathUtils.equals$EM4(t1V1, t2.v1());
			case 2 -> MathUtils.equals$EM4(t1V2, t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1V0, t2.getAt(0));
			case 1 -> MathUtils.equals$EM4(t1V1, t2.getAt(1));
			case 2 -> MathUtils.equals$EM4(t1V2, t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1V0, t2[0]);
			case 1 -> MathUtils.equals$EM4(t1V1, t2[1]);
			case 2 -> MathUtils.equals$EM4(t1V2, t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1V0, value);
			case 1 -> MathUtils.equals$EM4(t1V1, value);
			case 2 -> MathUtils.equals$EM4(t1V2, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM4(int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> MathUtils.equals$EM4(t1V0, t2V0);
			case 1 -> MathUtils.equals$EM4(t1V1, t2V1);
			case 2 -> MathUtils.equals$EM4(t1V2, t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt$EM6(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.v0(), t2.v0());
			case 1 -> MathUtils.equals$EM6(t1.v1(), t2.v1());
			case 2 -> MathUtils.equals$EM6(t1.v2(), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equals$EM6(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equals$EM6(t1.v2(), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.v0(), t2[0]);
			case 1 -> MathUtils.equals$EM6(t1.v1(), t2[1]);
			case 2 -> MathUtils.equals$EM6(t1.v2(), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.v0(), value);
			case 1 -> MathUtils.equals$EM6(t1.v1(), value);
			case 2 -> MathUtils.equals$EM6(t1.v2(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.v0(), t2V0);
			case 1 -> MathUtils.equals$EM6(t1.v1(), t2V1);
			case 2 -> MathUtils.equals$EM6(t1.v2(), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equals$EM6(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equals$EM6(t1.getAt(2), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equals$EM6(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equals$EM6(t1.getAt(2), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equals$EM6(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equals$EM6(t1.getAt(2), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.getAt(0), value);
			case 1 -> MathUtils.equals$EM6(t1.getAt(1), value);
			case 2 -> MathUtils.equals$EM6(t1.getAt(2), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1.getAt(0), t2V0);
			case 1 -> MathUtils.equals$EM6(t1.getAt(1), t2V1);
			case 2 -> MathUtils.equals$EM6(t1.getAt(2), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1[0], t2.v0());
			case 1 -> MathUtils.equals$EM6(t1[1], t2.v1());
			case 2 -> MathUtils.equals$EM6(t1[2], t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equals$EM6(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equals$EM6(t1[2], t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1[0], t2[0]);
			case 1 -> MathUtils.equals$EM6(t1[1], t2[1]);
			case 2 -> MathUtils.equals$EM6(t1[2], t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1[0], value);
			case 1 -> MathUtils.equals$EM6(t1[1], value);
			case 2 -> MathUtils.equals$EM6(t1[2], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1[0], t2V0);
			case 1 -> MathUtils.equals$EM6(t1[1], t2V1);
			case 2 -> MathUtils.equals$EM6(t1[2], t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1V0, t2.v0());
			case 1 -> MathUtils.equals$EM6(t1V1, t2.v1());
			case 2 -> MathUtils.equals$EM6(t1V2, t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1V0, t2.getAt(0));
			case 1 -> MathUtils.equals$EM6(t1V1, t2.getAt(1));
			case 2 -> MathUtils.equals$EM6(t1V2, t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1V0, t2[0]);
			case 1 -> MathUtils.equals$EM6(t1V1, t2[1]);
			case 2 -> MathUtils.equals$EM6(t1V2, t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1V0, value);
			case 1 -> MathUtils.equals$EM6(t1V1, value);
			case 2 -> MathUtils.equals$EM6(t1V2, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM6(int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> MathUtils.equals$EM6(t1V0, t2V0);
			case 1 -> MathUtils.equals$EM6(t1V1, t2V1);
			case 2 -> MathUtils.equals$EM6(t1V2, t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt$EM8(int index, @AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.v0(), t2.v0());
			case 1 -> MathUtils.equals$EM8(t1.v1(), t2.v1());
			case 2 -> MathUtils.equals$EM8(t1.v2(), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.v0(), t2.getAt(0));
			case 1 -> MathUtils.equals$EM8(t1.v1(), t2.getAt(1));
			case 2 -> MathUtils.equals$EM8(t1.v2(), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.v0(), t2[0]);
			case 1 -> MathUtils.equals$EM8(t1.v1(), t2[1]);
			case 2 -> MathUtils.equals$EM8(t1.v2(), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.v0(), value);
			case 1 -> MathUtils.equals$EM8(t1.v1(), value);
			case 2 -> MathUtils.equals$EM8(t1.v2(), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITup3RF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.v0(), t2V0);
			case 1 -> MathUtils.equals$EM8(t1.v1(), t2V1);
			case 2 -> MathUtils.equals$EM8(t1.v2(), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.getAt(0), t2.v0());
			case 1 -> MathUtils.equals$EM8(t1.getAt(1), t2.v1());
			case 2 -> MathUtils.equals$EM8(t1.getAt(2), t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.getAt(0), t2.getAt(0));
			case 1 -> MathUtils.equals$EM8(t1.getAt(1), t2.getAt(1));
			case 2 -> MathUtils.equals$EM8(t1.getAt(2), t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.getAt(0), t2[0]);
			case 1 -> MathUtils.equals$EM8(t1.getAt(1), t2[1]);
			case 2 -> MathUtils.equals$EM8(t1.getAt(2), t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.getAt(0), value);
			case 1 -> MathUtils.equals$EM8(t1.getAt(1), value);
			case 2 -> MathUtils.equals$EM8(t1.getAt(2), value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull ITupRF t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1.getAt(0), t2V0);
			case 1 -> MathUtils.equals$EM8(t1.getAt(1), t2V1);
			case 2 -> MathUtils.equals$EM8(t1.getAt(2), t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1[0], t2.v0());
			case 1 -> MathUtils.equals$EM8(t1[1], t2.v1());
			case 2 -> MathUtils.equals$EM8(t1[2], t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1[0], t2.getAt(0));
			case 1 -> MathUtils.equals$EM8(t1[1], t2.getAt(1));
			case 2 -> MathUtils.equals$EM8(t1[2], t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1[0], t2[0]);
			case 1 -> MathUtils.equals$EM8(t1[1], t2[1]);
			case 2 -> MathUtils.equals$EM8(t1[2], t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1[0], value);
			case 1 -> MathUtils.equals$EM8(t1[1], value);
			case 2 -> MathUtils.equals$EM8(t1[2], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, @AllowNull float[] t1, float t2V0, float t2V1, float t2V2)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1[0], t2V0);
			case 1 -> MathUtils.equals$EM8(t1[1], t2V1);
			case 2 -> MathUtils.equals$EM8(t1[2], t2V2);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITup3RF t2)
	{
		if (t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1V0, t2.v0());
			case 1 -> MathUtils.equals$EM8(t1V1, t2.v1());
			case 2 -> MathUtils.equals$EM8(t1V2, t2.v2());
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, float t1V0, float t1V1, float t1V2, @AllowNull ITupRF t2)
	{
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1V0, t2.getAt(0));
			case 1 -> MathUtils.equals$EM8(t1V1, t2.getAt(1));
			case 2 -> MathUtils.equals$EM8(t1V2, t2.getAt(2));
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, float t1V0, float t1V1, float t1V2, @AllowNull float[] t2)
	{
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1V0, t2[0]);
			case 1 -> MathUtils.equals$EM8(t1V1, t2[1]);
			case 2 -> MathUtils.equals$EM8(t1V2, t2[2]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, float t1V0, float t1V1, float t1V2, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1V0, value);
			case 1 -> MathUtils.equals$EM8(t1V1, value);
			case 2 -> MathUtils.equals$EM8(t1V2, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt$EM8(int index, float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return switch (index) {
			case 0 -> MathUtils.equals$EM8(t1V0, t2V0);
			case 1 -> MathUtils.equals$EM8(t1V1, t2V1);
			case 2 -> MathUtils.equals$EM8(t1V2, t2V2);
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

	public static boolean equalsAtV0$EM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM4(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0$EM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0$EM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0$EM4(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM4(t1.v0(), value);
	}

	public static boolean equalsAtV0$EM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0$EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0$EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0$EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(0), value);
	}

	public static boolean equalsAtV0$EM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM4(t1[0], t2.v0());
	}

	public static boolean equalsAtV0$EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV0$EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1[0], t2[0]);
	}

	public static boolean equalsAtV0$EM4(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM4(t1[0], value);
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM4(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM4(t1.v1(), value);
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1$EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(1), value);
	}

	public static boolean equalsAtV1$EM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM4(t1[1], t2.v1());
	}

	public static boolean equalsAtV1$EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV1$EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1[1], t2[1]);
	}

	public static boolean equalsAtV1$EM4(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM4(t1[1], value);
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM4(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM4(t1.v2(), value);
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2$EM4(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM4(t1.getAt(2), value);
	}

	public static boolean equalsAtV2$EM4(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM4(t1[2], t2.v2());
	}

	public static boolean equalsAtV2$EM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM4(t1[2], t2.getAt(2));
	}

	public static boolean equalsAtV2$EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM4(t1[2], t2[2]);
	}

	public static boolean equalsAtV2$EM4(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM4(t1[2], value);
	}
	
	public static boolean equalsAtV0$EM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM6(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0$EM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0$EM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0$EM6(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM6(t1.v0(), value);
	}

	public static boolean equalsAtV0$EM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0$EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0$EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0$EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(0), value);
	}

	public static boolean equalsAtV0$EM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM6(t1[0], t2.v0());
	}

	public static boolean equalsAtV0$EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV0$EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1[0], t2[0]);
	}

	public static boolean equalsAtV0$EM6(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM6(t1[0], value);
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM6(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM6(t1.v1(), value);
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1$EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(1), value);
	}

	public static boolean equalsAtV1$EM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM6(t1[1], t2.v1());
	}

	public static boolean equalsAtV1$EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV1$EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1[1], t2[1]);
	}

	public static boolean equalsAtV1$EM6(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM6(t1[1], value);
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM6(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM6(t1.v2(), value);
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2$EM6(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM6(t1.getAt(2), value);
	}

	public static boolean equalsAtV2$EM6(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM6(t1[2], t2.v2());
	}

	public static boolean equalsAtV2$EM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM6(t1[2], t2.getAt(2));
	}

	public static boolean equalsAtV2$EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM6(t1[2], t2[2]);
	}

	public static boolean equalsAtV2$EM6(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM6(t1[2], value);
	}
	
	public static boolean equalsAtV0$EM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM8(t1.v0(), t2.v0());
	}

	public static boolean equalsAtV0$EM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1.v0(), t2.getAt(0));
	}

	public static boolean equalsAtV0$EM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1.v0(), t2[0]);
	}

	public static boolean equalsAtV0$EM8(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM8(t1.v0(), value);
	}

	public static boolean equalsAtV0$EM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(0), t2.v0());
	}

	public static boolean equalsAtV0$EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(0), t2.getAt(0));
	}

	public static boolean equalsAtV0$EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(0), t2[0]);
	}

	public static boolean equalsAtV0$EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(0), value);
	}

	public static boolean equalsAtV0$EM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM8(t1[0], t2.v0());
	}

	public static boolean equalsAtV0$EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1[0], t2.getAt(0));
	}

	public static boolean equalsAtV0$EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1[0], t2[0]);
	}

	public static boolean equalsAtV0$EM8(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM8(t1[0], value);
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM8(t1.v1(), t2.v1());
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1.v1(), t2.getAt(1));
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1.v1(), t2[1]);
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM8(t1.v1(), value);
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(1), t2.v1());
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(1), t2.getAt(1));
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(1), t2[1]);
	}

	public static boolean equalsAtV1$EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(1), value);
	}

	public static boolean equalsAtV1$EM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM8(t1[1], t2.v1());
	}

	public static boolean equalsAtV1$EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1[1], t2.getAt(1));
	}

	public static boolean equalsAtV1$EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1[1], t2[1]);
	}

	public static boolean equalsAtV1$EM8(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM8(t1[1], value);
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITup3RF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		return MathUtils.equals$EM8(t1.v2(), t2.v2());
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITup3RF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1.v2(), t2.getAt(2));
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITup3RF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1.v2(), t2[2]);
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITup3RF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals$EM8(t1.v2(), value);
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITupRF t1, @AllowNull ITup3RF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(2), t2.v2());
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(2), t2.getAt(2));
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.size() != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(2), t2[2]);
	}

	public static boolean equalsAtV2$EM8(@AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;
		if (t1.size() != 3) return false;

		return MathUtils.equals$EM8(t1.getAt(2), value);
	}

	public static boolean equalsAtV2$EM8(@AllowNull float[] t1, @AllowNull ITup3RF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM8(t1[2], t2.v2());
	}

	public static boolean equalsAtV2$EM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.size() != 3) return false;

		return MathUtils.equals$EM8(t1[2], t2.getAt(2));
	}

	public static boolean equalsAtV2$EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		if (t1.length != 3) return false;
		if (t2.length != 3) return false;

		return MathUtils.equals$EM8(t1[2], t2[2]);
	}

	public static boolean equalsAtV2$EM8(@AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;
		if (t1.length != 3) return false;

		return MathUtils.equals$EM8(t1[2], value);
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
		return isFinite(t.v0(), t.v1(), t.v2());
	}

	public static boolean isFinite(ITupRF t)
	{
		return isFinite(t.getAt(0), t.getAt(1), t.getAt(2));
	}

	public static boolean isFinite(float[] t)
	{
		return isFinite(t[0], t[1], t[2]);
	}

	public static boolean isFinite(float tV0, float tV1, float tV2)
	{
		return Float.isFinite(tV0) && Float.isFinite(tV1) && Float.isFinite(tV2);
	}

	public static boolean isFiniteAt(int index, ITup3RF t)
	{
		return isFiniteAt(index, t.v0(), t.v1(), t.v2());
	}

	public static boolean isFiniteAt(int index, ITupRF t)
	{
		return isFiniteAt(index, t.getAt(0), t.getAt(1), t.getAt(2));
	}

	public static boolean isFiniteAt(int index, float[] t)
	{
		return isFiniteAt(index, t[0], t[1], t[2]);
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
		return isZero(t.v0(), t.v1(), t.v2());
	}

	public static boolean isZero(ITupRF t)
	{
		return isZero(t.getAt(0), t.getAt(1), t.getAt(2));
	}

	public static boolean isZero(float[] t)
	{
		return isZero(t[0], t[1], t[2]);
	}

	public static boolean isZero(float tV0, float tV1, float tV2)
	{
		return tV0 == 0.0f && tV1 == 0.0f && tV1 == 0.0f;
	}

	public static boolean isZero$EM4(ITup3RF t)
	{
		return isZero$EM4(t.v0(), t.v1(), t.v2());
	}

	public static boolean isZero$EM4(ITupRF t)
	{
		return isZero$EM4(t.getAt(0), t.getAt(1), t.getAt(2));
	}

	public static boolean isZero$EM4(float[] t)
	{
		return isZero$EM4(t[0], t[1], t[2]);
	}

	public static boolean isZero$EM4(float tV0, float tV1, float tV2)
	{
		return MathUtils.isZero$EM4(tV0) && MathUtils.isZero$EM4(tV1) && MathUtils.isZero$EM4(tV2);
	}
	
	public static boolean isZero$EM6(ITup3RF t)
	{
		return isZero$EM6(t.v0(), t.v1(), t.v2());
	}

	public static boolean isZero$EM6(ITupRF t)
	{
		return isZero$EM6(t.getAt(0), t.getAt(1), t.getAt(2));
	}

	public static boolean isZero$EM6(float[] t)
	{
		return isZero$EM6(t[0], t[1], t[2]);
	}

	public static boolean isZero$EM6(float tV0, float tV1, float tV2)
	{
		return MathUtils.isZero$EM6(tV0) && MathUtils.isZero$EM6(tV1) && MathUtils.isZero$EM6(tV2);
	}
	
	public static boolean isZero$EM8(ITup3RF t)
	{
		return isZero$EM8(t.v0(), t.v1(), t.v2());
	}

	public static boolean isZero$EM8(ITupRF t)
	{
		return isZero$EM8(t.getAt(0), t.getAt(1), t.getAt(2));
	}

	public static boolean isZero$EM8(float[] t)
	{
		return isZero$EM8(t[0], t[1], t[2]);
	}

	public static boolean isZero$EM8(float tV0, float tV1, float tV2)
	{
		return MathUtils.isZero$EM8(tV0) && MathUtils.isZero$EM8(tV1) && MathUtils.isZero$EM8(tV2);
	}
	
	public static boolean isZero(float tolerance, ITup3RF t)
	{
		return isZero(tolerance, t.v0(), t.v1(), t.v2());
	}

	public static boolean isZero(float tolerance, ITupRF t)
	{
		return isZero(tolerance, t.getAt(0), t.getAt(1), t.getAt(2));
	}

	public static boolean isZero(float tolerance, float[] t)
	{
		return isZero(tolerance, t[0], t[1], t[2]);
	}

	public static boolean isZero(float tolerance, float tV0, float tV1, float tV2)
	{
		return MathUtils.isZero(tolerance, tV0) && MathUtils.isZero(tolerance, tV1) && MathUtils.isZero(tolerance, tV2);
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

	public static boolean isZeroAtV0$EM4(ITup3RF t)
	{
		return MathUtils.isZero$EM4(t.v0());
	}

	public static boolean isZeroAtV0$EM4(ITupRF t)
	{
		return MathUtils.isZero$EM4(t.getAt(0));
	}

	public static boolean isZeroAtV0$EM4(float[] t)
	{
		return MathUtils.isZero$EM4(t[0]);
	}

	public static boolean isZeroAtV1$EM4(ITup3RF t)
	{
		return MathUtils.isZero$EM4(t.v1());
	}

	public static boolean isZeroAtV1$EM4(ITupRF t)
	{
		return MathUtils.isZero$EM4(t.getAt(1));
	}

	public static boolean isZeroAtV1$EM4(float[] t)
	{
		return MathUtils.isZero$EM4(t[1]);
	}

	public static boolean isZeroAtV2$EM4(ITup3RF t)
	{
		return MathUtils.isZero$EM4(t.v2());
	}

	public static boolean isZeroAtV2$EM4(ITupRF t)
	{
		return MathUtils.isZero$EM4(t.getAt(2));
	}

	public static boolean isZeroAtV2$EM4(float[] t)
	{
		return MathUtils.isZero$EM4(t[2]);
	}
	
	public static boolean isZeroAtV0$EM6(ITup3RF t)
	{
		return MathUtils.isZero$EM6(t.v0());
	}

	public static boolean isZeroAtV0$EM6(ITupRF t)
	{
		return MathUtils.isZero$EM6(t.getAt(0));
	}

	public static boolean isZeroAtV0$EM6(float[] t)
	{
		return MathUtils.isZero$EM6(t[0]);
	}

	public static boolean isZeroAtV1$EM6(ITup3RF t)
	{
		return MathUtils.isZero$EM6(t.v1());
	}

	public static boolean isZeroAtV1$EM6(ITupRF t)
	{
		return MathUtils.isZero$EM6(t.getAt(1));
	}

	public static boolean isZeroAtV1$EM6(float[] t)
	{
		return MathUtils.isZero$EM6(t[1]);
	}

	public static boolean isZeroAtV2$EM6(ITup3RF t)
	{
		return MathUtils.isZero$EM6(t.v2());
	}

	public static boolean isZeroAtV2$EM6(ITupRF t)
	{
		return MathUtils.isZero$EM6(t.getAt(2));
	}

	public static boolean isZeroAtV2$EM6(float[] t)
	{
		return MathUtils.isZero$EM6(t[2]);
	}
	
	public static boolean isZeroAtV0$EM8(ITup3RF t)
	{
		return MathUtils.isZero$EM8(t.v0());
	}

	public static boolean isZeroAtV0$EM8(ITupRF t)
	{
		return MathUtils.isZero$EM8(t.getAt(0));
	}

	public static boolean isZeroAtV0$EM8(float[] t)
	{
		return MathUtils.isZero$EM8(t[0]);
	}

	public static boolean isZeroAtV1$EM8(ITup3RF t)
	{
		return MathUtils.isZero$EM8(t.v1());
	}

	public static boolean isZeroAtV1$EM8(ITupRF t)
	{
		return MathUtils.isZero$EM8(t.getAt(1));
	}

	public static boolean isZeroAtV1$EM8(float[] t)
	{
		return MathUtils.isZero$EM8(t[1]);
	}

	public static boolean isZeroAtV2$EM8(ITup3RF t)
	{
		return MathUtils.isZero$EM8(t.v2());
	}

	public static boolean isZeroAtV2$EM8(ITupRF t)
	{
		return MathUtils.isZero$EM8(t.getAt(2));
	}

	public static boolean isZeroAtV2$EM8(float[] t)
	{
		return MathUtils.isZero$EM8(t[2]);
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
