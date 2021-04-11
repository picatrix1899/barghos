package org.barghos.math.api.vec2;

import java.math.BigInteger;

import org.barghos.core.api.tuple2.Tup2bigiR;
import org.barghos.core.api.tuple2.Tup2bigiW;

public interface Vec2bigiW extends Tup2bigiW
{
	Vec2bigiW setX(BigInteger x);
	Vec2bigiW setY(BigInteger y);
	
	Vec2bigiW set(Tup2bigiR t);
	Vec2bigiW set(BigInteger value);
	Vec2bigiW set(BigInteger x, BigInteger y);
}
