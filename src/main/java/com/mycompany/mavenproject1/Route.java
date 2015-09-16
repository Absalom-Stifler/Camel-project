/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import org.apache.camel.builder.RouteBuilder;

/**
 *
 * @author 8460p
 */
public class Route extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub   
          	
	from("file:data/inbox")
        .bean(new Route2(), "transformContent");
	
	}
}
