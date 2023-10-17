/**
 * This section defines the module "org.barghos.core.api".
 * 
 * @author picatrix1899
 */
module org.barghos.validation
{
	requires transitive org.barghos.annotation;
	
	exports org.barghos.validation;
	exports org.barghos.validation.exception.argument;
	
	opens org.barghos.validation;
	opens org.barghos.validation.exception.argument;
}