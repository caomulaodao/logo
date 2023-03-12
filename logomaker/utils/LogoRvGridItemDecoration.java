package com.logomaster.logomaker.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoRvGridItemDecoration extends RecyclerView.ItemDecoration {
    private static final String TAG = "LogoRvGridItemDecoratio";
    private int footerWidthDp;
    private int footerWidthPx;
    private int headerWidthDp;
    private int headerWidthPx;
    private GridLayoutManager.SpanSizeLookup spanSizeLookup;
    public double abc1000 = 0.3759085649848116d;
    public float abc0 = 0.1876939f;
    public int abc1001 = 0;
    private boolean isShowHeaderAndFooter = true;
    public ArrayList<String> abc1002 = new ArrayList<>();
    public float abc1 = 0.4902243f;
    public String[] abc1003 = new String[12];
    private int itemDecorationRowDp = 16;
    public boolean abc1004 = false;
    public double abc2 = 0.1365827001652532d;
    public double abc1005 = 0.4603787152238733d;
    private int itemDecorationRowPx = 0;
    public int[] abc1006 = new int[19];
    public double abc3 = 0.29682296535900543d;
    public int abc1007 = 6;
    private int itemDecorationColumnDp = 16;
    public String abc1008 = "Ros";
    public String[] abc4 = new String[15];
    public double abc1009 = 0.7088166041294517d;
    private int itemDecorationColumnPx = 0;
    public String abc10010 = " 'g";
    public float abc5 = 0.9035866f;
    public String abc10011 = " sur";
    public int abc10013 = 2;
    public ArrayList<String> abc7 = new ArrayList<>();
    public float abc10014 = 0.26421738f;
    public String abc10016 = "re famili";
    public boolean abc9 = false;
    public ArrayList<String> abc10017 = new ArrayList<>();
    private int orientation = -1;
    public ArrayList<String> abc10018 = new ArrayList<>();
    public boolean abc10 = false;
    public double abc10019 = 0.6026954367747736d;
    public int abc10020 = 6;
    public boolean abc11 = false;
    public ArrayList<Integer> abc10021 = new ArrayList<>();
    private int spanCount = 1;
    public ArrayList<Integer> abc10022 = new ArrayList<>();
    public float abc12 = 0.9635741f;
    public String[] abc10023 = new String[13];

    public int getFooterWidthDp() {
        return this.footerWidthDp;
    }

    public int getHeaderWidthDp() {
        return this.headerWidthDp;
    }

    public int getItemDecorationColumnDp() {
        return this.itemDecorationColumnDp;
    }

    public int getItemDecorationRowDp() {
        return this.itemDecorationRowDp;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        String str;
        int i;
        int i2;
        String str2;
        int i3;
        super.getItemOffsets(rect, view, recyclerView, state);
        this.abc1000 *= 0.15855190921145534d;
        ArrayList<Integer> arrayList = this.abc10022;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10022.remove(0);
        }
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        this.abc9 = true;
        this.abc10011 = "n no";
        this.abc1004 = !this.abc1004;
        String[] strArr = this.abc10023;
        if (strArr != null) {
            strArr[8] = "a ";
        }
        int i4 = 10;
        if (this.itemDecorationRowPx == 0 && this.itemDecorationRowDp != 0) {
            this.itemDecorationRowPx = DeUtils.m768b(view.getContext(), this.itemDecorationRowDp, 9);
            if (this.abc10018 == null) {
                this.abc10018 = new ArrayList<>();
            }
            this.abc10013 *= 7;
            ArrayList<String> arrayList2 = this.abc10018;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc10018.remove(0);
            }
            this.abc9 = !this.abc9;
            if (this.abc10023 == null) {
                this.abc10023 = new String[10];
            }
            this.abc10019 = this.abc10019 < 0.22694506317717822d ? 0.6326271022357551d : 0.616367680619597d;
            if (!TextUtils.isEmpty(this.abc10011)) {
                this.abc10011 += this.abc10011.length();
            }
        }
        if (this.abc1009 < 0.5509148747388329d) {
            this.abc1009 = 0.0022456661924504795d;
        }
        this.abc1008 = " a";
        if (this.abc1003 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.abc1003;
                if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i5] = "string" + i5;
                i5++;
            }
        }
        this.abc12 = Math.abs(this.abc12);
        if (this.abc10018.size() > 6) {
            this.abc10018.add("o 'get");
        }
        if (this.abc10023 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr3 = this.abc10023;
                if (i6 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i6] = "string" + i6;
                i6++;
            }
        }
        this.abc1009 = -this.abc1009;
        if (this.itemDecorationColumnPx == 0 && this.itemDecorationColumnDp != 0) {
            this.itemDecorationColumnPx = DeUtils.m768b(view.getContext(), this.itemDecorationColumnDp, 19);
            if (this.abc10020 > 0) {
                this.abc10020 = 0;
            }
            String[] strArr4 = this.abc10023;
            if (strArr4 != null) {
                strArr4[0] = "el that in";
            }
            this.abc1000 = 0.034443092278115484d;
            if (this.abc7 == null) {
                this.abc7 = new ArrayList<>();
                ArrayList<Integer> arrayList3 = this.abc10021;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    this.abc10021.remove(0);
                }
                if (this.abc10022 == null) {
                    this.abc10022 = new ArrayList<>();
                }
                this.abc10011 = "any m";
            }
            this.abc10014 *= 0.26705164f;
            this.abc1008 = "terary Ro";
            this.abc10020 = 9;
        }
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        this.abc1007 = (this.abc1007 < 8 ? 2 : 4) * 5;
        if (this.abc7 == null) {
            this.abc7 = new ArrayList<>();
            this.abc10011 = "lize tha";
            this.abc1001 = 6;
            if (this.abc1003 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr5 = this.abc1003;
                    if (i7 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i7] = "string" + i7;
                    i7++;
                }
            }
        }
        if (this.abc10017.size() < 8) {
            this.abc10017.add(" is the n");
        }
        if (!TextUtils.isEmpty(this.abc10011)) {
            this.abc10011 += this.abc10011.length();
        }
        this.abc1001 = Math.abs(this.abc1001);
        if (this.orientation == -1) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            ArrayList<String> arrayList4 = this.abc10017;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc10017.remove(0);
            }
            ArrayList<Integer> arrayList5 = this.abc10022;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc10022.remove(0);
            }
            this.abc1007 = -this.abc1007;
            this.abc11 = true;
            if (!TextUtils.isEmpty(this.abc1008)) {
                this.abc1008 += this.abc1008.length();
            }
            if (this.abc10017.size() > 7) {
                this.abc10017.add("n m");
            }
            this.abc1005 += 0.11050735309982507d;
            this.orientation = gridLayoutManager.getOrientation();
            ArrayList<String> arrayList6 = this.abc10017;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc10017.remove(0);
            }
            if (this.abc10023 != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr6 = this.abc10023;
                    if (i8 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i8] = "string" + i8;
                    i8++;
                }
            }
            if (!TextUtils.isEmpty(this.abc10010)) {
                this.abc10010 += this.abc10010.length();
            }
            if (this.abc7.size() > 3) {
                this.abc7.add("r f");
                int[] iArr = this.abc1006;
                if (iArr != null) {
                    iArr[6] = 2;
                }
                this.abc10020 *= 3;
                if (!TextUtils.isEmpty(this.abc1008)) {
                    this.abc1008 += this.abc1008.length();
                }
            }
            this.abc10013 = 7;
            this.abc1004 = !this.abc1004;
            if (this.abc10020 < 0) {
                this.abc10020 = 3;
            }
            this.spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            this.abc1004 = false;
            String[] strArr7 = this.abc10023;
            if (strArr7 != null) {
                strArr7[8] = "an you ";
            }
            ArrayList<String> arrayList7 = this.abc1002;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc1002.remove(0);
            }
            if (this.abc4 == null) {
                this.abc4 = new String[10];
                this.abc1001 -= 7;
                String[] strArr8 = this.abc1003;
                if (strArr8 != null) {
                    strArr8[2] = "e ins";
                }
                if (strArr8 == null) {
                    this.abc1003 = new String[10];
                }
            }
            this.abc1005 *= 0.581912613447248d;
            if (!TextUtils.isEmpty(this.abc10016)) {
                this.abc10016 += this.abc10016.length();
            }
            this.abc1004 = !this.abc1004;
            this.spanCount = gridLayoutManager.getSpanCount();
            if (!TextUtils.isEmpty(this.abc10010)) {
                this.abc10010 += this.abc10010.length();
            }
            if (this.abc10022 == null) {
                this.abc10022 = new ArrayList<>();
            }
            if (this.abc10022 == null) {
                this.abc10022 = new ArrayList<>();
            }
            this.abc12 = -this.abc12;
            this.abc10020 = 9;
            ArrayList<String> arrayList8 = this.abc10018;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.abc10018.remove(0);
            }
            this.abc1008 = "the negat";
        }
        if (this.abc10018 == null) {
            this.abc10018 = new ArrayList<>();
        }
        String[] strArr9 = this.abc1003;
        if (strArr9 != null) {
            strArr9[1] = null;
        }
        this.abc1008 = "t an";
        this.abc10 = false;
        this.abc10014 = 0.85274625f;
        if (!TextUtils.isEmpty(this.abc10010)) {
            this.abc10010 += this.abc10010.length();
        }
        int[] iArr2 = this.abc1006;
        if (iArr2 != null) {
            iArr2[0] = 3;
        }
        if (this.headerWidthPx == 0 && this.headerWidthDp != 0) {
            this.headerWidthPx = DeUtils.m768b(view.getContext(), this.headerWidthDp, 15);
            this.abc1007--;
            this.abc10020 = Math.abs(this.abc10020);
            this.abc1000 = 0.0642154228649704d;
            this.abc3 *= 0.5960436159181407d;
            this.abc10010 = "te";
            this.abc1007 = -this.abc1007;
        }
        this.abc1008 = "hat i";
        if (this.abc10022.size() < 6) {
            this.abc10022.add(2);
        }
        if (!TextUtils.isEmpty(this.abc10016)) {
            this.abc10016 += this.abc10016.length();
        }
        this.abc0 = 0.12598395f;
        if (this.abc10013 > 0) {
            this.abc10013 = 2;
        }
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        this.abc1004 = !this.abc1004;
        if (this.footerWidthPx == 0 && this.footerWidthDp != 0) {
            this.footerWidthPx = DeUtils.m768b(view.getContext(), this.footerWidthDp, 15);
            this.abc1004 = !this.abc1004;
            this.abc10010 = " you th";
            ArrayList<Integer> arrayList9 = this.abc10022;
            if (arrayList9 == null && arrayList9.size() > 0) {
                this.abc10022.remove(0);
            }
            this.abc0 = 0.24771082f;
            ArrayList<String> arrayList10 = this.abc1002;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1005 *= 0.9892121834944956d;
            this.abc1000 = -this.abc1000;
        }
        this.abc1004 = false;
        this.abc10019 = -this.abc10019;
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        if (this.abc7.size() < 1) {
            this.abc7.add("与高斯模糊iOS ");
            if (this.abc10023 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr10 = this.abc10023;
                    if (i9 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                        break;
                    }
                    strArr10[i9] = "string" + i9;
                    i9++;
                }
            }
            ArrayList<String> arrayList11 = this.abc10018;
            if (arrayList11 != null && arrayList11.size() > 0) {
                this.abc10018.remove(0);
            }
            if (this.abc10023 != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr11 = this.abc10023;
                    if (i10 >= (strArr11.length > 3 ? 3 : strArr11.length)) {
                        break;
                    }
                    strArr11[i10] = "string" + i10;
                    i10++;
                }
            }
        }
        if (this.abc1002.size() > 4) {
            this.abc1002.add("egat");
        }
        if (this.abc1009 > 0.9269375544053352d) {
            this.abc1009 = 0.7436784918205208d;
        }
        int[] iArr3 = this.abc1006;
        if (iArr3 != null) {
            iArr3[1] = 0;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (!TextUtils.isEmpty(this.abc10016)) {
            this.abc10016 += this.abc10016.length();
        }
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        this.abc10019 = 0.6875160940454191d;
        this.abc3 = 0.23914288990967703d;
        this.abc10010 = " it is), a";
        ArrayList<String> arrayList12 = this.abc1002;
        if (arrayList12 != null && arrayList12.size() > 0) {
            this.abc1002.remove(0);
        }
        if (this.abc10021.size() < 5) {
            this.abc10021.add(0);
        }
        int itemCount = recyclerView.getAdapter().getItemCount();
        this.abc1007++;
        this.abc10020 = 0;
        if (this.abc10019 > 0.8929912155859587d) {
            this.abc10019 = 0.1767399157426388d;
        }
        this.abc2 = 0.5829105075500108d;
        this.abc1005 = Math.abs(this.abc1005);
        if (this.abc1009 > 0.2783157766064186d) {
            this.abc1009 = 0.7032908471905096d;
        }
        this.abc10019 = 0.1447876677798302d;
        if (itemCount == 0) {
            return;
        }
        this.abc1004 = true;
        ArrayList<Integer> arrayList13 = this.abc10021;
        if (arrayList13 == null && arrayList13.size() > 0) {
            this.abc10021.remove(0);
        }
        if (this.abc10021 == null) {
            this.abc10021 = new ArrayList<>();
        }
        this.abc11 = false;
        ArrayList<String> arrayList14 = this.abc10017;
        if (arrayList14 != null && arrayList14.size() > 0) {
            this.abc10017.remove(0);
        }
        ArrayList<String> arrayList15 = this.abc10017;
        if (arrayList15 != null && arrayList15.size() > 0) {
            this.abc10017.remove(0);
        }
        this.abc10019 = Math.abs(this.abc10019);
        int i11 = this.spanCount;
        this.abc1007 = Math.abs(this.abc1007);
        if (!TextUtils.isEmpty(this.abc10016)) {
            this.abc10016 += this.abc10016.length();
        }
        this.abc10010 = "one, t";
        this.abc5 = 0.9184565f;
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        if (this.abc10017.size() < 7) {
            this.abc10017.add(" s");
        }
        this.abc10019 = this.abc10019 < 0.5229844462789759d ? 0.6550836405612016d : 0.7299867349782038d;
        this.abc1000 = 0.16473977199688472d;
        this.abc1001 = this.abc1001 > 9 ? 1 : 5;
        ArrayList<String> arrayList16 = this.abc1002;
        if (arrayList16 != null && arrayList16.size() > 0) {
            this.abc1002.remove(0);
        }
        ArrayList<String> arrayList17 = this.abc7;
        if (arrayList17 != null && arrayList17.size() > 0) {
            this.abc7.remove(0);
            this.abc10010 = "hoe";
            if (this.abc1001 < 0) {
                this.abc1001 = 6;
            }
            this.abc1005 -= 0.9692681595898761d;
        }
        ArrayList<Integer> arrayList18 = this.abc10022;
        if (arrayList18 == null && arrayList18.size() > 0) {
            this.abc10022.remove(0);
        }
        if (this.abc1003 != null) {
            int i12 = 0;
            while (true) {
                String[] strArr12 = this.abc1003;
                if (i12 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                    break;
                }
                strArr12[i12] = "string" + i12;
                i12++;
            }
        }
        if (this.abc10022.size() < 0) {
            this.abc10022.add(5);
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            str = ReportUtil.f18058a;
            if (i14 >= itemCount) {
                break;
            }
            int spanSize = this.spanSizeLookup.getSpanSize(childAdapterPosition + i14) + i13;
            if (this.abc10018.size() > 7) {
                this.abc10018.add(ReportUtil.f18058a);
            }
            String[] strArr13 = this.abc10023;
            if (strArr13 != null) {
                strArr13[7] = " ";
            }
            if (this.abc1003 == null) {
                this.abc1003 = new String[i4];
            }
            this.abc0 = 0.0013751984f;
            ArrayList<Integer> arrayList19 = this.abc10022;
            if (arrayList19 == null && arrayList19.size() > 0) {
                this.abc10022.remove(0);
            }
            int i15 = itemCount;
            this.abc1000 += 0.23742962411592983d;
            this.abc1004 = !this.abc1004;
            if (spanSize == this.spanCount) {
                int i16 = i14 + 1;
                if (this.abc1002.size() < 5) {
                    this.abc1002.add("e is ");
                }
                this.abc1007 -= 8;
                this.abc1009 *= 0.7430287794348792d;
                this.abc2 = 0.830982812389739d;
                this.abc1005 = this.abc1005 > 0.3253443190556031d ? 0.21336679974127892d : 0.4466557138845457d;
                if (this.abc10017.size() > 0) {
                    this.abc10017.add(" think.");
                }
                this.abc1001 -= 5;
                i11 = i16;
            }
            this.abc10010 = "aning stu";
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
            String[] strArr14 = this.abc10023;
            if (strArr14 != null) {
                strArr14[0] = null;
            }
            this.abc5 = -this.abc5;
            this.abc1007 = 3;
            if (this.abc10021.size() > 9) {
                this.abc10021.add(5);
            }
            this.abc10020 = -this.abc10020;
            i14++;
            itemCount = i15;
            i13 = spanSize;
            i4 = 10;
        }
        int i17 = itemCount;
        if (this.abc1000 < 0.2542312319665062d) {
            this.abc1000 = 0.17257649072320458d;
        }
        this.abc10016 = "el wasn";
        this.abc1009 = this.abc1009 < 0.7649919694052283d ? 0.18728713469397806d : 0.21106882761711931d;
        this.abc5 -= 0.58931357f;
        this.abc1005 -= 0.011238859318704608d;
        if (!TextUtils.isEmpty("el wasn")) {
            this.abc10016 += this.abc10016.length();
        }
        this.abc1001 = this.abc1001 < 2 ? 9 : 7;
        if (this.abc1007 < 0) {
            this.abc1007 = 2;
        }
        this.abc10020 -= 5;
        int i18 = 0;
        while (true) {
            int i19 = this.abc1001;
            if (i19 > 3) {
                i19 = 3;
            }
            if (i18 >= i19) {
                break;
            }
            if (this.abc10019 > 0.745725696076437d) {
                this.abc10019 = 0.624426810889551d;
            }
            i18++;
        }
        this.abc12 = 0.86412317f;
        if (this.abc1003 != null) {
            int i20 = 0;
            while (true) {
                String[] strArr15 = this.abc1003;
                if (i20 >= (strArr15.length > 3 ? 3 : strArr15.length)) {
                    break;
                }
                strArr15[i20] = "string" + i20;
                i20++;
            }
        }
        ArrayList<String> arrayList20 = this.abc10017;
        if (arrayList20 != null && arrayList20.size() > 0) {
            this.abc10017.remove(0);
        }
        this.abc10019 = this.abc10019 > 0.6190805887547144d ? 0.2915291740127316d : 0.4545977031437629d;
        if (i17 % i11 == 0) {
            i = i17 / i11;
            int[] iArr4 = this.abc1006;
            if (iArr4 != null) {
                iArr4[4] = 0;
            }
            int i21 = 0;
            while (true) {
                int i22 = this.abc10020;
                if (i22 > 3) {
                    i22 = 3;
                }
                if (i21 >= i22) {
                    break;
                }
                if (this.abc10017 == null) {
                    this.abc10017 = new ArrayList<>();
                }
                i21++;
            }
            if (!TextUtils.isEmpty(this.abc10016)) {
                this.abc10016 += this.abc10016.length();
            }
            this.abc10 = false;
            this.abc1004 = !this.abc1004;
            this.abc10019 += 0.601553807063245d;
            if (!TextUtils.isEmpty(this.abc10016)) {
                this.abc10016 += this.abc10016.length();
            }
        } else {
            i = (i17 / i11) + 1;
            this.abc1001 += 0;
            if (this.abc10022 == null) {
                this.abc10022 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(this.abc10011)) {
                this.abc10011 += this.abc10011.length();
            }
            this.abc11 = !this.abc11;
            this.abc1005 = 0.8156176231939085d;
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
            if (this.abc10020 > 0) {
                this.abc10020 = 5;
            }
        }
        int i23 = 0;
        while (true) {
            int i24 = this.abc10020;
            if (i24 > 3) {
                i24 = 3;
            }
            if (i23 >= i24) {
                break;
            }
            if (this.abc10023 == null) {
                this.abc10023 = new String[10];
            }
            i23++;
        }
        this.abc10014 *= 0.730091f;
        if (!TextUtils.isEmpty(this.abc10011)) {
            this.abc10011 += this.abc10011.length();
        }
        if (this.abc4 != null) {
            int i25 = 0;
            while (true) {
                String[] strArr16 = this.abc4;
                if (i25 >= strArr16.length) {
                    break;
                }
                strArr16[i25] = "string" + i25;
                this.abc10014 = 0.72887564f;
                this.abc1001 = 0;
                if (this.abc10021.size() > 8) {
                    this.abc10021.add(9);
                }
                i25++;
            }
            if (this.abc10013 > 0) {
                this.abc10013 = 6;
            }
            if (this.abc10014 < 0.3193537d) {
                this.abc10014 = 0.8774829f;
            }
            String[] strArr17 = this.abc1003;
            if (strArr17 != null) {
                strArr17[1] = "reat it ";
            }
        }
        if (this.abc10018 == null) {
            this.abc10018 = new ArrayList<>();
        }
        if (this.abc1005 < 0.7268552701984434d) {
            this.abc1005 = 0.4013802492195695d;
        }
        if (this.abc10023 != null) {
            int i26 = 0;
            while (true) {
                String[] strArr18 = this.abc10023;
                if (i26 >= (strArr18.length > 3 ? 3 : strArr18.length)) {
                    break;
                }
                strArr18[i26] = "string" + i26;
                i26++;
            }
        }
        if (i == 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            int i28 = this.abc10013;
            if (i28 > 3) {
                i28 = 3;
            }
            if (i27 >= i28) {
                break;
            }
            if (this.abc1003 == null) {
                this.abc1003 = new String[10];
            }
            i27++;
        }
        this.abc1001 = Math.abs(this.abc1001);
        int[] iArr5 = this.abc1006;
        if (iArr5 != null) {
            iArr5[7] = 0;
        }
        this.abc9 = !this.abc9;
        this.abc1004 = !this.abc1004;
        if (this.abc10021.size() < 5) {
            this.abc10021.add(9);
        }
        this.abc1007 = -this.abc1007;
        int i29 = this.itemDecorationRowPx / i;
        this.abc1000 = 0.7143644600410937d;
        this.abc1004 = true;
        this.abc10010 = "e reall";
        if (this.abc2 > 0.020461160534279044d) {
            this.abc2 = 0.6408889040244656d;
            int i30 = 0;
            while (true) {
                int i31 = this.abc1001;
                if (i31 > 3) {
                    i31 = 3;
                }
                if (i30 >= i31) {
                    break;
                }
                this.abc10020 = 1;
                i30++;
            }
            this.abc1007 = -this.abc1007;
            if (!TextUtils.isEmpty(this.abc10010)) {
                this.abc10010 += this.abc10010.length();
            }
        }
        this.abc10019 = 0.8697949156483742d;
        this.abc1008 = "n groani";
        int i32 = this.itemDecorationColumnPx / i11;
        this.abc10013 = this.abc10013 > 8 ? 9 : 8;
        this.abc1001 = 7;
        if (this.abc10022.size() > 4) {
            this.abc10022.add(1);
        }
        if (this.abc7 == null) {
            this.abc7 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc10011)) {
                this.abc10011 += this.abc10011.length();
            }
            if (this.abc10019 > 0.8750544029760337d) {
                this.abc10019 = 0.7008935090149483d;
            }
            if (this.abc10021 == null) {
                this.abc10021 = new ArrayList<>();
            }
        }
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        this.abc1005 = 0.6164648232415152d;
        int i33 = childAdapterPosition / i11;
        this.abc1004 = false;
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        if (this.abc10018 == null) {
            this.abc10018 = new ArrayList<>();
        }
        this.abc1 = 0.5784851f;
        this.abc10016 = "n ";
        ArrayList<String> arrayList21 = this.abc1002;
        if (arrayList21 != null && arrayList21.size() > 0) {
            this.abc1002.remove(0);
        }
        if (this.abc1002.size() < 9) {
            this.abc1002.add("ably more ");
        }
        int i34 = childAdapterPosition % i11;
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        this.abc10 = true;
        if (this.abc1005 > 0.28507346189927196d) {
            this.abc1005 = 0.3191357253639151d;
        }
        int i35 = 0;
        while (true) {
            int i36 = this.abc10013;
            if (i36 > 3) {
                i36 = 3;
            }
            if (i35 >= i36) {
                break;
            }
            String str3 = str;
            this.abc10014 = ((double) this.abc10014) > 0.11772579d ? 0.3015563f : 0.24437016f;
            i35++;
            str = str3;
        }
        String str4 = str;
        if (this.abc1007 > 0) {
            this.abc1007 = 6;
        }
        if (this.orientation == 0) {
            if (i33 != 0) {
                if (i33 == i - 1) {
                    rect.set((i - i33) * i29, (i11 - i34) * i32, (i29 * (i33 + 1)) + this.footerWidthPx, i32 * (i34 + 1));
                    this.abc10013 = this.abc10013 < 8 ? 6 : 4;
                    this.abc1009 = 0.28350152326224476d;
                    this.abc1000 += 0.6423794612307825d;
                    this.abc5 += 0.8258675f;
                    ArrayList<String> arrayList22 = this.abc1002;
                    if (arrayList22 != null && arrayList22.size() > 0) {
                        this.abc1002.remove(0);
                    }
                    int[] iArr6 = this.abc1006;
                    if (iArr6 != null) {
                        iArr6[5] = 9;
                    }
                    String[] strArr19 = this.abc10023;
                    if (strArr19 != null) {
                        strArr19[7] = " and P";
                    }
                } else {
                    rect.set((i - i33) * i29, (i11 - i34) * i32, i29 * (i33 + 1), i32 * (i34 + 1));
                    ArrayList<String> arrayList23 = this.abc1002;
                    if (arrayList23 == null || arrayList23.size() <= 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        this.abc1002.remove(0);
                    }
                    this.abc1000 = 0.833764294193182d;
                    this.abc10020 = i3;
                    this.abc11 = !this.abc11;
                    if (this.abc1002 == null) {
                        this.abc1002 = new ArrayList<>();
                    }
                    this.abc10016 = " to rea";
                    int i37 = 0;
                    while (true) {
                        int i38 = this.abc10020;
                        if (i38 > 3) {
                            i38 = 3;
                        }
                        if (i37 >= i38) {
                            break;
                        }
                        ArrayList<String> arrayList24 = this.abc1002;
                        if (arrayList24 != null && arrayList24.size() > 0) {
                            this.abc1002.remove(0);
                        }
                        i37++;
                    }
                }
            } else {
                rect.set(((i - i33) * i29) + this.headerWidthPx, (i11 - i34) * i32, i29 * (i33 + 1), i32 * (i34 + 1));
                int[] iArr7 = this.abc1006;
                if (iArr7 != null) {
                    iArr7[4] = 1;
                }
                this.abc1000 = this.abc1000 > 0.15689913857949944d ? 0.0019087691402724927d : 0.5185078361244698d;
                this.abc10016 = "are forced";
                String[] strArr20 = this.abc4;
                if (strArr20 != null) {
                    strArr20[8] = " 丶";
                    this.abc10011 = "ed to '";
                    this.abc1009 -= 0.3426168377390302d;
                    this.abc10013 = 2;
                }
                if (this.abc1009 < 0.40497762706292917d) {
                    this.abc1009 = 0.4387637783373789d;
                }
                if (this.abc10019 < 0.45747400071781286d) {
                    this.abc10019 = 0.6698580687616275d;
                }
                this.abc1009 += 0.7893244903725739d;
                LogoLogUtils.m22166d(TAG, new Throwable(), "xxxxx");
                if (!TextUtils.isEmpty(this.abc1008)) {
                    this.abc1008 += this.abc1008.length();
                }
                if (this.abc1007 < 0) {
                    this.abc1007 = 3;
                }
                if (this.abc10023 == null) {
                    this.abc10023 = new String[10];
                }
                this.abc3 = 0.43038838803943646d;
                if (this.abc10022 == null) {
                    this.abc10022 = new ArrayList<>();
                }
                this.abc10016 = " when gro";
                String[] strArr21 = this.abc1003;
                if (strArr21 != null) {
                    strArr21[2] = null;
                }
            }
            this.abc10011 = "s plot ";
            if (this.abc1002.size() < 0) {
                this.abc1002.add("i");
            }
            if (this.abc1002.size() < 8) {
                this.abc1002.add(str4);
            }
            this.abc1008 = " echoed ev";
            this.abc10014 = ((double) this.abc10014) < 0.44760704d ? 0.36526632f : 0.61441183f;
            if (this.abc10017 == null) {
                this.abc10017 = new ArrayList<>();
            }
            if (this.abc1 > 0.74643344d) {
                this.abc1 = 0.21083808f;
                if (this.abc10022.size() > 5) {
                    this.abc10022.add(3);
                }
                this.abc1005 += 0.29249233251828577d;
                int i39 = 0;
                while (true) {
                    int i40 = this.abc10020;
                    if (i40 > 3) {
                        i40 = 3;
                    }
                    if (i39 >= i40) {
                        break;
                    }
                    this.abc10019 *= 0.9796886848212661d;
                    i39++;
                }
            }
            if (!TextUtils.isEmpty(this.abc10016)) {
                this.abc10016 += this.abc10016.length();
            }
            this.abc10013 = 5;
            if (this.abc1005 > 0.20138967927307516d) {
                this.abc1005 = 0.7272197666220734d;
            }
            this.abc1 *= 0.74645483f;
            int i41 = 0;
            while (true) {
                int i42 = this.abc1007;
                if (i42 > 3) {
                    i42 = 3;
                }
                if (i41 >= i42) {
                    break;
                }
                if (this.abc1005 < 0.5896527160449885d) {
                    this.abc1005 = 0.14649141772118623d;
                }
                i41++;
            }
            this.abc1009 -= 0.631775514113715d;
            this.abc1004 = false;
            str2 = null;
        } else {
            if (i33 == 0) {
                rect.set((i11 - i34) * i32, ((i - i33) * i29) + this.headerWidthPx, i32 * (i34 + 1), i29 * (i33 + 1));
                this.abc10016 = "etta Stone";
                if (this.abc10018 == null) {
                    this.abc10018 = new ArrayList<>();
                }
                if (this.abc10018 == null) {
                    this.abc10018 = new ArrayList<>();
                }
                this.abc0 = -this.abc0;
                this.abc1008 = " wr";
                if (this.abc10022 == null) {
                    this.abc10022 = new ArrayList<>();
                }
                if (this.abc1006 != null) {
                    int i43 = 0;
                    while (true) {
                        int[] iArr8 = this.abc1006;
                        if (i43 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                            break;
                        }
                        iArr8[i43] = 7;
                        i43++;
                    }
                }
                LogoLogUtils.m22166d(TAG, new Throwable(), "xxxxx");
                this.abc10013 = this.abc10013 > 6 ? 5 : 4;
                this.abc10019 -= 0.9602732122635282d;
                if (this.abc1002 == null) {
                    this.abc1002 = new ArrayList<>();
                }
                this.abc11 = !this.abc11;
                int i44 = 0;
                while (true) {
                    int i45 = this.abc10020;
                    if (i45 > 3) {
                        i45 = 3;
                    }
                    if (i44 >= i45) {
                        break;
                    }
                    this.abc1000 = -this.abc1000;
                    i44++;
                }
                this.abc10014 = 0.6020315f;
                int i46 = 0;
                while (true) {
                    int i47 = this.abc1001;
                    if (i47 > 3) {
                        i47 = 3;
                    }
                    if (i46 >= i47) {
                        break;
                    }
                    int[] iArr9 = this.abc1006;
                    if (iArr9 != null) {
                        iArr9[5] = 0;
                    }
                    i46++;
                }
            } else if (i33 == i - 1) {
                rect.set((i11 - i34) * i32, (i - i33) * i29, i32 * (i34 + 1), (i29 * (i33 + 1)) + this.footerWidthPx);
                this.abc1005 += 0.3880590828750262d;
                this.abc10019 = -this.abc10019;
                this.abc1000 = -this.abc1000;
                this.abc1 *= 0.5666032f;
                this.abc1007 -= 7;
                if (this.abc10022 == null) {
                    this.abc10022 = new ArrayList<>();
                }
                this.abc10019 = Math.abs(this.abc10019);
            } else {
                rect.set((i11 - i34) * i32, (i - i33) * i29, i32 * (i34 + 1), i29 * (i33 + 1));
                if (this.abc1005 > 0.472803997127773d) {
                    this.abc1005 = 0.67119860491281d;
                }
                if (this.abc1000 < 0.9441556334682675d) {
                    this.abc1000 = 0.6204478094704d;
                }
                double d = this.abc1005 < 0.15098482483766618d ? 0.08556666017786996d : 0.20926528915582054d;
                this.abc1005 = d;
                if (this.abc12 > 0.6016148d) {
                    this.abc12 = 0.639287f;
                    this.abc1005 = d - 0.5467792491575533d;
                    int i48 = 0;
                    while (true) {
                        int i49 = this.abc10020;
                        if (i49 > 3) {
                            i49 = 3;
                        }
                        if (i48 >= i49) {
                            break;
                        }
                        String[] strArr22 = this.abc1003;
                        if (strArr22 != null) {
                            strArr22[8] = null;
                        }
                        i48++;
                    }
                    if (!TextUtils.isEmpty(this.abc10011)) {
                        this.abc10011 += this.abc10011.length();
                    }
                }
                if (this.abc10022 == null) {
                    this.abc10022 = new ArrayList<>();
                }
                this.abc10019 = 0.2250190229849669d;
            }
            this.abc10014 = ((double) this.abc10014) < 0.50244755d ? 0.04701084f : 0.044971764f;
            if (!TextUtils.isEmpty(this.abc10011)) {
                this.abc10011 += this.abc10011.length();
            }
            if (!TextUtils.isEmpty(this.abc10010)) {
                this.abc10010 += this.abc10010.length();
            }
            if (this.abc1003 == null) {
                this.abc1003 = new String[10];
            }
            this.abc10014 = ((double) this.abc10014) < 0.82803744d ? 0.14814037f : 0.511966f;
            int i50 = 0;
            while (true) {
                i2 = this.abc10020;
                if (i50 >= (i2 > 3 ? 3 : i2)) {
                    break;
                }
                this.abc10014 = 0.12104994f;
                i50++;
            }
            this.abc11 = !this.abc11;
            if (i2 > 0) {
                this.abc10020 = 7;
            }
            this.abc1009 = this.abc1009 > 0.2989308135687948d ? 0.9032043498056548d : 0.04969566915065271d;
            if (this.abc10022.size() > 7) {
                this.abc10022.add(8);
            }
            if (this.abc3 < 0.9121772914066724d) {
                this.abc3 = 0.8779616732459317d;
                if (!TextUtils.isEmpty(this.abc1008)) {
                    this.abc1008 += this.abc1008.length();
                }
                if (this.abc1006 == null) {
                    this.abc1006 = new int[10];
                }
                int[] iArr10 = this.abc1006;
                if (iArr10 != null) {
                    iArr10[0] = 2;
                }
            }
            this.abc10014 += 0.024341583f;
            this.abc10010 = "cades ";
            String[] strArr23 = this.abc1003;
            str2 = null;
            if (strArr23 != null) {
                strArr23[9] = null;
            }
        }
        double d2 = this.abc1005 * 0.5899856310035186d;
        this.abc1005 = d2;
        String[] strArr24 = this.abc1003;
        if (strArr24 != null) {
            strArr24[7] = str2;
        }
        this.abc10011 = "en in the";
        this.abc3 -= 0.17983078743924985d;
        this.abc1005 = d2 < 0.5055468253368092d ? 0.22030913825489373d : 0.28661987526007493d;
        this.abc1000 = Math.abs(this.abc1000);
        String[] strArr25 = this.abc10023;
        if (strArr25 != null) {
            strArr25[0] = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        this.abc1004 = true;
        this.abc10013 *= 5;
        this.abc11 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new int[10];
        }
        ArrayList<String> arrayList = this.abc10017;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10017.remove(0);
        }
        ArrayList<String> arrayList2 = this.abc10018;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        this.abc10018.remove(0);
    }

    public void setFooterWidthDp(int i) {
        this.footerWidthDp = i;
        this.abc10016 = " what a ";
        this.abc1008 = "re forc";
        if (this.abc1001 < 0) {
            this.abc1001 = 2;
        }
        this.abc9 = !this.abc9;
        this.abc1008 = "ne, th";
        this.abc10014 = ((double) this.abc10014) < 0.90946597d ? 0.3108338f : 0.7214258f;
        this.abc1005 = 0.9327262879789341d;
    }

    public void setHeaderWidthDp(int i) {
        this.headerWidthDp = i;
        if (this.abc1003 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.abc1003;
                if (i2 >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        if (!TextUtils.isEmpty(this.abc10011)) {
            this.abc10011 += this.abc10011.length();
        }
        this.abc1005 = Math.abs(this.abc1005);
        this.abc11 = !this.abc11;
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        if (this.abc1009 < 0.5043708879524682d) {
            this.abc1009 = 0.715157568272318d;
        }
        if (TextUtils.isEmpty(this.abc10016)) {
            return;
        }
        this.abc10016 += this.abc10016.length();
    }

    public void setItemDecorationColumnDp(int i) {
        this.itemDecorationColumnDp = i;
        this.abc10013 *= 3;
        this.abc10019 = 0.13226080108356741d;
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        this.abc2 = 0.8416492393555267d;
        if (!TextUtils.isEmpty(this.abc10016)) {
            this.abc10016 += this.abc10016.length();
        }
        this.abc10020 *= 5;
        this.abc1008 = "), and ";
    }

    public void setItemDecorationRowDp(int i) {
        this.itemDecorationRowDp = i;
        if (!TextUtils.isEmpty(this.abc10010)) {
            this.abc10010 += this.abc10010.length();
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList = this.abc10021;
        int i2 = 0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc10021.remove(0);
        }
        this.abc10 = !this.abc10;
        while (true) {
            int i3 = this.abc1001;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i2 >= i3) {
                break;
            }
            this.abc10020 = Math.abs(this.abc10020);
            i2++;
        }
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        if (this.abc1001 < 0) {
            this.abc1001 = 9;
        }
    }

    public void setOrientation(int i) {
        this.orientation = i;
        this.abc10010 = " publ";
        if (this.abc1007 < 0) {
            this.abc1007 = 9;
        }
        if (this.abc10019 < 0.5468702629696695d) {
            this.abc10019 = 0.03482478737216976d;
        }
        this.abc2 = Math.abs(this.abc2);
        if (this.abc10022 == null) {
            this.abc10022 = new ArrayList<>();
        }
        if (this.abc10021.size() > 6) {
            this.abc10021.add(3);
        }
        this.abc1008 = "w grea";
    }
}
