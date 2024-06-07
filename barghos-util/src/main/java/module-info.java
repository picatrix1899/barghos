/**
 * This section defines the module "org.barghos.util".
 */
module org.barghos.util
{
	requires transitive org.barghos.annotation;
	requires transitive org.barghos.validation;
	
	exports org.barghos.util;
	
	exports org.barghos.util.math;
	exports org.barghos.util.collection;
	
	exports org.barghos.util.consumer;
	exports org.barghos.util.consumer.floats;
	
	exports org.barghos.util.tuple;
	exports org.barghos.util.tuple.floats;
	
	exports org.barghos.util.comparator;
	exports org.barghos.util.function;
	exports org.barghos.util.lazy;
	exports org.barghos.util.optional;
	exports org.barghos.util.predicate;
	exports org.barghos.util.supplier;
	
	opens org.barghos.util;
	
	opens org.barghos.util.math;
	opens org.barghos.util.collection;
	
	opens org.barghos.util.consumer;
	opens org.barghos.util.consumer.floats;
	
	opens org.barghos.util.tuple;
	opens org.barghos.util.tuple.floats;
	
	opens org.barghos.util.comparator;
	opens org.barghos.util.function;
	opens org.barghos.util.lazy;
	opens org.barghos.util.optional;
	opens org.barghos.util.predicate;
	opens org.barghos.util.supplier;
}