package rw.setting;

import KDFzREm.NFv;
import KDFzREm.NNNvt;
import KDFzREm.NVp;
import com.google.gson.JsonObject;
import rw.core.C0504;

public class C0069<T> implements NVp<NNNvt<T>, C0069<T>.KDFzREm/NNNvw> {
   public void m10000(C0069<T>.KDFzREm/NNNvw var1, NFv var2) {
      var2.y(var1.f1000);
   }

   public C0069<T>.KDFzREm/NNNvw m12000(NFv var1) {
      return new C0504(this, var1.b());
   }

   public void m14000(C0069<T>.KDFzREm/NNNvw var1, JsonObject var2) {
      var2.addProperty("registry", var1.f1000.N().toString());
   }

   public C0069<T>.KDFzREm/NNNvw m16000(NNNvt<T> var1) {
      return new C0504(this, var1.N);
   }
}
