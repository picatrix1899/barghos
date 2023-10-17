/**
 * This section defines the module "org.barghos.math.api".
 * 
 * @author picatrix1899
 */
module org.barghos.math.api
{
	requires org.barghos.annotation;
	
	requires transitive org.barghos.core;
	
	exports org.barghos.math.api.bv;
	exports org.barghos.math.api.line;
	exports org.barghos.math.api.matrix;
	exports org.barghos.math.api.orientation;
	exports org.barghos.math.api.quaternion;
	exports org.barghos.math.api.vector;
	
	opens org.barghos.math.api.bv;
	opens org.barghos.math.api.line;
	opens org.barghos.math.api.matrix;
	opens org.barghos.math.api.orientation;
	opens org.barghos.math.api.quaternion;
	opens org.barghos.math.api.vector;
}