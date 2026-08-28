package rw.core;

import KDFzREm.NjL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C0859 {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;

   private static void m4000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public C0859(NjL var1) {
      this.m10000();
      ArrayList var6 = new ArrayList();
      this.f2000[f1000[0]] = var6;
      this.f2000[f1000[1]] = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         C0859 var2 = (C0859)var1;
         return Objects.equals(((NjL)this.f2000[f1000[2]]).method_5628(), ((NjL)var2.f2000[f1000[3]]).method_5628());
      } else {
         return f4000[0];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((NjL)this.f2000[f1000[4]]).method_5628());
   }

   private static void m8000() {
      short[] var128 = new short[7];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = (short)((1 | -1) >>> 31);
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   public NjL m14000() {
      return (NjL)this.f2000[f1000[6]];
   }

   public List<OlsOrqs> m18000() {
      return (List<OlsOrqs>)this.f2000[f1000[5]];
   }

   private static void m20000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }
}
