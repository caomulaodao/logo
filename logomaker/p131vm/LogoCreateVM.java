package com.logomaster.logomaker.p131vm;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.lifecycle.MutableLiveData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.logomaster.logomaker.LogoApplication;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.base.LogoBaseViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.logomaster.logomaker.vm.LogoCreateVM */
/* loaded from: classes3.dex */
public class LogoCreateVM extends LogoBaseViewModel {
    private LogoCreateModel logoCreateModel;
    private MutableLiveData<Integer> imageTabIndex = new MutableLiveData<>();
    public double abc1000 = 0.641783724128936d;
    public float abc0 = 0.2691639f;
    public double abc1001 = 0.8368950219878678d;
    private MutableLiveData<Integer> backgroundTabIndex = new MutableLiveData<>();
    public boolean abc1002 = false;
    public float abc1 = 0.92274636f;
    public int abc1003 = 2;
    private MutableLiveData<Integer> fontTabIndex = new MutableLiveData<>();
    public int[] abc1004 = new int[12];
    public boolean abc2 = false;
    public String abc1005 = " is";
    private MutableLiveData<String> currentColor = new MutableLiveData<>();
    public String[] abc1006 = new String[18];
    public boolean abc3 = false;
    public int[] abc1007 = new int[14];
    private MutableLiveData<Boolean> isShowImageLayout = new MutableLiveData<>();
    public float abc1008 = 0.73985106f;
    public String abc4 = ".r";
    public boolean abc1009 = false;
    private MutableLiveData<Boolean> isShowColorFinderLayout = new MutableLiveData<>();
    public String abc10010 = "ways def";
    public String[] abc5 = new String[18];
    public int abc10011 = 7;
    private MutableLiveData<Boolean> isShowColorRainbowLayout = new MutableLiveData<>();
    public float abc10012 = 0.35378277f;
    public double abc6 = 0.43719212710973276d;
    public String abc10013 = "bably m";
    private MutableLiveData<Boolean> isShowBackground = new MutableLiveData<>();
    public float abc10014 = 0.6879831f;
    public ArrayList<Integer> abc7 = new ArrayList<>();
    public String abc10015 = "ably m";
    private MutableLiveData<Boolean> isShowTextLayout = new MutableLiveData<>();
    public String abc10016 = " student";
    public int[] abc8 = new int[14];
    public double abc10017 = 0.7345152888243612d;
    private MutableLiveData<Boolean> isShowClippingLayout = new MutableLiveData<>();
    public ArrayList<String> abc10018 = new ArrayList<>();
    public int abc9 = 5;
    public float abc10019 = 0.25207442f;
    private MutableLiveData<Boolean> isShowLayer = new MutableLiveData<>();
    public boolean abc10020 = false;
    public float abc10 = 0.63996506f;
    public float abc10021 = 0.9048088f;
    private MutableLiveData<Integer> finderColor = new MutableLiveData<>();
    public ArrayList<Integer> abc10022 = new ArrayList<>();
    public float abc11 = 0.10044736f;
    public String[] abc10023 = new String[18];
    private MutableLiveData<List<Object>> listImageFilling = new MutableLiveData<>();
    public String abc10024 = "alize t";
    public String abc12 = "方库，以下只是部";
    public String abc10025 = ", ";
    private MutableLiveData<List<Object>> listBgColor = new MutableLiveData<>();
    public double abc10026 = 0.9063845401532711d;
    public float abc13 = 0.92350286f;
    public float abc10027 = 0.970128f;
    private MutableLiveData<List<Object>> listTextColor = new MutableLiveData<>();
    public int[] abc10028 = new int[12];
    public ArrayList<String> abc14 = new ArrayList<>();
    public String abc10029 = "dice i";
    private MutableLiveData<List<String>> listFont = new MutableLiveData<>();
    public ArrayList<String> abc10030 = new ArrayList<>();
    public ArrayList<Integer> abc15 = new ArrayList<>();
    public int[] abc10031 = new int[16];
    private MutableLiveData<List<Typeface>> listTypeFace = new MutableLiveData<>();
    public double abc10032 = 0.12013085236526766d;
    public ArrayList<Integer> abc16 = new ArrayList<>();
    public double abc10033 = 0.6549880371196303d;
    private MutableLiveData<List<Integer>> listClipping = new MutableLiveData<>();
    public String[] abc10034 = new String[16];
    public String abc17 = "r_radius/";
    public ArrayList<Integer> abc10035 = new ArrayList<>();
    private MutableLiveData<List<LogoBaseSaveEntity>> listLayer = new MutableLiveData<>();
    public double abc10036 = 0.3940822286991178d;
    public boolean abc18 = false;
    public int abc10037 = 3;
    private MutableLiveData<Integer> clippingSelectedIndex = new MutableLiveData<>();
    public ArrayList<Integer> abc10038 = new ArrayList<>();
    public float abc19 = 0.43204224f;
    public String[] abc10039 = new String[11];
    public float abc10040 = 0.054418445f;
    public String abc20 = " gra";
    public ArrayList<String> abc10041 = new ArrayList<>();

