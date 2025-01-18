package org.barghos.math.vector;

import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.math.RoundMethodF;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.TupRF;

public class Vec2F implements Vec2WF
{
	public final float[] v = new float[SIZE];
	
	@Override
	public float x()
	{
		return this.v[INDEX_X];
	}

	@Override
	public float y()
	{
		return this.v[INDEX_Y];
	}

	@Override
	public float len()
	{
		return VecUtils2F.len(this.v);
	}

	@Override
	public float len(float tolerance)
	{
		return VecUtils2F.len(tolerance, this.v);
	}

	@Override
	public float recLen()
	{
		return VecUtils2F.recLen(this.v);
	}

	@Override
	public float lenTo(Tup2RF v2)
	{
		return VecUtils2F.lenTo(this.v, v2);
	}

	@Override
	public float lenTo(Tup2RF v2, float tolerance)
	{
		return VecUtils2F.lenTo(tolerance, this.v, v2);
	}

	@Override
	public float lenTo(float[] v2)
	{
		return VecUtils2F.lenTo(this.v, v2);
	}

	@Override
	public float lenTo(float[] v2, float tolerance)
	{
		return VecUtils2F.lenTo(tolerance, this.v, v2);
	}

	@Override
	public float lenTo(float v2x, float v2y)
	{
		return VecUtils2F.lenTo(this.v, v2x, v2y);
	}

	@Override
	public float lenTo(float v2x, float v2y, float tolerance)
	{
		return VecUtils2F.lenTo(tolerance, this.v, v2x, v2y);
	}

	@Override
	public float recLenTo(Tup2RF v2)
	{
		return VecUtils2F.recLenTo(this.v, v2);
	}

	@Override
	public float recLenTo(float[] v2)
	{
		return VecUtils2F.recLenTo(this.v, v2);
	}

	@Override
	public float recLenTo(float v2x, float v2y)
	{
		return VecUtils2F.recLenTo(this.v, v2x, v2y);
	}

	@Override
	public float sqrLen()
	{
		return VecUtils2F.sqrLen(this.v);
	}

	@Override
	public float sqrLenTo(Tup2RF v2)
	{
		return VecUtils2F.sqrLenTo(this.v, v2);
	}

	@Override
	public float sqrLenTo(float[] v2)
	{
		return VecUtils2F.sqrLenTo(this.v, v2);
	}

	@Override
	public float sqrLenTo(float v2x, float v2y)
	{
		return VecUtils2F.sqrLenTo(this.v, v2x, v2y);
	}

	@Override
	public float dot(Tup2RF v2)
	{
		return VecUtils2F.dot(this.v, v2);
	}

	@Override
	public float dot(float[] v2)
	{
		return VecUtils2F.dot(this.v, v2);
	}

	@Override
	public float dot(float v2x, float v2y)
	{
		return VecUtils2F.dot(this.v, v2x, v2y);
	}

	@Override
	public IndexValuePairF min()
	{
		return VecUtils2F.min(this.v, new IndexValuePairF());
	}

	@Override
	public IndexValuePairF min(IndexValuePairF res)
	{
		return VecUtils2F.min(this.v, res);
	}

