package com.logomaster.logomaker;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bumptech.glide.Glide;
import com.facebook.appevents.UserDataStore;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.logomaster.logomaker.LogoConfirmDeleteDialog;
import com.logomaster.logomaker.LogoMyDesignMenuDialog;
import com.logomaster.logomaker.LogoRenameProjectDialog;
import com.logomaster.logomaker.adapter.LogoRvDesignAdapter;
import com.logomaster.logomaker.base.LogoBaseActivity;
import com.logomaster.logomaker.databinding.ActivityLogoMyDesignBinding;
import com.logomaster.logomaker.p131vm.LogoMyDesignVM;
import com.logomaster.logomaker.utils.LogoRvSimpleItemDecoration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoMyDesignActivity extends LogoBaseActivity {
    private static final String TAG = "LogoMyDesignActivity";
    private LogoRvDesignAdapter adapter;
    private ActivityLogoMyDesignBinding binding;
    private LogoDesignEntity currentEntity;
    private int currentIndex;
    private boolean isSelectAll;
    private LogoConfirmDeleteDialog logoConfirmDeleteDialog;
    private LogoLoadingDialog logoLoadingDialog;
    private LogoMyDesignMenuDialog logoMyDesignMenuDialog;
    private LogoRenameProjectDialog logoRenameProjectDialog;
    private Toast toast;
    private LogoMyDesignVM viewModel;
    public String abc1000 = "that in";
    public boolean abc0 = true;
    public ArrayList<String> abc1001 = new ArrayList<>();
    public boolean abc1002 = false;
    public int abc1 = 8;
    public float abc1003 = 0.31957996f;
    public int[] abc1004 = new int[10];
    public String abc2 = "需求示";
    public int[] abc1005 = new int[14];
    public String abc1006 = "well, dul";
    public float abc3 = 0.1950956f;
    public int abc1007 = 2;
    public float abc1008 = 0.047285795f;
    public double abc4 = 0.8263125051235156d;
    public double abc1009 = 0.4862884421178757d;
    public int[] abc10010 = new int[18];
    public float abc5 = 0.9475277f;
    public ArrayList<Integer> abc10011 = new ArrayList<>();
    public String[] abc10012 = new String[17];
    public float abc6 = 0.46565014f;
    public String abc10013 = ReportUtil.f18058a;
    public ArrayList<String> abc10014 = new ArrayList<>();
    public String[] abc7 = new String[15];
    public String[] abc10015 = new String[10];
    public ArrayList<Integer> abc10016 = new ArrayList<>();
    public ArrayList<Integer> abc8 = new ArrayList<>();
    public boolean abc10017 = false;
    public float abc10018 = 0.2524488f;
    public ArrayList<String> abc9 = new ArrayList<>();
    public ArrayList<String> abc10019 = new ArrayList<>();
    public ArrayList<String> abc10020 = new ArrayList<>();
    public ArrayList<Integer> abc10 = new ArrayList<>();
    public ArrayList<Integer> abc10021 = new ArrayList<>();
    public boolean abc10022 = true;
    private Handler handler = new HandlerC9555e(Looper.getMainLooper());
    public ArrayList<Integer> abc10023 = new ArrayList<>();

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9551a implements View.OnClickListener {
        public View$OnClickListenerC9551a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity logoMyDesignActivity;
            LogoMyDesignActivity.this.toRename();
            int i = 0;
            int i2 = 0;
            while (true) {
                logoMyDesignActivity = LogoMyDesignActivity.this;
                int i3 = logoMyDesignActivity.abc1007;
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i2 >= i3) {
                    break;
                }
                if (logoMyDesignActivity.abc10016.size() > 1) {
                    LogoMyDesignActivity.this.abc10016.add(8);
                }
                i2++;
            }
            String[] strArr = logoMyDesignActivity.abc10012;
            if (strArr != null) {
                strArr[2] = "took";
            }
            logoMyDesignActivity.abc1002 = !logoMyDesignActivity.abc1002;
            ArrayList<Integer> arrayList = logoMyDesignActivity.abc10;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10.remove(0);
                ArrayList<Integer> arrayList2 = LogoMyDesignActivity.this.abc10023;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoMyDesignActivity.this.abc10023.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                logoMyDesignActivity2.abc10022 = !logoMyDesignActivity2.abc10022;
                if (logoMyDesignActivity2.abc1005 != null) {
                    while (true) {
                        int[] iArr = LogoMyDesignActivity.this.abc1005;
                        if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i] = 3;
                        i++;
                    }
                }
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc10022 = !logoMyDesignActivity3.abc10022;
            logoMyDesignActivity3.abc1009 = logoMyDesignActivity3.abc1009 < 0.6339743969490719d ? 0.7316168660080539d : 0.6016658375594586d;
            logoMyDesignActivity3.abc1007 = 7;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9552b implements View.OnClickListener {
        public View$OnClickListenerC9552b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity.this.toCopy();
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.abc10017 = !logoMyDesignActivity.abc10017;
            if (logoMyDesignActivity.abc10015 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoMyDesignActivity.this.abc10015;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc1008 += 0.37247682f;
            logoMyDesignActivity2.abc6 = 0.081724524f;
            if (!TextUtils.isEmpty(logoMyDesignActivity2.abc1000)) {
                int length = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length;
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            String[] strArr2 = logoMyDesignActivity3.abc10015;
            if (strArr2 != null) {
                strArr2[7] = "en gr";
            }
            logoMyDesignActivity3.abc1009 = 0.044391677162327614d;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9553c implements View.OnClickListener {
        public View$OnClickListenerC9553c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity logoMyDesignActivity;
            LogoMyDesignActivity.this.toDelete();
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc10022 = !logoMyDesignActivity2.abc10022;
            if (logoMyDesignActivity2.abc10015 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoMyDesignActivity.this.abc10015;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            if (LogoMyDesignActivity.this.abc10012 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = LogoMyDesignActivity.this.abc10012;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc8;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc8.remove(0);
                ArrayList<Integer> arrayList2 = LogoMyDesignActivity.this.abc10011;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoMyDesignActivity.this.abc10011.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                logoMyDesignActivity3.abc10017 = !logoMyDesignActivity3.abc10017;
                logoMyDesignActivity3.abc1007 = 8;
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc10013)) {
                int length = LogoMyDesignActivity.this.abc10013.length();
                LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length;
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                int length2 = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length2;
            }
            LogoMyDesignActivity.this.abc10022 = !logoMyDesignActivity.abc10022;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$d */
    /* loaded from: classes3.dex */
    public class C9554d implements LogoConfirmDeleteDialog.InterfaceC9598c {
        public C9554d() {
        }

        @Override // com.logomaster.logomaker.LogoConfirmDeleteDialog.InterfaceC9598c
        /* renamed from: a */
        public void mo9207a() {
            DeUtils.m769a(LogoMyDesignActivity.this.currentEntity.m249a());
            if (LogoMyDesignActivity.this.abc10023.size() > 3) {
                LogoMyDesignActivity.this.abc10023.add(1);
            }
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.abc10017 = !logoMyDesignActivity.abc10017;
            if (logoMyDesignActivity.abc10021.size() > 0) {
                LogoMyDesignActivity.this.abc10021.add(4);
            }
            ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc8;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc8.remove(0);
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity2.abc10011 == null) {
                    logoMyDesignActivity2.abc10011 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                logoMyDesignActivity3.abc1002 = true;
                if (logoMyDesignActivity3.abc10019 == null) {
                    logoMyDesignActivity3.abc10019 = new ArrayList<>();
                }
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            logoMyDesignActivity4.abc10017 = true;
            if (!TextUtils.isEmpty(logoMyDesignActivity4.abc1000)) {
                int length = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length;
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                int length2 = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length2;
            }
            LogoMyDesignActivity.this.adapter.remove(LogoMyDesignActivity.this.currentIndex);
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            String[] strArr = logoMyDesignActivity5.abc10012;
            if (strArr != null) {
                strArr[8] = "), a";
            }
            if (logoMyDesignActivity5.abc10011.size() > 8) {
                LogoMyDesignActivity.this.abc10011.add(2);
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity6.abc1004 == null) {
                logoMyDesignActivity6.abc1004 = new int[10];
            }
            ArrayList<Integer> arrayList2 = logoMyDesignActivity6.abc8;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMyDesignActivity.this.abc8.remove(0);
                if (LogoMyDesignActivity.this.abc10015 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr2 = LogoMyDesignActivity.this.abc10015;
                        if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i] = "string" + i;
                        i++;
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
                logoMyDesignActivity7.abc1009 = logoMyDesignActivity7.abc1009 > 0.38666101045962376d ? 0.19063038566708768d : 0.8569566367959341d;
                if (logoMyDesignActivity7.abc1004 == null) {
                    logoMyDesignActivity7.abc1004 = new int[10];
                }
            }
            if (LogoMyDesignActivity.this.abc10012 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr3 = LogoMyDesignActivity.this.abc10012;
                    if (i2 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i2] = "string" + i2;
                    i2++;
                }
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                int length3 = LogoMyDesignActivity.this.abc1006.length();
                LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length3;
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc10013)) {
                int length4 = LogoMyDesignActivity.this.abc10013.length();
                LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length4;
            }
            if (LogoMyDesignActivity.this.adapter.getList().size() > 0) {
                LogoMyDesignActivity.this.binding.ivNoData.setVisibility(8);
                if (LogoMyDesignActivity.this.abc1001.size() < 5) {
                    LogoMyDesignActivity.this.abc1001.add("w");
                }
                LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
                int[] iArr = logoMyDesignActivity8.abc10010;
                if (iArr != null) {
                    iArr[9] = 3;
                }
                if (!TextUtils.isEmpty(logoMyDesignActivity8.abc1000)) {
                    int length5 = LogoMyDesignActivity.this.abc1000.length();
                    LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length5;
                }
                LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity9.abc8 == null) {
                    logoMyDesignActivity9.abc8 = new ArrayList<>();
                    String[] strArr4 = LogoMyDesignActivity.this.abc10015;
                    if (strArr4 != null) {
                        strArr4[1] = null;
                    }
                    if (strArr4 != null) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr5 = LogoMyDesignActivity.this.abc10015;
                            if (i3 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                                break;
                            }
                            strArr5[i3] = "string" + i3;
                            i3++;
                        }
                    }
                    LogoMyDesignActivity.this.abc10017 = true;
                }
                LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
                String[] strArr6 = logoMyDesignActivity10.abc10015;
                if (strArr6 != null) {
                    strArr6[4] = null;
                }
                logoMyDesignActivity10.abc1003 *= 0.5135215f;
                ArrayList<String> arrayList3 = logoMyDesignActivity10.abc10019;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoMyDesignActivity.this.abc10019.remove(0);
                }
            } else {
                LogoMyDesignActivity.this.binding.ivNoData.setVisibility(0);
                LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
                logoMyDesignActivity11.abc10017 = false;
                ArrayList<String> arrayList4 = logoMyDesignActivity11.abc10019;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyDesignActivity.this.abc10019.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
                logoMyDesignActivity12.abc10013 = "t ";
                logoMyDesignActivity12.abc0 = !logoMyDesignActivity12.abc0;
                if (logoMyDesignActivity12.abc10021.size() > 6) {
                    LogoMyDesignActivity.this.abc10021.add(8);
                }
                ArrayList<Integer> arrayList5 = LogoMyDesignActivity.this.abc10016;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
                if (LogoMyDesignActivity.this.abc10012 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr7 = LogoMyDesignActivity.this.abc10012;
                        if (i4 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i4] = "string" + i4;
                        i4++;
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity13.abc0) {
                    logoMyDesignActivity13.abc7[0] = null;
                    String[] strArr8 = logoMyDesignActivity13.abc10015;
                    if (strArr8 != null) {
                        strArr8[7] = null;
                    }
                    if (strArr8 != null) {
                        strArr8[1] = "so m";
                    }
                    logoMyDesignActivity13.abc1009 = -logoMyDesignActivity13.abc1009;
                }
                if (logoMyDesignActivity13.abc10015 != null) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr9 = LogoMyDesignActivity.this.abc10015;
                        if (i5 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                            break;
                        }
                        strArr9[i5] = "string" + i5;
                        i5++;
                    }
                }
                if (LogoMyDesignActivity.this.abc10012 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr10 = LogoMyDesignActivity.this.abc10012;
                        if (i6 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                            break;
                        }
                        strArr10[i6] = "string" + i6;
                        i6++;
                    }
                }
                LogoMyDesignActivity.this.abc10017 = false;
            }
            ArrayList<String> arrayList6 = LogoMyDesignActivity.this.abc10020;
            if (arrayList6 != null && arrayList6.size() > 0) {
                LogoMyDesignActivity.this.abc10020.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
            logoMyDesignActivity14.abc1008 = 0.4005679f;
            if (!TextUtils.isEmpty(logoMyDesignActivity14.abc10013)) {
                int length6 = LogoMyDesignActivity.this.abc10013.length();
                LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length6;
            }
            LogoMyDesignActivity logoMyDesignActivity15 = LogoMyDesignActivity.this;
            String[] strArr11 = logoMyDesignActivity15.abc7;
            if (strArr11 != null) {
                strArr11[0] = null;
                int[] iArr2 = logoMyDesignActivity15.abc10010;
                if (iArr2 != null) {
                    iArr2[4] = 6;
                }
                logoMyDesignActivity15.abc1007 = 9;
                logoMyDesignActivity15.abc1009 = 0.7877708365972806d;
            }
            if (!TextUtils.isEmpty(logoMyDesignActivity15.abc1000)) {
                int length7 = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length7;
            }
            if (LogoMyDesignActivity.this.abc10019.size() < 9) {
                LogoMyDesignActivity.this.abc10019.add("no");
            }
            LogoMyDesignActivity logoMyDesignActivity16 = LogoMyDesignActivity.this;
            String[] strArr12 = logoMyDesignActivity16.abc10015;
            if (strArr12 != null) {
                strArr12[6] = null;
            }
            logoMyDesignActivity16.currentEntity = null;
            LogoMyDesignActivity logoMyDesignActivity17 = LogoMyDesignActivity.this;
            String[] strArr13 = logoMyDesignActivity17.abc10012;
            if (strArr13 != null) {
                strArr13[5] = "le re";
            }
            if (logoMyDesignActivity17.abc1001 == null) {
                logoMyDesignActivity17.abc1001 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity18 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity18.abc1005 == null) {
                logoMyDesignActivity18.abc1005 = new int[10];
            }
            logoMyDesignActivity18.abc0 = true;
            if (logoMyDesignActivity18.abc10020 == null) {
                logoMyDesignActivity18.abc10020 = new ArrayList<>();
            }
            ArrayList<String> arrayList7 = LogoMyDesignActivity.this.abc10019;
            if (arrayList7 != null && arrayList7.size() > 0) {
                LogoMyDesignActivity.this.abc10019.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity19 = LogoMyDesignActivity.this;
            logoMyDesignActivity19.abc10022 = !logoMyDesignActivity19.abc10022;
            logoMyDesignActivity19.currentIndex = -1;
            ArrayList<Integer> arrayList8 = LogoMyDesignActivity.this.abc10023;
            if (arrayList8 == null && arrayList8.size() > 0) {
                LogoMyDesignActivity.this.abc10023.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity20 = LogoMyDesignActivity.this;
            logoMyDesignActivity20.abc1002 = !logoMyDesignActivity20.abc1002;
            if (logoMyDesignActivity20.abc1009 > 0.13871079413009046d) {
                logoMyDesignActivity20.abc1009 = 0.3595293437372471d;
            }
            String[] strArr14 = logoMyDesignActivity20.abc7;
            if (strArr14 != null) {
                strArr14[5] = "    ";
                ArrayList<Integer> arrayList9 = logoMyDesignActivity20.abc10023;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    LogoMyDesignActivity.this.abc10023.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity21 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity21.abc10014 == null) {
                    logoMyDesignActivity21.abc10014 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList10 = LogoMyDesignActivity.this.abc10016;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
            }
            if (LogoMyDesignActivity.this.abc10011.size() > 2) {
                LogoMyDesignActivity.this.abc10011.add(8);
            }
            ArrayList<Integer> arrayList11 = LogoMyDesignActivity.this.abc10023;
            if (arrayList11 == null && arrayList11.size() > 0) {
                LogoMyDesignActivity.this.abc10023.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity22 = LogoMyDesignActivity.this;
            logoMyDesignActivity22.abc1009 = logoMyDesignActivity22.abc1009 > 0.03495761811877285d ? 0.9486799966890854d : 0.1913503814682247d;
            logoMyDesignActivity22.hideView(logoMyDesignActivity22.binding.llMenu, new View[0]);
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                int length8 = LogoMyDesignActivity.this.abc1006.length();
                LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length8;
            }
            LogoMyDesignActivity logoMyDesignActivity23 = LogoMyDesignActivity.this;
            String[] strArr15 = logoMyDesignActivity23.abc10015;
            if (strArr15 != null) {
                strArr15[6] = null;
            }
            int[] iArr3 = logoMyDesignActivity23.abc1004;
            if (iArr3 != null) {
                iArr3[9] = 0;
            }
            logoMyDesignActivity23.abc4 = -logoMyDesignActivity23.abc4;
            logoMyDesignActivity23.abc1008 = ((double) logoMyDesignActivity23.abc1008) > 0.3088597d ? 0.6435756f : 0.03910148f;
            if (!TextUtils.isEmpty(logoMyDesignActivity23.abc1000)) {
                int length9 = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length9;
            }
            LogoMyDesignActivity logoMyDesignActivity24 = LogoMyDesignActivity.this;
            logoMyDesignActivity24.abc10018 = 0.3214121f;
            if (logoMyDesignActivity24.adapter.getList().size() == 0) {
                LogoMyDesignActivity.this.isSelectAll = false;
                LogoMyDesignActivity logoMyDesignActivity25 = LogoMyDesignActivity.this;
                logoMyDesignActivity25.abc10022 = !logoMyDesignActivity25.abc10022;
                logoMyDesignActivity25.abc10018 = -logoMyDesignActivity25.abc10018;
                logoMyDesignActivity25.abc1009 -= 0.7045507586031966d;
                logoMyDesignActivity25.adapter.setShowCheckedBox(false);
                LogoMyDesignActivity logoMyDesignActivity26 = LogoMyDesignActivity.this;
                logoMyDesignActivity26.abc10017 = false;
                logoMyDesignActivity26.abc1003 = ((double) logoMyDesignActivity26.abc1003) > 0.61920106d ? 0.5563525f : 0.3059256f;
                if (logoMyDesignActivity26.abc1004 == null) {
                    logoMyDesignActivity26.abc1004 = new int[10];
                }
                logoMyDesignActivity26.binding.rlSelectItem.setVisibility(0);
                LogoMyDesignActivity logoMyDesignActivity27 = LogoMyDesignActivity.this;
                logoMyDesignActivity27.abc1002 = !logoMyDesignActivity27.abc1002;
                if (logoMyDesignActivity27.abc1004 == null) {
                    logoMyDesignActivity27.abc1004 = new int[10];
                }
                if (logoMyDesignActivity27.abc10016.size() < 9) {
                    LogoMyDesignActivity.this.abc10016.add(2);
                }
                LogoMyDesignActivity.this.binding.rlDelete.setVisibility(8);
                LogoMyDesignActivity logoMyDesignActivity28 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity28.abc10015 == null) {
                    logoMyDesignActivity28.abc10015 = new String[10];
                }
                ArrayList<Integer> arrayList12 = logoMyDesignActivity28.abc10016;
                if (arrayList12 == null && arrayList12.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity29 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity29.abc10021 == null) {
                    logoMyDesignActivity29.abc10021 = new ArrayList<>();
                }
                LogoMyDesignActivity.this.binding.rlSelectAll.setVisibility(8);
                if (LogoMyDesignActivity.this.abc1001.size() > 4) {
                    LogoMyDesignActivity.this.abc1001.add("ation (it");
                }
                LogoMyDesignActivity logoMyDesignActivity30 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity30.abc10011 == null) {
                    logoMyDesignActivity30.abc10011 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity31 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity31.abc10014 == null) {
                    logoMyDesignActivity31.abc10014 = new ArrayList<>();
                }
            }
            LogoMyDesignActivity logoMyDesignActivity32 = LogoMyDesignActivity.this;
            logoMyDesignActivity32.abc10018 = 0.005818844f;
            logoMyDesignActivity32.abc1009 -= 0.03735492350603031d;
            if (logoMyDesignActivity32.abc10019.size() < 0) {
                LogoMyDesignActivity.this.abc10019.add("t is");
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$e */
    /* loaded from: classes3.dex */
    public class HandlerC9555e extends Handler {
        public HandlerC9555e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            LogoMyDesignActivity.this.closeLoading();
            if (((LogoDesignEntity) message.getData().getSerializable("entity")) != null) {
                LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
                logoMyDesignActivity.abc1 = logoMyDesignActivity.abc1 < 4 ? 6 : 1;
                logoMyDesignActivity.hideView(logoMyDesignActivity.binding.llMenu, new View[0]);
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc2)) {
                    int length = LogoMyDesignActivity.this.abc2.length();
                    LogoMyDesignActivity.this.abc2 = LogoMyDesignActivity.this.abc2 + length;
                }
                if (LogoMyDesignActivity.this.toast != null) {
                    LogoMyDesignActivity.this.toast.cancel();
                    LogoMyDesignActivity.this.toast = null;
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc2)) {
                        int length2 = LogoMyDesignActivity.this.abc2.length();
                        LogoMyDesignActivity.this.abc2 = LogoMyDesignActivity.this.abc2 + length2;
                    }
                }
                if (LogoMyDesignActivity.this.abc7 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoMyDesignActivity.this.abc7;
                        if (i >= strArr.length) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                logoMyDesignActivity2.toast = Toast.makeText(logoMyDesignActivity2, (int) R.string.copy_successfully, 0);
                if (LogoMyDesignActivity.this.abc8.size() < 7) {
                    LogoMyDesignActivity.this.abc8.add(4);
                }
                LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                logoMyDesignActivity3.abc5 = 0.008367658f;
                ArrayList<Integer> arrayList = logoMyDesignActivity3.abc8;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMyDesignActivity.this.abc8.remove(0);
                }
                LogoMyDesignActivity.this.toast.show();
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc2)) {
                    int length3 = LogoMyDesignActivity.this.abc2.length();
                    LogoMyDesignActivity.this.abc2 = LogoMyDesignActivity.this.abc2 + length3;
                }
            } else {
                Toast.makeText(LogoMyDesignActivity.this, (int) R.string.copy_failed, 0).show();
                LogoMyDesignActivity.this.abc5 *= 0.043643773f;
            }
            LogoMyDesignActivity.this.abc6 = 0.71957165f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$f */
    /* loaded from: classes3.dex */
    public class RunnableC9556f implements Runnable {
        public RunnableC9556f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogoDesignEntity copyDesign = LogoMyDesignActivity.this.copyDesign();
            if (copyDesign != null) {
                LogoMyDesignActivity.this.viewModel.refreshListData();
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putSerializable("entity", copyDesign);
            message.setData(bundle);
            LogoMyDesignActivity.this.handler.sendMessage(message);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$g */
    /* loaded from: classes3.dex */
    public class C9557g implements LogoRenameProjectDialog.InterfaceC9654e {
        public C9557g() {
        }

        @Override // com.logomaster.logomaker.LogoRenameProjectDialog.InterfaceC9654e
        /* renamed from: a */
        public void mo9135a(String str) {
            LogoMyDesignActivity logoMyDesignActivity;
            boolean z;
            int i;
            LogoMyDesignActivity logoMyDesignActivity2;
            LogoMyDesignActivity logoMyDesignActivity3;
            if (LogoMyDesignActivity.this.currentEntity.m248b().equals(str)) {
                return;
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            int[] iArr = logoMyDesignActivity4.abc1005;
            if (iArr != null) {
                iArr[9] = 3;
            }
            if (logoMyDesignActivity4.abc10016.size() > 2) {
                LogoMyDesignActivity.this.abc10016.add(6);
            }
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            logoMyDesignActivity5.abc10017 = !logoMyDesignActivity5.abc10017;
            logoMyDesignActivity5.abc3 += 0.87310845f;
            logoMyDesignActivity5.abc1003 = 0.8159829f;
            if (logoMyDesignActivity5.abc10015 == null) {
                logoMyDesignActivity5.abc10015 = new String[10];
            }
            if (logoMyDesignActivity5.abc10016.size() < 2) {
                LogoMyDesignActivity.this.abc10016.add(1);
            }
            List<LogoDesignEntity> list = LogoMyDesignActivity.this.adapter.getList();
            if (LogoMyDesignActivity.this.abc10023.size() < 1) {
                LogoMyDesignActivity.this.abc10023.add(6);
            }
            ArrayList<String> arrayList = LogoMyDesignActivity.this.abc10020;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10020.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity6.abc10018 < 0.71813536d) {
                logoMyDesignActivity6.abc10018 = 0.079701126f;
            }
            logoMyDesignActivity6.abc4 = Math.abs(logoMyDesignActivity6.abc4);
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            logoMyDesignActivity7.abc10017 = !logoMyDesignActivity7.abc10017;
            if (logoMyDesignActivity7.abc10021.size() < 2) {
                LogoMyDesignActivity.this.abc10021.add(6);
            }
            LogoMyDesignActivity.this.abc10017 = !logoMyDesignActivity.abc10017;
            int size = list.size();
            LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
            logoMyDesignActivity8.abc1003 = 0.6338147f;
            int[] iArr2 = logoMyDesignActivity8.abc10010;
            if (iArr2 != null) {
                iArr2[5] = 0;
            }
            if (logoMyDesignActivity8.abc1005 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr3 = LogoMyDesignActivity.this.abc1005;
                    if (i2 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i2] = 5;
                    i2++;
                }
            }
            if (LogoMyDesignActivity.this.abc10.size() < 2) {
                LogoMyDesignActivity.this.abc10.add(6);
                int i3 = 0;
                while (true) {
                    logoMyDesignActivity3 = LogoMyDesignActivity.this;
                    int i4 = logoMyDesignActivity3.abc1007;
                    if (i4 > 3) {
                        i4 = 3;
                    }
                    if (i3 >= i4) {
                        break;
                    }
                    if (logoMyDesignActivity3.abc10010 == null) {
                        logoMyDesignActivity3.abc10010 = new int[10];
                    }
                    i3++;
                }
                if (!TextUtils.isEmpty(logoMyDesignActivity3.abc1006)) {
                    int length = LogoMyDesignActivity.this.abc1006.length();
                    LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length;
                }
                LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity9.abc1008 > 0.5714087d) {
                    logoMyDesignActivity9.abc1008 = 0.5431506f;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity10.abc10021 == null) {
                logoMyDesignActivity10.abc10021 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
            logoMyDesignActivity11.abc10022 = !logoMyDesignActivity11.abc10022;
            if (logoMyDesignActivity11.abc1005 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr4 = LogoMyDesignActivity.this.abc1005;
                    if (i5 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i5] = 5;
                    i5++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity12.abc10011 == null) {
                logoMyDesignActivity12.abc10011 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
            logoMyDesignActivity13.abc1002 = !logoMyDesignActivity13.abc1002;
            ArrayList<String> arrayList2 = logoMyDesignActivity13.abc10014;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoMyDesignActivity.this.abc10014.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
            logoMyDesignActivity14.abc6 = 0.918859f;
            logoMyDesignActivity14.abc1002 = true;
            if (!TextUtils.isEmpty(logoMyDesignActivity14.abc1006)) {
                int length2 = LogoMyDesignActivity.this.abc1006.length();
                LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length2;
            }
            if (LogoMyDesignActivity.this.abc1004 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr5 = LogoMyDesignActivity.this.abc1004;
                    if (i6 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i6] = 3;
                    i6++;
                }
            }
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z = false;
                    break;
                } else if (str.toLowerCase().equals(list.get(i7).m248b())) {
                    LogoMyDesignActivity logoMyDesignActivity15 = LogoMyDesignActivity.this;
                    logoMyDesignActivity15.abc10013 = "Ros";
                    int[] iArr6 = logoMyDesignActivity15.abc1004;
                    if (iArr6 != null) {
                        iArr6[8] = 0;
                    }
                    String[] strArr = logoMyDesignActivity15.abc10015;
                    if (strArr != null) {
                        strArr[3] = ReportUtil.f18058a;
                    }
                    String[] strArr2 = logoMyDesignActivity15.abc7;
                    if (strArr2 != null) {
                        strArr2[4] = "andro";
                        logoMyDesignActivity15.abc1008 = Math.abs(logoMyDesignActivity15.abc1008);
                        if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc10013)) {
                            int length3 = LogoMyDesignActivity.this.abc10013.length();
                            LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length3;
                        }
                        LogoMyDesignActivity.this.abc1003 *= 0.012723744f;
                    }
                    LogoMyDesignActivity logoMyDesignActivity16 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity16.abc10021 == null) {
                        logoMyDesignActivity16.abc10021 = new ArrayList<>();
                    }
                    LogoMyDesignActivity logoMyDesignActivity17 = LogoMyDesignActivity.this;
                    logoMyDesignActivity17.abc1002 = !logoMyDesignActivity17.abc1002;
                    if (!TextUtils.isEmpty(logoMyDesignActivity17.abc10013)) {
                        int length4 = LogoMyDesignActivity.this.abc10013.length();
                        LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length4;
                    }
                    z = true;
                } else {
                    LogoMyDesignActivity logoMyDesignActivity18 = LogoMyDesignActivity.this;
                    logoMyDesignActivity18.abc10018 *= 0.08026582f;
                    if (logoMyDesignActivity18.abc1005 == null) {
                        logoMyDesignActivity18.abc1005 = new int[10];
                    }
                    if (logoMyDesignActivity18.abc10023.size() > 9) {
                        LogoMyDesignActivity.this.abc10023.add(6);
                    }
                    LogoMyDesignActivity logoMyDesignActivity19 = LogoMyDesignActivity.this;
                    String[] strArr3 = logoMyDesignActivity19.abc7;
                    if (strArr3 != null) {
                        strArr3[4] = "技术消息搜索An";
                        if (!TextUtils.isEmpty(logoMyDesignActivity19.abc10013)) {
                            int length5 = LogoMyDesignActivity.this.abc10013.length();
                            LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length5;
                        }
                        LogoMyDesignActivity logoMyDesignActivity20 = LogoMyDesignActivity.this;
                        int[] iArr7 = logoMyDesignActivity20.abc1005;
                        if (iArr7 != null) {
                            iArr7[2] = 0;
                        }
                        logoMyDesignActivity20.abc10013 = "people re";
                    }
                    LogoMyDesignActivity logoMyDesignActivity21 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity21.abc1005 == null) {
                        logoMyDesignActivity21.abc1005 = new int[10];
                    }
                    if (logoMyDesignActivity21.abc10019.size() > 9) {
                        LogoMyDesignActivity.this.abc10019.add(" a li");
                    }
                    if (LogoMyDesignActivity.this.abc10019.size() < 2) {
                        LogoMyDesignActivity.this.abc10019.add("s surpris");
                    }
                    i7++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity22 = LogoMyDesignActivity.this;
            logoMyDesignActivity22.abc10022 = true;
            logoMyDesignActivity22.abc1009 = -logoMyDesignActivity22.abc1009;
            if (logoMyDesignActivity22.abc1004 != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr8 = LogoMyDesignActivity.this.abc1004;
                    if (i8 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                        break;
                    }
                    iArr8[i8] = 4;
                    i8++;
                }
            }
            if (LogoMyDesignActivity.this.abc7 != null) {
                int i9 = 0;
                while (true) {
                    logoMyDesignActivity2 = LogoMyDesignActivity.this;
                    String[] strArr4 = logoMyDesignActivity2.abc7;
                    if (i9 >= strArr4.length) {
                        break;
                    }
                    strArr4[i9] = "string" + i9;
                    LogoMyDesignActivity logoMyDesignActivity23 = LogoMyDesignActivity.this;
                    int[] iArr9 = logoMyDesignActivity23.abc1005;
                    if (iArr9 != null) {
                        iArr9[2] = 9;
                    }
                    int[] iArr10 = logoMyDesignActivity23.abc10010;
                    if (iArr10 != null) {
                        iArr10[8] = 7;
                    }
                    if (iArr10 != null) {
                        int i10 = 0;
                        while (true) {
                            int[] iArr11 = LogoMyDesignActivity.this.abc10010;
                            if (i10 < (iArr11.length > 3 ? 3 : iArr11.length)) {
                                iArr11[i10] = 6;
                                i10++;
                            }
                        }
                    }
                    i9++;
                }
                logoMyDesignActivity2.abc1007 = logoMyDesignActivity2.abc1007 > 7 ? 0 : 8;
                logoMyDesignActivity2.abc1000 = " and";
                if (logoMyDesignActivity2.abc10023.size() > 0) {
                    LogoMyDesignActivity.this.abc10023.add(2);
                }
            }
            LogoMyDesignActivity logoMyDesignActivity24 = LogoMyDesignActivity.this;
            logoMyDesignActivity24.abc1008 *= 0.6876152f;
            if (logoMyDesignActivity24.abc1004 != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr12 = LogoMyDesignActivity.this.abc1004;
                    if (i11 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i11] = 4;
                    i11++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity25 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity25.abc1009 > 0.15827917446273765d) {
                logoMyDesignActivity25.abc1009 = 0.7089750722855651d;
            }
            if (z) {
                Toast.makeText(logoMyDesignActivity25, (int) R.string.tips_rename, 1).show();
                ArrayList<String> arrayList3 = LogoMyDesignActivity.this.abc10020;
                if (arrayList3 == null || arrayList3.size() <= 0) {
                    i = 0;
                } else {
                    i = 0;
                    LogoMyDesignActivity.this.abc10020.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity26 = LogoMyDesignActivity.this;
                int[] iArr13 = logoMyDesignActivity26.abc1004;
                if (iArr13 != null) {
                    iArr13[7] = i;
                }
                if (logoMyDesignActivity26.abc1001.size() < 4) {
                    LogoMyDesignActivity.this.abc1001.add("is, a");
                }
                LogoMyDesignActivity logoMyDesignActivity27 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity27.abc10 == null) {
                    logoMyDesignActivity27.abc10 = new ArrayList<>();
                    LogoMyDesignActivity logoMyDesignActivity28 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity28.abc1001 == null) {
                        logoMyDesignActivity28.abc1001 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList4 = LogoMyDesignActivity.this.abc10019;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        LogoMyDesignActivity.this.abc10019.remove(0);
                    }
                    LogoMyDesignActivity logoMyDesignActivity29 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity29.abc10011 == null) {
                        logoMyDesignActivity29.abc10011 = new ArrayList<>();
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity30 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity30.abc1004 == null) {
                    logoMyDesignActivity30.abc1004 = new int[10];
                }
                if (!TextUtils.isEmpty(logoMyDesignActivity30.abc1000)) {
                    int length6 = LogoMyDesignActivity.this.abc1000.length();
                    LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length6;
                }
                if (LogoMyDesignActivity.this.abc10014.size() > 0) {
                    LogoMyDesignActivity.this.abc10014.add("rned");
                }
            } else {
                File file = new File(LogoMyDesignActivity.this.currentEntity.m249a().getParent() + File.separator + str);
                LogoMyDesignActivity logoMyDesignActivity31 = LogoMyDesignActivity.this;
                logoMyDesignActivity31.abc1009 = 0.03734279214738789d;
                logoMyDesignActivity31.abc1008 = logoMyDesignActivity31.abc1008 - 0.6908615f;
                String[] strArr5 = logoMyDesignActivity31.abc10015;
                if (strArr5 != null) {
                    strArr5[6] = " it";
                }
                ArrayList<Integer> arrayList5 = logoMyDesignActivity31.abc10;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoMyDesignActivity.this.abc10.remove(0);
                    LogoMyDesignActivity logoMyDesignActivity32 = LogoMyDesignActivity.this;
                    logoMyDesignActivity32.abc10018 = Math.abs(logoMyDesignActivity32.abc10018);
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc10013)) {
                        int length7 = LogoMyDesignActivity.this.abc10013.length();
                        LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length7;
                    }
                    LogoMyDesignActivity logoMyDesignActivity33 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity33.abc10011 == null) {
                        logoMyDesignActivity33.abc10011 = new ArrayList<>();
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity34 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity34.abc10015 == null) {
                    logoMyDesignActivity34.abc10015 = new String[10];
                }
                logoMyDesignActivity34.abc10018 -= 0.17444342f;
                if (logoMyDesignActivity34.abc10020.size() > 5) {
                    LogoMyDesignActivity.this.abc10020.add("ealize t");
                }
                if (LogoMyDesignActivity.this.currentEntity.m249a().renameTo(file)) {
                    LogoMyDesignActivity.this.currentEntity.m241i(new File(file, LogoMyDesignActivity.this.currentEntity.m246d().getName()));
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                        int length8 = LogoMyDesignActivity.this.abc1000.length();
                        LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length8;
                    }
                    int[] iArr14 = LogoMyDesignActivity.this.abc1005;
                    if (iArr14 != null) {
                        iArr14[4] = 5;
                    }
                    if (iArr14 != null) {
                        int i12 = 0;
                        while (true) {
                            int[] iArr15 = LogoMyDesignActivity.this.abc1005;
                            if (i12 >= (iArr15.length > 3 ? 3 : iArr15.length)) {
                                break;
                            }
                            iArr15[i12] = 4;
                            i12++;
                        }
                    }
                    if (LogoMyDesignActivity.this.abc8.size() > 3) {
                        LogoMyDesignActivity.this.abc8.add(0);
                        if (LogoMyDesignActivity.this.abc10020.size() > 4) {
                            LogoMyDesignActivity.this.abc10020.add("r a book");
                        }
                        LogoMyDesignActivity logoMyDesignActivity35 = LogoMyDesignActivity.this;
                        if (logoMyDesignActivity35.abc10012 == null) {
                            logoMyDesignActivity35.abc10012 = new String[10];
                        }
                        if (!TextUtils.isEmpty(logoMyDesignActivity35.abc10013)) {
                            int length9 = LogoMyDesignActivity.this.abc10013.length();
                            LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length9;
                        }
                    }
                    LogoMyDesignActivity logoMyDesignActivity36 = LogoMyDesignActivity.this;
                    logoMyDesignActivity36.abc10017 = !logoMyDesignActivity36.abc10017;
                    logoMyDesignActivity36.abc1003 = ((double) logoMyDesignActivity36.abc1003) < 0.74298966d ? 0.5477672f : 0.8492903f;
                    logoMyDesignActivity36.abc1007 = 4;
                    logoMyDesignActivity36.currentEntity.m243g(file);
                    LogoMyDesignActivity logoMyDesignActivity37 = LogoMyDesignActivity.this;
                    int[] iArr16 = logoMyDesignActivity37.abc10010;
                    if (iArr16 != null) {
                        iArr16[2] = 0;
                    }
                    logoMyDesignActivity37.abc1002 = false;
                    if (logoMyDesignActivity37.abc10023 == null) {
                        logoMyDesignActivity37.abc10023 = new ArrayList<>();
                    }
                    ArrayList<Integer> arrayList6 = LogoMyDesignActivity.this.abc8;
                    if (arrayList6 == null && arrayList6.size() > 0) {
                        LogoMyDesignActivity.this.abc8.remove(0);
                        LogoMyDesignActivity logoMyDesignActivity38 = LogoMyDesignActivity.this;
                        logoMyDesignActivity38.abc1000 = UserDataStore.GENDER;
                        logoMyDesignActivity38.abc1006 = "liar";
                        int i13 = 0;
                        while (true) {
                            LogoMyDesignActivity logoMyDesignActivity39 = LogoMyDesignActivity.this;
                            int i14 = logoMyDesignActivity39.abc1007;
                            if (i14 > 3) {
                                i14 = 3;
                            }
                            if (i13 >= i14) {
                                break;
                            }
                            logoMyDesignActivity39.abc1008 = ((double) logoMyDesignActivity39.abc1008) < 0.7574029d ? 0.026738405f : 0.62913823f;
                            i13++;
                        }
                    }
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                        int length10 = LogoMyDesignActivity.this.abc1006.length();
                        LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length10;
                    }
                    LogoMyDesignActivity logoMyDesignActivity40 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity40.abc10019 == null) {
                        logoMyDesignActivity40.abc10019 = new ArrayList<>();
                    }
                    LogoMyDesignActivity logoMyDesignActivity41 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity41.abc1004 == null) {
                        logoMyDesignActivity41.abc1004 = new int[10];
                    }
                    logoMyDesignActivity41.currentEntity.m242h(str);
                    if (LogoMyDesignActivity.this.abc1001.size() > 3) {
                        LogoMyDesignActivity.this.abc1001.add("putation");
                    }
                    LogoMyDesignActivity logoMyDesignActivity42 = LogoMyDesignActivity.this;
                    String[] strArr6 = logoMyDesignActivity42.abc10015;
                    if (strArr6 != null) {
                        strArr6[5] = null;
                    }
                    ArrayList<Integer> arrayList7 = logoMyDesignActivity42.abc10011;
                    if (arrayList7 == null && arrayList7.size() > 0) {
                        LogoMyDesignActivity.this.abc10011.remove(0);
                    }
                    LogoMyDesignActivity logoMyDesignActivity43 = LogoMyDesignActivity.this;
                    logoMyDesignActivity43.abc1 = 1;
                    if (logoMyDesignActivity43.abc10014 == null) {
                        logoMyDesignActivity43.abc10014 = new ArrayList<>();
                    }
                    LogoMyDesignActivity logoMyDesignActivity44 = LogoMyDesignActivity.this;
                    logoMyDesignActivity44.abc1007 = -logoMyDesignActivity44.abc1007;
                    if (logoMyDesignActivity44.abc10014.size() < 0) {
                        LogoMyDesignActivity.this.abc10014.add("l");
                    }
                    LogoMyDesignActivity.this.adapter.notifyItemChanged(LogoMyDesignActivity.this.currentIndex);
                    LogoMyDesignActivity logoMyDesignActivity45 = LogoMyDesignActivity.this;
                    logoMyDesignActivity45.abc10013 = "tury, it’";
                    if (logoMyDesignActivity45.abc10012 != null) {
                        int i15 = 0;
                        while (true) {
                            String[] strArr7 = LogoMyDesignActivity.this.abc10012;
                            if (i15 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                                break;
                            }
                            strArr7[i15] = "string" + i15;
                            i15++;
                        }
                    }
                    if (LogoMyDesignActivity.this.abc10020.size() < 1) {
                        LogoMyDesignActivity.this.abc10020.add("on");
                    }
                    LogoMyDesignActivity logoMyDesignActivity46 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity46.abc1 < 0) {
                        logoMyDesignActivity46.abc1 = 0;
                        logoMyDesignActivity46.abc1007 = logoMyDesignActivity46.abc1007 > 0 ? 6 : 2;
                        String[] strArr8 = logoMyDesignActivity46.abc10012;
                        if (strArr8 != null) {
                            strArr8[7] = " ";
                        }
                        ArrayList<Integer> arrayList8 = logoMyDesignActivity46.abc10016;
                        if (arrayList8 == null && arrayList8.size() > 0) {
                            LogoMyDesignActivity.this.abc10016.remove(0);
                        }
                    }
                    LogoMyDesignActivity logoMyDesignActivity47 = LogoMyDesignActivity.this;
                    logoMyDesignActivity47.abc10022 = !logoMyDesignActivity47.abc10022;
                    ArrayList<String> arrayList9 = logoMyDesignActivity47.abc10019;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        LogoMyDesignActivity.this.abc10019.remove(0);
                    }
                    LogoMyDesignActivity logoMyDesignActivity48 = LogoMyDesignActivity.this;
                    logoMyDesignActivity48.abc1003 = ((double) logoMyDesignActivity48.abc1003) < 0.08316821d ? 0.76104444f : 0.22817546f;
                } else {
                    LogoLogUtils.m22166d(LogoMyDesignActivity.TAG, new Throwable(), "重命名失败：可能重名");
                    LogoMyDesignActivity logoMyDesignActivity49 = LogoMyDesignActivity.this;
                    logoMyDesignActivity49.abc1000 = "s mo";
                    if (logoMyDesignActivity49.abc1005 == null) {
                        logoMyDesignActivity49.abc1005 = new int[10];
                    }
                    int[] iArr17 = logoMyDesignActivity49.abc1005;
                    if (iArr17 != null) {
                        iArr17[3] = 0;
                    }
                    ArrayList<Integer> arrayList10 = logoMyDesignActivity49.abc10;
                    if (arrayList10 == null && arrayList10.size() > 0) {
                        LogoMyDesignActivity.this.abc10.remove(0);
                        if (LogoMyDesignActivity.this.abc1004 != null) {
                            int i16 = 0;
                            while (true) {
                                int[] iArr18 = LogoMyDesignActivity.this.abc1004;
                                if (i16 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                                    break;
                                }
                                iArr18[i16] = 9;
                                i16++;
                            }
                        }
                        LogoMyDesignActivity logoMyDesignActivity50 = LogoMyDesignActivity.this;
                        logoMyDesignActivity50.abc10022 = true;
                        if (logoMyDesignActivity50.abc10021 == null) {
                            logoMyDesignActivity50.abc10021 = new ArrayList<>();
                        }
                    }
                    if (LogoMyDesignActivity.this.abc10014.size() < 3) {
                        LogoMyDesignActivity.this.abc10014.add("ed rep");
                    }
                    LogoMyDesignActivity logoMyDesignActivity51 = LogoMyDesignActivity.this;
                    int[] iArr19 = logoMyDesignActivity51.abc10010;
                    if (iArr19 != null) {
                        iArr19[4] = 0;
                    }
                    if (logoMyDesignActivity51.abc1003 > 0.8239444d) {
                        logoMyDesignActivity51.abc1003 = 0.79837286f;
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity52 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity52.abc1007 < 0) {
                    logoMyDesignActivity52.abc1007 = 3;
                }
                logoMyDesignActivity52.abc1006 = "spira";
                logoMyDesignActivity52.abc10018 *= 0.8104317f;
                logoMyDesignActivity52.abc0 = true;
                logoMyDesignActivity52.abc1007 = Math.abs(logoMyDesignActivity52.abc1007);
                LogoMyDesignActivity logoMyDesignActivity53 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity53.abc10019 == null) {
                    logoMyDesignActivity53.abc10019 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity54 = LogoMyDesignActivity.this;
                logoMyDesignActivity54.abc1009 = -logoMyDesignActivity54.abc1009;
            }
            if (LogoMyDesignActivity.this.abc10023.size() < 2) {
                LogoMyDesignActivity.this.abc10023.add(7);
            }
            LogoMyDesignActivity logoMyDesignActivity55 = LogoMyDesignActivity.this;
            logoMyDesignActivity55.abc1006 = " well, du";
            logoMyDesignActivity55.abc1002 = !logoMyDesignActivity55.abc1002;
            if (logoMyDesignActivity55.abc10.size() > 2) {
                LogoMyDesignActivity.this.abc10.add(6);
                ArrayList<String> arrayList11 = LogoMyDesignActivity.this.abc10020;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    LogoMyDesignActivity.this.abc10020.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity56 = LogoMyDesignActivity.this;
                logoMyDesignActivity56.abc10018 = 0.068743706f;
                logoMyDesignActivity56.abc1008 = 0.05136496f;
            }
            LogoMyDesignActivity logoMyDesignActivity57 = LogoMyDesignActivity.this;
            logoMyDesignActivity57.abc1009 = 0.5036954339491021d;
            logoMyDesignActivity57.abc10017 = true;
            if (logoMyDesignActivity57.abc10020.size() > 4) {
                LogoMyDesignActivity.this.abc10020.add(" rece");
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$h  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9558h implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15786a;

        public animationAnimation$AnimationListenerC9558h(View view) {
            this.f15786a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15786a.clearAnimation();
            if (LogoMyDesignActivity.this.abc10021.size() > 9) {
                LogoMyDesignActivity.this.abc10021.add(9);
            }
            ArrayList<String> arrayList = LogoMyDesignActivity.this.abc10014;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10014.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.abc1000 = "t is ech";
            if (logoMyDesignActivity.abc9 == null) {
                logoMyDesignActivity.abc9 = new ArrayList<>();
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity2.abc10021 == null) {
                    logoMyDesignActivity2.abc10021 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList2 = LogoMyDesignActivity.this.abc10011;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoMyDesignActivity.this.abc10011.remove(0);
                }
                if (LogoMyDesignActivity.this.abc10015 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoMyDesignActivity.this.abc10015;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc1009 = 0.9056183370578277d;
            ArrayList<Integer> arrayList3 = logoMyDesignActivity3.abc10016;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoMyDesignActivity.this.abc10016.remove(0);
            }
            if (LogoMyDesignActivity.this.abc10011.size() < 0) {
                LogoMyDesignActivity.this.abc10011.add(4);
            }
            this.f15786a.setEnabled(true);
            ArrayList<String> arrayList4 = LogoMyDesignActivity.this.abc10020;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoMyDesignActivity.this.abc10020.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            logoMyDesignActivity4.abc10018 = 0.79199517f;
            if (logoMyDesignActivity4.abc10012 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = LogoMyDesignActivity.this.abc10012;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            logoMyDesignActivity5.abc0 = !logoMyDesignActivity5.abc0;
            logoMyDesignActivity5.abc1002 = true;
            logoMyDesignActivity5.abc1002 = !true;
            logoMyDesignActivity5.abc1003 = 0.9317088f;
            this.f15786a.setTag(null);
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity6.abc10016 == null) {
                logoMyDesignActivity6.abc10016 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList5 = LogoMyDesignActivity.this.abc10021;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoMyDesignActivity.this.abc10021.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            logoMyDesignActivity7.abc10022 = true;
            if (logoMyDesignActivity7.abc4 < 0.5228824124977796d) {
                logoMyDesignActivity7.abc4 = 0.476720007306752d;
                logoMyDesignActivity7.abc10018 = ((double) logoMyDesignActivity7.abc10018) < 0.4897325d ? 0.031846702f : 0.021428823f;
                if (!TextUtils.isEmpty(logoMyDesignActivity7.abc10013)) {
                    int length = LogoMyDesignActivity.this.abc10013.length();
                    LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length;
                }
                LogoMyDesignActivity.this.abc1002 = true;
            }
            LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
            logoMyDesignActivity8.abc10022 = !logoMyDesignActivity8.abc10022;
            logoMyDesignActivity8.abc10017 = !logoMyDesignActivity8.abc10017;
            if (logoMyDesignActivity8.abc1009 < 0.26277479295978967d) {
                logoMyDesignActivity8.abc1009 = 0.08853331779868912d;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$i  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationAnimation$AnimationListenerC9559i implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f15788a;

        /* renamed from: b */
        public final /* synthetic */ View[] f15789b;

        public animationAnimation$AnimationListenerC9559i(View view, View[] viewArr) {
            this.f15788a = view;
            this.f15789b = viewArr;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15788a.clearAnimation();
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.abc10017 = true;
            logoMyDesignActivity.abc10022 = false;
            if (logoMyDesignActivity.abc10014.size() < 4) {
                LogoMyDesignActivity.this.abc10014.add("egativ");
            }
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc5 = 0.96189266f;
            logoMyDesignActivity2.abc1000 = "ion fo";
            if (logoMyDesignActivity2.abc10010 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoMyDesignActivity.this.abc10010;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 1;
                    i++;
                }
            }
            LogoMyDesignActivity.this.abc1002 = true;
            this.f15788a.setVisibility(8);
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity3.abc1005 == null) {
                logoMyDesignActivity3.abc1005 = new int[10];
            }
            logoMyDesignActivity3.abc1009 = 0.15346801941304067d;
            if (logoMyDesignActivity3.abc10010 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = LogoMyDesignActivity.this.abc10010;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 0;
                    i2++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity4.abc4 < 0.8161993645178773d) {
                logoMyDesignActivity4.abc4 = 0.23123425633057815d;
                if (logoMyDesignActivity4.abc1005 == null) {
                    logoMyDesignActivity4.abc1005 = new int[10];
                }
                float f = logoMyDesignActivity4.abc10018 - 0.5882128f;
                logoMyDesignActivity4.abc10018 = f;
                logoMyDesignActivity4.abc10018 = -f;
            }
            int[] iArr3 = logoMyDesignActivity4.abc1004;
            if (iArr3 != null) {
                iArr3[4] = 0;
            }
            ArrayList<Integer> arrayList = logoMyDesignActivity4.abc10021;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10021.remove(0);
            }
            LogoMyDesignActivity.this.abc1003 = 0.8883212f;
            this.f15788a.setTag(null);
            if (LogoMyDesignActivity.this.abc10021.size() < 1) {
                LogoMyDesignActivity.this.abc10021.add(1);
            }
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            int[] iArr4 = logoMyDesignActivity5.abc10010;
            if (iArr4 != null) {
                iArr4[3] = 9;
            }
            logoMyDesignActivity5.abc10022 = false;
            logoMyDesignActivity5.abc3 = ((double) logoMyDesignActivity5.abc3) > 0.905586d ? 0.7971126f : 0.68640226f;
            if (logoMyDesignActivity5.abc10021 == null) {
                logoMyDesignActivity5.abc10021 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            logoMyDesignActivity6.abc10017 = true;
            if (logoMyDesignActivity6.abc1004 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr5 = LogoMyDesignActivity.this.abc1004;
                    if (i3 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i3] = 5;
                    i3++;
                }
            }
            int i4 = 0;
            while (true) {
                View[] viewArr = this.f15789b;
                if (i4 >= viewArr.length) {
                    break;
                }
                viewArr[i4].setVisibility(8);
                ArrayList<Integer> arrayList2 = LogoMyDesignActivity.this.abc10016;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
                if (LogoMyDesignActivity.this.abc10014.size() < 7) {
                    LogoMyDesignActivity.this.abc10014.add("efined wha");
                }
                LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity7.abc10012 == null) {
                    logoMyDesignActivity7.abc10012 = new String[10];
                }
                if (logoMyDesignActivity7.abc8.size() < 1) {
                    LogoMyDesignActivity.this.abc8.add(3);
                    if (LogoMyDesignActivity.this.abc1005 != null) {
                        int i5 = 0;
                        while (true) {
                            int[] iArr6 = LogoMyDesignActivity.this.abc1005;
                            if (i5 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                                break;
                            }
                            iArr6[i5] = 9;
                            i5++;
                        }
                    }
                    ArrayList<String> arrayList3 = LogoMyDesignActivity.this.abc1001;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        LogoMyDesignActivity.this.abc1001.remove(0);
                    }
                    LogoMyDesignActivity.this.abc1007 = 6;
                }
                LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
                logoMyDesignActivity8.abc1007 = 0;
                logoMyDesignActivity8.abc10018 -= 0.14165133f;
                logoMyDesignActivity8.abc1008 = ((double) logoMyDesignActivity8.abc1008) < 0.6577741d ? 0.8412142f : 0.9588177f;
                i4++;
            }
            ArrayList<Integer> arrayList4 = LogoMyDesignActivity.this.abc10021;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoMyDesignActivity.this.abc10021.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity9.abc10021 == null) {
                logoMyDesignActivity9.abc10021 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity10.abc10016 == null) {
                logoMyDesignActivity10.abc10016 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity11.abc8 == null) {
                logoMyDesignActivity11.abc8 = new ArrayList<>();
                LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity12.abc1004 == null) {
                    logoMyDesignActivity12.abc1004 = new int[10];
                }
                int[] iArr7 = logoMyDesignActivity12.abc10010;
                if (iArr7 != null) {
                    iArr7[5] = 6;
                }
                if (logoMyDesignActivity12.abc1005 == null) {
                    logoMyDesignActivity12.abc1005 = new int[10];
                }
            }
            ArrayList<String> arrayList5 = LogoMyDesignActivity.this.abc10020;
            if (arrayList5 != null && arrayList5.size() > 0) {
                LogoMyDesignActivity.this.abc10020.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
            logoMyDesignActivity13.abc1002 = true ^ logoMyDesignActivity13.abc1002;
            if (logoMyDesignActivity13.abc10023.size() < 4) {
                LogoMyDesignActivity.this.abc10023.add(5);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$j */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9560j implements View.OnClickListener {
        public View$OnClickListenerC9560j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity logoMyDesignActivity;
            LogoMyDesignActivity.this.onBackPressed();
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity2.abc10021 == null) {
                logoMyDesignActivity2.abc10021 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc10022 = !logoMyDesignActivity3.abc10022;
            if (logoMyDesignActivity3.abc10011 == null) {
                logoMyDesignActivity3.abc10011 = new ArrayList<>();
            }
            int i = 0;
            while (true) {
                logoMyDesignActivity = LogoMyDesignActivity.this;
                if (i >= logoMyDesignActivity.abc1) {
                    break;
                }
                logoMyDesignActivity.abc0 = false;
                logoMyDesignActivity.abc10022 = true;
                int[] iArr = logoMyDesignActivity.abc1005;
                if (iArr != null) {
                    iArr[0] = 0;
                }
                if (logoMyDesignActivity.abc10023 == null) {
                    logoMyDesignActivity.abc10023 = new ArrayList<>();
                }
                i++;
            }
            logoMyDesignActivity.abc1008 = 0.57572633f;
            logoMyDesignActivity.abc1008 = Math.abs(0.57572633f);
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity4.abc10011 == null) {
                logoMyDesignActivity4.abc10011 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$k */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9561k implements View.OnClickListener {
        public View$OnClickListenerC9561k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.hideView(logoMyDesignActivity.binding.llMenu, new View[0]);
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc1009 = 0.2675178246299409d;
            if (logoMyDesignActivity2.abc10023 == null) {
                logoMyDesignActivity2.abc10023 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc1002 = true;
            if (logoMyDesignActivity3.abc7 == null) {
                logoMyDesignActivity3.abc7 = new String[10];
                int[] iArr = logoMyDesignActivity3.abc10010;
                if (iArr != null) {
                    iArr[6] = 6;
                }
                if (logoMyDesignActivity3.abc1007 < 0) {
                    logoMyDesignActivity3.abc1007 = 2;
                }
                logoMyDesignActivity3.abc1002 = true;
            }
            logoMyDesignActivity3.abc10022 = false;
            String[] strArr = logoMyDesignActivity3.abc10015;
            if (strArr != null) {
                strArr[4] = "hink";
            }
            logoMyDesignActivity3.abc1006 = "t";
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$l */
    /* loaded from: classes3.dex */
    public class C9562l implements Observer<List<LogoDesignEntity>> {
        public C9562l() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<LogoDesignEntity> list) {
            LogoMyDesignActivity logoMyDesignActivity;
            if (list.size() > 0) {
                LogoMyDesignActivity.this.binding.ivNoData.setVisibility(8);
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity2.abc10015 == null) {
                    logoMyDesignActivity2.abc10015 = new String[10];
                }
                if (logoMyDesignActivity2.abc10014 == null) {
                    logoMyDesignActivity2.abc10014 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc10016;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
                if (LogoMyDesignActivity.this.abc9.size() < 6) {
                    LogoMyDesignActivity.this.abc9.add("ianshu");
                    ArrayList<Integer> arrayList2 = LogoMyDesignActivity.this.abc10016;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoMyDesignActivity.this.abc10016.remove(0);
                    }
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                        int length = LogoMyDesignActivity.this.abc1006.length();
                        LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length;
                    }
                    LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity3.abc10020 == null) {
                        logoMyDesignActivity3.abc10020 = new ArrayList<>();
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity4.abc10010 == null) {
                    logoMyDesignActivity4.abc10010 = new int[10];
                }
                logoMyDesignActivity4.abc10018 = -logoMyDesignActivity4.abc10018;
                String[] strArr = logoMyDesignActivity4.abc10012;
                if (strArr != null) {
                    strArr[9] = "is ech";
                }
            } else {
                LogoMyDesignActivity.this.binding.ivNoData.setVisibility(0);
                if (LogoMyDesignActivity.this.abc10014.size() > 4) {
                    LogoMyDesignActivity.this.abc10014.add("g,");
                }
                ArrayList<String> arrayList3 = LogoMyDesignActivity.this.abc10020;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoMyDesignActivity.this.abc10020.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
                logoMyDesignActivity5.abc10022 = false;
                logoMyDesignActivity5.abc0 = false;
                if (logoMyDesignActivity5.abc1005 == null) {
                    logoMyDesignActivity5.abc1005 = new int[10];
                }
                logoMyDesignActivity5.abc1006 = "gro";
                String[] strArr2 = logoMyDesignActivity5.abc10015;
                if (strArr2 != null) {
                    strArr2[9] = "hink";
                }
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity6.abc10023 == null) {
                logoMyDesignActivity6.abc10023 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            logoMyDesignActivity7.abc1006 = "he early ";
            if (logoMyDesignActivity7.abc1001 == null) {
                logoMyDesignActivity7.abc1001 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity8.abc8 == null) {
                logoMyDesignActivity8.abc8 = new ArrayList<>();
                LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
                logoMyDesignActivity9.abc1008 = 0.48185992f;
                logoMyDesignActivity9.abc10017 = !logoMyDesignActivity9.abc10017;
                if (logoMyDesignActivity9.abc10021.size() < 3) {
                    LogoMyDesignActivity.this.abc10021.add(4);
                }
            }
            LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
            logoMyDesignActivity10.abc1003 -= 0.08899182f;
            if (logoMyDesignActivity10.abc1001 == null) {
                logoMyDesignActivity10.abc1001 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity11.abc1008 > 0.068431616d) {
                logoMyDesignActivity11.abc1008 = 0.60609436f;
            }
            logoMyDesignActivity11.checkedState(list);
            LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
            logoMyDesignActivity12.abc1002 = !logoMyDesignActivity12.abc1002;
            if (logoMyDesignActivity12.abc10023.size() > 9) {
                LogoMyDesignActivity.this.abc10023.add(6);
            }
            LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
            logoMyDesignActivity13.abc1003 = Math.abs(logoMyDesignActivity13.abc1003);
            int i = 0;
            while (true) {
                logoMyDesignActivity = LogoMyDesignActivity.this;
                if (i >= logoMyDesignActivity.abc1) {
                    break;
                }
                String[] strArr3 = logoMyDesignActivity.abc7;
                if (strArr3 != null) {
                    strArr3[4] = null;
                    logoMyDesignActivity.abc10013 = "ti";
                    logoMyDesignActivity.abc1008 = ((double) logoMyDesignActivity.abc1008) > 0.9417998d ? 0.35555547f : 0.2905401f;
                    if (logoMyDesignActivity.abc10020.size() < 0) {
                        LogoMyDesignActivity.this.abc10020.add("he no");
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity14.abc1008 < 0.8992549d) {
                    logoMyDesignActivity14.abc1008 = 0.55646104f;
                }
                if (!TextUtils.isEmpty(logoMyDesignActivity14.abc1000)) {
                    int length2 = LogoMyDesignActivity.this.abc1000.length();
                    LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length2;
                }
                ArrayList<String> arrayList4 = LogoMyDesignActivity.this.abc1001;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyDesignActivity.this.abc1001.remove(0);
                }
                i++;
            }
            logoMyDesignActivity.abc10022 = !logoMyDesignActivity.abc10022;
            if (logoMyDesignActivity.abc10016 == null) {
                logoMyDesignActivity.abc10016 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity15 = LogoMyDesignActivity.this;
            int[] iArr = logoMyDesignActivity15.abc1004;
            if (iArr != null) {
                iArr[1] = 0;
            }
            logoMyDesignActivity15.adapter.setData(list);
            LogoMyDesignActivity logoMyDesignActivity16 = LogoMyDesignActivity.this;
            logoMyDesignActivity16.abc1008 = 0.2589727f;
            ArrayList<Integer> arrayList5 = logoMyDesignActivity16.abc10021;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoMyDesignActivity.this.abc10021.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity17 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity17.abc10020 == null) {
                logoMyDesignActivity17.abc10020 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity18 = LogoMyDesignActivity.this;
            logoMyDesignActivity18.abc0 = false;
            String[] strArr4 = logoMyDesignActivity18.abc10012;
            if (strArr4 != null) {
                strArr4[6] = "ople r";
            }
            logoMyDesignActivity18.abc10018 = -logoMyDesignActivity18.abc10018;
            logoMyDesignActivity18.abc1009 = logoMyDesignActivity18.abc1009 < 0.15676096590557087d ? 0.48886013352835733d : 0.868203818874009d;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$m */
    /* loaded from: classes3.dex */
    public class C9563m extends RecyclerView.OnScrollListener {
        public C9563m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (LogoMyDesignActivity.this.abc10020.size() < 1) {
                LogoMyDesignActivity.this.abc10020.add("ly ");
            }
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.abc10013 = "p";
            if (logoMyDesignActivity.abc10020 == null) {
                logoMyDesignActivity.abc10020 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc4 = -logoMyDesignActivity2.abc4;
            logoMyDesignActivity2.abc1002 = true ^ logoMyDesignActivity2.abc1002;
            logoMyDesignActivity2.abc10018 += 0.5084623f;
            logoMyDesignActivity2.abc1009 = logoMyDesignActivity2.abc1009 < 0.7005580578534855d ? 0.5726098874779525d : 0.9639332066020314d;
            logoMyDesignActivity2.hideView(logoMyDesignActivity2.binding.llMenu, new View[0]);
            ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc10023;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10023.remove(0);
            }
            if (LogoMyDesignActivity.this.abc10014.size() > 6) {
                LogoMyDesignActivity.this.abc10014.add(" book ");
            }
            if (LogoMyDesignActivity.this.abc1004 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = LogoMyDesignActivity.this.abc1004;
                    if (i2 >= (iArr.length <= 3 ? iArr.length : 3)) {
                        break;
                    }
                    iArr[i2] = 2;
                    i2++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc3 = 0.44292682f;
            logoMyDesignActivity3.abc1008 = 0.6481527f;
            if (logoMyDesignActivity3.abc10016 == null) {
                logoMyDesignActivity3.abc10016 = new ArrayList<>();
            }
            LogoMyDesignActivity.this.abc1002 = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.abc10017 = !logoMyDesignActivity.abc10017;
            if (logoMyDesignActivity.abc10018 < 0.37904376d) {
                logoMyDesignActivity.abc10018 = 0.058942914f;
            }
            if (!TextUtils.isEmpty(logoMyDesignActivity.abc1006)) {
                int length = LogoMyDesignActivity.this.abc1006.length();
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                logoMyDesignActivity2.abc1006 = LogoMyDesignActivity.this.abc1006 + length;
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc1 = -logoMyDesignActivity3.abc1;
            logoMyDesignActivity3.abc1009 = 0.5563126319734458d;
            ArrayList<String> arrayList = logoMyDesignActivity3.abc10014;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10014.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity4.abc10010 == null) {
                logoMyDesignActivity4.abc10010 = new int[10];
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$n */
    /* loaded from: classes3.dex */
    public class C9564n implements LogoRvDesignAdapter.InterfaceC9610c {

        /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$n$a */
        /* loaded from: classes3.dex */
        public class C9565a implements LogoMyDesignMenuDialog.InterfaceC9644e {
            public C9565a() {
            }

            @Override // com.logomaster.logomaker.LogoMyDesignMenuDialog.InterfaceC9644e
            /* renamed from: a */
            public void mo9152a() {
                LogoMyDesignActivity.this.toDelete();
                LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
                logoMyDesignActivity.abc10022 = false;
                ArrayList<String> arrayList = logoMyDesignActivity.abc1001;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoMyDesignActivity.this.abc1001.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity2.abc10018 > 0.9249134d) {
                    logoMyDesignActivity2.abc10018 = 0.9050493f;
                }
                logoMyDesignActivity2.abc2 = "t=dimen";
                logoMyDesignActivity2.abc1002 = !logoMyDesignActivity2.abc1002;
                if (logoMyDesignActivity2.abc10012 == null) {
                    logoMyDesignActivity2.abc10012 = new String[10];
                }
                if (logoMyDesignActivity2.abc10016.size() > 7) {
                    LogoMyDesignActivity.this.abc10016.add(4);
                }
            }

            @Override // com.logomaster.logomaker.LogoMyDesignMenuDialog.InterfaceC9644e
            /* renamed from: b */
            public void mo9151b() {
                LogoMyDesignActivity logoMyDesignActivity;
                LogoMyDesignActivity.this.toEdit();
                if (LogoMyDesignActivity.this.abc10023.size() < 5) {
                    LogoMyDesignActivity.this.abc10023.add(4);
                }
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                    int length = LogoMyDesignActivity.this.abc1006.length();
                    LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                    logoMyDesignActivity2.abc1006 = LogoMyDesignActivity.this.abc1006 + length;
                }
                int i = 0;
                while (true) {
                    logoMyDesignActivity = LogoMyDesignActivity.this;
                    int i2 = logoMyDesignActivity.abc1007;
                    if (i >= (i2 <= 3 ? i2 : 3)) {
                        break;
                    }
                    if (i2 > 0) {
                        logoMyDesignActivity.abc1007 = 2;
                    }
                    i++;
                }
                logoMyDesignActivity.abc2 = "https://g";
                if (!TextUtils.isEmpty(logoMyDesignActivity.abc1006)) {
                    int length2 = LogoMyDesignActivity.this.abc1006.length();
                    LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                    logoMyDesignActivity3.abc1006 = LogoMyDesignActivity.this.abc1006 + length2;
                }
                LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
                logoMyDesignActivity4.abc1008 = 0.9989503f;
                if (logoMyDesignActivity4.abc10019.size() < 7) {
                    LogoMyDesignActivity.this.abc10019.add("ea");
                }
            }

            @Override // com.logomaster.logomaker.LogoMyDesignMenuDialog.InterfaceC9644e
            /* renamed from: c */
            public void mo9150c() {
                LogoMyDesignActivity.this.toCopy();
                LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
                logoMyDesignActivity.abc1009 = logoMyDesignActivity.abc1009 < 0.6702392363972157d ? 0.2307935134678648d : 0.4952587313175121d;
                logoMyDesignActivity.abc1003 = 0.43301374f;
                if (logoMyDesignActivity.abc10010 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr = LogoMyDesignActivity.this.abc10010;
                        if (i >= (iArr.length <= 3 ? iArr.length : 3)) {
                            break;
                        }
                        iArr[i] = 5;
                        i++;
                    }
                }
                ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc8;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMyDesignActivity.this.abc8.remove(0);
                    ArrayList<Integer> arrayList2 = LogoMyDesignActivity.this.abc10011;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoMyDesignActivity.this.abc10011.remove(0);
                    }
                    ArrayList<String> arrayList3 = LogoMyDesignActivity.this.abc10019;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        LogoMyDesignActivity.this.abc10019.remove(0);
                    }
                    LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity2.abc10012 == null) {
                        logoMyDesignActivity2.abc10012 = new String[10];
                    }
                }
                ArrayList<String> arrayList4 = LogoMyDesignActivity.this.abc1001;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyDesignActivity.this.abc1001.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity3.abc10020 == null) {
                    logoMyDesignActivity3.abc10020 = new ArrayList<>();
                }
                LogoMyDesignActivity.this.abc1007 += 2;
            }

            @Override // com.logomaster.logomaker.LogoMyDesignMenuDialog.InterfaceC9644e
            /* renamed from: d */
            public void mo9149d() {
                LogoMyDesignActivity logoMyDesignActivity;
                LogoMyDesignActivity.this.toRename();
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity2.abc10011 == null) {
                    logoMyDesignActivity2.abc10011 = new ArrayList<>();
                }
                int i = 0;
                while (true) {
                    logoMyDesignActivity = LogoMyDesignActivity.this;
                    int i2 = logoMyDesignActivity.abc1007;
                    if (i2 > 3) {
                        i2 = 3;
                    }
                    if (i >= i2) {
                        break;
                    }
                    if (logoMyDesignActivity.abc10011 == null) {
                        logoMyDesignActivity.abc10011 = new ArrayList<>();
                    }
                    i++;
                }
                if (logoMyDesignActivity.abc10023 == null) {
                    logoMyDesignActivity.abc10023 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                logoMyDesignActivity3.abc6 -= 0.48105043f;
                ArrayList<String> arrayList = logoMyDesignActivity3.abc1001;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoMyDesignActivity.this.abc1001.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
                logoMyDesignActivity4.abc10022 = true;
                if (logoMyDesignActivity4.abc10018 > 0.91873324d) {
                    logoMyDesignActivity4.abc10018 = 0.09866762f;
                }
            }
        }

        public C9564n() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvDesignAdapter.InterfaceC9610c
        /* renamed from: a */
        public void mo9197a(int i, boolean z) {
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            logoMyDesignActivity.checkedState(logoMyDesignActivity.adapter.getList());
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            int[] iArr = logoMyDesignActivity2.abc1005;
            if (iArr != null) {
                iArr[8] = 0;
            }
            logoMyDesignActivity2.abc1002 = false;
            if (logoMyDesignActivity2.abc1001 == null) {
                logoMyDesignActivity2.abc1001 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc0 = !logoMyDesignActivity3.abc0;
            logoMyDesignActivity3.abc10022 = !logoMyDesignActivity3.abc10022;
            int[] iArr2 = logoMyDesignActivity3.abc1005;
            if (iArr2 != null) {
                iArr2[6] = 0;
            }
            if (logoMyDesignActivity3.abc1004 == null) {
                logoMyDesignActivity3.abc1004 = new int[10];
            }
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvDesignAdapter.InterfaceC9610c
        /* renamed from: b */
        public void mo9196b(int i, LogoDesignEntity logoDesignEntity) {
            LogoMyDesignActivity logoMyDesignActivity;
            LogoMyDesignActivity.this.currentIndex = i;
            if (LogoMyDesignActivity.this.abc10015 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoMyDesignActivity.this.abc10015;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            if (LogoMyDesignActivity.this.abc10021.size() > 7) {
                LogoMyDesignActivity.this.abc10021.add(2);
            }
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc10017 = false;
            ArrayList<String> arrayList = logoMyDesignActivity2.abc9;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc9.remove(0);
                LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                logoMyDesignActivity3.abc10013 = "vel wasn";
                logoMyDesignActivity3.abc10022 = true;
                if (logoMyDesignActivity3.abc1003 < 0.99746305d) {
                    logoMyDesignActivity3.abc1003 = 0.5569579f;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity4.abc10020 == null) {
                logoMyDesignActivity4.abc10020 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            logoMyDesignActivity5.abc1002 = !logoMyDesignActivity5.abc1002;
            logoMyDesignActivity5.abc1003 = ((double) logoMyDesignActivity5.abc1003) < 0.68666214d ? 0.57313764f : 0.49310434f;
            logoMyDesignActivity5.currentEntity = logoDesignEntity;
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            logoMyDesignActivity6.abc1003 = -logoMyDesignActivity6.abc1003;
            if (!TextUtils.isEmpty(logoMyDesignActivity6.abc1006)) {
                int length = LogoMyDesignActivity.this.abc1006.length();
                LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length;
            }
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity7.abc10020 == null) {
                logoMyDesignActivity7.abc10020 = new ArrayList<>();
            }
            LogoMyDesignActivity.this.abc2 = "英，并发送消息到";
            int i3 = 0;
            while (true) {
                logoMyDesignActivity = LogoMyDesignActivity.this;
                int i4 = logoMyDesignActivity.abc1007;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                logoMyDesignActivity.abc10017 = !logoMyDesignActivity.abc10017;
                i3++;
            }
            ArrayList<Integer> arrayList2 = logoMyDesignActivity.abc10021;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMyDesignActivity.this.abc10021.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
            logoMyDesignActivity8.abc1009 = 0.5448245270076523d;
            if (logoMyDesignActivity8.logoMyDesignMenuDialog == null) {
                LogoMyDesignActivity.this.logoMyDesignMenuDialog = new LogoMyDesignMenuDialog(LogoMyDesignActivity.this);
                ArrayList<String> arrayList3 = LogoMyDesignActivity.this.abc10019;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoMyDesignActivity.this.abc10019.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
                logoMyDesignActivity9.abc10018 = 0.103691936f;
                if (logoMyDesignActivity9.abc10014 == null) {
                    logoMyDesignActivity9.abc10014 = new ArrayList<>();
                }
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc2)) {
                    int length2 = LogoMyDesignActivity.this.abc2.length();
                    if (LogoMyDesignActivity.this.abc10014.size() < 4) {
                        LogoMyDesignActivity.this.abc10014.add("r being, ");
                    }
                    if (LogoMyDesignActivity.this.abc10015 != null) {
                        int i5 = 0;
                        while (true) {
                            String[] strArr2 = LogoMyDesignActivity.this.abc10015;
                            if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i5] = "string" + i5;
                            i5++;
                        }
                    }
                    LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity10.abc10023 == null) {
                        logoMyDesignActivity10.abc10023 = new ArrayList<>();
                    }
                    LogoMyDesignActivity.this.abc2 = LogoMyDesignActivity.this.abc2 + length2;
                    LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
                    logoMyDesignActivity11.abc1009 = 0.9263455516682245d;
                    if (logoMyDesignActivity11.abc10015 == null) {
                        logoMyDesignActivity11.abc10015 = new String[10];
                    }
                    if (logoMyDesignActivity11.abc10020.size() < 7) {
                        LogoMyDesignActivity.this.abc10020.add("nti");
                    }
                }
                if (LogoMyDesignActivity.this.abc10021.size() > 0) {
                    LogoMyDesignActivity.this.abc10021.add(9);
                }
                LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity12.abc1001 == null) {
                    logoMyDesignActivity12.abc1001 = new ArrayList<>();
                }
                LogoMyDesignActivity.this.abc1007 = 4;
            }
            LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
            int[] iArr = logoMyDesignActivity13.abc10010;
            if (iArr != null) {
                iArr[9] = 5;
            }
            if (logoMyDesignActivity13.abc1004 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr2 = LogoMyDesignActivity.this.abc1004;
                    if (i6 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i6] = 1;
                    i6++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
            logoMyDesignActivity14.abc1006 = "ative sent";
            logoMyDesignActivity14.abc5 = 0.9834625f;
            if (logoMyDesignActivity14.abc10014.size() < 5) {
                LogoMyDesignActivity.this.abc10014.add("is.unearne");
            }
            LogoMyDesignActivity logoMyDesignActivity15 = LogoMyDesignActivity.this;
            String[] strArr3 = logoMyDesignActivity15.abc10015;
            if (strArr3 != null) {
                strArr3[3] = null;
            }
            logoMyDesignActivity15.abc10022 = true;
            logoMyDesignActivity15.logoMyDesignMenuDialog.m9153c(LogoMyDesignActivity.this.currentEntity.m248b());
            LogoMyDesignActivity logoMyDesignActivity16 = LogoMyDesignActivity.this;
            logoMyDesignActivity16.abc1003 = ((double) logoMyDesignActivity16.abc1003) > 0.4855948d ? 0.8843246f : 0.43414044f;
            if (logoMyDesignActivity16.abc10020.size() < 1) {
                LogoMyDesignActivity.this.abc10020.add("s echo");
            }
            LogoMyDesignActivity logoMyDesignActivity17 = LogoMyDesignActivity.this;
            logoMyDesignActivity17.abc1009 = 0.8802753400474393d;
            ArrayList<Integer> arrayList4 = logoMyDesignActivity17.abc8;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoMyDesignActivity.this.abc8.remove(0);
                LogoMyDesignActivity logoMyDesignActivity18 = LogoMyDesignActivity.this;
                String[] strArr4 = logoMyDesignActivity18.abc10015;
                if (strArr4 != null) {
                    strArr4[7] = "alize";
                }
                if (logoMyDesignActivity18.abc10014 == null) {
                    logoMyDesignActivity18.abc10014 = new ArrayList<>();
                }
                LogoMyDesignActivity.this.abc10017 = true;
            }
            LogoMyDesignActivity logoMyDesignActivity19 = LogoMyDesignActivity.this;
            logoMyDesignActivity19.abc1008 = 0.19753414f;
            logoMyDesignActivity19.abc1006 = "o";
            if (logoMyDesignActivity19.abc10021 == null) {
                logoMyDesignActivity19.abc10021 = new ArrayList<>();
            }
            LogoMyDesignActivity.this.logoMyDesignMenuDialog.setOnMenuClickListener(new C9565a());
            LogoMyDesignActivity logoMyDesignActivity20 = LogoMyDesignActivity.this;
            logoMyDesignActivity20.abc1007 += 8;
            logoMyDesignActivity20.abc10018 = 0.9286654f;
            logoMyDesignActivity20.abc1007 = 5;
            logoMyDesignActivity20.abc5 = Math.abs(logoMyDesignActivity20.abc5);
            LogoMyDesignActivity logoMyDesignActivity21 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity21.abc1005 == null) {
                logoMyDesignActivity21.abc1005 = new int[10];
            }
            logoMyDesignActivity21.abc10017 = false;
            if (logoMyDesignActivity21.abc1005 == null) {
                logoMyDesignActivity21.abc1005 = new int[10];
            }
            logoMyDesignActivity21.logoMyDesignMenuDialog.show();
            LogoMyDesignActivity logoMyDesignActivity22 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity22.abc10021 == null) {
                logoMyDesignActivity22.abc10021 = new ArrayList<>();
            }
            if (LogoMyDesignActivity.this.abc10011.size() < 6) {
                LogoMyDesignActivity.this.abc10011.add(7);
            }
            if (LogoMyDesignActivity.this.abc1001.size() > 4) {
                LogoMyDesignActivity.this.abc1001.add("ly 1");
            }
            LogoMyDesignActivity logoMyDesignActivity23 = LogoMyDesignActivity.this;
            logoMyDesignActivity23.abc0 = !logoMyDesignActivity23.abc0;
            if (logoMyDesignActivity23.abc10020.size() < 1) {
                LogoMyDesignActivity.this.abc10020.add(" and Prej");
            }
            ArrayList<Integer> arrayList5 = LogoMyDesignActivity.this.abc10023;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoMyDesignActivity.this.abc10023.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity24 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity24.abc1009 < 0.06872805373387891d) {
                logoMyDesignActivity24.abc1009 = 0.923404158809357d;
            }
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvDesignAdapter.InterfaceC9610c
        /* renamed from: c */
        public void mo9195c(int i, LogoDesignEntity logoDesignEntity) {
            LogoMyDesignActivity logoMyDesignActivity;
            LogoMyDesignActivity.this.currentIndex = i;
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc1002 = true;
            logoMyDesignActivity2.abc1003 = ((double) logoMyDesignActivity2.abc1003) < 0.8786388d ? 0.8707599f : 0.18972147f;
            if (logoMyDesignActivity2.abc10014.size() > 1) {
                LogoMyDesignActivity.this.abc10014.add("being, we");
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc4 = logoMyDesignActivity3.abc4 < 0.8617366976243804d ? 0.11352001162478886d : 0.6823481036838478d;
            logoMyDesignActivity3.abc10022 = true;
            if (logoMyDesignActivity3.abc10021 == null) {
                logoMyDesignActivity3.abc10021 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc10021;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10021.remove(0);
            }
            LogoMyDesignActivity.this.currentEntity = logoDesignEntity;
            if (LogoMyDesignActivity.this.abc10011.size() < 6) {
                LogoMyDesignActivity.this.abc10011.add(2);
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            logoMyDesignActivity4.abc1009 = 0.19961453725391787d;
            logoMyDesignActivity4.abc10022 = !logoMyDesignActivity4.abc10022;
            if (logoMyDesignActivity4.abc8.size() > 8) {
                LogoMyDesignActivity.this.abc8.add(4);
                LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
                logoMyDesignActivity5.abc1009 -= 0.5346883749597666d;
                String[] strArr = logoMyDesignActivity5.abc10012;
                if (strArr != null) {
                    strArr[3] = "s echoed e";
                }
                if (logoMyDesignActivity5.abc1003 > 0.7027647d) {
                    logoMyDesignActivity5.abc1003 = 0.84644437f;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity6.abc1005 == null) {
                logoMyDesignActivity6.abc1005 = new int[10];
            }
            int[] iArr = logoMyDesignActivity6.abc10010;
            if (iArr != null) {
                iArr[0] = 0;
            }
            if (logoMyDesignActivity6.abc1001.size() > 3) {
                LogoMyDesignActivity.this.abc1001.add(" year whe");
            }
            LogoMyDesignActivity.this.toEdit();
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            int[] iArr2 = logoMyDesignActivity7.abc1004;
            if (iArr2 != null) {
                iArr2[9] = 2;
            }
            if (logoMyDesignActivity7.abc10016 == null) {
                logoMyDesignActivity7.abc10016 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
            logoMyDesignActivity8.abc10022 = true;
            logoMyDesignActivity8.abc4 *= 0.2316222883388528d;
            logoMyDesignActivity8.abc10018 = ((double) logoMyDesignActivity8.abc10018) < 0.048071682d ? 0.3380618f : 0.6478559f;
            if (logoMyDesignActivity8.abc10023.size() > 0) {
                LogoMyDesignActivity.this.abc10023.add(5);
            }
            LogoMyDesignActivity.this.abc10022 = !logoMyDesignActivity.abc10022;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$o */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9566o implements View.OnClickListener {
        public View$OnClickListenerC9566o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity logoMyDesignActivity;
            LogoMyDesignActivity logoMyDesignActivity2;
            List<LogoDesignEntity> list = LogoMyDesignActivity.this.adapter.getList();
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            String[] strArr = logoMyDesignActivity3.abc10015;
            if (strArr != null) {
                strArr[8] = null;
            }
            if (logoMyDesignActivity3.abc10023.size() > 2) {
                LogoMyDesignActivity.this.abc10023.add(0);
            }
            if (LogoMyDesignActivity.this.abc10019.size() > 2) {
                LogoMyDesignActivity.this.abc10019.add("udic");
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            logoMyDesignActivity4.abc6 = 0.6625389f;
            if (logoMyDesignActivity4.abc10020.size() < 1) {
                LogoMyDesignActivity.this.abc10020.add("iv");
            }
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity5.abc10020 == null) {
                logoMyDesignActivity5.abc10020 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity6.abc10016 == null) {
                logoMyDesignActivity6.abc10016 = new ArrayList<>();
            }
            int size = list.size();
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            String[] strArr2 = logoMyDesignActivity7.abc10015;
            if (strArr2 != null) {
                strArr2[5] = "th";
            }
            logoMyDesignActivity7.abc10022 = true;
            int[] iArr = logoMyDesignActivity7.abc10010;
            if (iArr != null) {
                iArr[4] = 0;
            }
            ArrayList<Integer> arrayList = logoMyDesignActivity7.abc10;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10.remove(0);
                LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
                int[] iArr2 = logoMyDesignActivity8.abc10010;
                if (iArr2 != null) {
                    iArr2[8] = 0;
                }
                if (logoMyDesignActivity8.abc10016 == null) {
                    logoMyDesignActivity8.abc10016 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity9.abc10015 == null) {
                    logoMyDesignActivity9.abc10015 = new String[10];
                }
            }
            ArrayList<String> arrayList2 = LogoMyDesignActivity.this.abc10020;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoMyDesignActivity.this.abc10020.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
            float f = logoMyDesignActivity10.abc10018 + 0.5821249f;
            logoMyDesignActivity10.abc10018 = f;
            logoMyDesignActivity10.abc10018 = -f;
            for (int i = 0; i < size; i++) {
                list.get(i).m244f(!LogoMyDesignActivity.this.isSelectAll);
                if (LogoMyDesignActivity.this.abc10020.size() > 1) {
                    LogoMyDesignActivity.this.abc10020.add("a");
                }
                ArrayList<String> arrayList3 = LogoMyDesignActivity.this.abc1001;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoMyDesignActivity.this.abc1001.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity11.abc10023 == null) {
                    logoMyDesignActivity11.abc10023 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
                logoMyDesignActivity12.abc3 -= 0.21668416f;
                ArrayList<Integer> arrayList4 = logoMyDesignActivity12.abc10023;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoMyDesignActivity.this.abc10023.remove(0);
                }
                if (LogoMyDesignActivity.this.abc10023.size() > 7) {
                    LogoMyDesignActivity.this.abc10023.add(3);
                }
                LogoMyDesignActivity.this.abc1000 = "' h";
            }
            LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity13.abc10010 == null) {
                logoMyDesignActivity13.abc10010 = new int[10];
            }
            logoMyDesignActivity13.abc10022 = !logoMyDesignActivity13.abc10022;
            logoMyDesignActivity13.abc10022 = false;
            logoMyDesignActivity13.abc6 = Math.abs(logoMyDesignActivity13.abc6);
            ArrayList<Integer> arrayList5 = LogoMyDesignActivity.this.abc10016;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoMyDesignActivity.this.abc10016.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity14.abc10018 < 0.76167023d) {
                logoMyDesignActivity14.abc10018 = 0.9520995f;
            }
            if (logoMyDesignActivity14.abc1003 < 0.5513898d) {
                logoMyDesignActivity14.abc1003 = 0.37256175f;
            }
            logoMyDesignActivity14.isSelectAll = !logoMyDesignActivity14.isSelectAll;
            LogoMyDesignActivity logoMyDesignActivity15 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity15.abc10011 == null) {
                logoMyDesignActivity15.abc10011 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity16 = LogoMyDesignActivity.this;
            logoMyDesignActivity16.abc10018 = ((double) logoMyDesignActivity16.abc10018) < 0.2868786d ? 0.9846263f : 0.5468595f;
            if (!TextUtils.isEmpty(logoMyDesignActivity16.abc10013)) {
                int length = LogoMyDesignActivity.this.abc10013.length();
                LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length;
            }
            LogoMyDesignActivity logoMyDesignActivity17 = LogoMyDesignActivity.this;
            logoMyDesignActivity17.abc3 = ((double) logoMyDesignActivity17.abc3) > 0.68107015d ? 0.19721109f : 0.1244486f;
            int[] iArr3 = logoMyDesignActivity17.abc1005;
            if (iArr3 != null) {
                iArr3[1] = 0;
            }
            if (!TextUtils.isEmpty(logoMyDesignActivity17.abc10013)) {
                int length2 = LogoMyDesignActivity.this.abc10013.length();
                LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length2;
            }
            LogoMyDesignActivity logoMyDesignActivity18 = LogoMyDesignActivity.this;
            logoMyDesignActivity18.abc10013 = "ing stude";
            logoMyDesignActivity18.adapter.notifyDataSetChanged();
            LogoMyDesignActivity logoMyDesignActivity19 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity19.abc10015 == null) {
                logoMyDesignActivity19.abc10015 = new String[10];
            }
            String[] strArr3 = logoMyDesignActivity19.abc10015;
            if (strArr3 != null) {
                strArr3[5] = null;
            }
            ArrayList<String> arrayList6 = logoMyDesignActivity19.abc1001;
            if (arrayList6 != null && arrayList6.size() > 0) {
                LogoMyDesignActivity.this.abc1001.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity20 = LogoMyDesignActivity.this;
            logoMyDesignActivity20.abc5 = ((double) logoMyDesignActivity20.abc5) > 0.2733217d ? 0.2862388f : 0.21732008f;
            logoMyDesignActivity20.abc1008 = ((double) logoMyDesignActivity20.abc1008) < 0.5697145d ? 0.057833135f : 0.57013065f;
            if (logoMyDesignActivity20.abc10011.size() > 0) {
                LogoMyDesignActivity.this.abc10011.add(5);
            }
            int i2 = 0;
            while (true) {
                logoMyDesignActivity = LogoMyDesignActivity.this;
                int i3 = logoMyDesignActivity.abc1007;
                if (i2 >= (i3 > 3 ? 3 : i3)) {
                    break;
                }
                logoMyDesignActivity.abc1007 = i3 + 0;
                i2++;
            }
            if (logoMyDesignActivity.isSelectAll) {
                LogoMyDesignActivity.this.binding.ivDelete.setImageResource(R.mipmap.all_delete);
                LogoMyDesignActivity logoMyDesignActivity21 = LogoMyDesignActivity.this;
                int[] iArr4 = logoMyDesignActivity21.abc1004;
                if (iArr4 != null) {
                    iArr4[3] = 0;
                }
                logoMyDesignActivity21.abc1006 = " pr";
                if (logoMyDesignActivity21.abc10016 == null) {
                    logoMyDesignActivity21.abc10016 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity22 = LogoMyDesignActivity.this;
                logoMyDesignActivity22.abc5 *= 0.8891757f;
                if (logoMyDesignActivity22.abc10011 == null) {
                    logoMyDesignActivity22.abc10011 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity23 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity23.abc10016 == null) {
                    logoMyDesignActivity23.abc10016 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity24 = LogoMyDesignActivity.this;
                int[] iArr5 = logoMyDesignActivity24.abc1005;
                if (iArr5 != null) {
                    iArr5[9] = 0;
                }
                logoMyDesignActivity24.binding.ivSelect.setImageResource(R.mipmap.selectall);
                if (LogoMyDesignActivity.this.abc10014.size() < 4) {
                    LogoMyDesignActivity.this.abc10014.add("o r");
                }
                LogoMyDesignActivity logoMyDesignActivity25 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity25.abc10019 == null) {
                    logoMyDesignActivity25.abc10019 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity26 = LogoMyDesignActivity.this;
                logoMyDesignActivity26.abc10017 = !logoMyDesignActivity26.abc10017;
                logoMyDesignActivity26.abc0 = !logoMyDesignActivity26.abc0;
                logoMyDesignActivity26.abc10017 = true;
                logoMyDesignActivity26.abc10022 = !logoMyDesignActivity26.abc10022;
                if (logoMyDesignActivity26.abc10011 == null) {
                    logoMyDesignActivity26.abc10011 = new ArrayList<>();
                }
            } else {
                LogoMyDesignActivity.this.binding.ivSelect.setImageResource(R.mipmap.unselectall);
                LogoMyDesignActivity logoMyDesignActivity27 = LogoMyDesignActivity.this;
                logoMyDesignActivity27.abc10022 = !logoMyDesignActivity27.abc10022;
                logoMyDesignActivity27.abc1000 = "nin";
                ArrayList<Integer> arrayList7 = logoMyDesignActivity27.abc10016;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity28 = LogoMyDesignActivity.this;
                logoMyDesignActivity28.abc3 = 0.48191082f;
                if (logoMyDesignActivity28.abc1003 < 0.13541096d) {
                    logoMyDesignActivity28.abc1003 = 0.28242284f;
                }
                if (logoMyDesignActivity28.abc10016 == null) {
                    logoMyDesignActivity28.abc10016 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity29 = LogoMyDesignActivity.this;
                logoMyDesignActivity29.abc10022 = !logoMyDesignActivity29.abc10022;
                logoMyDesignActivity29.binding.ivDelete.setImageResource(R.mipmap.all_delete2);
                LogoMyDesignActivity logoMyDesignActivity30 = LogoMyDesignActivity.this;
                logoMyDesignActivity30.abc10018 = -logoMyDesignActivity30.abc10018;
                if (logoMyDesignActivity30.abc1004 == null) {
                    logoMyDesignActivity30.abc1004 = new int[10];
                }
                logoMyDesignActivity30.abc1007 = -logoMyDesignActivity30.abc1007;
                logoMyDesignActivity30.abc6 = Math.abs(logoMyDesignActivity30.abc6);
                int i4 = 0;
                while (true) {
                    logoMyDesignActivity2 = LogoMyDesignActivity.this;
                    int i5 = logoMyDesignActivity2.abc1007;
                    if (i5 > 3) {
                        i5 = 3;
                    }
                    if (i4 >= i5) {
                        break;
                    }
                    logoMyDesignActivity2.abc1000 = "in th";
                    i4++;
                }
                logoMyDesignActivity2.abc1009 = 0.48060240698245793d;
                if (!TextUtils.isEmpty(logoMyDesignActivity2.abc1006)) {
                    int length3 = LogoMyDesignActivity.this.abc1006.length();
                    LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length3;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity31 = LogoMyDesignActivity.this;
            int[] iArr6 = logoMyDesignActivity31.abc1004;
            if (iArr6 != null) {
                iArr6[3] = 8;
            }
            logoMyDesignActivity31.abc10017 = !logoMyDesignActivity31.abc10017;
            if (logoMyDesignActivity31.abc10010 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr7 = LogoMyDesignActivity.this.abc10010;
                    if (i6 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                        break;
                    }
                    iArr7[i6] = 6;
                    i6++;
                }
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc2)) {
                int length4 = LogoMyDesignActivity.this.abc2.length();
                LogoMyDesignActivity logoMyDesignActivity32 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity32.abc10016 == null) {
                    logoMyDesignActivity32.abc10016 = new ArrayList<>();
                }
                ArrayList<String> arrayList8 = LogoMyDesignActivity.this.abc10020;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    LogoMyDesignActivity.this.abc10020.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity33 = LogoMyDesignActivity.this;
                logoMyDesignActivity33.abc1000 = "l you r";
                logoMyDesignActivity33.abc2 = LogoMyDesignActivity.this.abc2 + length4;
                LogoMyDesignActivity logoMyDesignActivity34 = LogoMyDesignActivity.this;
                logoMyDesignActivity34.abc10018 = 0.6107983f;
                ArrayList<Integer> arrayList9 = logoMyDesignActivity34.abc10016;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
                LogoMyDesignActivity.this.abc1000 = "en in";
            }
            LogoMyDesignActivity logoMyDesignActivity35 = LogoMyDesignActivity.this;
            logoMyDesignActivity35.abc10017 = false;
            ArrayList<String> arrayList10 = logoMyDesignActivity35.abc10014;
            if (arrayList10 != null && arrayList10.size() > 0) {
                LogoMyDesignActivity.this.abc10014.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity36 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity36.abc10016 == null) {
                logoMyDesignActivity36.abc10016 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$p */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9567p implements View.OnClickListener {

        /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$p$a */
        /* loaded from: classes3.dex */
        public class C9568a implements LogoConfirmDeleteDialog.InterfaceC9598c {
            public C9568a() {
            }

            @Override // com.logomaster.logomaker.LogoConfirmDeleteDialog.InterfaceC9598c
            /* renamed from: a */
            public void mo9207a() {
                LogoMyDesignActivity logoMyDesignActivity;
                int i;
                List<LogoDesignEntity> list = LogoMyDesignActivity.this.adapter.getList();
                if (LogoMyDesignActivity.this.abc10016.size() > 8) {
                    LogoMyDesignActivity.this.abc10016.add(4);
                }
                LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
                logoMyDesignActivity2.abc10018 = ((double) logoMyDesignActivity2.abc10018) < 0.7547544d ? 0.83694106f : 0.44428474f;
                int i2 = 0;
                if (logoMyDesignActivity2.abc10016.size() < 2) {
                    LogoMyDesignActivity.this.abc10016.add(0);
                }
                ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc8;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMyDesignActivity.this.abc8.remove(0);
                    LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity3.abc1005 == null) {
                        logoMyDesignActivity3.abc1005 = new int[10];
                    }
                    if (logoMyDesignActivity3.abc10020.size() < 6) {
                        LogoMyDesignActivity.this.abc10020.add("entiment i");
                    }
                    if (LogoMyDesignActivity.this.abc10021.size() < 6) {
                        LogoMyDesignActivity.this.abc10021.add(6);
                    }
                }
                int i3 = 0;
                while (true) {
                    logoMyDesignActivity = LogoMyDesignActivity.this;
                    int i4 = logoMyDesignActivity.abc1007;
                    i = 3;
                    if (i4 > 3) {
                        i4 = 3;
                    }
                    if (i3 >= i4) {
                        break;
                    }
                    ArrayList<String> arrayList2 = logoMyDesignActivity.abc10014;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        LogoMyDesignActivity.this.abc10014.remove(0);
                    }
                    i3++;
                }
                logoMyDesignActivity.abc1002 = !logoMyDesignActivity.abc1002;
                if (logoMyDesignActivity.abc10016.size() < 8) {
                    LogoMyDesignActivity.this.abc10016.add(1);
                }
                ArrayList arrayList3 = new ArrayList();
                LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity4.abc1009 > 0.4440461080624133d) {
                    logoMyDesignActivity4.abc1009 = 0.5682627548733256d;
                }
                ArrayList<String> arrayList4 = logoMyDesignActivity4.abc10019;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyDesignActivity.this.abc10019.remove(0);
                }
                LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
                logoMyDesignActivity5.abc10018 = ((double) logoMyDesignActivity5.abc10018) > 0.53683114d ? 0.81382257f : 0.08106017f;
                logoMyDesignActivity5.abc2 = "      ";
                if (logoMyDesignActivity5.abc1005 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr = LogoMyDesignActivity.this.abc1005;
                        if (i5 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i5] = 1;
                        i5++;
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
                logoMyDesignActivity6.abc1007 = 7;
                logoMyDesignActivity6.abc10018 = ((double) logoMyDesignActivity6.abc10018) > 0.63662434d ? 0.7558296f : 0.4561814f;
                int size = list.size();
                LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
                logoMyDesignActivity7.abc10018 *= 0.11305195f;
                logoMyDesignActivity7.abc1000 = "r";
                if (logoMyDesignActivity7.abc10011 == null) {
                    logoMyDesignActivity7.abc10011 = new ArrayList<>();
                }
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc2)) {
                    int length = LogoMyDesignActivity.this.abc2.length();
                    LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
                    int[] iArr2 = logoMyDesignActivity8.abc1004;
                    if (iArr2 != null) {
                        iArr2[8] = 0;
                    }
                    if (logoMyDesignActivity8.abc10012 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr = LogoMyDesignActivity.this.abc10012;
                            if (i6 >= (strArr.length > 3 ? 3 : strArr.length)) {
                                break;
                            }
                            strArr[i6] = "string" + i6;
                            i6++;
                        }
                    }
                    LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
                    logoMyDesignActivity9.abc10017 = true;
                    logoMyDesignActivity9.abc2 = LogoMyDesignActivity.this.abc2 + length;
                    LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
                    String[] strArr2 = logoMyDesignActivity10.abc10015;
                    if (strArr2 != null) {
                        strArr2[3] = "ery y";
                    }
                    if (logoMyDesignActivity10.abc10014 == null) {
                        logoMyDesignActivity10.abc10014 = new ArrayList<>();
                    }
                    LogoMyDesignActivity.this.abc10018 *= 0.062473595f;
                }
                if (LogoMyDesignActivity.this.abc10020.size() > 4) {
                    LogoMyDesignActivity.this.abc10020.add("sis, a");
                }
                LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
                logoMyDesignActivity11.abc10017 = !logoMyDesignActivity11.abc10017;
                logoMyDesignActivity11.abc1006 = "s bef";
                int i7 = 0;
                while (i7 < size) {
                    if (list.get(i7).m245e()) {
                        DeUtils.m769a(list.get(i7).m249a());
                        ArrayList<Integer> arrayList5 = LogoMyDesignActivity.this.abc10016;
                        if (arrayList5 == null && arrayList5.size() > 0) {
                            LogoMyDesignActivity.this.abc10016.remove(0);
                        }
                        if (LogoMyDesignActivity.this.abc10016.size() < i) {
                            LogoMyDesignActivity.this.abc10016.add(5);
                        }
                        if (LogoMyDesignActivity.this.abc1005 != null) {
                            int i8 = 0;
                            while (true) {
                                int[] iArr3 = LogoMyDesignActivity.this.abc1005;
                                if (i8 >= (iArr3.length > i ? i : iArr3.length)) {
                                    break;
                                }
                                iArr3[i8] = 8;
                                i8++;
                            }
                        }
                        LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
                        logoMyDesignActivity12.abc0 = true;
                        ArrayList<Integer> arrayList6 = logoMyDesignActivity12.abc10016;
                        if (arrayList6 == null && arrayList6.size() > 0) {
                            LogoMyDesignActivity.this.abc10016.remove(0);
                        }
                        LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
                        logoMyDesignActivity13.abc10013 = "r";
                        logoMyDesignActivity13.abc1000 = "ny mod";
                    } else {
                        arrayList3.add(list.get(i7));
                        LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
                        logoMyDesignActivity14.abc1007 = -logoMyDesignActivity14.abc1007;
                        if (logoMyDesignActivity14.abc10019 == null) {
                            logoMyDesignActivity14.abc10019 = new ArrayList<>();
                        }
                        if (LogoMyDesignActivity.this.abc10011.size() > i) {
                            LogoMyDesignActivity.this.abc10011.add(9);
                        }
                        LogoMyDesignActivity logoMyDesignActivity15 = LogoMyDesignActivity.this;
                        if (logoMyDesignActivity15.abc9 == null) {
                            logoMyDesignActivity15.abc9 = new ArrayList<>();
                            ArrayList<Integer> arrayList7 = LogoMyDesignActivity.this.abc10023;
                            if (arrayList7 == null && arrayList7.size() > 0) {
                                LogoMyDesignActivity.this.abc10023.remove(0);
                            }
                            if (LogoMyDesignActivity.this.abc10015 != null) {
                                int i9 = 0;
                                while (true) {
                                    String[] strArr3 = LogoMyDesignActivity.this.abc10015;
                                    if (i9 >= (strArr3.length > i ? i : strArr3.length)) {
                                        break;
                                    }
                                    strArr3[i9] = "string" + i9;
                                    i9++;
                                }
                            }
                            ArrayList<String> arrayList8 = LogoMyDesignActivity.this.abc10014;
                            if (arrayList8 != null && arrayList8.size() > 0) {
                                LogoMyDesignActivity.this.abc10014.remove(0);
                            }
                        }
                        LogoMyDesignActivity logoMyDesignActivity16 = LogoMyDesignActivity.this;
                        logoMyDesignActivity16.abc10013 = "ters than ";
                        logoMyDesignActivity16.abc10022 = false;
                        int[] iArr4 = logoMyDesignActivity16.abc1004;
                        if (iArr4 != null) {
                            iArr4[9] = 0;
                        }
                    }
                    LogoMyDesignActivity logoMyDesignActivity17 = LogoMyDesignActivity.this;
                    logoMyDesignActivity17.abc1009 = logoMyDesignActivity17.abc1009 > 0.524349426439982d ? 0.23931064150540315d : 0.6321264567336426d;
                    int[] iArr5 = logoMyDesignActivity17.abc10010;
                    if (iArr5 != null) {
                        iArr5[4] = 9;
                    }
                    logoMyDesignActivity17.abc10018 = 0.4827013f;
                    ArrayList<String> arrayList9 = logoMyDesignActivity17.abc9;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        LogoMyDesignActivity.this.abc9.remove(0);
                        if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc10013)) {
                            int length2 = LogoMyDesignActivity.this.abc10013.length();
                            LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length2;
                        }
                        if (LogoMyDesignActivity.this.abc10021.size() > 4) {
                            LogoMyDesignActivity.this.abc10021.add(1);
                        }
                        int[] iArr6 = LogoMyDesignActivity.this.abc1004;
                        if (iArr6 != null) {
                            iArr6[8] = 0;
                        }
                    }
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc10013)) {
                        int length3 = LogoMyDesignActivity.this.abc10013.length();
                        LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length3;
                    }
                    LogoMyDesignActivity logoMyDesignActivity18 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity18.abc10019 == null) {
                        logoMyDesignActivity18.abc10019 = new ArrayList<>();
                    }
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                        int length4 = LogoMyDesignActivity.this.abc1000.length();
                        LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length4;
                    }
                    i7++;
                    i = 3;
                }
                ArrayList<String> arrayList10 = LogoMyDesignActivity.this.abc1001;
                if (arrayList10 != null && arrayList10.size() > 0) {
                    LogoMyDesignActivity.this.abc1001.remove(0);
                }
                ArrayList<Integer> arrayList11 = LogoMyDesignActivity.this.abc10023;
                if (arrayList11 == null && arrayList11.size() > 0) {
                    LogoMyDesignActivity.this.abc10023.remove(0);
                }
                if (LogoMyDesignActivity.this.abc10021.size() < 8) {
                    LogoMyDesignActivity.this.abc10021.add(0);
                }
                LogoMyDesignActivity logoMyDesignActivity19 = LogoMyDesignActivity.this;
                logoMyDesignActivity19.abc0 = false;
                if (logoMyDesignActivity19.abc10011 == null) {
                    logoMyDesignActivity19.abc10011 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList12 = LogoMyDesignActivity.this.abc10011;
                if (arrayList12 == null && arrayList12.size() > 0) {
                    LogoMyDesignActivity.this.abc10011.remove(0);
                }
                if (LogoMyDesignActivity.this.abc10016.size() < 2) {
                    LogoMyDesignActivity.this.abc10016.add(4);
                }
                LogoMyDesignActivity.this.viewModel.setListData(arrayList3);
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                    int length5 = LogoMyDesignActivity.this.abc1000.length();
                    LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length5;
                }
                LogoMyDesignActivity logoMyDesignActivity20 = LogoMyDesignActivity.this;
                int[] iArr7 = logoMyDesignActivity20.abc1004;
                if (iArr7 != null) {
                    iArr7[2] = 3;
                }
                if (logoMyDesignActivity20.abc10019 == null) {
                    logoMyDesignActivity20.abc10019 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity21 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity21.abc1 < 0) {
                    logoMyDesignActivity21.abc1 = 2;
                    if (logoMyDesignActivity21.abc10011 == null) {
                        logoMyDesignActivity21.abc10011 = new ArrayList<>();
                    }
                    LogoMyDesignActivity logoMyDesignActivity22 = LogoMyDesignActivity.this;
                    int[] iArr8 = logoMyDesignActivity22.abc1005;
                    if (iArr8 != null) {
                        iArr8[4] = 5;
                    }
                    logoMyDesignActivity22.abc1002 = !logoMyDesignActivity22.abc1002;
                }
                LogoMyDesignActivity logoMyDesignActivity23 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity23.abc1001 == null) {
                    logoMyDesignActivity23.abc1001 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity24 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity24.abc10011 == null) {
                    logoMyDesignActivity24.abc10011 = new ArrayList<>();
                }
                LogoMyDesignActivity.this.abc1008 = 0.50539017f;
                if (arrayList3.size() == 0) {
                    LogoMyDesignActivity.this.isSelectAll = false;
                    LogoMyDesignActivity logoMyDesignActivity25 = LogoMyDesignActivity.this;
                    int[] iArr9 = logoMyDesignActivity25.abc1005;
                    if (iArr9 != null) {
                        iArr9[6] = 6;
                    }
                    if (logoMyDesignActivity25.abc10016 == null) {
                        logoMyDesignActivity25.abc10016 = new ArrayList<>();
                    }
                    LogoMyDesignActivity logoMyDesignActivity26 = LogoMyDesignActivity.this;
                    logoMyDesignActivity26.abc1000 = " stud";
                    logoMyDesignActivity26.adapter.setShowCheckedBox(false);
                    if (LogoMyDesignActivity.this.abc10021.size() < 9) {
                        LogoMyDesignActivity.this.abc10021.add(3);
                    }
                    LogoMyDesignActivity logoMyDesignActivity27 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity27.abc10021 == null) {
                        logoMyDesignActivity27.abc10021 = new ArrayList<>();
                    }
                    LogoMyDesignActivity logoMyDesignActivity28 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity28.abc1004 == null) {
                        logoMyDesignActivity28.abc1004 = new int[10];
                    }
                    logoMyDesignActivity28.binding.rlSelectItem.setVisibility(0);
                    ArrayList<String> arrayList13 = LogoMyDesignActivity.this.abc10019;
                    if (arrayList13 != null && arrayList13.size() > 0) {
                        LogoMyDesignActivity.this.abc10019.remove(0);
                    }
                    LogoMyDesignActivity logoMyDesignActivity29 = LogoMyDesignActivity.this;
                    int[] iArr10 = logoMyDesignActivity29.abc1004;
                    if (iArr10 != null) {
                        iArr10[0] = 0;
                    }
                    if (logoMyDesignActivity29.abc10014 == null) {
                        logoMyDesignActivity29.abc10014 = new ArrayList<>();
                    }
                    LogoMyDesignActivity.this.binding.rlDelete.setVisibility(8);
                    ArrayList<String> arrayList14 = LogoMyDesignActivity.this.abc10014;
                    if (arrayList14 != null && arrayList14.size() > 0) {
                        LogoMyDesignActivity.this.abc10014.remove(0);
                    }
                    LogoMyDesignActivity logoMyDesignActivity30 = LogoMyDesignActivity.this;
                    logoMyDesignActivity30.abc1000 = "a";
                    String[] strArr4 = logoMyDesignActivity30.abc10012;
                    if (strArr4 != null) {
                        strArr4[9] = null;
                    }
                    logoMyDesignActivity30.binding.rlSelectAll.setVisibility(8);
                    LogoMyDesignActivity logoMyDesignActivity31 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity31.abc1004 == null) {
                        logoMyDesignActivity31.abc1004 = new int[10];
                    }
                    logoMyDesignActivity31.abc1007 = -logoMyDesignActivity31.abc1007;
                    while (true) {
                        LogoMyDesignActivity logoMyDesignActivity32 = LogoMyDesignActivity.this;
                        int i10 = logoMyDesignActivity32.abc1007;
                        if (i10 > 3) {
                            i10 = 3;
                        }
                        if (i2 >= i10) {
                            break;
                        }
                        if (logoMyDesignActivity32.abc10020 == null) {
                            logoMyDesignActivity32.abc10020 = new ArrayList<>();
                        }
                        i2++;
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity33 = LogoMyDesignActivity.this;
                logoMyDesignActivity33.abc1009 = 0.14842083576913156d;
                logoMyDesignActivity33.abc10018 = 0.14574862f - 0.0038990974f;
            }
        }

        public View$OnClickListenerC9567p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity logoMyDesignActivity;
            boolean z;
            LogoMyDesignActivity logoMyDesignActivity2;
            LogoMyDesignActivity logoMyDesignActivity3;
            List<LogoDesignEntity> list = LogoMyDesignActivity.this.adapter.getList();
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            int[] iArr = logoMyDesignActivity4.abc1004;
            if (iArr != null) {
                iArr[9] = 7;
            }
            logoMyDesignActivity4.abc10022 = !logoMyDesignActivity4.abc10022;
            int i = 4;
            if (iArr != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = LogoMyDesignActivity.this.abc1004;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 4;
                    i2++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            logoMyDesignActivity5.abc5 = ((double) logoMyDesignActivity5.abc5) > 0.8215339d ? 0.74558425f : 0.31038725f;
            if (logoMyDesignActivity5.abc10021.size() < 5) {
                LogoMyDesignActivity.this.abc10021.add(5);
            }
            ArrayList<Integer> arrayList = LogoMyDesignActivity.this.abc10023;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc10023.remove(0);
            }
            if (LogoMyDesignActivity.this.abc10019.size() > 9) {
                LogoMyDesignActivity.this.abc10019.add("ntil you");
            }
            int size = list.size();
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            logoMyDesignActivity6.abc10022 = true;
            int[] iArr3 = logoMyDesignActivity6.abc1005;
            if (iArr3 != null) {
                iArr3[2] = 6;
            }
            int[] iArr4 = logoMyDesignActivity6.abc10010;
            if (iArr4 != null) {
                iArr4[3] = 1;
            }
            if (logoMyDesignActivity6.abc9 == null) {
                logoMyDesignActivity6.abc9 = new ArrayList<>();
                LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity7.abc10020 == null) {
                    logoMyDesignActivity7.abc10020 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
                int[] iArr5 = logoMyDesignActivity8.abc1005;
                if (iArr5 != null) {
                    iArr5[6] = 0;
                }
                logoMyDesignActivity8.abc10022 = true;
            }
            if (LogoMyDesignActivity.this.abc10019.size() > 4) {
                LogoMyDesignActivity.this.abc10019.add(DownloadCommon.DOWNLOAD_REPORT_REASON);
            }
            ArrayList<String> arrayList2 = LogoMyDesignActivity.this.abc10020;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoMyDesignActivity.this.abc10020.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
            logoMyDesignActivity9.abc10017 = true;
            if (logoMyDesignActivity9.abc10023.size() > 4) {
                LogoMyDesignActivity.this.abc10023.add(7);
            }
            LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
            logoMyDesignActivity10.abc1000 = "h";
            if (logoMyDesignActivity10.abc10016.size() < 8) {
                LogoMyDesignActivity.this.abc10016.add(4);
            }
            LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
            logoMyDesignActivity11.abc6 = 0.093108356f;
            logoMyDesignActivity11.abc1002 = !logoMyDesignActivity11.abc1002;
            if (logoMyDesignActivity11.abc10011.size() > 4) {
                LogoMyDesignActivity.this.abc10011.add(3);
            }
            LogoMyDesignActivity.this.abc10017 = !logoMyDesignActivity.abc10017;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = true;
                    break;
                } else if (list.get(i3).m245e()) {
                    if (LogoMyDesignActivity.this.abc10023.size() < 1) {
                        LogoMyDesignActivity.this.abc10023.add(Integer.valueOf(i));
                    }
                    LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity12.abc10011 == null) {
                        logoMyDesignActivity12.abc10011 = new ArrayList<>();
                    }
                    if (LogoMyDesignActivity.this.abc10011.size() > 1) {
                        LogoMyDesignActivity.this.abc10011.add(8);
                    }
                    LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
                    logoMyDesignActivity13.abc0 = !logoMyDesignActivity13.abc0;
                    int[] iArr6 = logoMyDesignActivity13.abc10010;
                    if (iArr6 != null) {
                        iArr6[2] = 0;
                    }
                    if (logoMyDesignActivity13.abc1007 < 0) {
                        logoMyDesignActivity13.abc1007 = 3;
                    }
                    if (logoMyDesignActivity13.abc1005 != null) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr7 = LogoMyDesignActivity.this.abc1005;
                            if (i4 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                                break;
                            }
                            iArr7[i4] = 9;
                            i4++;
                        }
                    }
                    z = false;
                } else {
                    LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
                    logoMyDesignActivity14.abc10022 = true;
                    ArrayList<Integer> arrayList3 = logoMyDesignActivity14.abc10016;
                    if (arrayList3 == null && arrayList3.size() > 0) {
                        LogoMyDesignActivity.this.abc10016.remove(0);
                    }
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                        int length = LogoMyDesignActivity.this.abc1000.length();
                        LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length;
                    }
                    LogoMyDesignActivity logoMyDesignActivity15 = LogoMyDesignActivity.this;
                    logoMyDesignActivity15.abc1 = logoMyDesignActivity15.abc1 < 8 ? 4 : 9;
                    if (logoMyDesignActivity15.abc1001 == null) {
                        logoMyDesignActivity15.abc1001 = new ArrayList<>();
                    }
                    LogoMyDesignActivity logoMyDesignActivity16 = LogoMyDesignActivity.this;
                    if (logoMyDesignActivity16.abc1004 == null) {
                        logoMyDesignActivity16.abc1004 = new int[10];
                    }
                    logoMyDesignActivity16.abc10017 = !logoMyDesignActivity16.abc10017;
                    i3++;
                    i = 4;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity17 = LogoMyDesignActivity.this;
            logoMyDesignActivity17.abc10018 = 0.8919664f;
            if (logoMyDesignActivity17.abc1001 == null) {
                logoMyDesignActivity17.abc1001 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity18 = LogoMyDesignActivity.this;
            int[] iArr8 = logoMyDesignActivity18.abc1004;
            if (iArr8 != null) {
                iArr8[5] = 0;
            }
            if (logoMyDesignActivity18.abc10.size() > 3) {
                LogoMyDesignActivity.this.abc10.add(2);
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                    int length2 = LogoMyDesignActivity.this.abc1000.length();
                    LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length2;
                }
                ArrayList<String> arrayList4 = LogoMyDesignActivity.this.abc10019;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyDesignActivity.this.abc10019.remove(0);
                }
                LogoMyDesignActivity.this.abc1002 = !logoMyDesignActivity3.abc1002;
            }
            LogoMyDesignActivity logoMyDesignActivity19 = LogoMyDesignActivity.this;
            int[] iArr9 = logoMyDesignActivity19.abc1005;
            if (iArr9 != null) {
                iArr9[2] = 0;
            }
            ArrayList<String> arrayList5 = logoMyDesignActivity19.abc10019;
            if (arrayList5 != null && arrayList5.size() > 0) {
                LogoMyDesignActivity.this.abc10019.remove(0);
            }
            ArrayList<Integer> arrayList6 = LogoMyDesignActivity.this.abc10016;
            if (arrayList6 == null && arrayList6.size() > 0) {
                LogoMyDesignActivity.this.abc10016.remove(0);
            }
            if (z) {
                return;
            }
            LogoMyDesignActivity logoMyDesignActivity20 = LogoMyDesignActivity.this;
            logoMyDesignActivity20.abc1008 *= 0.7997803f;
            if (logoMyDesignActivity20.abc10016 == null) {
                logoMyDesignActivity20.abc10016 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity21 = LogoMyDesignActivity.this;
            logoMyDesignActivity21.abc1008 *= 0.8143156f;
            if (logoMyDesignActivity21.abc6 > 0.80119514d) {
                logoMyDesignActivity21.abc6 = 0.37808025f;
                if (logoMyDesignActivity21.abc10016.size() > 9) {
                    LogoMyDesignActivity.this.abc10016.add(5);
                }
                ArrayList<String> arrayList7 = LogoMyDesignActivity.this.abc1001;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    LogoMyDesignActivity.this.abc1001.remove(0);
                }
                LogoMyDesignActivity.this.abc1003 = 0.22195506f;
            }
            LogoMyDesignActivity logoMyDesignActivity22 = LogoMyDesignActivity.this;
            logoMyDesignActivity22.abc1008 = 0.6220154f;
            logoMyDesignActivity22.abc1008 = -0.6220154f;
            ArrayList<Integer> arrayList8 = logoMyDesignActivity22.abc10016;
            if (arrayList8 == null && arrayList8.size() > 0) {
                LogoMyDesignActivity.this.abc10016.remove(0);
            }
            if (LogoMyDesignActivity.this.logoConfirmDeleteDialog == null) {
                LogoMyDesignActivity.this.logoConfirmDeleteDialog = new LogoConfirmDeleteDialog(LogoMyDesignActivity.this);
                LogoMyDesignActivity logoMyDesignActivity23 = LogoMyDesignActivity.this;
                int[] iArr10 = logoMyDesignActivity23.abc1004;
                if (iArr10 != null) {
                    iArr10[1] = 0;
                }
                logoMyDesignActivity23.abc1000 = "ok";
                if (!TextUtils.isEmpty(logoMyDesignActivity23.abc10013)) {
                    int length3 = LogoMyDesignActivity.this.abc10013.length();
                    LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length3;
                }
                LogoMyDesignActivity logoMyDesignActivity24 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity24.abc10 == null) {
                    logoMyDesignActivity24.abc10 = new ArrayList<>();
                    if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                        int length4 = LogoMyDesignActivity.this.abc1006.length();
                        LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length4;
                    }
                    LogoMyDesignActivity logoMyDesignActivity25 = LogoMyDesignActivity.this;
                    int[] iArr11 = logoMyDesignActivity25.abc10010;
                    if (iArr11 != null) {
                        iArr11[0] = 0;
                    }
                    logoMyDesignActivity25.abc1009 = -logoMyDesignActivity25.abc1009;
                }
                LogoMyDesignActivity logoMyDesignActivity26 = LogoMyDesignActivity.this;
                String[] strArr = logoMyDesignActivity26.abc10012;
                if (strArr != null) {
                    strArr[5] = "s plot";
                }
                ArrayList<Integer> arrayList9 = logoMyDesignActivity26.abc10016;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    LogoMyDesignActivity.this.abc10016.remove(0);
                }
                LogoMyDesignActivity.this.abc10022 = true;
            }
            LogoMyDesignActivity logoMyDesignActivity27 = LogoMyDesignActivity.this;
            int[] iArr12 = logoMyDesignActivity27.abc10010;
            if (iArr12 != null) {
                iArr12[6] = 8;
            }
            if (logoMyDesignActivity27.abc10023 == null) {
                logoMyDesignActivity27.abc10023 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity28 = LogoMyDesignActivity.this;
            logoMyDesignActivity28.abc1002 = !logoMyDesignActivity28.abc1002;
            if (logoMyDesignActivity28.abc6 > 0.28656542d) {
                logoMyDesignActivity28.abc6 = 0.013457f;
                if (!TextUtils.isEmpty(logoMyDesignActivity28.abc1006)) {
                    int length5 = LogoMyDesignActivity.this.abc1006.length();
                    LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length5;
                }
                LogoMyDesignActivity logoMyDesignActivity29 = LogoMyDesignActivity.this;
                int[] iArr13 = logoMyDesignActivity29.abc10010;
                if (iArr13 != null) {
                    iArr13[2] = 8;
                }
                logoMyDesignActivity29.abc10022 = true;
            }
            if (LogoMyDesignActivity.this.abc10021.size() > 4) {
                LogoMyDesignActivity.this.abc10021.add(2);
            }
            LogoMyDesignActivity logoMyDesignActivity30 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity30.abc1005 == null) {
                logoMyDesignActivity30.abc1005 = new int[10];
            }
            logoMyDesignActivity30.abc1006 = "aning";
            logoMyDesignActivity30.logoConfirmDeleteDialog.m9208c(R.string.confirm_delete_project);
            LogoMyDesignActivity logoMyDesignActivity31 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity31.abc1009 < 0.5956251326742309d) {
                logoMyDesignActivity31.abc1009 = 0.3991068503710925d;
            }
            if (logoMyDesignActivity31.abc10021.size() < 7) {
                LogoMyDesignActivity.this.abc10021.add(9);
            }
            LogoMyDesignActivity logoMyDesignActivity32 = LogoMyDesignActivity.this;
            int[] iArr14 = logoMyDesignActivity32.abc10010;
            if (iArr14 != null) {
                iArr14[2] = 4;
            }
            if (logoMyDesignActivity32.abc8.size() < 9) {
                LogoMyDesignActivity.this.abc8.add(3);
                if (LogoMyDesignActivity.this.abc10012 != null) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr2 = LogoMyDesignActivity.this.abc10012;
                        if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i5] = "string" + i5;
                        i5++;
                    }
                }
                LogoMyDesignActivity logoMyDesignActivity33 = LogoMyDesignActivity.this;
                logoMyDesignActivity33.abc10018 = ((double) logoMyDesignActivity33.abc10018) < 0.087007165d ? 0.39303225f : 0.31614918f;
                if (logoMyDesignActivity33.abc1005 == null) {
                    logoMyDesignActivity33.abc1005 = new int[10];
                }
            }
            if (LogoMyDesignActivity.this.abc1005 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr15 = LogoMyDesignActivity.this.abc1005;
                    if (i6 >= (iArr15.length > 3 ? 3 : iArr15.length)) {
                        break;
                    }
                    iArr15[i6] = 5;
                    i6++;
                }
            }
            LogoMyDesignActivity logoMyDesignActivity34 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity34.abc1008 > 0.6610524d) {
                logoMyDesignActivity34.abc1008 = 0.72445023f;
            }
            if (logoMyDesignActivity34.abc10019 == null) {
                logoMyDesignActivity34.abc10019 = new ArrayList<>();
            }
            LogoMyDesignActivity.this.logoConfirmDeleteDialog.setOnConfirmClickListener(new C9568a());
            LogoMyDesignActivity logoMyDesignActivity35 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity35.abc10015 == null) {
                logoMyDesignActivity35.abc10015 = new String[10];
            }
            ArrayList<String> arrayList10 = logoMyDesignActivity35.abc10019;
            if (arrayList10 != null && arrayList10.size() > 0) {
                LogoMyDesignActivity.this.abc10019.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity36 = LogoMyDesignActivity.this;
            int[] iArr16 = logoMyDesignActivity36.abc1005;
            if (iArr16 != null) {
                iArr16[5] = 0;
            }
            logoMyDesignActivity36.abc4 = Math.abs(logoMyDesignActivity36.abc4);
            LogoMyDesignActivity logoMyDesignActivity37 = LogoMyDesignActivity.this;
            logoMyDesignActivity37.abc1009 = 0.8850412925092002d;
            ArrayList<String> arrayList11 = logoMyDesignActivity37.abc1001;
            if (arrayList11 != null && arrayList11.size() > 0) {
                LogoMyDesignActivity.this.abc1001.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity38 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity38.abc10019 == null) {
                logoMyDesignActivity38.abc10019 = new ArrayList<>();
            }
            LogoMyDesignActivity.this.logoConfirmDeleteDialog.show();
            ArrayList<Integer> arrayList12 = LogoMyDesignActivity.this.abc10023;
            if (arrayList12 == null && arrayList12.size() > 0) {
                LogoMyDesignActivity.this.abc10023.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity39 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity39.abc10015 == null) {
                logoMyDesignActivity39.abc10015 = new String[10];
            }
            logoMyDesignActivity39.abc10017 = !logoMyDesignActivity39.abc10017;
            int i7 = 0;
            while (true) {
                logoMyDesignActivity2 = LogoMyDesignActivity.this;
                if (i7 >= logoMyDesignActivity2.abc1) {
                    break;
                }
                logoMyDesignActivity2.abc2 = "果参考Rea";
                if (logoMyDesignActivity2.abc10014.size() > 7) {
                    LogoMyDesignActivity.this.abc10014.add(" in ma");
                }
                LogoMyDesignActivity logoMyDesignActivity40 = LogoMyDesignActivity.this;
                int[] iArr17 = logoMyDesignActivity40.abc1004;
                if (iArr17 != null) {
                    iArr17[8] = 0;
                }
                logoMyDesignActivity40.abc10022 = false;
                i7++;
            }
            logoMyDesignActivity2.abc10018 += 0.2582777f;
            logoMyDesignActivity2.abc10017 = !logoMyDesignActivity2.abc10017;
            if (logoMyDesignActivity2.abc10020.size() < 4) {
                LogoMyDesignActivity.this.abc10020.add("haract");
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$q */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9569q implements View.OnClickListener {
        public View$OnClickListenerC9569q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity.this.adapter.setShowCheckedBox(true);
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            if (logoMyDesignActivity.abc10020 == null) {
                logoMyDesignActivity.abc10020 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            logoMyDesignActivity2.abc1002 = false;
            if (!TextUtils.isEmpty(logoMyDesignActivity2.abc1000)) {
                int length = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length;
            }
            LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
            logoMyDesignActivity3.abc2 = "个角一样），其他几";
            logoMyDesignActivity3.abc10013 = "l wasn’";
            logoMyDesignActivity3.abc1003 = 0.27156842f;
            if (logoMyDesignActivity3.abc10014 == null) {
                logoMyDesignActivity3.abc10014 = new ArrayList<>();
            }
            LogoMyDesignActivity.this.adapter.notifyDataSetChanged();
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc10013)) {
                int length2 = LogoMyDesignActivity.this.abc10013.length();
                LogoMyDesignActivity.this.abc10013 = LogoMyDesignActivity.this.abc10013 + length2;
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                int length3 = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length3;
            }
            LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
            String[] strArr = logoMyDesignActivity4.abc10015;
            if (strArr != null) {
                strArr[4] = null;
            }
            logoMyDesignActivity4.abc3 *= 0.12812006f;
            logoMyDesignActivity4.abc1003 = ((double) logoMyDesignActivity4.abc1003) > 0.57249826d ? 0.55596596f : 0.3326109f;
            ArrayList<String> arrayList = logoMyDesignActivity4.abc1001;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignActivity.this.abc1001.remove(0);
            }
            if (LogoMyDesignActivity.this.abc10011.size() > 2) {
                LogoMyDesignActivity.this.abc10011.add(4);
            }
            LogoMyDesignActivity.this.binding.rlSelectItem.setVisibility(8);
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            logoMyDesignActivity5.abc10013 = "the nov";
            logoMyDesignActivity5.abc1009 = 0.040274704888055846d;
            if (logoMyDesignActivity5.abc1008 > 0.6750873d) {
                logoMyDesignActivity5.abc1008 = 0.5339859f;
            }
            logoMyDesignActivity5.abc0 = false;
            if (logoMyDesignActivity5.abc10019.size() > 0) {
                LogoMyDesignActivity.this.abc10019.add("rprising ");
            }
            ArrayList<Integer> arrayList2 = LogoMyDesignActivity.this.abc10011;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMyDesignActivity.this.abc10011.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            logoMyDesignActivity6.abc10017 = !logoMyDesignActivity6.abc10017;
            logoMyDesignActivity6.binding.rlDelete.setVisibility(0);
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            logoMyDesignActivity7.abc1002 = false;
            int[] iArr = logoMyDesignActivity7.abc1004;
            if (iArr != null) {
                iArr[8] = 0;
            }
            if (logoMyDesignActivity7.abc1005 == null) {
                logoMyDesignActivity7.abc1005 = new int[10];
            }
            if (logoMyDesignActivity7.abc4 < 0.6798153302291028d) {
                logoMyDesignActivity7.abc4 = 0.20416887014902518d;
                if (logoMyDesignActivity7.abc10023 == null) {
                    logoMyDesignActivity7.abc10023 = new ArrayList<>();
                }
                LogoMyDesignActivity logoMyDesignActivity8 = LogoMyDesignActivity.this;
                String[] strArr2 = logoMyDesignActivity8.abc10012;
                if (strArr2 != null) {
                    strArr2[9] = "ecades bef";
                }
                logoMyDesignActivity8.abc1006 = "s";
            }
            ArrayList<Integer> arrayList3 = LogoMyDesignActivity.this.abc10011;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoMyDesignActivity.this.abc10011.remove(0);
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                int length4 = LogoMyDesignActivity.this.abc1006.length();
                LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length4;
            }
            LogoMyDesignActivity logoMyDesignActivity9 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity9.abc1001 == null) {
                logoMyDesignActivity9.abc1001 = new ArrayList<>();
            }
            LogoMyDesignActivity.this.binding.rlSelectAll.setVisibility(0);
            LogoMyDesignActivity logoMyDesignActivity10 = LogoMyDesignActivity.this;
            logoMyDesignActivity10.abc1000 = "a";
            if (logoMyDesignActivity10.abc10019.size() > 3) {
                LogoMyDesignActivity.this.abc10019.add("ce is");
            }
            LogoMyDesignActivity logoMyDesignActivity11 = LogoMyDesignActivity.this;
            logoMyDesignActivity11.abc1006 = "r ";
            logoMyDesignActivity11.abc3 = 0.8953404f;
            int[] iArr2 = logoMyDesignActivity11.abc1005;
            if (iArr2 != null) {
                iArr2[7] = 0;
            }
            logoMyDesignActivity11.abc1002 = true ^ logoMyDesignActivity11.abc1002;
            ArrayList<String> arrayList4 = logoMyDesignActivity11.abc10014;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoMyDesignActivity.this.abc10014.remove(0);
            }
            LogoMyDesignActivity logoMyDesignActivity12 = LogoMyDesignActivity.this;
            logoMyDesignActivity12.hideView(logoMyDesignActivity12.binding.llMenu, new View[0]);
            LogoMyDesignActivity logoMyDesignActivity13 = LogoMyDesignActivity.this;
            logoMyDesignActivity13.abc10017 = false;
            if (logoMyDesignActivity13.abc1001 == null) {
                logoMyDesignActivity13.abc1001 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1006)) {
                int length5 = LogoMyDesignActivity.this.abc1006.length();
                LogoMyDesignActivity.this.abc1006 = LogoMyDesignActivity.this.abc1006 + length5;
            }
            LogoMyDesignActivity logoMyDesignActivity14 = LogoMyDesignActivity.this;
            logoMyDesignActivity14.abc1 = -logoMyDesignActivity14.abc1;
            if (!TextUtils.isEmpty(logoMyDesignActivity14.abc1000)) {
                int length6 = LogoMyDesignActivity.this.abc1000.length();
                LogoMyDesignActivity.this.abc1000 = LogoMyDesignActivity.this.abc1000 + length6;
            }
            if (LogoMyDesignActivity.this.abc10010 != null) {
                int i = 0;
                while (true) {
                    int[] iArr3 = LogoMyDesignActivity.this.abc10010;
                    if (i >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i] = 0;
                    i++;
                }
            }
            if (LogoMyDesignActivity.this.abc10021.size() < 6) {
                LogoMyDesignActivity.this.abc10021.add(4);
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyDesignActivity$r */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9570r implements View.OnClickListener {
        public View$OnClickListenerC9570r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignActivity.this.toEdit();
            if (LogoMyDesignActivity.this.abc10019.size() > 6) {
                LogoMyDesignActivity.this.abc10019.add("els. Y");
            }
            LogoMyDesignActivity logoMyDesignActivity = LogoMyDesignActivity.this;
            if (logoMyDesignActivity.abc10014 == null) {
                logoMyDesignActivity.abc10014 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity2 = LogoMyDesignActivity.this;
            String[] strArr = logoMyDesignActivity2.abc10015;
            if (strArr != null) {
                strArr[4] = null;
            }
            if (logoMyDesignActivity2.abc9.size() > 8) {
                LogoMyDesignActivity.this.abc9.add("置       ");
                if (LogoMyDesignActivity.this.abc10014.size() > 7) {
                    LogoMyDesignActivity.this.abc10014.add("hara");
                }
                if (!TextUtils.isEmpty(LogoMyDesignActivity.this.abc1000)) {
                    int length = LogoMyDesignActivity.this.abc1000.length();
                    LogoMyDesignActivity logoMyDesignActivity3 = LogoMyDesignActivity.this;
                    logoMyDesignActivity3.abc1000 = LogoMyDesignActivity.this.abc1000 + length;
                }
                LogoMyDesignActivity logoMyDesignActivity4 = LogoMyDesignActivity.this;
                if (logoMyDesignActivity4.abc1001 == null) {
                    logoMyDesignActivity4.abc1001 = new ArrayList<>();
                }
            }
            LogoMyDesignActivity logoMyDesignActivity5 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity5.abc10014 == null) {
                logoMyDesignActivity5.abc10014 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity6 = LogoMyDesignActivity.this;
            if (logoMyDesignActivity6.abc10021 == null) {
                logoMyDesignActivity6.abc10021 = new ArrayList<>();
            }
            LogoMyDesignActivity logoMyDesignActivity7 = LogoMyDesignActivity.this;
            logoMyDesignActivity7.abc1002 = !logoMyDesignActivity7.abc1002;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkedState(List<LogoDesignEntity> list) {
        int i;
        int size = list.size();
        int i2 = 4;
        if (this.abc1007 < 0) {
            this.abc1007 = 4;
        }
        this.abc10022 = !this.abc10022;
        this.abc1008 = 0.49930817f;
        if (!TextUtils.isEmpty(this.abc2)) {
            int length = this.abc2.length();
            if (this.abc10012 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr = this.abc10012;
                    if (i3 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i3] = "string" + i3;
                    i3++;
                }
            }
            ArrayList<Integer> arrayList = this.abc10011;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10011.remove(0);
            }
            ArrayList<Integer> arrayList2 = this.abc10023;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10023.remove(0);
            }
            this.abc2 += length;
            this.abc1002 = !this.abc1002;
            this.abc1008 = 0.862716f;
            this.abc1009 = 0.22584008829076907d;
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        this.abc10017 = true;
        ArrayList<String> arrayList3 = this.abc10014;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc10014.remove(0);
        }
        this.abc1008 = ((double) this.abc1008) < 0.07991868d ? 0.9163409f : 0.41753125f;
        this.abc1 = 6;
        ArrayList<Integer> arrayList4 = this.abc10011;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10011.remove(0);
        }
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        if (this.abc10016.size() > 4) {
            this.abc10016.add(9);
        }
        this.isSelectAll = true;
        this.abc1007 += 6;
        int[] iArr = this.abc1004;
        if (iArr != null) {
            iArr[0] = 0;
        }
        int[] iArr2 = this.abc1005;
        if (iArr2 != null) {
            iArr2[7] = 0;
        }
        this.abc3 = ((double) this.abc3) < 0.21325624d ? 0.683406f : 0.6614479f;
        int i4 = 2;
        if (this.abc10011.size() > 1) {
            this.abc10011.add(2);
        }
        if (this.abc1007 < 0) {
            this.abc1007 = 3;
        }
        if (this.abc1008 < 0.33265162d) {
            this.abc1008 = 0.59221107f;
        }
        int i5 = 0;
        boolean z = false;
        while (i5 < size) {
            if (list.get(i5).m245e()) {
                if (!z) {
                    if (this.abc10020.size() > i2) {
                        this.abc10020.add("9");
                    }
                    if (this.abc10012 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr2 = this.abc10012;
                            if (i6 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i6] = "string" + i6;
                            i6++;
                        }
                    }
                    float f = this.abc10018 - 0.05042994f;
                    this.abc10018 = f;
                    this.abc3 = ((double) this.abc3) < 0.2590499d ? 0.37524074f : 0.18922192f;
                    this.abc10017 = !this.abc10017;
                    this.abc10018 = -f;
                    if (this.abc10016.size() > 0) {
                        this.abc10016.add(Integer.valueOf(i4));
                    }
                    z = true;
                }
                ArrayList<String> arrayList5 = this.abc10014;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.abc10014.remove(0);
                }
                ArrayList<Integer> arrayList6 = this.abc10016;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    this.abc10016.remove(0);
                }
                int i7 = 0;
                while (true) {
                    int i8 = this.abc1007;
                    if (i8 > 3) {
                        i8 = 3;
                    }
                    if (i7 >= i8) {
                        break;
                    }
                    ArrayList<Integer> arrayList7 = this.abc10023;
                    if (arrayList7 == null && arrayList7.size() > 0) {
                        this.abc10023.remove(0);
                    }
                    i7++;
                }
                boolean z2 = z;
                if (this.abc5 < 0.7112784d) {
                    this.abc5 = 0.4288584f;
                    if (this.abc10019.size() > 3) {
                        this.abc10019.add("early 19th");
                    }
                    this.abc10017 = !this.abc10017;
                    if (this.abc10016.size() > 1) {
                        this.abc10016.add(8);
                    }
                }
                ArrayList<Integer> arrayList8 = this.abc10011;
                if (arrayList8 == null && arrayList8.size() > 0) {
                    this.abc10011.remove(0);
                }
                if (this.abc10012 != null) {
                    int i9 = 0;
                    while (true) {
                        String[] strArr3 = this.abc10012;
                        if (i9 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                            break;
                        }
                        strArr3[i9] = "string" + i9;
                        i9++;
                    }
                }
                this.abc10018 = 0.020808756f;
                z = z2;
                i = 10;
            } else {
                if (this.isSelectAll) {
                    this.isSelectAll = false;
                    if (this.abc10020 == null) {
                        this.abc10020 = new ArrayList<>();
                    }
                    this.abc1008 = 0.22541398f;
                    int[] iArr3 = this.abc1005;
                    if (iArr3 != null) {
                        iArr3[6] = 0;
                    }
                    this.abc4 = 0.12808687064733848d;
                    String[] strArr4 = this.abc10012;
                    if (strArr4 != null) {
                        strArr4[5] = null;
                    }
                    this.abc1009 = 3.493320967304925E-4d;
                    this.abc10022 = true;
                }
                this.abc10018 = 0.095262766f;
                this.abc1000 = "ore peop";
                String[] strArr5 = this.abc10015;
                if (strArr5 != null) {
                    strArr5[6] = " ways";
                }
                this.abc3 = 0.6271688f;
                if (this.abc10016 == null) {
                    this.abc10016 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList9 = this.abc10021;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    this.abc10021.remove(0);
                }
                i = 10;
                if (this.abc10012 == null) {
                    this.abc10012 = new String[10];
                }
            }
            if (this.abc10012 == null) {
                this.abc10012 = new String[i];
            }
            ArrayList<Integer> arrayList10 = this.abc10021;
            if (arrayList10 == null && arrayList10.size() > 0) {
                this.abc10021.remove(0);
            }
            ArrayList<Integer> arrayList11 = this.abc10011;
            if (arrayList11 == null && arrayList11.size() > 0) {
                this.abc10011.remove(0);
            }
            String[] strArr6 = this.abc7;
            if (strArr6 != null) {
                strArr6[5] = "掉了情";
                if (this.abc1001.size() < 7) {
                    this.abc1001.add("or so many");
                }
                this.abc10022 = !(!this.abc10022);
            }
            if (this.abc10014 == null) {
                this.abc10014 = new ArrayList<>();
            }
            if (this.abc10014.size() < 5) {
                this.abc10014.add("h");
            }
            ArrayList<String> arrayList12 = this.abc10019;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.abc10019.remove(0);
            }
            i5++;
            i2 = 4;
            i4 = 2;
        }
        this.abc10018 = 0.6725684f;
        if (this.abc10016.size() > 0) {
            this.abc10016.add(1);
        }
        this.abc10017 = !this.abc10017;
        if (this.abc8.size() < 8) {
            this.abc8.add(2);
            if (this.abc10016.size() > 1) {
                this.abc10016.add(8);
            }
            this.abc1000 = " kind of";
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
        }
        Math.abs(this.abc10018);
        this.abc10018 = 0.09662163f;
        this.abc1003 = 0.0841189f;
        if (z) {
            this.binding.ivDelete.setImageResource(R.mipmap.all_delete);
            ArrayList<Integer> arrayList13 = this.abc10023;
            if (arrayList13 == null && arrayList13.size() > 0) {
                this.abc10023.remove(0);
            }
            this.abc1003 = 0.39770544f;
            if (this.abc1004 == null) {
                this.abc1004 = new int[10];
            }
            ArrayList<String> arrayList14 = this.abc9;
            if (arrayList14 != null && arrayList14.size() > 0) {
                this.abc9.remove(0);
                if (this.abc1001 == null) {
                    this.abc1001 = new ArrayList<>();
                }
                this.abc1008 = ((double) this.abc1008) < 0.91657275d ? 0.84061223f : 0.45586777f;
                this.abc1007 *= 7;
            }
            this.abc10013 = "t";
            if (this.abc10014.size() > 8) {
                this.abc10014.add("s");
            }
            ArrayList<String> arrayList15 = this.abc10019;
            if (arrayList15 != null && arrayList15.size() > 0) {
                this.abc10019.remove(0);
            }
        } else {
            this.binding.ivDelete.setImageResource(R.mipmap.all_delete2);
            this.abc10017 = false;
            this.abc1009 = this.abc1009 < 0.9168351123983279d ? 0.933633186186286d : 0.671852201156488d;
            this.abc6 = Math.abs(this.abc6);
            this.abc10017 = !this.abc10017;
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
            if (this.abc10021.size() > 5) {
                this.abc10021.add(3);
            }
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1008 += 0.41948122f;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc1 < 0) {
            this.abc1 = 9;
            if (this.abc10016 == null) {
                this.abc10016 = new ArrayList<>();
            }
            if (this.abc10010 == null) {
                this.abc10010 = new int[10];
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        if (this.abc1004 == null) {
            this.abc1004 = new int[10];
        }
        ArrayList<String> arrayList16 = this.abc10020;
        if (arrayList16 != null && arrayList16.size() > 0) {
            this.abc10020.remove(0);
        }
        if (this.isSelectAll) {
            this.binding.ivSelect.setImageResource(R.mipmap.selectall);
            int[] iArr4 = this.abc1005;
            if (iArr4 != null) {
                iArr4[3] = 3;
            }
            if (this.abc10015 == null) {
                this.abc10015 = new String[10];
            }
            if (iArr4 != null) {
                iArr4[2] = 7;
            }
            ArrayList<String> arrayList17 = this.abc9;
            if (arrayList17 != null && arrayList17.size() > 0) {
                this.abc9.remove(0);
                this.abc1002 = true;
                if (this.abc1005 != null) {
                    int i10 = 0;
                    while (true) {
                        int[] iArr5 = this.abc1005;
                        if (i10 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i10] = 9;
                        i10++;
                    }
                }
                ArrayList<Integer> arrayList18 = this.abc10011;
                if (arrayList18 == null && arrayList18.size() > 0) {
                    this.abc10011.remove(0);
                }
            }
            this.abc1002 = !this.abc1002;
            this.abc1008 = 0.057367206f;
            if (this.abc10014.size() > 4) {
                this.abc10014.add("t");
            }
        } else {
            this.binding.ivSelect.setImageResource(R.mipmap.unselectall);
            this.abc1009 += 0.4338200867586468d;
            this.abc10017 = true;
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
            this.abc5 = -this.abc5;
            this.abc1006 = "an";
            if (this.abc1007 < 0) {
                this.abc1007 = 1;
            }
            if (this.abc10023 == null) {
                this.abc10023 = new ArrayList<>();
            }
        }
        int i11 = 0;
        while (true) {
            int i12 = this.abc1007;
            if (i12 > 3) {
                i12 = 3;
            }
            if (i11 >= i12) {
                break;
            }
            String[] strArr7 = this.abc10012;
            if (strArr7 != null) {
                strArr7[1] = null;
            }
            i11++;
        }
        if (this.abc10014.size() < 2) {
            this.abc10014.add(" pl");
        }
        this.abc10022 = true;
        if (this.abc5 > 0.48424566d) {
            this.abc5 = 0.59044546f;
            ArrayList<Integer> arrayList19 = this.abc10011;
            if (arrayList19 == null && arrayList19.size() > 0) {
                this.abc10011.remove(0);
            }
            this.abc10018 = 0.9098127f;
            if (this.abc1005 == null) {
                this.abc1005 = new int[10];
            }
        }
        ArrayList<Integer> arrayList20 = this.abc10021;
        if (arrayList20 == null && arrayList20.size() > 0) {
            this.abc10021.remove(0);
        }
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        String[] strArr8 = this.abc10015;
        if (strArr8 != null) {
            strArr8[8] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LogoDesignEntity copyDesign() {
        File[] listFiles;
        try {
            File m249a = this.currentEntity.m249a();
            File createFolder = createFolder(m249a.getParentFile(), m249a.getName() + "-copy", 0);
            for (File file : m249a.listFiles()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(createFolder, file.getName()));
                byte[] bArr = new byte[1024];
                while (fileInputStream.read(bArr) > 0) {
                    fileOutputStream.write(bArr);
                }
                fileInputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            return new LogoDesignEntity(createFolder, new File(createFolder, "bitmapCombination.png"), createFolder.getName(), createFolder.lastModified());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private File createFolder(File file, String str, int i) {
        String str2;
        int i2;
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        if (this.abc10023 == null) {
            this.abc10023 = new ArrayList<>();
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        String[] strArr = this.abc7;
        if (strArr != null) {
            strArr[0] = "迹MU！装备好打爆";
            if (this.abc10021 == null) {
                this.abc10021 = new ArrayList<>();
            }
            if (this.abc10021 == null) {
                this.abc10021 = new ArrayList<>();
            }
            int i3 = 0;
            while (true) {
                int i4 = this.abc1007;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                this.abc1000 = "is";
                i3++;
            }
        }
        if (this.abc10011.size() > 7) {
            this.abc10011.add(1);
        }
        if (this.abc10014.size() > 0) {
            this.abc10014.add("el for");
        }
        int[] iArr = this.abc1005;
        if (iArr != null) {
            iArr[6] = 0;
        }
        if (i != 0) {
            str2 = str + "(" + i + ")";
            int[] iArr2 = this.abc1005;
            if (iArr2 != null) {
                iArr2[7] = 2;
            }
            this.abc10018 = ((double) this.abc10018) < 0.55288184d ? 0.68189317f : 0.2242887f;
            this.abc1003 = ((double) this.abc1003) > 0.4766497d ? 0.9470196f : 0.41047895f;
            this.abc1 = 8;
            if (this.abc10015 == null) {
                this.abc10015 = new String[10];
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1003 = 0.64807874f;
        } else {
            str2 = str;
        }
        this.abc10013 = "hat ";
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        if (this.abc10019.size() > 1) {
            this.abc10019.add("at it ");
        }
        this.abc6 = 0.13534981f;
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        this.abc1002 = !this.abc1002;
        File[] listFiles = file.listFiles();
        this.abc1009 = Math.abs(this.abc1009) - 0.3682638088769765d;
        ArrayList<String> arrayList = this.abc1001;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1001.remove(0);
        }
        if (this.abc7 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.abc7;
                if (i5 >= strArr2.length) {
                    break;
                }
                strArr2[i5] = "string" + i5;
                this.abc10022 = this.abc10022 ^ true;
                this.abc1003 = -this.abc1003;
                if (!TextUtils.isEmpty(this.abc10013)) {
                    this.abc10013 += this.abc10013.length();
                }
                i5++;
            }
            if (this.abc1004 == null) {
                this.abc1004 = new int[10];
            }
            if (this.abc10015 == null) {
                this.abc10015 = new String[10];
            }
            this.abc1006 = "is.";
        }
        this.abc1007 = this.abc1007 > 8 ? 7 : 9;
        this.abc1008 = Math.abs(this.abc1008);
        int[] iArr3 = this.abc1005;
        if (iArr3 != null) {
            iArr3[2] = 0;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equals(str2)) {
                return createFolder(file, str, i + 1);
            }
            if (this.abc1004 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr4 = this.abc1004;
                    if (i6 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i6] = 0;
                    i6++;
                }
            }
            if (!TextUtils.isEmpty(this.abc10013)) {
                this.abc10013 += this.abc10013.length();
            }
            this.abc1003 = Math.abs(this.abc1003);
            this.abc0 = true;
            this.abc10013 = "he ins";
            ArrayList<String> arrayList2 = this.abc10014;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc10014.remove(0);
            }
            this.abc1007 -= 7;
        }
        if (this.abc10019.size() > 1) {
            this.abc10019.add("del fo");
        }
        int[] iArr5 = this.abc1004;
        int i7 = 3;
        if (iArr5 != null) {
            iArr5[3] = 1;
        }
        if (this.abc1005 != null) {
            int i8 = 0;
            while (true) {
                int[] iArr6 = this.abc1005;
                if (i8 >= (iArr6.length > i7 ? 3 : iArr6.length)) {
                    break;
                }
                iArr6[i8] = 7;
                i8++;
                i7 = 3;
            }
        }
        if (this.abc8.size() < 7) {
            this.abc8.add(9);
            int[] iArr7 = this.abc1005;
            if (iArr7 != null) {
                iArr7[8] = 6;
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            this.abc1009 += 0.2565836978705822d;
        }
        this.abc1008 = Math.abs(this.abc1008);
        this.abc10022 = !this.abc10022;
        this.abc1000 = "e negat";
        File file3 = new File(file, str2);
        int i9 = 0;
        while (true) {
            int i10 = this.abc1007;
            if (i10 > 3) {
                i10 = 3;
            }
            if (i9 >= i10) {
                break;
            }
            if (this.abc1004 == null) {
                this.abc1004 = new int[10];
            }
            i9++;
        }
        if (this.abc10015 != null) {
            int i11 = 0;
            while (true) {
                String[] strArr3 = this.abc10015;
                if (i11 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i11] = "string" + i11;
                i11++;
            }
        }
        this.abc10018 = ((double) this.abc10018) < 0.5230675d ? 0.42143726f : 0.04569614f;
        this.abc0 = false;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc10016.size() < 5) {
            this.abc10016.add(2);
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (file3.mkdir()) {
            LogoLogUtils.m22166d(TAG, new Throwable(), "新文件夹创建成功：" + file3.getAbsolutePath());
            if (this.abc10010 != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr8 = this.abc10010;
                    if (i12 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                        break;
                    }
                    iArr8[i12] = 9;
                    i12++;
                }
            }
            this.abc1002 = !this.abc1002;
            ArrayList<Integer> arrayList3 = this.abc10021;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10021.remove(0);
            }
            if (this.abc4 < 0.03847539886693607d) {
                this.abc4 = 0.11407739252943172d;
                if (this.abc10019 == null) {
                    this.abc10019 = new ArrayList<>();
                }
                int[] iArr9 = this.abc1004;
                if (iArr9 != null) {
                    iArr9[2] = 0;
                }
                ArrayList<Integer> arrayList4 = this.abc10011;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    this.abc10011.remove(0);
                }
            }
            int[] iArr10 = this.abc1005;
            if (iArr10 != null) {
                iArr10[2] = 5;
            }
            if (iArr10 == null) {
                this.abc1005 = new int[10];
            }
            this.abc1006 = "putation f";
        } else {
            LogoLogUtils.m22166d(TAG, new Throwable(), "新文件夹创建失败：" + file3.getAbsolutePath());
            if (!TextUtils.isEmpty(this.abc10013)) {
                this.abc10013 += this.abc10013.length();
            }
            int[] iArr11 = this.abc1004;
            if (iArr11 != null) {
                iArr11[9] = 0;
            }
            if (iArr11 == null) {
                i2 = 10;
                this.abc1004 = new int[10];
            } else {
                i2 = 10;
            }
            if (this.abc7 == null) {
                this.abc7 = new String[i2];
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                ArrayList<String> arrayList5 = this.abc10014;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.abc10014.remove(0);
                }
                String[] strArr4 = this.abc10015;
                if (strArr4 != null) {
                    strArr4[2] = "centur";
                }
            }
            if (this.abc1005 == null) {
                this.abc1005 = new int[10];
            }
            if (this.abc10015 != null) {
                int i13 = 0;
                while (true) {
                    String[] strArr5 = this.abc10015;
                    if (i13 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i13] = "string" + i13;
                    i13++;
                }
            }
            int[] iArr12 = this.abc1005;
            if (iArr12 != null) {
                iArr12[2] = 4;
            }
        }
        String[] strArr6 = this.abc10012;
        if (strArr6 != null) {
            strArr6[6] = "ve";
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        this.abc1008 += 0.26446575f;
        ArrayList<Integer> arrayList6 = this.abc10;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc10.remove(0);
            int[] iArr13 = this.abc1004;
            if (iArr13 != null) {
                iArr13[5] = 4;
            }
            if (this.abc1009 > 0.40246973919674944d) {
                this.abc1009 = 0.8336554195932458d;
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc10022 = true;
        this.abc1007 = 2;
        return file3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideView(View view, View... viewArr) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        if (view.getTag() == null || ((Integer) view.getTag()).intValue() != 123) {
            if (this.abc10012 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.abc10012;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            if (this.abc10016 == null) {
                this.abc10016 = new ArrayList<>();
            }
            if (this.abc10023.size() > 7) {
                this.abc10023.add(7);
            }
            this.abc4 = 0.8924232528097249d;
            if (this.abc10014.size() < 8) {
                this.abc10014.add("t' how ");
            }
            String[] strArr2 = this.abc10012;
            if (strArr2 != null) {
                strArr2[6] = ReportUtil.f18058a;
            }
            if (this.abc1001.size() > 3) {
                this.abc1001.add(" ");
            }
            view.setTag(123);
            if (!TextUtils.isEmpty(this.abc10013)) {
                this.abc10013 += this.abc10013.length();
            }
            this.abc10018 = 0.617652f;
            ArrayList<Integer> arrayList = this.abc10021;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10021.remove(0);
            }
            this.abc6 = 0.18952477f;
            this.abc10018 = 0.029748976f;
            if (this.abc10016.size() > 3) {
                this.abc10016.add(0);
            }
            ArrayList<Integer> arrayList2 = this.abc10016;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10016.remove(0);
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            int[] iArr = this.abc10010;
            if (iArr != null) {
                iArr[9] = 0;
            }
            if (iArr != null) {
                iArr[9] = 1;
            }
            int i2 = 0;
            while (true) {
                int i3 = this.abc1007;
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i2 >= i3) {
                    break;
                }
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                i2++;
            }
            this.abc1 = 2;
            this.abc1007 = 5;
            if (this.abc10023.size() > 5) {
                this.abc10023.add(1);
            }
            if (this.abc10021.size() < 3) {
                this.abc10021.add(8);
            }
            translateAnimation.setDuration(300L);
            this.abc1003 -= 0.52031803f;
            this.abc10018 = ((double) this.abc10018) < 0.48230594d ? 0.9871647f : 0.1511035f;
            this.abc1002 = !this.abc1002;
            this.abc0 = false;
            if (this.abc10010 == null) {
                this.abc10010 = new int[10];
            }
            this.abc1008 = -this.abc1008;
            this.abc1000 = InneractiveMediationDefs.GENDER_FEMALE;
            translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC9559i(view, viewArr));
            this.abc10017 = false;
            if (this.abc1007 > 0) {
                this.abc1007 = 1;
            }
            this.abc10017 = false;
            this.abc4 = 0.8044406702051556d;
            if (this.abc1004 == null) {
                this.abc1004 = new int[10];
            }
            this.abc1007 *= 6;
            this.abc1003 -= 0.80323523f;
            view.setEnabled(false);
            if (this.abc10020.size() > 2) {
                this.abc10020.add(" with");
            }
            this.abc1003 += 0.3840552f;
            if (this.abc10019 == null) {
                this.abc10019 = new ArrayList<>();
            }
            this.abc1 -= 0;
            if (this.abc1004 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr2 = this.abc1004;
                    if (i4 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i4] = 4;
                    i4++;
                }
            }
            if (this.abc10012 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr3 = this.abc10012;
                    if (i5 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i5] = "string" + i5;
                    i5++;
                }
            }
            if (this.abc10021.size() < 2) {
                this.abc10021.add(0);
            }
            view.startAnimation(translateAnimation);
            if (this.abc1001.size() < 5) {
                this.abc1001.add("e real");
            }
            ArrayList<String> arrayList3 = this.abc1001;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc1001.remove(0);
            }
            this.abc1002 = false;
            this.abc4 = -this.abc4;
            ArrayList<Integer> arrayList4 = this.abc10023;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc10023.remove(0);
            }
            this.abc10013 = "et' ";
            if (this.abc1004 == null) {
                this.abc1004 = new int[10];
            }
        }
    }

    private void saveImageFile(Context context, String str, Bitmap bitmap) throws IOException {
        File file = new File(str);
        this.abc10017 = true;
        this.abc1000 = "when gro";
        ArrayList<String> arrayList = this.abc10020;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10020.remove(0);
        }
        ArrayList<Integer> arrayList2 = this.abc8;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc8.remove(0);
            if (this.abc10012 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.abc10012;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            this.abc10018 -= 0.3803594f;
            this.abc1002 = true;
        }
        this.abc1003 = 0.8249544f;
        this.abc1008 = 0.19151515f;
        if (!file.exists()) {
            file.createNewFile();
            if (this.abc10014 == null) {
                this.abc10014 = new ArrayList<>();
            }
            this.abc1000 = " 19th cen";
            if (this.abc1001.size() < 4) {
                this.abc1001.add(" modern no");
            }
            if (this.abc8 == null) {
                this.abc8 = new ArrayList<>();
                if (this.abc10015 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr2 = this.abc10015;
                        if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i2] = "string" + i2;
                        i2++;
                    }
                }
                String[] strArr3 = this.abc10012;
                if (strArr3 != null) {
                    strArr3[0] = "any moder";
                }
                this.abc1003 = ((double) this.abc1003) > 0.023118794d ? 0.3032344f : 0.023088813f;
            }
            if (this.abc10023 == null) {
                this.abc10023 = new ArrayList<>();
            }
            this.abc10022 = !this.abc10022;
            this.abc10017 = true;
        }
        String[] strArr4 = this.abc10012;
        if (strArr4 != null) {
            strArr4[9] = null;
        }
        this.abc10013 = InneractiveMediationDefs.GENDER_FEMALE;
        ArrayList<Integer> arrayList3 = this.abc10021;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc10021.remove(0);
        }
        this.abc6 = ((double) this.abc6) < 0.79185814d ? 0.75668263f : 0.29476094f;
        if (this.abc10012 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr5 = this.abc10012;
                if (i3 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i3] = "string" + i3;
                i3++;
            }
        }
        if (this.abc10019 == null) {
            this.abc10019 = new ArrayList<>();
        }
        String[] strArr6 = this.abc10012;
        if (strArr6 != null) {
            strArr6[0] = "decad";
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.abc10019 == null) {
            this.abc10019 = new ArrayList<>();
        }
        this.abc1000 = "he neg";
        if (this.abc10021 == null) {
            this.abc10021 = new ArrayList<>();
        }
        if (this.abc4 > 0.447853000966411d) {
            this.abc4 = 0.3318895109204494d;
            if (!TextUtils.isEmpty(this.abc10013)) {
                this.abc10013 += this.abc10013.length();
            }
            this.abc1002 = true;
            this.abc1008 = 0.9157692f;
        }
        this.abc1000 = "his is the";
        this.abc1002 = true;
        if (this.abc10016.size() > 1) {
            this.abc10016.add(7);
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        this.abc10018 = ((double) this.abc10018) < 0.9943791d ? 0.32306433f : 0.55986714f;
        String[] strArr7 = this.abc10015;
        if (strArr7 != null) {
            strArr7[7] = null;
        }
        this.abc1009 = 0.5618473474066306d;
        this.abc5 = ((double) this.abc5) > 0.39276302d ? 0.67201596f : 0.6729704f;
        ArrayList<Integer> arrayList4 = this.abc10021;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10021.remove(0);
        }
        this.abc10013 = "han";
        this.abc1002 = false;
        fileOutputStream.flush();
        ArrayList<String> arrayList5 = this.abc1001;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1001.remove(0);
        }
        if (this.abc1008 > 0.5140461d) {
            this.abc1008 = 0.31321514f;
        }
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        if (this.abc6 > 0.9310231d) {
            this.abc6 = 0.23274118f;
            this.abc10022 = !this.abc10022;
            if (this.abc10012 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr8 = this.abc10012;
                    if (i4 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                        break;
                    }
                    strArr8[i4] = "string" + i4;
                    i4++;
                }
            }
            int[] iArr = this.abc1005;
            if (iArr != null) {
                iArr[4] = 1;
            }
        }
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        String[] strArr9 = this.abc10015;
        if (strArr9 != null) {
            strArr9[0] = null;
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        fileOutputStream.close();
        this.abc10022 = false;
        if (this.abc1003 > 0.3739664d) {
            this.abc1003 = 0.16386098f;
        }
        if (this.abc1005 != null) {
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.abc1005;
                if (i5 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i5] = 2;
                i5++;
            }
        }
        this.abc1 *= 5;
        if (this.abc1005 != null) {
            int i6 = 0;
            while (true) {
                int[] iArr3 = this.abc1005;
                if (i6 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i6] = 7;
                i6++;
            }
        }
        if (this.abc10012 == null) {
            this.abc10012 = new String[10];
        }
        ArrayList<Integer> arrayList6 = this.abc10011;
        if (arrayList6 != null || arrayList6.size() <= 0) {
            return;
        }
        this.abc10011.remove(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void showView(android.view.View r24, android.view.View... r25) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.LogoMyDesignActivity.showView(android.view.View, android.view.View[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toCopy() {
        new Thread(new RunnableC9556f()).start();
        if (this.abc10019.size() < 9) {
            this.abc10019.add("fo");
        }
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toDelete() {
        if (this.logoConfirmDeleteDialog == null) {
            this.logoConfirmDeleteDialog = new LogoConfirmDeleteDialog(this);
            ArrayList<String> arrayList = this.abc10019;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc10019.remove(0);
            }
            this.abc10013 = "k. For ";
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            this.abc3 -= 0.32398063f;
            if (this.abc10019 == null) {
                this.abc10019 = new ArrayList<>();
            }
            this.abc1007 = this.abc1007 < 1 ? 1 : 4;
            if (this.abc10010 == null) {
                this.abc10010 = new int[10];
            }
        }
        if (this.abc10010 != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.abc10010;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 1;
                i++;
            }
        }
        if (this.abc1004 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.abc1004;
                if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i2] = 3;
                i2++;
            }
        }
        if (this.abc10021.size() < 1) {
            this.abc10021.add(8);
        }
        if (this.abc4 < 0.8538402807727384d) {
            this.abc4 = 0.024335927564387183d;
            ArrayList<Integer> arrayList2 = this.abc10021;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10021.remove(0);
            }
            this.abc1006 = "odern n";
            ArrayList<String> arrayList3 = this.abc10014;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc10014.remove(0);
            }
        }
        this.abc1003 -= 0.12023234f;
        ArrayList<Integer> arrayList4 = this.abc10023;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10023.remove(0);
        }
        this.abc1009 = Math.abs(this.abc1009);
        this.logoConfirmDeleteDialog.m9208c(R.string.confirm_delete_project);
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        if (this.abc10014.size() > 1) {
            this.abc10014.add("e ");
        }
        if (this.abc8 == null) {
            this.abc8 = new ArrayList<>();
            this.abc1006 = " only ";
            if (this.abc10021.size() < 5) {
                this.abc10021.add(9);
            }
            this.abc1003 = Math.abs(this.abc1003);
        }
        if (this.abc1005 == null) {
            this.abc1005 = new int[10];
        }
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.logoConfirmDeleteDialog.setOnConfirmClickListener(new C9554d());
        if (this.abc1004 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr3 = this.abc1004;
                if (i3 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i3] = 7;
                i3++;
            }
        }
        ArrayList<Integer> arrayList5 = this.abc10011;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc10011.remove(0);
        }
        String[] strArr = this.abc10015;
        if (strArr != null) {
            strArr[7] = null;
        }
        this.abc0 = !this.abc0;
        this.abc10018 = 0.07224029f;
        ArrayList<Integer> arrayList6 = this.abc10011;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc10011.remove(0);
        }
        int[] iArr4 = this.abc1005;
        if (iArr4 != null) {
            iArr4[2] = 0;
        }
        this.logoConfirmDeleteDialog.show();
        if (this.abc10019 == null) {
            this.abc10019 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList7 = this.abc10021;
        if (arrayList7 == null && arrayList7.size() > 0) {
            this.abc10021.remove(0);
        }
        ArrayList<Integer> arrayList8 = this.abc10011;
        if (arrayList8 == null && arrayList8.size() > 0) {
            this.abc10011.remove(0);
        }
        for (int i4 = 0; i4 < this.abc1; i4++) {
            this.abc3 -= 0.8850261f;
            if (this.abc1005 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr5 = this.abc1005;
                    if (i5 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i5] = 0;
                    i5++;
                }
            }
            if (this.abc10015 != null) {
                int i6 = 0;
                while (true) {
                    String[] strArr2 = this.abc10015;
                    if (i6 < (strArr2.length > 3 ? 3 : strArr2.length)) {
                        strArr2[i6] = "string" + i6;
                        i6++;
                    }
                }
            }
            this.abc10018 = 0.40517431f;
        }
        this.abc10022 = !this.abc10022;
        ArrayList<String> arrayList9 = this.abc10014;
        if (arrayList9 != null && arrayList9.size() > 0) {
            this.abc10014.remove(0);
        }
        int[] iArr6 = this.abc1005;
        if (iArr6 != null) {
            iArr6[4] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toEdit() {
        Intent intent = new Intent(this, LogoCreateActivity.class);
        int i = 0;
        while (true) {
            int i2 = this.abc1007;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            this.abc1000 = " ";
            i++;
        }
        if (this.abc1005 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.abc1005;
                if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i3] = 2;
                i3++;
            }
        }
        if (this.abc10023.size() > 9) {
            this.abc10023.add(6);
        }
        if (this.abc6 < 0.43069607d) {
            this.abc6 = 0.32246763f;
            if (this.abc10016.size() > 1) {
                this.abc10016.add(7);
            }
            ArrayList<String> arrayList = this.abc10014;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc10014.remove(0);
            }
            this.abc10022 = true;
        }
        this.abc10018 = 0.70617f;
        if (this.abc10014.size() < 2) {
            this.abc10014.add("asn’t re");
        }
        if (this.abc1005 == null) {
            this.abc1005 = new int[10];
        }
        intent.putExtra("design", this.currentEntity);
        this.abc1000 = " ";
        if (this.abc10023.size() > 3) {
            this.abc10023.add(9);
        }
        String[] strArr = this.abc10012;
        if (strArr != null) {
            strArr[7] = " novel was";
        }
        this.abc4 += 0.28120614603965377d;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        ArrayList<Integer> arrayList2 = this.abc10011;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc10011.remove(0);
        }
        this.abc1000 = "ode";
        startActivity(intent);
        this.abc1008 = Math.abs(this.abc1008);
        if (this.abc10018 < 0.9040631d) {
            this.abc10018 = 0.8674849f;
        }
        this.abc10017 = true;
        if (!TextUtils.isEmpty(this.abc2)) {
            int length = this.abc2.length();
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (this.abc10023.size() < 3) {
                this.abc10023.add(4);
            }
            if (this.abc10014.size() > 6) {
                this.abc10014.add("t it i");
            }
            this.abc2 += length;
            if (this.abc10018 < 0.49760574d) {
                this.abc10018 = 0.39767462f;
            }
            this.abc1002 = false;
            this.abc10022 = !this.abc10022;
        }
        if (this.abc10014.size() > 1) {
            this.abc10014.add("r");
        }
        this.abc1003 = ((double) this.abc1003) < 0.6693758d ? 0.279135f : 0.6111275f;
        String[] strArr2 = this.abc10015;
        if (strArr2 != null) {
            strArr2[5] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toRename() {
        int i = 0;
        if (this.logoRenameProjectDialog == null) {
            this.logoRenameProjectDialog = new LogoRenameProjectDialog(this);
            this.abc1007 *= 6;
            if (this.abc10010 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.abc10010;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 2;
                    i2++;
                }
            }
            this.abc10013 = "el i";
            if (!TextUtils.isEmpty(this.abc2)) {
                int length = this.abc2.length();
                ArrayList<Integer> arrayList = this.abc10016;
                if (arrayList == null && arrayList.size() > 0) {
                    this.abc10016.remove(0);
                }
                this.abc1008 = 0.22113723f;
                this.abc1009 = -this.abc1009;
                this.abc2 += length;
                if (this.abc10011.size() > 6) {
                    this.abc10011.add(3);
                }
                this.abc10022 = !this.abc10022;
                this.abc1002 = !this.abc1002;
            }
            if (this.abc1005 == null) {
                this.abc1005 = new int[10];
            }
            String[] strArr = this.abc10012;
            if (strArr != null) {
                strArr[6] = null;
            }
            if (this.abc1001.size() < 6) {
                this.abc1001.add("y, it’s ");
            }
        }
        if (this.abc10018 < 0.9836347d) {
            this.abc10018 = 0.70290005f;
        }
        if (this.abc10014.size() < 9) {
            this.abc10014.add(" publica");
        }
        int[] iArr2 = this.abc1005;
        if (iArr2 != null) {
            iArr2[9] = 0;
        }
        if (this.abc8.size() > 4) {
            this.abc8.add(2);
            this.abc10013 = "p";
            if (this.abc10021 == null) {
                this.abc10021 = new ArrayList<>();
            }
            this.abc10017 = !this.abc10017;
        }
        int[] iArr3 = this.abc1005;
        if (iArr3 != null) {
            iArr3[0] = 0;
        }
        String[] strArr2 = this.abc10015;
        if (strArr2 != null) {
            strArr2[6] = "alize that";
        }
        if (this.abc10010 == null) {
            this.abc10010 = new int[10];
        }
        this.logoRenameProjectDialog.m9136e(this.currentEntity.m248b());
        if (this.abc10010 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr4 = this.abc10010;
                if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i3] = 1;
                i3++;
            }
        }
        ArrayList<String> arrayList2 = this.abc1001;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1001.remove(0);
        }
        this.abc1009 *= 0.5971216773456084d;
        String[] strArr3 = this.abc7;
        if (strArr3 != null) {
            strArr3[7] = null;
            if (this.abc10018 > 0.28084344d) {
                this.abc10018 = 0.41401106f;
            }
            String[] strArr4 = this.abc10012;
            if (strArr4 != null) {
                strArr4[3] = null;
            }
            if (this.abc10016.size() > 9) {
                this.abc10016.add(9);
            }
        }
        if (this.abc10014.size() > 2) {
            this.abc10014.add("until y");
        }
        this.abc1003 = 0.070159614f;
        this.abc1009 = -this.abc1009;
        this.logoRenameProjectDialog.setOnSaveClickListener(new C9557g());
        if (this.abc1008 > 0.24269366d) {
            this.abc1008 = 0.33399296f;
        }
        this.abc1000 = "as";
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        this.abc3 += 0.013312936f;
        if (this.abc10021 == null) {
            this.abc10021 = new ArrayList<>();
        }
        String[] strArr5 = this.abc10012;
        if (strArr5 != null) {
            strArr5[0] = null;
        }
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        this.logoRenameProjectDialog.show();
        ArrayList<Integer> arrayList3 = this.abc10021;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc10021.remove(0);
        }
        ArrayList<Integer> arrayList4 = this.abc10011;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10011.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc3 += 0.45986468f;
        if (this.abc10015 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr6 = this.abc10015;
                if (i4 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                    break;
                }
                strArr6[i4] = "string" + i4;
                i4++;
            }
        }
        this.abc1002 = true;
        if (this.abc10015 == null) {
            return;
        }
        while (true) {
            String[] strArr7 = this.abc10015;
            if (i >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                return;
            }
            strArr7[i] = "string" + i;
            i++;
        }
    }

    public void closeLoading() {
        LogoLoadingDialog logoLoadingDialog = this.logoLoadingDialog;
        if (logoLoadingDialog != null) {
            logoLoadingDialog.dismiss();
            this.abc10022 = !this.abc10022;
            this.abc1008 = 0.7754693f;
            if (this.abc1004 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = this.abc1004;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 3;
                    i++;
                }
            }
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        if (this.abc10020.size() > 0) {
            this.abc10020.add("19th c");
        }
        ArrayList<Integer> arrayList = this.abc10023;
        if (arrayList != null || arrayList.size() <= 0) {
            return;
        }
        this.abc10023.remove(0);
    }

    public int getStatusBarHeight() {
        int i;
        if (this.abc1004 == null) {
            this.abc1004 = new int[10];
        }
        int[] iArr = this.abc1005;
        if (iArr != null) {
            iArr[4] = 0;
        }
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        if (this.abc7 == null) {
            this.abc7 = new String[10];
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            ArrayList<Integer> arrayList = this.abc10023;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10023.remove(0);
            }
            this.abc10013 = "s";
        }
        this.abc10022 = true;
        this.abc10018 = ((double) this.abc10018) > 0.9110844d ? 0.2965747f : 0.13436162f;
        String[] strArr = this.abc10015;
        if (strArr != null) {
            strArr[9] = null;
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        String[] strArr2 = this.abc10012;
        if (strArr2 != null) {
            strArr2[4] = null;
        }
        for (int i2 = 0; i2 < this.abc1; i2++) {
            if (this.abc10 == null) {
                this.abc10 = new ArrayList<>();
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                if (this.abc10010 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = this.abc10010;
                        if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i3] = 6;
                        i3++;
                    }
                }
                ArrayList<Integer> arrayList2 = this.abc10011;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.abc10011.remove(0);
                }
            }
            ArrayList<Integer> arrayList3 = this.abc10016;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10016.remove(0);
            }
            this.abc1009 = -this.abc1009;
            this.abc10017 = false;
        }
        if (this.abc10019.size() < 1) {
            this.abc10019.add("setta Sto");
        }
        ArrayList<Integer> arrayList4 = this.abc10023;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10023.remove(0);
        }
        String[] strArr3 = this.abc10015;
        if (strArr3 != null) {
            strArr3[4] = null;
        }
        if (identifier > 0) {
            i = getResources().getDimensionPixelSize(identifier);
            String[] strArr4 = this.abc10012;
            if (strArr4 != null) {
                strArr4[1] = " mo";
            }
            this.abc10017 = true;
            if (this.abc10015 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr5 = this.abc10015;
                    if (i4 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i4] = "string" + i4;
                    i4++;
                }
            }
            ArrayList<String> arrayList5 = this.abc9;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.abc9.remove(0);
                if (!TextUtils.isEmpty(this.abc10013)) {
                    this.abc10013 += this.abc10013.length();
                }
                if (this.abc10016 == null) {
                    this.abc10016 = new ArrayList<>();
                }
                this.abc1007 = 8;
            }
            int[] iArr3 = this.abc1004;
            if (iArr3 != null) {
                iArr3[9] = 0;
            }
            this.abc1007 = this.abc1007 > 6 ? 1 : 9;
            if (this.abc10020.size() < 8) {
                this.abc10020.add("p");
            }
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        int[] iArr4 = this.abc1004;
        if (iArr4 != null) {
            iArr4[6] = 0;
        }
        if (this.abc1003 < 0.005307555d) {
            this.abc1003 = 0.8430364f;
        }
        this.abc0 = true;
        ArrayList<String> arrayList6 = this.abc10014;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc10014.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        this.abc10022 = true;
        return i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.binding.llMenu.getVisibility() == 0) {
            hideView(this.binding.llMenu, new View[0]);
            this.abc1002 = !this.abc1002;
            this.abc10013 = "re for";
            if (this.abc1005 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = this.abc1005;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 2;
                    i++;
                }
            }
            this.abc3 += 0.4747153f;
            this.abc1000 = "ved wel";
            this.abc1002 = false;
            String[] strArr = this.abc10015;
            if (strArr != null) {
                strArr[2] = null;
            }
        } else if (this.adapter.isShowCheckedBox()) {
            this.isSelectAll = false;
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc10013 = "vill";
            if (this.abc10023.size() > 7) {
                this.abc10023.add(5);
            }
            this.abc0 = !this.abc0;
            int i2 = 0;
            while (true) {
                int i3 = this.abc1007;
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i2 >= i3) {
                    break;
                }
                ArrayList<String> arrayList = this.abc10019;
                if (arrayList != null && arrayList.size() > 0) {
                    this.abc10019.remove(0);
                }
                i2++;
            }
            int[] iArr2 = this.abc1004;
            if (iArr2 != null) {
                iArr2[1] = 0;
            }
            if (iArr2 == null) {
                this.abc1004 = new int[10];
            }
            this.binding.ivDelete.setImageResource(R.mipmap.all_delete2);
            this.abc1009 += 0.37511618504754374d;
            if (this.abc1001.size() > 9) {
                this.abc1001.add("y 19th");
            }
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
            this.abc2 = "/>默认效果代码如";
            this.abc1006 = "ery yea";
            this.abc1002 = true;
            if (this.abc10016 == null) {
                this.abc10016 = new ArrayList<>();
            }
            this.binding.ivSelect.setImageResource(R.mipmap.unselectall);
            if (this.abc10023.size() > 1) {
                this.abc10023.add(5);
            }
            int[] iArr3 = this.abc1005;
            if (iArr3 != null) {
                iArr3[5] = 0;
            }
            if (this.abc10021.size() < 7) {
                this.abc10021.add(8);
            }
            this.abc4 = 0.45916801402753804d;
            this.abc1009 = 0.8675778322298938d;
            this.abc1007 = 3;
            if (this.abc10011.size() < 1) {
                this.abc10011.add(0);
            }
            this.adapter.setShowCheckedBox(false);
            int[] iArr4 = this.abc10010;
            if (iArr4 != null) {
                iArr4[7] = 4;
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            if (this.abc10023.size() > 1) {
                this.abc10023.add(5);
            }
            if (this.abc6 > 0.9228976d) {
                this.abc6 = 0.40823436f;
                this.abc1003 = 0.67728704f;
                ArrayList<Integer> arrayList2 = this.abc10016;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.abc10016.remove(0);
                }
                if (this.abc10015 == null) {
                    this.abc10015 = new String[10];
                }
            }
            this.abc10018 *= 0.8654631f;
            ArrayList<Integer> arrayList3 = this.abc10023;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10023.remove(0);
            }
            this.abc10017 = !this.abc10017;
            for (LogoDesignEntity logoDesignEntity : this.adapter.getList()) {
                logoDesignEntity.m244f(false);
                this.abc10013 = "’re pro";
                ArrayList<Integer> arrayList4 = this.abc10023;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    this.abc10023.remove(0);
                }
                this.abc1000 = " model ";
                this.abc0 = !this.abc0;
                this.abc1002 = false;
                if (this.abc10020.size() < 0) {
                    this.abc10020.add("a liter");
                }
                ArrayList<Integer> arrayList5 = this.abc10021;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    this.abc10021.remove(0);
                }
            }
            if (this.abc1005 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr5 = this.abc1005;
                    if (i4 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i4] = 3;
                    i4++;
                }
            }
            if (this.abc10018 > 0.4346395d) {
                this.abc10018 = 0.037499487f;
            }
            ArrayList<String> arrayList6 = this.abc10020;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc10020.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc2)) {
                int length = this.abc2.length();
                ArrayList<String> arrayList7 = this.abc10014;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    this.abc10014.remove(0);
                }
                if (this.abc10012 != null) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr2 = this.abc10012;
                        if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i5] = "string" + i5;
                        i5++;
                    }
                }
                this.abc1000 = "real";
                this.abc2 += length;
                this.abc1002 = false;
                this.abc10013 = "an";
                ArrayList<String> arrayList8 = this.abc10020;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.abc10020.remove(0);
                }
            }
            ArrayList<String> arrayList9 = this.abc1001;
            if (arrayList9 != null && arrayList9.size() > 0) {
                this.abc1001.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc10013)) {
                this.abc10013 += this.abc10013.length();
            }
            String[] strArr3 = this.abc10015;
            if (strArr3 != null) {
                strArr3[1] = null;
            }
            this.adapter.notifyDataSetChanged();
            int[] iArr6 = this.abc1004;
            if (iArr6 != null) {
                iArr6[0] = 3;
            }
            if (this.abc1005 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr7 = this.abc1005;
                    if (i6 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                        break;
                    }
                    iArr7[i6] = 3;
                    i6++;
                }
            }
            ArrayList<String> arrayList10 = this.abc1001;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.abc1001.remove(0);
            }
            this.abc4 = 0.9907439149580933d;
            this.abc1007 = this.abc1007 < 5 ? 2 : 4;
            this.abc10022 = !this.abc10022;
            this.abc1002 = !this.abc1002;
            this.binding.rlSelectItem.setVisibility(0);
            if (this.abc10023.size() > 0) {
                this.abc10023.add(7);
            }
            if (this.abc1004 == null) {
                this.abc1004 = new int[10];
            }
            ArrayList<Integer> arrayList11 = this.abc10011;
            if (arrayList11 == null && arrayList11.size() > 0) {
                this.abc10011.remove(0);
            }
            this.abc4 = Math.abs(this.abc4);
            ArrayList<String> arrayList12 = this.abc10014;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.abc10014.remove(0);
            }
            ArrayList<String> arrayList13 = this.abc10020;
            if (arrayList13 != null && arrayList13.size() > 0) {
                this.abc10020.remove(0);
            }
            this.abc1007 += 0;
            this.binding.rlDelete.setVisibility(8);
            String[] strArr4 = this.abc10012;
            if (strArr4 != null) {
                strArr4[3] = "ti";
            }
            if (this.abc10019 == null) {
                this.abc10019 = new ArrayList<>();
            }
            int[] iArr8 = this.abc10010;
            if (iArr8 != null) {
                iArr8[5] = 0;
            }
            this.abc6 *= 0.17853552f;
            if (this.abc10019 == null) {
                this.abc10019 = new ArrayList<>();
            }
            this.abc1006 = "g only ";
            ArrayList<Integer> arrayList14 = this.abc10023;
            if (arrayList14 == null && arrayList14.size() > 0) {
                this.abc10023.remove(0);
            }
            this.binding.rlSelectAll.setVisibility(8);
            int[] iArr9 = this.abc10010;
            if (iArr9 != null) {
                iArr9[0] = 3;
            }
            if (iArr9 != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr10 = this.abc10010;
                    if (i7 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i7] = 7;
                    i7++;
                }
            }
            this.abc10013 = "roba";
            if (this.abc9 == null) {
                this.abc9 = new ArrayList<>();
                this.abc1009 = -this.abc1009;
                this.abc1002 = !(!this.abc1002);
            }
            this.abc10018 = ((double) this.abc10018) > 0.44762063d ? 0.990755f : 0.86349845f;
            ArrayList<Integer> arrayList15 = this.abc10016;
            if (arrayList15 == null && arrayList15.size() > 0) {
                this.abc10016.remove(0);
            }
            this.abc10013 = "lvill";
        } else {
            super.onBackPressed();
            this.abc10022 = !true;
            this.abc1002 = false;
            if (this.abc5 > 0.39147305d) {
                this.abc5 = 0.76092744f;
                this.abc10018 = ((double) this.abc10018) > 0.4944651d ? 0.66064304f : 0.086541176f;
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc10017 = true;
            }
            ArrayList<Integer> arrayList16 = this.abc10021;
            if (arrayList16 == null && arrayList16.size() > 0) {
                this.abc10021.remove(0);
            }
            this.abc10018 = -this.abc10018;
            this.abc1006 = " ";
        }
        int[] iArr11 = this.abc1005;
        if (iArr11 != null) {
            iArr11[6] = 2;
        }
        this.abc1002 = true;
        this.abc10013 = "the ";
        String[] strArr5 = this.abc10015;
        if (strArr5 != null) {
            strArr5[7] = null;
        }
        this.abc10022 = !this.abc10022;
        if (this.abc10010 != null) {
            int i8 = 0;
            while (true) {
                int[] iArr12 = this.abc10010;
                if (i8 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                    break;
                }
                iArr12[i8] = 4;
                i8++;
            }
        }
        if (this.abc9 == null) {
            this.abc9 = new ArrayList<>();
            int[] iArr13 = this.abc1005;
            if (iArr13 != null) {
                iArr13[6] = 0;
            }
            ArrayList<String> arrayList17 = this.abc10020;
            if (arrayList17 != null && arrayList17.size() > 0) {
                this.abc10020.remove(0);
            }
            this.abc10017 = false;
        }
        if (this.abc1005 != null) {
            int i9 = 0;
            while (true) {
                int[] iArr14 = this.abc1005;
                if (i9 >= (iArr14.length > 3 ? 3 : iArr14.length)) {
                    break;
                }
                iArr14[i9] = 3;
                i9++;
            }
        }
        int[] iArr15 = this.abc1005;
        if (iArr15 != null) {
            iArr15[9] = 0;
        }
        ArrayList<Integer> arrayList18 = this.abc10021;
        if (arrayList18 == null && arrayList18.size() > 0) {
            this.abc10021.remove(0);
        }
        this.abc2 = "col";
        ArrayList<Integer> arrayList19 = this.abc10016;
        if (arrayList19 == null && arrayList19.size() > 0) {
            this.abc10016.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc1008 = 0.77243865f;
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.abc10018 = 0.9491602f;
        this.abc1007 = 1;
        this.abc10017 = !this.abc10017;
        Glide.m18522c(this).m18523b();
        if (this.abc1004 == null) {
            this.abc1004 = new int[10];
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        if (this.abc10012 == null) {
            this.abc10012 = new String[10];
        }
        int i = 0;
        if (this.abc10.size() > 3) {
            this.abc10.add(6);
            this.abc1008 = -this.abc1008;
            if (this.abc10023.size() > 2) {
                this.abc10023.add(1);
            }
            int[] iArr = this.abc1004;
            if (iArr != null) {
                iArr[9] = 0;
            }
        }
        ArrayList<String> arrayList = this.abc1001;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1001.remove(0);
        }
        this.abc10017 = false;
        if (this.abc10010 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.abc10010;
                if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i2] = 8;
                i2++;
            }
        }
        this.binding = (ActivityLogoMyDesignBinding) DataBindingUtil.setContentView(this, R.layout.activity_logo_my_design);
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        if (this.abc1004 == null) {
            this.abc1004 = new int[10];
        }
        String[] strArr = this.abc7;
        if (strArr != null) {
            strArr[9] = null;
            if (this.abc10011.size() > 9) {
                this.abc10011.add(4);
            }
            this.abc1003 -= 0.7013942f;
            if (this.abc10010 == null) {
                this.abc10010 = new int[10];
            }
        }
        this.abc1008 = ((double) this.abc1008) < 0.6819913d ? 0.44160545f : 0.7851467f;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc1002 = true;
        this.binding.setLifecycleOwner(this);
        this.abc1000 = " for being";
        if (this.abc10023.size() > 7) {
            this.abc10023.add(1);
        }
        if (this.abc10011.size() > 1) {
            this.abc10011.add(8);
        }
        this.abc5 = ((double) this.abc5) > 0.81278706d ? 0.7381069f : 0.8425348f;
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        this.abc10018 = 0.11459243f;
        ArrayList<String> arrayList2 = this.abc10019;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc10019.remove(0);
        }
        setSupportActionBar(this.binding.toolbar);
        this.abc1008 *= 0.084543705f;
        this.abc10018 = 0.16420853f;
        if (this.abc7 == null) {
            this.abc7 = new String[10];
            ArrayList<String> arrayList3 = this.abc10020;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc10020.remove(0);
            }
            if (this.abc1008 > 0.3716039d) {
                this.abc1008 = 0.713412f;
            }
            this.abc10017 = !this.abc10017;
        }
        this.abc10018 = -this.abc10018;
        if (this.abc10021.size() > 5) {
            this.abc10021.add(8);
        }
        ArrayList<Integer> arrayList4 = this.abc10021;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10021.remove(0);
        }
        this.binding.rlBack.setOnClickListener(new View$OnClickListenerC9560j());
        if (this.abc1005 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr3 = this.abc1005;
                if (i3 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i3] = 1;
                i3++;
            }
        }
        if (this.abc10020.size() > 5) {
            this.abc10020.add(" d");
        }
        this.abc10017 = true;
        this.abc6 = ((double) this.abc6) > 0.1127401d ? 0.7806082f : 0.15895188f;
        this.abc10013 = "d mod";
        this.abc1002 = false;
        this.binding.llBlank.setOnClickListener(new View$OnClickListenerC9561k());
        ArrayList<Integer> arrayList5 = this.abc10023;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc10023.remove(0);
        }
        this.abc1007 = 5;
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        if (this.abc7 == null) {
            this.abc7 = new String[10];
            if (this.abc10014 == null) {
                this.abc10014 = new ArrayList<>();
            }
            this.abc1002 = !this.abc1002;
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
        }
        String[] strArr2 = this.abc10012;
        if (strArr2 != null) {
            strArr2[3] = null;
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc1008 = Math.abs(this.abc1008);
        this.adapter = new LogoRvDesignAdapter(new ArrayList(), this);
        if (this.abc10014.size() > 5) {
            this.abc10014.add("ed w");
        }
        ArrayList<String> arrayList6 = this.abc10020;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc10020.remove(0);
        }
        ArrayList<String> arrayList7 = this.abc1001;
        if (arrayList7 != null && arrayList7.size() > 0) {
            this.abc1001.remove(0);
        }
        this.abc1 = this.abc1 < 1 ? 6 : 7;
        if (this.abc10014.size() < 2) {
            this.abc10014.add("nd the ");
        }
        this.abc1008 = 0.06438881f;
        int[] iArr4 = this.abc1005;
        if (iArr4 != null) {
            iArr4[4] = 0;
        }
        this.binding.rvMyDesign.setLayoutManager(new LinearLayoutManager(this));
        if (this.abc10011.size() < 0) {
            this.abc10011.add(5);
        }
        this.abc10022 = !this.abc10022;
        this.abc10018 = Math.abs(this.abc10018);
        this.abc3 = ((double) this.abc3) > 0.44011724d ? 0.35714293f : 0.79850954f;
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        this.abc10018 *= 0.90999055f;
        ArrayList<String> arrayList8 = this.abc1001;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.abc1001.remove(0);
        }
        LogoRvSimpleItemDecoration logoRvSimpleItemDecoration = new LogoRvSimpleItemDecoration();
        int[] iArr5 = this.abc1004;
        if (iArr5 != null) {
            iArr5[2] = 9;
        }
        if (this.abc10018 > 0.7230348d) {
            this.abc10018 = 0.9786332f;
        }
        int[] iArr6 = this.abc1005;
        if (iArr6 != null) {
            iArr6[2] = 0;
        }
        ArrayList<Integer> arrayList9 = this.abc8;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.abc8.remove(0);
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            ArrayList<Integer> arrayList10 = this.abc10011;
            if (arrayList10 == null && arrayList10.size() > 0) {
                this.abc10011.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc10017 = !this.abc10017;
        if (this.abc10010 == null) {
            this.abc10010 = new int[10];
        }
        this.binding.rvMyDesign.addItemDecoration(logoRvSimpleItemDecoration);
        if (this.abc1004 != null) {
            int i4 = 0;
            while (true) {
                int[] iArr7 = this.abc1004;
                if (i4 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                    break;
                }
                iArr7[i4] = 9;
                i4++;
            }
        }
        if (this.abc10012 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr3 = this.abc10012;
                if (i5 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i5] = "string" + i5;
                i5++;
            }
        }
        this.abc1003 = 0.9259458f;
        if (this.abc7 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.abc7;
                if (i6 >= strArr4.length) {
                    break;
                }
                strArr4[i6] = "string" + i6;
                if (this.abc10016.size() < 7) {
                    this.abc10016.add(8);
                }
                if (this.abc1004 == null) {
                    this.abc1004 = new int[10];
                }
                if (this.abc10011.size() > 0) {
                    this.abc10011.add(4);
                }
                i6++;
            }
            this.abc1002 = true;
            this.abc1009 = 0.128939394524333d;
            this.abc10013 = "ani";
        }
        this.abc1008 = -this.abc1008;
        String[] strArr5 = this.abc10015;
        if (strArr5 != null) {
            strArr5[6] = null;
        }
        if (this.abc10021.size() < 1) {
            this.abc10021.add(9);
        }
        ((SimpleItemAnimator) this.binding.rvMyDesign.getItemAnimator()).setSupportsChangeAnimations(false);
        ArrayList<String> arrayList11 = this.abc10019;
        if (arrayList11 != null && arrayList11.size() > 0) {
            this.abc10019.remove(0);
        }
        if (this.abc10019.size() > 2) {
            this.abc10019.add("think");
        }
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        this.abc3 = 0.40846223f;
        this.abc1008 = ((double) this.abc1008) > 0.8846743d ? 0.76840246f : 0.94171166f;
        String[] strArr6 = this.abc10012;
        if (strArr6 != null) {
            strArr6[8] = "kind ";
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.binding.rvMyDesign.setAdapter(this.adapter);
        this.abc1006 = "i";
        this.abc10018 = 0.24514556f;
        this.abc1007 = 5;
        this.abc3 = ((double) this.abc3) > 0.53159356d ? 0.2029624f : 0.40576017f;
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        String[] strArr7 = this.abc10015;
        if (strArr7 != null) {
            strArr7[1] = null;
        }
        ArrayList<String> arrayList12 = this.abc1001;
        if (arrayList12 != null && arrayList12.size() > 0) {
            this.abc1001.remove(0);
        }
        this.viewModel = (LogoMyDesignVM) new ViewModelProvider(this).get(LogoMyDesignVM.class);
        if (this.abc10016.size() < 5) {
            this.abc10016.add(8);
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc1003 = 0.2862386f;
        this.abc0 = !this.abc0;
        this.abc1003 = ((double) 0.2862386f) > 0.110506654d ? 0.47553325f : 0.37436694f;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.viewModel.getList().observe(this, new C9562l());
        this.abc1003 = 0.7494446f;
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        if (this.abc1005 == null) {
            this.abc1005 = new int[10];
        }
        this.abc3 = 0.5626246f;
        this.abc1000 = "ink. For";
        this.abc1007 = (this.abc1007 > 2 ? 0 : 3) + 9;
        this.binding.rvMyDesign.addOnScrollListener(new C9563m());
        ArrayList<String> arrayList13 = this.abc1001;
        if (arrayList13 != null && arrayList13.size() > 0) {
            this.abc1001.remove(0);
        }
        if (this.abc1003 > 0.57583714d) {
            this.abc1003 = 0.27368498f;
        }
        this.abc10022 = !this.abc10022;
        this.abc1 = this.abc1 > 2 ? 4 : 7;
        ArrayList<Integer> arrayList14 = this.abc10023;
        if (arrayList14 == null && arrayList14.size() > 0) {
            this.abc10023.remove(0);
        }
        this.abc1009 = 0.956216355532088d;
        this.abc1008 = ((double) this.abc1008) < 0.6767336d ? 0.71600807f : 0.9216026f;
        this.adapter.setOnItemMenuClickListner(new C9564n());
        this.abc1007 = 9;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        this.abc4 *= 0.5290958733586191d;
        if (this.abc10010 != null) {
            int i7 = 0;
            while (true) {
                int[] iArr8 = this.abc10010;
                if (i7 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                    break;
                }
                iArr8[i7] = 5;
                i7++;
            }
        }
        this.abc1007 = (this.abc1007 - 2) - 7;
        this.binding.rlSelectAll.setOnClickListener(new View$OnClickListenerC9566o());
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        this.abc1002 = !this.abc1002;
        this.abc10017 = true;
        this.abc4 -= 0.33522773023004926d;
        String[] strArr8 = this.abc10012;
        if (strArr8 != null) {
            strArr8[6] = null;
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        this.binding.rlDelete.setOnClickListener(new View$OnClickListenerC9567p());
        if (this.abc1008 < 0.7240503d) {
            this.abc1008 = 0.5755283f;
        }
        this.abc1008 += 0.5256773f;
        ArrayList<String> arrayList15 = this.abc10014;
        if (arrayList15 != null && arrayList15.size() > 0) {
            this.abc10014.remove(0);
        }
        this.abc0 = true;
        String[] strArr9 = this.abc10015;
        if (strArr9 != null) {
            strArr9[7] = "r ";
        }
        if (this.abc10010 == null) {
            this.abc10010 = new int[10];
        }
        ArrayList<String> arrayList16 = this.abc1001;
        if (arrayList16 != null && arrayList16.size() > 0) {
            this.abc1001.remove(0);
        }
        this.binding.rlSelectItem.setOnClickListener(new View$OnClickListenerC9569q());
        this.abc1002 = false;
        this.abc10013 = "d";
        ArrayList<Integer> arrayList17 = this.abc10016;
        if (arrayList17 == null && arrayList17.size() > 0) {
            this.abc10016.remove(0);
        }
        this.abc3 = Math.abs(this.abc3);
        if (this.abc1003 > 0.7787984d) {
            this.abc1003 = 0.61728483f;
        }
        this.abc1000 = " an";
        this.abc1006 = "erni";
        this.binding.llEdit.setOnClickListener(new View$OnClickListenerC9570r());
        if (this.abc10011.size() < 2) {
            this.abc10011.add(1);
        }
        this.abc1007 = 3;
        this.abc1006 = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
        this.abc3 = Math.abs(this.abc3);
        this.abc10017 = !this.abc10017;
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        this.binding.llRename.setOnClickListener(new View$OnClickListenerC9551a());
        if (this.abc1003 < 0.7667829d) {
            this.abc1003 = 0.9811086f;
        }
        ArrayList<String> arrayList18 = this.abc1001;
        if (arrayList18 != null && arrayList18.size() > 0) {
            this.abc1001.remove(0);
        }
        int[] iArr9 = this.abc1005;
        if (iArr9 != null) {
            iArr9[8] = 0;
        }
        String[] strArr10 = this.abc7;
        if (strArr10 != null) {
            strArr10[1] = "View的";
            if (this.abc10010 != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr10 = this.abc10010;
                    if (i8 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i8] = 8;
                    i8++;
                }
            }
            this.abc10022 = !false;
        }
        ArrayList<Integer> arrayList19 = this.abc10021;
        if (arrayList19 == null && arrayList19.size() > 0) {
            this.abc10021.remove(0);
        }
        ArrayList<Integer> arrayList20 = this.abc10011;
        if (arrayList20 == null && arrayList20.size() > 0) {
            this.abc10011.remove(0);
        }
        if (this.abc10012 == null) {
            this.abc10012 = new String[10];
        }
        this.binding.llDuplicate.setOnClickListener(new View$OnClickListenerC9552b());
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        ArrayList<String> arrayList21 = this.abc10019;
        if (arrayList21 != null && arrayList21.size() > 0) {
            this.abc10019.remove(0);
        }
        this.abc10018 = 0.9945456f;
        this.abc1 = 1;
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        if (this.abc1009 < 0.38627196788506146d) {
            this.abc1009 = 0.06637202025701816d;
        }
        if (this.abc10020 == null) {
            this.abc10020 = new ArrayList<>();
        }
        this.binding.llDelete.setOnClickListener(new View$OnClickListenerC9553c());
        ArrayList<Integer> arrayList22 = this.abc10011;
        if (arrayList22 == null && arrayList22.size() > 0) {
            this.abc10011.remove(0);
        }
        ArrayList<Integer> arrayList23 = this.abc10023;
        if (arrayList23 == null && arrayList23.size() > 0) {
            this.abc10023.remove(0);
        }
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        this.abc6 = Math.abs(this.abc6);
        this.abc1008 = 0.80856985f;
        this.abc1008 = ((double) 0.80856985f) < 0.4590214d ? 0.97719705f : 0.17859703f;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.viewModel.initData();
        String[] strArr11 = this.abc10012;
        if (strArr11 != null) {
            strArr11[4] = null;
        }
        this.abc1002 = true ^ this.abc1002;
        int[] iArr11 = this.abc1005;
        if (iArr11 != null) {
            iArr11[2] = 6;
        }
        this.abc2 = "...兰光宗_63_";
        if (iArr11 == null) {
            this.abc1005 = new int[10];
        }
        if (this.abc1004 != null) {
            while (true) {
                int[] iArr12 = this.abc1004;
                if (i >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                    break;
                }
                iArr12[i] = 2;
                i++;
            }
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.abc10020.size() > 7) {
            this.abc10020.add("ati");
        }
        this.abc1002 = !this.abc1002;
        if (this.abc10019 == null) {
            this.abc10019 = new ArrayList<>();
        }
        this.abc1 += 3;
        this.abc1006 = "lize that ";
        this.abc1002 = true;
        if (this.abc7 == null) {
            this.abc7 = new String[10];
            this.abc10022 = true;
            if (this.abc10019.size() > 8) {
                this.abc10019.add(", a");
            }
            if (this.abc1007 < 0) {
                this.abc1007 = 6;
            }
        }
        ArrayList<String> arrayList = this.abc10019;
        int i = 0;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10019.remove(0);
        }
        if (this.abc1005 == null) {
            this.abc1005 = new int[10];
        }
        if (this.abc10010 != null) {
            while (true) {
                int[] iArr = this.abc10010;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 5;
                i++;
            }
        }
        this.abc5 += 0.114604354f;
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        this.abc1007 = 7;
        if (this.abc10016.size() < 8) {
            this.abc10016.add(9);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.abc10010 != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.abc10010;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 9;
                i++;
            }
        }
        this.abc10022 = false;
        this.abc1008 = -this.abc1008;
        this.abc4 = 0.9558136656969539d;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        if (this.abc10015 == null) {
            this.abc10015 = new String[10];
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        int statusBarHeight = getStatusBarHeight();
        String[] strArr = this.abc10015;
        if (strArr != null) {
            strArr[7] = null;
        }
        if (this.abc10012 == null) {
            this.abc10012 = new String[10];
        }
        if (strArr != null) {
            strArr[0] = null;
        }
        if (this.abc9.size() > 9) {
            this.abc9.add("w不知大");
            this.abc1007 *= 2;
            String[] strArr2 = this.abc10012;
            if (strArr2 != null) {
                strArr2[1] = " t";
            }
            if (this.abc10015 == null) {
                this.abc10015 = new String[10];
            }
        }
        this.abc1008 = 0.8960303f;
        if (this.abc10019 == null) {
            this.abc10019 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        ViewGroup.LayoutParams layoutParams = this.binding.statusView.getLayoutParams();
        if (this.abc10011.size() < 8) {
            this.abc10011.add(1);
        }
        this.abc1008 = 0.19667035f;
        this.abc1008 = ((double) 0.19667035f) < 0.32726985d ? 0.20013899f : 0.8291746f;
        this.abc5 -= 0.9844697f;
        if (this.abc10019.size() > 3) {
            this.abc10019.add("l");
        }
        this.abc1007 = this.abc1007 > 4 ? 4 : 7;
        this.abc10022 = !this.abc10022;
        layoutParams.height = statusBarHeight;
        this.abc10018 = 0.52099276f;
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        this.abc1000 = "n ";
        if (this.abc8 == null) {
            this.abc8 = new ArrayList<>();
            this.abc1008 = 0.47008944f;
            int[] iArr2 = this.abc10010;
            if (iArr2 != null) {
                iArr2[1] = 7;
            }
            ArrayList<Integer> arrayList = this.abc10016;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10016.remove(0);
            }
        }
        int[] iArr3 = this.abc1004;
        if (iArr3 != null) {
            iArr3[5] = 9;
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc1004 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr4 = this.abc1004;
                if (i2 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i2] = 1;
                i2++;
            }
        }
        this.binding.statusView.setLayoutParams(layoutParams);
        if (this.abc1005 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr5 = this.abc1005;
                if (i3 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i3] = 1;
                i3++;
            }
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc10019 == null) {
            this.abc10019 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc2)) {
            int length = this.abc2.length();
            this.abc1003 = Math.abs(this.abc1003);
            if (this.abc10014.size() < 1) {
                this.abc10014.add("s ");
            }
            int[] iArr6 = this.abc1005;
            if (iArr6 != null) {
                iArr6[4] = 0;
            }
            this.abc2 += length;
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            this.abc1008 = 0.31572586f;
            this.abc10018 -= 0.047300994f;
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc1003 = 0.6281027f;
        this.abc10018 = -this.abc10018;
        Glide.m18522c(this).m18523b();
        if (this.abc1004 == null) {
            this.abc1004 = new int[10];
        }
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
        int i4 = 0;
        while (true) {
            int i5 = this.abc1007;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i4 >= i5) {
                break;
            }
            int[] iArr7 = this.abc1004;
            if (iArr7 != null) {
                iArr7[3] = 9;
            }
            i4++;
        }
        this.viewModel.refreshListData();
        ArrayList<Integer> arrayList2 = this.abc10016;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc10016.remove(0);
        }
        if (this.abc10023.size() > 1) {
            this.abc10023.add(9);
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc9.size() > 6) {
            this.abc9.add(";paddingStart");
            if (this.abc1001.size() < 2) {
                this.abc1001.add("t");
            }
            String[] strArr3 = this.abc10012;
            if (strArr3 != null) {
                strArr3[5] = null;
            }
            this.abc1008 = ((double) this.abc1008) < 0.42952073d ? 0.74904007f : 0.61956114f;
        }
        ArrayList<String> arrayList3 = this.abc10020;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc10020.remove(0);
        }
        ArrayList<String> arrayList4 = this.abc10019;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc10019.remove(0);
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
    }

    public void showLoading() {
        if (this.logoLoadingDialog == null) {
            this.logoLoadingDialog = new LogoLoadingDialog(this);
            if (this.abc10021 == null) {
                this.abc10021 = new ArrayList<>();
            }
            this.abc10017 = !this.abc10017;
            int i = 0;
            while (true) {
                int i2 = this.abc1007;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                this.abc10018 = 0.7709289f;
                i++;
            }
            this.logoLoadingDialog.m22286a();
            this.abc10022 = true;
            this.abc10018 = 0.17090261f;
            int[] iArr = this.abc10010;
            if (iArr != null) {
                iArr[3] = 0;
            }
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1002 = !this.abc1002;
        int[] iArr2 = this.abc10010;
        if (iArr2 != null) {
            iArr2[0] = 0;
        }
        this.logoLoadingDialog.show();
        if (this.abc1008 > 0.1328302d) {
            this.abc1008 = 0.88105845f;
        }
        this.abc1007 = 1;
        if (this.abc10014 == null) {
            this.abc10014 = new ArrayList<>();
        }
    }
}
