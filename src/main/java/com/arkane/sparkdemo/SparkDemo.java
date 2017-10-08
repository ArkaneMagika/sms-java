/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arkane.sparkdemo;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import static spark.Spark.get;
import static spark.Spark.staticFileLocation;


/**
 *
 * @author arkane
 */
public class SparkDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get("/hello/:name", SparkThymeleaf::message, new ());
    }
    public static ModelAndView message(Request req, Response res){
        Map<String, Object> params = new HashMap<>();
        params.put("name", req.params(":name"));
        return new ModelAndView(params, "hello");
    }    
}
    
