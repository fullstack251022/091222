public class Main {


//    public static void addAge(Person p){
//
//    }

//    public static void printPowNumber(int y) {
//        y = y * y;
//        System.out.println(y);
//    }

//    public static void printPowAge(Person y) {
//        y.age = y.age * y.age;
////        int powAge = y.age * y.age;
//        System.out.println( y.age);
//    }


    public static void main(String[] args) {


//        int [] myArray = new int[3];

        int[] myArray = {5, 10, 20};
        int[] anotherArray = myArray; //danger
        anotherArray[0] = 10;
        System.out.println(anotherArray[0]);
        System.out.println(myArray[0]); //why??


//        Person p1 = new Person();
//        p1.age = 10;
//        Person p2 = new Person();
//        p2 = p1;
//        p2.age = 100;
//        System.out.println(p2.age);
//        System.out.println(p1.age); //why??


//    Person p1 = new Person(10);
//    printPowAge(p1);
//    System.out.println(p1.age);


//        int x = 10;
//        printPowNumber(x);
//        System.out.println(x);


//        int x = 5; //primitive
//        int y = x;
//        y = 10;
//        System.out.println(y);
//        System.out.println(x);
//
//
//        Person p1 = new Person(5);
//        Person p2 = p1;
//        p2.age = 15;
//        System.out.println(p2.age);
//        System.out.println(p1.age);
    }
}
