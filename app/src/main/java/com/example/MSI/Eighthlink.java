package com.example.MSI;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Eighthlink extends AppCompatActivity {

    String websiteURL = "https://www.google.com/fbx?fbx=snake_arcade"; // sets web url
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighthlink);

        if( ! CheckNetwork8.isInternetAvailable(this)) //returns true if internet available
        {
            //if there is no internet do this
            setContentView(R.layout.activity_eighthlink);
            //Toast.makeText(this,"No Internet Connection, Chris",Toast.LENGTH_LONG).show();

            new AlertDialog.Builder(this) //alert the person knowing they are about to close
                    .setTitle("No internet connection available")
                    .setMessage("Please Check your Mobile data or Wifi network.")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    //.setNegativeButton("No", null)
                    .show();

        }
        else
        {
            //Webview stuff
            webview = findViewById(R.id.webView8);
            webview.getSettings().setJavaScriptEnabled(true);
            webview.getSettings().setDomStorageEnabled(true);
            webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
            webview.loadUrl(websiteURL);
            //  webview.setWebViewClient(new WebViewClientDemo());

        }



    }



    //set back button functionality
    @Override
    public void onBackPressed() { //if user presses the back button do this
        if (webview.isFocused() && webview.canGoBack()) { //check if in webview and the user can go back
            webview.goBack(); //go back in webview
        } else { //do this if the webview cannot go back any further

            new AlertDialog.Builder(this) //alert the person knowing they are about to close
                    .setTitle("EXIT")
                    .setMessage("Are you sure. You want to close this app?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }

}

class CheckNetwork8 {

    private static final String TAG = CheckNetwork8.class.getSimpleName();

    public static boolean isInternetAvailable(Context context)
    {
        NetworkInfo info = (NetworkInfo) ((ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();

        if (info == null)
        {
            Log.d(TAG,"No Internet Connection");
            return false;
        }
        else
        {
            if(info.isConnected())
            {
                Log.d(TAG," Internet Connection Available...");
                return true;
            }
            else
            {
                Log.d(TAG," Internet Connection");
                return true;
            }

        }
    }
}