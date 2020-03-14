package tw.org.iii.brad.brad08;

import android.app.Application;

public class MainApp extends Application {
    public int a;
    public String b;
    public static int c;

    @Override
    public void onCreate() {
        super.onCreate();
        a = 10;
        b = "Brad";
    }
}
