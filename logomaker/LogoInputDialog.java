package com.logomaster.logomaker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
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
import java.util.ArrayList;

/* renamed from: com.logomaster.logomaker.b */
/* loaded from: classes3.dex */
public class LogoInputDialog extends Dialog {

    /* renamed from: A */
    public String f15916A;

    /* renamed from: B */
    public int f15917B;

    /* renamed from: C */
    public String f15918C;

    /* renamed from: D */
    public ArrayList<Integer> f15919D;

    /* renamed from: E */
    public double f15920E;

    /* renamed from: F */
    public int f15921F;

    /* renamed from: G */
    public InputMethodManager f15922G;

    /* renamed from: H */
    public String f15923H;

    /* renamed from: I */
    public boolean f15924I;

    /* renamed from: J */
    public double f15925J;

    /* renamed from: a */
    public Context f15926a;

    /* renamed from: b */
    public String[] f15927b;

    /* renamed from: c */
    public int[] f15928c;

    /* renamed from: d */
    public String[] f15929d;

    /* renamed from: e */
    public InterfaceC9639f f15930e;

    /* renamed from: f */
    public ArrayList<Integer> f15931f;

    /* renamed from: g */
    public ArrayList<String> f15932g;

    /* renamed from: h */
    public double f15933h;

    /* renamed from: i */
    public AppCompatImageView f15934i;

    /* renamed from: j */
    public int f15935j;

    /* renamed from: k */
    public String f15936k;

    /* renamed from: l */
    public boolean f15937l;

    /* renamed from: m */
    public ImageView f15938m;

    /* renamed from: n */
    public double f15939n;

    /* renamed from: o */
    public ArrayList<Integer> f15940o;

    /* renamed from: p */
    public boolean f15941p;

    /* renamed from: q */
    public TextView f15942q;

    /* renamed from: r */
    public String f15943r;

    /* renamed from: s */
    public int[] f15944s;

    /* renamed from: t */
    public boolean f15945t;

    /* renamed from: u */
    public TextView f15946u;

    /* renamed from: v */
    public double f15947v;

    /* renamed from: w */
    public boolean f15948w;

    /* renamed from: x */
    public float f15949x;

    /* renamed from: y */
    public EditText f15950y;

    /* renamed from: z */
    public ArrayList<Integer> f15951z;

