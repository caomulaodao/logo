package com.logomaster.logomaker.p131vm;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.logomaster.logomaker.LogoApplication;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.base.LogoBaseViewModel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.util.ArrayList;

/* renamed from: com.logomaster.logomaker.vm.LogoMainVM */
/* loaded from: classes3.dex */
public class LogoMainVM extends LogoBaseViewModel {
    private MutableLiveData<String> versionName = new MutableLiveData<>();
    public String code1000 = "robab";
    public float abc1000 = 0.31702608f;
    public int[] code1001 = new int[12];
    public String abc0 = "ack.";
    public int[] code1002 = new int[15];
    public String[] abc1001 = new String[15];
    public ArrayList<String> code1003 = new ArrayList<>();
    private MutableLiveData<Boolean> isShowRateUsDialog = new MutableLiveData<>();
    public String[] code1004 = new String[10];
    public String abc1002 = "think";
    public String code1005 = "vesent";
    public String abc1 = ">       ";
    public String code1006 = " gro";
    public String[] abc1003 = new String[12];
    public boolean code1007 = false;
    private MutableLiveData<Boolean> isShowRuleDialog = new MutableLiveData<>();
    public ArrayList<Integer> code1008 = new ArrayList<>();
    public double abc1004 = 0.4752415153493893d;
    public ArrayList<Integer> code1009 = new ArrayList<>();
    public String[] abc2 = new String[14];
    public int code10010 = 6;
    public ArrayList<Integer> abc1005 = new ArrayList<>();
    public String code10011 = "ceived w";
    private MutableLiveData<Boolean> isToShareApp = new MutableLiveData<>();
    public double code10012 = 0.7888977126429293d;
    public boolean abc1006 = false;
    public float code10013 = 0.7167969f;
    public String abc3 = "nter.b";
    public float code10014 = 0.30151445f;
    public ArrayList<Integer> abc1007 = new ArrayList<>();
    public boolean code10015 = false;

