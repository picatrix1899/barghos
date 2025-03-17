package org.barghos.test.math.vector;

import static org.junit.jupiter.api.Assertions.*;

import org.barghos.math.vector.Vec2F;
import org.barghos.math.vector.VecUtils2F;
import org.barghos.util.functions.floats.Function2F;
import org.barghos.util.math.MathUtils;
import org.junit.jupiter.api.Test;

public class VecUtils2FTest
{
	@Test
	public void invLen_Test()
	{
		float x = 12.4f;
		float y = 18.3f;
		float r = MathUtils.invSqrt(x * x + y * y);
		
		assertEquals(r, VecUtils2F.invLen(new Vec2F(x, y)));
		assertEquals(r, VecUtils2F.invLen(new float[] {x, y}));
		assertEquals(r, VecUtils2F.invLen(x, y));
		
		Function2F<Vec2F> test = Vec2F::new;
	}
	
	@Test
	public void invLen_pos_zero_Test()
	{
		float x = 0.0f;
		float y = 0.0f;
		float r = Float.POSITIVE_INFINITY;
		
		assertEquals(r, VecUtils2F.invLen(new Vec2F(x, y)));
		assertEquals(r, VecUtils2F.invLen(new float[] {x, y}));
		assertEquals(r, VecUtils2F.invLen(x, y));
	}
	
	@Test
	public void invLen_zero_Test()
	{
		float x1 = 0.0f;
		float y1 = 0.0f;
		float r1 = Float.POSITIVE_INFINITY;
		
		float x2 = -0.0f;
		float y2 = -0.0f;
		float r2 = Float.POSITIVE_INFINITY;
		
		assertEquals(r1, VecUtils2F.invLen(new Vec2F(x1, y1)));
		assertEquals(r1, VecUtils2F.invLen(new float[] {x1, y1}));
		assertEquals(r1, VecUtils2F.invLen(x1, y1));
		
		assertEquals(r2, VecUtils2F.invLen(new Vec2F(x2, y2)));
		assertEquals(r2, VecUtils2F.invLen(new float[] {x2, y2}));
		assertEquals(r2, VecUtils2F.invLen(x2, y2));
	}
	
	@Test
	public void len_Test()
	{
		float x = 12.4f;
		float y = 18.3f;
		float r = MathUtils.sqrt(x * x + y * y);
		
		assertEquals(r, VecUtils2F.len(new Vec2F(x, y)));
		assertEquals(r, VecUtils2F.len(new float[] {x, y}));
		assertEquals(r, VecUtils2F.len(x, y));
	}
	
	@Test
	public void len_zero_Test()
	{
		float x1 = 0.0f;
		float y1 = 0.0f;
		float r1 = 0.0f;
		
		float x2 = -0.0f;
		float y2 = -0.0f;
		float r2 = 0.0f;
		
		assertEquals(r1, VecUtils2F.len(new Vec2F(x1, y1)));
		assertEquals(r1, VecUtils2F.len(new float[] {x1, y1}));
		assertEquals(r1, VecUtils2F.len(x1, y1));
		
		assertEquals(r2, VecUtils2F.len(new Vec2F(x2, y2)));
		assertEquals(r2, VecUtils2F.len(new float[] {x2, y2}));
		assertEquals(r2, VecUtils2F.len(x2, y2));
	}
	
	@Test
	public void sqrLen_Test()
	{
		float x = 12.4f;
		float y = 18.3f;
		float r = x * x + y * y;
		
		assertEquals(r, VecUtils2F.sqrLen(new Vec2F(x, y)));
		assertEquals(r, VecUtils2F.sqrLen(new float[] {x, y}));
		assertEquals(r, VecUtils2F.sqrLen(x, y));
	}
	
	@Test
	public void nrm_Test()
	{
		float x = 12.4f;
		float y = 18.3f;
		float invLen = MathUtils.invSqrt(x * x + y * y);
		float rx = x * invLen;
		float ry = y * invLen;
		
		Vec2F v1 = VecUtils2F.nrm(new Vec2F(x, y), new Vec2F());
		assertEquals(rx, v1.x, MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v1.y, MathUtils.SMALL_NUMBER_E8f);
		
		Vec2F v2 = VecUtils2F.nrm(new float[] {x, y}, new Vec2F());
		assertEquals(rx, v2.x, MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v2.y, MathUtils.SMALL_NUMBER_E8f);
		
		Vec2F v3 = VecUtils2F.nrm(x, y, new Vec2F());
		assertEquals(rx, v3.x, MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v3.y, MathUtils.SMALL_NUMBER_E8f);
		
		float[] v4 = VecUtils2F.nrm(new Vec2F(x, y), new float[2]);
		assertEquals(rx, v4[0], MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v4[1], MathUtils.SMALL_NUMBER_E8f);
		
		float[] v5 = VecUtils2F.nrm(new float[] {x, y}, new float[2]);
		assertEquals(rx, v5[0], MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v5[1], MathUtils.SMALL_NUMBER_E8f);
		
		float[] v6 = VecUtils2F.nrm(x, y, new float[2]);
		assertEquals(rx, v6[0], MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v6[1], MathUtils.SMALL_NUMBER_E8f);
	}
	
	@Test
	public void nrm_zero_Test()
	{
		float x = 0.0f;
		float y = 0.0f;
		float rx = 0.0f;
		float ry = 0.0f;
		
		Vec2F v1 = VecUtils2F.nrm(new Vec2F(x, y), new Vec2F());
		assertEquals(rx, v1.x, MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v1.y, MathUtils.SMALL_NUMBER_E8f);
		
		Vec2F v2 = VecUtils2F.nrm(new float[] {x, y}, new Vec2F());
		assertEquals(rx, v2.x, MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v2.y, MathUtils.SMALL_NUMBER_E8f);
		
		Vec2F v3 = VecUtils2F.nrm(x, y, new Vec2F());
		assertEquals(rx, v3.x, MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v3.y, MathUtils.SMALL_NUMBER_E8f);
		
		float[] v4 = VecUtils2F.nrm(new Vec2F(x, y), new float[2]);
		assertEquals(rx, v4[0], MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v4[1], MathUtils.SMALL_NUMBER_E8f);
		
		float[] v5 = VecUtils2F.nrm(new float[] {x, y}, new float[2]);
		assertEquals(rx, v5[0], MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v5[1], MathUtils.SMALL_NUMBER_E8f);
		
		float[] v6 = VecUtils2F.nrm(x, y, new float[2]);
		assertEquals(rx, v6[0], MathUtils.SMALL_NUMBER_E8f);
		assertEquals(ry, v6[1], MathUtils.SMALL_NUMBER_E8f);
	}
}
