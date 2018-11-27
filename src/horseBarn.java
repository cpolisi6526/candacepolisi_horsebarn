public class horseBarn {
    // the field is the horses in the array called spaces.
    private horse[] spaces;
    public horseBarn(horse[] spaces){
        this.spaces = spaces;
    }

    public int findHorseSpace(String name){
        for(int i=0; i<spaces.length; i++){
            if (spaces[i] != null && name.equals(spaces[i].getName())){
                return i;
            }
        }
        return -1;
    }

    public void consolidate(){
        horse[] newSpaces = new horse[spaces.length];
        int newPlaces = 0;
        for(int i = 0; i<spaces.length; i++){
            if (spaces[i] != null){
                newSpaces[newPlaces] = spaces[i];
                newPlaces++;
            }
        }
        spaces = newSpaces;
    }
}
