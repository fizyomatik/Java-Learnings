package src.practiceLoops;

public class PracticeLoops {
    public static void main(String[] args) {
        int count= 0;

        while (count<=10){
            System.out.println("Non-Stop~! " + count);
            count =count+1;
            if(count==8){
                break;
            }
        }
    }
}
