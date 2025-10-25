package org.barghos.impl.math.transform;

import org.barghos.impl.math.quaternion.QuatF;
import org.barghos.impl.math.vector.Vec3F;

public class PhysicalTransformQuat3F
{
	public final Vec3F pos = new Vec3F();
	public final QuatF rot = new QuatF();
	public final Vec3F scale = new Vec3F();
	
	public final Vec3F velocity = new Vec3F();
	public final Vec3F angularVelocity = new Vec3F();
	public final Vec3F expansionVelocity = new Vec3F();
	
	public final Vec3F acceleration = new Vec3F();
	public final Vec3F angularAcceleration = new Vec3F();
	public final Vec3F expansionAcceleration = new Vec3F();
}
