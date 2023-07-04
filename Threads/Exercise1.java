public class Hello extends Thread {
    @Override
    public void start(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args){
        Hello thread=new Hello();
        thread.start();
    }
    
}