	@Override
	public IndexValuePairF max()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexValuePairF max(IndexValuePairF res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T addT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] addT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T addT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] addT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T addT(float value, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] addT(float value, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T addT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] addT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T subT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] subT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T subT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] subT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T subT(float value, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] subT(float value, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T subT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] subT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rSubT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rSubT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rSubT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rSubT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rSubT(float value, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rSubT(float value, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rSubT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rSubT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T mulT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] mulT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T mulT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] mulT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T mulT(float value, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] mulT(float value, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T mulT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] mulT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T divT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] divT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T divT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] divT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T divT(float value, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] divT(float value, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T divT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] divT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rDivT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rDivT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rDivT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rDivT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rDivT(float value, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rDivT(float value, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rDivT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rDivT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T halfVecToT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] halfVecToT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T halfVecToT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] halfVecToT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T halfVecToT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] halfVecToT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T midPointToT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] midPointToT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T midPointToT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] midPointToT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T midPointToT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] midPointToT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T negT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] negT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T recT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] recT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T nrmT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] nrmT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T minT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] minT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T minT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] minT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T minT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] minT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T maxT(Tup2RF v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] maxT(Tup2RF v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T maxT(float[] v2, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] maxT(float[] v2, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T maxT(float v2x, float v2y, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] maxT(float v2x, float v2y, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rotRadT(float angle, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rotRadT(float angle, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T rotDegT(float angle, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] rotDegT(float angle, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T projectT(Tup2RF t, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T projectT(float[] t, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T projectT(float tX, float tY, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] projectT(Tup2RF t, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] projectT(float[] t, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] projectT(float tX, float tY, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T reflectT(Tup2RF n, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T reflectT(float[] n, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T reflectT(float nX, float nY, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] reflectT(Tup2RF n, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] reflectT(float[] n, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] reflectT(float nX, float nY, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T ceilT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] ceilT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T floorT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] floorT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T roundT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] roundT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T truncT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] truncT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T roundT(RoundMethodF method, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] roundT(RoundMethodF method, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T absT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] absT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T signT(T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] signT(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T intVecLinT(Tup2RF v2, float alpha, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T intVecLinT(float[] v2, float alpha, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Tup2WF> T intVecLinT(float v2x, float v2y, float alpha, T res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] intVecLinT(Tup2RF v2, float alpha, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] intVecLinR(float[] v2, float alpha, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] intVecLinT(float v2x, float v2y, float alpha, float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float v0()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float v1()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getAt(int index)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float[] toArray()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] toArray(float[] res)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFiniteAtV0()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFiniteAtV1()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAt(int index)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtV0()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtV1()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(float v0, float v1)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(float tolerance, Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(float tolerance, TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(float tolerance, float v0, float v1)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(int index, Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(int index, TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(float tolerance, int index, Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(float tolerance, int index, TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, Tup2RF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, TupRF t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, float[] t)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFinite()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZero()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZero(float tolerance)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tup2WF createNew(TupRF t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF v0(float v0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF v1(float v1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF arrangeN(int[] indices)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF arrangeN(int iV0, int iV1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF swizzleN(int indexA, int indexB)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF swizzleV0V1N()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF arrange(int[] indices)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF arrange(int iV0, int iV1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF swizzle(int indexA, int indexB)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tup2WF swizzleV0V1()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF createNew()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF createNew(Tup2RF v)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF createNew(float[] v)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF createNew(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF createNew(float x, float y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF copy()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF x(float x)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF y(float y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF set(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF set(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF set(float x, float y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF set(TupRF t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF setAt(int index, float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF set(float[] values)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF add(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF add(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF add(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF add(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF sub(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF sub(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF sub(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF sub(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSub(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSub(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSub(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSub(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mul(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mul(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mul(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mul(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF div(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF div(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF div(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF div(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDiv(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDiv(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDiv(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDiv(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF halfVecTo(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF halfVecTo(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF halfVecTo(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF midPointTo(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF midPointTo(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF midPointTo(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF neg()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rec()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF nrm()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF min(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF min(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF min(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF max(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF max(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF max(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rotRad(float angle)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rotDeg(float angle)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF project(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF project(float[] t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF project(float tX, float tY)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF reflect(Tup2RF n)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF reflect(float[] n)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF reflect(float nX, float nY)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF ceil()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF floor()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF round()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF trunc()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF round(RoundMethodF method)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF abs()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF sign()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF intVecLin(Tup2RF v2, float alpha)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF intVecLin(float[] v2, float alpha)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF intVecLin(float v2x, float v2y, float alpha)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF addN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF addN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF addN(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF addN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF subN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF subN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF subN(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF subN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSubN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSubN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSubN(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rSubN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mulN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mulN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mulN(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF mulN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF divN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF divN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF divN(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF divN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDivN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDivN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDivN(float value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rDivN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF halfVecToN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF halfVecToN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF halfVecToN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF midPointToN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF midPointToN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF midPointToN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF negN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF recN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF nrmN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF minN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF minN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF minN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF maxN(Tup2RF v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF maxN(float[] v2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF maxN(float v2x, float v2y)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rotRadN(float angle)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF rotDegN(float angle)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF projectN(Tup2RF t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF projectN(float[] t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF projectN(float tX, float tY)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF reflectN(Tup2RF n)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF reflectN(float[] n)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF reflectN(float nX, float nY)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF ceilN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF floorN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF roundN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF truncN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF roundN(RoundMethodF method)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF absN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF signN()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF intVecLinN(Tup2RF v2, float alpha)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF intVecLinN(float[] v2, float alpha)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vec2WF intVecLinN(float v2x, float v2y, float alpha)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
