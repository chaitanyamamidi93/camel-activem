package com.javainuse;
import org.apache.camel.builder.RouteBuilder;
public class SimpleRouteBuild extends RouteBuilder {

		@Override
		public void configure() throws Exception {
			// TODO Auto-generated method stub
		        from("file:C:/inputFolder").split().tokenize("\n").to("jms:queue:javainuse");
		    }

		}

			


