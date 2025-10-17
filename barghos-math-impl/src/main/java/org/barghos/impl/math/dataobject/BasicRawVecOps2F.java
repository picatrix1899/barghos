package org.barghos.impl.math.dataobject;

public class BasicRawVecOps2F implements RawVecOps2F
{
	private static final ThreadLocal<BasicRawVecOps2F> BASIC = ThreadLocal.withInitial(BasicRawVecOps2F::new);
	
	public static BasicRawVecOps2F vec3(float[] v)
	{
		BasicRawVecOps2F result = BASIC.get();
		result.data = v;
		return result;
	}
	
	public float[] data;
	
	public BasicRawVecOps2F add(Vec2F v)
	{
		data[0] += v.v[0];
		data[1] += v.v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F add(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data[0] += vData[0];
		data[1] += vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F add(float[] v)
	{
		data[0] += v[0];
		data[1] += v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F add(float x, float y)
	{
		data[0] += x;
		data[1] += y;
		
		return this;
	}
	
	public BasicRawVecOps2F addN(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data = new float[2];
		
		data[0] += vData[0];
		data[1] += vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F addN(float[] v)
	{
		data = new float[2];
		
		data[0] += v[0];
		data[1] += v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F addN(float x, float y)
	{
		data = new float[2];
		
		data[0] += x;
		data[1] += y;
		
		return this;
	}
	
	public BasicRawVecOps2F sub(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data[0] -= vData[0];
		data[1] -= vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F sub(float[] v)
	{
		data[0] -= v[0];
		data[1] -= v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F sub(float x, float y)
	{
		data[0] -= x;
		data[1] -= y;
		
		return this;
	}
	
	public BasicRawVecOps2F subN(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data = new float[2];
		
		data[0] -= vData[0];
		data[1] -= vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F subN(float[] v)
	{
		data = new float[2];
		
		data[0] -= v[0];
		data[1] -= v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F subN(float x, float y)
	{
		data = new float[2];
		
		data[0] -= x;
		data[1] -= y;
		
		return this;
	}
	
	public BasicRawVecOps2F mul(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data[0] *= vData[0];
		data[1] *= vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F mul(float[] v)
	{
		data[0] *= v[0];
		data[1] *= v[1];
		
		return this;
	}
	
	public RawVecOps2F mul(float x, float y)
	{
		data[0] *= x;
		data[1] *= y;
		
		return this;
	}
	
	public BasicRawVecOps2F mulN(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data = new float[2];
		
		data[0] *= vData[0];
		data[1] *= vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F mulN(float[] v)
	{
		data = new float[2];
		
		data[0] *= v[0];
		data[1] *= v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F mulN(float x, float y)
	{
		data = new float[2];
		
		data[0] *= x;
		data[1] *= y;
		
		return this;
	}
	
	public BasicRawVecOps2F div(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data[0] /= vData[0];
		data[1] /= vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F div(float[] v)
	{
		data[0] /= v[0];
		data[1] /= v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F div(float x, float y)
	{
		data[0] /= x;
		data[1] /= y;
		
		return this;
	}
	
	public BasicRawVecOps2F divN(RawVecOps2F v)
	{
		float[] vData = v.get();
		
		data = new float[2];
		
		data[0] /= vData[0];
		data[1] /= vData[1];
		
		return this;
	}
	
	public BasicRawVecOps2F divN(float[] v)
	{
		data = new float[2];
		
		data[0] /= v[0];
		data[1] /= v[1];
		
		return this;
	}
	
	public BasicRawVecOps2F divN(float x, float y)
	{
		data = new float[2];
		
		data[0] /= x;
		data[1] /= y;
		
		return this;
	}
	
	@Override
	public float[] get()
	{
		return this.data;
	}
	
	public static void test()
	{
		float[] rv1 = new float[2];
		float[] rv2 = new float[2];

		float[] rv = vec3(rv1).addN(vec3(rv1).addN(rv2).mul(0.5f, 0.5f)).get();
	}

}
