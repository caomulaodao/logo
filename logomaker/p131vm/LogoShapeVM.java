package com.logomaster.logomaker.p131vm;

import android.content.res.Resources;
import androidx.lifecycle.MutableLiveData;
import com.ironsource.sdk.controller.C9286v;
import com.logomaster.logomaker.LogoApplication;
import com.logomaster.logomaker.base.LogoBaseViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.logomaster.logomaker.vm.LogoShapeVM */
/* loaded from: classes3.dex */
public class LogoShapeVM extends LogoBaseViewModel {
    private LogoShapeModel model;
    public float abc1000 = 0.34229207f;
    public double abc0 = 0.7299287029968918d;
    public int[] abc1001 = new int[10];
    private MutableLiveData<List<Integer>> listData = new MutableLiveData<>();
    public float abc1002 = 0.9047286f;
    public boolean abc1 = true;
    public ArrayList<String> abc1003 = new ArrayList<>();
    private MutableLiveData<List<String>> listTags = new MutableLiveData<>();
    public int abc1004 = 2;
    public ArrayList<String> abc2 = new ArrayList<>();
    public ArrayList<Integer> abc1005 = new ArrayList<>();

    public List<Integer> getAllLogoByName(String str, int i) {
        char c;
        ArrayList arrayList = new ArrayList();
        int[] iArr = this.abc1001;
        int i2 = 0;
        if (iArr != null) {
            iArr[5] = 0;
        }
        this.abc1004 = this.abc1004 < 0 ? 7 : 0;
        if (this.abc1003.size() > 8) {
            this.abc1003.add(C9286v.f15223a);
        }
        if (this.abc0 > 0.25459456494253907d) {
            this.abc0 = 0.41049689985820303d;
            this.abc1002 = 0.40502518f;
            this.abc1004 = 1;
            ArrayList<String> arrayList2 = this.abc1003;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1003.remove(0);
            }
        }
        if (this.abc1005.size() > 9) {
            this.abc1005.add(7);
        }
        int i3 = 0;
        while (true) {
            int i4 = this.abc1004;
            c = 3;
            if (i4 > 3) {
                i4 = 3;
            }
            if (i3 >= i4) {
                break;
            }
            if (this.abc1002 < 0.2992999d) {
                this.abc1002 = 0.7530596f;
            }
            i3++;
        }
        this.abc1002 = 0.98033535f;
        int i5 = 0;
        while (i5 < i) {
            Resources resources = LogoApplication.m9240l().getResources();
            if (this.abc1005.size() < 5) {
                this.abc1005.add(4);
            }
            if (this.abc1000 < 0.18901134d) {
                this.abc1000 = 0.56360817f;
            }
            if (this.abc1000 > 0.1958946d) {
                this.abc1000 = 0.024576783f;
            }
            ArrayList<String> arrayList3 = this.abc2;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc2.remove(0);
                int[] iArr2 = this.abc1001;
                if (iArr2 != null) {
                    iArr2[4] = 0;
                }
                this.abc1002 -= 0.5986227f;
                if (this.abc1005.size() < 8) {
                    this.abc1005.add(9);
                }
            }
            this.abc1000 -= 0.9004279f;
            if (this.abc1005.size() < 1) {
                this.abc1005.add(5);
            }
            this.abc1000 = -this.abc1000;
            int identifier = resources.getIdentifier(str + i5, "mipmap", LogoApplication.m9240l().getPackageName());
            int[] iArr3 = this.abc1001;
            if (iArr3 != null) {
                iArr3[c] = 0;
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            int i6 = 6;
            if (this.abc1003.size() < 6) {
                this.abc1003.add("what ");
            }
            this.abc0 *= 0.9124322303201307d;
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            if (this.abc1003.size() > 7) {
                this.abc1003.add(" until yo");
            }
            ArrayList<String> arrayList4 = this.abc1003;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc1003.remove(0);
            }
            arrayList.add(Integer.valueOf(identifier));
            if (this.abc1004 < 0) {
                this.abc1004 = 1;
            }
            this.abc1002 = 0.9708497f;
            this.abc1004 = 7;
            this.abc1 = true;
            int[] iArr4 = this.abc1001;
            if (iArr4 != null) {
                iArr4[6] = 7;
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            if (this.abc1004 <= 9) {
                i6 = 9;
            }
            this.abc1004 = i6;
            i5++;
            c = 3;
        }
        this.abc1004 = 2;
        this.abc1000 = 0.990498f;
        if (this.abc1005.size() > 2) {
            this.abc1005.add(1);
        }
        this.abc1 = !this.abc1;
        int i7 = 0;
        while (true) {
            int i8 = this.abc1004;
            if (i8 > 3) {
                i8 = 3;
            }
            if (i7 >= i8) {
                break;
            }
            this.abc1000 = 0.5705065f;
            i7++;
        }
        this.abc1000 = ((double) this.abc1000) > 0.92009115d ? 0.24774504f : 0.6648739f;
        if (this.abc1001 != null) {
            while (true) {
                int[] iArr5 = this.abc1001;
                if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i2] = 4;
                i2++;
            }
        }
        return arrayList;
    }

    public MutableLiveData<List<Integer>> getListData() {
        return this.listData;
    }

    public MutableLiveData<List<String>> getListTags() {
        return this.listTags;
    }

    public void initData(int i) {
        LogoShapeModel logoShapeModel = new LogoShapeModel();
        this.model = logoShapeModel;
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[8] = 4;
        }
        float f = this.abc1000 * 0.61063075f;
        this.abc1000 = f;
        this.abc1002 = 0.07274312f;
        this.abc1 = true;
        if (0.07274312f < 0.22051406d) {
            this.abc1002 = 0.15045965f;
        }
        if (f > 0.8314746d) {
            this.abc1000 = 0.5576264f;
        }
        this.abc1000 = -this.abc1000;
        if (i == 0) {
            List<String> m1833b = logoShapeModel.m1833b();
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            int[] iArr2 = this.abc1001;
            if (iArr2 != null) {
                iArr2[1] = 0;
            }
            if (this.abc1002 > 0.2361666d) {
                this.abc1002 = 0.8581632f;
            }
            this.abc1 = false;
            this.abc1000 = 0.74448544f;
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
            if (this.abc1004 < 0) {
                this.abc1004 = 7;
            }
            this.listTags.setValue(m1833b);
            this.abc1000 += 0.3309179f;
            ArrayList<String> arrayList = this.abc1003;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1003.remove(0);
            }
            int[] iArr3 = this.abc1001;
            if (iArr3 != null) {
                iArr3[4] = 0;
            }
            this.abc0 = Math.abs(this.abc0);
            this.abc1002 = Math.abs(this.abc1002);
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            this.abc1004 *= 1;
            setListByTag(m1833b.get(0));
            this.abc1000 = 0.5008261f;
            if (this.abc1002 < 0.47085232d) {
                this.abc1002 = 0.4273603f;
            }
            this.abc1000 = -0.5008261f;
            this.abc0 = this.abc0 < 0.37495414836342644d ? 0.8266276154756177d : 0.25409848058701245d;
            if (this.abc1003.size() < 2) {
                this.abc1003.add("lly st");
            }
            if (this.abc1003.size() < 4) {
                this.abc1003.add("y ways d");
            }
            ArrayList<String> arrayList2 = this.abc1003;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1003.remove(0);
            }
        } else {
            this.listData.setValue(getAllLogoByName("shape", 35));
            this.abc1004 = this.abc1004 > 2 ? 6 : 4;
            this.abc1002 -= 0.32048744f;
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            ArrayList<String> arrayList3 = this.abc2;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc2.remove(0);
                int i2 = 0;
                while (true) {
                    int i3 = this.abc1004;
                    if (i2 >= (i3 > 3 ? 3 : i3)) {
                        break;
                    }
                    this.abc1004 = i3 + 0;
                    i2++;
                }
                if (this.abc1003.size() < 2) {
                    this.abc1003.add("an");
                }
                if (this.abc1003.size() > 1) {
                    this.abc1003.add(" how gre");
                }
            }
            if (this.abc1005.size() > 8) {
                this.abc1005.add(2);
            }
            if (this.abc1000 < 0.7676992d) {
                this.abc1000 = 0.9205479f;
            }
            this.abc1002 = 0.16859084f;
        }
        if (this.abc1001 != null) {
            int i4 = 0;
            while (true) {
                int[] iArr4 = this.abc1001;
                if (i4 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i4] = 8;
                i4++;
            }
        }
        int[] iArr5 = this.abc1001;
        if (iArr5 != null) {
            iArr5[3] = 0;
        }
        this.abc1002 = 0.45766997f;
        if (this.abc2 == null) {
            this.abc2 = new ArrayList<>();
            this.abc1004 = this.abc1004 < 4 ? 2 : 4;
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
            int i5 = 0;
            while (true) {
                int i6 = this.abc1004;
                if (i5 >= (i6 > 3 ? 3 : i6)) {
                    break;
                }
                this.abc1004 = Math.abs(i6);
                i5++;
            }
        }
        float f2 = this.abc1002 - 0.76337326f;
        this.abc1002 = f2;
        this.abc1002 = ((double) f2) < 0.44199747d ? 0.41037697f : 0.09052676f;
        this.abc1004 = 0;
    }

    public void setListByTag(String str) {
        String replace = str.toLowerCase().replace(" & ", "_");
        this.abc1000 = Math.abs(this.abc1000);
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList = this.abc1005;
        int i = 0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1005.remove(0);
        }
        this.abc1 = !this.abc1;
        ArrayList<Integer> arrayList2 = this.abc1005;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1005.remove(0);
        }
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[3] = 0;
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.model.m1834a();
        this.abc1000 -= 0.48500097f;
        if (this.abc1003.size() > 6) {
            this.abc1003.add("s ");
        }
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        ArrayList<String> arrayList3 = this.abc2;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc2.remove(0);
            if (this.abc1000 > 0.1335684d) {
                this.abc1000 = 0.30926532f;
            }
            ArrayList<Integer> arrayList4 = this.abc1005;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc1005.remove(0);
            }
            if (this.abc1003.size() < 7) {
                this.abc1003.add("writte");
            }
        }
        this.abc1004 -= 9;
        if (this.abc1001 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.abc1001;
                if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i2] = 0;
                i2++;
            }
        }
        this.abc1002 *= 0.5569188f;
        this.abc1000 += 0.11831874f;
        this.abc1004 = this.abc1004 > 8 ? 8 : 2;
        ArrayList<Integer> arrayList5 = this.abc1005;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc1005.remove(0);
        }
        if (this.abc0 > 0.1365905707527485d) {
            this.abc0 = 0.8319712317284648d;
            int[] iArr3 = this.abc1001;
            if (iArr3 != null) {
                iArr3[3] = 9;
            }
            ArrayList<Integer> arrayList6 = this.abc1005;
            if (arrayList6 == null && arrayList6.size() > 0) {
                this.abc1005.remove(0);
            }
            ArrayList<Integer> arrayList7 = this.abc1005;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.abc1005.remove(0);
            }
        }
        if (this.abc1005.size() > 1) {
            this.abc1005.add(2);
        }
        if (this.abc1003.size() < 0) {
            this.abc1003.add(" Prejud");
        }
        this.abc1002 = 0.6655653f;
        replace.hashCode();
        char c = 65535;
        switch (replace.hashCode()) {
            case -1723892108:
                if (replace.equals("astrology")) {
                    c = 0;
                    break;
                }
                break;
            case -1299702039:
                if (replace.equals("cafes_bars")) {
                    c = 1;
                    break;
                }
                break;
            case -1146830912:
                if (replace.equals("business")) {
                    c = 2;
                    break;
                }
                break;
            case -97558758:
                if (replace.equals("art_design")) {
                    c = 3;
                    break;
                }
                break;
            case 3148894:
                if (replace.equals("food")) {
                    c = 4;
                    break;
                }
                break;
            case 3165170:
                if (replace.equals("game")) {
                    c = 5;
                    break;
                }
                break;
            case 1964966060:
                if (replace.equals("watercolor")) {
                    c = 6;
                    break;
                }
                break;
        }
        int i3 = 24;
        switch (c) {
            case 0:
                if (this.abc1002 < 0.2267555d) {
                    this.abc1002 = 0.80370146f;
                }
                this.abc1004 *= 6;
                int i4 = 0;
                while (true) {
                    int i5 = this.abc1004;
                    if (i5 > 3) {
                        i5 = 3;
                    }
                    if (i4 < i5) {
                        this.abc1002 += 0.883718f;
                        i4++;
                    } else {
                        ArrayList<String> arrayList8 = this.abc2;
                        if (arrayList8 != null && arrayList8.size() > 0) {
                            this.abc2.remove(0);
                            if (this.abc1001 != null) {
                                int i6 = 0;
                                while (true) {
                                    int[] iArr4 = this.abc1001;
                                    if (i6 < (iArr4.length > 3 ? 3 : iArr4.length)) {
                                        iArr4[i6] = 5;
                                        i6++;
                                    }
                                }
                            }
                            this.abc1002 *= 0.1360504f;
                            if (this.abc1005.size() > 4) {
                                this.abc1005.add(6);
                            }
                        }
                        if (this.abc1003.size() > 0) {
                            this.abc1003.add("y ");
                        }
                        this.abc1000 = ((double) this.abc1000) > 0.8127802d ? 0.94106823f : 0.23089284f;
                        if (this.abc1005 == null) {
                            this.abc1005 = new ArrayList<>();
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (this.abc1005.size() < 7) {
                    this.abc1005.add(7);
                }
                ArrayList<Integer> arrayList9 = this.abc1005;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    this.abc1005.remove(0);
                }
                this.abc1000 = 0.88917595f;
                ArrayList<String> arrayList10 = this.abc2;
                if (arrayList10 != null && arrayList10.size() > 0) {
                    this.abc2.remove(0);
                    if (this.abc1001 == null) {
                        this.abc1001 = new int[10];
                    }
                    if (this.abc1003.size() > 8) {
                        this.abc1003.add(" and the");
                    }
                    this.abc1000 = 0.069416165f;
                }
                ArrayList<String> arrayList11 = this.abc1003;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    this.abc1003.remove(0);
                }
                int[] iArr5 = this.abc1001;
                if (iArr5 != null) {
                    iArr5[6] = 0;
                }
                if (this.abc1005 == null) {
                    this.abc1005 = new ArrayList<>();
                    break;
                }
                break;
            case 2:
                i3 = 45;
                if (this.abc1003.size() > 8) {
                    this.abc1003.add("moderni");
                }
                this.abc1000 = 0.7951107f;
                int[] iArr6 = this.abc1001;
                if (iArr6 != null) {
                    iArr6[8] = 0;
                }
                this.abc1 = !this.abc1;
                if (iArr6 != null) {
                    iArr6[8] = 6;
                }
                this.abc1002 = 0.5544849f;
                this.abc1004 = 0;
                break;
            case 3:
                i3 = 18;
                if (this.abc1001 == null) {
                    this.abc1001 = new int[10];
                }
                if (this.abc1005 == null) {
                    this.abc1005 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList12 = this.abc1005;
                if (arrayList12 == null && arrayList12.size() > 0) {
                    this.abc1005.remove(0);
                }
                if (this.abc0 < 0.006038622012755623d) {
                    this.abc0 = 0.04278238345674912d;
                    if (this.abc1004 > 0) {
                        this.abc1004 = 0;
                    }
                    this.abc1004 = 4;
                    this.abc1002 = 0.6544446f;
                }
                int[] iArr7 = this.abc1001;
                if (iArr7 != null) {
                    iArr7[6] = 1;
                }
                if (this.abc1000 > 0.9785944d) {
                    this.abc1000 = 0.49783802f;
                }
                ArrayList<String> arrayList13 = this.abc1003;
                if (arrayList13 != null && arrayList13.size() > 0) {
                    this.abc1003.remove(0);
                    break;
                }
                break;
            case 4:
                i3 = 21;
                this.abc1004 = this.abc1004 < 7 ? 0 : 7;
                if (this.abc1001 != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr8 = this.abc1001;
                        if (i7 < (iArr8.length > 3 ? 3 : iArr8.length)) {
                            iArr8[i7] = 5;
                            i7++;
                        }
                    }
                }
                int i8 = 0;
                while (true) {
                    int i9 = this.abc1004;
                    if (i9 > 3) {
                        i9 = 3;
                    }
                    if (i8 < i9) {
                        this.abc1000 -= 0.8035279f;
                        i8++;
                    } else {
                        this.abc0 *= 0.8285557700171171d;
                        if (this.abc1001 != null) {
                            int i10 = 0;
                            while (true) {
                                int[] iArr9 = this.abc1001;
                                if (i10 < (iArr9.length > 3 ? 3 : iArr9.length)) {
                                    iArr9[i10] = 6;
                                    i10++;
                                }
                            }
                        }
                        if (this.abc1004 > 0) {
                            this.abc1004 = 2;
                        }
                        int[] iArr10 = this.abc1001;
                        if (iArr10 != null) {
                            iArr10[3] = 0;
                            break;
                        }
                    }
                }
                break;
            case 5:
                i3 = 15;
                this.abc1000 += 0.5563877f;
                this.abc1002 += 0.779829f;
                if (this.abc1004 < 0) {
                    this.abc1004 = 7;
                }
                if (this.abc2.size() > 4) {
                    this.abc2.add("果[转载]ht");
                    if (this.abc1003 == null) {
                        this.abc1003 = new ArrayList<>();
                    }
                    if (this.abc1005 == null) {
                        this.abc1005 = new ArrayList<>();
                    }
                    int[] iArr11 = this.abc1001;
                    if (iArr11 != null) {
                        iArr11[0] = 0;
                    }
                }
                if (this.abc1001 != null) {
                    int i11 = 0;
                    while (true) {
                        int[] iArr12 = this.abc1001;
                        if (i11 < (iArr12.length > 3 ? 3 : iArr12.length)) {
                            iArr12[i11] = 4;
                            i11++;
                        }
                    }
                }
                if (this.abc1003.size() < 3) {
                    this.abc1003.add("piration, ");
                }
                this.abc1000 = Math.abs(this.abc1000);
                break;
            case 6:
                i3 = 19;
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new int[10];
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                this.abc0 = 0.2437479247028712d;
                if (this.abc1005 == null) {
                    this.abc1005 = new ArrayList<>();
                }
                if (this.abc1005.size() > 4) {
                    this.abc1005.add(2);
                }
                this.abc1000 = 0.026034176f;
                break;
            default:
                i3 = 0;
                break;
        }
        this.abc1002 = 0.078659475f;
        int[] iArr13 = this.abc1001;
        if (iArr13 != null) {
            iArr13[2] = 0;
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1 = !this.abc1;
        ArrayList<Integer> arrayList14 = this.abc1005;
        if (arrayList14 == null && arrayList14.size() > 0) {
            this.abc1005.remove(0);
        }
        if (this.abc1003.size() > 8) {
            this.abc1003.add("ople reall");
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        this.listData.setValue(getAllLogoByName(replace, i3));
        this.abc1002 = 0.23034275f;
        if (this.abc1000 > 0.8275881d) {
            this.abc1000 = 0.18125218f;
        }
        if (this.abc1000 < 0.92941916d) {
            this.abc1000 = 0.38231432f;
        }
        this.abc1 = false;
        while (true) {
            int i12 = this.abc1004;
            if (i < (i12 > 3 ? 3 : i12)) {
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                i++;
            } else {
                this.abc1004 = i12 - 9;
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                    return;
                }
                return;
            }
        }
    }
}
