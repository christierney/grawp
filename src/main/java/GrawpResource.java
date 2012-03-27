import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by IntelliJ IDEA.
 * User: chris
 * Date: 3/26/12
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/grawp")
@Produces("application/grawp")
public class GrawpResource {

    @GET
    public Grawp read() {
        return new Grawp("GRAWPY");
    }
}
