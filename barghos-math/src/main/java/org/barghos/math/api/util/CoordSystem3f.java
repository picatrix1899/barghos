package org.barghos.math.api.util;

import org.barghos.math.api.matrix.Mat4fC;

public interface CoordSystem3f
{
	public boolean isRightHanded();
	
	public Mat4fC toMatrix();
}
