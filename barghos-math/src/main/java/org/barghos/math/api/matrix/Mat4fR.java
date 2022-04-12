package org.barghos.math.api.matrix;

import static org.barghos.math.api.matrix.MatrixConstants.*;

import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple3.Tup3fBase;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.vector.Vec2fBase;
import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.api.vector.Vec3fBase;
import org.barghos.math.api.vector.Vec3fR;

// MISSING_DOC
public interface Mat4fR extends MatR
{
	/** {@inheritDoc}} */
	@Override
	default int getRows()
	{
		return M4_ROWS;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getColumns()
	{
		return M4_COLUMNS;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getCells()
	{
		return M4_CELLS;
	}
	
	// MISSING_DOC
	default <T extends Tup2fBase> T transform(Tup2fR t, T res)
	{
		return transform(t, false, false, res);
	}
	
	// MISSING_DOC
	<T extends Tup2fBase> T transform(Tup2fR t, boolean useZ, boolean useW, T res);
	
	// MISSING_DOC
	default <T extends Vec2fBase> T transform(Vec2fR v, T res)
	{
		return transform(v, false, false, res);
	}
	
	// MISSING_DOC
	<T extends Vec2fBase> T transform(Vec2fR v, boolean useZ, boolean useW, T res);
	
	// MISSING_DOC
	default <T extends Tup3fBase> T transform(Tup3fR t, T res)
	{
		return transform(t, false, res);
	}
	
	// MISSING_DOC
	<T extends Tup3fBase> T transform(Tup3fR t, boolean useW, T res);
	
	// MISSING_DOC
	default <T extends Vec3fBase> T transform(Vec3fR v, T res)
	{
		return transform(v, false, res);
	}
	
	// MISSING_DOC
	<T extends Vec3fBase> T transform(Vec3fR v, boolean useW, T res);
}
