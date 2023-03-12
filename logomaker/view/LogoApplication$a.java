package com.logomaster.logomaker.LogoApplication$a;
import com.appsflyer.AppsFlyerConversionListener;
import com.logomaster.logomaker.LogoApplication;
import java.lang.Object;
import java.util.Map;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.lang.StringBuilder;

public class LogoApplication$a implements AppsFlyerConversionListener	// class@000c5a
{
    public final LogoApplication a;

    public void LogoApplication$a(LogoApplication p0){
       this.a = p0;
       super();
    }
    public void onAppOpenAttribution(Map p0){
       int[] ointArray;
       int i2;
       int i4;
       LogoApplication d1;
       int i5;
       int[] ointArray1;
       LogoApplication$a ta = this.a;
       LogoApplication k = ta.k;
       int i = 9;
       if (k != null) {
          k[3] = i;
       }
       k = ta.d;
       int i1 = 8;
       if (k != null) {
          k[i1] = 0;
       }
       if (ta.i == null) {
          ta.i = new ArrayList();
       }
       ta = this.a;
       String str = ";paddingStart";
       ta.c = str;
       ta.e = true;
       if (ta.k == null) {
          ointArray = new int[10];
          ta.k = ointArray;
       }
       if (ta.d == null) {
          ointArray = new int[10];
          ta.d = ointArray;
       }
       ta.e = false;
       LogoApplication d = ta.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (this.a.c).length();
          if (this.a.k != null) {
             int i3 = 0;
             while (true) {
                LogoApplication k1 = this.a.k;
                if (k1.length > 3) {
                   i4 = 3;
                label_006a :
                   if (i3 < i4) {
                      k1[i3] = 3;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = k1.length;
                   goto label_006a ;
                }
             }
          }
          LogoApplication$a ta1 = this.a;
          ta1.e = ta1.e ^ true;
          ta1.e = false;
          ta1.c = this.a.c+i2;
          if (this.a.d != null) {
             i2 = 0;
             while (true) {
                d1 = this.a.d;
                if (d1.length > 3) {
                   i5 = 3;
                label_00a0 :
                   if (i2 < i5) {
                      d1[i2] = 5;
                      i2++;
                   }
                }else {
                   i5 = d1.length;
                   goto label_00a0 ;
                }
             }
          }
          if (this.a.i.size() < 1) {
             this.a.i.add(" than ");
          }
          d = this.a.i;
          if (d != null && d.size() > 0) {
             this.a.i.remove(0);
          }
       }
    label_00cb :
       ta = this.a;
       d1 = ta.g;
       if (d1 != null) {
          d1[0] = 0;
       }
       d1 = ta.d;
       if (d1 != null) {
          d1[2] = 3;
       }
       d1 = ta.k;
       if (d1 != null) {
          d1[5] = 2;
       }
       LogoApplication.d(ta, "onAppOpenAttribution");
       ta = this.a;
       d1 = ta.k;
       if (d1 != null) {
          d1[3] = i;
       }
       d1 = ta.d;
       if (d1 != null) {
          d1[i1] = 0;
       }
       if (ta.i == null) {
          ta.i = new ArrayList();
       }
       ta = this.a;
       ta.c = str;
       ta.e = true;
       if (ta.k == null) {
          ointArray1 = new int[10];
          ta.k = ointArray1;
       }
       if (ta.d == null) {
          ointArray1 = new int[10];
          ta.d = ointArray1;
       }
       ta.e = false;
       d = ta.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (this.a.c).length();
          if (this.a.k != null) {
             int i6 = 0;
             while (true) {
                LogoApplication k2 = this.a.k;
                if (k2.length > 3) {
                   i1 = 3;
                label_013f :
                   if (i6 < i1) {
                      k2[i6] = 3;
                      i6 = i6 + 1;
                   }
                }else {
                   i1 = k2.length;
                   goto label_013f ;
                }
             }
          }
          LogoApplication$a ta2 = this.a;
          ta2.e = ta2.e ^ true;
          ta2.e = false;
          ta2.c = this.a.c+i2;
          if (this.a.d != null) {
             i2 = 0;
             while (true) {
                k = this.a.d;
                if (k.length > 3) {
                   i = 3;
                label_0175 :
                   if (i2 < i) {
                      k[i2] = 5;
                      i2++;
                   }
                }else {
                   i = k.length;
                   goto label_0175 ;
                }
             }
          }
          if (this.a.i.size() < 1) {
             this.a.i.add(" than ");
          }
          d = this.a.i;
          if (d != null && d.size() > 0) {
             this.a.i.remove(0);
          }
       }
    label_01a0 :
       ta = this.a;
       k = ta.g;
       if (k != null) {
          k[0] = 0;
       }
       k = ta.d;
       if (k != null) {
          k[2] = 3;
       }
       d = ta.k;
       if (d != null) {
          d[5] = 2;
       }
       return;
    }
    public void onAttributionFailure(String p0){
       int[] ointArray;
       int i2;
       int i4;
       LogoApplication d1;
       int i5;
       int[] ointArray1;
       LogoApplication$a ta = this.a;
       LogoApplication k = ta.k;
       int i = 9;
       if (k != null) {
          k[3] = i;
       }
       k = ta.d;
       int i1 = 8;
       if (k != null) {
          k[i1] = 0;
       }
       if (ta.i == null) {
          ta.i = new ArrayList();
       }
       ta = this.a;
       String str = ";paddingStart";
       ta.c = str;
       ta.e = true;
       if (ta.k == null) {
          ointArray = new int[10];
          ta.k = ointArray;
       }
       if (ta.d == null) {
          ointArray = new int[10];
          ta.d = ointArray;
       }
       ta.e = false;
       LogoApplication d = ta.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (this.a.c).length();
          if (this.a.k != null) {
             int i3 = 0;
             while (true) {
                LogoApplication k1 = this.a.k;
                if (k1.length > 3) {
                   i4 = 3;
                label_006a :
                   if (i3 < i4) {
                      k1[i3] = 3;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = k1.length;
                   goto label_006a ;
                }
             }
          }
          LogoApplication$a ta1 = this.a;
          ta1.e = ta1.e ^ true;
          ta1.e = false;
          ta1.c = this.a.c+i2;
          if (this.a.d != null) {
             i2 = 0;
             while (true) {
                d1 = this.a.d;
                if (d1.length > 3) {
                   i5 = 3;
                label_00a0 :
                   if (i2 < i5) {
                      d1[i2] = 5;
                      i2++;
                   }
                }else {
                   i5 = d1.length;
                   goto label_00a0 ;
                }
             }
          }
          if (this.a.i.size() < 1) {
             this.a.i.add(" than ");
          }
          d = this.a.i;
          if (d != null && d.size() > 0) {
             this.a.i.remove(0);
          }
       }
    label_00cb :
       ta = this.a;
       d1 = ta.g;
       if (d1 != null) {
          d1[0] = 0;
       }
       d1 = ta.d;
       if (d1 != null) {
          d1[2] = 3;
       }
       d1 = ta.k;
       if (d1 != null) {
          d1[5] = 2;
       }
       LogoApplication.d(ta, "onAttributionFailure");
       ta = this.a;
       d1 = ta.k;
       if (d1 != null) {
          d1[3] = i;
       }
       d1 = ta.d;
       if (d1 != null) {
          d1[i1] = 0;
       }
       if (ta.i == null) {
          ta.i = new ArrayList();
       }
       ta = this.a;
       ta.c = str;
       ta.e = true;
       if (ta.k == null) {
          ointArray1 = new int[10];
          ta.k = ointArray1;
       }
       if (ta.d == null) {
          ointArray1 = new int[10];
          ta.d = ointArray1;
       }
       ta.e = false;
       d = ta.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (this.a.c).length();
          if (this.a.k != null) {
             int i6 = 0;
             while (true) {
                LogoApplication k2 = this.a.k;
                if (k2.length > 3) {
                   i1 = 3;
                label_013f :
                   if (i6 < i1) {
                      k2[i6] = 3;
                      i6 = i6 + 1;
                   }
                }else {
                   i1 = k2.length;
                   goto label_013f ;
                }
             }
          }
          LogoApplication$a ta2 = this.a;
          ta2.e = ta2.e ^ true;
          ta2.e = false;
          ta2.c = this.a.c+i2;
          if (this.a.d != null) {
             i2 = 0;
             while (true) {
                k = this.a.d;
                if (k.length > 3) {
                   i = 3;
                label_0175 :
                   if (i2 < i) {
                      k[i2] = 5;
                      i2++;
                   }
                }else {
                   i = k.length;
                   goto label_0175 ;
                }
             }
          }
          if (this.a.i.size() < 1) {
             this.a.i.add(" than ");
          }
          d = this.a.i;
          if (d != null && d.size() > 0) {
             this.a.i.remove(0);
          }
       }
    label_01a0 :
       ta = this.a;
       k = ta.g;
       if (k != null) {
          k[0] = 0;
       }
       k = ta.d;
       if (k != null) {
          k[2] = 3;
       }
       d = ta.k;
       if (d != null) {
          d[5] = 2;
       }
       return;
    }
    public void onConversionDataFail(String p0){
       int[] ointArray;
       int i2;
       int i4;
       LogoApplication d1;
       int i5;
       int[] ointArray1;
       LogoApplication$a uoa = this;
       LogoApplication$a a = uoa.a;
       LogoApplication k = a.k;
       int i = 9;
       if (k != null) {
          k[3] = i;
       }
       k = a.d;
       int i1 = 8;
       if (k != null) {
          k[i1] = 0;
       }
       if (a.i == null) {
          a.i = new ArrayList();
       }
       a = uoa.a;
       String str = ";paddingStart";
       a.c = str;
       a.e = true;
       if (a.k == null) {
          ointArray = new int[10];
          a.k = ointArray;
       }
       if (a.d == null) {
          ointArray = new int[10];
          a.d = ointArray;
       }
       a.e = false;
       LogoApplication d = a.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (uoa.a.c).length();
          if (uoa.a.k != null) {
             int i3 = 0;
             while (true) {
                LogoApplication k1 = uoa.a.k;
                if (k1.length > 3) {
                   i4 = 3;
                label_006c :
                   if (i3 < i4) {
                      k1[i3] = 3;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = k1.length;
                   goto label_006c ;
                }
             }
          }
          LogoApplication$a a1 = uoa.a;
          a1.e = a1.e ^ true;
          a1.e = false;
          a1.c = uoa.a.c+i2;
          if (uoa.a.d != null) {
             i2 = 0;
             while (true) {
                d1 = uoa.a.d;
                if (d1.length > 3) {
                   i5 = 3;
                label_00a2 :
                   if (i2 < i5) {
                      d1[i2] = 5;
                      i2 = i2 + 1;
                   }
                }else {
                   i5 = d1.length;
                   goto label_00a2 ;
                }
             }
          }
          if (uoa.a.i.size() < 1) {
             uoa.a.i.add(" than ");
          }
          d = uoa.a.i;
          if (d != null && d.size() > 0) {
             uoa.a.i.remove(0);
          }
       }
    label_00cd :
       a = uoa.a;
       d1 = a.g;
       if (d1 != null) {
          d1[0] = 0;
       }
       d1 = a.d;
       if (d1 != null) {
          d1[2] = 3;
       }
       d1 = a.k;
       if (d1 != null) {
          d1[5] = 2;
       }
       LogoApplication.d(a, "onConversionDataFail "+p0);
       a = uoa.a;
       d1 = a.k;
       if (d1 != null) {
          d1[3] = i;
       }
       d1 = a.d;
       if (d1 != null) {
          d1[i1] = 0;
       }
       if (a.i == null) {
          a.i = new ArrayList();
       }
       a = uoa.a;
       a.c = str;
       a.e = true;
       if (a.k == null) {
          ointArray1 = new int[10];
          a.k = ointArray1;
       }
       if (a.d == null) {
          ointArray1 = new int[10];
          a.d = ointArray1;
       }
       a.e = false;
       d = a.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (uoa.a.c).length();
          if (uoa.a.k != null) {
             int i6 = 0;
             while (true) {
                LogoApplication k2 = uoa.a.k;
                if (k2.length > 3) {
                   i1 = 3;
                label_0152 :
                   if (i6 < i1) {
                      k2[i6] = 3;
                      i6 = i6 + 1;
                   }
                }else {
                   i1 = k2.length;
                   goto label_0152 ;
                }
             }
          }
          LogoApplication$a a2 = uoa.a;
          a2.e = a2.e ^ true;
          a2.e = false;
          a2.c = uoa.a.c+i2;
          if (uoa.a.d != null) {
             i2 = 0;
             while (true) {
                k = uoa.a.d;
                if (k.length > 3) {
                   i = 3;
                label_0188 :
                   if (i2 < i) {
                      k[i2] = 5;
                      i2 = i2 + 1;
                   }
                }else {
                   i = k.length;
                   goto label_0188 ;
                }
             }
          }
          if (uoa.a.i.size() < 1) {
             uoa.a.i.add(" than ");
          }
          d = uoa.a.i;
          if (d != null && d.size() > 0) {
             uoa.a.i.remove(0);
          }
       }
    label_01b3 :
       a = uoa.a;
       k = a.g;
       if (k != null) {
          k[0] = 0;
       }
       k = a.d;
       if (k != null) {
          k[2] = 3;
       }
       d = a.k;
       if (d != null) {
          d[5] = 2;
       }
       return;
    }
    public void onConversionDataSuccess(Map p0){
       int[] ointArray;
       int i2;
       int i4;
       LogoApplication d1;
       int i5;
       int[] ointArray1;
       LogoApplication$a ta = this.a;
       LogoApplication k = ta.k;
       int i = 9;
       if (k != null) {
          k[3] = i;
       }
       k = ta.d;
       int i1 = 8;
       if (k != null) {
          k[i1] = 0;
       }
       if (ta.i == null) {
          ta.i = new ArrayList();
       }
       ta = this.a;
       String str = ";paddingStart";
       ta.c = str;
       ta.e = true;
       if (ta.k == null) {
          ointArray = new int[10];
          ta.k = ointArray;
       }
       if (ta.d == null) {
          ointArray = new int[10];
          ta.d = ointArray;
       }
       ta.e = false;
       LogoApplication d = ta.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (this.a.c).length();
          if (this.a.k != null) {
             int i3 = 0;
             while (true) {
                LogoApplication k1 = this.a.k;
                if (k1.length > 3) {
                   i4 = 3;
                label_006a :
                   if (i3 < i4) {
                      k1[i3] = 3;
                      i3 = i3 + 1;
                   }
                }else {
                   i4 = k1.length;
                   goto label_006a ;
                }
             }
          }
          LogoApplication$a ta1 = this.a;
          ta1.e = ta1.e ^ true;
          ta1.e = false;
          ta1.c = this.a.c+i2;
          if (this.a.d != null) {
             i2 = 0;
             while (true) {
                d1 = this.a.d;
                if (d1.length > 3) {
                   i5 = 3;
                label_00a0 :
                   if (i2 < i5) {
                      d1[i2] = 5;
                      i2++;
                   }
                }else {
                   i5 = d1.length;
                   goto label_00a0 ;
                }
             }
          }
          if (this.a.i.size() < 1) {
             this.a.i.add(" than ");
          }
          d = this.a.i;
          if (d != null && d.size() > 0) {
             this.a.i.remove(0);
          }
       }
    label_00cb :
       ta = this.a;
       d1 = ta.g;
       if (d1 != null) {
          d1[0] = 0;
       }
       d1 = ta.d;
       if (d1 != null) {
          d1[2] = 3;
       }
       d1 = ta.k;
       if (d1 != null) {
          d1[5] = 2;
       }
       LogoApplication.d(ta, "onConversionDataSuccess");
       ta = this.a;
       d1 = ta.k;
       if (d1 != null) {
          d1[3] = i;
       }
       d1 = ta.d;
       if (d1 != null) {
          d1[i1] = 0;
       }
       if (ta.i == null) {
          ta.i = new ArrayList();
       }
       ta = this.a;
       ta.c = str;
       ta.e = true;
       if (ta.k == null) {
          ointArray1 = new int[10];
          ta.k = ointArray1;
       }
       if (ta.d == null) {
          ointArray1 = new int[10];
          ta.d = ointArray1;
       }
       ta.e = false;
       d = ta.d;
       if (d != null) {
          d[i] = 7;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i2 = (this.a.c).length();
          if (this.a.k != null) {
             int i6 = 0;
             while (true) {
                LogoApplication k2 = this.a.k;
                if (k2.length > 3) {
                   i1 = 3;
                label_013f :
                   if (i6 < i1) {
                      k2[i6] = 3;
                      i6 = i6 + 1;
                   }
                }else {
                   i1 = k2.length;
                   goto label_013f ;
                }
             }
          }
          LogoApplication$a ta2 = this.a;
          ta2.e = ta2.e ^ true;
          ta2.e = false;
          ta2.c = this.a.c+i2;
          if (this.a.d != null) {
             i2 = 0;
             while (true) {
                k = this.a.d;
                if (k.length > 3) {
                   i = 3;
                label_0175 :
                   if (i2 < i) {
                      k[i2] = 5;
                      i2++;
                   }
                }else {
                   i = k.length;
                   goto label_0175 ;
                }
             }
          }
          if (this.a.i.size() < 1) {
             this.a.i.add(" than ");
          }
          d = this.a.i;
          if (d != null && d.size() > 0) {
             this.a.i.remove(0);
          }
       }
    label_01a0 :
       ta = this.a;
       k = ta.g;
       if (k != null) {
          k[0] = 0;
       }
       k = ta.d;
       if (k != null) {
          k[2] = 3;
       }
       d = ta.k;
       if (d != null) {
          d[5] = 2;
       }
       return;
    }
}
