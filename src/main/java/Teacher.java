public class Teacher implements InfoGet{

    private final String type = "Teacher";
    private final int personCount = 10;
    private final int amountLike = 8;

    //GETTERS
    private int getPersonCount() {
        return personCount;
    }

    private int getAmountLike(){
        return amountLike;
    }

    public void printInfo(){
        System.out.printf(" %s = %s %n",type, getPersonCount());
        System.out.printf(" How many like work = %s %n", getAmountLike());
        System.out.printf("It's a %s percent %n %n", getPersonCount() * getAmountLike() / 100.0);
    }
}