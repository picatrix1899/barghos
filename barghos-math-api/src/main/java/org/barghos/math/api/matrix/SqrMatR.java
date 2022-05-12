package org.barghos.math.api.matrix;

/**
 * This interface grants readonly access to any square float matrix.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface SqrMatR extends MatR
{
	// MISSING_DOC
	float getDeterminant();
}
