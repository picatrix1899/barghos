package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class RawTupUtils2F
{
	public static boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(t1[0] != t2[0]) return false;
		if(t1[1] != t2[1]) return false;
		
		return true;
	}

	public static boolean equals(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;
		
		if(t1[0] != t2V0) return false;
		if(t1[1] != t2V1) return false;
		
		return true;
	}

	public static boolean equals(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;
		
		if(t1V0 != t2[0]) return false;
		if(t1V1 != t2[1]) return false;
		
		return true;
	}

	public static boolean equals(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(t1V0 != t2V0) return false;
		if(t1V1 != t2V1) return false;
		
		return true;
	}

	public static boolean equalsAligned(int t1Offset, @AllowNull float[] t1, int t2Offset, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;
		
		if(t1[t1Offset] != t2[t2Offset]) return false;
		if(t1[t1Offset + 1] != t2[t2Offset + 1]) return false;
		
		return true;
	}

	public static boolean equalsAligned(int t1Offset, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(t1[t1Offset + 0] != t2V0) return false;
		if(t1[t1Offset + 1] != t2V1) return false;

		return true;
	}

	public static boolean equalsAligned(float t1V0, float t1V1, int t2Offset, @AllowNull float[] t2)
	{
		if(t2 == null) return false;
		
		if(t1V0 != t2[t2Offset + 0]) return false;
		if(t1V1 != t2[t2Offset + 1]) return false;

		return true;
	}
	
	public static boolean equalsEM(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM(tolerance, t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM(tolerance, t1[1], t2[1])) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM(tolerance, t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM(tolerance, t1[1], t2V1)) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM(tolerance, t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM(tolerance, t1V1, t2[1])) return false;

		return true;
	}

	public static boolean equalsEM(float tolerance, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM(tolerance, t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM(tolerance, t1V1, t2V1)) return false;

		return true;
	}
	
	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM4(t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM4(t1[1], t2[1])) return false;

		return true;
	}

	public static boolean equalsEM4(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM4(t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM4(t1[1], t2V1)) return false;

		return true;
	}

	public static boolean equalsEM4(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM4(t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM4(t1V1, t2[1])) return false;

		return true;
	}

	public static boolean equalsEM4(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM4(t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM4(t1V1, t2V1)) return false;

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM6(t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM6(t1[1], t2[1])) return false;

		return true;
	}

	public static boolean equalsEM6(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM6(t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM6(t1[1], t2V1)) return false;

		return true;
	}

	public static boolean equalsEM6(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM6(t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM6(t1V1, t2[1])) return false;

		return true;
	}

	public static boolean equalsEM6(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM6(t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM6(t1V1, t2V1)) return false;

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM8(t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM8(t1[1], t2[1])) return false;

		return true;
	}

	public static boolean equalsEM8(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM8(t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM8(t1[1], t2V1)) return false;

		return true;
	}

	public static boolean equalsEM8(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM8(t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM8(t1V1, t2[1])) return false;

		return true;
	}

	public static boolean equalsEM8(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM8(t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM8(t1V1, t2V1)) return false;

		return true;
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2[0];
			case 1 -> t1[1] == t2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == value;
			case 1 -> t1[1] == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2V0;
			case 1 -> t1[1] == t2V1;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> t1V0 == t2[0];
			case 1 -> t1V1 == t2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> t1V0 == value;
			case 1 -> t1V1 == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAt(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> t1V0 == t2V0;
			case 1 -> t1V1 == t2V1;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], value);
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2V0);
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1V0, value);
			case 1 -> MathUtils.equalsEM(tolerance, t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM(float tolerance, int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1V0, t2V0);
			case 1 -> MathUtils.equalsEM(tolerance, t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM4(t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], value);
			case 1 -> MathUtils.equalsEM4(t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM4(t1[1], t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM4(t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, value);
			case 1 -> MathUtils.equalsEM4(t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM4(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM4(t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM6(t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], value);
			case 1 -> MathUtils.equalsEM6(t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM6(t1[1], t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM6(t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, value);
			case 1 -> MathUtils.equalsEM6(t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM6(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM6(t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM8(t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], value);
			case 1 -> MathUtils.equalsEM8(t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM8(t1[1], t2V1);
			default ->throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM8(t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, value);
			case 1 -> MathUtils.equalsEM8(t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtEM8(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM8(t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return t1[0] == t2[0];
	}

	public static boolean equalsAtV0(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return t1[0] == value;
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], t2[0]);
	}

	public static boolean equalsAtV0EM(float tolerance, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], value);
	}
	
	public static boolean equalsAtV0EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[0], t2[0]);
	}

	public static boolean equalsAtV0EM4(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM4(t1[0], value);
	}
	
	public static boolean equalsAtV0EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[0], t2[0]);
	}

	public static boolean equalsAtV0EM6(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM6(t1[0], value);
	}
	
	public static boolean equalsAtV0EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[0], t2[0]);
	}

	public static boolean equalsAtV0EM8(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;
		
		return MathUtils.equalsEM8(t1[0], value);
	}
	
	public static boolean equalsAtV1(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return t1[1] == t2[1];
	}

	public static boolean equalsAtV1(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return t1[1] == value;
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], t2[1]);
	}

	public static boolean equalsAtV1EM(float tolerance, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], value);
	}
	
	public static boolean equalsAtV1EM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[1], t2[1]);
	}

	public static boolean equalsAtV1EM4(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM4(t1[1], value);
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[1], t2[1]);
	}

	public static boolean equalsAtV1EM6(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM6(t1[1], value);
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[1], t2[1]);
	}

	public static boolean equalsAtV1EM8(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM8(t1[1], value);
	}
	
	public static boolean isFinite(float[] t)
	{
		return Float.isFinite(t[0]) && Float.isFinite(t[1]);
	}

	public static boolean isFinite(float tV0, float tV1)
	{
		return Float.isFinite(tV0) && Float.isFinite(tV1);
	}

	public static boolean isFiniteAt(int index, float[] t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t[0]);
			case 1 -> Float.isFinite(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isFiniteAt(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> Float.isFinite(tV0);
			case 1 -> Float.isFinite(tV1);
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

	public static boolean isInfinite(float[] t)
	{
		return Float.isInfinite(t[0]) && Float.isInfinite(t[1]);
	}

	public static boolean isInfinite(float tV0, float tV1)
	{
		return Float.isInfinite(tV0) && Float.isInfinite(tV1);
	}

	public static boolean isInfiniteAt(int index, float[] t)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(t[0]);
			case 1 -> Float.isInfinite(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isInfiniteAt(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(tV0);
			case 1 -> Float.isInfinite(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isInfiniteAtV0(float[] t)
	{
		return Float.isInfinite(t[0]);
	}

	public static boolean isInfiniteAtV1(float[] t)
	{
		return Float.isInfinite(t[1]);
	}
	
	public static boolean isNaN(float[] t)
	{
		return Float.isNaN(t[0]) && Float.isNaN(t[1]);
	}

	public static boolean isNaN(float tV0, float tV1)
	{
		return Float.isNaN(tV0) && Float.isNaN(tV1);
	}

	public static boolean isNaNAt(int index, float[] t)
	{
		return switch (index) {
			case 0 -> Float.isNaN(t[0]);
			case 1 -> Float.isNaN(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isNaNAt(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> Float.isNaN(tV0);
			case 1 -> Float.isNaN(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isNaNAtV0(float[] t)
	{
		return Float.isNaN(t[0]);
	}

	public static boolean isNaNAtV1(float[] t)
	{
		return Float.isNaN(t[1]);
	}
	
	public static boolean isZero(float[] t)
	{
		return t[0] == 0.0f && t[1] == 0.0f;
	}

	public static boolean isZero(float tV0, float tV1)
	{
		return tV0 == 0.0f && tV1 == 0.0f;
	}

	public static boolean isZeroEM(float tolerance, float[] t)
	{
		return MathUtils.isZeroEM(tolerance, t[0]) && MathUtils.isZeroEM(tolerance, t[1]);
	}

	public static boolean isZeroEM(float tolerance, float tV0, float tV1)
	{
		return MathUtils.isZeroEM(tolerance, tV0) && MathUtils.isZeroEM(tolerance, tV1);
	}
	
	public static boolean isZeroEM4(float[] t)
	{
		return MathUtils.isZeroEM4(t[0]) && MathUtils.isZeroEM4(t[1]);
	}

	public static boolean isZeroEM4(float tV0, float tV1)
	{
		return MathUtils.isZeroEM4(tV0) && MathUtils.isZeroEM4(tV1);
	}
	
	public static boolean isZeroEM6(float[] t)
	{
		return MathUtils.isZeroEM6(t[0]) && MathUtils.isZeroEM6(t[1]);
	}

	public static boolean isZeroEM6(float tV0, float tV1)
	{
		return MathUtils.isZeroEM6(tV0) && MathUtils.isZeroEM6(tV1);
	}
	
	public static boolean isZeroEM8(float[] t)
	{
		return MathUtils.isZeroEM8(t[0]) && MathUtils.isZeroEM8(t[1]);
	}

	public static boolean isZeroEM8(float tV0, float tV1)
	{
		return MathUtils.isZeroEM8(tV0) && MathUtils.isZeroEM8(tV1);
	}

	public static boolean isZeroAt(int index, float[] t)
	{
		return switch (index) {
			case 0 -> t[0] == 0.0f;
			case 1 -> t[1] == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAt(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> tV0 == 0.0f;
			case 1 -> tV1 == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM(float tolerance, int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, t[0]);
			case 1 -> MathUtils.isZeroEM(tolerance, t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM(float tolerance, int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, tV0);
			case 1 -> MathUtils.isZeroEM(tolerance, tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM4(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(t[0]);
			case 1 -> MathUtils.isZeroEM4(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM4(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(tV0);
			case 1 -> MathUtils.isZeroEM4(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM6(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(t[0]);
			case 1 -> MathUtils.isZeroEM6(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM6(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(tV0);
			case 1 -> MathUtils.isZeroEM6(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEM8(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(t[0]);
			case 1 -> MathUtils.isZeroEM8(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtEM8(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(tV0);
			case 1 -> MathUtils.isZeroEM8(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean isZeroAtV0(float[] t)
	{
		return t[0] == 0.0f;
	}

	public static boolean isZeroAtV0EM(float tolerance, float[] t)
	{
		return MathUtils.isZeroEM(tolerance, t[0]);
	}
	
	public static boolean isZeroAtV0EM4(float[] t)
	{
		return MathUtils.isZeroEM4(t[0]);
	}

	public static boolean isZeroAtV0EM6(float[] t)
	{
		return MathUtils.isZeroEM6(t[0]);
	}

	public static boolean isZeroAtV0EM8(float[] t)
	{
		return MathUtils.isZeroEM8(t[0]);
	}
	
	public static boolean isZeroAtV1(float[] t)
	{
		return t[1] == 0.0f;
	}
	
	public static boolean isZeroAtV1EM(float tolerance, float[] t)
	{
		return MathUtils.isZeroEM(tolerance, t[1]);
	}
	
	public static boolean isZeroAtV1EM4(float[] t)
	{
		return MathUtils.isZeroEM4(t[1]);
	}

	public static boolean isZeroAtV1EM6(float[] t)
	{
		return MathUtils.isZeroEM6(t[1]);
	}
	
	public static boolean isZeroAtV1EM8(float[] t)
	{
		return MathUtils.isZeroEM8(t[1]);
	}
	
}
