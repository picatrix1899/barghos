package org.barghos.core.math;

public class EaseUtils
{
	public static double easeInSine(double alpha)
	{
		return 1.0 - MathUtils.cos(alpha * MathUtils.HALF_PI);
	}
	
	public static float easeInSine(float alpha)
	{
		return 1.0f - MathUtils.cos(alpha * MathUtils.HALF_PIf);
	}
	
	public static double easeOutSine(double alpha)
	{
		return MathUtils.sin(alpha * MathUtils.HALF_PI);
	}
	
	public static float easeOutSine(float alpha)
	{
		return MathUtils.sin(alpha * MathUtils.HALF_PIf);
	}
	
	public static double easeInOutSine(double alpha)
	{
		return (1.0 - MathUtils.cos(alpha * MathUtils.PI)) * 0.5;
	}
	
	public static float easeInOutSine(float alpha)
	{
		return (1.0f - MathUtils.cos(alpha * MathUtils.PIf)) * 0.5f;
	}
	
	public static double easeInQuadric(double alpha)
	{
		return alpha * alpha;
	}
	
	public static float easeInQuadric(float alpha)
	{
		return alpha * alpha;
	}
	
	public static double easeOutQuadric(double alpha)
	{
		return alpha * (2.0 - alpha);
	}
	
	public static float easeOutQuadric(float alpha)
	{
		return alpha * (2.0f - alpha);
	}
	
	public static double easeInOutQuadric(double alpha)
	{
		return alpha < 0.5 ? 2.0 * alpha * alpha : Math.fma(alpha, Math.fma(alpha, -2.0, 4.0), -1.0);
	}
	
	public static float easeInOutQuadric(float alpha)
	{
		return alpha < 0.5f ? 2.0f * alpha * alpha : Math.fma(alpha, Math.fma(alpha, -2.0f, 4.0f), -1.0f);
	}
	
	public static double easeInCubic(double alpha)
	{
		return alpha * alpha * alpha;
	}
	
	public static float easeInCubic(float alpha)
	{
		return alpha * alpha * alpha;
	}
	
	public static double easeOutCubic(double alpha)
	{
		return alpha * Math.fma(alpha, alpha - 3.0, 3.0);
	}
	
	public static float easeOutCubic(float alpha)
	{
		return alpha * Math.fma(alpha, alpha - 3.0f, 3.0f);
	}
	
	public static double easeInOutCubic(double alpha)
	{
		return alpha < 0.5 ? 4.0 * alpha * alpha * alpha : Math.fma(Math.fma(Math.fma(4.0, alpha, -12.0), alpha, 12.0), alpha, -3.0);
	}
	
	public static float easeInOutCubic(float alpha)
	{
		return alpha < 0.5f ? 4.0f * alpha * alpha * alpha : Math.fma(Math.fma(Math.fma(4.0f, alpha, -12.0f), alpha, 12.0f), alpha, -3.0f);
	}
	
	public static double easeInQuartic(double alpha)
	{
		return alpha * alpha * alpha * alpha;
	}
	
	public static float easeInQuartic(float alpha)
	{
		return alpha * alpha * alpha * alpha;
	}
	
	public static double easeOutQuartic(double alpha)
	{
		return alpha * Math.fma(alpha, Math.fma(alpha, Math.fma(-1.0, alpha, 4.0), -6.0), 4.0);
	}
	
	public static float easeOutQuartic(float alpha)
	{
		return alpha * Math.fma(alpha, Math.fma(alpha, Math.fma(-1.0f, alpha, 4.0f), -6.0f), 4.0f);
	}
	
