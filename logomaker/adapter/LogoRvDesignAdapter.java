package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.logomaster.logomaker.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class LogoRvDesignAdapter extends RecyclerView.Adapter<C9611d> {
    private static final String TAG = "LogoRvDesignAdapter";
    public int[] abc1000;
    public int[] abc1001;
    public int abc10010;
    public boolean abc10014;
    public double abc10016;
    public ArrayList<Integer> abc1009;
    public boolean abc2;
    private Context context;
    private SimpleDateFormat formatter;
    private boolean isShowCheckedBox;
    private List<LogoDesignEntity> list;
    private Map<String, Bitmap> map;
    private InterfaceC9610c onItemMenuClickListner;
    private int strokeWidth;
    public int abc0 = 0;
    public int[] abc1002 = new int[16];
    public int[] abc1003 = new int[15];
    public int[] abc1 = new int[14];
    public String[] abc1004 = new String[13];
    public int[] abc1005 = new int[17];
    public int[] abc1006 = new int[12];
    public String abc1007 = "ple re";
    public ArrayList<Integer> abc3 = new ArrayList<>();
    public int[] abc1008 = new int[10];
    private int selectIndex = -1;
    public int abc4 = 7;
    public String[] abc10011 = new String[10];
    public String abc5 = ")王潇_sunshi";
    public double abc10012 = 0.634872918842577d;
    public String[] abc10013 = new String[15];
    public String[] abc6 = new String[16];
    private boolean isFirst = true;
    public float abc10015 = 0.24553084f;

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvDesignAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9608a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15858a;

        /* renamed from: b */
        public final /* synthetic */ LogoDesignEntity f15859b;

        public View$OnClickListenerC9608a(int i, LogoDesignEntity logoDesignEntity) {
            this.f15858a = i;
            this.f15859b = logoDesignEntity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LogoRvDesignAdapter.this.onItemMenuClickListner != null) {
                LogoRvDesignAdapter.this.onItemMenuClickListner.mo9196b(this.f15858a, this.f15859b);
                LogoRvDesignAdapter logoRvDesignAdapter = LogoRvDesignAdapter.this;
                if (logoRvDesignAdapter.abc10012 < 0.828525003806419d) {
                    logoRvDesignAdapter.abc10012 = 0.9509360529301688d;
                }
                logoRvDesignAdapter.abc10010 -= 6;
                if (logoRvDesignAdapter.abc1000 == null) {
                    logoRvDesignAdapter.abc1000 = new int[10];
                }
                ArrayList<Integer> arrayList = logoRvDesignAdapter.abc3;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoRvDesignAdapter.this.abc3.remove(0);
                    LogoRvDesignAdapter logoRvDesignAdapter2 = LogoRvDesignAdapter.this;
                    logoRvDesignAdapter2.abc10014 = true;
                    int[] iArr = logoRvDesignAdapter2.abc1000;
                    if (iArr != null) {
                        iArr[9] = 9;
                    }
                    if (iArr != null) {
                        int i = 0;
                        while (true) {
                            int[] iArr2 = LogoRvDesignAdapter.this.abc1000;
                            if (i >= (iArr2.length <= 3 ? iArr2.length : 3)) {
                                break;
                            }
                            iArr2[i] = 9;
                            i++;
                        }
                    }
                }
                LogoRvDesignAdapter logoRvDesignAdapter3 = LogoRvDesignAdapter.this;
                String[] strArr = logoRvDesignAdapter3.abc10013;
                if (strArr != null) {
                    strArr[5] = "g only u";
                }
                int[] iArr3 = logoRvDesignAdapter3.abc1002;
                if (iArr3 != null) {
                    iArr3[2] = 6;
                }
                int[] iArr4 = logoRvDesignAdapter3.abc1005;
                if (iArr4 != null) {
                    iArr4[8] = 0;
                }
            }
            ArrayList<Integer> arrayList2 = LogoRvDesignAdapter.this.abc1009;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoRvDesignAdapter.this.abc1009.remove(0);
            }
            LogoRvDesignAdapter logoRvDesignAdapter4 = LogoRvDesignAdapter.this;
            if (logoRvDesignAdapter4.abc10011 == null) {
                logoRvDesignAdapter4.abc10011 = new String[10];
            }
            logoRvDesignAdapter4.abc10016 *= 0.660120888948328d;
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvDesignAdapter$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9609b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ LogoDesignEntity f15861a;

        /* renamed from: b */
        public final /* synthetic */ int f15862b;

        public View$OnClickListenerC9609b(LogoDesignEntity logoDesignEntity, int i) {
            this.f15861a = logoDesignEntity;
            this.f15862b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoDesignEntity logoDesignEntity;
            if (LogoRvDesignAdapter.this.onItemMenuClickListner != null) {
                if (LogoRvDesignAdapter.this.isShowCheckedBox) {
                    this.f15861a.m244f(!logoDesignEntity.m245e());
                    LogoRvDesignAdapter logoRvDesignAdapter = LogoRvDesignAdapter.this;
                    if (logoRvDesignAdapter.abc1005 == null) {
                        logoRvDesignAdapter.abc1005 = new int[10];
                    }
                    if (logoRvDesignAdapter.abc1006 != null) {
                        int i = 0;
                        while (true) {
                            int[] iArr = LogoRvDesignAdapter.this.abc1006;
                            if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                                break;
                            }
                            iArr[i] = 0;
                            i++;
                        }
                    }
                    LogoRvDesignAdapter logoRvDesignAdapter2 = LogoRvDesignAdapter.this;
                    String[] strArr = logoRvDesignAdapter2.abc10011;
                    if (strArr != null) {
                        strArr[7] = null;
                    }
                    logoRvDesignAdapter2.abc2 = !logoRvDesignAdapter2.abc2;
                    logoRvDesignAdapter2.abc10012 = Math.abs(logoRvDesignAdapter2.abc10012);
                    LogoRvDesignAdapter logoRvDesignAdapter3 = LogoRvDesignAdapter.this;
                    logoRvDesignAdapter3.abc10010 *= 7;
                    if (logoRvDesignAdapter3.abc10011 != null) {
                        int i2 = 0;
                        while (true) {
                            String[] strArr2 = LogoRvDesignAdapter.this.abc10011;
                            if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i2] = "string" + i2;
                            i2++;
                        }
                    }
                    LogoRvDesignAdapter.this.notifyItemChanged(this.f15862b);
                    LogoRvDesignAdapter logoRvDesignAdapter4 = LogoRvDesignAdapter.this;
                    if (logoRvDesignAdapter4.abc1009 == null) {
                        logoRvDesignAdapter4.abc1009 = new ArrayList<>();
                    }
                    LogoRvDesignAdapter logoRvDesignAdapter5 = LogoRvDesignAdapter.this;
                    int[] iArr2 = logoRvDesignAdapter5.abc1008;
                    if (iArr2 != null) {
                        iArr2[3] = 3;
                    }
                    int[] iArr3 = logoRvDesignAdapter5.abc1005;
                    if (iArr3 != null) {
                        iArr3[0] = 5;
                    }
                    logoRvDesignAdapter5.abc4++;
                    if (iArr3 != null) {
                        iArr3[8] = 0;
                    }
                    String[] strArr3 = logoRvDesignAdapter5.abc1004;
                    if (strArr3 != null) {
                        strArr3[1] = "th its pl";
                    }
                    if (iArr2 != null) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr4 = LogoRvDesignAdapter.this.abc1008;
                            if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                                break;
                            }
                            iArr4[i3] = 9;
                            i3++;
                        }
                    }
                    LogoRvDesignAdapter.this.onItemMenuClickListner.mo9197a(this.f15862b, this.f15861a.m245e());
                    if (LogoRvDesignAdapter.this.abc1006 != null) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr5 = LogoRvDesignAdapter.this.abc1006;
                            if (i4 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                                break;
                            }
                            iArr5[i4] = 3;
                            i4++;
                        }
                    }
                    if (LogoRvDesignAdapter.this.abc1002 != null) {
                        int i5 = 0;
                        while (true) {
                            int[] iArr6 = LogoRvDesignAdapter.this.abc1002;
                            if (i5 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                                break;
                            }
                            iArr6[i5] = 3;
                            i5++;
                        }
                    }
                    LogoRvDesignAdapter logoRvDesignAdapter6 = LogoRvDesignAdapter.this;
                    logoRvDesignAdapter6.abc10010 = 2;
                    String[] strArr4 = logoRvDesignAdapter6.abc6;
                    if (strArr4 != null) {
                        strArr4[5] = null;
                        if (logoRvDesignAdapter6.abc1004 == null) {
                            logoRvDesignAdapter6.abc1004 = new String[10];
                        }
                        logoRvDesignAdapter6.abc1007 = "s modernit";
                        if (!TextUtils.isEmpty("s modernit")) {
                            int length = LogoRvDesignAdapter.this.abc1007.length();
                            LogoRvDesignAdapter.this.abc1007 = LogoRvDesignAdapter.this.abc1007 + length;
                        }
                    }
                    if (LogoRvDesignAdapter.this.abc1004 != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr5 = LogoRvDesignAdapter.this.abc1004;
                            if (i6 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                                break;
                            }
                            strArr5[i6] = "string" + i6;
                            i6++;
                        }
                    }
                    LogoRvDesignAdapter logoRvDesignAdapter7 = LogoRvDesignAdapter.this;
                    logoRvDesignAdapter7.abc10012 = Math.abs(logoRvDesignAdapter7.abc10012);
                    int[] iArr7 = LogoRvDesignAdapter.this.abc1006;
                    if (iArr7 != null) {
                        iArr7[0] = 0;
                    }
                } else {
                    LogoRvDesignAdapter.this.onItemMenuClickListner.mo9195c(this.f15862b, this.f15861a);
                    LogoRvDesignAdapter logoRvDesignAdapter8 = LogoRvDesignAdapter.this;
                    String[] strArr6 = logoRvDesignAdapter8.abc1004;
                    if (strArr6 != null) {
                        strArr6[9] = null;
                    }
                    logoRvDesignAdapter8.abc10015 = ((double) logoRvDesignAdapter8.abc10015) < 0.4019137d ? 0.52290845f : 0.6220583f;
                    String[] strArr7 = logoRvDesignAdapter8.abc10013;
                    if (strArr7 != null) {
                        strArr7[3] = null;
                    }
                    logoRvDesignAdapter8.abc4++;
                    if (logoRvDesignAdapter8.abc10016 < 0.44511778744852104d) {
                        logoRvDesignAdapter8.abc10016 = 0.3458888119601645d;
                    }
                    if (logoRvDesignAdapter8.abc1008 == null) {
                        logoRvDesignAdapter8.abc1008 = new int[10];
                    }
                    logoRvDesignAdapter8.abc10012 = -logoRvDesignAdapter8.abc10012;
                }
                LogoRvDesignAdapter logoRvDesignAdapter9 = LogoRvDesignAdapter.this;
                if (logoRvDesignAdapter9.abc1005 == null) {
                    logoRvDesignAdapter9.abc1005 = new int[10];
                }
                if (logoRvDesignAdapter9.abc1005 != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr8 = LogoRvDesignAdapter.this.abc1005;
                        if (i7 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                            break;
                        }
                        iArr8[i7] = 2;
                        i7++;
                    }
                }
                LogoRvDesignAdapter logoRvDesignAdapter10 = LogoRvDesignAdapter.this;
                String[] strArr8 = logoRvDesignAdapter10.abc10013;
                if (strArr8 != null) {
                    strArr8[4] = null;
                }
                if (logoRvDesignAdapter10.abc3 == null) {
                    logoRvDesignAdapter10.abc3 = new ArrayList<>();
                    LogoRvDesignAdapter logoRvDesignAdapter11 = LogoRvDesignAdapter.this;
                    int[] iArr9 = logoRvDesignAdapter11.abc1006;
                    if (iArr9 != null) {
                        iArr9[1] = 0;
                    }
                    int[] iArr10 = logoRvDesignAdapter11.abc1000;
                    if (iArr10 != null) {
                        iArr10[9] = 0;
                    }
                    if (logoRvDesignAdapter11.abc10015 > 0.35064572d) {
                        logoRvDesignAdapter11.abc10015 = 0.2768427f;
                    }
                }
                LogoRvDesignAdapter logoRvDesignAdapter12 = LogoRvDesignAdapter.this;
                if (logoRvDesignAdapter12.abc1002 == null) {
                    logoRvDesignAdapter12.abc1002 = new int[10];
                }
                logoRvDesignAdapter12.abc10010 = 4;
                if (logoRvDesignAdapter12.abc1005 != null) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr11 = LogoRvDesignAdapter.this.abc1005;
                        if (i8 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                            break;
                        }
                        iArr11[i8] = 2;
                        i8++;
                    }
                }
            }
            LogoRvDesignAdapter logoRvDesignAdapter13 = LogoRvDesignAdapter.this;
            int[] iArr12 = logoRvDesignAdapter13.abc1008;
            if (iArr12 != null) {
                iArr12[3] = 0;
            }
            if (logoRvDesignAdapter13.abc10011 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr9 = LogoRvDesignAdapter.this.abc10011;
                    if (i9 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                        break;
                    }
                    strArr9[i9] = "string" + i9;
                    i9++;
                }
            }
            LogoRvDesignAdapter logoRvDesignAdapter14 = LogoRvDesignAdapter.this;
            int[] iArr13 = logoRvDesignAdapter14.abc1001;
            if (iArr13 != null) {
                iArr13[2] = 0;
            }
            if (logoRvDesignAdapter14.abc1 == null) {
                logoRvDesignAdapter14.abc1 = new int[10];
                logoRvDesignAdapter14.abc10016 -= 0.2190709410195495d;
                logoRvDesignAdapter14.abc10012 = 0.8310019737733209d;
                if (logoRvDesignAdapter14.abc1004 == null) {
                    logoRvDesignAdapter14.abc1004 = new String[10];
                }
            }
            if (!TextUtils.isEmpty(logoRvDesignAdapter14.abc1007)) {
                int length2 = LogoRvDesignAdapter.this.abc1007.length();
                LogoRvDesignAdapter.this.abc1007 = LogoRvDesignAdapter.this.abc1007 + length2;
            }
            LogoRvDesignAdapter logoRvDesignAdapter15 = LogoRvDesignAdapter.this;
            int[] iArr14 = logoRvDesignAdapter15.abc1001;
            if (iArr14 != null) {
                iArr14[3] = 0;
            }
            logoRvDesignAdapter15.abc1007 = "ti";
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvDesignAdapter$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9610c {
        /* renamed from: a */
        void mo9197a(int i, boolean z);

        /* renamed from: b */
        void mo9196b(int i, LogoDesignEntity logoDesignEntity);

        /* renamed from: c */
        void mo9195c(int i, LogoDesignEntity logoDesignEntity);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvDesignAdapter$d */
    /* loaded from: classes3.dex */
    public class C9611d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f15864a;

        /* renamed from: b */
        public TextView f15865b;

        /* renamed from: c */
        public TextView f15866c;

        /* renamed from: d */
        public ImageView f15867d;

        /* renamed from: e */
        public ImageView f15868e;

        /* renamed from: f */
        public MaterialCardView f15869f;

        public C9611d(@NonNull View view) {
            super(view);
            this.f15864a = (ImageView) view.findViewById(R.id.iv_logo);
            this.f15865b = (TextView) view.findViewById(R.id.tv_folder_name);
            this.f15866c = (TextView) view.findViewById(R.id.tv_last_modified);
            this.f15867d = (ImageView) view.findViewById(R.id.iv_more);
            this.f15868e = (ImageView) view.findViewById(R.id.iv_checked);
            this.f15869f = (MaterialCardView) view.findViewById(R.id.mcv_item);
        }
    }

    public LogoRvDesignAdapter(List<LogoDesignEntity> list, Context context) {
        this.abc1000 = new int[13];
        this.list = null;
        this.abc1001 = new int[17];
        this.abc2 = false;
        this.abc1009 = new ArrayList<>();
        this.abc10010 = 6;
        this.abc10014 = false;
        this.abc10016 = 0.6232940742169234d;
        this.list = list;
        int[] iArr = this.abc1003;
        if (iArr != null) {
            iArr[5] = 6;
        }
        this.abc10016 = 0.6232940742169234d > 0.3336385227982861d ? 0.5887227409544539d : 0.9998726738260756d;
        String[] strArr = this.abc1004;
        if (strArr != null) {
            strArr[2] = "u r";
        }
        this.abc2 = !this.abc2;
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        this.abc10014 = true;
        this.abc10010 = Math.abs(6);
        this.context = context;
        if (this.abc1000 == null) {
            this.abc1000 = new int[10];
        }
        int[] iArr2 = this.abc1008;
        if (iArr2 != null) {
            iArr2[2] = 8;
        }
        this.abc10016 = 0.6316106698367001d;
        this.abc0 += 0;
        int[] iArr3 = this.abc1000;
        if (iArr3 != null) {
            iArr3[0] = 7;
        }
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        int[] iArr4 = this.abc1003;
        if (iArr4 != null) {
            iArr4[2] = 6;
        }
        this.map = new HashMap();
        String[] strArr2 = this.abc10011;
        if (strArr2 != null) {
            strArr2[1] = null;
        }
        int[] iArr5 = this.abc1008;
        if (iArr5 != null) {
            iArr5[7] = 0;
        }
        this.abc10010 -= 4;
    }

    public void addData(LogoDesignEntity logoDesignEntity) {
        this.list.add(0, logoDesignEntity);
        this.abc10014 = !this.abc10014;
        String[] strArr = this.abc10011;
        if (strArr != null) {
            strArr[9] = "r a book w";
        }
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        notifyItemInserted(0);
        int[] iArr = this.abc1000;
        if (iArr != null) {
            iArr[0] = 0;
        }
        this.abc10015 *= 0.28240323f;
        int[] iArr2 = this.abc1003;
        if (iArr2 != null) {
            iArr2[3] = 0;
        }
        notifyItemRangeChanged(0, this.list.size());
        if (this.abc1000 != null) {
            int i = 0;
            while (true) {
                int[] iArr3 = this.abc1000;
                if (i >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i] = 4;
                i++;
            }
        }
        this.abc10016 = 0.6222186497995045d;
        int[] iArr4 = this.abc1002;
        if (iArr4 != null) {
            iArr4[0] = 1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public List<LogoDesignEntity> getList() {
        return this.list;
    }

    public boolean isShowCheckedBox() {
        return this.isShowCheckedBox;
    }

    public void remove(int i) {
        this.list.remove(i);
        if (this.abc10012 < 0.4160489720706959d) {
            this.abc10012 = 0.2932579400051063d;
        }
        if (this.abc1002 == null) {
            this.abc1002 = new int[10];
        }
        if (this.abc1006 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.abc1006;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 9;
                i2++;
            }
        }
        this.abc2 = true;
        if (this.abc1006 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.abc1006;
                if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i3] = 6;
                i3++;
            }
        }
        if (this.abc10011 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr = this.abc10011;
                if (i4 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i4] = "string" + i4;
                i4++;
            }
        }
        if (this.abc1000 != null) {
            int i5 = 0;
            while (true) {
                int[] iArr3 = this.abc1000;
                if (i5 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i5] = 9;
                i5++;
            }
        }
        notifyItemRemoved(i);
        int[] iArr4 = this.abc1001;
        if (iArr4 != null) {
            iArr4[0] = 5;
        }
        if (this.abc1000 == null) {
            this.abc1000 = new int[10];
        }
        if (!TextUtils.isEmpty(this.abc1007)) {
            this.abc1007 += this.abc1007.length();
        }
        String[] strArr2 = this.abc6;
        if (strArr2 != null) {
            strArr2[5] = null;
            this.abc10014 = !this.abc10014;
            this.abc10015 = -this.abc10015;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
        }
        if (this.abc10013 == null) {
            this.abc10013 = new String[10];
        }
        String[] strArr3 = this.abc1004;
        if (strArr3 != null) {
            strArr3[3] = "t";
        }
        int i6 = 0;
        while (true) {
            int i7 = this.abc10010;
            if (i7 > 3) {
                i7 = 3;
            }
            if (i6 >= i7) {
                break;
            }
            int[] iArr5 = this.abc1003;
            if (iArr5 != null) {
                iArr5[1] = 0;
            }
            i6++;
        }
        notifyItemRangeRemoved(i, this.list.size() - i);
        int[] iArr6 = this.abc1000;
        if (iArr6 != null) {
            iArr6[2] = 8;
        }
        this.abc10014 = true;
        String[] strArr4 = this.abc1004;
        if (strArr4 != null) {
            strArr4[1] = "an";
        }
        this.abc2 = false;
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        int[] iArr7 = this.abc1008;
        if (iArr7 != null) {
            iArr7[8] = 5;
        }
        if (this.abc1003 == null) {
            this.abc1003 = new int[10];
        }
    }

    public void setData(List<LogoDesignEntity> list) {
        this.list = list;
        if (!TextUtils.isEmpty(this.abc1007)) {
            this.abc1007 += this.abc1007.length();
        }
        if (this.abc10011 == null) {
            this.abc10011 = new String[10];
        }
        this.abc10014 = true;
        this.isFirst = true;
        int[] iArr = this.abc1006;
        int i = 0;
        if (iArr != null) {
            iArr[9] = 0;
        }
        if (iArr != null) {
            iArr[5] = 0;
        }
        this.abc10016 = Math.abs(this.abc10016);
        if (this.abc3 == null) {
            this.abc3 = new ArrayList<>();
            int[] iArr2 = this.abc1002;
            if (iArr2 != null) {
                iArr2[4] = 0;
            }
            this.abc1007 = "ed";
            String[] strArr = this.abc10011;
            if (strArr != null) {
                strArr[0] = null;
            }
        }
        int[] iArr3 = this.abc1008;
        if (iArr3 != null) {
            iArr3[2] = 0;
        }
        String[] strArr2 = this.abc1004;
        if (strArr2 != null) {
            strArr2[4] = null;
        }
        this.abc10012 = -this.abc10012;
        for (Map.Entry<String, Bitmap> entry : this.map.entrySet()) {
            Bitmap value = entry.getValue();
            if (this.abc1009 == null) {
                this.abc1009 = new ArrayList<>();
            }
            if (this.abc1008 == null) {
                this.abc1008 = new int[10];
            }
            this.abc10016 = 0.42738557010301703d;
            if (value != null) {
                value.recycle();
                if (this.abc1008 == null) {
                    this.abc1008 = new int[10];
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new int[10];
                }
                if (this.abc1008 == null) {
                    this.abc1008 = new int[10];
                }
            }
            this.abc10014 = false;
            if (this.abc1003 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr4 = this.abc1003;
                    if (i2 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i2] = 8;
                    i2++;
                }
            }
            if (this.abc1003 == null) {
                this.abc1003 = new int[10];
            }
        }
        if (this.abc1006 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr5 = this.abc1006;
                if (i3 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i3] = 7;
                i3++;
            }
        }
        this.abc10015 = 0.5524854f;
        this.abc10012 *= 0.4885731969693271d;
        this.map.clear();
        int[] iArr6 = this.abc1005;
        if (iArr6 != null) {
            iArr6[4] = 0;
        }
        if (iArr6 != null) {
            int i4 = 0;
            while (true) {
                int[] iArr7 = this.abc1005;
                if (i4 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                    break;
                }
                iArr7[i4] = 9;
                i4++;
            }
        }
        int[] iArr8 = this.abc1001;
        if (iArr8 != null) {
            iArr8[5] = 0;
        }
        notifyDataSetChanged();
        if (this.abc10012 > 0.4268486211590934d) {
            this.abc10012 = 0.6857034123922496d;
        }
        if (this.abc10013 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr3 = this.abc10013;
                if (i5 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i5] = "string" + i5;
                i5++;
            }
        }
        if (this.abc10011 != null) {
            while (true) {
                String[] strArr4 = this.abc10011;
                if (i >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i] = "string" + i;
                i++;
            }
        }
        this.abc2 = true;
        String[] strArr5 = this.abc1004;
        if (strArr5 != null) {
            strArr5[1] = null;
        }
        this.abc10012 = Math.abs(this.abc10012);
        this.abc1007 = "l you ";
    }

    public void setOnItemMenuClickListner(InterfaceC9610c interfaceC9610c) {
        this.onItemMenuClickListner = interfaceC9610c;
        String[] strArr = this.abc1004;
        if (strArr != null) {
            strArr[8] = "ng only un";
        }
        this.abc10014 = !this.abc10014;
        this.abc10016 = 0.8941403043880631d;
        String[] strArr2 = this.abc6;
        if (strArr2 != null) {
            strArr2[9] = null;
            if (!TextUtils.isEmpty(this.abc1007)) {
                this.abc1007 += this.abc1007.length();
            }
            int[] iArr = this.abc1003;
            if (iArr != null) {
                iArr[1] = 0;
            }
            if (this.abc10013 == null) {
                this.abc10013 = new String[10];
            }
        }
        this.abc10015 += 0.04974127f;
        int[] iArr2 = this.abc1008;
        if (iArr2 != null) {
            iArr2[6] = 0;
        }
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
    }

    public void setShowCheckedBox(boolean z) {
        this.isShowCheckedBox = z;
        int i = 0;
        if (this.abc1008 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.abc1008;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 8;
                i2++;
            }
        }
        if (this.abc10016 > 0.7561793153016466d) {
            this.abc10016 = 0.9159025573598519d;
        }
        ArrayList<Integer> arrayList = this.abc1009;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1009.remove(0);
        }
        this.abc5 = "步骤1";
        this.abc10014 = true;
        this.abc10010 = 6;
        if (this.abc1003 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = this.abc1003;
            if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                return;
            }
            iArr2[i] = 1;
            i++;
        }
    }

    public RequestOptions updateOptions(String str, long j) {
        RequestOptions requestOptions = new RequestOptions();
        if (!TextUtils.isEmpty(this.abc1007)) {
            this.abc1007 += this.abc1007.length();
        }
        int[] iArr = this.abc1003;
        if (iArr != null) {
            iArr[7] = 0;
        }
        if (iArr != null) {
            iArr[0] = 7;
        }
        try {
            requestOptions.m692W(new MediaStoreSignature(MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(".") + 1).toLowerCase()), j, 0));
        } catch (Exception unused) {
        }
        return requestOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:463:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0813  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindViewHolder(@androidx.annotation.NonNull com.logomaster.logomaker.adapter.LogoRvDesignAdapter.C9611d r24, int r25) {
        /*
            Method dump skipped, instructions count: 2653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.adapter.LogoRvDesignAdapter.onBindViewHolder(com.logomaster.logomaker.adapter.LogoRvDesignAdapter$d, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9611d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9611d(LayoutInflater.from(this.context).inflate(R.layout.item_rv_my_design, viewGroup, false));
    }
}
