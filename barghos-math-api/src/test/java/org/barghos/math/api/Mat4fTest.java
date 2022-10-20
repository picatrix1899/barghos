package org.barghos.math.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.barghos.math.api.AABB2f;
import org.barghos.math.api.BiTree;
import org.barghos.math.api.Model;
import org.barghos.math.api.vector.Vec3fBatchUtil;
import org.barghos.math.api.vector.Vec3fUtil;
import org.junit.jupiter.api.Test;

class Mat4fTest
{
	
	@Test
	void test()
	{
//		int length = 1000002;
//		
//		float[] v1 = new float[length];
//		float[] v2 = new float[length];
//		
//		for(int i = 0; i < length; i++)
//		{
//			v1[i] = i + 0.1f;
//			v2[i] = length - i + 0.1f;
//		}
//		
//		float[] res1 = new float[length];
//		float[] res2 = new float[length];
//		
//		Vec3fSIMDUtil.addBatch(v1, v2, res1);
//		
//		Stopwatch watch2 = new Stopwatch();
//		watch2.start();
//		Vec3fBatchUtil.addBatch(v1, v2, res2);
//		watch2.stop();
//		
//		System.out.println("Batch: " + watch2.toString());
	}
//	/**
//	 * Returns the reciprocal length of the tuple {@code (x, y, z)}.
//	 * If the tuple is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(x, y, z)|}
//	 * 
//	 * @param x The value of the x component of the tuple.
//	 * @param y The value of the y component of the tuple.
//	 * @param z The value of the z component of the tuple.
//	 * 
//	 * @return The reciprocal length of the tuple.
//	 */
//	public static float reciprocalLength1(float x, float y, float z)
//	{
//		double _x = x;
//		double _y = y;
//		double _z = z;
//		
//		return (float)(1.0 / Maths.sqrt(Maths.fma(_x, _x, Math.fma(_y, _y, _z * _z))));
//	}
//	
//	/**
//	 * Returns the reciprocal length of the tuple {@code (x, y, z)}.
//	 * If the tuple is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(x, y, z)|}
//	 * 
//	 * @param x The value of the x component of the tuple.
//	 * @param y The value of the y component of the tuple.
//	 * @param z The value of the z component of the tuple.
//	 * 
//	 * @return The reciprocal length of the tuple.
//	 */
//	public static float reciprocalLength2(float x, float y, float z)
//	{
//		return 1.0f / (float)Maths.sqrt(Maths.fma(x, x, Maths.fma(y, y, z * z)));
//	}
	
//	@Test
//	void test()
//	{
//		float rec1 = reciprocalLength1(Maths.PIf * (float)Math.E, Maths.PIf, Maths.PIf);
//		float rec2 = reciprocalLength2(Maths.PIf * (float)Math.E, Maths.PIf, Maths.PIf);
//		
//		System.out.println(rec1);
//		System.out.println(rec2);
//	}
	
//	@Test
//	void lerpTest()
//	{
//		float[] v = new float[] {
//				10.0f, 11.0f, 12.0f,
//				30.0f, 31.0f, 32.0f,
//				100.0f, 101.0f, 102.0f
//		};
//		
//		float[] w = new float[] {0.0f, 0.5f, 1.0f};
//		
//		float alpha = 0.125f;
//		
//		float[] res = Vec3fUtilSimple.lerpWeighted(v, w, alpha, new float[3]);
//		
//		System.out.println(res[0]);
//		System.out.println(res[1]);
//		System.out.println(res[2]);
//	}
	
//	@Test
//	void test()
//	{
//		BiTree tree = new BiTree(100f, 100f, 0f, 0f);
//		
//		float posX = 10, posY = 10;
//		Model m = new Model();
//		m.name = "m0: 10/10 - 11/11";
//		m.aabb.minX = 0 + posX;
//		m.aabb.minY = 0 + posY;
//		m.aabb.maxX = 1 + posX;
//		m.aabb.maxY = 1 + posY;
//		tree.add(m);
//		
//		posX = 10; posY = 20;
//		m = new Model();
//		m.name = "m1: 10/20 - 11/21";
//		m.aabb.minX = 0 + posX;
//		m.aabb.minY = 0 + posY;
//		m.aabb.maxX = 1 + posX;
//		m.aabb.maxY = 1 + posY;
//		tree.add(m);
//		
//		posX = 10; posY = 30;
//		m = new Model();
//		m.name = "m2: 10/30 - 11/31";
//		m.aabb.minX = 0 + posX;
//		m.aabb.minY = 0 + posY;
//		m.aabb.maxX = 1 + posX;
//		m.aabb.maxY = 1 + posY;
//		tree.add(m);
//		
//		posX = 10; posY = 40;
//		m = new Model();
//		m.name = "m3: 10/40 - 11/41";
//		m.aabb.minX = 0 + posX;
//		m.aabb.minY = 0 + posY;
//		m.aabb.maxX = 1 + posX;
//		m.aabb.maxY = 1 + posY;
//		tree.add(m);
//		
//		posX = 20; posY = 40;
//		m = new Model();
//		m.name = "m3: 20/40 - 21/41";
//		m.aabb.minX = 0 + posX;
//		m.aabb.minY = 0 + posY;
//		m.aabb.maxX = 1 + posX;
//		m.aabb.maxY = 1 + posY;
//		tree.add(m);
//		
//		AABB2f aabb = new AABB2f();
//		aabb.minX = 60;
//		aabb.minY = 0;
//		aabb.maxX = 80;
//		aabb.maxY = 4;
//		
//		List<Model> res = new ArrayList<>();
//		tree.get(aabb, res);
//		
//		for(Model mr : res)
//		{
//			System.out.println(mr.name);
//		}
//	}
}
