package org.barghos.impl.math.transform;

import org.barghos.impl.math.vector.Vec3F;

public class MotionPosRotTransformEuler3F
{
	public final Vec3F pos = new Vec3F();
	public final Vec3F rot = new Vec3F();
	
	public final Vec3F velocity = new Vec3F();
	public final Vec3F angularVelocity = new Vec3F();
	
	public final Vec3F acceleration = new Vec3F();
	public final Vec3F angularAcceleration = new Vec3F();
}
