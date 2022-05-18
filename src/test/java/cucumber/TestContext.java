package cucumber;

import managers.WebDriverManager;
import managers.FileReaderManager;

import java.io.IOException;

public class TestContext {
        private WebDriverManager webDriverManager;

        public ScenarioContext scenarioContext;

        public TestContext() throws IOException {
            webDriverManager = new WebDriverManager();
            scenarioContext = new ScenarioContext();
        }

        public WebDriverManager getWebDriverManager() {
            return webDriverManager;
}

        public ScenarioContext getScenarioContext(){return scenarioContext;}

//        Neu co tao PageObjectManager thi them dong nay
//        public PageObjectManager getPageObjectManager(){
//            return PageObjectManager;
//        }

//        Ko can FileReaderManager vi ban than no da la SingleOn Pattern
//        public FileReaderManager getFileReaderManager() {return FileReaderManager;
//        }
}
