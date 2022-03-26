package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.math.api.vector.Vec2dBase;
import org.barghos.math.api.vector.Vec2dR;

/**
 * This interface grants readonly access to any 2-dimensional double point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Point2dR extends Tup2dR
{
	// MISSING_DOC
	Vec2dR asReadonlyVector();
	
	// MISSING_DOC
	<T extends Vec2dBase> T asVector(T res);
	
	// MISSING_DOC
	Vec2dBase vectorTo(Point2dR p);
	
	// MISSING_DOC
	<T extends Vec2dBase> T vectorTo(Point2dR p, T res);
	
	// MISSING_DOC
	Vec2dBase vectorFrom(Point2dR p);
	
	// MISSING_DOC
	<T extends Vec2dBase> T vectorFrom(Point2dR p, T res);
}
