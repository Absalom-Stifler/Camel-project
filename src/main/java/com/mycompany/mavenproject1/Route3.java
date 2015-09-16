/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author 8460p
 */
public class Route3 {

	    public void  tria(String x ,int y){
               System.out.print(x+ y);
               
              
            }   
        public void ObjectToJson(Object info,int x){
          ObjectMapper mapper = new ObjectMapper(); 
           
          try {
                  // produce JSon...
          mapper.writeValue(new File("data\\inbox\\File - "+x+".Json"),info);
         		
	} catch (JsonMappingException e) {
	          e.printStackTrace();
	} catch (IOException e){
		e.printStackTrace();
	}
          
          
          final String sourceFolder = "file:data/inbox";
        final String destinationFolder = "file:data/outbox";

        final CamelContext camelContext = new DefaultCamelContext();
            try {
                camelContext.addRoutes(new RouteBuilder() {
                    @Override
                    public void configure() {
                        from(sourceFolder).to(destinationFolder);
                    }
                }); 
      
        camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();
          } catch (Exception ex) {
                Logger.getLogger(Route3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    

    
       
        
        
}
