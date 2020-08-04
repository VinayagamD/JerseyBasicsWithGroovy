package com.vinaylogics.restapi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageResource {

    @GET
    public String getMessage(){
        return "Hello From Message Resource";
    }

}
