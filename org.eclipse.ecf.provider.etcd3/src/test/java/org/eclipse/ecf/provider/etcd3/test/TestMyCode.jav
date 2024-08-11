package org.eclipse.ecf.provider.etcd3.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import aQute.launchpad.Launchpad;
import aQute.launchpad.LaunchpadBuilder;
import aQute.launchpad.Service;
import aQute.launchpad.junit.LaunchpadRunner;
@RunWith(LaunchpadRunner.class)
public class TestMyCode extends junit.framework.TestCase {

    LaunchpadBuilder    builder = new LaunchpadBuilder().runfw("org.apache.felix.framework").debug();

    @Service
    Launchpad       launchpad;

    @Test
    public void testMyCode() throws Exception {
        launchpad.report();
    }
}