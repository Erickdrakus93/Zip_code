package com.newexample.ws;

import com.newexample.model.Zip_class;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// We can set the next part of the main example as we can see in ...
@Path("Zip_codes/id") // This is the representation of the main code of the all example as we can set in the
// The next part of the main example as we can see in the next lines of the code
// Here we can set in the next lines of the main code as we can set in the next lines of the code //
public class Costumer_Resource {
    private Map<Integer, Zip_class> zip_classMap  = new ConcurrentHashMap<Integer, Zip_class>(); // Here this works as Data_Base //
    private AtomicInteger idCounter = new AtomicInteger(); //Here we can instance the next part of the main examples
    //As we can see in the next lines in the code //
    // Here we can write the next part of the main example as we can see in the next lines of the code //
}
