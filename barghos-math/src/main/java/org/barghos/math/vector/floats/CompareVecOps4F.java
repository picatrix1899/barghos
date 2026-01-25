package org.barghos.math.vector.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.core.math.MathUtils;

public class CompareVecOps4F
{
	private CompareVecOps4F() { }
	
	public static boolean equals(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(v1[0] != v2[0]) return false;
		if(v1[1] != v2[1]) return false;
		if(v1[2] != v2[2]) return false;
		if(v1[3] != v2[3]) return false;
		
		return true;
	}
	
	public static boolean equals(@AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;
		
		if(v1[0] != v2X) return false;
		if(v1[1] != v2Y) return false;
		if(v1[2] != v2Z) return false;
		if(v1[3] != v2W) return false;
		
		return true;
	}
	
	public static boolean equals(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1X != v2X) return false;
		if(v1Y != v2Y) return false;
		if(v1Z != v2Z) return false;
		if(v1W != v2W) return false;
		
		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps(tolerance, v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps(tolerance, v1[1], v2[1])) return false;
		if(!MathUtils.equalsEps(tolerance, v1[2], v2[2])) return false;
		if(!MathUtils.equalsEps(tolerance, v1[3], v2[3])) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, @AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps(tolerance, v1[0], v2X)) return false;
		if(!MathUtils.equalsEps(tolerance, v1[1], v2Y)) return false;
		if(!MathUtils.equalsEps(tolerance, v1[2], v2Z)) return false;
		if(!MathUtils.equalsEps(tolerance, v1[3], v2W)) return false;

		return true;
	}
	
	public static boolean equalsEps(float tolerance, float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(!MathUtils.equalsEps(tolerance, v1X, v2X)) return false;
		if(!MathUtils.equalsEps(tolerance, v1Y, v2Y)) return false;
		if(!MathUtils.equalsEps(tolerance, v1Z, v2Z)) return false;
		if(!MathUtils.equalsEps(tolerance, v1W, v2W)) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps4(v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps4(v1[1], v2[1])) return false;
		if(!MathUtils.equalsEps4(v1[2], v2[2])) return false;
		if(!MathUtils.equalsEps4(v1[3], v2[3])) return false;

		return true;
	}
	
	public static boolean equalsEps4(@AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps4(v1[0], v2X)) return false;
		if(!MathUtils.equalsEps4(v1[1], v2Y)) return false;
		if(!MathUtils.equalsEps4(v1[2], v2Z)) return false;
		if(!MathUtils.equalsEps4(v1[3], v2W)) return false;

		return true;
	}
	
	public static boolean equalsEps4(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(!MathUtils.equalsEps4(v1X, v2X)) return false;
		if(!MathUtils.equalsEps4(v1Y, v2Y)) return false;
		if(!MathUtils.equalsEps4(v1Z, v2Z)) return false;
		if(!MathUtils.equalsEps4(v1W, v2W)) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps6(v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps6(v1[1], v2[1])) return false;
		if(!MathUtils.equalsEps6(v1[2], v2[2])) return false;
		if(!MathUtils.equalsEps6(v1[3], v2[3])) return false;

		return true;
	}
	
	public static boolean equalsEps6(@AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps6(v1[0], v2X)) return false;
		if(!MathUtils.equalsEps6(v1[1], v2Y)) return false;
		if(!MathUtils.equalsEps6(v1[2], v2Z)) return false;
		if(!MathUtils.equalsEps6(v1[3], v2W)) return false;

		return true;
	}
	
	public static boolean equalsEps6(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(!MathUtils.equalsEps6(v1X, v2X)) return false;
		if(!MathUtils.equalsEps6(v1Y, v2Y)) return false;
		if(!MathUtils.equalsEps6(v1Z, v2Z)) return false;
		if(!MathUtils.equalsEps6(v1W, v2W)) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		if(!MathUtils.equalsEps8(v1[0], v2[0])) return false;
		if(!MathUtils.equalsEps8(v1[1], v2[1])) return false;
		if(!MathUtils.equalsEps8(v1[2], v2[2])) return false;
		if(!MathUtils.equalsEps8(v1[3], v2[3])) return false;

		return true;
	}
	
	public static boolean equalsEps8(@AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		if(!MathUtils.equalsEps8(v1[0], v2X)) return false;
		if(!MathUtils.equalsEps8(v1[1], v2Y)) return false;
		if(!MathUtils.equalsEps8(v1[2], v2Z)) return false;
		if(!MathUtils.equalsEps8(v1[3], v2W)) return false;

		return true;
	}
	
	public static boolean equalsEps8(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(!MathUtils.equalsEps8(v1X, v2X)) return false;
		if(!MathUtils.equalsEps8(v1Y, v2Y)) return false;
		if(!MathUtils.equalsEps8(v1Z, v2Z)) return false;
		if(!MathUtils.equalsEps8(v1W, v2W)) return false;

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] v1, @AllowNull float[] v2)
	{
		if(v1 == v2) return true;
		if(v1 == null || v2 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == v2[0];
			case 1 -> v1[1] == v2[1];
			case 2 -> v1[2] == v2[2];
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == value;
			case 1 -> v1[1] == value;
			case 2 -> v1[2] == value;
			case 3 -> v1[3] == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> v1[0] == v2X;
			case 1 -> v1[1] == v2Y;
			case 2 -> v1[2] == v2Z;
			case 3 -> v1[3] == v2W;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float v1X, float v1Y, float v1Z, float v1W, float value)
	{
		return switch (index) {
			case 0 -> v1X == value;
			case 1 -> v1Y == value;
			case 2 -> v1Z == value;
			case 3 -> v1W == value;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAt(int index, float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		return switch (index) {
			case 0 -> v1X == v2X;
			case 1 -> v1Y == v2Y;
			case 2 -> v1Z == v2Z;
			case 3 -> v1W == v2W;
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
			case 2 -> MathUtils.equalsEps(tolerance, v1[2], v2[2]);
			case 3 -> MathUtils.equalsEps(tolerance, v1[3], v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], value);
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], value);
			case 2 -> MathUtils.equalsEps(tolerance, v1[2], value);
			case 3 -> MathUtils.equalsEps(tolerance, v1[3], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, @AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1[0], v2X);
			case 1 -> MathUtils.equalsEps(tolerance, v1[1], v2Y);
			case 2 -> MathUtils.equalsEps(tolerance, v1[2], v2Z);
			case 3 -> MathUtils.equalsEps(tolerance, v1[3], v2W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, float v1X, float v1Y, float v1Z, float v1W, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1X, value);
			case 1 -> MathUtils.equalsEps(tolerance, v1Y, value);
			case 2 -> MathUtils.equalsEps(tolerance, v1Z, value);
			case 3 -> MathUtils.equalsEps(tolerance, v1W, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps(float tolerance, int index, float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps(tolerance, v1X, v2X);
			case 1 -> MathUtils.equalsEps(tolerance, v1Y, v2Y);
			case 2 -> MathUtils.equalsEps(tolerance, v1Z, v2Z);
			case 3 -> MathUtils.equalsEps(tolerance, v1W, v2W);
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
			case 2 -> MathUtils.equalsEps4(v1[2], v2[2]);
			case 3 -> MathUtils.equalsEps4(v1[3], v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], value);
			case 1 -> MathUtils.equalsEps4(v1[1], value);
			case 2 -> MathUtils.equalsEps4(v1[2], value);
			case 3 -> MathUtils.equalsEps4(v1[3], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, @AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1[0], v2X);
			case 1 -> MathUtils.equalsEps4(v1[1], v2Y);
			case 2 -> MathUtils.equalsEps4(v1[2], v2Z);
			case 3 -> MathUtils.equalsEps4(v1[3], v2W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, float v1X, float v1Y, float v1Z, float v1W, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1X, value);
			case 1 -> MathUtils.equalsEps4(v1Y, value);
			case 2 -> MathUtils.equalsEps4(v1Z, value);
			case 3 -> MathUtils.equalsEps4(v1W, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps4(int index, float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps4(v1X, v2X);
			case 1 -> MathUtils.equalsEps4(v1Y, v2Y);
			case 2 -> MathUtils.equalsEps4(v1Z, v2Z);
			case 3 -> MathUtils.equalsEps4(v1W, v2W);
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
			case 2 -> MathUtils.equalsEps6(v1[2], v2[2]);
			case 3 -> MathUtils.equalsEps6(v1[3], v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], value);
			case 1 -> MathUtils.equalsEps6(v1[1], value);
			case 2 -> MathUtils.equalsEps6(v1[2], value);
			case 3 -> MathUtils.equalsEps6(v1[3], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, @AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1[0], v2X);
			case 1 -> MathUtils.equalsEps6(v1[1], v2Y);
			case 2 -> MathUtils.equalsEps6(v1[2], v2Z);
			case 3 -> MathUtils.equalsEps6(v1[3], v2W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, float v1X, float v1Y, float v1Z, float v1W, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1X, value);
			case 1 -> MathUtils.equalsEps6(v1Y, value);
			case 2 -> MathUtils.equalsEps6(v1Z, value);
			case 3 -> MathUtils.equalsEps6(v1W, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps6(int index, float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps6(v1X, v2X);
			case 1 -> MathUtils.equalsEps6(v1Y, v2Y);
			case 2 -> MathUtils.equalsEps6(v1Z, v2Z);
			case 3 -> MathUtils.equalsEps6(v1W, v2W);
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
			case 2 -> MathUtils.equalsEps8(v1[2], v2[2]);
			case 3 -> MathUtils.equalsEps8(v1[3], v2[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, float value)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], value);
			case 1 -> MathUtils.equalsEps8(v1[1], value);
			case 2 -> MathUtils.equalsEps8(v1[2], value);
			case 3 -> MathUtils.equalsEps8(v1[3], value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, @AllowNull float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		if(v1 == null) return false;

		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1[0], v2X);
			case 1 -> MathUtils.equalsEps8(v1[1], v2Y);
			case 2 -> MathUtils.equalsEps8(v1[2], v2Z);
			case 3 -> MathUtils.equalsEps8(v1[3], v2W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, float v1X, float v1Y, float v1Z, float v1W, float value)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1X, value);
			case 1 -> MathUtils.equalsEps8(v1Y, value);
			case 2 -> MathUtils.equalsEps8(v1Z, value);
			case 3 -> MathUtils.equalsEps8(v1W, value);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean equalsAtEps8(int index, float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W)
	{
		return switch (index) {
			case 0 -> MathUtils.equalsEps8(v1X, v2X);
			case 1 -> MathUtils.equalsEps8(v1Y, v2Y);
			case 2 -> MathUtils.equalsEps8(v1Z, v2Z);
			case 3 -> MathUtils.equalsEps8(v1W, v2W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFinite(float[] v1)
	{
		return
			Float.isFinite(v1[0]) &&
			Float.isFinite(v1[1]) &&
			Float.isFinite(v1[2]) &&
			Float.isFinite(v1[2]);
	}
	
	public static boolean isFinite(float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			Float.isFinite(v1X) &&
			Float.isFinite(v1Y) &&
			Float.isFinite(v1Z) &&
			Float.isFinite(v1W);
	}
	
	public static boolean isFiniteAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> Float.isFinite(v1[0]);
			case 1 -> Float.isFinite(v1[1]);
			case 2 -> Float.isFinite(v1[2]);
			case 3 -> Float.isFinite(v1[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isFiniteAt(int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> Float.isFinite(v1X);
			case 1 -> Float.isFinite(v1Y);
			case 2 -> Float.isFinite(v1Z);
			case 3 -> Float.isFinite(v1W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isInfinite(float[] v1)
	{
		return
			Float.isInfinite(v1[0]) &&
			Float.isInfinite(v1[1]) &&
			Float.isInfinite(v1[2]) &&
			Float.isInfinite(v1[3]);
	}
	
	public static boolean isInfinite(float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			Float.isInfinite(v1X) &&
			Float.isInfinite(v1Y) &&
			Float.isInfinite(v1Z) &&
			Float.isInfinite(v1W);
	}
	
	public static boolean isInfiniteAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(v1[0]);
			case 1 -> Float.isInfinite(v1[1]);
			case 2 -> Float.isInfinite(v1[2]);
			case 3 -> Float.isInfinite(v1[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isInfiniteAt(int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> Float.isInfinite(v1X);
			case 1 -> Float.isInfinite(v1Y);
			case 2 -> Float.isInfinite(v1Z);
			case 3 -> Float.isInfinite(v1W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaN(float[] v1)
	{
		return
			Float.isNaN(v1[0]) &&
			Float.isNaN(v1[1]) &&
			Float.isNaN(v1[2]) &&
			Float.isNaN(v1[3]);
	}
	
	public static boolean isNaN(float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			Float.isNaN(v1X) &&
			Float.isNaN(v1Y) &&
			Float.isNaN(v1Z) &&
			Float.isNaN(v1W);
	}
	
	public static boolean isNaNAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> Float.isNaN(v1[0]);
			case 1 -> Float.isNaN(v1[1]);
			case 2 -> Float.isNaN(v1[2]);
			case 3 -> Float.isNaN(v1[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isNaNAt(int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> Float.isNaN(v1X);
			case 1 -> Float.isNaN(v1Y);
			case 2 -> Float.isNaN(v1Z);
			case 3 -> Float.isNaN(v1W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZero(float[] v1)
	{
		return
			v1[0] == 0.0f &&
			v1[1] == 0.0f &&
			v1[2] == 0.0f &&
			v1[3] == 0.0f;
	}
	
	public static boolean isZero(float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			v1X == 0.0f &&
			v1Y == 0.0f &&
			v1Z == 0.0f &&
			v1W == 0.0f;
	}
	
	public static boolean isZeroEps(float tolerance, float[] v1)
	{
		return
			MathUtils.isZeroEps(tolerance, v1[0]) &&
			MathUtils.isZeroEps(tolerance, v1[1]) &&
			MathUtils.isZeroEps(tolerance, v1[2]) &&
			MathUtils.isZeroEps(tolerance, v1[3]);
	}
	
	public static boolean isZeroEps(float tolerance, float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			MathUtils.isZeroEps(tolerance, v1X) &&
			MathUtils.isZeroEps(tolerance, v1Y) &&
			MathUtils.isZeroEps(tolerance, v1Z) &&
			MathUtils.isZeroEps(tolerance, v1W);
	}
	
	public static boolean isZeroEps4(float[] v1)
	{
		return
			MathUtils.isZeroEps4(v1[0]) &&
			MathUtils.isZeroEps4(v1[1]) &&
			MathUtils.isZeroEps4(v1[2]) &&
			MathUtils.isZeroEps4(v1[3]);
	}
	
	public static boolean isZeroEps4(float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			MathUtils.isZeroEps4(v1X) &&
			MathUtils.isZeroEps4(v1Y) &&
			MathUtils.isZeroEps4(v1Z) &&
			MathUtils.isZeroEps4(v1W);
	}
	
	public static boolean isZeroEps6(float[] v1)
	{
		return
			MathUtils.isZeroEps6(v1[0]) &&
			MathUtils.isZeroEps6(v1[1]) &&
			MathUtils.isZeroEps6(v1[2]) &&
			MathUtils.isZeroEps6(v1[3]);
	}
	
	public static boolean isZeroEps6(float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			MathUtils.isZeroEps6(v1X) &&
			MathUtils.isZeroEps6(v1Y) &&
			MathUtils.isZeroEps6(v1Z) &&
			MathUtils.isZeroEps6(v1W);
	}
	
	public static boolean isZeroEps8(float[] v1)
	{
		return
			MathUtils.isZeroEps8(v1[0]) &&
			MathUtils.isZeroEps8(v1[1]) &&
			MathUtils.isZeroEps8(v1[2]) &&
			MathUtils.isZeroEps8(v1[3]);
	}
	
	public static boolean isZeroEps8(float v1X, float v1Y, float v1Z, float v1W)
	{
		return
			MathUtils.isZeroEps8(v1X) &&
			MathUtils.isZeroEps8(v1Y) &&
			MathUtils.isZeroEps8(v1Z) &&
			MathUtils.isZeroEps8(v1W);
	}
	
	public static boolean isZeroAt(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> v1[0] == 0.0f;
			case 1 -> v1[1] == 0.0f;
			case 2 -> v1[2] == 0.0f;
			case 3 -> v1[3] == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAt(int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> v1X == 0.0f;
			case 1 -> v1Y == 0.0f;
			case 2 -> v1Z == 0.0f;
			case 3 -> v1W == 0.0f;
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps(float tolerance, int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps(tolerance, v1[0]);
			case 1 -> MathUtils.isZeroEps(tolerance, v1[1]);
			case 2 -> MathUtils.isZeroEps(tolerance, v1[2]);
			case 3 -> MathUtils.isZeroEps(tolerance, v1[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps(float tolerance, int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps(tolerance, v1X);
			case 1 -> MathUtils.isZeroEps(tolerance, v1Y);
			case 2 -> MathUtils.isZeroEps(tolerance, v1Z);
			case 3 -> MathUtils.isZeroEps(tolerance, v1W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps4(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps4(v1[0]);
			case 1 -> MathUtils.isZeroEps4(v1[1]);
			case 2 -> MathUtils.isZeroEps4(v1[2]);
			case 3 -> MathUtils.isZeroEps4(v1[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps4(int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps4(v1X);
			case 1 -> MathUtils.isZeroEps4(v1Y);
			case 2 -> MathUtils.isZeroEps4(v1Z);
			case 3 -> MathUtils.isZeroEps4(v1W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps6(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps6(v1[0]);
			case 1 -> MathUtils.isZeroEps6(v1[1]);
			case 2 -> MathUtils.isZeroEps6(v1[2]);
			case 3 -> MathUtils.isZeroEps6(v1[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps6(int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps6(v1X);
			case 1 -> MathUtils.isZeroEps6(v1Y);
			case 2 -> MathUtils.isZeroEps6(v1Z);
			case 3 -> MathUtils.isZeroEps6(v1W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps8(int index, float[] v1)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps8(v1[0]);
			case 1 -> MathUtils.isZeroEps8(v1[1]);
			case 2 -> MathUtils.isZeroEps8(v1[2]);
			case 3 -> MathUtils.isZeroEps8(v1[3]);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
	public static boolean isZeroAtEps8(int index, float v1X, float v1Y, float v1Z, float v1W)
	{
		return switch (index) {
			case 0 -> MathUtils.isZeroEps8(v1X);
			case 1 -> MathUtils.isZeroEps8(v1Y);
			case 2 -> MathUtils.isZeroEps8(v1Z);
			case 3 -> MathUtils.isZeroEps8(v1W);
			default -> throw new IndexOutOfBoundsException();
		};
	}
	
}
