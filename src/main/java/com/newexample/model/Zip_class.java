package com.newexample.model;

import java.util.HashMap;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;
public class Zip_class {
    private int zip_code;
    private String locality;
    private String federal_entity;
    private String Municipality;
    private HashMap<String, String> Settlements;
    // Here we can define the next methods as we can see in the next lines of the code

    public int get_zip_code() {
        return zip_code;
    }

    public String get_locality() {
        return locality;
    }

    public String get_municipality() {
        return Municipality;
    }

    public HashMap<String, String> get_Settlements() {
        return Settlements;
    }

}
