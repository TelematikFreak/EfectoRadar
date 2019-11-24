package es.ulpgc.alexmoreno.efectoradar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {
    boolean effect = false;
    RippleBackground rippleBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rippleBackground = findViewById(R.id.content);
        ImageView imageView = findViewById(R.id.centerImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (effect) {
                    stopAnimation();
                } else {
                    startAnimation();
                }
            }
        });
    }

    private void startAnimation() {
        rippleBackground.startRippleAnimation();
        this.effect = true;
    }

    private void stopAnimation() {
        rippleBackground.stopRippleAnimation();
        this.effect = false;
    }
}
