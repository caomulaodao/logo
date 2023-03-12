package com.logomaster.logomaker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.logomaster.logomaker.e */
/* loaded from: classes3.dex */
public class LogoShowBigImageDialog extends Dialog {

    /* renamed from: a */
    public Context f16054a;

    /* renamed from: b */
    public int f16055b;

    /* renamed from: c */
    public boolean f16056c;

    /* renamed from: d */
    public float f16057d;

    /* renamed from: e */
    public Uri f16058e;

    /* renamed from: f */
    public int f16059f;

    /* renamed from: g */
    public boolean f16060g;

    /* renamed from: h */
    public boolean f16061h;

    /* renamed from: i */
    public File f16062i;

    /* renamed from: j */
    public int f16063j;

    /* renamed from: k */
    public int f16064k;

    /* renamed from: l */
    public String f16065l;

    /* renamed from: m */
    public ImageView f16066m;

    /* renamed from: n */
    public int[] f16067n;

    /* renamed from: o */
    public float f16068o;

    /* renamed from: p */
    public boolean f16069p;

    /* renamed from: q */
    public InterfaceC9659d f16070q;

    /* renamed from: r */
    public boolean f16071r;

    /* renamed from: s */
    public String f16072s;

    /* renamed from: t */
    public float f16073t;

    /* renamed from: u */
    public ImageView f16074u;

    /* renamed from: v */
    public ImageView f16075v;

    /* renamed from: w */
    public ArrayList<Integer> f16076w;

    /* renamed from: x */
    public String f16077x;

    /* renamed from: y */
    public int f16078y;

