
import blooddonor.HOME;

public class Main {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                javafx.application.Application.launch(HOME.class);
            }
        }.start();
        
    }
}