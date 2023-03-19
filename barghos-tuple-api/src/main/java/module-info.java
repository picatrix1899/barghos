/**
 * This section defines the module "org.barghos.tuple.api".
 * 
 * @author picatrix1899
 */
module org.barghos.tuple.api
{
	requires org.barghos.annotation;
	
	exports org.barghos.tuple.api.t2;
	exports org.barghos.tuple.api.t3;
	exports org.barghos.tuple.api.t4;
	exports org.barghos.tuple.api.tn;	
	
	opens org.barghos.tuple.api.t2;
	opens org.barghos.tuple.api.t3;
	opens org.barghos.tuple.api.t4;
	opens org.barghos.tuple.api.tn;
}