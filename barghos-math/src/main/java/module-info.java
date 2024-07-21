/**
 * This section defines the module "org.barghos.math.api".
 * 
 * @author picatrix1899
 */
module org.barghos.math
{
	requires org.barghos.annotation;
	
	requires transitive org.barghos.util;

	exports org.barghos.math;
	exports org.barghos.math.vector;
	
	
	//exports org.barghos.math.line;
	
	
	//exports org.barghos.math.orientation;
	
	opens org.barghos.math;
	opens org.barghos.math.vector;
	//opens org.barghos.math.line;
	//opens org.barghos.math.orientation;
}