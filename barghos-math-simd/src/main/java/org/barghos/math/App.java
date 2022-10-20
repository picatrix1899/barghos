//package org.barghos.math;
//
//import org.barghos.math.vector.SimdVec3f;
//import org.barghos.math.vector.Vec3f;
//import org.barghos.math.vector.Vec3fSIMDUtil;
//
//public class App
//{
//
//	public static void main(String[] args)
//	{	
//		Vec3f v1 = new Vec3f();
//		SimdVec3f v2 = new SimdVec3f();
//		
//		Stopwatch w1 = new Stopwatch();
//		Stopwatch w2 = new Stopwatch();
//		Stopwatch w3 = new Stopwatch();
//		Stopwatch w4 = new Stopwatch();
//		
//		v1.setX(1.1f).setY(2.2f).setZ(3.3f);
//		v2.setX(1.1f).setY(2.2f).setZ(3.3f);
//		
//		v1.add(3.3f, 2.2f, 1.1f);
//		
//		v2.add(3.3f, 2.2f, 1.1f);
//		
//		float[] vy = new float[] {1.1f, 2.2f, 3.3f, 0.0f};
//		Vec3fSIMDUtil.addBatch(new float[] {vy[0], vy[1], vy[2], vy[3]}, new float[] {3.3f, 2.2f, 1.1f, 0.0f}, new float[4]);
//		
//		int max = 1000000;
//		
//		w1.start();
//		for(int i = 0; i < max; i++)
//		{
//			v1.add(3.3f, 2.2f, 1.1f);
//		}
//		
//		w1.stop();
//		
//		w2.start();
//		for(int i = 0; i < max; i++)
//		{
//			v2.add(3.3f, 2.2f, 1.1f);
//		}
//		w2.stop();
//		
//		float[] v3 = new float[] {1.1f, 2.2f, 3.3f, 0.0f};
//		w3.start();
//		for(int i = 0; i < max; i++)
//		{
//			float[] res = Vec3fSIMDUtil.addBatch(new float[] {v3[0], v3[1], v3[2], v3[3]}, new float[] {3.3f, 2.2f, 1.1f, 0.0f}, new float[4]);
//			v3[0] = res[0];
//			v3[1] = res[1];
//			v3[2] = res[2];
//			v3[3] = res[3];
//		}
//		w3.stop();
//		
////		System.out.println("Vec3f: " + w1);
////		System.out.println("Vec3f: " + v1);
////		System.out.println("SimdVec3f: " + w2);
////		System.out.println("SimdVec3f: " + v2);
////		System.out.println("Util: " + w3);
////		System.out.println("Util: " + v3[0] + ", " + v3[1] + ", " + v3[2]);
//	}
//
//}
