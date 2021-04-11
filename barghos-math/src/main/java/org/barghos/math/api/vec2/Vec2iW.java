package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2iR;
import org.barghos.core.api.tuple2.Tup2iW;

public interface Vec2iW extends Tup2iW
{
	Vec2iW setX(int x);
	Vec2iW setY(int y);
	
	Vec2iW set(Tup2iR t);
	Vec2iW set(int value);
	Vec2iW set(int x, int y);
}
