/**
 * This section defines the module "org.barghos.event".
 * 
 * @author picatrix1899
 */
module org.barghos.event
{
	requires transitive org.barghos.annotation;
	requires transitive org.barghos.util;
	
	exports org.barghos.event;
	exports org.barghos.event.eventbus;
	
	opens org.barghos.event;
	opens org.barghos.event.eventbus;
}