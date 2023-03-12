package com.logomaster.logomaker.config;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.config.LogoSettingsActivity;
import java.util.ArrayList;
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

/* loaded from: classes3.dex */
public class LogoSettingsActivity extends Activity implements MaxAdListener {

    /* renamed from: a */
    public MaxInterstitialAd f15977a;

    /* renamed from: l */
    public LogoLoadingDialog f15988l;

    /* renamed from: m */
    public LogoLoadingDialog2 f15989m;

    /* renamed from: b */
    public int[] f15978b = new int[15];

    /* renamed from: c */
    public int[] f15979c = new int[13];

    /* renamed from: d */
    public String f15980d = "      andr";

    /* renamed from: e */
    public boolean f15981e = false;

    /* renamed from: f */
    public ArrayList<String> f15982f = new ArrayList<>();

    /* renamed from: g */
    public String f15983g = "rhu17kxdahu17kxdthu17kxd";

    /* renamed from: h */
    public String f15984h = "mkisjeimkisjeomkisje";

    /* renamed from: i */
    public String f15985i = "bhuiwibhuiwmbhuiwpbhuiwrbhuiwebhuiw";

    /* renamed from: j */
    public String f15986j = "oixnHuzsoixnHuzsoixnHuz";

    /* renamed from: k */
    public String f15987k = "";

    /* renamed from: n */
    public int[] f15990n = new int[18];

