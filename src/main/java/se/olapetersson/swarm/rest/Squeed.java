package se.olapetersson.swarm.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/squeed")
public class Squeed {

    @GET
    public String getSqueed(){
        return "Squeed!";
    }
}
