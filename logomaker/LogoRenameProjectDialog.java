package com.logomaster.logomaker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.mbridge.msdk.foundation.p162db.CampaignClickDao;
import java.util.ArrayList;

/* renamed from: com.logomaster.logomaker.d */
/* loaded from: classes3.dex */
public class LogoRenameProjectDialog extends Dialog {

    /* renamed from: A */
    public int[] f16013A;

    /* renamed from: B */
    public float f16014B;

    /* renamed from: C */
    public String f16015C;

    /* renamed from: D */
    public double f16016D;

    /* renamed from: E */
    public int f16017E;

    /* renamed from: F */
    public int[] f16018F;

    /* renamed from: G */
    public InputMethodManager f16019G;

    /* renamed from: H */
    public double f16020H;

    /* renamed from: I */
    public String[] f16021I;

    /* renamed from: J */
    public ArrayList<Integer> f16022J;

    /* renamed from: a */
    public Context f16023a;

    /* renamed from: b */
    public ArrayList<String> f16024b;

    /* renamed from: c */
    public ArrayList<Integer> f16025c;

    /* renamed from: d */
    public boolean f16026d;

    /* renamed from: e */
    public InterfaceC9654e f16027e;

    /* renamed from: f */
    public String f16028f;

    /* renamed from: g */
    public ArrayList<Integer> f16029g;

    /* renamed from: h */
    public int[] f16030h;

    /* renamed from: i */
    public AppCompatImageView f16031i;

    /* renamed from: j */
    public float f16032j;

    /* renamed from: k */
    public int f16033k;

    /* renamed from: l */
    public String[] f16034l;

    /* renamed from: m */
    public ImageView f16035m;

    /* renamed from: n */
    public int f16036n;

    /* renamed from: o */
    public double f16037o;

    /* renamed from: p */
    public String f16038p;

    /* renamed from: q */
    public TextView f16039q;

    /* renamed from: r */
    public int[] f16040r;

    /* renamed from: s */
    public String[] f16041s;

    /* renamed from: t */
    public ArrayList<String> f16042t;

    /* renamed from: u */
    public TextView f16043u;

    /* renamed from: v */
    public int[] f16044v;

    /* renamed from: w */
    public double f16045w;

    /* renamed from: x */
    public ArrayList<Integer> f16046x;

    /* renamed from: y */
    public EditText f16047y;

    /* renamed from: z */
    public double f16048z;

