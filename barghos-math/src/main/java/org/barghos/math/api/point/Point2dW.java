package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2dW;
import org.barghos.math.api.vector.Vec2dW;

/**
 * This interface grants writeonly access to any 2-dimensional double point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Point2dW extends Tup2dW
{
	Vec2dW asWriteonlyVector();
	Vec2dW asWriteonlyVectorReference();
}
