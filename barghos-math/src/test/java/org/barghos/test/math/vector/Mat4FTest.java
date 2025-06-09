package org.barghos.test.math.vector;

import org.barghos.math.matrix.Mat4F;
import org.barghos.math.vector.Vec3F;
import org.junit.jupiter.api.Test;

public class Mat4FTest
{
	@Test
	public void test()
	{
		Mat4F m = new Mat4F().setBaseChanging(-1, 0, 0, 0, 1, 0, 0, 0, 1);
		
		Vec3F v = new Vec3F(1.0f, 1.0f, 1.0f);
		
		System.out.println(v);

		m.transformPoint3T(v, v);
		
		System.out.println(v);
	}
}
