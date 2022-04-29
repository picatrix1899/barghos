package org.barghos.math.transform;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.transform.IHirarchicalTransform3f;
import org.barghos.math.api.transform.ITransform3f;
import org.barghos.math.api.util.BiVectorOrientation3f;
import org.barghos.math.api.vector.QuatfR;
import org.barghos.math.api.vector.Vec3fUtil;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.vector.Vec3f;

public class SweptTransform3f implements IHirarchicalTransform3f
{
	private final Transform3f last = new Transform3f();
	private final Transform3f current = new Transform3f();
	
	private ITransform3f parent;
	
	public void update()
	{
		this.last.set(this.current);
	}
	
	public SweptTransform3f setParent(ITransform3f t)
	{
		this.parent = t;
		
		return this;
	}

	public Vec3f getPos(double alpha)
	{
		return Vec3fUtil.lerp(this.last.getPos(alpha), this.current.getPos(alpha), (float)alpha, new Vec3f());
	}

	public Vec3f getScale(double alpha)
	{
		return Vec3fUtil.lerp(this.last.getScale(alpha), this.current.getScale(alpha), (float)alpha, new Vec3f());
	}

	public BiVectorOrientation3f getOrientation(double alpha)
	{
		return InterpolationUtils.lerpN(this.last.getOrientation(alpha), this.current.getOrientation(alpha), (float)alpha);
	}

	public Mat4fC getTranslationMatrix(double alpha)
	{
		return Mat4f.translation3d(getPos(alpha));
	}

	public Mat4fC getScalingMatrix(double alpha)
	{
		return Mat4f.scaling3d(getScale(alpha));
	}

	public Mat4fC getRotationMatrix(double alpha)
	{
		return getOrientation(alpha).toMatrix4f();
	}

	public SweptTransform3f set(ITransform3f t)
	{
		this.current.set(t);
		
		return this;
	}

	public SweptTransform3f setPos(float x, float y, float z)
	{
		this.current.setPos(x, y, z);
		return this;
	}

	public SweptTransform3f setScale(float x, float y, float z)
	{
		this.current.setScale(x, y, z);
		return this;
	}

	public SweptTransform3f setOrientation(BiVectorOrientation3f o)
	{
		this.current.setOrientation(o);
		return this;
	}

	public SweptTransform3f setOrientation(Tup3fR forward, Tup3fR up)
	{
		this.current.setOrientation(forward, up);
		return this;
	}
	
	public SweptTransform3f move(float x, float y, float z)
	{
		this.current.move(x, y, z);
		return this;
	}

	public SweptTransform3f rotate(Tup3fR axis, float angle)
	{
		this.current.rotate(axis, angle);
		return this;
	}
	
	public SweptTransform3f rotate(QuatfR q)
	{
		this.current.rotate(q);
		return this;
	}

	public ITransform3f getParent()
	{
		return this.parent;
	}

	public Vec3f getAbsolutePos(double alpha)
	{
		return getPos(alpha);
	}

	public Vec3f getAbsoluteScale(double alpha)
	{
		return getScale(alpha);
	}

	public BiVectorOrientation3f getAbsoluteOrientation(double alpha)
	{
		return getOrientation(alpha);
	}

	public Mat4fC getAbsoluteTranslationMatrix(double alpha)
	{
		return Mat4f.translation3d(getAbsolutePos(alpha));
	}

	public Mat4fC getAbsoluteScalingMatrix(double alpha)
	{
		return Mat4f.scaling3d(getAbsoluteScale(alpha));
	}

	public Mat4fC getAbsoluteRotationMatrix(double alpha)
	{
		return getAbsoluteOrientation(alpha).toMatrix4f();
	}
}
