package com.newexample.ws;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.newexample.service.zip_code_Service;
import com.newexample.model.Zip_class;
import com.sun.jersey.api.JResponse;
import sun.nio.cs.ext.MacArabic;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.*; // The importations of the main code as we can set in the next lines of the code //
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Path("zip_classes")
public class My_Resource {
    @Inject
    private zip_code_Service zip_code_service;
    //Here we can call the next as we can set in the next lines of the code
    private Map<Integer, Zip_class> zip_db = new ConcurrentHashMap<Integer, Zip_class>();
    // Here the last is the working as DB this we can trade off for a ROM Data_Base
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response message(){
        List<Zip_class> zipers = zip_code_service.findAll();
        GenericEntity<List<Zip_class>>My_entity = new GenericEntity<List<Zip_class>>(zipers){};
        // The next is for the json caller in the Response Method
        return Response.status(200).entity(My_entity).build();
    }

}
