package org.barghos.api.math.line;

import org.barghos.api.math.vector.floats.IVec2RF;

public interface IRay2WF extends IRay2RF
{
	IRay2WF set(IRay2RF ray);
	
	IRay2WF set(float[] ray);
	
	IRay2WF set(IVec2RF o, IVec2RF d);
	
	IRay2WF set(IVec2RF o, float[] d);
	
	IRay2WF set(IVec2RF o, float dX, float dY);
	
	IRay2WF set(float[] o, IVec2RF d);
	
	IRay2WF set(float[] o, float[] d);
	
	IRay2WF set(float[] o, float dX, float dY);
	
	IRay2WF set(float oX, float oY, IVec2RF d);
	
	IRay2WF set(float oX, float oY, float[] d);
	
	IRay2WF set(float oX, float oY, float dX, float dY);
	
	IRay2WF setOrigin(IVec2RF o);
	
	IRay2WF setOrigin(float[] o);
	
	IRay2WF setOrigin(float x, float y);
	
	IRay2WF originX(float x);
	
	IRay2WF originY(float y);
	
	IRay2WF setDirection(IVec2RF o);
	
	IRay2WF setDirection(float[] d);
	
	IRay2WF setDirection(float x, float y);
	
	IRay2WF directionX(float x);
	
	IRay2WF directionY(float y);
}
