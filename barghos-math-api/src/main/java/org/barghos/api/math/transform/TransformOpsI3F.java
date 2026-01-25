package org.barghos.api.math.transform;

import org.barghos.annotation.ExtractionParam;
import org.barghos.math.quaternion.QuatOpsF;
import org.barghos.math.vector.floats.BaseVecOps3F;
import org.barghos.math.vector.floats.QuatVecOps3F;

public class TransformOpsI3F
{
	public static <T extends ITransform3WF> T mul(ITransform3RF t1, ITransform3RF t2, @ExtractionParam T res)
	{
		float t1PosX = t1.posX();
		float t1PosY = t1.posY();
		float t1PosZ = t1.posZ();
		float t1RotX = t1.rotX();
		float t1RotY = t1.rotY();
		float t1RotZ = t1.rotZ();
		float t1RotW = t1.rotW();
		float t1SclX = t1.scaleX();
		float t1SclY = t1.scaleY();
		float t1SclZ = t1.scaleZ();
		
		float t2PosX = t2.posX();
		float t2PosY = t2.posY();
		float t2PosZ = t2.posZ();
		float t2RotX = t2.rotX();
		float t2RotY = t2.rotY();
		float t2RotZ = t2.rotZ();
		float t2RotW = t2.rotW();
		float t2SclX = t2.scaleX();
		float t2SclY = t2.scaleY();
		float t2SclZ = t2.scaleZ();
		
		float[] scaled = BaseVecOps3F.mul(t2SclX, t2SclY, t2SclZ, t1PosX, t1PosY, t1PosZ, new float[3]);
		float[] rotated = QuatVecOps3F.transformAssign(scaled, t2RotX, t2RotY, t2RotZ, t2RotW);
		
		float[] resPos = BaseVecOps3F.add(t2PosX, t2PosY, t2PosZ, rotated, rotated);
		float[] resRot = QuatOpsF.mul(t2RotX, t2RotY, t2RotZ, t2RotW, t1RotX, t1RotY, t1RotZ, t1RotW, new float[4]);
		float[] resScl = BaseVecOps3F.mul(t2SclX, t2SclY, t2SclZ, t1SclX, t1SclY, t1SclZ, new float[3]);
		
		res.pos(resPos);
		res.rot(resRot);
		res.scale(resScl);
		
		return res;
	}
}
