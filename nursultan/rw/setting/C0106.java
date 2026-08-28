package rw.setting;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NNBM;
import KDFzREm.NNNHZ;
import KDFzREm.NNNQR;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NNyJ;
import KDFzREm.NNzU;
import org.apache.logging.log4j.Logger;
import rw.api.Iface0605;
import rw.core.C0874;
import rw.core.C1189;
import rw.core.IlmtmIsl;

public class C0106 {
   private static String[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static NAN m4000(Object var0) {
      return (NAN)(switch (var0) {
         case null -> NAN.y(f2000[0]);
         case NAN var3 -> var3;
         default -> NAN.N(var0.toString());
      });
   }

   private C0106() {
      throw new UnsupportedOperationException(f1000[2]);
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      f2000 = new String[]{"null", "\r", "\\r", "\n", "\\n"};
      f1000 = new String[]{"[{}] [CHAT] {}", "[CHAT] {}", "This is a utility class and cannot be instantiated", "Nursultan message", "Nursultan message"};
   }

   public static void m32000(Object var0) {
      m52000((Iface0605)IlmtmIsl.f2000[0], m4000(var0));
   }

   private static void m34000() {
      f3000 = new Object[]{null, null, null};
   }

   public static void m40000(Iface0605 var0, Object var1) {
      m52000(var0, m4000(var1));
   }

   public static void m42000(Object var0) {
      m52000((Iface0605)C0874.f3000[0], m4000(var0));
   }

   private static void m44000(NNyJ var0) {
      String var1 = var0.y().getString().replaceAll(f2000[1], f2000[2]).replaceAll(f2000[3], f2000[4]);
      String var2 = (String)NNNHZ.N(var0.u(), NNNQR::B);
      if (var2 != null) {
         ((Logger)f3000[0]).info(f1000[0], var2, var1);
      } else {
         ((Logger)f3000[0]).info(f1000[1], var1);
      }
   }

   public static void m52000(Iface0605 var0, NAN var1) {
      C1189.m22000(() -> {
         NNag var2 = NAN.i().L().y(NAd.N).y(var0.m2000()).y(var1);
         NNyJ var3 = new NNyJ(((NNBM)((NNuU)f3000[1]).i[6]).R(), var2, null, (NNNQR)f3000[2]);
         m44000(var3);
         NNzU var4 = ((NNBM)((NNuU)f3000[1]).i[6]).i();
         var4.N(var3);
         var4.y(var3);
      });
   }
}
