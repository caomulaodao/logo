package com.logomaster.logomaker;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.logomaster.logomaker.LogoInputDialog;
import com.logomaster.logomaker.adapter.LogoRvBgColorAdapter;
import com.logomaster.logomaker.adapter.LogoRvBgImgAdapter;
import com.logomaster.logomaker.adapter.LogoRvClippingAdapter;
import com.logomaster.logomaker.adapter.LogoRvFillingAdapter;
import com.logomaster.logomaker.adapter.LogoRvFontAdapter;
import com.logomaster.logomaker.adapter.LogoRvLayerAdapter;
import com.logomaster.logomaker.base.LogoBaseActivity;
import com.logomaster.logomaker.databinding.ActivityCreateBinding;
import com.logomaster.logomaker.p131vm.LogoCreateVM;
import com.logomaster.logomaker.utils.LogoLayerRvItemTouchHelper;
import com.logomaster.logomaker.utils.LogoLayerRvItemTouchHelperCallback;
import com.logomaster.logomaker.view.LogoColorSaturationView;
import com.logomaster.logomaker.view.LogoDrawView;
import com.logomaster.logomaker.view.LogoRainbowView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.p162db.CampaignClickDao;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class LogoCreateActivity extends LogoBaseActivity {
    private static final String TAG = "LogoCreateActivity";
    private ActivityResultLauncher<Intent> activityResultLauncher;
    private ActivityResultLauncher<Intent> activityResultLauncherImage;
    public ActivityCreateBinding binding;
    private int centerLeft;
    private int centerTop;
    public LogoCreateVM createVM;
    private int finderColor;
    private int finderType;
    private Handler handler;
    private InputMethodManager imm;
    private Integer lastBgColor;
    private Integer lastBgColorTemp;
    private Bitmap lastBgImage;
    private Bitmap lastBgImageTemp;
    private Rect lastBgSrcRect;
    private Integer lastClippingType;
    private Integer lastColor;
    private boolean lastTextBold;
    private boolean lastTextSkew;
    private boolean lastTextUnderline;
    private LogoConfirmExitDialog logoConfirmExitDialog;
    private LogoInputDialog logoInputDialog;
    private LogoLayerRvItemTouchHelper logoLayerRvItemTouchHelper;
    private LogoLayerRvItemTouchHelperCallback logoLayerRvItemTouchHelperCallback;
    private LogoLoadingDialog logoLoadingDialog;
    private LogoRvBgColorAdapter logoRvBgColorAdapter;
    private LogoRvBgImgAdapter logoRvBgImgAdapter;
    private LogoRvClippingAdapter logoRvClippingAdapter;
    private LogoRvFillingAdapter logoRvFillingAdapter;
    private LogoRvFontAdapter logoRvFontAdapter;
    private LogoRvLayerAdapter logoRvLayerAdapter;
    private LogoRvFillingAdapter logoRvTextColorAdapter;
    private Map<String, Typeface> mapFont;
    private int rainbowType;
    private int type;
    public ArrayList<Integer> abc1000 = new ArrayList<>();
    public String[] abc0 = new String[12];
    public String[] abc1001 = new String[16];
    public int[] abc1002 = new int[13];
    public int[] abc1 = new int[19];
    public ArrayList<String> abc1003 = new ArrayList<>();
    public boolean abc1004 = true;
    public ArrayList<Integer> abc2 = new ArrayList<>();
    public int abc1005 = 9;
    public float abc1007 = 0.90453213f;
    public float abc4 = 0.094617546f;
    public int abc1008 = 3;
    public ArrayList<Integer> abc10010 = new ArrayList<>();
    public int[] abc6 = new int[12];
    public ArrayList<Integer> abc10011 = new ArrayList<>();
    public String abc10012 = "until";
    public float abc7 = 0.4031284f;
    public float abc10013 = 0.70877355f;
    public ArrayList<Integer> abc10014 = new ArrayList<>();
    public ArrayList<String> abc8 = new ArrayList<>();
    public String[] abc10015 = new String[12];
    public String[] abc10016 = new String[15];
    public ArrayList<String> abc9 = new ArrayList<>();
    public int[] abc10017 = new int[13];
    public ArrayList<String> abc10018 = new ArrayList<>();
    public boolean abc10 = true;
    public int abc10019 = 7;
    public float abc10020 = 0.12470609f;
    public ArrayList<String> abc11 = new ArrayList<>();
    public String[] abc10021 = new String[15];
    public String[] abc10022 = new String[10];
    public float abc12 = 0.41809583f;
    public String[] abc10023 = new String[12];
    public ArrayList<String> abc10024 = new ArrayList<>();
    public int[] abc13 = new int[15];
    public float abc10025 = 0.53305644f;
    private boolean stopMove = true;
    public float abc10026 = 0.881098f;
    public double abc14 = 0.6472422220882285d;
    public float abc10027 = 0.43650103f;
    public int abc10028 = 3;
    public int[] abc15 = new int[13];
    public boolean abc10029 = true;
    public ArrayList<Integer> abc10030 = new ArrayList<>();
    public int[] abc16 = new int[13];
    public String[] abc10031 = new String[12];
    public boolean abc10032 = false;
    public double abc17 = 0.8507546392217019d;
    public boolean abc10033 = false;
    public ArrayList<Integer> abc10034 = new ArrayList<>();
    public double abc18 = 0.1618123821384443d;
    public boolean abc10035 = true;
    public ArrayList<String> abc10036 = new ArrayList<>();
    public String[] abc19 = new String[18];
    public ArrayList<Integer> abc10037 = new ArrayList<>();
    public float abc10038 = 0.36327714f;
    public int[] abc20 = new int[19];
    public ArrayList<String> abc10039 = new ArrayList<>();
    public boolean abc10040 = false;
    public ArrayList<String> abc21 = new ArrayList<>();
    public int[] abc10041 = new int[15];
    public int[] abc10042 = new int[14];
    public int[] abc22 = new int[15];
    public String[] abc10043 = new String[14];
    public int[] abc10045 = new int[15];
    public double abc24 = 0.7850212112249761d;
    public int abc10046 = 3;
    private final int REQUEST_CODE_PREMISSIONS = 1001;
    public int[] abc10047 = new int[15];
    public String[] abc25 = new String[10];
    public ArrayList<String> abc10048 = new ArrayList<>();
    private final int REQUEST_CODE_PREMISSIONS2 = 1002;
    public boolean abc10049 = false;
    public String abc26 = "sdfshrersfdf";
    public int[] abc10050 = new int[15];
    private final int moveUnitL = 5;
    public double abc10051 = 0.4762251194645716d;
    public double abc27 = 0.1235124719284646d;
    public int abc10052 = 4;
    public String abc10054 = "udents ";
    public String abc29 = "tViewfsdppp";
    public ArrayList<Integer> abc10055 = new ArrayList<>();
    public ArrayList<Integer> abc10056 = new ArrayList<>();
    public int abc30 = 7;
    public String[] abc10057 = new String[18];
    public double abc10058 = 0.9861344214551938d;
    public String[] abc31 = new String[19];
    public String abc10059 = ReportUtil.f18058a;
    public String[] abc10060 = new String[19];
    public int[] abc32 = new int[13];
    public int[] abc10061 = new int[18];
    public String abc10062 = " Pre";
    public String[] abc33 = new String[10];
    public float abc10063 = 0.8087724f;
    public String abc10064 = "d well on";
    public int[] abc34 = new int[13];
    public boolean abc10065 = false;
    public float abc10066 = 0.07983291f;
    public ArrayList<Integer> abc35 = new ArrayList<>();
    public ArrayList<String> abc10067 = new ArrayList<>();
    public double abc10068 = 0.47820327318414013d;
    public String[] abc36 = new String[10];
    public String abc10069 = "arned re";
    public ArrayList<String> abc10070 = new ArrayList<>();
    public ArrayList<String> abc37 = new ArrayList<>();
    public String[] abc10071 = new String[11];
    public boolean abc10072 = true;
    public double abc38 = 0.3058956601975362d;
    public String[] abc10073 = new String[12];
    public ArrayList<Integer> abc10074 = new ArrayList<>();
    public int abc39 = 6;
    public String[] abc10075 = new String[15];
    private boolean isCanSvae = false;
    public boolean abc10076 = true;
    private int lastCurrentPositon = -1;
    public String[] abc10077 = new String[17];
    public boolean isNext = true;
    public ArrayList<Integer> abc10078 = new ArrayList<>();

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$a */
    /* loaded from: classes3.dex */
    public class C9440a implements LogoRvLayerAdapter.InterfaceC9621d {
        public C9440a() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvLayerAdapter.InterfaceC9621d
        /* renamed from: a */
        public void mo9183a(int i) {
            LogoCreateActivity logoCreateActivity;
            LogoLogUtils.m22166d(LogoCreateActivity.TAG, new Throwable(), "position=" + i);
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                int length = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
            }
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10078;
            int i2 = 0;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10078.remove(0);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10056 == null) {
                logoCreateActivity2.abc10056 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc19 != null) {
                int i3 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity.abc19;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    strArr[i3] = "string" + i3;
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    logoCreateActivity3.abc10035 = true;
                    logoCreateActivity3.abc10066 = logoCreateActivity3.abc10066 - 0.023940265f;
                    if (!TextUtils.isEmpty(logoCreateActivity3.abc10069)) {
                        int length2 = LogoCreateActivity.this.abc10069.length();
                        LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length2;
                    }
                    i3++;
                }
                logoCreateActivity.abc10032 = !logoCreateActivity.abc10032;
                if (logoCreateActivity.abc10061 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10061;
                        if (i4 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i4] = 0;
                        i4++;
                    }
                }
                String[] strArr2 = LogoCreateActivity.this.abc10077;
                if (strArr2 != null) {
                    strArr2[3] = ". For a b";
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10066 = Math.abs(logoCreateActivity4.abc10066);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10032 = !logoCreateActivity5.abc10032;
            if (logoCreateActivity5.abc10010 == null) {
                logoCreateActivity5.abc10010 = new ArrayList<>();
            }
            LogoCreateActivity.this.binding.drawview.setActionIndex(i);
            if (LogoCreateActivity.this.abc10067.size() < 4) {
                LogoCreateActivity.this.abc10067.add("dec");
            }
            if (LogoCreateActivity.this.abc1002 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc1002;
                    if (i5 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i5] = 7;
                    i5++;
                }
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                int length3 = LogoCreateActivity.this.abc10069.length();
                LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length3;
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc20 == null) {
                logoCreateActivity6.abc20 = new int[10];
                logoCreateActivity6.abc10058 = logoCreateActivity6.abc10058 < 0.5134838336361658d ? 0.1424992885362122d : 0.31117909267921895d;
                if (logoCreateActivity6.abc10070 == null) {
                    logoCreateActivity6.abc10070 = new ArrayList<>();
                }
                LogoCreateActivity.this.abc10062 = "ook de";
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10035 = true;
            if (logoCreateActivity7.abc10056 == null) {
                logoCreateActivity7.abc10056 = new ArrayList<>();
            }
            while (true) {
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                int i6 = logoCreateActivity8.abc10046;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i2 >= i6) {
                    return;
                }
                logoCreateActivity8.abc10026 = -logoCreateActivity8.abc10026;
                i2++;
            }
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvLayerAdapter.InterfaceC9621d
        /* renamed from: b */
        public void mo9182b(int i, boolean z) {
            if (z) {
                LogoCreateActivity.this.createVM.hideImageLayout();
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10074;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10074.remove(0);
                }
                if (LogoCreateActivity.this.abc10056.size() > 8) {
                    LogoCreateActivity.this.abc10056.add(2);
                }
                ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10070;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10070.remove(0);
                }
                if (LogoCreateActivity.this.abc11.size() < 7) {
                    LogoCreateActivity.this.abc11.add("h=300d");
                    if (LogoCreateActivity.this.abc10042 != null) {
                        int i2 = 0;
                        while (true) {
                            int[] iArr = LogoCreateActivity.this.abc10042;
                            if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                                break;
                            }
                            iArr[i2] = 1;
                            i2++;
                        }
                    }
                    if (LogoCreateActivity.this.abc1002 != null) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr2 = LogoCreateActivity.this.abc1002;
                            if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                                break;
                            }
                            iArr2[i3] = 4;
                            i3++;
                        }
                    }
                    int i4 = 0;
                    while (true) {
                        LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                        int i5 = logoCreateActivity.abc10028;
                        if (i5 > 3) {
                            i5 = 3;
                        }
                        if (i4 >= i5) {
                            break;
                        }
                        int[] iArr3 = logoCreateActivity.abc10045;
                        if (iArr3 != null) {
                            iArr3[0] = 2;
                        }
                        i4++;
                    }
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc10022 == null) {
                    logoCreateActivity2.abc10022 = new String[10];
                }
                logoCreateActivity2.abc10028 = 6;
                if (logoCreateActivity2.abc10014.size() > 0) {
                    LogoCreateActivity.this.abc10014.add(2);
                }
                LogoCreateActivity.this.createVM.hideTextLayout();
                if (LogoCreateActivity.this.abc10036.size() < 8) {
                    LogoCreateActivity.this.abc10036.add("u think. F");
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10026 = ((double) logoCreateActivity3.abc10026) > 0.9848377d ? 0.49850005f : 0.6456709f;
                ArrayList<Integer> arrayList3 = logoCreateActivity3.abc10056;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10056.remove(0);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc4 = ((double) logoCreateActivity4.abc4) > 0.3786273d ? 0.47495311f : 0.8897145f;
                logoCreateActivity4.abc10038 = -logoCreateActivity4.abc10038;
                ArrayList<String> arrayList4 = logoCreateActivity4.abc10070;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10070.remove(0);
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                    int length = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10032 = !logoCreateActivity5.abc10032;
            logoCreateActivity5.abc10026 = 0.6227876f;
            logoCreateActivity5.abc10029 = true ^ logoCreateActivity5.abc10029;
            int[] iArr4 = logoCreateActivity5.abc32;
            if (iArr4 != null) {
                iArr4[6] = 3;
                logoCreateActivity5.abc10027 = 0.10428977f;
                String[] strArr = logoCreateActivity5.abc10071;
                if (strArr != null) {
                    strArr[9] = null;
                }
                ArrayList<String> arrayList5 = logoCreateActivity5.abc10018;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            int i6 = logoCreateActivity6.abc10052;
            logoCreateActivity6.abc10052 = 6;
            if (logoCreateActivity6.abc10024.size() > 9) {
                LogoCreateActivity.this.abc10024.add("choe");
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            int[] iArr5 = logoCreateActivity7.abc10047;
            if (iArr5 != null) {
                iArr5[9] = 9;
            }
            logoCreateActivity7.binding.drawview.m9110P(i, z);
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10023 == null) {
                logoCreateActivity8.abc10023 = new String[10];
            }
            logoCreateActivity8.abc10032 = false;
            logoCreateActivity8.abc1007 = -logoCreateActivity8.abc1007;
            ArrayList<Integer> arrayList6 = logoCreateActivity8.abc35;
            if (arrayList6 == null && arrayList6.size() > 0) {
                LogoCreateActivity.this.abc35.remove(0);
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                    int length2 = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length2;
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                int[] iArr6 = logoCreateActivity9.abc10047;
                if (iArr6 != null) {
                    iArr6[7] = 0;
                }
                String[] strArr2 = logoCreateActivity9.abc10023;
                if (strArr2 != null) {
                    strArr2[8] = " is), an";
                }
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                int length3 = LogoCreateActivity.this.abc10054.length();
                LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length3;
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc10051 = logoCreateActivity10.abc10051 > 0.393833119175656d ? 0.2787619852449239d : 0.37104827192916046d;
            logoCreateActivity10.abc1005 -= 3;
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvLayerAdapter.InterfaceC9621d
        /* renamed from: c */
        public void mo9181c(int i, boolean z) {
            LogoCreateActivity logoCreateActivity;
            if (z) {
                LogoCreateActivity.this.createVM.hideImageLayout();
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc10052 = 1;
                logoCreateActivity2.abc10068 += 0.47071772595365957d;
                if (logoCreateActivity2.abc10060 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10060;
                        if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i2] = "string" + i2;
                        i2++;
                    }
                }
                if (LogoCreateActivity.this.abc0 != null) {
                    int i3 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        String[] strArr2 = logoCreateActivity.abc0;
                        if (i3 >= strArr2.length) {
                            break;
                        }
                        strArr2[i3] = "string" + i3;
                        LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                        int[] iArr = logoCreateActivity3.abc10041;
                        if (iArr != null) {
                            iArr[4] = 0;
                        }
                        logoCreateActivity3.abc10038 = 0.19250387f;
                        if (logoCreateActivity3.abc10028 < 0) {
                            logoCreateActivity3.abc10028 = 9;
                        }
                        i3++;
                    }
                    logoCreateActivity.abc10033 = false;
                    if (logoCreateActivity.abc10013 < 0.79560703d) {
                        logoCreateActivity.abc10013 = 0.91098255f;
                    }
                    String[] strArr3 = logoCreateActivity.abc10073;
                    if (strArr3 != null) {
                        strArr3[3] = "ok writte";
                    }
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                int[] iArr2 = logoCreateActivity4.abc10061;
                if (iArr2 != null) {
                    iArr2[6] = 8;
                }
                ArrayList<Integer> arrayList = logoCreateActivity4.abc10011;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                int[] iArr3 = logoCreateActivity5.abc10047;
                if (iArr3 != null) {
                    iArr3[5] = 0;
                }
                logoCreateActivity5.createVM.hideTextLayout();
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                if (logoCreateActivity6.abc10027 < 0.25927794d) {
                    logoCreateActivity6.abc10027 = 0.72932774f;
                }
                logoCreateActivity6.abc1005 = 2;
                if (logoCreateActivity6.abc10074.size() < 8) {
                    LogoCreateActivity.this.abc10074.add(1);
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc17 = 0.49594308263884657d;
                logoCreateActivity7.abc10072 = !logoCreateActivity7.abc10072;
                ArrayList<Integer> arrayList2 = logoCreateActivity7.abc10074;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10074.remove(0);
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                if (logoCreateActivity8.abc10060 == null) {
                    logoCreateActivity8.abc10060 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc1005 *= 7;
            if (logoCreateActivity9.abc10018 == null) {
                logoCreateActivity9.abc10018 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            if (logoCreateActivity10.abc10077 == null) {
                logoCreateActivity10.abc10077 = new String[10];
            }
            logoCreateActivity10.abc27 = logoCreateActivity10.abc27 > 0.010871830632473989d ? 0.2764081321416517d : 0.8162773619038057d;
            logoCreateActivity10.abc10052 = 2;
            String[] strArr4 = logoCreateActivity10.abc10023;
            if (strArr4 != null) {
                strArr4[4] = null;
            }
            ArrayList<String> arrayList3 = logoCreateActivity10.abc10067;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10067.remove(0);
            }
            LogoCreateActivity.this.binding.drawview.m9109Q(i, z);
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            if (logoCreateActivity11.abc10024 == null) {
                logoCreateActivity11.abc10024 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc10062 = "ar ";
            String[] strArr5 = logoCreateActivity12.abc10060;
            if (strArr5 != null) {
                strArr5[3] = "what";
            }
            ArrayList<Integer> arrayList4 = logoCreateActivity12.abc2;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc2.remove(0);
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                if (logoCreateActivity13.abc10041 == null) {
                    logoCreateActivity13.abc10041 = new int[10];
                }
                if (logoCreateActivity13.abc10045 == null) {
                    logoCreateActivity13.abc10045 = new int[10];
                }
                logoCreateActivity13.abc10026 += 0.94189566f;
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            logoCreateActivity14.abc10051 = logoCreateActivity14.abc10051 < 0.2807686170549263d ? 0.5978522077215268d : 0.6692523665651375d;
            String[] strArr6 = logoCreateActivity14.abc10060;
            if (strArr6 != null) {
                strArr6[8] = null;
            }
            logoCreateActivity14.abc10052 = 1;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$a0 */
    /* loaded from: classes3.dex */
    public class C9441a0 implements LogoRvFontAdapter.InterfaceC9616b {
        public C9441a0() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvFontAdapter.InterfaceC9616b
        /* renamed from: a */
        public void mo9186a(int i, Typeface typeface) {
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.binding.drawview.setFontType(logoCreateActivity.createVM.getListFont().getValue().get(i));
            int i2 = 0;
            if (LogoCreateActivity.this.abc10045 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10045;
                    if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i3] = 4;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10049 = false;
            if (logoCreateActivity2.abc10023 != null) {
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10023;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc18 = 0.9947502602819425d;
            logoCreateActivity3.abc10013 = 0.8430098f;
            if (logoCreateActivity3.abc10036 == null) {
                logoCreateActivity3.abc10036 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10048.size() > 1) {
                LogoCreateActivity.this.abc10048.add(" sen");
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$a1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9442a1 implements View.OnClickListener {
        public View$OnClickListenerC9442a1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9122D(-5.0f, 0.0f);
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10010;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10055;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10055.remove(0);
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10055 == null) {
                logoCreateActivity.abc10055 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity2.abc36;
            if (strArr != null) {
                strArr[1] = "评论 0赞";
                ArrayList<Integer> arrayList3 = logoCreateActivity2.abc10010;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10010.remove(0);
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc1001 == null) {
                    logoCreateActivity3.abc1001 = new String[10];
                }
                String[] strArr2 = logoCreateActivity3.abc10016;
                if (strArr2 != null) {
                    strArr2[8] = null;
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10046 = logoCreateActivity4.abc10046 <= 6 ? 2 : 6;
            logoCreateActivity4.abc10072 = false;
            if (logoCreateActivity4.abc10074 == null) {
                logoCreateActivity4.abc10074 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$a2 */
    /* loaded from: classes3.dex */
    public class C9443a2 implements LogoDrawView.InterfaceC9665d {
        public C9443a2() {
        }

        @Override // com.logomaster.logomaker.view.LogoDrawView.InterfaceC9665d
        /* renamed from: a */
        public void mo9076a(int i) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.isCanSvae = logoCreateActivity5.binding.drawview.m9081x();
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc10021 == null) {
                logoCreateActivity6.abc10021 = new String[10];
            }
            logoCreateActivity6.abc10027 = 0.049727917f;
            String[] strArr = logoCreateActivity6.abc10022;
            if (strArr != null) {
                strArr[3] = null;
            }
            if (logoCreateActivity6.isCanSvae) {
                LogoCreateActivity.this.binding.tvSave.setBackgroundResource(R.drawable.shape_btn_save_radius);
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc10059 = "k wr";
                if (logoCreateActivity7.abc10013 < 0.06551951d) {
                    logoCreateActivity7.abc10013 = 0.79624397f;
                }
                logoCreateActivity7.abc10051 = 0.3176013317802999d;
                if (logoCreateActivity7.abc12 > 0.75757456d) {
                    logoCreateActivity7.abc12 = 0.52861345f;
                    if (!TextUtils.isEmpty(logoCreateActivity7.abc10064)) {
                        int length = LogoCreateActivity.this.abc10064.length();
                        LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
                    }
                    LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                    logoCreateActivity8.abc10063 = 0.9318674f;
                    if (!TextUtils.isEmpty(logoCreateActivity8.abc10054)) {
                        int length2 = LogoCreateActivity.this.abc10054.length();
                        LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length2;
                    }
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.abc10025 *= 0.46418583f;
                logoCreateActivity9.abc10038 *= 0.40077937f;
                if (logoCreateActivity9.abc10024 == null) {
                    logoCreateActivity9.abc10024 = new ArrayList<>();
                }
            } else {
                LogoCreateActivity.this.binding.tvSave.setBackgroundResource(R.drawable.shape_btn_save_radius2);
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10034;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10034.remove(0);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                String[] strArr2 = logoCreateActivity10.abc10043;
                if (strArr2 != null) {
                    strArr2[0] = "sis";
                }
                if (logoCreateActivity10.abc10030.size() < 8) {
                    LogoCreateActivity.this.abc10030.add(1);
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc12 -= 0.9567982f;
                int[] iArr = logoCreateActivity11.abc10017;
                if (iArr != null) {
                    iArr[0] = 0;
                }
                logoCreateActivity11.abc10032 = !logoCreateActivity11.abc10032;
                int[] iArr2 = logoCreateActivity11.abc10045;
                if (iArr2 != null) {
                    iArr2[5] = 0;
                }
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc1008 = -logoCreateActivity12.abc1008;
            logoCreateActivity12.abc10052 = 8;
            if (logoCreateActivity12.abc1000 == null) {
                logoCreateActivity12.abc1000 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity13.abc25;
            if (strArr3 != null) {
                strArr3[4] = "ormat=floa";
                int[] iArr3 = logoCreateActivity13.abc10050;
                if (iArr3 != null) {
                    iArr3[8] = 0;
                }
                logoCreateActivity13.abc10038 = 0.15605712f;
                logoCreateActivity13.abc10069 = " moderni";
            }
            if (logoCreateActivity13.abc10045 == null) {
                logoCreateActivity13.abc10045 = new int[10];
            }
            ArrayList<String> arrayList2 = logoCreateActivity13.abc10070;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10070.remove(0);
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            String[] strArr4 = logoCreateActivity14.abc10073;
            if (strArr4 != null) {
                strArr4[6] = "peopl";
            }
            if (logoCreateActivity14.binding.drawview.m9086s()) {
                LogoCreateActivity.this.binding.ivBack.setImageResource(R.mipmap.revoke);
                if (LogoCreateActivity.this.abc1002 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr4 = LogoCreateActivity.this.abc1002;
                        if (i2 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i2] = 2;
                        i2++;
                    }
                }
                ArrayList<String> arrayList3 = LogoCreateActivity.this.abc1003;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc1003.remove(0);
                }
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                if (logoCreateActivity15.abc10011 == null) {
                    logoCreateActivity15.abc10011 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                if (logoCreateActivity16.abc0 == null) {
                    logoCreateActivity16.abc0 = new String[10];
                    ArrayList<Integer> arrayList4 = logoCreateActivity16.abc1000;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        LogoCreateActivity.this.abc1000.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                    if (logoCreateActivity17.abc1007 < 0.30424148d) {
                        logoCreateActivity17.abc1007 = 0.10702789f;
                    }
                    if (logoCreateActivity17.abc10011.size() > 0) {
                        LogoCreateActivity.this.abc10011.add(2);
                    }
                }
                if (LogoCreateActivity.this.abc10039.size() > 9) {
                    LogoCreateActivity.this.abc10039.add("e’s n");
                }
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                logoCreateActivity18.abc10027 = ((double) logoCreateActivity18.abc10027) < 0.07947016d ? 0.18128794f : 0.7169819f;
                if (logoCreateActivity18.abc10018.size() < 3) {
                    LogoCreateActivity.this.abc10018.add(" Melvill");
                }
            } else {
                LogoCreateActivity.this.binding.ivBack.setImageResource(R.mipmap.not_unrevoke);
                ArrayList<String> arrayList5 = LogoCreateActivity.this.abc10024;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10024.remove(0);
                }
                LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                if (logoCreateActivity19.abc1001 == null) {
                    logoCreateActivity19.abc1001 = new String[10];
                }
                logoCreateActivity19.abc10068 -= 0.9466853850179945d;
                ArrayList<String> arrayList6 = logoCreateActivity19.abc9;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc9.remove(0);
                    int i3 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        int i4 = logoCreateActivity.abc1008;
                        if (i4 > 3) {
                            i4 = 3;
                        }
                        if (i3 >= i4) {
                            break;
                        }
                        if (logoCreateActivity.abc1000.size() < 5) {
                            LogoCreateActivity.this.abc1000.add(2);
                        }
                        i3++;
                    }
                    if (logoCreateActivity.abc10048.size() < 3) {
                        LogoCreateActivity.this.abc10048.add("h its plo");
                    }
                    LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                    if (logoCreateActivity20.abc10060 == null) {
                        logoCreateActivity20.abc10060 = new String[10];
                    }
                }
                LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                logoCreateActivity21.abc10027 *= 0.31214523f;
                logoCreateActivity21.abc10049 = true;
                logoCreateActivity21.abc1004 = !logoCreateActivity21.abc1004;
            }
            LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
            if (logoCreateActivity22.abc10046 > 0) {
                logoCreateActivity22.abc10046 = 7;
            }
            logoCreateActivity22.abc10068 = -logoCreateActivity22.abc10068;
            logoCreateActivity22.abc10063 = 0.1577527f;
            String[] strArr5 = logoCreateActivity22.abc25;
            if (strArr5 != null) {
                strArr5[4] = "但都有些美中不足。没";
                if (logoCreateActivity22.abc1000 == null) {
                    logoCreateActivity22.abc1000 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                int[] iArr5 = logoCreateActivity23.abc10061;
                if (iArr5 != null) {
                    iArr5[4] = 0;
                }
                if (logoCreateActivity23.abc1003 == null) {
                    logoCreateActivity23.abc1003 = new ArrayList<>();
                }
            }
            ArrayList<Integer> arrayList7 = LogoCreateActivity.this.abc10055;
            if (arrayList7 == null && arrayList7.size() > 0) {
                LogoCreateActivity.this.abc10055.remove(0);
            }
            LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
            logoCreateActivity24.abc1005 = Math.abs(logoCreateActivity24.abc1005);
            if (LogoCreateActivity.this.abc10022 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr6 = LogoCreateActivity.this.abc10022;
                    if (i5 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i5] = "string" + i5;
                    i5++;
                }
            }
            if (LogoCreateActivity.this.binding.drawview.m9085t()) {
                LogoCreateActivity.this.binding.ivNext.setImageResource(R.mipmap.redo);
                if (LogoCreateActivity.this.abc10021 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr7 = LogoCreateActivity.this.abc10021;
                        if (i6 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i6] = "string" + i6;
                        i6++;
                    }
                }
                LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                if (logoCreateActivity25.abc10057 == null) {
                    logoCreateActivity25.abc10057 = new String[10];
                }
                logoCreateActivity25.abc10065 = !logoCreateActivity25.abc10065;
                if (logoCreateActivity25.abc36 != null) {
                    int i7 = 0;
                    while (true) {
                        logoCreateActivity4 = LogoCreateActivity.this;
                        String[] strArr8 = logoCreateActivity4.abc36;
                        if (i7 >= strArr8.length) {
                            break;
                        }
                        strArr8[i7] = "string" + i7;
                        LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                        int[] iArr6 = logoCreateActivity26.abc1002;
                        if (iArr6 != null) {
                            iArr6[8] = 1;
                        }
                        logoCreateActivity26.abc10076 = !logoCreateActivity26.abc10076;
                        if (logoCreateActivity26.abc10038 < 0.22355282d) {
                            logoCreateActivity26.abc10038 = 0.61178225f;
                        }
                        i7++;
                    }
                    int[] iArr7 = logoCreateActivity4.abc10061;
                    if (iArr7 != null) {
                        iArr7[8] = 2;
                    }
                    if (logoCreateActivity4.abc1000 == null) {
                        logoCreateActivity4.abc1000 = new ArrayList<>();
                    }
                    LogoCreateActivity.this.abc10033 = false;
                }
                if (LogoCreateActivity.this.abc10074.size() < 4) {
                    LogoCreateActivity.this.abc10074.add(9);
                }
                LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                logoCreateActivity27.abc1008 = 8;
                ArrayList<Integer> arrayList8 = logoCreateActivity27.abc10037;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
            } else {
                LogoCreateActivity.this.binding.ivNext.setImageResource(R.mipmap.not_redo);
                if (LogoCreateActivity.this.abc10014.size() > 5) {
                    LogoCreateActivity.this.abc10014.add(0);
                }
                LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
                if (logoCreateActivity28.abc10024 == null) {
                    logoCreateActivity28.abc10024 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
                logoCreateActivity29.abc10066 -= 0.15831321f;
                if (logoCreateActivity29.abc0 == null) {
                    logoCreateActivity29.abc0 = new String[10];
                    int[] iArr8 = logoCreateActivity29.abc10050;
                    if (iArr8 != null) {
                        iArr8[3] = 3;
                    }
                    ArrayList<String> arrayList9 = logoCreateActivity29.abc10036;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        LogoCreateActivity.this.abc10036.remove(0);
                    }
                    LogoCreateActivity.this.abc10076 = !logoCreateActivity2.abc10076;
                }
                LogoCreateActivity logoCreateActivity30 = LogoCreateActivity.this;
                if (logoCreateActivity30.abc10030 == null) {
                    logoCreateActivity30.abc10030 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity31 = LogoCreateActivity.this;
                logoCreateActivity31.abc10065 = !logoCreateActivity31.abc10065;
                if (logoCreateActivity31.abc10060 == null) {
                    logoCreateActivity31.abc10060 = new String[10];
                }
            }
            int i8 = 0;
            while (true) {
                logoCreateActivity3 = LogoCreateActivity.this;
                int i9 = logoCreateActivity3.abc10052;
                if (i9 > 3) {
                    i9 = 3;
                }
                if (i8 >= i9) {
                    break;
                }
                logoCreateActivity3.abc10025 = ((double) logoCreateActivity3.abc10025) > 0.5607645d ? 0.4756347f : 0.16581416f;
                i8++;
            }
            int[] iArr9 = logoCreateActivity3.abc10061;
            if (iArr9 != null) {
                iArr9[6] = 0;
            }
            String[] strArr9 = logoCreateActivity3.abc10071;
            if (strArr9 != null) {
                strArr9[3] = null;
            }
            logoCreateActivity3.abc29 = "   ";
            if (logoCreateActivity3.abc10014.size() > 9) {
                LogoCreateActivity.this.abc10014.add(2);
            }
            LogoCreateActivity logoCreateActivity32 = LogoCreateActivity.this;
            String[] strArr10 = logoCreateActivity32.abc10060;
            if (strArr10 != null) {
                strArr10[1] = "n ma";
            }
            int[] iArr10 = logoCreateActivity32.abc10045;
            if (iArr10 != null) {
                iArr10[7] = 1;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$b */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC9444b implements View.OnTouchListener {
        public View$OnTouchListenerC9444b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                LogoLogUtils.m22166d(LogoCreateActivity.TAG, new Throwable(), "图层 按下");
                if (LogoCreateActivity.this.abc10030.size() > 6) {
                    LogoCreateActivity.this.abc10030.add(4);
                }
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                logoCreateActivity.abc10068 = 0.4124674750671139d;
                if (!TextUtils.isEmpty(logoCreateActivity.abc10059)) {
                    int length = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity2.abc32;
                if (iArr != null) {
                    iArr[1] = 0;
                    String[] strArr = logoCreateActivity2.abc10016;
                    if (strArr != null) {
                        strArr[7] = null;
                    }
                    logoCreateActivity2.abc10072 = !logoCreateActivity2.abc10072;
                    logoCreateActivity2.abc10052 = 0;
                }
                logoCreateActivity2.abc1005 = 6;
                if (logoCreateActivity2.abc10056 == null) {
                    logoCreateActivity2.abc10056 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10013 > 0.82611704d) {
                    logoCreateActivity3.abc10013 = 0.9724456f;
                }
            } else if (action == 1) {
                LogoLogUtils.m22166d(LogoCreateActivity.TAG, new Throwable(), "图层 抬起");
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10030;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10030.remove(0);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                String[] strArr2 = logoCreateActivity4.abc10071;
                if (strArr2 != null) {
                    strArr2[1] = null;
                }
                logoCreateActivity4.abc10035 = !logoCreateActivity4.abc10035;
                if (logoCreateActivity4.abc1 == null) {
                    logoCreateActivity4.abc1 = new int[10];
                    if (logoCreateActivity4.abc10057 != null) {
                        int i = 0;
                        while (true) {
                            String[] strArr3 = LogoCreateActivity.this.abc10057;
                            if (i >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                                break;
                            }
                            strArr3[i] = "string" + i;
                            i++;
                        }
                    }
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                        int length2 = LogoCreateActivity.this.abc10062.length();
                        LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
                    }
                    String[] strArr4 = LogoCreateActivity.this.abc10022;
                    if (strArr4 != null) {
                        strArr4[8] = null;
                    }
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                    int length3 = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length3;
                }
                ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10056;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10056.remove(0);
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                if (logoCreateActivity5.abc10041 == null) {
                    logoCreateActivity5.abc10041 = new int[10];
                }
                logoCreateActivity5.logoRvLayerAdapter.notifyDataSetChanged();
                if (LogoCreateActivity.this.abc10014.size() < 5) {
                    LogoCreateActivity.this.abc10014.add(0);
                }
                if (LogoCreateActivity.this.abc10067.size() > 5) {
                    LogoCreateActivity.this.abc10067.add("is, ");
                }
                ArrayList<String> arrayList3 = LogoCreateActivity.this.abc10024;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10024.remove(0);
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc12 = ((double) logoCreateActivity6.abc12) < 0.51922405d ? 0.6922932f : 0.8999527f;
                if (logoCreateActivity6.abc10074.size() < 8) {
                    LogoCreateActivity.this.abc10074.add(5);
                }
                if (LogoCreateActivity.this.abc10045 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = LogoCreateActivity.this.abc10045;
                        if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i2] = 9;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc1008 = -logoCreateActivity7.abc1008;
            } else if (action == 2) {
                LogoLogUtils.m22166d(LogoCreateActivity.TAG, new Throwable(), "图层 移动");
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                int[] iArr3 = logoCreateActivity8.abc10047;
                if (iArr3 != null) {
                    iArr3[8] = 8;
                }
                logoCreateActivity8.abc10035 = !logoCreateActivity8.abc10035;
                if (logoCreateActivity8.abc10019 > 0) {
                    logoCreateActivity8.abc10019 = 1;
                }
                logoCreateActivity8.abc38 -= 0.9942164918294761d;
                logoCreateActivity8.abc10026 *= 0.9815964f;
                if (!TextUtils.isEmpty(logoCreateActivity8.abc10059)) {
                    int length4 = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length4;
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                if (logoCreateActivity9.abc10011 == null) {
                    logoCreateActivity9.abc10011 = new ArrayList<>();
                }
            }
            if (LogoCreateActivity.this.abc1001 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr5 = LogoCreateActivity.this.abc1001;
                    if (i3 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            String[] strArr6 = logoCreateActivity10.abc10023;
            if (strArr6 != null) {
                strArr6[8] = "and chara";
            }
            logoCreateActivity10.abc10040 = true;
            if (logoCreateActivity10.abc27 < 0.6107057600432515d) {
                logoCreateActivity10.abc27 = 0.09188406447702302d;
                if (!TextUtils.isEmpty(logoCreateActivity10.abc10059)) {
                    int length5 = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length5;
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                if (logoCreateActivity11.abc10078 == null) {
                    logoCreateActivity11.abc10078 = new ArrayList<>();
                }
                LogoCreateActivity.this.abc10027 = 0.2907778f;
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc10058 *= 0.9233158663378137d;
            logoCreateActivity12.abc10064 = "nts are fo";
            logoCreateActivity12.abc10028 = 9;
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$b0 */
    /* loaded from: classes3.dex */
    public class C9445b0 implements LogoRvClippingAdapter.InterfaceC9606b {
        public C9445b0() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvClippingAdapter.InterfaceC9606b
        /* renamed from: a */
        public void mo9200a(int i, Integer num) {
            LogoCreateActivity.this.binding.drawview.setClippingType(Integer.valueOf(i));
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10018 == null) {
                logoCreateActivity.abc10018 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc1004 = !logoCreateActivity2.abc1004;
            logoCreateActivity2.abc10065 = !logoCreateActivity2.abc10065;
            logoCreateActivity2.abc7 += 0.28350687f;
            ArrayList<Integer> arrayList = logoCreateActivity2.abc1000;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc1000.remove(0);
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10052 *= 6;
            String[] strArr = logoCreateActivity3.abc10071;
            if (strArr != null) {
                strArr[6] = " ";
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$b1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9446b1 implements View.OnClickListener {
        public View$OnClickListenerC9446b1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9122D(5.0f, 0.0f);
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                int length = LogoCreateActivity.this.abc10054.length();
                LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10072 = true;
            if (logoCreateActivity.abc10026 < 0.6406105d) {
                logoCreateActivity.abc10026 = 0.26588774f;
            }
            logoCreateActivity.abc26 = "，是在Adobe P";
            logoCreateActivity.abc10049 = true ^ logoCreateActivity.abc10049;
            logoCreateActivity.abc10027 -= 0.43193835f;
            int i = 0;
            while (true) {
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                int i2 = logoCreateActivity2.abc10019;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    return;
                }
                logoCreateActivity2.abc10063 += 0.86090916f;
                i++;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$b2 */
    /* loaded from: classes3.dex */
    public class C9447b2 implements LogoDrawView.InterfaceC9667f {

        /* renamed from: com.logomaster.logomaker.LogoCreateActivity$b2$a */
        /* loaded from: classes3.dex */
        public class C9448a implements LogoInputDialog.InterfaceC9639f {
            public C9448a() {
            }

            @Override // com.logomaster.logomaker.LogoInputDialog.InterfaceC9639f
            /* renamed from: a */
            public void mo9156a(String str) {
                LogoCreateActivity.this.binding.drawview.setText(str);
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10011;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity.abc10017;
                if (iArr != null) {
                    iArr[4] = 0;
                }
                if (logoCreateActivity.abc10036.size() < 9) {
                    LogoCreateActivity.this.abc10036.add("defi");
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc21 == null) {
                    logoCreateActivity2.abc21 = new ArrayList<>();
                    ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10010;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoCreateActivity.this.abc10010.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    logoCreateActivity3.abc10033 = !logoCreateActivity3.abc10033;
                    ArrayList<Integer> arrayList3 = logoCreateActivity3.abc10014;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc10014.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc10061 == null) {
                    logoCreateActivity4.abc10061 = new int[10];
                }
                logoCreateActivity4.abc10027 = 0.8165186f;
                logoCreateActivity4.abc10065 = false;
            }
        }

        public C9447b2() {
        }

        @Override // com.logomaster.logomaker.view.LogoDrawView.InterfaceC9667f
        /* renamed from: a */
        public void mo9074a(boolean z) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            int i = 0;
            if (z) {
                if (LogoCreateActivity.this.logoInputDialog == null) {
                    LogoCreateActivity.this.logoInputDialog = new LogoInputDialog(LogoCreateActivity.this);
                    LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                    int[] iArr = logoCreateActivity5.abc10050;
                    if (iArr != null) {
                        iArr[7] = 0;
                    }
                    ArrayList<Integer> arrayList = logoCreateActivity5.abc10011;
                    if (arrayList == null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10011.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                    logoCreateActivity6.abc10027 = Math.abs(logoCreateActivity6.abc10027);
                    LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                    int[] iArr2 = logoCreateActivity7.abc16;
                    if (iArr2 != null) {
                        iArr2[7] = 0;
                        if (logoCreateActivity7.abc10039.size() > 9) {
                            LogoCreateActivity.this.abc10039.add("bably m");
                        }
                        LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                        String[] strArr = logoCreateActivity8.abc10023;
                        if (strArr != null) {
                            strArr[9] = "forced to ";
                        }
                        logoCreateActivity8.abc10076 = false;
                    }
                    int i2 = 0;
                    while (true) {
                        LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                        int i3 = logoCreateActivity9.abc10019;
                        if (i3 > 3) {
                            i3 = 3;
                        }
                        if (i2 >= i3) {
                            break;
                        }
                        int[] iArr3 = logoCreateActivity9.abc1002;
                        if (iArr3 != null) {
                            iArr3[9] = 0;
                        }
                        i2++;
                    }
                    int i4 = 0;
                    while (true) {
                        logoCreateActivity4 = LogoCreateActivity.this;
                        int i5 = logoCreateActivity4.abc10028;
                        if (i5 > 3) {
                            i5 = 3;
                        }
                        if (i4 >= i5) {
                            break;
                        }
                        ArrayList<Integer> arrayList2 = logoCreateActivity4.abc1000;
                        if (arrayList2 == null && arrayList2.size() > 0) {
                            LogoCreateActivity.this.abc1000.remove(0);
                        }
                        i4++;
                    }
                    ArrayList<Integer> arrayList3 = logoCreateActivity4.abc1000;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc1000.remove(0);
                    }
                }
                if (LogoCreateActivity.this.abc10045 != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr4 = LogoCreateActivity.this.abc10045;
                        if (i6 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i6] = 8;
                        i6++;
                    }
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                if (logoCreateActivity10.abc10023 == null) {
                    logoCreateActivity10.abc10023 = new String[10];
                }
                logoCreateActivity10.abc1007 = Math.abs(logoCreateActivity10.abc1007);
                if (LogoCreateActivity.this.abc32 != null) {
                    int i7 = 0;
                    while (true) {
                        logoCreateActivity3 = LogoCreateActivity.this;
                        int[] iArr5 = logoCreateActivity3.abc32;
                        if (i7 >= iArr5.length) {
                            break;
                        }
                        iArr5[i7] = 8;
                        if (logoCreateActivity3.abc10037 == null) {
                            logoCreateActivity3.abc10037 = new ArrayList<>();
                        }
                        LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                        logoCreateActivity11.abc10052 = 0;
                        logoCreateActivity11.abc10019 = 9;
                        i7++;
                    }
                    ArrayList<Integer> arrayList4 = logoCreateActivity3.abc10030;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        LogoCreateActivity.this.abc10030.remove(0);
                    }
                    if (LogoCreateActivity.this.abc10018.size() > 3) {
                        LogoCreateActivity.this.abc10018.add("ati");
                    }
                    LogoCreateActivity.this.abc10072 = false;
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10029 = !logoCreateActivity12.abc10029;
                logoCreateActivity12.abc10032 = false;
                String[] strArr2 = logoCreateActivity12.abc10022;
                if (strArr2 != null) {
                    strArr2[5] = "lica";
                }
                logoCreateActivity12.logoInputDialog.setOnSaveClickListener(new C9448a());
                ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10078;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10078.remove(0);
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                logoCreateActivity13.abc10019 *= 5;
                logoCreateActivity13.abc10012 = "n the earl";
                if (logoCreateActivity13.abc37 == null) {
                    logoCreateActivity13.abc37 = new ArrayList<>();
                    ArrayList<Integer> arrayList6 = LogoCreateActivity.this.abc10078;
                    if (arrayList6 == null && arrayList6.size() > 0) {
                        LogoCreateActivity.this.abc10078.remove(0);
                    }
                    if (LogoCreateActivity.this.abc10048.size() < 7) {
                        LogoCreateActivity.this.abc10048.add(" ");
                    }
                    int i8 = 0;
                    while (true) {
                        LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                        int i9 = logoCreateActivity14.abc1005;
                        if (i9 > 3) {
                            i9 = 3;
                        }
                        if (i8 >= i9) {
                            break;
                        }
                        String[] strArr3 = logoCreateActivity14.abc10075;
                        if (strArr3 != null) {
                            strArr3[6] = "e reall";
                        }
                        i8++;
                    }
                }
                if (LogoCreateActivity.this.abc10073 != null) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10073;
                        if (i10 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i10] = "string" + i10;
                        i10++;
                    }
                }
                ArrayList<String> arrayList7 = LogoCreateActivity.this.abc10067;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    LogoCreateActivity.this.abc10067.remove(0);
                }
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                logoCreateActivity15.abc10051 = 0.563326298526652d;
                logoCreateActivity15.logoInputDialog.m9157h(LogoCreateActivity.this.binding.drawview.getCurrentText());
                if (LogoCreateActivity.this.abc10057 != null) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr5 = LogoCreateActivity.this.abc10057;
                        if (i11 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                            break;
                        }
                        strArr5[i11] = "string" + i11;
                        i11++;
                    }
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                logoCreateActivity16.abc10019 = 7;
                ArrayList<String> arrayList8 = logoCreateActivity16.abc10070;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    LogoCreateActivity.this.abc10070.remove(0);
                }
                ArrayList<String> arrayList9 = LogoCreateActivity.this.abc37;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    LogoCreateActivity.this.abc37.remove(0);
                    LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                    logoCreateActivity17.abc10032 = !logoCreateActivity17.abc10032;
                    int[] iArr6 = logoCreateActivity17.abc10041;
                    if (iArr6 != null) {
                        iArr6[4] = 1;
                    }
                    if (logoCreateActivity17.abc10048 == null) {
                        logoCreateActivity17.abc10048 = new ArrayList<>();
                    }
                }
                if (LogoCreateActivity.this.abc10048.size() > 0) {
                    LogoCreateActivity.this.abc10048.add("ng");
                }
                if (LogoCreateActivity.this.abc10056.size() > 6) {
                    LogoCreateActivity.this.abc10056.add(4);
                }
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                logoCreateActivity18.abc10020 = 0.9158507f;
                logoCreateActivity18.logoInputDialog.show();
                LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                logoCreateActivity19.abc10063 = ((double) logoCreateActivity19.abc10063) < 0.2377739d ? 0.7386882f : 0.53917265f;
                if (logoCreateActivity19.abc10077 != null) {
                    int i12 = 0;
                    while (true) {
                        String[] strArr6 = LogoCreateActivity.this.abc10077;
                        if (i12 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                            break;
                        }
                        strArr6[i12] = "string" + i12;
                        i12++;
                    }
                }
                LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                logoCreateActivity20.abc10040 = true;
                if (logoCreateActivity20.abc0 != null) {
                    int i13 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        String[] strArr7 = logoCreateActivity.abc0;
                        if (i13 >= strArr7.length) {
                            break;
                        }
                        strArr7[i13] = "string" + i13;
                        if (LogoCreateActivity.this.abc10077 != null) {
                            int i14 = 0;
                            while (true) {
                                String[] strArr8 = LogoCreateActivity.this.abc10077;
                                if (i14 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                                    break;
                                }
                                strArr8[i14] = "string" + i14;
                                i14++;
                            }
                        }
                        ArrayList<Integer> arrayList10 = LogoCreateActivity.this.abc10055;
                        if (arrayList10 == null && arrayList10.size() > 0) {
                            LogoCreateActivity.this.abc10055.remove(0);
                        }
                        LogoCreateActivity.this.abc10033 = !logoCreateActivity2.abc10033;
                        i13++;
                    }
                    String[] strArr9 = logoCreateActivity.abc10075;
                    if (strArr9 != null) {
                        strArr9[8] = "me";
                    }
                    ArrayList<String> arrayList11 = logoCreateActivity.abc10018;
                    if (arrayList11 != null && arrayList11.size() > 0) {
                        LogoCreateActivity.this.abc10018.remove(0);
                    }
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                        int length = LogoCreateActivity.this.abc10064.length();
                        LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
                    }
                }
                LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                if (logoCreateActivity21.abc10024 == null) {
                    logoCreateActivity21.abc10024 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                String[] strArr10 = logoCreateActivity22.abc10057;
                if (strArr10 != null) {
                    strArr10[7] = null;
                }
                String[] strArr11 = logoCreateActivity22.abc10015;
                if (strArr11 != null) {
                    strArr11[6] = null;
                }
            } else {
                if (LogoCreateActivity.this.logoInputDialog != null) {
                    LogoCreateActivity.this.logoInputDialog.dismiss();
                    LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                    logoCreateActivity23.abc10049 = false;
                    logoCreateActivity23.abc10052 = 4;
                    logoCreateActivity23.abc10065 = false;
                    logoCreateActivity23.abc10 = !logoCreateActivity23.abc10;
                    String[] strArr12 = logoCreateActivity23.abc10057;
                    if (strArr12 != null) {
                        strArr12[4] = null;
                    }
                    if (strArr12 != null) {
                        int i15 = 0;
                        while (true) {
                            String[] strArr13 = LogoCreateActivity.this.abc10057;
                            if (i15 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                                break;
                            }
                            strArr13[i15] = "string" + i15;
                            i15++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                    logoCreateActivity24.abc10051 = logoCreateActivity24.abc10051 < 0.4512593147583016d ? 0.2138542670919915d : 0.9652333748451506d;
                }
                LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                logoCreateActivity25.abc10052 = -logoCreateActivity25.abc10052;
                logoCreateActivity25.abc10069 = "l";
                logoCreateActivity25.abc10065 = !logoCreateActivity25.abc10065;
                int[] iArr7 = logoCreateActivity25.abc32;
                if (iArr7 != null) {
                    iArr7[6] = 0;
                    logoCreateActivity25.abc10032 = true;
                    if (logoCreateActivity25.abc10078 == null) {
                        logoCreateActivity25.abc10078 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                    logoCreateActivity26.abc10028 = -logoCreateActivity26.abc10028;
                }
                ArrayList<String> arrayList12 = LogoCreateActivity.this.abc10036;
                if (arrayList12 != null && arrayList12.size() > 0) {
                    LogoCreateActivity.this.abc10036.remove(0);
                }
                LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                logoCreateActivity27.abc1004 = false;
                if (logoCreateActivity27.abc10075 == null) {
                    logoCreateActivity27.abc10075 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
            logoCreateActivity28.abc10072 = true;
            if (logoCreateActivity28.abc10071 != null) {
                while (true) {
                    String[] strArr14 = LogoCreateActivity.this.abc10071;
                    if (i >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                        break;
                    }
                    strArr14[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
            logoCreateActivity29.abc1007 = ((double) logoCreateActivity29.abc1007) < 0.7999141d ? 0.22602892f : 0.8233453f;
            String[] strArr15 = logoCreateActivity29.abc19;
            if (strArr15 != null) {
                strArr15[3] = null;
                int[] iArr8 = logoCreateActivity29.abc1002;
                if (iArr8 != null) {
                    iArr8[4] = 9;
                }
                String[] strArr16 = logoCreateActivity29.abc10075;
                if (strArr16 != null) {
                    strArr16[7] = " to 'get";
                }
                if (logoCreateActivity29.abc10055 == null) {
                    logoCreateActivity29.abc10055 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity30 = LogoCreateActivity.this;
            int[] iArr9 = logoCreateActivity30.abc10061;
            if (iArr9 != null) {
                iArr9[1] = 2;
            }
            logoCreateActivity30.abc10068 = logoCreateActivity30.abc10068 > 0.07990788044934194d ? 0.5339981972811163d : 0.7599721256894842d;
            logoCreateActivity30.abc10032 = true;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9449c implements View.OnClickListener {
        public View$OnClickListenerC9449c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.createVM.hideLayerList();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10020 = 0.111469805f;
            int i = 0;
            if (logoCreateActivity.abc10023 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10023;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            if (LogoCreateActivity.this.abc10022 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10022;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    i3++;
                }
            }
            if (LogoCreateActivity.this.abc8.size() > 9) {
                LogoCreateActivity.this.abc8.add(" ");
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc10076 = !logoCreateActivity2.abc10076;
                if (!TextUtils.isEmpty(logoCreateActivity2.abc10012)) {
                    int length = LogoCreateActivity.this.abc10012.length();
                    LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc1008 = Math.abs(logoCreateActivity3.abc1008);
            }
            if (LogoCreateActivity.this.abc10018.size() < 5) {
                LogoCreateActivity.this.abc10018.add("r");
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10034 == null) {
                logoCreateActivity4.abc10034 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10010;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            LogoCreateActivity.this.activityResultLauncher.launch(new Intent(LogoCreateActivity.this, LogoShapeActivity.class));
            if (LogoCreateActivity.this.abc10048.size() < 2) {
                LogoCreateActivity.this.abc10048.add("del for ");
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc1008 = logoCreateActivity5.abc1008 > 7 ? 1 : 5;
            int[] iArr = logoCreateActivity5.abc10041;
            if (iArr != null) {
                iArr[5] = 0;
            }
            if (logoCreateActivity5.abc35.size() > 0) {
                LogoCreateActivity.this.abc35.add(2);
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc1005 *= 8;
                if (!TextUtils.isEmpty(logoCreateActivity6.abc10062)) {
                    int length2 = LogoCreateActivity.this.abc10062.length();
                    LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
                }
                if (LogoCreateActivity.this.abc10071 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr3 = LogoCreateActivity.this.abc10071;
                        if (i4 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                            break;
                        }
                        strArr3[i4] = "string" + i4;
                        i4++;
                    }
                }
            }
            if (LogoCreateActivity.this.abc10031 != null) {
                while (true) {
                    String[] strArr4 = LogoCreateActivity.this.abc10031;
                    if (i >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            String[] strArr5 = logoCreateActivity7.abc10077;
            if (strArr5 != null) {
                strArr5[1] = null;
            }
            logoCreateActivity7.abc1004 = true;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$c0 */
    /* loaded from: classes3.dex */
    public class C9450c0 implements Observer<List<Integer>> {
        public C9450c0() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<Integer> list) {
            LogoCreateActivity.this.logoRvClippingAdapter.setData(list);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10036 == null) {
                logoCreateActivity.abc10036 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10049 = !logoCreateActivity2.abc10049;
            String[] strArr = logoCreateActivity2.abc10031;
            if (strArr != null) {
                strArr[2] = null;
            }
            int[] iArr = logoCreateActivity2.abc13;
            if (iArr != null) {
                iArr[0] = 8;
                if (logoCreateActivity2.abc10066 > 0.99532074d) {
                    logoCreateActivity2.abc10066 = 0.80014634f;
                }
                logoCreateActivity2.abc10019 = logoCreateActivity2.abc10019 > 7 ? 3 : 7;
                String[] strArr2 = logoCreateActivity2.abc10060;
                if (strArr2 != null) {
                    strArr2[7] = null;
                }
            }
            if (logoCreateActivity2.abc10048.size() < 0) {
                LogoCreateActivity.this.abc10048.add("h");
            }
            if (LogoCreateActivity.this.abc10017 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc10017;
                    if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i] = 0;
                    i++;
                }
            }
            if (TextUtils.isEmpty(LogoCreateActivity.this.abc10059)) {
                return;
            }
            int length = LogoCreateActivity.this.abc10059.length();
            LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$c1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9451c1 implements View.OnClickListener {
        public View$OnClickListenerC9451c1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.onBackPressed();
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                int length = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                logoCreateActivity.abc10062 = LogoCreateActivity.this.abc10062 + length;
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10012 = "i";
            int[] iArr = logoCreateActivity2.abc10041;
            if (iArr != null) {
                iArr[4] = 6;
            }
            int[] iArr2 = logoCreateActivity2.abc13;
            if (iArr2 != null) {
                iArr2[5] = 0;
                logoCreateActivity2.abc10068 = logoCreateActivity2.abc10068 < 0.8564488729435353d ? 0.19881010371561214d : 0.6967764622597862d;
                String[] strArr = logoCreateActivity2.abc10015;
                if (strArr != null) {
                    strArr[0] = "eop";
                }
                logoCreateActivity2.abc10012 = "d every y";
            }
            if (logoCreateActivity2.abc10034.size() < 0) {
                LogoCreateActivity.this.abc10034.add(4);
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity3.abc10071;
            if (strArr2 != null) {
                strArr2[1] = null;
            }
            String[] strArr3 = logoCreateActivity3.abc10077;
            if (strArr3 != null) {
                strArr3[1] = "being,";
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$c2 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9452c2 implements View.OnClickListener {
        public View$OnClickListenerC9452c2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.lastTextBold = !logoCreateActivity.lastTextBold;
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10068 -= 0.8894419002386754d;
            logoCreateActivity2.abc10051 *= 0.4177485938886798d;
            logoCreateActivity2.abc10020 = 0.55352306f;
            if (logoCreateActivity2.abc36 == null) {
                logoCreateActivity2.abc36 = new String[10];
                if (logoCreateActivity2.abc10031 == null) {
                    logoCreateActivity2.abc10031 = new String[10];
                }
                logoCreateActivity2.abc10058 = logoCreateActivity2.abc10058 < 0.6158090962094113d ? 0.41728120291254633d : 0.2839354745529341d;
                String[] strArr = logoCreateActivity2.abc10023;
                if (strArr != null) {
                    strArr[8] = "ce";
                }
            }
            if (logoCreateActivity2.abc10015 == null) {
                logoCreateActivity2.abc10015 = new String[10];
            }
            if (logoCreateActivity2.abc1000 == null) {
                logoCreateActivity2.abc1000 = new ArrayList<>();
            }
            ArrayList<String> arrayList = LogoCreateActivity.this.abc10039;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10039.remove(0);
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.binding.drawview.setBold(logoCreateActivity3.lastTextBold);
            if (LogoCreateActivity.this.abc1000.size() < 7) {
                LogoCreateActivity.this.abc1000.add(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10022 == null) {
                logoCreateActivity4.abc10022 = new String[10];
            }
            String[] strArr2 = logoCreateActivity4.abc10057;
            if (strArr2 != null) {
                strArr2[8] = null;
            }
            if (logoCreateActivity4.abc35.size() > 3) {
                LogoCreateActivity.this.abc35.add(6);
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc1007 += 0.94227517f;
                logoCreateActivity5.abc10063 = 0.25631392f;
                if (logoCreateActivity5.abc10060 == null) {
                    logoCreateActivity5.abc10060 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity6.abc10057;
            if (strArr3 != null) {
                strArr3[2] = null;
            }
            if (logoCreateActivity6.abc10077 != null) {
                int i = 0;
                while (true) {
                    String[] strArr4 = LogoCreateActivity.this.abc10077;
                    if (i >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i] = "string" + i;
                    i++;
                }
            }
            if (LogoCreateActivity.this.abc10045 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10045;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 9;
                    i2++;
                }
            }
            LogoCreateActivity.this.setBtFontStyle();
            if (LogoCreateActivity.this.abc1001 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr5 = LogoCreateActivity.this.abc1001;
                    if (i3 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10038 = 0.20420247f;
            logoCreateActivity7.abc10069 = "ly more";
            if (logoCreateActivity7.abc30 < 0) {
                logoCreateActivity7.abc30 = 5;
                logoCreateActivity7.abc10029 = !logoCreateActivity7.abc10029;
                if (logoCreateActivity7.abc10050 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr2 = LogoCreateActivity.this.abc10050;
                        if (i4 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i4] = 2;
                        i4++;
                    }
                }
                int i5 = 0;
                while (true) {
                    LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                    int i6 = logoCreateActivity8.abc1005;
                    if (i6 > 3) {
                        i6 = 3;
                    }
                    if (i5 >= i6) {
                        break;
                    }
                    if (logoCreateActivity8.abc10041 == null) {
                        logoCreateActivity8.abc10041 = new int[10];
                    }
                    i5++;
                }
            }
            if (LogoCreateActivity.this.abc10023 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr6 = LogoCreateActivity.this.abc10023;
                    if (i7 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i7] = "string" + i7;
                    i7++;
                }
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10059 = "t thi";
            int[] iArr3 = logoCreateActivity9.abc10041;
            if (iArr3 != null) {
                iArr3[1] = 0;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$d */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9453d implements View.OnClickListener {
        public View$OnClickListenerC9453d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.createVM.hideLayerList();
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10065 = true;
            if (logoCreateActivity2.abc10018.size() < 6) {
                LogoCreateActivity.this.abc10018.add("erary Rose");
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10040 = !logoCreateActivity3.abc10040;
            logoCreateActivity3.abc30 += 5;
            if (logoCreateActivity3.abc1000 == null) {
                logoCreateActivity3.abc1000 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10036 == null) {
                logoCreateActivity4.abc10036 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10065 = false;
            logoCreateActivity5.lastBgImage = logoCreateActivity5.binding.drawview.getCurrentBackgroudImage();
            if (LogoCreateActivity.this.abc10041 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10041;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 2;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10052 *= 1;
            if (!TextUtils.isEmpty(logoCreateActivity6.abc10012)) {
                int length = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc14 = -logoCreateActivity7.abc14;
            if (logoCreateActivity7.abc10067.size() > 3) {
                LogoCreateActivity.this.abc10067.add("year");
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10010 == null) {
                logoCreateActivity8.abc10010 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                int length2 = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.lastBgColor = logoCreateActivity9.binding.drawview.getCurrentBackgroudColor();
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            if (logoCreateActivity10.abc10043 == null) {
                logoCreateActivity10.abc10043 = new String[10];
            }
            if (logoCreateActivity10.abc10071 == null) {
                logoCreateActivity10.abc10071 = new String[10];
            }
            String[] strArr = logoCreateActivity10.abc10023;
            if (strArr != null) {
                strArr[1] = "ern nov";
            }
            logoCreateActivity10.abc14 = 0.9865821798005117d;
            int[] iArr2 = logoCreateActivity10.abc10050;
            if (iArr2 != null) {
                iArr2[9] = 4;
            }
            if (logoCreateActivity10.abc10046 < 0) {
                logoCreateActivity10.abc10046 = 3;
            }
            int[] iArr3 = logoCreateActivity10.abc10041;
            if (iArr3 != null) {
                iArr3[2] = 1;
            }
            logoCreateActivity10.binding.drawview.m9092m();
            if (LogoCreateActivity.this.abc10075 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10075;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc1007 = ((double) logoCreateActivity11.abc1007) < 0.024711251d ? 0.03830743f : 0.7649438f;
            ArrayList<Integer> arrayList = logoCreateActivity11.abc10056;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10056.remove(0);
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc27 = Math.abs(logoCreateActivity12.abc27);
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            int[] iArr4 = logoCreateActivity13.abc10047;
            if (iArr4 != null) {
                iArr4[5] = 9;
            }
            if (logoCreateActivity13.abc10074.size() > 7) {
                LogoCreateActivity.this.abc10074.add(0);
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            logoCreateActivity14.abc10013 = -logoCreateActivity14.abc10013;
            logoCreateActivity14.createVM.showBackgroundLayout();
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            if (logoCreateActivity15.abc1000 == null) {
                logoCreateActivity15.abc1000 = new ArrayList<>();
            }
            int i3 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i4 = logoCreateActivity.abc10052;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                ArrayList<Integer> arrayList2 = logoCreateActivity.abc10011;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                i3++;
            }
            if (logoCreateActivity.abc1000.size() > 8) {
                LogoCreateActivity.this.abc1000.add(5);
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            logoCreateActivity16.abc30 *= 1;
            int[] iArr5 = logoCreateActivity16.abc10061;
            if (iArr5 != null) {
                iArr5[2] = 0;
            }
            ArrayList<Integer> arrayList3 = logoCreateActivity16.abc10014;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10014.remove(0);
            }
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            if (logoCreateActivity17.abc10068 > 0.08433918068455792d) {
                logoCreateActivity17.abc10068 = 0.4233175245452704d;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$d0 */
    /* loaded from: classes3.dex */
    public class C9454d0 implements Observer<Boolean> {
        public C9454d0() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoCreateActivity logoCreateActivity;
            if (bool.booleanValue()) {
                LogoCreateActivity.this.hideFirstMenu();
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc10076 = !logoCreateActivity2.abc10076;
                logoCreateActivity2.abc10038 = 0.8998203f;
                int[] iArr = logoCreateActivity2.abc10061;
                if (iArr != null) {
                    iArr[2] = 0;
                }
                logoCreateActivity2.showView(logoCreateActivity2.binding.includeClipping.getRoot(), new View[0]);
                if (LogoCreateActivity.this.abc10031 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10031;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10018 == null) {
                    logoCreateActivity3.abc10018 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc10041 == null) {
                    logoCreateActivity4.abc10041 = new int[10];
                }
                if (logoCreateActivity4.abc8.size() < 9) {
                    LogoCreateActivity.this.abc8.add("a");
                    if (LogoCreateActivity.this.abc10010.size() > 4) {
                        LogoCreateActivity.this.abc10010.add(8);
                    }
                    LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                    int[] iArr2 = logoCreateActivity5.abc10047;
                    if (iArr2 != null) {
                        iArr2[3] = 9;
                    }
                    logoCreateActivity5.abc10026 *= 0.5434469f;
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc1008 = 0;
                logoCreateActivity6.abc10033 = false;
                logoCreateActivity6.abc10032 = !logoCreateActivity6.abc10032;
            } else {
                LogoCreateActivity.this.showFirstMenu();
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc10035 = false;
                ArrayList<Integer> arrayList = logoCreateActivity7.abc1000;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10065 = false;
                logoCreateActivity8.hideView(logoCreateActivity8.binding.includeClipping.getRoot(), new View[0]);
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                if (logoCreateActivity9.abc10060 == null) {
                    logoCreateActivity9.abc10060 = new String[10];
                }
                ArrayList<Integer> arrayList2 = logoCreateActivity9.abc10037;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                String[] strArr2 = logoCreateActivity10.abc10021;
                if (strArr2 != null) {
                    strArr2[2] = "oba";
                }
                if (logoCreateActivity10.abc20 != null) {
                    int i2 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        int[] iArr3 = logoCreateActivity.abc20;
                        if (i2 >= iArr3.length) {
                            break;
                        }
                        iArr3[i2] = 6;
                        ArrayList<Integer> arrayList3 = logoCreateActivity.abc10010;
                        if (arrayList3 == null && arrayList3.size() > 0) {
                            LogoCreateActivity.this.abc10010.remove(0);
                        }
                        LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                        logoCreateActivity11.abc10065 = !logoCreateActivity11.abc10065;
                        logoCreateActivity11.abc10026 *= 0.88780457f;
                        i2++;
                    }
                    if (logoCreateActivity.abc10023 == null) {
                        logoCreateActivity.abc10023 = new String[10];
                    }
                    String[] strArr3 = logoCreateActivity.abc1001;
                    if (strArr3 != null) {
                        strArr3[5] = "for";
                    }
                    if (logoCreateActivity.abc10056 == null) {
                        logoCreateActivity.abc10056 = new ArrayList<>();
                    }
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                int[] iArr4 = logoCreateActivity12.abc10042;
                if (iArr4 != null) {
                    iArr4[6] = 4;
                }
                if (logoCreateActivity12.abc1001 == null) {
                    logoCreateActivity12.abc1001 = new String[10];
                }
                String[] strArr4 = logoCreateActivity12.abc10031;
                if (strArr4 != null) {
                    strArr4[8] = null;
                }
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc10033 = !logoCreateActivity13.abc10033;
            ArrayList<Integer> arrayList4 = logoCreateActivity13.abc10030;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc10030.remove(0);
            }
            ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10011;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoCreateActivity.this.abc10011.remove(0);
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            if (logoCreateActivity14.abc20 == null) {
                logoCreateActivity14.abc20 = new int[10];
                String[] strArr5 = logoCreateActivity14.abc10022;
                if (strArr5 != null) {
                    strArr5[8] = "neg";
                }
                ArrayList<String> arrayList6 = logoCreateActivity14.abc10018;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
                LogoCreateActivity.this.abc10013 = 0.34356546f;
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            logoCreateActivity15.abc10020 = 0.29495585f;
            if (logoCreateActivity15.abc10034 == null) {
                logoCreateActivity15.abc10034 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            if (logoCreateActivity16.abc10030 == null) {
                logoCreateActivity16.abc10030 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$d1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9455d1 implements View.OnClickListener {
        public View$OnClickListenerC9455d1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9113M();
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                int length = LogoCreateActivity.this.abc10069.length();
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                logoCreateActivity.abc10069 = LogoCreateActivity.this.abc10069 + length;
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10065 = false;
            if (logoCreateActivity2.abc10047 == null) {
                logoCreateActivity2.abc10047 = new int[10];
            }
            logoCreateActivity2.abc27 = logoCreateActivity2.abc27 > 0.3463065320108386d ? 0.7598426235332167d : 0.48737574251728d;
            String[] strArr = logoCreateActivity2.abc10075;
            if (strArr != null) {
                strArr[2] = " student";
            }
            logoCreateActivity2.abc10059 = "k d";
            ArrayList<Integer> arrayList = logoCreateActivity2.abc1000;
            if (arrayList != null || arrayList.size() <= 0) {
                return;
            }
            LogoCreateActivity.this.abc1000.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$d2 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9456d2 implements View.OnClickListener {
        public View$OnClickListenerC9456d2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity.this.lastTextSkew = !logoCreateActivity.lastTextSkew;
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity3.abc10073;
            if (strArr != null) {
                strArr[9] = "ters ";
            }
            logoCreateActivity3.abc10035 = false;
            if (logoCreateActivity3.abc10077 == null) {
                logoCreateActivity3.abc10077 = new String[10];
            }
            String[] strArr2 = logoCreateActivity3.abc31;
            if (strArr2 != null) {
                strArr2[1] = null;
                logoCreateActivity3.abc10013 -= 0.42831004f;
                logoCreateActivity3.abc10032 = !logoCreateActivity3.abc10032;
                if (logoCreateActivity3.abc10026 < 0.54252553d) {
                    logoCreateActivity3.abc10026 = 0.48686266f;
                }
            }
            logoCreateActivity3.abc10025 *= 0.05387634f;
            if (logoCreateActivity3.abc10042 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10042;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 7;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10075 == null) {
                logoCreateActivity4.abc10075 = new String[10];
            }
            logoCreateActivity4.binding.drawview.setSkew(logoCreateActivity4.lastTextSkew);
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10037;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10037.remove(0);
            }
            ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10067;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10067.remove(0);
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10069 = " is";
            if (logoCreateActivity5.abc34 != null) {
                int i2 = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    int[] iArr2 = logoCreateActivity2.abc34;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    iArr2[i2] = 9;
                    if (logoCreateActivity2.abc10071 != null) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr3 = LogoCreateActivity.this.abc10071;
                            if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                                break;
                            }
                            strArr3[i3] = "string" + i3;
                            i3++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                    if (logoCreateActivity6.abc1003 == null) {
                        logoCreateActivity6.abc1003 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                    if (logoCreateActivity7.abc10010 == null) {
                        logoCreateActivity7.abc10010 = new ArrayList<>();
                    }
                    i2++;
                }
                logoCreateActivity2.abc10072 = true;
                logoCreateActivity2.abc10072 = true;
                ArrayList<String> arrayList3 = logoCreateActivity2.abc10048;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10048.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10072 = !logoCreateActivity8.abc10072;
            logoCreateActivity8.abc10032 = true;
            logoCreateActivity8.abc10065 = !logoCreateActivity8.abc10065;
            logoCreateActivity8.setBtFontStyle();
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity9.abc10042;
            if (iArr3 != null) {
                iArr3[9] = 0;
            }
            logoCreateActivity9.abc10029 = true;
            logoCreateActivity9.abc10032 = false;
            String[] strArr4 = logoCreateActivity9.abc0;
            if (strArr4 != null) {
                strArr4[3] = "读 9,52";
                int[] iArr4 = logoCreateActivity9.abc10045;
                if (iArr4 != null) {
                    iArr4[6] = 0;
                }
                if (logoCreateActivity9.abc10056.size() > 5) {
                    LogoCreateActivity.this.abc10056.add(8);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                if (logoCreateActivity10.abc10024 == null) {
                    logoCreateActivity10.abc10024 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10069 = "ira";
            if (logoCreateActivity11.abc10075 == null) {
                logoCreateActivity11.abc10075 = new String[10];
            }
            ArrayList<String> arrayList4 = logoCreateActivity11.abc10039;
            if (arrayList4 == null || arrayList4.size() <= 0) {
                return;
            }
            LogoCreateActivity.this.abc10039.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$e */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9457e implements View.OnClickListener {

        /* renamed from: com.logomaster.logomaker.LogoCreateActivity$e$a */
        /* loaded from: classes3.dex */
        public class C9458a implements LogoInputDialog.InterfaceC9639f {
            public C9458a() {
            }

            @Override // com.logomaster.logomaker.LogoInputDialog.InterfaceC9639f
            /* renamed from: a */
            public void mo9156a(String str) {
                LogoCreateActivity.this.binding.drawview.m9101d(str);
                if (LogoCreateActivity.this.abc10077 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10077;
                        if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                logoCreateActivity.abc10063 = ((double) logoCreateActivity.abc10063) < 0.07129061d ? 0.78124815f : 0.15909368f;
                logoCreateActivity.abc10027 -= 0.8007405f;
                if (logoCreateActivity.abc35.size() > 1) {
                    LogoCreateActivity.this.abc35.add(0);
                    LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                    logoCreateActivity2.abc10072 = true ^ logoCreateActivity2.abc10072;
                    String[] strArr2 = logoCreateActivity2.abc10071;
                    if (strArr2 != null) {
                        strArr2[9] = null;
                    }
                    String[] strArr3 = logoCreateActivity2.abc10023;
                    if (strArr3 != null) {
                        strArr3[9] = null;
                    }
                }
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10011;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc1000;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10060 == null) {
                    logoCreateActivity3.abc10060 = new String[10];
                }
            }
        }

        public View$OnClickListenerC9457e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            LogoCreateActivity.this.createVM.hideLayerList();
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10049 = true;
            logoCreateActivity5.abc10028 = 9;
            logoCreateActivity5.abc10029 = true;
            int i = 0;
            if (logoCreateActivity5.abc2.size() > 9) {
                LogoCreateActivity.this.abc2.add(6);
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity6.abc10041;
                if (iArr != null) {
                    iArr[1] = 0;
                }
                if (logoCreateActivity6.abc1003 == null) {
                    logoCreateActivity6.abc1003 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10037.size() > 8) {
                    LogoCreateActivity.this.abc10037.add(0);
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc1002 == null) {
                logoCreateActivity7.abc1002 = new int[10];
            }
            logoCreateActivity7.abc10029 = !logoCreateActivity7.abc10029;
            logoCreateActivity7.abc10054 = DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR;
            if (logoCreateActivity7.logoInputDialog == null) {
                LogoCreateActivity.this.logoInputDialog = new LogoInputDialog(LogoCreateActivity.this);
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10019 = 3;
                if (logoCreateActivity8.abc10023 == null) {
                    logoCreateActivity8.abc10023 = new String[10];
                }
                logoCreateActivity8.abc10019 = -3;
                if (logoCreateActivity8.abc32 != null) {
                    int i2 = 0;
                    while (true) {
                        logoCreateActivity3 = LogoCreateActivity.this;
                        int[] iArr2 = logoCreateActivity3.abc32;
                        if (i2 >= iArr2.length) {
                            break;
                        }
                        iArr2[i2] = 5;
                        ArrayList<Integer> arrayList = logoCreateActivity3.abc1000;
                        if (arrayList == null && arrayList.size() > 0) {
                            LogoCreateActivity.this.abc1000.remove(0);
                        }
                        LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                        if (logoCreateActivity9.abc10024 == null) {
                            logoCreateActivity9.abc10024 = new ArrayList<>();
                        }
                        LogoCreateActivity.this.abc10065 = !logoCreateActivity4.abc10065;
                        i2++;
                    }
                    String[] strArr = logoCreateActivity3.abc10077;
                    if (strArr != null) {
                        strArr[5] = null;
                    }
                    if (logoCreateActivity3.abc10021 == null) {
                        logoCreateActivity3.abc10021 = new String[10];
                    }
                    logoCreateActivity3.abc10051 -= 0.5825869813855487d;
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                if (logoCreateActivity10.abc10067 == null) {
                    logoCreateActivity10.abc10067 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc10025 = 0.88546044f;
                if (!TextUtils.isEmpty(logoCreateActivity11.abc10069)) {
                    int length = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length;
                }
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                int length2 = LogoCreateActivity.this.abc10064.length();
                LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length2;
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            if (logoCreateActivity12.abc10011 == null) {
                logoCreateActivity12.abc10011 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc1000;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc1000.remove(0);
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc38 = 0.15475357773818477d;
            int[] iArr3 = logoCreateActivity13.abc10050;
            if (iArr3 != null) {
                iArr3[0] = 0;
            }
            logoCreateActivity13.abc10065 = !logoCreateActivity13.abc10065;
            if (logoCreateActivity13.abc10041 == null) {
                logoCreateActivity13.abc10041 = new int[10];
            }
            logoCreateActivity13.logoInputDialog.setOnSaveClickListener(new C9458a());
            ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10010;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc10037;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc10037.remove(0);
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            logoCreateActivity14.abc10065 = !logoCreateActivity14.abc10065;
            String[] strArr2 = logoCreateActivity14.abc31;
            if (strArr2 != null) {
                strArr2[0] = null;
                logoCreateActivity14.abc1004 = !logoCreateActivity14.abc1004;
                logoCreateActivity14.abc1005 += 3;
                logoCreateActivity14.abc10058 = 0.42470281569237456d;
            }
            logoCreateActivity14.abc10033 = false;
            logoCreateActivity14.abc10033 = true;
            logoCreateActivity14.abc10027 = ((double) logoCreateActivity14.abc10027) < 0.87285745d ? 0.18809181f : 0.972407f;
            logoCreateActivity14.logoInputDialog.m9157h("");
            int i3 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i4 = logoCreateActivity.abc1005;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                if (logoCreateActivity.abc10050 == null) {
                    logoCreateActivity.abc10050 = new int[10];
                }
                i3++;
            }
            if (logoCreateActivity.abc10048.size() > 9) {
                LogoCreateActivity.this.abc10048.add("el for so");
            }
            if (LogoCreateActivity.this.abc10017 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr4 = LogoCreateActivity.this.abc10017;
                    if (i5 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i5] = 2;
                    i5++;
                }
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            logoCreateActivity15.abc4 = 0.55694246f;
            logoCreateActivity15.abc10059 = "iration, b";
            if (logoCreateActivity15.abc10078 == null) {
                logoCreateActivity15.abc10078 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            logoCreateActivity16.abc10035 = !logoCreateActivity16.abc10035;
            logoCreateActivity16.logoInputDialog.show();
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            logoCreateActivity17.abc10051 = Math.abs(logoCreateActivity17.abc10051);
            int i6 = 0;
            while (true) {
                logoCreateActivity2 = LogoCreateActivity.this;
                int i7 = logoCreateActivity2.abc10019;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                logoCreateActivity2.abc10063 = ((double) logoCreateActivity2.abc10063) > 0.81582385d ? 0.81632864f : 0.61194813f;
                i6++;
            }
            logoCreateActivity2.abc10038 -= 0.2882467f;
            if (logoCreateActivity2.abc8.size() > 6) {
                LogoCreateActivity.this.abc8.add("丝怀");
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                int[] iArr5 = logoCreateActivity18.abc10045;
                if (iArr5 != null) {
                    iArr5[6] = 6;
                }
                String[] strArr3 = logoCreateActivity18.abc10031;
                if (strArr3 != null) {
                    strArr3[6] = null;
                }
                if (logoCreateActivity18.abc10016 != null) {
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10016;
                        if (i >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i] = "string" + i;
                        i++;
                    }
                }
            }
            LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
            logoCreateActivity19.abc10046 = 6;
            String[] strArr5 = logoCreateActivity19.abc1001;
            if (strArr5 != null) {
                strArr5[7] = null;
            }
            logoCreateActivity19.abc1004 = true ^ logoCreateActivity19.abc1004;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$e0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9459e0 implements View.OnClickListener {
        public View$OnClickListenerC9459e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            int i = 0;
            LogoCreateActivity.this.createVM.setClippingSelectedIndex(0);
            if (LogoCreateActivity.this.abc10036.size() < 3) {
                LogoCreateActivity.this.abc10036.add("ne, the ");
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity4.abc10015;
            if (strArr != null) {
                strArr[0] = "ide";
            }
            logoCreateActivity4.abc10051 = 0.8692155836591432d;
            if (logoCreateActivity4.abc37 == null) {
                logoCreateActivity4.abc37 = new ArrayList<>();
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc10032 = true;
                logoCreateActivity5.abc10032 = false;
                logoCreateActivity5.abc10038 = -logoCreateActivity5.abc10038;
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity6.abc10031;
            if (strArr2 != null) {
                strArr2[9] = " peopl";
            }
            String[] strArr3 = logoCreateActivity6.abc10015;
            if (strArr3 != null) {
                strArr3[4] = "l is.unear";
            }
            if (logoCreateActivity6.abc10034.size() > 9) {
                LogoCreateActivity.this.abc10034.add(9);
            }
            LogoCreateActivity.this.binding.drawview.setClippingType(0);
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10012)) {
                int length = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10049 = true;
            if (logoCreateActivity7.abc1003.size() < 4) {
                LogoCreateActivity.this.abc1003.add("r when g");
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc27 = 0.33794117540445123d;
            if (logoCreateActivity8.abc10022 == null) {
                logoCreateActivity8.abc10022 = new String[10];
            }
            int[] iArr = logoCreateActivity8.abc10017;
            if (iArr != null) {
                iArr[0] = 0;
            }
            String[] strArr4 = logoCreateActivity8.abc10016;
            if (strArr4 != null) {
                strArr4[8] = "ch";
            }
            logoCreateActivity8.binding.includeClipping.tvTipsRadius.setVisibility(4);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10027 = 0.5802529f;
            logoCreateActivity9.abc10032 = false;
            if (logoCreateActivity9.abc10067.size() > 8) {
                LogoCreateActivity.this.abc10067.add("ly starte");
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            if (logoCreateActivity10.abc9 == null) {
                logoCreateActivity10.abc9 = new ArrayList<>();
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                if (logoCreateActivity11.abc10074 == null) {
                    logoCreateActivity11.abc10074 = new ArrayList<>();
                }
                int i2 = 0;
                while (true) {
                    logoCreateActivity3 = LogoCreateActivity.this;
                    int i3 = logoCreateActivity3.abc10046;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    String[] strArr5 = logoCreateActivity3.abc10060;
                    if (strArr5 != null) {
                        strArr5[4] = null;
                    }
                    i2++;
                }
                logoCreateActivity3.abc10068 = -logoCreateActivity3.abc10068;
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            if (logoCreateActivity12.abc10051 > 0.019391490902647468d) {
                logoCreateActivity12.abc10051 = 0.6791744722374242d;
            }
            logoCreateActivity12.abc10072 = true;
            logoCreateActivity12.abc10058 += 0.8015989480796452d;
            logoCreateActivity12.binding.includeClipping.sbClippling.setVisibility(4);
            LogoCreateActivity.this.abc10035 = !logoCreateActivity.abc10035;
            while (true) {
                logoCreateActivity2 = LogoCreateActivity.this;
                int i4 = logoCreateActivity2.abc10052;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i >= i4) {
                    break;
                }
                if (logoCreateActivity2.abc1007 < 0.567071d) {
                    logoCreateActivity2.abc1007 = 0.50735027f;
                }
                i++;
            }
            if (logoCreateActivity2.abc10078.size() > 6) {
                LogoCreateActivity.this.abc10078.add(1);
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc17 = 0.7284784696852455d;
            String[] strArr6 = logoCreateActivity13.abc1001;
            if (strArr6 != null) {
                strArr6[3] = "ning st";
            }
            logoCreateActivity13.abc10072 = !logoCreateActivity13.abc10072;
            String[] strArr7 = logoCreateActivity13.abc10021;
            if (strArr7 != null) {
                strArr7[9] = " is";
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$e1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9460e1 implements View.OnClickListener {
        public View$OnClickListenerC9460e1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9114L();
            if (LogoCreateActivity.this.abc10030.size() < 6) {
                LogoCreateActivity.this.abc10030.add(6);
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10052 = Math.abs(logoCreateActivity.abc10052);
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10066 = ((double) logoCreateActivity2.abc10066) > 0.7430293d ? 0.8755581f : 0.083192766f;
            logoCreateActivity2.abc7 += 0.991384f;
            logoCreateActivity2.abc10035 = false;
            if (logoCreateActivity2.abc10067.size() > 3) {
                LogoCreateActivity.this.abc10067.add("r so many");
            }
            int[] iArr = LogoCreateActivity.this.abc1002;
            if (iArr != null) {
                iArr[2] = 0;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$e2 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9461e2 implements View.OnClickListener {
        public View$OnClickListenerC9461e2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.lastTextUnderline = !logoCreateActivity.lastTextUnderline;
            if (LogoCreateActivity.this.abc10071 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10071;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc1000 == null) {
                logoCreateActivity2.abc1000 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10033 = false;
            if (logoCreateActivity3.abc6 == null) {
                logoCreateActivity3.abc6 = new int[10];
                if (logoCreateActivity3.abc10055 == null) {
                    logoCreateActivity3.abc10055 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc10062 = "only ";
                logoCreateActivity4.abc10027 = ((double) logoCreateActivity4.abc10027) < 0.48969156d ? 0.5422269f : 0.83219784f;
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10027 = 0.9689305f;
            if (logoCreateActivity5.abc10034.size() > 9) {
                LogoCreateActivity.this.abc10034.add(2);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity6.abc10050;
            if (iArr != null) {
                iArr[7] = 0;
            }
            logoCreateActivity6.binding.drawview.setUnderline(logoCreateActivity6.lastTextUnderline);
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc10078 == null) {
                logoCreateActivity7.abc10078 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10027 = Math.abs(logoCreateActivity8.abc10027);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            if (logoCreateActivity9.abc10037 == null) {
                logoCreateActivity9.abc10037 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            if (logoCreateActivity10.abc15 == null) {
                logoCreateActivity10.abc15 = new int[10];
                logoCreateActivity10.abc10032 = false;
                logoCreateActivity10.abc10013 = ((double) logoCreateActivity10.abc10013) < 0.46053946d ? 0.6886804f : 0.3875537f;
                if (logoCreateActivity10.abc10026 < 0.7183376d) {
                    logoCreateActivity10.abc10026 = 0.21290588f;
                }
            }
            logoCreateActivity10.abc10032 = !logoCreateActivity10.abc10032;
            logoCreateActivity10.abc10033 = !logoCreateActivity10.abc10033;
            String[] strArr2 = logoCreateActivity10.abc10015;
            if (strArr2 != null) {
                strArr2[7] = null;
            }
            logoCreateActivity10.setBtFontStyle();
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc1007 = 0.68923897f;
            logoCreateActivity11.abc10062 = "odern ";
            if (logoCreateActivity11.abc10010.size() < 5) {
                LogoCreateActivity.this.abc10010.add(4);
            }
            ArrayList<String> arrayList = LogoCreateActivity.this.abc37;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc37.remove(0);
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity12.abc10022;
                if (strArr3 != null) {
                    strArr3[2] = null;
                }
                logoCreateActivity12.abc10029 = !logoCreateActivity12.abc10029;
                String[] strArr4 = logoCreateActivity12.abc10031;
                if (strArr4 != null) {
                    strArr4[5] = "harac";
                }
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            if (logoCreateActivity13.abc10050 == null) {
                logoCreateActivity13.abc10050 = new int[10];
            }
            ArrayList<Integer> arrayList2 = logoCreateActivity13.abc10030;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10030.remove(0);
            }
            if (TextUtils.isEmpty(LogoCreateActivity.this.abc10012)) {
                return;
            }
            int length = LogoCreateActivity.this.abc10012.length();
            LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$f */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9462f implements View.OnClickListener {
        public View$OnClickListenerC9462f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            int i;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity.this.createVM.hideLayerList();
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity4.abc10017;
            if (iArr != null) {
                iArr[8] = 0;
            }
            ArrayList<Integer> arrayList = logoCreateActivity4.abc10074;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10074.remove(0);
            }
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10011;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10011.remove(0);
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc38 = logoCreateActivity5.abc38 < 0.5448886053528317d ? 0.00448338554363692d : 0.1336899548453192d;
            if (logoCreateActivity5.abc10037.size() < 5) {
                LogoCreateActivity.this.abc10037.add(8);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc10061 == null) {
                logoCreateActivity6.abc10061 = new int[10];
            }
            int[] iArr2 = logoCreateActivity6.abc10041;
            if (iArr2 != null) {
                iArr2[4] = 6;
            }
            logoCreateActivity6.lastClippingType = logoCreateActivity6.binding.drawview.getClippingType();
            ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10055;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10055.remove(0);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity7.abc1001;
            if (strArr != null) {
                strArr[3] = null;
            }
            if (logoCreateActivity7.abc1005 > 0) {
                logoCreateActivity7.abc1005 = 9;
            }
            int[] iArr3 = logoCreateActivity7.abc20;
            if (iArr3 != null) {
                iArr3[4] = 0;
                logoCreateActivity7.abc10026 = ((double) logoCreateActivity7.abc10026) > 0.81220037d ? 0.9252657f : 0.015619576f;
                if (logoCreateActivity7.abc10047 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr4 = LogoCreateActivity.this.abc10047;
                        if (i2 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i2] = 0;
                        i2++;
                    }
                }
                LogoCreateActivity.this.abc1005 *= 3;
            }
            if (LogoCreateActivity.this.abc10061 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr5 = LogoCreateActivity.this.abc10061;
                    if (i3 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i3] = 7;
                    i3++;
                }
            }
            if (LogoCreateActivity.this.abc10018.size() > 6) {
                LogoCreateActivity.this.abc10018.add(" of a l");
            }
            if (LogoCreateActivity.this.abc10070.size() < 3) {
                LogoCreateActivity.this.abc10070.add("p");
            }
            if (LogoCreateActivity.this.lastClippingType == null) {
                LogoCreateActivity.this.lastClippingType = 0;
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                int[] iArr6 = logoCreateActivity8.abc10041;
                if (iArr6 != null) {
                    iArr6[1] = 0;
                }
                if (logoCreateActivity8.abc10042 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr7 = LogoCreateActivity.this.abc10042;
                        if (i4 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                            break;
                        }
                        iArr7[i4] = 2;
                        i4++;
                    }
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                int[] iArr8 = logoCreateActivity9.abc10050;
                if (iArr8 != null) {
                    iArr8[7] = 0;
                }
                if (logoCreateActivity9.abc4 < 0.36145365d) {
                    logoCreateActivity9.abc4 = 0.0831601f;
                    if (logoCreateActivity9.abc10077 != null) {
                        int i5 = 0;
                        while (true) {
                            String[] strArr2 = LogoCreateActivity.this.abc10077;
                            if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i5] = "string" + i5;
                            i5++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                    logoCreateActivity10.abc1008 += 8;
                    logoCreateActivity10.abc10052 -= 7;
                }
                if (LogoCreateActivity.this.abc10047 != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr9 = LogoCreateActivity.this.abc10047;
                        if (i6 >= (iArr9.length > 3 ? 3 : iArr9.length)) {
                            break;
                        }
                        iArr9[i6] = 0;
                        i6++;
                    }
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc10013 = 0.6182794f;
                if (!TextUtils.isEmpty(logoCreateActivity11.abc10054)) {
                    int length = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
                }
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc1007 = 0.7384f;
            String[] strArr3 = logoCreateActivity12.abc10075;
            if (strArr3 != null) {
                strArr3[8] = "d every y";
            }
            if (logoCreateActivity12.abc10045 == null) {
                logoCreateActivity12.abc10045 = new int[10];
            }
            if (logoCreateActivity12.abc22 == null) {
                logoCreateActivity12.abc22 = new int[10];
                if (logoCreateActivity12.abc1008 < 0) {
                    logoCreateActivity12.abc1008 = 2;
                }
                ArrayList<String> arrayList4 = logoCreateActivity12.abc10067;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10067.remove(0);
                }
                LogoCreateActivity.this.abc10051 = 0.6010610884267472d;
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc10066 = Math.abs(logoCreateActivity13.abc10066);
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            logoCreateActivity14.abc10049 = false;
            logoCreateActivity14.abc10059 = " in the ea";
            if (logoCreateActivity14.lastClippingType.intValue() == 3) {
                LogoCreateActivity.this.binding.includeClipping.tvTipsRadius.setVisibility(0);
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                logoCreateActivity15.abc10038 -= 0.86482364f;
                if (logoCreateActivity15.abc10073 != null) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10073;
                        if (i7 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i7] = "string" + i7;
                        i7++;
                    }
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                    int length2 = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length2;
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                int[] iArr10 = logoCreateActivity16.abc20;
                if (iArr10 != null) {
                    iArr10[2] = 1;
                    if (logoCreateActivity16.abc1000 == null) {
                        logoCreateActivity16.abc1000 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                    logoCreateActivity17.abc10076 = !logoCreateActivity17.abc10076;
                    logoCreateActivity17.abc10068 = 0.08336216297591148d;
                }
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                if (logoCreateActivity18.abc10031 == null) {
                    logoCreateActivity18.abc10031 = new String[10];
                }
                if (logoCreateActivity18.abc10024.size() > 8) {
                    LogoCreateActivity.this.abc10024.add("ell, ");
                }
                LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                logoCreateActivity19.abc10052 = logoCreateActivity19.abc10052 > 0 ? 4 : 8;
                logoCreateActivity19.binding.includeClipping.sbClippling.setVisibility(0);
                LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                logoCreateActivity20.abc10058 = 0.8941287797248758d;
                String[] strArr5 = logoCreateActivity20.abc10021;
                if (strArr5 != null) {
                    strArr5[8] = "ead it.";
                }
                logoCreateActivity20.abc10013 -= 0.45692325f;
                if (logoCreateActivity20.abc21.size() < 3) {
                    LogoCreateActivity.this.abc21.add("很");
                    ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10037;
                    if (arrayList5 == null && arrayList5.size() > 0) {
                        LogoCreateActivity.this.abc10037.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                    logoCreateActivity21.abc10025 = ((double) logoCreateActivity21.abc10025) < 0.21346462d ? 0.6389533f : 0.55037427f;
                    if (logoCreateActivity21.abc10013 < 0.7397225d) {
                        logoCreateActivity21.abc10013 = 0.0903033f;
                    }
                }
                LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                String[] strArr6 = logoCreateActivity22.abc10060;
                if (strArr6 != null) {
                    strArr6[5] = "eju";
                }
                if (logoCreateActivity22.abc10031 != null) {
                    int i8 = 0;
                    while (true) {
                        String[] strArr7 = LogoCreateActivity.this.abc10031;
                        if (i8 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i8] = "string" + i8;
                        i8++;
                    }
                }
                ArrayList<Integer> arrayList6 = LogoCreateActivity.this.abc10034;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc10034.remove(0);
                }
            } else {
                LogoCreateActivity.this.binding.includeClipping.tvTipsRadius.setVisibility(4);
                LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                logoCreateActivity23.abc10063 = 0.12632382f;
                logoCreateActivity23.abc10019++;
                logoCreateActivity23.abc10072 = false;
                logoCreateActivity23.abc18 = 0.05912375272408488d;
                if (logoCreateActivity23.abc10036.size() < 6) {
                    LogoCreateActivity.this.abc10036.add("t is echoe");
                }
                if (LogoCreateActivity.this.abc10016 != null) {
                    int i9 = 0;
                    while (true) {
                        String[] strArr8 = LogoCreateActivity.this.abc10016;
                        if (i9 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i9] = "string" + i9;
                        i9++;
                    }
                }
                LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                logoCreateActivity24.abc10013 = ((double) logoCreateActivity24.abc10013) > 0.98006994d ? 0.67469347f : 0.71962166f;
                logoCreateActivity24.binding.includeClipping.sbClippling.setVisibility(4);
                LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                if (logoCreateActivity25.abc10057 == null) {
                    logoCreateActivity25.abc10057 = new String[10];
                }
                logoCreateActivity25.abc10065 = !logoCreateActivity25.abc10065;
                ArrayList<Integer> arrayList7 = logoCreateActivity25.abc10034;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    LogoCreateActivity.this.abc10034.remove(0);
                }
                if (LogoCreateActivity.this.abc34 != null) {
                    int i10 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        int[] iArr11 = logoCreateActivity.abc34;
                        if (i10 >= iArr11.length) {
                            break;
                        }
                        iArr11[i10] = 5;
                        if (logoCreateActivity.abc10077 == null) {
                            logoCreateActivity.abc10077 = new String[10];
                        }
                        if (logoCreateActivity.abc10070 == null) {
                            logoCreateActivity.abc10070 = new ArrayList<>();
                        }
                        if (LogoCreateActivity.this.abc10061 != null) {
                            int i11 = 0;
                            while (true) {
                                int[] iArr12 = LogoCreateActivity.this.abc10061;
                                if (i11 < (iArr12.length > 3 ? 3 : iArr12.length)) {
                                    iArr12[i11] = 5;
                                    i11++;
                                }
                            }
                        }
                        i10++;
                    }
                    logoCreateActivity.abc10028 = Math.abs(logoCreateActivity.abc10028);
                    LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                    logoCreateActivity26.abc10033 = true;
                    ArrayList<String> arrayList8 = logoCreateActivity26.abc1003;
                    if (arrayList8 != null && arrayList8.size() > 0) {
                        LogoCreateActivity.this.abc1003.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                logoCreateActivity27.abc10046 = 2;
                logoCreateActivity27.abc10072 = !logoCreateActivity27.abc10072;
                String[] strArr9 = logoCreateActivity27.abc10015;
                if (strArr9 != null) {
                    strArr9[1] = "people r";
                }
            }
            LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
            logoCreateActivity28.abc10026 = Math.abs(logoCreateActivity28.abc10026);
            LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
            if (logoCreateActivity29.abc10051 < 0.6609587095146654d) {
                logoCreateActivity29.abc10051 = 0.8861280124081801d;
            }
            int i12 = 0;
            while (true) {
                logoCreateActivity2 = LogoCreateActivity.this;
                i = logoCreateActivity2.abc10019;
                if (i12 >= (i > 3 ? 3 : i)) {
                    break;
                }
                String[] strArr10 = logoCreateActivity2.abc10043;
                if (strArr10 != null) {
                    strArr10[8] = " than yo";
                }
                i12++;
            }
            logoCreateActivity2.abc7 -= 0.6367776f;
            int[] iArr13 = logoCreateActivity2.abc10041;
            if (iArr13 != null) {
                iArr13[9] = 0;
            }
            logoCreateActivity2.abc10019 = Math.abs(i);
            LogoCreateActivity logoCreateActivity30 = LogoCreateActivity.this;
            String[] strArr11 = logoCreateActivity30.abc10015;
            if (strArr11 != null) {
                strArr11[7] = "how gre";
            }
            logoCreateActivity30.createVM.setClippingSelectedIndex(logoCreateActivity30.lastClippingType.intValue());
            if (LogoCreateActivity.this.abc10074.size() > 4) {
                LogoCreateActivity.this.abc10074.add(8);
            }
            if (LogoCreateActivity.this.abc10067.size() > 3) {
                LogoCreateActivity.this.abc10067.add("dull. Mel");
            }
            LogoCreateActivity logoCreateActivity31 = LogoCreateActivity.this;
            if (logoCreateActivity31.abc10077 == null) {
                logoCreateActivity31.abc10077 = new String[10];
            }
            int[] iArr14 = logoCreateActivity31.abc20;
            if (iArr14 != null) {
                iArr14[7] = 0;
                if (logoCreateActivity31.abc10061 == null) {
                    logoCreateActivity31.abc10061 = new int[10];
                }
                int[] iArr15 = logoCreateActivity31.abc10041;
                if (iArr15 != null) {
                    iArr15[2] = 0;
                }
                String[] strArr12 = logoCreateActivity31.abc10077;
                if (strArr12 != null) {
                    strArr12[6] = null;
                }
            }
            logoCreateActivity31.abc10064 = "basis, a";
            logoCreateActivity31.abc10062 = "rted t";
            logoCreateActivity31.abc10063 = 0.017248452f;
            logoCreateActivity31.binding.drawview.m9092m();
            LogoCreateActivity logoCreateActivity32 = LogoCreateActivity.this;
            logoCreateActivity32.abc10029 = !logoCreateActivity32.abc10029;
            logoCreateActivity32.abc10051 = logoCreateActivity32.abc10051 < 0.8806184143242864d ? 0.8683856661854671d : 0.04980730279296475d;
            logoCreateActivity32.abc10068 = 0.6803980533532095d;
            logoCreateActivity32.abc17 += 0.9566515735319008d;
            logoCreateActivity32.abc10027 = ((double) logoCreateActivity32.abc10027) < 0.54721296d ? 0.86829776f : 0.2843967f;
            if (logoCreateActivity32.abc10011.size() < 9) {
                LogoCreateActivity.this.abc10011.add(0);
            }
            LogoCreateActivity logoCreateActivity33 = LogoCreateActivity.this;
            logoCreateActivity33.abc10029 = false;
            logoCreateActivity33.binding.drawview.setClippingState(true);
            LogoCreateActivity logoCreateActivity34 = LogoCreateActivity.this;
            int[] iArr16 = logoCreateActivity34.abc10042;
            if (iArr16 != null) {
                iArr16[1] = 6;
            }
            String[] strArr13 = logoCreateActivity34.abc10077;
            if (strArr13 != null) {
                strArr13[3] = null;
            }
            if (logoCreateActivity34.abc10021 != null) {
                int i13 = 0;
                while (true) {
                    String[] strArr14 = LogoCreateActivity.this.abc10021;
                    if (i13 >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                        break;
                    }
                    strArr14[i13] = "string" + i13;
                    i13++;
                }
            }
            LogoCreateActivity logoCreateActivity35 = LogoCreateActivity.this;
            logoCreateActivity35.abc4 *= 0.48218232f;
            logoCreateActivity35.abc10049 = false;
            if (!TextUtils.isEmpty(logoCreateActivity35.abc10069)) {
                int length3 = LogoCreateActivity.this.abc10069.length();
                LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length3;
            }
            LogoCreateActivity logoCreateActivity36 = LogoCreateActivity.this;
            logoCreateActivity36.abc10063 *= 0.1089772f;
            logoCreateActivity36.createVM.showClippingLayout();
            int i14 = 0;
            while (true) {
                logoCreateActivity3 = LogoCreateActivity.this;
                int i15 = logoCreateActivity3.abc10046;
                if (i15 > 3) {
                    i15 = 3;
                }
                if (i14 >= i15) {
                    break;
                }
                if (logoCreateActivity3.abc10039.size() > 5) {
                    LogoCreateActivity.this.abc10039.add("kind of a ");
                }
                i14++;
            }
            if (logoCreateActivity3.abc10039 == null) {
                logoCreateActivity3.abc10039 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity37 = LogoCreateActivity.this;
            if (logoCreateActivity37.abc10060 == null) {
                logoCreateActivity37.abc10060 = new String[10];
            }
            logoCreateActivity37.abc10 = false;
            logoCreateActivity37.abc10059 = "t an";
            if (logoCreateActivity37.abc10024.size() < 8) {
                LogoCreateActivity.this.abc10024.add(" recei");
            }
            LogoCreateActivity logoCreateActivity38 = LogoCreateActivity.this;
            if (logoCreateActivity38.abc1002 == null) {
                logoCreateActivity38.abc1002 = new int[10];
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$f0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9463f0 implements View.OnClickListener {
        public View$OnClickListenerC9463f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.createVM.setClippingSelectedIndex(1);
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10054 = "aracters ";
            if (logoCreateActivity2.abc10056.size() > 5) {
                LogoCreateActivity.this.abc10056.add(7);
            }
            if (LogoCreateActivity.this.abc10067.size() < 0) {
                LogoCreateActivity.this.abc10067.add(" wri");
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                if (i2 >= logoCreateActivity.abc30) {
                    break;
                }
                logoCreateActivity.abc4 = Math.abs(logoCreateActivity.abc4);
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10030 == null) {
                    logoCreateActivity3.abc10030 = new ArrayList<>();
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10059)) {
                    int length = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc10013 = ((double) logoCreateActivity4.abc10013) > 0.28564852d ? 0.29053545f : 0.69182074f;
                i2++;
            }
            logoCreateActivity.abc1004 = false;
            if (logoCreateActivity.abc10010 == null) {
                logoCreateActivity.abc10010 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10013 *= 0.2055397f;
            logoCreateActivity5.binding.drawview.setClippingType(1);
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10051 = Math.abs(logoCreateActivity6.abc10051);
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc10014 == null) {
                logoCreateActivity7.abc10014 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10063 > 0.5495096d) {
                logoCreateActivity8.abc10063 = 0.044988334f;
            }
            int[] iArr = logoCreateActivity8.abc32;
            if (iArr != null) {
                iArr[9] = 4;
                if (!TextUtils.isEmpty(logoCreateActivity8.abc10064)) {
                    int length2 = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length2;
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.abc10058 = logoCreateActivity9.abc10058 > 0.4982595833420348d ? 0.41932483833146483d : 0.27419181682198634d;
                if (logoCreateActivity9.abc10039.size() < 8) {
                    LogoCreateActivity.this.abc10039.add(", wel");
                }
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity10.abc10021;
            if (strArr != null) {
                strArr[2] = null;
            }
            ArrayList<Integer> arrayList = logoCreateActivity10.abc10056;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10056.remove(0);
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10013 -= 0.9067059f;
            logoCreateActivity11.binding.includeClipping.tvTipsRadius.setVisibility(4);
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity12.abc10023;
            if (strArr2 != null) {
                strArr2[9] = "bly more ";
            }
            logoCreateActivity12.abc10068 = 0.9475389132545563d;
            logoCreateActivity12.abc10027 = 0.4064029f;
            int[] iArr2 = logoCreateActivity12.abc1;
            if (iArr2 != null) {
                iArr2[5] = 7;
                if (strArr2 != null) {
                    strArr2[1] = "piration,";
                }
                if (logoCreateActivity12.abc10031 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr3 = LogoCreateActivity.this.abc10031;
                        if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                            break;
                        }
                        strArr3[i3] = "string" + i3;
                        i3++;
                    }
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                if (logoCreateActivity13.abc10060 == null) {
                    logoCreateActivity13.abc10060 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            logoCreateActivity14.abc1008 = logoCreateActivity14.abc1008 >= 4 ? 6 : 2;
            int[] iArr3 = logoCreateActivity14.abc10047;
            if (iArr3 != null) {
                iArr3[3] = 6;
            }
            logoCreateActivity14.abc1008 = 1;
            logoCreateActivity14.binding.includeClipping.sbClippling.setVisibility(4);
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10014;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10014.remove(0);
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            if (logoCreateActivity15.abc10052 > 0) {
                logoCreateActivity15.abc10052 = 8;
            }
            if (logoCreateActivity15.abc10071 == null) {
                logoCreateActivity15.abc10071 = new String[10];
            }
            String[] strArr4 = logoCreateActivity15.abc36;
            if (strArr4 != null) {
                strArr4[8] = "...兰光宗_";
                logoCreateActivity15.abc10029 = true;
                logoCreateActivity15.abc10020 *= 0.58073086f;
                logoCreateActivity15.abc10026 = ((double) logoCreateActivity15.abc10026) > 0.5020614d ? 0.8948896f : 0.16902268f;
            }
            String[] strArr5 = logoCreateActivity15.abc10015;
            if (strArr5 != null) {
                strArr5[7] = "o";
            }
            logoCreateActivity15.abc10029 = false;
            while (true) {
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                int i4 = logoCreateActivity16.abc10028;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i >= i4) {
                    return;
                }
                logoCreateActivity16.abc10051 = 0.43058376428962086d;
                i++;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$f1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9464f1 implements View.OnClickListener {
        public View$OnClickListenerC9464f1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9111O();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity.abc10077;
            if (strArr != null) {
                strArr[4] = "lize t";
            }
            logoCreateActivity.abc10033 = !logoCreateActivity.abc10033;
            logoCreateActivity.abc1005 -= 6;
            if (logoCreateActivity.abc11.size() > 7) {
                LogoCreateActivity.this.abc11.add("2,323评论");
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc10050 == null) {
                    logoCreateActivity2.abc10050 = new int[10];
                }
                ArrayList<Integer> arrayList = logoCreateActivity2.abc10011;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                ArrayList<String> arrayList2 = LogoCreateActivity.this.abc1003;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc1003.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10028 = 3;
            if (logoCreateActivity3.abc1003 == null) {
                logoCreateActivity3.abc1003 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10034;
            if (arrayList3 != null || arrayList3.size() <= 0) {
                return;
            }
            LogoCreateActivity.this.abc10034.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$f2 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9465f2 implements View.OnClickListener {
        public View$OnClickListenerC9465f2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.m9112N();
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10056 == null) {
                logoCreateActivity2.abc10056 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10065 = !logoCreateActivity3.abc10065;
            logoCreateActivity3.abc10046 = logoCreateActivity3.abc10046 < 2 ? 4 : 2;
            if (logoCreateActivity3.abc0 != null) {
                int i = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity.abc0;
                    if (i >= strArr.length) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                    if (logoCreateActivity4.abc10067 == null) {
                        logoCreateActivity4.abc10067 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                    logoCreateActivity5.abc10058 = -logoCreateActivity5.abc10058;
                    String[] strArr2 = logoCreateActivity5.abc10015;
                    if (strArr2 != null) {
                        strArr2[6] = "nearned";
                    }
                    i++;
                }
                if (logoCreateActivity.abc10018 == null) {
                    logoCreateActivity.abc10018 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10033 = !logoCreateActivity6.abc10033;
                logoCreateActivity6.abc10076 = false;
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10029 = !logoCreateActivity7.abc10029;
            logoCreateActivity7.abc1008 -= 3;
            logoCreateActivity7.abc10013 = 0.18466192f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$g */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9466g implements View.OnClickListener {
        public View$OnClickListenerC9466g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity.this.binding.drawview.setClippingState(false);
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc1007 = 0.59481716f;
            logoCreateActivity3.abc10020 = 0.38043547f;
            if (logoCreateActivity3.abc10017 == null) {
                logoCreateActivity3.abc10017 = new int[10];
            }
            int[] iArr = logoCreateActivity3.abc34;
            if (iArr != null) {
                iArr[0] = 0;
                logoCreateActivity3.abc1007 = ((double) 0.59481716f) > 0.6328406d ? 0.6743485f : 0.1692403f;
                logoCreateActivity3.abc10038 = 0.20733297f;
                logoCreateActivity3.abc10032 = !logoCreateActivity3.abc10032;
            }
            if (!TextUtils.isEmpty(logoCreateActivity3.abc10012)) {
                int length = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10072 = !logoCreateActivity4.abc10072;
            if (logoCreateActivity4.abc10050 == null) {
                logoCreateActivity4.abc10050 = new int[10];
            }
            logoCreateActivity4.binding.drawview.setClippingType(logoCreateActivity4.lastClippingType);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10013 = 0.7783707f;
            logoCreateActivity5.abc10068 = logoCreateActivity5.abc10068 < 0.016515926636908596d ? 0.1007194679472968d : 0.7747306707434557d;
            int[] iArr2 = logoCreateActivity5.abc10045;
            if (iArr2 != null) {
                iArr2[8] = 6;
            }
            if (logoCreateActivity5.abc33 == null) {
                logoCreateActivity5.abc33 = new String[10];
                logoCreateActivity5.abc10033 = !logoCreateActivity5.abc10033;
                if (logoCreateActivity5.abc10024 == null) {
                    logoCreateActivity5.abc10024 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                if (logoCreateActivity6.abc1000 == null) {
                    logoCreateActivity6.abc1000 = new ArrayList<>();
                }
            }
            if (LogoCreateActivity.this.abc10050 != null) {
                int i = 0;
                while (true) {
                    int[] iArr3 = LogoCreateActivity.this.abc10050;
                    if (i >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i] = 5;
                    i++;
                }
            }
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10034;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10034.remove(0);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10027 = -logoCreateActivity7.abc10027;
            logoCreateActivity7.createVM.hideClippingLayout();
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10026 = 0.3606329f;
            ArrayList<String> arrayList2 = logoCreateActivity8.abc10048;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10048.remove(0);
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            int[] iArr4 = logoCreateActivity9.abc10061;
            if (iArr4 != null) {
                iArr4[0] = 0;
            }
            if (logoCreateActivity9.abc33 != null) {
                int i2 = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity2.abc33;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                        int length2 = LogoCreateActivity.this.abc10054.length();
                        LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length2;
                    }
                    LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                    int[] iArr5 = logoCreateActivity10.abc10045;
                    if (iArr5 != null) {
                        iArr5[2] = 5;
                    }
                    int[] iArr6 = logoCreateActivity10.abc10042;
                    if (iArr6 != null) {
                        iArr6[9] = 7;
                    }
                    i2++;
                }
                logoCreateActivity2.abc10013 = 0.03109783f;
                String[] strArr2 = logoCreateActivity2.abc10077;
                if (strArr2 != null) {
                    strArr2[8] = null;
                }
                logoCreateActivity2.abc10026 = 0.81770045f;
            }
            int i3 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i4 = logoCreateActivity.abc1008;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                logoCreateActivity.abc10032 = false;
                i3++;
            }
            int[] iArr7 = logoCreateActivity.abc10047;
            if (iArr7 != null) {
                iArr7[9] = 0;
            }
            logoCreateActivity.abc10020 = Math.abs(logoCreateActivity.abc10020);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$g0 */
    /* loaded from: classes3.dex */
    public class C9467g0 implements ActivityResultCallback<ActivityResult> {
        public C9467g0() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1) {
                try {
                    LogoCreateActivity.this.binding.drawview.setCanvasBackgroundImage(BitmapFactory.decodeStream(LogoCreateActivity.this.getContentResolver().openInputStream(activityResult.getData().getData())));
                } catch (FileNotFoundException e) {
                    e.getMessage();
                }
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$g1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9468g1 implements View.OnClickListener {
        public View$OnClickListenerC9468g1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9115K();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity.abc10043;
            if (strArr != null) {
                strArr[8] = " ";
            }
            logoCreateActivity.abc10046 -= 2;
            ArrayList<Integer> arrayList = logoCreateActivity.abc10074;
            int i = 0;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10074.remove(0);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc38 = 0.8280385499051564d;
            if (logoCreateActivity2.abc10043 != null) {
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10043;
                    if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10046 = 8;
            if (logoCreateActivity3.abc10018.size() > 3) {
                LogoCreateActivity.this.abc10018.add(ReportUtil.f18058a);
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$g2 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9469g2 implements View.OnClickListener {
        public View$OnClickListenerC9469g2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.m9093l();
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10058 = 0.41412994680890847d;
            int[] iArr = logoCreateActivity2.abc10017;
            if (iArr != null) {
                iArr[0] = 0;
            }
            if (logoCreateActivity2.abc10024.size() < 8) {
                LogoCreateActivity.this.abc10024.add(" surprisin");
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc26)) {
                int length = LogoCreateActivity.this.abc26.length();
                if (LogoCreateActivity.this.abc10070.size() < 6) {
                    LogoCreateActivity.this.abc10070.add("asn’t re");
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc1007 += 0.596633f;
                if (logoCreateActivity3.abc10060 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10060;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity.this.abc26 = LogoCreateActivity.this.abc26 + length;
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                    int length2 = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length2;
                }
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int i3 = logoCreateActivity.abc10046;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    logoCreateActivity.abc10064 = "rs than ";
                    i2++;
                }
                ArrayList<Integer> arrayList = logoCreateActivity.abc10010;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10010.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10019 -= 5;
            int[] iArr2 = logoCreateActivity4.abc10047;
            if (iArr2 != null) {
                iArr2[6] = 0;
            }
            if (TextUtils.isEmpty(logoCreateActivity4.abc10012)) {
                return;
            }
            int length3 = LogoCreateActivity.this.abc10012.length();
            LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length3;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$h */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9470h implements View.OnClickListener {
        public View$OnClickListenerC9470h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 0;
            LogoCreateActivity.this.binding.drawview.setClippingState(false);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10036 == null) {
                logoCreateActivity.abc10036 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10071 == null) {
                logoCreateActivity2.abc10071 = new String[10];
            }
            String[] strArr = logoCreateActivity2.abc10057;
            if (strArr != null) {
                strArr[3] = "entu";
            }
            int[] iArr = logoCreateActivity2.abc16;
            if (iArr != null) {
                iArr[2] = 2;
                if (logoCreateActivity2.abc10036.size() < 4) {
                    LogoCreateActivity.this.abc10036.add("nearned r");
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10055 == null) {
                    logoCreateActivity3.abc10055 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10024.size() < 7) {
                    LogoCreateActivity.this.abc10024.add(" with i");
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10054 = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
            ArrayList<Integer> arrayList = logoCreateActivity4.abc10055;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10055.remove(0);
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity5.abc10057;
            if (strArr2 != null) {
                strArr2[8] = "r so";
            }
            logoCreateActivity5.binding.drawview.m9118H();
            if (LogoCreateActivity.this.abc10014.size() < 0) {
                LogoCreateActivity.this.abc10014.add(0);
            }
            ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10048;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10048.remove(0);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10033 = true;
            logoCreateActivity6.abc17 = 0.22250881510773912d;
            logoCreateActivity6.abc10059 = "terary ";
            if (logoCreateActivity6.abc10050 == null) {
                logoCreateActivity6.abc10050 = new int[10];
            }
            logoCreateActivity6.abc10072 = !logoCreateActivity6.abc10072;
            logoCreateActivity6.createVM.hideClippingLayout();
            ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10055;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10055.remove(0);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc10030 == null) {
                logoCreateActivity7.abc10030 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10032 = !logoCreateActivity8.abc10032;
            if (logoCreateActivity8.abc22 == null) {
                logoCreateActivity8.abc22 = new int[10];
                logoCreateActivity8.abc10064 = "ers t";
                logoCreateActivity8.abc10063 *= 0.3526761f;
                String[] strArr3 = logoCreateActivity8.abc10057;
                if (strArr3 != null) {
                    strArr3[2] = null;
                }
            }
            logoCreateActivity8.abc1005 *= 0;
            while (true) {
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                int i2 = logoCreateActivity9.abc10046;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i < i2) {
                    if (logoCreateActivity9.abc10018 == null) {
                        logoCreateActivity9.abc10018 = new ArrayList<>();
                    }
                    i++;
                } else {
                    logoCreateActivity9.abc10029 = true;
                    return;
                }
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$h0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9471h0 implements View.OnClickListener {
        public View$OnClickListenerC9471h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.createVM.setClippingSelectedIndex(2);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10073 == null) {
                logoCreateActivity.abc10073 = new String[10];
            }
            String[] strArr = logoCreateActivity.abc10043;
            if (strArr != null) {
                strArr[9] = null;
            }
            logoCreateActivity.abc10068 = 0.458841261209041d;
            if (logoCreateActivity.abc38 < 0.06476935195454725d) {
                logoCreateActivity.abc38 = 0.9574986626776716d;
                logoCreateActivity.abc10026 *= 0.6616162f;
                if (logoCreateActivity.abc10014.size() < 0) {
                    LogoCreateActivity.this.abc10014.add(1);
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc10074 == null) {
                    logoCreateActivity2.abc10074 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10040 = !logoCreateActivity3.abc10040;
            ArrayList<String> arrayList = logoCreateActivity3.abc10048;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10048.remove(0);
            }
            if (LogoCreateActivity.this.abc10017 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10017;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 5;
                    i++;
                }
            }
            LogoCreateActivity.this.binding.drawview.setClippingType(2);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10071 == null) {
                logoCreateActivity4.abc10071 = new String[10];
            }
            logoCreateActivity4.abc1007 = -logoCreateActivity4.abc1007;
            logoCreateActivity4.abc10051 *= 0.39135228081595375d;
            if (logoCreateActivity4.abc25 == null) {
                logoCreateActivity4.abc25 = new String[10];
                String[] strArr2 = logoCreateActivity4.abc10015;
                if (strArr2 != null) {
                    strArr2[0] = " receiv";
                }
                logoCreateActivity4.abc10066 = 0.8174535f;
                if (logoCreateActivity4.abc1003 == null) {
                    logoCreateActivity4.abc1003 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity5.abc10050;
            if (iArr2 != null) {
                iArr2[2] = 0;
            }
            logoCreateActivity5.abc10072 = !logoCreateActivity5.abc10072;
            logoCreateActivity5.abc10019 *= 2;
            logoCreateActivity5.binding.includeClipping.tvTipsRadius.setVisibility(4);
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10058 *= 0.9100896496916617d;
            logoCreateActivity6.abc10029 = true;
            if (logoCreateActivity6.abc10030 == null) {
                logoCreateActivity6.abc10030 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc4 = Math.abs(logoCreateActivity7.abc4);
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10012 = "or";
            logoCreateActivity8.abc10020 = ((double) logoCreateActivity8.abc10020) > 0.031212866d ? 0.25632447f : 0.2810229f;
            if (logoCreateActivity8.abc10070 == null) {
                logoCreateActivity8.abc10070 = new ArrayList<>();
            }
            LogoCreateActivity.this.binding.includeClipping.sbClippling.setVisibility(4);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity9.abc10023;
            if (strArr3 != null) {
                strArr3[5] = "eing, we";
            }
            if (!TextUtils.isEmpty(logoCreateActivity9.abc10062)) {
                int length = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
            }
            if (LogoCreateActivity.this.abc10014.size() > 4) {
                LogoCreateActivity.this.abc10014.add(4);
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc14 = 0.40380100409097786d;
            if (logoCreateActivity10.abc10051 < 0.14780264600008453d) {
                logoCreateActivity10.abc10051 = 0.25599935695087017d;
            }
            String[] strArr4 = logoCreateActivity10.abc10022;
            if (strArr4 != null) {
                strArr4[3] = "de a";
            }
            if (logoCreateActivity10.abc10050 == null) {
                logoCreateActivity10.abc10050 = new int[10];
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$h1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9472h1 implements View.OnClickListener {
        public View$OnClickListenerC9472h1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.m9116J();
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                int length = LogoCreateActivity.this.abc10064.length();
                LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int i = 0;
            logoCreateActivity2.abc10065 = false;
            if (logoCreateActivity2.abc10034 == null) {
                logoCreateActivity2.abc10034 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc36 != null) {
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity.abc36;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    String[] strArr2 = logoCreateActivity3.abc10016;
                    if (strArr2 != null) {
                        strArr2[4] = "sing onl";
                    }
                    if (logoCreateActivity3.abc10027 < 0.61153686d) {
                        logoCreateActivity3.abc10027 = 0.7295559f;
                    }
                    String[] strArr3 = logoCreateActivity3.abc10023;
                    if (strArr3 != null) {
                        strArr3[5] = " model f";
                    }
                    i2++;
                }
                ArrayList<Integer> arrayList = logoCreateActivity.abc10056;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10056.remove(0);
                }
                ArrayList<String> arrayList2 = LogoCreateActivity.this.abc1003;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc1003.remove(0);
                }
                if (LogoCreateActivity.this.abc10037.size() > 6) {
                    LogoCreateActivity.this.abc10037.add(8);
                }
            }
            if (LogoCreateActivity.this.abc10030.size() > 3) {
                LogoCreateActivity.this.abc10030.add(8);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10054 = "d t";
            if (logoCreateActivity4.abc10042 == null) {
                return;
            }
            while (true) {
                int[] iArr = LogoCreateActivity.this.abc10042;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    return;
                }
                iArr[i] = 2;
                i++;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$h2 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9473h2 implements View.OnClickListener {
        public View$OnClickListenerC9473h2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9113M();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10035 = true;
            logoCreateActivity.abc10076 = !logoCreateActivity.abc10076;
            int i = 0;
            logoCreateActivity.abc10065 = false;
            if (logoCreateActivity.abc27 < 0.8245954425394699d) {
                logoCreateActivity.abc27 = 0.5682766550337119d;
                if (logoCreateActivity.abc10060 == null) {
                    logoCreateActivity.abc10060 = new String[10];
                }
                if (logoCreateActivity.abc10017 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10017;
                        if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i2] = 1;
                        i2++;
                    }
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                    int length = LogoCreateActivity.this.abc10062.length();
                    LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
                }
            }
            if (LogoCreateActivity.this.abc10021 != null) {
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10021;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10040 = true ^ logoCreateActivity2.abc10040;
            if (logoCreateActivity2.abc10048 == null) {
                logoCreateActivity2.abc10048 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$i */
    /* loaded from: classes3.dex */
    public class C9474i implements TextWatcher {
        public C9474i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LogoCreateActivity.this.binding.drawview.setText(editable.toString());
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10010 == null) {
                logoCreateActivity.abc10010 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10024.size() > 9) {
                LogoCreateActivity.this.abc10024.add("nk. For a");
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity2.abc10045;
            if (iArr != null) {
                iArr[0] = 7;
            }
            logoCreateActivity2.abc27 = Math.abs(logoCreateActivity2.abc27);
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity3.abc10017;
            if (iArr2 != null) {
                iArr2[3] = 0;
            }
            ArrayList<String> arrayList = logoCreateActivity3.abc10048;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10048.remove(0);
            }
            if (LogoCreateActivity.this.abc10037.size() > 7) {
                LogoCreateActivity.this.abc10037.add(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$i0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9475i0 implements View.OnClickListener {
        public View$OnClickListenerC9475i0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.createVM.setClippingSelectedIndex(3);
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10052 *= 7;
            String[] strArr = logoCreateActivity2.abc10060;
            if (strArr != null) {
                strArr[8] = " novels.";
            }
            String[] strArr2 = logoCreateActivity2.abc10073;
            if (strArr2 != null) {
                strArr2[3] = " the n";
            }
            if (logoCreateActivity2.abc25 != null) {
                int i = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    String[] strArr3 = logoCreateActivity.abc25;
                    if (i >= strArr3.length) {
                        break;
                    }
                    strArr3[i] = "string" + i;
                    ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10030;
                    if (arrayList == null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10030.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    int[] iArr = logoCreateActivity3.abc10050;
                    if (iArr != null) {
                        iArr[2] = 1;
                    }
                    if (logoCreateActivity3.abc10021 != null) {
                        int i2 = 0;
                        while (true) {
                            String[] strArr4 = LogoCreateActivity.this.abc10021;
                            if (i2 < (strArr4.length > 3 ? 3 : strArr4.length)) {
                                strArr4[i2] = "string" + i2;
                                i2++;
                            }
                        }
                    }
                    i++;
                }
                logoCreateActivity.abc10027 -= 0.70606357f;
                if (logoCreateActivity.abc10050 == null) {
                    logoCreateActivity.abc10050 = new int[10];
                }
                if (!TextUtils.isEmpty(logoCreateActivity.abc10012)) {
                    int length = LogoCreateActivity.this.abc10012.length();
                    LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10068 = Math.abs(logoCreateActivity4.abc10068);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10063 = Math.abs(logoCreateActivity5.abc10063);
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc10039 == null) {
                logoCreateActivity6.abc10039 = new ArrayList<>();
            }
            LogoCreateActivity.this.binding.drawview.setClippingType(3);
            if (LogoCreateActivity.this.abc10078.size() < 2) {
                LogoCreateActivity.this.abc10078.add(1);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            String[] strArr5 = logoCreateActivity7.abc10057;
            if (strArr5 != null) {
                strArr5[3] = "ernit";
            }
            if (logoCreateActivity7.abc10025 < 0.76857966d) {
                logoCreateActivity7.abc10025 = 0.42618716f;
            }
            logoCreateActivity7.abc10 = !logoCreateActivity7.abc10;
            logoCreateActivity7.abc10032 = true;
            if (logoCreateActivity7.abc10018.size() > 3) {
                LogoCreateActivity.this.abc10018.add("cte");
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10014 == null) {
                logoCreateActivity8.abc10014 = new ArrayList<>();
            }
            ActivityCreateBinding activityCreateBinding = LogoCreateActivity.this.binding;
            activityCreateBinding.includeClipping.sbClippling.setProgress(activityCreateBinding.drawview.getClippingCurrentRadius());
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10056;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10056.remove(0);
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc1004 = !logoCreateActivity9.abc1004;
            logoCreateActivity9.abc10054 = " reputati";
            logoCreateActivity9.abc26 = "使用简洁build";
            if (logoCreateActivity9.abc10077 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr6 = LogoCreateActivity.this.abc10077;
                    if (i3 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i3] = "string" + i3;
                    i3++;
                }
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                int length2 = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc10028 = 2;
            ActivityCreateBinding activityCreateBinding2 = logoCreateActivity10.binding;
            activityCreateBinding2.includeClipping.sbClippling.setMax(activityCreateBinding2.drawview.getClippingMaxRadius());
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10063 = 0.34689218f;
            logoCreateActivity11.abc10076 = false;
            logoCreateActivity11.abc10029 = !logoCreateActivity11.abc10029;
            if (logoCreateActivity11.abc9 == null) {
                logoCreateActivity11.abc9 = new ArrayList<>();
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10052 = 2;
                if (logoCreateActivity12.abc10057 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr7 = LogoCreateActivity.this.abc10057;
                        if (i4 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i4] = "string" + i4;
                        i4++;
                    }
                }
                int[] iArr2 = LogoCreateActivity.this.abc10041;
                if (iArr2 != null) {
                    iArr2[0] = 1;
                }
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            if (logoCreateActivity13.abc10070 == null) {
                logoCreateActivity13.abc10070 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10060 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr8 = LogoCreateActivity.this.abc10060;
                    if (i5 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                        break;
                    }
                    strArr8[i5] = "string" + i5;
                    i5++;
                }
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            String[] strArr9 = logoCreateActivity14.abc10073;
            if (strArr9 != null) {
                strArr9[0] = " plot and ";
            }
            logoCreateActivity14.binding.includeClipping.tvTipsRadius.setVisibility(0);
            if (LogoCreateActivity.this.abc10045 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr3 = LogoCreateActivity.this.abc10045;
                    if (i6 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i6] = 3;
                    i6++;
                }
            }
            if (LogoCreateActivity.this.abc10070.size() < 2) {
                LogoCreateActivity.this.abc10070.add("ty is s");
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            int[] iArr4 = logoCreateActivity15.abc10042;
            if (iArr4 != null) {
                iArr4[4] = 8;
            }
            logoCreateActivity15.abc38 = logoCreateActivity15.abc38 < 0.06994358662790323d ? 0.5402850994363195d : 0.05690284187321615d;
            logoCreateActivity15.abc10072 = false;
            String[] strArr10 = logoCreateActivity15.abc10043;
            if (strArr10 != null) {
                strArr10[7] = " mod";
            }
            if (logoCreateActivity15.abc1003 == null) {
                logoCreateActivity15.abc1003 = new ArrayList<>();
            }
            LogoCreateActivity.this.binding.includeClipping.sbClippling.setVisibility(0);
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            logoCreateActivity16.abc10052 += 0;
            logoCreateActivity16.abc10049 = true;
            if (logoCreateActivity16.abc10034 == null) {
                logoCreateActivity16.abc10034 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            logoCreateActivity17.abc12 = 0.1329444f;
            logoCreateActivity17.abc10049 = true;
            logoCreateActivity17.abc10035 = false;
            if (TextUtils.isEmpty(logoCreateActivity17.abc10069)) {
                return;
            }
            int length3 = LogoCreateActivity.this.abc10069.length();
            LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length3;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$i1 */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC9476i1 implements View.OnTouchListener {
        public View$OnTouchListenerC9476i1() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            int action = motionEvent.getAction();
            if (action == 0) {
                LogoCreateActivity.this.binding.drawview.m9092m();
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10033 = false;
                logoCreateActivity3.abc10058 += 0.20919838971630755d;
                logoCreateActivity3.abc10026 = 0.030207157f;
                if (!TextUtils.isEmpty(logoCreateActivity3.abc26)) {
                    int length = LogoCreateActivity.this.abc26.length();
                    LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity4.abc10023;
                    if (strArr != null) {
                        strArr[0] = "i";
                    }
                    logoCreateActivity4.abc10054 = "ing st";
                    logoCreateActivity4.abc10051 = logoCreateActivity4.abc10051 > 0.040394443168079386d ? 0.3155135349696039d : 0.3582239815686057d;
                    logoCreateActivity4.abc26 = LogoCreateActivity.this.abc26 + length;
                    LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                    if (logoCreateActivity5.abc10060 == null) {
                        logoCreateActivity5.abc10060 = new String[10];
                    }
                    logoCreateActivity5.abc10028 = 7;
                    ArrayList<String> arrayList = logoCreateActivity5.abc10067;
                    if (arrayList != null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10067.remove(0);
                    }
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                    int length2 = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length2;
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                    int length3 = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length3;
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                    int length4 = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length4;
                }
            } else if (action == 1) {
                LogoCreateActivity.this.stopMove = true;
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc1005 = -logoCreateActivity6.abc1005;
                ArrayList<String> arrayList2 = logoCreateActivity6.abc10039;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10039.remove(0);
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc10064 = "s are";
                if (logoCreateActivity7.abc6 != null) {
                    int i = 0;
                    while (true) {
                        logoCreateActivity2 = LogoCreateActivity.this;
                        int[] iArr = logoCreateActivity2.abc6;
                        if (i >= iArr.length) {
                            break;
                        }
                        iArr[i] = 1;
                        logoCreateActivity2.abc10065 = true;
                        logoCreateActivity2.abc10046 -= 7;
                        logoCreateActivity2.abc10059 = "and mo";
                        i++;
                    }
                    logoCreateActivity2.abc10052 = 8;
                    int[] iArr2 = logoCreateActivity2.abc10045;
                    if (iArr2 != null) {
                        iArr2[8] = 9;
                    }
                    ArrayList<Integer> arrayList3 = logoCreateActivity2.abc10010;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc10010.remove(0);
                    }
                }
                if (LogoCreateActivity.this.abc10075 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr2 = LogoCreateActivity.this.abc10075;
                        if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i2] = "string" + i2;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity8.abc10015;
                if (strArr3 != null) {
                    strArr3[0] = "s novel ";
                }
                if (!TextUtils.isEmpty(logoCreateActivity8.abc10064)) {
                    int length5 = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length5;
                }
                LogoCreateActivity.this.binding.drawview.m9118H();
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.abc10029 = !logoCreateActivity9.abc10029;
                String[] strArr4 = logoCreateActivity9.abc10031;
                if (strArr4 != null) {
                    strArr4[2] = null;
                }
                String[] strArr5 = logoCreateActivity9.abc10021;
                if (strArr5 != null) {
                    strArr5[2] = null;
                }
                logoCreateActivity9.abc10 = !logoCreateActivity9.abc10;
                logoCreateActivity9.abc1007 = 0.7372285f;
                ArrayList<String> arrayList4 = logoCreateActivity9.abc10070;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10070.remove(0);
                }
                String[] strArr6 = LogoCreateActivity.this.abc10057;
                if (strArr6 != null) {
                    strArr6[7] = "osetta Sto";
                }
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity10.abc10050;
            if (iArr3 != null) {
                iArr3[2] = 0;
            }
            if (logoCreateActivity10.abc10016 == null) {
                logoCreateActivity10.abc10016 = new String[10];
            }
            ArrayList<String> arrayList5 = logoCreateActivity10.abc10039;
            if (arrayList5 != null && arrayList5.size() > 0) {
                LogoCreateActivity.this.abc10039.remove(0);
            }
            if (LogoCreateActivity.this.abc22 != null) {
                int i3 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr4 = logoCreateActivity.abc22;
                    if (i3 >= iArr4.length) {
                        break;
                    }
                    iArr4[i3] = 3;
                    String[] strArr7 = logoCreateActivity.abc10015;
                    if (strArr7 != null) {
                        strArr7[5] = "ion, ba";
                    }
                    String[] strArr8 = logoCreateActivity.abc10021;
                    if (strArr8 != null) {
                        strArr8[9] = ReportUtil.f18058a;
                    }
                    if (logoCreateActivity.abc10014.size() < 6) {
                        LogoCreateActivity.this.abc10014.add(7);
                    }
                    i3++;
                }
                logoCreateActivity.abc10076 = !logoCreateActivity.abc10076;
                logoCreateActivity.abc10013 = 0.9468706f;
                ArrayList<Integer> arrayList6 = logoCreateActivity.abc10037;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10046 *= 5;
            if (logoCreateActivity11.abc10018 == null) {
                logoCreateActivity11.abc10018 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10031 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr9 = LogoCreateActivity.this.abc10031;
                    if (i4 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                        break;
                    }
                    strArr9[i4] = "string" + i4;
                    i4++;
                }
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$i2 */
    /* loaded from: classes3.dex */
    public class RunnableC9477i2 implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f15692a;

        /* renamed from: b */
        public final /* synthetic */ int f15693b;

        public RunnableC9477i2(int i, int i2) {
            this.f15692a = i;
            this.f15693b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogoCreateActivity.this.binding.drawview.m9122D(this.f15692a, this.f15693b);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10072 = false;
            String[] strArr = logoCreateActivity.abc10073;
            if (strArr != null) {
                strArr[7] = null;
            }
            if (!TextUtils.isEmpty(logoCreateActivity.abc10012)) {
                int length = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc2 == null) {
                logoCreateActivity2.abc2 = new ArrayList<>();
                if (LogoCreateActivity.this.abc10018.size() > 6) {
                    LogoCreateActivity.this.abc10018.add(" publ");
                }
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10055;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10055.remove(0);
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10025 > 0.6688743d) {
                    logoCreateActivity3.abc10025 = 0.6375712f;
                }
            }
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10011;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10011.remove(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10072 = false;
            int[] iArr = logoCreateActivity4.abc1002;
            if (iArr != null) {
                iArr[1] = 0;
            }
            if (!logoCreateActivity4.stopMove) {
                LogoCreateActivity.this.startMove(this.f15692a, this.f15693b);
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                String[] strArr2 = logoCreateActivity5.abc10023;
                if (strArr2 != null) {
                    strArr2[6] = "ve";
                }
                logoCreateActivity5.abc10033 = !logoCreateActivity5.abc10033;
                logoCreateActivity5.abc1007 = ((double) logoCreateActivity5.abc1007) < 0.70973325d ? 0.582686f : 0.44210786f;
                logoCreateActivity5.abc24 = 0.4673692840426492d;
                ArrayList<Integer> arrayList3 = logoCreateActivity5.abc10014;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10014.remove(0);
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc1007 += 0.9290828f;
                int[] iArr2 = logoCreateActivity6.abc10017;
                if (iArr2 != null) {
                    iArr2[7] = 0;
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc10050 == null) {
                logoCreateActivity7.abc10050 = new int[10];
            }
            if (logoCreateActivity7.abc10056.size() < 2) {
                LogoCreateActivity.this.abc10056.add(5);
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity8.abc10050;
            if (iArr3 != null) {
                iArr3[8] = 4;
            }
            if (!TextUtils.isEmpty(logoCreateActivity8.abc29)) {
                int length2 = LogoCreateActivity.this.abc29.length();
                if (LogoCreateActivity.this.abc10016 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr3 = LogoCreateActivity.this.abc10016;
                        if (i >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                            break;
                        }
                        strArr3[i] = "string" + i;
                        i++;
                    }
                }
                if (LogoCreateActivity.this.abc1002 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr4 = LogoCreateActivity.this.abc1002;
                        if (i2 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i2] = 7;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.abc1004 = !logoCreateActivity9.abc1004;
                logoCreateActivity9.abc29 = LogoCreateActivity.this.abc29 + length2;
                ArrayList<String> arrayList4 = LogoCreateActivity.this.abc10036;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10036.remove(0);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                logoCreateActivity10.abc10052 *= 1;
                logoCreateActivity10.abc10032 = true;
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10035 = !logoCreateActivity11.abc10035;
            int[] iArr5 = logoCreateActivity11.abc10042;
            if (iArr5 != null) {
                iArr5[1] = 0;
            }
            logoCreateActivity11.abc10020 = 0.18712491f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$j */
    /* loaded from: classes3.dex */
    public class View$OnFocusChangeListenerC9478j implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC9478j() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            int i = 0;
            if (z) {
                LogoCreateActivity.this.imm.showSoftInput(LogoCreateActivity.this.binding.etInput, 2);
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc10027 = -logoCreateActivity5.abc10027;
                if (logoCreateActivity5.abc10037 == null) {
                    logoCreateActivity5.abc10037 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                String[] strArr = logoCreateActivity6.abc10075;
                if (strArr != null) {
                    strArr[6] = null;
                }
                if (logoCreateActivity6.abc22 != null) {
                    int i2 = 0;
                    while (true) {
                        logoCreateActivity4 = LogoCreateActivity.this;
                        int[] iArr = logoCreateActivity4.abc22;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        iArr[i2] = 8;
                        logoCreateActivity4.abc10025 = Math.abs(logoCreateActivity4.abc10025);
                        LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                        int[] iArr2 = logoCreateActivity7.abc10042;
                        if (iArr2 != null) {
                            iArr2[8] = 0;
                        }
                        if (logoCreateActivity7.abc10034 == null) {
                            logoCreateActivity7.abc10034 = new ArrayList<>();
                        }
                        i2++;
                    }
                    ArrayList<Integer> arrayList = logoCreateActivity4.abc10014;
                    if (arrayList == null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10014.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                    if (logoCreateActivity8.abc10014 == null) {
                        logoCreateActivity8.abc10014 = new ArrayList<>();
                    }
                    LogoCreateActivity.this.abc10020 -= 0.030580223f;
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                String[] strArr2 = logoCreateActivity9.abc10071;
                if (strArr2 != null) {
                    strArr2[1] = "ta S";
                }
                if (logoCreateActivity9.abc10057 == null) {
                    logoCreateActivity9.abc10057 = new String[10];
                }
                if (logoCreateActivity9.abc10060 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr3 = LogoCreateActivity.this.abc10060;
                        if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                            break;
                        }
                        strArr3[i3] = "string" + i3;
                        i3++;
                    }
                }
                LogoCreateActivity.this.imm.toggleSoftInput(2, 1);
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                String[] strArr4 = logoCreateActivity10.abc10031;
                if (strArr4 != null) {
                    strArr4[9] = "19th centu";
                }
                logoCreateActivity10.abc10052 = -logoCreateActivity10.abc10052;
                logoCreateActivity10.abc10029 = false;
                ArrayList<String> arrayList2 = logoCreateActivity10.abc11;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc11.remove(0);
                    LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                    logoCreateActivity11.abc10046 -= 4;
                    ArrayList<String> arrayList3 = logoCreateActivity11.abc10036;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc10036.remove(0);
                    }
                    if (LogoCreateActivity.this.abc1002 != null) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr3 = LogoCreateActivity.this.abc1002;
                            if (i4 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                                break;
                            }
                            iArr3[i4] = 4;
                            i4++;
                        }
                    }
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10025 = -logoCreateActivity12.abc10025;
                logoCreateActivity12.abc10035 = !logoCreateActivity12.abc10035;
                if (!TextUtils.isEmpty(logoCreateActivity12.abc10059)) {
                    int length = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
                }
            } else {
                LogoCreateActivity.this.imm.hideSoftInputFromWindow(LogoCreateActivity.this.getWindow().getDecorView().getWindowToken(), 0);
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                logoCreateActivity13.abc1008 = 7;
                ArrayList<String> arrayList4 = logoCreateActivity13.abc10024;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10024.remove(0);
                }
                if (LogoCreateActivity.this.abc10045 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr4 = LogoCreateActivity.this.abc10045;
                        if (i5 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i5] = 9;
                        i5++;
                    }
                }
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                String[] strArr5 = logoCreateActivity14.abc0;
                if (strArr5 != null) {
                    strArr5[6] = null;
                    String[] strArr6 = logoCreateActivity14.abc10057;
                    if (strArr6 != null) {
                        strArr6[9] = null;
                    }
                    if (logoCreateActivity14.abc10073 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr7 = LogoCreateActivity.this.abc10073;
                            if (i6 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                                break;
                            }
                            strArr7[i6] = "string" + i6;
                            i6++;
                        }
                    }
                    LogoCreateActivity.this.abc10038 = 0.81341434f;
                }
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                logoCreateActivity15.abc10038 = 0.79520184f;
                if (logoCreateActivity15.abc10034.size() < 3) {
                    LogoCreateActivity.this.abc10034.add(9);
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                logoCreateActivity16.abc10019 = logoCreateActivity16.abc10019 > 3 ? 3 : 0;
                if (logoCreateActivity16.binding.drawview.m9079z()) {
                    LogoCreateActivity.this.dealTextStyle();
                    if (LogoCreateActivity.this.abc1000.size() < 5) {
                        LogoCreateActivity.this.abc1000.add(4);
                    }
                    LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                    logoCreateActivity17.abc10013 = 0.15166098f;
                    logoCreateActivity17.abc10026 *= 0.9783234f;
                    if (logoCreateActivity17.abc13 != null) {
                        int i7 = 0;
                        while (true) {
                            logoCreateActivity2 = LogoCreateActivity.this;
                            int[] iArr5 = logoCreateActivity2.abc13;
                            if (i7 >= iArr5.length) {
                                break;
                            }
                            iArr5[i7] = 8;
                            String[] strArr8 = logoCreateActivity2.abc10060;
                            if (strArr8 != null) {
                                strArr8[3] = "ow great i";
                            }
                            if (logoCreateActivity2.abc10030 == null) {
                                logoCreateActivity2.abc10030 = new ArrayList<>();
                            }
                            int[] iArr6 = LogoCreateActivity.this.abc10017;
                            if (iArr6 != null) {
                                iArr6[8] = 4;
                            }
                            i7++;
                        }
                        logoCreateActivity2.abc10049 = !logoCreateActivity2.abc10049;
                        if (logoCreateActivity2.abc10073 != null) {
                            int i8 = 0;
                            while (true) {
                                String[] strArr9 = LogoCreateActivity.this.abc10073;
                                if (i8 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                                    break;
                                }
                                strArr9[i8] = "string" + i8;
                                i8++;
                            }
                        }
                        LogoCreateActivity.this.abc10072 = false;
                    }
                    LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                    logoCreateActivity18.abc10038 *= 0.16114819f;
                    logoCreateActivity18.abc10027 = -logoCreateActivity18.abc10027;
                    if (logoCreateActivity18.abc1000.size() > 1) {
                        LogoCreateActivity.this.abc1000.add(0);
                    }
                    LogoCreateActivity.this.createVM.showTextLayout();
                    if (LogoCreateActivity.this.abc1002 != null) {
                        int i9 = 0;
                        while (true) {
                            int[] iArr7 = LogoCreateActivity.this.abc1002;
                            if (i9 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                                break;
                            }
                            iArr7[i9] = 0;
                            i9++;
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        int i11 = logoCreateActivity.abc10046;
                        if (i11 > 3) {
                            i11 = 3;
                        }
                        if (i10 >= i11) {
                            break;
                        }
                        String[] strArr10 = logoCreateActivity.abc10073;
                        if (strArr10 != null) {
                            strArr10[1] = "is k";
                        }
                        i10++;
                    }
                    if (logoCreateActivity.abc10018.size() > 1) {
                        LogoCreateActivity.this.abc10018.add("nd the neg");
                    }
                    ArrayList<String> arrayList5 = LogoCreateActivity.this.abc21;
                    if (arrayList5 != null && arrayList5.size() > 0) {
                        LogoCreateActivity.this.abc21.remove(0);
                        LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                        if (logoCreateActivity19.abc10037 == null) {
                            logoCreateActivity19.abc10037 = new ArrayList<>();
                        }
                        LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                        String[] strArr11 = logoCreateActivity20.abc10023;
                        if (strArr11 != null) {
                            strArr11[5] = "s defi";
                        }
                        if (logoCreateActivity20.abc10073 != null) {
                            int i12 = 0;
                            while (true) {
                                String[] strArr12 = LogoCreateActivity.this.abc10073;
                                if (i12 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                                    break;
                                }
                                strArr12[i12] = "string" + i12;
                                i12++;
                            }
                        }
                    }
                    LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                    logoCreateActivity21.abc1007 = ((double) logoCreateActivity21.abc1007) < 0.36410415d ? 0.7624152f : 0.49407804f;
                    int[] iArr8 = logoCreateActivity21.abc10042;
                    if (iArr8 != null) {
                        iArr8[2] = 2;
                    }
                    logoCreateActivity21.abc10051 = Math.abs(logoCreateActivity21.abc10051);
                }
                if (LogoCreateActivity.this.abc10041 != null) {
                    int i13 = 0;
                    while (true) {
                        int[] iArr9 = LogoCreateActivity.this.abc10041;
                        if (i13 >= (iArr9.length > 3 ? 3 : iArr9.length)) {
                            break;
                        }
                        iArr9[i13] = 0;
                        i13++;
                    }
                }
                LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                if (logoCreateActivity22.abc10028 > 0) {
                    logoCreateActivity22.abc10028 = 9;
                }
                logoCreateActivity22.abc10013 = 0.562263f;
                String[] strArr13 = logoCreateActivity22.abc31;
                if (strArr13 != null) {
                    strArr13[8] = "），近两年在";
                    if (logoCreateActivity22.abc10075 != null) {
                        int i14 = 0;
                        while (true) {
                            String[] strArr14 = LogoCreateActivity.this.abc10075;
                            if (i14 >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                                break;
                            }
                            strArr14[i14] = "string" + i14;
                            i14++;
                        }
                    }
                    if (LogoCreateActivity.this.abc10043 != null) {
                        int i15 = 0;
                        while (true) {
                            String[] strArr15 = LogoCreateActivity.this.abc10043;
                            if (i15 >= (strArr15.length > 3 ? 3 : strArr15.length)) {
                                break;
                            }
                            strArr15[i15] = "string" + i15;
                            i15++;
                        }
                    }
                    LogoCreateActivity.this.abc10063 = 0.84029055f;
                }
                LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                if (logoCreateActivity23.abc10074 == null) {
                    logoCreateActivity23.abc10074 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                logoCreateActivity24.abc10026 = ((double) logoCreateActivity24.abc10026) > 0.4743349d ? 0.7289399f : 0.5214781f;
                logoCreateActivity24.abc10072 = !logoCreateActivity24.abc10072;
            }
            LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
            if (logoCreateActivity25.abc10039 == null) {
                logoCreateActivity25.abc10039 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                int length2 = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
            }
            LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
            if (logoCreateActivity26.abc10068 < 0.8029031233961285d) {
                logoCreateActivity26.abc10068 = 0.26489819239089274d;
            }
            if (logoCreateActivity26.abc20 != null) {
                int i16 = 0;
                while (true) {
                    logoCreateActivity3 = LogoCreateActivity.this;
                    int[] iArr10 = logoCreateActivity3.abc20;
                    if (i16 >= iArr10.length) {
                        break;
                    }
                    iArr10[i16] = 5;
                    if (logoCreateActivity3.abc10016 == null) {
                        logoCreateActivity3.abc10016 = new String[10];
                    }
                    if (logoCreateActivity3.abc10010 == null) {
                        logoCreateActivity3.abc10010 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                    if (logoCreateActivity27.abc10023 == null) {
                        logoCreateActivity27.abc10023 = new String[10];
                    }
                    i16++;
                }
                logoCreateActivity3.abc10064 = "at";
                logoCreateActivity3.abc1004 = false;
                if (logoCreateActivity3.abc10047 == null) {
                    logoCreateActivity3.abc10047 = new int[10];
                }
            }
            if (LogoCreateActivity.this.abc10016 != null) {
                while (true) {
                    String[] strArr16 = LogoCreateActivity.this.abc10016;
                    if (i >= (strArr16.length > 3 ? 3 : strArr16.length)) {
                        break;
                    }
                    strArr16[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
            logoCreateActivity28.abc1008 = 2;
            logoCreateActivity28.abc10032 = !logoCreateActivity28.abc10032;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$j0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9479j0 implements View.OnClickListener {
        public View$OnClickListenerC9479j0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.createVM.setClippingSelectedIndex(4);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10023 == null) {
                logoCreateActivity.abc10023 = new String[10];
            }
            String[] strArr = logoCreateActivity.abc1001;
            if (strArr != null) {
                strArr[4] = null;
            }
            logoCreateActivity.abc10019 = logoCreateActivity.abc10019 < 5 ? 1 : 4;
            if (logoCreateActivity.abc35 == null) {
                logoCreateActivity.abc35 = new ArrayList<>();
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc10027 > 0.67938465d) {
                    logoCreateActivity2.abc10027 = 0.9978014f;
                }
                if (logoCreateActivity2.abc10017 == null) {
                    logoCreateActivity2.abc10017 = new int[10];
                }
                logoCreateActivity2.abc10072 = !logoCreateActivity2.abc10072;
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc1002 == null) {
                logoCreateActivity3.abc1002 = new int[10];
            }
            logoCreateActivity3.abc10062 = "mod";
            ArrayList<Integer> arrayList = logoCreateActivity3.abc10010;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            LogoCreateActivity.this.binding.drawview.setClippingType(4);
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                int length = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity4.abc10047;
            if (iArr != null) {
                iArr[5] = 8;
            }
            if (logoCreateActivity4.abc10042 == null) {
                logoCreateActivity4.abc10042 = new int[10];
            }
            logoCreateActivity4.abc14 = logoCreateActivity4.abc14 < 0.6576968725255573d ? 0.2616744179763686d : 0.8406779810859647d;
            if (logoCreateActivity4.abc10048 == null) {
                logoCreateActivity4.abc10048 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc10074 == null) {
                logoCreateActivity5.abc10074 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc1008 *= 3;
            logoCreateActivity6.binding.includeClipping.tvTipsRadius.setVisibility(4);
            if (LogoCreateActivity.this.abc10047 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc10047;
                    if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i] = 2;
                    i++;
                }
            }
            ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10036;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10036.remove(0);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10064 = "terary";
            logoCreateActivity7.abc39 = logoCreateActivity7.abc39 > 9 ? 7 : 1;
            ArrayList<String> arrayList3 = logoCreateActivity7.abc10070;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10070.remove(0);
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10038 = 0.97032356f;
            logoCreateActivity8.abc10012 = "ary ";
            logoCreateActivity8.binding.includeClipping.sbClippling.setVisibility(4);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10026 += 0.524991f;
            ArrayList<Integer> arrayList4 = logoCreateActivity9.abc10011;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc10011.remove(0);
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity10.abc10047;
            if (iArr3 != null) {
                iArr3[2] = 8;
            }
            if (logoCreateActivity10.abc8.size() > 9) {
                LogoCreateActivity.this.abc8.add("rMode(Blur");
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc10025 = ((double) logoCreateActivity11.abc10025) > 0.9380751d ? 0.12140411f : 0.025565803f;
                logoCreateActivity11.abc10035 = !logoCreateActivity11.abc10035;
                ArrayList<Integer> arrayList5 = logoCreateActivity11.abc10014;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10014.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc10026 = -logoCreateActivity12.abc10026;
            ArrayList<Integer> arrayList6 = logoCreateActivity12.abc10011;
            if (arrayList6 == null && arrayList6.size() > 0) {
                LogoCreateActivity.this.abc10011.remove(0);
            }
            String[] strArr2 = LogoCreateActivity.this.abc10023;
            if (strArr2 != null) {
                strArr2[1] = "ted to '";
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$j1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9480j1 implements View.OnClickListener {
        public View$OnClickListenerC9480j1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.m9122D(0.0f, -5.0f);
            int i = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i2 = logoCreateActivity.abc10052;
                if (i >= (i2 <= 3 ? i2 : 3)) {
                    break;
                }
                logoCreateActivity.abc10052 = Math.abs(i2);
                i++;
            }
            logoCreateActivity.abc10049 = !logoCreateActivity.abc10049;
            ArrayList<Integer> arrayList = logoCreateActivity.abc10074;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10074.remove(0);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc8 == null) {
                logoCreateActivity2.abc8 = new ArrayList<>();
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc1004 = false;
                if (logoCreateActivity3.abc1000.size() < 0) {
                    LogoCreateActivity.this.abc1000.add(7);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc10034 == null) {
                    logoCreateActivity4.abc10034 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10054 = "ed to '";
            logoCreateActivity5.abc10019 = logoCreateActivity5.abc10019 < 4 ? 5 : 0;
            if (logoCreateActivity5.abc10021 == null) {
                logoCreateActivity5.abc10021 = new String[10];
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$j2 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9481j2 implements View.OnClickListener {
        public View$OnClickListenerC9481j2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Boolean value = LogoCreateActivity.this.createVM.getIsShowLayer().getValue();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10029 = false;
            if (logoCreateActivity.abc10041 == null) {
                logoCreateActivity.abc10041 = new int[10];
            }
            logoCreateActivity.abc10019 -= 0;
            logoCreateActivity.abc24 = -logoCreateActivity.abc24;
            if (logoCreateActivity.abc1002 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc1002;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 1;
                    i++;
                }
            }
            if (LogoCreateActivity.this.abc10041 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc10041;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 9;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc1003 == null) {
                logoCreateActivity2.abc1003 = new ArrayList<>();
            }
            List<LogoBaseSaveEntity> allShowBaseSaveEntity = LogoCreateActivity.this.binding.drawview.getAllShowBaseSaveEntity();
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc1008 = 8;
            logoCreateActivity3.abc10029 = !logoCreateActivity3.abc10029;
            logoCreateActivity3.abc10065 = !logoCreateActivity3.abc10065;
            logoCreateActivity3.abc30 = -logoCreateActivity3.abc30;
            String[] strArr = logoCreateActivity3.abc10016;
            if (strArr != null) {
                strArr[3] = null;
            }
            logoCreateActivity3.abc10038 -= 0.56756294f;
            if (logoCreateActivity3.abc10055 == null) {
                logoCreateActivity3.abc10055 = new ArrayList<>();
            }
            if (allShowBaseSaveEntity != null && allShowBaseSaveEntity.size() > 0) {
                if (value != null && value.booleanValue()) {
                    LogoCreateActivity.this.createVM.hideLayerList();
                    LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                    logoCreateActivity4.abc10019 = -logoCreateActivity4.abc10019;
                    if (logoCreateActivity4.abc10078.size() > 9) {
                        LogoCreateActivity.this.abc10078.add(9);
                    }
                    LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                    if (logoCreateActivity5.abc10014 == null) {
                        logoCreateActivity5.abc10014 = new ArrayList<>();
                    }
                    if (LogoCreateActivity.this.abc9.size() > 3) {
                        LogoCreateActivity.this.abc9.add("成");
                        LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                        int[] iArr3 = logoCreateActivity6.abc10045;
                        if (iArr3 != null) {
                            iArr3[8] = 0;
                        }
                        if (logoCreateActivity6.abc10073 == null) {
                            logoCreateActivity6.abc10073 = new String[10];
                        }
                        if (logoCreateActivity6.abc10047 != null) {
                            int i3 = 0;
                            while (true) {
                                int[] iArr4 = LogoCreateActivity.this.abc10047;
                                if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                                    break;
                                }
                                iArr4[i3] = 7;
                                i3++;
                            }
                        }
                    }
                    LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                    if (logoCreateActivity7.abc10015 == null) {
                        logoCreateActivity7.abc10015 = new String[10];
                    }
                    logoCreateActivity7.abc10051 -= 0.1600750926006239d;
                    int[] iArr5 = logoCreateActivity7.abc10041;
                    if (iArr5 != null) {
                        iArr5[1] = 1;
                    }
                } else {
                    LogoCreateActivity.this.createVM.setListLayer(allShowBaseSaveEntity);
                    LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                    if (logoCreateActivity8.abc10051 < 0.2867096386760518d) {
                        logoCreateActivity8.abc10051 = 0.24318871847541534d;
                    }
                    if (logoCreateActivity8.abc10057 != null) {
                        int i4 = 0;
                        while (true) {
                            String[] strArr2 = LogoCreateActivity.this.abc10057;
                            if (i4 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i4] = "string" + i4;
                            i4++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                    logoCreateActivity9.abc10064 = "how gr";
                    if (logoCreateActivity9.abc21.size() < 0) {
                        LogoCreateActivity.this.abc21.add("糊");
                        LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                        if (logoCreateActivity10.abc10047 == null) {
                            logoCreateActivity10.abc10047 = new int[10];
                        }
                        if (logoCreateActivity10.abc10071 == null) {
                            logoCreateActivity10.abc10071 = new String[10];
                        }
                        String[] strArr3 = logoCreateActivity10.abc10043;
                        if (strArr3 != null) {
                            strArr3[3] = " a";
                        }
                    }
                    LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                    logoCreateActivity11.abc10065 = !logoCreateActivity11.abc10065;
                    if (logoCreateActivity11.abc10014 == null) {
                        logoCreateActivity11.abc10014 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                    logoCreateActivity12.abc10069 = "9th cen";
                    logoCreateActivity12.createVM.showLayerList();
                    LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                    logoCreateActivity13.abc10076 = true;
                    if (logoCreateActivity13.abc10074 == null) {
                        logoCreateActivity13.abc10074 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList = LogoCreateActivity.this.abc10039;
                    if (arrayList != null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10039.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                    logoCreateActivity14.abc27 *= 0.9252162566875125d;
                    logoCreateActivity14.abc10032 = false;
                    if (logoCreateActivity14.abc10015 == null) {
                        logoCreateActivity14.abc10015 = new String[10];
                    }
                    logoCreateActivity14.abc1004 = false;
                }
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                if (logoCreateActivity15.abc10050 == null) {
                    logoCreateActivity15.abc10050 = new int[10];
                }
                String[] strArr4 = logoCreateActivity15.abc10043;
                if (strArr4 != null) {
                    strArr4[1] = null;
                }
                if (logoCreateActivity15.abc10024 == null) {
                    logoCreateActivity15.abc10024 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc9.size() > 4) {
                    LogoCreateActivity.this.abc9.add("/p/a7");
                    if (LogoCreateActivity.this.abc10061 != null) {
                        int i5 = 0;
                        while (true) {
                            int[] iArr6 = LogoCreateActivity.this.abc10061;
                            if (i5 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                                break;
                            }
                            iArr6[i5] = 9;
                            i5++;
                        }
                    }
                    if (LogoCreateActivity.this.abc10055.size() > 5) {
                        LogoCreateActivity.this.abc10055.add(4);
                    }
                    if (LogoCreateActivity.this.abc10043 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr5 = LogoCreateActivity.this.abc10043;
                            if (i6 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                                break;
                            }
                            strArr5[i6] = "string" + i6;
                            i6++;
                        }
                    }
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                if (logoCreateActivity16.abc10057 == null) {
                    logoCreateActivity16.abc10057 = new String[10];
                }
                String[] strArr6 = logoCreateActivity16.abc10021;
                if (strArr6 != null) {
                    strArr6[2] = null;
                }
                logoCreateActivity16.abc10029 = false;
            }
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            logoCreateActivity17.abc10033 = !logoCreateActivity17.abc10033;
            if (logoCreateActivity17.abc10045 == null) {
                logoCreateActivity17.abc10045 = new int[10];
            }
            if (logoCreateActivity17.abc10034 == null) {
                logoCreateActivity17.abc10034 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc2;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc2.remove(0);
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                int[] iArr7 = logoCreateActivity18.abc10047;
                if (iArr7 != null) {
                    iArr7[1] = 0;
                }
                if (logoCreateActivity18.abc10023 != null) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr7 = LogoCreateActivity.this.abc10023;
                        if (i7 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i7] = "string" + i7;
                        i7++;
                    }
                }
                ArrayList<String> arrayList3 = LogoCreateActivity.this.abc10018;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
            logoCreateActivity19.abc10049 = false;
            logoCreateActivity19.abc10058 *= 0.7472728638383196d;
            if (TextUtils.isEmpty(logoCreateActivity19.abc10062)) {
                return;
            }
            int length = LogoCreateActivity.this.abc10062.length();
            LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$k */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9482k implements View.OnClickListener {
        public View$OnClickListenerC9482k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!LogoCreateActivity.this.binding.drawview.m9125A()) {
                LogoCreateActivity.this.binding.drawview.m9096i();
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                String[] strArr = logoCreateActivity.abc10043;
                if (strArr != null) {
                    strArr[3] = "s";
                }
                float f = logoCreateActivity.abc10020 * 0.22865427f;
                logoCreateActivity.abc10020 = f;
                if (f > 0.8415881d) {
                    logoCreateActivity.abc10020 = 0.25645894f;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10065 = true;
            if (logoCreateActivity2.abc1001 != null) {
                int i = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc1001;
                    if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc1008 = -logoCreateActivity3.abc1008;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$k0 */
    /* loaded from: classes3.dex */
    public class C9483k0 implements SeekBar.OnSeekBarChangeListener {
        public C9483k0() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.setClippingRadius(i);
            if (LogoCreateActivity.this.abc10055.size() < 6) {
                LogoCreateActivity.this.abc10055.add(6);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc1007 = ((double) logoCreateActivity2.abc1007) > 0.050228357d ? 0.22649139f : 0.33427334f;
            logoCreateActivity2.abc10029 = true;
            if (logoCreateActivity2.abc13 == null) {
                logoCreateActivity2.abc13 = new int[10];
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int i3 = logoCreateActivity.abc10052;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    logoCreateActivity.abc10040 = true;
                    i2++;
                }
                if (logoCreateActivity.abc10043 == null) {
                    logoCreateActivity.abc10043 = new String[10];
                }
                String[] strArr = logoCreateActivity.abc10071;
                if (strArr != null) {
                    strArr[9] = " the nove";
                }
            }
            ArrayList<String> arrayList = LogoCreateActivity.this.abc1003;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10034;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10034.remove(0);
            }
            LogoCreateActivity.this.abc10033 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$k1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9484k1 implements View.OnClickListener {
        public View$OnClickListenerC9484k1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.m9122D(0.0f, 5.0f);
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10030;
            int i = 0;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10030.remove(0);
            }
            LogoCreateActivity.this.abc10019 -= 3;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i2 = logoCreateActivity.abc10028;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                String[] strArr = logoCreateActivity.abc10021;
                if (strArr != null) {
                    strArr[4] = null;
                }
                i++;
            }
            String[] strArr2 = logoCreateActivity.abc0;
            if (strArr2 != null) {
                strArr2[2] = null;
                String[] strArr3 = logoCreateActivity.abc10060;
                if (strArr3 != null) {
                    strArr3[7] = null;
                }
                if (logoCreateActivity.abc1008 > 0) {
                    logoCreateActivity.abc1008 = 9;
                }
                if (logoCreateActivity.abc10023 == null) {
                    logoCreateActivity.abc10023 = new String[10];
                }
            }
            String[] strArr4 = logoCreateActivity.abc10073;
            if (strArr4 != null) {
                strArr4[4] = null;
            }
            if (logoCreateActivity.abc10048.size() > 1) {
                LogoCreateActivity.this.abc10048.add("ng st");
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10039 == null) {
                logoCreateActivity2.abc10039 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$k2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9485k2 implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15702a;

        public animationAnimation$AnimationListenerC9485k2(View view) {
            this.f15702a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15702a.clearAnimation();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10013 = -logoCreateActivity.abc10013;
            logoCreateActivity.abc10064 = "ery";
            String[] strArr = logoCreateActivity.abc10022;
            if (strArr != null) {
                strArr[0] = null;
            }
            ArrayList<String> arrayList = logoCreateActivity.abc8;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc8.remove(0);
                if (LogoCreateActivity.this.abc10047 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10047;
                        if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i] = 6;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc1004 = !logoCreateActivity2.abc1004;
                if (logoCreateActivity2.abc10015 == null) {
                    logoCreateActivity2.abc10015 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10068 = logoCreateActivity3.abc10068 < 0.9639419938901604d ? 0.4325234995695445d : 0.5444987233341737d;
            logoCreateActivity3.abc10058 = logoCreateActivity3.abc10058 < 0.44801357531655106d ? 0.5475065829031058d : 0.7110860328910956d;
            if (logoCreateActivity3.abc10070.size() > 7) {
                LogoCreateActivity.this.abc10070.add("people ");
            }
            this.f15702a.setEnabled(true);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10027 = ((double) logoCreateActivity4.abc10027) > 0.7144034d ? 0.18750525f : 0.3441167f;
            if (logoCreateActivity4.abc10071 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10071;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10028 = 5;
            logoCreateActivity5.abc12 *= 0.93402743f;
            logoCreateActivity5.abc10035 = false;
            ArrayList<String> arrayList2 = logoCreateActivity5.abc10067;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10067.remove(0);
            }
            LogoCreateActivity.this.abc10062 = " studen";
            this.f15702a.setTag(null);
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc1002 == null) {
                logoCreateActivity6.abc1002 = new int[10];
            }
            if (logoCreateActivity6.abc1003.size() > 5) {
                LogoCreateActivity.this.abc1003.add("l");
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10051 = 0.9081868181602162d;
            String[] strArr3 = logoCreateActivity7.abc0;
            if (strArr3 != null) {
                strArr3[4] = "进行";
                logoCreateActivity7.abc10052 = 6;
                logoCreateActivity7.abc10038 = 0.70809215f;
                if (logoCreateActivity7.abc10058 < 0.4644862477794931d) {
                    logoCreateActivity7.abc10058 = 0.5627141893418083d;
                }
            }
            logoCreateActivity7.abc10025 = Math.abs(logoCreateActivity7.abc10025);
            if (LogoCreateActivity.this.abc1002 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc1002;
                    if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i3] = 0;
                    i3++;
                }
            }
            LogoCreateActivity.this.abc10062 = "l, dull";
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$l */
    /* loaded from: classes3.dex */
    public class C9486l implements LogoRainbowView.InterfaceC9668a {
        public C9486l() {
        }

        @Override // com.logomaster.logomaker.view.LogoRainbowView.InterfaceC9668a
        /* renamed from: a */
        public void mo9073a(int i) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.createVM.setCurrentColor(String.format("#%06X", Integer.valueOf(16777215 & i)));
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                int length = LogoCreateActivity.this.abc10054.length();
                LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
            }
            if (LogoCreateActivity.this.abc10077 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10077;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10010;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc8 == null) {
                logoCreateActivity2.abc8 = new ArrayList<>();
                ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10014;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10014.remove(0);
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10035 = !logoCreateActivity3.abc10035;
                logoCreateActivity3.abc10064 = " man";
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity4.abc10071;
            if (strArr2 != null) {
                strArr2[8] = null;
            }
            if (logoCreateActivity4.abc10024.size() < 3) {
                LogoCreateActivity.this.abc10024.add("ec");
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10049 = !logoCreateActivity5.abc10049;
            logoCreateActivity5.binding.includeColorRainbow.etCurrentColor.clearFocus();
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10065 = !logoCreateActivity6.abc10065;
            if (logoCreateActivity6.abc10030.size() < 2) {
                LogoCreateActivity.this.abc10030.add(7);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc10039 == null) {
                logoCreateActivity7.abc10039 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc37.size() > 9) {
                LogoCreateActivity.this.abc37.add("透明蒙");
                if (LogoCreateActivity.this.abc10041 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10041;
                        if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i3] = 4;
                        i3++;
                    }
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10065 = true;
                ArrayList<String> arrayList3 = logoCreateActivity8.abc10070;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10070.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10025 = ((double) logoCreateActivity9.abc10025) > 0.9567046d ? 0.024641514f : 0.47921413f;
            if (logoCreateActivity9.abc10055 == null) {
                logoCreateActivity9.abc10055 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity10.abc10057;
            if (strArr3 != null) {
                strArr3[0] = ". Fo";
            }
            int i4 = logoCreateActivity10.rainbowType;
            if (i4 == 0) {
                LogoCreateActivity.this.binding.includeColorRainbow.lcsvColor.setColor(i);
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                String[] strArr4 = logoCreateActivity11.abc10071;
                if (strArr4 != null) {
                    strArr4[2] = " that t";
                }
                ArrayList<Integer> arrayList4 = logoCreateActivity11.abc10010;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10010.remove(0);
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10025 = 0.041969955f;
                logoCreateActivity12.abc10 = !logoCreateActivity12.abc10;
                ArrayList<Integer> arrayList5 = logoCreateActivity12.abc10074;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10074.remove(0);
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                logoCreateActivity13.abc10052 += 2;
                logoCreateActivity13.abc10066 *= 0.17674714f;
                logoCreateActivity13.binding.drawview.setFillColor(Integer.valueOf(i));
                ArrayList<String> arrayList6 = LogoCreateActivity.this.abc10048;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc10048.remove(0);
                }
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                String[] strArr5 = logoCreateActivity14.abc10022;
                if (strArr5 != null) {
                    strArr5[3] = "rly 19t";
                }
                logoCreateActivity14.abc10020 = 0.9336573f;
                if (logoCreateActivity14.abc11.size() < 5) {
                    LogoCreateActivity.this.abc11.add("_西语_退休阅读");
                    LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                    int[] iArr2 = logoCreateActivity15.abc1002;
                    if (iArr2 != null) {
                        iArr2[3] = 6;
                    }
                    logoCreateActivity15.abc10051 = 0.607949527522883d;
                    ArrayList<Integer> arrayList7 = logoCreateActivity15.abc10030;
                    if (arrayList7 == null && arrayList7.size() > 0) {
                        LogoCreateActivity.this.abc10030.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                if (logoCreateActivity16.abc1000 == null) {
                    logoCreateActivity16.abc1000 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10041 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr3 = LogoCreateActivity.this.abc10041;
                        if (i5 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                            break;
                        }
                        iArr3[i5] = 4;
                        i5++;
                    }
                }
                LogoCreateActivity.this.abc10066 = 0.6284292f;
            } else if (i4 == 1) {
                LogoCreateActivity.this.binding.drawview.setCanvasBackgroundColor(Integer.valueOf(i));
                ArrayList<Integer> arrayList8 = LogoCreateActivity.this.abc10074;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    LogoCreateActivity.this.abc10074.remove(0);
                }
                LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                logoCreateActivity17.abc10013 = 0.80131865f;
                ArrayList<Integer> arrayList9 = logoCreateActivity17.abc10030;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    LogoCreateActivity.this.abc10030.remove(0);
                }
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                if (logoCreateActivity18.abc6 == null) {
                    logoCreateActivity18.abc6 = new int[10];
                    if (logoCreateActivity18.abc10047 != null) {
                        int i6 = 0;
                        while (true) {
                            int[] iArr4 = LogoCreateActivity.this.abc10047;
                            if (i6 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                                break;
                            }
                            iArr4[i6] = 8;
                            i6++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                    logoCreateActivity19.abc10049 = false;
                    int[] iArr5 = logoCreateActivity19.abc10047;
                    if (iArr5 != null) {
                        iArr5[8] = 0;
                    }
                }
                ArrayList<Integer> arrayList10 = LogoCreateActivity.this.abc10037;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
                LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                if (logoCreateActivity20.abc10057 == null) {
                    logoCreateActivity20.abc10057 = new String[10];
                }
                String[] strArr6 = logoCreateActivity20.abc10021;
                if (strArr6 != null) {
                    strArr6[1] = null;
                }
            }
            LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
            logoCreateActivity21.abc10029 = true;
            logoCreateActivity21.abc10020 -= 0.29135942f;
            logoCreateActivity21.abc10033 = true;
            if (logoCreateActivity21.abc6 != null) {
                int i7 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr6 = logoCreateActivity.abc6;
                    if (i7 >= iArr6.length) {
                        break;
                    }
                    iArr6[i7] = 2;
                    if (logoCreateActivity.abc10073 != null) {
                        int i8 = 0;
                        while (true) {
                            String[] strArr7 = LogoCreateActivity.this.abc10073;
                            if (i8 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                                break;
                            }
                            strArr7[i8] = "string" + i8;
                            i8++;
                        }
                    }
                    if (LogoCreateActivity.this.abc10073 != null) {
                        int i9 = 0;
                        while (true) {
                            String[] strArr8 = LogoCreateActivity.this.abc10073;
                            if (i9 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                                break;
                            }
                            strArr8[i9] = "string" + i9;
                            i9++;
                        }
                    }
                    String[] strArr9 = LogoCreateActivity.this.abc10023;
                    if (strArr9 != null) {
                        strArr9[0] = null;
                    }
                    i7++;
                }
                logoCreateActivity.abc10032 = false;
                if (!TextUtils.isEmpty(logoCreateActivity.abc10054)) {
                    int length2 = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length2;
                }
                int i10 = 0;
                while (true) {
                    LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                    int i11 = logoCreateActivity22.abc1008;
                    if (i11 > 3) {
                        i11 = 3;
                    }
                    if (i10 >= i11) {
                        break;
                    }
                    if (logoCreateActivity22.abc10073 == null) {
                        logoCreateActivity22.abc10073 = new String[10];
                    }
                    i10++;
                }
            }
            LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
            String[] strArr10 = logoCreateActivity23.abc10077;
            if (strArr10 != null) {
                strArr10[4] = null;
            }
            if (logoCreateActivity23.abc10067 == null) {
                logoCreateActivity23.abc10067 = new ArrayList<>();
            }
            String[] strArr11 = LogoCreateActivity.this.abc10021;
            if (strArr11 != null) {
                strArr11[0] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$l0 */
    /* loaded from: classes3.dex */
    public class C9487l0 implements Observer<Boolean> {
        public C9487l0() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                logoCreateActivity.showView(logoCreateActivity.binding.includeImage.getRoot(), new View[0]);
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc10056 == null) {
                    logoCreateActivity2.abc10056 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10033 = !logoCreateActivity3.abc10033;
                int[] iArr = logoCreateActivity3.abc10061;
                if (iArr != null) {
                    iArr[3] = 0;
                }
                if (logoCreateActivity3.abc13 == null) {
                    logoCreateActivity3.abc13 = new int[10];
                    if (logoCreateActivity3.abc1001 != null) {
                        int i = 0;
                        while (true) {
                            String[] strArr = LogoCreateActivity.this.abc1001;
                            if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                                break;
                            }
                            strArr[i] = "string" + i;
                            i++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                    if (logoCreateActivity4.abc10043 == null) {
                        logoCreateActivity4.abc10043 = new String[10];
                    }
                    if (logoCreateActivity4.abc10067.size() > 5) {
                        LogoCreateActivity.this.abc10067.add("ed reput");
                    }
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc10046 += 3;
                logoCreateActivity5.abc10068 = 0.34759947759269605d;
                String[] strArr2 = logoCreateActivity5.abc10031;
                if (strArr2 != null) {
                    strArr2[8] = null;
                }
            } else {
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.hideView(logoCreateActivity6.binding.includeImage.getRoot(), new View[0]);
                ArrayList<String> arrayList = LogoCreateActivity.this.abc10036;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10036.remove(0);
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity7.abc10077;
                if (strArr3 != null) {
                    strArr3[8] = null;
                }
                int[] iArr2 = logoCreateActivity7.abc10017;
                if (iArr2 != null) {
                    iArr2[5] = 8;
                }
                if (logoCreateActivity7.abc17 < 0.8683842754379184d) {
                    logoCreateActivity7.abc17 = 0.7925254633371263d;
                    logoCreateActivity7.abc10051 = 0.9483371075564844d;
                    if (logoCreateActivity7.abc10048.size() > 8) {
                        LogoCreateActivity.this.abc10048.add("bab");
                    }
                    if (LogoCreateActivity.this.abc10067.size() > 7) {
                        LogoCreateActivity.this.abc10067.add("e forced t");
                    }
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                if (logoCreateActivity8.abc10043 == null) {
                    logoCreateActivity8.abc10043 = new String[10];
                }
                logoCreateActivity8.abc1005 = Math.abs(logoCreateActivity8.abc1005);
                LogoCreateActivity.this.abc10028 = 4;
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10029 = false;
            logoCreateActivity9.abc10013 = 0.3780223f;
            logoCreateActivity9.abc10026 = ((double) logoCreateActivity9.abc10026) < 0.059009433d ? 0.81331533f : 0.35577923f;
            logoCreateActivity9.abc24 = 0.6303866054250329d;
            String[] strArr4 = logoCreateActivity9.abc10031;
            if (strArr4 != null) {
                strArr4[9] = null;
            }
            logoCreateActivity9.abc10033 = false;
            if (logoCreateActivity9.abc10018.size() > 9) {
                LogoCreateActivity.this.abc10018.add("ot ");
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$l1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9488l1 implements View.OnClickListener {
        public View$OnClickListenerC9488l1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9122D(-5.0f, 0.0f);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10025 = 0.97729546f;
            int i = 0;
            if (logoCreateActivity.abc10023 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10023;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            if (LogoCreateActivity.this.abc10061 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10061;
                    if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i3] = 5;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc33 == null) {
                logoCreateActivity2.abc33 = new String[10];
                if (logoCreateActivity2.abc10071 != null) {
                    while (true) {
                        String[] strArr2 = LogoCreateActivity.this.abc10071;
                        if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity3.abc10015;
                if (strArr3 != null) {
                    strArr3[7] = null;
                }
                if (logoCreateActivity3.abc10034 == null) {
                    logoCreateActivity3.abc10034 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10046 = Math.abs(logoCreateActivity4.abc10046);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc10047 == null) {
                logoCreateActivity5.abc10047 = new int[10];
            }
            if (logoCreateActivity5.abc10014 == null) {
                logoCreateActivity5.abc10014 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$l2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9489l2 implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15707a;

        public animationAnimation$AnimationListenerC9489l2(View view) {
            this.f15707a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            LogoCreateActivity logoCreateActivity;
            this.f15707a.clearAnimation();
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity2.abc10061;
            int i = 0;
            if (iArr != null) {
                iArr[1] = 0;
            }
            if (logoCreateActivity2.abc10030 == null) {
                logoCreateActivity2.abc10030 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc10074 == null) {
                logoCreateActivity3.abc10074 = new ArrayList<>();
            }
            ArrayList<String> arrayList = LogoCreateActivity.this.abc8;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc8.remove(0);
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc10019 = logoCreateActivity4.abc10019 > 8 ? 8 : 4;
                logoCreateActivity4.abc10059 = "onl";
                if (!TextUtils.isEmpty(logoCreateActivity4.abc10054)) {
                    int length = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc10017 == null) {
                logoCreateActivity5.abc10017 = new int[10];
            }
            logoCreateActivity5.abc10033 = !logoCreateActivity5.abc10033;
            int[] iArr2 = logoCreateActivity5.abc10045;
            if (iArr2 != null) {
                iArr2[1] = 0;
            }
            this.f15707a.setEnabled(true);
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc10014 == null) {
                logoCreateActivity6.abc10014 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc1005 = logoCreateActivity7.abc1005 < 5 ? 5 : 8;
            logoCreateActivity7.abc10013 -= 0.50933284f;
            int[] iArr3 = logoCreateActivity7.abc22;
            if (iArr3 != null) {
                iArr3[7] = 0;
                if (logoCreateActivity7.abc1000 == null) {
                    logoCreateActivity7.abc1000 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10066 = 0.6522792f;
                logoCreateActivity8.abc10029 = !logoCreateActivity8.abc10029;
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10052 = logoCreateActivity9.abc10052 > 9 ? 6 : 2;
            if (logoCreateActivity9.abc10014.size() < 7) {
                LogoCreateActivity.this.abc10014.add(0);
            }
            LogoCreateActivity.this.abc10059 = "’s mo";
            this.f15707a.setTag(null);
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10010;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            if (LogoCreateActivity.this.abc10039.size() < 6) {
                LogoCreateActivity.this.abc10039.add("gat");
            }
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i2 = logoCreateActivity.abc10028;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                logoCreateActivity.abc10026 *= 0.070832014f;
                i++;
            }
            logoCreateActivity.abc17 = 0.14888549237587123d;
            logoCreateActivity.abc10066 = 0.6891307f;
            String[] strArr = logoCreateActivity.abc10022;
            if (strArr != null) {
                strArr[9] = "only until";
            }
            String[] strArr2 = logoCreateActivity.abc10015;
            if (strArr2 != null) {
                strArr2[6] = null;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$m */
    /* loaded from: classes3.dex */
    public class C9490m implements LogoColorSaturationView.InterfaceC9661a {
        public C9490m() {
        }

        @Override // com.logomaster.logomaker.view.LogoColorSaturationView.InterfaceC9661a
        /* renamed from: a */
        public void mo9126a(int i) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            int i2 = 0;
            LogoCreateActivity.this.createVM.setCurrentColor(String.format("#%06X", Integer.valueOf(16777215 & i)));
            if (LogoCreateActivity.this.abc10073 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10073;
                    if (i3 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity3.abc10057;
            if (strArr2 != null) {
                strArr2[3] = null;
            }
            String[] strArr3 = logoCreateActivity3.abc10015;
            if (strArr3 != null) {
                strArr3[8] = "ve sent";
            }
            logoCreateActivity3.abc24 *= 0.7955284106243597d;
            ArrayList<Integer> arrayList = logoCreateActivity3.abc10010;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10065 = !logoCreateActivity4.abc10065;
            ArrayList<Integer> arrayList2 = logoCreateActivity4.abc1000;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc1000.remove(0);
            }
            LogoCreateActivity.this.binding.includeColorRainbow.etCurrentColor.clearFocus();
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10066 = -logoCreateActivity5.abc10066;
            int[] iArr = logoCreateActivity5.abc10041;
            if (iArr != null) {
                iArr[5] = 0;
            }
            if (logoCreateActivity5.abc1003.size() < 7) {
                LogoCreateActivity.this.abc1003.add("ar");
            }
            int i4 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                if (i4 >= logoCreateActivity.abc30) {
                    break;
                }
                logoCreateActivity.abc4 = Math.abs(logoCreateActivity.abc4);
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                if (logoCreateActivity6.abc10015 == null) {
                    logoCreateActivity6.abc10015 = new String[10];
                }
                String[] strArr4 = logoCreateActivity6.abc10043;
                if (strArr4 != null) {
                    strArr4[6] = null;
                }
                if (logoCreateActivity6.abc1000 == null) {
                    logoCreateActivity6.abc1000 = new ArrayList<>();
                }
                i4++;
            }
            String[] strArr5 = logoCreateActivity.abc10031;
            if (strArr5 != null) {
                strArr5[7] = "e ";
            }
            if (logoCreateActivity.abc10023 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr6 = LogoCreateActivity.this.abc10023;
                    if (i5 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i5] = "string" + i5;
                    i5++;
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc10071 == null) {
                logoCreateActivity7.abc10071 = new String[10];
            }
            int i6 = logoCreateActivity7.rainbowType;
            if (i6 == 0) {
                LogoCreateActivity.this.binding.drawview.setFillColor(Integer.valueOf(i));
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10059)) {
                    int length = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10049 = true;
                ArrayList<Integer> arrayList3 = logoCreateActivity8.abc10011;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc35;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc35.remove(0);
                    LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                    logoCreateActivity9.abc10029 = !logoCreateActivity9.abc10029;
                    int[] iArr2 = logoCreateActivity9.abc10061;
                    if (iArr2 != null) {
                        iArr2[4] = 0;
                    }
                    if (logoCreateActivity9.abc10078.size() > 8) {
                        LogoCreateActivity.this.abc10078.add(2);
                    }
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                logoCreateActivity10.abc10026 += 0.54778576f;
                if (logoCreateActivity10.abc10075 != null) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr7 = LogoCreateActivity.this.abc10075;
                        if (i7 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i7] = "string" + i7;
                        i7++;
                    }
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                if (logoCreateActivity11.abc10077 == null) {
                    logoCreateActivity11.abc10077 = new String[10];
                }
            } else if (i6 == 1) {
                LogoCreateActivity.this.binding.drawview.setCanvasBackgroundColor(Integer.valueOf(i));
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                if (logoCreateActivity12.abc10041 == null) {
                    logoCreateActivity12.abc10041 = new int[10];
                }
                logoCreateActivity12.abc10065 = !logoCreateActivity12.abc10065;
                if (!TextUtils.isEmpty(logoCreateActivity12.abc10012)) {
                    int length2 = LogoCreateActivity.this.abc10012.length();
                    LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length2;
                }
                if (LogoCreateActivity.this.abc13 != null) {
                    int i8 = 0;
                    while (true) {
                        logoCreateActivity2 = LogoCreateActivity.this;
                        int[] iArr3 = logoCreateActivity2.abc13;
                        if (i8 >= iArr3.length) {
                            break;
                        }
                        iArr3[i8] = 0;
                        if (logoCreateActivity2.abc10015 != null) {
                            int i9 = 0;
                            while (true) {
                                String[] strArr8 = LogoCreateActivity.this.abc10015;
                                if (i9 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                                    break;
                                }
                                strArr8[i9] = "string" + i9;
                                i9++;
                            }
                        }
                        ArrayList<String> arrayList5 = LogoCreateActivity.this.abc10070;
                        if (arrayList5 != null && arrayList5.size() > 0) {
                            LogoCreateActivity.this.abc10070.remove(0);
                        }
                        LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                        if (logoCreateActivity13.abc10066 < 0.8558266d) {
                            logoCreateActivity13.abc10066 = 0.8516849f;
                        }
                        i8++;
                    }
                    logoCreateActivity2.abc10064 = "really";
                    logoCreateActivity2.abc10068 = 0.458222325676953d;
                    String[] strArr9 = logoCreateActivity2.abc10016;
                    if (strArr9 != null) {
                        strArr9[9] = "d reputat";
                    }
                }
                if (LogoCreateActivity.this.abc10070.size() < 9) {
                    LogoCreateActivity.this.abc10070.add("lit");
                }
                ArrayList<String> arrayList6 = LogoCreateActivity.this.abc10067;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc10067.remove(0);
                }
                if (LogoCreateActivity.this.abc10010.size() > 6) {
                    LogoCreateActivity.this.abc10010.add(1);
                }
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            if (logoCreateActivity14.abc10039 == null) {
                logoCreateActivity14.abc10039 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10045 != null) {
                while (true) {
                    int[] iArr4 = LogoCreateActivity.this.abc10045;
                    if (i2 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i2] = 5;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            logoCreateActivity15.abc10058 = Math.abs(logoCreateActivity15.abc10058);
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            logoCreateActivity16.abc18 = -logoCreateActivity16.abc18;
            logoCreateActivity16.abc10052 -= 8;
            logoCreateActivity16.abc10025 = 0.058072925f;
            if (logoCreateActivity16.abc1003.size() > 5) {
                LogoCreateActivity.this.abc1003.add("i");
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$m0 */
    /* loaded from: classes3.dex */
    public class C9491m0 implements Observer<Boolean> {
        public C9491m0() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoCreateActivity logoCreateActivity;
            int i = 0;
            if (bool.booleanValue()) {
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.showView(logoCreateActivity2.binding.includeColorFinder.getRoot(), new View[0]);
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                String[] strArr = logoCreateActivity3.abc10015;
                if (strArr != null) {
                    strArr[1] = null;
                }
                if (logoCreateActivity3.abc10042 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10042;
                        if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i2] = 4;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc10020 = ((double) logoCreateActivity4.abc10020) < 0.18846363d ? 0.8787259f : 0.2620703f;
                String[] strArr2 = logoCreateActivity4.abc19;
                if (strArr2 != null) {
                    strArr2[7] = "att";
                    if (logoCreateActivity4.abc10043 == null) {
                        logoCreateActivity4.abc10043 = new String[10];
                    }
                    if (logoCreateActivity4.abc10077 == null) {
                        logoCreateActivity4.abc10077 = new String[10];
                    }
                    if (logoCreateActivity4.abc10031 == null) {
                        logoCreateActivity4.abc10031 = new String[10];
                    }
                }
                if (logoCreateActivity4.abc10010.size() > 5) {
                    LogoCreateActivity.this.abc10010.add(4);
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                if (logoCreateActivity5.abc10039 == null) {
                    logoCreateActivity5.abc10039 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                if (logoCreateActivity6.abc10025 > 0.45911556d) {
                    logoCreateActivity6.abc10025 = 0.40608537f;
                }
            } else {
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.hideView(logoCreateActivity7.binding.includeColorFinder.getRoot(), new View[0]);
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10063 = 0.00745821f;
                String[] strArr3 = logoCreateActivity8.abc10075;
                if (strArr3 != null) {
                    strArr3[6] = "ll, du";
                }
                if (logoCreateActivity8.abc10021 == null) {
                    logoCreateActivity8.abc10021 = new String[10];
                }
                if (logoCreateActivity8.abc19 != null) {
                    int i3 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        String[] strArr4 = logoCreateActivity.abc19;
                        if (i3 >= strArr4.length) {
                            break;
                        }
                        strArr4[i3] = "string" + i3;
                        LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                        if (logoCreateActivity9.abc10055 == null) {
                            logoCreateActivity9.abc10055 = new ArrayList<>();
                        }
                        LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                        if (logoCreateActivity10.abc10022 == null) {
                            logoCreateActivity10.abc10022 = new String[10];
                        }
                        logoCreateActivity10.abc10063 = 0.411097f;
                        i3++;
                    }
                    if (logoCreateActivity.abc10036 == null) {
                        logoCreateActivity.abc10036 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                    if (logoCreateActivity11.abc10021 == null) {
                        logoCreateActivity11.abc10021 = new String[10];
                    }
                    ArrayList<Integer> arrayList = logoCreateActivity11.abc10056;
                    if (arrayList == null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10056.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10019 = 6;
                logoCreateActivity12.abc10029 = !logoCreateActivity12.abc10029;
                String[] strArr5 = logoCreateActivity12.abc10022;
                if (strArr5 != null) {
                    strArr5[9] = "ern n";
                }
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            if (logoCreateActivity13.abc10024 == null) {
                logoCreateActivity13.abc10024 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10024.size() > 9) {
                LogoCreateActivity.this.abc10024.add("w");
            }
            if (LogoCreateActivity.this.abc10041 != null) {
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc10041;
                    if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i] = 1;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            logoCreateActivity14.abc18 = -logoCreateActivity14.abc18;
            if (logoCreateActivity14.abc10070 == null) {
                logoCreateActivity14.abc10070 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            if (logoCreateActivity15.abc10067 == null) {
                logoCreateActivity15.abc10067 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            if (logoCreateActivity16.abc10043 == null) {
                logoCreateActivity16.abc10043 = new String[10];
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$m1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9492m1 implements View.OnClickListener {
        public View$OnClickListenerC9492m1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9122D(5.0f, 0.0f);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity.abc10060;
            if (strArr != null) {
                strArr[1] = "novels.";
            }
            int[] iArr = logoCreateActivity.abc10041;
            if (iArr != null) {
                iArr[4] = 0;
            }
            logoCreateActivity.abc10035 = true;
            int[] iArr2 = logoCreateActivity.abc15;
            if (iArr2 != null) {
                iArr2[3] = 4;
                String[] strArr2 = logoCreateActivity.abc10021;
                if (strArr2 != null) {
                    strArr2[2] = "robably mo";
                }
                logoCreateActivity.abc10065 = true;
                int[] iArr3 = logoCreateActivity.abc10047;
                if (iArr3 != null) {
                    iArr3[1] = 8;
                }
            }
            if (logoCreateActivity.abc10024.size() > 5) {
                LogoCreateActivity.this.abc10024.add("ll");
            }
            if (LogoCreateActivity.this.abc10060 != null) {
                int i = 0;
                while (true) {
                    String[] strArr3 = LogoCreateActivity.this.abc10060;
                    if (i >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i] = "string" + i;
                    i++;
                }
            }
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10034;
            if (arrayList != null || arrayList.size() <= 0) {
                return;
            }
            LogoCreateActivity.this.abc10034.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$m2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9493m2 implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15712a;

        /* renamed from: b */
        public final /* synthetic */ View[] f15713b;

        public animationAnimation$AnimationListenerC9493m2(View view, View[] viewArr) {
            this.f15712a = view;
            this.f15713b = viewArr;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            LogoCreateActivity logoCreateActivity;
            this.f15712a.clearAnimation();
            if (LogoCreateActivity.this.abc10039.size() > 4) {
                LogoCreateActivity.this.abc10039.add(" groani");
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10015 == null) {
                logoCreateActivity2.abc10015 = new String[10];
            }
            if (logoCreateActivity2.abc10070 == null) {
                logoCreateActivity2.abc10070 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc36 == null) {
                logoCreateActivity3.abc36 = new String[10];
                logoCreateActivity3.abc10069 = "than y";
                logoCreateActivity3.abc10076 = !logoCreateActivity3.abc10076;
                String[] strArr = logoCreateActivity3.abc10022;
                if (strArr != null) {
                    strArr[5] = null;
                }
            }
            logoCreateActivity3.abc10058 *= 0.7659667364230096d;
            if (logoCreateActivity3.abc10017 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10017;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 5;
                    i++;
                }
            }
            LogoCreateActivity.this.abc10054 = "unearned r";
            this.f15712a.setVisibility(8);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10076 = true;
            String[] strArr2 = logoCreateActivity4.abc10022;
            if (strArr2 != null) {
                strArr2[6] = "e, the ins";
            }
            logoCreateActivity4.abc10058 = 0.8362248320593221d;
            int[] iArr2 = logoCreateActivity4.abc6;
            if (iArr2 != null) {
                iArr2[4] = 0;
                logoCreateActivity4.abc1007 = 0.7033519f;
                logoCreateActivity4.abc10033 = true;
                logoCreateActivity4.abc10027 = Math.abs(logoCreateActivity4.abc10027);
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc10046 < 0) {
                logoCreateActivity5.abc10046 = 5;
            }
            logoCreateActivity5.abc10076 = !logoCreateActivity5.abc10076;
            if (logoCreateActivity5.abc10050 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr3 = LogoCreateActivity.this.abc10050;
                    if (i2 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i2] = 7;
                    i2++;
                }
            }
            this.f15712a.setTag(null);
            if (LogoCreateActivity.this.abc10075 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr3 = LogoCreateActivity.this.abc10075;
                    if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc1007 = 0.2859149f;
            if (logoCreateActivity6.abc10074 == null) {
                logoCreateActivity6.abc10074 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc17 -= 0.9238306063530751d;
            logoCreateActivity7.abc10025 -= 0.8868345f;
            if (logoCreateActivity7.abc1003.size() < 9) {
                LogoCreateActivity.this.abc1003.add(" ");
            }
            if (LogoCreateActivity.this.abc10055.size() > 7) {
                LogoCreateActivity.this.abc10055.add(0);
            }
            int i4 = 0;
            while (true) {
                View[] viewArr = this.f15713b;
                if (i4 >= viewArr.length) {
                    break;
                }
                viewArr[i4].setVisibility(8);
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10058 = 0.36927691101896887d;
                logoCreateActivity8.abc10063 = ((double) logoCreateActivity8.abc10063) > 0.2741872d ? 0.7985394f : 0.16557777f;
                if (logoCreateActivity8.abc10021 == null) {
                    logoCreateActivity8.abc10021 = new String[10];
                }
                logoCreateActivity8.abc4 = 0.33757883f;
                if (logoCreateActivity8.abc10060 != null) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10060;
                        if (i5 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i5] = "string" + i5;
                        i5++;
                    }
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                if (logoCreateActivity9.abc10027 < 0.73254925d) {
                    logoCreateActivity9.abc10027 = 0.8367869f;
                }
                if (logoCreateActivity9.abc1002 != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr4 = LogoCreateActivity.this.abc1002;
                        if (i6 < (iArr4.length > 3 ? 3 : iArr4.length)) {
                            iArr4[i6] = 2;
                            i6++;
                        }
                    }
                }
                i4++;
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            int[] iArr5 = logoCreateActivity10.abc10041;
            if (iArr5 != null) {
                iArr5[1] = 9;
            }
            if (!TextUtils.isEmpty(logoCreateActivity10.abc10064)) {
                int length = LogoCreateActivity.this.abc10064.length();
                LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            String[] strArr5 = logoCreateActivity11.abc10016;
            if (strArr5 != null) {
                strArr5[6] = "k";
            }
            if (logoCreateActivity11.abc32 != null) {
                int i7 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr6 = logoCreateActivity.abc32;
                    if (i7 >= iArr6.length) {
                        break;
                    }
                    iArr6[i7] = 6;
                    String[] strArr6 = logoCreateActivity.abc10057;
                    if (strArr6 != null) {
                        strArr6[5] = "very y";
                    }
                    logoCreateActivity.abc10027 = 0.040925503f;
                    logoCreateActivity.abc1008 = logoCreateActivity.abc1008 < 7 ? 0 : 7;
                    i7++;
                }
                if (logoCreateActivity.abc10037.size() > 8) {
                    LogoCreateActivity.this.abc10037.add(9);
                }
                ArrayList<String> arrayList = LogoCreateActivity.this.abc10067;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10067.remove(0);
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                if (logoCreateActivity12.abc10041 == null) {
                    logoCreateActivity12.abc10041 = new int[10];
                }
            }
            if (LogoCreateActivity.this.abc10037.size() < 9) {
                LogoCreateActivity.this.abc10037.add(4);
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            String[] strArr7 = logoCreateActivity13.abc10077;
            if (strArr7 != null) {
                strArr7[3] = "it.";
            }
            logoCreateActivity13.abc10029 = true;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$n */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9494n implements View.OnClickListener {
        public View$OnClickListenerC9494n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            int i = LogoCreateActivity.this.rainbowType;
            int i2 = 0;
            if (i == 0) {
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.binding.drawview.setFillColor(logoCreateActivity4.lastColor);
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                    int length = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
                }
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10037;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc10049 = !logoCreateActivity5.abc10049;
                ArrayList<Integer> arrayList2 = logoCreateActivity5.abc2;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc2.remove(0);
                    LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                    logoCreateActivity6.abc10020 = 0.215819f;
                    String[] strArr = logoCreateActivity6.abc10057;
                    if (strArr != null) {
                        strArr[1] = "novel w";
                    }
                    if (!TextUtils.isEmpty(logoCreateActivity6.abc10012)) {
                        int length2 = LogoCreateActivity.this.abc10012.length();
                        LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length2;
                    }
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                if (logoCreateActivity7.abc10046 > 0) {
                    logoCreateActivity7.abc10046 = 3;
                }
                logoCreateActivity7.abc10049 = true;
                logoCreateActivity7.abc10032 = false;
            } else if (i == 1) {
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.binding.drawview.m9108R(logoCreateActivity8.lastBgImageTemp, LogoCreateActivity.this.lastBgColorTemp, LogoCreateActivity.this.lastBgSrcRect);
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.abc10051 = logoCreateActivity9.abc10051 > 0.8419840228941868d ? 0.7836661648056135d : 0.5886833208249831d;
                logoCreateActivity9.abc10033 = true;
                logoCreateActivity9.abc10052 = 4;
                if (logoCreateActivity9.abc19 != null) {
                    int i3 = 0;
                    while (true) {
                        logoCreateActivity3 = LogoCreateActivity.this;
                        String[] strArr2 = logoCreateActivity3.abc19;
                        if (i3 >= strArr2.length) {
                            break;
                        }
                        strArr2[i3] = "string" + i3;
                        if (LogoCreateActivity.this.abc10014.size() < 5) {
                            LogoCreateActivity.this.abc10014.add(5);
                        }
                        LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                        logoCreateActivity10.abc10063 = 0.842821f;
                        logoCreateActivity10.abc10049 = !logoCreateActivity10.abc10049;
                        i3++;
                    }
                    ArrayList<Integer> arrayList3 = logoCreateActivity3.abc1000;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc1000.remove(0);
                    }
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                        int length3 = LogoCreateActivity.this.abc10069.length();
                        LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length3;
                    }
                    LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                    logoCreateActivity11.abc10046 = logoCreateActivity11.abc10046 < 7 ? 2 : 4;
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10069 = "is";
                if (logoCreateActivity12.abc10018.size() < 1) {
                    LogoCreateActivity.this.abc10018.add("t");
                }
                if (LogoCreateActivity.this.abc10036.size() < 0) {
                    LogoCreateActivity.this.abc10036.add("itt");
                }
                LogoCreateActivity.this.createVM.showBackgroundLayout();
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity13.abc10031;
                if (strArr3 != null) {
                    strArr3[2] = "well,";
                }
                int[] iArr = logoCreateActivity13.abc10042;
                if (iArr != null) {
                    iArr[4] = 5;
                }
                if (logoCreateActivity13.abc1003.size() < 2) {
                    LogoCreateActivity.this.abc1003.add("ople ");
                }
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                if (logoCreateActivity14.abc24 < 0.8646611047928977d) {
                    logoCreateActivity14.abc24 = 0.7581875423420642d;
                    logoCreateActivity14.abc10046 = -logoCreateActivity14.abc10046;
                    if (logoCreateActivity14.abc1003 == null) {
                        logoCreateActivity14.abc1003 = new ArrayList<>();
                    }
                    LogoCreateActivity.this.abc10029 = !logoCreateActivity2.abc10029;
                }
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                logoCreateActivity15.abc10052 = logoCreateActivity15.abc10052 >= 8 ? 1 : 5;
                int i4 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int i5 = logoCreateActivity.abc10019;
                    if (i5 > 3) {
                        i5 = 3;
                    }
                    if (i4 >= i5) {
                        break;
                    }
                    ArrayList<Integer> arrayList4 = logoCreateActivity.abc10055;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        LogoCreateActivity.this.abc10055.remove(0);
                    }
                    i4++;
                }
                if (logoCreateActivity.abc10017 != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr2 = LogoCreateActivity.this.abc10017;
                        if (i6 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i6] = 4;
                        i6++;
                    }
                }
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            if (logoCreateActivity16.abc10060 == null) {
                logoCreateActivity16.abc10060 = new String[10];
            }
            if (logoCreateActivity16.abc10043 == null) {
                logoCreateActivity16.abc10043 = new String[10];
            }
            ArrayList<Integer> arrayList5 = logoCreateActivity16.abc1000;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoCreateActivity.this.abc1000.remove(0);
            }
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            if (logoCreateActivity17.abc8 == null) {
                logoCreateActivity17.abc8 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = LogoCreateActivity.this.abc10030;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc10030.remove(0);
                }
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                if (logoCreateActivity18.abc10055 == null) {
                    logoCreateActivity18.abc10055 = new ArrayList<>();
                }
                LogoCreateActivity.this.abc10065 = false;
            }
            LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
            String[] strArr4 = logoCreateActivity19.abc10071;
            if (strArr4 != null) {
                strArr4[8] = null;
            }
            ArrayList<String> arrayList7 = logoCreateActivity19.abc10067;
            if (arrayList7 != null && arrayList7.size() > 0) {
                LogoCreateActivity.this.abc10067.remove(0);
            }
            LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
            if (logoCreateActivity20.abc10048 == null) {
                logoCreateActivity20.abc10048 = new ArrayList<>();
            }
            LogoCreateActivity.this.createVM.hideColorRainbowLayout();
            LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
            logoCreateActivity21.abc10049 = false;
            ArrayList<String> arrayList8 = logoCreateActivity21.abc10018;
            if (arrayList8 != null && arrayList8.size() > 0) {
                LogoCreateActivity.this.abc10018.remove(0);
            }
            ArrayList<Integer> arrayList9 = LogoCreateActivity.this.abc10078;
            if (arrayList9 == null && arrayList9.size() > 0) {
                LogoCreateActivity.this.abc10078.remove(0);
            }
            LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
            logoCreateActivity22.abc27 = 0.30600960658711407d;
            if (logoCreateActivity22.abc10077 != null) {
                while (true) {
                    String[] strArr5 = LogoCreateActivity.this.abc10077;
                    if (i2 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
            logoCreateActivity23.abc10072 = !logoCreateActivity23.abc10072;
            logoCreateActivity23.abc10025 = 0.04991299f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$n0 */
    /* loaded from: classes3.dex */
    public class C9495n0 implements Observer<Boolean> {
        public C9495n0() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoCreateActivity logoCreateActivity;
            if (bool.booleanValue()) {
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.showView(logoCreateActivity2.binding.includeColorRainbow.getRoot(), new View[0]);
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc1007 = 0.47929925f;
                ArrayList<Integer> arrayList = logoCreateActivity3.abc10010;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10010.remove(0);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc10048 == null) {
                    logoCreateActivity4.abc10048 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc18 = 0.559298473760704d;
                logoCreateActivity5.abc10029 = false;
                int[] iArr = logoCreateActivity5.abc10017;
                if (iArr != null) {
                    iArr[4] = 4;
                }
                if (logoCreateActivity5.abc10067 == null) {
                    logoCreateActivity5.abc10067 = new ArrayList<>();
                }
            } else {
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.hideView(logoCreateActivity6.binding.includeColorRainbow.getRoot(), new View[0]);
                ArrayList<String> arrayList2 = LogoCreateActivity.this.abc1003;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc1003.remove(0);
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                if (logoCreateActivity7.abc10061 == null) {
                    logoCreateActivity7.abc10061 = new int[10];
                }
                logoCreateActivity7.abc10029 = !logoCreateActivity7.abc10029;
                logoCreateActivity7.abc24 = logoCreateActivity7.abc24 > 0.050330495645813156d ? 0.7272840611725359d : 0.9912768064119388d;
                if (logoCreateActivity7.abc10018 == null) {
                    logoCreateActivity7.abc10018 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10060 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10060;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                if (LogoCreateActivity.this.abc10074.size() < 4) {
                    LogoCreateActivity.this.abc10074.add(5);
                }
            }
            if (LogoCreateActivity.this.abc10055.size() < 8) {
                LogoCreateActivity.this.abc10055.add(1);
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity8.abc10016;
            if (strArr2 != null) {
                strArr2[3] = null;
            }
            logoCreateActivity8.abc10040 = !logoCreateActivity8.abc10040;
            if (logoCreateActivity8.abc1 != null) {
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr2 = logoCreateActivity.abc1;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    iArr2[i2] = 6;
                    if (logoCreateActivity.abc1003 == null) {
                        logoCreateActivity.abc1003 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                    logoCreateActivity9.abc10035 = !logoCreateActivity9.abc10035;
                    if (logoCreateActivity9.abc10015 != null) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr3 = LogoCreateActivity.this.abc10015;
                            if (i3 < (strArr3.length > 3 ? 3 : strArr3.length)) {
                                strArr3[i3] = "string" + i3;
                                i3++;
                            }
                        }
                    }
                    i2++;
                }
                if (logoCreateActivity.abc10016 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10016;
                        if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i4] = "string" + i4;
                        i4++;
                    }
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                logoCreateActivity10.abc10025 = 0.86537904f;
                if (logoCreateActivity10.abc10070 == null) {
                    logoCreateActivity10.abc10070 = new ArrayList<>();
                }
            }
            if (LogoCreateActivity.this.abc10060 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr5 = LogoCreateActivity.this.abc10060;
                    if (i5 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i5] = "string" + i5;
                    i5++;
                }
            }
            ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10010;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            LogoCreateActivity.this.abc10068 += 0.13875362095016308d;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$n1 */
    /* loaded from: classes3.dex */
    public class C9496n1 implements LogoLayerRvItemTouchHelperCallback.InterfaceC9660a {
        public C9496n1() {
        }

        @Override // com.logomaster.logomaker.utils.LogoLayerRvItemTouchHelperCallback.InterfaceC9660a
        /* renamed from: a */
        public void mo9128a(int i, int i2) {
            LogoCreateActivity.this.binding.drawview.m9105U(i, i2);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10058 = 0.4137300344607783d;
            int[] iArr = logoCreateActivity.abc10042;
            if (iArr != null) {
                iArr[0] = 0;
            }
            logoCreateActivity.abc10046 *= 3;
            String[] strArr = logoCreateActivity.abc25;
            if (strArr != null) {
                strArr[0] = null;
                if (logoCreateActivity.abc10022 == null) {
                    logoCreateActivity.abc10022 = new String[10];
                }
                if (!TextUtils.isEmpty(logoCreateActivity.abc10069)) {
                    int length = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length;
                }
                int[] iArr2 = LogoCreateActivity.this.abc10017;
                if (iArr2 != null) {
                    iArr2[0] = 0;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity2.abc10042;
            if (iArr3 != null) {
                iArr3[9] = 0;
            }
            logoCreateActivity2.abc10065 = !logoCreateActivity2.abc10065;
            String[] strArr2 = logoCreateActivity2.abc10077;
            if (strArr2 != null) {
                strArr2[5] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$n2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9497n2 implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15718a;

        public animationAnimation$AnimationListenerC9497n2(View view) {
            this.f15718a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15718a.clearAnimation();
            if (LogoCreateActivity.this.abc10043 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10043;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10077 == null) {
                logoCreateActivity.abc10077 = new String[10];
            }
            if (logoCreateActivity.abc10018 == null) {
                logoCreateActivity.abc10018 = new ArrayList<>();
            }
            ArrayList<String> arrayList = LogoCreateActivity.this.abc8;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc8.remove(0);
                ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10037;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
                if (LogoCreateActivity.this.abc1001 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr2 = LogoCreateActivity.this.abc1001;
                        if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i2] = "string" + i2;
                        i2++;
                    }
                }
                if (LogoCreateActivity.this.abc10024.size() > 9) {
                    LogoCreateActivity.this.abc10024.add("ved");
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10020 = ((double) logoCreateActivity2.abc10020) > 0.1132437d ? 0.42215592f : 0.1496346f;
            int[] iArr = logoCreateActivity2.abc10017;
            if (iArr != null) {
                iArr[1] = 0;
            }
            if (logoCreateActivity2.abc10022 == null) {
                logoCreateActivity2.abc10022 = new String[10];
            }
            this.f15718a.setEnabled(true);
            ArrayList<String> arrayList3 = LogoCreateActivity.this.abc1003;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity3.abc10017;
            if (iArr2 != null) {
                iArr2[3] = 5;
            }
            logoCreateActivity3.abc10051 = 0.0035370388622374405d;
            int[] iArr3 = logoCreateActivity3.abc22;
            if (iArr3 != null) {
                iArr3[7] = 0;
                if (logoCreateActivity3.abc10050 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr4 = LogoCreateActivity.this.abc10050;
                        if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i3] = 8;
                        i3++;
                    }
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity4.abc10015;
                if (strArr3 != null) {
                    strArr3[1] = null;
                }
                String[] strArr4 = logoCreateActivity4.abc10021;
                if (strArr4 != null) {
                    strArr4[3] = null;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc1003 == null) {
                logoCreateActivity5.abc1003 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10075 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr5 = LogoCreateActivity.this.abc10075;
                    if (i4 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i4] = "string" + i4;
                    i4++;
                }
            }
            if (LogoCreateActivity.this.abc10011.size() > 8) {
                LogoCreateActivity.this.abc10011.add(0);
            }
            this.f15718a.setTag(null);
            if (LogoCreateActivity.this.abc10030.size() > 8) {
                LogoCreateActivity.this.abc10030.add(9);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc1003 == null) {
                logoCreateActivity6.abc1003 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10063 = Math.abs(logoCreateActivity7.abc10063);
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc17 = 0.14888549237587123d;
            logoCreateActivity8.abc10029 = false;
            logoCreateActivity8.abc10076 = false;
            logoCreateActivity8.abc10035 = !logoCreateActivity8.abc10035;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$o */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9498o implements View.OnClickListener {
        public View$OnClickListenerC9498o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity.this.binding.drawview.setEditBackgound(false);
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                int length = LogoCreateActivity.this.abc10064.length();
                LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10019 = Math.abs(logoCreateActivity3.abc10019);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10016 == null) {
                logoCreateActivity4.abc10016 = new String[10];
            }
            logoCreateActivity4.binding.drawview.m9118H();
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity5.abc10022;
            if (strArr != null) {
                strArr[3] = null;
            }
            if (logoCreateActivity5.abc10078.size() > 2) {
                LogoCreateActivity.this.abc10078.add(3);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10038 = 0.3606189f;
            int i = logoCreateActivity6.rainbowType;
            if (i == 0) {
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc2;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc2.remove(0);
                    LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                    logoCreateActivity7.abc10038 *= 0.96909595f;
                    ArrayList<Integer> arrayList2 = logoCreateActivity7.abc10030;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoCreateActivity.this.abc10030.remove(0);
                    }
                    ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc1000;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc1000.remove(0);
                    }
                }
                LogoCreateActivity.this.abc10040 = true;
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int i3 = logoCreateActivity.abc10028;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    if (logoCreateActivity.abc10075 == null) {
                        logoCreateActivity.abc10075 = new String[10];
                    }
                    i2++;
                }
                if (logoCreateActivity.abc10050 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10050;
                        if (i4 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i4] = 0;
                        i4++;
                    }
                }
            } else if (i == 1) {
                LogoCreateActivity.this.showFirstMenu();
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                if (logoCreateActivity8.abc10026 < 0.7879241d) {
                    logoCreateActivity8.abc10026 = 0.42621082f;
                }
                if (logoCreateActivity8.abc10078.size() < 6) {
                    LogoCreateActivity.this.abc10078.add(2);
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                if (logoCreateActivity9.abc10037 == null) {
                    logoCreateActivity9.abc10037 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc19 != null) {
                    int i5 = 0;
                    while (true) {
                        logoCreateActivity2 = LogoCreateActivity.this;
                        String[] strArr2 = logoCreateActivity2.abc19;
                        if (i5 >= strArr2.length) {
                            break;
                        }
                        strArr2[i5] = "string" + i5;
                        LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                        int[] iArr2 = logoCreateActivity10.abc10042;
                        if (iArr2 != null) {
                            iArr2[2] = 0;
                        }
                        ArrayList<String> arrayList4 = logoCreateActivity10.abc10036;
                        if (arrayList4 != null && arrayList4.size() > 0) {
                            LogoCreateActivity.this.abc10036.remove(0);
                        }
                        ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10010;
                        if (arrayList5 == null && arrayList5.size() > 0) {
                            LogoCreateActivity.this.abc10010.remove(0);
                        }
                        i5++;
                    }
                    String[] strArr3 = logoCreateActivity2.abc10031;
                    if (strArr3 != null) {
                        strArr3[1] = "ern novels";
                    }
                    logoCreateActivity2.abc10033 = !logoCreateActivity2.abc10033;
                    logoCreateActivity2.abc10038 += 0.7291988f;
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc1008 = 7;
                String[] strArr4 = logoCreateActivity11.abc10021;
                if (strArr4 != null) {
                    strArr4[1] = "ra";
                }
                if (logoCreateActivity11.abc10043 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr5 = LogoCreateActivity.this.abc10043;
                        if (i6 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                            break;
                        }
                        strArr5[i6] = "string" + i6;
                        i6++;
                    }
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                if (logoCreateActivity12.abc24 < 0.8646611047928977d) {
                    logoCreateActivity12.abc24 = 0.7581875423420642d;
                    String[] strArr6 = logoCreateActivity12.abc10075;
                    if (strArr6 != null) {
                        strArr6[8] = "ga";
                    }
                    if (logoCreateActivity12.abc10037 == null) {
                        logoCreateActivity12.abc10037 = new ArrayList<>();
                    }
                    LogoCreateActivity.this.abc1007 = 0.15180475f;
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                logoCreateActivity13.abc10052 *= 2;
                if (logoCreateActivity13.abc10046 < 0) {
                    logoCreateActivity13.abc10046 = 8;
                }
                if (logoCreateActivity13.abc10011.size() > 4) {
                    LogoCreateActivity.this.abc10011.add(1);
                }
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity14.abc10017;
            if (iArr3 != null) {
                iArr3[2] = 0;
            }
            if (!TextUtils.isEmpty(logoCreateActivity14.abc10062)) {
                int length2 = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
            }
            ArrayList<Integer> arrayList6 = LogoCreateActivity.this.abc10010;
            if (arrayList6 == null && arrayList6.size() > 0) {
                LogoCreateActivity.this.abc10010.remove(0);
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            String[] strArr7 = logoCreateActivity15.abc33;
            if (strArr7 != null) {
                strArr7[0] = "au";
                int[] iArr4 = logoCreateActivity15.abc10041;
                if (iArr4 != null) {
                    iArr4[6] = 3;
                }
                if (logoCreateActivity15.abc10070.size() > 0) {
                    LogoCreateActivity.this.abc10070.add("e nega");
                }
                LogoCreateActivity.this.abc10038 += 0.27906924f;
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            logoCreateActivity16.abc10038 = 0.83235306f;
            String[] strArr8 = logoCreateActivity16.abc10015;
            if (strArr8 != null) {
                strArr8[6] = "vel";
            }
            if (logoCreateActivity16.abc1007 < 0.0111243725d) {
                logoCreateActivity16.abc1007 = 0.08235848f;
            }
            logoCreateActivity16.createVM.hideColorFinderLayout();
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            if (logoCreateActivity17.abc10036 == null) {
                logoCreateActivity17.abc10036 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
            if (logoCreateActivity18.abc10067 == null) {
                logoCreateActivity18.abc10067 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
            int[] iArr5 = logoCreateActivity19.abc10061;
            if (iArr5 != null) {
                iArr5[4] = 8;
            }
            if (logoCreateActivity19.abc34 == null) {
                logoCreateActivity19.abc34 = new int[10];
                String[] strArr9 = logoCreateActivity19.abc10077;
                if (strArr9 != null) {
                    strArr9[1] = null;
                }
                if (!TextUtils.isEmpty(logoCreateActivity19.abc10054)) {
                    int length3 = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length3;
                }
                int[] iArr6 = LogoCreateActivity.this.abc10017;
                if (iArr6 != null) {
                    iArr6[8] = 0;
                }
            }
            ArrayList<String> arrayList7 = LogoCreateActivity.this.abc10036;
            if (arrayList7 != null && arrayList7.size() > 0) {
                LogoCreateActivity.this.abc10036.remove(0);
            }
            LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
            if (logoCreateActivity20.abc10034 == null) {
                logoCreateActivity20.abc10034 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10077 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr10 = LogoCreateActivity.this.abc10077;
                    if (i7 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                        break;
                    }
                    strArr10[i7] = "string" + i7;
                    i7++;
                }
            }
            LogoCreateActivity.this.createVM.hideColorRainbowLayout();
            LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
            if (logoCreateActivity21.abc10024 == null) {
                logoCreateActivity21.abc10024 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
            int[] iArr7 = logoCreateActivity22.abc10061;
            if (iArr7 != null) {
                iArr7[8] = 0;
            }
            if (logoCreateActivity22.abc10026 < 0.34845525d) {
                logoCreateActivity22.abc10026 = 0.38961107f;
            }
            logoCreateActivity22.abc39 = -logoCreateActivity22.abc39;
            logoCreateActivity22.abc10064 = "icati";
            logoCreateActivity22.abc10027 = 0.82083464f;
            if (logoCreateActivity22.abc1000.size() < 1) {
                LogoCreateActivity.this.abc1000.add(1);
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$o0 */
    /* loaded from: classes3.dex */
    public class C9499o0 implements Observer<Boolean> {
        public C9499o0() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            if (bool.booleanValue()) {
                LogoCreateActivity.this.binding.drawview.setEditBackgound(true);
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc10056 == null) {
                    logoCreateActivity4.abc10056 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity5.abc10041;
                if (iArr != null) {
                    iArr[3] = 5;
                }
                logoCreateActivity5.abc10032 = false;
                logoCreateActivity5.lastBgSrcRect = logoCreateActivity5.binding.drawview.getCurrentBackgroudSrcRect();
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10066 = 0.31123853f;
                String[] strArr = logoCreateActivity6.abc10022;
                if (strArr != null) {
                    strArr[5] = null;
                }
                if (logoCreateActivity6.abc10034 == null) {
                    logoCreateActivity6.abc10034 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc38 = Math.abs(logoCreateActivity7.abc38);
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                if (logoCreateActivity8.abc10048 == null) {
                    logoCreateActivity8.abc10048 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                if (logoCreateActivity9.abc10023 == null) {
                    logoCreateActivity9.abc10023 = new String[10];
                }
                ArrayList<String> arrayList = logoCreateActivity9.abc1003;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc1003.remove(0);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                logoCreateActivity10.showView(logoCreateActivity10.binding.includeBackground.getRoot(), new View[0]);
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc1007 *= 0.35074055f;
                if (logoCreateActivity11.abc10052 < 0) {
                    logoCreateActivity11.abc10052 = 4;
                }
                if (logoCreateActivity11.abc10067 == null) {
                    logoCreateActivity11.abc10067 = new ArrayList<>();
                }
                LogoCreateActivity.this.hideFirstMenu();
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                String[] strArr2 = logoCreateActivity12.abc10023;
                if (strArr2 != null) {
                    strArr2[4] = null;
                }
                if (logoCreateActivity12.abc10057 == null) {
                    logoCreateActivity12.abc10057 = new String[10];
                }
                logoCreateActivity12.abc10029 = false;
                ArrayList<Integer> arrayList2 = logoCreateActivity12.abc2;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc2.remove(0);
                    LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                    if (logoCreateActivity13.abc10071 == null) {
                        logoCreateActivity13.abc10071 = new String[10];
                    }
                    logoCreateActivity13.abc10046 = logoCreateActivity13.abc10046 > 8 ? 8 : 1;
                    logoCreateActivity13.abc1007 = 0.04437393f;
                }
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                logoCreateActivity14.abc10072 = false;
                if (logoCreateActivity14.abc10026 > 0.5179354d) {
                    logoCreateActivity14.abc10026 = 0.37547958f;
                }
                if (logoCreateActivity14.abc10025 > 0.5726363d) {
                    logoCreateActivity14.abc10025 = 0.02425754f;
                }
            } else {
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                logoCreateActivity15.hideView(logoCreateActivity15.binding.includeBackground.getRoot(), new View[0]);
                if (LogoCreateActivity.this.abc10034.size() > 5) {
                    LogoCreateActivity.this.abc10034.add(8);
                }
                LogoCreateActivity.this.abc10035 = !logoCreateActivity.abc10035;
                int i = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    int i2 = logoCreateActivity2.abc10046;
                    if (i2 > 3) {
                        i2 = 3;
                    }
                    if (i >= i2) {
                        break;
                    }
                    logoCreateActivity2.abc10066 = 0.6504999f;
                    i++;
                }
                int[] iArr2 = logoCreateActivity2.abc1;
                if (iArr2 != null) {
                    iArr2[3] = 0;
                    ArrayList<Integer> arrayList3 = logoCreateActivity2.abc10010;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc10010.remove(0);
                    }
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                        int length = LogoCreateActivity.this.abc10054.length();
                        LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
                    }
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10012)) {
                        int length2 = LogoCreateActivity.this.abc10012.length();
                        LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length2;
                    }
                }
                ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc10011;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                logoCreateActivity16.abc10035 = false;
                String[] strArr3 = logoCreateActivity16.abc10016;
                if (strArr3 != null) {
                    strArr3[9] = "de and Pre";
                }
            }
            if (LogoCreateActivity.this.abc10057 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr4 = LogoCreateActivity.this.abc10057;
                    if (i3 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            if (logoCreateActivity17.abc10077 == null) {
                logoCreateActivity17.abc10077 = new String[10];
            }
            if (logoCreateActivity17.abc10030.size() < 8) {
                LogoCreateActivity.this.abc10030.add(7);
            }
            if (LogoCreateActivity.this.abc33 != null) {
                int i4 = 0;
                while (true) {
                    logoCreateActivity3 = LogoCreateActivity.this;
                    String[] strArr5 = logoCreateActivity3.abc33;
                    if (i4 >= strArr5.length) {
                        break;
                    }
                    strArr5[i4] = "string" + i4;
                    LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                    logoCreateActivity18.abc10020 = logoCreateActivity18.abc10020 * 0.553829f;
                    if (logoCreateActivity18.abc10037 == null) {
                        logoCreateActivity18.abc10037 = new ArrayList<>();
                    }
                    LogoCreateActivity.this.abc10027 = 0.8761968f;
                    i4++;
                }
                if (logoCreateActivity3.abc10021 == null) {
                    logoCreateActivity3.abc10021 = new String[10];
                }
                if (logoCreateActivity3.abc10048 == null) {
                    logoCreateActivity3.abc10048 = new ArrayList<>();
                }
                String[] strArr6 = LogoCreateActivity.this.abc10031;
                if (strArr6 != null) {
                    strArr6[2] = " reputat";
                }
            }
            LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
            logoCreateActivity19.abc10065 = true;
            logoCreateActivity19.abc10013 *= 0.9958552f;
            ArrayList<Integer> arrayList5 = logoCreateActivity19.abc10037;
            if (arrayList5 != null || arrayList5.size() <= 0) {
                return;
            }
            LogoCreateActivity.this.abc10037.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$o1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9500o1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9500o1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity.this.stopMove = false;
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10068 > 0.7639472301808184d) {
                logoCreateActivity.abc10068 = 0.2674694035250541d;
            }
            logoCreateActivity.abc10033 = true;
            if (logoCreateActivity.abc10037 == null) {
                logoCreateActivity.abc10037 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity2.abc1;
            if (iArr != null) {
                iArr[2] = 6;
                if (logoCreateActivity2.abc10021 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10021;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10026 = 0.17316437f;
                if (logoCreateActivity3.abc10074.size() < 6) {
                    LogoCreateActivity.this.abc10074.add(2);
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10040 = true;
            logoCreateActivity4.abc10066 = 0.45346904f;
            if (logoCreateActivity4.abc1005 > 0) {
                logoCreateActivity4.abc1005 = 3;
            }
            logoCreateActivity4.startMove(0, -5);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10028 = -logoCreateActivity5.abc10028;
            if (logoCreateActivity5.abc10045 == null) {
                logoCreateActivity5.abc10045 = new int[10];
            }
            int[] iArr2 = logoCreateActivity5.abc10041;
            if (iArr2 != null) {
                iArr2[4] = 0;
            }
            logoCreateActivity5.abc10 = true ^ logoCreateActivity5.abc10;
            int[] iArr3 = logoCreateActivity5.abc10042;
            if (iArr3 != null) {
                iArr3[8] = 0;
            }
            if (iArr2 != null) {
                iArr2[2] = 0;
            }
            if (logoCreateActivity5.abc10067 == null) {
                logoCreateActivity5.abc10067 = new ArrayList<>();
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$o2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9501o2 implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15723a;

        /* renamed from: b */
        public final /* synthetic */ View[] f15724b;

        public animationAnimation$AnimationListenerC9501o2(View view, View[] viewArr) {
            this.f15723a = view;
            this.f15724b = viewArr;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            LogoCreateActivity logoCreateActivity;
            this.f15723a.clearAnimation();
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10066 = 0.45209098f;
            ArrayList<String> arrayList = logoCreateActivity2.abc1003;
            int i = 0;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity3.abc10041;
            if (iArr != null) {
                iArr[4] = 3;
            }
            if (logoCreateActivity3.abc36 == null) {
                logoCreateActivity3.abc36 = new String[10];
                String[] strArr = logoCreateActivity3.abc10023;
                if (strArr != null) {
                    strArr[6] = "we";
                }
                if (logoCreateActivity3.abc10056 == null) {
                    logoCreateActivity3.abc10056 = new ArrayList<>();
                }
                LogoCreateActivity.this.abc10051 = 0.38973889133652917d;
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10029 = !logoCreateActivity4.abc10029;
            if (logoCreateActivity4.abc10063 < 0.6798349d) {
                logoCreateActivity4.abc10063 = 0.9508404f;
            }
            String[] strArr2 = logoCreateActivity4.abc10043;
            if (strArr2 != null) {
                strArr2[7] = "r";
            }
            this.f15723a.setVisibility(4);
            ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10078;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10078.remove(0);
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc1007 = 0.06597179f;
            if (!TextUtils.isEmpty(logoCreateActivity5.abc10064)) {
                int length = LogoCreateActivity.this.abc10064.length();
                LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity6.abc6;
            if (iArr2 != null) {
                iArr2[4] = 0;
                ArrayList<String> arrayList3 = logoCreateActivity6.abc10048;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10048.remove(0);
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc10062 = InneractiveMediationDefs.GENDER_MALE;
                logoCreateActivity7.abc1004 = !logoCreateActivity7.abc1004;
            }
            if (LogoCreateActivity.this.abc10037.size() > 0) {
                LogoCreateActivity.this.abc10037.add(1);
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10058 > 0.6719207004381745d) {
                logoCreateActivity8.abc10058 = 0.6929827669845552d;
            }
            logoCreateActivity8.abc10051 *= 0.09130871960211562d;
            this.f15723a.setTag(null);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10019 = logoCreateActivity9.abc10019 > 9 ? 4 : 0;
            logoCreateActivity9.abc10040 = true;
            logoCreateActivity9.abc10065 = !logoCreateActivity9.abc10065;
            logoCreateActivity9.abc17 -= 0.9238306063530751d;
            if (logoCreateActivity9.abc10071 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr3 = LogoCreateActivity.this.abc10071;
                    if (i2 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc10049 = false;
            logoCreateActivity10.abc10076 = !logoCreateActivity10.abc10076;
            int i3 = 0;
            while (true) {
                View[] viewArr = this.f15724b;
                if (i3 >= viewArr.length) {
                    break;
                }
                viewArr[i3].setVisibility(4);
                ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc10010;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10010.remove(0);
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc10025 = 0.48029566f;
                boolean z = !logoCreateActivity11.abc10035;
                logoCreateActivity11.abc10035 = z;
                logoCreateActivity11.abc4 = 0.33757883f;
                logoCreateActivity11.abc10069 = ReportUtil.f18058a;
                logoCreateActivity11.abc10038 = 0.96109134f;
                logoCreateActivity11.abc10035 = !z;
                i3++;
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            String[] strArr4 = logoCreateActivity12.abc10023;
            if (strArr4 != null) {
                strArr4[6] = null;
            }
            ArrayList<Integer> arrayList5 = logoCreateActivity12.abc10074;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoCreateActivity.this.abc10074.remove(0);
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc10040 = false;
            if (logoCreateActivity13.abc32 != null) {
                int i4 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr3 = logoCreateActivity.abc32;
                    if (i4 >= iArr3.length) {
                        break;
                    }
                    iArr3[i4] = 6;
                    logoCreateActivity.abc10052 = Math.abs(logoCreateActivity.abc10052);
                    LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                    logoCreateActivity14.abc10032 = !logoCreateActivity14.abc10032;
                    logoCreateActivity14.abc10069 = ",";
                    i4++;
                }
                if (logoCreateActivity.abc10056.size() < 3) {
                    LogoCreateActivity.this.abc10056.add(4);
                }
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                if (logoCreateActivity15.abc10055 == null) {
                    logoCreateActivity15.abc10055 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10018.size() > 5) {
                    LogoCreateActivity.this.abc10018.add("ve");
                }
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            String[] strArr5 = logoCreateActivity16.abc10031;
            if (strArr5 != null) {
                strArr5[0] = null;
            }
            if (logoCreateActivity16.abc10060 != null) {
                while (true) {
                    String[] strArr6 = LogoCreateActivity.this.abc10060;
                    if (i >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
            if (logoCreateActivity17.abc10023 == null) {
                logoCreateActivity17.abc10023 = new String[10];
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$p */
    /* loaded from: classes3.dex */
    public class C9502p implements Observer<String> {
        public C9502p() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(String str) {
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc1000;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc1000.remove(0);
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity.abc10043;
            if (strArr != null) {
                strArr[7] = null;
            }
            if (logoCreateActivity.abc10014 == null) {
                logoCreateActivity.abc10014 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc13 == null) {
                logoCreateActivity2.abc13 = new int[10];
                ArrayList<Integer> arrayList2 = logoCreateActivity2.abc10055;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10055.remove(0);
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity3.abc10061;
                if (iArr != null) {
                    iArr[4] = 0;
                }
                if (logoCreateActivity3.abc10037.size() > 1) {
                    LogoCreateActivity.this.abc10037.add(0);
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10029 = false;
            logoCreateActivity4.abc1004 = !logoCreateActivity4.abc1004;
            if (logoCreateActivity4.abc10022 == null) {
                logoCreateActivity4.abc10022 = new String[10];
            }
            try {
                Color.parseColor(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$p0 */
    /* loaded from: classes3.dex */
    public class C9503p0 implements Observer<Boolean> {
        public C9503p0() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            if (bool.booleanValue()) {
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.showView(logoCreateActivity3.binding.includeFont.getRoot(), new View[0]);
                if (LogoCreateActivity.this.abc10073 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10073;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc1001 == null) {
                    logoCreateActivity4.abc1001 = new String[10];
                }
                logoCreateActivity4.abc10064 = " took";
                if (logoCreateActivity4.abc19 != null) {
                    int i2 = 0;
                    while (true) {
                        logoCreateActivity2 = LogoCreateActivity.this;
                        String[] strArr2 = logoCreateActivity2.abc19;
                        if (i2 >= strArr2.length) {
                            break;
                        }
                        strArr2[i2] = "string" + i2;
                        LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                        if (logoCreateActivity5.abc10068 < 0.4065619981421432d) {
                            logoCreateActivity5.abc10068 = 0.3850922324280984d;
                        }
                        logoCreateActivity5.abc10027 = 0.5071995f;
                        ArrayList<String> arrayList = logoCreateActivity5.abc1003;
                        if (arrayList != null && arrayList.size() > 0) {
                            LogoCreateActivity.this.abc1003.remove(0);
                        }
                        i2++;
                    }
                    logoCreateActivity2.abc10059 = "nov";
                    if (logoCreateActivity2.abc10039.size() > 3) {
                        LogoCreateActivity.this.abc10039.add(" really ");
                    }
                    ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10018;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        LogoCreateActivity.this.abc10018.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10035 = true;
                if (logoCreateActivity6.abc10037 == null) {
                    logoCreateActivity6.abc10037 = new ArrayList<>();
                }
                String[] strArr3 = LogoCreateActivity.this.abc10043;
                if (strArr3 != null) {
                    strArr3[2] = null;
                }
            } else {
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.hideView(logoCreateActivity7.binding.includeFont.getRoot(), new View[0]);
                if (LogoCreateActivity.this.abc10057 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10057;
                        if (i3 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i3] = "string" + i3;
                        i3++;
                    }
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10027 = 0.7041352f;
                ArrayList<Integer> arrayList3 = logoCreateActivity8.abc10056;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10056.remove(0);
                }
                if (LogoCreateActivity.this.abc9.size() < 4) {
                    LogoCreateActivity.this.abc9.add(" n");
                    LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                    logoCreateActivity9.abc10040 = true;
                    if (logoCreateActivity9.abc10042 != null) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr = LogoCreateActivity.this.abc10042;
                            if (i4 >= (iArr.length > 3 ? 3 : iArr.length)) {
                                break;
                            }
                            iArr[i4] = 2;
                            i4++;
                        }
                    }
                    if (LogoCreateActivity.this.abc10015 != null) {
                        int i5 = 0;
                        while (true) {
                            String[] strArr5 = LogoCreateActivity.this.abc10015;
                            if (i5 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                                break;
                            }
                            strArr5[i5] = "string" + i5;
                            i5++;
                        }
                    }
                }
                if (LogoCreateActivity.this.abc10030.size() < 7) {
                    LogoCreateActivity.this.abc10030.add(3);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                logoCreateActivity10.abc10063 += 0.44649345f;
                logoCreateActivity10.abc10068 *= 0.48488307593636193d;
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10052++;
            ArrayList<String> arrayList4 = logoCreateActivity11.abc10039;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc10039.remove(0);
            }
            ArrayList<String> arrayList5 = LogoCreateActivity.this.abc10018;
            if (arrayList5 != null && arrayList5.size() > 0) {
                LogoCreateActivity.this.abc10018.remove(0);
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc4 = Math.abs(logoCreateActivity12.abc4);
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            String[] strArr6 = logoCreateActivity13.abc10016;
            if (strArr6 != null) {
                strArr6[3] = " ";
            }
            ArrayList<String> arrayList6 = logoCreateActivity13.abc1003;
            if (arrayList6 != null && arrayList6.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            LogoCreateActivity.this.abc10049 = !logoCreateActivity.abc10049;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$p1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9504p1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9504p1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity.this.stopMove = false;
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc10036 == null) {
                logoCreateActivity3.abc10036 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10024 == null) {
                logoCreateActivity4.abc10024 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc1003 == null) {
                logoCreateActivity5.abc1003 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc35.size() > 0) {
                LogoCreateActivity.this.abc35.add(7);
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10049 = !logoCreateActivity6.abc10049;
                if (logoCreateActivity6.abc1003.size() > 1) {
                    LogoCreateActivity.this.abc1003.add("its pl");
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                if (logoCreateActivity7.abc10023 == null) {
                    logoCreateActivity7.abc10023 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10019 = logoCreateActivity8.abc10019 < 3 ? 9 : 5;
            int[] iArr = logoCreateActivity8.abc10061;
            if (iArr != null) {
                iArr[0] = 0;
            }
            int i = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i2 = logoCreateActivity.abc10046;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                logoCreateActivity.abc10063 = ((double) logoCreateActivity.abc10063) < 0.19674456d ? 0.34002513f : 0.07523483f;
                i++;
            }
            logoCreateActivity.startMove(-5, 0);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            if (logoCreateActivity9.abc10066 > 0.11989063d) {
                logoCreateActivity9.abc10066 = 0.29076594f;
            }
            logoCreateActivity9.abc10033 = !logoCreateActivity9.abc10033;
            if (!TextUtils.isEmpty(logoCreateActivity9.abc10064)) {
                int length = LogoCreateActivity.this.abc10064.length();
                LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
            }
            if (LogoCreateActivity.this.abc6 != null) {
                int i3 = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    int[] iArr2 = logoCreateActivity2.abc6;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    iArr2[i3] = 9;
                    logoCreateActivity2.abc10020 = 0.6819902f;
                    logoCreateActivity2.abc10058 = 0.016490406291923665d;
                    if (logoCreateActivity2.abc10060 == null) {
                        logoCreateActivity2.abc10060 = new String[10];
                    }
                    i3++;
                }
                String[] strArr = logoCreateActivity2.abc10031;
                if (strArr != null) {
                    strArr[4] = "orced";
                }
                logoCreateActivity2.abc10072 = !logoCreateActivity2.abc10072;
                if (logoCreateActivity2.abc10011 == null) {
                    logoCreateActivity2.abc10011 = new ArrayList<>();
                }
            }
            if (LogoCreateActivity.this.abc10037.size() < 8) {
                LogoCreateActivity.this.abc10037.add(2);
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc10051 = 0.38733857886230993d;
            ArrayList<String> arrayList = logoCreateActivity10.abc10067;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10067.remove(0);
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$p2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9505p2 implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15729a;

        public animationAnimation$AnimationListenerC9505p2(View view) {
            this.f15729a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15729a.clearAnimation();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10032 = true;
            if (logoCreateActivity.abc10057 == null) {
                logoCreateActivity.abc10057 = new String[10];
            }
            int[] iArr = logoCreateActivity.abc10017;
            if (iArr != null) {
                iArr[1] = 1;
            }
            ArrayList<String> arrayList = logoCreateActivity.abc8;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc8.remove(0);
                ArrayList<Integer> arrayList2 = LogoCreateActivity.this.abc10014;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10014.remove(0);
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                String[] strArr = logoCreateActivity2.abc10016;
                if (strArr != null) {
                    strArr[2] = null;
                }
                ArrayList<String> arrayList3 = logoCreateActivity2.abc1003;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc1003.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity3.abc1001;
            if (strArr2 != null) {
                strArr2[2] = null;
            }
            logoCreateActivity3.abc10051 -= 0.2270603878349966d;
            ArrayList<Integer> arrayList4 = logoCreateActivity3.abc10011;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc10011.remove(0);
            }
            this.f15729a.setEnabled(true);
            ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10030;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoCreateActivity.this.abc10030.remove(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10029 = false;
            if (logoCreateActivity4.abc10034 == null) {
                logoCreateActivity4.abc10034 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity5.abc22;
            if (iArr2 != null) {
                iArr2[7] = 0;
                logoCreateActivity5.abc1008 = 0;
                logoCreateActivity5.abc1007 = 0.09331858f;
                ArrayList<Integer> arrayList6 = logoCreateActivity5.abc10055;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoCreateActivity.this.abc10055.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10025 *= 0.20004684f;
            String[] strArr3 = logoCreateActivity6.abc10057;
            if (strArr3 != null) {
                strArr3[0] = "nov";
            }
            if (!TextUtils.isEmpty(logoCreateActivity6.abc10069)) {
                int length = LogoCreateActivity.this.abc10069.length();
                LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length;
            }
            this.f15729a.setTag(null);
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity7.abc10061;
            if (iArr3 != null) {
                iArr3[2] = 0;
            }
            if (logoCreateActivity7.abc10042 == null) {
                logoCreateActivity7.abc10042 = new int[10];
            }
            logoCreateActivity7.abc10025 = 0.29873556f;
            logoCreateActivity7.abc17 = 0.14888549237587123d;
            if (logoCreateActivity7.abc10010 == null) {
                logoCreateActivity7.abc10010 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10047 == null) {
                logoCreateActivity8.abc10047 = new int[10];
            }
            logoCreateActivity8.abc10076 = true ^ logoCreateActivity8.abc10076;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$q */
    /* loaded from: classes3.dex */
    public class C9506q implements TextView.OnEditorActionListener {
        public C9506q() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6 || i == 2 || i == 5) {
                try {
                    String charSequence = textView.getText().toString();
                    int parseColor = Color.parseColor(charSequence);
                    LogoCreateActivity.this.binding.includeColorRainbow.lrvColor.setSelectedColor(parseColor);
                    LogoCreateActivity.this.binding.includeColorRainbow.lcsvColor.setColor(parseColor);
                    int i2 = LogoCreateActivity.this.rainbowType;
                    if (i2 == 0) {
                        LogoCreateActivity.this.binding.drawview.setFillColor(Integer.valueOf(parseColor));
                    } else if (i2 == 1) {
                        LogoCreateActivity.this.binding.drawview.setCanvasBackgroundColor(Integer.valueOf(parseColor));
                    }
                    LogoCreateActivity.this.createVM.setCurrentColor(charSequence.toUpperCase());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            ArrayList<String> arrayList = LogoCreateActivity.this.abc10036;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10036.remove(0);
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10038 < 0.26126063d) {
                logoCreateActivity.abc10038 = 0.11661798f;
            }
            String[] strArr = logoCreateActivity.abc10060;
            if (strArr != null) {
                strArr[9] = null;
            }
            if (logoCreateActivity.abc20 == null) {
                logoCreateActivity.abc20 = new int[10];
                int[] iArr = logoCreateActivity.abc10061;
                if (iArr != null) {
                    iArr[8] = 0;
                }
                logoCreateActivity.abc10028 = 1;
                if (logoCreateActivity.abc10036.size() > 8) {
                    LogoCreateActivity.this.abc10036.add(" c");
                }
            }
            if (LogoCreateActivity.this.abc10014.size() < 0) {
                LogoCreateActivity.this.abc10014.add(5);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10050 == null) {
                logoCreateActivity2.abc10050 = new int[10];
            }
            if (logoCreateActivity2.abc10070.size() > 5) {
                LogoCreateActivity.this.abc10070.add(" wri");
            }
            return true;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$q0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9507q0 implements View.OnClickListener {
        public View$OnClickListenerC9507q0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity.this.showFirstMenu();
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc10010 == null) {
                logoCreateActivity3.abc10010 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10059 = "art";
            logoCreateActivity4.abc10012 = "ice is";
            logoCreateActivity4.binding.drawview.m9108R(logoCreateActivity4.lastBgImage, LogoCreateActivity.this.lastBgColor, LogoCreateActivity.this.lastBgSrcRect);
            if (LogoCreateActivity.this.abc10057 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10057;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10029 = true;
            logoCreateActivity5.abc10072 = false;
            if (logoCreateActivity5.abc30 < 0) {
                logoCreateActivity5.abc30 = 4;
                if (logoCreateActivity5.abc10074 == null) {
                    logoCreateActivity5.abc10074 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10046 = Math.abs(logoCreateActivity6.abc10046);
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                if (logoCreateActivity7.abc10045 == null) {
                    logoCreateActivity7.abc10045 = new int[10];
                }
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity8.abc10071;
            if (strArr2 != null) {
                strArr2[9] = "ion ";
            }
            int[] iArr = logoCreateActivity8.abc10061;
            if (iArr != null) {
                iArr[5] = 6;
            }
            String[] strArr3 = logoCreateActivity8.abc10043;
            if (strArr3 != null) {
                strArr3[1] = null;
            }
            logoCreateActivity8.binding.drawview.setEditBackgound(false);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity9.abc10047;
            if (iArr2 != null) {
                iArr2[2] = 5;
            }
            logoCreateActivity9.abc1005 = logoCreateActivity9.abc1005 > 4 ? 1 : 0;
            logoCreateActivity9.abc1004 = !logoCreateActivity9.abc1004;
            logoCreateActivity9.abc24 = 0.4877433310030015d;
            if (logoCreateActivity9.abc10060 == null) {
                logoCreateActivity9.abc10060 = new String[10];
            }
            if (logoCreateActivity9.abc10022 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr4 = LogoCreateActivity.this.abc10022;
                    if (i2 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i2] = "string" + i2;
                    i2++;
                }
            }
            int i3 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i4 = logoCreateActivity.abc10046;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                logoCreateActivity.abc10013 -= 0.122472584f;
                i3++;
            }
            logoCreateActivity.createVM.hideBackgroundLayout();
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity10.abc10050;
            if (iArr3 != null) {
                iArr3[7] = 0;
            }
            logoCreateActivity10.abc10065 = !logoCreateActivity10.abc10065;
            logoCreateActivity10.abc1005 = logoCreateActivity10.abc1005 <= 3 ? 8 : 5;
            String[] strArr5 = logoCreateActivity10.abc19;
            if (strArr5 != null) {
                strArr5[0] = "此事要躬行！总资产5";
                logoCreateActivity10.abc10040 = false;
                if (logoCreateActivity10.abc10024.size() > 6) {
                    LogoCreateActivity.this.abc10024.add("the i");
                }
                LogoCreateActivity.this.abc10033 = !logoCreateActivity2.abc10033;
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            int[] iArr4 = logoCreateActivity11.abc10017;
            if (iArr4 != null) {
                iArr4[6] = 0;
            }
            if (logoCreateActivity11.abc10025 > 0.49608266d) {
                logoCreateActivity11.abc10025 = 0.7232372f;
            }
            logoCreateActivity11.abc10058 = -logoCreateActivity11.abc10058;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$q1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9508q1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9508q1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity.this.stopMove = false;
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity.abc10050;
            if (iArr != null) {
                iArr[3] = 0;
            }
            String[] strArr = logoCreateActivity.abc10022;
            if (strArr != null) {
                strArr[3] = null;
            }
            if (logoCreateActivity.abc10024 == null) {
                logoCreateActivity.abc10024 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity2.abc19;
            if (strArr2 != null) {
                strArr2[7] = "adius_top_";
                logoCreateActivity2.abc10027 = Math.abs(logoCreateActivity2.abc10027);
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10040 = !logoCreateActivity3.abc10040;
                if (logoCreateActivity3.abc10017 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr2 = LogoCreateActivity.this.abc10017;
                        if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i] = 6;
                        i++;
                    }
                }
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                int length = LogoCreateActivity.this.abc10054.length();
                LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
            }
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10030;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10030.remove(0);
            }
            if (LogoCreateActivity.this.abc10056.size() > 0) {
                LogoCreateActivity.this.abc10056.add(9);
            }
            LogoCreateActivity.this.startMove(5, 0);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10021 == null) {
                logoCreateActivity4.abc10021 = new String[10];
            }
            int[] iArr3 = logoCreateActivity4.abc10045;
            if (iArr3 != null) {
                iArr3[9] = 4;
            }
            logoCreateActivity4.abc10029 = false;
            int[] iArr4 = logoCreateActivity4.abc16;
            if (iArr4 != null) {
                iArr4[3] = 0;
                logoCreateActivity4.abc10025 = 0.30599427f;
                if (logoCreateActivity4.abc10020 < 0.067040086d) {
                    logoCreateActivity4.abc10020 = 0.7998536f;
                }
                if (logoCreateActivity4.abc10034.size() < 2) {
                    LogoCreateActivity.this.abc10034.add(1);
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity5.abc10022;
            if (strArr3 != null) {
                strArr3[6] = " a book ";
            }
            String[] strArr4 = logoCreateActivity5.abc10016;
            if (strArr4 != null) {
                strArr4[7] = "s";
            }
            logoCreateActivity5.abc10066 = 0.20902723f;
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$q2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9509q2 implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15734a;

        /* renamed from: b */
        public final /* synthetic */ View[] f15735b;

        public animationAnimation$AnimationListenerC9509q2(View view, View[] viewArr) {
            this.f15734a = view;
            this.f15735b = viewArr;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            this.f15734a.clearAnimation();
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity3.abc10021;
            if (strArr != null) {
                strArr[1] = null;
            }
            String[] strArr2 = logoCreateActivity3.abc10077;
            int i = 0;
            if (strArr2 != null) {
                strArr2[0] = null;
            }
            logoCreateActivity3.abc10072 = !logoCreateActivity3.abc10072;
            if (logoCreateActivity3.abc36 == null) {
                logoCreateActivity3.abc36 = new String[10];
                String[] strArr3 = logoCreateActivity3.abc10073;
                if (strArr3 != null) {
                    strArr3[9] = null;
                }
                ArrayList<String> arrayList = logoCreateActivity3.abc10018;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
                if (LogoCreateActivity.this.abc10055.size() < 3) {
                    LogoCreateActivity.this.abc10055.add(2);
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity4.abc10047;
            if (iArr != null) {
                iArr[7] = 1;
            }
            String[] strArr4 = logoCreateActivity4.abc10023;
            if (strArr4 != null) {
                strArr4[1] = null;
            }
            logoCreateActivity4.abc10049 = false;
            this.f15734a.setVisibility(4);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10026 = 0.08631879f;
            ArrayList<Integer> arrayList2 = logoCreateActivity5.abc10034;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10034.remove(0);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10064 = "t took dec";
            int[] iArr2 = logoCreateActivity6.abc6;
            if (iArr2 != null) {
                iArr2[4] = 0;
                int[] iArr3 = logoCreateActivity6.abc10061;
                if (iArr3 != null) {
                    iArr3[8] = 8;
                }
                int i2 = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    int i3 = logoCreateActivity2.abc1008;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    if (logoCreateActivity2.abc10036.size() < 2) {
                        LogoCreateActivity.this.abc10036.add("ways de");
                    }
                    i2++;
                }
                logoCreateActivity2.abc10040 = false;
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10063 = Math.abs(logoCreateActivity7.abc10063);
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            int[] iArr4 = logoCreateActivity8.abc10047;
            if (iArr4 != null) {
                iArr4[6] = 0;
            }
            if (logoCreateActivity8.abc10025 < 0.06765026d) {
                logoCreateActivity8.abc10025 = 0.21997118f;
            }
            this.f15734a.setTag(null);
            ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10014;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10014.remove(0);
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10065 = true;
            String[] strArr5 = logoCreateActivity9.abc10077;
            if (strArr5 != null) {
                strArr5[2] = null;
            }
            logoCreateActivity9.abc17 -= 0.9238306063530751d;
            if (logoCreateActivity9.abc10014 == null) {
                logoCreateActivity9.abc10014 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc10052 = logoCreateActivity10.abc10052 < 9 ? 0 : 5;
            int[] iArr5 = logoCreateActivity10.abc10061;
            if (iArr5 != null) {
                iArr5[2] = 3;
            }
            int i4 = 0;
            while (true) {
                View[] viewArr = this.f15735b;
                if (i4 >= viewArr.length) {
                    break;
                }
                viewArr[i4].setVisibility(4);
                ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc10074;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10074.remove(0);
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc10038 = -logoCreateActivity11.abc10038;
                ArrayList<Integer> arrayList5 = logoCreateActivity11.abc10034;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10034.remove(0);
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc4 = 0.33757883f;
                logoCreateActivity12.abc10063 = 0.73849845f;
                String[] strArr6 = logoCreateActivity12.abc10077;
                if (strArr6 != null) {
                    strArr6[1] = " and chara";
                }
                if (logoCreateActivity12.abc10026 < 0.3145494d) {
                    logoCreateActivity12.abc10026 = 0.0030097961f;
                }
                i4++;
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc10058 = -logoCreateActivity13.abc10058;
            int[] iArr6 = logoCreateActivity13.abc10017;
            if (iArr6 != null) {
                iArr6[7] = 0;
            }
            logoCreateActivity13.abc10033 = !logoCreateActivity13.abc10033;
            if (logoCreateActivity13.abc32 != null) {
                int i5 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr7 = logoCreateActivity.abc32;
                    if (i5 >= iArr7.length) {
                        break;
                    }
                    iArr7[i5] = 6;
                    logoCreateActivity.abc10046 = logoCreateActivity.abc10046 < 3 ? 7 : 0;
                    if (logoCreateActivity.abc10028 < 0) {
                        logoCreateActivity.abc10028 = 9;
                    }
                    if (logoCreateActivity.abc10010.size() > 6) {
                        LogoCreateActivity.this.abc10010.add(7);
                    }
                    i5++;
                }
                logoCreateActivity.abc10019 *= 5;
                if (logoCreateActivity.abc10075 != null) {
                    while (true) {
                        String[] strArr7 = LogoCreateActivity.this.abc10075;
                        if (i >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                logoCreateActivity14.abc10058 = -logoCreateActivity14.abc10058;
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            if (logoCreateActivity15.abc10031 == null) {
                logoCreateActivity15.abc10031 = new String[10];
            }
            if (!TextUtils.isEmpty(logoCreateActivity15.abc10012)) {
                int length = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
            }
            String[] strArr8 = LogoCreateActivity.this.abc10073;
            if (strArr8 != null) {
                strArr8[5] = null;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$r */
    /* loaded from: classes3.dex */
    public class C9510r implements Observer<List<Object>> {
        public C9510r() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<Object> list) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.logoRvFillingAdapter.setData(list);
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc1005 = 1;
            logoCreateActivity2.abc10033 = false;
            if (logoCreateActivity2.abc1003 == null) {
                logoCreateActivity2.abc1003 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc25 != null) {
                int i = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity.abc25;
                    if (i >= strArr.length) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    String[] strArr2 = logoCreateActivity3.abc10075;
                    if (strArr2 != null) {
                        strArr2[2] = "t i";
                    }
                    logoCreateActivity3.abc10038 = ((double) logoCreateActivity3.abc10038) > 0.23945194d ? 0.19878834f : 0.14250761f;
                    ArrayList<Integer> arrayList = logoCreateActivity3.abc10011;
                    if (arrayList == null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10011.remove(0);
                    }
                    i++;
                }
                if (logoCreateActivity.abc10010 == null) {
                    logoCreateActivity.abc10010 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10010.size() < 6) {
                    LogoCreateActivity.this.abc10010.add(2);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc10013 > 0.46071368d) {
                    logoCreateActivity4.abc10013 = 0.36949176f;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10025 = -logoCreateActivity5.abc10025;
            if (logoCreateActivity5.abc10024.size() > 4) {
                LogoCreateActivity.this.abc10024.add("plot and ");
            }
            if (TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                return;
            }
            int length = LogoCreateActivity.this.abc10054.length();
            LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$r0 */
    /* loaded from: classes3.dex */
    public class C9511r0 implements ActivityResultCallback<ActivityResult> {
        public C9511r0() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public void onActivityResult(ActivityResult activityResult) {
            int intExtra;
            if (activityResult.getResultCode() != -1 || (intExtra = activityResult.getData().getIntExtra("id", -1)) == -1) {
                return;
            }
            LogoCreateActivity.this.binding.drawview.m9102c(BitmapFactory.decodeResource(LogoCreateActivity.this.getResources(), intExtra));
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$r1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9512r1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9512r1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity.this.stopMove = false;
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10012 = "ly unti";
            String[] strArr = logoCreateActivity.abc10077;
            if (strArr != null) {
                strArr[0] = null;
            }
            logoCreateActivity.abc10046 = 1;
            ArrayList<String> arrayList = logoCreateActivity.abc21;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc21.remove(0);
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc10025 = -logoCreateActivity2.abc10025;
                logoCreateActivity2.abc10063 = ((double) logoCreateActivity2.abc10063) > 0.31975764d ? 0.5361527f : 0.63596857f;
                if (logoCreateActivity2.abc10055.size() < 0) {
                    LogoCreateActivity.this.abc10055.add(3);
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity3.abc1002;
            if (iArr != null) {
                iArr[3] = 5;
            }
            logoCreateActivity3.abc10054 = "tion (";
            if (logoCreateActivity3.abc1001 != null) {
                int i = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc1001;
                    if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity.this.startMove(0, 5);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity4.abc10060;
            if (strArr3 != null) {
                strArr3[6] = ", an";
            }
            int[] iArr2 = logoCreateActivity4.abc1002;
            if (iArr2 != null) {
                iArr2[6] = 0;
            }
            logoCreateActivity4.abc10066 = 0.8313078f;
            if (logoCreateActivity4.abc38 > 0.6415989573052259d) {
                logoCreateActivity4.abc38 = 0.7952670366779777d;
                if (logoCreateActivity4.abc10017 == null) {
                    logoCreateActivity4.abc10017 = new int[10];
                }
                ArrayList<String> arrayList2 = logoCreateActivity4.abc10039;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10039.remove(0);
                }
                LogoCreateActivity.this.abc10012 = "s plot an";
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc10068 < 0.054895855828813955d) {
                logoCreateActivity5.abc10068 = 0.23298230265899733d;
            }
            logoCreateActivity5.abc10019 = 0;
            if (logoCreateActivity5.abc10071 == null) {
                logoCreateActivity5.abc10071 = new String[10];
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$r2 */
    /* loaded from: classes3.dex */
    public class RunnableC9513r2 implements Runnable {
        public RunnableC9513r2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogoCreateActivity.super.onDestroy();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10046 = 1;
            if (logoCreateActivity.abc10050 == null) {
                logoCreateActivity.abc10050 = new int[10];
            }
            if (logoCreateActivity.abc1003 == null) {
                logoCreateActivity.abc1003 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity2.abc20;
            if (iArr != null) {
                iArr[7] = 0;
                logoCreateActivity2.abc1005 += 2;
                int[] iArr2 = logoCreateActivity2.abc10050;
                if (iArr2 != null) {
                    iArr2[9] = 0;
                }
                String[] strArr = logoCreateActivity2.abc10021;
                if (strArr != null) {
                    strArr[4] = null;
                }
            }
            logoCreateActivity2.abc10035 = false;
            if (logoCreateActivity2.abc10078.size() < 0) {
                LogoCreateActivity.this.abc10078.add(1);
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc10078 == null) {
                logoCreateActivity3.abc10078 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$s */
    /* loaded from: classes3.dex */
    public class C9514s implements LogoRvFillingAdapter.InterfaceC9613b {
        public C9514s() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvFillingAdapter.InterfaceC9613b
        /* renamed from: a */
        public void mo9189a(int i, Object obj) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            int i2;
            LogoCreateActivity logoCreateActivity5;
            LogoCreateActivity logoCreateActivity6;
            LogoCreateActivity logoCreateActivity7;
            int i3 = 0;
            if (i == 0) {
                LogoCreateActivity.this.binding.drawview.m9092m();
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                if (logoCreateActivity8.abc10016 == null) {
                    logoCreateActivity8.abc10016 = new String[10];
                }
                logoCreateActivity8.abc10063 *= 0.66330445f;
                if (logoCreateActivity8.abc10017 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10017;
                        if (i4 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i4] = 9;
                        i4++;
                    }
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.abc29 = "rWidth(1";
                String[] strArr = logoCreateActivity9.abc10023;
                if (strArr != null) {
                    strArr[7] = "itera";
                }
                if (!TextUtils.isEmpty(logoCreateActivity9.abc10059)) {
                    int length = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
                }
                if (LogoCreateActivity.this.abc10014.size() < 2) {
                    LogoCreateActivity.this.abc10014.add(3);
                }
                LogoCreateActivity.this.binding.drawview.setFillColor(null);
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc1000;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                String[] strArr2 = logoCreateActivity10.abc1001;
                if (strArr2 != null) {
                    strArr2[3] = "rnity i";
                }
                logoCreateActivity10.abc10040 = !logoCreateActivity10.abc10040;
                if (logoCreateActivity10.abc0 != null) {
                    int i5 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        String[] strArr3 = logoCreateActivity.abc0;
                        if (i5 >= strArr3.length) {
                            break;
                        }
                        strArr3[i5] = "string" + i5;
                        ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10024;
                        if (arrayList2 != null && arrayList2.size() > 0) {
                            LogoCreateActivity.this.abc10024.remove(0);
                        }
                        LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                        int[] iArr2 = logoCreateActivity11.abc10042;
                        if (iArr2 != null) {
                            iArr2[5] = 7;
                        }
                        if (logoCreateActivity11.abc10034 == null) {
                            logoCreateActivity11.abc10034 = new ArrayList<>();
                        }
                        i5++;
                    }
                    if (logoCreateActivity.abc10034.size() < 9) {
                        LogoCreateActivity.this.abc10034.add(4);
                    }
                    LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                    if (logoCreateActivity12.abc10028 < 0) {
                        logoCreateActivity12.abc10028 = 7;
                    }
                    ArrayList<Integer> arrayList3 = logoCreateActivity12.abc1000;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc1000.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                String[] strArr4 = logoCreateActivity13.abc10073;
                if (strArr4 != null) {
                    strArr4[9] = null;
                }
                if (logoCreateActivity13.abc10075 == null) {
                    logoCreateActivity13.abc10075 = new String[10];
                }
                logoCreateActivity13.abc10026 = 0.79140466f;
                logoCreateActivity13.binding.drawview.m9118H();
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                logoCreateActivity14.abc1005 = logoCreateActivity14.abc1005 < 1 ? 6 : 5;
                logoCreateActivity14.abc1004 = true;
                ArrayList<String> arrayList4 = logoCreateActivity14.abc10036;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10036.remove(0);
                }
                ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc2;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc2.remove(0);
                    LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                    String[] strArr5 = logoCreateActivity15.abc10015;
                    if (strArr5 != null) {
                        strArr5[9] = null;
                    }
                    ArrayList<Integer> arrayList6 = logoCreateActivity15.abc10037;
                    if (arrayList6 == null && arrayList6.size() > 0) {
                        LogoCreateActivity.this.abc10037.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                    if (logoCreateActivity16.abc1008 < 0) {
                        logoCreateActivity16.abc1008 = 2;
                    }
                }
                if (LogoCreateActivity.this.abc10015 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr6 = LogoCreateActivity.this.abc10015;
                        if (i6 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                            break;
                        }
                        strArr6[i6] = "string" + i6;
                        i6++;
                    }
                }
                LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                if (logoCreateActivity17.abc10010 == null) {
                    logoCreateActivity17.abc10010 = new ArrayList<>();
                }
                int i7 = 0;
                while (true) {
                    LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                    int i8 = logoCreateActivity18.abc1005;
                    if (i8 > 3) {
                        i8 = 3;
                    }
                    if (i7 >= i8) {
                        break;
                    }
                    int[] iArr3 = logoCreateActivity18.abc10050;
                    if (iArr3 != null) {
                        iArr3[2] = 3;
                    }
                    i7++;
                }
            } else if (i == 1) {
                LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                logoCreateActivity19.lastColor = logoCreateActivity19.binding.drawview.getCurrentFillColor();
                LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                String[] strArr7 = logoCreateActivity20.abc10031;
                if (strArr7 != null) {
                    strArr7[6] = null;
                }
                logoCreateActivity20.abc10063 = 0.6013578f;
                logoCreateActivity20.abc10032 = !logoCreateActivity20.abc10032;
                logoCreateActivity20.abc18 = 0.7234301560582332d;
                if (logoCreateActivity20.abc10018.size() > 0) {
                    LogoCreateActivity.this.abc10018.add("in the ea");
                }
                LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                String[] strArr8 = logoCreateActivity21.abc10075;
                if (strArr8 != null) {
                    strArr8[9] = null;
                }
                String[] strArr9 = logoCreateActivity21.abc10031;
                if (strArr9 != null) {
                    strArr9[4] = null;
                }
                logoCreateActivity21.binding.drawview.m9092m();
                LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                String[] strArr10 = logoCreateActivity22.abc10073;
                if (strArr10 != null) {
                    strArr10[8] = null;
                }
                if (logoCreateActivity22.abc10075 == null) {
                    logoCreateActivity22.abc10075 = new String[10];
                }
                logoCreateActivity22.abc1004 = !logoCreateActivity22.abc1004;
                if (logoCreateActivity22.abc35 == null) {
                    logoCreateActivity22.abc35 = new ArrayList<>();
                    LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                    if (logoCreateActivity23.abc10061 == null) {
                        logoCreateActivity23.abc10061 = new int[10];
                    }
                    String[] strArr11 = logoCreateActivity23.abc1001;
                    if (strArr11 != null) {
                        strArr11[4] = null;
                    }
                    if (logoCreateActivity23.abc10018 == null) {
                        logoCreateActivity23.abc10018 = new ArrayList<>();
                    }
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10012)) {
                    int length2 = LogoCreateActivity.this.abc10012.length();
                    LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length2;
                }
                LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                logoCreateActivity24.abc10052 = 3;
                String[] strArr12 = logoCreateActivity24.abc10057;
                if (strArr12 != null) {
                    strArr12[2] = null;
                }
                logoCreateActivity24.finderType = 0;
                LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                logoCreateActivity25.abc10062 = "n publi";
                int[] iArr4 = logoCreateActivity25.abc1002;
                if (iArr4 != null) {
                    iArr4[5] = 0;
                }
                if (logoCreateActivity25.abc10011.size() > 1) {
                    LogoCreateActivity.this.abc10011.add(9);
                }
                if (LogoCreateActivity.this.abc21.size() > 3) {
                    LogoCreateActivity.this.abc21.add("漂亮的异性");
                    if (LogoCreateActivity.this.abc10018.size() < 1) {
                        LogoCreateActivity.this.abc10018.add(", well,");
                    }
                    LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                    logoCreateActivity26.abc10076 = !logoCreateActivity26.abc10076;
                    logoCreateActivity26.abc10063 = 0.9727635f;
                }
                LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                int[] iArr5 = logoCreateActivity27.abc10045;
                if (iArr5 != null) {
                    iArr5[6] = 0;
                }
                if (!TextUtils.isEmpty(logoCreateActivity27.abc10064)) {
                    int length3 = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length3;
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10012)) {
                    int length4 = LogoCreateActivity.this.abc10012.length();
                    LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length4;
                }
                LogoCreateActivity.this.binding.drawview.m9107S();
                LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
                logoCreateActivity28.abc10020 = 0.88982445f;
                String[] strArr13 = logoCreateActivity28.abc10060;
                if (strArr13 != null) {
                    strArr13[7] = "ed well";
                }
                if (logoCreateActivity28.abc10014.size() > 3) {
                    LogoCreateActivity.this.abc10014.add(5);
                }
                int i9 = 0;
                while (true) {
                    logoCreateActivity3 = LogoCreateActivity.this;
                    if (i9 >= logoCreateActivity3.abc39) {
                        break;
                    }
                    logoCreateActivity3.abc39 = 5;
                    logoCreateActivity3.abc10063 = Math.abs(logoCreateActivity3.abc10063);
                    LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
                    logoCreateActivity29.abc1004 = true;
                    if (logoCreateActivity29.abc10018.size() > 3) {
                        LogoCreateActivity.this.abc10018.add("lville’");
                    }
                    i9++;
                }
                if (logoCreateActivity3.abc1003.size() > 1) {
                    LogoCreateActivity.this.abc1003.add("t");
                }
                LogoCreateActivity logoCreateActivity30 = LogoCreateActivity.this;
                String[] strArr14 = logoCreateActivity30.abc10043;
                if (strArr14 != null) {
                    strArr14[7] = null;
                }
                if (logoCreateActivity30.abc10034.size() > 9) {
                    LogoCreateActivity.this.abc10034.add(4);
                }
                LogoCreateActivity.this.createVM.showColorFinderLayout();
                LogoCreateActivity logoCreateActivity31 = LogoCreateActivity.this;
                logoCreateActivity31.abc10032 = true;
                logoCreateActivity31.abc10027 = ((double) logoCreateActivity31.abc10027) > 0.5701937d ? 0.14998329f : 0.90559167f;
                if (logoCreateActivity31.abc10046 < 0) {
                    logoCreateActivity31.abc10046 = 3;
                }
                if (logoCreateActivity31.abc15 != null) {
                    int i10 = 0;
                    while (true) {
                        logoCreateActivity4 = LogoCreateActivity.this;
                        int[] iArr6 = logoCreateActivity4.abc15;
                        if (i10 >= iArr6.length) {
                            break;
                        }
                        iArr6[i10] = 8;
                        logoCreateActivity4.abc1004 = true;
                        logoCreateActivity4.abc1007 = 0.5483652f;
                        if (!TextUtils.isEmpty(logoCreateActivity4.abc10059)) {
                            int length5 = LogoCreateActivity.this.abc10059.length();
                            LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length5;
                        }
                        i10++;
                    }
                    if (logoCreateActivity4.abc10039 == null) {
                        logoCreateActivity4.abc10039 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity32 = LogoCreateActivity.this;
                    if (logoCreateActivity32.abc10023 == null) {
                        i2 = 10;
                        logoCreateActivity32.abc10023 = new String[10];
                    } else {
                        i2 = 10;
                    }
                    if (logoCreateActivity32.abc10071 == null) {
                        logoCreateActivity32.abc10071 = new String[i2];
                    }
                }
                LogoCreateActivity logoCreateActivity33 = LogoCreateActivity.this;
                logoCreateActivity33.abc10026 += 0.9144441f;
                if (logoCreateActivity33.abc10042 != null) {
                    int i11 = 0;
                    while (true) {
                        int[] iArr7 = LogoCreateActivity.this.abc10042;
                        if (i11 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                            break;
                        }
                        iArr7[i11] = 9;
                        i11++;
                    }
                }
                String[] strArr15 = LogoCreateActivity.this.abc10071;
                if (strArr15 != null) {
                    strArr15[8] = "dent";
                }
            } else if (i != 2) {
                LogoCreateActivity.this.binding.drawview.m9092m();
                LogoCreateActivity logoCreateActivity34 = LogoCreateActivity.this;
                if (logoCreateActivity34.abc10039 == null) {
                    logoCreateActivity34.abc10039 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity35 = LogoCreateActivity.this;
                logoCreateActivity35.abc10027 = 0.5944751f;
                logoCreateActivity35.abc10051 = logoCreateActivity35.abc10051 > 0.9253096116737111d ? 0.9829960984007865d : 0.9056676700136037d;
                logoCreateActivity35.abc12 = ((double) logoCreateActivity35.abc12) < 0.654898d ? 0.32574916f : 0.5463429f;
                if (logoCreateActivity35.abc10021 == null) {
                    logoCreateActivity35.abc10021 = new String[10];
                }
                if (!TextUtils.isEmpty(logoCreateActivity35.abc10069)) {
                    int length6 = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length6;
                }
                LogoCreateActivity logoCreateActivity36 = LogoCreateActivity.this;
                String[] strArr16 = logoCreateActivity36.abc10077;
                if (strArr16 != null) {
                    strArr16[9] = "ide";
                }
                logoCreateActivity36.binding.drawview.setFillColor(Integer.valueOf(Color.parseColor((String) obj)));
                int i12 = 0;
                while (true) {
                    logoCreateActivity6 = LogoCreateActivity.this;
                    int i13 = logoCreateActivity6.abc10046;
                    if (i13 > 3) {
                        i13 = 3;
                    }
                    if (i12 >= i13) {
                        break;
                    }
                    logoCreateActivity6.abc10012 = "hen";
                    i12++;
                }
                if (logoCreateActivity6.abc10039.size() > 3) {
                    LogoCreateActivity.this.abc10039.add(".");
                }
                LogoCreateActivity logoCreateActivity37 = LogoCreateActivity.this;
                if (logoCreateActivity37.abc10078 == null) {
                    logoCreateActivity37.abc10078 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity38 = LogoCreateActivity.this;
                logoCreateActivity38.abc29 = "高斯模糊半径，值越大";
                if (logoCreateActivity38.abc10055.size() < 1) {
                    LogoCreateActivity.this.abc10055.add(3);
                }
                LogoCreateActivity logoCreateActivity39 = LogoCreateActivity.this;
                if (logoCreateActivity39.abc10071 == null) {
                    logoCreateActivity39.abc10071 = new String[10];
                }
                logoCreateActivity39.abc10051 = logoCreateActivity39.abc10051 > 0.39090323633017343d ? 0.21650765501483982d : 0.9702546729226745d;
                logoCreateActivity39.binding.drawview.m9118H();
                String[] strArr17 = LogoCreateActivity.this.abc10022;
                if (strArr17 != null) {
                    strArr17[5] = "d ";
                }
                int i14 = 0;
                while (true) {
                    logoCreateActivity7 = LogoCreateActivity.this;
                    int i15 = logoCreateActivity7.abc10046;
                    if (i15 > 3) {
                        i15 = 3;
                    }
                    if (i14 >= i15) {
                        break;
                    }
                    logoCreateActivity7.abc10027 = 0.96744287f;
                    i14++;
                }
                ArrayList<String> arrayList7 = logoCreateActivity7.abc10018;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
                LogoCreateActivity logoCreateActivity40 = LogoCreateActivity.this;
                logoCreateActivity40.abc24 = -logoCreateActivity40.abc24;
                logoCreateActivity40.abc10052 -= 0;
                if (logoCreateActivity40.abc10043 == null) {
                    logoCreateActivity40.abc10043 = new String[10];
                }
                int[] iArr8 = logoCreateActivity40.abc1002;
                if (iArr8 != null) {
                    iArr8[8] = 5;
                }
            } else {
                LogoCreateActivity.this.rainbowType = 0;
                ArrayList<Integer> arrayList8 = LogoCreateActivity.this.abc1000;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                if (LogoCreateActivity.this.abc10010.size() > 5) {
                    LogoCreateActivity.this.abc10010.add(5);
                }
                LogoCreateActivity logoCreateActivity41 = LogoCreateActivity.this;
                logoCreateActivity41.abc10068 = -logoCreateActivity41.abc10068;
                logoCreateActivity41.lastColor = logoCreateActivity41.binding.drawview.getCurrentFillColor();
                LogoCreateActivity logoCreateActivity42 = LogoCreateActivity.this;
                String[] strArr18 = logoCreateActivity42.abc1001;
                if (strArr18 != null) {
                    strArr18[5] = "mor";
                }
                if (logoCreateActivity42.abc1008 > 0) {
                    logoCreateActivity42.abc1008 = 7;
                }
                if (logoCreateActivity42.abc1000.size() < 8) {
                    LogoCreateActivity.this.abc1000.add(3);
                }
                LogoCreateActivity logoCreateActivity43 = LogoCreateActivity.this;
                logoCreateActivity43.abc10 = !logoCreateActivity43.abc10;
                if (logoCreateActivity43.abc10077 == null) {
                    logoCreateActivity43.abc10077 = new String[10];
                }
                int[] iArr9 = logoCreateActivity43.abc10047;
                if (iArr9 != null) {
                    iArr9[2] = 9;
                }
                ArrayList<Integer> arrayList9 = logoCreateActivity43.abc1000;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                LogoCreateActivity.this.binding.drawview.m9092m();
                LogoCreateActivity logoCreateActivity44 = LogoCreateActivity.this;
                logoCreateActivity44.abc10051 = Math.abs(logoCreateActivity44.abc10051);
                LogoCreateActivity logoCreateActivity45 = LogoCreateActivity.this;
                logoCreateActivity45.abc10058 *= 0.8598934270156293d;
                int[] iArr10 = logoCreateActivity45.abc10017;
                if (iArr10 != null) {
                    iArr10[6] = 2;
                }
                logoCreateActivity45.abc10 = false;
                ArrayList<String> arrayList10 = logoCreateActivity45.abc10024;
                if (arrayList10 != null && arrayList10.size() > 0) {
                    LogoCreateActivity.this.abc10024.remove(0);
                }
                LogoCreateActivity logoCreateActivity46 = LogoCreateActivity.this;
                int[] iArr11 = logoCreateActivity46.abc10041;
                if (iArr11 != null) {
                    iArr11[4] = 0;
                }
                logoCreateActivity46.abc10026 = Math.abs(logoCreateActivity46.abc10026);
                LogoCreateActivity.this.finderType = 1;
                LogoCreateActivity logoCreateActivity47 = LogoCreateActivity.this;
                logoCreateActivity47.abc10028 += 4;
                ArrayList<String> arrayList11 = logoCreateActivity47.abc10018;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
                LogoCreateActivity logoCreateActivity48 = LogoCreateActivity.this;
                logoCreateActivity48.abc10076 = !logoCreateActivity48.abc10076;
                logoCreateActivity48.abc27 = 0.2116495743761384d;
                logoCreateActivity48.abc10013 = 0.7394336f;
                if (logoCreateActivity48.abc10041 == null) {
                    logoCreateActivity48.abc10041 = new int[10];
                }
                if (logoCreateActivity48.abc10074 == null) {
                    logoCreateActivity48.abc10074 = new ArrayList<>();
                }
                LogoCreateActivity.this.createVM.showColorRainbowLayout();
                int i16 = 0;
                while (true) {
                    logoCreateActivity5 = LogoCreateActivity.this;
                    int i17 = logoCreateActivity5.abc1005;
                    if (i17 > 3) {
                        i17 = 3;
                    }
                    if (i16 >= i17) {
                        break;
                    }
                    String[] strArr19 = logoCreateActivity5.abc1001;
                    if (strArr19 != null) {
                        strArr19[1] = "and mo";
                    }
                    i16++;
                }
                logoCreateActivity5.abc10025 += 0.18466401f;
                if (logoCreateActivity5.abc10014.size() > 0) {
                    LogoCreateActivity.this.abc10014.add(2);
                }
                if (LogoCreateActivity.this.abc9.size() < 9) {
                    LogoCreateActivity.this.abc9.add("io' } ");
                    LogoCreateActivity logoCreateActivity49 = LogoCreateActivity.this;
                    if (logoCreateActivity49.abc1003 == null) {
                        logoCreateActivity49.abc1003 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity50 = LogoCreateActivity.this;
                    logoCreateActivity50.abc10027 = 0.229931f;
                    logoCreateActivity50.abc10051 = 0.6127472466545754d;
                }
                ArrayList<Integer> arrayList12 = LogoCreateActivity.this.abc10055;
                if (arrayList12 == null && arrayList12.size() > 0) {
                    LogoCreateActivity.this.abc10055.remove(0);
                }
                LogoCreateActivity logoCreateActivity51 = LogoCreateActivity.this;
                String[] strArr20 = logoCreateActivity51.abc10077;
                if (strArr20 != null) {
                    strArr20[1] = "vel that";
                }
                logoCreateActivity51.abc10064 = " famil";
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                int length7 = LogoCreateActivity.this.abc10069.length();
                LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length7;
            }
            LogoCreateActivity logoCreateActivity52 = LogoCreateActivity.this;
            if (logoCreateActivity52.abc10039 == null) {
                logoCreateActivity52.abc10039 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity53 = LogoCreateActivity.this;
            logoCreateActivity53.abc10020 = -logoCreateActivity53.abc10020;
            if (logoCreateActivity53.abc1 != null) {
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    int[] iArr12 = logoCreateActivity2.abc1;
                    if (i3 >= iArr12.length) {
                        break;
                    }
                    iArr12[i3] = 3;
                    logoCreateActivity2.abc10058 += 0.9516440704325017d;
                    logoCreateActivity2.abc10027 = 0.59178585f;
                    logoCreateActivity2.abc10040 = !logoCreateActivity2.abc10040;
                    i3++;
                }
                int[] iArr13 = logoCreateActivity2.abc10061;
                if (iArr13 != null) {
                    iArr13[1] = 6;
                }
                String[] strArr21 = logoCreateActivity2.abc1001;
                if (strArr21 != null) {
                    strArr21[4] = null;
                }
                logoCreateActivity2.abc1008 = 1;
            }
            LogoCreateActivity logoCreateActivity54 = LogoCreateActivity.this;
            logoCreateActivity54.abc10019 = logoCreateActivity54.abc10019 > 4 ? 6 : 8;
            String[] strArr22 = logoCreateActivity54.abc10057;
            if (strArr22 != null) {
                strArr22[7] = "acters tha";
            }
            logoCreateActivity54.abc10038 -= 0.59912455f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$s0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9515s0 implements View.OnClickListener {
        public View$OnClickListenerC9515s0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9118H();
            int i = 0;
            if (LogoCreateActivity.this.abc10016 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10016;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10027 += 0.5601904f;
            if (logoCreateActivity.abc1007 > 0.41187507d) {
                logoCreateActivity.abc1007 = 0.6276076f;
            }
            String[] strArr2 = logoCreateActivity.abc19;
            if (strArr2 != null) {
                strArr2[8] = null;
                logoCreateActivity.abc10065 = false;
                ArrayList<Integer> arrayList = logoCreateActivity.abc10011;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc10074 == null) {
                    logoCreateActivity2.abc10074 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10040 = false;
            logoCreateActivity3.abc10019 = -logoCreateActivity3.abc10019;
            if (logoCreateActivity3.abc10037 == null) {
                logoCreateActivity3.abc10037 = new ArrayList<>();
            }
            LogoCreateActivity.this.binding.drawview.setEditBackgound(false);
            ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10024;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10024.remove(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10040 = false;
            logoCreateActivity4.abc10076 = true;
            logoCreateActivity4.abc29 = "容：";
            logoCreateActivity4.abc10032 = !logoCreateActivity4.abc10032;
            logoCreateActivity4.abc10029 = false;
            logoCreateActivity4.abc10033 = true;
            logoCreateActivity4.binding.drawview.m9095j();
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc1004 = true;
            if (!TextUtils.isEmpty(logoCreateActivity5.abc10012)) {
                int length = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length;
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10065 = !logoCreateActivity6.abc10065;
            if (logoCreateActivity6.abc8.size() < 6) {
                LogoCreateActivity.this.abc8.add("ut_he");
                ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10074;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10074.remove(0);
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                if (logoCreateActivity7.abc1002 == null) {
                    logoCreateActivity7.abc1002 = new int[10];
                }
                logoCreateActivity7.abc10040 = !logoCreateActivity7.abc10040;
            }
            if (LogoCreateActivity.this.abc10034.size() > 2) {
                LogoCreateActivity.this.abc10034.add(9);
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10046 = Math.abs(logoCreateActivity8.abc10046);
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            if (logoCreateActivity9.abc10018 == null) {
                logoCreateActivity9.abc10018 = new ArrayList<>();
            }
            LogoCreateActivity.this.createVM.hideBackgroundLayout();
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc10025 = 0.46649665f;
            logoCreateActivity10.abc10025 = -0.46649665f;
            if (logoCreateActivity10.abc10034 == null) {
                logoCreateActivity10.abc10034 = new ArrayList<>();
            }
            LogoCreateActivity.this.showFirstMenu();
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10063 = ((double) logoCreateActivity11.abc10063) < 0.3587224d ? 0.10608333f : 0.6639405f;
            ArrayList<String> arrayList4 = logoCreateActivity11.abc10048;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc10048.remove(0);
            }
            if (LogoCreateActivity.this.abc10039.size() > 1) {
                LogoCreateActivity.this.abc10039.add("ecades ");
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity12.abc36;
            if (strArr3 != null) {
                strArr3[0] = "_down";
                logoCreateActivity12.abc10054 = "tten i";
                String[] strArr4 = logoCreateActivity12.abc10015;
                if (strArr4 != null) {
                    strArr4[6] = " the ";
                }
                if (logoCreateActivity12.abc1002 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc1002;
                        if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i3] = 1;
                        i3++;
                    }
                }
            }
            if (LogoCreateActivity.this.abc10070.size() > 3) {
                LogoCreateActivity.this.abc10070.add("ced");
            }
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc10026 = ((double) logoCreateActivity13.abc10026) < 0.60002625d ? 0.5371185f : 0.77411145f;
            if (logoCreateActivity13.abc10050 == null) {
                return;
            }
            while (true) {
                int[] iArr2 = LogoCreateActivity.this.abc10050;
                if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    return;
                }
                iArr2[i] = 8;
                i++;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$s1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9516s1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9516s1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity.this.stopMove = false;
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10051 = Math.abs(logoCreateActivity.abc10051);
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc1005 = 2;
            logoCreateActivity2.abc1005 = 4;
            if (logoCreateActivity2.abc35.size() > 2) {
                LogoCreateActivity.this.abc35.add(2);
                if (LogoCreateActivity.this.abc1003.size() < 4) {
                    LogoCreateActivity.this.abc1003.add(" is ec");
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity3.abc10045;
                if (iArr != null) {
                    iArr[2] = 7;
                }
                if (logoCreateActivity3.abc10060 == null) {
                    logoCreateActivity3.abc10060 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc1002 == null) {
                logoCreateActivity4.abc1002 = new int[10];
            }
            if (logoCreateActivity4.abc10073 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10073;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10072 = !logoCreateActivity5.abc10072;
            logoCreateActivity5.startMove(0, -5);
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10056;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10056.remove(0);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity6.abc1002;
            if (iArr2 != null) {
                iArr2[2] = 0;
            }
            if (logoCreateActivity6.abc10010.size() > 0) {
                LogoCreateActivity.this.abc10010.add(1);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc7 = Math.abs(logoCreateActivity7.abc7);
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10038 < 0.8425484d) {
                logoCreateActivity8.abc10038 = 0.08799034f;
            }
            logoCreateActivity8.abc10020 = 0.061175346f;
            if (logoCreateActivity8.abc10056 == null) {
                logoCreateActivity8.abc10056 = new ArrayList<>();
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$s2 */
    /* loaded from: classes3.dex */
    public class HandlerC9517s2 extends Handler {
        public HandlerC9517s2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            super.handleMessage(message);
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10063 = 0.4604522f;
            if (logoCreateActivity3.abc10071 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10071;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10026 > 0.89450425d) {
                logoCreateActivity4.abc10026 = 0.71666354f;
            }
            logoCreateActivity4.getWindow().setFlags(16777216, 16777216);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc10037 == null) {
                logoCreateActivity5.abc10037 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity6.abc10045;
            if (iArr != null) {
                iArr[0] = 0;
            }
            logoCreateActivity6.abc10058 = 0.7704328498224816d;
            ArrayList<String> arrayList = logoCreateActivity6.abc37;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc37.remove(0);
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc10029 = false;
                if (logoCreateActivity7.abc10043 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr2 = LogoCreateActivity.this.abc10043;
                        if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i2] = "string" + i2;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc1007 = -logoCreateActivity8.abc1007;
            }
            if (LogoCreateActivity.this.abc10017 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc10017;
                    if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i3] = 6;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity9.abc10022;
            if (strArr3 != null) {
                strArr3[7] = " when g";
            }
            logoCreateActivity9.abc1007 *= 0.07655913f;
            logoCreateActivity9.closeLoading();
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc10068 -= 0.8871253630237392d;
            if (logoCreateActivity10.abc10024 == null) {
                logoCreateActivity10.abc10024 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            String[] strArr4 = logoCreateActivity11.abc10015;
            if (strArr4 != null) {
                strArr4[6] = "se";
            }
            int[] iArr3 = logoCreateActivity11.abc6;
            if (iArr3 != null) {
                iArr3[7] = 0;
                int[] iArr4 = logoCreateActivity11.abc10061;
                if (iArr4 != null) {
                    iArr4[7] = 4;
                }
                logoCreateActivity11.abc10072 = !logoCreateActivity11.abc10072;
                if (logoCreateActivity11.abc10024 == null) {
                    logoCreateActivity11.abc10024 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            logoCreateActivity12.abc10058 = 0.9783023882557231d;
            logoCreateActivity12.abc10051 = logoCreateActivity12.abc10051 < 0.9222196324410596d ? 0.933543067950169d : 0.21022239223258843d;
            logoCreateActivity12.abc1008++;
            Bundle data = message.getData();
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc10063 = ((double) logoCreateActivity13.abc10063) < 0.074374974d ? 0.47070163f : 0.8070907f;
            logoCreateActivity13.abc10020 = ((double) logoCreateActivity13.abc10020) > 0.7624963d ? 0.44138962f : 0.43116844f;
            if (logoCreateActivity13.abc10015 == null) {
                logoCreateActivity13.abc10015 = new String[10];
            }
            if (logoCreateActivity13.abc21.size() < 4) {
                LogoCreateActivity.this.abc21.add("ti");
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                logoCreateActivity14.abc10062 = "vels";
                logoCreateActivity14.abc10013 = 0.07415199f;
                ArrayList<Integer> arrayList2 = logoCreateActivity14.abc1000;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            if (logoCreateActivity15.abc10045 == null) {
                logoCreateActivity15.abc10045 = new int[10];
            }
            logoCreateActivity15.abc10064 = "hat";
            if (logoCreateActivity15.abc10017 == null) {
                logoCreateActivity15.abc10017 = new int[10];
            }
            Uri uri = (Uri) data.getParcelable("uri");
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            logoCreateActivity16.abc10065 = !logoCreateActivity16.abc10065;
            logoCreateActivity16.abc10025 = 0.5762039f;
            if (!TextUtils.isEmpty(logoCreateActivity16.abc10059)) {
                int length = LogoCreateActivity.this.abc10059.length();
                LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
            }
            if (uri == null) {
                LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                logoCreateActivity17.abc1004 = true;
                int[] iArr5 = logoCreateActivity17.abc10047;
                if (iArr5 != null) {
                    iArr5[6] = 0;
                }
                if (logoCreateActivity17.abc10017 == null) {
                    logoCreateActivity17.abc10017 = new int[10];
                }
                Toast.makeText(logoCreateActivity17, (int) R.string.save_failed, 0).show();
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                String[] strArr5 = logoCreateActivity18.abc10043;
                if (strArr5 != null) {
                    strArr5[4] = "ati";
                }
                logoCreateActivity18.abc1007 = -logoCreateActivity18.abc1007;
                if (logoCreateActivity18.abc1002 == null) {
                    return;
                }
                int i4 = 0;
                while (true) {
                    int[] iArr6 = LogoCreateActivity.this.abc1002;
                    if (i4 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        return;
                    }
                    iArr6[i4] = 0;
                    i4++;
                }
            } else {
                LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                if (logoCreateActivity19.abc10031 == null) {
                    logoCreateActivity19.abc10031 = new String[10];
                }
                if (!TextUtils.isEmpty(logoCreateActivity19.abc10062)) {
                    int length2 = LogoCreateActivity.this.abc10062.length();
                    LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
                }
                LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                if (logoCreateActivity20.abc10014 == null) {
                    logoCreateActivity20.abc10014 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                int[] iArr7 = logoCreateActivity21.abc13;
                if (iArr7 != null) {
                    iArr7[3] = 0;
                    ArrayList<Integer> arrayList3 = logoCreateActivity21.abc10034;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc10034.remove(0);
                    }
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10059)) {
                        int length3 = LogoCreateActivity.this.abc10059.length();
                        LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length3;
                    }
                    int[] iArr8 = LogoCreateActivity.this.abc10045;
                    if (iArr8 != null) {
                        iArr8[9] = 0;
                    }
                }
                LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                String[] strArr6 = logoCreateActivity22.abc10031;
                if (strArr6 != null) {
                    strArr6[3] = "), and the";
                }
                if (logoCreateActivity22.abc10014 == null) {
                    logoCreateActivity22.abc10014 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc10056;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10056.remove(0);
                }
                Intent intent = new Intent(LogoCreateActivity.this, LogoSaveSuccessActivity.class);
                if (LogoCreateActivity.this.abc10024.size() > 0) {
                    LogoCreateActivity.this.abc10024.add("tion");
                }
                LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                logoCreateActivity23.abc10025 = 0.725313f;
                logoCreateActivity23.abc10049 = true;
                if (logoCreateActivity23.abc33 != null) {
                    int i5 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        String[] strArr7 = logoCreateActivity.abc33;
                        if (i5 >= strArr7.length) {
                            break;
                        }
                        strArr7[i5] = "string" + i5;
                        LogoCreateActivity.this.abc10029 = false;
                        int i6 = 0;
                        while (true) {
                            logoCreateActivity2 = LogoCreateActivity.this;
                            int i7 = logoCreateActivity2.abc10028;
                            if (i7 > 3) {
                                i7 = 3;
                            }
                            if (i6 < i7) {
                                if (logoCreateActivity2.abc10021 == null) {
                                    logoCreateActivity2.abc10021 = new String[10];
                                }
                                i6++;
                            }
                        }
                        logoCreateActivity2.abc10058 = 0.8121258606225441d;
                        i5++;
                    }
                    ArrayList<Integer> arrayList5 = logoCreateActivity.abc10055;
                    if (arrayList5 == null && arrayList5.size() > 0) {
                        LogoCreateActivity.this.abc10055.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                    logoCreateActivity24.abc10058 = logoCreateActivity24.abc10058 < 0.8627745015780731d ? 0.6757255095085758d : 0.986426964185385d;
                    if (logoCreateActivity24.abc10036.size() > 9) {
                        LogoCreateActivity.this.abc10036.add("ing");
                    }
                }
                LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                if (logoCreateActivity25.abc10014 == null) {
                    logoCreateActivity25.abc10014 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                logoCreateActivity26.abc10035 = false;
                logoCreateActivity26.abc10049 = !logoCreateActivity26.abc10049;
                intent.putExtra("logo", uri);
                LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                logoCreateActivity27.abc10033 = !logoCreateActivity27.abc10033;
                String[] strArr8 = logoCreateActivity27.abc1001;
                if (strArr8 != null) {
                    strArr8[3] = " m";
                }
                logoCreateActivity27.abc10012 = "s modern";
                if (logoCreateActivity27.abc14 < 0.6806778407855604d) {
                    logoCreateActivity27.abc14 = 0.14874562084436593d;
                    if (logoCreateActivity27.abc10015 != null) {
                        int i8 = 0;
                        while (true) {
                            String[] strArr9 = LogoCreateActivity.this.abc10015;
                            if (i8 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                                break;
                            }
                            strArr9[i8] = "string" + i8;
                            i8++;
                        }
                    }
                    if (LogoCreateActivity.this.abc1000.size() > 8) {
                        LogoCreateActivity.this.abc1000.add(2);
                    }
                    ArrayList<String> arrayList6 = LogoCreateActivity.this.abc10070;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        LogoCreateActivity.this.abc10070.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
                logoCreateActivity28.abc10064 = "stude";
                String[] strArr10 = logoCreateActivity28.abc10060;
                if (strArr10 != null) {
                    strArr10[5] = null;
                }
                logoCreateActivity28.abc10013 = Math.abs(logoCreateActivity28.abc10013);
                LogoCreateActivity.this.startActivity(intent);
                if (LogoCreateActivity.this.abc10014.size() < 9) {
                    LogoCreateActivity.this.abc10014.add(4);
                }
                LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
                if (logoCreateActivity29.abc10061 == null) {
                    logoCreateActivity29.abc10061 = new int[10];
                }
                if (logoCreateActivity29.abc10030 == null) {
                    logoCreateActivity29.abc10030 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity30 = LogoCreateActivity.this;
                int[] iArr9 = logoCreateActivity30.abc15;
                if (iArr9 != null) {
                    iArr9[3] = 6;
                    String[] strArr11 = logoCreateActivity30.abc10071;
                    if (strArr11 != null) {
                        strArr11[6] = "el t";
                    }
                    logoCreateActivity30.abc10049 = false;
                    int[] iArr10 = logoCreateActivity30.abc10045;
                    if (iArr10 != null) {
                        iArr10[1] = 4;
                    }
                }
                String[] strArr12 = logoCreateActivity30.abc10023;
                if (strArr12 != null) {
                    strArr12[4] = null;
                }
                logoCreateActivity30.abc10032 = !logoCreateActivity30.abc10032;
                if (logoCreateActivity30.abc10024.size() < 4) {
                    LogoCreateActivity.this.abc10024.add("e early");
                }
                LogoCreateActivity.this.finish();
                LogoCreateActivity logoCreateActivity31 = LogoCreateActivity.this;
                logoCreateActivity31.abc1007 = 0.5564368f;
                String[] strArr13 = logoCreateActivity31.abc10031;
                if (strArr13 != null) {
                    strArr13[8] = " book";
                }
                ArrayList<String> arrayList7 = logoCreateActivity31.abc10048;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    LogoCreateActivity.this.abc10048.remove(0);
                }
                LogoCreateActivity logoCreateActivity32 = LogoCreateActivity.this;
                if (logoCreateActivity32.abc8 == null) {
                    logoCreateActivity32.abc8 = new ArrayList<>();
                    LogoCreateActivity logoCreateActivity33 = LogoCreateActivity.this;
                    logoCreateActivity33.abc10028 = 4;
                    if (!TextUtils.isEmpty(logoCreateActivity33.abc10069)) {
                        int length4 = LogoCreateActivity.this.abc10069.length();
                        LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length4;
                    }
                    ArrayList<Integer> arrayList8 = LogoCreateActivity.this.abc10011;
                    if (arrayList8 == null && arrayList8.size() > 0) {
                        LogoCreateActivity.this.abc10011.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity34 = LogoCreateActivity.this;
                logoCreateActivity34.abc10046 *= 1;
                logoCreateActivity34.abc10038 = 0.1731059f;
                if (logoCreateActivity34.abc10056.size() < 6) {
                    LogoCreateActivity.this.abc10056.add(3);
                }
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$t */
    /* loaded from: classes3.dex */
    public class C9518t implements LogoRvBgImgAdapter.InterfaceC9603b {
        public C9518t() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvBgImgAdapter.InterfaceC9603b
        /* renamed from: a */
        public void mo9203a(int i, Integer num) {
            if (i == 0) {
                LogoCreateActivity.this.binding.drawview.setCanvasBackgroundImage(null);
                if (LogoCreateActivity.this.abc10014.size() < 2) {
                    LogoCreateActivity.this.abc10014.add(5);
                }
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                logoCreateActivity.abc10068 += 0.5290063164931794d;
                int[] iArr = logoCreateActivity.abc10061;
                if (iArr != null) {
                    iArr[6] = 9;
                }
                if (logoCreateActivity.abc21 == null) {
                    logoCreateActivity.abc21 = new ArrayList<>();
                    LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                    logoCreateActivity2.abc10054 = "el that in";
                    logoCreateActivity2.abc1005 = 8;
                    if (logoCreateActivity2.abc10038 < 0.63186574d) {
                        logoCreateActivity2.abc10038 = 0.8302684f;
                    }
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10055 == null) {
                    logoCreateActivity3.abc10055 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10055.size() < 2) {
                    LogoCreateActivity.this.abc10055.add(2);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc1007 = 0.36432862f;
                logoCreateActivity4.binding.drawview.setCanvasBackgroundColor(null);
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc10072 = !logoCreateActivity5.abc10072;
                if (logoCreateActivity5.abc10071 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10071;
                        if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i2] = "string" + i2;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                if (logoCreateActivity6.abc10034 == null) {
                    logoCreateActivity6.abc10034 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc7 = ((double) logoCreateActivity7.abc7) > 0.0135778785d ? 0.4575557f : 0.63817805f;
                logoCreateActivity7.abc10049 = !logoCreateActivity7.abc10049;
                if (logoCreateActivity7.abc10034 == null) {
                    logoCreateActivity7.abc10034 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc1001 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr2 = LogoCreateActivity.this.abc1001;
                        if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i3] = "string" + i3;
                        i3++;
                    }
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc18 *= 0.5759780998184916d;
                if (logoCreateActivity8.abc10058 > 0.9786017592071242d) {
                    logoCreateActivity8.abc10058 = 0.8707116925360419d;
                }
                logoCreateActivity8.abc10063 = ((double) logoCreateActivity8.abc10063) > 0.78181916d ? 0.31507665f : 0.013258994f;
                String[] strArr3 = logoCreateActivity8.abc10071;
                if (strArr3 != null) {
                    strArr3[0] = null;
                }
            } else if (i != 1) {
                Bitmap decodeResource = BitmapFactory.decodeResource(LogoCreateActivity.this.getResources(), num.intValue());
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                    int length = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length;
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.abc10035 = false;
                int[] iArr2 = logoCreateActivity9.abc10041;
                if (iArr2 != null) {
                    iArr2[5] = 0;
                }
                if (logoCreateActivity9.abc37 == null) {
                    logoCreateActivity9.abc37 = new ArrayList<>();
                    LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                    logoCreateActivity10.abc10040 = true;
                    int[] iArr3 = logoCreateActivity10.abc10017;
                    if (iArr3 != null) {
                        iArr3[1] = 9;
                    }
                    if (logoCreateActivity10.abc10050 != null) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr4 = LogoCreateActivity.this.abc10050;
                            if (i4 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                                break;
                            }
                            iArr4[i4] = 6;
                            i4++;
                        }
                    }
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                if (logoCreateActivity11.abc10068 > 0.24434385259104718d) {
                    logoCreateActivity11.abc10068 = 0.9149329553435399d;
                }
                if (logoCreateActivity11.abc10070 == null) {
                    logoCreateActivity11.abc10070 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10061 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr5 = LogoCreateActivity.this.abc10061;
                        if (i5 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i5] = 9;
                        i5++;
                    }
                }
                LogoCreateActivity.this.binding.drawview.setCanvasBackgroundImage(decodeResource);
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                if (logoCreateActivity12.abc10036 == null) {
                    logoCreateActivity12.abc10036 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                logoCreateActivity13.abc10051 -= 0.18834861295635819d;
                int[] iArr6 = logoCreateActivity13.abc10017;
                if (iArr6 != null) {
                    iArr6[1] = 6;
                }
                if (logoCreateActivity13.abc2 == null) {
                    logoCreateActivity13.abc2 = new ArrayList<>();
                    LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                    if (logoCreateActivity14.abc10068 > 0.7640739864221767d) {
                        logoCreateActivity14.abc10068 = 0.35271536986100005d;
                    }
                    ArrayList<String> arrayList = logoCreateActivity14.abc10036;
                    if (arrayList != null && arrayList.size() > 0) {
                        LogoCreateActivity.this.abc10036.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                    if (logoCreateActivity15.abc10063 > 0.75188506d) {
                        logoCreateActivity15.abc10063 = 0.07925379f;
                    }
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                if (logoCreateActivity16.abc10023 == null) {
                    logoCreateActivity16.abc10023 = new String[10];
                }
                logoCreateActivity16.abc10026 = 0.9070134f;
                if (logoCreateActivity16.abc10021 == null) {
                    logoCreateActivity16.abc10021 = new String[10];
                }
                logoCreateActivity16.abc18 -= 0.07479260679088706d;
                if (logoCreateActivity16.abc10030.size() < 1) {
                    LogoCreateActivity.this.abc10030.add(0);
                }
                LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                if (logoCreateActivity17.abc10066 < 0.69750035d) {
                    logoCreateActivity17.abc10066 = 0.89168364f;
                }
                String[] strArr4 = logoCreateActivity17.abc10015;
                if (strArr4 != null) {
                    strArr4[3] = null;
                }
            } else {
                if (ContextCompat.checkSelfPermission(LogoCreateActivity.this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    LogoCreateActivity.this.startGalleryForBg();
                    LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                    if (logoCreateActivity18.abc10011 == null) {
                        logoCreateActivity18.abc10011 = new ArrayList<>();
                    }
                    if (LogoCreateActivity.this.abc1003.size() > 4) {
                        LogoCreateActivity.this.abc1003.add("ve senti");
                    }
                    LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                    logoCreateActivity19.abc10054 = "ne, th";
                    logoCreateActivity19.abc10 = !logoCreateActivity19.abc10;
                    logoCreateActivity19.abc10068 = 0.5572846814319498d;
                    if (logoCreateActivity19.abc10011.size() < 7) {
                        LogoCreateActivity.this.abc10011.add(5);
                    }
                    String[] strArr5 = LogoCreateActivity.this.abc10015;
                    if (strArr5 != null) {
                        strArr5[8] = null;
                    }
                } else {
                    LogoCreateActivity.this.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1001);
                    LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                    logoCreateActivity20.abc10065 = !logoCreateActivity20.abc10065;
                    if (logoCreateActivity20.abc10041 == null) {
                        logoCreateActivity20.abc10041 = new int[10];
                    }
                    logoCreateActivity20.abc10035 = !logoCreateActivity20.abc10035;
                    String[] strArr6 = logoCreateActivity20.abc33;
                    if (strArr6 != null) {
                        strArr6[7] = null;
                        if (logoCreateActivity20.abc10017 == null) {
                            logoCreateActivity20.abc10017 = new int[10];
                        }
                        if (logoCreateActivity20.abc10073 == null) {
                            logoCreateActivity20.abc10073 = new String[10];
                        }
                        String[] strArr7 = logoCreateActivity20.abc10073;
                        if (strArr7 != null) {
                            strArr7[6] = "rned";
                        }
                    }
                    if (logoCreateActivity20.abc10067 == null) {
                        logoCreateActivity20.abc10067 = new ArrayList<>();
                    }
                    if (LogoCreateActivity.this.abc10070.size() < 2) {
                        LogoCreateActivity.this.abc10070.add("i");
                    }
                    LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                    logoCreateActivity21.abc10035 = !logoCreateActivity21.abc10035;
                    if (logoCreateActivity21.abc10018.size() > 1) {
                        LogoCreateActivity.this.abc10018.add(" too");
                    }
                    LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                    logoCreateActivity22.abc10033 = false;
                    if (logoCreateActivity22.abc10022 == null) {
                        logoCreateActivity22.abc10022 = new String[10];
                    }
                    String[] strArr8 = logoCreateActivity22.abc25;
                    if (strArr8 != null) {
                        strArr8[1] = null;
                        logoCreateActivity22.abc10027 = -logoCreateActivity22.abc10027;
                        String[] strArr9 = logoCreateActivity22.abc10075;
                        if (strArr9 != null) {
                            strArr9[2] = "his is";
                        }
                        logoCreateActivity22.abc10076 = false;
                    }
                    int[] iArr7 = logoCreateActivity22.abc10042;
                    if (iArr7 != null) {
                        iArr7[1] = 0;
                    }
                    if (logoCreateActivity22.abc10067 == null) {
                        logoCreateActivity22.abc10067 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10036;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        LogoCreateActivity.this.abc10036.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                logoCreateActivity23.abc10052 = 6;
                if (logoCreateActivity23.abc1003 == null) {
                    logoCreateActivity23.abc1003 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                logoCreateActivity24.abc10029 = !logoCreateActivity24.abc10029;
                String[] strArr10 = logoCreateActivity24.abc19;
                if (strArr10 != null) {
                    strArr10[6] = "地方添加：   ";
                    if (logoCreateActivity24.abc10034 == null) {
                        logoCreateActivity24.abc10034 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                    logoCreateActivity25.abc10069 = "ts ";
                    logoCreateActivity25.abc10027 = 0.23528141f;
                }
                ArrayList<Integer> arrayList3 = LogoCreateActivity.this.abc10014;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10014.remove(0);
                }
                LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                if (logoCreateActivity26.abc10060 == null) {
                    logoCreateActivity26.abc10060 = new String[10];
                }
                ArrayList<Integer> arrayList4 = logoCreateActivity26.abc10034;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10034.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
            logoCreateActivity27.abc1004 = !logoCreateActivity27.abc1004;
            logoCreateActivity27.abc10064 = " well on";
            String[] strArr11 = logoCreateActivity27.abc10023;
            if (strArr11 != null) {
                strArr11[1] = null;
            }
            int[] iArr8 = logoCreateActivity27.abc13;
            if (iArr8 != null) {
                iArr8[4] = 6;
                String[] strArr12 = logoCreateActivity27.abc10071;
                if (strArr12 != null) {
                    strArr12[4] = "r ";
                }
                logoCreateActivity27.abc10066 += 0.2156812f;
                if (strArr11 != null) {
                    strArr11[8] = null;
                }
            }
            logoCreateActivity27.abc10029 = false;
            logoCreateActivity27.abc10069 = "rs than y";
            String[] strArr13 = logoCreateActivity27.abc10057;
            if (strArr13 != null) {
                strArr13[2] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$t0 */
    /* loaded from: classes3.dex */
    public class C9519t0 implements LogoDrawView.InterfaceC9664c {
        public C9519t0() {
        }

        @Override // com.logomaster.logomaker.view.LogoDrawView.InterfaceC9664c
        /* renamed from: a */
        public void mo9077a() {
            LogoCreateActivity.this.createVM.hideLayerList();
            int i = 0;
            if (LogoCreateActivity.this.abc10061 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10061;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 7;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10022 == null) {
                logoCreateActivity.abc10022 = new String[10];
            }
            logoCreateActivity.abc10059 = "o many mo";
            int[] iArr2 = logoCreateActivity.abc6;
            if (iArr2 != null) {
                iArr2[2] = 7;
                if (logoCreateActivity.abc10071 != null) {
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10071;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc10035 = !logoCreateActivity2.abc10035;
                logoCreateActivity2.abc10038 = 0.5592925f;
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10026 = Math.abs(logoCreateActivity3.abc10026);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc10036 == null) {
                logoCreateActivity4.abc10036 = new ArrayList<>();
            }
            LogoCreateActivity.this.abc10035 = true;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$t1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9520t1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9520t1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity.this.stopMove = false;
            int i = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i2 = logoCreateActivity.abc1008;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                if (logoCreateActivity.abc10024 == null) {
                    logoCreateActivity.abc10024 = new ArrayList<>();
                }
                i++;
            }
            ArrayList<String> arrayList = logoCreateActivity.abc10018;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10018.remove(0);
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc1004 = false;
            logoCreateActivity3.abc38 = 0.09973160586897623d;
            if (logoCreateActivity3.abc10015 == null) {
                logoCreateActivity3.abc10015 = new String[10];
            }
            int i3 = 0;
            while (true) {
                logoCreateActivity2 = LogoCreateActivity.this;
                int i4 = logoCreateActivity2.abc10028;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                String[] strArr = logoCreateActivity2.abc1001;
                if (strArr != null) {
                    strArr[5] = null;
                }
                i3++;
            }
            String[] strArr2 = logoCreateActivity2.abc10071;
            if (strArr2 != null) {
                strArr2[7] = null;
            }
            logoCreateActivity2.startMove(-5, 0);
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10065 = false;
            if (logoCreateActivity4.abc10023 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr3 = LogoCreateActivity.this.abc10023;
                    if (i5 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i5] = "string" + i5;
                    i5++;
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            if (logoCreateActivity5.abc10055 == null) {
                logoCreateActivity5.abc10055 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc38 > 0.39225987979635246d) {
                logoCreateActivity6.abc38 = 0.04127032005085096d;
                String[] strArr4 = logoCreateActivity6.abc10022;
                if (strArr4 != null) {
                    strArr4[3] = null;
                }
                if (logoCreateActivity6.abc10067 == null) {
                    logoCreateActivity6.abc10067 = new ArrayList<>();
                }
                if (LogoCreateActivity.this.abc10045 != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10045;
                        if (i6 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i6] = 9;
                        i6++;
                    }
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            String[] strArr5 = logoCreateActivity7.abc10031;
            if (strArr5 != null) {
                strArr5[1] = "ry";
            }
            logoCreateActivity7.abc10058 += 0.6959501800710161d;
            if (logoCreateActivity7.abc10036 == null) {
                logoCreateActivity7.abc10036 = new ArrayList<>();
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$t2 */
    /* loaded from: classes3.dex */
    public class RunnableC9521t2 implements Runnable {
        public RunnableC9521t2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Uri m9119G = LogoCreateActivity.this.binding.drawview.m9119G();
            Message message = new Message();
            Bundle bundle = new Bundle();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.isNext) {
                bundle.putParcelable("uri", m9119G);
            } else {
                logoCreateActivity.isNext = true;
            }
            message.setData(bundle);
            LogoCreateActivity.this.handler.sendMessage(message);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$u */
    /* loaded from: classes3.dex */
    public class C9522u implements Observer<List<Object>> {
        public C9522u() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<Object> list) {
            LogoCreateActivity.this.logoRvBgColorAdapter.setData(list);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity.abc10057;
            if (strArr != null) {
                strArr[3] = null;
            }
            if (logoCreateActivity.abc10067.size() > 2) {
                LogoCreateActivity.this.abc10067.add("literary ");
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10052 = logoCreateActivity2.abc10052 >= 7 ? 9 : 2;
            if (logoCreateActivity2.abc24 > 0.6702321171164805d) {
                logoCreateActivity2.abc24 = 0.9236556773039301d;
                logoCreateActivity2.abc10027 = -logoCreateActivity2.abc10027;
                if (!TextUtils.isEmpty(logoCreateActivity2.abc10062)) {
                    int length = LogoCreateActivity.this.abc10062.length();
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    logoCreateActivity3.abc10062 = LogoCreateActivity.this.abc10062 + length;
                }
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10078;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10078.remove(0);
                }
            }
            if (LogoCreateActivity.this.abc10055.size() < 3) {
                LogoCreateActivity.this.abc10055.add(8);
            }
            ArrayList<String> arrayList2 = LogoCreateActivity.this.abc1003;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10035 = !logoCreateActivity4.abc10035;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$u0 */
    /* loaded from: classes3.dex */
    public class C9523u0 implements LogoDrawView.InterfaceC9663b {
        public C9523u0() {
        }

        @Override // com.logomaster.logomaker.view.LogoDrawView.InterfaceC9663b
        /* renamed from: a */
        public void mo9078a(int i) {
            LogoCreateActivity.this.finderColor = i;
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10027 = 0.120746076f;
            logoCreateActivity.abc10065 = !logoCreateActivity.abc10065;
            ArrayList<Integer> arrayList = logoCreateActivity.abc1000;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc1000.remove(0);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc30 = logoCreateActivity2.abc30 < 8 ? 7 : 9;
            int[] iArr = logoCreateActivity2.abc10041;
            if (iArr != null) {
                iArr[5] = 0;
            }
            logoCreateActivity2.abc10025 = 0.6355671f;
            if (logoCreateActivity2.abc10036.size() < 5) {
                LogoCreateActivity.this.abc10036.add("i");
            }
            LogoCreateActivity.this.binding.includeColorFinder.viewShowColor.setCardBackgroundColor(i);
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity3.abc1002;
            if (iArr2 != null) {
                iArr2[3] = 6;
            }
            ArrayList<Integer> arrayList2 = logoCreateActivity3.abc10030;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10030.remove(0);
            }
            ArrayList<String> arrayList3 = LogoCreateActivity.this.abc10018;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10018.remove(0);
            }
            if (LogoCreateActivity.this.abc11.size() > 8) {
                LogoCreateActivity.this.abc11.add("   ");
                ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc10030;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10030.remove(0);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc1005 > 0) {
                    logoCreateActivity4.abc1005 = 2;
                }
                logoCreateActivity4.abc10066 = ((double) logoCreateActivity4.abc10066) > 0.47164273d ? 0.19770479f : 0.61237705f;
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10019 *= 7;
            if (logoCreateActivity5.abc10036 == null) {
                logoCreateActivity5.abc10036 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc10041 == null) {
                logoCreateActivity6.abc10041 = new int[10];
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$u1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9524u1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9524u1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.stopMove = false;
            ArrayList<String> arrayList = LogoCreateActivity.this.abc10018;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10018.remove(0);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity2.abc10015;
            if (strArr != null) {
                strArr[9] = "read i";
            }
            if (logoCreateActivity2.abc10017 == null) {
                logoCreateActivity2.abc10017 = new int[10];
            }
            if (logoCreateActivity2.abc19 != null) {
                int i = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    String[] strArr2 = logoCreateActivity.abc19;
                    if (i >= strArr2.length) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    logoCreateActivity3.abc10033 = logoCreateActivity3.abc10033 ^ true;
                    logoCreateActivity3.abc10051 = logoCreateActivity3.abc10051 + 0.4674190796555826d;
                    if (logoCreateActivity3.abc1000 == null) {
                        logoCreateActivity3.abc1000 = new ArrayList<>();
                    }
                    i++;
                }
                if (logoCreateActivity.abc1005 > 0) {
                    logoCreateActivity.abc1005 = 3;
                }
                if (logoCreateActivity.abc10017 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10017;
                        if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i2] = 2;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc10061 == null) {
                    logoCreateActivity4.abc10061 = new int[10];
                }
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity5.abc1001;
            if (strArr3 != null) {
                strArr3[3] = "fore p";
            }
            if (!TextUtils.isEmpty(logoCreateActivity5.abc10062)) {
                int length = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
            }
            if (LogoCreateActivity.this.abc1003.size() > 2) {
                LogoCreateActivity.this.abc1003.add(ReportUtil.f18058a);
            }
            LogoCreateActivity.this.startMove(5, 0);
            if (LogoCreateActivity.this.abc10078.size() < 9) {
                LogoCreateActivity.this.abc10078.add(1);
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity6.abc10041;
            if (iArr2 != null) {
                iArr2[3] = 0;
            }
            logoCreateActivity6.abc10072 = true;
            logoCreateActivity6.abc4 += 0.62903464f;
            if (logoCreateActivity6.abc10073 == null) {
                logoCreateActivity6.abc10073 = new String[10];
            }
            if (logoCreateActivity6.abc10055.size() < 8) {
                LogoCreateActivity.this.abc10055.add(0);
            }
            if (LogoCreateActivity.this.abc10015 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr4 = LogoCreateActivity.this.abc10015;
                    if (i3 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i3] = "string" + i3;
                    i3++;
                }
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$u2 */
    /* loaded from: classes3.dex */
    public class C9525u2 implements Observer<Boolean> {
        public C9525u2() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            LogoCreateActivity logoCreateActivity;
            int i;
            if (bool.booleanValue()) {
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                ActivityCreateBinding activityCreateBinding = logoCreateActivity2.binding;
                logoCreateActivity2.showView(activityCreateBinding.rvLayer, activityCreateBinding.llLayer);
                if (LogoCreateActivity.this.abc1000.size() < 6) {
                    LogoCreateActivity.this.abc1000.add(2);
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10038 = ((double) logoCreateActivity3.abc10038) < 0.48726255d ? 0.6935231f : 0.2649157f;
                if (logoCreateActivity3.abc10057 == null) {
                    logoCreateActivity3.abc10057 = new String[10];
                }
                if (logoCreateActivity3.abc31 == null) {
                    logoCreateActivity3.abc31 = new String[10];
                    logoCreateActivity3.abc1004 = !logoCreateActivity3.abc1004;
                    logoCreateActivity3.abc1005 *= 6;
                    if (logoCreateActivity3.abc10047 == null) {
                        logoCreateActivity3.abc10047 = new int[10];
                    }
                }
                if (logoCreateActivity3.abc10073 == null) {
                    logoCreateActivity3.abc10073 = new String[10];
                }
                if (logoCreateActivity3.abc10030 == null) {
                    logoCreateActivity3.abc10030 = new ArrayList<>();
                }
                LogoCreateActivity.this.abc10033 = false;
            } else {
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                ActivityCreateBinding activityCreateBinding2 = logoCreateActivity4.binding;
                logoCreateActivity4.hideView(activityCreateBinding2.rvLayer, activityCreateBinding2.llLayer);
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                if (logoCreateActivity5.abc10017 == null) {
                    logoCreateActivity5.abc10017 = new int[10];
                }
                if (!TextUtils.isEmpty(logoCreateActivity5.abc10054)) {
                    int length = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                if (logoCreateActivity6.abc10068 < 0.3617731768206347d) {
                    logoCreateActivity6.abc10068 = 0.4903685966166632d;
                }
                if (logoCreateActivity6.abc32 == null) {
                    logoCreateActivity6.abc32 = new int[10];
                    if (logoCreateActivity6.abc10011.size() > 8) {
                        LogoCreateActivity.this.abc10011.add(0);
                    }
                    LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity7.abc1001;
                    if (strArr != null) {
                        strArr[3] = "ok d";
                    }
                    if (logoCreateActivity7.abc10078.size() > 3) {
                        LogoCreateActivity.this.abc10078.add(2);
                    }
                }
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    i = logoCreateActivity.abc1005;
                    if (i2 >= (i > 3 ? 3 : i)) {
                        break;
                    }
                    if (!TextUtils.isEmpty(logoCreateActivity.abc10062)) {
                        int length2 = LogoCreateActivity.this.abc10062.length();
                        LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length2;
                    }
                    i2++;
                }
                if (logoCreateActivity.abc10016 == null) {
                    logoCreateActivity.abc10016 = new String[10];
                }
                if (i < 0) {
                    logoCreateActivity.abc1005 = 8;
                }
            }
            if (LogoCreateActivity.this.abc10060 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10060;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            logoCreateActivity8.abc10052 += 2;
            logoCreateActivity8.abc10019 = 8;
            logoCreateActivity8.abc4 = 0.9834069f;
            String[] strArr3 = logoCreateActivity8.abc10022;
            if (strArr3 != null) {
                strArr3[4] = " wasn’t ";
            }
            String[] strArr4 = logoCreateActivity8.abc1001;
            if (strArr4 != null) {
                strArr4[3] = null;
            }
            int[] iArr = logoCreateActivity8.abc10047;
            if (iArr != null) {
                iArr[2] = 0;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$v */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9526v implements View.OnClickListener {
        public View$OnClickListenerC9526v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LogoCreateActivity.this.isCanSvae) {
                LogoCreateActivity.this.binding.tvSave.setBackgroundResource(R.drawable.shape_btn_save_radius);
                LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity.abc10045;
                if (iArr != null) {
                    iArr[8] = 2;
                }
                if (logoCreateActivity.abc10074 == null) {
                    logoCreateActivity.abc10074 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc10068 = Math.abs(logoCreateActivity2.abc10068);
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc11 == null) {
                    logoCreateActivity3.abc11 = new ArrayList<>();
                    LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                    if (logoCreateActivity4.abc10024 == null) {
                        logoCreateActivity4.abc10024 = new ArrayList<>();
                    }
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                        int length = LogoCreateActivity.this.abc10054.length();
                        LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
                    }
                    LogoCreateActivity.this.abc10020 = 0.2675122f;
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc10028 -= 2;
                logoCreateActivity5.abc10033 = !logoCreateActivity5.abc10033;
                if (!TextUtils.isEmpty(logoCreateActivity5.abc10012)) {
                    int length2 = LogoCreateActivity.this.abc10012.length();
                    LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length2;
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc14 = logoCreateActivity6.abc14 < 0.5016004201401715d ? 0.0748630166940607d : 0.08311663514248546d;
                String[] strArr = logoCreateActivity6.abc10060;
                if (strArr != null) {
                    strArr[2] = "is k";
                }
                if (logoCreateActivity6.abc10011 == null) {
                    logoCreateActivity6.abc10011 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc10025 = ((double) logoCreateActivity7.abc10025) > 0.4495899d ? 0.6932718f : 0.7084699f;
                logoCreateActivity7.save();
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc10012 = "ille’s nov";
                if (logoCreateActivity8.abc1008 > 0) {
                    logoCreateActivity8.abc1008 = 4;
                }
                String[] strArr2 = logoCreateActivity8.abc10075;
                if (strArr2 != null) {
                    strArr2[6] = " until you";
                }
                int[] iArr2 = logoCreateActivity8.abc34;
                if (iArr2 != null) {
                    iArr2[4] = 2;
                    logoCreateActivity8.abc10029 = true;
                    String[] strArr3 = logoCreateActivity8.abc10073;
                    if (strArr3 != null) {
                        strArr3[9] = "e forced ";
                    }
                    logoCreateActivity8.abc10058 = 0.42356283708285225d;
                }
                if (logoCreateActivity8.abc10061 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr3 = LogoCreateActivity.this.abc10061;
                        if (i >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                            break;
                        }
                        iArr3[i] = 9;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                int[] iArr4 = logoCreateActivity9.abc10061;
                if (iArr4 != null) {
                    iArr4[1] = 2;
                }
                ArrayList<String> arrayList = logoCreateActivity9.abc10039;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10039.remove(0);
                }
            } else {
                LogoCreateActivity.this.binding.tvSave.setBackgroundResource(R.drawable.shape_btn_save_radius2);
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                if (logoCreateActivity10.abc10024 == null) {
                    logoCreateActivity10.abc10024 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                String[] strArr4 = logoCreateActivity11.abc10022;
                if (strArr4 != null) {
                    strArr4[4] = null;
                }
                if (logoCreateActivity11.abc10070 == null) {
                    logoCreateActivity11.abc10070 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                if (logoCreateActivity12.abc38 > 0.48673942875764764d) {
                    logoCreateActivity12.abc38 = 0.9097066452719043d;
                    logoCreateActivity12.abc10027 -= 0.7692986f;
                    logoCreateActivity12.abc10028 = logoCreateActivity12.abc10028 < 0 ? 0 : 4;
                    ArrayList<Integer> arrayList2 = logoCreateActivity12.abc10010;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoCreateActivity.this.abc10010.remove(0);
                    }
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                if (logoCreateActivity13.abc10043 == null) {
                    logoCreateActivity13.abc10043 = new String[10];
                }
                ArrayList<Integer> arrayList3 = logoCreateActivity13.abc10014;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10014.remove(0);
                }
                int[] iArr5 = LogoCreateActivity.this.abc10045;
                if (iArr5 != null) {
                    iArr5[5] = 9;
                }
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            logoCreateActivity14.abc10068 -= 0.07366065077381423d;
            int[] iArr6 = logoCreateActivity14.abc10047;
            if (iArr6 != null) {
                iArr6[1] = 0;
            }
            int[] iArr7 = logoCreateActivity14.abc10041;
            if (iArr7 != null) {
                iArr7[6] = 0;
            }
            int[] iArr8 = logoCreateActivity14.abc1;
            if (iArr8 != null) {
                iArr8[6] = 0;
                String[] strArr5 = logoCreateActivity14.abc10043;
                if (strArr5 != null) {
                    strArr5[5] = "nd t";
                }
                String[] strArr6 = logoCreateActivity14.abc10031;
                if (strArr6 != null) {
                    strArr6[9] = null;
                }
                if (logoCreateActivity14.abc10052 > 0) {
                    logoCreateActivity14.abc10052 = 2;
                }
            }
            int[] iArr9 = logoCreateActivity14.abc10045;
            if (iArr9 != null) {
                iArr9[4] = 3;
            }
            logoCreateActivity14.abc10051 = 0.46869111505408867d;
            ArrayList<Integer> arrayList4 = logoCreateActivity14.abc1000;
            if (arrayList4 != null || arrayList4.size() <= 0) {
                return;
            }
            LogoCreateActivity.this.abc1000.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$v0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9527v0 implements View.OnClickListener {
        public View$OnClickListenerC9527v0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            int i = 0;
            LogoCreateActivity.this.binding.drawview.setEditBackgound(false);
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc10043 == null) {
                logoCreateActivity3.abc10043 = new String[10];
            }
            logoCreateActivity3.abc1007 += 0.8023584f;
            if (!TextUtils.isEmpty(logoCreateActivity3.abc10059)) {
                int length = LogoCreateActivity.this.abc10059.length();
                LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
            }
            LogoCreateActivity.this.binding.drawview.m9084u();
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10062 = "n in the e";
            if (logoCreateActivity4.abc10056.size() > 1) {
                LogoCreateActivity.this.abc10056.add(0);
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10072 = !logoCreateActivity5.abc10072;
            if (logoCreateActivity5.abc33 != null) {
                int i2 = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity2.abc33;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                    logoCreateActivity6.abc10051 = logoCreateActivity6.abc10051 > 0.768591691810543d ? 0.032527246189095305d : 0.8255502104597879d;
                    logoCreateActivity6.abc10019 += 6;
                    if (!TextUtils.isEmpty(logoCreateActivity6.abc10069)) {
                        int length2 = LogoCreateActivity.this.abc10069.length();
                        LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length2;
                    }
                    i2++;
                }
                if (logoCreateActivity2.abc1007 > 0.48029447d) {
                    logoCreateActivity2.abc1007 = 0.790879f;
                }
                logoCreateActivity2.abc10013 = ((double) logoCreateActivity2.abc10013) < 0.0659281d ? 0.8235736f : 0.38343352f;
                if (logoCreateActivity2.abc1003.size() > 4) {
                    LogoCreateActivity.this.abc1003.add(" ");
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            if (logoCreateActivity7.abc10050 == null) {
                logoCreateActivity7.abc10050 = new int[10];
            }
            if (logoCreateActivity7.abc10078 == null) {
                logoCreateActivity7.abc10078 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity8.abc10022;
            if (strArr2 != null) {
                strArr2[4] = "ride and P";
            }
            int i3 = logoCreateActivity8.finderType;
            if (i3 == 0) {
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                logoCreateActivity9.binding.drawview.setFillColor(Integer.valueOf(logoCreateActivity9.finderColor));
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10074;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10074.remove(0);
                }
                ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10024;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10024.remove(0);
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity10.abc10050;
                if (iArr != null) {
                    iArr[6] = 0;
                }
                ArrayList<String> arrayList3 = logoCreateActivity10.abc8;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc8.remove(0);
                    LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                    logoCreateActivity11.abc10029 = false;
                    int[] iArr2 = logoCreateActivity11.abc10017;
                    if (iArr2 != null) {
                        iArr2[8] = 0;
                    }
                    if (logoCreateActivity11.abc10034 == null) {
                        logoCreateActivity11.abc10034 = new ArrayList<>();
                    }
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10028 = 6;
                if (logoCreateActivity12.abc1003 == null) {
                    logoCreateActivity12.abc1003 = new ArrayList<>();
                }
                LogoCreateActivity.this.abc1005 = 3;
            } else if (i3 == 1) {
                LogoCreateActivity.this.showFirstMenu();
                int i4 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int i5 = logoCreateActivity.abc1008;
                    if (i5 > 3) {
                        i5 = 3;
                    }
                    if (i4 >= i5) {
                        break;
                    }
                    logoCreateActivity.abc10066 = 0.7094496f;
                    i4++;
                }
                logoCreateActivity.abc10012 = "tta ";
                if (logoCreateActivity.abc10036 == null) {
                    logoCreateActivity.abc10036 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                logoCreateActivity13.binding.drawview.setCanvasBackgroundColor(Integer.valueOf(logoCreateActivity13.finderColor));
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                logoCreateActivity14.abc1007 = ((double) logoCreateActivity14.abc1007) > 0.21714407d ? 0.51920736f : 0.075000286f;
                if (logoCreateActivity14.abc10045 == null) {
                    logoCreateActivity14.abc10045 = new int[10];
                }
                logoCreateActivity14.abc10052 = 8;
                String[] strArr3 = logoCreateActivity14.abc31;
                if (strArr3 != null) {
                    strArr3[3] = "，当ra";
                    ArrayList<String> arrayList4 = logoCreateActivity14.abc1003;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        LogoCreateActivity.this.abc1003.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                    if (logoCreateActivity15.abc10074 == null) {
                        logoCreateActivity15.abc10074 = new ArrayList<>();
                    }
                    if (LogoCreateActivity.this.abc10022 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr4 = LogoCreateActivity.this.abc10022;
                            if (i6 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                                break;
                            }
                            strArr4[i6] = "string" + i6;
                            i6++;
                        }
                    }
                }
                if (LogoCreateActivity.this.abc10036.size() < 8) {
                    LogoCreateActivity.this.abc10036.add("took de");
                }
                ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10037;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
                LogoCreateActivity.this.abc10029 = true;
            }
            if (LogoCreateActivity.this.abc1003.size() > 4) {
                LogoCreateActivity.this.abc1003.add("g");
            }
            LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
            logoCreateActivity16.abc10040 = !logoCreateActivity16.abc10040;
            logoCreateActivity16.abc10068 = -logoCreateActivity16.abc10068;
            if (logoCreateActivity16.abc13 == null) {
                logoCreateActivity16.abc13 = new int[10];
                String[] strArr5 = logoCreateActivity16.abc10043;
                if (strArr5 != null) {
                    strArr5[7] = null;
                }
                if (!TextUtils.isEmpty(logoCreateActivity16.abc10064)) {
                    int length3 = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length3;
                }
                LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                if (logoCreateActivity17.abc1002 == null) {
                    logoCreateActivity17.abc1002 = new int[10];
                }
            }
            LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
            if (logoCreateActivity18.abc10022 == null) {
                logoCreateActivity18.abc10022 = new String[10];
            }
            if (logoCreateActivity18.abc10070 == null) {
                logoCreateActivity18.abc10070 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
            if (logoCreateActivity19.abc10067 == null) {
                logoCreateActivity19.abc10067 = new ArrayList<>();
            }
            LogoCreateActivity.this.binding.drawview.m9118H();
            LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
            logoCreateActivity20.abc10019 = 5;
            if (logoCreateActivity20.abc10075 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr6 = LogoCreateActivity.this.abc10075;
                    if (i7 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i7] = "string" + i7;
                    i7++;
                }
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10059)) {
                int length4 = LogoCreateActivity.this.abc10059.length();
                LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length4;
            }
            LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
            logoCreateActivity21.abc18 = 0.4542665897086777d;
            if (!TextUtils.isEmpty(logoCreateActivity21.abc10062)) {
                int length5 = LogoCreateActivity.this.abc10062.length();
                LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length5;
            }
            LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
            if (logoCreateActivity22.abc10045 == null) {
                logoCreateActivity22.abc10045 = new int[10];
            }
            logoCreateActivity22.abc10051 = Math.abs(logoCreateActivity22.abc10051);
            LogoCreateActivity.this.createVM.hideColorFinderLayout();
            LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
            int[] iArr3 = logoCreateActivity23.abc10045;
            if (iArr3 != null) {
                iArr3[8] = 0;
            }
            logoCreateActivity23.abc10025 *= 0.7772953f;
            if (!TextUtils.isEmpty(logoCreateActivity23.abc10012)) {
                int length6 = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length6;
            }
            LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
            if (logoCreateActivity24.abc24 > 0.2566317309169911d) {
                logoCreateActivity24.abc24 = 0.4505420215307343d;
                if (logoCreateActivity24.abc10034.size() < 3) {
                    LogoCreateActivity.this.abc10034.add(3);
                }
                LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                logoCreateActivity25.abc10076 = true ^ logoCreateActivity25.abc10076;
                if (logoCreateActivity25.abc10073 == null) {
                    logoCreateActivity25.abc10073 = new String[10];
                }
            }
            LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
            logoCreateActivity26.abc1007 = ((double) logoCreateActivity26.abc1007) > 0.91419905d ? 0.56352776f : 0.47485888f;
            if (logoCreateActivity26.abc10038 < 0.8022065d) {
                logoCreateActivity26.abc10038 = 0.47001332f;
            }
            if (logoCreateActivity26.abc10061 == null) {
                return;
            }
            while (true) {
                int[] iArr4 = LogoCreateActivity.this.abc10061;
                if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    return;
                }
                iArr4[i] = 5;
                i++;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$v1 */
    /* loaded from: classes3.dex */
    public class View$OnLongClickListenerC9528v1 implements View.OnLongClickListener {
        public View$OnLongClickListenerC9528v1() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LogoCreateActivity.this.stopMove = false;
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity.abc10061;
            if (iArr != null) {
                iArr[9] = 0;
            }
            if (logoCreateActivity.abc10077 == null) {
                logoCreateActivity.abc10077 = new String[10];
            }
            logoCreateActivity.abc10029 = false;
            logoCreateActivity.abc14 = 0.625522907168551d;
            if (logoCreateActivity.abc10039 == null) {
                logoCreateActivity.abc10039 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity2.abc10041;
            if (iArr2 != null) {
                iArr2[3] = 0;
            }
            if (logoCreateActivity2.abc10011 == null) {
                logoCreateActivity2.abc10011 = new ArrayList<>();
            }
            LogoCreateActivity.this.startMove(0, 5);
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10058 = logoCreateActivity3.abc10058 > 0.6059973493396902d ? 0.14447920830691274d : 0.7308368289235269d;
            ArrayList<Integer> arrayList = logoCreateActivity3.abc10014;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10014.remove(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc1008 += 7;
            if (!TextUtils.isEmpty(logoCreateActivity4.abc26)) {
                int length = LogoCreateActivity.this.abc26.length();
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                logoCreateActivity5.abc1005 = 2;
                logoCreateActivity5.abc10063 -= 0.42931986f;
                logoCreateActivity5.abc10076 = !logoCreateActivity5.abc10076;
                logoCreateActivity5.abc26 = LogoCreateActivity.this.abc26 + length;
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10065 = true;
                if (logoCreateActivity6.abc10020 < 0.5521372d) {
                    logoCreateActivity6.abc10020 = 0.38971114f;
                }
                String[] strArr = logoCreateActivity6.abc10023;
                if (strArr != null) {
                    strArr[8] = null;
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc1005 = Math.abs(logoCreateActivity7.abc1005);
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10061 == null) {
                logoCreateActivity8.abc10061 = new int[10];
            }
            if (logoCreateActivity8.abc10057 != null) {
                int i = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10057;
                    if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    i++;
                }
            }
            return false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$w */
    /* loaded from: classes3.dex */
    public class C9529w implements LogoRvBgColorAdapter.InterfaceC9600b {
        public C9529w() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvBgColorAdapter.InterfaceC9600b
        /* renamed from: a */
        public void mo9206a(int i, Object obj) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            int i2;
            if (i == 0) {
                LogoCreateActivity.this.binding.drawview.setCanvasBackgroundColor(null);
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10037;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
                LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                if (logoCreateActivity5.abc10023 == null) {
                    logoCreateActivity5.abc10023 = new String[10];
                }
                if (logoCreateActivity5.abc10037.size() > 2) {
                    LogoCreateActivity.this.abc10037.add(9);
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc24 = 0.765026349505746d;
                if (logoCreateActivity6.abc10013 < 0.6135645d) {
                    logoCreateActivity6.abc10013 = 0.79338235f;
                }
                logoCreateActivity6.abc10051 = 0.9240514685287002d;
                logoCreateActivity6.abc10046 += 5;
                logoCreateActivity6.binding.drawview.setCanvasBackgroundImage(null);
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                logoCreateActivity7.abc10020 = 0.063385844f;
                if (logoCreateActivity7.abc10039.size() < 9) {
                    LogoCreateActivity.this.abc10039.add("e pro");
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                int[] iArr = logoCreateActivity8.abc10050;
                if (iArr != null) {
                    iArr[9] = 0;
                }
                logoCreateActivity8.abc39 = logoCreateActivity8.abc39 > 6 ? 5 : 4;
                ArrayList<Integer> arrayList2 = logoCreateActivity8.abc10037;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
                LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                if (logoCreateActivity9.abc10074 == null) {
                    logoCreateActivity9.abc10074 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                logoCreateActivity10.abc10012 = "t";
                logoCreateActivity10.abc30 = 8;
                logoCreateActivity10.abc10032 = !logoCreateActivity10.abc10032;
                String[] strArr = logoCreateActivity10.abc10022;
                if (strArr != null) {
                    strArr[3] = " ";
                }
                if (logoCreateActivity10.abc10047 == null) {
                    logoCreateActivity10.abc10047 = new int[10];
                }
            } else if (i == 1) {
                LogoCreateActivity.this.finderType = 1;
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                logoCreateActivity11.abc1007 = 0.12974167f;
                if (logoCreateActivity11.abc10056.size() > 7) {
                    LogoCreateActivity.this.abc10056.add(0);
                }
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10064 = "or";
                if (logoCreateActivity12.abc8.size() > 6) {
                    LogoCreateActivity.this.abc8.add("玻璃效果)");
                    if (LogoCreateActivity.this.abc10022 != null) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr2 = LogoCreateActivity.this.abc10022;
                            if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i3] = "string" + i3;
                            i3++;
                        }
                    }
                    ArrayList<String> arrayList3 = LogoCreateActivity.this.abc10018;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        LogoCreateActivity.this.abc10018.remove(0);
                    }
                    LogoCreateActivity.this.abc10035 = !logoCreateActivity3.abc10035;
                }
                if (LogoCreateActivity.this.abc10055.size() > 0) {
                    LogoCreateActivity.this.abc10055.add(9);
                }
                ArrayList<Integer> arrayList4 = LogoCreateActivity.this.abc10055;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10055.remove(0);
                }
                LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                logoCreateActivity13.abc10059 = "this ";
                logoCreateActivity13.binding.drawview.m9107S();
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity14.abc10043;
                if (strArr3 != null) {
                    strArr3[9] = null;
                }
                logoCreateActivity14.abc10020 = Math.abs(logoCreateActivity14.abc10020);
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                    int length = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length;
                }
                ArrayList<String> arrayList5 = LogoCreateActivity.this.abc21;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc21.remove(0);
                    LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                    if (logoCreateActivity15.abc1001 == null) {
                        logoCreateActivity15.abc1001 = new String[10];
                    }
                    int[] iArr2 = logoCreateActivity15.abc10042;
                    if (iArr2 != null) {
                        iArr2[3] = 0;
                    }
                    logoCreateActivity15.abc10012 = "arne";
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10059)) {
                    int length2 = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length2;
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                logoCreateActivity16.abc10046 = logoCreateActivity16.abc10046 > 4 ? 2 : 9;
                if (logoCreateActivity16.abc10031 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10031;
                        if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i4] = "string" + i4;
                        i4++;
                    }
                }
                LogoCreateActivity.this.createVM.hideBackgroundLayout();
                if (LogoCreateActivity.this.abc10055.size() > 7) {
                    LogoCreateActivity.this.abc10055.add(2);
                }
                LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                String[] strArr5 = logoCreateActivity17.abc1001;
                if (strArr5 != null) {
                    strArr5[7] = null;
                }
                logoCreateActivity17.abc10051 *= 0.6247932502034207d;
                if (logoCreateActivity17.abc16 != null) {
                    int i5 = 0;
                    while (true) {
                        logoCreateActivity2 = LogoCreateActivity.this;
                        int[] iArr3 = logoCreateActivity2.abc16;
                        if (i5 >= iArr3.length) {
                            break;
                        }
                        iArr3[i5] = 9;
                        logoCreateActivity2.abc10040 = true;
                        if (logoCreateActivity2.abc10068 < 0.5498187253090802d) {
                            logoCreateActivity2.abc10068 = 0.0762188384609912d;
                        }
                        logoCreateActivity2.abc10020 = 0.6155582f;
                        i5++;
                    }
                    if (logoCreateActivity2.abc10034 == null) {
                        logoCreateActivity2.abc10034 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                    logoCreateActivity18.abc1007 = 0.23738253f;
                    logoCreateActivity18.abc10051 += 0.7046104649596665d;
                }
                LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                logoCreateActivity19.abc10058 = 0.8971498453441449d;
                logoCreateActivity19.abc10058 = 0.5679966123172864d;
                logoCreateActivity19.abc10027 -= 0.3585881f;
                logoCreateActivity19.createVM.showColorFinderLayout();
                LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                logoCreateActivity20.abc10072 = false;
                if (logoCreateActivity20.abc10073 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr6 = LogoCreateActivity.this.abc10073;
                        if (i6 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                            break;
                        }
                        strArr6[i6] = "string" + i6;
                        i6++;
                    }
                }
                LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                if (logoCreateActivity21.abc10068 > 0.23759747539149956d) {
                    logoCreateActivity21.abc10068 = 0.23616490664956202d;
                }
                if (logoCreateActivity21.abc22 == null) {
                    logoCreateActivity21.abc22 = new int[10];
                    logoCreateActivity21.abc10027 = -logoCreateActivity21.abc10027;
                    ArrayList<String> arrayList6 = logoCreateActivity21.abc10024;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        LogoCreateActivity.this.abc10024.remove(0);
                    }
                    int[] iArr4 = LogoCreateActivity.this.abc10050;
                    if (iArr4 != null) {
                        iArr4[4] = 0;
                    }
                }
                LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                logoCreateActivity22.abc10065 = !logoCreateActivity22.abc10065;
                String[] strArr7 = logoCreateActivity22.abc10043;
                if (strArr7 != null) {
                    strArr7[9] = null;
                }
                logoCreateActivity22.abc10046 = 2;
            } else if (i == LogoCreateActivity.this.logoRvBgColorAdapter.getItemCount() - 1) {
                LogoCreateActivity.this.rainbowType = 1;
                LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                logoCreateActivity23.abc1004 = false;
                if (logoCreateActivity23.abc10020 < 0.47093296d) {
                    logoCreateActivity23.abc10020 = 0.5639758f;
                }
                logoCreateActivity23.abc10026 = 0.16467041f;
                int[] iArr5 = logoCreateActivity23.abc32;
                if (iArr5 != null) {
                    iArr5[1] = 0;
                    if (logoCreateActivity23.abc10074.size() > 1) {
                        LogoCreateActivity.this.abc10074.add(2);
                    }
                    LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                    logoCreateActivity24.abc10032 = true;
                    if (logoCreateActivity24.abc10022 == null) {
                        logoCreateActivity24.abc10022 = new String[10];
                    }
                }
                LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                logoCreateActivity25.abc10012 = "ny w";
                logoCreateActivity25.abc10066 = ((double) logoCreateActivity25.abc10066) > 0.8359846d ? 0.6406417f : 0.29407507f;
                if (logoCreateActivity25.abc10013 > 0.10427028d) {
                    logoCreateActivity25.abc10013 = 0.3761378f;
                }
                logoCreateActivity25.lastBgColorTemp = logoCreateActivity25.binding.drawview.getCurrentBackgroudColor();
                LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                String[] strArr8 = logoCreateActivity26.abc10060;
                if (strArr8 != null) {
                    strArr8[1] = null;
                }
                if (logoCreateActivity26.abc10043 != null) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr9 = LogoCreateActivity.this.abc10043;
                        if (i7 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                            break;
                        }
                        strArr9[i7] = "string" + i7;
                        i7++;
                    }
                }
                LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                if (logoCreateActivity27.abc10052 > 0) {
                    logoCreateActivity27.abc10052 = 5;
                }
                logoCreateActivity27.abc12 = 0.35615712f;
                if (!TextUtils.isEmpty(logoCreateActivity27.abc10059)) {
                    int length3 = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length3;
                }
                LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
                if (logoCreateActivity28.abc10034 == null) {
                    logoCreateActivity28.abc10034 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
                logoCreateActivity29.abc10033 = !logoCreateActivity29.abc10033;
                logoCreateActivity29.lastBgImageTemp = logoCreateActivity29.binding.drawview.getCurrentBackgroudImage();
                LogoCreateActivity logoCreateActivity30 = LogoCreateActivity.this;
                int[] iArr6 = logoCreateActivity30.abc10061;
                if (iArr6 != null) {
                    iArr6[8] = 0;
                }
                if (logoCreateActivity30.abc10070 == null) {
                    logoCreateActivity30.abc10070 = new ArrayList<>();
                }
                ArrayList<String> arrayList7 = LogoCreateActivity.this.abc10024;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    LogoCreateActivity.this.abc10024.remove(0);
                }
                LogoCreateActivity logoCreateActivity31 = LogoCreateActivity.this;
                if (logoCreateActivity31.abc32 == null) {
                    logoCreateActivity31.abc32 = new int[10];
                    logoCreateActivity31.abc10051 *= 0.04982292170935776d;
                    if (logoCreateActivity31.abc10010.size() > 3) {
                        LogoCreateActivity.this.abc10010.add(5);
                    }
                    if (LogoCreateActivity.this.abc10037.size() > 5) {
                        LogoCreateActivity.this.abc10037.add(5);
                    }
                }
                LogoCreateActivity logoCreateActivity32 = LogoCreateActivity.this;
                int[] iArr7 = logoCreateActivity32.abc10042;
                if (iArr7 != null) {
                    iArr7[3] = 7;
                }
                logoCreateActivity32.abc10027 = 0.5543349f;
                logoCreateActivity32.abc10013 = ((double) logoCreateActivity32.abc10013) > 0.48628694d ? 0.6920004f : 0.31820327f;
                logoCreateActivity32.createVM.hideBackgroundLayout();
                LogoCreateActivity logoCreateActivity33 = LogoCreateActivity.this;
                if (logoCreateActivity33.abc10034 == null) {
                    logoCreateActivity33.abc10034 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity34 = LogoCreateActivity.this;
                logoCreateActivity34.abc10026 = ((double) logoCreateActivity34.abc10026) < 0.6955059d ? 0.6856584f : 0.06583947f;
                if (logoCreateActivity34.abc10037.size() < 4) {
                    LogoCreateActivity.this.abc10037.add(2);
                }
                LogoCreateActivity logoCreateActivity35 = LogoCreateActivity.this;
                logoCreateActivity35.abc18 = logoCreateActivity35.abc18 < 0.9619315180833139d ? 0.12743949673550303d : 0.6791411635521621d;
                logoCreateActivity35.abc10046 = 2;
                if (logoCreateActivity35.abc10055 == null) {
                    logoCreateActivity35.abc10055 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity36 = LogoCreateActivity.this;
                int[] iArr8 = logoCreateActivity36.abc10017;
                if (iArr8 != null) {
                    iArr8[2] = 0;
                }
                logoCreateActivity36.createVM.showColorRainbowLayout();
                LogoCreateActivity logoCreateActivity37 = LogoCreateActivity.this;
                if (logoCreateActivity37.abc1003 == null) {
                    logoCreateActivity37.abc1003 = new ArrayList<>();
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                    int length4 = LogoCreateActivity.this.abc10064.length();
                    LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length4;
                }
                LogoCreateActivity logoCreateActivity38 = LogoCreateActivity.this;
                if (logoCreateActivity38.abc1008 < 0) {
                    logoCreateActivity38.abc1008 = 3;
                }
                logoCreateActivity38.abc30 = logoCreateActivity38.abc30 > 0 ? 4 : 3;
                if (logoCreateActivity38.abc10061 == null) {
                    logoCreateActivity38.abc10061 = new int[10];
                }
                logoCreateActivity38.abc10029 = !logoCreateActivity38.abc10029;
                ArrayList<Integer> arrayList8 = logoCreateActivity38.abc1000;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                LogoCreateActivity logoCreateActivity39 = LogoCreateActivity.this;
                if (logoCreateActivity39.abc19 == null) {
                    logoCreateActivity39.abc19 = new String[10];
                    ArrayList<String> arrayList9 = logoCreateActivity39.abc10070;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        LogoCreateActivity.this.abc10070.remove(0);
                    }
                    if (LogoCreateActivity.this.abc10011.size() < 1) {
                        LogoCreateActivity.this.abc10011.add(0);
                    }
                    LogoCreateActivity.this.abc10076 = true;
                }
                LogoCreateActivity logoCreateActivity40 = LogoCreateActivity.this;
                logoCreateActivity40.abc10066 -= 0.19914722f;
                String[] strArr10 = logoCreateActivity40.abc10031;
                if (strArr10 != null) {
                    strArr10[8] = "way";
                }
                if (logoCreateActivity40.abc10043 != null) {
                    int i8 = 0;
                    while (true) {
                        String[] strArr11 = LogoCreateActivity.this.abc10043;
                        if (i8 >= (strArr11.length > 3 ? 3 : strArr11.length)) {
                            break;
                        }
                        strArr11[i8] = "string" + i8;
                        i8++;
                    }
                }
            } else {
                LogoCreateActivity.this.binding.drawview.setCanvasBackgroundColor(Integer.valueOf(Color.parseColor((String) obj)));
                ArrayList<Integer> arrayList10 = LogoCreateActivity.this.abc1000;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                LogoCreateActivity logoCreateActivity41 = LogoCreateActivity.this;
                if (logoCreateActivity41.abc10028 < 0) {
                    logoCreateActivity41.abc10028 = 4;
                }
                logoCreateActivity41.abc1005 = 9;
                if (logoCreateActivity41.abc19 != null) {
                    int i9 = 0;
                    while (true) {
                        logoCreateActivity = LogoCreateActivity.this;
                        String[] strArr12 = logoCreateActivity.abc19;
                        if (i9 >= strArr12.length) {
                            break;
                        }
                        strArr12[i9] = "string" + i9;
                        LogoCreateActivity logoCreateActivity42 = LogoCreateActivity.this;
                        if (logoCreateActivity42.abc10067 == null) {
                            logoCreateActivity42.abc10067 = new ArrayList<>();
                        }
                        LogoCreateActivity logoCreateActivity43 = LogoCreateActivity.this;
                        String[] strArr13 = logoCreateActivity43.abc10015;
                        if (strArr13 != null) {
                            strArr13[2] = null;
                        }
                        int[] iArr9 = logoCreateActivity43.abc1002;
                        if (iArr9 != null) {
                            iArr9[4] = 5;
                        }
                        i9++;
                    }
                    if (logoCreateActivity.abc10026 < 0.46811604d) {
                        logoCreateActivity.abc10026 = 0.24268764f;
                    }
                    logoCreateActivity.abc10038 = ((double) logoCreateActivity.abc10038) > 0.7837416d ? 0.5495903f : 0.76749057f;
                    logoCreateActivity.abc10029 = false;
                }
                if (LogoCreateActivity.this.abc10067.size() < 7) {
                    LogoCreateActivity.this.abc10067.add("ze that th");
                }
                LogoCreateActivity logoCreateActivity44 = LogoCreateActivity.this;
                logoCreateActivity44.abc10049 = false;
                logoCreateActivity44.abc10033 = !logoCreateActivity44.abc10033;
                if (logoCreateActivity44.abc38 > 0.27907939943395754d) {
                    logoCreateActivity44.abc38 = 0.19512777791706404d;
                    logoCreateActivity44.abc10033 = true;
                    if (logoCreateActivity44.abc10071 != null) {
                        int i10 = 0;
                        while (true) {
                            String[] strArr14 = LogoCreateActivity.this.abc10071;
                            if (i10 >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                                break;
                            }
                            strArr14[i10] = "string" + i10;
                            i10++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity45 = LogoCreateActivity.this;
                    logoCreateActivity45.abc10028 = logoCreateActivity45.abc10028 < 0 ? 0 : 6;
                }
                LogoCreateActivity logoCreateActivity46 = LogoCreateActivity.this;
                logoCreateActivity46.abc1005 = 1;
                ArrayList<String> arrayList11 = logoCreateActivity46.abc10018;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
                LogoCreateActivity logoCreateActivity47 = LogoCreateActivity.this;
                if (logoCreateActivity47.abc10067 == null) {
                    logoCreateActivity47.abc10067 = new ArrayList<>();
                }
            }
            int i11 = 0;
            while (true) {
                logoCreateActivity4 = LogoCreateActivity.this;
                int i12 = logoCreateActivity4.abc10046;
                if (i12 > 3) {
                    i12 = 3;
                }
                if (i11 >= i12) {
                    break;
                }
                int[] iArr10 = logoCreateActivity4.abc10017;
                if (iArr10 != null) {
                    iArr10[5] = 8;
                }
                i11++;
            }
            logoCreateActivity4.abc10033 = true;
            logoCreateActivity4.abc10027 = 0.3636738f;
            logoCreateActivity4.abc10029 = !logoCreateActivity4.abc10029;
            String[] strArr15 = logoCreateActivity4.abc10015;
            if (strArr15 != null) {
                strArr15[2] = null;
            }
            logoCreateActivity4.abc10013 = 0.17372233f;
            logoCreateActivity4.abc10032 = !logoCreateActivity4.abc10032;
            if (logoCreateActivity4.abc10078 == null) {
                logoCreateActivity4.abc10078 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10050 != null) {
                int i13 = 0;
                while (true) {
                    int[] iArr11 = LogoCreateActivity.this.abc10050;
                    if (i13 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i13] = 3;
                    i13++;
                }
            }
            ArrayList<String> arrayList12 = LogoCreateActivity.this.abc21;
            if (arrayList12 != null && arrayList12.size() > 0) {
                LogoCreateActivity.this.abc21.remove(0);
                LogoCreateActivity logoCreateActivity48 = LogoCreateActivity.this;
                String[] strArr16 = logoCreateActivity48.abc10016;
                if (strArr16 != null) {
                    i2 = 4;
                    strArr16[4] = "ways de";
                } else {
                    i2 = 4;
                }
                if (logoCreateActivity48.abc10015 != null) {
                    int i14 = 0;
                    while (true) {
                        String[] strArr17 = LogoCreateActivity.this.abc10015;
                        if (i14 >= (strArr17.length > 3 ? 3 : strArr17.length)) {
                            break;
                        }
                        strArr17[i14] = "string" + i14;
                        i14++;
                    }
                }
                int i15 = 0;
                while (true) {
                    LogoCreateActivity logoCreateActivity49 = LogoCreateActivity.this;
                    int i16 = logoCreateActivity49.abc10052;
                    if (i16 > 3) {
                        i16 = 3;
                    }
                    if (i15 >= i16) {
                        break;
                    }
                    String[] strArr18 = logoCreateActivity49.abc10016;
                    if (strArr18 != null) {
                        strArr18[5] = CampaignClickDao.f17477a;
                    }
                    i15++;
                }
            } else {
                i2 = 4;
            }
            LogoCreateActivity logoCreateActivity50 = LogoCreateActivity.this;
            if (logoCreateActivity50.abc10010 == null) {
                logoCreateActivity50.abc10010 = new ArrayList<>();
            }
            ArrayList<String> arrayList13 = LogoCreateActivity.this.abc10067;
            if (arrayList13 != null && arrayList13.size() > 0) {
                LogoCreateActivity.this.abc10067.remove(0);
            }
            LogoCreateActivity logoCreateActivity51 = LogoCreateActivity.this;
            logoCreateActivity51.abc10033 = !logoCreateActivity51.abc10033;
            logoCreateActivity51.abc39 = 3;
            if (logoCreateActivity51.abc1001 != null) {
                int i17 = 0;
                while (true) {
                    String[] strArr19 = LogoCreateActivity.this.abc1001;
                    if (i17 >= (strArr19.length > 3 ? 3 : strArr19.length)) {
                        break;
                    }
                    strArr19[i17] = "string" + i17;
                    i17++;
                }
            }
            LogoCreateActivity logoCreateActivity52 = LogoCreateActivity.this;
            String[] strArr20 = logoCreateActivity52.abc10075;
            if (strArr20 != null) {
                strArr20[5] = null;
            }
            logoCreateActivity52.abc10040 = true;
            if (logoCreateActivity52.abc16 == null) {
                logoCreateActivity52.abc16 = new int[10];
                logoCreateActivity52.abc10049 = false;
                logoCreateActivity52.abc10076 = !logoCreateActivity52.abc10076;
                logoCreateActivity52.abc10072 = true;
            }
            logoCreateActivity52.abc10028 = logoCreateActivity52.abc10028 > 8 ? 6 : i2;
            logoCreateActivity52.abc1008 += 0;
            logoCreateActivity52.abc10029 = !logoCreateActivity52.abc10029;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$w0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9530w0 implements View.OnClickListener {
        public View$OnClickListenerC9530w0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            if (LogoCreateActivity.this.finderType == 1) {
                LogoCreateActivity.this.createVM.showBackgroundLayout();
                if (LogoCreateActivity.this.abc10050 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10050;
                        if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i] = 0;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                String[] strArr = logoCreateActivity3.abc10015;
                if (strArr != null) {
                    strArr[5] = " ";
                }
                if (!TextUtils.isEmpty(logoCreateActivity3.abc10059)) {
                    int length = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length;
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                if (logoCreateActivity4.abc6 == null) {
                    logoCreateActivity4.abc6 = new int[10];
                    if (logoCreateActivity4.abc10011 == null) {
                        logoCreateActivity4.abc10011 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
                    if (logoCreateActivity5.abc10066 > 0.7624979d) {
                        logoCreateActivity5.abc10066 = 0.043455422f;
                    }
                    logoCreateActivity5.abc10052 += 8;
                }
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc1005 = 3;
                if (logoCreateActivity6.abc10030.size() < 4) {
                    LogoCreateActivity.this.abc10030.add(6);
                }
                LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                if (logoCreateActivity7.abc10034 == null) {
                    logoCreateActivity7.abc10034 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
            if (logoCreateActivity8.abc10038 < 0.84361744d) {
                logoCreateActivity8.abc10038 = 0.80814934f;
            }
            if (logoCreateActivity8.abc10017 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = LogoCreateActivity.this.abc10017;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            logoCreateActivity9.abc10033 = !logoCreateActivity9.abc10033;
            logoCreateActivity9.abc4 = -logoCreateActivity9.abc4;
            String[] strArr2 = logoCreateActivity9.abc10015;
            if (strArr2 != null) {
                strArr2[2] = "dice";
            }
            logoCreateActivity9.abc10020 = ((double) logoCreateActivity9.abc10020) < 0.6640095d ? 0.09463155f : 0.8415221f;
            if (logoCreateActivity9.abc1002 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr3 = LogoCreateActivity.this.abc1002;
                    if (i3 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i3] = 9;
                    i3++;
                }
            }
            LogoCreateActivity.this.binding.drawview.m9084u();
            ArrayList<String> arrayList = LogoCreateActivity.this.abc1003;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            LogoCreateActivity.this.abc10035 = true;
            int i4 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i5 = logoCreateActivity.abc1008;
                if (i5 > 3) {
                    i5 = 3;
                }
                if (i4 >= i5) {
                    break;
                }
                int[] iArr4 = logoCreateActivity.abc10042;
                if (iArr4 != null) {
                    iArr4[0] = 0;
                }
                i4++;
            }
            logoCreateActivity.abc12 = ((double) logoCreateActivity.abc12) > 0.91138005d ? 0.36972708f : 0.59776884f;
            int[] iArr5 = logoCreateActivity.abc10042;
            if (iArr5 != null) {
                iArr5[1] = 9;
            }
            if (logoCreateActivity.abc10078 == null) {
                logoCreateActivity.abc10078 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc1002 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr6 = LogoCreateActivity.this.abc1002;
                    if (i6 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i6] = 4;
                    i6++;
                }
            }
            LogoCreateActivity.this.createVM.hideColorFinderLayout();
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            logoCreateActivity10.abc1004 = false;
            if (logoCreateActivity10.abc10017 == null) {
                logoCreateActivity10.abc10017 = new int[10];
            }
            if (logoCreateActivity10.abc10078 == null) {
                logoCreateActivity10.abc10078 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc15 != null) {
                int i7 = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    int[] iArr7 = logoCreateActivity2.abc15;
                    if (i7 >= iArr7.length) {
                        break;
                    }
                    iArr7[i7] = 4;
                    int[] iArr8 = logoCreateActivity2.abc10047;
                    if (iArr8 != null) {
                        iArr8[4] = 0;
                    }
                    logoCreateActivity2.abc10027 = Math.abs(logoCreateActivity2.abc10027);
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                        int length2 = LogoCreateActivity.this.abc10064.length();
                        LogoCreateActivity.this.abc10064 = LogoCreateActivity.this.abc10064 + length2;
                    }
                    i7++;
                }
                String[] strArr3 = logoCreateActivity2.abc10071;
                if (strArr3 != null) {
                    strArr3[2] = null;
                }
                logoCreateActivity2.abc10068 = logoCreateActivity2.abc10068 > 0.20088616896917166d ? 0.31794432182534993d : 0.882721493888945d;
                ArrayList<Integer> arrayList2 = logoCreateActivity2.abc10037;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10037.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            logoCreateActivity11.abc10026 = ((double) logoCreateActivity11.abc10026) > 0.34233415d ? 0.79348606f : 0.14156467f;
            String[] strArr4 = logoCreateActivity11.abc10075;
            if (strArr4 != null) {
                strArr4[0] = null;
            }
            ArrayList<Integer> arrayList3 = logoCreateActivity11.abc10055;
            if (arrayList3 != null || arrayList3.size() <= 0) {
                return;
            }
            LogoCreateActivity.this.abc10055.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$w1 */
    /* loaded from: classes3.dex */
    public class C9531w1 implements SeekBar.OnSeekBarChangeListener {
        public C9531w1() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.setOpacity(i);
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10023 == null) {
                logoCreateActivity2.abc10023 = new String[10];
            }
            logoCreateActivity2.abc10033 = !logoCreateActivity2.abc10033;
            ArrayList<String> arrayList = logoCreateActivity2.abc1003;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            if (LogoCreateActivity.this.abc33 != null) {
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    String[] strArr = logoCreateActivity.abc33;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10062)) {
                        int length = LogoCreateActivity.this.abc10062.length();
                        LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
                    }
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    logoCreateActivity3.abc1004 = !logoCreateActivity3.abc1004;
                    String[] strArr2 = logoCreateActivity3.abc10016;
                    if (strArr2 != null) {
                        strArr2[0] = " for ";
                    }
                    i2++;
                }
                int[] iArr = logoCreateActivity.abc10042;
                if (iArr != null) {
                    iArr[2] = 9;
                }
                if (logoCreateActivity.abc10015 == null) {
                    logoCreateActivity.abc10015 = new String[10];
                }
                logoCreateActivity.abc10065 = !logoCreateActivity.abc10065;
            }
            ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10036;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoCreateActivity.this.abc10036.remove(0);
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10013 = 0.3142181f;
            logoCreateActivity4.abc10040 = false;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            LogoCreateActivity.this.binding.drawview.m9092m();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            logoCreateActivity.abc10032 = true;
            logoCreateActivity.abc10038 = ((double) logoCreateActivity.abc10038) < 0.9935724d ? 0.15423119f : 0.36142552f;
            logoCreateActivity.abc10065 = true;
            ArrayList<String> arrayList = logoCreateActivity.abc21;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc21.remove(0);
                ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10024;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10024.remove(0);
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                String[] strArr = logoCreateActivity2.abc10015;
                if (strArr != null) {
                    strArr[2] = "l wa";
                }
                ArrayList<Integer> arrayList3 = logoCreateActivity2.abc10011;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc10011.remove(0);
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10054 = " b";
            if (!TextUtils.isEmpty(logoCreateActivity3.abc10069)) {
                int length = LogoCreateActivity.this.abc10069.length();
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc10069 = LogoCreateActivity.this.abc10069 + length;
            }
            if (TextUtils.isEmpty(LogoCreateActivity.this.abc10064)) {
                return;
            }
            int length2 = LogoCreateActivity.this.abc10064.length();
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10064 = LogoCreateActivity.this.abc10064 + length2;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            LogoCreateActivity.this.binding.drawview.m9118H();
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10024 == null) {
                logoCreateActivity.abc10024 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10016 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10016;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity2.abc10047;
            if (iArr != null) {
                iArr[4] = 4;
            }
            if (logoCreateActivity2.abc9.size() > 1) {
                LogoCreateActivity.this.abc9.add("ius:矩形时");
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                    int length = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length;
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                    int length2 = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length2;
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10042 == null) {
                    logoCreateActivity3.abc10042 = new int[10];
                }
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc10029 = false;
            if (logoCreateActivity4.abc10031 == null) {
                logoCreateActivity4.abc10031 = new String[10];
            }
            logoCreateActivity4.abc10058 = 0.22113701663959318d;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$x */
    /* loaded from: classes3.dex */
    public class C9532x implements Observer<List<Object>> {
        public C9532x() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<Object> list) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.logoRvTextColorAdapter.setData(list);
            if (LogoCreateActivity.this.abc10047 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoCreateActivity.this.abc10047;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 4;
                    i++;
                }
            }
            ArrayList<Integer> arrayList = LogoCreateActivity.this.abc10034;
            if (arrayList == null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10034.remove(0);
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            if (logoCreateActivity2.abc10038 < 0.91292816d) {
                logoCreateActivity2.abc10038 = 0.81711f;
            }
            if (logoCreateActivity2.abc22 != null) {
                int i2 = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr2 = logoCreateActivity.abc22;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    iArr2[i2] = 8;
                    if (logoCreateActivity.abc10017 != null) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr3 = LogoCreateActivity.this.abc10017;
                            if (i3 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                                break;
                            }
                            iArr3[i3] = 3;
                            i3++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                    if (logoCreateActivity3.abc10031 == null) {
                        logoCreateActivity3.abc10031 = new String[10];
                    }
                    logoCreateActivity3.abc10068 = logoCreateActivity3.abc10068 < 0.7787411287762797d ? 0.2578528549527275d : 0.007560044243759001d;
                    i2++;
                }
                if (logoCreateActivity.abc10039.size() < 4) {
                    LogoCreateActivity.this.abc10039.add("book writ");
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc10058 = 0.5149563234218097d;
                logoCreateActivity4.abc10032 = true;
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10013 -= 0.03300339f;
            logoCreateActivity5.abc10046 = 4;
            logoCreateActivity5.abc10028 = 3;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$x0 */
    /* loaded from: classes3.dex */
    public class C9533x0 implements LogoDrawView.InterfaceC9666e {
        public C9533x0() {
        }

        @Override // com.logomaster.logomaker.view.LogoDrawView.InterfaceC9666e
        /* renamed from: a */
        public void mo9075a(int i, LogoBaseSaveEntity logoBaseSaveEntity) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            LogoCreateActivity logoCreateActivity5;
            int i2 = 0;
            if (LogoCreateActivity.this.lastCurrentPositon != i) {
                LogoCreateActivity.this.lastCurrentPositon = i;
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10063 = -logoCreateActivity6.abc10063;
                logoCreateActivity6.abc10065 = !logoCreateActivity6.abc10065;
                if (logoCreateActivity6.abc10019 > 0) {
                    logoCreateActivity6.abc10019 = 0;
                }
                if (i != -1) {
                    logoCreateActivity6.hideFirstMenu();
                    LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
                    int[] iArr = logoCreateActivity7.abc1002;
                    if (iArr != null) {
                        iArr[3] = 0;
                    }
                    if (logoCreateActivity7.abc10078.size() < 3) {
                        LogoCreateActivity.this.abc10078.add(7);
                    }
                    LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                    logoCreateActivity8.abc1005 = -logoCreateActivity8.abc1005;
                    if (logoBaseSaveEntity instanceof LogoImageSaveEntity) {
                        logoCreateActivity8.createVM.hideTextLayout();
                        LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                        int[] iArr2 = logoCreateActivity9.abc10047;
                        if (iArr2 != null) {
                            iArr2[4] = 0;
                        }
                        if (logoCreateActivity9.abc1002 == null) {
                            logoCreateActivity9.abc1002 = new int[10];
                        }
                        logoCreateActivity9.abc10026 = 0.5850199f;
                        if (logoCreateActivity9.abc36 != null) {
                            int i3 = 0;
                            while (true) {
                                logoCreateActivity5 = LogoCreateActivity.this;
                                String[] strArr = logoCreateActivity5.abc36;
                                if (i3 >= strArr.length) {
                                    break;
                                }
                                strArr[i3] = "string" + i3;
                                LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                                if (logoCreateActivity10.abc10011 == null) {
                                    logoCreateActivity10.abc10011 = new ArrayList<>();
                                }
                                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                                logoCreateActivity11.abc10076 = true;
                                if (logoCreateActivity11.abc10010.size() > 3) {
                                    LogoCreateActivity.this.abc10010.add(1);
                                }
                                i3++;
                            }
                            if (logoCreateActivity5.abc10030.size() < 0) {
                                LogoCreateActivity.this.abc10030.add(4);
                            }
                            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                            String[] strArr2 = logoCreateActivity12.abc10071;
                            if (strArr2 != null) {
                                strArr2[2] = "ook deca";
                            }
                            if (logoCreateActivity12.abc1003 == null) {
                                logoCreateActivity12.abc1003 = new ArrayList<>();
                            }
                        }
                        if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                            int length = LogoCreateActivity.this.abc10054.length();
                            LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length;
                        }
                        LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                        if (logoCreateActivity13.abc10010 == null) {
                            logoCreateActivity13.abc10010 = new ArrayList<>();
                        }
                        int i4 = 0;
                        while (true) {
                            logoCreateActivity3 = LogoCreateActivity.this;
                            int i5 = logoCreateActivity3.abc1008;
                            if (i5 > 3) {
                                i5 = 3;
                            }
                            if (i4 >= i5) {
                                break;
                            }
                            logoCreateActivity3.abc10068 += 0.36140810739253204d;
                            i4++;
                        }
                        logoCreateActivity3.createVM.showImageLayout();
                        LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                        String[] strArr3 = logoCreateActivity14.abc10060;
                        if (strArr3 != null) {
                            strArr3[0] = null;
                        }
                        int[] iArr3 = logoCreateActivity14.abc10045;
                        if (iArr3 != null) {
                            iArr3[6] = 0;
                        }
                        if (!TextUtils.isEmpty(logoCreateActivity14.abc10054)) {
                            int length2 = LogoCreateActivity.this.abc10054.length();
                            LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length2;
                        }
                        LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                        logoCreateActivity15.abc27 -= 0.3912603414045037d;
                        String[] strArr4 = logoCreateActivity15.abc10057;
                        if (strArr4 != null) {
                            strArr4[1] = null;
                        }
                        if (logoCreateActivity15.abc10024.size() > 9) {
                            LogoCreateActivity.this.abc10024.add("ication (i");
                        }
                        LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                        int[] iArr4 = logoCreateActivity16.abc1002;
                        if (iArr4 != null) {
                            iArr4[7] = 0;
                        }
                        LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) logoBaseSaveEntity;
                        logoCreateActivity16.abc10038 = 0.07967746f;
                        int[] iArr5 = logoCreateActivity16.abc10041;
                        if (iArr5 != null) {
                            iArr5[0] = 0;
                        }
                        if (!TextUtils.isEmpty(logoCreateActivity16.abc10062)) {
                            int length3 = LogoCreateActivity.this.abc10062.length();
                            LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length3;
                        }
                        ArrayList<String> arrayList = LogoCreateActivity.this.abc8;
                        if (arrayList != null && arrayList.size() > 0) {
                            LogoCreateActivity.this.abc8.remove(0);
                            LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                            if (logoCreateActivity17.abc10048 == null) {
                                logoCreateActivity17.abc10048 = new ArrayList<>();
                            }
                            LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                            String[] strArr5 = logoCreateActivity18.abc10016;
                            if (strArr5 != null) {
                                strArr5[1] = null;
                            }
                            ArrayList<Integer> arrayList2 = logoCreateActivity18.abc10056;
                            if (arrayList2 == null && arrayList2.size() > 0) {
                                LogoCreateActivity.this.abc10056.remove(0);
                            }
                        }
                        LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                        if (logoCreateActivity19.abc10015 == null) {
                            logoCreateActivity19.abc10015 = new String[10];
                        }
                        logoCreateActivity19.abc10068 = 0.457446482318444d;
                        if (logoCreateActivity19.abc10010.size() < 7) {
                            LogoCreateActivity.this.abc10010.add(6);
                        }
                        LogoCreateActivity.this.binding.includeImage.sbOpacity.setProgress(logoImageSaveEntity.m31s());
                        LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
                        int[] iArr6 = logoCreateActivity20.abc10042;
                        if (iArr6 != null) {
                            iArr6[3] = 0;
                        }
                        if (logoCreateActivity20.abc10045 != null) {
                            int i6 = 0;
                            while (true) {
                                int[] iArr7 = LogoCreateActivity.this.abc10045;
                                if (i6 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                                    break;
                                }
                                iArr7[i6] = 8;
                                i6++;
                            }
                        }
                        LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
                        if (logoCreateActivity21.abc10028 < 0) {
                            logoCreateActivity21.abc10028 = 5;
                        }
                        if (logoCreateActivity21.abc21 == null) {
                            logoCreateActivity21.abc21 = new ArrayList<>();
                            int i7 = 0;
                            while (true) {
                                logoCreateActivity4 = LogoCreateActivity.this;
                                int i8 = logoCreateActivity4.abc1008;
                                if (i8 > 3) {
                                    i8 = 3;
                                }
                                if (i7 >= i8) {
                                    break;
                                }
                                int[] iArr8 = logoCreateActivity4.abc10041;
                                if (iArr8 != null) {
                                    iArr8[8] = 0;
                                }
                                i7++;
                            }
                            if (logoCreateActivity4.abc10066 < 0.88283026d) {
                                logoCreateActivity4.abc10066 = 0.84725213f;
                            }
                            ArrayList<String> arrayList3 = logoCreateActivity4.abc10024;
                            if (arrayList3 != null && arrayList3.size() > 0) {
                                LogoCreateActivity.this.abc10024.remove(0);
                            }
                        }
                        LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                        logoCreateActivity22.abc1004 = !logoCreateActivity22.abc1004;
                        String[] strArr6 = logoCreateActivity22.abc10075;
                        if (strArr6 != null) {
                            strArr6[4] = null;
                        }
                        logoCreateActivity22.abc10035 = false;
                    } else {
                        logoCreateActivity8.dealTextStyle();
                        LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
                        String[] strArr7 = logoCreateActivity23.abc10073;
                        if (strArr7 != null) {
                            strArr7[3] = "t re";
                        }
                        if (!TextUtils.isEmpty(logoCreateActivity23.abc10059)) {
                            int length4 = LogoCreateActivity.this.abc10059.length();
                            LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length4;
                        }
                        LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
                        if (logoCreateActivity24.abc10061 == null) {
                            logoCreateActivity24.abc10061 = new int[10];
                        }
                        logoCreateActivity24.abc10 = false;
                        logoCreateActivity24.abc10033 = !logoCreateActivity24.abc10033;
                        logoCreateActivity24.abc10058 *= 0.8898944773716074d;
                        if (logoCreateActivity24.abc10055 == null) {
                            logoCreateActivity24.abc10055 = new ArrayList<>();
                        }
                        LogoCreateActivity.this.createVM.hideImageLayout();
                        if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                            int length5 = LogoCreateActivity.this.abc10069.length();
                            LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length5;
                        }
                        LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
                        logoCreateActivity25.abc10035 = !logoCreateActivity25.abc10035;
                        if (logoCreateActivity25.abc10075 == null) {
                            logoCreateActivity25.abc10075 = new String[10];
                        }
                        if (logoCreateActivity25.abc15 != null) {
                            int i9 = 0;
                            while (true) {
                                logoCreateActivity = LogoCreateActivity.this;
                                int[] iArr9 = logoCreateActivity.abc15;
                                if (i9 >= iArr9.length) {
                                    break;
                                }
                                iArr9[i9] = 6;
                                logoCreateActivity.abc10068 *= 0.14006216440114783d;
                                ArrayList<String> arrayList4 = logoCreateActivity.abc10067;
                                if (arrayList4 != null && arrayList4.size() > 0) {
                                    LogoCreateActivity.this.abc10067.remove(0);
                                }
                                if (LogoCreateActivity.this.abc1003.size() < 2) {
                                    LogoCreateActivity.this.abc1003.add(" publ");
                                }
                                i9++;
                            }
                            if (logoCreateActivity.abc10034.size() > 3) {
                                LogoCreateActivity.this.abc10034.add(1);
                            }
                            if (LogoCreateActivity.this.abc10014.size() < 2) {
                                LogoCreateActivity.this.abc10014.add(2);
                            }
                            String[] strArr8 = LogoCreateActivity.this.abc10071;
                            if (strArr8 != null) {
                                strArr8[8] = null;
                            }
                        }
                        if (LogoCreateActivity.this.abc10071 != null) {
                            int i10 = 0;
                            while (true) {
                                String[] strArr9 = LogoCreateActivity.this.abc10071;
                                if (i10 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                                    break;
                                }
                                strArr9[i10] = "string" + i10;
                                i10++;
                            }
                        }
                        LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
                        logoCreateActivity26.abc10054 = " u";
                        logoCreateActivity26.abc10065 = false;
                        logoCreateActivity26.createVM.showTextLayout();
                        LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
                        if (logoCreateActivity27.abc10050 == null) {
                            logoCreateActivity27.abc10050 = new int[10];
                        }
                        logoCreateActivity27.abc10020 -= 0.80515295f;
                        String[] strArr10 = logoCreateActivity27.abc10023;
                        if (strArr10 != null) {
                            strArr10[9] = null;
                        }
                        String[] strArr11 = logoCreateActivity27.abc36;
                        if (strArr11 != null) {
                            strArr11[9] = "own_sampl";
                            logoCreateActivity27.abc10065 = false;
                            if (logoCreateActivity27.abc10036.size() > 4) {
                                LogoCreateActivity.this.abc10036.add("r");
                            }
                            int[] iArr10 = LogoCreateActivity.this.abc10042;
                            if (iArr10 != null) {
                                iArr10[4] = 7;
                            }
                        }
                        ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10034;
                        if (arrayList5 == null && arrayList5.size() > 0) {
                            LogoCreateActivity.this.abc10034.remove(0);
                        }
                        LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
                        int[] iArr11 = logoCreateActivity28.abc10041;
                        if (iArr11 != null) {
                            iArr11[1] = 0;
                        }
                        if (logoCreateActivity28.abc10039.size() < 5) {
                            LogoCreateActivity.this.abc10039.add("ment i");
                        }
                    }
                    if (LogoCreateActivity.this.abc10071 != null) {
                        int i11 = 0;
                        while (true) {
                            String[] strArr12 = LogoCreateActivity.this.abc10071;
                            if (i11 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                                break;
                            }
                            strArr12[i11] = "string" + i11;
                            i11++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
                    logoCreateActivity29.abc10035 = !logoCreateActivity29.abc10035;
                    logoCreateActivity29.abc10038 *= 0.99507684f;
                    int[] iArr12 = logoCreateActivity29.abc15;
                    if (iArr12 != null) {
                        iArr12[6] = 1;
                        if (logoCreateActivity29.abc10017 != null) {
                            int i12 = 0;
                            while (true) {
                                int[] iArr13 = LogoCreateActivity.this.abc10017;
                                if (i12 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                                    break;
                                }
                                iArr13[i12] = 8;
                                i12++;
                            }
                        }
                        LogoCreateActivity logoCreateActivity30 = LogoCreateActivity.this;
                        logoCreateActivity30.abc10051 *= 0.8044742371843283d;
                        logoCreateActivity30.abc10040 = true;
                    }
                    int i13 = 0;
                    while (true) {
                        logoCreateActivity2 = LogoCreateActivity.this;
                        int i14 = logoCreateActivity2.abc10052;
                        if (i14 > 3) {
                            i14 = 3;
                        }
                        if (i13 >= i14) {
                            break;
                        }
                        logoCreateActivity2.abc10033 = true;
                        i13++;
                    }
                    logoCreateActivity2.abc1004 = false;
                    logoCreateActivity2.abc10032 = false;
                } else {
                    logoCreateActivity6.showFirstMenu();
                    ArrayList<String> arrayList6 = LogoCreateActivity.this.abc10024;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        LogoCreateActivity.this.abc10024.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity31 = LogoCreateActivity.this;
                    logoCreateActivity31.abc10033 = !logoCreateActivity31.abc10033;
                    logoCreateActivity31.abc1008 = Math.abs(logoCreateActivity31.abc1008);
                    LogoCreateActivity.this.createVM.hideColorFinderLayout();
                    LogoCreateActivity logoCreateActivity32 = LogoCreateActivity.this;
                    if (logoCreateActivity32.abc1003 == null) {
                        logoCreateActivity32.abc1003 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity33 = LogoCreateActivity.this;
                    logoCreateActivity33.abc10029 = true;
                    logoCreateActivity33.abc10019 = 6;
                    logoCreateActivity33.createVM.hideColorRainbowLayout();
                    if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10012)) {
                        int length6 = LogoCreateActivity.this.abc10012.length();
                        LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length6;
                    }
                    LogoCreateActivity logoCreateActivity34 = LogoCreateActivity.this;
                    int[] iArr14 = logoCreateActivity34.abc10041;
                    if (iArr14 != null) {
                        iArr14[8] = 0;
                    }
                    if (logoCreateActivity34.abc10045 == null) {
                        logoCreateActivity34.abc10045 = new int[10];
                    }
                    logoCreateActivity34.createVM.hideImageLayout();
                    LogoCreateActivity logoCreateActivity35 = LogoCreateActivity.this;
                    if (logoCreateActivity35.abc1003 == null) {
                        logoCreateActivity35.abc1003 = new ArrayList<>();
                    }
                    ArrayList<Integer> arrayList7 = LogoCreateActivity.this.abc10034;
                    if (arrayList7 == null && arrayList7.size() > 0) {
                        LogoCreateActivity.this.abc10034.remove(0);
                    }
                    LogoCreateActivity logoCreateActivity36 = LogoCreateActivity.this;
                    logoCreateActivity36.abc10035 = !logoCreateActivity36.abc10035;
                    if (logoCreateActivity36.abc11 == null) {
                        logoCreateActivity36.abc11 = new ArrayList<>();
                        LogoCreateActivity logoCreateActivity37 = LogoCreateActivity.this;
                        if (logoCreateActivity37.abc1000 == null) {
                            logoCreateActivity37.abc1000 = new ArrayList<>();
                        }
                        LogoCreateActivity logoCreateActivity38 = LogoCreateActivity.this;
                        if (logoCreateActivity38.abc1007 > 0.5271782d) {
                            logoCreateActivity38.abc1007 = 0.19438285f;
                        }
                        if (logoCreateActivity38.abc10031 != null) {
                            int i15 = 0;
                            while (true) {
                                String[] strArr13 = LogoCreateActivity.this.abc10031;
                                if (i15 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                                    break;
                                }
                                strArr13[i15] = "string" + i15;
                                i15++;
                            }
                        }
                    }
                    LogoCreateActivity logoCreateActivity39 = LogoCreateActivity.this;
                    String[] strArr14 = logoCreateActivity39.abc10057;
                    if (strArr14 != null) {
                        strArr14[9] = "e i";
                    }
                    if (logoCreateActivity39.abc10074 == null) {
                        logoCreateActivity39.abc10074 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity40 = LogoCreateActivity.this;
                    String[] strArr15 = logoCreateActivity40.abc10031;
                    if (strArr15 != null) {
                        strArr15[2] = "rid";
                    }
                    logoCreateActivity40.createVM.hideTextLayout();
                    LogoCreateActivity logoCreateActivity41 = LogoCreateActivity.this;
                    if (logoCreateActivity41.abc10014 == null) {
                        logoCreateActivity41.abc10014 = new ArrayList<>();
                    }
                    LogoCreateActivity logoCreateActivity42 = LogoCreateActivity.this;
                    logoCreateActivity42.abc10038 = ((double) logoCreateActivity42.abc10038) > 0.077794194d ? 0.37314528f : 0.45741957f;
                    ArrayList<Integer> arrayList8 = logoCreateActivity42.abc10034;
                    if (arrayList8 == null && arrayList8.size() > 0) {
                        LogoCreateActivity.this.abc10034.remove(0);
                    }
                    ArrayList<String> arrayList9 = LogoCreateActivity.this.abc9;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        LogoCreateActivity.this.abc9.remove(0);
                        LogoCreateActivity logoCreateActivity43 = LogoCreateActivity.this;
                        logoCreateActivity43.abc10028 = logoCreateActivity43.abc10028 <= 6 ? 3 : 4;
                        int[] iArr15 = logoCreateActivity43.abc10061;
                        if (iArr15 != null) {
                            iArr15[6] = 7;
                        }
                        if (logoCreateActivity43.abc10010.size() < 3) {
                            LogoCreateActivity.this.abc10010.add(0);
                        }
                    }
                    LogoCreateActivity logoCreateActivity44 = LogoCreateActivity.this;
                    logoCreateActivity44.abc10069 = "to '";
                    logoCreateActivity44.abc10052 = 3;
                    logoCreateActivity44.abc1005 = Math.abs(logoCreateActivity44.abc1005);
                }
                ArrayList<Integer> arrayList10 = LogoCreateActivity.this.abc10056;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    LogoCreateActivity.this.abc10056.remove(0);
                }
                LogoCreateActivity logoCreateActivity45 = LogoCreateActivity.this;
                String[] strArr16 = logoCreateActivity45.abc10071;
                if (strArr16 != null) {
                    strArr16[6] = null;
                }
                if (logoCreateActivity45.abc10027 > 0.6355997d) {
                    logoCreateActivity45.abc10027 = 0.24803472f;
                }
            }
            if (LogoCreateActivity.this.abc10048.size() < 2) {
                LogoCreateActivity.this.abc10048.add(" year wh");
            }
            LogoCreateActivity logoCreateActivity46 = LogoCreateActivity.this;
            logoCreateActivity46.abc10035 = true;
            logoCreateActivity46.abc10076 = true;
            if (logoCreateActivity46.abc2.size() < 6) {
                LogoCreateActivity.this.abc2.add(0);
                LogoCreateActivity logoCreateActivity47 = LogoCreateActivity.this;
                if (logoCreateActivity47.abc10070 == null) {
                    logoCreateActivity47.abc10070 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity48 = LogoCreateActivity.this;
                String[] strArr17 = logoCreateActivity48.abc10031;
                if (strArr17 != null) {
                    strArr17[0] = " th";
                }
                if (logoCreateActivity48.abc10022 != null) {
                    while (true) {
                        String[] strArr18 = LogoCreateActivity.this.abc10022;
                        if (i2 >= (strArr18.length > 3 ? 3 : strArr18.length)) {
                            break;
                        }
                        strArr18[i2] = "string" + i2;
                        i2++;
                    }
                }
            }
            LogoCreateActivity logoCreateActivity49 = LogoCreateActivity.this;
            logoCreateActivity49.abc10038 = 0.060934782f;
            if (logoCreateActivity49.abc10021 == null) {
                logoCreateActivity49.abc10021 = new String[10];
            }
            logoCreateActivity49.abc10066 *= 0.74366724f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$x1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9534x1 implements View.OnClickListener {
        public View$OnClickListenerC9534x1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            if (LogoCreateActivity.this.binding.drawview.m9086s()) {
                LogoCreateActivity.this.closeAll();
                if (LogoCreateActivity.this.abc10022 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoCreateActivity.this.abc10022;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                if (logoCreateActivity2.abc10014 == null) {
                    logoCreateActivity2.abc10014 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList = LogoCreateActivity.this.abc1000;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc1000.remove(0);
                }
                LogoCreateActivity.this.binding.drawview.m9100e();
                if (LogoCreateActivity.this.abc10022 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr2 = LogoCreateActivity.this.abc10022;
                        if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i2] = "string" + i2;
                        i2++;
                    }
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                String[] strArr3 = logoCreateActivity3.abc10015;
                if (strArr3 != null) {
                    strArr3[1] = null;
                }
                int[] iArr = logoCreateActivity3.abc10042;
                if (iArr != null) {
                    iArr[1] = 6;
                }
            }
            int i3 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i4 = logoCreateActivity.abc1005;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                if (logoCreateActivity.abc10037 == null) {
                    logoCreateActivity.abc10037 = new ArrayList<>();
                }
                i3++;
            }
            String[] strArr4 = logoCreateActivity.abc1001;
            if (strArr4 != null) {
                strArr4[1] = null;
            }
            if (logoCreateActivity.abc10056 == null) {
                logoCreateActivity.abc10056 = new ArrayList<>();
            }
            LogoCreateActivity.this.createVM.hideLayerList();
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            logoCreateActivity4.abc1005 *= 5;
            if (logoCreateActivity4.abc10043 == null) {
                logoCreateActivity4.abc10043 = new String[10];
            }
            if (logoCreateActivity4.abc10038 > 0.21300912d) {
                logoCreateActivity4.abc10038 = 0.42112327f;
            }
            logoCreateActivity4.abc12 = Math.abs(logoCreateActivity4.abc12);
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            logoCreateActivity5.abc10027 = 0.08612639f;
            if (!TextUtils.isEmpty(logoCreateActivity5.abc10069)) {
                int length = LogoCreateActivity.this.abc10069.length();
                LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length;
            }
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            int[] iArr2 = logoCreateActivity6.abc10047;
            if (iArr2 != null) {
                iArr2[3] = 0;
            }
            logoCreateActivity6.abc4 += 0.10111129f;
            if (logoCreateActivity6.abc10010 == null) {
                logoCreateActivity6.abc10010 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            String[] strArr5 = logoCreateActivity7.abc1001;
            if (strArr5 != null) {
                strArr5[9] = " Melville";
            }
            logoCreateActivity7.abc10052 = 8;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$y */
    /* loaded from: classes3.dex */
    public class C9535y implements LogoRvFillingAdapter.InterfaceC9613b {
        public C9535y() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvFillingAdapter.InterfaceC9613b
        /* renamed from: a */
        public void mo9189a(int i, Object obj) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            LogoCreateActivity logoCreateActivity5;
            LogoCreateActivity.this.binding.drawview.m9092m();
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            if (logoCreateActivity6.abc1003 == null) {
                logoCreateActivity6.abc1003 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            int i2 = 0;
            logoCreateActivity7.abc10049 = false;
            logoCreateActivity7.abc10076 = !logoCreateActivity7.abc10076;
            String[] strArr = logoCreateActivity7.abc31;
            if (strArr != null) {
                strArr[1] = null;
                if (!TextUtils.isEmpty(logoCreateActivity7.abc10069)) {
                    int length = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length;
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                logoCreateActivity8.abc1005 = logoCreateActivity8.abc1005 < 7 ? 9 : 8;
                logoCreateActivity8.abc10051 *= 0.9244556604515822d;
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            if (logoCreateActivity9.abc10041 == null) {
                logoCreateActivity9.abc10041 = new int[10];
            }
            if (logoCreateActivity9.abc10070.size() < 7) {
                LogoCreateActivity.this.abc10070.add(DownloadCommon.DOWNLOAD_REPORT_REASON);
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            if (logoCreateActivity10.abc1003 == null) {
                logoCreateActivity10.abc1003 = new ArrayList<>();
            }
            LogoCreateActivity.this.binding.drawview.setTextColor(Integer.valueOf(Color.parseColor((String) obj)));
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            if (logoCreateActivity11.abc10058 < 0.17241153257965725d) {
                logoCreateActivity11.abc10058 = 0.06764704844476577d;
            }
            logoCreateActivity11.abc10072 = true;
            int i3 = 0;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i4 = logoCreateActivity.abc10028;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                if (logoCreateActivity.abc10014 == null) {
                    logoCreateActivity.abc10014 = new ArrayList<>();
                }
                i3++;
            }
            if (!TextUtils.isEmpty(logoCreateActivity.abc29)) {
                int length2 = LogoCreateActivity.this.abc29.length();
                int i5 = 0;
                while (true) {
                    logoCreateActivity5 = LogoCreateActivity.this;
                    int i6 = logoCreateActivity5.abc10046;
                    if (i6 > 3) {
                        i6 = 3;
                    }
                    if (i5 >= i6) {
                        break;
                    }
                    if (logoCreateActivity5.abc1003 == null) {
                        logoCreateActivity5.abc1003 = new ArrayList<>();
                    }
                    i5++;
                }
                ArrayList<String> arrayList = logoCreateActivity5.abc10018;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10059)) {
                    int length3 = LogoCreateActivity.this.abc10059.length();
                    LogoCreateActivity.this.abc10059 = LogoCreateActivity.this.abc10059 + length3;
                }
                LogoCreateActivity.this.abc29 = LogoCreateActivity.this.abc29 + length2;
                if (LogoCreateActivity.this.abc10010.size() < 8) {
                    LogoCreateActivity.this.abc10010.add(1);
                }
                if (LogoCreateActivity.this.abc10078.size() > 0) {
                    LogoCreateActivity.this.abc10078.add(0);
                }
                LogoCreateActivity.this.abc10029 = true;
            }
            if (LogoCreateActivity.this.abc10067.size() < 5) {
                LogoCreateActivity.this.abc10067.add(" ");
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            if (logoCreateActivity12.abc10030 == null) {
                logoCreateActivity12.abc10030 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc10057 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10057;
                    if (i7 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i7] = "string" + i7;
                    i7++;
                }
            }
            LogoCreateActivity.this.binding.drawview.m9118H();
            LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
            logoCreateActivity13.abc10032 = true;
            logoCreateActivity13.abc1007 = 0.7187993f;
            if (logoCreateActivity13.abc10011.size() > 8) {
                LogoCreateActivity.this.abc10011.add(6);
            }
            LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
            String[] strArr3 = logoCreateActivity14.abc36;
            if (strArr3 != null) {
                strArr3[7] = "_sun";
                logoCreateActivity14.abc10046 *= 4;
                if (!TextUtils.isEmpty(logoCreateActivity14.abc10054)) {
                    int length4 = LogoCreateActivity.this.abc10054.length();
                    LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length4;
                }
                LogoCreateActivity.this.abc10038 -= 0.038743317f;
            }
            String[] strArr4 = LogoCreateActivity.this.abc10015;
            if (strArr4 != null) {
                strArr4[8] = null;
            }
            int i8 = 0;
            while (true) {
                logoCreateActivity2 = LogoCreateActivity.this;
                int i9 = logoCreateActivity2.abc10052;
                if (i9 > 3) {
                    i9 = 3;
                }
                if (i8 >= i9) {
                    break;
                }
                logoCreateActivity2.abc10065 = !logoCreateActivity2.abc10065;
                i8++;
            }
            if (logoCreateActivity2.abc10026 < 0.55624306d) {
                logoCreateActivity2.abc10026 = 0.31091172f;
            }
            if (logoCreateActivity2.abc10036.size() < 8) {
                LogoCreateActivity.this.abc10036.add("r w");
            }
            if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10054)) {
                int length5 = LogoCreateActivity.this.abc10054.length();
                LogoCreateActivity.this.abc10054 = LogoCreateActivity.this.abc10054 + length5;
            }
            LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
            logoCreateActivity15.abc10029 = !logoCreateActivity15.abc10029;
            logoCreateActivity15.abc24 = 0.475999297193065d;
            int i10 = 0;
            while (true) {
                logoCreateActivity3 = LogoCreateActivity.this;
                int i11 = logoCreateActivity3.abc10046;
                if (i11 > 3) {
                    i11 = 3;
                }
                if (i10 >= i11) {
                    break;
                }
                logoCreateActivity3.abc1007 = 0.29318386f;
                i10++;
            }
            if (logoCreateActivity3.abc10021 != null) {
                while (true) {
                    String[] strArr5 = LogoCreateActivity.this.abc10021;
                    if (i2 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity.this.abc10049 = !logoCreateActivity4.abc10049;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$y0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9536y0 implements View.OnClickListener {
        public View$OnClickListenerC9536y0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity.this.binding.drawview.m9122D(0.0f, -5.0f);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            if (logoCreateActivity.abc10077 == null) {
                logoCreateActivity.abc10077 = new String[10];
            }
            String[] strArr = logoCreateActivity.abc10031;
            if (strArr != null) {
                strArr[1] = null;
            }
            logoCreateActivity.abc10063 = 0.0137164f;
            if (logoCreateActivity.abc8 == null) {
                logoCreateActivity.abc8 = new ArrayList<>();
                LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
                logoCreateActivity2.abc10076 = !logoCreateActivity2.abc10076;
                if (logoCreateActivity2.abc10015 == null) {
                    logoCreateActivity2.abc10015 = new String[10];
                }
                if (logoCreateActivity2.abc10031 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr2 = LogoCreateActivity.this.abc10031;
                        if (i >= (strArr2.length <= 3 ? strArr2.length : 3)) {
                            break;
                        }
                        strArr2[i] = "string" + i;
                        i++;
                    }
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            if (logoCreateActivity3.abc10010 == null) {
                logoCreateActivity3.abc10010 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
            if (logoCreateActivity4.abc1001 == null) {
                logoCreateActivity4.abc1001 = new String[10];
            }
            logoCreateActivity4.abc10049 = false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$y1 */
    /* loaded from: classes3.dex */
    public class C9537y1 implements Observer<List<LogoBaseSaveEntity>> {
        public C9537y1() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<LogoBaseSaveEntity> list) {
            LogoCreateActivity.this.logoRvLayerAdapter.setData(list);
            LogoCreateActivity logoCreateActivity = LogoCreateActivity.this;
            String[] strArr = logoCreateActivity.abc10060;
            int i = 0;
            if (strArr != null) {
                strArr[0] = null;
            }
            if (logoCreateActivity.abc10056.size() > 5) {
                LogoCreateActivity.this.abc10056.add(4);
            }
            if (LogoCreateActivity.this.abc10073 != null) {
                while (true) {
                    String[] strArr2 = LogoCreateActivity.this.abc10073;
                    if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    i++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            int[] iArr = logoCreateActivity2.abc6;
            if (iArr != null) {
                iArr[8] = 3;
                logoCreateActivity2.abc1008 = 4;
                int[] iArr2 = logoCreateActivity2.abc1002;
                if (iArr2 != null) {
                    iArr2[2] = 2;
                }
                if (logoCreateActivity2.abc1000.size() < 6) {
                    LogoCreateActivity.this.abc1000.add(4);
                }
            }
            LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
            logoCreateActivity3.abc10026 = -logoCreateActivity3.abc10026;
            logoCreateActivity3.abc10069 = "erary Ros";
            logoCreateActivity3.abc10025 = -logoCreateActivity3.abc10025;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$z */
    /* loaded from: classes3.dex */
    public class C9538z implements Observer<List<String>> {
        public C9538z() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<String> list) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            LogoCreateActivity logoCreateActivity3;
            LogoCreateActivity logoCreateActivity4;
            ArrayList arrayList = new ArrayList();
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            int i = 10;
            if (logoCreateActivity5.abc10060 == null) {
                logoCreateActivity5.abc10060 = new String[10];
            }
            String[] strArr = logoCreateActivity5.abc10031;
            int i2 = 3;
            if (strArr != null) {
                strArr[3] = "ty is sur";
            }
            logoCreateActivity5.abc10029 = !logoCreateActivity5.abc10029;
            char c = 5;
            int i3 = 0;
            if (logoCreateActivity5.abc37.size() > 5) {
                LogoCreateActivity.this.abc37.add("赞 60");
                LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
                logoCreateActivity6.abc10033 = false;
                if (logoCreateActivity6.abc10071 == null) {
                    logoCreateActivity6.abc10071 = new String[10];
                }
                if (logoCreateActivity6.abc10042 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr = LogoCreateActivity.this.abc10042;
                        if (i4 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i4] = 5;
                        i4++;
                    }
                }
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10026 = ((double) logoCreateActivity7.abc10026) > 0.3363381d ? 0.24397612f : 0.34864163f;
            if (logoCreateActivity7.abc10043 == null) {
                logoCreateActivity7.abc10043 = new String[10];
            }
            logoCreateActivity7.abc10032 = true;
            int size = list.size();
            LogoCreateActivity.this.abc10072 = !logoCreateActivity.abc10072;
            int i5 = 0;
            while (true) {
                logoCreateActivity2 = LogoCreateActivity.this;
                int i6 = logoCreateActivity2.abc1005;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                int[] iArr2 = logoCreateActivity2.abc10017;
                if (iArr2 != null) {
                    iArr2[0] = 6;
                }
                i5++;
            }
            if (logoCreateActivity2.abc10039 == null) {
                logoCreateActivity2.abc10039 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc1 != null) {
                int i7 = 0;
                while (true) {
                    logoCreateActivity4 = LogoCreateActivity.this;
                    int[] iArr3 = logoCreateActivity4.abc1;
                    if (i7 >= iArr3.length) {
                        break;
                    }
                    iArr3[i7] = 5;
                    int[] iArr4 = logoCreateActivity4.abc10045;
                    if (iArr4 != null) {
                        iArr4[6] = 0;
                    }
                    if (!TextUtils.isEmpty(logoCreateActivity4.abc10062)) {
                        int length = LogoCreateActivity.this.abc10062.length();
                        LogoCreateActivity.this.abc10062 = LogoCreateActivity.this.abc10062 + length;
                    }
                    int i8 = 0;
                    while (true) {
                        LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                        int i9 = logoCreateActivity8.abc1005;
                        if (i9 > 3) {
                            i9 = 3;
                        }
                        if (i8 < i9) {
                            String[] strArr2 = logoCreateActivity8.abc10077;
                            if (strArr2 != null) {
                                strArr2[1] = "etta S";
                            }
                            i8++;
                        }
                    }
                    i7++;
                }
                if (logoCreateActivity4.abc10042 != null) {
                    int i10 = 0;
                    while (true) {
                        int[] iArr5 = LogoCreateActivity.this.abc10042;
                        if (i10 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i10] = 6;
                        i10++;
                    }
                }
                ArrayList<String> arrayList2 = LogoCreateActivity.this.abc10018;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc10018.remove(0);
                }
                int i11 = 0;
                while (true) {
                    LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
                    int i12 = logoCreateActivity9.abc1005;
                    if (i12 > 3) {
                        i12 = 3;
                    }
                    if (i11 >= i12) {
                        break;
                    }
                    String[] strArr3 = logoCreateActivity9.abc10031;
                    if (strArr3 != null) {
                        strArr3[1] = null;
                    }
                    i11++;
                }
            }
            LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
            if (logoCreateActivity10.abc10060 == null) {
                logoCreateActivity10.abc10060 = new String[10];
            }
            if (!TextUtils.isEmpty(logoCreateActivity10.abc10012)) {
                int length2 = LogoCreateActivity.this.abc10012.length();
                LogoCreateActivity.this.abc10012 = LogoCreateActivity.this.abc10012 + length2;
            }
            int i13 = 0;
            while (true) {
                LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
                int i14 = logoCreateActivity11.abc1008;
                if (i14 > 3) {
                    i14 = 3;
                }
                if (i13 >= i14) {
                    break;
                }
                logoCreateActivity11.abc10049 = !logoCreateActivity11.abc10049;
                i13++;
            }
            int i15 = 0;
            while (i15 < size) {
                Typeface createFromAsset = Typeface.createFromAsset(LogoCreateActivity.this.getAssets(), "fonts/" + list.get(i15));
                LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
                logoCreateActivity12.abc10026 = 0.65218925f;
                int[] iArr6 = logoCreateActivity12.abc10047;
                if (iArr6 != null) {
                    iArr6[c] = 4;
                }
                if (logoCreateActivity12.abc10041 == null) {
                    logoCreateActivity12.abc10041 = new int[i];
                }
                ArrayList<String> arrayList3 = logoCreateActivity12.abc8;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoCreateActivity.this.abc8.remove(0);
                    LogoCreateActivity logoCreateActivity13 = LogoCreateActivity.this;
                    logoCreateActivity13.abc10066 -= 0.62777984f;
                    int[] iArr7 = logoCreateActivity13.abc10061;
                    if (iArr7 != null) {
                        iArr7[8] = 4;
                    }
                    if (logoCreateActivity13.abc10043 == null) {
                        logoCreateActivity13.abc10043 = new String[i];
                    }
                }
                LogoCreateActivity logoCreateActivity14 = LogoCreateActivity.this;
                logoCreateActivity14.abc10027 = Math.abs(logoCreateActivity14.abc10027);
                ArrayList<String> arrayList4 = LogoCreateActivity.this.abc10048;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoCreateActivity.this.abc10048.remove(0);
                }
                if (LogoCreateActivity.this.abc10043 != null) {
                    int i16 = 0;
                    while (true) {
                        String[] strArr4 = LogoCreateActivity.this.abc10043;
                        if (i16 >= (strArr4.length > i2 ? i2 : strArr4.length)) {
                            break;
                        }
                        strArr4[i16] = "string" + i16;
                        i16++;
                    }
                }
                LogoCreateActivity.this.mapFont.put(list.get(i15), createFromAsset);
                LogoCreateActivity logoCreateActivity15 = LogoCreateActivity.this;
                if (logoCreateActivity15.abc10038 < 0.92383367d) {
                    logoCreateActivity15.abc10038 = 0.5043613f;
                }
                String[] strArr5 = logoCreateActivity15.abc10031;
                if (strArr5 != null) {
                    strArr5[9] = null;
                }
                logoCreateActivity15.abc1005 = -logoCreateActivity15.abc1005;
                int[] iArr8 = logoCreateActivity15.abc20;
                if (iArr8 != null) {
                    iArr8[7] = 0;
                    int[] iArr9 = logoCreateActivity15.abc10061;
                    if (iArr9 != null) {
                        iArr9[7] = 0;
                    }
                    int[] iArr10 = logoCreateActivity15.abc10050;
                    if (iArr10 != null) {
                        iArr10[8] = 0;
                    }
                    if (logoCreateActivity15.abc10075 != null) {
                        int i17 = 0;
                        while (true) {
                            String[] strArr6 = LogoCreateActivity.this.abc10075;
                            if (i17 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                                break;
                            }
                            strArr6[i17] = "string" + i17;
                            i17++;
                        }
                    }
                }
                LogoCreateActivity logoCreateActivity16 = LogoCreateActivity.this;
                logoCreateActivity16.abc10012 = "sn’";
                String[] strArr7 = logoCreateActivity16.abc10022;
                if (strArr7 != null) {
                    strArr7[9] = null;
                }
                int[] iArr11 = logoCreateActivity16.abc10061;
                if (iArr11 != null) {
                    iArr11[1] = 2;
                }
                arrayList.add(createFromAsset);
                if (LogoCreateActivity.this.abc10021 != null) {
                    int i18 = 0;
                    while (true) {
                        String[] strArr8 = LogoCreateActivity.this.abc10021;
                        if (i18 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i18] = "string" + i18;
                        i18++;
                    }
                }
                LogoCreateActivity logoCreateActivity17 = LogoCreateActivity.this;
                logoCreateActivity17.abc10038 = Math.abs(logoCreateActivity17.abc10038);
                if (!TextUtils.isEmpty(LogoCreateActivity.this.abc10069)) {
                    int length3 = LogoCreateActivity.this.abc10069.length();
                    LogoCreateActivity.this.abc10069 = LogoCreateActivity.this.abc10069 + length3;
                }
                LogoCreateActivity logoCreateActivity18 = LogoCreateActivity.this;
                if (logoCreateActivity18.abc11 == null) {
                    logoCreateActivity18.abc11 = new ArrayList<>();
                    if (LogoCreateActivity.this.abc10023 != null) {
                        int i19 = 0;
                        while (true) {
                            String[] strArr9 = LogoCreateActivity.this.abc10023;
                            if (i19 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                                break;
                            }
                            strArr9[i19] = "string" + i19;
                            i19++;
                        }
                    }
                    LogoCreateActivity logoCreateActivity19 = LogoCreateActivity.this;
                    if (logoCreateActivity19.abc10010 == null) {
                        logoCreateActivity19.abc10010 = new ArrayList<>();
                    }
                    LogoCreateActivity.this.abc10040 = !logoCreateActivity3.abc10040;
                }
                if (LogoCreateActivity.this.abc10074.size() < 8) {
                    LogoCreateActivity.this.abc10074.add(0);
                }
                if (LogoCreateActivity.this.abc10060 != null) {
                    int i20 = 0;
                    while (true) {
                        String[] strArr10 = LogoCreateActivity.this.abc10060;
                        if (i20 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                            break;
                        }
                        strArr10[i20] = "string" + i20;
                        i20++;
                    }
                }
                int[] iArr12 = LogoCreateActivity.this.abc10017;
                if (iArr12 != null) {
                    iArr12[1] = 6;
                }
                i15++;
                c = 5;
                i = 10;
                i2 = 3;
            }
            LogoCreateActivity logoCreateActivity20 = LogoCreateActivity.this;
            if (logoCreateActivity20.abc10068 > 0.40244499635982334d) {
                logoCreateActivity20.abc10068 = 0.9955067435408483d;
            }
            logoCreateActivity20.abc10062 = "rar";
            if (logoCreateActivity20.abc10055.size() < 8) {
                LogoCreateActivity.this.abc10055.add(3);
            }
            LogoCreateActivity logoCreateActivity21 = LogoCreateActivity.this;
            if (logoCreateActivity21.abc9 == null) {
                logoCreateActivity21.abc9 = new ArrayList<>();
                LogoCreateActivity logoCreateActivity22 = LogoCreateActivity.this;
                logoCreateActivity22.abc1007 *= 0.24465728f;
                ArrayList<String> arrayList5 = logoCreateActivity22.abc10048;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoCreateActivity.this.abc10048.remove(0);
                }
                if (LogoCreateActivity.this.abc10056.size() < 9) {
                    LogoCreateActivity.this.abc10056.add(2);
                }
            }
            if (LogoCreateActivity.this.abc10011.size() < 9) {
                LogoCreateActivity.this.abc10011.add(9);
            }
            LogoCreateActivity logoCreateActivity23 = LogoCreateActivity.this;
            String[] strArr11 = logoCreateActivity23.abc10031;
            if (strArr11 != null) {
                strArr11[6] = null;
            }
            logoCreateActivity23.abc10072 = true;
            logoCreateActivity23.binding.drawview.setFontMap(logoCreateActivity23.mapFont);
            if (LogoCreateActivity.this.abc1002 != null) {
                int i21 = 0;
                while (true) {
                    int[] iArr13 = LogoCreateActivity.this.abc1002;
                    if (i21 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i21] = 8;
                    i21++;
                }
            }
            LogoCreateActivity logoCreateActivity24 = LogoCreateActivity.this;
            if (logoCreateActivity24.abc10024 == null) {
                logoCreateActivity24.abc10024 = new ArrayList<>();
            }
            LogoCreateActivity logoCreateActivity25 = LogoCreateActivity.this;
            logoCreateActivity25.abc10013 += 0.8189898f;
            int[] iArr14 = logoCreateActivity25.abc15;
            if (iArr14 != null) {
                iArr14[4] = 1;
                logoCreateActivity25.abc10038 = 0.90546906f;
                int[] iArr15 = logoCreateActivity25.abc10041;
                if (iArr15 != null) {
                    iArr15[0] = 0;
                }
                String[] strArr12 = logoCreateActivity25.abc10043;
                if (strArr12 != null) {
                    strArr12[6] = "ved well o";
                }
            }
            logoCreateActivity25.abc10054 = "a";
            logoCreateActivity25.abc1004 = !logoCreateActivity25.abc1004;
            if (logoCreateActivity25.abc10048.size() > 8) {
                LogoCreateActivity.this.abc10048.add(" reall");
            }
            LogoCreateActivity.this.logoRvFontAdapter.setData(arrayList);
            LogoCreateActivity logoCreateActivity26 = LogoCreateActivity.this;
            logoCreateActivity26.abc10058 = Math.abs(logoCreateActivity26.abc10058);
            ArrayList<Integer> arrayList6 = LogoCreateActivity.this.abc10011;
            if (arrayList6 == null && arrayList6.size() > 0) {
                LogoCreateActivity.this.abc10011.remove(0);
            }
            LogoCreateActivity logoCreateActivity27 = LogoCreateActivity.this;
            String[] strArr13 = logoCreateActivity27.abc10023;
            if (strArr13 != null) {
                strArr13[7] = null;
            }
            if (logoCreateActivity27.abc9.size() < 6) {
                LogoCreateActivity.this.abc9.add("例看到了高斯模");
                LogoCreateActivity logoCreateActivity28 = LogoCreateActivity.this;
                if (logoCreateActivity28.abc10027 < 0.13570762d) {
                    logoCreateActivity28.abc10027 = 0.6719329f;
                }
                logoCreateActivity28.abc10029 = true;
                if (logoCreateActivity28.abc10045 != null) {
                    while (true) {
                        int[] iArr16 = LogoCreateActivity.this.abc10045;
                        if (i3 >= (iArr16.length > 3 ? 3 : iArr16.length)) {
                            break;
                        }
                        iArr16[i3] = 8;
                        i3++;
                    }
                }
            }
            LogoCreateActivity logoCreateActivity29 = LogoCreateActivity.this;
            String[] strArr14 = logoCreateActivity29.abc10077;
            if (strArr14 != null) {
                strArr14[9] = null;
            }
            if (logoCreateActivity29.abc10011 == null) {
                logoCreateActivity29.abc10011 = new ArrayList<>();
            }
            LogoCreateActivity.this.abc10013 = 0.31801242f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$z0 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9539z0 implements View.OnClickListener {
        public View$OnClickListenerC9539z0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity.this.binding.drawview.m9122D(0.0f, 5.0f);
            ArrayList<String> arrayList = LogoCreateActivity.this.abc10018;
            int i = 0;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10018.remove(0);
            }
            if (LogoCreateActivity.this.abc10057 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoCreateActivity.this.abc10057;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoCreateActivity logoCreateActivity2 = LogoCreateActivity.this;
            logoCreateActivity2.abc10035 = !logoCreateActivity2.abc10035;
            int[] iArr = logoCreateActivity2.abc16;
            if (iArr != null) {
                iArr[3] = 0;
                if (logoCreateActivity2.abc10048 == null) {
                    logoCreateActivity2.abc10048 = new ArrayList<>();
                }
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                if (logoCreateActivity3.abc10073 == null) {
                    logoCreateActivity3.abc10073 = new String[10];
                }
                String[] strArr2 = logoCreateActivity3.abc10060;
                if (strArr2 != null) {
                    strArr2[9] = null;
                }
            }
            LogoCreateActivity.this.abc10025 *= 0.2451843f;
            while (true) {
                logoCreateActivity = LogoCreateActivity.this;
                int i3 = logoCreateActivity.abc10046;
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i >= i3) {
                    break;
                }
                logoCreateActivity.abc10032 = !logoCreateActivity.abc10032;
                i++;
            }
            if (logoCreateActivity.abc10017 == null) {
                logoCreateActivity.abc10017 = new int[10];
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoCreateActivity$z1 */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9540z1 implements View.OnClickListener {
        public View$OnClickListenerC9540z1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoCreateActivity logoCreateActivity;
            LogoCreateActivity logoCreateActivity2;
            if (LogoCreateActivity.this.binding.drawview.m9085t()) {
                LogoCreateActivity.this.closeAll();
                LogoCreateActivity logoCreateActivity3 = LogoCreateActivity.this;
                logoCreateActivity3.abc10063 = ((double) logoCreateActivity3.abc10063) > 0.74510425d ? 0.8629697f : 0.6784788f;
                String[] strArr = logoCreateActivity3.abc1001;
                if (strArr != null) {
                    strArr[8] = "ou’re p";
                }
                logoCreateActivity3.abc10049 = true;
                logoCreateActivity3.binding.drawview.m9121E();
                if (LogoCreateActivity.this.abc10011.size() < 3) {
                    LogoCreateActivity.this.abc10011.add(9);
                }
                LogoCreateActivity logoCreateActivity4 = LogoCreateActivity.this;
                logoCreateActivity4.abc10028 = 3;
                logoCreateActivity4.abc10066 = 0.9432229f;
            }
            if (LogoCreateActivity.this.abc10074.size() > 9) {
                LogoCreateActivity.this.abc10074.add(0);
            }
            LogoCreateActivity logoCreateActivity5 = LogoCreateActivity.this;
            String[] strArr2 = logoCreateActivity5.abc10023;
            if (strArr2 != null) {
                strArr2[7] = "u thin";
            }
            int[] iArr = logoCreateActivity5.abc10050;
            if (iArr != null) {
                iArr[2] = 5;
            }
            logoCreateActivity5.createVM.hideLayerList();
            LogoCreateActivity logoCreateActivity6 = LogoCreateActivity.this;
            logoCreateActivity6.abc10076 = true;
            ArrayList<String> arrayList = logoCreateActivity6.abc10024;
            if (arrayList != null && arrayList.size() > 0) {
                LogoCreateActivity.this.abc10024.remove(0);
            }
            LogoCreateActivity logoCreateActivity7 = LogoCreateActivity.this;
            logoCreateActivity7.abc10072 = !logoCreateActivity7.abc10072;
            int[] iArr2 = logoCreateActivity7.abc6;
            if (iArr2 != null) {
                iArr2[0] = 0;
                ArrayList<String> arrayList2 = logoCreateActivity7.abc1003;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoCreateActivity.this.abc1003.remove(0);
                }
                if (LogoCreateActivity.this.abc10074.size() > 2) {
                    LogoCreateActivity.this.abc10074.add(5);
                }
                LogoCreateActivity logoCreateActivity8 = LogoCreateActivity.this;
                if (logoCreateActivity8.abc1005 < 0) {
                    logoCreateActivity8.abc1005 = 7;
                }
            }
            ArrayList<String> arrayList3 = LogoCreateActivity.this.abc10024;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoCreateActivity.this.abc10024.remove(0);
            }
            ArrayList<String> arrayList4 = LogoCreateActivity.this.abc1003;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoCreateActivity.this.abc1003.remove(0);
            }
            LogoCreateActivity logoCreateActivity9 = LogoCreateActivity.this;
            if (logoCreateActivity9.abc10018 == null) {
                logoCreateActivity9.abc10018 = new ArrayList<>();
            }
            if (LogoCreateActivity.this.abc22 != null) {
                int i = 0;
                while (true) {
                    logoCreateActivity = LogoCreateActivity.this;
                    int[] iArr3 = logoCreateActivity.abc22;
                    if (i >= iArr3.length) {
                        break;
                    }
                    iArr3[i] = 5;
                    if (logoCreateActivity.abc10048.size() < 8) {
                        LogoCreateActivity.this.abc10048.add("de and P");
                    }
                    LogoCreateActivity logoCreateActivity10 = LogoCreateActivity.this;
                    if (logoCreateActivity10.abc10047 == null) {
                        logoCreateActivity10.abc10047 = new int[10];
                    }
                    String[] strArr3 = logoCreateActivity10.abc10073;
                    if (strArr3 != null) {
                        strArr3[1] = null;
                    }
                    i++;
                }
                logoCreateActivity.abc1008 = 0;
                int i2 = 0;
                while (true) {
                    logoCreateActivity2 = LogoCreateActivity.this;
                    int i3 = logoCreateActivity2.abc10046;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    if (logoCreateActivity2.abc10039 == null) {
                        logoCreateActivity2.abc10039 = new ArrayList<>();
                    }
                    i2++;
                }
                if (logoCreateActivity2.abc1000 == null) {
                    logoCreateActivity2.abc1000 = new ArrayList<>();
                }
            }
            LogoCreateActivity logoCreateActivity11 = LogoCreateActivity.this;
            if (logoCreateActivity11.abc10056 == null) {
                logoCreateActivity11.abc10056 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList5 = LogoCreateActivity.this.abc10055;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoCreateActivity.this.abc10055.remove(0);
            }
            LogoCreateActivity logoCreateActivity12 = LogoCreateActivity.this;
            if (logoCreateActivity12.abc10075 == null) {
                logoCreateActivity12.abc10075 = new String[10];
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealTextStyle() {
        int i;
        this.lastTextBold = this.binding.drawview.getTextBold();
        this.abc10046 = 5;
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        ArrayList<Integer> arrayList = this.abc10078;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10078.remove(0);
        }
        if (this.abc8 == null) {
            this.abc8 = new ArrayList<>();
            if (this.abc10030.size() > 5) {
                this.abc10030.add(9);
            }
            this.abc10029 = false;
            if (this.abc10038 > 0.91410726d) {
                this.abc10038 = 0.5554612f;
            }
        }
        if (this.abc10045 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.abc10045;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 1;
                i2++;
            }
        }
        this.abc1008 = this.abc1008 < 0 ? 9 : 0;
        if (this.abc10046 < 0) {
            this.abc10046 = 4;
        }
        this.lastTextSkew = this.binding.drawview.getTextSkew();
        this.abc10028 = 8;
        int[] iArr2 = this.abc10041;
        if (iArr2 != null) {
            iArr2[0] = 0;
        }
        this.abc10038 -= 0.29456025f;
        if (this.abc36 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr = this.abc36;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = "string" + i3;
                if (this.abc10036 == null) {
                    this.abc10036 = new ArrayList<>();
                }
                if (this.abc10014 == null) {
                    this.abc10014 = new ArrayList<>();
                }
                this.abc10025 = Math.abs(this.abc10025);
                i3++;
            }
            int i4 = 0;
            while (true) {
                int i5 = this.abc10028;
                if (i5 > 3) {
                    i5 = 3;
                }
                if (i4 >= i5) {
                    break;
                }
                if (!TextUtils.isEmpty(this.abc10012)) {
                    this.abc10012 += this.abc10012.length();
                }
                i4++;
            }
            if (this.abc10078 == null) {
                this.abc10078 = new ArrayList<>();
            }
            if (this.abc10016 == null) {
                this.abc10016 = new String[10];
            }
        }
        if (this.abc10073 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.abc10073;
                if (i6 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i6] = "string" + i6;
                i6++;
            }
        }
        if (this.abc10058 < 0.5919721293180893d) {
            this.abc10058 = 0.3980892313239448d;
        }
        if (!TextUtils.isEmpty(this.abc10054)) {
            this.abc10054 += this.abc10054.length();
        }
        this.lastTextUnderline = this.binding.drawview.getTextUnderline();
        this.abc10026 = 0.92926663f;
        if (this.abc10077 == null) {
            this.abc10077 = new String[10];
        }
        this.abc10062 = "ation (i";
        if (this.abc36 == null) {
            this.abc36 = new String[10];
            ArrayList<Integer> arrayList2 = this.abc10030;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10030.remove(0);
            }
            if (this.abc10075 == null) {
                this.abc10075 = new String[10];
            }
            this.abc10032 = !this.abc10032;
        }
        this.abc10019 = Math.abs(this.abc10019);
        if (this.abc10060 != null) {
            int i7 = 0;
            while (true) {
                String[] strArr3 = this.abc10060;
                if (i7 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i7] = "string" + i7;
                i7++;
            }
        }
        this.abc10059 = "ratio";
        this.logoRvTextColorAdapter.setSelectedColor(this.binding.drawview.getTextColor().intValue());
        int[] iArr3 = this.abc10061;
        if (iArr3 != null) {
            iArr3[7] = 0;
        }
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        String[] strArr4 = this.abc10057;
        if (strArr4 != null) {
            strArr4[0] = null;
        }
        int[] iArr4 = this.abc16;
        if (iArr4 != null) {
            iArr4[1] = 6;
            if (this.abc1002 != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.abc1002;
                    if (i8 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i8] = 0;
                    i8++;
                }
            }
            if (this.abc1002 != null) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.abc1002;
                    if (i9 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i9] = 5;
                    i9++;
                }
            }
            this.abc10052--;
        }
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        if (this.abc10028 < 0) {
            this.abc10028 = 5;
        }
        if (this.abc1005 < 0) {
            this.abc1005 = 5;
        }
        List<String> value = this.createVM.getListFont().getValue();
        if (this.abc1002 == null) {
            this.abc1002 = new int[10];
        }
        this.abc10027 = ((double) this.abc10027) < 0.41959655d ? 0.6261831f : 0.15345067f;
        ArrayList<Integer> arrayList3 = this.abc10011;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc10011.remove(0);
        }
        if (this.abc34 != null) {
            int i10 = 0;
            while (true) {
                int[] iArr7 = this.abc34;
                if (i10 >= iArr7.length) {
                    break;
                }
                iArr7[i10] = 4;
                int i11 = 0;
                while (true) {
                    int i12 = this.abc10019;
                    if (i12 > 3) {
                        i12 = 3;
                    }
                    if (i11 >= i12) {
                        break;
                    }
                    ArrayList<Integer> arrayList4 = this.abc10011;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        this.abc10011.remove(0);
                    }
                    i11++;
                }
                this.abc10032 = false;
                if (this.abc10017 == null) {
                    this.abc10017 = new int[10];
                }
                i10++;
            }
            int[] iArr8 = this.abc10061;
            if (iArr8 != null) {
                iArr8[2] = 0;
            }
            String[] strArr5 = this.abc10015;
            if (strArr5 != null) {
                strArr5[2] = "hat in ma";
            }
            this.abc10046 = 7;
        }
        this.abc1008 = 9;
        if (this.abc10027 < 0.22578424d) {
            this.abc10027 = 0.2247917f;
        }
        if (this.abc10022 == null) {
            this.abc10022 = new String[10];
        }
        String textFont = this.binding.drawview.getTextFont();
        if (this.abc10039 == null) {
            this.abc10039 = new ArrayList<>();
        }
        if (this.abc10036 == null) {
            this.abc10036 = new ArrayList<>();
        }
        this.abc10054 = "ith its pl";
        this.abc24 = 0.4964500556630953d;
        String[] strArr6 = this.abc10015;
        if (strArr6 != null) {
            strArr6[6] = null;
        }
        this.abc10032 = false;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        int size = value == null ? 0 : value.size();
        if (this.abc1002 != null) {
            int i13 = 0;
            while (true) {
                int[] iArr9 = this.abc1002;
                if (i13 >= (iArr9.length > 3 ? 3 : iArr9.length)) {
                    break;
                }
                iArr9[i13] = 3;
                i13++;
            }
        }
        if (this.abc10010.size() < 3) {
            this.abc10010.add(6);
        }
        String[] strArr7 = this.abc10073;
        if (strArr7 != null) {
            strArr7[7] = null;
        }
        this.abc30 = Math.abs(this.abc30);
        this.abc10066 = 0.17367327f;
        this.abc10051 = 0.2559410948334607d;
        this.abc10033 = true;
        this.abc10026 = 0.33471638f;
        if (this.abc10074 == null) {
            this.abc10074 = new ArrayList<>();
        }
        if (this.abc10027 > 0.19844967d) {
            this.abc10027 = 0.8783649f;
        }
        if (this.abc21 == null) {
            this.abc21 = new ArrayList<>();
            if (this.abc1000.size() < 9) {
                this.abc1000.add(4);
            }
            int[] iArr10 = this.abc10050;
            if (iArr10 != null) {
                iArr10[0] = 2;
            }
            if (this.abc1003.size() < 3) {
                this.abc1003.add("in");
            }
        }
        if (this.abc1002 != null) {
            int i14 = 0;
            while (true) {
                int[] iArr11 = this.abc1002;
                if (i14 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                    break;
                }
                iArr11[i14] = 2;
                i14++;
            }
        }
        if (this.abc10016 != null) {
            int i15 = 0;
            while (true) {
                String[] strArr8 = this.abc10016;
                if (i15 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                    break;
                }
                strArr8[i15] = "string" + i15;
                i15++;
            }
        }
        this.abc10058 = this.abc10058 > 0.2843710700365536d ? 0.1908875841202864d : 0.5565540433398165d;
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                i = -1;
                break;
            } else if (value.get(i16).equals(textFont)) {
                this.abc10063 = 0.75588226f;
                this.abc10062 = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
                String[] strArr9 = this.abc10015;
                if (strArr9 != null) {
                    strArr9[5] = null;
                }
                this.abc29 = ".Fanny阅读";
                ArrayList<Integer> arrayList5 = this.abc10078;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    this.abc10078.remove(0);
                }
                this.abc10012 = " received";
                if (this.abc10067.size() > 1) {
                    this.abc10067.add("u’re pr");
                }
                i = i16;
            } else {
                this.abc10052 = 1;
                this.abc10065 = !this.abc10065;
                if (this.abc10073 == null) {
                    this.abc10073 = new String[10];
                }
                int[] iArr12 = this.abc6;
                if (iArr12 != null) {
                    iArr12[1] = 0;
                    if (this.abc1000.size() > 6) {
                        this.abc1000.add(7);
                    }
                    String[] strArr10 = this.abc10075;
                    if (strArr10 != null) {
                        strArr10[0] = "b";
                    }
                    this.abc10052 = this.abc10052 > 2 ? 9 : 3;
                }
                this.abc10046 = -this.abc10046;
                int[] iArr13 = this.abc10017;
                if (iArr13 != null) {
                    iArr13[4] = 0;
                }
                this.abc10069 = "l";
                i16++;
            }
        }
        if (this.abc10056.size() < 1) {
            this.abc10056.add(1);
        }
        if (this.abc10048 == null) {
            this.abc10048 = new ArrayList<>();
        }
        String[] strArr11 = this.abc10077;
        if (strArr11 != null) {
            strArr11[9] = null;
        }
        this.abc38 = Math.abs(this.abc38);
        this.abc10040 = !this.abc10040;
        if (this.abc10018.size() < 2) {
            this.abc10018.add("nsp");
        }
        this.abc10063 -= 0.27810764f;
        this.logoRvFontAdapter.setSelectedIndex(i);
        if (this.abc10078.size() > 8) {
            this.abc10078.add(7);
        }
        if (this.abc10024.size() > 6) {
            this.abc10024.add("’s novel w");
        }
        this.abc10068 = -this.abc10068;
        this.abc17 -= 0.29904332812943313d;
        this.abc1008 = Math.abs(this.abc1008);
        if (this.abc10025 > 0.018562257d) {
            this.abc10025 = 0.01858002f;
        }
        if (this.abc1005 > 0) {
            this.abc1005 = 9;
        }
        setBtFontStyle();
        String[] strArr12 = this.abc10015;
        if (strArr12 != null) {
            strArr12[1] = " a";
        }
        if (!TextUtils.isEmpty(this.abc10054)) {
            this.abc10054 += this.abc10054.length();
        }
        if (this.abc10038 < 0.24959683d) {
            this.abc10038 = 0.49909955f;
        }
        this.abc14 = 0.48789809287217856d;
        if (this.abc10037 == null) {
            this.abc10037 = new ArrayList<>();
        }
        if (this.abc10078 == null) {
            this.abc10078 = new ArrayList<>();
        }
        if (this.abc10073 == null) {
            this.abc10073 = new String[10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFirstMenu() {
        hideView2(this.binding.toolbar, new View[0]);
        if (this.abc10030.size() < 3) {
            this.abc10030.add(9);
        }
        if (this.abc10034.size() > 7) {
            this.abc10034.add(3);
        }
        if (this.abc10068 > 0.06402830176497498d) {
            this.abc10068 = 0.7953851203658485d;
        }
        hideView3(this.binding.ivLayer, new View[0]);
        if (this.abc10030.size() > 5) {
            this.abc10030.add(8);
        }
        int[] iArr = this.abc10050;
        if (iArr != null) {
            iArr[6] = 0;
        }
        ArrayList<String> arrayList = this.abc10039;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10039.remove(0);
        }
        this.createVM.hideLayerList();
        if (this.abc10078 == null) {
            this.abc10078 = new ArrayList<>();
        }
        String[] strArr = this.abc1001;
        if (strArr != null) {
            strArr[1] = " For ";
        }
        ArrayList<Integer> arrayList2 = this.abc1000;
        if (arrayList2 != null || arrayList2.size() <= 0) {
            return;
        }
        this.abc1000.remove(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideView(View view, View... viewArr) {
        int i;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 123) {
            if (this.abc10073 == null) {
                this.abc10073 = new String[10];
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            if (this.abc13 == null) {
                this.abc13 = new int[10];
                String[] strArr = this.abc10022;
                if (strArr != null) {
                    strArr[9] = null;
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new String[10];
                }
                ArrayList<Integer> arrayList = this.abc10056;
                if (arrayList == null && arrayList.size() > 0) {
                    this.abc10056.remove(0);
                }
            }
            this.abc10040 = true;
            if (this.abc10030.size() > 2) {
                this.abc10030.add(5);
            }
            if (this.abc10045 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.abc10045;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 3;
                    i2++;
                }
            }
            view.setTag(123);
            this.abc10065 = false;
            if (this.abc10022 == null) {
                this.abc10022 = new String[10];
            }
            this.abc10013 = ((double) this.abc10013) < 0.75587976d ? 0.296606f : 0.8964495f;
            if (this.abc32 == null) {
                this.abc32 = new int[10];
                if (this.abc10060 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr2 = this.abc10060;
                        if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i3] = "string" + i3;
                        i3++;
                    }
                }
                if (this.abc10031 == null) {
                    this.abc10031 = new String[10];
                }
                if (this.abc10066 < 0.97176313d) {
                    this.abc10066 = 0.4711504f;
                }
            }
            this.abc10051 += 0.22283175496346763d;
            ArrayList<Integer> arrayList2 = this.abc1000;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1000.remove(0);
            }
            this.abc10013 *= 0.13677156f;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            if (!TextUtils.isEmpty(this.abc10012)) {
                this.abc10012 += this.abc10012.length();
            }
            this.abc10051 = this.abc10051 > 0.28041678492731137d ? 0.8345953519914106d : 0.8074836114972174d;
            if (this.abc10055.size() < 6) {
                this.abc10055.add(0);
            }
            ArrayList<String> arrayList3 = this.abc9;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc9.remove(0);
                if (!TextUtils.isEmpty(this.abc10054)) {
                    this.abc10054 += this.abc10054.length();
                }
                if (this.abc10056.size() > 6) {
                    this.abc10056.add(4);
                }
                if (this.abc10074.size() > 8) {
                    this.abc10074.add(6);
                }
            }
            this.abc10012 = "tudent";
            if (this.abc10010 == null) {
                this.abc10010 = new ArrayList<>();
            }
            String[] strArr3 = this.abc10071;
            if (strArr3 != null) {
                strArr3[1] = "ize tha";
            }
            translateAnimation.setDuration(300L);
            int[] iArr2 = this.abc10045;
            if (iArr2 != null) {
                iArr2[1] = 7;
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            this.abc10046 += 4;
            if (this.abc13 == null) {
                this.abc13 = new int[10];
                if (this.abc10057 == null) {
                    this.abc10057 = new String[10];
                }
                this.abc10028 = 9;
                if (!TextUtils.isEmpty(this.abc10059)) {
                    this.abc10059 += this.abc10059.length();
                }
            }
            this.abc10028 = this.abc10028 < 0 ? 6 : 8;
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
            if (this.abc10015 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr4 = this.abc10015;
                    if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i4] = "string" + i4;
                    i4++;
                }
            }
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9493m2(view, viewArr));
            if (!TextUtils.isEmpty(this.abc10064)) {
                this.abc10064 += this.abc10064.length();
            }
            if (this.abc10014 == null) {
                this.abc10014 = new ArrayList<>();
            }
            int i5 = 0;
            while (true) {
                int i6 = this.abc1005;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                this.abc10033 = true;
                i5++;
            }
            this.abc18 = 0.4373061049807123d;
            this.abc10068 = this.abc10068 < 0.973681883977907d ? 0.3083352573633876d : 0.199803949145808d;
            this.abc1004 = !this.abc1004;
            this.abc10028 = 4;
            view.setEnabled(false);
            this.abc10072 = true;
            if (this.abc10039.size() > 2) {
                this.abc10039.add("is), and ");
            }
            if (this.abc10050 == null) {
                this.abc10050 = new int[10];
            }
            String[] strArr5 = this.abc31;
            if (strArr5 != null) {
                i = 0;
                strArr5[0] = null;
                String[] strArr6 = this.abc10016;
                if (strArr6 != null) {
                    strArr6[7] = "entiment ";
                }
                this.abc10076 = false;
                int i7 = 0;
                while (true) {
                    int i8 = this.abc10028;
                    if (i7 >= (i8 > 3 ? 3 : i8)) {
                        break;
                    }
                    if (i8 < 0) {
                        this.abc10028 = 6;
                    }
                    i7++;
                }
            } else {
                i = 0;
            }
            if (this.abc10039 == null) {
                this.abc10039 = new ArrayList<>();
            }
            if (this.abc10075 != null) {
                int i9 = i;
                while (true) {
                    String[] strArr7 = this.abc10075;
                    if (i9 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i9] = "string" + i9;
                    i9++;
                }
            }
            String[] strArr8 = this.abc10031;
            if (strArr8 != null) {
                strArr8[3] = "ar";
            }
            view.startAnimation(translateAnimation);
            this.abc1004 = !this.abc1004;
            this.abc1008 = -this.abc1008;
            this.abc10072 = !this.abc10072;
            if (this.abc0 == null) {
                this.abc0 = new String[10];
                if (this.abc10030.size() < 9) {
                    this.abc10030.add(4);
                }
                String[] strArr9 = this.abc10016;
                if (strArr9 != null) {
                    strArr9[6] = "dern nove";
                }
                int i10 = i;
                while (true) {
                    int i11 = this.abc10046;
                    if (i10 >= (i11 > 3 ? 3 : i11)) {
                        break;
                    }
                    this.abc10046 = i11 < 1 ? 7 : 5;
                    i10++;
                }
            }
            while (true) {
                int i12 = this.abc10052;
                if (i12 > 3) {
                    i12 = 3;
                }
                if (i >= i12) {
                    break;
                }
                this.abc1007 = ((double) this.abc1007) < 0.27312845d ? 0.61877984f : 0.27242833f;
                i++;
            }
            this.abc10035 = true;
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
        }
    }

    private void hideView2(View view, View... viewArr) {
        if (view == null || view.getVisibility() == 4) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 123) {
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
            this.abc10063 *= 0.7341488f;
            this.abc10052 -= 0;
            if (this.abc13 == null) {
                this.abc13 = new int[10];
                if (this.abc1002 == null) {
                    this.abc1002 = new int[10];
                }
                if (this.abc10047 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr = this.abc10047;
                        if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i] = 6;
                        i++;
                    }
                }
                int[] iArr2 = this.abc10047;
                if (iArr2 != null) {
                    iArr2[9] = 0;
                }
            }
            if (this.abc10048 == null) {
                this.abc10048 = new ArrayList<>();
            }
            int[] iArr3 = this.abc10042;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (this.abc10056.size() < 0) {
                this.abc10056.add(1);
            }
            view.setTag(123);
            if (this.abc10030 == null) {
                this.abc10030 = new ArrayList<>();
            }
            if (this.abc10039.size() > 5) {
                this.abc10039.add("un");
            }
            this.abc10020 = 0.3863244f;
            if (this.abc32 == null) {
                this.abc32 = new int[10];
                this.abc10040 = !this.abc10040;
                if (this.abc10067 == null) {
                    this.abc10067 = new ArrayList<>();
                }
                if (!TextUtils.isEmpty(this.abc10062)) {
                    this.abc10062 += this.abc10062.length();
                }
            }
            if (this.abc10074 == null) {
                this.abc10074 = new ArrayList<>();
            }
            this.abc10028 = this.abc10028 < 6 ? 3 : 7;
            this.abc10068 = this.abc10068 < 0.8933402875693373d ? 0.8192605738203222d : 0.586097782330672d;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            this.abc10026 = 0.9724321f;
            this.abc10066 += 0.011921883f;
            if (this.abc10020 < 0.63932776d) {
                this.abc10020 = 0.60373485f;
            }
            ArrayList<String> arrayList = this.abc9;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc9.remove(0);
                this.abc10046 = 1;
                ArrayList<String> arrayList2 = this.abc10070;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.abc10070.remove(0);
                }
                if (this.abc1003.size() < 9) {
                    this.abc1003.add("nd mod");
                }
            }
            ArrayList<String> arrayList3 = this.abc10036;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc10036.remove(0);
            }
            if (this.abc10041 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr4 = this.abc10041;
                    if (i2 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i2] = 6;
                    i2++;
                }
            }
            if (this.abc10048.size() < 6) {
                this.abc10048.add("re fa");
            }
            translateAnimation.setDuration(300L);
            this.abc10063 = 0.0289554f;
            if (this.abc10041 == null) {
                this.abc10041 = new int[10];
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            if (this.abc13 == null) {
                this.abc13 = new int[10];
                String[] strArr = this.abc10022;
                if (strArr != null) {
                    strArr[3] = "th";
                }
                this.abc10020 = 0.33012766f;
                if (this.abc10015 == null) {
                    this.abc10015 = new String[10];
                }
            }
            this.abc10062 = "ty ";
            if (this.abc10034.size() > 6) {
                this.abc10034.add(9);
            }
            if (this.abc10056 == null) {
                this.abc10056 = new ArrayList<>();
            }
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9501o2(view, viewArr));
            if (!TextUtils.isEmpty(this.abc10059)) {
                this.abc10059 += this.abc10059.length();
            }
            this.abc10063 *= 0.44815826f;
            this.abc10062 = " to 'get";
            this.abc18 = 0.4373061049807123d;
            ArrayList<Integer> arrayList4 = this.abc10034;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc10034.remove(0);
            }
            if (this.abc10018 == null) {
                this.abc10018 = new ArrayList<>();
            }
            this.abc10066 = 0.60854226f;
            view.setEnabled(false);
            this.abc10066 = ((double) this.abc10066) < 0.22783405d ? 0.56829756f : 0.5177222f;
            this.abc10051 = 0.5707132456725106d;
            this.abc10038 = -this.abc10038;
            String[] strArr2 = this.abc31;
            if (strArr2 != null) {
                strArr2[0] = null;
                ArrayList<Integer> arrayList5 = this.abc1000;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    this.abc1000.remove(0);
                }
                if (this.abc10034.size() < 1) {
                    this.abc10034.add(0);
                }
                if (this.abc10042 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr5 = this.abc10042;
                        if (i3 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i3] = 4;
                        i3++;
                    }
                }
            }
            String[] strArr3 = this.abc10060;
            if (strArr3 != null) {
                strArr3[6] = null;
            }
            if (!TextUtils.isEmpty(this.abc10059)) {
                this.abc10059 += this.abc10059.length();
            }
            int[] iArr6 = this.abc10042;
            if (iArr6 != null) {
                iArr6[3] = 0;
            }
            view.startAnimation(translateAnimation);
            ArrayList<String> arrayList6 = this.abc10036;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc10036.remove(0);
            }
            int[] iArr7 = this.abc10050;
            if (iArr7 != null) {
                iArr7[0] = 0;
            }
            if (this.abc10024.size() > 4) {
                this.abc10024.add("reat it ");
            }
            if (this.abc0 == null) {
                this.abc0 = new String[10];
                String[] strArr4 = this.abc10021;
                if (strArr4 != null) {
                    strArr4[2] = "sn’t rec";
                }
                String[] strArr5 = this.abc10031;
                if (strArr5 != null) {
                    strArr5[2] = "d it.";
                }
                if (this.abc10043 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr6 = this.abc10043;
                        if (i4 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                            break;
                        }
                        strArr6[i4] = "string" + i4;
                        i4++;
                    }
                }
            }
            if (!TextUtils.isEmpty(this.abc10064)) {
                this.abc10064 += this.abc10064.length();
            }
            int i5 = 0;
            while (true) {
                int i6 = this.abc10019;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                if (this.abc10042 == null) {
                    this.abc10042 = new int[10];
                }
                i5++;
            }
            int[] iArr8 = this.abc10050;
            if (iArr8 != null) {
                iArr8[8] = 0;
            }
        }
    }

    private void hideView3(View view, View... viewArr) {
        if (view == null || view.getVisibility() == 4) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 123) {
            if (this.abc1003.size() > 9) {
                this.abc1003.add("t a mo");
            }
            int i = 0;
            while (true) {
                int i2 = this.abc1008;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                String[] strArr = this.abc10022;
                if (strArr != null) {
                    strArr[0] = ReportUtil.f18058a;
                }
                i++;
            }
            if (this.abc10061 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr = this.abc10061;
                    if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i3] = 8;
                    i3++;
                }
            }
            if (this.abc13 == null) {
                this.abc13 = new int[10];
                ArrayList<String> arrayList = this.abc10067;
                if (arrayList != null && arrayList.size() > 0) {
                    this.abc10067.remove(0);
                }
                if (this.abc10017 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr2 = this.abc10017;
                        if (i4 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i4] = 4;
                        i4++;
                    }
                }
                this.abc10027 = ((double) this.abc10027) < 0.24169654d ? 0.32040656f : 0.11963558f;
            }
            this.abc10072 = !this.abc10072;
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            if (this.abc10056.size() < 9) {
                this.abc10056.add(4);
            }
            view.setTag(123);
            this.abc10027 = -this.abc10027;
            String[] strArr2 = this.abc10022;
            if (strArr2 != null) {
                strArr2[5] = "e early ";
            }
            if (this.abc10046 < 0) {
                this.abc10046 = 8;
            }
            if (this.abc32 == null) {
                this.abc32 = new int[10];
                this.abc10068 = 0.3868490130901019d;
                if (this.abc10047 == null) {
                    this.abc10047 = new int[10];
                }
                String[] strArr3 = this.abc10043;
                if (strArr3 != null) {
                    strArr3[8] = "ho";
                }
            }
            if (this.abc1003.size() > 4) {
                this.abc1003.add(" modern ");
            }
            if (this.abc10022 == null) {
                this.abc10022 = new String[10];
            }
            this.abc10051 = Math.abs(this.abc10051);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, -2.0f, 1, 0.0f, 1, 0.0f);
            if (this.abc10073 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr4 = this.abc10073;
                    if (i5 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i5] = "string" + i5;
                    i5++;
                }
            }
            this.abc10068 = 0.3935529997813214d;
            ArrayList<Integer> arrayList2 = this.abc10074;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10074.remove(0);
            }
            ArrayList<String> arrayList3 = this.abc9;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc9.remove(0);
                int i6 = 0;
                while (true) {
                    int i7 = this.abc10019;
                    if (i7 > 3) {
                        i7 = 3;
                    }
                    if (i6 >= i7) {
                        break;
                    }
                    this.abc10072 = false;
                    i6++;
                }
                this.abc10027 += 0.7780364f;
                if (!TextUtils.isEmpty(this.abc10062)) {
                    this.abc10062 += this.abc10062.length();
                }
            }
            if (this.abc10031 != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr5 = this.abc10031;
                    if (i8 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i8] = "string" + i8;
                    i8++;
                }
            }
            this.abc10026 = ((double) this.abc10026) > 0.08039975d ? 0.46396482f : 0.6135584f;
            ArrayList<Integer> arrayList4 = this.abc10037;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc10037.remove(0);
            }
            translateAnimation.setDuration(300L);
            int[] iArr3 = this.abc10050;
            if (iArr3 != null) {
                iArr3[5] = 0;
            }
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
            if (this.abc10036 == null) {
                this.abc10036 = new ArrayList<>();
            }
            if (this.abc13 == null) {
                this.abc13 = new int[10];
                String[] strArr6 = this.abc10043;
                if (strArr6 != null) {
                    strArr6[9] = null;
                }
                this.abc10028 += 6;
                this.abc10029 = !this.abc10029;
            }
            this.abc10038 = 0.52321523f;
            this.abc10059 = "ell";
            this.abc10026 = 0.46778268f;
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9509q2(view, viewArr));
            if (this.abc10073 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr7 = this.abc10073;
                    if (i9 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i9] = "string" + i9;
                    i9++;
                }
            }
            if (this.abc10068 > 0.12051764311248114d) {
                this.abc10068 = 0.4619116862146513d;
            }
            this.abc10066 = Math.abs(this.abc10066);
            this.abc18 = 0.4373061049807123d;
            this.abc10027 = ((double) this.abc10027) > 0.63860285d ? 0.4990062f : 0.74974346f;
            if (this.abc10013 < 0.251711d) {
                this.abc10013 = 0.5889757f;
            }
            this.abc10069 = "' how grea";
            view.setEnabled(false);
            if (this.abc10031 != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr8 = this.abc10031;
                    if (i10 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                        break;
                    }
                    strArr8[i10] = "string" + i10;
                    i10++;
                }
            }
            if (this.abc10067.size() > 0) {
                this.abc10067.add("tudents");
            }
            if (this.abc10010 == null) {
                this.abc10010 = new ArrayList<>();
            }
            String[] strArr9 = this.abc31;
            if (strArr9 != null) {
                strArr9[0] = null;
                if (this.abc10023 != null) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr10 = this.abc10023;
                        if (i11 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                            break;
                        }
                        strArr10[i11] = "string" + i11;
                        i11++;
                    }
                }
                if (this.abc10047 != null) {
                    int i12 = 0;
                    while (true) {
                        int[] iArr4 = this.abc10047;
                        if (i12 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i12] = 7;
                        i12++;
                    }
                }
                this.abc10076 = true;
            }
            this.abc10019 = 6;
            ArrayList<String> arrayList5 = this.abc1003;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc10066 = 0.91107625f;
            view.startAnimation(translateAnimation);
            String[] strArr11 = this.abc10060;
            if (strArr11 != null) {
                strArr11[8] = "el wasn’";
            }
            this.abc10059 = "mo";
            this.abc10033 = !this.abc10033;
            if (this.abc0 == null) {
                this.abc0 = new String[10];
                if (this.abc10022 == null) {
                    this.abc10022 = new String[10];
                }
                this.abc10020 = 0.3819896f;
                String[] strArr12 = this.abc10015;
                if (strArr12 != null) {
                    strArr12[3] = DownloadCommon.DOWNLOAD_REPORT_REASON;
                }
            }
            if (this.abc10075 != null) {
                int i13 = 0;
                while (true) {
                    String[] strArr13 = this.abc10075;
                    if (i13 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                        break;
                    }
                    strArr13[i13] = "string" + i13;
                    i13++;
                }
            }
            if (!TextUtils.isEmpty(this.abc10069)) {
                this.abc10069 += this.abc10069.length();
            }
            int[] iArr5 = this.abc10042;
            if (iArr5 != null) {
                iArr5[3] = 0;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 4372
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void init() {
        /*
            Method dump skipped, instructions count: 20454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.LogoCreateActivity.init():void");
    }

    private void moveEditTextToAt(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.binding.etInput.getLayoutParams();
        int i3 = 0;
        if (this.abc10060 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr = this.abc10060;
                if (i4 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i4] = "string" + i4;
                i4++;
            }
        }
        if (this.abc10038 < 0.9441369d) {
            this.abc10038 = 0.8837107f;
        }
        int i5 = 0;
        while (true) {
            int i6 = this.abc10019;
            if (i6 > 3) {
                i6 = 3;
            }
            if (i5 >= i6) {
                break;
            }
            if (this.abc10037 == null) {
                this.abc10037 = new ArrayList<>();
            }
            i5++;
        }
        this.abc10 = false;
        this.abc10072 = !this.abc10072;
        if (this.abc10030 == null) {
            this.abc10030 = new ArrayList<>();
        }
        if (this.abc10041 != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = this.abc10041;
                if (i7 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i7] = 6;
                i7++;
            }
        }
        layoutParams.topMargin = i;
        int[] iArr2 = this.abc10017;
        if (iArr2 != null) {
            iArr2[3] = 0;
        }
        if (this.abc10061 != null) {
            int i8 = 0;
            while (true) {
                int[] iArr3 = this.abc10061;
                if (i8 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i8] = 1;
                i8++;
            }
        }
        if (this.abc10042 != null) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.abc10042;
                if (i9 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i9] = 6;
                i9++;
            }
        }
        this.abc30 = 0;
        this.abc10072 = false;
        if (this.abc10073 != null) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.abc10073;
                if (i10 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i10] = "string" + i10;
                i10++;
            }
        }
        int[] iArr5 = this.abc10017;
        if (iArr5 != null) {
            iArr5[1] = 8;
        }
        layoutParams.leftMargin = i2;
        this.abc10076 = true;
        int[] iArr6 = this.abc10047;
        if (iArr6 != null) {
            iArr6[9] = 6;
        }
        this.abc10025 = 0.24476558f;
        this.abc38 = 0.7348522357818987d;
        if (this.abc10014.size() > 3) {
            this.abc10014.add(8);
        }
        this.abc10012 = InneractiveMediationDefs.GENDER_FEMALE;
        this.abc10064 = " to ";
        this.binding.etInput.setLayoutParams(layoutParams);
        ArrayList<Integer> arrayList = this.abc10078;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10078.remove(0);
        }
        if (this.abc10043 != null) {
            int i11 = 0;
            while (true) {
                String[] strArr3 = this.abc10043;
                if (i11 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i11] = "string" + i11;
                i11++;
            }
        }
        if (this.abc10036 == null) {
            this.abc10036 = new ArrayList<>();
        }
        if (this.abc36 != null) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.abc36;
                if (i12 >= strArr4.length) {
                    break;
                }
                strArr4[i12] = "string" + i12;
                if (this.abc1000.size() > 2) {
                    this.abc1000.add(3);
                }
                if (this.abc10014.size() > 8) {
                    this.abc10014.add(1);
                }
                if (this.abc10066 < 0.7070552d) {
                    this.abc10066 = 0.8556999f;
                }
                i12++;
            }
            String[] strArr5 = this.abc10060;
            if (strArr5 != null) {
                strArr5[3] = null;
            }
            this.abc10051 = 0.1086035651589825d;
            this.abc10046 = 0;
        }
        ArrayList<Integer> arrayList2 = this.abc10037;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc10037.remove(0);
        }
        if (this.abc10041 != null) {
            while (true) {
                int[] iArr7 = this.abc10041;
                if (i3 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                    break;
                }
                iArr7[i3] = 9;
                i3++;
            }
        }
        if (TextUtils.isEmpty(this.abc10069)) {
            return;
        }
        this.abc10069 += this.abc10069.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtFontStyle() {
        if (this.lastTextBold) {
            this.binding.includeFont.ivBold.setImageResource(R.mipmap.t_bold);
            ArrayList<Integer> arrayList = this.abc10078;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10078.remove(0);
            }
            if (this.abc10024.size() < 2) {
                this.abc10024.add("e prob");
            }
            if (this.abc1000.size() < 9) {
                this.abc1000.add(1);
            }
            this.abc4 = ((double) this.abc4) < 0.12399882d ? 0.27869982f : 0.92257535f;
            this.abc10064 = "of a";
            String[] strArr = this.abc10071;
            if (strArr != null) {
                strArr[1] = null;
            }
            this.abc10013 += 0.10870892f;
        } else {
            this.binding.includeFont.ivBold.setImageResource(R.mipmap.t_nbold);
            int[] iArr = this.abc10047;
            if (iArr != null) {
                iArr[6] = 0;
            }
            if (this.abc10052 > 0) {
                this.abc10052 = 5;
            }
            this.abc10065 = !this.abc10065;
            this.abc38 -= 0.3879303344354169d;
            this.abc10064 = "s defi";
            if (this.abc10010.size() < 0) {
                this.abc10010.add(3);
            }
            if (this.abc10036.size() > 7) {
                this.abc10036.add("asis,");
            }
        }
        if (!TextUtils.isEmpty(this.abc10062)) {
            this.abc10062 += this.abc10062.length();
        }
        if (this.abc10071 == null) {
            this.abc10071 = new String[10];
        }
        this.abc10040 = false;
        String[] strArr2 = this.abc0;
        if (strArr2 != null) {
            strArr2[7] = null;
            if (!TextUtils.isEmpty(this.abc10069)) {
                this.abc10069 += this.abc10069.length();
            }
            this.abc10027 *= 0.34891182f;
            String[] strArr3 = this.abc10023;
            if (strArr3 != null) {
                strArr3[8] = "ore people";
            }
        }
        this.abc10054 = "racter";
        this.abc1007 = ((double) this.abc1007) < 0.80242276d ? 0.7439519f : 0.4573744f;
        this.abc1008 = this.abc1008 > 2 ? 9 : 2;
        if (this.lastTextSkew) {
            this.binding.includeFont.ivItalic.setImageResource(R.mipmap.t_nitalic);
            if (this.abc10077 == null) {
                this.abc10077 = new String[10];
            }
            this.abc10020 = ((double) this.abc10020) < 0.9180594d ? 0.5287669f : 0.2125032f;
            this.abc1005 = this.abc1005 > 8 ? 7 : 5;
            this.abc30 -= 8;
            ArrayList<Integer> arrayList2 = this.abc10074;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10074.remove(0);
            }
            ArrayList<Integer> arrayList3 = this.abc1000;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1000.remove(0);
            }
            if (this.abc10030.size() > 4) {
                this.abc10030.add(8);
            }
        } else {
            this.binding.includeFont.ivItalic.setImageResource(R.mipmap.t_italic);
            this.abc10062 = "h";
            if (this.abc10077 == null) {
                this.abc10077 = new String[10];
            }
            int i = 0;
            while (true) {
                int i2 = this.abc10028;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                this.abc10059 = "Melvil";
                i++;
            }
            this.abc24 = 0.17789041880950585d;
            this.abc10027 += 0.29306924f;
            ArrayList<Integer> arrayList4 = this.abc10078;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc10078.remove(0);
            }
            this.abc10029 = !this.abc10029;
        }
        this.abc10038 = -this.abc10038;
        this.abc10020 = 0.010087371f;
        if (this.abc10021 == null) {
            this.abc10021 = new String[10];
        }
        if (!TextUtils.isEmpty(this.abc26)) {
            int length = this.abc26.length();
            this.abc10013 = 0.92469746f;
            this.abc10040 = true;
            if (!TextUtils.isEmpty(this.abc10012)) {
                this.abc10012 += this.abc10012.length();
            }
            this.abc26 += length;
            String[] strArr4 = this.abc10021;
            if (strArr4 != null) {
                strArr4[2] = null;
            }
            if (this.abc10036.size() > 6) {
                this.abc10036.add(" many ");
            }
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
        }
        if (this.abc10060 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr5 = this.abc10060;
                if (i3 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i3] = "string" + i3;
                i3++;
            }
        }
        if (this.abc10030 == null) {
            this.abc10030 = new ArrayList<>();
        }
        String[] strArr6 = this.abc10071;
        if (strArr6 != null) {
            strArr6[0] = null;
        }
        if (this.lastTextUnderline) {
            this.binding.includeFont.ivUnderscore.setImageResource(R.mipmap.t_nunderscore);
            this.abc10066 = Math.abs(this.abc10066);
            int[] iArr2 = this.abc10045;
            if (iArr2 != null) {
                iArr2[3] = 0;
            }
            if (this.abc10067.size() > 3) {
                this.abc10067.add("reputat");
            }
            int[] iArr3 = this.abc22;
            if (iArr3 != null) {
                iArr3[7] = 0;
                this.abc10033 = !this.abc10033;
                String[] strArr7 = this.abc10073;
                if (strArr7 != null) {
                    strArr7[8] = " You’re";
                }
                this.abc10032 = !this.abc10032;
            }
            int[] iArr4 = this.abc10017;
            if (iArr4 != null) {
                iArr4[4] = 8;
            }
            if (this.abc10031 == null) {
                this.abc10031 = new String[10];
            }
            if (!TextUtils.isEmpty(this.abc10012)) {
                this.abc10012 += this.abc10012.length();
            }
        } else {
            this.binding.includeFont.ivUnderscore.setImageResource(R.mipmap.t_underscore);
            this.abc10072 = !this.abc10072;
            if (this.abc10070.size() > 1) {
                this.abc10070.add("ead i");
            }
            this.abc10028 = 3;
            int[] iArr5 = this.abc34;
            if (iArr5 != null) {
                iArr5[5] = 0;
                this.abc10049 = true;
                this.abc10051 = this.abc10051 > 0.06189814370753133d ? 0.1966958552901209d : 0.12097566331386178d;
                String[] strArr8 = this.abc10077;
                if (strArr8 != null) {
                    strArr8[7] = null;
                }
            }
            if (this.abc10048 == null) {
                this.abc10048 = new ArrayList<>();
            }
            this.abc10025 = ((double) this.abc10025) > 0.9752309d ? 0.69658077f : 0.29035646f;
            this.abc10035 = true;
        }
        if (this.abc10061 != null) {
            int i4 = 0;
            while (true) {
                int[] iArr6 = this.abc10061;
                if (i4 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                    break;
                }
                iArr6[i4] = 9;
                i4++;
            }
        }
        int[] iArr7 = this.abc10045;
        if (iArr7 != null) {
            iArr7[4] = 1;
        }
        if (this.abc10024 == null) {
            this.abc10024 = new ArrayList<>();
        }
        if (this.abc15 != null) {
            int i5 = 0;
            while (true) {
                int[] iArr8 = this.abc15;
                if (i5 >= iArr8.length) {
                    break;
                }
                iArr8[i5] = 2;
                this.abc10032 = !this.abc10032;
                String[] strArr9 = this.abc10075;
                if (strArr9 != null) {
                    strArr9[1] = null;
                }
                this.abc10040 = false;
                i5++;
            }
            if (this.abc10038 > 0.13630682d) {
                this.abc10038 = 0.37357742f;
            }
            String[] strArr10 = this.abc1001;
            if (strArr10 != null) {
                strArr10[8] = "o read i";
            }
            if (this.abc10057 == null) {
                this.abc10057 = new String[10];
            }
        }
        ArrayList<String> arrayList5 = this.abc10018;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc10018.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        this.abc10028 *= 2;
    }

    private void setData() {
        JSONArray jSONArray;
        int i;
        LogoDesignEntity logoDesignEntity = (LogoDesignEntity) getIntent().getSerializableExtra("design");
        String[] strArr = this.abc10031;
        if (strArr != null) {
            strArr[5] = null;
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1005 = 2;
        this.abc14 = this.abc14 < 0.6067247285902522d ? 0.30569997945935834d : 0.48165366415023114d;
        String[] strArr2 = this.abc10016;
        if (strArr2 != null) {
            strArr2[4] = "a";
        }
        this.abc10063 = Math.abs(this.abc10063);
        this.abc10032 = !this.abc10032;
        if (logoDesignEntity != null) {
            try {
                LogoDesignSaveEntity logoDesignSaveEntity = new LogoDesignSaveEntity();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(logoDesignEntity.m249a(), "data.json"))));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                JSONObject jSONObject = new JSONObject(sb.toString());
                logoDesignSaveEntity.m159w(logoDesignEntity.m248b());
                if (jSONObject.has("backgroundImage")) {
                    String string = jSONObject.getString("backgroundImage");
                    if (!TextUtils.isEmpty(string)) {
                        logoDesignSaveEntity.m167o(BitmapFactory.decodeFile(logoDesignEntity.m249a().getAbsolutePath() + File.separator + string));
                    }
                }
                if (jSONObject.has("backgroundColor")) {
                    logoDesignSaveEntity.m168n(Integer.valueOf(jSONObject.getInt("backgroundColor")));
                }
                if (jSONObject.has("clippingType")) {
                    logoDesignSaveEntity.m164r(Integer.valueOf(jSONObject.getInt("clippingType")));
                }
                logoDesignSaveEntity.m162t(jSONObject.getInt("clippingX"));
                logoDesignSaveEntity.m160v(jSONObject.getInt("clippingY"));
                logoDesignSaveEntity.m163s(jSONObject.getInt("clippingW"));
                logoDesignSaveEntity.m166p(jSONObject.getInt("clippingH"));
                logoDesignSaveEntity.m165q(jSONObject.getInt("clippingRx"));
                JSONArray jSONArray2 = jSONObject.getJSONArray("array");
                int length = jSONArray2.length();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject2.getString("type");
                    float f = (float) jSONObject2.getDouble("x");
                    float f2 = (float) jSONObject2.getDouble("y");
                    int i3 = jSONObject2.getInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                    int i4 = jSONObject2.getInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                    boolean z = jSONObject2.getBoolean("isHide");
                    boolean z2 = jSONObject2.getBoolean("isLock");
                    if ("image".equals(string2)) {
                        String string3 = jSONObject2.getString("bitmap");
                        StringBuilder sb2 = new StringBuilder();
                        jSONArray = jSONArray2;
                        sb2.append(logoDesignEntity.m249a().getAbsolutePath());
                        sb2.append(File.separator);
                        sb2.append(string3);
                        LogoImageSaveEntity logoImageSaveEntity = new LogoImageSaveEntity(f, f2, i3, i4, BitmapFactory.decodeFile(sb2.toString()));
                        logoImageSaveEntity.m27w(jSONObject2.getBoolean("isAdjustVertically"));
                        logoImageSaveEntity.m28v(jSONObject2.getBoolean("isAdjustHorizontal"));
                        if (jSONObject2.has("fillingColor")) {
                            logoImageSaveEntity.m25y(Integer.valueOf(jSONObject2.getInt("fillingColor")));
                        }
                        logoImageSaveEntity.m26x((float) jSONObject2.getDouble("angle"));
                        logoImageSaveEntity.m24z(jSONObject2.getInt("opacity"));
                        logoImageSaveEntity.m806j(z);
                        logoImageSaveEntity.m805k(z2);
                        arrayList.add(logoImageSaveEntity);
                    } else {
                        jSONArray = jSONArray2;
                        LogoTextSaveEntity logoTextSaveEntity = new LogoTextSaveEntity(f, f2, i3, i4, jSONObject2.getString("text"));
                        logoTextSaveEntity.m1738x(jSONObject2.getInt("color"));
                        logoTextSaveEntity.m1749B((float) jSONObject2.getDouble("textSize"));
                        logoTextSaveEntity.m1739w(jSONObject2.getBoolean("isBold"));
                        logoTextSaveEntity.m1748C(jSONObject2.getBoolean("isUnderline"));
                        logoTextSaveEntity.m1736z(jSONObject2.getBoolean("isSkew"));
                        if (jSONObject2.has("fontType")) {
                            logoTextSaveEntity.m1737y(jSONObject2.getString("fontType"));
                        }
                        logoTextSaveEntity.m806j(z);
                        logoTextSaveEntity.m805k(z2);
                        arrayList.add(logoTextSaveEntity);
                    }
                    i2++;
                    jSONArray2 = jSONArray;
                }
                logoDesignSaveEntity.m158x(arrayList);
                this.binding.drawview.setLogoDesignSaveEntity(logoDesignSaveEntity);
                boolean m9081x = this.binding.drawview.m9081x();
                this.isCanSvae = m9081x;
                if (m9081x) {
                    this.binding.tvSave.setBackgroundResource(R.drawable.shape_btn_save_radius);
                } else {
                    this.binding.tvSave.setBackgroundResource(R.drawable.shape_btn_save_radius2);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        String[] strArr3 = this.abc10075;
        if (strArr3 != null) {
            strArr3[5] = "obably mor";
        }
        ArrayList<String> arrayList2 = this.abc10048;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            i = 0;
        } else {
            i = 0;
            this.abc10048.remove(0);
        }
        ArrayList<Integer> arrayList3 = this.abc10010;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc10010.remove(i);
        }
        this.abc38 = 0.7473198563924751d;
        this.abc10029 = true;
        ArrayList<Integer> arrayList4 = this.abc10037;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10037.remove(0);
        }
        this.abc10063 = Math.abs(this.abc10063);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFirstMenu() {
        showView2(this.binding.toolbar, new View[0]);
        this.abc10020 = 0.6890276f;
        if (this.abc10023 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc10023;
                if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        this.abc10026 = 0.7010244f;
        showView3(this.binding.ivLayer, new View[0]);
        ArrayList<Integer> arrayList = this.abc10034;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10034.remove(0);
        }
        this.abc10058 = 0.4778591154549646d;
        if (this.abc10015 == null) {
            this.abc10015 = new String[10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showView(View view, View... viewArr) {
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 123) {
            String[] strArr = this.abc10073;
            if (strArr != null) {
                strArr[3] = "s";
            }
            if (this.abc10034.size() > 4) {
                this.abc10034.add(1);
            }
            if (this.abc10014 == null) {
                this.abc10014 = new ArrayList<>();
            }
            int i = 0;
            if (this.abc11.size() > 9) {
                this.abc11.add("在添");
                this.abc10028 = 4;
                if (this.abc1000.size() > 7) {
                    this.abc1000.add(0);
                }
                this.abc10065 = false;
            }
            this.abc10040 = !this.abc10040;
            this.abc10063 = 0.7158854f;
            if (this.abc10074.size() < 5) {
                this.abc10074.add(7);
            }
            view.setTag(123);
            this.abc10049 = !this.abc10049;
            if (this.abc10042 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.abc10042;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 0;
                    i2++;
                }
            }
            int[] iArr2 = this.abc10061;
            if (iArr2 != null) {
                iArr2[4] = 0;
            }
            if (this.abc15 == null) {
                this.abc15 = new int[10];
                if (this.abc10015 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr2 = this.abc10015;
                        if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i3] = "string" + i3;
                        i3++;
                    }
                }
                if (this.abc10034.size() < 5) {
                    this.abc10034.add(5);
                }
                this.abc10032 = !this.abc10032;
            }
            this.abc10066 = 0.2664817f;
            String[] strArr3 = this.abc10071;
            if (strArr3 != null) {
                strArr3[6] = "k. For a b";
            }
            this.abc10069 = "fore pe";
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            if (this.abc10060 == null) {
                this.abc10060 = new String[10];
            }
            String[] strArr4 = this.abc10031;
            if (strArr4 != null) {
                strArr4[9] = "ad ";
            }
            this.abc1008 = 8;
            this.abc29 = "a";
            this.abc1005 = 0;
            this.abc1008 = 7;
            if (this.abc10039.size() > 7) {
                this.abc10039.add(" a bo");
            }
            translateAnimation.setDuration(300L);
            this.abc10029 = false;
            if (this.abc10070.size() < 2) {
                this.abc10070.add("ing only u");
            }
            if (!TextUtils.isEmpty(this.abc10059)) {
                this.abc10059 += this.abc10059.length();
            }
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9489l2(view));
            this.abc10066 = -this.abc10066;
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
            if (this.abc10030.size() < 1) {
                this.abc10030.add(9);
            }
            String[] strArr5 = this.abc31;
            if (strArr5 != null) {
                strArr5[9] = null;
                ArrayList<Integer> arrayList = this.abc10037;
                if (arrayList == null && arrayList.size() > 0) {
                    this.abc10037.remove(0);
                }
                String[] strArr6 = this.abc10060;
                if (strArr6 != null) {
                    strArr6[3] = null;
                }
                if (this.abc10056 == null) {
                    this.abc10056 = new ArrayList<>();
                }
            }
            if (this.abc10061 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr3 = this.abc10061;
                    if (i4 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i4] = 6;
                    i4++;
                }
            }
            if (this.abc10023 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr7 = this.abc10023;
                    if (i5 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i5] = "string" + i5;
                    i5++;
                }
            }
            if (this.abc10015 == null) {
                this.abc10015 = new String[10];
            }
            view.setEnabled(false);
            ArrayList<Integer> arrayList2 = this.abc10074;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10074.remove(0);
            }
            if (this.abc10036.size() < 1) {
                this.abc10036.add("sn’t rec");
            }
            if (!TextUtils.isEmpty(this.abc10012)) {
                this.abc10012 += this.abc10012.length();
            }
            int[] iArr4 = this.abc34;
            if (iArr4 != null) {
                iArr4[8] = 2;
                if (this.abc10077 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr8 = this.abc10077;
                        if (i6 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i6] = "string" + i6;
                        i6++;
                    }
                }
                if (this.abc10048 == null) {
                    this.abc10048 = new ArrayList<>();
                }
                if (!TextUtils.isEmpty(this.abc10012)) {
                    this.abc10012 += this.abc10012.length();
                }
            }
            ArrayList<Integer> arrayList3 = this.abc10034;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10034.remove(0);
            }
            this.abc10049 = false;
            if (this.abc10045 == null) {
                this.abc10045 = new int[10];
            }
            for (View view2 : viewArr) {
                view2.setVisibility(0);
                if (this.abc10031 == null) {
                    this.abc10031 = new String[10];
                }
                String[] strArr9 = this.abc10071;
                if (strArr9 != null) {
                    strArr9[5] = " in th";
                }
                this.abc10062 = "t";
                if (this.abc0 == null) {
                    this.abc0 = new String[10];
                    if (this.abc10039.size() < 0) {
                        this.abc10039.add("ing");
                    }
                    this.abc10049 = !this.abc10049;
                    int i7 = 0;
                    while (true) {
                        int i8 = this.abc1005;
                        if (i8 > 3) {
                            i8 = 3;
                        }
                        if (i7 >= i8) {
                            break;
                        }
                        String[] strArr10 = this.abc10075;
                        if (strArr10 != null) {
                            strArr10[0] = null;
                        }
                        i7++;
                    }
                }
                if (this.abc10063 > 0.1665873d) {
                    this.abc10063 = 0.47725523f;
                }
                if (!TextUtils.isEmpty(this.abc10062)) {
                    this.abc10062 += this.abc10062.length();
                }
                ArrayList<Integer> arrayList4 = this.abc10074;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    this.abc10074.remove(0);
                }
            }
            if (this.abc10016 == null) {
                this.abc10016 = new String[10];
            }
            this.abc10020 = ((double) this.abc10020) > 0.97872645d ? 0.33433282f : 0.96294636f;
            if (!TextUtils.isEmpty(this.abc10054)) {
                this.abc10054 += this.abc10054.length();
            }
            String[] strArr11 = this.abc36;
            if (strArr11 != null) {
                strArr11[3] = "粉丝怀旧";
                this.abc10020 = Math.abs(this.abc10020);
                ArrayList<Integer> arrayList5 = this.abc1000;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    this.abc1000.remove(0);
                }
                int[] iArr5 = this.abc10042;
                if (iArr5 != null) {
                    iArr5[2] = 5;
                }
            }
            this.abc10032 = false;
            this.abc10076 = true;
            if (this.abc10022 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr12 = this.abc10022;
                    if (i9 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                        break;
                    }
                    strArr12[i9] = "string" + i9;
                    i9++;
                }
            }
            view.setVisibility(0);
            this.abc10072 = false;
            if (this.abc10036.size() > 7) {
                this.abc10036.add("a");
            }
            String[] strArr13 = this.abc10073;
            if (strArr13 != null) {
                strArr13[4] = "ry, it’s m";
            }
            String[] strArr14 = this.abc19;
            if (strArr14 != null) {
                strArr14[1] = null;
                int[] iArr6 = this.abc10017;
                if (iArr6 != null) {
                    iArr6[2] = 0;
                }
                int i10 = 0;
                while (true) {
                    int i11 = this.abc10019;
                    if (i11 > 3) {
                        i11 = 3;
                    }
                    if (i10 >= i11) {
                        break;
                    }
                    int[] iArr7 = this.abc10050;
                    if (iArr7 != null) {
                        iArr7[0] = 0;
                    }
                    i10++;
                }
                ArrayList<String> arrayList6 = this.abc10018;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    this.abc10018.remove(0);
                }
            }
            this.abc10040 = !this.abc10040;
            if (this.abc10071 == null) {
                this.abc10071 = new String[10];
            }
            String[] strArr15 = this.abc10031;
            if (strArr15 != null) {
                strArr15[9] = null;
            }
            view.startAnimation(translateAnimation);
            String[] strArr16 = this.abc10077;
            if (strArr16 != null) {
                strArr16[6] = null;
            }
            this.abc10038 = 0.7232398f;
            this.abc10054 = "dern nov";
            if (this.abc21 == null) {
                this.abc21 = new ArrayList<>();
                this.abc10038 = ((double) this.abc10038) < 0.56760174d ? 0.90248317f : 0.81596303f;
                if (this.abc10070 == null) {
                    this.abc10070 = new ArrayList<>();
                }
                if (this.abc10011 == null) {
                    this.abc10011 = new ArrayList<>();
                }
            }
            if (this.abc10021 != null) {
                while (true) {
                    String[] strArr17 = this.abc10021;
                    if (i >= (strArr17.length > 3 ? 3 : strArr17.length)) {
                        break;
                    }
                    strArr17[i] = "string" + i;
                    i++;
                }
            }
            this.abc10051 = this.abc10051 < 0.9946957093684816d ? 0.5687664399638899d : 0.3564299474602154d;
            this.abc10035 = true;
        }
    }

    private void showView2(View view, View... viewArr) {
        char c;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 123) {
            this.abc10040 = !this.abc10040;
            int[] iArr = this.abc10050;
            if (iArr != null) {
                iArr[8] = 4;
            }
            if (this.abc10030 == null) {
                this.abc10030 = new ArrayList<>();
            }
            if (this.abc11.size() > 9) {
                this.abc11.add("在添");
                int[] iArr2 = this.abc10047;
                if (iArr2 != null) {
                    iArr2[6] = 0;
                }
                if (this.abc10030.size() > 7) {
                    this.abc10030.add(0);
                }
                ArrayList<String> arrayList = this.abc10036;
                if (arrayList != null && arrayList.size() > 0) {
                    this.abc10036.remove(0);
                }
            }
            if (this.abc10022 == null) {
                this.abc10022 = new String[10];
            }
            this.abc10035 = false;
            if (this.abc10077 == null) {
                this.abc10077 = new String[10];
            }
            view.setTag(123);
            if (this.abc10021 == null) {
                this.abc10021 = new String[10];
            }
            this.abc10038 *= 0.43946356f;
            this.abc10033 = false;
            if (this.abc15 == null) {
                this.abc15 = new int[10];
                if (this.abc10066 < 0.42277944d) {
                    this.abc10066 = 0.38846588f;
                }
                this.abc10029 = false;
                this.abc10058 = 0.6111753696838129d;
            }
            if (this.abc10011.size() < 2) {
                this.abc10011.add(2);
            }
            if (this.abc10022 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.abc10022;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            this.abc10066 = 0.5061718f;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            this.abc10066 += 0.70255625f;
            if (this.abc10043 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.abc10043;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            if (this.abc10023 == null) {
                this.abc10023 = new String[10];
            }
            this.abc29 = "a";
            this.abc10026 *= 0.87989515f;
            String[] strArr3 = this.abc10015;
            if (strArr3 != null) {
                strArr3[5] = null;
            }
            this.abc1007 = 0.100996256f;
            translateAnimation.setDuration(300L);
            this.abc10072 = false;
            this.abc10058 = 0.8931130768512112d;
            String[] strArr4 = this.abc10015;
            if (strArr4 != null) {
                strArr4[4] = null;
            }
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9497n2(view));
            String[] strArr5 = this.abc10060;
            if (strArr5 != null) {
                strArr5[7] = null;
            }
            String[] strArr6 = this.abc10057;
            if (strArr6 != null) {
                strArr6[7] = null;
            }
            if (this.abc10036.size() < 3) {
                this.abc10036.add("decades b");
            }
            String[] strArr7 = this.abc31;
            if (strArr7 != null) {
                strArr7[9] = null;
                if (this.abc10078 == null) {
                    this.abc10078 = new ArrayList<>();
                }
                this.abc1004 = true;
                if (!TextUtils.isEmpty(this.abc10064)) {
                    this.abc10064 += this.abc10064.length();
                }
            }
            this.abc10076 = false;
            int[] iArr3 = this.abc10045;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            this.abc10040 = false;
            view.setEnabled(false);
            ArrayList<Integer> arrayList2 = this.abc10030;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10030.remove(0);
            }
            if (this.abc10037.size() < 5) {
                this.abc10037.add(3);
            }
            this.abc10026 = 0.67514014f;
            int[] iArr4 = this.abc34;
            if (iArr4 != null) {
                iArr4[8] = 2;
                if (this.abc10030 == null) {
                    this.abc10030 = new ArrayList<>();
                }
                this.abc10032 = !this.abc10032;
                if (this.abc1001 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr8 = this.abc1001;
                        if (i3 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i3] = "string" + i3;
                        i3++;
                    }
                }
            }
            this.abc10028 = this.abc10028 < 4 ? 9 : 4;
            if (this.abc10024.size() > 3) {
                this.abc10024.add("ce i");
            }
            if (!TextUtils.isEmpty(this.abc10059)) {
                this.abc10059 += this.abc10059.length();
            }
            for (View view2 : viewArr) {
                view2.setVisibility(0);
                this.abc10076 = true;
                if (this.abc10016 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr9 = this.abc10016;
                        if (i4 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                            break;
                        }
                        strArr9[i4] = "string" + i4;
                        i4++;
                    }
                }
                this.abc10028 -= 5;
                if (this.abc0 == null) {
                    this.abc0 = new String[10];
                    this.abc10026 += 0.42661196f;
                    String[] strArr10 = this.abc10057;
                    c = 6;
                    if (strArr10 != null) {
                        strArr10[6] = null;
                    }
                    this.abc10029 = false;
                } else {
                    c = 6;
                }
                this.abc10032 = false;
                String[] strArr11 = this.abc10022;
                if (strArr11 != null) {
                    strArr11[c] = "is ";
                }
                int[] iArr5 = this.abc10061;
                if (iArr5 != null) {
                    iArr5[7] = 0;
                }
            }
            if (this.abc10055 == null) {
                this.abc10055 = new ArrayList<>();
            }
            this.abc10068 = Math.abs(this.abc10068);
            String[] strArr12 = this.abc10077;
            if (strArr12 != null) {
                strArr12[7] = "y m";
            }
            String[] strArr13 = this.abc36;
            if (strArr13 != null) {
                strArr13[3] = "粉丝怀旧";
                if (this.abc10037.size() < 4) {
                    this.abc10037.add(4);
                }
                this.abc10072 = !(!this.abc10072);
            }
            if (this.abc10018.size() < 5) {
                this.abc10018.add("ades");
            }
            if (this.abc10017 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr6 = this.abc10017;
                    if (i5 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i5] = 2;
                    i5++;
                }
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            view.setVisibility(0);
            this.abc10054 = " great ";
            ArrayList<String> arrayList3 = this.abc10048;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc10048.remove(0);
            }
            this.abc10029 = !this.abc10029;
            String[] strArr14 = this.abc19;
            if (strArr14 != null) {
                strArr14[1] = null;
                ArrayList<String> arrayList4 = this.abc10024;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.abc10024.remove(0);
                }
                int i6 = 0;
                while (true) {
                    int i7 = this.abc10052;
                    if (i7 > 3) {
                        i7 = 3;
                    }
                    if (i6 >= i7) {
                        break;
                    }
                    this.abc10027 = ((double) this.abc10027) < 0.4126019d ? 0.19426161f : 0.8797118f;
                    i6++;
                }
                if (!TextUtils.isEmpty(this.abc10012)) {
                    this.abc10012 += this.abc10012.length();
                }
            }
            ArrayList<String> arrayList5 = this.abc10024;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.abc10024.remove(0);
            }
            if (this.abc10010 == null) {
                this.abc10010 = new ArrayList<>();
            }
            String[] strArr15 = this.abc10073;
            if (strArr15 != null) {
                strArr15[4] = null;
            }
            view.startAnimation(translateAnimation);
            this.abc1004 = true;
            if (this.abc10074.size() > 4) {
                this.abc10074.add(8);
            }
            String[] strArr16 = this.abc10016;
            if (strArr16 != null) {
                strArr16[7] = " plot ";
            }
            if (this.abc21 == null) {
                this.abc21 = new ArrayList<>();
                this.abc10026 = ((double) this.abc10026) < 0.28790855d ? 0.12817043f : 0.70462f;
                if (this.abc10018.size() < 2) {
                    this.abc10018.add(" before ");
                }
                if (this.abc10039.size() > 2) {
                    this.abc10039.add("l tha");
                }
            }
            if (this.abc10011.size() < 6) {
                this.abc10011.add(1);
            }
            this.abc10033 = !this.abc10033;
            if (this.abc1000.size() > 8) {
                this.abc1000.add(4);
            }
        }
    }

    private void showView3(View view, View... viewArr) {
        int i;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 123) {
            this.abc1007 *= 0.9998793f;
            if (this.abc10037.size() < 7) {
                this.abc10037.add(2);
            }
            this.abc10028 = 2;
            if (this.abc11.size() > 9) {
                this.abc11.add("在添");
                ArrayList<String> arrayList = this.abc10048;
                if (arrayList != null && arrayList.size() > 0) {
                    this.abc10048.remove(0);
                }
                if (this.abc10030 == null) {
                    this.abc10030 = new ArrayList<>();
                }
                this.abc10065 = !this.abc10065;
            }
            this.abc10025 = ((double) this.abc10025) > 0.08513117d ? 0.05918479f : 0.09181744f;
            if (this.abc10055 == null) {
                this.abc10055 = new ArrayList<>();
            }
            if (this.abc10036.size() > 0) {
                this.abc10036.add("a S");
            }
            view.setTag(123);
            if (this.abc10022 == null) {
                this.abc10022 = new String[10];
            }
            this.abc10025 = 0.09118807f;
            String[] strArr = this.abc10071;
            if (strArr != null) {
                strArr[7] = "every yea";
            }
            if (this.abc15 == null) {
                this.abc15 = new int[10];
                ArrayList<String> arrayList2 = this.abc10024;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.abc10024.remove(0);
                }
                this.abc10065 = true;
                if (this.abc10025 > 0.84369236d) {
                    this.abc10025 = 0.12905914f;
                }
            }
            if (this.abc10077 == null) {
                this.abc10077 = new String[10];
            }
            this.abc10035 = true;
            ArrayList<Integer> arrayList3 = this.abc10074;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10074.remove(0);
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, -2.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            if (this.abc10052 < 0) {
                this.abc10052 = 1;
            }
            this.abc1008 *= 7;
            this.abc29 = "a";
            int[] iArr = this.abc10017;
            if (iArr != null) {
                iArr[9] = 2;
            }
            this.abc10059 = "l on ";
            if (this.abc10051 > 0.5759659441445908d) {
                this.abc10051 = 0.22831098139111294d;
            }
            translateAnimation.setDuration(300L);
            this.abc1004 = false;
            this.abc10029 = !this.abc10029;
            if (this.abc10041 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.abc10041;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 9;
                    i2++;
                }
            }
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9505p2(view));
            this.abc10029 = false;
            if (this.abc10057 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.abc10057;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    i3++;
                }
            }
            if (this.abc10016 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr3 = this.abc10016;
                    if (i4 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i4] = "string" + i4;
                    i4++;
                }
            }
            String[] strArr4 = this.abc31;
            if (strArr4 != null) {
                strArr4[9] = null;
                String[] strArr5 = this.abc10016;
                if (strArr5 != null) {
                    strArr5[9] = null;
                }
                if (this.abc10045 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr3 = this.abc10045;
                        if (i5 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                            break;
                        }
                        iArr3[i5] = 7;
                        i5++;
                    }
                }
                this.abc10066 = 0.30817282f;
            }
            if (this.abc10036.size() > 9) {
                this.abc10036.add(" Rosetta ");
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            if (this.abc10014.size() > 5) {
                this.abc10014.add(9);
            }
            view.setEnabled(false);
            String[] strArr6 = this.abc1001;
            if (strArr6 != null) {
                strArr6[6] = "ed re";
            }
            ArrayList<String> arrayList4 = this.abc10048;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc10048.remove(0);
            }
            int[] iArr4 = this.abc10017;
            if (iArr4 != null) {
                iArr4[0] = 3;
            }
            int[] iArr5 = this.abc34;
            if (iArr5 != null) {
                iArr5[8] = 2;
                String[] strArr7 = this.abc10075;
                if (strArr7 != null) {
                    strArr7[1] = "ok ";
                }
                this.abc10028 = 1;
                ArrayList<Integer> arrayList5 = this.abc10074;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    this.abc10074.remove(0);
                }
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            ArrayList<String> arrayList6 = this.abc1003;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1003.remove(0);
            }
            ArrayList<Integer> arrayList7 = this.abc10037;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.abc10037.remove(0);
            }
            for (View view2 : viewArr) {
                view2.setVisibility(0);
                if (this.abc10024.size() < 6) {
                    this.abc10024.add("ed t");
                }
                this.abc10076 = !this.abc10076;
                this.abc1004 = false;
                if (this.abc0 == null) {
                    this.abc0 = new String[10];
                    int[] iArr6 = this.abc10061;
                    if (iArr6 != null) {
                        iArr6[3] = 7;
                    }
                    this.abc1007 += 0.91548693f;
                    ArrayList<String> arrayList8 = this.abc10039;
                    if (arrayList8 != null && arrayList8.size() > 0) {
                        this.abc10039.remove(0);
                    }
                }
                if (this.abc1008 > 0) {
                    this.abc1008 = 1;
                }
                int[] iArr7 = this.abc10050;
                if (iArr7 != null) {
                    iArr7[2] = 0;
                }
                String[] strArr8 = this.abc10043;
                if (strArr8 != null) {
                    strArr8[3] = "ery y";
                }
            }
            if (this.abc10034 == null) {
                this.abc10034 = new ArrayList<>();
            }
            if (this.abc10075 != null) {
                int i6 = 0;
                while (true) {
                    String[] strArr9 = this.abc10075;
                    if (i6 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                        break;
                    }
                    strArr9[i6] = "string" + i6;
                    i6++;
                }
            }
            this.abc10064 = "rary ";
            String[] strArr10 = this.abc36;
            if (strArr10 != null) {
                strArr10[3] = "粉丝怀旧";
                int i7 = 0;
                while (true) {
                    i = this.abc10028;
                    if (i7 >= (i > 3 ? 3 : i)) {
                        break;
                    }
                    if (i > 0) {
                        this.abc10028 = 6;
                    }
                    i7++;
                }
                this.abc10063 *= 0.43275154f;
                if (i > 0) {
                    this.abc10028 = 8;
                }
            }
            this.abc10020 += 0.96825916f;
            if (this.abc10071 == null) {
                this.abc10071 = new String[10];
            }
            String[] strArr11 = this.abc10073;
            if (strArr11 != null) {
                strArr11[5] = null;
            }
            view.setVisibility(0);
            int[] iArr8 = this.abc10017;
            if (iArr8 != null) {
                iArr8[9] = 8;
            }
            if (this.abc1001 != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr12 = this.abc1001;
                    if (i8 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                        break;
                    }
                    strArr12[i8] = "string" + i8;
                    i8++;
                }
            }
            if (this.abc1001 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr13 = this.abc1001;
                    if (i9 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                        break;
                    }
                    strArr13[i9] = "string" + i9;
                    i9++;
                }
            }
            String[] strArr14 = this.abc19;
            if (strArr14 != null) {
                strArr14[1] = null;
                this.abc10054 = " that in m";
                if (this.abc10034 == null) {
                    this.abc10034 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList9 = this.abc10014;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    this.abc10014.remove(0);
                }
            }
            ArrayList<Integer> arrayList10 = this.abc10030;
            if (arrayList10 == null && arrayList10.size() > 0) {
                this.abc10030.remove(0);
            }
            ArrayList<String> arrayList11 = this.abc10067;
            if (arrayList11 != null && arrayList11.size() > 0) {
                this.abc10067.remove(0);
            }
            if (this.abc10043 != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr15 = this.abc10043;
                    if (i10 >= (strArr15.length > 3 ? 3 : strArr15.length)) {
                        break;
                    }
                    strArr15[i10] = "string" + i10;
                    i10++;
                }
            }
            view.startAnimation(translateAnimation);
            if (this.abc10078.size() > 2) {
                this.abc10078.add(4);
            }
            if (this.abc10011.size() < 9) {
                this.abc10011.add(5);
            }
            this.abc10040 = !this.abc10040;
            if (this.abc21 == null) {
                this.abc21 = new ArrayList<>();
                if (this.abc10037 == null) {
                    this.abc10037 = new ArrayList<>();
                }
                this.abc1008 = 8;
                this.abc1008 = 0;
            }
            if (this.abc10011.size() > 2) {
                this.abc10011.add(4);
            }
            if (!TextUtils.isEmpty(this.abc10064)) {
                this.abc10064 += this.abc10064.length();
            }
            if (this.abc10077 == null) {
                this.abc10077 = new String[10];
            }
        }
    }

    private void showViewBySelf(View view) {
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 1234) {
            if (this.abc10031 == null) {
                this.abc10031 = new String[10];
            }
            String[] strArr = this.abc10016;
            if (strArr != null) {
                strArr[8] = " you thi";
            }
            this.abc10025 = ((double) this.abc10025) < 0.24841446d ? 0.51019746f : 0.87987643f;
            if (this.abc38 < 0.24472915857551703d) {
                this.abc38 = 0.2729175777273195d;
                this.abc10028 -= 9;
                int[] iArr = this.abc10045;
                if (iArr != null) {
                    iArr[1] = 0;
                }
                this.abc10038 = ((double) this.abc10038) < 0.36459804d ? 0.70726496f : 0.38918632f;
            }
            this.abc10069 = "e, th";
            this.abc10059 = "what a mod";
            if (this.abc10043 == null) {
                this.abc10043 = new String[10];
            }
            view.setTag(1234);
            int i = 0;
            while (true) {
                int i2 = this.abc10052;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                if (this.abc10011 == null) {
                    this.abc10011 = new ArrayList<>();
                }
                i++;
            }
            if (this.abc10067.size() > 3) {
                this.abc10067.add("rar");
            }
            if (this.abc10046 < 0) {
                this.abc10046 = 2;
            }
            ArrayList<Integer> arrayList = this.abc2;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc2.remove(0);
                if (this.abc10078 == null) {
                    this.abc10078 = new ArrayList<>();
                }
                if (this.abc10017 == null) {
                    this.abc10017 = new int[10];
                }
                this.abc10072 = !this.abc10072;
            }
            int[] iArr2 = this.abc1002;
            if (iArr2 != null) {
                iArr2[9] = 0;
            }
            if (this.abc10023 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.abc10023;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    i3++;
                }
            }
            this.abc1007 = 0.7830928f;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.abc10033 = !this.abc10033;
            int[] iArr3 = this.abc10045;
            if (iArr3 != null) {
                iArr3[3] = 0;
            }
            String[] strArr3 = this.abc1001;
            if (strArr3 != null) {
                strArr3[1] = "ide and";
            }
            this.abc7 = 0.6645113f;
            ArrayList<Integer> arrayList2 = this.abc10074;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10074.remove(0);
            }
            if (this.abc10073 == null) {
                this.abc10073 = new String[10];
            }
            this.abc1005 = this.abc1005 > 8 ? 4 : 7;
            translateAnimation.setDuration(300L);
            ArrayList<Integer> arrayList3 = this.abc10034;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10034.remove(0);
            }
            if (this.abc10077 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr4 = this.abc10077;
                    if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i4] = "string" + i4;
                    i4++;
                }
            }
            this.abc10063 = -this.abc10063;
            if (this.abc11 == null) {
                this.abc11 = new ArrayList<>();
                String[] strArr5 = this.abc10043;
                if (strArr5 != null) {
                    strArr5[2] = " more fa";
                }
                if (this.abc10022 != null) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr6 = this.abc10022;
                        if (i5 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                            break;
                        }
                        strArr6[i5] = "string" + i5;
                        i5++;
                    }
                }
                this.abc10076 = false;
            }
            this.abc10072 = !(!this.abc10072);
            this.abc1005 = 4;
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9485k2(view));
            int[] iArr4 = this.abc10047;
            if (iArr4 != null) {
                iArr4[2] = 5;
            }
            if (this.abc10021 == null) {
                this.abc10021 = new String[10];
            }
            if (this.abc10060 != null) {
                int i6 = 0;
                while (true) {
                    String[] strArr7 = this.abc10060;
                    if (i6 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i6] = "string" + i6;
                    i6++;
                }
            }
            int[] iArr5 = this.abc15;
            if (iArr5 != null) {
                iArr5[0] = 7;
                if (this.abc10071 == null) {
                    this.abc10071 = new String[10];
                }
                this.abc10058 -= 0.48433513328514d;
                this.abc1007 = Math.abs(this.abc1007);
            }
            if (this.abc10046 < 0) {
                this.abc10046 = 4;
            }
            int[] iArr6 = this.abc10045;
            if (iArr6 != null) {
                iArr6[5] = 1;
            }
            String[] strArr8 = this.abc1001;
            if (strArr8 != null) {
                strArr8[4] = "lle’s nove";
            }
            view.setEnabled(false);
            if (this.abc10061 != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr7 = this.abc10061;
                    if (i7 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                        break;
                    }
                    iArr7[i7] = 8;
                    i7++;
                }
            }
            this.abc10052 = 3;
            if (!TextUtils.isEmpty(this.abc10054)) {
                this.abc10054 += this.abc10054.length();
            }
            if (this.abc21.size() < 2) {
                this.abc21.add("rad");
                ArrayList<Integer> arrayList4 = this.abc10010;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    this.abc10010.remove(0);
                }
                if (this.abc10060 == null) {
                    this.abc10060 = new String[10];
                }
                if (!TextUtils.isEmpty(this.abc10062)) {
                    this.abc10062 += this.abc10062.length();
                }
            }
            if (this.abc10074.size() > 2) {
                this.abc10074.add(6);
            }
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
            if (this.abc10025 < 0.6364169d) {
                this.abc10025 = 0.74117345f;
            }
            view.setVisibility(0);
            ArrayList<Integer> arrayList5 = this.abc10010;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc10010.remove(0);
            }
            this.abc10051 *= 0.2429039866418946d;
            if (this.abc10056.size() < 1) {
                this.abc10056.add(2);
            }
            this.abc7 = ((double) this.abc7) < 0.9448039d ? 0.85162586f : 0.045373797f;
            if (!TextUtils.isEmpty(this.abc10012)) {
                this.abc10012 += this.abc10012.length();
            }
            this.abc10035 = false;
            if (this.abc10057 == null) {
                this.abc10057 = new String[10];
            }
            view.startAnimation(translateAnimation);
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            this.abc10046 = this.abc10046 < 7 ? 3 : 4;
            this.abc10035 = !this.abc10035;
            int[] iArr8 = this.abc32;
            if (iArr8 != null) {
                iArr8[3] = 0;
                this.abc1005--;
                if (this.abc10071 != null) {
                    int i8 = 0;
                    while (true) {
                        String[] strArr9 = this.abc10071;
                        if (i8 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                            break;
                        }
                        strArr9[i8] = "string" + i8;
                        i8++;
                    }
                }
                ArrayList<Integer> arrayList6 = this.abc1000;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    this.abc1000.remove(0);
                }
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            this.abc10029 = true;
            if (this.abc10074 == null) {
                this.abc10074 = new ArrayList<>();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGalleryForBg() {
        Intent intent = new Intent("android.intent.action.PICK");
        this.abc10019 = 7;
        int[] iArr = this.abc10042;
        int i = 0;
        if (iArr != null) {
            iArr[3] = 0;
        }
        if (this.abc10022 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.abc10022;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        this.abc4 += 0.44801337f;
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        if (this.abc10015 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.abc10015;
                if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i3] = "string" + i3;
                i3++;
            }
        }
        if (this.abc10039 == null) {
            this.abc10039 = new ArrayList<>();
        }
        intent.setType("image/*");
        if (this.abc10078 == null) {
            this.abc10078 = new ArrayList<>();
        }
        if (this.abc10041 == null) {
            this.abc10041 = new int[10];
        }
        this.abc10013 = Math.abs(this.abc10013);
        for (int i4 = 0; i4 < this.abc30; i4++) {
            this.abc4 = 0.84204835f;
            String[] strArr3 = this.abc10023;
            if (strArr3 != null) {
                strArr3[3] = "y is";
            }
            if (this.abc10046 > 0) {
                this.abc10046 = 4;
            }
            String[] strArr4 = this.abc1001;
            if (strArr4 != null) {
                strArr4[1] = null;
            }
        }
        this.abc10035 = false;
        String[] strArr5 = this.abc10016;
        if (strArr5 != null) {
            strArr5[3] = null;
        }
        this.abc10063 = ((double) this.abc10063) > 0.9466265d ? 0.52870303f : 0.6980288f;
        this.activityResultLauncherImage.launch(intent);
        this.abc10032 = !this.abc10032;
        this.abc10062 = "t";
        String[] strArr6 = this.abc10015;
        if (strArr6 != null) {
            strArr6[9] = "it.";
        }
        if (this.abc25 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr7 = this.abc25;
                if (i5 >= strArr7.length) {
                    break;
                }
                strArr7[i5] = "string" + i5;
                String[] strArr8 = this.abc10016;
                if (strArr8 != null) {
                    strArr8[9] = null;
                }
                if (!TextUtils.isEmpty(this.abc10054)) {
                    this.abc10054 += this.abc10054.length();
                }
                this.abc10040 = !this.abc10040;
                i5++;
            }
            if (this.abc10048.size() < 0) {
                this.abc10048.add("on for");
            }
            this.abc10059 = "define";
            if (this.abc10060 != null) {
                while (true) {
                    String[] strArr9 = this.abc10060;
                    if (i >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                        break;
                    }
                    strArr9[i] = "string" + i;
                    i++;
                }
            }
        }
        if (this.abc10037.size() > 7) {
            this.abc10037.add(3);
        }
        if (this.abc10045 == null) {
            this.abc10045 = new int[10];
        }
        if (this.abc10047 == null) {
            this.abc10047 = new int[10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMove(int i, int i2) {
        new Handler().postDelayed(new RunnableC9477i2(i, i2), 20L);
        this.abc10068 = this.abc10068 < 0.5623709942314404d ? 0.09484661675032047d : 0.17653936909434853d;
        this.abc10058 = this.abc10058 < 0.85442437244437d ? 0.33757368576064783d : 0.6004089345718463d;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (this.abc36 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr = this.abc36;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = "string" + i3;
                this.abc1007 = this.abc1007 * 0.61696225f;
                this.abc10020 = this.abc10020 + 0.8723047f;
                if (this.abc1001 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr2 = this.abc1001;
                        int i5 = 3;
                        if (strArr2.length <= 3) {
                            i5 = strArr2.length;
                        }
                        if (i4 < i5) {
                            strArr2[i4] = "string" + i4;
                            i4++;
                        }
                    }
                }
                i3++;
            }
            if (this.abc10037.size() > 2) {
                this.abc10037.add(4);
            }
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            int[] iArr = this.abc10061;
            if (iArr != null) {
                iArr[8] = 0;
            }
        }
        if (this.abc10073 == null) {
            this.abc10073 = new String[10];
        }
        this.abc10054 = "y";
        if (TextUtils.isEmpty(this.abc10062)) {
            return;
        }
        this.abc10062 += this.abc10062.length();
    }

    public void closeAll() {
        this.createVM.hideImageLayout();
        this.abc10063 *= 0.9764991f;
        ArrayList<Integer> arrayList = this.abc10034;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10034.remove(0);
        }
        ArrayList<Integer> arrayList2 = this.abc10030;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc10030.remove(0);
        }
        this.createVM.hideTextLayout();
        this.abc10049 = !this.abc10049;
        if (!TextUtils.isEmpty(this.abc10054)) {
            this.abc10054 += this.abc10054.length();
        }
        if (this.abc10048.size() > 9) {
            this.abc10048.add("robably m");
        }
        this.createVM.hideColorFinderLayout();
        if (this.abc10078.size() < 5) {
            this.abc10078.add(8);
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        if (this.abc10057 == null) {
            this.abc10057 = new String[10];
        }
        this.createVM.hideColorRainbowLayout();
        this.abc10029 = !this.abc10029;
        if (this.abc10020 > 0.101514935d) {
            this.abc10020 = 0.7180827f;
        }
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        this.createVM.hideClippingLayout();
        this.abc10035 = false;
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        if (this.abc10056.size() < 5) {
            this.abc10056.add(9);
        }
        this.createVM.hideBackgroundLayout();
        this.abc10029 = !this.abc10029;
        String[] strArr = this.abc10016;
        if (strArr != null) {
            strArr[5] = " wi";
        }
        ArrayList<String> arrayList3 = this.abc10036;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc10036.remove(0);
        }
        if (this.binding.drawview.m9080y()) {
            this.binding.drawview.setClippingState(false);
            this.abc10049 = true;
            if (this.abc10078 == null) {
                this.abc10078 = new ArrayList<>();
            }
            String[] strArr2 = this.abc10073;
            if (strArr2 != null) {
                strArr2[6] = "hat in";
            }
        }
        this.abc10027 = 0.6625941f;
        String[] strArr3 = this.abc10073;
        if (strArr3 != null) {
            strArr3[0] = null;
        }
        if (this.abc10048 == null) {
            this.abc10048 = new ArrayList<>();
        }
        if (this.binding.drawview.m9123C()) {
            this.binding.drawview.m9084u();
            if (this.abc10037.size() < 0) {
                this.abc10037.add(0);
            }
            this.abc10025 = 0.2481386f;
            if (this.abc10017 == null) {
                this.abc10017 = new int[10];
            }
        }
        if (this.abc1003.size() > 9) {
            this.abc1003.add("oaning s");
        }
        int[] iArr = this.abc10045;
        if (iArr != null) {
            iArr[9] = 6;
        }
        int[] iArr2 = this.abc10041;
        if (iArr2 != null) {
            iArr2[1] = 0;
        }
        this.binding.drawview.setEditBackgound(false);
        int[] iArr3 = this.abc10061;
        if (iArr3 != null) {
            iArr3[7] = 5;
        }
        if (this.abc10017 == null) {
            this.abc10017 = new int[10];
        }
        this.abc10059 = "l on pub";
        this.binding.drawview.m9120F();
        if (this.abc10014.size() < 6) {
            this.abc10014.add(2);
        }
        this.abc10065 = true;
        if (this.abc10020 > 0.13853472d) {
            this.abc10020 = 0.5876341f;
        }
        this.binding.drawview.m9096i();
        this.abc10025 = ((double) this.abc10025) > 0.95749986d ? 0.8592506f : 0.94865364f;
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        this.abc10038 = 0.4430349f;
    }

    public void closeLoading() {
        LogoLoadingDialog logoLoadingDialog = this.logoLoadingDialog;
        int i = 0;
        if (logoLoadingDialog != null) {
            logoLoadingDialog.dismiss();
            this.abc10012 = "th";
            int[] iArr = this.abc1002;
            if (iArr != null) {
                iArr[1] = 1;
            }
            String[] strArr = this.abc10077;
            if (strArr != null) {
                strArr[4] = null;
            }
            ArrayList<Integer> arrayList = this.abc2;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc2.remove(0);
                if (this.abc1007 < 0.5587579d) {
                    this.abc1007 = 0.8375934f;
                }
                int i2 = 0;
                while (true) {
                    int i3 = this.abc10028;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    ArrayList<String> arrayList2 = this.abc10018;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        this.abc10018.remove(0);
                    }
                    i2++;
                }
                this.abc10040 = !this.abc10040;
            }
            this.abc10046 = this.abc10046 < 9 ? 5 : 6;
            int[] iArr2 = this.abc10047;
            if (iArr2 != null) {
                iArr2[0] = 4;
            }
            String[] strArr2 = this.abc10077;
            if (strArr2 != null) {
                strArr2[9] = null;
            }
        }
        this.abc10063 = 0.84241724f;
        if (this.abc10074.size() < 9) {
            this.abc10074.add(5);
        }
        if (this.abc10056.size() > 2) {
            this.abc10056.add(2);
        }
        if (this.abc19 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr3 = this.abc19;
                if (i4 >= strArr3.length) {
                    break;
                }
                strArr3[i4] = "string" + i4;
                if (this.abc10034 == null) {
                    this.abc10034 = new ArrayList<>();
                }
                String[] strArr4 = this.abc10031;
                if (strArr4 != null) {
                    strArr4[9] = null;
                }
                String[] strArr5 = this.abc10022;
                if (strArr5 != null) {
                    strArr5[7] = null;
                }
                i4++;
            }
            int[] iArr3 = this.abc10042;
            if (iArr3 != null) {
                iArr3[8] = 0;
            }
            this.abc10064 = " surpr";
            if (this.abc10023 == null) {
                this.abc10023 = new String[10];
            }
        }
        if (this.abc10031 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr6 = this.abc10031;
                if (i5 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                    break;
                }
                strArr6[i5] = "string" + i5;
                i5++;
            }
        }
        if (this.abc10023 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr7 = this.abc10023;
                if (i6 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                    break;
                }
                strArr7[i6] = "string" + i6;
                i6++;
            }
        }
        if (this.abc10031 == null) {
            return;
        }
        while (true) {
            String[] strArr8 = this.abc10031;
            if (i >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                return;
            }
            strArr8[i] = "string" + i;
            i++;
        }
    }

    public void nextSave() {
        showLoading();
        this.abc10019 += 8;
        this.abc1007 = 0.9800757f;
        String[] strArr = this.abc10071;
        if (strArr != null) {
            strArr[1] = "g, wel";
        }
        int[] iArr = this.abc6;
        int i = 0;
        if (iArr != null) {
            iArr[6] = 5;
            String[] strArr2 = this.abc10016;
            if (strArr2 != null) {
                strArr2[8] = null;
            }
            this.abc10013 = ((double) this.abc10013) < 0.8428958d ? 0.44795507f : 0.08523792f;
            int[] iArr2 = this.abc10047;
            if (iArr2 != null) {
                iArr2[0] = 3;
            }
        }
        if (this.abc10024.size() < 9) {
            this.abc10024.add(" You’r");
        }
        ArrayList<Integer> arrayList = this.abc10010;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10010.remove(0);
        }
        if (this.abc10057 == null) {
            this.abc10057 = new String[10];
        }
        if (this.handler == null) {
            this.handler = new HandlerC9517s2(Looper.getMainLooper());
            String[] strArr3 = this.abc10073;
            if (strArr3 != null) {
                strArr3[3] = null;
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            if (this.abc1000.size() > 8) {
                this.abc1000.add(4);
            }
            if (this.abc30 > 0) {
                this.abc30 = 0;
                if (this.abc1000 == null) {
                    this.abc1000 = new ArrayList<>();
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                this.abc10076 = !this.abc10076;
            }
            int[] iArr3 = this.abc10061;
            if (iArr3 != null) {
                iArr3[4] = 5;
            }
            if (this.abc10034 == null) {
                this.abc10034 = new ArrayList<>();
            }
            this.abc10049 = !this.abc10049;
        }
        String[] strArr4 = this.abc10023;
        if (strArr4 != null) {
            strArr4[3] = "t ";
        }
        String[] strArr5 = this.abc10043;
        if (strArr5 != null) {
            strArr5[0] = "he n";
        }
        if (this.abc10027 > 0.44871694d) {
            this.abc10027 = 0.32180357f;
        }
        this.abc27 = this.abc27 > 0.3349351587103093d ? 0.9574364037925662d : 0.14211978279853965d;
        String[] strArr6 = this.abc10022;
        if (strArr6 != null) {
            strArr6[2] = null;
        }
        if (this.abc10034 == null) {
            this.abc10034 = new ArrayList<>();
        }
        this.abc10049 = !this.abc10049;
        this.binding.drawview.m9094k();
        new Thread(new RunnableC9521t2()).start();
        this.abc10027 = 0.86229473f;
        this.abc10072 = false;
        this.abc10049 = !this.abc10049;
        this.abc10 = !this.abc10;
        this.abc1004 = false;
        if (this.abc10057 == null) {
            this.abc10057 = new String[10];
        }
        if (this.abc10061 == null) {
            return;
        }
        while (true) {
            int[] iArr4 = this.abc10061;
            if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                return;
            }
            iArr4[i] = 4;
            i++;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.binding.drawview.m9124B()) {
            super.onBackPressed();
            if (this.abc10056 == null) {
                this.abc10056 = new ArrayList<>();
            }
            if (this.abc10057 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.abc10057;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            if (this.abc10047 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.abc10047;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 7;
                    i2++;
                }
            }
            String[] strArr2 = this.abc31;
            if (strArr2 != null) {
                strArr2[3] = null;
                this.abc10046 += 6;
                this.abc10066 = -this.abc10066;
                if (this.abc10010 == null) {
                    this.abc10010 = new ArrayList<>();
                }
            }
            String[] strArr3 = this.abc1001;
            if (strArr3 != null) {
                strArr3[6] = null;
            }
            ArrayList<String> arrayList = this.abc10018;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc10018.remove(0);
            }
            this.abc1008 *= 3;
        } else {
            if (this.logoConfirmExitDialog == null) {
                this.logoConfirmExitDialog = new LogoConfirmExitDialog(this);
                if (this.abc10075 == null) {
                    this.abc10075 = new String[10];
                }
                String[] strArr4 = this.abc10016;
                if (strArr4 != null) {
                    strArr4[8] = null;
                }
                this.abc10033 = true;
                int[] iArr2 = this.abc32;
                if (iArr2 != null) {
                    iArr2[5] = 0;
                    this.abc10065 = false;
                    if (this.abc10048 == null) {
                        this.abc10048 = new ArrayList<>();
                    }
                    if (this.abc10023 == null) {
                        this.abc10023 = new String[10];
                    }
                }
                if (this.abc10048.size() > 5) {
                    this.abc10048.add("d");
                }
                if (this.abc10031 == null) {
                    this.abc10031 = new String[10];
                }
                this.abc10038 = 0.15527451f;
            }
            this.abc10026 = 0.52940553f;
            ArrayList<Integer> arrayList2 = this.abc1000;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1000.remove(0);
            }
            ArrayList<Integer> arrayList3 = this.abc10056;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10056.remove(0);
            }
            int[] iArr3 = this.abc6;
            if (iArr3 != null) {
                iArr3[5] = 0;
                this.abc10035 = true;
                ArrayList<String> arrayList4 = this.abc10070;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.abc10070.remove(0);
                }
                String[] strArr5 = this.abc10071;
                if (strArr5 != null) {
                    strArr5[0] = ReportUtil.f18058a;
                }
            }
            if (this.abc10073 == null) {
                this.abc10073 = new String[10];
            }
            this.abc10032 = false;
            this.abc10046 = 5;
            this.logoConfirmExitDialog.show();
            ArrayList<Integer> arrayList5 = this.abc10074;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc10074.remove(0);
            }
            ArrayList<Integer> arrayList6 = this.abc10074;
            if (arrayList6 == null && arrayList6.size() > 0) {
                this.abc10074.remove(0);
            }
            String[] strArr6 = this.abc10077;
            if (strArr6 != null) {
                strArr6[9] = "ll";
            }
            if (this.abc6 == null) {
                this.abc6 = new int[10];
                if (this.abc10020 > 0.8621482d) {
                    this.abc10020 = 0.8927619f;
                }
                int[] iArr4 = this.abc10042;
                if (iArr4 != null) {
                    iArr4[4] = 0;
                }
                ArrayList<String> arrayList7 = this.abc10018;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    this.abc10018.remove(0);
                }
            }
            String[] strArr7 = this.abc10031;
            if (strArr7 != null) {
                strArr7[2] = "it.";
            }
            if (this.abc10013 > 0.82758373d) {
                this.abc10013 = 0.12189281f;
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
        }
        int[] iArr5 = this.abc10041;
        if (iArr5 != null) {
            iArr5[5] = 0;
        }
        this.abc10072 = !this.abc10072;
        this.abc1007 = ((double) this.abc1007) < 0.52265155d ? 0.8111904f : 0.952571f;
        if (this.abc36 == null) {
            this.abc36 = new String[10];
            if (this.abc10048.size() > 6) {
                this.abc10048.add("earn");
            }
            if (this.abc10038 < 0.6470966d) {
                this.abc10038 = 0.42928427f;
            }
            this.abc10040 = !this.abc10040;
        }
        if (this.abc10075 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr8 = this.abc10075;
                if (i3 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                    break;
                }
                strArr8[i3] = "string" + i3;
                i3++;
            }
        }
        String[] strArr9 = this.abc10043;
        if (strArr9 != null) {
            strArr9[7] = null;
        }
        int[] iArr6 = this.abc10050;
        if (iArr6 != null) {
            iArr6[2] = 0;
        }
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.abc10074.size() > 0) {
            this.abc10074.add(8);
        }
        if (this.abc10070.size() < 1) {
            this.abc10070.add(InneractiveMediationDefs.GENDER_FEMALE);
        }
        ArrayList<Integer> arrayList = this.abc10074;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10074.remove(0);
        }
        int[] iArr = this.abc16;
        if (iArr != null) {
            iArr[4] = 5;
            int[] iArr2 = this.abc10050;
            if (iArr2 != null) {
                iArr2[8] = 3;
            }
            this.abc10019 = Math.abs(this.abc10019);
            if (this.abc1000.size() > 6) {
                this.abc1000.add(7);
            }
        }
        String[] strArr = this.abc1001;
        if (strArr != null) {
            strArr[3] = null;
        }
        if (this.abc10041 == null) {
            this.abc10041 = new int[10];
        }
        this.abc10066 = ((double) this.abc10066) < 0.55448115d ? 0.8117188f : 0.6264529f;
        this.createVM = (LogoCreateVM) new ViewModelProvider(this).get(LogoCreateVM.class);
        String[] strArr2 = this.abc10022;
        if (strArr2 != null) {
            strArr2[1] = null;
        }
        if (!TextUtils.isEmpty(this.abc10064)) {
            this.abc10064 += this.abc10064.length();
        }
        if (this.abc10045 != null) {
            int i = 0;
            while (true) {
                int[] iArr3 = this.abc10045;
                if (i >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i] = 3;
                i++;
            }
        }
        int[] iArr4 = this.abc20;
        if (iArr4 != null) {
            iArr4[1] = 0;
            if (this.abc10066 < 0.28817654d) {
                this.abc10066 = 0.4219094f;
            }
            int[] iArr5 = this.abc10050;
            if (iArr5 != null) {
                iArr5[2] = 4;
            }
            this.abc10066 = ((double) this.abc10066) > 0.9038492d ? 0.08696991f : 0.50184023f;
        }
        this.abc10063 += 0.028695822f;
        this.abc10020 = 0.85369205f;
        this.abc10054 = "the n";
        this.binding = (ActivityCreateBinding) DataBindingUtil.setContentView(this, R.layout.activity_create);
        ArrayList<Integer> arrayList2 = this.abc10055;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc10055.remove(0);
        }
        if (this.abc10056.size() > 8) {
            this.abc10056.add(5);
        }
        this.abc10069 = "or bein";
        String[] strArr3 = this.abc19;
        if (strArr3 != null) {
            strArr3[0] = null;
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            if (!TextUtils.isEmpty(this.abc10064)) {
                this.abc10064 += this.abc10064.length();
            }
            if (this.abc10057 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr4 = this.abc10057;
                    if (i2 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i2] = "string" + i2;
                    i2++;
                }
            }
        }
        if (this.abc10046 > 0) {
            this.abc10046 = 6;
        }
        String[] strArr5 = this.abc10016;
        if (strArr5 != null) {
            strArr5[7] = "real";
        }
        ArrayList<String> arrayList3 = this.abc10024;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc10024.remove(0);
        }
        this.binding.setLifecycleOwner(this);
        this.abc1005 = -this.abc1005;
        String[] strArr6 = this.abc10031;
        if (strArr6 != null) {
            strArr6[0] = null;
        }
        int[] iArr6 = this.abc10050;
        if (iArr6 != null) {
            iArr6[3] = 7;
        }
        if (this.abc25 == null) {
            this.abc25 = new String[10];
            if (this.abc10024.size() < 3) {
                this.abc10024.add("rnit");
            }
            this.abc1004 = true;
            if (!TextUtils.isEmpty(this.abc10054)) {
                this.abc10054 += this.abc10054.length();
            }
        }
        this.abc1007 += 0.83556014f;
        this.abc10058 = 0.6398581833051022d;
        if (this.abc10036 == null) {
            this.abc10036 = new ArrayList<>();
        }
        setSupportActionBar(this.binding.toolbar);
        int[] iArr7 = this.abc1002;
        if (iArr7 != null) {
            iArr7[1] = 0;
        }
        if (this.abc10050 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr8 = this.abc10050;
                if (i3 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                    break;
                }
                iArr8[i3] = 6;
                i3++;
            }
        }
        if (!TextUtils.isEmpty(this.abc10064)) {
            this.abc10064 += this.abc10064.length();
        }
        if (this.abc0 == null) {
            this.abc0 = new String[10];
            if (!TextUtils.isEmpty(this.abc10054)) {
                this.abc10054 += this.abc10054.length();
            }
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
            if (this.abc10034.size() > 9) {
                this.abc10034.add(1);
            }
        }
        int[] iArr9 = this.abc10045;
        if (iArr9 != null) {
            iArr9[5] = 0;
        }
        ArrayList<Integer> arrayList4 = this.abc10010;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10010.remove(0);
        }
        String[] strArr7 = this.abc10057;
        if (strArr7 != null) {
            strArr7[8] = null;
        }
        init();
        int[] iArr10 = this.abc10041;
        if (iArr10 != null) {
            iArr10[1] = 2;
        }
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        if (!TextUtils.isEmpty(this.abc10059)) {
            this.abc10059 += this.abc10059.length();
        }
        String[] strArr8 = this.abc25;
        if (strArr8 != null) {
            strArr8[8] = null;
            this.abc10052 *= 0;
            if (this.abc10056 == null) {
                this.abc10056 = new ArrayList<>();
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
        }
        this.abc10051 = 0.6960732252984251d;
        this.abc10059 = "think. Fo";
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.binding.setViewModel(this.createVM);
        ArrayList<String> arrayList5 = this.abc10067;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc10067.remove(0);
        }
        this.abc1004 = !this.abc1004;
        String[] strArr9 = this.abc10021;
        if (strArr9 != null) {
            strArr9[4] = null;
        }
        if (this.abc31 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr10 = this.abc31;
                if (i4 >= strArr10.length) {
                    break;
                }
                strArr10[i4] = "string" + i4;
                if (this.abc10041 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr11 = this.abc10041;
                        if (i5 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                            break;
                        }
                        iArr11[i5] = 7;
                        i5++;
                    }
                }
                String[] strArr11 = this.abc1001;
                if (strArr11 != null) {
                    strArr11[6] = null;
                }
                this.abc10063 -= 0.94633216f;
                i4++;
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            if (!TextUtils.isEmpty(this.abc10064)) {
                this.abc10064 += this.abc10064.length();
            }
            if (this.abc10024.size() < 1) {
                this.abc10024.add("tion");
            }
        }
        if (this.abc10016 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr12 = this.abc10016;
                if (i6 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                    break;
                }
                strArr12[i6] = "string" + i6;
                i6++;
            }
        }
        if (this.abc10061 != null) {
            int i7 = 0;
            while (true) {
                int[] iArr12 = this.abc10061;
                if (i7 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                    break;
                }
                iArr12[i7] = 3;
                i7++;
            }
        }
        String[] strArr13 = this.abc10060;
        if (strArr13 != null) {
            strArr13[3] = "ing stu";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.abc1008 = 8;
        this.abc10069 = "well, du";
        this.abc10033 = false;
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.abc10063 = Math.abs(this.abc10063);
        if (this.abc10031 == null) {
            this.abc10031 = new String[10];
        }
        String[] strArr14 = this.abc1001;
        if (strArr14 != null) {
            strArr14[3] = "ho";
        }
        this.binding.drawview.m9083v(displayMetrics.density);
        String[] strArr15 = this.abc1001;
        if (strArr15 != null) {
            strArr15[5] = null;
        }
        String[] strArr16 = this.abc10060;
        if (strArr16 != null) {
            strArr16[2] = "ten ";
        }
        if (strArr16 == null) {
            this.abc10060 = new String[10];
        }
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Glide.m18522c(this).m18523b();
        this.abc10059 = "written";
        if (this.abc10030.size() < 0) {
            this.abc10030.add(9);
        }
        if (this.abc10048.size() < 4) {
            this.abc10048.add(" that th");
        }
        if (this.stopMove) {
            super.onDestroy();
            if (this.abc10014.size() < 8) {
                this.abc10014.add(5);
            }
            ArrayList<String> arrayList = this.abc10048;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc10048.remove(0);
            }
            if (this.abc10067 == null) {
                this.abc10067 = new ArrayList<>();
            }
            this.abc29 = "  ";
            ArrayList<String> arrayList2 = this.abc10070;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc10070.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            if (this.abc10034 == null) {
                this.abc10034 = new ArrayList<>();
            }
        } else {
            new Handler().postDelayed(new RunnableC9513r2(), 100L);
            if (!TextUtils.isEmpty(this.abc10062)) {
                this.abc10062 += this.abc10062.length();
            }
            this.abc1008 = 3;
            this.abc1004 = false;
            this.abc27 = 0.6022131664037567d;
            if (this.abc10038 > 0.869485d) {
                this.abc10038 = 0.06849283f;
            }
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            ArrayList<String> arrayList3 = this.abc10024;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc10024.remove(0);
            }
        }
        this.abc1008 = this.abc1008 <= 8 ? 1 : 9;
        this.abc10049 = !this.abc10049;
        if (this.abc10071 == null) {
            this.abc10071 = new String[10];
        }
        if (this.abc18 > 0.3512989850218977d) {
            this.abc18 = 0.3012153866077095d;
            if (this.abc1002 == null) {
                this.abc1002 = new int[10];
            }
            this.abc10032 = true;
            String[] strArr = this.abc10073;
            if (strArr != null) {
                strArr[0] = "del for so";
            }
        }
        this.abc10013 = 0.36478823f;
        ArrayList<String> arrayList4 = this.abc10036;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc10036.remove(0);
        }
        ArrayList<Integer> arrayList5 = this.abc10014;
        if (arrayList5 != null || arrayList5.size() <= 0) {
            return;
        }
        this.abc10014.remove(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        int[] iArr2 = this.abc10042;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        String[] strArr2 = this.abc10060;
        if (strArr2 != null) {
            strArr2[0] = null;
        }
        String[] strArr3 = this.abc10022;
        if (strArr3 != null) {
            strArr3[9] = null;
        }
        String[] strArr4 = this.abc19;
        if (strArr4 != null) {
            strArr4[2] = null;
            this.abc10027 = ((double) this.abc10027) > 0.42219102d ? 0.46317816f : 0.42944717f;
            int[] iArr3 = this.abc1002;
            if (iArr3 != null) {
                iArr3[3] = 7;
            }
            this.abc1007 *= 0.4923808f;
        }
        this.abc10058 = this.abc10058 > 0.724160493137268d ? 0.008081905660375366d : 0.9317133356072849d;
        if (this.abc10055 == null) {
            this.abc10055 = new ArrayList<>();
        }
        String[] strArr5 = this.abc10057;
        if (strArr5 != null) {
            strArr5[4] = "nt is";
        }
        if (i == 1001) {
            if (iArr.length > 0 && iArr[0] == 0) {
                startGalleryForBg();
                this.abc10046 *= 8;
                if (this.abc10018.size() < 1) {
                    this.abc10018.add("get");
                }
                if (this.abc10030.size() < 9) {
                    this.abc10030.add(6);
                }
                this.abc27 -= 0.9501630782422301d;
                this.abc10058 = Math.abs(this.abc10058);
                this.abc10032 = !this.abc10032;
                String[] strArr6 = this.abc10077;
                if (strArr6 != null) {
                    strArr6[6] = "nd Pr";
                }
            }
            this.abc10025 = Math.abs(this.abc10025);
            this.abc10035 = true;
            this.abc10063 = -this.abc10063;
            if (this.abc11 == null) {
                this.abc11 = new ArrayList<>();
                int[] iArr4 = this.abc10041;
                if (iArr4 != null) {
                    iArr4[7] = 4;
                }
                if (this.abc10067.size() < 4) {
                    this.abc10067.add("e ");
                }
                ArrayList<String> arrayList = this.abc10036;
                if (arrayList != null && arrayList.size() > 0) {
                    this.abc10036.remove(0);
                }
            }
            this.abc10052 = this.abc10052 < 9 ? 0 : 6;
            this.abc10064 = "dern nove";
            String[] strArr7 = this.abc10015;
            if (strArr7 != null) {
                strArr7[7] = null;
            }
        } else if (i == 1002) {
            if (iArr.length > 0 && iArr[0] == 0) {
                nextSave();
                this.abc10052 = 8;
                String[] strArr8 = this.abc10016;
                if (strArr8 != null) {
                    strArr8[9] = null;
                }
                if (strArr8 != null) {
                    strArr8[3] = "19th ce";
                }
                this.abc10 = true;
                ArrayList<Integer> arrayList2 = this.abc10055;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.abc10055.remove(0);
                }
                this.abc10032 = !this.abc10032;
                String[] strArr9 = this.abc1001;
                if (strArr9 != null) {
                    strArr9[3] = null;
                }
            }
            ArrayList<Integer> arrayList3 = this.abc10034;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10034.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc10069)) {
                this.abc10069 += this.abc10069.length();
            }
            this.abc1007 = 0.4296173f;
            if (this.abc6 == null) {
                this.abc6 = new int[10];
                if (this.abc10068 > 0.9443845574517306d) {
                    this.abc10068 = 0.9685842164004407d;
                }
                this.abc10038 = 0.10540259f;
                this.abc10063 = ((double) this.abc10063) < 0.41332078d ? 0.06759709f : 0.92476726f;
            }
            this.abc10032 = !this.abc10032;
            ArrayList<Integer> arrayList4 = this.abc10074;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc10074.remove(0);
            }
            this.abc10033 = !this.abc10033;
        }
        if (this.abc10077 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr10 = this.abc10077;
                if (i2 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                    break;
                }
                strArr10[i2] = "string" + i2;
                i2++;
            }
        }
        ArrayList<Integer> arrayList5 = this.abc10055;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc10055.remove(0);
        }
        if (this.abc10021 == null) {
            this.abc10021 = new String[10];
        }
        int[] iArr5 = this.abc6;
        if (iArr5 != null) {
            iArr5[6] = 1;
            ArrayList<Integer> arrayList6 = this.abc10037;
            if (arrayList6 == null && arrayList6.size() > 0) {
                this.abc10037.remove(0);
            }
            this.abc1007 = -this.abc1007;
            if (this.abc10041 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr6 = this.abc10041;
                    if (i3 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i3] = 8;
                    i3++;
                }
            }
        }
        String[] strArr11 = this.abc10075;
        if (strArr11 != null) {
            strArr11[1] = null;
        }
        String[] strArr12 = this.abc10016;
        if (strArr12 != null) {
            strArr12[0] = "d to 'get";
        }
        if (this.abc10022 == null) {
            this.abc10022 = new String[10];
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.abc10027 = Math.abs(this.abc10027);
        this.abc10064 = "n’t receiv";
        this.abc10035 = !this.abc10035;
        this.abc18 = -this.abc18;
        this.abc10013 = 0.39570093f;
        this.abc10049 = !this.abc10049;
        if (TextUtils.isEmpty(this.abc10059)) {
            return;
        }
        this.abc10059 += this.abc10059.length();
    }

    public void save() {
        closeAll();
        this.abc10066 = ((double) this.abc10066) < 0.31061846d ? 0.41018838f : 0.64220977f;
        if (!TextUtils.isEmpty(this.abc10064)) {
            this.abc10064 += this.abc10064.length();
        }
        int i = 0;
        if (this.abc10045 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.abc10045;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 5;
                i2++;
            }
        }
        if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            nextSave();
            if (this.abc10041 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = this.abc10041;
                    if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i3] = 6;
                    i3++;
                }
            }
            this.abc10029 = !this.abc10029;
            if (this.abc10031 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr = this.abc10031;
                    if (i4 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i4] = "string" + i4;
                    i4++;
                }
            }
            int[] iArr3 = this.abc15;
            if (iArr3 != null) {
                iArr3[8] = 0;
                if (this.abc10011.size() < 1) {
                    this.abc10011.add(5);
                }
                if (this.abc10036 == null) {
                    this.abc10036 = new ArrayList<>();
                }
                this.abc1005 = 0;
            }
            this.abc10040 = !this.abc10040;
            this.abc10013 = 0.445055f;
            if (this.abc10022 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr2 = this.abc10022;
                    if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i5] = "string" + i5;
                    i5++;
                }
            }
        } else {
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1002);
            if (this.abc10023 == null) {
                this.abc10023 = new String[10];
            }
            this.abc10049 = !this.abc10049;
            int[] iArr4 = this.abc10047;
            if (iArr4 != null) {
                iArr4[3] = 0;
            }
            this.abc4 = 0.021285713f;
            this.abc10032 = !this.abc10032;
            ArrayList<String> arrayList = this.abc1003;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc10068 = 0.024873438125376457d;
            this.abc10062 = " rece";
            if (this.abc10016 == null) {
                this.abc10016 = new String[10];
            }
            if (this.abc10070 == null) {
                this.abc10070 = new ArrayList<>();
            }
            if (this.abc17 > 0.6087240842720021d) {
                this.abc17 = 0.8137062128338854d;
                if (this.abc10034 == null) {
                    this.abc10034 = new ArrayList<>();
                }
                this.abc10065 = true;
                if (!TextUtils.isEmpty(this.abc10064)) {
                    this.abc10064 += this.abc10064.length();
                }
            }
            if (this.abc10014 == null) {
                this.abc10014 = new ArrayList<>();
            }
            this.abc10052 = 3;
            if (this.abc10030 == null) {
                this.abc10030 = new ArrayList<>();
            }
        }
        this.abc10032 = false;
        if (this.abc10021 == null) {
            this.abc10021 = new String[10];
        }
        if (this.abc10018.size() > 7) {
            this.abc10018.add("hat in m");
        }
        this.abc12 = ((double) this.abc12) > 0.1615743d ? 0.82642597f : 0.037521183f;
        if (this.abc10047 != null) {
            int i6 = 0;
            while (true) {
                int[] iArr5 = this.abc10047;
                if (i6 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i6] = 3;
                i6++;
            }
        }
        if (this.abc10022 != null) {
            while (true) {
                String[] strArr3 = this.abc10022;
                if (i >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i] = "string" + i;
                i++;
            }
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
    }

    public void showLoading() {
        if (this.logoLoadingDialog == null) {
            this.logoLoadingDialog = new LogoLoadingDialog(this);
            this.abc10020 = -this.abc10020;
            if (this.abc10078.size() > 6) {
                this.abc10078.add(0);
            }
            if (this.abc1001 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.abc1001;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            String[] strArr2 = this.abc0;
            if (strArr2 != null) {
                strArr2[9] = null;
                if (this.abc10056.size() < 8) {
                    this.abc10056.add(9);
                }
                if (this.abc10071 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr3 = this.abc10071;
                        if (i2 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                            break;
                        }
                        strArr3[i2] = "string" + i2;
                        i2++;
                    }
                }
                if (!TextUtils.isEmpty(this.abc10059)) {
                    this.abc10059 += this.abc10059.length();
                }
            }
            int i3 = 0;
            while (true) {
                int i4 = this.abc10046;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                if (this.abc10034 == null) {
                    this.abc10034 = new ArrayList<>();
                }
                i3++;
            }
            if (this.abc10055.size() > 0) {
                this.abc10055.add(2);
            }
            int i5 = 0;
            while (true) {
                int i6 = this.abc1005;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                this.abc10027 = Math.abs(this.abc10027);
                i5++;
            }
        }
        this.abc10049 = !this.abc10049;
        int i7 = 0;
        while (true) {
            int i8 = this.abc10046;
            if (i8 > 3) {
                i8 = 3;
            }
            if (i7 >= i8) {
                break;
            }
            this.abc10065 = false;
            i7++;
        }
        if (!TextUtils.isEmpty(this.abc10062)) {
            this.abc10062 += this.abc10062.length();
        }
        this.abc4 = ((double) this.abc4) > 0.8771872d ? 0.10090077f : 0.6938139f;
        String[] strArr4 = this.abc10057;
        if (strArr4 != null) {
            strArr4[8] = null;
        }
        if (this.abc10075 == null) {
            this.abc10075 = new String[10];
        }
        this.abc10064 = " t";
        this.logoLoadingDialog.show();
        if (this.abc10045 != null) {
            int i9 = 0;
            while (true) {
                int[] iArr = this.abc10045;
                if (i9 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i9] = 8;
                i9++;
            }
        }
        if (this.abc10063 < 0.74475443d) {
            this.abc10063 = 0.9946981f;
        }
        if (this.abc10071 == null) {
            this.abc10071 = new String[10];
        }
        if (this.abc0 == null) {
            this.abc0 = new String[10];
            if (this.abc10055.size() < 8) {
                this.abc10055.add(7);
            }
            if (this.abc10024.size() > 7) {
                this.abc10024.add("ejudic");
            }
            int[] iArr2 = this.abc1002;
            if (iArr2 != null) {
                iArr2[5] = 0;
            }
        }
        if (this.abc10073 == null) {
            this.abc10073 = new String[10];
        }
        String[] strArr5 = this.abc10023;
        if (strArr5 != null) {
            strArr5[7] = "t ";
        }
        this.abc10049 = false;
    }
}