    public void ShowRateUsDialog() {
        this.isShowRateUsDialog.setValue(Boolean.TRUE);
        if (this.code1008.size() > 8) {
            this.code1008.add(2);
        }
        this.code1007 = true;
        if (this.code1008 == null) {
            this.code1008 = new ArrayList<>();
        }
        this.abc1004 = Math.abs(this.abc1004);
        this.code10014 = 0.1867221f;
        ArrayList<Integer> arrayList = this.code1009;
        if (arrayList == null && arrayList.size() > 0) {
            this.code1009.remove(0);
        }
        if (!TextUtils.isEmpty(this.code1005)) {
            this.code1005 += this.code1005.length();
        }
        this.abc1002 = " publicati";
        this.code1000 = DownloadCommon.DOWNLOAD_REPORT_REASON;
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        if (this.abc1003 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc1003;
                if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i] = "string" + i;
                if (this.code10010 < 0) {
                    this.code10010 = 6;
                }
                this.code10013 = 0.42686772f;
                ArrayList<Integer> arrayList2 = this.code1009;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.code1009.remove(0);
                }
                i++;
            }
            String[] strArr2 = this.code1004;
            if (strArr2 != null) {
                strArr2[1] = null;
            }
            if (this.code1009 == null) {
                this.code1009 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(this.code1000)) {
                this.code1000 += this.code1000.length();
            }
        }
        this.code10012 *= 0.23488852937068572d;
        if (!TextUtils.isEmpty(this.code1000)) {
            this.code1000 += this.code1000.length();
        }
        ArrayList<Integer> arrayList3 = this.code1009;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.code1009.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc0)) {
            int length = this.abc0.length();
            this.code10012 = this.code10012 > 0.3860129554912103d ? 0.12102642083110782d : 0.5902835573179548d;
            if (this.code1001 == null) {
                this.code1001 = new int[10];
            }
            if (this.code1008.size() > 7) {
                this.code1008.add(9);
            }
            if (this.abc1000 > 0.5659895d) {
                this.abc1000 = 0.024782002f;
                this.code1006 = "l";
                if (this.code1008.size() < 8) {
                    this.code1008.add(0);
                }
                if (this.code1001 == null) {
                    this.code1001 = new int[10];
                }
            }
            this.code10014 = 0.5406389f;
            if (this.code10013 < 0.32702357d) {
                this.code10013 = 0.4071005f;
            }
            this.code1007 = !this.code1007;
            if (!TextUtils.isEmpty(this.abc1002)) {
                int length2 = this.abc1002.length();
                ArrayList<Integer> arrayList4 = this.code1009;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    this.code1009.remove(0);
                }
                this.code10014 = 0.77695143f;
                this.code1007 = true;
                this.abc1002 += length2;
                ArrayList<Integer> arrayList5 = this.code1009;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    this.code1009.remove(0);
                }
                this.code10012 = this.code10012 < 0.12583995802139425d ? 0.9535319979343716d : 0.8600029188616963d;
                if (!TextUtils.isEmpty(this.code1005)) {
                    this.code1005 += this.code1005.length();
                }
            }
            int[] iArr = this.code1002;
            if (iArr != null) {
                iArr[6] = 0;
            }
            this.code1007 = true;
            if (this.code1001 == null) {
                this.code1001 = new int[10];
            }
            if (this.abc1005.size() < 9) {
                this.abc1005.add(5);
                this.code10010 = 7;
                String[] strArr3 = this.code1004;
                if (strArr3 != null) {
                    strArr3[7] = " ";
                }
                this.code10014 = ((double) this.code10014) > 0.9972489d ? 0.5504775f : 0.6398883f;
            }
            if (this.code1002 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.code1002;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 9;
                    i2++;
                }
            }
            this.code10014 = 0.97832656f;
            if (this.code1002 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr3 = this.code1002;
                    if (i3 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i3] = 1;
                    i3++;
                }
            }
            this.abc0 += length;
            ArrayList<String> arrayList6 = this.code1003;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.code1003.remove(0);
            }
            if (this.code1008 == null) {
                this.code1008 = new ArrayList<>();
            }
            this.code10015 = !this.code10015;
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
                String[] strArr4 = this.code1004;
                if (strArr4 != null) {
                    strArr4[0] = null;
                }
                ArrayList<String> arrayList7 = this.code1003;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    this.code1003.remove(0);
                }
                if (!TextUtils.isEmpty(this.code10011)) {
                    this.code10011 += this.code10011.length();
                }
            }
            if (!TextUtils.isEmpty(this.code10011)) {
                this.code10011 += this.code10011.length();
            }
            this.code10014 = Math.abs(this.code10014);
            if (!TextUtils.isEmpty(this.code1006)) {
                this.code1006 += this.code1006.length();
            }
            this.abc1006 = false;
            this.code1005 = "model fo";
            String[] strArr5 = this.code1004;
            if (strArr5 != null) {
                strArr5[8] = "n novels.";
            }
            if (!TextUtils.isEmpty(this.code1006)) {
                this.code1006 += this.code1006.length();
            }
            this.abc1006 = false;
            this.code1007 = !this.code1007;
            if (!TextUtils.isEmpty(this.code10011)) {
                this.code10011 += this.code10011.length();
            }
            this.code10014 -= 0.53240484f;
        }
        ArrayList<String> arrayList8 = this.code1003;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.code1003.remove(0);
        }
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        int i4 = 0;
        while (true) {
            int i5 = this.code10010;
            if (i4 >= (i5 > 3 ? 3 : i5)) {
                break;
            }
            this.code10010 = -i5;
            i4++;
        }
        this.abc1000 = 0.5979239f;
        this.code10014 = 0.30813754f;
        this.code1007 = true;
        if (this.abc1004 < 0.8630238340354004d) {
            this.abc1004 = 0.7223263647714764d;
            if (this.code1004 != null) {
                int i6 = 0;
                while (true) {
                    String[] strArr6 = this.code1004;
                    if (i6 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i6] = "string" + i6;
                    i6++;
                }
            }
            this.code10014 = 0.919129f;
            ArrayList<String> arrayList9 = this.code1003;
            if (arrayList9 != null && arrayList9.size() > 0) {
                this.code1003.remove(0);
            }
        }
        this.code10010 = this.code10010 > 8 ? 0 : 2;
        ArrayList<String> arrayList10 = this.code1003;
        if (arrayList10 != null && arrayList10.size() > 0) {
            this.code1003.remove(0);
        }
        this.code10010 = 4;
        if (this.abc1007.size() > 8) {
            this.abc1007.add(6);
            if (this.code1008 == null) {
                this.code1008 = new ArrayList<>();
            }
            String[] strArr7 = this.code1004;
            if (strArr7 != null) {
                strArr7[7] = null;
            }
            this.code10012 = Math.abs(this.code10012);
        }
        this.code10011 = "ion for ";
        int[] iArr4 = this.code1002;
        if (iArr4 != null) {
            iArr4[7] = 0;
        }
    }

    public void ShowRuleDialog() {
        this.isShowRuleDialog.setValue(Boolean.TRUE);
        int i = 0;
        if (this.code1004 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.code1004;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        this.code10013 = ((double) this.code10013) > 0.119784296d ? 0.47883028f : 0.5800722f;
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        this.abc1006 = !this.abc1006;
        this.code1007 = !this.code1007;
        if (this.code10014 > 0.0056777d) {
            this.code10014 = 0.85640186f;
        }
        if (this.code1002 == null) {
            this.code1002 = new int[10];
        }
        this.abc1002 = "arned r";
        this.code1005 = " fami";
        this.code10012 = this.code10012 < 0.5726911376154765d ? 0.7642119808647462d : 0.658141909202153d;
        this.code10013 = 0.0064732432f;
        String[] strArr2 = this.abc1003;
        if (strArr2 != null) {
            strArr2[6] = null;
            String[] strArr3 = this.code1004;
            if (strArr3 != null) {
                strArr3[1] = null;
            }
            this.code1006 = "get' h";
            if (this.code1009.size() > 2) {
                this.code1009.add(5);
            }
        }
        if (this.code1001 == null) {
            this.code1001 = new int[10];
        }
        if (this.code1008.size() < 8) {
            this.code1008.add(4);
        }
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        this.abc0 = "um n";
        if (!TextUtils.isEmpty(this.code10011)) {
            this.code10011 += this.code10011.length();
        }
        this.code10013 = ((double) this.code10013) < 0.93621236d ? 0.1808036f : 0.9017257f;
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        if (!TextUtils.isEmpty(this.abc1002)) {
            int length = this.abc1002.length();
            if (this.code1004 == null) {
                this.code1004 = new String[10];
            }
            this.code10011 = "judice i";
            String[] strArr4 = this.code1004;
            if (strArr4 != null) {
                strArr4[3] = "ecades be";
            }
            this.abc1002 += length;
            this.code10011 = " when g";
            this.code10014 = 0.9147158f;
            this.code1005 = "hat ";
        }
        int[] iArr = this.code1002;
        if (iArr != null) {
            iArr[9] = 2;
        }
        int[] iArr2 = this.code1001;
        if (iArr2 != null) {
            iArr2[7] = 0;
        }
        if (this.code1003 == null) {
            this.code1003 = new ArrayList<>();
        }
        this.abc1004 = 0.9608774650749906d;
        int[] iArr3 = this.code1001;
        if (iArr3 != null) {
            iArr3[9] = 0;
        }
        ArrayList<Integer> arrayList = this.code1009;
        if (arrayList == null && arrayList.size() > 0) {
            this.code1009.remove(0);
        }
        this.code10013 = ((double) this.code10013) < 0.20212376d ? 0.31135762f : 0.08340031f;
        if (this.abc1007.size() > 2) {
            this.abc1007.add(1);
            int[] iArr4 = this.code1002;
            if (iArr4 != null) {
                iArr4[4] = 0;
            }
            this.code10010 = this.code10010 <= 9 ? 3 : 5;
            if (this.code1008.size() < 2) {
                this.code1008.add(2);
            }
        }
        this.code10012 = 0.3684414680127056d;
        if (this.code1004 == null) {
            this.code1004 = new String[10];
        }
        if (this.code1004 == null) {
            return;
        }
        while (true) {
            String[] strArr5 = this.code1004;
            if (i >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                return;
            }
            strArr5[i] = "string" + i;
            i++;
        }
    }

    public MutableLiveData<Boolean> getIsShowRateUsDialog() {
        return this.isShowRateUsDialog;
    }

    public MutableLiveData<Boolean> getIsShowRuleDialog() {
        return this.isShowRuleDialog;
    }

    public MutableLiveData<Boolean> getIsToShareApp() {
        return this.isToShareApp;
    }

    public MutableLiveData<String> getVersionName() {
        return this.versionName;
    }

    public void initData() {
        this.versionName.setValue(LogoApplication.m9240l().getString(R.string.app_version) + ":" + LogoConstants.f25536b);
        if (this.code1001 != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.code1001;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 5;
                i++;
            }
        }
        this.code10014 = Math.abs(this.code10014) * 0.43461055f;
        if (this.abc1001 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.abc1001;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                this.code10015 = true;
                if (!TextUtils.isEmpty(this.code1006)) {
                    this.code1006 += this.code1006.length();
                }
                if (this.code1004 != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr2 = this.code1004;
                        if (i3 < (strArr2.length > 3 ? 3 : strArr2.length)) {
                            strArr2[i3] = "string" + i3;
                            i3++;
                        }
                    }
                }
                i2++;
            }
            this.code10012 = 0.5135290173480991d;
            int i4 = 0;
            while (true) {
                int i5 = this.code10010;
                if (i5 > 3) {
                    i5 = 3;
                }
                if (i4 >= i5) {
                    break;
                }
                if (this.code10012 > 0.8064734238706088d) {
                    this.code10012 = 0.08664916262748457d;
                }
                i4++;
            }
            if (!TextUtils.isEmpty(this.code1000)) {
                this.code1000 += this.code1000.length();
            }
        }
        if (this.code1002 != null) {
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.code1002;
                if (i6 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i6] = 1;
                i6++;
            }
        }
        String[] strArr3 = this.code1004;
        if (strArr3 != null) {
            strArr3[7] = " surp";
        }
        if (this.code1003.size() > 2) {
            this.code1003.add("nk. F");
        }
        this.abc1002 = "hat in ma";
        this.code10015 = true;
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        if (this.code1008.size() > 0) {
            this.code1008.add(2);
        }
        if (!TextUtils.isEmpty(this.abc1002)) {
            int length = this.abc1002.length();
            ArrayList<String> arrayList = this.code1003;
            if (arrayList != null && arrayList.size() > 0) {
                this.code1003.remove(0);
            }
            this.code1006 = "and Prejud";
            this.code10015 = true;
            this.abc1002 += length;
            int[] iArr3 = this.code1001;
            if (iArr3 != null) {
                iArr3[0] = 0;
            }
            this.code10015 = false;
            if (iArr3 != null) {
                iArr3[5] = 0;
            }
        }
        this.code10013 = ((double) this.code10013) > 0.16723102d ? 0.07607919f : 0.736229f;
        if (this.code1003 == null) {
            this.code1003 = new ArrayList<>();
        }
        this.code10015 = !this.code10015;
        this.abc0 = ReportUtil.f18058a;
        if (this.code1002 != null) {
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.code1002;
                if (i7 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i7] = 4;
                i7++;
            }
        }
        this.code1000 = "on p";
        if (!TextUtils.isEmpty(this.code10011)) {
            this.code10011 += this.code10011.length();
        }
        if (this.abc1003 == null) {
            this.abc1003 = new String[10];
            if (this.code1003.size() > 1) {
                this.code1003.add("s");
            }
            if (this.code1002 == null) {
                this.code1002 = new int[10];
            }
            if (!TextUtils.isEmpty(this.code10011)) {
                this.code10011 += this.code10011.length();
            }
        }
        this.code1006 = "han you t";
        this.code10012 += 0.8204291737155943d;
        if (!TextUtils.isEmpty("han you t")) {
            this.code1006 += this.code1006.length();
        }
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
            if (!TextUtils.isEmpty(this.code1000)) {
                this.code1000 += this.code1000.length();
            }
            if (!TextUtils.isEmpty(this.code1000)) {
                this.code1000 += this.code1000.length();
            }
            int[] iArr5 = this.code1002;
            if (iArr5 != null) {
                iArr5[8] = 2;
            }
        }
        this.code1007 = true;
        if (this.code1008.size() > 0) {
            this.code1008.add(8);
        }
        String[] strArr4 = this.code1004;
        if (strArr4 != null) {
            strArr4[2] = "tten in th";
        }
        if (this.abc1003 == null) {
            this.abc1003 = new String[10];
            this.code10013 += 0.46107823f;
            this.code10015 = !this.code10015;
            if (strArr4 != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr5 = this.code1004;
                    if (i8 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i8] = "string" + i8;
                    i8++;
                }
            }
        }
        this.code10012 = this.code10012 > 0.9246255041951013d ? 0.3631366019303498d : 0.9580656714670962d;
        int[] iArr6 = this.code1001;
        if (iArr6 != null) {
            iArr6[2] = 0;
        }
        if (TextUtils.isEmpty(this.code1005)) {
            return;
        }
        this.code1005 += this.code1005.length();
    }

    public void shareApp() {
        int i;
        this.isToShareApp.setValue(Boolean.TRUE);
        if (this.code1001 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.code1001;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 4;
                i2++;
            }
        }
        if (this.code1001 == null) {
            this.code1001 = new int[10];
        }
        this.code1007 = true;
        if (this.abc1005.size() > 3) {
            this.abc1005.add(0);
            String[] strArr = this.code1004;
            if (strArr != null) {
                strArr[3] = " and";
            }
            this.code10015 = !this.code10015;
            this.code1005 = "rced to r";
        }
        if (this.code10013 < 0.91771394d) {
            this.code10013 = 0.7399563f;
        }
        this.code10014 *= 0.42967707f;
        this.code1006 = " Fo";
        this.abc1002 = " a boo";
        this.code1007 = true;
        if (this.code1004 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.code1004;
                if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i3] = "string" + i3;
                i3++;
            }
        }
        this.code1005 = "arly 19th";
        this.abc1004 += 0.657602259812007d;
        if (!TextUtils.isEmpty(this.code1000)) {
            this.code1000 += this.code1000.length();
        }
        if (!TextUtils.isEmpty(this.code1006)) {
            this.code1006 += this.code1006.length();
        }
        if (this.code1004 == null) {
            this.code1004 = new String[10];
        }
        if (!TextUtils.isEmpty(this.abc0)) {
            int length = this.abc0.length();
            this.code10013 *= 0.3676933f;
            this.code1000 = "l. ";
            if (!TextUtils.isEmpty(this.code1006)) {
                this.code1006 += this.code1006.length();
            }
            this.abc1004 = this.abc1004 < 0.3833383510589067d ? 0.7020384064092181d : 0.5398068929354983d;
            if (this.code10013 > 0.29414797d) {
                this.code10013 = 0.023631275f;
            }
            ArrayList<Integer> arrayList = this.code1008;
            if (arrayList == null && arrayList.size() > 0) {
                this.code1008.remove(0);
            }
            int[] iArr2 = this.code1002;
            if (iArr2 != null) {
                iArr2[5] = 0;
            }
            if (this.abc1005.size() < 9) {
                this.abc1005.add(1);
                this.code10011 = "people re";
                if (this.code1004 == null) {
                    this.code1004 = new String[10];
                }
                this.code10013 = 0.8349682f;
            }
            this.code10015 = !this.code10015;
            if (this.code1002 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr3 = this.code1002;
                    if (i4 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i4] = 6;
                    i4++;
                }
            }
            this.abc1000 *= 0.38356942f;
            this.code10010 = (-this.code10010) + 5;
            if (!TextUtils.isEmpty(this.code1005)) {
                this.code1005 += this.code1005.length();
            }
            this.code1000 = "t";
            this.abc0 += length;
            String[] strArr3 = this.code1004;
            if (strArr3 != null) {
                strArr3[7] = "osett";
            }
            int i5 = 0;
            while (true) {
                i = this.code10010;
                if (i5 >= (i > 3 ? 3 : i)) {
                    break;
                }
                int[] iArr4 = this.code1002;
                if (iArr4 != null) {
                    iArr4[9] = 0;
                }
                i5++;
            }
            this.code10010 = Math.abs(i);
            this.abc1004 = this.abc1004 < 0.8771587262214952d ? 0.07257044187690542d : 0.3181559844424846d;
            this.code1005 = "f a ";
            if (this.code1008 == null) {
                this.code1008 = new ArrayList<>();
            }
            if (this.code1002 == null) {
                this.code1002 = new int[10];
            }
            this.abc1006 = true;
            this.code10014 += 0.8279177f;
            if (this.code1003.size() < 2) {
                this.code1003.add("ovels.");
            }
            this.code10012 = 0.5959855011993255d;
            this.abc1006 = false;
            if (this.code1003 == null) {
                this.code1003 = new ArrayList<>();
            }
            if (this.code1001 == null) {
                this.code1001 = new int[10];
            }
            this.code10015 = !this.code10015;
        }
        if (this.code1004 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.code1004;
                if (i6 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i6] = "string" + i6;
                i6++;
            }
        }
        if (this.code1009 == null) {
            this.code1009 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.code1000)) {
            this.code1000 += this.code1000.length();
        }
        this.abc1006 = !this.abc1006;
        this.code10014 *= 0.7617611f;
        if (this.code1004 != null) {
            int i7 = 0;
            while (true) {
                String[] strArr5 = this.code1004;
                if (i7 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i7] = "string" + i7;
                i7++;
            }
        }
        this.code1007 = !this.code1007;
        this.abc1000 = ((double) this.abc1000) < 0.18608129d ? 0.7014809f : 0.7301965f;
        this.code10011 = "odern no";
        this.code10012 = 0.19741562377478106d;
        this.code1005 = "modern";
        ArrayList<Integer> arrayList2 = this.abc1007;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1007.remove(0);
            if (this.code1009 == null) {
                this.code1009 = new ArrayList<>();
            }
            this.code1007 = true;
            int i8 = 0;
            while (true) {
                int i9 = this.code10010;
                if (i9 > 3) {
                    i9 = 3;
                }
                if (i8 >= i9) {
                    break;
                }
                if (!TextUtils.isEmpty(this.code10011)) {
                    this.code10011 += this.code10011.length();
                }
                i8++;
            }
        }
        this.code10014 = Math.abs(this.code10014);
        ArrayList<Integer> arrayList3 = this.code1008;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.code1008.remove(0);
        }
        this.code10015 = true ^ this.code10015;
    }
}
