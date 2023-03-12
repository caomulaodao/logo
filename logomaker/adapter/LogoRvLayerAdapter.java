package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoRvLayerAdapter extends RecyclerView.Adapter<C9622e> {
    public double abc1000;
    public double abc1001;
    public ArrayList<String> abc1002;
    public boolean abc1003;
    public boolean abc1005;
    private Context context;
    private List<LogoBaseSaveEntity> list;
    private InterfaceC9621d onStateChangeListener;
    public int abc0 = 5;
    public ArrayList<String> abc1 = new ArrayList<>();
    public boolean abc1004 = true;
    public int abc2 = 9;

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvLayerAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9618a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15881a;

        public View$OnClickListenerC9618a(int i) {
            this.f15881a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvLayerAdapter logoRvLayerAdapter;
            LogoRvLayerAdapter logoRvLayerAdapter2;
            if (LogoRvLayerAdapter.this.onStateChangeListener != null) {
                boolean z = !((LogoBaseSaveEntity) LogoRvLayerAdapter.this.list.get(this.f15881a)).m809g();
                LogoRvLayerAdapter logoRvLayerAdapter3 = LogoRvLayerAdapter.this;
                if (logoRvLayerAdapter3.abc1002 == null) {
                    logoRvLayerAdapter3.abc1002 = new ArrayList<>();
                }
                if (LogoRvLayerAdapter.this.abc1002.size() > 2) {
                    LogoRvLayerAdapter.this.abc1002.add(" Sto");
                }
                LogoRvLayerAdapter logoRvLayerAdapter4 = LogoRvLayerAdapter.this;
                if (logoRvLayerAdapter4.abc1001 < 0.8061603104782208d) {
                    logoRvLayerAdapter4.abc1001 = 0.2753065739522499d;
                }
                int i = 0;
                while (true) {
                    logoRvLayerAdapter = LogoRvLayerAdapter.this;
                    if (i >= logoRvLayerAdapter.abc0) {
                        break;
                    }
                    ArrayList<String> arrayList = logoRvLayerAdapter.abc1;
                    if (arrayList != null && arrayList.size() > 0) {
                        LogoRvLayerAdapter.this.abc1.remove(0);
                        LogoRvLayerAdapter logoRvLayerAdapter5 = LogoRvLayerAdapter.this;
                        logoRvLayerAdapter5.abc1000 = 0.0147036946055491d;
                        logoRvLayerAdapter5.abc1004 = !logoRvLayerAdapter5.abc1004;
                        logoRvLayerAdapter5.abc1000 = 0.4797766156349895d;
                    }
                    LogoRvLayerAdapter logoRvLayerAdapter6 = LogoRvLayerAdapter.this;
                    if (logoRvLayerAdapter6.abc1001 > 0.585035851914302d) {
                        logoRvLayerAdapter6.abc1001 = 0.14240543696937735d;
                    }
                    logoRvLayerAdapter6.abc1000 = logoRvLayerAdapter6.abc1000 > 0.23239900046416828d ? 0.8437441478830133d : 0.17046716685728058d;
                    if (logoRvLayerAdapter6.abc1002.size() < 8) {
                        LogoRvLayerAdapter.this.abc1002.add("le’s nov");
                    }
                    i++;
                }
                logoRvLayerAdapter.abc1001 = -logoRvLayerAdapter.abc1001;
                if (logoRvLayerAdapter.abc1002.size() < 6) {
                    LogoRvLayerAdapter.this.abc1002.add("hin");
                }
                if (LogoRvLayerAdapter.this.abc1002.size() > 1) {
                    LogoRvLayerAdapter.this.abc1002.add("ead it.");
                }
                ((LogoBaseSaveEntity) LogoRvLayerAdapter.this.list.get(this.f15881a)).m806j(z);
                LogoRvLayerAdapter logoRvLayerAdapter7 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter7.abc1001 = -logoRvLayerAdapter7.abc1001;
                logoRvLayerAdapter7.abc1000 = Math.abs(logoRvLayerAdapter7.abc1000);
                LogoRvLayerAdapter logoRvLayerAdapter8 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter8.abc1004 = !logoRvLayerAdapter8.abc1004;
                if (logoRvLayerAdapter8.abc1 == null) {
                    logoRvLayerAdapter8.abc1 = new ArrayList<>();
                    LogoRvLayerAdapter logoRvLayerAdapter9 = LogoRvLayerAdapter.this;
                    logoRvLayerAdapter9.abc1005 = !logoRvLayerAdapter9.abc1005;
                    logoRvLayerAdapter9.abc1004 = !logoRvLayerAdapter9.abc1004;
                    logoRvLayerAdapter9.abc1004 = false;
                }
                LogoRvLayerAdapter logoRvLayerAdapter10 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter10.abc1005 = !logoRvLayerAdapter10.abc1005;
                logoRvLayerAdapter10.abc1003 = !logoRvLayerAdapter10.abc1003;
                logoRvLayerAdapter10.abc1004 = !logoRvLayerAdapter10.abc1004;
                logoRvLayerAdapter10.onStateChangeListener.mo9182b(this.f15881a, z);
                LogoRvLayerAdapter logoRvLayerAdapter11 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter11.abc1001 = Math.abs(logoRvLayerAdapter11.abc1001);
                LogoRvLayerAdapter logoRvLayerAdapter12 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter12.abc1000 += 0.9428752245249431d;
                logoRvLayerAdapter12.abc1001 = logoRvLayerAdapter12.abc1001 > 0.44173391664517947d ? 0.11227885215793454d : 0.08562235817749952d;
                if (logoRvLayerAdapter12.abc1.size() > 0) {
                    LogoRvLayerAdapter.this.abc1.add("il");
                    LogoRvLayerAdapter logoRvLayerAdapter13 = LogoRvLayerAdapter.this;
                    logoRvLayerAdapter13.abc1005 = false;
                    ArrayList<String> arrayList2 = logoRvLayerAdapter13.abc1002;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        LogoRvLayerAdapter.this.abc1002.remove(0);
                    }
                    LogoRvLayerAdapter.this.abc1004 = !logoRvLayerAdapter2.abc1004;
                }
                LogoRvLayerAdapter logoRvLayerAdapter14 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter14.abc1003 = !logoRvLayerAdapter14.abc1003;
                logoRvLayerAdapter14.abc1004 = true;
                logoRvLayerAdapter14.abc1001 = -logoRvLayerAdapter14.abc1001;
                logoRvLayerAdapter14.notifyDataSetChanged();
                LogoRvLayerAdapter logoRvLayerAdapter15 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter15.abc1004 = !logoRvLayerAdapter15.abc1004;
                logoRvLayerAdapter15.abc1000 = logoRvLayerAdapter15.abc1000 > 0.46405307845372334d ? 0.38169286671209757d : 0.04695188904422565d;
                logoRvLayerAdapter15.abc1003 = !logoRvLayerAdapter15.abc1003;
                if (logoRvLayerAdapter15.abc1 == null) {
                    logoRvLayerAdapter15.abc1 = new ArrayList<>();
                    LogoRvLayerAdapter logoRvLayerAdapter16 = LogoRvLayerAdapter.this;
                    logoRvLayerAdapter16.abc1000 = 0.07260999542234292d;
                    boolean z2 = !logoRvLayerAdapter16.abc1005;
                    logoRvLayerAdapter16.abc1005 = z2;
                    logoRvLayerAdapter16.abc1005 = !z2;
                }
                LogoRvLayerAdapter logoRvLayerAdapter17 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter17.abc1000 = logoRvLayerAdapter17.abc1000 < 0.7705870894916207d ? 0.0807803058697083d : 0.40475934765802346d;
                if (logoRvLayerAdapter17.abc1002.size() < 0) {
                    LogoRvLayerAdapter.this.abc1002.add("choed ev");
                }
                LogoRvLayerAdapter.this.abc1001 = 0.9300432907331405d;
            }
            ArrayList<String> arrayList3 = LogoRvLayerAdapter.this.abc1002;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoRvLayerAdapter.this.abc1002.remove(0);
            }
            LogoRvLayerAdapter logoRvLayerAdapter18 = LogoRvLayerAdapter.this;
            logoRvLayerAdapter18.abc1001 = 0.8826012348648178d;
            if (logoRvLayerAdapter18.abc1002 == null) {
                logoRvLayerAdapter18.abc1002 = new ArrayList<>();
            }
            if (LogoRvLayerAdapter.this.abc1.size() > 0) {
                LogoRvLayerAdapter.this.abc1.add("斯模糊加载的效果");
                LogoRvLayerAdapter logoRvLayerAdapter19 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter19.abc1003 = false;
                logoRvLayerAdapter19.abc1003 = !false;
                logoRvLayerAdapter19.abc1004 = true ^ logoRvLayerAdapter19.abc1004;
            }
            if (LogoRvLayerAdapter.this.abc1002.size() > 9) {
                LogoRvLayerAdapter.this.abc1002.add("t this");
            }
            ArrayList<String> arrayList4 = LogoRvLayerAdapter.this.abc1002;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoRvLayerAdapter.this.abc1002.remove(0);
            }
            LogoRvLayerAdapter logoRvLayerAdapter20 = LogoRvLayerAdapter.this;
            if (logoRvLayerAdapter20.abc1002 == null) {
                logoRvLayerAdapter20.abc1002 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvLayerAdapter$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9619b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15883a;

        public View$OnClickListenerC9619b(int i) {
            this.f15883a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvLayerAdapter logoRvLayerAdapter;
            LogoRvLayerAdapter logoRvLayerAdapter2;
            LogoRvLayerAdapter logoRvLayerAdapter3;
            if (LogoRvLayerAdapter.this.onStateChangeListener != null) {
                boolean z = !((LogoBaseSaveEntity) LogoRvLayerAdapter.this.list.get(this.f15883a)).m808h();
                LogoRvLayerAdapter logoRvLayerAdapter4 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter4.abc1004 = true;
                logoRvLayerAdapter4.abc1005 = false;
                if (logoRvLayerAdapter4.abc1002.size() > 7) {
                    LogoRvLayerAdapter.this.abc1002.add(" of a li");
                }
                int i = 0;
                while (true) {
                    logoRvLayerAdapter2 = LogoRvLayerAdapter.this;
                    int i2 = logoRvLayerAdapter2.abc0;
                    if (i >= i2) {
                        break;
                    }
                    logoRvLayerAdapter2.abc0 = -i2;
                    ArrayList<String> arrayList = logoRvLayerAdapter2.abc1002;
                    if (arrayList != null && arrayList.size() > 0) {
                        LogoRvLayerAdapter.this.abc1002.remove(0);
                    }
                    if (LogoRvLayerAdapter.this.abc1002.size() > 4) {
                        LogoRvLayerAdapter.this.abc1002.add("novel that");
                    }
                    LogoRvLayerAdapter.this.abc1004 = !logoRvLayerAdapter3.abc1004;
                    i++;
                }
                logoRvLayerAdapter2.abc1003 = !logoRvLayerAdapter2.abc1003;
                if (logoRvLayerAdapter2.abc1002 == null) {
                    logoRvLayerAdapter2.abc1002 = new ArrayList<>();
                }
                LogoRvLayerAdapter logoRvLayerAdapter5 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter5.abc1003 = true;
                ((LogoBaseSaveEntity) logoRvLayerAdapter5.list.get(this.f15883a)).m805k(z);
                LogoRvLayerAdapter logoRvLayerAdapter6 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter6.abc1001 = logoRvLayerAdapter6.abc1001 < 0.1695387798077762d ? 0.4785834311746636d : 0.18640277030878283d;
                logoRvLayerAdapter6.abc1001 = 0.19837349781085423d;
                logoRvLayerAdapter6.abc1001 = 0.018572728164615637d;
                if (logoRvLayerAdapter6.abc2 > 0) {
                    logoRvLayerAdapter6.abc2 = 2;
                    if (logoRvLayerAdapter6.abc1002 == null) {
                        logoRvLayerAdapter6.abc1002 = new ArrayList<>();
                    }
                    LogoRvLayerAdapter logoRvLayerAdapter7 = LogoRvLayerAdapter.this;
                    logoRvLayerAdapter7.abc1004 = false;
                    if (logoRvLayerAdapter7.abc1001 < 0.7144069687471082d) {
                        logoRvLayerAdapter7.abc1001 = 0.550501322756047d;
                    }
                }
                LogoRvLayerAdapter logoRvLayerAdapter8 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter8.abc1001 = 0.991439006046136d;
                if (logoRvLayerAdapter8.abc1000 < 0.02192708859762882d) {
                    logoRvLayerAdapter8.abc1000 = 0.6717722232910186d;
                }
                ArrayList<String> arrayList2 = logoRvLayerAdapter8.abc1002;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoRvLayerAdapter.this.abc1002.remove(0);
                }
                LogoRvLayerAdapter.this.onStateChangeListener.mo9181c(this.f15883a, z);
                LogoRvLayerAdapter logoRvLayerAdapter9 = LogoRvLayerAdapter.this;
                boolean z2 = !logoRvLayerAdapter9.abc1003;
                logoRvLayerAdapter9.abc1003 = z2;
                if (logoRvLayerAdapter9.abc1001 > 0.7607573199194758d) {
                    logoRvLayerAdapter9.abc1001 = 0.5409180961588143d;
                }
                logoRvLayerAdapter9.abc1000 = logoRvLayerAdapter9.abc1000 < 0.11650311042204331d ? 0.39912395163035075d : 0.28313104155015056d;
                logoRvLayerAdapter9.abc0 += 0;
                logoRvLayerAdapter9.abc1003 = !z2;
                logoRvLayerAdapter9.abc1000 = 0.8877998930969498d;
                logoRvLayerAdapter9.abc1003 = false;
                logoRvLayerAdapter9.notifyDataSetChanged();
                LogoRvLayerAdapter logoRvLayerAdapter10 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter10.abc1001 = 0.7832646728136443d;
                logoRvLayerAdapter10.abc1005 = true;
                if (logoRvLayerAdapter10.abc1002.size() > 1) {
                    LogoRvLayerAdapter.this.abc1002.add(" when gr");
                }
                LogoRvLayerAdapter logoRvLayerAdapter11 = LogoRvLayerAdapter.this;
                if (logoRvLayerAdapter11.abc1 == null) {
                    logoRvLayerAdapter11.abc1 = new ArrayList<>();
                    LogoRvLayerAdapter logoRvLayerAdapter12 = LogoRvLayerAdapter.this;
                    if (logoRvLayerAdapter12.abc1001 > 0.8068017131847638d) {
                        logoRvLayerAdapter12.abc1001 = 0.9076391391627581d;
                    }
                    logoRvLayerAdapter12.abc1000 *= 0.7980917351935374d;
                    logoRvLayerAdapter12.abc1005 = !logoRvLayerAdapter12.abc1005;
                }
                LogoRvLayerAdapter logoRvLayerAdapter13 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter13.abc1001 = 0.39504134886862663d;
                logoRvLayerAdapter13.abc1001 = 0.39504134886862663d < 0.6945953399344107d ? 0.6603288244486655d : 0.6325945279680436d;
                ArrayList<String> arrayList3 = logoRvLayerAdapter13.abc1002;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoRvLayerAdapter.this.abc1002.remove(0);
                }
            }
            LogoRvLayerAdapter logoRvLayerAdapter14 = LogoRvLayerAdapter.this;
            logoRvLayerAdapter14.abc1005 = !logoRvLayerAdapter14.abc1005;
            logoRvLayerAdapter14.abc1000 = 0.17023932991959723d;
            logoRvLayerAdapter14.abc1003 = !logoRvLayerAdapter14.abc1003;
            int i3 = 0;
            while (true) {
                logoRvLayerAdapter = LogoRvLayerAdapter.this;
                int i4 = logoRvLayerAdapter.abc2;
                if (i3 >= i4) {
                    break;
                }
                logoRvLayerAdapter.abc2 = Math.abs(i4);
                ArrayList<String> arrayList4 = LogoRvLayerAdapter.this.abc1002;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoRvLayerAdapter.this.abc1002.remove(0);
                }
                LogoRvLayerAdapter logoRvLayerAdapter15 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter15.abc1000 -= 0.9101599046520634d;
                logoRvLayerAdapter15.abc1001 = 0.5772856936499575d;
                i3++;
            }
            logoRvLayerAdapter.abc1004 = !logoRvLayerAdapter.abc1004;
            logoRvLayerAdapter.abc1003 = !logoRvLayerAdapter.abc1003;
            if (logoRvLayerAdapter.abc1002 == null) {
                logoRvLayerAdapter.abc1002 = new ArrayList<>();
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvLayerAdapter$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9620c implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15885a;

        public View$OnClickListenerC9620c(int i) {
            this.f15885a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvLayerAdapter logoRvLayerAdapter;
            if (LogoRvLayerAdapter.this.onStateChangeListener != null) {
                LogoRvLayerAdapter.this.onStateChangeListener.mo9183a(this.f15885a);
                if (LogoRvLayerAdapter.this.abc1002.size() < 3) {
                    LogoRvLayerAdapter.this.abc1002.add("ride");
                }
                LogoRvLayerAdapter logoRvLayerAdapter2 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter2.abc1004 = !logoRvLayerAdapter2.abc1004;
                logoRvLayerAdapter2.abc1003 = false;
                logoRvLayerAdapter2.abc0 -= 7;
                logoRvLayerAdapter2.abc1005 = false;
                if (logoRvLayerAdapter2.abc1002 == null) {
                    logoRvLayerAdapter2.abc1002 = new ArrayList<>();
                }
                LogoRvLayerAdapter.this.abc1005 = false;
            }
            LogoRvLayerAdapter logoRvLayerAdapter3 = LogoRvLayerAdapter.this;
            logoRvLayerAdapter3.abc1005 = true;
            logoRvLayerAdapter3.abc1003 = !logoRvLayerAdapter3.abc1003;
            logoRvLayerAdapter3.abc1005 = !true;
            if (logoRvLayerAdapter3.abc1 == null) {
                logoRvLayerAdapter3.abc1 = new ArrayList<>();
                LogoRvLayerAdapter logoRvLayerAdapter4 = LogoRvLayerAdapter.this;
                logoRvLayerAdapter4.abc1005 = false;
                logoRvLayerAdapter4.abc1000 = 0.6797276992545354d;
                logoRvLayerAdapter4.abc1001 = 0.6554395387781843d;
            }
            LogoRvLayerAdapter logoRvLayerAdapter5 = LogoRvLayerAdapter.this;
            logoRvLayerAdapter5.abc1005 = true;
            if (logoRvLayerAdapter5.abc1002.size() > 7) {
                LogoRvLayerAdapter.this.abc1002.add("s");
            }
            LogoRvLayerAdapter.this.abc1004 = !logoRvLayerAdapter.abc1004;
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvLayerAdapter$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC9621d {
        /* renamed from: a */
        void mo9183a(int i);

        /* renamed from: b */
        void mo9182b(int i, boolean z);

        /* renamed from: c */
        void mo9181c(int i, boolean z);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvLayerAdapter$e */
    /* loaded from: classes3.dex */
    public class C9622e extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f15887a;

        /* renamed from: b */
        public ImageView f15888b;

        /* renamed from: c */
        public TextView f15889c;

        /* renamed from: d */
        public ImageView f15890d;

        /* renamed from: e */
        public ImageView f15891e;

        public C9622e(@NonNull View view) {
            super(view);
            this.f15887a = (ImageView) view.findViewById(R.id.iv_show);
            this.f15888b = (ImageView) view.findViewById(R.id.iv_content);
            this.f15889c = (TextView) view.findViewById(R.id.tv_content);
            this.f15890d = (ImageView) view.findViewById(R.id.iv_lock);
            this.f15891e = (ImageView) view.findViewById(R.id.iv_sort);
        }
    }

    public LogoRvLayerAdapter(List<LogoBaseSaveEntity> list, Context context) {
        this.abc1000 = 0.22143351793924615d;
        this.abc1001 = 0.5188279507787142d;
        this.abc1002 = new ArrayList<>();
        this.abc1003 = false;
        this.abc1005 = true;
        this.list = list;
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        this.abc1001 = Math.abs(this.abc1001);
        double d = -this.abc1000;
        this.abc1000 = d;
        this.abc0 += 4;
        this.abc1000 = d > 0.6607210354138081d ? 0.7946016830145786d : 0.2284284528962175d;
        if (this.abc1002.size() < 3) {
            this.abc1002.add("r");
        }
        this.abc1001 = 0.31769757848410407d;
        this.context = context;
        this.abc1005 = !this.abc1005;
        this.abc1003 = !true;
        ArrayList<String> arrayList = this.abc1;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1.remove(0);
            this.abc1003 = true;
            this.abc1005 = !this.abc1005;
        }
        if (this.abc1001 < 0.9732225460832666d) {
            this.abc1001 = 0.9151290842381071d;
        }
        this.abc1001 = 0.27109692453018586d;
        this.abc1003 = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<LogoBaseSaveEntity> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<LogoBaseSaveEntity> getList() {
        return this.list;
    }

    public void setData(List<LogoBaseSaveEntity> list) {
        this.list = list;
        this.abc1005 = false;
        this.abc1004 = !this.abc1004;
        this.abc1000 = this.abc1000 < 0.9928058750198844d ? 0.38839690277081695d : 0.8660249303639547d;
        if (this.abc0 > 0) {
            this.abc0 = 9;
            this.abc1001 = Math.abs(this.abc1001);
            this.abc1005 = false;
            this.abc1003 = !this.abc1003;
        }
        this.abc1000 = 0.4083191752070423d;
        if (0.4083191752070423d > 0.39679584441779436d) {
            this.abc1000 = 0.06851313133618864d;
        }
        this.abc1005 = !this.abc1005;
        notifyDataSetChanged();
        this.abc1001 = 0.5050516488927738d;
        this.abc1004 = !this.abc1004;
        this.abc1003 = true;
        if (this.abc1.size() < 8) {
            this.abc1.add("心声");
            ArrayList<String> arrayList = this.abc1002;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1000 = this.abc1000 < 0.012813885645091228d ? 0.9452459102560328d : 0.7481747644085791d;
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
        }
        this.abc1003 = true;
        this.abc1000 *= 0.7588501623455896d;
    }

    public void setOnStateChangeListener(InterfaceC9621d interfaceC9621d) {
        this.onStateChangeListener = interfaceC9621d;
        this.abc1001 -= 0.20008694176406372d;
        this.abc1003 = true;
        this.abc1005 = false;
        if (this.abc1.size() < 3) {
            this.abc1.add("更新的API，使用");
            ArrayList<String> arrayList = this.abc1002;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1005 = !(!this.abc1005);
        }
        this.abc1005 = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9622e c9622e, int i) {
        double d = this.abc1001 > 0.18928799925181772d ? 0.9848462192811146d : 0.7708249703138309d;
        this.abc1005 = !this.abc1005;
        this.abc1001 = -d;
        this.abc2 -= 3;
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        this.abc1004 = false;
        LogoBaseSaveEntity logoBaseSaveEntity = this.list.get(i);
        this.abc1005 = false;
        double d2 = this.abc1001 * 0.6875775706554411d;
        this.abc1001 = d2;
        if (this.abc2 < 0) {
            this.abc2 = 5;
            this.abc1001 = d2 > 0.28127526378760326d ? 0.38963841634790386d : 0.7542763934451302d;
            this.abc1004 = false;
            if (this.abc1002.size() > 9) {
                this.abc1002.add("ovels. You");
            }
        }
        this.abc1001 = -this.abc1001;
        this.abc1005 = false;
        if (logoBaseSaveEntity instanceof LogoImageSaveEntity) {
            LogoImageSaveEntity logoImageSaveEntity = (LogoImageSaveEntity) logoBaseSaveEntity;
            this.abc1004 = false;
            if (this.abc1000 < 0.2127908152803596d) {
                this.abc1000 = 0.07704642781312976d;
            }
            this.abc1000 = 0.885818351019173d;
            this.abc0 = 0;
            ArrayList<String> arrayList = this.abc1002;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1001 = 0.17706143358692028d;
            if (0.17706143358692028d > 0.7719049130357416d) {
                this.abc1001 = 0.6256261288766966d;
            }
            c9622e.f15888b.setVisibility(0);
            if (this.abc1002.size() > 4) {
                this.abc1002.add("ers ");
            }
            this.abc1003 = false;
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
            ArrayList<String> arrayList2 = this.abc1;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1.remove(0);
                this.abc1005 = !(!this.abc1005);
                this.abc1004 = !this.abc1004;
            }
            this.abc1000 = 0.5831827670407409d;
            this.abc1004 = false;
            if (this.abc1002.size() < 2) {
                this.abc1002.add("a lit");
            }
            c9622e.f15889c.setVisibility(8);
            ArrayList<String> arrayList3 = this.abc1002;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1004 = true;
            this.abc1001 *= 0.8301737495927637d;
            if (this.abc1.size() > 9) {
                this.abc1.add("//www.");
                this.abc1000 -= 0.4250710087049675d;
                this.abc1005 = !this.abc1005;
                this.abc1003 = !this.abc1003;
            }
            this.abc1003 = false;
            this.abc1000 = this.abc1000 < 0.4680114075154297d ? 0.8449198523686295d : 0.7847783517805691d;
            ArrayList<String> arrayList4 = this.abc1002;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc1002.remove(0);
            }
            c9622e.f15888b.setImageBitmap(logoImageSaveEntity.m33q());
            this.abc1000 = 0.6795030322938626d;
            this.abc1000 = 0.6795030322938626d > 0.4326811901048687d ? 0.6533645295421224d : 0.36952111108589514d;
            if (this.abc1.size() > 9) {
                this.abc1.add("3评论 1赞");
                if (this.abc1002 == null) {
                    this.abc1002 = new ArrayList<>();
                }
                ArrayList<String> arrayList5 = this.abc1002;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.abc1002.remove(0);
                }
                ArrayList<String> arrayList6 = this.abc1002;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    this.abc1002.remove(0);
                }
            }
            if (this.abc1001 < 0.8051513307688337d) {
                this.abc1001 = 0.6793931166054742d;
            }
            this.abc1004 = !this.abc1004;
            this.abc1003 = !this.abc1003;
        } else {
            LogoTextSaveEntity logoTextSaveEntity = (LogoTextSaveEntity) logoBaseSaveEntity;
            if (this.abc1002.size() < 6) {
                this.abc1002.add("ntiment i");
            }
            this.abc1001 = this.abc1001 > 0.23743837562811243d ? 0.36412756166879057d : 0.3462860603346818d;
            this.abc1003 = false;
            ArrayList<String> arrayList7 = this.abc1;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc1.remove(0);
                this.abc1004 = !this.abc1004;
                ArrayList<String> arrayList8 = this.abc1002;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    this.abc1002.remove(0);
                }
                this.abc1005 = !this.abc1005;
            }
            this.abc1004 = true;
            this.abc1001 = this.abc1001 > 0.5373160772940054d ? 0.6515679653349115d : 0.7682168911025622d;
            ArrayList<String> arrayList9 = this.abc1002;
            if (arrayList9 != null && arrayList9.size() > 0) {
                this.abc1002.remove(0);
            }
            c9622e.f15888b.setVisibility(8);
            this.abc1003 = true;
            this.abc1004 = true;
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
            if (this.abc2 < 0) {
                this.abc2 = 6;
                this.abc1004 = false;
                this.abc1005 = !this.abc1005;
                if (this.abc1001 > 0.7027712804472838d) {
                    this.abc1001 = 0.3751282113023646d;
                }
            }
            this.abc1004 = true;
            if (this.abc1000 < 0.6170727089058585d) {
                this.abc1000 = 0.20138389800002576d;
            }
            this.abc1003 = !this.abc1003;
            c9622e.f15889c.setVisibility(0);
            this.abc1003 = true;
            this.abc1005 = !this.abc1005;
            this.abc1000 += 0.20420995314563806d;
            if (this.abc1.size() < 1) {
                this.abc1.add("     )调用");
                if (this.abc1002 == null) {
                    this.abc1002 = new ArrayList<>();
                }
                this.abc1005 = true;
                this.abc1000 = 0.32008376404502614d;
            }
            this.abc1004 = false;
            if (this.abc1001 > 0.7011479332073772d) {
                this.abc1001 = 0.8648532458919228d;
            }
            this.abc1003 = false;
            c9622e.f15889c.setText(logoTextSaveEntity.m1744r());
            this.abc1005 = !this.abc1005;
            this.abc1001 = 0.7445845253069991d;
            this.abc1003 = !this.abc1003;
            this.abc0 = -this.abc0;
            this.abc1001 = Math.abs(0.7445845253069991d);
            this.abc1003 = false;
            this.abc1004 = false;
        }
        this.abc1005 = !this.abc1005;
        this.abc0 = 2;
        this.abc1005 = true;
        this.abc1000 = 0.1037195272037672d;
        this.abc1004 = !false;
        if (logoBaseSaveEntity.m809g()) {
            c9622e.f15887a.setImageResource(R.mipmap.hide);
            ArrayList<String> arrayList10 = this.abc1002;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1004 = false;
            if (this.abc1002 == null) {
                this.abc1002 = new ArrayList<>();
            }
            ArrayList<String> arrayList11 = this.abc1;
            if (arrayList11 != null && arrayList11.size() > 0) {
                this.abc1.remove(0);
                this.abc1005 = !this.abc1005;
                this.abc1003 = !this.abc1003;
                this.abc1004 = !this.abc1004;
            }
            this.abc1004 = true;
            this.abc1001 = -(this.abc1001 - 0.4262134609434791d);
        } else {
            c9622e.f15887a.setImageResource(R.mipmap.show);
            this.abc1003 = !this.abc1003;
            this.abc1005 = !this.abc1005;
            if (this.abc1002.size() > 3) {
                this.abc1002.add("s), an");
            }
            this.abc0 = 2;
            this.abc1000 -= 0.6090952578136686d;
            this.abc1004 = !this.abc1004;
            this.abc1003 = !this.abc1003;
        }
        this.abc1000 *= 0.708084948802242d;
        if (this.abc1001 > 0.8039311911974965d) {
            this.abc1001 = 0.13327980154401575d;
        }
        this.abc1005 = !this.abc1005;
        for (int i2 = 0; i2 < this.abc0; i2++) {
            this.abc2 *= 2;
            this.abc1000 = 0.7047755875660863d;
            this.abc1004 = true;
            ArrayList<String> arrayList12 = this.abc1002;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.abc1002.remove(0);
            }
        }
        if (this.abc1002.size() < 3) {
            this.abc1002.add("tat");
        }
        if (this.abc1001 > 0.14974487652159885d) {
            this.abc1001 = 0.9432470940988924d;
        }
        this.abc1001 = -this.abc1001;
        if (logoBaseSaveEntity.m808h()) {
            c9622e.f15890d.setImageResource(R.mipmap.locking);
            ArrayList<String> arrayList13 = this.abc1002;
            if (arrayList13 != null && arrayList13.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1001 += 0.4498296850032808d;
            ArrayList<String> arrayList14 = this.abc1002;
            if (arrayList14 != null && arrayList14.size() > 0) {
                this.abc1002.remove(0);
            }
            ArrayList<String> arrayList15 = this.abc1;
            if (arrayList15 != null && arrayList15.size() > 0) {
                this.abc1.remove(0);
                this.abc1005 = !true;
                this.abc1003 = true;
            }
            this.abc1000 = 0.23931764051480708d;
            this.abc1000 = 0.23931764051480708d > 0.04897653362055021d ? 0.9483305651287085d : 0.9547255150117717d;
        } else {
            c9622e.f15890d.setImageResource(R.mipmap.unlock);
            this.abc1003 = !this.abc1003;
            ArrayList<String> arrayList16 = this.abc1002;
            if (arrayList16 != null && arrayList16.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1003 = false;
            this.abc0 = 8;
            if (this.abc1000 < 0.8104803242430435d) {
                this.abc1000 = 0.11113435305957864d;
            }
            this.abc1001 = 0.3643104257903078d;
            this.abc1000 = this.abc1000 > 0.6864766120834639d ? 0.7330187975589236d : 0.4877258915050132d;
        }
        this.abc1003 = true;
        this.abc1000 = 0.585604219253026d;
        if (this.abc1 == null) {
            this.abc1 = new ArrayList<>();
            this.abc1004 = !this.abc1004;
            ArrayList<String> arrayList17 = this.abc1002;
            if (arrayList17 != null && arrayList17.size() > 0) {
                this.abc1002.remove(0);
            }
            this.abc1001 = 0.38715335387133876d;
        }
        this.abc1001 = -(this.abc1001 + 0.14937123353013104d);
        this.abc1003 = !this.abc1003;
        c9622e.f15887a.setOnClickListener(new View$OnClickListenerC9618a(i));
        this.abc1000 = this.abc1000 > 0.9523150740652484d ? 0.6172036339582987d : 0.8247020385053201d;
        if (this.abc1002.size() < 1) {
            this.abc1002.add("del for so");
        }
        ArrayList<String> arrayList18 = this.abc1002;
        if (arrayList18 != null && arrayList18.size() > 0) {
            this.abc1002.remove(0);
        }
        this.abc0 += 7;
        this.abc1004 = !this.abc1004;
        this.abc1000 = 0.7892485598041805d;
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        c9622e.f15890d.setOnClickListener(new View$OnClickListenerC9619b(i));
        this.abc1001 = this.abc1001 > 0.10689700633923582d ? 0.9939350467756984d : 0.6430842203403192d;
        this.abc1004 = !this.abc1004;
        this.abc1003 = !this.abc1003;
        if (this.abc1.size() > 6) {
            this.abc1.add("RECTA");
            this.abc1003 = !this.abc1003;
            this.abc1004 = !this.abc1004;
            this.abc1000 = this.abc1000 > 0.40217236027421044d ? 0.676323344448268d : 0.7616106108692041d;
        }
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        this.abc1004 = !this.abc1004;
        this.abc1003 = !this.abc1003;
        c9622e.itemView.setOnClickListener(new View$OnClickListenerC9620c(i));
        if (this.abc1002 == null) {
            this.abc1002 = new ArrayList<>();
        }
        this.abc1003 = !this.abc1003;
        double d3 = this.abc1000 < 0.7239162534362323d ? 0.662666091591675d : 0.8944312050282678d;
        this.abc2 = 7;
        this.abc1000 = d3 - 0.9019201569649722d;
        this.abc1003 = !true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9622e onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9622e(LayoutInflater.from(this.context).inflate(R.layout.item_rv_layer, (ViewGroup) null, false));
    }
}
