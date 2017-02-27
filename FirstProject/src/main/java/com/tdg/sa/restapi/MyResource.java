package com.tdg.sa.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	return "New message. Testing on 02/27/2017. Test at 5.55pm";
    }
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/new")
    public String getIt1() {
        return "Got it! Am available at new site";
    }
    
    //am adding new comment
}
