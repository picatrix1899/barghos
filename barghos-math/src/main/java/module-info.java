/**
 * This section defines the module "org.barghos.math".
 * 
 * @author picatrix1899
 */
module org.barghos.math
{
	requires org.barghos.annotation;
	
	requires transitive org.barghos.tuple.api;
	requires transitive org.barghos.core.api;
	requires transitive org.barghos.math.api;
	
	exports org.barghos.math;
	exports org.barghos.math.bounds;
	exports org.barghos.math.matrix;
	exports org.barghos.math.model;
	exports org.barghos.math.point;
	exports org.barghos.math.transform;
	exports org.barghos.math.util;
	exports org.barghos.math.vector;
	
	opens org.barghos.math;
	opens org.barghos.math.bounds;
	opens org.barghos.math.matrix;
	opens org.barghos.math.model;
	opens org.barghos.math.point;
	opens org.barghos.math.transform;
	opens org.barghos.math.util;
	opens org.barghos.math.vector;
}