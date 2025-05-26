package PracticeBasic.Basic;

public class FinalBehaviour {

    final static int num;

   static  {
        num=100;
       System.out.println("static test");
    }

    {
        System.out.println("instance test");
    }

    public  void finalBehaviourmethod(){
        System.out.println(this.num);
    }

    public static void main(String[] args) {
        FinalBehaviour finalBehaviour = new FinalBehaviour();
        finalBehaviour.finalBehaviourmethod();
    }
}
