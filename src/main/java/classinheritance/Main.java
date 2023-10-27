package classinheritance;

public class Main {
    public static void main(String[] args) {
        //TODO:create several objects from non abstarct classes
        Book book1 = new Book("Learn java","learning to code",12.99,6,"Launchcode","mastering the code","bookpdf");
        Book book2 = new Book("Learn JS","learning to code JS",10.99,4,"LaunchcodeJS","mastering the codeJS","booktxt");
        UsedBook usedbook1 = new UsedBook("Learn JS","learning to code JS",10.69,7,"LaunchcodeJS","mastering the codeJS","booktxt","good");
        UsedBook usedbook2 = new UsedBook("Learn Python","learning to code py",1.99,8,"LaunchcodePY","mastering the codePY","txtbook","fair");
        Drinkware mug = new Drinkware("coffeemug","coffee is good",3.99,1,"bevarage","disney","coffee+milk",32.00);
        Drinkware mug2 = new Drinkware("teamug","tea health is good",3.99,9,"bevarage","starwars","teapowder+milk",2.00);
        Appreal hat = new Appreal("hat","used for protecting in sun",7.99,2,"Hats","MessyCat",new String[]{"OS"},new String[]{"navy","gray"});
        Appreal tShirt = new Appreal("tees","used for protecting body",2.99,4,"T-shirts","Clothes",new String[]{"xxs","xs","s","m","l"},new String[]{"black"});
                //TODO:Print each object cretaed above

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(usedbook1);
        System.out.println(usedbook2);
        System.out.println(mug);
        System.out.println(mug2);
        System.out.println(hat);
        System.out.println(tShirt);

        //TODO: increase the quantity of appreal by 5, then print the quantity
        hat.increaseQuantity(5);
        System.out.println(hat.getQuantity());
        hat.decreaseQuantity(2);
        System.out.println(hat.getQuantity());
        mug.increaseQuantity(5);
        System.out.println(mug.getQuantity());
        //TODO: Describe each object created above
        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(usedbook1.describe());
        System.out.println(usedbook2.describe());
        System.out.println(mug.describe());
        System.out.println(mug2.describe());
        System.out.println(hat.describe());
        System.out.println(tShirt.describe());
    }
}
