public class runner {

    public static void main(String[] args) {
        horse horse1 = new mustang("whale",52);
        horse horse2 = new mustang("bug", 53);
        horse horse3 = new mustang("horsey",54);
        horse[] spot = {horse1, horse2, horse3};
        for(int i=0; i<spot.length;i++){
            System.out.println(spot[i].toString());
        }

        horse[] horses = new horse[6];
        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        horseBarn barn = new horseBarn(horses);

        System.out.println(barn);
        System.out.println("Whale is in space: "+ barn.findHorseSpace("whale"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Whale is now in space: " + barn.findHorseSpace("whale"));

    }
}