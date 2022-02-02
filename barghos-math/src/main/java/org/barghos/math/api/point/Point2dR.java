package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.math.api.vector.Vec2dR;
import org.barghos.math.api.vector.Vec2dRW;
import org.barghos.math.api.vector.Vec2dW;

/**
 * This interface grants readonly access to any 2-dimensional double point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Point2dR extends Tup2dR
{
	Vec2dR asReadonlyVector();
	Vec2dR asReadonlyVectorReference();
	<T extends Vec2dW> T asVector(T res);
	
	Vec2dRW vectorTo(Point2dR p);
	<T extends Vec2dW> T vectorTo(Point2dR p, T res);
	
	Vec2dRW vectorFrom(Point2dR p);
	<T extends Vec2dW> T vectorFrom(Point2dR p, T res);
}
