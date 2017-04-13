package com.example.simon.helperapp;

import android.content.Intent;
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
import android.widget.LinearLayout;
import android.widget.Spinner;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {
    String url;
    Intent share;
    LinearLayout blogcollection;
    WebView webView;
    private Menu menu;
    boolean showcontent = true;
    Spinner spinnerTop, spinnerOther, spinnerUi, spinnerLibraries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerTop = (Spinner) findViewById(R.id.spinnerTop);
        spinnerOther = (Spinner) findViewById(R.id.spinnerOther);
        spinnerUi = (Spinner) findViewById(R.id.uimockup);
        spinnerLibraries = (Spinner) findViewById(R.id.libraries);
        webView = (WebView) findViewById(R.id.webView);
        blogcollection = (LinearLayout) findViewById(R.id.blogcontent);
        spinnercontent();
        webView.setWebViewClient(new Browse());

    }

    public void spinnercontent() {
        //spinnerTop ko lagi ma item rakhne
        String[] topblog = {"AndroidHive", "Android Developer google","Viral Android", "Mindorks", "DevExchange", "Simplified Coding ", "Vogella", "Camposha", "Android guys", "Styling Android", "Android Weekly",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, topblog);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinnerTop.setAdapter(adapter);


        spinnerTop.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    url = "http://www.androidhive.info";
                    webView.loadUrl(url);
                } else if (position == 1) {
                    url = "https://android-developers.googleblog.com/";
                    webView.loadUrl(url);
                } else if (position == 2) {
                    url = "http://www.viralandroid.com/";
                    webView.loadUrl(url);
                } else if (position == 3) {
                    url = "https://blog.mindorks.com/tagged/android";
                    webView.loadUrl(url);
                } else if (position == 4) {
                    url = "http://www.devexchanges.info/";
                    webView.loadUrl(url);
                } else if (position == 5) {
                    url = "https://www.simplifiedcoding.net/";
                    webView.loadUrl(url);
                } else if (position == 6) {
                    url = "http://www.vogella.com/";
                    webView.loadUrl(url);
                } else if (position == 7) {
                    url = "http://camposha.info/";
                    webView.loadUrl(url);
                } else if (position == 8) {
                    url = "http://www.androidguys.com/";
                    webView.loadUrl(url);
                } else if (position == 9) {
                    url = "https://blog.stylingandroid.com/";
                    webView.loadUrl(url);
                } else if (position == 10) {
                    url = " http://androidweekly.net/";
                    webView.loadUrl(url);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //nothing to do
            }
        });

        //spinnerindividual ko lagi ma item rakhne
        String[] otherblog = {"Simon Astani","Alessandro Crugnola","Androidized", "Androcid","Android and Me",
                "AndroidGig ", "Android Advices","Android Developers Backstage","Team Android","Ausdroid","Androinica"
                ,"Android Social Media ","Android UI Patterns", "Surviving With Android","TechnoTalkative","TechnoWorm"};
        ArrayAdapter<String> adapterindividual = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, otherblog);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerOther.setAdapter(adapterindividual);

        spinnerOther.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    url = "http://www.sumanastani.com.np/blog";
                    webView.loadUrl(url);
                } else if (position == 1) {
                    url = "http://blog.sephiroth.it";
                    webView.loadUrl(url);
                } else if (position == 2) {
                    url = "http://www.androidized.com";
                    webView.loadUrl(url);
                } else if (position == 3) {
                    url = "http://www.androcid.com";
                    webView.loadUrl(url);
                } else if (position == 4) {
                    url = "http://androidandme.com";
                    webView.loadUrl(url);
                } else if (position == 5) {
                    url = "http://androidgig.com";
                    webView.loadUrl(url);
                } else if (position == 6) {
                    url = "http://androidadvices.com";
                    webView.loadUrl(url);
                } else if (position == 7) {
                    url = "http://androidbackstage.blogspot.com";
                    webView.loadUrl(url);
                } else if (position == 8) {
                    url = "http://www.teamandroid.com";
                    webView.loadUrl(url);
                } else if (position == 9) {
                    url = "http://ausdroid.net";
                    webView.loadUrl(url);
                } else if (position == 10) {
                    url = "http://androinica.com";
                    webView.loadUrl(url);
                } else if (position == 11) {
                    url = "http://www.androidsocialmedia.com";
                    webView.loadUrl(url);
                } else if (position == 12) {
                    url = "http://www.androiduipatterns.com";
                    webView.loadUrl(url);
                } else if (position == 13) {
                    url = "http://www.survivingwithandroid.com";
                    webView.loadUrl(url);
                } else if (position == 14) {
                    url = "http://www.technotalkative.com";
                    webView.loadUrl(url);
                } else if (position == 15) {
                    url = "http://technoworm.com";
                    webView.loadUrl(url);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //nothing to do
            }
        });


        String[] uimockup = {"Invision App", "Material ups", "Sketch App sources","WS design","Speckyboy","Seotoolzz","Dribble","Android UI/UX"};
        ArrayAdapter<String> adapterui = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, uimockup);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        spinnerUi.setAdapter(adapterui);
        spinnerUi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    url = "https://www.invisionapp.com/do";
                    webView.loadUrl(url);
                } else if (position == 1) {
                    url = "https://material.uplabs.com/posts/c/resources/interface";
                    webView.loadUrl(url);
                } else if (position == 2) {
                    url = "https://www.sketchappsources.com/tag/android.html";
                    webView.loadUrl(url);
                } else if (position == 3) {
                    url = "http://wsdesign.in/";
                    webView.loadUrl(url);
                } else if (position == 4) {
                    url = "https://speckyboy.com/free-mobile-ui-kits-ios-android/";
                    webView.loadUrl(url);
                } else if (position == 5) {
                    url = "http://seotoolzz.com/free-android-app-templates/";
                    webView.loadUrl(url);
                }else if (position == 6) {
                    url = "https://dribbble.com/tags/material_design";
                    webView.loadUrl(url);
                }else if (position == 7) {
                    url = "http://androiduiux.com";
                    webView.loadUrl(url);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        String[] libraries_project = {"20+ Awesome Open-Source Android Apps", "Must have libraries","Open source android app"
                        ,"Android app covering aspect","Top 5 libraries"};
        ArrayAdapter<String> adapterlibraries = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, libraries_project);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLibraries.setAdapter(adapterlibraries);
        spinnerLibraries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    url = "https://blog.aritraroy.in/20-awesome-open-source-android-apps-to-boost-your-development-skills-b62832cf0fa4";
                    webView.loadUrl(url);
                } else if (position == 1) {
                    url = "http://guides.codepath.com/android/Must-Have-Libraries";
                    webView.loadUrl(url);
                } else if (position == 2) {
                    url = "https://github.com/pcqpcq/open-source-android-apps";
                    webView.loadUrl(url);
                } else if (position == 3) {
                    url = "https://www.101apps.co.za/";
                    webView.loadUrl(url);
                }else if (position == 4) {
                    url = "https://infinum.co/the-capsized-eight/top-5-android-libraries-every-android-developer-should-know-about";
                    webView.loadUrl(url);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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
        getMenuInflater().inflate(R.menu.share, menu);
        this.menu = menu;
        return true;
    }
    //share menu thechda availabe app dhekawne

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.eye) {
            if (showcontent) {
                blogcollection.setVisibility(GONE);
                showcontent = false;
                menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.red_eye));
              /*  Snackbar snackbar = Snackbar
                        .make(blogcollection, "The content may take time to load based on your Internet connection", Snackbar.LENGTH_LONG);
                snackbar.show();*/
            } else {
                blogcollection.setVisibility(View.VISIBLE);
                showcontent = true;
                menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.ic_eye_white_18dp));
            }
        }
        if (id == R.id.share) {
            share = new Intent(Intent.ACTION_SEND);
            String message = getResources().getString(R.string.message);
            share.putExtra(android.content.Intent.EXTRA_TEXT, message);
            share.setType("text/plain");
            startActivity(Intent.createChooser(share, "share in social media"));
        }
        if (id == R.id.about) {
            String myweb = "http://www.sumanastani.com.np";
            webView.loadUrl(myweb);
//            setContentView(R.layout.myprofile);
           /* Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(myweb));
            startActivity(i);*/
        }
        return super.onOptionsItemSelected(item);
    }
}
