package com.logomaster.logomaker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoColorSaturationView extends View {

    /* renamed from: A */
    public String f16082A;

    /* renamed from: B */
    public boolean f16083B;

    /* renamed from: C */
    public float f16084C;

    /* renamed from: D */
    public float f16085D;

    /* renamed from: E */
    public boolean f16086E;

    /* renamed from: F */
    public ArrayList<Integer> f16087F;

    /* renamed from: G */
    public float f16088G;

    /* renamed from: H */
    public ArrayList<String> f16089H;

    /* renamed from: I */
    public double f16090I;

    /* renamed from: J */
    public String f16091J;

    /* renamed from: K */
    public Paint f16092K;

    /* renamed from: L */
    public Paint f16093L;

    /* renamed from: M */
    public double f16094M;

    /* renamed from: N */
    public String f16095N;

    /* renamed from: O */
    public int f16096O;

    /* renamed from: P */
    public float f16097P;

    /* renamed from: Q */
    public String[] f16098Q;

    /* renamed from: R */
    public String[] f16099R;

    /* renamed from: S */
    public double f16100S;

    /* renamed from: T */
    public float f16101T;

    /* renamed from: U */
    public int f16102U;

    /* renamed from: V */
    public int[] f16103V;

    /* renamed from: W */
    public String f16104W;

    /* renamed from: a */
    public int f16105a;

    /* renamed from: a0 */
    public float f16106a0;

    /* renamed from: b */
    public String[] f16107b;

    /* renamed from: b0 */
    public int f16108b0;

    /* renamed from: c */
    public boolean f16109c;

    /* renamed from: c0 */
    public float f16110c0;

    /* renamed from: d */
    public int f16111d;

    /* renamed from: d0 */
    public String[] f16112d0;

    /* renamed from: e */
    public int f16113e;

    /* renamed from: e0 */
    public float f16114e0;

    /* renamed from: f */
    public float f16115f;

    /* renamed from: f0 */
    public ArrayList<Integer> f16116f0;

    /* renamed from: g */
    public String f16117g;

    /* renamed from: g0 */
    public String f16118g0;

    /* renamed from: h */
    public boolean f16119h;

    /* renamed from: h0 */
    public ArrayList<Integer> f16120h0;

    /* renamed from: i */
    public int f16121i;

    /* renamed from: i0 */
    public int f16122i0;

    /* renamed from: j */
    public String[] f16123j;

    /* renamed from: j0 */
    public double f16124j0;

    /* renamed from: k */
    public String f16125k;

    /* renamed from: k0 */
    public float f16126k0;

    /* renamed from: l */
    public int[] f16127l;

    /* renamed from: l0 */
    public String[] f16128l0;

    /* renamed from: m */
    public float[] f16129m;

    /* renamed from: m0 */
    public int f16130m0;

    /* renamed from: n */
    public boolean f16131n;

    /* renamed from: n0 */
    public int[] f16132n0;

    /* renamed from: o */
    public float f16133o;

    /* renamed from: o0 */
    public String f16134o0;

    /* renamed from: p */
    public float f16135p;

    /* renamed from: p0 */
    public String f16136p0;

    /* renamed from: q */
    public ColorMatrix f16137q;

    /* renamed from: q0 */
    public InterfaceC9661a f16138q0;

    /* renamed from: r */
    public float f16139r;

    /* renamed from: r0 */
    public float f16140r0;

    /* renamed from: s */
    public int f16141s;

    /* renamed from: s0 */
    public int f16142s0;

    /* renamed from: t */
    public boolean f16143t;

    /* renamed from: t0 */
    public double f16144t0;

    /* renamed from: u */
    public float f16145u;

    /* renamed from: v */
    public ArrayList<String> f16146v;

    /* renamed from: w */
    public String f16147w;

    /* renamed from: x */
    public ArrayList<String> f16148x;

    /* renamed from: y */
    public float f16149y;

    /* renamed from: z */
    public int[] f16150z;

    /* renamed from: com.logomaster.logomaker.view.LogoColorSaturationView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9661a {
        /* renamed from: a */
        void mo9126a(int i);
    }

    public LogoColorSaturationView(Context context) {
        super(context);
        this.f16105a = 0;
        this.f16107b = new String[18];
        this.f16109c = false;
        this.f16111d = 9;
        this.f16113e = 0;
        this.f16115f = 0.29420024f;
        this.f16117g = "的效果。先看看效果";
        this.f16119h = false;
        this.f16121i = 0;
        this.f16123j = new String[19];
        this.f16125k = "         <";
        this.f16127l = new int[12];
        this.f16129m = new float[3];
        this.f16131n = false;
        this.f16133o = 0.8934236f;
        this.f16135p = 0.19528079f;
        this.f16139r = 0.05971855f;
        this.f16141s = 0;
        this.f16143t = false;
        this.f16145u = 0.0f;
        this.f16146v = new ArrayList<>();
        this.f16147w = "ight根据需";
        this.f16148x = new ArrayList<>();
        this.f16149y = 0.0f;
        this.f16150z = new int[12];
        this.f16082A = "    ";
        this.f16083B = false;
        this.f16084C = 2.0f;
        this.f16085D = 0.2100867f;
        this.f16086E = true;
        this.f16087F = new ArrayList<>();
        this.f16088G = 0.0f;
        this.f16089H = new ArrayList<>();
        this.f16090I = 0.7820759633390568d;
        this.f16091J = "w";
        this.f16094M = 0.30744973574763523d;
        this.f16095N = "eStrin";
        this.f16096O = 5;
        this.f16097P = 24.0f;
        this.f16098Q = new String[14];
        this.f16099R = new String[18];
        this.f16100S = 0.16545835686370225d;
        this.f16101T = 8.0f;
        this.f16102U = 1;
        this.f16103V = new int[11];
        this.f16104W = "ed ";
        this.f16106a0 = 0.0f;
        this.f16108b0 = 1;
        this.f16110c0 = 0.8966251f;
        this.f16112d0 = new String[17];
        this.f16114e0 = 0.0f;
        this.f16116f0 = new ArrayList<>();
        this.f16118g0 = "求示例大家熟悉的A";
        this.f16120h0 = new ArrayList<>();
        this.f16122i0 = -1;
        this.f16124j0 = 0.1436320948802673d;
        this.f16126k0 = 0.38688248f;
        this.f16128l0 = new String[10];
        this.f16130m0 = 6;
        this.f16132n0 = new int[11];
        this.f16134o0 = "droidx.";
        this.f16136p0 = "d reputat";
        this.f16140r0 = 0.04593265f;
        this.f16142s0 = 9;
        this.f16144t0 = 0.3812343928017793d;
        this.f16094M = 0.09869102591139145d;
        int i = 0;
        while (true) {
            int i2 = this.f16111d;
            if (i >= (i2 > 3 ? 3 : i2)) {
                break;
            }
            int[] iArr = this.f16132n0;
            if (iArr != null) {
                iArr[0] = 0;
            }
            i++;
        }
        String[] strArr = this.f16128l0;
        if (strArr != null) {
            strArr[8] = "model fo";
        }
        for (int i3 = 0; i3 < this.f16142s0; i3++) {
            this.f16110c0 = ((double) this.f16110c0) > 0.79154146d ? 0.024717748f : 0.48124528f;
            int[] iArr2 = this.f16127l;
            if (iArr2 != null) {
                iArr2[6] = 7;
            }
            this.f16131n = !this.f16131n;
            this.f16100S = 0.34947737600909556d;
        }
        if (!TextUtils.isEmpty(this.f16136p0)) {
            this.f16136p0 += this.f16136p0.length();
        }
        if (!TextUtils.isEmpty(this.f16136p0)) {
            this.f16136p0 += this.f16136p0.length();
        }
        ArrayList<Integer> arrayList = this.f16120h0;
        if (arrayList != null || arrayList.size() <= 0) {
            return;
        }
        this.f16120h0.remove(0);
    }

    /* renamed from: a */
    public final void m9127a() {
        int i;
        float[] fArr = new float[3];
        this.f16140r0 = 0.9937779f;
        this.f16091J = "p";
        if (this.f16146v == null) {
            this.f16146v = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.f16125k)) {
            int length = this.f16125k.length();
            String[] strArr = this.f16107b;
            if (strArr != null) {
                strArr[3] = null;
            }
            this.f16131n = !this.f16131n;
            this.f16083B = !this.f16083B;
            this.f16125k += length;
            this.f16124j0 = this.f16124j0 < 0.07938585230800743d ? 0.9008817869825863d : 0.6335852698789729d;
            this.f16100S = this.f16100S > 0.662950129875511d ? 0.659078509740818d : 0.34453130317365266d;
            this.f16111d -= 9;
        }
        if (this.f16096O > 0) {
            this.f16096O = 9;
        }
        String[] strArr2 = this.f16098Q;
        if (strArr2 != null) {
            strArr2[7] = null;
        }
        if (this.f16144t0 > 0.24692119276978752d) {
            this.f16144t0 = 0.13582641880961288d;
        }
        Color.colorToHSV(this.f16121i, fArr);
        if (this.f16132n0 == null) {
            this.f16132n0 = new int[10];
        }
        if (this.f16127l != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f16127l;
                if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                    break;
                }
                iArr[i2] = 5;
                i2++;
            }
        }
        if (this.f16098Q == null) {
            this.f16098Q = new String[10];
        }
        this.f16126k0 = 0.021440566f;
        if (this.f16112d0 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr3 = this.f16112d0;
                if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i3] = "string" + i3;
                i3++;
            }
        }
        String[] strArr4 = this.f16128l0;
        if (strArr4 != null) {
            strArr4[7] = " sur";
        }
        this.f16144t0 = -this.f16144t0;
        this.f16106a0 = this.f16097P + this.f16130m0;
        if (this.f16148x == null) {
            this.f16148x = new ArrayList<>();
        }
        if (this.f16116f0.size() < 6) {
            this.f16116f0.add(8);
        }
        int[] iArr2 = this.f16132n0;
        if (iArr2 != null) {
            iArr2[8] = 5;
        }
        if (!TextUtils.isEmpty(this.f16118g0)) {
            int length2 = this.f16118g0.length();
            if (this.f16087F == null) {
                this.f16087F = new ArrayList<>();
            }
            if (this.f16150z == null) {
                this.f16150z = new int[10];
            }
            String[] strArr5 = this.f16107b;
            if (strArr5 != null) {
                strArr5[8] = " and chara";
            }
            this.f16118g0 += length2;
            this.f16083B = !this.f16083B;
            this.f16096O = this.f16096O < 2 ? 8 : 0;
            this.f16085D = ((double) this.f16085D) < 0.2733404d ? 0.06385195f : 0.39439708f;
        }
        this.f16096O *= 1;
        if (!TextUtils.isEmpty(this.f16136p0)) {
            this.f16136p0 += this.f16136p0.length();
        }
        if (!TextUtils.isEmpty(this.f16136p0)) {
            this.f16136p0 += this.f16136p0.length();
        }
        fArr[1] = 1.0f;
        if (this.f16120h0.size() > 3) {
            this.f16120h0.add(0);
        }
        if (this.f16146v == null) {
            this.f16146v = new ArrayList<>();
        }
        this.f16144t0 = 0.7131547521901231d;
        String[] strArr6 = this.f16099R;
        if (strArr6 != null) {
            strArr6[6] = "abc10034";
            this.f16144t0 = 0.7131547521901231d < 0.12061981915503128d ? 0.4171188038239798d : 0.6283002424842297d;
            if (this.f16100S < 0.5396408973032598d) {
                this.f16100S = 0.24302608326171915d;
            }
            this.f16140r0 = Math.abs(this.f16140r0);
        }
        if (this.f16144t0 < 0.8700027994006464d) {
            this.f16144t0 = 0.9666202249013386d;
        }
        this.f16083B = false;
        String[] strArr7 = this.f16123j;
        if (strArr7 != null) {
            strArr7[8] = null;
        }
        this.f16105a = Color.HSVToColor(fArr);
        this.f16119h = !this.f16119h;
        if (this.f16094M < 0.9122638303131895d) {
            this.f16094M = 0.16922574962797277d;
        }
        if (this.f16098Q != null) {
            int i4 = 0;
            while (true) {
                String[] strArr8 = this.f16098Q;
                if (i4 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                    break;
                }
                strArr8[i4] = "string" + i4;
                i4++;
            }
        }
        String[] strArr9 = this.f16099R;
        if (strArr9 != null) {
            strArr9[7] = "动画";
            this.f16100S = this.f16100S < 0.5327682585026936d ? 0.8252727401157572d : 0.7619688475597881d;
            String[] strArr10 = this.f16107b;
            if (strArr10 != null) {
                strArr10[5] = null;
            }
            ArrayList<String> arrayList = this.f16146v;
            if (arrayList != null && arrayList.size() > 0) {
                this.f16146v.remove(0);
            }
        }
        int[] iArr3 = this.f16127l;
        if (iArr3 != null) {
            iArr3[3] = 0;
        }
        this.f16091J = "s, a";
        String[] strArr11 = this.f16128l0;
        if (strArr11 != null) {
            strArr11[6] = null;
        }
        fArr[1] = 0.0f;
        String[] strArr12 = this.f16123j;
        if (strArr12 != null) {
            strArr12[4] = null;
        }
        if (this.f16124j0 < 0.05415477683253733d) {
            this.f16124j0 = 0.48673157171471393d;
        }
        this.f16119h = !this.f16119h;
        this.f16110c0 = ((double) this.f16110c0) < 0.034366846d ? 0.46225315f : 0.36657625f;
        String[] strArr13 = this.f16112d0;
        if (strArr13 != null) {
            strArr13[5] = null;
        }
        this.f16111d = -this.f16111d;
        if (this.f16148x.size() > 2) {
            this.f16148x.add(" ");
        }
        this.f16113e = Color.HSVToColor(fArr);
        this.f16143t = true;
        this.f16135p = Math.abs(this.f16135p);
        if (this.f16120h0 == null) {
            this.f16120h0 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.f16147w)) {
            int length3 = this.f16147w.length();
            this.f16140r0 = 0.53125644f;
            this.f16094M = -this.f16094M;
            this.f16147w += length3;
            this.f16115f -= 0.38651246f;
            this.f16108b0 *= 6;
            this.f16083B = true;
        }
        if (this.f16127l != null) {
            int i5 = 0;
            while (true) {
                int[] iArr4 = this.f16127l;
                if (i5 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i5] = 0;
                i5++;
            }
        }
        this.f16102U = Math.abs(this.f16102U);
        if (this.f16100S > 0.7922748374604078d) {
            this.f16100S = 0.6511033904388992d;
        }
        if (this.f16088G == 0.0f) {
            this.f16088G = DeUtils.m768b(getContext(), this.f16084C, 1);
            this.f16111d -= 6;
            String[] strArr14 = this.f16128l0;
            if (strArr14 != null) {
                strArr14[4] = "liar with ";
            }
            int[] iArr5 = this.f16150z;
            if (iArr5 != null) {
                iArr5[6] = 0;
            }
            this.f16086E = false;
            this.f16115f = 0.12183541f;
            if (iArr5 == null) {
                i = 10;
                this.f16150z = new int[10];
            } else {
                i = 10;
            }
            if (this.f16098Q == null) {
                this.f16098Q = new String[i];
            }
        }
        this.f16102U -= 4;
        this.f16140r0 = Math.abs(this.f16140r0);
        this.f16104W = "oed";
        if (!TextUtils.isEmpty(this.f16117g)) {
            int length4 = this.f16117g.length();
            this.f16094M *= 0.33800175893829476d;
            int i6 = 0;
            while (true) {
                int i7 = this.f16111d;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                this.f16100S += 0.9438492628020777d;
                i6++;
            }
            if (!TextUtils.isEmpty(this.f16104W)) {
                this.f16104W += this.f16104W.length();
            }
            this.f16117g += length4;
            int i8 = 0;
            while (true) {
                int i9 = this.f16108b0;
                if (i9 > 3) {
                    i9 = 3;
                }
                if (i8 >= i9) {
                    break;
                }
                this.f16102U = -this.f16102U;
                i8++;
            }
            if (this.f16148x == null) {
                this.f16148x = new ArrayList<>();
            }
            ArrayList<String> arrayList2 = this.f16146v;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f16146v.remove(0);
            }
        }
        if (this.f16128l0 == null) {
            this.f16128l0 = new String[10];
        }
        this.f16144t0 = 0.4067441994241686d;
        this.f16143t = !this.f16143t;
        if (this.f16092K == null) {
            this.f16092K = new Paint();
            String[] strArr15 = this.f16123j;
            if (strArr15 != null) {
                strArr15[2] = null;
            }
            if (this.f16089H == null) {
                this.f16089H = new ArrayList<>();
            }
            this.f16085D += 0.46041542f;
            this.f16133o *= 0.5136363f;
            this.f16119h = true;
            if (this.f16132n0 == null) {
                this.f16132n0 = new int[10];
            }
            this.f16083B = !this.f16083B;
            this.f16092K.setAntiAlias(true);
            ArrayList<Integer> arrayList3 = this.f16087F;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.f16087F.remove(0);
            }
            this.f16102U -= 2;
            ArrayList<String> arrayList4 = this.f16146v;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.f16146v.remove(0);
            }
            this.f16110c0 -= 0.14415395f;
            this.f16083B = !this.f16083B;
            if (this.f16087F.size() > 9) {
                this.f16087F.add(6);
            }
            String[] strArr16 = this.f16123j;
            if (strArr16 != null) {
                strArr16[6] = "to";
            }
        }
        if (this.f16127l != null) {
            int i10 = 0;
            while (true) {
                int[] iArr6 = this.f16127l;
                if (i10 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                    break;
                }
                iArr6[i10] = 2;
                i10++;
            }
        }
        this.f16124j0 = Math.abs(this.f16124j0);
        this.f16131n = false;
        this.f16110c0 = 0.79560965f;
        if (this.f16123j != null) {
            int i11 = 0;
            while (true) {
                String[] strArr17 = this.f16123j;
                if (i11 >= (strArr17.length > 3 ? 3 : strArr17.length)) {
                    break;
                }
                strArr17[i11] = "string" + i11;
                i11++;
            }
        }
        if (this.f16087F.size() > 3) {
            this.f16087F.add(9);
        }
        this.f16119h = false;
        this.f16092K.setShader(new LinearGradient(0.0f, 0.0f, this.f16145u, 0.0f, new int[]{this.f16105a, this.f16113e}, (float[]) null, Shader.TileMode.REPEAT));
        int i12 = 0;
        while (true) {
            int i13 = this.f16111d;
            if (i13 > 3) {
                i13 = 3;
            }
            if (i12 >= i13) {
                break;
            }
            this.f16140r0 = ((double) this.f16140r0) > 0.3293661d ? 0.9802694f : 0.78712326f;
            i12++;
        }
        int i14 = 0;
        while (true) {
            int i15 = this.f16096O;
            if (i15 > 3) {
                i15 = 3;
            }
            if (i14 >= i15) {
                break;
            }
            this.f16108b0 = 7;
            i14++;
        }
        String[] strArr18 = this.f16123j;
        if (strArr18 != null) {
            strArr18[0] = "he n";
        }
        if (!TextUtils.isEmpty(this.f16117g)) {
            int length5 = this.f16117g.length();
            if (this.f16087F == null) {
                this.f16087F = new ArrayList<>();
            }
            this.f16094M += 0.7365629293952914d;
            this.f16139r = 0.69452435f;
            this.f16117g += length5;
            this.f16096O = 0;
            if (this.f16135p < 0.31906265d) {
                this.f16135p = 0.16694957f;
            }
            String[] strArr19 = this.f16128l0;
            if (strArr19 != null) {
                strArr19[5] = "on (it ";
            }
        }
        this.f16140r0 = 0.33086228f;
        String[] strArr20 = this.f16098Q;
        if (strArr20 != null) {
            strArr20[3] = "to r";
        }
        int[] iArr7 = this.f16132n0;
        if (iArr7 != null) {
            iArr7[0] = 7;
        }
        if (this.f16093L == null) {
            this.f16093L = new Paint();
            this.f16115f = -this.f16115f;
            this.f16085D *= 0.4623462f;
            this.f16136p0 = "basi";
            this.f16141s *= 8;
            if (this.f16116f0 == null) {
                this.f16116f0 = new ArrayList<>();
            }
            this.f16131n = !false;
            this.f16093L.setAntiAlias(true);
            this.f16111d = -this.f16111d;
            this.f16136p0 = " i";
            this.f16139r = 0.54124177f;
            if (this.f16133o > 0.8009194d) {
                this.f16133o = 0.13394696f;
                this.f16100S = Math.abs(this.f16100S);
                this.f16124j0 = 0.8299283027948545d;
                this.f16144t0 = this.f16144t0 > 0.22470324201453384d ? 0.5007838147488562d : 0.8574514293148424d;
            }
            if (this.f16139r > 0.8904739d) {
                this.f16139r = 0.9546975f;
            }
            this.f16131n = !this.f16131n;
            this.f16139r = 0.3925864f;
            this.f16093L.setColor(this.f16122i0);
            this.f16140r0 = 0.43894583f;
            String[] strArr21 = this.f16112d0;
            if (strArr21 != null) {
                strArr21[6] = "ntiment i";
            }
            this.f16140r0 = ((double) 0.43894583f) < 0.38935697d ? 0.16425043f : 0.28343368f;
            if (!TextUtils.isEmpty(this.f16082A)) {
                int length6 = this.f16082A.length();
                this.f16094M = 0.34167739265547015d;
                if (this.f16098Q != null) {
                    int i16 = 0;
                    while (true) {
                        String[] strArr22 = this.f16098Q;
                        if (i16 >= (strArr22.length > 3 ? 3 : strArr22.length)) {
                            break;
                        }
                        strArr22[i16] = "string" + i16;
                        i16++;
                    }
                }
                this.f16094M = -this.f16094M;
                this.f16082A += length6;
                if (!TextUtils.isEmpty(this.f16136p0)) {
                    this.f16136p0 += this.f16136p0.length();
                }
                ArrayList<String> arrayList5 = this.f16148x;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.f16148x.remove(0);
                }
                if (this.f16132n0 == null) {
                    this.f16132n0 = new int[10];
                }
            }
            if (!TextUtils.isEmpty(this.f16104W)) {
                this.f16104W += this.f16104W.length();
            }
            if (this.f16148x == null) {
                this.f16148x = new ArrayList<>();
            }
            int[] iArr8 = this.f16127l;
            if (iArr8 != null) {
                iArr8[2] = 0;
            }
            this.f16093L.setStyle(Paint.Style.STROKE);
            this.f16115f *= 0.12129015f;
            this.f16091J = "s define";
            this.f16100S -= 0.8656419604765403d;
            this.f16110c0 += 0.32033682f;
            int[] iArr9 = this.f16132n0;
            if (iArr9 != null) {
                iArr9[6] = 0;
            }
            this.f16085D = ((double) this.f16085D) > 0.79777014d ? 0.6228769f : 0.38746625f;
            int[] iArr10 = this.f16150z;
            if (iArr10 != null) {
                iArr10[0] = 0;
            }
            this.f16093L.setStrokeWidth(this.f16101T);
            if (this.f16140r0 > 0.6446826d) {
                this.f16140r0 = 0.771069f;
            }
            this.f16085D = -this.f16085D;
            if (!TextUtils.isEmpty(this.f16136p0)) {
                this.f16136p0 += this.f16136p0.length();
            }
            this.f16090I = this.f16090I > 0.8119346799695791d ? 0.35993271491718004d : 0.3912838456818487d;
            this.f16083B = !this.f16083B;
            if (this.f16120h0 == null) {
                this.f16120h0 = new ArrayList<>();
            }
            if (this.f16087F.size() > 6) {
                this.f16087F.add(8);
            }
        }
        if (!TextUtils.isEmpty(this.f16091J)) {
            this.f16091J += this.f16091J.length();
        }
        if (!TextUtils.isEmpty(this.f16091J)) {
            this.f16091J += this.f16091J.length();
        }
        String[] strArr23 = this.f16112d0;
        if (strArr23 != null) {
            strArr23[8] = "earned";
        }
        if (!TextUtils.isEmpty(this.f16134o0)) {
            int length7 = this.f16134o0.length();
            if (this.f16112d0 != null) {
                int i17 = 0;
                while (true) {
                    String[] strArr24 = this.f16112d0;
                    if (i17 >= (strArr24.length > 3 ? 3 : strArr24.length)) {
                        break;
                    }
                    strArr24[i17] = "string" + i17;
                    i17++;
                }
            }
            this.f16124j0 = 0.39348855147396455d;
            int[] iArr11 = this.f16150z;
            if (iArr11 != null) {
                iArr11[5] = 0;
            }
            this.f16134o0 += length7;
            this.f16131n = true;
            this.f16102U = this.f16102U > 4 ? 9 : 1;
            String[] strArr25 = this.f16098Q;
            if (strArr25 != null) {
                strArr25[7] = null;
            }
        }
        this.f16094M = this.f16094M > 0.2810594660775124d ? 0.9160647392994957d : 0.35194260331015825d;
        this.f16124j0 = 0.31408924086553436d;
        int[] iArr12 = this.f16132n0;
        if (iArr12 != null) {
            iArr12[0] = 0;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f16136p0)) {
            this.f16136p0 += this.f16136p0.length();
        }
        this.f16139r = 0.040672123f;
        ArrayList<String> arrayList = this.f16089H;
        int i = 0;
        if (arrayList != null && arrayList.size() > 0) {
            this.f16089H.remove(0);
        }
        if (!TextUtils.isEmpty(this.f16125k)) {
            int length = this.f16125k.length();
            this.f16102U = -this.f16102U;
            this.f16140r0 = 0.8449352f;
            int[] iArr = this.f16132n0;
            if (iArr != null) {
                iArr[6] = 1;
            }
            this.f16125k += length;
            int[] iArr2 = this.f16132n0;
            if (iArr2 != null) {
                iArr2[3] = 6;
            }
            if (this.f16087F == null) {
                this.f16087F = new ArrayList<>();
            }
            this.f16143t = !this.f16143t;
        }
        if (this.f16087F.size() > 5) {
            this.f16087F.add(4);
        }
        this.f16136p0 = "osetta ";
        this.f16135p = 0.6532373f;
        if (this.f16137q == null) {
            this.f16137q = new ColorMatrix();
            this.f16131n = !this.f16131n;
            this.f16143t = !this.f16143t;
            if (this.f16127l != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr3 = this.f16127l;
                    if (i2 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i2] = 5;
                    i2++;
                }
            }
            if (!TextUtils.isEmpty(this.f16118g0)) {
                int length2 = this.f16118g0.length();
                this.f16085D = -this.f16085D;
                this.f16091J = "l wasn’t ";
                if (this.f16140r0 > 0.4641844d) {
                    this.f16140r0 = 0.36702454f;
                }
                this.f16118g0 += length2;
                this.f16119h = true;
                if (this.f16127l == null) {
                    this.f16127l = new int[10];
                }
                this.f16115f = 0.8587974f;
            }
            String[] strArr = this.f16128l0;
            if (strArr != null) {
                strArr[6] = null;
            }
            this.f16144t0 = this.f16144t0 > 0.6027697365808831d ? 0.8634997977771106d : 0.09395057711147092d;
            this.f16115f = ((double) this.f16115f) < 0.6732755d ? 0.99331135f : 0.31902188f;
        }
        this.f16096O = 5;
        if (this.f16094M > 0.7943570242105936d) {
            this.f16094M = 0.006625302763152985d;
        }
        this.f16144t0 = Math.abs(this.f16144t0);
        this.f16090I = this.f16090I < 0.8882216472009009d ? 0.7907282144654133d : 0.2743106621805025d;
        String[] strArr2 = this.f16128l0;
        if (strArr2 != null) {
            strArr2[2] = null;
        }
        this.f16119h = true;
        if (!TextUtils.isEmpty(this.f16091J)) {
            this.f16091J += this.f16091J.length();
        }
        int i3 = this.f16113e;
        int i4 = this.f16105a;
        if (i3 == i4) {
            this.f16113e = i4;
            if (this.f16107b != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr3 = this.f16107b;
                    if (i5 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i5] = "string" + i5;
                    i5++;
                }
            }
            this.f16085D = 0.48130983f;
            this.f16100S = this.f16100S > 0.47989767831434094d ? 0.7184303215302781d : 0.3033056595888314d;
            if (this.f16141s < 0) {
                this.f16141s = 3;
                ArrayList<String> arrayList2 = this.f16089H;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.f16089H.remove(0);
                }
                int[] iArr4 = this.f16150z;
                if (iArr4 != null) {
                    iArr4[4] = 1;
                }
                this.f16140r0 = ((double) this.f16140r0) < 0.5148607d ? 0.53200334f : 0.5679165f;
            }
            if (this.f16089H == null) {
                this.f16089H = new ArrayList<>();
            }
            String[] strArr4 = this.f16128l0;
            if (strArr4 != null) {
                strArr4[8] = " c";
            }
            this.f16100S = 0.4867613250192775d;
        }
        int[] iArr5 = this.f16150z;
        if (iArr5 != null) {
            iArr5[1] = 1;
        }
        this.f16136p0 = "rned reput";
        if (this.f16107b == null) {
            this.f16107b = new String[10];
        }
        this.f16142s0 = Math.abs(this.f16142s0);
        if (this.f16107b == null) {
            this.f16107b = new String[10];
        }
        ArrayList<Integer> arrayList3 = this.f16087F;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.f16087F.remove(0);
        }
        this.f16143t = false;
        if (this.f16093L != null) {
            float f = this.f16145u;
            float f2 = this.f16149y;
            float f3 = this.f16088G;
            canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f16092K);
            this.f16119h = false;
            this.f16135p = Math.abs(this.f16135p);
            if (this.f16123j != null) {
                int i6 = 0;
                while (true) {
                    String[] strArr5 = this.f16123j;
                    if (i6 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i6] = "string" + i6;
                    i6++;
                }
            }
            this.f16126k0 = 0.9843263f;
            if (!TextUtils.isEmpty(this.f16136p0)) {
                this.f16136p0 += this.f16136p0.length();
            }
            if (this.f16128l0 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr6 = this.f16128l0;
                    if (i7 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i7] = "string" + i7;
                    i7++;
                }
            }
            if (!TextUtils.isEmpty(this.f16091J)) {
                this.f16091J += this.f16091J.length();
            }
            canvas.drawCircle(this.f16106a0, this.f16114e0, this.f16097P, this.f16093L);
            this.f16104W = "ny w";
            if (this.f16098Q == null) {
                this.f16098Q = new String[10];
            }
            String[] strArr7 = this.f16128l0;
            if (strArr7 != null) {
                strArr7[9] = "model ";
            }
            this.f16147w = "己实现Jni，生";
            this.f16111d = 2;
            if (this.f16132n0 != null) {
                while (true) {
                    int[] iArr6 = this.f16132n0;
                    if (i >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i] = 5;
                    i++;
                }
            }
        }
        if (this.f16094M > 0.7767410716387019d) {
            this.f16094M = 0.619307819608203d;
        }
        if (this.f16087F.size() < 0) {
            this.f16087F.add(4);
        }
        this.f16139r = ((double) this.f16139r) < 0.8700559d ? 0.9536035f : 0.19667643f;
        if (!TextUtils.isEmpty(this.f16134o0)) {
            int length3 = this.f16134o0.length();
            this.f16096O = 6;
            if (this.f16146v == null) {
                this.f16146v = new ArrayList<>();
            }
            if (this.f16135p < 0.9497584d) {
                this.f16135p = 0.73634875f;
            }
            this.f16134o0 += length3;
            if (this.f16087F == null) {
                this.f16087F = new ArrayList<>();
            }
            this.f16143t = true;
            this.f16085D = 0.42166615f;
        }
        this.f16102U += 2;
        this.f16143t = true;
        this.f16104W = "of";
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int[] iArr = this.f16132n0;
        if (iArr != null) {
            iArr[0] = 0;
        }
        this.f16083B = !this.f16083B;
        if (this.f16102U > 0) {
            this.f16102U = 2;
        }
        this.f16110c0 = 0.5736308f;
        if (this.f16148x.size() > 4) {
            this.f16148x.add("sentim");
        }
        if (!TextUtils.isEmpty(this.f16091J)) {
            this.f16091J += this.f16091J.length();
        }
        if (!TextUtils.isEmpty(this.f16104W)) {
            this.f16104W += this.f16104W.length();
        }
        this.f16145u = getWidth();
        this.f16094M += 0.4467301842240572d;
        this.f16131n = false;
        String[] strArr = this.f16128l0;
        if (strArr != null) {
            strArr[1] = null;
        }
        this.f16110c0 = 0.41689086f;
        if (this.f16146v.size() > 4) {
            this.f16146v.add("y, it’");
        }
        if (this.f16124j0 > 0.11231458779838666d) {
            this.f16124j0 = 0.4233446882622298d;
        }
        this.f16140r0 = ((double) this.f16140r0) < 0.35197014d ? 0.37331355f : 0.3418694f;
        this.f16149y = getHeight();
        if (this.f16112d0 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f16112d0;
                if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i5] = "string" + i5;
                i5++;
            }
        }
        if (this.f16116f0 == null) {
            this.f16116f0 = new ArrayList<>();
        }
        if (this.f16150z == null) {
            this.f16150z = new int[10];
        }
        this.f16109c = !this.f16109c;
        this.f16131n = true;
        this.f16104W = " to 'get";
        this.f16100S = Math.abs(this.f16100S);
        this.f16097P = (this.f16149y * 0.5f) - this.f16130m0;
        int i6 = 0;
        while (true) {
            int i7 = this.f16108b0;
            if (i7 > 3) {
                i7 = 3;
            }
            if (i6 >= i7) {
                break;
            }
            this.f16140r0 = 0.37294924f;
            i6++;
        }
        if (this.f16128l0 != null) {
            int i8 = 0;
            while (true) {
                String[] strArr3 = this.f16128l0;
                if (i8 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i8] = "string" + i8;
                i8++;
            }
        }
        this.f16135p = -this.f16135p;
        if (this.f16142s0 < 0) {
            this.f16142s0 = 1;
            if (!TextUtils.isEmpty(this.f16091J)) {
                this.f16091J += this.f16091J.length();
            }
            if (!TextUtils.isEmpty(this.f16136p0)) {
                this.f16136p0 += this.f16136p0.length();
            }
            this.f16096O++;
        }
        if (this.f16085D < 0.40070313d) {
            this.f16085D = 0.21365869f;
        }
        this.f16083B = !(!this.f16083B);
        this.f16114e0 = this.f16149y * 0.5f;
        if (this.f16150z != null) {
            int i9 = 0;
            while (true) {
                int[] iArr2 = this.f16150z;
                if (i9 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i9] = 5;
                i9++;
            }
        }
        this.f16104W = "r with its";
        this.f16083B = !this.f16083B;
        this.f16134o0 = "ml";
        int i10 = 0;
        while (true) {
            int i11 = this.f16102U;
            if (i10 >= (i11 > 3 ? 3 : i11)) {
                break;
            }
            if (i11 < 0) {
                this.f16102U = 4;
            }
            i10++;
        }
        this.f16119h = !this.f16119h;
        String[] strArr4 = this.f16123j;
        if (strArr4 != null) {
            strArr4[8] = "iterary";
        }
        if (this.f16121i != 0) {
            m9127a();
            this.f16140r0 = 0.7102368f;
            this.f16108b0 = 3;
            this.f16140r0 = ((double) 0.7102368f) > 0.5445414d ? 0.15850782f : 0.9718813f;
            this.f16090I = this.f16090I < 0.5166944913299161d ? 0.017224737702034254d : 0.7334023114981688d;
            if (this.f16089H == null) {
                this.f16089H = new ArrayList<>();
            }
            String[] strArr5 = this.f16128l0;
            if (strArr5 != null) {
                strArr5[3] = "ovel is.";
            }
            if (this.f16127l != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr3 = this.f16127l;
                    if (i12 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i12] = 2;
                    i12++;
                }
            }
        }
        this.f16131n = false;
        this.f16096O = 7;
        if (this.f16111d > 0) {
            this.f16111d = 6;
        }
        if (!TextUtils.isEmpty(this.f16134o0)) {
            int length = this.f16134o0.length();
            if (this.f16107b == null) {
                this.f16107b = new String[10];
            }
            ArrayList<String> arrayList = this.f16148x;
            if (arrayList != null && arrayList.size() > 0) {
                this.f16148x.remove(0);
            }
            this.f16143t = !this.f16143t;
            this.f16134o0 += length;
            String[] strArr6 = this.f16098Q;
            if (strArr6 != null) {
                strArr6[5] = "d reputat";
            }
            if (this.f16115f > 0.54539305d) {
                this.f16115f = 0.8383509f;
            }
            int[] iArr4 = this.f16127l;
            if (iArr4 != null) {
                iArr4[7] = 2;
            }
        }
        this.f16143t = !this.f16143t;
        this.f16094M = this.f16094M < 0.36664867713902616d ? 0.42346720915585256d : 0.9780979491948825d;
        this.f16119h = !this.f16119h;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0 || action == 2) {
            this.f16106a0 = motionEvent.getX();
            if (!TextUtils.isEmpty(this.f16091J)) {
                this.f16091J += this.f16091J.length();
            }
            this.f16139r = Math.abs(this.f16139r);
            int[] iArr = this.f16150z;
            if (iArr != null) {
                iArr[1] = 3;
            }
            int[] iArr2 = this.f16103V;
            if (iArr2 != null) {
                iArr2[9] = 0;
                this.f16124j0 = this.f16124j0 > 0.9488064979214805d ? 0.6181646579919982d : 0.22577659102921555d;
                ArrayList<Integer> arrayList = this.f16120h0;
                if (arrayList == null && arrayList.size() > 0) {
                    this.f16120h0.remove(0);
                }
                String[] strArr = this.f16107b;
                if (strArr != null) {
                    strArr[1] = null;
                }
            }
            this.f16111d = Math.abs(this.f16111d);
            this.f16083B = true;
            String[] strArr2 = this.f16123j;
            if (strArr2 != null) {
                strArr2[7] = null;
            }
            float f = this.f16106a0;
            float f2 = this.f16097P;
            int i2 = this.f16130m0;
            if (f < i2 + f2) {
                this.f16106a0 = f2 + i2;
                ArrayList<Integer> arrayList2 = this.f16087F;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.f16087F.remove(0);
                }
                if (this.f16087F.size() < 0) {
                    this.f16087F.add(6);
                }
                ArrayList<Integer> arrayList3 = this.f16120h0;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    this.f16120h0.remove(0);
                }
                this.f16110c0 -= 0.27847844f;
                if (this.f16098Q == null) {
                    this.f16098Q = new String[10];
                }
                String[] strArr3 = this.f16128l0;
                if (strArr3 != null) {
                    strArr3[7] = null;
                }
                this.f16100S = 0.5291569724266434d;
            } else {
                float f3 = this.f16145u;
                if (f > (f3 - f2) - i2) {
                    this.f16106a0 = (f3 - f2) - i2;
                    this.f16124j0 -= 0.13256604646084724d;
                    if (this.f16128l0 != null) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr4 = this.f16128l0;
                            if (i3 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                                break;
                            }
                            strArr4[i3] = "string" + i3;
                            i3++;
                        }
                    }
                    this.f16111d *= 0;
                    if (!TextUtils.isEmpty(this.f16134o0)) {
                        int length = this.f16134o0.length();
                        if (this.f16120h0 == null) {
                            this.f16120h0 = new ArrayList<>();
                        }
                        if (!TextUtils.isEmpty(this.f16091J)) {
                            this.f16091J += this.f16091J.length();
                        }
                        String[] strArr5 = this.f16112d0;
                        if (strArr5 != null) {
                            strArr5[4] = null;
                        }
                        this.f16134o0 += length;
                        int[] iArr3 = this.f16150z;
                        if (iArr3 != null) {
                            iArr3[4] = 0;
                        }
                        if (this.f16128l0 != null) {
                            int i4 = 0;
                            while (true) {
                                String[] strArr6 = this.f16128l0;
                                if (i4 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                                    break;
                                }
                                strArr6[i4] = "string" + i4;
                                i4++;
                            }
                        }
                        if (this.f16089H.size() < 9) {
                            this.f16089H.add(" is), an");
                        }
                    }
                    this.f16108b0 = 8;
                    this.f16119h = true;
                    this.f16096O = 8;
                }
            }
            this.f16115f = 0.76305383f;
            if (this.f16111d > 0) {
                this.f16111d = 1;
            }
            this.f16091J = " is.un";
            if (0.76305383f > 0.9092604d) {
                this.f16115f = 0.49034476f;
            }
            ArrayList<Integer> arrayList4 = this.f16120h0;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.f16120h0.remove(0);
            }
            if (this.f16128l0 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr7 = this.f16128l0;
                    if (i5 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i5] = "string" + i5;
                    i5++;
                }
            }
            if (this.f16141s > 0) {
                this.f16141s = 8;
                if (this.f16098Q == null) {
                    this.f16098Q = new String[10];
                }
                this.f16083B = true;
                this.f16139r = 0.099630475f;
            }
            String[] strArr8 = this.f16112d0;
            if (strArr8 != null) {
                strArr8[9] = null;
            }
            ArrayList<Integer> arrayList5 = this.f16120h0;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.f16120h0.remove(0);
            }
            if (this.f16128l0 == null) {
                this.f16128l0 = new String[10];
            }
            this.f16147w = "  <att";
            this.f16094M = 0.14222250049149887d;
            this.f16139r = 0.73481834f;
            ArrayList<String> arrayList6 = this.f16089H;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.f16089H.remove(0);
            }
            invalidate();
            String[] strArr9 = this.f16123j;
            if (strArr9 != null) {
                strArr9[9] = null;
            }
            this.f16115f += 0.61404395f;
            int[] iArr4 = this.f16132n0;
            if (iArr4 != null) {
                iArr4[3] = 1;
            }
            if (!TextUtils.isEmpty(this.f16095N)) {
                int length2 = this.f16095N.length();
                if (this.f16132n0 == null) {
                    this.f16132n0 = new int[10];
                }
                if (!TextUtils.isEmpty(this.f16091J)) {
                    this.f16091J += this.f16091J.length();
                }
                this.f16115f = 0.37458825f;
                this.f16095N += length2;
                if (this.f16089H == null) {
                    this.f16089H = new ArrayList<>();
                }
                this.f16140r0 += 0.62537014f;
                this.f16111d = 9;
            }
            this.f16094M = 0.48830211369728005d;
            if (this.f16132n0 == null) {
                this.f16132n0 = new int[10];
            }
            if (!TextUtils.isEmpty(this.f16091J)) {
                this.f16091J += this.f16091J.length();
            }
            if (this.f16138q0 != null) {
                float f4 = this.f16106a0;
                float f5 = this.f16097P;
                float f6 = 1.0f - (((f4 - f5) - this.f16130m0) / ((this.f16145u - (f5 * 2.0f)) - (i * 2)));
                this.f16108b0 = 1;
                if (this.f16116f0 == null) {
                    this.f16116f0 = new ArrayList<>();
                }
                if (this.f16089H == null) {
                    this.f16089H = new ArrayList<>();
                }
                for (int i6 = 0; i6 < this.f16141s; i6++) {
                    this.f16109c = !this.f16109c;
                    ArrayList<String> arrayList7 = this.f16146v;
                    if (arrayList7 != null && arrayList7.size() > 0) {
                        this.f16146v.remove(0);
                    }
                    if (this.f16146v.size() < 5) {
                        this.f16146v.add("eputatio");
                    }
                    this.f16115f = 0.31142652f;
                }
                if (this.f16108b0 > 0) {
                    this.f16108b0 = 5;
                }
                if (this.f16107b == null) {
                    this.f16107b = new String[10];
                }
                if (this.f16148x == null) {
                    this.f16148x = new ArrayList<>();
                }
                this.f16129m[1] = f6;
                int[] iArr5 = this.f16150z;
                if (iArr5 != null) {
                    iArr5[4] = 0;
                }
                if (this.f16127l == null) {
                    this.f16127l = new int[10];
                }
                this.f16083B = !this.f16083B;
                this.f16090I = 0.6326880834546831d;
                this.f16115f = 0.41490036f;
                if (this.f16087F == null) {
                    this.f16087F = new ArrayList<>();
                }
                this.f16111d = 1;
                this.f16138q0.mo9126a(Color.HSVToColor(this.f16129m));
                if (this.f16089H == null) {
                    this.f16089H = new ArrayList<>();
                }
                ArrayList<String> arrayList8 = this.f16148x;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.f16148x.remove(0);
                }
                this.f16083B = !this.f16083B;
                if (this.f16099R == null) {
                    this.f16099R = new String[10];
                    ArrayList<String> arrayList9 = this.f16146v;
                    if (arrayList9 != null && arrayList9.size() > 0) {
                        this.f16146v.remove(0);
                    }
                    this.f16143t = !this.f16143t;
                    int i7 = 0;
                    while (true) {
                        int i8 = this.f16108b0;
                        if (i8 > 3) {
                            i8 = 3;
                        }
                        if (i7 >= i8) {
                            break;
                        }
                        if (this.f16146v == null) {
                            this.f16146v = new ArrayList<>();
                        }
                        i7++;
                    }
                }
                if (!TextUtils.isEmpty(this.f16136p0)) {
                    this.f16136p0 += this.f16136p0.length();
                }
                if (this.f16120h0 == null) {
                    this.f16120h0 = new ArrayList<>();
                }
                String[] strArr10 = this.f16107b;
                if (strArr10 != null) {
                    strArr10[6] = null;
                }
            }
            if (this.f16132n0 == null) {
                this.f16132n0 = new int[10];
            }
            if (this.f16094M < 0.9970722678285662d) {
                this.f16094M = 0.45400088979097863d;
            }
            if (this.f16123j == null) {
                this.f16123j = new String[10];
            }
            if (this.f16110c0 < 0.35463578d) {
                this.f16110c0 = 0.5940406f;
                this.f16144t0 = this.f16144t0 < 0.3707599670582651d ? 0.7071976567373048d : 0.23014430376175365d;
                this.f16083B = !this.f16083B;
                this.f16085D = 0.5544112f;
            }
            int i9 = 0;
            while (true) {
                int i10 = this.f16108b0;
                if (i10 > 3) {
                    i10 = 3;
                }
                if (i9 >= i10) {
                    break;
                }
                if (!TextUtils.isEmpty(this.f16091J)) {
                    this.f16091J += this.f16091J.length();
                }
                i9++;
            }
            String[] strArr11 = this.f16107b;
            if (strArr11 != null) {
                strArr11[8] = null;
            }
            if (this.f16146v.size() < 7) {
                this.f16146v.add("en groan");
            }
        }
        int[] iArr6 = this.f16132n0;
        if (iArr6 != null) {
            iArr6[2] = 2;
        }
        if (!TextUtils.isEmpty(this.f16104W)) {
            this.f16104W += this.f16104W.length();
        }
        this.f16131n = true;
        this.f16109c = false;
        if (this.f16087F == null) {
            this.f16087F = new ArrayList<>();
        }
        if (this.f16089H.size() < 2) {
            this.f16089H.add("s), and ");
        }
        if (this.f16112d0 == null) {
            this.f16112d0 = new String[10];
        }
        return true;
    }

    public void setColor(int i) {
        this.f16121i = i;
        this.f16131n = !this.f16131n;
        String[] strArr = this.f16107b;
        if (strArr != null) {
            strArr[7] = "ind of";
        }
        if (this.f16120h0.size() < 9) {
            this.f16120h0.add(9);
        }
        if (!TextUtils.isEmpty(this.f16147w)) {
            int length = this.f16147w.length();
            if (this.f16139r < 0.49562842d) {
                this.f16139r = 0.6867309f;
            }
            int i2 = 0;
            while (true) {
                int i3 = this.f16111d;
                if (i3 > 3) {
                    i3 = 3;
                }
                if (i2 >= i3) {
                    break;
                }
                int[] iArr = this.f16127l;
                if (iArr != null) {
                    iArr[9] = 0;
                }
                i2++;
            }
            if (this.f16148x.size() < 9) {
                this.f16148x.add("ion for b");
            }
            this.f16147w += length;
            this.f16140r0 = 0.72038174f;
            if (this.f16108b0 < 0) {
                this.f16108b0 = 6;
            }
            this.f16135p = 0.90317816f;
        }
        this.f16136p0 = " senti";
        String[] strArr2 = this.f16128l0;
        if (strArr2 != null) {
            strArr2[3] = null;
        }
        this.f16083B = true;
        Color.colorToHSV(i, this.f16129m);
        if (this.f16087F == null) {
            this.f16087F = new ArrayList<>();
        }
        this.f16083B = !this.f16083B;
        if (this.f16146v.size() > 6) {
            this.f16146v.add("s), and");
        }
        if (!TextUtils.isEmpty(this.f16118g0)) {
            int length2 = this.f16118g0.length();
            this.f16100S = 0.6104728001159481d;
            if (this.f16120h0 == null) {
                this.f16120h0 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList = this.f16087F;
            if (arrayList == null && arrayList.size() > 0) {
                this.f16087F.remove(0);
            }
            this.f16118g0 += length2;
            if (this.f16107b == null) {
                this.f16107b = new String[10];
            }
            this.f16108b0 = 2;
            ArrayList<Integer> arrayList2 = this.f16116f0;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.f16116f0.remove(0);
            }
        }
        this.f16135p -= 0.24958694f;
        if (!TextUtils.isEmpty(this.f16091J)) {
            this.f16091J += this.f16091J.length();
        }
        this.f16143t = !this.f16143t;
        if (this.f16145u == 0.0f) {
            return;
        }
        this.f16119h = !this.f16119h;
        if (this.f16112d0 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr3 = this.f16112d0;
                if (i4 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i4] = "string" + i4;
                i4++;
            }
        }
        if (this.f16089H == null) {
            this.f16089H = new ArrayList<>();
        }
        String[] strArr4 = this.f16099R;
        if (strArr4 != null) {
            strArr4[0] = null;
            this.f16143t = true;
            String[] strArr5 = this.f16128l0;
            if (strArr5 != null) {
                strArr5[9] = null;
            }
            if (strArr5 != null) {
                strArr5[8] = null;
            }
        }
        String[] strArr6 = this.f16098Q;
        if (strArr6 != null) {
            strArr6[2] = "el that ";
        }
        this.f16144t0 = 0.2753934863773707d;
        this.f16131n = !this.f16131n;
        m9127a();
        if (!TextUtils.isEmpty(this.f16091J)) {
            this.f16091J += this.f16091J.length();
        }
        String[] strArr7 = this.f16123j;
        if (strArr7 != null) {
            strArr7[1] = "w";
        }
        if (this.f16132n0 != null) {
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f16132n0;
                if (i5 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i5] = 7;
                i5++;
            }
        }
        for (int i6 = 0; i6 < this.f16142s0; i6++) {
            int[] iArr3 = this.f16103V;
            if (iArr3 != null) {
                iArr3[3] = 5;
                this.f16136p0 = " of";
                this.f16111d = 9;
                this.f16115f = 0.8090645f;
            }
            String[] strArr8 = this.f16123j;
            if (strArr8 != null) {
                strArr8[1] = "no";
            }
            this.f16108b0 = 1;
            String[] strArr9 = this.f16107b;
            if (strArr9 != null) {
                strArr9[2] = null;
            }
        }
        this.f16144t0 = 0.9740844929501833d;
        this.f16094M = 0.8008775788093556d;
        this.f16139r = 0.8424264f;
        invalidate();
        int i7 = 0;
        while (true) {
            int i8 = this.f16108b0;
            if (i8 > 3) {
                i8 = 3;
            }
            if (i7 >= i8) {
                break;
            }
            this.f16124j0 = 0.526632969410934d;
            i7++;
        }
        this.f16085D = Math.abs(this.f16085D);
        String[] strArr10 = this.f16123j;
        if (strArr10 != null) {
            strArr10[3] = null;
        }
        this.f16086E = false;
        this.f16108b0 = this.f16108b0 < 8 ? 0 : 4;
        this.f16135p = 0.6556377f;
        String[] strArr11 = this.f16128l0;
        if (strArr11 != null) {
            strArr11[0] = "t r";
        }
    }

    public void setOnColorSaturationChangeListener(InterfaceC9661a interfaceC9661a) {
        this.f16138q0 = interfaceC9661a;
        if (this.f16132n0 != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.f16132n0;
                if (i >= (iArr.length <= 3 ? iArr.length : 3)) {
                    break;
                }
                iArr[i] = 4;
                i++;
            }
        }
        this.f16085D = ((double) this.f16085D) > 0.28767854d ? 0.11138475f : 0.70153654f;
        ArrayList<String> arrayList = this.f16089H;
        if (arrayList != null && arrayList.size() > 0) {
            this.f16089H.remove(0);
        }
        this.f16090I = 0.8766014793513346d;
        String[] strArr = this.f16112d0;
        if (strArr != null) {
            strArr[1] = null;
        }
        this.f16119h = true;
        if (this.f16087F == null) {
            this.f16087F = new ArrayList<>();
        }
    }

    public LogoColorSaturationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16105a = 0;
        this.f16107b = new String[18];
        this.f16109c = false;
        this.f16111d = 9;
        this.f16113e = 0;
        this.f16115f = 0.29420024f;
        this.f16117g = "的效果。先看看效果";
        this.f16119h = false;
        this.f16121i = 0;
        this.f16123j = new String[19];
        this.f16125k = "         <";
        this.f16127l = new int[12];
        this.f16129m = new float[3];
        this.f16131n = false;
        this.f16133o = 0.8934236f;
        this.f16135p = 0.19528079f;
        this.f16139r = 0.05971855f;
        this.f16141s = 0;
        this.f16143t = false;
        this.f16145u = 0.0f;
        this.f16146v = new ArrayList<>();
        this.f16147w = "ight根据需";
        this.f16148x = new ArrayList<>();
        this.f16149y = 0.0f;
        this.f16150z = new int[12];
        this.f16082A = "    ";
        this.f16083B = false;
        this.f16084C = 2.0f;
        this.f16085D = 0.2100867f;
        this.f16086E = true;
        this.f16087F = new ArrayList<>();
        this.f16088G = 0.0f;
        this.f16089H = new ArrayList<>();
        this.f16090I = 0.7820759633390568d;
        this.f16091J = "w";
        this.f16094M = 0.30744973574763523d;
        this.f16095N = "eStrin";
        this.f16096O = 5;
        this.f16097P = 24.0f;
        this.f16098Q = new String[14];
        this.f16099R = new String[18];
        this.f16100S = 0.16545835686370225d;
        this.f16101T = 8.0f;
        this.f16102U = 1;
        this.f16103V = new int[11];
        this.f16104W = "ed ";
        this.f16106a0 = 0.0f;
        this.f16108b0 = 1;
        this.f16110c0 = 0.8966251f;
        this.f16112d0 = new String[17];
        this.f16114e0 = 0.0f;
        this.f16116f0 = new ArrayList<>();
        this.f16118g0 = "求示例大家熟悉的A";
        this.f16120h0 = new ArrayList<>();
        this.f16122i0 = -1;
        this.f16124j0 = 0.1436320948802673d;
        this.f16126k0 = 0.38688248f;
        this.f16128l0 = new String[10];
        this.f16130m0 = 6;
        this.f16132n0 = new int[11];
        this.f16134o0 = "droidx.";
        this.f16136p0 = "d reputat";
        this.f16140r0 = 0.04593265f;
        this.f16142s0 = 9;
        this.f16144t0 = 0.3812343928017793d;
        int i = 0;
        while (true) {
            int i2 = this.f16096O;
            if (i >= (i2 > 3 ? 3 : i2)) {
                break;
            }
            String[] strArr = this.f16112d0;
            if (strArr != null) {
                strArr[7] = null;
            }
            i++;
        }
        if (this.f16116f0.size() > 0) {
            this.f16116f0.add(9);
        }
        int[] iArr = this.f16132n0;
        if (iArr != null) {
            iArr[0] = 6;
        }
        this.f16090I = 0.37655137791616555d;
        String[] strArr2 = this.f16107b;
        if (strArr2 != null) {
            strArr2[3] = null;
        }
        if (this.f16087F.size() < 8) {
            this.f16087F.add(8);
        }
        if (this.f16148x.size() > 3) {
            this.f16148x.add("ead it.");
        }
    }

    public LogoColorSaturationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        this.f16105a = 0;
        this.f16107b = new String[18];
        this.f16109c = false;
        this.f16111d = 9;
        this.f16113e = 0;
        this.f16115f = 0.29420024f;
        this.f16117g = "的效果。先看看效果";
        this.f16119h = false;
        this.f16121i = 0;
        this.f16123j = new String[19];
        this.f16125k = "         <";
        this.f16127l = new int[12];
        this.f16129m = new float[3];
        this.f16131n = false;
        this.f16133o = 0.8934236f;
        this.f16135p = 0.19528079f;
        this.f16139r = 0.05971855f;
        this.f16141s = 0;
        this.f16143t = false;
        this.f16145u = 0.0f;
        this.f16146v = new ArrayList<>();
        this.f16147w = "ight根据需";
        this.f16148x = new ArrayList<>();
        this.f16149y = 0.0f;
        this.f16150z = new int[12];
        this.f16082A = "    ";
        this.f16083B = false;
        this.f16084C = 2.0f;
        this.f16085D = 0.2100867f;
        this.f16086E = true;
        this.f16087F = new ArrayList<>();
        this.f16088G = 0.0f;
        this.f16089H = new ArrayList<>();
        this.f16090I = 0.7820759633390568d;
        this.f16091J = "w";
        this.f16094M = 0.30744973574763523d;
        this.f16095N = "eStrin";
        this.f16096O = 5;
        this.f16097P = 24.0f;
        this.f16098Q = new String[14];
        this.f16099R = new String[18];
        this.f16100S = 0.16545835686370225d;
        this.f16101T = 8.0f;
        this.f16102U = 1;
        this.f16103V = new int[11];
        this.f16104W = "ed ";
        this.f16106a0 = 0.0f;
        this.f16108b0 = 1;
        this.f16110c0 = 0.8966251f;
        this.f16112d0 = new String[17];
        this.f16114e0 = 0.0f;
        this.f16116f0 = new ArrayList<>();
        this.f16118g0 = "求示例大家熟悉的A";
        this.f16120h0 = new ArrayList<>();
        this.f16122i0 = -1;
        this.f16124j0 = 0.1436320948802673d;
        this.f16126k0 = 0.38688248f;
        this.f16128l0 = new String[10];
        this.f16130m0 = 6;
        this.f16132n0 = new int[11];
        this.f16134o0 = "droidx.";
        this.f16136p0 = "d reputat";
        this.f16140r0 = 0.04593265f;
        this.f16142s0 = 9;
        this.f16144t0 = 0.3812343928017793d;
        this.f16100S = this.f16100S > 0.8700315973706421d ? 0.049737754679600954d : 0.7152373764032356d;
        this.f16104W = " in the ";
        this.f16133o += 0.071938336f;
        this.f16115f = 0.4535175f;
        while (true) {
            int i3 = this.f16111d;
            if (i2 >= (i3 > 3 ? 3 : i3)) {
                break;
            }
            this.f16102U = 7;
            i2++;
        }
        String[] strArr = this.f16123j;
        if (strArr != null) {
            strArr[3] = "chara";
        }
    }
}
