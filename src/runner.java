public class HorseRunner {
    public static void main(String[] args){
        horse horse1= new mustang("Secretariat", 12000);
        horse horse2= new mustang("Dusty Trail", 22000);
        horse horse3= new mustang("Silver",12000);

        horse[] horses= new horse[6];

        horses[1]=horse1;
        horses[3]=horse2;
        horses[5]=horse3;
        horseBarn barn= new horseBarn(horses);

        System.out.println(barn);
        System.out.println("Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Dusty trail is now in space: " + barn.findHorseSpace("Dusty trail"));

        }

}
