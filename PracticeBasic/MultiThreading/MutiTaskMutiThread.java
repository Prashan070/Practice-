package PracticeBasic.MultiThreading;


class FileDownloader extends Thread{
    private  String fileNAme;

    FileDownloader(String name){
        this.fileNAme=name;
    }

    @Override
    public void run() {
        System.out.println("Start downloading...." + fileNAme);

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("dowlaod interped for " + fileNAme);
        }

        System.out.println("downloading complete " + fileNAme);


    }
}


public class MutiTaskMutiThread {

    public static void main(String[] args) {

        //every time we have to create sperate obj
       FileDownloader fl = new FileDownloader("VLC");
        FileDownloader flt = new FileDownloader("Music");

       fl.start();
       flt.start();


    }
}


