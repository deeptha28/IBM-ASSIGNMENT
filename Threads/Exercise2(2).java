public class Odd implements Runnable {
    @Override
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println("OddNumbers: "+i);
            }
        }
    }
}