/**Geography: Estimate areas */
public class EstimateAreas {
    public static void main (String ... args) {
        final double RADIUS = 6371.01;
        //ATLANTA, GEORGIA
        final double GEORGIA_LAT = Math.toRadians(33.753746);
        final double GEORGIA_LON = Math.toRadians(-84.386330);
        //ORLANDO, FLORIDA
        final double FLORIDA_LAT = Math.toRadians(28.538336);
        final double FLORIDA_LON = Math.toRadians(-81.379264);
        //SAVANNAH GEORGIA
        final double SAVANNAH_LAT = Math.toRadians(32.076176);
        final double SAVANNAH_LON = Math.toRadians(-81.088371);
        //CHARLOTTE NORTH CAROLINE
        final double CHARLOTTE_LAT = Math.toRadians(35.227085);
        final double CHARLOTTE_LON = Math.toRadians(-80.843124);
        //COMPUTE DISTANCE BETWEEN ATLANTA TO FLORIDA
        double distanceAtlantaAndOrlando = RADIUS * Math.acos((Math.sin(GEORGIA_LAT) * Math.sin(FLORIDA_LAT)) + 
        (Math.cos(GEORGIA_LAT) * Math.cos(FLORIDA_LAT) * Math.cos(GEORGIA_LON - FLORIDA_LON)));
        //COMPUTE DISTANCE BETWEEN FLORIDA TO SAVANNAH
        double distanceFloridaAndSavannah = RADIUS * Math.acos((Math.sin(FLORIDA_LAT) * Math.sin(SAVANNAH_LAT)) + 
        (Math.cos(FLORIDA_LAT) * Math.cos(SAVANNAH_LAT) * Math.cos(FLORIDA_LON - SAVANNAH_LON)));
        //COMPUTE DISTANCE BETWEEN SAVANNAH TO ATLANTA
        double distanceSavannahAndAtlanta = RADIUS * Math.acos((Math.sin(SAVANNAH_LAT) * Math.sin(GEORGIA_LAT)) + 
        (Math.cos(SAVANNAH_LAT) * Math.cos(GEORGIA_LAT) * Math.cos(SAVANNAH_LON - GEORGIA_LON)));
        //COMPUTE DISTANCE TRIANGLE 2
        //ATLNTA TO CHARLOTTE
        double distanceAtlantaAndCharlotte = RADIUS * Math.acos((Math.sin(GEORGIA_LAT) * Math.sin(CHARLOTTE_LAT)) + 
        (Math.cos(GEORGIA_LAT) * Math.cos(CHARLOTTE_LAT) * Math.cos(GEORGIA_LON - CHARLOTTE_LON)));
        //GEORGIA TO FLORIDA
        double distanceCharlotteAndFlorida = RADIUS * Math.acos((Math.sin(CHARLOTTE_LAT) * Math.sin(FLORIDA_LAT)) + 
        (Math.cos(CHARLOTTE_LAT) * Math.cos(FLORIDA_LAT) * Math.cos(CHARLOTTE_LON - FLORIDA_LON)));
        //FLORIDA TO ATLANTA
        double distanceFloridaToAtlanta = RADIUS * Math.acos((Math.sin(FLORIDA_LAT) * Math.sin(GEORGIA_LAT)) + 
        (Math.cos(FLORIDA_LAT) * Math.cos(GEORGIA_LAT) * Math.cos(FLORIDA_LON - GEORGIA_LON)));
        //COMPUTE THE AREA
        double s = (distanceAtlantaAndOrlando + distanceFloridaAndSavannah + distanceSavannahAndAtlanta)/2;
        double areaTriangle1 = Math.sqrt(s * (s - distanceAtlantaAndOrlando)*(s - distanceFloridaAndSavannah)*(s - distanceSavannahAndAtlanta));
        double a = (distanceAtlantaAndCharlotte + distanceCharlotteAndFlorida + distanceFloridaToAtlanta)/2;
        double areaTriangle2 = Math.sqrt(a * (a - distanceAtlantaAndCharlotte) * (a - distanceCharlotteAndFlorida) * (a - distanceFloridaToAtlanta));
        double totalArea = areaTriangle1 + areaTriangle2;
        //OUTPUT
        System.out.println("The area from Georgia, Florida and Savannah is: " + Math.rint(areaTriangle1));
        System.out.println("The area from Georgia, Charlotte and Florida is: " + Math.rint(areaTriangle2));
        System.out.println("The Total area is : " + Math.rint(totalArea));

        


    }
}