package org.barghos.api.math.transform;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.LerpUtils;
import org.barghos.math.quaternion.LerpQuatOpsF;

public class LerpTransformOpsI3F
{
	private LerpTransformOpsI3F() { }
	
	public static <T extends ITransform3WF> T lerp(float alpha, ITransform3RF t1, ITransform3RF t2, @ExtractionParam T res)
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
		
		float resPosX = LerpUtils.lerp(alpha, t1PosX, t2PosX);
		float resPosY = LerpUtils.lerp(alpha, t1PosY, t2PosY);
		float resPosZ = LerpUtils.lerp(alpha, t1PosZ, t2PosZ);
		
		float[] resRot = LerpQuatOpsF.nlerp(alpha, t1RotX, t1RotY, t1RotZ, t1RotW, t2RotX, t2RotY, t2RotZ, t2RotW, new float[4]);
		
		float resSclX = LerpUtils.lerp(alpha, t1SclX, t2SclX);
		float resSclY = LerpUtils.lerp(alpha, t1SclY, t2SclY);
		float resSclZ = LerpUtils.lerp(alpha, t1SclZ, t2SclZ);
		
		res.setPos(resPosX, resPosY, resPosZ);
		res.setRot(resRot);
		res.setScale(resSclX, resSclY, resSclZ);
		
		return res;
	}
	
}
