package com.logomaster.logomaker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;

/* renamed from: com.logomaster.logomaker.a */
/* loaded from: classes3.dex */
public class LogoConfirmDeleteDialog extends Dialog {

    /* renamed from: a */
    public Context f15825a;

    /* renamed from: b */
    public boolean f15826b;

    /* renamed from: c */
    public int f15827c;

    /* renamed from: d */
    public String[] f15828d;

    /* renamed from: e */
    public InterfaceC9598c f15829e;

    /* renamed from: f */
    public int f15830f;

    /* renamed from: g */
    public int[] f15831g;

    /* renamed from: h */
    public ArrayList<String> f15832h;

    /* renamed from: i */
    public TextView f15833i;

    /* renamed from: j */
    public int f15834j;

    /* renamed from: k */
    public ArrayList<Integer> f15835k;

    /* renamed from: l */
    public boolean f15836l;

    /* renamed from: m */
    public int f15837m;

    /* renamed from: n */
    public ArrayList<String> f15838n;

    /* renamed from: o */
    public double f15839o;

    /* renamed from: p */
    public ArrayList<String> f15840p;

    /* compiled from: LogoConfirmDeleteDialog.java */
    /* renamed from: com.logomaster.logomaker.a$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9596a implements View.OnClickListener {
        public View$OnClickListenerC9596a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoConfirmDeleteDialog logoConfirmDeleteDialog;
            LogoConfirmDeleteDialog logoConfirmDeleteDialog2;
            LogoConfirmDeleteDialog.this.dismiss();
            LogoConfirmDeleteDialog logoConfirmDeleteDialog3 = LogoConfirmDeleteDialog.this;
            logoConfirmDeleteDialog3.f15836l = true;
            if (logoConfirmDeleteDialog3.f15832h == null) {
                logoConfirmDeleteDialog3.f15832h = new ArrayList<>();
            }
            LogoConfirmDeleteDialog.this.f15836l = false;
            int i = 0;
            while (true) {
                logoConfirmDeleteDialog = LogoConfirmDeleteDialog.this;
                if (i >= logoConfirmDeleteDialog.f15827c) {
                    break;
                }
                int[] iArr = logoConfirmDeleteDialog.f15831g;
                if (iArr != null) {
                    iArr[8] = 8;
                    if (logoConfirmDeleteDialog.f15838n == null) {
                        logoConfirmDeleteDialog.f15838n = new ArrayList<>();
                    }
                    if (LogoConfirmDeleteDialog.this.f15840p.size() > 6) {
                        LogoConfirmDeleteDialog.this.f15840p.add("g,");
                    }
                    LogoConfirmDeleteDialog.this.f15836l = !logoConfirmDeleteDialog2.f15836l;
                }
                LogoConfirmDeleteDialog logoConfirmDeleteDialog4 = LogoConfirmDeleteDialog.this;
                logoConfirmDeleteDialog4.f15834j -= 6;
                logoConfirmDeleteDialog4.f15836l = !logoConfirmDeleteDialog4.f15836l;
                int i2 = 0;
                while (true) {
                    LogoConfirmDeleteDialog logoConfirmDeleteDialog5 = LogoConfirmDeleteDialog.this;
                    int i3 = logoConfirmDeleteDialog5.f15830f;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 < i3) {
                        if (logoConfirmDeleteDialog5.f15834j < 0) {
                            logoConfirmDeleteDialog5.f15834j = 5;
                        }
                        i2++;
                    }
                }
                i++;
            }
            if (logoConfirmDeleteDialog.f15834j > 0) {
                logoConfirmDeleteDialog.f15834j = 6;
            }
            logoConfirmDeleteDialog.f15826b = !logoConfirmDeleteDialog.f15826b;
            logoConfirmDeleteDialog.f15836l = false;
        }
    }

    /* compiled from: LogoConfirmDeleteDialog.java */
    /* renamed from: com.logomaster.logomaker.a$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9597b implements View.OnClickListener {
        public View$OnClickListenerC9597b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoConfirmDeleteDialog.this.dismiss();
            LogoConfirmDeleteDialog logoConfirmDeleteDialog = LogoConfirmDeleteDialog.this;
            if (logoConfirmDeleteDialog.f15832h == null) {
                logoConfirmDeleteDialog.f15832h = new ArrayList<>();
            }
            if (LogoConfirmDeleteDialog.this.f15838n.size() > 0) {
                LogoConfirmDeleteDialog.this.f15838n.add("ng,");
            }
            LogoConfirmDeleteDialog logoConfirmDeleteDialog2 = LogoConfirmDeleteDialog.this;
            if (logoConfirmDeleteDialog2.f15838n == null) {
                logoConfirmDeleteDialog2.f15838n = new ArrayList<>();
            }
            LogoConfirmDeleteDialog logoConfirmDeleteDialog3 = LogoConfirmDeleteDialog.this;
            logoConfirmDeleteDialog3.f15839o = -logoConfirmDeleteDialog3.f15839o;
            logoConfirmDeleteDialog3.f15834j = 2;
            logoConfirmDeleteDialog3.f15836l = true;
            if (logoConfirmDeleteDialog3.f15832h == null) {
                logoConfirmDeleteDialog3.f15832h = new ArrayList<>();
            }
            if (LogoConfirmDeleteDialog.this.f15829e != null) {
                LogoConfirmDeleteDialog.this.f15829e.mo9207a();
                LogoConfirmDeleteDialog logoConfirmDeleteDialog4 = LogoConfirmDeleteDialog.this;
                if (logoConfirmDeleteDialog4.f15832h == null) {
                    logoConfirmDeleteDialog4.f15832h = new ArrayList<>();
                }
                LogoConfirmDeleteDialog logoConfirmDeleteDialog5 = LogoConfirmDeleteDialog.this;
                if (logoConfirmDeleteDialog5.f15834j > 0) {
                    logoConfirmDeleteDialog5.f15834j = 3;
                }
                if (logoConfirmDeleteDialog5.f15838n.size() < 5) {
                    LogoConfirmDeleteDialog.this.f15838n.add("ll, dull. ");
                }
                LogoConfirmDeleteDialog logoConfirmDeleteDialog6 = LogoConfirmDeleteDialog.this;
                int[] iArr = logoConfirmDeleteDialog6.f15831g;
                if (iArr != null) {
                    iArr[6] = 0;
                    logoConfirmDeleteDialog6.f15836l = !logoConfirmDeleteDialog6.f15836l;
                    String[] strArr = logoConfirmDeleteDialog6.f15828d;
                    if (strArr != null) {
                        strArr[9] = null;
                    }
                    if (logoConfirmDeleteDialog6.f15840p == null) {
                        logoConfirmDeleteDialog6.f15840p = new ArrayList<>();
                    }
                }
                LogoConfirmDeleteDialog logoConfirmDeleteDialog7 = LogoConfirmDeleteDialog.this;
                logoConfirmDeleteDialog7.f15826b = !logoConfirmDeleteDialog7.f15826b;
                if (logoConfirmDeleteDialog7.f15828d == null) {
                    logoConfirmDeleteDialog7.f15828d = new String[10];
                }
                logoConfirmDeleteDialog7.f15836l = true ^ logoConfirmDeleteDialog7.f15836l;
            }
            LogoConfirmDeleteDialog logoConfirmDeleteDialog8 = LogoConfirmDeleteDialog.this;
            if (logoConfirmDeleteDialog8.f15828d == null) {
                logoConfirmDeleteDialog8.f15828d = new String[10];
            }
            if (logoConfirmDeleteDialog8.f15838n.size() > 5) {
                LogoConfirmDeleteDialog.this.f15838n.add("Rosetta");
            }
            LogoConfirmDeleteDialog logoConfirmDeleteDialog9 = LogoConfirmDeleteDialog.this;
            if (logoConfirmDeleteDialog9.f15838n == null) {
                logoConfirmDeleteDialog9.f15838n = new ArrayList<>();
            }
            LogoConfirmDeleteDialog logoConfirmDeleteDialog10 = LogoConfirmDeleteDialog.this;
            logoConfirmDeleteDialog10.f15839o = -logoConfirmDeleteDialog10.f15839o;
            if (logoConfirmDeleteDialog10.f15838n == null) {
                logoConfirmDeleteDialog10.f15838n = new ArrayList<>();
            }
            if (LogoConfirmDeleteDialog.this.f15832h.size() > 2) {
                LogoConfirmDeleteDialog.this.f15832h.add(" well");
            }
            LogoConfirmDeleteDialog logoConfirmDeleteDialog11 = LogoConfirmDeleteDialog.this;
            if (logoConfirmDeleteDialog11.f15828d == null) {
                logoConfirmDeleteDialog11.f15828d = new String[10];
            }
        }
    }

    /* compiled from: LogoConfirmDeleteDialog.java */
    /* renamed from: com.logomaster.logomaker.a$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9598c {
        /* renamed from: a */
        void mo9207a();
    }

    public LogoConfirmDeleteDialog(@NonNull Context context) {
        super(context);
        this.f15826b = false;
        this.f15827c = 6;
        this.f15828d = new String[17];
        this.f15830f = 9;
        this.f15831g = new int[11];
        this.f15832h = new ArrayList<>();
        this.f15834j = 8;
        this.f15835k = new ArrayList<>();
        this.f15836l = true;
        this.f15838n = new ArrayList<>();
        this.f15839o = 0.31160606103442023d;
        this.f15840p = new ArrayList<>();
        if (this.f15832h == null) {
            this.f15832h = new ArrayList<>();
        }
        this.f15834j = 5;
        if (this.f15835k == null) {
            this.f15835k = new ArrayList<>();
            this.f15834j *= 3;
            if (this.f15832h.size() < 9) {
                this.f15832h.add("ar");
            }
            int i = 0;
            while (true) {
                int i2 = this.f15834j;
                if (i >= (i2 > 3 ? 3 : i2)) {
                    break;
                }
                this.f15834j = -i2;
                i++;
            }
        }
        this.f15834j = 8;
        int i3 = 0;
        while (true) {
            int i4 = this.f15830f;
            if (i3 >= (i4 > 3 ? 3 : i4)) {
                break;
            }
            this.f15834j = 3;
            i3++;
        }
        if (this.f15828d != null) {
            int i5 = 0;
            while (true) {
                String[] strArr = this.f15828d;
                if (i5 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i5] = "string" + i5;
                i5++;
            }
        }
        this.f15825a = context;
        this.f15836l = !true;
        if (this.f15832h == null) {
            this.f15832h = new ArrayList<>();
        }
        if (this.f15831g == null) {
            this.f15831g = new int[10];
            if (this.f15840p == null) {
                this.f15840p = new ArrayList<>();
            }
            ArrayList<String> arrayList = this.f15838n;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15838n.remove(0);
            }
            this.f15826b = !this.f15826b;
        }
        this.f15826b = !this.f15826b;
        if (this.f15828d == null) {
            this.f15828d = new String[10];
        }
        if (this.f15832h == null) {
            this.f15832h = new ArrayList<>();
        }
        m9209b();
        if (this.f15832h.size() < 1) {
            this.f15832h.add("ve");
        }
        int i6 = 0;
        while (true) {
            int i7 = this.f15834j;
            if (i6 >= (i7 > 3 ? 3 : i7)) {
                break;
            }
            if (this.f15840p == null) {
                this.f15840p = new ArrayList<>();
            }
            i6++;
        }
        this.f15830f = 9;
        ArrayList<Integer> arrayList2 = this.f15835k;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.f15835k.remove(0);
            this.f15836l = true;
            if (this.f15832h.size() < 7) {
                this.f15832h.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR);
            }
            this.f15836l = !this.f15836l;
        }
        if (this.f15838n.size() > 0) {
            this.f15838n.add("o many ");
        }
        this.f15830f = this.f15830f > 9 ? 2 : 6;
        if (this.f15838n == null) {
            this.f15838n = new ArrayList<>();
        }
    }

    /* renamed from: b */
    public final void m9209b() {
        requestWindowFeature(1);
        if (this.f15832h.size() > 0) {
            this.f15832h.add("eputati");
        }
        if (this.f15838n.size() < 1) {
            this.f15838n.add(" and");
        }
        this.f15830f = Math.abs(this.f15830f);
        ArrayList<Integer> arrayList = this.f15835k;
        if (arrayList == null && arrayList.size() > 0) {
            this.f15835k.remove(0);
            if (this.f15832h.size() < 1) {
                this.f15832h.add("is, an");
            }
            this.f15830f = -this.f15830f;
            if (this.f15832h == null) {
                this.f15832h = new ArrayList<>();
            }
        }
        this.f15834j = 4;
        if (this.f15828d != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.f15828d;
                if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        this.f15836l = true;
        setContentView(R.layout.dialog_confirm_delete);
        this.f15830f = Math.abs(this.f15830f);
        this.f15836l = false;
        ArrayList<String> arrayList2 = this.f15838n;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f15838n.remove(0);
        }
        int[] iArr = this.f15831g;
        if (iArr != null) {
            iArr[6] = 8;
            ArrayList<String> arrayList3 = this.f15838n;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15838n.remove(0);
            }
            this.f15830f = this.f15830f > 8 ? 9 : 3;
            this.f15834j = 7;
        }
        ArrayList<String> arrayList4 = this.f15838n;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.f15838n.remove(0);
        }
        ArrayList<String> arrayList5 = this.f15838n;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.f15838n.remove(0);
        }
        if (this.f15832h.size() > 0) {
            this.f15832h.add("l you");
        }
    }

    /* renamed from: c */
    public void m9208c(int i) {
        this.f15837m = i;
        if (this.f15838n == null) {
            this.f15838n = new ArrayList<>();
        }
        if (this.f15840p == null) {
            this.f15840p = new ArrayList<>();
        }
        this.f15826b = !this.f15826b;
        this.f15839o = this.f15839o < 0.4076616209710413d ? 0.28349280222732165d : 0.8897604496489193d;
        this.f15836l = !this.f15836l;
        int i2 = 0;
        this.f15826b = false;
        while (true) {
            int i3 = this.f15834j;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i2 >= i3) {
                return;
            }
            if (this.f15840p == null) {
                this.f15840p = new ArrayList<>();
            }
            i2++;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.f15836l = true;
        this.f15826b = true;
        if (this.f15831g != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f15831g;
                if (i2 >= iArr.length) {
                    break;
                }
                iArr[i2] = 1;
                if (this.f15838n.size() > 4) {
                    this.f15838n.add("pr");
                }
                if (this.f15828d != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = this.f15828d;
                        if (i3 < (strArr.length > 3 ? 3 : strArr.length)) {
                            strArr[i3] = "string" + i3;
                            i3++;
                        }
                    }
                }
                this.f15836l = false;
                i2++;
            }
            this.f15826b = !this.f15826b;
            if (this.f15830f < 0) {
                this.f15830f = 8;
            }
            String[] strArr2 = this.f15828d;
            if (strArr2 != null) {
                strArr2[1] = null;
            }
        }
        int i4 = 0;
        while (true) {
            i = this.f15834j;
            if (i4 >= (i > 3 ? 3 : i)) {
                break;
            }
            this.f15836l = !this.f15836l;
            i4++;
        }
        this.f15830f = this.f15830f < 8 ? 1 : 5;
        this.f15834j = i + 6;
        Window window = getWindow();
        if (this.f15828d != null) {
            int i5 = 0;
            while (true) {
                String[] strArr3 = this.f15828d;
                if (i5 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i5] = "string" + i5;
                i5++;
            }
        }
        String[] strArr4 = this.f15828d;
        if (strArr4 != null) {
            strArr4[5] = null;
        }
        this.f15836l = !this.f15836l;
        this.f15827c = 8;
        if (this.f15840p == null) {
            this.f15840p = new ArrayList<>();
        }
        int i6 = 0;
        while (true) {
            int i7 = this.f15830f;
            if (i7 > 3) {
                i7 = 3;
            }
            if (i6 >= i7) {
                break;
            }
            if (this.f15832h == null) {
                this.f15832h = new ArrayList<>();
            }
            i6++;
        }
        if (this.f15840p == null) {
            this.f15840p = new ArrayList<>();
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            this.f15834j *= 2;
            if (this.f15840p == null) {
                this.f15840p = new ArrayList<>();
            }
            this.f15830f = 8;
            if (this.f15831g == null) {
                this.f15831g = new int[10];
                if (this.f15828d == null) {
                    this.f15828d = new String[10];
                }
                if (this.f15828d != null) {
                    int i8 = 0;
                    while (true) {
                        String[] strArr5 = this.f15828d;
                        if (i8 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                            break;
                        }
                        strArr5[i8] = "string" + i8;
                        i8++;
                    }
                }
                this.f15836l = true;
            }
            if (this.f15828d != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr6 = this.f15828d;
                    if (i9 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i9] = "string" + i9;
                    i9++;
                }
            }
            this.f15826b = false;
            if (this.f15828d != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr7 = this.f15828d;
                    if (i10 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i10] = "string" + i10;
                    i10++;
                }
            }
        }
        this.f15836l = true;
        if (this.f15832h.size() > 7) {
            this.f15832h.add("udice is ");
        }
        this.f15827c = this.f15827c < 5 ? 4 : 1;
        this.f15826b = !this.f15826b;
        this.f15834j += 9;
        if (this.f15832h.size() < 1) {
            this.f15832h.add(" i");
        }
        this.f15833i = (TextView) findViewById(R.id.tv_tips);
        ArrayList<String> arrayList = this.f15838n;
        if (arrayList != null && arrayList.size() > 0) {
            this.f15838n.remove(0);
        }
        this.f15836l = false;
        this.f15826b = !this.f15826b;
        this.f15839o = 0.46722110092095015d;
        ArrayList<String> arrayList2 = this.f15840p;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f15840p.remove(0);
        }
        if (this.f15832h.size() > 8) {
            this.f15832h.add(" book");
        }
        if (this.f15828d != null) {
            int i11 = 0;
            while (true) {
                String[] strArr8 = this.f15828d;
                if (i11 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                    break;
                }
                strArr8[i11] = "string" + i11;
                i11++;
            }
        }
        findViewById(R.id.tv_cancel).setOnClickListener(new View$OnClickListenerC9596a());
        this.f15826b = !this.f15826b;
        this.f15834j = -this.f15834j;
        if (this.f15840p.size() > 1) {
            this.f15840p.add("t in");
        }
        this.f15827c--;
        ArrayList<String> arrayList3 = this.f15840p;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.f15840p.remove(0);
        }
        if (this.f15838n.size() < 3) {
            this.f15838n.add("y more");
        }
        this.f15826b = !this.f15826b;
        findViewById(R.id.tv_delete).setOnClickListener(new View$OnClickListenerC9597b());
        this.f15836l = !(!false);
        int[] iArr2 = this.f15831g;
        if (iArr2 != null) {
            iArr2[1] = 0;
            if (this.f15838n == null) {
                this.f15838n = new ArrayList<>();
            }
            this.f15830f = this.f15830f >= 1 ? 9 : 4;
            if (this.f15828d != null) {
                int i12 = 0;
                while (true) {
                    String[] strArr9 = this.f15828d;
                    if (i12 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                        break;
                    }
                    strArr9[i12] = "string" + i12;
                    i12++;
                }
            }
        }
        this.f15834j = Math.abs(this.f15834j);
        this.f15826b = false;
        if (this.f15832h == null) {
            this.f15832h = new ArrayList<>();
        }
    }

    public void setOnConfirmClickListener(InterfaceC9598c interfaceC9598c) {
        this.f15829e = interfaceC9598c;
        this.f15826b = !true;
        if (this.f15832h == null) {
            this.f15832h = new ArrayList<>();
        }
        this.f15839o = this.f15839o > 0.6866603203578688d ? 0.7772959536392942d : 0.5324997253219932d;
        int i = this.f15834j < 3 ? 6 : 8;
        this.f15834j = i;
        this.f15834j = Math.abs(i);
        ArrayList<String> arrayList = this.f15838n;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.f15838n.remove(0);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        String[] strArr = this.f15828d;
        if (strArr != null) {
            strArr[1] = null;
        }
        if (this.f15832h == null) {
            this.f15832h = new ArrayList<>();
        }
        if (this.f15838n.size() > 0) {
            this.f15838n.add("ind");
        }
        int[] iArr = this.f15831g;
        if (iArr != null) {
            iArr[5] = 0;
            this.f15826b = true;
            this.f15836l = true;
        }
        this.f15826b = !(!this.f15826b);
        this.f15836l = !this.f15836l;
        this.f15833i.setText(this.f15837m);
        this.f15826b = !this.f15826b;
        this.f15830f--;
        if (this.f15838n.size() < 6) {
            this.f15838n.add("haracters ");
        }
        this.f15827c = 3;
        if (this.f15838n == null) {
            this.f15838n = new ArrayList<>();
        }
        if (this.f15832h == null) {
            this.f15832h = new ArrayList<>();
        }
        if (this.f15832h.size() < 8) {
            this.f15832h.add("eopl");
        }
    }
}
