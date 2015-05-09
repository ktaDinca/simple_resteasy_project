package ro.locationapi;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component
@Path("/")
public class HelloResource {

    @Path("/test")
    @GET
    public Response testResteasy() {
        return Response.status(200).build();
    }

}