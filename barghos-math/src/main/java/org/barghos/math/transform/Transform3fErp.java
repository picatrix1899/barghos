package org.barghos.math.transform;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.transform.Orientation3fC;
import org.barghos.math.api.transform.Transform3fR;
import org.barghos.math.api.vector.Vec3fC;
import org.barghos.math.api.vector.Vec3fUtil;
import org.barghos.math.vector.Vec3f;

public class Transform3fErp implements Transform3fR
{
	private Transform3fR a;
	private Transform3fR b;
	
	private float alpha;
	
	public Transform3fErp(Transform3fR a, Transform3fR b)
	{
		setA(a);
		setB(b);
	}
	
	public Transform3fErp setA(Transform3fR t)
	{
		this.a = t;
		
		return this;
	}
	
	public Transform3fErp setB(Transform3fR t)
	{
		this.b = t;
		
		return this;
	}
	
	public Transform3fErp setAlpha(float alpha)
	{
		this.alpha = alpha;
		return this;
	}
	
	public Vec3fC getPos()
	{
		Vec3fC posA = this.a.getPos();
		Vec3fC posB = this.b.getPos();
		
		return Vec3fUtil.lerp(posA, posB, this.alpha, posA);
	}

	public float[] getPos(float[] res)
	{
		float[] posA = this.a.getPos(new float[4]);
		float[] posB = this.b.getPos(new float[4]);
		
		return Vec3fUtil.lerp(posA[COMP_X], posA[COMP_Y], posA[COMP_Z], posB[COMP_X], posB[COMP_Y], posB[COMP_Z], this.alpha, posA);
	}

	public <T extends Vec3fC> T getPos(T res)
	{
		Vec3fC posA = this.a.getPos(res);
		Vec3fC posB = this.b.getPos();

		return Vec3fUtil.lerp(posA, posB, this.alpha, res);
	}

	public Vec3fC getScale()
	{
		Vec3fC posA = this.a.getScale();
		Vec3fC posB = this.b.getScale();
		
		return Vec3fUtil.lerp(posA, posB, this.alpha, posA);
	}

	public float[] getScale(float[] res)
	{
		float[] posA = this.a.getScale(new float[4]);
		float[] posB = this.b.getScale(new float[4]);
		
		return Vec3fUtil.lerp(posA[COMP_X], posA[COMP_Y], posA[COMP_Z], posB[COMP_X], posB[COMP_Y], posB[COMP_Z], this.alpha, posA);
	}

	public <T extends Vec3fC> T getScale(T res)
	{
		Vec3fC posA = this.a.getScale(res);
		Vec3fC posB = this.b.getScale();

		return Vec3fUtil.lerp(posA, posB, this.alpha, res);
	}

	public Orientation3fC getOrientation()
	{
		return null;
	}

	public Mat4fC getTranslationMatrix()
	{
		return null;
	}

	public <T extends Mat4fC> T getTranslationMatrix(T res)
	{
		return null;
	}

	public Mat4fC getScalingMatrix()
	{
		return null;
	}

	public <T extends Mat4fC> T getScalingMatrix(T res)
	{
		return null;
	}

	public Mat4fC getRotationMatrix()
	{
		return null;
	}

	public <T extends Mat4fC> T getRotationMatrix(T res)
	{
		return null;
	}

	public Mat4fC getRotationMatrix(boolean rightHanded)
	{
		return null;
	}

	public <T extends Mat4fC> T getRotationMatrix(boolean rightHanded, T res)
	{
		return null;
	}

	public Mat4fC getRotationMatrixRH()
	{
		return null;
	}

	public <T extends Mat4fC> T getRotationMatrixRH(T res)
	{
		return null;
	}

	public Mat4fC getRotationMatrixLH()
	{
		return null;
	}

	public <T extends Mat4fC> T getRotationMatrixLH(T res)
	{
		return null;
	}

	public Mat4fC toTransformationMatrix()
	{
		return null;
	}

	public <T extends Mat4fC> T toTransformationMatrix(T res)
	{
		return null;
	}

	public Mat4fC toTransformationMatrix(boolean rightHanded)
	{
		return null;
	}

	public <T extends Mat4fC> T toTransformationMatrix(boolean rightHanded, T res)
	{
		return null;
	}

	public Mat4fC toTransformationMatrixRH()
	{
		return null;
	}

	public <T extends Mat4fC> T toTransformationMatrixRH(T res)
	{
		return null;
	}

	public Mat4fC toTransformationMatrixLH()
	{
		return null;
	}

	public <T extends Mat4fC> T toTransformationMatrixLH(T res)
	{
		return null;
	}
	
}
