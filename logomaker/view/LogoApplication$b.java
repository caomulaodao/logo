package com.logomaster.logomaker.LogoApplication$b;
import com.facebook.applinks.AppLinkData$CompletionHandler;
import com.logomaster.logomaker.LogoApplication;
import java.lang.Object;
import com.facebook.applinks.AppLinkData;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.lang.StringBuilder;
import com.logomaster.logomaker.config.BaseLogoApplication;
import com.appsflyer.AppsFlyerLib;
import android.content.Context;
import android.app.Application;
import java.util.Map;
import java.lang.Exception;

public class LogoApplication$b implements AppLinkData$CompletionHandler	// class@000c5b
{
    public final LogoApplication a;

    public void LogoApplication$b(LogoApplication p0){
       this.a = p0;
       super();
    }
    public void onDeferredAppLinkDataFetched(AppLinkData p0){
       int[] ointArray;
       int i5;
       int i6;
       LogoApplication k1;
       LogoApplication d1;
       int[] ointArray1;
       LogoApplication d2;
       LogoApplication k2;
       LogoApplication$b a3;
       LogoApplication d3;
       int[] ointArray2;
       int[] ointArray3;
       LogoApplication d4;
       int i7;
       Map map;
       int i8;
       LogoApplication$b uob = this;
       LogoApplication$b obj = p0;
       LogoApplication$b a = uob.a;
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
       a = uob.a;
       String str = ";paddingStart";
       a.c = str;
       a.e = true;
       int i2 = 10;
       if (a.k == null) {
          ointArray = new int[i2];
          a.k = ointArray;
       }
       if (a.d == null) {
          ointArray = new int[i2];
          a.d = ointArray;
       }
       a.e = false;
       LogoApplication d = a.d;
       int i3 = 7;
       if (d != null) {
          d[i] = i3;
       }
       int i4 = 4;
       if (d != null) {
          d[i4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (uob.a.c).length();
          if (uob.a.k != null) {
             i6 = 0;
             while (true) {
                k1 = uob.a.k;
                if (k1.length > 3) {
                   i4 = 3;
                label_006e :
                   if (i6 < i4) {
                      k1[i6] = 3;
                      i6 = i6 + 1;
                      i4 = 4;
                   }
                }else {
                   i4 = k1.length;
                   goto label_006e ;
                }
             }
          }
          LogoApplication$b a1 = uob.a;
          a1.e = a1.e ^ true;
          a1.e = false;
          a1.c = uob.a.c+i5;
          if (uob.a.d != null) {
             i5 = 0;
             while (true) {
                d1 = uob.a.d;
                if (d1.length > 3) {
                   i6 = 3;
                label_00a5 :
                   if (i5 < i6) {
                      d1[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i6 = d1.length;
                   goto label_00a5 ;
                }
             }
          }
          if (uob.a.i.size() < 1) {
             uob.a.i.add(" than ");
          }
          d = uob.a.i;
          if (d != null && d.size() > 0) {
             uob.a.i.remove(0);
          }
       }
    label_00d0 :
       a = uob.a;
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
       LogoApplication.d(a, "appLinkData:"+obj);
       a = uob.a;
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
       a = uob.a;
       a.c = str;
       a.e = true;
       if (a.k == null) {
          ointArray1 = new int[i2];
          a.k = ointArray1;
       }
       if (a.d == null) {
          ointArray1 = new int[i2];
          a.d = ointArray1;
       }
       a.e = false;
       d = a.d;
       if (d != null) {
          d[i] = i3;
       }
       if (d != null) {
          d[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i5 = (uob.a.c).length();
          if (uob.a.k != null) {
             i4 = 0;
             while (true) {
                k1 = uob.a.k;
                if (k1.length > 3) {
                   i3 = 3;
                label_0154 :
                   if (i4 < i3) {
                      k1[i4] = 3;
                      i4 = i4 + 1;
                      i3 = 7;
                   }
                }else {
                   i3 = k1.length;
                   goto label_0154 ;
                }
             }
          }
          LogoApplication$b a2 = uob.a;
          a2.e = a2.e ^ true;
          a2.e = false;
          a2.c = uob.a.c+i5;
          if (uob.a.d != null) {
             i5 = 0;
             while (true) {
                d2 = uob.a.d;
                if (d2.length > 3) {
                   i4 = 3;
                label_018b :
                   if (i5 < i4) {
                      d2[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i4 = d2.length;
                   goto label_018b ;
                }
             }
          }
          if (uob.a.i.size() < 1) {
             uob.a.i.add(" than ");
          }
          d = uob.a.i;
          if (d != null && d.size() > 0) {
             uob.a.i.remove(0);
          }
       }
    label_01b6 :
       a = uob.a;
       d2 = a.g;
       if (d2 != null) {
          d2[0] = 0;
       }
       d2 = a.d;
       if (d2 != null) {
          d2[2] = 3;
       }
       d2 = a.k;
       if (d2 != null) {
          d2[5] = 2;
       }
       String str1 = "LoGoData";
       LogoApplication.f(a, so.a(str1, 0).b("lo_f"));
       a = uob.a;
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
       a = uob.a;
       a.c = str;
       a.e = true;
       if (a.k == null) {
          ointArray1 = new int[i2];
          a.k = ointArray1;
       }
       if (a.d == null) {
          ointArray1 = new int[i2];
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
          i5 = (uob.a.c).length();
          if (uob.a.k != null) {
             i4 = 0;
             while (true) {
                k2 = uob.a.k;
                if (k2.length > 3) {
                   i1 = 3;
                label_0235 :
                   if (i4 < i1) {
                      k2[i4] = 3;
                      i4 = i4 + 1;
                      i1 = 8;
                   }
                }else {
                   i1 = k2.length;
                   goto label_0235 ;
                }
             }
          }
          a3 = uob.a;
          a3.e = a3.e ^ true;
          a3.e = false;
          a3.c = uob.a.c+i5;
          if (uob.a.d != null) {
             i5 = 0;
             while (true) {
                d3 = uob.a.d;
                if (d3.length > 3) {
                   i2 = 3;
                label_026d :
                   if (i5 < i2) {
                      d3[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i2 = d3.length;
                   goto label_026d ;
                }
             }
          }
          if (uob.a.i.size() < 1) {
             uob.a.i.add(" than ");
          }
          d = uob.a.i;
          if (d != null && d.size() > 0) {
             uob.a.i.remove(0);
          }
       }
    label_0298 :
       a = uob.a;
       d3 = a.g;
       if (d3 != null) {
          d3[0] = 0;
       }
       d3 = a.d;
       if (d3 != null) {
          d3[2] = 3;
       }
       d3 = a.k;
       if (d3 != null) {
          d3[5] = 2;
       }
       LogoApplication.d(a, "startF:"+LogoApplication.e(uob.a));
       a = uob.a;
       d3 = a.k;
       if (d3 != null) {
          d3[3] = i;
       }
       d3 = a.d;
       if (d3 != null) {
          d3[8] = 0;
       }
       if (a.i == null) {
          a.i = new ArrayList();
       }
       a = uob.a;
       a.c = str;
       a.e = true;
       if (a.k == null) {
          i1 = 10;
          ointArray2 = new int[i1];
          a.k = ointArray2;
       }else {
          i1 = 10;
       }
       if (a.d == null) {
          ointArray2 = new int[i1];
          a.d = ointArray2;
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
          i5 = (uob.a.c).length();
          if (uob.a.k != null) {
             i1 = 0;
             while (true) {
                k2 = uob.a.k;
                if (k2.length > 3) {
                   i4 = 3;
                label_0329 :
                   if (i1 < i4) {
                      k2[i1] = 3;
                      i1 = i1 + 1;
                   }
                }else {
                   i4 = k2.length;
                   goto label_0329 ;
                }
             }
          }
          a3 = uob.a;
          a3.e = a3.e ^ true;
          a3.e = false;
          a3.c = uob.a.c+i5;
          if (uob.a.d != null) {
             i5 = 0;
             while (true) {
                d3 = uob.a.d;
                if (d3.length > 3) {
                   i2 = 3;
                label_035f :
                   if (i5 < i2) {
                      d3[i5] = 5;
                      i5 = i5 + 1;
                   }
                }else {
                   i2 = d3.length;
                   goto label_035f ;
                }
             }
          }
          if (uob.a.i.size() < 1) {
             uob.a.i.add(" than ");
          }
          d = uob.a.i;
          if (d != null && d.size() > 0) {
             uob.a.i.remove(0);
          }
       }
    label_038a :
       a = uob.a;
       d3 = a.g;
       if (d3 != null) {
          d3[0] = 0;
       }
       d3 = a.d;
       if (d3 != null) {
          d3[2] = 3;
       }
       d3 = a.k;
       if (d3 != null) {
          d3[5] = 2;
       }
       if (obj != null && LogoApplication.e(a) <= 0) {
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i2 = 3;
                   label_0409 :
                      if (i5 < i2) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i2 = d3.length;
                      goto label_0409 ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_043f :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_043f ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_046a :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d = obj.k;
          if (d != null) {
             d[5] = 2;
          }
          obj.loadFConfig();
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i2 = 3;
                   label_04e4 :
                      if (i5 < i2) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i2 = d3.length;
                      goto label_04e4 ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_051a :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_051a ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_0545 :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d3 = obj.k;
          if (d3 != null) {
             d3[5] = 2;
          }
          try{
             map = null;
             if (d3 != null) {
                d3[3] = i;
             label_0562 :
                if (d != null) {
                   d[8] = 0;
                }
                if (obj.i == null) {
                   obj.i = new ArrayList();
                }
                obj = uob.a;
                obj.c = str;
                obj.e = true;
                if (obj.k == null) {
                   ointArray3 = new int[10];
                   obj.k = ointArray3;
                }
                if (obj.d == null) {
                   ointArray3 = new int[10];
                   obj.d = ointArray3;
                }
                obj.e = false;
                d4 = obj.d;
                if (d4 != null) {
                   d4[i] = 7;
                }
                if (d4 != null) {
                   d4[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i7 = (uob.a.c).length();
                   if (uob.a.k != null) {
                      i5 = 0;
                      while (true) {
                         d3 = uob.a.k;
                         if (d3.length > 3) {
                            i4 = 3;
                         label_05ba :
                            if (i5 < i4) {
                               d3[i5] = 3;
                               i5 = i5 + 1;
                            }
                         }else {
                            i4 = d3.length;
                            goto label_05ba ;
                         }
                      }
                   }
                   a = uob.a;
                   i1 = (a.e == null)? true: 0;
                   a.e = i1;
                   a.e = false;
                   a.c = uob.a.c+i7;
                   if (uob.a.d != null) {
                      i7 = 0;
                      while (true) {
                         d = uob.a.d;
                         if (d.length > 3) {
                            i1 = 3;
                         label_05f4 :
                            if (i7 < i1) {
                               d[i7] = 5;
                               i7 = i7 + 1;
                            }
                         }else {
                            i1 = d.length;
                            goto label_05f4 ;
                         }
                      }
                   }
                   if (uob.a.i.size() < 1) {
                      uob.a.i.add(" than ");
                   }
                   d4 = uob.a.i;
                   if (d4 != null && d4.size() > 0) {
                      uob.a.i.remove(0);
                   }
                }
             label_061f :
                obj = uob.a;
                d = obj.g;
                if (d != null) {
                   d[0] = 0;
                }
                d = obj.d;
                if (d != null) {
                   d[2] = 3;
                }
                d4 = obj.k;
                if (d4 != null) {
                   d4[5] = 2;
                }
                AppsFlyerLib.getInstance().logEvent(uob.a.getApplicationContext(), "main_a", map);
                obj = uob.a;
                d = obj.k;
                if (d != null) {
                   d[3] = i;
                }
                d = obj.d;
                if (d != null) {
                   d[8] = 0;
                }
                if (obj.i == null) {
                   obj.i = new ArrayList();
                }
                obj = uob.a;
                obj.c = str;
                obj.e = true;
                if (obj.k == null) {
                   ointArray3 = new int[10];
                   obj.k = ointArray3;
                }
                if (obj.d == null) {
                   ointArray3 = new int[10];
                   obj.d = ointArray3;
                }
                obj.e = false;
                d4 = obj.d;
                if (d4 != null) {
                   d4[i] = 7;
                }
                if (d4 != null) {
                   d4[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i7 = (uob.a.c).length();
                   if (uob.a.k != null) {
                      i5 = 0;
                      while (true) {
                         d3 = uob.a.k;
                         if (d3.length > 3) {
                            i4 = 3;
                         label_06a4 :
                            if (i5 < i4) {
                               d3[i5] = 3;
                               i5 = i5 + 1;
                            }
                         }else {
                            i4 = d3.length;
                            goto label_06a4 ;
                         }
                      }
                   }
                   a = uob.a;
                   i1 = (a.e == null)? true: 0;
                   a.e = i1;
                   a.e = false;
                   a.c = uob.a.c+i7;
                   if (uob.a.d != null) {
                      i7 = 0;
                      while (true) {
                         d = uob.a.d;
                         if (d.length > 3) {
                            i1 = 3;
                         label_06de :
                            if (i7 < i1) {
                               d[i7] = 5;
                               i7 = i7 + 1;
                            }
                         }else {
                            i1 = d.length;
                            goto label_06de ;
                         }
                      }
                   }
                   if (uob.a.i.size() < 1) {
                      uob.a.i.add(" than ");
                   }
                   d4 = uob.a.i;
                   if (d4 != null && d4.size() > 0) {
                      uob.a.i.remove(0);
                   }
                }
             label_0709 :
                obj = uob.a;
                d = obj.g;
                if (d != null) {
                   d[0] = 0;
                }
                d = obj.d;
                if (d != null) {
                   d[2] = 3;
                }
                d4 = obj.k;
                if (d4 != null) {
                   d4[5] = 2;
                }
             }else {
                goto label_0562 ;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i4 = 3;
                   label_0784 :
                      if (i5 < i4) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i4 = d3.length;
                      goto label_0784 ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_07ba :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_07ba ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_07e5 :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d4 = obj.k;
          if (d4 != null) {
             d4[5] = 2;
          }
          try{
             AppsFlyerLib.getInstance().logEvent(uob.a.getApplicationContext(), "A_Cyclone_A", map);
             obj = uob.a;
             d = obj.k;
             if (d != null) {
                d[3] = i;
             label_0810 :
                d = obj.d;
                if (d != null) {
                   d[8] = 0;
                }
                if (obj.i == null) {
                   obj.i = new ArrayList();
                }
                obj = uob.a;
                obj.c = str;
                obj.e = true;
                if (obj.k == null) {
                   ointArray3 = new int[10];
                   obj.k = ointArray3;
                }
                if (obj.d == null) {
                   ointArray3 = new int[10];
                   obj.d = ointArray3;
                }
                obj.e = false;
                d4 = obj.d;
                if (d4 != null) {
                   d4[i] = 7;
                }
                if (d4 != null) {
                   d4[4] = true;
                }
                if (!TextUtils.isEmpty(str)) {
                   i7 = (uob.a.c).length();
                   if (uob.a.k != null) {
                      i5 = 0;
                      while (true) {
                         d3 = uob.a.k;
                         if (d3.length > 3) {
                            i2 = 3;
                         label_086a :
                            if (i5 < i2) {
                               d3[i5] = 3;
                               i5 = i5 + 1;
                            }
                         }else {
                            i2 = d3.length;
                            goto label_086a ;
                         }
                      }
                   }
                   a = uob.a;
                   i1 = (a.e == null)? true: 0;
                   a.e = i1;
                   a.e = false;
                   a.c = uob.a.c+i7;
                   if (uob.a.d != null) {
                      i7 = 0;
                      while (true) {
                         d = uob.a.d;
                         if (d.length > 3) {
                            i1 = 3;
                         label_08a4 :
                            if (i7 < i1) {
                               d[i7] = 5;
                               i7 = i7 + 1;
                            }
                         }else {
                            i1 = d.length;
                            goto label_08a4 ;
                         }
                      }
                   }
                   if (uob.a.i.size() < 1) {
                      uob.a.i.add(" than ");
                   }
                   d4 = uob.a.i;
                   if (d4 != null && d4.size() > 0) {
                      uob.a.i.remove(0);
                   }
                }
             label_08cf :
                obj = uob.a;
                d = obj.g;
                if (d != null) {
                   d[0] = 0;
                }
                d = obj.d;
                if (d != null) {
                   d[2] = 3;
                }
                d4 = obj.k;
                if (d4 != null) {
                   d4[5] = 2;
                }
             }else {
                goto label_0810 ;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i2 = 3;
                   label_094b :
                      if (i5 < i2) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i2 = d3.length;
                      goto label_094b ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_0981 :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_0981 ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_09ac :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d4 = obj.k;
          if (d4 != null) {
             d4[5] = 2;
          }
          so.a(str1, 0).e("lo_f", 1000);
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i3 = 3;
                   label_0a2c :
                      if (i5 < i3) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = d3.length;
                      goto label_0a2c ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_0a62 :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_0a62 ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_0a8d :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d4 = obj.k;
          if (d4 != null) {
             d4[5] = 2;
          }
       }else {
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i3 = 3;
                   label_0b06 :
                      if (i5 < i3) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = d3.length;
                      goto label_0b06 ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_0b3c :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_0b3c ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_0b67 :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d = obj.k;
          if (d != null) {
             d[5] = 2;
          }
          LogoApplication.g(obj);
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i3 = 3;
                   label_0be1 :
                      if (i5 < i3) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = d3.length;
                      goto label_0be1 ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_0c17 :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_0c17 ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_0c42 :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d = obj.k;
          if (d != null) {
             d[5] = 2;
          }
          LogoApplication.h(obj, 0);
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i3 = 3;
                   label_0cbc :
                      if (i5 < i3) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = d3.length;
                      goto label_0cbc ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_0cf2 :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_0cf2 ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_0d1d :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d = obj.k;
          if (d != null) {
             d[5] = 2;
          }
          LogoApplication.i(obj);
          obj = uob.a;
          d = obj.k;
          if (d != null) {
             d[3] = i;
          }
          d = obj.d;
          if (d != null) {
             d[8] = 0;
          }
          if (obj.i == null) {
             obj.i = new ArrayList();
          }
          obj = uob.a;
          obj.c = str;
          obj.e = true;
          if (obj.k == null) {
             i5 = 10;
             ointArray3 = new int[i5];
             obj.k = ointArray3;
          }else {
             i5 = 10;
          }
          if (obj.d == null) {
             ointArray3 = new int[i5];
             obj.d = ointArray3;
          }
          obj.e = false;
          d4 = obj.d;
          if (d4 != null) {
             d4[i] = 7;
          }
          if (d4 != null) {
             d4[4] = true;
          }
          if (!TextUtils.isEmpty(str)) {
             i7 = (uob.a.c).length();
             if (uob.a.k != null) {
                i5 = 0;
                while (true) {
                   d3 = uob.a.k;
                   if (d3.length > 3) {
                      i3 = 3;
                   label_0d97 :
                      if (i5 < i3) {
                         d3[i5] = 3;
                         i5 = i5 + 1;
                      }
                   }else {
                      i3 = d3.length;
                      goto label_0d97 ;
                   }
                }
             }
             a = uob.a;
             a.e = a.e ^ true;
             a.e = false;
             a.c = uob.a.c+i7;
             if (uob.a.d != null) {
                i7 = 0;
                while (true) {
                   d = uob.a.d;
                   if (d.length > 3) {
                      i1 = 3;
                   label_0dcd :
                      if (i7 < i1) {
                         d[i7] = 5;
                         i7 = i7 + 1;
                      }
                   }else {
                      i1 = d.length;
                      goto label_0dcd ;
                   }
                }
             }
             if (uob.a.i.size() < 1) {
                uob.a.i.add(" than ");
             }
             d4 = uob.a.i;
             if (d4 != null && d4.size() > 0) {
                uob.a.i.remove(0);
             }
          }
       label_0df8 :
          obj = uob.a;
          d = obj.g;
          if (d != null) {
             d[0] = 0;
          }
          d = obj.d;
          if (d != null) {
             d[2] = 3;
          }
          d4 = obj.k;
          if (d4 != null) {
             d4[5] = 2;
          }
       }
       obj = uob.a;
       d = obj.k;
       if (d != null) {
          d[3] = i;
       }
       d = obj.d;
       if (d != null) {
          d[8] = 0;
       }
       if (obj.i == null) {
          obj.i = new ArrayList();
       }
       obj = uob.a;
       obj.c = str;
       obj.e = true;
       if (obj.k == null) {
          i5 = 10;
          ointArray3 = new int[i5];
          obj.k = ointArray3;
       }else {
          i5 = 10;
       }
       if (obj.d == null) {
          int[] ointArray4 = new int[i5];
          obj.d = ointArray4;
       }
       obj.e = false;
       d4 = obj.d;
       if (d4 != null) {
          d4[i] = 7;
       }
       if (d4 != null) {
          d4[4] = true;
       }
       if (!TextUtils.isEmpty(str)) {
          i7 = (uob.a.c).length();
          if (uob.a.k != null) {
             i5 = 0;
             while (true) {
                k = uob.a.k;
                if (k.length > 3) {
                   i = 3;
                label_0e6f :
                   if (i5 < i) {
                      k[i5] = 3;
                      i5 = i5 + 1;
                   }
                }else {
                   i = k.length;
                   goto label_0e6f ;
                }
             }
          }
          a = uob.a;
          a.e = a.e ^ true;
          a.e = false;
          a.c = uob.a.c+i7;
          if (uob.a.d != null) {
             i7 = 0;
             while (true) {
                d = uob.a.d;
                if (d.length > 3) {
                   i8 = 3;
                label_0ea5 :
                   if (i7 < i8) {
                      d[i7] = 5;
                      i7 = i7 + 1;
                   }
                }else {
                   i8 = d.length;
                   goto label_0ea5 ;
                }
             }
          }
          if (uob.a.i.size() < 1) {
             uob.a.i.add(" than ");
          }
          d4 = uob.a.i;
          if (d4 != null && d4.size() > 0) {
             uob.a.i.remove(0);
          }
       }
    label_0ed0 :
       obj = uob.a;
       d = obj.g;
       if (d != null) {
          d[0] = 0;
       }
       d = obj.d;
       if (d != null) {
          d[2] = 3;
       }
       d4 = obj.k;
       if (d4 != null) {
          d4[5] = 2;
       }
       return;
    }
}
