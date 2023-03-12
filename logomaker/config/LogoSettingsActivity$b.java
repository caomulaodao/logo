package com.logomaster.logomaker.config.LogoSettingsActivity$b;
import java.lang.Runnable;
import com.logomaster.logomaker.config.LogoSettingsActivity;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.lang.StringBuilder;
import com.applovin.mediation.ads.MaxInterstitialAd;

public class LogoSettingsActivity$b implements Runnable	// class@000d54
{
    public final LogoSettingsActivity a;

    public void LogoSettingsActivity$b(LogoSettingsActivity p0){
       this.a = p0;
       super();
    }
    public void run(){
       int[] ointArray;
       int i3;
       int i4;
       int i5;
       LogoSettingsActivity c1;
       int i6;
       int[] ointArray1;
       LogoSettingsActivity$b a2;
       LogoSettingsActivity c2;
       int[] ointArray2;
       int[] ointArray3;
       LogoSettingsActivity$b uob = this;
       LogoSettingsActivity$b a = uob.a;
       LogoSettingsActivity b = a.b;
       int i = 9;
       if (b != null) {
          b[3] = i;
       }
       b = a.c;
       int i1 = 8;
       if (b != null) {
          b[i1] = 0;
       }
       if (a.f == null) {
          a.f = new ArrayList();
       }
       a = uob.a;
       String str = ";paddingStart";
       a.d = str;
       a.e = true;
       if (a.b == null) {
          ointArray = new int[10];
          a.b = ointArray;
       }
       if (a.c == null) {
          ointArray = new int[10];
          a.c = ointArray;
       }
       a.e = false;
       LogoSettingsActivity c = a.c;
       if (c != null) {
          c[i] = 7;
       }
       int i2 = 4;
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (uob.a.d).length();
          if (uob.a.b != null) {
             i4 = 0;
             while (true) {
                LogoSettingsActivity b1 = uob.a.b;
                if (b1.length > 3) {
                   i5 = 3;
                label_006c :
                   if (i4 < i5) {
                      b1[i4] = 3;
                      i4 = i4 + 1;
                   }
                }else {
                   i5 = b1.length;
                   goto label_006c ;
                }
             }
          }
          LogoSettingsActivity$b a1 = uob.a;
          a1.e = a1.e ^ true;
          a1.e = false;
          a1.d = uob.a.d+i3;
          if (uob.a.c != null) {
             i3 = 0;
             while (true) {
                c1 = uob.a.c;
                if (c1.length > 3) {
                   i6 = 3;
                label_00a2 :
                   if (i3 < i6) {
                      c1[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i6 = c1.length;
                   goto label_00a2 ;
                }
             }
          }
          if (uob.a.f.size() < 1) {
             uob.a.f.add(" than ");
          }
          c = uob.a.f;
          if (c != null && c.size() > 0) {
             uob.a.f.remove(0);
          }
       }
    label_00cd :
       a = uob.a;
       c1 = a.n;
       if (c1 != null) {
          c1[0] = 0;
       }
       c1 = a.c;
       if (c1 != null) {
          c1[2] = 3;
       }
       LogoSettingsActivity b2 = a.b;
       if (b2 != null) {
          b2[5] = 2;
       }
       if (b2 != null) {
          b2[3] = i;
       }
       if (c1 != null) {
          c1[i1] = 0;
       }
       if (a.f == null) {
          a.f = new ArrayList();
       }
       a = uob.a;
       a.d = str;
       a.e = true;
       if (a.b == null) {
          ointArray1 = new int[10];
          a.b = ointArray1;
       }
       if (a.c == null) {
          ointArray1 = new int[10];
          a.c = ointArray1;
       }
       a.e = false;
       c = a.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[i2] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (uob.a.d).length();
          if (uob.a.b != null) {
             i4 = 0;
             while (true) {
                b2 = uob.a.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_0136 :
                   if (i4 < i2) {
                      b2[i4] = 3;
                      i4 = i4 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_0136 ;
                }
             }
          }
          a2 = uob.a;
          a2.e = a2.e ^ true;
          a2.e = false;
          a2.d = uob.a.d+i3;
          if (uob.a.c != null) {
             i3 = 0;
             while (true) {
                c2 = uob.a.c;
                if (c2.length > 3) {
                   i4 = 3;
                label_016d :
                   if (i3 < i4) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c2.length;
                   goto label_016d ;
                }
             }
          }
          if (uob.a.f.size() < 1) {
             uob.a.f.add(" than ");
          }
          c = uob.a.f;
          if (c != null && c.size() > 0) {
             uob.a.f.remove(0);
          }
       }
    label_0198 :
       a = uob.a;
       c2 = a.n;
       if (c2 != null) {
          c2[0] = 0;
       }
       c2 = a.c;
       if (c2 != null) {
          c2[2] = 3;
       }
       c2 = a.b;
       if (c2 != null) {
          c2[5] = 2;
       }
       LogoSettingsActivity.b(a).showAd();
       a = uob.a;
       c2 = a.b;
       if (c2 != null) {
          c2[3] = i;
       }
       c2 = a.c;
       if (c2 != null) {
          c2[i1] = 0;
       }
       if (a.f == null) {
          a.f = new ArrayList();
       }
       a = uob.a;
       a.d = str;
       a.e = true;
       if (a.b == null) {
          ointArray2 = new int[10];
          a.b = ointArray2;
       }
       if (a.c == null) {
          ointArray2 = new int[10];
          a.c = ointArray2;
       }
       a.e = false;
       c = a.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (uob.a.d).length();
          if (uob.a.b != null) {
             i2 = 0;
             while (true) {
                c1 = uob.a.b;
                if (c1.length > 3) {
                   i5 = 3;
                label_020e :
                   if (i2 < i5) {
                      c1[i2] = 3;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = c1.length;
                   goto label_020e ;
                }
             }
          }
          a2 = uob.a;
          a2.e = a2.e ^ true;
          a2.e = false;
          a2.d = uob.a.d+i3;
          if (uob.a.c != null) {
             i3 = 0;
             while (true) {
                c2 = uob.a.c;
                if (c2.length > 3) {
                   i4 = 3;
                label_0244 :
                   if (i3 < i4) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c2.length;
                   goto label_0244 ;
                }
             }
          }
          if (uob.a.f.size() < 1) {
             uob.a.f.add(" than ");
          }
          c = uob.a.f;
          if (c != null && c.size() > 0) {
             uob.a.f.remove(0);
          }
       }
    label_026f :
       a = uob.a;
       c2 = a.n;
       if (c2 != null) {
          c2[0] = 0;
       }
       c2 = a.c;
       if (c2 != null) {
          c2[2] = 3;
       }
       c1 = a.b;
       if (c1 != null) {
          c1[5] = 2;
       }
       if (c1 != null) {
          c1[3] = i;
       }
       if (c2 != null) {
          c2[i1] = 0;
       }
       if (a.f == null) {
          a.f = new ArrayList();
       }
       a = uob.a;
       a.d = str;
       a.e = true;
       if (a.b == null) {
          ointArray3 = new int[10];
          a.b = ointArray3;
       }
       if (a.c == null) {
          ointArray3 = new int[10];
          a.c = ointArray3;
       }
       a.e = false;
       c = a.c;
       if (c != null) {
          c[i] = 7;
       }
       if (c != null) {
          c[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i3 = (uob.a.d).length();
          if (uob.a.b != null) {
             int i7 = 0;
             while (true) {
                LogoSettingsActivity b3 = uob.a.b;
                if (b3.length > 3) {
                   i1 = 3;
                label_02d8 :
                   if (i7 < i1) {
                      b3[i7] = 3;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = b3.length;
                   goto label_02d8 ;
                }
             }
          }
          LogoSettingsActivity$b a3 = uob.a;
          a3.e = a3.e ^ true;
          a3.e = false;
          a3.d = uob.a.d+i3;
          if (uob.a.c != null) {
             i3 = 0;
             while (true) {
                b = uob.a.c;
                if (b.length > 3) {
                   i = 3;
                label_030e :
                   if (i3 < i) {
                      b[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i = b.length;
                   goto label_030e ;
                }
             }
          }
          if (uob.a.f.size() < 1) {
             uob.a.f.add(" than ");
          }
          c = uob.a.f;
          if (c != null && c.size() > 0) {
             uob.a.f.remove(0);
          }
       }
    label_0339 :
       a = uob.a;
       b = a.n;
       if (b != null) {
          b[0] = 0;
       }
       b = a.c;
       if (b != null) {
          b[2] = 3;
       }
       c = a.b;
       if (c != null) {
          c[5] = 2;
       }
       return;
    }
}