	public static double easeInOutQuartic(double alpha)
	{
		return alpha < 0.5 ? 8.0 * alpha * alpha * alpha * alpha : Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, -8.0, 16.0), 200.0), -200.0), -7.0);
	}
	
	public static float easeInOutQuartic(float alpha)
	{
		return alpha < 0.5f ? 8.0f * alpha * alpha * alpha * alpha : Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, -8.0f, 16.0f), 200.0f), -200.0f), -7.0f);
	}
	
	public static double easeInQuintic(double alpha)
	{
		return alpha * alpha * alpha * alpha * alpha;
	}
	
	public static float easeInQuintic(float alpha)
	{
		return alpha * alpha * alpha * alpha * alpha;
	}
	
	public static double easeOutQuintic(double alpha)
	{
		return alpha * Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, alpha - 1.0, 2.0), -6.0), 5.0);
	}
	
	public static float easeOutQuintic(float alpha)
	{
		return alpha * Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, alpha - 1.0f, 2.0f), -6.0f), 5.0f);
	}
	
	public static double easeInOutQuintic(double alpha)
	{
		return alpha < 0.5 ? 16.0 * alpha * alpha * alpha * alpha * alpha : Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, 16.0, -80.0), 160.0), -160.0), 80.0), -15.0);
	}
	
	public static float easeInOutQuintic(float alpha)
	{
		return alpha < 0.5f ? 16.0f * alpha * alpha * alpha * alpha * alpha : Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, Math.fma(alpha, 16.0f, -80.0f), 160.0f), -160.0f), 80.0f), -15.0f);
	}
	
	public static double easeInExponential(double alpha)
	{
		return alpha == 0.0 ? 0.0 : Math.pow(2.0, Math.fma(10.0, alpha, -10.0));
	}
	
	public static float easeInExponential(float alpha)
	{
		return alpha == 0.0f ? 0.0f : MathUtils.pow(2.0f, Math.fma(10.0f, alpha, -10.0f));
	}
	
	public static double easeOutExponential(double alpha)
	{
		return alpha == 1.0 ? 1.0 : 1.0 - Math.pow(2.0,  -10.0 * alpha);
	}
	
	public static float easeOutExponential(float alpha)
	{
		return alpha == 1.0f ? 1.0f : 1.0f - MathUtils.pow(2.0f,  -10.0f * alpha);
	}
	
	public static double easeInOutExponential(double alpha)
	{
		return alpha == 0.0 ? 0.0 : alpha == 1.0 ? 1.0 : alpha < 0.5 ? Math.pow(2.0, Math.fma(20.0, alpha, -10.0)) * 0.5 : (2.0 - Math.pow(2.0, Math.fma(-20.0, alpha, 10.0))) * 0.5;
	}
	
	public static float easeInOutExponential(float alpha)
	{
		return alpha == 0.0f ? 0.0f : alpha == 1.0f ? 1.0f : alpha < 0.5f ? MathUtils.pow(2.0f, Math.fma(20.0f, alpha, -10.0f)) * 0.5f : (2.0f - MathUtils.pow(2.0f, Math.fma(-20.0f, alpha, 10.0f))) * 0.5f;
	}
	
	public static double easeInCircular(double alpha)
	{
		return 1.0 - MathUtils.sqrt(Math.fma(alpha, -alpha, 1.0));
	}
	
	public static float easeInCircular(float alpha)
	{
		return 1.0f - MathUtils.sqrt(Math.fma(alpha, -alpha, 1.0f));
	}
	
	public static double easeOutCircular(double alpha)
	{
		return MathUtils.sqrt(Math.fma(2.0f, alpha, -alpha * alpha));
	}
	
	public static float easeOutCircular(float alpha)
	{
		return MathUtils.sqrt(Math.fma(2.0f, alpha, -alpha * alpha));
	}
	
	public static double easeInOutCircular(double alpha)
	{
		return alpha < 0.5 ? (1.0 - MathUtils.sqrt(Math.fma(alpha, -4.0 * alpha, 1.0))) * 0.5 : (MathUtils.sqrt(Math.fma(alpha, Math.fma(alpha, -4.0, 8.0), -3.0)) + 1.0) * 0.5;
	}
	
	public static float easeInOutCircular(float alpha)
	{
		return alpha < 0.5f ? (1.0f - MathUtils.sqrt(Math.fma(alpha, -4.0f * alpha, 1.0f))) * 0.5f : (MathUtils.sqrt(Math.fma(alpha, Math.fma(alpha, -4.0f, 8.0f), -3.0f)) + 1.0f) * 0.5f;
	}
}
