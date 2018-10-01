package p.minn.dubbo.boot;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;


/**
 * 
 * @author minn 
 * @QQ:3942986006
 */
@SpringBootApplication
@EnableAutoConfiguration
@ImportResource({"classpath*:/spring/dubbo-provider.xml"
		})
public class DubboProviderApp extends  SpringBootServletInitializer
{
    public static void main( String[] args ) throws IOException
    {
    	SpringApplication.run(DubboProviderApp.class, args);
    }
}
