package areeb.xposed.eggster.eggs.oreo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/** Entry point for the "Oreo" egg: opens the octopus aquarium directly. */
public class PlatLogoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, Ocquarium.class));
        finish();
    }
}
