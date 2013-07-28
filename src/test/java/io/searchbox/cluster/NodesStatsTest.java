package io.searchbox.cluster;

import io.searchbox.Action;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author cihat keser
 */
public class NodesStatsTest {

    @Test
    public void testUriGeneration() throws Exception {
        Action action = new NodesStats.Builder()
                .build();
        assertEquals("/_cluster/nodes/_all/stats", action.getURI());
    }

    @Test
    public void testUriGenerationWithSingleNode() throws Exception {
        Action action = new NodesStats.Builder()
                .addNode("james")
                .clear(true)
                .build();
        assertEquals("/_cluster/nodes/james/stats?clear=true", action.getURI());
    }

}
