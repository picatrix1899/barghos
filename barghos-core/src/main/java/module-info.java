/**
 * This section defines the module "org.barghos.core".
 * 
 * @author picatrix1899
 */
module org.barghos.core
{
	requires transitive org.barghos.core.api;
	
	exports org.barghos.core;
	exports org.barghos.core.pool;
	exports org.barghos.core.thread;
	exports org.barghos.core.util;
	
	opens org.barghos.core;
	opens org.barghos.core.pool;
	opens org.barghos.core.thread;
	opens org.barghos.core.util;
}