    public void changeBackgroundTabIndex(int i) {
        this.backgroundTabIndex.setValue(Integer.valueOf(i));
        if (this.abc10012 < 0.22729999d) {
            this.abc10012 = 0.38339412f;
        }
        if (!TextUtils.isEmpty(this.abc10010)) {
            this.abc10010 += this.abc10010.length();
        }
        if (!TextUtils.isEmpty(this.abc10015)) {
            this.abc10015 += this.abc10015.length();
        }
        this.abc20 = "ndroidx.";
        this.abc10020 = !this.abc10020;
        String[] strArr = this.abc10034;
        if (strArr != null) {
            strArr[4] = "until";
        }
        this.abc1002 = !this.abc1002;
    }

    public void changeFontTabIndex(int i) {
        this.fontTabIndex.setValue(Integer.valueOf(i));
        this.abc10037 = this.abc10037 > 7 ? 9 : 4;
        int[] iArr = this.abc10028;
        int i2 = 0;
        if (iArr != null) {
            iArr[3] = 0;
        }
        if (this.abc10038.size() < 6) {
            this.abc10038.add(2);
        }
        if (this.abc14 == null) {
            this.abc14 = new ArrayList<>();
            this.abc10029 = "is";
            this.abc10040 += 0.35624087f;
            this.abc10032 = 0.047920056682194234d;
        }
        int i3 = 0;
        while (true) {
            int i4 = this.abc1003;
            if (i4 > 3) {
                i4 = 3;
            }
            if (i3 >= i4) {
                break;
            }
            String[] strArr = this.abc10023;
            if (strArr != null) {
                strArr[6] = null;
            }
            i3++;
        }
        if (this.abc1006 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.abc1006;
                if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i5] = "string" + i5;
                i5++;
            }
        }
        if (this.abc1007 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = this.abc1007;
            if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                return;
            }
            iArr2[i2] = 6;
            i2++;
        }
    }

    public void changeImageTabIndex(int i) {
        this.imageTabIndex.setValue(Integer.valueOf(i));
        int[] iArr = this.abc10028;
        if (iArr != null) {
            iArr[3] = 3;
        }
        this.abc10013 = InneractiveMediationDefs.GENDER_FEMALE;
        this.abc10027 = Math.abs(this.abc10027);
        if (this.abc16.size() > 8) {
            this.abc16.add(1);
            ArrayList<String> arrayList = this.abc10030;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc10030.remove(0);
            }
            this.abc10024 = "plot and ";
            this.abc10026 = 0.6549802247626526d;
        }
        int[] iArr2 = this.abc10028;
        if (iArr2 != null) {
            iArr2[8] = 3;
        }
        ArrayList<String> arrayList2 = this.abc10041;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc10041.remove(0);
        }
        this.abc10033 = 0.03663177877957824d;
    }

    public List<Integer> getAllBgImages() {
        ArrayList arrayList = new ArrayList();
        if (this.abc10041.size() > 1) {
            this.abc10041.add("decade");
        }
        this.abc10013 = "at th";
        this.abc10017 = this.abc10017 < 0.3141207409167961d ? 0.5530261920766809d : 0.8833617153384022d;
        if (this.abc13 > 0.5624756d) {
            this.abc13 = 0.03305739f;
            int[] iArr = this.abc10031;
            if (iArr != null) {
                iArr[3] = 2;
            }
            ArrayList<Integer> arrayList2 = this.abc10035;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc10035.remove(0);
            }
            String[] strArr = this.abc1006;
            if (strArr != null) {
                strArr[5] = null;
            }
        }
        int[] iArr2 = this.abc1004;
        if (iArr2 != null) {
            iArr2[0] = 0;
        }
        this.abc1001 = this.abc1001 < 0.013620588859788452d ? 0.23379656059148946d : 0.05301045605426813d;
        this.abc1005 = "ways d";
        arrayList.add(Integer.valueOf((int) R.mipmap.image_none));
        if (this.abc10041.size() > 4) {
            this.abc10041.add("at it is),");
        }
        this.abc10026 += 0.6782046373945233d;
        if (this.abc1007 != null) {
            int i = 0;
            while (true) {
                int[] iArr3 = this.abc1007;
                if (i >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i] = 7;
                i++;
            }
        }
        if (this.abc16.size() > 2) {
            this.abc16.add(9);
            this.abc10012 *= 0.13280731f;
            if (this.abc10022 == null) {
                this.abc10022 = new ArrayList<>();
            }
            this.abc10027 = 0.51315767f;
        }
        this.abc10025 = "orced";
        String[] strArr2 = this.abc1006;
        if (strArr2 != null) {
            strArr2[2] = null;
        }
        this.abc10032 = 0.33887511764993894d;
        arrayList.add(Integer.valueOf((int) R.mipmap.image_picture));
        this.abc10016 = "ters";
        int[] iArr4 = this.abc10031;
        if (iArr4 != null) {
            iArr4[9] = 5;
        }
        this.abc10027 = 0.8981435f;
        this.abc2 = !this.abc2;
        if (this.abc10034 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr3 = this.abc10034;
                if (i2 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i2] = "string" + i2;
                i2++;
            }
        }
        this.abc1003 = -this.abc1003;
        this.abc10017 = this.abc10017 < 0.10863801203226542d ? 0.816152128840268d : 0.7898738593806341d;
        for (int i3 = 0; i3 < 29; i3++) {
            Resources resources = LogoApplication.m9240l().getResources();
            if (!TextUtils.isEmpty(this.abc10015)) {
                this.abc10015 += this.abc10015.length();
            }
            this.abc10024 = "ose";
            this.abc11 += 0.77117056f;
            this.abc10033 = 0.06554939868174303d;
            if (this.abc10027 > 0.36410433d) {
                this.abc10027 = 0.32596284f;
            }
            this.abc10012 = 0.97494125f;
            int identifier = resources.getIdentifier("bgi" + i3, "mipmap", LogoApplication.m9240l().getPackageName());
            this.abc1008 = 0.24105656f;
            ArrayList<Integer> arrayList3 = this.abc10035;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10035.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc10010)) {
                this.abc10010 += this.abc10010.length();
            }
            this.abc1 *= 0.12818128f;
            this.abc1009 = false;
            ArrayList<Integer> arrayList4 = this.abc10022;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc10022.remove(0);
            }
            if (this.abc10041 == null) {
                this.abc10041 = new ArrayList<>();
            }
            arrayList.add(Integer.valueOf(identifier));
            int[] iArr5 = this.abc10028;
            if (iArr5 != null) {
                iArr5[9] = 4;
            }
            this.abc10013 = "nd mode";
            String[] strArr4 = this.abc1006;
            if (strArr4 != null) {
                strArr4[7] = null;
            }
            ArrayList<Integer> arrayList5 = this.abc7;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc7.remove(0);
                if (this.abc10034 == null) {
                    this.abc10034 = new String[10];
                }
                this.abc10014 = 0.10718113f;
                int[] iArr6 = this.abc10031;
                if (iArr6 != null) {
                    iArr6[9] = 0;
                }
            }
            this.abc10027 = 0.31561673f;
            this.abc10026 = 0.6577921554918489d;
            if (!TextUtils.isEmpty(this.abc10029)) {
                this.abc10029 += this.abc10029.length();
            }
        }
        this.abc10010 = "d to rea";
        int[] iArr7 = this.abc10031;
        if (iArr7 != null) {
            iArr7[0] = 3;
        }
        String[] strArr5 = this.abc10034;
        if (strArr5 != null) {
            strArr5[7] = null;
        }
        if (this.abc14 == null) {
            this.abc14 = new ArrayList<>();
            double d = this.abc10017 - 0.011897641910699197d;
            this.abc10017 = d;
            this.abc10017 = Math.abs(d);
            if (!TextUtils.isEmpty(this.abc10029)) {
                this.abc10029 += this.abc10029.length();
            }
        }
        if (this.abc10036 > 0.533964068387262d) {
            this.abc10036 = 0.7972130304519699d;
        }
        if (this.abc10031 == null) {
            this.abc10031 = new int[10];
        }
        this.abc1003 = -this.abc1003;
        return arrayList;
    }

    public MutableLiveData<Integer> getBackgroundTabIndex() {
        return this.backgroundTabIndex;
    }

    public MutableLiveData<Integer> getClippingSelectedIndex() {
        return this.clippingSelectedIndex;
    }

    public MutableLiveData<String> getCurrentColor() {
        return this.currentColor;
    }

    public MutableLiveData<Integer> getFontTabIndex() {
        return this.fontTabIndex;
    }

    public MutableLiveData<Integer> getImageTabIndex() {
        return this.imageTabIndex;
    }

    public MutableLiveData<Boolean> getIsShowBackground() {
        return this.isShowBackground;
    }

    public MutableLiveData<Boolean> getIsShowClippingLayout() {
        return this.isShowClippingLayout;
    }

    public MutableLiveData<Boolean> getIsShowColorFinderLayout() {
        return this.isShowColorFinderLayout;
    }

    public MutableLiveData<Boolean> getIsShowColorRainbowLayout() {
        return this.isShowColorRainbowLayout;
    }

    public MutableLiveData<Boolean> getIsShowImageLayout() {
        return this.isShowImageLayout;
    }

    public MutableLiveData<Boolean> getIsShowLayer() {
        return this.isShowLayer;
    }

    public MutableLiveData<Boolean> getIsShowTextLayout() {
        return this.isShowTextLayout;
    }

    public MutableLiveData<List<Object>> getListBgColor() {
        return this.listBgColor;
    }

    public MutableLiveData<List<Integer>> getListClipping() {
        return this.listClipping;
    }

    public MutableLiveData<List<String>> getListFont() {
        return this.listFont;
    }

    public MutableLiveData<List<Object>> getListImageFilling() {
        return this.listImageFilling;
    }

    public MutableLiveData<List<LogoBaseSaveEntity>> getListLayer() {
        return this.listLayer;
    }

    public MutableLiveData<List<Object>> getListTextColor() {
        return this.listTextColor;
    }

    public MutableLiveData<List<Typeface>> getListTypeFace() {
        return this.listTypeFace;
    }

    public void hideBackgroundLayout() {
        this.isShowBackground.setValue(Boolean.FALSE);
        this.abc10017 = 0.061807601110295374d;
        if (this.abc10039 == null) {
            this.abc10039 = new String[10];
        }
        this.abc1000 = 0.13218339207105712d;
        if (this.abc6 > 0.8324261160198488d) {
            this.abc6 = 0.6080860262726674d;
            this.abc10027 = Math.abs(this.abc10027);
            if (this.abc10041 == null) {
                this.abc10041 = new ArrayList<>();
            }
            int[] iArr = this.abc10028;
            if (iArr != null) {
                iArr[2] = 3;
            }
        }
        int i = 0;
        while (true) {
            int i2 = this.abc10011;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            if (this.abc10038 == null) {
                this.abc10038 = new ArrayList<>();
            }
            i++;
        }
        String[] strArr = this.abc10034;
        if (strArr != null) {
            strArr[0] = "at i";
        }
        this.abc10029 = "19th ce";
    }

    public void hideClippingLayout() {
        this.isShowClippingLayout.setValue(Boolean.FALSE);
        if (this.abc10012 > 0.085754335d) {
            this.abc10012 = 0.47596473f;
        }
        if (this.abc1003 < 0) {
            this.abc1003 = 4;
        }
        if (!TextUtils.isEmpty(this.abc1005)) {
            this.abc1005 += this.abc1005.length();
        }
        if (this.abc5 == null) {
            this.abc5 = new String[10];
            if (this.abc10041 == null) {
                this.abc10041 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList = this.abc10022;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10022.remove(0);
            }
            if (this.abc10031 == null) {
                this.abc10031 = new int[10];
            }
        }
        this.abc10020 = !this.abc10020;
        this.abc10032 += 0.4986499949872506d;
        if (TextUtils.isEmpty(this.abc10025)) {
            return;
        }
        this.abc10025 += this.abc10025.length();
    }

    public void hideColorFinderLayout() {
        this.isShowColorFinderLayout.setValue(Boolean.FALSE);
        this.abc10020 = !this.abc10020;
        int[] iArr = this.abc1007;
        int i = 0;
        if (iArr != null) {
            iArr[0] = 3;
        }
        this.abc10017 *= 0.29793768302996815d;
        this.abc3 = !this.abc3;
        if (this.abc10023 == null) {
            this.abc10023 = new String[10];
        }
        this.abc10011 = 5;
        if (this.abc10028 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = this.abc10028;
            if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                return;
            }
            iArr2[i] = 1;
            i++;
        }
    }

    public void hideColorRainbowLayout() {
        this.isShowColorRainbowLayout.setValue(Boolean.FALSE);
        this.abc10033 = 0.29044549392488317d;
        this.abc10040 = 0.020834744f;
        this.abc10017 += 0.8643001569226756d;
        if (!TextUtils.isEmpty(this.abc17)) {
            int length = this.abc17.length();
            this.abc10013 = "you think";
            this.abc10020 = !this.abc10020;
            int[] iArr = this.abc10028;
            if (iArr != null) {
                iArr[8] = 0;
            }
            this.abc17 += length;
            if (this.abc10039 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.abc10039;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            if (this.abc1000 > 0.21956155753875817d) {
                this.abc1000 = 0.6937364033243179d;
            }
            if (this.abc10022 == null) {
                this.abc10022 = new ArrayList<>();
            }
        }
        this.abc1005 = "or ";
        this.abc1009 = !this.abc1009;
        int[] iArr2 = this.abc10028;
        if (iArr2 != null) {
            iArr2[4] = 0;
        }
    }

    public void hideImageLayout() {
        this.isShowImageLayout.setValue(Boolean.FALSE);
        this.abc1000 = 0.16248499208016343d;
        if (this.abc10036 > 0.6351833408504008d) {
            this.abc10036 = 0.4915254421532822d;
        }
        if (this.abc1006 == null) {
            this.abc1006 = new String[10];
        }
        this.abc20 = "de:样式，rect";
        int[] iArr = this.abc1004;
        if (iArr != null) {
            iArr[9] = 5;
        }
        ArrayList<String> arrayList = this.abc10041;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10041.remove(0);
        }
        this.abc1002 = true;
    }

    public void hideLayerList() {
        this.isShowLayer.setValue(Boolean.FALSE);
        if (this.abc10027 > 0.6092127d) {
            this.abc10027 = 0.085773826f;
        }
        if (this.abc10011 < 0) {
            this.abc10011 = 3;
        }
        int i = 0;
        this.abc1002 = false;
        if (!TextUtils.isEmpty(this.abc20)) {
            int length = this.abc20.length();
            if (this.abc10028 == null) {
                this.abc10028 = new int[10];
            }
            this.abc10040 += 0.7500077f;
            if (this.abc10034 != null) {
                while (true) {
                    String[] strArr = this.abc10034;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            this.abc20 += length;
            this.abc10026 = -this.abc10026;
            this.abc10013 = " decade";
            if (!TextUtils.isEmpty(this.abc10025)) {
                this.abc10025 += this.abc10025.length();
            }
        }
        this.abc10032 += 0.6450269052555708d;
        this.abc10033 = 0.47004600016721054d;
        if (TextUtils.isEmpty(this.abc10010)) {
            return;
        }
        this.abc10010 += this.abc10010.length();
    }

    public void hideTextLayout() {
        this.isShowTextLayout.setValue(Boolean.FALSE);
        if (this.abc1004 == null) {
            this.abc1004 = new int[10];
        }
        if (this.abc10031 != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.abc10031;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 5;
                i++;
            }
        }
        if (this.abc10019 > 0.6880481d) {
            this.abc10019 = 0.7500734f;
        }
        if (this.abc5 == null) {
            this.abc5 = new String[10];
            String[] strArr = this.abc1006;
            if (strArr != null) {
                strArr[6] = "ny m";
            }
            this.abc10033 = 0.5623522094944121d;
            if (this.abc10017 < 0.7088023593948605d) {
                this.abc10017 = 0.8674476773353761d;
            }
        }
        int[] iArr2 = this.abc1004;
        if (iArr2 != null) {
            iArr2[3] = 0;
        }
        this.abc10012 = Math.abs(this.abc10012);
        if (this.abc1006 == null) {
            this.abc1006 = new String[10];
        }
    }

    public void initData() {
        this.logoCreateModel = new LogoCreateModel();
        this.abc10012 += 0.951323f;
        this.abc10040 = 0.8929062f;
        ArrayList<String> arrayList = this.abc10030;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10030.remove(0);
        }
        this.abc17 = "夫";
        this.abc1003 *= 7;
        this.abc1000 = 0.7368895803315756d;
        this.abc10014 = ((double) this.abc10014) < 0.5718734d ? 0.4068178f : 0.3686502f;
        this.currentColor.setValue("#FF0000");
        this.abc10032 = this.abc10032 > 0.8396829198866893d ? 0.2604021943888557d : 0.10755893778415337d;
        if (this.abc10026 > 0.6062685453956196d) {
            this.abc10026 = 0.700460925321475d;
        }
        if (this.abc10038 == null) {
            this.abc10038 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList2 = this.abc16;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc16.remove(0);
            this.abc10016 = "osetta St";
            this.abc1001 *= 0.961876595466063d;
            this.abc10021 = 0.59168005f;
        }
        this.abc10021 = Math.abs(this.abc10021);
        this.abc1005 = "Me";
        this.abc10012 = ((double) this.abc10012) < 0.55712974d ? 0.47610998f : 0.08167869f;
        this.finderColor.setValue(Integer.valueOf((int) SupportMenu.CATEGORY_MASK));
        this.abc10032 = 0.268418515566628d;
        if (!TextUtils.isEmpty(this.abc1005)) {
            this.abc1005 += this.abc1005.length();
        }
        if (this.abc10018.size() > 5) {
            this.abc10018.add("d reputati");
        }
        this.abc11 = 0.75635725f;
        this.abc10040 = ((double) this.abc10040) < 0.46877944d ? 0.4716679f : 0.2781341f;
        this.abc10037 = 4;
        this.abc1001 = 0.5415984966778102d;
        this.listImageFilling.setValue(this.logoCreateModel.m421e());
        if (this.abc10031 == null) {
            this.abc10031 = new int[10];
        }
        this.abc10019 = 0.2614113f;
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        this.abc4 = "高斯模糊";
        this.abc10020 = false;
        ArrayList<String> arrayList3 = this.abc10030;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc10030.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc1005)) {
            this.abc1005 += this.abc1005.length();
        }
        this.listBgColor.setValue(this.logoCreateModel.m422d());
        this.abc10020 = !this.abc10020;
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        if (!TextUtils.isEmpty(this.abc10024)) {
            this.abc10024 += this.abc10024.length();
        }
        ArrayList<String> arrayList4 = this.abc14;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc14.remove(0);
            this.abc10032 = Math.abs(this.abc10032);
            this.abc10013 = "nd th";
            ArrayList<Integer> arrayList5 = this.abc10038;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc10038.remove(0);
            }
        }
        this.abc10036 = 0.8530297978727506d;
        if (this.abc10023 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc10023;
                if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        if (this.abc10041 == null) {
            this.abc10041 = new ArrayList<>();
        }
        List<String> m424b = this.logoCreateModel.m424b();
        this.abc10020 = !this.abc10020;
        if (!TextUtils.isEmpty(this.abc10016)) {
            this.abc10016 += this.abc10016.length();
        }
        this.abc10036 = 0.4179825182733077d;
        if (this.abc19 > 0.1587053d) {
            this.abc19 = 0.55283517f;
            if (!TextUtils.isEmpty(this.abc10024)) {
                this.abc10024 += this.abc10024.length();
            }
            if (this.abc10033 < 0.8707962062386921d) {
                this.abc10033 = 0.06672918275731021d;
            }
            if (this.abc1006 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.abc1006;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
        }
        this.abc10011 = this.abc10011 > 9 ? 4 : 6;
        String[] strArr3 = this.abc10039;
        if (strArr3 != null) {
            strArr3[7] = null;
        }
        this.abc1003 = 4;
        this.listFont.setValue(m424b);
        if (this.abc1004 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.abc1004;
                if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i3] = 5;
                i3++;
            }
        }
        ArrayList<Integer> arrayList6 = this.abc10022;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc10022.remove(0);
        }
        int[] iArr2 = this.abc1004;
        if (iArr2 != null) {
            iArr2[3] = 6;
        }
        this.abc4 = "的作文题目是：假设你";
        this.abc10010 = " moder";
        if (this.abc10031 == null) {
            this.abc10031 = new int[10];
        }
        this.abc10026 = this.abc10026 < 0.6030061510597371d ? 0.6704558405538776d : 0.8207046984434622d;
        this.listTextColor.setValue(this.logoCreateModel.m423c());
        this.abc10020 = true;
        if (!TextUtils.isEmpty(this.abc10024)) {
            this.abc10024 += this.abc10024.length();
        }
        if (this.abc10017 < 0.6581021449614728d) {
            this.abc10017 = 0.9663787049412753d;
        }
        this.abc18 = true;
        if (!TextUtils.isEmpty(this.abc1005)) {
            this.abc1005 += this.abc1005.length();
        }
        this.abc1001 -= 0.27017842494148714d;
        this.abc10027 = 0.090453506f;
        this.listClipping.setValue(this.logoCreateModel.m425a());
        this.abc10020 = false;
        this.abc10026 *= 0.4583716505092966d;
        this.abc10033 = this.abc10033 < 0.20911752269666806d ? 0.3915824523040753d : 0.43942159478928067d;
        this.abc12 = "lur_mo";
        ArrayList<Integer> arrayList7 = this.abc10038;
        if (arrayList7 == null && arrayList7.size() > 0) {
            this.abc10038.remove(0);
        }
        this.abc1008 *= 0.28509653f;
        this.abc10036 = -this.abc10036;
    }

    public void setClippingSelectedIndex(int i) {
        this.clippingSelectedIndex.setValue(Integer.valueOf(i));
        if (this.abc10018 == null) {
            this.abc10018 = new ArrayList<>();
        }
        if (this.abc10014 < 0.94533753d) {
            this.abc10014 = 0.4865073f;
        }
        this.abc10024 = "a bo";
        if (!TextUtils.isEmpty(this.abc20)) {
            int length = this.abc20.length();
            this.abc1009 = true;
            this.abc1001 += 0.9808849930027019d;
            this.abc10036 = Math.abs(this.abc10036);
            this.abc20 += length;
            if (!TextUtils.isEmpty(this.abc10013)) {
                this.abc10013 += this.abc10013.length();
            }
            int[] iArr = this.abc1004;
            if (iArr != null) {
                iArr[9] = 0;
            }
            int[] iArr2 = this.abc1007;
            if (iArr2 != null) {
                iArr2[3] = 0;
            }
        }
        ArrayList<String> arrayList = this.abc10041;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10041.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc10025)) {
            this.abc10025 += this.abc10025.length();
        }
        this.abc10020 = !this.abc10020;
    }

    public void setCurrentColor(String str) {
        this.currentColor.setValue(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.abc1003;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i2 >= i3) {
                break;
            }
            this.abc10032 = 0.7308172147165949d;
            i2++;
        }
        this.abc10017 = 0.7685641691475004d;
        this.abc10037 = 2;
        this.abc12 = "毛玻璃(高";
        this.abc10020 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new String[10];
        }
        while (true) {
            int i4 = this.abc10037;
            if (i4 > 3) {
                i4 = 3;
            }
            if (i >= i4) {
                return;
            }
            if (this.abc10034 == null) {
                this.abc10034 = new String[10];
            }
            i++;
        }
    }

    public void setListLayer(List<LogoBaseSaveEntity> list) {
        this.listLayer.setValue(list);
        if (this.abc10035 == null) {
            this.abc10035 = new ArrayList<>();
        }
        this.abc10032 += 0.6801564665003647d;
        this.abc1 -= 0.590033f;
        this.abc10027 *= 0.64902824f;
        this.abc10010 = "Pride and ";
        this.abc10019 *= 0.17938393f;
    }

    public void showBackgroundLayout() {
        this.isShowBackground.setValue(Boolean.TRUE);
        this.abc10012 = Math.abs(this.abc10012);
        if (this.abc10023 == null) {
            this.abc10023 = new String[10];
        }
        String[] strArr = this.abc10034;
        if (strArr != null) {
            strArr[6] = "eived w";
        }
        if (!TextUtils.isEmpty(this.abc17)) {
            int length = this.abc17.length();
            this.abc10027 = ((double) this.abc10027) > 0.74444723d ? 0.521058f : 0.006183088f;
            this.abc10015 = "ull";
            this.abc1005 = "the early ";
            this.abc17 += length;
            if (this.abc10036 < 0.7020509794791621d) {
                this.abc10036 = 0.34379705011471573d;
            }
            this.abc1000 = 0.003596598994145994d;
            ArrayList<String> arrayList = this.abc10030;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc10030.remove(0);
            }
        }
        this.abc10011 += 8;
        this.abc10015 = "e forced ";
        this.abc10017 *= 0.21233252022599414d;
    }

    public void showClippingLayout() {
        this.isShowClippingLayout.setValue(Boolean.TRUE);
        if (this.abc10022.size() < 4) {
            this.abc10022.add(5);
        }
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
        this.abc10020 = !this.abc10020;
        this.abc3 = !this.abc3;
        this.abc10021 = 0.8457339f;
        this.abc10026 = -this.abc10026;
        this.abc10017 = 3.182755108886992E-4d;
    }

    public void showColorFinderLayout() {
        this.isShowColorFinderLayout.setValue(Boolean.TRUE);
        String[] strArr = this.abc10034;
        if (strArr != null) {
            strArr[7] = "rn novels";
        }
        this.abc10040 = Math.abs(this.abc10040);
        String[] strArr2 = this.abc10034;
        if (strArr2 != null) {
            strArr2[8] = null;
        }
        this.abc2 = !this.abc2;
        int[] iArr = this.abc1004;
        if (iArr != null) {
            iArr[4] = 8;
        }
        String[] strArr3 = this.abc10023;
        if (strArr3 != null) {
            strArr3[3] = null;
        }
        this.abc10020 = !this.abc10020;
    }

    public void showColorRainbowLayout() {
        this.isShowColorRainbowLayout.setValue(Boolean.TRUE);
        if (!TextUtils.isEmpty(this.abc10024)) {
            this.abc10024 += this.abc10024.length();
        }
        this.abc10010 = "mode";
        this.abc10040 = 0.22974116f;
        this.abc0 = Math.abs(this.abc0);
        this.abc10015 = "b";
        this.abc10016 = "ou ";
        if (this.abc1003 < 0) {
            this.abc1003 = 8;
        }
    }

    public void showImageLayout() {
        this.isShowImageLayout.setValue(Boolean.TRUE);
        this.abc10019 += 0.4247507f;
        if (this.abc1008 > 0.3261174d) {
            this.abc1008 = 0.5073346f;
        }
        if (this.abc10022.size() < 1) {
            this.abc10022.add(5);
        }
        if (this.abc5 == null) {
            this.abc5 = new String[10];
            int[] iArr = this.abc10028;
            if (iArr != null) {
                iArr[5] = 5;
            }
            this.abc10011 = 6;
            this.abc10033 = -this.abc10033;
        }
        if (this.abc10038.size() < 0) {
            this.abc10038.add(7);
        }
        if (this.abc10041 == null) {
            this.abc10041 = new ArrayList<>();
        }
        this.abc10033 = this.abc10033 > 0.6419137567134727d ? 0.32194712403744485d : 0.5504210658528259d;
    }

    public void showLayerList() {
        this.isShowLayer.setValue(Boolean.TRUE);
        if (this.abc10021 > 0.44368386d) {
            this.abc10021 = 0.91923136f;
        }
        if (!TextUtils.isEmpty(this.abc10010)) {
            this.abc10010 += this.abc10010.length();
        }
        this.abc10015 = "ell o";
        int i = 0;
        if (this.abc15 == null) {
            this.abc15 = new ArrayList<>();
            ArrayList<Integer> arrayList = this.abc10035;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc10035.remove(0);
            }
            this.abc1008 = ((double) this.abc1008) > 0.55061686d ? 0.75977147f : 0.79264486f;
            this.abc10029 = "iment is";
        }
        if (this.abc10039 != null) {
            while (true) {
                String[] strArr = this.abc10039;
                if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        this.abc10014 = ((double) this.abc10014) < 0.11595088d ? 0.46835852f : 0.7977209f;
        this.abc10032 = 0.5899354529108122d;
    }

    public void showTextLayout() {
        this.isShowTextLayout.setValue(Boolean.TRUE);
        String[] strArr = this.abc10034;
        if (strArr != null) {
            strArr[2] = "haracters ";
        }
        ArrayList<Integer> arrayList = this.abc10038;
        int i = 0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10038.remove(0);
        }
        if (this.abc10018.size() < 1) {
            this.abc10018.add("il you ");
        }
        if (!TextUtils.isEmpty(this.abc20)) {
            int length = this.abc20.length();
            if (this.abc1004 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.abc1004;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 5;
                    i2++;
                }
            }
            if (this.abc10034 != null) {
                while (true) {
                    String[] strArr2 = this.abc10034;
                    if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    i++;
                }
            }
            if (!TextUtils.isEmpty(this.abc1005)) {
                this.abc1005 += this.abc1005.length();
            }
            this.abc20 += length;
            this.abc10037 = -this.abc10037;
            if (!TextUtils.isEmpty(this.abc10024)) {
                this.abc10024 += this.abc10024.length();
            }
            this.abc10027 = ((double) this.abc10027) < 0.6113096d ? 0.9474685f : 0.35696357f;
        }
        if (!TextUtils.isEmpty(this.abc10013)) {
            this.abc10013 += this.abc10013.length();
        }
        this.abc10010 = "t i";
        if (this.abc1003 < 0) {
            this.abc1003 = 5;
        }
    }
}
