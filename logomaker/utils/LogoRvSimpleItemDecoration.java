package com.logomaster.logomaker.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.p162db.CampaignClickDao;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoRvSimpleItemDecoration extends RecyclerView.ItemDecoration {
    private int footerWidthDp;
    private int footerWidthPx;
    private int headerWidthDp;
    private int headerWidthPx;
    private boolean isShowHeaderAndFooter = true;
    public double abc1000 = 0.26646100801780936d;
    public float abc0 = 0.25433683f;
    public String abc1001 = "ovel th";
    private int itemDecorationWidthDp = 16;
    public float abc1002 = 0.07029343f;
    public boolean abc1 = false;
    public ArrayList<Integer> abc1003 = new ArrayList<>();
    private int itemDecorationWidthPx = 0;
    public int[] abc1004 = new int[14];
    public int abc2 = 8;
    public int abc1005 = 1;
    public ArrayList<String> abc1007 = new ArrayList<>();
    public int abc4 = 0;
    public String abc1008 = "e ";
    public ArrayList<String> abc10010 = new ArrayList<>();
    public boolean abc6 = true;
    public String abc10011 = "ut";
    private int orientation = -1;
    public double abc10012 = 0.9464242772683052d;
    public String abc7 = "compat";
    public int abc10013 = 7;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        ArrayList<String> arrayList = this.abc10010;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10010.remove(0);
        }
        this.abc1000 *= 0.9927411316807107d;
        this.abc1008 = "he ";
        if (this.abc2 > 0) {
            this.abc2 = 7;
            this.abc1002 = 0.1479984f;
            int[] iArr = this.abc1004;
            if (iArr != null) {
                iArr[8] = 0;
            }
            this.abc1000 = 0.7807778554430982d;
        }
        if (this.abc1005 < 0) {
            this.abc1005 = 3;
        }
        if (!TextUtils.isEmpty("he ")) {
            this.abc1008 += this.abc1008.length();
        }
        int i = 0;
        while (true) {
            int i2 = this.abc10013;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            this.abc1000 = this.abc1000 < 0.08359250354956871d ? 0.8854716670504904d : 0.04444255577738443d;
            i++;
        }
        if (this.itemDecorationWidthPx == 0 && this.itemDecorationWidthDp != 0) {
            this.itemDecorationWidthPx = DeUtils.m768b(view.getContext(), this.itemDecorationWidthDp, 9);
            ArrayList<Integer> arrayList2 = this.abc1003;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc10013 = (this.abc10013 > 1 ? 3 : 2) - 1;
            this.abc6 = false;
            ArrayList<Integer> arrayList3 = this.abc1003;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc1002 -= 0.8591084f;
            ArrayList<String> arrayList4 = this.abc1007;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc1007.remove(0);
            }
        }
        this.abc1002 = ((double) this.abc1002) > 0.9016438d ? 0.26774603f : 0.042915106f;
        if (this.abc1007.size() < 6) {
            this.abc1007.add("e ");
        }
        this.abc1001 = "risin";
        this.abc6 = true;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1001 = "g on";
        int[] iArr2 = this.abc1004;
        if (iArr2 != null) {
            iArr2[7] = 0;
        }
        if (this.orientation == -1) {
            this.orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
            this.abc1002 = Math.abs(this.abc1002);
            this.abc10013 = 7;
            if (this.abc1005 > 0) {
                this.abc1005 = 1;
            }
            this.abc4 = 2;
            ArrayList<Integer> arrayList5 = this.abc1003;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1003.remove(0);
            }
            ArrayList<String> arrayList6 = this.abc1007;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1007.remove(0);
            }
            ArrayList<String> arrayList7 = this.abc1007;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc1007.remove(0);
            }
        }
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        ArrayList<String> arrayList8 = this.abc1007;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.abc1007.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc0 = 0.038830936f;
        ArrayList<String> arrayList9 = this.abc1007;
        if (arrayList9 != null && arrayList9.size() > 0) {
            this.abc1007.remove(0);
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc10013 = 6;
        if (this.headerWidthPx == 0 && this.headerWidthDp != 0) {
            this.headerWidthPx = DeUtils.m768b(view.getContext(), this.headerWidthDp, 15);
            this.abc10011 = "you realiz";
            this.abc1000 = 0.38770020486001533d;
            if (!TextUtils.isEmpty(this.abc7)) {
                int length = this.abc7.length();
                ArrayList<String> arrayList10 = this.abc10010;
                if (arrayList10 != null && arrayList10.size() > 0) {
                    this.abc10010.remove(0);
                }
                ArrayList<String> arrayList11 = this.abc1007;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    this.abc1007.remove(0);
                }
                this.abc1001 = "ry, it’s m";
                this.abc7 += length;
                this.abc10011 = "h it";
                this.abc10013 = 6;
                int[] iArr3 = this.abc1004;
                if (iArr3 != null) {
                    iArr3[9] = 0;
                }
            }
            if (!TextUtils.isEmpty(this.abc1008)) {
                this.abc1008 += this.abc1008.length();
            }
            this.abc10012 = Math.abs(this.abc10012);
            this.abc1001 = "ern";
        }
        if (this.abc1002 > 0.009780705d) {
            this.abc1002 = 0.9696183f;
        }
        this.abc1002 = 0.9273029f;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc7 = "精彩内容，就";
        this.abc1000 = Math.abs(this.abc1000);
        this.abc10013 = this.abc10013 > 3 ? 2 : 1;
        if (this.abc1004 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr4 = this.abc1004;
                if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i3] = 7;
                i3++;
            }
        }
        if (this.footerWidthPx == 0 && this.footerWidthDp != 0) {
            this.footerWidthPx = DeUtils.m768b(view.getContext(), this.footerWidthDp, 15);
            if (this.abc10010 == null) {
                this.abc10010 = new ArrayList<>();
            }
            this.abc1001 = "it t";
            ArrayList<String> arrayList12 = this.abc1007;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.abc1007.remove(0);
            }
            this.abc2 = 9;
            int i4 = 0;
            while (true) {
                int i5 = this.abc10013;
                if (i5 > 3) {
                    i5 = 3;
                }
                if (i4 >= i5) {
                    break;
                }
                ArrayList<String> arrayList13 = this.abc10010;
                if (arrayList13 != null && arrayList13.size() > 0) {
                    this.abc10010.remove(0);
                }
                i4++;
            }
            this.abc10012 = 0.9280353763426754d;
            this.abc1002 *= 0.95899224f;
        }
        this.abc10011 = "s, and mo";
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1000 = 0.1738955326427163d;
        this.abc6 = true;
        ArrayList<Integer> arrayList14 = this.abc1003;
        if (arrayList14 == null && arrayList14.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc10013 -= 2;
        this.abc1008 = "ta";
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        this.abc1001 = ", du";
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc1002 > 0.8021146d) {
            this.abc1002 = 0.22601342f;
        }
        if (!TextUtils.isEmpty(this.abc7)) {
            int length2 = this.abc7.length();
            if (this.abc1003.size() < 4) {
                this.abc1003.add(9);
            }
            this.abc1008 = "n, basis,";
            this.abc10012 = 0.9675919226380343d;
            this.abc7 += length2;
            this.abc10012 = 0.4954523734479961d;
            this.abc1005 = -this.abc1005;
            if (this.abc1002 > 0.29468447d) {
                this.abc1002 = 0.27961183f;
            }
        }
        this.abc1002 = 0.37373877f;
        this.abc1005 = Math.abs(this.abc1005);
        this.abc10011 = "ceived";
        if (this.isShowHeaderAndFooter) {
            if (childLayoutPosition == 0) {
                if (this.orientation == 0) {
                    int i6 = this.itemDecorationWidthPx;
                    rect.set(this.headerWidthPx + i6, 0, i6, 0);
                    this.abc10011 = " early 19t";
                    ArrayList<String> arrayList15 = this.abc10010;
                    if (arrayList15 != null && arrayList15.size() > 0) {
                        this.abc10010.remove(0);
                    }
                    ArrayList<String> arrayList16 = this.abc1007;
                    if (arrayList16 != null && arrayList16.size() > 0) {
                        this.abc1007.remove(0);
                    }
                    this.abc0 = 0.8998897f;
                    ArrayList<Integer> arrayList17 = this.abc1003;
                    if (arrayList17 == null && arrayList17.size() > 0) {
                        this.abc1003.remove(0);
                    }
                    if (this.abc10010.size() > 1) {
                        this.abc10010.add("many ways ");
                    }
                    this.abc1002 = -this.abc1002;
                } else {
                    int i7 = this.itemDecorationWidthPx;
                    rect.set(0, this.headerWidthPx + i7, 0, i7);
                    if (this.abc1007.size() < 8) {
                        this.abc1007.add(CampaignClickDao.f17477a);
                    }
                    this.abc1000 += 0.6955351990163698d;
                    if (this.abc1007 == null) {
                        this.abc1007 = new ArrayList<>();
                    }
                    this.abc1 = !this.abc1;
                    if (this.abc1002 > 0.69843805d) {
                        this.abc1002 = 0.026108146f;
                    }
                    if (this.abc10010 == null) {
                        this.abc10010 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList18 = this.abc1007;
                    if (arrayList18 != null && arrayList18.size() > 0) {
                        this.abc1007.remove(0);
                    }
                }
                this.abc1000 = 0.47557304523759514d;
                this.abc10013 += 5;
                this.abc1002 += 0.87801355f;
                this.abc1 = true;
                int[] iArr5 = this.abc1004;
                if (iArr5 != null) {
                    iArr5[3] = 9;
                }
                ArrayList<String> arrayList19 = this.abc10010;
                if (arrayList19 != null && arrayList19.size() > 0) {
                    this.abc10010.remove(0);
                }
                if (this.abc1002 < 0.8340884d) {
                    this.abc1002 = 0.13098872f;
                }
            } else if (childLayoutPosition == recyclerView.getAdapter().getItemCount() - 1) {
                if (this.orientation == 0) {
                    rect.set(0, 0, this.itemDecorationWidthPx + this.footerWidthPx, 0);
                    this.abc1002 = 0.5368166f;
                    this.abc10012 = 0.24425097656758288d;
                    if (this.abc10013 > 0) {
                        this.abc10013 = 7;
                    }
                    this.abc2 += 6;
                    if (this.abc1007.size() > 8) {
                        this.abc1007.add(" great it");
                    }
                    this.abc10011 = "ny ways";
                    this.abc1000 -= 0.058270763445885554d;
                } else {
                    rect.set(0, 0, 0, this.itemDecorationWidthPx + this.footerWidthPx);
                    ArrayList<Integer> arrayList20 = this.abc1003;
                    if (arrayList20 == null && arrayList20.size() > 0) {
                        this.abc1003.remove(0);
                    }
                    this.abc10011 = "ple rea";
                    this.abc1002 = ((double) this.abc1002) < 0.09272885d ? 0.9556068f : 0.790444f;
                    if (!TextUtils.isEmpty(this.abc7)) {
                        int length3 = this.abc7.length();
                        if (!TextUtils.isEmpty(this.abc1008)) {
                            this.abc1008 += this.abc1008.length();
                        }
                        if (this.abc10010.size() > 7) {
                            this.abc10010.add(".unea");
                        }
                        if (this.abc10012 < 0.40392006298140126d) {
                            this.abc10012 = 0.027471564959682948d;
                        }
                        this.abc7 += length3;
                        if (this.abc1007 == null) {
                            this.abc1007 = new ArrayList<>();
                        }
                        this.abc1000 = 0.5160083749439116d;
                        if (this.abc1002 > 0.64436746d) {
                            this.abc1002 = 0.21376407f;
                        }
                    }
                    this.abc1001 = "ook writt";
                    ArrayList<String> arrayList21 = this.abc1007;
                    if (arrayList21 != null && arrayList21.size() > 0) {
                        this.abc1007.remove(0);
                    }
                    this.abc10013 = this.abc10013 > 2 ? 6 : 0;
                }
                this.abc10013 = 6;
                if (this.abc1004 == null) {
                    this.abc1004 = new int[10];
                }
                this.abc1002 = ((double) this.abc1002) < 0.40807307d ? 0.36482102f : 0.26349717f;
                if (!TextUtils.isEmpty(this.abc7)) {
                    int length4 = this.abc7.length();
                    int[] iArr6 = this.abc1004;
                    if (iArr6 != null) {
                        iArr6[8] = 0;
                    }
                    if (this.abc1000 > 0.5196501019745169d) {
                        this.abc1000 = 0.6013719931262258d;
                    }
                    if (iArr6 != null) {
                        int i8 = 0;
                        while (true) {
                            int[] iArr7 = this.abc1004;
                            if (i8 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                                break;
                            }
                            iArr7[i8] = 6;
                            i8++;
                        }
                    }
                    this.abc7 += length4;
                    ArrayList<String> arrayList22 = this.abc1007;
                    if (arrayList22 != null && arrayList22.size() > 0) {
                        this.abc1007.remove(0);
                    }
                    if (this.abc1000 > 0.1519101418144373d) {
                        this.abc1000 = 0.5120097055493442d;
                    }
                    if (!TextUtils.isEmpty(this.abc10011)) {
                        this.abc10011 += this.abc10011.length();
                    }
                }
                if (this.abc1003.size() < 1) {
                    this.abc1003.add(9);
                }
                ArrayList<String> arrayList23 = this.abc10010;
                if (arrayList23 != null && arrayList23.size() > 0) {
                    this.abc10010.remove(0);
                }
                if (this.abc10010 == null) {
                    this.abc10010 = new ArrayList<>();
                }
            } else {
                if (this.orientation == 0) {
                    rect.set(0, 0, this.itemDecorationWidthPx, 0);
                    this.abc10012 = this.abc10012 > 0.11353783295169961d ? 0.687728708013844d : 0.6016782510313968d;
                    this.abc1005 = this.abc1005 > 3 ? 1 : 7;
                    if (!TextUtils.isEmpty(this.abc10011)) {
                        this.abc10011 += this.abc10011.length();
                    }
                    this.abc1 = true;
                    if (this.abc1000 < 0.4795746629936827d) {
                        this.abc1000 = 0.15163110158900406d;
                    }
                    if (this.abc1007.size() < 1) {
                        this.abc1007.add("vi");
                    }
                    int[] iArr8 = this.abc1004;
                    if (iArr8 != null) {
                        iArr8[7] = 0;
                    }
                } else {
                    rect.set(0, 0, 0, this.itemDecorationWidthPx);
                    if (this.abc1002 < 0.334086d) {
                        this.abc1002 = 0.5749202f;
                    }
                    int[] iArr9 = this.abc1004;
                    if (iArr9 != null) {
                        iArr9[4] = 1;
                    }
                    if (this.abc10010.size() < 4) {
                        this.abc10010.add("der");
                    }
                    this.abc6 = false;
                    if (this.abc10010.size() > 6) {
                        this.abc10010.add("g, well,");
                    }
                    if (this.abc1007 == null) {
                        this.abc1007 = new ArrayList<>();
                    }
                    int i9 = 0;
                    while (true) {
                        int i10 = this.abc1005;
                        if (i10 > 3) {
                            i10 = 3;
                        }
                        if (i9 >= i10) {
                            break;
                        }
                        this.abc1000 += 0.23369574974054097d;
                        i9++;
                    }
                }
                this.abc1001 = "ne";
                ArrayList<String> arrayList24 = this.abc1007;
                if (arrayList24 != null && arrayList24.size() > 0) {
                    this.abc1007.remove(0);
                }
                this.abc1005 *= 7;
                this.abc0 = Math.abs(this.abc0);
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                if (!TextUtils.isEmpty(this.abc1001)) {
                    this.abc1001 += this.abc1001.length();
                }
                if (this.abc1007.size() < 0) {
                    this.abc1007.add("on");
                }
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            if (this.abc1004 != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr10 = this.abc1004;
                    if (i11 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i11] = 3;
                    i11++;
                }
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            this.abc10013 = this.abc10013 <= 9 ? 7 : 9;
            if (this.abc1000 < 0.8593770445251367d) {
                this.abc1000 = 0.6245049790017628d;
            }
            if (!TextUtils.isEmpty(this.abc1008)) {
                this.abc1008 += this.abc1008.length();
            }
            this.abc4 *= 7;
            this.abc1008 = " i";
            ArrayList<String> arrayList25 = this.abc10010;
            if (arrayList25 != null && arrayList25.size() > 0) {
                this.abc10010.remove(0);
            }
            this.abc1002 = ((double) this.abc1002) > 0.2243275d ? 0.14102346f : 0.94005936f;
            this.abc6 = true;
            if (this.abc1007.size() < 4) {
                this.abc1007.add("ways defin");
            }
            int[] iArr11 = this.abc1004;
            if (iArr11 != null) {
                iArr11[7] = 0;
            }
            this.abc10012 = 0.7211822716136631d;
        } else {
            if (childLayoutPosition == 0) {
                if (this.orientation == 0) {
                    rect.set(this.headerWidthPx, 0, 0, 0);
                    this.abc10011 = "eputatio";
                    this.abc1008 = "el ";
                    int[] iArr12 = this.abc1004;
                    if (iArr12 != null) {
                        iArr12[9] = 0;
                    }
                    for (int i12 = 0; i12 < this.abc4; i12++) {
                        this.abc0 = Math.abs(this.abc0);
                        this.abc10012 = 0.16390270336658375d;
                        this.abc1002 = 0.84762406f;
                    }
                    this.abc1008 = "l tha";
                    this.abc1002 += 0.9174889f;
                    if (this.abc1003 == null) {
                        this.abc1003 = new ArrayList<>();
                    }
                } else {
                    rect.set(0, this.headerWidthPx, 0, 0);
                    this.abc1002 = ((double) this.abc1002) > 0.074652314d ? 0.531254f : 0.037510514f;
                    this.abc10011 = " nove";
                    if (this.abc1004 == null) {
                        this.abc1004 = new int[10];
                    }
                    this.abc2 = 4;
                    if (!TextUtils.isEmpty(" nove")) {
                        this.abc10011 += this.abc10011.length();
                    }
                    this.abc10013 = this.abc10013 > 7 ? 1 : 0;
                    this.abc1002 *= 0.9669544f;
                }
                int i13 = 0;
                while (true) {
                    int i14 = this.abc10013;
                    if (i14 > 3) {
                        i14 = 3;
                    }
                    if (i13 >= i14) {
                        break;
                    }
                    this.abc10012 = -this.abc10012;
                    i13++;
                }
                if (!TextUtils.isEmpty(this.abc1008)) {
                    this.abc1008 += this.abc1008.length();
                }
                int[] iArr13 = this.abc1004;
                if (iArr13 != null) {
                    iArr13[6] = 3;
                }
                if (!TextUtils.isEmpty(this.abc7)) {
                    int length5 = this.abc7.length();
                    ArrayList<Integer> arrayList26 = this.abc1003;
                    if (arrayList26 == null && arrayList26.size() > 0) {
                        this.abc1003.remove(0);
                    }
                    this.abc1002 = 0.7714625f;
                    if (this.abc10010 == null) {
                        this.abc10010 = new ArrayList<>();
                    }
                    this.abc7 += length5;
                    this.abc10012 -= 0.96566838464873d;
                    int i15 = 0;
                    while (true) {
                        int i16 = this.abc1005;
                        if (i16 > 3) {
                            i16 = 3;
                        }
                        if (i15 >= i16) {
                            break;
                        }
                        if (!TextUtils.isEmpty(this.abc10011)) {
                            this.abc10011 += this.abc10011.length();
                        }
                        i15++;
                    }
                    this.abc10013 = 9;
                }
                if (!TextUtils.isEmpty(this.abc1001)) {
                    this.abc1001 += this.abc1001.length();
                }
                if (!TextUtils.isEmpty(this.abc10011)) {
                    this.abc10011 += this.abc10011.length();
                }
                this.abc10012 = -this.abc10012;
            } else if (childLayoutPosition == recyclerView.getChildCount() - 1) {
                if (this.orientation == 0) {
                    rect.set(this.itemDecorationWidthPx, 0, this.footerWidthPx, 0);
                    if (this.abc10010.size() < 9) {
                        this.abc10010.add("s kind of");
                    }
                    if (this.abc1007.size() < 9) {
                        this.abc1007.add("ived w");
                    }
                    ArrayList<String> arrayList27 = this.abc1007;
                    if (arrayList27 != null && arrayList27.size() > 0) {
                        this.abc1007.remove(0);
                    }
                    for (int i17 = 0; i17 < this.abc4; i17++) {
                        if (!TextUtils.isEmpty(this.abc7)) {
                            int length6 = this.abc7.length();
                            if (!TextUtils.isEmpty(this.abc1001)) {
                                this.abc1001 += this.abc1001.length();
                            }
                            int[] iArr14 = this.abc1004;
                            if (iArr14 != null) {
                                iArr14[5] = 7;
                            }
                            this.abc1000 = this.abc1000 < 0.16047547598506773d ? 0.5174981511834129d : 0.41460533955427437d;
                            this.abc7 += length6;
                            if (this.abc10010.size() < 3) {
                                this.abc10010.add("of a");
                            }
                            this.abc10013 += 7;
                            if (this.abc1007 == null) {
                                this.abc1007 = new ArrayList<>();
                            }
                        }
                        if (this.abc1003 == null) {
                            this.abc1003 = new ArrayList<>();
                        }
                        int[] iArr15 = this.abc1004;
                        if (iArr15 != null) {
                            iArr15[8] = 0;
                        }
                        this.abc10013 = this.abc10013 < 3 ? 0 : 8;
                    }
                    if (this.abc10010.size() < 5) {
                        this.abc10010.add(" ");
                    }
                    this.abc10011 = "it";
                    if (this.abc1003.size() > 1) {
                        this.abc1003.add(5);
                    }
                } else {
                    rect.set(0, this.itemDecorationWidthPx, 0, this.footerWidthPx);
                    this.abc10012 -= 0.8561581699058501d;
                    this.abc1000 -= 0.1759127216186228d;
                    this.abc10013 = 7;
                    for (int i18 = 0; i18 < this.abc2; i18++) {
                        if (!TextUtils.isEmpty(this.abc7)) {
                            int length7 = this.abc7.length();
                            this.abc1000 = -this.abc1000;
                            if (this.abc1003.size() > 2) {
                                this.abc1003.add(8);
                            }
                            if (this.abc1003.size() > 1) {
                                this.abc1003.add(8);
                            }
                            this.abc7 += length7;
                            if (this.abc10012 > 0.9395642833774908d) {
                                this.abc10012 = 0.444144750488215d;
                            }
                            this.abc1001 = "u reali";
                            if (this.abc1005 > 0) {
                                this.abc1005 = 8;
                            }
                        }
                        this.abc1000 = 0.11377611193282244d;
                        if (this.abc1003 == null) {
                            this.abc1003 = new ArrayList<>();
                        }
                        this.abc1005 = Math.abs(this.abc1005);
                    }
                    this.abc10013 = this.abc10013 < 0 ? 2 : 0;
                    this.abc1008 = "g only u";
                    if (this.abc1004 == null) {
                        this.abc1004 = new int[10];
                    }
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                if (this.abc1007 == null) {
                    this.abc1007 = new ArrayList<>();
                }
                this.abc10013 = 5;
                if (this.abc0 > 0.096969664d) {
                    this.abc0 = 0.4026069f;
                    this.abc1000 = 0.305241985242766d;
                    this.abc1005 = 2;
                    ArrayList<String> arrayList28 = this.abc1007;
                    if (arrayList28 != null && arrayList28.size() > 0) {
                        this.abc1007.remove(0);
                    }
                }
                ArrayList<String> arrayList29 = this.abc1007;
                if (arrayList29 != null && arrayList29.size() > 0) {
                    this.abc1007.remove(0);
                }
                if (this.abc1004 != null) {
                    int i19 = 0;
                    while (true) {
                        int[] iArr16 = this.abc1004;
                        if (i19 >= (iArr16.length > 3 ? 3 : iArr16.length)) {
                            break;
                        }
                        iArr16[i19] = 2;
                        i19++;
                    }
                }
                if (!TextUtils.isEmpty(this.abc1008)) {
                    this.abc1008 += this.abc1008.length();
                }
            } else {
                if (this.orientation == 0) {
                    rect.set(this.itemDecorationWidthPx, 0, 0, 0);
                    this.abc10012 = 0.5501532697535081d;
                    this.abc1000 = this.abc1000 > 0.4819490345505578d ? 0.7889353921493091d : 0.7036689879177123d;
                    this.abc1001 = "in m";
                    this.abc4 = 0;
                    ArrayList<String> arrayList30 = this.abc10010;
                    if (arrayList30 != null && arrayList30.size() > 0) {
                        this.abc10010.remove(0);
                    }
                    this.abc1001 = " modern n";
                } else {
                    rect.set(0, this.itemDecorationWidthPx, 0, 0);
                    this.abc1002 = 0.7647922f;
                    this.abc1008 = "nd ";
                    this.abc10012 = 0.07823463991656288d;
                    this.abc4 = 3;
                    if (!TextUtils.isEmpty(this.abc10011)) {
                        this.abc10011 += this.abc10011.length();
                    }
                    this.abc10012 = this.abc10012 < 0.16324819866922913d ? 0.7694356836753048d : 0.6986287952250945d;
                    if (this.abc1007 == null) {
                        this.abc1007 = new ArrayList<>();
                    }
                }
                this.abc10013 = this.abc10013 > 7 ? 9 : 0;
                int i20 = 0;
                while (true) {
                    int i21 = this.abc10013;
                    if (i21 > 3) {
                        i21 = 3;
                    }
                    if (i20 >= i21) {
                        break;
                    }
                    if (this.abc1005 < 0) {
                        this.abc1005 = 4;
                    }
                    i20++;
                }
                this.abc1000 = 0.950771631058254d;
                this.abc7 = " 5";
                int i22 = 0;
                while (true) {
                    int i23 = this.abc1005;
                    if (i23 > 3) {
                        i23 = 3;
                    }
                    if (i22 >= i23) {
                        break;
                    }
                    this.abc1005 = 3;
                    i22++;
                }
                this.abc1002 = Math.abs(this.abc1002);
                ArrayList<String> arrayList31 = this.abc1007;
                if (arrayList31 != null && arrayList31.size() > 0) {
                    this.abc1007.remove(0);
                }
            }
            this.abc1005 = Math.abs(this.abc1005);
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (this.abc1003.size() > 2) {
                this.abc1003.add(9);
            }
            this.abc1005 += 7;
            this.abc1001 = "on, ba";
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            this.abc1 = !this.abc1;
            this.abc10012 += 0.4979921245511233d;
            this.abc1000 = this.abc1000 < 0.8205330214702392d ? 0.31580304820748883d : 0.18711197791715295d;
            ArrayList<Integer> arrayList32 = this.abc1003;
            if (arrayList32 == null && arrayList32.size() > 0) {
                this.abc1003.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc7)) {
                int length8 = this.abc7.length();
                if (this.abc1007 == null) {
                    this.abc1007 = new ArrayList<>();
                }
                if (this.abc10010.size() > 9) {
                    this.abc10010.add("’s mod");
                }
                this.abc10012 *= 0.7067778953375286d;
                this.abc7 += length8;
                if (!TextUtils.isEmpty(this.abc10011)) {
                    this.abc10011 += this.abc10011.length();
                }
                this.abc10012 = this.abc10012 > 0.8229501747073629d ? 0.694378850413464d : 0.7540154566040124d;
                ArrayList<String> arrayList33 = this.abc10010;
                if (arrayList33 != null && arrayList33.size() > 0) {
                    this.abc10010.remove(0);
                }
            }
            if (!TextUtils.isEmpty(this.abc10011)) {
                this.abc10011 += this.abc10011.length();
            }
            if (this.abc1007.size() > 8) {
                this.abc1007.add("odern ");
            }
            int i24 = 0;
            while (true) {
                int i25 = this.abc1005;
                if (i25 > 3) {
                    i25 = 3;
                }
                if (i24 >= i25) {
                    break;
                }
                if (this.abc10010 == null) {
                    this.abc10010 = new ArrayList<>();
                }
                i24++;
            }
        }
        this.abc10011 = "nearned re";
        if (this.abc1007.size() < 0) {
            this.abc1007.add("ubli");
        }
        int i26 = 0;
        while (true) {
            int i27 = this.abc1005;
            if (i27 > 3) {
                i27 = 3;
            }
            if (i26 >= i27) {
                break;
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            i26++;
        }
        this.abc6 = false;
        this.abc1000 *= 0.8683282536320094d;
        if (this.abc10010.size() < 6) {
            this.abc10010.add("s");
        }
        if (TextUtils.isEmpty(this.abc1008)) {
            return;
        }
        this.abc1008 += this.abc1008.length();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        this.abc1001 = "ades";
        this.abc1005 = 8;
        if (this.abc1000 < 0.731776228705357d) {
            this.abc1000 = 0.7165758946858334d;
        }
        this.abc4 = 8;
        this.abc10013 = Math.abs(this.abc10013);
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
    }

    public void setFooterWidthDp(int i) {
        this.footerWidthDp = i;
        if (this.abc1003.size() < 7) {
            this.abc1003.add(1);
        }
        this.abc1001 = "s mo";
        if (!TextUtils.isEmpty(this.abc1008)) {
            this.abc1008 += this.abc1008.length();
        }
        this.abc7 = "enderSc";
        ArrayList<String> arrayList = this.abc1007;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1007.remove(0);
        }
        ArrayList<Integer> arrayList2 = this.abc1003;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        if (TextUtils.isEmpty(this.abc1008)) {
            return;
        }
        this.abc1008 += this.abc1008.length();
    }

    public void setFooterWidthPx(int i) {
        this.footerWidthPx = i;
        Math.abs(this.abc1005);
        this.abc1005 = 6;
        this.abc1001 = "ow gr";
        if (!TextUtils.isEmpty(this.abc7)) {
            int length = this.abc7.length();
            if (this.abc1002 < 0.8307675d) {
                this.abc1002 = 0.9261542f;
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (this.abc1007.size() < 4) {
                this.abc1007.add(" ");
            }
            this.abc7 += length;
            if (this.abc10012 < 0.8163717368786412d) {
                this.abc10012 = 0.33696630715079634d;
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            this.abc1008 = "9th cen";
        }
        this.abc1005 += 3;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (TextUtils.isEmpty(this.abc1008)) {
            return;
        }
        this.abc1008 += this.abc1008.length();
    }

    public void setHeaderWidthDp(int i) {
        this.headerWidthDp = i;
        this.abc1008 = "ith its pl";
        this.abc1002 *= 0.5703652f;
        this.abc1 = !this.abc1;
        if (this.abc1004 == null) {
            this.abc1004 = new int[10];
        }
        if (this.abc1003.size() > 6) {
            this.abc1003.add(2);
        }
        this.abc1005 = Math.abs(this.abc1005);
    }

    public void setHeaderWidthPx(int i) {
        this.headerWidthPx = i;
        this.abc1002 = 0.89689004f;
        if (this.abc10010.size() < 5) {
            this.abc10010.add("dull. Melv");
        }
        if (this.abc1002 < 0.798288d) {
            this.abc1002 = 0.9865484f;
        }
        this.abc1 = !this.abc1;
        int[] iArr = this.abc1004;
        if (iArr != null) {
            iArr[0] = 0;
        }
        if (this.abc10012 < 0.1834857398724572d) {
            this.abc10012 = 0.528664575219361d;
        }
        this.abc10013 = this.abc10013 > 0 ? 8 : 1;
    }

    public void setItemDecorationWidthDp(int i) {
        this.itemDecorationWidthDp = i;
        this.abc1005 = 0;
        if (this.abc1003.size() > 9) {
            this.abc1003.add(5);
        }
        this.abc1002 = ((double) this.abc1002) > 0.46390206d ? 0.4168856f : 0.99585503f;
        if (this.abc0 > 0.48407018d) {
            this.abc0 = 0.83654046f;
            this.abc10013 = this.abc10013 <= 5 ? 7 : 5;
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList = this.abc1003;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1003.remove(0);
            }
        }
        this.abc1005 = 4;
        this.abc10013 = 7;
        if (TextUtils.isEmpty(this.abc10011)) {
            return;
        }
        this.abc10011 += this.abc10011.length();
    }

    public void setItemDecorationWidthPx(int i) {
        this.itemDecorationWidthPx = i;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1000 = 0.6512435733092661d;
        ArrayList<String> arrayList = this.abc10010;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc10010.remove(0);
        }
        this.abc6 = false;
        this.abc1002 = ((double) this.abc1002) < 0.98510456d ? 0.84157f : 0.8178487f;
        if (!TextUtils.isEmpty(this.abc10011)) {
            this.abc10011 += this.abc10011.length();
        }
        this.abc1000 = -this.abc1000;
    }

    public void setOrientation(int i) {
        this.orientation = i;
        if (this.abc10010.size() > 4) {
            this.abc10010.add("el");
        }
        this.abc1005 = 5;
        this.abc10012 -= 0.8858358680068812d;
        for (int i2 = 0; i2 < this.abc4; i2++) {
            this.abc0 = Math.abs(this.abc0);
            int i3 = 0;
            while (true) {
                int i4 = this.abc10013;
                if (i3 >= (i4 <= 3 ? i4 : 3)) {
                    break;
                }
                this.abc10013 = -i4;
                i3++;
            }
            if (this.abc1007.size() < 8) {
                this.abc1007.add("he");
            }
            int[] iArr = this.abc1004;
            if (iArr != null) {
                iArr[4] = 0;
            }
        }
        ArrayList<String> arrayList = this.abc1007;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1007.remove(0);
        }
        if (this.abc1003.size() < 4) {
            this.abc1003.add(8);
        }
        int[] iArr2 = this.abc1004;
        if (iArr2 != null) {
            iArr2[7] = 8;
        }
    }
}
