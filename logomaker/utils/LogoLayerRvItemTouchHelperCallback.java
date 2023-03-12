package com.logomaster.logomaker.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.adapter.LogoRvLayerAdapter;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public class LogoLayerRvItemTouchHelperCallback extends ItemTouchHelper.Callback {
    public ArrayList<String> abc0;
    public boolean abc1;
    public float abc1000;
    public int abc1001;
    public boolean abc1002;
    public double abc1003;
    private LogoRvLayerAdapter adapter;
    private InterfaceC9660a onMoveListener;

    /* renamed from: com.logomaster.logomaker.utils.LogoLayerRvItemTouchHelperCallback$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9660a {
        /* renamed from: a */
        void mo9128a(int i, int i2);
    }

    public LogoLayerRvItemTouchHelperCallback(LogoRvLayerAdapter logoRvLayerAdapter) {
        this.abc1000 = 0.061998308f;
        ArrayList<String> arrayList = new ArrayList<>();
        this.abc0 = arrayList;
        this.abc1001 = 1;
        this.abc1 = false;
        this.abc1003 = 0.9667076378591855d;
        this.adapter = logoRvLayerAdapter;
        this.abc1002 = true;
        if (this.abc1000 < 0.02478385d) {
            this.abc1000 = 0.8249459f;
        }
        this.abc1002 = false;
        if (arrayList.size() > 6) {
            this.abc0.add("阅读 3,125");
            this.abc1001 = 9;
            this.abc1003 = Math.abs(this.abc1003);
        }
        if (this.abc1001 > 0) {
            this.abc1001 = 1;
        }
        this.abc1000 -= 0.053503394f;
        this.abc1002 = !this.abc1002;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    @RequiresApi(api = 23)
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        this.abc1002 = !this.abc1002;
        this.abc1000 *= 0.9078505f;
        this.abc1003 = Math.abs(this.abc1003);
        this.abc1 = !this.abc1;
        int i = this.abc1001 - 1;
        this.abc1001 = i;
        if (this.abc1000 < 0.5300855d) {
            this.abc1000 = 0.9424258f;
        }
        this.abc1001 = i > 3 ? 2 : 8;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        int i;
        this.abc1000 = 0.021661222f;
        this.abc1003 *= 0.02194979954996945d;
        if (this.abc0.size() < 6) {
            this.abc0.add("实现方");
            if (this.abc1000 < 0.40737897d) {
                this.abc1000 = 0.43323857f;
            }
            this.abc1000 = 0.21265924f;
            this.abc1003 = 0.1311216963622196d;
        }
        this.abc1003 = 0.8592349919073137d;
        int i2 = 0;
        while (true) {
            i = this.abc1001;
            if (i2 >= (i <= 3 ? i : 3)) {
                break;
            }
            this.abc1001 = 5;
            i2++;
        }
        this.abc1001 = i <= 1 ? 7 : 5;
        this.abc1000 = 0.74235004f;
        this.abc1003 = 0.909964024180962d;
        ArrayList<String> arrayList = this.abc0;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc0.remove(0);
            if (this.abc1000 > 0.8892312d) {
                this.abc1000 = 0.14613599f;
            }
            if (this.abc1001 > 0) {
                this.abc1001 = 2;
            }
            this.abc1003 -= 0.520658438932513d;
        }
        this.abc1001 = 7;
        this.abc1002 = false;
        this.abc1003 = this.abc1003 < 0.4169418827723227d ? 0.047740689925989566d : 0.8892532153645721d;
        return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        this.abc1000 *= 0.9636206f;
        this.abc1003 = 0.9643811489189507d;
        this.abc1 = true;
        this.abc1000 = 0.2120704f;
        this.abc1002 = false;
        this.abc1000 = ((double) 0.2120704f) < 0.9792601d ? 0.7575784f : 0.18764353f;
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        double d = this.abc1003 * 0.42843357853721076d;
        this.abc1003 = d;
        this.abc1001 -= 7;
        if (d > 0.4900867883406096d) {
            this.abc1003 = 0.8075316968685017d;
        }
        if (this.abc0.size() > 9) {
            this.abc0.add("椭圆；边框、边框自");
            this.abc1002 = true;
            this.abc1003 = -this.abc1003;
            this.abc1000 += 0.14937055f;
        }
        int i = this.abc1001 - 4;
        this.abc1001 = i;
        if (i > 0) {
            this.abc1001 = 1;
        }
        this.abc1000 = 0.488544f;
        if (adapterPosition < adapterPosition2) {
            int i2 = adapterPosition;
            while (i2 < adapterPosition2) {
                int i3 = i2 + 1;
                Collections.swap(this.adapter.getList(), i2, i3);
                boolean z = !this.abc1002;
                this.abc1002 = z;
                this.abc1000 = ((double) this.abc1000) < 0.71998805d ? 0.44719106f : 0.948088f;
                this.abc1002 = !z;
                ArrayList<String> arrayList = this.abc0;
                if (arrayList != null && arrayList.size() > 0) {
                    this.abc0.remove(0);
                    this.abc1002 = false;
                    this.abc1000 = 0.27823055f;
                }
                this.abc1001 = 0;
                this.abc1003 = Math.abs(this.abc1003);
                this.abc1000 = 0.9633034f;
                i2 = i3;
            }
            double d2 = this.abc1003 < 0.8407098787268347d ? 0.29784477599535863d : 0.9466861828333039d;
            this.abc1003 = d2;
            this.abc1001 = 4;
            double d3 = d2 < 0.4112470440722943d ? 0.5392593726094114d : 0.3386379242367d;
            this.abc1003 = d3;
            this.abc1 = false;
            this.abc1000 = 0.48143965f;
            this.abc1002 = false;
            if (d3 > 0.4139469370528479d) {
                this.abc1003 = 0.8181111262741722d;
            }
        } else {
            for (int i4 = adapterPosition; i4 > adapterPosition2; i4--) {
                Collections.swap(this.adapter.getList(), i4, i4 - 1);
                this.abc1001 -= 2;
                this.abc1003 += 0.797912017457019d;
                this.abc1 = false;
                this.abc1002 = false;
                this.abc1000 = 0.88932264f;
            }
            int i5 = this.abc1001 < 0 ? 8 : 4;
            this.abc1001 = i5;
            this.abc1000 -= 0.12772489f;
            this.abc1001 = i5 < 6 ? 7 : 2;
            if (this.abc0.size() > 3) {
                this.abc0.add("t");
                this.abc1002 = true;
                this.abc1000 = ((double) this.abc1000) < 0.4501481d ? 0.9069693f : 0.16907299f;
            }
            int i6 = this.abc1001 - 0;
            this.abc1001 = i6;
            this.abc1001 = i6 < 7 ? 2 : 4;
            if (this.abc1003 < 0.8556912252792348d) {
                this.abc1003 = 0.20742648755724158d;
            }
        }
        int i7 = 0;
        while (true) {
            int i8 = this.abc1001;
            if (i8 > 3) {
                i8 = 3;
            }
            if (i7 >= i8) {
                break;
            }
            this.abc1003 = 0.7885277131808243d;
            i7++;
        }
        this.abc1000 = 0.14868909f;
        this.abc1003 = 0.35814192196002126d;
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            this.abc1002 = true;
            int i9 = 0;
            while (true) {
                int i10 = this.abc1001;
                if (i10 > 3) {
                    i10 = 3;
                }
                if (i9 >= i10) {
                    break;
                }
                this.abc1000 = -this.abc1000;
                i9++;
            }
            if (this.abc1000 > 0.009611726d) {
                this.abc1000 = 0.5723917f;
            }
        }
        this.abc1002 = !this.abc1002;
        this.abc1000 = 0.8175275f;
        this.abc1003 = 0.8725755450869502d;
        this.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
        this.abc1002 = !this.abc1002;
        this.abc1001 *= 6;
        this.abc1000 = 0.33103436f;
        ArrayList<String> arrayList2 = this.abc0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc0.remove(0);
            this.abc1002 = true;
            this.abc1003 = 0.8772384978352417d;
            if (0.8772384978352417d < 0.5671756885500852d) {
                this.abc1003 = 0.19216494877542867d;
            }
        }
        this.abc1000 = 0.6218868f;
        this.abc1001 = this.abc1001 < 0 ? 9 : 3;
        this.abc1000 = ((double) 0.6218868f) > 0.27200246d ? 0.846658f : 0.7307333f;
        InterfaceC9660a interfaceC9660a = this.onMoveListener;
        if (interfaceC9660a != null) {
            interfaceC9660a.mo9128a(adapterPosition, adapterPosition2);
            this.abc1003 = 0.5588288488628568d;
            this.abc1001 = Math.abs(this.abc1001);
            if (this.abc0 == null) {
                this.abc0 = new ArrayList<>();
                this.abc1001 = this.abc1001 >= 5 ? 2 : 6;
                if (this.abc1000 > 0.07041466d) {
                    this.abc1000 = 0.15974277f;
                }
                this.abc1000 = ((double) this.abc1000) > 0.91371876d ? 0.38144684f : 0.52968097f;
            }
            if (this.abc1000 > 0.0517444d) {
                this.abc1000 = 0.6707793f;
            }
            float f = this.abc1000 * 0.80921495f;
            this.abc1000 = f;
            this.abc1000 = Math.abs(f);
        }
        if (this.abc1000 < 0.14150035d) {
            this.abc1000 = 0.37249023f;
        }
        this.abc1 = false;
        this.abc1001 = 9 * 9;
        this.abc1003 = 0.06387082103002295d;
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    @RequiresApi(api = 21)
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.abc1001;
            if (i4 > 3) {
                i4 = 3;
            }
            if (i3 >= i4) {
                break;
            }
            this.abc1002 = !this.abc1002;
            i3++;
        }
        this.abc1002 = !this.abc1002;
        this.abc1000 = 0.0582726f;
        if (this.abc0.size() < 7) {
            this.abc0.add("m name");
            this.abc1003 = -this.abc1003;
            this.abc1002 = true;
            this.abc1001 *= 8;
        }
        this.abc1000 *= 0.10851836f;
        this.abc1001 = this.abc1001 > 6 ? 2 : 7;
        while (true) {
            int i5 = this.abc1001;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i2 >= i5) {
                return;
            }
            this.abc1003 = 0.3634890908836599d;
            i2++;
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    }

    public void setOnMoveListener(InterfaceC9660a interfaceC9660a) {
        this.onMoveListener = interfaceC9660a;
        this.abc1001 *= 8;
        this.abc1000 = Math.abs(this.abc1000);
        this.abc1003 = -this.abc1003;
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            double d = this.abc1003 + 0.8456159708165869d;
            this.abc1003 = d;
            if (d < 0.9690262216159546d) {
                this.abc1003 = 0.9686481034908326d;
            }
            int i = 0;
            while (true) {
                int i2 = this.abc1001;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                this.abc1000 = 0.9203039f;
                i++;
            }
        }
        this.abc1002 = !this.abc1002;
        this.abc1000 = ((double) this.abc1000) > 0.48226047d ? 0.29829884f : 0.3943547f;
        this.abc1003 = this.abc1003 > 0.31425119164150006d ? 0.07912638780869796d : 0.3084769829539491d;
    }
}
