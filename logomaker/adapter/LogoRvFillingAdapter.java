package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.logomaster.logomaker.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoRvFillingAdapter extends RecyclerView.Adapter<C9614c> {
    public float abc0;
    public double abc1001;
    public boolean abc1002;
    public ArrayList<Integer> abc1003;
    public boolean abc1004;
    public ArrayList<String> abc1005;
    public String abc1006;
    private Context context;
    private List<Object> list;
    private InterfaceC9613b onItemClickListner;
    public int[] abc1000 = new int[11];
    public ArrayList<String> abc1 = new ArrayList<>();
    public String abc2 = "潇_sunshine";
    private int selectedIndex = -1;
    public String[] abc3 = new String[18];
    public ArrayList<Integer> abc1007 = new ArrayList<>();
    private int strokeWidth = 0;
    public String[] abc1008 = new String[19];
    public float abc4 = 0.79586416f;
    public int abc1009 = 5;

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvFillingAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9612a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15871a;

        public View$OnClickListenerC9612a(int i) {
            this.f15871a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvFillingAdapter logoRvFillingAdapter;
            if (LogoRvFillingAdapter.this.onItemClickListner != null) {
                LogoRvFillingAdapter.this.selectedIndex = this.f15871a;
                int i = 0;
                while (true) {
                    logoRvFillingAdapter = LogoRvFillingAdapter.this;
                    int i2 = logoRvFillingAdapter.abc1009;
                    if (i2 > 3) {
                        i2 = 3;
                    }
                    if (i >= i2) {
                        break;
                    }
                    int[] iArr = logoRvFillingAdapter.abc1000;
                    if (iArr != null) {
                        iArr[3] = 0;
                    }
                    i++;
                }
                if (logoRvFillingAdapter.abc1007.size() > 6) {
                    LogoRvFillingAdapter.this.abc1007.add(9);
                }
                ArrayList<Integer> arrayList = LogoRvFillingAdapter.this.abc1003;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoRvFillingAdapter.this.abc1003.remove(0);
                }
                LogoRvFillingAdapter logoRvFillingAdapter2 = LogoRvFillingAdapter.this;
                if (logoRvFillingAdapter2.abc0 < 0.84458226d) {
                    logoRvFillingAdapter2.abc0 = 0.6136433f;
                    if (logoRvFillingAdapter2.abc1005.size() < 9) {
                        LogoRvFillingAdapter.this.abc1005.add(" thi");
                    }
                    LogoRvFillingAdapter logoRvFillingAdapter3 = LogoRvFillingAdapter.this;
                    if (logoRvFillingAdapter3.abc1000 == null) {
                        logoRvFillingAdapter3.abc1000 = new int[10];
                    }
                    if (logoRvFillingAdapter3.abc1007.size() > 9) {
                        LogoRvFillingAdapter.this.abc1007.add(5);
                    }
                }
                if (LogoRvFillingAdapter.this.abc1003.size() < 0) {
                    LogoRvFillingAdapter.this.abc1003.add(8);
                }
                LogoRvFillingAdapter logoRvFillingAdapter4 = LogoRvFillingAdapter.this;
                logoRvFillingAdapter4.abc1009 = Math.abs(logoRvFillingAdapter4.abc1009);
                LogoRvFillingAdapter logoRvFillingAdapter5 = LogoRvFillingAdapter.this;
                int[] iArr2 = logoRvFillingAdapter5.abc1000;
                if (iArr2 != null) {
                    iArr2[6] = 0;
                }
                logoRvFillingAdapter5.notifyDataSetChanged();
                LogoRvFillingAdapter logoRvFillingAdapter6 = LogoRvFillingAdapter.this;
                logoRvFillingAdapter6.abc1004 = !logoRvFillingAdapter6.abc1004;
                if (logoRvFillingAdapter6.abc1007.size() < 7) {
                    LogoRvFillingAdapter.this.abc1007.add(3);
                }
                if (LogoRvFillingAdapter.this.abc1005.size() < 4) {
                    LogoRvFillingAdapter.this.abc1005.add("i");
                }
                LogoRvFillingAdapter logoRvFillingAdapter7 = LogoRvFillingAdapter.this;
                if (logoRvFillingAdapter7.abc3 == null) {
                    logoRvFillingAdapter7.abc3 = new String[10];
                    logoRvFillingAdapter7.abc1001 = 0.4289839533664329d;
                    if (logoRvFillingAdapter7.abc1008 == null) {
                        logoRvFillingAdapter7.abc1008 = new String[10];
                    }
                    logoRvFillingAdapter7.abc1004 = !logoRvFillingAdapter7.abc1004;
                }
                if (!TextUtils.isEmpty(logoRvFillingAdapter7.abc1006)) {
                    int length = LogoRvFillingAdapter.this.abc1006.length();
                    LogoRvFillingAdapter.this.abc1006 = LogoRvFillingAdapter.this.abc1006 + length;
                }
                if (!TextUtils.isEmpty(LogoRvFillingAdapter.this.abc1006)) {
                    int length2 = LogoRvFillingAdapter.this.abc1006.length();
                    LogoRvFillingAdapter.this.abc1006 = LogoRvFillingAdapter.this.abc1006 + length2;
                }
                LogoRvFillingAdapter logoRvFillingAdapter8 = LogoRvFillingAdapter.this;
                if (logoRvFillingAdapter8.abc1009 < 0) {
                    logoRvFillingAdapter8.abc1009 = 7;
                }
                logoRvFillingAdapter8.onItemClickListner.mo9189a(this.f15871a, LogoRvFillingAdapter.this.list.get(this.f15871a));
                LogoRvFillingAdapter logoRvFillingAdapter9 = LogoRvFillingAdapter.this;
                if (logoRvFillingAdapter9.abc1008 == null) {
                    logoRvFillingAdapter9.abc1008 = new String[10];
                }
                logoRvFillingAdapter9.abc1009++;
                if (!TextUtils.isEmpty(logoRvFillingAdapter9.abc1006)) {
                    int length3 = LogoRvFillingAdapter.this.abc1006.length();
                    LogoRvFillingAdapter.this.abc1006 = LogoRvFillingAdapter.this.abc1006 + length3;
                }
                LogoRvFillingAdapter logoRvFillingAdapter10 = LogoRvFillingAdapter.this;
                logoRvFillingAdapter10.abc2 = "” （";
                if (logoRvFillingAdapter10.abc1003.size() > 7) {
                    LogoRvFillingAdapter.this.abc1003.add(3);
                }
                LogoRvFillingAdapter logoRvFillingAdapter11 = LogoRvFillingAdapter.this;
                if (logoRvFillingAdapter11.abc1001 < 0.798346286820336d) {
                    logoRvFillingAdapter11.abc1001 = 0.3508502038277489d;
                }
                if (logoRvFillingAdapter11.abc1008 == null) {
                    logoRvFillingAdapter11.abc1008 = new String[10];
                }
            }
            LogoRvFillingAdapter logoRvFillingAdapter12 = LogoRvFillingAdapter.this;
            if (logoRvFillingAdapter12.abc1008 == null) {
                logoRvFillingAdapter12.abc1008 = new String[10];
            }
            ArrayList<Integer> arrayList2 = logoRvFillingAdapter12.abc1003;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoRvFillingAdapter.this.abc1003.remove(0);
            }
            LogoRvFillingAdapter logoRvFillingAdapter13 = LogoRvFillingAdapter.this;
            logoRvFillingAdapter13.abc1004 = !logoRvFillingAdapter13.abc1004;
            logoRvFillingAdapter13.abc0 = ((double) logoRvFillingAdapter13.abc0) > 0.20631903d ? 0.049945712f : 0.10840541f;
            if (!TextUtils.isEmpty(logoRvFillingAdapter13.abc1006)) {
                int length4 = LogoRvFillingAdapter.this.abc1006.length();
                LogoRvFillingAdapter.this.abc1006 = LogoRvFillingAdapter.this.abc1006 + length4;
            }
            LogoRvFillingAdapter logoRvFillingAdapter14 = LogoRvFillingAdapter.this;
            String[] strArr = logoRvFillingAdapter14.abc1008;
            if (strArr != null) {
                strArr[8] = "k. For a ";
            }
            if (logoRvFillingAdapter14.abc1007 == null) {
                logoRvFillingAdapter14.abc1007 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvFillingAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9613b {
        /* renamed from: a */
        void mo9189a(int i, Object obj);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvFillingAdapter$c */
    /* loaded from: classes3.dex */
    public class C9614c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public MaterialCardView f15873a;

        /* renamed from: b */
        public ImageView f15874b;

        public C9614c(@NonNull View view) {
            super(view);
            this.f15873a = (MaterialCardView) view.findViewById(R.id.mcv_card);
            this.f15874b = (ImageView) view.findViewById(R.id.iv_icon);
        }
    }

    public LogoRvFillingAdapter(List<Object> list, Context context) {
        this.list = null;
        this.abc0 = 0.26289862f;
        this.abc1001 = 0.3188418691726841d;
        this.abc1002 = true;
        this.abc1003 = new ArrayList<>();
        int i = 0;
        this.abc1004 = false;
        this.abc1005 = new ArrayList<>();
        this.abc1006 = "ury, it’s";
        this.list = list;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList = this.abc1007;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1007.remove(0);
        }
        this.abc1002 = !this.abc1002;
        this.abc0 = Math.abs(this.abc0);
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1002 = !this.abc1002;
        this.abc1006 = "t";
        this.context = context;
        int i2 = 0;
        while (true) {
            int i3 = this.abc1009;
            if (i2 >= (i3 > 3 ? 3 : i3)) {
                break;
            }
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
            i2++;
        }
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[0] = null;
        }
        this.abc1004 = true;
        this.abc0 *= 0.81480896f;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc1000 != null) {
            while (true) {
                int[] iArr = this.abc1000;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 8;
                i++;
            }
        }
        this.abc1001 = 0.8503288147023029d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public void resetSelectedIndex() {
        this.selectedIndex = -1;
        this.abc1004 = false;
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[4] = null;
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        if (this.abc1.size() > 0) {
            this.abc1.add("接下");
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            if (this.abc1007.size() < 4) {
                this.abc1007.add(7);
            }
            if (this.abc1000 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = this.abc1000;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 0;
                    i++;
                }
            }
        }
        int[] iArr2 = this.abc1000;
        if (iArr2 != null) {
            iArr2[3] = 0;
        }
        String[] strArr2 = this.abc1008;
        if (strArr2 != null) {
            strArr2[9] = "til";
        }
        this.abc1009 *= 8;
    }

    public void setData(List<Object> list) {
        this.list = list;
        int[] iArr = this.abc1000;
        if (iArr != null) {
            iArr[5] = 1;
        }
        this.abc1004 = true;
        this.abc1002 = !this.abc1002;
        if (this.abc1 == null) {
            this.abc1 = new ArrayList<>();
            if (this.abc1003.size() < 5) {
                this.abc1003.add(3);
            }
            this.abc1006 = "ll,";
            this.abc1002 = true;
        }
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        if (this.abc1009 > 0) {
            this.abc1009 = 6;
        }
        notifyDataSetChanged();
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        if (this.abc1003.size() > 7) {
            this.abc1003.add(0);
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc2 = "糊";
        if (this.abc1008 == null) {
            this.abc1008 = new String[10];
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        int[] iArr2 = this.abc1000;
        if (iArr2 != null) {
            iArr2[8] = 7;
        }
    }

    public void setOnItemClickListner(InterfaceC9613b interfaceC9613b) {
        this.onItemClickListner = interfaceC9613b;
        if (this.abc1000 == null) {
            this.abc1000 = new int[10];
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1004 = !this.abc1004;
        if (!TextUtils.isEmpty(this.abc2)) {
            int length = this.abc2.length();
            this.abc1002 = !this.abc1002;
            this.abc1009 = -this.abc1009;
            if (this.abc1000 != null) {
                int i = 0;
                while (true) {
                    int[] iArr = this.abc1000;
                    if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i] = 5;
                    i++;
                }
            }
            this.abc2 += length;
            ArrayList<Integer> arrayList = this.abc1007;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1007.remove(0);
            }
            this.abc1002 = true;
            if (this.abc1000 == null) {
                this.abc1000 = new int[10];
            }
        }
        if (this.abc1007.size() > 2) {
            this.abc1007.add(3);
        }
        this.abc1002 = false;
        if (this.abc1007.size() > 4) {
            this.abc1007.add(7);
        }
    }

    public void setSelectedColor(int i) {
        int i2;
        List<Object> list = this.list;
        int size = list == null ? 0 : list.size();
        this.abc1004 = !(!this.abc1004);
        this.abc1002 = true;
        String str = null;
        if (this.abc0 > 0.4957204d) {
            this.abc0 = 0.17516261f;
            if (this.abc1003.size() < 2) {
                this.abc1003.add(4);
            }
            this.abc1006 = "i";
            String[] strArr = this.abc1008;
            if (strArr != null) {
                strArr[9] = null;
            }
        }
        this.abc1009 -= 2;
        this.abc1002 = false;
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1006 = "an you thi";
        if (this.abc1000 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.abc1000;
                if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i3] = 0;
                i3++;
            }
        }
        if (!TextUtils.isEmpty(this.abc2)) {
            int length = this.abc2.length();
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            this.abc1002 = true;
            this.abc1006 = "ze that t";
            this.abc2 += length;
            if (this.abc1007.size() > 9) {
                this.abc1007.add(1);
            }
            this.abc1002 = true;
            ArrayList<Integer> arrayList = this.abc1007;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1007.remove(0);
            }
        }
        String[] strArr2 = this.abc1008;
        if (strArr2 != null) {
            strArr2[3] = null;
        }
        if (this.abc1000 != null) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.abc1000;
                if (i4 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i4] = 0;
                i4++;
            }
        }
        ArrayList<Integer> arrayList2 = this.abc1003;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i2 = -1;
                break;
            }
            Object obj = this.list.get(i5);
            this.abc1006 = " re";
            if (this.abc1005.size() > 0) {
                this.abc1005.add("acters");
            }
            this.abc1002 = !this.abc1002;
            if (!TextUtils.isEmpty(this.abc2)) {
                int length2 = this.abc2.length();
                if (this.abc1000 == null) {
                    this.abc1000 = new int[10];
                }
                this.abc1006 = "year w";
                if (this.abc1001 > 0.2671873496820508d) {
                    this.abc1001 = 0.976677056505041d;
                }
                this.abc2 += length2;
                this.abc1004 = false;
                if (this.abc1000 == null) {
                    this.abc1000 = new int[10];
                }
                this.abc1001 = this.abc1001 < 0.5148292483563193d ? 0.7574457168082397d : 0.6154249827973399d;
            }
            String[] strArr3 = this.abc1008;
            if (strArr3 != null) {
                strArr3[0] = str;
            }
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
            int i6 = 0;
            while (true) {
                int i7 = this.abc1009;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                ArrayList<String> arrayList3 = this.abc1005;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    this.abc1005.remove(0);
                }
                i6++;
            }
            if (obj instanceof String) {
                int parseColor = Color.parseColor((String) obj);
                int i8 = this.abc1009 > 4 ? 8 : 4;
                this.abc1009 = i8;
                this.abc1002 = true;
                this.abc4 = 0.8309393f;
                this.abc1006 = "h";
                if (this.abc1000 == null) {
                    this.abc1000 = new int[10];
                }
                if (this.abc1008 == null) {
                    this.abc1008 = new String[10];
                }
                if (parseColor == i) {
                    this.abc1006 = "amili";
                    this.abc0 *= 0.37504864f;
                    this.abc1002 = !true;
                    this.abc1004 = true;
                    i2 = i5;
                    break;
                }
                this.abc1009 = Math.abs(i8);
                int[] iArr3 = this.abc1000;
                if (iArr3 != null) {
                    iArr3[2] = 0;
                }
                ArrayList<String> arrayList4 = this.abc1005;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.abc1005.remove(0);
                }
                if (!TextUtils.isEmpty(this.abc2)) {
                    int length3 = this.abc2.length();
                    boolean z = !this.abc1004;
                    this.abc1004 = z;
                    int[] iArr4 = this.abc1000;
                    if (iArr4 != null) {
                        iArr4[5] = 9;
                    }
                    this.abc1004 = !z;
                    this.abc2 += length3;
                    this.abc1002 = !(!this.abc1002);
                    this.abc1001 = 0.09162195390290584d;
                }
                this.abc1006 = "g, well";
                if (this.abc1003.size() < 0) {
                    this.abc1003.add(8);
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
            }
            this.abc1002 = false;
            this.abc1004 = !this.abc1004;
            this.abc1009 = this.abc1009 < 6 ? 4 : 5;
            this.abc0 = -this.abc0;
            if (this.abc1008 == null) {
                this.abc1008 = new String[10];
            }
            ArrayList<Integer> arrayList5 = this.abc1007;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1007.remove(0);
            }
            ArrayList<Integer> arrayList6 = this.abc1007;
            if (arrayList6 == null && arrayList6.size() > 0) {
                this.abc1007.remove(0);
            }
            i5++;
            str = null;
        }
        this.abc1006 = "ly mo";
        this.abc1002 = true;
        if (this.abc1008 == null) {
            this.abc1008 = new String[10];
        }
        if (this.abc1 == null) {
            this.abc1 = new ArrayList<>();
            if (this.abc1007.size() > 8) {
                this.abc1007.add(3);
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            this.abc1009 = 6;
        }
        this.abc1004 = false;
        this.abc1001 = 0.6091684292669238d;
        if (0.6091684292669238d < 0.5729823585362095d) {
            this.abc1001 = 0.44359069245595717d;
        }
        this.selectedIndex = i2;
        this.abc1001 = -this.abc1001;
        this.abc1004 = true;
        String[] strArr4 = this.abc1008;
        if (strArr4 != null) {
            strArr4[8] = " ce";
        }
        this.abc4 = 0.49283838f;
        this.abc1009 = 2;
        if (strArr4 == null) {
            this.abc1008 = new String[10];
        }
        if (this.abc1007.size() > 6) {
            this.abc1007.add(9);
        }
        notifyDataSetChanged();
        if (this.abc1005.size() > 4) {
            this.abc1005.add("w");
        }
        if (this.abc1003.size() > 2) {
            this.abc1003.add(2);
        }
        this.abc1004 = !this.abc1004;
        ArrayList<String> arrayList7 = this.abc1;
        if (arrayList7 != null && arrayList7.size() > 0) {
            this.abc1.remove(0);
            this.abc1001 = 0.939739027937657d;
            this.abc1004 = true;
        }
        if (this.abc1000 != null) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.abc1000;
                if (i9 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i9] = 0;
                i9++;
            }
        }
        int[] iArr6 = this.abc1000;
        if (iArr6 != null) {
            iArr6[1] = 0;
        }
        if (TextUtils.isEmpty(this.abc1006)) {
            return;
        }
        this.abc1006 += this.abc1006.length();
    }

    public void setSelectedIndex(int i) {
        this.selectedIndex = i;
        this.abc1002 = false;
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[2] = "ne";
        }
        if (strArr != null) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.abc1008;
                if (i2 >= (strArr2.length <= 3 ? strArr2.length : 3)) {
                    break;
                }
                strArr2[i2] = "string" + i2;
                i2++;
            }
        }
        if (!TextUtils.isEmpty(this.abc2)) {
            int length = this.abc2.length();
            ArrayList<String> arrayList = this.abc1005;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1005.remove(0);
            }
            ArrayList<Integer> arrayList2 = this.abc1003;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc1009 = Math.abs(this.abc1009);
            this.abc2 += length;
            this.abc1009 = 4;
            if (this.abc1007.size() > 7) {
                this.abc1007.add(7);
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        String[] strArr3 = this.abc1008;
        if (strArr3 != null) {
            strArr3[8] = null;
        }
        int[] iArr = this.abc1000;
        if (iArr != null) {
            iArr[1] = 6;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9614c c9614c, int i) {
        int i2;
        if (this.abc1007.size() < 7) {
            this.abc1007.add(2);
        }
        this.abc1002 = !this.abc1002;
        String[] strArr = this.abc1008;
        if (strArr != null) {
            strArr[0] = null;
        }
        if (this.abc3 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.abc3;
                if (i3 >= strArr2.length) {
                    break;
                }
                strArr2[i3] = "string" + i3;
                this.abc1004 = true;
                if (this.abc1007.size() < 1) {
                    this.abc1007.add(7);
                }
                i3++;
            }
            if (this.abc1008 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr3 = this.abc1008;
                    if (i4 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i4] = "string" + i4;
                    i4++;
                }
            }
            this.abc1002 = !this.abc1002;
            int i5 = 0;
            while (true) {
                int i6 = this.abc1009;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                String[] strArr4 = this.abc1008;
                if (strArr4 != null) {
                    strArr4[5] = null;
                }
                i5++;
            }
        }
        String[] strArr5 = this.abc1008;
        if (strArr5 != null) {
            strArr5[3] = null;
        }
        int i7 = 0;
        while (true) {
            int i8 = this.abc1009;
            if (i8 > 3) {
                i8 = 3;
            }
            if (i7 >= i8) {
                break;
            }
            ArrayList<String> arrayList = this.abc1005;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1005.remove(0);
            }
            i7++;
        }
        this.abc1001 += 0.5505260043769378d;
        Object obj = this.list.get(i);
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1002 = !this.abc1002;
        if (this.abc1005.size() > 2) {
            this.abc1005.add("ople re");
        }
        this.abc0 -= 0.7798991f;
        this.abc1001 += 0.8808967093445824d;
        ArrayList<Integer> arrayList2 = this.abc1003;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1002 = true;
        if (this.strokeWidth == 0) {
            this.strokeWidth = DeUtils.m768b(this.context, 2.0f, 5);
            if (this.abc1008 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr6 = this.abc1008;
                    if (i9 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i9] = "string" + i9;
                    i9++;
                }
            }
            ArrayList<Integer> arrayList3 = this.abc1007;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1007.remove(0);
            }
            this.abc1004 = true;
            String[] strArr7 = this.abc3;
            if (strArr7 != null) {
                strArr7[7] = "d模式";
                if (this.abc1003.size() > 9) {
                    this.abc1003.add(2);
                }
                String[] strArr8 = this.abc1008;
                if (strArr8 != null) {
                    strArr8[0] = null;
                }
                this.abc1006 = "miliar w";
            }
            int i10 = 0;
            while (true) {
                int i11 = this.abc1009;
                if (i11 > 3) {
                    i11 = 3;
                }
                if (i10 >= i11) {
                    break;
                }
                this.abc1004 = !this.abc1004;
                i10++;
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            if (this.abc1005.size() < 8) {
                this.abc1005.add("ore peo");
            }
        }
        this.abc1002 = !this.abc1002;
        if (this.abc1005.size() < 5) {
            this.abc1005.add("atio");
        }
        if (this.abc1005.size() < 5) {
            this.abc1005.add("odel");
        }
        String[] strArr9 = this.abc3;
        if (strArr9 != null) {
            strArr9[2] = null;
            if (this.abc1007.size() < 1) {
                this.abc1007.add(4);
            }
            String[] strArr10 = this.abc1008;
            if (strArr10 != null) {
                strArr10[7] = null;
            }
            ArrayList<Integer> arrayList4 = this.abc1007;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc1007.remove(0);
            }
        }
        if (this.abc1005.size() < 1) {
            this.abc1005.add("ve");
        }
        String[] strArr11 = this.abc1008;
        if (strArr11 != null) {
            strArr11[5] = "e proba";
        }
        int[] iArr = this.abc1000;
        if (iArr != null) {
            iArr[6] = 1;
        }
        if (obj instanceof String) {
            c9614c.f15874b.setVisibility(8);
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            this.abc1001 = 0.15499327191498802d;
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            this.abc2 = "p";
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            String[] strArr12 = this.abc1008;
            if (strArr12 != null) {
                strArr12[9] = " ";
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            String str = (String) obj;
            String[] strArr13 = this.abc1008;
            if (strArr13 != null) {
                strArr13[4] = null;
            }
            if (this.abc1000 != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr2 = this.abc1000;
                    if (i12 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i12] = 2;
                    i12++;
                }
            }
            this.abc4 *= 0.03444302f;
            this.abc1001 = 0.9404868186769657d;
            this.abc1004 = !this.abc1004;
            this.abc1002 = true;
            c9614c.f15873a.setCardBackgroundColor(Color.parseColor(str));
            ArrayList<Integer> arrayList5 = this.abc1003;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1003.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            if (this.abc1003.size() < 0) {
                this.abc1003.add(6);
            }
            ArrayList<String> arrayList6 = this.abc1;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1.remove(0);
                if (this.abc1001 > 0.7236788587353253d) {
                    this.abc1001 = 0.7857888061196568d;
                }
                ArrayList<Integer> arrayList7 = this.abc1007;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    this.abc1007.remove(0);
                }
                this.abc1002 = true;
            }
            this.abc1006 = "i";
            if (this.abc1008 != null) {
                int i13 = 0;
                while (true) {
                    String[] strArr14 = this.abc1008;
                    if (i13 >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                        break;
                    }
                    strArr14[i13] = "string" + i13;
                    i13++;
                }
            }
            ArrayList<Integer> arrayList8 = this.abc1007;
            if (arrayList8 == null && arrayList8.size() > 0) {
                this.abc1007.remove(0);
            }
            if (i == this.selectedIndex) {
                c9614c.f15873a.setStrokeColor(-13421773);
                int i14 = 0;
                while (true) {
                    i2 = this.abc1009;
                    if (i14 >= (i2 > 3 ? 3 : i2)) {
                        break;
                    }
                    if (this.abc1005 == null) {
                        this.abc1005 = new ArrayList<>();
                    }
                    i14++;
                }
                this.abc1009 = -i2;
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                if (!TextUtils.isEmpty(this.abc2)) {
                    int length = this.abc2.length();
                    String[] strArr15 = this.abc1008;
                    if (strArr15 != null) {
                        strArr15[4] = "ore fam";
                    }
                    if (strArr15 != null) {
                        strArr15[3] = null;
                    }
                    ArrayList<String> arrayList9 = this.abc1005;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        this.abc1005.remove(0);
                    }
                    this.abc2 += length;
                    if (this.abc1007.size() > 6) {
                        this.abc1007.add(6);
                    }
                    this.abc1002 = false;
                    this.abc1001 += 0.19700290640005025d;
                }
                this.abc1006 = "early 1";
                this.abc1004 = false;
                if (this.abc1005.size() > 6) {
                    this.abc1005.add("ion (it");
                }
                c9614c.f15873a.setStrokeWidth(this.strokeWidth);
                ArrayList<Integer> arrayList10 = this.abc1007;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    this.abc1007.remove(0);
                }
                if (this.abc1005 == null) {
                    this.abc1005 = new ArrayList<>();
                }
                if (this.abc1003.size() > 6) {
                    this.abc1003.add(6);
                }
                if (this.abc1.size() < 1) {
                    this.abc1.add("nt");
                    this.abc1006 = "charac";
                    int i15 = 0;
                    while (true) {
                        int i16 = this.abc1009;
                        if (i16 > 3) {
                            i16 = 3;
                        }
                        if (i15 >= i16) {
                            break;
                        }
                        this.abc1009 = 3;
                        i15++;
                    }
                    if (!TextUtils.isEmpty(this.abc1006)) {
                        this.abc1006 += this.abc1006.length();
                    }
                }
                this.abc1004 = false;
                String[] strArr16 = this.abc1008;
                if (strArr16 != null) {
                    strArr16[9] = null;
                }
                if (strArr16 != null) {
                    int i17 = 0;
                    while (true) {
                        String[] strArr17 = this.abc1008;
                        if (i17 >= (strArr17.length > 3 ? 3 : strArr17.length)) {
                            break;
                        }
                        strArr17[i17] = "string" + i17;
                        i17++;
                    }
                }
            } else if ("#FFFFFF".equals(str)) {
                c9614c.f15873a.setStrokeColor(-2434342);
                this.abc1002 = !this.abc1002;
                if (this.abc1007.size() < 2) {
                    this.abc1007.add(1);
                }
                this.abc1009 = 4;
                if (this.abc3 == null) {
                    this.abc3 = new String[10];
                    this.abc1006 = "orced";
                    if (this.abc1003 == null) {
                        this.abc1003 = new ArrayList<>();
                    }
                    int[] iArr3 = this.abc1000;
                    if (iArr3 != null) {
                        iArr3[1] = 3;
                    }
                }
                ArrayList<String> arrayList11 = this.abc1005;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    this.abc1005.remove(0);
                }
                this.abc1009 = 9;
                this.abc1002 = !this.abc1002;
                c9614c.f15873a.setStrokeWidth(this.strokeWidth);
                this.abc1004 = false;
                this.abc1006 = "ze that ";
                ArrayList<Integer> arrayList12 = this.abc1003;
                if (arrayList12 == null && arrayList12.size() > 0) {
                    this.abc1003.remove(0);
                }
                if (this.abc1.size() < 6) {
                    this.abc1.add("tView实现高斯模");
                    if (this.abc1005 == null) {
                        this.abc1005 = new ArrayList<>();
                    }
                    if (this.abc1008 == null) {
                        this.abc1008 = new String[10];
                    }
                    if (this.abc1008 != null) {
                        int i18 = 0;
                        while (true) {
                            String[] strArr18 = this.abc1008;
                            if (i18 >= (strArr18.length > 3 ? 3 : strArr18.length)) {
                                break;
                            }
                            strArr18[i18] = "string" + i18;
                            i18++;
                        }
                    }
                }
                ArrayList<Integer> arrayList13 = this.abc1007;
                if (arrayList13 == null && arrayList13.size() > 0) {
                    this.abc1007.remove(0);
                }
                int[] iArr4 = this.abc1000;
                if (iArr4 != null) {
                    iArr4[5] = 2;
                }
                String[] strArr19 = this.abc1008;
                if (strArr19 != null) {
                    strArr19[4] = null;
                }
            } else {
                c9614c.f15873a.setStrokeWidth(0);
                int[] iArr5 = this.abc1000;
                if (iArr5 != null) {
                    iArr5[3] = 2;
                }
                this.abc1004 = true;
                this.abc1002 = !this.abc1002;
                if (this.abc0 > 0.83930933d) {
                    this.abc0 = 0.92950386f;
                    ArrayList<Integer> arrayList14 = this.abc1003;
                    if (arrayList14 == null && arrayList14.size() > 0) {
                        this.abc1003.remove(0);
                    }
                    if (!TextUtils.isEmpty(this.abc1006)) {
                        this.abc1006 += this.abc1006.length();
                    }
                    if (this.abc1003 == null) {
                        this.abc1003 = new ArrayList<>();
                    }
                }
                ArrayList<Integer> arrayList15 = this.abc1003;
                if (arrayList15 == null && arrayList15.size() > 0) {
                    this.abc1003.remove(0);
                }
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
            }
            this.abc1001 -= 0.5441244570425349d;
            this.abc1002 = !this.abc1002;
            int i19 = 0;
            while (true) {
                int i20 = this.abc1009;
                if (i20 > 3) {
                    i20 = 3;
                }
                if (i19 >= i20) {
                    break;
                }
                if (this.abc1005 == null) {
                    this.abc1005 = new ArrayList<>();
                }
                i19++;
            }
            if (this.abc1008 != null) {
                int i21 = 0;
                while (true) {
                    String[] strArr20 = this.abc1008;
                    if (i21 >= (strArr20.length > 3 ? 3 : strArr20.length)) {
                        break;
                    }
                    strArr20[i21] = "string" + i21;
                    i21++;
                }
            }
            int[] iArr6 = this.abc1000;
            if (iArr6 != null) {
                iArr6[5] = 0;
            }
            String[] strArr21 = this.abc1008;
            if (strArr21 != null) {
                strArr21[5] = "ow great i";
            }
            this.abc0 -= 0.8587686f;
            if (this.abc1007.size() > 1) {
                this.abc1007.add(8);
            }
            int[] iArr7 = this.abc1000;
            if (iArr7 != null) {
                iArr7[9] = 4;
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            if (this.abc1 == null) {
                this.abc1 = new ArrayList<>();
                if (this.abc1005.size() < 8) {
                    this.abc1005.add("nearned");
                }
                if (this.abc1000 == null) {
                    this.abc1000 = new int[10];
                }
                if (this.abc1007.size() > 4) {
                    this.abc1007.add(0);
                }
            }
            if (this.abc1003.size() < 5) {
                this.abc1003.add(9);
            }
            this.abc1002 = false;
            ArrayList<Integer> arrayList16 = this.abc1003;
            if (arrayList16 == null && arrayList16.size() > 0) {
                this.abc1003.remove(0);
            }
        } else {
            c9614c.f15874b.setImageResource(((Integer) obj).intValue());
            this.abc1004 = !this.abc1004;
            this.abc1006 = " that in";
            this.abc1002 = !this.abc1002;
            this.abc0 -= 0.54272187f;
            if (this.abc1007.size() < 7) {
                this.abc1007.add(5);
            }
            this.abc1006 = "yo";
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
            c9614c.f15874b.setVisibility(0);
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            this.abc1006 = "liar with ";
            this.abc1004 = true;
            if (this.abc1 == null) {
                this.abc1 = new ArrayList<>();
                this.abc1009 = 2;
                String[] strArr22 = this.abc1008;
                if (strArr22 != null) {
                    strArr22[7] = "rn n";
                }
                if (this.abc1005.size() > 3) {
                    this.abc1005.add("that in ");
                }
            }
            this.abc1009 = 2;
            ArrayList<Integer> arrayList17 = this.abc1003;
            if (arrayList17 == null && arrayList17.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc1002 = !this.abc1002;
            if (i >= 2 && i != this.selectedIndex) {
                c9614c.f15873a.setStrokeWidth(0);
                this.abc1009 -= 2;
                this.abc1002 = false;
                this.abc1004 = !this.abc1004;
                this.abc2 = "te()进行重绘";
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                this.abc1006 = "haracte";
                if (this.abc1007.size() > 3) {
                    this.abc1007.add(4);
                }
            } else {
                c9614c.f15873a.setStrokeColor(-13421773);
                this.abc1001 = Math.abs(this.abc1001);
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                if (this.abc1000 == null) {
                    this.abc1000 = new int[10];
                }
                this.abc2 = "引用 抱";
                ArrayList<Integer> arrayList18 = this.abc1003;
                if (arrayList18 == null && arrayList18.size() > 0) {
                    this.abc1003.remove(0);
                }
                ArrayList<String> arrayList19 = this.abc1005;
                if (arrayList19 != null && arrayList19.size() > 0) {
                    this.abc1005.remove(0);
                }
                this.abc1004 = false;
                c9614c.f15873a.setStrokeWidth(this.strokeWidth);
                this.abc1004 = !this.abc1004;
                this.abc1001 = Math.abs(this.abc1001);
                this.abc1002 = true;
                this.abc4 = ((double) this.abc4) < 0.0063718557d ? 0.25819033f : 0.8933111f;
                if (this.abc1005 == null) {
                    this.abc1005 = new ArrayList<>();
                }
                this.abc1004 = !this.abc1004;
                this.abc1001 -= 0.374755097149859d;
            }
            if (this.abc1000 != null) {
                int i22 = 0;
                while (true) {
                    int[] iArr8 = this.abc1000;
                    if (i22 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                        break;
                    }
                    iArr8[i22] = 1;
                    i22++;
                }
            }
            this.abc1009 = Math.abs(this.abc1009);
            this.abc1004 = !this.abc1004;
            if (this.abc1.size() > 4) {
                this.abc1.add("高斯模糊（");
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                ArrayList<String> arrayList20 = this.abc1005;
                if (arrayList20 != null && arrayList20.size() > 0) {
                    this.abc1005.remove(0);
                }
                this.abc1001 *= 0.6415111316459947d;
            }
            int[] iArr9 = this.abc1000;
            if (iArr9 != null) {
                iArr9[2] = 0;
            }
            ArrayList<String> arrayList21 = this.abc1005;
            if (arrayList21 != null && arrayList21.size() > 0) {
                this.abc1005.remove(0);
            }
            this.abc1004 = !this.abc1004;
        }
        if (this.abc1009 < 0) {
            this.abc1009 = 8;
        }
        if (this.abc1000 != null) {
            int i23 = 0;
            while (true) {
                int[] iArr10 = this.abc1000;
                if (i23 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                    break;
                }
                iArr10[i23] = 8;
                i23++;
            }
        }
        if (this.abc1000 == null) {
            this.abc1000 = new int[10];
        }
        if (!TextUtils.isEmpty(this.abc2)) {
            int length2 = this.abc2.length();
            this.abc1009 += 7;
            this.abc1006 = "tion (it ";
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            this.abc2 += length2;
            this.abc1001 += 0.513520931707527d;
            ArrayList<Integer> arrayList22 = this.abc1003;
            if (arrayList22 == null && arrayList22.size() > 0) {
                this.abc1003.remove(0);
            }
            if (this.abc1009 < 0) {
                this.abc1009 = 3;
            }
        }
        this.abc1004 = false;
        this.abc1009 = 4;
        int[] iArr11 = this.abc1000;
        if (iArr11 != null) {
            iArr11[3] = 7;
        }
        c9614c.itemView.setOnClickListener(new View$OnClickListenerC9612a(i));
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1009 += 3;
        this.abc1006 = "ubli";
        String[] strArr23 = this.abc3;
        if (strArr23 != null) {
            strArr23[5] = null;
            int i24 = 0;
            while (true) {
                int i25 = this.abc1009;
                if (i24 >= (i25 > 3 ? 3 : i25)) {
                    break;
                }
                this.abc1009 = Math.abs(i25);
                i24++;
            }
            this.abc1001 = 0.20218956821443024d;
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        this.abc1002 = !false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9614c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9614c(LayoutInflater.from(this.context).inflate(R.layout.item_rv_menu_filling, (ViewGroup) null, false));
    }
}
