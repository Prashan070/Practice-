package PracticeBasic.SingltonPattern;

public class c_SyncronizedBlock {
    private static c_SyncronizedBlock instance;

    private c_SyncronizedBlock(){

    }
   synchronized public static c_SyncronizedBlock getInstance(){
        if(instance ==null){
            instance = new c_SyncronizedBlock();
        }
        return instance;
    }
}
