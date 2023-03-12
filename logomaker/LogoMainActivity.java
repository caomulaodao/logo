package com.logomaster.logomaker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;
import com.logomaster.logomaker.base.LogoBaseActivity;
import com.logomaster.logomaker.config.BaseLogoApplication;
import com.logomaster.logomaker.config.LogoSettingsActivity;
import com.logomaster.logomaker.databinding.ActivityMainBinding;
import com.logomaster.logomaker.p131vm.LogoMainVM;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoMainActivity extends LogoBaseActivity {
    private static final String TAG = "MainActivity";
    public ActivityMainBinding binding;
    public LogoMainVM logoMainVM;
    private LogoRateUsDialog logoRateUsDialog;
    private LogoRuleDialog logoRuleDialog;
    public ArrayList<String> abc1000 = new ArrayList<>();
    public ArrayList<String> abc0 = new ArrayList<>();
    public String[] abc1001 = new String[17];
    public ArrayList<Integer> abc1002 = new ArrayList<>();
    public ArrayList<Integer> abc1 = new ArrayList<>();
    public ArrayList<Integer> abc1003 = new ArrayList<>();
    public ArrayList<Integer> abc1004 = new ArrayList<>();
    public ArrayList<String> abc2 = new ArrayList<>();
    public float abc1005 = 0.8177675f;
    public int[] abc1006 = new int[15];
    public String abc3 = "sdfhpgelaocajkf";
    public ArrayList<Integer> abc1007 = new ArrayList<>();

    /* renamed from: b */
    private boolean f15768b = true;
    public String[] abc1008 = new String[13];
    public int abc4 = 6;
    public ArrayList<Integer> abc1009 = new ArrayList<>();
    public boolean abc10010 = false;
    public float abc5 = 0.21760398f;
    public String[] abc10011 = new String[13];
    private int startF = 0;

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9541a implements View.OnClickListener {
        public View$OnClickListenerC9541a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(LogoMainActivity.this, LogoMyLogoActivity.class);
            LogoMainActivity logoMainActivity = LogoMainActivity.this;
            if (logoMainActivity.abc10011 == null) {
                logoMainActivity.abc10011 = new String[10];
            }
            if (logoMainActivity.abc1000 == null) {
                logoMainActivity.abc1000 = new ArrayList<>();
            }
            if (LogoMainActivity.this.abc1006 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoMainActivity.this.abc1006;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 2;
                    i++;
                }
            }
            if (LogoMainActivity.this.abc1.size() < 3) {
                LogoMainActivity.this.abc1.add(5);
                LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
                String[] strArr = logoMainActivity2.abc1001;
                if (strArr != null) {
                    strArr[2] = " student";
                }
                logoMainActivity2.abc10010 = !logoMainActivity2.abc10010;
                ArrayList<Integer> arrayList = logoMainActivity2.abc1002;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
            }
            if (LogoMainActivity.this.abc1003.size() > 2) {
                LogoMainActivity.this.abc1003.add(8);
            }
            LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
            int[] iArr2 = logoMainActivity3.abc1006;
            if (iArr2 != null) {
                iArr2[1] = 4;
            }
            String[] strArr2 = logoMainActivity3.abc10011;
            if (strArr2 != null) {
                strArr2[1] = null;
            }
            logoMainActivity3.startActivity(intent);
            ArrayList<Integer> arrayList2 = LogoMainActivity.this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            ArrayList<Integer> arrayList3 = LogoMainActivity.this.abc1003;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoMainActivity.this.abc1003.remove(0);
            }
            ArrayList<String> arrayList4 = LogoMainActivity.this.abc1000;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoMainActivity.this.abc1000.remove(0);
            }
            LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
            logoMainActivity4.abc3 = "热门故事超A";
            if (logoMainActivity4.abc1004.size() < 0) {
                LogoMainActivity.this.abc1004.add(9);
            }
            LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
            if (logoMainActivity5.abc1006 == null) {
                logoMainActivity5.abc1006 = new int[10];
            }
            logoMainActivity5.abc1005 = 0.046683013f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$b */
    /* loaded from: classes3.dex */
    public class C9542b implements AppLinkData.CompletionHandler {
        public C9542b() {
        }

        @Override // com.facebook.applinks.AppLinkData.CompletionHandler
        public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
            LogoMainActivity logoMainActivity = LogoMainActivity.this;
            logoMainActivity.abc10010 = false;
            if (logoMainActivity.abc1006 == null) {
                logoMainActivity.abc1006 = new int[10];
            }
            logoMainActivity.abc10010 = !false;
            if (logoMainActivity.abc2.size() > 8) {
                LogoMainActivity.this.abc2.add("t=dime");
                if (LogoMainActivity.this.abc1003.size() < 1) {
                    LogoMainActivity.this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList = LogoMainActivity.this.abc1004;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList2 = LogoMainActivity.this.abc1002;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
            }
            if (LogoMainActivity.this.abc1002.size() > 9) {
                LogoMainActivity.this.abc1002.add(8);
            }
            LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
            String[] strArr = logoMainActivity2.abc1008;
            if (strArr != null) {
                strArr[2] = "t ";
            }
            if (logoMainActivity2.abc1003.size() < 9) {
                LogoMainActivity.this.abc1003.add(5);
            }
            LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
            logoMainActivity3.logMsg("appLinkData:" + appLinkData);
            LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
            logoMainActivity4.abc10010 = false;
            if (logoMainActivity4.abc1006 == null) {
                logoMainActivity4.abc1006 = new int[10];
            }
            logoMainActivity4.abc10010 = !false;
            if (logoMainActivity4.abc2.size() > 8) {
                LogoMainActivity.this.abc2.add("t=dime");
                if (LogoMainActivity.this.abc1003.size() < 1) {
                    LogoMainActivity.this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList3 = LogoMainActivity.this.abc1004;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList4 = LogoMainActivity.this.abc1002;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
            }
            if (LogoMainActivity.this.abc1002.size() > 9) {
                LogoMainActivity.this.abc1002.add(8);
            }
            LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
            String[] strArr2 = logoMainActivity5.abc1008;
            if (strArr2 != null) {
                strArr2[2] = "t ";
            }
            if (logoMainActivity5.abc1003.size() < 9) {
                LogoMainActivity.this.abc1003.add(5);
            }
            LogoMainActivity.this.startF = SPUtils.m878a("LoGoData", 0).m877b("lo_f");
            LogoMainActivity logoMainActivity6 = LogoMainActivity.this;
            logoMainActivity6.abc10010 = false;
            if (logoMainActivity6.abc1006 == null) {
                logoMainActivity6.abc1006 = new int[10];
            }
            logoMainActivity6.abc10010 = !false;
            if (logoMainActivity6.abc2.size() > 8) {
                LogoMainActivity.this.abc2.add("t=dime");
                if (LogoMainActivity.this.abc1003.size() < 1) {
                    LogoMainActivity.this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList5 = LogoMainActivity.this.abc1004;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList6 = LogoMainActivity.this.abc1002;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
            }
            if (LogoMainActivity.this.abc1002.size() > 9) {
                LogoMainActivity.this.abc1002.add(8);
            }
            LogoMainActivity logoMainActivity7 = LogoMainActivity.this;
            String[] strArr3 = logoMainActivity7.abc1008;
            if (strArr3 != null) {
                strArr3[2] = "t ";
            }
            if (logoMainActivity7.abc1003.size() < 9) {
                LogoMainActivity.this.abc1003.add(5);
            }
            LogoMainActivity logoMainActivity8 = LogoMainActivity.this;
            logoMainActivity8.logMsg("startF:" + LogoMainActivity.this.startF);
            LogoMainActivity logoMainActivity9 = LogoMainActivity.this;
            logoMainActivity9.abc10010 = false;
            if (logoMainActivity9.abc1006 == null) {
                logoMainActivity9.abc1006 = new int[10];
            }
            logoMainActivity9.abc10010 = !false;
            if (logoMainActivity9.abc2.size() > 8) {
                LogoMainActivity.this.abc2.add("t=dime");
                if (LogoMainActivity.this.abc1003.size() < 1) {
                    LogoMainActivity.this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList7 = LogoMainActivity.this.abc1004;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList8 = LogoMainActivity.this.abc1002;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
            }
            if (LogoMainActivity.this.abc1002.size() > 9) {
                LogoMainActivity.this.abc1002.add(8);
            }
            LogoMainActivity logoMainActivity10 = LogoMainActivity.this;
            String[] strArr4 = logoMainActivity10.abc1008;
            if (strArr4 != null) {
                strArr4[2] = "t ";
            }
            if (logoMainActivity10.abc1003.size() < 9) {
                LogoMainActivity.this.abc1003.add(5);
            }
            if (appLinkData != null && LogoMainActivity.this.startF <= 0) {
                LogoMainActivity logoMainActivity11 = LogoMainActivity.this;
                logoMainActivity11.abc10010 = false;
                if (logoMainActivity11.abc1006 == null) {
                    logoMainActivity11.abc1006 = new int[10];
                }
                logoMainActivity11.abc10010 = !false;
                if (logoMainActivity11.abc2.size() > 8) {
                    LogoMainActivity.this.abc2.add("t=dime");
                    if (LogoMainActivity.this.abc1003.size() < 1) {
                        LogoMainActivity.this.abc1003.add(1);
                    }
                    ArrayList<Integer> arrayList9 = LogoMainActivity.this.abc1004;
                    if (arrayList9 == null && arrayList9.size() > 0) {
                        LogoMainActivity.this.abc1004.remove(0);
                    }
                    ArrayList<Integer> arrayList10 = LogoMainActivity.this.abc1002;
                    if (arrayList10 == null && arrayList10.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                if (LogoMainActivity.this.abc1002.size() > 9) {
                    LogoMainActivity.this.abc1002.add(8);
                }
                LogoMainActivity logoMainActivity12 = LogoMainActivity.this;
                String[] strArr5 = logoMainActivity12.abc1008;
                if (strArr5 != null) {
                    strArr5[2] = "t ";
                }
                if (logoMainActivity12.abc1003.size() < 9) {
                    LogoMainActivity.this.abc1003.add(5);
                }
                LogoMainActivity logoMainActivity13 = LogoMainActivity.this;
                logoMainActivity13.abc10010 = false;
                if (logoMainActivity13.abc1006 == null) {
                    logoMainActivity13.abc1006 = new int[10];
                }
                logoMainActivity13.abc10010 = !false;
                if (logoMainActivity13.abc2.size() > 8) {
                    LogoMainActivity.this.abc2.add("t=dime");
                    if (LogoMainActivity.this.abc1003.size() < 1) {
                        LogoMainActivity.this.abc1003.add(1);
                    }
                    ArrayList<Integer> arrayList11 = LogoMainActivity.this.abc1004;
                    if (arrayList11 == null && arrayList11.size() > 0) {
                        LogoMainActivity.this.abc1004.remove(0);
                    }
                    ArrayList<Integer> arrayList12 = LogoMainActivity.this.abc1002;
                    if (arrayList12 == null && arrayList12.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                if (LogoMainActivity.this.abc1002.size() > 9) {
                    LogoMainActivity.this.abc1002.add(8);
                }
                LogoMainActivity logoMainActivity14 = LogoMainActivity.this;
                String[] strArr6 = logoMainActivity14.abc1008;
                if (strArr6 != null) {
                    strArr6[2] = "t ";
                }
                if (logoMainActivity14.abc1003.size() < 9) {
                    LogoMainActivity.this.abc1003.add(5);
                }
                ((LogoApplication) LogoMainActivity.this.getApplicationContext()).loadFConfig();
                LogoMainActivity logoMainActivity15 = LogoMainActivity.this;
                logoMainActivity15.abc10010 = false;
                if (logoMainActivity15.abc1006 == null) {
                    logoMainActivity15.abc1006 = new int[10];
                }
                logoMainActivity15.abc10010 = !false;
                if (logoMainActivity15.abc2.size() > 8) {
                    LogoMainActivity.this.abc2.add("t=dime");
                    if (LogoMainActivity.this.abc1003.size() < 1) {
                        LogoMainActivity.this.abc1003.add(1);
                    }
                    ArrayList<Integer> arrayList13 = LogoMainActivity.this.abc1004;
                    if (arrayList13 == null && arrayList13.size() > 0) {
                        LogoMainActivity.this.abc1004.remove(0);
                    }
                    ArrayList<Integer> arrayList14 = LogoMainActivity.this.abc1002;
                    if (arrayList14 == null && arrayList14.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                if (LogoMainActivity.this.abc1002.size() > 9) {
                    LogoMainActivity.this.abc1002.add(8);
                }
                LogoMainActivity logoMainActivity16 = LogoMainActivity.this;
                String[] strArr7 = logoMainActivity16.abc1008;
                if (strArr7 != null) {
                    strArr7[2] = "t ";
                }
                if (logoMainActivity16.abc1003.size() < 9) {
                    LogoMainActivity.this.abc1003.add(5);
                }
                LogoMainActivity logoMainActivity17 = LogoMainActivity.this;
                logoMainActivity17.abc10010 = false;
                if (logoMainActivity17.abc1006 == null) {
                    logoMainActivity17.abc1006 = new int[10];
                }
                logoMainActivity17.abc10010 = !false;
                if (logoMainActivity17.abc2.size() > 8) {
                    LogoMainActivity.this.abc2.add("t=dime");
                    if (LogoMainActivity.this.abc1003.size() < 1) {
                        LogoMainActivity.this.abc1003.add(1);
                    }
                    ArrayList<Integer> arrayList15 = LogoMainActivity.this.abc1004;
                    if (arrayList15 == null && arrayList15.size() > 0) {
                        LogoMainActivity.this.abc1004.remove(0);
                    }
                    ArrayList<Integer> arrayList16 = LogoMainActivity.this.abc1002;
                    if (arrayList16 == null && arrayList16.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                if (LogoMainActivity.this.abc1002.size() > 9) {
                    LogoMainActivity.this.abc1002.add(8);
                }
                LogoMainActivity logoMainActivity18 = LogoMainActivity.this;
                String[] strArr8 = logoMainActivity18.abc1008;
                if (strArr8 != null) {
                    strArr8[2] = "t ";
                }
                if (logoMainActivity18.abc1003.size() < 9) {
                    LogoMainActivity.this.abc1003.add(5);
                }
                try {
                    LogoMainActivity logoMainActivity19 = LogoMainActivity.this;
                    logoMainActivity19.abc10010 = false;
                    if (logoMainActivity19.abc1006 == null) {
                        logoMainActivity19.abc1006 = new int[10];
                    }
                    logoMainActivity19.abc10010 = true;
                    if (logoMainActivity19.abc2.size() > 8) {
                        LogoMainActivity.this.abc2.add("t=dime");
                        if (LogoMainActivity.this.abc1003.size() < 1) {
                            LogoMainActivity.this.abc1003.add(1);
                        }
                        ArrayList<Integer> arrayList17 = LogoMainActivity.this.abc1004;
                        if (arrayList17 == null && arrayList17.size() > 0) {
                            LogoMainActivity.this.abc1004.remove(0);
                        }
                        ArrayList<Integer> arrayList18 = LogoMainActivity.this.abc1002;
                        if (arrayList18 == null && arrayList18.size() > 0) {
                            LogoMainActivity.this.abc1002.remove(0);
                        }
                    }
                    if (LogoMainActivity.this.abc1002.size() > 9) {
                        LogoMainActivity.this.abc1002.add(8);
                    }
                    LogoMainActivity logoMainActivity20 = LogoMainActivity.this;
                    String[] strArr9 = logoMainActivity20.abc1008;
                    if (strArr9 != null) {
                        strArr9[2] = "t ";
                    }
                    if (logoMainActivity20.abc1003.size() < 9) {
                        LogoMainActivity.this.abc1003.add(5);
                    }
                    AppsFlyerLib.getInstance().logEvent(LogoMainActivity.this.getApplicationContext(), "main_a", null);
                    LogoMainActivity logoMainActivity21 = LogoMainActivity.this;
                    logoMainActivity21.abc10010 = false;
                    if (logoMainActivity21.abc1006 == null) {
                        logoMainActivity21.abc1006 = new int[10];
                    }
                    logoMainActivity21.abc10010 = true;
                    if (logoMainActivity21.abc2.size() > 8) {
                        LogoMainActivity.this.abc2.add("t=dime");
                        if (LogoMainActivity.this.abc1003.size() < 1) {
                            LogoMainActivity.this.abc1003.add(1);
                        }
                        ArrayList<Integer> arrayList19 = LogoMainActivity.this.abc1004;
                        if (arrayList19 == null && arrayList19.size() > 0) {
                            LogoMainActivity.this.abc1004.remove(0);
                        }
                        ArrayList<Integer> arrayList20 = LogoMainActivity.this.abc1002;
                        if (arrayList20 == null && arrayList20.size() > 0) {
                            LogoMainActivity.this.abc1002.remove(0);
                        }
                    }
                    if (LogoMainActivity.this.abc1002.size() > 9) {
                        LogoMainActivity.this.abc1002.add(8);
                    }
                    LogoMainActivity logoMainActivity22 = LogoMainActivity.this;
                    String[] strArr10 = logoMainActivity22.abc1008;
                    if (strArr10 != null) {
                        strArr10[2] = "t ";
                    }
                    if (logoMainActivity22.abc1003.size() < 9) {
                        LogoMainActivity.this.abc1003.add(5);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                LogoMainActivity logoMainActivity23 = LogoMainActivity.this;
                logoMainActivity23.abc10010 = false;
                if (logoMainActivity23.abc1006 == null) {
                    logoMainActivity23.abc1006 = new int[10];
                }
                logoMainActivity23.abc10010 = !false;
                if (logoMainActivity23.abc2.size() > 8) {
                    LogoMainActivity.this.abc2.add("t=dime");
                    if (LogoMainActivity.this.abc1003.size() < 1) {
                        LogoMainActivity.this.abc1003.add(1);
                    }
                    ArrayList<Integer> arrayList21 = LogoMainActivity.this.abc1004;
                    if (arrayList21 == null && arrayList21.size() > 0) {
                        LogoMainActivity.this.abc1004.remove(0);
                    }
                    ArrayList<Integer> arrayList22 = LogoMainActivity.this.abc1002;
                    if (arrayList22 == null && arrayList22.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                if (LogoMainActivity.this.abc1002.size() > 9) {
                    LogoMainActivity.this.abc1002.add(8);
                }
                LogoMainActivity logoMainActivity24 = LogoMainActivity.this;
                String[] strArr11 = logoMainActivity24.abc1008;
                if (strArr11 != null) {
                    strArr11[2] = "t ";
                }
                if (logoMainActivity24.abc1003.size() < 9) {
                    LogoMainActivity.this.abc1003.add(5);
                }
                try {
                    LogoMainActivity logoMainActivity25 = LogoMainActivity.this;
                    logoMainActivity25.abc10010 = false;
                    if (logoMainActivity25.abc1006 == null) {
                        logoMainActivity25.abc1006 = new int[10];
                    }
                    logoMainActivity25.abc10010 = true;
                    if (logoMainActivity25.abc2.size() > 8) {
                        LogoMainActivity.this.abc2.add("t=dime");
                        if (LogoMainActivity.this.abc1003.size() < 1) {
                            LogoMainActivity.this.abc1003.add(1);
                        }
                        ArrayList<Integer> arrayList23 = LogoMainActivity.this.abc1004;
                        if (arrayList23 == null && arrayList23.size() > 0) {
                            LogoMainActivity.this.abc1004.remove(0);
                        }
                        ArrayList<Integer> arrayList24 = LogoMainActivity.this.abc1002;
                        if (arrayList24 == null && arrayList24.size() > 0) {
                            LogoMainActivity.this.abc1002.remove(0);
                        }
                    }
                    if (LogoMainActivity.this.abc1002.size() > 9) {
                        LogoMainActivity.this.abc1002.add(8);
                    }
                    LogoMainActivity logoMainActivity26 = LogoMainActivity.this;
                    String[] strArr12 = logoMainActivity26.abc1008;
                    if (strArr12 != null) {
                        strArr12[2] = "t ";
                    }
                    if (logoMainActivity26.abc1003.size() < 9) {
                        LogoMainActivity.this.abc1003.add(5);
                    }
                    AppsFlyerLib.getInstance().logEvent(LogoMainActivity.this.getApplicationContext(), "main_b", null);
                    LogoMainActivity logoMainActivity27 = LogoMainActivity.this;
                    logoMainActivity27.abc10010 = false;
                    if (logoMainActivity27.abc1006 == null) {
                        logoMainActivity27.abc1006 = new int[10];
                    }
                    logoMainActivity27.abc10010 = true;
                    if (logoMainActivity27.abc2.size() > 8) {
                        LogoMainActivity.this.abc2.add("t=dime");
                        if (LogoMainActivity.this.abc1003.size() < 1) {
                            LogoMainActivity.this.abc1003.add(1);
                        }
                        ArrayList<Integer> arrayList25 = LogoMainActivity.this.abc1004;
                        if (arrayList25 == null && arrayList25.size() > 0) {
                            LogoMainActivity.this.abc1004.remove(0);
                        }
                        ArrayList<Integer> arrayList26 = LogoMainActivity.this.abc1002;
                        if (arrayList26 == null && arrayList26.size() > 0) {
                            LogoMainActivity.this.abc1002.remove(0);
                        }
                    }
                    if (LogoMainActivity.this.abc1002.size() > 9) {
                        LogoMainActivity.this.abc1002.add(8);
                    }
                    LogoMainActivity logoMainActivity28 = LogoMainActivity.this;
                    String[] strArr13 = logoMainActivity28.abc1008;
                    if (strArr13 != null) {
                        strArr13[2] = "t ";
                    }
                    if (logoMainActivity28.abc1003.size() < 9) {
                        LogoMainActivity.this.abc1003.add(5);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                LogoMainActivity logoMainActivity29 = LogoMainActivity.this;
                logoMainActivity29.abc10010 = false;
                if (logoMainActivity29.abc1006 == null) {
                    logoMainActivity29.abc1006 = new int[10];
                }
                logoMainActivity29.abc10010 = !false;
                if (logoMainActivity29.abc2.size() > 8) {
                    LogoMainActivity.this.abc2.add("t=dime");
                    if (LogoMainActivity.this.abc1003.size() < 1) {
                        LogoMainActivity.this.abc1003.add(1);
                    }
                    ArrayList<Integer> arrayList27 = LogoMainActivity.this.abc1004;
                    if (arrayList27 == null && arrayList27.size() > 0) {
                        LogoMainActivity.this.abc1004.remove(0);
                    }
                    ArrayList<Integer> arrayList28 = LogoMainActivity.this.abc1002;
                    if (arrayList28 == null && arrayList28.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                if (LogoMainActivity.this.abc1002.size() > 9) {
                    LogoMainActivity.this.abc1002.add(8);
                }
                LogoMainActivity logoMainActivity30 = LogoMainActivity.this;
                String[] strArr14 = logoMainActivity30.abc1008;
                if (strArr14 != null) {
                    strArr14[2] = "t ";
                }
                if (logoMainActivity30.abc1003.size() < 9) {
                    LogoMainActivity.this.abc1003.add(5);
                }
                SPUtils.m878a("LoGoData", 0).m874e("lo_f", 1000);
                LogoMainActivity logoMainActivity31 = LogoMainActivity.this;
                logoMainActivity31.abc10010 = false;
                if (logoMainActivity31.abc1006 == null) {
                    logoMainActivity31.abc1006 = new int[10];
                }
                logoMainActivity31.abc10010 = !false;
                if (logoMainActivity31.abc2.size() > 8) {
                    LogoMainActivity.this.abc2.add("t=dime");
                    if (LogoMainActivity.this.abc1003.size() < 1) {
                        LogoMainActivity.this.abc1003.add(1);
                    }
                    ArrayList<Integer> arrayList29 = LogoMainActivity.this.abc1004;
                    if (arrayList29 == null && arrayList29.size() > 0) {
                        LogoMainActivity.this.abc1004.remove(0);
                    }
                    ArrayList<Integer> arrayList30 = LogoMainActivity.this.abc1002;
                    if (arrayList30 == null && arrayList30.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                if (LogoMainActivity.this.abc1002.size() > 9) {
                    LogoMainActivity.this.abc1002.add(8);
                }
                LogoMainActivity logoMainActivity32 = LogoMainActivity.this;
                String[] strArr15 = logoMainActivity32.abc1008;
                if (strArr15 != null) {
                    strArr15[2] = "t ";
                }
                if (logoMainActivity32.abc1003.size() < 9) {
                    LogoMainActivity.this.abc1003.add(5);
                }
            }
            LogoMainActivity logoMainActivity33 = LogoMainActivity.this;
            logoMainActivity33.abc10010 = false;
            if (logoMainActivity33.abc1006 == null) {
                logoMainActivity33.abc1006 = new int[10];
            }
            logoMainActivity33.abc10010 = !false;
            if (logoMainActivity33.abc2.size() > 8) {
                LogoMainActivity.this.abc2.add("t=dime");
                if (LogoMainActivity.this.abc1003.size() < 1) {
                    LogoMainActivity.this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList31 = LogoMainActivity.this.abc1004;
                if (arrayList31 == null && arrayList31.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList32 = LogoMainActivity.this.abc1002;
                if (arrayList32 == null && arrayList32.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
            }
            if (LogoMainActivity.this.abc1002.size() > 9) {
                LogoMainActivity.this.abc1002.add(8);
            }
            LogoMainActivity logoMainActivity34 = LogoMainActivity.this;
            String[] strArr16 = logoMainActivity34.abc1008;
            if (strArr16 != null) {
                strArr16[2] = "t ";
            }
            if (logoMainActivity34.abc1003.size() < 9) {
                LogoMainActivity.this.abc1003.add(5);
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9543c implements View.OnClickListener {
        public View$OnClickListenerC9543c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMainActivity.this.openWebview();
            LogoMainActivity logoMainActivity = LogoMainActivity.this;
            if (logoMainActivity.abc1003 == null) {
                logoMainActivity.abc1003 = new ArrayList<>();
            }
            LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
            if (logoMainActivity2.abc1003 == null) {
                logoMainActivity2.abc1003 = new ArrayList<>();
            }
            LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
            if (logoMainActivity3.abc1006 == null) {
                logoMainActivity3.abc1006 = new int[10];
            }
            logoMainActivity3.abc5 = ((double) logoMainActivity3.abc5) > 0.64367306d ? 0.7891368f : 0.6381665f;
            if (logoMainActivity3.abc1000 == null) {
                logoMainActivity3.abc1000 = new ArrayList<>();
            }
            LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
            if (logoMainActivity4.abc1007 == null) {
                logoMainActivity4.abc1007 = new ArrayList<>();
            }
            LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
            if (logoMainActivity5.abc1003 == null) {
                logoMainActivity5.abc1003 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$d */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9544d implements View.OnClickListener {
        public View$OnClickListenerC9544d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMainActivity.this.binding.drawerLayout.openDrawer(GravityCompat.START);
            int i = 0;
            if (LogoMainActivity.this.abc1006 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = LogoMainActivity.this.abc1006;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 3;
                    i2++;
                }
            }
            LogoMainActivity logoMainActivity = LogoMainActivity.this;
            logoMainActivity.abc1005 = -logoMainActivity.abc1005;
            String[] strArr = logoMainActivity.abc1008;
            if (strArr != null) {
                strArr[2] = " Stone, ";
            }
            if (logoMainActivity.abc1.size() > 5) {
                LogoMainActivity.this.abc1.add(5);
                LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
                String[] strArr2 = logoMainActivity2.abc1008;
                if (strArr2 != null) {
                    strArr2[5] = null;
                }
                int[] iArr2 = logoMainActivity2.abc1006;
                if (iArr2 != null) {
                    iArr2[2] = 3;
                }
                if (logoMainActivity2.abc10011 == null) {
                    logoMainActivity2.abc10011 = new String[10];
                }
            }
            if (LogoMainActivity.this.abc1008 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr3 = LogoMainActivity.this.abc1008;
                    if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i3] = "string" + i3;
                    i3++;
                }
            }
            if (LogoMainActivity.this.abc10011 != null) {
                while (true) {
                    String[] strArr4 = LogoMainActivity.this.abc10011;
                    if (i >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i] = "string" + i;
                    i++;
                }
            }
            String[] strArr5 = LogoMainActivity.this.abc1001;
            if (strArr5 != null) {
                strArr5[9] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$e */
    /* loaded from: classes3.dex */
    public class C9545e implements DrawerLayout.DrawerListener {
        public C9545e() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(@NonNull View view) {
            LogoMainActivity logoMainActivity = LogoMainActivity.this;
            int[] iArr = logoMainActivity.abc1006;
            if (iArr != null) {
                iArr[5] = 0;
            }
            if (logoMainActivity.abc1007 == null) {
                logoMainActivity.abc1007 = new ArrayList<>();
            }
            LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
            if (logoMainActivity2.abc10011 == null) {
                logoMainActivity2.abc10011 = new String[10];
            }
            if (logoMainActivity2.abc1 == null) {
                logoMainActivity2.abc1 = new ArrayList<>();
                LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
                if (logoMainActivity3.abc1007 == null) {
                    logoMainActivity3.abc1007 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList = LogoMainActivity.this.abc1009;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMainActivity.this.abc1009.remove(0);
                }
                String[] strArr = LogoMainActivity.this.abc1001;
                if (strArr != null) {
                    strArr[4] = null;
                }
            }
            LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
            logoMainActivity4.abc10010 = false;
            if (logoMainActivity4.abc1006 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = LogoMainActivity.this.abc1006;
                    if (i >= (iArr2.length <= 3 ? iArr2.length : 3)) {
                        break;
                    }
                    iArr2[i] = 0;
                    i++;
                }
            }
            LogoMainActivity.this.abc10010 = true;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(@NonNull View view) {
            LogoMainActivity logoMainActivity;
            LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
            logoMainActivity2.abc10010 = true;
            String[] strArr = logoMainActivity2.abc1001;
            if (strArr != null) {
                strArr[6] = null;
            }
            logoMainActivity2.abc1005 = Math.abs(logoMainActivity2.abc1005);
            int i = 0;
            while (true) {
                logoMainActivity = LogoMainActivity.this;
                if (i >= logoMainActivity.abc4) {
                    break;
                }
                logoMainActivity.abc5 = 0.9550473f;
                logoMainActivity.abc1005 = 0.5413864f;
                String[] strArr2 = logoMainActivity.abc1008;
                if (strArr2 != null) {
                    strArr2[0] = " forced ";
                }
                if (logoMainActivity.abc1009.size() < 4) {
                    LogoMainActivity.this.abc1009.add(0);
                }
                i++;
            }
            String[] strArr3 = logoMainActivity.abc1001;
            if (strArr3 != null) {
                strArr3[4] = null;
            }
            String[] strArr4 = logoMainActivity.abc10011;
            if (strArr4 != null) {
                strArr4[8] = null;
            }
            ArrayList<Integer> arrayList = logoMainActivity.abc1003;
            if (arrayList != null || arrayList.size() <= 0) {
                return;
            }
            LogoMainActivity.this.abc1003.remove(0);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(@NonNull View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$f */
    /* loaded from: classes3.dex */
    public class C9546f implements Observer<Boolean> {
        public C9546f() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoMainActivity logoMainActivity;
            LogoMainActivity logoMainActivity2;
            LogoMainActivity logoMainActivity3;
            LogoLogUtils.m22166d(LogoMainActivity.TAG, new Throwable(), "显示评分：" + bool);
            LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
            if (logoMainActivity4.abc10011 == null) {
                logoMainActivity4.abc10011 = new String[10];
            }
            if (logoMainActivity4.abc1000.size() < 0) {
                LogoMainActivity.this.abc1000.add("k decades ");
            }
            LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
            if (logoMainActivity5.abc1007 == null) {
                logoMainActivity5.abc1007 = new ArrayList<>();
            }
            int i = 0;
            while (true) {
                logoMainActivity = LogoMainActivity.this;
                if (i >= logoMainActivity.abc4) {
                    break;
                }
                logoMainActivity.abc5 = ((double) logoMainActivity.abc5) > 0.4425975d ? 0.15152973f : 0.04426205f;
                if (logoMainActivity.abc1009.size() > 7) {
                    LogoMainActivity.this.abc1009.add(6);
                }
                if (LogoMainActivity.this.abc1001 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = LogoMainActivity.this.abc1001;
                        if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i2] = "string" + i2;
                        i2++;
                    }
                }
                if (LogoMainActivity.this.abc1002.size() < 9) {
                    LogoMainActivity.this.abc1002.add(5);
                }
                i++;
            }
            if (logoMainActivity.abc1008 == null) {
                logoMainActivity.abc1008 = new String[10];
            }
            ArrayList<Integer> arrayList = logoMainActivity.abc1003;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMainActivity.this.abc1003.remove(0);
            }
            LogoMainActivity logoMainActivity6 = LogoMainActivity.this;
            if (logoMainActivity6.abc1008 == null) {
                logoMainActivity6.abc1008 = new String[10];
            }
            if (bool.booleanValue()) {
                if (LogoMainActivity.this.logoRateUsDialog == null) {
                    LogoMainActivity.this.logoRateUsDialog = new LogoRateUsDialog(LogoMainActivity.this);
                    if (LogoMainActivity.this.abc1000.size() > 3) {
                        LogoMainActivity.this.abc1000.add("ook wri");
                    }
                    LogoMainActivity logoMainActivity7 = LogoMainActivity.this;
                    if (logoMainActivity7.abc1008 == null) {
                        logoMainActivity7.abc1008 = new String[10];
                    }
                    ArrayList<String> arrayList2 = logoMainActivity7.abc1000;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        LogoMainActivity.this.abc1000.remove(0);
                    }
                    if (LogoMainActivity.this.abc0.size() > 4) {
                        LogoMainActivity.this.abc0.add(")      ");
                        LogoMainActivity logoMainActivity8 = LogoMainActivity.this;
                        if (logoMainActivity8.abc1002 == null) {
                            logoMainActivity8.abc1002 = new ArrayList<>();
                        }
                        ArrayList<Integer> arrayList3 = LogoMainActivity.this.abc1003;
                        if (arrayList3 == null && arrayList3.size() > 0) {
                            LogoMainActivity.this.abc1003.remove(0);
                        }
                        ArrayList<Integer> arrayList4 = LogoMainActivity.this.abc1004;
                        if (arrayList4 == null && arrayList4.size() > 0) {
                            LogoMainActivity.this.abc1004.remove(0);
                        }
                    }
                    LogoMainActivity logoMainActivity9 = LogoMainActivity.this;
                    if (logoMainActivity9.abc1004 == null) {
                        logoMainActivity9.abc1004 = new ArrayList<>();
                    }
                    if (LogoMainActivity.this.abc1007.size() > 3) {
                        LogoMainActivity.this.abc1007.add(6);
                    }
                    LogoMainActivity logoMainActivity10 = LogoMainActivity.this;
                    if (logoMainActivity10.abc1006 == null) {
                        logoMainActivity10.abc1006 = new int[10];
                    }
                }
                LogoMainActivity logoMainActivity11 = LogoMainActivity.this;
                if (logoMainActivity11.abc1002 == null) {
                    logoMainActivity11.abc1002 = new ArrayList<>();
                }
                if (LogoMainActivity.this.abc1007.size() > 4) {
                    LogoMainActivity.this.abc1007.add(3);
                }
                LogoMainActivity logoMainActivity12 = LogoMainActivity.this;
                if (logoMainActivity12.abc1005 > 0.32824588d) {
                    logoMainActivity12.abc1005 = 0.14158726f;
                }
                ArrayList<String> arrayList5 = logoMainActivity12.abc0;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoMainActivity.this.abc0.remove(0);
                    LogoMainActivity logoMainActivity13 = LogoMainActivity.this;
                    int[] iArr = logoMainActivity13.abc1006;
                    if (iArr != null) {
                        iArr[0] = 0;
                    }
                    if (logoMainActivity13.abc1000.size() < 6) {
                        LogoMainActivity.this.abc1000.add("liz");
                    }
                    LogoMainActivity logoMainActivity14 = LogoMainActivity.this;
                    if (logoMainActivity14.abc1000 == null) {
                        logoMainActivity14.abc1000 = new ArrayList<>();
                    }
                }
                LogoMainActivity logoMainActivity15 = LogoMainActivity.this;
                if (logoMainActivity15.abc1008 == null) {
                    logoMainActivity15.abc1008 = new String[10];
                }
                if (logoMainActivity15.abc1002.size() < 3) {
                    LogoMainActivity.this.abc1002.add(0);
                }
                if (LogoMainActivity.this.abc1006 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = LogoMainActivity.this.abc1006;
                        if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i3] = 2;
                        i3++;
                    }
                }
                LogoMainActivity.this.logoRateUsDialog.show();
                ArrayList<Integer> arrayList6 = LogoMainActivity.this.abc1009;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoMainActivity.this.abc1009.remove(0);
                }
                ArrayList<Integer> arrayList7 = LogoMainActivity.this.abc1003;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    LogoMainActivity.this.abc1003.remove(0);
                }
                LogoMainActivity logoMainActivity16 = LogoMainActivity.this;
                if (logoMainActivity16.abc1003 == null) {
                    logoMainActivity16.abc1003 = new ArrayList<>();
                }
                if (LogoMainActivity.this.abc1.size() < 4) {
                    LogoMainActivity.this.abc1.add(7);
                    ArrayList<Integer> arrayList8 = LogoMainActivity.this.abc1009;
                    if (arrayList8 == null && arrayList8.size() > 0) {
                        LogoMainActivity.this.abc1009.remove(0);
                    }
                    LogoMainActivity logoMainActivity17 = LogoMainActivity.this;
                    logoMainActivity17.abc1005 *= 0.52891284f;
                    String[] strArr2 = logoMainActivity17.abc1008;
                    if (strArr2 != null) {
                        strArr2[9] = " defi";
                    }
                }
                if (LogoMainActivity.this.abc1009.size() < 8) {
                    LogoMainActivity.this.abc1009.add(6);
                }
                ArrayList<String> arrayList9 = LogoMainActivity.this.abc1000;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    LogoMainActivity.this.abc1000.remove(0);
                }
                LogoMainActivity logoMainActivity18 = LogoMainActivity.this;
                if (logoMainActivity18.abc1005 < 0.94406754d) {
                    logoMainActivity18.abc1005 = 0.33890873f;
                }
            } else {
                if (LogoMainActivity.this.logoRateUsDialog != null) {
                    LogoMainActivity.this.logoRateUsDialog.dismiss();
                    if (LogoMainActivity.this.abc1003.size() > 8) {
                        LogoMainActivity.this.abc1003.add(7);
                    }
                    ArrayList<Integer> arrayList10 = LogoMainActivity.this.abc1009;
                    if (arrayList10 == null && arrayList10.size() > 0) {
                        LogoMainActivity.this.abc1009.remove(0);
                    }
                    ArrayList<Integer> arrayList11 = LogoMainActivity.this.abc1007;
                    if (arrayList11 == null && arrayList11.size() > 0) {
                        LogoMainActivity.this.abc1007.remove(0);
                    }
                    if (!TextUtils.isEmpty(LogoMainActivity.this.abc3)) {
                        int length = LogoMainActivity.this.abc3.length();
                        LogoMainActivity logoMainActivity19 = LogoMainActivity.this;
                        String[] strArr3 = logoMainActivity19.abc10011;
                        if (strArr3 != null) {
                            strArr3[5] = "a book wri";
                        }
                        if (logoMainActivity19.abc1003 == null) {
                            logoMainActivity19.abc1003 = new ArrayList<>();
                        }
                        ArrayList<Integer> arrayList12 = LogoMainActivity.this.abc1007;
                        if (arrayList12 == null && arrayList12.size() > 0) {
                            LogoMainActivity.this.abc1007.remove(0);
                        }
                        LogoMainActivity.this.abc3 = LogoMainActivity.this.abc3 + length;
                        LogoMainActivity logoMainActivity20 = LogoMainActivity.this;
                        if (logoMainActivity20.abc1001 == null) {
                            logoMainActivity20.abc1001 = new String[10];
                        }
                        if (logoMainActivity20.abc1003.size() < 3) {
                            LogoMainActivity.this.abc1003.add(7);
                        }
                        if (LogoMainActivity.this.abc1001 != null) {
                            int i4 = 0;
                            while (true) {
                                String[] strArr4 = LogoMainActivity.this.abc1001;
                                if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                                    break;
                                }
                                strArr4[i4] = "string" + i4;
                                i4++;
                            }
                        }
                    }
                    LogoMainActivity logoMainActivity21 = LogoMainActivity.this;
                    if (logoMainActivity21.abc1007 == null) {
                        logoMainActivity21.abc1007 = new ArrayList<>();
                    }
                    LogoMainActivity logoMainActivity22 = LogoMainActivity.this;
                    if (logoMainActivity22.abc1009 == null) {
                        logoMainActivity22.abc1009 = new ArrayList<>();
                    }
                    ArrayList<Integer> arrayList13 = LogoMainActivity.this.abc1007;
                    if (arrayList13 == null && arrayList13.size() > 0) {
                        LogoMainActivity.this.abc1007.remove(0);
                    }
                }
                LogoMainActivity logoMainActivity23 = LogoMainActivity.this;
                String[] strArr5 = logoMainActivity23.abc1008;
                if (strArr5 != null) {
                    strArr5[9] = "egati";
                }
                ArrayList<Integer> arrayList14 = logoMainActivity23.abc1007;
                if (arrayList14 == null && arrayList14.size() > 0) {
                    LogoMainActivity.this.abc1007.remove(0);
                }
                ArrayList<String> arrayList15 = LogoMainActivity.this.abc1000;
                if (arrayList15 != null && arrayList15.size() > 0) {
                    LogoMainActivity.this.abc1000.remove(0);
                }
                LogoMainActivity logoMainActivity24 = LogoMainActivity.this;
                logoMainActivity24.abc4 = -logoMainActivity24.abc4;
                if (logoMainActivity24.abc1007 == null) {
                    logoMainActivity24.abc1007 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList16 = LogoMainActivity.this.abc1004;
                if (arrayList16 == null && arrayList16.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                LogoMainActivity.this.abc10010 = !logoMainActivity2.abc10010;
            }
            LogoMainActivity logoMainActivity25 = LogoMainActivity.this;
            boolean z = !logoMainActivity25.abc10010;
            logoMainActivity25.abc10010 = z;
            logoMainActivity25.abc10010 = !z;
            if (logoMainActivity25.abc1009 == null) {
                logoMainActivity25.abc1009 = new ArrayList<>();
            }
            int i5 = 0;
            while (true) {
                logoMainActivity3 = LogoMainActivity.this;
                int i6 = logoMainActivity3.abc4;
                if (i5 >= i6) {
                    break;
                }
                logoMainActivity3.abc4 = i6 < 6 ? 3 : 1;
                logoMainActivity3.abc10010 = false;
                String[] strArr6 = logoMainActivity3.abc10011;
                if (strArr6 != null) {
                    strArr6[1] = null;
                }
                if (logoMainActivity3.abc1006 == null) {
                    logoMainActivity3.abc1006 = new int[10];
                }
                i5++;
            }
            String[] strArr7 = logoMainActivity3.abc1001;
            if (strArr7 != null) {
                strArr7[3] = "k. F";
            }
            String[] strArr8 = logoMainActivity3.abc10011;
            if (strArr8 != null) {
                strArr8[7] = null;
            }
            if (strArr8 != null) {
                strArr8[9] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$g */
    /* loaded from: classes3.dex */
    public class C9547g implements Observer<Boolean> {
        public C9547g() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoMainActivity logoMainActivity;
            LogoLogUtils.m22166d(LogoMainActivity.TAG, new Throwable(), "显示隐私政策：" + bool);
            LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
            logoMainActivity2.abc10010 = true;
            ArrayList<Integer> arrayList = logoMainActivity2.abc1002;
            int i = 0;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            if (LogoMainActivity.this.abc1008 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoMainActivity.this.abc1008;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            ArrayList<Integer> arrayList2 = LogoMainActivity.this.abc1;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMainActivity.this.abc1.remove(0);
                ArrayList<Integer> arrayList3 = LogoMainActivity.this.abc1004;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                if (LogoMainActivity.this.abc1004.size() > 8) {
                    LogoMainActivity.this.abc1004.add(3);
                }
                LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
                if (logoMainActivity3.abc1006 == null) {
                    logoMainActivity3.abc1006 = new int[10];
                }
            }
            LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
            logoMainActivity4.abc1005 = 0.21968687f;
            if (logoMainActivity4.abc1009 == null) {
                logoMainActivity4.abc1009 = new ArrayList<>();
            }
            if (LogoMainActivity.this.abc1003.size() < 7) {
                LogoMainActivity.this.abc1003.add(1);
            }
            if (bool.booleanValue()) {
                if (LogoMainActivity.this.logoRuleDialog == null) {
                    LogoMainActivity.this.logoRuleDialog = new LogoRuleDialog(LogoMainActivity.this);
                    if (LogoMainActivity.this.abc1003.size() > 8) {
                        LogoMainActivity.this.abc1003.add(9);
                    }
                    LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
                    if (logoMainActivity5.abc1009 == null) {
                        logoMainActivity5.abc1009 = new ArrayList<>();
                    }
                    if (LogoMainActivity.this.abc1000.size() < 7) {
                        LogoMainActivity.this.abc1000.add("de and ");
                    }
                    ArrayList<Integer> arrayList4 = LogoMainActivity.this.abc1;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        LogoMainActivity.this.abc1.remove(0);
                        LogoMainActivity logoMainActivity6 = LogoMainActivity.this;
                        String[] strArr2 = logoMainActivity6.abc10011;
                        if (strArr2 != null) {
                            strArr2[6] = "every yea";
                        }
                        String[] strArr3 = logoMainActivity6.abc1001;
                        if (strArr3 != null) {
                            strArr3[5] = " a";
                        }
                        ArrayList<String> arrayList5 = logoMainActivity6.abc1000;
                        if (arrayList5 != null && arrayList5.size() > 0) {
                            LogoMainActivity.this.abc1000.remove(0);
                        }
                    }
                    LogoMainActivity logoMainActivity7 = LogoMainActivity.this;
                    String[] strArr4 = logoMainActivity7.abc1008;
                    if (strArr4 != null) {
                        strArr4[9] = null;
                    }
                    if (logoMainActivity7.abc1002 == null) {
                        logoMainActivity7.abc1002 = new ArrayList<>();
                    }
                    LogoMainActivity.this.abc10010 = !logoMainActivity.abc10010;
                }
                LogoMainActivity logoMainActivity8 = LogoMainActivity.this;
                if (logoMainActivity8.abc1003 == null) {
                    logoMainActivity8.abc1003 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity9 = LogoMainActivity.this;
                if (logoMainActivity9.abc1002 == null) {
                    logoMainActivity9.abc1002 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity10 = LogoMainActivity.this;
                if (logoMainActivity10.abc1002 == null) {
                    logoMainActivity10.abc1002 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity11 = LogoMainActivity.this;
                if (logoMainActivity11.abc4 < 0) {
                    logoMainActivity11.abc4 = 1;
                    logoMainActivity11.abc1005 *= 0.1553778f;
                    if (logoMainActivity11.abc1008 != null) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr5 = LogoMainActivity.this.abc1008;
                            if (i3 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                                break;
                            }
                            strArr5[i3] = "string" + i3;
                            i3++;
                        }
                    }
                    if (LogoMainActivity.this.abc1009.size() < 6) {
                        LogoMainActivity.this.abc1009.add(4);
                    }
                }
                if (LogoMainActivity.this.abc1003.size() < 3) {
                    LogoMainActivity.this.abc1003.add(4);
                }
                if (LogoMainActivity.this.abc1008 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr6 = LogoMainActivity.this.abc1008;
                        if (i4 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                            break;
                        }
                        strArr6[i4] = "string" + i4;
                        i4++;
                    }
                }
                if (LogoMainActivity.this.abc1002.size() < 0) {
                    LogoMainActivity.this.abc1002.add(2);
                }
                LogoMainActivity.this.logoRuleDialog.show();
                LogoMainActivity logoMainActivity12 = LogoMainActivity.this;
                if (logoMainActivity12.abc1007 == null) {
                    logoMainActivity12.abc1007 = new ArrayList<>();
                }
                if (LogoMainActivity.this.abc1009.size() < 6) {
                    LogoMainActivity.this.abc1009.add(5);
                }
                LogoMainActivity logoMainActivity13 = LogoMainActivity.this;
                String[] strArr7 = logoMainActivity13.abc1008;
                if (strArr7 != null) {
                    strArr7[1] = "ani";
                }
                if (logoMainActivity13.abc2 == null) {
                    logoMainActivity13.abc2 = new ArrayList<>();
                    LogoMainActivity logoMainActivity14 = LogoMainActivity.this;
                    if (logoMainActivity14.abc1003 == null) {
                        logoMainActivity14.abc1003 = new ArrayList<>();
                    }
                    LogoMainActivity logoMainActivity15 = LogoMainActivity.this;
                    String[] strArr8 = logoMainActivity15.abc1001;
                    if (strArr8 != null) {
                        strArr8[1] = "is is";
                    }
                    if (logoMainActivity15.abc1005 < 0.8223381d) {
                        logoMainActivity15.abc1005 = 0.303028f;
                    }
                }
                if (LogoMainActivity.this.abc1008 != null) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr9 = LogoMainActivity.this.abc1008;
                        if (i5 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                            break;
                        }
                        strArr9[i5] = "string" + i5;
                        i5++;
                    }
                }
                if (LogoMainActivity.this.abc1004.size() < 1) {
                    LogoMainActivity.this.abc1004.add(7);
                }
                String[] strArr10 = LogoMainActivity.this.abc1008;
                if (strArr10 != null) {
                    strArr10[3] = "kind of";
                }
            } else {
                if (LogoMainActivity.this.logoRuleDialog != null) {
                    LogoMainActivity.this.logoRuleDialog.dismiss();
                    LogoMainActivity logoMainActivity16 = LogoMainActivity.this;
                    if (logoMainActivity16.abc1002 == null) {
                        logoMainActivity16.abc1002 = new ArrayList<>();
                    }
                    if (LogoMainActivity.this.abc1001 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr11 = LogoMainActivity.this.abc1001;
                            if (i6 >= (strArr11.length > 3 ? 3 : strArr11.length)) {
                                break;
                            }
                            strArr11[i6] = "string" + i6;
                            i6++;
                        }
                    }
                    LogoMainActivity logoMainActivity17 = LogoMainActivity.this;
                    int[] iArr = logoMainActivity17.abc1006;
                    if (iArr != null) {
                        iArr[0] = 3;
                    }
                    logoMainActivity17.abc4 = logoMainActivity17.abc4 > 1 ? 0 : 2;
                    String[] strArr12 = logoMainActivity17.abc1008;
                    if (strArr12 != null) {
                        strArr12[7] = null;
                    }
                    if (iArr != null) {
                        iArr[2] = 0;
                    }
                    if (logoMainActivity17.abc1004.size() > 5) {
                        LogoMainActivity.this.abc1004.add(9);
                    }
                }
                LogoMainActivity logoMainActivity18 = LogoMainActivity.this;
                logoMainActivity18.abc10010 = !logoMainActivity18.abc10010;
                if (logoMainActivity18.abc1000.size() < 2) {
                    LogoMainActivity.this.abc1000.add(" ho");
                }
                ArrayList<Integer> arrayList6 = LogoMainActivity.this.abc1002;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
                LogoMainActivity logoMainActivity19 = LogoMainActivity.this;
                logoMainActivity19.abc5 = ((double) logoMainActivity19.abc5) > 0.80699027d ? 0.50565743f : 0.5962469f;
                if (logoMainActivity19.abc1009 == null) {
                    logoMainActivity19.abc1009 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity20 = LogoMainActivity.this;
                if (logoMainActivity20.abc1007 == null) {
                    logoMainActivity20.abc1007 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity21 = LogoMainActivity.this;
                logoMainActivity21.abc10010 = true ^ logoMainActivity21.abc10010;
            }
            if (LogoMainActivity.this.abc10011 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr13 = LogoMainActivity.this.abc10011;
                    if (i7 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                        break;
                    }
                    strArr13[i7] = "string" + i7;
                    i7++;
                }
            }
            if (LogoMainActivity.this.abc1007.size() > 2) {
                LogoMainActivity.this.abc1007.add(2);
            }
            if (LogoMainActivity.this.abc1007.size() < 3) {
                LogoMainActivity.this.abc1007.add(8);
            }
            if (LogoMainActivity.this.abc0.size() < 8) {
                LogoMainActivity.this.abc0.add(":layou");
                LogoMainActivity logoMainActivity22 = LogoMainActivity.this;
                logoMainActivity22.abc1005 = 0.8464975f;
                if (logoMainActivity22.abc1006 == null) {
                    logoMainActivity22.abc1006 = new int[10];
                }
                if (logoMainActivity22.abc1009.size() < 4) {
                    LogoMainActivity.this.abc1009.add(3);
                }
            }
            ArrayList<Integer> arrayList7 = LogoMainActivity.this.abc1004;
            if (arrayList7 == null && arrayList7.size() > 0) {
                LogoMainActivity.this.abc1004.remove(0);
            }
            if (LogoMainActivity.this.abc1001 != null) {
                while (true) {
                    String[] strArr14 = LogoMainActivity.this.abc1001;
                    if (i >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                        break;
                    }
                    strArr14[i] = "string" + i;
                    i++;
                }
            }
            LogoMainActivity logoMainActivity23 = LogoMainActivity.this;
            if (logoMainActivity23.abc1004 == null) {
                logoMainActivity23.abc1004 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$h */
    /* loaded from: classes3.dex */
    public class C9548h implements Observer<Boolean> {
        public C9548h() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            String str;
            LogoMainActivity logoMainActivity;
            LogoMainActivity logoMainActivity2;
            if (bool.booleanValue()) {
                LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
                if (logoMainActivity3.abc1004 == null) {
                    logoMainActivity3.abc1004 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
                if (logoMainActivity4.abc1000 == null) {
                    logoMainActivity4.abc1000 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList = LogoMainActivity.this.abc1007;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMainActivity.this.abc1007.remove(0);
                }
                LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
                if (logoMainActivity5.abc0 == null) {
                    logoMainActivity5.abc0 = new ArrayList<>();
                    LogoMainActivity logoMainActivity6 = LogoMainActivity.this;
                    int[] iArr = logoMainActivity6.abc1006;
                    if (iArr != null) {
                        iArr[7] = 0;
                    }
                    logoMainActivity6.abc1005 = 0.37094426f;
                    logoMainActivity6.abc1005 = Math.abs(0.37094426f);
                }
                LogoMainActivity logoMainActivity7 = LogoMainActivity.this;
                String[] strArr = logoMainActivity7.abc1008;
                if (strArr != null) {
                    strArr[5] = null;
                }
                int[] iArr2 = logoMainActivity7.abc1006;
                if (iArr2 != null) {
                    iArr2[8] = 0;
                }
                String[] strArr2 = logoMainActivity7.abc1001;
                if (strArr2 != null) {
                    strArr2[2] = null;
                }
                if (bool.booleanValue()) {
                    str = LogoMainActivity.this.getPackageName();
                    LogoMainActivity logoMainActivity8 = LogoMainActivity.this;
                    if (logoMainActivity8.abc1009 == null) {
                        logoMainActivity8.abc1009 = new ArrayList<>();
                    }
                    ArrayList<Integer> arrayList2 = LogoMainActivity.this.abc1009;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoMainActivity.this.abc1009.remove(0);
                    }
                    LogoMainActivity logoMainActivity9 = LogoMainActivity.this;
                    if (logoMainActivity9.abc1002 == null) {
                        logoMainActivity9.abc1002 = new ArrayList<>();
                    }
                    ArrayList<Integer> arrayList3 = LogoMainActivity.this.abc1;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoMainActivity.this.abc1.remove(0);
                        LogoMainActivity logoMainActivity10 = LogoMainActivity.this;
                        logoMainActivity10.abc1005 = 0.84463316f;
                        ArrayList<String> arrayList4 = logoMainActivity10.abc1000;
                        if (arrayList4 != null && arrayList4.size() > 0) {
                            LogoMainActivity.this.abc1000.remove(0);
                        }
                        LogoMainActivity logoMainActivity11 = LogoMainActivity.this;
                        if (logoMainActivity11.abc1007 == null) {
                            logoMainActivity11.abc1007 = new ArrayList<>();
                        }
                    }
                    ArrayList<Integer> arrayList5 = LogoMainActivity.this.abc1007;
                    if (arrayList5 == null && arrayList5.size() > 0) {
                        LogoMainActivity.this.abc1007.remove(0);
                    }
                    LogoMainActivity logoMainActivity12 = LogoMainActivity.this;
                    String[] strArr3 = logoMainActivity12.abc1008;
                    if (strArr3 != null) {
                        strArr3[0] = null;
                    }
                    if (logoMainActivity12.abc1007 == null) {
                        logoMainActivity12.abc1007 = new ArrayList<>();
                    }
                } else {
                    str = "com.logomaster.logomaker";
                }
                LogoMainActivity logoMainActivity13 = LogoMainActivity.this;
                String[] strArr4 = logoMainActivity13.abc10011;
                if (strArr4 != null) {
                    strArr4[9] = "t is), ";
                }
                String[] strArr5 = logoMainActivity13.abc1001;
                if (strArr5 != null) {
                    strArr5[2] = "novel tha";
                }
                if (strArr5 == null) {
                    logoMainActivity13.abc1001 = new String[10];
                }
                if (!TextUtils.isEmpty(logoMainActivity13.abc3)) {
                    int length = LogoMainActivity.this.abc3.length();
                    if (LogoMainActivity.this.abc10011 != null) {
                        int i = 0;
                        while (true) {
                            String[] strArr6 = LogoMainActivity.this.abc10011;
                            if (i >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                                break;
                            }
                            strArr6[i] = "string" + i;
                            i++;
                        }
                    }
                    ArrayList<Integer> arrayList6 = LogoMainActivity.this.abc1009;
                    if (arrayList6 == null && arrayList6.size() > 0) {
                        LogoMainActivity.this.abc1009.remove(0);
                    }
                    if (LogoMainActivity.this.abc1004.size() < 4) {
                        LogoMainActivity.this.abc1004.add(7);
                    }
                    LogoMainActivity.this.abc3 = LogoMainActivity.this.abc3 + length;
                    if (LogoMainActivity.this.abc1006 != null) {
                        int i2 = 0;
                        while (true) {
                            int[] iArr3 = LogoMainActivity.this.abc1006;
                            if (i2 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                                break;
                            }
                            iArr3[i2] = 6;
                            i2++;
                        }
                    }
                    LogoMainActivity logoMainActivity14 = LogoMainActivity.this;
                    String[] strArr7 = logoMainActivity14.abc1008;
                    if (strArr7 != null) {
                        strArr7[2] = null;
                    }
                    if (logoMainActivity14.abc1006 != null) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr4 = LogoMainActivity.this.abc1006;
                            if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                                break;
                            }
                            iArr4[i3] = 9;
                            i3++;
                        }
                    }
                }
                if (LogoMainActivity.this.abc1004.size() < 0) {
                    LogoMainActivity.this.abc1004.add(3);
                }
                LogoMainActivity logoMainActivity15 = LogoMainActivity.this;
                logoMainActivity15.abc1005 = Math.abs(logoMainActivity15.abc1005);
                LogoMainActivity logoMainActivity16 = LogoMainActivity.this;
                if (logoMainActivity16.abc10011 == null) {
                    logoMainActivity16.abc10011 = new String[10];
                }
                String string = logoMainActivity16.getString(R.string.share_app_title);
                if (LogoMainActivity.this.abc1004.size() < 3) {
                    LogoMainActivity.this.abc1004.add(5);
                }
                if (LogoMainActivity.this.abc1008 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr8 = LogoMainActivity.this.abc1008;
                        if (i4 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i4] = "string" + i4;
                        i4++;
                    }
                }
                ArrayList<Integer> arrayList7 = LogoMainActivity.this.abc1003;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    LogoMainActivity.this.abc1003.remove(0);
                }
                LogoMainActivity logoMainActivity17 = LogoMainActivity.this;
                logoMainActivity17.abc5 = Math.abs(logoMainActivity17.abc5);
                ArrayList<Integer> arrayList8 = LogoMainActivity.this.abc1004;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    LogoMainActivity.this.abc1004.remove(0);
                }
                LogoMainActivity logoMainActivity18 = LogoMainActivity.this;
                int[] iArr5 = logoMainActivity18.abc1006;
                if (iArr5 != null) {
                    iArr5[7] = 5;
                }
                logoMainActivity18.abc1005 = ((double) logoMainActivity18.abc1005) < 0.2359199d ? 0.6189391f : 0.6919184f;
                Intent intent = new Intent();
                LogoMainActivity logoMainActivity19 = LogoMainActivity.this;
                logoMainActivity19.abc1005 = Math.abs(logoMainActivity19.abc1005);
                LogoMainActivity logoMainActivity20 = LogoMainActivity.this;
                int[] iArr6 = logoMainActivity20.abc1006;
                if (iArr6 != null) {
                    iArr6[8] = 4;
                }
                if (logoMainActivity20.abc1008 == null) {
                    logoMainActivity20.abc1008 = new String[10];
                }
                logoMainActivity20.abc3 = "mplem";
                if (iArr6 != null) {
                    iArr6[8] = 9;
                }
                ArrayList<Integer> arrayList9 = logoMainActivity20.abc1003;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    LogoMainActivity.this.abc1003.remove(0);
                }
                LogoMainActivity logoMainActivity21 = LogoMainActivity.this;
                if (logoMainActivity21.abc1001 == null) {
                    logoMainActivity21.abc1001 = new String[10];
                }
                intent.setAction("android.intent.action.SEND");
                LogoMainActivity logoMainActivity22 = LogoMainActivity.this;
                String[] strArr9 = logoMainActivity22.abc1001;
                if (strArr9 != null) {
                    strArr9[8] = "re peopl";
                }
                if (logoMainActivity22.abc1007.size() > 9) {
                    LogoMainActivity.this.abc1007.add(5);
                }
                if (LogoMainActivity.this.abc1003.size() > 6) {
                    LogoMainActivity.this.abc1003.add(9);
                }
                LogoMainActivity logoMainActivity23 = LogoMainActivity.this;
                logoMainActivity23.abc3 = "ner属性";
                logoMainActivity23.abc1005 = ((double) logoMainActivity23.abc1005) > 0.4196298d ? 0.7643208f : 0.8940078f;
                ArrayList<Integer> arrayList10 = logoMainActivity23.abc1003;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    LogoMainActivity.this.abc1003.remove(0);
                }
                if (LogoMainActivity.this.abc1009.size() < 8) {
                    LogoMainActivity.this.abc1009.add(4);
                }
                intent.putExtra("android.intent.extra.TEXT", string + "\nLogo Master V1.0.0\n\nhttps://play.google.com/store/apps/details?id=" + str);
                LogoMainActivity logoMainActivity24 = LogoMainActivity.this;
                int[] iArr7 = logoMainActivity24.abc1006;
                if (iArr7 != null) {
                    iArr7[3] = 0;
                }
                if (logoMainActivity24.abc10011 == null) {
                    logoMainActivity24.abc10011 = new String[10];
                }
                ArrayList<Integer> arrayList11 = logoMainActivity24.abc1002;
                if (arrayList11 == null && arrayList11.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
                if (LogoMainActivity.this.abc0.size() < 5) {
                    LogoMainActivity.this.abc0.add("      <net");
                    if (LogoMainActivity.this.abc1002.size() > 0) {
                        LogoMainActivity.this.abc1002.add(3);
                    }
                    if (LogoMainActivity.this.abc1008 != null) {
                        int i5 = 0;
                        while (true) {
                            String[] strArr10 = LogoMainActivity.this.abc1008;
                            if (i5 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                                break;
                            }
                            strArr10[i5] = "string" + i5;
                            i5++;
                        }
                    }
                    ArrayList<Integer> arrayList12 = LogoMainActivity.this.abc1002;
                    if (arrayList12 == null && arrayList12.size() > 0) {
                        LogoMainActivity.this.abc1002.remove(0);
                    }
                }
                LogoMainActivity logoMainActivity25 = LogoMainActivity.this;
                logoMainActivity25.abc10010 = true;
                ArrayList<Integer> arrayList13 = logoMainActivity25.abc1002;
                if (arrayList13 == null && arrayList13.size() > 0) {
                    LogoMainActivity.this.abc1002.remove(0);
                }
                LogoMainActivity.this.abc10010 = !logoMainActivity.abc10010;
                intent.setType("text/plain");
                LogoMainActivity logoMainActivity26 = LogoMainActivity.this;
                logoMainActivity26.abc10010 = !logoMainActivity26.abc10010;
                ArrayList<Integer> arrayList14 = logoMainActivity26.abc1009;
                if (arrayList14 == null && arrayList14.size() > 0) {
                    LogoMainActivity.this.abc1009.remove(0);
                }
                if (LogoMainActivity.this.abc1001 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr11 = LogoMainActivity.this.abc1001;
                        if (i6 >= (strArr11.length > 3 ? 3 : strArr11.length)) {
                            break;
                        }
                        strArr11[i6] = "string" + i6;
                        i6++;
                    }
                }
                LogoMainActivity logoMainActivity27 = LogoMainActivity.this;
                if (logoMainActivity27.abc1 == null) {
                    logoMainActivity27.abc1 = new ArrayList<>();
                    LogoMainActivity logoMainActivity28 = LogoMainActivity.this;
                    logoMainActivity28.abc1005 = Math.abs(logoMainActivity28.abc1005);
                    if (LogoMainActivity.this.abc1007.size() > 9) {
                        LogoMainActivity.this.abc1007.add(4);
                    }
                    LogoMainActivity.this.abc10010 = !logoMainActivity2.abc10010;
                }
                ArrayList<Integer> arrayList15 = LogoMainActivity.this.abc1007;
                if (arrayList15 == null && arrayList15.size() > 0) {
                    LogoMainActivity.this.abc1007.remove(0);
                }
                LogoMainActivity logoMainActivity29 = LogoMainActivity.this;
                int[] iArr8 = logoMainActivity29.abc1006;
                if (iArr8 != null) {
                    iArr8[6] = 0;
                }
                if (logoMainActivity29.abc1004 == null) {
                    logoMainActivity29.abc1004 = new ArrayList<>();
                }
                LogoMainActivity.this.startActivity(Intent.createChooser(intent, string));
                if (LogoMainActivity.this.abc1003.size() > 7) {
                    LogoMainActivity.this.abc1003.add(0);
                }
                ArrayList<String> arrayList16 = LogoMainActivity.this.abc1000;
                if (arrayList16 != null && arrayList16.size() > 0) {
                    LogoMainActivity.this.abc1000.remove(0);
                }
                LogoMainActivity logoMainActivity30 = LogoMainActivity.this;
                logoMainActivity30.abc10010 = !logoMainActivity30.abc10010;
                logoMainActivity30.abc4 = logoMainActivity30.abc4 >= 8 ? 0 : 1;
                ArrayList<String> arrayList17 = logoMainActivity30.abc1000;
                if (arrayList17 != null && arrayList17.size() > 0) {
                    LogoMainActivity.this.abc1000.remove(0);
                }
                ArrayList<Integer> arrayList18 = LogoMainActivity.this.abc1007;
                if (arrayList18 == null && arrayList18.size() > 0) {
                    LogoMainActivity.this.abc1007.remove(0);
                }
                LogoMainActivity logoMainActivity31 = LogoMainActivity.this;
                if (logoMainActivity31.abc1005 < 0.24382102d) {
                    logoMainActivity31.abc1005 = 0.92836255f;
                }
            }
            LogoMainActivity logoMainActivity32 = LogoMainActivity.this;
            logoMainActivity32.abc1005 = -logoMainActivity32.abc1005;
            ArrayList<Integer> arrayList19 = logoMainActivity32.abc1007;
            if (arrayList19 == null && arrayList19.size() > 0) {
                LogoMainActivity.this.abc1007.remove(0);
            }
            LogoMainActivity logoMainActivity33 = LogoMainActivity.this;
            if (logoMainActivity33.abc1006 == null) {
                logoMainActivity33.abc1006 = new int[10];
            }
            if (logoMainActivity33.abc4 < 0) {
                logoMainActivity33.abc4 = 6;
                ArrayList<Integer> arrayList20 = logoMainActivity33.abc1009;
                if (arrayList20 == null && arrayList20.size() > 0) {
                    LogoMainActivity.this.abc1009.remove(0);
                }
                LogoMainActivity logoMainActivity34 = LogoMainActivity.this;
                logoMainActivity34.abc10010 = false;
                logoMainActivity34.abc1005 = ((double) logoMainActivity34.abc1005) > 0.2531761d ? 0.39550805f : 0.36914498f;
            }
            ArrayList<String> arrayList21 = LogoMainActivity.this.abc1000;
            if (arrayList21 != null && arrayList21.size() > 0) {
                LogoMainActivity.this.abc1000.remove(0);
            }
            LogoMainActivity logoMainActivity35 = LogoMainActivity.this;
            logoMainActivity35.abc1005 -= 0.8330042f;
            if (logoMainActivity35.abc1000 == null) {
                logoMainActivity35.abc1000 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$i */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9549i implements View.OnClickListener {
        public View$OnClickListenerC9549i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(LogoMainActivity.this, LogoCreateActivity.class);
            LogoMainActivity logoMainActivity = LogoMainActivity.this;
            logoMainActivity.abc10010 = !logoMainActivity.abc10010;
            if (logoMainActivity.abc1001 == null) {
                logoMainActivity.abc1001 = new String[10];
            }
            ArrayList<Integer> arrayList = logoMainActivity.abc1007;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMainActivity.this.abc1007.remove(0);
            }
            if (LogoMainActivity.this.abc0.size() > 6) {
                LogoMainActivity.this.abc0.add("圆角");
                if (LogoMainActivity.this.abc1009.size() > 3) {
                    LogoMainActivity.this.abc1009.add(2);
                }
                LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
                if (logoMainActivity2.abc1000 == null) {
                    logoMainActivity2.abc1000 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
                logoMainActivity3.abc10010 = !logoMainActivity3.abc10010;
            }
            LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
            String[] strArr = logoMainActivity4.abc1008;
            if (strArr != null) {
                strArr[5] = null;
            }
            logoMainActivity4.abc1005 = Math.abs(logoMainActivity4.abc1005);
            ArrayList<Integer> arrayList2 = LogoMainActivity.this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            LogoMainActivity.this.startActivity(intent);
            ArrayList<Integer> arrayList3 = LogoMainActivity.this.abc1002;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
            if (logoMainActivity5.abc1006 == null) {
                logoMainActivity5.abc1006 = new int[10];
            }
            if (logoMainActivity5.abc1002.size() > 1) {
                LogoMainActivity.this.abc1002.add(1);
            }
            LogoMainActivity logoMainActivity6 = LogoMainActivity.this;
            logoMainActivity6.abc5 = ((double) logoMainActivity6.abc5) < 0.39724308d ? 0.60519344f : 0.8742264f;
            int[] iArr = logoMainActivity6.abc1006;
            if (iArr != null) {
                iArr[9] = 0;
            }
            ArrayList<Integer> arrayList4 = logoMainActivity6.abc1002;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            LogoMainActivity logoMainActivity7 = LogoMainActivity.this;
            if (logoMainActivity7.abc1005 < 0.94289684d) {
                logoMainActivity7.abc1005 = 0.651327f;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMainActivity$j */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9550j implements View.OnClickListener {
        public View$OnClickListenerC9550j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(LogoMainActivity.this, LogoMyDesignActivity.class);
            LogoMainActivity logoMainActivity = LogoMainActivity.this;
            if (logoMainActivity.abc1000 == null) {
                logoMainActivity.abc1000 = new ArrayList<>();
            }
            LogoMainActivity logoMainActivity2 = LogoMainActivity.this;
            logoMainActivity2.abc10010 = false;
            ArrayList<Integer> arrayList = logoMainActivity2.abc1002;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            LogoMainActivity logoMainActivity3 = LogoMainActivity.this;
            if (logoMainActivity3.abc0 == null) {
                logoMainActivity3.abc0 = new ArrayList<>();
                LogoMainActivity logoMainActivity4 = LogoMainActivity.this;
                if (logoMainActivity4.abc1009 == null) {
                    logoMainActivity4.abc1009 = new ArrayList<>();
                }
                LogoMainActivity logoMainActivity5 = LogoMainActivity.this;
                if (logoMainActivity5.abc1002 == null) {
                    logoMainActivity5.abc1002 = new ArrayList<>();
                }
                int[] iArr = LogoMainActivity.this.abc1006;
                if (iArr != null) {
                    iArr[6] = 0;
                }
            }
            LogoMainActivity logoMainActivity6 = LogoMainActivity.this;
            if (logoMainActivity6.abc1003 == null) {
                logoMainActivity6.abc1003 = new ArrayList<>();
            }
            LogoMainActivity logoMainActivity7 = LogoMainActivity.this;
            if (logoMainActivity7.abc1001 == null) {
                logoMainActivity7.abc1001 = new String[10];
            }
            logoMainActivity7.abc10010 = !logoMainActivity7.abc10010;
            logoMainActivity7.startActivity(intent);
            ArrayList<Integer> arrayList2 = LogoMainActivity.this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            LogoMainActivity logoMainActivity8 = LogoMainActivity.this;
            logoMainActivity8.abc10010 = !logoMainActivity8.abc10010;
            ArrayList<Integer> arrayList3 = logoMainActivity8.abc1002;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoMainActivity.this.abc1002.remove(0);
            }
            ArrayList<String> arrayList4 = LogoMainActivity.this.abc0;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoMainActivity.this.abc0.remove(0);
                LogoMainActivity logoMainActivity9 = LogoMainActivity.this;
                if (logoMainActivity9.abc10011 == null) {
                    logoMainActivity9.abc10011 = new String[10];
                }
                if (logoMainActivity9.abc1005 < 0.9642545d) {
                    logoMainActivity9.abc1005 = 0.86729926f;
                }
                if (logoMainActivity9.abc1002.size() < 4) {
                    LogoMainActivity.this.abc1002.add(4);
                }
            }
            LogoMainActivity logoMainActivity10 = LogoMainActivity.this;
            logoMainActivity10.abc10010 = false;
            logoMainActivity10.abc10010 = true;
            if (logoMainActivity10.abc1007 == null) {
                logoMainActivity10.abc1007 = new ArrayList<>();
            }
        }
    }

    private void init() {
        this.binding.llPrivacyPolicy.setOnClickListener(new View$OnClickListenerC9543c());
        this.abc1005 -= 0.4666679f;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList = this.abc1003;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc3 = "5";
        String[] strArr = this.abc1001;
        if (strArr != null) {
            strArr[2] = null;
        }
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.binding.rlMore.setOnClickListener(new View$OnClickListenerC9544d());
        if (this.abc10011 != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.abc10011;
                if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i] = "string" + i;
                i++;
            }
        }
        this.abc10010 = !this.abc10010;
        String[] strArr3 = this.abc1001;
        if (strArr3 != null) {
            strArr3[4] = null;
        }
        if (this.abc2.size() > 1) {
            this.abc2.add("—TextVi");
            int[] iArr = this.abc1006;
            if (iArr != null) {
                iArr[4] = 9;
            }
            ArrayList<Integer> arrayList2 = this.abc1009;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1009.remove(0);
            }
            ArrayList<Integer> arrayList3 = this.abc1009;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1009.remove(0);
            }
        }
        this.abc10010 = false;
        if (this.abc1003.size() < 9) {
            this.abc1003.add(0);
        }
        this.abc1005 = -this.abc1005;
        this.binding.drawerLayout.addDrawerListener(new C9545e());
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        this.abc1005 = 0.77386326f;
        String[] strArr4 = this.abc10011;
        if (strArr4 != null) {
            strArr4[4] = "si";
        }
        this.abc5 += 0.084151864f;
        ArrayList<Integer> arrayList4 = this.abc1004;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1007.size() < 0) {
            this.abc1007.add(5);
        }
        int[] iArr2 = this.abc1006;
        if (iArr2 != null) {
            iArr2[2] = 0;
        }
        String str = getString(R.string.app_version) + ": ";
        String[] strArr5 = this.abc1008;
        if (strArr5 != null) {
            strArr5[7] = "racters ";
        }
        ArrayList<Integer> arrayList5 = this.abc1004;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1006 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr3 = this.abc1006;
                if (i2 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i2] = 2;
                i2++;
            }
        }
        if (this.abc0.size() < 1) {
            this.abc0.add("t");
            this.abc1005 = 0.9173574f;
            ArrayList<Integer> arrayList6 = this.abc1004;
            if (arrayList6 == null && arrayList6.size() > 0) {
                this.abc1004.remove(0);
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        String[] strArr6 = this.abc1008;
        if (strArr6 != null) {
            strArr6[9] = null;
        }
        this.abc1005 *= 0.95927364f;
        if (this.f15768b) {
            str = str + LogoConstants.f25536b;
            if (this.abc1007.size() > 0) {
                this.abc1007.add(1);
            }
            if (this.abc1007.size() > 1) {
                this.abc1007.add(5);
            }
            ArrayList<String> arrayList7 = this.abc1000;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc1000.remove(0);
            }
            this.abc5 = 0.5589516f;
            this.abc10010 = !this.abc10010;
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(6);
            }
        }
        ArrayList<String> arrayList8 = this.abc1000;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.abc1000.remove(0);
        }
        ArrayList<Integer> arrayList9 = this.abc1003;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc1008 == null) {
            this.abc1008 = new String[10];
        }
        ArrayList<String> arrayList10 = this.abc2;
        if (arrayList10 != null && arrayList10.size() > 0) {
            this.abc2.remove(0);
            ArrayList<Integer> arrayList11 = this.abc1007;
            if (arrayList11 == null && arrayList11.size() > 0) {
                this.abc1007.remove(0);
            }
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
        }
        if (this.abc1001 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr7 = this.abc1001;
                if (i3 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                    break;
                }
                strArr7[i3] = "string" + i3;
                i3++;
            }
        }
        this.abc1005 += 0.094522476f;
        ArrayList<Integer> arrayList12 = this.abc1004;
        if (arrayList12 == null && arrayList12.size() > 0) {
            this.abc1004.remove(0);
        }
        this.binding.tvVersion.setText(str);
        this.abc1005 = -this.abc1005;
        ArrayList<Integer> arrayList13 = this.abc1003;
        if (arrayList13 == null && arrayList13.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1005 += 0.4620924f;
        ArrayList<Integer> arrayList14 = this.abc1;
        if (arrayList14 == null && arrayList14.size() > 0) {
            this.abc1.remove(0);
            if (this.abc1005 > 0.42941672d) {
                this.abc1005 = 0.03459418f;
            }
            int[] iArr4 = this.abc1006;
            if (iArr4 != null) {
                iArr4[2] = 2;
            }
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
        }
        if (this.abc1003.size() > 0) {
            this.abc1003.add(6);
        }
        this.abc10010 = !this.abc10010;
        String[] strArr8 = this.abc1001;
        if (strArr8 != null) {
            strArr8[3] = null;
        }
        this.logoMainVM.getIsShowRateUsDialog().observe(this, new C9546f());
        ArrayList<Integer> arrayList15 = this.abc1007;
        if (arrayList15 == null && arrayList15.size() > 0) {
            this.abc1007.remove(0);
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList16 = this.abc1003;
        if (arrayList16 == null && arrayList16.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc2.size() > 3) {
            this.abc2.add("werooo！");
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            this.abc10010 = false;
            String[] strArr9 = this.abc1008;
            if (strArr9 != null) {
                strArr9[7] = null;
            }
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1005 = ((double) this.abc1005) > 0.7243344d ? 0.5343872f : 0.60752094f;
        this.abc10010 = false;
        this.logoMainVM.getIsShowRuleDialog().observe(this, new C9547g());
        ArrayList<Integer> arrayList17 = this.abc1002;
        if (arrayList17 == null && arrayList17.size() > 0) {
            this.abc1002.remove(0);
        }
        ArrayList<Integer> arrayList18 = this.abc1004;
        if (arrayList18 == null && arrayList18.size() > 0) {
            this.abc1004.remove(0);
        }
        int[] iArr5 = this.abc1006;
        if (iArr5 != null) {
            iArr5[8] = 0;
        }
        if (this.abc2.size() > 6) {
            this.abc2.add("ttr f");
            String[] strArr10 = this.abc1008;
            if (strArr10 != null) {
                strArr10[7] = null;
            }
            ArrayList<Integer> arrayList19 = this.abc1003;
            if (arrayList19 == null && arrayList19.size() > 0) {
                this.abc1003.remove(0);
            }
            int[] iArr6 = this.abc1006;
            if (iArr6 != null) {
                iArr6[6] = 0;
            }
        }
        if (this.abc1002.size() > 3) {
            this.abc1002.add(0);
        }
        int[] iArr7 = this.abc1006;
        if (iArr7 != null) {
            iArr7[7] = 0;
        }
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        this.logoMainVM.getIsToShareApp().observe(this, new C9548h());
        ArrayList<Integer> arrayList20 = this.abc1002;
        if (arrayList20 == null && arrayList20.size() > 0) {
            this.abc1002.remove(0);
        }
        ArrayList<Integer> arrayList21 = this.abc1003;
        if (arrayList21 == null && arrayList21.size() > 0) {
            this.abc1003.remove(0);
        }
        ArrayList<Integer> arrayList22 = this.abc1002;
        if (arrayList22 == null && arrayList22.size() > 0) {
            this.abc1002.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc3)) {
            int length = this.abc3.length();
            ArrayList<String> arrayList23 = this.abc1000;
            if (arrayList23 != null && arrayList23.size() > 0) {
                this.abc1000.remove(0);
            }
            ArrayList<Integer> arrayList24 = this.abc1002;
            if (arrayList24 == null && arrayList24.size() > 0) {
                this.abc1002.remove(0);
            }
            if (this.abc1009.size() > 6) {
                this.abc1009.add(0);
            }
            this.abc3 += length;
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            this.abc10010 = false;
            if (this.abc1000.size() > 8) {
                this.abc1000.add(DownloadCommon.DOWNLOAD_REPORT_REASON);
            }
        }
        String[] strArr11 = this.abc1008;
        if (strArr11 != null) {
            strArr11[9] = null;
        }
        if (this.abc1001 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr12 = this.abc1001;
                if (i4 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                    break;
                }
                strArr12[i4] = "string" + i4;
                i4++;
            }
        }
        if (this.abc1008 == null) {
            this.abc1008 = new String[10];
        }
        this.binding.ivCreate.setOnClickListener(new View$OnClickListenerC9549i());
        if (this.abc1005 < 0.45638132d) {
            this.abc1005 = 0.7321889f;
        }
        this.abc10010 = true;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        if (this.abc1.size() < 4) {
            this.abc1.add(5);
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            if (this.abc1008 == null) {
                this.abc1008 = new String[10];
            }
            String[] strArr13 = this.abc1008;
            if (strArr13 != null) {
                strArr13[6] = "ny ways de";
            }
        }
        if (this.abc1009.size() > 6) {
            this.abc1009.add(8);
        }
        if (this.abc1004.size() > 9) {
            this.abc1004.add(1);
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        this.binding.ivDesign.setOnClickListener(new View$OnClickListenerC9550j());
        ArrayList<Integer> arrayList25 = this.abc1003;
        if (arrayList25 == null && arrayList25.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1005 *= 0.90639013f;
        this.abc10010 = !this.abc10010;
        this.abc4 = this.abc4 < 9 ? 4 : 7;
        ArrayList<String> arrayList26 = this.abc1000;
        if (arrayList26 != null && arrayList26.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc1009.size() > 4) {
            this.abc1009.add(1);
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        this.binding.ivMyLogo.setOnClickListener(new View$OnClickListenerC9541a());
        if (this.abc1003.size() < 1) {
            this.abc1003.add(3);
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        if (this.abc1006 != null) {
            int i5 = 0;
            while (true) {
                int[] iArr8 = this.abc1006;
                if (i5 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                    break;
                }
                iArr8[i5] = 8;
                i5++;
            }
        }
        int i6 = 0;
        while (true) {
            int i7 = this.abc4;
            if (i6 >= i7) {
                break;
            }
            this.abc4 = i7 - 7;
            this.abc10010 = true;
            if (this.abc1006 != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr9 = this.abc1006;
                    if (i8 < (iArr9.length > 3 ? 3 : iArr9.length)) {
                        iArr9[i8] = 4;
                        i8++;
                    }
                }
            }
            this.abc1005 = -this.abc1005;
            i6++;
        }
        if (this.abc1006 != null) {
            int i9 = 0;
            while (true) {
                int[] iArr10 = this.abc1006;
                if (i9 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                    break;
                }
                iArr10[i9] = 8;
                i9++;
            }
        }
        this.abc10010 = false;
        this.logoMainVM.initData();
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        if (this.abc1008 == null) {
            this.abc1008 = new String[10];
        }
        this.abc10010 = true;
        for (int i10 = 0; i10 < this.abc4; i10++) {
            if (this.abc2.size() > 8) {
                this.abc2.add("ppcom");
                ArrayList<Integer> arrayList27 = this.abc1004;
                if (arrayList27 == null && arrayList27.size() > 0) {
                    this.abc1004.remove(0);
                }
                this.abc1005 = 0.2739706f;
                this.abc10010 = false;
            }
            String[] strArr14 = this.abc10011;
            if (strArr14 != null) {
                strArr14[2] = null;
            }
            ArrayList<Integer> arrayList28 = this.abc1002;
            if (arrayList28 == null && arrayList28.size() > 0) {
                this.abc1002.remove(0);
            }
            String[] strArr15 = this.abc10011;
            if (strArr15 != null) {
                strArr15[4] = "ear";
            }
        }
        ArrayList<String> arrayList29 = this.abc1000;
        if (arrayList29 != null && arrayList29.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc1007.size() < 9) {
            this.abc1007.add(5);
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        checkedStatement();
        this.abc10010 = !this.abc10010;
        if (this.abc1001 != null) {
            int i11 = 0;
            while (true) {
                String[] strArr16 = this.abc1001;
                if (i11 >= (strArr16.length > 3 ? 3 : strArr16.length)) {
                    break;
                }
                strArr16[i11] = "string" + i11;
                i11++;
            }
        }
        ArrayList<Integer> arrayList30 = this.abc1004;
        if (arrayList30 == null && arrayList30.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc0.size() < 1) {
            this.abc0.add("ephoto照片");
            if (this.abc1009 == null) {
                this.abc1009 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList31 = this.abc1002;
            if (arrayList31 == null && arrayList31.size() > 0) {
                this.abc1002.remove(0);
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
        }
        this.abc1005 = (this.abc1005 - 0.81767184f) - 0.7975726f;
        ArrayList<Integer> arrayList32 = this.abc1004;
        if (arrayList32 != null || arrayList32.size() <= 0) {
            return;
        }
        this.abc1004.remove(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logMsg(String str) {
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList = this.abc1004;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList2 = this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList3 = this.abc1004;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList4 = this.abc1002;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr2 = this.abc1008;
        if (strArr2 != null) {
            strArr2[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openWebview() {
        Uri parse = Uri.parse("https://sites.google.com/view/logo-master2");
        if (this.abc1004.size() > 6) {
            this.abc1004.add(7);
        }
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[6] = "miliar wit";
        }
        if (this.abc1004.size() < 3) {
            this.abc1004.add(8);
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            if (this.abc1007.size() > 1) {
                this.abc1007.add(0);
            }
            ArrayList<Integer> arrayList = this.abc1002;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (this.abc1001 != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.abc1001;
                if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i] = "string" + i;
                i++;
            }
        }
        if (this.abc1009.size() > 1) {
            this.abc1009.add(2);
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        if (this.abc1008 == null) {
            this.abc1008 = new String[10];
        }
        this.abc10010 = !this.abc10010;
        if (this.abc1001 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr3 = this.abc1001;
                if (i2 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i2] = "string" + i2;
                i2++;
            }
        }
        this.abc5 = 0.9651481f;
        String[] strArr4 = this.abc10011;
        if (strArr4 != null) {
            strArr4[9] = "ly until y";
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        this.abc1005 = ((double) this.abc1005) < 0.49955404d ? 0.8814194f : 0.24149066f;
        startActivity(intent);
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        if (this.abc10011 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr5 = this.abc10011;
                if (i3 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i3] = "string" + i3;
                i3++;
            }
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        if (this.abc5 < 0.34662282d) {
            this.abc5 = 0.93395966f;
            String[] strArr6 = this.abc10011;
            if (strArr6 != null) {
                strArr6[8] = "u";
            }
            ArrayList<Integer> arrayList2 = this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1002.remove(0);
            }
            int[] iArr = this.abc1006;
            if (iArr != null) {
                iArr[0] = 4;
            }
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        if (this.abc1009.size() < 8) {
            this.abc1009.add(8);
        }
        ArrayList<String> arrayList3 = this.abc1000;
        if (arrayList3 == null || arrayList3.size() <= 0) {
            return;
        }
        this.abc1000.remove(0);
    }

    private void startFB() {
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList = this.abc1004;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList2 = this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        this.startF = SPUtils.m878a("LoGoData", 0).m877b("lo_f");
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList3 = this.abc1004;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList4 = this.abc1002;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr2 = this.abc1008;
        if (strArr2 != null) {
            strArr2[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        logMsg("startF:" + this.startF);
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList5 = this.abc1004;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList6 = this.abc1002;
            if (arrayList6 == null && arrayList6.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr3 = this.abc1008;
        if (strArr3 != null) {
            strArr3[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        if (this.startF > 0) {
            this.abc10010 = false;
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
            this.abc10010 = !false;
            if (this.abc2.size() > 8) {
                this.abc2.add("t=dime");
                if (this.abc1003.size() < 1) {
                    this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList7 = this.abc1004;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList8 = this.abc1002;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    this.abc1002.remove(0);
                }
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(8);
            }
            String[] strArr4 = this.abc1008;
            if (strArr4 != null) {
                strArr4[2] = "t ";
            }
            if (this.abc1003.size() < 9) {
                this.abc1003.add(5);
                return;
            }
            return;
        }
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList9 = this.abc1004;
            if (arrayList9 == null && arrayList9.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList10 = this.abc1002;
            if (arrayList10 == null && arrayList10.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr5 = this.abc1008;
        if (strArr5 != null) {
            strArr5[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        FacebookSdk.setAutoInitEnabled(true);
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList11 = this.abc1004;
            if (arrayList11 == null && arrayList11.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList12 = this.abc1002;
            if (arrayList12 == null && arrayList12.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr6 = this.abc1008;
        if (strArr6 != null) {
            strArr6[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        FacebookSdk.fullyInitialize();
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList13 = this.abc1004;
            if (arrayList13 == null && arrayList13.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList14 = this.abc1002;
            if (arrayList14 == null && arrayList14.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr7 = this.abc1008;
        if (strArr7 != null) {
            strArr7[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        AppLinkData.fetchDeferredAppLinkData(getApplicationContext(), new C9542b());
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList15 = this.abc1004;
            if (arrayList15 == null && arrayList15.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList16 = this.abc1002;
            if (arrayList16 == null && arrayList16.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr8 = this.abc1008;
        if (strArr8 != null) {
            strArr8[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
    }

    public void checkedStatement() {
        int i = 0;
        SharedPreferences sharedPreferences = getSharedPreferences("logo_master", 0);
        int[] iArr = this.abc1006;
        if (iArr != null) {
            iArr[1] = 0;
        }
        ArrayList<Integer> arrayList = this.abc1003;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc2.size() > 1) {
            this.abc2.add("2css-");
            this.abc1005 = Math.abs(this.abc1005);
            ArrayList<Integer> arrayList2 = this.abc1003;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1003.remove(0);
            }
            if (this.abc1001 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = this.abc1001;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
        }
        ArrayList<Integer> arrayList3 = this.abc1009;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc1009.remove(0);
        }
        if (this.abc10011 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.abc10011;
                if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i3] = "string" + i3;
                i3++;
            }
        }
        String[] strArr3 = this.abc10011;
        if (strArr3 != null) {
            strArr3[0] = null;
        }
        boolean z = sharedPreferences.getBoolean("isAgree", false);
        this.abc10010 = !this.abc10010;
        ArrayList<Integer> arrayList4 = this.abc1004;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (this.abc5 < 0.5429656d) {
            this.abc5 = 0.9769088f;
            String[] strArr4 = this.abc1008;
            if (strArr4 != null) {
                strArr4[5] = "d to";
            }
            String[] strArr5 = this.abc1001;
            if (strArr5 != null) {
                strArr5[4] = null;
            }
            int[] iArr2 = this.abc1006;
            if (iArr2 != null) {
                iArr2[3] = 6;
            }
        }
        if (this.abc1009.size() < 8) {
            this.abc1009.add(9);
        }
        if (this.abc1000.size() < 9) {
            this.abc1000.add("oba");
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (!z) {
            if (this.logoRuleDialog == null) {
                this.logoRuleDialog = new LogoRuleDialog(this);
                int[] iArr3 = this.abc1006;
                if (iArr3 != null) {
                    iArr3[1] = 0;
                }
                String[] strArr6 = this.abc1001;
                if (strArr6 != null) {
                    strArr6[1] = "re forced ";
                }
                if (this.abc1004.size() > 9) {
                    this.abc1004.add(0);
                }
                this.abc3 = "库，感谢：Realt";
                if (this.abc1004 == null) {
                    this.abc1004 = new ArrayList<>();
                }
                this.abc1005 = -this.abc1005;
                this.abc10010 = !this.abc10010;
            }
            ArrayList<Integer> arrayList5 = this.abc1003;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1003.remove(0);
            }
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            ArrayList<String> arrayList6 = this.abc1000;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1000.remove(0);
            }
            this.abc3 = "rz";
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList7 = this.abc1009;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.abc1009.remove(0);
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(8);
            }
            this.logoRuleDialog.show();
            ArrayList<Integer> arrayList8 = this.abc1004;
            if (arrayList8 == null && arrayList8.size() > 0) {
                this.abc1004.remove(0);
            }
            if (this.abc10011 == null) {
                this.abc10011 = new String[10];
            }
            if (this.abc1009 == null) {
                this.abc1009 = new ArrayList<>();
            }
            this.abc5 = Math.abs(this.abc5);
            ArrayList<Integer> arrayList9 = this.abc1009;
            if (arrayList9 == null && arrayList9.size() > 0) {
                this.abc1009.remove(0);
            }
            if (this.abc1005 > 0.45966953d) {
                this.abc1005 = 0.76141053f;
            }
            if (this.abc1008 == null) {
                this.abc1008 = new String[10];
            }
        } else {
            this.abc10010 = false;
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
            this.abc10010 = !false;
            if (this.abc2.size() > 8) {
                this.abc2.add("t=dime");
                if (this.abc1003.size() < 1) {
                    this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList10 = this.abc1004;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList11 = this.abc1002;
                if (arrayList11 == null && arrayList11.size() > 0) {
                    this.abc1002.remove(0);
                }
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(8);
            }
            String[] strArr7 = this.abc1008;
            if (strArr7 != null) {
                strArr7[2] = "t ";
            }
            if (this.abc1003.size() < 9) {
                this.abc1003.add(5);
            }
            Intent intent = new Intent(this, LogoSettingsActivity.class);
            this.abc10010 = false;
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
            this.abc10010 = !false;
            if (this.abc2.size() > 8) {
                this.abc2.add("t=dime");
                if (this.abc1003.size() < 1) {
                    this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList12 = this.abc1004;
                if (arrayList12 == null && arrayList12.size() > 0) {
                    this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList13 = this.abc1002;
                if (arrayList13 == null && arrayList13.size() > 0) {
                    this.abc1002.remove(0);
                }
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(8);
            }
            String[] strArr8 = this.abc1008;
            if (strArr8 != null) {
                strArr8[2] = "t ";
            }
            if (this.abc1003.size() < 9) {
                this.abc1003.add(5);
            }
            intent.addFlags(268435456);
            this.abc10010 = false;
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
            this.abc10010 = !false;
            if (this.abc2.size() > 8) {
                this.abc2.add("t=dime");
                if (this.abc1003.size() < 1) {
                    this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList14 = this.abc1004;
                if (arrayList14 == null && arrayList14.size() > 0) {
                    this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList15 = this.abc1002;
                if (arrayList15 == null && arrayList15.size() > 0) {
                    this.abc1002.remove(0);
                }
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(8);
            }
            String[] strArr9 = this.abc1008;
            if (strArr9 != null) {
                strArr9[2] = "t ";
            }
            if (this.abc1003.size() < 9) {
                this.abc1003.add(5);
            }
            intent.addFlags(67108864);
            this.abc10010 = false;
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
            this.abc10010 = !false;
            if (this.abc2.size() > 8) {
                this.abc2.add("t=dime");
                if (this.abc1003.size() < 1) {
                    this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList16 = this.abc1004;
                if (arrayList16 == null && arrayList16.size() > 0) {
                    this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList17 = this.abc1002;
                if (arrayList17 == null && arrayList17.size() > 0) {
                    this.abc1002.remove(0);
                }
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(8);
            }
            String[] strArr10 = this.abc1008;
            if (strArr10 != null) {
                strArr10[2] = "t ";
            }
            if (this.abc1003.size() < 9) {
                this.abc1003.add(5);
            }
            startActivity(intent);
            this.abc10010 = false;
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
            this.abc10010 = !false;
            if (this.abc2.size() > 8) {
                this.abc2.add("t=dime");
                if (this.abc1003.size() < 1) {
                    this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList18 = this.abc1004;
                if (arrayList18 == null && arrayList18.size() > 0) {
                    this.abc1004.remove(0);
                }
                ArrayList<Integer> arrayList19 = this.abc1002;
                if (arrayList19 == null && arrayList19.size() > 0) {
                    this.abc1002.remove(0);
                }
            }
            if (this.abc1002.size() > 9) {
                this.abc1002.add(8);
            }
            String[] strArr11 = this.abc1008;
            if (strArr11 != null) {
                strArr11[2] = "t ";
            }
            if (this.abc1003.size() < 9) {
                this.abc1003.add(5);
            }
        }
        if (this.abc1000.size() < 0) {
            this.abc1000.add("r being, w");
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (this.abc1009.size() > 9) {
            this.abc1009.add(6);
        }
        if (this.abc2 == null) {
            this.abc2 = new ArrayList<>();
            ArrayList<Integer> arrayList20 = this.abc1007;
            if (arrayList20 == null && arrayList20.size() > 0) {
                this.abc1007.remove(0);
            }
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
            ArrayList<String> arrayList21 = this.abc1000;
            if (arrayList21 != null && arrayList21.size() > 0) {
                this.abc1000.remove(0);
            }
        }
        String[] strArr12 = this.abc1008;
        if (strArr12 != null) {
            strArr12[0] = null;
        }
        if (strArr12 != null) {
            while (true) {
                String[] strArr13 = this.abc1008;
                if (i >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                    break;
                }
                strArr13[i] = "string" + i;
                i++;
            }
        }
        if (this.abc1003.size() < 8) {
            this.abc1003.add(7);
        }
    }

    public int getStatusBarHeight() {
        int i;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        if (this.abc1003.size() > 8) {
            this.abc1003.add(6);
        }
        if (this.abc1003.size() > 5) {
            this.abc1003.add(8);
        }
        this.abc4 *= 0;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        ArrayList<Integer> arrayList = this.abc1004;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1004.remove(0);
        }
        this.abc1005 += 0.14252877f;
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        String[] strArr = this.abc10011;
        if (strArr != null) {
            strArr[8] = "ly ";
        }
        ArrayList<Integer> arrayList2 = this.abc1009;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1009.remove(0);
        }
        ArrayList<String> arrayList3 = this.abc1000;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc3 = "_colo";
        float f = ((double) this.abc1005) < 0.1334672d ? 0.79816157f : 0.1740601f;
        this.abc1005 = f;
        this.abc1005 = Math.abs(f);
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        if (identifier > 0) {
            i = getResources().getDimensionPixelSize(identifier);
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            String[] strArr2 = this.abc1001;
            if (strArr2 != null) {
                strArr2[9] = null;
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            if (this.abc0 == null) {
                this.abc0 = new ArrayList<>();
                if (this.abc10011 == null) {
                    this.abc10011 = new String[10];
                }
                ArrayList<Integer> arrayList4 = this.abc1004;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    this.abc1004.remove(0);
                }
                this.abc10010 = !this.abc10010;
            }
            if (this.abc1004.size() < 9) {
                this.abc1004.add(4);
            }
            this.abc1005 = ((double) this.abc1005) < 0.66920674d ? 0.26383168f : 0.99238455f;
            ArrayList<Integer> arrayList5 = this.abc1007;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1007.remove(0);
            }
        } else {
            i = 0;
        }
        this.abc1005 = 0.9040977f;
        ArrayList<Integer> arrayList6 = this.abc1004;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc1004.remove(0);
        }
        ArrayList<Integer> arrayList7 = this.abc1002;
        if (arrayList7 == null && arrayList7.size() > 0) {
            this.abc1002.remove(0);
        }
        for (int i2 = 0; i2 < this.abc4; i2++) {
            if (this.abc1.size() > 0) {
                this.abc1.add(8);
                this.abc1005 *= 0.20038646f;
                if (this.abc1009.size() > 9) {
                    this.abc1009.add(7);
                }
                String[] strArr3 = this.abc10011;
                if (strArr3 != null) {
                    strArr3[8] = null;
                }
            }
            this.abc1005 -= 0.9542135f;
            ArrayList<Integer> arrayList8 = this.abc1007;
            if (arrayList8 == null && arrayList8.size() > 0) {
                this.abc1007.remove(0);
            }
            this.abc10010 = !this.abc10010;
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        this.abc10010 = !this.abc10010;
        ArrayList<Integer> arrayList9 = this.abc1002;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.abc1002.remove(0);
        }
        return i;
    }

    public String getVersion() {
        if (this.abc1003.size() < 8) {
            this.abc1003.add(9);
        }
        if (this.abc1007.size() < 1) {
            this.abc1007.add(4);
        }
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        if (this.abc1.size() < 7) {
            this.abc1.add(4);
            if (this.abc10011 == null) {
                this.abc10011 = new String[10];
            }
            String[] strArr = this.abc1008;
            if (strArr != null) {
                strArr[7] = "eat it";
            }
            ArrayList<Integer> arrayList = this.abc1004;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1004.remove(0);
            }
        }
        if (this.abc1006 != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.abc1006;
                if (i >= (iArr.length <= 3 ? iArr.length : 3)) {
                    break;
                }
                iArr[i] = 0;
                i++;
            }
        }
        if (this.abc1009.size() < 8) {
            this.abc1009.add(0);
        }
        String[] strArr2 = this.abc10011;
        if (strArr2 != null) {
            strArr2[4] = null;
        }
        try {
            return getApplicationContext().getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList = this.abc1004;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList2 = this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        ((BaseLogoApplication) getApplication()).destroyApp();
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList3 = this.abc1004;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList4 = this.abc1002;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr2 = this.abc1008;
        if (strArr2 != null) {
            strArr2[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList5 = this.abc1004;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList6 = this.abc1002;
            if (arrayList6 == null && arrayList6.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr3 = this.abc1008;
        if (strArr3 != null) {
            strArr3[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.abc10010 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc10010 = !false;
        if (this.abc2.size() > 8) {
            this.abc2.add("t=dime");
            if (this.abc1003.size() < 1) {
                this.abc1003.add(1);
            }
            ArrayList<Integer> arrayList = this.abc1004;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList2 = this.abc1002;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() > 9) {
            this.abc1002.add(8);
        }
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[2] = "t ";
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(5);
        }
        LogoLogUtils.m22166d("activity.getLocalClassName()", new Throwable(), "activity.getLocalClassName()=" + getLocalClassName());
        this.abc1005 = this.abc1005 + 0.9822281f;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc1001 != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.abc1001;
                if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i] = "string" + i;
                i++;
            }
        }
        ArrayList<String> arrayList3 = this.abc2;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc2.remove(0);
            if (this.abc1003.size() < 5) {
                this.abc1003.add(8);
            }
            if (this.abc1007.size() < 7) {
                this.abc1007.add(6);
            }
            if (this.abc1009 == null) {
                this.abc1009 = new ArrayList<>();
            }
        }
        if (this.abc1009.size() < 2) {
            this.abc1009.add(8);
        }
        this.abc10010 = true;
        ArrayList<Integer> arrayList4 = this.abc1009;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc1009.remove(0);
        }
        translucentStatusBar(this, true);
        ArrayList<Integer> arrayList5 = this.abc1003;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc10010 = !this.abc10010;
        ArrayList<Integer> arrayList6 = this.abc1007;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc1007.remove(0);
        }
        this.abc3 = "oid—T";
        String[] strArr3 = this.abc1008;
        if (strArr3 != null) {
            strArr3[5] = " du";
        }
        ArrayList<Integer> arrayList7 = this.abc1009;
        if (arrayList7 == null && arrayList7.size() > 0) {
            this.abc1009.remove(0);
        }
        if (this.abc1003.size() > 5) {
            this.abc1003.add(3);
        }
        this.logoMainVM = (LogoMainVM) new ViewModelProvider(this).get(LogoMainVM.class);
        ArrayList<Integer> arrayList8 = this.abc1004;
        if (arrayList8 == null && arrayList8.size() > 0) {
            this.abc1004.remove(0);
        }
        int[] iArr = this.abc1006;
        if (iArr != null) {
            iArr[1] = 3;
        }
        this.abc10010 = true;
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (this.abc1007.size() < 8) {
                this.abc1007.add(5);
            }
            if (this.abc10011 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr4 = this.abc10011;
                    if (i2 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i2] = "string" + i2;
                    i2++;
                }
            }
            this.abc10010 = !this.abc10010;
        }
        this.abc10010 = true;
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        ArrayList<Integer> arrayList9 = this.abc1009;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.abc1009.remove(0);
        }
        this.binding = (ActivityMainBinding) DataBindingUtil.setContentView(this, R.layout.activity_main);
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        this.abc10010 = !this.abc10010;
        if (this.abc1004.size() < 7) {
            this.abc1004.add(7);
        }
        if (this.abc2 == null) {
            this.abc2 = new ArrayList<>();
            if (this.abc1009 == null) {
                this.abc1009 = new ArrayList<>();
            }
            if (this.abc1009.size() < 2) {
                this.abc1009.add(7);
            }
            this.abc10010 = false;
        }
        if (this.abc1007.size() > 5) {
            this.abc1007.add(8);
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (this.abc1005 < 0.28798157d) {
            this.abc1005 = 0.6933856f;
        }
        this.binding.setLifecycleOwner(this);
        if (this.abc1009.size() < 7) {
            this.abc1009.add(2);
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        String[] strArr5 = this.abc10011;
        if (strArr5 != null) {
            strArr5[3] = null;
        }
        if (!TextUtils.isEmpty(this.abc3)) {
            int length = this.abc3.length();
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            String[] strArr6 = this.abc1008;
            if (strArr6 != null) {
                strArr6[4] = null;
            }
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            this.abc3 += length;
            int[] iArr2 = this.abc1006;
            if (iArr2 != null) {
                iArr2[3] = 6;
            }
            if (this.abc1009.size() < 9) {
                this.abc1009.add(4);
            }
            String[] strArr7 = this.abc1001;
            if (strArr7 != null) {
                strArr7[3] = null;
            }
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        ArrayList<String> arrayList10 = this.abc1000;
        if (arrayList10 != null && arrayList10.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc1004.size() < 3) {
            this.abc1004.add(2);
        }
        this.binding.setLogoMainVM(this.logoMainVM);
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList11 = this.abc1009;
        if (arrayList11 == null && arrayList11.size() > 0) {
            this.abc1009.remove(0);
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            String[] strArr8 = this.abc10011;
            if (strArr8 != null) {
                strArr8[2] = null;
            }
            this.abc1005 = ((double) this.abc1005) < 0.4189031d ? 0.5112971f : 0.313865f;
            if (this.abc1000.size() > 4) {
                this.abc1000.add("ation, bas");
            }
        }
        int[] iArr3 = this.abc1006;
        if (iArr3 != null) {
            iArr3[8] = 0;
        }
        if (iArr3 != null) {
            iArr3[4] = 6;
        }
        ArrayList<Integer> arrayList12 = this.abc1009;
        if (arrayList12 == null && arrayList12.size() > 0) {
            this.abc1009.remove(0);
        }
        setSupportActionBar(this.binding.toolbar);
        ArrayList<Integer> arrayList13 = this.abc1007;
        if (arrayList13 == null && arrayList13.size() > 0) {
            this.abc1007.remove(0);
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        this.abc10010 = !this.abc10010;
        if (this.abc2 == null) {
            this.abc2 = new ArrayList<>();
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            this.abc10010 = false;
            ArrayList<Integer> arrayList14 = this.abc1007;
            if (arrayList14 == null && arrayList14.size() > 0) {
                this.abc1007.remove(0);
            }
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        String[] strArr9 = this.abc1001;
        if (strArr9 != null) {
            strArr9[6] = " so many ";
        }
        this.abc10010 = false;
        init();
        if (this.abc1007.size() < 6) {
            this.abc1007.add(5);
        }
        int[] iArr4 = this.abc1006;
        if (iArr4 != null) {
            iArr4[4] = 0;
        }
        ArrayList<String> arrayList15 = this.abc1000;
        if (arrayList15 != null && arrayList15.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc5 = 0.9990181f;
        if (this.abc1000.size() > 8) {
            this.abc1000.add("ou think. ");
        }
        if (this.abc1003.size() < 6) {
            this.abc1003.add(9);
        }
        if (this.abc1009.size() < 9) {
            this.abc1009.add(1);
        }
        startFB();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ArrayList<Integer> arrayList = this.abc1003;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        ArrayList<Integer> arrayList2 = this.abc1007;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1007.remove(0);
        }
        if (this.abc1003.size() > 5) {
            this.abc1003.add(8);
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            if (this.abc1002.size() < 3) {
                this.abc1002.add(0);
            }
            ArrayList<Integer> arrayList3 = this.abc1007;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1007.remove(0);
            }
            ArrayList<Integer> arrayList4 = this.abc1003;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc1003.remove(0);
            }
        }
        ArrayList<String> arrayList5 = this.abc1000;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc1005 *= 0.52839833f;
        if (this.abc1009.size() < 2) {
            this.abc1009.add(1);
        }
        LogoLogUtils.m22166d(TAG, new Throwable(), "onRestoreInstanceState3333");
        if (this.abc1008 == null) {
            this.abc1008 = new String[10];
        }
        String[] strArr = this.abc1001;
        if (strArr != null) {
            strArr[7] = null;
        }
        this.abc1005 = 0.36504048f;
        ArrayList<String> arrayList6 = this.abc0;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc0.remove(0);
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            if (this.abc1004.size() < 9) {
                this.abc1004.add(0);
            }
            if (this.abc1006 == null) {
                this.abc1006 = new int[10];
            }
        }
        this.abc10010 = !this.abc10010;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList7 = this.abc1002;
        if (arrayList7 != null || arrayList7.size() <= 0) {
            return;
        }
        this.abc1002.remove(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.abc1005 = ((double) this.abc1005) < 0.32948786d ? 0.7975227f : 0.3311907f;
        if (this.abc1002.size() < 2) {
            this.abc1002.add(5);
        }
        if (this.abc1000.size() < 2) {
            this.abc1000.add(" e");
        }
        this.abc3 = DownloadCommon.DOWNLOAD_REPORT_HOST;
        if (this.abc1004.size() < 2) {
            this.abc1004.add(8);
        }
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        String[] strArr = this.abc10011;
        if (strArr != null) {
            strArr[0] = "har";
        }
        LogoLogUtils.m22166d(TAG, new Throwable(), "onResume");
        ArrayList<String> arrayList = this.abc1000;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        ArrayList<String> arrayList2 = this.abc1000;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1000.remove(0);
        }
        ArrayList<Integer> arrayList3 = this.abc1;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc1.remove(0);
            this.abc1005 = 0.47669387f;
            if (this.abc10011 == null) {
                this.abc10011 = new String[10];
            }
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        String[] strArr2 = this.abc1008;
        if (strArr2 != null) {
            strArr2[0] = "the ne";
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        int statusBarHeight = getStatusBarHeight();
        ArrayList<String> arrayList4 = this.abc1000;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1000.remove(0);
        }
        ArrayList<Integer> arrayList5 = this.abc1002;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc1002.remove(0);
        }
        int[] iArr = this.abc1006;
        if (iArr != null) {
            iArr[6] = 3;
        }
        if (this.abc2.size() > 1) {
            this.abc2.add("日记】第641天张利");
            String[] strArr3 = this.abc10011;
            if (strArr3 != null) {
                strArr3[3] = "a";
            }
            if (this.abc1004.size() < 7) {
                this.abc1004.add(9);
            }
            this.abc10010 = !this.abc10010;
        }
        String[] strArr4 = this.abc10011;
        if (strArr4 != null) {
            strArr4[0] = " for b";
        }
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList6 = this.abc1007;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc1007.remove(0);
        }
        if (this.f15768b) {
            if (LogoConstants.f25535a == 0) {
                LogoConstants.f25535a = statusBarHeight;
                this.abc10010 = !this.abc10010;
                int[] iArr2 = this.abc1006;
                if (iArr2 != null) {
                    iArr2[3] = 0;
                }
                if (this.abc1008 == null) {
                    this.abc1008 = new String[10];
                }
                this.abc4 = this.abc4 > 1 ? 1 : 4;
                if (this.abc1002 == null) {
                    this.abc1002 = new ArrayList<>();
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                if (this.abc1007.size() < 1) {
                    this.abc1007.add(9);
                }
            }
            this.abc10010 = !this.abc10010;
            String[] strArr5 = this.abc1001;
            if (strArr5 != null) {
                strArr5[2] = "eceived";
            }
            String[] strArr6 = this.abc1008;
            if (strArr6 != null) {
                strArr6[0] = "d characte";
            }
            if (this.abc0.size() < 3) {
                this.abc0.add("是否有");
                if (this.abc1004.size() > 3) {
                    this.abc1004.add(4);
                }
                this.abc10010 = true;
                if (this.abc1007.size() > 3) {
                    this.abc1007.add(3);
                }
            }
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            this.abc10010 = !this.abc10010;
            ArrayList<Integer> arrayList7 = this.abc1002;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.abc1002.remove(0);
            }
            statusBarHeight = LogoConstants.f25535a;
            ArrayList<String> arrayList8 = this.abc1000;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.abc1000.remove(0);
            }
            if (this.abc10011 == null) {
                this.abc10011 = new String[10];
            }
            int[] iArr3 = this.abc1006;
            if (iArr3 != null) {
                iArr3[4] = 0;
            }
            if (!TextUtils.isEmpty(this.abc3)) {
                int length = this.abc3.length();
                if (this.abc10011 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr7 = this.abc10011;
                        if (i >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i] = "string" + i;
                        i++;
                    }
                }
                if (this.abc1006 == null) {
                    this.abc1006 = new int[10];
                }
                if (this.abc10011 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr8 = this.abc10011;
                        if (i2 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i2] = "string" + i2;
                        i2++;
                    }
                }
                this.abc3 += length;
                if (this.abc1009.size() > 3) {
                    this.abc1009.add(7);
                }
                if (this.abc1002.size() > 5) {
                    this.abc1002.add(5);
                }
                ArrayList<Integer> arrayList9 = this.abc1004;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    this.abc1004.remove(0);
                }
            }
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
            this.abc10010 = !this.abc10010;
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
        }
        if (this.abc1001 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr9 = this.abc1001;
                if (i3 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                    break;
                }
                strArr9[i3] = "string" + i3;
                i3++;
            }
        }
        if (this.abc1009.size() < 3) {
            this.abc1009.add(6);
        }
        ArrayList<Integer> arrayList10 = this.abc1003;
        if (arrayList10 == null && arrayList10.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            int[] iArr4 = this.abc1006;
            if (iArr4 != null) {
                iArr4[0] = 0;
            }
            ArrayList<String> arrayList11 = this.abc1000;
            if (arrayList11 != null && arrayList11.size() > 0) {
                this.abc1000.remove(0);
            }
            ArrayList<Integer> arrayList12 = this.abc1004;
            if (arrayList12 == null && arrayList12.size() > 0) {
                this.abc1004.remove(0);
            }
        }
        this.abc10010 = true;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        this.abc10010 = true;
        ViewGroup.LayoutParams layoutParams = this.binding.statusView.getLayoutParams();
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        if (this.abc10011 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr10 = this.abc10011;
                if (i4 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                    break;
                }
                strArr10[i4] = "string" + i4;
                i4++;
            }
        }
        ArrayList<String> arrayList13 = this.abc1000;
        if (arrayList13 != null && arrayList13.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc1.size() > 6) {
            this.abc1.add(6);
            if (this.abc1000.size() > 0) {
                this.abc1000.add(" ");
            }
            ArrayList<Integer> arrayList14 = this.abc1002;
            if (arrayList14 == null && arrayList14.size() > 0) {
                this.abc1002.remove(0);
            }
            ArrayList<Integer> arrayList15 = this.abc1003;
            if (arrayList15 == null && arrayList15.size() > 0) {
                this.abc1003.remove(0);
            }
        }
        String[] strArr11 = this.abc10011;
        if (strArr11 != null) {
            strArr11[1] = null;
        }
        this.abc1005 = 0.017260015f;
        ArrayList<Integer> arrayList16 = this.abc1007;
        if (arrayList16 == null && arrayList16.size() > 0) {
            this.abc1007.remove(0);
        }
        layoutParams.height = statusBarHeight;
        if (this.abc1004.size() < 7) {
            this.abc1004.add(9);
        }
        this.abc1005 = 0.16651034f;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        this.abc4 = this.abc4 < 9 ? 4 : 9;
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        if (this.abc1004.size() > 3) {
            this.abc1004.add(0);
        }
        int[] iArr5 = this.abc1006;
        if (iArr5 != null) {
            iArr5[3] = 3;
        }
        this.binding.statusView.setLayoutParams(layoutParams);
        this.abc10010 = true;
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        if (this.abc1009.size() < 4) {
            this.abc1009.add(3);
        }
        ArrayList<Integer> arrayList17 = this.abc1;
        if (arrayList17 == null && arrayList17.size() > 0) {
            this.abc1.remove(0);
            if (this.abc1004.size() > 4) {
                this.abc1004.add(2);
            }
            String[] strArr12 = this.abc1001;
            if (strArr12 != null) {
                strArr12[5] = null;
            }
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
        }
        ArrayList<String> arrayList18 = this.abc1000;
        if (arrayList18 != null && arrayList18.size() > 0) {
            this.abc1000.remove(0);
        }
        int[] iArr6 = this.abc1006;
        if (iArr6 != null) {
            iArr6[7] = 0;
        }
        if (this.abc1008 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr13 = this.abc1008;
                if (i5 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                    break;
                }
                strArr13[i5] = "string" + i5;
                i5++;
            }
        }
        if (TextUtils.isEmpty(LogoConstants.f25536b)) {
            LogoConstants.f25536b = getVersion();
            String[] strArr14 = this.abc10011;
            if (strArr14 != null) {
                strArr14[0] = null;
            }
            this.abc10010 = !(!this.abc10010);
            if (this.abc1 == null) {
                this.abc1 = new ArrayList<>();
                this.abc10010 = true;
                ArrayList<String> arrayList19 = this.abc1000;
                if (arrayList19 != null && arrayList19.size() > 0) {
                    this.abc1000.remove(0);
                }
                ArrayList<Integer> arrayList20 = this.abc1009;
                if (arrayList20 == null && arrayList20.size() > 0) {
                    this.abc1009.remove(0);
                }
            }
            if (this.abc1004.size() < 3) {
                this.abc1004.add(6);
            }
            String[] strArr15 = this.abc10011;
            if (strArr15 != null) {
                strArr15[9] = null;
            }
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
        }
        int[] iArr7 = this.abc1006;
        if (iArr7 != null) {
            iArr7[5] = 0;
        }
        if (iArr7 != null) {
            int i6 = 0;
            while (true) {
                int[] iArr8 = this.abc1006;
                if (i6 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                    break;
                }
                iArr8[i6] = 5;
                i6++;
            }
        }
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        for (int i7 = 0; i7 < this.abc4; i7++) {
            if (this.abc2 == null) {
                this.abc2 = new ArrayList<>();
                this.abc10010 = !this.abc10010;
                if (this.abc1007 == null) {
                    this.abc1007 = new ArrayList<>();
                }
                if (this.abc1004.size() > 0) {
                    this.abc1004.add(6);
                }
            }
            String[] strArr16 = this.abc10011;
            if (strArr16 != null) {
                strArr16[6] = null;
            }
            ArrayList<Integer> arrayList21 = this.abc1009;
            if (arrayList21 == null && arrayList21.size() > 0) {
                this.abc1009.remove(0);
            }
            this.abc10010 = !this.abc10010;
        }
        ArrayList<String> arrayList22 = this.abc1000;
        if (arrayList22 != null && arrayList22.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc1005 -= 0.70084876f;
        if (this.abc1003.size() > 0) {
            this.abc1003.add(6);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle, @NonNull PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        if (this.abc1002.size() < 8) {
            this.abc1002.add(1);
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        int i = 0;
        if (this.abc1008 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.abc1008;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        if (!TextUtils.isEmpty(this.abc3)) {
            int length = this.abc3.length();
            ArrayList<Integer> arrayList = this.abc1002;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1002.remove(0);
            }
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
            String[] strArr2 = this.abc1001;
            if (strArr2 != null) {
                strArr2[8] = "rn nov";
            }
            this.abc3 += length;
            ArrayList<Integer> arrayList2 = this.abc1004;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1004.remove(0);
            }
            this.abc1005 = 0.4735794f;
            String[] strArr3 = this.abc1008;
            if (strArr3 != null) {
                strArr3[1] = null;
            }
        }
        ArrayList<Integer> arrayList3 = this.abc1002;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc1002.remove(0);
        }
        this.abc10010 = !this.abc10010;
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        LogoLogUtils.m22166d(TAG, new Throwable(), "onSaveInstanceState");
        ArrayList<Integer> arrayList4 = this.abc1009;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc1009.remove(0);
        }
        this.abc10010 = false;
        String[] strArr4 = this.abc1001;
        if (strArr4 != null) {
            strArr4[7] = null;
        }
        ArrayList<String> arrayList5 = this.abc2;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc2.remove(0);
            this.abc1005 = ((double) this.abc1005) < 0.2951727d ? 0.6190505f : 0.1665299f;
            if (this.abc1008 == null) {
                this.abc1008 = new String[10];
            }
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
        }
        if (this.abc1001 != null) {
            while (true) {
                String[] strArr5 = this.abc1001;
                if (i >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i] = "string" + i;
                i++;
            }
        }
        if (this.abc1002.size() < 0) {
            this.abc1002.add(1);
        }
        if (this.abc1002.size() < 2) {
            this.abc1002.add(3);
        }
    }
}
