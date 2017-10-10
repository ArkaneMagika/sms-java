/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Version;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import static spark.Spark.get;

/**
 *
 * @author arkane
 */
public class SparkDemo {
    /**
     * @throws java.io.IOException
     */
    public static void init() throws IOException{
        Configuration conf = new Configuration(new Version(2, 3, 23));
        conf.setClassForTemplateLoading(SparkDemo.class, "main/resources/template/");
        //        conf.setDirectoryForTemplateLoading(new File("resources/template/"));
        
        get("/", (req, res)->"Hello World");
    }
    public static ModelAndView message(Request req, Response res){
        Map<String, Object> params = new HashMap<>();
//        params.put("name", req.params(":name"));
        return new ModelAndView(params, "index.ftlh");
    }    
    
    public static void main(String[] args) throws IOException{
            init();
    }
}
    
