import ClassEnum.GeoPoliticalZones;
import ClassEnum.Zones;
import org.junit.Test;

import java.util.Arrays;

import static ClassEnum.GeoPoliticalZones.NORTHCENTRAL;
import static org.junit.Assert.assertEquals;

public class GeoPoliticalZonesTest {

    @Test
    public void TestForUserZones(){
        Zones userZone = new Zones();
        String input = userZone.userState("Lagos");
        String expected = "SOUTHWEST";
        assertEquals(expected, input);
    }
}
