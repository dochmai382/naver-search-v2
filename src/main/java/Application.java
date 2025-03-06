import io.github.cdimascio.dotenv.Dotenv;

import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Application.class.getName());
        Dotenv dotenv = Dotenv.load();

        logger.info(dotenv.get("SEARCH_KEYWORD"));

    }
}
