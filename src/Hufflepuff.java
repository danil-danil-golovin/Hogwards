public class Hufflepuff extends HogwardsStudents {
    private int integrity;
    private int loyalty;
    private int hardwork;

    public Hufflepuff(String name, int magicPower, int transDistance, int integrity, int loyalty, int hardwork) {
        super(name, magicPower, transDistance);
        this.integrity = integrity;
        this.loyalty = loyalty;
        this.hardwork = hardwork;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "integrity=" + integrity +
                ", loyalty=" + loyalty +
                ", hardwork=" + hardwork +
                '}';
    }

    public void compare(Hufflepuff second) {
        int firstSum = this.getIntegrity() + this.getLoyalty() + this.getHardwork();
        int secondSum = second.getIntegrity() + second.getLoyalty() + second.getHardwork();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " это лучший Пуффиндуец " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " это лучший Пуффиндуец " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равные Пуффиндуйцы ");
        }
    }
}
