package org.example.fis;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Autowired
	RestServiceProcessor restProcessor;
	
	@Override
	public void configure() throws Exception {
		
		restConfiguration()
	        .component("servlet")
	        .bindingMode(RestBindingMode.json);
	
		// Expose rest service
	    from("servlet:/product/{sku}/stock?")
	    	.routeId("productStockRest")
	    	.log("RestService 'productStockRestService': Starting...")
	    	.process(restProcessor)
	    	.to("bean-validator://x")
	    	.log("Bean Validation OK.")
	    	 //.to("direct:findProductStock")
	    	.log("RestService 'productStockRestService': End.")
	    	.end();
    
		//from("timer:foo").to("log:bar");

	}

}
