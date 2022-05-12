//package org.barghos.math.transform;
//
//import org.barghos.core.api.tuple3.Tup3fR;
//import org.barghos.math.api.matrix.Mat4fC;
//import org.barghos.math.api.transform.IHirarchicalTransform3f;
//import org.barghos.math.api.transform.ITransform3f;
//import org.barghos.math.api.util.BiVectorOrientation3f;
//import org.barghos.math.api.vector.QuatfR;
//import org.barghos.math.matrix.Mat4f;
//import org.barghos.math.vector.Vec3f;
//
//public class Transform3f implements IHirarchicalTransform3f
//{
//	private Vec3f pos = new Vec3f();
//	private Vec3f scale = new Vec3f(1.0f);
//	private BiVectorOrientation3f orientation = new BiVectorOrientation3f();
//	
//	private ITransform3f parent;
//	
//	public Transform3f set(ITransform3f t)
//	{
//		this.pos.set(t.getPos(1));
//		this.scale.set(t.getScale(1));
//		this.orientation.set(t.getOrientation(1));
//		
//		return this;
//	}
//	
//	public Transform3f setParent(ITransform3f t)
//	{
//		this.parent = t;
//		
//		return this;
//	}
//	
//	public Vec3f getPos(double alpha)
//	{
//		return this.pos.clone();
//	}
//
//	public Vec3f getScale(double alpha)
//	{
//		return this.scale.clone();
//	}
//
//	public BiVectorOrientation3f getOrientation(double alpha)
//	{
//		return this.orientation.clone();
//	}
//	
//	public Mat4fC getTranslationMatrix(double alpha)
//	{
//		return Mat4f.translation3d(this.pos);
//	}
//
//	public Mat4fC getScalingMatrix(double alpha)
//	{
//		return Mat4f.scaling3d(this.scale);
//	}
//
//	public Mat4fC getRotationMatrix(double alpha)
//	{
//		return this.orientation.toMatrix4f();
//	}
//
//	public ITransform3f getParent()
//	{
//		return this.parent;
//	}
//
//	public Vec3f getAbsolutePos(double alpha)
//	{
//		return getPos(alpha);
//	}
//
//	public Vec3f getAbsoluteScale(double alpha)
//	{
//		return getScale(alpha);
//	}
//
//	public BiVectorOrientation3f getAbsoluteOrientation(double alpha)
//	{
//		return getOrientation(alpha);
//	}
//	
//	public Mat4fC getAbsoluteTranslationMatrix(double alpha)
//	{
//		return Mat4f.translation3d(getAbsolutePos(alpha));
//	}
//
//	public Mat4fC getAbsoluteScalingMatrix(double alpha)
//	{
//		return Mat4f.scaling3d(getAbsoluteScale(alpha));
//	}
//
//	public Mat4fC getAbsoluteRotationMatrix(double alpha)
//	{
//		return getAbsoluteOrientation(alpha).toMatrix4f();
//	}
//	
//	public Transform3f move(float x, float y, float z)
//	{
//		this.pos.add(x, y, z);
//		
//		return this;
//	}
//
//	public Transform3f rotate(Tup3fR axis, float angle)
//	{
//		this.orientation.rotate(axis, angle);
//		
//		return this;
//	}
//	
//	public Transform3f rotate(QuatfR q)
//	{
//		this.orientation.rotate(q);
//		
//		return this;
//	}
//	
//	public Transform3f setPos(float x, float y, float z)
//	{
//		this.pos.set(x, y, z);
//		
//		return this;
//	}
//
//	public Transform3f setScale(float x, float y, float z)
//	{
//		this.scale.set(x, y, z);
//		
//		return this;
//	}
//	
//	public Transform3f setForward(Tup3fR v)
//	{
//		return setForward(v.getX(), v.getY(), v.getZ());
//	}
//	
//	public Transform3f setForward(float x, float y, float z)
//	{
//		this.orientation.setForward(x, y, z);
//		
//		return this;
//	}
//	
//	public Transform3f setUp(Tup3fR v)
//	{
//		return setUp(v.getX(), v.getY(), v.getZ());
//	}
//	
//	public Transform3f setUp(float x, float y, float z)
//	{
//		this.orientation.setUp(x, y, z);
//		
//		return this;
//	}
//
//	public Transform3f setOrientation(BiVectorOrientation3f o)
//	{
//		this.orientation.set(o);
//		
//		return this;
//	}
//	
//	public Transform3f setOrientation(Tup3fR forward, Tup3fR up)
//	{
//		this.orientation.set(forward, up);
//		
//		return this;
//	}
//}
