import static org.junit.Assert.assertTrue

import org.junit.*
import org.codehaus.groovy.*

import com.lesfurets.jenkins.unit.*

class ExampleTest extends BasePipelineTest{



    @Before
    void setup() {
		helper.baseScriptRoot = 'jenkinsJobs'
		helper.scriptRoots += 'src/main/groovy'
		helper.scriptExtension = 'pipeline'
        super.setUp()

    }

    @Test
    void should_return_true() {
        loadScript("pipeline.jenkins")
        printCallStack()
        assertTrue(true)
    }

}