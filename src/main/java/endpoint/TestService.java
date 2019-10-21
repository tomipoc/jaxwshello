package endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestService {

    @GET
    @Path("{id}")
    @Produces({MediaType.TEXT_PLAIN})
    public String getUser(@PathParam("id") int id){
        return "Given id param is " + id; //Response.status(200, "given id param is " + id).build();
    }
}
