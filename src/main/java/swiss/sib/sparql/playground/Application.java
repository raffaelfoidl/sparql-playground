package swiss.sib.sparql.playground;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;

import java.io.File;

/**
 * A simple Spring Boot application for educative purpose in learning SPARQL
 * 
 * @author Daniel Teixeira http://github.com/ddtxra
 *
 */
@SpringBootApplication
public class Application {

	private static final Log logger = LogFactory.getLog(Application.class);

	public static String FOLDER = "provcapt";

	public static void main(String[] args) {

		logger.info("SPARQL Playground\n");


		if (args.length > 0) {
			String folderAux = args[0];
			if (new File(folderAux).exists()){
				FOLDER  = folderAux;
			}else logger.info(folderAux + " folder not found");
		}
		logger.info("Reading from " + FOLDER);

		SpringApplication.run(Application.class, args);
		
		String port = null;
		if (System.getProperty("server.port") == null) {
			port = "8080";
			logger.info("Taking default port 8080. The value of the port can be changed, by adding the jvm option: -Dserver.port=8090");
		} else {
			port = System.getProperty("server.port");
			logger.info("server.port option found. Taking port " + port);
		}

		String serverUrl = "http://localhost:" + port; // path to your new file

		logger.info("Server started at " + serverUrl);

	}

	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("asset", "queries", "faqs", "page", "page-tree");
	}

}