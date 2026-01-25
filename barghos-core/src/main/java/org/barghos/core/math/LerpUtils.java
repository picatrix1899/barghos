package org.barghos.core.math;

public class LerpUtils
{
	public static double lerp(double alpha, double a, double b)
	{
		return Math.fma(alpha, (b - a), a);
	}
	
	public static float lerp(float alpha, float a, float b)
	{
		return Math.fma(alpha, (b - a), a);
	}
	
	public static double quadricBezier(double alpha, double a, double b, double c)
	{
		double p0 = lerp(alpha, a, b);
		
		return Math.fma(alpha, (lerp(alpha, b, c) - p0), p0);
	}
	
	public static float quadricBezier(float alpha, float a, float b, float c)
	{
		float p0 = lerp(alpha, a, b);
		
		return Math.fma(alpha, (lerp(alpha, b, c) - p0), p0);
	}
	
	public static double cubicBezier(double alpha, double a, double b, double c, double d)
	{
		double p0 = quadricBezier(alpha, a, b, c);
		
		return Math.fma(alpha, (quadricBezier(alpha, b, c, d) - p0), p0);
	}
	
	public static float cubicBezier(float alpha, float a, float b, float c, float d)
	{
		float p0 = quadricBezier(alpha, a, b, c);
		
		return Math.fma(alpha, (quadricBezier(alpha, b, c, d) - p0), p0);
	}
	
	public static double bicubicBezier(double alpha, double a, double b, double c, double d, double e)
	{
		double p0 = cubicBezier(alpha, a, b, c, d);
		
		return Math.fma(alpha, (cubicBezier(alpha, b, c, d, e) - p0), p0);
	}
	
	public static float bicubicBezier(float alpha, float a, float b, float c, float d, float e)
	{
		float p0 = cubicBezier(alpha, a, b, c, d);
		
		return Math.fma(alpha, (cubicBezier(alpha, b, c, d, e) - p0), p0);
	}
	
	public static double step(double alpha, double midpoint, double a, double b)
	{
		return alpha < midpoint ? a : b;
	}
	
	public static float step(float alpha, float midpoint, float a, float b)
	{
		return alpha < midpoint ? a : b;
	}
	
	public static double smoothstep(double alpha, double a, double b)
	{
		double smoothAlpha = Math.clamp(alpha, 0.0, 1.0);
		smoothAlpha = smoothAlpha * smoothAlpha * Math.fma(smoothAlpha, -2, 3);
		
		return Math.fma(smoothAlpha, (b - a), a);
	}
	
	public static float smoothstep(float alpha, float a, float b)
	{
		float smoothAlpha = Math.clamp(alpha, 0.0f, 1.0f);
		smoothAlpha = smoothAlpha * smoothAlpha * Math.fma(smoothAlpha, -2, 3);
		
		return Math.fma(smoothAlpha, (b - a), a);
	}
	
	public static double smootherstep(double alpha, double a, double b)
	{
		double smoothAlpha = Math.clamp(alpha, 0.0, 1.0);
		smoothAlpha = smoothAlpha * smoothAlpha * smoothAlpha * Math.fma(smoothAlpha, Math.fma(smoothAlpha, 6, -15), 10);
		
		return Math.fma(smoothAlpha, (b - a), a);
	}
	
	public static float smootherstep(float alpha, float a, float b)
	{
		float smoothAlpha = Math.clamp(alpha, 0.0f, 1.0f);
		smoothAlpha = smoothAlpha * smoothAlpha * smoothAlpha * Math.fma(smoothAlpha, Math.fma(smoothAlpha, 6, -15), 10);
		
		return Math.fma(smoothAlpha, (b - a), a);
	}
	
	public static double intLerp(double alpha, double v)
	{
		return alpha * v;
	}
	
	public static float intLerp(float alpha, float v)
	{
		return alpha * v;
	}
	
	public static double intLerp(double alpha, double a, double b)
	{
		return Math.fma(alpha, (b - a), a);
	}
	
	public static float intLerp(float alpha, float a, float b)
	{
		return Math.fma(alpha, (b - a), a);
	}
	
	public static double invLerp(double value, double a, double b)
	{
		return (value - a) / (b - a);
	}
	
	public static float invLerp(float value, float a, float b)
	{
		return (value - a) / (b - a);
	}
	
	public static double invLerpSaturated(double value, double a, double b)
	{
		return Math.clamp((value - a) / (b - a), 0.0, 1.0);
	}
	
	public static float invLerpSaturated(float value, float a, float b)
	{
		return Math.clamp((value - a) / (b - a), 0.0f, 1.0f);
	}
}
