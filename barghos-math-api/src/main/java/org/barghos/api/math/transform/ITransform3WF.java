package org.barghos.api.math.transform;

import org.barghos.api.math.quaternion.IQuatRF;
import org.barghos.api.math.vector.floats.IVec3RF;

public interface ITransform3WF extends ITransform3RF
{
	ITransform3WF set(ITransform3RF t);
	
	ITransform3WF set(float[] t);
	
	ITransform3WF setPos(IVec3RF pos);
	
	ITransform3WF setPos(float[] pos);
	
	ITransform3WF setPos(float posX, float posY, float posZ);
	
	ITransform3WF posX(float x);
	
	ITransform3WF posY(float y);
	
	ITransform3WF posZ(float z);
	
	ITransform3WF setRot(IQuatRF rot);
	
	ITransform3WF setRot(float[] rot);
	
	ITransform3WF setRot(float rotX, float rotY, float rotZ, float rotW);
	
	ITransform3WF rotX(float x);
	
	ITransform3WF rotY(float y);
	
	ITransform3WF rotZ(float z);
	
	ITransform3WF rotW(float w);
	
	ITransform3WF setScale(IVec3RF scale);
	
	ITransform3WF setScale(float[] scale);
	
	ITransform3WF setScale(float scaleX, float scaleY, float scaleZ);
	
	ITransform3WF scaleX(float x);
	
	ITransform3WF scaleY(float y);
	
	ITransform3WF scaleZ(float z);
}
