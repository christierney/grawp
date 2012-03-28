import javax.ws.rs.ext.MessageBodyWriter
import javax.ws.rs.core.MediaType
import java.lang.annotation.Annotation
import java.lang.reflect.Type
import javax.ws.rs.core.MultivaluedMap
import groovy.json.*
import javax.ws.rs.ext.Provider
import javax.ws.rs.Produces

@Provider
@Produces(("application/grawp"))
class GrawpSerializer implements MessageBodyWriter<Grawp> {

    @Override
    boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return type == Grawp
    }

    @Override
    long getSize(Grawp t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1
    }

    @Override
    void writeTo(Grawp t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) {
        entityStream.withWriter { w ->
            def json = new StreamingJsonBuilder(w)
            json {
                    "thename" t.name // json names don't have to match bean property names
                    "age" t.age
                    "@rbitrary" true // you're not limited to properties of the bean
                    "siblings"  t.siblings // collection is automatically turned into a json array
            }
        }
    }
}
