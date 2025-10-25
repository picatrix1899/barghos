package org.barghos.impl.math.transform;

import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup4RF;

public interface IPhysicalTransform3WF extends IPhysicalTransform3RF, ITransform3WF
{
	IPhysicalTransform3WF set(float[] t);
	
	IPhysicalTransform3WF setPos(ITup3RF pos);
	
	IPhysicalTransform3WF setPos(float[] pos);
	
	IPhysicalTransform3WF setPos(float posX, float posY, float posZ);
	
	IPhysicalTransform3WF posX(float x);
	
	IPhysicalTransform3WF posY(float y);
	
	IPhysicalTransform3WF posZ(float z);
	
	IPhysicalTransform3WF setRot(ITup4RF rot);
	
	IPhysicalTransform3WF setRot(float[] rot);
	
	IPhysicalTransform3WF setScale(ITup3RF scale);
	
	IPhysicalTransform3WF setScale(float[] scale);
	
	IPhysicalTransform3WF setScale(float scaleX, float scaleY, float scaleZ);
	
	IPhysicalTransform3WF scaleX(float x);
	
	IPhysicalTransform3WF scaleY(float y);
	
	IPhysicalTransform3WF scaleZ(float z);
	
	IPhysicalTransform3WF move(ITup3RF v);
	
	IPhysicalTransform3WF move(float[] v);
	
	IPhysicalTransform3WF move(float vX, float vY, float vZ);
	
	IPhysicalTransform3WF rotate(ITup4RF v);
	
	IPhysicalTransform3WF rotate(float[] v);
	
	IPhysicalTransform3WF grow(ITup3RF v);
	
	IPhysicalTransform3WF grow(float[] v);
	
	IPhysicalTransform3WF grow(float vX, float vY, float vZ);
	
	IPhysicalTransform3WF scaleBy(ITup3RF v);
	
	IPhysicalTransform3WF scaleBy(float[] v);
	
	IPhysicalTransform3WF scaleBy(float vX, float vY, float vZ);
}
