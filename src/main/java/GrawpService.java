import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Environment;

/**
 * Created by IntelliJ IDEA.
 * User: chris
 * Date: 3/26/12
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class GrawpService extends Service<GrawpConfiguration> {

    public static void main(String[] args) throws Exception {
        new GrawpService().run(args);
    }

    private GrawpService() {
        super("grawp");
    }

    @Override
    protected void initialize(GrawpConfiguration grawpConfiguration, Environment environment) throws Exception {
        environment.addProvider(new GrawpSerializer());
        environment.addResource(new GrawpResource());
    }
}
