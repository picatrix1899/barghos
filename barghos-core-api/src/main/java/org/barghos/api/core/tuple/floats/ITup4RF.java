package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.AllowNull;

/**
 * This interface provides non-modifying operations for float tuples with 
 * four components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup4RF extends ITupRF
{
	@Override
	default int size()
	{
		return 4;
	}

	float v0();

	float v1();

	float v2();

	float v3();

	@Override
	float getAt(int index);

	@Override
	float[] toArray();

	@Override
	float[] toArray(@ExtractionParam float[] res);

	@Override
	boolean isFiniteAt(int index);
	
	boolean isFiniteAtV0();

	boolean isFiniteAtV1();

	boolean isFiniteAtV2();

	boolean isFiniteAtV3();

	@Override
	boolean isInfiniteAt(int index);

	boolean isInfiniteAtV0();

	boolean isInfiniteAtV1();

	boolean isInfiniteAtV2();

	boolean isInfiniteAtV3();

	@Override
	boolean isNaNAt(int index);

	boolean isNaNAtV0();

	boolean isNaNAtV1();

	boolean isNaNAtV2();

	boolean isNaNAtV3();

	@Override
	boolean isZeroAt(int index);

	@Override
	boolean isZeroAtEM(float tolerance, int index);
	
	@Override
	boolean isZeroAtEM4(int index);
	
	@Override
	boolean isZeroAtEM6(int index);
	
	@Override
	boolean isZeroAtEM8(int index);

	boolean isZeroAtV0();

	boolean isZeroAtV0EM(float tolerance);
	
	boolean isZeroAtV0EM4();
	
	boolean isZeroAtV0EM6();
	
	boolean isZeroAtV0EM8();

	boolean isZeroAtV1();

	boolean isZeroAtV1EM(float tolerance);
	
	boolean isZeroAtV1EM4();
	
	boolean isZeroAtV1EM6();
	
	boolean isZeroAtV1EM8();

	boolean isZeroAtV2();

	boolean isZeroAtV2EM(float tolerance);
	
	boolean isZeroAtV2EM4();
	
	boolean isZeroAtV2EM6();
	
	boolean isZeroAtV2EM8();

	boolean isZeroAtV3();

	boolean isZeroAtV3EM(float tolerance);
	
	boolean isZeroAtV3EM4();
	
	boolean isZeroAtV3EM6();
	
	boolean isZeroAtV3EM8();
	
	boolean equals(@AllowNull ITup4RF t);

	@Override
	boolean equals(@AllowNull ITupRF t);

	@Override
	boolean equals(@AllowNull float[] t);

	boolean equals(float v0, float v1, float v2, float v3);

	boolean equalsEM(float tolerance, @AllowNull ITup4RF t);

	@Override
	boolean equalsEM(float tolerance, @AllowNull ITupRF t);

	@Override
	boolean equalsEM(float tolerance, @AllowNull float[] t);
	
	boolean equalsEM(float tolerance, float v0, float v1, float v2, float v3);
	
	boolean equalsEM4(@AllowNull ITup4RF t);
	
	@Override
	boolean equalsEM4(@AllowNull ITupRF t);

	@Override
	boolean equalsEM4(@AllowNull float[] t);

	boolean equalsEM4(float v0, float v1, float v2, float v3);
	
	boolean equalsEM6(@AllowNull ITup4RF t);
	
	@Override
	boolean equalsEM6(@AllowNull ITupRF t);

	@Override
	boolean equalsEM6(@AllowNull float[] t);

	boolean equalsEM6(float v0, float v1, float v2, float v3);
	
	boolean equalsEM8(@AllowNull ITup4RF t);
	
	@Override
	boolean equalsEM8(@AllowNull ITupRF t);

	@Override
	boolean equalsEM8(@AllowNull float[] t);

	boolean equalsEM8(float v0, float v1, float v2, float v3);

	boolean equalsAt(int index, @AllowNull ITup4RF t);

	@Override
	boolean equalsAt(int index, @AllowNull ITupRF t);

	@Override
	boolean equalsAt(int index, @AllowNull float[] t);

	@Override
	boolean equalsAt(int index, float value);

	boolean equalsAtEM(float tolerance, int index, @AllowNull ITup4RF t);

	@Override
	boolean equalsAtEM(float tolerance, int index, @AllowNull ITupRF t);

	@Override
	boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t);

	@Override
	boolean equalsAtEM(float tolerance, int index, float value);
	
	boolean equalsAtEM4(int index, @AllowNull ITup4RF t);

	@Override
	boolean equalsAtEM4(int index, @AllowNull ITupRF t);

	@Override
	boolean equalsAtEM4(int index, @AllowNull float[] t);

	@Override
	boolean equalsAtEM4(int index, float value);
	
	boolean equalsAtEM6(int index, @AllowNull ITup4RF t);

	@Override
	boolean equalsAtEM6(int index, @AllowNull ITupRF t);

	@Override
	boolean equalsAtEM6(int index, @AllowNull float[] t);

	@Override
	boolean equalsAtEM6(int index, float value);
	
	boolean equalsAtEM8(int index, @AllowNull ITup4RF t);

	@Override
	boolean equalsAtEM8(int index, @AllowNull ITupRF t);

	@Override
	boolean equalsAtEM8(int index, @AllowNull float[] t);

	@Override
	boolean equalsAtEM8(int index, float value);

	boolean equalsAtV0(@AllowNull ITup4RF t);

	boolean equalsAtV0(@AllowNull ITupRF t);

	boolean equalsAtV0(@AllowNull float[] t);

	boolean equalsAtV0(float value);

	boolean equalsAtV0EM(float tolerance, @AllowNull ITup4RF t);

	boolean equalsAtV0EM(float tolerance, @AllowNull ITupRF t);

	boolean equalsAtV0EM(float tolerance, @AllowNull float[] t);

	boolean equalsAtV0EM(float tolerance, float value);
	
	boolean equalsAtV0EM4(@AllowNull ITup4RF t);

	boolean equalsAtV0EM4(@AllowNull ITupRF t);

	boolean equalsAtV0EM4(@AllowNull float[] t);

	boolean equalsAtV0EM4(float value);
	
	boolean equalsAtV0EM6(@AllowNull ITup4RF t);

	boolean equalsAtV0EM6(@AllowNull ITupRF t);

	boolean equalsAtV0EM6(@AllowNull float[] t);

	boolean equalsAtV0EM6(float value);
	
	boolean equalsAtV0EM8(@AllowNull ITup4RF t);

	boolean equalsAtV0EM8(@AllowNull ITupRF t);

	boolean equalsAtV0EM8(@AllowNull float[] t);

	boolean equalsAtV0EM8(float value);

	boolean equalsAtV1(@AllowNull ITup4RF t);
	
	boolean equalsAtV1(@AllowNull ITupRF t);

	boolean equalsAtV1(@AllowNull float[] t);

	boolean equalsAtV1(float value);

	boolean equalsAtV1EM(float tolerance, @AllowNull ITup4RF t);

	boolean equalsAtV1EM(float tolerance, @AllowNull ITupRF t);

	boolean equalsAtV1EM(float tolerance, @AllowNull float[] t);

	boolean equalsAtV1EM(float tolerance, float value);
	
	boolean equalsAtV1EM4(@AllowNull ITup4RF t);

	boolean equalsAtV1EM4(@AllowNull ITupRF t);

	boolean equalsAtV1EM4(@AllowNull float[] t);

	boolean equalsAtV1EM4(float value);
	
	boolean equalsAtV1EM6(@AllowNull ITup4RF t);

	boolean equalsAtV1EM6(@AllowNull ITupRF t);

	boolean equalsAtV1EM6(@AllowNull float[] t);

	boolean equalsAtV1EM6(float value);
	
	boolean equalsAtV1EM8(@AllowNull ITup4RF t);

	boolean equalsAtV1EM8(@AllowNull ITupRF t);

	boolean equalsAtV1EM8(@AllowNull float[] t);

	boolean equalsAtV1EM8(float value);

	boolean equalsAtV2(@AllowNull ITup4RF t);

	boolean equalsAtV2(@AllowNull ITupRF t);

	boolean equalsAtV2(@AllowNull float[] t);

	boolean equalsAtV2(float value);

	boolean equalsAtV2EM(float tolerance, @AllowNull ITup4RF t);

	boolean equalsAtV2EM(float tolerance, @AllowNull ITupRF t);

	boolean equalsAtV2EM(float tolerance, @AllowNull float[] t);

	boolean equalsAtV2EM(float tolerance, float value);
	
	boolean equalsAtV2EM4(@AllowNull ITup4RF t);
	
	boolean equalsAtV2EM4(@AllowNull ITupRF t);

	boolean equalsAtV2EM4(@AllowNull float[] t);

	boolean equalsAtV2EM4(float value);
	
	boolean equalsAtV2EM6(@AllowNull ITup4RF t);
	
	boolean equalsAtV2EM6(@AllowNull ITupRF t);

	boolean equalsAtV2EM6(@AllowNull float[] t);

	boolean equalsAtV2EM6(float value);
	
	boolean equalsAtV2EM8(@AllowNull ITup4RF t);
	
	boolean equalsAtV2EM8(@AllowNull ITupRF t);

	boolean equalsAtV2EM8(@AllowNull float[] t);

	boolean equalsAtV2EM8(float value);

	boolean equalsAtV3(@AllowNull ITup4RF t);

	boolean equalsAtV3(@AllowNull ITupRF t);

	boolean equalsAtV3(@AllowNull float[] t);

	boolean equalsAtV3(float value);

	boolean equalsAtV3EM(float tolerance, @AllowNull ITup4RF t);

	boolean equalsAtV3EM(float tolerance, @AllowNull ITupRF t);

	boolean equalsAtV3EM(float tolerance, @AllowNull float[] t);

	boolean equalsAtV3EM(float tolerance, float value);
	
	boolean equalsAtV3EM4(@AllowNull ITup4RF t);
	
	boolean equalsAtV3EM4(@AllowNull ITupRF t);

	boolean equalsAtV3EM4(@AllowNull float[] t);

	boolean equalsAtV3EM4(float value);
	
	boolean equalsAtV3EM6(@AllowNull ITup4RF t);
	
	boolean equalsAtV3EM6(@AllowNull ITupRF t);

	boolean equalsAtV3EM6(@AllowNull float[] t);

	boolean equalsAtV3EM6(float value);
	
	boolean equalsAtV3EM8(@AllowNull ITup4RF t);
	
	boolean equalsAtV3EM8(@AllowNull ITupRF t);

	boolean equalsAtV3EM8(@AllowNull float[] t);

	boolean equalsAtV3EM8(float value);
	
}