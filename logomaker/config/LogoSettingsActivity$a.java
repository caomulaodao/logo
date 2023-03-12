package com.logomaster.logomaker.config.LogoSettingsActivity$a;
import java.lang.Runnable;
import com.logomaster.logomaker.config.LogoSettingsActivity;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.lang.StringBuilder;
import com.applovin.mediation.ads.MaxInterstitialAd;

public class LogoSettingsActivity$a implements Runnable	// class@000d53
{
    public final LogoSettingsActivity a;

    public void LogoSettingsActivity$a(LogoSettingsActivity p0){
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
       LogoSettingsActivity c2;
       int[] ointArray2;
       LogoSettingsActivity$a uoa = this;
       LogoSettingsActivity$a a = uoa.a;
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
       a = uoa.a;
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
          i3 = (uoa.a.d).length();
          if (uoa.a.b != null) {
             i4 = 0;
             while (true) {
                LogoSettingsActivity b1 = uoa.a.b;
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
          LogoSettingsActivity$a a1 = uoa.a;
          a1.e = a1.e ^ true;
          a1.e = false;
          a1.d = uoa.a.d+i3;
          if (uoa.a.c != null) {
             i3 = 0;
             while (true) {
                c1 = uoa.a.c;
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
          if (uoa.a.f.size() < 1) {
             uoa.a.f.add(" than ");
          }
          c = uoa.a.f;
          if (c != null && c.size() > 0) {
             uoa.a.f.remove(0);
          }
       }
    label_00cd :
       a = uoa.a;
       c1 = a.n;
       if (c1 != null) {
          c1[0] = 0;
       }
       c1 = a.c;
       if (c1 != null) {
          c1[2] = 3;
       }
       c1 = a.b;
       if (c1 != null) {
          c1[5] = 2;
       }
       LogoSettingsActivity.b(a).showAd();
       a = uoa.a;
       c1 = a.b;
       if (c1 != null) {
          c1[3] = i;
       }
       c1 = a.c;
       if (c1 != null) {
          c1[i1] = 0;
       }
       if (a.f == null) {
          a.f = new ArrayList();
       }
       a = uoa.a;
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
          i3 = (uoa.a.d).length();
          if (uoa.a.b != null) {
             i4 = 0;
             while (true) {
                LogoSettingsActivity b2 = uoa.a.b;
                if (b2.length > 3) {
                   i2 = 3;
                label_0143 :
                   if (i4 < i2) {
                      b2[i4] = 3;
                      i4 = i4 + 1;
                      i2 = 4;
                   }
                }else {
                   i2 = b2.length;
                   goto label_0143 ;
                }
             }
          }
          LogoSettingsActivity$a a2 = uoa.a;
          a2.e = a2.e ^ true;
          a2.e = false;
          a2.d = uoa.a.d+i3;
          if (uoa.a.c != null) {
             i3 = 0;
             while (true) {
                c2 = uoa.a.c;
                if (c2.length > 3) {
                   i4 = 3;
                label_017a :
                   if (i3 < i4) {
                      c2[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = c2.length;
                   goto label_017a ;
                }
             }
          }
          if (uoa.a.f.size() < 1) {
             uoa.a.f.add(" than ");
          }
          c = uoa.a.f;
          if (c != null && c.size() > 0) {
             uoa.a.f.remove(0);
          }
       }
    label_01a5 :
       a = uoa.a;
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
       a = uoa.a;
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
          i3 = (uoa.a.d).length();
          if (uoa.a.b != null) {
             int i7 = 0;
             while (true) {
                LogoSettingsActivity b3 = uoa.a.b;
                if (b3.length > 3) {
                   i1 = 3;
                label_020e :
                   if (i7 < i1) {
                      b3[i7] = 3;
                      i7 = i7 + 1;
                   }
                }else {
                   i1 = b3.length;
                   goto label_020e ;
                }
             }
          }
          LogoSettingsActivity$a a3 = uoa.a;
          a3.e = a3.e ^ true;
          a3.e = false;
          a3.d = uoa.a.d+i3;
          if (uoa.a.c != null) {
             i3 = 0;
             while (true) {
                b = uoa.a.c;
                if (b.length > 3) {
                   i = 3;
                label_0244 :
                   if (i3 < i) {
                      b[i3] = 5;
                      i3 = i3 + 1;
                   }
                }else {
                   i = b.length;
                   goto label_0244 ;
                }
             }
          }
          if (uoa.a.f.size() < 1) {
             uoa.a.f.add(" than ");
          }
          c = uoa.a.f;
          if (c != null && c.size() > 0) {
             uoa.a.f.remove(0);
          }
       }
    label_026f :
       a = uoa.a;
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
