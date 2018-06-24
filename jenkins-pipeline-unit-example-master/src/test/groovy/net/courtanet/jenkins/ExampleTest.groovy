package net.courtanet.jenkins

import static com.lesfurets.jenkins.unit.global.lib.LibraryConfiguration.library
import static org.junit.Assert.assertTrue

import org.junit.*
import org.junit.rules.TemporaryFolder

import com.lesfurets.jenkins.unit.BasePipelineTest

class ExampleTest extends BasePipelineTest{



    @Before
    void setup() {
        super.setUp()

    }

    @Test
    void should_return_true() {
        loadScript('pipeline.jenkins')
        printCallStack()
        assertTrue(true)
    }

}