package org.pieuler.typesafeconfig.intro;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class SimpleJavaExamples {
    public static void main(String[] args) {
        Config config = ConfigFactory.load();

        System.out.println("          user's id is " + config.getString("user.id"));
        System.out.println("        user's name is " + config.getString("user.name"));
        System.out.println("user's phone number is " + config.getString("user.phone"));
    }
}
