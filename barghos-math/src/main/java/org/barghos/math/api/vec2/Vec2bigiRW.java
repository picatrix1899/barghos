package org.barghos.math.api.vec2;

import java.math.BigInteger;

import org.barghos.core.api.tuple2.Tup2bigiR;
import org.barghos.core.api.tuple2.Tup2bigiRW;

public interface Vec2bigiRW extends Vec2bigiR, Vec2bigiW, Tup2bigiRW
{
	Vec2bigiRW setX(BigInteger x);
	Vec2bigiRW setY(BigInteger y);
	
	Vec2bigiRW set(Tup2bigiR t);
	Vec2bigiRW set(BigInteger value);
	Vec2bigiRW set(BigInteger x, BigInteger y);
}
