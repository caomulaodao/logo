package com.logomaster.logomaker.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.sdk.controller.C9286v;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoRainbowView extends View {

    /* renamed from: A */
    public int f16241A;

    /* renamed from: B */
    public double f16242B;

    /* renamed from: C */
    public float f16243C;

    /* renamed from: D */
    public String f16244D;

    /* renamed from: E */
    public int[] f16245E;

    /* renamed from: F */
    public double f16246F;

    /* renamed from: G */
    public int f16247G;

    /* renamed from: H */
    public int f16248H;

    /* renamed from: I */
    public float f16249I;

    /* renamed from: J */
    public ArrayList<String> f16250J;

    /* renamed from: K */
    public float f16251K;

    /* renamed from: L */
    public double f16252L;

    /* renamed from: M */
    public String f16253M;

    /* renamed from: N */
    public float f16254N;

    /* renamed from: O */
    public float f16255O;

    /* renamed from: P */
    public float f16256P;

    /* renamed from: Q */
    public int f16257Q;

    /* renamed from: R */
    public boolean f16258R;

    /* renamed from: S */
    public float[] f16259S;

    /* renamed from: T */
    public boolean f16260T;

    /* renamed from: U */
    public int[] f16261U;

    /* renamed from: V */
    public String[] f16262V;

    /* renamed from: W */
    public int[] f16263W;

    /* renamed from: a */
    public boolean f16264a;

    /* renamed from: a0 */
    public ArrayList<String> f16265a0;

    /* renamed from: b */
    public ArrayList<Integer> f16266b;

    /* renamed from: b0 */
    public boolean f16267b0;

    /* renamed from: c */
    public ArrayList<String> f16268c;

    /* renamed from: c0 */
    public int f16269c0;

    /* renamed from: d */
    public float f16270d;

    /* renamed from: d0 */
    public int f16271d0;

    /* renamed from: e */
    public ArrayList<Integer> f16272e;

    /* renamed from: e0 */
    public int f16273e0;

    /* renamed from: f */
    public int[] f16274f;

    /* renamed from: f0 */
    public int[] f16275f0;

    /* renamed from: g */
    public ArrayList<Integer> f16276g;

    /* renamed from: g0 */
    public String f16277g0;

    /* renamed from: h */
    public float f16278h;

    /* renamed from: h0 */
    public InterfaceC9668a f16279h0;

    /* renamed from: i */
    public double f16280i;

    /* renamed from: i0 */
    public String[] f16281i0;

    /* renamed from: j */
    public int[] f16282j;

    /* renamed from: j0 */
    public int f16283j0;

    /* renamed from: k */
    public double f16284k;

    /* renamed from: k0 */
    public int[] f16285k0;

    /* renamed from: l */
    public Paint f16286l;

    /* renamed from: l0 */
    public Bitmap f16287l0;

    /* renamed from: m */
    public Paint f16288m;

    /* renamed from: m0 */
    public String[] f16289m0;

    /* renamed from: n */
    public float f16290n;

    /* renamed from: n0 */
    public String[] f16291n0;

    /* renamed from: o */
    public String[] f16292o;

    /* renamed from: o0 */
    public String[] f16293o0;

    /* renamed from: p */
    public double f16294p;

    /* renamed from: q */
    public float f16295q;

    /* renamed from: r */
    public String f16296r;

    /* renamed from: s */
    public ArrayList<String> f16297s;

    /* renamed from: t */
    public ArrayList<String> f16298t;

    /* renamed from: u */
    public float f16299u;

    /* renamed from: v */
    public String[] f16300v;

    /* renamed from: w */
    public int f16301w;

    /* renamed from: x */
    public float f16302x;

    /* renamed from: y */
    public float f16303y;

    /* renamed from: z */
    public boolean f16304z;

    /* renamed from: com.logomaster.logomaker.view.LogoRainbowView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9668a {
        /* renamed from: a */
        void mo9073a(int i);
    }

    public LogoRainbowView(Context context) {
        super(context);
        this.f16264a = true;
        this.f16266b = new ArrayList<>();
        this.f16268c = new ArrayList<>();
        this.f16270d = 0.0f;
        this.f16272e = new ArrayList<>();
        this.f16274f = new int[13];
        this.f16276g = new ArrayList<>();
        this.f16278h = 0.0f;
        this.f16280i = 0.0896875026417302d;
        this.f16282j = new int[15];
        this.f16284k = 0.04191167596195844d;
        this.f16290n = 0.8784269f;
        this.f16292o = new String[16];
        this.f16294p = 0.3993477532953489d;
        this.f16295q = 24.0f;
        this.f16296r = C9286v.f15223a;
        this.f16297s = new ArrayList<>();
        this.f16298t = new ArrayList<>();
        this.f16299u = 8.0f;
        this.f16300v = new String[18];
        this.f16301w = 7;
        this.f16302x = 0.32228822f;
        this.f16303y = 32.0f;
        this.f16304z = false;
        this.f16241A = 5;
        this.f16242B = 0.33391217420585817d;
        this.f16243C = 32.0f;
        this.f16244D = "ry, it’s";
        this.f16245E = new int[19];
        this.f16246F = 0.7745501515261848d;
        this.f16247G = -1;
        this.f16248H = 2;
        this.f16249I = 0.25371897f;
        this.f16250J = new ArrayList<>();
        this.f16251K = 6.0f;
        this.f16252L = 0.37830932088493263d;
        this.f16253M = "家人” （...兰";
        this.f16254N = 0.6638504f;
        this.f16255O = 0.0f;
        this.f16256P = 0.8169857f;
        this.f16257Q = 9;
        this.f16258R = true;
        this.f16260T = false;
        this.f16261U = new int[16];
        this.f16262V = new String[19];
        this.f16263W = new int[]{SupportMenu.CATEGORY_MASK, -24064, -131328, -4980992, -14024960, -16711798, -16718337, -16752641, -10092289, -2424577, -65442, SupportMenu.CATEGORY_MASK};
        this.f16265a0 = new ArrayList<>();
        this.f16267b0 = false;
        this.f16269c0 = 9;
        this.f16271d0 = this.f16263W[0];
        this.f16273e0 = 5;
        this.f16275f0 = new int[12];
        this.f16277g0 = "ls. You’";
        String[] strArr = new String[12];
        this.f16281i0 = strArr;
        this.f16283j0 = 0;
        this.f16285k0 = new int[18];
        this.f16289m0 = new String[11];
        this.f16291n0 = new String[10];
        this.f16293o0 = new String[11];
        strArr[8] = null;
        if (this.f16298t == null) {
            this.f16298t = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.f16244D)) {
            this.f16244D += this.f16244D.length();
        }
        if (this.f16282j == null) {
            this.f16282j = new int[10];
            this.f16252L = this.f16252L > 0.6549237066057934d ? 0.7889435281971845d : 0.2698879726987793d;
            if (!TextUtils.isEmpty(this.f16296r)) {
                this.f16296r += this.f16296r.length();
            }
            this.f16264a = !this.f16264a;
        }
        String[] strArr2 = this.f16293o0;
        if (strArr2 != null) {
            strArr2[0] = "or bei";
        }
        this.f16269c0 = 1;
        this.f16304z = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f16298t == null) {
            this.f16298t = new ArrayList<>();
        }
        String[] strArr = this.f16300v;
        if (strArr != null) {
            strArr[4] = null;
        }
        if (this.f16285k0 == null) {
            this.f16285k0 = new int[10];
        }
        int[] iArr = this.f16261U;
        if (iArr != null) {
            iArr[9] = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f16269c0;
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i2 >= i3) {
                    break;
                }
                if (this.f16273e0 < 0) {
                    this.f16273e0 = 5;
                }
                i2++;
            }
            this.f16254N = 0.56227f;
            this.f16280i = this.f16280i > 0.7276188096892077d ? 0.5875424010870981d : 0.47263903201689017d;
        }
        this.f16244D = " than you ";
        this.f16254N = 0.9983611f;
        if (this.f16300v != null) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f16300v;
                if (i4 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i4] = "string" + i4;
                i4++;
            }
        }
        if (this.f16255O == 0.0f) {
            this.f16255O = DeUtils.m768b(getContext(), this.f16251K, 1);
            if (this.f16273e0 < 0) {
                this.f16273e0 = 4;
            }
            if (this.f16276g == null) {
                this.f16276g = new ArrayList<>();
            }
            if (this.f16280i < 0.7077922476066741d) {
                this.f16280i = 0.1439539682766796d;
            }
            this.f16249I = 0.1545586f;
            this.f16256P = 0.8145164f;
            this.f16264a = !this.f16264a;
            this.f16248H = this.f16248H > 7 ? 8 : 9;
        }
        String[] strArr3 = this.f16289m0;
        if (strArr3 != null) {
            strArr3[5] = "ea";
        }
        this.f16273e0++;
        String[] strArr4 = this.f16300v;
        if (strArr4 != null) {
            strArr4[2] = null;
        }
        int[] iArr2 = this.f16261U;
        if (iArr2 != null) {
            iArr2[6] = 0;
            if (this.f16285k0 == null) {
                this.f16285k0 = new int[10];
            }
            if (this.f16276g.size() < 2) {
                this.f16276g.add(0);
            }
            if (!TextUtils.isEmpty(this.f16296r)) {
                this.f16296r += this.f16296r.length();
            }
        }
        String[] strArr5 = this.f16300v;
        if (strArr5 != null) {
            strArr5[9] = "e peopl";
        }
        ArrayList<String> arrayList = this.f16250J;
        if (arrayList != null && arrayList.size() > 0) {
            this.f16250J.remove(0);
        }
        if (this.f16268c == null) {
            this.f16268c = new ArrayList<>();
        }
        if (this.f16286l == null) {
            this.f16286l = new Paint();
            if (this.f16284k < 0.9356221186852627d) {
                this.f16284k = 0.4294817318129712d;
            }
            if (this.f16272e.size() < 4) {
                this.f16272e.add(0);
            }
            float f = ((double) this.f16256P) < 0.55526245d ? 0.205701f : 0.65136695f;
            this.f16256P = f;
            this.f16301w = 9;
            String[] strArr6 = this.f16262V;
            if (strArr6 != null) {
                strArr6[8] = "d m";
            }
            if (f < 0.97678864d) {
                this.f16256P = 0.0040129423f;
            }
            this.f16290n += 0.29321438f;
            this.f16286l.setAntiAlias(true);
            this.f16264a = true;
            this.f16260T = !(!this.f16260T);
            this.f16253M = "99评";
            if (this.f16289m0 == null) {
                this.f16289m0 = new String[10];
            }
            if (this.f16298t == null) {
                this.f16298t = new ArrayList<>();
            }
            this.f16302x = 0.51805127f;
            this.f16286l.setShader(new LinearGradient(0.0f, 0.0f, this.f16270d, 0.0f, this.f16263W, (float[]) null, Shader.TileMode.REPEAT));
            this.f16269c0 = 4;
            this.f16280i = this.f16280i > 0.7022696080852996d ? 0.21968090098834114d : 0.3634367883816638d;
            this.f16273e0 = Math.abs(this.f16273e0);
            this.f16257Q = Math.abs(this.f16257Q);
            this.f16269c0 = Math.abs(this.f16269c0);
            if (this.f16248H > 0) {
                this.f16248H = 1;
            }
            if (this.f16262V != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr7 = this.f16262V;
                    if (i5 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i5] = "string" + i5;
                    i5++;
                }
            }
        }
        if (this.f16265a0 == null) {
            this.f16265a0 = new ArrayList<>();
        }
        this.f16290n *= 0.75243986f;
        String[] strArr8 = this.f16262V;
        if (strArr8 != null) {
            strArr8[8] = null;
        }
        if (!TextUtils.isEmpty(this.f16253M)) {
            int length = this.f16253M.length();
            String[] strArr9 = this.f16262V;
            if (strArr9 != null) {
                strArr9[9] = null;
            }
            this.f16294p += 0.8338774200204564d;
            this.f16302x = -this.f16302x;
            this.f16253M += length;
            int i6 = 0;
            while (true) {
                int i7 = this.f16269c0;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                this.f16290n = 0.14888304f;
                i6++;
            }
            if (this.f16268c == null) {
                this.f16268c = new ArrayList<>();
            }
            if (this.f16276g == null) {
                this.f16276g = new ArrayList<>();
            }
        }
        String[] strArr10 = this.f16293o0;
        if (strArr10 != null) {
            strArr10[1] = "d t";
        }
        if (this.f16298t.size() > 3) {
            this.f16298t.add("ced to ");
        }
        this.f16284k = 0.21574397247787536d;
        float f2 = this.f16270d;
        float f3 = this.f16278h;
        float f4 = this.f16255O;
        canvas.drawRoundRect(0.0f, 0.0f, f2, f3, f4, f4, this.f16286l);
        if (this.f16265a0 == null) {
            this.f16265a0 = new ArrayList<>();
        }
        String[] strArr11 = this.f16289m0;
        if (strArr11 != null) {
            strArr11[7] = "di";
        }
        this.f16264a = !this.f16264a;
        if (this.f16297s == null) {
            this.f16297s = new ArrayList<>();
            String[] strArr12 = this.f16289m0;
            if (strArr12 != null) {
                strArr12[2] = null;
            }
            ArrayList<Integer> arrayList2 = this.f16272e;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.f16272e.remove(0);
            }
            if (this.f16300v != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr13 = this.f16300v;
                    if (i8 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                        break;
                    }
                    strArr13[i8] = "string" + i8;
                    i8++;
                }
            }
        }
        this.f16280i = 0.155458032242626d;
        String[] strArr14 = this.f16300v;
        if (strArr14 != null) {
            strArr14[5] = InneractiveMediationDefs.GENDER_MALE;
        }
        if (0.155458032242626d > 0.5668311331770046d) {
            this.f16280i = 0.4927366793752108d;
        }
        if (this.f16288m == null) {
            this.f16288m = new Paint();
            this.f16252L = 0.7234830095705683d;
            this.f16304z = true;
            this.f16283j0 = 2;
            this.f16242B = -this.f16242B;
            ArrayList<String> arrayList3 = this.f16298t;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.f16298t.remove(0);
            }
            this.f16304z = true;
            this.f16288m.setAntiAlias(true);
            if (this.f16285k0 == null) {
                this.f16285k0 = new int[10];
            }
            if (!TextUtils.isEmpty(this.f16296r)) {
                this.f16296r += this.f16296r.length();
            }
            this.f16269c0 = 7;
            if (this.f16266b == null) {
                this.f16266b = new ArrayList<>();
                String[] strArr15 = this.f16262V;
                if (strArr15 != null) {
                    strArr15[1] = null;
                }
                this.f16273e0 = 6;
                if (this.f16252L > 0.42389899069752324d) {
                    this.f16252L = 0.09611927111293173d;
                }
            }
            String[] strArr16 = this.f16281i0;
            if (strArr16 != null) {
                strArr16[6] = null;
            }
            if (this.f16300v == null) {
                i = 10;
                this.f16300v = new String[10];
            } else {
                i = 10;
            }
            if (this.f16262V == null) {
                this.f16262V = new String[i];
            }
            this.f16288m.setColor(this.f16247G);
            String[] strArr17 = this.f16300v;
            if (strArr17 != null) {
                strArr17[9] = null;
            }
            if (!TextUtils.isEmpty(this.f16296r)) {
                this.f16296r += this.f16296r.length();
            }
            this.f16254N = 0.5603427f;
            ArrayList<String> arrayList4 = this.f16297s;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f16297s.remove(0);
                if (this.f16289m0 == null) {
                    this.f16289m0 = new String[10];
                }
                if (this.f16272e == null) {
                    this.f16272e = new ArrayList<>();
                }
                this.f16256P = ((double) this.f16256P) > 0.7823123d ? 0.75889677f : 0.1842432f;
            }
            if (this.f16293o0 == null) {
                this.f16293o0 = new String[10];
            }
            if (this.f16280i > 0.8170002135912212d) {
                this.f16280i = 0.5984282622796027d;
            }
            if (this.f16289m0 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr18 = this.f16289m0;
                    if (i9 >= (strArr18.length > 3 ? 3 : strArr18.length)) {
                        break;
                    }
                    strArr18[i9] = "string" + i9;
                    i9++;
                }
            }
            this.f16288m.setStyle(Paint.Style.STROKE);
            this.f16248H = this.f16248H > 7 ? 3 : 5;
            this.f16294p = Math.abs(this.f16294p);
            String[] strArr19 = this.f16293o0;
            if (strArr19 != null) {
                strArr19[0] = "e pro";
            }
            if (this.f16301w < 0) {
                this.f16301w = 5;
                String[] strArr20 = this.f16262V;
                if (strArr20 != null) {
                    strArr20[6] = "his ";
                }
                if (!TextUtils.isEmpty(this.f16244D)) {
                    this.f16244D += this.f16244D.length();
                }
                this.f16264a = true;
            }
            this.f16258R = !this.f16258R;
            ArrayList<String> arrayList5 = this.f16268c;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.f16268c.remove(0);
            }
            this.f16280i = this.f16280i < 0.06972379706553322d ? 0.028910359178283884d : 0.6990391515209744d;
            this.f16288m.setStrokeWidth(this.f16299u);
            this.f16242B = 0.08264742670589742d;
            String[] strArr21 = this.f16293o0;
            if (strArr21 != null) {
                strArr21[0] = "miliar";
            }
            if (this.f16300v != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr22 = this.f16300v;
                    if (i10 >= (strArr22.length > 3 ? 3 : strArr22.length)) {
                        break;
                    }
                    strArr22[i10] = "string" + i10;
                    i10++;
                }
            }
            String[] strArr23 = this.f16291n0;
            if (strArr23 != null) {
                strArr23[1] = "》（二十";
                if (!TextUtils.isEmpty(this.f16296r)) {
                    this.f16296r += this.f16296r.length();
                }
                this.f16258R = false;
                String[] strArr24 = this.f16262V;
                if (strArr24 != null) {
                    strArr24[4] = null;
                }
            }
            this.f16284k = 0.06305080878113567d;
            int i11 = 0;
            while (true) {
                int i12 = this.f16273e0;
                if (i12 > 3) {
                    i12 = 3;
                }
                if (i11 >= i12) {
                    break;
                }
                String[] strArr25 = this.f16262V;
                if (strArr25 != null) {
                    strArr25[3] = null;
                }
                i11++;
            }
            if (this.f16242B > 0.794229755444182d) {
                this.f16242B = 0.31237504758665025d;
            }
        }
        this.f16246F *= 0.5824844702718656d;
        this.f16290n = ((double) this.f16290n) > 0.017355144d ? 0.3910238f : 0.39557862f;
        this.f16304z = !this.f16304z;
        this.f16257Q = 9;
        String[] strArr26 = this.f16300v;
        if (strArr26 != null) {
            strArr26[6] = "a";
        }
        ArrayList<String> arrayList6 = this.f16265a0;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.f16265a0.remove(0);
        }
        if (this.f16284k > 0.4211265354120778d) {
            this.f16284k = 0.24660901169380745d;
        }
        canvas.drawCircle(this.f16303y, this.f16243C, this.f16295q, this.f16288m);
        int i13 = 0;
        while (true) {
            int i14 = this.f16248H;
            if (i14 > 3) {
                i14 = 3;
            }
            if (i13 >= i14) {
                break;
            }
            if (this.f16272e == null) {
                this.f16272e = new ArrayList<>();
            }
            i13++;
        }
        this.f16258R = !this.f16258R;
        this.f16273e0 = 0;
        int[] iArr3 = this.f16275f0;
        if (iArr3 != null) {
            iArr3[5] = 0;
            if (!TextUtils.isEmpty(this.f16277g0)) {
                this.f16277g0 += this.f16277g0.length();
            }
            this.f16260T = true;
            if (this.f16298t == null) {
                this.f16298t = new ArrayList<>();
            }
        }
        this.f16246F = 0.5571571816550053d;
        this.f16284k *= 0.8690040643371029d;
        if (this.f16242B > 0.8037264350438843d) {
            this.f16242B = 0.9356200556122871d;
        }
        for (int i15 = 1; i15 < this.f16263W.length; i15++) {
            Throwable th = new Throwable();
            StringBuilder sb = new StringBuilder();
            sb.append("color:");
            sb.append(this.f16263W[i15]);
            sb.append("，与前一个的差值为：");
            int[] iArr4 = this.f16263W;
            sb.append(iArr4[i15] - iArr4[i15 - 1]);
            LogoLogUtils.m22166d("LogoRainbowView", th, sb.toString());
            this.f16296r = "e is ki";
            this.f16248H = Math.abs(this.f16248H);
            this.f16264a = true;
            this.f16257Q += 3;
            this.f16273e0 += 5;
            String[] strArr27 = this.f16289m0;
            if (strArr27 != null) {
                strArr27[2] = "nd charact";
            }
            ArrayList<Integer> arrayList7 = this.f16276g;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.f16276g.remove(0);
            }
        }
        this.f16284k += 0.11908472790381774d;
        String[] strArr28 = this.f16281i0;
        if (strArr28 != null) {
            strArr28[3] = null;
        }
        ArrayList<String> arrayList8 = this.f16268c;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.f16268c.remove(0);
        }
        int[] iArr5 = this.f16274f;
        if (iArr5 != null) {
            iArr5[2] = 0;
            String[] strArr29 = this.f16293o0;
            if (strArr29 != null) {
                strArr29[0] = null;
            }
            this.f16269c0 = 8;
            if (this.f16290n > 0.55108356d) {
                this.f16290n = 0.2947936f;
            }
        }
        ArrayList<String> arrayList9 = this.f16268c;
        if (arrayList9 != null && arrayList9.size() > 0) {
            this.f16268c.remove(0);
        }
        if (this.f16272e == null) {
            this.f16272e = new ArrayList<>();
        }
        ArrayList<String> arrayList10 = this.f16268c;
        if (arrayList10 == null || arrayList10.size() <= 0) {
            return;
        }
        this.f16268c.remove(0);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        String[] strArr = this.f16293o0;
        if (strArr != null) {
            strArr[5] = null;
        }
        String[] strArr2 = this.f16281i0;
        if (strArr2 != null) {
            strArr2[5] = null;
        }
        if (this.f16284k > 0.8761556738611251d) {
            this.f16284k = 0.43394454164789487d;
        }
        if (this.f16266b == null) {
            this.f16266b = new ArrayList<>();
            if (this.f16262V != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr3 = this.f16262V;
                    if (i5 >= (strArr3.length <= 3 ? strArr3.length : 3)) {
                        break;
                    }
                    strArr3[i5] = "string" + i5;
                    i5++;
                }
            }
            if (this.f16242B < 0.44760297943589755d) {
                this.f16242B = 0.4610416546106577d;
            }
            if (this.f16268c.size() > 1) {
                this.f16268c.add("s");
            }
        }
        this.f16242B = 0.02589890130567729d;
        this.f16246F -= 0.6283392697880061d;
        if (this.f16280i < 0.6651671828577745d) {
            this.f16280i = 0.8355850894474902d;
        }
        this.f16270d = getWidth();
        this.f16252L = -this.f16252L;
        this.f16294p = this.f16294p < 0.6297861438923843d ? 0.467954157306412d : 0.6982376084651509d;
        ArrayList<Integer> arrayList = this.f16276g;
        if (arrayList == null && arrayList.size() > 0) {
            this.f16276g.remove(0);
        }
        this.f16241A = Math.abs(this.f16241A);
        this.f16242B = 0.15670815442030428d;
        if (this.f16298t.size() > 8) {
            this.f16298t.add(" model f");
        }
        if (this.f16265a0 == null) {
            this.f16265a0 = new ArrayList<>();
        }
        this.f16278h = getHeight();
        if (this.f16280i < 0.572158978493646d) {
            this.f16280i = 0.05684310593403641d;
        }
        this.f16248H = this.f16248H > 4 ? 1 : 9;
        this.f16284k = -this.f16284k;
        this.f16241A -= 7;
        if (this.f16254N > 0.15406102d) {
            this.f16254N = 0.035011232f;
        }
        if (this.f16293o0 == null) {
            this.f16293o0 = new String[10];
        }
        String[] strArr4 = this.f16300v;
        if (strArr4 != null) {
            strArr4[1] = null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        int i;
        int i2;
        int i3;
        int action = motionEvent.getAction();
        if (action == 0 || action == 2) {
            this.f16303y = motionEvent.getX();
            this.f16248H *= 0;
            if (!TextUtils.isEmpty(this.f16244D)) {
                this.f16244D += this.f16244D.length();
            }
            if (this.f16246F < 0.32620330054374536d) {
                this.f16246F = 0.10221747745075505d;
            }
            if (this.f16275f0 == null) {
                this.f16275f0 = new int[10];
                String[] strArr = this.f16293o0;
                if (strArr != null) {
                    strArr[2] = DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR;
                }
                this.f16242B = this.f16242B > 0.7623712054596075d ? 0.5872982228437976d : 0.08292645458368042d;
                if (this.f16298t.size() < 7) {
                    this.f16298t.add("sentime");
                }
            }
            this.f16260T = !this.f16260T;
            this.f16290n = ((double) this.f16290n) > 0.11199921d ? 0.06836432f : 0.29001588f;
            if (this.f16276g.size() < 9) {
                this.f16276g.add(1);
            }
            float f = this.f16303y;
            if (f < 0.0f) {
                this.f16303y = 0.0f;
                if (this.f16285k0 != null) {
                    int i4 = 0;
                    while (true) {
                        int[] iArr = this.f16285k0;
                        if (i4 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i4] = 5;
                        i4++;
                    }
                }
                ArrayList<String> arrayList = this.f16298t;
                if (arrayList != null && arrayList.size() > 0) {
                    this.f16298t.remove(0);
                }
                if (!TextUtils.isEmpty(this.f16277g0)) {
                    this.f16277g0 += this.f16277g0.length();
                }
                if (this.f16274f == null) {
                    this.f16274f = new int[10];
                    int[] iArr2 = this.f16285k0;
                    if (iArr2 != null) {
                        iArr2[2] = 0;
                    }
                    if (this.f16250J.size() < 5) {
                        this.f16250J.add("stude");
                    }
                    this.f16256P = 0.5676682f;
                }
                this.f16296r = "ow g";
                this.f16256P = Math.abs(this.f16256P);
                if (this.f16285k0 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr3 = this.f16285k0;
                        if (i5 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                            break;
                        }
                        iArr3[i5] = 5;
                        i5++;
                    }
                }
            } else {
                float f2 = this.f16270d;
                if (f > f2) {
                    this.f16303y = f2;
                    if (this.f16262V != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr2 = this.f16262V;
                            if (i6 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                                break;
                            }
                            strArr2[i6] = "string" + i6;
                            i6++;
                        }
                    }
                    if (this.f16276g == null) {
                        this.f16276g = new ArrayList<>();
                    }
                    this.f16277g0 = "sn’t re";
                    this.f16257Q = 9;
                    if (this.f16246F < 0.8241694097771058d) {
                        this.f16246F = 0.4731478628214727d;
                    }
                    String[] strArr3 = this.f16281i0;
                    if (strArr3 != null) {
                        strArr3[1] = " insp";
                    }
                    this.f16254N -= 0.2821061f;
                }
            }
            ArrayList<String> arrayList2 = this.f16265a0;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f16265a0.remove(0);
            }
            this.f16269c0--;
            int i7 = 0;
            while (true) {
                int i8 = this.f16269c0;
                if (i8 > 3) {
                    i8 = 3;
                }
                if (i7 >= i8) {
                    break;
                }
                if (this.f16290n > 0.16390043d) {
                    this.f16290n = 0.07236582f;
                }
                i7++;
            }
            if (this.f16281i0 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr4 = this.f16281i0;
                    if (i9 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i9] = "string" + i9;
                    i9++;
                }
            }
            int i10 = 0;
            while (true) {
                int i11 = this.f16248H;
                if (i11 > 3) {
                    i11 = 3;
                }
                if (i10 >= i11) {
                    break;
                }
                if (this.f16265a0 == null) {
                    this.f16265a0 = new ArrayList<>();
                }
                i10++;
            }
            this.f16294p -= 0.6089740566514863d;
            if (this.f16245E != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr4 = this.f16245E;
                    if (i12 >= iArr4.length) {
                        break;
                    }
                    iArr4[i12] = 1;
                    this.f16248H = this.f16248H < 0 ? 1 : 8;
                    this.f16258R = !this.f16258R;
                    this.f16294p = 0.22336486969790936d;
                    i12++;
                }
                this.f16252L = 0.11138500148933705d;
                this.f16260T = false;
                if (this.f16298t.size() > 9) {
                    this.f16298t.add(", basi");
                }
            }
            int i13 = 0;
            while (true) {
                int i14 = this.f16269c0;
                if (i14 > 3) {
                    i14 = 3;
                }
                if (i13 >= i14) {
                    break;
                }
                if (this.f16276g.size() > 3) {
                    this.f16276g.add(2);
                }
                i13++;
            }
            if (!TextUtils.isEmpty(this.f16244D)) {
                this.f16244D += this.f16244D.length();
            }
            String[] strArr5 = this.f16281i0;
            if (strArr5 != null) {
                strArr5[9] = null;
            }
            this.f16249I = ((double) this.f16249I) > 0.13175756d ? 0.85066f : 0.8440602f;
            if (this.f16300v != null) {
                int i15 = 0;
                while (true) {
                    String[] strArr6 = this.f16300v;
                    if (i15 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i15] = "string" + i15;
                    i15++;
                }
            }
            int i16 = 0;
            while (true) {
                int i17 = this.f16248H;
                if (i17 > 3) {
                    i17 = 3;
                }
                if (i16 >= i17) {
                    break;
                }
                int[] iArr5 = this.f16285k0;
                if (iArr5 != null) {
                    iArr5[1] = 6;
                }
                i16++;
            }
            if (this.f16254N > 0.6969009d) {
                this.f16254N = 0.029347837f;
            }
            this.f16243C = motionEvent.getY();
            this.f16302x = -(this.f16302x * 0.7155184f);
            this.f16304z = !this.f16304z;
            int[] iArr6 = this.f16274f;
            if (iArr6 != null) {
                iArr6[3] = 2;
                this.f16246F = 0.6139672032689876d;
                ArrayList<Integer> arrayList3 = this.f16272e;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    this.f16272e.remove(0);
                }
                this.f16264a = !this.f16264a;
            }
            this.f16284k -= 0.5724824117803199d;
            this.f16280i -= 0.4940542559422053d;
            String[] strArr7 = this.f16281i0;
            if (strArr7 != null) {
                strArr7[9] = " u";
            }
            float f3 = this.f16243C;
            float f4 = this.f16295q;
            if (f3 < f4) {
                this.f16243C = f4;
                if (!TextUtils.isEmpty(this.f16296r)) {
                    this.f16296r += this.f16296r.length();
                }
                this.f16252L *= 0.20836070714902533d;
                this.f16284k = 0.5430788983567801d;
                if (!TextUtils.isEmpty(this.f16253M)) {
                    int length = this.f16253M.length();
                    this.f16254N = Math.abs(this.f16254N);
                    String[] strArr8 = this.f16293o0;
                    if (strArr8 != null) {
                        strArr8[2] = null;
                    }
                    this.f16242B = 0.2063875028277058d;
                    this.f16253M += length;
                    this.f16280i = this.f16280i < 0.7438527460754338d ? 0.3800525607056343d : 0.11464880118470044d;
                    ArrayList<String> arrayList4 = this.f16268c;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        this.f16268c.remove(0);
                    }
                    this.f16302x = ((double) this.f16302x) > 0.63733095d ? 0.46787953f : 0.35362142f;
                }
                this.f16284k = this.f16284k < 0.18604123518219196d ? 0.6097570336740512d : 0.7318018729465859d;
                if (this.f16281i0 != null) {
                    int i18 = 0;
                    while (true) {
                        String[] strArr9 = this.f16281i0;
                        if (i18 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                            break;
                        }
                        strArr9[i18] = "string" + i18;
                        i18++;
                    }
                }
                ArrayList<Integer> arrayList5 = this.f16272e;
                if (arrayList5 == null && arrayList5.size() > 0) {
                    this.f16272e.remove(0);
                }
            } else {
                float f5 = this.f16278h;
                if (f3 > f5 - f4) {
                    this.f16243C = f5 - f4;
                    if (this.f16276g == null) {
                        this.f16276g = new ArrayList<>();
                    }
                    this.f16280i += 0.9780032268212792d;
                    this.f16284k = this.f16284k > 0.07636317248575464d ? 0.32937020462558475d : 0.04140886360870166d;
                    this.f16249I = Math.abs(this.f16249I);
                    this.f16280i = -this.f16280i;
                    this.f16294p = 0.4078553045731146d;
                    this.f16290n = ((double) this.f16290n) > 0.7102414d ? 0.37678337f : 0.48042172f;
                }
            }
            if (this.f16268c.size() > 7) {
                this.f16268c.add("is, ");
            }
            this.f16264a = true;
            if (this.f16262V != null) {
                int i19 = 0;
                while (true) {
                    String[] strArr10 = this.f16262V;
                    if (i19 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                        break;
                    }
                    strArr10[i19] = "string" + i19;
                    i19++;
                }
            }
            if (this.f16281i0 != null) {
                int i20 = 0;
                while (true) {
                    String[] strArr11 = this.f16281i0;
                    if (i20 >= (strArr11.length > 3 ? 3 : strArr11.length)) {
                        break;
                    }
                    strArr11[i20] = "string" + i20;
                    i20++;
                }
            }
            this.f16284k = this.f16284k < 0.47348880741880106d ? 0.9665213992216053d : 0.6783028841464791d;
            this.f16296r = "You’re ";
            this.f16257Q = this.f16257Q > 7 ? 5 : 0;
            this.f16290n = 0.8915339f;
            this.f16269c0 = 5;
            this.f16258R = true;
            int[] iArr7 = this.f16245E;
            if (iArr7 != null) {
                iArr7[0] = 1;
                if (!TextUtils.isEmpty(this.f16277g0)) {
                    this.f16277g0 += this.f16277g0.length();
                }
                if (!TextUtils.isEmpty(this.f16296r)) {
                    this.f16296r += this.f16296r.length();
                }
                if (this.f16273e0 < 0) {
                    this.f16273e0 = 0;
                }
            }
            String[] strArr12 = this.f16262V;
            if (strArr12 != null) {
                strArr12[6] = "at";
            }
            this.f16258R = !this.f16258R;
            this.f16280i = 0.5416565061185937d;
            invalidate();
            if (this.f16281i0 == null) {
                this.f16281i0 = new String[10];
            }
            this.f16244D = " so many m";
            ArrayList<String> arrayList6 = this.f16265a0;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.f16265a0.remove(0);
            }
            if (this.f16261U == null) {
                this.f16261U = new int[10];
                if (!TextUtils.isEmpty(this.f16244D)) {
                    this.f16244D += this.f16244D.length();
                }
                this.f16304z = false;
                this.f16258R = true;
            }
            this.f16258R = true;
            if (!TextUtils.isEmpty(this.f16244D)) {
                this.f16244D += this.f16244D.length();
            }
            this.f16280i = this.f16280i < 0.15925194434630208d ? 0.6723503306469275d : 0.7194976541283857d;
            if (this.f16279h0 != null) {
                if (this.f16287l0 == null) {
                    this.f16287l0 = Bitmap.createBitmap((int) this.f16270d, (int) this.f16278h, Bitmap.Config.ARGB_8888);
                    String[] strArr13 = this.f16281i0;
                    if (strArr13 != null) {
                        strArr13[0] = null;
                    }
                    if (!TextUtils.isEmpty(this.f16244D)) {
                        this.f16244D += this.f16244D.length();
                    }
                    if (this.f16269c0 > 0) {
                        this.f16269c0 = 5;
                    }
                    if (this.f16261U != null) {
                        int i21 = 0;
                        while (true) {
                            int[] iArr8 = this.f16261U;
                            if (i21 >= iArr8.length) {
                                break;
                            }
                            iArr8[i21] = 0;
                            this.f16246F *= 0.7424006488409193d;
                            ArrayList<String> arrayList7 = this.f16250J;
                            if (arrayList7 != null && arrayList7.size() > 0) {
                                this.f16250J.remove(0);
                            }
                            if (this.f16268c == null) {
                                this.f16268c = new ArrayList<>();
                            }
                            i21++;
                        }
                        this.f16273e0 = this.f16273e0 > 5 ? 3 : 1;
                        ArrayList<Integer> arrayList8 = this.f16272e;
                        if (arrayList8 == null && arrayList8.size() > 0) {
                            this.f16272e.remove(0);
                        }
                        String[] strArr14 = this.f16293o0;
                        if (strArr14 != null) {
                            strArr14[2] = "(it t";
                        }
                    }
                    this.f16294p = 0.3840616395978024d;
                    this.f16302x = ((double) this.f16302x) > 0.13479674d ? 0.4512565f : 0.69605213f;
                    this.f16256P = 0.79957974f;
                    Canvas canvas = new Canvas(this.f16287l0);
                    this.f16252L = this.f16252L < 0.48054259805187205d ? 0.5784632559070705d : 0.7095233038627563d;
                    this.f16256P = 0.3493144f;
                    this.f16242B = this.f16242B < 0.29610217713600606d ? 0.07931071930182276d : 0.5303335123974657d;
                    this.f16253M = "程度";
                    if (this.f16272e.size() > 2) {
                        str = "a";
                        this.f16272e.add(7);
                    } else {
                        str = "a";
                    }
                    if (this.f16289m0 == null) {
                        this.f16289m0 = new String[10];
                    }
                    this.f16258R = true;
                    draw(canvas);
                    if (this.f16289m0 != null) {
                        int i22 = 0;
                        while (true) {
                            String[] strArr15 = this.f16289m0;
                            if (i22 >= (strArr15.length > 3 ? 3 : strArr15.length)) {
                                break;
                            }
                            strArr15[i22] = "string" + i22;
                            i22++;
                        }
                    }
                    if (this.f16300v != null) {
                        int i23 = 0;
                        while (true) {
                            String[] strArr16 = this.f16300v;
                            if (i23 >= (strArr16.length > 3 ? 3 : strArr16.length)) {
                                break;
                            }
                            strArr16[i23] = "string" + i23;
                            i23++;
                        }
                    }
                    int i24 = 0;
                    while (true) {
                        int i25 = this.f16248H;
                        if (i25 > 3) {
                            i25 = 3;
                        }
                        if (i24 >= i25) {
                            break;
                        }
                        if (this.f16262V == null) {
                            this.f16262V = new String[10];
                        }
                        i24++;
                    }
                    if (this.f16241A < 0) {
                        this.f16241A = 4;
                        this.f16294p = this.f16294p < 0.06661345311641254d ? 0.9823673657122061d : 0.48525732731533855d;
                        i3 = 7;
                        this.f16269c0 *= 7;
                        if (this.f16285k0 == null) {
                            this.f16285k0 = new int[10];
                        }
                    } else {
                        i3 = 7;
                    }
                    this.f16269c0 = i3;
                    int i26 = 0;
                    while (true) {
                        int i27 = this.f16273e0;
                        if (i27 > 3) {
                            i27 = 3;
                        }
                        if (i26 >= i27) {
                            break;
                        }
                        this.f16280i *= 0.7336142842013604d;
                        i26++;
                    }
                    this.f16284k = 0.0077101667688056486d;
                    canvas.save();
                    this.f16277g0 = str;
                    if (this.f16298t == null) {
                        this.f16298t = new ArrayList<>();
                    }
                    if (this.f16294p > 0.947651038836041d) {
                        this.f16294p = 0.9130007019186059d;
                    }
                    if (this.f16297s == null) {
                        this.f16297s = new ArrayList<>();
                        if (this.f16265a0.size() < 5) {
                            this.f16265a0.add("cter");
                        }
                        this.f16302x = 0.1256274f;
                        this.f16246F = Math.abs(this.f16246F);
                    }
                    String[] strArr17 = this.f16293o0;
                    if (strArr17 != null) {
                        strArr17[2] = null;
                    }
                    this.f16242B *= 0.6079142580076591d;
                    this.f16290n *= 0.6512072f;
                } else {
                    str = "a";
                }
                this.f16304z = false;
                this.f16264a = true;
                if (this.f16285k0 == null) {
                    i = 10;
                    this.f16285k0 = new int[10];
                } else {
                    i = 10;
                }
                this.f16267b0 = false;
                if (this.f16293o0 == null) {
                    this.f16293o0 = new String[i];
                }
                this.f16296r = "be";
                if (this.f16289m0 == null) {
                    this.f16289m0 = new String[i];
                }
                int round = Math.round(this.f16303y);
                String[] strArr18 = this.f16300v;
                if (strArr18 != null) {
                    strArr18[8] = DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR;
                }
                if (this.f16285k0 != null) {
                    int i28 = 0;
                    while (true) {
                        int[] iArr9 = this.f16285k0;
                        if (i28 >= (iArr9.length > 3 ? 3 : iArr9.length)) {
                            break;
                        }
                        iArr9[i28] = 0;
                        i28++;
                    }
                }
                this.f16304z = !this.f16304z;
                int[] iArr10 = this.f16275f0;
                if (iArr10 != null) {
                    iArr10[6] = 4;
                    this.f16244D = "and mod";
                    if (this.f16272e == null) {
                        this.f16272e = new ArrayList<>();
                    }
                    if (!TextUtils.isEmpty(this.f16244D)) {
                        this.f16244D += this.f16244D.length();
                    }
                }
                if (this.f16302x > 0.19179088d) {
                    this.f16302x = 0.22068447f;
                }
                this.f16273e0 = this.f16273e0 < 1 ? 7 : 3;
                ArrayList<String> arrayList9 = this.f16298t;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    this.f16298t.remove(0);
                }
                int round2 = Math.round(this.f16243C);
                String[] strArr19 = this.f16262V;
                if (strArr19 != null) {
                    strArr19[4] = null;
                }
                this.f16304z = true;
                this.f16260T = !this.f16260T;
                if (!TextUtils.isEmpty(this.f16253M)) {
                    int length2 = this.f16253M.length();
                    this.f16242B += 0.8452355977810487d;
                    if (this.f16272e == null) {
                        this.f16272e = new ArrayList<>();
                    }
                    this.f16294p -= 0.6252872105544219d;
                    this.f16253M += length2;
                    if (this.f16298t.size() > 3) {
                        this.f16298t.add("surpr");
                    }
                    this.f16248H -= 7;
                    if (this.f16273e0 > 0) {
                        this.f16273e0 = 0;
                    }
                }
                this.f16244D = "th";
                if (this.f16254N < 0.07247037d) {
                    this.f16254N = 0.5357308f;
                }
                if (this.f16246F > 0.8857532606022658d) {
                    this.f16246F = 0.17038675240016266d;
                }
                if (round < 0) {
                    this.f16264a = !this.f16264a;
                    this.f16246F *= 0.6368438685051775d;
                    if (!TextUtils.isEmpty(this.f16296r)) {
                        this.f16296r += this.f16296r.length();
                    }
                    this.f16253M = " 丶地";
                    if (!TextUtils.isEmpty(this.f16244D)) {
                        this.f16244D += this.f16244D.length();
                    }
                    this.f16260T = true;
                    this.f16304z = !this.f16304z;
                    round = 0;
                } else if (round >= this.f16287l0.getWidth()) {
                    round = this.f16287l0.getWidth() - 1;
                    this.f16264a = true;
                    this.f16258R = true;
                    if (this.f16289m0 == null) {
                        this.f16289m0 = new String[10];
                    }
                    if (this.f16291n0 != null) {
                        int i29 = 0;
                        while (true) {
                            String[] strArr20 = this.f16291n0;
                            if (i29 >= strArr20.length) {
                                break;
                            }
                            strArr20[i29] = "string" + i29;
                            ArrayList<Integer> arrayList10 = this.f16272e;
                            if (arrayList10 == null && arrayList10.size() > 0) {
                                this.f16272e.remove(0);
                            }
                            this.f16302x = 0.7192772f;
                            this.f16290n = 0.06457114f;
                            i29++;
                        }
                        this.f16264a = !this.f16264a;
                        if (this.f16272e.size() < 5) {
                            this.f16272e.add(3);
                        }
                        String[] strArr21 = this.f16262V;
                        if (strArr21 != null) {
                            strArr21[5] = "rary";
                        }
                    }
                    if (!TextUtils.isEmpty(this.f16296r)) {
                        this.f16296r += this.f16296r.length();
                    }
                    this.f16290n = -this.f16290n;
                    this.f16252L = 0.31182365482244156d;
                }
                this.f16290n = 0.6753882f;
                if (this.f16300v == null) {
                    this.f16300v = new String[10];
                }
                if (this.f16242B > 0.3074945316500479d) {
                    this.f16242B = 0.28357569145733497d;
                }
                this.f16302x -= 0.8849593f;
                if (this.f16289m0 == null) {
                    this.f16289m0 = new String[10];
                }
                this.f16294p = Math.abs(this.f16294p);
                for (int i30 = 0; i30 < this.f16257Q; i30++) {
                    int[] iArr11 = this.f16261U;
                    if (iArr11 != null) {
                        iArr11[4] = 0;
                        if (this.f16290n < 0.4769534d) {
                            this.f16290n = 0.48641342f;
                        }
                        int[] iArr12 = this.f16285k0;
                        if (iArr12 != null) {
                            iArr12[7] = 8;
                        }
                        this.f16302x = 0.4098106f;
                    }
                    ArrayList<Integer> arrayList11 = this.f16272e;
                    if (arrayList11 == null && arrayList11.size() > 0) {
                        this.f16272e.remove(0);
                    }
                    String[] strArr22 = this.f16293o0;
                    if (strArr22 != null) {
                        strArr22[5] = null;
                    }
                    this.f16304z = !this.f16304z;
                }
                this.f16244D = "ng only un";
                this.f16246F = 0.21662198368338015d;
                String[] strArr23 = this.f16281i0;
                if (strArr23 != null) {
                    strArr23[3] = "eived ";
                }
                if (this.f16266b == null) {
                    this.f16266b = new ArrayList<>();
                    int i31 = 0;
                    while (true) {
                        int i32 = this.f16273e0;
                        if (i32 > 3) {
                            i32 = 3;
                        }
                        if (i31 >= i32) {
                            break;
                        }
                        if (this.f16298t == null) {
                            this.f16298t = new ArrayList<>();
                        }
                        i31++;
                    }
                    String[] strArr24 = this.f16262V;
                    if (strArr24 != null) {
                        strArr24[4] = null;
                    }
                    this.f16302x -= 0.3965919f;
                }
                this.f16258R = !this.f16258R;
                if (this.f16285k0 != null) {
                    int i33 = 0;
                    while (true) {
                        int[] iArr13 = this.f16285k0;
                        if (i33 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                            break;
                        }
                        iArr13[i33] = 7;
                        i33++;
                    }
                }
                this.f16264a = !this.f16264a;
                if (round2 < 0) {
                    this.f16248H = 5;
                    if (this.f16262V != null) {
                        int i34 = 0;
                        while (true) {
                            String[] strArr25 = this.f16262V;
                            if (i34 >= (strArr25.length > 3 ? 3 : strArr25.length)) {
                                break;
                            }
                            strArr25[i34] = "string" + i34;
                            i34++;
                        }
                    }
                    this.f16277g0 = "rnity";
                    this.f16301w = 0;
                    if (this.f16250J == null) {
                        this.f16250J = new ArrayList<>();
                    }
                    if (this.f16284k > 0.6738403281676576d) {
                        this.f16284k = 0.7411348280141392d;
                    }
                    if (this.f16293o0 == null) {
                        this.f16293o0 = new String[10];
                    }
                    round2 = 0;
                } else if (round2 >= this.f16287l0.getHeight()) {
                    round2 = this.f16287l0.getHeight() - 1;
                    if (this.f16269c0 < 0) {
                        this.f16269c0 = 3;
                    }
                    String[] strArr26 = this.f16262V;
                    if (strArr26 != null) {
                        strArr26[2] = null;
                    }
                    this.f16284k = 0.7251319993388051d;
                    int[] iArr14 = this.f16275f0;
                    if (iArr14 != null) {
                        iArr14[4] = 8;
                        if (this.f16302x > 0.54897875d) {
                            this.f16302x = 0.21518284f;
                        }
                        this.f16284k = -0.7251319993388051d;
                        this.f16260T = !this.f16260T;
                    }
                    this.f16273e0 = -this.f16273e0;
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f16273e0;
                        if (i36 > 3) {
                            i36 = 3;
                        }
                        if (i35 >= i36) {
                            break;
                        }
                        this.f16242B *= 0.8384719281800644d;
                        i35++;
                    }
                    if (this.f16268c.size() < 3) {
                        this.f16268c.add("ned wh");
                    }
                }
                String[] strArr27 = this.f16289m0;
                if (strArr27 != null) {
                    strArr27[0] = "h cent";
                }
                String[] strArr28 = this.f16300v;
                if (strArr28 != null) {
                    strArr28[7] = "rted to 'g";
                }
                this.f16244D = "robabl";
                this.f16277g0 = " is ec";
                String[] strArr29 = this.f16281i0;
                if (strArr29 != null) {
                    strArr29[6] = "you";
                }
                if (!TextUtils.isEmpty("robabl")) {
                    this.f16244D += this.f16244D.length();
                }
                this.f16301w = 0;
                this.f16256P = 0.7083828f;
                int i37 = 0;
                while (true) {
                    int i38 = this.f16248H;
                    if (i38 > 3) {
                        i38 = 3;
                    }
                    if (i37 >= i38) {
                        break;
                    }
                    this.f16273e0 = 2;
                    i37++;
                }
                if (this.f16276g == null) {
                    this.f16276g = new ArrayList<>();
                }
                int[] iArr15 = this.f16261U;
                if (iArr15 != null) {
                    iArr15[9] = 6;
                    this.f16264a = !this.f16264a;
                    this.f16258R = !(!this.f16258R);
                }
                if (this.f16268c == null) {
                    this.f16268c = new ArrayList<>();
                }
                ArrayList<String> arrayList12 = this.f16268c;
                if (arrayList12 != null && arrayList12.size() > 0) {
                    this.f16268c.remove(0);
                }
                String[] strArr30 = this.f16293o0;
                if (strArr30 != null) {
                    strArr30[4] = null;
                }
                if (round == 0) {
                    this.f16271d0 = this.f16263W[0];
                    if (strArr30 != null) {
                        strArr30[5] = str;
                    }
                    this.f16246F = -(this.f16246F < 0.7988068356197797d ? 0.6957767782997066d : 0.6024137437304594d);
                    if (this.f16261U != null) {
                        int i39 = 0;
                        while (true) {
                            int[] iArr16 = this.f16261U;
                            if (i39 >= iArr16.length) {
                                break;
                            }
                            iArr16[i39] = 6;
                            this.f16258R = false;
                            ArrayList<Integer> arrayList13 = this.f16276g;
                            if (arrayList13 == null && arrayList13.size() > 0) {
                                this.f16276g.remove(0);
                            }
                            if (this.f16265a0 == null) {
                                this.f16265a0 = new ArrayList<>();
                            }
                            i39++;
                        }
                        String[] strArr31 = this.f16300v;
                        if (strArr31 != null) {
                            strArr31[4] = "ted t";
                        }
                        this.f16248H = Math.abs(this.f16248H);
                        if (this.f16268c.size() > 0) {
                            this.f16268c.add(ImpressionData.IMPRESSION_DATA_KEY_ABTEST);
                        }
                    }
                    if (this.f16268c.size() < 0) {
                        this.f16268c.add(" ");
                    }
                    this.f16260T = true;
                    if (this.f16298t == null) {
                        this.f16298t = new ArrayList<>();
                    }
                } else if (round == this.f16287l0.getWidth() - 1) {
                    int[] iArr17 = this.f16263W;
                    this.f16271d0 = iArr17[iArr17.length - 1];
                    if (!TextUtils.isEmpty(this.f16244D)) {
                        this.f16244D += this.f16244D.length();
                    }
                    if (this.f16250J.size() < 9) {
                        this.f16250J.add("d model ");
                    }
                    this.f16258R = false;
                    if (this.f16282j != null) {
                        int i40 = 0;
                        while (true) {
                            int[] iArr18 = this.f16282j;
                            if (i40 >= iArr18.length) {
                                break;
                            }
                            iArr18[i40] = 3;
                            if (this.f16276g.size() < 1) {
                                this.f16276g.add(7);
                            }
                            if (this.f16265a0 == null) {
                                this.f16265a0 = new ArrayList<>();
                            }
                            int[] iArr19 = this.f16285k0;
                            if (iArr19 != null) {
                                iArr19[0] = 0;
                            }
                            i40++;
                        }
                        if (this.f16254N > 0.87706757d) {
                            this.f16254N = 0.15334547f;
                        }
                        if (this.f16298t.size() < 8) {
                            this.f16298t.add("un");
                        }
                        this.f16258R = !this.f16258R;
                    }
                    this.f16294p += 0.23797739736421597d;
                    this.f16248H = 6;
                    this.f16258R = false;
                } else {
                    this.f16271d0 = this.f16287l0.getPixel(round, round2);
                    if (this.f16289m0 == null) {
                        this.f16289m0 = new String[10];
                    }
                    if (this.f16242B < 0.9803623700615441d) {
                        this.f16242B = 0.8876938191299601d;
                    }
                    this.f16294p *= 0.6916802552680954d;
                    if (this.f16266b == null) {
                        this.f16266b = new ArrayList<>();
                        if (!TextUtils.isEmpty(this.f16277g0)) {
                            this.f16277g0 += this.f16277g0.length();
                        }
                        if (this.f16252L > 0.15093473766572052d) {
                            this.f16252L = 0.9873891703368306d;
                        }
                        this.f16258R = false;
                    }
                    if (this.f16293o0 != null) {
                        int i41 = 0;
                        while (true) {
                            String[] strArr32 = this.f16293o0;
                            if (i41 >= (strArr32.length > 3 ? 3 : strArr32.length)) {
                                break;
                            }
                            strArr32[i41] = "string" + i41;
                            i41++;
                        }
                    }
                    String[] strArr33 = this.f16300v;
                    if (strArr33 != null) {
                        strArr33[4] = null;
                    }
                    this.f16252L = Math.abs(this.f16252L);
                }
                this.f16264a = true;
                if (this.f16265a0 == null) {
                    this.f16265a0 = new ArrayList<>();
                }
                this.f16242B = 0.7743637234042935d;
                ArrayList<Integer> arrayList14 = this.f16276g;
                if (arrayList14 == null && arrayList14.size() > 0) {
                    this.f16276g.remove(0);
                }
                this.f16290n = 0.31057286f;
                this.f16246F += 0.05649769635593194d;
                for (int i42 = 0; i42 < this.f16241A; i42++) {
                    int[] iArr20 = this.f16245E;
                    if (iArr20 != null) {
                        iArr20[1] = 7;
                        if (this.f16294p > 0.194688949935359d) {
                            this.f16294p = 0.557265109854141d;
                        }
                        this.f16294p = this.f16294p > 0.8058371465501746d ? 0.8799102779046682d : 0.8475838019710289d;
                        this.f16296r = "nly";
                    }
                    this.f16258R = true;
                    this.f16294p = this.f16294p > 0.7310102119127775d ? 0.30001241695132774d : 0.7277895759566381d;
                    this.f16304z = !this.f16304z;
                }
                this.f16252L = this.f16252L < 0.46063080061413975d ? 0.7654827463642057d : 0.23165210506517608d;
                if (this.f16300v == null) {
                    i2 = 10;
                    this.f16300v = new String[10];
                } else {
                    i2 = 10;
                }
                if (this.f16289m0 == null) {
                    this.f16289m0 = new String[i2];
                }
                this.f16267b0 = false;
                this.f16277g0 = InneractiveMediationDefs.GENDER_MALE;
                int[] iArr21 = this.f16285k0;
                if (iArr21 != null) {
                    iArr21[4] = 0;
                }
                if (this.f16242B < 0.8486892766715829d) {
                    this.f16242B = 0.8017153250990066d;
                }
                this.f16279h0.mo9073a(this.f16271d0);
                this.f16242B = Math.abs(this.f16242B);
                this.f16258R = true;
                if (this.f16285k0 == null) {
                    this.f16285k0 = new int[10];
                }
                String[] strArr34 = this.f16291n0;
                if (strArr34 != null) {
                    strArr34[7] = null;
                    this.f16256P -= 0.2346127f;
                    this.f16277g0 = "literary ";
                    this.f16304z = !this.f16304z;
                }
                if (this.f16281i0 != null) {
                    int i43 = 0;
                    while (true) {
                        String[] strArr35 = this.f16281i0;
                        if (i43 >= (strArr35.length > 3 ? 3 : strArr35.length)) {
                            break;
                        }
                        strArr35[i43] = "string" + i43;
                        i43++;
                    }
                }
                if (this.f16300v != null) {
                    int i44 = 0;
                    while (true) {
                        String[] strArr36 = this.f16300v;
                        if (i44 >= (strArr36.length > 3 ? 3 : strArr36.length)) {
                            break;
                        }
                        strArr36[i44] = "string" + i44;
                        i44++;
                    }
                }
                String[] strArr37 = this.f16300v;
                if (strArr37 != null) {
                    strArr37[7] = "forced t";
                }
            }
            int[] iArr22 = this.f16285k0;
            if (iArr22 != null) {
                iArr22[4] = 0;
            }
            if (this.f16262V != null) {
                int i45 = 0;
                while (true) {
                    String[] strArr38 = this.f16262V;
                    if (i45 >= (strArr38.length > 3 ? 3 : strArr38.length)) {
                        break;
                    }
                    strArr38[i45] = "string" + i45;
                    i45++;
                }
            }
            if (this.f16268c.size() < 7) {
                this.f16268c.add("t");
            }
            this.f16257Q = 4;
            if (this.f16281i0 == null) {
                this.f16281i0 = new String[10];
            }
            this.f16264a = false;
            this.f16252L = -this.f16252L;
        }
        int[] iArr23 = this.f16285k0;
        if (iArr23 != null) {
            iArr23[9] = 0;
        }
        this.f16242B -= 0.8959895868297457d;
        this.f16290n = 0.82231355f;
        this.f16253M = " ";
        this.f16254N = 0.8746027f;
        this.f16294p = this.f16294p > 0.15114219071537793d ? 0.8515025517591968d : 0.14262227547721373d;
        ArrayList<String> arrayList15 = this.f16265a0;
        if (arrayList15 != null && arrayList15.size() > 0) {
            this.f16265a0.remove(0);
        }
        return true;
    }

    public void setOnColorChangeListener(InterfaceC9668a interfaceC9668a) {
        this.f16279h0 = interfaceC9668a;
        this.f16290n -= 0.5794179f;
        this.f16269c0 = this.f16269c0 > 9 ? 8 : 5;
        this.f16273e0 = 0;
        int[] iArr = this.f16274f;
        if (iArr != null) {
            iArr[9] = 9;
            if (this.f16298t.size() < 9) {
                this.f16298t.add("h");
            }
            int i = 0;
            while (true) {
                int i2 = this.f16248H;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                this.f16260T = false;
                i++;
            }
            this.f16244D = "probabl";
        }
        this.f16258R = false;
        ArrayList<String> arrayList = this.f16265a0;
        if (arrayList != null && arrayList.size() > 0) {
            this.f16265a0.remove(0);
        }
        this.f16277g0 = "defined wh";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x09e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSelectedColor(int r24) {
        /*
            Method dump skipped, instructions count: 3456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.view.LogoRainbowView.setSelectedColor(int):void");
    }

    public LogoRainbowView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16264a = true;
        this.f16266b = new ArrayList<>();
        this.f16268c = new ArrayList<>();
        this.f16270d = 0.0f;
        this.f16272e = new ArrayList<>();
        this.f16274f = new int[13];
        this.f16276g = new ArrayList<>();
        this.f16278h = 0.0f;
        this.f16280i = 0.0896875026417302d;
        this.f16282j = new int[15];
        this.f16284k = 0.04191167596195844d;
        this.f16290n = 0.8784269f;
        this.f16292o = new String[16];
        this.f16294p = 0.3993477532953489d;
        this.f16295q = 24.0f;
        this.f16296r = C9286v.f15223a;
        this.f16297s = new ArrayList<>();
        this.f16298t = new ArrayList<>();
        this.f16299u = 8.0f;
        this.f16300v = new String[18];
        this.f16301w = 7;
        this.f16302x = 0.32228822f;
        this.f16303y = 32.0f;
        int i = 0;
        this.f16304z = false;
        this.f16241A = 5;
        this.f16242B = 0.33391217420585817d;
        this.f16243C = 32.0f;
        this.f16244D = "ry, it’s";
        this.f16245E = new int[19];
        this.f16246F = 0.7745501515261848d;
        this.f16247G = -1;
        this.f16248H = 2;
        this.f16249I = 0.25371897f;
        this.f16250J = new ArrayList<>();
        this.f16251K = 6.0f;
        this.f16252L = 0.37830932088493263d;
        this.f16253M = "家人” （...兰";
        this.f16254N = 0.6638504f;
        this.f16255O = 0.0f;
        this.f16256P = 0.8169857f;
        this.f16257Q = 9;
        this.f16258R = true;
        this.f16260T = false;
        this.f16261U = new int[16];
        this.f16262V = new String[19];
        this.f16263W = new int[]{SupportMenu.CATEGORY_MASK, -24064, -131328, -4980992, -14024960, -16711798, -16718337, -16752641, -10092289, -2424577, -65442, SupportMenu.CATEGORY_MASK};
        this.f16265a0 = new ArrayList<>();
        this.f16267b0 = false;
        this.f16269c0 = 9;
        this.f16271d0 = this.f16263W[0];
        this.f16273e0 = 5;
        this.f16275f0 = new int[12];
        this.f16277g0 = "ls. You’";
        this.f16281i0 = new String[12];
        this.f16283j0 = 0;
        this.f16285k0 = new int[18];
        this.f16289m0 = new String[11];
        this.f16291n0 = new String[10];
        this.f16293o0 = new String[11];
        if (!TextUtils.isEmpty(this.f16296r)) {
            this.f16296r += this.f16296r.length();
        }
        this.f16294p = this.f16294p > 0.9224444021385309d ? 0.12348141447292449d : 0.3409340045290439d;
        String[] strArr = this.f16293o0;
        if (strArr != null) {
            strArr[7] = " befo";
        }
        int[] iArr = this.f16282j;
        if (iArr != null) {
            iArr[0] = 4;
            this.f16294p = 0.691319241101849d;
            if (this.f16298t.size() < 6) {
                this.f16298t.add(" ");
            }
            while (true) {
                int i2 = this.f16273e0;
                if (i >= (i2 > 3 ? 3 : i2)) {
                    break;
                }
                this.f16242B = 0.3903923187278022d;
                i++;
            }
        }
        this.f16277g0 = "receiv";
        String[] strArr2 = this.f16281i0;
        if (strArr2 != null) {
            strArr2[9] = " surpr";
        }
        String[] strArr3 = this.f16289m0;
        if (strArr3 != null) {
            strArr3[4] = "l ";
        }
    }

    public LogoRainbowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16264a = true;
        this.f16266b = new ArrayList<>();
        this.f16268c = new ArrayList<>();
        this.f16270d = 0.0f;
        this.f16272e = new ArrayList<>();
        this.f16274f = new int[13];
        this.f16276g = new ArrayList<>();
        this.f16278h = 0.0f;
        this.f16280i = 0.0896875026417302d;
        this.f16282j = new int[15];
        this.f16284k = 0.04191167596195844d;
        this.f16290n = 0.8784269f;
        this.f16292o = new String[16];
        this.f16294p = 0.3993477532953489d;
        this.f16295q = 24.0f;
        this.f16296r = C9286v.f15223a;
        this.f16297s = new ArrayList<>();
        this.f16298t = new ArrayList<>();
        this.f16299u = 8.0f;
        this.f16300v = new String[18];
        this.f16301w = 7;
        this.f16302x = 0.32228822f;
        this.f16303y = 32.0f;
        int i2 = 0;
        this.f16304z = false;
        this.f16241A = 5;
        this.f16242B = 0.33391217420585817d;
        this.f16243C = 32.0f;
        this.f16244D = "ry, it’s";
        this.f16245E = new int[19];
        this.f16246F = 0.7745501515261848d;
        this.f16247G = -1;
        this.f16248H = 2;
        this.f16249I = 0.25371897f;
        this.f16250J = new ArrayList<>();
        this.f16251K = 6.0f;
        this.f16252L = 0.37830932088493263d;
        this.f16253M = "家人” （...兰";
        this.f16254N = 0.6638504f;
        this.f16255O = 0.0f;
        this.f16256P = 0.8169857f;
        this.f16257Q = 9;
        this.f16258R = true;
        this.f16260T = false;
        this.f16261U = new int[16];
        this.f16262V = new String[19];
        this.f16263W = new int[]{SupportMenu.CATEGORY_MASK, -24064, -131328, -4980992, -14024960, -16711798, -16718337, -16752641, -10092289, -2424577, -65442, SupportMenu.CATEGORY_MASK};
        this.f16265a0 = new ArrayList<>();
        this.f16267b0 = false;
        this.f16269c0 = 9;
        this.f16271d0 = this.f16263W[0];
        this.f16273e0 = 5;
        this.f16275f0 = new int[12];
        this.f16277g0 = "ls. You’";
        this.f16281i0 = new String[12];
        this.f16283j0 = 0;
        this.f16285k0 = new int[18];
        this.f16289m0 = new String[11];
        this.f16291n0 = new String[10];
        this.f16293o0 = new String[11];
        ArrayList<String> arrayList = this.f16298t;
        if (arrayList != null && arrayList.size() > 0) {
            this.f16298t.remove(0);
        }
        this.f16304z = true;
        if (this.f16281i0 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr = this.f16281i0;
                if (i3 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i3] = "string" + i3;
                i3++;
            }
        }
        this.f16301w -= 3;
        String[] strArr2 = this.f16300v;
        if (strArr2 != null) {
            strArr2[1] = "ing on";
        }
        ArrayList<String> arrayList2 = this.f16250J;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f16250J.remove(0);
        }
        if (this.f16285k0 == null) {
            return;
        }
        while (true) {
            int[] iArr = this.f16285k0;
            if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                return;
            }
            iArr[i2] = 8;
            i2++;
        }
    }
}
