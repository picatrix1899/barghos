package org.barghos.math.api.transform;

import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.matrix.Mat4fC;
import org.barghos.math.api.vector.Vec3fR;

// MISSING_DOC
public interface SystemOrientation3fR
{
	// MISSING_DOC
	Vec3fR getForward();
	
	// MISSING_DOC
	<T extends Tup3fC> T getForward(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getForward(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fR getBack();
	
	// MISSING_DOC
	<T extends Tup3fC> T getBack(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getBack(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fR getRight();
	
	// MISSING_DOC
	<T extends Tup3fC> T getRight(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getRight(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fR getLeft();
	
	// MISSING_DOC
	<T extends Tup3fC> T getLeft(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getLeft(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fR getUp();
	
	// MISSING_DOC
	<T extends Tup3fC> T getUp(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getUp(@ExtractParam float[] res);
	
	// MISSING_DOC
	Vec3fR getDown();
	
	// MISSING_DOC
	<T extends Tup3fC> T getDown(@ExtractParam T res);
	
	// MISSING_DOC
	float[] getDown(@ExtractParam float[] res);
	
	// MISSING_DOC
	Mat4fC toMatrix();
	
	// MISSING_DOC
	<T extends Mat4fC> T toMatrix(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toMatrix(boolean rightHanded);
	
	// MISSING_DOC
	<T extends Mat4fC> T toMatrix(boolean rightHanded, @ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toMatrixRH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toMatrixRH(@ExtractParam T res);
	
	// MISSING_DOC
	Mat4fC toMatrixLH();
	
	// MISSING_DOC
	<T extends Mat4fC> T toMatrixLH(@ExtractParam T res);
}
