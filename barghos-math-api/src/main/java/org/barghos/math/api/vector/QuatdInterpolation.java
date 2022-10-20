//package org.barghos.math.api.vector;
//
//import org.barghos.core.api.documentation.ExtractionParam;
//import org.barghos.core.api.math.BarghosMath;
//
//public class QuatdInterpolation
//{
//	public static <T extends QuatC> T lerp(QuatR a, QuatR b, double alpha, @ExtractionParam T res)
//	{
//		double x = a.getX() * (1.0 - alpha) + b.getX() * alpha;
//		double y = a.getY() * (1.0 - alpha) + b.getY() * alpha;
//		double z = a.getZ() * (1.0 - alpha) + b.getZ() * alpha;
//		double w = a.getW() * (1.0 - alpha) + b.getW() * alpha;
//		
//		double invLength = BarghosMath.invSqrt(x * x + y * y + z * z + w * w);
//		
//		res.set(x * invLength, y * invLength, z * invLength, w * invLength);
//		
//		return res;
//	}
//}
