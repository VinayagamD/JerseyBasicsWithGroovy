package com.vinaylogics.restapi.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class TestController {

    @GET
    public String data(){
        return "Hello";
    }

}
