public class Teacher implements InfoGet{

    private String type = "Teacher";
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
        System.out.printf(" %s = %s %n",type, getPersonCount());
        System.out.printf(" How many like work = %s %n", getAmountLike());
        System.out.printf("It's a %s percent %n %n", String.valueOf(getPersonCount()*getAmountLike()/100.0));
    }
}