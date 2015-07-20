package saulmm.gradlestuff;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView ad 	= (TextView) findViewById(R.id.activity_main_ad);
		TextView flavor = (TextView) findViewById(R.id.activity_main_flavor);
		flavor.setText("Flavor: "+BuildConfig.FLAVOR);

		if (BuildConfig.ADS)
			ad.setVisibility(View.VISIBLE);
	}
}
