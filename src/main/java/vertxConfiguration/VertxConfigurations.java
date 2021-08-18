package vertxConfiguration;


import io.vertx.core.Vertx;
import org.springframework.context.annotation.Configuration;
@Configuration
public class VertxConfigurations {



    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
    }

}
