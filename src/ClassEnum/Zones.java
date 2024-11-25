package ClassEnum;

public class Zones{

    public String userState(String userInput){

        String outPut = "";

        for(GeoPoliticalZones geo : GeoPoliticalZones.values()) {
            for (var zones : geo.getZones()){
                if (zones == userInput){
                    outPut = geo.name();
                }
            }
        }
        return outPut;
    }
}
