/**
 * This section defines the module "org.barghos.math.api".
 * 
 * @author picatrix1899
 */
module org.barghos.math.api
{
	requires org.barghos.annotation;
	
	requires transitive org.barghos.tuple.api;
	requires transitive org.barghos.core.api;
	
	exports org.barghos.math.api.bv;
	exports org.barghos.math.api.matrix;
	exports org.barghos.math.api.model;
	exports org.barghos.math.api.point;
//	exports org.barghos.math.api.transform;
	exports org.barghos.math.api.util;
	exports org.barghos.math.api.vector;
	
	opens org.barghos.math.api.bv;
	opens org.barghos.math.api.matrix;
	opens org.barghos.math.api.model;
	opens org.barghos.math.api.point;
//	opens org.barghos.math.api.transform;
	opens org.barghos.math.api.util;
	opens org.barghos.math.api.vector;
}