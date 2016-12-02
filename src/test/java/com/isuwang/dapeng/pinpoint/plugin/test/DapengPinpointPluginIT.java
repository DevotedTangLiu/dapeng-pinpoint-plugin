package com.isuwang.dapeng.pinpoint.plugin.test;

import com.navercorp.pinpoint.bootstrap.plugin.test.PluginTestVerifier;
import com.navercorp.pinpoint.bootstrap.plugin.test.PluginTestVerifierHolder;
import com.navercorp.pinpoint.test.plugin.PinpointAgent;
import com.navercorp.pinpoint.test.plugin.PinpointPluginTestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by tangliu on 16/12/2.
 */
@RunWith(PinpointPluginTestSuite.class)
@PinpointAgent(TestConstants.AGENT_PATH)
public class DapengPinpointPluginIT {
    @Test
    public void test() throws Exception {
        PluginTestVerifier verifier = PluginTestVerifierHolder.getInstance();
        verifier.printCache();
        verifier.verifyTraceCount(0);
    }
}
