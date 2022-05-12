//package org.barghos.math.api.util;
//
//import org.barghos.core.api.tuple3.Tup3fR;
//import org.barghos.math.api.matrix.Mat4fC;
//import org.barghos.math.api.vector.QuatfR;
//import org.barghos.math.matrix.Mat4f;
//import org.barghos.math.vector.Vec3f;
//
//public class BiVectorOrientation3f
//{
//	private final Vec3fC forward = new Vec3f(0, 0, 1.0f);
//	private final Vec3f up = new Vec3f(0, 1.0f, 0);
//	
//	public BiVectorOrientation3f() { }
//	
//	public BiVectorOrientation3f(Tup3fR forward, Tup3fR up)
//	{
//		set(forward, up);
//	}
//	
//	public BiVectorOrientation3f(float fX, float fY, float fZ, float uX, float uY, float uZ)
//	{
//		set(fX, fY, fZ, uX, uY, uZ);
//	}
//	
//	public BiVectorOrientation3f(BiVectorOrientation3f o)
//	{
//		set(o);
//	}
//	
//	public BiVectorOrientation3f set(BiVectorOrientation3f o)
//	{
//		return set(o.forward, o.up);
//	}
//	
//	public BiVectorOrientation3f set(Tup3fR forward, Tup3fR up)
//	{
//		return set(forward.getX(), forward.getY(), forward.getZ(), up.getX(), up.getY(), up.getZ());
//	}
//	
//	public BiVectorOrientation3f set(float fX, float fY, float fZ, float uX, float uY, float uZ)
//	{
//		this.forward.set(fX, fY, fZ);
//		this.up.set(uX, uY, uZ);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setForward(Tup3fR v)
//	{
//		return setForward(v.getX(), v.getY(), v.getZ());
//	}
//	
//	public BiVectorOrientation3f setForward(float x, float y, float z)
//	{
//		this.forward.set(x, y, z);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setForwardX(float x)
//	{
//		this.forward.setX(x);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setForwardY(float y)
//	{
//		this.forward.setY(y);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setForwardZ(float z)
//	{
//		this.forward.setZ(z);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setUp(Tup3fR v)
//	{
//		return setUp(v.getX(), v.getY(), v.getZ());
//	}
//	
//	public BiVectorOrientation3f setUp(float x, float y, float z)
//	{
//		this.up.set(x, y, z);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setUpX(float x)
//	{
//		this.up.setX(x);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setUpY(float y)
//	{
//		this.up.setY(y);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f setUpZ(float z)
//	{
//		this.up.setZ(z);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f rotate(Tup3fR axis, float angle)
//	{
//		Mat4fC m = new Mat4f().initRotation(axis, angle);
//		
//		this.forward.transform(m);
//		this.up.transform(m);
//		
//		return this;
//	}
//	
//	public BiVectorOrientation3f rotate(QuatfR quat)
//	{
//		Mat4fC m = new Mat4f().initRotation(quat);
//		
//		this.forward.transform(m);
//		this.up.transform(m);
//		
//		return this;
//	}
//	
//	public Vec3f getForward()
//	{
//		return this.forward.clone();
//	}
//	
//	public Vec3f getBack()
//	{
//		return (Vec3f)this.forward.negateN();
//	}
//	
//	public Vec3f getUp()
//	{
//		return this.up.clone();
//	}
//	
//	public Vec3f getDown()
//	{
//		return (Vec3f)this.up.negateN();
//	}
//	
//	public Vec3f getLeft()
//	{
//		return (Vec3f)this.up.crossN(this.forward).negate();
//	}
//	
//	public Vec3f getRight()
//	{
//		return (Vec3f)this.up.crossN(this.forward);
//	}
//	
//	public Mat4fC toMatrix4f()
//	{
//		return Mat4f.baseChanging(this.up, this.forward);
//	}
//	
//	public BiVectorOrientation3f clone()
//	{
//		return new BiVectorOrientation3f(this);
//	}
//}