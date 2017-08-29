class PezDispenser {

    public static final int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;


    // Constructors have the same name as the class
    // Once you create a constructor, the default construtor is not available (if you didn't create a constructor,
    // Java will automaticaly create a constructor for you
    public PezDispenser(String characterName) {
        this.characterName = characterName;      // "this" refers to characterName on Line 2
        pezCount = 0;
    }


    public String getCharacterName() {
        return characterName;
    }

    public void fill() {
        fill(MAX_PEZ);
    }



    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too Many PEZ!!!");
        }
        pezCount = newAmount;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

}