package PracticeBasic.MultiThreadingPractice;

class FileDownloader extends Thread {

    private String fileName;

    FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        System.out.println("Thread tasK......" + fileName);

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Download is distribute..." + fileName);
        }

        System.out.println("downlaod is completed " + fileName);
    }


}

class ThreadCreationUsingThreadClass {


    public static void main(String[] args) {

        FileDownloader t1 = new FileDownloader("File1");
        FileDownloader t2 = new FileDownloader("File2");


        t1.start();
        t2.start();

    }
}