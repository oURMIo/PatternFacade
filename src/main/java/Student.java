public class Student implements InfoGet{

    private String type = "Student";
    private int personCount = 100;
    private int amountLike = 50;

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