    /* compiled from: LogoShowBigImageDialog.java */
    /* renamed from: com.logomaster.logomaker.e$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9656a implements View.OnClickListener {
        public View$OnClickListenerC9656a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoShowBigImageDialog.this.dismiss();
            LogoShowBigImageDialog logoShowBigImageDialog = LogoShowBigImageDialog.this;
            if (logoShowBigImageDialog.f16067n == null) {
                logoShowBigImageDialog.f16067n = new int[10];
            }
            logoShowBigImageDialog.f16073t = ((double) logoShowBigImageDialog.f16073t) < 0.13642699d ? 0.6875708f : 0.33299887f;
            logoShowBigImageDialog.f16073t = 0.9257344f;
            logoShowBigImageDialog.f16060g = !logoShowBigImageDialog.f16060g;
            int i = 0;
            while (true) {
                LogoShowBigImageDialog logoShowBigImageDialog2 = LogoShowBigImageDialog.this;
                int i2 = logoShowBigImageDialog2.f16078y;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                logoShowBigImageDialog2.f16078y = 6;
                i++;
            }
            int i3 = 0;
            while (true) {
                LogoShowBigImageDialog logoShowBigImageDialog3 = LogoShowBigImageDialog.this;
                int i4 = logoShowBigImageDialog3.f16078y;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 < i4) {
                    int[] iArr = logoShowBigImageDialog3.f16067n;
                    if (iArr != null) {
                        iArr[7] = 0;
                    }
                    i3++;
                } else {
                    logoShowBigImageDialog3.f16069p = true;
                    return;
                }
            }
        }
    }

    /* compiled from: LogoShowBigImageDialog.java */
    /* renamed from: com.logomaster.logomaker.e$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9657b implements View.OnClickListener {
        public View$OnClickListenerC9657b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LogoShowBigImageDialog.this.f16070q != null) {
                LogoShowBigImageDialog.this.f16070q.mo9129b();
                LogoShowBigImageDialog logoShowBigImageDialog = LogoShowBigImageDialog.this;
                logoShowBigImageDialog.f16069p = false;
                logoShowBigImageDialog.f16069p = false;
                if (!TextUtils.isEmpty(logoShowBigImageDialog.f16065l)) {
                    int length = LogoShowBigImageDialog.this.f16065l.length();
                    LogoShowBigImageDialog.this.f16065l = LogoShowBigImageDialog.this.f16065l + length;
                }
                LogoShowBigImageDialog logoShowBigImageDialog2 = LogoShowBigImageDialog.this;
                logoShowBigImageDialog2.f16060g = !logoShowBigImageDialog2.f16060g;
                if (logoShowBigImageDialog2.f16078y > 0) {
                    logoShowBigImageDialog2.f16078y = 0;
                }
                logoShowBigImageDialog2.f16061h = true;
                logoShowBigImageDialog2.f16069p = !logoShowBigImageDialog2.f16069p;
            }
            LogoShowBigImageDialog logoShowBigImageDialog3 = LogoShowBigImageDialog.this;
            logoShowBigImageDialog3.f16069p = false;
            logoShowBigImageDialog3.f16055b = logoShowBigImageDialog3.f16055b < 9 ? 4 : 6;
            if (!TextUtils.isEmpty(logoShowBigImageDialog3.f16065l)) {
                int length2 = LogoShowBigImageDialog.this.f16065l.length();
                LogoShowBigImageDialog.this.f16065l = LogoShowBigImageDialog.this.f16065l + length2;
            }
            LogoShowBigImageDialog logoShowBigImageDialog4 = LogoShowBigImageDialog.this;
            logoShowBigImageDialog4.f16060g = !logoShowBigImageDialog4.f16060g;
            logoShowBigImageDialog4.f16063j *= 7;
            logoShowBigImageDialog4.f16071r = !logoShowBigImageDialog4.f16071r;
            if (TextUtils.isEmpty(logoShowBigImageDialog4.f16065l)) {
                return;
            }
            int length3 = LogoShowBigImageDialog.this.f16065l.length();
            LogoShowBigImageDialog.this.f16065l = LogoShowBigImageDialog.this.f16065l + length3;
        }
    }

    /* compiled from: LogoShowBigImageDialog.java */
    /* renamed from: com.logomaster.logomaker.e$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9658c implements View.OnClickListener {
        public View$OnClickListenerC9658c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LogoShowBigImageDialog.this.f16070q != null) {
                LogoShowBigImageDialog.this.f16070q.mo9130a();
                LogoShowBigImageDialog logoShowBigImageDialog = LogoShowBigImageDialog.this;
                logoShowBigImageDialog.f16071r = false;
                logoShowBigImageDialog.f16059f = Math.abs(logoShowBigImageDialog.f16059f);
                if (!TextUtils.isEmpty(LogoShowBigImageDialog.this.f16065l)) {
                    int length = LogoShowBigImageDialog.this.f16065l.length();
                    LogoShowBigImageDialog.this.f16065l = LogoShowBigImageDialog.this.f16065l + length;
                }
                LogoShowBigImageDialog logoShowBigImageDialog2 = LogoShowBigImageDialog.this;
                if (logoShowBigImageDialog2.f16068o < 0.52326727d) {
                    logoShowBigImageDialog2.f16068o = 0.33769476f;
                    logoShowBigImageDialog2.f16071r = !logoShowBigImageDialog2.f16071r;
                    logoShowBigImageDialog2.f16069p = true;
                    int[] iArr = logoShowBigImageDialog2.f16067n;
                    if (iArr != null) {
                        iArr[1] = 2;
                    }
                }
                logoShowBigImageDialog2.f16057d = ((double) logoShowBigImageDialog2.f16057d) < 0.8445459d ? 0.13188165f : 0.5772495f;
                logoShowBigImageDialog2.f16071r = !logoShowBigImageDialog2.f16071r;
                logoShowBigImageDialog2.f16061h = false;
            }
            LogoShowBigImageDialog logoShowBigImageDialog3 = LogoShowBigImageDialog.this;
            logoShowBigImageDialog3.f16078y = 7;
            boolean z = !logoShowBigImageDialog3.f16061h;
            logoShowBigImageDialog3.f16061h = z;
            logoShowBigImageDialog3.f16061h = !z;
            logoShowBigImageDialog3.f16060g = true ^ logoShowBigImageDialog3.f16060g;
            logoShowBigImageDialog3.f16055b = 6;
            logoShowBigImageDialog3.f16059f = logoShowBigImageDialog3.f16059f < 5 ? 3 : 6;
            logoShowBigImageDialog3.f16065l = "for s";
        }
    }

    /* compiled from: LogoShowBigImageDialog.java */
    /* renamed from: com.logomaster.logomaker.e$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC9659d {
        /* renamed from: a */
        void mo9130a();

