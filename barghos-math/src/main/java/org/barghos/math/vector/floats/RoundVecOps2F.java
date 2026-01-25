package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.IRoundMethodF;
import org.barghos.core.math.MathUtils;

public class RoundVecOps2F
{
	private RoundVecOps2F() { }
	
	public static float[] floor(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floor(v1[0]);
		res[1] = MathUtils.floor(v1[1]);
		
		return res;
	}
	
	public static float[] floor(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floor(v1X);
		res[1] = MathUtils.floor(v1Y);
		
		return res;
	}
	
	public static float[] floorAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.floor(v1[0]);
		v1[1] = MathUtils.floor(v1[1]);
		
		return v1;
	}
	
	public static float[] ceil(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceil(v1[0]);
		res[1] = MathUtils.ceil(v1[1]);
		
		return res;
	}
	
	public static float[] ceil(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceil(v1X);
		res[1] = MathUtils.ceil(v1Y);
		
		return res;
	}
	
	public static float[] ceilAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.ceil(v1[0]);
		v1[1] = MathUtils.ceil(v1[1]);
		
		return v1;
	}
	
	public static float[] round(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.round(v1[0]);
		res[1] = MathUtils.round(v1[1]);
		
		return res;
	}
	
	public static float[] round(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.round(v1X);
		res[1] = MathUtils.round(v1Y);
		
		return res;
	}
	
	public static float[] roundAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.round(v1[0]);
		v1[1] = MathUtils.round(v1[1]);
		
		return v1;
	}
	
	public static float[] round(IRoundMethodF method, float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.round(method, v1[0]);
		res[1] = MathUtils.round(method, v1[1]);
		
		return res;
	}
	
	public static float[] round(IRoundMethodF method, float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.round(method, v1X);
		res[1] = MathUtils.round(method, v1Y);
		
		return res;
	}
	
	public static float[] roundAssign(IRoundMethodF method, @ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.round(method, v1[0]);
		v1[1] = MathUtils.round(method, v1[1]);
		
		return v1;
	}
	
	public static float[] trunc(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.trunc(v1[0]);
		res[1] = MathUtils.trunc(v1[1]);
		
		return res;
	}
	
	public static float[] trunc(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.trunc(v1X);
		res[1] = MathUtils.trunc(v1Y);
		
		return res;
	}
	
	public static float[] truncAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.trunc(v1[0]);
		v1[1] = MathUtils.trunc(v1[1]);
		
		return v1;
	}
	
	public static float[] floorEven(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorEven(v1[0]);
		res[1] = MathUtils.floorEven(v1[1]);
		
		return res;
	}
	
	public static float[] floorEven(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorEven(v1X);
		res[1] = MathUtils.floorEven(v1Y);
		
		return res;
	}
	
	public static float[] floorEvenAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.floorEven(v1[0]);
		v1[1] = MathUtils.floorEven(v1[1]);
		
		return v1;
	}
	
	public static float[] floorOdd(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorOdd(v1[0]);
		res[1] = MathUtils.floorOdd(v1[1]);
		
		return res;
	}
	
	public static float[] floorOdd(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorOdd(v1X);
		res[1] = MathUtils.floorOdd(v1Y);
		
		return res;
	}
	
	public static float[] floorOddAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.floorOdd(v1[0]);
		v1[1] = MathUtils.floorOdd(v1[1]);
		
		return v1;
	}
	
	public static float[] floorOddZero(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorOddZero(v1[0]);
		res[1] = MathUtils.floorOddZero(v1[1]);
		
		return res;
	}
	
	public static float[] floorOddZero(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorOddZero(v1X);
		res[1] = MathUtils.floorOddZero(v1Y);
		
		return res;
	}
	
	public static float[] floorOddZeroAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.floorOddZero(v1[0]);
		v1[1] = MathUtils.floorOddZero(v1[1]);
		
		return v1;
	}
	
	public static float[] ceilEven(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilEven(v1[0]);
		res[1] = MathUtils.ceilEven(v1[1]);
		
		return res;
	}
	
	public static float[] ceilEven(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilEven(v1X);
		res[1] = MathUtils.ceilEven(v1Y);
		
		return res;
	}
	
	public static float[] ceilEvenAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.ceilEven(v1[0]);
		v1[1] = MathUtils.ceilEven(v1[1]);
		
		return v1;
	}
	
	public static float[] ceilOdd(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilOdd(v1[0]);
		res[1] = MathUtils.ceilOdd(v1[1]);
		
		return res;
	}
	
	public static float[] ceilOdd(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilOdd(v1X);
		res[1] = MathUtils.ceilOdd(v1Y);
		
		return res;
	}
	
	public static float[] ceilOddAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.ceilOdd(v1[0]);
		v1[1] = MathUtils.ceilOdd(v1[1]);
		
		return v1;
	}
	
	public static float[] ceilOddZero(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilOddZero(v1[0]);
		res[1] = MathUtils.ceilOddZero(v1[1]);
		
		return res;
	}
	
	public static float[] ceilOddZero(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilOddZero(v1X);
		res[1] = MathUtils.ceilOddZero(v1Y);
		
		return res;
	}
	
	public static float[] ceilOddZeroAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.ceilOddZero(v1[0]);
		v1[1] = MathUtils.ceilOddZero(v1[1]);
		
		return v1;
	}
	
	public static float[] roundEven(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundEven(v1[0]);
		res[1] = MathUtils.roundEven(v1[1]);
		
		return res;
	}
	
	public static float[] roundEven(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundEven(v1X);
		res[1] = MathUtils.roundEven(v1Y);
		
		return res;
	}
	
	public static float[] roundEvenAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.roundEven(v1[0]);
		v1[1] = MathUtils.roundEven(v1[1]);
		
		return v1;
	}
	
	public static float[] roundOdd(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundOdd(v1[0]);
		res[1] = MathUtils.roundOdd(v1[1]);
		
		return res;
	}
	
	public static float[] roundOdd(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundOdd(v1X);
		res[1] = MathUtils.roundOdd(v1Y);
		
		return res;
	}
	
	public static float[] roundOddAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.roundOdd(v1[0]);
		v1[1] = MathUtils.roundOdd(v1[1]);
		
		return v1;
	}
	
	public static float[] roundOddZero(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundOddZero(v1[0]);
		res[1] = MathUtils.roundOddZero(v1[1]);
		
		return res;
	}
	
	public static float[] roundOddZero(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundOddZero(v1X);
		res[1] = MathUtils.roundOddZero(v1Y);
		
		return res;
	}
	
	public static float[] roundOddZeroAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.roundOddZero(v1[0]);
		v1[1] = MathUtils.roundOddZero(v1[1]);
		
		return v1;
	}
	
	public static float[] floorMultiple(float[] v1, float[] x, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorMultiple(v1[0], x[0]);
		res[1] = MathUtils.floorMultiple(v1[1], x[1]);
		
		return res;
	}
	
	public static float[] floorMultiple(float[] v1, float x, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorMultiple(v1[0], x);
		res[1] = MathUtils.floorMultiple(v1[1], x);
		
		return res;
	}
	
	public static float[] floorMultiple(float[] v1, float xX, float xY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorMultiple(v1[0], xX);
		res[1] = MathUtils.floorMultiple(v1[1], xY);
		
		return res;
	}
	
	public static float[] floorMultiple(float v1X, float v1Y, float xX, float xY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.floorMultiple(v1X, xX);
		res[1] = MathUtils.floorMultiple(v1Y, xY);
		
		return res;
	}
	
	public static float[] floorMultipleAssign(@ExtractionParam float[] v1, float[] x)
	{
		v1[0] = MathUtils.floorMultiple(v1[0], x[0]);
		v1[1] = MathUtils.floorMultiple(v1[1], x[1]);
		
		return v1;
	}
	
	public static float[] floorMultipleAssign(@ExtractionParam float[] v1, float x)
	{
		v1[0] = MathUtils.floorMultiple(v1[0], x);
		v1[1] = MathUtils.floorMultiple(v1[1], x);
		
		return v1;
	}
	
	public static float[] floorMultipleAssign(@ExtractionParam float[] v1, float xX, float xY)
	{
		v1[0] = MathUtils.floorMultiple(v1[0], xX);
		v1[1] = MathUtils.floorMultiple(v1[1], xY);
		
		return v1;
	}
	
	public static float[] ceilMultiple(float[] v1, float[] x, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilMultiple(v1[0], x[0]);
		res[1] = MathUtils.ceilMultiple(v1[1], x[1]);
		
		return res;
	}
	
	public static float[] ceilMultiple(float[] v1, float x, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilMultiple(v1[0], x);
		res[1] = MathUtils.ceilMultiple(v1[1], x);
		
		return res;
	}
	
	public static float[] ceilMultiple(float[] v1, float xX, float xY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilMultiple(v1[0], xX);
		res[1] = MathUtils.ceilMultiple(v1[1], xY);
		
		return res;
	}
	
	public static float[] ceilMultiple(float v1X, float v1Y, float xX, float xY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.ceilMultiple(v1X, xX);
		res[1] = MathUtils.ceilMultiple(v1Y, xY);
		
		return res;
	}
	
	public static float[] ceilMultipleAssign(@ExtractionParam float[] v1, float[] x)
	{
		v1[0] = MathUtils.ceilMultiple(v1[0], x[0]);
		v1[1] = MathUtils.ceilMultiple(v1[1], x[1]);
		
		return v1;
	}
	
	public static float[] ceilMultipleAssign(@ExtractionParam float[] v1, float x)
	{
		v1[0] = MathUtils.ceilMultiple(v1[0], x);
		v1[1] = MathUtils.ceilMultiple(v1[1], x);
		
		return v1;
	}
	
	public static float[] ceilMultipleAssign(@ExtractionParam float[] v1, float xX, float xY)
	{
		v1[0] = MathUtils.ceilMultiple(v1[0], xX);
		v1[1] = MathUtils.ceilMultiple(v1[1], xY);
		
		return v1;
	}
	
	public static float[] roundMultiple(float[] v1, float[] x, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundMultiple(v1[0], x[0]);
		res[1] = MathUtils.roundMultiple(v1[1], x[1]);
		
		return res;
	}
	
	public static float[] roundMultiple(float[] v1, float x, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundMultiple(v1[0], x);
		res[1] = MathUtils.roundMultiple(v1[1], x);
		
		return res;
	}
	
	public static float[] roundMultiple(float[] v1, float xX, float xY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundMultiple(v1[0], xX);
		res[1] = MathUtils.roundMultiple(v1[1], xY);
		
		return res;
	}
	
	public static float[] roundMultiple(float v1X, float v1Y, float xX, float xY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.roundMultiple(v1X, xX);
		res[1] = MathUtils.roundMultiple(v1Y, xY);
		
		return res;
	}
	
	public static float[] roundMultipleAssign(@ExtractionParam float[] v1, float[] x)
	{
		v1[0] = MathUtils.roundMultiple(v1[0], x[0]);
		v1[1] = MathUtils.roundMultiple(v1[1], x[1]);
		
		return v1;
	}
	
	public static float[] roundMultipleAssign(@ExtractionParam float[] v1, float x)
	{
		v1[0] = MathUtils.roundMultiple(v1[0], x);
		v1[1] = MathUtils.roundMultiple(v1[1], x);
		
		return v1;
	}
	
	public static float[] roundMultipleAssign(@ExtractionParam float[] v1, float xX, float xY)
	{
		v1[0] = MathUtils.roundMultiple(v1[0], xX);
		v1[1] = MathUtils.roundMultiple(v1[1], xY);
		
		return v1;
	}
	
}
