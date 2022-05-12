package org.barghos.math.api.transform;

import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.vector.QuatfC;

// MISSING_DOC
public interface Orientation3fR
{
	// MISSING_DOC
	QuatfC toQuaternion();
	
	// MISSING_DOC
	<T extends QuatfC> T toQuaternion(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRotationMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T toRotationMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRotationMatrix(boolean rightHanded);
	
	// MISSING_DOC
	<T extends Mat4fC> T toRotationMatrix(boolean rightHanded, @ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRotationMatrixRH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toRotationMatrixRH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toRotationMatrixLH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toRotationMatrixLH(@ExtractParam T res);
}
