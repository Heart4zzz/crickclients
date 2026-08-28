package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NbK;
import KDFzREm.Nbp;
import KDFzREm.Nbr;
import KDFzREm.Nla;
import java.util.function.Predicate;
import rw.NursultanClient;
import rw.api.Iface0643;
import rw.gui.NoFriendDamage;

public class C1140 {
   private static String[] f1000;

   public static Predicate<NbK> m4000() {
      return var0 -> (boolean)(var0 instanceof Nbr && !m26000().test(var0) ? 1 : 0);
   }

   public static Predicate<NbK> m6000() {
      return var0 -> (boolean)(var0.method_5864() == Nbp.Nt ? 1 : 0);
   }

   private C1140() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   public static Predicate<NbK> m12000() {
      return var0 -> (boolean)(var0.method_5864() == Nbp.Ly ? 1 : 0);
   }

   public static Predicate<NbK> m16000() {
      return var0 -> ((Iface0643)var0).dataManager().m6000().m10000();
   }

   public static Predicate<NbK> m20000() {
      return var0 -> var0 instanceof Nbr;
   }

   private static void m22000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static Predicate<NbK> m26000() {
      return var0 -> var0 instanceof Nla;
   }

   public static Predicate<NbK> m28000() {
      return var0 -> ((Iface0643)var0).dataManager().m8000().m10000();
   }

   public static Predicate<NbK> m32000() {
      return var0 -> {
         NoFriendDamage var1 = NursultanClient.m88000().m212000();
         if (!var1.U()) {
            return (boolean)0;
         } else {
            return (boolean)(!m42000().test(var0) && !m28000().test(var0) && !var1.m4000(var0) ? 0 : 1);
         }
      };
   }

   public static Predicate<NbK> m36000() {
      return var0 -> var0 instanceof NNNwS;
   }

   public static Predicate<NbK> m42000() {
      return var0 -> ((Iface0643)var0).dataManager().m10000().m10000();
   }

   public static Predicate<NbK> m50000() {
      return NbK::method_5805;
   }

   public static Predicate<NbK> m56000() {
      return var0 -> (boolean)(var0.method_5864() == Nbp.ye ? 1 : 0);
   }
}
