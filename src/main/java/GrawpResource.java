import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/grawp")
@Produces("application/grawp")
public class GrawpResource {

    @GET
    public Grawp read() {
        Grawp grawpy = new Grawp("GRAWPY", 10);
        grawpy.addSibling(new Grawp("HAGRID", 37));
        return grawpy;
    }
}
