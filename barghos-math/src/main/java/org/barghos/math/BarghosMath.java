package org.barghos.math;

import org.barghos.math.api.util.CoordSystem3f;
import org.barghos.math.util.CartesianCoordSystem3f;
import org.barghos.math.vector.Vec3f;

public class BarghosMath
{
	public static CoordSystem3f DEFAULT_COORD_SYSTEM_3f = new CartesianCoordSystem3f(new Vec3f(1, 0, 0), new Vec3f(0, 1, 0), new Vec3f(0, 0, 1));
}
