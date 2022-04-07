import java.util.Random;

public class helloworld{

    public static void main(String args[]){
        RevCharsOfHW();
    }
        //Prints hello world
    public static void helloWorld(int num){
        for(int i = 1; i <= num; i++)
        System.out.println("Hello, World!");
    }
    public static void CharOfHW(int num){
        String HelloWorld = "HelloWorld";
        System.out.println(HelloWorld.charAt(num));
    }
    public static void CharsOfHW(){
        String HelloWorld = "HelloWorld";
        int num = 0;
        while(num <= HelloWorld.length()){
            System.out.println(HelloWorld.charAt(num));
            num++;
        }
    }
    public static void RevCharsOfHW(){//FIXME
        String HelloWorld = "HelloWorld";
        int num = HelloWorld.length();
        for(int i = 0; i<=num;i--){
            System.out.println(HelloWorld.charAt(num));
        }
    }
    public static void RanCharsOfHW(){
        String HelloWorld = "HelloWorld";
        Random Rnd = new Random();
        for(int i = 0; i<HelloWorld.length(); i++){
            int num = Rnd.nextInt(10);
            System.out.println(HelloWorld.charAt(num));
        }
    }

}