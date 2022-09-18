package main.java.app.journal.VlimoJournalBot.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import lombok.data;


@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {

    @Value("${bot.name}")
    String botname;

    @Value("${bot.key}")
    String token;
}
