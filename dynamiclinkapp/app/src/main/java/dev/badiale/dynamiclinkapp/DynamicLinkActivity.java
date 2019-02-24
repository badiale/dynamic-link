package dev.badiale.dynamiclinkapp;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;

import java.io.PrintWriter;
import java.io.StringWriter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DynamicLinkActivity extends AppCompatActivity {
    private static final String TAG = "DynamicLinkActivity";

    private View progressBar;
    private TextView url;
    private TextView param1;
    private TextView param2;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_link);

        progressBar = findViewById(R.id.progress_bar);
        url = findViewById(R.id.url);
        param1 = findViewById(R.id.param1);
        param2 = findViewById(R.id.param2);
        error = findViewById(R.id.error);

        progressBar.setVisibility(View.VISIBLE);
        FirebaseDynamicLinks.getInstance()
                .getDynamicLink(getIntent())
                .addOnSuccessListener(this, new OnSuccessListener<PendingDynamicLinkData>() {
                    @Override
                    public void onSuccess(PendingDynamicLinkData pendingDynamicLinkData) {
                        finishedLoading();
                        linkLoaded(pendingDynamicLinkData);
                    }
                })
                .addOnFailureListener(this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        finishedLoading();
                        linkFailed(e);
                    }
                });
    }

    private void finishedLoading() {
        progressBar.setVisibility(View.GONE);
    }

    private void linkFailed(@NonNull final Exception e) {
        Log.w(TAG, "getDynamicLink:onFailure", e);
        StringWriter stackTrace = new StringWriter();
        e.printStackTrace(new PrintWriter(stackTrace));
        showErrorMessage(stackTrace.toString());
    }

    private void showErrorMessage(final String message) {
        error.setVisibility(View.VISIBLE);
        error.setText(message);
    }

    private void linkLoaded(final PendingDynamicLinkData pendingDynamicLinkData) {
        if (pendingDynamicLinkData == null) {
            showErrorMessage("pendingDynamicLinkData is null");
            return;
        }
        Uri deepLink = pendingDynamicLinkData.getLink();
        if (deepLink == null) {
            showErrorMessage("deep link not found");
            return;
        }

        url.setText(deepLink.toString());
        param1.setText(deepLink.getQueryParameter("parameter1"));
        param2.setText(deepLink.getQueryParameter("parameter2"));
    }
}
