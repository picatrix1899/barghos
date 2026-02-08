package org.barghos.impl.math.transform;

import org.barghos.api.math.quaternion.IQuatRF;
import org.barghos.api.math.quaternion.IQuatWF;
import org.barghos.api.math.transform.ITransform3RF;
import org.barghos.api.math.transform.ITransform3WF;
import org.barghos.api.math.vector.floats.IVec3RF;
import org.barghos.api.math.vector.floats.IVec3WF;

public class Transform3F implements ITransform3WF
{
	public float posX;
	public float posY;
	public float posZ;
	public float rotX;
	public float rotY;
	public float rotZ;
	public float rotW;
	public float scaleX;
	public float scaleY;
	public float scaleZ;
	
	public Transform3F()
	{
		this.scaleX = 1.0f;
		this.scaleY = 1.0f;
		this.scaleZ = 1.0f;
	}
	
	public Transform3F(IVec3RF pos, IQuatRF rot, IVec3RF scale)
	{
		this.posX = pos.x();
		this.posY = pos.y();
		this.posZ = pos.z();
		
		this.rotX = rot.x();
		this.rotY = rot.y();
		this.rotZ = rot.z();
		this.rotW = rot.w();
		
		this.scaleX = scale.x();
		this.scaleY = scale.y();
		this.scaleZ = scale.z();
	}
	
	public Transform3F(IVec3RF pos, IQuatRF rot)
	{
		this.posX = pos.x();
		this.posY = pos.y();
		this.posZ = pos.z();
		
		this.rotX = rot.x();
		this.rotY = rot.y();
		this.rotZ = rot.z();
		this.rotW = rot.w();
		
		this.scaleX = 1.0f;
		this.scaleY = 1.0f;
		this.scaleZ = 1.0f;
	}
	
	@Override
	public float[] getPos(float[] res)
	{
		res[0] = this.posX;
		res[1] = this.posY;
		res[2] = this.posZ;
		
		return res;
	}
	
	@Override
	public <T extends IVec3WF> T getPos(T res)
	{
		res.set(this.posX, this.posY, this.posZ);
		
		return res;
	}
	@Override
	public float posX()
	{
		return this.posX;
	}
	@Override
	public float posY()
	{
		return this.posY;
	}
	@Override
	public float posZ()
	{
		return this.posZ;
	}
	@Override
	public float[] getRot(float[] res)
	{
		res[0] = this.rotX;
		res[1] = this.rotY;
		res[2] = this.rotZ;
		res[3] = this.rotW;
		
		return res;
	}
	
	@Override
	public <T extends IQuatWF> T getRot(T res)
	{
		res.set(this.rotX, this.rotY, this.rotZ, this.rotW);
		
		return res;
	}
	
	@Override
	public float rotX()
	{
		return this.rotX;
	}

	@Override
	public float rotY()
	{
		return this.rotY;
	}

	@Override
	public float rotZ()
	{
		return this.rotZ;
	}

	@Override
	public float rotW()
	{
		return this.rotW;
	}
	
	@Override
	public float[] getScale(float[] res)
	{
		res[0] = this.scaleX;
		res[1] = this.scaleY;
		res[2] = this.scaleZ;
		
		return res;
	}

	@Override
	public <T extends IVec3WF> T getScale(T res)
	{
		res.set(this.scaleX, this.scaleY, this.scaleZ);
		
		return res;
	}
	
	@Override
	public float scaleX()
	{
		return this.scaleX;
	}
	
	@Override
	public float scaleY()
	{
		return this.scaleY;
	}
	
	@Override
	public float scaleZ()
	{
		return this.scaleZ;
	}
	
	@Override
	public ITransform3WF set(ITransform3RF t)
	{
		this.posX = t.posX();
		this.posY = t.posY();
		this.posZ = t.posZ();
		
		this.rotX = t.rotX();
		this.rotY = t.rotY();
		this.rotZ = t.rotZ();
		this.rotW = t.rotW();
		
		this.scaleX = t.scaleX();
		this.scaleY = t.scaleY();
		this.scaleZ = t.scaleZ();
		
		return this;
	}
	
	@Override
	public ITransform3WF set(float[] t)
	{
		this.posX = t[0];
		this.posY = t[1];
		this.posZ = t[2];
		
		this.rotX = t[3];
		this.rotY = t[4];
		this.rotZ = t[5];
		this.rotW = t[6];
		
		this.scaleX = t[7];
		this.scaleY = t[8];
		this.scaleZ = t[9];
		
		return this;
	}
	
	@Override
	public ITransform3WF setPos(IVec3RF pos)
	{
		this.posX = pos.x();
		this.posY = pos.y();
		this.posZ = pos.z();
		
		return this;
	}
	
	@Override
	public ITransform3WF setPos(float[] pos)
	{
		this.posX = pos[0];
		this.posY = pos[1];
		this.posZ = pos[2];
		
		return this;
	}
	
	@Override
	public ITransform3WF setPos(float posX, float posY, float posZ)
	{
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		
		return this;
	}
	
	@Override
	public ITransform3WF posX(float x)
	{
		this.posX = x;
		
		return this;
	}
	
	@Override
	public ITransform3WF posY(float y)
	{
		this.posY = y;
		
		return this;
	}
	
	@Override
	public ITransform3WF posZ(float z)
	{
		this.posZ = z;
		
		return this;
	}
	
	@Override
	public ITransform3WF setRot(IQuatRF rot)
	{
		this.rotX = rot.x();
		this.rotY = rot.y();
		this.rotZ = rot.z();
		this.rotW = rot.w();
		
		return this;
	}

	@Override
	public ITransform3WF setRot(float[] rot)
	{
		this.rotX = rot[0];
		this.rotY = rot[1];
		this.rotZ = rot[2];
		this.rotW = rot[3];
		
		return this;
	}
	
	@Override
	public ITransform3WF setRot(float rotX, float rotY, float rotZ, float rotW)
	{
		this.rotX = rotX;
		this.rotY = rotY;
		this.rotZ = rotZ;
		this.rotW = rotW;
		
		return this;
	}
	
	@Override
	public ITransform3WF rotX(float x)
	{
		this.rotX = x;
		
		return this;
	}
	
	@Override
	public ITransform3WF rotY(float y)
	{
		this.rotY = y;
		
		return this;
	}
	
	@Override
	public ITransform3WF rotZ(float z)
	{
		this.rotZ = z;
		
		return this;
	}
	
	@Override
	public ITransform3WF rotW(float w)
	{
		this.rotW = w;
		
		return this;
	}
	
	@Override
	public ITransform3WF setScale(IVec3RF scale)
	{
		this.scaleX = scale.x();
		this.scaleY = scale.y();
		this.scaleZ = scale.z();
		
		return this;
	}
	
	@Override
	public ITransform3WF setScale(float[] scale)
	{
		this.scaleX = scale[0];
		this.scaleY = scale[1];
		this.scaleZ = scale[2];
		
		return this;
	}
	
	@Override
	public ITransform3WF setScale(float scaleX, float scaleY, float scaleZ)
	{
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.scaleZ = scaleZ;
		
		return this;
	}
	
	@Override
	public ITransform3WF scaleX(float x)
	{
		this.scaleX = x;
		
		return this;
	}
	
	@Override
	public ITransform3WF scaleY(float y)
	{
		this.scaleY = y;
		
		return this;
	}
	
	@Override
	public ITransform3WF scaleZ(float z)
	{
		this.scaleZ = z;
		
		return this;
	}
	
}