    /* renamed from: com.logomaster.logomaker.config.LogoSettingsActivity$a */
    /* loaded from: classes3.dex */
    public class RunnableC9648a implements Runnable {
        public RunnableC9648a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogoSettingsActivity logoSettingsActivity = LogoSettingsActivity.this;
            int[] iArr = logoSettingsActivity.f15978b;
            if (iArr != null) {
                iArr[3] = 9;
            }
            int[] iArr2 = logoSettingsActivity.f15979c;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            if (logoSettingsActivity.f15982f == null) {
                logoSettingsActivity.f15982f = new ArrayList<>();
            }
            LogoSettingsActivity logoSettingsActivity2 = LogoSettingsActivity.this;
            logoSettingsActivity2.f15980d = ";paddingStart";
            logoSettingsActivity2.f15981e = true;
            if (logoSettingsActivity2.f15978b == null) {
                logoSettingsActivity2.f15978b = new int[10];
            }
            if (logoSettingsActivity2.f15979c == null) {
                logoSettingsActivity2.f15979c = new int[10];
            }
            logoSettingsActivity2.f15981e = false;
            int[] iArr3 = logoSettingsActivity2.f15979c;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (iArr3 != null) {
                iArr3[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length = LogoSettingsActivity.this.f15980d.length();
                if (LogoSettingsActivity.this.f15978b != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr4 = LogoSettingsActivity.this.f15978b;
                        if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i] = 3;
                        i++;
                    }
                }
                LogoSettingsActivity logoSettingsActivity3 = LogoSettingsActivity.this;
                logoSettingsActivity3.f15981e = !logoSettingsActivity3.f15981e;
                logoSettingsActivity3.f15981e = false;
                logoSettingsActivity3.f15980d = LogoSettingsActivity.this.f15980d + length;
                if (LogoSettingsActivity.this.f15979c != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr5 = LogoSettingsActivity.this.f15979c;
                        if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i2] = 5;
                        i2++;
                    }
                }
                if (LogoSettingsActivity.this.f15982f.size() < 1) {
                    LogoSettingsActivity.this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList = LogoSettingsActivity.this.f15982f;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoSettingsActivity.this.f15982f.remove(0);
                }
            }
            LogoSettingsActivity logoSettingsActivity4 = LogoSettingsActivity.this;
            int[] iArr6 = logoSettingsActivity4.f15990n;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
            int[] iArr7 = logoSettingsActivity4.f15979c;
            if (iArr7 != null) {
                iArr7[2] = 3;
            }
            int[] iArr8 = logoSettingsActivity4.f15978b;
            if (iArr8 != null) {
                iArr8[5] = 2;
            }
            logoSettingsActivity4.f15977a.showAd();
            LogoSettingsActivity logoSettingsActivity5 = LogoSettingsActivity.this;
            int[] iArr9 = logoSettingsActivity5.f15978b;
            if (iArr9 != null) {
                iArr9[3] = 9;
            }
            int[] iArr10 = logoSettingsActivity5.f15979c;
            if (iArr10 != null) {
                iArr10[8] = 0;
            }
            if (logoSettingsActivity5.f15982f == null) {
                logoSettingsActivity5.f15982f = new ArrayList<>();
            }
            LogoSettingsActivity logoSettingsActivity6 = LogoSettingsActivity.this;
            logoSettingsActivity6.f15980d = ";paddingStart";
            logoSettingsActivity6.f15981e = true;
            if (logoSettingsActivity6.f15978b == null) {
                logoSettingsActivity6.f15978b = new int[10];
            }
            if (logoSettingsActivity6.f15979c == null) {
                logoSettingsActivity6.f15979c = new int[10];
            }
            logoSettingsActivity6.f15981e = false;
            int[] iArr11 = logoSettingsActivity6.f15979c;
            if (iArr11 != null) {
                iArr11[9] = 7;
            }
            if (iArr11 != null) {
                iArr11[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = LogoSettingsActivity.this.f15980d.length();
                if (LogoSettingsActivity.this.f15978b != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr12 = LogoSettingsActivity.this.f15978b;
                        if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i3] = 3;
                        i3++;
                    }
                }
                LogoSettingsActivity logoSettingsActivity7 = LogoSettingsActivity.this;
                logoSettingsActivity7.f15981e = !logoSettingsActivity7.f15981e;
                logoSettingsActivity7.f15981e = false;
                logoSettingsActivity7.f15980d = LogoSettingsActivity.this.f15980d + length2;
                if (LogoSettingsActivity.this.f15979c != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr13 = LogoSettingsActivity.this.f15979c;
                        if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i4] = 5;
                        i4++;
                    }
                }
                if (LogoSettingsActivity.this.f15982f.size() < 1) {
                    LogoSettingsActivity.this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList2 = LogoSettingsActivity.this.f15982f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoSettingsActivity.this.f15982f.remove(0);
                }
            }
            LogoSettingsActivity logoSettingsActivity8 = LogoSettingsActivity.this;
            int[] iArr14 = logoSettingsActivity8.f15990n;
            if (iArr14 != null) {
                iArr14[0] = 0;
            }
            int[] iArr15 = logoSettingsActivity8.f15979c;
            if (iArr15 != null) {
                iArr15[2] = 3;
            }
            int[] iArr16 = logoSettingsActivity8.f15978b;
            if (iArr16 != null) {
                iArr16[5] = 2;
            }
            if (iArr16 != null) {
                iArr16[3] = 9;
            }
            if (iArr15 != null) {
                iArr15[8] = 0;
            }
            if (logoSettingsActivity8.f15982f == null) {
                logoSettingsActivity8.f15982f = new ArrayList<>();
            }
            LogoSettingsActivity logoSettingsActivity9 = LogoSettingsActivity.this;
            logoSettingsActivity9.f15980d = ";paddingStart";
            logoSettingsActivity9.f15981e = true;
            if (logoSettingsActivity9.f15978b == null) {
                logoSettingsActivity9.f15978b = new int[10];
            }
            if (logoSettingsActivity9.f15979c == null) {
                logoSettingsActivity9.f15979c = new int[10];
            }
            logoSettingsActivity9.f15981e = false;
            int[] iArr17 = logoSettingsActivity9.f15979c;
            if (iArr17 != null) {
                iArr17[9] = 7;
            }
            if (iArr17 != null) {
                iArr17[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length3 = LogoSettingsActivity.this.f15980d.length();
                if (LogoSettingsActivity.this.f15978b != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr18 = LogoSettingsActivity.this.f15978b;
                        if (i5 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                            break;
                        }
                        iArr18[i5] = 3;
                        i5++;
                    }
                }
                LogoSettingsActivity logoSettingsActivity10 = LogoSettingsActivity.this;
                logoSettingsActivity10.f15981e = !logoSettingsActivity10.f15981e;
                logoSettingsActivity10.f15981e = false;
                logoSettingsActivity10.f15980d = LogoSettingsActivity.this.f15980d + length3;
                if (LogoSettingsActivity.this.f15979c != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr19 = LogoSettingsActivity.this.f15979c;
                        if (i6 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                            break;
                        }
                        iArr19[i6] = 5;
                        i6++;
                    }
                }
                if (LogoSettingsActivity.this.f15982f.size() < 1) {
                    LogoSettingsActivity.this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList3 = LogoSettingsActivity.this.f15982f;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoSettingsActivity.this.f15982f.remove(0);
                }
            }
            LogoSettingsActivity logoSettingsActivity11 = LogoSettingsActivity.this;
            int[] iArr20 = logoSettingsActivity11.f15990n;
            if (iArr20 != null) {
                iArr20[0] = 0;
            }
            int[] iArr21 = logoSettingsActivity11.f15979c;
            if (iArr21 != null) {
                iArr21[2] = 3;
            }
            int[] iArr22 = logoSettingsActivity11.f15978b;
            if (iArr22 != null) {
                iArr22[5] = 2;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.config.LogoSettingsActivity$b */
    /* loaded from: classes3.dex */
    public class RunnableC9649b implements Runnable {
        public RunnableC9649b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogoSettingsActivity logoSettingsActivity = LogoSettingsActivity.this;
            int[] iArr = logoSettingsActivity.f15978b;
            if (iArr != null) {
                iArr[3] = 9;
            }
            int[] iArr2 = logoSettingsActivity.f15979c;
            if (iArr2 != null) {
                iArr2[8] = 0;
            }
            if (logoSettingsActivity.f15982f == null) {
                logoSettingsActivity.f15982f = new ArrayList<>();
            }
            LogoSettingsActivity logoSettingsActivity2 = LogoSettingsActivity.this;
            logoSettingsActivity2.f15980d = ";paddingStart";
            logoSettingsActivity2.f15981e = true;
            if (logoSettingsActivity2.f15978b == null) {
                logoSettingsActivity2.f15978b = new int[10];
            }
            if (logoSettingsActivity2.f15979c == null) {
                logoSettingsActivity2.f15979c = new int[10];
            }
            logoSettingsActivity2.f15981e = false;
            int[] iArr3 = logoSettingsActivity2.f15979c;
            if (iArr3 != null) {
                iArr3[9] = 7;
            }
            if (iArr3 != null) {
                iArr3[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length = LogoSettingsActivity.this.f15980d.length();
                if (LogoSettingsActivity.this.f15978b != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr4 = LogoSettingsActivity.this.f15978b;
                        if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i] = 3;
                        i++;
                    }
                }
                LogoSettingsActivity logoSettingsActivity3 = LogoSettingsActivity.this;
                logoSettingsActivity3.f15981e = !logoSettingsActivity3.f15981e;
                logoSettingsActivity3.f15981e = false;
                logoSettingsActivity3.f15980d = LogoSettingsActivity.this.f15980d + length;
                if (LogoSettingsActivity.this.f15979c != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr5 = LogoSettingsActivity.this.f15979c;
                        if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                            break;
                        }
                        iArr5[i2] = 5;
                        i2++;
                    }
                }
                if (LogoSettingsActivity.this.f15982f.size() < 1) {
                    LogoSettingsActivity.this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList = LogoSettingsActivity.this.f15982f;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoSettingsActivity.this.f15982f.remove(0);
                }
            }
            LogoSettingsActivity logoSettingsActivity4 = LogoSettingsActivity.this;
            int[] iArr6 = logoSettingsActivity4.f15990n;
            if (iArr6 != null) {
                iArr6[0] = 0;
            }
            int[] iArr7 = logoSettingsActivity4.f15979c;
            if (iArr7 != null) {
                iArr7[2] = 3;
            }
            int[] iArr8 = logoSettingsActivity4.f15978b;
            if (iArr8 != null) {
                iArr8[5] = 2;
            }
            if (iArr8 != null) {
                iArr8[3] = 9;
            }
            if (iArr7 != null) {
                iArr7[8] = 0;
            }
            if (logoSettingsActivity4.f15982f == null) {
                logoSettingsActivity4.f15982f = new ArrayList<>();
            }
            LogoSettingsActivity logoSettingsActivity5 = LogoSettingsActivity.this;
            logoSettingsActivity5.f15980d = ";paddingStart";
            logoSettingsActivity5.f15981e = true;
            if (logoSettingsActivity5.f15978b == null) {
                logoSettingsActivity5.f15978b = new int[10];
            }
            if (logoSettingsActivity5.f15979c == null) {
                logoSettingsActivity5.f15979c = new int[10];
            }
            logoSettingsActivity5.f15981e = false;
            int[] iArr9 = logoSettingsActivity5.f15979c;
            if (iArr9 != null) {
                iArr9[9] = 7;
            }
            if (iArr9 != null) {
                iArr9[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length2 = LogoSettingsActivity.this.f15980d.length();
                if (LogoSettingsActivity.this.f15978b != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr10 = LogoSettingsActivity.this.f15978b;
                        if (i3 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                            break;
                        }
                        iArr10[i3] = 3;
                        i3++;
                    }
                }
                LogoSettingsActivity logoSettingsActivity6 = LogoSettingsActivity.this;
                logoSettingsActivity6.f15981e = !logoSettingsActivity6.f15981e;
                logoSettingsActivity6.f15981e = false;
                logoSettingsActivity6.f15980d = LogoSettingsActivity.this.f15980d + length2;
                if (LogoSettingsActivity.this.f15979c != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr11 = LogoSettingsActivity.this.f15979c;
                        if (i4 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                            break;
                        }
                        iArr11[i4] = 5;
                        i4++;
                    }
                }
                if (LogoSettingsActivity.this.f15982f.size() < 1) {
                    LogoSettingsActivity.this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList2 = LogoSettingsActivity.this.f15982f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoSettingsActivity.this.f15982f.remove(0);
                }
            }
            LogoSettingsActivity logoSettingsActivity7 = LogoSettingsActivity.this;
            int[] iArr12 = logoSettingsActivity7.f15990n;
            if (iArr12 != null) {
                iArr12[0] = 0;
            }
            int[] iArr13 = logoSettingsActivity7.f15979c;
            if (iArr13 != null) {
                iArr13[2] = 3;
            }
            int[] iArr14 = logoSettingsActivity7.f15978b;
            if (iArr14 != null) {
                iArr14[5] = 2;
            }
            logoSettingsActivity7.f15977a.showAd();
            LogoSettingsActivity logoSettingsActivity8 = LogoSettingsActivity.this;
            int[] iArr15 = logoSettingsActivity8.f15978b;
            if (iArr15 != null) {
                iArr15[3] = 9;
            }
            int[] iArr16 = logoSettingsActivity8.f15979c;
            if (iArr16 != null) {
                iArr16[8] = 0;
            }
            if (logoSettingsActivity8.f15982f == null) {
                logoSettingsActivity8.f15982f = new ArrayList<>();
            }
            LogoSettingsActivity logoSettingsActivity9 = LogoSettingsActivity.this;
            logoSettingsActivity9.f15980d = ";paddingStart";
            logoSettingsActivity9.f15981e = true;
            if (logoSettingsActivity9.f15978b == null) {
                logoSettingsActivity9.f15978b = new int[10];
            }
            if (logoSettingsActivity9.f15979c == null) {
                logoSettingsActivity9.f15979c = new int[10];
            }
            logoSettingsActivity9.f15981e = false;
            int[] iArr17 = logoSettingsActivity9.f15979c;
            if (iArr17 != null) {
                iArr17[9] = 7;
            }
            if (iArr17 != null) {
                iArr17[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length3 = LogoSettingsActivity.this.f15980d.length();
                if (LogoSettingsActivity.this.f15978b != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr18 = LogoSettingsActivity.this.f15978b;
                        if (i5 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                            break;
                        }
                        iArr18[i5] = 3;
                        i5++;
                    }
                }
                LogoSettingsActivity logoSettingsActivity10 = LogoSettingsActivity.this;
                logoSettingsActivity10.f15981e = !logoSettingsActivity10.f15981e;
                logoSettingsActivity10.f15981e = false;
                logoSettingsActivity10.f15980d = LogoSettingsActivity.this.f15980d + length3;
                if (LogoSettingsActivity.this.f15979c != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr19 = LogoSettingsActivity.this.f15979c;
                        if (i6 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                            break;
                        }
                        iArr19[i6] = 5;
                        i6++;
                    }
                }
                if (LogoSettingsActivity.this.f15982f.size() < 1) {
                    LogoSettingsActivity.this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList3 = LogoSettingsActivity.this.f15982f;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoSettingsActivity.this.f15982f.remove(0);
                }
            }
            LogoSettingsActivity logoSettingsActivity11 = LogoSettingsActivity.this;
            int[] iArr20 = logoSettingsActivity11.f15990n;
            if (iArr20 != null) {
                iArr20[0] = 0;
            }
            int[] iArr21 = logoSettingsActivity11.f15979c;
            if (iArr21 != null) {
                iArr21[2] = 3;
            }
            int[] iArr22 = logoSettingsActivity11.f15978b;
            if (iArr22 != null) {
                iArr22[5] = 2;
            }
            if (iArr22 != null) {
                iArr22[3] = 9;
            }
            if (iArr21 != null) {
                iArr21[8] = 0;
            }
            if (logoSettingsActivity11.f15982f == null) {
                logoSettingsActivity11.f15982f = new ArrayList<>();
            }
            LogoSettingsActivity logoSettingsActivity12 = LogoSettingsActivity.this;
            logoSettingsActivity12.f15980d = ";paddingStart";
            logoSettingsActivity12.f15981e = true;
            if (logoSettingsActivity12.f15978b == null) {
                logoSettingsActivity12.f15978b = new int[10];
            }
            if (logoSettingsActivity12.f15979c == null) {
                logoSettingsActivity12.f15979c = new int[10];
            }
            logoSettingsActivity12.f15981e = false;
            int[] iArr23 = logoSettingsActivity12.f15979c;
            if (iArr23 != null) {
                iArr23[9] = 7;
            }
            if (iArr23 != null) {
                iArr23[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length4 = LogoSettingsActivity.this.f15980d.length();
                if (LogoSettingsActivity.this.f15978b != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr24 = LogoSettingsActivity.this.f15978b;
                        if (i7 >= (iArr24.length > 3 ? 3 : iArr24.length)) {
                            break;
                        }
                        iArr24[i7] = 3;
                        i7++;
                    }
                }
                LogoSettingsActivity logoSettingsActivity13 = LogoSettingsActivity.this;
                logoSettingsActivity13.f15981e = !logoSettingsActivity13.f15981e;
                logoSettingsActivity13.f15981e = false;
                logoSettingsActivity13.f15980d = LogoSettingsActivity.this.f15980d + length4;
                if (LogoSettingsActivity.this.f15979c != null) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr25 = LogoSettingsActivity.this.f15979c;
                        if (i8 >= (iArr25.length > 3 ? 3 : iArr25.length)) {
                            break;
                        }
                        iArr25[i8] = 5;
                        i8++;
                    }
                }
                if (LogoSettingsActivity.this.f15982f.size() < 1) {
                    LogoSettingsActivity.this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList4 = LogoSettingsActivity.this.f15982f;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoSettingsActivity.this.f15982f.remove(0);
                }
            }
            LogoSettingsActivity logoSettingsActivity14 = LogoSettingsActivity.this;
            int[] iArr26 = logoSettingsActivity14.f15990n;
            if (iArr26 != null) {
                iArr26[0] = 0;
            }
            int[] iArr27 = logoSettingsActivity14.f15979c;
            if (iArr27 != null) {
                iArr27[2] = 3;
            }
            int[] iArr28 = logoSettingsActivity14.f15978b;
            if (iArr28 != null) {
                iArr28[5] = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m9142e(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String string;
        int i8;
        int i9;
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i10 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i10] = 3;
                    i10++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i11 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i11] = 5;
                    i11++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        int m877b = SPUtils.m878a("LoGoData", 0).m877b("lo_f");
        int[] iArr9 = this.f15978b;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15979c;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr11 = this.f15979c;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr12 = this.f15978b;
                    if (i12 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i12] = 3;
                    i12++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i13 = 0;
                while (true) {
                    int[] iArr13 = this.f15979c;
                    if (i13 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i13] = 5;
                    i13++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr14 = this.f15990n;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15979c;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15978b;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
        if (iArr16 != null) {
            iArr16[3] = 9;
        }
        if (iArr15 != null) {
            iArr15[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr17 = this.f15979c;
        if (iArr17 != null) {
            iArr17[9] = 7;
        }
        if (iArr17 != null) {
            iArr17[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i14 = 0;
                while (true) {
                    int[] iArr18 = this.f15978b;
                    if (i14 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                        break;
                    }
                    iArr18[i14] = 3;
                    i14++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i15 = 0;
                while (true) {
                    int[] iArr19 = this.f15979c;
                    if (i15 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                        break;
                    }
                    iArr19[i15] = 5;
                    i15++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr20 = this.f15990n;
        if (iArr20 != null) {
            iArr20[0] = 0;
        }
        int[] iArr21 = this.f15979c;
        if (iArr21 != null) {
            iArr21[2] = 3;
        }
        int[] iArr22 = this.f15978b;
        if (iArr22 != null) {
            iArr22[5] = 2;
        }
        String string2 = getResources().getString(R.string.applovin_ins_two);
        int[] iArr23 = this.f15978b;
        if (iArr23 != null) {
            iArr23[3] = 9;
        }
        int[] iArr24 = this.f15979c;
        if (iArr24 != null) {
            iArr24[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr25 = this.f15979c;
        if (iArr25 != null) {
            iArr25[9] = 7;
        }
        if (iArr25 != null) {
            iArr25[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length4 = this.f15980d.length();
            if (this.f15978b != null) {
                int i16 = 0;
                while (true) {
                    int[] iArr26 = this.f15978b;
                    if (i16 >= (iArr26.length > 3 ? 3 : iArr26.length)) {
                        break;
                    }
                    iArr26[i16] = 3;
                    i16++;
                }
            }
            this.f15981e = false;
            this.f15980d += length4;
            if (this.f15979c != null) {
                int i17 = 0;
                while (true) {
                    int[] iArr27 = this.f15979c;
                    if (i17 >= (iArr27.length > 3 ? 3 : iArr27.length)) {
                        break;
                    }
                    iArr27[i17] = 5;
                    i17++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList4 = this.f15982f;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr28 = this.f15990n;
        if (iArr28 != null) {
            iArr28[0] = 0;
        }
        int[] iArr29 = this.f15979c;
        if (iArr29 != null) {
            iArr29[2] = 3;
        }
        int[] iArr30 = this.f15978b;
        if (iArr30 != null) {
            iArr30[5] = 2;
        }
        if (iArr30 != null) {
            iArr30[3] = 9;
        }
        if (iArr29 != null) {
            iArr29[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            i = 10;
            this.f15978b = new int[10];
        } else {
            i = 10;
        }
        if (this.f15979c == null) {
            this.f15979c = new int[i];
        }
        this.f15981e = false;
        int[] iArr31 = this.f15979c;
        if (iArr31 != null) {
            iArr31[9] = 7;
        }
        if (iArr31 != null) {
            iArr31[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length5 = this.f15980d.length();
            if (this.f15978b != null) {
                int i18 = 0;
                while (true) {
                    int[] iArr32 = this.f15978b;
                    if (i18 >= (iArr32.length > 3 ? 3 : iArr32.length)) {
                        break;
                    }
                    iArr32[i18] = 3;
                    i18++;
                }
            }
            this.f15981e = false;
            this.f15980d += length5;
            if (this.f15979c != null) {
                int i19 = 0;
                while (true) {
                    int[] iArr33 = this.f15979c;
                    if (i19 >= (iArr33.length > 3 ? 3 : iArr33.length)) {
                        break;
                    }
                    iArr33[i19] = 5;
                    i19++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList5 = this.f15982f;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr34 = this.f15990n;
        if (iArr34 != null) {
            iArr34[0] = 0;
        }
        int[] iArr35 = this.f15979c;
        if (iArr35 != null) {
            iArr35[2] = 3;
        }
        int[] iArr36 = this.f15978b;
        if (iArr36 != null) {
            iArr36[5] = 2;
        }
        if (m877b > 0) {
            if (iArr36 != null) {
                iArr36[3] = 9;
            }
            if (iArr35 != null) {
                iArr35[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i6 = 10;
                this.f15978b = new int[10];
            } else {
                i6 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i6];
            }
            this.f15981e = false;
            int[] iArr37 = this.f15979c;
            if (iArr37 != null) {
                iArr37[9] = 7;
            }
            if (iArr37 != null) {
                iArr37[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length6 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i20 = 0;
                    while (true) {
                        int[] iArr38 = this.f15978b;
                        if (i20 >= (iArr38.length > 3 ? 3 : iArr38.length)) {
                            break;
                        }
                        iArr38[i20] = 3;
                        i20++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length6;
                if (this.f15979c != null) {
                    int i21 = 0;
                    while (true) {
                        int[] iArr39 = this.f15979c;
                        if (i21 >= (iArr39.length > 3 ? 3 : iArr39.length)) {
                            break;
                        }
                        iArr39[i21] = 5;
                        i21++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList6 = this.f15982f;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr40 = this.f15990n;
            if (iArr40 != null) {
                iArr40[0] = 0;
            }
            int[] iArr41 = this.f15979c;
            if (iArr41 != null) {
                iArr41[2] = 3;
            }
            int[] iArr42 = this.f15978b;
            if (iArr42 != null) {
                iArr42[5] = 2;
            }
            if (iArr42 != null) {
                iArr42[3] = 9;
            }
            if (iArr41 != null) {
                iArr41[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i7 = 10;
                this.f15978b = new int[10];
            } else {
                i7 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i7];
            }
            this.f15981e = false;
            int[] iArr43 = this.f15979c;
            if (iArr43 != null) {
                iArr43[9] = 7;
            }
            if (iArr43 != null) {
                iArr43[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length7 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i22 = 0;
                    while (true) {
                        int[] iArr44 = this.f15978b;
                        if (i22 >= (iArr44.length > 3 ? 3 : iArr44.length)) {
                            break;
                        }
                        iArr44[i22] = 3;
                        i22++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length7;
                if (this.f15979c != null) {
                    int i23 = 0;
                    while (true) {
                        int[] iArr45 = this.f15979c;
                        if (i23 >= (iArr45.length > 3 ? 3 : iArr45.length)) {
                            break;
                        }
                        iArr45[i23] = 5;
                        i23++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList7 = this.f15982f;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr46 = this.f15990n;
            if (iArr46 != null) {
                iArr46[0] = 0;
            }
            int[] iArr47 = this.f15979c;
            if (iArr47 != null) {
                iArr47[2] = 3;
            }
            int[] iArr48 = this.f15978b;
            if (iArr48 != null) {
                iArr48[5] = 2;
            }
            if (TextUtils.isEmpty(this.f15987k)) {
                string = getResources().getString(R.string.applovin_ins);
            } else {
                string = getResources().getString(R.string.applovin_ins_two);
            }
            string2 = string;
            int[] iArr49 = this.f15978b;
            if (iArr49 != null) {
                iArr49[3] = 9;
            }
            int[] iArr50 = this.f15979c;
            if (iArr50 != null) {
                iArr50[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i8 = 10;
                this.f15978b = new int[10];
            } else {
                i8 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i8];
            }
            this.f15981e = false;
            int[] iArr51 = this.f15979c;
            if (iArr51 != null) {
                iArr51[9] = 7;
            }
            if (iArr51 != null) {
                iArr51[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length8 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i24 = 0;
                    while (true) {
                        int[] iArr52 = this.f15978b;
                        if (i24 >= (iArr52.length > 3 ? 3 : iArr52.length)) {
                            break;
                        }
                        iArr52[i24] = 3;
                        i24++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length8;
                if (this.f15979c != null) {
                    int i25 = 0;
                    while (true) {
                        int[] iArr53 = this.f15979c;
                        if (i25 >= (iArr53.length > 3 ? 3 : iArr53.length)) {
                            break;
                        }
                        iArr53[i25] = 5;
                        i25++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList8 = this.f15982f;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr54 = this.f15990n;
            if (iArr54 != null) {
                iArr54[0] = 0;
            }
            int[] iArr55 = this.f15979c;
            if (iArr55 != null) {
                iArr55[2] = 3;
            }
            int[] iArr56 = this.f15978b;
            if (iArr56 != null) {
                iArr56[5] = 2;
            }
            if (iArr56 != null) {
                iArr56[3] = 9;
            }
            if (iArr55 != null) {
                iArr55[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i9 = 10;
                this.f15978b = new int[10];
            } else {
                i9 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i9];
            }
            this.f15981e = false;
            int[] iArr57 = this.f15979c;
            if (iArr57 != null) {
                iArr57[9] = 7;
            }
            if (iArr57 != null) {
                iArr57[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length9 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i26 = 0;
                    while (true) {
                        int[] iArr58 = this.f15978b;
                        if (i26 >= (iArr58.length > 3 ? 3 : iArr58.length)) {
                            break;
                        }
                        iArr58[i26] = 3;
                        i26++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length9;
                if (this.f15979c != null) {
                    int i27 = 0;
                    while (true) {
                        int[] iArr59 = this.f15979c;
                        if (i27 >= (iArr59.length > 3 ? 3 : iArr59.length)) {
                            break;
                        }
                        iArr59[i27] = 5;
                        i27++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList9 = this.f15982f;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr60 = this.f15990n;
            if (iArr60 != null) {
                iArr60[0] = 0;
            }
            int[] iArr61 = this.f15979c;
            if (iArr61 != null) {
                iArr61[2] = 3;
            }
            int[] iArr62 = this.f15978b;
            if (iArr62 != null) {
                iArr62[5] = 2;
            }
        }
        int[] iArr63 = this.f15978b;
        if (iArr63 != null) {
            iArr63[3] = 9;
        }
        int[] iArr64 = this.f15979c;
        if (iArr64 != null) {
            iArr64[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            i2 = 10;
            this.f15978b = new int[10];
        } else {
            i2 = 10;
        }
        if (this.f15979c == null) {
            this.f15979c = new int[i2];
        }
        this.f15981e = false;
        int[] iArr65 = this.f15979c;
        if (iArr65 != null) {
            iArr65[9] = 7;
        }
        if (iArr65 != null) {
            iArr65[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length10 = this.f15980d.length();
            if (this.f15978b != null) {
                int i28 = 0;
                while (true) {
                    int[] iArr66 = this.f15978b;
                    if (i28 >= (iArr66.length > 3 ? 3 : iArr66.length)) {
                        break;
                    }
                    iArr66[i28] = 3;
                    i28++;
                }
            }
            this.f15981e = false;
            this.f15980d += length10;
            if (this.f15979c != null) {
                int i29 = 0;
                while (true) {
                    int[] iArr67 = this.f15979c;
                    if (i29 >= (iArr67.length > 3 ? 3 : iArr67.length)) {
                        break;
                    }
                    iArr67[i29] = 5;
                    i29++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList10 = this.f15982f;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr68 = this.f15990n;
        if (iArr68 != null) {
            iArr68[0] = 0;
        }
        int[] iArr69 = this.f15979c;
        if (iArr69 != null) {
            iArr69[2] = 3;
        }
        int[] iArr70 = this.f15978b;
        if (iArr70 != null) {
            iArr70[5] = 2;
        }
        if (iArr70 != null) {
            iArr70[3] = 9;
        }
        if (iArr69 != null) {
            iArr69[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            i3 = 10;
            this.f15978b = new int[10];
        } else {
            i3 = 10;
        }
        if (this.f15979c == null) {
            this.f15979c = new int[i3];
        }
        this.f15981e = false;
        int[] iArr71 = this.f15979c;
        if (iArr71 != null) {
            iArr71[9] = 7;
        }
        if (iArr71 != null) {
            iArr71[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length11 = this.f15980d.length();
            if (this.f15978b != null) {
                int i30 = 0;
                while (true) {
                    int[] iArr72 = this.f15978b;
                    if (i30 >= (iArr72.length > 3 ? 3 : iArr72.length)) {
                        break;
                    }
                    iArr72[i30] = 3;
                    i30++;
                }
            }
            this.f15981e = false;
            this.f15980d += length11;
            if (this.f15979c != null) {
                int i31 = 0;
                while (true) {
                    int[] iArr73 = this.f15979c;
                    if (i31 >= (iArr73.length > 3 ? 3 : iArr73.length)) {
                        break;
                    }
                    iArr73[i31] = 5;
                    i31++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList11 = this.f15982f;
            if (arrayList11 != null && arrayList11.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr74 = this.f15990n;
        if (iArr74 != null) {
            iArr74[0] = 0;
        }
        int[] iArr75 = this.f15979c;
        if (iArr75 != null) {
            iArr75[2] = 3;
        }
        int[] iArr76 = this.f15978b;
        if (iArr76 != null) {
            iArr76[5] = 2;
        }
        m9141f("adUnitId:" + string2);
        TextUtils.isEmpty(this.f15987k);
        m9143d(string2);
        int[] iArr77 = this.f15978b;
        if (iArr77 != null) {
            iArr77[3] = 9;
        }
        int[] iArr78 = this.f15979c;
        if (iArr78 != null) {
            iArr78[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            i4 = 10;
            this.f15978b = new int[10];
        } else {
            i4 = 10;
        }
        if (this.f15979c == null) {
            this.f15979c = new int[i4];
        }
        this.f15981e = false;
        int[] iArr79 = this.f15979c;
        if (iArr79 != null) {
            iArr79[9] = 7;
        }
        if (iArr79 != null) {
            iArr79[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length12 = this.f15980d.length();
            if (this.f15978b != null) {
                int i32 = 0;
                while (true) {
                    int[] iArr80 = this.f15978b;
                    if (i32 >= (iArr80.length > 3 ? 3 : iArr80.length)) {
                        break;
                    }
                    iArr80[i32] = 3;
                    i32++;
                }
            }
            this.f15981e = false;
            this.f15980d += length12;
            if (this.f15979c != null) {
                int i33 = 0;
                while (true) {
                    int[] iArr81 = this.f15979c;
                    if (i33 >= (iArr81.length > 3 ? 3 : iArr81.length)) {
                        break;
                    }
                    iArr81[i33] = 5;
                    i33++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList12 = this.f15982f;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr82 = this.f15990n;
        if (iArr82 != null) {
            iArr82[0] = 0;
        }
        int[] iArr83 = this.f15979c;
        if (iArr83 != null) {
            iArr83[2] = 3;
        }
        int[] iArr84 = this.f15978b;
        if (iArr84 != null) {
            iArr84[5] = 2;
        }
        if (iArr84 != null) {
            iArr84[3] = 9;
        }
        if (iArr83 != null) {
            iArr83[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            i5 = 10;
            this.f15978b = new int[10];
        } else {
            i5 = 10;
        }
        if (this.f15979c == null) {
            this.f15979c = new int[i5];
        }
        this.f15981e = false;
        int[] iArr85 = this.f15979c;
        if (iArr85 != null) {
            iArr85[9] = 7;
        }
        if (iArr85 != null) {
            iArr85[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length13 = this.f15980d.length();
            if (this.f15978b != null) {
                int i34 = 0;
                while (true) {
                    int[] iArr86 = this.f15978b;
                    if (i34 >= (iArr86.length > 3 ? 3 : iArr86.length)) {
                        break;
                    }
                    iArr86[i34] = 3;
                    i34++;
                }
            }
            this.f15981e = false;
            this.f15980d += length13;
            if (this.f15979c != null) {
                int i35 = 0;
                while (true) {
                    int[] iArr87 = this.f15979c;
                    if (i35 >= (iArr87.length > 3 ? 3 : iArr87.length)) {
                        break;
                    }
                    iArr87[i35] = 5;
                    i35++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList13 = this.f15982f;
            if (arrayList13 != null && arrayList13.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr88 = this.f15990n;
        if (iArr88 != null) {
            iArr88[0] = 0;
        }
        int[] iArr89 = this.f15979c;
        if (iArr89 != null) {
            iArr89[2] = 3;
        }
        int[] iArr90 = this.f15978b;
        if (iArr90 != null) {
            iArr90[5] = 2;
        }
    }

    /* renamed from: c */
    public final void m9144c() {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        if (iArr8 != null) {
            iArr8[3] = 9;
        }
        if (iArr7 != null) {
            iArr7[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr9 = this.f15979c;
        if (iArr9 != null) {
            iArr9[9] = 7;
        }
        if (iArr9 != null) {
            iArr9[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr10 = this.f15978b;
                    if (i3 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr11 = this.f15979c;
                    if (i4 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr12 = this.f15990n;
        if (iArr12 != null) {
            iArr12[0] = 0;
        }
        int[] iArr13 = this.f15979c;
        if (iArr13 != null) {
            iArr13[2] = 3;
        }
        int[] iArr14 = this.f15978b;
        if (iArr14 != null) {
            iArr14[5] = 2;
        }
        m9141f("f()");
        int[] iArr15 = this.f15978b;
        if (iArr15 != null) {
            iArr15[3] = 9;
        }
        int[] iArr16 = this.f15979c;
        if (iArr16 != null) {
            iArr16[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr17 = this.f15979c;
        if (iArr17 != null) {
            iArr17[9] = 7;
        }
        if (iArr17 != null) {
            iArr17[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr18 = this.f15978b;
                    if (i5 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                        break;
                    }
                    iArr18[i5] = 3;
                    i5++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr19 = this.f15979c;
                    if (i6 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                        break;
                    }
                    iArr19[i6] = 5;
                    i6++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr20 = this.f15990n;
        if (iArr20 != null) {
            iArr20[0] = 0;
        }
        int[] iArr21 = this.f15979c;
        if (iArr21 != null) {
            iArr21[2] = 3;
        }
        int[] iArr22 = this.f15978b;
        if (iArr22 != null) {
            iArr22[5] = 2;
        }
        if (iArr22 != null) {
            iArr22[3] = 9;
        }
        if (iArr21 != null) {
            iArr21[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr23 = this.f15979c;
        if (iArr23 != null) {
            iArr23[9] = 7;
        }
        if (iArr23 != null) {
            iArr23[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length4 = this.f15980d.length();
            if (this.f15978b != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr24 = this.f15978b;
                    if (i7 >= (iArr24.length > 3 ? 3 : iArr24.length)) {
                        break;
                    }
                    iArr24[i7] = 3;
                    i7++;
                }
            }
            this.f15981e = false;
            this.f15980d += length4;
            if (this.f15979c != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr25 = this.f15979c;
                    if (i8 >= (iArr25.length > 3 ? 3 : iArr25.length)) {
                        break;
                    }
                    iArr25[i8] = 5;
                    i8++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList4 = this.f15982f;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr26 = this.f15990n;
        if (iArr26 != null) {
            iArr26[0] = 0;
        }
        int[] iArr27 = this.f15979c;
        if (iArr27 != null) {
            iArr27[2] = 3;
        }
        int[] iArr28 = this.f15978b;
        if (iArr28 != null) {
            iArr28[5] = 2;
        }
        if (iArr28 != null) {
            try {
                iArr28[3] = 9;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (iArr27 != null) {
            iArr27[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr29 = this.f15979c;
        if (iArr29 != null) {
            iArr29[9] = 7;
        }
        if (iArr29 != null) {
            iArr29[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length5 = this.f15980d.length();
            if (this.f15978b != null) {
                int i9 = 0;
                while (true) {
                    int[] iArr30 = this.f15978b;
                    if (i9 >= (iArr30.length > 3 ? 3 : iArr30.length)) {
                        break;
                    }
                    iArr30[i9] = 3;
                    i9++;
                }
            }
            boolean z = this.f15981e;
            this.f15981e = false;
            this.f15980d += length5;
            if (this.f15979c != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr31 = this.f15979c;
                    if (i10 >= (iArr31.length > 3 ? 3 : iArr31.length)) {
                        break;
                    }
                    iArr31[i10] = 5;
                    i10++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList5 = this.f15982f;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr32 = this.f15990n;
        if (iArr32 != null) {
            iArr32[0] = 0;
        }
        int[] iArr33 = this.f15979c;
        if (iArr33 != null) {
            iArr33[2] = 3;
        }
        int[] iArr34 = this.f15978b;
        if (iArr34 != null) {
            iArr34[5] = 2;
        }
        if (iArr34 != null) {
            iArr34[3] = 9;
        }
        if (iArr33 != null) {
            iArr33[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr35 = this.f15979c;
        if (iArr35 != null) {
            iArr35[9] = 7;
        }
        if (iArr35 != null) {
            iArr35[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length6 = this.f15980d.length();
            if (this.f15978b != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr36 = this.f15978b;
                    if (i11 >= (iArr36.length > 3 ? 3 : iArr36.length)) {
                        break;
                    }
                    iArr36[i11] = 3;
                    i11++;
                }
            }
            boolean z2 = this.f15981e;
            this.f15981e = false;
            this.f15980d += length6;
            if (this.f15979c != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr37 = this.f15979c;
                    if (i12 >= (iArr37.length > 3 ? 3 : iArr37.length)) {
                        break;
                    }
                    iArr37[i12] = 5;
                    i12++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList6 = this.f15982f;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr38 = this.f15990n;
        if (iArr38 != null) {
            iArr38[0] = 0;
        }
        int[] iArr39 = this.f15979c;
        if (iArr39 != null) {
            iArr39[2] = 3;
        }
        int[] iArr40 = this.f15978b;
        if (iArr40 != null) {
            iArr40[5] = 2;
        }
        if (this.f15988l != null) {
            if (iArr40 != null) {
                iArr40[3] = 9;
            }
            if (iArr39 != null) {
                iArr39[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr41 = this.f15979c;
            if (iArr41 != null) {
                iArr41[9] = 7;
            }
            if (iArr41 != null) {
                iArr41[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length7 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i13 = 0;
                    while (true) {
                        int[] iArr42 = this.f15978b;
                        if (i13 >= (iArr42.length > 3 ? 3 : iArr42.length)) {
                            break;
                        }
                        iArr42[i13] = 3;
                        i13++;
                    }
                }
                boolean z3 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length7;
                if (this.f15979c != null) {
                    int i14 = 0;
                    while (true) {
                        int[] iArr43 = this.f15979c;
                        if (i14 >= (iArr43.length > 3 ? 3 : iArr43.length)) {
                            break;
                        }
                        iArr43[i14] = 5;
                        i14++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList7 = this.f15982f;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr44 = this.f15990n;
            if (iArr44 != null) {
                iArr44[0] = 0;
            }
            int[] iArr45 = this.f15979c;
            if (iArr45 != null) {
                iArr45[2] = 3;
            }
            int[] iArr46 = this.f15978b;
            if (iArr46 != null) {
                iArr46[5] = 2;
            }
            if (iArr46 != null) {
                iArr46[3] = 9;
            }
            if (iArr45 != null) {
                iArr45[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr47 = this.f15979c;
            if (iArr47 != null) {
                iArr47[9] = 7;
            }
            if (iArr47 != null) {
                iArr47[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length8 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i15 = 0;
                    while (true) {
                        int[] iArr48 = this.f15978b;
                        if (i15 >= (iArr48.length > 3 ? 3 : iArr48.length)) {
                            break;
                        }
                        iArr48[i15] = 3;
                        i15++;
                    }
                }
                boolean z4 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length8;
                if (this.f15979c != null) {
                    int i16 = 0;
                    while (true) {
                        int[] iArr49 = this.f15979c;
                        if (i16 >= (iArr49.length > 3 ? 3 : iArr49.length)) {
                            break;
                        }
                        iArr49[i16] = 5;
                        i16++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList8 = this.f15982f;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr50 = this.f15990n;
            if (iArr50 != null) {
                iArr50[0] = 0;
            }
            int[] iArr51 = this.f15979c;
            if (iArr51 != null) {
                iArr51[2] = 3;
            }
            int[] iArr52 = this.f15978b;
            if (iArr52 != null) {
                iArr52[5] = 2;
            }
            this.f15988l.dismiss();
            int[] iArr53 = this.f15978b;
            if (iArr53 != null) {
                iArr53[3] = 9;
            }
            int[] iArr54 = this.f15979c;
            if (iArr54 != null) {
                iArr54[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr55 = this.f15979c;
            if (iArr55 != null) {
                iArr55[9] = 7;
            }
            if (iArr55 != null) {
                iArr55[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length9 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i17 = 0;
                    while (true) {
                        int[] iArr56 = this.f15978b;
                        if (i17 >= (iArr56.length > 3 ? 3 : iArr56.length)) {
                            break;
                        }
                        iArr56[i17] = 3;
                        i17++;
                    }
                }
                boolean z5 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length9;
                if (this.f15979c != null) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr57 = this.f15979c;
                        if (i18 >= (iArr57.length > 3 ? 3 : iArr57.length)) {
                            break;
                        }
                        iArr57[i18] = 5;
                        i18++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList9 = this.f15982f;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr58 = this.f15990n;
            if (iArr58 != null) {
                iArr58[0] = 0;
            }
            int[] iArr59 = this.f15979c;
            if (iArr59 != null) {
                iArr59[2] = 3;
            }
            int[] iArr60 = this.f15978b;
            if (iArr60 != null) {
                iArr60[5] = 2;
            }
            if (iArr60 != null) {
                iArr60[3] = 9;
            }
            if (iArr59 != null) {
                iArr59[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr61 = this.f15979c;
            if (iArr61 != null) {
                iArr61[9] = 7;
            }
            if (iArr61 != null) {
                iArr61[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length10 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i19 = 0;
                    while (true) {
                        int[] iArr62 = this.f15978b;
                        if (i19 >= (iArr62.length > 3 ? 3 : iArr62.length)) {
                            break;
                        }
                        iArr62[i19] = 3;
                        i19++;
                    }
                }
                boolean z6 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length10;
                if (this.f15979c != null) {
                    int i20 = 0;
                    while (true) {
                        int[] iArr63 = this.f15979c;
                        if (i20 >= (iArr63.length > 3 ? 3 : iArr63.length)) {
                            break;
                        }
                        iArr63[i20] = 5;
                        i20++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList10 = this.f15982f;
                if (arrayList10 != null && arrayList10.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr64 = this.f15990n;
            if (iArr64 != null) {
                iArr64[0] = 0;
            }
            int[] iArr65 = this.f15979c;
            if (iArr65 != null) {
                iArr65[2] = 3;
            }
            int[] iArr66 = this.f15978b;
            if (iArr66 != null) {
                iArr66[5] = 2;
            }
        }
        int[] iArr67 = this.f15978b;
        if (iArr67 != null) {
            iArr67[3] = 9;
        }
        int[] iArr68 = this.f15979c;
        if (iArr68 != null) {
            iArr68[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr69 = this.f15979c;
        if (iArr69 != null) {
            iArr69[9] = 7;
        }
        if (iArr69 != null) {
            iArr69[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length11 = this.f15980d.length();
            if (this.f15978b != null) {
                int i21 = 0;
                while (true) {
                    int[] iArr70 = this.f15978b;
                    if (i21 >= (iArr70.length > 3 ? 3 : iArr70.length)) {
                        break;
                    }
                    iArr70[i21] = 3;
                    i21++;
                }
            }
            boolean z7 = this.f15981e;
            this.f15981e = false;
            this.f15980d += length11;
            if (this.f15979c != null) {
                int i22 = 0;
                while (true) {
                    int[] iArr71 = this.f15979c;
                    if (i22 >= (iArr71.length > 3 ? 3 : iArr71.length)) {
                        break;
                    }
                    iArr71[i22] = 5;
                    i22++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList11 = this.f15982f;
            if (arrayList11 != null && arrayList11.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr72 = this.f15990n;
        if (iArr72 != null) {
            iArr72[0] = 0;
        }
        int[] iArr73 = this.f15979c;
        if (iArr73 != null) {
            iArr73[2] = 3;
        }
        int[] iArr74 = this.f15978b;
        if (iArr74 != null) {
            iArr74[5] = 2;
        }
        if (iArr74 != null) {
            iArr74[3] = 9;
        }
        if (iArr73 != null) {
            iArr73[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr75 = this.f15979c;
        if (iArr75 != null) {
            iArr75[9] = 7;
        }
        if (iArr75 != null) {
            iArr75[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length12 = this.f15980d.length();
            if (this.f15978b != null) {
                int i23 = 0;
                while (true) {
                    int[] iArr76 = this.f15978b;
                    if (i23 >= (iArr76.length > 3 ? 3 : iArr76.length)) {
                        break;
                    }
                    iArr76[i23] = 3;
                    i23++;
                }
            }
            boolean z8 = this.f15981e;
            this.f15981e = false;
            this.f15980d += length12;
            if (this.f15979c != null) {
                int i24 = 0;
                while (true) {
                    int[] iArr77 = this.f15979c;
                    if (i24 >= (iArr77.length > 3 ? 3 : iArr77.length)) {
                        break;
                    }
                    iArr77[i24] = 5;
                    i24++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList12 = this.f15982f;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr78 = this.f15990n;
        if (iArr78 != null) {
            iArr78[0] = 0;
        }
        int[] iArr79 = this.f15979c;
        if (iArr79 != null) {
            iArr79[2] = 3;
        }
        int[] iArr80 = this.f15978b;
        if (iArr80 != null) {
            iArr80[5] = 2;
        }
        int[] iArr81 = this.f15978b;
        if (iArr81 != null) {
            iArr81[3] = 9;
        }
        int[] iArr82 = this.f15979c;
        if (iArr82 != null) {
            iArr82[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr83 = this.f15979c;
        if (iArr83 != null) {
            iArr83[9] = 7;
        }
        if (iArr83 != null) {
            iArr83[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length13 = this.f15980d.length();
            if (this.f15978b != null) {
                int i25 = 0;
                while (true) {
                    int[] iArr84 = this.f15978b;
                    if (i25 >= (iArr84.length > 3 ? 3 : iArr84.length)) {
                        break;
                    }
                    iArr84[i25] = 3;
                    i25++;
                }
            }
            this.f15981e = false;
            this.f15980d += length13;
            if (this.f15979c != null) {
                int i26 = 0;
                while (true) {
                    int[] iArr85 = this.f15979c;
                    if (i26 >= (iArr85.length > 3 ? 3 : iArr85.length)) {
                        break;
                    }
                    iArr85[i26] = 5;
                    i26++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList13 = this.f15982f;
            if (arrayList13 != null && arrayList13.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr86 = this.f15990n;
        if (iArr86 != null) {
            iArr86[0] = 0;
        }
        int[] iArr87 = this.f15979c;
        if (iArr87 != null) {
            iArr87[2] = 3;
        }
        int[] iArr88 = this.f15978b;
        if (iArr88 != null) {
            iArr88[5] = 2;
        }
        if (iArr88 != null) {
            iArr88[3] = 9;
        }
        if (iArr87 != null) {
            iArr87[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr89 = this.f15979c;
        if (iArr89 != null) {
            iArr89[9] = 7;
        }
        if (iArr89 != null) {
            iArr89[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length14 = this.f15980d.length();
            if (this.f15978b != null) {
                int i27 = 0;
                while (true) {
                    int[] iArr90 = this.f15978b;
                    if (i27 >= (iArr90.length > 3 ? 3 : iArr90.length)) {
                        break;
                    }
                    iArr90[i27] = 3;
                    i27++;
                }
            }
            this.f15981e = false;
            this.f15980d += length14;
            if (this.f15979c != null) {
                int i28 = 0;
                while (true) {
                    int[] iArr91 = this.f15979c;
                    if (i28 >= (iArr91.length > 3 ? 3 : iArr91.length)) {
                        break;
                    }
                    iArr91[i28] = 5;
                    i28++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList14 = this.f15982f;
            if (arrayList14 != null && arrayList14.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr92 = this.f15990n;
        if (iArr92 != null) {
            iArr92[0] = 0;
        }
        int[] iArr93 = this.f15979c;
        if (iArr93 != null) {
            iArr93[2] = 3;
        }
        int[] iArr94 = this.f15978b;
        if (iArr94 != null) {
            iArr94[5] = 2;
        }
        if (iArr94 != null) {
            try {
                iArr94[3] = 9;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (iArr93 != null) {
            iArr93[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr95 = this.f15979c;
        if (iArr95 != null) {
            iArr95[9] = 7;
        }
        if (iArr95 != null) {
            iArr95[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length15 = this.f15980d.length();
            if (this.f15978b != null) {
                int i29 = 0;
                while (true) {
                    int[] iArr96 = this.f15978b;
                    if (i29 >= (iArr96.length > 3 ? 3 : iArr96.length)) {
                        break;
                    }
                    iArr96[i29] = 3;
                    i29++;
                }
            }
            boolean z9 = this.f15981e;
            this.f15981e = false;
            this.f15980d += length15;
            if (this.f15979c != null) {
                int i30 = 0;
                while (true) {
                    int[] iArr97 = this.f15979c;
                    if (i30 >= (iArr97.length > 3 ? 3 : iArr97.length)) {
                        break;
                    }
                    iArr97[i30] = 5;
                    i30++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList15 = this.f15982f;
            if (arrayList15 != null && arrayList15.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr98 = this.f15990n;
        if (iArr98 != null) {
            iArr98[0] = 0;
        }
        int[] iArr99 = this.f15979c;
        if (iArr99 != null) {
            iArr99[2] = 3;
        }
        int[] iArr100 = this.f15978b;
        if (iArr100 != null) {
            iArr100[5] = 2;
        }
        if (iArr100 != null) {
            iArr100[3] = 9;
        }
        if (iArr99 != null) {
            iArr99[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr101 = this.f15979c;
        if (iArr101 != null) {
            iArr101[9] = 7;
        }
        if (iArr101 != null) {
            iArr101[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length16 = this.f15980d.length();
            if (this.f15978b != null) {
                int i31 = 0;
                while (true) {
                    int[] iArr102 = this.f15978b;
                    if (i31 >= (iArr102.length > 3 ? 3 : iArr102.length)) {
                        break;
                    }
                    iArr102[i31] = 3;
                    i31++;
                }
            }
            boolean z10 = this.f15981e;
            this.f15981e = false;
            this.f15980d += length16;
            if (this.f15979c != null) {
                int i32 = 0;
                while (true) {
                    int[] iArr103 = this.f15979c;
                    if (i32 >= (iArr103.length > 3 ? 3 : iArr103.length)) {
                        break;
                    }
                    iArr103[i32] = 5;
                    i32++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList16 = this.f15982f;
            if (arrayList16 != null && arrayList16.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr104 = this.f15990n;
        if (iArr104 != null) {
            iArr104[0] = 0;
        }
        int[] iArr105 = this.f15979c;
        if (iArr105 != null) {
            iArr105[2] = 3;
        }
        int[] iArr106 = this.f15978b;
        if (iArr106 != null) {
            iArr106[5] = 2;
        }
        if (this.f15989m != null) {
            if (iArr106 != null) {
                iArr106[3] = 9;
            }
            if (iArr105 != null) {
                iArr105[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr107 = this.f15979c;
            if (iArr107 != null) {
                iArr107[9] = 7;
            }
            if (iArr107 != null) {
                iArr107[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length17 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i33 = 0;
                    while (true) {
                        int[] iArr108 = this.f15978b;
                        if (i33 >= (iArr108.length > 3 ? 3 : iArr108.length)) {
                            break;
                        }
                        iArr108[i33] = 3;
                        i33++;
                    }
                }
                boolean z11 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length17;
                if (this.f15979c != null) {
                    int i34 = 0;
                    while (true) {
                        int[] iArr109 = this.f15979c;
                        if (i34 >= (iArr109.length > 3 ? 3 : iArr109.length)) {
                            break;
                        }
                        iArr109[i34] = 5;
                        i34++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList17 = this.f15982f;
                if (arrayList17 != null && arrayList17.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr110 = this.f15990n;
            if (iArr110 != null) {
                iArr110[0] = 0;
            }
            int[] iArr111 = this.f15979c;
            if (iArr111 != null) {
                iArr111[2] = 3;
            }
            int[] iArr112 = this.f15978b;
            if (iArr112 != null) {
                iArr112[5] = 2;
            }
            if (iArr112 != null) {
                iArr112[3] = 9;
            }
            if (iArr111 != null) {
                iArr111[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr113 = this.f15979c;
            if (iArr113 != null) {
                iArr113[9] = 7;
            }
            if (iArr113 != null) {
                iArr113[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length18 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i35 = 0;
                    while (true) {
                        int[] iArr114 = this.f15978b;
                        if (i35 >= (iArr114.length > 3 ? 3 : iArr114.length)) {
                            break;
                        }
                        iArr114[i35] = 3;
                        i35++;
                    }
                }
                boolean z12 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length18;
                if (this.f15979c != null) {
                    int i36 = 0;
                    while (true) {
                        int[] iArr115 = this.f15979c;
                        if (i36 >= (iArr115.length > 3 ? 3 : iArr115.length)) {
                            break;
                        }
                        iArr115[i36] = 5;
                        i36++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList18 = this.f15982f;
                if (arrayList18 != null && arrayList18.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr116 = this.f15990n;
            if (iArr116 != null) {
                iArr116[0] = 0;
            }
            int[] iArr117 = this.f15979c;
            if (iArr117 != null) {
                iArr117[2] = 3;
            }
            int[] iArr118 = this.f15978b;
            if (iArr118 != null) {
                iArr118[5] = 2;
            }
            this.f15989m.dismiss();
            int[] iArr119 = this.f15978b;
            if (iArr119 != null) {
                iArr119[3] = 9;
            }
            int[] iArr120 = this.f15979c;
            if (iArr120 != null) {
                iArr120[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr121 = this.f15979c;
            if (iArr121 != null) {
                iArr121[9] = 7;
            }
            if (iArr121 != null) {
                iArr121[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length19 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i37 = 0;
                    while (true) {
                        int[] iArr122 = this.f15978b;
                        if (i37 >= (iArr122.length > 3 ? 3 : iArr122.length)) {
                            break;
                        }
                        iArr122[i37] = 3;
                        i37++;
                    }
                }
                boolean z13 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length19;
                if (this.f15979c != null) {
                    int i38 = 0;
                    while (true) {
                        int[] iArr123 = this.f15979c;
                        if (i38 >= (iArr123.length > 3 ? 3 : iArr123.length)) {
                            break;
                        }
                        iArr123[i38] = 5;
                        i38++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList19 = this.f15982f;
                if (arrayList19 != null && arrayList19.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr124 = this.f15990n;
            if (iArr124 != null) {
                iArr124[0] = 0;
            }
            int[] iArr125 = this.f15979c;
            if (iArr125 != null) {
                iArr125[2] = 3;
            }
            int[] iArr126 = this.f15978b;
            if (iArr126 != null) {
                iArr126[5] = 2;
            }
            if (iArr126 != null) {
                iArr126[3] = 9;
            }
            if (iArr125 != null) {
                iArr125[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr127 = this.f15979c;
            if (iArr127 != null) {
                iArr127[9] = 7;
            }
            if (iArr127 != null) {
                iArr127[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length20 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i39 = 0;
                    while (true) {
                        int[] iArr128 = this.f15978b;
                        if (i39 >= (iArr128.length > 3 ? 3 : iArr128.length)) {
                            break;
                        }
                        iArr128[i39] = 3;
                        i39++;
                    }
                }
                boolean z14 = this.f15981e;
                this.f15981e = false;
                this.f15980d += length20;
                if (this.f15979c != null) {
                    int i40 = 0;
                    while (true) {
                        int[] iArr129 = this.f15979c;
                        if (i40 >= (iArr129.length > 3 ? 3 : iArr129.length)) {
                            break;
                        }
                        iArr129[i40] = 5;
                        i40++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList20 = this.f15982f;
                if (arrayList20 != null && arrayList20.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr130 = this.f15990n;
            if (iArr130 != null) {
                iArr130[0] = 0;
            }
            int[] iArr131 = this.f15979c;
            if (iArr131 != null) {
                iArr131[2] = 3;
            }
            int[] iArr132 = this.f15978b;
            if (iArr132 != null) {
                iArr132[5] = 2;
            }
        }
        int[] iArr133 = this.f15978b;
        if (iArr133 != null) {
            iArr133[3] = 9;
        }
        int[] iArr134 = this.f15979c;
        if (iArr134 != null) {
            iArr134[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr135 = this.f15979c;
        if (iArr135 != null) {
            iArr135[9] = 7;
        }
        if (iArr135 != null) {
            iArr135[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length21 = this.f15980d.length();
            if (this.f15978b != null) {
                int i41 = 0;
                while (true) {
                    int[] iArr136 = this.f15978b;
                    if (i41 >= (iArr136.length > 3 ? 3 : iArr136.length)) {
                        break;
                    }
                    iArr136[i41] = 3;
                    i41++;
                }
            }
            boolean z15 = this.f15981e;
            this.f15981e = false;
            this.f15980d += length21;
            if (this.f15979c != null) {
                int i42 = 0;
                while (true) {
                    int[] iArr137 = this.f15979c;
                    if (i42 >= (iArr137.length > 3 ? 3 : iArr137.length)) {
                        break;
                    }
                    iArr137[i42] = 5;
                    i42++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList21 = this.f15982f;
            if (arrayList21 != null && arrayList21.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr138 = this.f15990n;
        if (iArr138 != null) {
            iArr138[0] = 0;
        }
        int[] iArr139 = this.f15979c;
        if (iArr139 != null) {
            iArr139[2] = 3;
        }
        int[] iArr140 = this.f15978b;
        if (iArr140 != null) {
            iArr140[5] = 2;
        }
        int[] iArr141 = this.f15978b;
        if (iArr141 != null) {
            iArr141[3] = 9;
        }
        int[] iArr142 = this.f15979c;
        if (iArr142 != null) {
            iArr142[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr143 = this.f15979c;
        if (iArr143 != null) {
            iArr143[9] = 7;
        }
        if (iArr143 != null) {
            iArr143[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length22 = this.f15980d.length();
            if (this.f15978b != null) {
                int i43 = 0;
                while (true) {
                    int[] iArr144 = this.f15978b;
                    if (i43 >= (iArr144.length > 3 ? 3 : iArr144.length)) {
                        break;
                    }
                    iArr144[i43] = 3;
                    i43++;
                }
            }
            this.f15981e = false;
            this.f15980d += length22;
            if (this.f15979c != null) {
                int i44 = 0;
                while (true) {
                    int[] iArr145 = this.f15979c;
                    if (i44 >= (iArr145.length > 3 ? 3 : iArr145.length)) {
                        break;
                    }
                    iArr145[i44] = 5;
                    i44++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList22 = this.f15982f;
            if (arrayList22 != null && arrayList22.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr146 = this.f15990n;
        if (iArr146 != null) {
            iArr146[0] = 0;
        }
        int[] iArr147 = this.f15979c;
        if (iArr147 != null) {
            iArr147[2] = 3;
        }
        int[] iArr148 = this.f15978b;
        if (iArr148 != null) {
            iArr148[5] = 2;
        }
        if (iArr148 != null) {
            iArr148[3] = 9;
        }
        if (iArr147 != null) {
            iArr147[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr149 = this.f15979c;
        if (iArr149 != null) {
            iArr149[9] = 7;
        }
        if (iArr149 != null) {
            iArr149[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length23 = this.f15980d.length();
            if (this.f15978b != null) {
                int i45 = 0;
                while (true) {
                    int[] iArr150 = this.f15978b;
                    if (i45 >= (iArr150.length > 3 ? 3 : iArr150.length)) {
                        break;
                    }
                    iArr150[i45] = 3;
                    i45++;
                }
            }
            this.f15981e = false;
            this.f15980d += length23;
            if (this.f15979c != null) {
                int i46 = 0;
                while (true) {
                    int[] iArr151 = this.f15979c;
                    if (i46 >= (iArr151.length > 3 ? 3 : iArr151.length)) {
                        break;
                    }
                    iArr151[i46] = 5;
                    i46++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList23 = this.f15982f;
            if (arrayList23 != null && arrayList23.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr152 = this.f15990n;
        if (iArr152 != null) {
            iArr152[0] = 0;
        }
        int[] iArr153 = this.f15979c;
        if (iArr153 != null) {
            iArr153[2] = 3;
        }
        int[] iArr154 = this.f15978b;
        if (iArr154 != null) {
            iArr154[5] = 2;
        }
        try {
            MaxInterstitialAd maxInterstitialAd = this.f15977a;
            if (maxInterstitialAd != null) {
                maxInterstitialAd.destroy();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        finish();
    }

    /* renamed from: d */
    public void m9143d(String str) {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        if (iArr8 != null) {
            iArr8[3] = 9;
        }
        if (iArr7 != null) {
            iArr7[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr9 = this.f15979c;
        if (iArr9 != null) {
            iArr9[9] = 7;
        }
        if (iArr9 != null) {
            iArr9[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr10 = this.f15978b;
                    if (i3 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr11 = this.f15979c;
                    if (i4 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr12 = this.f15990n;
        if (iArr12 != null) {
            iArr12[0] = 0;
        }
        int[] iArr13 = this.f15979c;
        if (iArr13 != null) {
            iArr13[2] = 3;
        }
        int[] iArr14 = this.f15978b;
        if (iArr14 != null) {
            iArr14[5] = 2;
        }
        this.f15977a = new MaxInterstitialAd(str, this);
        int[] iArr15 = this.f15978b;
        if (iArr15 != null) {
            iArr15[3] = 9;
        }
        int[] iArr16 = this.f15979c;
        if (iArr16 != null) {
            iArr16[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr17 = this.f15979c;
        if (iArr17 != null) {
            iArr17[9] = 7;
        }
        if (iArr17 != null) {
            iArr17[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr18 = this.f15978b;
                    if (i5 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                        break;
                    }
                    iArr18[i5] = 3;
                    i5++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr19 = this.f15979c;
                    if (i6 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                        break;
                    }
                    iArr19[i6] = 5;
                    i6++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr20 = this.f15990n;
        if (iArr20 != null) {
            iArr20[0] = 0;
        }
        int[] iArr21 = this.f15979c;
        if (iArr21 != null) {
            iArr21[2] = 3;
        }
        int[] iArr22 = this.f15978b;
        if (iArr22 != null) {
            iArr22[5] = 2;
        }
        this.f15977a.setListener(this);
        int[] iArr23 = this.f15978b;
        if (iArr23 != null) {
            iArr23[3] = 9;
        }
        int[] iArr24 = this.f15979c;
        if (iArr24 != null) {
            iArr24[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr25 = this.f15979c;
        if (iArr25 != null) {
            iArr25[9] = 7;
        }
        if (iArr25 != null) {
            iArr25[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length4 = this.f15980d.length();
            if (this.f15978b != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr26 = this.f15978b;
                    if (i7 >= (iArr26.length > 3 ? 3 : iArr26.length)) {
                        break;
                    }
                    iArr26[i7] = 3;
                    i7++;
                }
            }
            this.f15981e = false;
            this.f15980d += length4;
            if (this.f15979c != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr27 = this.f15979c;
                    if (i8 >= (iArr27.length > 3 ? 3 : iArr27.length)) {
                        break;
                    }
                    iArr27[i8] = 5;
                    i8++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList4 = this.f15982f;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr28 = this.f15990n;
        if (iArr28 != null) {
            iArr28[0] = 0;
        }
        int[] iArr29 = this.f15979c;
        if (iArr29 != null) {
            iArr29[2] = 3;
        }
        int[] iArr30 = this.f15978b;
        if (iArr30 != null) {
            iArr30[5] = 2;
        }
        m9141f("isReady " + this.f15977a.isReady());
        int[] iArr31 = this.f15978b;
        if (iArr31 != null) {
            iArr31[3] = 9;
        }
        int[] iArr32 = this.f15979c;
        if (iArr32 != null) {
            iArr32[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr33 = this.f15979c;
        if (iArr33 != null) {
            iArr33[9] = 7;
        }
        if (iArr33 != null) {
            iArr33[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length5 = this.f15980d.length();
            if (this.f15978b != null) {
                int i9 = 0;
                while (true) {
                    int[] iArr34 = this.f15978b;
                    if (i9 >= (iArr34.length > 3 ? 3 : iArr34.length)) {
                        break;
                    }
                    iArr34[i9] = 3;
                    i9++;
                }
            }
            this.f15981e = false;
            this.f15980d += length5;
            if (this.f15979c != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr35 = this.f15979c;
                    if (i10 >= (iArr35.length > 3 ? 3 : iArr35.length)) {
                        break;
                    }
                    iArr35[i10] = 5;
                    i10++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList5 = this.f15982f;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr36 = this.f15990n;
        if (iArr36 != null) {
            iArr36[0] = 0;
        }
        int[] iArr37 = this.f15979c;
        if (iArr37 != null) {
            iArr37[2] = 3;
        }
        int[] iArr38 = this.f15978b;
        if (iArr38 != null) {
            iArr38[5] = 2;
        }
        if (this.f15977a.isReady()) {
            int[] iArr39 = this.f15978b;
            if (iArr39 != null) {
                iArr39[3] = 9;
            }
            int[] iArr40 = this.f15979c;
            if (iArr40 != null) {
                iArr40[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr41 = this.f15979c;
            if (iArr41 != null) {
                iArr41[9] = 7;
            }
            if (iArr41 != null) {
                iArr41[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length6 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i11 = 0;
                    while (true) {
                        int[] iArr42 = this.f15978b;
                        if (i11 >= (iArr42.length > 3 ? 3 : iArr42.length)) {
                            break;
                        }
                        iArr42[i11] = 3;
                        i11++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length6;
                if (this.f15979c != null) {
                    int i12 = 0;
                    while (true) {
                        int[] iArr43 = this.f15979c;
                        if (i12 >= (iArr43.length > 3 ? 3 : iArr43.length)) {
                            break;
                        }
                        iArr43[i12] = 5;
                        i12++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList6 = this.f15982f;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr44 = this.f15990n;
            if (iArr44 != null) {
                iArr44[0] = 0;
            }
            int[] iArr45 = this.f15979c;
            if (iArr45 != null) {
                iArr45[2] = 3;
            }
            int[] iArr46 = this.f15978b;
            if (iArr46 != null) {
                iArr46[5] = 2;
            }
            new Handler().postDelayed(new RunnableC9648a(), 2000L);
            int[] iArr47 = this.f15978b;
            if (iArr47 != null) {
                iArr47[3] = 9;
            }
            int[] iArr48 = this.f15979c;
            if (iArr48 != null) {
                iArr48[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr49 = this.f15979c;
            if (iArr49 != null) {
                iArr49[9] = 7;
            }
            if (iArr49 != null) {
                iArr49[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length7 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i13 = 0;
                    while (true) {
                        int[] iArr50 = this.f15978b;
                        if (i13 >= (iArr50.length > 3 ? 3 : iArr50.length)) {
                            break;
                        }
                        iArr50[i13] = 3;
                        i13++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length7;
                if (this.f15979c != null) {
                    int i14 = 0;
                    while (true) {
                        int[] iArr51 = this.f15979c;
                        if (i14 >= (iArr51.length > 3 ? 3 : iArr51.length)) {
                            break;
                        }
                        iArr51[i14] = 5;
                        i14++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList7 = this.f15982f;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr52 = this.f15990n;
            if (iArr52 != null) {
                iArr52[0] = 0;
            }
            int[] iArr53 = this.f15979c;
            if (iArr53 != null) {
                iArr53[2] = 3;
            }
            int[] iArr54 = this.f15978b;
            if (iArr54 != null) {
                iArr54[5] = 2;
            }
        } else {
            int[] iArr55 = this.f15978b;
            if (iArr55 != null) {
                iArr55[3] = 9;
            }
            int[] iArr56 = this.f15979c;
            if (iArr56 != null) {
                iArr56[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr57 = this.f15979c;
            if (iArr57 != null) {
                iArr57[9] = 7;
            }
            if (iArr57 != null) {
                iArr57[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length8 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i15 = 0;
                    while (true) {
                        int[] iArr58 = this.f15978b;
                        if (i15 >= (iArr58.length > 3 ? 3 : iArr58.length)) {
                            break;
                        }
                        iArr58[i15] = 3;
                        i15++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length8;
                if (this.f15979c != null) {
                    int i16 = 0;
                    while (true) {
                        int[] iArr59 = this.f15979c;
                        if (i16 >= (iArr59.length > 3 ? 3 : iArr59.length)) {
                            break;
                        }
                        iArr59[i16] = 5;
                        i16++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList8 = this.f15982f;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr60 = this.f15990n;
            if (iArr60 != null) {
                iArr60[0] = 0;
            }
            int[] iArr61 = this.f15979c;
            if (iArr61 != null) {
                iArr61[2] = 3;
            }
            int[] iArr62 = this.f15978b;
            if (iArr62 != null) {
                iArr62[5] = 2;
            }
            this.f15977a.loadAd();
        }
        int[] iArr63 = this.f15978b;
        if (iArr63 != null) {
            iArr63[3] = 9;
        }
        int[] iArr64 = this.f15979c;
        if (iArr64 != null) {
            iArr64[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr65 = this.f15979c;
        if (iArr65 != null) {
            iArr65[9] = 7;
        }
        if (iArr65 != null) {
            iArr65[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length9 = this.f15980d.length();
            if (this.f15978b != null) {
                int i17 = 0;
                while (true) {
                    int[] iArr66 = this.f15978b;
                    if (i17 >= (iArr66.length > 3 ? 3 : iArr66.length)) {
                        break;
                    }
                    iArr66[i17] = 3;
                    i17++;
                }
            }
            this.f15981e = false;
            this.f15980d += length9;
            if (this.f15979c != null) {
                int i18 = 0;
                while (true) {
                    int[] iArr67 = this.f15979c;
                    if (i18 >= (iArr67.length > 3 ? 3 : iArr67.length)) {
                        break;
                    }
                    iArr67[i18] = 5;
                    i18++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList9 = this.f15982f;
            if (arrayList9 != null && arrayList9.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr68 = this.f15990n;
        if (iArr68 != null) {
            iArr68[0] = 0;
        }
        int[] iArr69 = this.f15979c;
        if (iArr69 != null) {
            iArr69[2] = 3;
        }
        int[] iArr70 = this.f15978b;
        if (iArr70 != null) {
            iArr70[5] = 2;
        }
        if (iArr70 != null) {
            iArr70[3] = 9;
        }
        if (iArr69 != null) {
            iArr69[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr71 = this.f15979c;
        if (iArr71 != null) {
            iArr71[9] = 7;
        }
        if (iArr71 != null) {
            iArr71[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length10 = this.f15980d.length();
            if (this.f15978b != null) {
                int i19 = 0;
                while (true) {
                    int[] iArr72 = this.f15978b;
                    if (i19 >= (iArr72.length > 3 ? 3 : iArr72.length)) {
                        break;
                    }
                    iArr72[i19] = 3;
                    i19++;
                }
            }
            this.f15981e = false;
            this.f15980d += length10;
            if (this.f15979c != null) {
                int i20 = 0;
                while (true) {
                    int[] iArr73 = this.f15979c;
                    if (i20 >= (iArr73.length > 3 ? 3 : iArr73.length)) {
                        break;
                    }
                    iArr73[i20] = 5;
                    i20++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList10 = this.f15982f;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr74 = this.f15990n;
        if (iArr74 != null) {
            iArr74[0] = 0;
        }
        int[] iArr75 = this.f15979c;
        if (iArr75 != null) {
            iArr75[2] = 3;
        }
        int[] iArr76 = this.f15978b;
        if (iArr76 != null) {
            iArr76[5] = 2;
        }
    }

    /* renamed from: f */
    public final void m9141f(String str) {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        if (iArr8 != null) {
            iArr8[3] = 9;
        }
        if (iArr7 != null) {
            iArr7[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr9 = this.f15979c;
        if (iArr9 != null) {
            iArr9[9] = 7;
        }
        if (iArr9 != null) {
            iArr9[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr10 = this.f15978b;
                    if (i3 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr11 = this.f15979c;
                    if (i4 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr12 = this.f15990n;
        if (iArr12 != null) {
            iArr12[0] = 0;
        }
        int[] iArr13 = this.f15979c;
        if (iArr13 != null) {
            iArr13[2] = 3;
        }
        int[] iArr14 = this.f15978b;
        if (iArr14 != null) {
            iArr14[5] = 2;
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        m9141f("onAdClicked");
        int[] iArr9 = this.f15978b;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15979c;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr11 = this.f15979c;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr12 = this.f15978b;
                    if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr13 = this.f15979c;
                    if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr14 = this.f15990n;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15979c;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15978b;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        m9141f("onAdDisplayFailed" + maxError.getCode() + " " + maxError.getMessage());
        int[] iArr9 = this.f15978b;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15979c;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr11 = this.f15979c;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr12 = this.f15978b;
                    if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr13 = this.f15979c;
                    if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr14 = this.f15990n;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15979c;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15978b;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
        m9144c();
        int[] iArr17 = this.f15978b;
        if (iArr17 != null) {
            iArr17[3] = 9;
        }
        int[] iArr18 = this.f15979c;
        if (iArr18 != null) {
            iArr18[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr19 = this.f15979c;
        if (iArr19 != null) {
            iArr19[9] = 7;
        }
        if (iArr19 != null) {
            iArr19[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr20 = this.f15978b;
                    if (i5 >= (iArr20.length > 3 ? 3 : iArr20.length)) {
                        break;
                    }
                    iArr20[i5] = 3;
                    i5++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr21 = this.f15979c;
                    if (i6 >= (iArr21.length > 3 ? 3 : iArr21.length)) {
                        break;
                    }
                    iArr21[i6] = 5;
                    i6++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr22 = this.f15990n;
        if (iArr22 != null) {
            iArr22[0] = 0;
        }
        int[] iArr23 = this.f15979c;
        if (iArr23 != null) {
            iArr23[2] = 3;
        }
        int[] iArr24 = this.f15978b;
        if (iArr24 != null) {
            iArr24[5] = 2;
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i10 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i10] = 3;
                    i10++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i11 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i11] = 5;
                    i11++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        m9141f("onAdDisplayed");
        int[] iArr9 = this.f15978b;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15979c;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr11 = this.f15979c;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr12 = this.f15978b;
                    if (i12 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i12] = 3;
                    i12++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i13 = 0;
                while (true) {
                    int[] iArr13 = this.f15979c;
                    if (i13 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i13] = 5;
                    i13++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr14 = this.f15990n;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15979c;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15978b;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
        if (iArr16 != null) {
            iArr16[3] = 9;
        }
        if (iArr15 != null) {
            iArr15[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr17 = this.f15979c;
        if (iArr17 != null) {
            iArr17[9] = 7;
        }
        if (iArr17 != null) {
            iArr17[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i14 = 0;
                while (true) {
                    int[] iArr18 = this.f15978b;
                    if (i14 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                        break;
                    }
                    iArr18[i14] = 3;
                    i14++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i15 = 0;
                while (true) {
                    int[] iArr19 = this.f15979c;
                    if (i15 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                        break;
                    }
                    iArr19[i15] = 5;
                    i15++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr20 = this.f15990n;
        if (iArr20 != null) {
            iArr20[0] = 0;
        }
        int[] iArr21 = this.f15979c;
        if (iArr21 != null) {
            iArr21[2] = 3;
        }
        int[] iArr22 = this.f15978b;
        if (iArr22 != null) {
            iArr22[5] = 2;
        }
        if (!TextUtils.isEmpty(this.f15987k)) {
            int[] iArr23 = this.f15978b;
            if (iArr23 != null) {
                iArr23[3] = 9;
            }
            int[] iArr24 = this.f15979c;
            if (iArr24 != null) {
                iArr24[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr25 = this.f15979c;
            if (iArr25 != null) {
                iArr25[9] = 7;
            }
            if (iArr25 != null) {
                iArr25[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length4 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i16 = 0;
                    while (true) {
                        int[] iArr26 = this.f15978b;
                        if (i16 >= (iArr26.length > 3 ? 3 : iArr26.length)) {
                            break;
                        }
                        iArr26[i16] = 3;
                        i16++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length4;
                if (this.f15979c != null) {
                    int i17 = 0;
                    while (true) {
                        int[] iArr27 = this.f15979c;
                        if (i17 >= (iArr27.length > 3 ? 3 : iArr27.length)) {
                            break;
                        }
                        iArr27[i17] = 5;
                        i17++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList4 = this.f15982f;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr28 = this.f15990n;
            if (iArr28 != null) {
                iArr28[0] = 0;
            }
            int[] iArr29 = this.f15979c;
            if (iArr29 != null) {
                iArr29[2] = 3;
            }
            int[] iArr30 = this.f15978b;
            if (iArr30 != null) {
                iArr30[5] = 2;
            }
            Intent intent = new Intent(getPackageName() + "." + this.f15985i.replaceAll("bhuiw", "") + this.f15986j.replaceAll("oixnHuz", "") + this.f15984h.replaceAll("mkisje", "") + GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
            int[] iArr31 = this.f15978b;
            if (iArr31 != null) {
                iArr31[3] = 9;
            }
            int[] iArr32 = this.f15979c;
            if (iArr32 != null) {
                iArr32[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr33 = this.f15979c;
            if (iArr33 != null) {
                iArr33[9] = 7;
            }
            if (iArr33 != null) {
                iArr33[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length5 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr34 = this.f15978b;
                        if (i18 >= (iArr34.length > 3 ? 3 : iArr34.length)) {
                            break;
                        }
                        iArr34[i18] = 3;
                        i18++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length5;
                if (this.f15979c != null) {
                    int i19 = 0;
                    while (true) {
                        int[] iArr35 = this.f15979c;
                        if (i19 >= (iArr35.length > 3 ? 3 : iArr35.length)) {
                            break;
                        }
                        iArr35[i19] = 5;
                        i19++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList5 = this.f15982f;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr36 = this.f15990n;
            if (iArr36 != null) {
                iArr36[0] = 0;
            }
            int[] iArr37 = this.f15979c;
            if (iArr37 != null) {
                iArr37[2] = 3;
            }
            int[] iArr38 = this.f15978b;
            if (iArr38 != null) {
                iArr38[5] = 2;
            }
            if (iArr38 != null) {
                iArr38[3] = 9;
            }
            if (iArr37 != null) {
                iArr37[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i3 = 10;
                this.f15978b = new int[10];
            } else {
                i3 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i3];
            }
            this.f15981e = false;
            int[] iArr39 = this.f15979c;
            if (iArr39 != null) {
                iArr39[9] = 7;
            }
            if (iArr39 != null) {
                iArr39[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length6 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i20 = 0;
                    while (true) {
                        int[] iArr40 = this.f15978b;
                        if (i20 >= (iArr40.length > 3 ? 3 : iArr40.length)) {
                            break;
                        }
                        iArr40[i20] = 3;
                        i20++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length6;
                if (this.f15979c != null) {
                    int i21 = 0;
                    while (true) {
                        int[] iArr41 = this.f15979c;
                        if (i21 >= (iArr41.length > 3 ? 3 : iArr41.length)) {
                            break;
                        }
                        iArr41[i21] = 5;
                        i21++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList6 = this.f15982f;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr42 = this.f15990n;
            if (iArr42 != null) {
                iArr42[0] = 0;
            }
            int[] iArr43 = this.f15979c;
            if (iArr43 != null) {
                iArr43[2] = 3;
            }
            int[] iArr44 = this.f15978b;
            if (iArr44 != null) {
                iArr44[5] = 2;
            }
            intent.putExtra(this.f15983g.replaceAll("hu17kxd", "") + this.f15984h.replaceAll("mkisje", "") + GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, this.f15987k);
            int[] iArr45 = this.f15978b;
            if (iArr45 != null) {
                iArr45[3] = 9;
            }
            int[] iArr46 = this.f15979c;
            if (iArr46 != null) {
                iArr46[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i4 = 10;
                this.f15978b = new int[10];
            } else {
                i4 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i4];
            }
            this.f15981e = false;
            int[] iArr47 = this.f15979c;
            if (iArr47 != null) {
                iArr47[9] = 7;
            }
            if (iArr47 != null) {
                iArr47[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length7 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i22 = 0;
                    while (true) {
                        int[] iArr48 = this.f15978b;
                        if (i22 >= (iArr48.length > 3 ? 3 : iArr48.length)) {
                            break;
                        }
                        iArr48[i22] = 3;
                        i22++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length7;
                if (this.f15979c != null) {
                    int i23 = 0;
                    while (true) {
                        int[] iArr49 = this.f15979c;
                        if (i23 >= (iArr49.length > 3 ? 3 : iArr49.length)) {
                            break;
                        }
                        iArr49[i23] = 5;
                        i23++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList7 = this.f15982f;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr50 = this.f15990n;
            if (iArr50 != null) {
                iArr50[0] = 0;
            }
            int[] iArr51 = this.f15979c;
            if (iArr51 != null) {
                iArr51[2] = 3;
            }
            int[] iArr52 = this.f15978b;
            if (iArr52 != null) {
                iArr52[5] = 2;
            }
            if (iArr52 != null) {
                iArr52[3] = 9;
            }
            if (iArr51 != null) {
                iArr51[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i5 = 10;
                this.f15978b = new int[10];
            } else {
                i5 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i5];
            }
            this.f15981e = false;
            int[] iArr53 = this.f15979c;
            if (iArr53 != null) {
                iArr53[9] = 7;
            }
            if (iArr53 != null) {
                iArr53[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length8 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i24 = 0;
                    while (true) {
                        int[] iArr54 = this.f15978b;
                        if (i24 >= (iArr54.length > 3 ? 3 : iArr54.length)) {
                            break;
                        }
                        iArr54[i24] = 3;
                        i24++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length8;
                if (this.f15979c != null) {
                    int i25 = 0;
                    while (true) {
                        int[] iArr55 = this.f15979c;
                        if (i25 >= (iArr55.length > 3 ? 3 : iArr55.length)) {
                            break;
                        }
                        iArr55[i25] = 5;
                        i25++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList8 = this.f15982f;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr56 = this.f15990n;
            if (iArr56 != null) {
                iArr56[0] = 0;
            }
            int[] iArr57 = this.f15979c;
            if (iArr57 != null) {
                iArr57[2] = 3;
            }
            int[] iArr58 = this.f15978b;
            if (iArr58 != null) {
                iArr58[5] = 2;
            }
            m9141f(this.f15983g.replaceAll("hu17kxd", "") + this.f15984h.replaceAll("mkisje", "") + "n :" + this.f15987k);
            int[] iArr59 = this.f15978b;
            if (iArr59 != null) {
                iArr59[3] = 9;
            }
            int[] iArr60 = this.f15979c;
            if (iArr60 != null) {
                iArr60[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i6 = 10;
                this.f15978b = new int[10];
            } else {
                i6 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i6];
            }
            this.f15981e = false;
            int[] iArr61 = this.f15979c;
            if (iArr61 != null) {
                iArr61[9] = 7;
            }
            if (iArr61 != null) {
                iArr61[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length9 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i26 = 0;
                    while (true) {
                        int[] iArr62 = this.f15978b;
                        if (i26 >= (iArr62.length > 3 ? 3 : iArr62.length)) {
                            break;
                        }
                        iArr62[i26] = 3;
                        i26++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length9;
                if (this.f15979c != null) {
                    int i27 = 0;
                    while (true) {
                        int[] iArr63 = this.f15979c;
                        if (i27 >= (iArr63.length > 3 ? 3 : iArr63.length)) {
                            break;
                        }
                        iArr63[i27] = 5;
                        i27++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList9 = this.f15982f;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr64 = this.f15990n;
            if (iArr64 != null) {
                iArr64[0] = 0;
            }
            int[] iArr65 = this.f15979c;
            if (iArr65 != null) {
                iArr65[2] = 3;
            }
            int[] iArr66 = this.f15978b;
            if (iArr66 != null) {
                iArr66[5] = 2;
            }
            if (iArr66 != null) {
                iArr66[3] = 9;
            }
            if (iArr65 != null) {
                iArr65[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i7 = 10;
                this.f15978b = new int[10];
            } else {
                i7 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i7];
            }
            this.f15981e = false;
            int[] iArr67 = this.f15979c;
            if (iArr67 != null) {
                iArr67[9] = 7;
            }
            if (iArr67 != null) {
                iArr67[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length10 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i28 = 0;
                    while (true) {
                        int[] iArr68 = this.f15978b;
                        if (i28 >= (iArr68.length > 3 ? 3 : iArr68.length)) {
                            break;
                        }
                        iArr68[i28] = 3;
                        i28++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length10;
                if (this.f15979c != null) {
                    int i29 = 0;
                    while (true) {
                        int[] iArr69 = this.f15979c;
                        if (i29 >= (iArr69.length > 3 ? 3 : iArr69.length)) {
                            break;
                        }
                        iArr69[i29] = 5;
                        i29++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList10 = this.f15982f;
                if (arrayList10 != null && arrayList10.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr70 = this.f15990n;
            if (iArr70 != null) {
                iArr70[0] = 0;
            }
            int[] iArr71 = this.f15979c;
            if (iArr71 != null) {
                iArr71[2] = 3;
            }
            int[] iArr72 = this.f15978b;
            if (iArr72 != null) {
                iArr72[5] = 2;
            }
            sendBroadcast(intent);
            int[] iArr73 = this.f15978b;
            if (iArr73 != null) {
                iArr73[3] = 9;
            }
            int[] iArr74 = this.f15979c;
            if (iArr74 != null) {
                iArr74[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i8 = 10;
                this.f15978b = new int[10];
            } else {
                i8 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i8];
            }
            this.f15981e = false;
            int[] iArr75 = this.f15979c;
            if (iArr75 != null) {
                iArr75[9] = 7;
            }
            if (iArr75 != null) {
                iArr75[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length11 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i30 = 0;
                    while (true) {
                        int[] iArr76 = this.f15978b;
                        if (i30 >= (iArr76.length > 3 ? 3 : iArr76.length)) {
                            break;
                        }
                        iArr76[i30] = 3;
                        i30++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length11;
                if (this.f15979c != null) {
                    int i31 = 0;
                    while (true) {
                        int[] iArr77 = this.f15979c;
                        if (i31 >= (iArr77.length > 3 ? 3 : iArr77.length)) {
                            break;
                        }
                        iArr77[i31] = 5;
                        i31++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList11 = this.f15982f;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr78 = this.f15990n;
            if (iArr78 != null) {
                iArr78[0] = 0;
            }
            int[] iArr79 = this.f15979c;
            if (iArr79 != null) {
                iArr79[2] = 3;
            }
            int[] iArr80 = this.f15978b;
            if (iArr80 != null) {
                iArr80[5] = 2;
            }
            if (iArr80 != null) {
                iArr80[3] = 9;
            }
            if (iArr79 != null) {
                iArr79[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                i9 = 10;
                this.f15978b = new int[10];
            } else {
                i9 = 10;
            }
            if (this.f15979c == null) {
                this.f15979c = new int[i9];
            }
            this.f15981e = false;
            int[] iArr81 = this.f15979c;
            if (iArr81 != null) {
                iArr81[9] = 7;
            }
            if (iArr81 != null) {
                iArr81[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length12 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i32 = 0;
                    while (true) {
                        int[] iArr82 = this.f15978b;
                        if (i32 >= (iArr82.length > 3 ? 3 : iArr82.length)) {
                            break;
                        }
                        iArr82[i32] = 3;
                        i32++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length12;
                if (this.f15979c != null) {
                    int i33 = 0;
                    while (true) {
                        int[] iArr83 = this.f15979c;
                        if (i33 >= (iArr83.length > 3 ? 3 : iArr83.length)) {
                            break;
                        }
                        iArr83[i33] = 5;
                        i33++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList12 = this.f15982f;
                if (arrayList12 != null && arrayList12.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr84 = this.f15990n;
            if (iArr84 != null) {
                iArr84[0] = 0;
            }
            int[] iArr85 = this.f15979c;
            if (iArr85 != null) {
                iArr85[2] = 3;
            }
            int[] iArr86 = this.f15978b;
            if (iArr86 != null) {
                iArr86[5] = 2;
            }
        }
        int[] iArr87 = this.f15978b;
        if (iArr87 != null) {
            iArr87[3] = 9;
        }
        int[] iArr88 = this.f15979c;
        if (iArr88 != null) {
            iArr88[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            i = 10;
            this.f15978b = new int[10];
        } else {
            i = 10;
        }
        if (this.f15979c == null) {
            this.f15979c = new int[i];
        }
        this.f15981e = false;
        int[] iArr89 = this.f15979c;
        if (iArr89 != null) {
            iArr89[9] = 7;
        }
        if (iArr89 != null) {
            iArr89[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length13 = this.f15980d.length();
            if (this.f15978b != null) {
                int i34 = 0;
                while (true) {
                    int[] iArr90 = this.f15978b;
                    if (i34 >= (iArr90.length > 3 ? 3 : iArr90.length)) {
                        break;
                    }
                    iArr90[i34] = 3;
                    i34++;
                }
            }
            this.f15981e = false;
            this.f15980d += length13;
            if (this.f15979c != null) {
                int i35 = 0;
                while (true) {
                    int[] iArr91 = this.f15979c;
                    if (i35 >= (iArr91.length > 3 ? 3 : iArr91.length)) {
                        break;
                    }
                    iArr91[i35] = 5;
                    i35++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList13 = this.f15982f;
            if (arrayList13 != null && arrayList13.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr92 = this.f15990n;
        if (iArr92 != null) {
            iArr92[0] = 0;
        }
        int[] iArr93 = this.f15979c;
        if (iArr93 != null) {
            iArr93[2] = 3;
        }
        int[] iArr94 = this.f15978b;
        if (iArr94 != null) {
            iArr94[5] = 2;
        }
        if (iArr94 != null) {
            iArr94[3] = 9;
        }
        if (iArr93 != null) {
            iArr93[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            i2 = 10;
            this.f15978b = new int[10];
        } else {
            i2 = 10;
        }
        if (this.f15979c == null) {
            this.f15979c = new int[i2];
        }
        this.f15981e = false;
        int[] iArr95 = this.f15979c;
        if (iArr95 != null) {
            iArr95[9] = 7;
        }
        if (iArr95 != null) {
            iArr95[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length14 = this.f15980d.length();
            if (this.f15978b != null) {
                int i36 = 0;
                while (true) {
                    int[] iArr96 = this.f15978b;
                    if (i36 >= (iArr96.length > 3 ? 3 : iArr96.length)) {
                        break;
                    }
                    iArr96[i36] = 3;
                    i36++;
                }
            }
            this.f15981e = false;
            this.f15980d += length14;
            if (this.f15979c != null) {
                int i37 = 0;
                while (true) {
                    int[] iArr97 = this.f15979c;
                    if (i37 >= (iArr97.length > 3 ? 3 : iArr97.length)) {
                        break;
                    }
                    iArr97[i37] = 5;
                    i37++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList14 = this.f15982f;
            if (arrayList14 != null && arrayList14.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr98 = this.f15990n;
        if (iArr98 != null) {
            iArr98[0] = 0;
        }
        int[] iArr99 = this.f15979c;
        if (iArr99 != null) {
            iArr99[2] = 3;
        }
        int[] iArr100 = this.f15978b;
        if (iArr100 != null) {
            iArr100[5] = 2;
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        m9141f("onAdHidden");
        int[] iArr9 = this.f15978b;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15979c;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr11 = this.f15979c;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr12 = this.f15978b;
                    if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr13 = this.f15979c;
                    if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr14 = this.f15990n;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15979c;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15978b;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
        if (iArr16 != null) {
            iArr16[3] = 9;
        }
        if (iArr15 != null) {
            iArr15[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr17 = this.f15979c;
        if (iArr17 != null) {
            iArr17[9] = 7;
        }
        if (iArr17 != null) {
            iArr17[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr18 = this.f15978b;
                    if (i5 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                        break;
                    }
                    iArr18[i5] = 3;
                    i5++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr19 = this.f15979c;
                    if (i6 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                        break;
                    }
                    iArr19[i6] = 5;
                    i6++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr20 = this.f15990n;
        if (iArr20 != null) {
            iArr20[0] = 0;
        }
        int[] iArr21 = this.f15979c;
        if (iArr21 != null) {
            iArr21[2] = 3;
        }
        int[] iArr22 = this.f15978b;
        if (iArr22 != null) {
            iArr22[5] = 2;
        }
        m9144c();
        int[] iArr23 = this.f15978b;
        if (iArr23 != null) {
            iArr23[3] = 9;
        }
        int[] iArr24 = this.f15979c;
        if (iArr24 != null) {
            iArr24[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr25 = this.f15979c;
        if (iArr25 != null) {
            iArr25[9] = 7;
        }
        if (iArr25 != null) {
            iArr25[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length4 = this.f15980d.length();
            if (this.f15978b != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr26 = this.f15978b;
                    if (i7 >= (iArr26.length > 3 ? 3 : iArr26.length)) {
                        break;
                    }
                    iArr26[i7] = 3;
                    i7++;
                }
            }
            this.f15981e = false;
            this.f15980d += length4;
            if (this.f15979c != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr27 = this.f15979c;
                    if (i8 >= (iArr27.length > 3 ? 3 : iArr27.length)) {
                        break;
                    }
                    iArr27[i8] = 5;
                    i8++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList4 = this.f15982f;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr28 = this.f15990n;
        if (iArr28 != null) {
            iArr28[0] = 0;
        }
        int[] iArr29 = this.f15979c;
        if (iArr29 != null) {
            iArr29[2] = 3;
        }
        int[] iArr30 = this.f15978b;
        if (iArr30 != null) {
            iArr30[5] = 2;
        }
        if (iArr30 != null) {
            iArr30[3] = 9;
        }
        if (iArr29 != null) {
            iArr29[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr31 = this.f15979c;
        if (iArr31 != null) {
            iArr31[9] = 7;
        }
        if (iArr31 != null) {
            iArr31[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length5 = this.f15980d.length();
            if (this.f15978b != null) {
                int i9 = 0;
                while (true) {
                    int[] iArr32 = this.f15978b;
                    if (i9 >= (iArr32.length > 3 ? 3 : iArr32.length)) {
                        break;
                    }
                    iArr32[i9] = 3;
                    i9++;
                }
            }
            this.f15981e = false;
            this.f15980d += length5;
            if (this.f15979c != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr33 = this.f15979c;
                    if (i10 >= (iArr33.length > 3 ? 3 : iArr33.length)) {
                        break;
                    }
                    iArr33[i10] = 5;
                    i10++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList5 = this.f15982f;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr34 = this.f15990n;
        if (iArr34 != null) {
            iArr34[0] = 0;
        }
        int[] iArr35 = this.f15979c;
        if (iArr35 != null) {
            iArr35[2] = 3;
        }
        int[] iArr36 = this.f15978b;
        if (iArr36 != null) {
            iArr36[5] = 2;
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        m9141f("onAdLoadFailed" + maxError.getCode() + " " + maxError.getMessage());
        int[] iArr9 = this.f15978b;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15979c;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr11 = this.f15979c;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr12 = this.f15978b;
                    if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr13 = this.f15979c;
                    if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr14 = this.f15990n;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15979c;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15978b;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
        m9144c();
        int[] iArr17 = this.f15978b;
        if (iArr17 != null) {
            iArr17[3] = 9;
        }
        int[] iArr18 = this.f15979c;
        if (iArr18 != null) {
            iArr18[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr19 = this.f15979c;
        if (iArr19 != null) {
            iArr19[9] = 7;
        }
        if (iArr19 != null) {
            iArr19[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr20 = this.f15978b;
                    if (i5 >= (iArr20.length > 3 ? 3 : iArr20.length)) {
                        break;
                    }
                    iArr20[i5] = 3;
                    i5++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr21 = this.f15979c;
                    if (i6 >= (iArr21.length > 3 ? 3 : iArr21.length)) {
                        break;
                    }
                    iArr21[i6] = 5;
                    i6++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr22 = this.f15990n;
        if (iArr22 != null) {
            iArr22[0] = 0;
        }
        int[] iArr23 = this.f15979c;
        if (iArr23 != null) {
            iArr23[2] = 3;
        }
        int[] iArr24 = this.f15978b;
        if (iArr24 != null) {
            iArr24[5] = 2;
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        if (iArr8 != null) {
            iArr8[3] = 9;
        }
        if (iArr7 != null) {
            iArr7[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr9 = this.f15979c;
        if (iArr9 != null) {
            iArr9[9] = 7;
        }
        if (iArr9 != null) {
            iArr9[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr10 = this.f15978b;
                    if (i3 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr11 = this.f15979c;
                    if (i4 >= (iArr11.length > 3 ? 3 : iArr11.length)) {
                        break;
                    }
                    iArr11[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr12 = this.f15990n;
        if (iArr12 != null) {
            iArr12[0] = 0;
        }
        int[] iArr13 = this.f15979c;
        if (iArr13 != null) {
            iArr13[2] = 3;
        }
        int[] iArr14 = this.f15978b;
        if (iArr14 != null) {
            iArr14[5] = 2;
        }
        m9141f("onAdLoaded");
        int[] iArr15 = this.f15978b;
        if (iArr15 != null) {
            iArr15[3] = 9;
        }
        int[] iArr16 = this.f15979c;
        if (iArr16 != null) {
            iArr16[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr17 = this.f15979c;
        if (iArr17 != null) {
            iArr17[9] = 7;
        }
        if (iArr17 != null) {
            iArr17[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr18 = this.f15978b;
                    if (i5 >= (iArr18.length > 3 ? 3 : iArr18.length)) {
                        break;
                    }
                    iArr18[i5] = 3;
                    i5++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr19 = this.f15979c;
                    if (i6 >= (iArr19.length > 3 ? 3 : iArr19.length)) {
                        break;
                    }
                    iArr19[i6] = 5;
                    i6++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr20 = this.f15990n;
        if (iArr20 != null) {
            iArr20[0] = 0;
        }
        int[] iArr21 = this.f15979c;
        if (iArr21 != null) {
            iArr21[2] = 3;
        }
        int[] iArr22 = this.f15978b;
        if (iArr22 != null) {
            iArr22[5] = 2;
        }
        if (iArr22 != null) {
            iArr22[3] = 9;
        }
        if (iArr21 != null) {
            iArr21[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr23 = this.f15979c;
        if (iArr23 != null) {
            iArr23[9] = 7;
        }
        if (iArr23 != null) {
            iArr23[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length4 = this.f15980d.length();
            if (this.f15978b != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr24 = this.f15978b;
                    if (i7 >= (iArr24.length > 3 ? 3 : iArr24.length)) {
                        break;
                    }
                    iArr24[i7] = 3;
                    i7++;
                }
            }
            this.f15981e = false;
            this.f15980d += length4;
            if (this.f15979c != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr25 = this.f15979c;
                    if (i8 >= (iArr25.length > 3 ? 3 : iArr25.length)) {
                        break;
                    }
                    iArr25[i8] = 5;
                    i8++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList4 = this.f15982f;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr26 = this.f15990n;
        if (iArr26 != null) {
            iArr26[0] = 0;
        }
        int[] iArr27 = this.f15979c;
        if (iArr27 != null) {
            iArr27[2] = 3;
        }
        int[] iArr28 = this.f15978b;
        if (iArr28 != null) {
            iArr28[5] = 2;
        }
        m9141f("isReady2 " + this.f15977a.isReady());
        int[] iArr29 = this.f15978b;
        if (iArr29 != null) {
            iArr29[3] = 9;
        }
        int[] iArr30 = this.f15979c;
        if (iArr30 != null) {
            iArr30[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr31 = this.f15979c;
        if (iArr31 != null) {
            iArr31[9] = 7;
        }
        if (iArr31 != null) {
            iArr31[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length5 = this.f15980d.length();
            if (this.f15978b != null) {
                int i9 = 0;
                while (true) {
                    int[] iArr32 = this.f15978b;
                    if (i9 >= (iArr32.length > 3 ? 3 : iArr32.length)) {
                        break;
                    }
                    iArr32[i9] = 3;
                    i9++;
                }
            }
            this.f15981e = false;
            this.f15980d += length5;
            if (this.f15979c != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr33 = this.f15979c;
                    if (i10 >= (iArr33.length > 3 ? 3 : iArr33.length)) {
                        break;
                    }
                    iArr33[i10] = 5;
                    i10++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList5 = this.f15982f;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr34 = this.f15990n;
        if (iArr34 != null) {
            iArr34[0] = 0;
        }
        int[] iArr35 = this.f15979c;
        if (iArr35 != null) {
            iArr35[2] = 3;
        }
        int[] iArr36 = this.f15978b;
        if (iArr36 != null) {
            iArr36[5] = 2;
        }
        new Handler().postDelayed(new RunnableC9649b(), 2000L);
        int[] iArr37 = this.f15978b;
        if (iArr37 != null) {
            iArr37[3] = 9;
        }
        int[] iArr38 = this.f15979c;
        if (iArr38 != null) {
            iArr38[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr39 = this.f15979c;
        if (iArr39 != null) {
            iArr39[9] = 7;
        }
        if (iArr39 != null) {
            iArr39[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length6 = this.f15980d.length();
            if (this.f15978b != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr40 = this.f15978b;
                    if (i11 >= (iArr40.length > 3 ? 3 : iArr40.length)) {
                        break;
                    }
                    iArr40[i11] = 3;
                    i11++;
                }
            }
            this.f15981e = false;
            this.f15980d += length6;
            if (this.f15979c != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr41 = this.f15979c;
                    if (i12 >= (iArr41.length > 3 ? 3 : iArr41.length)) {
                        break;
                    }
                    iArr41[i12] = 5;
                    i12++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList6 = this.f15982f;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr42 = this.f15990n;
        if (iArr42 != null) {
            iArr42[0] = 0;
        }
        int[] iArr43 = this.f15979c;
        if (iArr43 != null) {
            iArr43[2] = 3;
        }
        int[] iArr44 = this.f15978b;
        if (iArr44 != null) {
            iArr44[5] = 2;
        }
        if (iArr44 != null) {
            iArr44[3] = 9;
        }
        if (iArr43 != null) {
            iArr43[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr45 = this.f15979c;
        if (iArr45 != null) {
            iArr45[9] = 7;
        }
        if (iArr45 != null) {
            iArr45[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length7 = this.f15980d.length();
            if (this.f15978b != null) {
                int i13 = 0;
                while (true) {
                    int[] iArr46 = this.f15978b;
                    if (i13 >= (iArr46.length > 3 ? 3 : iArr46.length)) {
                        break;
                    }
                    iArr46[i13] = 3;
                    i13++;
                }
            }
            this.f15981e = false;
            this.f15980d += length7;
            if (this.f15979c != null) {
                int i14 = 0;
                while (true) {
                    int[] iArr47 = this.f15979c;
                    if (i14 >= (iArr47.length > 3 ? 3 : iArr47.length)) {
                        break;
                    }
                    iArr47[i14] = 5;
                    i14++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList7 = this.f15982f;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr48 = this.f15990n;
        if (iArr48 != null) {
            iArr48[0] = 0;
        }
        int[] iArr49 = this.f15979c;
        if (iArr49 != null) {
            iArr49[2] = 3;
        }
        int[] iArr50 = this.f15978b;
        if (iArr50 != null) {
            iArr50[5] = 2;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int[] iArr = this.f15978b;
        if (iArr != null) {
            iArr[3] = 9;
        }
        int[] iArr2 = this.f15979c;
        if (iArr2 != null) {
            iArr2[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr3 = this.f15979c;
        if (iArr3 != null) {
            iArr3[9] = 7;
        }
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length = this.f15980d.length();
            if (this.f15978b != null) {
                int i = 0;
                while (true) {
                    int[] iArr4 = this.f15978b;
                    if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i] = 3;
                    i++;
                }
            }
            this.f15981e = false;
            this.f15980d += length;
            if (this.f15979c != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr5 = this.f15979c;
                    if (i2 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i2] = 5;
                    i2++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList = this.f15982f;
            if (arrayList != null && arrayList.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr6 = this.f15990n;
        if (iArr6 != null) {
            iArr6[0] = 0;
        }
        int[] iArr7 = this.f15979c;
        if (iArr7 != null) {
            iArr7[2] = 3;
        }
        int[] iArr8 = this.f15978b;
        if (iArr8 != null) {
            iArr8[5] = 2;
        }
        m9141f("onCreate");
        int[] iArr9 = this.f15978b;
        if (iArr9 != null) {
            iArr9[3] = 9;
        }
        int[] iArr10 = this.f15979c;
        if (iArr10 != null) {
            iArr10[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr11 = this.f15979c;
        if (iArr11 != null) {
            iArr11[9] = 7;
        }
        if (iArr11 != null) {
            iArr11[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length2 = this.f15980d.length();
            if (this.f15978b != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr12 = this.f15978b;
                    if (i3 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                        break;
                    }
                    iArr12[i3] = 3;
                    i3++;
                }
            }
            this.f15981e = false;
            this.f15980d += length2;
            if (this.f15979c != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr13 = this.f15979c;
                    if (i4 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i4] = 5;
                    i4++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList2 = this.f15982f;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr14 = this.f15990n;
        if (iArr14 != null) {
            iArr14[0] = 0;
        }
        int[] iArr15 = this.f15979c;
        if (iArr15 != null) {
            iArr15[2] = 3;
        }
        int[] iArr16 = this.f15978b;
        if (iArr16 != null) {
            iArr16[5] = 2;
        }
        this.f15987k = getIntent().getStringExtra(this.f15983g.replaceAll("hu17kxd", "") + this.f15984h.replaceAll("mkisje", "") + GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
        int[] iArr17 = this.f15978b;
        if (iArr17 != null) {
            iArr17[3] = 9;
        }
        int[] iArr18 = this.f15979c;
        if (iArr18 != null) {
            iArr18[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr19 = this.f15979c;
        if (iArr19 != null) {
            iArr19[9] = 7;
        }
        if (iArr19 != null) {
            iArr19[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length3 = this.f15980d.length();
            if (this.f15978b != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr20 = this.f15978b;
                    if (i5 >= (iArr20.length > 3 ? 3 : iArr20.length)) {
                        break;
                    }
                    iArr20[i5] = 3;
                    i5++;
                }
            }
            this.f15981e = false;
            this.f15980d += length3;
            if (this.f15979c != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr21 = this.f15979c;
                    if (i6 >= (iArr21.length > 3 ? 3 : iArr21.length)) {
                        break;
                    }
                    iArr21[i6] = 5;
                    i6++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList3 = this.f15982f;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr22 = this.f15990n;
        if (iArr22 != null) {
            iArr22[0] = 0;
        }
        int[] iArr23 = this.f15979c;
        if (iArr23 != null) {
            iArr23[2] = 3;
        }
        int[] iArr24 = this.f15978b;
        if (iArr24 != null) {
            iArr24[5] = 2;
        }
        if (TextUtils.isEmpty(this.f15987k)) {
            int[] iArr25 = this.f15978b;
            if (iArr25 != null) {
                iArr25[3] = 9;
            }
            int[] iArr26 = this.f15979c;
            if (iArr26 != null) {
                iArr26[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr27 = this.f15979c;
            if (iArr27 != null) {
                iArr27[9] = 7;
            }
            if (iArr27 != null) {
                iArr27[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length4 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr28 = this.f15978b;
                        if (i7 >= (iArr28.length > 3 ? 3 : iArr28.length)) {
                            break;
                        }
                        iArr28[i7] = 3;
                        i7++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length4;
                if (this.f15979c != null) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr29 = this.f15979c;
                        if (i8 >= (iArr29.length > 3 ? 3 : iArr29.length)) {
                            break;
                        }
                        iArr29[i8] = 5;
                        i8++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList4 = this.f15982f;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr30 = this.f15990n;
            if (iArr30 != null) {
                iArr30[0] = 0;
            }
            int[] iArr31 = this.f15979c;
            if (iArr31 != null) {
                iArr31[2] = 3;
            }
            int[] iArr32 = this.f15978b;
            if (iArr32 != null) {
                iArr32[5] = 2;
            }
            try {
                this.f15988l = new LogoLoadingDialog(this);
                int[] iArr33 = this.f15978b;
                if (iArr33 != null) {
                    iArr33[3] = 9;
                }
                int[] iArr34 = this.f15979c;
                if (iArr34 != null) {
                    iArr34[8] = 0;
                }
                if (this.f15982f == null) {
                    this.f15982f = new ArrayList<>();
                }
                this.f15980d = ";paddingStart";
                this.f15981e = true;
                if (this.f15978b == null) {
                    this.f15978b = new int[10];
                }
                if (this.f15979c == null) {
                    this.f15979c = new int[10];
                }
                this.f15981e = false;
                int[] iArr35 = this.f15979c;
                if (iArr35 != null) {
                    iArr35[9] = 7;
                }
                if (iArr35 != null) {
                    iArr35[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length5 = this.f15980d.length();
                    if (this.f15978b != null) {
                        int i9 = 0;
                        while (true) {
                            int[] iArr36 = this.f15978b;
                            if (i9 >= (iArr36.length > 3 ? 3 : iArr36.length)) {
                                break;
                            }
                            iArr36[i9] = 3;
                            i9++;
                        }
                    }
                    boolean z = this.f15981e;
                    this.f15981e = false;
                    this.f15980d += length5;
                    if (this.f15979c != null) {
                        int i10 = 0;
                        while (true) {
                            int[] iArr37 = this.f15979c;
                            if (i10 >= (iArr37.length > 3 ? 3 : iArr37.length)) {
                                break;
                            }
                            iArr37[i10] = 5;
                            i10++;
                        }
                    }
                    if (this.f15982f.size() < 1) {
                        this.f15982f.add(" than ");
                    }
                    ArrayList<String> arrayList5 = this.f15982f;
                    if (arrayList5 != null && arrayList5.size() > 0) {
                        this.f15982f.remove(0);
                    }
                }
                int[] iArr38 = this.f15990n;
                if (iArr38 != null) {
                    iArr38[0] = 0;
                }
                int[] iArr39 = this.f15979c;
                if (iArr39 != null) {
                    iArr39[2] = 3;
                }
                int[] iArr40 = this.f15978b;
                if (iArr40 != null) {
                    iArr40[5] = 2;
                }
                this.f15988l.m22286a();
                int[] iArr41 = this.f15978b;
                if (iArr41 != null) {
                    iArr41[3] = 9;
                }
                int[] iArr42 = this.f15979c;
                if (iArr42 != null) {
                    iArr42[8] = 0;
                }
                if (this.f15982f == null) {
                    this.f15982f = new ArrayList<>();
                }
                this.f15980d = ";paddingStart";
                this.f15981e = true;
                if (this.f15978b == null) {
                    this.f15978b = new int[10];
                }
                if (this.f15979c == null) {
                    this.f15979c = new int[10];
                }
                this.f15981e = false;
                int[] iArr43 = this.f15979c;
                if (iArr43 != null) {
                    iArr43[9] = 7;
                }
                if (iArr43 != null) {
                    iArr43[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length6 = this.f15980d.length();
                    if (this.f15978b != null) {
                        int i11 = 0;
                        while (true) {
                            int[] iArr44 = this.f15978b;
                            if (i11 >= (iArr44.length > 3 ? 3 : iArr44.length)) {
                                break;
                            }
                            iArr44[i11] = 3;
                            i11++;
                        }
                    }
                    boolean z2 = this.f15981e;
                    this.f15981e = false;
                    this.f15980d += length6;
                    if (this.f15979c != null) {
                        int i12 = 0;
                        while (true) {
                            int[] iArr45 = this.f15979c;
                            if (i12 >= (iArr45.length > 3 ? 3 : iArr45.length)) {
                                break;
                            }
                            iArr45[i12] = 5;
                            i12++;
                        }
                    }
                    if (this.f15982f.size() < 1) {
                        this.f15982f.add(" than ");
                    }
                    ArrayList<String> arrayList6 = this.f15982f;
                    if (arrayList6 != null && arrayList6.size() > 0) {
                        this.f15982f.remove(0);
                    }
                }
                int[] iArr46 = this.f15990n;
                if (iArr46 != null) {
                    iArr46[0] = 0;
                }
                int[] iArr47 = this.f15979c;
                if (iArr47 != null) {
                    iArr47[2] = 3;
                }
                int[] iArr48 = this.f15978b;
                if (iArr48 != null) {
                    iArr48[5] = 2;
                }
                this.f15988l.show();
                int[] iArr49 = this.f15978b;
                if (iArr49 != null) {
                    iArr49[3] = 9;
                }
                int[] iArr50 = this.f15979c;
                if (iArr50 != null) {
                    iArr50[8] = 0;
                }
                if (this.f15982f == null) {
                    this.f15982f = new ArrayList<>();
                }
                this.f15980d = ";paddingStart";
                this.f15981e = true;
                if (this.f15978b == null) {
                    this.f15978b = new int[10];
                }
                if (this.f15979c == null) {
                    this.f15979c = new int[10];
                }
                this.f15981e = false;
                int[] iArr51 = this.f15979c;
                if (iArr51 != null) {
                    iArr51[9] = 7;
                }
                if (iArr51 != null) {
                    iArr51[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length7 = this.f15980d.length();
                    if (this.f15978b != null) {
                        int i13 = 0;
                        while (true) {
                            int[] iArr52 = this.f15978b;
                            if (i13 >= (iArr52.length > 3 ? 3 : iArr52.length)) {
                                break;
                            }
                            iArr52[i13] = 3;
                            i13++;
                        }
                    }
                    boolean z3 = this.f15981e;
                    this.f15981e = false;
                    this.f15980d += length7;
                    if (this.f15979c != null) {
                        int i14 = 0;
                        while (true) {
                            int[] iArr53 = this.f15979c;
                            if (i14 >= (iArr53.length > 3 ? 3 : iArr53.length)) {
                                break;
                            }
                            iArr53[i14] = 5;
                            i14++;
                        }
                    }
                    if (this.f15982f.size() < 1) {
                        this.f15982f.add(" than ");
                    }
                    ArrayList<String> arrayList7 = this.f15982f;
                    if (arrayList7 != null && arrayList7.size() > 0) {
                        this.f15982f.remove(0);
                    }
                }
                int[] iArr54 = this.f15990n;
                if (iArr54 != null) {
                    iArr54[0] = 0;
                }
                int[] iArr55 = this.f15979c;
                if (iArr55 != null) {
                    iArr55[2] = 3;
                }
                int[] iArr56 = this.f15978b;
                if (iArr56 != null) {
                    iArr56[5] = 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            int[] iArr57 = this.f15978b;
            if (iArr57 != null) {
                iArr57[3] = 9;
            }
            int[] iArr58 = this.f15979c;
            if (iArr58 != null) {
                iArr58[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr59 = this.f15979c;
            if (iArr59 != null) {
                iArr59[9] = 7;
            }
            if (iArr59 != null) {
                iArr59[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length8 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i15 = 0;
                    while (true) {
                        int[] iArr60 = this.f15978b;
                        if (i15 >= (iArr60.length > 3 ? 3 : iArr60.length)) {
                            break;
                        }
                        iArr60[i15] = 3;
                        i15++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length8;
                if (this.f15979c != null) {
                    int i16 = 0;
                    while (true) {
                        int[] iArr61 = this.f15979c;
                        if (i16 >= (iArr61.length > 3 ? 3 : iArr61.length)) {
                            break;
                        }
                        iArr61[i16] = 5;
                        i16++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList8 = this.f15982f;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr62 = this.f15990n;
            if (iArr62 != null) {
                iArr62[0] = 0;
            }
            int[] iArr63 = this.f15979c;
            if (iArr63 != null) {
                iArr63[2] = 3;
            }
            int[] iArr64 = this.f15978b;
            if (iArr64 != null) {
                iArr64[5] = 2;
            }
        } else {
            int[] iArr65 = this.f15978b;
            if (iArr65 != null) {
                iArr65[3] = 9;
            }
            int[] iArr66 = this.f15979c;
            if (iArr66 != null) {
                iArr66[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr67 = this.f15979c;
            if (iArr67 != null) {
                iArr67[9] = 7;
            }
            if (iArr67 != null) {
                iArr67[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length9 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i17 = 0;
                    while (true) {
                        int[] iArr68 = this.f15978b;
                        if (i17 >= (iArr68.length > 3 ? 3 : iArr68.length)) {
                            break;
                        }
                        iArr68[i17] = 3;
                        i17++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length9;
                if (this.f15979c != null) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr69 = this.f15979c;
                        if (i18 >= (iArr69.length > 3 ? 3 : iArr69.length)) {
                            break;
                        }
                        iArr69[i18] = 5;
                        i18++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList9 = this.f15982f;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr70 = this.f15990n;
            if (iArr70 != null) {
                iArr70[0] = 0;
            }
            int[] iArr71 = this.f15979c;
            if (iArr71 != null) {
                iArr71[2] = 3;
            }
            int[] iArr72 = this.f15978b;
            if (iArr72 != null) {
                iArr72[5] = 2;
            }
            try {
                this.f15989m = new LogoLoadingDialog2(this);
                int[] iArr73 = this.f15978b;
                if (iArr73 != null) {
                    iArr73[3] = 9;
                }
                int[] iArr74 = this.f15979c;
                if (iArr74 != null) {
                    iArr74[8] = 0;
                }
                if (this.f15982f == null) {
                    this.f15982f = new ArrayList<>();
                }
                this.f15980d = ";paddingStart";
                this.f15981e = true;
                if (this.f15978b == null) {
                    this.f15978b = new int[10];
                }
                if (this.f15979c == null) {
                    this.f15979c = new int[10];
                }
                this.f15981e = false;
                int[] iArr75 = this.f15979c;
                if (iArr75 != null) {
                    iArr75[9] = 7;
                }
                if (iArr75 != null) {
                    iArr75[4] = 1;
                }
                if (!TextUtils.isEmpty(";paddingStart")) {
                    int length10 = this.f15980d.length();
                    if (this.f15978b != null) {
                        int i19 = 0;
                        while (true) {
                            int[] iArr76 = this.f15978b;
                            if (i19 >= (iArr76.length > 3 ? 3 : iArr76.length)) {
                                break;
                            }
                            iArr76[i19] = 3;
                            i19++;
                        }
                    }
                    boolean z4 = this.f15981e;
                    this.f15981e = false;
                    this.f15980d += length10;
                    if (this.f15979c != null) {
                        int i20 = 0;
                        while (true) {
                            int[] iArr77 = this.f15979c;
                            if (i20 >= (iArr77.length > 3 ? 3 : iArr77.length)) {
                                break;
                            }
                            iArr77[i20] = 5;
                            i20++;
                        }
                    }
                    if (this.f15982f.size() < 1) {
                        this.f15982f.add(" than ");
                    }
                    ArrayList<String> arrayList10 = this.f15982f;
                    if (arrayList10 != null && arrayList10.size() > 0) {
                        this.f15982f.remove(0);
                    }
                }
                int[] iArr78 = this.f15990n;
                if (iArr78 != null) {
                    iArr78[0] = 0;
                }
                int[] iArr79 = this.f15979c;
                if (iArr79 != null) {
                    iArr79[2] = 3;
                }
                int[] iArr80 = this.f15978b;
                if (iArr80 != null) {
                    iArr80[5] = 2;
                }
                this.f15989m.show();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            int[] iArr81 = this.f15978b;
            if (iArr81 != null) {
                iArr81[3] = 9;
            }
            int[] iArr82 = this.f15979c;
            if (iArr82 != null) {
                iArr82[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr83 = this.f15979c;
            if (iArr83 != null) {
                iArr83[9] = 7;
            }
            if (iArr83 != null) {
                iArr83[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length11 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i21 = 0;
                    while (true) {
                        int[] iArr84 = this.f15978b;
                        if (i21 >= (iArr84.length > 3 ? 3 : iArr84.length)) {
                            break;
                        }
                        iArr84[i21] = 3;
                        i21++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length11;
                if (this.f15979c != null) {
                    int i22 = 0;
                    while (true) {
                        int[] iArr85 = this.f15979c;
                        if (i22 >= (iArr85.length > 3 ? 3 : iArr85.length)) {
                            break;
                        }
                        iArr85[i22] = 5;
                        i22++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList11 = this.f15982f;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr86 = this.f15990n;
            if (iArr86 != null) {
                iArr86[0] = 0;
            }
            int[] iArr87 = this.f15979c;
            if (iArr87 != null) {
                iArr87[2] = 3;
            }
            int[] iArr88 = this.f15978b;
            if (iArr88 != null) {
                iArr88[5] = 2;
            }
            if (iArr88 != null) {
                iArr88[3] = 9;
            }
            if (iArr87 != null) {
                iArr87[8] = 0;
            }
            if (this.f15982f == null) {
                this.f15982f = new ArrayList<>();
            }
            this.f15980d = ";paddingStart";
            this.f15981e = true;
            if (this.f15978b == null) {
                this.f15978b = new int[10];
            }
            if (this.f15979c == null) {
                this.f15979c = new int[10];
            }
            this.f15981e = false;
            int[] iArr89 = this.f15979c;
            if (iArr89 != null) {
                iArr89[9] = 7;
            }
            if (iArr89 != null) {
                iArr89[4] = 1;
            }
            if (!TextUtils.isEmpty(";paddingStart")) {
                int length12 = this.f15980d.length();
                if (this.f15978b != null) {
                    int i23 = 0;
                    while (true) {
                        int[] iArr90 = this.f15978b;
                        if (i23 >= (iArr90.length > 3 ? 3 : iArr90.length)) {
                            break;
                        }
                        iArr90[i23] = 3;
                        i23++;
                    }
                }
                this.f15981e = false;
                this.f15980d += length12;
                if (this.f15979c != null) {
                    int i24 = 0;
                    while (true) {
                        int[] iArr91 = this.f15979c;
                        if (i24 >= (iArr91.length > 3 ? 3 : iArr91.length)) {
                            break;
                        }
                        iArr91[i24] = 5;
                        i24++;
                    }
                }
                if (this.f15982f.size() < 1) {
                    this.f15982f.add(" than ");
                }
                ArrayList<String> arrayList12 = this.f15982f;
                if (arrayList12 != null && arrayList12.size() > 0) {
                    this.f15982f.remove(0);
                }
            }
            int[] iArr92 = this.f15990n;
            if (iArr92 != null) {
                iArr92[0] = 0;
            }
            int[] iArr93 = this.f15979c;
            if (iArr93 != null) {
                iArr93[2] = 3;
            }
            int[] iArr94 = this.f15978b;
            if (iArr94 != null) {
                iArr94[5] = 2;
            }
        }
        int[] iArr95 = this.f15978b;
        if (iArr95 != null) {
            iArr95[3] = 9;
        }
        int[] iArr96 = this.f15979c;
        if (iArr96 != null) {
            iArr96[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr97 = this.f15979c;
        if (iArr97 != null) {
            iArr97[9] = 7;
        }
        if (iArr97 != null) {
            iArr97[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length13 = this.f15980d.length();
            if (this.f15978b != null) {
                int i25 = 0;
                while (true) {
                    int[] iArr98 = this.f15978b;
                    if (i25 >= (iArr98.length > 3 ? 3 : iArr98.length)) {
                        break;
                    }
                    iArr98[i25] = 3;
                    i25++;
                }
            }
            this.f15981e = false;
            this.f15980d += length13;
            if (this.f15979c != null) {
                int i26 = 0;
                while (true) {
                    int[] iArr99 = this.f15979c;
                    if (i26 >= (iArr99.length > 3 ? 3 : iArr99.length)) {
                        break;
                    }
                    iArr99[i26] = 5;
                    i26++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList13 = this.f15982f;
            if (arrayList13 != null && arrayList13.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr100 = this.f15990n;
        if (iArr100 != null) {
            iArr100[0] = 0;
        }
        int[] iArr101 = this.f15979c;
        if (iArr101 != null) {
            iArr101[2] = 3;
        }
        int[] iArr102 = this.f15978b;
        if (iArr102 != null) {
            iArr102[5] = 2;
        }
        AppLovinSdk.getInstance(this).setMediationProvider("max");
        int[] iArr103 = this.f15978b;
        if (iArr103 != null) {
            iArr103[3] = 9;
        }
        int[] iArr104 = this.f15979c;
        if (iArr104 != null) {
            iArr104[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr105 = this.f15979c;
        if (iArr105 != null) {
            iArr105[9] = 7;
        }
        if (iArr105 != null) {
            iArr105[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length14 = this.f15980d.length();
            if (this.f15978b != null) {
                int i27 = 0;
                while (true) {
                    int[] iArr106 = this.f15978b;
                    if (i27 >= (iArr106.length > 3 ? 3 : iArr106.length)) {
                        break;
                    }
                    iArr106[i27] = 3;
                    i27++;
                }
            }
            this.f15981e = false;
            this.f15980d += length14;
            if (this.f15979c != null) {
                int i28 = 0;
                while (true) {
                    int[] iArr107 = this.f15979c;
                    if (i28 >= (iArr107.length > 3 ? 3 : iArr107.length)) {
                        break;
                    }
                    iArr107[i28] = 5;
                    i28++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList14 = this.f15982f;
            if (arrayList14 != null && arrayList14.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr108 = this.f15990n;
        if (iArr108 != null) {
            iArr108[0] = 0;
        }
        int[] iArr109 = this.f15979c;
        if (iArr109 != null) {
            iArr109[2] = 3;
        }
        int[] iArr110 = this.f15978b;
        if (iArr110 != null) {
            iArr110[5] = 2;
        }
        if (iArr110 != null) {
            iArr110[3] = 9;
        }
        if (iArr109 != null) {
            iArr109[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr111 = this.f15979c;
        if (iArr111 != null) {
            iArr111[9] = 7;
        }
        if (iArr111 != null) {
            iArr111[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length15 = this.f15980d.length();
            if (this.f15978b != null) {
                int i29 = 0;
                while (true) {
                    int[] iArr112 = this.f15978b;
                    if (i29 >= (iArr112.length > 3 ? 3 : iArr112.length)) {
                        break;
                    }
                    iArr112[i29] = 3;
                    i29++;
                }
            }
            this.f15981e = false;
            this.f15980d += length15;
            if (this.f15979c != null) {
                int i30 = 0;
                while (true) {
                    int[] iArr113 = this.f15979c;
                    if (i30 >= (iArr113.length > 3 ? 3 : iArr113.length)) {
                        break;
                    }
                    iArr113[i30] = 5;
                    i30++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList15 = this.f15982f;
            if (arrayList15 != null && arrayList15.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr114 = this.f15990n;
        if (iArr114 != null) {
            iArr114[0] = 0;
        }
        int[] iArr115 = this.f15979c;
        if (iArr115 != null) {
            iArr115[2] = 3;
        }
        int[] iArr116 = this.f15978b;
        if (iArr116 != null) {
            iArr116[5] = 2;
        }
        AppLovinSdk.initializeSdk(this, new AppLovinSdk.SdkInitializationListener() { // from class: gi
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                LogoSettingsActivity.this.m9142e(appLovinSdkConfiguration);
            }
        });
        int[] iArr117 = this.f15978b;
        if (iArr117 != null) {
            iArr117[3] = 9;
        }
        int[] iArr118 = this.f15979c;
        if (iArr118 != null) {
            iArr118[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr119 = this.f15979c;
        if (iArr119 != null) {
            iArr119[9] = 7;
        }
        if (iArr119 != null) {
            iArr119[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length16 = this.f15980d.length();
            if (this.f15978b != null) {
                int i31 = 0;
                while (true) {
                    int[] iArr120 = this.f15978b;
                    if (i31 >= (iArr120.length > 3 ? 3 : iArr120.length)) {
                        break;
                    }
                    iArr120[i31] = 3;
                    i31++;
                }
            }
            this.f15981e = false;
            this.f15980d += length16;
            if (this.f15979c != null) {
                int i32 = 0;
                while (true) {
                    int[] iArr121 = this.f15979c;
                    if (i32 >= (iArr121.length > 3 ? 3 : iArr121.length)) {
                        break;
                    }
                    iArr121[i32] = 5;
                    i32++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList16 = this.f15982f;
            if (arrayList16 != null && arrayList16.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr122 = this.f15990n;
        if (iArr122 != null) {
            iArr122[0] = 0;
        }
        int[] iArr123 = this.f15979c;
        if (iArr123 != null) {
            iArr123[2] = 3;
        }
        int[] iArr124 = this.f15978b;
        if (iArr124 != null) {
            iArr124[5] = 2;
        }
        if (iArr124 != null) {
            iArr124[3] = 9;
        }
        if (iArr123 != null) {
            iArr123[8] = 0;
        }
        if (this.f15982f == null) {
            this.f15982f = new ArrayList<>();
        }
        this.f15980d = ";paddingStart";
        this.f15981e = true;
        if (this.f15978b == null) {
            this.f15978b = new int[10];
        }
        if (this.f15979c == null) {
            this.f15979c = new int[10];
        }
        this.f15981e = false;
        int[] iArr125 = this.f15979c;
        if (iArr125 != null) {
            iArr125[9] = 7;
        }
        if (iArr125 != null) {
            iArr125[4] = 1;
        }
        if (!TextUtils.isEmpty(";paddingStart")) {
            int length17 = this.f15980d.length();
            if (this.f15978b != null) {
                int i33 = 0;
                while (true) {
                    int[] iArr126 = this.f15978b;
                    if (i33 >= (iArr126.length > 3 ? 3 : iArr126.length)) {
                        break;
                    }
                    iArr126[i33] = 3;
                    i33++;
                }
            }
            this.f15981e = false;
            this.f15980d += length17;
            if (this.f15979c != null) {
                int i34 = 0;
                while (true) {
                    int[] iArr127 = this.f15979c;
                    if (i34 >= (iArr127.length > 3 ? 3 : iArr127.length)) {
                        break;
                    }
                    iArr127[i34] = 5;
                    i34++;
                }
            }
            if (this.f15982f.size() < 1) {
                this.f15982f.add(" than ");
            }
            ArrayList<String> arrayList17 = this.f15982f;
            if (arrayList17 != null && arrayList17.size() > 0) {
                this.f15982f.remove(0);
            }
        }
        int[] iArr128 = this.f15990n;
        if (iArr128 != null) {
            iArr128[0] = 0;
        }
        int[] iArr129 = this.f15979c;
        if (iArr129 != null) {
            iArr129[2] = 3;
        }
        int[] iArr130 = this.f15978b;
        if (iArr130 != null) {
            iArr130[5] = 2;
        }
    }
}
