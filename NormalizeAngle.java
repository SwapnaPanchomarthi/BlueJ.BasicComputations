 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        return (angle+3600) %360;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        double mod = integer - Math.floor((integer + 179.0) / 360) * 360;
        int floorMod = (int)mod;
        return  floorMod;
    }

    public static void main(String[] args){

    }
}
