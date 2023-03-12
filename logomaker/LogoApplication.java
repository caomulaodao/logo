package com.logomaster.logomaker;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;
import com.logomaster.logomaker.LogoApplication;
import com.logomaster.logomaker.config.BaseLogoApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class LogoApplication extends BaseLogoApplication {

    /* renamed from: o */
    public static LogoApplication f15639o;

    /* renamed from: h */
    public List<Activity> f15646h;

    /* renamed from: b */
    public String f15640b = "nd charac";

    /* renamed from: c */
    public String f15641c = "      andr";

    /* renamed from: d */
    public int[] f15642d = new int[13];

    /* renamed from: e */
    public boolean f15643e = false;

    /* renamed from: f */
    public double f15644f = 0.4530334257820854d;

    /* renamed from: g */
    public int[] f15645g = new int[18];

    /* renamed from: i */
    public ArrayList<String> f15647i = new ArrayList<>();

    /* renamed from: j */
    public double f15648j = 0.7341404772185105d;

    /* renamed from: k */
    public int[] f15649k = new int[15];

    /* renamed from: l */
    public boolean f15650l = false;

    /* renamed from: m */
    public int f15651m = 1;

    /* renamed from: n */
    public int f15652n = 0;

    /* renamed from: com.logomaster.logomaker.LogoApplication$a */
    /* loaded from: classes3.dex */
    public class C9438a implements AppsFlyerConversionListener {
        public C9438a() {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAppOpenAttribution(Map<String, String> map) {
            LogoApplication logoApplication = LogoApplication.this;
            int[] iArr = logoApplication.f15649k;
            if (iArr != null) {
                iArr[3] = 9;
            }
            int[] iArr2 = logoApplication.f15642d;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            if (logoApplication.f15647i == null) {
                logoApplication.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication2 = LogoApplication.this;
            logoApplication2.f15641c = ";paddingStart";
            logoApplication2.f15643e = true;
            if (logoApplication2.f15649k == null) {
                logoApplication2.f15649k = new int[10];
            }
            if (logoApplication2.f15642d == null) {
                logoApplication2.f15642d = new int[10];
            }
            logoApplication2.f15643e = false;
            int[] iArr3 = logoApplication2.f15642d;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (iArr3 != null) {
                iArr3[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr4 = LogoApplication.this.f15649k;
                        if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i] = 3;
                        i++;
                    }
                }
                LogoApplication logoApplication3 = LogoApplication.this;
                logoApplication3.f15643e = !logoApplication3.f15643e;
                logoApplication3.f15643e = false;
                logoApplication3.f15641c = LogoApplication.this.f15641c + length;
                if (LogoApplication.this.f15642d != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr5 = LogoApplication.this.f15642d;
                        if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i2] = 5;
                        i2++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList = LogoApplication.this.f15647i;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication4 = LogoApplication.this;
            int[] iArr6 = logoApplication4.f15645g;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
            int[] iArr7 = logoApplication4.f15642d;
            if (iArr7 != null) {
                iArr7[2] = 3;
            }
            int[] iArr8 = logoApplication4.f15649k;
            if (iArr8 != null) {
                iArr8[5] = 2;
            }
            logoApplication4.m9237o("onAppOpenAttribution");
            LogoApplication logoApplication5 = LogoApplication.this;
            int[] iArr9 = logoApplication5.f15649k;
            if (iArr9 != null) {
                iArr9[3] = 9;
            }
            int[] iArr10 = logoApplication5.f15642d;
            if (iArr10 != null) {
                iArr10[8] = 0;
            }
            if (logoApplication5.f15647i == null) {
                logoApplication5.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication6 = LogoApplication.this;
            logoApplication6.f15641c = ";paddingStart";
            logoApplication6.f15643e = true;
            if (logoApplication6.f15649k == null) {
                logoApplication6.f15649k = new int[10];
            }
            if (logoApplication6.f15642d == null) {
                logoApplication6.f15642d = new int[10];
            }
            logoApplication6.f15643e = false;
            int[] iArr11 = logoApplication6.f15642d;
            if (iArr11 != null) {
                iArr11[9] = 7;
            }
            if (iArr11 != null) {
                iArr11[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr12 = LogoApplication.this.f15649k;
                        if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i3] = 3;
                        i3++;
                    }
                }
                LogoApplication logoApplication7 = LogoApplication.this;
                logoApplication7.f15643e = !logoApplication7.f15643e;
                logoApplication7.f15643e = false;
                logoApplication7.f15641c = LogoApplication.this.f15641c + length2;
                if (LogoApplication.this.f15642d != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr13 = LogoApplication.this.f15642d;
                        if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i4] = 5;
                        i4++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList2 = LogoApplication.this.f15647i;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication8 = LogoApplication.this;
            int[] iArr14 = logoApplication8.f15645g;
            if (iArr14 != null) {
                iArr14[0] = 0;
            }
            int[] iArr15 = logoApplication8.f15642d;
            if (iArr15 != null) {
                iArr15[2] = 3;
            }
            int[] iArr16 = logoApplication8.f15649k;
            if (iArr16 != null) {
                iArr16[5] = 2;
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAttributionFailure(String str) {
            LogoApplication logoApplication = LogoApplication.this;
            int[] iArr = logoApplication.f15649k;
            if (iArr != null) {
                iArr[3] = 9;
            }
            int[] iArr2 = logoApplication.f15642d;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            if (logoApplication.f15647i == null) {
                logoApplication.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication2 = LogoApplication.this;
            logoApplication2.f15641c = ";paddingStart";
            logoApplication2.f15643e = true;
            if (logoApplication2.f15649k == null) {
                logoApplication2.f15649k = new int[10];
            }
            if (logoApplication2.f15642d == null) {
                logoApplication2.f15642d = new int[10];
            }
            logoApplication2.f15643e = false;
            int[] iArr3 = logoApplication2.f15642d;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (iArr3 != null) {
                iArr3[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr4 = LogoApplication.this.f15649k;
                        if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i] = 3;
                        i++;
                    }
                }
                LogoApplication logoApplication3 = LogoApplication.this;
                logoApplication3.f15643e = !logoApplication3.f15643e;
                logoApplication3.f15643e = false;
                logoApplication3.f15641c = LogoApplication.this.f15641c + length;
                if (LogoApplication.this.f15642d != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr5 = LogoApplication.this.f15642d;
                        if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i2] = 5;
                        i2++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList = LogoApplication.this.f15647i;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication4 = LogoApplication.this;
            int[] iArr6 = logoApplication4.f15645g;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
            int[] iArr7 = logoApplication4.f15642d;
            if (iArr7 != null) {
                iArr7[2] = 3;
            }
            int[] iArr8 = logoApplication4.f15649k;
            if (iArr8 != null) {
                iArr8[5] = 2;
            }
            logoApplication4.m9237o("onAttributionFailure");
            LogoApplication logoApplication5 = LogoApplication.this;
            int[] iArr9 = logoApplication5.f15649k;
            if (iArr9 != null) {
                iArr9[3] = 9;
            }
            int[] iArr10 = logoApplication5.f15642d;
            if (iArr10 != null) {
                iArr10[8] = 0;
            }
            if (logoApplication5.f15647i == null) {
                logoApplication5.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication6 = LogoApplication.this;
            logoApplication6.f15641c = ";paddingStart";
            logoApplication6.f15643e = true;
            if (logoApplication6.f15649k == null) {
                logoApplication6.f15649k = new int[10];
            }
            if (logoApplication6.f15642d == null) {
                logoApplication6.f15642d = new int[10];
            }
            logoApplication6.f15643e = false;
            int[] iArr11 = logoApplication6.f15642d;
            if (iArr11 != null) {
                iArr11[9] = 7;
            }
            if (iArr11 != null) {
                iArr11[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr12 = LogoApplication.this.f15649k;
                        if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i3] = 3;
                        i3++;
                    }
                }
                LogoApplication logoApplication7 = LogoApplication.this;
                logoApplication7.f15643e = !logoApplication7.f15643e;
                logoApplication7.f15643e = false;
                logoApplication7.f15641c = LogoApplication.this.f15641c + length2;
                if (LogoApplication.this.f15642d != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr13 = LogoApplication.this.f15642d;
                        if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i4] = 5;
                        i4++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList2 = LogoApplication.this.f15647i;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication8 = LogoApplication.this;
            int[] iArr14 = logoApplication8.f15645g;
            if (iArr14 != null) {
                iArr14[0] = 0;
            }
            int[] iArr15 = logoApplication8.f15642d;
            if (iArr15 != null) {
                iArr15[2] = 3;
            }
            int[] iArr16 = logoApplication8.f15649k;
            if (iArr16 != null) {
                iArr16[5] = 2;
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
            LogoApplication logoApplication = LogoApplication.this;
            int[] iArr = logoApplication.f15649k;
            if (iArr != null) {
                iArr[3] = 9;
            }
            int[] iArr2 = logoApplication.f15642d;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            if (logoApplication.f15647i == null) {
                logoApplication.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication2 = LogoApplication.this;
            logoApplication2.f15641c = ";paddingStart";
            logoApplication2.f15643e = true;
            if (logoApplication2.f15649k == null) {
                logoApplication2.f15649k = new int[10];
            }
            if (logoApplication2.f15642d == null) {
                logoApplication2.f15642d = new int[10];
            }
            logoApplication2.f15643e = false;
            int[] iArr3 = logoApplication2.f15642d;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (iArr3 != null) {
                iArr3[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr4 = LogoApplication.this.f15649k;
                        if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i] = 3;
                        i++;
                    }
                }
                LogoApplication logoApplication3 = LogoApplication.this;
                logoApplication3.f15643e = !logoApplication3.f15643e;
                logoApplication3.f15643e = false;
                logoApplication3.f15641c = LogoApplication.this.f15641c + length;
                if (LogoApplication.this.f15642d != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr5 = LogoApplication.this.f15642d;
                        if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i2] = 5;
                        i2++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList = LogoApplication.this.f15647i;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication4 = LogoApplication.this;
            int[] iArr6 = logoApplication4.f15645g;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
            int[] iArr7 = logoApplication4.f15642d;
            if (iArr7 != null) {
                iArr7[2] = 3;
            }
            int[] iArr8 = logoApplication4.f15649k;
            if (iArr8 != null) {
                iArr8[5] = 2;
            }
            logoApplication4.m9237o("onConversionDataFail " + str);
            LogoApplication logoApplication5 = LogoApplication.this;
            int[] iArr9 = logoApplication5.f15649k;
            if (iArr9 != null) {
                iArr9[3] = 9;
            }
            int[] iArr10 = logoApplication5.f15642d;
            if (iArr10 != null) {
                iArr10[8] = 0;
            }
            if (logoApplication5.f15647i == null) {
                logoApplication5.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication6 = LogoApplication.this;
            logoApplication6.f15641c = ";paddingStart";
            logoApplication6.f15643e = true;
            if (logoApplication6.f15649k == null) {
                logoApplication6.f15649k = new int[10];
            }
            if (logoApplication6.f15642d == null) {
                logoApplication6.f15642d = new int[10];
            }
            logoApplication6.f15643e = false;
            int[] iArr11 = logoApplication6.f15642d;
            if (iArr11 != null) {
                iArr11[9] = 7;
            }
            if (iArr11 != null) {
                iArr11[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr12 = LogoApplication.this.f15649k;
                        if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i3] = 3;
                        i3++;
                    }
                }
                LogoApplication logoApplication7 = LogoApplication.this;
                logoApplication7.f15643e = !logoApplication7.f15643e;
                logoApplication7.f15643e = false;
                logoApplication7.f15641c = LogoApplication.this.f15641c + length2;
                if (LogoApplication.this.f15642d != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr13 = LogoApplication.this.f15642d;
                        if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i4] = 5;
                        i4++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList2 = LogoApplication.this.f15647i;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication8 = LogoApplication.this;
            int[] iArr14 = logoApplication8.f15645g;
            if (iArr14 != null) {
                iArr14[0] = 0;
            }
            int[] iArr15 = logoApplication8.f15642d;
            if (iArr15 != null) {
                iArr15[2] = 3;
            }
            int[] iArr16 = logoApplication8.f15649k;
            if (iArr16 != null) {
                iArr16[5] = 2;
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
            LogoApplication logoApplication = LogoApplication.this;
            int[] iArr = logoApplication.f15649k;
            if (iArr != null) {
                iArr[3] = 9;
            }
            int[] iArr2 = logoApplication.f15642d;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            if (logoApplication.f15647i == null) {
                logoApplication.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication2 = LogoApplication.this;
            logoApplication2.f15641c = ";paddingStart";
            logoApplication2.f15643e = true;
            if (logoApplication2.f15649k == null) {
                logoApplication2.f15649k = new int[10];
            }
            if (logoApplication2.f15642d == null) {
                logoApplication2.f15642d = new int[10];
            }
            logoApplication2.f15643e = false;
            int[] iArr3 = logoApplication2.f15642d;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (iArr3 != null) {
                iArr3[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr4 = LogoApplication.this.f15649k;
                        if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i] = 3;
                        i++;
                    }
                }
                LogoApplication logoApplication3 = LogoApplication.this;
                logoApplication3.f15643e = !logoApplication3.f15643e;
                logoApplication3.f15643e = false;
                logoApplication3.f15641c = LogoApplication.this.f15641c + length;
                if (LogoApplication.this.f15642d != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr5 = LogoApplication.this.f15642d;
                        if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i2] = 5;
                        i2++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList = LogoApplication.this.f15647i;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication4 = LogoApplication.this;
            int[] iArr6 = logoApplication4.f15645g;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
            int[] iArr7 = logoApplication4.f15642d;
            if (iArr7 != null) {
                iArr7[2] = 3;
            }
            int[] iArr8 = logoApplication4.f15649k;
            if (iArr8 != null) {
                iArr8[5] = 2;
            }
            logoApplication4.m9237o("onConversionDataSuccess");
            LogoApplication logoApplication5 = LogoApplication.this;
            int[] iArr9 = logoApplication5.f15649k;
            if (iArr9 != null) {
                iArr9[3] = 9;
            }
            int[] iArr10 = logoApplication5.f15642d;
            if (iArr10 != null) {
                iArr10[8] = 0;
            }
            if (logoApplication5.f15647i == null) {
                logoApplication5.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication6 = LogoApplication.this;
            logoApplication6.f15641c = ";paddingStart";
            logoApplication6.f15643e = true;
            if (logoApplication6.f15649k == null) {
                logoApplication6.f15649k = new int[10];
            }
            if (logoApplication6.f15642d == null) {
                logoApplication6.f15642d = new int[10];
            }
            logoApplication6.f15643e = false;
            int[] iArr11 = logoApplication6.f15642d;
            if (iArr11 != null) {
                iArr11[9] = 7;
            }
            if (iArr11 != null) {
                iArr11[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr12 = LogoApplication.this.f15649k;
                        if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i3] = 3;
                        i3++;
                    }
                }
                LogoApplication logoApplication7 = LogoApplication.this;
                logoApplication7.f15643e = !logoApplication7.f15643e;
                logoApplication7.f15643e = false;
                logoApplication7.f15641c = LogoApplication.this.f15641c + length2;
                if (LogoApplication.this.f15642d != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr13 = LogoApplication.this.f15642d;
                        if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i4] = 5;
                        i4++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList2 = LogoApplication.this.f15647i;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication8 = LogoApplication.this;
            int[] iArr14 = logoApplication8.f15645g;
            if (iArr14 != null) {
                iArr14[0] = 0;
            }
            int[] iArr15 = logoApplication8.f15642d;
            if (iArr15 != null) {
                iArr15[2] = 3;
            }
            int[] iArr16 = logoApplication8.f15649k;
            if (iArr16 != null) {
                iArr16[5] = 2;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoApplication$b */
    /* loaded from: classes3.dex */
    public class C9439b implements AppLinkData.CompletionHandler {
        public C9439b() {
        }

        @Override // com.facebook.applinks.AppLinkData.CompletionHandler
        public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            LogoApplication logoApplication = LogoApplication.this;
            int[] iArr = logoApplication.f15649k;
            if (iArr != null) {
                iArr[3] = 9;
            }
            int[] iArr2 = logoApplication.f15642d;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            if (logoApplication.f15647i == null) {
                logoApplication.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication2 = LogoApplication.this;
            logoApplication2.f15641c = ";paddingStart";
            logoApplication2.f15643e = true;
            if (logoApplication2.f15649k == null) {
                logoApplication2.f15649k = new int[10];
            }
            if (logoApplication2.f15642d == null) {
                logoApplication2.f15642d = new int[10];
            }
            logoApplication2.f15643e = false;
            int[] iArr3 = logoApplication2.f15642d;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (iArr3 != null) {
                iArr3[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i12 = 0;
                    while (true) {
                        int[] iArr4 = LogoApplication.this.f15649k;
                        if (i12 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i12] = 3;
                        i12++;
                    }
                }
                LogoApplication logoApplication3 = LogoApplication.this;
                logoApplication3.f15643e = !logoApplication3.f15643e;
                logoApplication3.f15643e = false;
                logoApplication3.f15641c = LogoApplication.this.f15641c + length;
                if (LogoApplication.this.f15642d != null) {
                    int i13 = 0;
                    while (true) {
                        int[] iArr5 = LogoApplication.this.f15642d;
                        if (i13 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i13] = 5;
                        i13++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList = LogoApplication.this.f15647i;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication4 = LogoApplication.this;
            int[] iArr6 = logoApplication4.f15645g;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
            int[] iArr7 = logoApplication4.f15642d;
            if (iArr7 != null) {
                iArr7[2] = 3;
            }
            int[] iArr8 = logoApplication4.f15649k;
            if (iArr8 != null) {
                iArr8[5] = 2;
            }
            logoApplication4.m9237o("appLinkData:" + appLinkData);
            LogoApplication logoApplication5 = LogoApplication.this;
            int[] iArr9 = logoApplication5.f15649k;
            if (iArr9 != null) {
                iArr9[3] = 9;
            }
            int[] iArr10 = logoApplication5.f15642d;
            if (iArr10 != null) {
                iArr10[8] = 0;
            }
            if (logoApplication5.f15647i == null) {
                logoApplication5.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication6 = LogoApplication.this;
            logoApplication6.f15641c = ";paddingStart";
            logoApplication6.f15643e = true;
            if (logoApplication6.f15649k == null) {
                logoApplication6.f15649k = new int[10];
            }
            if (logoApplication6.f15642d == null) {
                logoApplication6.f15642d = new int[10];
            }
            logoApplication6.f15643e = false;
            int[] iArr11 = logoApplication6.f15642d;
            if (iArr11 != null) {
                iArr11[9] = 7;
            }
            if (iArr11 != null) {
                iArr11[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i14 = 0;
                    while (true) {
                        int[] iArr12 = LogoApplication.this.f15649k;
                        if (i14 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i14] = 3;
                        i14++;
                    }
                }
                LogoApplication logoApplication7 = LogoApplication.this;
                logoApplication7.f15643e = !logoApplication7.f15643e;
                logoApplication7.f15643e = false;
                logoApplication7.f15641c = LogoApplication.this.f15641c + length2;
                if (LogoApplication.this.f15642d != null) {
                    int i15 = 0;
                    while (true) {
                        int[] iArr13 = LogoApplication.this.f15642d;
                        if (i15 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i15] = 5;
                        i15++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList2 = LogoApplication.this.f15647i;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication8 = LogoApplication.this;
            int[] iArr14 = logoApplication8.f15645g;
            if (iArr14 != null) {
                iArr14[0] = 0;
            }
            int[] iArr15 = logoApplication8.f15642d;
            if (iArr15 != null) {
                iArr15[2] = 3;
            }
            int[] iArr16 = logoApplication8.f15649k;
            if (iArr16 != null) {
                iArr16[5] = 2;
            }
            logoApplication8.f15652n = SPUtils.m878a("LoGoData", 0).m877b("lo_f");
            LogoApplication logoApplication9 = LogoApplication.this;
            int[] iArr17 = logoApplication9.f15649k;
            if (iArr17 != null) {
                iArr17[3] = 9;
            }
            int[] iArr18 = logoApplication9.f15642d;
            if (iArr18 != null) {
                iArr18[8] = 0;
            }
            if (logoApplication9.f15647i == null) {
                logoApplication9.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication10 = LogoApplication.this;
            logoApplication10.f15641c = ";paddingStart";
            logoApplication10.f15643e = true;
            if (logoApplication10.f15649k == null) {
                logoApplication10.f15649k = new int[10];
            }
            if (logoApplication10.f15642d == null) {
                logoApplication10.f15642d = new int[10];
            }
            logoApplication10.f15643e = false;
            int[] iArr19 = logoApplication10.f15642d;
            if (iArr19 != null) {
                iArr19[9] = 7;
            }
            if (iArr19 != null) {
                iArr19[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length3 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i16 = 0;
                    while (true) {
                        int[] iArr20 = LogoApplication.this.f15649k;
                        if (i16 >= (iArr20.length > 3 ? 3 : iArr20.length)) {
                            break;
                        }
                        iArr20[i16] = 3;
                        i16++;
                    }
                }
                LogoApplication logoApplication11 = LogoApplication.this;
                logoApplication11.f15643e = !logoApplication11.f15643e;
                logoApplication11.f15643e = false;
                logoApplication11.f15641c = LogoApplication.this.f15641c + length3;
                if (LogoApplication.this.f15642d != null) {
                    int i17 = 0;
                    while (true) {
                        int[] iArr21 = LogoApplication.this.f15642d;
                        if (i17 >= (iArr21.length > 3 ? 3 : iArr21.length)) {
                            break;
                        }
                        iArr21[i17] = 5;
                        i17++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList3 = LogoApplication.this.f15647i;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication12 = LogoApplication.this;
            int[] iArr22 = logoApplication12.f15645g;
            if (iArr22 != null) {
                iArr22[0] = 0;
            }
            int[] iArr23 = logoApplication12.f15642d;
            if (iArr23 != null) {
                iArr23[2] = 3;
            }
            int[] iArr24 = logoApplication12.f15649k;
            if (iArr24 != null) {
                iArr24[5] = 2;
            }
            logoApplication12.m9237o("startF:" + LogoApplication.this.f15652n);
            LogoApplication logoApplication13 = LogoApplication.this;
            int[] iArr25 = logoApplication13.f15649k;
            if (iArr25 != null) {
                iArr25[3] = 9;
            }
            int[] iArr26 = logoApplication13.f15642d;
            if (iArr26 != null) {
                iArr26[8] = 0;
            }
            if (logoApplication13.f15647i == null) {
                logoApplication13.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication14 = LogoApplication.this;
            logoApplication14.f15641c = ";paddingStart";
            logoApplication14.f15643e = true;
            if (logoApplication14.f15649k == null) {
                i = 10;
                logoApplication14.f15649k = new int[10];
            } else {
                i = 10;
            }
            if (logoApplication14.f15642d == null) {
                logoApplication14.f15642d = new int[i];
            }
            logoApplication14.f15643e = false;
            int[] iArr27 = logoApplication14.f15642d;
            if (iArr27 != null) {
                iArr27[9] = 7;
            }
            if (iArr27 != null) {
                iArr27[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length4 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr28 = LogoApplication.this.f15649k;
                        if (i18 >= (iArr28.length > 3 ? 3 : iArr28.length)) {
                            break;
                        }
                        iArr28[i18] = 3;
                        i18++;
                    }
                }
                LogoApplication logoApplication15 = LogoApplication.this;
                logoApplication15.f15643e = !logoApplication15.f15643e;
                logoApplication15.f15643e = false;
                logoApplication15.f15641c = LogoApplication.this.f15641c + length4;
                if (LogoApplication.this.f15642d != null) {
                    int i19 = 0;
                    while (true) {
                        int[] iArr29 = LogoApplication.this.f15642d;
                        if (i19 >= (iArr29.length > 3 ? 3 : iArr29.length)) {
                            break;
                        }
                        iArr29[i19] = 5;
                        i19++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList4 = LogoApplication.this.f15647i;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication16 = LogoApplication.this;
            int[] iArr30 = logoApplication16.f15645g;
            if (iArr30 != null) {
                iArr30[0] = 0;
            }
            int[] iArr31 = logoApplication16.f15642d;
            if (iArr31 != null) {
                iArr31[2] = 3;
            }
            int[] iArr32 = logoApplication16.f15649k;
            if (iArr32 != null) {
                iArr32[5] = 2;
            }
            if (appLinkData != null && logoApplication16.f15652n <= 0) {
                LogoApplication logoApplication17 = LogoApplication.this;
                int[] iArr33 = logoApplication17.f15649k;
                if (iArr33 != null) {
                    iArr33[3] = 9;
                }
                int[] iArr34 = logoApplication17.f15642d;
                if (iArr34 != null) {
                    iArr34[8] = 0;
                }
                if (logoApplication17.f15647i == null) {
                    logoApplication17.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication18 = LogoApplication.this;
                logoApplication18.f15641c = ";paddingStart";
                logoApplication18.f15643e = true;
                if (logoApplication18.f15649k == null) {
                    i7 = 10;
                    logoApplication18.f15649k = new int[10];
                } else {
                    i7 = 10;
                }
                if (logoApplication18.f15642d == null) {
                    logoApplication18.f15642d = new int[i7];
                }
                logoApplication18.f15643e = false;
                int[] iArr35 = logoApplication18.f15642d;
                if (iArr35 != null) {
                    iArr35[9] = 7;
                }
                if (iArr35 != null) {
                    iArr35[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length5 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i20 = 0;
                        while (true) {
                            int[] iArr36 = LogoApplication.this.f15649k;
                            if (i20 >= (iArr36.length > 3 ? 3 : iArr36.length)) {
                                break;
                            }
                            iArr36[i20] = 3;
                            i20++;
                        }
                    }
                    LogoApplication logoApplication19 = LogoApplication.this;
                    logoApplication19.f15643e = !logoApplication19.f15643e;
                    logoApplication19.f15643e = false;
                    logoApplication19.f15641c = LogoApplication.this.f15641c + length5;
                    if (LogoApplication.this.f15642d != null) {
                        int i21 = 0;
                        while (true) {
                            int[] iArr37 = LogoApplication.this.f15642d;
                            if (i21 >= (iArr37.length > 3 ? 3 : iArr37.length)) {
                                break;
                            }
                            iArr37[i21] = 5;
                            i21++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList5 = LogoApplication.this.f15647i;
                    if (arrayList5 != null && arrayList5.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication20 = LogoApplication.this;
                int[] iArr38 = logoApplication20.f15645g;
                if (iArr38 != null) {
                    iArr38[0] = 0;
                }
                int[] iArr39 = logoApplication20.f15642d;
                if (iArr39 != null) {
                    iArr39[2] = 3;
                }
                int[] iArr40 = logoApplication20.f15649k;
                if (iArr40 != null) {
                    iArr40[5] = 2;
                }
                logoApplication20.loadFConfig();
                LogoApplication logoApplication21 = LogoApplication.this;
                int[] iArr41 = logoApplication21.f15649k;
                if (iArr41 != null) {
                    iArr41[3] = 9;
                }
                int[] iArr42 = logoApplication21.f15642d;
                if (iArr42 != null) {
                    iArr42[8] = 0;
                }
                if (logoApplication21.f15647i == null) {
                    logoApplication21.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication22 = LogoApplication.this;
                logoApplication22.f15641c = ";paddingStart";
                logoApplication22.f15643e = true;
                if (logoApplication22.f15649k == null) {
                    i8 = 10;
                    logoApplication22.f15649k = new int[10];
                } else {
                    i8 = 10;
                }
                if (logoApplication22.f15642d == null) {
                    logoApplication22.f15642d = new int[i8];
                }
                logoApplication22.f15643e = false;
                int[] iArr43 = logoApplication22.f15642d;
                if (iArr43 != null) {
                    iArr43[9] = 7;
                }
                if (iArr43 != null) {
                    iArr43[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length6 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i22 = 0;
                        while (true) {
                            int[] iArr44 = LogoApplication.this.f15649k;
                            if (i22 >= (iArr44.length > 3 ? 3 : iArr44.length)) {
                                break;
                            }
                            iArr44[i22] = 3;
                            i22++;
                        }
                    }
                    LogoApplication logoApplication23 = LogoApplication.this;
                    logoApplication23.f15643e = !logoApplication23.f15643e;
                    logoApplication23.f15643e = false;
                    logoApplication23.f15641c = LogoApplication.this.f15641c + length6;
                    if (LogoApplication.this.f15642d != null) {
                        int i23 = 0;
                        while (true) {
                            int[] iArr45 = LogoApplication.this.f15642d;
                            if (i23 >= (iArr45.length > 3 ? 3 : iArr45.length)) {
                                break;
                            }
                            iArr45[i23] = 5;
                            i23++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList6 = LogoApplication.this.f15647i;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication24 = LogoApplication.this;
                int[] iArr46 = logoApplication24.f15645g;
                if (iArr46 != null) {
                    iArr46[0] = 0;
                }
                int[] iArr47 = logoApplication24.f15642d;
                if (iArr47 != null) {
                    iArr47[2] = 3;
                }
                int[] iArr48 = logoApplication24.f15649k;
                if (iArr48 != null) {
                    iArr48[5] = 2;
                }
                if (iArr48 != null) {
                    try {
                        iArr48[3] = 9;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (iArr47 != null) {
                    iArr47[8] = 0;
                }
                if (logoApplication24.f15647i == null) {
                    logoApplication24.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication25 = LogoApplication.this;
                logoApplication25.f15641c = ";paddingStart";
                logoApplication25.f15643e = true;
                if (logoApplication25.f15649k == null) {
                    logoApplication25.f15649k = new int[10];
                }
                if (logoApplication25.f15642d == null) {
                    logoApplication25.f15642d = new int[10];
                }
                logoApplication25.f15643e = false;
                int[] iArr49 = logoApplication25.f15642d;
                if (iArr49 != null) {
                    iArr49[9] = 7;
                }
                if (iArr49 != null) {
                    iArr49[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length7 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i24 = 0;
                        while (true) {
                            int[] iArr50 = LogoApplication.this.f15649k;
                            if (i24 >= (iArr50.length > 3 ? 3 : iArr50.length)) {
                                break;
                            }
                            iArr50[i24] = 3;
                            i24++;
                        }
                    }
                    LogoApplication logoApplication26 = LogoApplication.this;
                    logoApplication26.f15643e = !logoApplication26.f15643e;
                    logoApplication26.f15643e = false;
                    logoApplication26.f15641c = LogoApplication.this.f15641c + length7;
                    if (LogoApplication.this.f15642d != null) {
                        int i25 = 0;
                        while (true) {
                            int[] iArr51 = LogoApplication.this.f15642d;
                            if (i25 >= (iArr51.length > 3 ? 3 : iArr51.length)) {
                                break;
                            }
                            iArr51[i25] = 5;
                            i25++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList7 = LogoApplication.this.f15647i;
                    if (arrayList7 != null && arrayList7.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication27 = LogoApplication.this;
                int[] iArr52 = logoApplication27.f15645g;
                if (iArr52 != null) {
                    iArr52[0] = 0;
                }
                int[] iArr53 = logoApplication27.f15642d;
                if (iArr53 != null) {
                    iArr53[2] = 3;
                }
                int[] iArr54 = logoApplication27.f15649k;
                if (iArr54 != null) {
                    iArr54[5] = 2;
                }
                AppsFlyerLib.getInstance().logEvent(LogoApplication.this.getApplicationContext(), "main_a", null);
                LogoApplication logoApplication28 = LogoApplication.this;
                int[] iArr55 = logoApplication28.f15649k;
                if (iArr55 != null) {
                    iArr55[3] = 9;
                }
                int[] iArr56 = logoApplication28.f15642d;
                if (iArr56 != null) {
                    iArr56[8] = 0;
                }
                if (logoApplication28.f15647i == null) {
                    logoApplication28.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication29 = LogoApplication.this;
                logoApplication29.f15641c = ";paddingStart";
                logoApplication29.f15643e = true;
                if (logoApplication29.f15649k == null) {
                    logoApplication29.f15649k = new int[10];
                }
                if (logoApplication29.f15642d == null) {
                    logoApplication29.f15642d = new int[10];
                }
                logoApplication29.f15643e = false;
                int[] iArr57 = logoApplication29.f15642d;
                if (iArr57 != null) {
                    iArr57[9] = 7;
                }
                if (iArr57 != null) {
                    iArr57[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length8 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i26 = 0;
                        while (true) {
                            int[] iArr58 = LogoApplication.this.f15649k;
                            if (i26 >= (iArr58.length > 3 ? 3 : iArr58.length)) {
                                break;
                            }
                            iArr58[i26] = 3;
                            i26++;
                        }
                    }
                    LogoApplication logoApplication30 = LogoApplication.this;
                    logoApplication30.f15643e = !logoApplication30.f15643e;
                    logoApplication30.f15643e = false;
                    logoApplication30.f15641c = LogoApplication.this.f15641c + length8;
                    if (LogoApplication.this.f15642d != null) {
                        int i27 = 0;
                        while (true) {
                            int[] iArr59 = LogoApplication.this.f15642d;
                            if (i27 >= (iArr59.length > 3 ? 3 : iArr59.length)) {
                                break;
                            }
                            iArr59[i27] = 5;
                            i27++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList8 = LogoApplication.this.f15647i;
                    if (arrayList8 != null && arrayList8.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication31 = LogoApplication.this;
                int[] iArr60 = logoApplication31.f15645g;
                if (iArr60 != null) {
                    iArr60[0] = 0;
                }
                int[] iArr61 = logoApplication31.f15642d;
                if (iArr61 != null) {
                    iArr61[2] = 3;
                }
                int[] iArr62 = logoApplication31.f15649k;
                if (iArr62 != null) {
                    iArr62[5] = 2;
                }
                LogoApplication logoApplication32 = LogoApplication.this;
                int[] iArr63 = logoApplication32.f15649k;
                if (iArr63 != null) {
                    iArr63[3] = 9;
                }
                int[] iArr64 = logoApplication32.f15642d;
                if (iArr64 != null) {
                    iArr64[8] = 0;
                }
                if (logoApplication32.f15647i == null) {
                    logoApplication32.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication33 = LogoApplication.this;
                logoApplication33.f15641c = ";paddingStart";
                logoApplication33.f15643e = true;
                if (logoApplication33.f15649k == null) {
                    i9 = 10;
                    logoApplication33.f15649k = new int[10];
                } else {
                    i9 = 10;
                }
                if (logoApplication33.f15642d == null) {
                    logoApplication33.f15642d = new int[i9];
                }
                logoApplication33.f15643e = false;
                int[] iArr65 = logoApplication33.f15642d;
                if (iArr65 != null) {
                    iArr65[9] = 7;
                }
                if (iArr65 != null) {
                    iArr65[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length9 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i28 = 0;
                        while (true) {
                            int[] iArr66 = LogoApplication.this.f15649k;
                            if (i28 >= (iArr66.length > 3 ? 3 : iArr66.length)) {
                                break;
                            }
                            iArr66[i28] = 3;
                            i28++;
                        }
                    }
                    LogoApplication logoApplication34 = LogoApplication.this;
                    logoApplication34.f15643e = !logoApplication34.f15643e;
                    logoApplication34.f15643e = false;
                    logoApplication34.f15641c = LogoApplication.this.f15641c + length9;
                    if (LogoApplication.this.f15642d != null) {
                        int i29 = 0;
                        while (true) {
                            int[] iArr67 = LogoApplication.this.f15642d;
                            if (i29 >= (iArr67.length > 3 ? 3 : iArr67.length)) {
                                break;
                            }
                            iArr67[i29] = 5;
                            i29++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList9 = LogoApplication.this.f15647i;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication35 = LogoApplication.this;
                int[] iArr68 = logoApplication35.f15645g;
                if (iArr68 != null) {
                    iArr68[0] = 0;
                }
                int[] iArr69 = logoApplication35.f15642d;
                if (iArr69 != null) {
                    iArr69[2] = 3;
                }
                int[] iArr70 = logoApplication35.f15649k;
                if (iArr70 != null) {
                    iArr70[5] = 2;
                }
                try {
                    AppsFlyerLib.getInstance().logEvent(LogoApplication.this.getApplicationContext(), "A_Cyclone_A", null);
                    LogoApplication logoApplication36 = LogoApplication.this;
                    int[] iArr71 = logoApplication36.f15649k;
                    if (iArr71 != null) {
                        iArr71[3] = 9;
                    }
                    int[] iArr72 = logoApplication36.f15642d;
                    if (iArr72 != null) {
                        iArr72[8] = 0;
                    }
                    if (logoApplication36.f15647i == null) {
                        logoApplication36.f15647i = new ArrayList<>();
                    }
                    LogoApplication logoApplication37 = LogoApplication.this;
                    logoApplication37.f15641c = ";paddingStart";
                    logoApplication37.f15643e = true;
                    if (logoApplication37.f15649k == null) {
                        logoApplication37.f15649k = new int[10];
                    }
                    if (logoApplication37.f15642d == null) {
                        logoApplication37.f15642d = new int[10];
                    }
                    logoApplication37.f15643e = false;
                    int[] iArr73 = logoApplication37.f15642d;
                    if (iArr73 != null) {
                        iArr73[9] = 7;
                    }
                    if (iArr73 != null) {
                        iArr73[4] = 1;
                    }
                    if (!TextUtils.isEmpty(";paddingStart")) {
                        int length10 = LogoApplication.this.f15641c.length();
                        if (LogoApplication.this.f15649k != null) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr74 = LogoApplication.this.f15649k;
                                if (i30 >= (iArr74.length > 3 ? 3 : iArr74.length)) {
                                    break;
                                }
                                iArr74[i30] = 3;
                                i30++;
                            }
                        }
                        LogoApplication logoApplication38 = LogoApplication.this;
                        logoApplication38.f15643e = !logoApplication38.f15643e;
                        logoApplication38.f15643e = false;
                        logoApplication38.f15641c = LogoApplication.this.f15641c + length10;
                        if (LogoApplication.this.f15642d != null) {
                            int i31 = 0;
                            while (true) {
                                int[] iArr75 = LogoApplication.this.f15642d;
                                if (i31 >= (iArr75.length > 3 ? 3 : iArr75.length)) {
                                    break;
                                }
                                iArr75[i31] = 5;
                                i31++;
                            }
                        }
                        if (LogoApplication.this.f15647i.size() < 1) {
                            LogoApplication.this.f15647i.add(" than ");
                        }
                        ArrayList<String> arrayList10 = LogoApplication.this.f15647i;
                        if (arrayList10 != null && arrayList10.size() > 0) {
                            LogoApplication.this.f15647i.remove(0);
                        }
                    }
                    LogoApplication logoApplication39 = LogoApplication.this;
                    int[] iArr76 = logoApplication39.f15645g;
                    if (iArr76 != null) {
                        iArr76[0] = 0;
                    }
                    int[] iArr77 = logoApplication39.f15642d;
                    if (iArr77 != null) {
                        iArr77[2] = 3;
                    }
                    int[] iArr78 = logoApplication39.f15649k;
                    if (iArr78 != null) {
                        iArr78[5] = 2;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                LogoApplication logoApplication40 = LogoApplication.this;
                int[] iArr79 = logoApplication40.f15649k;
                if (iArr79 != null) {
                    iArr79[3] = 9;
                }
                int[] iArr80 = logoApplication40.f15642d;
                if (iArr80 != null) {
                    iArr80[8] = 0;
                }
                if (logoApplication40.f15647i == null) {
                    logoApplication40.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication41 = LogoApplication.this;
                logoApplication41.f15641c = ";paddingStart";
                logoApplication41.f15643e = true;
                if (logoApplication41.f15649k == null) {
                    i10 = 10;
                    logoApplication41.f15649k = new int[10];
                } else {
                    i10 = 10;
                }
                if (logoApplication41.f15642d == null) {
                    logoApplication41.f15642d = new int[i10];
                }
                logoApplication41.f15643e = false;
                int[] iArr81 = logoApplication41.f15642d;
                if (iArr81 != null) {
                    iArr81[9] = 7;
                }
                if (iArr81 != null) {
                    iArr81[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length11 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i32 = 0;
                        while (true) {
                            int[] iArr82 = LogoApplication.this.f15649k;
                            if (i32 >= (iArr82.length > 3 ? 3 : iArr82.length)) {
                                break;
                            }
                            iArr82[i32] = 3;
                            i32++;
                        }
                    }
                    LogoApplication logoApplication42 = LogoApplication.this;
                    logoApplication42.f15643e = !logoApplication42.f15643e;
                    logoApplication42.f15643e = false;
                    logoApplication42.f15641c = LogoApplication.this.f15641c + length11;
                    if (LogoApplication.this.f15642d != null) {
                        int i33 = 0;
                        while (true) {
                            int[] iArr83 = LogoApplication.this.f15642d;
                            if (i33 >= (iArr83.length > 3 ? 3 : iArr83.length)) {
                                break;
                            }
                            iArr83[i33] = 5;
                            i33++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList11 = LogoApplication.this.f15647i;
                    if (arrayList11 != null && arrayList11.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication43 = LogoApplication.this;
                int[] iArr84 = logoApplication43.f15645g;
                if (iArr84 != null) {
                    iArr84[0] = 0;
                }
                int[] iArr85 = logoApplication43.f15642d;
                if (iArr85 != null) {
                    iArr85[2] = 3;
                }
                int[] iArr86 = logoApplication43.f15649k;
                if (iArr86 != null) {
                    iArr86[5] = 2;
                }
                SPUtils.m878a("LoGoData", 0).m874e("lo_f", 1000);
                LogoApplication logoApplication44 = LogoApplication.this;
                int[] iArr87 = logoApplication44.f15649k;
                if (iArr87 != null) {
                    iArr87[3] = 9;
                }
                int[] iArr88 = logoApplication44.f15642d;
                if (iArr88 != null) {
                    iArr88[8] = 0;
                }
                if (logoApplication44.f15647i == null) {
                    logoApplication44.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication45 = LogoApplication.this;
                logoApplication45.f15641c = ";paddingStart";
                logoApplication45.f15643e = true;
                if (logoApplication45.f15649k == null) {
                    i11 = 10;
                    logoApplication45.f15649k = new int[10];
                } else {
                    i11 = 10;
                }
                if (logoApplication45.f15642d == null) {
                    logoApplication45.f15642d = new int[i11];
                }
                logoApplication45.f15643e = false;
                int[] iArr89 = logoApplication45.f15642d;
                if (iArr89 != null) {
                    iArr89[9] = 7;
                }
                if (iArr89 != null) {
                    iArr89[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length12 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i34 = 0;
                        while (true) {
                            int[] iArr90 = LogoApplication.this.f15649k;
                            if (i34 >= (iArr90.length > 3 ? 3 : iArr90.length)) {
                                break;
                            }
                            iArr90[i34] = 3;
                            i34++;
                        }
                    }
                    LogoApplication logoApplication46 = LogoApplication.this;
                    logoApplication46.f15643e = !logoApplication46.f15643e;
                    logoApplication46.f15643e = false;
                    logoApplication46.f15641c = LogoApplication.this.f15641c + length12;
                    if (LogoApplication.this.f15642d != null) {
                        int i35 = 0;
                        while (true) {
                            int[] iArr91 = LogoApplication.this.f15642d;
                            if (i35 >= (iArr91.length > 3 ? 3 : iArr91.length)) {
                                break;
                            }
                            iArr91[i35] = 5;
                            i35++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList12 = LogoApplication.this.f15647i;
                    if (arrayList12 != null && arrayList12.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication47 = LogoApplication.this;
                int[] iArr92 = logoApplication47.f15645g;
                if (iArr92 != null) {
                    iArr92[0] = 0;
                }
                int[] iArr93 = logoApplication47.f15642d;
                if (iArr93 != null) {
                    iArr93[2] = 3;
                }
                int[] iArr94 = logoApplication47.f15649k;
                if (iArr94 != null) {
                    iArr94[5] = 2;
                }
            } else {
                LogoApplication logoApplication48 = LogoApplication.this;
                int[] iArr95 = logoApplication48.f15649k;
                if (iArr95 != null) {
                    iArr95[3] = 9;
                }
                int[] iArr96 = logoApplication48.f15642d;
                if (iArr96 != null) {
                    iArr96[8] = 0;
                }
                if (logoApplication48.f15647i == null) {
                    logoApplication48.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication49 = LogoApplication.this;
                logoApplication49.f15641c = ";paddingStart";
                logoApplication49.f15643e = true;
                if (logoApplication49.f15649k == null) {
                    i2 = 10;
                    logoApplication49.f15649k = new int[10];
                } else {
                    i2 = 10;
                }
                if (logoApplication49.f15642d == null) {
                    logoApplication49.f15642d = new int[i2];
                }
                logoApplication49.f15643e = false;
                int[] iArr97 = logoApplication49.f15642d;
                if (iArr97 != null) {
                    iArr97[9] = 7;
                }
                if (iArr97 != null) {
                    iArr97[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length13 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i36 = 0;
                        while (true) {
                            int[] iArr98 = LogoApplication.this.f15649k;
                            if (i36 >= (iArr98.length > 3 ? 3 : iArr98.length)) {
                                break;
                            }
                            iArr98[i36] = 3;
                            i36++;
                        }
                    }
                    LogoApplication logoApplication50 = LogoApplication.this;
                    logoApplication50.f15643e = !logoApplication50.f15643e;
                    logoApplication50.f15643e = false;
                    logoApplication50.f15641c = LogoApplication.this.f15641c + length13;
                    if (LogoApplication.this.f15642d != null) {
                        int i37 = 0;
                        while (true) {
                            int[] iArr99 = LogoApplication.this.f15642d;
                            if (i37 >= (iArr99.length > 3 ? 3 : iArr99.length)) {
                                break;
                            }
                            iArr99[i37] = 5;
                            i37++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList13 = LogoApplication.this.f15647i;
                    if (arrayList13 != null && arrayList13.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication51 = LogoApplication.this;
                int[] iArr100 = logoApplication51.f15645g;
                if (iArr100 != null) {
                    iArr100[0] = 0;
                }
                int[] iArr101 = logoApplication51.f15642d;
                if (iArr101 != null) {
                    iArr101[2] = 3;
                }
                int[] iArr102 = logoApplication51.f15649k;
                if (iArr102 != null) {
                    iArr102[5] = 2;
                }
                LogoApplication.m9245g(logoApplication51);
                LogoApplication logoApplication52 = LogoApplication.this;
                int[] iArr103 = logoApplication52.f15649k;
                if (iArr103 != null) {
                    iArr103[3] = 9;
                }
                int[] iArr104 = logoApplication52.f15642d;
                if (iArr104 != null) {
                    iArr104[8] = 0;
                }
                if (logoApplication52.f15647i == null) {
                    logoApplication52.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication53 = LogoApplication.this;
                logoApplication53.f15641c = ";paddingStart";
                logoApplication53.f15643e = true;
                if (logoApplication53.f15649k == null) {
                    i3 = 10;
                    logoApplication53.f15649k = new int[10];
                } else {
                    i3 = 10;
                }
                if (logoApplication53.f15642d == null) {
                    logoApplication53.f15642d = new int[i3];
                }
                logoApplication53.f15643e = false;
                int[] iArr105 = logoApplication53.f15642d;
                if (iArr105 != null) {
                    iArr105[9] = 7;
                }
                if (iArr105 != null) {
                    iArr105[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length14 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i38 = 0;
                        while (true) {
                            int[] iArr106 = LogoApplication.this.f15649k;
                            if (i38 >= (iArr106.length > 3 ? 3 : iArr106.length)) {
                                break;
                            }
                            iArr106[i38] = 3;
                            i38++;
                        }
                    }
                    LogoApplication logoApplication54 = LogoApplication.this;
                    logoApplication54.f15643e = !logoApplication54.f15643e;
                    logoApplication54.f15643e = false;
                    logoApplication54.f15641c = LogoApplication.this.f15641c + length14;
                    if (LogoApplication.this.f15642d != null) {
                        int i39 = 0;
                        while (true) {
                            int[] iArr107 = LogoApplication.this.f15642d;
                            if (i39 >= (iArr107.length > 3 ? 3 : iArr107.length)) {
                                break;
                            }
                            iArr107[i39] = 5;
                            i39++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList14 = LogoApplication.this.f15647i;
                    if (arrayList14 != null && arrayList14.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication55 = LogoApplication.this;
                int[] iArr108 = logoApplication55.f15645g;
                if (iArr108 != null) {
                    iArr108[0] = 0;
                }
                int[] iArr109 = logoApplication55.f15642d;
                if (iArr109 != null) {
                    iArr109[2] = 3;
                }
                int[] iArr110 = logoApplication55.f15649k;
                if (iArr110 != null) {
                    iArr110[5] = 2;
                }
                logoApplication55.f15650l = false;
                LogoApplication logoApplication56 = LogoApplication.this;
                int[] iArr111 = logoApplication56.f15649k;
                if (iArr111 != null) {
                    iArr111[3] = 9;
                }
                int[] iArr112 = logoApplication56.f15642d;
                if (iArr112 != null) {
                    iArr112[8] = 0;
                }
                if (logoApplication56.f15647i == null) {
                    logoApplication56.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication57 = LogoApplication.this;
                logoApplication57.f15641c = ";paddingStart";
                logoApplication57.f15643e = true;
                if (logoApplication57.f15649k == null) {
                    i4 = 10;
                    logoApplication57.f15649k = new int[10];
                } else {
                    i4 = 10;
                }
                if (logoApplication57.f15642d == null) {
                    logoApplication57.f15642d = new int[i4];
                }
                logoApplication57.f15643e = false;
                int[] iArr113 = logoApplication57.f15642d;
                if (iArr113 != null) {
                    iArr113[9] = 7;
                }
                if (iArr113 != null) {
                    iArr113[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length15 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i40 = 0;
                        while (true) {
                            int[] iArr114 = LogoApplication.this.f15649k;
                            if (i40 >= (iArr114.length > 3 ? 3 : iArr114.length)) {
                                break;
                            }
                            iArr114[i40] = 3;
                            i40++;
                        }
                    }
                    LogoApplication logoApplication58 = LogoApplication.this;
                    logoApplication58.f15643e = !logoApplication58.f15643e;
                    logoApplication58.f15643e = false;
                    logoApplication58.f15641c = LogoApplication.this.f15641c + length15;
                    if (LogoApplication.this.f15642d != null) {
                        int i41 = 0;
                        while (true) {
                            int[] iArr115 = LogoApplication.this.f15642d;
                            if (i41 >= (iArr115.length > 3 ? 3 : iArr115.length)) {
                                break;
                            }
                            iArr115[i41] = 5;
                            i41++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList15 = LogoApplication.this.f15647i;
                    if (arrayList15 != null && arrayList15.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication59 = LogoApplication.this;
                int[] iArr116 = logoApplication59.f15645g;
                if (iArr116 != null) {
                    iArr116[0] = 0;
                }
                int[] iArr117 = logoApplication59.f15642d;
                if (iArr117 != null) {
                    iArr117[2] = 3;
                }
                int[] iArr118 = logoApplication59.f15649k;
                if (iArr118 != null) {
                    iArr118[5] = 2;
                }
                logoApplication59.m9234r();
                LogoApplication logoApplication60 = LogoApplication.this;
                int[] iArr119 = logoApplication60.f15649k;
                if (iArr119 != null) {
                    iArr119[3] = 9;
                }
                int[] iArr120 = logoApplication60.f15642d;
                if (iArr120 != null) {
                    iArr120[8] = 0;
                }
                if (logoApplication60.f15647i == null) {
                    logoApplication60.f15647i = new ArrayList<>();
                }
                LogoApplication logoApplication61 = LogoApplication.this;
                logoApplication61.f15641c = ";paddingStart";
                logoApplication61.f15643e = true;
                if (logoApplication61.f15649k == null) {
                    i5 = 10;
                    logoApplication61.f15649k = new int[10];
                } else {
                    i5 = 10;
                }
                if (logoApplication61.f15642d == null) {
                    logoApplication61.f15642d = new int[i5];
                }
                logoApplication61.f15643e = false;
                int[] iArr121 = logoApplication61.f15642d;
                if (iArr121 != null) {
                    iArr121[9] = 7;
                }
                if (iArr121 != null) {
                    iArr121[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length16 = LogoApplication.this.f15641c.length();
                    if (LogoApplication.this.f15649k != null) {
                        int i42 = 0;
                        while (true) {
                            int[] iArr122 = LogoApplication.this.f15649k;
                            if (i42 >= (iArr122.length > 3 ? 3 : iArr122.length)) {
                                break;
                            }
                            iArr122[i42] = 3;
                            i42++;
                        }
                    }
                    LogoApplication logoApplication62 = LogoApplication.this;
                    logoApplication62.f15643e = !logoApplication62.f15643e;
                    logoApplication62.f15643e = false;
                    logoApplication62.f15641c = LogoApplication.this.f15641c + length16;
                    if (LogoApplication.this.f15642d != null) {
                        int i43 = 0;
                        while (true) {
                            int[] iArr123 = LogoApplication.this.f15642d;
                            if (i43 >= (iArr123.length > 3 ? 3 : iArr123.length)) {
                                break;
                            }
                            iArr123[i43] = 5;
                            i43++;
                        }
                    }
                    if (LogoApplication.this.f15647i.size() < 1) {
                        LogoApplication.this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList16 = LogoApplication.this.f15647i;
                    if (arrayList16 != null && arrayList16.size() > 0) {
                        LogoApplication.this.f15647i.remove(0);
                    }
                }
                LogoApplication logoApplication63 = LogoApplication.this;
                int[] iArr124 = logoApplication63.f15645g;
                if (iArr124 != null) {
                    iArr124[0] = 0;
                }
                int[] iArr125 = logoApplication63.f15642d;
                if (iArr125 != null) {
                    iArr125[2] = 3;
                }
                int[] iArr126 = logoApplication63.f15649k;
                if (iArr126 != null) {
                    iArr126[5] = 2;
                }
            }
            LogoApplication logoApplication64 = LogoApplication.this;
            int[] iArr127 = logoApplication64.f15649k;
            if (iArr127 != null) {
                iArr127[3] = 9;
            }
            int[] iArr128 = logoApplication64.f15642d;
            if (iArr128 != null) {
                iArr128[8] = 0;
            }
            if (logoApplication64.f15647i == null) {
                logoApplication64.f15647i = new ArrayList<>();
            }
            LogoApplication logoApplication65 = LogoApplication.this;
            logoApplication65.f15641c = ";paddingStart";
            logoApplication65.f15643e = true;
            if (logoApplication65.f15649k == null) {
                i6 = 10;
                logoApplication65.f15649k = new int[10];
            } else {
                i6 = 10;
            }
            if (logoApplication65.f15642d == null) {
                logoApplication65.f15642d = new int[i6];
            }
            logoApplication65.f15643e = false;
            int[] iArr129 = logoApplication65.f15642d;
            if (iArr129 != null) {
                iArr129[9] = 7;
            }
            if (iArr129 != null) {
                iArr129[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length17 = LogoApplication.this.f15641c.length();
                if (LogoApplication.this.f15649k != null) {
                    int i44 = 0;
                    while (true) {
                        int[] iArr130 = LogoApplication.this.f15649k;
                        if (i44 >= (iArr130.length > 3 ? 3 : iArr130.length)) {
                            break;
                        }
                        iArr130[i44] = 3;
                        i44++;
                    }
                }
                LogoApplication logoApplication66 = LogoApplication.this;
                logoApplication66.f15643e = !logoApplication66.f15643e;
                logoApplication66.f15643e = false;
                logoApplication66.f15641c = LogoApplication.this.f15641c + length17;
                if (LogoApplication.this.f15642d != null) {
                    int i45 = 0;
                    while (true) {
                        int[] iArr131 = LogoApplication.this.f15642d;
                        if (i45 >= (iArr131.length > 3 ? 3 : iArr131.length)) {
                            break;
                        }
                        iArr131[i45] = 5;
                        i45++;
                    }
                }
                if (LogoApplication.this.f15647i.size() < 1) {
                    LogoApplication.this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList17 = LogoApplication.this.f15647i;
                if (arrayList17 != null && arrayList17.size() > 0) {
                    LogoApplication.this.f15647i.remove(0);
                }
            }
            LogoApplication logoApplication67 = LogoApplication.this;
            int[] iArr132 = logoApplication67.f15645g;
            if (iArr132 != null) {
                iArr132[0] = 0;
            }
            int[] iArr133 = logoApplication67.f15642d;
            if (iArr133 != null) {
                iArr133[2] = 3;
            }
            int[] iArr134 = logoApplication67.f15649k;
            if (iArr134 != null) {
                iArr134[5] = 2;
            }
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m9245g(LogoApplication logoApplication) {
        int i = logoApplication.f15651m;
        logoApplication.f15651m = i + 1;
        return i;
    }

    /* renamed from: l */
    public static LogoApplication m9240l() {
        return f15639o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m9238n(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        int[] iArr = this.f15649k;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15642d;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr3 = this.f15642d;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15641c.length();
            if (this.f15649k != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15649k;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15643e = false;
            this.f15641c += length;
            if (this.f15642d != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15642d;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList = this.f15647i;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr6 = this.f15645g;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15642d;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15649k;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        m9237o("initializeSdk");
        int[] iArr9 = this.f15649k;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15642d;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr11 = this.f15642d;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15641c.length();
            if (this.f15649k != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr12 = this.f15649k;
                    if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i3] = 3;
                    i3++;
                }
            }
            this.f15643e = false;
            this.f15641c += length2;
            if (this.f15642d != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr13 = this.f15642d;
                    if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i4] = 5;
                    i4++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15647i;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr14 = this.f15645g;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15642d;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15649k;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
    }

    /* renamed from: j */
    public void m9242j(Activity activity) {
        this.f15646h.add(activity);
        int i = 0;
        if (this.f15645g != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f15645g;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 2;
                i2++;
            }
        }
        ArrayList<String> arrayList = this.f15647i;
        if (arrayList != null && arrayList.size() > 0) {
            this.f15647i.remove(0);
        }
        if (!TextUtils.isEmpty(this.f15640b)) {
            this.f15640b += this.f15640b.length();
        }
        this.f15644f = this.f15644f > 0.6627097332823138d ? 0.9430206876169399d : 0.7290000001644192d;
        this.f15640b = "d repu";
        int[] iArr2 = this.f15649k;
        if (iArr2 != null) {
            iArr2[9] = 0;
        }
        if (this.f15642d != null) {
            int i3 = 0;
            while (true) {
                int[] iArr3 = this.f15642d;
                if (i3 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i3] = 3;
                i3++;
            }
        }
        LogoLogUtils.m22166d("LogoApplication", new Throwable(), "activity数量：" + this.f15646h.size());
        if (!TextUtils.isEmpty(this.f15640b)) {
            this.f15640b += this.f15640b.length();
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.f15640b)) {
            this.f15640b += this.f15640b.length();
        }
        if (!TextUtils.isEmpty(this.f15641c)) {
            int length = this.f15641c.length();
            int[] iArr4 = this.f15642d;
            if (iArr4 != null) {
                iArr4[1] = 0;
            }
            if (!TextUtils.isEmpty(this.f15640b)) {
                this.f15640b += this.f15640b.length();
            }
            if (this.f15647i.size() > 4) {
                this.f15647i.add("ned w");
            }
            this.f15641c += length;
            this.f15643e = !this.f15643e;
            int[] iArr5 = this.f15649k;
            if (iArr5 != null) {
                iArr5[4] = 0;
            }
            if (this.f15645g == null) {
                this.f15645g = new int[10];
            }
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15643e = true;
        if (this.f15642d == null) {
            return;
        }
        while (true) {
            int[] iArr6 = this.f15642d;
            if (i >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                return;
            }
            iArr6[i] = 1;
            i++;
        }
    }

    /* renamed from: k */
    public void m9241k() {
        int i;
        Iterator<Activity> it = this.f15646h.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Activity next = it.next();
            LogoLogUtils.m22166d("LogoApplication", new Throwable(), "activity.getLocalClassName()=" + next.getLocalClassName());
            this.f15643e = this.f15643e ^ true;
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            this.f15643e = true;
            if (!TextUtils.isEmpty(this.f15641c)) {
                int length = this.f15641c.length();
                if (!TextUtils.isEmpty(this.f15640b)) {
                    this.f15640b += this.f15640b.length();
                }
                if (!TextUtils.isEmpty(this.f15640b)) {
                    this.f15640b += this.f15640b.length();
                }
                if (this.f15645g != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = this.f15645g;
                        if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i2] = 0;
                        i2++;
                    }
                }
                this.f15641c += length;
                if (this.f15642d == null) {
                    this.f15642d = new int[10];
                }
                this.f15640b = " year whe";
                this.f15643e = !this.f15643e;
            }
            int[] iArr2 = this.f15649k;
            if (iArr2 != null) {
                iArr2[5] = 0;
            }
            if (this.f15647i.size() < 5) {
                this.f15647i.add("dull. M");
            }
            this.f15640b = " of ";
            if (!next.getLocalClassName().contains("LogoMainActivity")) {
                next.finish();
                this.f15643e = !false;
                ArrayList<String> arrayList = this.f15647i;
                if (arrayList != null && arrayList.size() > 0) {
                    this.f15647i.remove(0);
                }
                if (!TextUtils.isEmpty(this.f15641c)) {
                    int length2 = this.f15641c.length();
                    int[] iArr3 = this.f15645g;
                    if (iArr3 != null) {
                        iArr3[0] = 5;
                    }
                    this.f15643e = !this.f15643e;
                    ArrayList<String> arrayList2 = this.f15647i;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        this.f15647i.remove(0);
                    }
                    this.f15641c += length2;
                    int[] iArr4 = this.f15645g;
                    if (iArr4 != null) {
                        iArr4[2] = 9;
                    }
                    this.f15640b = "You’r";
                    int[] iArr5 = this.f15642d;
                    if (iArr5 != null) {
                        iArr5[9] = 0;
                    }
                }
                if (this.f15647i == null) {
                    this.f15647i = new ArrayList<>();
                }
                int[] iArr6 = this.f15645g;
                if (iArr6 != null) {
                    iArr6[7] = 0;
                }
                if (this.f15642d != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr7 = this.f15642d;
                        if (i3 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                            break;
                        }
                        iArr7[i3] = 0;
                        i3++;
                    }
                }
            }
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            this.f15640b = "t";
            if (this.f15647i.size() < 1) {
                this.f15647i.add("ook");
            }
            this.f15648j = 0.914360849366014d;
            if (this.f15647i.size() < 4) {
                this.f15647i.add("rob");
            }
            this.f15640b = "n nov";
        }
        if (!TextUtils.isEmpty(this.f15640b)) {
            this.f15640b += this.f15640b.length();
        }
        if (this.f15645g != null) {
            int i4 = 0;
            while (true) {
                int[] iArr8 = this.f15645g;
                if (i4 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                    break;
                }
                iArr8[i4] = 5;
                i4++;
            }
        }
        if (this.f15649k != null) {
            int i5 = 0;
            while (true) {
                int[] iArr9 = this.f15649k;
                if (i5 >= (iArr9.length > 3 ? 3 : iArr9.length)) {
                    break;
                }
                iArr9[i5] = 9;
                i5++;
            }
        }
        if (!TextUtils.isEmpty(this.f15641c)) {
            int length3 = this.f15641c.length();
            if (this.f15642d != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr10 = this.f15642d;
                    if (i6 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i6] = 6;
                    i6++;
                }
            }
            if (this.f15645g == null) {
                this.f15645g = new int[10];
            }
            if (this.f15649k != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr11 = this.f15649k;
                    if (i7 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i7] = 3;
                    i7++;
                }
            }
            this.f15641c += length3;
            if (this.f15642d != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr12 = this.f15642d;
                    if (i8 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i8] = 1;
                    i8++;
                }
            }
            this.f15640b = "in man";
            if (this.f15645g != null) {
                int i9 = 0;
                while (true) {
                    int[] iArr13 = this.f15645g;
                    if (i9 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i9] = 4;
                    i9++;
                }
            }
        }
        if (this.f15645g != null) {
            int i10 = 0;
            while (true) {
                int[] iArr14 = this.f15645g;
                if (i10 >= (iArr14.length > 3 ? 3 : iArr14.length)) {
                    break;
                }
                iArr14[i10] = 0;
                i10++;
            }
        }
        if (this.f15645g == null) {
            this.f15645g = new int[10];
        }
        if (this.f15649k == null) {
            return;
        }
        while (true) {
            int[] iArr15 = this.f15649k;
            if (i >= (iArr15.length > 3 ? 3 : iArr15.length)) {
                return;
            }
            iArr15[i] = 5;
            i++;
        }
    }

    /* renamed from: m */
    public final void m9239m() {
        m9237o("initAppLovin");
        int[] iArr = this.f15649k;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15642d;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr3 = this.f15642d;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15641c.length();
            if (this.f15649k != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15649k;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15643e = false;
            this.f15641c += length;
            if (this.f15642d != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15642d;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList = this.f15647i;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr6 = this.f15645g;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15642d;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15649k;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        if (iArr8 != null) {
            iArr8[3] = 9;
        }
        if (iArr7 != null) {
            iArr7[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr9 = this.f15642d;
        if (iArr9 != null) {
            iArr9[9] = 7;
        }
        if (iArr9 != null) {
            iArr9[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15641c.length();
            if (this.f15649k != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr10 = this.f15649k;
                    if (i3 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i3] = 3;
                    i3++;
                }
            }
            this.f15643e = false;
            this.f15641c += length2;
            if (this.f15642d != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr11 = this.f15642d;
                    if (i4 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i4] = 5;
                    i4++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15647i;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr12 = this.f15645g;
        if (iArr12 != null) {
            iArr12[0] = 0;
        }
        int[] iArr13 = this.f15642d;
        if (iArr13 != null) {
            iArr13[2] = 3;
        }
        int[] iArr14 = this.f15649k;
        if (iArr14 != null) {
            iArr14[5] = 2;
        }
        AppLovinSdk.getInstance(this).setMediationProvider("max");
        int[] iArr15 = this.f15649k;
        if (iArr15 != null) {
            iArr15[3] = 9;
        }
        int[] iArr16 = this.f15642d;
        if (iArr16 != null) {
            iArr16[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr17 = this.f15642d;
        if (iArr17 != null) {
            iArr17[9] = 7;
        }
        if (iArr17 != null) {
            iArr17[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15641c.length();
            if (this.f15649k != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr18 = this.f15649k;
                    if (i5 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                        break;
                    }
                    iArr18[i5] = 3;
                    i5++;
                }
            }
            this.f15643e = false;
            this.f15641c += length3;
            if (this.f15642d != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr19 = this.f15642d;
                    if (i6 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                        break;
                    }
                    iArr19[i6] = 5;
                    i6++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15647i;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr20 = this.f15645g;
        if (iArr20 != null) {
            iArr20[0] = 0;
        }
        int[] iArr21 = this.f15642d;
        if (iArr21 != null) {
            iArr21[2] = 3;
        }
        int[] iArr22 = this.f15649k;
        if (iArr22 != null) {
            iArr22[5] = 2;
        }
        AppLovinSdk.getInstance(this).initializeSdk(new AppLovinSdk.SdkInitializationListener() { // from class: sh
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                LogoApplication.this.m9238n(appLovinSdkConfiguration);
            }
        });
        int[] iArr23 = this.f15649k;
        if (iArr23 != null) {
            iArr23[3] = 9;
        }
        int[] iArr24 = this.f15642d;
        if (iArr24 != null) {
            iArr24[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr25 = this.f15642d;
        if (iArr25 != null) {
            iArr25[9] = 7;
        }
        if (iArr25 != null) {
            iArr25[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length4 = this.f15641c.length();
            if (this.f15649k != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr26 = this.f15649k;
                    if (i7 >= (iArr26.length > 3 ? 3 : iArr26.length)) {
                        break;
                    }
                    iArr26[i7] = 3;
                    i7++;
                }
            }
            this.f15643e = false;
            this.f15641c += length4;
            if (this.f15642d != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr27 = this.f15642d;
                    if (i8 >= (iArr27.length > 3 ? 3 : iArr27.length)) {
                        break;
                    }
                    iArr27[i8] = 5;
                    i8++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList4 = this.f15647i;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr28 = this.f15645g;
        if (iArr28 != null) {
            iArr28[0] = 0;
        }
        int[] iArr29 = this.f15642d;
        if (iArr29 != null) {
            iArr29[2] = 3;
        }
        int[] iArr30 = this.f15649k;
        if (iArr30 != null) {
            iArr30[5] = 2;
        }
    }

    /* renamed from: o */
    public final void m9237o(String str) {
        int[] iArr = this.f15649k;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15642d;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr3 = this.f15642d;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15641c.length();
            if (this.f15649k != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15649k;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15643e = false;
            this.f15641c += length;
            if (this.f15642d != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15642d;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList = this.f15647i;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr6 = this.f15645g;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15642d;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15649k;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        if (iArr8 != null) {
            iArr8[3] = 9;
        }
        if (iArr7 != null) {
            iArr7[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr9 = this.f15642d;
        if (iArr9 != null) {
            iArr9[9] = 7;
        }
        if (iArr9 != null) {
            iArr9[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15641c.length();
            if (this.f15649k != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr10 = this.f15649k;
                    if (i3 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i3] = 3;
                    i3++;
                }
            }
            this.f15643e = false;
            this.f15641c += length2;
            if (this.f15642d != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr11 = this.f15642d;
                    if (i4 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i4] = 5;
                    i4++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15647i;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr12 = this.f15645g;
        if (iArr12 != null) {
            iArr12[0] = 0;
        }
        int[] iArr13 = this.f15642d;
        if (iArr13 != null) {
            iArr13[2] = 3;
        }
        int[] iArr14 = this.f15649k;
        if (iArr14 != null) {
            iArr14[5] = 2;
        }
    }

    @Override // com.logomaster.logomaker.config.BaseLogoApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        int[] iArr = this.f15649k;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15642d;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr3 = this.f15642d;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15641c.length();
            if (this.f15649k != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15649k;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15643e = false;
            this.f15641c += length;
            if (this.f15642d != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15642d;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList = this.f15647i;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr6 = this.f15645g;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15642d;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15649k;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        this.f15646h = new ArrayList();
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        int[] iArr9 = this.f15645g;
        if (iArr9 != null) {
            iArr9[5] = 0;
        }
        if (iArr9 == null) {
            this.f15645g = new int[10];
        }
        this.f15648j = Math.abs(this.f15648j);
        int[] iArr10 = this.f15645g;
        if (iArr10 != null) {
            iArr10[0] = 0;
        }
        int[] iArr11 = this.f15649k;
        if (iArr11 != null) {
            iArr11[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        try {
            m9235q();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m9234r();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            m9239m();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m9236p(Activity activity) {
        this.f15646h.remove(activity);
        this.f15640b = "fore pe";
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.f15640b)) {
            this.f15640b += this.f15640b.length();
        }
        this.f15648j -= 0.22583639454646431d;
        if (this.f15642d != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.f15642d;
                if (i >= (iArr.length <= 3 ? iArr.length : 3)) {
                    break;
                }
                iArr[i] = 7;
                i++;
            }
        }
        int[] iArr2 = this.f15642d;
        if (iArr2 != null) {
            iArr2[7] = 8;
        }
        int[] iArr3 = this.f15645g;
        if (iArr3 != null) {
            iArr3[1] = 0;
        }
    }

    /* renamed from: q */
    public final void m9235q() {
        int[] iArr = this.f15649k;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15642d;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr3 = this.f15642d;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15641c.length();
            if (this.f15649k != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15649k;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15643e = false;
            this.f15641c += length;
            if (this.f15642d != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15642d;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList = this.f15647i;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr6 = this.f15645g;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15642d;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15649k;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        try {
            AppsFlyerLib.getInstance().init(getResources().getString(R.string.apps_f_key), new C9438a(), this);
            int[] iArr9 = this.f15649k;
            if (iArr9 != null) {
                iArr9[3] = 9;
            }
            int[] iArr10 = this.f15642d;
            if (iArr10 != null) {
                iArr10[8] = 0;
            }
            if (this.f15647i == null) {
                this.f15647i = new ArrayList<>();
            }
            this.f15641c = ";paddingStart";
            this.f15643e = true;
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            if (this.f15642d == null) {
                this.f15642d = new int[10];
            }
            f15639o = this;
            this.f15643e = false;
            int[] iArr11 = this.f15642d;
            if (iArr11 != null) {
                iArr11[9] = 7;
            }
            if (iArr11 != null) {
                iArr11[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = this.f15641c.length();
                if (this.f15649k != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr12 = this.f15649k;
                        if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i3] = 3;
                        i3++;
                    }
                }
                boolean z = this.f15643e;
                this.f15643e = false;
                this.f15641c += length2;
                if (this.f15642d != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr13 = this.f15642d;
                        if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i4] = 5;
                        i4++;
                    }
                }
                if (this.f15647i.size() < 1) {
                    this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList2 = this.f15647i;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.f15647i.remove(0);
                }
            }
            int[] iArr14 = this.f15645g;
            if (iArr14 != null) {
                iArr14[0] = 0;
            }
            int[] iArr15 = this.f15642d;
            if (iArr15 != null) {
                iArr15[2] = 3;
            }
            int[] iArr16 = this.f15649k;
            if (iArr16 != null) {
                iArr16[5] = 2;
            }
            AppsFlyerLib.getInstance().start(this);
            int[] iArr17 = this.f15649k;
            if (iArr17 != null) {
                iArr17[3] = 9;
            }
            int[] iArr18 = this.f15642d;
            if (iArr18 != null) {
                iArr18[8] = 0;
            }
            if (this.f15647i == null) {
                this.f15647i = new ArrayList<>();
            }
            this.f15641c = ";paddingStart";
            this.f15643e = true;
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            if (this.f15642d == null) {
                this.f15642d = new int[10];
            }
            f15639o = this;
            this.f15643e = false;
            int[] iArr19 = this.f15642d;
            if (iArr19 != null) {
                iArr19[9] = 7;
            }
            if (iArr19 != null) {
                iArr19[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length3 = this.f15641c.length();
                if (this.f15649k != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr20 = this.f15649k;
                        if (i5 >= (iArr20.length > 3 ? 3 : iArr20.length)) {
                            break;
                        }
                        iArr20[i5] = 3;
                        i5++;
                    }
                }
                boolean z2 = this.f15643e;
                this.f15643e = false;
                this.f15641c += length3;
                if (this.f15642d != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr21 = this.f15642d;
                        if (i6 >= (iArr21.length > 3 ? 3 : iArr21.length)) {
                            break;
                        }
                        iArr21[i6] = 5;
                        i6++;
                    }
                }
                if (this.f15647i.size() < 1) {
                    this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList3 = this.f15647i;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    this.f15647i.remove(0);
                }
            }
            int[] iArr22 = this.f15645g;
            if (iArr22 != null) {
                iArr22[0] = 0;
            }
            int[] iArr23 = this.f15642d;
            if (iArr23 != null) {
                iArr23[2] = 3;
            }
            int[] iArr24 = this.f15649k;
            if (iArr24 != null) {
                iArr24[5] = 2;
            }
            if (iArr24 != null) {
                try {
                    iArr24[3] = 9;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (iArr23 != null) {
                iArr23[8] = 0;
            }
            if (this.f15647i == null) {
                this.f15647i = new ArrayList<>();
            }
            this.f15641c = ";paddingStart";
            this.f15643e = true;
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            if (this.f15642d == null) {
                this.f15642d = new int[10];
            }
            f15639o = this;
            this.f15643e = false;
            int[] iArr25 = this.f15642d;
            if (iArr25 != null) {
                iArr25[9] = 7;
            }
            if (iArr25 != null) {
                iArr25[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length4 = this.f15641c.length();
                if (this.f15649k != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr26 = this.f15649k;
                        if (i7 >= (iArr26.length > 3 ? 3 : iArr26.length)) {
                            break;
                        }
                        iArr26[i7] = 3;
                        i7++;
                    }
                }
                boolean z3 = this.f15643e;
                this.f15643e = false;
                this.f15641c += length4;
                if (this.f15642d != null) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr27 = this.f15642d;
                        if (i8 >= (iArr27.length > 3 ? 3 : iArr27.length)) {
                            break;
                        }
                        iArr27[i8] = 5;
                        i8++;
                    }
                }
                if (this.f15647i.size() < 1) {
                    this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList4 = this.f15647i;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.f15647i.remove(0);
                }
            }
            int[] iArr28 = this.f15645g;
            if (iArr28 != null) {
                iArr28[0] = 0;
            }
            int[] iArr29 = this.f15642d;
            if (iArr29 != null) {
                iArr29[2] = 3;
            }
            int[] iArr30 = this.f15649k;
            if (iArr30 != null) {
                iArr30[5] = 2;
            }
            this.f15652n = SPUtils.m878a("LoGoData", 0).m877b("lo_f");
            int[] iArr31 = this.f15649k;
            if (iArr31 != null) {
                iArr31[3] = 9;
            }
            int[] iArr32 = this.f15642d;
            if (iArr32 != null) {
                iArr32[8] = 0;
            }
            if (this.f15647i == null) {
                this.f15647i = new ArrayList<>();
            }
            this.f15641c = ";paddingStart";
            this.f15643e = true;
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            if (this.f15642d == null) {
                this.f15642d = new int[10];
            }
            f15639o = this;
            this.f15643e = false;
            int[] iArr33 = this.f15642d;
            if (iArr33 != null) {
                iArr33[9] = 7;
            }
            if (iArr33 != null) {
                iArr33[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length5 = this.f15641c.length();
                if (this.f15649k != null) {
                    int i9 = 0;
                    while (true) {
                        int[] iArr34 = this.f15649k;
                        if (i9 >= (iArr34.length > 3 ? 3 : iArr34.length)) {
                            break;
                        }
                        iArr34[i9] = 3;
                        i9++;
                    }
                }
                boolean z4 = this.f15643e;
                this.f15643e = false;
                this.f15641c += length5;
                if (this.f15642d != null) {
                    int i10 = 0;
                    while (true) {
                        int[] iArr35 = this.f15642d;
                        if (i10 >= (iArr35.length > 3 ? 3 : iArr35.length)) {
                            break;
                        }
                        iArr35[i10] = 5;
                        i10++;
                    }
                }
                if (this.f15647i.size() < 1) {
                    this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList5 = this.f15647i;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.f15647i.remove(0);
                }
            }
            int[] iArr36 = this.f15645g;
            if (iArr36 != null) {
                iArr36[0] = 0;
            }
            int[] iArr37 = this.f15642d;
            if (iArr37 != null) {
                iArr37[2] = 3;
            }
            int[] iArr38 = this.f15649k;
            if (iArr38 != null) {
                iArr38[5] = 2;
            }
            if (this.f15652n <= 0) {
                if (iArr38 != null) {
                    iArr38[3] = 9;
                }
                if (iArr37 != null) {
                    iArr37[8] = 0;
                }
                if (this.f15647i == null) {
                    this.f15647i = new ArrayList<>();
                }
                this.f15641c = ";paddingStart";
                this.f15643e = true;
                if (this.f15649k == null) {
                    this.f15649k = new int[10];
                }
                if (this.f15642d == null) {
                    this.f15642d = new int[10];
                }
                f15639o = this;
                this.f15643e = false;
                int[] iArr39 = this.f15642d;
                if (iArr39 != null) {
                    iArr39[9] = 7;
                }
                if (iArr39 != null) {
                    iArr39[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length6 = this.f15641c.length();
                    if (this.f15649k != null) {
                        int i11 = 0;
                        while (true) {
                            int[] iArr40 = this.f15649k;
                            if (i11 >= (iArr40.length > 3 ? 3 : iArr40.length)) {
                                break;
                            }
                            iArr40[i11] = 3;
                            i11++;
                        }
                    }
                    boolean z5 = this.f15643e;
                    this.f15643e = false;
                    this.f15641c += length6;
                    if (this.f15642d != null) {
                        int i12 = 0;
                        while (true) {
                            int[] iArr41 = this.f15642d;
                            if (i12 >= (iArr41.length > 3 ? 3 : iArr41.length)) {
                                break;
                            }
                            iArr41[i12] = 5;
                            i12++;
                        }
                    }
                    if (this.f15647i.size() < 1) {
                        this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList6 = this.f15647i;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        this.f15647i.remove(0);
                    }
                }
                int[] iArr42 = this.f15645g;
                if (iArr42 != null) {
                    iArr42[0] = 0;
                }
                int[] iArr43 = this.f15642d;
                if (iArr43 != null) {
                    iArr43[2] = 3;
                }
                int[] iArr44 = this.f15649k;
                if (iArr44 != null) {
                    iArr44[5] = 2;
                }
                AppsFlyerLib.getInstance().logEvent(getApplicationContext(), "B_ON_APP", null);
                int[] iArr45 = this.f15649k;
                if (iArr45 != null) {
                    iArr45[3] = 9;
                }
                int[] iArr46 = this.f15642d;
                if (iArr46 != null) {
                    iArr46[8] = 0;
                }
                if (this.f15647i == null) {
                    this.f15647i = new ArrayList<>();
                }
                this.f15641c = ";paddingStart";
                this.f15643e = true;
                if (this.f15649k == null) {
                    this.f15649k = new int[10];
                }
                if (this.f15642d == null) {
                    this.f15642d = new int[10];
                }
                f15639o = this;
                this.f15643e = false;
                int[] iArr47 = this.f15642d;
                if (iArr47 != null) {
                    iArr47[9] = 7;
                }
                if (iArr47 != null) {
                    iArr47[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length7 = this.f15641c.length();
                    if (this.f15649k != null) {
                        int i13 = 0;
                        while (true) {
                            int[] iArr48 = this.f15649k;
                            if (i13 >= (iArr48.length > 3 ? 3 : iArr48.length)) {
                                break;
                            }
                            iArr48[i13] = 3;
                            i13++;
                        }
                    }
                    boolean z6 = this.f15643e;
                    this.f15643e = false;
                    this.f15641c += length7;
                    if (this.f15642d != null) {
                        int i14 = 0;
                        while (true) {
                            int[] iArr49 = this.f15642d;
                            if (i14 >= (iArr49.length > 3 ? 3 : iArr49.length)) {
                                break;
                            }
                            iArr49[i14] = 5;
                            i14++;
                        }
                    }
                    if (this.f15647i.size() < 1) {
                        this.f15647i.add(" than ");
                    }
                    ArrayList<String> arrayList7 = this.f15647i;
                    if (arrayList7 != null && arrayList7.size() > 0) {
                        this.f15647i.remove(0);
                    }
                }
                int[] iArr50 = this.f15645g;
                if (iArr50 != null) {
                    iArr50[0] = 0;
                }
                int[] iArr51 = this.f15642d;
                if (iArr51 != null) {
                    iArr51[2] = 3;
                }
                int[] iArr52 = this.f15649k;
                if (iArr52 != null) {
                    iArr52[5] = 2;
                }
            }
            int[] iArr53 = this.f15649k;
            if (iArr53 != null) {
                iArr53[3] = 9;
            }
            int[] iArr54 = this.f15642d;
            if (iArr54 != null) {
                iArr54[8] = 0;
            }
            if (this.f15647i == null) {
                this.f15647i = new ArrayList<>();
            }
            this.f15641c = ";paddingStart";
            this.f15643e = true;
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            if (this.f15642d == null) {
                this.f15642d = new int[10];
            }
            f15639o = this;
            this.f15643e = false;
            int[] iArr55 = this.f15642d;
            if (iArr55 != null) {
                iArr55[9] = 7;
            }
            if (iArr55 != null) {
                iArr55[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length8 = this.f15641c.length();
                if (this.f15649k != null) {
                    int i15 = 0;
                    while (true) {
                        int[] iArr56 = this.f15649k;
                        if (i15 >= (iArr56.length > 3 ? 3 : iArr56.length)) {
                            break;
                        }
                        iArr56[i15] = 3;
                        i15++;
                    }
                }
                boolean z7 = this.f15643e;
                this.f15643e = false;
                this.f15641c += length8;
                if (this.f15642d != null) {
                    int i16 = 0;
                    while (true) {
                        int[] iArr57 = this.f15642d;
                        if (i16 >= (iArr57.length > 3 ? 3 : iArr57.length)) {
                            break;
                        }
                        iArr57[i16] = 5;
                        i16++;
                    }
                }
                if (this.f15647i.size() < 1) {
                    this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList8 = this.f15647i;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.f15647i.remove(0);
                }
            }
            int[] iArr58 = this.f15645g;
            if (iArr58 != null) {
                iArr58[0] = 0;
            }
            int[] iArr59 = this.f15642d;
            if (iArr59 != null) {
                iArr59[2] = 3;
            }
            int[] iArr60 = this.f15649k;
            if (iArr60 != null) {
                iArr60[5] = 2;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        int[] iArr61 = this.f15649k;
        if (iArr61 != null) {
            iArr61[3] = 9;
        }
        int[] iArr62 = this.f15642d;
        if (iArr62 != null) {
            iArr62[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr63 = this.f15642d;
        if (iArr63 != null) {
            iArr63[9] = 7;
        }
        if (iArr63 != null) {
            iArr63[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length9 = this.f15641c.length();
            if (this.f15649k != null) {
                int i17 = 0;
                while (true) {
                    int[] iArr64 = this.f15649k;
                    if (i17 >= (iArr64.length > 3 ? 3 : iArr64.length)) {
                        break;
                    }
                    iArr64[i17] = 3;
                    i17++;
                }
            }
            this.f15643e = false;
            this.f15641c += length9;
            if (this.f15642d != null) {
                int i18 = 0;
                while (true) {
                    int[] iArr65 = this.f15642d;
                    if (i18 >= (iArr65.length > 3 ? 3 : iArr65.length)) {
                        break;
                    }
                    iArr65[i18] = 5;
                    i18++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList9 = this.f15647i;
            if (arrayList9 != null && arrayList9.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr66 = this.f15645g;
        if (iArr66 != null) {
            iArr66[0] = 0;
        }
        int[] iArr67 = this.f15642d;
        if (iArr67 != null) {
            iArr67[2] = 3;
        }
        int[] iArr68 = this.f15649k;
        if (iArr68 != null) {
            iArr68[5] = 2;
        }
    }

    /* renamed from: r */
    public final void m9234r() {
        int[] iArr = this.f15649k;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15642d;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr3 = this.f15642d;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15641c.length();
            if (this.f15649k != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15649k;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15643e = false;
            this.f15641c += length;
            if (this.f15642d != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15642d;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList = this.f15647i;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr6 = this.f15645g;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15642d;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15649k;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        this.f15652n = SPUtils.m878a("LoGoData", 0).m877b("lo_f");
        int[] iArr9 = this.f15649k;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15642d;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr11 = this.f15642d;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15641c.length();
            if (this.f15649k != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr12 = this.f15649k;
                    if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i3] = 3;
                    i3++;
                }
            }
            this.f15643e = false;
            this.f15641c += length2;
            if (this.f15642d != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr13 = this.f15642d;
                    if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i4] = 5;
                    i4++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15647i;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr14 = this.f15645g;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15642d;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15649k;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
        m9237o("startF:" + this.f15652n + " fbCount:" + this.f15651m);
        int[] iArr17 = this.f15649k;
        if (iArr17 != null) {
            iArr17[3] = 9;
        }
        int[] iArr18 = this.f15642d;
        if (iArr18 != null) {
            iArr18[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr19 = this.f15642d;
        if (iArr19 != null) {
            iArr19[9] = 7;
        }
        if (iArr19 != null) {
            iArr19[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15641c.length();
            if (this.f15649k != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr20 = this.f15649k;
                    if (i5 >= (iArr20.length > 3 ? 3 : iArr20.length)) {
                        break;
                    }
                    iArr20[i5] = 3;
                    i5++;
                }
            }
            this.f15643e = false;
            this.f15641c += length3;
            if (this.f15642d != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr21 = this.f15642d;
                    if (i6 >= (iArr21.length > 3 ? 3 : iArr21.length)) {
                        break;
                    }
                    iArr21[i6] = 5;
                    i6++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15647i;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr22 = this.f15645g;
        if (iArr22 != null) {
            iArr22[0] = 0;
        }
        int[] iArr23 = this.f15642d;
        if (iArr23 != null) {
            iArr23[2] = 3;
        }
        int[] iArr24 = this.f15649k;
        if (iArr24 != null) {
            iArr24[5] = 2;
        }
        if (this.f15652n > 0) {
            if (iArr24 != null) {
                iArr24[3] = 9;
            }
            if (iArr23 != null) {
                iArr23[8] = 0;
            }
            if (this.f15647i == null) {
                this.f15647i = new ArrayList<>();
            }
            this.f15641c = ";paddingStart";
            this.f15643e = true;
            if (this.f15649k == null) {
                this.f15649k = new int[10];
            }
            if (this.f15642d == null) {
                this.f15642d = new int[10];
            }
            f15639o = this;
            this.f15643e = false;
            int[] iArr25 = this.f15642d;
            if (iArr25 != null) {
                iArr25[9] = 7;
            }
            if (iArr25 != null) {
                iArr25[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length4 = this.f15641c.length();
                if (this.f15649k != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr26 = this.f15649k;
                        if (i7 >= (iArr26.length > 3 ? 3 : iArr26.length)) {
                            break;
                        }
                        iArr26[i7] = 3;
                        i7++;
                    }
                }
                this.f15643e = false;
                this.f15641c += length4;
                if (this.f15642d != null) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr27 = this.f15642d;
                        if (i8 >= (iArr27.length > 3 ? 3 : iArr27.length)) {
                            break;
                        }
                        iArr27[i8] = 5;
                        i8++;
                    }
                }
                if (this.f15647i.size() < 1) {
                    this.f15647i.add(" than ");
                }
                ArrayList<String> arrayList4 = this.f15647i;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.f15647i.remove(0);
                }
            }
            int[] iArr28 = this.f15645g;
            if (iArr28 != null) {
                iArr28[0] = 0;
            }
            int[] iArr29 = this.f15642d;
            if (iArr29 != null) {
                iArr29[2] = 3;
            }
            int[] iArr30 = this.f15649k;
            if (iArr30 != null) {
                iArr30[5] = 2;
                return;
            }
            return;
        }
        if (iArr24 != null) {
            iArr24[3] = 9;
        }
        if (iArr23 != null) {
            iArr23[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr31 = this.f15642d;
        if (iArr31 != null) {
            iArr31[9] = 7;
        }
        if (iArr31 != null) {
            iArr31[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length5 = this.f15641c.length();
            if (this.f15649k != null) {
                int i9 = 0;
                while (true) {
                    int[] iArr32 = this.f15649k;
                    if (i9 >= (iArr32.length > 3 ? 3 : iArr32.length)) {
                        break;
                    }
                    iArr32[i9] = 3;
                    i9++;
                }
            }
            this.f15643e = false;
            this.f15641c += length5;
            if (this.f15642d != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr33 = this.f15642d;
                    if (i10 >= (iArr33.length > 3 ? 3 : iArr33.length)) {
                        break;
                    }
                    iArr33[i10] = 5;
                    i10++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList5 = this.f15647i;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr34 = this.f15645g;
        if (iArr34 != null) {
            iArr34[0] = 0;
        }
        int[] iArr35 = this.f15642d;
        if (iArr35 != null) {
            iArr35[2] = 3;
        }
        int[] iArr36 = this.f15649k;
        if (iArr36 != null) {
            iArr36[5] = 2;
        }
        if (this.f15650l || this.f15651m >= 6) {
            return;
        }
        if (iArr36 != null) {
            iArr36[3] = 9;
        }
        if (iArr35 != null) {
            iArr35[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr37 = this.f15642d;
        if (iArr37 != null) {
            iArr37[9] = 7;
        }
        if (iArr37 != null) {
            iArr37[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length6 = this.f15641c.length();
            if (this.f15649k != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr38 = this.f15649k;
                    if (i11 >= (iArr38.length > 3 ? 3 : iArr38.length)) {
                        break;
                    }
                    iArr38[i11] = 3;
                    i11++;
                }
            }
            this.f15643e = false;
            this.f15641c += length6;
            if (this.f15642d != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr39 = this.f15642d;
                    if (i12 >= (iArr39.length > 3 ? 3 : iArr39.length)) {
                        break;
                    }
                    iArr39[i12] = 5;
                    i12++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList6 = this.f15647i;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr40 = this.f15645g;
        if (iArr40 != null) {
            iArr40[0] = 0;
        }
        int[] iArr41 = this.f15642d;
        if (iArr41 != null) {
            iArr41[2] = 3;
        }
        int[] iArr42 = this.f15649k;
        if (iArr42 != null) {
            iArr42[5] = 2;
        }
        this.f15650l = true;
        if (iArr42 != null) {
            iArr42[3] = 9;
        }
        if (iArr41 != null) {
            iArr41[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr43 = this.f15642d;
        if (iArr43 != null) {
            iArr43[9] = 7;
        }
        if (iArr43 != null) {
            iArr43[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length7 = this.f15641c.length();
            if (this.f15649k != null) {
                int i13 = 0;
                while (true) {
                    int[] iArr44 = this.f15649k;
                    if (i13 >= (iArr44.length > 3 ? 3 : iArr44.length)) {
                        break;
                    }
                    iArr44[i13] = 3;
                    i13++;
                }
            }
            this.f15643e = false;
            this.f15641c += length7;
            if (this.f15642d != null) {
                int i14 = 0;
                while (true) {
                    int[] iArr45 = this.f15642d;
                    if (i14 >= (iArr45.length > 3 ? 3 : iArr45.length)) {
                        break;
                    }
                    iArr45[i14] = 5;
                    i14++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList7 = this.f15647i;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr46 = this.f15645g;
        if (iArr46 != null) {
            iArr46[0] = 0;
        }
        int[] iArr47 = this.f15642d;
        if (iArr47 != null) {
            iArr47[2] = 3;
        }
        int[] iArr48 = this.f15649k;
        if (iArr48 != null) {
            iArr48[5] = 2;
        }
        FacebookSdk.setAutoInitEnabled(true);
        int[] iArr49 = this.f15649k;
        if (iArr49 != null) {
            iArr49[3] = 9;
        }
        int[] iArr50 = this.f15642d;
        if (iArr50 != null) {
            iArr50[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr51 = this.f15642d;
        if (iArr51 != null) {
            iArr51[9] = 7;
        }
        if (iArr51 != null) {
            iArr51[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length8 = this.f15641c.length();
            if (this.f15649k != null) {
                int i15 = 0;
                while (true) {
                    int[] iArr52 = this.f15649k;
                    if (i15 >= (iArr52.length > 3 ? 3 : iArr52.length)) {
                        break;
                    }
                    iArr52[i15] = 3;
                    i15++;
                }
            }
            this.f15643e = false;
            this.f15641c += length8;
            if (this.f15642d != null) {
                int i16 = 0;
                while (true) {
                    int[] iArr53 = this.f15642d;
                    if (i16 >= (iArr53.length > 3 ? 3 : iArr53.length)) {
                        break;
                    }
                    iArr53[i16] = 5;
                    i16++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList8 = this.f15647i;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr54 = this.f15645g;
        if (iArr54 != null) {
            iArr54[0] = 0;
        }
        int[] iArr55 = this.f15642d;
        if (iArr55 != null) {
            iArr55[2] = 3;
        }
        int[] iArr56 = this.f15649k;
        if (iArr56 != null) {
            iArr56[5] = 2;
        }
        FacebookSdk.fullyInitialize();
        int[] iArr57 = this.f15649k;
        if (iArr57 != null) {
            iArr57[3] = 9;
        }
        int[] iArr58 = this.f15642d;
        if (iArr58 != null) {
            iArr58[8] = 0;
        }
        if (this.f15647i == null) {
            this.f15647i = new ArrayList<>();
        }
        this.f15641c = ";paddingStart";
        this.f15643e = true;
        if (this.f15649k == null) {
            this.f15649k = new int[10];
        }
        if (this.f15642d == null) {
            this.f15642d = new int[10];
        }
        f15639o = this;
        this.f15643e = false;
        int[] iArr59 = this.f15642d;
        if (iArr59 != null) {
            iArr59[9] = 7;
        }
        if (iArr59 != null) {
            iArr59[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length9 = this.f15641c.length();
            if (this.f15649k != null) {
                int i17 = 0;
                while (true) {
                    int[] iArr60 = this.f15649k;
                    if (i17 >= (iArr60.length > 3 ? 3 : iArr60.length)) {
                        break;
                    }
                    iArr60[i17] = 3;
                    i17++;
                }
            }
            this.f15643e = false;
            this.f15641c += length9;
            if (this.f15642d != null) {
                int i18 = 0;
                while (true) {
                    int[] iArr61 = this.f15642d;
                    if (i18 >= (iArr61.length > 3 ? 3 : iArr61.length)) {
                        break;
                    }
                    iArr61[i18] = 5;
                    i18++;
                }
            }
            if (this.f15647i.size() < 1) {
                this.f15647i.add(" than ");
            }
            ArrayList<String> arrayList9 = this.f15647i;
            if (arrayList9 != null && arrayList9.size() > 0) {
                this.f15647i.remove(0);
            }
        }
        int[] iArr62 = this.f15645g;
        if (iArr62 != null) {
            iArr62[0] = 0;
        }
        int[] iArr63 = this.f15642d;
        if (iArr63 != null) {
            iArr63[2] = 3;
        }
        int[] iArr64 = this.f15649k;
        if (iArr64 != null) {
            iArr64[5] = 2;
        }
        AppLinkData.fetchDeferredAppLinkData(getApplicationContext(), new C9439b());
    }
}
