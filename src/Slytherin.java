public class Slytherin extends HogwardsStudents {
    private int cunning;
    private int ambition;
    private int powerlust;
    private int decisivence;
    private int resourcefulness;

    public Slytherin(String name, int magicPower, int transDistance, int cunning, int ambition, int powerlust, int decisivence, int resourcefulness) {
        super(name, magicPower, transDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.powerlust = powerlust;
        this.decisivence = decisivence;
        this.resourcefulness = resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getPowerlust() {
        return powerlust;
    }

    public void setPowerlust(int powerlust) {
        this.powerlust = powerlust;
    }

    public int getDecisivence() {
        return decisivence;
    }

    public void setDecisivence(int decisivence) {
        this.decisivence = decisivence;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", ambition=" + ambition +
                ", powerlust=" + powerlust +
                ", decisivence=" + decisivence +
                ", resourcefulness=" + resourcefulness +
                '}';
    }

    public void compare(Slytherin second) {
        int firstSum = this.getCunning() + this.getAmbition() + this.getPowerlust() + this.getDecisivence() + this.getResourcefulness();
        int secondSum = second.getCunning() + second.getAmbition() + second.getPowerlust() + second.getDecisivence() + second.getResourcefulness();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " это лучший Слизеринец " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " это лучший Слизеринец " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равные Слизеринцы ");
        }
    }
}
