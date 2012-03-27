import com.yammer.dropwizard.config.Configuration;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by IntelliJ IDEA.
 * User: chris
 * Date: 3/26/12
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class GrawpConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String foo;

    public String getFoo() {
        return foo;
    }
}
