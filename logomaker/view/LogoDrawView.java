package com.logomaster.logomaker.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.logomaster.logomaker.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class LogoDrawView extends View {

    /* renamed from: A */
    public int f16151A;

    /* renamed from: A0 */
    public boolean f16152A0;

    /* renamed from: B */
    public float f16153B;

    /* renamed from: B0 */
    public boolean f16154B0;

    /* renamed from: C */
    public float f16155C;

    /* renamed from: C0 */
    public Paint f16156C0;

    /* renamed from: D */
    public int f16157D;

    /* renamed from: D0 */
    public Rect f16158D0;

    /* renamed from: E */
    public int f16159E;

    /* renamed from: E0 */
    public Paint f16160E0;

    /* renamed from: F */
    public float f16161F;

    /* renamed from: F0 */
    public Matrix f16162F0;

    /* renamed from: G */
    public float f16163G;

    /* renamed from: G0 */
    public float f16164G0;

    /* renamed from: H */
    public float f16165H;

    /* renamed from: H0 */
    public PaintFlagsDrawFilter f16166H0;

    /* renamed from: I */
    public int f16167I;

    /* renamed from: I0 */
    public Bitmap f16168I0;

    /* renamed from: J */
    public int f16169J;

    /* renamed from: J0 */
    public long f16170J0;

    /* renamed from: K */
    public double f16171K;

    /* renamed from: K0 */
    public float f16172K0;

    /* renamed from: L */
    public String f16173L;

    /* renamed from: L0 */
    public boolean f16174L0;

    /* renamed from: M */
    public InterfaceC9666e f16175M;

    /* renamed from: M0 */
    public int f16176M0;

    /* renamed from: N */
    public InterfaceC9665d f16177N;

    /* renamed from: N0 */
    public Handler f16178N0;

    /* renamed from: O */
    public InterfaceC9663b f16179O;

    /* renamed from: P */
    public InterfaceC9664c f16180P;

    /* renamed from: Q */
    public boolean f16181Q;

    /* renamed from: R */
    public Bitmap f16182R;

    /* renamed from: S */
    public int f16183S;

    /* renamed from: T */
    public int f16184T;

    /* renamed from: U */
    public Bitmap f16185U;

    /* renamed from: V */
    public Paint f16186V;

    /* renamed from: W */
    public Paint f16187W;

    /* renamed from: a */
    public List<LogoDesignSaveEntity> f16188a;

    /* renamed from: a0 */
    public boolean f16189a0;

    /* renamed from: b */
    public LogoDesignSaveEntity f16190b;

    /* renamed from: b0 */
    public boolean f16191b0;

    /* renamed from: c */
    public int f16192c;

    /* renamed from: c0 */
    public InterfaceC9667f f16193c0;

    /* renamed from: d */
    public int f16194d;

    /* renamed from: d0 */
    public String f16195d0;

    /* renamed from: e */
    public int f16196e;

    /* renamed from: e0 */
    public float f16197e0;

    /* renamed from: f */
    public int f16198f;

    /* renamed from: f0 */
    public TimerTask f16199f0;

    /* renamed from: g */
    public final int f16200g;

    /* renamed from: g0 */
    public int f16201g0;

    /* renamed from: h */
    public final int f16202h;

    /* renamed from: h0 */
    public int f16203h0;

    /* renamed from: i */
    public final int f16204i;

    /* renamed from: i0 */
    public int f16205i0;

    /* renamed from: j */
    public final int f16206j;

    /* renamed from: j0 */
    public int f16207j0;

    /* renamed from: k */
    public final float f16208k;

    /* renamed from: k0 */
    public long f16209k0;

    /* renamed from: l */
    public Paint f16210l;

    /* renamed from: l0 */
    public long f16211l0;

    /* renamed from: m */
    public final int f16212m;

    /* renamed from: m0 */
    public boolean f16213m0;

    /* renamed from: n */
    public final int f16214n;

    /* renamed from: n0 */
    public boolean f16215n0;

    /* renamed from: o */
    public Paint f16216o;

    /* renamed from: o0 */
    public PorterDuffXfermode f16217o0;

    /* renamed from: p */
    public Bitmap f16218p;

    /* renamed from: p0 */
    public int f16219p0;

    /* renamed from: q */
    public Bitmap f16220q;

    /* renamed from: q0 */
    public int f16221q0;

    /* renamed from: r */
    public Bitmap f16222r;

    /* renamed from: r0 */
    public int f16223r0;

    /* renamed from: s */
    public Bitmap f16224s;

    /* renamed from: s0 */
    public int f16225s0;

    /* renamed from: t */
    public Bitmap f16226t;

    /* renamed from: t0 */
    public int f16227t0;

    /* renamed from: u */
    public Bitmap f16228u;

    /* renamed from: u0 */
    public int f16229u0;

    /* renamed from: v */
    public Bitmap f16230v;

    /* renamed from: v0 */
    public int f16231v0;

    /* renamed from: w */
    public Bitmap f16232w;

    /* renamed from: w0 */
    public int f16233w0;

    /* renamed from: x */
    public int f16234x;

    /* renamed from: x0 */
    public int f16235x0;

    /* renamed from: y */
    public Map<String, Typeface> f16236y;

    /* renamed from: y0 */
    public int f16237y0;

    /* renamed from: z */
    public final String f16238z;

    /* renamed from: z0 */
    public int f16239z0;

    /* renamed from: com.logomaster.logomaker.view.LogoDrawView$a */
    /* loaded from: classes3.dex */
    public class HandlerC9662a extends Handler {
        public HandlerC9662a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            LogoDrawView.this.invalidate();
            if (LogoDrawView.this.f16176M0 > 0) {
                LogoDrawView.m9103b(LogoDrawView.this);
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.view.LogoDrawView$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9663b {
        /* renamed from: a */
        void mo9078a(int i);
    }

    /* renamed from: com.logomaster.logomaker.view.LogoDrawView$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9664c {
        /* renamed from: a */
        void mo9077a();
    }

    /* renamed from: com.logomaster.logomaker.view.LogoDrawView$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC9665d {
        /* renamed from: a */
        void mo9076a(int i);
    }

    /* renamed from: com.logomaster.logomaker.view.LogoDrawView$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC9666e {
        /* renamed from: a */
        void mo9075a(int i, LogoBaseSaveEntity logoBaseSaveEntity);
    }

    /* renamed from: com.logomaster.logomaker.view.LogoDrawView$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC9667f {
        /* renamed from: a */
        void mo9074a(boolean z);
    }

    public LogoDrawView(Context context) {
        super(context);
        this.f16192c = 0;
        this.f16194d = -1;
        this.f16200g = 4;
        this.f16202h = 54;
        this.f16204i = 116;
        this.f16206j = 232;
        this.f16208k = 31.0f;
        this.f16212m = -13421773;
        this.f16214n = 1;
        this.f16234x = 18;
        this.f16238z = "fonts/";
        this.f16151A = -1;
        this.f16181Q = false;
        this.f16183S = -1;
        this.f16184T = -1;
        this.f16191b0 = false;
        this.f16201g0 = -1;
        this.f16203h0 = -1;
        this.f16205i0 = -1;
        this.f16207j0 = -1;
        this.f16219p0 = 20;
        this.f16221q0 = 10;
        this.f16223r0 = 50;
        this.f16225s0 = 80;
        this.f16227t0 = 20;
        this.f16231v0 = ((50 * 2) - 20) + 80;
        this.f16233w0 = 4;
        this.f16235x0 = -1;
        this.f16166H0 = new PaintFlagsDrawFilter(0, 3);
        this.f16172K0 = 0.0f;
        this.f16174L0 = true;
        this.f16176M0 = 1;
        this.f16178N0 = new HandlerC9662a(Looper.getMainLooper());
        boolean z = this.f16174L0;
        if (z) {
            this.f16174L0 = !z;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ int m9103b(LogoDrawView logoDrawView) {
        int i = logoDrawView.f16176M0;
        logoDrawView.f16176M0 = i + 1;
        return i;
    }

    /* renamed from: A */
    public boolean m9125A() {
        int i = this.f16176M0;
        if (i > 11708) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        return this.f16152A0;
    }

    /* renamed from: B */
    public boolean m9124B() {
        List<LogoDesignSaveEntity> list;
        int i;
        boolean z;
        int i2 = this.f16176M0;
        if (i2 > 1078) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (!this.f16154B0 && (list = this.f16188a) != null && (i = this.f16192c) >= 0 && i < list.size()) {
            LogoDesignSaveEntity logoDesignSaveEntity = this.f16188a.get(this.f16192c);
            if (logoDesignSaveEntity.m178d() == null && logoDesignSaveEntity.m179c() == null) {
                List<LogoBaseSaveEntity> m170l = logoDesignSaveEntity.m170l();
                if (m170l != null) {
                    int size = m170l.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (!m170l.get(i3).m810f()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                return !z;
            }
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public boolean m9123C() {
        return this.f16181Q;
    }

    /* renamed from: D */
    public void m9122D(float f, float f2) {
        if (this.f16194d != -1) {
            LogoBaseSaveEntity logoBaseSaveEntity = this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoBaseSaveEntity.m803m(logoBaseSaveEntity.m812d() + f);
            logoBaseSaveEntity.m802n(logoBaseSaveEntity.m811e() + f2);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoBaseSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: E */
    public void m9121E() {
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || list.size() == 0) {
            return;
        }
        int i = this.f16192c + 1;
        this.f16192c = i;
        if (i > this.f16188a.size() - 1) {
            this.f16192c = this.f16188a.size() - 1;
        }
        int i2 = this.f16176M0;
        if (i2 > 35) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        InterfaceC9665d interfaceC9665d = this.f16177N;
        if (interfaceC9665d != null) {
            interfaceC9665d.mo9076a(this.f16192c);
        }
        int i3 = this.f16176M0;
        if (i3 > 55) {
            this.f16176M0 = i3 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        invalidate();
    }

    /* renamed from: F */
    public void m9120F() {
        if (this.f16190b != null) {
            if (this.f16188a == null) {
                ArrayList arrayList = new ArrayList();
                this.f16188a = arrayList;
                arrayList.add(new LogoDesignSaveEntity());
            }
            this.f16188a.set(this.f16192c, this.f16190b);
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.Uri m9119G() {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.view.LogoDrawView.m9119G():android.net.Uri");
    }

    /* renamed from: H */
    public void m9118H() {
        if (this.f16188a == null) {
            ArrayList arrayList = new ArrayList();
            this.f16188a = arrayList;
            arrayList.add(new LogoDesignSaveEntity());
        }
        if (this.f16190b != null) {
            LogoLogUtils.m22166d("LogoDrawView", new Throwable(), this.f16190b.toString());
            List<LogoDesignSaveEntity> subList = this.f16188a.subList(0, this.f16192c + 1);
            this.f16188a = subList;
            subList.add(this.f16192c, this.f16190b);
            this.f16190b = null;
            int size = this.f16188a.size() - 1;
            this.f16192c = size;
            InterfaceC9665d interfaceC9665d = this.f16177N;
            if (interfaceC9665d != null) {
                interfaceC9665d.mo9076a(size);
            }
        }
        this.f16154B0 = false;
        invalidate();
    }

    /* renamed from: I */
    public final void m9117I(Context context, String str, Bitmap bitmap) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    /* renamed from: J */
    public void m9116J() {
        if (this.f16194d != -1) {
            m9092m();
            LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoImageSaveEntity.m28v(!logoImageSaveEntity.m30t());
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoImageSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: K */
    public void m9115K() {
        if (this.f16194d != -1) {
            m9092m();
            LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoImageSaveEntity.m27w(!logoImageSaveEntity.m29u());
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoImageSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: L */
    public void m9114L() {
        if (this.f16194d != -1) {
            m9092m();
            LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoImageSaveEntity.m802n((this.f16198f - logoImageSaveEntity.m814b()) * 0.5f);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoImageSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: M */
    public void m9113M() {
        if (this.f16194d != -1) {
            m9092m();
            this.f16188a.get(this.f16192c).m170l().get(this.f16194d).m807i(true);
            InterfaceC9666e interfaceC9666e = this.f16175M;
            if (interfaceC9666e != null) {
                interfaceC9666e.mo9075a(-1, null);
            }
            this.f16194d = -1;
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: N */
    public void m9112N() {
        m9106T((LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d));
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: O */
    public void m9111O() {
        if (this.f16194d != -1) {
            m9092m();
            LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoImageSaveEntity.m803m((this.f16196e - logoImageSaveEntity.m813c()) * 0.5f);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoImageSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: P */
    public void m9110P(int i, boolean z) {
        int i2;
        List<LogoBaseSaveEntity> m170l;
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list != null && (i2 = this.f16192c) >= 0 && i2 < list.size() && (m170l = this.f16188a.get(this.f16192c).m170l()) != null && m170l.size() > 0) {
            int i3 = -1;
            for (int size = m170l.size() - 1; size >= 0; size--) {
                if (!m170l.get(size).m810f() && (i3 = i3 + 1) == i) {
                    if (z) {
                        this.f16194d = -1;
                    } else {
                        this.f16194d = size;
                    }
                    this.f16188a.get(this.f16192c).m170l().get(size).m806j(z);
                    invalidate();
                    return;
                }
            }
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = !z2;
        }
    }

    /* renamed from: Q */
    public void m9109Q(int i, boolean z) {
        int i2;
        List<LogoBaseSaveEntity> m170l;
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list != null && (i2 = this.f16192c) >= 0 && i2 < list.size() && (m170l = this.f16188a.get(this.f16192c).m170l()) != null && m170l.size() > 0) {
            int i3 = -1;
            for (int size = m170l.size() - 1; size >= 0; size--) {
                if (!m170l.get(size).m810f() && (i3 = i3 + 1) == i) {
                    if (z) {
                        this.f16194d = -1;
                    } else {
                        this.f16194d = size;
                    }
                    this.f16188a.get(this.f16192c).m170l().get(size).m805k(z);
                    invalidate();
                    return;
                }
            }
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = !z2;
        }
    }

    /* renamed from: R */
    public void m9108R(Bitmap bitmap, Integer num, Rect rect) {
        int i;
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list != null && (i = this.f16192c) > -1 && i < list.size()) {
            this.f16188a.get(this.f16192c).m167o(bitmap);
            this.f16188a.get(this.f16192c).m168n(num);
            this.f16188a.get(this.f16192c).m157y(rect);
            invalidate();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    /* renamed from: S */
    public void m9107S() {
        m9097h();
        this.f16181Q = true;
        this.f16183S = Math.round(this.f16196e * 0.5f);
        this.f16184T = Math.round(this.f16198f * 0.5f);
        if (this.f16185U == null) {
            this.f16185U = BitmapFactory.decodeResource(getResources(), R.mipmap.absorb);
        }
        if (this.f16186V == null) {
            Paint paint = new Paint();
            paint.setFilterBitmap(true);
            paint.setDither(true);
            paint.setAntiAlias(true);
        }
        if (this.f16182R == null) {
            this.f16182R = Bitmap.createBitmap(this.f16196e, this.f16198f, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f16182R);
            draw(canvas);
            canvas.save();
        }
        invalidate();
    }

    /* renamed from: T */
    public final void m9106T(LogoTextSaveEntity logoTextSaveEntity) {
        m9092m();
        LogoLogUtils.m22166d("LogoDrawView", new Throwable(), "点击了 编辑");
        this.f16189a0 = true;
        this.f16195d0 = logoTextSaveEntity.m1744r();
        InterfaceC9667f interfaceC9667f = this.f16193c0;
        if (interfaceC9667f != null) {
            interfaceC9667f.mo9074a(true);
        }
    }

    /* renamed from: U */
    public void m9105U(int i, int i2) {
        int i3;
        List<LogoBaseSaveEntity> m170l;
        this.f16194d = -1;
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list != null && (i3 = this.f16192c) >= 0 && i3 < list.size() && (m170l = this.f16188a.get(this.f16192c).m170l()) != null && m170l.size() > 0) {
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            for (int size = m170l.size() - 1; size >= 0; size--) {
                if (!m170l.get(size).m810f()) {
                    i4++;
                    if (i4 == i) {
                        i5 = size;
                    } else if (i4 == i2) {
                        i6 = size;
                    }
                    if (i5 != -1 && i6 != -1) {
                        Collections.swap(m170l, i5, i6);
                        this.f16188a.get(this.f16192c).m158x(m170l);
                        invalidate();
                        return;
                    }
                }
            }
        }
        int i7 = this.f16176M0;
        if (i7 > 178) {
            this.f16176M0 = i7 + 1;
            this.f16174L0 = !this.f16174L0;
        }
    }

    /* renamed from: c */
    public void m9102c(Bitmap bitmap) {
        m9092m();
        if (this.f16188a == null) {
            ArrayList arrayList = new ArrayList();
            this.f16188a = arrayList;
            arrayList.add(new LogoDesignSaveEntity());
        }
        List<LogoBaseSaveEntity> m170l = this.f16188a.get(this.f16192c).m170l();
        if (m170l == null) {
            m170l = new ArrayList<>();
        }
        m170l.add(new LogoImageSaveEntity((this.f16196e - bitmap.getWidth()) * 0.5f, (this.f16198f - bitmap.getHeight()) * 0.5f, bitmap.getWidth(), bitmap.getHeight(), bitmap));
        this.f16188a.get(this.f16192c).m158x(m170l);
        int size = m170l.size() - 1;
        this.f16194d = size;
        InterfaceC9666e interfaceC9666e = this.f16175M;
        if (interfaceC9666e != null) {
            interfaceC9666e.mo9075a(size, size == -1 ? null : this.f16188a.get(this.f16192c).m170l().get(this.f16194d));
        }
        m9118H();
        invalidate();
    }

    /* renamed from: d */
    public void m9101d(String str) {
        int round;
        int i;
        String trim = str.trim();
        m9092m();
        if (this.f16188a == null) {
            ArrayList arrayList = new ArrayList();
            this.f16188a = arrayList;
            arrayList.add(new LogoDesignSaveEntity());
        }
        List<LogoBaseSaveEntity> m170l = this.f16188a.get(this.f16192c).m170l();
        if (m170l == null) {
            m170l = new ArrayList<>();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(trim)) {
            i = 0;
            round = 0;
        } else {
            Paint paint = new Paint();
            paint.setTextSize(this.f16172K0);
            int round2 = Math.round(paint.measureText(trim));
            round = Math.round(paint.descent() - paint.ascent());
            i = round2;
        }
        LogoTextSaveEntity logoTextSaveEntity = new LogoTextSaveEntity((this.f16196e - i) * 0.5f, (this.f16198f - round) * 0.5f, i, round, trim);
        logoTextSaveEntity.m1749B(this.f16172K0);
        m170l.add(logoTextSaveEntity);
        this.f16188a.get(this.f16192c).m158x(m170l);
        int size = m170l.size() - 1;
        this.f16194d = size;
        InterfaceC9666e interfaceC9666e = this.f16175M;
        if (interfaceC9666e != null) {
            interfaceC9666e.mo9075a(size, size == -1 ? null : this.f16188a.get(this.f16192c).m170l().get(this.f16194d));
        }
        m9118H();
        LogoLogUtils.m22166d("LogoDrawView", new Throwable(), "addText耗时：" + (System.currentTimeMillis() - currentTimeMillis));
        invalidate();
    }

    /* renamed from: e */
    public void m9100e() {
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || list.size() == 0) {
            return;
        }
        int i = this.f16192c - 1;
        this.f16192c = i;
        if (i < 0) {
            this.f16192c = 0;
        }
        int i2 = this.f16176M0;
        if (i2 > 5) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        InterfaceC9665d interfaceC9665d = this.f16177N;
        if (interfaceC9665d != null) {
            interfaceC9665d.mo9076a(this.f16192c);
        }
        int i3 = this.f16176M0;
        if (i3 > 15) {
            this.f16176M0 = i3 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        invalidate();
    }

    /* renamed from: f */
    public final void m9099f() {
        int i = this.f16176M0;
        if (i > 0) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        this.f16191b0 = false;
        TimerTask timerTask = this.f16199f0;
        if (timerTask != null) {
            timerTask.cancel();
            this.f16199f0 = null;
        }
    }

    /* renamed from: g */
    public final boolean m9098g(LogoBaseSaveEntity logoBaseSaveEntity, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (!logoBaseSaveEntity.m810f() && !logoBaseSaveEntity.m809g() && !logoBaseSaveEntity.m808h()) {
            if (logoBaseSaveEntity instanceof LogoImageSaveEntity) {
                LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) logoBaseSaveEntity;
                if (logoImageSaveEntity.m34p() > 0.0f) {
                    float m812d = logoImageSaveEntity.m812d() + (logoImageSaveEntity.m813c() * 0.5f);
                    float m811e = logoImageSaveEntity.m811e() + (logoImageSaveEntity.m814b() * 0.5f);
                    double d = ((-logoImageSaveEntity.m34p()) / 180.0d) * 3.141592653589793d;
                    double d2 = f - m812d;
                    double d3 = f2 - m811e;
                    f3 = (float) (((Math.cos(d) * d2) - (Math.sin(d) * d3)) + m812d);
                    f4 = (float) ((d3 * Math.cos(d)) + (d2 * Math.sin(d)) + m811e);
                    this.f16201g0 = Math.round(f3);
                    this.f16203h0 = Math.round(f4);
                    if (f3 <= logoBaseSaveEntity.m812d() && f3 < logoBaseSaveEntity.m812d() + logoBaseSaveEntity.m813c() && f4 > logoBaseSaveEntity.m811e() && f4 < logoBaseSaveEntity.m811e() + logoBaseSaveEntity.m814b()) {
                        LogoLogUtils.m22166d("LogoDrawView", new Throwable(), "找到了操作对象");
                        return true;
                    } else if (!z && (logoBaseSaveEntity instanceof LogoTextSaveEntity) && f3 > logoBaseSaveEntity.m812d() && f3 < logoBaseSaveEntity.m812d() + logoBaseSaveEntity.m813c() && f4 > logoBaseSaveEntity.m811e() - 31.0f && f4 < logoBaseSaveEntity.m811e() + logoBaseSaveEntity.m814b() + 31.0f) {
                        return true;
                    }
                }
            }
            f3 = f;
            f4 = f2;
            if (f3 <= logoBaseSaveEntity.m812d()) {
            }
            if (!z) {
            }
        }
        return false;
    }

    public List<LogoBaseSaveEntity> getAllShowBaseSaveEntity() {
        List<LogoDesignSaveEntity> list;
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f16192c;
        if (i >= 0 && (list = this.f16188a) != null && i < list.size()) {
            boolean z2 = this.f16174L0;
            if (z2) {
                this.f16176M0++;
                this.f16174L0 = !z2;
            }
            List<LogoBaseSaveEntity> m170l = this.f16188a.get(this.f16192c).m170l();
            if (m170l != null && m170l.size() > 0) {
                boolean z3 = this.f16174L0;
                if (z3) {
                    this.f16176M0++;
                    this.f16174L0 = !z3;
                }
                for (int size = m170l.size() - 1; size >= 0; size--) {
                    if (!m170l.get(size).m810f()) {
                        arrayList.add(m170l.get(size));
                    }
                }
            }
        }
        return arrayList;
    }

    public int getClippingCurrentRadius() {
        List<LogoDesignSaveEntity> list;
        int i = this.f16176M0;
        if (i > 798) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (this.f16192c > -1 && (list = this.f16188a) != null && list.size() > 0) {
            return Math.round(this.f16188a.get(this.f16192c).m176f());
        }
        int i2 = this.f16176M0;
        if (i2 > 781) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
            return 0;
        }
        return 0;
    }

    public int getClippingMaxRadius() {
        int i = this.f16176M0;
        if (i > 778) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (this.f16229u0 == 0) {
            this.f16229u0 = Math.round(this.f16196e * 0.8f * 0.5f);
        }
        int i2 = this.f16176M0;
        if (i2 > 718) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        return this.f16229u0;
    }

    public Integer getClippingType() {
        List<LogoDesignSaveEntity> list;
        int i = this.f16176M0;
        if (i > 57) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (this.f16192c > -1 && (list = this.f16188a) != null && list.size() > 0) {
            return this.f16188a.get(this.f16192c).m175g();
        }
        int i2 = this.f16176M0;
        if (i2 > 51) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
            return null;
        }
        return null;
    }

    public Integer getCurrentBackgroudColor() {
        int i = this.f16176M0;
        if (i > 0) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f16188a.get(this.f16192c).m179c();
    }

    public Bitmap getCurrentBackgroudImage() {
        int i = this.f16176M0;
        if (i > 0) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f16188a.get(this.f16192c).m178d();
    }

    public Rect getCurrentBackgroudSrcRect() {
        int i = this.f16176M0;
        if (i > 0) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f16188a.get(this.f16192c).m169m();
    }

    public Integer getCurrentFillColor() {
        if (this.f16194d != -1) {
            return ((LogoImageSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d)).m32r();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
            return null;
        }
        return null;
    }

    public String getCurrentText() {
        List<LogoDesignSaveEntity> list;
        List<LogoBaseSaveEntity> m170l;
        int i = this.f16176M0;
        if (i > 54) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (this.f16192c != -1 && this.f16194d != -1 && (list = this.f16188a) != null) {
            int size = list.size();
            int i2 = this.f16192c;
            if (size > i2 && (m170l = this.f16188a.get(i2).m170l()) != null) {
                int size2 = m170l.size();
                int i3 = this.f16194d;
                if (size2 > i3) {
                    LogoBaseSaveEntity logoBaseSaveEntity = m170l.get(i3);
                    if (logoBaseSaveEntity instanceof LogoTextSaveEntity) {
                        return ((LogoTextSaveEntity) logoBaseSaveEntity).m1744r();
                    }
                }
            }
        }
        int i4 = this.f16176M0;
        if (i4 > 53) {
            this.f16176M0 = i4 + 1;
            this.f16174L0 = !this.f16174L0;
            return null;
        }
        return null;
    }

    public float getCurrentTextSize() {
        List<LogoDesignSaveEntity> list;
        List<LogoBaseSaveEntity> m170l;
        if (this.f16192c != -1 && this.f16194d != -1 && (list = this.f16188a) != null) {
            int size = list.size();
            int i = this.f16192c;
            if (size > i && (m170l = this.f16188a.get(i).m170l()) != null) {
                int size2 = m170l.size();
                int i2 = this.f16194d;
                if (size2 > i2) {
                    LogoBaseSaveEntity logoBaseSaveEntity = m170l.get(i2);
                    if (logoBaseSaveEntity instanceof LogoTextSaveEntity) {
                        return ((LogoTextSaveEntity) logoBaseSaveEntity).m1743s();
                    }
                }
            }
        }
        int i3 = this.f16176M0;
        if (i3 > 4) {
            this.f16176M0 = i3 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        return DeUtils.m767c(getContext(), 14.0f, 155);
    }

    public List<LogoDesignSaveEntity> getListData() {
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
        return this.f16188a;
    }

    public boolean getTextBold() {
        if (this.f16194d != -1) {
            return ((LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d)).m1742t();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
            return false;
        }
        return false;
    }

    public Integer getTextColor() {
        if (this.f16194d != -1) {
            return Integer.valueOf(((LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d)).m1746p());
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
            return null;
        }
        return null;
    }

    public String getTextFont() {
        if (this.f16194d != -1) {
            return ((LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d)).m1745q();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
            return null;
        }
        return null;
    }

    public boolean getTextSkew() {
        int i = this.f16176M0;
        if (i > 0) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (this.f16194d != -1) {
            return ((LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d)).m1741u();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
            return false;
        }
        return false;
    }

    public boolean getTextUnderline() {
        if (this.f16194d != -1) {
            return ((LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d)).m1740v();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public void m9097h() {
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
        Bitmap bitmap = this.f16182R;
        if (bitmap != null) {
            bitmap.recycle();
            this.f16182R = null;
        }
    }

    /* renamed from: i */
    public void m9096i() {
        this.f16194d = -1;
        InterfaceC9666e interfaceC9666e = this.f16175M;
        if (interfaceC9666e != null) {
            interfaceC9666e.mo9075a(-1, null);
        }
        invalidate();
    }

    /* renamed from: j */
    public void m9095j() {
        int i = this.f16176M0;
        if (i > 1781) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || list.size() <= 0) {
            return;
        }
        Bitmap m178d = this.f16188a.get(this.f16192c).m178d();
        Rect m169m = this.f16188a.get(this.f16192c).m169m();
        int i2 = this.f16176M0;
        if (i2 > 28) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (m178d == null || m169m == null || m178d.getWidth() == m178d.getHeight()) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f16196e, this.f16198f, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(m178d, m169m, new Rect(0, 0, this.f16196e, this.f16198f), new Paint());
        canvas.save();
        this.f16188a.get(this.f16192c).m167o(createBitmap);
        this.f16188a.get(this.f16192c).m157y(null);
    }

    /* renamed from: k */
    public void m9094k() {
        setLayerType(1, null);
    }

    /* renamed from: l */
    public void m9093l() {
        try {
            m9092m();
            List<LogoBaseSaveEntity> m170l = this.f16188a.get(this.f16192c).m170l();
            LogoTextSaveEntity clone = ((LogoTextSaveEntity) m170l.get(this.f16194d)).clone();
            float m812d = clone.m812d() + 15.0f;
            float m811e = clone.m811e() + 15.0f;
            int size = m170l.size();
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                LogoBaseSaveEntity logoBaseSaveEntity = m170l.get(i);
                if ((logoBaseSaveEntity instanceof LogoTextSaveEntity) && (logoBaseSaveEntity.m812d() == m812d || logoBaseSaveEntity.m811e() == m811e)) {
                    m812d += 15.0f;
                    m811e += 15.0f;
                }
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTextSize(clone.m1743s());
            textPaint.setColor(clone.m1746p());
            if (clone.m1742t()) {
                textPaint.setFakeBoldText(true);
            }
            if (clone.m1740v()) {
                textPaint.setUnderlineText(true);
            }
            if (clone.m1741u()) {
                textPaint.setTextSkewX(-0.5f);
            }
            if (!TextUtils.isEmpty(clone.m1745q())) {
                Map<String, Typeface> map = this.f16236y;
                if (map == null) {
                    this.f16236y = new HashMap();
                    Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + clone.m1745q());
                    this.f16236y.put(clone.m1745q(), createFromAsset);
                    textPaint.setTypeface(createFromAsset);
                } else {
                    Typeface typeface = map.get(clone.m1745q());
                    if (typeface == null) {
                        typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + clone.m1745q());
                    }
                    if (typeface != null) {
                        this.f16236y.put(clone.m1745q(), typeface);
                        textPaint.setTypeface(typeface);
                    }
                }
            }
            Rect rect = new Rect();
            textPaint.getTextBounds("a", 0, 1, rect);
            rect.left = 0;
            rect.right = IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED;
            if (m812d > this.f16196e - rect.width()) {
                m812d = (rect.width() - clone.m813c()) + random.nextInt(100);
            }
            if (m811e > (this.f16198f - rect.height()) - Math.abs(rect.top)) {
                m811e = (rect.height() - clone.m814b()) + Math.abs(rect.top) + random.nextInt(100);
            }
            clone.m803m(m812d);
            clone.m802n(m811e);
            m170l.add(clone);
            this.f16188a.get(this.f16192c).m158x(m170l);
            int size2 = m170l.size() - 1;
            this.f16194d = size2;
            InterfaceC9666e interfaceC9666e = this.f16175M;
            if (interfaceC9666e != null) {
                interfaceC9666e.mo9075a(size2, size2 == -1 ? null : this.f16188a.get(this.f16192c).m170l().get(this.f16194d));
            }
            invalidate();
            m9118H();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            boolean z = this.f16174L0;
            if (z) {
                this.f16176M0++;
                this.f16174L0 = !z;
            }
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = true ^ z2;
        }
    }

    /* renamed from: m */
    public void m9092m() {
        int i = this.f16176M0;
        if (i > 0) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (this.f16188a == null) {
            ArrayList arrayList = new ArrayList();
            this.f16188a = arrayList;
            arrayList.add(new LogoDesignSaveEntity());
        }
        int i2 = this.f16176M0;
        if (i2 > 5) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        this.f16190b = this.f16188a.get(this.f16192c).clone();
    }

    /* renamed from: n */
    public final void m9091n(Canvas canvas, LogoDesignSaveEntity logoDesignSaveEntity) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (this.f16215n0) {
            paint.setStrokeWidth(this.f16221q0);
        } else {
            paint.setStrokeWidth(0.0f);
        }
        if (this.f16217o0 == null) {
            this.f16217o0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.f16196e, this.f16198f, paint);
        paint.setColor(855638016);
        canvas.drawRect(0.0f, 0.0f, this.f16196e, this.f16198f, paint);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(this.f16217o0);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m172j(), logoDesignSaveEntity.m176f(), paint2);
        paint2.setXfermode(null);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        if (this.f16215n0) {
            canvas.drawCircle(logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m172j(), logoDesignSaveEntity.m176f(), paint);
        }
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: o */
    public final void m9090o(Canvas canvas, LogoImageSaveEntity logoImageSaveEntity, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f16160E0 == null) {
            Paint paint = new Paint();
            this.f16160E0 = paint;
            paint.setFilterBitmap(true);
            this.f16160E0.setDither(true);
            this.f16160E0.setAntiAlias(true);
        }
        this.f16160E0.setAlpha(logoImageSaveEntity.m31s());
        Bitmap m33q = logoImageSaveEntity.m33q();
        if (this.f16162F0 == null) {
            this.f16162F0 = new Matrix();
        }
        this.f16162F0.reset();
        Integer m32r = logoImageSaveEntity.m32r();
        if (m32r != null) {
            this.f16160E0.setColorFilter(new PorterDuffColorFilter(m32r.intValue(), PorterDuff.Mode.SRC_ATOP));
        } else {
            this.f16160E0.setColorFilter(null);
        }
        float m813c = (logoImageSaveEntity.m813c() * 1.0f) / m33q.getWidth();
        float m814b = (logoImageSaveEntity.m814b() * 1.0f) / m33q.getHeight();
        if (logoImageSaveEntity.m30t() && !logoImageSaveEntity.m29u()) {
            this.f16162F0.postScale(-1.0f, 1.0f);
            this.f16162F0.postTranslate(m33q.getWidth(), 0.0f);
        } else if (!logoImageSaveEntity.m30t() && logoImageSaveEntity.m29u()) {
            this.f16162F0.postScale(1.0f, -1.0f);
            this.f16162F0.postTranslate(0.0f, m33q.getHeight());
        } else if (logoImageSaveEntity.m30t() && logoImageSaveEntity.m29u()) {
            this.f16162F0.postScale(-1.0f, -1.0f);
            this.f16162F0.postTranslate(m33q.getWidth(), m33q.getHeight());
        }
        this.f16162F0.postScale(m813c, m814b);
        if (logoImageSaveEntity.m34p() != 0.0f) {
            this.f16162F0.postRotate(logoImageSaveEntity.m34p(), logoImageSaveEntity.m813c() * 0.5f, logoImageSaveEntity.m814b() * 0.5f);
        }
        if (logoImageSaveEntity.m812d() != 0.0f || logoImageSaveEntity.m811e() != 0.0f) {
            if (logoImageSaveEntity.m812d() > this.f16196e - (logoImageSaveEntity.m813c() * 0.5f)) {
                logoImageSaveEntity.m803m(this.f16196e - (logoImageSaveEntity.m813c() * 0.5f));
            } else if (logoImageSaveEntity.m812d() < (-logoImageSaveEntity.m813c()) + (logoImageSaveEntity.m813c() * 0.5f)) {
                logoImageSaveEntity.m803m((-logoImageSaveEntity.m813c()) + (logoImageSaveEntity.m813c() * 0.5f));
            }
            if (logoImageSaveEntity.m811e() > this.f16198f - (logoImageSaveEntity.m814b() * 0.5f)) {
                logoImageSaveEntity.m802n(this.f16198f - (logoImageSaveEntity.m814b() * 0.5f));
            } else if (logoImageSaveEntity.m811e() < (-logoImageSaveEntity.m814b()) + (logoImageSaveEntity.m814b() * 0.5f)) {
                logoImageSaveEntity.m802n((-logoImageSaveEntity.m814b()) + (logoImageSaveEntity.m814b() * 0.5f));
            }
            this.f16162F0.postTranslate(logoImageSaveEntity.m812d(), logoImageSaveEntity.m811e());
        }
        Throwable th = new Throwable();
        LogoLogUtils.m22166d("LogoDrawView", th, "计算一个bitmap消耗：" + (System.currentTimeMillis() - currentTimeMillis));
        canvas.drawBitmap(m33q, this.f16162F0, this.f16160E0);
        long currentTimeMillis2 = System.currentTimeMillis();
        Throwable th2 = new Throwable();
        LogoLogUtils.m22166d("LogoDrawView", th2, "绘制一个bitmap消耗：" + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String str;
        long j;
        String str2;
        Bitmap bitmap;
        super.onDraw(canvas);
        if (this.f16172K0 == 0.0f) {
            this.f16172K0 = DeUtils.m767c(getContext(), 14.0f, 15);
        }
        LogoLogUtils.m22166d("LogoDrawView", new Throwable(), "触摸到绘制耗时：" + (System.currentTimeMillis() - this.f16170J0));
        long currentTimeMillis = System.currentTimeMillis();
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || this.f16192c >= list.size()) {
            str = "LogoDrawView";
            j = currentTimeMillis;
        } else {
            LogoDesignSaveEntity logoDesignSaveEntity = this.f16188a.get(this.f16192c);
            if (logoDesignSaveEntity.m179c() != null) {
                canvas.drawColor(logoDesignSaveEntity.m179c().intValue());
            }
            if (logoDesignSaveEntity.m178d() != null) {
                if (this.f16156C0 == null) {
                    Paint paint = new Paint();
                    this.f16156C0 = paint;
                    paint.setFilterBitmap(true);
                    this.f16156C0.setDither(true);
                    this.f16156C0.setAntiAlias(true);
                }
                if (this.f16158D0 == null) {
                    this.f16158D0 = new Rect(0, 0, this.f16196e, this.f16198f);
                }
                Bitmap m178d = logoDesignSaveEntity.m178d();
                if (m178d.getWidth() != m178d.getHeight()) {
                    canvas.drawBitmap(m178d, logoDesignSaveEntity.m169m(), this.f16158D0, this.f16156C0);
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    canvas.drawBitmap(m178d, (Rect) null, this.f16158D0, this.f16156C0);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    LogoLogUtils.m22166d("LogoDrawView", new Throwable(), "bitmap绘制耗时：" + (currentTimeMillis3 - currentTimeMillis2));
                }
            }
            m9082w();
            List<LogoBaseSaveEntity> m170l = logoDesignSaveEntity.m170l();
            int size = m170l == null ? 0 : m170l.size();
            for (int i = 0; i < size; i++) {
                if (!m170l.get(i).m810f() && !m170l.get(i).m809g()) {
                    if (m170l.get(i) instanceof LogoImageSaveEntity) {
                        m9090o(canvas, (LogoImageSaveEntity) m170l.get(i), i);
                    } else {
                        m9087r(canvas, (LogoTextSaveEntity) m170l.get(i), i);
                    }
                }
            }
            if (logoDesignSaveEntity.m175g() != null) {
                int intValue = logoDesignSaveEntity.m175g().intValue();
                if (intValue == 1) {
                    m9089p(canvas, logoDesignSaveEntity, false);
                } else if (intValue == 2) {
                    m9089p(canvas, logoDesignSaveEntity, true);
                } else if (intValue == 3) {
                    m9088q(canvas, logoDesignSaveEntity);
                } else if (intValue == 4) {
                    m9091n(canvas, logoDesignSaveEntity);
                }
            }
            int i2 = this.f16194d;
            if (i2 <= -1 || i2 >= size || m170l.get(i2).m808h() || m170l.get(this.f16194d).m809g()) {
                str = "LogoDrawView";
                j = currentTimeMillis;
            } else {
                LogoBaseSaveEntity logoBaseSaveEntity = m170l.get(this.f16194d);
                if (logoBaseSaveEntity instanceof LogoImageSaveEntity) {
                    LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) logoBaseSaveEntity;
                    int round = Math.round(logoImageSaveEntity.m812d() - 31.0f);
                    int round2 = Math.round(logoImageSaveEntity.m811e() - 31.0f);
                    int round3 = Math.round(logoImageSaveEntity.m812d() + logoImageSaveEntity.m813c() + 31.0f);
                    int round4 = Math.round(logoImageSaveEntity.m811e() + logoImageSaveEntity.m814b() + 31.0f);
                    if (round3 - round < 116) {
                        float m812d = logoImageSaveEntity.m812d() + (logoImageSaveEntity.m813c() * 0.5f);
                        int round5 = Math.round(m812d - 58.0f);
                        round3 = Math.round(m812d + 58.0f);
                        round = round5;
                    }
                    if (round4 - round2 < 116) {
                        float m811e = logoImageSaveEntity.m811e() + (logoImageSaveEntity.m814b() * 0.5f);
                        round2 = Math.round(m811e - 58.0f);
                        round4 = Math.round(m811e + 58.0f);
                    }
                    Rect rect = new Rect(round, round2, round3, round4);
                    float m813c = logoImageSaveEntity.m813c() * 0.5f;
                    float m814b = logoImageSaveEntity.m814b() * 0.5f;
                    if (logoImageSaveEntity.m34p() != 0.0f) {
                        canvas.rotate(logoImageSaveEntity.m34p(), logoImageSaveEntity.m812d() + m813c, logoImageSaveEntity.m811e() + m814b);
                    }
                    canvas.drawRect(rect, this.f16210l);
                    float f = round;
                    float f2 = ((round3 - round) * 0.5f) + f;
                    float f3 = f2 - 27.0f;
                    str = "LogoDrawView";
                    j = currentTimeMillis;
                    float f4 = round2;
                    float f5 = f4 - 27.0f;
                    float f6 = f2 + 27.0f;
                    float f7 = f4 + 27.0f;
                    canvas.drawBitmap(this.f16218p, (Rect) null, new Rect(Math.round(f3), Math.round(f5), Math.round(f6), Math.round(f7)), this.f16216o);
                    float f8 = round3;
                    float f9 = f8 - 27.0f;
                    float f10 = f8 + 27.0f;
                    canvas.drawBitmap(this.f16220q, (Rect) null, new Rect(Math.round(f9), Math.round(f5), Math.round(f10), Math.round(f7)), this.f16216o);
                    float f11 = f - 27.0f;
                    float f12 = f4 + ((round4 - round2) * 0.5f);
                    float f13 = f12 - 27.0f;
                    float f14 = f + 27.0f;
                    float f15 = f12 + 27.0f;
                    canvas.drawBitmap(this.f16222r, (Rect) null, new Rect(Math.round(f11), Math.round(f13), Math.round(f14), Math.round(f15)), this.f16216o);
                    canvas.drawBitmap(this.f16226t, (Rect) null, new Rect(Math.round(f9), Math.round(f13), Math.round(f10), Math.round(f15)), this.f16216o);
                    float f16 = round4;
                    float f17 = f16 - 27.0f;
                    float f18 = f16 + 27.0f;
                    canvas.drawBitmap(this.f16228u, (Rect) null, new Rect(Math.round(f11), Math.round(f17), Math.round(f14), Math.round(f18)), this.f16216o);
                    canvas.drawBitmap(this.f16224s, (Rect) null, new Rect(Math.round(f3), Math.round(f17), Math.round(f6), Math.round(f18)), this.f16216o);
                    canvas.drawBitmap(this.f16230v, (Rect) null, new Rect(Math.round(f9), Math.round(f17), Math.round(f10), Math.round(f18)), this.f16216o);
                    if (logoImageSaveEntity.m34p() != 0.0f) {
                        canvas.rotate(-logoImageSaveEntity.m34p(), logoImageSaveEntity.m812d() + m813c, logoImageSaveEntity.m811e() + m814b);
                    }
                } else {
                    str = "LogoDrawView";
                    j = currentTimeMillis;
                    LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) logoBaseSaveEntity;
                    int round6 = Math.round(logoTextSaveEntity.m812d() - 31.0f);
                    int round7 = Math.round(logoTextSaveEntity.m811e() - 31.0f);
                    int round8 = Math.round(logoTextSaveEntity.m812d() + logoTextSaveEntity.m813c() + 31.0f);
                    int round9 = Math.round(logoTextSaveEntity.m811e() + logoTextSaveEntity.m814b() + 31.0f);
                    if (round8 - round6 < 232) {
                        float m812d2 = logoTextSaveEntity.m812d() + (logoTextSaveEntity.m813c() * 0.5f);
                        int round10 = Math.round(m812d2 - 116.0f);
                        round8 = Math.round(m812d2 + 116.0f);
                        round6 = round10;
                    }
                    if (round9 - round7 < 116) {
                        float m811e2 = logoTextSaveEntity.m811e() + (logoTextSaveEntity.m814b() * 0.5f);
                        round7 = Math.round(m811e2 - 58.0f);
                        round9 = Math.round(m811e2 + 58.0f);
                    }
                    canvas.drawRect(new Rect(round6, round7, round8, round9), this.f16210l);
                    float f19 = round8;
                    float f20 = f19 - 27.0f;
                    float f21 = round7;
                    float f22 = f19 + 27.0f;
                    canvas.drawBitmap(this.f16220q, (Rect) null, new Rect(Math.round(f20), Math.round(f21 - 27.0f), Math.round(f22), Math.round(f21 + 27.0f)), this.f16216o);
                    float f23 = round6;
                    float f24 = round9;
                    float f25 = f24 - 27.0f;
                    float f26 = f24 + 27.0f;
                    canvas.drawBitmap(this.f16232w, (Rect) null, new Rect(Math.round(f23 - 27.0f), Math.round(f25), Math.round(f23 + 27.0f), Math.round(f26)), this.f16216o);
                    canvas.drawBitmap(this.f16230v, (Rect) null, new Rect(Math.round(f20), Math.round(f25), Math.round(f22), Math.round(f26)), this.f16216o);
                    if (this.f16189a0) {
                        if (this.f16187W == null) {
                            Paint paint2 = new Paint();
                            this.f16187W = paint2;
                            paint2.setColor(SupportMenu.CATEGORY_MASK);
                            this.f16187W.setStrokeWidth(8.0f);
                        }
                        float f27 = TextUtils.isEmpty(logoTextSaveEntity.m1744r()) ? 0.0f : 8.0f;
                        if (this.f16191b0) {
                            float m814b2 = (logoTextSaveEntity.m814b() > 60 ? logoTextSaveEntity.m814b() : 60) * 0.5f;
                            canvas.drawLine(logoTextSaveEntity.m812d() + logoTextSaveEntity.m813c() + f27, (logoTextSaveEntity.m811e() + (logoTextSaveEntity.m814b() * 0.5f)) - m814b2, logoTextSaveEntity.m812d() + logoTextSaveEntity.m813c() + f27, logoTextSaveEntity.m811e() + (logoTextSaveEntity.m814b() * 0.5f) + m814b2, this.f16187W);
                        }
                    }
                }
            }
            if (this.f16181Q) {
                Rect rect2 = new Rect(this.f16183S, this.f16184T - this.f16185U.getHeight(), this.f16183S + this.f16185U.getWidth(), this.f16184T);
                if (this.f16179O != null && (bitmap = this.f16182R) != null) {
                    int i3 = this.f16183S;
                    if (i3 < 0) {
                        this.f16183S = 0;
                    } else if (i3 >= bitmap.getWidth()) {
                        this.f16183S = this.f16182R.getWidth() - 1;
                    }
                    int i4 = this.f16184T;
                    if (i4 < 0) {
                        this.f16184T = 0;
                    } else if (i4 >= this.f16182R.getHeight()) {
                        this.f16184T = this.f16182R.getHeight() - 1;
                    }
                    this.f16179O.mo9078a(this.f16182R.getPixel(this.f16183S, this.f16184T));
                }
                if (this.f16182R != null) {
                    canvas.drawBitmap(this.f16185U, (Rect) null, rect2, this.f16186V);
                }
            }
        }
        if (this.f16213m0) {
            this.f16211l0 = System.currentTimeMillis();
            str2 = str;
            LogoLogUtils.m22166d(str2, new Throwable(), "计算到绘制完毕耗时：" + (this.f16211l0 - j));
            this.f16213m0 = false;
        } else {
            str2 = str;
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        LogoLogUtils.m22166d(str2, new Throwable(), "绘制耗时：" + (currentTimeMillis4 - j));
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f16196e = getWidth();
        this.f16198f = getHeight();
        int i5 = this.f16176M0;
        if (i5 > 0) {
            this.f16176M0 = i5 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        int i3 = this.f16176M0;
        if (i3 > 0) {
            this.f16176M0 = i3 + 1;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.f16176M0;
        if (i5 > 0) {
            this.f16176M0 = i5 + 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0246, code lost:
        if (r3 > r7) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0f43  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x10f6  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x113b  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x1141  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x114d  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x115c  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x115e  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r39) {
        /*
            Method dump skipped, instructions count: 4520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.view.LogoDrawView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m9089p(Canvas canvas, LogoDesignSaveEntity logoDesignSaveEntity, boolean z) {
        Canvas canvas2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.f16233w0);
        if (this.f16217o0 == null) {
            this.f16217o0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.f16196e, this.f16198f, paint);
        paint.setColor(855638016);
        canvas.drawRect(0.0f, 0.0f, this.f16196e, this.f16198f, paint);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(this.f16217o0);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawRect(logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m172j(), logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint2);
        paint2.setXfermode(null);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        logoDesignSaveEntity.m162t(logoDesignSaveEntity.m173i() - (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m160v(logoDesignSaveEntity.m172j() - (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m163s(logoDesignSaveEntity.m174h() + this.f16233w0);
        logoDesignSaveEntity.m166p(logoDesignSaveEntity.m177e() + this.f16233w0);
        if (this.f16215n0) {
            canvas.drawRect(logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m172j(), logoDesignSaveEntity.m174h() + logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m177e() + logoDesignSaveEntity.m172j(), paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(this.f16219p0);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i(), (logoDesignSaveEntity.m172j() + this.f16223r0) - (this.f16219p0 * 0.5f), paint);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (logoDesignSaveEntity.m173i() + this.f16223r0) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j(), paint);
            canvas.drawRect((this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - this.f16223r0), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j(), paint);
            canvas.drawRect((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - (this.f16219p0 * 0.5f), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (logoDesignSaveEntity.m172j() + this.f16223r0) - (this.f16219p0 * 0.5f), paint);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - this.f16223r0), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), (logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - (this.f16219p0 * 0.5f), (logoDesignSaveEntity.m173i() + this.f16223r0) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            canvas.drawRect((this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - this.f16223r0), (logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            canvas.drawRect((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - this.f16223r0), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            if (!z) {
                float m174h = ((logoDesignSaveEntity.m174h() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m173i();
                float m172j = logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f);
                float m173i = logoDesignSaveEntity.m173i();
                int m174h2 = logoDesignSaveEntity.m174h();
                int i = this.f16225s0;
                canvas.drawRect(m174h, m172j, i + m173i + ((m174h2 - i) * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j(), paint);
                canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), ((logoDesignSaveEntity.m177e() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i(), ((logoDesignSaveEntity.m177e() + this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), paint);
                canvas.drawRect((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - (this.f16219p0 * 0.5f), ((logoDesignSaveEntity.m177e() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), ((logoDesignSaveEntity.m177e() + this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), paint);
                float m174h3 = ((logoDesignSaveEntity.m174h() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m173i();
                float m172j2 = (logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - (this.f16219p0 * 0.5f);
                float m173i2 = logoDesignSaveEntity.m173i();
                int m174h4 = logoDesignSaveEntity.m174h();
                int i2 = this.f16225s0;
                float f = i2 + m173i2 + ((m174h4 - i2) * 0.5f);
                float m172j3 = (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e();
                canvas2 = canvas;
                canvas2.drawRect(m174h3, m172j2, f, m172j3, paint);
                canvas2.restoreToCount(saveLayer);
                logoDesignSaveEntity.m162t(logoDesignSaveEntity.m173i() + (this.f16233w0 * 0.5f));
                logoDesignSaveEntity.m160v(logoDesignSaveEntity.m172j() + (this.f16233w0 * 0.5f));
                logoDesignSaveEntity.m163s(logoDesignSaveEntity.m174h() - this.f16233w0);
                logoDesignSaveEntity.m166p(logoDesignSaveEntity.m177e() - this.f16233w0);
            }
        }
        canvas2 = canvas;
        canvas2.restoreToCount(saveLayer);
        logoDesignSaveEntity.m162t(logoDesignSaveEntity.m173i() + (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m160v(logoDesignSaveEntity.m172j() + (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m163s(logoDesignSaveEntity.m174h() - this.f16233w0);
        logoDesignSaveEntity.m166p(logoDesignSaveEntity.m177e() - this.f16233w0);
    }

    /* renamed from: q */
    public final void m9088q(Canvas canvas, LogoDesignSaveEntity logoDesignSaveEntity) {
        Canvas canvas2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(4.0f);
        if (this.f16217o0 == null) {
            this.f16217o0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.f16196e, this.f16198f, paint);
        paint.setColor(855638016);
        canvas.drawRect(0.0f, 0.0f, this.f16196e, this.f16198f, paint);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(this.f16217o0);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m172j(), logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), logoDesignSaveEntity.m176f(), logoDesignSaveEntity.m176f(), paint2);
        paint2.setXfermode(null);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        logoDesignSaveEntity.m162t(logoDesignSaveEntity.m173i() - (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m160v(logoDesignSaveEntity.m172j() - (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m163s(logoDesignSaveEntity.m174h() + this.f16233w0);
        logoDesignSaveEntity.m166p(logoDesignSaveEntity.m177e() + this.f16233w0);
        if (this.f16215n0) {
            canvas.drawRoundRect(logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m172j(), logoDesignSaveEntity.m174h() + logoDesignSaveEntity.m173i(), logoDesignSaveEntity.m177e() + logoDesignSaveEntity.m172j(), (this.f16233w0 * 0.5f) + logoDesignSaveEntity.m176f(), (this.f16233w0 * 0.5f) + logoDesignSaveEntity.m176f(), paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(this.f16219p0);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i(), (logoDesignSaveEntity.m172j() + this.f16223r0) - (this.f16219p0 * 0.5f), paint);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (logoDesignSaveEntity.m173i() + this.f16223r0) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j(), paint);
            canvas.drawRect((this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - this.f16223r0), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j(), paint);
            canvas.drawRect((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - (this.f16219p0 * 0.5f), logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (logoDesignSaveEntity.m172j() + this.f16223r0) - (this.f16219p0 * 0.5f), paint);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - this.f16223r0), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), (logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - (this.f16219p0 * 0.5f), (logoDesignSaveEntity.m173i() + this.f16223r0) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            canvas.drawRect((this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - this.f16223r0), (logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            canvas.drawRect((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - (this.f16219p0 * 0.5f), (this.f16219p0 * 0.5f) + ((logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - this.f16223r0), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e(), paint);
            float m174h = ((logoDesignSaveEntity.m174h() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m173i();
            float m172j = logoDesignSaveEntity.m172j() - (this.f16219p0 * 0.5f);
            float m173i = logoDesignSaveEntity.m173i();
            int m174h2 = logoDesignSaveEntity.m174h();
            int i = this.f16225s0;
            canvas.drawRect(m174h, m172j, i + m173i + ((m174h2 - i) * 0.5f), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j(), paint);
            canvas.drawRect(logoDesignSaveEntity.m173i() - (this.f16219p0 * 0.5f), ((logoDesignSaveEntity.m177e() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i(), ((logoDesignSaveEntity.m177e() + this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), paint);
            canvas.drawRect((logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h()) - (this.f16219p0 * 0.5f), ((logoDesignSaveEntity.m177e() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m173i() + logoDesignSaveEntity.m174h(), ((logoDesignSaveEntity.m177e() + this.f16225s0) * 0.5f) + logoDesignSaveEntity.m172j(), paint);
            float m174h3 = ((logoDesignSaveEntity.m174h() - this.f16225s0) * 0.5f) + logoDesignSaveEntity.m173i();
            float m172j2 = (logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e()) - (this.f16219p0 * 0.5f);
            float m173i2 = logoDesignSaveEntity.m173i();
            int m174h4 = logoDesignSaveEntity.m174h();
            int i2 = this.f16225s0;
            float f = i2 + m173i2 + ((m174h4 - i2) * 0.5f);
            float m172j3 = (this.f16219p0 * 0.5f) + logoDesignSaveEntity.m172j() + logoDesignSaveEntity.m177e();
            canvas2 = canvas;
            canvas2.drawRect(m174h3, m172j2, f, m172j3, paint);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(saveLayer);
        logoDesignSaveEntity.m162t(logoDesignSaveEntity.m173i() + (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m160v(logoDesignSaveEntity.m172j() + (this.f16233w0 * 0.5f));
        logoDesignSaveEntity.m163s(logoDesignSaveEntity.m174h() - this.f16233w0);
        logoDesignSaveEntity.m166p(logoDesignSaveEntity.m177e() - this.f16233w0);
    }

    /* renamed from: r */
    public final void m9087r(Canvas canvas, LogoTextSaveEntity logoTextSaveEntity, int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(logoTextSaveEntity.m1743s());
        textPaint.setColor(logoTextSaveEntity.m1746p());
        if (logoTextSaveEntity.m1742t()) {
            textPaint.setFakeBoldText(true);
        }
        if (logoTextSaveEntity.m1740v()) {
            textPaint.setUnderlineText(true);
        }
        if (logoTextSaveEntity.m1741u()) {
            textPaint.setTextSkewX(-0.5f);
        }
        if (!TextUtils.isEmpty(logoTextSaveEntity.m1745q())) {
            Map<String, Typeface> map = this.f16236y;
            if (map == null) {
                this.f16236y = new HashMap();
                Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + logoTextSaveEntity.m1745q());
                this.f16236y.put(logoTextSaveEntity.m1745q(), createFromAsset);
                textPaint.setTypeface(createFromAsset);
            } else {
                Typeface typeface = map.get(logoTextSaveEntity.m1745q());
                if (typeface == null) {
                    typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + logoTextSaveEntity.m1745q());
                }
                if (typeface != null) {
                    this.f16236y.put(logoTextSaveEntity.m1745q(), typeface);
                    textPaint.setTypeface(typeface);
                }
            }
        }
        Rect rect = new Rect();
        String[] split = logoTextSaveEntity.m1744r().split("\n");
        Rect[] rectArr = new Rect[split.length];
        int i2 = 0;
        while (true) {
            if (i2 >= split.length) {
                break;
            }
            String str = split[i2];
            Rect rect2 = new Rect();
            String str2 = TextUtils.isEmpty(str) ? "a" : str;
            textPaint.getTextBounds(str2, 0, str2.length(), rect2);
            if (i2 == 0) {
                rect.top = rect2.top;
                rect.left = rect2.left;
                rect.bottom = rect2.bottom;
                rect.right = rect2.right;
            } else {
                if (rect.width() < rect2.width()) {
                    rect.right = rect2.right;
                }
                rect.bottom += rect2.height();
            }
            rectArr[i2] = rect2;
            i2++;
        }
        textPaint.setStyle(Paint.Style.FILL);
        if (TextUtils.isEmpty(this.f16173L) || !TextUtils.isEmpty(logoTextSaveEntity.m1744r())) {
            int m813c = logoTextSaveEntity.m813c();
            int m814b = logoTextSaveEntity.m814b();
            logoTextSaveEntity.m804l(rect.right - rect.left, rect.bottom - rect.top);
            if (m813c != 0 && logoTextSaveEntity.m813c() != 0) {
                int m813c2 = logoTextSaveEntity.m813c() - m813c;
                int m814b2 = logoTextSaveEntity.m814b() - m814b;
                logoTextSaveEntity.m803m(logoTextSaveEntity.m812d() - (m813c2 * 0.5f));
                logoTextSaveEntity.m802n(logoTextSaveEntity.m811e() - (m814b2 * 0.5f));
            } else {
                logoTextSaveEntity.m803m((this.f16196e - logoTextSaveEntity.m813c()) * 0.5f);
                logoTextSaveEntity.m802n((this.f16198f - logoTextSaveEntity.m814b()) * 0.5f);
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds("a", 0, 1, rect3);
        rect3.left = 0;
        rect3.right = IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED;
        if (logoTextSaveEntity.m812d() < rect3.width() - logoTextSaveEntity.m813c()) {
            logoTextSaveEntity.m803m(rect3.width() - logoTextSaveEntity.m813c());
        } else if (logoTextSaveEntity.m812d() > this.f16196e - rect3.width()) {
            logoTextSaveEntity.m803m(this.f16196e - rect3.width());
        }
        if (logoTextSaveEntity.m811e() < (rect3.height() - logoTextSaveEntity.m814b()) + Math.abs(rect3.top)) {
            logoTextSaveEntity.m802n((rect3.height() - logoTextSaveEntity.m814b()) + Math.abs(rect3.top));
        } else if (logoTextSaveEntity.m811e() > (this.f16198f - rect3.height()) - Math.abs(rect3.top)) {
            logoTextSaveEntity.m802n((this.f16198f - rect3.height()) - Math.abs(rect3.top));
        }
        textPaint.getFontMetrics();
        float m811e = logoTextSaveEntity.m811e();
        for (int i3 = 0; i3 < split.length; i3++) {
            canvas.drawText(split[i3], logoTextSaveEntity.m812d(), Math.abs(rectArr[i3].top) + m811e, textPaint);
            m811e += rectArr[i3].height();
        }
        this.f16188a.get(this.f16192c).m170l().set(i, logoTextSaveEntity);
        if (i == this.f16194d) {
            new Rect(Math.round(rect.left - 31.0f), Math.round(rect.top - 31.0f), Math.round(rect.right + 31.0f), Math.round(rect.bottom + 31.0f));
        }
    }

    /* renamed from: s */
    public boolean m9086s() {
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list != null && list.size() != 0) {
            if (this.f16192c > 0) {
                return true;
            }
            int i = this.f16176M0;
            if (i > 6) {
                this.f16176M0 = i + 1;
                this.f16174L0 = !this.f16174L0;
            }
        }
        return false;
    }

    public void setActionIndex(int i) {
        int i2;
        List<LogoBaseSaveEntity> m170l;
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list != null && (i2 = this.f16192c) >= 0 && i2 < list.size() && (m170l = this.f16188a.get(this.f16192c).m170l()) != null && m170l.size() > 0) {
            int i3 = -1;
            for (int size = m170l.size() - 1; size >= 0; size--) {
                LogoBaseSaveEntity logoBaseSaveEntity = m170l.get(size);
                if (!logoBaseSaveEntity.m810f() && (i3 = i3 + 1) == i) {
                    if (logoBaseSaveEntity.m808h() || logoBaseSaveEntity.m809g()) {
                        return;
                    }
                    this.f16194d = size;
                    InterfaceC9666e interfaceC9666e = this.f16175M;
                    if (interfaceC9666e != null) {
                        interfaceC9666e.mo9075a(size, logoBaseSaveEntity);
                    }
                    invalidate();
                    return;
                }
            }
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setBold(boolean z) {
        if (this.f16194d != -1) {
            m9092m();
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoTextSaveEntity.m1739w(z);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoTextSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = !z2;
        }
    }

    public void setCanvasBackgroundColor(Integer num) {
        if (this.f16188a == null) {
            ArrayList arrayList = new ArrayList();
            this.f16188a = arrayList;
            arrayList.add(new LogoDesignSaveEntity());
        }
        this.f16188a.get(this.f16192c).m167o(null);
        this.f16188a.get(this.f16192c).m168n(num);
        invalidate();
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setCanvasBackgroundImage(Bitmap bitmap) {
        if (this.f16188a == null) {
            ArrayList arrayList = new ArrayList();
            this.f16188a = arrayList;
            arrayList.add(new LogoDesignSaveEntity());
        }
        this.f16188a.get(this.f16192c).m168n(null);
        if (bitmap != null) {
            bitmap.getWidth();
            bitmap.getHeight();
        }
        if (bitmap != null) {
            Throwable th = new Throwable();
            LogoLogUtils.m22166d("LogoDrawView", th, "画布：w=" + this.f16196e);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width != height) {
                Rect rect = new Rect();
                if (width > height) {
                    rect.top = 0;
                    rect.bottom = height;
                    int round = Math.round((width - height) * 0.5f);
                    rect.left = round;
                    rect.right = round + height;
                } else {
                    rect.left = 0;
                    rect.right = width;
                    int round2 = Math.round((height - width) * 0.5f);
                    rect.top = round2;
                    rect.bottom = round2 + width;
                }
                this.f16188a.get(this.f16192c).m157y(rect);
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(this.f16196e, this.f16198f, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, this.f16196e, this.f16198f), new Paint());
                canvas.save();
                bitmap.recycle();
                bitmap = createBitmap;
            }
        }
        this.f16188a.get(this.f16192c).m167o(bitmap);
        invalidate();
    }

    public void setClippingRadius(int i) {
        List<LogoDesignSaveEntity> list;
        if (this.f16192c > -1 && (list = this.f16188a) != null && list.size() > 0) {
            LogoDesignSaveEntity logoDesignSaveEntity = this.f16188a.get(this.f16192c);
            logoDesignSaveEntity.m165q(i);
            this.f16188a.set(this.f16192c, logoDesignSaveEntity);
        }
        invalidate();
        int i2 = this.f16176M0;
        if (i2 > 708) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
    }

    public void setClippingState(boolean z) {
        this.f16215n0 = z;
        invalidate();
        int i = this.f16176M0;
        if (i > 59) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
    }

    public void setClippingType(Integer num) {
        List<LogoDesignSaveEntity> list;
        if (this.f16188a == null) {
            ArrayList arrayList = new ArrayList();
            this.f16188a = arrayList;
            arrayList.add(new LogoDesignSaveEntity());
        }
        int i = this.f16176M0;
        if (i > 71) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (this.f16192c <= -1 || (list = this.f16188a) == null || list.size() <= 0) {
            return;
        }
        LogoDesignSaveEntity logoDesignSaveEntity = this.f16188a.get(this.f16192c);
        logoDesignSaveEntity.m164r(num);
        int i2 = this.f16176M0;
        if (i2 > 78) {
            this.f16176M0 = i2 + 1;
            this.f16174L0 = !this.f16174L0;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1 && intValue != 2) {
                if (intValue == 3) {
                    logoDesignSaveEntity.m165q(100.0f);
                } else if (intValue == 4) {
                    logoDesignSaveEntity.m162t(this.f16196e * 0.5f);
                    logoDesignSaveEntity.m160v(this.f16198f * 0.5f);
                    logoDesignSaveEntity.m165q(Math.round(this.f16196e * 0.8f * 0.5f));
                }
            }
            int round = Math.round(this.f16196e * 0.8f);
            float f = (this.f16196e - round) * 0.5f;
            logoDesignSaveEntity.m161u(f, f, round, round);
        }
        this.f16188a.set(this.f16192c, logoDesignSaveEntity);
        invalidate();
    }

    public void setEditBackgound(boolean z) {
        this.f16152A0 = z;
        int i = this.f16176M0;
        if (i > 1478) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
    }

    public void setFillColor(Integer num) {
        if (this.f16194d != -1) {
            LogoBaseSaveEntity logoBaseSaveEntity = this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            if (logoBaseSaveEntity instanceof LogoImageSaveEntity) {
                LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) logoBaseSaveEntity;
                logoImageSaveEntity.m25y(num);
                this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoImageSaveEntity);
                invalidate();
            }
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f16236y = map;
        int i = this.f16176M0;
        if (i > 0) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
    }

    public void setFontType(String str) {
        if (this.f16194d != -1) {
            m9092m();
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoTextSaveEntity.m1737y(str);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoTextSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setHide(boolean z) {
        if (this.f16194d != -1) {
            this.f16188a.get(this.f16192c).m170l().get(this.f16194d).m806j(z);
            invalidate();
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = !z2;
        }
    }

    public void setListData(List<LogoDesignSaveEntity> list) {
        this.f16188a = list;
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setLock(boolean z) {
        if (this.f16194d != -1) {
            this.f16188a.get(this.f16192c).m170l().get(this.f16194d).m805k(z);
            invalidate();
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = !z2;
        }
    }

    public void setLogoDesignSaveEntity(LogoDesignSaveEntity logoDesignSaveEntity) {
        this.f16154B0 = true;
        ArrayList arrayList = new ArrayList();
        this.f16188a = arrayList;
        arrayList.add(logoDesignSaveEntity);
        invalidate();
    }

    public void setOnFinderColorChangeListener(InterfaceC9663b interfaceC9663b) {
        this.f16179O = interfaceC9663b;
    }

    public void setOnHideLayerListener(InterfaceC9664c interfaceC9664c) {
        this.f16180P = interfaceC9664c;
    }

    public void setOnHistoryChangeListener(InterfaceC9665d interfaceC9665d) {
        this.f16177N = interfaceC9665d;
    }

    public void setOnSelectChangeListener(InterfaceC9666e interfaceC9666e) {
        this.f16175M = interfaceC9666e;
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setOnTextFocusChangeListener(InterfaceC9667f interfaceC9667f) {
        this.f16193c0 = interfaceC9667f;
    }

    public void setOpacity(int i) {
        if (this.f16194d != -1) {
            LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoImageSaveEntity.m24z(i);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoImageSaveEntity);
            invalidate();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setSkew(boolean z) {
        if (this.f16194d != -1) {
            m9092m();
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoTextSaveEntity.m1736z(z);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoTextSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = !z2;
        }
    }

    public void setText(String str) {
        if (this.f16194d != -1) {
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            this.f16173L = logoTextSaveEntity.m1744r();
            logoTextSaveEntity.m1750A(str);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoTextSaveEntity);
            invalidate();
        }
    }

    public void setTextColor(Integer num) {
        if (this.f16194d != -1) {
            m9092m();
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            if (num == null) {
                num = -13421773;
            }
            logoTextSaveEntity.m1738x(num.intValue());
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoTextSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setTextSize(float f) {
        if (this.f16194d != -1) {
            m9092m();
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoTextSaveEntity.m1749B(f);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoTextSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z = this.f16174L0;
        if (z) {
            this.f16176M0++;
            this.f16174L0 = !z;
        }
    }

    public void setUnderline(boolean z) {
        if (this.f16194d != -1) {
            m9092m();
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) this.f16188a.get(this.f16192c).m170l().get(this.f16194d);
            logoTextSaveEntity.m1748C(z);
            this.f16188a.get(this.f16192c).m170l().set(this.f16194d, logoTextSaveEntity);
            invalidate();
            m9118H();
        }
        boolean z2 = this.f16174L0;
        if (z2) {
            this.f16176M0++;
            this.f16174L0 = !z2;
        }
    }

    /* renamed from: t */
    public boolean m9085t() {
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list != null && list.size() != 0) {
            if (this.f16192c < this.f16188a.size() - 1) {
                return true;
            }
            int i = this.f16176M0;
            if (i > 9) {
                this.f16176M0 = i + 1;
                this.f16174L0 = !this.f16174L0;
            }
        }
        return false;
    }

    /* renamed from: u */
    public void m9084u() {
        m9097h();
        this.f16181Q = false;
        invalidate();
        int i = this.f16176M0;
        if (i > 89) {
            this.f16176M0 = i + 1;
            this.f16174L0 = !this.f16174L0;
        }
    }

    /* renamed from: v */
    public void m9083v(float f) {
        this.f16164G0 = f;
        this.f16168I0 = BitmapFactory.decodeResource(getResources(), R.mipmap.business4);
        boolean z = this.f16174L0;
        if (z) {
            this.f16174L0 = !z;
        }
    }

    /* renamed from: w */
    public final void m9082w() {
        if (this.f16210l == null) {
            Paint paint = new Paint();
            this.f16210l = paint;
            paint.setAntiAlias(true);
            this.f16210l.setColor(-13421773);
            this.f16210l.setStrokeWidth(1.0f);
            this.f16210l.setStyle(Paint.Style.STROKE);
        }
        if (this.f16216o == null) {
            Paint paint2 = new Paint();
            this.f16216o = paint2;
            paint2.setAntiAlias(true);
            this.f16216o.setFilterBitmap(true);
            this.f16216o.setDither(true);
        }
        if (this.f16218p == null) {
            this.f16218p = BitmapFactory.decodeResource(getResources(), R.mipmap.vertically);
        }
        if (this.f16220q == null) {
            this.f16220q = BitmapFactory.decodeResource(getResources(), R.mipmap.sticker_delete);
        }
        if (this.f16222r == null) {
            this.f16222r = BitmapFactory.decodeResource(getResources(), R.mipmap.horizontal);
        }
        if (this.f16226t == null) {
            this.f16226t = BitmapFactory.decodeResource(getResources(), R.mipmap.centered);
        }
        if (this.f16228u == null) {
            this.f16228u = BitmapFactory.decodeResource(getResources(), R.mipmap.rotate);
        }
        if (this.f16224s == null) {
            this.f16224s = BitmapFactory.decodeResource(getResources(), R.mipmap.hcentered);
        }
        if (this.f16230v == null) {
            this.f16230v = BitmapFactory.decodeResource(getResources(), R.mipmap.zoom);
        }
        if (this.f16232w == null) {
            this.f16232w = BitmapFactory.decodeResource(getResources(), R.mipmap.revise);
        }
    }

    /* renamed from: x */
    public boolean m9081x() {
        List<LogoDesignSaveEntity> list = this.f16188a;
        if (list == null || list.size() <= 0) {
            return false;
        }
        LogoDesignSaveEntity logoDesignSaveEntity = this.f16188a.get(this.f16192c);
        if (logoDesignSaveEntity.m178d() == null && (logoDesignSaveEntity.m179c() == null || logoDesignSaveEntity.m179c().intValue() == 0)) {
            List<LogoBaseSaveEntity> m170l = logoDesignSaveEntity.m170l();
            if (m170l == null || m170l.size() <= 0) {
                return false;
            }
            for (LogoBaseSaveEntity logoBaseSaveEntity : m170l) {
                if (logoBaseSaveEntity.m810f() || logoBaseSaveEntity.m809g()) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public boolean m9080y() {
        return this.f16215n0;
    }

    /* renamed from: z */
    public boolean m9079z() {
        if (this.f16194d == -1 || !(this.f16188a.get(this.f16192c).m170l().get(this.f16194d) instanceof LogoTextSaveEntity)) {
            int i = this.f16176M0;
            if (i > 55) {
                this.f16176M0 = i + 1;
                this.f16174L0 = !this.f16174L0;
                return false;
            }
            return false;
        }
        return true;
    }

    public LogoDrawView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16192c = 0;
        this.f16194d = -1;
        this.f16200g = 4;
        this.f16202h = 54;
        this.f16204i = 116;
        this.f16206j = 232;
        this.f16208k = 31.0f;
        this.f16212m = -13421773;
        this.f16214n = 1;
        this.f16234x = 18;
        this.f16238z = "fonts/";
        this.f16151A = -1;
        this.f16181Q = false;
        this.f16183S = -1;
        this.f16184T = -1;
        this.f16191b0 = false;
        this.f16201g0 = -1;
        this.f16203h0 = -1;
        this.f16205i0 = -1;
        this.f16207j0 = -1;
        this.f16219p0 = 20;
        this.f16221q0 = 10;
        this.f16223r0 = 50;
        this.f16225s0 = 80;
        this.f16227t0 = 20;
        this.f16231v0 = ((50 * 2) - 20) + 80;
        this.f16233w0 = 4;
        this.f16235x0 = -1;
        this.f16166H0 = new PaintFlagsDrawFilter(0, 3);
        this.f16172K0 = 0.0f;
        this.f16174L0 = true;
        this.f16176M0 = 1;
        this.f16178N0 = new HandlerC9662a(Looper.getMainLooper());
        boolean z = this.f16174L0;
        if (z) {
            this.f16174L0 = !z;
        }
    }

    public LogoDrawView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16192c = 0;
        this.f16194d = -1;
        this.f16200g = 4;
        this.f16202h = 54;
        this.f16204i = 116;
        this.f16206j = 232;
        this.f16208k = 31.0f;
        this.f16212m = -13421773;
        this.f16214n = 1;
        this.f16234x = 18;
        this.f16238z = "fonts/";
        this.f16151A = -1;
        this.f16181Q = false;
        this.f16183S = -1;
        this.f16184T = -1;
        this.f16191b0 = false;
        this.f16201g0 = -1;
        this.f16203h0 = -1;
        this.f16205i0 = -1;
        this.f16207j0 = -1;
        this.f16219p0 = 20;
        this.f16221q0 = 10;
        this.f16223r0 = 50;
        this.f16225s0 = 80;
        this.f16227t0 = 20;
        this.f16231v0 = ((50 * 2) - 20) + 80;
        this.f16233w0 = 4;
        this.f16235x0 = -1;
        this.f16166H0 = new PaintFlagsDrawFilter(0, 3);
        this.f16172K0 = 0.0f;
        this.f16174L0 = true;
        this.f16176M0 = 1;
        this.f16178N0 = new HandlerC9662a(Looper.getMainLooper());
        boolean z = this.f16174L0;
        if (z) {
            this.f16174L0 = !z;
        }
    }
}