    /* compiled from: LogoInputDialog.java */
    /* renamed from: com.logomaster.logomaker.b$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9634a implements View.OnClickListener {
        public View$OnClickListenerC9634a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoInputDialog.this.f15950y.setText("");
            LogoInputDialog logoInputDialog = LogoInputDialog.this;
            logoInputDialog.f15923H = "modern nov";
            logoInputDialog.f15949x = 0.059458256f;
            logoInputDialog.f15925J = logoInputDialog.f15925J > 0.9861741982029715d ? 0.3897212069606041d : 0.28807250443281807d;
            if (logoInputDialog.f15940o.size() < 2) {
                LogoInputDialog.this.f15940o.add(8);
                ArrayList<Integer> arrayList = LogoInputDialog.this.f15931f;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoInputDialog.this.f15931f.remove(0);
                }
                if (LogoInputDialog.this.f15929d != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoInputDialog.this.f15929d;
                        if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoInputDialog.this.f15923H = "dull. Mel";
            }
            ArrayList<Integer> arrayList2 = LogoInputDialog.this.f15931f;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoInputDialog.this.f15931f.remove(0);
            }
            LogoInputDialog logoInputDialog2 = LogoInputDialog.this;
            String[] strArr2 = logoInputDialog2.f15929d;
            if (strArr2 != null) {
                strArr2[2] = "ury, it’";
            }
            logoInputDialog2.f15937l = false;
        }
    }

    /* compiled from: LogoInputDialog.java */
    /* renamed from: com.logomaster.logomaker.b$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9635b implements View.OnClickListener {
        public View$OnClickListenerC9635b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoInputDialog logoInputDialog;
            LogoInputDialog logoInputDialog2;
            LogoInputDialog.this.dismiss();
            if (!TextUtils.isEmpty(LogoInputDialog.this.f15923H)) {
                int length = LogoInputDialog.this.f15923H.length();
                LogoInputDialog.this.f15923H = LogoInputDialog.this.f15923H + length;
            }
            LogoInputDialog logoInputDialog3 = LogoInputDialog.this;
            logoInputDialog3.f15949x = 0.9304753f;
            String[] strArr = logoInputDialog3.f15927b;
            if (strArr != null) {
                strArr[1] = " you";
            }
            if (logoInputDialog3.f15944s != null) {
                int i = 0;
                while (true) {
                    logoInputDialog = LogoInputDialog.this;
                    int[] iArr = logoInputDialog.f15944s;
                    if (i >= iArr.length) {
                        break;
                    }
                    iArr[i] = 2;
                    int i2 = 0;
                    while (true) {
                        logoInputDialog2 = LogoInputDialog.this;
                        int i3 = logoInputDialog2.f15935j;
                        if (i3 > 3) {
                            i3 = 3;
                        }
                        if (i2 < i3) {
                            logoInputDialog2.f15917B = 3;
                            i2++;
                        }
                    }
                    logoInputDialog2.f15917B = 9;
                    logoInputDialog2.f15949x = 0.526008f;
                    i++;
                }
                logoInputDialog.f15941p = !logoInputDialog.f15941p;
                logoInputDialog.f15921F += 7;
                if (logoInputDialog.f15947v < 0.3844290436744433d) {
                    logoInputDialog.f15947v = 0.06134823991841498d;
                }
            }
            LogoInputDialog logoInputDialog4 = LogoInputDialog.this;
            logoInputDialog4.f15935j = 6;
            ArrayList<Integer> arrayList = logoInputDialog4.f15919D;
            if (arrayList == null && arrayList.size() > 0) {
                LogoInputDialog.this.f15919D.remove(0);
            }
            LogoInputDialog logoInputDialog5 = LogoInputDialog.this;
            if (logoInputDialog5.f15931f == null) {
                logoInputDialog5.f15931f = new ArrayList<>();
            }
        }
    }

    /* compiled from: LogoInputDialog.java */
    /* renamed from: com.logomaster.logomaker.b$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9636c implements View.OnClickListener {
        public View$OnClickListenerC9636c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoInputDialog logoInputDialog;
            String trim = LogoInputDialog.this.f15950y.getText().toString().trim();
            String[] strArr = LogoInputDialog.this.f15927b;
            if (strArr != null) {
                strArr[4] = null;
            }
            int i = 0;
            while (true) {
                logoInputDialog = LogoInputDialog.this;
                int i2 = logoInputDialog.f15935j;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                if (logoInputDialog.f15931f == null) {
                    logoInputDialog.f15931f = new ArrayList<>();
                }
                i++;
            }
            String[] strArr2 = logoInputDialog.f15927b;
            if (strArr2 != null) {
                strArr2[4] = "ract";
            }
            if (logoInputDialog.f15932g == null) {
                logoInputDialog.f15932g = new ArrayList<>();
                LogoInputDialog logoInputDialog2 = LogoInputDialog.this;
                logoInputDialog2.f15937l = !logoInputDialog2.f15937l;
                if (logoInputDialog2.f15925J < 0.5581298915316548d) {
                    logoInputDialog2.f15925J = 0.8346489550494396d;
                }
                logoInputDialog2.f15941p = false;
            }
            LogoInputDialog logoInputDialog3 = LogoInputDialog.this;
            logoInputDialog3.f15941p = true;
            if (!TextUtils.isEmpty(logoInputDialog3.f15923H)) {
                int length = LogoInputDialog.this.f15923H.length();
                LogoInputDialog.this.f15923H = LogoInputDialog.this.f15923H + length;
            }
            String[] strArr3 = LogoInputDialog.this.f15929d;
            if (strArr3 != null) {
                strArr3[7] = "nly";
            }
            if (!TextUtils.isEmpty(trim)) {
                LogoInputDialog.this.dismiss();
                LogoInputDialog logoInputDialog4 = LogoInputDialog.this;
                logoInputDialog4.f15947v += 0.486124588002502d;
                logoInputDialog4.f15945t = !logoInputDialog4.f15945t;
                if (!TextUtils.isEmpty(logoInputDialog4.f15943r)) {
                    int length2 = LogoInputDialog.this.f15943r.length();
                    LogoInputDialog.this.f15943r = LogoInputDialog.this.f15943r + length2;
                }
                LogoInputDialog logoInputDialog5 = LogoInputDialog.this;
                logoInputDialog5.f15924I = true;
                logoInputDialog5.f15937l = true;
                logoInputDialog5.f15939n = logoInputDialog5.f15939n > 0.11050348520047326d ? 0.8307657974526789d : 0.36217124728682815d;
                if (logoInputDialog5.f15921F < 0) {
                    logoInputDialog5.f15921F = 4;
                }
                if (logoInputDialog5.f15930e != null) {
                    LogoInputDialog.this.f15930e.mo9156a(trim);
                    if (LogoInputDialog.this.f15931f.size() > 5) {
                        LogoInputDialog.this.f15931f.add(1);
                    }
                    LogoInputDialog logoInputDialog6 = LogoInputDialog.this;
                    if (logoInputDialog6.f15929d == null) {
                        logoInputDialog6.f15929d = new String[10];
                    }
                    logoInputDialog6.f15923H = "ive s";
                    int[] iArr = logoInputDialog6.f15944s;
                    if (iArr != null) {
                        iArr[5] = 0;
                        logoInputDialog6.f15941p = true;
                        logoInputDialog6.f15941p = true;
                        if (logoInputDialog6.f15919D == null) {
                            logoInputDialog6.f15919D = new ArrayList<>();
                        }
                    }
                    LogoInputDialog logoInputDialog7 = LogoInputDialog.this;
                    logoInputDialog7.f15925J = 0.4284004107961452d;
                    logoInputDialog7.f15933h = logoInputDialog7.f15933h < 0.5076712008753919d ? 0.1532901498915069d : 0.5674289203685946d;
                    logoInputDialog7.f15945t = !logoInputDialog7.f15945t;
                }
                LogoInputDialog logoInputDialog8 = LogoInputDialog.this;
                logoInputDialog8.f15923H = "op";
                ArrayList<Integer> arrayList = logoInputDialog8.f15919D;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoInputDialog.this.f15919D.remove(0);
                }
                LogoInputDialog logoInputDialog9 = LogoInputDialog.this;
                logoInputDialog9.f15933h = 0.9131424226976348d;
                if (logoInputDialog9.f15920E > 0.6952311471018819d) {
                    logoInputDialog9.f15920E = 0.9925922058204616d;
                    if (!TextUtils.isEmpty(logoInputDialog9.f15943r)) {
                        int length3 = LogoInputDialog.this.f15943r.length();
                        LogoInputDialog.this.f15943r = LogoInputDialog.this.f15943r + length3;
                    }
                    if (!TextUtils.isEmpty(LogoInputDialog.this.f15943r)) {
                        int length4 = LogoInputDialog.this.f15943r.length();
                        LogoInputDialog.this.f15943r = LogoInputDialog.this.f15943r + length4;
                    }
                    LogoInputDialog.this.f15949x *= 0.81292784f;
                }
                LogoInputDialog logoInputDialog10 = LogoInputDialog.this;
                logoInputDialog10.f15945t = false;
                if (logoInputDialog10.f15933h > 0.8708980024435029d) {
                    logoInputDialog10.f15933h = 0.43156124914070126d;
                }
                logoInputDialog10.f15949x = ((double) logoInputDialog10.f15949x) < 0.30892193d ? 0.33081037f : 0.40368605f;
            }
            LogoInputDialog logoInputDialog11 = LogoInputDialog.this;
            if (logoInputDialog11.f15929d == null) {
                logoInputDialog11.f15929d = new String[10];
            }
            logoInputDialog11.f15941p = !logoInputDialog11.f15941p;
            logoInputDialog11.f15945t = !logoInputDialog11.f15945t;
            logoInputDialog11.f15948w = !logoInputDialog11.f15948w;
            if (!TextUtils.isEmpty(logoInputDialog11.f15943r)) {
                int length5 = LogoInputDialog.this.f15943r.length();
                LogoInputDialog.this.f15943r = LogoInputDialog.this.f15943r + length5;
            }
            LogoInputDialog logoInputDialog12 = LogoInputDialog.this;
            if (logoInputDialog12.f15925J > 0.7207989748045691d) {
                logoInputDialog12.f15925J = 0.4960850055948396d;
            }
            logoInputDialog12.f15921F += 5;
        }
    }

    /* compiled from: LogoInputDialog.java */
    /* renamed from: com.logomaster.logomaker.b$d */
    /* loaded from: classes3.dex */
    public class C9637d implements TextWatcher {
        public C9637d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LogoInputDialog logoInputDialog;
            LogoInputDialog logoInputDialog2;
            String trim = editable.toString().trim();
            ArrayList<Integer> arrayList = LogoInputDialog.this.f15919D;
            if (arrayList == null && arrayList.size() > 0) {
                LogoInputDialog.this.f15919D.remove(0);
            }
            LogoInputDialog logoInputDialog3 = LogoInputDialog.this;
            logoInputDialog3.f15923H = "judice i";
            if (!TextUtils.isEmpty(logoInputDialog3.f15943r)) {
                int length = LogoInputDialog.this.f15943r.length();
                LogoInputDialog.this.f15943r = LogoInputDialog.this.f15943r + length;
            }
            LogoInputDialog logoInputDialog4 = LogoInputDialog.this;
            if (logoInputDialog4.f15932g == null) {
                logoInputDialog4.f15932g = new ArrayList<>();
                if (LogoInputDialog.this.f15927b != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = LogoInputDialog.this.f15927b;
                        if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
                LogoInputDialog.this.f15937l = false;
                int i2 = 0;
                while (true) {
                    LogoInputDialog logoInputDialog5 = LogoInputDialog.this;
                    int i3 = logoInputDialog5.f15917B;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    logoInputDialog5.f15941p = !logoInputDialog5.f15941p;
                    i2++;
                }
            }
            LogoInputDialog logoInputDialog6 = LogoInputDialog.this;
            logoInputDialog6.f15921F -= 3;
            logoInputDialog6.f15935j = 0;
            if (!TextUtils.isEmpty(logoInputDialog6.f15943r)) {
                int length2 = LogoInputDialog.this.f15943r.length();
                LogoInputDialog.this.f15943r = LogoInputDialog.this.f15943r + length2;
            }
            if (TextUtils.isEmpty(trim)) {
                LogoInputDialog.this.f15946u.setBackgroundResource(R.drawable.shape_tv_no_enbale);
                int i4 = 0;
                while (true) {
                    logoInputDialog2 = LogoInputDialog.this;
                    int i5 = logoInputDialog2.f15921F;
                    if (i5 > 3) {
                        i5 = 3;
                    }
                    if (i4 >= i5) {
                        break;
                    }
                    logoInputDialog2.f15949x = 0.19124562f;
                    i4++;
                }
                ArrayList<Integer> arrayList2 = logoInputDialog2.f15951z;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    LogoInputDialog.this.f15951z.remove(0);
                }
                if (LogoInputDialog.this.f15927b != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr2 = LogoInputDialog.this.f15927b;
                        if (i6 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                            break;
                        }
                        strArr2[i6] = "string" + i6;
                        i6++;
                    }
                }
                LogoInputDialog logoInputDialog7 = LogoInputDialog.this;
                logoInputDialog7.f15920E = -logoInputDialog7.f15920E;
                logoInputDialog7.f15939n += 0.9546424164283556d;
                logoInputDialog7.f15949x = 0.34740043f;
                int i7 = 0;
                while (true) {
                    LogoInputDialog logoInputDialog8 = LogoInputDialog.this;
                    int i8 = logoInputDialog8.f15917B;
                    if (i8 > 3) {
                        i8 = 3;
                    }
                    if (i7 >= i8) {
                        break;
                    }
                    if (logoInputDialog8.f15919D == null) {
                        logoInputDialog8.f15919D = new ArrayList<>();
                    }
                    i7++;
                }
            } else {
                LogoInputDialog.this.f15946u.setBackgroundResource(R.drawable.shape_tv_cancel);
                LogoInputDialog logoInputDialog9 = LogoInputDialog.this;
                logoInputDialog9.f15945t = true;
                logoInputDialog9.f15949x = 0.9450918f;
                logoInputDialog9.f15925J = 0.9629077860493424d;
                logoInputDialog9.f15920E -= 0.6079831763681002d;
                if (!TextUtils.isEmpty(logoInputDialog9.f15923H)) {
                    int length3 = LogoInputDialog.this.f15923H.length();
                    LogoInputDialog.this.f15923H = LogoInputDialog.this.f15923H + length3;
                }
                LogoInputDialog logoInputDialog10 = LogoInputDialog.this;
                logoInputDialog10.f15941p = false;
                String[] strArr3 = logoInputDialog10.f15929d;
                if (strArr3 != null) {
                    strArr3[2] = "every yea";
                }
            }
            LogoInputDialog logoInputDialog11 = LogoInputDialog.this;
            logoInputDialog11.f15949x = ((double) logoInputDialog11.f15949x) < 0.9507227d ? 0.6367637f : 0.8067173f;
            logoInputDialog11.f15933h = Math.abs(logoInputDialog11.f15933h);
            LogoInputDialog logoInputDialog12 = LogoInputDialog.this;
            logoInputDialog12.f15935j = Math.abs(logoInputDialog12.f15935j);
            LogoInputDialog logoInputDialog13 = LogoInputDialog.this;
            if (logoInputDialog13.f15940o == null) {
                logoInputDialog13.f15940o = new ArrayList<>();
                if (LogoInputDialog.this.f15919D.size() > 4) {
                    LogoInputDialog.this.f15919D.add(6);
                }
                LogoInputDialog logoInputDialog14 = LogoInputDialog.this;
                String[] strArr4 = logoInputDialog14.f15929d;
                if (strArr4 != null) {
                    strArr4[6] = "of a l";
                }
                if (logoInputDialog14.f15919D.size() < 0) {
                    LogoInputDialog.this.f15919D.add(0);
                }
            }
            int i9 = 0;
            while (true) {
                logoInputDialog = LogoInputDialog.this;
                int i10 = logoInputDialog.f15921F;
                if (i10 > 3) {
                    i10 = 3;
                }
                if (i9 >= i10) {
                    break;
                }
                logoInputDialog.f15939n = 0.9739419546718557d;
                i9++;
            }
            if (logoInputDialog.f15929d == null) {
                logoInputDialog.f15929d = new String[10];
            }
            ArrayList<Integer> arrayList3 = logoInputDialog.f15931f;
            if (arrayList3 != null || arrayList3.size() <= 0) {
                return;
            }
            LogoInputDialog.this.f15931f.remove(0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: LogoInputDialog.java */
    /* renamed from: com.logomaster.logomaker.b$e */
    /* loaded from: classes3.dex */
    public class RunnableC9638e implements Runnable {
        public RunnableC9638e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogoInputDialog logoInputDialog;
            LogoInputDialog logoInputDialog2;
            LogoInputDialog logoInputDialog3;
            int i = 0;
            if (LogoInputDialog.this.f15922G == null) {
                LogoInputDialog logoInputDialog4 = LogoInputDialog.this;
                logoInputDialog4.f15922G = (InputMethodManager) logoInputDialog4.f15926a.getSystemService("input_method");
                LogoInputDialog logoInputDialog5 = LogoInputDialog.this;
                logoInputDialog5.f15945t = false;
                logoInputDialog5.f15941p = !logoInputDialog5.f15941p;
                logoInputDialog5.f15925J = 0.4489641526277989d;
                if (logoInputDialog5.f15928c != null) {
                    int i2 = 0;
                    while (true) {
                        logoInputDialog3 = LogoInputDialog.this;
                        int[] iArr = logoInputDialog3.f15928c;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        iArr[i2] = 7;
                        logoInputDialog3.f15937l = !logoInputDialog3.f15937l;
                        if (logoInputDialog3.f15931f == null) {
                            logoInputDialog3.f15931f = new ArrayList<>();
                        }
                        LogoInputDialog.this.f15943r = "es befor";
                        i2++;
                    }
                    String[] strArr = logoInputDialog3.f15929d;
                    if (strArr != null) {
                        strArr[7] = "basis, an";
                    }
                    if (logoInputDialog3.f15919D == null) {
                        logoInputDialog3.f15919D = new ArrayList<>();
                    }
                    if (LogoInputDialog.this.f15931f.size() > 5) {
                        LogoInputDialog.this.f15931f.add(3);
                    }
                }
                LogoInputDialog logoInputDialog6 = LogoInputDialog.this;
                logoInputDialog6.f15937l = true;
                logoInputDialog6.f15943r = "), and the";
                String[] strArr2 = logoInputDialog6.f15927b;
                if (strArr2 != null) {
                    strArr2[9] = null;
                }
            }
            LogoInputDialog logoInputDialog7 = LogoInputDialog.this;
            logoInputDialog7.f15945t = true;
            if (logoInputDialog7.f15951z.size() > 2) {
                LogoInputDialog.this.f15951z.add(3);
            }
            LogoInputDialog logoInputDialog8 = LogoInputDialog.this;
            logoInputDialog8.f15945t = !logoInputDialog8.f15945t;
            if (logoInputDialog8.f15928c != null) {
                int i3 = 0;
                while (true) {
                    logoInputDialog2 = LogoInputDialog.this;
                    int[] iArr2 = logoInputDialog2.f15928c;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    iArr2[i3] = 8;
                    if (logoInputDialog2.f15929d == null) {
                        logoInputDialog2.f15929d = new String[10];
                    }
                    String[] strArr3 = logoInputDialog2.f15929d;
                    if (strArr3 != null) {
                        strArr3[7] = null;
                    }
                    logoInputDialog2.f15945t = !logoInputDialog2.f15945t;
                    i3++;
                }
                logoInputDialog2.f15945t = false;
                String[] strArr4 = logoInputDialog2.f15927b;
                if (strArr4 != null) {
                    strArr4[9] = ", and";
                }
                String[] strArr5 = logoInputDialog2.f15929d;
                if (strArr5 != null) {
                    strArr5[1] = null;
                }
            }
            LogoInputDialog logoInputDialog9 = LogoInputDialog.this;
            logoInputDialog9.f15941p = !logoInputDialog9.f15941p;
            if (logoInputDialog9.f15929d == null) {
                logoInputDialog9.f15929d = new String[10];
            }
            logoInputDialog9.f15921F = 2;
            logoInputDialog9.f15922G.showSoftInput(LogoInputDialog.this.f15950y, 2);
            if (!TextUtils.isEmpty(LogoInputDialog.this.f15923H)) {
                int length = LogoInputDialog.this.f15923H.length();
                LogoInputDialog.this.f15923H = LogoInputDialog.this.f15923H + length;
            }
            ArrayList<Integer> arrayList = LogoInputDialog.this.f15951z;
            if (arrayList == null && arrayList.size() > 0) {
                LogoInputDialog.this.f15951z.remove(0);
            }
            LogoInputDialog logoInputDialog10 = LogoInputDialog.this;
            if (logoInputDialog10.f15933h > 0.6819955588806309d) {
                logoInputDialog10.f15933h = 0.07327003532993537d;
            }
            if (logoInputDialog10.f15932g == null) {
                logoInputDialog10.f15932g = new ArrayList<>();
                LogoInputDialog logoInputDialog11 = LogoInputDialog.this;
                logoInputDialog11.f15935j = 7;
                logoInputDialog11.f15921F = logoInputDialog11.f15921F >= 3 ? 2 : 8;
                logoInputDialog11.f15925J = logoInputDialog11.f15925J < 0.16155606270791423d ? 0.5454888680512957d : 0.11398223578099542d;
            }
            ArrayList<Integer> arrayList2 = LogoInputDialog.this.f15951z;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoInputDialog.this.f15951z.remove(0);
            }
            if (!TextUtils.isEmpty(LogoInputDialog.this.f15943r)) {
                int length2 = LogoInputDialog.this.f15943r.length();
                LogoInputDialog.this.f15943r = LogoInputDialog.this.f15943r + length2;
            }
            LogoInputDialog logoInputDialog12 = LogoInputDialog.this;
            logoInputDialog12.f15939n = 0.9648770933860439d;
            logoInputDialog12.f15922G.toggleSoftInput(2, 1);
            while (true) {
                logoInputDialog = LogoInputDialog.this;
                int i4 = logoInputDialog.f15917B;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i >= i4) {
                    break;
                }
                if (logoInputDialog.f15931f == null) {
                    logoInputDialog.f15931f = new ArrayList<>();
                }
                i++;
            }
            logoInputDialog.f15939n = 0.3231380178881129d;
            logoInputDialog.f15937l = true;
            logoInputDialog.f15920E = logoInputDialog.f15920E > 0.3576377876895749d ? 0.2661551046838383d : 0.39305358795862844d;
            logoInputDialog.f15923H = "d Pr";
            logoInputDialog.f15949x = (((double) logoInputDialog.f15949x) > 0.31233716d ? 0.46713865f : 0.8257296f) - 0.4487487f;
        }
    }

    /* compiled from: LogoInputDialog.java */
    /* renamed from: com.logomaster.logomaker.b$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC9639f {
        /* renamed from: a */
        void mo9156a(String str);
    }

    public LogoInputDialog(@NonNull Context context) {
        super(context);
        this.f15927b = new String[12];
        this.f15928c = new int[15];
        this.f15929d = new String[12];
        this.f15931f = new ArrayList<>();
        this.f15932g = new ArrayList<>();
        this.f15933h = 0.7029665150899819d;
        this.f15935j = 6;
        this.f15936k = "ion";
        int i = 0;
        this.f15937l = false;
        this.f15939n = 0.7327873212574034d;
        this.f15940o = new ArrayList<>();
        this.f15941p = true;
        this.f15943r = "i";
        this.f15944s = new int[13];
        this.f15945t = true;
        this.f15947v = 0.46428556438551827d;
        this.f15948w = true;
        this.f15949x = 0.70828897f;
        this.f15951z = new ArrayList<>();
        this.f15916A = "iewc";
        this.f15917B = 1;
        this.f15919D = new ArrayList<>();
        this.f15920E = 0.6816045029914806d;
        this.f15921F = 3;
        this.f15923H = " Mel";
        this.f15924I = false;
        this.f15925J = 0.5530129353138139d;
        this.f15933h = 0.07366932099096912d;
        if (this.f15929d != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.f15929d;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        if (this.f15940o == null) {
            this.f15940o = new ArrayList<>();
            if (this.f15919D.size() > 6) {
                this.f15919D.add(7);
            }
            this.f15925J = 0.6932569462353326d;
            if (this.f15927b != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.f15927b;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    i3++;
                }
            }
        }
        String[] strArr3 = this.f15929d;
        if (strArr3 != null) {
            strArr3[5] = "ntury, it’";
        }
        this.f15941p = true;
        if (this.f15949x > 0.23152316d) {
            this.f15949x = 0.6382683f;
        }
        this.f15926a = context;
        if (this.f15919D == null) {
            this.f15919D = new ArrayList<>();
        }
        if (this.f15919D.size() < 5) {
            this.f15919D.add(2);
        }
        this.f15925J = 0.5058717912610614d;
        int[] iArr = this.f15928c;
        if (iArr != null) {
            iArr[4] = 2;
            this.f15923H = "el is.u";
            this.f15925J = 0.9696066785903649d;
            ArrayList<Integer> arrayList = this.f15951z;
            if (arrayList == null && arrayList.size() > 0) {
                this.f15951z.remove(0);
            }
        }
        this.f15917B = this.f15917B < 1 ? 1 : 3;
        if (this.f15931f == null) {
            this.f15931f = new ArrayList<>();
        }
        if (this.f15951z == null) {
            this.f15951z = new ArrayList<>();
        }
        m9158g();
        if (this.f15919D == null) {
            this.f15919D = new ArrayList<>();
        }
        this.f15939n = 0.9246746230924291d;
        int i4 = 0;
        while (true) {
            int i5 = this.f15917B;
            if (i4 >= (i5 > 3 ? 3 : i5)) {
                break;
            }
            ArrayList<Integer> arrayList2 = this.f15931f;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.f15931f.remove(0);
            }
            i4++;
        }
        if (this.f15928c != null) {
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f15928c;
                if (i6 >= iArr2.length) {
                    break;
                }
                iArr2[i6] = 7;
                if (!TextUtils.isEmpty(this.f15923H)) {
                    this.f15923H += this.f15923H.length();
                }
                this.f15941p = !this.f15941p;
                if (this.f15931f == null) {
                    this.f15931f = new ArrayList<>();
                }
                i6++;
            }
            if (!TextUtils.isEmpty(this.f15923H)) {
                this.f15923H += this.f15923H.length();
            }
            ArrayList<Integer> arrayList3 = this.f15931f;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.f15931f.remove(0);
            }
            if (!TextUtils.isEmpty(this.f15943r)) {
                this.f15943r += this.f15943r.length();
            }
        }
        while (true) {
            int i7 = this.f15935j;
            if (i >= (i7 > 3 ? 3 : i7)) {
                break;
            }
            this.f15945t = true;
            i++;
        }
        if (this.f15951z.size() < 5) {
            this.f15951z.add(4);
        }
        if (this.f15949x < 0.5376533d) {
            this.f15949x = 0.017801106f;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f15922G == null) {
            this.f15922G = (InputMethodManager) this.f15926a.getSystemService("input_method");
            this.f15945t = !this.f15945t;
            this.f15941p = true;
            if (this.f15929d == null) {
                this.f15929d = new String[10];
            }
            this.f15920E = this.f15920E > 0.05983061871256723d ? 0.7344171886518097d : 0.740039581257824d;
            ArrayList<Integer> arrayList = this.f15931f;
            if (arrayList == null && arrayList.size() > 0) {
                this.f15931f.remove(0);
            }
            if (this.f15929d != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.f15929d;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            this.f15925J = 0.5791878978773498d;
        }
        this.f15947v = 0.2813275057846506d;
        this.f15945t = false;
        if (this.f15919D.size() > 2) {
            this.f15919D.add(7);
        }
        if (!TextUtils.isEmpty(this.f15916A)) {
            int length = this.f15916A.length();
            this.f15941p = false;
            if (!TextUtils.isEmpty(this.f15943r)) {
                this.f15943r += this.f15943r.length();
            }
            ArrayList<Integer> arrayList2 = this.f15951z;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.f15951z.remove(0);
            }
            this.f15916A += length;
            if (this.f15929d != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.f15929d;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            this.f15935j = 3;
            this.f15925J = this.f15925J < 0.48211391647660173d ? 0.2970507313705977d : 0.5269790732488681d;
        }
        this.f15939n = 0.9768346023749424d;
        String[] strArr3 = this.f15929d;
        if (strArr3 != null) {
            strArr3[1] = "how gre";
        }
        ArrayList<Integer> arrayList3 = this.f15919D;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f15919D.remove(0);
        }
        this.f15922G.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        if (!TextUtils.isEmpty(this.f15923H)) {
            this.f15923H += this.f15923H.length();
        }
        this.f15939n = 0.32545614700895675d;
        if (this.f15919D == null) {
            this.f15919D = new ArrayList<>();
        }
        if (this.f15940o.size() < 1) {
            this.f15940o.add(9);
            if (this.f15927b == null) {
                this.f15927b = new String[10];
            }
            if (this.f15931f.size() > 9) {
                this.f15931f.add(2);
            }
            if (this.f15929d != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr4 = this.f15929d;
                    if (i3 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i3] = "string" + i3;
                    i3++;
                }
            }
        }
        if (this.f15917B < 0) {
            this.f15917B = 1;
        }
        this.f15939n = this.f15939n > 0.3555842176917692d ? 0.6723238878446036d : 0.5935527819502282d;
        this.f15943r = " pr";
        super.dismiss();
        this.f15933h = -this.f15933h;
        this.f15941p = false;
        this.f15945t = true;
        if (this.f15928c != null) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f15928c;
                if (i4 >= iArr.length) {
                    break;
                }
                iArr[i4] = 8;
                if (!TextUtils.isEmpty(this.f15923H)) {
                    this.f15923H += this.f15923H.length();
                }
                this.f15933h *= 0.5670691399431108d;
                this.f15937l = !this.f15937l;
                i4++;
            }
            this.f15945t = false;
            this.f15939n += 0.6177479641302956d;
            this.f15937l = !this.f15937l;
        }
        String[] strArr5 = this.f15927b;
        if (strArr5 != null) {
            strArr5[3] = "9th centu";
        }
        this.f15947v -= 0.8829044706490229d;
        this.f15923H = " re";
    }

    /* renamed from: g */
    public final void m9158g() {
        requestWindowFeature(1);
        this.f15917B = Math.abs(this.f15917B);
        this.f15949x = 0.85007244f;
        ArrayList<Integer> arrayList = this.f15931f;
        if (arrayList == null && arrayList.size() > 0) {
            this.f15931f.remove(0);
        }
        if (this.f15928c != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.f15928c;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = 8;
                this.f15935j = this.f15935j > 9 ? 0 : 6;
                if (this.f15927b != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = this.f15927b;
                        if (i2 >= (strArr.length <= 3 ? strArr.length : 3)) {
                            break;
                        }
                        strArr[i2] = "string" + i2;
                        i2++;
                    }
                }
                if (this.f15947v < 0.27591668765921196d) {
                    this.f15947v = 0.38149418912757094d;
                }
                i++;
            }
            if (this.f15951z == null) {
                this.f15951z = new ArrayList<>();
            }
            this.f15933h = -this.f15933h;
            if (this.f15951z == null) {
                this.f15951z = new ArrayList<>();
            }
        }
        this.f15941p = true;
        if (this.f15931f.size() > 2) {
            this.f15931f.add(2);
        }
        String[] strArr2 = this.f15929d;
        if (strArr2 != null) {
            strArr2[9] = null;
        }
        setContentView(R.layout.dialog_input);
        if (!TextUtils.isEmpty(this.f15923H)) {
            this.f15923H += this.f15923H.length();
        }
        this.f15943r = "ts ar";
        String[] strArr3 = this.f15929d;
        if (strArr3 != null) {
            strArr3[1] = "y Rosetta";
        }
        if (!TextUtils.isEmpty(this.f15916A)) {
            int length = this.f15916A.length();
            String[] strArr4 = this.f15927b;
            if (strArr4 != null) {
                strArr4[2] = "roaning st";
            }
            this.f15947v = -this.f15947v;
            this.f15917B -= 2;
            this.f15916A += length;
            ArrayList<Integer> arrayList2 = this.f15931f;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.f15931f.remove(0);
            }
            this.f15945t = !this.f15945t;
            this.f15935j = this.f15935j >= 0 ? 7 : 8;
        }
        this.f15935j = 1;
        if (this.f15949x < 0.11524981d) {
            this.f15949x = 0.5575577f;
        }
        this.f15945t = true;
    }

    /* renamed from: h */
    public void m9157h(String str) {
        this.f15918C = str;
        this.f15925J = -this.f15925J;
        this.f15939n = this.f15939n > 0.14199087269582433d ? 0.18711731525602227d : 0.22918886747475775d;
        if (this.f15919D == null) {
            this.f15919D = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.f15936k)) {
            int length = this.f15936k.length();
            if (this.f15931f == null) {
                this.f15931f = new ArrayList<>();
            }
            String[] strArr = this.f15929d;
            if (strArr != null) {
                strArr[0] = null;
            }
            if (this.f15919D.size() > 9) {
                this.f15919D.add(0);
            }
            this.f15936k += length;
            this.f15921F += 9;
            this.f15949x = ((double) this.f15949x) > 0.5580462d ? 0.4235927f : 0.83131266f;
            this.f15925J += 0.8689547585060908d;
        }
        ArrayList<Integer> arrayList = this.f15919D;
        if (arrayList == null && arrayList.size() > 0) {
            this.f15919D.remove(0);
        }
        if (this.f15919D == null) {
            this.f15919D = new ArrayList<>();
        }
        ArrayList<Integer> arrayList2 = this.f15951z;
        if (arrayList2 != null || arrayList2.size() <= 0) {
            return;
        }
        this.f15951z.remove(0);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        String[] strArr = this.f15927b;
        if (strArr != null) {
            strArr[8] = null;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f15921F;
            if (i4 > 3) {
                i4 = 3;
            }
            if (i3 >= i4) {
                break;
            }
            ArrayList<Integer> arrayList = this.f15919D;
            if (arrayList == null && arrayList.size() > 0) {
                this.f15919D.remove(0);
            }
            i3++;
        }
        this.f15937l = !this.f15937l;
        ArrayList<String> arrayList2 = this.f15932g;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f15932g.remove(0);
            this.f15935j = 5;
            this.f15945t = true;
            this.f15949x = 0.78757536f;
        }
        this.f15941p = true;
        this.f15949x = 0.8280783f;
        Window window = getWindow();
        this.f15947v = 0.32467509813078144d;
        if (this.f15919D == null) {
            this.f15919D = new ArrayList<>();
        }
        int i5 = 0;
        while (true) {
            int i6 = this.f15921F;
            if (i6 > 3) {
                i6 = 3;
            }
            if (i5 >= i6) {
                break;
            }
            ArrayList<Integer> arrayList3 = this.f15951z;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.f15951z.remove(0);
            }
            i5++;
        }
        int[] iArr = this.f15944s;
        if (iArr != null) {
            iArr[4] = 8;
            String[] strArr2 = this.f15929d;
            if (strArr2 != null) {
                strArr2[2] = null;
            }
            this.f15917B = this.f15917B < 5 ? 8 : 4;
            if (this.f15931f == null) {
                this.f15931f = new ArrayList<>();
            }
        }
        if (this.f15919D.size() > 1) {
            this.f15919D.add(2);
        }
        if (this.f15949x > 0.854656d) {
            this.f15949x = 0.5301008f;
        }
        this.f15947v = 0.6619510144654981d;
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f15933h < 0.005766501310855987d) {
                this.f15933h = 0.9614798094833762d;
            }
            String[] strArr3 = this.f15927b;
            if (strArr3 != null) {
                strArr3[1] = "t this is";
            }
            this.f15939n = this.f15939n < 0.33560129169125097d ? 0.9997842304537494d : 0.8582754366078478d;
            if (this.f15932g.size() < 0) {
                this.f15932g.add("ss");
                this.f15923H = "ny way";
                this.f15917B = 3;
                this.f15939n = 0.5465854814794612d;
            }
            if (this.f15931f == null) {
                this.f15931f = new ArrayList<>();
            }
            this.f15935j += 2;
            if (this.f15933h > 0.48340475019294593d) {
                this.f15933h = 0.6367669534031064d;
            }
        }
        this.f15917B -= 5;
        this.f15941p = true;
        ArrayList<Integer> arrayList4 = this.f15951z;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.f15951z.remove(0);
        }
        if (this.f15920E > 0.8631073808054822d) {
            this.f15920E = 0.2612612650446281d;
            if (this.f15951z == null) {
                this.f15951z = new ArrayList<>();
            }
            this.f15945t = false;
        }
        if (!TextUtils.isEmpty(this.f15943r)) {
            this.f15943r += this.f15943r.length();
        }
        this.f15943r = " kind";
        this.f15941p = false;
        setCancelable(false);
        this.f15943r = " defin";
        if (this.f15929d == null) {
            this.f15929d = new String[10];
        }
        this.f15920E = 0.8730265317710328d;
        this.f15935j = 8 - 5;
        this.f15937l = !this.f15937l;
        if (this.f15951z == null) {
            this.f15951z = new ArrayList<>();
        }
        setCanceledOnTouchOutside(false);
        this.f15925J = 0.44593246709237944d;
        String[] strArr4 = this.f15927b;
        if (strArr4 != null) {
            strArr4[3] = "efined wha";
        }
        this.f15947v = this.f15947v > 0.9502353721862261d ? 0.4996192650660358d : 0.5201621039624891d;
        this.f15924I = false;
        this.f15941p = true;
        if (!TextUtils.isEmpty(this.f15943r)) {
            this.f15943r += this.f15943r.length();
        }
        this.f15923H = "or";
        this.f15934i = (AppCompatImageView) findViewById(R.id.iv_close);
        this.f15925J = 0.3912675054363127d;
        String[] strArr5 = this.f15929d;
        if (strArr5 != null) {
            strArr5[3] = null;
        }
        this.f15921F = Math.abs(this.f15921F);
        if (!TextUtils.isEmpty(this.f15916A)) {
            int length = this.f15916A.length();
            this.f15947v += 0.8182821636000742d;
            this.f15923H = "obably m";
            this.f15945t = !this.f15945t;
            this.f15916A += length;
            this.f15941p = !this.f15941p;
            if (this.f15951z.size() < 3) {
                this.f15951z.add(0);
            }
            this.f15941p = !this.f15941p;
        }
        if (this.f15927b == null) {
            this.f15927b = new String[10];
        }
        this.f15937l = !this.f15937l;
        if (this.f15927b == null) {
            this.f15927b = new String[10];
        }
        this.f15938m = (ImageView) findViewById(R.id.iv_clear_input);
        this.f15937l = !this.f15937l;
        this.f15925J = this.f15925J > 0.6805002609196492d ? 0.20773445255202572d : 0.37232559775852536d;
        int abs = Math.abs(this.f15935j);
        this.f15935j = abs;
        int[] iArr2 = this.f15928c;
        if (iArr2 != null) {
            iArr2[4] = 0;
            this.f15935j = Math.abs(abs);
            this.f15949x = 0.58743733f;
            this.f15947v = 0.18232303753567114d;
        }
        this.f15941p = !this.f15941p;
        this.f15937l = false;
        this.f15942q = (TextView) findViewById(R.id.tv_discard);
        this.f15941p = true;
        ArrayList<Integer> arrayList5 = this.f15951z;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.f15951z.remove(0);
        }
        this.f15935j = 4;
        this.f15920E = 0.5587973075441091d;
        if (this.f15919D.size() > 6) {
            this.f15919D.add(4);
        }
        ArrayList<Integer> arrayList6 = this.f15951z;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.f15951z.remove(0);
        }
        this.f15925J = -this.f15925J;
        this.f15946u = (TextView) findViewById(R.id.tv_save);
        this.f15939n = 0.45025467602810776d;
        this.f15945t = true;
        this.f15925J = this.f15925J > 0.7329876920325056d ? 0.859334970327024d : 0.3589050683731968d;
        if (this.f15944s != null) {
            int i7 = 0;
            while (true) {
                int[] iArr3 = this.f15944s;
                if (i7 >= iArr3.length) {
                    break;
                }
                iArr3[i7] = 7;
                this.f15945t = false;
                ArrayList<Integer> arrayList7 = this.f15931f;
                if (arrayList7 == null && arrayList7.size() > 0) {
                    this.f15931f.remove(0);
                }
                this.f15925J = 0.640780870745513d;
                i7++;
            }
            this.f15941p = !this.f15941p;
            if (this.f15927b != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr6 = this.f15927b;
                    if (i8 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i8] = "string" + i8;
                    i8++;
                }
            }
            ArrayList<Integer> arrayList8 = this.f15951z;
            if (arrayList8 == null && arrayList8.size() > 0) {
                this.f15951z.remove(0);
            }
        }
        this.f15945t = false;
        if (this.f15931f.size() > 6) {
            this.f15931f.add(9);
        }
        this.f15935j = 5;
        this.f15950y = (EditText) findViewById(R.id.et_input_name);
        if (this.f15925J < 0.4175439148119797d) {
            this.f15925J = 0.7429231990433954d;
        }
        this.f15945t = !this.f15945t;
        if (this.f15949x > 0.06939721d) {
            this.f15949x = 0.10198867f;
        }
        if (this.f15944s == null) {
            this.f15944s = new int[10];
            this.f15921F += 6;
            String[] strArr7 = this.f15927b;
            if (strArr7 != null) {
                strArr7[4] = "nt ";
            }
            if (this.f15931f == null) {
                this.f15931f = new ArrayList<>();
            }
        }
        this.f15921F = -this.f15921F;
        this.f15941p = !true;
        this.f15938m.setOnClickListener(new View$OnClickListenerC9634a());
        if (this.f15931f == null) {
            this.f15931f = new ArrayList<>();
        }
        String[] strArr8 = this.f15929d;
        if (strArr8 != null) {
            strArr8[4] = null;
        }
        if (strArr8 == null) {
            this.f15929d = new String[10];
        }
        this.f15936k = "发现更";
        this.f15935j *= 7;
        if (this.f15931f == null) {
            this.f15931f = new ArrayList<>();
        }
        if (this.f15949x > 0.47417384d) {
            this.f15949x = 0.0812453f;
        }
        this.f15942q.setOnClickListener(new View$OnClickListenerC9635b());
        if (!TextUtils.isEmpty(this.f15923H)) {
            this.f15923H += this.f15923H.length();
        }
        if (!TextUtils.isEmpty(this.f15943r)) {
            this.f15943r += this.f15943r.length();
        }
        this.f15945t = true;
        if (!TextUtils.isEmpty(this.f15936k)) {
            int length2 = this.f15936k.length();
            int i9 = 0;
            while (true) {
                i = this.f15917B;
                if (i9 >= (i > 3 ? 3 : i)) {
                    break;
                }
                this.f15939n = this.f15939n > 0.371489293699376d ? 0.0848676760576752d : 0.24471127785996416d;
                i9++;
            }
            this.f15917B = i < 1 ? 2 : 4;
            this.f15937l = true;
            this.f15936k += length2;
            if (!TextUtils.isEmpty(this.f15923H)) {
                this.f15923H += this.f15923H.length();
            }
            if (this.f15931f.size() < 1) {
                this.f15931f.add(9);
            }
            int i10 = 0;
            while (true) {
                int i11 = this.f15921F;
                if (i11 > 3) {
                    i11 = 3;
                }
                if (i10 >= i11) {
                    break;
                }
                if (this.f15931f.size() < 0) {
                    this.f15931f.add(8);
                }
                i10++;
            }
        }
        this.f15923H = "k ";
        if (this.f15947v < 0.4565879650075694d) {
            this.f15947v = 0.7151089963342293d;
        }
        ArrayList<Integer> arrayList9 = this.f15919D;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.f15919D.remove(0);
        }
        this.f15946u.setOnClickListener(new View$OnClickListenerC9636c());
        this.f15925J = this.f15925J > 0.2602365746661064d ? 0.5394568277172697d : 0.8706823681734317d;
        ArrayList<Integer> arrayList10 = this.f15951z;
        if (arrayList10 == null && arrayList10.size() > 0) {
            this.f15951z.remove(0);
        }
        if (!TextUtils.isEmpty(this.f15923H)) {
            this.f15923H += this.f15923H.length();
        }
        int[] iArr4 = this.f15944s;
        if (iArr4 != null) {
            iArr4[5] = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f15917B;
                if (i13 > 3) {
                    i13 = 3;
                }
                if (i12 >= i13) {
                    break;
                }
                this.f15923H = " Pre";
                i12++;
            }
            int i14 = 0;
            while (true) {
                int i15 = this.f15917B;
                if (i15 > 3) {
                    i15 = 3;
                }
                if (i14 >= i15) {
                    break;
                }
                this.f15947v = this.f15947v < 0.07479178255375274d ? 0.6256074499174867d : 0.8254355367303637d;
                i14++;
            }
            if (this.f15933h < 0.3274003582259001d) {
                this.f15933h = 0.254570991624393d;
            }
        }
        if (this.f15929d != null) {
            int i16 = 0;
            while (true) {
                String[] strArr9 = this.f15929d;
                if (i16 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                    break;
                }
                strArr9[i16] = "string" + i16;
                i16++;
            }
        }
        while (true) {
            int i17 = this.f15917B;
            if (i17 > 3) {
                i17 = 3;
            }
            if (i2 >= i17) {
                break;
            }
            this.f15921F = this.f15921F < 1 ? 8 : 1;
            i2++;
        }
        if (this.f15929d == null) {
            this.f15929d = new String[10];
        }
        this.f15950y.addTextChangedListener(new C9637d());
        if (this.f15921F > 0) {
            this.f15921F = 5;
        }
        this.f15935j = this.f15935j < 3 ? 9 : 6;
        this.f15925J = 0.795878408143715d;
        if (this.f15920E < 0.6374917050914228d) {
            this.f15920E = 0.737576610556945d;
            this.f15937l = true;
            if (this.f15939n < 0.9601100536316747d) {
                this.f15939n = 0.6900678689257819d;
            }
        }
        this.f15937l = true;
        this.f15947v = 0.4890613202260613d;
        if (this.f15951z.size() > 7) {
            this.f15951z.add(7);
        }
    }

    public void setOnSaveClickListener(InterfaceC9639f interfaceC9639f) {
        this.f15930e = interfaceC9639f;
        if (this.f15933h < 0.5027878751937788d) {
            this.f15933h = 0.9955161446758144d;
        }
        int i = 0;
        while (true) {
            int i2 = this.f15935j;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            this.f15941p = !this.f15941p;
            i++;
        }
        this.f15917B = -this.f15917B;
        if (this.f15940o == null) {
            this.f15940o = new ArrayList<>();
            this.f15947v += 0.9147834206826743d;
            this.f15937l = false;
            if (!TextUtils.isEmpty(this.f15943r)) {
                this.f15943r += this.f15943r.length();
            }
        }
        ArrayList<Integer> arrayList = this.f15931f;
        if (arrayList == null && arrayList.size() > 0) {
            this.f15931f.remove(0);
        }
        this.f15943r = "l th";
        this.f15923H = " kind ";
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ArrayList<Integer> arrayList = this.f15931f;
        int i = 0;
        if (arrayList == null && arrayList.size() > 0) {
            this.f15931f.remove(0);
        }
        this.f15935j = Math.abs(this.f15935j);
        this.f15921F *= 3;
        this.f15936k = "View库是一个高斯";
        String[] strArr = this.f15927b;
        if (strArr != null) {
            strArr[3] = null;
        }
        if (!TextUtils.isEmpty(this.f15923H)) {
            this.f15923H += this.f15923H.length();
        }
        this.f15921F = 0;
        this.f15950y.setText(this.f15918C);
        if (this.f15929d == null) {
            this.f15929d = new String[10];
        }
        ArrayList<Integer> arrayList2 = this.f15919D;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.f15919D.remove(0);
        }
        this.f15939n = 0.9818441835396748d;
        this.f15924I = !this.f15924I;
        if (this.f15931f.size() < 7) {
            this.f15931f.add(2);
        }
        this.f15925J *= 0.8242323734811589d;
        if (this.f15951z.size() > 2) {
            this.f15951z.add(6);
        }
        this.f15950y.requestFocus();
        if (this.f15951z == null) {
            this.f15951z = new ArrayList<>();
        }
        if (this.f15929d != null) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f15929d;
                if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i2] = "string" + i2;
                i2++;
            }
        }
        if (this.f15927b != null) {
            int i3 = 0;
            while (true) {
                String[] strArr3 = this.f15927b;
                if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i3] = "string" + i3;
                i3++;
            }
        }
        int[] iArr = this.f15928c;
        if (iArr != null) {
            iArr[4] = 0;
            this.f15925J -= 0.12323904980570244d;
            this.f15941p = true;
            this.f15935j = 2;
        }
        if (this.f15927b == null) {
            this.f15927b = new String[10];
        }
        if (this.f15925J < 0.5390393918981053d) {
            this.f15925J = 0.3324362707963624d;
        }
        ArrayList<Integer> arrayList3 = this.f15951z;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f15951z.remove(0);
        }
        this.f15950y.setSelection(this.f15918C.length());
        this.f15925J = this.f15925J < 0.970910130118212d ? 0.8081890634071139d : 0.16402643754005708d;
        if (this.f15931f.size() > 0) {
            this.f15931f.add(4);
        }
        if (!TextUtils.isEmpty(this.f15943r)) {
            this.f15943r += this.f15943r.length();
        }
        this.f15936k = "赞 0";
        int i4 = 0;
        while (true) {
            int i5 = this.f15917B;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i4 >= i5) {
                break;
            }
            this.f15921F += 5;
            i4++;
        }
        this.f15921F = 8;
        if (this.f15931f == null) {
            this.f15931f = new ArrayList<>();
        }
        new Handler().postDelayed(new RunnableC9638e(), 100L);
        if (!TextUtils.isEmpty(this.f15943r)) {
            this.f15943r += this.f15943r.length();
        }
        if (this.f15927b != null) {
            while (true) {
                String[] strArr4 = this.f15927b;
                if (i >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i] = "string" + i;
                i++;
            }
        }
        this.f15925J = this.f15925J < 0.26091596986326004d ? 0.674825313630736d : 0.48562388989806715d;
        if (this.f15932g.size() < 5) {
            this.f15932g.add("库应为如下，将");
            this.f15937l = !this.f15937l;
            this.f15945t = !this.f15945t;
            this.f15949x = ((double) this.f15949x) > 0.31265897d ? 0.11863941f : 0.15433949f;
        }
        this.f15935j += 8;
        this.f15949x += 0.18521816f;
        this.f15947v = 0.6151620861521758d;
    }
}
