package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class CompareOps2F
{
	public static boolean tup_equals_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(t1[0] != t2[0]) return false;
		if(t1[1] != t2[1]) return false;
		
		return true;
	}

	public static boolean tup_equals_2f(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;
		
		if(t1[0] != t2V0) return false;
		if(t1[1] != t2V1) return false;
		
		return true;
	}

	public static boolean tup_equals_2f(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;
		
		if(t1V0 != t2[0]) return false;
		if(t1V1 != t2[1]) return false;
		
		return true;
	}

	public static boolean tup_equals_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(t1V0 != t2V0) return false;
		if(t1V1 != t2V1) return false;
		
		return true;
	}

	public static boolean tup_equalsEM_2f(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM(tolerance, t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM(tolerance, t1[1], t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM_2f(float tolerance, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM(tolerance, t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM(tolerance, t1[1], t2V1)) return false;

		return true;
	}

	public static boolean tup_equalsEM_2f(float tolerance, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM(tolerance, t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM(tolerance, t1V1, t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM_2f(float tolerance, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM(tolerance, t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM(tolerance, t1V1, t2V1)) return false;

		return true;
	}
	
	public static boolean tup_equalsEM4_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM4(t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM4(t1[1], t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM4_2f(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM4(t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM4(t1[1], t2V1)) return false;

		return true;
	}

	public static boolean tup_equalsEM4_2f(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM4(t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM4(t1V1, t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM4_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM4(t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM4(t1V1, t2V1)) return false;

		return true;
	}
	
	public static boolean tup_equalsEM6_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM6(t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM6(t1[1], t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM6_2f(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM6(t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM6(t1[1], t2V1)) return false;

		return true;
	}

	public static boolean tup_equalsEM6_2f(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM6(t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM6(t1V1, t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM6_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM6(t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM6(t1V1, t2V1)) return false;

		return true;
	}
	
	public static boolean tup_equalsEM8_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		if(!MathUtils.equalsEM8(t1[0], t2[0])) return false;
		if(!MathUtils.equalsEM8(t1[1], t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM8_2f(@AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		if(!MathUtils.equalsEM8(t1[0], t2V0)) return false;
		if(!MathUtils.equalsEM8(t1[1], t2V1)) return false;

		return true;
	}

	public static boolean tup_equalsEM8_2f(float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		if(!MathUtils.equalsEM8(t1V0, t2[0])) return false;
		if(!MathUtils.equalsEM8(t1V1, t2[1])) return false;

		return true;
	}

	public static boolean tup_equalsEM8_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		if(!MathUtils.equalsEM8(t1V0, t2V0)) return false;
		if(!MathUtils.equalsEM8(t1V1, t2V1)) return false;

		return true;
	}
	
	public static boolean tup_equalsAt_2f(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2[0];
			case 1 -> t1[1] == t2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAt_2f(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == value;
			case 1 -> t1[1] == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAt_2f(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> t1[0] == t2V0;
			case 1 -> t1[1] == t2V1;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAt_2f(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> t1V0 == t2[0];
			case 1 -> t1V1 == t2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAt_2f(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> t1V0 == value;
			case 1 -> t1V1 == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAt_2f(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> t1V0 == t2V0;
			case 1 -> t1V1 == t2V1;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM_2f(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM_2f(float tolerance, int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], value);
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM_2f(float tolerance, int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1[0], t2V0);
			case 1 -> MathUtils.equalsEM(tolerance, t1[1], t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM_2f(float tolerance, int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM(tolerance, t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM_2f(float tolerance, int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1V0, value);
			case 1 -> MathUtils.equalsEM(tolerance, t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM_2f(float tolerance, int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM(tolerance, t1V0, t2V0);
			case 1 -> MathUtils.equalsEM(tolerance, t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean tup_equalsAtEM4_2f(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM4(t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM4_2f(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], value);
			case 1 -> MathUtils.equalsEM4(t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM4_2f(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM4(t1[1], t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM4_2f(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM4(t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM4_2f(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, value);
			case 1 -> MathUtils.equalsEM4(t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM4_2f(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM4(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM4(t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean tup_equalsAtEM6_2f(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM6(t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM6_2f(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], value);
			case 1 -> MathUtils.equalsEM6(t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM6_2f(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM6(t1[1], t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM6_2f(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM6(t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM6_2f(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, value);
			case 1 -> MathUtils.equalsEM6(t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM6_2f(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM6(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM6(t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean tup_equalsAtEM8_2f(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2[0]);
			case 1 -> MathUtils.equalsEM8(t1[1], t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM8_2f(int index, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], value);
			case 1 -> MathUtils.equalsEM8(t1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM8_2f(int index, @AllowNull float[] t1, float t2V0, float t2V1)
	{
		if(t1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1[0], t2V0);
			case 1 -> MathUtils.equalsEM8(t1[1], t2V1);
			default ->throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM8_2f(int index, float t1V0, float t1V1, @AllowNull float[] t2)
	{
		if(t2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2[0]);
			case 1 -> MathUtils.equalsEM8(t1V1, t2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM8_2f(int index, float t1V0, float t1V1, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, value);
			case 1 -> MathUtils.equalsEM8(t1V1, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_equalsAtEM8_2f(int index, float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEM8(t1V0, t2V0);
			case 1 -> MathUtils.equalsEM8(t1V1, t2V1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	
	public static boolean tup_equalsAtV0_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return t1[0] == t2[0];
	}

	public static boolean tup_equalsAtV0_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return t1[0] == value;
	}
	
	public static boolean tup_equalsAtV0EM_2f(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], t2[0]);
	}

	public static boolean tup_equalsAtV0EM_2f(float tolerance, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[0], value);
	}
	
	public static boolean tup_equalsAtV0EM4_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[0], t2[0]);
	}

	public static boolean tup_equalsAtV0EM4_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM4(t1[0], value);
	}
	
	public static boolean tup_equalsAtV0EM6_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[0], t2[0]);
	}

	public static boolean tup_equalsAtV0EM6_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM6(t1[0], value);
	}
	
	public static boolean tup_equalsAtV0EM8_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[0], t2[0]);
	}

	public static boolean tup_equalsAtV0EM8_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;
		
		return MathUtils.equalsEM8(t1[0], value);
	}
	
	public static boolean tup_equalsAtV1_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return t1[1] == t2[1];
	}

	public static boolean tup_equalsAtV1_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return t1[1] == value;
	}
	
	public static boolean tup_equalsAtV1EM_2f(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], t2[1]);
	}

	public static boolean tup_equalsAtV1EM_2f(float tolerance, @AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[1], value);
	}
	
	public static boolean tup_equalsAtV1EM4_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM4(t1[1], t2[1]);
	}

	public static boolean tup_equalsAtV1EM4_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM4(t1[1], value);
	}

	public static boolean tup_equalsAtV1EM6_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM6(t1[1], t2[1]);
	}

	public static boolean tup_equalsAtV1EM6_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM6(t1[1], value);
	}

	public static boolean tup_equalsAtV1EM8_2f(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if(t1 == t2) return true;
		if(t1 == null || t2 == null) return false;

		return MathUtils.equalsEM8(t1[1], t2[1]);
	}

	public static boolean tup_equalsAtV1EM8_2f(@AllowNull float[] t1, float value)
	{
		if(t1 == null) return false;

		return MathUtils.equalsEM8(t1[1], value);
	}
	
	public static boolean tup_isFinite_2f(float[] t)
	{
		return
				Float.isFinite(t[0]) &&
				Float.isFinite(t[1]);
	}

	public static boolean tup_isFinite_2f(float tV0, float tV1)
	{
		return
				Float.isFinite(tV0) &&
				Float.isFinite(tV1);
	}

	public static boolean tup_isFiniteAt_2f(int index, float[] t)
	{
		return switch (index) {
			case 0 -> Float.isFinite(t[0]);
			case 1 -> Float.isFinite(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isFiniteAt_2f(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> Float.isFinite(tV0);
			case 1 -> Float.isFinite(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isFiniteAtV0_2f(float[] t)
	{
		return Float.isFinite(t[0]);
	}

	public static boolean tup_isFiniteAtV1_2f(float[] t)
	{
		return Float.isFinite(t[1]);
	}

	public static boolean tup_isInfinite_2f(float[] t)
	{
		return
				Float.isInfinite(t[0]) &&
				Float.isInfinite(t[1]);
	}

	public static boolean tup_isInfinite_2f(float tV0, float tV1)
	{
		return
				Float.isInfinite(tV0) &&
				Float.isInfinite(tV1);
	}

	public static boolean tup_isInfiniteAt_2f(int index, float[] t)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(t[0]);
			case 1 -> Float.isInfinite(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isInfiniteAt_2f(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(tV0);
			case 1 -> Float.isInfinite(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isInfiniteAtV0_2f(float[] t)
	{
		return Float.isInfinite(t[0]);
	}

	public static boolean tup_isInfiniteAtV1_2f(float[] t)
	{
		return Float.isInfinite(t[1]);
	}
	
	public static boolean tup_isNaN_2f(float[] t)
	{
		return
				Float.isNaN(t[0]) &&
				Float.isNaN(t[1]);
	}

	public static boolean tup_isNaN_2f(float tV0, float tV1)
	{
		return
				Float.isNaN(tV0) &&
				Float.isNaN(tV1);
	}

	public static boolean tup_isNaNAt_2f(int index, float[] t)
	{
		return switch (index) {
			case 0 -> Float.isNaN(t[0]);
			case 1 -> Float.isNaN(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isNaNAt_2f(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> Float.isNaN(tV0);
			case 1 -> Float.isNaN(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isNaNAtV0_2f(float[] t)
	{
		return Float.isNaN(t[0]);
	}

	public static boolean tup_isNaNAtV1_2f(float[] t)
	{
		return Float.isNaN(t[1]);
	}
	
	public static boolean tup_isZero_2f(float[] t)
	{
		return
				t[0] == 0.0f &&
				t[1] == 0.0f;
	}

	public static boolean tup_isZero_2f(float tV0, float tV1)
	{
		return
				tV0 == 0.0f &&
				tV1 == 0.0f;
	}

	public static boolean tup_isZeroEM_2f(float tolerance, float[] t)
	{
		return
				MathUtils.isZeroEM(tolerance, t[0]) &&
				MathUtils.isZeroEM(tolerance, t[1]);
	}

	public static boolean tup_isZeroEM_2f(float tolerance, float tV0, float tV1)
	{
		return
				MathUtils.isZeroEM(tolerance, tV0) &&
				MathUtils.isZeroEM(tolerance, tV1);
	}
	
	public static boolean tup_isZeroEM4_2f(float[] t)
	{
		return
				MathUtils.isZeroEM4(t[0]) &&
				MathUtils.isZeroEM4(t[1]);
	}

	public static boolean tup_isZeroEM4_2f(float tV0, float tV1)
	{
		return
				MathUtils.isZeroEM4(tV0) &&
				MathUtils.isZeroEM4(tV1);
	}
	
	public static boolean tup_isZeroEM6_2f(float[] t)
	{
		return
				MathUtils.isZeroEM6(t[0]) &&
				MathUtils.isZeroEM6(t[1]);
	}

	public static boolean tup_isZeroEM6_2f(float tV0, float tV1)
	{
		return
				MathUtils.isZeroEM6(tV0) &&
				MathUtils.isZeroEM6(tV1);
	}
	
	public static boolean tup_isZeroEM8_2f(float[] t)
	{
		return
				MathUtils.isZeroEM8(t[0]) &&
				MathUtils.isZeroEM8(t[1]);
	}

	public static boolean tup_isZeroEM8_2f(float tV0, float tV1)
	{
		return
				MathUtils.isZeroEM8(tV0) &&
				MathUtils.isZeroEM8(tV1);
	}
	
	public static boolean tup_isZeroAt_2f(int index, float[] t)
	{
		return switch (index) {
			case 0 -> t[0] == 0.0f;
			case 1 -> t[1] == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isZeroAt_2f(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> tV0 == 0.0f;
			case 1 -> tV1 == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isZeroAtEM_2f(float tolerance, int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, t[0]);
			case 1 -> MathUtils.isZeroEM(tolerance, t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isZeroAtEM_2f(float tolerance, int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM(tolerance, tV0);
			case 1 -> MathUtils.isZeroEM(tolerance, tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean tup_isZeroAtEM4_2f(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(t[0]);
			case 1 -> MathUtils.isZeroEM4(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isZeroAtEM4_2f(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM4(tV0);
			case 1 -> MathUtils.isZeroEM4(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean tup_isZeroAtEM6_2f(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(t[0]);
			case 1 -> MathUtils.isZeroEM6(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isZeroAtEM6_2f(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM6(tV0);
			case 1 -> MathUtils.isZeroEM6(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean tup_isZeroAtEM8_2f(int index, float[] t)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(t[0]);
			case 1 -> MathUtils.isZeroEM8(t[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}

	public static boolean tup_isZeroAtEM8_2f(int index, float tV0, float tV1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEM8(tV0);
			case 1 -> MathUtils.isZeroEM8(tV1);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean tup_isZeroAtV0_2f(float[] t)
	{
		return t[0] == 0.0f;
	}
	
	public static boolean tup_isZeroAtV0EM_2f(float tolerance, float[] t)
	{
		return MathUtils.isZeroEM(tolerance, t[0]);
	}
	
	public static boolean tup_isZeroAtV0EM4_2f(float[] t)
	{
		return MathUtils.isZeroEM4(t[0]);
	}

	public static boolean tup_isZeroAtV0EM6_2f(float[] t)
	{
		return MathUtils.isZeroEM6(t[0]);
	}

	public static boolean tup_isZeroAtV0EM8_2f(float[] t)
	{
		return MathUtils.isZeroEM8(t[0]);
	}
	
	public static boolean tup_isZeroAtV1_2f(float[] t)
	{
		return t[1] == 0.0f;
	}
	
	public static boolean tup_isZeroAtV1EM_2f(float tolerance, float[] t)
	{
		return MathUtils.isZeroEM(tolerance, t[1]);
	}
	
	public static boolean tup_isZeroAtV1EM4_2f(float[] t)
	{
		return MathUtils.isZeroEM4(t[1]);
	}

	public static boolean tup_isZeroAtV1EM6_2f(float[] t)
	{
		return MathUtils.isZeroEM6(t[1]);
	}
	
	public static boolean tup_isZeroAtV1EM8_2f(float[] t)
	{
		return MathUtils.isZeroEM8(t[1]);
	}
}
