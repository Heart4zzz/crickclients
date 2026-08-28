package rw.setting;

import KDFzREm.HR;
import KDFzREm.NFv;
import KDFzREm.NVp;
import com.google.gson.JsonObject;

public class C0020<T> implements NVp<HR<T>, C0020<T>.KDFzREm/HB> {
   public void m10000(C0020<T>.KDFzREm/HB var1, NFv var2) {
      var2.y(var1.f1000);
   }

   public C0020<T>.KDFzREm/HB m12000(NFv var1) {
      return new rw.core.C0098(this, var1.b());
   }

   public void m14000(C0020<T>.KDFzREm/HB var1, JsonObject var2) {
      var2.addProperty("registry", var1.f1000.N().toString());
   }

   public C0020<T>.KDFzREm/HB m16000(HR<T> var1) {
      return new rw.core.C0098(this, var1.y);
   }
}
