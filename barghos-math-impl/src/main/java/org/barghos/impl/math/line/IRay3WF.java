package org.barghos.impl.math.line;

import org.barghos.api.core.tuple.floats.ITup3RF;

public interface IRay3WF extends IRay3RF
{
	IRay3WF set(IRay3RF ray);
	
	IRay3WF set(float[] ray);
	
	IRay3WF set(ITup3RF o, ITup3RF d);
	
	IRay3WF set(ITup3RF o, float[] d);
	
	IRay3WF set(ITup3RF o, float dX, float dY, float dZ);
	
	IRay3WF set(float[] o, ITup3RF d);
	
	IRay3WF set(float[] o, float[] d);
	
	IRay3WF set(float[] o, float dX, float dY, float dZ);
	
	IRay3WF set(float oX, float oY, float oZ, ITup3RF d);
	
	IRay3WF set(float oX, float oY, float oZ, float[] d);
	
	IRay3WF set(float oX, float oY, float oZ, float dX, float dY, float dZ);
	
	IRay3WF setOrigin(ITup3RF o);
	
	IRay3WF setOrigin(float[] o);
	
	IRay3WF setOrigin(float x, float y, float z);
	
	IRay3WF originX(float x);
	
	IRay3WF originY(float y);
	
	IRay3WF originZ(float z);
	
	IRay3WF setDirection(ITup3RF o);
	
	IRay3WF setDirection(float[] d);
	
	IRay3WF setDirection(float x, float y, float z);
	
	IRay3WF directionX(float x);
	
	IRay3WF directionY(float y);
	
	IRay3WF directionZ(float z);
}
