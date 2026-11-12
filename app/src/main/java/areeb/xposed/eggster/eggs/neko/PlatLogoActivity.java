package areeb.xposed.eggster.eggs.neko;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

/** Entry point for the "Neko" egg: opens the cat collection (needs Android 11+ for bubbles/shortcuts). */
public class PlatLogoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 30) {
            Toast.makeText(this, "Neko needs Android 11 or newer", Toast.LENGTH_LONG).show();
        } else {
            startActivity(new Intent(this, NekoLand.class));
        }
        finish();
    }
}
