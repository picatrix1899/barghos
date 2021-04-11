package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2iR;
import org.barghos.core.api.tuple2.Tup2iRW;

public interface Vec2iRW extends Vec2iR, Vec2iW, Tup2iRW
{
	Vec2iRW setX(int x);
	Vec2iRW setY(int y);
	
	Vec2iRW set(Tup2iR t);
	Vec2iRW set(int value);
	Vec2iRW set(int x, int y);
}
