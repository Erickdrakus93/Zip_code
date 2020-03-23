package com.newexample.appRest_Config;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.core.Application;
import java.sql.Struct;

@ApplicationPath("rest")
public class AppREstConfig extends ResourceConfig {
    public AppREstConfig(){
        packages(true, "com.newexample");
    }

}