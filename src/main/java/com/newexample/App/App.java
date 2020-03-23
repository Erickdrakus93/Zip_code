package com.newexample.App;

import com.newexample.model.Zip_class;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class App extends Application {
    private Set<Object> singletons  = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();

    // Here we can set the methods as we can see in the next lines of the code
    public App(){ // This is the class
        singletons.add(new Zip_class());
    }
    @Override
    public Set<Class<?>>getClasses(){
        return empty;
    }
    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }

}
