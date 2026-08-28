package rw.setting;

import KDFzREm.NFv;
import KDFzREm.NNNgo;
import KDFzREm.NVp;
import com.google.gson.JsonObject;
import rw.core.C0473;

public class C0068<T> implements NVp<NNNgo<T>, C0068<T>.KDFzREm/NNNgK> {
   public void m10000(C0068<T>.KDFzREm/NNNgK var1, NFv var2) {
      var2.y(var1.f1000);
   }

   public C0068<T>.KDFzREm/NNNgK m12000(NFv var1) {
      return new C0473(this, var1.b());
   }

   public void m14000(C0068<T>.KDFzREm/NNNgK var1, JsonObject var2) {
      var2.addProperty("registry", var1.f1000.N().toString());
   }

   public C0068<T>.KDFzREm/NNNgK m16000(NNNgo<T> var1) {
      return new C0473(this, var1.N);
   }
}
