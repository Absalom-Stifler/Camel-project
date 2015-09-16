/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 8460p
 */
public class Pojo {
    
    String info;
    List<String> ls;
    
    // Creating record storage
    public void setInfo(String list){
     this.info = list;
    }  
    public String getInfo(){
     return info;
    }
    
    //storage for the splitted values...
  @Override
	public String toString() {
		return "Data ["+info+" ]";
	}
   
}
