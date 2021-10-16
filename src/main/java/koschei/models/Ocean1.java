package koschei.models;

import koschei.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.security.auth.login.Configuration;

@Component
public class Ocean1 {

    @Autowired
    @Qualifier("island")
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
