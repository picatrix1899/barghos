package org.barghos.math.transform;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.transform.HirarchicalTransform3fC;
import org.barghos.math.api.transform.Orientation3fC;
import org.barghos.math.api.transform.Orientation3fR;
import org.barghos.math.api.transform.Transform3fC;
import org.barghos.math.api.transform.Transform3fR;
import org.barghos.math.api.vector.QuatfR;
import org.barghos.math.api.vector.Vec3fC;
import org.barghos.math.api.vector.Vec3fUtil;
import org.barghos.math.matrix.Mat4f;
import org.barghos.math.vector.Vec3f;

public class HirarchicalTransform3f implements HirarchicalTransform3fC
{
	protected float posX;
	protected float posY;
	protected float posZ;
	protected float scaleX; 
	protected float scaleY; 
	protected float scaleZ; 
	
	private Orientation3fC orientation;
	
	private Transform3fR parent;
	
	public HirarchicalTransform3f(Tup3fR pos, Tup3fR scale, Orientation3fC orientation)
	{
		setPos(pos);
		setScale(scale);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(Tup3fR pos, float[] scale, Orientation3fC orientation)
	{
		setPos(pos);
		setScale(scale);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(Tup3fR pos, float sX, float sY, float sZ, Orientation3fC orientation)
	{
		setPos(pos);
		setScale(sX, sY, sZ);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(float[] pos, Tup3fR scale, Orientation3fC orientation)
	{
		setPos(pos);
		setScale(scale);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(float[] pos, float[] scale, Orientation3fC orientation)
	{
		setPos(pos);
		setScale(scale);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(float[] pos, float sX, float sY, float sZ, Orientation3fC orientation)
	{
		setPos(pos);
		setScale(sX, sY, sZ);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(float posX, float posY, float posZ, Tup3fR scale, Orientation3fC orientation)
	{
		setPos(posX, posY, posZ);
		setScale(scale);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(float posX, float posY, float posZ, float[] scale, Orientation3fC orientation)
	{
		setPos(posX, posY, posZ);
		setScale(scale);
		
		this.orientation = orientation;
	}
	
	public HirarchicalTransform3f(float posX, float posY, float posZ, float sX, float sY, float sZ, Orientation3fC orientation)
	{
		setPos(posX, posY, posZ);
		setScale(sX, sY, sZ);
		
		this.orientation = orientation;
	}
	
	public Transform3fR getParent()
	{
		return this.parent;
	}

	public Vec3fC getRelativePos()
	{
		return new Vec3f(this.posX, this.posY, this.posZ);
	}

	public float[] getRelativePos(float[] res)
	{
		res[COMP_X] = this.posX;
		res[COMP_Y] = this.posY;
		res[COMP_Z] = this.posZ;
		
		return res;
	}

	public <T extends Vec3fC> T getRelativePos(T res)
	{
		res.set(this.posX, this.posY, this.posZ);
		
		return res;
	}

	public Vec3fC getRelativeScale()
	{
		return new Vec3f(this.scaleX, this.scaleY, this.scaleZ);
	}

	public float[] getRelativeScale(float[] res)
	{
		res[COMP_X] = this.scaleX;
		res[COMP_Y] = this.scaleY;
		res[COMP_Z] = this.scaleZ;
		
		return res;
	}

	public <T extends Vec3fC> T getRelativeScale(T res)
	{
		res.set(this.scaleX, this.scaleY, this.scaleZ);
		
		return res;
	}

	public Orientation3fC getRelativeOrientation()
	{
		return this.orientation.clone();
	}

	public Mat4fC getRelativeTranslationMatrix()
	{
		return getRelativeTranslationMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T getRelativeTranslationMatrix(T res)
	{
		res.initTranslation3d(this.posX, this.posY, this.posZ);
		
		return res;
	}

	public Mat4fC getRelativeScalingMatrix()
	{
		return getRelativeScalingMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T getRelativeScalingMatrix(T res)
	{
		return res;
	}

	public Mat4fC getRelativeRotationMatrix()
	{
		return getRelativeRotationMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T getRelativeRotationMatrix(T res)
	{
		return this.orientation.toRotationMatrix(res);
	}

	public Mat4fC getRelativeRotationMatrix(boolean rightHanded)
	{
		return getRelativeRotationMatrix(rightHanded, new Mat4f());
	}

	public <T extends Mat4fC> T getRelativeRotationMatrix(boolean rightHanded, T res)
	{
		return this.orientation.toRotationMatrix(rightHanded, res);
	}

	public Mat4fC getRelativeRotationMatrixRH()
	{
		return getRelativeRotationMatrixRH(new Mat4f());
	}

	public <T extends Mat4fC> T getRelativeRotationMatrixRH(T res)
	{
		return this.orientation.toRotationMatrixRH(res);
	}

	public Mat4fC getRelativeRotationMatrixLH()
	{
		return getRelativeRotationMatrixLH(new Mat4f());
	}

	public <T extends Mat4fC> T getRelativeRotationMatrixLH(T res)
	{
		return this.orientation.toRotationMatrixLH(res);
	}
	
	public Mat4fC toRelativeTransformationMatrix()
	{
		return toRelativeTransformationMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T toRelativeTransformationMatrix(T res)
	{
		getRelativeScalingMatrix(res).revMul(getRelativeRotationMatrix()).revMul(getRelativeTranslationMatrix());
		
		return res;
	}

	public Mat4fC toRelativeTransformationMatrix(boolean rightHanded)
	{
		return toRelativeTransformationMatrix(rightHanded, new Mat4f());
	}

	public <T extends Mat4fC> T toRelativeTransformationMatrix(boolean rightHanded, T res)
	{
		getRelativeScalingMatrix(res).revMul(getRelativeRotationMatrix(rightHanded)).revMul(getRelativeTranslationMatrix());
		
		return res;
	}

	public Mat4fC toRelativeTransformationMatrixRH()
	{
		return toRelativeTransformationMatrixRH(new Mat4f());
	}

	public <T extends Mat4fC> T toRelativeTransformationMatrixRH(T res)
	{
		getRelativeScalingMatrix(res).revMul(getRelativeRotationMatrixRH()).revMul(getRelativeTranslationMatrix());
		
		return res;
	}

	public Mat4fC toRelativeTransformationMatrixLH()
	{
		return toRelativeTransformationMatrixLH(new Mat4f());
	}

	public <T extends Mat4fC> T toRelativeTransformationMatrixLH(T res)
	{
		getRelativeScalingMatrix(res).revMul(getRelativeRotationMatrixLH()).revMul(getRelativeTranslationMatrix());
		
		return res;
	}

	public Vec3fC getPos()
	{
		Vec3fC pos = getRelativePos();
		
		if(this.parent != null) getParent().toTransformationMatrix().transform(pos, true, pos);
		
		return pos;
	}

	public float[] getPos(float[] res)
	{
		getRelativePos(res);
		if(this.parent != null) getParent().toTransformationMatrix().transform(res[COMP_X], res[COMP_Y], res[COMP_Z], true, res);
		
		return res;
	}

	public <T extends Vec3fC> T getPos(T res)
	{
		getRelativePos(res);
		if(this.parent != null) getParent().toTransformationMatrix().transform(res, true, res);
		
		return res;
	}

	public Vec3fC getScale()
	{
		Vec3fC scale = getRelativeScale();
		
		if(this.parent != null) getParent().getScalingMatrix().transform(scale, false, scale);
		
		return null;
	}

	public float[] getScale(float[] res)
	{
		getRelativeScale(res);
		if(this.parent != null) getParent().getScalingMatrix().transform(res[COMP_X], res[COMP_Y], res[COMP_Z], false, res);
		
		return res;
	}

	public <T extends Vec3fC> T getScale(T res)
	{
		getRelativeScale(res);
		if(this.parent != null) getParent().getScalingMatrix().transform(res, false, res);
		
		return res;
	}
	
	public Orientation3fC getOrientation()
	{
		Orientation3fC rot = getRelativeOrientation();
		
		if(this.parent != null) rot.transform(getParent().getRotationMatrix()) ;
		
		return rot;
	}

	public Mat4fC getTranslationMatrix()
	{
		return getTranslationMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T getTranslationMatrix(T res)
	{
		Mat4fC m = getRelativeTranslationMatrix(res);
		
		if(this.parent != null) m.revMul(getParent().toTransformationMatrix());
		
		return res;
	}

	public Mat4fC getScalingMatrix()
	{
		return getScalingMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T getScalingMatrix(T res)
	{
		Mat4fC m = getRelativeScalingMatrix(res);
		
		if(this.parent != null) m.revMul(getParent().getScalingMatrix());
		
		return res;
	}

	public Mat4fC getRotationMatrix()
	{
		return getRotationMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T getRotationMatrix(T res)
	{
		Mat4fC m = getRelativeRotationMatrix(res);
		
		if(this.parent != null) m.revMul(getParent().getRotationMatrix());
		
		return res;
	}

	public Mat4fC getRotationMatrix(boolean rightHanded)
	{
		return getRotationMatrix(rightHanded, new Mat4f());
	}

	public <T extends Mat4fC> T getRotationMatrix(boolean rightHanded, T res)
	{
		Mat4fC m = getRelativeRotationMatrix(rightHanded, res);
		
		if(this.parent != null) m.revMul(getParent().getRotationMatrix(rightHanded));
		
		return res;
	}

	public Mat4fC getRotationMatrixRH()
	{
		return getRotationMatrixRH(new Mat4f());
	}

	public <T extends Mat4fC> T getRotationMatrixRH(T res)
	{
		Mat4fC m = getRelativeRotationMatrixRH(res);
		
		if(this.parent != null) m.revMul(getParent().getRotationMatrixRH());
		
		return res;
	}

	public Mat4fC getRotationMatrixLH()
	{
		return getRotationMatrixLH(new Mat4f());
	}

	public <T extends Mat4fC> T getRotationMatrixLH(T res)
	{
		Mat4fC m = getRelativeRotationMatrixLH(res);
		
		if(this.parent != null) m.revMul(getParent().getRotationMatrixLH());
		
		return res;
	}
	
	public Mat4fC toTransformationMatrix()
	{
		return toTransformationMatrix(new Mat4f());
	}

	public <T extends Mat4fC> T toTransformationMatrix(T res)
	{
		toRelativeTransformationMatrix(res);
		
		if(this.parent != null) getParent().toTransformationMatrix().revMul(res);
			
		return res;
	}

	public Mat4fC toTransformationMatrix(boolean rightHanded)
	{
		return toTransformationMatrix(rightHanded, new Mat4f());
	}

	public <T extends Mat4fC> T toTransformationMatrix(boolean rightHanded, T res)
	{
		toRelativeTransformationMatrix(rightHanded, res);
		
		if(this.parent != null) getParent().toTransformationMatrix(rightHanded).revMul(res);
			
		return res;
	}

	public Mat4fC toTransformationMatrixRH()
	{
		return toTransformationMatrixRH(new Mat4f());
	}

	public <T extends Mat4fC> T toTransformationMatrixRH(T res)
	{
		toRelativeTransformationMatrixRH(res);
		
		if(this.parent != null) getParent().toTransformationMatrixRH().revMul(res);
			
		return res;
	}

	public Mat4fC toTransformationMatrixLH()
	{
		return toTransformationMatrixLH(new Mat4f());
	}

	public <T extends Mat4fC> T toTransformationMatrixLH(T res)
	{
		toRelativeTransformationMatrixLH(res);
		
		if(this.parent != null) getParent().toTransformationMatrixLH().revMul(res);
			
		return res;
	}

	public HirarchicalTransform3fC set(Transform3fR t)
	{
		float[] v = new float[3];
		setPos(t.getPos(v));
		setScale(t.getScale(v));
		setOrientation(t.getOrientation());
		
		return this;
	}

	public HirarchicalTransform3fC setParent(Transform3fR parent)
	{
		this.parent = parent;
		
		return this;
	}

	public HirarchicalTransform3fC set(HirarchicalTransform3fC t)
	{
		float[] v = new float[3];
		setPos(t.getPos(v));
		setScale(t.getScale(v));
		setOrientation(t.getOrientation());
		setParent(t.getParent());
		
		return this;
	}

	public HirarchicalTransform3fC setPos(float x, float y, float z)
	{
		this.posX = x;
		this.posY = y;
		this.posZ = z;
		
		return this;
	}

	public HirarchicalTransform3fC setScale(float x, float y, float z)
	{
		this.scaleX = x;
		this.scaleY = y;
		this.scaleZ = z;
		
		return this;
	}

	public Transform3fC setOrientation(Orientation3fR o)
	{
		this.orientation.set(o);
		
		return this;
	}
	
	public HirarchicalTransform3fC move(float x, float y, float z)
	{	
		float[] v = Vec3fUtil.add(this.posX, this.posY, this.posZ, x, y, z, new float[3]);
		
		this.posX = v[COMP_X];
		this.posY = v[COMP_Y];
		this.posZ = v[COMP_Z];
		
		return this;
	}

	public HirarchicalTransform3fC rotate(float aX, float aY, float aZ, float angle)
	{
		this.orientation.rotate(aX, aY, aZ, angle);
		
		return this;
	}

	public HirarchicalTransform3fC rotateDeg(float aX, float aY, float aZ, float angle)
	{
		this.orientation.rotateDeg(aX, aY, aZ, angle);
		
		return this;
	}

	public HirarchicalTransform3fC rotate(QuatfR q)
	{
		this.orientation.rotate(q);
		
		return this;
	}
}
