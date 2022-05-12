//package org.barghos.math.transform;
//
//import org.barghos.math.api.util.BiVectorOrientation3f;
//import org.barghos.math.api.vector.Vec3fUtil;
//import org.barghos.math.vector.Vec3f;
//
//public class InterpolationUtils
//{
//	public static BiVectorOrientation3f lerpN(BiVectorOrientation3f a, BiVectorOrientation3f b, float alpha)
//	{
//		Vec3f forwardA = a.getForward();
//		Vec3f forwardB = b.getForward();
//		Vec3f upA = a.getUp();
//		Vec3f upB = b.getUp();
//		
//		BiVectorOrientation3f res = new BiVectorOrientation3f();
//		res.setForward(Vec3fUtil.lerp(forwardA, forwardB, alpha, new Vec3f()));
//		res.setUp(Vec3fUtil.lerp(upA, upB, alpha, new Vec3f()));
//		
//		return res;
//	}
//}
