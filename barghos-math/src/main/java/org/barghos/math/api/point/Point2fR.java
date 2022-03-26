package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.math.api.vector.Vec2fBase;
import org.barghos.math.api.vector.Vec2fR;

/**
 * This interface grants readonly access to any 2-dimensional float point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Point2fR extends Tup2fR
{
	// MISSING_DOC
	Vec2fR asReadonlyVector();
	
	// MISSING_DOC
	<T extends Vec2fBase> T asVector(T res);
	
	// MISSING_DOC
	Vec2fBase vectorTo(Point2fR p);
	
	// MISSING_DOC
	<T extends Vec2fBase> T vectorTo(Point2fR p, T res);
	
	// MISSING_DOC
	Vec2fBase vectorFrom(Point2fR p);
	
	// MISSING_DOC
	<T extends Vec2fBase> T vectorFrom(Point2fR p, T res);
}
