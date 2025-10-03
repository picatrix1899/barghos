package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.annotation.AllowNull;

/**
 * This interface provides non-modifying operations for float tuples.
 * Therefore the operations of this interface will not alter the component
 * values of this tuple nor the size of this tuple.
 * 
 * <p>
 * Whether the tuple allows to create new tuple instances with different sizes
 * than the size of this tuple is left to the implementation. However every
 * implementation guarantees to support the creation of tuples of the same
 * size.
 */
public interface ITupRF
{

	int size();

	float getAt(int index);

	float[] toArray();

	float[] toArray(@ExtractionParam float[] res);

	boolean isFinite();

	boolean isFiniteAt(int index);

	boolean isInfinite();

	boolean isInfiniteAt(int index);

	boolean isNaN();

	boolean isNaNAt(int index);

	boolean isZero();

	boolean isZeroEM(float tolerance);
	
	boolean isZeroEM4();
	
	boolean isZeroEM6();
	
	boolean isZeroEM8();

	boolean isZeroAt(int index);

	boolean isZeroAtEM(float tolerance, int index);
	
	boolean isZeroAtEM4(int index);
	
	boolean isZeroAtEM6(int index);
	
	boolean isZeroAtEM8(int index);

	boolean equals(@AllowNull ITupRF t);

	boolean equals(@AllowNull float[] t);

	boolean equalsEM(float tolerance, @AllowNull ITupRF t);

	boolean equalsEM(float tolerance, @AllowNull float[] t);
	
	boolean equalsEM4(@AllowNull ITupRF t);

	boolean equalsEM4(@AllowNull float[] t);
	
	boolean equalsEM6(@AllowNull ITupRF t);

	boolean equalsEM6(@AllowNull float[] t);
	
	boolean equalsEM8(@AllowNull ITupRF t);

	boolean equalsEM8(@AllowNull float[] t);

	boolean equalsAt(int index, @AllowNull ITupRF t);

	boolean equalsAt(int index, @AllowNull float[] t);

	boolean equalsAt(int index, float value);

	boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t);

	boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t);

	boolean equalsAtEM(float tolerance, int index, float value);
	
	boolean equalsAtEM4(int index, @AllowNull ITupRF t);

	boolean equalsAtEM4(int index, @AllowNull float[] t);

	boolean equalsAtEM4(int index, float value);
	
	boolean equalsAtEM6(int index, @AllowNull ITupRF t);
	
	boolean equalsAtEM6(int index, @AllowNull float[] t);

	boolean equalsAtEM6(int index, float value);
	
	boolean equalsAtEM8(int index, @AllowNull ITupRF t);

	boolean equalsAtEM8(int index, @AllowNull float[] t);

	boolean equalsAtEM8(int index, float value);
	
}
