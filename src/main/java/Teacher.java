public class Teacher implements InfoGet{

    private int personCount = 10;
    private int amountLike = 8;

    //GETTERS
    private int getPersonCount() {
        return personCount;
    }

    private int getAmountLike(){
        return amountLike;
    }

    public void printInfo(){
        System.out.printf(" Teacher = %s %n", getPersonCount());
        System.out.printf(" How many like work = %s %n", getAmountLike());
        System.out.printf("It's a %s percent %n %n", String.valueOf(getPersonCount()*getAmountLike()/100.0));
    }
}