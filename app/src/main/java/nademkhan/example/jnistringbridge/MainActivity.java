package nademkhan.example.jnistringbridge;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView nti;

static {
        System.loadLibrary("nader"); // without "lib" and ".so"
    }
	
	public native String getNativeString();

	
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
	String message = getNativeString();
	nti = findViewById(R.id.nadertxt);
    nti.setText(message);
  }
}
