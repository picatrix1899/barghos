package org.barghos.math.api.vec2;

import java.math.BigDecimal;

import org.barghos.core.api.tuple2.Tup2bigdR;
import org.barghos.core.api.tuple2.Tup2bigdRW;

public interface Vec2bigdRW extends Vec2bigdR, Vec2bigdW, Tup2bigdRW
{
	Vec2bigdRW setX(BigDecimal x);
	Vec2bigdRW setY(BigDecimal y);
	
	Vec2bigdRW set(Tup2bigdR t);
	Vec2bigdRW set(BigDecimal value);
	Vec2bigdRW set(BigDecimal x, BigDecimal y);
}