    /* compiled from: LogoRenameProjectDialog.java */
    /* renamed from: com.logomaster.logomaker.d$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9650a implements View.OnClickListener {
        public View$OnClickListenerC9650a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRenameProjectDialog.this.f16047y.setText("");
            LogoRenameProjectDialog logoRenameProjectDialog = LogoRenameProjectDialog.this;
            String[] strArr = logoRenameProjectDialog.f16034l;
            if (strArr != null) {
                strArr[3] = " dull. M";
            }
            ArrayList<String> arrayList = logoRenameProjectDialog.f16042t;
            int i = 0;
            if (arrayList != null && arrayList.size() > 0) {
                LogoRenameProjectDialog.this.f16042t.remove(0);
            }
            ArrayList<Integer> arrayList2 = LogoRenameProjectDialog.this.f16046x;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoRenameProjectDialog.this.f16046x.remove(0);
            }
            LogoRenameProjectDialog logoRenameProjectDialog2 = LogoRenameProjectDialog.this;
            if (logoRenameProjectDialog2.f16041s == null) {
                logoRenameProjectDialog2.f16041s = new String[10];
                ArrayList<Integer> arrayList3 = logoRenameProjectDialog2.f16022J;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    LogoRenameProjectDialog.this.f16022J.remove(0);
                }
                LogoRenameProjectDialog logoRenameProjectDialog3 = LogoRenameProjectDialog.this;
                logoRenameProjectDialog3.f16048z = 0.6373859901269912d;
                int[] iArr = logoRenameProjectDialog3.f16030h;
                if (iArr != null) {
                    iArr[6] = 2;
                }
            }
            if (LogoRenameProjectDialog.this.f16046x.size() > 9) {
                LogoRenameProjectDialog.this.f16046x.add(6);
            }
            LogoRenameProjectDialog logoRenameProjectDialog4 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog4.f16048z = -logoRenameProjectDialog4.f16048z;
            if (logoRenameProjectDialog4.f16034l == null) {
                return;
            }
            while (true) {
                String[] strArr2 = LogoRenameProjectDialog.this.f16034l;
                if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    return;
                }
                strArr2[i] = "string" + i;
                i++;
            }
        }
    }

    /* compiled from: LogoRenameProjectDialog.java */
    /* renamed from: com.logomaster.logomaker.d$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9651b implements View.OnClickListener {
        public View$OnClickListenerC9651b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRenameProjectDialog logoRenameProjectDialog;
            LogoRenameProjectDialog.this.dismiss();
            if (!TextUtils.isEmpty(LogoRenameProjectDialog.this.f16028f)) {
                int length = LogoRenameProjectDialog.this.f16028f.length();
                LogoRenameProjectDialog.this.f16028f = LogoRenameProjectDialog.this.f16028f + length;
            }
            LogoRenameProjectDialog logoRenameProjectDialog2 = LogoRenameProjectDialog.this;
            if (logoRenameProjectDialog2.f16044v == null) {
                logoRenameProjectDialog2.f16044v = new int[10];
            }
            if (logoRenameProjectDialog2.f16034l != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoRenameProjectDialog.this.f16034l;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            int i2 = 0;
            while (true) {
                logoRenameProjectDialog = LogoRenameProjectDialog.this;
                if (i2 >= logoRenameProjectDialog.f16017E) {
                    break;
                }
                if (logoRenameProjectDialog.f16045w < 0.6551682411198096d) {
                    logoRenameProjectDialog.f16045w = 0.7259720486166904d;
                    if (logoRenameProjectDialog.f16022J.size() < 6) {
                        LogoRenameProjectDialog.this.f16022J.add(8);
                    }
                    if (!TextUtils.isEmpty(LogoRenameProjectDialog.this.f16028f)) {
                        int length2 = LogoRenameProjectDialog.this.f16028f.length();
                        LogoRenameProjectDialog.this.f16028f = LogoRenameProjectDialog.this.f16028f + length2;
                    }
                    LogoRenameProjectDialog logoRenameProjectDialog3 = LogoRenameProjectDialog.this;
                    logoRenameProjectDialog3.f16048z = logoRenameProjectDialog3.f16048z > 0.43511258631923366d ? 0.07676585685732251d : 0.8628253240572962d;
                }
                LogoRenameProjectDialog logoRenameProjectDialog4 = LogoRenameProjectDialog.this;
                int[] iArr = logoRenameProjectDialog4.f16040r;
                if (iArr != null) {
                    iArr[8] = 9;
                }
                logoRenameProjectDialog4.f16026d = true;
                if (logoRenameProjectDialog4.f16034l == null) {
                    logoRenameProjectDialog4.f16034l = new String[10];
                }
                i2++;
            }
            int[] iArr2 = logoRenameProjectDialog.f16018F;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            String[] strArr2 = logoRenameProjectDialog.f16034l;
            if (strArr2 != null) {
                strArr2[8] = "ville";
            }
            if (logoRenameProjectDialog.f16014B < 0.16014284d) {
                logoRenameProjectDialog.f16014B = 0.18853831f;
            }
        }
    }

    /* compiled from: LogoRenameProjectDialog.java */
    /* renamed from: com.logomaster.logomaker.d$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9652c implements View.OnClickListener {
        public View$OnClickListenerC9652c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRenameProjectDialog logoRenameProjectDialog;
            LogoRenameProjectDialog logoRenameProjectDialog2;
            LogoRenameProjectDialog logoRenameProjectDialog3;
            String trim = LogoRenameProjectDialog.this.f16047y.getText().toString().trim();
            LogoRenameProjectDialog logoRenameProjectDialog4 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog4.f16036n = -logoRenameProjectDialog4.f16036n;
            int i = 0;
            if (logoRenameProjectDialog4.f16044v != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = LogoRenameProjectDialog.this.f16044v;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 6;
                    i2++;
                }
            }
            LogoRenameProjectDialog.this.f16032j = 0.45351613f;
            int i3 = 0;
            while (true) {
                logoRenameProjectDialog = LogoRenameProjectDialog.this;
                if (i3 >= logoRenameProjectDialog.f16017E) {
                    break;
                }
                if (logoRenameProjectDialog.f16037o < 0.56884666908167d) {
                    logoRenameProjectDialog.f16037o = 0.32016015116536756d;
                    logoRenameProjectDialog.f16048z = 0.04409411493412729d;
                    if (!TextUtils.isEmpty(logoRenameProjectDialog.f16038p)) {
                        int length = LogoRenameProjectDialog.this.f16038p.length();
                        LogoRenameProjectDialog.this.f16038p = LogoRenameProjectDialog.this.f16038p + length;
                    }
                    LogoRenameProjectDialog logoRenameProjectDialog5 = LogoRenameProjectDialog.this;
                    if (logoRenameProjectDialog5.f16016D > 0.6992308081846758d) {
                        logoRenameProjectDialog5.f16016D = 0.12906837727708564d;
                    }
                }
                LogoRenameProjectDialog logoRenameProjectDialog6 = LogoRenameProjectDialog.this;
                logoRenameProjectDialog6.f16020H = -logoRenameProjectDialog6.f16020H;
                int i4 = 0;
                while (true) {
                    logoRenameProjectDialog3 = LogoRenameProjectDialog.this;
                    int i5 = logoRenameProjectDialog3.f16036n;
                    if (i5 > 3) {
                        i5 = 3;
                    }
                    if (i4 >= i5) {
                        break;
                    }
                    logoRenameProjectDialog3.f16014B += 0.8158616f;
                    i4++;
                }
                if (logoRenameProjectDialog3.f16040r != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr2 = LogoRenameProjectDialog.this.f16040r;
                        if (i6 < (iArr2.length > 3 ? 3 : iArr2.length)) {
                            iArr2[i6] = 6;
                            i6++;
                        }
                    }
                }
                i3++;
            }
            if (logoRenameProjectDialog.f16034l == null) {
                logoRenameProjectDialog.f16034l = new String[10];
            }
            int[] iArr3 = logoRenameProjectDialog.f16040r;
            if (iArr3 != null) {
                iArr3[9] = 0;
            }
            logoRenameProjectDialog.f16020H *= 0.4942876947846836d;
            if (!TextUtils.isEmpty(trim)) {
                LogoRenameProjectDialog.this.dismiss();
                LogoRenameProjectDialog logoRenameProjectDialog7 = LogoRenameProjectDialog.this;
                if (logoRenameProjectDialog7.f16020H > 0.9603007242431111d) {
                    logoRenameProjectDialog7.f16020H = 0.3380956182960754d;
                }
                if (logoRenameProjectDialog7.f16030h == null) {
                    logoRenameProjectDialog7.f16030h = new int[10];
                }
                int i7 = 0;
                while (true) {
                    logoRenameProjectDialog2 = LogoRenameProjectDialog.this;
                    int i8 = logoRenameProjectDialog2.f16036n;
                    if (i8 > 3) {
                        i8 = 3;
                    }
                    if (i7 >= i8) {
                        break;
                    }
                    int[] iArr4 = logoRenameProjectDialog2.f16018F;
                    if (iArr4 != null) {
                        iArr4[4] = 5;
                    }
                    i7++;
                }
                if (logoRenameProjectDialog2.f16041s == null) {
                    logoRenameProjectDialog2.f16041s = new String[10];
                    logoRenameProjectDialog2.f16048z = 0.7658297267177993d;
                    if (logoRenameProjectDialog2.f16022J == null) {
                        logoRenameProjectDialog2.f16022J = new ArrayList<>();
                    }
                    LogoRenameProjectDialog logoRenameProjectDialog8 = LogoRenameProjectDialog.this;
                    if (logoRenameProjectDialog8.f16018F == null) {
                        logoRenameProjectDialog8.f16018F = new int[10];
                    }
                }
                if (LogoRenameProjectDialog.this.f16042t.size() > 0) {
                    LogoRenameProjectDialog.this.f16042t.add("as");
                }
                LogoRenameProjectDialog logoRenameProjectDialog9 = LogoRenameProjectDialog.this;
                if (logoRenameProjectDialog9.f16032j < 0.9292512d) {
                    logoRenameProjectDialog9.f16032j = 0.16124088f;
                }
                logoRenameProjectDialog9.f16038p = "l is";
                if (logoRenameProjectDialog9.f16027e != null) {
                    LogoRenameProjectDialog.this.f16027e.mo9135a(trim);
                    LogoRenameProjectDialog logoRenameProjectDialog10 = LogoRenameProjectDialog.this;
                    logoRenameProjectDialog10.f16048z -= 0.34087057345728167d;
                    logoRenameProjectDialog10.f16016D *= 0.25098132404585205d;
                    if (logoRenameProjectDialog10.f16030h == null) {
                        logoRenameProjectDialog10.f16030h = new int[10];
                    }
                    logoRenameProjectDialog10.f16045w = logoRenameProjectDialog10.f16045w > 0.993437914771953d ? 0.8543225491094386d : 0.6003431771962331d;
                    logoRenameProjectDialog10.f16048z = 0.19287916901375346d;
                    int[] iArr5 = logoRenameProjectDialog10.f16018F;
                    if (iArr5 != null) {
                        iArr5[0] = 0;
                    }
                    if (logoRenameProjectDialog10.f16022J == null) {
                        logoRenameProjectDialog10.f16022J = new ArrayList<>();
                    }
                }
                LogoRenameProjectDialog logoRenameProjectDialog11 = LogoRenameProjectDialog.this;
                int[] iArr6 = logoRenameProjectDialog11.f16044v;
                if (iArr6 != null) {
                    iArr6[7] = 0;
                }
                logoRenameProjectDialog11.f16026d = !logoRenameProjectDialog11.f16026d;
                if (logoRenameProjectDialog11.f16042t == null) {
                    logoRenameProjectDialog11.f16042t = new ArrayList<>();
                }
                LogoRenameProjectDialog logoRenameProjectDialog12 = LogoRenameProjectDialog.this;
                String[] strArr = logoRenameProjectDialog12.f16021I;
                if (strArr != null) {
                    strArr[2] = "geView al.";
                    logoRenameProjectDialog12.f16048z -= 0.4453612500819999d;
                    if (logoRenameProjectDialog12.f16042t == null) {
                        logoRenameProjectDialog12.f16042t = new ArrayList<>();
                    }
                    LogoRenameProjectDialog.this.f16028f = "' h";
                }
                ArrayList<String> arrayList = LogoRenameProjectDialog.this.f16024b;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoRenameProjectDialog.this.f16024b.remove(0);
                }
                LogoRenameProjectDialog logoRenameProjectDialog13 = LogoRenameProjectDialog.this;
                logoRenameProjectDialog13.f16020H = logoRenameProjectDialog13.f16020H < 0.19360051877182582d ? 0.022887893344846533d : 0.27678698853477424d;
                ArrayList<String> arrayList2 = logoRenameProjectDialog13.f16024b;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoRenameProjectDialog.this.f16024b.remove(0);
                }
            }
            LogoRenameProjectDialog logoRenameProjectDialog14 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog14.f16016D = 0.3932050142083473d;
            ArrayList<String> arrayList3 = logoRenameProjectDialog14.f16042t;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoRenameProjectDialog.this.f16042t.remove(0);
            }
            if (LogoRenameProjectDialog.this.f16022J.size() > 1) {
                LogoRenameProjectDialog.this.f16022J.add(3);
            }
            LogoRenameProjectDialog logoRenameProjectDialog15 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog15.f16045w = 0.24114136259361652d;
            if (logoRenameProjectDialog15.f16018F != null) {
                while (true) {
                    int[] iArr7 = LogoRenameProjectDialog.this.f16018F;
                    if (i >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                        break;
                    }
                    iArr7[i] = 3;
                    i++;
                }
            }
            LogoRenameProjectDialog logoRenameProjectDialog16 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog16.f16014B = 0.109443665f;
            if (logoRenameProjectDialog16.f16018F == null) {
                logoRenameProjectDialog16.f16018F = new int[10];
            }
        }
    }

    /* compiled from: LogoRenameProjectDialog.java */
    /* renamed from: com.logomaster.logomaker.d$d */
    /* loaded from: classes3.dex */
    public class C9653d implements TextWatcher {
        public C9653d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LogoRenameProjectDialog logoRenameProjectDialog;
            LogoRenameProjectDialog logoRenameProjectDialog2;
            if (TextUtils.isEmpty(editable.toString().trim())) {
                LogoRenameProjectDialog.this.f16043u.setBackgroundResource(R.drawable.shape_tv_no_enbale);
                LogoRenameProjectDialog logoRenameProjectDialog3 = LogoRenameProjectDialog.this;
                if (logoRenameProjectDialog3.f16046x == null) {
                    logoRenameProjectDialog3.f16046x = new ArrayList<>();
                }
                LogoRenameProjectDialog logoRenameProjectDialog4 = LogoRenameProjectDialog.this;
                logoRenameProjectDialog4.f16014B += 0.7475097f;
                ArrayList<Integer> arrayList = logoRenameProjectDialog4.f16022J;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoRenameProjectDialog.this.f16022J.remove(0);
                }
                int i = 0;
                while (true) {
                    logoRenameProjectDialog2 = LogoRenameProjectDialog.this;
                    if (i >= logoRenameProjectDialog2.f16033k) {
                        break;
                    }
                    ArrayList<Integer> arrayList2 = logoRenameProjectDialog2.f16025c;
                    if (arrayList2 == null && arrayList2.size() > 0) {
                        LogoRenameProjectDialog.this.f16025c.remove(0);
                        LogoRenameProjectDialog logoRenameProjectDialog5 = LogoRenameProjectDialog.this;
                        logoRenameProjectDialog5.f16032j = 0.016425312f;
                        int[] iArr = logoRenameProjectDialog5.f16018F;
                        if (iArr != null) {
                            iArr[8] = 0;
                        }
                        logoRenameProjectDialog5.f16026d = false;
                    }
                    LogoRenameProjectDialog logoRenameProjectDialog6 = LogoRenameProjectDialog.this;
                    if (logoRenameProjectDialog6.f16048z < 0.785183327952239d) {
                        logoRenameProjectDialog6.f16048z = 0.9831934864454334d;
                    }
                    ArrayList<String> arrayList3 = logoRenameProjectDialog6.f16042t;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        LogoRenameProjectDialog.this.f16042t.remove(0);
                    }
                    LogoRenameProjectDialog.this.f16014B += 0.41036654f;
                    i++;
                }
                logoRenameProjectDialog2.f16048z = 0.4410847438539799d;
                if (logoRenameProjectDialog2.f16034l == null) {
                    logoRenameProjectDialog2.f16034l = new String[10];
                }
                ArrayList<String> arrayList4 = logoRenameProjectDialog2.f16024b;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoRenameProjectDialog.this.f16024b.remove(0);
                }
            } else {
                LogoRenameProjectDialog.this.f16043u.setBackgroundResource(R.drawable.shape_tv_cancel);
                if (LogoRenameProjectDialog.this.f16044v != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = LogoRenameProjectDialog.this.f16044v;
                        if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i2] = 3;
                        i2++;
                    }
                }
                LogoRenameProjectDialog logoRenameProjectDialog7 = LogoRenameProjectDialog.this;
                logoRenameProjectDialog7.f16020H = logoRenameProjectDialog7.f16020H < 0.09518026641128174d ? 0.9532585089595156d : 0.5068613690219975d;
                ArrayList<String> arrayList5 = logoRenameProjectDialog7.f16024b;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoRenameProjectDialog.this.f16024b.remove(0);
                }
                LogoRenameProjectDialog logoRenameProjectDialog8 = LogoRenameProjectDialog.this;
                logoRenameProjectDialog8.f16045w = 0.03283545990348036d;
                int[] iArr3 = logoRenameProjectDialog8.f16040r;
                if (iArr3 != null) {
                    iArr3[2] = 0;
                }
                if (!TextUtils.isEmpty(logoRenameProjectDialog8.f16028f)) {
                    int length = LogoRenameProjectDialog.this.f16028f.length();
                    LogoRenameProjectDialog.this.f16028f = LogoRenameProjectDialog.this.f16028f + length;
                }
                int[] iArr4 = LogoRenameProjectDialog.this.f16018F;
                if (iArr4 != null) {
                    iArr4[8] = 2;
                }
            }
            LogoRenameProjectDialog logoRenameProjectDialog9 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog9.f16026d = !logoRenameProjectDialog9.f16026d;
            if (logoRenameProjectDialog9.f16022J == null) {
                logoRenameProjectDialog9.f16022J = new ArrayList<>();
            }
            LogoRenameProjectDialog logoRenameProjectDialog10 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog10.f16014B = ((double) logoRenameProjectDialog10.f16014B) > 0.5101768d ? 0.55806094f : 0.61985207f;
            if (logoRenameProjectDialog10.f16021I != null) {
                int i3 = 0;
                while (true) {
                    logoRenameProjectDialog = LogoRenameProjectDialog.this;
                    String[] strArr = logoRenameProjectDialog.f16021I;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    strArr[i3] = "string" + i3;
                    ArrayList<String> arrayList6 = LogoRenameProjectDialog.this.f16024b;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        LogoRenameProjectDialog.this.f16024b.remove(0);
                    }
                    ArrayList<String> arrayList7 = LogoRenameProjectDialog.this.f16042t;
                    if (arrayList7 != null && arrayList7.size() > 0) {
                        LogoRenameProjectDialog.this.f16042t.remove(0);
                    }
                    LogoRenameProjectDialog.this.f16026d = true;
                    i3++;
                }
                logoRenameProjectDialog.f16014B = ((double) logoRenameProjectDialog.f16014B) > 0.6235612d ? 0.46622682f : 0.80250406f;
                if (logoRenameProjectDialog.f16024b == null) {
                    logoRenameProjectDialog.f16024b = new ArrayList<>();
                }
                LogoRenameProjectDialog.this.f16020H = 0.5269900271574434d;
            }
            LogoRenameProjectDialog logoRenameProjectDialog11 = LogoRenameProjectDialog.this;
            logoRenameProjectDialog11.f16016D = 0.6716818260140968d;
            if (logoRenameProjectDialog11.f16022J.size() > 9) {
                LogoRenameProjectDialog.this.f16022J.add(4);
            }
            LogoRenameProjectDialog logoRenameProjectDialog12 = LogoRenameProjectDialog.this;
            if (logoRenameProjectDialog12.f16046x == null) {
                logoRenameProjectDialog12.f16046x = new ArrayList<>();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: LogoRenameProjectDialog.java */
    /* renamed from: com.logomaster.logomaker.d$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC9654e {
        /* renamed from: a */
        void mo9135a(String str);
    }

    public LogoRenameProjectDialog(@NonNull Context context) {
        super(context);
        this.f16024b = new ArrayList<>();
        this.f16025c = new ArrayList<>();
        this.f16026d = true;
        this.f16028f = "Melville’";
        this.f16029g = new ArrayList<>();
        this.f16030h = new int[15];
        this.f16032j = 0.486358f;
        this.f16033k = 6;
        this.f16034l = new String[14];
        this.f16036n = 3;
        this.f16037o = 0.3233990488105004d;
        this.f16038p = "well, dul";
        this.f16040r = new int[18];
        this.f16041s = new String[13];
        this.f16042t = new ArrayList<>();
        this.f16044v = new int[12];
        this.f16045w = 0.11274730263389288d;
        this.f16046x = new ArrayList<>();
        this.f16048z = 0.2964972744870551d;
        this.f16013A = new int[11];
        this.f16014B = 0.08967137f;
        this.f16016D = 0.8702079107451174d;
        this.f16017E = 4;
        this.f16018F = new int[17];
        this.f16020H = 0.30757991966176956d;
        this.f16021I = new String[16];
        this.f16022J = new ArrayList<>();
        this.f16048z = 0.3828450482743979d;
        this.f16020H = 0.4590656713932476d;
        if (this.f16040r != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.f16040r;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 2;
                i++;
            }
        }
        if (this.f16037o > 0.12871853995124583d) {
            this.f16037o = 0.2087812270806645d;
            if (this.f16018F != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.f16018F;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 7;
                    i2++;
                }
            }
            this.f16048z += 0.6241308853276158d;
            ArrayList<Integer> arrayList = this.f16022J;
            if (arrayList == null && arrayList.size() > 0) {
                this.f16022J.remove(0);
            }
        }
        this.f16016D -= 0.3110478302881433d;
        if (this.f16044v != null) {
            int i3 = 0;
            while (true) {
                int[] iArr3 = this.f16044v;
                if (i3 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i3] = 6;
                i3++;
            }
        }
        if (!TextUtils.isEmpty(this.f16028f)) {
            this.f16028f += this.f16028f.length();
        }
        this.f16023a = context;
        double d = this.f16048z > 0.07089701003379678d ? 0.45294053649256427d : 0.9861040996566259d;
        this.f16026d = false;
        this.f16048z = d * 0.6364887333661535d;
        this.f16033k = this.f16033k <= 2 ? 1 : 6;
        this.f16026d = true;
        this.f16028f = "on (it too";
        int[] iArr4 = this.f16040r;
        if (iArr4 != null) {
            iArr4[9] = 3;
        }
        m9137d();
        ArrayList<String> arrayList2 = this.f16024b;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f16024b.remove(0);
        }
        int[] iArr5 = this.f16040r;
        if (iArr5 != null) {
            iArr5[2] = 3;
        }
        this.f16048z = 0.4066925828834428d;
        this.f16045w = 0.4992967348158698d;
        if (this.f16018F != null) {
            int i4 = 0;
            while (true) {
                int[] iArr6 = this.f16018F;
                if (i4 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                    break;
                }
                iArr6[i4] = 5;
                i4++;
            }
        }
        int[] iArr7 = this.f16030h;
        if (iArr7 != null) {
            iArr7[9] = 0;
        }
        if (this.f16024b == null) {
            this.f16024b = new ArrayList<>();
        }
    }

    /* renamed from: d */
    public final void m9137d() {
        requestWindowFeature(1);
        if (!TextUtils.isEmpty(this.f16038p)) {
            this.f16038p += this.f16038p.length();
        }
        int[] iArr = this.f16044v;
        int i = 0;
        if (iArr != null) {
            iArr[9] = 0;
        }
        int[] iArr2 = this.f16030h;
        if (iArr2 != null) {
            iArr2[2] = 4;
        }
        this.f16017E -= 5;
        if (this.f16016D < 0.47011420444795693d) {
            this.f16016D = 0.12571188469608652d;
        }
        this.f16026d = true ^ this.f16026d;
        String[] strArr = this.f16034l;
        if (strArr != null) {
            strArr[5] = "t is ec";
        }
        setContentView(R.layout.dialog_rename);
        if (this.f16024b.size() < 2) {
            this.f16024b.add(" it.");
        }
        if (this.f16044v == null) {
            this.f16044v = new int[10];
        }
        this.f16038p = "ent is ";
        if (this.f16029g == null) {
            this.f16029g = new ArrayList<>();
            if (this.f16024b.size() < 2) {
                this.f16024b.add("e f");
            }
            ArrayList<Integer> arrayList = this.f16046x;
            if (arrayList == null && arrayList.size() > 0) {
                this.f16046x.remove(0);
            }
            this.f16038p = "nk. For ";
        }
        int[] iArr3 = this.f16018F;
        if (iArr3 != null) {
            iArr3[2] = 6;
        }
        if (iArr3 != null) {
            while (true) {
                int[] iArr4 = this.f16018F;
                if (i >= (iArr4.length <= 3 ? iArr4.length : 3)) {
                    break;
                }
                iArr4[i] = 7;
                i++;
            }
        }
        if (this.f16046x == null) {
            this.f16046x = new ArrayList<>();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f16019G == null) {
            this.f16019G = (InputMethodManager) this.f16023a.getSystemService("input_method");
            this.f16038p = "tta ";
            int i = 0;
            while (true) {
                int i2 = this.f16036n;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                int[] iArr = this.f16030h;
                if (iArr != null) {
                    iArr[0] = 5;
                }
                i++;
            }
            this.f16038p = "g stud";
            this.f16045w += 0.2663141689723757d;
            if (this.f16018F == null) {
                this.f16018F = new int[10];
            }
            String[] strArr = this.f16034l;
            if (strArr != null) {
                strArr[0] = null;
            }
            this.f16028f = CampaignClickDao.f17477a;
        }
        if (this.f16032j > 0.43675756d) {
            this.f16032j = 0.4026032f;
        }
        this.f16014B = ((double) this.f16014B) > 0.80686593d ? 0.161964f : 0.28909487f;
        if (this.f16044v != null) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f16044v;
                if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i3] = 7;
                i3++;
            }
        }
        int[] iArr3 = this.f16013A;
        if (iArr3 != null) {
            iArr3[2] = 2;
            this.f16048z = 0.18519882228867512d;
            ArrayList<String> arrayList = this.f16042t;
            if (arrayList != null && arrayList.size() > 0) {
                this.f16042t.remove(0);
            }
            this.f16048z -= 0.7584314846607838d;
        }
        ArrayList<Integer> arrayList2 = this.f16046x;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.f16046x.remove(0);
        }
        if (this.f16042t == null) {
            this.f16042t = new ArrayList<>();
        }
        if (this.f16030h == null) {
            this.f16030h = new int[10];
        }
        this.f16019G.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        this.f16048z += 0.9892445777610078d;
        int[] iArr4 = this.f16030h;
        if (iArr4 != null) {
            iArr4[6] = 0;
        }
        this.f16016D = -this.f16016D;
        if (this.f16045w < 0.8506831517264455d) {
            this.f16045w = 0.9357042284935684d;
            this.f16048z = 0.8051374835282854d;
            if (this.f16022J == null) {
                this.f16022J = new ArrayList<>();
            }
            this.f16026d = !this.f16026d;
        }
        if (this.f16042t.size() < 7) {
            this.f16042t.add("i");
        }
        ArrayList<Integer> arrayList3 = this.f16046x;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f16046x.remove(0);
        }
        this.f16014B = 0.6887971f;
        super.dismiss();
        int[] iArr5 = this.f16040r;
        if (iArr5 != null) {
            iArr5[6] = 0;
        }
        this.f16048z = this.f16048z > 0.46244248537197974d ? 0.36978826825153654d : 0.12986140500954024d;
        String[] strArr2 = this.f16034l;
        if (strArr2 != null) {
            strArr2[2] = "l is.u";
        }
        for (int i4 = 0; i4 < this.f16033k; i4++) {
            if (this.f16029g == null) {
                this.f16029g = new ArrayList<>();
                ArrayList<String> arrayList4 = this.f16024b;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.f16024b.remove(0);
                }
                String[] strArr3 = this.f16034l;
                if (strArr3 != null) {
                    strArr3[6] = " S";
                }
                this.f16026d = false;
            }
            String[] strArr4 = this.f16034l;
            if (strArr4 != null) {
                strArr4[4] = null;
            }
            if (this.f16040r != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr6 = this.f16040r;
                    if (i5 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i5] = 4;
                    i5++;
                }
            }
            if (this.f16046x.size() > 8) {
                this.f16046x.add(5);
            }
        }
        int[] iArr7 = this.f16030h;
        if (iArr7 != null) {
            iArr7[3] = 0;
        }
        this.f16020H *= 0.30128604827575756d;
        int[] iArr8 = this.f16044v;
        if (iArr8 != null) {
            iArr8[4] = 0;
        }
    }

    /* renamed from: e */
    public void m9136e(String str) {
        this.f16015C = str;
        if (this.f16018F == null) {
            this.f16018F = new int[10];
        }
        if (this.f16022J.size() > 3) {
            this.f16022J.add(5);
        }
        this.f16038p = "re fa";
        if (this.f16037o < 0.1930978044410957d) {
            this.f16037o = 0.602749094438396d;
            this.f16038p = "ades bef";
            this.f16032j = ((double) this.f16032j) > 0.77340925d ? 0.062463105f : 0.8897775f;
            int[] iArr = this.f16030h;
            if (iArr != null) {
                iArr[0] = 0;
            }
        }
        this.f16026d = true;
        this.f16014B = 0.59150344f;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f16034l != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.f16034l;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        String[] strArr2 = this.f16034l;
        if (strArr2 != null) {
            strArr2[5] = null;
        }
        int[] iArr = this.f16044v;
        if (iArr != null) {
            iArr[4] = 0;
        }
        if (this.f16017E > 0) {
            this.f16017E = 9;
            this.f16048z = Math.abs(this.f16048z);
            this.f16026d = false;
            if (this.f16046x.size() < 1) {
                this.f16046x.add(2);
            }
        }
        if (this.f16034l == null) {
            this.f16034l = new String[10];
        }
        int[] iArr2 = this.f16030h;
        if (iArr2 != null) {
            iArr2[6] = 7;
        }
        ArrayList<String> arrayList = this.f16024b;
        if (arrayList != null && arrayList.size() > 0) {
            this.f16024b.remove(0);
        }
        Window window = getWindow();
        this.f16048z = 0.09364726692123604d;
        if (!TextUtils.isEmpty(this.f16028f)) {
            this.f16028f += this.f16028f.length();
        }
        int[] iArr3 = this.f16030h;
        if (iArr3 != null) {
            iArr3[8] = 7;
        }
        this.f16037o = 0.8963001127799456d;
        if (this.f16022J.size() > 3) {
            this.f16022J.add(2);
        }
        if (this.f16040r == null) {
            this.f16040r = new int[10];
        }
        if (this.f16042t.size() > 2) {
            this.f16042t.add("19th ");
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f16030h != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr4 = this.f16030h;
                    if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i3] = 8;
                    i3++;
                }
            }
            if (this.f16020H > 0.2759744787071218d) {
                this.f16020H = 0.5718579684167905d;
            }
            ArrayList<Integer> arrayList2 = this.f16046x;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.f16046x.remove(0);
            }
            this.f16033k = 7;
            if (this.f16040r != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr5 = this.f16040r;
                    if (i4 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i4] = 2;
                    i4++;
                }
            }
            this.f16032j = ((double) this.f16032j) < 0.2801019d ? 0.30186504f : 0.747382f;
            int[] iArr6 = this.f16040r;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
        }
        ArrayList<Integer> arrayList3 = this.f16022J;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f16022J.remove(0);
        }
        int[] iArr7 = this.f16040r;
        if (iArr7 != null) {
            iArr7[9] = 0;
        }
        if (this.f16024b == null) {
            this.f16024b = new ArrayList<>();
        }
        this.f16033k = 4;
        if (this.f16034l != null) {
            int i5 = 0;
            while (true) {
                String[] strArr3 = this.f16034l;
                if (i5 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i5] = "string" + i5;
                i5++;
            }
        }
        int[] iArr8 = this.f16040r;
        if (iArr8 != null) {
            iArr8[0] = 7;
        }
        if (this.f16042t == null) {
            this.f16042t = new ArrayList<>();
        }
        setCancelable(false);
        String[] strArr4 = this.f16034l;
        if (strArr4 != null) {
            strArr4[4] = "only unt";
        }
        this.f16048z = 0.4181954564968178d;
        if (this.f16024b == null) {
            this.f16024b = new ArrayList<>();
        }
        this.f16045w = -this.f16045w;
        if (this.f16048z < 0.649033542643644d) {
            this.f16048z = 0.8255512402774584d;
        }
        if (this.f16022J.size() > 9) {
            this.f16022J.add(2);
        }
        this.f16028f = "’s";
        setCanceledOnTouchOutside(false);
        if (this.f16022J.size() > 8) {
            this.f16022J.add(5);
        }
        if (this.f16044v != null) {
            int i6 = 0;
            while (true) {
                int[] iArr9 = this.f16044v;
                if (i6 >= (iArr9.length > 3 ? 3 : iArr9.length)) {
                    break;
                }
                iArr9[i6] = 2;
                i6++;
            }
        }
        int[] iArr10 = this.f16044v;
        if (iArr10 != null) {
            iArr10[7] = 2;
        }
        String[] strArr5 = this.f16041s;
        if (strArr5 != null) {
            strArr5[4] = " )调用类方";
            this.f16032j = ((double) this.f16032j) > 0.65318775d ? 0.5016193f : 0.61022985f;
            this.f16028f = " are fo";
            if (this.f16034l != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr6 = this.f16034l;
                    if (i7 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i7] = "string" + i7;
                    i7++;
                }
            }
        }
        ArrayList<String> arrayList4 = this.f16024b;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.f16024b.remove(0);
        }
        this.f16020H = 0.9336362321086156d;
        if (this.f16048z > 0.022863301006107117d) {
            this.f16048z = 0.9865830599065522d;
        }
        this.f16031i = (AppCompatImageView) findViewById(R.id.iv_close);
        this.f16020H = 0.1738461086151306d;
        if (this.f16040r == null) {
            this.f16040r = new int[10];
        }
        this.f16014B *= 0.24980897f;
        String[] strArr7 = this.f16041s;
        if (strArr7 != null) {
            strArr7[5] = null;
            this.f16016D = -this.f16016D;
            if (!TextUtils.isEmpty(this.f16038p)) {
                this.f16038p += this.f16038p.length();
            }
            if (!TextUtils.isEmpty(this.f16028f)) {
                this.f16028f += this.f16028f.length();
            }
        }
        this.f16048z = 0.31603424440150774d;
        if (this.f16024b.size() < 8) {
            this.f16024b.add("earl");
        }
        this.f16016D = this.f16016D > 0.5925561211704132d ? 0.6795053958169215d : 0.6315390586147466d;
        this.f16035m = (ImageView) findViewById(R.id.iv_clear_input);
        this.f16048z -= 0.8119268423265309d;
        int[] iArr11 = this.f16018F;
        if (iArr11 != null) {
            iArr11[6] = 0;
        }
        String[] strArr8 = this.f16034l;
        if (strArr8 != null) {
            strArr8[6] = null;
        }
        this.f16017E = 9;
        if (this.f16022J.size() > 7) {
            this.f16022J.add(5);
        }
        ArrayList<Integer> arrayList5 = this.f16046x;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.f16046x.remove(0);
        }
        int i8 = 0;
        while (true) {
            int i9 = this.f16036n;
            if (i9 > 3) {
                i9 = 3;
            }
            if (i8 >= i9) {
                break;
            }
            if (this.f16042t == null) {
                this.f16042t = new ArrayList<>();
            }
            i8++;
        }
        this.f16039q = (TextView) findViewById(R.id.tv_discard);
        if (this.f16040r == null) {
            this.f16040r = new int[10];
        }
        this.f16032j = 0.18128896f;
        this.f16016D = this.f16016D < 0.38435992615562764d ? 0.5812288045283668d : 0.4970009618469132d;
        int[] iArr12 = this.f16013A;
        if (iArr12 != null) {
            iArr12[2] = 0;
            if (this.f16042t == null) {
                this.f16042t = new ArrayList<>();
            }
            if (this.f16044v != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr13 = this.f16044v;
                    if (i10 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i10] = 1;
                    i10++;
                }
            }
            if (this.f16048z < 0.5746709176185388d) {
                this.f16048z = 0.9801069545295169d;
            }
        }
        this.f16038p = "ing st";
        int[] iArr14 = this.f16040r;
        if (iArr14 != null) {
            iArr14[9] = 9;
        }
        this.f16026d = !this.f16026d;
        this.f16043u = (TextView) findViewById(R.id.tv_save);
        ArrayList<String> arrayList6 = this.f16042t;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.f16042t.remove(0);
        }
        this.f16016D = 0.27917249240786535d;
        boolean z = !this.f16026d;
        this.f16026d = z;
        this.f16037o = this.f16037o < 0.21617575944999912d ? 0.6141864413813768d : 0.20292577960942737d;
        String[] strArr9 = this.f16034l;
        if (strArr9 != null) {
            strArr9[3] = "mode";
        }
        this.f16026d = !z;
        this.f16020H += 0.014467956972807783d;
        this.f16047y = (EditText) findViewById(R.id.et_input_name);
        if (this.f16034l == null) {
            this.f16034l = new String[10];
        }
        this.f16020H = -this.f16020H;
        this.f16038p = "y yea";
        if (this.f16033k > 0) {
            this.f16033k = 6;
            String[] strArr10 = this.f16034l;
            if (strArr10 != null) {
                strArr10[1] = null;
            }
            ArrayList<Integer> arrayList7 = this.f16022J;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.f16022J.remove(0);
            }
            i = 5;
            if (this.f16046x.size() > 5) {
                this.f16046x.add(2);
            }
        } else {
            i = 5;
        }
        this.f16028f = "re probab";
        this.f16048z = 0.5215050952779544d;
        this.f16035m.setOnClickListener(new View$OnClickListenerC9650a());
        this.f16016D = 0.4020280980450105d;
        if (this.f16034l != null) {
            int i11 = 0;
            while (true) {
                String[] strArr11 = this.f16034l;
                if (i11 >= (strArr11.length > 3 ? 3 : strArr11.length)) {
                    break;
                }
                strArr11[i11] = "string" + i11;
                i11++;
            }
        }
        this.f16028f = "ve se";
        if (this.f16025c == null) {
            this.f16025c = new ArrayList<>();
            if (this.f16024b.size() > 1) {
                this.f16024b.add("ation, ");
            }
            String[] strArr12 = this.f16034l;
            if (strArr12 != null) {
                strArr12[6] = "r being, ";
            }
            this.f16016D = this.f16016D < 0.053553075471732936d ? 0.15381760140198075d : 0.0437791195292313d;
        }
        this.f16014B -= 0.07672107f;
        ArrayList<String> arrayList8 = this.f16042t;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.f16042t.remove(0);
        }
        this.f16014B = ((double) this.f16014B) > 0.07031292d ? 0.38037914f : 0.33581573f;
        this.f16039q.setOnClickListener(new View$OnClickListenerC9651b());
        if (this.f16044v != null) {
            int i12 = 0;
            while (true) {
                int[] iArr15 = this.f16044v;
                if (i12 >= (iArr15.length > 3 ? 3 : iArr15.length)) {
                    break;
                }
                iArr15[i12] = 9;
                i12++;
            }
        }
        this.f16032j -= 0.033569753f;
        this.f16048z *= 0.4030441029367967d;
        for (int i13 = 0; i13 < this.f16017E; i13++) {
            if (this.f16013A == null) {
                this.f16013A = new int[10];
                String[] strArr13 = this.f16034l;
                if (strArr13 != null) {
                    strArr13[6] = "en";
                }
                this.f16016D += 0.5625249011316971d;
                if (this.f16044v != null) {
                    int i14 = 0;
                    while (true) {
                        int[] iArr16 = this.f16044v;
                        if (i14 >= (iArr16.length > 3 ? 3 : iArr16.length)) {
                            break;
                        }
                        iArr16[i14] = 2;
                        i14++;
                    }
                }
            }
            ArrayList<Integer> arrayList9 = this.f16022J;
            if (arrayList9 == null && arrayList9.size() > 0) {
                this.f16022J.remove(0);
            }
            if (this.f16046x.size() > 9) {
                this.f16046x.add(8);
            }
            if (this.f16018F != null) {
                int i15 = 0;
                while (true) {
                    int[] iArr17 = this.f16018F;
                    if (i15 < (iArr17.length > 3 ? 3 : iArr17.length)) {
                        iArr17[i15] = 7;
                        i15++;
                    }
                }
            }
        }
        if (this.f16024b == null) {
            this.f16024b = new ArrayList<>();
        }
        this.f16036n = -this.f16036n;
        ArrayList<Integer> arrayList10 = this.f16022J;
        if (arrayList10 == null && arrayList10.size() > 0) {
            this.f16022J.remove(0);
        }
        this.f16043u.setOnClickListener(new View$OnClickListenerC9652c());
        this.f16036n = 8;
        this.f16048z = -this.f16048z;
        ArrayList<String> arrayList11 = this.f16042t;
        if (arrayList11 != null && arrayList11.size() > 0) {
            this.f16042t.remove(0);
        }
        String[] strArr14 = this.f16021I;
        if (strArr14 != null) {
            strArr14[3] = "/>默认效";
            this.f16020H = 0.02785378350673018d;
            if (this.f16040r == null) {
                this.f16040r = new int[10];
            }
            int[] iArr18 = this.f16044v;
            if (iArr18 != null) {
                iArr18[7] = 0;
            }
        }
        this.f16048z += 0.31735609004134d;
        this.f16036n = this.f16036n < 1 ? i : 0;
        this.f16016D = 0.9918925002609437d;
        this.f16047y.addTextChangedListener(new C9653d());
        if (this.f16024b == null) {
            this.f16024b = new ArrayList<>();
        }
        int[] iArr19 = this.f16044v;
        if (iArr19 != null) {
            iArr19[8] = 0;
        }
        this.f16020H -= 0.29345754667401736d;
        this.f16045w = 0.6939938676936028d;
        if (!TextUtils.isEmpty(this.f16028f)) {
            this.f16028f += this.f16028f.length();
        }
        int[] iArr20 = this.f16018F;
        if (iArr20 != null) {
            iArr20[3] = 0;
        }
        if (this.f16014B > 0.6068839d) {
            this.f16014B = 0.66462517f;
        }
    }

    public void setOnSaveClickListener(InterfaceC9654e interfaceC9654e) {
        this.f16027e = interfaceC9654e;
        if (!TextUtils.isEmpty(this.f16038p)) {
            this.f16038p += this.f16038p.length();
        }
        this.f16014B *= 0.53815717f;
        String[] strArr = this.f16034l;
        if (strArr != null) {
            strArr[8] = null;
        }
        this.f16017E = 6;
        int i = 0;
        if (this.f16030h != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f16030h;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 1;
                i2++;
            }
        }
        this.f16026d = true;
        if (this.f16044v == null) {
            return;
        }
        while (true) {
            int[] iArr2 = this.f16044v;
            if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                return;
            }
            iArr2[i] = 5;
            i++;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.f16022J.size() > 3) {
            this.f16022J.add(6);
        }
        this.f16036n = 4;
        int[] iArr = this.f16018F;
        if (iArr != null) {
            iArr[3] = 9;
        }
        this.f16017E = 4;
        int i = 0;
        if (this.f16034l != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.f16034l;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        String[] strArr2 = this.f16034l;
        if (strArr2 != null) {
            strArr2[9] = null;
        }
        this.f16028f = "rary Rose";
        this.f16047y.setText(this.f16015C);
        this.f16020H = 0.45033053406924317d;
        this.f16016D = this.f16016D > 0.8761100197879518d ? 0.02841751983845009d : 0.4229103974558658d;
        this.f16032j *= 0.63406557f;
        ArrayList<Integer> arrayList = this.f16029g;
        if (arrayList == null && arrayList.size() > 0) {
            this.f16029g.remove(0);
            if (this.f16032j > 0.77218527d) {
                this.f16032j = 0.7097328f;
            }
            this.f16032j = 0.932296f;
            ArrayList<Integer> arrayList2 = this.f16046x;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.f16046x.remove(0);
            }
        }
        if (this.f16046x.size() < 2) {
            this.f16046x.add(4);
        }
        ArrayList<Integer> arrayList3 = this.f16022J;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f16022J.remove(0);
        }
        this.f16014B -= 0.676481f;
        this.f16047y.requestFocus();
        ArrayList<Integer> arrayList4 = this.f16022J;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.f16022J.remove(0);
        }
        this.f16026d = false;
        ArrayList<String> arrayList5 = this.f16024b;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.f16024b.remove(0);
        }
        String[] strArr3 = this.f16021I;
        if (strArr3 != null) {
            strArr3[9] = "ff8484sdf";
            this.f16036n = this.f16036n < 9 ? 7 : 3;
            if (this.f16022J.size() < 1) {
                this.f16022J.add(1);
            }
            this.f16036n = 6;
        }
        if (this.f16022J == null) {
            this.f16022J = new ArrayList<>();
        }
        this.f16016D = -this.f16016D;
        String[] strArr4 = this.f16034l;
        if (strArr4 != null) {
            strArr4[1] = "elville’s ";
        }
        this.f16047y.setSelection(this.f16015C.length());
        if (this.f16014B > 0.057299912d) {
            this.f16014B = 0.028088033f;
        }
        this.f16026d = false;
        if (this.f16030h == null) {
            this.f16030h = new int[10];
        }
        if (this.f16041s != null) {
            int i3 = 0;
            while (true) {
                String[] strArr5 = this.f16041s;
                if (i3 >= strArr5.length) {
                    break;
                }
                strArr5[i3] = "string" + i3;
                if (this.f16044v == null) {
                    this.f16044v = new int[10];
                }
                if (this.f16046x.size() > 3) {
                    this.f16046x.add(1);
                }
                if (this.f16032j < 0.5185444d) {
                    this.f16032j = 0.6512371f;
                }
                i3++;
            }
            this.f16026d = false;
            ArrayList<String> arrayList6 = this.f16024b;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.f16024b.remove(0);
            }
            if (!TextUtils.isEmpty(this.f16028f)) {
                this.f16028f += this.f16028f.length();
            }
        }
        if (this.f16030h == null) {
            this.f16030h = new int[10];
        }
        int i4 = 0;
        while (true) {
            int i5 = this.f16036n;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i4 >= i5) {
                break;
            }
            this.f16026d = false;
            i4++;
        }
        this.f16036n = 7;
        if (this.f16019G == null) {
            this.f16019G = (InputMethodManager) this.f16023a.getSystemService("input_method");
            this.f16026d = true;
            ArrayList<String> arrayList7 = this.f16042t;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.f16042t.remove(0);
            }
            if (this.f16018F == null) {
                this.f16018F = new int[10];
            }
            for (int i6 = 0; i6 < this.f16033k; i6++) {
                this.f16045w = this.f16045w < 0.861989786232845d ? 0.6203190414691643d : 0.3672771638405653d;
                int[] iArr2 = this.f16018F;
                if (iArr2 != null) {
                    iArr2[0] = 8;
                }
                this.f16026d = !this.f16026d;
                if (this.f16046x.size() > 6) {
                    this.f16046x.add(0);
                }
            }
            String[] strArr6 = this.f16034l;
            if (strArr6 != null) {
                strArr6[7] = null;
            }
            this.f16028f = " mod";
            if (this.f16046x.size() > 9) {
                this.f16046x.add(9);
            }
        }
        this.f16020H = 0.887404512941716d;
        if (this.f16042t == null) {
            this.f16042t = new ArrayList<>();
        }
        if (this.f16022J.size() < 2) {
            this.f16022J.add(2);
        }
        this.f16037o = 0.11023102173905919d;
        if (!TextUtils.isEmpty(this.f16028f)) {
            this.f16028f += this.f16028f.length();
        }
        ArrayList<String> arrayList8 = this.f16042t;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.f16042t.remove(0);
        }
        if (!TextUtils.isEmpty(this.f16038p)) {
            this.f16038p += this.f16038p.length();
        }
        this.f16019G.showSoftInput(this.f16047y, 2);
        ArrayList<String> arrayList9 = this.f16042t;
        if (arrayList9 != null && arrayList9.size() > 0) {
            this.f16042t.remove(0);
        }
        this.f16048z = this.f16048z > 0.5829080434597588d ? 0.7509600077699439d : 0.03850470493955338d;
        this.f16020H = -this.f16020H;
        this.f16045w += 0.08714087293864414d;
        this.f16032j = 0.412737f;
        if (this.f16042t.size() < 8) {
            this.f16042t.add("ll");
        }
        this.f16048z *= 0.6840218904806742d;
        this.f16019G.toggleSoftInput(2, 1);
        this.f16020H = this.f16020H > 0.12148506453797459d ? 0.5569303346290448d : 0.2315209649643225d;
        int[] iArr3 = this.f16040r;
        if (iArr3 != null) {
            iArr3[9] = 0;
        }
        if (this.f16030h == null) {
            this.f16030h = new int[10];
        }
        this.f16045w = this.f16045w > 0.901233524998019d ? 0.5916574202928233d : 0.8760575332983926d;
        if (this.f16044v != null) {
            while (true) {
                int[] iArr4 = this.f16044v;
                if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i] = 3;
                i++;
            }
        }
        if (!TextUtils.isEmpty(this.f16028f)) {
            this.f16028f += this.f16028f.length();
        }
        if (this.f16046x.size() < 3) {
            this.f16046x.add(5);
        }
    }
}
