package org.barghos.math.api.vec2;

import java.math.BigDecimal;

import org.barghos.core.api.tuple2.Tup2bigdR;
import org.barghos.core.api.tuple2.Tup2bigdW;

public interface Vec2bigdW extends Tup2bigdW
{
	Vec2bigdW setX(BigDecimal x);
	Vec2bigdW setY(BigDecimal y);
	
	Vec2bigdW set(Tup2bigdR t);
	Vec2bigdW set(BigDecimal value);
	Vec2bigdW set(BigDecimal x, BigDecimal y);
}
