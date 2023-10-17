/**
 * This section defines the module "org.barghos.util.function".
 * 
 * @author picatrix1899
 */
module org.barghos.util.function
{
	requires transitive org.barghos.annotation;
	requires transitive org.barghos.validation;
	
	exports org.barghos.util.comparator;
	exports org.barghos.util.consumer;
	exports org.barghos.util.function;
	exports org.barghos.util.lazy;
	exports org.barghos.util.optional;
	exports org.barghos.util.predicate;
	exports org.barghos.util.supplier;
	
	opens org.barghos.util.comparator;
	opens org.barghos.util.consumer;
	opens org.barghos.util.function;
	opens org.barghos.util.lazy;
	opens org.barghos.util.optional;
	opens org.barghos.util.predicate;
	opens org.barghos.util.supplier;
}