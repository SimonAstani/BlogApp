package com.example.simon.helperapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String url;
    Intent share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinnergroup = (Spinner) findViewById(R.id.spinnergroup);
        final Spinner spinnerIndividaul = (Spinner) findViewById(R.id.spinnerIndividual);
        final WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new Browse());

        //spinnergroup ko lagi ma item rakhne
        String[] bloggroup = {"simon", "Androcid", "Androinica","Android","Android Developers ","Blog","Android Official Blog","Android UI Patterns ","Ausdroid","Team Android","Android and Me","Androidized",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, bloggroup);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinnergroup.setAdapter(adapter);

        spinnergroup.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    url = "http://www.sumanastani.com.np/blog";
                    webView.loadUrl(url);
                } else if (position == 1) {
                    url = "http://www.androcid.com";
                    webView.loadUrl(url);
                } else if (position == 2) {
                    url = "http://androinica.com";
                    webView.loadUrl(url);
                } else if (position == 3) {
                    url = " Advices http://androidadvices.com";
                    webView.loadUrl(url);
                } else if (position == 4) {
                    url = "https://android-developers.blogspot.com";
                    webView.loadUrl(url);
                } else if (position == 5) {
                    url = "https://officialandroid.blogspot.com";
                    webView.loadUrl(url);
                } else if (position == 6) {
                    url = "http://www.androiduipatterns.com";
                    webView.loadUrl(url);
                } else if (position == 7) {
                    url = "http://ausdroid.net";
                    webView.loadUrl(url);
                } else if (position == 8) {
                    url = "http://www.teamandroid.com";
                    webView.loadUrl(url);
                } else if (position == 9) {
                    url = "http://androidandme.com";
                    webView.loadUrl(url);
                } else if (position == 10) {
                    url = "http://www.androidized.com";
                    webView.loadUrl(url);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //nothing to do
            }
        });


        //spinnerindividual ko lagi ma item rakhne
        String[] blogindividual = {"Alessandro Crugnola", "AndroidHive ", "AndroidGig ","Android Developer","Android Developers Backstage"
                ,"Android Social Media ","Android UI/UX ","Surviving With Android","TechnoTalkative","TechnoWorm","simonAstani"};
        ArrayAdapter<String> adapterindividual = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, blogindividual);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerIndividaul.setAdapter(adapterindividual);

        spinnerIndividaul.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    url = "http://blog.sephiroth.it";
                    webView.loadUrl(url);
                } else if (position == 1) {
                    url = "http://www.androidhive.info";
                    webView.loadUrl(url);
                } else if (position == 2) {
                    url = "http://androidgig.com";
                    webView.loadUrl(url);
                } else if (position == 3) {
                    url = "http://www.therealjoshua.com/blog";
                    webView.loadUrl(url);
                } else if (position == 4) {
                    url = "http://androidbackstage.blogspot.com";
                    webView.loadUrl(url);
                } else if (position == 5) {
                    url = "http://www.androidsocialmedia.com";
                    webView.loadUrl(url);
                } else if (position == 6) {
                    url = "http://androiduiux.com";
                    webView.loadUrl(url);
                } else if (position == 7) {
                    url = "http://www.survivingwithandroid.com";
                    webView.loadUrl(url);
                } else if (position == 8) {
                    url = "http://www.technotalkative.com";
                    webView.loadUrl(url);
                } else if (position == 9) {
                    url = "http://technoworm.com";
                    webView.loadUrl(url);
                } else if (position == 10) {
                    url = "http://www.sumanastani.com.np/blog";
                    webView.loadUrl(url);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //nothing to do
            }
        });

    }
    private class Browse extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(url);
            return true;
        }
    }

    //share menu lai inflate garne

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share,menu);
        return true;
    }
    //share menu thechda availabe app dhekawne

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.share) {
            share = new Intent(Intent.ACTION_SEND);
            String message = getResources().getString(R.string.message);
            share.putExtra(android.content.Intent.EXTRA_TEXT,message);
            share.setType("text/plain");
            startActivity(Intent.createChooser(share,"share in social media"));
        }
        if (id == R.id.about) {
            String myweb = "http://www.sumanastani.com.np";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(myweb));
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
