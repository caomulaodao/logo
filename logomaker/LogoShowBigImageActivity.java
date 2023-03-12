package com.logomaster.logomaker;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.sdk.controller.C9286v;
import com.logomaster.logomaker.databinding.ActivityLogoShowBigImageBinding;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoShowBigImageActivity extends AppCompatActivity {
    private ActivityLogoShowBigImageBinding binding;
    public String abc1000 = "o 'get' ";
    public ArrayList<Integer> abc0 = new ArrayList<>();
    public String abc1001 = "lot and ";

    /* renamed from: com.logomaster.logomaker.LogoShowBigImageActivity$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9588a implements View.OnClickListener {
        public View$OnClickListenerC9588a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoShowBigImageActivity.this.onBackPressed();
            if (!TextUtils.isEmpty(LogoShowBigImageActivity.this.abc1001)) {
                int length = LogoShowBigImageActivity.this.abc1001.length();
                LogoShowBigImageActivity logoShowBigImageActivity = LogoShowBigImageActivity.this;
                logoShowBigImageActivity.abc1001 = LogoShowBigImageActivity.this.abc1001 + length;
            }
            if (!TextUtils.isEmpty(LogoShowBigImageActivity.this.abc1001)) {
                int length2 = LogoShowBigImageActivity.this.abc1001.length();
                LogoShowBigImageActivity logoShowBigImageActivity2 = LogoShowBigImageActivity.this;
                logoShowBigImageActivity2.abc1001 = LogoShowBigImageActivity.this.abc1001 + length2;
            }
            if (!TextUtils.isEmpty(LogoShowBigImageActivity.this.abc1001)) {
                int length3 = LogoShowBigImageActivity.this.abc1001.length();
                LogoShowBigImageActivity logoShowBigImageActivity3 = LogoShowBigImageActivity.this;
                logoShowBigImageActivity3.abc1001 = LogoShowBigImageActivity.this.abc1001 + length3;
            }
            if (LogoShowBigImageActivity.this.abc0.size() < 2) {
                LogoShowBigImageActivity.this.abc0.add(5);
                LogoShowBigImageActivity logoShowBigImageActivity4 = LogoShowBigImageActivity.this;
                logoShowBigImageActivity4.abc1001 = "o many ";
                logoShowBigImageActivity4.abc1001 = "rprising o";
                logoShowBigImageActivity4.abc1000 = " th";
            }
            LogoShowBigImageActivity logoShowBigImageActivity5 = LogoShowBigImageActivity.this;
            logoShowBigImageActivity5.abc1001 = "ar when";
            if (!TextUtils.isEmpty(logoShowBigImageActivity5.abc1000)) {
                int length4 = LogoShowBigImageActivity.this.abc1000.length();
                LogoShowBigImageActivity logoShowBigImageActivity6 = LogoShowBigImageActivity.this;
                logoShowBigImageActivity6.abc1000 = LogoShowBigImageActivity.this.abc1000 + length4;
            }
            LogoShowBigImageActivity.this.abc1000 = "udice i";
        }
    }

    public int getStatusBarHeight() {
        int i;
        this.abc1001 = " ea";
        if (!TextUtils.isEmpty(" ea")) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc0.size() < 1) {
            this.abc0.add(6);
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1000 = "h";
            if (!TextUtils.isEmpty("h")) {
                this.abc1000 += this.abc1000.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = "hat";
        this.abc1001 = "w";
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = "century,";
        if (!TextUtils.isEmpty("century,")) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc0.size() < 9) {
            this.abc0.add(4);
            this.abc1000 = "ising";
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1000 = "y ";
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (identifier > 0) {
            i = getResources().getDimensionPixelSize(identifier);
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1001 = "' ";
            if (this.abc0.size() > 9) {
                this.abc0.add(5);
                this.abc1001 = "l,";
                this.abc1000 = " y";
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1000 = "sis, and";
        } else {
            i = 0;
        }
        this.abc1000 = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        ArrayList<Integer> arrayList = this.abc0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc0.remove(0);
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1000 = "iar w";
            if (!TextUtils.isEmpty("iar w")) {
                this.abc1000 += this.abc1000.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = " m";
        return i;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.abc1000 = "ent is ech";
        if (!TextUtils.isEmpty("ent is ech")) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1000 = "ts plot a";
            if (!TextUtils.isEmpty("ts plot a")) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1001 = "Stone, t";
        this.abc1000 = "egative ";
        requestWindowFeature(1);
        this.abc1000 = "in m";
        this.abc1001 = ", it’s m";
        if (!TextUtils.isEmpty("in m")) {
            this.abc1000 += this.abc1000.length();
        }
        ArrayList<Integer> arrayList = this.abc0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc0.remove(0);
            this.abc1000 = "t";
            if (!TextUtils.isEmpty("t")) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1001 = "kind o";
        this.abc1000 = "inspi";
        this.binding = (ActivityLogoShowBigImageBinding) DataBindingUtil.setContentView(this, R.layout.activity_logo_show_big_image);
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1001 = "osetta";
        if (!TextUtils.isEmpty("osetta")) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1001 = "is)";
        this.binding.setLifecycleOwner(this);
        this.abc1001 = "nity ";
        this.abc1000 = "t received";
        if (!TextUtils.isEmpty("nity ")) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc0.size() < 7) {
            this.abc0.add(4);
            this.abc1000 = "ent is ";
            this.abc1001 = "n groanin";
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = "in the ";
        setSupportActionBar(this.binding.toolbar);
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1001 = "th ";
        if (this.abc0.size() > 0) {
            this.abc0.add(8);
            this.abc1001 = "s the nove";
        }
        this.abc1001 = "y is surp";
        this.abc1000 = "l";
        Uri uri = (Uri) getIntent().getParcelableExtra("logo");
        this.abc1000 = "ull. Melv";
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1001 = "it’s";
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            this.abc1000 = "ry year wh";
            this.abc1001 = "ode";
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = "de ";
        File file = (File) getIntent().getSerializableExtra("logoFile");
        this.abc1001 = " Sto";
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            this.abc1000 = "aning ";
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1001 = "nd the ne";
        }
        this.abc1001 = "r";
        this.abc1000 = "k. For a ";
        if (uri == null) {
            Glide.m18503v(this).m1886q(file).m2170p0(this.binding.ivBigImage);
            this.abc1000 = "e f";
            ArrayList<Integer> arrayList2 = this.abc0;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc0.remove(0);
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1000 = " to read ";
                if (!TextUtils.isEmpty(this.abc1001)) {
                    this.abc1001 += this.abc1001.length();
                }
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        } else {
            Glide.m18503v(this).m1887p(uri).m2170p0(this.binding.ivBigImage);
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1001 = "pro";
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            ArrayList<Integer> arrayList3 = this.abc0;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc0.remove(0);
                this.abc1001 = "and c";
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1000 = "every ye";
            }
            this.abc1001 = " are ";
            if (!TextUtils.isEmpty(" are ")) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1001 = "o";
        }
        this.abc1001 = "hink";
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1000 = "ication";
            this.abc1001 = "d P";
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.binding.llMain.setOnClickListener(new View$OnClickListenerC9588a());
        this.abc1001 = "udents ar";
        this.abc1000 = " it is)";
        if (!TextUtils.isEmpty(" it is)")) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            this.abc1001 = "for b";
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = "to 'get";
        this.abc1001 = "h c";
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.abc1000 = "o";
        this.abc1001 = "he n";
        if (!TextUtils.isEmpty("o")) {
            this.abc1000 += this.abc1000.length();
        }
        ArrayList<Integer> arrayList = this.abc0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc0.remove(0);
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1000 = "is su";
            this.abc1001 = "e’";
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = "nd ";
        int statusBarHeight = getStatusBarHeight();
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = " groaning";
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1000 = C9286v.f15223a;
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = " well o";
        ViewGroup.LayoutParams layoutParams = this.binding.statusView.getLayoutParams();
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = "w great it";
        this.abc1001 = "rne";
        if (this.abc0.size() < 3) {
            this.abc0.add(4);
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1001 = "eat ";
        }
        this.abc1001 = "ille’s no";
        if (!TextUtils.isEmpty("ille’s no")) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = "miliar wi";
        layoutParams.height = statusBarHeight;
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1001 = "defined ";
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1001 = "ned reput";
        }
        this.abc1001 = " ";
        this.abc1000 = " groa";
        if (!TextUtils.isEmpty(" ")) {
            this.abc1001 += this.abc1001.length();
        }
        this.binding.statusView.setLayoutParams(layoutParams);
        this.abc1000 = "l on publ";
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc0.size() < 3) {
            this.abc0.add(4);
            this.abc1001 = " many ";
            this.abc1000 = "took";
            if (!TextUtils.isEmpty(" many ")) {
                this.abc1001 += this.abc1001.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (TextUtils.isEmpty(this.abc1001)) {
            return;
        }
        this.abc1001 += this.abc1001.length();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.abc1001 = "s before p";
        if (!TextUtils.isEmpty("s before p")) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = "peo";
        if (this.abc0.size() < 3) {
            this.abc0.add(0);
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1001 = "'";
            if (!TextUtils.isEmpty("'")) {
                this.abc1001 += this.abc1001.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = ". You’re ";
        int statusBarHeight = getStatusBarHeight();
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = "or a";
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        ArrayList<Integer> arrayList = this.abc0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc0.remove(0);
            this.abc1000 = "ntil ";
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
        }
        this.abc1001 = "tu";
        this.abc1000 = " what a mo";
        if (!TextUtils.isEmpty(" what a mo")) {
            this.abc1000 += this.abc1000.length();
        }
        ViewGroup.LayoutParams layoutParams = this.binding.statusView.getLayoutParams();
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = " ";
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        ArrayList<Integer> arrayList2 = this.abc0;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc0.remove(0);
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = "ecades";
        this.abc1001 = " it’";
        layoutParams.height = statusBarHeight;
        this.abc1001 = "asi";
        if (!TextUtils.isEmpty("ecades")) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1001 = "negati";
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1001 = " You";
        this.abc1000 = "surpri";
        this.binding.statusView.setLayoutParams(layoutParams);
        this.abc1001 = "ry year";
        this.abc1000 = "ok d";
        if (!TextUtils.isEmpty("ry year")) {
            this.abc1001 += this.abc1001.length();
        }
        ArrayList<Integer> arrayList3 = this.abc0;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc0.remove(0);
            this.abc1000 = "n novel";
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1001 = "novel th";
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = "forced";
    }
}
