public class Student implements InfoGet{

    private int Person = 100;
    private int amountLike = 50;

    private void howManyPerson() {
        System.out.printf(" Teacher = %s %n", Person);
    }

    private void howManyLike() {
        System.out.printf(" How many like work = %s %n", amountLike);
    }
    public void printInfo(){
        howManyPerson();
        howManyLike();
        System.out.printf("It's a %s percent %n %n", String.valueOf(Person*amountLike/100.0));
    }
}