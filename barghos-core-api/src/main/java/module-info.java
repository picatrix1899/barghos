/**
 * This section defines the module "org.barghos.core.api".
 * 
 * @author picatrix1899
 */
module org.barghos.core.api
{
	requires org.barghos.annotation;
	
	exports org.barghos.core.api;
	exports org.barghos.core.api.flag;
	exports org.barghos.core.api.math;
	exports org.barghos.core.api.metrics;
	exports org.barghos.core.api.nio.buffer;
	exports org.barghos.core.api.pool;
	exports org.barghos.core.api.reflect;
	exports org.barghos.core.api.util;
	exports org.barghos.core.api.util.function;
	exports org.barghos.core.api.util.timer;
	
	opens org.barghos.core.api;
	opens org.barghos.core.api.flag;
	opens org.barghos.core.api.math;
	opens org.barghos.core.api.metrics;
	opens org.barghos.core.api.nio.buffer;
	opens org.barghos.core.api.pool;
	opens org.barghos.core.api.reflect;
	opens org.barghos.core.api.util;
	opens org.barghos.core.api.util.function;
	opens org.barghos.core.api.util.timer;
}