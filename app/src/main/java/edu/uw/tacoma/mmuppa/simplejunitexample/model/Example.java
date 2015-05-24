package edu.uw.tacoma.mmuppa.simplejunitexample.model;

/**
 * Created by mmuppa on 5/24/15.
 */
public class Example {


    private long id;
    private String name;

    public Example(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
