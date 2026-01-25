package org.barghos.api.math.transform;

import org.barghos.api.math.quaternion.IQuatRF;
import org.barghos.api.math.vector.floats.IVec3RF;

public interface ITransform3WF extends ITransform3RF
{
	ITransform3WF set(ITransform3RF t);
	
	ITransform3WF set(float[] t);
	
	ITransform3WF pos(IVec3RF pos);
	
	ITransform3WF pos(float[] pos);
	
	ITransform3WF pos(float posX, float posY, float posZ);
	
	ITransform3WF posX(float x);
	
	ITransform3WF posY(float y);
	
	ITransform3WF posZ(float z);
	
	ITransform3WF rot(IQuatRF rot);
	
	ITransform3WF rot(float[] rot);
	
	ITransform3WF scale(IVec3RF scale);
	
	ITransform3WF scale(float[] scale);
	
	ITransform3WF scale(float scaleX, float scaleY, float scaleZ);
	
	ITransform3WF scaleX(float x);
	
	ITransform3WF scaleY(float y);
	
	ITransform3WF scaleZ(float z);
}
