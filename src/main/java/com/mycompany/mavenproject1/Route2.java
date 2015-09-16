/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import org.apache.camel.builder.RouteBuilder;


/**
 *
 * @author 8460p
 */
public class Route2 extends RouteBuilder{  
    @Override
    public void configure() throws Exception {
      
     from("direct:start")
     .bean(Route3.class, "try(&#39;World&#39;, 5)")
    .to("mock:result");
    }
    public void transformContent(String body) {
         
       
         Route3  r3 =  new Route3();
         Pojo pj = new Pojo();
         int fileserial = 0; 
         String[] splitted = body.split("\r\n");      
     
                for (String splitted1 : splitted) {
                 
                     pj.setInfo(splitted1.toString()); 
                      r3.ObjectToJson(pj,fileserial);
                     fileserial++;
                   }
        
	}

  
}
