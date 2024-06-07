package org.barghos.math.vector;

import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.TupRF;

public interface VecFactory2F
{
	Vec2WF get();
	
	Vec2WF get(Tup2RF t);
	
	Vec2WF get(TupRF t);
	
	Vec2WF get(float value);
	
	Vec2WF get(float x, float y);
	
	Vec2WF temp();
	
	Vec2WF temp(Tup2RF t);
	
	Vec2WF temp(TupRF t);
	
	Vec2WF temp(float value);
	
	Vec2WF temp(float x, float y);
	
	void store(Vec2WF v);
	
	Vec2RF immutable(Tup2RF t);
	
	Vec2RF immutable(TupRF t);
	
	Vec2RF immutable(float value);
	
	Vec2RF immutable(float x, float y);
}
