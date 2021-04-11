package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fW;

public interface Vec2fW extends Tup2fW
{
	Vec2fW setX(float x);
	Vec2fW setY(float y);
	
	Vec2fW set(Tup2fR t);
	Vec2fW set(float value);
	Vec2fW set(float x, float y);
}
