public class Griffindor extends HogwardsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor (String name, int magicPower, int transDistance, int nobility, int honor, int bravery){
        super(name, magicPower, transDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
    public void compare(Griffindor second){
        int firstSum = this.getBravery() + this.getHonor() + this.getNobility();
        int secondSum = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstSum > secondSum){
            System.out.println(this.getName()+ " это лучший Гриффиндорец " + second.getName());
        }
        else if (secondSum > firstSum){
            System.out.println(second.getName()+ " это лучший Гриффиндорец " + this.getName());
        }
        else {
            System.out.println(this.getName()+ " и " + second.getName() + " равные Гриффиндорцы ");
        }
    }
}
