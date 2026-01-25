package org.barghos.math.vector.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.core.math.MathUtils;

public class CompareVecOps2F
{
	private CompareVecOps2F() { }
	
	public static boolean equals(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(v1[0] != v2[0]) return false;
		if(v1[1] != v2[1]) return false;
		
		return true;
	}
	
	public static boolean equals(@AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;
		
		if(v1[0] != v2X) return false;
		if(v1[1] != v2Y) return false;
		
		return true;
	}
	
	public static boolean equals(float v1X, float v1Y, float v2X, float v2Y)
	{
		if(v1X != v2X) return false;
		if(v1Y != v2Y) return false;
		
		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps(tolerance, v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps(tolerance, v1[1], v2[1])) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps(tolerance, v1[0], v2X)) return false;
		if(!MathUtils.equalsEps(tolerance, v1[1], v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, float v1X, float v1Y, float v2X, float v2Y)
	{
		if(!MathUtils.equalsEps(tolerance, v1X, v2X)) return false;
		if(!MathUtils.equalsEps(tolerance, v1Y, v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps4(v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps4(v1[1], v2[1])) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps4(v1[0], v2X)) return false;
		if(!MathUtils.equalsEps4(v1[1], v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps4(float v1X, float v1Y, float v2X, float v2Y)
	{
		if(!MathUtils.equalsEps4(v1X, v2X)) return false;
		if(!MathUtils.equalsEps4(v1Y, v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps6(v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps6(v1[1], v2[1])) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps6(v1[0], v2X)) return false;
		if(!MathUtils.equalsEps6(v1[1], v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps6(float v1X, float v1Y, float v2X, float v2Y)
	{
		if(!MathUtils.equalsEps6(v1X, v2X)) return false;
		if(!MathUtils.equalsEps6(v1Y, v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps8(v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps8(v1[1], v2[1])) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps8(v1[0], v2X)) return false;
		if(!MathUtils.equalsEps8(v1[1], v2Y)) return false;

		return true;
	}
	
	public static boolean equalsEps8(float v1X, float v1Y, float v2X, float v2Y)
	{
		if(!MathUtils.equalsEps8(v1X, v2X)) return false;
		if(!MathUtils.equalsEps8(v1Y, v2Y)) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == v2[0];
			case 1 -> v1[1] == v2[1];
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == value;
			case 1 -> v1[1] == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == v2X;
			case 1 -> v1[1] == v2Y;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float v1X, float v1Y, float value)
	{
		return switch (index) {
			case 0 -> v1X == value;
			case 1 -> v1Y == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float v1X, float v1Y, float v2X, float v2Y)
	{
		return switch (index) {
			case 0 -> v1X == v2X;
			case 1 -> v1Y == v2Y;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], v2[0]);
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], value);
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], v2X);
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, float v1X, float v1Y, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1X, value);
			case 1 -> MathUtils.equalsEps(tolerance, v1Y, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, float v1X, float v1Y, float v2X, float v2Y)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1X, v2X);
			case 1 -> MathUtils.equalsEps(tolerance, v1Y, v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], v2[0]);
			case 1 -> MathUtils.equalsEps4(v1[1], v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], value);
			case 1 -> MathUtils.equalsEps4(v1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], v2X);
			case 1 -> MathUtils.equalsEps4(v1[1], v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, float v1X, float v1Y, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1X, value);
			case 1 -> MathUtils.equalsEps4(v1Y, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, float v1X, float v1Y, float v2X, float v2Y)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1X, v2X);
			case 1 -> MathUtils.equalsEps4(v1Y, v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], v2[0]);
			case 1 -> MathUtils.equalsEps6(v1[1], v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], value);
			case 1 -> MathUtils.equalsEps6(v1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], v2X);
			case 1 -> MathUtils.equalsEps6(v1[1], v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, float v1X, float v1Y, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1X, value);
			case 1 -> MathUtils.equalsEps6(v1Y, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, float v1X, float v1Y, float v2X, float v2Y)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1X, v2X);
			case 1 -> MathUtils.equalsEps6(v1Y, v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], v2[0]);
			case 1 -> MathUtils.equalsEps8(v1[1], v2[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], value);
			case 1 -> MathUtils.equalsEps8(v1[1], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, float v2X, float v2Y)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], v2X);
			case 1 -> MathUtils.equalsEps8(v1[1], v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, float v1X, float v1Y, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1X, value);
			case 1 -> MathUtils.equalsEps8(v1Y, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, float v1X, float v1Y, float v2X, float v2Y)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1X, v2X);
			case 1 -> MathUtils.equalsEps8(v1Y, v2Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFinite(float[] v1)
	{
		return
			Float.isFinite(v1[0]) &&
			Float.isFinite(v1[1]);
	}
	
	public static boolean isFinite(float v1X, float v1Y)
	{
		return
			Float.isFinite(v1X) &&
			Float.isFinite(v1Y);
	}
	
	public static boolean isFiniteAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> Float.isFinite(v1[0]);
			case 1 -> Float.isFinite(v1[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFiniteAt(int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> Float.isFinite(v1X);
			case 1 -> Float.isFinite(v1Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isInfinite(float[] v1)
	{
		return
			Float.isInfinite(v1[0]) &&
			Float.isInfinite(v1[1]);
	}
	
	public static boolean isInfinite(float v1X, float v1Y)
	{
		return
			Float.isInfinite(v1X) &&
			Float.isInfinite(v1Y);
	}
	
	public static boolean isInfiniteAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(v1[0]);
			case 1 -> Float.isInfinite(v1[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isInfiniteAt(int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(v1X);
			case 1 -> Float.isInfinite(v1Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaN(float[] v1)
	{
		return
			Float.isNaN(v1[0]) &&
			Float.isNaN(v1[1]);
	}
	
	public static boolean isNaN(float v1X, float v1Y)
	{
		return
			Float.isNaN(v1X) &&
			Float.isNaN(v1Y);
	}
	
	public static boolean isNaNAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> Float.isNaN(v1[0]);
			case 1 -> Float.isNaN(v1[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaNAt(int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> Float.isNaN(v1X);
			case 1 -> Float.isNaN(v1Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZero(float[] v1)
	{
		return
			v1[0] == 0.0f &&
			v1[1] == 0.0f;
	}
	
	public static boolean isZero(float v1X, float v1Y)
	{
		return
			v1X == 0.0f &&
			v1Y == 0.0f;
	}
	
	public static boolean isZeroEps(float tolerance, float[] v1)
	{
		return
			MathUtils.isZeroEps(tolerance, v1[0]) &&
			MathUtils.isZeroEps(tolerance, v1[1]);
	}
	
	public static boolean isZeroEps(float tolerance, float v1X, float v1Y)
	{
		return
			MathUtils.isZeroEps(tolerance, v1X) &&
			MathUtils.isZeroEps(tolerance, v1Y);
	}
	
	public static boolean isZeroEps4(float[] v1)
	{
		return
			MathUtils.isZeroEps4(v1[0]) &&
			MathUtils.isZeroEps4(v1[1]);
	}
	
	public static boolean isZeroEps4(float v1X, float v1Y)
	{
		return
			MathUtils.isZeroEps4(v1X) &&
			MathUtils.isZeroEps4(v1Y);
	}
	
	public static boolean isZeroEps6(float[] v1)
	{
		return
			MathUtils.isZeroEps6(v1[0]) &&
			MathUtils.isZeroEps6(v1[1]);
	}
	
	public static boolean isZeroEps6(float v1X, float v1Y)
	{
		return
			MathUtils.isZeroEps6(v1X) &&
			MathUtils.isZeroEps6(v1Y);
	}
	
	public static boolean isZeroEps8(float[] v1)
	{
		return
			MathUtils.isZeroEps8(v1[0]) &&
			MathUtils.isZeroEps8(v1[1]);
	}
	
	public static boolean isZeroEps8(float v1X, float v1Y)
	{
		return
			MathUtils.isZeroEps8(v1X) &&
			MathUtils.isZeroEps8(v1Y);
	}
	
	public static boolean isZeroAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> v1[0] == 0.0f;
			case 1 -> v1[1] == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAt(int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> v1X == 0.0f;
			case 1 -> v1Y == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps(float tolerance, int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps(tolerance, v1[0]);
			case 1 -> MathUtils.isZeroEps(tolerance, v1[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps(float tolerance, int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps(tolerance, v1X);
			case 1 -> MathUtils.isZeroEps(tolerance, v1Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps4(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps4(v1[0]);
			case 1 -> MathUtils.isZeroEps4(v1[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps4(int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps4(v1X);
			case 1 -> MathUtils.isZeroEps4(v1Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps6(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps6(v1[0]);
			case 1 -> MathUtils.isZeroEps6(v1[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps6(int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps6(v1X);
			case 1 -> MathUtils.isZeroEps6(v1Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps8(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps8(v1[0]);
			case 1 -> MathUtils.isZeroEps8(v1[1]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps8(int index, float v1X, float v1Y)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps8(v1X);
			case 1 -> MathUtils.isZeroEps8(v1Y);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
}