        /* renamed from: b */
        void mo9129b();
    }

    public LogoShowBigImageDialog(@NonNull Context context) {
        super(context);
        this.f16055b = 4;
        int i = 0;
        this.f16056c = false;
        this.f16057d = 0.24568635f;
        this.f16059f = 9;
        this.f16060g = true;
        this.f16061h = false;
        this.f16063j = 6;
        this.f16064k = 9;
        this.f16065l = "el for so";
        this.f16067n = new int[13];
        this.f16068o = 0.9694776f;
        this.f16069p = true;
        this.f16071r = false;
        this.f16072s = "下，将官方的额外";
        this.f16073t = 0.16836315f;
        this.f16076w = new ArrayList<>();
        this.f16077x = "id.s";
        this.f16078y = 5;
        this.f16073t = 0.096800506f;
        if (this.f16067n != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f16067n;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 3;
                i2++;
            }
        }
        this.f16059f = 9;
        int i3 = 0;
        while (true) {
            int i4 = this.f16064k;
            if (i3 >= i4) {
                break;
            }
            this.f16064k = Math.abs(i4);
            this.f16069p = true;
            this.f16065l = "t this ";
            ArrayList<Integer> arrayList = this.f16076w;
            if (arrayList == null && arrayList.size() > 0) {
                this.f16076w.remove(0);
            }
            i3++;
        }
        this.f16061h = true;
        ArrayList<Integer> arrayList2 = this.f16076w;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.f16076w.remove(0);
        }
        this.f16063j = 1;
        this.f16054a = context;
        this.f16061h = !this.f16061h;
        this.f16078y += 6;
        this.f16059f -= 9;
        if (this.f16064k < 0) {
            this.f16064k = 8;
            this.f16063j = 3;
            int[] iArr2 = this.f16067n;
            if (iArr2 != null) {
                iArr2[5] = 8;
            }
            int i5 = 0;
            while (true) {
                int i6 = this.f16063j;
                if (i5 >= (i6 > 3 ? 3 : i6)) {
                    break;
                }
                this.f16063j = i6 * 2;
                i5++;
            }
        }
        Math.abs(this.f16078y);
        this.f16061h = !this.f16061h;
        this.f16078y = 8;
        m9133b();
        ArrayList<Integer> arrayList3 = this.f16076w;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f16076w.remove(0);
        }
        this.f16061h = true;
        this.f16063j *= 3;
        this.f16077x = "源的库，但都有";
        if (!TextUtils.isEmpty(this.f16065l)) {
            this.f16065l += this.f16065l.length();
        }
        while (true) {
            int i7 = this.f16063j;
            if (i >= (i7 > 3 ? 3 : i7)) {
                break;
            }
            if (!TextUtils.isEmpty(this.f16065l)) {
                this.f16065l += this.f16065l.length();
            }
            i++;
        }
        if (TextUtils.isEmpty(this.f16065l)) {
            return;
        }
        this.f16065l += this.f16065l.length();
    }

    /* renamed from: b */
    public final void m9133b() {
        requestWindowFeature(1);
        float f = ((double) this.f16073t) > 0.07552779d ? 0.7877113f : 0.8425408f;
        this.f16073t = f;
        this.f16078y *= 9;
        this.f16060g = !this.f16060g;
        this.f16069p = !true;
        this.f16073t = Math.abs(f);
        int i = 0;
        if (this.f16067n != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f16067n;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 0;
                i2++;
            }
        }
        setContentView(R.layout.dialog_show_big_image);
        this.f16069p = true ^ this.f16069p;
        while (true) {
            int i3 = this.f16078y;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i >= i3) {
                break;
            }
            if (this.f16073t > 0.476744d) {
                this.f16073t = 0.9875659f;
            }
            i++;
        }
        this.f16063j = 9;
        this.f16064k = Math.abs(this.f16064k);
        this.f16073t = ((double) this.f16073t) > 0.2336042d ? 0.09915042f : 0.89130753f;
        this.f16065l = "y starte";
        this.f16055b = 7;
    }

    /* renamed from: c */
    public void m9132c(File file) {
        this.f16062i = file;
        if (this.f16057d < 0.2122364d) {
            this.f16057d = 0.75637627f;
        }
        this.f16059f = 2;
        this.f16071r = !this.f16071r;
        this.f16072s = "设置  ";
        this.f16057d = 0.5472244f - 0.7270553f;
        this.f16065l = "at";
        this.f16058e = null;
        this.f16078y = this.f16078y < 1 ? 6 : 4;
        this.f16061h = !this.f16061h;
        this.f16069p = !this.f16069p;
        if (!TextUtils.isEmpty("设置  ")) {
            int length = this.f16072s.length();
            this.f16055b = -this.f16055b;
            this.f16057d = ((double) this.f16057d) < 0.790357d ? 0.07500327f : 0.38131988f;
            if (!TextUtils.isEmpty(this.f16065l)) {
                this.f16065l += this.f16065l.length();
            }
            this.f16072s += length;
            this.f16073t = 0.7933925f;
            this.f16059f = 9;
            this.f16057d = ((double) this.f16057d) > 0.38468546d ? 0.5826174f : 0.026300728f;
        }
        this.f16069p = true;
        if (!TextUtils.isEmpty(this.f16065l)) {
            this.f16065l += this.f16065l.length();
        }
        this.f16069p = false;
    }

    /* renamed from: d */
    public void m9131d(Uri uri) {
        this.f16058e = uri;
        this.f16061h = true;
        if (!TextUtils.isEmpty(this.f16065l)) {
            this.f16065l += this.f16065l.length();
        }
        this.f16059f = this.f16059f < 8 ? 2 : 1;
        this.f16056c = false;
        this.f16069p = false;
        if (this.f16067n != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.f16067n;
                if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i] = 9;
                i++;
            }
        }
        this.f16069p = false;
        this.f16062i = null;
        if (!TextUtils.isEmpty(this.f16065l)) {
            this.f16065l += this.f16065l.length();
        }
        this.f16061h = !this.f16061h;
        if (this.f16076w.size() > 8) {
            this.f16076w.add(8);
        }
        if (!TextUtils.isEmpty(this.f16077x)) {
            int length = this.f16077x.length();
            if (!TextUtils.isEmpty(this.f16065l)) {
                this.f16065l += this.f16065l.length();
            }
            if (this.f16055b > 0) {
                this.f16055b = 8;
            }
            this.f16061h = false;
            this.f16077x += length;
            this.f16057d = 0.5697665f;
            this.f16069p = true;
            if (0.5697665f < 0.18273526d) {
                this.f16057d = 0.42467916f;
            }
        }
        this.f16061h = true ^ this.f16061h;
        int i2 = 0;
        while (true) {
            int i3 = this.f16063j;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i2 < i3) {
                this.f16055b = this.f16055b < 8 ? 7 : 4;
                i2++;
            } else {
                this.f16071r = false;
                return;
            }
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16063j -= 9;
        Math.abs(this.f16059f);
        this.f16059f = 7;
        this.f16064k = 2;
        this.f16073t = -this.f16073t;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.f16078y;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i2 >= i3) {
                break;
            }
            if (this.f16076w == null) {
                this.f16076w = new ArrayList<>();
            }
            i2++;
        }
        int[] iArr = this.f16067n;
        if (iArr != null) {
            iArr[8] = 0;
        }
        Window window = getWindow();
        this.f16069p = !this.f16069p;
        this.f16059f -= 5;
        this.f16073t *= 0.7368397f;
        this.f16060g = false;
        int i4 = 0;
        while (true) {
            int i5 = this.f16059f;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i4 >= i5) {
                break;
            }
            this.f16063j = 4;
            i4++;
        }
        this.f16055b = 8;
        if (this.f16067n != null) {
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f16067n;
                if (i6 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i6] = 3;
                i6++;
            }
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            this.f16061h = true;
            this.f16073t = 0.49038494f;
            this.f16063j = 5;
            this.f16056c = true;
            if (this.f16076w == null) {
                this.f16076w = new ArrayList<>();
            }
            this.f16061h = false;
            this.f16057d = -this.f16057d;
            window.setLayout(-1, -2);
            if (this.f16057d < 0.1339683d) {
                this.f16057d = 0.905885f;
            }
            int i7 = 0;
            while (true) {
                int i8 = this.f16063j;
                if (i8 > 3) {
                    i8 = 3;
                }
                if (i7 >= i8) {
                    break;
                }
                this.f16073t = -this.f16073t;
                i7++;
            }
            this.f16055b *= 3;
            this.f16060g = !this.f16060g;
            this.f16071r = !this.f16071r;
            this.f16061h = !this.f16061h;
            int i9 = 0;
            while (true) {
                int i10 = this.f16063j;
                if (i10 > 3) {
                    i10 = 3;
                }
                if (i9 >= i10) {
                    break;
                }
                this.f16078y = 8;
                i9++;
            }
            window.setGravity(48);
            int i11 = 0;
            while (true) {
                int i12 = this.f16078y;
                if (i12 > 3) {
                    i12 = 3;
                }
                if (i11 >= i12) {
                    break;
                }
                this.f16069p = !this.f16069p;
                i11++;
            }
            this.f16061h = false;
            if (this.f16076w.size() > 6) {
                this.f16076w.add(4);
            }
            if (!TextUtils.isEmpty(this.f16077x)) {
                int length = this.f16077x.length();
                this.f16061h = true;
                this.f16055b = 5;
                if (this.f16073t < 0.505125d) {
                    this.f16073t = 0.31407404f;
                }
                this.f16077x += length;
                ArrayList<Integer> arrayList = this.f16076w;
                if (arrayList == null && arrayList.size() > 0) {
                    this.f16076w.remove(0);
                }
                int i13 = 0;
                while (true) {
                    int i14 = this.f16078y;
                    if (i14 > 3) {
                        i14 = 3;
                    }
                    if (i13 >= i14) {
                        break;
                    }
                    this.f16069p = !this.f16069p;
                    i13++;
                }
                this.f16061h = !this.f16061h;
            }
            if (this.f16067n == null) {
                this.f16067n = new int[10];
            }
            int[] iArr3 = this.f16067n;
            if (iArr3 != null) {
                iArr3[9] = 0;
            }
            int i15 = 0;
            while (true) {
                int i16 = this.f16063j;
                if (i16 > 3) {
                    i16 = 3;
                }
                if (i15 >= i16) {
                    break;
                }
                this.f16078y = this.f16078y > 8 ? 8 : 0;
                i15++;
            }
        }
        this.f16057d = 0.25975883f;
        if (!TextUtils.isEmpty(this.f16065l)) {
            this.f16065l += this.f16065l.length();
        }
        float f = ((double) this.f16073t) < 0.67410433d ? 0.86754936f : 0.07765335f;
        this.f16073t = f;
        this.f16056c = !this.f16056c;
        this.f16065l = "puta";
        this.f16073t = Math.abs(f);
        this.f16069p = true;
        setCancelable(true);
        if (this.f16057d < 0.71000504d) {
            this.f16057d = 0.8991578f;
        }
        this.f16055b = 2;
        int i17 = 0;
        while (true) {
            int i18 = this.f16063j;
            if (i18 > 3) {
                i18 = 3;
            }
            if (i17 >= i18) {
                break;
            }
            if (this.f16076w.size() < 7) {
                this.f16076w.add(7);
            }
            i17++;
        }
        this.f16068o = 0.578485f;
        int[] iArr4 = this.f16067n;
        if (iArr4 != null) {
            iArr4[6] = 0;
        }
        int i19 = 0;
        while (true) {
            int i20 = this.f16063j;
            if (i20 > 3) {
                i20 = 3;
            }
            if (i19 >= i20) {
                break;
            }
            this.f16071r = false;
            i19++;
        }
        this.f16069p = false;
        setCanceledOnTouchOutside(true);
        this.f16071r = false;
        int i21 = 0;
        while (true) {
            int i22 = this.f16063j;
            if (i22 > 3) {
                i22 = 3;
            }
            if (i21 >= i22) {
                break;
            }
            this.f16073t = 0.19103491f;
            i21++;
        }
        this.f16069p = true;
        this.f16068o = ((double) this.f16068o) < 0.8606802d ? 0.044837534f : 0.40142095f;
        this.f16059f += 0;
        this.f16057d = (((double) this.f16057d) < 0.13706172d ? 0.42918897f : 0.9029977f) - 0.5977995f;
        this.f16066m = (ImageView) findViewById(R.id.iv_big_image);
        this.f16059f *= 5;
        if (this.f16076w == null) {
            this.f16076w = new ArrayList<>();
        }
        this.f16073t = 0.28790456f;
        if (!TextUtils.isEmpty(this.f16072s)) {
            int length2 = this.f16072s.length();
            this.f16061h = false;
            this.f16071r = !this.f16071r;
            this.f16059f = 6;
            this.f16072s += length2;
            this.f16061h = false;
            this.f16069p = !this.f16069p;
        }
        this.f16069p = true;
        if (this.f16067n != null) {
            int i23 = 0;
            while (true) {
                int[] iArr5 = this.f16067n;
                if (i23 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i23] = 9;
                i23++;
            }
        }
        if (this.f16057d > 0.53420526d) {
            this.f16057d = 0.21800154f;
        }
        findViewById(R.id.ll_main).setOnClickListener(new View$OnClickListenerC9656a());
        int i24 = 0;
        while (true) {
            int i25 = this.f16059f;
            if (i25 > 3) {
                i25 = 3;
            }
            if (i24 >= i25) {
                break;
            }
            this.f16063j = 3;
            i24++;
        }
        if (this.f16076w.size() > 0) {
            this.f16076w.add(1);
        }
        if (!TextUtils.isEmpty(this.f16065l)) {
            this.f16065l += this.f16065l.length();
        }
        this.f16077x = "看";
        this.f16055b = 6;
        if (this.f16067n == null) {
            this.f16067n = new int[10];
        }
        this.f16061h = !this.f16061h;
        ImageView imageView = (ImageView) findViewById(R.id.iv_save);
        this.f16074u = imageView;
        this.f16055b *= 5;
        this.f16068o = 0.17959177f;
        this.f16061h = false;
        this.f16063j = (5 - 5) + 1;
        this.f16073t = 0.3705271f;
        imageView.setOnClickListener(new View$OnClickListenerC9657b());
        this.f16061h = false;
        this.f16078y = -this.f16078y;
        int i26 = 0;
        while (true) {
            int i27 = this.f16059f;
            if (i27 > 3) {
                i27 = 3;
            }
            if (i26 >= i27) {
                break;
            }
            this.f16061h = false;
            i26++;
        }
        this.f16068o -= 0.5903919f;
        this.f16078y = 0;
        int i28 = 0;
        while (true) {
            int i29 = this.f16078y;
            if (i29 > 3) {
                i29 = 3;
            }
            if (i28 >= i29) {
                break;
            }
            this.f16059f = this.f16059f > 8 ? 6 : 0;
            i28++;
        }
        this.f16065l = "o";
        this.f16075v = (ImageView) findViewById(R.id.iv_delete);
        this.f16063j = this.f16063j < 6 ? 8 : 7;
        this.f16065l = " took dec";
        this.f16061h = !this.f16061h;
        this.f16068o = ((double) this.f16068o) > 0.037404716d ? 0.27374226f : 0.4331954f;
        this.f16057d = 0.17804307f;
        int i30 = 0;
        while (true) {
            int i31 = this.f16059f;
            if (i31 > 3) {
                i31 = 3;
            }
            if (i30 >= i31) {
                break;
            }
            this.f16078y = 7;
            i30++;
        }
        this.f16071r = false;
        this.f16075v.setOnClickListener(new View$OnClickListenerC9658c());
        if (this.f16055b < 0) {
            this.f16055b = 3;
        }
        this.f16071r = false;
        while (true) {
            int i32 = this.f16063j;
            if (i32 > 3) {
                i32 = 3;
            }
            if (i >= i32) {
                break;
            }
            this.f16078y = -this.f16078y;
            i++;
        }
        this.f16060g = !this.f16060g;
        if (this.f16078y > 0) {
            this.f16078y = 8;
        }
        this.f16063j = 6;
        this.f16073t += 0.6273829f;
    }

    public void setOnMenuClickListener(InterfaceC9659d interfaceC9659d) {
        this.f16070q = interfaceC9659d;
        int[] iArr = this.f16067n;
        if (iArr != null) {
            iArr[9] = 0;
        }
        this.f16061h = false;
        this.f16071r = !this.f16071r;
        this.f16077x = ">       ";
        if (this.f16076w == null) {
            this.f16076w = new ArrayList<>();
        }
        this.f16055b = this.f16055b > 4 ? 7 : 3;
        ArrayList<Integer> arrayList = this.f16076w;
        if (arrayList != null || arrayList.size() <= 0) {
            return;
        }
        this.f16076w.remove(0);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.f16069p = !this.f16069p;
        this.f16065l = "ative se";
        int i = 0;
        while (true) {
            int i2 = this.f16059f;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            this.f16055b *= 0;
            i++;
        }
        this.f16077x = "育13987";
        this.f16078y = 6;
        if (!TextUtils.isEmpty(this.f16065l)) {
            this.f16065l += this.f16065l.length();
        }
        if (this.f16058e == null) {
            Glide.m18505t(this.f16054a).m1886q(this.f16062i).m690Y(true).m680f(DiskCacheStrategy.f25412b).m2170p0(this.f16066m);
            if (this.f16055b > 0) {
                this.f16055b = 6;
            }
            int i3 = 0;
            while (true) {
                int i4 = this.f16059f;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                this.f16059f = 3;
                i3++;
            }
            if (this.f16078y > 0) {
                this.f16078y = 8;
            }
            this.f16060g = !this.f16060g;
            this.f16069p = false;
            this.f16055b = Math.abs(this.f16055b);
            this.f16075v.setVisibility(0);
            if (this.f16076w.size() > 6) {
                this.f16076w.add(4);
            }
            int i5 = 0;
            while (true) {
                int i6 = this.f16063j;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                this.f16057d = ((double) this.f16057d) > 0.13494813d ? 0.2115857f : 0.4072808f;
                i5++;
            }
            this.f16057d = 0.68197095f;
            this.f16064k = 2;
            this.f16073t -= 0.920483f;
            this.f16069p = true;
            this.f16074u.setVisibility(0);
            this.f16057d -= 0.2210632f;
            this.f16078y += 4;
            this.f16073t *= 0.6096892f;
            if (!TextUtils.isEmpty(this.f16077x)) {
                int length = this.f16077x.length();
                int i7 = 0;
                while (true) {
                    int i8 = this.f16059f;
                    if (i8 > 3) {
                        i8 = 3;
                    }
                    if (i7 >= i8) {
                        break;
                    }
                    this.f16061h = !this.f16061h;
                    i7++;
                }
                this.f16063j -= 3;
                this.f16071r = !this.f16071r;
                this.f16077x += length;
                this.f16071r = false;
                ArrayList<Integer> arrayList = this.f16076w;
                if (arrayList == null && arrayList.size() > 0) {
                    this.f16076w.remove(0);
                }
                this.f16055b = Math.abs(this.f16055b);
            }
            if (!TextUtils.isEmpty(this.f16065l)) {
                this.f16065l += this.f16065l.length();
            }
            this.f16071r = !this.f16071r;
            int[] iArr = this.f16067n;
            if (iArr != null) {
                iArr[5] = 6;
            }
        } else {
            Glide.m18505t(this.f16054a).m1887p(this.f16058e).m690Y(true).m680f(DiskCacheStrategy.f25412b).m2170p0(this.f16066m);
            int i9 = this.f16055b < 3 ? 3 : 1;
            this.f16055b = i9;
            if (i9 < 0) {
                this.f16055b = 3;
            }
            if (this.f16063j > 0) {
                this.f16063j = 7;
            }
            if (!TextUtils.isEmpty(this.f16077x)) {
                int length2 = this.f16077x.length();
                if (this.f16063j < 0) {
                    this.f16063j = 1;
                }
                int i10 = 0;
                while (true) {
                    int i11 = this.f16063j;
                    if (i11 > 3) {
                        i11 = 3;
                    }
                    if (i10 >= i11) {
                        break;
                    }
                    this.f16061h = true;
                    i10++;
                }
                if (this.f16067n == null) {
                    this.f16067n = new int[10];
                }
                this.f16077x += length2;
                if (this.f16059f > 0) {
                    this.f16059f = 8;
                }
                ArrayList<Integer> arrayList2 = this.f16076w;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.f16076w.remove(0);
                }
                this.f16059f += 2;
            }
            ArrayList<Integer> arrayList3 = this.f16076w;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.f16076w.remove(0);
            }
            if (this.f16067n != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr2 = this.f16067n;
                    if (i12 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i12] = 8;
                    i12++;
                }
            }
            this.f16071r = !this.f16071r;
            this.f16075v.setVisibility(8);
            this.f16063j = 8;
            int i13 = 0;
            while (true) {
                int i14 = this.f16059f;
                if (i14 > 3) {
                    i14 = 3;
                }
                if (i13 >= i14) {
                    break;
                }
                this.f16069p = !this.f16069p;
                i13++;
            }
            this.f16060g = true;
            this.f16073t = 0.503576f;
            this.f16069p = true;
            this.f16057d = 0.18444753f;
            this.f16074u.setVisibility(8);
            this.f16055b = 7;
            this.f16063j += 4;
            this.f16072s = "r<=25b";
            this.f16078y -= 4;
            this.f16071r = true;
            if (this.f16076w.size() > 0) {
                this.f16076w.add(1);
            }
        }
        this.f16069p = true;
        this.f16059f -= 2;
        this.f16057d = 0.17837149f;
        if (!TextUtils.isEmpty(this.f16077x)) {
            int length3 = this.f16077x.length();
            this.f16071r = !this.f16071r;
            if (this.f16063j < 0) {
                this.f16063j = 2;
            }
            if (this.f16063j > 0) {
                this.f16063j = 3;
            }
            this.f16077x += length3;
            this.f16057d = 0.021618664f;
            ArrayList<Integer> arrayList4 = this.f16076w;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.f16076w.remove(0);
            }
            this.f16057d -= 0.71740556f;
        }
        if (this.f16059f > 0) {
            this.f16059f = 1;
        }
        this.f16069p = true;
        this.f16059f = this.f16059f < 0 ? 9 : 2;
    }
}
