package dio.aula.java.avancado.exercicios;

public class ExemploThread {

    public static void main(String[] args) {

        GerarPDF gerarPDF = new GerarPDF();
        LoadingBarWithThread loadingBarWithThread = new LoadingBarWithThread(gerarPDF);

        loadingBarWithThread.start();

    }
}

class GerarPDF extends Thread{
    @Override
    public void run() {
        System.out.println("Gerando PDF...");
        try {
            Thread.sleep(5000);
            System.out.println("Pdf gerado!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LoadingBar implements Runnable{
    @Override
    public void run() {
        System.out.println("loading ...");
    }
}

class LoadingBarWithThread extends Thread{

    private Thread iniciarGeradorPDF;

    public LoadingBarWithThread(Thread iniciarGeradorPDF){
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }


    @Override
    public void run() {
        iniciarGeradorPDF.start();
        while (true){
            try {
                Thread.sleep(500);
                if (!iniciarGeradorPDF.isAlive()){
                    break;
                }
                System.out.println("Loading ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class LoadingBarWithThread2 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("rodei2 " +this.getName());
        try {
            Thread.sleep(5000);
            System.out.println("Agora2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}