package com.mycompany.mavenproject1;


import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.impl.DefaultCamelContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
           
    {
       
         Route rt = new Route();
    CamelContext cc = new DefaultCamelContext();
    
    try{
    	cc.addRoutes(rt);
        cc.start();
        Thread.sleep(30000);
        cc.stop();
    }catch(Exception ex ){
    	ex.getStackTrace();
    	
    }
    }
}
