public class Ravenclaw extends HogwardsStudents {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transDistance, int intelligence, int wisdom, int wit, int creativity){
        super(name, magicPower, transDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
    public void compare(Ravenclaw second) {
        int firstSum = this.getIntelligence() + this.getWisdom() + this.getWit()+ this.getCreativity();
        int secondSum = second.getIntelligence() + second.getWisdom() + second.getWit()+ second.getCreativity();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " это лучший Когтевранец " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " это лучший Когтевранец " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равные Когтевранцы ");
        }
    }
}
