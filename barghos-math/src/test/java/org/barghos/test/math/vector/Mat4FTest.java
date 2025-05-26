package org.barghos.test.math.vector;

import org.barghos.math.matrix.Mat4F;
import org.barghos.math.vector.Vec3F;
import org.junit.jupiter.api.Test;

public class Mat4FTest
{
	@Test
	public void test()
	{
		Mat4F mt = new Mat4F().initTranslation3(3.0f, 2.0f, 1.0f);
		Mat4F ms = new Mat4F().initScale3(0.5f, 0.5f, 0.5f);
		
		Mat4F m = new Mat4F();
		
		m.set(ms).mul(mt);
		
		Vec3F v = new Vec3F(1.0f, 1.0f, 1.0f);
		
		System.out.println(v);

		m.transformPoint3T(v, v);
		
		System.out.println(v);
	}
}
