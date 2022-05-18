package managers;

import dataProvider.ConfigFileReader;

import java.io.IOException;

public class FileReaderManager {
    private static final FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;

    public FileReaderManager() {
    }

    public static FileReaderManager getInstance() {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() throws IOException {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}