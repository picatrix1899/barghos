package org.barghos.math.api.transform;

import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.vector.Vec3fC;

public interface HirarchicalTransform3fR extends Transform3fR
{
	Transform3fR getParent();
	
	// MISSING_DOC
	Vec3fC getRelativePos();
	
	// MISSING_DOC
	float[] getRelativePos(@ExtractParam float[] res);
	
	// MISSING_DOC
	<T extends Vec3fC> T getRelativePos(@ExtractParam T res);
	
	// MISSING_DOC
	Vec3fC getRelativeScale();
	
	// MISSING_DOC
	float[] getRelativeScale(@ExtractParam float[] res);
	
	// MISSING_DOC
	<T extends Vec3fC> T getRelativeScale(@ExtractParam T res);
	
	// MISSING_DOC
	Orientation3fC getRelativeOrientation();
	
	// MISSING_DOC
	Mat4fC getRelativeTranslationMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRelativeTranslationMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRelativeScalingMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRelativeScalingMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRelativeRotationMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRelativeRotationMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRelativeRotationMatrix(boolean rightHanded);
	
	// MISSING_DOC
	<T extends Mat4fC> T getRelativeRotationMatrix(boolean rightHanded, @ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRelativeRotationMatrixRH();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRelativeRotationMatrixRH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRelativeRotationMatrixLH();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRelativeRotationMatrixLH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRelativeTransformationMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T toRelativeTransformationMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRelativeTransformationMatrix(boolean rightHanded);
	
	// MISSING_DOC
	<T extends Mat4fC> T toRelativeTransformationMatrix(boolean rightHanded, @ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRelativeTransformationMatrixRH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toRelativeTransformationMatrixRH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRelativeTransformationMatrixLH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toRelativeTransformationMatrixLH(@ExtractParam T res);
}
