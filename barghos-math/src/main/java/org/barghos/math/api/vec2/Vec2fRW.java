package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fRW;

public interface Vec2fRW extends Vec2fR, Vec2fW, Tup2fRW
{
	Vec2fRW setX(float x);
	Vec2fRW setY(float y);
	
	Vec2fRW set(Tup2fR t);
	Vec2fRW set(float value);
	Vec2fRW set(float x, float y);
}
