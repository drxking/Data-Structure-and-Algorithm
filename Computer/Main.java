package Computer;
public class Main {
    public static void main(String[] args) {
        Computer hp = new Computer("HP",16, "en-us", "Black");

        Computer dell = new Computer("Dell",34, "en-uk", "Green");

        System.out.println(hp.dimension);
        System.out.println(dell.dimension);
        dell.Display("Suckxam is Very Good Boy!");


        dell.updateStore(11, 15);


       int data=  dell.getData(7);
       System.out.println(data);

    }
}
