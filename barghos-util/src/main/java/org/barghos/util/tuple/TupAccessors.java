package org.barghos.util.tuple;

import org.barghos.util.accessor.floats.IIndexAccessorI2WF;
import org.barghos.util.accessor.floats.IIndexAccessorI3WF;
import org.barghos.util.accessor.floats.IIndexAccessorI4WF;
import org.barghos.util.accessor.floats.IIndexAccessorIAWF;
import org.barghos.util.accessor.floats.IIndexAccessorIRF;
import org.barghos.util.accessor.floats.IIndexAccessorIWF;
import org.barghos.util.tuple.floats.ITup2RF;
import org.barghos.util.tuple.floats.ITup2WF;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITup4RF;
import org.barghos.util.tuple.floats.ITup4WF;

public class TupAccessors
{
	public static final TupIndexAcc2F TUP2F = new TupIndexAcc2F();
	public static final TupIndexAcc3F TUP3F = new TupIndexAcc3F();
	public static final TupIndexAcc4F TUP4F = new TupIndexAcc4F();
	
	private static class TupIndexAcc2F implements IIndexAccessorIRF<ITup2RF>, IIndexAccessorIWF<ITup2WF>, IIndexAccessorI2WF<ITup2WF>, IIndexAccessorIAWF<ITup2WF>
	{
		@Override
		public ITup2WF set(ITup2WF obj, int[] indices, float[] values)
		{
			obj.setAt(indices[0], values[0]);
			obj.setAt(indices[1], values[1]);
			
			return obj;
		}
		
		@Override
		public ITup2WF set(ITup2WF obj, int index0, int index1, float value0, float value1)
		{
			obj.setAt(index0, value0);
			obj.setAt(index1, value1);
			
			return obj;
		}

		@Override
		public ITup2WF set(ITup2WF obj, int index, float value)
		{
			obj.setAt(index, value);
			
			return obj;
		}

		@Override
		public float get(ITup2RF obj, int index)
		{
			return obj.getAt(index);
		}
	}
	
	private static class TupIndexAcc3F implements IIndexAccessorIRF<ITup3RF>, IIndexAccessorIWF<ITup3WF>, IIndexAccessorI3WF<ITup3WF>, IIndexAccessorIAWF<ITup3WF>
	{
		@Override
		public ITup3WF set(ITup3WF obj, int[] indices, float[] values)
		{
			obj.setAt(indices[0], values[0]);
			obj.setAt(indices[1], values[1]);
			obj.setAt(indices[2], values[2]);
			
			return obj;
		}
		
		@Override
		public ITup3WF set(ITup3WF obj, int index0, int index1, int index2, float value0, float value1, float value2)
		{
			obj.setAt(index0, value0);
			obj.setAt(index1, value1);
			obj.setAt(index2, value2);
			
			return obj;
		}

		@Override
		public ITup3WF set(ITup3WF obj, int index, float value)
		{
			obj.setAt(index, value);
			
			return obj;
		}

		@Override
		public float get(ITup3RF obj, int index)
		{
			return obj.getAt(index);
		}
	}
	
	private static class TupIndexAcc4F implements IIndexAccessorIRF<ITup4RF>, IIndexAccessorIWF<ITup4WF>, IIndexAccessorI4WF<ITup4WF>, IIndexAccessorIAWF<ITup4WF>
	{
		@Override
		public ITup4WF set(ITup4WF obj, int[] indices, float[] values)
		{
			obj.setAt(indices[0], values[0]);
			obj.setAt(indices[1], values[1]);
			obj.setAt(indices[2], values[2]);
			obj.setAt(indices[3], values[3]);
			
			return obj;
		}
		
		@Override
		public ITup4WF set(ITup4WF obj, int index0, int index1, int index2, int index3, float value0, float value1, float value2, float value3)
		{
			obj.setAt(index0, value0);
			obj.setAt(index1, value1);
			obj.setAt(index2, value2);
			obj.setAt(index3, value3);
			
			return obj;
		}

		@Override
		public ITup4WF set(ITup4WF obj, int index, float value)
		{
			obj.setAt(index, value);
			
			return obj;
		}

		@Override
		public float get(ITup4RF obj, int index)
		{
			return obj.getAt(index);
		}
	}
}
