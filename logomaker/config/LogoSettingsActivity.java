package com.logomaster.logomaker.config.LogoSettingsActivity;
import com.applovin.mediation.MaxAdListener;
import android.app.Activity;
import java.util.ArrayList;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.mediation.ads.MaxInterstitialAd;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import android.content.res.Resources;
import android.app.Dialog;
import java.lang.Exception;
import android.os.Handler;
import com.logomaster.logomaker.config.LogoSettingsActivity$a;
import java.lang.Runnable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import android.content.Intent;
import com.logomaster.logomaker.config.LogoSettingsActivity$b;
import android.os.Bundle;
import android.content.Context;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdk$SdkInitializationListener;

public class LogoSettingsActivity extends Activity implements MaxAdListener	// class@000d55
{
    public MaxInterstitialAd a;
    public int[] b;
    public int[] c;
    public String d;
    public boolean e;
    public ArrayList f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public bi l;
    public ai m;
    public int[] n;

    static {
    }
    public void LogoSettingsActivity(){
       super();
       int[] ointArray = new int[15];
       this.b = ointArray;
       ointArray = new int[13];
       this.c = ointArray;
       this.d = "      andr";
       this.e = false;
       this.f = new ArrayList();
       this.g = "rhu17kxdahu17kxdthu17kxd";
       this.h = "mkisjeimkisjeomkisje";
       this.i = "bhuiwibhuiwmbhuiwpbhuiwrbhuiwebhuiw";
       this.j = "oixnHuzsoixnHuzsoixnHuz";
       this.k = "";
       ointArray = new int[18];
       this.n = ointArray;
    }
    public static void a(LogoSettingsActivity p0,AppLovinSdkConfiguration p1){
       p0.e(p1);
    }
    public static MaxInterstitialAd b(LogoSettingsActivity p0){
       return p0.a;
    }
    private void e(AppLovinSdkConfiguration p0){
       int[] ointArray;
       int i5;
       LogoSettingsActivity b1;
       int i7;
       int i8;
       int[] ointArray1;
       LogoSettingsActivity b2;
       LogoSettingsActivity f;
       int[] ointArray2;
       LogoSettingsActivity f1;
       int[] ointArray3;
       int[] ointArray4;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       int i2 = 10;
       if (logoSettings.b == null) {
          ointArray = new int[i2];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[i2];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       int i3 = 7;
       if (c != null) {
          c[i] = i3;
       }
       int i4 = 4;
       if (c != null) {
          c[i4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             int i6 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i7 = 3;
                label_0062 :
                   if (i6 < i7) {
                      b1[i6] = 3;
                      i6 = i6 + 1;
                   }
                }else {
                   i7 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i5;
          if (logoSettings.c != null) {
             i5 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i8 = 3;
                label_008b :
                   if (i5 < i8) {
                      c1[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i8 = c1.length;
                   goto label_008b ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00ae :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       i5 = so.a("LoGoData", 0).b("lo_f");
       b1 = logoSettings.b;
       if (b1 != null) {
          b1[3] = i;
       }
       b1 = logoSettings.c;
       if (b1 != null) {
          b1[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[i2];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[i2];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       b1 = logoSettings.c;
       if (b1 != null) {
          b1[i] = i3;
       }
       if (b1 != null) {
          b1[i4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i8 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i7 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i3 = 3;
                label_011d :
                   if (i7 < i3) {
                      b2[i7] = 3;
                      i7 = i7 + 1;
                      i3 = 7;
                   }
                }else {
                   i3 = b2.length;
                   goto label_011d ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i8;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                b2 = logoSettings.c;
                if (b2.length > 3) {
                   i8 = 3;
                label_0147 :
                   if (i3 < i8) {
                      b2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i8 = b2.length;
                   goto label_0147 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          f = logoSettings.f;
          if (f != null && f.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_016a :
       f = logoSettings.n;
       if (f != null) {
          f[0] = 0;
       }
       f = logoSettings.c;
       if (f != null) {
          f[2] = 3;
       }
       b2 = logoSettings.b;
       if (b2 != null) {
          b2[5] = 2;
       }
       if (b2 != null) {
          b2[3] = i;
       }
       if (f != null) {
          f[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray2 = new int[i2];
          logoSettings.b = ointArray2;
       }
       if (logoSettings.c == null) {
          ointArray2 = new int[i2];
          logoSettings.c = ointArray2;
       }
       logoSettings.e = false;
       f = logoSettings.c;
       if (f != null) {
          f[i] = 7;
       }
       if (f != null) {
          f[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i4 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i7 = 3;
                label_01ca :
                   if (i4 < i7) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i7 = b1.length;
                   goto label_01ca ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                b2 = logoSettings.c;
                if (b2.length > 3) {
                   i8 = 3;
                label_01f3 :
                   if (i3 < i8) {
                      b2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i8 = b2.length;
                   goto label_01f3 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          f = logoSettings.f;
          if (f != null && f.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0216 :
       f = logoSettings.n;
       if (f != null) {
          f[0] = 0;
       }
       f = logoSettings.c;
       if (f != null) {
          f[2] = 3;
       }
       f = logoSettings.b;
       if (f != null) {
          f[5] = 2;
       }
       String str1 = this.getResources().getString(0x7f120020);
       b1 = logoSettings.b;
       if (b1 != null) {
          b1[3] = i;
       }
       b1 = logoSettings.c;
       if (b1 != null) {
          b1[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[i2];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[i2];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       b1 = logoSettings.c;
       if (b1 != null) {
          b1[i] = 7;
       }
       if (b1 != null) {
          b1[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i8 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i7 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_0285 :
                   if (i7 < i2) {
                      b2[i7] = 3;
                      i7 = i7 + 1;
                      i2 = 10;
                   }
                }else {
                   i2 = b2.length;
                   goto label_0285 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i8;
          if (logoSettings.c != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.c;
                if (b2.length > 3) {
                   i8 = 3;
                label_02b0 :
                   if (i2 < i8) {
                      b2[i2] = 5;
                      i2 = i2 + 1;
                   }
                }else {
                   i8 = b2.length;
                   goto label_02b0 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          f1 = logoSettings.f;
          if (f1 != null && f1.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_02d3 :
       f1 = logoSettings.n;
       if (f1 != null) {
          f1[0] = 0;
       }
       f1 = logoSettings.c;
       if (f1 != null) {
          f1[2] = 3;
       }
       b2 = logoSettings.b;
       if (b2 != null) {
          b2[5] = 2;
       }
       if (b2 != null) {
          b2[3] = i;
       }
       if (f1 != null) {
          f1[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          i2 = 10;
          ointArray3 = new int[i2];
          logoSettings.b = ointArray3;
       }else {
          i2 = 10;
       }
       if (logoSettings.c == null) {
          ointArray3 = new int[i2];
          logoSettings.c = ointArray3;
       }
       logoSettings.e = false;
       f1 = logoSettings.c;
       if (f1 != null) {
          f1[i] = 7;
       }
       if (f1 != null) {
          f1[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i4 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i7 = 3;
                label_0338 :
                   if (i4 < i7) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i7 = b1.length;
                   goto label_0338 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i2;
          if (logoSettings.c != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.c;
                if (b2.length > 3) {
                   i8 = 3;
                label_0361 :
                   if (i2 < i8) {
                      b2[i2] = 5;
                      i2 = i2 + 1;
                   }
                }else {
                   i8 = b2.length;
                   goto label_0361 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          f1 = logoSettings.f;
          if (f1 != null && f1.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0384 :
       f1 = logoSettings.n;
       if (f1 != null) {
          f1[0] = 0;
       }
       f1 = logoSettings.c;
       if (f1 != null) {
          f1[2] = 3;
       }
       b2 = logoSettings.b;
       if (b2 != null) {
          b2[5] = 2;
       }
       if (i5 > 0) {
          if (b2 != null) {
             b2[3] = i;
          }
          if (f1 != null) {
             f1[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i5 = 10;
             ointArray4 = new int[i5];
             logoSettings.b = ointArray4;
          }else {
             i5 = 10;
          }
          if (logoSettings.c == null) {
             ointArray4 = new int[i5];
             logoSettings.c = ointArray4;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = 7;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i5 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   f = logoSettings.b;
                   if (f.length > 3) {
                      i4 = 3;
                   label_03eb :
                      if (i2 < i4) {
                         f[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i4 = f.length;
                      goto label_03eb ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i5;
             if (logoSettings.c != null) {
                i5 = 0;
                while (true) {
                   f1 = logoSettings.c;
                   if (f1.length > 3) {
                      i3 = 3;
                   label_0414 :
                      if (i5 < i3) {
                         f1[i5] = 5;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = f1.length;
                      goto label_0414 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_0437 :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[2] = 3;
          }
          f1 = logoSettings.b;
          if (f1 != null) {
             f1[5] = 2;
          }
          if (f1 != null) {
             f1[3] = i;
          }
          if (c != null) {
             c[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i5 = 10;
             ointArray4 = new int[i5];
             logoSettings.b = ointArray4;
          }else {
             i5 = 10;
          }
          if (logoSettings.c == null) {
             ointArray4 = new int[i5];
             logoSettings.c = ointArray4;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = 7;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i5 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   f = logoSettings.b;
                   if (f.length > 3) {
                      i4 = 3;
                   label_049c :
                      if (i2 < i4) {
                         f[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i4 = f.length;
                      goto label_049c ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i5;
             if (logoSettings.c != null) {
                i5 = 0;
                while (true) {
                   f1 = logoSettings.c;
                   if (f1.length > 3) {
                      i3 = 3;
                   label_04c5 :
                      if (i5 < i3) {
                         f1[i5] = 5;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = f1.length;
                      goto label_04c5 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_04e8 :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[2] = 3;
          }
          c = logoSettings.b;
          if (c != null) {
             c[5] = 2;
          }
          String str2 = (TextUtils.isEmpty(logoSettings.k))? this.getResources().getString(0x7f12001f): this.getResources().getString(0x7f120020);
          str1 = str2;
          c = logoSettings.b;
          if (c != null) {
             c[3] = i;
          }
          c = logoSettings.c;
          if (c != null) {
             c[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i5 = 10;
             ointArray4 = new int[i5];
             logoSettings.b = ointArray4;
          }else {
             i5 = 10;
          }
          if (logoSettings.c == null) {
             ointArray4 = new int[i5];
             logoSettings.c = ointArray4;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = 7;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i5 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b2 = logoSettings.b;
                   if (b2.length > 3) {
                      i8 = 3;
                   label_0571 :
                      if (i2 < i8) {
                         b2[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i8 = b2.length;
                      goto label_0571 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i5;
             if (logoSettings.c != null) {
                i5 = 0;
                while (true) {
                   f1 = logoSettings.c;
                   if (f1.length > 3) {
                      i4 = 3;
                   label_059a :
                      if (i5 < i4) {
                         f1[i5] = 5;
                         i5 = i5 + 1;
                      }
                   }else {
                      i4 = f1.length;
                      goto label_059a ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_05bd :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[2] = 3;
          }
          f1 = logoSettings.b;
          if (f1 != null) {
             f1[5] = 2;
          }
          if (f1 != null) {
             f1[3] = i;
          }
          if (c != null) {
             c[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i5 = 10;
             ointArray4 = new int[i5];
             logoSettings.b = ointArray4;
          }else {
             i5 = 10;
          }
          if (logoSettings.c == null) {
             ointArray4 = new int[i5];
             logoSettings.c = ointArray4;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = 7;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i5 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b2 = logoSettings.b;
                   if (b2.length > 3) {
                      i8 = 3;
                   label_0622 :
                      if (i2 < i8) {
                         b2[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i8 = b2.length;
                      goto label_0622 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i5;
             if (logoSettings.c != null) {
                i5 = 0;
                while (true) {
                   f1 = logoSettings.c;
                   if (f1.length > 3) {
                      i4 = 3;
                   label_064b :
                      if (i5 < i4) {
                         f1[i5] = 5;
                         i5 = i5 + 1;
                      }
                   }else {
                      i4 = f1.length;
                      goto label_064b ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_066e :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[2] = 3;
          }
          c = logoSettings.b;
          if (c != null) {
             c[5] = 2;
          }
       }
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          i5 = 10;
          ointArray4 = new int[i5];
          logoSettings.b = ointArray4;
       }else {
          i5 = 10;
       }
       if (logoSettings.c == null) {
          ointArray4 = new int[i5];
          logoSettings.c = ointArray4;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i8 = 3;
                label_06d7 :
                   if (i2 < i8) {
                      b2[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i8 = b2.length;
                   goto label_06d7 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i5;
          if (logoSettings.c != null) {
             i5 = 0;
             while (true) {
                f1 = logoSettings.c;
                if (f1.length > 3) {
                   i4 = 3;
                label_0700 :
                   if (i5 < i4) {
                      f1[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i4 = f1.length;
                   goto label_0700 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0723 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       f1 = logoSettings.b;
       if (f1 != null) {
          f1[5] = 2;
       }
       if (f1 != null) {
          f1[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          i5 = 10;
          ointArray4 = new int[i5];
          logoSettings.b = ointArray4;
       }else {
          i5 = 10;
       }
       if (logoSettings.c == null) {
          ointArray4 = new int[i5];
          logoSettings.c = ointArray4;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i8 = 3;
                label_0788 :
                   if (i2 < i8) {
                      b2[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i8 = b2.length;
                   goto label_0788 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i5;
          if (logoSettings.c != null) {
             i5 = 0;
             while (true) {
                f1 = logoSettings.c;
                if (f1.length > 3) {
                   i4 = 3;
                label_07b1 :
                   if (i5 < i4) {
                      f1[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i4 = f1.length;
                   goto label_07b1 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_07d4 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("adUnitId:"+str1);
       TextUtils.isEmpty(logoSettings.k);
       logoSettings.d(str1);
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          i5 = 10;
          ointArray4 = new int[i5];
          logoSettings.b = ointArray4;
       }else {
          i5 = 10;
       }
       if (logoSettings.c == null) {
          ointArray4 = new int[i5];
          logoSettings.c = ointArray4;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                f = logoSettings.b;
                if (f.length > 3) {
                   i4 = 3;
                label_0859 :
                   if (i2 < i4) {
                      f[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i4 = f.length;
                   goto label_0859 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i5;
          if (logoSettings.c != null) {
             i5 = 0;
             while (true) {
                f1 = logoSettings.c;
                if (f1.length > 3) {
                   i3 = 3;
                label_0882 :
                   if (i5 < i3) {
                      f1[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i3 = f1.length;
                   goto label_0882 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_08a5 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       f1 = logoSettings.b;
       if (f1 != null) {
          f1[5] = 2;
       }
       if (f1 != null) {
          f1[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          i1 = 10;
          ointArray = new int[i1];
          logoSettings.b = ointArray;
       }else {
          i1 = 10;
       }
       if (logoSettings.c == null) {
          int[] ointArray5 = new int[i1];
          logoSettings.c = ointArray5;
       }
       logoSettings.e = false;
       LogoSettingsActivity c2 = logoSettings.c;
       if (c2 != null) {
          c2[i] = 7;
       }
       if (c2 != null) {
          c2[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i9 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                c2 = logoSettings.b;
                if (c2.length > 3) {
                   i5 = 3;
                label_090a :
                   if (i < i5) {
                      c2[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i5 = c2.length;
                   goto label_090a ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i9;
          if (logoSettings.c != null) {
             i9 = 0;
             while (true) {
                LogoSettingsActivity c3 = logoSettings.c;
                if (c3.length > 3) {
                   i1 = 3;
                label_0933 :
                   if (i9 < i1) {
                      c3[i9] = 5;
                      i9 = i9 + 1;
                   }
                }else {
                   i1 = c3.length;
                   goto label_0933 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0956 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
    public final void c(){
       int[] ointArray;
       int i4;
       int i5;
       LogoSettingsActivity b1;
       LogoSettingsActivity c2;
       int i6;
       Exception uException;
       int[] ointArray1;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       int i2 = 7;
       if (c != null) {
          c[i] = i2;
       }
       int i3 = 4;
       if (c != null) {
          c[i3] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i4 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i5 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i3 = 3;
                label_0062 :
                   if (i5 < i3) {
                      b1[i5] = 3;
                      i5 = i5 + 1;
                      i3 = 4;
                   }
                }else {
                   i3 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i4;
          if (logoSettings.c != null) {
             i4 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i5 = 3;
                label_008c :
                   if (i4 < i5) {
                      c1[i4] = 5;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = c1.length;
                   goto label_008c ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00af :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       LogoSettingsActivity b2 = logoSettings.b;
       if (b2 != null) {
          b2[5] = 2;
       }
       if (b2 != null) {
          b2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = i2;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i4 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i5 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i2 = 3;
                label_010f :
                   if (i5 < i2) {
                      b1[i5] = 3;
                      i5 = i5 + 1;
                      i2 = 7;
                   }
                }else {
                   i2 = b1.length;
                   goto label_010f ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i4;
          if (logoSettings.c != null) {
             i4 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i5 = 3;
                label_0139 :
                   if (i4 < i5) {
                      c2[i4] = 5;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = c2.length;
                   goto label_0139 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_015c :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("f\(\)");
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i4 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i6 = 3;
                label_01c5 :
                   if (i2 < i6) {
                      b2[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = b2.length;
                   goto label_01c5 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i4;
          if (logoSettings.c != null) {
             i4 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i5 = 3;
                label_01ee :
                   if (i4 < i5) {
                      c2[i4] = 5;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = c2.length;
                   goto label_01ee ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0211 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i4 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i6 = 3;
                label_0271 :
                   if (i2 < i6) {
                      b2[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = b2.length;
                   goto label_0271 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i4;
          if (logoSettings.c != null) {
             i4 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i5 = 3;
                label_029a :
                   if (i4 < i5) {
                      c2[i4] = 5;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = c2.length;
                   goto label_029a ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_02bd :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       try{
          if (c2 != null) {
             c2[3] = i;
          label_02d8 :
             if (c != null) {
                c[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             c = logoSettings.c;
             if (c != null) {
                c[i] = 7;
             }
             if (c != null) {
                c[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i4 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      b2 = logoSettings.b;
                      if (b2.length > 3) {
                         i6 = 3;
                      label_0322 :
                         if (i2 < i6) {
                            b2[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = b2.length;
                         goto label_0322 ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i4;
                if (logoSettings.c != null) {
                   i4 = 0;
                   while (true) {
                      c2 = logoSettings.c;
                      if (c2.length > 3) {
                         i5 = 3;
                      label_034d :
                         if (i4 < i5) {
                            c2[i4] = 5;
                            i4 = i4 + 1;
                         }
                      }else {
                         i5 = c2.length;
                         goto label_034d ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                c = logoSettings.f;
                if (c != null && c.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_0370 :
             c = logoSettings.n;
             if (c != null) {
                c[0] = 0;
             }
             c = logoSettings.c;
             if (c != null) {
                c[2] = 3;
             }
             c2 = logoSettings.b;
             if (c2 != null) {
                c2[5] = 2;
             }
             if (c2 != null) {
                c2[3] = i;
             }
             if (c != null) {
                c[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             c = logoSettings.c;
             if (c != null) {
                c[i] = 7;
             }
             if (c != null) {
                c[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i4 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      b2 = logoSettings.b;
                      if (b2.length > 3) {
                         i6 = 3;
                      label_03d0 :
                         if (i2 < i6) {
                            b2[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = b2.length;
                         goto label_03d0 ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i4;
                if (logoSettings.c != null) {
                   i4 = 0;
                   while (true) {
                      c2 = logoSettings.c;
                      if (c2.length > 3) {
                         i5 = 3;
                      label_03fb :
                         if (i4 < i5) {
                            c2[i4] = 5;
                            i4 = i4 + 1;
                         }
                      }else {
                         i5 = c2.length;
                         goto label_03fb ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                c = logoSettings.f;
                if (c != null && c.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_041e :
             c = logoSettings.n;
             if (c != null) {
                c[0] = 0;
             }
             c = logoSettings.c;
             if (c != null) {
                c[2] = 3;
             }
             c2 = logoSettings.b;
             if (c2 != null) {
                c2[5] = 2;
             }
             if (logoSettings.l != null) {
                if (c2 != null) {
                   c2[3] = i;
                }
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_0482 :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_0482 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_04ad :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_04ad ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_04d0 :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c2 = logoSettings.b;
                if (c2 != null) {
                   c2[5] = 2;
                }
                if (c2 != null) {
                   c2[3] = i;
                }
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_0530 :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_0530 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_055b :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_055b ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_057e :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c = logoSettings.b;
                if (c != null) {
                   c[5] = 2;
                }
                logoSettings.l.dismiss();
                c = logoSettings.b;
                if (c != null) {
                   c[3] = i;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_05e7 :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_05e7 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_0612 :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_0612 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_0635 :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c2 = logoSettings.b;
                if (c2 != null) {
                   c2[5] = 2;
                }
                if (c2 != null) {
                   c2[3] = i;
                }
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_0695 :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_0695 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_06c0 :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_06c0 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_06e3 :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c = logoSettings.b;
                if (c != null) {
                   c[5] = 2;
                }
             }
             c = logoSettings.b;
             if (c != null) {
                c[3] = i;
             }
             c = logoSettings.c;
             if (c != null) {
                c[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             c = logoSettings.c;
             if (c != null) {
                c[i] = 7;
             }
             if (c != null) {
                c[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i4 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      b2 = logoSettings.b;
                      if (b2.length > 3) {
                         i6 = 3;
                      label_0747 :
                         if (i2 < i6) {
                            b2[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = b2.length;
                         goto label_0747 ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i4;
                if (logoSettings.c != null) {
                   i4 = 0;
                   while (true) {
                      c2 = logoSettings.c;
                      if (c2.length > 3) {
                         i5 = 3;
                      label_0772 :
                         if (i4 < i5) {
                            c2[i4] = 5;
                            i4 = i4 + 1;
                         }
                      }else {
                         i5 = c2.length;
                         goto label_0772 ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                c = logoSettings.f;
                if (c != null && c.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_0795 :
             c = logoSettings.n;
             if (c != null) {
                c[0] = 0;
             }
             c = logoSettings.c;
             if (c != null) {
                c[2] = 3;
             }
             c2 = logoSettings.b;
             if (c2 != null) {
                c2[5] = 2;
             }
             if (c2 != null) {
                c2[3] = i;
             }
             if (c != null) {
                c[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             c = logoSettings.c;
             if (c != null) {
                c[i] = 7;
             }
             if (c != null) {
                c[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i4 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      b2 = logoSettings.b;
                      if (b2.length > 3) {
                         i6 = 3;
                      label_07f5 :
                         if (i2 < i6) {
                            b2[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = b2.length;
                         goto label_07f5 ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i4;
                if (logoSettings.c != null) {
                   i4 = 0;
                   while (true) {
                      c2 = logoSettings.c;
                      if (c2.length > 3) {
                         i5 = 3;
                      label_0820 :
                         if (i4 < i5) {
                            c2[i4] = 5;
                            i4 = i4 + 1;
                         }
                      }else {
                         i5 = c2.length;
                         goto label_0820 ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                c = logoSettings.f;
                if (c != null && c.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_0843 :
             c = logoSettings.n;
             if (c != null) {
                c[0] = 0;
             }
             c = logoSettings.c;
             if (c != null) {
                c[2] = 3;
             }
             c = logoSettings.b;
             if (c != null) {
                c[5] = 2;
             }
          }else {
             goto label_02d8 ;
          }
       }catch(java.lang.Exception e0){
          uException = e0;
          uException.printStackTrace();
       }
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i4 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i6 = 3;
                label_08ab :
                   if (i2 < i6) {
                      b2[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = b2.length;
                   goto label_08ab ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i4;
          if (logoSettings.c != null) {
             i4 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i5 = 3;
                label_08d4 :
                   if (i4 < i5) {
                      c2[i4] = 5;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = c2.length;
                   goto label_08d4 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_08f7 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i4 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i6 = 3;
                label_0957 :
                   if (i2 < i6) {
                      b2[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = b2.length;
                   goto label_0957 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i4;
          if (logoSettings.c != null) {
             i4 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i5 = 3;
                label_0980 :
                   if (i4 < i5) {
                      c2[i4] = 5;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = c2.length;
                   goto label_0980 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_09a3 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       try{
          if (c2 != null) {
             c2[3] = i;
          label_09be :
             if (c != null) {
                c[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             c = logoSettings.c;
             if (c != null) {
                c[i] = 7;
             }
             if (c != null) {
                c[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i4 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      b2 = logoSettings.b;
                      if (b2.length > 3) {
                         i6 = 3;
                      label_0a08 :
                         if (i2 < i6) {
                            b2[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = b2.length;
                         goto label_0a08 ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i4;
                if (logoSettings.c != null) {
                   i4 = 0;
                   while (true) {
                      c2 = logoSettings.c;
                      if (c2.length > 3) {
                         i5 = 3;
                      label_0a33 :
                         if (i4 < i5) {
                            c2[i4] = 5;
                            i4 = i4 + 1;
                         }
                      }else {
                         i5 = c2.length;
                         goto label_0a33 ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                c = logoSettings.f;
                if (c != null && c.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_0a56 :
             c = logoSettings.n;
             if (c != null) {
                c[0] = 0;
             }
             c = logoSettings.c;
             if (c != null) {
                c[2] = 3;
             }
             c2 = logoSettings.b;
             if (c2 != null) {
                c2[5] = 2;
             }
             if (c2 != null) {
                c2[3] = i;
             }
             if (c != null) {
                c[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             c = logoSettings.c;
             if (c != null) {
                c[i] = 7;
             }
             if (c != null) {
                c[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i4 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      b2 = logoSettings.b;
                      if (b2.length > 3) {
                         i6 = 3;
                      label_0ab6 :
                         if (i2 < i6) {
                            b2[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = b2.length;
                         goto label_0ab6 ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i4;
                if (logoSettings.c != null) {
                   i4 = 0;
                   while (true) {
                      c2 = logoSettings.c;
                      if (c2.length > 3) {
                         i5 = 3;
                      label_0ae1 :
                         if (i4 < i5) {
                            c2[i4] = 5;
                            i4 = i4 + 1;
                         }
                      }else {
                         i5 = c2.length;
                         goto label_0ae1 ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                c = logoSettings.f;
                if (c != null && c.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_0b04 :
             c = logoSettings.n;
             if (c != null) {
                c[0] = 0;
             }
             c = logoSettings.c;
             if (c != null) {
                c[2] = 3;
             }
             c2 = logoSettings.b;
             if (c2 != null) {
                c2[5] = 2;
             }
             if (logoSettings.m != null) {
                if (c2 != null) {
                   c2[3] = i;
                }
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_0b68 :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_0b68 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_0b93 :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_0b93 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_0bb6 :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c2 = logoSettings.b;
                if (c2 != null) {
                   c2[5] = 2;
                }
                if (c2 != null) {
                   c2[3] = i;
                }
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_0c16 :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_0c16 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_0c41 :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_0c41 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_0c64 :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c = logoSettings.b;
                if (c != null) {
                   c[5] = 2;
                }
                logoSettings.m.dismiss();
                c = logoSettings.b;
                if (c != null) {
                   c[3] = i;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_0ccd :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_0ccd ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_0cf8 :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_0cf8 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_0d1b :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c2 = logoSettings.b;
                if (c2 != null) {
                   c2[5] = 2;
                }
                if (c2 != null) {
                   c2[3] = i;
                }
                if (c != null) {
                   c[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                c = logoSettings.c;
                if (c != null) {
                   c[i] = 7;
                }
                if (c != null) {
                   c[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i4 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         b2 = logoSettings.b;
                         if (b2.length > 3) {
                            i6 = 3;
                         label_0d7b :
                            if (i2 < i6) {
                               b2[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = b2.length;
                            goto label_0d7b ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i4;
                   if (logoSettings.c != null) {
                      i4 = 0;
                      while (true) {
                         c2 = logoSettings.c;
                         if (c2.length > 3) {
                            i5 = 3;
                         label_0da6 :
                            if (i4 < i5) {
                               c2[i4] = 5;
                               i4 = i4 + 1;
                            }
                         }else {
                            i5 = c2.length;
                            goto label_0da6 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   c = logoSettings.f;
                   if (c != null && c.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_0dc9 :
                c = logoSettings.n;
                if (c != null) {
                   c[0] = 0;
                }
                c = logoSettings.c;
                if (c != null) {
                   c[2] = 3;
                }
                c = logoSettings.b;
                if (c != null) {
                   c[5] = 2;
                }
             }
             c = logoSettings.b;
             if (c != null) {
                c[3] = i;
             }
             c = logoSettings.c;
             if (c != null) {
                c[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             c = logoSettings.c;
             if (c != null) {
                c[i] = 7;
             }
             if (c != null) {
                c[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i4 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      b2 = logoSettings.b;
                      if (b2.length > 3) {
                         i6 = 3;
                      label_0e2d :
                         if (i2 < i6) {
                            b2[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = b2.length;
                         goto label_0e2d ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i4;
                if (logoSettings.c != null) {
                   i4 = 0;
                   while (true) {
                      c2 = logoSettings.c;
                      if (c2.length > 3) {
                         i5 = 3;
                      label_0e58 :
                         if (i4 < i5) {
                            c2[i4] = 5;
                            i4 = i4 + 1;
                         }
                      }else {
                         i5 = c2.length;
                         goto label_0e58 ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                c = logoSettings.f;
                if (c != null && c.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_0e7b :
             c = logoSettings.n;
             if (c != null) {
                c[0] = 0;
             }
             c = logoSettings.c;
             if (c != null) {
                c[2] = 3;
             }
             c = logoSettings.b;
             if (c != null) {
                c[5] = 2;
             }
          }else {
             goto label_09be ;
          }
       }catch(java.lang.Exception e0){
          uException = e0;
          uException.printStackTrace();
       }
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i4 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b2 = logoSettings.b;
                if (b2.length > 3) {
                   i6 = 3;
                label_0ee3 :
                   if (i2 < i6) {
                      b2[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = b2.length;
                   goto label_0ee3 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i4;
          if (logoSettings.c != null) {
             i4 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i5 = 3;
                label_0f0c :
                   if (i4 < i5) {
                      c2[i4] = 5;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = c2.length;
                   goto label_0f0c ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0f2f :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[10];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[10];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       LogoSettingsActivity c3 = logoSettings.c;
       if (c3 != null) {
          c3[i] = 7;
       }
       if (c3 != null) {
          c3[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i7 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                c3 = logoSettings.b;
                if (c3.length > 3) {
                   i4 = 3;
                label_0f8f :
                   if (i < i4) {
                      c3[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i4 = c3.length;
                   goto label_0f8f ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i7;
          if (logoSettings.c != null) {
             i7 = 0;
             while (true) {
                LogoSettingsActivity c4 = logoSettings.c;
                if (c4.length > 3) {
                   i1 = 3;
                label_0fb8 :
                   if (i7 < i1) {
                      c4[i7] = 5;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = c4.length;
                   goto label_0fb8 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0fdb :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       try{
          b = logoSettings.a;
          if (b != null) {
             b.destroy();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.finish();
       return;
    }
    public void d(String p0){
       int[] ointArray;
       int i3;
       LogoSettingsActivity b1;
       int i5;
       int i6;
       LogoSettingsActivity c2;
       int[] ointArray1;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       int i2 = 4;
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             int i4 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0062 :
                   if (i4 < i5) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i6 = 3;
                label_008b :
                   if (i3 < i6) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c1.length;
                   goto label_008b ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00ae :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       b1 = logoSettings.b;
       if (b1 != null) {
          b1[5] = 2;
       }
       if (b1 != null) {
          b1[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity b2 = logoSettings.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_010d :
                   if (i6 < i2) {
                      b2[i6] = 3;
                      i6 = i6 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_010d ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_0137 :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_0137 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_015a :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.a = new MaxInterstitialAd(p0, logoSettings);
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_01c6 :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_01c6 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_01ef :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_01ef ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0212 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.a.setListener(logoSettings);
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_027a :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_027a ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_02a3 :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_02a3 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_02c6 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("isReady "+logoSettings.a.isReady());
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0343 :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0343 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_036c :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_036c ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_038f :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       if (logoSettings.a.isReady()) {
          c = logoSettings.b;
          if (c != null) {
             c[3] = i;
          }
          c = logoSettings.c;
          if (c != null) {
             c[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = 7;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b1 = logoSettings.b;
                   if (b1.length > 3) {
                      i5 = 3;
                   label_03fa :
                      if (i2 < i5) {
                         b1[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i5 = b1.length;
                      goto label_03fa ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c2 = logoSettings.c;
                   if (c2.length > 3) {
                      i6 = 3;
                   label_0423 :
                      if (i3 < i6) {
                         c2[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i6 = c2.length;
                      goto label_0423 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_0446 :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[2] = 3;
          }
          c = logoSettings.b;
          if (c != null) {
             c[5] = 2;
          }
          new Handler().postDelayed(new LogoSettingsActivity$a(logoSettings), 2000);
          c = logoSettings.b;
          if (c != null) {
             c[3] = i;
          }
          c = logoSettings.c;
          if (c != null) {
             c[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = 7;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b1 = logoSettings.b;
                   if (b1.length > 3) {
                      i5 = 3;
                   label_04b8 :
                      if (i2 < i5) {
                         b1[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i5 = b1.length;
                      goto label_04b8 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c2 = logoSettings.c;
                   if (c2.length > 3) {
                      i6 = 3;
                   label_04e1 :
                      if (i3 < i6) {
                         c2[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i6 = c2.length;
                      goto label_04e1 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_0504 :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[2] = 3;
          }
          c = logoSettings.b;
          if (c != null) {
             c[5] = 2;
          }
       }else {
          c = logoSettings.b;
          if (c != null) {
             c[3] = i;
          }
          c = logoSettings.c;
          if (c != null) {
             c[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = 7;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b1 = logoSettings.b;
                   if (b1.length > 3) {
                      i5 = 3;
                   label_0569 :
                      if (i2 < i5) {
                         b1[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i5 = b1.length;
                      goto label_0569 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c2 = logoSettings.c;
                   if (c2.length > 3) {
                      i6 = 3;
                   label_0592 :
                      if (i3 < i6) {
                         c2[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i6 = c2.length;
                      goto label_0592 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_05b5 :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[2] = 3;
          }
          c = logoSettings.b;
          if (c != null) {
             c[5] = 2;
          }
          logoSettings.a.loadAd();
       }
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_061d :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_061d ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_0646 :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_0646 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0669 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[10];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[10];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       LogoSettingsActivity c3 = logoSettings.c;
       if (c3 != null) {
          c3[i] = 7;
       }
       if (c3 != null) {
          c3[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i7 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                c3 = logoSettings.b;
                if (c3.length > 3) {
                   i3 = 3;
                label_06c8 :
                   if (i < i3) {
                      c3[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i3 = c3.length;
                   goto label_06c8 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i7;
          if (logoSettings.c != null) {
             i7 = 0;
             while (true) {
                LogoSettingsActivity c4 = logoSettings.c;
                if (c4.length > 3) {
                   i1 = 3;
                label_06f1 :
                   if (i7 < i1) {
                      c4[i7] = 5;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = c4.length;
                   goto label_06f1 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0714 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
    public final void f(String p0){
       int[] ointArray;
       int i2;
       LogoSettingsActivity tb1;
       int i4;
       int i5;
       int[] ointArray1;
       LogoSettingsActivity tb = this.b;
       int i = 9;
       if (tb != null) {
          tb[3] = i;
       }
       tb = this.c;
       int i1 = 8;
       if (tb != null) {
          tb[i1] = 0;
       }
       if (this.f == null) {
          this.f = new ArrayList();
       }
       tb = ";paddingStart";
       this.d = tb;
       this.e = true;
       if (this.b == null) {
          ointArray = new int[10];
          this.b = ointArray;
       }
       if (this.c == null) {
          ointArray = new int[10];
          this.c = ointArray;
       }
       this.e = false;
       LogoSettingsActivity tc = this.c;
       if (tc != null) {
          tc[i] = 7;
       }
       if (tc != null) {
          tc[4] = true;
       }
       if (!TextUtils.isEmpty(tb)) {
          i2 = (this.d).length();
          if (this.b != null) {
             int i3 = 0;
             while (true) {
                tb1 = this.b;
                if (tb1.length > 3) {
                   i4 = 3;
                label_0060 :
                   if (i3 < i4) {
                      tb1[i3] = 3;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = tb1.length;
                   goto label_0060 ;
                }
             }
          }
          this.e = false;
          this.d = this.d+i2;
          if (this.c != null) {
             i2 = 0;
             while (true) {
                LogoSettingsActivity tc1 = this.c;
                if (tc1.length > 3) {
                   i5 = 3;
                label_0089 :
                   if (i2 < i5) {
                      tc1[i2] = 5;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = tc1.length;
                   goto label_0089 ;
                }
             }
          }
          if (this.f.size() < 1) {
             this.f.add(" than ");
          }
          tc = this.f;
          if (tc != null && tc.size() > 0) {
             this.f.remove(0);
          }
       }
    label_00ac :
       tc = this.n;
       if (tc != null) {
          tc[0] = 0;
       }
       tc = this.c;
       if (tc != null) {
          tc[2] = 3;
       }
       tb1 = this.b;
       if (tb1 != null) {
          tb1[5] = 2;
       }
       if (tb1 != null) {
          tb1[3] = i;
       }
       if (tc != null) {
          tc[i1] = 0;
       }
       if (this.f == null) {
          this.f = new ArrayList();
       }
       this.d = tb;
       this.e = true;
       if (this.b == null) {
          ointArray1 = new int[10];
          this.b = ointArray1;
       }
       if (this.c == null) {
          ointArray1 = new int[10];
          this.c = ointArray1;
       }
       this.e = false;
       LogoSettingsActivity tc2 = this.c;
       if (tc2 != null) {
          tc2[i] = 7;
       }
       if (tc2 != null) {
          tc2[4] = true;
       }
       if (!TextUtils.isEmpty(tb)) {
          int i6 = (this.d).length();
          if (this.b != null) {
             i = 0;
             while (true) {
                tc2 = this.b;
                if (tc2.length > 3) {
                   i2 = 3;
                label_010b :
                   if (i < i2) {
                      tc2[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i2 = tc2.length;
                   goto label_010b ;
                }
             }
          }
          this.e = false;
          this.d = this.d+i6;
          if (this.c != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity tc3 = this.c;
                if (tc3.length > 3) {
                   i1 = 3;
                label_0134 :
                   if (i6 < i1) {
                      tc3[i6] = 5;
                      i6++;
                   }
                }else {
                   i1 = tc3.length;
                   goto label_0134 ;
                }
             }
          }
          if (this.f.size() < 1) {
             this.f.add(" than ");
          }
          tb = this.f;
          if (tb != null && tb.size() > 0) {
             this.f.remove(0);
          }
       }
    label_0157 :
       tb = this.n;
       if (tb != null) {
          tb[0] = 0;
       }
       tb = this.c;
       if (tb != null) {
          tb[2] = 3;
       }
       tb = this.b;
       if (tb != null) {
          tb[5] = 2;
       }
       return;
    }
    public void onAdClicked(MaxAd p0){
       int[] ointArray;
       int i2;
       int i4;
       int i5;
       int[] ointArray1;
       LogoSettingsActivity tb = this.b;
       int i = 9;
       if (tb != null) {
          tb[3] = i;
       }
       tb = this.c;
       int i1 = 8;
       if (tb != null) {
          tb[i1] = 0;
       }
       if (this.f == null) {
          this.f = new ArrayList();
       }
       String str = ";paddingStart";
       this.d = str;
       this.e = true;
       if (this.b == null) {
          ointArray = new int[10];
          this.b = ointArray;
       }
       if (this.c == null) {
          ointArray = new int[10];
          this.c = ointArray;
       }
       this.e = false;
       LogoSettingsActivity tc = this.c;
       if (tc != null) {
          tc[i] = 7;
       }
       if (tc != null) {
          tc[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (this.d).length();
          if (this.b != null) {
             int i3 = 0;
             while (true) {
                LogoSettingsActivity tb1 = this.b;
                if (tb1.length > 3) {
                   i4 = 3;
                label_0060 :
                   if (i3 < i4) {
                      tb1[i3] = 3;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = tb1.length;
                   goto label_0060 ;
                }
             }
          }
          this.e = false;
          this.d = this.d+i2;
          if (this.c != null) {
             i2 = 0;
             while (true) {
                LogoSettingsActivity tc1 = this.c;
                if (tc1.length > 3) {
                   i5 = 3;
                label_0089 :
                   if (i2 < i5) {
                      tc1[i2] = 5;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = tc1.length;
                   goto label_0089 ;
                }
             }
          }
          if (this.f.size() < 1) {
             this.f.add(" than ");
          }
          tc = this.f;
          if (tc != null && tc.size() > 0) {
             this.f.remove(0);
          }
       }
    label_00ac :
       tc = this.n;
       if (tc != null) {
          tc[0] = 0;
       }
       tc = this.c;
       if (tc != null) {
          tc[2] = 3;
       }
       tc = this.b;
       if (tc != null) {
          tc[5] = 2;
       }
       this.f("onAdClicked");
       tc = this.b;
       if (tc != null) {
          tc[3] = i;
       }
       tc = this.c;
       if (tc != null) {
          tc[i1] = 0;
       }
       if (this.f == null) {
          this.f = new ArrayList();
       }
       this.d = str;
       this.e = true;
       if (this.b == null) {
          ointArray1 = new int[10];
          this.b = ointArray1;
       }
       if (this.c == null) {
          ointArray1 = new int[10];
          this.c = ointArray1;
       }
       this.e = false;
       LogoSettingsActivity tc2 = this.c;
       if (tc2 != null) {
          tc2[i] = 7;
       }
       if (tc2 != null) {
          tc2[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i6 = (this.d).length();
          if (this.b != null) {
             i = 0;
             while (true) {
                tc2 = this.b;
                if (tc2.length > 3) {
                   i2 = 3;
                label_0114 :
                   if (i < i2) {
                      tc2[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i2 = tc2.length;
                   goto label_0114 ;
                }
             }
          }
          this.e = false;
          this.d = this.d+i6;
          if (this.c != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity tc3 = this.c;
                if (tc3.length > 3) {
                   i1 = 3;
                label_013d :
                   if (i6 < i1) {
                      tc3[i6] = 5;
                      i6++;
                   }
                }else {
                   i1 = tc3.length;
                   goto label_013d ;
                }
             }
          }
          if (this.f.size() < 1) {
             this.f.add(" than ");
          }
          tb = this.f;
          if (tb != null && tb.size() > 0) {
             this.f.remove(0);
          }
       }
    label_0160 :
       tb = this.n;
       if (tb != null) {
          tb[0] = 0;
       }
       tb = this.c;
       if (tb != null) {
          tb[2] = 3;
       }
       tb = this.b;
       if (tb != null) {
          tb[5] = 2;
       }
       return;
    }
    public void onAdDisplayFailed(MaxAd p0,MaxError p1){
       int[] ointArray;
       int i3;
       int i5;
       int i6;
       int[] ointArray1;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       int i2 = 4;
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             int i4 = 0;
             while (true) {
                LogoSettingsActivity b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0062 :
                   if (i4 < i5) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i6 = 3;
                label_008b :
                   if (i3 < i6) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c1.length;
                   goto label_008b ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00ae :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("onAdDisplayFailed"+p1.getCode()+" "+p1.getMessage());
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity b2 = logoSettings.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_0135 :
                   if (i6 < i2) {
                      b2[i6] = 3;
                      i6 = i6 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_0135 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_015f :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_015f ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0182 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       this.c();
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[10];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[10];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       LogoSettingsActivity c3 = logoSettings.c;
       if (c3 != null) {
          c3[i] = 7;
       }
       if (c3 != null) {
          c3[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i7 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                c3 = logoSettings.b;
                if (c3.length > 3) {
                   i3 = 3;
                label_01e8 :
                   if (i < i3) {
                      c3[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i3 = c3.length;
                   goto label_01e8 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i7;
          if (logoSettings.c != null) {
             i7 = 0;
             while (true) {
                LogoSettingsActivity c4 = logoSettings.c;
                if (c4.length > 3) {
                   i1 = 3;
                label_0211 :
                   if (i7 < i1) {
                      c4[i7] = 5;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = c4.length;
                   goto label_0211 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0234 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
    public void onAdDisplayed(MaxAd p0){
       int[] ointArray;
       int i5;
       int i6;
       LogoSettingsActivity b1;
       int i7;
       int i8;
       LogoSettingsActivity c2;
       int[] ointArray1;
       LogoSettingsActivity b3;
       LogoSettingsActivity f;
       int[] ointArray2;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       int i2 = 10;
       if (logoSettings.b == null) {
          ointArray = new int[i2];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[i2];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       int i3 = 7;
       if (c != null) {
          c[i] = i3;
       }
       int i4 = 4;
       if (c != null) {
          c[i4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i6 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i7 = 3;
                label_0062 :
                   if (i6 < i7) {
                      b1[i6] = 3;
                      i6 = i6 + 1;
                   }
                }else {
                   i7 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i5;
          if (logoSettings.c != null) {
             i5 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i8 = 3;
                label_008b :
                   if (i5 < i8) {
                      c1[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i8 = c1.length;
                   goto label_008b ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00ae :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       i6 = 2;
       if (c != null) {
          c[i6] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = i6;
       }
       logoSettings.f("onAdDisplayed");
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[i2];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[i2];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = i3;
       }
       if (c != null) {
          c[i4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i8 = 0;
             while (true) {
                LogoSettingsActivity b2 = logoSettings.b;
                if (b2.length > 3) {
                   i4 = 3;
                label_0116 :
                   if (i8 < i4) {
                      b2[i8] = 3;
                      i8 = i8 + 1;
                      i4 = 4;
                   }
                }else {
                   i4 = b2.length;
                   goto label_0116 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i5;
          if (logoSettings.c != null) {
             i5 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i8 = 3;
                label_0140 :
                   if (i5 < i8) {
                      c2[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i8 = c2.length;
                   goto label_0140 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0163 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i6] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = i6;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[i2];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[i2];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = i3;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i4 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i7 = 3;
                label_01c2 :
                   if (i4 < i7) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i7 = b1.length;
                   goto label_01c2 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i5;
          if (logoSettings.c != null) {
             i5 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i8 = 3;
                label_01eb :
                   if (i5 < i8) {
                      c2[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i8 = c2.length;
                   goto label_01eb ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_020e :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i6] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = i6;
       }
       if (!TextUtils.isEmpty(logoSettings.k)) {
          c = logoSettings.b;
          if (c != null) {
             c[3] = i;
          }
          c = logoSettings.c;
          if (c != null) {
             c[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[i2];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[i2];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          c = logoSettings.c;
          if (c != null) {
             c[i] = i3;
          }
          if (c != null) {
             c[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i5 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i4 = 0;
                while (true) {
                   b1 = logoSettings.b;
                   if (b1.length > 3) {
                      i7 = 3;
                   label_0279 :
                      if (i4 < i7) {
                         b1[i4] = 3;
                         i4 = i4 + 1;
                      }
                   }else {
                      i7 = b1.length;
                      goto label_0279 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i5;
             if (logoSettings.c != null) {
                i5 = 0;
                while (true) {
                   c2 = logoSettings.c;
                   if (c2.length > 3) {
                      i8 = 3;
                   label_02a2 :
                      if (i5 < i8) {
                         c2[i5] = 5;
                         i5 = i5 + 1;
                      }
                   }else {
                      i8 = c2.length;
                      goto label_02a2 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             c = logoSettings.f;
             if (c != null && c.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_02c5 :
          c = logoSettings.n;
          if (c != null) {
             c[0] = 0;
          }
          c = logoSettings.c;
          if (c != null) {
             c[i6] = 3;
          }
          c = logoSettings.b;
          if (c != null) {
             c[5] = i6;
          }
          String str1 = "n";
          Intent intent = new Intent(this.getPackageName()+"."+(logoSettings.i).replaceAll("bhuiw", "")+(logoSettings.j).replaceAll("oixnHuz", "")+(logoSettings.h).replaceAll("mkisje", "")+str1);
          c2 = logoSettings.b;
          if (c2 != null) {
             c2[3] = i;
          }
          c2 = logoSettings.c;
          if (c2 != null) {
             c2[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray1 = new int[i2];
             logoSettings.b = ointArray1;
          }
          if (logoSettings.c == null) {
             ointArray1 = new int[i2];
             logoSettings.c = ointArray1;
          }
          logoSettings.e = false;
          c2 = logoSettings.c;
          if (c2 != null) {
             c2[i] = i3;
          }
          if (c2 != null) {
             c2[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i4 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i3 = 0;
                while (true) {
                   b3 = logoSettings.b;
                   if (b3.length > 3) {
                      i1 = 3;
                   label_036b :
                      if (i3 < i1) {
                         b3[i3] = 3;
                         i3 = i3 + 1;
                         i1 = 8;
                      }
                   }else {
                      i1 = b3.length;
                      goto label_036b ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i4;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   b3 = logoSettings.c;
                   if (b3.length > 3) {
                      i3 = 3;
                   label_0396 :
                      if (i1 < i3) {
                         b3[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i3 = b3.length;
                      goto label_0396 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_03b9 :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i2 = 2;
          if (f != null) {
             f[i2] = 3;
          }
          LogoSettingsActivity b4 = logoSettings.b;
          if (b4 != null) {
             b4[5] = i2;
          }
          if (b4 != null) {
             b4[3] = i;
          }
          if (f != null) {
             f[8] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i1 = 10;
             ointArray2 = new int[i1];
             logoSettings.b = ointArray2;
          }else {
             i1 = 10;
          }
          if (logoSettings.c == null) {
             ointArray2 = new int[i1];
             logoSettings.c = ointArray2;
          }
          logoSettings.e = false;
          f = logoSettings.c;
          if (f != null) {
             f[i] = 7;
          }
          if (f != null) {
             f[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i1 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b4 = logoSettings.b;
                   if (b4.length > 3) {
                      i4 = 3;
                   label_0421 :
                      if (i2 < i4) {
                         b4[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i4 = b4.length;
                      goto label_0421 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i1;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   b3 = logoSettings.c;
                   if (b3.length > 3) {
                      i3 = 3;
                   label_044a :
                      if (i1 < i3) {
                         b3[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i3 = b3.length;
                      goto label_044a ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_046d :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i2 = 2;
          if (f != null) {
             f[i2] = 3;
          }
          f = logoSettings.b;
          if (f != null) {
             f[5] = i2;
          }
          String str2 = "hu17kxd";
          intent.putExtra((logoSettings.g).replaceAll(str2, "")+(logoSettings.h).replaceAll("mkisje", "")+str1, logoSettings.k);
          f = logoSettings.b;
          if (f != null) {
             f[3] = i;
          }
          f = logoSettings.c;
          if (f != null) {
             f[8] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i1 = 10;
             ointArray2 = new int[i1];
             logoSettings.b = ointArray2;
          }else {
             i1 = 10;
          }
          if (logoSettings.c == null) {
             ointArray2 = new int[i1];
             logoSettings.c = ointArray2;
          }
          logoSettings.e = false;
          f = logoSettings.c;
          if (f != null) {
             f[i] = 7;
          }
          if (f != null) {
             f[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i1 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   c2 = logoSettings.b;
                   if (c2.length > 3) {
                      i8 = 3;
                   label_04fe :
                      if (i2 < i8) {
                         c2[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i8 = c2.length;
                      goto label_04fe ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i1;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   b3 = logoSettings.c;
                   if (b3.length > 3) {
                      i4 = 3;
                   label_0527 :
                      if (i1 < i4) {
                         b3[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i4 = b3.length;
                      goto label_0527 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_054a :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i2 = 2;
          if (f != null) {
             f[i2] = 3;
          }
          c2 = logoSettings.b;
          if (c2 != null) {
             c2[5] = i2;
          }
          if (c2 != null) {
             c2[3] = i;
          }
          if (f != null) {
             f[8] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i1 = 10;
             ointArray2 = new int[i1];
             logoSettings.b = ointArray2;
          }else {
             i1 = 10;
          }
          if (logoSettings.c == null) {
             ointArray2 = new int[i1];
             logoSettings.c = ointArray2;
          }
          logoSettings.e = false;
          f = logoSettings.c;
          if (f != null) {
             f[i] = 7;
          }
          if (f != null) {
             f[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i1 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   c2 = logoSettings.b;
                   if (c2.length > 3) {
                      i8 = 3;
                   label_05b2 :
                      if (i2 < i8) {
                         c2[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i8 = c2.length;
                      goto label_05b2 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i1;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   b3 = logoSettings.c;
                   if (b3.length > 3) {
                      i4 = 3;
                   label_05db :
                      if (i1 < i4) {
                         b3[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i4 = b3.length;
                      goto label_05db ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_05fe :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i2 = 2;
          if (f != null) {
             f[i2] = 3;
          }
          f = logoSettings.b;
          if (f != null) {
             f[5] = i2;
          }
          logoSettings.f((logoSettings.g).replaceAll(str2, "")+(logoSettings.h).replaceAll("mkisje", "")+"n :"+logoSettings.k);
          f = logoSettings.b;
          if (f != null) {
             f[3] = i;
          }
          f = logoSettings.c;
          if (f != null) {
             f[8] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i1 = 10;
             ointArray2 = new int[i1];
             logoSettings.b = ointArray2;
          }else {
             i1 = 10;
          }
          if (logoSettings.c == null) {
             ointArray2 = new int[i1];
             logoSettings.c = ointArray2;
          }
          logoSettings.e = false;
          f = logoSettings.c;
          if (f != null) {
             f[i] = 7;
          }
          if (f != null) {
             f[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i1 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b4 = logoSettings.b;
                   if (b4.length > 3) {
                      i4 = 3;
                   label_0692 :
                      if (i2 < i4) {
                         b4[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i4 = b4.length;
                      goto label_0692 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i1;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   b3 = logoSettings.c;
                   if (b3.length > 3) {
                      i3 = 3;
                   label_06bb :
                      if (i1 < i3) {
                         b3[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i3 = b3.length;
                      goto label_06bb ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_06de :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i2 = 2;
          if (f != null) {
             f[i2] = 3;
          }
          b4 = logoSettings.b;
          if (b4 != null) {
             b4[5] = i2;
          }
          if (b4 != null) {
             b4[3] = i;
          }
          if (f != null) {
             f[8] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i1 = 10;
             ointArray2 = new int[i1];
             logoSettings.b = ointArray2;
          }else {
             i1 = 10;
          }
          if (logoSettings.c == null) {
             ointArray2 = new int[i1];
             logoSettings.c = ointArray2;
          }
          logoSettings.e = false;
          f = logoSettings.c;
          if (f != null) {
             f[i] = 7;
          }
          if (f != null) {
             f[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i1 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   b4 = logoSettings.b;
                   if (b4.length > 3) {
                      i4 = 3;
                   label_0746 :
                      if (i2 < i4) {
                         b4[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i4 = b4.length;
                      goto label_0746 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i1;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   b3 = logoSettings.c;
                   if (b3.length > 3) {
                      i3 = 3;
                   label_076f :
                      if (i1 < i3) {
                         b3[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i3 = b3.length;
                      goto label_076f ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_0792 :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i2 = 2;
          if (f != null) {
             f[i2] = 3;
          }
          f = logoSettings.b;
          if (f != null) {
             f[5] = i2;
          }
          logoSettings.sendBroadcast(intent);
          f = logoSettings.b;
          if (f != null) {
             f[3] = i;
          }
          f = logoSettings.c;
          if (f != null) {
             f[8] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i1 = 10;
             ointArray = new int[i1];
             logoSettings.b = ointArray;
          }else {
             i1 = 10;
          }
          if (logoSettings.c == null) {
             ointArray = new int[i1];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          f = logoSettings.c;
          if (f != null) {
             f[i] = 7;
          }
          if (f != null) {
             f[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i1 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i5 = 0;
                while (true) {
                   b3 = logoSettings.b;
                   if (b3.length > 3) {
                      i3 = 3;
                   label_0801 :
                      if (i5 < i3) {
                         b3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = b3.length;
                      goto label_0801 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i1;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   c = logoSettings.c;
                   if (c.length > 3) {
                      i2 = 3;
                   label_082a :
                      if (i1 < i2) {
                         c[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i2 = c.length;
                      goto label_082a ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_084d :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i5 = 2;
          if (f != null) {
             f[i5] = 3;
          }
          b3 = logoSettings.b;
          if (b3 != null) {
             b3[5] = i5;
          }
          if (b3 != null) {
             b3[3] = i;
          }
          if (f != null) {
             f[8] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             i1 = 10;
             ointArray = new int[i1];
             logoSettings.b = ointArray;
          }else {
             i1 = 10;
          }
          if (logoSettings.c == null) {
             ointArray = new int[i1];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          f = logoSettings.c;
          if (f != null) {
             f[i] = 7;
          }
          if (f != null) {
             f[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i1 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i5 = 0;
                while (true) {
                   b3 = logoSettings.b;
                   if (b3.length > 3) {
                      i3 = 3;
                   label_08b5 :
                      if (i5 < i3) {
                         b3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = b3.length;
                      goto label_08b5 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i1;
             if (logoSettings.c != null) {
                i1 = 0;
                while (true) {
                   c = logoSettings.c;
                   if (c.length > 3) {
                      i2 = 3;
                   label_08de :
                      if (i1 < i2) {
                         c[i1] = 5;
                         i1 = i1 + 1;
                      }
                   }else {
                      i2 = c.length;
                      goto label_08de ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             f = logoSettings.f;
             if (f != null && f.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_0901 :
          f = logoSettings.n;
          if (f != null) {
             f[0] = 0;
          }
          f = logoSettings.c;
          i5 = 2;
          if (f != null) {
             f[i5] = 3;
          }
          f = logoSettings.b;
          if (f != null) {
             f[5] = i5;
          }
       }
       f = logoSettings.b;
       if (f != null) {
          f[3] = i;
       }
       f = logoSettings.c;
       if (f != null) {
          f[8] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          i1 = 10;
          ointArray = new int[i1];
          logoSettings.b = ointArray;
       }else {
          i1 = 10;
       }
       if (logoSettings.c == null) {
          ointArray = new int[i1];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       f = logoSettings.c;
       if (f != null) {
          f[i] = 7;
       }
       if (f != null) {
          f[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i1 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i5 = 0;
             while (true) {
                b3 = logoSettings.b;
                if (b3.length > 3) {
                   i3 = 3;
                label_096d :
                   if (i5 < i3) {
                      b3[i5] = 3;
                      i5 = i5 + 1;
                   }
                }else {
                   i3 = b3.length;
                   goto label_096d ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i1;
          if (logoSettings.c != null) {
             i1 = 0;
             while (true) {
                c = logoSettings.c;
                if (c.length > 3) {
                   i2 = 3;
                label_0996 :
                   if (i1 < i2) {
                      c[i1] = 5;
                      i1 = i1 + 1;
                   }
                }else {
                   i2 = c.length;
                   goto label_0996 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          f = logoSettings.f;
          if (f != null && f.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_09b9 :
       f = logoSettings.n;
       if (f != null) {
          f[0] = 0;
       }
       f = logoSettings.c;
       i5 = 2;
       if (f != null) {
          f[i5] = 3;
       }
       b3 = logoSettings.b;
       if (b3 != null) {
          b3[5] = i5;
       }
       if (b3 != null) {
          b3[3] = i;
       }
       if (f != null) {
          f[8] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          i1 = 10;
          ointArray = new int[i1];
          logoSettings.b = ointArray;
       }else {
          i1 = 10;
       }
       if (logoSettings.c == null) {
          int[] ointArray3 = new int[i1];
          logoSettings.c = ointArray3;
       }
       logoSettings.e = false;
       f = logoSettings.c;
       if (f != null) {
          f[i] = 7;
       }
       if (f != null) {
          f[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i9 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                f = logoSettings.b;
                if (f.length > 3) {
                   i5 = 3;
                label_0a21 :
                   if (i < i5) {
                      f[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i5 = f.length;
                   goto label_0a21 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i9;
          if (logoSettings.c != null) {
             i9 = 0;
             while (true) {
                LogoSettingsActivity c3 = logoSettings.c;
                if (c3.length > 3) {
                   i1 = 3;
                label_0a4a :
                   if (i9 < i1) {
                      c3[i9] = 5;
                      i9 = i9 + 1;
                   }
                }else {
                   i1 = c3.length;
                   goto label_0a4a ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0a6d :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
    public void onAdHidden(MaxAd p0){
       int[] ointArray;
       int i3;
       LogoSettingsActivity b1;
       int i5;
       int i6;
       LogoSettingsActivity c2;
       int[] ointArray1;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       int i2 = 4;
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             int i4 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0062 :
                   if (i4 < i5) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i6 = 3;
                label_008b :
                   if (i3 < i6) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c1.length;
                   goto label_008b ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00ae :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("onAdHidden");
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity b2 = logoSettings.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_0116 :
                   if (i6 < i2) {
                      b2[i6] = 3;
                      i6 = i6 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_0116 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_0140 :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_0140 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0163 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_01c2 :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_01c2 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_01eb :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_01eb ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_020e :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       this.c();
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0274 :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0274 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_029d :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_029d ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_02c0 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[10];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[10];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       LogoSettingsActivity c3 = logoSettings.c;
       if (c3 != null) {
          c3[i] = 7;
       }
       if (c3 != null) {
          c3[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i7 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                c3 = logoSettings.b;
                if (c3.length > 3) {
                   i3 = 3;
                label_031f :
                   if (i < i3) {
                      c3[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i3 = c3.length;
                   goto label_031f ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i7;
          if (logoSettings.c != null) {
             i7 = 0;
             while (true) {
                LogoSettingsActivity c4 = logoSettings.c;
                if (c4.length > 3) {
                   i1 = 3;
                label_0348 :
                   if (i7 < i1) {
                      c4[i7] = 5;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = c4.length;
                   goto label_0348 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_036b :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
    public void onAdLoadFailed(String p0,MaxError p1){
       int[] ointArray;
       int i3;
       int i5;
       int i6;
       int[] ointArray1;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       int i2 = 4;
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             int i4 = 0;
             while (true) {
                LogoSettingsActivity b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0062 :
                   if (i4 < i5) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i6 = 3;
                label_008b :
                   if (i3 < i6) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c1.length;
                   goto label_008b ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00ae :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("onAdLoadFailed"+p1.getCode()+" "+p1.getMessage());
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity b2 = logoSettings.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_0135 :
                   if (i6 < i2) {
                      b2[i6] = 3;
                      i6 = i6 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_0135 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_015f :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_015f ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0182 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       this.c();
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[10];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[10];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       LogoSettingsActivity c3 = logoSettings.c;
       if (c3 != null) {
          c3[i] = 7;
       }
       if (c3 != null) {
          c3[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i7 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                c3 = logoSettings.b;
                if (c3.length > 3) {
                   i3 = 3;
                label_01e8 :
                   if (i < i3) {
                      c3[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i3 = c3.length;
                   goto label_01e8 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i7;
          if (logoSettings.c != null) {
             i7 = 0;
             while (true) {
                LogoSettingsActivity c4 = logoSettings.c;
                if (c4.length > 3) {
                   i1 = 3;
                label_0211 :
                   if (i7 < i1) {
                      c4[i7] = 5;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = c4.length;
                   goto label_0211 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0234 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
    public void onAdLoaded(MaxAd p0){
       int[] ointArray;
       int i3;
       LogoSettingsActivity b1;
       int i5;
       int i6;
       LogoSettingsActivity c2;
       int[] ointArray1;
       LogoSettingsActivity logoSettings = this;
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       LogoSettingsActivity c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       int i2 = 4;
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             int i4 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0062 :
                   if (i4 < i5) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0062 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c1 = logoSettings.c;
                if (c1.length > 3) {
                   i6 = 3;
                label_008b :
                   if (i3 < i6) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c1.length;
                   goto label_008b ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00ae :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       b1 = logoSettings.b;
       if (b1 != null) {
          b1[5] = 2;
       }
       if (b1 != null) {
          b1[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity b2 = logoSettings.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_010d :
                   if (i6 < i2) {
                      b2[i6] = 3;
                      i6 = i6 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_010d ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_0137 :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_0137 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_015a :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("onAdLoaded");
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_01c2 :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_01c2 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_01eb :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_01eb ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_020e :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_026d :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_026d ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_0296 :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_0296 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_02b9 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       logoSettings.f("isReady2 "+logoSettings.a.isReady());
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0336 :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0336 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_035f :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_035f ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0382 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       new Handler().postDelayed(new LogoSettingsActivity$b(logoSettings), 2000);
       c = logoSettings.b;
       if (c != null) {
          c[3] = i;
       }
       c = logoSettings.c;
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       c = logoSettings.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_03f4 :
                   if (i2 < i5) {
                      b1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_03f4 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c2 = logoSettings.c;
                if (c2.length > 3) {
                   i6 = 3;
                label_041d :
                   if (i3 < i6) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c2.length;
                   goto label_041d ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          c = logoSettings.f;
          if (c != null && c.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0440 :
       c = logoSettings.n;
       if (c != null) {
          c[0] = 0;
       }
       c = logoSettings.c;
       if (c != null) {
          c[2] = 3;
       }
       c2 = logoSettings.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       if (c2 != null) {
          c2[3] = i;
       }
       if (c != null) {
          c[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray1 = new int[10];
          logoSettings.b = ointArray1;
       }
       if (logoSettings.c == null) {
          ointArray1 = new int[10];
          logoSettings.c = ointArray1;
       }
       logoSettings.e = false;
       LogoSettingsActivity c3 = logoSettings.c;
       if (c3 != null) {
          c3[i] = 7;
       }
       if (c3 != null) {
          c3[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          int i7 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                c3 = logoSettings.b;
                if (c3.length > 3) {
                   i3 = 3;
                label_049f :
                   if (i < i3) {
                      c3[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i3 = c3.length;
                   goto label_049f ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i7;
          if (logoSettings.c != null) {
             i7 = 0;
             while (true) {
                LogoSettingsActivity c4 = logoSettings.c;
                if (c4.length > 3) {
                   i1 = 3;
                label_04c8 :
                   if (i7 < i1) {
                      c4[i7] = 5;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = c4.length;
                   goto label_04c8 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_04eb :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
    public void onBackPressed(){
       int[] ointArray;
       int i5;
       LogoSettingsActivity tb = this.b;
       int i = 9;
       if (tb != null) {
          tb[3] = i;
       }
       tb = this.c;
       int i1 = 0;
       if (tb != null) {
          tb[8] = i1;
       }
       if (this.f == null) {
          this.f = new ArrayList();
       }
       String str = ";paddingStart";
       this.d = str;
       boolean b = true;
       this.e = b;
       int i2 = 10;
       if (this.b == null) {
          ointArray = new int[i2];
          this.b = ointArray;
       }
       if (this.c == null) {
          ointArray = new int[i2];
          this.c = ointArray;
       }
       this.e = i1;
       LogoSettingsActivity tc = this.c;
       if (tc != null) {
          tc[i] = 7;
       }
       if (tc != null) {
          tc[4] = b;
       }
       if (!TextUtils.isEmpty(str)) {
          int i3 = (this.d).length();
          if (this.b != null) {
             int i4 = i1;
             while (true) {
                LogoSettingsActivity tb1 = this.b;
                if (tb1.length > 3) {
                   i5 = 3;
                label_005e :
                   if (i4 < i5) {
                      tb1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = tb1.length;
                   goto label_005e ;
                }
             }
          }
          this.e = i1;
          this.d = this.d+i3;
          if (this.c != null) {
             i3 = i1;
             while (true) {
                tc = this.c;
                if (tc.length > 3) {
                   i2 = 3;
                label_0087 :
                   if (i3 < i2) {
                      tc[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i2 = tc.length;
                   goto label_0087 ;
                }
             }
          }
          if (this.f.size() < b) {
             this.f.add(" than ");
          }
          tb = this.f;
          if (tb != null && tb.size() > 0) {
             this.f.remove(i1);
          }
       }
    label_00ac :
       tb = this.n;
       if (tb != null) {
          tb[i1] = i1;
       }
       tb = this.c;
       if (tb != null) {
          tb[2] = 3;
       }
       tb = this.b;
       if (tb != null) {
          tb[5] = 2;
       }
       return;
    }
    public void onCreate(Bundle p0){
       int[] ointArray;
       int i3;
       int i4;
       int i5;
       LogoSettingsActivity c;
       int i6;
       LogoSettingsActivity c1;
       int i7;
       LogoSettingsActivity logoSettings = this;
       super.onCreate(p0);
       LogoSettingsActivity b = logoSettings.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       String str = ";paddingStart";
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       int i2 = 4;
       if (b != null) {
          b[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i4 = 0;
             while (true) {
                LogoSettingsActivity b1 = logoSettings.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_0065 :
                   if (i4 < i5) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_0065 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c = logoSettings.c;
                if (c.length > 3) {
                   i6 = 3;
                label_008e :
                   if (i3 < i6) {
                      c[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c.length;
                   goto label_008e ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_00b1 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       i4 = 2;
       if (b != null) {
          b[i4] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = i4;
       }
       logoSettings.f("onCreate");
       b = logoSettings.b;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       if (b != null) {
          b[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i6 = 0;
             while (true) {
                LogoSettingsActivity b2 = logoSettings.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_0119 :
                   if (i6 < i2) {
                      b2[i6] = 3;
                      i6 = i6 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_0119 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c1 = logoSettings.c;
                if (c1.length > 3) {
                   i6 = 3;
                label_0143 :
                   if (i3 < i6) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c1.length;
                   goto label_0143 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0166 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[i4] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = i4;
       }
       logoSettings.k = this.getIntent().getStringExtra((logoSettings.g).replaceAll("hu17kxd", "")+(logoSettings.h).replaceAll("mkisje", "")+"n");
       b = logoSettings.b;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       if (b != null) {
          b[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                c = logoSettings.b;
                if (c.length > 3) {
                   i6 = 3;
                label_01f9 :
                   if (i2 < i6) {
                      c[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = c.length;
                   goto label_01f9 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c1 = logoSettings.c;
                if (c1.length > 3) {
                   i4 = 3;
                label_0222 :
                   if (i3 < i4) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c1.length;
                   goto label_0222 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0245 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       i2 = 2;
       if (b != null) {
          b[i2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = i2;
       }
       if (TextUtils.isEmpty(logoSettings.k)) {
          b = logoSettings.b;
          if (b != null) {
             b[3] = i;
          }
          b = logoSettings.c;
          if (b != null) {
             b[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          b = logoSettings.c;
          if (b != null) {
             b[i] = 7;
          }
          if (b != null) {
             b[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   c = logoSettings.b;
                   if (c.length > 3) {
                      i6 = 3;
                   label_02b1 :
                      if (i2 < i6) {
                         c[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i6 = c.length;
                      goto label_02b1 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c1 = logoSettings.c;
                   if (c1.length > 3) {
                      i4 = 3;
                   label_02da :
                      if (i3 < i4) {
                         c1[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i4 = c1.length;
                      goto label_02da ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             b = logoSettings.f;
             if (b != null && b.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_02fd :
          b = logoSettings.n;
          if (b != null) {
             b[0] = 0;
          }
          b = logoSettings.c;
          i2 = 2;
          if (b != null) {
             b[i2] = 3;
          }
          b = logoSettings.b;
          if (b != null) {
             b[5] = i2;
          }
          try{
             logoSettings.l = new bi(logoSettings);
             b = logoSettings.b;
             if (b != null) {
                b[3] = i;
             label_031d :
                b = logoSettings.c;
                if (b != null) {
                   b[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                b = logoSettings.c;
                if (b != null) {
                   b[i] = 7;
                }
                if (b != null) {
                   b[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i3 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         c = logoSettings.b;
                         if (c.length > 3) {
                            i6 = 3;
                         label_0368 :
                            if (i2 < i6) {
                               c[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = c.length;
                            goto label_0368 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i3;
                   if (logoSettings.c != null) {
                      i3 = 0;
                      while (true) {
                         c1 = logoSettings.c;
                         if (c1.length > 3) {
                            i4 = 3;
                         label_0393 :
                            if (i3 < i4) {
                               c1[i3] = 5;
                               i3 = i3 + 1;
                            }
                         }else {
                            i4 = c1.length;
                            goto label_0393 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   b = logoSettings.f;
                   if (b != null && b.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_03b6 :
                b = logoSettings.n;
                if (b != null) {
                   b[0] = 0;
                }
                b = logoSettings.c;
                i2 = 2;
                if (b != null) {
                   b[i2] = 3;
                }
                b = logoSettings.b;
                if (b != null) {
                   b[5] = i2;
                }
                logoSettings.l.a();
                b = logoSettings.b;
                if (b != null) {
                   b[3] = i;
                }
                b = logoSettings.c;
                if (b != null) {
                   b[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                b = logoSettings.c;
                if (b != null) {
                   b[i] = 7;
                }
                if (b != null) {
                   b[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i3 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         c = logoSettings.b;
                         if (c.length > 3) {
                            i6 = 3;
                         label_041f :
                            if (i2 < i6) {
                               c[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = c.length;
                            goto label_041f ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i3;
                   if (logoSettings.c != null) {
                      i3 = 0;
                      while (true) {
                         c1 = logoSettings.c;
                         if (c1.length > 3) {
                            i4 = 3;
                         label_044a :
                            if (i3 < i4) {
                               c1[i3] = 5;
                               i3 = i3 + 1;
                            }
                         }else {
                            i4 = c1.length;
                            goto label_044a ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   b = logoSettings.f;
                   if (b != null && b.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_046d :
                b = logoSettings.n;
                if (b != null) {
                   b[0] = 0;
                }
                b = logoSettings.c;
                i2 = 2;
                if (b != null) {
                   b[i2] = 3;
                }
                b = logoSettings.b;
                if (b != null) {
                   b[5] = i2;
                }
                logoSettings.l.show();
                b = logoSettings.b;
                if (b != null) {
                   b[3] = i;
                }
                b = logoSettings.c;
                if (b != null) {
                   b[i1] = 0;
                }
                if (logoSettings.f == null) {
                   logoSettings.f = new ArrayList();
                }
                logoSettings.d = str;
                logoSettings.e = true;
                if (logoSettings.b == null) {
                   ointArray = new int[10];
                   logoSettings.b = ointArray;
                }
                if (logoSettings.c == null) {
                   ointArray = new int[10];
                   logoSettings.c = ointArray;
                }
                logoSettings.e = false;
                b = logoSettings.c;
                if (b != null) {
                   b[i] = 7;
                }
                if (b != null) {
                   b[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i3 = (logoSettings.d).length();
                   if (logoSettings.b != null) {
                      i2 = 0;
                      while (true) {
                         c = logoSettings.b;
                         if (c.length > 3) {
                            i6 = 3;
                         label_04d6 :
                            if (i2 < i6) {
                               c[i2] = 3;
                               i2 = i2 + 1;
                            }
                         }else {
                            i6 = c.length;
                            goto label_04d6 ;
                         }
                      }
                   }
                   logoSettings.e = false;
                   logoSettings.d = logoSettings.d+i3;
                   if (logoSettings.c != null) {
                      i3 = 0;
                      while (true) {
                         c1 = logoSettings.c;
                         if (c1.length > 3) {
                            i4 = 3;
                         label_0501 :
                            if (i3 < i4) {
                               c1[i3] = 5;
                               i3 = i3 + 1;
                            }
                         }else {
                            i4 = c1.length;
                            goto label_0501 ;
                         }
                      }
                   }
                   if (logoSettings.f.size() < 1) {
                      logoSettings.f.add(" than ");
                   }
                   b = logoSettings.f;
                   if (b != null && b.size() > 0) {
                      logoSettings.f.remove(0);
                   }
                }
             label_0524 :
                b = logoSettings.n;
                if (b != null) {
                   b[0] = 0;
                }
                b = logoSettings.c;
                i2 = 2;
                if (b != null) {
                   b[i2] = 3;
                }
                b = logoSettings.b;
                if (b != null) {
                   b[5] = i2;
                }
             }else {
                goto label_031d ;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          b = logoSettings.b;
          if (b != null) {
             b[3] = i;
          }
          b = logoSettings.c;
          if (b != null) {
             b[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          b = logoSettings.c;
          if (b != null) {
             b[i] = 7;
          }
          if (b != null) {
             b[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   c = logoSettings.b;
                   if (c.length > 3) {
                      i6 = 3;
                   label_058d :
                      if (i2 < i6) {
                         c[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i6 = c.length;
                      goto label_058d ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c1 = logoSettings.c;
                   if (c1.length > 3) {
                      i4 = 3;
                   label_05b6 :
                      if (i3 < i4) {
                         c1[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i4 = c1.length;
                      goto label_05b6 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             b = logoSettings.f;
             if (b != null && b.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_05d9 :
          b = logoSettings.n;
          if (b != null) {
             b[0] = 0;
          }
          b = logoSettings.c;
          i2 = 2;
          if (b != null) {
             b[i2] = 3;
          }
          b = logoSettings.b;
          if (b != null) {
             b[5] = i2;
          }
       }else {
          b = logoSettings.b;
          if (b != null) {
             b[3] = i;
          }
          b = logoSettings.c;
          if (b != null) {
             b[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          b = logoSettings.c;
          if (b != null) {
             b[i] = 7;
          }
          if (b != null) {
             b[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   c = logoSettings.b;
                   if (c.length > 3) {
                      i6 = 3;
                   label_063f :
                      if (i2 < i6) {
                         c[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i6 = c.length;
                      goto label_063f ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c1 = logoSettings.c;
                   if (c1.length > 3) {
                      i4 = 3;
                   label_0668 :
                      if (i3 < i4) {
                         c1[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i4 = c1.length;
                      goto label_0668 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             b = logoSettings.f;
             if (b != null && b.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_068b :
          b = logoSettings.n;
          if (b != null) {
             b[0] = 0;
          }
          b = logoSettings.c;
          i2 = 2;
          if (b != null) {
             b[i2] = 3;
          }
          b = logoSettings.b;
          if (b != null) {
             b[5] = i2;
          }
          try{
             logoSettings.m = new ai(logoSettings);
             b = logoSettings.b;
             if (b != null) {
                b[3] = i;
             }
             b = logoSettings.c;
             if (b != null) {
                b[i1] = 0;
             }
             if (logoSettings.f == null) {
                logoSettings.f = new ArrayList();
             }
             logoSettings.d = str;
             logoSettings.e = true;
             if (logoSettings.b == null) {
                ointArray = new int[10];
                logoSettings.b = ointArray;
             }
             if (logoSettings.c == null) {
                ointArray = new int[10];
                logoSettings.c = ointArray;
             }
             logoSettings.e = false;
             b = logoSettings.c;
             if (b != null) {
                b[i] = 7;
             }
             if (b != null) {
                b[4] = true;
             }
             if (!TextUtils.isEmpty(str)) {
                i3 = (logoSettings.d).length();
                if (logoSettings.b != null) {
                   i2 = 0;
                   while (true) {
                      c = logoSettings.b;
                      if (c.length > 3) {
                         i6 = 3;
                      label_06f6 :
                         if (i2 < i6) {
                            c[i2] = 3;
                            i2 = i2 + 1;
                         }
                      }else {
                         i6 = c.length;
                         goto label_06f6 ;
                      }
                   }
                }
                logoSettings.e = false;
                logoSettings.d = logoSettings.d+i3;
                if (logoSettings.c != null) {
                   i3 = 0;
                   while (true) {
                      c1 = logoSettings.c;
                      if (c1.length > 3) {
                         i4 = 3;
                      label_0721 :
                         if (i3 < i4) {
                            c1[i3] = 5;
                            i3 = i3 + 1;
                         }
                      }else {
                         i4 = c1.length;
                         goto label_0721 ;
                      }
                   }
                }
                if (logoSettings.f.size() < 1) {
                   logoSettings.f.add(" than ");
                }
                b = logoSettings.f;
                if (b != null && b.size() > 0) {
                   logoSettings.f.remove(0);
                }
             }
          label_0744 :
             b = logoSettings.n;
             if (b != null) {
                b[0] = 0;
             }
             b = logoSettings.c;
             i2 = 2;
             if (b != null) {
                b[i2] = 3;
             }
             b = logoSettings.b;
             if (b != null) {
                b[5] = i2;
             }
             logoSettings.m.show();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          b = logoSettings.b;
          if (b != null) {
             b[3] = i;
          }
          b = logoSettings.c;
          if (b != null) {
             b[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          b = logoSettings.c;
          if (b != null) {
             b[i] = 7;
          }
          if (b != null) {
             b[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   c = logoSettings.b;
                   if (c.length > 3) {
                      i6 = 3;
                   label_07b2 :
                      if (i2 < i6) {
                         c[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i6 = c.length;
                      goto label_07b2 ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c1 = logoSettings.c;
                   if (c1.length > 3) {
                      i4 = 3;
                   label_07db :
                      if (i3 < i4) {
                         c1[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i4 = c1.length;
                      goto label_07db ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             b = logoSettings.f;
             if (b != null && b.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_07fe :
          b = logoSettings.n;
          if (b != null) {
             b[0] = 0;
          }
          b = logoSettings.c;
          i2 = 2;
          if (b != null) {
             b[i2] = 3;
          }
          c = logoSettings.b;
          if (c != null) {
             c[5] = i2;
          }
          if (c != null) {
             c[3] = i;
          }
          if (b != null) {
             b[i1] = 0;
          }
          if (logoSettings.f == null) {
             logoSettings.f = new ArrayList();
          }
          logoSettings.d = str;
          logoSettings.e = true;
          if (logoSettings.b == null) {
             ointArray = new int[10];
             logoSettings.b = ointArray;
          }
          if (logoSettings.c == null) {
             ointArray = new int[10];
             logoSettings.c = ointArray;
          }
          logoSettings.e = false;
          b = logoSettings.c;
          if (b != null) {
             b[i] = 7;
          }
          if (b != null) {
             b[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i3 = (logoSettings.d).length();
             if (logoSettings.b != null) {
                i2 = 0;
                while (true) {
                   c = logoSettings.b;
                   if (c.length > 3) {
                      i6 = 3;
                   label_085e :
                      if (i2 < i6) {
                         c[i2] = 3;
                         i2 = i2 + 1;
                      }
                   }else {
                      i6 = c.length;
                      goto label_085e ;
                   }
                }
             }
             logoSettings.e = false;
             logoSettings.d = logoSettings.d+i3;
             if (logoSettings.c != null) {
                i3 = 0;
                while (true) {
                   c1 = logoSettings.c;
                   if (c1.length > 3) {
                      i4 = 3;
                   label_0887 :
                      if (i3 < i4) {
                         c1[i3] = 5;
                         i3 = i3 + 1;
                      }
                   }else {
                      i4 = c1.length;
                      goto label_0887 ;
                   }
                }
             }
             if (logoSettings.f.size() < 1) {
                logoSettings.f.add(" than ");
             }
             b = logoSettings.f;
             if (b != null && b.size() > 0) {
                logoSettings.f.remove(0);
             }
          }
       label_08aa :
          b = logoSettings.n;
          if (b != null) {
             b[0] = 0;
          }
          b = logoSettings.c;
          i2 = 2;
          if (b != null) {
             b[i2] = 3;
          }
          b = logoSettings.b;
          if (b != null) {
             b[5] = i2;
          }
       }
       b = logoSettings.b;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       if (b != null) {
          b[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                c = logoSettings.b;
                if (c.length > 3) {
                   i6 = 3;
                label_090e :
                   if (i2 < i6) {
                      c[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = c.length;
                   goto label_090e ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c1 = logoSettings.c;
                if (c1.length > 3) {
                   i4 = 3;
                label_0937 :
                   if (i3 < i4) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c1.length;
                   goto label_0937 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_095a :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       i2 = 2;
       if (b != null) {
          b[i2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = i2;
       }
       AppLovinSdk.getInstance(this).setMediationProvider("max");
       b = logoSettings.b;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       if (b != null) {
          b[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                c = logoSettings.b;
                if (c.length > 3) {
                   i6 = 3;
                label_09c7 :
                   if (i2 < i6) {
                      c[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = c.length;
                   goto label_09c7 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c1 = logoSettings.c;
                if (c1.length > 3) {
                   i4 = 3;
                label_09f0 :
                   if (i3 < i4) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c1.length;
                   goto label_09f0 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0a13 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       i2 = 2;
       if (b != null) {
          b[i2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = i2;
       }
       if (c != null) {
          c[3] = i;
       }
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       if (b != null) {
          b[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                c = logoSettings.b;
                if (c.length > 3) {
                   i6 = 3;
                label_0a73 :
                   if (i2 < i6) {
                      c[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = c.length;
                   goto label_0a73 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c1 = logoSettings.c;
                if (c1.length > 3) {
                   i4 = 3;
                label_0a9c :
                   if (i3 < i4) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c1.length;
                   goto label_0a9c ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0abf :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       i2 = 2;
       if (b != null) {
          b[i2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = i2;
       }
       AppLovinSdk.initializeSdk(logoSettings, new gi(logoSettings));
       b = logoSettings.b;
       if (b != null) {
          b[3] = i;
       }
       b = logoSettings.c;
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       if (b != null) {
          b[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i2 = 0;
             while (true) {
                c = logoSettings.b;
                if (c.length > 3) {
                   i6 = 3;
                label_0b2b :
                   if (i2 < i6) {
                      c[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i6 = c.length;
                   goto label_0b2b ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                c1 = logoSettings.c;
                if (c1.length > 3) {
                   i4 = 3;
                label_0b54 :
                   if (i3 < i4) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c1.length;
                   goto label_0b54 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0b77 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       c = logoSettings.b;
       if (c != null) {
          c[5] = 2;
       }
       if (c != null) {
          c[3] = i;
       }
       if (b != null) {
          b[i1] = 0;
       }
       if (logoSettings.f == null) {
          logoSettings.f = new ArrayList();
       }
       logoSettings.d = str;
       logoSettings.e = true;
       if (logoSettings.b == null) {
          ointArray = new int[10];
          logoSettings.b = ointArray;
       }
       if (logoSettings.c == null) {
          ointArray = new int[10];
          logoSettings.c = ointArray;
       }
       logoSettings.e = false;
       b = logoSettings.c;
       if (b != null) {
          b[i] = 7;
       }
       if (b != null) {
          b[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (logoSettings.d).length();
          if (logoSettings.b != null) {
             i = 0;
             while (true) {
                LogoSettingsActivity b3 = logoSettings.b;
                if (b3.length > 3) {
                   i7 = 3;
                label_0bd7 :
                   if (i < i7) {
                      b3[i] = 3;
                      i = i + 1;
                   }
                }else {
                   i7 = b3.length;
                   goto label_0bd7 ;
                }
             }
          }
          logoSettings.e = false;
          logoSettings.d = logoSettings.d+i3;
          if (logoSettings.c != null) {
             i3 = 0;
             while (true) {
                LogoSettingsActivity c2 = logoSettings.c;
                if (c2.length > 3) {
                   i1 = 3;
                label_0c00 :
                   if (i3 < i1) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i1 = c2.length;
                   goto label_0c00 ;
                }
             }
          }
          if (logoSettings.f.size() < 1) {
             logoSettings.f.add(" than ");
          }
          b = logoSettings.f;
          if (b != null && b.size() > 0) {
             logoSettings.f.remove(0);
          }
       }
    label_0c23 :
       b = logoSettings.n;
       if (b != null) {
          b[0] = 0;
       }
       b = logoSettings.c;
       if (b != null) {
          b[2] = 3;
       }
       b = logoSettings.b;
       if (b != null) {
          b[5] = 2;
       }
       return;
    }
}
