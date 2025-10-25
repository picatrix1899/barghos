package org.barghos.impl.math.transform;

import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup4RF;

public interface ITransform3WF extends ITransform3RF
{
	ITransform3WF set(float[] t);
	
	ITransform3WF setPos(ITup3RF pos);
	
	ITransform3WF setPos(float[] pos);
	
	ITransform3WF setPos(float posX, float posY, float posZ);
	
	ITransform3WF posX(float x);
	
	ITransform3WF posY(float y);
	
	ITransform3WF posZ(float z);
	
	ITransform3WF setRot(ITup4RF rot);
	
	ITransform3WF setRot(float[] rot);
	
	ITransform3WF setScale(ITup3RF scale);
	
	ITransform3WF setScale(float[] scale);
	
	ITransform3WF setScale(float scaleX, float scaleY, float scaleZ);
	
	ITransform3WF scaleX(float x);
	
	ITransform3WF scaleY(float y);
	
	ITransform3WF scaleZ(float z);
	
	ITransform3WF move(ITup3RF v);
	
	ITransform3WF move(float[] v);
	
	ITransform3WF move(float vX, float vY, float vZ);
	
	ITransform3WF rotate(ITup4RF v);
	
	ITransform3WF rotate(float[] v);
	
	ITransform3WF grow(ITup3RF v);
	
	ITransform3WF grow(float[] v);
	
	ITransform3WF grow(float vX, float vY, float vZ);
	
	ITransform3WF scaleBy(ITup3RF v);
	
	ITransform3WF scaleBy(float[] v);
	
	ITransform3WF scaleBy(float vX, float vY, float vZ);
}
