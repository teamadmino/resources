package com.teamadmino.ARTIFACT.main;

import static com.teamadmino.admino_backend.server.database.ServerMain.workdir;

import ch.qos.logback.classic.util.ContextInitializer;
import com.teamadmino.admino_backend.TeamAdminoBackend;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Main {

    public static Logger log = null;

    public static void main(String[] args) {

        new File(workdir).mkdir();
        System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "config/logconfig.xml");
        log = LoggerFactory.getLogger(Main.class);
        log.info("Starting application...");
        TeamAdminoBackend.start(args, log);

    }

}
