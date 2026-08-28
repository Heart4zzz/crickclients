package rw.setting;

import KDFzREm.NFv;
import KDFzREm.NNNvJ;
import KDFzREm.NVp;
import com.google.gson.JsonObject;
import rw.core.C0503;

public class C0070<T> implements NVp<NNNvJ<T>, C0070<T>.KDFzREm/NNNvq> {
   public void m10000(C0070<T>.KDFzREm/NNNvq var1, NFv var2) {
      var2.y(var1.f1000);
   }

   public C0070<T>.KDFzREm/NNNvq m12000(NFv var1) {
      return new C0503(this, var1.b());
   }

   public void m14000(C0070<T>.KDFzREm/NNNvq var1, JsonObject var2) {
      var2.addProperty("registry", var1.f1000.N().toString());
   }

   public C0070<T>.KDFzREm/NNNvq m16000(NNNvJ<T> var1) {
      return new C0503(this, var1.N);
   }
}
