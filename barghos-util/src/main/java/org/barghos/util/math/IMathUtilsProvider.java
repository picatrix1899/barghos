package org.barghos.util.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IMathUtilsProvider
{
	long ceilDiv(long v0, long v1);

	int ceilDiv(int v0, int v1);

	long floorDiv(long v0, long v1);

	int floorDiv(int v0, int v1);
	
	double sqrt(double value);
	
	double sqrtF2D(float value);
	
	float sqrt(float value);

	double recSqrt(double value);
	
	double recSqrtF2D(float value);
	
	float recSqrt(float value);
	
	double invSqrt(double value);
	
	double invSqrtF2D(float value);
	
	float invSqrt(float value);

	double cbrt(double value);
	
	double cbrtF2D(float value);
	
	float cbrt(float value);

	double recCbrt(double value);
	
	double recCbrtF2D(float value);
	
	float recCbrt(float value);
	
	double invCbrt(double value);
	
	double invCbrtF2D(float value);
	
	float invCbrt(float value);
	
	double log(double value);
	
	double logF2D(float value);
	
	float log(float value);
	
	double log10(double value);
	
	double log10F2D(float value);
	
	float log10(float value);
	
	double log1p(double value);
	
	double log1pF2D(float value);
	
	float log1p(float value);
	
	double exp(double value);
	
	double expF2D(float value);
	
	float exp(float value);
	
	double expm1(double value);
	
	double expm1F2D(float value);
	
	float expm1(float value);
	
	double pow(double base, double power);
	
	double powF2D(float base, float power);
	
	float pow(float base, float power);
	
	double fma(double a, double b, double c);
	
	double fmaF2D(float a, float b, float c);
	
	float fma(float a, float b, float c);
	
	double sin(double angle);
	
	double sinF2D(float angle);
	
	float sin(float angle);
	
	double cos(double angle);
	
	double cosF2D(float angle);
	
	float cos(float angle);
	
	double tan(double angle);
	
	double tanF2D(float angle);
	
	float tan(float angle);
	
	double asin(double value);
	
	double asinF2D(float value);
	
	float asin(float value);
	
	double acos(double value);
	
	double acosF2D(float value);
	
	float acos(float value);
	
	double atan(double value);
	
	double atanF2D(float value);
	
	float atan(float value);
	
	double atan2(double y, double x);
	
	double atan2F2D(float y, float x);
	
	float atan2(float y, float x);
	
	double sinh(double angle);
	
	double sinhF2D(float angle);
	
	float sinh(float angle);
	
	double cosh(double angle);
	
	double coshF2D(float angle);
	
	float cosh(float angle);
	
	double tanh(double angle);
	
	double tanhF2D(float angle);
	
	float tanh(float angle);
	
	double hypot(double x, double y);
	
	double hypotF2D(float x, float y);
	
	float hypot(float x, float y);
	
	double cot(double angle);
	
	double cotF2D(float angle);
	
	float cot(float angle);
	
	double sec(double angle);
	
	double secF2D(float angle);
	
	float sec(float angle);
	
	double csc(double angle);
	
	double cscF2D(float angle);
	
	float csc(float angle);
	
	double frac(double value);
	
	double fracF2D(float value);
	
	float frac(float value);
	
	double integer(double value);
	
	double integerF2D(float value);
	
	float integer(float value);
	
	long integerD2L(double value);
	
	long integerF2L(float value);
	
	int integerF2I(float value);
	
	BigDecimal sign(BigDecimal value);
	
	BigDecimal signD2Bigd(double value);
	
	BigDecimal signF2Bigd(float value);
	
	BigDecimal signBigi2Bigd(BigInteger value);
	
	BigDecimal signL2Bigd(long value);
	
	BigDecimal signI2Bigd(int value);
	
	BigDecimal signS2Bigd(short value);
	
	BigDecimal signSB2Bigd(byte value);
	
	double signBigd2D(BigDecimal value);
	
	double sign(double value);
	
	double signF2D(float value);
	
	double signBigi2D(BigInteger value);
	
	double signL2D(long value);
	
	double signI2D(int value);
	
	double signS2D(short value);
	
	double signSB2D(byte value);
	
	float signBigd2F(BigDecimal value);
	
	float signD2F(double value);
	
	float sign(float value);
	
	float signBigi2F(BigInteger value);
	
	float signL2F(long value);
	
	float signI2F(int value);
	
	float signS2F(short value);
	
	float signSB2F(byte value);
	
	BigInteger signBigd2Bigi(BigDecimal value);
	
	BigInteger signD2Bigi(double value);
	
	BigInteger signF2Bigi(float value);
	
	BigInteger sign(BigInteger value);
	
	BigInteger signL2Bigi(long value);
	
	BigInteger signI2Bigi(int value);
	
	BigInteger signS2Bigi(short value);

	BigInteger signSB2Bigi(byte value);
	
	long signBigd2L(BigDecimal value);
	
	long signD2L(double value);
	
	long signF2L(float value);
	
	long signBigi2L(BigInteger value);
	
	long sign(long value);
	
	long signI2L(int value);
	
	long signS2L(short value);
	
	long signSB2L(byte value);
	
	int signBigd2I(BigDecimal value);
	
	int signD2I(double value);
	
	int signF2I(float value);
	
	int signBigi2I(BigInteger value);
	
	int signL2I(long value);
	
	int sign(int value);
	
	int signS2I(short value);
	
	int signSB2I(byte value);
	
	short signBigd2S(BigDecimal value);
	
	short signD2S(double value);
	
	short signF2S(float value);
	
	short signBigi2S(BigInteger value);
	
	short signL2S(long value);
	
	short signI2S(int value);
	
	short sign(short value);
	
	short signSB2S(byte value);
	
	byte signBigd2SB(BigDecimal value);
	
	byte signD2SB(double value);
	
	byte signF2SB(float value);
	
	byte signBigi2SB(BigInteger value);
	
	byte signL2SB(long value);
	
	byte signI2SB(int value);
	
	byte signS2SB(short value);
	
	byte sign(byte value);
	
	BigDecimal abs(BigDecimal value);
	
	BigDecimal absD2Bigd(double value);
	
	BigDecimal absF2Bigd(float value);
	
	BigDecimal absL2Bigd(long value);
	
	BigDecimal absI2Bigd(int value);
	
	BigDecimal absS2Bigd(short value);
	
	BigDecimal absSB2Bigd(byte value);
	
	double abs(double value);
	
	double absF2D(float value);
	
	double absL2D(long value);
	
	double absI2D(int value);
	
	double absS2D(short value);
	
	double absSB2D(byte value);

	float abs(float value);
	
	float absI2F(int value);
	
	float absS2F(short value);
	
	float absSB2F(byte value);

	BigInteger abs(BigInteger value);
	
	BigInteger absL2Bigi(long value);
	
	BigInteger absI2Bigi(int value);
	
	BigInteger absS2Bigi(short value);
	
	BigInteger absSB2Bigi(byte value);
	
	long abs(long value);
	
	long absI2L(int value);
	
	long absS2L(short value);
	
	long absSB2L(byte value);
	
	int abs(int value);
	
	int absS2I(short value);
	
	int absSB2I(byte value);
	
	short abs(short value);
	
	short absSB2S(byte value);
	
	byte abs(byte value);
	
	BigDecimal min(BigDecimal value1, BigDecimal value2);
	
	BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3);
	
	BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4);
	
	BigDecimal min(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5);
	
	BigDecimal min(BigDecimal... values);
	
	double min(double value1, double value2);
	
	double min(double value1, double value2, double value3);
	
	double min(double value1, double value2, double value3, double value4);
	
	double min(double value1, double value2, double value3, double value4, double value5);
	
	double min(double... values);
	
	float min(float value1, float value2);
	
	float min(float value1, float value2, float value3);
	
	float min(float value1, float value2, float value3, float value4);
	
	float min(float value1, float value2, float value3, float value4, float value5);
	
	float min(float... values);
	
	BigInteger min(BigInteger value1, BigInteger value2);
	
	BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3);
	
	BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4);
	
	BigInteger min(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5);
	
	BigInteger min(BigInteger... values);
	
	long min(long value1, long value2);
	
	long min(long value1, long value2, long value3);
	
	long min(long value1, long value2, long value3, long value4);
	
	long min(long value1, long value2, long value3, long value4, long value5);
	
	long min(long... values);
	
	int min(int value1, int value2);
	
	int min(int value1, int value2, int value3);
	
	int min(int value1, int value2, int value3, int value4);
	
	int min(int value1, int value2, int value3, int value4, int value5);
	
	int min(int... values);
	
	short min(short value1, short value2);
	
	short min(short value1, short value2, short value3);
	
	short min(short value1, short value2, short value3, short value4);
	
	short min(short value1, short value2, short value3, short value4, short value5);
	
	short min(short... values);
	
	byte min(byte value1, byte value2);
	
	byte min(byte value1, byte value2, byte value3);
	
	byte min(byte value1, byte value2, byte value3, byte value4);
	
	byte min(byte value1, byte value2, byte value3, byte value4, byte value5);
	
	byte min(byte... values);
	
	BigDecimal max(BigDecimal value1, BigDecimal value2);
	
	BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3);
	
	BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4);
	
	BigDecimal max(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5);
	
	BigDecimal max(BigDecimal... values);
	
	double max(double value1, double value2);
	
	double max(double value1, double value2, double value3);
	
	double max(double value1, double value2, double value3, double value4);
	
	double max(double value1, double value2, double value3, double value4, double value5);
	
	double max(double... values);
	
	float max(float value1, float value2);
	
	float max(float value1, float value2, float value3);
	
	float max(float value1, float value2, float value3, float value4);
	
	float max(float value1, float value2, float value3, float value4, float value5);
	
	float max(float... values);

	BigInteger max(BigInteger value1, BigInteger value2);
	
	BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3);
	
	BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4);
	
	BigInteger max(BigInteger value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5);
	
	BigInteger max(BigInteger... values);
	
	long max(long value1, long value2);
	
	long max(long value1, long value2, long value3);
	
	long max(long value1, long value2, long value3, long value4);
	
	long max(long value1, long value2, long value3, long value4, long value5);
	
	long max(long... values);
	
	int max(int value1, int value2);
	
	int max(int value1, int value2, int value3);
	
	int max(int value1, int value2, int value3, int value4);
	
	int max(int value1, int value2, int value3, int value4, int value5);
	
	int max(int... values);
	
	short max(short value1, short value2);
	
	short max(short value1, short value2, short value3);
	
	short max(short value1, short value2, short value3, short value4);
	
	short max(short value1, short value2, short value3, short value4, short value5);
	
	short max(short... values);
	
	byte max(byte value1, byte value2);
	
	byte max(byte value1, byte value2, byte value3);
	
	byte max(byte value1, byte value2, byte value3, byte value4);
	
	byte max(byte value1, byte value2, byte value3, byte value4, byte value5);
	
	byte max(byte... values);
	
	BigDecimal clampMin(BigDecimal value, BigDecimal min);
	
	double clampMin(double value, double min);
	
	float clampMin(float value, float min);
	
	BigInteger clampMin(BigInteger value, BigInteger min);
	
	long clampMin(long value, long min);
	
	int clampMin(int value, int min);
	
	short clampMin(short value, short min);
	
	byte clampMinSB(byte value, byte min);
	
	byte clampMinUB(byte value, byte min);
	
	BigDecimal clampMin(BigDecimal tolerance, BigDecimal value, BigDecimal min);
	
	double clampMin(double tolerance, double value, double min);
	
	float clampMin(float tolerance, float value, float min);
	
	BigInteger clampMin(BigInteger tolerance, BigInteger value, BigInteger min);
	
	long clampMin(long tolerance, long value, long min);
	
	int clampMin(int tolerance, int value, int min);
	
	short clampMin(short tolerance, short value, short min);
	
	byte clampMinSB(byte tolerance, byte value, byte min);
	
	byte clampMinUB(byte tolerance, byte value, byte min);
	
	BigDecimal clampMax(BigDecimal value, BigDecimal max);
	
	double clampMax(double value, double max);
	
	float clampMax(float value, float max);
	
	BigInteger clampMax(BigInteger value, BigInteger max);
	
	long clampMax(long value, long max);
	
	int clampMax(int value, int max);
	
	short clampMax(short value, short max);
	
	byte clampMaxSB(byte value, byte max);
	
	byte clampMaxUB(byte value, byte max);
	
	BigDecimal clampMax(BigDecimal tolerance, BigDecimal value, BigDecimal max);
	
	double clampMax(double tolerance, double value, double max);
	
	float clampMax(float tolerance, float value, float max);
	
	BigInteger clampMax(BigInteger tolerance, BigInteger value, BigInteger max);
	
	long clampMax(long tolerance, long value, long max);
	
	int clampMax(int tolerance, int value, int max);
	
	short clampMax(short tolerance, short value, short max);
	
	byte clampMaxSB(byte tolerance, byte value, byte max);
	
	byte clampMaxUB(byte tolerance, byte value, byte max);
	
	BigDecimal clamp(BigDecimal value, BigDecimal min, BigDecimal max);
	
	double clamp(double value, double min, double max);
	
	float clamp(float value, float min, float max);
	
	BigInteger clamp(BigInteger value, BigInteger min, BigInteger max);
	
	long clamp(long value, long min, long max);
	
	int clamp(int value, int min, int max);
	
	short clamp(short value, short min, short max);
	
	byte clampSB(byte value, byte min, byte max);
	
	byte clampUB(byte value, byte min, byte max);
	
	BigDecimal clamp(BigDecimal tolerance, BigDecimal value, BigDecimal min, BigDecimal max);
	
	double clamp(double tolerance, double value, double min, double max);
	
	float clamp(float tolerance, float value, float min, float max);
	
	BigInteger clamp(BigInteger tolerance, BigInteger value, BigInteger min, BigInteger max);
	
	long clamp(long tolerance, long value, long min, long max);
	
	int clamp(int tolerance, int value, int min, int max);
	
	short clamp(short tolerance, short value, short min, short max);
	
	byte clampSB(byte tolerance, byte value, byte min, byte max);
	
	byte clampUB(byte tolerance, byte value, byte min, byte max);
	
	BigDecimal clamp(BigDecimal toleranceMin, BigDecimal toleranceMax, BigDecimal value, BigDecimal min, BigDecimal max);
	
	double clamp(double toleranceMin, double toleranceMax, double value, double min, double max);
	
	float clamp(float toleranceMin, float toleranceMax, float value, float min, float max);
	
	BigInteger clamp(BigInteger toleranceMin, BigInteger toleranceMax, BigInteger value, BigInteger min, BigInteger max);
	
	long clamp(long toleranceMin, long toleranceMax, long value, long min, long max);
	
	int clamp(int toleranceMin, int toleranceMax, int value, int min, int max);
	
	short clamp(short toleranceMin, short toleranceMax, short value, short min, short max);
	
	byte clampSB(byte toleranceMin, byte toleranceMax, byte value, byte min, byte max);
	
	byte clampUB(byte toleranceMin, byte toleranceMax, byte value, byte min, byte max);
	
	public interface ICompareProvider
	{
		boolean isZero(BigDecimal value);
		
		boolean isZero(BigInteger value);
		
		boolean isZero(double value);

		boolean isZero(float value);

		boolean isZero(long value);
		
		boolean isZero(int value);
		
		boolean isZero(short value);
		
		boolean isZero(byte value);
		
		boolean isZero(BigDecimal tolerance, BigDecimal value);
		
		boolean isZero(float tolerance, float value);

		boolean isZero(double tolerance, double value);

		boolean isZero(BigInteger tolerance, BigInteger value);
		
		boolean isZero(long tolerance, long value);
		
		boolean isZero(int tolerance, int value);
		
		boolean isZero(short tolerance, short value);
		
		boolean isZero(byte tolerance, byte value);

		int compare(BigDecimal a, BigDecimal b);
		
		int compare(BigInteger a, BigInteger b);
		
		int compare(double a, double b);

		int compare(float a, float b);
		
		int compare(long a, long b);
		
		int compare(int a, int b);
		
		int compare(short a, short b);
		
		int compare(byte a, byte b);
		
		int compare(BigDecimal tolerance, BigDecimal a, BigDecimal b);
		
		int compare(double tolerance, double a, double b);

		int compare(float tolerance, float a, float b);
		
		int compare(BigInteger tolerance, BigInteger a, BigInteger b);
		
		int compare(long tolerance, long a, long b);
		
		int compare(int tolerance, int a, int b);
		
		int compare(short tolerance, short a, short b);
		
		int compare(byte tolerance, byte a, byte b);
		
		boolean equals(BigDecimal a, BigDecimal b);
		
		boolean equals(double a, double b);
		
		boolean equals(float a, float b);
		
		boolean equals(BigInteger a, BigInteger b);
		
		boolean equals(long a, long b);
		
		boolean equals(int a, int b);
		
		boolean equals(short a, short b);
		
		boolean equals(byte a, byte b);
		
		boolean equals(BigDecimal tolerance, BigDecimal a, BigDecimal b);
		
		boolean equals(double tolerance, double a, double b);
		
		boolean equals(float tolerance, float a, float b);
		
		boolean equals(BigInteger tolerance, BigInteger a, BigInteger b);
		
		boolean equals(long tolerance, long a, long b);
		
		boolean equals(int tolerance, int a, int b);
		
		boolean equals(short tolerance, short a, short b);
		
		boolean equals(byte tolerance, byte a, byte b);
	}
	
	public interface ILerpProvider
	{
		double lerp(double alpha, double a, double b);
		
		float lerp(double alpha, float a, float b);
		
		double quadricBezier(double alpha, double a, double b, double c);
		
		float quadricBezier(double alpha, float a, float b, float c);

		double cubicBezier(double alpha, double a, double b, double c, double d);
		
		float cubicBezier(double alpha, float a, float b, float c, float d);

		double bicubicBezier(double alpha, double a, double b, double c, double d, double e);
		
		float bicubicBezier(double alpha, float a, float b, float c, float d, float e);

		double step(double alpha, double midpoint, double a, double b);
		
		float step(double alpha, double midpoint, float a, float b);
		
		double smoothstep(double alpha, double a, double b);
		
		float smoothstep(double alpha, float a, float b);
		
		double smootherstep(double alpha, double a, double b);
		
		float smootherstep(double alpha, float a, float b);
		
		double intLerp(double alpha, double v);
		
		float intLerp(double alpha, float v);
		
		double intLerp(double alpha, double a, double b);
		
		float intLerp(double alpha, float a, float b);
	}
	
	public interface IRoundProvider
	{
		double floor(double value);
		
		double floorF2D(float value);

		float floor(float value);

		long floorD2L(double value);
		
		long floorF2L(float value);
		
		int floorF2I(float value);
		
		double ceil(double value);

		double ceilF2D(float value);
		
		float ceil(float value);

		long ceilD2L(double value);
		
		long ceilF2L(float value);
		
		int ceilF2I(float value);
		
		double round(double value);

		double roundF2D(float value);
		
		float round(float value);

		long roundD2L(double value);
		
		long roundF2L(float value);
		
		int roundF2I(float value);
		
		double round(double value, IRoundMethodD method);

		double roundF2D(float value, IRoundMethodF method);
		
		float round(float value, IRoundMethodF method);

		long roundD2L(double value, IRoundMethodD method);
		
		long roundF2L(float value, IRoundMethodF method);
		
		int roundF2I(float value, IRoundMethodF method);
		
		double trunc(double value);

		double truncF2D(float value);
		
		float trunc(float value);

		long truncD2L(double value);
		
		long truncF2L(float value);
		
		int truncF2I(float value);
		
		double ceilEven(double value);

		double ceilEvenF2D(float value);
		
		double ceilEvenL2D(long value);
		
		double ceilEvenI2D(int value);

		float ceilEven(float value);

		float ceilEvenI2F(int value);

		long ceilEvenD2L(double value);
		
		long ceilEvenF2L(float value);
		
		long ceilEven(long value);

		long ceilEvenI2L(int value);
		
		int ceilEvenF2I(float value);
		
		int ceilEven(int value);

		double ceilOdd(double value);

		double ceilOddF2D(float value);
		
		double ceilOddL2D(long value);
		
		double ceilOddI2D(int value);

		float ceilOdd(float value);

		float ceilOddI2F(int value);

		long ceilOddD2L(double value);
		
		long ceilOddF2L(float value);
		
		long ceilOdd(long value);

		long ceilOddI2L(int value);

		int ceilOddF2I(float value);
		
		int ceilOdd(int value);
		
		double ceilOddZero(double value);

		double ceilOddZeroF2D(float value);

		double ceilOddZeroL2D(long value);

		double ceilOddZeroI2D(int value);

		float ceilOddZero(float value);

		float ceilOddZeroI2F(int value);

		long ceilOddZeroD2L(double value);

		long ceilOddZeroF2L(float value);

		long ceilOddZero(long value);

		long ceilOddZeroI2L(int value);

		int ceilOddZeroF2I(float value);

		int ceilOddZero(int value);
		
		double floorEven(double value);
		
		double floorEvenF2D(float value);
		
		double floorEvenL2D(long value);
		
		double floorEvenI2D(int value);
		
		float floorEven(float value);
		
		float floorEvenI2F(int value);

		long floorEvenD2L(double value);
		
		long floorEvenF2L(float value);
		
		long floorEven(long value);
		
		long floorEvenI2L(int value);
		
		int floorEvenF2I(float value);
		
		int floorEven(int value);

		double floorOdd(double value);
		
		double floorOddF2D(float value);
		
		double floorOddL2D(long value);
		
		double floorOddI2D(int value);
		
		float floorOdd(float value);
		
		float floorOddI2F(int value);

		long floorOddD2L(double value);
		
		long floorOddF2L(float value);
		
		long floorOdd(long value);
		
		long floorOddI2L(int value);
		
		int floorOddF2I(float value);
		
		int floorOdd(int value);

		double floorOddZero(double value);

		double floorOddZeroF2D(float value);

		double floorOddZeroL2D(long value);

		double floorOddZeroI2D(int value);

		float floorOddZero(float value);

		float floorOddZeroI2F(int value);

		long floorOddZeroD2L(double value);

		long floorOddZeroF2L(float value);

		long floorOddZero(long value);

		long floorOddZeroI2L(int value);

		int floorOddZeroF2I(float value);

		int floorOddZero(int value);

		double roundEven(double value);
		
		double roundEvenF2D(float value);
		
		float roundEven(float value);

		long roundEvenD2L(double value);
		
		long roundEvenF2L(float value);
		
		int roundEvenF2I(float value);
		
		double roundOdd(double value);
		
		double roundOddF2D(float value);
		
		float roundOdd(float value);

		long roundOddD2L(double value);
		
		long roundOddF2L(float value);
		
		int roundOddF2I(float value);
		
		double roundOddZero(double value);
		
		double roundOddZeroF2D(float value);

		float roundOddZero(float value);

		long roundOddZeroD2L(double value);

		long roundOddZeroF2L(float value);

		int roundOddZeroF2I(float value);
		
		double ceilMultiple(double value, double x);
		
		double ceilMultipleF2D(float value, double x);
		
		double ceilMultipleL2D(long value, double x);
		
		double ceilMultipleI2D(int value, double x);
		
		float ceilMultiple(float value, float x);
		
		float ceilMultipleI2F(int value, float x);

		long ceilMultipleD2L(double value, long x);
		
		long ceilMultipleF2L(float value, long x);
		
		long ceilMultiple(long value, long x);
		
		long ceilMultipleI2L(int value, long x);

		int ceilMultipleF2I(float value, int x);

		int ceilMultiple(int value, int x);

		double floorMultiple(double value, double x);
		
		double floorMultipleF2D(float value, double x);
		
		double floorMultipleL2D(long value, double x);
		
		double floorMultipleI2D(int value, double x);
		
		float floorMultiple(float value, float x);
		
		float floorMultipleI2F(int value, float x);

		long floorMultipleD2L(double value, long x);
		
		long floorMultipleF2L(float value, long x);
		
		long floorMultiple(long value, long x);
		
		long floorMultipleI2L(int value, long x);

		int floorMultipleF2I(float value, int x);
		
		int floorMultiple(int value, int x);
		
		double roundMultiple(double value, double x);
		
		double roundMultipleF2D(float value, double x);
		
		double roundMultipleL2D(long value, double x);
		
		double roundMultipleI2D(int value, double x);
		
		float roundMultiple(float value, float x);
		
		float roundMultipleI2F(int value, float x);

		long roundMultipleD2L(double value, long x);
		
		long roundMultipleF2L(float value, long x);
		
		long roundMultiple(long value, long x);
		
		long roundMultipleI2L(int value, long x);

		int roundMultipleF2I(float value, int x);
		
		int roundMultiple(int value, int x);
	}
}
