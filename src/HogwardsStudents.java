public class HogwardsStudents {
    private String name;
    private int magicPower;
    private int transDistance;


    public HogwardsStudents(String name, int magicPower, int transDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transDistance = transDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransDistance() {
        return transDistance;
    }

    public void setTransDistance(int transDistance) {
        this.transDistance = transDistance;
    }

    public void compareAnyStudent(HogwardsStudents second) {
        if (this.getMagicPower() > second.getMagicPower()) {
            System.out.println(this.getName() + " сильнее чем" + second.getName());
        } else if (this.getMagicPower() == second.getMagicPower()) {
            System.out.println(this.getName() + " равен по силе " + second.getName());
        } else {
            System.out.println(second.getName() + " слабее чем " + this.getName());
        }
        if (this.getTransDistance() > second.getTransDistance()) {
            System.out.println(this.getName() + " большая дальность чем " + second.getName());
        } else if (this.getTransDistance() == second.getTransDistance()) {
            System.out.println(this.getName() + " одинаковая дальность " + second.getName());
        } else {
            System.out.println(second.getName() + " меньшая дальность " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "Hogwards{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transDistance=" + transDistance +
                '}';
    }
}

