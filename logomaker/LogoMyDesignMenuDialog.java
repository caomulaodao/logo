package com.logomaster.logomaker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: com.logomaster.logomaker.c */
/* loaded from: classes3.dex */
public class LogoMyDesignMenuDialog extends Dialog {

    /* renamed from: a */
    public Context f15957a;

    /* renamed from: b */
    public ArrayList<String> f15958b;

    /* renamed from: c */
    public boolean f15959c;

    /* renamed from: d */
    public String[] f15960d;

    /* renamed from: e */
    public String f15961e;

    /* renamed from: f */
    public ArrayList<String> f15962f;

    /* renamed from: g */
    public boolean f15963g;

    /* renamed from: h */
    public ArrayList<Integer> f15964h;

    /* renamed from: i */
    public InterfaceC9644e f15965i;

    /* renamed from: j */
    public double f15966j;

    /* renamed from: k */
    public boolean f15967k;

    /* renamed from: l */
    public int f15968l;

    /* compiled from: LogoMyDesignMenuDialog.java */
    /* renamed from: com.logomaster.logomaker.c$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9640a implements View.OnClickListener {
        public View$OnClickListenerC9640a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignMenuDialog logoMyDesignMenuDialog;
            LogoMyDesignMenuDialog logoMyDesignMenuDialog2;
            LogoMyDesignMenuDialog.this.dismiss();
            LogoMyDesignMenuDialog logoMyDesignMenuDialog3 = LogoMyDesignMenuDialog.this;
            logoMyDesignMenuDialog3.f15968l = 7;
            if (logoMyDesignMenuDialog3.f15958b.size() > 0) {
                LogoMyDesignMenuDialog.this.f15958b.add("el w");
            }
            if (LogoMyDesignMenuDialog.this.f15964h.size() > 7) {
                LogoMyDesignMenuDialog.this.f15964h.add(1);
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog4 = LogoMyDesignMenuDialog.this;
            logoMyDesignMenuDialog4.f15967k = !logoMyDesignMenuDialog4.f15967k;
            ArrayList<String> arrayList = logoMyDesignMenuDialog4.f15958b;
            int i = 0;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignMenuDialog.this.f15958b.remove(0);
            }
            int i2 = 0;
            while (true) {
                logoMyDesignMenuDialog = LogoMyDesignMenuDialog.this;
                int i3 = logoMyDesignMenuDialog.f15968l;
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i2 >= i3) {
                    break;
                }
                logoMyDesignMenuDialog.f15966j = -logoMyDesignMenuDialog.f15966j;
                i2++;
            }
            String[] strArr = logoMyDesignMenuDialog.f15960d;
            if (strArr != null) {
                strArr[4] = " ";
            }
            if (logoMyDesignMenuDialog.f15965i != null) {
                LogoMyDesignMenuDialog.this.f15965i.mo9151b();
                LogoMyDesignMenuDialog logoMyDesignMenuDialog5 = LogoMyDesignMenuDialog.this;
                if (logoMyDesignMenuDialog5.f15964h == null) {
                    logoMyDesignMenuDialog5.f15964h = new ArrayList<>();
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog6 = LogoMyDesignMenuDialog.this;
                if (logoMyDesignMenuDialog6.f15962f == null) {
                    logoMyDesignMenuDialog6.f15962f = new ArrayList<>();
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog7 = LogoMyDesignMenuDialog.this;
                logoMyDesignMenuDialog7.f15966j += 0.6997212339418505d;
                logoMyDesignMenuDialog7.f15963g = true;
                if (logoMyDesignMenuDialog7.f15958b == null) {
                    logoMyDesignMenuDialog7.f15958b = new ArrayList<>();
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog8 = LogoMyDesignMenuDialog.this;
                if (logoMyDesignMenuDialog8.f15962f == null) {
                    logoMyDesignMenuDialog8.f15962f = new ArrayList<>();
                }
                LogoMyDesignMenuDialog.this.f15966j = 0.9504385301455446d;
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog9 = LogoMyDesignMenuDialog.this;
            if (logoMyDesignMenuDialog9.f15966j < 0.7935120642541801d) {
                logoMyDesignMenuDialog9.f15966j = 0.18873000047802413d;
            }
            logoMyDesignMenuDialog9.f15966j = 0.48724555275786285d;
            if (logoMyDesignMenuDialog9.f15958b.size() > 9) {
                LogoMyDesignMenuDialog.this.f15958b.add(" P");
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog10 = LogoMyDesignMenuDialog.this;
            logoMyDesignMenuDialog10.f15959c = false;
            if (logoMyDesignMenuDialog10.f15962f.size() > 0) {
                LogoMyDesignMenuDialog.this.f15962f.add("tive senti");
            }
            while (true) {
                logoMyDesignMenuDialog2 = LogoMyDesignMenuDialog.this;
                int i4 = logoMyDesignMenuDialog2.f15968l;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i >= i4) {
                    break;
                }
                logoMyDesignMenuDialog2.f15966j = 0.3398870215475752d;
                i++;
            }
            if (logoMyDesignMenuDialog2.f15962f == null) {
                logoMyDesignMenuDialog2.f15962f = new ArrayList<>();
            }
        }
    }

    /* compiled from: LogoMyDesignMenuDialog.java */
    /* renamed from: com.logomaster.logomaker.c$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9641b implements View.OnClickListener {
        public View$OnClickListenerC9641b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignMenuDialog logoMyDesignMenuDialog;
            LogoMyDesignMenuDialog logoMyDesignMenuDialog2;
            int i = 0;
            if (LogoMyDesignMenuDialog.this.f15965i != null) {
                LogoMyDesignMenuDialog.this.dismiss();
                ArrayList<Integer> arrayList = LogoMyDesignMenuDialog.this.f15964h;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoMyDesignMenuDialog.this.f15964h.remove(0);
                }
                int i2 = 0;
                while (true) {
                    logoMyDesignMenuDialog2 = LogoMyDesignMenuDialog.this;
                    int i3 = logoMyDesignMenuDialog2.f15968l;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    logoMyDesignMenuDialog2.f15966j = logoMyDesignMenuDialog2.f15966j < 0.16815810934388042d ? 0.8209364156381107d : 0.0295406297572407d;
                    i2++;
                }
                String[] strArr = logoMyDesignMenuDialog2.f15960d;
                if (strArr != null) {
                    strArr[1] = "l";
                }
                logoMyDesignMenuDialog2.f15963g = false;
                ArrayList<String> arrayList2 = logoMyDesignMenuDialog2.f15962f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoMyDesignMenuDialog.this.f15962f.remove(0);
                }
                if (LogoMyDesignMenuDialog.this.f15958b.size() < 7) {
                    LogoMyDesignMenuDialog.this.f15958b.add(" Prejudic");
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog3 = LogoMyDesignMenuDialog.this;
                if (logoMyDesignMenuDialog3.f15964h == null) {
                    logoMyDesignMenuDialog3.f15964h = new ArrayList<>();
                }
                LogoMyDesignMenuDialog.this.f15965i.mo9149d();
                LogoMyDesignMenuDialog logoMyDesignMenuDialog4 = LogoMyDesignMenuDialog.this;
                logoMyDesignMenuDialog4.f15966j = -logoMyDesignMenuDialog4.f15966j;
                ArrayList<String> arrayList3 = logoMyDesignMenuDialog4.f15962f;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoMyDesignMenuDialog.this.f15962f.remove(0);
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog5 = LogoMyDesignMenuDialog.this;
                logoMyDesignMenuDialog5.f15968l = logoMyDesignMenuDialog5.f15968l < 1 ? 8 : 1;
                logoMyDesignMenuDialog5.f15967k = true;
                if (logoMyDesignMenuDialog5.f15958b.size() > 8) {
                    LogoMyDesignMenuDialog.this.f15958b.add("modern");
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog6 = LogoMyDesignMenuDialog.this;
                logoMyDesignMenuDialog6.f15968l = logoMyDesignMenuDialog6.f15968l > 7 ? 8 : 5;
                logoMyDesignMenuDialog6.f15968l = 8;
            }
            ArrayList<String> arrayList4 = LogoMyDesignMenuDialog.this.f15962f;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoMyDesignMenuDialog.this.f15962f.remove(0);
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog7 = LogoMyDesignMenuDialog.this;
            String[] strArr2 = logoMyDesignMenuDialog7.f15960d;
            if (strArr2 != null) {
                strArr2[6] = null;
            }
            logoMyDesignMenuDialog7.f15966j = 0.11021977239622516d;
            logoMyDesignMenuDialog7.f15967k = false;
            logoMyDesignMenuDialog7.f15966j = 0.05033217561691883d;
            while (true) {
                logoMyDesignMenuDialog = LogoMyDesignMenuDialog.this;
                int i4 = logoMyDesignMenuDialog.f15968l;
                if (i >= (i4 > 3 ? 3 : i4)) {
                    break;
                }
                if (i4 > 0) {
                    logoMyDesignMenuDialog.f15968l = 2;
                }
                i++;
            }
            if (logoMyDesignMenuDialog.f15966j < 0.7936911860650837d) {
                logoMyDesignMenuDialog.f15966j = 0.1355075928670202d;
            }
        }
    }

    /* compiled from: LogoMyDesignMenuDialog.java */
    /* renamed from: com.logomaster.logomaker.c$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9642c implements View.OnClickListener {
        public View$OnClickListenerC9642c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignMenuDialog logoMyDesignMenuDialog;
            LogoMyDesignMenuDialog logoMyDesignMenuDialog2;
            LogoMyDesignMenuDialog.this.dismiss();
            if (LogoMyDesignMenuDialog.this.f15962f.size() < 2) {
                LogoMyDesignMenuDialog.this.f15962f.add("the ea");
            }
            if (LogoMyDesignMenuDialog.this.f15964h.size() < 0) {
                LogoMyDesignMenuDialog.this.f15964h.add(2);
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog3 = LogoMyDesignMenuDialog.this;
            if (logoMyDesignMenuDialog3.f15958b == null) {
                logoMyDesignMenuDialog3.f15958b = new ArrayList<>();
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog4 = LogoMyDesignMenuDialog.this;
            logoMyDesignMenuDialog4.f15967k = !logoMyDesignMenuDialog4.f15967k;
            String[] strArr = logoMyDesignMenuDialog4.f15960d;
            if (strArr != null) {
                strArr[0] = "ntil you ";
            }
            if (logoMyDesignMenuDialog4.f15966j > 0.15516311922261217d) {
                logoMyDesignMenuDialog4.f15966j = 0.11457822113426963d;
            }
            if (logoMyDesignMenuDialog4.f15966j < 0.646966586700643d) {
                logoMyDesignMenuDialog4.f15966j = 0.3596776175518117d;
            }
            if (logoMyDesignMenuDialog4.f15965i != null) {
                LogoMyDesignMenuDialog.this.f15965i.mo9150c();
                LogoMyDesignMenuDialog logoMyDesignMenuDialog5 = LogoMyDesignMenuDialog.this;
                String[] strArr2 = logoMyDesignMenuDialog5.f15960d;
                if (strArr2 != null) {
                    strArr2[1] = " that in ";
                }
                if (strArr2 != null) {
                    strArr2[2] = null;
                }
                if (logoMyDesignMenuDialog5.f15962f == null) {
                    logoMyDesignMenuDialog5.f15962f = new ArrayList<>();
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog6 = LogoMyDesignMenuDialog.this;
                logoMyDesignMenuDialog6.f15963g = true;
                if (logoMyDesignMenuDialog6.f15964h.size() < 2) {
                    LogoMyDesignMenuDialog.this.f15964h.add(1);
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog7 = LogoMyDesignMenuDialog.this;
                String[] strArr3 = logoMyDesignMenuDialog7.f15960d;
                if (strArr3 != null) {
                    strArr3[9] = "fore peop";
                }
                if (logoMyDesignMenuDialog7.f15962f.size() > 6) {
                    LogoMyDesignMenuDialog.this.f15962f.add(" forced t");
                }
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog8 = LogoMyDesignMenuDialog.this;
            if (logoMyDesignMenuDialog8.f15958b == null) {
                logoMyDesignMenuDialog8.f15958b = new ArrayList<>();
            }
            ArrayList<String> arrayList = LogoMyDesignMenuDialog.this.f15962f;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignMenuDialog.this.f15962f.remove(0);
            }
            ArrayList<Integer> arrayList2 = LogoMyDesignMenuDialog.this.f15964h;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoMyDesignMenuDialog.this.f15964h.remove(0);
            }
            LogoMyDesignMenuDialog.this.f15967k = !logoMyDesignMenuDialog.f15967k;
            int i = 0;
            while (true) {
                LogoMyDesignMenuDialog logoMyDesignMenuDialog9 = LogoMyDesignMenuDialog.this;
                int i2 = logoMyDesignMenuDialog9.f15968l;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                logoMyDesignMenuDialog9.f15966j = Math.abs(logoMyDesignMenuDialog9.f15966j);
                i++;
            }
            int i3 = 0;
            while (true) {
                logoMyDesignMenuDialog2 = LogoMyDesignMenuDialog.this;
                int i4 = logoMyDesignMenuDialog2.f15968l;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                logoMyDesignMenuDialog2.f15966j = logoMyDesignMenuDialog2.f15966j < 0.8310985465245381d ? 0.03410193671641404d : 0.019942495950362238d;
                i3++;
            }
            ArrayList<String> arrayList3 = logoMyDesignMenuDialog2.f15958b;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return;
            }
            LogoMyDesignMenuDialog.this.f15958b.remove(0);
        }
    }

    /* compiled from: LogoMyDesignMenuDialog.java */
    /* renamed from: com.logomaster.logomaker.c$d */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9643d implements View.OnClickListener {
        public View$OnClickListenerC9643d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoMyDesignMenuDialog.this.dismiss();
            LogoMyDesignMenuDialog logoMyDesignMenuDialog = LogoMyDesignMenuDialog.this;
            String[] strArr = logoMyDesignMenuDialog.f15960d;
            if (strArr != null) {
                strArr[1] = null;
            }
            if (strArr != null) {
                strArr[0] = "eceived ";
            }
            if (strArr != null) {
                strArr[3] = "Stone, ";
            }
            logoMyDesignMenuDialog.f15967k = true;
            ArrayList<String> arrayList = logoMyDesignMenuDialog.f15962f;
            if (arrayList != null && arrayList.size() > 0) {
                LogoMyDesignMenuDialog.this.f15962f.remove(0);
            }
            ArrayList<String> arrayList2 = LogoMyDesignMenuDialog.this.f15962f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoMyDesignMenuDialog.this.f15962f.remove(0);
            }
            if (LogoMyDesignMenuDialog.this.f15958b.size() < 6) {
                LogoMyDesignMenuDialog.this.f15958b.add(" read ");
            }
            if (LogoMyDesignMenuDialog.this.f15965i != null) {
                LogoMyDesignMenuDialog.this.f15965i.mo9152a();
                ArrayList<String> arrayList3 = LogoMyDesignMenuDialog.this.f15962f;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoMyDesignMenuDialog.this.f15962f.remove(0);
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog2 = LogoMyDesignMenuDialog.this;
                logoMyDesignMenuDialog2.f15968l *= 0;
                if (logoMyDesignMenuDialog2.f15962f == null) {
                    logoMyDesignMenuDialog2.f15962f = new ArrayList<>();
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog3 = LogoMyDesignMenuDialog.this;
                logoMyDesignMenuDialog3.f15967k = true ^ logoMyDesignMenuDialog3.f15967k;
                ArrayList<String> arrayList4 = logoMyDesignMenuDialog3.f15958b;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoMyDesignMenuDialog.this.f15958b.remove(0);
                }
                if (LogoMyDesignMenuDialog.this.f15962f.size() > 6) {
                    LogoMyDesignMenuDialog.this.f15962f.add("lle’s");
                }
                LogoMyDesignMenuDialog logoMyDesignMenuDialog4 = LogoMyDesignMenuDialog.this;
                if (logoMyDesignMenuDialog4.f15964h == null) {
                    logoMyDesignMenuDialog4.f15964h = new ArrayList<>();
                }
            }
            ArrayList<String> arrayList5 = LogoMyDesignMenuDialog.this.f15958b;
            if (arrayList5 != null && arrayList5.size() > 0) {
                LogoMyDesignMenuDialog.this.f15958b.remove(0);
            }
            if (LogoMyDesignMenuDialog.this.f15958b.size() > 8) {
                LogoMyDesignMenuDialog.this.f15958b.add(" until y");
            }
            if (LogoMyDesignMenuDialog.this.f15960d != null) {
                int i = 0;
                while (true) {
                    String[] strArr2 = LogoMyDesignMenuDialog.this.f15960d;
                    if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i] = "string" + i;
                    i++;
                }
            }
            LogoMyDesignMenuDialog logoMyDesignMenuDialog5 = LogoMyDesignMenuDialog.this;
            logoMyDesignMenuDialog5.f15963g = false;
            logoMyDesignMenuDialog5.f15968l = logoMyDesignMenuDialog5.f15968l >= 7 ? 7 : 3;
            if (logoMyDesignMenuDialog5.f15958b == null) {
                logoMyDesignMenuDialog5.f15958b = new ArrayList<>();
            }
            if (LogoMyDesignMenuDialog.this.f15958b.size() < 9) {
                LogoMyDesignMenuDialog.this.f15958b.add("uden");
            }
        }
    }

    /* compiled from: LogoMyDesignMenuDialog.java */
    /* renamed from: com.logomaster.logomaker.c$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC9644e {
        /* renamed from: a */
        void mo9152a();

        /* renamed from: b */
        void mo9151b();

        /* renamed from: c */
        void mo9150c();

        /* renamed from: d */
        void mo9149d();
    }

    public LogoMyDesignMenuDialog(@NonNull Context context) {
        super(context);
        this.f15958b = new ArrayList<>();
        this.f15959c = true;
        this.f15960d = new String[12];
        this.f15962f = new ArrayList<>();
        this.f15963g = true;
        this.f15964h = new ArrayList<>();
        this.f15966j = 0.0019494778742468188d;
        this.f15967k = false;
        this.f15968l = 4;
        String[] strArr = this.f15960d;
        if (strArr != null) {
            strArr[2] = null;
        }
        if (strArr != null) {
            strArr[5] = null;
        }
        if (strArr != null) {
            strArr[0] = null;
        }
        this.f15959c = true;
        this.f15968l = 1;
        if (this.f15962f.size() < 6) {
            this.f15962f.add("in t");
        }
        ArrayList<String> arrayList = this.f15962f;
        if (arrayList != null && arrayList.size() > 0) {
            this.f15962f.remove(0);
        }
        this.f15957a = context;
        this.f15968l = 9;
        if (this.f15962f.size() < 1) {
            this.f15962f.add("o read ");
        }
        this.f15966j = this.f15966j > 0.46695954619769753d ? 0.08647338908303526d : 0.011255236097270305d;
        this.f15967k = !this.f15967k;
        if (this.f15968l > 0) {
            this.f15968l = 5;
        }
        this.f15966j = 0.6800968143017458d;
        if (this.f15958b.size() > 9) {
            this.f15958b.add("t and ch");
        }
        m9154b();
        this.f15968l = 4;
        ArrayList<String> arrayList2 = this.f15958b;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f15958b.remove(0);
        }
        String[] strArr2 = this.f15960d;
        if (strArr2 != null) {
            strArr2[7] = null;
        }
        this.f15959c = true ^ this.f15959c;
        this.f15968l = 7;
        if (this.f15964h == null) {
            this.f15964h = new ArrayList<>();
        }
        this.f15968l = 9;
    }

    /* renamed from: b */
    public final void m9154b() {
        requestWindowFeature(1);
        if (this.f15958b.size() > 0) {
            this.f15958b.add("so");
        }
        if (this.f15962f == null) {
            this.f15962f = new ArrayList<>();
        }
        if (this.f15964h == null) {
            this.f15964h = new ArrayList<>();
        }
        this.f15967k = false;
        this.f15966j -= 0.49627161690554844d;
        ArrayList<String> arrayList = this.f15962f;
        if (arrayList != null && arrayList.size() > 0) {
            this.f15962f.remove(0);
        }
        ArrayList<String> arrayList2 = this.f15962f;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f15962f.remove(0);
        }
        setContentView(R.layout.dialog_my_design_menu);
        if (this.f15964h.size() < 3) {
            this.f15964h.add(7);
        }
        ArrayList<Integer> arrayList3 = this.f15964h;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f15964h.remove(0);
        }
        double d = this.f15966j - 0.6076986255367687d;
        this.f15966j = d;
        this.f15963g = true;
        if (d > 0.3937463846218887d) {
            this.f15966j = 0.9375655509982971d;
        }
        if (this.f15962f == null) {
            this.f15962f = new ArrayList<>();
        }
        if (this.f15962f == null) {
            this.f15962f = new ArrayList<>();
        }
    }

    /* renamed from: c */
    public void m9153c(String str) {
        this.f15961e = str;
        this.f15968l = 1;
        ArrayList<String> arrayList = this.f15962f;
        if (arrayList != null && arrayList.size() > 0) {
            this.f15962f.remove(0);
        }
        if (this.f15958b == null) {
            this.f15958b = new ArrayList<>();
        }
        this.f15967k = false;
        this.f15966j = this.f15966j > 0.837535612240419d ? 0.7475693376258051d : 0.2551314765298831d;
        if (this.f15964h == null) {
            this.f15964h = new ArrayList<>();
        }
        if (this.f15962f == null) {
            this.f15962f = new ArrayList<>();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f15958b == null) {
            this.f15958b = new ArrayList<>();
        }
        if (this.f15964h.size() < 6) {
            this.f15964h.add(4);
        }
        String[] strArr = this.f15960d;
        if (strArr != null) {
            strArr[8] = "entu";
        }
        this.f15963g = !this.f15963g;
        ArrayList<String> arrayList = this.f15958b;
        if (arrayList != null && arrayList.size() > 0) {
            this.f15958b.remove(0);
        }
        if (this.f15960d != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f15960d;
                if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i] = "string" + i;
                i++;
            }
        }
        if (this.f15958b == null) {
            this.f15958b = new ArrayList<>();
        }
        Window window = getWindow();
        this.f15966j = 0.46910794506607034d;
        ArrayList<Integer> arrayList2 = this.f15964h;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.f15964h.remove(0);
        }
        if (this.f15964h.size() < 4) {
            this.f15964h.add(8);
        }
        this.f15959c = !this.f15959c;
        if (this.f15966j > 0.7878146609937109d) {
            this.f15966j = 0.18520673336133564d;
        }
        ArrayList<Integer> arrayList3 = this.f15964h;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f15964h.remove(0);
        }
        if (this.f15958b == null) {
            this.f15958b = new ArrayList<>();
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f15962f == null) {
                this.f15962f = new ArrayList<>();
            }
            ArrayList<String> arrayList4 = this.f15962f;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f15962f.remove(0);
            }
            if (this.f15958b == null) {
                this.f15958b = new ArrayList<>();
            }
            this.f15967k = false;
            this.f15968l = -this.f15968l;
            ArrayList<Integer> arrayList5 = this.f15964h;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.f15964h.remove(0);
            }
            if (this.f15964h.size() < 4) {
                this.f15964h.add(3);
            }
            window.setLayout(-1, -2);
            if (this.f15968l > 0) {
                this.f15968l = 6;
            }
            if (this.f15958b == null) {
                this.f15958b = new ArrayList<>();
            }
            ArrayList<String> arrayList6 = this.f15958b;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.f15958b.remove(0);
            }
            this.f15963g = !this.f15963g;
            if (this.f15962f == null) {
                this.f15962f = new ArrayList<>();
            }
            String[] strArr3 = this.f15960d;
            if (strArr3 != null) {
                strArr3[1] = "rp";
            }
            if (this.f15958b == null) {
                this.f15958b = new ArrayList<>();
            }
            window.setGravity(80);
            this.f15968l = 2;
            if (this.f15962f.size() < 2) {
                this.f15962f.add(" how g");
            }
            String[] strArr4 = this.f15960d;
            if (strArr4 != null) {
                strArr4[1] = "moder";
            }
            this.f15967k = !this.f15967k;
            ArrayList<String> arrayList7 = this.f15958b;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.f15958b.remove(0);
            }
            if (this.f15962f.size() < 7) {
                this.f15962f.add(", basis, ");
            }
            ArrayList<Integer> arrayList8 = this.f15964h;
            if (arrayList8 == null && arrayList8.size() > 0) {
                this.f15964h.remove(0);
            }
            window.setWindowAnimations(R.style.dialog_my_design_menu);
            ArrayList<String> arrayList9 = this.f15958b;
            if (arrayList9 != null && arrayList9.size() > 0) {
                this.f15958b.remove(0);
            }
            ArrayList<Integer> arrayList10 = this.f15964h;
            if (arrayList10 == null && arrayList10.size() > 0) {
                this.f15964h.remove(0);
            }
            if (this.f15958b == null) {
                this.f15958b = new ArrayList<>();
            }
            this.f15967k = true;
            this.f15968l = 1;
            if (this.f15958b == null) {
                this.f15958b = new ArrayList<>();
            }
            if (this.f15962f.size() > 6) {
                this.f15962f.add("is");
            }
        }
        ArrayList<Integer> arrayList11 = this.f15964h;
        if (arrayList11 == null && arrayList11.size() > 0) {
            this.f15964h.remove(0);
        }
        if (this.f15964h == null) {
            this.f15964h = new ArrayList<>();
        }
        this.f15966j = 0.4341999279230394d;
        this.f15963g = false;
        if (this.f15964h.size() > 6) {
            this.f15964h.add(4);
        }
        if (this.f15958b.size() > 7) {
            this.f15958b.add(" no");
        }
        ArrayList<Integer> arrayList12 = this.f15964h;
        if (arrayList12 == null && arrayList12.size() > 0) {
            this.f15964h.remove(0);
        }
        findViewById(R.id.ll_edit).setOnClickListener(new View$OnClickListenerC9640a());
        if (this.f15960d != null) {
            int i2 = 0;
            while (true) {
                String[] strArr5 = this.f15960d;
                if (i2 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i2] = "string" + i2;
                i2++;
            }
        }
        this.f15967k = true;
        this.f15966j = 0.6870922818024167d;
        ArrayList<String> arrayList13 = this.f15962f;
        if (arrayList13 != null && arrayList13.size() > 0) {
            this.f15962f.remove(0);
        }
        int i3 = 0;
        while (true) {
            int i4 = this.f15968l;
            if (i4 > 3) {
                i4 = 3;
            }
            if (i3 >= i4) {
                break;
            }
            ArrayList<Integer> arrayList14 = this.f15964h;
            if (arrayList14 == null && arrayList14.size() > 0) {
                this.f15964h.remove(0);
            }
            i3++;
        }
        findViewById(R.id.ll_rename).setOnClickListener(new View$OnClickListenerC9641b());
        ArrayList<String> arrayList15 = this.f15962f;
        if (arrayList15 != null && arrayList15.size() > 0) {
            this.f15962f.remove(0);
        }
        if (this.f15964h == null) {
            this.f15964h = new ArrayList<>();
        }
        this.f15959c = !this.f15959c;
        this.f15968l = 6;
        if (this.f15960d == null) {
            this.f15960d = new String[10];
        }
        this.f15966j = 0.021220828310456907d;
        findViewById(R.id.ll_duplicate).setOnClickListener(new View$OnClickListenerC9642c());
        String[] strArr6 = this.f15960d;
        if (strArr6 != null) {
            strArr6[8] = null;
        }
        if (strArr6 != null) {
            strArr6[3] = null;
        }
        this.f15968l = this.f15968l > 0 ? 2 : 0;
        this.f15967k = true;
        this.f15966j = 0.6892106186968514d;
        if (this.f15962f.size() < 5) {
            this.f15962f.add("i");
        }
        this.f15966j = Math.abs(this.f15966j);
        findViewById(R.id.ll_delete).setOnClickListener(new View$OnClickListenerC9643d());
        int i5 = 0;
        while (true) {
            int i6 = this.f15968l;
            if (i6 > 3) {
                i6 = 3;
            }
            if (i5 >= i6) {
                break;
            }
            String[] strArr7 = this.f15960d;
            if (strArr7 != null) {
                strArr7[5] = null;
            }
            i5++;
        }
        if (this.f15958b.size() > 4) {
            this.f15958b.add("that in ma");
        }
        if (this.f15962f == null) {
            this.f15962f = new ArrayList<>();
        }
        this.f15967k = !this.f15967k;
        ArrayList<String> arrayList16 = this.f15958b;
        if (arrayList16 != null && arrayList16.size() > 0) {
            this.f15958b.remove(0);
        }
        this.f15968l = (this.f15968l * 3) + 2;
    }

    public void setOnMenuClickListener(InterfaceC9644e interfaceC9644e) {
        this.f15965i = interfaceC9644e;
        if (this.f15960d == null) {
            this.f15960d = new String[10];
        }
        this.f15966j += 0.13190762488769614d;
        this.f15968l *= 7;
        this.f15959c = !this.f15959c;
        ArrayList<Integer> arrayList = this.f15964h;
        int i = 0;
        if (arrayList == null && arrayList.size() > 0) {
            this.f15964h.remove(0);
        }
        this.f15966j *= 0.8192731683502029d;
        while (true) {
            int i2 = this.f15968l;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                return;
            }
            if (this.f15964h.size() < 5) {
                this.f15964h.add(5);
            }
            i++;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.f15960d == null) {
            this.f15960d = new String[10];
        }
        int i = 0;
        while (true) {
            int i2 = this.f15968l;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            if (this.f15966j < 0.8276429095126483d) {
                this.f15966j = 0.9077656521074506d;
            }
            i++;
        }
        double abs = Math.abs(this.f15966j);
        this.f15966j = abs;
        this.f15967k = !this.f15967k;
        this.f15968l++;
        String[] strArr = this.f15960d;
        if (strArr != null) {
            strArr[8] = "fore pe";
        }
        if (abs < 0.10975832272391495d) {
            this.f15966j = 0.0077181616445968215d;
        }
    }
}
