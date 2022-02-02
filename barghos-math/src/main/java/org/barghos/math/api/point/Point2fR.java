package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.api.vector.Vec2fRW;
import org.barghos.math.api.vector.Vec2fW;

/**
 * This interface grants readonly access to any 2-dimensional float point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Point2fR extends Tup2fR
{
	Vec2fR asReadonlyVector();
	Vec2fR asReadonlyVectorReference();
	<T extends Vec2fW> T asVector(T res);
	
	Vec2fRW vectorTo(Point2fR p);
	<T extends Vec2fW> T vectorTo(Point2fR p, T res);
	
	Vec2fRW vectorFrom(Point2fR p);
	<T extends Vec2fW> T vectorFrom(Point2fR p, T res);
}
