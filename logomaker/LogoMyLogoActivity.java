package com.logomaster.logomaker;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bumptech.glide.Glide;
import com.facebook.appevents.UserDataStore;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.logomaster.logomaker.LogoConfirmDeleteDialog;
import com.logomaster.logomaker.LogoShowBigImageDialog;
import com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter;
import com.logomaster.logomaker.base.LogoBaseActivity;
import com.logomaster.logomaker.databinding.ActivityLogoMyLogoBinding;
import com.logomaster.logomaker.p131vm.LogoMyLogoVM;
import com.logomaster.logomaker.utils.LogoRvGridItemDecoration;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoMyLogoActivity extends LogoBaseActivity {
    private static final String fragmentTag = "logoShowBigImageFragment";
    private ActivityResultLauncher<Intent> activityResultLauncher;
    private LogoRvMyLogoAdapter adapter;
    private ActivityLogoMyLogoBinding binding;
    private LogoMyLogoEntity currentEntity;
    private int currentIndex;
    private boolean isSelectAll;
    private LogoConfirmDeleteDialog logoConfirmDeleteDialog;
    private LogoShowBigImageDialog logoShowBigImageDialog;
    private LogoShowBigImageFragment logoShowBigImageFragment;
    private Toast toast;
    private LogoMyLogoVM viewModel;
    public double abc1000 = 0.6912717619927735d;
    public double abc0 = 0.6224406331491869d;
    public boolean abc1001 = false;
    public String[] abc1002 = new String[15];
    public ArrayList<Integer> abc1 = new ArrayList<>();
    public float abc1003 = 0.22571677f;
    public boolean abc1004 = true;
    public String abc2 = "    ";
    public ArrayList<String> abc1005 = new ArrayList<>();
    public ArrayList<Integer> abc1006 = new ArrayList<>();
    public boolean abc3 = true;
    public float abc1007 = 0.10410833f;
    public ArrayList<String> abc1008 = new ArrayList<>();
    public ArrayList<String> abc4 = new ArrayList<>();
    public int[] abc1009 = new int[17];
    public double abc10010 = 0.5284549439492121d;
    public float abc5 = 0.06519663f;
    public ArrayList<String> abc10011 = new ArrayList<>();
    public int abc10012 = 7;
    public float abc6 = 0.7393288f;
    public int[] abc10013 = new int[12];
    public boolean abc10014 = true;
    public ArrayList<String> abc7 = new ArrayList<>();
    public float abc10015 = 0.9988844f;
    public ArrayList<Integer> abc10016 = new ArrayList<>();
    public boolean abc8 = false;
    public ArrayList<Integer> abc10017 = new ArrayList<>();
    public ArrayList<Integer> abc10018 = new ArrayList<>();
    public ArrayList<Integer> abc9 = new ArrayList<>();
    public String[] abc10019 = new String[12];
    public boolean abc10020 = false;
    public double abc10 = 0.043340228675028625d;
    public double abc10021 = 0.08641924932409584d;
    public String[] abc10022 = new String[14];
    public String abc11 = "d";
    public String abc10023 = "ar with it";

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9571a implements View.OnClickListener {
        public View$OnClickListenerC9571a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyLogoActivity.this.onBackPressed();
            LogoMyLogoActivity logoMyLogoActivity = LogoMyLogoActivity.this;
            if (logoMyLogoActivity.abc10022 == null) {
                logoMyLogoActivity.abc10022 = new String[10];
            }
            if (logoMyLogoActivity.abc10019 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoMyLogoActivity.this.abc10019;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity2.abc1009 == null) {
                logoMyLogoActivity2.abc1009 = new int[10];
            }
            logoMyLogoActivity2.abc11 = "专注";
            String[] strArr2 = logoMyLogoActivity2.abc10019;
            if (strArr2 != null) {
                strArr2[2] = " dull. Me";
            }
            int[] iArr = logoMyLogoActivity2.abc1009;
            if (iArr != null) {
                iArr[4] = 6;
            }
            logoMyLogoActivity2.abc1001 = false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$b */
    /* loaded from: classes3.dex */
    public class C9572b implements Observer<List<LogoMyLogoEntity>> {
        public C9572b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<LogoMyLogoEntity> list) {
            if (list.size() > 0) {
                LogoMyLogoActivity.this.binding.ivNoData.setVisibility(8);
                ArrayList<String> arrayList = LogoMyLogoActivity.this.abc1008;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoMyLogoActivity.this.abc1008.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity = LogoMyLogoActivity.this;
                int[] iArr = logoMyLogoActivity.abc10013;
                if (iArr != null) {
                    iArr[0] = 0;
                }
                logoMyLogoActivity.abc10015 = 0.5055503f;
                logoMyLogoActivity.abc10 = 0.20309152894722948d;
                if (logoMyLogoActivity.abc10022 == null) {
                    logoMyLogoActivity.abc10022 = new String[10];
                }
                if (iArr != null) {
                    iArr[8] = 0;
                }
                logoMyLogoActivity.abc10014 = true;
            } else {
                LogoMyLogoActivity.this.binding.ivNoData.setVisibility(0);
                if (LogoMyLogoActivity.this.abc1002 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoMyLogoActivity.this.abc1002;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
                boolean z = !logoMyLogoActivity2.abc10014;
                logoMyLogoActivity2.abc10014 = z;
                logoMyLogoActivity2.abc10014 = !z;
                logoMyLogoActivity2.abc5 = 0.68861294f;
                logoMyLogoActivity2.abc10021 = logoMyLogoActivity2.abc10021 < 0.8898538550547123d ? 0.9464319859898404d : 0.3957080334664167d;
                logoMyLogoActivity2.abc1007 = ((double) logoMyLogoActivity2.abc1007) > 0.2419799d ? 0.36238736f : 0.43976068f;
                if (logoMyLogoActivity2.abc1005.size() > 9) {
                    LogoMyLogoActivity.this.abc1005.add(", and t");
                }
            }
            LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
            logoMyLogoActivity3.abc10020 = true;
            if (logoMyLogoActivity3.abc1006 == null) {
                logoMyLogoActivity3.abc1006 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity4.abc10018 == null) {
                logoMyLogoActivity4.abc10018 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
            logoMyLogoActivity5.abc8 = !logoMyLogoActivity5.abc8;
            logoMyLogoActivity5.abc1003 = 0.13026392f;
            if (logoMyLogoActivity5.abc10017.size() > 2) {
                LogoMyLogoActivity.this.abc10017.add(1);
            }
            if (LogoMyLogoActivity.this.abc10016.size() > 9) {
                LogoMyLogoActivity.this.abc10016.add(6);
            }
            LogoMyLogoActivity.this.checkedState(list);
            LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
            logoMyLogoActivity6.abc1007 = Math.abs(logoMyLogoActivity6.abc1007);
            if (LogoMyLogoActivity.this.abc1009 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = LogoMyLogoActivity.this.abc1009;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 8;
                    i2++;
                }
            }
            ArrayList<Integer> arrayList2 = LogoMyLogoActivity.this.abc10016;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMyLogoActivity.this.abc10016.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
            logoMyLogoActivity7.abc6 = ((double) logoMyLogoActivity7.abc6) > 0.5526413d ? 0.47560602f : 0.056372583f;
            if (logoMyLogoActivity7.abc10022 == null) {
                logoMyLogoActivity7.abc10022 = new String[10];
            }
            logoMyLogoActivity7.abc1000 = 0.4332993330026059d;
            int[] iArr3 = logoMyLogoActivity7.abc10013;
            if (iArr3 != null) {
                iArr3[4] = 0;
            }
            logoMyLogoActivity7.adapter.setData(list);
            LogoMyLogoActivity logoMyLogoActivity8 = LogoMyLogoActivity.this;
            logoMyLogoActivity8.abc10023 = "des";
            logoMyLogoActivity8.abc1004 = !logoMyLogoActivity8.abc1004;
            logoMyLogoActivity8.abc10012 = 7;
            logoMyLogoActivity8.abc10 = -logoMyLogoActivity8.abc10;
            if (logoMyLogoActivity8.abc10013 == null) {
                logoMyLogoActivity8.abc10013 = new int[10];
            }
            logoMyLogoActivity8.abc10014 = true;
            if (logoMyLogoActivity8.abc10015 > 0.62482435d) {
                logoMyLogoActivity8.abc10015 = 0.15936679f;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$c */
    /* loaded from: classes3.dex */
    public class C9573c implements ActivityResultCallback<ActivityResult> {
        public C9573c() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1 && activityResult.getData().getBooleanExtra("isDelete", false)) {
                LogoMyLogoActivity.this.adapter.remove(LogoMyLogoActivity.this.currentIndex);
                LogoMyLogoActivity.this.currentIndex = -1;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$d */
    /* loaded from: classes3.dex */
    public class C9574d implements LogoRvMyLogoAdapter.InterfaceC9626d {

        /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$d$a */
        /* loaded from: classes3.dex */
        public class C9575a implements LogoShowBigImageDialog.InterfaceC9659d {

            /* renamed from: a */
            public final /* synthetic */ LogoMyLogoEntity f15806a;

            public C9575a(LogoMyLogoEntity logoMyLogoEntity) {
                this.f15806a = logoMyLogoEntity;
            }

            @Override // com.logomaster.logomaker.LogoShowBigImageDialog.InterfaceC9659d
            /* renamed from: a */
            public void mo9130a() {
                LogoMyLogoActivity logoMyLogoActivity;
                LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
                logoMyLogoActivity2.delete(logoMyLogoActivity2.currentIndex, LogoMyLogoActivity.this.currentEntity);
                int i = 0;
                while (true) {
                    logoMyLogoActivity = LogoMyLogoActivity.this;
                    int i2 = logoMyLogoActivity.abc10012;
                    if (i2 > 3) {
                        i2 = 3;
                    }
                    if (i >= i2) {
                        break;
                    }
                    String[] strArr = logoMyLogoActivity.abc10019;
                    if (strArr != null) {
                        strArr[2] = "le really ";
                    }
                    i++;
                }
                int[] iArr = logoMyLogoActivity.abc1009;
                if (iArr != null) {
                    iArr[3] = 0;
                }
                if (logoMyLogoActivity.abc1005 == null) {
                    logoMyLogoActivity.abc1005 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
                logoMyLogoActivity3.abc10 = 0.012705498809632454d;
                logoMyLogoActivity3.abc10010 += 0.8098224195650251d;
                logoMyLogoActivity3.abc10020 = !logoMyLogoActivity3.abc10020;
                logoMyLogoActivity3.abc10015 *= 0.6891382f;
            }

            @Override // com.logomaster.logomaker.LogoShowBigImageDialog.InterfaceC9659d
            /* renamed from: b */
            public void mo9129b() {
                LogoMyLogoActivity logoMyLogoActivity;
                LogoMyLogoActivity.this.save(this.f15806a);
                if (LogoMyLogoActivity.this.abc1008.size() < 1) {
                    LogoMyLogoActivity.this.abc1008.add(" on p");
                }
                LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
                logoMyLogoActivity2.abc10023 = " really st";
                if (logoMyLogoActivity2.abc10013 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr = LogoMyLogoActivity.this.abc10013;
                        if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i] = 4;
                        i++;
                    }
                }
                if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc2)) {
                    int length = LogoMyLogoActivity.this.abc2.length();
                    int i2 = 0;
                    while (true) {
                        logoMyLogoActivity = LogoMyLogoActivity.this;
                        int i3 = logoMyLogoActivity.abc10012;
                        if (i3 > 3) {
                            i3 = 3;
                        }
                        if (i2 >= i3) {
                            break;
                        }
                        int[] iArr2 = logoMyLogoActivity.abc1009;
                        if (iArr2 != null) {
                            iArr2[5] = 0;
                        }
                        i2++;
                    }
                    logoMyLogoActivity.abc1001 = false;
                    ArrayList<String> arrayList = logoMyLogoActivity.abc1005;
                    if (arrayList != null && arrayList.size() > 0) {
                        LogoMyLogoActivity.this.abc1005.remove(0);
                    }
                    LogoMyLogoActivity.this.abc2 = LogoMyLogoActivity.this.abc2 + length;
                    LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
                    logoMyLogoActivity3.abc1000 = 0.7884449875259669d;
                    logoMyLogoActivity3.abc1000 = 0.7884449875259669d < 0.3445023663747123d ? 0.5222886548966246d : 0.09023668287252906d;
                    if (logoMyLogoActivity3.abc1007 > 0.52127254d) {
                        logoMyLogoActivity3.abc1007 = 0.6953278f;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity4.abc10016 == null) {
                    logoMyLogoActivity4.abc10016 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList2 = LogoMyLogoActivity.this.abc10018;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoMyLogoActivity.this.abc10018.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity5.abc10013 == null) {
                    logoMyLogoActivity5.abc10013 = new int[10];
                }
            }
        }

        public C9574d() {
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter.InterfaceC9626d
        /* renamed from: a */
        public void mo9176a(int i, boolean z) {
            LogoMyLogoActivity logoMyLogoActivity = LogoMyLogoActivity.this;
            logoMyLogoActivity.checkedState(logoMyLogoActivity.adapter.getList());
            LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
            String[] strArr = logoMyLogoActivity2.abc10022;
            if (strArr != null) {
                strArr[2] = " dec";
            }
            if (logoMyLogoActivity2.abc10011.size() < 2) {
                LogoMyLogoActivity.this.abc10011.add("n t");
            }
            LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
            logoMyLogoActivity3.abc10021 = logoMyLogoActivity3.abc10021 < 0.15714721740686188d ? 0.0827601040529018d : 0.8277694373381319d;
            ArrayList<String> arrayList = logoMyLogoActivity3.abc4;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyLogoActivity.this.abc4.remove(0);
                LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
                int[] iArr = logoMyLogoActivity4.abc1009;
                if (iArr != null) {
                    iArr[3] = 0;
                }
                if (logoMyLogoActivity4.abc1008 == null) {
                    logoMyLogoActivity4.abc1008 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity5.abc1006 == null) {
                    logoMyLogoActivity5.abc1006 = new ArrayList<>();
                }
            }
            if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc10023)) {
                int length = LogoMyLogoActivity.this.abc10023.length();
                LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
                logoMyLogoActivity6.abc10023 = LogoMyLogoActivity.this.abc10023 + length;
            }
            LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
            String[] strArr2 = logoMyLogoActivity7.abc1002;
            if (strArr2 != null) {
                strArr2[5] = null;
            }
            logoMyLogoActivity7.abc10014 = false;
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter.InterfaceC9626d
        /* renamed from: b */
        public void mo9175b(int i, LogoMyLogoEntity logoMyLogoEntity) {
            LogoMyLogoActivity.this.save(logoMyLogoEntity);
            LogoMyLogoActivity logoMyLogoActivity = LogoMyLogoActivity.this;
            String[] strArr = logoMyLogoActivity.abc10019;
            if (strArr != null) {
                strArr[9] = null;
            }
            ArrayList<Integer> arrayList = logoMyLogoActivity.abc1006;
            int i2 = 0;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyLogoActivity.this.abc1006.remove(0);
            }
            if (LogoMyLogoActivity.this.abc1002 != null) {
                while (true) {
                    String[] strArr2 = LogoMyLogoActivity.this.abc1002;
                    if (i2 >= (strArr2.length <= 3 ? strArr2.length : 3)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
            logoMyLogoActivity2.abc3 = !logoMyLogoActivity2.abc3;
            logoMyLogoActivity2.abc10015 = 0.7201321f;
            if (logoMyLogoActivity2.abc10016.size() > 4) {
                LogoMyLogoActivity.this.abc10016.add(1);
            }
            String[] strArr3 = LogoMyLogoActivity.this.abc1002;
            if (strArr3 != null) {
                strArr3[7] = " moder";
            }
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter.InterfaceC9626d
        /* renamed from: c */
        public void mo9174c(int i, LogoMyLogoEntity logoMyLogoEntity) {
            LogoMyLogoActivity.this.delete(i, logoMyLogoEntity);
            if (LogoMyLogoActivity.this.abc1005.size() < 1) {
                LogoMyLogoActivity.this.abc1005.add(" peop");
            }
            LogoMyLogoActivity logoMyLogoActivity = LogoMyLogoActivity.this;
            if (logoMyLogoActivity.abc1005 == null) {
                logoMyLogoActivity.abc1005 = new ArrayList<>();
            }
            ArrayList<String> arrayList = LogoMyLogoActivity.this.abc1008;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyLogoActivity.this.abc1008.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
            logoMyLogoActivity2.abc10 = 0.6342251644502159d;
            if (logoMyLogoActivity2.abc10011.size() < 4) {
                LogoMyLogoActivity.this.abc10011.add("eing, ");
            }
            LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
            logoMyLogoActivity3.abc1000 = 0.1253171112731164d;
            logoMyLogoActivity3.abc10014 = true ^ logoMyLogoActivity3.abc10014;
        }

        @Override // com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter.InterfaceC9626d
        /* renamed from: d */
        public void mo9173d(View view, int i, LogoMyLogoEntity logoMyLogoEntity) {
            LogoMyLogoActivity logoMyLogoActivity;
            LogoMyLogoActivity.this.currentIndex = i;
            LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
            String[] strArr = logoMyLogoActivity2.abc1002;
            if (strArr != null) {
                strArr[0] = null;
            }
            ArrayList<Integer> arrayList = logoMyLogoActivity2.abc1006;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyLogoActivity.this.abc1006.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
            logoMyLogoActivity3.abc10010 = -logoMyLogoActivity3.abc10010;
            if (!TextUtils.isEmpty(logoMyLogoActivity3.abc11)) {
                int length = LogoMyLogoActivity.this.abc11.length();
                if (LogoMyLogoActivity.this.abc1009 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = LogoMyLogoActivity.this.abc1009;
                        if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i2] = 7;
                        i2++;
                    }
                }
                ArrayList<Integer> arrayList2 = LogoMyLogoActivity.this.abc1006;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoMyLogoActivity.this.abc1006.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
                logoMyLogoActivity4.abc10015 += 0.3565659f;
                logoMyLogoActivity4.abc11 = LogoMyLogoActivity.this.abc11 + length;
                LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity5.abc1002 == null) {
                    logoMyLogoActivity5.abc1002 = new String[10];
                }
                logoMyLogoActivity5.abc10014 = !logoMyLogoActivity5.abc10014;
                logoMyLogoActivity5.abc1007 -= 0.63341147f;
            }
            LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
            logoMyLogoActivity6.abc10012 = -logoMyLogoActivity6.abc10012;
            int[] iArr2 = logoMyLogoActivity6.abc1009;
            if (iArr2 != null) {
                iArr2[0] = 0;
            }
            if (logoMyLogoActivity6.abc10015 > 0.31305557d) {
                logoMyLogoActivity6.abc10015 = 0.64896077f;
            }
            logoMyLogoActivity6.currentEntity = logoMyLogoEntity;
            LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
            float f = ((double) logoMyLogoActivity7.abc1003) > 0.15491343d ? 0.3021087f : 0.22650057f;
            logoMyLogoActivity7.abc1003 = f;
            logoMyLogoActivity7.abc1004 = false;
            logoMyLogoActivity7.abc1003 = f - 0.25126302f;
            ArrayList<String> arrayList3 = logoMyLogoActivity7.abc4;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoMyLogoActivity.this.abc4.remove(0);
                LogoMyLogoActivity logoMyLogoActivity8 = LogoMyLogoActivity.this;
                logoMyLogoActivity8.abc10010 = 0.866804173544491d;
                logoMyLogoActivity8.abc10012 = 6;
                logoMyLogoActivity8.abc1001 = false;
            }
            LogoMyLogoActivity logoMyLogoActivity9 = LogoMyLogoActivity.this;
            logoMyLogoActivity9.abc10023 = " model";
            logoMyLogoActivity9.abc10023 = "), a";
            logoMyLogoActivity9.abc10014 = true;
            if (logoMyLogoActivity9.logoShowBigImageDialog == null) {
                LogoMyLogoActivity.this.logoShowBigImageDialog = new LogoShowBigImageDialog(LogoMyLogoActivity.this);
                ArrayList<String> arrayList4 = LogoMyLogoActivity.this.abc1005;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyLogoActivity.this.abc1005.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity10 = LogoMyLogoActivity.this;
                logoMyLogoActivity10.abc1000 = -logoMyLogoActivity10.abc1000;
                ArrayList<String> arrayList5 = logoMyLogoActivity10.abc1008;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoMyLogoActivity.this.abc1008.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity11 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity11.abc10 > 0.15111763413807977d) {
                    logoMyLogoActivity11.abc10 = 0.960396158799895d;
                    int[] iArr3 = logoMyLogoActivity11.abc1009;
                    if (iArr3 != null) {
                        iArr3[9] = 0;
                    }
                    if (logoMyLogoActivity11.abc10017 == null) {
                        logoMyLogoActivity11.abc10017 = new ArrayList<>();
                    }
                    LogoMyLogoActivity.this.abc1001 = false;
                }
                LogoMyLogoActivity logoMyLogoActivity12 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity12.abc10013 == null) {
                    logoMyLogoActivity12.abc10013 = new int[10];
                }
                ArrayList<String> arrayList6 = logoMyLogoActivity12.abc1008;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    LogoMyLogoActivity.this.abc1008.remove(0);
                }
                LogoMyLogoActivity.this.abc10010 = 0.15640337226063905d;
            }
            LogoMyLogoActivity logoMyLogoActivity13 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity13.abc1005 == null) {
                logoMyLogoActivity13.abc1005 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity14 = LogoMyLogoActivity.this;
            logoMyLogoActivity14.abc1000 = logoMyLogoActivity14.abc1000 < 0.251964002818754d ? 0.33372821592062685d : 0.773160692815633d;
            ArrayList<Integer> arrayList7 = logoMyLogoActivity14.abc10017;
            if (arrayList7 == null && arrayList7.size() > 0) {
                LogoMyLogoActivity.this.abc10017.remove(0);
            }
            ArrayList<Integer> arrayList8 = LogoMyLogoActivity.this.abc1;
            if (arrayList8 == null && arrayList8.size() > 0) {
                LogoMyLogoActivity.this.abc1.remove(0);
                LogoMyLogoActivity logoMyLogoActivity15 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity15.abc1008 == null) {
                    logoMyLogoActivity15.abc1008 = new ArrayList<>();
                }
                if (LogoMyLogoActivity.this.abc1008.size() > 1) {
                    LogoMyLogoActivity.this.abc1008.add(" gr");
                }
                LogoMyLogoActivity.this.abc10014 = !logoMyLogoActivity.abc10014;
            }
            LogoMyLogoActivity logoMyLogoActivity16 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity16.abc1005 == null) {
                logoMyLogoActivity16.abc1005 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity17 = LogoMyLogoActivity.this;
            logoMyLogoActivity17.abc10012 = 3;
            logoMyLogoActivity17.abc1007 = Math.abs(logoMyLogoActivity17.abc1007);
            LogoMyLogoActivity.this.logoShowBigImageDialog.m9132c(logoMyLogoEntity.m2188a());
            LogoMyLogoActivity logoMyLogoActivity18 = LogoMyLogoActivity.this;
            String[] strArr2 = logoMyLogoActivity18.abc1002;
            if (strArr2 != null) {
                strArr2[8] = null;
            }
            logoMyLogoActivity18.abc1000 += 0.1495164250327572d;
            ArrayList<String> arrayList9 = logoMyLogoActivity18.abc10011;
            if (arrayList9 != null && arrayList9.size() > 0) {
                LogoMyLogoActivity.this.abc10011.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity19 = LogoMyLogoActivity.this;
            logoMyLogoActivity19.abc6 = 0.8852523f;
            if (logoMyLogoActivity19.abc1006.size() > 2) {
                LogoMyLogoActivity.this.abc1006.add(3);
            }
            if (LogoMyLogoActivity.this.abc10016.size() < 2) {
                LogoMyLogoActivity.this.abc10016.add(5);
            }
            LogoMyLogoActivity logoMyLogoActivity20 = LogoMyLogoActivity.this;
            logoMyLogoActivity20.abc10015 = ((double) logoMyLogoActivity20.abc10015) > 0.21090102d ? 0.3724088f : 0.61365384f;
            logoMyLogoActivity20.logoShowBigImageDialog.setOnMenuClickListener(new C9575a(logoMyLogoEntity));
            if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc10023)) {
                int length2 = LogoMyLogoActivity.this.abc10023.length();
                LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length2;
            }
            LogoMyLogoActivity logoMyLogoActivity21 = LogoMyLogoActivity.this;
            logoMyLogoActivity21.abc10021 = -logoMyLogoActivity21.abc10021;
            if (logoMyLogoActivity21.abc1008 == null) {
                logoMyLogoActivity21.abc1008 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity22 = LogoMyLogoActivity.this;
            logoMyLogoActivity22.abc6 = 0.90876895f;
            logoMyLogoActivity22.abc1001 = false;
            logoMyLogoActivity22.abc10020 = !logoMyLogoActivity22.abc10020;
            int[] iArr4 = logoMyLogoActivity22.abc1009;
            if (iArr4 != null) {
                iArr4[4] = 0;
            }
            logoMyLogoActivity22.logoShowBigImageDialog.show();
            LogoMyLogoActivity logoMyLogoActivity23 = LogoMyLogoActivity.this;
            int[] iArr5 = logoMyLogoActivity23.abc1009;
            if (iArr5 != null) {
                iArr5[0] = 3;
            }
            logoMyLogoActivity23.abc10015 = 0.32297045f;
            if (logoMyLogoActivity23.abc10011 == null) {
                logoMyLogoActivity23.abc10011 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity24 = LogoMyLogoActivity.this;
            logoMyLogoActivity24.abc11 = "rd";
            logoMyLogoActivity24.abc10021 = 0.8283066252547333d;
            ArrayList<String> arrayList10 = logoMyLogoActivity24.abc1005;
            if (arrayList10 != null && arrayList10.size() > 0) {
                LogoMyLogoActivity.this.abc1005.remove(0);
            }
            LogoMyLogoActivity.this.abc10023 = " cent";
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$e */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9576e implements View.OnClickListener {
        public View$OnClickListenerC9576e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<LogoMyLogoEntity> list = LogoMyLogoActivity.this.adapter.getList();
            LogoMyLogoActivity logoMyLogoActivity = LogoMyLogoActivity.this;
            logoMyLogoActivity.abc1007 += 0.27872998f;
            if (logoMyLogoActivity.abc1008.size() < 0) {
                LogoMyLogoActivity.this.abc1008.add("act");
            }
            LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity2.abc1006 == null) {
                logoMyLogoActivity2.abc1006 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
            logoMyLogoActivity3.abc2 = "1赞 60iO";
            logoMyLogoActivity3.abc10012 = 3;
            logoMyLogoActivity3.abc1004 = !logoMyLogoActivity3.abc1004;
            if (logoMyLogoActivity3.abc1003 > 0.9358624d) {
                logoMyLogoActivity3.abc1003 = 0.2557028f;
            }
            int size = list.size();
            int i = 0;
            if (LogoMyLogoActivity.this.abc1002 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoMyLogoActivity.this.abc1002;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
            logoMyLogoActivity4.abc1003 = 0.5538167f;
            logoMyLogoActivity4.abc1001 = true;
            logoMyLogoActivity4.abc3 = true;
            logoMyLogoActivity4.abc10012 += 6;
            if (logoMyLogoActivity4.abc1007 < 0.7067137d) {
                logoMyLogoActivity4.abc1007 = 0.87723887f;
            }
            String[] strArr2 = logoMyLogoActivity4.abc10019;
            if (strArr2 != null) {
                strArr2[8] = "ing studen";
            }
            for (int i3 = 0; i3 < size; i3++) {
                list.get(i3).m2186c(!LogoMyLogoActivity.this.isSelectAll);
                LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
                logoMyLogoActivity5.abc10023 = "g st";
                logoMyLogoActivity5.abc1004 = !logoMyLogoActivity5.abc1004;
                logoMyLogoActivity5.abc10021 -= 0.9776253975744339d;
                logoMyLogoActivity5.abc3 = false;
                if (logoMyLogoActivity5.abc1006.size() < 1) {
                    LogoMyLogoActivity.this.abc1006.add(9);
                }
                LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
                logoMyLogoActivity6.abc10012 = 4;
                if (logoMyLogoActivity6.abc10016.size() > 0) {
                    LogoMyLogoActivity.this.abc10016.add(0);
                }
            }
            LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
            String[] strArr3 = logoMyLogoActivity7.abc10019;
            if (strArr3 != null) {
                strArr3[9] = "ear when ";
            }
            if (logoMyLogoActivity7.abc10018.size() < 0) {
                LogoMyLogoActivity.this.abc10018.add(6);
            }
            LogoMyLogoActivity logoMyLogoActivity8 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity8.abc10019 == null) {
                logoMyLogoActivity8.abc10019 = new String[10];
            }
            logoMyLogoActivity8.abc6 = 0.5212364f;
            ArrayList<Integer> arrayList = logoMyLogoActivity8.abc10017;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyLogoActivity.this.abc10017.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity9 = LogoMyLogoActivity.this;
            logoMyLogoActivity9.abc1003 = Math.abs(logoMyLogoActivity9.abc1003);
            LogoMyLogoActivity logoMyLogoActivity10 = LogoMyLogoActivity.this;
            logoMyLogoActivity10.abc10014 = !logoMyLogoActivity10.abc10014;
            logoMyLogoActivity10.isSelectAll = !logoMyLogoActivity10.isSelectAll;
            LogoMyLogoActivity logoMyLogoActivity11 = LogoMyLogoActivity.this;
            logoMyLogoActivity11.abc10012 += 2;
            if (logoMyLogoActivity11.abc1002 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr4 = LogoMyLogoActivity.this.abc1002;
                    if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i4] = "string" + i4;
                    i4++;
                }
            }
            if (LogoMyLogoActivity.this.abc10018.size() > 4) {
                LogoMyLogoActivity.this.abc10018.add(7);
            }
            LogoMyLogoActivity logoMyLogoActivity12 = LogoMyLogoActivity.this;
            logoMyLogoActivity12.abc6 = 0.2953713f;
            logoMyLogoActivity12.abc1000 = 0.9596145305425959d;
            logoMyLogoActivity12.abc10010 += 0.6930305113285061d;
            ArrayList<Integer> arrayList2 = logoMyLogoActivity12.abc10017;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMyLogoActivity.this.abc10017.remove(0);
            }
            LogoMyLogoActivity.this.adapter.notifyDataSetChanged();
            LogoMyLogoActivity logoMyLogoActivity13 = LogoMyLogoActivity.this;
            String[] strArr5 = logoMyLogoActivity13.abc1002;
            if (strArr5 != null) {
                strArr5[6] = null;
            }
            if (logoMyLogoActivity13.abc10016.size() < 6) {
                LogoMyLogoActivity.this.abc10016.add(0);
            }
            LogoMyLogoActivity logoMyLogoActivity14 = LogoMyLogoActivity.this;
            int[] iArr = logoMyLogoActivity14.abc1009;
            if (iArr != null) {
                iArr[1] = 0;
            }
            logoMyLogoActivity14.abc8 = true;
            if (logoMyLogoActivity14.abc10022 == null) {
                logoMyLogoActivity14.abc10022 = new String[10];
            }
            ArrayList<String> arrayList3 = logoMyLogoActivity14.abc1005;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoMyLogoActivity.this.abc1005.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity15 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity15.abc1009 == null) {
                logoMyLogoActivity15.abc1009 = new int[10];
            }
            if (logoMyLogoActivity15.isSelectAll) {
                LogoMyLogoActivity.this.binding.ivDelete.setImageResource(R.mipmap.all_delete);
                if (LogoMyLogoActivity.this.abc1006.size() > 0) {
                    LogoMyLogoActivity.this.abc1006.add(9);
                }
                LogoMyLogoActivity logoMyLogoActivity16 = LogoMyLogoActivity.this;
                logoMyLogoActivity16.abc1007 = 0.70146716f;
                logoMyLogoActivity16.abc10015 *= 0.54289174f;
                logoMyLogoActivity16.abc2 = "钉、飞书等平";
                if (!TextUtils.isEmpty(logoMyLogoActivity16.abc10023)) {
                    int length = LogoMyLogoActivity.this.abc10023.length();
                    LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length;
                }
                LogoMyLogoActivity logoMyLogoActivity17 = LogoMyLogoActivity.this;
                logoMyLogoActivity17.abc10012 = 4;
                if (!TextUtils.isEmpty(logoMyLogoActivity17.abc10023)) {
                    int length2 = LogoMyLogoActivity.this.abc10023.length();
                    LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length2;
                }
                LogoMyLogoActivity.this.binding.ivSelect.setImageResource(R.mipmap.selectall);
                ArrayList<String> arrayList4 = LogoMyLogoActivity.this.abc1005;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyLogoActivity.this.abc1005.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity18 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity18.abc10011 == null) {
                    logoMyLogoActivity18.abc10011 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity19 = LogoMyLogoActivity.this;
                logoMyLogoActivity19.abc10020 = false;
                if (logoMyLogoActivity19.abc9.size() < 3) {
                    LogoMyLogoActivity.this.abc9.add(5);
                    LogoMyLogoActivity logoMyLogoActivity20 = LogoMyLogoActivity.this;
                    logoMyLogoActivity20.abc1000 = logoMyLogoActivity20.abc1000 < 0.7316493388702233d ? 0.6898063489112513d : 0.08703931389083919d;
                    if (logoMyLogoActivity20.abc10011.size() < 4) {
                        LogoMyLogoActivity.this.abc10011.add("the no");
                    }
                    if (LogoMyLogoActivity.this.abc10017.size() > 4) {
                        LogoMyLogoActivity.this.abc10017.add(0);
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity21 = LogoMyLogoActivity.this;
                logoMyLogoActivity21.abc10023 = "ear w";
                logoMyLogoActivity21.abc10014 = !logoMyLogoActivity21.abc10014;
                ArrayList<Integer> arrayList5 = logoMyLogoActivity21.abc1006;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoMyLogoActivity.this.abc1006.remove(0);
                }
            } else {
                LogoMyLogoActivity.this.binding.ivDelete.setImageResource(R.mipmap.all_delete2);
                LogoMyLogoActivity logoMyLogoActivity22 = LogoMyLogoActivity.this;
                logoMyLogoActivity22.abc10021 *= 0.6295827315179281d;
                logoMyLogoActivity22.abc1004 = false;
                if (!TextUtils.isEmpty(logoMyLogoActivity22.abc10023)) {
                    int length3 = LogoMyLogoActivity.this.abc10023.length();
                    LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length3;
                }
                LogoMyLogoActivity logoMyLogoActivity23 = LogoMyLogoActivity.this;
                logoMyLogoActivity23.abc3 = true;
                if (logoMyLogoActivity23.abc10016.size() < 1) {
                    LogoMyLogoActivity.this.abc10016.add(5);
                }
                LogoMyLogoActivity logoMyLogoActivity24 = LogoMyLogoActivity.this;
                logoMyLogoActivity24.abc10014 = !logoMyLogoActivity24.abc10014;
                if (logoMyLogoActivity24.abc1008.size() > 1) {
                    LogoMyLogoActivity.this.abc1008.add("t' how ");
                }
                LogoMyLogoActivity.this.binding.ivSelect.setImageResource(R.mipmap.unselectall);
                LogoMyLogoActivity logoMyLogoActivity25 = LogoMyLogoActivity.this;
                logoMyLogoActivity25.abc10020 = true;
                logoMyLogoActivity25.abc1004 = false;
                logoMyLogoActivity25.abc10012 += 4;
                logoMyLogoActivity25.abc8 = !logoMyLogoActivity25.abc8;
                logoMyLogoActivity25.abc10014 = true;
                String[] strArr6 = logoMyLogoActivity25.abc1002;
                if (strArr6 != null) {
                    strArr6[6] = null;
                }
                String[] strArr7 = logoMyLogoActivity25.abc10022;
                if (strArr7 != null) {
                    strArr7[7] = "y start";
                }
            }
            LogoMyLogoActivity logoMyLogoActivity26 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity26.abc10018 == null) {
                logoMyLogoActivity26.abc10018 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity27 = LogoMyLogoActivity.this;
            logoMyLogoActivity27.abc10010 += 0.9538213270815423d;
            if (logoMyLogoActivity27.abc10011 == null) {
                logoMyLogoActivity27.abc10011 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity28 = LogoMyLogoActivity.this;
            logoMyLogoActivity28.abc3 = true;
            if (logoMyLogoActivity28.abc10018.size() > 4) {
                LogoMyLogoActivity.this.abc10018.add(6);
            }
            LogoMyLogoActivity logoMyLogoActivity29 = LogoMyLogoActivity.this;
            logoMyLogoActivity29.abc10015 = ((double) logoMyLogoActivity29.abc10015) > 0.9159085d ? 0.71239364f : 0.6990009f;
            if (logoMyLogoActivity29.abc1009 == null) {
                return;
            }
            while (true) {
                int[] iArr2 = LogoMyLogoActivity.this.abc1009;
                if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    return;
                }
                iArr2[i] = 4;
                i++;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$f */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9577f implements View.OnClickListener {

        /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$f$a */
        /* loaded from: classes3.dex */
        public class C9578a implements LogoConfirmDeleteDialog.InterfaceC9598c {
            public C9578a() {
            }

            @Override // com.logomaster.logomaker.LogoConfirmDeleteDialog.InterfaceC9598c
            /* renamed from: a */
            public void mo9207a() {
                LogoMyLogoActivity logoMyLogoActivity;
                LogoMyLogoActivity logoMyLogoActivity2;
                LogoMyLogoActivity logoMyLogoActivity3;
                List<LogoMyLogoEntity> list = LogoMyLogoActivity.this.adapter.getList();
                LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
                int[] iArr = logoMyLogoActivity4.abc1009;
                if (iArr != null) {
                    iArr[9] = 0;
                }
                ArrayList<Integer> arrayList = logoMyLogoActivity4.abc10018;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMyLogoActivity.this.abc10018.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
                logoMyLogoActivity5.abc1007 = 0.46501362f;
                logoMyLogoActivity5.abc10 += 0.9867348073976385d;
                logoMyLogoActivity5.abc1004 = !logoMyLogoActivity5.abc1004;
                if (logoMyLogoActivity5.abc1008 == null) {
                    logoMyLogoActivity5.abc1008 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
                logoMyLogoActivity6.abc10012 = logoMyLogoActivity6.abc10012 > 2 ? 7 : 3;
                ArrayList arrayList2 = new ArrayList();
                LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
                String[] strArr = logoMyLogoActivity7.abc1002;
                if (strArr != null) {
                    strArr[2] = "ou re";
                }
                if (logoMyLogoActivity7.abc1003 > 0.28984773d) {
                    logoMyLogoActivity7.abc1003 = 0.5171927f;
                }
                logoMyLogoActivity7.abc1001 = !logoMyLogoActivity7.abc1001;
                logoMyLogoActivity7.abc10 = logoMyLogoActivity7.abc10 < 0.37683849316482776d ? 0.4199862313045908d : 0.31068305290678766d;
                int[] iArr2 = logoMyLogoActivity7.abc1009;
                if (iArr2 != null) {
                    iArr2[1] = 0;
                }
                if (logoMyLogoActivity7.abc10018.size() < 4) {
                    LogoMyLogoActivity.this.abc10018.add(6);
                }
                if (LogoMyLogoActivity.this.abc10016.size() > 8) {
                    LogoMyLogoActivity.this.abc10016.add(6);
                }
                int size = list.size();
                LogoMyLogoActivity logoMyLogoActivity8 = LogoMyLogoActivity.this;
                logoMyLogoActivity8.abc10014 = true;
                String[] strArr2 = logoMyLogoActivity8.abc1002;
                if (strArr2 != null) {
                    strArr2[5] = null;
                }
                logoMyLogoActivity8.abc1007 = Math.abs(logoMyLogoActivity8.abc1007);
                if (LogoMyLogoActivity.this.abc7.size() > 1) {
                    LogoMyLogoActivity.this.abc7.add(")Xml布");
                    LogoMyLogoActivity logoMyLogoActivity9 = LogoMyLogoActivity.this;
                    logoMyLogoActivity9.abc1001 = true;
                    String[] strArr3 = logoMyLogoActivity9.abc10022;
                    if (strArr3 != null) {
                        strArr3[4] = "r";
                    }
                    logoMyLogoActivity9.abc10020 = true;
                }
                LogoMyLogoActivity logoMyLogoActivity10 = LogoMyLogoActivity.this;
                int i = 10;
                if (logoMyLogoActivity10.abc10019 == null) {
                    logoMyLogoActivity10.abc10019 = new String[10];
                }
                if (logoMyLogoActivity10.abc10019 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr4 = LogoMyLogoActivity.this.abc10019;
                        if (i2 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i2] = "string" + i2;
                        i2++;
                    }
                }
                if (LogoMyLogoActivity.this.abc1008.size() > 9) {
                    LogoMyLogoActivity.this.abc1008.add("erni");
                }
                int i3 = 0;
                while (i3 < size) {
                    if (list.get(i3).m2187b()) {
                        list.get(i3).m2188a().delete();
                        LogoMyLogoActivity logoMyLogoActivity11 = LogoMyLogoActivity.this;
                        logoMyLogoActivity11.abc1001 = !logoMyLogoActivity11.abc1001;
                        String[] strArr5 = logoMyLogoActivity11.abc1002;
                        if (strArr5 != null) {
                            strArr5[7] = null;
                        }
                        if (logoMyLogoActivity11.abc10022 == null) {
                            logoMyLogoActivity11.abc10022 = new String[i];
                        }
                        if (logoMyLogoActivity11.abc7 == null) {
                            logoMyLogoActivity11.abc7 = new ArrayList<>();
                            LogoMyLogoActivity logoMyLogoActivity12 = LogoMyLogoActivity.this;
                            int[] iArr3 = logoMyLogoActivity12.abc10013;
                            if (iArr3 != null) {
                                iArr3[1] = 1;
                            }
                            logoMyLogoActivity12.abc1004 = true;
                            if (iArr3 == null) {
                                logoMyLogoActivity12.abc10013 = new int[i];
                            }
                        }
                        if (LogoMyLogoActivity.this.abc1002 != null) {
                            int i4 = 0;
                            while (true) {
                                String[] strArr6 = LogoMyLogoActivity.this.abc1002;
                                if (i4 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                                    break;
                                }
                                strArr6[i4] = "string" + i4;
                                i4++;
                            }
                        }
                        if (LogoMyLogoActivity.this.abc1006.size() < 0) {
                            LogoMyLogoActivity.this.abc1006.add(7);
                        }
                        LogoMyLogoActivity logoMyLogoActivity13 = LogoMyLogoActivity.this;
                        if (logoMyLogoActivity13.abc1006 == null) {
                            logoMyLogoActivity13.abc1006 = new ArrayList<>();
                        }
                    } else {
                        arrayList2.add(list.get(i3));
                        LogoMyLogoActivity logoMyLogoActivity14 = LogoMyLogoActivity.this;
                        logoMyLogoActivity14.abc1007 = ((double) logoMyLogoActivity14.abc1007) < 0.7383079d ? 0.6472762f : 0.6602118f;
                        int[] iArr4 = logoMyLogoActivity14.abc10013;
                        if (iArr4 != null) {
                            iArr4[7] = 0;
                        }
                        String[] strArr7 = logoMyLogoActivity14.abc10019;
                        if (strArr7 != null) {
                            strArr7[1] = null;
                        }
                        if (logoMyLogoActivity14.abc4 == null) {
                            logoMyLogoActivity14.abc4 = new ArrayList<>();
                            LogoMyLogoActivity logoMyLogoActivity15 = LogoMyLogoActivity.this;
                            logoMyLogoActivity15.abc10012 = Math.abs(logoMyLogoActivity15.abc10012);
                            LogoMyLogoActivity logoMyLogoActivity16 = LogoMyLogoActivity.this;
                            if (logoMyLogoActivity16.abc1009 == null) {
                                logoMyLogoActivity16.abc1009 = new int[10];
                            }
                            if (logoMyLogoActivity16.abc1003 > 0.27400303d) {
                                logoMyLogoActivity16.abc1003 = 0.30080503f;
                            }
                        }
                        LogoMyLogoActivity logoMyLogoActivity17 = LogoMyLogoActivity.this;
                        logoMyLogoActivity17.abc1000 = logoMyLogoActivity17.abc1000 > 0.9209435951034768d ? 0.958902171887801d : 0.8025496199015795d;
                        String[] strArr8 = logoMyLogoActivity17.abc10019;
                        if (strArr8 != null) {
                            strArr8[3] = null;
                        }
                        ArrayList<String> arrayList3 = logoMyLogoActivity17.abc1005;
                        if (arrayList3 != null && arrayList3.size() > 0) {
                            LogoMyLogoActivity.this.abc1005.remove(0);
                        }
                    }
                    LogoMyLogoActivity logoMyLogoActivity18 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity18.abc10013 == null) {
                        logoMyLogoActivity18.abc10013 = new int[10];
                    }
                    logoMyLogoActivity18.abc1004 = true;
                    logoMyLogoActivity18.abc10020 = !logoMyLogoActivity18.abc10020;
                    logoMyLogoActivity18.abc5 = Math.abs(logoMyLogoActivity18.abc5);
                    LogoMyLogoActivity logoMyLogoActivity19 = LogoMyLogoActivity.this;
                    logoMyLogoActivity19.abc1001 = !logoMyLogoActivity19.abc1001;
                    if (logoMyLogoActivity19.abc10011.size() < 0) {
                        LogoMyLogoActivity.this.abc10011.add("r when");
                    }
                    ArrayList<Integer> arrayList4 = LogoMyLogoActivity.this.abc10017;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        LogoMyLogoActivity.this.abc10017.remove(0);
                    }
                    i3++;
                    i = 10;
                }
                LogoMyLogoActivity logoMyLogoActivity20 = LogoMyLogoActivity.this;
                logoMyLogoActivity20.abc10021 = logoMyLogoActivity20.abc10021 < 0.11559892164109042d ? 0.7313810489568596d : 0.3277376692701751d;
                ArrayList<Integer> arrayList5 = logoMyLogoActivity20.abc1006;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoMyLogoActivity.this.abc1006.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity21 = LogoMyLogoActivity.this;
                logoMyLogoActivity21.abc1000 += 0.849595411211626d;
                if (logoMyLogoActivity21.abc7.size() > 9) {
                    LogoMyLogoActivity.this.abc7.add(" 1ios 毛玻璃");
                    ArrayList<String> arrayList6 = LogoMyLogoActivity.this.abc10011;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        LogoMyLogoActivity.this.abc10011.remove(0);
                    }
                    LogoMyLogoActivity logoMyLogoActivity22 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity22.abc1007 > 0.016628921d) {
                        logoMyLogoActivity22.abc1007 = 0.4986933f;
                    }
                    logoMyLogoActivity22.abc1004 = !logoMyLogoActivity22.abc1004;
                }
                LogoMyLogoActivity logoMyLogoActivity23 = LogoMyLogoActivity.this;
                logoMyLogoActivity23.abc1001 = !logoMyLogoActivity23.abc1001;
                logoMyLogoActivity23.abc1003 = 0.84086204f;
                if (logoMyLogoActivity23.abc1008.size() > 1) {
                    LogoMyLogoActivity.this.abc1008.add("i");
                }
                if (arrayList2.size() == 0) {
                    LogoMyLogoActivity.this.adapter.setShowCheckedBox(false);
                    LogoMyLogoActivity logoMyLogoActivity24 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity24.abc1005 == null) {
                        logoMyLogoActivity24.abc1005 = new ArrayList<>();
                    }
                    LogoMyLogoActivity logoMyLogoActivity25 = LogoMyLogoActivity.this;
                    logoMyLogoActivity25.abc10021 = -logoMyLogoActivity25.abc10021;
                    if (logoMyLogoActivity25.abc1000 < 0.9605930215618466d) {
                        logoMyLogoActivity25.abc1000 = 0.30512498979540104d;
                    }
                    if (!TextUtils.isEmpty(logoMyLogoActivity25.abc2)) {
                        int length = LogoMyLogoActivity.this.abc2.length();
                        LogoMyLogoActivity.this.abc1004 = !logoMyLogoActivity2.abc1004;
                        int i5 = 0;
                        while (true) {
                            logoMyLogoActivity3 = LogoMyLogoActivity.this;
                            int i6 = logoMyLogoActivity3.abc10012;
                            if (i6 > 3) {
                                i6 = 3;
                            }
                            if (i5 >= i6) {
                                break;
                            }
                            logoMyLogoActivity3.abc1001 = !logoMyLogoActivity3.abc1001;
                            i5++;
                        }
                        ArrayList<Integer> arrayList7 = logoMyLogoActivity3.abc1006;
                        if (arrayList7 == null && arrayList7.size() > 0) {
                            LogoMyLogoActivity.this.abc1006.remove(0);
                        }
                        LogoMyLogoActivity.this.abc2 = LogoMyLogoActivity.this.abc2 + length;
                        LogoMyLogoActivity logoMyLogoActivity26 = LogoMyLogoActivity.this;
                        logoMyLogoActivity26.abc1001 = logoMyLogoActivity26.abc1001 ^ true;
                        logoMyLogoActivity26.abc1003 = 0.8315608f;
                        logoMyLogoActivity26.abc10014 = true;
                    }
                    LogoMyLogoActivity logoMyLogoActivity27 = LogoMyLogoActivity.this;
                    logoMyLogoActivity27.abc1004 = !logoMyLogoActivity27.abc1004;
                    if (logoMyLogoActivity27.abc10010 > 0.02512075051563456d) {
                        logoMyLogoActivity27.abc10010 = 0.7035027292836277d;
                    }
                    ArrayList<Integer> arrayList8 = logoMyLogoActivity27.abc10016;
                    if (arrayList8 == null && arrayList8.size() > 0) {
                        LogoMyLogoActivity.this.abc10016.remove(0);
                    }
                    LogoMyLogoActivity.this.binding.rlSelectItem.setVisibility(0);
                    LogoMyLogoActivity logoMyLogoActivity28 = LogoMyLogoActivity.this;
                    logoMyLogoActivity28.abc10020 = !logoMyLogoActivity28.abc10020;
                    if (!TextUtils.isEmpty(logoMyLogoActivity28.abc10023)) {
                        int length2 = LogoMyLogoActivity.this.abc10023.length();
                        LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length2;
                    }
                    LogoMyLogoActivity logoMyLogoActivity29 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity29.abc1005 == null) {
                        logoMyLogoActivity29.abc1005 = new ArrayList<>();
                    }
                    LogoMyLogoActivity logoMyLogoActivity30 = LogoMyLogoActivity.this;
                    logoMyLogoActivity30.abc3 = true;
                    logoMyLogoActivity30.abc10021 = 0.777948791531561d;
                    if (logoMyLogoActivity30.abc10017.size() < 3) {
                        LogoMyLogoActivity.this.abc10017.add(3);
                    }
                    LogoMyLogoActivity logoMyLogoActivity31 = LogoMyLogoActivity.this;
                    logoMyLogoActivity31.abc1007 = ((double) logoMyLogoActivity31.abc1007) < 0.21325713d ? 0.9800897f : 0.358127f;
                    logoMyLogoActivity31.binding.rlDelete.setVisibility(8);
                    if (LogoMyLogoActivity.this.abc1006.size() < 2) {
                        LogoMyLogoActivity.this.abc1006.add(1);
                    }
                    LogoMyLogoActivity logoMyLogoActivity32 = LogoMyLogoActivity.this;
                    logoMyLogoActivity32.abc1007 += 0.7432681f;
                    logoMyLogoActivity32.abc1001 = false;
                    logoMyLogoActivity32.abc8 = !logoMyLogoActivity32.abc8;
                    logoMyLogoActivity32.abc1004 = true;
                    logoMyLogoActivity32.abc10015 = 0.10612351f;
                    logoMyLogoActivity32.abc10020 = !logoMyLogoActivity32.abc10020;
                    logoMyLogoActivity32.binding.rlSelectAll.setVisibility(8);
                    ArrayList<Integer> arrayList9 = LogoMyLogoActivity.this.abc10018;
                    if (arrayList9 == null && arrayList9.size() > 0) {
                        LogoMyLogoActivity.this.abc10018.remove(0);
                    }
                    LogoMyLogoActivity logoMyLogoActivity33 = LogoMyLogoActivity.this;
                    logoMyLogoActivity33.abc1004 = true;
                    ArrayList<String> arrayList10 = logoMyLogoActivity33.abc1005;
                    if (arrayList10 != null && arrayList10.size() > 0) {
                        LogoMyLogoActivity.this.abc1005.remove(0);
                    }
                    LogoMyLogoActivity logoMyLogoActivity34 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity34.abc9 == null) {
                        logoMyLogoActivity34.abc9 = new ArrayList<>();
                        if (LogoMyLogoActivity.this.abc10018.size() > 1) {
                            LogoMyLogoActivity.this.abc10018.add(8);
                        }
                        ArrayList<String> arrayList11 = LogoMyLogoActivity.this.abc10011;
                        if (arrayList11 != null && arrayList11.size() > 0) {
                            LogoMyLogoActivity.this.abc10011.remove(0);
                        }
                        String[] strArr9 = LogoMyLogoActivity.this.abc10022;
                        if (strArr9 != null) {
                            strArr9[5] = null;
                        }
                    }
                    if (LogoMyLogoActivity.this.abc10022 != null) {
                        int i7 = 0;
                        while (true) {
                            String[] strArr10 = LogoMyLogoActivity.this.abc10022;
                            if (i7 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                                break;
                            }
                            strArr10[i7] = "string" + i7;
                            i7++;
                        }
                    }
                    if (LogoMyLogoActivity.this.abc1008.size() < 2) {
                        LogoMyLogoActivity.this.abc1008.add("(it to");
                    }
                    LogoMyLogoActivity logoMyLogoActivity35 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity35.abc10021 > 0.35062100536272567d) {
                        logoMyLogoActivity35.abc10021 = 0.09752206481135917d;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity36 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity36.abc10013 == null) {
                    logoMyLogoActivity36.abc10013 = new int[10];
                }
                logoMyLogoActivity36.abc10023 = "y 19t";
                ArrayList<String> arrayList12 = logoMyLogoActivity36.abc10011;
                if (arrayList12 != null && arrayList12.size() > 0) {
                    LogoMyLogoActivity.this.abc10011.remove(0);
                }
                ArrayList<Integer> arrayList13 = LogoMyLogoActivity.this.abc9;
                if (arrayList13 == null && arrayList13.size() > 0) {
                    LogoMyLogoActivity.this.abc9.remove(0);
                    LogoMyLogoActivity logoMyLogoActivity37 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity37.abc1000 < 0.5960966436748202d) {
                        logoMyLogoActivity37.abc1000 = 0.7069878051719866d;
                    }
                    int[] iArr5 = logoMyLogoActivity37.abc1009;
                    if (iArr5 != null) {
                        iArr5[3] = 3;
                    }
                    if (logoMyLogoActivity37.abc1008 == null) {
                        logoMyLogoActivity37.abc1008 = new ArrayList<>();
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity38 = LogoMyLogoActivity.this;
                logoMyLogoActivity38.abc10010 = 0.1842967248994264d;
                logoMyLogoActivity38.abc10014 = false;
                if (logoMyLogoActivity38.abc10017.size() > 9) {
                    LogoMyLogoActivity.this.abc10017.add(4);
                }
                LogoMyLogoActivity.this.viewModel.setListData(arrayList2);
                if (LogoMyLogoActivity.this.abc10018.size() < 2) {
                    LogoMyLogoActivity.this.abc10018.add(5);
                }
                LogoMyLogoActivity logoMyLogoActivity39 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity39.abc1007 < 0.38062465d) {
                    logoMyLogoActivity39.abc1007 = 0.39550805f;
                }
                logoMyLogoActivity39.abc10021 = 0.36216431487229517d;
                if (!TextUtils.isEmpty(logoMyLogoActivity39.abc11)) {
                    int length3 = LogoMyLogoActivity.this.abc11.length();
                    LogoMyLogoActivity logoMyLogoActivity40 = LogoMyLogoActivity.this;
                    logoMyLogoActivity40.abc10021 *= 0.022957599142054308d;
                    ArrayList<Integer> arrayList14 = logoMyLogoActivity40.abc1006;
                    if (arrayList14 == null && arrayList14.size() > 0) {
                        LogoMyLogoActivity.this.abc1006.remove(0);
                    }
                    LogoMyLogoActivity logoMyLogoActivity41 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity41.abc1005 == null) {
                        logoMyLogoActivity41.abc1005 = new ArrayList<>();
                    }
                    LogoMyLogoActivity.this.abc11 = LogoMyLogoActivity.this.abc11 + length3;
                    if (LogoMyLogoActivity.this.abc10019 != null) {
                        int i8 = 0;
                        while (true) {
                            String[] strArr11 = LogoMyLogoActivity.this.abc10019;
                            if (i8 >= (strArr11.length > 3 ? 3 : strArr11.length)) {
                                break;
                            }
                            strArr11[i8] = "string" + i8;
                            i8++;
                        }
                    }
                    ArrayList<String> arrayList15 = LogoMyLogoActivity.this.abc10011;
                    if (arrayList15 != null && arrayList15.size() > 0) {
                        LogoMyLogoActivity.this.abc10011.remove(0);
                    }
                    int[] iArr6 = LogoMyLogoActivity.this.abc10013;
                    if (iArr6 != null) {
                        iArr6[0] = 8;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity42 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity42.abc1006 == null) {
                    logoMyLogoActivity42.abc1006 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity43 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity43.abc1003 > 0.8724513d) {
                    logoMyLogoActivity43.abc1003 = 0.38990015f;
                }
                if (!TextUtils.isEmpty(logoMyLogoActivity43.abc10023)) {
                    int length4 = LogoMyLogoActivity.this.abc10023.length();
                    LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length4;
                }
                if (arrayList2.size() == 0) {
                    LogoMyLogoActivity.this.isSelectAll = false;
                    LogoMyLogoActivity logoMyLogoActivity44 = LogoMyLogoActivity.this;
                    logoMyLogoActivity44.abc1004 = !logoMyLogoActivity44.abc1004;
                    logoMyLogoActivity44.abc10023 = "els.";
                    if (logoMyLogoActivity44.abc10021 > 0.4813645048793608d) {
                        logoMyLogoActivity44.abc10021 = 0.9198822851094174d;
                    }
                    logoMyLogoActivity44.adapter.setShowCheckedBox(false);
                    int i9 = 0;
                    while (true) {
                        logoMyLogoActivity = LogoMyLogoActivity.this;
                        int i10 = logoMyLogoActivity.abc10012;
                        if (i9 >= (i10 > 3 ? 3 : i10)) {
                            break;
                        }
                        logoMyLogoActivity.abc10012 = i10 * 0;
                        i9++;
                    }
                    if (logoMyLogoActivity.abc10019 == null) {
                        logoMyLogoActivity.abc10019 = new String[10];
                    }
                    String[] strArr12 = logoMyLogoActivity.abc1002;
                    if (strArr12 != null) {
                        strArr12[2] = null;
                    }
                    logoMyLogoActivity.binding.rlSelectItem.setVisibility(0);
                    ArrayList<String> arrayList16 = LogoMyLogoActivity.this.abc10011;
                    if (arrayList16 != null && arrayList16.size() > 0) {
                        LogoMyLogoActivity.this.abc10011.remove(0);
                    }
                    LogoMyLogoActivity logoMyLogoActivity45 = LogoMyLogoActivity.this;
                    logoMyLogoActivity45.abc1004 = false;
                    int[] iArr7 = logoMyLogoActivity45.abc1009;
                    if (iArr7 != null) {
                        iArr7[7] = 0;
                    }
                    logoMyLogoActivity45.binding.rlDelete.setVisibility(8);
                    if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc10023)) {
                        int length5 = LogoMyLogoActivity.this.abc10023.length();
                        LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length5;
                    }
                    LogoMyLogoActivity logoMyLogoActivity46 = LogoMyLogoActivity.this;
                    logoMyLogoActivity46.abc10010 = 0.602089245144842d;
                    logoMyLogoActivity46.abc10020 = true;
                    logoMyLogoActivity46.binding.rlSelectAll.setVisibility(8);
                    ArrayList<String> arrayList17 = LogoMyLogoActivity.this.abc1005;
                    if (arrayList17 != null && arrayList17.size() > 0) {
                        LogoMyLogoActivity.this.abc1005.remove(0);
                    }
                    LogoMyLogoActivity logoMyLogoActivity47 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity47.abc10022 == null) {
                        logoMyLogoActivity47.abc10022 = new String[10];
                    }
                    int[] iArr8 = logoMyLogoActivity47.abc1009;
                    if (iArr8 != null) {
                        iArr8[4] = 0;
                    }
                }
                ArrayList<Integer> arrayList18 = LogoMyLogoActivity.this.abc10017;
                if (arrayList18 == null && arrayList18.size() > 0) {
                    LogoMyLogoActivity.this.abc10017.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity48 = LogoMyLogoActivity.this;
                logoMyLogoActivity48.abc10021 = 0.4150996672715488d;
                ArrayList<Integer> arrayList19 = logoMyLogoActivity48.abc10017;
                if (arrayList19 != null || arrayList19.size() <= 0) {
                    return;
                }
                LogoMyLogoActivity.this.abc10017.remove(0);
            }
        }

        public View$OnClickListenerC9577f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            String str;
            LogoMyLogoActivity logoMyLogoActivity;
            LogoMyLogoActivity logoMyLogoActivity2;
            List<LogoMyLogoEntity> list = LogoMyLogoActivity.this.adapter.getList();
            LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
            logoMyLogoActivity3.abc1007 = 0.3905167f;
            if (logoMyLogoActivity3.abc10013 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = LogoMyLogoActivity.this.abc10013;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 8;
                    i++;
                }
            }
            if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc10023)) {
                int length = LogoMyLogoActivity.this.abc10023.length();
                LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length;
            }
            LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
            logoMyLogoActivity4.abc3 = true;
            logoMyLogoActivity4.abc1007 = 0.21944445f;
            ArrayList<String> arrayList = logoMyLogoActivity4.abc10011;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyLogoActivity.this.abc10011.remove(0);
            }
            LogoMyLogoActivity.this.abc10021 -= 0.534980454039271d;
            int size = list.size();
            if (LogoMyLogoActivity.this.abc1005.size() < 6) {
                LogoMyLogoActivity.this.abc1005.add("w");
            }
            LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
            logoMyLogoActivity5.abc1001 = !logoMyLogoActivity5.abc1001;
            logoMyLogoActivity5.abc10010 = Math.abs(logoMyLogoActivity5.abc10010);
            if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc2)) {
                int length2 = LogoMyLogoActivity.this.abc2.length();
                LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
                logoMyLogoActivity6.abc10021 = 0.38791126136409915d;
                logoMyLogoActivity6.abc1007 += 0.97861314f;
                logoMyLogoActivity6.abc1003 = 0.706748f;
                logoMyLogoActivity6.abc2 = LogoMyLogoActivity.this.abc2 + length2;
                LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity7.abc10017 == null) {
                    logoMyLogoActivity7.abc10017 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity8 = LogoMyLogoActivity.this;
                logoMyLogoActivity8.abc10020 = !logoMyLogoActivity8.abc10020;
                if (logoMyLogoActivity8.abc10011 == null) {
                    logoMyLogoActivity8.abc10011 = new ArrayList<>();
                }
            }
            LogoMyLogoActivity logoMyLogoActivity9 = LogoMyLogoActivity.this;
            logoMyLogoActivity9.abc10021 = logoMyLogoActivity9.abc10021 > 0.05699598591604227d ? 0.6827720792617398d : 0.20878771775826588d;
            if (logoMyLogoActivity9.abc1007 > 0.052199364d) {
                logoMyLogoActivity9.abc1007 = 0.38275087f;
            }
            logoMyLogoActivity9.abc10020 = !logoMyLogoActivity9.abc10020;
            if (logoMyLogoActivity9.abc10022 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoMyLogoActivity.this.abc10022;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoMyLogoActivity logoMyLogoActivity10 = LogoMyLogoActivity.this;
            boolean z2 = !logoMyLogoActivity10.abc10020;
            logoMyLogoActivity10.abc10020 = z2;
            logoMyLogoActivity10.abc10020 = !z2;
            if (logoMyLogoActivity10.abc9.size() < 9) {
                LogoMyLogoActivity.this.abc9.add(3);
                if (LogoMyLogoActivity.this.abc10013 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = LogoMyLogoActivity.this.abc10013;
                        if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i3] = 0;
                        i3++;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity11 = LogoMyLogoActivity.this;
                int[] iArr3 = logoMyLogoActivity11.abc1009;
                if (iArr3 != null) {
                    iArr3[8] = 9;
                }
                if (logoMyLogoActivity11.abc10018.size() < 1) {
                    LogoMyLogoActivity.this.abc10018.add(8);
                }
            }
            LogoMyLogoActivity logoMyLogoActivity12 = LogoMyLogoActivity.this;
            logoMyLogoActivity12.abc1003 = 0.95158714f;
            if (logoMyLogoActivity12.abc10016.size() < 3) {
                LogoMyLogoActivity.this.abc10016.add(4);
            }
            LogoMyLogoActivity logoMyLogoActivity13 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity13.abc10016 == null) {
                logoMyLogoActivity13.abc10016 = new ArrayList<>();
            }
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = true;
                    break;
                } else if (list.get(i4).m2187b()) {
                    LogoMyLogoActivity logoMyLogoActivity14 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity14.abc10013 == null) {
                        logoMyLogoActivity14.abc10013 = new int[10];
                    }
                    if (logoMyLogoActivity14.abc1009 == null) {
                        logoMyLogoActivity14.abc1009 = new int[10];
                    }
                    logoMyLogoActivity14.abc1003 = -logoMyLogoActivity14.abc1003;
                    logoMyLogoActivity14.abc10 = 0.7529397178018452d;
                    if (logoMyLogoActivity14.abc1005.size() < 8) {
                        LogoMyLogoActivity.this.abc1005.add("ry,");
                    }
                    ArrayList<Integer> arrayList2 = LogoMyLogoActivity.this.abc10016;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoMyLogoActivity.this.abc10016.remove(0);
                    }
                    if (LogoMyLogoActivity.this.abc10022 != null) {
                        int i5 = 0;
                        while (true) {
                            String[] strArr2 = LogoMyLogoActivity.this.abc10022;
                            if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i5] = "string" + i5;
                            i5++;
                        }
                    }
                    z = false;
                } else {
                    LogoMyLogoActivity logoMyLogoActivity15 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity15.abc10017 == null) {
                        logoMyLogoActivity15.abc10017 = new ArrayList<>();
                    }
                    LogoMyLogoActivity logoMyLogoActivity16 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity16.abc1008 == null) {
                        logoMyLogoActivity16.abc1008 = new ArrayList<>();
                    }
                    if (LogoMyLogoActivity.this.abc10018.size() > 6) {
                        LogoMyLogoActivity.this.abc10018.add(8);
                    }
                    LogoMyLogoActivity logoMyLogoActivity17 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity17.abc9 == null) {
                        logoMyLogoActivity17.abc9 = new ArrayList<>();
                        LogoMyLogoActivity logoMyLogoActivity18 = LogoMyLogoActivity.this;
                        logoMyLogoActivity18.abc10010 = 0.26906059141677774d;
                        if (logoMyLogoActivity18.abc10011.size() < 9) {
                            LogoMyLogoActivity.this.abc10011.add("lite");
                        }
                        LogoMyLogoActivity.this.abc10014 = true;
                    }
                    LogoMyLogoActivity logoMyLogoActivity19 = LogoMyLogoActivity.this;
                    logoMyLogoActivity19.abc1004 = false;
                    ArrayList<String> arrayList3 = logoMyLogoActivity19.abc1008;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        LogoMyLogoActivity.this.abc1008.remove(0);
                    }
                    LogoMyLogoActivity.this.abc10020 = !logoMyLogoActivity2.abc10020;
                    i4++;
                }
            }
            LogoMyLogoActivity logoMyLogoActivity20 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity20.abc10018 == null) {
                logoMyLogoActivity20.abc10018 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity21 = LogoMyLogoActivity.this;
            logoMyLogoActivity21.abc1000 = 0.1198049897300536d;
            boolean z3 = !logoMyLogoActivity21.abc10014;
            logoMyLogoActivity21.abc10014 = z3;
            logoMyLogoActivity21.abc3 = true;
            logoMyLogoActivity21.abc10014 = !z3;
            int[] iArr4 = logoMyLogoActivity21.abc10013;
            if (iArr4 != null) {
                iArr4[1] = 0;
            }
            logoMyLogoActivity21.abc10023 = "od";
            if (z) {
                return;
            }
            String[] strArr3 = logoMyLogoActivity21.abc10019;
            if (strArr3 != null) {
                strArr3[9] = null;
            }
            logoMyLogoActivity21.abc1000 = 0.7063472856459346d;
            if (logoMyLogoActivity21.abc10016 == null) {
                logoMyLogoActivity21.abc10016 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc11)) {
                int length3 = LogoMyLogoActivity.this.abc11.length();
                if (LogoMyLogoActivity.this.abc1006.size() < 9) {
                    LogoMyLogoActivity.this.abc1006.add(9);
                }
                LogoMyLogoActivity logoMyLogoActivity22 = LogoMyLogoActivity.this;
                String[] strArr4 = logoMyLogoActivity22.abc10019;
                if (strArr4 != null) {
                    strArr4[2] = " ";
                }
                logoMyLogoActivity22.abc1004 = !logoMyLogoActivity22.abc1004;
                logoMyLogoActivity22.abc11 = LogoMyLogoActivity.this.abc11 + length3;
                LogoMyLogoActivity logoMyLogoActivity23 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity23.abc1002 == null) {
                    logoMyLogoActivity23.abc1002 = new String[10];
                }
                ArrayList<Integer> arrayList4 = logoMyLogoActivity23.abc10017;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    LogoMyLogoActivity.this.abc10017.remove(0);
                }
                LogoMyLogoActivity.this.abc1004 = !logoMyLogoActivity.abc1004;
            }
            LogoMyLogoActivity logoMyLogoActivity24 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity24.abc10011 == null) {
                logoMyLogoActivity24.abc10011 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity25 = LogoMyLogoActivity.this;
            logoMyLogoActivity25.abc10015 = ((double) logoMyLogoActivity25.abc10015) < 0.1919471d ? 0.3146549f : 0.19133049f;
            if (logoMyLogoActivity25.abc10022 != null) {
                int i6 = 0;
                while (true) {
                    String[] strArr5 = LogoMyLogoActivity.this.abc10022;
                    if (i6 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i6] = "string" + i6;
                    i6++;
                }
            }
            if (LogoMyLogoActivity.this.logoConfirmDeleteDialog == null) {
                LogoMyLogoActivity.this.logoConfirmDeleteDialog = new LogoConfirmDeleteDialog(LogoMyLogoActivity.this);
                if (LogoMyLogoActivity.this.abc10017.size() > 0) {
                    LogoMyLogoActivity.this.abc10017.add(4);
                }
                LogoMyLogoActivity logoMyLogoActivity26 = LogoMyLogoActivity.this;
                int[] iArr5 = logoMyLogoActivity26.abc10013;
                if (iArr5 != null) {
                    iArr5[5] = 0;
                }
                logoMyLogoActivity26.abc1003 = 0.048615575f;
                if (logoMyLogoActivity26.abc1.size() > 5) {
                    LogoMyLogoActivity.this.abc1.add(2);
                    LogoMyLogoActivity logoMyLogoActivity27 = LogoMyLogoActivity.this;
                    String[] strArr6 = logoMyLogoActivity27.abc10022;
                    if (strArr6 != null) {
                        strArr6[2] = "the n";
                    }
                    str = "string";
                    float f = ((double) logoMyLogoActivity27.abc1003) > 0.11879814d ? 0.97821474f : 0.16124403f;
                    logoMyLogoActivity27.abc1003 = f;
                    logoMyLogoActivity27.abc1003 = -f;
                } else {
                    str = "string";
                }
                if (LogoMyLogoActivity.this.abc10013 != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr6 = LogoMyLogoActivity.this.abc10013;
                        if (i7 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                            break;
                        }
                        iArr6[i7] = 7;
                        i7++;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity28 = LogoMyLogoActivity.this;
                String[] strArr7 = logoMyLogoActivity28.abc1002;
                if (strArr7 != null) {
                    strArr7[4] = null;
                }
                String[] strArr8 = logoMyLogoActivity28.abc10019;
                if (strArr8 != null) {
                    strArr8[5] = null;
                }
            } else {
                str = "string";
            }
            if (LogoMyLogoActivity.this.abc1006.size() > 5) {
                LogoMyLogoActivity.this.abc1006.add(0);
            }
            if (LogoMyLogoActivity.this.abc1005.size() > 5) {
                LogoMyLogoActivity.this.abc1005.add("bly mo");
            }
            ArrayList<Integer> arrayList5 = LogoMyLogoActivity.this.abc10017;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoMyLogoActivity.this.abc10017.remove(0);
            }
            if (LogoMyLogoActivity.this.abc4.size() > 6) {
                LogoMyLogoActivity.this.abc4.add("6阅");
                LogoMyLogoActivity logoMyLogoActivity29 = LogoMyLogoActivity.this;
                logoMyLogoActivity29.abc1000 = logoMyLogoActivity29.abc1000 < 0.06854512628371179d ? 0.8382407657326046d : 0.9498071964034843d;
                if (logoMyLogoActivity29.abc1008.size() < 0) {
                    LogoMyLogoActivity.this.abc1008.add("iliar");
                }
                String[] strArr9 = LogoMyLogoActivity.this.abc10019;
                if (strArr9 != null) {
                    strArr9[7] = " a modern";
                }
            }
            if (LogoMyLogoActivity.this.abc10022 != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr10 = LogoMyLogoActivity.this.abc10022;
                    if (i8 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                        break;
                    }
                    strArr10[i8] = str + i8;
                    i8++;
                }
            }
            LogoMyLogoActivity logoMyLogoActivity30 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity30.abc10018 == null) {
                logoMyLogoActivity30.abc10018 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity31 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity31.abc10019 == null) {
                logoMyLogoActivity31.abc10019 = new String[10];
            }
            logoMyLogoActivity31.logoConfirmDeleteDialog.m9208c(R.string.confirm_delete_logo);
            LogoMyLogoActivity logoMyLogoActivity32 = LogoMyLogoActivity.this;
            String[] strArr11 = logoMyLogoActivity32.abc1002;
            if (strArr11 != null) {
                strArr11[1] = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
            }
            if (logoMyLogoActivity32.abc1008.size() < 0) {
                LogoMyLogoActivity.this.abc1008.add(" nove");
            }
            LogoMyLogoActivity logoMyLogoActivity33 = LogoMyLogoActivity.this;
            logoMyLogoActivity33.abc1007 = Math.abs(logoMyLogoActivity33.abc1007);
            LogoMyLogoActivity logoMyLogoActivity34 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity34.abc9 == null) {
                logoMyLogoActivity34.abc9 = new ArrayList<>();
                if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc10023)) {
                    int length4 = LogoMyLogoActivity.this.abc10023.length();
                    LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length4;
                }
                LogoMyLogoActivity logoMyLogoActivity35 = LogoMyLogoActivity.this;
                logoMyLogoActivity35.abc10014 = !logoMyLogoActivity35.abc10014;
                logoMyLogoActivity35.abc10012 = 8;
            }
            LogoMyLogoActivity logoMyLogoActivity36 = LogoMyLogoActivity.this;
            String[] strArr12 = logoMyLogoActivity36.abc1002;
            if (strArr12 != null) {
                strArr12[1] = null;
            }
            ArrayList<Integer> arrayList6 = logoMyLogoActivity36.abc10018;
            if (arrayList6 == null && arrayList6.size() > 0) {
                LogoMyLogoActivity.this.abc10018.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity37 = LogoMyLogoActivity.this;
            logoMyLogoActivity37.abc10012 = 9;
            logoMyLogoActivity37.logoConfirmDeleteDialog.setOnConfirmClickListener(new C9578a());
            LogoMyLogoActivity logoMyLogoActivity38 = LogoMyLogoActivity.this;
            String[] strArr13 = logoMyLogoActivity38.abc1002;
            if (strArr13 != null) {
                strArr13[4] = null;
            }
            logoMyLogoActivity38.abc1007 = 0.8524671f;
            ArrayList<String> arrayList7 = logoMyLogoActivity38.abc1008;
            if (arrayList7 != null && arrayList7.size() > 0) {
                LogoMyLogoActivity.this.abc1008.remove(0);
            }
            if (LogoMyLogoActivity.this.abc9.size() > 4) {
                LogoMyLogoActivity.this.abc9.add(7);
                ArrayList<String> arrayList8 = LogoMyLogoActivity.this.abc1005;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    LogoMyLogoActivity.this.abc1005.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity39 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity39.abc10022 == null) {
                    logoMyLogoActivity39.abc10022 = new String[10];
                }
                if (logoMyLogoActivity39.abc10022 == null) {
                    logoMyLogoActivity39.abc10022 = new String[10];
                }
            }
            ArrayList<Integer> arrayList9 = LogoMyLogoActivity.this.abc1006;
            if (arrayList9 == null && arrayList9.size() > 0) {
                LogoMyLogoActivity.this.abc1006.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity40 = LogoMyLogoActivity.this;
            logoMyLogoActivity40.abc1000 = logoMyLogoActivity40.abc1000 < 0.7060666071377044d ? 0.9111041615351728d : 0.6469442427993385d;
            logoMyLogoActivity40.abc1007 -= 0.7084408f;
            logoMyLogoActivity40.logoConfirmDeleteDialog.show();
            LogoMyLogoActivity logoMyLogoActivity41 = LogoMyLogoActivity.this;
            logoMyLogoActivity41.abc1001 = false;
            logoMyLogoActivity41.abc1001 = !false;
            logoMyLogoActivity41.abc10010 = 0.6002137924947449d;
            logoMyLogoActivity41.abc5 += 0.17477119f;
            if (logoMyLogoActivity41.abc1008 == null) {
                logoMyLogoActivity41.abc1008 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity42 = LogoMyLogoActivity.this;
            logoMyLogoActivity42.abc1001 = false;
            logoMyLogoActivity42.abc1007 = 0.28927898f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$g */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9579g implements View.OnClickListener {
        public View$OnClickListenerC9579g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyLogoActivity logoMyLogoActivity;
            LogoMyLogoActivity logoMyLogoActivity2;
            LogoMyLogoActivity.this.adapter.setShowCheckedBox(true);
            ArrayList<Integer> arrayList = LogoMyLogoActivity.this.abc10017;
            int i = 0;
            if (arrayList == null && arrayList.size() > 0) {
                LogoMyLogoActivity.this.abc10017.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity3.abc10015 > 0.58576363d) {
                logoMyLogoActivity3.abc10015 = 0.9398283f;
            }
            logoMyLogoActivity3.abc10012 = 2;
            logoMyLogoActivity3.abc0 = 0.7540733332770937d;
            if (logoMyLogoActivity3.abc10016.size() < 4) {
                LogoMyLogoActivity.this.abc10016.add(7);
            }
            LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity4.abc10017 == null) {
                logoMyLogoActivity4.abc10017 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity5.abc10011 == null) {
                logoMyLogoActivity5.abc10011 = new ArrayList<>();
            }
            LogoMyLogoActivity.this.adapter.notifyDataSetChanged();
            LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
            int[] iArr = logoMyLogoActivity6.abc10013;
            if (iArr != null) {
                iArr[1] = 3;
            }
            String[] strArr = logoMyLogoActivity6.abc10022;
            if (strArr != null) {
                strArr[6] = "d what ";
            }
            ArrayList<String> arrayList2 = logoMyLogoActivity6.abc10011;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoMyLogoActivity.this.abc10011.remove(0);
            }
            ArrayList<Integer> arrayList3 = LogoMyLogoActivity.this.abc9;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoMyLogoActivity.this.abc9.remove(0);
                LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
                logoMyLogoActivity7.abc10021 = 0.4156993337569085d;
                logoMyLogoActivity7.abc10012 = 5;
                if (logoMyLogoActivity7.abc10016 == null) {
                    logoMyLogoActivity7.abc10016 = new ArrayList<>();
                }
            }
            if (LogoMyLogoActivity.this.abc10017.size() < 4) {
                LogoMyLogoActivity.this.abc10017.add(1);
            }
            LogoMyLogoActivity logoMyLogoActivity8 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity8.abc1000 < 0.05450084111929843d) {
                logoMyLogoActivity8.abc1000 = 0.8685633286396974d;
            }
            logoMyLogoActivity8.abc10020 = true;
            logoMyLogoActivity8.binding.rlSelectItem.setVisibility(8);
            if (LogoMyLogoActivity.this.abc10011.size() > 5) {
                LogoMyLogoActivity.this.abc10011.add("l. Melvi");
            }
            LogoMyLogoActivity logoMyLogoActivity9 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity9.abc10017 == null) {
                logoMyLogoActivity9.abc10017 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity10 = LogoMyLogoActivity.this;
            logoMyLogoActivity10.abc1004 = false;
            if (logoMyLogoActivity10.abc10 > 0.5377221506495301d) {
                logoMyLogoActivity10.abc10 = 0.7267312016490665d;
                if (logoMyLogoActivity10.abc1005 == null) {
                    logoMyLogoActivity10.abc1005 = new ArrayList<>();
                }
                if (LogoMyLogoActivity.this.abc1002 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr2 = LogoMyLogoActivity.this.abc1002;
                        if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i2] = "string" + i2;
                        i2++;
                    }
                }
                LogoMyLogoActivity.this.abc10014 = false;
            }
            LogoMyLogoActivity logoMyLogoActivity11 = LogoMyLogoActivity.this;
            logoMyLogoActivity11.abc1001 = false;
            logoMyLogoActivity11.abc1003 = -logoMyLogoActivity11.abc1003;
            int i3 = 0;
            while (true) {
                logoMyLogoActivity = LogoMyLogoActivity.this;
                int i4 = logoMyLogoActivity.abc10012;
                if (i3 >= (i4 > 3 ? 3 : i4)) {
                    break;
                }
                if (i4 > 0) {
                    logoMyLogoActivity.abc10012 = 7;
                }
                i3++;
            }
            logoMyLogoActivity.binding.rlDelete.setVisibility(0);
            int i5 = 0;
            while (true) {
                logoMyLogoActivity2 = LogoMyLogoActivity.this;
                int i6 = logoMyLogoActivity2.abc10012;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                logoMyLogoActivity2.abc10012 = 2;
                i5++;
            }
            int[] iArr2 = logoMyLogoActivity2.abc1009;
            if (iArr2 != null) {
                iArr2[7] = 8;
            }
            logoMyLogoActivity2.abc10020 = true;
            if (logoMyLogoActivity2.abc4.size() > 0) {
                LogoMyLogoActivity.this.abc4.add("()进行重绘(4)");
                LogoMyLogoActivity logoMyLogoActivity12 = LogoMyLogoActivity.this;
                logoMyLogoActivity12.abc10023 = "l that ";
                if (logoMyLogoActivity12.abc1008 == null) {
                    logoMyLogoActivity12.abc1008 = new ArrayList<>();
                }
                LogoMyLogoActivity.this.abc1000 = 0.6547935647401956d;
            }
            ArrayList<Integer> arrayList4 = LogoMyLogoActivity.this.abc10018;
            if (arrayList4 == null && arrayList4.size() > 0) {
                LogoMyLogoActivity.this.abc10018.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity13 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity13.abc1009 == null) {
                logoMyLogoActivity13.abc1009 = new int[10];
            }
            String[] strArr3 = logoMyLogoActivity13.abc1002;
            if (strArr3 != null) {
                strArr3[2] = null;
            }
            logoMyLogoActivity13.binding.rlSelectAll.setVisibility(0);
            LogoMyLogoActivity logoMyLogoActivity14 = LogoMyLogoActivity.this;
            logoMyLogoActivity14.abc10014 = true;
            if (logoMyLogoActivity14.abc1005.size() < 8) {
                LogoMyLogoActivity.this.abc1005.add("n, basis,");
            }
            if (LogoMyLogoActivity.this.abc10013 != null) {
                while (true) {
                    int[] iArr3 = LogoMyLogoActivity.this.abc10013;
                    if (i >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i] = 6;
                    i++;
                }
            }
            LogoMyLogoActivity logoMyLogoActivity15 = LogoMyLogoActivity.this;
            logoMyLogoActivity15.abc2 = "4cente";
            logoMyLogoActivity15.abc1007 = 0.038706005f;
            logoMyLogoActivity15.abc10010 = 0.7557342816318832d;
            logoMyLogoActivity15.abc10014 = true ^ logoMyLogoActivity15.abc10014;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoMyLogoActivity$h */
    /* loaded from: classes3.dex */
    public class C9580h implements LogoConfirmDeleteDialog.InterfaceC9598c {

        /* renamed from: a */
        public final /* synthetic */ LogoMyLogoEntity f15812a;

        /* renamed from: b */
        public final /* synthetic */ int f15813b;

        public C9580h(LogoMyLogoEntity logoMyLogoEntity, int i) {
            this.f15812a = logoMyLogoEntity;
            this.f15813b = i;
        }

        @Override // com.logomaster.logomaker.LogoConfirmDeleteDialog.InterfaceC9598c
        /* renamed from: a */
        public void mo9207a() {
            if (LogoMyLogoActivity.this.logoShowBigImageDialog != null) {
                LogoMyLogoActivity.this.logoShowBigImageDialog.dismiss();
                LogoMyLogoActivity logoMyLogoActivity = LogoMyLogoActivity.this;
                logoMyLogoActivity.abc10012 *= 1;
                logoMyLogoActivity.abc10020 = false;
                logoMyLogoActivity.abc1000 -= 0.5307674408257776d;
                ArrayList<Integer> arrayList = logoMyLogoActivity.abc9;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMyLogoActivity.this.abc9.remove(0);
                    if (LogoMyLogoActivity.this.abc10011.size() < 4) {
                        LogoMyLogoActivity.this.abc10011.add("t i");
                    }
                    LogoMyLogoActivity logoMyLogoActivity2 = LogoMyLogoActivity.this;
                    logoMyLogoActivity2.abc1004 = false;
                    logoMyLogoActivity2.abc10023 = "ve ";
                }
                LogoMyLogoActivity logoMyLogoActivity3 = LogoMyLogoActivity.this;
                logoMyLogoActivity3.abc10020 = true;
                logoMyLogoActivity3.abc1001 = !logoMyLogoActivity3.abc1001;
                logoMyLogoActivity3.abc10014 = !logoMyLogoActivity3.abc10014;
            }
            LogoMyLogoActivity logoMyLogoActivity4 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity4.abc10012 < 0) {
                logoMyLogoActivity4.abc10012 = 6;
            }
            if (logoMyLogoActivity4.abc1008 == null) {
                logoMyLogoActivity4.abc1008 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity5 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity5.abc1008 == null) {
                logoMyLogoActivity5.abc1008 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity6 = LogoMyLogoActivity.this;
            logoMyLogoActivity6.abc5 = 0.7154901f;
            logoMyLogoActivity6.abc10020 = !logoMyLogoActivity6.abc10020;
            logoMyLogoActivity6.abc10021 = logoMyLogoActivity6.abc10021 > 0.7474749458602572d ? 0.4179742488940369d : 0.07175643613892102d;
            String[] strArr = logoMyLogoActivity6.abc10019;
            if (strArr != null) {
                strArr[0] = "iment is ";
            }
            this.f15812a.m2188a().delete();
            LogoMyLogoActivity logoMyLogoActivity7 = LogoMyLogoActivity.this;
            logoMyLogoActivity7.abc10023 = " bef";
            if (logoMyLogoActivity7.abc10019 == null) {
                logoMyLogoActivity7.abc10019 = new String[10];
            }
            logoMyLogoActivity7.abc10015 += 0.68442124f;
            logoMyLogoActivity7.abc5 = ((double) logoMyLogoActivity7.abc5) < 0.9464924d ? 0.8045432f : 0.14497417f;
            if (logoMyLogoActivity7.abc10022 == null) {
                logoMyLogoActivity7.abc10022 = new String[10];
            }
            if (logoMyLogoActivity7.abc10011 == null) {
                logoMyLogoActivity7.abc10011 = new ArrayList<>();
            }
            LogoMyLogoActivity logoMyLogoActivity8 = LogoMyLogoActivity.this;
            logoMyLogoActivity8.abc10012 = -logoMyLogoActivity8.abc10012;
            logoMyLogoActivity8.adapter.remove(this.f15813b);
            ArrayList<String> arrayList2 = LogoMyLogoActivity.this.abc1005;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoMyLogoActivity.this.abc1005.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity9 = LogoMyLogoActivity.this;
            if (logoMyLogoActivity9.abc10016 == null) {
                logoMyLogoActivity9.abc10016 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(LogoMyLogoActivity.this.abc10023)) {
                int length = LogoMyLogoActivity.this.abc10023.length();
                LogoMyLogoActivity.this.abc10023 = LogoMyLogoActivity.this.abc10023 + length;
            }
            ArrayList<String> arrayList3 = LogoMyLogoActivity.this.abc4;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoMyLogoActivity.this.abc4.remove(0);
                if (LogoMyLogoActivity.this.abc1008.size() < 1) {
                    LogoMyLogoActivity.this.abc1008.add("e that ");
                }
                LogoMyLogoActivity logoMyLogoActivity10 = LogoMyLogoActivity.this;
                String[] strArr2 = logoMyLogoActivity10.abc10019;
                if (strArr2 != null) {
                    strArr2[9] = InneractiveMediationDefs.GENDER_MALE;
                }
                logoMyLogoActivity10.abc1001 = !logoMyLogoActivity10.abc1001;
            }
            LogoMyLogoActivity logoMyLogoActivity11 = LogoMyLogoActivity.this;
            String[] strArr3 = logoMyLogoActivity11.abc10022;
            if (strArr3 != null) {
                strArr3[8] = "modern no";
            }
            if (logoMyLogoActivity11.abc1000 > 0.5614971263183787d) {
                logoMyLogoActivity11.abc1000 = 0.6270327588903521d;
            }
            logoMyLogoActivity11.abc1003 = ((double) logoMyLogoActivity11.abc1003) > 0.14617014d ? 0.6896351f : 0.057533383f;
            if (logoMyLogoActivity11.adapter.getList().size() > 0) {
                LogoMyLogoActivity.this.binding.ivNoData.setVisibility(8);
                LogoMyLogoActivity logoMyLogoActivity12 = LogoMyLogoActivity.this;
                String[] strArr4 = logoMyLogoActivity12.abc10022;
                if (strArr4 != null) {
                    strArr4[5] = null;
                }
                if (logoMyLogoActivity12.abc1009 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr = LogoMyLogoActivity.this.abc1009;
                        if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i] = 8;
                        i++;
                    }
                }
                if (LogoMyLogoActivity.this.abc10019 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr5 = LogoMyLogoActivity.this.abc10019;
                        if (i2 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                            break;
                        }
                        strArr5[i2] = "string" + i2;
                        i2++;
                    }
                }
                if (LogoMyLogoActivity.this.abc7.size() > 6) {
                    LogoMyLogoActivity.this.abc7.add("...世界");
                    LogoMyLogoActivity logoMyLogoActivity13 = LogoMyLogoActivity.this;
                    if (logoMyLogoActivity13.abc10016 == null) {
                        logoMyLogoActivity13.abc10016 = new ArrayList<>();
                    }
                    ArrayList<Integer> arrayList4 = LogoMyLogoActivity.this.abc10016;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        LogoMyLogoActivity.this.abc10016.remove(0);
                    }
                    String[] strArr6 = LogoMyLogoActivity.this.abc10019;
                    if (strArr6 != null) {
                        strArr6[9] = null;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity14 = LogoMyLogoActivity.this;
                int[] iArr2 = logoMyLogoActivity14.abc1009;
                if (iArr2 != null) {
                    iArr2[8] = 0;
                }
                ArrayList<Integer> arrayList5 = logoMyLogoActivity14.abc1006;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    LogoMyLogoActivity.this.abc1006.remove(0);
                }
                String[] strArr7 = LogoMyLogoActivity.this.abc10022;
                if (strArr7 != null) {
                    strArr7[1] = "ys d";
                }
            } else {
                LogoMyLogoActivity.this.binding.ivNoData.setVisibility(0);
                LogoMyLogoActivity logoMyLogoActivity15 = LogoMyLogoActivity.this;
                logoMyLogoActivity15.abc1007 = Math.abs(logoMyLogoActivity15.abc1007);
                LogoMyLogoActivity logoMyLogoActivity16 = LogoMyLogoActivity.this;
                logoMyLogoActivity16.abc1001 = true;
                ArrayList<Integer> arrayList6 = logoMyLogoActivity16.abc1006;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoMyLogoActivity.this.abc1006.remove(0);
                }
                LogoMyLogoActivity logoMyLogoActivity17 = LogoMyLogoActivity.this;
                logoMyLogoActivity17.abc3 = !logoMyLogoActivity17.abc3;
                logoMyLogoActivity17.abc10020 = !logoMyLogoActivity17.abc10020;
                logoMyLogoActivity17.abc10020 = true;
                logoMyLogoActivity17.abc10023 = "ll, dull.";
            }
            LogoMyLogoActivity logoMyLogoActivity18 = LogoMyLogoActivity.this;
            int[] iArr3 = logoMyLogoActivity18.abc1009;
            if (iArr3 != null) {
                iArr3[6] = 1;
            }
            if (logoMyLogoActivity18.abc1000 < 0.6052062741053157d) {
                logoMyLogoActivity18.abc1000 = 0.04941217216281224d;
            }
            ArrayList<Integer> arrayList7 = logoMyLogoActivity18.abc10018;
            if (arrayList7 == null && arrayList7.size() > 0) {
                LogoMyLogoActivity.this.abc10018.remove(0);
            }
            ArrayList<Integer> arrayList8 = LogoMyLogoActivity.this.abc9;
            if (arrayList8 == null && arrayList8.size() > 0) {
                LogoMyLogoActivity.this.abc9.remove(0);
                LogoMyLogoActivity logoMyLogoActivity19 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity19.abc10016 == null) {
                    logoMyLogoActivity19.abc10016 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity20 = LogoMyLogoActivity.this;
                logoMyLogoActivity20.abc10020 = false;
                if (logoMyLogoActivity20.abc10021 > 0.8058045811477973d) {
                    logoMyLogoActivity20.abc10021 = 0.19332740589339148d;
                }
            }
            ArrayList<String> arrayList9 = LogoMyLogoActivity.this.abc1005;
            if (arrayList9 != null && arrayList9.size() > 0) {
                LogoMyLogoActivity.this.abc1005.remove(0);
            }
            ArrayList<String> arrayList10 = LogoMyLogoActivity.this.abc1008;
            if (arrayList10 != null && arrayList10.size() > 0) {
                LogoMyLogoActivity.this.abc1008.remove(0);
            }
            LogoMyLogoActivity logoMyLogoActivity21 = LogoMyLogoActivity.this;
            logoMyLogoActivity21.abc10012 = 7;
            if (logoMyLogoActivity21.adapter.getList().size() == 0) {
                LogoMyLogoActivity.this.isSelectAll = false;
                LogoMyLogoActivity logoMyLogoActivity22 = LogoMyLogoActivity.this;
                int[] iArr4 = logoMyLogoActivity22.abc10013;
                if (iArr4 != null) {
                    iArr4[1] = 0;
                }
                logoMyLogoActivity22.abc10010 -= 0.37633430080521335d;
                if (logoMyLogoActivity22.abc10018 == null) {
                    logoMyLogoActivity22.abc10018 = new ArrayList<>();
                }
                LogoMyLogoActivity.this.adapter.setShowCheckedBox(false);
                LogoMyLogoActivity logoMyLogoActivity23 = LogoMyLogoActivity.this;
                logoMyLogoActivity23.abc10010 += 0.31117653338233486d;
                logoMyLogoActivity23.abc1001 = true;
                ArrayList<String> arrayList11 = logoMyLogoActivity23.abc1005;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    LogoMyLogoActivity.this.abc1005.remove(0);
                }
                LogoMyLogoActivity.this.binding.rlSelectItem.setVisibility(0);
                if (LogoMyLogoActivity.this.abc1002 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr8 = LogoMyLogoActivity.this.abc1002;
                        if (i3 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i3] = "string" + i3;
                        i3++;
                    }
                }
                LogoMyLogoActivity logoMyLogoActivity24 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity24.abc10011 == null) {
                    logoMyLogoActivity24.abc10011 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity25 = LogoMyLogoActivity.this;
                int[] iArr5 = logoMyLogoActivity25.abc1009;
                if (iArr5 != null) {
                    iArr5[3] = 0;
                }
                logoMyLogoActivity25.binding.rlDelete.setVisibility(8);
                LogoMyLogoActivity logoMyLogoActivity26 = LogoMyLogoActivity.this;
                if (logoMyLogoActivity26.abc1003 > 0.13977844d) {
                    logoMyLogoActivity26.abc1003 = 0.5025193f;
                }
                if (logoMyLogoActivity26.abc1008 == null) {
                    logoMyLogoActivity26.abc1008 = new ArrayList<>();
                }
                LogoMyLogoActivity logoMyLogoActivity27 = LogoMyLogoActivity.this;
                logoMyLogoActivity27.abc10023 = "to re";
                logoMyLogoActivity27.binding.rlSelectAll.setVisibility(8);
                LogoMyLogoActivity logoMyLogoActivity28 = LogoMyLogoActivity.this;
                logoMyLogoActivity28.abc1004 = true;
                ArrayList<String> arrayList12 = logoMyLogoActivity28.abc1005;
                if (arrayList12 != null && arrayList12.size() > 0) {
                    LogoMyLogoActivity.this.abc1005.remove(0);
                }
                LogoMyLogoActivity.this.abc10020 = true;
            }
            if (LogoMyLogoActivity.this.abc10016.size() < 7) {
                LogoMyLogoActivity.this.abc10016.add(3);
            }
            LogoMyLogoActivity logoMyLogoActivity29 = LogoMyLogoActivity.this;
            logoMyLogoActivity29.abc10012 = -logoMyLogoActivity29.abc10012;
            logoMyLogoActivity29.abc10010 = logoMyLogoActivity29.abc10010 > 0.14051442574424178d ? 0.8320610451370556d : 0.7360548226096726d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkedState(List<LogoMyLogoEntity> list) {
        int i;
        String str;
        boolean z;
        int size = list.size();
        this.abc10023 = "o";
        int[] iArr = this.abc1009;
        boolean z2 = true;
        if (iArr != null) {
            iArr[1] = 0;
        }
        int i2 = 10;
        if (this.abc10022 == null) {
            this.abc10022 = new String[10];
        }
        this.abc5 = 0.40922546f;
        if (this.abc10010 > 0.688958201032598d) {
            this.abc10010 = 0.24029553219799937d;
        }
        int i3 = 5;
        if (this.abc10016.size() > 5) {
            this.abc10016.add(0);
        }
        ArrayList<String> arrayList = this.abc1005;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1005.remove(0);
        }
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        this.abc1000 -= 0.1447074944092328d;
        ArrayList<Integer> arrayList2 = this.abc10017;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc10017.remove(0);
        }
        String str2 = "d";
        if (this.abc1 == null) {
            this.abc1 = new ArrayList<>();
            if (this.abc1008.size() < 1) {
                this.abc1008.add("d");
            }
            this.abc1000 = -this.abc1000;
            if (this.abc10016 == null) {
                this.abc10016 = new ArrayList<>();
            }
        }
        if (this.abc1009 == null) {
            this.abc1009 = new int[10];
        }
        if (this.abc10019 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr = this.abc10019;
                if (i4 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i4] = "string" + i4;
                i4++;
            }
        }
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        this.isSelectAll = true;
        ArrayList<Integer> arrayList3 = this.abc10017;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc10017.remove(0);
        }
        this.abc1004 = !this.abc1004;
        if (this.abc10017 == null) {
            this.abc10017 = new ArrayList<>();
        }
        this.abc2 = "个要加";
        this.abc1001 = false;
        String[] strArr2 = this.abc10022;
        char c = 4;
        String str3 = null;
        if (strArr2 != null) {
            strArr2[4] = null;
        }
        int[] iArr2 = this.abc1009;
        if (iArr2 != null) {
            iArr2[0] = 0;
        }
        int i5 = 0;
        boolean z3 = false;
        while (i5 < size) {
            if (list.get(i5).m2187b()) {
                if (!z3) {
                    String[] strArr3 = this.abc10022;
                    if (strArr3 != null) {
                        strArr3[c] = "inspiratio";
                    }
                    String[] strArr4 = this.abc10019;
                    if (strArr4 != null) {
                        strArr4[7] = "tion, ba";
                    }
                    this.abc1003 = -this.abc1003;
                    this.abc5 = -this.abc5;
                    this.abc10020 ^= z2;
                    this.abc10012 = this.abc10012 > 7 ? 7 : 6;
                    if (strArr3 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr5 = this.abc10022;
                            if (i6 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                                break;
                            }
                            strArr5[i6] = "string" + i6;
                            i6++;
                        }
                    }
                    z3 = true;
                }
                if (this.abc10013 == null) {
                    this.abc10013 = new int[i2];
                }
                String[] strArr6 = this.abc10022;
                if (strArr6 != null) {
                    strArr6[6] = "re f";
                }
                if (this.abc10019 != null) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr7 = this.abc10019;
                        if (i7 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                            break;
                        }
                        strArr7[i7] = "string" + i7;
                        i7++;
                    }
                }
                this.abc6 = 0.38569248f;
                this.abc1003 = 0.122942865f;
                String[] strArr8 = this.abc10019;
                if (strArr8 != null) {
                    strArr8[6] = str3;
                }
                if (this.abc10016.size() > 0) {
                    this.abc10016.add(7);
                }
                str = str2;
            } else {
                if (this.isSelectAll) {
                    this.isSelectAll = false;
                    ArrayList<Integer> arrayList4 = this.abc10017;
                    if (arrayList4 == null && arrayList4.size() > 0) {
                        this.abc10017.remove(0);
                    }
                    if (this.abc1006.size() < i3) {
                        this.abc1006.add(9);
                    }
                    int[] iArr3 = this.abc1009;
                    if (iArr3 != null) {
                        iArr3[4] = 6;
                    }
                    str = str2;
                    this.abc10 = 0.6012430562393597d;
                    if (this.abc10017 == null) {
                        this.abc10017 = new ArrayList<>();
                    }
                    if (this.abc1002 == null) {
                        this.abc1002 = new String[10];
                    }
                    int[] iArr4 = this.abc1009;
                    if (iArr4 != null) {
                        iArr4[3] = 8;
                    }
                } else {
                    str = str2;
                }
                if (this.abc1009 != null) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr5 = this.abc1009;
                        if (i8 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i8] = 2;
                        i8++;
                    }
                }
                this.abc10014 = false;
                if (this.abc10011.size() > 7) {
                    this.abc10011.add("d of a l");
                }
                this.abc10 = 0.5758664779213442d;
                if (this.abc10016 == null) {
                    this.abc10016 = new ArrayList<>();
                }
                String[] strArr9 = this.abc10022;
                if (strArr9 != null) {
                    strArr9[2] = str3;
                }
                this.abc1004 = true;
            }
            ArrayList<Integer> arrayList5 = this.abc10018;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc10018.remove(0);
            }
            this.abc1004 = !this.abc1004;
            if (this.abc1008 == null) {
                this.abc1008 = new ArrayList<>();
            }
            if (TextUtils.isEmpty(this.abc11)) {
                z = z3;
            } else {
                int length = this.abc11.length();
                z = z3;
                this.abc1000 = -this.abc1000;
                ArrayList<String> arrayList6 = this.abc10011;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    this.abc10011.remove(0);
                }
                this.abc10021 = 0.6412925960393442d;
                this.abc11 += length;
                if (this.abc10016.size() < 8) {
                    this.abc10016.add(9);
                }
                this.abc1000 -= 0.20452740313551732d;
                if (this.abc10022 != null) {
                    int i9 = 0;
                    while (true) {
                        String[] strArr10 = this.abc10022;
                        if (i9 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                            break;
                        }
                        strArr10[i9] = "string" + i9;
                        i9++;
                    }
                }
            }
            if (this.abc10017 == null) {
                this.abc10017 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList7 = this.abc10017;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.abc10017.remove(0);
            }
            this.abc10015 = 0.44184506f;
            i5++;
            str2 = str;
            z3 = z;
            z2 = true;
            i2 = 10;
            i3 = 5;
            c = 4;
            str3 = null;
        }
        String str4 = str2;
        int[] iArr6 = this.abc1009;
        if (iArr6 != null) {
            iArr6[8] = 0;
        }
        if (this.abc10022 == null) {
            this.abc10022 = new String[10];
        }
        String[] strArr11 = this.abc10019;
        if (strArr11 != null) {
            strArr11[0] = null;
        }
        if (this.abc1.size() > 0) {
            this.abc1.add(1);
            this.abc1004 = !this.abc1004;
            if (this.abc1009 != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr7 = this.abc1009;
                    if (i10 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                        break;
                    }
                    iArr7[i10] = 7;
                    i10++;
                }
            }
            if (this.abc10017 == null) {
                this.abc10017 = new ArrayList<>();
            }
        }
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        this.abc1007 = Math.abs(this.abc1007);
        String[] strArr12 = this.abc10022;
        if (strArr12 != null) {
            strArr12[2] = null;
        }
        if (z3) {
            this.binding.ivDelete.setImageResource(R.mipmap.all_delete);
            String[] strArr13 = this.abc10019;
            if (strArr13 != null) {
                strArr13[2] = null;
            }
            this.abc10020 = !this.abc10020;
            this.abc10023 = str4;
            if (this.abc4 == null) {
                this.abc4 = new ArrayList<>();
                int[] iArr8 = this.abc1009;
                if (iArr8 != null) {
                    iArr8[2] = 0;
                }
                this.abc10015 = Math.abs(this.abc10015);
                this.abc10012 = 7;
            }
            this.abc10023 = "befo";
            this.abc1001 = !this.abc1001;
            int[] iArr9 = this.abc10013;
            if (iArr9 != null) {
                iArr9[1] = 0;
            }
        } else {
            this.binding.ivDelete.setImageResource(R.mipmap.all_delete2);
            if (this.abc1006.size() < 2) {
                this.abc1006.add(0);
            }
            if (this.abc1008 == null) {
                this.abc1008 = new ArrayList<>();
            }
            this.abc10014 = !this.abc10014;
            ArrayList<String> arrayList8 = this.abc7;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.abc7.remove(0);
                ArrayList<String> arrayList9 = this.abc1008;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    this.abc1008.remove(0);
                }
                if (this.abc10016 == null) {
                    this.abc10016 = new ArrayList<>();
                }
                this.abc10021 = 0.03138012108520749d;
            }
            this.abc10012 = 2;
            if (!TextUtils.isEmpty(this.abc10023)) {
                this.abc10023 += this.abc10023.length();
            }
            if (this.abc1006.size() > 3) {
                this.abc1006.add(5);
            }
        }
        this.abc1000 = this.abc1000 < 0.7654670722906954d ? 0.17249065208597913d : 0.8451070546234973d;
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        if (this.abc1009 != null) {
            int i11 = 0;
            while (true) {
                int[] iArr10 = this.abc1009;
                if (i11 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                    break;
                }
                iArr10[i11] = 2;
                i11++;
            }
        }
        this.abc11 = "了情深见于微推荐阅";
        this.abc10012 = Math.abs(this.abc10012);
        if (this.abc10019 != null) {
            int i12 = 0;
            while (true) {
                String[] strArr14 = this.abc10019;
                if (i12 >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                    break;
                }
                strArr14[i12] = "string" + i12;
                i12++;
            }
        }
        if (this.abc1009 != null) {
            int i13 = 0;
            while (true) {
                int[] iArr11 = this.abc1009;
                if (i13 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                    break;
                }
                iArr11[i13] = 7;
                i13++;
            }
        }
        if (this.isSelectAll) {
            this.binding.ivSelect.setImageResource(R.mipmap.selectall);
            this.abc1004 = !this.abc1004;
            this.abc10023 = "y u";
            int[] iArr12 = this.abc10013;
            if (iArr12 != null) {
                iArr12[4] = 7;
            }
            this.abc0 += 0.327351928690623d;
            if (this.abc10022 != null) {
                int i14 = 0;
                while (true) {
                    String[] strArr15 = this.abc10022;
                    if (i14 >= (strArr15.length > 3 ? 3 : strArr15.length)) {
                        break;
                    }
                    strArr15[i14] = "string" + i14;
                    i14++;
                }
            }
            ArrayList<String> arrayList10 = this.abc1005;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.abc1005.remove(0);
            }
            if (this.abc10011.size() > 7) {
                this.abc10011.add(" Stone");
            }
        } else {
            this.binding.ivSelect.setImageResource(R.mipmap.unselectall);
            if (this.abc10016 == null) {
                this.abc10016 = new ArrayList<>();
            }
            this.abc10023 = " Prejudice";
            int[] iArr13 = this.abc10013;
            if (iArr13 != null) {
                iArr13[7] = 0;
            }
            this.abc0 = 0.25718688807185874d;
            if (this.abc1006 == null) {
                this.abc1006 = new ArrayList<>();
            }
            this.abc1000 = 0.8133118298815661d;
            this.abc1007 = 0.65180856f;
        }
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        ArrayList<Integer> arrayList11 = this.abc10016;
        if (arrayList11 == null && arrayList11.size() > 0) {
            this.abc10016.remove(0);
        }
        this.abc10010 = 0.25168146547286985d;
        if (this.abc1.size() < 9) {
            this.abc1.add(3);
            if (this.abc10016 == null) {
                this.abc10016 = new ArrayList<>();
            }
            i = 1;
            this.abc10014 = !this.abc10014;
            this.abc10010 = -this.abc10010;
        } else {
            i = 1;
        }
        if (this.abc10011.size() < i) {
            this.abc10011.add(ReportUtil.f18058a);
        }
        if (this.abc10022 == null) {
            this.abc10022 = new String[10];
        }
        this.abc10015 = ((double) this.abc10015) > 0.62224525d ? 0.25661528f : 0.07797009f;
    }

    public void delete(int i, LogoMyLogoEntity logoMyLogoEntity) {
        if (this.logoConfirmDeleteDialog == null) {
            this.logoConfirmDeleteDialog = new LogoConfirmDeleteDialog(this);
            ArrayList<String> arrayList = this.abc1008;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1008.remove(0);
            }
            this.abc10014 = !this.abc10014;
            ArrayList<String> arrayList2 = this.abc1005;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1005.remove(0);
            }
            this.abc0 += 0.0818173036503046d;
            String[] strArr = this.abc10019;
            if (strArr != null) {
                strArr[4] = null;
            }
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            if (this.abc10021 < 0.28193648149964223d) {
                this.abc10021 = 0.7538388884864987d;
            }
        }
        this.abc10020 = !this.abc10020;
        int[] iArr = this.abc1009;
        if (iArr != null) {
            iArr[1] = 0;
        }
        if (this.abc10017.size() > 8) {
            this.abc10017.add(7);
        }
        if (!TextUtils.isEmpty(this.abc11)) {
            int length = this.abc11.length();
            this.abc10012 = this.abc10012 > 6 ? 0 : 4;
            if (this.abc10017 == null) {
                this.abc10017 = new ArrayList<>();
            }
            if (this.abc10013 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.abc10013;
                    if (i2 >= (iArr2.length <= 3 ? iArr2.length : 3)) {
                        break;
                    }
                    iArr2[i2] = 7;
                    i2++;
                }
            }
            this.abc11 += length;
            this.abc1004 = !this.abc1004;
            this.abc10015 -= 0.15422654f;
            if (!TextUtils.isEmpty(this.abc10023)) {
                this.abc10023 += this.abc10023.length();
            }
        }
        this.abc10015 += 0.068763256f;
        this.abc10012 = 8;
        this.abc1007 = -this.abc1007;
        this.logoConfirmDeleteDialog.m9208c(R.string.confirm_delete_logo);
        if (this.abc10018 == null) {
            this.abc10018 = new ArrayList<>();
        }
        if (this.abc1009 == null) {
            this.abc1009 = new int[10];
        }
        this.abc1000 = Math.abs(this.abc1000);
        this.abc3 = false;
        if (this.abc10018.size() > 7) {
            this.abc10018.add(4);
        }
        if (this.abc1008.size() < 8) {
            this.abc1008.add("ation (it ");
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        this.logoConfirmDeleteDialog.setOnConfirmClickListener(new C9580h(logoMyLogoEntity, i));
        if (this.abc10012 < 0) {
            this.abc10012 = 1;
        }
        this.abc10014 = !this.abc10014;
        this.abc1000 -= 0.6673906325093961d;
        this.abc3 = false;
        int[] iArr3 = this.abc10013;
        if (iArr3 != null) {
            iArr3[2] = 4;
        }
        this.abc10014 = true;
        this.abc1001 = true;
        this.logoConfirmDeleteDialog.show();
        ArrayList<String> arrayList3 = this.abc1008;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc1008.remove(0);
        }
        String[] strArr2 = this.abc10022;
        if (strArr2 != null) {
            strArr2[7] = null;
        }
        this.abc1003 *= 0.70508957f;
        this.abc8 = true;
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        ArrayList<String> arrayList4 = this.abc1008;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1008.remove(0);
        }
        this.abc1001 = true;
    }

    public int getStatusBarHeight() {
        int i;
        if (this.abc10013 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.abc10013;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 0;
                i2++;
            }
        }
        ArrayList<String> arrayList = this.abc1005;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1005.remove(0);
        }
        this.abc10010 += 0.48053279629545276d;
        this.abc0 = -this.abc0;
        this.abc10020 = !this.abc10020;
        this.abc10014 = !this.abc10014;
        if (this.abc10021 > 0.983754519710777d) {
            this.abc10021 = 0.028234326377240992d;
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        this.abc1003 = 0.3941645f;
        if (this.abc1006.size() < 0) {
            this.abc1006.add(5);
        }
        ArrayList<String> arrayList2 = this.abc10011;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc10011.remove(0);
        }
        this.abc11 = "效果）蒙层库-S";
        this.abc10014 = true;
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        this.abc10020 = true;
        if (identifier > 0) {
            i = getResources().getDimensionPixelSize(identifier);
            if (this.abc1006.size() < 3) {
                this.abc1006.add(1);
            }
            this.abc1007 = 0.2655654f;
            if (this.abc7 == null) {
                this.abc7 = new ArrayList<>();
                this.abc1003 *= 0.10893786f;
                this.abc1001 = true;
                if (this.abc10011 == null) {
                    this.abc10011 = new ArrayList<>();
                }
            }
            this.abc10014 = !true;
            this.abc10020 = false;
        } else {
            i = 0;
        }
        if (this.abc1009 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.abc1009;
                if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i3] = 0;
                i3++;
            }
        }
        this.abc10010 += 0.6788331036870052d;
        this.abc10015 = 0.31877583f;
        this.abc8 = true;
        this.abc1001 = !this.abc1001;
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        ArrayList<Integer> arrayList3 = this.abc10018;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc10018.remove(0);
        }
        return i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.adapter.isShowCheckedBox()) {
            this.isSelectAll = false;
            this.abc1003 = 0.36261034f;
            this.abc1001 = !(!this.abc1001);
            this.abc3 = !this.abc3;
            ArrayList<Integer> arrayList = this.abc10018;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10018.remove(0);
            }
            this.abc10010 -= 0.9595738970007468d;
            this.abc1004 = !this.abc1004;
            this.binding.ivDelete.setImageResource(R.mipmap.all_delete2);
            this.abc10020 = false;
            this.abc10023 = " it.";
            this.abc10012 = Math.abs(this.abc10012);
            if (this.abc1.size() > 7) {
                this.abc1.add(9);
                if (!TextUtils.isEmpty(this.abc10023)) {
                    this.abc10023 += this.abc10023.length();
                }
                this.abc10014 = false;
                if (this.abc1002 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = this.abc1002;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
            }
            this.abc10023 = "d ";
            this.abc10012 = 5;
            if (this.abc1006.size() < 0) {
                this.abc1006.add(8);
            }
            this.binding.ivSelect.setImageResource(R.mipmap.unselectall);
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
            if (this.abc10010 > 0.8590730252452264d) {
                this.abc10010 = 0.7893877561503874d;
            }
            if (!TextUtils.isEmpty(this.abc10023)) {
                this.abc10023 += this.abc10023.length();
            }
            if (this.abc4.size() < 3) {
                this.abc4.add(">      ");
                this.abc1007 = 0.024016798f;
                if (!TextUtils.isEmpty(this.abc10023)) {
                    this.abc10023 += this.abc10023.length();
                }
                if (this.abc10022 == null) {
                    this.abc10022 = new String[10];
                }
            }
            if (this.abc1009 == null) {
                this.abc1009 = new int[10];
            }
            if (this.abc10016.size() < 6) {
                this.abc10016.add(3);
            }
            ArrayList<Integer> arrayList2 = this.abc10016;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10016.remove(0);
            }
            this.adapter.setShowCheckedBox(false);
            this.abc1003 = Math.abs(this.abc1003);
            this.abc10010 = Math.abs(this.abc10010);
            this.abc10021 *= 0.6002735795823807d;
            if (this.abc1.size() > 7) {
                this.abc1.add(7);
                this.abc1000 = 0.006230010522683571d;
                this.abc10020 = !this.abc10020;
                this.abc1001 = false;
            }
            this.abc1004 = true;
            if (this.abc10015 < 0.33026624d) {
                this.abc10015 = 0.03851211f;
            }
            this.abc10021 = Math.abs(this.abc10021);
            for (LogoMyLogoEntity logoMyLogoEntity : this.adapter.getList()) {
                logoMyLogoEntity.m2186c(false);
                if (this.abc10017.size() > 4) {
                    this.abc10017.add(5);
                }
                this.abc1007 += 0.93261355f;
                ArrayList<String> arrayList3 = this.abc1005;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    this.abc1005.remove(0);
                }
                if (!TextUtils.isEmpty(this.abc11)) {
                    int length = this.abc11.length();
                    if (this.abc10010 > 0.869032328337299d) {
                        this.abc10010 = 0.6728333936717524d;
                    }
                    if (this.abc10016.size() < 3) {
                        this.abc10016.add(0);
                    }
                    this.abc1004 = true;
                    this.abc11 += length;
                    if (this.abc1002 != null) {
                        int i2 = 0;
                        while (true) {
                            String[] strArr2 = this.abc1002;
                            if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i2] = "string" + i2;
                            i2++;
                        }
                    }
                    if (this.abc1006.size() < 3) {
                        this.abc1006.add(7);
                    }
                    if (!TextUtils.isEmpty(this.abc10023)) {
                        this.abc10023 += this.abc10023.length();
                    }
                }
                if (this.abc10019 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr3 = this.abc10019;
                        if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                            break;
                        }
                        strArr3[i3] = "string" + i3;
                        i3++;
                    }
                }
                if (this.abc10018.size() > 8) {
                    this.abc10018.add(4);
                }
                this.abc1001 = true;
            }
            this.abc10020 = true;
            this.abc10021 += 0.2867156849980276d;
            String[] strArr4 = this.abc1002;
            if (strArr4 != null) {
                strArr4[5] = null;
            }
            if (this.abc9.size() < 7) {
                this.abc9.add(9);
                if (!TextUtils.isEmpty(this.abc10023)) {
                    this.abc10023 += this.abc10023.length();
                }
                if (this.abc10016 == null) {
                    this.abc10016 = new ArrayList<>();
                }
                String[] strArr5 = this.abc1002;
                if (strArr5 != null) {
                    strArr5[1] = "ry yea";
                }
            }
            if (this.abc10010 < 0.9860884182685651d) {
                this.abc10010 = 0.4724749449989809d;
            }
            this.abc1000 = Math.abs(this.abc1000);
            int[] iArr = this.abc10013;
            if (iArr != null) {
                iArr[5] = 0;
            }
            this.adapter.notifyDataSetChanged();
            this.abc10010 -= 0.8049607837705453d;
            this.abc1007 = 0.63734704f;
            if (this.abc10019 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr6 = this.abc10019;
                    if (i4 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i4] = "string" + i4;
                    i4++;
                }
            }
            this.abc8 = false;
            this.abc1004 = false;
            if (this.abc10017.size() < 3) {
                this.abc10017.add(1);
            }
            this.binding.rlSelectItem.setVisibility(0);
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            if (this.abc1006.size() > 0) {
                this.abc1006.add(2);
            }
            this.abc10023 = "is the ";
            if (!TextUtils.isEmpty(this.abc2)) {
                int length2 = this.abc2.length();
                if (this.abc1006 == null) {
                    this.abc1006 = new ArrayList<>();
                }
                int[] iArr2 = this.abc10013;
                if (iArr2 != null) {
                    iArr2[5] = 0;
                }
                this.abc10020 = true;
                this.abc2 += length2;
                if (this.abc10013 == null) {
                    this.abc10013 = new int[10];
                }
                this.abc10021 = -this.abc10021;
                if (this.abc10022 == null) {
                    this.abc10022 = new String[10];
                }
            }
            ArrayList<String> arrayList4 = this.abc10011;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc10011.remove(0);
            }
            if (this.abc10016.size() < 3) {
                this.abc10016.add(8);
            }
            if (this.abc10022 == null) {
                this.abc10022 = new String[10];
            }
            this.binding.rlDelete.setVisibility(8);
            if (this.abc10016.size() < 0) {
                this.abc10016.add(8);
            }
            this.abc1007 = 0.38634425f;
            this.abc1003 = 0.31386536f;
            this.abc0 = this.abc0 > 0.09041922538194869d ? 0.7389938259038007d : 0.31336400150918897d;
            this.abc10014 = !this.abc10014;
            if (this.abc1008.size() > 5) {
                this.abc1008.add(" is e");
            }
            if (this.abc10013 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr3 = this.abc10013;
                    if (i5 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i5] = 1;
                    i5++;
                }
            }
            this.binding.rlSelectAll.setVisibility(8);
            String[] strArr7 = this.abc10019;
            if (strArr7 != null) {
                strArr7[2] = UserDataStore.STATE;
            }
            String[] strArr8 = this.abc10022;
            if (strArr8 != null) {
                strArr8[9] = "i";
            }
            if (this.abc1005.size() < 3) {
                this.abc1005.add("ntiment ");
            }
            if (this.abc7 == null) {
                this.abc7 = new ArrayList<>();
                this.abc1001 = !this.abc1001;
                if (this.abc10016 == null) {
                    this.abc10016 = new ArrayList<>();
                }
                this.abc1001 = !this.abc1001;
            }
            if (this.abc1009 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr4 = this.abc1009;
                    if (i6 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i6] = 1;
                    i6++;
                }
            }
            this.abc10023 = "ived w";
        } else {
            super.onBackPressed();
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            this.abc1003 = Math.abs(this.abc1003);
            this.abc10014 = false;
            if (this.abc7 == null) {
                this.abc7 = new ArrayList<>();
                this.abc1000 = 0.6720553790827098d;
                if (this.abc10021 > 0.7826900398720661d) {
                    this.abc10021 = 0.27572153193848803d;
                }
                this.abc1000 = 0.6720553790827098d < 0.2740377961623377d ? 0.7128747833054121d : 0.2403809966181102d;
            }
            if (!TextUtils.isEmpty(this.abc10023)) {
                this.abc10023 += this.abc10023.length();
            }
            this.abc1003 = 0.4845696f;
            this.abc1000 = Math.abs(this.abc1000);
        }
        if (this.abc10013 != null) {
            int i7 = 0;
            while (true) {
                int[] iArr5 = this.abc10013;
                if (i7 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i7] = 9;
                i7++;
            }
        }
        ArrayList<String> arrayList5 = this.abc1008;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1008.remove(0);
        }
        this.abc1004 = !this.abc1004;
        this.abc5 = 0.21658033f;
        ArrayList<String> arrayList6 = this.abc10011;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc10011.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        this.abc1004 = false;
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.abc10021 += 0.9168013129114173d;
        if (this.abc10013 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.abc10013;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 7;
                i2++;
            }
        }
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        Glide.m18522c(this).m18523b();
        this.abc1000 = 0.23574826599283272d;
        int[] iArr2 = this.abc1009;
        if (iArr2 != null) {
            iArr2[5] = 0;
        }
        this.abc10020 = !this.abc10020;
        this.abc5 = ((double) this.abc5) < 0.121082604d ? 0.93655664f : 0.43912894f;
        String[] strArr = this.abc1002;
        if (strArr != null) {
            strArr[6] = "ride ";
        }
        ArrayList<String> arrayList = this.abc10011;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10011.remove(0);
        }
        this.abc10023 = " is the n";
        this.binding = (ActivityLogoMyLogoBinding) DataBindingUtil.setContentView(this, R.layout.activity_logo_my_logo);
        this.abc10010 = 0.6574772162171872d;
        int[] iArr3 = this.abc10013;
        if (iArr3 != null) {
            iArr3[2] = 0;
        }
        ArrayList<Integer> arrayList2 = this.abc10017;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc10017.remove(0);
        }
        this.abc6 = ((double) this.abc6) < 0.65169084d ? 0.24491513f : 0.57621f;
        this.abc1003 = Math.abs(this.abc1003);
        this.abc1004 = !this.abc1004;
        if (this.abc10019 == null) {
            this.abc10019 = new String[10];
        }
        this.binding.setLifecycleOwner(this);
        ArrayList<Integer> arrayList3 = this.abc10018;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc10018.remove(0);
        }
        this.abc1004 = true;
        this.abc1001 = !this.abc1001;
        if (!TextUtils.isEmpty(this.abc2)) {
            int length = this.abc2.length();
            this.abc1004 = !this.abc1004;
            if (this.abc1002 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.abc1002;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    i3++;
                }
            }
            if (this.abc10011.size() > 4) {
                this.abc10011.add("iliar wi");
            }
            this.abc2 += length;
            if (!TextUtils.isEmpty(this.abc10023)) {
                this.abc10023 += this.abc10023.length();
            }
            this.abc1003 = 0.8597842f;
        }
        if (this.abc10013 == null) {
            this.abc10013 = new int[10];
        }
        this.abc10023 = "a";
        this.abc10021 -= 0.5394603833952104d;
        setSupportActionBar(this.binding.toolbar);
        this.abc1000 = -(-this.abc1000);
        this.abc10021 = this.abc10021 > 0.6215984428737549d ? 0.9437292586278976d : 0.4698555965504242d;
        if (this.abc7.size() > 2) {
            this.abc7.add("加载的效果。先看");
            this.abc1001 = true;
            if (!TextUtils.isEmpty(this.abc10023)) {
                this.abc10023 += this.abc10023.length();
            }
            int[] iArr4 = this.abc10013;
            if (iArr4 != null) {
                iArr4[3] = 0;
            }
        }
        if (this.abc10019 == null) {
            this.abc10019 = new String[10];
        }
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        if (this.abc10016.size() > 1) {
            this.abc10016.add(7);
        }
        this.binding.rlBack.setOnClickListener(new View$OnClickListenerC9571a());
        this.abc1004 = !this.abc1004;
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        this.abc1007 = 0.7288911f;
        if (this.abc4.size() > 5) {
            this.abc4.add("5.1");
            int[] iArr5 = this.abc10013;
            if (iArr5 != null) {
                iArr5[9] = 2;
            }
            if (this.abc1009 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr6 = this.abc1009;
                    if (i4 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i4] = 5;
                    i4++;
                }
            }
            this.abc10010 -= 0.8832666700705404d;
        }
        this.abc1001 = !this.abc1001;
        int[] iArr7 = this.abc1009;
        if (iArr7 != null) {
            iArr7[5] = 9;
        }
        String[] strArr3 = this.abc10022;
        if (strArr3 != null) {
            strArr3[2] = "to";
        }
        this.adapter = new LogoRvMyLogoAdapter(new ArrayList(), this);
        if (this.abc10017.size() < 1) {
            this.abc10017.add(3);
        }
        ArrayList<String> arrayList4 = this.abc1005;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1005.remove(0);
        }
        if (this.abc10019 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.abc10019;
                if (i5 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i5] = "string" + i5;
                i5++;
            }
        }
        if (this.abc1 == null) {
            this.abc1 = new ArrayList<>();
            if (this.abc1002 != null) {
                int i6 = 0;
                while (true) {
                    String[] strArr5 = this.abc1002;
                    if (i6 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i6] = "string" + i6;
                    i6++;
                }
            }
            if (this.abc10019 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr6 = this.abc10019;
                    if (i7 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i7] = "string" + i7;
                    i7++;
                }
            }
            this.abc10014 = !this.abc10014;
        }
        if (this.abc10019 != null) {
            int i8 = 0;
            while (true) {
                String[] strArr7 = this.abc10019;
                if (i8 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                    break;
                }
                strArr7[i8] = "string" + i8;
                i8++;
            }
        }
        int[] iArr8 = this.abc1009;
        if (iArr8 != null) {
            iArr8[4] = 9;
        }
        this.abc10020 = true;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        if (this.abc1005.size() > 0) {
            this.abc1005.add(" only un");
        }
        if (this.abc10016.size() > 9) {
            this.abc10016.add(0);
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        if (this.abc4.size() > 1) {
            this.abc4.add("tBord");
            this.abc10012 *= 4;
            if (this.abc10016 == null) {
                this.abc10016 = new ArrayList<>();
            }
            this.abc1004 = false;
        }
        this.abc10015 = 0.89692765f;
        if (this.abc1009 == null) {
            this.abc1009 = new int[10];
        }
        this.abc1003 = 0.10657835f;
        this.binding.rvMyLogo.setLayoutManager(gridLayoutManager);
        this.abc10010 = Math.abs(this.abc10010);
        this.abc1007 = 0.647344f;
        if (this.abc10022 != null) {
            int i9 = 0;
            while (true) {
                String[] strArr8 = this.abc10022;
                if (i9 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                    break;
                }
                strArr8[i9] = "string" + i9;
                i9++;
            }
        }
        if (this.abc6 < 0.063441575d) {
            this.abc6 = 0.20857674f;
            ArrayList<String> arrayList5 = this.abc1005;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.abc1005.remove(0);
            }
            this.abc1000 = 0.926284391403451d;
            if (this.abc1006.size() > 8) {
                this.abc1006.add(0);
            }
        }
        this.abc10023 = "nd chara";
        int i10 = 0;
        while (true) {
            int i11 = this.abc10012;
            if (i11 > 3) {
                i11 = 3;
            }
            if (i10 >= i11) {
                break;
            }
            if (this.abc10017.size() < 2) {
                this.abc10017.add(5);
            }
            i10++;
        }
        this.abc1004 = !this.abc1004;
        this.binding.rvMyLogo.addItemDecoration(new LogoRvGridItemDecoration());
        this.abc10021 = (-this.abc10021) + 0.9923801785796751d;
        this.abc1007 = -this.abc1007;
        ArrayList<String> arrayList6 = this.abc7;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc7.remove(0);
            this.abc1001 = false;
            ArrayList<String> arrayList7 = this.abc10011;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc10011.remove(0);
            }
            if (this.abc1006 == null) {
                this.abc1006 = new ArrayList<>();
            }
        }
        if (this.abc10011.size() > 6) {
            this.abc10011.add("ls. You");
        }
        if (this.abc10019 == null) {
            this.abc10019 = new String[10];
        }
        this.abc1001 = false;
        this.binding.rvMyLogo.setAdapter(this.adapter);
        this.abc10023 = "ati";
        this.abc1000 = 0.5470624173138854d;
        this.abc10010 = Math.abs(this.abc10010);
        this.abc6 = Math.abs(this.abc6);
        String[] strArr9 = this.abc1002;
        if (strArr9 != null) {
            strArr9[3] = null;
        }
        if (this.abc10017.size() < 8) {
            this.abc10017.add(4);
        }
        this.abc10014 = true;
        ((SimpleItemAnimator) this.binding.rvMyLogo.getItemAnimator()).setSupportsChangeAnimations(false);
        this.abc10010 = 0.20209376147170577d;
        if (this.abc10017.size() > 5) {
            this.abc10017.add(9);
        }
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        this.abc0 = 0.6618085334670223d;
        if (this.abc10019 == null) {
            this.abc10019 = new String[10];
        }
        if (this.abc10022 != null) {
            int i12 = 0;
            while (true) {
                String[] strArr10 = this.abc10022;
                if (i12 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                    break;
                }
                strArr10[i12] = "string" + i12;
                i12++;
            }
        }
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        this.viewModel = (LogoMyLogoVM) new ViewModelProvider(this).get(LogoMyLogoVM.class);
        int[] iArr9 = this.abc1009;
        if (iArr9 != null) {
            iArr9[5] = 0;
        }
        this.abc1004 = !this.abc1004;
        if (this.abc10016.size() > 4) {
            this.abc10016.add(4);
        }
        this.abc8 = !this.abc8;
        this.abc1003 = 0.75897366f;
        ArrayList<Integer> arrayList8 = this.abc10016;
        if (arrayList8 == null && arrayList8.size() > 0) {
            this.abc10016.remove(0);
        }
        int[] iArr10 = this.abc1009;
        if (iArr10 != null) {
            iArr10[6] = 5;
        }
        this.viewModel.getList().observe(this, new C9572b());
        if (this.abc10017 == null) {
            this.abc10017 = new ArrayList<>();
        }
        this.abc1004 = false;
        this.abc10010 = -this.abc10010;
        this.abc8 = false;
        if (this.abc10016 == null) {
            this.abc10016 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList9 = this.abc10017;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.abc10017.remove(0);
        }
        this.abc10012 = this.abc10012 < 0 ? 4 : 0;
        this.activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C9573c());
        int[] iArr11 = this.abc1009;
        if (iArr11 != null) {
            iArr11[0] = 0;
        }
        if (iArr11 != null) {
            int i13 = 0;
            while (true) {
                int[] iArr12 = this.abc1009;
                if (i13 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                    break;
                }
                iArr12[i13] = 9;
                i13++;
            }
        }
        this.abc1000 = 2.6269748682550276E-4d;
        this.abc2 = "解了。官方自身是不";
        int[] iArr13 = this.abc1009;
        if (iArr13 != null) {
            iArr13[8] = 5;
        }
        ArrayList<String> arrayList10 = this.abc1005;
        if (arrayList10 != null && arrayList10.size() > 0) {
            this.abc1005.remove(0);
        }
        this.abc10015 -= 0.9902534f;
        this.adapter.setOnItemMenuClickListner(new C9574d());
        int[] iArr14 = this.abc10013;
        if (iArr14 != null) {
            iArr14[6] = 0;
        }
        ArrayList<String> arrayList11 = this.abc1008;
        if (arrayList11 != null && arrayList11.size() > 0) {
            this.abc1008.remove(0);
        }
        this.abc10023 = "is is";
        if (!TextUtils.isEmpty(this.abc11)) {
            int length2 = this.abc11.length();
            if (this.abc1003 > 0.028012872d) {
                this.abc1003 = 0.41982365f;
            }
            if (this.abc10013 != null) {
                int i14 = 0;
                while (true) {
                    int[] iArr15 = this.abc10013;
                    if (i14 >= (iArr15.length > 3 ? 3 : iArr15.length)) {
                        break;
                    }
                    iArr15[i14] = 3;
                    i14++;
                }
            }
            this.abc1003 = ((double) this.abc1003) < 0.76295173d ? 0.6071462f : 0.9321328f;
            this.abc11 += length2;
            if (this.abc1009 != null) {
                int i15 = 0;
                while (true) {
                    int[] iArr16 = this.abc1009;
                    if (i15 >= (iArr16.length > 3 ? 3 : iArr16.length)) {
                        break;
                    }
                    iArr16[i15] = 9;
                    i15++;
                }
            }
            if (this.abc10011.size() < 0) {
                this.abc10011.add("nk. ");
            }
            this.abc1000 = 0.809063863301407d;
        }
        String[] strArr11 = this.abc10019;
        if (strArr11 != null) {
            strArr11[6] = "ways ";
        }
        this.abc1001 = !this.abc1001;
        if (this.abc10011.size() < 8) {
            this.abc10011.add(" a book wr");
        }
        this.binding.rlSelectAll.setOnClickListener(new View$OnClickListenerC9576e());
        this.abc1000 = this.abc1000 > 0.7494481396922572d ? 0.3217557706506531d : 0.3248345984886587d;
        if (this.abc10018.size() < 0) {
            this.abc10018.add(0);
        }
        int[] iArr17 = this.abc10013;
        if (iArr17 != null) {
            iArr17[3] = 0;
        }
        this.abc2 = "nd";
        ArrayList<String> arrayList12 = this.abc1005;
        if (arrayList12 != null && arrayList12.size() > 0) {
            this.abc1005.remove(0);
        }
        String[] strArr12 = this.abc10019;
        if (strArr12 != null) {
            i = 9;
            strArr12[9] = null;
        } else {
            i = 9;
        }
        if (this.abc10016.size() > i) {
            this.abc10016.add(7);
        }
        this.binding.rlDelete.setOnClickListener(new View$OnClickListenerC9577f());
        if (this.abc1005.size() > 2) {
            this.abc1005.add("kind o");
        }
        this.abc10014 = false;
        this.abc1007 = 0.626544f;
        if (!TextUtils.isEmpty(this.abc11)) {
            int length3 = this.abc11.length();
            ArrayList<Integer> arrayList13 = this.abc10017;
            if (arrayList13 == null && arrayList13.size() > 0) {
                this.abc10017.remove(0);
            }
            this.abc10010 -= 0.07481205957366355d;
            if (this.abc1008 == null) {
                this.abc1008 = new ArrayList<>();
            }
            this.abc11 += length3;
            this.abc1001 = true;
            this.abc1000 = 0.12209067393494166d;
            if (this.abc1006.size() > 5) {
                this.abc1006.add(5);
            }
        }
        this.abc10010 = this.abc10010 < 0.8402476064634165d ? 0.10201910054231955d : 0.5057635472866342d;
        if (this.abc1008 == null) {
            this.abc1008 = new ArrayList<>();
        }
        this.abc1007 = 0.16087812f;
        this.binding.rlSelectItem.setOnClickListener(new View$OnClickListenerC9579g());
        int[] iArr18 = this.abc10013;
        if (iArr18 != null) {
            iArr18[0] = 1;
        }
        this.abc10021 += 0.4996953580684744d;
        this.abc1007 = 0.07199168f;
        if (this.abc9.size() < 9) {
            this.abc9.add(1);
            if (this.abc1009 == null) {
                this.abc1009 = new int[10];
            }
            if (this.abc10017.size() > 0) {
                this.abc10017.add(0);
            }
            if (this.abc1002 == null) {
                this.abc1002 = new String[10];
            }
        }
        if (this.abc10016.size() > 3) {
            this.abc10016.add(8);
        }
        this.abc1004 = true;
        this.abc1003 = 0.47265744f;
        this.viewModel.initData();
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc10023)) {
            this.abc10023 += this.abc10023.length();
        }
        this.abc1000 = 0.9361882862745404d;
        if (this.abc9.size() < 6) {
            this.abc9.add(0);
            if (this.abc10018.size() < 9) {
                this.abc10018.add(0);
            }
            this.abc1000 = 0.48747764722593157d;
            String[] strArr13 = this.abc1002;
            if (strArr13 != null) {
                strArr13[4] = "that ";
            }
        }
        if (this.abc10017 == null) {
            this.abc10017 = new ArrayList<>();
        }
        if (this.abc1000 < 0.37716310599451885d) {
            this.abc1000 = 0.1341709259393461d;
        }
        String[] strArr14 = this.abc10019;
        if (strArr14 != null) {
            strArr14[8] = " b";
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        int[] iArr = this.abc10013;
        if (iArr != null) {
            iArr[2] = 0;
        }
        this.abc1000 = 0.6142437800376983d;
        this.abc10010 *= 0.1068894355067802d;
        if (this.abc9.size() < 2) {
            this.abc9.add(6);
            this.abc1003 *= 0.7583524f;
            int[] iArr2 = this.abc1009;
            if (iArr2 != null) {
                iArr2[1] = 8;
            }
            if (this.abc10018.size() < 1) {
                this.abc10018.add(5);
            }
        }
        this.abc10015 = ((double) this.abc10015) > 0.007880449d ? 0.10458803f : 0.7286288f;
        this.abc1007 -= 0.49732f;
        String[] strArr = this.abc10022;
        if (strArr != null) {
            strArr[4] = "'";
        }
        int statusBarHeight = getStatusBarHeight();
        this.abc10010 = -this.abc10010;
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        this.abc1004 = !this.abc1004;
        this.abc5 *= 0.73585814f;
        this.abc1007 = 0.6543124f;
        this.abc1000 = Math.abs(this.abc1000);
        ArrayList<String> arrayList = this.abc1008;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1008.remove(0);
        }
        ViewGroup.LayoutParams layoutParams = this.binding.statusView.getLayoutParams();
        this.abc10020 = false;
        if (this.abc1009 == null) {
            this.abc1009 = new int[10];
        }
        this.abc1007 = 0.96816474f;
        this.abc10 = this.abc10 < 0.22483462024436152d ? 0.6124887619108222d : 0.908665289071275d;
        this.abc10023 = " its plot";
        this.abc10020 = !true;
        layoutParams.height = statusBarHeight;
        this.abc10010 = 0.48580050248391937d;
        this.abc1004 = !this.abc1004;
        this.abc10023 = " moderni";
        this.abc0 -= 0.8078939512960536d;
        int[] iArr3 = this.abc1009;
        if (iArr3 != null) {
            iArr3[3] = 0;
        }
        if (this.abc10011.size() < 9) {
            this.abc10011.add(" star");
        }
        int[] iArr4 = this.abc10013;
        if (iArr4 != null) {
            iArr4[5] = 0;
        }
        this.binding.statusView.setLayoutParams(layoutParams);
        if (this.abc10019 == null) {
            this.abc10019 = new String[10];
        }
        if (this.abc1007 > 0.158979d) {
            this.abc1007 = 0.67298526f;
        }
        this.abc10020 = !this.abc10020;
        this.abc5 = 0.81708026f;
        if (this.abc10018 == null) {
            this.abc10018 = new ArrayList<>();
        }
        String[] strArr2 = this.abc1002;
        if (strArr2 != null) {
            strArr2[1] = null;
        }
        if (strArr2 != null) {
            strArr2[8] = null;
        }
    }

    public void save(LogoMyLogoEntity logoMyLogoEntity) {
        try {
            if (BitmapFactory.decodeFile(logoMyLogoEntity.m2188a().getAbsolutePath()).compress(Bitmap.CompressFormat.PNG, 100, getContentResolver().openOutputStream(getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new ContentValues()), "rw"))) {
                Toast toast = this.toast;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(this, (int) R.string.save_successfully, 0);
                this.toast = makeText;
                makeText.show();
                return;
            }
            Toast.makeText(this, (int) R.string.save_failed, 0).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
