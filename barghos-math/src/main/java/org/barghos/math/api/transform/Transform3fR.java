package org.barghos.math.api.transform;

import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.vector.Vec3fC;

// MISSING_DOC
public interface Transform3fR
{
	// MISSING_DOC
	Vec3fC getPos();
	
	// MISSING_DOC
	float[] getPos(@ExtractParam float[] res);
	
	// MISSING_DOC
	<T extends Vec3fC> T getPos(@ExtractParam T res);
	
	// MISSING_DOC
	Vec3fC getScale();
	
	// MISSING_DOC
	float[] getScale(@ExtractParam float[] res);
	
	// MISSING_DOC
	<T extends Vec3fC> T getScale(@ExtractParam T res);
	
	// MISSING_DOC
	Orientation3fC getOrientation();
	
	// MISSING_DOC
	Mat4fC getTranslationMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T getTranslationMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getScalingMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T getScalingMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRotationMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRotationMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRotationMatrix(boolean rightHanded);
	
	// MISSING_DOC
	<T extends Mat4fC> T getRotationMatrix(boolean rightHanded, @ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRotationMatrixRH();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRotationMatrixRH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC getRotationMatrixLH();
	
	// MISSING_DOC
	<T extends Mat4fC> T getRotationMatrixLH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toTransformationMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T toTransformationMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toTransformationMatrix(boolean rightHanded);
	
	// MISSING_DOC
	<T extends Mat4fC> T toTransformationMatrix(boolean rightHanded, @ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toTransformationMatrixRH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toTransformationMatrixRH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toTransformationMatrixLH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toTransformationMatrixLH(@ExtractParam T res);
}
